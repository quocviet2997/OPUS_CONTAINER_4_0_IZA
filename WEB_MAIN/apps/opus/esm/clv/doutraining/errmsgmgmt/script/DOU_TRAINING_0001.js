/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : DOU_TRAINING_0001.js
*@FileTitle : Error Message Management
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.16
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.16 
* 1.0 Creation
=========================================================*/


/* START  */
// an array stores sheet objects
var sheetObjects = new Array();
// a counter of total number sheetObjects
var sheetCnt = 0;
// change onclick function on page to processButtonClick funtions
document.onclick = processButtonClick;

var saveFlag = 0;

/**
	 * {loadPage} Function that calls a common function that sets the default settings of the sheet.<br>
	 *			  It is the first called area when fire jsp onload event
	 **/
function loadPage(){
	// Generate Grid Layout
	for(i=0; i<sheetObjects.length; i++){
		// SetShowButtonImage: Combo and popup image will display only when focus is placed. 
				// 0: Display combo, calendar and pop-up image only when is focused.
			// SetDown2ExcelConfig: Configure some basic settings for excel download. 
			// SetDataRowHeight(24): Set the height of all data rows at 24 pixels.
		ComConfigSheet(sheetObjects[i]);
		
		// Functions that define the basic properties of the sheet on the screen, for example Column information, sheet basic attributes, etc.
		initSheet(sheetObjects[i], i+1);
		
		// SetEditableColorDiff: Configure whether to mark uneditable cells with different color.
				// 1 - Mark uneditable cells with the color configured in css
			// SetEnterBehavior("tab"): Set enter key behavior as moving horizontally to the next cell
			// SetEditTabBehavior: configure tab key behavior after data editing
				// 0 - focus will move to the next editable cell.
				// 1 - focus will move to the next cell even if it is uneditable.
			// SetDataAutoTrim: Configure whether to trim space in data
				// 0: without trimming (using)
				// 1: automatic trimming
			// SetUnicodeByte: Configure bytes of Asian charaters. (using: 3)
				// Depending on the DB language configurations, Korean, Japanese or Chinese letter may need to be recognized as 2 byte or larger.
			// RemoveAll: Delete all data rows and leave the header row only.
		ComEndConfigSheet(sheetObjects[i]);
	}
	
	// To show the search result on grid.
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}

/**
	 * {processButtonClick} Function for branching to the corresponding logic when a button on the screen is pressed.<br>
	 **/
function processButtonClick(){
	// define a variable to store the valuation of sheetObjects[0]
	var sheetObject1 = sheetObjects[0];
	// define a variable to store the valuation of document.form
	var formObject = document.form;

	// Run a block code. If i have exception, the ui will show an error popup.
	try{
		// Get name or id of object where the event appears
		var srcName = ComGetEvent("name");
		// each srcName will have its action
		switch(srcName){
			case "btn_Retrieve":
				// To show the search result on grid.
				doActionIBSheet(sheetObject1, formObject, IBSEARCH);
				break;
			case "btn_Save":
				// To save changes on grid to server.
				doActionIBSheet(sheetObject1, formObject, IBSAVE);
				break;
			case "btn_DownExcel":
				// To download excel file of grid to your computer.
				doActionIBSheet(sheetObject1, formObject, IBDOWNEXCEL);
				break;
			case "btn_Add":
				// To insert a row behind the selected row
				doActionIBSheet(sheetObject1, formObject, IBINSERT);
				break;
			default:
				break;
		}
	}
	catch(e) {
		// if the message is [object Error], the popup will show a message through OBJECT_ERROR code.
		// else the error popup will show the error thrown.
		if(e == "[object Error]") {
			ComShowMessage(OBJECT_ERROR);
		} else {
			ComShowMessage(e);
		}
	}
}

/**
	 * {processButtonClick} Put sheet objects in global variable "sheetObjects".<br>
	 * @param {ibsheet} sheetObj    	IBSheet Object
	 **/
function setSheetObject(sheet_obj){
	// set sheet_obj to index equaling sheetCnt. After that, sheetCnt will increase 1.
	sheetObjects[sheetCnt++] = sheet_obj;
}

