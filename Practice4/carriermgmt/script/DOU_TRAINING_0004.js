/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : DOU_TRAINING_0004.js
*@FileTitle : Carrier List
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.23
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.23 
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
     * @class DOU_TRAINING_0004 : DOU_TRAINING_0004 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
     */

var sheetObjects = new Array();
var sheetCnt = 0;
var comboObjects = new Array();
var comboCnt = 0;
document.onclick = processButtonClick;

const checkSet = new Set();

var IBNEW = 13;
var carrierCnt = 0;


/**
 * {loadPage} Function that calls a common function that sets the default settings of the sheet.<br>
 *			  It is the first called area when fire jsp onload event
 **/
function loadPage(){
	// Generate Grid Layout
	for(i=0; i<sheetObjects.length; i++){
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i+1);
		ComEndConfigSheet(sheetObjects[i]);
		doActionIBSheet(sheetObjects[i], document.form, IBSEARCH);
	}
	
	for(i=0; i<comboObjects.length; i++){
		initCombo(comboObjects[i], i+1);
	}
	document.getElementById('cre_dt_fm').disabled = true;
	document.getElementById('cre_dt_to').disabled = true;
}

/**
 * {processButtonClick} Function for branching to the corresponding logic when a button on the screen is pressed.<br>
 **/
function processButtonClick(){
	var sheetObject1 = sheetObjects[0];
	var formObject = document.form;

	try{
		var srcName = ComGetEvent("name");
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
			case "btn_calendar_to":
                var cal=new ComCalendar();
                if(srcName == "btn_calendar_fm"){
                	cal.select(formObject.cre_dt_fm, 'yyyy-MM-dd');
                }else{
                    cal.select(formObject.cre_dt_to, 'yyyy-MM-dd');
                }
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
 * {setSheetObject} Put sheet objects in global variable "sheetObjects".<br>
 * @param {ibsheet} sheetObj    	IBSheet Object
 **/
function setSheetObject(sheet_obj){
	sheetObjects[sheetCnt++] = sheet_obj;
}

/**
 * {setComboObject} Put sheet objects in global variable "sheetObjects".<br>
 * @param {ibmulticombo} combo_obj    	IBMultiCombo Object
 **/
function setComboObject(combo_obj) {
	comboObjects[comboCnt++] = combo_obj;
}

/**
 * {initSheet} Functions that define the basic properties of the sheet on the screen, for example Column information, sheet basic attributes, etc.<br>
 * @param {ibsheet} sheetObj    	IBSheet Object
 * @param {int}		sheetNo  	  	Number of IBSheet Object
 **/
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
		var headTitle ="|Chk|Carrier|Rev.Lane|Vendor Code|Customer Code|Customer Code|Trade|Delete Flag|Create Date|Create User ID|Update Date|Update User ID";
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
					{Type:"DelCheck", Hidden:0, Width:30, Align:"Center", ColMerge:0, SaveName:"chk", KeyField:0},
					{Type:"Text", Hidden:0, Width:100, Align:"Center", ColMerge:0, SaveName:"jo_crr_cd", KeyField:1, UpdateEdit:0, InsertEdit:1, EditLen:3},
		            {Type:"Combo", Hidden:0, Width:100, Align:"Center", ColMerge:0, SaveName:"rlane_cd", KeyField:1, UpdateEdit:1, InsertEdit:1, EditLen:5, ComboText: rLaneCombo, ComboCode: rLaneCombo}, 
					{Type:"Float", Hidden:0, Width:100, Align:"Center", ColMerge:0, SaveName:"vndr_seq", KeyField:1, UpdateEdit:1, InsertEdit:1, EditLen:6},
					{Type:"Text", Hidden:0, Width:50, Align:"Center", ColMerge:0, SaveName:"cust_cnt_cd", KeyField:1, UpdateEdit:1, InsertEdit:1, EditLen:2},
					{Type:"Float", Hidden:0, Width:100, Align:"Center", ColMerge:0, SaveName:"cust_seq", KeyField:1, UpdateEdit:1, InsertEdit:1, EditLen:6},
					{Type:"Text", Hidden:0, Width:100, Align:"Center", ColMerge:0, SaveName:"trd_cd", KeyField:0, UpdateEdit:1, InsertEdit:1, EditLen:3},
					{Type:"Combo", Hidden:0, Width:80, Align:"Center", ColMerge:0, SaveName:"delt_flg", KeyField:0, UpdateEdit:1, InsertEdit:1, ComboText: "Y|N", ComboCode: "Y|N"},
					{Type:"Text", Hidden:0, Width:300, Align:"Center", ColMerge:0, SaveName:"cre_dt", KeyField:0, UpdateEdit:0, InsertEdit:0},
					{Type:"Text", Hidden:0, Width:300, Align:"Center", ColMerge:0, SaveName:"cre_usr_id", KeyField:0, UpdateEdit:0, InsertEdit:0},
					{Type:"Text", Hidden:0, Width:300, Align:"Center", ColMerge:0, SaveName:"upd_dt", KeyField:0, UpdateEdit:0, InsertEdit:0},
					{Type:"Text", Hidden:0, Width:300, Align:"Center", ColMerge:0, SaveName:"upd_usr_id", KeyField:0, UpdateEdit:0, InsertEdit:0}];
		
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
 * {initCombo} Functions that define the basic properties of the multicombo, for example combo item information, combo basic attributes, etc.<br>
 * @param {ibmulticombo} 	comboObj    	IBSheet Object
 * @param {int}				comboNo  	  	Number of IBMultiCombo Object
 **/
function initCombo(comboObj, comboNo){
	if(comboNo == 1)
	{
		comboObj.SetMultiSelect(1);
		comboObj.SetDropHeight(210);
		var comboItems = carrierCombo.split('|');
		for(i=0; i<comboItems.length; i++){
			comboObj.InsertItem(i, comboItems[i], comboItems[i]);
		}
		comboObj.SetItemCheck(0,1);
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
				if(document.getElementById('DIV_'+sheetObj.id).style.display == 'none'){
					document.getElementById('DIV_'+sheetObj.id).style.display = 'block';
				}
				formObj.f_cmd.value = SEARCH;
				// Connect to search page to read search XML then load XML data internally in IBSheet.
				DoSearch("DOU_TRAINING_0004GS.do", FormQueryString(formObj));
				checkSet.clear();
				break;
			case IBNEW:
				// clear the grid
				RemoveAll();
				document.getElementById('DIV_sheet1').style.display = "none";
				break;
			case IBSAVE:
				// save data based on data transaction status or column to database.
				if(GetSaveString() != ''){
					formObj.f_cmd.value = MULTI;
					DoSave("DOU_TRAINING_0004GS.do", FormQueryString(formObj));
				}
				else
					ComShowCodeMessage("SAV00000");
				break;
			case IBINSERT:
				// add a row behind the selected row
				var row = DataInsert();
				SetCellValue(row, "delt_flg", "N");
				break;
			case IBDELETE:
				// hidden current row or checked rows
				SetCellValue(GetSelectRow(), 1, 1);
//				SetRowHidden(GetSelectRow(), 1);
				if(checkSet.size > 0){
					for(var value of checkSet){
						SetCellValue(value, 1, 1);
						SetRowHidden(value, 1);
					}
				}
				break;
			case IBDOWNEXCEL:
				// download an excel file if its data is available.
				if(RowCount() < 1)
				{
					ComShowCodeMessage("EXL00001");
					break;
				}
				
				// makeHiddenSkipCol
				Down2Excel({FileName:"Joo_Carrier", SheetName:"Sheet1", SheetDesign:1, DownCols: makeHiddenSkipCol(sheetObj)});
				break;
		}
	}
}

