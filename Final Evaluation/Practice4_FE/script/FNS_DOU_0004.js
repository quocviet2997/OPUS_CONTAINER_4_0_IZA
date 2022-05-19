/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : DOU_TRAINING_0004.js
*@FileTitle : Carrier List
*Open Issues :
*Change history :
*@LastModifyDate : 2022.05.19
*@LastModifier : Viet Tran
*@LastVersion : 1.0
* 2022.03.23 
* 1.0 Creation
=========================================================*/

var sheetObjects = new Array();
var sheetCnt = 0;
var comboObjects = new Array();
var comboCnt = 0;
document.onclick = processButtonClick;

var IBNEW = 13;
var flagVendorKeyAccess = true;


/**
 * Function that calls a common function that sets the default settings of the sheet.<br>
 * It is the first called area when fire jsp onload event
 */
function loadPage(){
	for(i=0; i<sheetObjects.length; i++){
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i+1);
		ComEndConfigSheet(sheetObjects[i]);
		doActionIBSheet(sheetObjects[i], document.form, IBSEARCH);
	}
	
	for(i=0; i<comboObjects.length; i++){
		initCombo(comboObjects[i], i+1);
	}

	initControl();
}

/**
 * Functions that define the basic properties of the form on the screen.<br>
 * It is the place defining events on form.
 */
function initControl(){
	document.getElementById('s_vndr_seq').addEventListener('blur', function() {vendorCodeValidate(this.value);});
	document.getElementById('s_vndr_seq').addEventListener('keypress', function() {ComKeyOnlyNumber(this);});
	document.getElementById('s_cre_dt_fm').addEventListener('blur', function() {dateValidate(this);});
	document.getElementById('s_cre_dt_fm').addEventListener('keypress', function() {ComKeyOnlyNumber(this);});
	document.getElementById('s_cre_dt_to').addEventListener('blur', function() {dateValidate(this);});
	document.getElementById('s_cre_dt_to').addEventListener('keypress', function() {ComKeyOnlyNumber(this);});
}

/**
 * Function for branching to the corresponding logic when a button on the screen is pressed.<br>
 */
