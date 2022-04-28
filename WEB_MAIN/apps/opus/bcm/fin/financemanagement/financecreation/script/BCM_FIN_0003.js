/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_FIN_0003.js
*@FileTitle  : AR Master Revenue VVD
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
 * @class AR Master Revenue VVD : business script for AR Master Revenue VVD
 */

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
	sheet1_OnLoadFinish(sheet1);
}


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
			case "rev_yrmon_cal":
				var cal=new ComCalendar();
				cal.setDisplayType('month');
				cal.select(form.s_rev_yrmon, 'yyyy-MM');
				break;
			case "btn_vvdCreate":
				var url = "/opuscntr/BCM_FIN_0011.do";
				var winName = "BCM_FIN_0011";
				var reqWin = ComOpenWindowCenter(url,winName,1100,550,true);	
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
* Vessel Code Popup<br>
* @param {arry} aryPopupData   sheetObjects[0]  sheetIdx
*/
function setVesselCode(aryPopupData, Row, Col, sheetIdx) {
	form.s_vsl_cd.value=aryPopupData[0][3];
}
/**
 * registering IBCombo Object as list
 * adding process for list in case of needing batch processing with other items 
 * defining list on the top of source
 */
function setSheetObject(sheet_obj){
   sheetObjects[sheetCnt++]=sheet_obj;
}


