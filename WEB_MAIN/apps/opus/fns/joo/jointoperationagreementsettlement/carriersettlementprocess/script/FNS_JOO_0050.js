/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : FNS_JOO_0050.js
 *@FileTitle: Target Voyage vs Unsettled Status
 *@author   : CLT
 *@version  : 1.0
 *@since    : 2014/06/19
 =========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class FNS_JOO_0050 : business script for FNS_JOO_0050
 */
function FNS_JOO_0050() {
	this.processButtonClick=processButtonClick;
	this.setSheetObject=setSheetObject;
	this.loadPage=loadPage;
	this.initSheet=initSheet;
	this.initControl=initControl;
	this.doActionIBSheet=doActionIBSheet;
	this.setTabObject=setTabObject;
	this.validateForm=validateForm;
}
// common global variable
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
var prefix="sheet1_";
// Event handler processing by button click event */
document.onclick=processButtonClick;
// Event handler processing by button name */
function processButtonClick() {
	/***** setting sheet object *****/
	var sheetObject1=sheetObjects[0];
	/*******************************************************/
	var formObj=document.form;
	try {
		var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
		switch (srcName) {
		case "btn_Retrieve":
			doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
			break;
		case "btn_save":
			doActionIBSheet(sheetObjects[0], document.form, IBSAVE);
			break;
		case "btn_New":
			doActionIBSheet(sheetObjects[0], document.form, IBRESET);
			break;
		case "btn_DownExcel":
			if(sheetObject1.RowCount() < 1){//no data
       		 	ComShowCodeMessage("COM132501");
	       	}else{       
				var paramObj=new Object();
	            var url=ComJooGetPgmTitle(sheetObjects[0], paramObj);  
	              sheetObjects[0].Down2Excel({ HiddenColumn:1,Merge:1});
	        }

			//sheetObjects[0].SpeedDown2Excel(-1);
//            var paramObj=new Object();
//            var url=ComJooGetPgmTitle(sheetObjects[0], paramObj);  
//             sheetObjects[0].Down2Excel({ HiddenColumn:-1,Merge:true,URL:"url"});
			break;
		case "btn_acct_yrmon_fr_back":
			if (formObj.acct_yrmon_fr.value != "") {
				formObj.acct_yrmon_fr.value=ComGetDateAdd(formObj.acct_yrmon_fr.value + "-01", "M", -1).substring(0,7);
				//formObj.acct_yrmon_fr.value=ComGetDateAdd(fr+"-01","M",-1).substring(0,7);
			}
			sheetObjects[0].RemoveAll();
			break;
		case "btn_acct_yrmon_fr_next":
			if (formObj.acct_yrmon_fr.value  != "") {
				formObj.acct_yrmon_fr.value=ComGetDateAdd(formObj.acct_yrmon_fr.value + "-01", "M", +1).substring(0,7);
//				formObj.acct_yrmon_fr.value=ComGetDateAdd(fr+"-01","M",+1).substring(0,7);
			}
			sheetObjects[0].RemoveAll();
			break;
		case "btn_acct_yrmon_to_back":
			if (formObj.acct_yrmon_to.value!= "") {
				formObj.acct_yrmon_to.value=ComGetDateAdd(formObj.acct_yrmon_to.value + "-01", "M", -1).substring(0,7);
				//formObj.acct_yrmon_to.value=ComGetDateAdd(to+"-01","M",-1).substring(0,7);
			}
			sheetObjects[0].RemoveAll();
			break;
		case "btn_acct_yrmon_to_next":
			if (formObj.acct_yrmon_to.value != "") {
				formObj.acct_yrmon_to.value=ComGetDateAdd(formObj.acct_yrmon_to.value + "-01", "M", +1).substring(0,7);
				//formObj.acct_yrmon_to.value=ComGetDateAdd(to+"-01","M",+1).substring(0,7);
			}
			sheetObjects[0].RemoveAll();
			break;
		} // end switch
	} catch (e) {
		if (e == "[object Error]") {
			ComShowMessage(OBJECT_ERROR);
		} else {
			ComShowMessage(e.message);
		}
	}
}
/**
 * registering IBSheet Object as list
 * adding process for list in case of needing batch processing with other items
 * defining list on the top of source
 */
