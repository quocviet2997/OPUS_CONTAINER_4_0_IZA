/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : ADM_SYS_0009.js
*@FileTitle  : ADM_SYS_0009
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
   	/* 개발자 작업	*/
    var sheetObjects=new Array();
    var sheetCnt=0;
	document.onclick=processButtonClick;
 // 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
    function processButtonClick(){
         /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
         var sheetObject1=sheetObjects[0];
         /*******************************************************/
         var formObject=document.form;
    	try {
    		var srcName = ComGetEvent("name");
            switch(srcName) {
				case "btn_Retrieve":
					doActionIBSheet(sheetObject1,formObject,IBSEARCH);
					break;
				case "btn_New":
					sheetObject1.RemoveAll();
					formObject.reset();
					for(var i=0;i<subSys.GetItemCount();i++){
				    	subSys.SetItemCheck(i,0);	// 제품 수정 문의 
				    }
					break;
				case "btng_rowadd":
		            doActionIBSheet(sheetObject1,formObject,IBINSERT);
	    	        break;
				case "btn_DownExcel":
            		doActionIBSheet(sheetObject1,formObject,IBDOWNEXCEL);
					break;
            	case "btn_Save":
            		doActionIBSheet(sheetObject1,formObject,IBSAVE);
            		break;
            	case "btn_ofc_cd":
					ComOpenPopupWithTarget('/opuscntr/COM_ENS_071.do?ofc_pts_cd=ALL', 700, 520, "ofc_cd:ofcCd", '0,0,1,1,1,1,1,1', true);
					break;
            } // end switch
    	}catch(e) {
    		if( e == "[object Error]") {
    			ComShowMessage(OBJECT_ERROR);
    		} else {
    			ComShowMessage(e);
    		}
    	}
    }
    /**
     * IBSheet Object를 배열로 등록
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
				ComConfigSheet (sheetObjects[i]);
				initSheet(sheetObjects[i],i+1,false);
	        //khlee-마지막 환경 설정 함수 추가
				ComEndConfigSheet(sheetObjects[i]);
			}
			initControl();
			var tmp=subSysCd.substring(1,subSysCd.length-1).split(", ");
			var tmpRhq=rhqCd.substring(1,rhqCd.length-1).split(", ");
			
			subSys.SetMultiSelect(1);
			subSys.SetMultiSeparator(",");
			subSys.SetDropHeight(140);
			for ( var i=0; i<tmp.length-1; i++) {
				subSys.InsertItem(i, tmp[i], tmp[i]);
			}
			
			rhq.SetMultiSeparator(",");
			rhq.SetDropHeight(140);
			for ( var i=0; i<tmpRhq.length; i++) {
				rhq.InsertItem(i, tmpRhq[i], tmpRhq[i]);
			}
		}
    function initControl() {
      	var formObject=document.form;
   	  	axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
      }
    function obj_deactivate(){
    	 ComChkObjValid(ComGetEvent());
   }
   function obj_activate(){
    	 ComClearSeparator(ComGetEvent());
   }
      //업무 자바스크립트 OnKeyPress 이벤트 처리
      function keypressFormat() {
      	obj=ComGetEvent();
    	    if(obj.dataformat == null) return;
    	    window.defaultStatus=obj.dataformat;
    	    switch(obj.name) {
	        case "pgm_no":
	        	ComKeyOnlyAlphabet('uppernum',"95");
	            break;
	        case "skd_id":
	        	ComKeyOnlyNumber(obj);
	            break;
		    case "dateFrom":
		        ComKeyOnlyNumber(obj, "-"); 
	            break;
		    case "dateTo":
		        ComKeyOnlyNumber(obj, "-"); 
	            break;
    	    }
      }
  /**
     * 시트 초기설정값, 헤더 정의
     * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
     * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
     */
    function initSheet(sheetObj,sheetNo,flag) {
        var cnt=0;
		var sheetID=sheetObj.id;
        switch(sheetID) {
        	case "sheet1":
	        with(sheetObj){
        	
        	var tmp=subSysCd.substring(1,subSysCd.length-1).split(", ");
		    var HeadTitle1="|Del|User ID|User Name(KOR)|User Name(ENG)|RHQ|Office|Tel|Mail|Module|Pgm ID|Pgm Name|Admin|Create Date";
		    var headCount=ComCountHeadTitle(HeadTitle1);
		
		    SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );
		
		    var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		    var headers = [ { Text:HeadTitle1, Align:"Center"} ];
		    InitHeaders(headers, info);
		
		    var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
			           {Type:"DelCheck",  Hidden:0, Width:45,   Align:"Center",  ColMerge:1,   SaveName:"DEL",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			           {Type:"Text",      Hidden:0, Width:60,   Align:"Center",  ColMerge:0,   SaveName:"usr_id",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			           {Type:"Text",      Hidden:0, Width:100,  Align:"Left",    ColMerge:0,   SaveName:"usr_locl_nm",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			           {Type:"Text",      Hidden:0, Width:150,  Align:"Left",    ColMerge:0,   SaveName:"usr_nm",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			           {Type:"Text",      Hidden:0, Width:55,   Align:"Center",  ColMerge:0,   SaveName:"rhq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			           {Type:"Text",      Hidden:0, Width:55,   Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			           {Type:"Text",      Hidden:0, Width:100,  Align:"Left",    ColMerge:0,   SaveName:"xtn_phn_no",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			           {Type:"Text",      Hidden:0, Width:180,  Align:"Center",  ColMerge:0,   SaveName:"usr_eml",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			           {Type:"Combo",     Hidden:0, Width:60,   Align:"Center",  ColMerge:0,   SaveName:"module",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1, ComboText:tmp.join("|"), ComboCode:tmp.join("|")},
			           {Type:"Text",      Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"pgm_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			           {Type:"Text",      Hidden:0, Width:150,  Align:"Left",    ColMerge:0,   SaveName:"pgm_nm",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			           {Type:"Combo",     Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"admin",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1, ComboText:"Yes|No", ComboCode:"Y|N" },
			           {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"cre_dt",       KeyField:0,   CalcLogic:"",   Format:"",        	PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
           
	    	InitColumns(cols);
			SetWaitImageVisible(0);
			resizeSheet();
          }


            break;
        }
    }
    
    function resizeSheet(){
   	         ComResizeSheet(sheetObjects[0]);
   }
  // Sheet관련 프로세스 처리
    function doActionIBSheet(sheetObj,formObj,sAction) {
        //sheetObj.ShowDebugMsg(false);
        switch(sAction) {
			case IBSEARCH:      //조회
				if(validateForm(sheetObj,formObj,sAction)) {
			        
			    	var summary=(formObj.opt[0].checked)?true:false;
					formObj.f_cmd.value=SEARCH;
					ComOpenWait(true);
 					sheetObj.DoSearch("ADM_SYS_0009GS.do", FormQueryString(formObj));
				}
				break;
			case IBDOWNEXCEL:		// Excel download
				if(sheetObj.RowCount() < 1){
					ComShowCodeMessage("COM132501");
				}else{
					sheetObj.Down2Excel({DownCols: makeHiddenSkipCol(sheetObj), SheetDesign:1, Merge:1});
				}
 				break;
			case IBINSERT:      // 입력
				for (var i=0;i<formObj.addrows.value;i++) sheetObj.DataInsert();
				break;
			case IBSAVE:        //저장
				if(!validateForm(sheetObj,formObj,sAction))return;
                //저장처리
            	formObj.f_cmd.value=MULTI;
                sheetObj.DoSave("ADM_SYS_0009GS.do", FormQueryString(formObj));
				break;
        }
    }
    function sheet1_OnChange(sheetObj,Row,Col) {
    	var formObject=document.form;
    	if(Col!=2) return;
		formObject.f_cmd.value=SEARCH05;
 		var sXml=sheetObj.GetSearchData("ADM_SYS_0003GS.do?usr_id="+sheetObj.GetCellValue(Row,Col), FormQueryString(formObject));
		if(ComGetEtcData(sXml,"total") != "0"){
			sheetObj.SetCellValue(Row, "usr_nm",ComGetEtcData(sXml,"usr_nm"),0);
			sheetObj.SetCellValue(Row, "rhq",ComGetEtcData(sXml,"rhq"),0);
			sheetObj.SetCellValue(Row, "ofc_cd",ComGetEtcData(sXml,"ofc_cd"),0);
			sheetObj.SetCellValue(Row, "usr_eml",ComGetEtcData(sXml,"usr_eml"),0);
			sheetObj.SetCellValue(Row, "usr_locl_nm",ComGetEtcData(sXml,"usr_locl_nm"),0);
			sheetObj.SetCellValue(Row, "xtn_phn_no",ComGetEtcData(sXml,"xtn_phn_no"),0);
		} else {
			alert('no user !');
		}
    }
    /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
            for(var i=1; i<sheetObj.rowCount+1; i++) {
            	//alert(sheetObj.CellValue(i,"usr_nm"));
            	if (sheetObj.GetCellValue(i,"usr_nm")=="") {
            		alert('input user id !');
            		return false;
            	}
            }
        }
        return true;
    }
    function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) { 
    	ComOpenWait(false);
    }
	/* 개발자 작업  끝 */
