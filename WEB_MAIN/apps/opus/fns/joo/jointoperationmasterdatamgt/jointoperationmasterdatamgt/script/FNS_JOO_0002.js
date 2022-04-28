/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName   : fns_joo_0002.js
 *@FileTitle  : Entry and Inquiry of Financial Affairs
 *@author     : CLT
 *@version    : 1.0
 *@since      : 2014/06/30
=========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
 MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
 OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends
 * @class fns_joo_0002 : business script for fns_joo_0002
 */
// common global variable
var sheetObjects = new Array();
var sheetCnt = 0;
var comboObjects = new Array();
var comboCnt = 0;
// Event handler processing by button click event */
document.onclick = processButtonClick;
// Event handler processing by button name */
function processButtonClick() {
	/** *** setting sheet object **** */
	var sheetObject1 = sheetObjects[0];
	var sheetObject2 = sheetObjects[1];
	var sheetObject3 = sheetObjects[2];
	/** **************************************************** */
	var formObj = document.form;
	try {
		var srcName = ComGetEvent("name");
		if (srcName == null) {
			return;
		}
		// return in case class is btn1_1
		if (!JooBtnClickEnable(srcName)) {
			return;
		}
		switch (srcName) {
			case "btn_retrieve":
				doActionIBSheet(sheetObject1, formObj, IBSEARCH);
				break;
			case "btn_new":
				UF_reset("");
				break;
			case "btn_save":
				doActionIBSheet(sheetObject1, formObj, IBSAVE);
				break;
			case "btn_downExcel":
				if (sheetObject1.RowCount() < 1) {// no data
					ComShowCodeMessage("COM132501");
				} else {
					sheetObject1.Down2Excel({ HiddenColumn:1,Merge:1});
				}
				break;
			case "btn_delete1":
				JooRowHideDelete(sheetObject1, "sheet1_del_chk");
				break;
			case "btn_delete2":
				JooRowHideDelete(sheetObject2, "sheet2_del_chk");
				break;
			case "btn_create":
				doActionIBSheet(sheetObject1, formObj, IBCREATE);
				break;
			case "btn_pop_car":
				//ComOpenPopup("/opuscntr/COM_ENS_0N1.do", 450, 455, "popupCrrFinish", "1,0,1,1,1", true, false, 0, 0, 0,"popcrr");
				ComOpenPopup("/opuscntr/COM_ENS_0N1.do", 800, 500, "popupCrrFinish", "1,0,1,1,1", true, false, 0, 0, 0,"popcrr");
				break;
			case "btn_pop_customer":
				var param = '';
				ComOpenPopupWithTarget('/opuscntr/COM_ENS_041.do', 780, 500,'3:cust_seq|4:cust_lgl_eng_nm', '1,0,0,1', true);
				break;
			case "btn_pop_vendor":
				var param = '';
				ComOpenPopupWithTarget('/opuscntr/COM_ENS_0C1.do', 780, 500,'2:vndr_seq|4:vndr_lgl_eng_nm', '1,0,1,1,1', true);
				break;
			case "delt_flg":
				var check = 0;
				if (formObj.delt_flg.checked) {
					formObj.delt_flg.value = "Y";
					check = 1;
				} else {
					formObj.delt_flg.value = "N";
				}
				var arrPrefix = new Array("sheet1_", "sheet2_");
				for ( var inx = 0; inx < 2; inx++) {
					for ( var jnx = sheetObjects[inx].HeaderRows(); jnx <= sheetObjects[inx].LastRow(); jnx++) {
						sheetObjects[inx].SetCellValue(jnx, arrPrefix[inx]+ "del_chk", check);
					}
				}
				break;
			default :
				break;
		} // end switch
	} catch (e) {
		if (e == "[object Error]") {
			ComShowCodeMessage('JOO00001');
		} else {
			ComShowMessage(e.message);
		}
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
 * registering IBCombo Object as list param : combo_obj adding process for list
 * in case of needing batch processing with other items defining list on the top
 * of source
 */
function setComboObject(combo_obj) {
	comboObjects[comboCnt++] = combo_obj;
}
/**
 * initializing sheet implementing onLoad event handler in body tag adding
 * first-served functions after loading screen.
 */
function loadPage(trdCombo, currCombo) {
	for (i = 0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1, currCombo);
		ComEndConfigSheet(sheetObjects[i]);
	}
	// retriving only trade at the first time. retriving lane in case trade is
	// changed.
	for ( var k = 0; k < comboObjects.length; k++) {
		initCombo(comboObjects[k], k + 1, trdCombo);
	}
	initControl();
// UI 개선사항 - 민정호(201407)	
//	sheet1_OnLoadFinish();
}

//UI 개선사항 - 민정호(201407)
//function sheet1_OnLoadFinish() {
//	doActionIBSheet(sheet1, document.form, IBSEARCH);
//}
/**
 * loading HTML Control evnet <br>
 * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
 * 
 * @param {ibsheet}
 *            sheetObj IBSheet Object
 * @param {int}
 *            sheetNo sequence number in sheetObjects array
 */
function initControl() {
	// ** Date Separator **/
	DATE_SEPARATOR = "-";
	var formObj = document.form;
	// handling Axon event. event catch
	axon_event.addListener('click', 'delt_flg_tmp_click', 'delt_flg_tmp');
	axon_event.addListener('blur', 'cust_seq_onblur', 'cust_seq');
	axon_event.addListener('blur', 'vndr_seq_onblur', 'vndr_seq');
	//axon_event.addListener('blur', 'jo_crr_cd_onblur', 'jo_crr_cd');
	UF_reset("");
}


/**
 * delt_flg_tmp click event
 * 
 * @return
 */
function delt_flg_tmp_click() {
	formObj = document.form;
	formObj.delt_flg.value = formObj.delt_flg_tmp.checked ? "Y" : "N";
	var delChk = formObj.delt_flg_tmp.checked ? "1" : "0";
	var bolHid = formObj.delt_flg_tmp.checked ? true : false;
	var prefix = new Array("sheet1_", "sheet2_");
	// deleting Revenue and Expense Sheet in case of checking Delete Mark
	// recovery in case of Unchecking
	if (sheetObjects[0].RowCount() > 0) {
		for ( var inx = sheetObjects[0].HeaderRows(); inx <= sheetObjects[0].LastRow(); inx++) {
			sheetObjects[0].SetCellValue(inx, prefix[0] + "del_chk", delChk, 0);
			sheetObjects[0].SetRowHidden(inx, bolHid);
		}
	}
	if (sheetObjects[1].RowCount() > 0) {
		for ( var inx = sheetObjects[1].HeaderRows(); inx <= sheetObjects[1].LastRow(); inx++) {
			sheetObjects[1].SetCellValue(inx, prefix[1] + "del_chk", delChk, 0);
			sheetObjects[1].SetRowHidden(inx, bolHid);
		}
	}
}
/**
 * getting data from Carrier Code Pop-up
 * 
 * @param rowArray
 * @return
 */
function popupCrrFinish(rowArray) {
	var formObj = document.form;
	var fstArray = rowArray[0];
	var joCrrCd = fstArray[3];
	// if Carrier Code is not 3
	if (joCrrCd.length != 3) {
		ComShowCodeMessage('JOO00002'); // The length of Carrier code in Joint
										// Operation is 3 characters only.
		formObj.jo_crr_cd.focus();
		return;
	}
	var oldJoCrrCd = formObj.jo_crr_cd_hid.value;
	// reset in case data is changed
	if (joCrrCd != oldJoCrrCd) {
		UF_reset(joCrrCd);
	}
}

// Carrier changed
/*function jo_crr_cd_onblur() {
	var formObj = document.form;
	var sheetObj = sheetObjects[2];
	// if Carrier Code is changed
	if (formObj.jo_crr_cd_hid.value != formObj.jo_crr_cd.value) {
		UF_reset(formObj.jo_crr_cd.value);
		doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC03);
	}
}*/


/**
 * setting Combo basic info param : comboObj, comboNo initializing sheet
 */
function initCombo(comboObj, comboNo, trdCombo) {
	var formObj = document.form
	switch (comboNo) {
	case 1:
		with (comboObj) {
			SetMultiSelect(0);
			SetUseAutoComplete(1);
			SetColAlign(0, "left");
			ValidChar(2,1);    // Uppercase
//			SetColWidth(0, "30");
			SetDropHeight(160);
			SetMaxLength(3);
		}
		var comboItems = trdCombo.split("|");
		addComboItem(comboObj, comboItems);
		break;
	case 2:
		with (comboObj) {
			SetMultiSelect(0);
			SetUseAutoComplete(1);
			SetColAlign(0, "left");
			SetColAlign(1, "left");
			SetColWidth(0, "65px");
			SetColWidth(1, "0px");
			ValidChar(2,1);    // Uppercase
//			SetColWidth(1, "0");
			SetDropHeight(160);
			SetMaxLength(5);
		}
		break;
	case 3:
		with (comboObj) {
			SetMultiSelect(0);
			SetUseAutoComplete(1);
			SetColAlign(0, "left");
			ValidChar(2,1);    // Uppercase
			//SetColWidth(0, "72");
			//SetColWidth(1, "0");
			SetDropHeight(160);
			SetMaxLength(5);
		}
		comboObj.RemoveAll();
		var codeItems = joStlOptCd.split("|");
		var nameItems = joStlOptNm.split("|");
		for ( var i = 0; i < codeItems.length; i++) {
			comboObj.InsertItem(i, nameItems[i], codeItems[i]);
		}
		break;
	}
}
// retrieving Lane SVC Type
function doActionIBCombo(sheetObj, formObj, sAction, sComboObj, sComboKey) {
	sheetObj.ShowDebugMsg(false);
	switch (sAction) {
	case IBSEARCH: // TRADE
		if (sComboObj.options.id == "rlane_cd") {
			// initializing combo
			sComboObj.RemoveAll();
			formObj.f_cmd.value = SEARCHLIST02;
			formObj.super_cd1.value = trd_cd.GetSelectCode();
			formObj.code.value = "";
			formObj.super_cd2.value = formObj.jo_crr_cd.value;
			var sXml = sheetObj.GetSearchData("JOOCommonGS.do",FormQueryString(formObj));
			ComXml2ComboItem(sXml, rlane_cd, "code", "code");
		}
		break;
	}
}
function jo_crr_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex,newText, newCode) {
	var formObj = document.form;
	var sheetObj = sheetObjects[2];
	// if Carrier Code is changed
	if (formObj.jo_crr_cd_hid.value != formObj.jo_crr_cd.value) {
		UF_reset(formObj.jo_crr_cd.value);
		doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC03);
	}
}