function setSheetObject(sheet_obj) {
	sheetObjects[sheetCnt++]=sheet_obj;
}
/** 
 * registering IBCombo Object as list
 * param : combo_obj
 * adding process for list in case of needing batch processing with other items
 * defining list on the top of source
 */
function setComboObject(combo_obj) {
	comboObjects[comboCnt++]=combo_obj;
}
/**
 * initializing sheet
 * implementing onLoad event handler in body tag
 * adding first-served functions after loading screen.
 */
function loadPage() {
	for (i=0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1);
		ComEndConfigSheet(sheetObjects[i]);
	}
	// initializing IBMultiCombo
	for ( var k=0; k < comboObjects.length; k++) {
		initCombo(comboObjects[k], k + 1);
	}
	initControl();
//	sheet1_OnSearchEnd(sheet1);
}
/**
 * setting Combo basic info
 * @param comboObj 
 * @param comboIndex Number
 */
function initCombo(comboObj, comboNo) {
	var formObject=document.form
	switch (comboNo) {
	case 1:
		with (comboObj) {
			SetMultiSelect(0);
			SetUseAutoComplete(1);
			SetColAlign(0, "left");
			SetColWidth(0, "80");
			ValidChar(2,1);    // Uppercase
			SetDropHeight(200);
			SetMaxLength(3);
		}
		var comboItems=(" |"+gTrdCd).split("|");
		addComboItem(comboObj, comboItems);           	
		break;
	case 2:
		with (comboObj) { 
			SetMultiSelect(0);
			SetUseAutoComplete(1);
			SetColAlign(0, "left");
			SetColWidth(0, "80");
			ValidChar(2,1);    // Uppercase
			SetDropHeight(160);
			SetMaxLength(5);
		}
		var comboItems=(" |"+gRlaneCd).split("|");
		addComboItem(comboObj, comboItems);           	
		break;
	case 3:
		with (comboObj) { 
			SetMultiSelect(0);
			SetUseAutoComplete(1);
			SetColAlign(0, "left");
			SetColWidth(0, "80");
			ValidChar(2,1);    // Uppercase
			SetDropHeight(160);
			SetMaxLength(3);
		}
		var comboItems=(" |"+gJoCrrCd).split("|");
		addComboItem(comboObj, comboItems);
		break;
	case 4:
		with (comboObj) {
			SetMultiSelect(0);
			SetUseAutoComplete(1);
			SetColAlign(0, "left");
			SetColWidth(0, "80");
			ValidChar(2,1);    // Uppercase
			SetDropHeight(200);
			SetMaxLength(3);
		}
		var comboItems=(" |"+gJoStlItmCd).split("|");
		addComboItem(comboObj, comboItems);
		break;
	case 5:
		with (comboObj) {
			SetMultiSelect(0);
			SetUseAutoComplete(1);
			SetColAlign(0, "left");
			SetColWidth(0, "75");
			SetDropHeight(200);
			SetMaxLength(3);
		}
		var comboItems=gOffList.split("|");
		addComboItem(comboObj, comboItems);
		comboObj.SetSelectIndex(0,false);
        if (comboItems.length == 1){
        	comboObj.SetEnable(0);
        }else{
        	comboObj.SetEnable(1);
        }		
		break;
	}
}
/**
 * loading HTML Control event <br>
 * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
 * @param {ibsheet} sheetObj    IBSheet Object
 * @param {int}     sheetNo     sequence number in sheetObjects array
 **/
