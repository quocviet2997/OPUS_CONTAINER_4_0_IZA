/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : FNS_JOO_0049.jsp
 *@FileTitle: Settlement Status for Basic Allocation
 *@author   : CLT
 *@version  : 1.0
 *@since    : 2014/06/19
 =========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
// common global variable
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
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
		case "btn_New":
			doActionIBSheet(sheetObjects[0], document.form, IBRESET);
			break;
		case "btn_DownExcel":
			if(sheetObject1.RowCount() < 1){//no data
          		 ComShowCodeMessage("COM132501");
  	       	}else{        	       			  
  	       		var paramObj=new Object();
  				paramObj.cols=10;
  				var url=ComJooGetPgmTitle(sheetObjects[0], paramObj);
  				sheetObjects[0].Down2Excel( {DownCols: makeHiddenSkipCol(sheetObjects[0]), SheetDesign:1,Merge:1 });
  	       	}							
			break;
		case "btn_acct_yrmon_fr_back":
			if (formObj.acct_yrmon_fr.value != "") {
				formObj.acct_yrmon_fr.value=ComGetDateAdd(
						formObj.acct_yrmon_fr.value + "-01", "M", -1).substring(0,
						7);
			}
			fnBtnNew();
			break;
		case "btn_acct_yrmon_fr_next":
			if (formObj.acct_yrmon_fr.value != "") {
				formObj.acct_yrmon_fr.value=ComGetDateAdd(
						formObj.acct_yrmon_fr.value + "-01", "M", +1).substring(0,
						7);
			}
			fnBtnNew();
			break;
		case "btn_acct_yrmon_to_back":
			if (formObj.acct_yrmon_to.value != "") {
				formObj.acct_yrmon_to.value=ComGetDateAdd(
				formObj.acct_yrmon_to.value + "-01", "M", -1).substring(0,7);
			}
			fnBtnNew();
			break;
		case "btn_acct_yrmon_to_next":
			if (formObj.acct_yrmon_to.value != "") {
				formObj.acct_yrmon_to.value=ComGetDateAdd(
				formObj.acct_yrmon_to.value + "-01", "M", +1).substring(0,7);
			}
			fnBtnNew();
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
	sheet1_OnLoadFinish(sheet1);
}
 function sheet1_OnLoadFinish(sheetObj) {
	doActionIBSheet(sheetObjects[0], document.form, IBCLEAR);
}
/**
 * setting Combo basic info
 * @param comboObj 
 * @param comboIndex Number
 */
