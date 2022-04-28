/*
=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName   : FNS_JOO_0109.js
 *@FileTitle  : Issuing a Invoice Report
 *@author     : CLT
 *@version    : 1.0
 *@since      : 2014/05/02
=========================================================
 */
var sheetObjects = new Array();
var sheetCnt = 0;
var comboObjects = new Array();
var comboCnt = 0;
var ROWMARK = "|";
var FIELDMARK = ",";
document.onclick = processButtonClick;
/**
 * Sheet 기본 설정 및 초기화
 * body 태그의 onLoad 이벤트핸들러 구현
 * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
 */
function loadPage() {
	for (i = 0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1);
		ComEndConfigSheet(sheetObjects[i]);
	}
	// initializing IBMultiCombo
	for ( var k = 0; k < comboObjects.length; k++) {
		initCombo(comboObjects[k], k + 1);
	}
	initControl();
}
/**
 * handling process for processButtonClick
 */
function processButtonClick() {
	var formObj = document.form;
	var srcName = ComGetEvent("name");
	switch (srcName) {
		case "btn_Retrieve":
			doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
		break;
		case "btn_vvd_from_back":
			UF_addMonth(formObj.fr_acct_yrmon, -1);
			sheetObjects[0].RemoveAll();
		break;
		case "btn_vvd_from_next":
			if (!GetCheckConditionPeriod()) {
				ComShowCodeMessage("JOO00078");
				return;
			}
			UF_addMonth(formObj.fr_acct_yrmon, +1);
			sheetObjects[0].RemoveAll();
		break;
		case "btn_vvd_to_back":
			if (!GetCheckConditionPeriod()) {
				ComShowCodeMessage("JOO00078");
				return;
			}
			UF_addMonth(formObj.to_acct_yrmon, -1);
			sheetObjects[0].RemoveAll();
		break;
		case "btn_vvd_to_next":
			UF_addMonth(formObj.to_acct_yrmon, +1);
			sheetObjects[0].RemoveAll();
		break;
		case "btn_Ok":
			comPopupOK();
		break;
		case "btn_Close":
			ComClosePopup();
		break;
	}
}
/**
 * handling process for doActionIBSheet
 */
