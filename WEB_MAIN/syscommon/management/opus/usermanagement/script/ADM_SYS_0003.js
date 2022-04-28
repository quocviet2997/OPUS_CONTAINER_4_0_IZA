/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : ADM_SYS_0003.js
*@FileTitle  : User Management
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
  	// 공통전역변수
	var tabObjects=new Array();
	var tabCnt=0 ;
	var beforetab=1;
	var sheetObjects=new Array();
	var sheetCnt=0;
	// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
	document.onclick=processButtonClick;
	// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
    function processButtonClick(){
         /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
         var sheetObject1=sheetObjects[0];
         /*******************************************************/
         var formObject=document.form;
    	try {
    		var srcName=ComGetEvent("name");
            switch(srcName) {
            	case "btn_Add":
            		doActionIBSheet(sheetObject1,formObject,IBINSERT);
            		break;
            	case "btn_Retrieve":
            		doActionIBSheet(sheetObject1,formObject,IBSEARCH);
            		break;
            	case "btn_Save":
            		doActionIBSheet(sheetObject1,formObject,IBSAVE);
            		break;
            	case "btn_Copy":
            		ComOpenWindowCenter('ADM_SYS_0010Pop.do?admin_page=N', '', 800, 600);
            		break;
            	case "btn_DownExcel":
            		doActionIBSheet(sheetObject1,formObject,IBDOWNEXCEL);
            		break;
				case "btn_ofc_cd":
					ComOpenPopupWithTarget('/opuscntr/COM_ENS_071.do?ofc_pts_cd=ALL', 700, 520, "ofc_cd:s_ofc_cd", '0,0,1,1,1,1,1,1', true);
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
     * 페이지에 생성된 IBSheet Object를 sheetObjects배열에 등록한다. <br>
     * sheetObjects 배열은 공통전역변수로 상단에 정의하고, 이 함수는 {@link CoObject#ComSheetObject} 함수에 의해서 IBSheet Object가 생성되면서 자동 호출된다. <br>
     * @param {ibsheet} sheet_obj    IBSheet Object
     **/
    function setSheetObject(sheet_obj){
       sheetObjects[sheetCnt++]=sheet_obj;
    }
    /**
     * body.onload 이벤트에서 호출되는 함수로 페이지 로드완료 후 선처리해야할 기능을 추가한다. <br>
     * HTML컨트롤의 각종 이벤트와 IBSheet, IBTab 등을 초기화 한다. <br>
     **/
    function loadPage(flag) {
		for(i=0;i<sheetObjects.length;i++){
			ComConfigSheet (sheetObjects[i]);
			initSheet(sheetObjects[i],i+1,flag);
			// User Flag : true (userInfomation)
			 if ( flag ){
				 sheetObjects[i].SetColEditable("use_flg",0);
			 }
			ComEndConfigSheet(sheetObjects[i]);
		}
		initControl();
		if ( flag ) doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
	}
    function initControl() {
       	var formObject=document.form;
           axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
       }
       //업무 자바스크립트 OnKeyPress 이벤트 처리
       function keypressFormat() {
       	obj=ComGetEvent();
     	    if(obj.dataformat == null) return;
     	    window.defaultStatus=obj.dataformat;
     	    switch(ComGetEvent("name")) {
     	        case "s_ofc_cd":
     	        	ComKeyOnlyAlphabet('uppernum');
     	            break;
     	    }
       }
    /**
     * 페이지에 있는 IBSheet Object를 초기화 한다. <br>
     * IBSheet가 여러개일 경우 개수만큼 case를 추가하여 IBSheet 초기화 모듈을 구성한다. <br>
     * {@link #loadPage}함수에서 이 함수를 호출하여 IBSheet Object를 초기화 한다. <br>
     * @param {ibsheet} sheetObj    IBSheet Object
     * @param {int}     sheetNo     sheetObjects 배열에서 순번
     **/
    function initSheet(sheetObj,sheetNo,flag) {
        var cnt=0;
		var sheetID=sheetObj.id;
        switch(sheetID) {
            case "sheet1":
                with(sheetObj){
            	 var adminPageValue = document.getElementsByName("admin_page")[0].value;
            	 var HeadTitle;
            	 if(adminPageValue == "Y"){
    	             HeadTitle="|Del|User ID|Pwd|Pwd Reset|User Name|User Local Name|Office Code|Log In OFC|Auth Type|Super user's Role|Use Flag|Role|Program|Cell Phone|Phone No|Fax No|Email|Sales Rep|Email from IAM|Job|Position|Grade|Role His|National|Language|TimeZone|Date Type|Num Type|Create User ID|Create Date|Modi. User ID|Modi. Date|usr_pwd_cre_dt|usr_lck_dt|usr_lgin_fald_knt|" ; 
            	 }else{
    	             HeadTitle="||User ID|Pwd|Pwd Change|User Name|User Local Name|Office Code|Log In OFC|Auth Type|Super user's Role|Use Flag|Role|Program|Cell Phone|Phone No|Fax No|Email|Sales Rep|Email from IAM|Job|Position|Grade|Role His|National|Language|TimeZone|Date Type|Num Type|Create User ID|Create Date|Modi. User ID|Modi. Date|usr_pwd_cre_dt|usr_lck_dt|usr_lgin_fald_knt|" ;
            	 }
	             var headCount=ComCountHeadTitle(HeadTitle);
	             
	             SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataGetRowMerge:0 } );
	             
	             var info={ Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	             var headers=[ { Text:HeadTitle, Align:"Center"} ];
	            
	             InitHeaders(headers, info);

	             var strUsr_auth = document.getElementById("strUsr_auth").value;
	             	             
	             var cols=[ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
	                 {Type:"DelCheck",  Hidden:0, Width:45,   Align:"Center",  ColMerge:0,   SaveName:"DEL",         		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Text",      Hidden:0, Width:70,   Align:"Left",    ColMerge:0,   SaveName:"usr_id",             KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                 {Type:"Text",      Hidden:1, Width:80,   Align:"Left",    ColMerge:0,   SaveName:"usr_pwd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"CheckBox",  Hidden:0, Width:100,   Align:"Center",  ColMerge:0,   SaveName:"lck_chk",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Text",      Hidden:0, Width:150,  Align:"Left",    ColMerge:0,   SaveName:"usr_nm",             KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Text",      Hidden:0, Width:150,  Align:"Left",    ColMerge:0,   SaveName:"usr_locl_nm",        KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"PopupEdit", Hidden:0, Width:100,  Align:"Left",    ColMerge:0,   SaveName:"ofc_cd",             KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, AcceptKeys:"E|N", InputCaseSensitive:1},
	                 {Type:"Text",      Hidden:0, Width:100,  Align:"Left",    ColMerge:0,   SaveName:"cng_ofc_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Combo",     Hidden:0, Width:80,   Align:"Left",    ColMerge:0,   SaveName:"usr_auth_tp_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, ComboText:"Regular|Almighty|SuperUser", ComboCode:"R|A|S" },
	                 {Type:"Popup",     Hidden:0, Width:110,  Align:"Center",  ColMerge:0,   SaveName:"super_role_assign",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Combo",     Hidden:0, Width:80,   Align:"Left",    ColMerge:0,   SaveName:"use_flg",            KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, ComboText:"Yes|No", ComboCode:"Y|N" },
	                 {Type:"Popup",     Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"role_assign",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Popup",     Hidden:0, Width:60,   Align:"Center",  ColMerge:0,   SaveName:"pgm_assign",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Text",      Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"mphn_no",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Text",      Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"xtn_phn_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Text",      Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"fax_no",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Text",      Hidden:0, Width:160,  Align:"Left",    ColMerge:0,   SaveName:"dflt_eml",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"srep_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Text",      Hidden:0, Width:160,  Align:"Left",    ColMerge:0,   SaveName:"usr_eml",            KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"jb_eng_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"psn_eng_nm",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"grd_eng_nm",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Popup",     Hidden:0, Width:60,   Align:"Center",  ColMerge:0,   SaveName:"role_assign_his",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Text",      Hidden:1, Width:120,  Align:"Left",    ColMerge:0,   SaveName:"cnt_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:0 },
	                 {Type:"Text",      Hidden:1, Width:80,   Align:"Left",    ColMerge:0,   SaveName:"lang_tp_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:0 },
	                 {Type:"Text",      Hidden:1, Width:150,  Align:"Left",    ColMerge:0,   SaveName:"gmt_tmzn_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:0 },
	                 {Type:"Text",      Hidden:1, Width:80,   Align:"Left",    ColMerge:0,   SaveName:"cnt_dt_fmt_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:0 },
	                 {Type:"Text",      Hidden:1, Width:80,   Align:"Left",    ColMerge:0,   SaveName:"cnt_no_fmt_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:0 },
	                 {Type:"Text",      Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"cre_usr_id",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                 {Type:"Text",      Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"cre_dt",             KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                 {Type:"Text",      Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"upd_usr_id",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                 {Type:"Text",      Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"upd_dt",             KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },	                 
	          
	                 //{Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"usr_old_pwd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                 {Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"usr_pwd_cre_dt",        KeyField:0,   CalcLogic:"",   Format:"YmdHms",          PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                 {Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"usr_lck_dt",        	KeyField:0,   CalcLogic:"",   Format:"YmdHms",          PointCount:0,   UpdateEdit:0,   InsertEdit:0 },   
	                 {Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"usr_lgin_fald_knt",     KeyField:0,   CalcLogic:"",   Format:"",          PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                 {Type:"Combo",     Hidden:1, Width:80,   Align:"Left",    ColMerge:0,   SaveName:"usr_pwd_chg_flg",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, ComboText:"No|Yes", ComboCode:"N|Y" }
	  	           
	                 ];
	             
	             InitColumns(cols);
	             if(adminPageValue != "Y") {
	            	 SetColHidden("DEL",1);
	            	 SetCountPosition(0);
	             }
	             //SetSheetHeight(322);
	             resizeSheet();
	             //InitDataValid(0, "mphn_no", vtNumericOther, "-"); 
	             //InitDataValid(0, "fax_no", vtNumericOther, "-"); 
	             //InitDataValid(0, "xtn_phn_no", vtNumericOther, "-"); 
	             }
	             break;
        }
    }
    
    function resizeSheet(){
   	         ComResizeSheet(sheetObjects[0]);
   }
    /**
     * IBSheet 관련 각종 기능(조회,저장 등)을 처리한다. <br>
     * {@link #processButtonClick}함수에서 이 함수를 호출하여 버튼에서 IBSheet의 기능을 호추할 때 사용한다. <br>
     * @param {ibsheet} sheetObj    IBSheet Object
     * @param {form}    formObj     Form Object
     * @param {int}     sAction     처리할 Action 코드(예:IBSEARCH,IBSAVE,IBDELETE,IBDOWNEXCEL 등이며 CoObject.js에 정의됨)
     **/
    function doActionIBSheet(sheetObj,formObj,sAction) {
        switch(sAction) {
			case IBSEARCH:      //조회
				formObj.f_cmd.value=SEARCH;
 				sheetObj.DoSearch("ADM_SYS_0003GS.do", FormQueryString(formObj) );
				//setUseFlgEditable();
				break;
			case IBSAVE:        //저장
				if(!validateForm(sheetObj,formObj,sAction)) return;
                //저장처리
            	formObj.f_cmd.value=MULTI;
                sheetObj.DoSave("ADM_SYS_0003GS.do", FormQueryString(formObj));
				break;
			case IBINSERT:      // 입력
				for (var i=0;i<formObj.addrows.value;i++) {
					var row=sheetObj.DataInsert(-1);				 
					makeNewPassword(sheetObj, row);				
				}
				break;
			case IBDOWNEXCEL:	//엑셀다운로드
				if(sheetObj.RowCount() < 1){
					ComShowCodeMessage("COM132501");
				}else{
					sheetObj.Down2Excel({DownCols: makeHiddenSkipCol(sheetObj), SheetDesign:1, Merge:1});
				}
				break;
        }
    }
    
    /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리한다. <br>
     * @param {ibsheet} sheetObj    IBSheet Object
     * @param {form}    formObj     Form Object
     * @param {int}     sAction     처리할 Action 코드(예:IBSEARCH,IBSAVE,IBDELETE,IBDOWNEXCEL 등이며 CoObject.js에 정의됨)
     **/
    function validateForm(sheetObj,formObj,sAction){
    	switch(sAction) {
			case IBSAVE:
	    		with(formObj){
					var sRow = sheetObj.FindStatusRow("I|U");
					var arr = sRow.split(";");
					
					for(var i in arr) {
						if (sheetObj.GetCellValue(arr[i],"ibflag")=="I" && sheetObj.GetCellValue(arr[i],"usr_id")!="") {
							var usrId = sheetObj.GetCellValue(arr[i],"usr_id");
							if(usrId.indexOf("@")>0){
								if(!validateEmail(usrId)){
									ComShowMessage("Please revise incorrect data/format within field <" + usrId + ">!");
									sheetObj.SelectCell(arr[i],"usr_id",1);
									return false;
								}
							} else {
								if(prefixValFlag && !validateOffshore(usrId)){
									ComShowMessage("Please revise incorrect data/format within field <" + usrId + ">!");
									sheetObj.SelectCell(arr[i],"usr_id",1);
									return false;
								}
							}
						}
						if (sheetObj.GetCellValue(arr[i],"dflt_eml")!="") {
							var dfltEml = sheetObj.GetCellValue(arr[i],"dflt_eml");
							if(!ComIsEmailAddr(dfltEml,/;|,/,1)){
								ComShowMessage("Please revise incorrect data/format within field <" + dfltEml + ">!");
								sheetObj.SelectCell(arr[i],"dflt_eml",1);
								return false;
							}
		            	}
						if (sheetObj.GetCellValue(arr[i],"usr_eml")!="") {
							var usrEml = sheetObj.GetCellValue(arr[i],"usr_eml");
							if(!ComIsEmailAddr(usrEml,/;|,/,1)){
								ComShowMessage("Please revise incorrect data/format within field <" + usrEml + ">!");
								sheetObj.SelectCell(arr[i],"usr_eml",1);
								return false;
							}
		            	}
		            }
	    		}
	    		break;
	    }
        return true;
    }
    
    
    //[SR0002499] //Change Request// User Management Data Validation Enhancements
    // Offshore User ID: 1) all in UPPER case 2) no space 3) prefix
    // Email address ID: valid email format check
    function validateOffshore(offs) {
        var re = /^(CLT|GSD|MIB|MIG|MIH|MIM|1JH|SPR|WGZ|WML|WNK)+[A-Z0-9]+$/;
        return re.test(offs);
    }
    
    function validateEmail(email) {
    	var re = /^[a-z0-9!$%'*/=?^_`{|}~-]+(?:\.[a-z0-9!$%'*/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])+$/;
    	//var re = /^[0-9a-z]([-_\.]?[0-9a-z])*@[0-9a-z]([-_\.]?[0-9a-z])*\.[a-z]{2,3}$/;
    	return re.test(email);
    }
    
    function checkPassword(str)
    {
      	
    /*   
       (?mx)
       ^
       (
         (?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])                # must contain a-z, A-Z and 0-9
         |                                                # OR
         (?=.*[a-z])(?=.*[A-Z])(?=.*[!@\#$%&/=?_.,:;\\-~^*()-+{}|"<>/\'\]\[]) # must contain a-z, A-Z and special
         |                                                # OR
         (?=.*[a-z])(?=.*[0-9])(?=.*[!@\#$%&/=?_.,:;\\-~^*()-+{}|"<>/\'\]\[]) # must contain a-z, 0-9 and special
         |                                                # OR
         (?=.*[A-Z])(?=.*[0-9])(?=.*[!@\#$%&/=?_.,:;\\-~^*()-+{}|"<>/\'\]\[]) # must contain A-Z, 0-9 and special
       )
       .{8,}                                              # at least 8 chars
       $
     */  
       var paswd= /^((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])|(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%&\/=?_.,:;\\-~^*()-+{}|"<>/\'\]\[])|(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%&\/=?_.,:;\\-~^*()-+{}|"<>/\'\]\[])|(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%&\/=?_.,:;\\-~^*()-+{}|"<>\'\]\[])).{8,}$/;
       
          	   
    		
      return paswd.test(str);
    }

    function makeNewPassword(sheetObj, row)
    {
    		
        var retrunVal = "ONEOPUS";
        //var possible_01 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //var possible_02 = "abcdefghijklmnopqrstuvwxyz";
        //var possible_03 = "0123456789";
        //for( var i=0; i < 3; i++ )
        //	retrunVal += possible_01.charAt(Math.floor(Math.random() * possible_01.length));
        //for( var i=0; i < 3; i++ )
        //	retrunVal += possible_02.charAt(Math.floor(Math.random() * possible_02.length));        
        //for( var i=0; i < 3; i++ )
        //	retrunVal += possible_03.charAt(Math.floor(Math.random() * possible_03.length));       
      
        sheetObj.SetCellValue(row, "usr_pwd",retrunVal);
        sheetObj.SetCellValue(row, "usr_pwd_chg_flg","Y");
    }
    
    
    /**
     * Program Name Data List OpenWindow. <br>
     * @param {int}	Row	행번호
     * @param {int}	Col	컬럼번호
     **/
    function sheet1_OnPopupClick(sheetObj,Row,Col){
        switch (sheetObj.ColSaveName(Col)) {
        case "ofc_cd" :
        	ComOpenPopup('/opuscntr/COM_ENS_071.do?ofc_pts_cd=ALL', 900, 520, 'setPrntUsrRoleCd', '0,0,1,1,1,1,1,1', true, false, Row, Col, 0);
       		break;
        case "cng_ofc_cd" :
			ComOpenWindowCenter('/opuscntr/ADM_SYS_0008Pop.do?pgmNo=ADM_SYS_0008&admin_page=&usr_id='+sheetObj.GetCellValue(Row,"usr_id")+"&usr_nm="+encodeURI(sheetObj.GetCellValue(Row,"usr_nm")),'', 1000, 600, false);
            break;
       	case "dev_dt" :
       			var cal=new ComCalendarGrid();
       			cal.select(sheetObj, Row, Col, 'yyyyMMdd');
       			break;
        case "role_assign" :
        	if(sheetObj.GetCellValue(Row,"ibflag")=="I" || sheetObj.GetCellValue(Row,"ibflag")=="U"){
		       	 ComShowCodeMessage('COM12151','Role');
		    }else{
				ComOpenWindowCenter('/opuscntr/roleMapping.do?usr_id='+sheetObj.GetCellValue(Row,"usr_id")+"&usr_nm="+encodeURI(sheetObj.GetCellValue(Row,"usr_nm"))+"&usr_auth_tp_cd="+sheetObj.GetCellValue(Row,"usr_auth_tp_cd")+"&admin_page="+document.form.admin_page.value, '', '700', '454', true, false);
		        break;
		  	  }
		      break;
		
        case "role_assign_his" :
        	if(sheetObj.GetCellValue(Row,"ibflag")=="I" || sheetObj.GetCellValue(Row,"ibflag")=="U"){
		       	 ComShowCodeMessage('COM12151','Role');
		    }else{
				ComOpenWindowCenter('/opuscntr/roleMappingHistory.do?usr_id='+sheetObj.GetCellValue(Row,"usr_id")+"&usr_nm="+encodeURI(sheetObj.GetCellValue(Row,"usr_nm"))+"&usr_auth_tp_cd="+sheetObj.GetCellValue(Row,"usr_auth_tp_cd")+"&admin_page="+document.form.admin_page.value, '', '700', '454', true, false);
		        break;
		  	  }
		      break;
		      
        case "super_role_assign" ://super user 인 경우만 
			if(sheetObj.GetCellValue(Row,"ibflag")=="I"){
            	  ComShowCodeMessage('COM12151','User');
            }else{
				var usr_auth_tp_cd=sheetObj.GetCellValue(Row,"usr_auth_tp_cd");
              	if(usr_auth_tp_cd != "S") {
              		ComShowMessage("Only Super User can be assigned Super user's role");
              		break;
              	}
			ComOpenWindowCenter('/opuscntr/roleMapping.do?usr_role_adm_mtch=Y&usr_id='+sheetObj.GetCellValue(Row,"usr_id")+"&usr_nm="+encodeURI(sheetObj.GetCellValue(Row,"usr_nm")),'', '700', '474', true, false);
            }
              break;
        case "pgm_assign" :
			if(sheetObj.GetCellValue(Row,"ibflag")=="I" || sheetObj.GetCellValue(Row,"ibflag")=="U"){
             	 ComShowCodeMessage('COM12151','Role');
            }else{
				ComOpenWindowCenter('/opuscntr/userProgramMapping.do?s_usr_id='+sheetObj.GetCellValue(Row,"usr_id")+"&s_usr_nm="+encodeURI(sheetObj.GetCellValue(Row,"usr_nm"))+"&s_ofc_cd="+sheetObj.GetCellValue(Row,"ofc_cd")+"&s_usr_auth_tp_cd="+sheetObj.GetCellValue(Row,"usr_auth_tp_cd"), '', '700', '474', true, false);
                break;
        	}
            break;
        }
	}
    
    function sheet1_OnSaveEnd(sheetObj,Code,Msg,StCode,StMsg) {
		if(Code >= 0){
			ComShowMessage("Saved successfully.");
			doActionIBSheet(sheetObj,document.form,IBSEARCH);
		} else{
			ComShowMessage("An error occurred while saving data.");
		}
    }
    
    function sheet1_OnChange(sheetObj,Row,Col,Value,OldValue) {
    	var formObject=document.form;
    	if(Col!=8) return;
    	if(Value=="S") {
    		formObject.f_cmd.value=SEARCH;
    		var sXml=sheetObj.GetSearchData("ADM_SYS_0009GS.do?subSys=&usrId="+sheetObj.GetCellValue(Row,"usr_id")+"&ofcCd=", FormQueryString(formObject));
    		if(ComGetEtcData(sXml,"cnt") == "0"){
    			alert("Not a registered super user!");
    			sheetObj.SetCellValue(Row,Col,OldValue,0);
    		}
    	} else if(Value=="A"&&!almightyFlag) {
    		ComShowMessage("Only almighty users can assign almighty!");
    		sheetObj.SetCellValue(Row,Col,OldValue,0);
    	}
    }

    function setSheetColEditable(sheetObj){
    	   
    	for(var i=1;i<=sheetObj.LastRow();i++) {
				sheetObj.SetCellEditable(i,"use_flg",0);    		
    	}
    	
    }
    
	function setPrntUsrRoleCd(aryPopupData, row, col, sheetIdx){
			var sheetObject=sheetObjects[0];
			sheetObject.SetCellValue(row,col,aryPopupData[0][3]);
   	}	
   	
    /**
     * event when clicking cell in IBSheet data part
     * @param {sheetObj} String :  IBSheet cell name
     * @param {Row} Long : cell Row Index
     * @param {Col} Long : cell Column Index
     * @param {Value} String : changed value
     * @param {CellX} Long : cell x-coordinate
     * @param {CellY} Long : cell y-coordinate
     * @param {CellW} Long : cell width
     * @param {CellH} Long : cell length
     */
   function sheet1_OnClick(sheetObj, Row, Col, Value, CellX, CellY, CellW, CellH) {
	   
	   var formObj=document.form;
	   var adminPageValue = document.getElementsByName("admin_page")[0].value;
	   
       if (sheetObj.ColSaveName(Col) == "lck_chk") {
           with(sheetObj) {
        	   if(adminPageValue == "Y"){
	        	   if(confirm("Do you want to reset?")){       		  		 
	        			         			 
			        	   formObj.f_cmd.value=MULTI;
			        	   makeNewPassword(sheetObj, Row); 
			        	   var returnVal = sheetObj.DoSave("ADM_SYS_0003GS.do", FormQueryString(formObj), -1, false);                
			               if(returnVal){
			        		  //sheetObj.SetCellValue(Row, "usr_old_pwd",sheetObj.GetCellValue(Row, "usr_pwd"));
			        		  sheetObj.SetCellValue(Row, "usr_lck_dt","");
			        		  sheetObj.SetCellValue(Row, "lck_chk",'0');
			        		  sheetObj.SetCellValue(Row, "usr_pwd_chg_flg",'N');
			        	  }
	        	   }else{
	        		   sheetObj.SetCellValue(Row, "lck_chk",'0'); 
	        	   }
        	   }else{
      			 var userName=document.getElementsByName("s_usr_id")[0].value;
    			 var sUrl="/opuscntr/PasswordChange.do?user_id=" + userName;
    			 var myWindow = window.open(sUrl, "PasswordChange", "width=805, height=500");
        	   }
           }
       }
   }
   