function initCombo(comboObj, comboNo) {
	var formObject=document.form
	switch (comboObj.options.id) {
	case "rlane_cd":
		with (comboObj) {
			SetMultiSelect(0);
			SetUseAutoComplete(1);
			SetColAlign(0, "left");
			//SetColWidth(0, "60");
			ValidChar(2,1);    // Uppercase
			SetDropHeight(160);
			SetMaxLength(5);
		}
		break;
	case "trd_cd":
		with (comboObj) {
			SetMultiSelect(0);
			SetUseAutoComplete(1);
			SetColAlign(0, "left");
			//SetColWidth(0, "60");
			ValidChar(2,1);    // Uppercase
			SetDropHeight(160);
			SetMaxLength(3);
		}
		break;
	case "ofc_cd":
		with (comboObj) {
			SetMultiSelect(0);
			SetUseAutoComplete(1);
			SetColAlign(0, "left");
			SetColWidth(0, "75");
			ValidChar(2,1);    // Uppercase
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
	axon_event.addListenerFormat('blur', 'fnDeactivate', formObject);
//	axon_event.addListenerFormat('focus', 'fnActivate', formObject);
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
	        var HeadTitle1="|Seq.|Revenue\nMonth|Carrier\nCode|VVD|Trade|Lane|Revenue|Revenue|Expense|Expense|DIFF_R_YN|DIFF_E_YN";
	        var HeadTitle2="|Seq.|Revenue\nMonth|Carrier\nCode|VVD|Trade|Lane|BSA|JOO(Combined)|BSA|JOO(Combined)|DIFF_R_YN|DIFF_E_YN";
	        var headCount=ComCountHeadTitle(HeadTitle1);
	        //(headCount, 0, 0, true);
	        SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );     
	        var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	        var headers = [ { Text:HeadTitle1, Align:"Center"},
	                    { Text:HeadTitle2, Align:"Center"} ];
	        InitHeaders(headers, info);
	        var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"Status" },
		               {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"Seq" },
		               {Type:"Date",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"cost_yrmon",              KeyField:0,   CalcLogic:"",   Format:"Ym",          PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:"jo_crr_cd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		               {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"vvd",                     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"trd_cd",                  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"rlane_cd",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		               {Type:"Float",     Hidden:0,  Width:130,  Align:"Right",   ColMerge:1,   SaveName:"bsa_r_amt",               KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
		               {Type:"Float",     Hidden:0,  Width:130,  Align:"Right",   ColMerge:1,   SaveName:"joo_r_amt",               KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
		               {Type:"Float",     Hidden:0,  Width:130,  Align:"Right",   ColMerge:1,   SaveName:"bsa_e_amt",               KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
		               {Type:"Float",     Hidden:0,  Width:130,  Align:"Right",   ColMerge:1,   SaveName:"joo_e_amt",               KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
		               {Type:"Text",      Hidden:1, Width:80,   Align:"Right",   ColMerge:1,   SaveName:"diff_r_yn",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		               {Type:"Text",      Hidden:1, Width:80,   Align:"Right",   ColMerge:1,   SaveName:"diff_e_yn",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
	         
	        InitColumns(cols);
	        SetEditable(0);
//	        SetSheetHeight(520);
	        resizeSheet();	        
		}
		break;
	}
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	switch (sAction) {
	case IBCLEAR: //Trade Combo List
		formObj.f_cmd.value=SEARCH01;
		var param=FormQueryString(formObj);
 		var sXml=sheetObj.GetSearchData("FNS_JOO_0049GS.do", param);
		ComXml2ComboItem(sXml, trd_cd, "code", "code");
		break;
	case IBSEARCH_ASYNC02: //Lane Combo List
		//formObj.f_cmd.value = SEARCHLIST07;            
		formObj.f_cmd.value=SEARCH16;
		var code=trd_cd.GetSelectText();
		var param=FormQueryString(formObj) + "&super_cd2=" + code;
 		var sXml=sheetObj.GetSearchData("JOOCommonGS.do", param);
		ComXml2ComboItem(sXml, rlane_cd, "code", "code");
		break;
	case IBSEARCH: //retrieve 
		if (!validateForm(sheetObj, formObj, sAction)) {
			return;
		}
		formObj.f_cmd.value=SEARCHLIST01;
		var param=FormQueryString(formObj);
 		sheetObj.DoSearch("FNS_JOO_0049GS.do", param );
		fnSetBgColorRedForSearchEnd(sheetObj);
		break;
	case IBRESET:
// UI개선사항(201407.민정호)
// 필요 없는 기능		
//		formObj.reopt[0].checked=true;
		trd_cd.SetSelectCode('',false);
		rlane_cd.SetSelectCode('',false);		
		fnBtnNew();		
		formObj.acct_yrmon_fr.value=yyyyMM;
		formObj.acct_yrmon_to.value=yyyyMM;		
		break;
	}
}
/**
 * <br><b>Example : </b>
 * <pre>
 *     Carrier Code(Object Name : trd_cd) OnChange 
 * </pre>
 */
function trd_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {//CHECK OLD CODE: OnChange(comboObj, value, text) {
	var formObj=document.form;
	rlane_cd.RemoveAll();
	rlane_cd_OnFocus(comboObjects[1]);
}
function rlane_cd_OnFocus(comboObj) {
	var formObj=document.form;
	if (trd_cd.GetSelectCode()== "") {
		return;
	}
	if (comboObj.GetItemCount() == 0) {
		comboObj.SetEnable(0);
		doActionIBSheet(sheetObjects[sheetObjects.length - 1], formObj,
				IBSEARCH_ASYNC02);
		comboObj.SetEnable(1);
	}
}
/**
 * year month NAVI event 
 * @param void
 * @return void
 */
function fnDocClick() {
	var objNm=event.srcElement;
	var formObj=document.form;
	switch (objNm) {
	case "btn_acct_yrmon_fr_back":
		if (formObj.acct_yrmon_fr.value != "") {
			formObj.acct_yrmon_fr.value=ComGetDateAdd(
					formObj.acct_yrmon_fr.value + "-01", "M", -1).substring(0,
					7);
		}
		fnBtnNew();
		break;
	case "btn_acct_yrmon_fr_next":
		if (formObj.acct_yrmon_fr.value != "") {
			formObj.acct_yrmon_fr.value=ComGetDateAdd(
					formObj.acct_yrmon_fr.value + "-01", "M", +1).substring(0,
					7);
		}
		fnBtnNew();
		break;
	case "btn_acct_yrmon_to_back":
		if (formObj.acct_yrmon_to.value != "") {
			formObj.acct_yrmon_to.value=ComGetDateAdd(
			formObj.acct_yrmon_to.value + "-01", "M", -1).substring(0,7);
		}
		fnBtnNew();
		break;
	case "btn_acct_yrmon_to_next":
		if (formObj.acct_yrmon_to.value != "") {
			formObj.acct_yrmon_to.value=ComGetDateAdd(
			formObj.acct_yrmon_to.value + "-01", "M", +1).substring(0,7);
		}
		fnBtnNew();
		break;
	}
}
/**
 * NEW button 
 * @param    void
 * @return   void
 */
function fnBtnNew() {
	var formObj=document.form;
	if (sheetObjects[0].RowCount()> 0) {
		sheetObjects[0].RemoveAll();
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
 * 
 * <pre>
 *    setting color of Joo after retrieving
 * </pre>
 *
 * @param   
 * @return
 * @author jang kang cheol
 */
function fnSetBgColorRedForSearchEnd(sheetObj) {
	for ( var i=sheetObj.HeaderRows(); i <= sheetObj.LastRow(); i++) {
		if (sheetObj.GetCellValue(i, "diff_r_yn") == "Y") {
			sheetObj.SetCellFontColor(i, "joo_r_amt","#FF0000");
		}
		if (sheetObj.GetCellValue(i, "diff_e_yn") == "Y") {
			sheetObj.SetCellFontColor(i, "joo_e_amt","#FF0000");
		}
	}
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	switch (sAction) {
	case IBSEARCH:
		//if (!ComChkValid(formObj)) return false;
		if (trd_cd.GetSelectCode()== "") {
			ComShowCodeMessage('JOO00009');
//			formObj.trd_cd.focus();
			return false;
		}
		//                       if( formObj.rlane_cd.Code == "") {
		//                           ComShowCodeMessage('JOO00010');   
//		//                           formObj.rlane_cd.focus();
		//                           return false;
		//                       }   
		break;
	}
	return true;
}

function resizeSheet(){
    ComResizeSheet(sheetObjects[0]);
}
