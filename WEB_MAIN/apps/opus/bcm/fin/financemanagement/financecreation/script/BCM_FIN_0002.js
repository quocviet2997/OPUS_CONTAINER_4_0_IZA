/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_FIN_0002.js
*@FileTitle  : AP Finance Direction Conversion
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/02
=========================================================*/
/****************************************************************************************
Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
				MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
				OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
***************************************************************************************/
/**
 * @extends 
 * @class AR Finance Direction Conversion : business script for AR Finance Direction Conversion 
 */

// The common variables
var tabObjects=new Array();
var tabCnt=0;
var beforetab=1;
var sheetObjects=new Array();
var sheetCnt=0;
var vslCombo="";
var vvdCombo="";
// Event handler processing by button click event */
document.onclick=processButtonClick;
// Event handler processing by button name */
function processButtonClick(){
	var sheetObject=sheetObjects[0];
	var formObject=document.form;
	try{
		var srcName=ComGetEvent("name");
		switch(srcName){
			case "btn_retrieve":
				doActionIBSheet(sheetObject,formObject,IBSEARCH);
				break;
			case "btn_new":
				ComResetAll();
				break;
			case "btn_save":
				doActionIBSheet(sheetObject,formObject,IBSAVE);
				doActionIBSheet(sheetObject,formObject,IBSEARCH);
				break;
			case "btn_loadExcel":
				doActionIBSheet(sheetObject,formObject,IBLOADEXCEL);
				break;
			case "btn_add":
				var row=sheetObject.DataInsert(-1);
				break;
			case "btn_del":
				rowRemove(sheetObject);
				break;
			case "pop_slan":
				ComOpenPopup("COM_ENS_081.do", 830, 410, "setServiceLaneCode", "1,0,1,1,1,1", false, false, 0, 0, 0, "COM_ENS_081");
				break;
            case "btn_rlane_search":
            	var objEvt = ComGetEvent();
            	if(objEvt.style.cursor == "default") return;
            	var sUrl="/opuscntr/COM_COM_0011.do?rlane_cd=" + formObject.s_rlane_cd.value +"&mdm_yn=Y&main_page=false";
            	var rVal=ComOpenPopup(sUrl, 770, 420, "get_rLaneCd", "1,0,1", true);
    			break;
		} // end switch
	}catch(e){
		if( e == "[object Error]"){
			ComShowMessage(OBJECT_ERROR);
		} else{
			ComShowMessage(e);
		}
	}
}
/**
* Setting Service Lane Code
*/
function setServiceLaneCode(aryPopupData, Row, Col, sheetIdx) {
	form.s_slan_cd.value=aryPopupData[0][3];
	if(form.s_rlane_cd.value != "" && form.s_rlane_cd.value.substring(0,3) != form.s_slan_cd.value) 
	{
		form.s_rlane_cd.value="";
	}
}
/**
* Setting Revenue Lane Code
*/
function get_rLaneCd(rowArray) {
	var sheetObj=sheetObjects[0];
    var formObj=document.form;
   	var colArray=rowArray[0];
	formObj.s_rlane_cd.value=colArray[2];
	formObj.s_slan_cd.value=colArray[2].substring(0,3);
}
/**
 * registering IBCombo Object as list
 * adding process for list in case of needing batch processing with other items 
 * defining list on the top of source
 */
function setSheetObject(sheet_obj){
   sheetObjects[sheetCnt++]=sheet_obj;
}
/**
 * initializing sheet
 * implementing onLoad event handler in body tag
 * adding first-served functions after loading screen.
 */
