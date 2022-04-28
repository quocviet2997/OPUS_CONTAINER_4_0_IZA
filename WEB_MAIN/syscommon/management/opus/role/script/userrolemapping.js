/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : UI_COM_SYS_008.js
*@FileTitle  : 역할 매핑 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/24
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
    		if(ComGetBtnDisable(srcName)) return false;
            switch(srcName) {
        	    case "btn_save":
    	            doActionIBSheet(sheetObject,formObject,IBSAVE);
    	            //ComClosePopup(); 
        	        break;
            case "btn_close":
            	ComClosePopup(); 
                break;
            case "btn_DownExcel":
             	sheetObject.Down2Excel( {DownCols: "check_val|usr_role_cd|usr_role_nm", SheetDesign:1,Merge:1 });
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
		               var HeadTitle="|Role Code|Role Name|admin|STS";
			               SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:0 } );
			
			               var info    = { Sort:0, ColMove:1, HeaderCheck:1, ColResize:1 };
			               var headers = [ { Text:HeadTitle, Align:"Center"} ];
			               InitHeaders(headers, info);
			               var cols;
			               if(document.form.admin_page.value == "N"){
			            	   cols = [ {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"check_val",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                      {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"usr_role_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, TreeCol:1 ,  LevelSaveName:"level" },
			                      {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",    ColMerge:0,   SaveName:"usr_role_nm",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                      {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"admin_chk" },
			                      {Type:"Status",    Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" } ];
			               } else {
					           cols=[{Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"check_val" },
					               {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"usr_role_cd",  KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, TreeCol:1 ,  LevelSaveName:"level" },
					               {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",    ColMerge:0,   SaveName:"usr_role_nm",  KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					               {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"admin_chk" },
					               {Type:"Status",    Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" }];
			               }
			          
			               InitColumns(cols);
			
			               SetEditable(1);
			               //InitTreeInfo(1, "Level");
//			               SetSheetHeight(240);
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
               sheetObj.DoSearch("searchRoleMapping.do", FormQueryString(formObj) );
              break;
            case IBSAVE:        //저장
              if(validateForm(sheetObj,formObj,sAction)){
                  formObj.f_cmd.value=MULTI;
                  sheetObj.DoSave("searchRoleMapping.do", FormQueryString(formObj),"ibflag",false,true);
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
    		if(parent!=null) parent.doActionIBSheet(parent.sheet1,parent.document.form,IBSEARCH);
    		ComClosePopup(); 
          }
    }
     /**
      * 데이타를 조회한 후에 처리하는 함수
      * IBSheetConfig.js에서 DataSheetObject.prototype.event_OnSearchEnd에서 정의
      */
     function sheet1_OnSearchEnd(sheetObj,errMsg){
       // Super User가 일반사용자에게 Role 부여하는 경우, 관리할 수 있는 Role 만 체크할 수 있도록 처리함
       var login_usr_auth_tp_cd=document.form.login_usr_auth_tp_cd.value;	// 로긴 사용자의 User Auth Type (A, S...)      
       var firstRow=1;
       if(login_usr_auth_tp_cd == "S") {
 		  // 관리 대상 User가 Almighty 또는 System Admin 인 경우	  
 		  var usr_auth_tp_cd=document.form.usr_auth_tp_cd.value;
 		  if(usr_auth_tp_cd == "A" || usr_auth_tp_cd == "E") {
 			  	for(var i=1; i<sheetObj.RowCount()+1; i++) {
 			   		sheetObj.SetCellEditable(i, "check_val",0);
 			  	} 
 		  } else {	// Super User 또는 Regular User 인 경우
 		      	for(var i=1; i<sheetObj.RowCount()+1; i++) {
 		      		if(sheetObj.GetCellValue(i, "admin_chk") == "Y") {
 			   			sheetObj.SetCellEditable(i, "check_val",1);
 			   			if ( firstRow == 1 ) firstRow=i;
 			  		} else {
 			  			sheetObj.SetCellEditable(i, "check_val",0);
 			  		}
 			  	} 
 		  }
       }
       sheetObj.SetTopRow(firstRow);
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