// Functions that define the basic properties of the sheet on the screen, for example Column information, sheet basic attributes, etc.
function initSheet(sheetObj, sheetNo){
	with(sheetObj){
		// SetConfig: configure how to fetch initialized sheet, location of frozen rows or columns and other basic configurations.
			// SearchMode: configure search mode (Default: 2)
				//LazyLoad mode: Search all data and display search result data on the screen by page as set in Page property value according to the scroll location
			// MergeSheet: Merge type (Default=0)
				//0 msNone 		 No merge is allowed;
				//5 msHeaderOnly Allow merge in the header rows only
			// Page: Number of rows to display in one page (Default=20)
			// DataRowMerge: whether to allow horizontal merge of the entire row (Default=0)
		SetConfig( {SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:0});
		
		// define a string to store head titles
		var headTitle ="|Del|Msg Cd|Msg Type|Msg Level|Message|Description";
		// Define header title and alignment in	JSON format.
		var headers = [{Text:headTitle, Align:"Center"}];
		// Define header functions such as sorting and column movement permissions.
			// Sort - Boolean - Whether to allow sorting by clicking on the header (Default=1)
			// ColMove - Boolean - Whether to allow column movement in header (Default=1)
			// ColResize Boolean Whether to allow resizing of column width (Default=1)
			// HeaderCheck Boolean Whether the CheckAll in the header is checked (Default=1)
		var info ={Sort:1, ColMove:1, ColResize:1, HeaderCheck:0};
		
		// You can define the header title and function using this method.
		InitHeaders(headers, info);
		
		var prefix = "sheet1_";
		// Type - String - Column data type (Required)
		// Hidden - Boolean - Whether a column is hidden
		// Width - Number - Column width
		// Align - String - Data alignment
		// ColMerge - Boolean - Whether to allow column merging
		// SaveName - String - A parameter name used to save or search data
		// KeyField - Boolean - Required fields
		// UpdateEdit - Boolean - Whether to allow data editing when transaction is in "Search" state
		// InsertEdit - Boolean - Whether to allow data editing when transaction is in "Insert" state
		// ComboText - String - Combo list text string group
		// ComboCode - String - Combo list code group
		// MultiLineText - Boolean - Whether to use multilines
		// EditLen - Number - Editable data legnth
		// AcceptKeys - String - Accepted key configuraiton
		var cols = [{Type:"Status", Hidden:1, Width:30, Align:"Center", ColMerge:0, SaveName:"ibflag"},
					{Type:"DelCheck", Hidden:0, Width:50, Align:"Center", ColMerge:0, SaveName: "del", KeyField:0, UpdateEdit:1, InsertEdit:1},
					{Type:"Text", Hidden:0, Width:100, Align:"Center", ColMerge:1, SaveName: "err_msg_cd", KeyField:1, UpdateEdit:0, InsertEdit:1, EditLen: 8},
					{Type:"Combo", Hidden:0, Width:100, Align:"Center", ColMerge:1, SaveName: "err_tp_cd", KeyField:1, UpdateEdit:1, InsertEdit:1, ComboText:"|Server|UI|Both", ComboCode:"|S|U|B"},
					{Type:"Combo", Hidden:0, Width:100, Align:"Center", ColMerge:1, SaveName: "err_lvl_cd", KeyField:1, UpdateEdit:1, InsertEdit:1, ComboText:"|ERR|WARMING|INFO", ComboCode:"|E|W|I"},
					{Type:"Text", Hidden:0, Width:600, Align:"Left", ColMerge:0, SaveName: "err_msg", KeyField:1, UpdateEdit:1, InsertEdit:1, MultiLineText: 1},
					{Type:"Text", Hidden:0, Width:900, Align:"Left", ColMerge:0, SaveName: "err_desc", KeyField:0, UpdateEdit:1, InsertEdit:1, MultiLineText: 1}];
		// Configure data type, format and functionality of each column.
                	// cols - json - Configure functionality of each column into JSON format.
		InitColumns(cols);
		
		// SetWaitImageVisible: configure whether to display waiting image during processing.
                	// If you do not want to use the waiting image for any reason, set this property as 0 to remove waiting image.
		SetWaitImageVisible(0);
		
		// Resize Sheet
		// scalable - if don't call this functions, it will may make UI breakable
		ComResizeSheet(sheetObjects[0]);	
	}
}

/**
	 * {doActionIBSheet} Function that define transaction logic between UI and server.<br>
	 * @param {ibsheet} sheetObj    	IBSheet Object
	 * @param {form}    formObj     	Form Object
	 * @param {int}     sAction     	Action code(ex: IBSEARCH, IBSAVE, IBDELETE, IBDOWNEXCEL)
	 **/
