/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 		: BCM_FIN_0005.js
*@FileTitle 	: GL Estimate Revenue VVD
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
 * @class GL Estimate Revenue VVD : business script for GL Estimate Revenue VVD
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
			case "pop_vsl_code":
				ComOpenPopup("COM_ENS_0A1.do", 630, 445, "setVesselCode", "1,0,1,1,1,1", false, false, 0, 0, 0, "COM_ENS_0A1");
				break;
			case "exe_yrmon_cal":
				var cal=new ComCalendar();
				cal.setDisplayType('month');
				cal.select(form.s_exe_yrmon, 'yyyy-MM');
				break;
			case "rev_yrmon_cal":
				var cal=new ComCalendar();
				cal.setDisplayType('month');
				cal.select(form.s_rev_yrmon, 'yyyy-MM');
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
 * registering IBCombo Object as list
 * adding process for list in case of needing batch processing with other items 
 * defining list on the top of source
 */
function setSheetObject(sheet_obj){
   sheetObjects[sheetCnt++]=sheet_obj;
}
function setVesselCode(aryPopupData, Row, Col, sheetIdx) {
	form.s_vsl_cd.value=aryPopupData[0][3];
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
					
					   var HeadTitle="|Del|Execute Yrmon|Rev Yrmon|Vessel Code|Voyage No|Direction Code|Revenue Lane Direction|Estimate VVD Type|Estimate IOC DIV|VVD Header ID|Revenue DIV|Voyage Start DT|Voyage End DT|Revenue Lane|VVD Header ID Seq|Exe Yrmon|Rev Yrmon|Vessel Code|Skd Voy No|Skd Dir Cd|Rlane Dir Cd|Estm Vvd Tp Cd|Estm Ioc Div Cd";
					   var headCount=ComCountHeadTitle(HeadTitle);

					   SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );

					   var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
					   var headers = [ { Text:HeadTitle, Align:"Center"} ];
					   InitHeaders(headers, info);

					   var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
								 {Type:"CheckBox",  Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
								 {Type:"Date",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"exe_yrmon",          KeyField:0,   CalcLogic:"",   Format:"Ym",          PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:6 },
								 {Type:"Date",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"rev_yrmon",          KeyField:0,   CalcLogic:"",   Format:"Ym",          PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:6 },
								 {Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"vsl_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:4 },
								 {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"skd_voy_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:4 },
								 {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"skd_dir_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 },
								 {Type:"Text",      Hidden:0,  Width:180,  Align:"Center",  ColMerge:0,   SaveName:"rev_dir_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 },
								 {Type:"Combo",     Hidden:0, Width:150,  Align:"Center",  ColMerge:0,   SaveName:"estm_vvd_tp_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:2 },
								 {Type:"Combo",     Hidden:0, Width:140,  Align:"Center",  ColMerge:0,   SaveName:"estm_ioc_div_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:2 },
								 {Type:"Text",      Hidden:0,  Width:135,  Align:"Left",    ColMerge:0,   SaveName:"estm_vvd_hdr_id",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20 },
								 {Type:"Combo",     Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"estm_bc_div_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 },
								 {Type:"Date",      Hidden:0,  Width:135,  Align:"Center",  ColMerge:0,   SaveName:"vst_dt",             KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:8 },
								 {Type:"Date",      Hidden:0,  Width:135,  Align:"Center",  ColMerge:0,   SaveName:"ved_dt",             KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:8 },
								 {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"rlane_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:5 },
								 {Type:"Int",       Hidden:0,  Width:160,  Align:"Center",  ColMerge:0,   SaveName:"line_no",            KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:4 },
								 {Type:"Text",      Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"h_exe_yrmon" },
								 {Type:"Text",      Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"h_rev_yrmon" },
								 {Type:"Text",      Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"h_vsl_cd" },
								 {Type:"Text",      Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"h_skd_voy_no" },
								 {Type:"Text",      Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"h_skd_dir_cd" },
								 {Type:"Text",      Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"h_rev_dir_cd" },
								 {Type:"Text",      Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"h_estm_vvd_tp_cd" },
								 {Type:"Text",      Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"h_estm_ioc_div_cd" } ];
						
						InitColumns(cols);

						SetEditable(1);
						SetCountPosition(0);
						SetWaitImageVisible(0);
						SetColProperty("estm_vvd_tp_cd", {ComboText:"RV|PV|BV", ComboCode:"RV|PV|BV"} );
						SetColProperty("estm_ioc_div_cd", {ComboText:"IA|OO|XX", ComboCode:"IA|OO|XX"} );
						SetColProperty("estm_bc_div_cd", {ComboText:"C|B|M", ComboCode:"C|B|M"} );
						SetSheetHeight(380);
						//conversion of function[check again]CLT 				InitDataValid(0, "vsl_cd"    , vtEngUpOther, "0123456789");
						//conversion of function[check again]CLT 				InitDataValid(0, "skd_dir_cd", vtEngUpOnly);
						//conversion of function[check again]CLT 				InitDataValid(0, "rev_dir_cd", vtEngUpOnly);
						//conversion of function[check again]CLT 				InitDataValid(0, "rlane_cd",   vtEngUpOther, "0123456789");
						//conversion of function[check again]CLT 				InitDataValid(0, "skd_voy_no", vtNumericOther, "0123456789");
					   }


			break;
	}
}
/**
 * Handling the process about the sheet 
 * param : sheetObj, formObj, sAction, row, col
 **/
function doActionIBSheet(sheetObj,formObj,sAction,row,col){
	sheetObj.ShowDebugMsg(false);
	switch(sAction){
		case IBSEARCH:      //Retrieving
			if(validateForm(sheetObj,formObj,sAction)){
				formObj.f_cmd.value=SEARCH;	
				var sXml=sheetObj.GetSearchData("BCM_FIN_0005GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(""));
				var arrXml=sXml.split("|$$|");
				if (arrXml.length > 0) sheetObjects[0].LoadSearchData(arrXml[0],{Sync:1} );
			}
			break;
		case IBSAVE:        //Saving
			if(validateForm(sheetObj,formObj,sAction)){	
				if(checkDupKeyValue(sheetObj)) {
					formObj.f_cmd.value=MULTI;
					var sParam=ComGetSaveString(sheetObj);
					if (sheetObj.RowCount()== 0 || (!sheetObj.IsDataModified()&& sParam == "")){
						ComShowCodeMessage("FIN00002");
						return; 
					}
					sParam += "&" + FormQueryString(formObj);
					var sXml=sheetObj.GetSaveData("BCM_FIN_0005GS.do", sParam);
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
			}
			break;
		case IBLOADEXCEL:	// LOAD EXCEL
			sheetObj.LoadExcel({ Mode:"HeaderSkip"});
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
		case SEARCH04: // Retrieving
			formObj.f_cmd.value=SEARCH04;
			var val=sheetObj.GetCellValue(row, col);
			var params=FormQueryString(formObj) + "&vsl_cd=" + val;
			var sXml=sheetObj.GetSearchData("FINCommonGS.do", params);
			var state=ComGetEtcData(sXml, ComWebKey.Trans_Result_Key);
			if (state == 'S') {
				if(ComGetEtcData(sXml, "result") == null || ComGetEtcData(sXml, "result") == 'null'){
					ComShowCodeMessage("FIN00003", "Vessel Code");
					sheetObj.SetCellValue(row, "vsl_cd","",0);
					sheetObj.SelectCell(row, "vsl_cd");
				}
			}
		break;
		case SEARCH05: // Retrieving
			formObj.f_cmd.value=SEARCH05;
			var val=sheetObj.GetCellValue(row, col);
			var params=FormQueryString(formObj) + "&rev_port_cd=" + val;
			var sXml=sheetObj.GetSearchData("FINCommonGS.do", params);
			var state=ComGetEtcData(sXml, ComWebKey.Trans_Result_Key);
			if (state == 'S') {
				if(ComGetEtcData(sXml, "result") == null || ComGetEtcData(sXml, "result") == 'null'){
					ComShowCodeMessage("FIN00003", "Revenue Port Code");
					sheetObj.SetCellValue(row, "rev_port_cd","",0);
					sheetObj.SelectCell(row, "rev_port_cd");
				}
			}
		break;
	}
}
/**
 * Removing IBSheet Row <br>
 * param sheetObj
 **/
function rowRemove(sheetObj){
	ComRowHideDelete(sheetObj, "DelChk");
}
/**
 * Loading the event of HTML control in the page dynamically.
 **/
function initControl(){
	//** Date Delimiter **/
	DATE_SEPARATOR="-";
	//handling the occurring beforedeactivate event to the all fields   
	axon_event.addListenerForm  ('beforedeactivate', 'obj_deactivate', form);
	//handling the occurring beforeactivate event to the all fields that contain dataformat attribute   
	axon_event.addListenerFormat('beforeactivate'  , 'obj_activate'  , form); 	
	//handling the occurring keypress event to the all fields that contain dataformat attribute   
	axon_event.addListenerFormat('keypress'        , 'obj_keypress'  , form); 	
	// handling the occurring keypress event to s_exe_yrmon and s_rev_yrmon
	axon_event.addListener  ('keypress', 'num_keypress'         , 's_exe_yrmon', 's_rev_yrmon');
	// handling the occurring keypress event to s_vvd and s_vsl_cd
	axon_event.addListener  ('keypress', 'enguppernum_keypress' , 's_vvd', 's_vsl_cd');
}
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
 * Removing the delimiter in case of occurring focus event in HTML control
 **/
function obj_activate(){
	ComClearSeparator(event.srcElement);
}
 /**
  * Allowed to input number only in case of occurring keypress event in HTML control
  **/
 function num_keypress(){
 	ComKeyOnlyNumber('num');
 }
  /**
   * Converting the inputted the alphabet to uppercase in case of occurring keypress event in HTML control
   **/
 function enguppernum_keypress(){
 	ComKeyOnlyAlphabet('uppernum');
 }
/**
 * Calling this function after finishing to retrieve sheet1
 * param : sheetObj, ErrMsg
 **/
function sheet1_OnSearchEnd(sheetObj, ErrMsg){
	for (var ir=1; ir<=sheetObj.LastRow(); ir++){
		sheetObj.SetCellEditable(ir, "exe_yrmon",0);
		sheetObj.SetCellEditable(ir, "rev_yrmon",0);
		sheetObj.SetCellEditable(ir, "vsl_cd",0);
		sheetObj.SetCellEditable(ir, "skd_dir_cd",0);
		sheetObj.SetCellEditable(ir, "skd_voy_no",0);
		sheetObj.SetCellEditable(ir, "rev_dir_cd",0);
		sheetObj.SetCellEditable(ir, "estm_vvd_tp_cd",0);
		sheetObj.SetCellEditable(ir, "estm_vvd_tp_cd",0);
		sheetObj.SetCellEditable(ir, "estm_ioc_div_cd",0);
	}
}
/**
 * handling process for input validation <br>
 * param : sheetObj, formObj, sAction
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
			} else if(sheetObj.GetCellValue(ir,"rlane_cd") == ""){
				ComShowCodeMessage("FIN00001", "Revenue Lane");
				sheetObj.SelectCell(ir,"rlane_cd");
				return false;
			} else if(sheetObj.GetCellValue(ir,"vsl_cd") == ""){
				ComShowCodeMessage("FIN00001", "Vessel Code");
				sheetObj.SelectCell(ir,"vsl_cd");
				return false;
			} else if(sheetObj.GetCellValue(ir,"rev_port_cd") == ""){
				ComShowCodeMessage("FIN00001", "Revenue Lane");
				sheetObj.SelectCell(ir,"rev_port_cd");
				return false;
			}
			if(   sheetObj.GetCellValue(ir,"vst_dt") != "" && sheetObj.GetCellValue(ir,"ved_dt") == "") {
				ComShowCodeMessage("FIN00001", "Voyage End DT");
				sheetObj.SelectCell(ir,"ved_dt");
				return false;
			}
			if(   sheetObj.GetCellValue(ir,"ved_dt") != "" && sheetObj.GetCellValue(ir,"vst_dt") == "") {
				ComShowCodeMessage("FIN00001", "Voyage Start DT");
				sheetObj.SelectCell(ir,"vst_dt");
				return false;
			}
			if(parseInt(sheetObj.GetCellValue(ir,"vst_dt")) > parseInt(sheetObj.GetCellValue(ir,"ved_dt"))) {
				ComShowCodeMessage("FIN00005", "Voyage Start DT", "Voyage End DT");
				sheetObj.SelectCell(ir,"vst_dt");
				return false;
			}
		}
	}
	return true;
}
/**
 * Checking the duplicated key in GL Estimate Revenue VVD <br>
 **/
function checkDupKeyValue(sheetObj) {
	var dupRow=0;
	// Checking whether Rlane Code and Zn Ioc Code are duplicated or not
	dupRow=sheetObj.ColValueDup("exe_yrmon|rev_yrmon|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd|estm_vvd_tp_cd|estm_ioc_div_cd", false);
	if(dupRow > 0) {
		ComShowCodeMessage("FIN00004", "( Execute Yrmon / Rev Yrmon / Vessel Code / Voyage No / Direction Code / Revenue Lane Direction / Estimate VVD Type / Estimate IOC DIV )");
		sheetObj.SelectCell(dupRow, "exe_yrmon");
		return false; 
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
	}else if(sheetObj.ColSaveName(col) == "rlane_cd" && sheetObj.GetCellValue(row, "rlane_cd") != "") {
		doActionIBSheet(sheetObj, document.form, SEARCH03, row, col);
	}else if(sheetObj.ColSaveName(col) == "vsl_cd" && sheetObj.GetCellValue(row, "vsl_cd") != "") {
		doActionIBSheet(sheetObj, document.form, SEARCH04, row, col);
	}else if(sheetObj.ColSaveName(col) == "rev_port_cd" && sheetObj.GetCellValue(row, "rev_port_cd") != "") {
		doActionIBSheet(sheetObj, document.form, SEARCH05, row, col);
	}else if(sheetObj.ColSaveName(col) == "skd_voy_no" && sheetObj.GetCellValue(row, "skd_voy_no") != "") {
		var no=sheetObj.GetCellValue(row, "skd_voy_no");
		if(no.length < 4){
			ComShowCodeMessage("FIN00003", "Voyage No");
			sheetObj.SetCellValue(row, "skd_voy_no","",0);
			return;
		}
	}
}
function searchVslCode(vsl_cd){
	if(vsl_cd == '') return;
	vsl_cd=vsl_cd.toUpperCase();
	var formObj=document.form;
	formObj.f_cmd.value=SEARCH04;
	var params=FormQueryString(formObj) + "&vsl_cd=" + vsl_cd;
 	var sXml=sheetObjects[0].GetSearchData("FINCommonGS.do", params);
	var state=ComGetEtcData(sXml, ComWebKey.Trans_Result_Key);
	if (state == 'S') {
		if(ComGetEtcData(sXml, "result") == null || ComGetEtcData(sXml, "result") == 'null'){
			ComShowCodeMessage("FIN00003", "Vessel Code");
			document.form.s_vsl_cd.value="";
			document.form.s_vsl_cd.focus();
		}
	}
}
function searchVvd(vvd){
	if(vvd == '') return;
	if(vvd.length < 10){
		ComShowCodeMessage("FIN00003", "VVD");
		document.form.s_vvd.value="";
		document.form.s_vvd.focus();
		return;
	}
	vvd=vvd.toUpperCase();
	var formObj=document.form;
	formObj.f_cmd.value=SEARCH08;
	var params=FormQueryString(formObj) + "&vvd=" + vvd;
	var sXml=sheetObjects[0].GetSearchData("FINCommonGS.do", params);
	var state=ComGetEtcData(sXml, ComWebKey.Trans_Result_Key);
	if (state == 'S') {
		if(ComGetEtcData(sXml, "result") == null || ComGetEtcData(sXml, "result") == 'null'){
			ComShowCodeMessage("FIN00003", "VVD");
			document.form.s_vvd.value="";
			document.form.s_vvd.focus();
		}
	}
}