function doActionIBSheet(sheetObj, formObj, sAction) {
	switch (sAction) {
		case IBSEARCH: //retrieve
			if (!validateForm(sheetObj, formObj, sAction))
				return false;
			formObj.f_cmd.value = SEARCH;
			var sXml = sheetObj.GetSearchData("FNS_JOO_0110GS.do", FormQueryString(formObj));
			sheetObj.LoadSearchData(sXml, {
				Sync : 1
			});
			sheetObj.SetCellValue(1, "radio", '1');
		break;
		case IBSEARCH_ASYNC01: //retrieve
			if (!validateForm(sheetObj, formObj, sAction))
				return false;
			formObj.f_cmd.value = SEARCH01;
			var sXml = sheetObj.GetSearchData("FNS_JOO_0110GS.do", FormQueryString(formObj));
			var inv_no_info = ComGetEtcData(sXml, "inv_no_info");
			if (!ComIsEmpty(inv_no_info)) {
				var arrValue = inv_no_info.split("|");
				comboObjects[0].SetSelectCode(arrValue[0]);
				ComSetObjValue(formObj.fr_acct_yrmon, arrValue[1]);//month  fr_acct_yrmon  to_acct_yrmon
				ComSetObjValue(formObj.to_acct_yrmon, arrValue[1]);
				doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
			}
		break;
		case IBSEARCH_ASYNC08: // Carrier/Trade/RLane Combo Code By Auth Office Code
			var authOfcCd = '';
			var param = "";
			param += "f_cmd=" + SEARCH23;
			param += "&auth_ofc_cd=" + authOfcCd;

			var sXml = sheetObj.GetSearchData("JOOCommonGS.do", param);

			var joCrrCds = ComGetEtcData(sXml, "jo_crr_cds");
			var trdCds = ComGetEtcData(sXml, "trd_cds");
			var rlaneCds = ComGetEtcData(sXml, "rlane_cds");

			var comboItems = joCrrCds.split(ROWMARK);
			var comboItem = "";
			jo_crr_cds.InsertItem(-1, "ALL|", "ALL"); //ALL
			for ( var i = 0; i < comboItems.length; i++) {
				jo_crr_cds.InsertItem(-1, comboItems[i], comboItems[i]);
			}
			jo_crr_cds.SetSelectIndex(0);
		break;
	}
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	switch (sAction) {
		case IBSEARCH: //retrieve
			if (!ComChkRequired(formObj)) {
				return false;
			}
		break;
		case IBSEARCH_ASYNC01: //retrieve
			if (ComIsEmpty(formObj.inv_no)){
				return false;
			}
		break;
		
	}
	return true;
}
/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
function initSheet(sheetObj, sheetNo) {
	var cnt = 0;
	switch (sheetNo) {
		case 1: //sheet1 init
			with (sheetObj) {
				var HeadTitle = "Sel.|Partner|Invoice No|Curr|Revenue|Expense";
				SetConfig({
					SearchMode : 2,
					MergeSheet : 1,
					Page : 20,
					DataRowMerge : 0
				});
				var info = {
					Sort : 1,
					ColMove : 1,
					HeaderCheck : 0,
					ColResize : 1
				};
				var headers = [ {
					Text : HeadTitle,
					Align : "Center"
				} ];
				InitHeaders(headers, info);
				var cols = [ {
					Type : "Radio",
					Hidden : 0,
					Width : 30,
					Align : "Center",
					ColMerge : 0,
					SaveName : "radio",
					KeyField : 0,
					CalcLogic : "",
					Format : "",
					PointCount : 0,
					UpdateEdit : 1,
					InsertEdit : 1
				}, {
					Type : "Text",
					Hidden : 0,
					Width : 55,
					Align : "Center",
					ColMerge : 0,
					SaveName : "jo_crr_cd",
					KeyField : 0,
					CalcLogic : "",
					Format : "",
					PointCount : 0,
					UpdateEdit : 0,
					InsertEdit : 0
				}, {
					Type : "Text",
					Hidden : 0,
					Width : 150,
					Align : "Center",
					ColMerge : 1,
					SaveName : "inv_no",
					KeyField : 0,
					CalcLogic : "",
					Format : "",
					PointCount : 0,
					UpdateEdit : 0,
					InsertEdit : 0
				}, {
					Type : "Text",
					Hidden : 0,
					Width : 45,
					Align : "Center",
					ColMerge : 0,
					SaveName : "locl_curr_cd",
					KeyField : 0,
					CalcLogic : "",
					Format : "",
					PointCount : 0,
					UpdateEdit : 0,
					InsertEdit : 0
				}, {
					Type : "Float",
					Hidden : 0,
					Width : 120,
					Align : "Right",
					ColMerge : 0,
					SaveName : "rev_act_amt",
					KeyField : 0,
					CalcLogic : "",
					Format : "NullFloat",
					PointCount : 2,
					UpdateEdit : 0,
					InsertEdit : 0
				}, {
					Type : "Float",
					Hidden : 0,
					Width : 120,
					Align : "Right",
					ColMerge : 0,
					SaveName : "exp_act_amt",
					KeyField : 0,
					CalcLogic : "",
					Format : "NullFloat",
					PointCount : 2,
					UpdateEdit : 0,
					InsertEdit : 0
				} ];
				InitColumns(cols);
				SetSheetHeight(320);
				SetEditable(1);
				SetImageList(0, "/opuscntr/img/ico_round.gif");
				SetMousePointer("Hand");
			}
		break;
	}
}
/**
 * handling process for jo_crr_cds_OnCheckClick
 */
