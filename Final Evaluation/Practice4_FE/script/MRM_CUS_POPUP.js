/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : MRM_CUS_POPUP.js
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
document.onclick = processButtonClick;


/**
 * Function that calls a common function that sets the default settings of the sheet.<br>
 * It is the first called area when fire jsp onload event
 */
function loadPage(){
	for(i=0; i<sheetObjects.length; i++){
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i+1);
		ComEndConfigSheet(sheetObjects[i]);
	}
	
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}

/**
 * Function for branching to the corresponding logic when a button on the screen is pressed.<br>
 */
function processButtonClick(){
	var sheetObject1 = sheetObjects[0];
	var formObject = document.form;

	try{
		var srcName = ComGetEvent("name");
		switch(srcName){
			case "btn_Retrieve":
				doActionIBSheet(sheetObject1, formObject, IBSEARCH);
				break;
			case "btn_Ok":
				comPopupOK();
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
 * 
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
 * Functions that define the basic properties of the sheet on the screen, for example Column information, sheet basic attributes, etc.<br>
 * 
 * @param sheetObj		(ibsheet)		IBSheet Object
 * @param sheetNo		(int)			Number of IBSheet Object
 */
function initSheet(sheetObj, sheetNo){
	with(sheetObj){
		switch(sheetObj.id){
			case "sheet1":
				SetConfig( {SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:0});
				
				var headTitle ="||Check|Contry|Sequence|Legacy Customer Name";
				var headers = [{Text:headTitle, Align:"Center"}];
				var info ={Sort:1, ColMove:1, ColResize:1, HeaderCheck:0};
				
				InitHeaders(headers, info);
				
				var cols = [{Type:"Status", 	Hidden:1, 	Width:30, 	Align:"Center", ColMerge:0, SaveName:"ibflag"},
				            {Type:"Radio",     	Hidden:0, 	Width:30,   	Align:"Center",	ColMerge:0, SaveName:"checkbox", 	KeyField:0, UpdateEdit:1, InsertEdit:1},
					    {Type:"CheckBox", 	Hidden:0, 	Width:50, 	Align:"Center", ColMerge:0, SaveName:"del_check", 	KeyField:0},
					    {Type:"Text", 	Hidden:0, 	Width:100, 	Align:"Center", ColMerge:0, SaveName:"cust_cnt_cd", 	KeyField:1, UpdateEdit:0, InsertEdit:0, EditLen:2},
				            {Type:"Float", 	Hidden:0, 	Width:150, 	Align:"Center", ColMerge:0, SaveName:"cust_seq", 	KeyField:1, UpdateEdit:0, InsertEdit:0, EditLen:6},
				            {Type:"Text", 	Hidden:0, 	Width:300, 	Align:"Left", 	ColMerge:0, SaveName:"cust_lgl_eng_nm",	KeyField:1, UpdateEdit:0, InsertEdit:0, EditLen:6}];
				InitColumns(cols);
				SetWaitImageVisible(0);
				SetSheetHeight(ComGetSheetHeight(sheetObj, 16));
//				ComResizeSheet(sheetObj);
				break;
			default:
				break;
		}		
	}
}

/**
 * Function that define transaction logic between UI and server.<br>
 * 
 * @param sheetObj		(ibsheet)		IBSheet Object
 * @param formObj		(form)			Form Object
 * @param sAction		(int)			Action code (Ex: IBSEARCH, IBSAVE, IBDELETE, IBDOWNEXCEL)
 */
function doActionIBSheet(sheetObj, formObj, sAction){
	with(sheetObj)
	{
		switch(sAction) {
			case IBSEARCH:
				formObj.f_cmd.value = SEARCH;
				DoSearch("MRM_CUS_POPUPGS.do", FormQueryString(formObj));
				break;
		}
	}
}

/**
 * Event fires promptly before Ajax communication when a search method is called.<br>
 * 
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
 * Event fires when search is completed using a search function and other internal data processing are also completed.<br>
 * 
 * @param sheetObject		(ibsheet)		IBSheet Object
 * @param Code			(Long)			Processing result code (0 is success, others should be processed as error)
 * @param Msg			(String)		Processing result message
 * @param StCode		(Integer)		HTTP response code
 * @param StMsg			(String)		HTTP response message
 */
function sheet1_OnSearchEnd(sheetObject, Code, Msg, StCode, StMsg) {
	ComOpenWait(false);
}
