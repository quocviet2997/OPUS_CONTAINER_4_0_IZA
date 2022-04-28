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
        	    case "btn_retrieve":
    	            doActionIBSheet(sheetObject,formObject,IBSEARCH);
        	        break;
        	    case "btng_rowadd":
        	    	doActionIBSheet(sheetObject,formObject,IBINSERT);
        	        break;
        	    case "btng_save":
    	            doActionIBSheet(sheetObject,formObject,IBSAVE);
        	        break;
        	    case "btn_Copy":
            		ComOpenWindowCenter('ADM_SYS_0010Pop.do?admin_page=N', '', 800, 600);
            		break;
        	    case "btn_DownExcel":
            		doActionIBSheet(sheetObject,formObject,IBDOWNEXCEL);
            		
            		break;
        	    case "btn_Help":
        	    	doActionIBSheet(sheetObject,formObject,COMMAND01);
        	    	break;
        	    case "btn_select":
    	            officeChange(sheetObject, formObject);
        	        break;
        	    case "btng_delete":
    	            doActionIBSheet(sheetObject,formObject,IBDELETE);
        	        break;
        	     case "btn_Close":
        	    	 ComClosePopup(); 
         	        break;
            } // end switch
    	}catch(e) {
    		if( e == "[object Error]") {
    			ComShowCodeMessage('COM12111');
    		} else {
    			ComShowMessage(e);
    		}
    	}
    }
    function officeChange(sheetObject, formObject) {
    	var usr_id="";
    	var cng_ofc_cd="";
    	var default_lgin_ofc="";
    	var selRow=sheetObject.GetSelectRow();
        if(selRow == 0) {
        	ComShowCodeMessage("COM12176");
            return;
        }
        for(var i=1; i<sheetObject.rowCount+1; i++) {
			if(sheetObject.GetCellValue(i, "default_lgin_ofc") == "1") {
			default_lgin_ofc=sheetObject.GetCellValue(i, "cng_ofc_cd");
   			}
   		}
        /*if(default_lgin_ofc == 0)
        {
        	ComShowCodeMessage("COM12176");
              return;
        }*/
        //alert(default_lgin_ofc);
        cng_ofc_cd=sheetObject.GetCellValue(selRow, "cng_ofc_cd");
        usr_id=sheetObject.GetCellValue(selRow, "usr_id");
        usr_nm=sheetObject.GetCellValue(selRow, "usr_nm");
        if(cng_ofc_cd == "" && usr_id == "") {
        	ComShowCodeMessage("COM12113", "Row");
        	return;        	
        }
        if(sheetObject.GetCellValue(selRow, "expire") == "Y") {
        	ComShowMessage("The selected Office is expired");
        	return;
        }
        formObject.f_cmd.value=MODIFY;
        formObject.action="ADM_SYS_0008Pop.do";
        formObject.cng_ofc_flg.value="Y";
        formObject.cng_ofc_cd.value=cng_ofc_cd;
        formObject.default_ofc_cd.value=default_lgin_ofc;
        formObject.f_cmd.value="";
        formObject.pgmNo.value="ADM_SYS_0008";
        formObject.submit();
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
    	if(document.form.admin_page.value != "Y") {
    		doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
    	}
    }
     function initControl() {
    	 var formObject=document.form;
         //Axon 이벤트 처리1. 이벤트catch(개발자변경)
         axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
     }
   /**
     * 시트 초기설정값, 헤더 정의
     * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
     * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
     */
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
	    var admin_page=document.form.admin_page.value;
	   //admin_page="Y";
        switch(sheetNo) {
             case 1:      //IBSheet1 init
            	 with(sheetObj){
	            	//어드민 권한이 있을 경우 삭제가능
	                if(admin_page == 'Y'){
	                	var HeadTitle="Del|STS|User ID|User Name|User Local Name|Office Code|Office Code2|RHQ|FM Date |To Date|Remarks|Create User ID|Create Date|Modi. User ID|Modi. Date|" ;
	                }else{
	                	var HeadTitle="STS|Log in OFC|User ID|User Name|User Local Name|Office Code|Office Code2|RHQ|FM Date |To Date|Remarks|Create User ID|Create Date|Modi. User ID|Modi. Date|" ;
	                }
	              
	
	               SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, FrozenCol:0, DataRowMerge:0 } );
	
	               var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
	               var headers = [ { Text:HeadTitle, Align:"Center"} ];
	               InitHeaders(headers, info);
	               var cols;
	               if(admin_page == 'Y'){
	                   cols = [ {Type:"DelCheck",  Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"" },
	                            {Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" } ];
	            	   
	               } else {
	            	   cols = [ {Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
	            	            {Type:"Radio",     Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"default_lgin_ofc",  KeyField:0 } ];
	            	   
	               }
	
	               
	               cols.push( {Type:"Text",      Hidden:0, Width:70,   Align:"Left",    ColMerge:0,   SaveName:"usr_id",       KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                            {Type:"Text",      Hidden:0, Width:100,  Align:"Left",    ColMerge:0,   SaveName:"usr_nm",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                            {Type:"Text",      Hidden:0, Width:100,  Align:"Left",    ColMerge:0,   SaveName:"usr_locl_nm",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                            {Type:"Text",      Hidden:0, Width:100,  Align:"Left",    ColMerge:0,   SaveName:"ofc_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                            {Type:"PopupEdit", Hidden:0, Width:100,  Align:"Left",    ColMerge:0,   SaveName:"cng_ofc_cd",   KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1, AcceptKeys:"E|N", InputCaseSensitive:1 },
	                            {Type:"Text",      Hidden:0, Width:80,   Align:"Left",    ColMerge:0,   SaveName:"rhq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } );
	               if(admin_page == 'Y'){
		        	   cols.push({Type:"Popup",     Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"cng_ofc_fm_dt",  KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                     {Type:"PopupEdit", Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"cng_ofc_to_dt",  KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                     {Type:"Text",      Hidden:0, Width:150,  Align:"Left",    ColMerge:0,   SaveName:"rqst_ctnt",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 });
	               } else {
	            	   cols.push({Type:"Popup",     Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"cng_ofc_fm_dt",  KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                         {Type:"PopupEdit", Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"cng_ofc_to_dt",  KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                         {Type:"Text",      Hidden:0, Width:150,  Align:"Left",    ColMerge:0,   SaveName:"rqst_ctnt",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 } );                            
	               }
	               
	               cols.push({Type:"Text",      Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"cre_usr_id",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                            {Type:"Text",      Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"cre_dt",      KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                            {Type:"Text",      Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"upd_usr_id",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                            {Type:"Text",      Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"upd_dt",      KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                            {Type:"Text",      Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"expire",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } );
					
	               InitColumns(cols);
	
	               //SetEditable(1);
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
           		if(validateForm(sheetObj,formObj,sAction)) {
                	formObj.f_cmd.value=SEARCH;
                	if(ComIsNull(formObj.usr_id) && ComIsNull(formObj.usr_nm)){
						ComShowCodeMessage("COM130201","User Id or User Name");
                	} else{
                		sheetObj.DoSearch("ADM_SYS_0008GS.do", FormQueryString(formObj) );
                	}
                }
                break;
            case IBSAVE:        //저장
              if(validateForm(sheetObj,formObj,sAction)){
                formObj.f_cmd.value=MULTI;
                sheetObj.DoSave("ADM_SYS_0008GS.do", FormQueryString(formObj));
              }
                break;
           case IBINSERT:      // 입력
        	   for (var i=0;i<formObj.addrows.value;i++) sheetObj.DataInsert();
                break;
        	case IBDELETE:                
   			     if(validateForm(sheetObj,formObj,sAction)){
                formObj.f_cmd.value=MULTI;
                sheetObj.DoSave("ADM_SYS_0008GS.do", FormQueryString(formObj));
              }
                break;			
           case IBDOWNEXCEL:  //엑셀내려받기
        	   if(sheetObj.RowCount() < 1){
        			ComShowCodeMessage("COM132501");
        		}else{
//        			sheetObj.Down2Excel({ HiddenColumn:1});
        			sheetObj.Down2Excel( {DownCols: makeHiddenSkipCol(sheetObj), SheetDesign:1,Merge:1 });
        		}
               break;
           case COMMAND01:
				var param="?pgmId=ADM_SYS_0008&userId=opus4&showMenu=N&showHeader=N&appId=00000005&locale=en"
				var url="http://www.p2gether.com/HelpOneSV/linkHelpOne.do";
				ComOpenWindowCenter(url+param, "", 980,550, false, true);
		    	break;
        }
    }
    function sheet1_OnPopupClick(sheetObj,Row,Col){
        switch (sheetObj.ColSaveName(Col)) {
            case "roles" :
            	if(sheetObj.GetCellValue(Row,"ibflag")=="I"){
                   showErrMessage(getMsg('COM12151','user'));
                 }else{
                	 noRtnPopup('roleMapping.do?usr_id='+sheetObj.GetCellValue(Row,"usr_id")+"&usr_nm="+escape(sheetObj.GetCellValue(Row,"usr_nm")),'width=700,height=474,left=200,top=100,menubar=0,status=0,scrollbars=0,resizable=1');
                 }
                 break;
            case "ofc_cd" :
            	ComOpenPopup('/opuscntr/viewOrg.do', 700, 474, 'setOfcCd', '0,1', false, false, Row, Col, 0);
                 break;
            case "cng_ofc_cd" :
            	 ComOpenPopup('/opuscntr/COM_ENS_071.do?ofc_pts_cd=ALL', 700, 474, 'setPrntUsrRoleCd', '0,0,1,1,1,1,1,1', false, false, Row, Col, 0);
                 break;
           case "cng_ofc_fm_dt" :
        	   if (sheetObj.ColSaveName(Col) != "cng_ofc_fm_dt") return;
        	   var cal=new ComCalendarGrid("myCal");
        	   cal.select(sheetObj, Row, Col, 'yyyy-MM-dd');
        	   break;
		   case "cng_ofc_to_dt" :
			   if (sheetObj.ColSaveName(Col) != "cng_ofc_to_dt") return;
               var cal=new ComCalendarGrid("myCal");
               cal.select(sheetObj, Row, Col, 'yyyy-MM-dd');
               break;
        }
    }
    function setPrntUsrRoleCd(aryPopupData, row, col, sheetIdx){
		var sheetObject=sheetObjects[0];
		sheetObject.SetCellValue(row,col,aryPopupData[0][3]);
	}
    function sheet1_OnSearchEnd(sheetObj){
    	var admin_page=document.form.admin_page.value;
    	if(admin_page == "Y") {	// 관리자 화면
    		for(var i=1; i<sheetObj.rowCount+1; i++) {
    			if(sheetObj.GetCellValue(i, "expire") == "Y") {
	    			sheetObj.SetRowFontColor(i,"#C0C0C0");
	   			}
	   		}
    	} else {	// 사용자 화면	
    		// Sheet 의 Selection 모드를 Row 단위로 변경
    		sheetObj.SetSelectionMode(smSelectionRow);
	    	var login_ofc_cd=document.form.login_ofc_cd.value;
	    	for(var i=1; i<sheetObj.rowCount+1; i++) {
	    		if(sheetObj.GetCellValue(i, "expire") == "Y") {
	    			sheetObj.SetRowFontColor(i,"#C0C0C0");
	   			}
	    		if(sheetObj.GetCellValue(i, "cng_ofc_cd") == login_ofc_cd) {
	    			sheetObj.SetRowFontColor(i,"#0000FF");
	   			}
	   		}
    	}
    }
    function sheet1_OnChange(sheetObj,Row,Col) {
    	var dept_id="";
    	var usr_id="";
    	var formObject=document.form;
    	if(Col == 2) {
    		usr_id=sheetObj.GetCellValue(Row, 2);
    		if ( usr_id == "") return;
    		formObject.f_cmd.value=SEARCH01;
     		var sXml=sheetObj.GetSearchData("ADM_SYS_0008GS.do?usr_id="+usr_id+"&row="+Row, FormQueryString(formObject));
    		if(ComGetEtcData(sXml,"total") != "0"){
    			sheetObj.SetCellValue(Row, "usr_nm",ComGetEtcData(sXml,"usr_nm"));
    			sheetObj.SetCellValue(Row, "usr_locl_nm",ComGetEtcData(sXml,"usr_locl_nm"));
    			sheetObj.SetCellValue(Row, "ofc_cd",ComGetEtcData(sXml,"ofc_cd"));
    			sheetObj.SetCellValue(Row, "cng_ofc_cd",ComGetEtcData(sXml,"cng_ofc_cd"));
    			sheetObj.SetCellValue(Row, "rhq",ComGetEtcData(sXml,"rhq"));
    			sheetObj.SetCellValue(Row, "cng_ofc_fm_dt",ComGetEtcData(sXml,"cng_ofc_fm_dt"));
    		}
    	}    	
    	if(Col == 6) {
		usr_id=sheetObj.GetCellValue(Row, 2);
		dept_id=sheetObj.GetCellValue(Row, Col);
    		for(var i=1; i<sheetObj.rowCount+1; i++) {
    			if((sheetObj.GetCellValue(i, 2) == usr_id && sheetObj.GetCellValue(i, Col) == dept_id )&& i != Row) {
    				alert("office code2["+sheetObj.GetCellValue(Row, Col)+"] is duplicated.");
    				sheetObj.SetCellValue(Row, Col,"",0);
    				break;
    			} 
    		}    		
    		formObject.f_cmd.value=SEARCH02;
     		var sXml=sheetObj.GetSearchData("ADM_SYS_0008GS.do?usr_id="+usr_id+"&cng_ofc_cd="+dept_id+"&row="+Row, FormQueryString(formObject));
    		if(ComGetEtcData(sXml,"total") != "0"){
    			sheetObj.SetCellValue(Row, "rhq",ComGetEtcData(sXml,"rhq"));
    		}
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
