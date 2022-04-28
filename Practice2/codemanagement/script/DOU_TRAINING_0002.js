/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : DOU_TRAINING_0002.js
*@FileTitle : Practice 02
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.21
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.21 
* 1.0 Creation
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/

/*------------------다음 코드는 JSDoc을 잘 만들기 위해서 추가된 코드임 ------------------*/
   /**
     * @fileoverview 업무에서 공통으로 사용하는 자바스크립트파일로 달력 관련 함수가 정의되어 있다.
     * @author 한진해운
     */

    /**
     * @extends 
     * @class DOU_TRAINING_0002 : DOU_TRAINING_0002 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
     */

var sheetObjects = new Array();
var sheetCnt = 0;
var saveCounter = 0;

document.onclick = processButtonClick;

//Functions that calls a common function that sets the default settings of the sheet.
//It is the first called area when fire jsp onload event
function loadPage(){
	for(i=0; i<sheetObjects.length; i++){
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i+1);
		ComEndConfigSheet(sheetObjects[i]);
	}
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}

//Functions for branching to the corresponding logic when a button on the screen is pressed
function processButtonClick(){
	var formObject = document.form;

	try{
		// Get name or id of object where the event appears
		var srcName = ComGetEvent("name");
		switch(srcName){
			case "btn_Retrieve":
				doActionIBSheet(sheetObjects[0], formObject, IBSEARCH);
				sheetObjects[1].RemoveAll();
				break;
			case "btn_Save":
				doActionIBSheet(sheetObjects[1], formObject, IBSAVE);
				doActionIBSheet(sheetObjects[0], formObject, IBSAVE);
				if(saveCounter < 0)
					ComShowCodeMessage("SAV00000");
				saveCounter = 0;
				break;
			case "btn_DownExcel":
				doActionIBSheet(sheetObjects[0], formObject, IBDOWNEXCEL);
				break;
			case "btn_Add_Mst":
				doActionIBSheet(sheetObjects[0], formObject, IBINSERT);
				break;
			case "btn_Add_Dtl":
				doActionIBSheet(sheetObjects[1], formObject, IBINSERT);
				break;
			default:
				break;
		}
	}
	catch(e) {
		if(e == "[object Error]") {
			ComShowMessage(OBJECT_ERROR);
		} else {
			ComShowMessage(e);
		}
	}
}

//Put sheet objects in global variable "sheetObjects"
function setSheetObject(sheet_obj){
	sheetObjects[sheetCnt++] = sheet_obj;
}

//Functions that define the basic properties of the sheet on the screen, for example Column information, sheet basic attributes, etc.
function initSheet(sheetObj, sheetNo){
	with(sheetObj){
		switch(sheetNo){
		case 1:
			SetConfig( {SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:0});		
			var headTitle1 ="|Del|SubSystem|Cd ID|Cd Name|Length|Cd Type|Table Name| Description Remark| Flag| Create User| Create Date| Update User| Update Date";
			var headers1 = [{Text:headTitle1, Align:"Center"}];
			var info1 ={Sort:1, ColMove:1, ColResize:1, HeaderCheck:0};
			InitHeaders(headers1, info1);
			var cols1 = [{Type:"Status", Hidden:1, Width:30, Align:"Center", ColMerge:0, SaveName:"ibflag"},
						 {Type:"DelCheck", Hidden:0, Width:50, Align:"Center", ColMerge:0, SaveName:"del", KeyField:0, UpdateEdit:1, InsertEdit:1},
						 {Type:"Text", Hidden:0, Width:80, Align:"Left", ColMerge:0, SaveName:"ownr_sub_sys_cd", KeyField:0, UpdateEdit:1, InsertEdit:1},
						 {Type:"Text", Hidden:0, Width:80, Align:"Center", ColMerge:0, SaveName:"intg_cd_id", KeyField:1, UpdateEdit:0, InsertEdit:1},
						 {Type:"Text", Hidden:0, Width:200, Align:"Left", ColMerge:0, SaveName:"intg_cd_nm", KeyField:0, UpdateEdit:1, InsertEdit:1},
						 {Type:"Text", Hidden:0, Width:50, Align:"Left", ColMerge:0, SaveName:"intg_cd_len", KeyField:0, UpdateEdit:1, InsertEdit:1},
						 {Type:"Text", Hidden:0, Width:500, Align:"Left", ColMerge:0, SaveName:"intg_cd_tp_cd", KeyField:0, UpdateEdit:1, InsertEdit:1},
						 {Type:"Text", Hidden:0, Width:200, Align:"Left", ColMerge:0, SaveName:"mng_tbl_nm", KeyField:0, UpdateEdit:1, InsertEdit:1},
						 {Type:"Text", Hidden:0, Width:500, Align:"Left", ColMerge:0, SaveName:"intg_cd_desc", KeyField:0, UpdateEdit:1, InsertEdit:1},
						 {Type:"Float", Hidden:0, Width:50, Align:"Left", ColMerge:0, SaveName:"intg_cd_use_flg", KeyField:0, UpdateEdit:1, InsertEdit:1},
						 {Type:"Text", Hidden:0, Width:100, Align:"Left", ColMerge:0, SaveName:"cre_usr_id", KeyField:0, UpdateEdit:1, InsertEdit:1},
						 {Type:"Date", Hidden:0, Width:100, Align:"Left", ColMerge:0, SaveName:"cre_dt", KeyField:0, UpdateEdit:1, InsertEdit:1},
						 {Type:"Text", Hidden:0, Width:100, Align:"Left", ColMerge:0, SaveName:"upd_usr_id", KeyField:0, UpdateEdit:1, InsertEdit:1},
						 {Type:"Date", Hidden:0, Width:100, Align:"Left", ColMerge:0, SaveName:"upd_dt", KeyField:0, UpdateEdit:1, InsertEdit:1}];
			InitColumns(cols1);
			SetWaitImageVisible(0);
			SetSheetHeight(500);	
			break;
		case 2:
			SetConfig( {SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:0});		
			var headTitle2 ="|Del|Cd Val|Display Name|Description Remark|Order";
			var headers2 = [{Text:headTitle2, Align:"Center"}];
			var info2 ={Sort:1, ColMove:1, ColResize:1, HeaderCheck:0};
			InitHeaders(headers2, info2);
			var cols2 = [{Type:"Status", Hidden:1, Width:30, Align:"Center", ColMerge:0, SaveName:"ibflag"},
			            {Type:"DelCheck", Hidden:0, Width:50, Align:"Center", ColMerge:0, SaveName:"del", KeyField:0, UpdateEdit:1, InsertEdit:1},
						{Type:"Text", Hidden:0, Width:100, Align:"Left", ColMerge:0, SaveName:"intg_cd_val_ctnt", KeyField:1, UpdateEdit:0},
						{Type:"Text", Hidden:0, Width:300, Align:"Center", ColMerge:0, SaveName:"intg_cd_val_dp_desc", KeyField:0, UpdateEdit:0},
						{Type:"Text", Hidden:0, Width:800, Align:"Left", ColMerge:0, SaveName:"intg_cd_val_desc", KeyField:0, UpdateEdit:0},
						{Type:"Text", Hidden:0, Width:600, Align:"Left", ColMerge:0, SaveName:"intg_cd_val_dp_seq", KeyField:0, UpdateEdit:0}];
			InitColumns(cols2);
			SetWaitImageVisible(0);
			ComResizeSheet(sheetObjects[1]);
			break;
		}
	}
}

