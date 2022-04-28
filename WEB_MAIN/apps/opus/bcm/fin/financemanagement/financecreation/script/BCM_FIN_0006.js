/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 		: BCM_FIN_0006.js
*@FileTitle 	: GL Monthly Exchange Rate
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
			case "btn_DownExcel":
				if(sheetObject.RowCount() < 1){//no data
        	     	ComShowCodeMessage("COM132501");
        	    } else{
        	    	sheetObject.Down2Excel();
        	    }
	    		break;				
			case "btn_add":
				var row=sheetObject.DataInsert(-1);
				break;
			case "btn_del":
				rowRemove(sheetObject);
				break;
			case "pop_vsl_code":
				ComOpenWindowCenter("COM_ENS_0081.do?pgmNo=COM_ENS_0081&slan_cd=" +  document.form.s_slan_cd.value, "0005", 500, 650, true);
				break;
			case "acct_xch_rt_yrmon_cal":
				var cal=new ComCalendar();
				cal.setDisplayType('month');
				cal.select(form.s_acct_xch_rt_yrmon, 'yyyy-MM');
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
/**
 * initializing sheet
 * implementing onLoad event handler in body tag
 * adding first-served functions after loading screen.
 */
function loadPage(){
	var formObj = document.form;
	var sheetObj = sheetObjects[0];
	formObj.f_cmd.value=SEARCH10;
	var params=FormQueryString(formObj);
	var sXml=sheetObj.GetSearchData("FINCommonGS.do", params);
	var currCd=ComGetEtcData(sXml, "result"); 
	for(i=0;i<sheetObjects.length;i++){
		ComConfigSheet (sheetObjects[i]);
		initSheet(sheetObjects[i],i+1,currCd);
		ComEndConfigSheet(sheetObjects[i]);
	}
	sheetObjects[0].SetExtendLastCol(0);
	for(k=0;k<tabObjects.length;k++){
		initTab(tabObjects[k],k+1);
	}
	initControl();   
	
	doActionIBSheet(sheetObjects[0], formObj, SEARCH07); //Currency ComboBox
}
/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
function initSheet(sheetObj,sheetNo,currCd){
	var cnt=0;
	switch(sheetNo){
		case 1:      //sheet1 init
			  with(sheetObj){
				   
				   var HeadTitle="|Del|Exchange Rate Yrmon|Rate Division|CURR Code|USD : Local|Local : "+currCd+"|USD : "+currCd+"|Rate User Level|Delete Flag|Acct Xch Rt Yrmon|Acct Sch Rt Lvl|Curr Code";
				   var headCount=ComCountHeadTitle(HeadTitle);

				   SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );

				   var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
				   var headers = [ { Text:HeadTitle, Align:"Center"} ];
				   InitHeaders(headers, info);

				   var cols = [ {Type:"Status",    Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
							    {Type:"CheckBox",  Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
							    {Type:"Date",      Hidden:0,  Width:180,  Align:"Center",  ColMerge:0,   SaveName:"acct_xch_rt_yrmon",    KeyField:1,   CalcLogic:"",   Format:"Ym",          PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:6 },
							    {Type:"Int",       Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"acct_xch_rt_lvl",      KeyField:1,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:1 },
							    {Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"curr_cd",              KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:3, AcceptKeys:"E" },
							    {Type:"Float",     Hidden:0,  Width:300,  Align:"Right",   ColMerge:0,   SaveName:"usd_locl_xch_rt",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:8,   UpdateEdit:0,   InsertEdit:0,   EditLen:15 },
							    {Type:"Float",     Hidden:0,  Width:300,  Align:"Right",   ColMerge:0,   SaveName:"locl_cny_xch_rt",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:8,   UpdateEdit:0,   InsertEdit:0,   EditLen:11 },
							    {Type:"Float",     Hidden:0,  Width:300,  Align:"Right",   ColMerge:0,   SaveName:"usd_cny_xch_rt",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:8,   UpdateEdit:0,   InsertEdit:0,   EditLen:11 },
							    {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"acct_rt_usr_lvl",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:1 },
							    {Type:"Combo",     Hidden:0,  Width:95,   Align:"Center",  ColMerge:0,   SaveName:"delt_flg",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:1 },
							    {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"h_acct_xch_rt_yrmon" },
							    {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"h_acct_xch_rt_lvl" },
							    {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"h_curr_cd" } ];
					
					InitColumns(cols);

					SetEditable(1);
					SetWaitImageVisible(0);
					SetColProperty("delt_flg", {ComboText:"Y|N", ComboCode:"Y|N"} );
					//SetSheetHeight(450);
					FitColWidth();
					SetColProperty(0 ,"curr_cd" , {AcceptKeys:"E"});
					resizeSheet();
				   }
			  
			break;
	}
}
/**
 * Handling the process about the sheet <br>
 * param : sheetObj, formObj, sAction, row, col
 **/
function doActionIBSheet(sheetObj,formObj,sAction,row,col){
	sheetObj.ShowDebugMsg(false);
	switch(sAction){
		case IBSEARCH:      //Retrieving
			if(validateForm(sheetObj,formObj,sAction)){
				formObj.f_cmd.value=SEARCH;
 				var sXml=sheetObj.GetSearchData("BCM_FIN_0006GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(""));
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
 				var sXml=sheetObj.GetSaveData("BCM_FIN_0006GS.do", sParam);
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
			
//		case IBLOADEXCEL:	// LOAD EXCEL
//			//sheetObj.LoadExcel(true);
//            with (sheetObj) {
//                if(LoadExcel(-1, 1, "", -1, -1, "", false, false, "")) {
//                	for (var i=HeaderRows(); i<=LastRow(); i++) {
//                		excel_upload_valid_chk(sheetObj, i);
//	                }
//                }
//            }	
//    		break;
			
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
					ComShowCodeMessage("FIN00003", "Slan Code");
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
					ComShowCodeMessage("FIN00003", "Revenue Lane Code");
					sheetObj.SetCellValue(row, "rlane_cd","",0);
					sheetObj.SelectCell(row, "rlane_cd");
				}
			}
		break;
		case SEARCH04: // retrieving
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
		case SEARCH05: // retrieving
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
		case SEARCH06: // retrieving
			formObj.f_cmd.value=SEARCH06;
			var val=sheetObj.GetCellValue(row, col);
			var params=FormQueryString(formObj) + "&curr_cd=" + val;
			var sXml=sheetObj.GetSearchData("FINCommonGS.do", params);
			var state=ComGetEtcData(sXml, ComWebKey.Trans_Result_Key);
			if (state == 'S') {
				if(ComGetEtcData(sXml, "result") == null || ComGetEtcData(sXml, "result") == 'null'){
					ComShowCodeMessage("FIN00003", "Currency Code");
					sheetObj.SetCellValue(row, "curr_cd","",0);
					sheetObj.SelectCell(row, "curr_cd");
				}
			}
		break;
		case SEARCH07:			
			var sXml=sheetObj.GetSearchData("SAPCommonGS.do", "f_cmd=" + SEARCH06 + "&value0=");
	    	var comboItems=ComGetEtcData(sXml, "curr_cd_list").split("|");
	    	MakeComboObject(s_curr_cd, comboItems);
	 		break;
	 		
	}
}
/**
 * Removing IBSheet Row <br>
 * @param{ibsheet} sheetObj    IBSheet Object
 **/
function rowRemove(sheetObj){
	ComRowHideDelete(sheetObj, "DelChk");
}
/**
 * Loading the event of HTML control in the page dynamically. <br>
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
//	// handling the occurring beforedeactivate event to the all fields
//	axon_event.addListenerForm  ('beforedeactivate', 'obj_deactivate', form); 	
//	// handling the occurring beforeactivate event to the all fields that contain dataformat attribute
//	axon_event.addListenerFormat('beforeactivate'  , 'obj_activate'  , form); 	
//	// handling the occurring keypress event to the all fields that contain dataformat attribute
//	axon_event.addListenerFormat('keypress'        , 'obj_keypress'  , form); 	 
//	// handling calling num_keypress() in case of occurring keypress event to Account Exchange Rate Year Month field.
//	axon_event.addListener  ('keypress', 'num_keypress', 's_acct_xch_rt_yrmon');	
//	// handling calling eng_keypress() in case of occurring keypress event to the Currency Code field. 
//	axon_event.addListener  ('keypress', 'eng_keypress', 's_curr_cd');				
//}

/**
 * Checking the validation in case of occuring blur event in HTML control <br>
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
 * Allowed to input number only in case of occurring keypress event in HTML control
 **/
function num_keypress(){
	ComKeyOnlyNumber('num');
}
/**
 * Calling this function after finishing to retrieve sheet1
 **/
//function sheet1_OnSearchEnd(sheetObj, ErrMsg){
//	for (var ir=1; ir<=sheetObj.LastRow(); ir++){
//		sheetObj.SetCellEditable(ir, "acct_xch_rt_yrmon",0);
//		sheetObj.SetCellEditable(ir, "acct_xch_rt_lvl",0);
//		sheetObj.SetCellEditable(ir, "curr_cd",0);
//	}
//}
/**
 * handling process for input validation <br>
 **/
function validateForm(sheetObj,formObj,sAction){
	if(sAction == 0){
		if (!ComChkValid(formObj)) return false;
	}else{
		for(var ir=1; ir<=sheetObj.LastRow(); ir++){
			if(sheetObj.GetCellValue(ir,"acct_xch_rt_yrmon") == ""){
				ComShowCodeMessage("FIN00001", "Exchage Rate Yrmon");
				sheetObj.SelectCell(ir,"acct_xch_rt_yrmon");
				return false;
			} else if(sheetObj.GetCellValue(ir,"acct_xch_rt_lvl") == ""){
				ComShowCodeMessage("FIN00001", "Rate Divison");
				sheetObj.SelectCell(ir,"acct_xch_rt_lvl");
				return false;
			} else if(sheetObj.GetCellValue(ir,"curr_cd") == ""){
				ComShowCodeMessage("FIN00001", "Curr Code");
				sheetObj.SelectCell(ir,"curr_cd");
				return false;
			} else if(sheetObj.GetCellValue(ir,"slan_cd") == ""){
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
				ComShowCodeMessage("FIN00001", "Revenue Port Code");
				sheetObj.SelectCell(ir,"rev_port_cd");
				return false;
			}
		}
	}
	return true;
}
/**
 * Calling this function in case of changing the cell value in sheet
 * param : {ibsheet} sheetObj, row, col, val
 **/
function sheet1_OnChange(sheetObj, row, col, val) {
	var formObject=document.form;
	var col_save_name=sheetObj.ColSaveName(col);
	
    // 대문자처리
	if(col_save_name=="curr_cd"){
		sheetObj.SetCellValue(row, col, val.toUpperCase(),0);
	}
	
		if(sheetObj.ColSaveName(col) == "slan_cd" && sheetObj.GetCellValue(row, "slan_cd") != "") {
			doActionIBSheet(sheetObj, document.form, SEARCH01, row, col);
		} else if(sheetObj.ColSaveName(col) == "rlane_cd" && sheetObj.GetCellValue(row, "rlane_cd") != "") {
			doActionIBSheet(sheetObj, document.form, SEARCH03, row, col);
		} else if(sheetObj.ColSaveName(col) == "vsl_cd" && sheetObj.GetCellValue(row, "vsl_cd") != "") {
			doActionIBSheet(sheetObj, document.form, SEARCH04, row, col);
		} else if(sheetObj.ColSaveName(col) == "rev_port_cd" && sheetObj.GetCellValue(row, "rev_port_cd") != "") {
			doActionIBSheet(sheetObj, document.form, SEARCH05, row, col);
		} else if(sheetObj.ColSaveName(col) == "curr_cd" && sheetObj.GetCellValue(row, "curr_cd") != "") {
			doActionIBSheet(sheetObj, document.form, SEARCH06, row, col);
		} else if(sheetObj.ColSaveName(col) == "acct_xch_rt_lvl" && sheetObj.GetCellValue(row, "acct_xch_rt_lvl") != "") {
			var lvl=sheetObj.GetCellValue(row, "acct_xch_rt_lvl");
			if(lvl > 6 || lvl < 1){
				ComShowCodeMessage("FIN00003", "Account Exchange Rate Level");
				sheetObj.SetCellValue(row, "acct_xch_rt_lvl","",0);
				sheetObj.SelectCell(row,"acct_xch_rt_lvl");
				return;
			}
		} else if(sheetObj.ColSaveName(col) == "acct_rt_usr_lvl" && sheetObj.GetCellValue(row, "acct_rt_usr_lvl") != "") {
		var lvl=sheetObj.GetCellValue(row, "acct_rt_usr_lvl");
			if(lvl > 6 || lvl < 1){
				ComShowCodeMessage("FIN00003", "Account Rate User Level");
				sheetObj.SetCellValue(row, "acct_rt_usr_lvl","",0);
				sheetObj.SelectCell(row,"acct_rt_usr_lvl");
				return;
			}
		}else if(sheetObj.ColSaveName(col) == "acct_xch_rt_yrmon" && sheetObj.GetCellValue(row, "acct_xch_rt_yrmon") != "") {
			var yrmon=sheetObj.GetCellValue(row, "acct_xch_rt_yrmon");
			if(yrmon < "200001"){
		    ComShowCodeMessage("FIN00007", "");
		    sheetObj.SelectCell(row,"acct_xch_rt_yrmon");
		    return;
			}
		}
}
/**
 * Excel Load data Valid check
 **/
function excel_upload_valid_chk(sheetObj,Row){
	if(sheetObj.GetCellValue(Row, "curr_cd") != "") {
	    doActionIBSheet(sheetObj, document.form, SEARCH06, Row, "curr_cd");
    }
	if(sheetObj.GetCellValue(Row, "acct_xch_rt_yrmon") != "") {
		var yrMon=sheetObj.GetCellValue(Row, "acct_xch_rt_yrmon");
	    if(!yrMon.match(/[0-9]{6}/)){
	    	ComShowCodeMessage("FIN00007", "");
	    }	    
    }
	if(sheetObj.GetCellValue(Row, "acct_rt_usr_lvl") != "") {
		var usrLevel=sheetObj.GetCellValue(Row, "acct_rt_usr_lvl");
		if(usrLevel.length != 1 || !usrLevel.match(/[0-9]{1}/)){
			ComShowCodeMessage("FIN00003", "Rate User Level");
		}    		    
    }
    return true;
}

function resizeSheet(){
	ComResizeSheet(sheetObjects[0]);
}

function MakeComboObject(comboObj, comboItems) {
	comboObj.InsertItem(0, "", "");

	for (var i=0 ; i < comboItems.length ; i++) 
	{
		var comboItem=comboItems[i].split("=");
		comboObj.InsertItem(i+1, comboItem[0] , comboItem[0]);
    }        
}