/*function trdCdOnFocus(){
	var formObj=document.form;
	var trdCdComboObj = comboObjects[1]; // Trade MCombo
	if (comboObjects[0].GetSelectCode().length < 3){
		ComShowCodeMessage("JOO00008");
		//formObj.jo_crr_cd.focus();
		return;
	}
	if (trdCdComboObj.GetItemCount() == 0){
		trdCdComboObj.SetEnable(0);
		doActionIBSheet(sheetObjects[1], formObj, IBSEARCH_ASYNC01);
		trdCdComboObj.SetEnable(1);
	}
}*/

// Combo, sheet reset when changing trade
function trd_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex,newText, newCode) {
	var formObj = document.form;
	sheetObjects[0].RemoveAll();
	sheetObjects[1].RemoveAll();
	comboObjects[1].SetSelectIndex(-1, false);
	comboObjects[1].RemoveAll();
	formObj.cust_seq.value = "";
	formObj.cust_lgl_eng_nm.value = "";
	formObj.vndr_seq.value = "";
	formObj.vndr_lgl_eng_nm.value = "";
	
	if(newCode != "" && newCode != null){
		RlanCdOnFocus();
	}
	
}
// retrieving rlane_cd list when focus is in rlane_cd
function RlanCdOnFocus() {
	var formObj = document.form;
	var rlaneCdComboObj = comboObjects[1]; //Lane MCombo
	
	if (rlaneCdComboObj.GetItemCount() == 0) {
		rlaneCdComboObj.SetEnable(0);
		doActionIBCombo(sheetObjects[3], formObj, IBSEARCH, rlaneCdComboObj,"rlane_cd");
		rlaneCdComboObj.SetEnable(1);
	}
}
// reset when changing lane
function rlane_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex,newText, newCode) {
	var formObj = document.form;
	sheetObjects[0].RemoveAll();
	sheetObjects[1].RemoveAll();
	formObj.cust_seq.value = "";
	formObj.cust_lgl_eng_nm.value = "";
	formObj.vndr_seq.value = "";
	formObj.vndr_lgl_eng_nm.value = "";
	var idx_cd=rlane_cd.GetSelectCode();	
	UF_setAuth(comboObj.GetText(idx_cd, 1));
}
// retrieving in case of focus out in lane
function rlane_cd_OnBlur(comboObj) {
	var formObj = document.form;
	if (comboObj.GetSelectCode().length == 5)
		doActionIBSheet(sheetObjects[3], formObj, IBSEARCH);
}
// button control by carrier-lane authority
function UF_setAuth(auth) {
	if (auth == null || auth == undefined) {
		auth = "R";
	}
	var editable = true;
	if (auth == "R") {
		editable = false;
	}
	//JooSetBtnClass("C", editable);
	//$('button[auth="C"]').prop('disabled',!(document.all.lenght) > 0);
	for ( var i = 0; i < sheetObjects.length; i++) {
		sheetObjects[i].SetEditable(editable);
	}
	var formObj = document.form;
	formObj.btn_create.disabled = !editable;
	formObj.btn_save.disabled = !editable;
	formObj.btn_delete1.disabled = !editable;
	formObj.btn_delete2.disabled = !editable;
	jo_stl_opt_cd.SetEnable(editable);
	formObj.delt_flg_tmp.disabled = !editable;
	formObj.cust_seq.readOnly = !editable;
	formObj.vndr_seq.readOnly = !editable;
}
/**
 * Customer Code OnBlur
 * 
 * @return
 */
