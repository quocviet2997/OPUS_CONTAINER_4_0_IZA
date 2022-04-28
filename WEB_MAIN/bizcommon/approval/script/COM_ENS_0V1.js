/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : COM_ENS_0V1.js
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2017.06.27
*@LastModifier : CLT
*@LastVersion : 1.0
* 2017.06.27
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class Error Message Management : Error Message Management 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
 */
function errormessagemanagement() {
	this.processButtonClick		= tprocessButtonClick;
	this.setSheetObject 		= setSheetObject;
	this.loadPage 				= loadPage;
	this.initSheet 				= initSheet;
	this.initControl            = initControl;
	this.doActionIBSheet 		= doActionIBSheet;
	this.validateForm 			= validateForm;
}

// 공통전역변수
var sheetObjects = new Array();
var sheetCnt = 0;

var TTL_STEP_LMT = 6;
var FST_STEP_LMT = 3;
var SCD_STEP_LMT = 3;

var time_out = false;

function chkTimeOut(){
   time_out = false;
}

// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick = processButtonClick;

// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
function processButtonClick() {
	var sheetObject=sheetObjects[1];
	var formObject=document.form;
	try {
		var srcName=ComGetEvent("name");
		switch(srcName) {
		case "btn_Search":    
			//selectSheetDept();
			if(!validateForm(formObject,IBSEARCH)) return false;
			var tempOfcCd = formObject.ofc_cd.value; // 화면 왼쪽 부분 search 와 오른쪽 부분 retrieve 의 ofc_cd 동일하게 사용하므로, 잠시 임수 변수에 저장하여 처리함.
			formObject.ofc_cd.value = formObject.s_ofc_cd.value;   
			doActionIBSheetUser(sheetObject,formObject,IBSEARCH);
			formObject.ofc_cd.value = tempOfcCd;
			break;
		case "btn_New":
			var sheetObjectDept = sheetObjects[0]
			var sheetObjectUser = sheetObjects[1];
			sheetObjectDept.RemoveAll();
			sheetObjectUser.RemoveAll();
			sheetObjects[2].RemoveAll();
			formObject.reset();   
			doActionIBSheetDept(sheetObjectDept, formObject, IBSEARCH);
			doActionIBSheetUser(sheetObjectUser,formObject,IBSEARCH);
			sheetObjectDept.ShowTreeLevel(2,1);
			break;
		case "btn_Retrieve":
			if(formObject.sub_sys_cd.value == "") {
				ComShowCodeMessage("COM12113", "Module");
				formObject.sub_sys_cd.focus();
				return;
			}
			if(formObject.ofc_cd.value == "" || formObject.ofc_cd.value.length != 5) {
				ComShowCodeMessage("COM12114", "Office");
				formObject.ofc_cd.focus();
				return;
			}
			doActionIBSheet(sheetObjects[2],formObject,IBSEARCH);
			break;
   	    case "btn_Save":
			if (time_out) {
				return false;
			}
   	    	if(formObject.sub_sys_cd.value == "") {
				ComShowCodeMessage("COM12113", "Module");
				formObject.sub_sys_cd.focus();
				return;
   	    	}
			if(formObject.ofc_cd.value == "" || !doActionIBSheet(sheetObjects[0], formObject, IBSEARCH_ASYNC01)) {
				ComShowCodeMessage("COM12114", "Office");
				return;
			}
			doActionIBSheet(sheetObjects[2],formObject,IBSAVE);
			
			time_out = true;
			window.setTimeout('chkTimeOut()',2000);
			
		break;
   	    case "btns_add":
   	    	var sheetObject1 = sheetObjects[1];
   	    	var row = sheetObject1.GetSelectRow();
   	    	if(row <= 0) {
				ComShowCodeMessage("COM12176");
				return;
   	    	}
   	    	sheetUser_OnDblClick(sheetObject1, row);
		break;
   	    case "btns_del":
   	    	var sheetObject2 = sheetObjects[2];
   	    	var row = sheetObject2.GetSelectRow();
   	    	if(row <= 0) {
				ComShowCodeMessage("COM12176");
				return;
   	    	}
   	    	sheet2_OnDblClick(sheetObject2, row);
   	    break;
   	    case "btns_up":
   	    	var sheetObject2 = sheetObjects[2];
   	    	var row = sheetObject2.GetSelectRow();
   	    	if(row <= 0) {
				//ComShowCodeMessage("COM12176");
				return false;
   	    	}
   	    	moveUpApprover(sheetObject2, row);
   	    break;
   	    case "btns_down":
   	    	var sheetObject2 = sheetObjects[2];
   	    	var row = sheetObject2.GetSelectRow();
   	    	if(row <= 0) {
				//ComShowCodeMessage("COM12176");
				return false;
   	    	}
   	    	moveDownApprover(sheetObject2, row);
   	    break;
        }
	}
   catch(e) {
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
   sheetObjects[sheetCnt++] = sheet_obj;
}

/**
 * body.onload 이벤트에서 호출되는 함수로 페이지 로드완료 후 선처리해야할 기능을 추가한다. <br>
 * HTML컨트롤의 각종 이벤트와 IBSheet, IBTab 등을 초기화 한다. <br>
 **/
function loadPage() {
	for(i=0;i<sheetObjects.length;i++){
		//khlee-시작 환경 설정 함수 이름 변경
		ComConfigSheet (sheetObjects[i]);
		initSheet(sheetObjects[i],i+1);
		//khlee-마지막 환경 설정 함수 추가
		ComEndConfigSheet(sheetObjects[i]);
	}
	 // 조직도 세팅
    resizeSheet();
    var sheetObjectDept=sheetObjects[0];
    var formObject=document.form;
    doActionIBSheetDept(sheetObjectDept, formObject, IBSEARCH);
  	initControl();
}

function initControl() {
 	var formObject=document.form;
     //Axon 이벤트 처리1. 이벤트catch(개발자변경)
     axon_event.addListenerFormat('keypress', 'keypressFormat', formObject);
     axon_event.addListener ('keyup', 'ofc_cd_keyup', 'ofc_cd');
     axon_event.addListener ('change', 'sub_sys_cd_change', 'sub_sys_cd');
     axon_event.addListenerForm();
 }

/**
 * 페이지에 있는 IBSheet Object를 초기화 한다. <br>
 * IBSheet가 여러개일 경우 개수만큼 case를 추가하여 IBSheet 초기화 모듈을 구성한다. <br>
 * {@link #loadPage}함수에서 이 함수를 호출하여 IBSheet Object를 초기화 한다. <br>
 * @param {ibsheet} sheetObj    IBSheet Object
 * @param {int}     sheetNo     sheetObjects 배열에서 순번
 **/
function initSheet(sheetObj,sheetNo) {
	var cnt=0;
    //sheetObj.UseUtf8 = true;
    switch(sheetNo) {
		case 1:     // Dept(조직도) 그리드 영역 초기화
			with(sheetObj) {
				var HeadTitle="Office" ;
				SetConfig({SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:0});
				var info    = {Sort:1, ColMove:1, HeaderCheck:1, ColResize:1};
				var headers = [{Text:HeadTitle, Align:"Center"}];
				InitHeaders(headers, info);
				
				var cols = [{Type:"Text", Hidden:0, Width:10, Align:"Left", ColMerge:0, SaveName:"ofc_cd", LevelSaveName:"sLevel", TreeCol:1, KeyField:0, CalcLogic:"", Format:"", PointCount:0, UpdateEdit:0, InsertEdit:0, TreeCol:1, LevelSaveName:"sLevel"}];
				
				InitColumns(cols);
				SetEditable(1);
				SetCountPosition(0);
				SetSheetHeight(370);
			}
			break;
        case 2:     // User 그리드 영역 초기화
        	with(sheetObj) {
        		var HeadTitle;
        		HeadTitle="|Seq|Office|User ID|Name" ;
        		var headCount=ComCountHeadTitle(HeadTitle);
        		SetConfig({SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:0});
        		var info = {Sort:1, ColMove:1, HeaderCheck:1, ColResize:1};
        		var headers = [{Text:HeadTitle, Align:"Center"}];
        		InitHeaders(headers, info);
        		
        		var cols = [{Type:"CheckBox", Hidden:1, Width:30,  Align:"Center", ColMerge:0, SaveName:"checkbox",  KeyField:0, CalcLogic:"", Format:"", PointCount:0, UpdateEdit:1, InsertEdit:1 },
        		            {Type:"Seq",      Hidden:0, Width:40,  Align:"Center", ColMerge:0, SaveName:"",          KeyField:0, CalcLogic:"", Format:"", PointCount:0, UpdateEdit:0, InsertEdit:0 },
        		            {Type:"Text",     Hidden:0, Width:70,  Align:"Center", ColMerge:0, SaveName:"ofc_cd",    KeyField:0, CalcLogic:"", Format:"", PointCount:0, UpdateEdit:0, InsertEdit:0 },
        		            {Type:"Text",     Hidden:0, Width:70,  Align:"Left",   ColMerge:0, SaveName:"usr_id",    KeyField:0, CalcLogic:"", Format:"", PointCount:0, UpdateEdit:0, InsertEdit:0 },
        		            {Type:"Text",     Hidden:0, Width:100, Align:"Left",   ColMerge:0, SaveName:"usr_nm",    KeyField:0, CalcLogic:"", Format:"", PointCount:0, UpdateEdit:0, InsertEdit:0 },
        		            {Type:"Text",     Hidden:1, Width:100, Align:"Left",   ColMerge:0, SaveName:"jb_eng_nm", KeyField:0, CalcLogic:"", Format:"", PointCount:0, UpdateEdit:0, InsertEdit:0 }
        		           ];
        		
        		InitColumns(cols);
        		SetEditable(1);
        		SetSheetHeight(370);
        	}
            break;
        case 3:
        	with(sheetObj) {
        		var HeadTitle;
        		HeadTitle="|||Seq|Apro\nStep|Office|User ID|Name|Job Title" ;
        		var headCount=ComCountHeadTitle(HeadTitle);
        		SetConfig({SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:0});
        		var info = {Sort:1, ColMove:1, HeaderCheck:1, ColResize:1};
        		var headers = [{Text:HeadTitle, Align:"Center"}];
        		InitHeaders(headers, info);
        		var cols = [{Type:"Status",   Hidden:1, Width:30,  Align:"Center", ColMerge:0, SaveName:"ibflag"},
        		            {Type:"Radio",    Hidden:1, Width:30,  Align:"Center", ColMerge:0, SaveName:"radio",              KeyField:0, CalcLogic:"", Format:"", PointCount:0, UpdateEdit:1, InsertEdit:1},
        		            {Type:"CheckBox", Hidden:1, Width:30,  Align:"Center", ColMerge:0, SaveName:"checkbox",           KeyField:0, CalcLogic:"", Format:"", PointCount:0, UpdateEdit:1, InsertEdit:1},
        		            {Type:"Text",     Hidden:0, Width:40,  Align:"Center", ColMerge:0, SaveName:"dp_seq",             KeyField:0, CalcLogic:"", Format:"", PointCount:0, UpdateEdit:0, InsertEdit:0},
        		            {Type:"Combo",    Hidden:0, Width:50,  Align:"Center", ColMerge:0, SaveName:"apro_seq",           KeyField:0, CalcLogic:"", Format:"", PointCount:0, UpdateEdit:1, InsertEdit:1},
        		            {Type:"Text",     Hidden:0, Width:70,  Align:"Center", ColMerge:0, SaveName:"apro_ofc_cd",        KeyField:0, CalcLogic:"", Format:"", PointCount:0, UpdateEdit:0, InsertEdit:0},
        		            {Type:"Text",     Hidden:0, Width:70,  Align:"Left",   ColMerge:0, SaveName:"apro_usr_id",        KeyField:0, CalcLogic:"", Format:"", PointCount:0, UpdateEdit:0, InsertEdit:0},
        		            {Type:"Text",     Hidden:0, Width:190, Align:"Left",   ColMerge:0, SaveName:"apro_usr_nm",        KeyField:0, CalcLogic:"", Format:"", PointCount:0, UpdateEdit:0, InsertEdit:0},
        		            {Type:"Text",     Hidden:0, Width:200, Align:"Left",   ColMerge:0, SaveName:"apro_usr_jb_tit_nm", KeyField:0, CalcLogic:"", Format:"", PointCount:0, UpdateEdit:0, InsertEdit:0}];
                         
        		InitColumns(cols);
		        SetEditable(1);
		        SetSheetHeight(370);
		        SetSheetWidth(600);
		        SetColProperty("apro_seq", {ComboText:"1st|2nd", ComboCode:"1|2"} );
        	}
        	break;
    }
}

/* Sheet관련 프로세스 처리 */
function doActionIBSheetUser(sheetObj, formObj, sAction, PageNo) {
	sheetObj.ShowDebugMsg(false);
	switch(sAction) {
	case IBSEARCH:        //조회
		formObj.f_cmd.value=SEARCH;
		selectVal=FormQueryString(formObj);
		sheetObj.DoSearch("COM_ENS_091GS.do", selectVal);
		break;
	case IBSEARCHAPPEND:  // 페이징 조회  
		formObj.f_cmd.value=SEARCHLIST;  
		sheetObj.DoSearch("COM_ENS_091GS.do", selectVal+"&"+ "iPage=" + PageNo,{Append:true} );
	break;
	}
}
 
/* 조직도 세팅 */
function doActionIBSheetDept(sheetObj, formObj, sAction, PageNo) {
	sheetObj.ShowDebugMsg(false);
	switch(sAction) {
		case IBSEARCH:        //조회
			formObj.f_cmd.value=SEARCH01;
			selectVal=FormQueryString(formObj)
			sheetObj.DoSearch("COM_ENS_091GSDept.do", selectVal);
		break;
	}
}

/* Sheet관련 프로세스 처리 */
function doActionIBSheet(sheetObj,formObj,sAction) {
	switch(sAction) {
		case IBSAVE:        //저장
		    var fst_step_knt = 0;
		    var scd_step_knt = 0;
		    var ttl_step_knt = 0;
	        for (var i=0; i<sheetObj.RowCount(); i++) {
	            if (sheetObj.GetCellValue(i + 1, "apro_seq") == 1) {
	            	fst_step_knt++;
	            } else if (sheetObj.GetCellValue(i + 1, "apro_seq") == 2) {
	            	scd_step_knt++;
	            }
	            ttl_step_knt++;
	        }
			if (ttl_step_knt > 0 && fst_step_knt == 0) {
				ComShowMessage("At least one user must be added as 1st approver.");
				return false;
			}
			if (fst_step_knt > FST_STEP_LMT) {
				ComShowMessage(FST_STEP_LMT+" users can be added as 1st approver.");
				return false;
			}
			if (scd_step_knt > SCD_STEP_LMT) {
				ComShowMessage(SCD_STEP_LMT+" users can be added as 2nd approver.");
				return false;
			}
			if (ttl_step_knt > TTL_STEP_LMT) {
				ComShowMessage(TTL_STEP_LMT+" users can be added in total.");
				return false;
			}

			
			/** BEGIN - incompletely approved csr inquiry **/
//			formObj.incl_incmpl_apro_csr_yn.value = 'N';
//			formObj.f_cmd.value = SEARCH05;
//			var sXml = sheetObj.GetSearchData("COM_ENS_0V1GS2.do", FormQueryString(formObj));
//	        var v_unapro_csr = ComGetEtcData(sXml,"unapro_csr");
//	        if (v_unapro_csr != null && v_unapro_csr != '' && v_unapro_csr != undefined) {
//	        	var i_unapro_csr = parseInt(v_unapro_csr,10);
//	        	if (i_unapro_csr > 0) {
//	        		if (ComShowConfirm('There ' + (i_unapro_csr==1?'is an':'are') + ' incompletely approved CSR' + (i_unapro_csr==1?'':'s') + ' by 2nd approval step.'
//	        							+ '\nIf you still want to change approver, please click \'OK\' button. The status will be changed to \"Requested\".')) 
//	        		{
//	        			formObj.incl_incmpl_apro_csr_yn.value = 'Y';
//	        		} else {
//	        			formObj.incl_incmpl_apro_csr_yn.value = 'N';
//	        		}
//	        	}
//	        }
	        /** END - incompletely approved csr inquiry **/
	        
			
			// 모두 재입력을 원칙으로 함
			for(var i=0; i<sheetObj.RowCount(); i++) {
                sheetObj.SetCellValue(i + 1, "ibflag", "I");
            }
			formObj.f_cmd.value = MULTI; 
			var SaveStr = sheetObj.GetSaveString();
			var sXml = sheetObj.GetSaveData("COM_ENS_0T1GSRoute.do", SaveStr + "&" + FormQueryString(formObj));
			sheetObj.LoadSaveData(sXml);
			
		break;
        case IBSEARCH:      //조회
        	formObj.f_cmd.value = SEARCH03;
        	sheetObj.DoSearch("COM_ENS_0V1GS2.do", FormQueryString(formObj));
        break;
        case IBSEARCH_ASYNC01:
        	formObj.f_cmd.value = SEARCH04;
        	var sXml=sheetObj.GetSearchData("COM_ENS_0V1GS2.do", FormQueryString(formObj)+"&ofc_cd="+formObj.ofc_cd.value);
			var sCnt=ComGetEtcData(sXml,"count");
			if(sCnt=='0') {
				formObj.ofc_cd.value = "";
				formObj.ofc_cd.focus();
				return false;
			}
        break;
     }
	return true;
}

function sheetUser_OnDblClick(sheetObj, row, col, value) {
	var sheetObject1 = sheetObjects[1];
    var sheetObject2;
    sheetObject2 = sheetObjects[2];
    var selrow = sheetObject1.GetSelectRow();
    if (selrow > 0) {
    	var usr_id = sheetObject1.GetCellValue(selrow, "usr_id");
        var usr_nm = sheetObject1.GetCellValue(selrow, "usr_nm");
        var jb_eng_nm = sheetObject1.GetCellValue(selrow, "jb_eng_nm");
        var ofc_cd = sheetObject1.GetCellValue(selrow, "ofc_cd");
        
        // Duplication(중복) 체크
        for(var i=0; i<sheetObject2.RowCount(); i++) {
            if(sheetObject2.GetCellValue(i + 1, "apro_usr_id") == usr_id) {
            	ComShowMessage(usr_id + " is already added");
                return;
            } else continue;
        }
		if(sheetObject2.RowCount() >= TTL_STEP_LMT) {
			ComShowMessage(TTL_STEP_LMT+" users can be added in total.");
			return;
		}
        // 대상 Sheet로 데이타 이행
        row = sheetObject2.DataInsert(-1);
		sheetObject2.SetCellValue(row, "apro_usr_nm", usr_nm);
		sheetObject2.SetCellValue(row, "apro_usr_jb_tit_nm", jb_eng_nm);
		sheetObject2.SetCellValue(row, "apro_ofc_cd", ofc_cd);            			
		sheetObject2.SetCellValue(row, "apro_usr_id",  usr_id);
		var rowCount = sheetObject2.RowCount();
    	for (var i=0 ; i<rowCount; i++){
    		sheetObject2.SetCellValue(i+1,"dp_seq", i+1);
    		//sheetObject2.SetCellValue(i+1,"apro_seq", i+1) ;
    	}
    	sheetObject2.SetCellValue(row,"apro_seq", 1);
    }
}

function sheetDept_OnSearchEnd() {
	var formObject = document.form;
	var level = 0;
	var selRow = 1;
	with(sheetDept) {
		for(var row=1;row<=RowCount();row++) {
			if(GetCellValue(row, "ofc_cd") == formObject.s_ofc_cd.value) {
				level = GetRowLevel(row);
				selRow = row;
				break;
			}
		}
		ShowTreeLevel(0, 1);
		SetSelectRow(selRow);
		if(GetCellValue(selRow, "ofc_cd") != formObject.s_ofc_cd.value) {
			formObject.s_ofc_cd.value = GetCellValue(selRow, "ofc_cd");
		}
	}
    var sheetObjectUser=sheetObjects[1];
  	var tempOfcCd = formObject.ofc_cd.value;
	formObject.ofc_cd.value = formObject.s_ofc_cd.value;   
	doActionIBSheetUser(sheetObjectUser, formObject, IBSEARCH);
	formObject.ofc_cd.value = tempOfcCd;
}

function sheetUser_OnSearchEnd() {
	var formObject = document.form;
	formObject.ofc_cd.focus();
}
/*function selectSheetDept() {
	var formObject = document.form;
	var level = 0;
	var selRow = 1;
	with(sheetDept) {
		for(var row=1;row<=RowCount();row++) {
			if(GetCellValue(row, "ofc_cd") == formObject.s_ofc_cd.value) {
				level = GetRowLevel(row);
				selRow = row;
				break;
			}
		}
		ShowTreeLevel(level, 1);
		SetSelectRow(selRow);
	}
}*/

function validateForm(formObj,sAction) {
	if(sAction == IBSEARCH) {
		if(formObj.user_cd.value == "" && formObj.user_nm.value == "") {
			ComShowCodeMessage("COM12138", "User Id", "User Name");
			return false;
		}
	}
	return true;
}

function sheet2_OnDblClick(sheetObj, row, col, value) {
    var sheetObject = sheetObjects[2];
    var selrow = sheetObject.GetSelectRow();
    if (selrow > 0) {
    	if (sheetObj.ColSaveName(col) != "apro_seq") {
        	sheetObject.RowDelete(selrow);
        	var rowCount = sheetObject.RowCount();
        	for (var i=0 ; i<rowCount; i++){
        		sheetObject.SetCellValue(i + 1,"dp_seq", i + 1) ; 
        	}
    	}
    }
}

function sheetDept_OnClick(sheetObj, row, col, value) {
	var formObject=document.form;
	var tempOfcCd = formObject.ofc_cd.value;
	formObject.s_ofc_cd.value=sheetObj.GetCellValue(sheetObj.GetSelectRow(), 'ofc_cd');
	formObject.ofc_cd.value = formObject.s_ofc_cd.value;
	doActionIBSheetUser(sheetObjects[1], document.form, IBSEARCH);
	formObject.ofc_cd.value = tempOfcCd;
}

function resizeSheet() {
    for (i=0; i<sheetObjects.length; i++) {
        ComResizeSheet(sheetObjects[i]);
    }
}

function ofc_cd_keyup() {
	var formObject=document.form;
	sheetObjects[2].RemoveAll();
	if(formObject.ofc_cd.value.length == 5) {
		// office 정합성 check
		if(!doActionIBSheet(sheetObjects[0], formObject, IBSEARCH_ASYNC01)) {
			ComShowCodeMessage("COM12114", "Office Code");
		} else {
			if(formObject.sub_sys_cd.value != "") {
				doActionIBSheet(sheetObjects[2],formObject,IBSEARCH);
			}
		}
	}
}

function sub_sys_cd_change() {
	var formObject=document.form;
	sheetObjects[2].RemoveAll();
	if(formObject.ofc_cd.value.length == 5) {
		doActionIBSheet(sheetObjects[2],formObject,IBSEARCH);
	}
}

function moveUpApprover(sheetObject, selrow){
//	alert(selrow + ' - ' + sheetObject.RowCount());
    if (selrow > 0) {
    	if (sheetObject.GetCellValue(selrow, sheetObject.ColSaveName(3))==1) {
    		//ComShowMessage('최상단입니다.');
    	} else {
        	var temp1 = sheetObject.GetCellValue(selrow-1, sheetObject.ColSaveName(4));
        	var temp2 = sheetObject.GetCellValue(selrow-1, sheetObject.ColSaveName(5));            			
        	var temp3 = sheetObject.GetCellValue(selrow-1, sheetObject.ColSaveName(6)); 
        	var temp4 = sheetObject.GetCellValue(selrow-1, sheetObject.ColSaveName(7));
        	var temp5 = sheetObject.GetCellValue(selrow-1, sheetObject.ColSaveName(8));
        	
        	sheetObject.SetCellValue(selrow-1, sheetObject.ColSaveName(4), sheetObject.GetCellValue(selrow, sheetObject.ColSaveName(4)));
        	sheetObject.SetCellValue(selrow-1, sheetObject.ColSaveName(5), sheetObject.GetCellValue(selrow, sheetObject.ColSaveName(5)));
        	sheetObject.SetCellValue(selrow-1, sheetObject.ColSaveName(6), sheetObject.GetCellValue(selrow, sheetObject.ColSaveName(6)));
        	sheetObject.SetCellValue(selrow-1, sheetObject.ColSaveName(7), sheetObject.GetCellValue(selrow, sheetObject.ColSaveName(7)));
        	sheetObject.SetCellValue(selrow-1, sheetObject.ColSaveName(8), sheetObject.GetCellValue(selrow, sheetObject.ColSaveName(8)));
        	
        	sheetObject.SetCellValue(selrow, sheetObject.ColSaveName(4), temp1);
        	sheetObject.SetCellValue(selrow, sheetObject.ColSaveName(5), temp2);
        	sheetObject.SetCellValue(selrow, sheetObject.ColSaveName(6), temp3);
        	sheetObject.SetCellValue(selrow, sheetObject.ColSaveName(7), temp4);
        	sheetObject.SetCellValue(selrow, sheetObject.ColSaveName(8), temp5);
        	
        	sheetObject.SelectCell(selrow-1, 0);
        	
        	for (var i=0; i<sheetObject.RowCount(); i++){
        		sheetObject.SetCellValue(i+1,"dp_seq", i+1);
        	}    	
    	}
    }
}

function moveDownApprover(sheetObject, selrow){
//	alert(selrow + ' - ' + sheetObject.RowCount());
    if (selrow > 0) {
    	if (sheetObject.GetCellValue(selrow, sheetObject.ColSaveName(3))==sheetObject.RowCount()) {
    		//ComShowMessage('최하단입니다.');
    	} else {
        	var temp1 = sheetObject.GetCellValue(selrow+1, sheetObject.ColSaveName(4));
        	var temp2 = sheetObject.GetCellValue(selrow+1, sheetObject.ColSaveName(5));            			
        	var temp3 = sheetObject.GetCellValue(selrow+1, sheetObject.ColSaveName(6)); 
        	var temp4 = sheetObject.GetCellValue(selrow+1, sheetObject.ColSaveName(7));
        	var temp5 = sheetObject.GetCellValue(selrow+1, sheetObject.ColSaveName(8));
        	
        	sheetObject.SetCellValue(selrow+1, sheetObject.ColSaveName(4), sheetObject.GetCellValue(selrow, sheetObject.ColSaveName(4)));
        	sheetObject.SetCellValue(selrow+1, sheetObject.ColSaveName(5), sheetObject.GetCellValue(selrow, sheetObject.ColSaveName(5)));
        	sheetObject.SetCellValue(selrow+1, sheetObject.ColSaveName(6), sheetObject.GetCellValue(selrow, sheetObject.ColSaveName(6)));
        	sheetObject.SetCellValue(selrow+1, sheetObject.ColSaveName(7), sheetObject.GetCellValue(selrow, sheetObject.ColSaveName(7)));
        	sheetObject.SetCellValue(selrow+1, sheetObject.ColSaveName(8), sheetObject.GetCellValue(selrow, sheetObject.ColSaveName(8)));
        	
        	sheetObject.SetCellValue(selrow, sheetObject.ColSaveName(4), temp1);
        	sheetObject.SetCellValue(selrow, sheetObject.ColSaveName(5), temp2);
        	sheetObject.SetCellValue(selrow, sheetObject.ColSaveName(6), temp3);
        	sheetObject.SetCellValue(selrow, sheetObject.ColSaveName(7), temp4);
        	sheetObject.SetCellValue(selrow, sheetObject.ColSaveName(8), temp5);
        	
        	sheetObject.SelectCell(selrow+1, 0);
        	
        	for (var i=0; i<sheetObject.RowCount(); i++){
        		sheetObject.SetCellValue(i+1,"dp_seq", i+1);
        	}         	
    	}
    }
}