function doActionIBSheet(sheetObj, formObj, sAction){
	with(sheetObj)
	{
		switch(sAction) {
			case IBSEARCH:
				// ComOpenWait:configure whether a loading image will appears and lock the screen
					// true: lock the screen.
					// false: return normal.
				ComOpenWait(true);
				// set value for f_cmd in form equal SEARCH
				formObj.f_cmd.value = SEARCH;
				// Connect to search page to read search XML
				var xml = GetSearchData("DOU_TRAINING_0001GS.do", FormQueryString(formObj));
				// Load XML data internally in IBSheet.
				LoadSearchData(xml);
				break;
			case IBSAVE:
				// ComOpenWait:configure whether a loading image will appears and lock the screen
					// true: lock the screen.
					// false: return normal.				
					// set value for f_cmd in form equal MULTI
				formObj.f_cmd.value = MULTI;
				// save data based on data transaction status or column to database.
				if(GetSaveString() != ''){
					DoSave("DOU_TRAINING_0001GS.do", FormQueryString(formObj));
				}
				else {
					ComShowCodeMessage("SAV00000");
				}
				break;
			case IBINSERT:
				// To insert a row behind the selected row
				DataInsert();
				break;
			case IBDOWNEXCEL:
				// if no data in grid, It won't download excel file and show a popup
				if(RowCount() < 1)
				{
					// show a popup message.
					ComShowCodeMessage("EXL00001");
					break;
				}
				//download the data displayed in IBSheet into an excel file.
					// FileName - String - File name to save
					// SheetName - String - Excel worksheet name, Default="Sheet"
					// SheetDesign - Integer - Whether to apply IBSheet design concept to download file, Default=0
					// DownCols String Optional Connect columns to download using | Default=""(Download all)
				Down2Excel({FileName:"Error_Message", SheetName:"Sheet1", SheetDesign:1, DownCols: '2|3|4|5|6'});
				break;
		}
	}
}

/**
	 * {sheet1_OnChange} Event fires when the cell editing is completed and the previous value has been updated.<br>
	 * @param {ibsheet}  	sheetObject   	IBSheet Object
	 * @param {Long} 		Row    			Row index of the cell
	 * @param {Long}    	Col     		Col index of the cell
	 **/
function sheet1_OnAfterEdit(sheetObject, Row, Col){
	switch(Col){
		case 2:
			var message = sheetObject.GetCellValue(Row, Col);
			if(!checkMessageCodeFormat(message)){
				ComShowCodeMessage("ERR00001");
				sheetObject.SelectCell(Row, Col, 1);
				return;
			}
		default:
			break;
	}
}

//function sheet1_OnClick(sheetObject, Row, Col){
//	switch(Col){
//		case 1:
//			var info = {UpdateEdit:0};
//			sheetObject.SetColProperty(3, 3, info);
//			sheetObject.SetColProperty(Row, 4, info);
//			sheetObject.SetColProperty(Row, 5, info);
//		default:
//			break;
//	}
//}

/**
	 * {checkMessageCodeFormat} Function that check whether message code is correct.<br>
	 * @param {String}	message		message code needing to check.
	 * @return boolean
	 **/
function checkMessageCodeFormat(message){
	// regex for code message
	var format = /^([A-Z]{3})(\d{5})$/;
	// check whether the message code matches with format.
		// return boolean
	if(message.match(format)){
		return true;
	}
	return false;
}

/**
	 * {sheet1_OnSearchEnd} Event fires when search is completed using a search function and other internal data processing are also completed.<br>
	 * @param {Long}	Code    	Processing result code (0 is success, others should be processed as error)
	 * @param {String}  Msg     	Processing result message
	 * @param {Integer} StCode  	HTTP response code
	 * @param {String}  StMsg   	HTTP response message
	 **/
function sheet1_OnSearchEnd(Code, Msg, StCode, StMsg) {
	// ComOpenWait:configure whether a loading image will appears and lock the screen
		// true: lock the screen.
		// false: return normal.
	ComOpenWait(false);
}

/**
	 * {sheet1_OnSaveEnd} Event fires when saving is completed using saving function and other internal processing has been also completed.<br>
	 * @param {Long}	Code    	Processing result code (0 is success, others should be processed as error)
	 * @param {String}  Msg     	Processing result message
	 * @param {Integer} StCode 		HTTP response code
	 * @param {String}  StMsg   	HTTP response message
	 **/
function sheet1_OnSaveEnd(Code, Msg, StCode, StMsg) {
	// To show the search result on grid.
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
	if(Msg>=0){
		ComShowCodeMessage("SAV00001");
	}
}

function sheet1_OnBeforeSave(Code, Msg, StCode, StMsg) {
	// To show the search result on grid.
	ComOpenWait(true);
}

//onbeforesave

/**
	 * {DOU_TRAINING_0001} construction function of DOU_TRAINING_0001 class.<br>
	 **/
function DOU_TRAINING_0001() {
	this.processButtonClick		= tprocessButtonClick;
	this.setSheetObject 		= setSheetObject;
	this.loadPage 				= loadPage;
	this.initSheet 				= initSheet;
	this.initControl            = initControl;
	this.doActionIBSheet 		= doActionIBSheet;
	this.setTabObject 			= setTabObject;
	this.validateForm 			= validateForm;
}

/* END  */