function cust_seq_onblur() {
	var formObj = document.form;
	if (formObj.cust_seq.value.length < 3) {
		formObj.cust_lgl_eng_nm.value = "";
	} else {
		if (ComIsNumber(formObj.cust_seq.value.substring(0, 2))) {
			ComShowCodeMessage('JOO00003');
			formObj.cust_seq.value = "";
			formObj.cust_seq.focus();
			return;
		}
		if (!ComIsNumber(formObj.cust_seq.value.substring(2))) {
			ComShowCodeMessage('JOO00003');
			formObj.cust_seq.value = "";
			formObj.cust_seq.focus();
			return;
		}
		doActionIBSheet(sheetObjects[2], formObj, IBSEARCH_ASYNC01);
	}
}
/**
 * Vendor Code OnBlur
 * 
 * @return
 */
function vndr_seq_onblur() {
	var formObj = document.form;
	var vndrSeq = formObj.vndr_seq.value;
	if (vndrSeq.length == 0) {
		formObj.vndr_lgl_eng_nm.value = "";
	} else {
		doActionIBSheet(sheetObjects[2], formObj, IBSEARCH_ASYNC02);
	}
}
/**
 * setting sheet initial values and header param : sheetObj, sheetNo adding case
 * as numbers of counting sheets
 */