/**
 * {sheet1_OnChange} Event fires when the cell editing is completed and the previous value has been updated.<br>
 * @param {ibsheet} sheetObj    	IBSheet Object
 * @param {long}    Row 			Row index of the cell
 * @param {long}    Col     		Column index of the cell
 **/
function sheet1_OnChange(sheetObject, Row, Col) {
	switch(Col){
		case 1:
			// add the index of row into set if it is checked.
			if(sheetObject.GetCellValue(Row, Col) == 1){
				checkSet.add(Row);
			}
			// add the index of row into set if it is unchecked.
			else{
				checkSet.delete(Row);
			}
			break;
		default:
			break;
	}
}

/**
 * {jo_crr_cd_OnCheckClick} An event occur when the check box is clicked, if multiple selection is used..<br>
 * @param {ibmulticombo}	comboObj    	IBMultiCombo Object
 * @param {long}    		index 			Index value of the clicked item
 * @param {string}			code     		Code value of the clicked item
 **/
function jo_crr_cd_OnCheckClick(comboObj, index, code) {
	with(comboObj){
		// if the first index is checked, others are unchecked.
		// if another index is checked, the first index is unchecked.
		if(GetItemCheck(index) == true){
			carrierCnt++;
			if(index == 0){
				for(var i= 1; i<GetItemCount(); i++){
					if(GetItemCheck(i) == true){
						SetSelectIndex(-1,1);
						break;
					}
				}
				SetItemCheck(0,1);
			}
			else{
				SetItemCheck(0,0);
			}
		}
		else
			carrierCnt--;
		
		if(carrierCnt == 0)
			SetItemCheck(0,1);
	}
}

/**
 * {vendorCodeValidate} Handle validate of vendor.<br>
 * @param {String}  vendor   	Vendor code
 **/
function vendorCodeValidate(vendor){
	if(!checkVendorCodeFormat(vendor)){
		ComShowCodeMessage("JOO00001");
		setTimeout(function(){
			document.getElementById("vndr_seq").focus();
		},1);
	}
}

/**
 * {checkVendorCodeFormat} Check whether vendor code is relevant format.<br>
 * @param {String}  vendor   	Vendor code
 **/
function checkVendorCodeFormat(vendor){
	// regex for vendor code
	var format = /^(\d{6})$/;
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

/**
 * {sheet1_OnBeforeSearch} Event fires promptly before Ajax communication when a search method is called.<br>
 * @param {Long}	Code    	Processing result code (0 is success, others should be processed as error)
 * @param {String}  Msg     	Processing result message
 * @param {Integer} StCode 		HTTP response code
 * @param {String}  StMsg   	HTTP response message
 **/
function sheet1_OnBeforeSearch(Code, Msg, StCode, StMsg) {
	// ComOpenWait:configure whether a loading image will appears and lock the screen
		// true: lock the screen.
		// false: return normal.
	ComOpenWait(true);
}

/**
 * {sheet1_OnBeforeSave} Event fires promptly before Ajax communication when a saving method is called..<br>
 * @param {Long}	Code    	Processing result code (0 is success, others should be processed as error)
 * @param {String}  Msg     	Processing result message
 * @param {Integer} StCode 		HTTP response code
 * @param {String}  StMsg   	HTTP response message
 **/
function sheet1_OnBeforeSave(Code, Msg, StCode, StMsg) {
	// ComOpenWait:configure whether a loading image will appears and lock the screen
		// true: lock the screen.
		// false: return normal.
	ComOpenWait(true);
}

function DOU_TRAINING_0004() {
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