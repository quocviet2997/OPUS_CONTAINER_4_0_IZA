/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : ADM_ACS_0002.js
*@FileTitle  : ADM_ACS_0002
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
    var timer;
    var sheetObjects=new Array();
    var sheetCnt=0;
	document.onclick=processButtonClick;
    function processButtonClick(){
        var sheetObject1=sheetObjects[0];
        var formObject=document.form;
    	try {
    		var srcName=ComGetEvent("name");
            switch(srcName) {
				case "btn_Retrieve":
					doActionIBSheet(sheetObject1,formObject,IBSEARCH);
					break;
				case "btn_New":
					sheetObject1.RemoveAll();
					formObject.reset();
				    form.dateFrom.value=ComGetDateAdd(ComGetDateAdd(null,"M",-3),"D",-1);
				    form.dateTo.value=ComGetDateAdd(null,"D",0);
					break;
				case "btn_DownExcel":
					if(sheetObject1.RowCount() < 1){
						ComShowCodeMessage("COM132501");
					}else{
						sheetObject1.Down2Excel({DownCols: makeHiddenSkipCol(sheetObject1), SheetDesign:1, Merge:1});
					}
					break;
				case "btn_ofc_cd":
					ComOpenPopupWithTarget('/opuscntr/COM_ENS_071.do?ofc_pts_cd=ALL', 700, 500, "ofc_cd:ofcCd", '0,0,1,1,1,1,1,1', true);
					break;
				case "btn_pgm_no":
					ComOpenPopup("/opuscntr/ESM_HJS_0101.do", 700, 500, "setPgmNo", "0,1,1");
					break;
				case "btns_calendar":
					popCal();
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
				ComConfigSheet (sheetObjects[i]);
				initSheet(sheetObjects[i],i+1);
				ComEndConfigSheet(sheetObjects[i]);
			}
			initControl();
			
			var tmpRhq=rhqOfcId.substring(1,rhqOfcId.length-1).split(", ");
			
			rhq.SetMultiSeparator(",");
			rhq.SetDropHeight(140);
			for ( var i=0; i<tmpRhq.length; i++) {
				rhq.InsertItem(i, tmpRhq[i], tmpRhq[i]);
			}
    }
    
   function initControl() {
     	var formObject=document.form;
          //Axon 이벤트 처리1. 이벤트catch(개발자변경)
          axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
   }
    
   function obj_deactivate(){
    	 ComChkObjValid(event.srcElement);
   }
   
   function obj_activate(){
    	 ComClearSeparator(event.srcElement);
   }
      //업무 자바스크립트 OnKeyPress 이벤트 처리
      function keypressFormat() {
      	obj=event.srcElement;
    	    if(obj.dataformat == null) return;
    	    window.defaultStatus=obj.dataformat;
    	    switch(obj.name) {
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
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
				var sheetID=sheetObj.id;
        switch(sheetID) {
            case "sheet1":
            	with(sheetObj){
	             var HeadTitle1="User ID|User Name|Use Flag|RHQ|Office|Last Login Date|Program No.|Program Name";
	             var headCount=ComCountHeadTitle(HeadTitle1);
	
	             SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );
	
	             var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	             var headers = [ { Text:HeadTitle1, Align:"Center"} ];
	             InitHeaders(headers, info);
	
	             var cols = [ {Type:"Text",      Hidden:0, Width:100,  Align:"Left",    ColMerge:1,   SaveName:"usr_id",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                 {Type:"Text",      Hidden:0, Width:120,  Align:"Left",    ColMerge:1,   SaveName:"usr_nm",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                 {Type:"Text",      Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:"use_flg",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                 {Type:"Text",      Hidden:0, Width:80,   Align:"Left",    ColMerge:1,   SaveName:"rhq",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                 {Type:"Text",      Hidden:0, Width:80,   Align:"Left",    ColMerge:1,   SaveName:"ofc_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                 {Type:"Text",      Hidden:0, Width:140,  Align:"Center",  ColMerge:1,   SaveName:"acss_tms",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                 {Type:"Text",      Hidden:0, Width:100,  Align:"Left",    ColMerge:1,   SaveName:"pgm_no",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                 {Type:"Text",      Hidden:0, Width:200,  Align:"Left",    ColMerge:1,   SaveName:"pgm_nm",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
	              
	             InitColumns(cols);
	             SetSheetHeight(400);
	             }
            break;
        }
    }
  // Sheet관련 프로세스 처리
    function doActionIBSheet(sheetObj,formObj,sAction) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
			case IBSEARCH:      //조회
				if(validateForm(sheetObj,formObj,sAction)) {
			    	ComOpenWait(true);
			        sheetObj.SetWaitImageVisible(0);
					formObj.f_cmd.value=SEARCH;
					var sXml=sheetObj.GetSearchData("ADM_ACS_0002GS.do", FormQueryString(formObj));
					var key="";
					if (sXml != "") key=ComGetEtcData(sXml,"key");
					timer=setInterval('checkLoginData('+key+');', '5000');
				}
				break;
        }
    }
    function checkLoginData(key) {
    	var formObj=document.form;
    	var sheetObj=sheetObjects[0];
		formObj.f_cmd.value=SEARCH01;
		var sXml=sheetObj.GetSearchData("ADM_ACS_0002GS.do?key="+key, FormQueryString(formObj));
		if (sXml != "") {
			if ( ComGetEtcData(sXml,"key") == key )
				document.all.btn_Retrieve.innerHTML='<font color=red>Searching</font>';
			else {
				sheetObj.LoadSearchData(sXml,{Sync:1} );
				clearInterval(timer);
				document.all.btn_Retrieve.innerHTML='Search';
			}
		}
    }
    /**
     * 팝업에서 Check로 멀티 선택을 한경우..
     */
    function setPgmNo(rowArray) {
    	var form=document.form;
    	form.pgmNo.value="";
    	var gubun=',';
    	for(var i=0; i<rowArray.length; i++)
    	{
    		if(i == rowArray.length-1) gubun='';
    		colArray=rowArray[i];
    		form.pgmNo.value += colArray[2] + gubun;
    	}
    }
    /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj,formObj,sAction){
        return true;
    }
    
    function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) { 
    	ComOpenWait(false);
    }
	/* 개발자 작업  끝 */
    
    