function initSheet(sheetObj, sheetNo, currCombo) {
	var cnt = 0;
	switch (sheetNo) {
	case 1: // sheet1 init
		with (sheetObj) {

			if (location.hostname != "")
				var HeadTitle = "STS||Item|Customer|DR|DR|DR|CR|CR|CR|Full Name|Cur.|Carrier|Lane|RE";
			var HeadTitle1 = "STS||Item|Customer|ACCT|Center|City|ACCT|Center|City|Full Name|Cur.|Carrier|Lane|RE";
			var headCount = ComCountHeadTitle(HeadTitle);
			// (headCount, 0, 0, true);
			var prefix = "sheet1_";

			SetConfig({SearchMode : 2, MergeSheet : 5, Page : 20, DataRowMerge : 1});

			var info = {Sort : 1, ColMove : 1, HeaderCheck : 1, ColResize : 1};
			var headers = [ { Text : HeadTitle, Align : "Center" }
			              , { Text : HeadTitle1, Align : "Center"} ];
			InitHeaders(headers, info);

			var cols = [ 
	             { Type : "Status", Hidden : 0, Width : 50, Align : "Center", ColMerge : 1, SaveName : prefix + "ibflag" }, 
	             { Type : "CheckBox", Hidden : 0, Width : 70, Align : "Center", ColMerge : 1, SaveName : prefix + "del_chk" }, 
	             { Type : "Text", Hidden : 0, Width : 70, Align : "Center", ColMerge : 1, SaveName : prefix + "jo_stl_itm_cd", KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
	             { Type : "Text", Hidden : 0, Width : 70, Align : "Center", ColMerge : 1, SaveName : prefix + "cust_seq", KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
	             { Type : "Text", Hidden : 0, Width : 70, Align : "Center", ColMerge : 0, SaveName : prefix + "dr_acct_cd", KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
	             { Type : "Text", Hidden : 0, Width : 70, Align : "Center", ColMerge : 0, SaveName : prefix + "dr_ctr_cd", KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
	             { Type : "Text", Hidden : 0, Width : 70, Align : "Center", ColMerge : 0, SaveName : prefix + "dr_loc_cd", KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
	             { Type : "Text", Hidden : 0, Width : 70, Align : "Center", ColMerge : 0, SaveName : prefix + "cr_acct_cd", KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0	}, 
	             { Type : "Text", Hidden : 0, Width : 70, Align : "Center", ColMerge : 0, SaveName : prefix + "cr_ctr_cd", KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
	             { Type : "Text", Hidden : 0, Width : 70, Align : "Center", ColMerge : 0, SaveName : prefix + "cr_loc_cd", KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
	             { Type : "Text", Hidden : 0, Width : 150, Align : "Left", ColMerge : 1, SaveName : prefix + "jo_stl_itm_nm", KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
	             { Type : "Combo", Hidden : 0, Width : 200, Align : "Center", ColMerge : 1, SaveName : prefix + "locl_curr_cd", KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 1,InsertEdit : 1 }, 
	             { Type : "Text", Hidden : 1, Width : 0, Align : "Left", ColMerge : 1, SaveName : prefix + "jo_crr_cd", KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0}, 
	             { Type : "Text", Hidden : 1, Width : 0, Align : "Left", ColMerge : 1, SaveName : prefix + "rlane_cd", KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
	             { Type : "Text", Hidden : 1, Width : 0, Align : "Left", ColMerge : 1, SaveName : prefix + "re_divr_cd", KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 } 
	             ];

			InitColumns(cols);
			SetEditable(1);
			SetSheetHeight(200);
			// FitColWidth("15|10|20|20|20|20|20|20|20|20|80|20|0|0|0");
			SetColProperty(prefix + "locl_curr_cd", { ComboText : currCombo, ComboCode : currCombo });
		}
		break;
	case 2: // sheet2 init
		with (sheetObj) {

			if (location.hostname != "")
				var HeadTitle = "STS||Item|Service\nProvider|DR|DR|DR|CR|CR|CR|Full Name|Cur.|Carrier|Lane|RE";
			var HeadTitle1 = "STS||Item|Service\nProvider|ACCT|Center|City|ACCT|Center|City|Full Name|Cur.|Carrier|Lane|RE";
			var headCount = ComCountHeadTitle(HeadTitle);
			// (headCount, 0, 0, true);
			var prefix = "sheet2_";

			SetConfig({ SearchMode : 2,	MergeSheet : 5, Page : 20, DataRowMerge : 1 });

			var info = { Sort : 1, ColMove : 1, HeaderCheck : 1, ColResize : 1 };
			var headers = [ { Text : HeadTitle, Align : "Center" }, 
			                { Text : HeadTitle1, Align : "Center"} ];
			InitHeaders(headers, info);

			var cols = [ 
				{ Type : "Status", Hidden : 0, Width : 50, Align : "Center",ColMerge : 1, SaveName : prefix + "ibflag" }, 
				{ Type : "CheckBox", Hidden : 0, Width : 70, Align : "Center", ColMerge : 1, SaveName : prefix + "del_chk" }, 
				{ Type : "Text", Hidden : 0, Width : 70, Align : "Center", ColMerge : 1, SaveName : prefix + "jo_stl_itm_cd", KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 1 }, 
				{ Type : "Text", Hidden : 0, Width : 70, Align : "Center", ColMerge : 1, SaveName : prefix + "cust_seq", KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0  },
				{ Type : "Text", Hidden : 0, Width : 70, Align : "Center", ColMerge : 0, SaveName : prefix + "dr_acct_cd", KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
				{ Type : "Text", Hidden : 0, Width : 70, Align : "Center", ColMerge : 0, SaveName : prefix + "dr_ctr_cd", KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
				{ Type : "Text", Hidden : 0, Width : 70, Align : "Center", ColMerge : 0, SaveName : prefix + "dr_loc_cd", KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
				{ Type : "Text", Hidden : 0, Width : 70, Align : "Center", ColMerge : 0, SaveName : prefix + "cr_acct_cd", KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
				{ Type : "Text", Hidden : 0, Width : 70, Align : "Center", ColMerge : 0, SaveName : prefix + "cr_ctr_cd", KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
				{ Type : "Text", Hidden : 0, Width : 70, Align : "Center", ColMerge : 0, SaveName : prefix + "cr_loc_cd", KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0}, 
				{ Type : "Text", Hidden : 0, Width : 150, Align : "Left", ColMerge : 1, SaveName : prefix + "jo_stl_itm_nm", KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
				{ Type : "Combo", Hidden : 0, Width : 200, Align : "Center", ColMerge : 1,SaveName : prefix + "locl_curr_cd", KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 1, InsertEdit : 1 }, 
				{ Type : "Text", Hidden : 1, Width : 0, Align : "Left", ColMerge : 1, SaveName : prefix + "jo_crr_cd", KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
				{ Type : "Text", Hidden : 1, Width : 0, Align : "Left", ColMerge : 1, SaveName : prefix + "rlane_cd", KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
				{ Type : "Text", Hidden : 1, Width : 0, Align : "Left", ColMerge : 1, SaveName : prefix + "re_divr_cd", KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 } 
				];

			InitColumns(cols);
			SetEditable(1);
//			SetSheetHeight(200);
			resizeSheet();
			// FitColWidth("15|10|20|20|20|20|20|20|20|20|80|20|0|0|0");
			SetColProperty(prefix + "locl_curr_cd", { ComboText : currCombo, ComboCode : currCombo });
		}
		break;
	case 3: // sheet3 init
		with (sheetObj) {
			// SetSheetHeight(0);
			if (location.hostname != "")
				var HeadTitle = "STS|DEL_CHK|JO_CRR_CD|RLANE_CD|VNDR_SEQ|VNDR_LGL_ENG_NM|CUST_CNT_CD|CUST_SEQ|CUST_LGL_ENG_NM|TRD_CD|DELT_FLG|JO_STL_OPT_CD";
			var headCount = ComCountHeadTitle(HeadTitle);
			// (headCount, 0, 0, true);
			var prefix = "sheet3_";
			SetConfig({ SearchMode : 2, MergeSheet : 5, Page : 20, DataRowMerge : 1 });
			var info = { Sort : 1, ColMove : 1, HeaderCheck : 1, ColResize : 1 };
			var headers = [ { Text : HeadTitle, Align : "Center" } ];
			InitHeaders(headers, info);

			var cols = [ 
			    { Type : "Status", Hidden : 0, Width : 30, Align : "Left", ColMerge : 0, SaveName : prefix + "ibflag" },			             
			    { Type : "CheckBox", Hidden : 0, Width : 30, Align : "Left", ColMerge : 0, SaveName : prefix + "del_chk" }, 
			    { Type : "Text", Hidden : 0, Width : 100, Align : "Left", ColMerge : 0, SaveName : prefix + "jo_crr_cd" }, 
			    { Type : "Text", Hidden : 0, Width : 100, Align : "Left", ColMerge : 0, SaveName : prefix + "rlane_cd" }, 
			    { Type : "Text", Hidden : 0, Width : 100, Align : "Left", ColMerge : 0, SaveName : prefix + "vndr_seq" }, 
			    { Type : "Text", Hidden : 0, Width : 100, Align : "Left", ColMerge : 0, SaveName : prefix + "vndr_lgl_eng_nm" }, 
			    { Type : "Text", Hidden : 0, Width : 100, Align : "Left", ColMerge : 0, SaveName : prefix + "cust_cnt_cd" }, 
			    { Type : "Text", Hidden : 0, Width : 100, Align : "Left", ColMerge : 0, SaveName : prefix + "cust_seq" }, 
			    { Type : "Text", Hidden : 0, Width : 100, Align : "Left", ColMerge : 0, SaveName : prefix + "cust_lgl_eng_nm" }, 
			    { Type : "Text", Hidden : 0, Width : 100, Align : "Left", ColMerge : 0, SaveName : prefix + "trd_cd" }, 
			    { Type : "Text", Hidden : 0, Width : 30, Align : "Left", ColMerge : 0, SaveName : prefix + "delt_flg" }, 
			    { Type : "Text", Hidden : 0, Width : 30, Align : "Left", ColMerge : 0, SaveName : prefix + "jo_stl_opt_cd" } 
			    ];

			InitColumns(cols);
			SetEditable(0);
			SetVisible(false);
		}
		break;
	case 4: // sheet3 init
		with (sheetObj) {

			if (location.hostname != "")
				SetConfig({ SearchMode : 2, DataRowMerge : 0 });
			var info = { Sort : 1, ColMove : 1, ColResize : 1, HeaderCheck : 1 };
			var headers = [];
			InitHeaders(headers, info);
			var cols = [];
			// InitColumns(cols);
			SetVisible(false);

		}
		break;
	}
}
/**
 * doActionIBSheet
 * 
 * @param sheetObj
 * @param formObj
 * @param sAction
 * @return
 */
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	if (!validateForm(sheetObj, formObj, sAction)) {
		return false;
	}
	switch (sAction) {
	case IBSEARCH: // retrieve
		sheetObjects[0].RemoveAll();
		sheetObjects[1].RemoveAll();
		formObj.f_cmd.value = SEARCH;
		var aryPrefix = new Array("sheet1_", "sheet2_", "sheet3_"); // prefix
		// characters
		// array
		var sXml = sheetObj.GetSearchData("FNS_JOO_0002GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix));
		var arrXml = sXml.split("|$$|");
		for ( var inx = 0; inx < arrXml.length; inx++) {
			sheetObjects[inx].LoadSearchData(arrXml[inx], { Sync : 1 });
		}
		break;
	case IBCREATE: // create
		sheetObjects[0].RemoveAll();
		sheetObjects[1].RemoveAll();
		var aryPrefix = new Array("sheet1_", "sheet2_", "sheet3_");
		formObj.f_cmd.value = SEARCH01;
		var sXml = sheetObj.GetSearchData("FNS_JOO_0002GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix));
		var arrXml = sXml.split("|$$|");
		for ( var inx = 0; inx < arrXml.length; inx++) { 
			sheetObjects[inx].LoadSearchData(arrXml[inx], { Sync : 1 });
		}
		var curr = "";
		for ( var inx = sheetObjects[0].HeaderRows(); inx <= sheetObjects[0].LastRow(); inx++) {
			if (curr == "" && sheetObjects[0].GetRowStatus(inx) == "R") {
				curr = sheetObjects[0].GetCellValue(inx, aryPrefix[0] + "locl_curr_cd");
				break;
			}
		}
		if (curr == "") {
			for ( var inx = sheetObjects[1].HeaderRows(); inx <= sheetObjects[1].LastRow(); inx++) {
				if (curr == "" && sheetObjects[1].GetRowStatus(inx) == "R") {
					curr = sheetObjects[1].GetCellValue(inx, aryPrefix[1] + "locl_curr_cd");
					break;
				}
			}
		}
		
		if(curr == "") curr = "USD";//2015.08.04 Add Default USD 셋팅.
		
		for ( var inx = sheetObjects[0].HeaderRows(); inx <= sheetObjects[0].LastRow(); inx++) {
			if (sheetObjects[0].GetRowStatus(inx) == "I") {
				sheetObjects[0].SetCellValue(inx, aryPrefix[0] + "locl_curr_cd", curr, 0);
			}
		}
		for ( var inx = sheetObjects[1].HeaderRows(); inx <= sheetObjects[1].LastRow(); inx++) {
			if (sheetObjects[1].GetRowStatus(inx) == "I") {
				sheetObjects[1].SetCellValue(inx, aryPrefix[1] + "locl_curr_cd", curr, 0);
			}
		}
		break;
	case IBSAVE: // save
		var SaveStr = ComGetSaveString(sheetObjects);
		if (SaveStr == "") {
			ComShowCodeMessage('JOO00036'); // not existing data
			return;
		}
		if (!ComShowCodeConfirm('JOO00046')) {
			return;
		}
		var aryPrefix = new Array("sheet1_", "sheet2_", "sheet3_"); // prefix
		// character
		// array
		sheetObj.SetWaitImageVisible(0);
		ComOpenWait(true);
		formObj.f_cmd.value = MULTI;
		var sXml = sheetObj.GetSaveData("FNS_JOO_0002GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix));
		sheetObj.LoadSearchData(sXml, { Sync : 1 });
		ComOpenWait(false);
		doActionIBSheet(sheetObj, formObj, IBSEARCH);
		break;
	case IBSEARCH_ASYNC01: // getting Customer name
		formObj.f_cmd.value = SEARCHLIST04;
		formObj.code.value = formObj.cust_seq.value;
		formObj.super_cd1.value = "";
		formObj.super_cd2.value = "";
		var sXml = sheetObj.GetSearchData("JOOCommonGS.do", FormQueryString(formObj));
		var custNm = ComGetEtcData(sXml, "cust_lgl_eng_nm");
		if (custNm == undefined || custNm == null || ComTrim(custNm) == '') {
			ComShowCodeMessage("JOO00003");
			formObj.cust_lgl_eng_nm.value = "";
			formObj.cust_seq.value = "";
			formObj.cust_seq.focus();
		} else {
			formObj.cust_seq.value = ComGetEtcData(sXml, "cust_seq");
			formObj.cust_lgl_eng_nm.value = custNm;
			formObj.vndr_seq.focus();
		}
		break;
	case IBSEARCH_ASYNC02: // getting Vendor name
		formObj.f_cmd.value = SEARCHLIST05;
		formObj.code.value = formObj.vndr_seq.value;
		formObj.super_cd1.value = "";
		formObj.super_cd2.value = "";
		var sXml = sheetObj.GetSearchData("JOOCommonGS.do", FormQueryString(formObj));
		var vndrNm = ComGetEtcData(sXml, "vndr_lgl_eng_nm");
		if (vndrNm == undefined || vndrNm == null || ComTrim(vndrNm) == '') {
			ComShowCodeMessage("JOO00147");
			formObj.vndr_lgl_eng_nm.value = "";
			formObj.vndr_seq.value = "";
			formObj.vndr_seq.focus();
		} else {
			formObj.vndr_seq.value = ComGetEtcData(sXml, "vndr_seq");
			formObj.vndr_lgl_eng_nm.value = vndrNm;
		}
		break;
	case IBSEARCH_ASYNC03: // checking Carrier validation
		formObj.f_cmd.value = SEARCHLIST12;
		formObj.super_cd1.value = "";
		formObj.code.value = formObj.jo_crr_cd.value;
		formObj.super_cd2.value = "";
		var sXml = sheetObj.GetSearchData("JOOCommonGS.do", FormQueryString(formObj));
		var check = ComGetEtcData(sXml, "CHECK");
		if (check == "E") {
			ComShowMessage(ComGetEtcData(sXml, "CHKMSG"));
			formObj.jo_crr_cd.value = "";
			formObj.jo_crr_cd_hid.value = "";
			formObj.jo_crr_cd.focus();
		} else {
			formObj.jo_crr_cd_hid.value = formObj.jo_crr_cd.value;
			// formObj.trd_cd.focus();
		}
		break;
	}
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	switch (sAction) {
	case IBCREATE: // retrieving for saving
		if (formObj.jo_crr_cd.value.length < 3) {
			ComShowCodeMessage('JOO00008'); // Select a Carrier code
			formObj.jo_crr_cd.focus();
			return false;
		}
		if (trd_cd.GetSelectIndex() == -1) {
			ComShowCodeMessage('JOO00009'); // Select a Trade code
			// formObj.trd_cd.focus();
			return false;
		}
		if (rlane_cd.GetSelectIndex() == -1) {
			ComShowCodeMessage('JOO00010'); // Select a Revenue Lane code
			// formObj.rlane_cd.focus();
			return false;
		}
		if (jo_stl_opt_cd.GetSelectIndex() == -1) {
			ComShowCodeMessage('JOO00133'); // Select a settlement option
			// formObj.jo_stl_opt_cd.focus();
			return false;
		}
		if (formObj.delt_flg_tmp.checked) {
			ComShowCodeMessage('JOO00004');// ("If you want to create accounts,
			// uncheck the delete mark...");
			formObj.delt_flg_tmp.focus();
			return false;
		}
		// prohibiting both Customer and Vendor are null
		if (formObj.cust_seq.value.length < 3
				&& formObj.vndr_seq.value.length < 1) {
			ComShowCodeMessage('JOO00005');// ("You should input one at least,
			// either Customer or Vendor...");
			formObj.cust_seq.focus();
			return false;
		}
		break;
	case IBSAVE: // save
		if (formObj.jo_crr_cd.value.length < 3) {
			ComShowCodeMessage('JOO00008'); // Select a Carrier code
			formObj.jo_crr_cd.focus();
			return false;
		}
		if (trd_cd.GetSelectIndex() == -1) {
			ComShowCodeMessage('JOO00009'); // Select a Trade code
			// formObj.trd_cd.focus();
			return false;
		}
		if (rlane_cd.GetSelectIndex() == -1) {
			ComShowCodeMessage('JOO00010'); // Select a Revenue Lane code
			// formObj.rlane_cd.focus();
			return false;
		}
		if (jo_stl_opt_cd.GetSelectIndex() == -1) {
			ComShowCodeMessage('JOO00133'); // Select a settlement option
			// formObj.jo_stl_opt_cd.focus();
			return false;
		}
		// prohibiting both Customer and Vendor are null
		if (formObj.cust_seq.value.length < 3
				&& formObj.vndr_seq.value.length < 1) {
			ComShowCodeMessage('JOO00005');// ("You should input one at least,
			// either Customer or Vendor...");
			formObj.cust_seq.focus();
			return false;
		}
		if ((formObj.cust_seq.value.length != 0)
				&& (formObj.cust_lgl_eng_nm.value.length == 0)) {
			ComShowCodeMessage('JOO00006');// ("Check the Validation of
			// Customer Code");
			formObj.cust_seq.focus();
			return false;
		}
		if ((formObj.vndr_seq.value.length != 0) && (formObj.vndr_lgl_eng_nm.value.length == 0)) {
			ComShowCodeMessage('JOO00007');// ("Check the Validation of Vendor
			// Code");
			formObj.vndr_seq.focus();
			return false;
		}
		if (existsUnDelRows(sheetObjects[0], "sheet1_")) {
			ComShowCodeMessage('JOO00079');
			return false;
		}
		if (existsUnDelRows(sheetObjects[1], "sheet2_")) {
			ComShowCodeMessage('JOO00079');
			return false;
		}
		if (sheetObjects[0].RowCount() > 0) {
			for ( var inx = sheetObjects[0].HeaderRows(); inx <= sheetObjects[0].LastRow(); inx++) {
				var rowStatus = sheetObjects[0].GetRowStatus(inx);
				if (rowStatus == "D" || rowStatus == "R")
					continue;
				var drCntr = sheetObjects[0].GetCellValue(inx, "sheet1_dr_ctr_cd");
				if (ComTrim(drCntr) == "") {
					ComShowCodeMessage("JOO00019", (inx - sheetObjects[0].HeaderRows() + 1) + "th DR Center Code");
					sheetObjects[0].SelectCell(inx, "sheet1_dr_ctr_cd", true);
					return false;
				}
				var drLoc = sheetObjects[0].GetCellValue(inx, "sheet1_dr_loc_cd");
				if (ComTrim(drLoc) == "") {
					ComShowCodeMessage("JOO00019", (inx - sheetObjects[0].HeaderRows() + 1) + "th DR Local Code");
					sheetObjects[0].SelectCell(inx, "sheet1_dr_loc_cd", true);
					return false;
				}
				var crCntr = sheetObjects[0].GetCellValue(inx, "sheet1_cr_ctr_cd");
				if (ComTrim(crCntr) == "") {
					ComShowCodeMessage("JOO00019", (inx - sheetObjects[0].HeaderRows() + 1) + "th CR Center Code");
					sheetObjects[0].SelectCell(inx, "sheet1_cr_ctr_cd", true);
					return false;
				}
				var crLoc = sheetObjects[0].GetCellValue(inx, "sheet1_cr_loc_cd");
				if (ComTrim(crLoc) == "") {
					ComShowCodeMessage("JOO00019", (inx - sheetObjects[0].HeaderRows() + 1) + "th CR Local Code");
					sheetObjects[0].SelectCell(inx, "sheet1_cr_loc_cd", true);
					return false;
				}
				var currency = sheetObjects[0].GetCellValue(inx, "sheet1_locl_curr_cd");
				if (currency == "") {
					ComShowCodeMessage('JOO00114', inx - sheetObjects[0].HeaderRows() + 1);
					sheetObjects[0].SelectCell(inx, "sheet1_locl_curr_cd", true);
					return false;
				}
			}
		}
		if (sheetObjects[1].RowCount() > 0) {
			for ( var inx = sheetObjects[1].HeaderRows(); inx <= sheetObjects[1].LastRow(); inx++) {
				var rowStatus = sheetObjects[1].GetRowStatus(inx);
				if (rowStatus == "D" || rowStatus == "R")
					continue;
				var drCntr = sheetObjects[1].GetCellValue(inx, "sheet2_dr_ctr_cd");
				if (ComTrim(drCntr) == "") {
					ComShowCodeMessage("JOO00019", (inx - sheetObjects[1].HeaderRows() + 1) + "th DR Center Code");
					sheetObjects[1].SelectCell(inx, "sheet2_dr_ctr_cd", true);
					return false;
				}
				var drLoc = sheetObjects[1].GetCellValue(inx, "sheet2_dr_loc_cd");
				if (ComTrim(drLoc) == "") {
					ComShowCodeMessage("JOO00019", (inx - sheetObjects[1].HeaderRows() + 1) + "th DR Local Code");
					sheetObjects[0].SelectCell(inx, "sheet2_dr_loc_cd", true);
					return false;
				}
				var crCntr = sheetObjects[1].GetCellValue(inx, "sheet2_cr_ctr_cd");
				if (ComTrim(crCntr) == "") {
					ComShowCodeMessage("JOO00019", (inx - sheetObjects[1].HeaderRows() + 1) + "th CR Center Code");
					sheetObjects[1].SelectCell(inx, "sheet2_cr_ctr_cd", true);
					return false;
				}
				var crLoc = sheetObjects[1].GetCellValue(inx, "sheet2_cr_loc_cd");
				if (ComTrim(crLoc) == "") {
					ComShowCodeMessage("JOO00019", (inx - sheetObjects[1].HeaderRows() + 1) + "th CR Local Code");
					sheetObjects[0].SelectCell(inx, "sheet2_cr_loc_cd", true);
					return false;
				}
				var currency = sheetObjects[1].GetCellValue(inx, "sheet2_locl_curr_cd");
				if (currency == "") {
					ComShowCodeMessage('JOO00114', inx - sheetObjects[1].HeaderRows() + 1);
					sheetObjects[1].SelectCell(inx, "sheet2_locl_curr_cd", true);
					return false;
				}
			}
		}
		// setting Input contents in Sheet
		UF_setInputToSheet();
		break;
	case IBSEARCH: // retrieve
		if (formObj.jo_crr_cd.value.length < 3) {
			ComShowCodeMessage('JOO00008'); // Select a Carrier code
			formObj.jo_crr_cd.focus();
			return false;
		}
		if (trd_cd.GetSelectIndex() == -1) {
			ComShowCodeMessage('JOO00009'); // Select a Trade code
			// formObj.trd_cd.focus();
			return false;
		}
		if (rlane_cd.GetSelectIndex() == -1) {
			ComShowCodeMessage('JOO00010'); // Select a Revenue Lane code
			// formObj.rlane_cd.focus();
			return false;
		}
		break;
	}
	return true;
}
// sheet1_OnChange
function sheet1_OnChange(sheetObj, Row, Col, Value) {
	var prefix = "sheet1_";
	// appling all sheet data in case changing currency code
	if (sheetObj.ColSaveName(Col) == prefix + "locl_curr_cd") {
		setCurVal(Value);
	}
}
// sheet2_OnChange
function sheet2_OnChange(sheetObj, Row, Col, Value) {
	var prefix = "sheet2_";
	// appling all sheet data in case changing currency code
	if (sheetObj.ColSaveName(Col) == prefix + "locl_curr_cd") {
		setCurVal(Value);
	}
}
/**
 * Currency setting
 * 
 * @param Value
 * @return
 */
function setCurVal(Value) {
	var prefix1 = "sheet1_";
	var prefix2 = "sheet2_";
	for ( var inx = sheetObjects[0].HeaderRows(); inx <= sheetObjects[0].LastRow(); inx++) {
		if (sheetObjects[0].GetCellValue(inx, prefix1 + "jo_stl_itm_cd") != "")
			if (sheetObjects[0].GetCellValue(inx, prefix1 + "locl_curr_cd") != Value)
				sheetObjects[0].SetCellValue(inx, prefix1 + "locl_curr_cd", Value, 0);
	}
	for ( var inx = sheetObjects[1].HeaderRows(); inx <= sheetObjects[1].LastRow(); inx++) {
		if (sheetObjects[1].GetCellValue(inx, prefix2 + "jo_stl_itm_cd") != "")
			if (sheetObjects[1].GetCellValue(inx, prefix2 + "locl_curr_cd") != Value)
				sheetObjects[1].SetCellValue(inx, prefix2 + "locl_curr_cd", Value, 0);
	}
}
/**
 * displaying carrier information in input text
 * 
 * @return
 */
function UF_setSheetToInput() {
	var sheet = sheetObjects[2];
	var form = document.form;
	var row = sheet.RowCount();
	var prefix = "sheet3_";
	if (row == 0) {
		jo_stl_opt_cd.SetSelectIndex(-1);
		form.delt_flg.value = "N";
		form.delt_flg_tmp.value = "N";
		form.delt_flg_tmp.checked = false;
		form.cust_seq.value = "";
		form.cust_lgl_eng_nm.value = "";
		form.vndr_seq.value = "";
		form.vndr_lgl_eng_nm.value = "";
		sheet.DataInsert(-1);
	} else {
		form.jo_crr_cd_hid.value = sheet.GetCellValue(row, prefix + "jo_crr_cd");
		jo_stl_opt_cd.SetSelectCode(sheet.GetCellValue(row, prefix+ "jo_stl_opt_cd"));
		form.delt_flg.value = sheet.GetCellValue(row, prefix + "delt_flg");
		var custCntCd = sheet.GetCellValue(row, prefix + "cust_cnt_cd");
		var custSeq = sheet.GetCellValue(row, prefix + "cust_seq");
		form.cust_seq.value = custCntCd + custSeq;
		form.cust_lgl_eng_nm.value = sheet.GetCellValue(row, prefix+ "cust_lgl_eng_nm");
		form.vndr_seq.value = sheet.GetCellValue(row, prefix + "vndr_seq");
		form.vndr_lgl_eng_nm.value = sheet.GetCellValue(row, prefix+ "vndr_lgl_eng_nm");
		var deltFlg = sheet.GetCellValue(row, prefix + "delt_flg");
		form.delt_flg_tmp.value = deltFlg;
		if (deltFlg == "Y")
			form.delt_flg_tmp.checked = true;
		else
			form.delt_flg_tmp.checked = false;
	}
}
/**
 * setting carrier information in sheet
 * 
 * @return
 */
function UF_setInputToSheet() {
	var sheet = sheetObjects[2];
	var form = document.form;
	var row = sheet.LastRow();
	var prefix = "sheet3_";
	sheet.SetCellValue(row, prefix + "jo_crr_cd", form.jo_crr_cd.value);
	sheet.SetCellValue(row, prefix + "trd_cd", trd_cd.GetSelectCode());
	sheet.SetCellValue(row, prefix + "rlane_cd", rlane_cd.GetSelectCode());
	sheet.SetCellValue(row, prefix + "jo_stl_opt_cd", jo_stl_opt_cd.GetSelectCode());
	sheet.SetCellValue(row, prefix + "delt_flg", form.delt_flg_tmp.checked ? "Y" : "N");
	if (form.cust_seq.value.length > 2) {
		sheet.SetCellValue(row, prefix + "cust_cnt_cd", form.cust_seq.value.substring(0, 2));
		sheet.SetCellValue(row, prefix + "cust_seq", form.cust_seq.value.substring(2));
	} else {
		sheet.SetCellValue(row, prefix + "cust_cnt_cd", form.cust_seq.value);
		sheet.SetCellValue(row, prefix + "cust_seq", form.cust_seq.value);
	}
	sheet.SetCellValue(row, prefix + "cust_lgl_eng_nm",form.cust_lgl_eng_nm.value);
	sheet.SetCellValue(row, prefix + "vndr_seq", form.vndr_seq.value);
	sheet.SetCellValue(row, prefix + "vndr_lgl_eng_nm", form.vndr_lgl_eng_nm.value);
}
/**
 * after retrieving Sheet3
 * 
 * @param sheetObj
 * @param ErrMsg
 * @return
 */
function sheet3_OnSearchEnd(sheetObj, ErrMsg) {
	UF_setSheetToInput();
}
/**
 * Reset
 * 
 * @param joCrrCd
 * @return
 */
function UF_reset(joCrrCd) {
	if (joCrrCd == undefined || joCrrCd == null) {
		joCrrCd = "";
	}
	var formObj = document.form;
	sheetObjects[0].RemoveAll();
	sheetObjects[1].RemoveAll();
	sheetObjects[2].RemoveAll();
	sheetObjects[2].DataInsert(-1);
	comboObjects[0].SetSelectIndex(-1, false);
	comboObjects[1].SetSelectIndex(-1, false);
	comboObjects[1].RemoveAll();
	comboObjects[2].SetSelectIndex(-1, false);
	UF_setSheetToInput();
	formObj.jo_crr_cd.value = joCrrCd;
	if (joCrrCd == "") {
		//formObj.jo_crr_cd.focus();
	} else {
		// formObj.trd_cd.focus();
	}
}

function resizeSheet(){
    ComResizeSheet(sheetObjects[1]);
}