function processButtonClick(){
	var sheetObject1 = sheetObjects[0];
	var formObject = document.form;

	try{
		var srcName = ComGetEvent("name");
		var cal=new ComCalendar();
		switch(srcName){
			case "btn_Retrieve":
				doActionIBSheet(sheetObject1, formObject, IBSEARCH);
				break;
			case "btn_New":
				doActionIBSheet(sheetObject1, formObject, IBNEW);
				break;
			case "btn_Save":
				doActionIBSheet(sheetObject1, formObject, IBSAVE);
				break;
			case "btn_DownExcel":
				doActionIBSheet(sheetObject1, formObject, IBDOWNEXCEL);
				break;
			case "btn_Add":
				doActionIBSheet(sheetObject1, formObject, IBINSERT);
				break;
			case "btn_Del":
				doActionIBSheet(sheetObject1, formObject, IBDELETE);
				break;
			case "btn_calendar_fm":
				cal.select(formObject.s_cre_dt_fm, 'yyyy-MM-dd');
				break;
			case "btn_calendar_to":
                cal.select(formObject.s_cre_dt_to, 'yyyy-MM-dd');
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

/**
 * Put sheet objects in global variable "sheetObjects".<br>
 * @param sheetObj		(ibsheet) 		IBSheet Object
 */
function setSheetObject(sheet_obj){
	switch(sheet_obj.id){
		case "sheet1":
			sheetObjects[0] = sheet_obj;
			sheetCnt++;
			break;
		default:
			//sheetObjects[sheetCnt++] = sheet_obj;
			break;
	}
}

/**
 * Put ibmulticombo objects in global variable "comboObjects".<br>
 * @param combo_obj		(ibmulticombo)		IBMultiCombo Object
 */
function setComboObject(combo_obj) {
	switch(combo_obj.options.id){
		case "s_jo_crr_cd":
			comboObjects[0] = combo_obj;
			comboCnt++;
			break;
		default:
//			comboObjects[comboCnt++] = combo_obj;
			break;
	}
}

/**
 * Functions that define the basic properties of the sheet on the screen, for example Column information, sheet basic attributes, etc.<br>
 * @param sheetObj		(ibsheet)		IBSheet Object
 * @param sheetNo		(int)			Number of IBSheet Object
 */
function initSheet(sheetObj, sheetNo){
	with(sheetObj){
		switch(sheetObj.id){
			case "sheet1":
				SetConfig( {SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:0});
				
				var headTitle ="|Chk|Carrier|Rev.Lane|Vendor Code|Customer Code|Customer Code|Trade|Delete Flag|Create Date|Create User ID|Update Date|Update User ID";
				var headers = [{Text:headTitle, Align:"Center"}];
				var info ={Sort:1, ColMove:1, ColResize:1, HeaderCheck:0};
				
				InitHeaders(headers, info);
				
				var cols = [{Type:"Status", 	Hidden:1, 	Width:30, 	Align:"Center", ColMerge:0, SaveName:"ibflag"},
							{Type:"DelCheck", 	Hidden:0, 	Width:30, 	Align:"Center", ColMerge:0, SaveName:"del_check", 	KeyField:0},
							{Type:"Text", 		Hidden:0, 	Width:100, 	Align:"Center", ColMerge:0, SaveName:"jo_crr_cd", 	KeyField:1, UpdateEdit:0, InsertEdit:1, EditLen:3},
				            {Type:"Combo", 		Hidden:0, 	Width:100, 	Align:"Center", ColMerge:0, SaveName:"rlane_cd", 	KeyField:1, UpdateEdit:0, InsertEdit:1, EditLen:5, 	ComboText: rLaneCombo, 	ComboCode: rLaneCombo}, 
							{Type:"Float", 		Hidden:0, 	Width:100, 	Align:"Center", ColMerge:0, SaveName:"vndr_seq", 	KeyField:1, UpdateEdit:1, InsertEdit:1, EditLen:6},
							{Type:"Text", 		Hidden:0, 	Width:50, 	Align:"Center", ColMerge:0, SaveName:"cust_cnt_cd", KeyField:1, UpdateEdit:1, InsertEdit:1, EditLen:2},
							{Type:"Float", 		Hidden:0, 	Width:100, 	Align:"Center", ColMerge:0, SaveName:"cust_seq", 	KeyField:1, UpdateEdit:1, InsertEdit:1, EditLen:6},
							{Type:"Text", 		Hidden:0, 	Width:100, 	Align:"Center", ColMerge:0, SaveName:"trd_cd", 		KeyField:0, UpdateEdit:1, InsertEdit:1, EditLen:3},
							{Type:"Combo", 		Hidden:0, 	Width:80, 	Align:"Center", ColMerge:0, SaveName:"delt_flg", 	KeyField:0, UpdateEdit:1, InsertEdit:1,				ComboText : "N|Y", 		ComboCode : "N|Y"},
							{Type:"Text", 		Hidden:0, 	Width:300, 	Align:"Center", ColMerge:0, SaveName:"cre_dt", 		KeyField:0, UpdateEdit:0, InsertEdit:0},
							{Type:"Text",		Hidden:0, 	Width:300, 	Align:"Center", ColMerge:0, SaveName:"cre_usr_id", 	KeyField:0, UpdateEdit:0, InsertEdit:0},
							{Type:"Text",	 	Hidden:0, 	Width:300, 	Align:"Center", ColMerge:0, SaveName:"upd_dt", 		KeyField:0, UpdateEdit:0, InsertEdit:0},
							{Type:"Text", 		Hidden:0, 	Width:300, 	Align:"Center", ColMerge:0, SaveName:"upd_usr_id", 	KeyField:0, UpdateEdit:0, InsertEdit:0}];
				
				InitColumns(cols);
				SetWaitImageVisible(0);
				ComResizeSheet(sheetObj);	
				break;
			default:
				break;
		}		
	}
}

/**
 * Functions that define the basic properties of the multicombo, for example combo item information, combo basic attributes, etc.<br>
 * @param comboObj		(ibmulticombo)		IBMultiCombo Object
 * @param comboNo		(int)			Number of IBMultiCombo Object
 */
function initCombo(comboObj, comboNo){
	switch(comboObj.options.id){
		case "s_jo_crr_cd":
			comboObj.SetMultiSelect(1);
			comboObj.SetDropHeight(210);
			var comboItems = carrierCombo.split('|');
			for(i=0; i<comboItems.length; i++){
				comboObj.InsertItem(i, comboItems[i], comboItems[i]);
			}
			comboObj.SetItemCheck(0,1);
			break;
		default:
			break;
	}
}

/**
 * Function that define transaction logic between UI and server.<br>
 * @param sheetObj		(ibsheet)		IBSheet Object
 * @param formObj		(form)			Form Object
 * @param sAction		(int)			Action code (Ex: IBSEARCH, IBSAVE, IBDELETE, IBDOWNEXCEL)
 */
function doActionIBSheet(sheetObj, formObj, sAction){
	with(sheetObj)
	{
		switch(sAction) {
			case IBSEARCH:
				// if sheetobj is hidden, it will be display
				if(document.getElementById('DIV_'+sheetObj.id).style.display == 'none'){
					//ComShowObject(ComGetObject('DIV_'+sheetObj.id), true);
					document.getElementById('DIV_'+sheetObj.id).style.display = 'block';
				}
				
				formObj.f_cmd.value = SEARCH;
				// Connect to search page to read search XML then load XML data internally in IBSheet.
				DoSearch("FNS_DOU_0004GS.do", FormQueryString(formObj));
				break;
			case IBNEW:
				// clear the grid & form input
				ComResetAll();
				comboObjects[0].SetItemCheck(0,1);
				// hidden header
				document.getElementById('DIV_'+sheetObj.id).style.display = "none";
				break;
			case IBSAVE:
				// if it is delete, it will ignore rlane_cd keyfield.
				if(GetCellValue(GetSelectRow(),"del_check") == 1){
					SetColProperty("rlane_cd",{KeyField:0});
					flagVendorKeyAccess = false;
				}
				// save data based on data transaction status or column to database.
				if(GetSaveString() != ''){
					formObj.f_cmd.value = MULTI;
					DoSave("FNS_DOU_0004GS.do", FormQueryString(formObj));
				}
				else
					// ComShowCodeMessage("COM130503");
					ComShowMessage("No change data found.");
				break;
			case IBINSERT:
				// add a row behind the selected row
				var row = DataInsert(-1);
				SetCellValue(row, "delt_flg", "N");
				break;
			case IBDELETE:
				SetCellValue(GetSelectRow(), 1, 1);
				var checked_rows = FindCheckedRow("del_check").split('|');
				
				for(var i = 0; i<checked_rows.length;i++){
					SetRowHidden(checked_rows[i], 1);
				}
				break;
			case IBDOWNEXCEL:
				if(RowCount() < 1)
				{
					ComShowCodeMessage("COM132501");
					break;
				}

				Down2Excel({FileName:"Joo_Carrier", SheetName:"Sheet1", SheetDesign:1, DownCols: makeHiddenSkipCol(sheetObj)});
				break;
		}
	}
}

/**
 * An event occur when the check box is clicked, if multiple selection is used.<br>
 * @param comboObj		(ibmulticombo)		IBMultiCombo Object
 * @param index			(long)			Index value of the clicked item
 * @param code			(string)		Code value of the clicked item
 */
function s_jo_crr_cd_OnCheckClick(comboObj, index, code) {
	with(comboObj){
		// if the first index is checked, others are unchecked.
		// if another index is checked, the first index is unchecked.
		if(GetItemCheck(index) == true){
			if(index == 0){
				for(var i= 1; i<GetItemCount(); i++){
					if(GetItemCheck(i) == true){
						SetSelectIndex(-1,1);
						break;
					}
				}
				SetItemCheck(0,1);
			}
			else
				SetItemCheck(0,0);
		}			
		
		if(ComGetObjValue(s_jo_crr_cd) == "")
			SetItemCheck(0,1);
	}
}

/**
 * Handle validate of vendor.<br>
 * @param vendor		(String)     		Vendor code
 */
function vendorCodeValidate(vendor){
	if(vendor == "")
		return;
	
	if(!ComIsNumber(vendor)){
		ComShowCodeMessage("COM12178");
		setTimeout(function(){
//			ComSetFocus(ComGetObject("s_vndr_seq"));
			document.getElementById("s_vndr_seq").focus();
		},1);
	}
}


/**
 * Handle validate of date.<br>
 * @param vendor		(String)     		Vendor code
 */
function dateValidate(dateObj){
	if(dateObj.value == "")
		return;
	
	if(!ComIsDate(ComGetObjValue(dateObj))){
		ComShowCodeMessage("COM12132");
		setTimeout(function(){
			ComSetFocus(dateObj);
			//document.getElementById(dateObj).focus();
		},1);
	}
}


/**
 * Event fires when search is completed using a search function and other internal data processing are also completed.<br>
 * @param sheetObject		(ibsheet)		IBSheet Object
 * @param Code			(Long)			Processing result code (0 is success, others should be processed as error)
 * @param Msg			(String)		Processing result message
 * @param StCode		(Integer)		HTTP response code
 * @param StMsg			(String)		HTTP response message
 */
function sheet1_OnSearchEnd(sheetObject, Code, Msg, StCode, StMsg) {
	ComOpenWait(false);
}

/**
 * Event fires when saving is completed using saving function and other internal processing has been also completed.<br>
 * @param sheetObject		(ibsheet)		IBSheet Object
 * @param Code			(Long)			Processing result code (0 is success, others should be processed as error)
 * @param Msg			(String)		Processing result message
 * @param StCode		(Integer)		HTTP response code
 * @param StMsg			(String)		HTTP response message
 */
function sheet1_OnSaveEnd(sheetObject, Code, Msg, StCode, StMsg) {
	// set rlane_cd keyfield = 1 when it = 0
	if(flagVendorKeyAccess == false){
		sheetObject.SetColProperty("rlane_cd",{KeyField:1});
		flagVendorKeyAccess = true;
	}
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
	if(Code>=0){
		ComShowCodeMessage("COM132601");
	}
}

/**
 * Event fires promptly before Ajax communication when a search method is called.<br>
 * @param sheetObject		(ibsheet)		IBSheet Object
 * @param Code			(Long)			Processing result code (0 is success, others should be processed as error)
 * @param Msg			(String)		Processing result message
 * @param StCode		(Integer)		HTTP response code
 * @param StMsg			(String)		HTTP response message
 */
function sheet1_OnBeforeSearch(sheetObject, Code, Msg, StCode, StMsg) {
	ComOpenWait(true);
}

/**
 * Event fires promptly before Ajax communication when a saving method is called.<br>
 * @param sheetObject		(ibsheet)		IBSheet Object
 * @param Code			(Long)			Processing result code (0 is success, others should be processed as error)
 * @param Msg			(String)		Processing result message
 * @param StCode		(Integer)		HTTP response code
 * @param StMsg			(String)		HTTP response message
 */
function sheet1_OnBeforeSave(sheetObject, Code, Msg, StCode, StMsg) {
	ComOpenWait(true);
}

/**
 * Handling when sheet1 on change.<br>
 * @param sheetObject		(ibsheet)		IBSheet Object
 * @param Row			(Long)			Row index of the cell
 * @param Col			(Long)			Column index of the cell
 * @param Value			(String)		Updated value; Value used for saving without formatting
 * @param OldValue		(String)		Value before update
 * @param RaiseFlag		(Integer)		Event fire option (0: manual editing, 1: method, 2: paste)
 */
function sheet1_OnChange(sheetObj, Row, Col, Value, OldValue, RaiseFlag){
	var formObj=document.form ;
	var colName=sheetObj.ColSaveName(Col);
	
	if(Value == ""){
		return;
	}
	
	switch(colName){
		case "jo_crr_cd":
			formObj.f_cmd.value		= COMMAND02;
			var sParam				= FormQueryString(formObj) + "&jo_crr_cd=" + Value;
			var sXml 				= sheetObj.GetSearchData("FNS_DOU_0004GS.do", sParam, {sync:1});	
			var flag				= ComGetEtcData(sXml, "isExisted");
			if(flag == 'N'){
				ComShowCodeMessage("JOO00136",["Carrier"]);
				sheetObj.SetCellValue(Row, Col,OldValue,0);
				sheetObj.SelectCell(Row, Col);
				break;
			}
		case "rlane_cd":
			if(sheetObj.GetCellValue(Row,"jo_crr_cd") != "" && sheetObj.GetCellValue(Row,"rlane_cd") != ""){
				//check on UI side
				if(sheetObj.ColValueDup("jo_crr_cd|rlane_cd") > -1){
					ComShowCodeMessage("COM12115", "The Carrier and Rev.Lane");
					sheetObj.SetCellValue(Row, Col,OldValue,0);
					sheetObj.SelectCell(Row, Col);
					return;
				}
				
				//check on Service side
				formObj.f_cmd.value	= COMMAND01;
				var sParam			= FormQueryString(formObj) + "&jo_crr_cd=" + sheetObj.GetCellValue(Row,"jo_crr_cd") + "&rlane_cd=" + sheetObj.GetCellValue(Row,"rlane_cd");
				var sXml 			= sheetObj.GetSearchData("FNS_DOU_0004GS.do", sParam, {sync:1});	
				var flag			= ComGetEtcData(sXml, "isExisted");
				
				if(flag == 'Y'){
					ComShowCodeMessage("COM12115", "The Carrier and Rev.Lane");
					sheetObj.SetCellValue(Row, Col,OldValue,0);
					sheetObj.SelectCell(Row, Col);
				}
			}
			break;
		case "vndr_seq":
			formObj.f_cmd.value		= COMMAND03;
			var sParam				= FormQueryString(formObj) + "&vndr_seq=" + Value;
			var sXml 				= sheetObj.GetSearchData("FNS_DOU_0004GS.do", sParam, {sync:1});	
			var flag				= ComGetEtcData(sXml, "isExisted");
			if(flag == 'N'){
				ComShowCodeMessage("JOO00136",["Vendor"]);
				sheetObj.SetCellValue(Row, Col,OldValue,0);
				sheetObj.SelectCell(Row, Col, 1);
			}
			break;
		case "cust_seq":
		case "cust_cnt_cd":
			if(sheetObj.GetCellValue(Row,"cust_seq") != "" && sheetObj.GetCellValue(Row,"cust_cnt_cd") != ""){
				formObj.f_cmd.value	= COMMAND04;
				var sParam			= FormQueryString(formObj)+ "&cust_cnt_cd=" + sheetObj.GetCellValue(Row,"cust_cnt_cd") + "&cust_seq=" + sheetObj.GetCellValue(Row,"cust_seq") ;
				var sXml 			= sheetObj.GetSearchData("FNS_DOU_0004GS.do", sParam, {sync:1});	
				var flag			= ComGetEtcData(sXml, "isExisted");
				if(flag == 'N'){
					ComShowCodeMessage("JOO00136",["Customer"]);
					sheetObj.SetCellValue(Row, Col,OldValue,0);
					sheetObj.SelectCell(Row, Col, 1);
				}
			}
			break;
		case "trd_cd":
			formObj.f_cmd.value		= COMMAND05;
			var sParam				= FormQueryString(formObj) + "&trd_cd=" + Value;
			var sXml 				= sheetObj.GetSearchData("FNS_DOU_0004GS.do", sParam, {sync:1});	
			var flag				= ComGetEtcData(sXml, "isExisted");
			if(flag == 'N'){
				ComShowCodeMessage("JOO00136",["Trade"]);
				sheetObj.SetCellValue(Row, Col,OldValue,0);
				sheetObj.SelectCell(Row, Col, 1);
			}
			break;
		default:
			break;
	}
}