function jo_crr_cds_OnCheckClick(comboObj, index, code) {
	if (index == 0) {
		var bChk = comboObj.GetItemCheck(index);
		if (bChk) {
			for ( var i = 1; i < comboObj.GetItemCount(); i++) {
				comboObj.SetItemCheck(i, 0);
			}
		}
	} else {
		//ALL 이 아닌 다른 Item 체크.
		var bChk = comboObj.GetItemCheck(index);
		if (bChk) {
			comboObj.SetItemCheck(0, 0);
		}
	}
	//Combo Item이 전부 Uncheck 일때 자동으로 All 선택이 되도록 한다.
	var checkCnt = 0;
	var count = parseInt(comboObj.GetItemCount());
	for ( var i = 1; i < count; i++) {
		if (comboObj.GetItemCheck(i)) {
			checkCnt++;
		}
	}
	if (checkCnt == 0) {
		comboObj.SetItemCheck(0, true, null, null, false);
	}
}
/**
 * setting Combo basic info
 * 
 * @param comboObj
 * @param comboIndex
 *            Number
 */
function initCombo(comboObj, comboNo) {
	var formObject = document.form;
	switch (comboObj.options.id) {
		case "jo_crr_cds":
			with (comboObj) {
				SetMultiSelect(true);
				SetMultiSeparator(","); // add 
				SetUseAutoComplete(1);
				SetColAlign(0, "left");
				SetColWidth(0, "150");
				ValidChar(2, 1); // Uppercase
				SetDropHeight(160);
				SetMaxLength(3);
			}
			if (ComTrim(gJoCrrCdComboItems) != "") {
				var comboItems = gJoCrrCdComboItems.split(ROWMARK);
				var comboItem = "";
				jo_crr_cds.InsertItem(-1, "ALL|", "ALL"); //ALL
				for ( var i = 0; i < comboItems.length; i++) {
					comboItem = comboItems[i].split(FIELDMARK);
					jo_crr_cds.InsertItem(-1, comboItem[0], comboItem[0]);
				}
				jo_crr_cds.SetSelectIndex(0);
			} else {
				jo_crr_cds.RemoveAll();
			}
		break;
	}
}
/**
 * registering IBSheet Object as list adding process for list in case of needing
 * batch processing with other items defining list on the top of source
 */
function setSheetObject(sheet_obj) {
	sheetObjects[sheetCnt++] = sheet_obj;
}
/**
 * registering IBCombo Object as list
 */
function setComboObject(combo_obj) {
	comboObjects[comboCnt++] = combo_obj;
}
/**
 * registering GetCheckConditionPeriod
 */
function GetCheckConditionPeriod() {
	var formObj = document.form;
	var frDt = formObj.fr_acct_yrmon.value.replaceStr("-", "") + "01";
	var toDt = formObj.to_acct_yrmon.value.replaceStr("-", "") + "01";
	if (ComGetDaysBetween(frDt, toDt) <= 0) {
		return false;
	}
	return true;
}
/**
 * registering initControl
 */
function initControl() {
	var formObj = document.form;
	//Axon 이벤트 처리1. 이벤트catch
	axon_event.addListenerFormat('blur', 'obj_blur', formObj);
	axon_event.addListener('keydown', 'ComKeyEnter', 'form');
	initPeriod();
	doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC08);
	doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC01);
}
/**
 * initPeriod
 */
function initPeriod() {
	var formObj = document.form;
	//From : -3년, To : +1 월
	var tmpToYm = ComGetNowInfo("ymd", "-"); //ComGetDateAdd(formObj.exe_yrmon.value,"M", 1);
	formObj.to_acct_yrmon.value = JooGetDateFormat(tmpToYm, "ym");

	//년월 만 하면 -3년이 넘게 설정 되어 동일 월로 설정하기 위해서 2015-07-02 로 Day 를 마춘다.
	var tmpFrYm = ComGetDateAdd(formObj.to_acct_yrmon.value + "-01", "M", -2);
	formObj.fr_acct_yrmon.value = JooGetDateFormat(tmpFrYm, "ym");
}
/**
 * registering sheet1_OnClick
 */
function sheet1_OnClick(sheetObj, row, col, value) {
	//if (sheetObj.ColSaveName(col) == "inv_no"){
	sheetObj.SetCellValue(row, "radio", '1');
	//}
}