function loadPage(){
	for(i=0;i<sheetObjects.length;i++){
		ComConfigSheet (sheetObjects[i]);
		initSheet(sheetObjects[i],i+1);
		ComEndConfigSheet(sheetObjects[i]);
	}
	sheetObjects[0].SetExtendLastCol(0);
	for(k=0;k<tabObjects.length;k++){
		initTab(tabObjects[k],k+1);
	}
	//initializing the event of HTML control
	initControl();   
}
/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
function initSheet(sheetObj,sheetNo){
	var cnt=0;
	switch(sheetNo){
		case 1:      //sheet1 init
			  with(sheetObj){
			
			   
			   var HeadTitle="|Del|Service Lane|Sub Conti|Service Lane Direction|Revenue Lane Direction|Direction Change|AP Used Flag|Revenue Lane|Delete Flag|h_slan_cd|h_sconti_cd|h_slan_dir_cd|h_rlane_dir_cd";
			   var headCount=ComCountHeadTitle(HeadTitle);

			   SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );

			   var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			   var headers = [ { Text:HeadTitle, Align:"Center"} ];
			   InitHeaders(headers, info);

			   var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
						 {Type:"CheckBox",  Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
						 {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"slan_cd",         KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3 , AcceptKeys:"E|[0123456789]", InputCaseSensitive:1},
						 {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"sconti_cd",       KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:2 , AcceptKeys:"E", InputCaseSensitive:1},
						 {Type:"Text",      Hidden:0,  Width:185,  Align:"Center",  ColMerge:0,   SaveName:"slan_dir_cd",     KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 , AcceptKeys:"E", InputCaseSensitive:1},
						 {Type:"Text",      Hidden:0,  Width:185,  Align:"Center",  ColMerge:0,   SaveName:"rlane_dir_cd",    KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 , AcceptKeys:"E", InputCaseSensitive:1},
						 {Type:"Combo",     Hidden:0, Width:140,  Align:"Center",  ColMerge:0,   SaveName:"dir_cng_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
						 {Type:"Text",      Hidden:1,  Width:107,  Align:"Center",  ColMerge:0,   SaveName:"ap_mk_flg",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 },
						 {Type:"Text",      Hidden:0,  Width:130,  Align:"Center",  ColMerge:0,   SaveName:"rlane_cd",        KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:5 , AcceptKeys:"E|[0123456789]", InputCaseSensitive:1},
						 {Type:"Combo",     Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"delt_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
						 {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"h_slan_cd" },
						 {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"h_sconti_cd" },
						 {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"h_slan_dir_cd" },
						 {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"h_rlane_dir_cd" } ];
				
				InitColumns(cols);
				SetEditable(1);
				SetCountPosition(0);
				SetWaitImageVisible(0);
				SetColProperty("dir_cng_cd", {ComboText:"Y|N", ComboCode:"Y|N"} );
				SetColProperty("delt_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
				FitColWidth();
				resizeSheet();
			   }


			break;
	}
}

function resizeSheet(){
	ComResizeSheet(sheetObjects[0]);
}

/**
 * Handling the process about the sheet <br>
 **/
function doActionIBSheet(sheetObj,formObj,sAction,row,col){
	sheetObj.ShowDebugMsg(false);
	switch(sAction){
		case IBSEARCH:      //Retrieving
			if(validateForm(sheetObj,formObj,sAction)){
				formObj.f_cmd.value=SEARCH;	
				var sXml=sheetObj.GetSearchData("BCM_FIN_0002GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(""));
				//alert(sXml);
				var arrXml=sXml.split("|$$|");
				if (arrXml.length > 0) sheetObjects[0].LoadSearchData(arrXml[0],{Sync:1} );
			}
			break;
		case IBSAVE:        //Saving
			if (sheetObj.RowCount()== 0 || !sheetObj.IsDataModified()){
				ComShowCodeMessage("FIN00002");
				return; 
			}
			if(validateForm(sheetObj,formObj,sAction)){
				formObj.f_cmd.value=MULTI;
				var sParam=ComGetSaveString(sheetObj);
				if (sheetObj.RowCount()== 0 || (!sheetObj.IsDataModified()&& sParam == "")){
					ComShowCodeMessage("FIN00002");
					return; 
				}
				sParam += "&" + FormQueryString(formObj);
				var sXml=sheetObj.GetSaveData("BCM_FIN_0002GS.do", sParam);
				var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
				var arrXml=sXml.split("|$$|");
				if (arrXml.length > 0){
					if (result == 'S'){
						sheetObjects[0].LoadSearchData(arrXml[0],{Sync:1} );
					} else{
						sheetObjects[0].LoadSaveData(arrXml[0]);
					}
				}
			}
			break;
			
			
//		case IBLOADEXCEL:	// LOAD EXCEL
//			//sheetObj.LoadExcel(true);
//            with (sheetObj) {
//                if(LoadExcel()) {
//                	for (var i=HeaderRows(); i<=LastRow(); i++) {
//                		excel_upload_valid_chk(sheetObj, i);
//	                }
//                }
//            }		
//            break;
            
    	case IBLOADEXCEL:	// LOAD EXCEL
//			sheetObj.LoadExcel(); // Luc Duong fixes bug: #29712 (06/30/2014)
					sheetObj.LoadExcel({Append:0,ColumnMapping:'||2|3|4|5|6|7|8|9',WorkSheetNo:"1"});
			break;
            
		case SEARCH01: // Retrieving
			formObj.f_cmd.value=SEARCH01;
			var val=sheetObj.GetCellValue(row, col);
			var params=FormQueryString(formObj) + "&slan_cd=" + val;
			var sXml=sheetObj.GetSearchData("FINCommonGS.do", params);
			var state=ComGetEtcData(sXml, ComWebKey.Trans_Result_Key);
			if (state == 'S') {
				if(ComGetEtcData(sXml, "result") == null || ComGetEtcData(sXml, "result") == 'null'){
					ComShowCodeMessage("FIN00003", "Service Lane");
					sheetObj.SetCellValue(row, "slan_cd","",0);
					sheetObj.SelectCell(row, "slan_cd");
				}
			}
		break;
		case SEARCH02: // Retrieving
			formObj.f_cmd.value=SEARCH02;
			var val=sheetObj.GetCellValue(row, col);
			var params=FormQueryString(formObj) + "&sconti_cd=" + val;
			var sXml=sheetObj.GetSearchData("FINCommonGS.do", params);
			var state=ComGetEtcData(sXml, ComWebKey.Trans_Result_Key);
			if (state == 'S') {
				if(ComGetEtcData(sXml, "result") == null || ComGetEtcData(sXml, "result") == 'null'){
					ComShowCodeMessage("FIN00003", "Sub Conti");
					sheetObj.SetCellValue(row, "sconti_cd","",0);
					sheetObj.SelectCell(row, "sconti_cd");
				}
			}
		break;
		case SEARCH03: // Retrieving
			formObj.f_cmd.value=SEARCH03;
			var val=sheetObj.GetCellValue(row, col);
			var params=FormQueryString(formObj) + "&rlane_cd=" + val;
			var sXml=sheetObj.GetSearchData("FINCommonGS.do", params);
			var state=ComGetEtcData(sXml, ComWebKey.Trans_Result_Key);
			if (state == 'S') {
				if(ComGetEtcData(sXml, "result") == null || ComGetEtcData(sXml, "result") == 'null'){
					ComShowCodeMessage("FIN00003", "Revenue Lane");
					sheetObj.SetCellValue(row, "rlane_cd","",0);
					sheetObj.SelectCell(row, "rlane_cd");
				}
			}
		break;
	}
}
/**
 * Removing IBSheet Row
 **/
function rowRemove(sheetObj){
	ComRowHideDelete(sheetObj, "DelChk");
}
/**
 * Loading the event of HTML control in the page dynamically.
 **/
function initControl(){
	DATE_SEPARATOR="-";
	//handling the occurring beforedeactivate event to the all fields
	axon_event.addListenerForm  ('beforedeactivate', 'obj_deactivate', form);
	//handling the occurring beforeactivate event to the all fields that contain dataformat attribute   
	axon_event.addListenerFormat('beforeactivate'  , 'obj_activate'  , form);
	//handling the occurring keypress event to the all fields that contain dataformat attribute 
	axon_event.addListenerFormat('keypress'        , 'obj_keypress'  , form);
	//axon_event.addListenerForm('keypress', 'obj_keypress', form);
	axon_event.addListener('keydown', 'ComKeyEnter', 'form');
	//handling the occurring keypress event to s_rev_yrmon
	axon_event.addListener  ('keypress', 'num_keypress'         , 's_rev_yrmon');			
	// handling the occurring keypress event to s_vvd and s_vsl_cd
	axon_event.addListener  ('keypress', 'enguppernum_keypress' , 's_vvd', 's_vsl_cd');		
}

//function initControl(){
//	DATE_SEPARATOR="-";
//	//handling the occurring beforedeactivate event to the all fields  
//	axon_event.addListenerForm  ('beforedeactivate', 'obj_deactivate', form); 	
//	//handling the occurring beforeactivate event to the all fields that contain dataformat attribute  
//	axon_event.addListenerFormat('beforeactivate'  , 'obj_activate'  , form); 	
//	//handling the occurring keypress event to the all fields that contain dataformat attribute   
//	axon_event.addListenerFormat('keypress'        , 'obj_keypress'  , form);
//	// handling the occurring keypress event to s_slan_cd and s_rlane_cd
//	axon_event.addListener  ('keypress', 'engnum_keypress' , 's_slan_cd', 's_rlane_cd');
//}

/**
 * Checking the validation in case of occuring blur event in HTML control
 **/
function obj_deactivate(){
	//if (event.srcElement.getAttribute("required") != null) return;
	switch(event.srcElement.name){
		//case "s_sys_div_cd":
			//ComChkObjValid(event.srcElement);
		//break;
		case "s_eff_yrmon":
			ComChkObjValid(event.srcElement);
			break;
		default:
			//ComAddSeparator(event.srcElement);
			ComChkObjValid(event.srcElement);
	}
}
/**
 * Removing the delimiter in case of occurring focus event in HTML control <br>
 **/
function obj_activate(){
	ComClearSeparator(event.srcElement);
}
/**
 * Converting the inputted the alphabet to uppercase in case of occurring keypress event in HTML control
 **/
function eng_keypress(){
	ComKeyOnlyAlphabet('upper');
}
 /**
  *Converting the inputted the alphabet to uppercase in case of occurring keypress event in HTML control
  **/
function engnum_keypress(){
	ComKeyOnlyAlphabet('uppernum');
}
/**
 * Calling this function after finishing to retrieve sheet1<br>
 * param : sheetObj, ErrMsg
 **/
function sheet1_OnSearchEnd(sheetObj, ErrMsg){
	for (var ir=1; ir<=sheetObj.LastRow(); ir++){
		sheetObj.SetCellEditable(ir, "slan_cd",0);
		sheetObj.SetCellEditable(ir, "sconti_cd",0);
		sheetObj.SetCellEditable(ir, "slan_dir_cd",0);
		sheetObj.SetCellEditable(ir, "rlane_dir_cd",0);
	}
//	ComColFontName(sheetObj, "8");
}
/**
 * handling process for input validation <br>
 **/
function validateForm(sheetObj,formObj,sAction){
	if(sAction == 0){
		if (!ComChkValid(formObj)) return false;
	}else{
		for(var ir=1; ir<=sheetObj.LastRow(); ir++){
			if(sheetObj.GetCellValue(ir,"slan_cd") == ""){
				ComShowCodeMessage("FIN00001", "Service Lane");
				sheetObj.SelectCell(ir,"slan_cd");
				return false;
			} else if(sheetObj.GetCellValue(ir,"sconti_cd") == ""){
				ComShowCodeMessage("FIN00001", "Sub Conti");
				sheetObj.SelectCell(ir,"sconti_cd");
				return false;
			} else if(sheetObj.GetCellValue(ir,"slan_dir_cd") == ""){
				ComShowCodeMessage("FIN00001", "Service Lane Direction");
				sheetObj.SelectCell(ir,"slan_dir_cd");
				return false;
			} else if(sheetObj.GetCellValue(ir,"rlane_dir_cd") == ""){
				ComShowCodeMessage("FIN00001", "Revenue Lane Direction");
				sheetObj.SelectCell(ir,"rlane_dir_cd");
				return false;
			} else if(sheetObj.GetCellValue(ir,"rlane_cd") == ""){
				ComShowCodeMessage("FIN00001", "Revenue Lane");
				sheetObj.SelectCell(ir,"rlane_cd");
				return false;
			}
		}
	}
	return true;
}
/**
 * Calling this function in case of changing the cell value in sheet
 **/
function sheet1_OnChange(sheetObj, row, col, val) {
	var formObject=document.form;
	var col_save_name=sheetObj.ColSaveName(col);
	if(sheetObj.ColSaveName(col) == "slan_cd" && sheetObj.GetCellValue(row, "slan_cd") != "") {
		doActionIBSheet(sheetObj, document.form, SEARCH01, row, col);
	}else if(sheetObj.ColSaveName(col) == "sconti_cd" && sheetObj.GetCellValue(row, "sconti_cd") != "") {
		doActionIBSheet(sheetObj, document.form, SEARCH02, row, col);
	}else if(sheetObj.ColSaveName(col) == "rlane_cd" && sheetObj.GetCellValue(row, "rlane_cd") != "") {
		doActionIBSheet(sheetObj, document.form, SEARCH03, row, col);
	}
}

function sheet1_OnLoadExcel(sheetObj, result, code, msg){
    if(isExceedMaxRow(msg))return;  
} 
/**
 * Excel Load data Valid check
 **/
function excel_upload_valid_chk(sheetObj,Row){
	if(sheetObj.GetCellValue(Row, "slan_cd") != "") {
	    doActionIBSheet(sheetObj, document.form, SEARCH01, Row, "slan_cd");
    }
	if(sheetObj.GetCellValue(Row, "sconti_cd") != "") {
	    doActionIBSheet(sheetObj, document.form, SEARCH02, Row, "sconti_cd");
    }
	if(sheetObj.GetCellValue(Row, "rlane_cd") != "") {
	    doActionIBSheet(sheetObj, document.form, SEARCH03, Row, "rlane_cd");
    }
    return true;
}
