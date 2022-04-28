/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_COM_0005.js
*@FileTitle  : DaylightSavingTime
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/04
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/* 공통전역변수 */ 
var ipageNo=1 ;
var sheetObjects=new Array();
var sheetCnt=0;
var selectVal;
/* 업무별전역변수는 아래 부분에 추가 선언하여 사용한다. */
/* 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick=processButtonClick;
	/* 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */    
	function processButtonClick(){
		/***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
		var sheetObject=sheetObjects[0];
		 
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
			switch(srcName) {
            	case "btn_Retrieve":
            		doActionIBSheet(sheetObject,formObject,IBSEARCH);
            		break;
            	case "btn_New":
            		sheetObject.RemoveAll();
		            formObject.reset();
            		break;
            	case "btn_Close":
            		ComClosePopup(); 
            		break;
            	case "btn_OK":
            		comPopupOK();
            		break;
            	case "btn_loadExcel": 
					//160222 추가 cdh 기존 팝업 clear하고 load한다. load된 data는 저장한다. 
            		sheetObject.LoadExcel(); 
                    break;
            	case "btn_Excelsave":  
					//160222 추가 cdh 기존 팝업 clear하고 load한다. load된 data는 저장한다. 
            		// 신규로만 처리 , 처리하시겠습니까?
            		doActionIBSheet(sheetObject,formObject,COMMAND08);
            		
                    break;    

                    
            	case "btn_DownExcel":
            		if(sheetObj.RowCount() < 1){//no data
            			ComShowCodeMessage("COM132501");
            			}else{
 
            				for(var i = 1 ; i <= sheetObj.RowCount(); i++){
            					var OrgValue = sheetObj.GetCellValue(i, "delt_flg");
            					if(OrgValue=="Active")OrgValue = "N"
        						if(OrgValue=="Delete")OrgValue = "Y"
                    						
        							sheetObj.SetCellValue(i, "delt_flg", OrgValue);
            				}
            				
            				sheetObj.Down2Excel({ DownCols:"1|2|3|4|5|6|7|8|9|10|11|12|13|14|15", HiddenColumn:false,Merge:false,TreeLevel:false });
            				for(var i = 1 ; i <= sheetObj.RowCount(); i++){
            					var OrgValue = sheetObj.GetCellValue(i, "delt_flg");
            					if(OrgValue=="N")OrgValue = "Active"
        						if(OrgValue=="Y")OrgValue = "Delete"
                    						
        							sheetObj.SetCellValue(i, "delt_flg", OrgValue);
            				}
            			}
        	        break;
			} // end switch
		}catch(e) {            
			/*
        		자바 스크립트 에러가 발생할시 오동작이 납니다. 고객에게 이 경우 아래의 메세지가 뿌려지게 해야합니다.
        		물론 화면에서 다음의 메세지를 보시면 무조건 '자바스크립트 에러구나'라고 확인하실수 가 있습니다.
			 */
			if( e == "[object Error]") {
				ComShowMessage(OBJECT_ERROR);
			} else {
				ComShowMessage(e.message);
			}
		}
	}
	// exce load후 
	function sheet_OnLoadExcel(sheetObj, code, msg){
        $("#id_esave").css("display","inline-block");
 	}
    /**
     * IBSheet Object를 배열로 등록
     * comSheetObject(id)에서 호출한다
     * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
     * 배열은 소스 상단에 정의
     */
    function setSheetObject(sheet_obj){
        sheetObjects[sheetCnt++]=sheet_obj;
   
    }
    
    /**
     * Sheet 기본 설정 및 초기화 
     * body 태그의 onLoad 이벤트핸들러 구현
     * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
     */
    function loadPage() {
 
        for(i=0;i<sheetObjects.length;i++){
        	//khlee-시작 환경 설정 함수 이름 변경
            ComConfigSheet(sheetObjects[i]);
 
            initSheet(sheetObjects[i],i+1);
            //khlee-마지막 환경 설정 함수 추가
            ComEndConfigSheet(sheetObjects[i]);
           
        }
        doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
        initControl();
	}
     function initControl() {
     	var formObject=document.form;
         //Axon 이벤트 처리1. 이벤트catch(개발자변경)
         axon_event.addListenerFormat('keypress', 'keypressFormat', formObject);
         axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
     }
   //업무 자바스크립트 OnKeyPress 이벤트 처리
     function keypressFormat() {
     	obj=event.srcElement;
   	    if(obj.dataformat == null) return;
   	    window.defaultStatus=obj.dataformat;
   	    switch(ComGetEvent("name")) {
   	        case "dst_cnt_cd":
   	        	ComKeyOnlyAlphabet('upper');
   	        	break;
   	    }
     }
    /**
     * 시트 초기설정값, 헤더 정의
     * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
     * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
     */
    function initSheet(sheetObj,sheetNo) {
 	
        var cnt=0;
        //sheetObj.UseUtf8 = true;
        switch(sheetNo) {
            case 1:      //IBSheet1 init
                with(sheetObj){
		                
		              var mdmYN=document.form.mdm_yn.value;
		              var HeadTitle="||Seq.|DST Code|County|DST Year|DST Diff(Min)|DST Start Date|DST End Date|Not Applying State|ST_DST_HRMNT|END_DST_HRMNT|ST_DST_RULE_DESC|END_DST_RULE_DESC" ;
		              if(mdmYN.replace(/\s/g,"") != ""){
		              HeadTitle += "|Status";
		              }
		
		              SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:0 } );
		
		              var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
		              var headers = [ { Text:HeadTitle, Align:"Center"} ];
		              InitHeaders(headers, info);
		
		              var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
		                     {Type:"Radio",     Hidden:0, Width:20,   Align:"Center",  ColMerge:0,   SaveName:"radio",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                     {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"no",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"dst_id",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"dst_cnt_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"dst_yr",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"dst_mnts",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Date",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"st_dst_dt",   KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Date",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"end_dst_dt",  KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Text",      Hidden:0,  Width:0,   Align:"Center",  ColMerge:0,   SaveName:"dst_not_aply_ste_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Text",      Hidden:1,  Width:0,   Align:"Center",  ColMerge:0,   SaveName:"st_dst_hrmnt",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Text",      Hidden:1,  Width:0,   Align:"Center",  ColMerge:0,   SaveName:"end_dst_hrmnt",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 } ,
		                     {Type:"Text",      Hidden:1,  Width:0,   Align:"Center",  ColMerge:0,   SaveName:"st_dst_rule_desc",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Text",      Hidden:1,  Width:0,   Align:"Center",  ColMerge:0,   SaveName:"end_dst_rule_desc",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 } 
		                     
		                     ];
		                    if(mdmYN.replace(/\s/g,"") != ""){
		                    	cols.push({Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:"delt_flg",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
		              }
		         
		                    InitColumns(cols);
		
		                    SetEditable(1);
		                    SetCountFormat("[SELECTDATAROW / TOTALROWS]");
		                    SetSheetHeight(260);
		              }


                break;
                 
        }
    }
    /* Sheet관련 프로세스 처리 */
    function doActionIBSheet(sheetObj,formObj,sAction, a, PageNo) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
          case IBSEARCH:        //조회
                if(!validateForm(sheetObj,formObj,sAction)) {
                    return false;
                }
                formObj.f_cmd.value=SEARCH;     
                formObj.dst_cnt_cd.value=formObj.s_dst_cnt_cd.value;    
                formObj.dst_yr.value=formObj.s_dst_yr.value;
                
                selectVal=FormQueryString(formObj)
                iPageNo = 1;
                //sheetObj.DoSearch("COM_COM_0005GS.do", selectVal+"&iPage=" + iPageNo );
                
                sheetObj.RenderSheet(0);
				sheetObj.SetWaitImageVisible(1);
				var sXml=sheetObj.GetSearchData("COM_COM_0005GS.do", FormQueryString(formObj) + "&iPage=" + iPageNo );
				sheetObj.LoadSearchData(sXml, {Sync:0});
				sheetObj.SetWaitImageVisible(0);
	    		sheetObj.RenderSheet(1);
	    		
           break;
           case IBSEARCHAPPEND:  // 페이징 조회
                formObj.f_cmd.value=SEARCHLIST;  
                 sheetObj.DoSearch("COM_COM_0005GS.do", selectVal+"&iPage=" + iPageNo,{Append:true} );
           break;
           case COMMAND08: //cdh 추가 160222 excel load 멀티 저장 
        	   if(ComShowCodeConfirm("COM130101", "Data")){
	        	   formObj.f_cmd.value=MULTI01;
				     
				   var params = "f_cmd="+formObj.f_cmd.value;
				   params += "&" + ComSetPrifix(sheetObjects[0].GetSaveString(false) );
				   var sXml = sheetObj.GetSaveData("BCM_CCD_0024GS.do", params);
				   var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
				   if(result != "F"){
	                   ComShowCodeMessage("COM130102", "Data");
	                   doActionIBSheet(sheetObj, formObj, IBSEARCH);
	               }else{
	            	   showErrorMsg(sXml);
	               }
        	   }
		   break;
        }
    }
    var ipageNo=1;
    
    function sheet_OnVScroll(sheetObj, vpos, oldvpos, isTop, isBottom) {
        // TODO:sheet에 해당하는 객체와 폼 오브젝트를 doActionIBSheet 함수에 보내 주어야합니다.
    	 if (!isBottom || sheetObj.RowCount() >= sheetObj.GetTotalRows()) return;
    	 doActionIBSheet(sheetObj, document.form, IBSEARCHAPPEND, true, ++iPageNo);
    }  
    
   /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
            /*if(formObj.cnt_cd.value == "") {
              showErrMessage("You must input Country code");
              setFocus(formObj.cnt_cd);
              return false;
            }
            if(formObj.cnt_cd.value.length < 2) {
              showErrMessage("Country code must be 2 characters");
              setFocus(formObj.cnt_cd);
              return false;
            }
            if(formObj.cnt_cd.value == "US" && formObj.loc_state.value == "") {
              showErrMessage("You must input State");
              setFocus(formObj.loc_state);
              return false;
            }*/     
        }
        return true;
    }