//Functions that define transaction logic between UI and server
function doActionIBSheet(sheetObj, formObj, sAction){
	with(sheetObj)
	{
		switch(sAction) {
			case IBSEARCH:
				if(sheetObj.id == "sheet1"){
					formObj.f_cmd.value = SEARCH01;
					DoSearch("DOU_TRAINING_0002GS.do", FormQueryString(formObj));
				}
				if(sheetObj.id == "sheet2"){
					formObj.f_cmd.value = SEARCH02;
					DoSearch("DOU_TRAINING_0002GS.do", FormQueryString(formObj));
				}
				break;
			case IBSAVE:
				var temp_cmd = -1;
				switch(sheetObj.id){
				case 'sheet1':
					temp_cmd = MULTI01;
					break;
				case 'sheet2':
					temp_cmd = MULTI02;
					break;
				}
				if(GetSaveString() != ''){
					formObj.f_cmd.value = temp_cmd;
					DoSave("DOU_TRAINING_0002GS.do", FormQueryString(formObj));
					saveCounter += 1;
				}
				else {
					saveCounter -= 1;
				}
				break;
			case IBDOWNEXCEL:
				if(RowCount() < 1){
					ComShowCodeMessage("EXL00001");
					break;
				}
				Down2Excel({FileName:"Code_Management", SheetName:"Sheet1", SheetDesign:1, DownCols: makeHiddenSkipCol(sheetObj)});
				break;
			case IBINSERT:
				DataInsert();
				break;
		}
	}
}

function sheet1_OnDblClick(Row, Col, CellX, CellY, CellW, CellH){
	document.form.cd_id.value = sheetObjects[0].GetCellValue(Col, 3);
	doActionIBSheet(sheetObjects[1], document.form, IBSEARCH);
}

function sheet1_OnBeforeSave(Code, Msg, StCode, StMsg) {
	// To show the search result on grid.
	ComOpenWait(true);
}

function sheet1_OnSaveEnd(Code, Msg, StCode, StMsg) {
	// To show the search result on grid.
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
	if(Msg>=0){
		ComShowCodeMessage("SAV00001");
	}
}

function sheet1_OnBeforeSearch(Code, Msg, StCode, StMsg) {
	// To show the search result on grid.
	ComOpenWait(true);
}

function sheet1_OnSearchEnd(Code, Msg, StCode, StMsg) {
	// ComOpenWait:configure whether a loading image will appears and lock the screen
		// true: lock the screen.
		// false: return normal.
	ComOpenWait(false);
}

function sheet2_OnBeforeSave(Code, Msg, StCode, StMsg) {
	// To show the search result on grid.
	ComOpenWait(true);
}

function sheet2_OnSaveEnd(Code, Msg, StCode, StMsg) {
	// To show the search result on grid.
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
	if(Msg>=0){
		ComShowCodeMessage("SAV00001");
	}
}

function sheet2_OnBeforeSearch(Code, Msg, StCode, StMsg) {
	// To show the search result on grid.
	ComOpenWait(true);
}

function sheet2_OnSearchEnd(Code, Msg, StCode, StMsg) {
	// ComOpenWait:configure whether a loading image will appears and lock the screen
		// true: lock the screen.
		// false: return normal.
	ComOpenWait(false);
}


function DOU_TRAINING_0002() {
	this.processButtonClick		= tprocessButtonClick;
	this.setSheetObject 		= setSheetObject;
	this.loadPage 				= loadPage;
	this.initSheet 				= initSheet;
	this.initControl            = initControl;
	this.doActionIBSheet 		= doActionIBSheet;
	this.setTabObject 			= setTabObject;
	this.validateForm 			= validateForm;
}

/* 개발자 작업	*/


/* 개발자 작업  끝 */