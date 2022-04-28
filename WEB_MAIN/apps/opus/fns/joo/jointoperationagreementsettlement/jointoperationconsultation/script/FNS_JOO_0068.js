/*=========================================================
*Copyright(c) 2009 CyberLogitec. All Rights Reserved.
*@FileName   FNS_JOO_0068.js
*@FileTitle  : CSR Inquiry Detail
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/05
=========================================================*/ 
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class FNS_JOO_0068 : business script for FNS_JOO_0068
 */
// common global variable
var tabObjects=new Array();
var tabCnt=0;
var beforetab=1;
var sheetObjects=new Array();
var sheetCnt=0;
var rdCnt=0;
var queryStr="";
var prefix="sheet1_";
// Event handler processing by button click event */
document.onclick=processButtonClick;
// Event handler processing by button name */
function processButtonClick() {
	/** *** setting sheet object **** */
	var sheetObject1=sheetObjects[0];
	/** **************************************************** */
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
		case "btn_retrieve":
			doActionIBSheet(sheetObject1, formObj, IBSEARCH);
			break;
		case "btn_print":
			var csrNo=formObj.csr_no.value;
			if (csrNo.length < gDefaultCsrLength) {
				ComShowCodeMessage("JOO00074");
				return;
			}
			rdOpen(formObj);
			break;
		case "btn_reverse":
			doActionIBSheet(sheetObject1, formObj, IBCREATE);
			break;
		case "btn_cancel"://NYK Modify 2014.11.10			
			
			doActionIBSheet(sheetObject1, formObj, IBSAVE);
			break;
		case "btn_evd":
			var csrNo=formObj.csr_no.value;
			if (csrNo.length < gDefaultCsrLength) {
				ComShowCodeMessage("JOO00074");
				return;
			}
			if (csrNo.substring(0, 2) != "06") {
				ComShowCodeMessage("JOO00119");
				return;
			}
			//NYK Modify 2014.11.10 evid_tp_cd : F0, E3 로 코드 변경.
			/*if (formObj.evid_tp_cd.value != "1") {
				ComShowCodeMessage("JOO00119");
				return;
			}*/
			var param='?csrNo=' + csrNo + '&editable=N';
			ComOpenPopup("/opuscntr/FNS_JOO_0018.do" + param, 900, 600,
					"popupFinish", "1,0,1,1,1,1,1,1", true, false, 0, 0, 0,
					"pop2");
			break;
		case "btn_csr":
			var csrNo=formObj.csr_no.value;
			if (csrNo.length < gDefaultCsrLength) {
				ComShowCodeMessage("JOO00074");
				return;
			}
			var param='?csrNo=' + csrNo;
			//ComOpenPopup("/opuscntr/FNS_JOO_0024.do" + param, 835, 440,"popupFinish", "1,0,1,1,1,1,1,1", true, false, 0, 0, 0,"pop1");
			//ComOpenPopup("/opuscntr/FNS_JOO_0024.do" + param, 835, 450,"popupFinish", "none", true, false, 0, 0, 0,"pop1");
			ComJooCsrDetailPopup(param, "", "");
			break;
		case "apro_step_btn" :
    	    var v_ofc_cd=formObj.slp_iss_ofc_cd.value;
    	    var v_sub_sys_cd="JOO";
            var param="?mode=save&ofc_cd="+v_ofc_cd+"&sub_sys_cd="+v_sub_sys_cd+"&classId=COM_ENS_0T1"+"&target_obj_nm=apro_step";
				ComOpenPopup('/opuscntr/COM_ENS_0T1.do'+param, 835, 540, '', 'none', true);
			break;
		case "btn_close":
			ComClosePopup(); 
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
function popupFinish(rowArray) {
	var fstArray;
	var scnArray;
	//
	// for (var i=0; i < rowArray.length; i++){
	// fstArray = rowArray[i];
	//		
	// for(var j=0; j < fstArray.length; j++){
	// }
	// }
}
/**
 * registering IBSheet Object as list adding process for list in case of needing batch processing with other items
 */
function setSheetObject(sheet_obj) {
	sheetObjects[sheetCnt++]=sheet_obj;
}

function rdOpen(formObj) {
	if (!setQueryStr()) {
		return;
	}
	var rdParam='/rp ' + queryStr;
	var strPath="apps/opus/fns/joo/jointoperationagreementsettlement/jointoperationconsultation/report/FNS_JOO_0019.mrd";
	//if SINWA
    //if (gOfcCd == "SINWA" || gOfcCd == "SINWSG"){
    //	strPath="apps/opus/fns/joo/jointoperationagreementsettlement/jointoperationconsultation/report/FNS_JOO_1019.mrd";
    //}
	/*
    if (OfficeCodeMgr.checkContainOffice("000002", "JOO", gOfcCd)){
    	strPath="apps/opus/fns/joo/jointoperationagreementsettlement/jointoperationconsultation/report/FNS_JOO_1019.mrd";
    }
    */
	var csrNo=formObj.csr_no.value;
	if (csrNo.substring(0, 2) == "18") {
		strPath="apps/opus/fns/joo/jointoperationagreementsettlement/jointoperationconsultation/report/FNS_JOO_0021.mrd";
	    //if SINWA
	    //if (gOfcCd == "SINWA" || gOfcCd == "SINWSG"){
	    //	strPath="apps/opus/fns/joo/jointoperationagreementsettlement/jointoperationconsultation/report/FNS_JOO_1021.mrd";
	    //}
		/*
	    if (OfficeCodeMgr.checkContainOffice("000002", "JOO", gOfcCd)){
	    	strPath="apps/opus/fns/joo/jointoperationagreementsettlement/jointoperationconsultation/report/FNS_JOO_1021.mrd";
	    }
	    */
	}
	formObj.com_mrdPath.value=strPath;
	formObj.com_mrdArguments.value=rdParam;
	ComOpenRDPopup();
}
function setQueryStr() {
	var formObj=document.form;
	queryStr="";
	queryStr += " [" + formObj.csr_no.value + "]";
	return true;
}
/**
 * initializing sheet implementing onLoad event handler in body tag
 */
function loadPage() {
	for (i=0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1);
		ComEndConfigSheet(sheetObjects[i]);
	}
	initControl();
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}
/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
function initSheet(sheetObj, sheetNo) {
	var cnt=0;
	switch (sheetNo) {
	case 1: // t1sheet1 init
	    with(sheetObj){
			var HeadTitle="radio|checkbox|ibflag|slp_tp_cd|slp_func_cd|slp_ofc_cd|slp_iss_dt|"
				+ "slp_ser_no|vndr_seq|cust_cnt_cd|cust_seq|csr_desc|"
				+ "csr_locl_curr_cd|csr_locl_amt|csr_usd_amt|eff_dt|evid_tp_cd|"
				+ "apro_flg|apro_dt|cxl_flg|cxl_desc|csr_offst_no|"
				+ "ddct_flg|ddct_locl_amt|ddct_desc|rqst_locl_amt|rqst_dt|"
				+ "csr_tp_cd|rvs_csr_flg|org_slp_tp_cd|org_slp_func_cd|org_slp_ofc_cd|"
				+ "org_slp_iss_dt|org_slp_ser_no	|csr_no	|issuer	|vndr_cust_seq	|"
				+ "lgl_eng_nm|evid_tp_nm|act_rqst_amt|rvs_cmb_flg|acct_yrmon|"
				+ "jo_crr_cd|stl_cmb_seq|re_divr_cd|slp_iss_ofc_cd|slp_iss_rgn_cd|slp_iss_inter_co_cd|clz_sts_cd|"
				+ "jo_stl_itm_cd|bsa_qty|bsa_slt_prc|auth_cd|apro_step|if_flg|lst_apro_flg|apro_rqst_no|apro_rqst_seq|inv_no";
			var headCount=ComCountHeadTitle(HeadTitle);
			SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );

			var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			var headers = [ { Text:HeadTitle, Align:"Center"} ];
			InitHeaders(headers, info);

			var cols = [ {Type:"Text", Hidden:0,  Width:50,   Align:"Left",    ColMerge:0,   SaveName:"NONE" },
             {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"check" },
             {Type:"Status",    Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"slp_tp_cd" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"slp_func_cd" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"slp_ofc_cd" },
             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"slp_iss_dt",          KeyField:0,   CalcLogic:"",   Format:"" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"slp_ser_no" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"vndr_seq" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_cnt_cd" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_seq" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"csr_desc" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"csr_locl_curr_cd" },
             {Type:"Float",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"csr_locl_amt",        KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"csr_usd_amt" },
             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"eff_dt",              KeyField:0,   CalcLogic:"",   Format:"" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"evid_tp_cd" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"apro_flg" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"apro_dt" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cxl_flg" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cxl_desc" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"csr_offst_no" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ddct_flg" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ddct_locl_amt" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ddct_desc" },
             {Type:"Float",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"rqst_locl_amt",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 },
             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"rqst_dt",             KeyField:0,   CalcLogic:"",   Format:"" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"csr_tp_cd" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"rvs_csr_flg" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"org_slp_tp_cd" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"org_slp_func_cd" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"org_slp_ofc_cd" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"org_slp_iss_dt" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"org_slp_ser_no" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"csr_no" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"issuer" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"vndr_cust_seq" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"lgl_eng_nm" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"evid_tp_nm" },
             {Type:"Float",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"act_rqst_amt",        KeyField:0,   CalcLogic:"|sheet1_csr_locl_amt|-|sheet1_ddct_locl_amt|",Format:"NullFloat",   PointCount:2 },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"rvs_cmb_flg" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"acct_yrmon" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"jo_crr_cd" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"stl_cmb_seq" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"re_divr_cd" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"slp_iss_ofc_cd" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"slp_iss_rgn_cd" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"slp_iss_inter_co_cd" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"clz_sts_cd" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"jo_stl_itm_cd" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"bsa_qty" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"bsa_slt_prc" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"auth_cd" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"apro_step" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"if_flg" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"rcv_err_rsn" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"rcv_err_flg" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"lst_apro_flg" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"apro_rqst_no" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"apro_rqst_seq" },
             {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"inv_no" } ];
       
			InitColumns(cols);
			SetVisible(0);
			SetEditable(0);
            SetColProperty(prefix+"slp_iss_dt", {Format:"Ymd"} );
            SetColProperty(prefix+"eff_dt", {Format:"Ymd"} );
            SetColProperty(prefix+"rqst_dt", {Format:"Ymd"} );
      	}
		break;
	}
}
function initControl() {
	// ** Date separator **/
	DATE_SEPARATOR="-";
	var formObj=document.form;
	// handling Axon event. event catch
	axon_event.addListenerFormat('blur', 'obj_blur', formObj); 
	axon_event.addListenerFormat('focus', 'obj_focus', formObj);
	//axon_event.addListener('keypress', 'csr_no_keypress', 'csr_no');
	//axon_event.addListener('keypress', 'fr_dt_keypress', 'fr_dt');
	//axon_event.addListener('keypress', 'tr_dt_keypress', 'to_dt');
}
// handling Axon event 2
function obj_blur() {
	ComChkObjValid(ComGetEvent());
}
function obj_focus() {
	ComClearSeparator(ComGetEvent());
}

// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	//sheetObj.ShowDebugMsg(false);
	if (!validateForm(sheetObj, formObj, sAction))
		return;
	switch (sAction) {
		case IBSEARCH: // retrieve
			formObj.f_cmd.value=SEARCH;
			sheetObj.DoSearch("FNS_JOO_0068GS.do", FormQueryString(formObj ) + "&" + ComGetPrefixParam(prefix));
			//setSheet2Input(formObj, sheetObj);
			break;
		case IBCREATE: // REVERSE
			sheetObj.SetCellValue(sheetObj.HeaderRows(), prefix+"apro_step",formObj.apro_step.value);
			var SaveStr=ComGetSaveString(sheetObj, true, true);
			if (SaveStr == "") {
				ComShowCodeMessage("JOO00036");
				return;
			}
			if (!ComShowCodeConfirm("JOO00123")) {
				return false;
			}
			sheetObj.SetWaitImageVisible(0);
			ComOpenWait(true);
			formObj.f_cmd.value=MULTI;
			
			//var sXml=sheetObj.GetSaveData("FNS_JOO_0068GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			
			//NYK Modify 2014.11.10
			var param=SaveStr + "&" + FormQueryString(formObj)+"&" + ComGetPrefixParam(prefix);
			var sXml=sheetObj.GetSaveData("FNS_JOO_0068GS.do", param);
			//성공 메세지 출력.
			sheetObj.LoadSaveData(sXml);
			
			ComOpenWait(false);
			
			comPopupOK(); // closing window after saving. and refreshing opener.
			break;
			
		case IBSAVE : //REJECT
			var rcv_err_rsn = sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "rcv_err_rsn");
			sheetObj.SetCellValue(sheetObj.LastRow(), prefix+"cxl_flg","Y");
			sheetObj.SetCellValue(sheetObj.LastRow(), prefix+"cxl_desc",rcv_err_rsn);
			sheetObj.SetCellValue(sheetObj.LastRow(), prefix+"apro_flg","N");
			
			var SaveStr=ComGetSaveString(sheetObj, true, true);
			if (SaveStr==""){
				ComShowCodeMessage("JOO00165"); //Please click the row that you want to reject.
				return;
			}
			if (!ComShowCodeConfirm("JOO00166")){ //Are you sure to reject it?
				return false;
			}
			
			sheetObj.SetWaitImageVisible(0);
			ComOpenWait(true);
			formObj.f_cmd.value=MULTI01;
			
			//NYK Modify 2014.11.10
			var param=SaveStr + "&" + FormQueryString(formObj)+"&" + ComGetPrefixParam(prefix);
			var sXml=sheetObj.GetSaveData("FNS_JOO_0068GS.do", param);
			//성공 메세지 출력.
			sheetObj.LoadSaveData(sXml);
			
			ComOpenWait(false);
			
			comPopupOK(); // closing window after saving. and refreshing opener.
			break;
	}
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	switch (sAction) {
		case IBSEARCH: // retrieve
			break;
		case IBCREATE: // REVERSE
			var rvsCmbFlg=formObj.rvs_cmb_flg.value;
			if (rvsCmbFlg == "Y") {
				ComShowCodeMessage("JOO00120"); // This Combined Data has been Reversed!
				return false;
			}
			var aproFlg=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "apro_flg");// JooGetRadioValue(formObj.cxl_flg);
			if (aproFlg != "Y") {
				ComShowCodeMessage("JOO00153"); // You can make 'Reverse Slip' after approval.
				return false;
			}
			//NYK Modify 2014.11.10 evid_tp_cd F0,E3 코드 변경.
			/*
			var evidTpCd=formObj.evid_tp_cd.value;
			if (evidTpCd == "1") {
				ComShowCodeMessage("JOO00121"); // This Combined Data cannot be reversed cause its evidence type is 'TAX'
				return false;
			}*/
			var cxlFlg=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "cxl_flg");// JooGetRadioValue(formObj.cxl_flg);
			if (cxlFlg == "Y") {
				ComShowCodeMessage("JOO00122"); // This Combined Data was canceled.
				return false;
			}
			var csrNo=formObj.csr_no.value;
			if(csrNo.substring(0, 2) != "18"){//수입이 아닐때(AP 일때는 체크한다.)
				var ifFlg=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "if_flg");
				if (ifFlg != "Y"){
					ComShowCodeMessage("JOO00179"); //Please check CSR  I/F Status.
					return false;
				}
			}
			
			var clzStsCd=formObj.clz_sts_cd.value;
			if (clzStsCd == "C") {
				ComShowCodeMessage("JOO00126"); // This Combined Data cannot be reversed because the month of Eff. Date is closed.
				return false;
			} else if (clzStsCd == "E") {
				ComShowCodeMessage("JOO00125"); // Please check Eff. Date.
				return false;
			}
			//Error Message in case of setting approval line
			/*if (ComTrim(formObj.apro_step.value) == ""){
				ComShowCodeMessage("JOO00174");
				return false;
			}*/
			break;
		case IBSAVE: // REJECT
			var aproFlg=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "apro_flg");// JooGetRadioValue(formObj.cxl_flg);
			if (aproFlg != "Y") {
				ComShowCodeMessage("JOO00192"); // You can make 'Reject CSR' after approval.
				return false;
			}
			var rcvErrFlg=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "rcv_err_flg");// JooGetRadioValue(formObj.cxl_flg);
			if (rcvErrFlg != "E") {
				ComShowCodeMessage("JOO00192"); // You can make 'Reject CSR' after approval.
				return false;
			}
			
			break;
	}
	return true;
}
/**
 * sheet -> input
 * 
 * @param formObj
 * @param sheetObj
 * @return
 */
