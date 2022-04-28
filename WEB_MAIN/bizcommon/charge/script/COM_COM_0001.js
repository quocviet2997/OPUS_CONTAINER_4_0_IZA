/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_COM_0001.js
*@FileTitle  : Charge
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
//html form
var frm=null;
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
		            iPageNo = 1;
            		break;
            	case "btn_Close":
            		ComClosePopup(); 
            		break;
            	case "btn_OK":
            		comPopupOK();
            		break;
            	case "btn2_Down_Excel":
            		if(sheetObj.RowCount() < 1){//no data
            			ComShowCodeMessage("COM132501");
            			}else{
            				sheetObject.Down2Excel({DownCols: makeHiddenSkipCol(sheetObject),Merge:false,TreeLevel:false}); 
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
            doActionIBSheet(sheetObjects[i],document.form,IBSEARCH);
    	 }    	 
    	 doActionIBSheet(sheetObjects[0],document.form,SEARCH01);
    	 initControl();
	}
     function initControl() {
     	var formObject=document.form;
         //Axon 이벤트 처리1. 이벤트catch(개발자변경)
//         axon_event.addListenerFormat('keypress', 'keypressFormat', formObject);
//         axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
     }
   //업무 자바스크립트 OnKeyPress 이벤트 처리
     function keypressFormat() {
     	obj=event.srcElement;
   	    if(obj.dataformat == null) return;
   	    window.defaultStatus=obj.dataformat;
   	    switch(ComGetEvent("name")) {
   	        case "chg_cd":
   	        	ComKeyOnlyAlphabet('upper');
   	        	break;
   	        case "chg_nm":
   	        	ComKeyOnlyAlphabet('upper','32');
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
        switch(sheetNo) {
            case 1:      //IBSheet1 init
                with(sheetObj){
		              var mdmYN=document.form.mdm_yn.value;
		              var HeadTitle="||Seq.|Code|Description|Rep. Charge" ;
		              if(mdmYN.replace(/\s/g,"") != ""){
		            	  HeadTitle += "|Status";
		              }
		              SetConfig( { SearchMode:2, MergeSheet:0, Page:50, DataRowMerge:0 } );
		              var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
		              var headers = [ { Text:HeadTitle, Align:"Center"} ];
		              InitHeaders(headers, info);
		              var cols = [ {Type:"Radio",     Hidden:0, Width:20,   Align:"Center",  ColMerge:0,   SaveName:"radio",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                     {Type:"CheckBox",  Hidden:0, Width:20,   Align:"Center",  ColMerge:0,   SaveName:"checkbox",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                     {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"no",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"chg_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Text",      Hidden:0,  Width:400,  Align:"Left",    ColMerge:0,   SaveName:"chg_full_nm",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"rep_chg_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 } ];
		              if(mdmYN.replace(/\s/g,"") != ""){
		            	  cols.push({Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:"delt_flg",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
		              }
		              InitColumns(cols);
		              SetEditable(1);
		              SetCountFormat("[SELECTDATAROW / TOTALROWS]");
		              SetSheetHeight(250);
              		}
                break;
        }
    }
    /* Sheet관련 프로세스 처리 */
    function doActionIBSheet(sheetObj,formObj,sAction, a, PageNo) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
          case SEARCH01:        //comboList
        		if(!validateForm(sheetObj,formObj,sAction)) {
        			return false;
        		}
        		formObj.f_cmd.value=SEARCH01;                
         		var sXml=sheetObj.GetSearchData("COM_COM_0001GS.do", FormQueryString(formObj));
        		var repChgCd=ComGetEtcData(sXml, "repChgCd").split("|");
        		var rep_chg_cd=formObj.rep_chg_cd;
        		rep_chg_cd.length=0;
        		for(var i=0 ; i < repChgCd.length ; i++ ) {			
        			ComAddComboItem(rep_chg_cd,repChgCd[i],repChgCd[i]);
        		}	
        		break;       
          case IBSEARCH:        //조회
                if(!validateForm(sheetObj,formObj,sAction)) {
                    return false;
                }
                iPageNo = 1;
                formObj.f_cmd.value=SEARCH;
                selectVal=FormQueryString(formObj);
                sheetObj.DoSearch("COM_COM_0001GS.do", selectVal );
                break;
           case IBSEARCHAPPEND:  // 페이징 조회
                formObj.f_cmd.value=SEARCH;
                selectVal=FormQueryString(formObj);
                sheetObj.DoSearch("COM_COM_0001GS.do", selectVal + "&" + "iPage=" + PageNo,{Append:true} );
                break;
        }
    }

     function sheet_OnVScroll(sheetObj, vpos, oldvpos, isTop, isBottom) {
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
