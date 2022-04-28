/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : ADM_SYS_0004.js
*@FileTitle  : Admin Role
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
var sheetObjects=new Array();
var sheetCnt=0;
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
            switch(srcName) {
        	    case "btn_Retrieve":
    	            doActionIBSheet(sheetObject,formObject,IBSEARCH);
        	        break;
        	    case "btn_Save":
    	            doActionIBSheet(sheetObject,formObject,IBSAVE);
        	        break;
            	case "btn_Copy":
            		ComOpenWindowCenter('ADM_SYS_0010Pop.do?admin_page=N', '', 800, 600);
            		break;
        	    case "btn_Add":
    	            doActionIBSheet(sheetObject,formObject,IBINSERT);
        	        break;
        	    case "btn_DownExcel":
                  doActionIBSheet(sheetObject,formObject,IBDOWNEXCEL);
                  break;
            } // end switch
    	}catch(e) {
    		if( e == "[object Error]") {
    			ComShowMessage(OBJECT_ERROR);
    		} else {
    			ComShowMessage(e.message);
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
            ComConfigSheet(sheetObjects[i]);
            initSheet(sheetObjects[i],i+1);
        //khlee-마지막 환경 설정 함수 추가
            ComEndConfigSheet(sheetObjects[i]);
        }
        initControl();
    }
    function initControl() {
       	var formObject=document.form;
           //Axon 이벤트 처리1. 이벤트catch(개발자변경)
       	//axon_event.addListener('keydown','ComKeyEnter("search")','form');
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
             var HeadTitle="Del|STS|Role Cd|Role Name|Role Description|Upper Role Cd|User Assign|Prog Assign|Reg Date|Admin" ;
             var prefix="sheet1_";

             SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:0 } );

             var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
             var headers = [ { Text:HeadTitle, Align:"Center"} ];
             InitHeaders(headers, info);

             var cols = [ {Type:"DelCheck",  Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"delcheck" },
                      {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
                      {Type:"Text",      Hidden:0, Width:100,   Align:"Center",  ColMerge:0,   SaveName:prefix+"usr_role_cd",      KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1, InputCaseSensitive:1, AcceptKeys:"E|N",  TreeCol:1 ,  LevelSaveName:prefix+"level" },
                      {Type:"Text",      Hidden:0, Width:430,  Align:"Left",    ColMerge:0,   SaveName:prefix+"usr_role_nm",      KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                      {Type:"Text",      Hidden:0, Width:440,  Align:"Left",    ColMerge:0,   SaveName:prefix+"usr_role_desc",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                      {Type:"Popup",     Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName:prefix+"prnt_usr_role_cd", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                      {Type:"Popup",     Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:prefix+"user_assign",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                      {Type:"Popup",     Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:prefix+"prog_assign",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                      {Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cre_dt",           KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"adm_yn",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }]; 
                
             InitColumns(cols);
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
        switch(sAction) {
           case IBSEARCH:      //조회
                if(validateForm(sheetObj,formObj,sAction))
                    //sheetObj.DoSearch("UI_COM_SYS_007_DATA.html");
                    formObj.f_cmd.value=SEARCH;
                	sheetObj.DoSearch("ADM_SYS_0004GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_") );
               //sheetObj.DoSearch4Post("com.clt.apps.bms.bms.pfm.managemarketstatus.UIBMSPFM001ActionENIS.do", FormQueryString(formObj));
                break;
            case IBSAVE:        //저장
              if(validateForm(sheetObj,formObj,sAction)){
                formObj.f_cmd.value=MULTI;
                sheetObj.DoSave("ADM_SYS_0004GS.do", FormQueryString(formObj));
              }
                break;
           case IBINSERT:      // 입력
                sheetObj.DataInsert(-1,1);
                break;
           case IBDOWNEXCEL:  //엑셀내려받기
        	   if(sheetObj.RowCount() < 1){
        			ComShowCodeMessage("COM132501");
        		}else{
        			sheetObj.Down2Excel({DownCols: makeHiddenSkipCol(sheetObj), SheetDesign:1, Merge:1});
        		}
                break;
           case COMMAND01:
				var param="?pgmId=ADM_SYS_0004&userId=opus2&showMenu=N&showHeader=N&appId=00000005&locale=en"
				var url="http://www.p2gether.com/HelpOneSV/linkHelpOne.do";
				ComOpenWindowCenter(url+param, "", 980,550, false, true);
		    	break;
        }
    }
    function sheet1_OnPopupClick(sheetObj,Row,Col){
    			var prefix="sheet1_";
        switch (sheetObj.ColSaveName(Col)) {
        case prefix + "prnt_usr_role_cd" :
        			ComOpenPopup('/opuscntr/viewUpperRole.do', 700, 474, 'setPrntUsrRoleCd', '1,0,1,1,1,1,1,1,1,0', true, false, Row, Col, 0);
             break;
        case prefix + "user_assign" :
        	 if( checkAleadySaveRow(sheetObj,Row,Col )){
        		 ComOpenPopup('/opuscntr/userMapping.do?role_cd='+sheetObj.GetCellValue(Row,prefix + "usr_role_cd")+"&role_nm="+escape(sheetObj.GetCellValue(Row,prefix + "usr_role_nm")), 800, 474, 'setPrntUsrRoleCd', '1,0,1,1,1,1,1,1,1,0', true, false, Row, Col, 0);
            	 doActionIBSheet(sheetObj,document.form,IBSEARCH);
             }
             break;
        case prefix + "prog_assign" :
        	if( checkAleadySaveRow(sheetObj,Row,Col )){
        		ComOpenPopup('/opuscntr/programMapping.do?role_cd='+sheetObj.GetCellValue(Row,prefix + "usr_role_cd")+"&role_nm="+escape(sheetObj.GetCellValue(Row,prefix + "usr_role_nm")), 800, 474, 'setPrntUsrRoleCd', '1,0,1,1,1,1,1,1,1,0', true, false, Row, Col, 0);
            	doActionIBSheet(sheetObj,document.form,IBSEARCH);
             }
             break;
        }
    }
   function setPrntUsrRoleCd(aryPopupData, row, col, sheetIdx){
			var sheetObject=sheetObjects[0];
			sheetObject.SetCellValue(row,col,aryPopupData[0][3]);
		}
   /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
//                if (!isNumber(iPage)) {
//
//                    return false;
//                }
        }
        return true;
    }
    /**
     * Role이 저장되기 전에는 사용자와 프로그램 부여 불가 
     * 2011.01.06 류현수 
    */
    function checkAleadySaveRow(sheetObj,Row,Col){
    	var updateable=false;
    		if(sheetObj.GetCellValue(Row,"sheet1_ibflag")=="I"){
    		 ComShowCodeMessage('COM131604', 'this assignment setting at this time.  Please set this assignment after saving this role and getting a permission from Almighty user.');
    		 updateable=false;	
			}else if(sheetObj.GetCellValue(Row, "sheet1_adm_yn") == "N"){
    		 ComShowCodeMessage('COM12157' , 
				 'Please set this assignment after getting a permission from Almighty user.'
    		 );    		 
    		 updateable=false;
    	 }else{
    		 updateable=true;
    	 }
    	return updateable;
    }