function setSheet2Input(formObj, sheetObj) {
	var aproFlg="";
	var cxlFlg="";
	var ddctFlg="";
	
	if(sheetObj.RowCount() > 0){
		formObj.csr_offst_no.value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "csr_offst_no");
		formObj.slp_iss_ofc_cd.value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "slp_iss_ofc_cd");
		formObj.slp_iss_dt.value=sheetObj.GetCellText(sheetObj.LastRow(), prefix + "slp_iss_dt");
		formObj.issuer.value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "issuer");
		formObj.csr_desc.value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "csr_desc");
		formObj.vndr_cust_seq.value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "vndr_cust_seq");
		formObj.lgl_eng_nm.value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "lgl_eng_nm");
		formObj.csr_locl_curr_cd.value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "csr_locl_curr_cd");
		formObj.csr_locl_amt.value=sheetObj.GetCellText(sheetObj.LastRow(), prefix + "csr_locl_amt");
		formObj.evid_tp_nm.value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "evid_tp_nm");
		formObj.eff_dt.value=sheetObj.GetCellText(sheetObj.LastRow(), prefix + "eff_dt");
		formObj.rqst_dt.value=sheetObj.GetCellText(sheetObj.LastRow(), prefix + "rqst_dt");
		formObj.cxl_desc.value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "cxl_desc");
		formObj.act_rqst_amt.value=sheetObj.GetCellText(sheetObj.LastRow(), prefix + "act_rqst_amt");
		formObj.ddct_locl_amt.value=sheetObj.GetCellText(sheetObj.LastRow(), prefix + "ddct_locl_amt");
		formObj.ddct_desc.value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "ddct_desc");
		formObj.rvs_csr_flg.value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "rvs_csr_flg");
		formObj.rvs_cmb_flg.value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "rvs_cmb_flg");
		formObj.evid_tp_cd.value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "evid_tp_cd");
		formObj.clz_sts_cd.value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "clz_sts_cd");
		
		aproFlg=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "apro_flg");
		cxlFlg=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "cxl_flg");
		ddctFlg=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "ddct_flg");
	}else{
		formObj.csr_offst_no.value="";
		formObj.slp_iss_ofc_cd.value="";
		formObj.slp_iss_dt.value="";
		formObj.issuer.value="";
		formObj.csr_desc.value="";
		formObj.vndr_cust_seq.value="";
		formObj.lgl_eng_nm.value="";
		formObj.csr_locl_curr_cd.value="";
		formObj.csr_locl_amt.value="";
		formObj.evid_tp_nm.value="";
		formObj.eff_dt.value="";
		formObj.rqst_dt.value="";
		formObj.cxl_desc.value="";
		formObj.act_rqst_amt.value="";
		formObj.ddct_locl_amt.value="";
		formObj.ddct_desc.value="";
		formObj.rvs_csr_flg.value="";
		formObj.rvs_cmb_flg.value="";
		formObj.evid_tp_cd.value="";
		formObj.clz_sts_cd.value="";
	}
	if (aproFlg == "Y") {
		formObj.apro_flg[0].checked=true;
	} else {
		formObj.apro_flg[1].checked=true;
	}
	if (cxlFlg == "Y") {
		formObj.cxl_flg[0].checked=true;
	} else {
		formObj.cxl_flg[1].checked=true;
	}
	if (ddctFlg == "Y") {
		formObj.ddct_flg[0].checked=true;
	} else {
		formObj.ddct_flg[1].checked=true;
	}
}
function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
	var formObj = document.form;
	setSheet2Input(formObj, sheetObj);
	if (sheetObj.RowCount()> 0) {
		sheetObj.SetCellValue(sheetObj.LastRow(), "radio","1");
		sheetObj.SetCellValue(sheetObj.LastRow(), "check","1");
		var auth_cd=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "auth_cd");
		var rcv_err_flg=sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "rcv_err_flg");
		if (auth_cd == "W") {
			if(rcv_err_flg == "E"){
				JooSetBtnClass("C", false);
				JooSetBtnClass("E", true);
			}else{
				JooSetBtnClass("C", true);
				JooSetBtnClass("E", false);
			} 
		} else {
			JooSetBtnClass("C", false);
			JooSetBtnClass("E", false);
		}
		// activating evidence button in case of tax invoice
		
		/*
		if (sheetObj.GetCellValue(sheetObj.LastRow(), prefix + "evid_tp_cd") == "1") {
			JooSetBtnClass("U", true);
		} else {
			JooSetBtnClass("U", false);
		}*/
		JooSetBtnClass("P", true); // activating CSR Detail and Print button in case of existing data
	} else {
		JooSetBtnClass("C", false);
		JooSetBtnClass("U", false);
		JooSetBtnClass("P", false);// deactivating CSR Detail and Print button in case of existing data
		JooSetBtnClass("E", false);
	}
}