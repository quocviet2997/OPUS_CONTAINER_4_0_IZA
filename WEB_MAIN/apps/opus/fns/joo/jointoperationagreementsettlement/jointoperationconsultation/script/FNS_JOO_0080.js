/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : FNS_JOO_0080.jsp
 *@FileTitle : Combined Data Inquiry
 *@author     : CLT
 *@version    : 1.0
 *@since      : 2014/06/17
 =========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
//common global variable
var tabObjects=new Array();
var tabCnt=0;
var beforetab=1;
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
var prefix="sheet1_";
//Event handler processing by button click event */
document.onclick=processButtonClick;
//Event handler processing by button name */
function processButtonClick() {
	/***** setting sheet object *****/
	var sheetObj1=sheetObjects[0];
	/*******************************************************/
	var formObj=document.form;
	try {
		var srcName=ComGetEvent("name");
		if (srcName == null) {
			return;
		}
		// return in case class is btn1_1
		if (!JooBtnClickEnable(srcName)) {
			return;
		}
		switch (srcName) {
		case "btn_fr_back":
			UF_addMonth(formObj.fr_dt, -1);
			sheetObjects[0].RemoveAll();
			doActionIBSheet(sheetObjects[0], formObj, IBROWSEARCH);
			break;
		case "btn_fr_next":
			if (!UF_chkPeriod()){
				return;
			}
			UF_addMonth(formObj.fr_dt, 1);
			sheetObjects[0].RemoveAll();
			doActionIBSheet(sheetObjects[0], formObj, IBROWSEARCH);
			break;
		case "btn_to_back":
			if (!UF_chkPeriod()){
				return;
			}
			UF_addMonth(formObj.to_dt, -1);
			sheetObjects[0].RemoveAll();
			doActionIBSheet(sheetObjects[0], formObj, IBROWSEARCH);
			break;
		case "btn_to_next":
			UF_addMonth(formObj.to_dt, 1);
			sheetObjects[0].RemoveAll();
			doActionIBSheet(sheetObjects[0], formObj, IBROWSEARCH);
			break;
		case "btn_retrieve":
			doActionIBSheet(sheetObj1, formObj, IBSEARCH);
			break;
		case "btn_downexcel":
 			sheetObj1.Down2Excel({ HiddenColumn:1,Merge:1});
			break;
		case "btn_new":
			sheetObj1.RemoveAll();
			//slp_ofc_cd.SetSelectIndex(0);
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
function loadPage(ofcList) {
	for (i=0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1);
		ComEndConfigSheet(sheetObjects[i]);
	}
	//retriving only trade at the first time. retriving lane in case trade is changed.
	/*for ( var k=0; k < comboObjects.length; k++) {
		initCombo(comboObjects[k], k + 1, ofcList);
	}*/
	//slp_ofc_cd.SetSelectIndex(0);
	initControl();
}
/**
 * loading HTML Control event <br>
 * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
 * @param {ibsheet} sheetObj    IBSheet Object
 * @param {int}     sheetNo     sequence number in sheetObjects array
 **/
function initControl() {
}

/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
function initSheet(sheetObj, sheetNo) {
	var cnt=0;
	switch (sheetNo) {
	case 1: //t1sheet1 init
		with (sheetObj) {
	        
	        if (location.hostname != "")
	        var HeadTitle="Acct Yrmon|Office|Trade|Lane|Carrier|Combined|Combined No.|Adjust Flag";
	        var headCount=ComCountHeadTitle(HeadTitle);
	        (headCount, 0, 0, true);
	
	        SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
	
	        var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	        var headers = [ { Text:HeadTitle, Align:"Center"} ];
	        InitHeaders(headers, info);
	
	        var cols = [ {Type:"Date",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"acct_yrmon",  KeyField:0,   CalcLogic:"",   Format:"Ym" },
	               {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"ofc_cd",      KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"trd_cd",      KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"rlane_cd",    KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"jo_crr_cd",   KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cmb_cfm_flg", KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"stl_cmb_seq", KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"stl_adj_flg", KeyField:0,   CalcLogic:"",   Format:"" } ];
	         
	        InitColumns(cols);
//	        SetSheetHeight(520);
	        resizeSheet();
	        SetEditable(0);
		}
		break;
	}
}
/**
 * setting Combo basic info 
 * param : comboObj, comboNo
 * initializing sheet 
 */
function initCombo(comboObj, comboNo, ofcList) {
	var formObject=document.form
	switch (comboNo) {
	case 1:
		with (comboObj) {
			SetMultiSelect(0);
			SetUseAutoComplete(1);
			SetColAlign(0, "left");
			SetColWidth(0, "75");
			SetDropHeight(160);
			SetMaxLength(6);
		}
		var comboItems=ofcList.split("|");
		addComboItem(comboObj, comboItems);
		comboObj.SetSelectIndex(0);
		if (comboItems.length == 1) {
			comboObj.SetEnable(0);
		} else {
			comboObj.SetEnable(1);
		}
		break;
	}
}
//handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	if (!validateForm(sheetObj, formObj, sAction)) {
		return false;
	}
	switch (sAction) {
		case IBSEARCH: //retrieve
			formObj.f_cmd.value=SEARCH;
 			var sXml=sheetObj.GetSearchData("FNS_JOO_0080GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			break;
		case IBROWSEARCH: //setting OFFICE Lis combo in case of changing condition
			//comboObjects[0].RemoveAll();
			formObj.f_cmd.value=SEARCHLIST01;
 			var sXml=sheetObj.GetSearchData("FNS_JOO_0080GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			//var ofcList=ComGetEtcData(sXml,"ofc_list");
			//initCombo(comboObjects[0],1, ofcList);
			break;
	}
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	switch (sAction) {
		case IBSEARCH: //retrieve
			var frDt=ComReplaceStr(formObj.fr_dt, "-", "");
			var toDt=ComReplaceStr(formObj.to_dt, "-", "");
			if (ComGetDaysBetween(frDt, toDt) < 0) {
				ComShowCodeMessage("JOO00078");
//				formObj.to_dt.focus();
				return false;
			}
			break;
		}
	return true;
}
/*function slp_ofc_cd_OnChange(comboObj, OdlIdx, OldTxt, OldCod, NewIdx, NewTxt, NewCod) {
	sheetObjects[0].RemoveAll();
}*/
function UF_chkPeriod(){
	var aBol=true;
	var formObj=document.form;
	var fr=ComReplaceStr(formObj.fr_dt.value,"-","");
	var to=ComReplaceStr(formObj.to_dt.value,"-","");
	if (fr == "" || to == ""){
		aBol=true;
	}else{
		if (Number(fr) == Number(to)){
			ComShowCodeMessage("JOO00078");
			aBol=false;
		}
	}
	return aBol;
}

function resizeSheet(){
    ComResizeSheet(sheetObjects[0]);
}