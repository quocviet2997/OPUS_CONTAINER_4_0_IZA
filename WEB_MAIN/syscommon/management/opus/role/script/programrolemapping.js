/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : programrolemapping.js.js
*@FileTitle  : program role mapping
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/30
=========================================================*/
var sheetObjects=new Array();
var sheetCnt=0;
/* 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick=processButtonClick;
/* 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
    function processButtonClick(){
         /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
         var sheetObject=sheetObjects[0];
         var sheetObject1=sheetObjects[1];
         /*******************************************************/
         var formObject=document.form;
    	try {
    		var srcName=ComGetEvent("name");
            switch(srcName) {
		    	case "btn_DownExcel":
		    		doActionIBSheet(sheetObject,formObject,IBDOWNEXCEL);
		    		break;
        	    case "btn_save":
    	            doActionIBSheet(sheetObject,formObject,IBSAVE);
    	            //ComClosePopup(); 
        	        break;
                case "btn_close":
                	ComClosePopup(); 
                    break;
            } // end switch
    	}catch(e) {
    		if( e == "[object Error]") {
    			ComFuncErrMsg(getMsg('COM12111'));
    		} else {
    			ComFuncErrMsg(e);
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
          ComConfigSheet(sheetObjects[i]);
          initSheet(sheetObjects[i],i+1);
          ComEndConfigSheet(sheetObjects[i]);
      }
      doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
    }
   /**
     * 시트 초기설정값, 헤더 정의
     * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
     * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
     */
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
        sheetObj.SetWaitImageVisible(0);
        switch(sheetNo) {
             case 1:      //IBSheet1 init
                 with(sheetObj){
		              (5, 0, 0, true);
		              var HeadTitle="|Role Code|Role Name|STS";
		
		              SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:0 } );
		
		              var info    = { Sort:0, ColMove:1, HeaderCheck:1, ColResize:1 };
		              var headers = [ { Text:HeadTitle, Align:"Center"} ];
		              InitHeaders(headers, info);
		
		              var cols = [ {Type:"CheckBox",  Hidden:0, Width:35,   Align:"Center",  ColMerge:0,   SaveName:"check_val" },
		                  {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:"usr_role_cd",  KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   TreeCol:1 ,  LevelSaveName:"Level" },
		                  {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",    ColMerge:0,   SaveName:"usr_role_nm",  KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                  {Type:"Status",    Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" } ];
		               
              		InitColumns(cols);
//          			SetSheetHeight(320);
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
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
           case IBSEARCH:      //조회
              //sheetObj.CheckAll("checkbox")='0';
              formObj.f_cmd.value=SEARCH01;
              sheetObj.DoSearch("searchProgRoleMapping.do", FormQueryString(formObj) );
              break;
            case IBSAVE:        //저장
              if(validateForm(sheetObj,formObj,sAction)){
                  formObj.f_cmd.value=MULTI;
                  sheetObj.XmlHttpVer=1;
                  sheetObj.DoSave("searchProgRoleMapping.do", FormQueryString(formObj));
              }
              break;
            case IBDOWNEXCEL:	//엑셀다운로드
            	if(sheetObj.RowCount() < 1){
            		ComShowCodeMessage("COM132501");
            	}else{
            		sheetObj.Down2Excel({ HiddenColumn:1,CheckBoxOnValue:"Y",CheckBoxOffValue:"N"});
            	}
				break;
        }
    }
    /**
     * 데이타를 저장한 후에 처리하는 함수
     * IBSheetConfig.js에서 DataSheetObject.prototype.event_OnSearchEnd에서 정의
     */
    function sheet1_OnSaveEnd(sheetObj, code, msg, stCode, stMsg){
    	if(msg == null || msg == ""){
    		ComClosePopup(); 
        }
    }
   /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
//            if (!isNumber(iPage)) {
//
//                return false;
//            }
        }
        return true;
    }