function initControl() {
	var formObject=document.form;
//	axon_event.addListenerForm('keydown', 'ComKeyEnter', formObject);
//	axon_event.addListenerForm('keypress', 'fnObjKeyPress', formObject);
//	axon_event.addListener('click', 'fnDocClick', "btn_acct_yrmon_fr_back");
//	axon_event.addListener('click', 'fnDocClick', "btn_acct_yrmon_fr_next");
//	axon_event.addListener('click', 'fnDocClick', "btn_acct_yrmon_to_back");
//	axon_event.addListener('click', 'fnDocClick', "btn_acct_yrmon_to_next");
//    axon_event.addListener('click', 'diff_only_yn_click', 'diff_only_yn');
    axon_event.addListener('click', 'rmk_yn_click', 'rmk_yn');
	axon_event.addListenerFormat('blur', 'fnDeactivate', formObject);
//	axon_event.addListenerFormat('focus', 'fnActivate', formObject);
//	comboObjects[0].focus();
}
function diff_only_yn_click(){
	var form=document.form;
	var sheetObj=sheetObjects[0];
	sheetObj.RemoveAll();
	if (form.diff_only_yn.checked){
		form.diff_only_yn.value="Y";
	}else{
		form.diff_only_yn.value="N";		
	}
}
function rmk_yn_click(){
	var form=document.form;
	var sheetObj=sheetObjects[0];
	sheetObj.RemoveAll();
	if (form.rmk_yn.checked){
		form.rmk_yn.value="Y";
	}else{
		form.rmk_yn.value="N";		
	}
}
/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
function initSheet(sheetObj, sheetNo) {
	var cnt=0;
	switch (sheetNo) {
	case 1: // sheet1 init
		with (sheetObj) {       
	        if (location.hostname != "")
	        var HeadTitle="|Trade|Lane|Carrier|VVD|Revenue\nMonth|Account\nMonth|Item|BSA Amount\n(Revenue)|Combined Amount\n(Revenue)|Slip Amount\n(Revenue)|BSA Amount\n(Expense)|Combined Amount\n(Expense)|Slip Amount\n(Expense)|Remark|r_joo_cmb_bgcolor_yn|r_joo_slp_bgcolor_yn|e_joo_cmb_bgcolor_yn|e_joo_slp_bgcolor_yn|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd";
	        var headCount=ComCountHeadTitle(HeadTitle);
	//        (headCount, 8, 0, true);
	
	        SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );	
	        var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
	        var headers = [ { Text:HeadTitle, Align:"Center"} ];
	        InitHeaders(headers, info);	
	        var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
			               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:prefix+"trd_cd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:prefix+"rlane_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:prefix+"jo_crr_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix+"vvd",                  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"Date",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:1,   SaveName:prefix+"rev_yrmon",            KeyField:0,   CalcLogic:"",   Format:"Ym",          PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"Date",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:1,   SaveName:prefix+"acct_yrmon",           KeyField:0,   CalcLogic:"",   Format:"Ym",          PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"Text",      Hidden:0,  Width:35,   Align:"Center",  ColMerge:1,   SaveName:prefix+"jo_stl_itm_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"AutoSum",   Hidden:0, Width:90,   Align:"Right",   ColMerge:1,   SaveName:prefix+"r_coa_bsa_amt",        KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"AutoSum",   Hidden:0, Width:110,  Align:"Right",   ColMerge:1,   SaveName:prefix+"r_joo_cmb_amt",        KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"AutoSum",   Hidden:0, Width:90,   Align:"Right",   ColMerge:1,   SaveName:prefix+"r_joo_slp_amt",        KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"AutoSum",   Hidden:0, Width:90,   Align:"Right",   ColMerge:1,   SaveName:prefix+"e_coa_bsa_amt",        KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"AutoSum",   Hidden:0, Width:110,  Align:"Right",   ColMerge:1,   SaveName:prefix+"e_joo_cmb_amt",        KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"AutoSum",   Hidden:0, Width:90,   Align:"Right",   ColMerge:1,   SaveName:prefix+"e_joo_slp_amt",        KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"Text",      Hidden:0,  Width:250,  Align:"Left",    ColMerge:1,   SaveName:prefix+"jo_unstl_sts_rmk",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1000 },
			               {Type:"Text",      Hidden:1, Width:100,  Align:"Right",   ColMerge:1,   SaveName:prefix+"r_joo_cmb_bgcolor_yn", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			               {Type:"Text",      Hidden:1, Width:85,   Align:"Right",   ColMerge:1,   SaveName:prefix+"r_joo_slp_bgcolor_yn", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			               {Type:"Text",      Hidden:1, Width:85,   Align:"Right",   ColMerge:1,   SaveName:prefix+"e_joo_cmb_bgcolor_yn", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			               {Type:"Text",      Hidden:1, Width:85,   Align:"Right",   ColMerge:1,   SaveName:prefix+"e_joo_slp_bgcolor_yn", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			               {Type:"Text",      Hidden:1, Width:85,   Align:"Right",   ColMerge:1,   SaveName:prefix+"vsl_cd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			               {Type:"Text",      Hidden:1, Width:85,   Align:"Right",   ColMerge:1,   SaveName:prefix+"skd_voy_no",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			               {Type:"Text",      Hidden:1, Width:85,   Align:"Right",   ColMerge:1,   SaveName:prefix+"skd_dir_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			               {Type:"Text",      Hidden:1, Width:85,   Align:"Right",   ColMerge:1,   SaveName:prefix+"rev_dir_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
		         
	        InitColumns(cols);
	        SetEditable(1);
//	        SetSheetHeight(490);
	        resizeSheet();
		}
		break;
	case 2: // sheet1 init
		with (sheetObj) {
			// setting height
//			SetSheetHeight(0);
			SetVisible(false);
		}
		break;
	}
}
//retrieving Lane SVC Type
function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboKey) {	
    sheetObj.ShowDebugMsg(false);
    switch(sAction) {
       case IBSEARCH: //TRADE
			if (sComboObj.options.id == "rlane_cd") {
				//initializing combo
				sComboObj.RemoveAll();
				formObj.f_cmd.value=SEARCH01;
				formObj.code.value="";
				formObj.super_cd2.value=trd_cd.GetSelectCode();
				formObj.super_cd1.value="";
 				var sXml=sheetObj.GetSearchData("JOOCommonGS.do", FormQueryString(formObj));
				//Trade setting
				var comboItems=(" |"+ComGetEtcData(sXml, "rlane_cd")).split("|");
				addComboItem(comboObjects[1],comboItems);
				//Rlane setting
				var comboItems=(" |"+ComGetEtcData(sXml, "jo_crr_cd")).split("|");
				addComboItem(comboObjects[2],comboItems);
			}else if (sComboObj.options.id == "jo_crr_cd"){
				//initializing combo
				sComboObj.RemoveAll();
				formObj.f_cmd.value=SEARCH02;
				formObj.code.value="";
				formObj.super_cd1.value=rlane_cd.GetSelectCode();
				formObj.super_cd2.value=trd_cd.GetSelectCode();
 				var sXml=sheetObj.GetSearchData("JOOCommonGS.do", FormQueryString(formObj));
				var comboItems=(" |"+ComGetEtcData(sXml, sComboKey)).split("|");
				addComboItem(sComboObj,comboItems);
			}
	        break;
    }
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	switch (sAction) {
		case IBSEARCH: //retrieve 
			if (!validateForm(sheetObj, formObj, sAction)) {
				return;
			}
			formObj.f_cmd.value=SEARCH;
			var param=FormQueryString(formObj)+"&" + ComGetPrefixParam(prefix);
 			sheetObj.DoSearch("FNS_JOO_0050GS.do", param );
            //fnSetBgColorRedForSearchEnd(sheetObj);
			break;
		case IBSAVE: //save 
			if (!validateForm(sheetObj, formObj, sAction)) {
				return;
			}
			if (!ComShowCodeConfirm("JOO00046")){
				return false;
			}
			var SaveStr=ComGetSaveString(sheetObj);
			formObj.f_cmd.value=MULTI;
			sheetObj.SetWaitImageVisible(0);
			ComOpenWait(true);
			try{
 				var sXml=sheetObj.GetSaveData("FNS_JOO_0050GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			}finally{
				ComOpenWait(false);
			}
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			break;
		case IBRESET:
			UF_reset();
			break;
	}
}
function trd_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {//CHECK OLD CODE: OnChange(comboObj, Value, Text) {
	var formObj=document.form;
	rlane_cd.SetSelectIndex(-1,false);
	rlane_cd.RemoveAll();
	jo_crr_cd.SetSelectIndex(-1,false);
	jo_crr_cd.RemoveAll();
	sheetObjects[0].RemoveAll();
	doActionIBCombo(sheetObjects[1] , formObj, IBSEARCH, comboObjects[1],"rlane_cd");	
}
function rlane_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {//CHECK OLD CODE: OnChange(comboObj, value, text) {
	var formObj=document.form;
	jo_crr_cd.SetSelectIndex(-1,false);
	jo_crr_cd.RemoveAll();
	sheetObjects[0].RemoveAll();
	doActionIBCombo(sheetObjects[1] , formObj, IBSEARCH, comboObjects[2],"jo_crr_cd");	
}
function jo_crr_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {//CHECK OLD CODE: OnChange(comboObj, value, text) {
	sheetObjects[0].RemoveAll();
}
function jo_stl_itm_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {//CHECK OLD CODE: OnChange(comboObj, value, text) {
	sheetObjects[0].RemoveAll();
}
function ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {//CHECK OLD CODE: OnChange(comboObj, value, text) {
	sheetObjects[0].RemoveAll();
}
/**
 * year month NAVI event 
 * @param void
 * @return void
 */
function fnDocClick() {
	var objNm=event.srcElement;
	var formObj=document.form;
	var fr=formObj.acct_yrmon_fr.value;
	var to=formObj.acct_yrmon_to.value;
	switch (objNm) {
	case "btn_acct_yrmon_fr_back":
		if (fr != "") {
			formObj.acct_yrmon_fr.value=ComGetDateAdd(fr+"-01","M",-1).substring(0,7);
		}
		sheetObjects[0].RemoveAll();
		break;
	case "btn_acct_yrmon_fr_next":
		if (fr != "") {
			formObj.acct_yrmon_fr.value=ComGetDateAdd(fr+"-01","M",+1).substring(0,7);
		}
		sheetObjects[0].RemoveAll();
		break;
	case "btn_acct_yrmon_to_back":
		if (to != "") {
			formObj.acct_yrmon_to.value=ComGetDateAdd(to+"-01","M",-1).substring(0,7);
		}
		sheetObjects[0].RemoveAll();
		break;
	case "btn_acct_yrmon_to_next":
		if (to != "") {
			formObj.acct_yrmon_to.value=ComGetDateAdd(to+"-01","M",+1).substring(0,7);
		}
		sheetObjects[0].RemoveAll();
		break;
	}
}
/**
 * <pre>
 *     KeyPress Event of form Element.
 *    
 * </pre>
 * @return
 */
function fnObjKeyPress() {
	var obj=event.srcElement;
	var formObj=document.form;
	switch(ComGetEvent("name")) {
	case 'acct_yrmon_fr':
		ComKeyOnlyNumber(obj);
		break;
	case 'acct_yrmon_to':
		ComKeyOnlyNumber(obj);
		break;
	}
}
/**
 * <pre>
 *     input validation,
 *     focus out.
 * </pre>
 * 
 * @return void
 */
function fnDeactivate() {
	switch (ComGetEvent("name")) {
	case 'acct_yrmon_fr':
		ComAddSeparator(ComGetEvent());
		break;
	case 'acct_yrmon_to':
		ComAddSeparator(ComGetEvent());
		break;
	}
}
/**
 * <pre>
 *     input validation,
 *     on focus.
 * </pre>
 * 
 * @return void
 */
function fnActivate() {
	switch (ComGetEvent("name")) {
	case 'acct_yrmon_fr':
		ComClearSeparator(ComGetEvent());
		break;
	case 'acct_yrmon_to':
		ComClearSeparator(ComGetEvent());
		break;
	}
	event.srcElement.select();
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	switch (sAction) {
	case IBSEARCH:
		if (formObj.acct_yrmon_fr.value.length == 0){
			ComShowCodeMessage('JOO00089');
//			formObj.acct_yrmon_fr.focus();
			return false;
		}
		if (formObj.acct_yrmon_to.value.length == 0){
			ComShowCodeMessage('JOO00089');
//			formObj.acct_yrmon_to.focus();
			return false;
		}
		var frDt=formObj.acct_yrmon_fr.value.replaceStr("-","")+"01";
		var toDt=formObj.acct_yrmon_to.value.replaceStr("-","")+"01";
		if (ComGetDaysBetween(frDt, toDt) < 0){
			ComShowCodeMessage('JOO00078');
//			formObj.acct_yrmon_to.focus();
			return false;
		}	
		break;
	case IBSAVE :
		var SaveStr=ComGetSaveString(sheetObj);
		if (SaveStr == ""){
			ComShowCodeMessage("JOO00036");
			return false;
		}
		break;
	}
	return true;
}
 /**
  * 
  * <pre>
  *    setting color of Joo after retrieving
  * </pre>
  *
  * @param  sheetObj : SheetObj 
  * @return void
  * @author jang kang cheol
  */
 //function fnSetBgColorRedForSearchEnd(sheetObj){
function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
     for(var i=sheetObj.HeaderRows();i <= sheetObj.LastRow();i++){
    	 if( sheetObj.GetCellValue(i, prefix+"r_joo_cmb_bgcolor_yn") == "Y"){
              sheetObj.SetCellFontColor(i,prefix+"r_joo_cmb_amt","#FF0000");
         }
    	 if( sheetObj.GetCellValue(i, prefix+"r_joo_slp_bgcolor_yn") == "Y"){
              sheetObj.SetCellFontColor(i,prefix+"r_joo_slp_amt","#FF0000");
         }
    	 if( sheetObj.GetCellValue(i, prefix+"e_joo_cmb_bgcolor_yn") == "Y"){
             sheetObj.SetCellFontColor(i,prefix+"e_joo_cmb_amt","#FF0000");
         }
    	 if( sheetObj.GetCellValue(i, prefix+"e_joo_slp_bgcolor_yn") == "Y"){
              sheetObj.SetCellFontColor(i,prefix+"e_joo_slp_amt","#FF0000");
         }
     }    
 	sheetObj.SetSumText(0,prefix+"trd_cd","TOTAL");     
 }
function UF_reset() {
	var formObj=document.form;
	comboObjects[0].SetSelectIndex(-1,false);
	comboObjects[1].RemoveAll();
	comboObjects[2].RemoveAll();
	comboObjects[3].SetSelectIndex(-1,false);
	comboObjects[4].SetSelectIndex(0,false);
	//Rlane Combo setting
	var comboItems=(" |"+gRlaneCd).split("|");
	addComboItem(comboObjects[1], comboItems);           	
	//Carrier Combo setting
	comboItems=(" |"+gJoCrrCd).split("|");
	addComboItem(comboObjects[2], comboItems);           	
	formObj.acct_yrmon_fr.value=yyyyMM;
	formObj.acct_yrmon_to.value=yyyyMM;
	sheetObjects[0].RemoveAll();
	formObj.diff_only_yn.checked=true;
	formObj.diff_only_yn.value="Y";
	formObj.rmk_yn.checked=false;
	formObj.rmk_yn.value="N";
//	formObj.trd_cd.focus();
}
function trd_cd_OnKeyDown(comboObj, KeyCode, Shift) {
	if (KeyCode == 9 || KeyCode == 13)
		setTimeout("document.getElementById(\"" + comboObjects[1].id  + "\").focus()", 0.1);
}
function rlane_cd_OnKeyDown(comboObj, KeyCode, Shift) {
	if (KeyCode == 9 || KeyCode == 13)
		setTimeout("document.getElementById(\"" + comboObjects[2].id  + "\").focus()", 0.1);
}
function jo_crr_cd_OnKeyDown(comboObj, KeyCode, Shift) {
//	if (KeyCode == 9 || KeyCode == 13)
//		setTimeout("document.getElementById(\"" + comboObjects[3].id  + "\").focus()", 0.1);
}
function jo_stl_itm_cd_OnKeyDown(comboObj, KeyCode, Shift) {
	if (KeyCode == 9 || KeyCode == 13)
		setTimeout("document.getElementById(\"" + comboObjects[0].id  + "\").focus()", 0.1);
}

function resizeSheet(){
    ComResizeSheet(sheetObjects[0]);
}