function sheet1_OnLoadFinish(sheetObj) {  
	sheetObj.SetWaitImageVisible(0);
	doActionIBSheet(sheetObj, document.form, IBROWSEARCH, "", "ComCd");
	sheetObj.SetWaitImageVisible(1);
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
				
				   
				   var HeadTitle="|Del|Vessel Code|Voyage No|Direction Code|Revenue Lane Direction|Voyage Type|Service Lane|Port Check Flag|Revenue Port|Lod Qty|Rev Yrmon|Common VVD Flag|VVD Common Level|Revenue Lane|Delete Flag|Vessel Code|Voyage No|Direction Code|Revenue Lane Direction";
				   var headCount=ComCountHeadTitle(HeadTitle);

				   SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );

				   var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
				   var headers = [ { Text:HeadTitle, Align:"Center"} ];
				   InitHeaders(headers, info);

				   var cols = [ {Type:"Status",    Hidden:1,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
								{Type:"CheckBox",  Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
								{Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"vsl_cd",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:4, AcceptKeys:"E|[0123456789]", InputCaseSensitive:1 },
								{Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"skd_voy_no",      KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:4, AcceptKeys:"N" },
								{Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"skd_dir_cd",      KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1, AcceptKeys:"E", InputCaseSensitive:1 },
								{Type:"Text",      Hidden:0,  Width:180,  Align:"Center",  ColMerge:0,   SaveName:"rlane_dir_cd",    KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1, AcceptKeys:"E", InputCaseSensitive:1 },
								{Type:"Combo",     Hidden:0,  Width:140,  Align:"Left",    ColMerge:0,   SaveName:"voy_tp_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:2 },
								{Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"slan_cd",         KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3, AcceptKeys:"E|[0123456789]", InputCaseSensitive:1 },
								{Type:"Combo",     Hidden:0,  Width:130,  Align:"Center",  ColMerge:0,   SaveName:"port_chk_flg",    KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 },
								{Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"rev_port_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:5, AcceptKeys:"E", InputCaseSensitive:1 },
								{Type:"Float",     Hidden:0,  Width:87,   Align:"Right",   ColMerge:0,   SaveName:"lod_qty",         KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:1,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 },
								{Type:"Date",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"rev_yrmon",       KeyField:0,   CalcLogic:"",   Format:"Ym",          PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:6 },
								{Type:"Combo",     Hidden:0,  Width:140,  Align:"Center",  ColMerge:0,   SaveName:"com_vvd_flg",     KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 },
								{Type:"Int",       Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:"vvd_com_lvl",     KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 },
								{Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"rlane_cd",        KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:5, AcceptKeys:"E|[0123456789]", InputCaseSensitive:1 },
								{Type:"Combo",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"delt_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 },
								{Type:"Text",      Hidden:1,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"h_vsl_cd" },
								{Type:"Text",      Hidden:1,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"h_skd_voy_no" },
								{Type:"Text",      Hidden:1,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"h_skd_dir_cd" },
								{Type:"Text",      Hidden:1,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"h_rlane_dir_cd" } ];
					
					InitColumns(cols);

					SetEditable(1);
					SetCountPosition(0);
					SetWaitImageVisible(0);
					SetColProperty("port_chk_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
					SetColProperty("com_vvd_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
					SetColProperty("delt_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
					resizeSheet();
				}
			  break;
	}
}

function resizeSheet(){
	ComResizeSheet(sheetObjects[0]);
}
/**
 * Handling the process about the sheet
 **/
function doActionIBSheet(sheetObj,formObj,sAction,row,col){
	sheetObj.ShowDebugMsg(false);
	switch(sAction){
		case IBSEARCH:      
			if(validateForm(sheetObj,formObj,sAction)){
				formObj.f_cmd.value=SEARCH;	
				var sXml=sheetObj.GetSearchData("BCM_FIN_0003GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(""));
				var arrXml=sXml.split("|$$|");
				if (arrXml.length > 0) sheetObjects[0].LoadSearchData(arrXml[0],{Sync:1} );
			}
			break;
		case IBSAVE:        
			if (sheetObj.RowCount()== 0 || (!sheetObj.IsDataModified())){
				ComShowCodeMessage("FIN00002");
				return; 
			}
			if(validateForm(sheetObj,formObj,sAction)){	
				formObj.f_cmd.value=MULTI;
				var sParam=ComGetSaveString(sheetObj);
				//if (sheetObj.RowCount == 0 || (!sheetObj.IsDataModified && sParam == "")){
				//	ComShowCodeMessage("FIN00002");
				//	return; 
				//}
				sParam += "&" + FormQueryString(formObj);
				var sXml=sheetObj.GetSaveData("BCM_FIN_0003GS.do", sParam);
				var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
				var arrXml=sXml.split("|$$|");
				if (arrXml.length > 0){
					if (result == 'S'){
						//sheetObjects[0].LoadSearchData(arrXml[0],{Sync:1} );
						ComShowCodeMessage("FIN00006");
					} else{
						sheetObjects[0].LoadSaveData(arrXml[0]);
					}
				}
			}
			break;
			
		case IBLOADEXCEL:	// LOAD EXCEL
		sheetObj.LoadExcel({Append:1,ColumnMapping:'||2|3|4|5|6|7|8|9|10|11|12|13|14|15',WorkSheetNo:"1"});
//		sheetObj.LoadExcel(true);
		break;
		
		case SEARCH01:
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
		case SEARCH03: 
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
		case SEARCH04: 
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
		case SEARCH05: 
			formObj.f_cmd.value=SEARCH05;
var val=sheetObj.GetCellValue(row, col);
			var params=FormQueryString(formObj) + "&rev_port_cd=" + val;
			var sXml=sheetObj.GetSearchData("FINCommonGS.do", params);
			var state=ComGetEtcData(sXml, ComWebKey.Trans_Result_Key);
			if (state == 'S') {
				if(ComGetEtcData(sXml, "result") == null || ComGetEtcData(sXml, "result") == 'null'){
					ComShowCodeMessage("FIN00003", "Revenue Port");
					sheetObj.SetCellValue(row, "rev_port_cd","",0);
					sheetObj.SelectCell(row, "rev_port_cd");
				}
			}
		break;
		/*case SEARCH06: 
			formObj.f_cmd.value=SEARCH06;
var val=sheetObj.GetCellValue(row, col);
			var params=FormQueryString(formObj) + "&" + sheetObj.GetSaveString();
//parameter changed[check again]CLT 			var sXml=sheetObj.GetSearchData("FINCommonGS.do", params);
			var state=ComGetEtcData(sXml, ComWebKey.Trans_Result_Key);
			if (state == 'S') {
				if(ComGetEtcData(sXml, "result") == null || ComGetEtcData(sXml, "result") == 'null'){
					ComShowCodeMessage("FIN00003", "Revenue VVD data");
					//sheetObj.CellValue2(row, "slan_cd") = "";
					sheetObj.SelectCell(row, "rev_port_cd");
				}
			}
		break;*/
		case IBROWSEARCH:  
		if (col == "ComCd") {
			//Voyage Type Code
			CoFinGetBizCombo('GRID', document.form, sheetObj, 'CD01226', 'voy_tp_cd', 'voy_tp_nm', '7', 'FINCommonGS.do', '','Y');
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
	axon_event.addListener('keydown', 'ComKeyEnter', 'form');
}

/**
 * Calling this function after finishing to retrieve sheet1<br>
 **/
function sheet1_OnSearchEnd(sheetObj, ErrMsg){
	for (var ir=1; ir<=sheetObj.LastRow(); ir++){
		sheetObj.SetCellEditable(ir, "vsl_cd",0);
		sheetObj.SetCellEditable(ir, "skd_voy_no",0);
		sheetObj.SetCellEditable(ir, "skd_dir_cd",0);
		sheetObj.SetCellEditable(ir, "rlane_dir_cd",0);
	}
}
/**
 * handling process for input validation 
 **/
function validateForm(sheetObj,formObj,sAction){
	if(sAction == 0){
		if (!ComChkValid(formObj)) return false;
	}else{
		for(var ir=1; ir<=sheetObj.LastRow(); ir++){
			if(sheetObj.GetCellValue(ir,"vsl_cd") == ""){
				ComShowCodeMessage("FIN00001", "Vessel Code");
				sheetObj.SelectCell(ir,"vsl_cd");
				return false;
			} else if(sheetObj.GetCellValue(ir,"skd_voy_no") == ""){
				ComShowCodeMessage("FIN00001", "Voyage No");
				sheetObj.SelectCell(ir,"skd_voy_no");
				return false;
			} else if(sheetObj.GetCellValue(ir,"skd_dir_cd") == ""){
				ComShowCodeMessage("FIN00001", "Direction Code");
				sheetObj.SelectCell(ir,"skd_dir_cd");
				return false;
			} else if(sheetObj.GetCellValue(ir,"rlane_dir_cd") == ""){
				ComShowCodeMessage("FIN00001", "Revenue Lane Direction");
				sheetObj.SelectCell(ir,"rlane_dir_cd");
				return false;
			} else if(sheetObj.GetCellValue(ir,"slan_cd") == ""){
				ComShowCodeMessage("FIN00001", "Service Lane");
				sheetObj.SelectCell(ir,"slan_cd");
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
	
	    // 대문자처리
		if(col_save_name=="vsl_cd"||col_save_name=="skd_dir_cd"||col_save_name=="rlane_dir_cd"||col_save_name=="slan_cd"){
			sheetObj.SetCellValue(row, col, val.toUpperCase(),0);
		}
		if(sheetObj.ColSaveName(col) == "slan_cd" && sheetObj.GetCellValue(row, "slan_cd") != "") {
			doActionIBSheet(sheetObj, document.form, SEARCH01, row, col);
		}else if(sheetObj.ColSaveName(col) == "rlane_cd" && sheetObj.GetCellValue(row, "rlane_cd") != "") {
			doActionIBSheet(sheetObj, document.form, SEARCH03, row, col);
		}else if(sheetObj.ColSaveName(col) == "vsl_cd" && sheetObj.GetCellValue(row, "vsl_cd") != "") {
			doActionIBSheet(sheetObj, document.form, SEARCH04, row, col);
		}else if(sheetObj.ColSaveName(col) == "rev_port_cd" && sheetObj.GetCellValue(row, "rev_port_cd") != "") {
			doActionIBSheet(sheetObj, document.form, SEARCH05, row, col);
		}else if(sheetObj.ColSaveName(col) == "vvd_com_lvl" && sheetObj.GetCellValue(row, "vvd_com_lvl") != "") {
			var lvl=sheetObj.GetCellValue(row, "vvd_com_lvl");
			if(lvl >6 || lvl <1){
				ComShowCodeMessage("FIN00003", "VVD Common Level");
				sheetObj.SetCellValue(row, "vvd_com_lvl","",0);
				sheetObj.SelectCell(row,"vvd_com_lvl");
				return;
			}
		}else if(sheetObj.ColSaveName(col) == "skd_voy_no" && sheetObj.GetCellValue(row, "skd_voy_no") != "") {
		var no=sheetObj.GetCellValue(row, "skd_voy_no");
			if(no.length < 4){
				ComShowCodeMessage("FIN00003", "Voyage No");
				sheetObj.SetCellValue(row, "skd_voy_no","",0);
				sheetObj.SelectCell(row,"skd_voy_no");
				return;
			}
		}else if(sheetObj.ColSaveName(col) == "rev_yrmon" && sheetObj.GetCellValue(row, "rev_yrmon") != ""){
		var yrmon=sheetObj.GetCellValue(row, "rev_yrmon");
		if(yrmon < "200001"){
			ComShowCodeMessage("FIN00007", "");
			sheetObj.SelectCell(row,"rev_yrmon");
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

//function searchVvd(vvd){
//	if(vvd == '') return;
//	if(vvd.length < 10){
//		ComShowCodeMessage("FIN00003", "VVD");
//		document.form.s_vvd.value="";
//		document.form.s_vvd.focus();
//		return;
//	}
//	vvd=vvd.toUpperCase();
//	var formObj=document.form;
//	formObj.f_cmd.value=SEARCH08;
//	var params=FormQueryString(formObj) + "&vvd=" + vvd;
//	var sXml=sheetObjects[0].GetSearchData("FINCommonGS.do", params);
//	var state=ComGetEtcData(sXml, ComWebKey.Trans_Result_Key);
//	if (state == 'S') {
//		if(ComGetEtcData(sXml, "result") == null || ComGetEtcData(sXml, "result") == 'null'){
//			ComShowCodeMessage("FIN00003", "VVD");
//			document.form.s_vvd.value="";
//			document.form.s_vvd.focus();
//		}
//	}
//}