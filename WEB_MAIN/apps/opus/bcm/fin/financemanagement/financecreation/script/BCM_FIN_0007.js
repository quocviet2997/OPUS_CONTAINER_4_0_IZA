/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : BCM_FIN_0007.js
*@FileTitle  : GL Daily Exchange Rate
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/07
=========================================================*/
// The common variables
var tabObjects=new Array();
var tabCnt=0;
var beforetab=1;
var sheetObjects=new Array();
var sheetCnt=0;
// Event handler processing by button click event */
document.onclick=processButtonClick;
// Event handler processing by button name */
function processButtonClick(){
	var sheetObject=sheetObjects[0];
	var formObject=document.form;
	try{
		var srcName=ComGetEvent("name");
		if(ComGetBtnDisable(srcName)) return false;
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
				sheetObject.SetCellEditable(row, "acct_xch_rt_dt",1);
				sheetObject.SetCellEditable(row, "acct_xch_rt_lvl",1);
				sheetObject.SetCellEditable(row, "fm_curr_cd",1);
				sheetObject.SetCellEditable(row, "to_curr_cd",1);
				break;
			case "btn_del":
				rowRemove(sheetObject);
				break;
			case "btns_calXchRtFr":
				var cal=new ComCalendar();
				cal.select(form.s_acct_xch_rt_fm_dt, 'yyyy-MM-dd');
				break;
			case "btns_calXchRtTo":
				var cal=new ComCalendar();
				cal.select(form.s_acct_xch_rt_to_dt, 'yyyy-MM-dd');
				break;
		} // end switch
	}catch(e){
		if( e == "[object Error]"){
			ComShowMessage(OBJECT_ERROR);
		} else{
			ComShowMessage(e.message);
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
				   var HeadTitle="|Del|Exchange Rate Date|Rate Type|From Currency|To Currency|Rate|Rate User Level|Delete Flag";
				   var headCount=ComCountHeadTitle(HeadTitle);
				   (headCount, 0, 0, true);
				   SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
				   var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
				   var headers = [ { Text:HeadTitle, Align:"Center"} ];
				   InitHeaders(headers, info);
				   var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
				             {Type:"DelCheck",  Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
				             {Type:"Date",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:"acct_xch_rt_dt",   KeyField:1,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:8 },
				             {Type:"Int",       Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"acct_xch_rt_lvl",  KeyField:1,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 },
				             {Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"fm_curr_cd",       KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3 },
				             {Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"to_curr_cd",       KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3 },
				             {Type:"Float",     Hidden:0,  Width:113,  Align:"Right",   ColMerge:0,   SaveName:"conv_xch_rt",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:5,   UpdateEdit:1,   InsertEdit:1,   EditLen:15 },
				             {Type:"Text",      Hidden:0,  Width:123,  Align:"Center",  ColMerge:0,   SaveName:"acct_rt_usr_lvl",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 },
				             {Type:"Combo",     Hidden:0, Width:95,   Align:"Center",  ColMerge:0,   SaveName:"delt_flg",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 } ];
				    
				   InitColumns(cols);
				   SetEditable(1);
				   SetWaitImageVisible(0);
				   SetColProperty("delt_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
				   SetSheetHeight(380);
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
				sheetObj.SetColProperty(0,2,{Type:"Date",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:"acct_xch_rt_dt",   KeyField:1,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:8 });
				sheetObj.SetColProperty(0,3,{Type:"Int",       Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"acct_xch_rt_lvl",  KeyField:1,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:1 });
				sheetObj.SetColProperty(0,4,{Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"fm_curr_cd",       KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:3 });
				sheetObj.SetColProperty(0,5,{Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"to_curr_cd",       KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:3 });
				formObj.f_cmd.value=SEARCH;
				ComOpenWait(true);
 				var sXml=sheetObj.GetSearchData("BCM_FIN_0007GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(""));
				var arrXml=sXml.split("|$$|");
				if (arrXml.length > 0) sheetObjects[0].LoadSearchData(arrXml[0],{Sync:1} );
				ComOpenWait(false);
			}
			break;
		case IBSAVE:        //Saving
			if (sheetObj.RowCount()== 0 || !sheetObj.IsDataModified()){
				ComShowCodeMessage("FIN00002");
				return; 
			}
			if(validateForm(sheetObj,formObj,sAction)){
				formObj.f_cmd.value=MULTI;
				var sParam=ComGetSaveString(sheetObj, true, true);
				if(sParam == "" ){
					return;
				}
				if (sheetObj.RowCount()== 0 || (!sheetObj.IsDataModified()&& sParam == "")){
					ComShowCodeMessage("FIN00002");
					return; 
				}
				sParam += "&" + FormQueryString(formObj);
				ComOpenWait(true);
 				var sXml=sheetObj.GetSaveData("BCM_FIN_0007GS.do", sParam);
				var currRow=ComGetEtcData(sXml, "curr_row");
				var currCol=ComGetEtcData(sXml, "curr_col");
				if(currRow != ""){
					sheetObj.SetCellValue(currRow, currCol,"",0);
					sheetObj.SelectCell(currRow, currCol);
				}
				var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
				var arrXml=sXml.split("|$$|");
				if (arrXml.length > 0){
					if (result == 'S'){
						sheetObjects[0].LoadSearchData(arrXml[0],{Sync:1} );
					} else{
 						sheetObjects[0].LoadSaveData(arrXml[0]);
					}
				}
				ComOpenWait(false);
			}
			break;
		case IBLOADEXCEL:	// LOAD EXCEL
			sheetObj.SetColProperty(0,2,{Type:"Date",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:"acct_xch_rt_dt",   KeyField:1,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:8 });
			sheetObj.SetColProperty(0,3,{Type:"Int",       Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"acct_xch_rt_lvl",  KeyField:1,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 });
			sheetObj.SetColProperty(0,4,{Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"fm_curr_cd",       KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3 });
			sheetObj.SetColProperty(0,5,{Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"to_curr_cd",       KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3 });
			
			sheetObj.LoadExcel({ Mode:"HeaderMatch",WorkSheetNo:"1",StartRow:"-1",EndRow:"-1",WorkSheetName:"",Append:false,ColumnMapping:""});
    		break;
		case SEARCH06: // retrieving
			formObj.f_cmd.value=SEARCH06;
			var val=sheetObj.GetCellValue(row, col);
			var params=FormQueryString(formObj) + "&curr_cd=" + val;
 			var sXml=sheetObj.GetSearchData("FINCommonGS.do", params);
			var state=ComGetEtcData(sXml, ComWebKey.Trans_Result_Key);
			if (state == 'S') {
				if(ComGetEtcData(sXml, "result") == null || ComGetEtcData(sXml, "result") == 'null'){
					if(col == 4){
						ComShowCodeMessage("FIN00003", "From Currency");
						sheetObj.SetCellValue(row, "fm_curr_cd","",0);
						sheetObj.SelectCell(row, "fm_curr_cd");
					}else if(col == 5){
						ComShowCodeMessage("FIN00003", "To Currency");
						sheetObj.SetCellValue(row, "to_curr_cd","",0);
						sheetObj.SelectCell(row, "to_curr_cd");
					}
				}
			}
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
	// handling the occurring beforedeactivate event to the all fields
	axon_event.addListenerForm  ('beforedeactivate', 'obj_deactivate', form); 	
	// handling the occurring beforeactivate event to the all fields that contain dataformat attribute
	axon_event.addListenerFormat('beforeactivate'  , 'obj_activate'  , form); 	
	// handling the occurring keypress event to the all fields that contain dataformat attribute
	//axon_event.addListenerFormat('keypress'        , 'obj_keypress'  , form); 	 
	// handling calling num_keypress() in case of occurring keypress event to Account Exchange Rate Year Month field.
	//axon_event.addListener  ('keypress', 'num_keypress', 's_acct_xch_rt_fm_dt');
	// handling calling num_keypress() in case of occurring keypress event to Account Exchange Rate Year Month field.
	//axon_event.addListener  ('keypress', 'num_keypress', 's_acct_xch_rt_to_dt');		
	// handling calling eng_keypress() in case of occurring keypress event to the Currency Code field. 
	//axon_event.addListener  ('keypress', 'eng_keypress', 's_fm_curr_cd');
	// handling calling eng_keypress() in case of occurring keypress event to the Currency Code field. 
	//axon_event.addListener  ('keypress', 'eng_keypress', 's_to_curr_cd');		
}
/**
 * Checking the validation in case of occuring blur event in HTML control <br>
 **/
function obj_deactivate(){
	var formObject=document.form;
	//if (ComGetEvent().getAttribute("required") != null) return;
	switch(ComGetEvent().name){
		case "s_acct_xch_rt_fm_dt":
			ComChkObjValid(ComGetEvent());
			break;
		case "s_acct_xch_rt_to_dt":
			ComChkObjValid(ComGetEvent());
			break;
		default:
			//ComAddSeparator(ComGetEvent());
			ComChkObjValid(ComGetEvent());
	}
}
/**
 * Removing the delimiter in case of occurring focus event in HTML control <br>
 **/
function obj_activate(){
	ComClearSeparator(ComGetEvent());
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
function sheet1_OnSearchEnd(sheetObj, ErrMsg){
}
/**
 * handling process for input validation <br>
 **/
function validateForm(sheetObj,formObj,sAction){
	if(sAction == 0){
		if(formObj.s_acct_xch_rt_fm_dt.value == "" || formObj.s_acct_xch_rt_to_dt.value == ""){
			ComShowCodeMessage("FIN00001", "Exchage Rate Date");
			return false;
		}
	}else{
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
	if(sheetObj.ColSaveName(col) == "fm_curr_cd" && sheetObj.GetCellValue(row, "fm_curr_cd") != "") {
		doActionIBSheet(sheetObj, document.form, SEARCH06, row, col);
	} else if(sheetObj.ColSaveName(col) == "to_curr_cd" && sheetObj.GetCellValue(row, "to_curr_cd") != "") {
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
	} else if(sheetObj.ColSaveName(col) == "acct_xch_rt_dt" && sheetObj.GetCellValue(row, "acct_xch_rt_dt") != "") {
		var yrmondd=sheetObj.GetCellValue(row, "acct_xch_rt_dt");
	    if(yrmondd < "20000101"){
		    ComShowCodeMessage("FIN00009", "");
		    sheetObj.SelectCell(row,"acct_xch_rt_dt");
		    return;
	    }
    }
}
