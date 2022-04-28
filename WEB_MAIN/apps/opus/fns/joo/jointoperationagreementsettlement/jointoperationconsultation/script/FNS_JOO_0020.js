/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : FNS_JOO_0020.js
 *@FileTitle: AR CSR Creation
 *@author   : CLT
 *@version  : 1.0
 *@since    : 2014/06/18
 =========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class FNS_JOO_0020 : business script for FNS_JOO_0020
 */
//common global variable
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
var rdObjects=new Array();
var rdCnt=0;
var queryStr="";
var prefix="sheet1_";
var gArCheckVvd = "S";
//Event handler processing by button click event */
document.onclick=processButtonClick;
//Event handler processing by button name */
function processButtonClick() {
	/***** setting sheet object *****/
	var sheetObject1=sheetObjects[0];
	/*******************************************************/
	var formObj=document.form;
	try {
		var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
		switch (srcName) {
		case "btns_back":
			if (formObj.acct_yrmon.value != "") {
				formObj.acct_yrmon.value=ComGetDateAdd(
						formObj.acct_yrmon.value + "-01", "M", -1)
						.substring(0, 7);
			}
			acct_yrmon_blur();
			break;
		case "btns_next":
			if (formObj.acct_yrmon.value != "") {
				formObj.acct_yrmon.value=ComGetDateAdd(
						formObj.acct_yrmon.value + "-01", "M", 1).substring(
						0, 7);
			}
			acct_yrmon_blur();
			break;
		case "btn_iss":
			var cal=new ComCalendar();
			cal.select(formObj.slp_iss_dt, 'yyyy-MM-dd');
			break;
		case "btn_eff":
			if (formObj.acct_yrmon.value.length == 0) {
				ComShowCodeMessage('JOO00033');
				return false;
			}
			if (jo_crr_cd.index == -1) {
				ComShowCodeMessage('JOO00008');
				return false;
			}
			if (stl_cmb_seq.GetSelectIndex()== -1) {
				ComShowCodeMessage('JOO00096');
				return false;
			}			
			var cal=new ComCalendar();
			cal.setEndFunction("eff_dt_blur"); 			
			cal.setDisplayType('date');
			cal.select(formObj.eff_dt, 'yyyy-MM-dd');
			break;
		case "btn_rqst":
			var cal=new ComCalendar();
			cal.select(formObj.rqst_dt, 'yyyy-MM-dd');
			break;
		case "btn_retrieve":
			doActionIBSheet(sheetObject1, formObj, IBSEARCH);
			break;
		case "btn_new":
			UF_resetCondition();
			UF_resetBody();
			UF_resetSheets();
			break;
		case "btn_save":
			doActionIBSheet(sheetObject1, formObj, IBSAVE);
			break;
		case "btn_print":
			var csrNo=formObj.csr_no.value;
			if (csrNo.length < gDefaultCsrLength){
				ComShowCodeMessage("JOO00074");
				return;
			}
            rdOpen(formObj);
			break;
		case "apro_step_btn" :
    	    var v_ofc_cd=formObj.slp_ofc_cd.value;
    	    var v_sub_sys_cd="JOO";
            var param="?mode=save&ofc_cd="+v_ofc_cd+"&sub_sys_cd="+v_sub_sys_cd+"&classId=COM_ENS_0T1"+"&target_obj_nm=apro_step";
				ComOpenPopup('/opuscntr/COM_ENS_0T1.do'+param, 835, 540, '', 'none', true);
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
function initRdConfig(rdObject){
    var Rdviewer=rdObject ;
    Rdviewer.AutoAdjust=true;
    Rdviewer.ViewShowMode(0);
    Rdviewer.SetBackgroundColor(128,128,128);
    Rdviewer.SetPageLineColor(128,128,128);
}
function rdOpen( formObj){
    //var Rdviewer = rdObject ;
    if( !setQueryStr() ){
        return;
    }
    var rdParam='/rp '+queryStr;
    var strPath="apps/opus/fns/joo/jointoperationagreementsettlement/jointoperationconsultation/report/FNS_JOO_0021.mrd";
    //if SINWA
    //if (gOfcCd == "SINWA" || gOfcCd == "SINWSG"){
    //	strPath="apps/opus/fns/joo/jointoperationagreementsettlement/jointoperationconsultation/report/FNS_JOO_1021.mrd";
    //}
    formObj.com_mrdPath.value=strPath;
    formObj.com_mrdArguments.value=rdParam;
    ComOpenRDPopup();
}
function setQueryStr(){
    var formObj=document.form;
    queryStr="";
    queryStr += " ["+formObj.csr_no.value+"]";
    return true;
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
	for ( var k=0; k < comboObjects.length; k++) {
		initCombo(comboObjects[k], k + 1);
	}
	initControl();
}
/**
 * loading HTML Control event <br>
 * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
 * @param {ibsheet} sheetObj    IBSheet Object
 * @param {int}     sheetNo     sequence number in sheetObjects array
 **/
function initControl() {
	//** Date Separator **/
	DATE_SEPARATOR="-";
	var formObj=document.form;
	//handling Axon event. event catch
	axon_event.addListenerFormat('beforedeactivate', 'obj_blur', formObj); //- handling code when OnBeforeDeactivate(blur) event
//	axon_event.addListenerFormat('beforeactivate', 'obj_focus', formObj); //- handling code when OnBeforeActivate event in case of existing dataformat property
//	axon_event.addListenerFormat('keypress', 'obj_keypress', formObj); //- handling code when onkeypress event in case of existing dataformat property
//	axon_event.addListenerFormat('keyup', 'form_keyup', formObj);
//	axon_event.addListener('keypress', 'acct_yrmon_keypress', 'acct_yrmon');
//	axon_event.addListener('keypress', 'slp_iss_dt_keypress', 'slp_iss_dt');
//	axon_event.addListener('keypress', 'eff_dt_keypress', 'eff_dt');
//	axon_event.addListener('keypress', 'rqst_dt_keypress', 'rqst_dt');
//  axon_event.addListener('beforedeactivate', 'eff_dt_blur', 'eff_dt');
	axon_event.addListener('beforedeactivate', 'acct_yrmon_blur', 'acct_yrmon');
	axon_event.addListener('change', 'eff_dt_blur', 'eff_dt');
//	formObj.acct_yrmon.focus();
}
//handling Axon event 2
function obj_blur() {
	ComChkObjValid(event.srcElement);
}
function obj_focus() {
	ComClearSeparator(event.srcElement);
}
function obj_keypress() {
	var src=ComGetEvent("name")
}
function form_keyup() {
	ComKeyEnter('lengthnextfocus');
}
function acct_yrmon_keypress() {
	ComKeyOnlyNumber(this, '');
}
function acct_yrmon_blur(){
	var formObj=document.form;
	jo_crr_cd.SetSelectIndex(-1,false);
	stl_cmb_seq.SetSelectIndex(-1,false);
	stl_cmb_seq.RemoveAll();
	formObj.csr_no.value="";
	UF_resetBody();
	UF_resetSheets();
}
function slp_iss_dt_keypress() {
	ComKeyOnlyNumber(this, '');
}
function eff_dt_keypress() {
	ComKeyOnlyNumber(this, '');
}
function rqst_dt_keypress() {
	ComKeyOnlyNumber(this, '');
}
function eff_dt_blur() {
	var sheetObj=sheetObjects[0];
	var formObj=document.form;
	if (ComTrim(formObj.slp_ofc_cd.value) == ""){
		return
	}
	if (ComIsDate(formObj.eff_dt.value)) {
		doActionIBSheet(sheetObj, formObj, IBROWSEARCH);
	}
}
function obj_onclick() {
	var src=ComGetEvent("name")
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
	        var HeadTitle="STS|acct_yrmon|jo_crr_cd|stl_cmb_seq|cust_vndr_seq|cust_vndr_cnt_cd|cust_vndr_kor_nm|cust_vndr_eng_nm|cust_vndr_rgst_no|"
	        + "slp_tp_cd|slp_func_cd|slp_ofc_cd|slp_iss_dt|slp_ser_no|csr_desc|locl_curr_cd|stl_locl_amt|evid_tp_cd|"
	        + "csr_tp_cd|eff_dt|rqst_dt|rev_yrmon|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd|rlane_cd|"
	        + "dr_ctr_cd|dr_loc_cd|dr_acct_cd|cr_ctr_cd|cr_loc_cd|cr_acct_cd|slp_desc|vvd_cxl_flg|dr_cr_cd|"
	        + "key_no|issuer_id|re_divr_cd|tot_amount|slp_iss_ofc_cd|csr_offst_no|slp_iss_rgn_cd|slp_iss_inter_co_cd|jo_stl_itm_cd|bsa_qty|bsa_slt_prc|chk_ctr_cd|chk_loc_cd|stl_vvd_seq|stl_seq|fin_jo_stl_itm_cd|apro_step";
	        var headCount=ComCountHeadTitle(HeadTitle);
	//        (headCount, 0, 0, true);
	
	        SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
	
	        var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	        var headers = [ { Text:HeadTitle, Align:"Center"} ];
	        InitHeaders(headers, info);
	
	        var cols = [ {Type:"Status",    Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"ibflag",              KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"acct_yrmon",          KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"jo_crr_cd",           KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"stl_cmb_seq",         KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"cust_vndr_seq",       KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"cust_vndr_cnt_cd",    KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"cust_vndr_kor_nm",    KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"cust_vndr_eng_nm",    KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"cust_vndr_rgst_no",   KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"slp_tp_cd",           KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"slp_func_cd",         KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"slp_ofc_cd",          KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"slp_iss_dt",          KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"slp_ser_no",          KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"csr_desc",            KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"locl_curr_cd",        KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"AutoSum",   Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"stl_locl_amt",        KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"evid_tp_cd",          KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"csr_tp_cd",           KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"eff_dt",              KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"rqst_dt",             KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"rev_yrmon",           KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_cd",              KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"skd_voy_no",          KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"skd_dir_cd",          KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"rev_dir_cd",          KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"rlane_cd",            KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"dr_ctr_cd",           KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"dr_loc_cd",           KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"dr_acct_cd",          KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"cr_ctr_cd",           KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"cr_loc_cd",           KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"cr_acct_cd",          KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"slp_desc",            KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"vvd_cxl_flg",         KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"dr_cr_cd",            KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"key_no",              KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"issuer_id",           KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"re_divr_cd",          KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"tot_amount",          KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"slp_iss_ofc_cd",      KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"slp_iss_rgn_cd",      KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"slp_iss_inter_co_cd", KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"csr_offst_no",        KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"jo_stl_itm_cd",       KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"bsa_qty",             KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"bsa_slt_prc",         KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"chk_ctr_cd",          KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"chk_loc_cd",          KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"stl_vvd_seq",         KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"stl_seq",             KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"fin_jo_stl_itm_cd",   KeyField:0,   CalcLogic:"",   Format:"" },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"apro_step",           KeyField:0,   CalcLogic:"",   Format:"" } ];
	         
	        InitColumns(cols);
	        SetEditable(1);
	        SetVisible(false);
		}
		break;
	}
}
//handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	if (!validateForm(sheetObj, formObj, sAction))
		return;
	switch (sAction) {
	case IBSEARCH: //retrieve
		formObj.f_cmd.value=SEARCH;
//		sheetObj.DoSearch("FNS_JOO_0020GS.do", FormQueryString(formObj )+ ComGetPrefixParam(prefix));
		// UI개선(201408 민정호)
        var sXml=sheetObj.GetSearchData("FNS_JOO_0020GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_"));
        gArCheckVvd=ComGetEtcData(sXml, "check_vvd");
        sheetObj.LoadSearchData(sXml,{Sync:1} );
				
		break;
	case IBROWSEARCH: //retrieving whether EFF_DT Close (EFF_DT ON_BLUR)
		formObj.f_cmd.value=SEARCH01;
 		var sXml=sheetObj.GetSearchData("FNS_JOO_0020GS.do",FormQueryString(formObj));
		var closFlg=ComGetEtcData(sXml, "clos_yn");
		var effDt=ComGetEtcData(sXml, "eff_dt");
		var oldEffDt=formObj.eff_dt.value;
		var tmpOldEffDt = ComReplaceStr(oldEffDt,"-","").substring(0,6);
		var tmpEffDt = JooGetDateFormat(effDt,"ymd");
		if (closFlg=="C"){
			//마감이 되었고 이후의 최초 open된 것이 없다면 closed, and open item not exists
			if (ComTrim(effDt) == ""){
				ComShowCodeMessage("JOO00139", tmpOldEffDt);
				formObj.eff_dt.value="";
				//formObj.eff_dt.focus();
				return;					
			}
			//마감이 되었고 user가 계속가고자 한다면 익월1일자로  closed, and user confirmed, setting next month 1 day
			if (ComShowCodeConfirm('JOO00107',oldEffDt, tmpEffDt)){
				formObj.eff_dt.value=tmpEffDt;
			}else{
				formObj.eff_dt.value="";
				//formObj.eff_dt.focus();
			}
		//해당월도 마감전이고 이전월도 마감전이라면 before closing month, and before closing previous month 
		}else if (closFlg=="X"){
			//if (!ComShowCodeConfirm("JOO00140")){
			//	formObj.eff_dt.value="";
			//	formObj.eff_dt.focus();
			//}
		//데이터가 아예 존재하지 않는 경우 in case of not existing data
		}else if (closFlg=="E"){
			ComShowCodeMessage("JOO00125", tmpOldEffDt);
			formObj.eff_dt.value="";
		}
		break;
	case IBSAVE: //save
		UF_setInputToSheet();
		if (!ComShowCodeConfirm("JOO00046")) {
			return false;
		}
		formObj.f_cmd.value=MULTI;
		var SaveStr=ComGetSaveString(sheetObj);
		sheetObj.SetWaitImageVisible(0);
		ComOpenWait(true);
		var sXml=sheetObj.GetSaveData("FNS_JOO_0020GS.do",
				SaveStr + "&"+ FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
		ComOpenWait(false);
		var csrNo=ComGetEtcData(sXml, "csr_no");
		if (csrNo == null || csrNo == undefined){
			formObj.csr_no.value="";
			ComShowMessage("Fail to create AR CSR");
		}else if (csrNo.length >= gDefaultCsrLength){
			formObj.csr_no.value=csrNo;
			ComShowMessage("Sucess to create AR CSR ["+csrNo+"]");
		}
		break;
	}
}
/**
 * setting Combo basic info 
 * param : comboObj, comboNo
 * initializing sheet 
 */
function initCombo(comboObj, comboNo) {
	var formObj=document.form
	switch (comboNo) {
	case 1:
		with (comboObj) {
			SetMultiSelect(0);
			SetUseAutoComplete(1);
			SetColAlign(0, "left");
			SetDropHeight(160);
 			ValidChar(2,1);//only upper case
			SetMaxLength(3);
		}
		var comboItems=gCrrCombo.split("|");
		addComboItem(comboObj, comboItems);
		break;
	case 2:
		with (comboObj) {
			SetMultiSelect(0);
			SetUseAutoComplete(0);
			SetColAlign(0, "left");
			SetColAlign(1, "left");			
			SetColWidth(0, "30");
			SetColWidth(1, "150");
			SetDropHeight(160);
 			ValidChar(2,1);//only upper case
		}
		break;
	}
}
//retrieving Lane SVC Type
function doActionIBCombo(sheetObj, formObj, sAction, sComboObj, sComboKey) {
	sheetObj.ShowDebugMsg(false);
	switch (sAction) {
	case IBSEARCH: //TRADE
		//if(validateForm(sheetObj,formObj,sAction))
		// UI개선(201408 민정호)	
		if (sComboObj.options.id == "stl_cmb_seq") {
			//initializing combo
			sComboObj.RemoveAll();
			formObj.f_cmd.value=SEARCHLIST18;
			formObj.code.value=formObj.re_divr_cd.value;
			formObj.super_cd1.value=jo_crr_cd.GetSelectCode();
			formObj.super_cd2.value=formObj.acct_yrmon.value;
 			var sXml=sheetObj.GetSearchData("JOOCommonGS.do", FormQueryString(formObj));
			//Combined No.
			var codeList=ComGetEtcData(sXml, "combined_no").split("|");
			var nameList=ComGetEtcData(sXml, "slip_no").split("|");
			for ( var i=0; i < codeList.length; i++) {
				comboObjects[1].InsertItem(i, codeList[i]+"|"+nameList[i], codeList[i]);
			}
		}
		break;
	}
}
function UF_resetSheets() {
	sheetObjects[0].RemoveAll();
}
function jo_crr_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {//CHECK OLD CODE: OnChange(comboObj, idx_cd, text) {
	var formObj=document.form;
	comboObjects[1].SetSelectIndex(-1,false);
	comboObjects[1].RemoveAll();
	formObj.csr_no.value="";
	UF_resetBody();
	UF_resetSheets();
	
	stl_cmb_seq_OnFocus(comboObjects[1]);
}

function stl_cmb_seq_OnFocus(comboObj) {
	var formObj=document.form;
	if (comboObjects[0].GetSelectCode().length < 3){
		ComShowCodeMessage("JOO00008");
//		jo_crr_cd.focus();
		return;
	}
	if (comboObj.GetItemCount() == 0){
		comboObj.SetEnable(0);
		doActionIBCombo(sheetObjects[0], formObj, IBSEARCH,	comboObj, "stl_cmb_seq");
		comboObj.SetEnable(1);
	}
}
function stl_cmb_seq_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {//CHECK OLD CODE: OnChange(comboObj, idx_cd, text) {
	var formObj=document.form;
	formObj.csr_no.value="";
	UF_resetBody();
	UF_resetSheets();
	if (formObj.acct_yrmon.value.length != 0 && jo_crr_cd.GetSelectCode().length == 3 && newCode != "") {
		doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
	}
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	switch (sAction) {
	case IBSEARCH: //retrieve
		if (formObj.acct_yrmon.value.length == 0) {
			ComShowCodeMessage('JOO00033');
//			formObj.acct_yrmon.focus();
			return false;
		}
		if (jo_crr_cd.index == -1) {
			ComShowCodeMessage('JOO00008');
//			jo_crr_cd.focus();
			return false;
		}
		if (stl_cmb_seq.GetSelectIndex()== -1) {
			ComShowCodeMessage('JOO00096');
//			stl_cmb_seq.focus();
			return false;
		}
		break;
	case IBSAVE: //save
		if (formObj.acct_yrmon.value.length == 0) {
			ComShowCodeMessage('JOO00033');
//			formObj.acct_yrmon.focus();
			return false;
		}
		if (jo_crr_cd.GetSelectIndex()== -1) {
			ComShowCodeMessage('JOO00008');
//			jo_crr_cd.focus();
			return false;
		}
		if (stl_cmb_seq.GetSelectIndex()== -1) {
			ComShowCodeMessage('JOO00096');
//			stl_cmb_seq.focus();
			return false;
		}
		//can't create in case of existing CRS number
		if (ComTrim(formObj.csr_no.value).length >= gDefaultCsrLength){
			ComShowCodeMessage('JOO00100');
			return false;
		}
		
		//not
		
 		if (sheetObjects[0].DataRows < 1) {
			ComShowCodeMessage('JOO00036');
			return false;
		}
		if (formObj.cust_vndr_seq.value.length == 0){
			ComShowCodeMessage('JOO00036');
			return false;
		}
		if (formObj.csr_desc.value.length == 0) {
			ComShowCodeMessage('JOO00097');
//			formObj.csr_desc.focus();
			return false;
		}
		if (formObj.eff_dt.value == "") {
			ComShowCodeMessage('JOO00101');
//			formObj.eff_dt.focus();
			return false;
		}
		if (formObj.rqst_dt.value == "") {
			ComShowCodeMessage('JOO00102');
//			formObj.rqst_dt.focus();
			return false;
		}
		//Effective Date < Due Date
		var eff=Number(ComReplaceStr(formObj.eff_dt.value,"-",""));
		var rqst=Number(ComReplaceStr(formObj.rqst_dt.value,"-",""));
		if (eff > rqst){
			ComShowCodeMessage("JOO00176");
			return false;
		}
		var revYrmon="";
		var canceledVVD="";
		var vvd="";
		for ( var inx=sheetObj.HeaderRows(); inx <= sheetObj.LastRow(); inx++) {
			revYrmon=sheetObj.GetCellValue(inx, prefix + "vvd_vxl_flg");
			if (revYrmon == "Y") {
				vvd=sheetObj.GetCellValue(inx, prefix + "vsl_cd");
				vvd += sheetObj.GetCellValue(inx, prefix + "skd_voy_no");
				vvd += sheetObj.GetCellValue(inx, prefix + "skd_dir_cd");
				vvd += sheetObj.GetCellValue(inx, prefix + "rev_dir_cd");
				canceledVVD += vvd + "\n";
			}
		}
		if (canceledVVD != "") {
			if (!ComShowCodeConfirm("JOO00103", canceledVVD)) {
				return false;
			}
		}
		/* 
		if (ComTrim(formObj.apro_step.value) == ""){
			ComShowCodeMessage("JOO00174");
			return false;
		}
		*/
		break;
	}
	return true;
}
/**
 * displaying sheet info in input box
 * @return
 */
function UF_setSheetToInput() {
	var form=document.form;
	var sheet1=sheetObjects[0];
	var row=sheet1.HeaderRows();
	form.cust_vndr_seq.value		= sheet1.GetCellValue	(row, prefix+ "cust_vndr_seq");
	form.cust_vndr_cnt_cd.value		= sheet1.GetCellValue	(row, prefix+ "cust_vndr_cnt_cd");
	form.cust_vndr_kor_nm.value		= sheet1.GetCellValue	(row, prefix+ "cust_vndr_kor_nm");
	form.cust_vndr_eng_nm.value		= sheet1.GetCellValue	(row, prefix+ "cust_vndr_eng_nm");
	form.cust_vndr_rgst_no.value	= sheet1.GetCellValue	(row, prefix+ "cust_vndr_rgst_no");
	form.locl_curr_cd.value			= sheet1.GetCellValue	(row, prefix+ "locl_curr_cd");
	form.slp_ofc_cd.value			= sheet1.GetCellValue	(row, prefix+ "slp_ofc_cd");
	form.stl_locl_amt.value			= sheet1.GetSumText		(0  , prefix+ "stl_locl_amt");
	
	//form.eff_dt.value            = sheet1.CellValue(row, prefix+"eff_dt")           ;
	//form.rqst_dt.value           = sheet1.CellValue(row, prefix+"rqst_dt")          ;
	//form.slp_iss_dt.focus();
}
/**
 * setting sheet in input box info
 * @return
 */
function UF_setInputToSheet() {
	var form=document.form;
	var sheet1=sheetObjects[0];
	for ( var row=sheet1.HeaderRows(); row <= sheet1.LastRow(); row++) {
		sheet1.SetCellValue(row, prefix + "slp_tp_cd"  ,form.slp_tp_cd.value,0);
		sheet1.SetCellValue(row, prefix + "slp_func_cd",form.slp_func_cd.value,0);
		sheet1.SetCellValue(row, prefix + "slp_iss_ofc_cd",form.slp_iss_ofc_cd.value,0);
		sheet1.SetCellValue(row, prefix + "slp_iss_dt" ,ComReplaceStr(form.slp_iss_dt.value, "-", ""),0);
		sheet1.SetCellValue(row, prefix + "issuer_id"  ,form.issuer_id.value,0);
		sheet1.SetCellValue(row, prefix + "csr_desc"   ,form.csr_desc.value,0);
		sheet1.SetCellValue(row, prefix + "re_divr_cd" ,form.re_divr_cd.value,0);
		//setting EFF.DT in case of uncanceled VVD
		//setting EFF.DT - 1 in case of canceled VVD
		//UI개선(201408 민정호)
		if (sheet1.GetCellValue(row, prefix + "vvd_cxl_flg") == "N") {
			sheet1.SetCellValue(row, prefix + "eff_dt",ComReplaceStr(form.eff_dt.value, "-", ""),0);
		}
		sheet1.SetCellValue(row, prefix + "rqst_dt"   ,ComReplaceStr(form.rqst_dt.value, "-", ""),0);
		sheet1.SetCellValue(row, prefix + "tot_amount",ComReplaceStr(form.stl_locl_amt.value, ",", ""),0);
		sheet1.SetCellValue(row, prefix + "apro_step" ,form.apro_step.value,0);
//		sheet1.CellValue2(row, prefix + "apro_step" ) = "";
	}
}
/**
 * reset
 * 
 * @return
 */
function UF_resetBody() {
	var form=document.form;
	form.cust_vndr_seq.value="";
	form.cust_vndr_cnt_cd.value="";
	form.cust_vndr_kor_nm.value="";
	form.cust_vndr_eng_nm.value="";
	form.cust_vndr_rgst_no.value="";
	form.slp_iss_dt.value=gYYYYMMDD;
	form.csr_desc.value="";
	form.locl_curr_cd.value="";
	form.stl_locl_amt.value="";
	form.eff_dt.value="";
	form.rqst_dt.value="";
}
function UF_resetCondition(){
	var form=document.form;
	form.acct_yrmon.value=gYYYYMM;
	jo_crr_cd.SetSelectIndex(-1,false);
	stl_cmb_seq.RemoveAll();
	form.csr_no.value="";
}
/**
 * after Searching sheet1
 * @param sheetObj
 * @param ErrMsg
 * @return
 */
function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
	var formObj=document.form;
	var row=sheetObj.HeaderRows();
	var rowCnt=sheetObj.RowCount();
	if (rowCnt == 0){
		if(gArCheckVvd == "F"){
			ComShowCodeMessage("JOO00207");
		}else{
			ComShowCodeMessage("JOO00000");
		}
		return;
	}
	//in case slip number is already created, reset with 'Already Settlemented.' msg.
	var slpSerNo=sheetObj.GetCellValue(row, prefix+"slp_ser_no");
	if (slpSerNo == ""){
		var notExistJoStlItmCdList=""; //Item List not existing in Financial Matrix
		var fCtrCdList=""; //Center Code is different
		var mCtrCdList=""; //
		var fLocCdList=""; //Location Code is different
		var mLocCdList="";
		/*for (var i=sheetObj.HeaderRows(); i <= sheetObj.LastRow(); i++){
			//Financial Matrix에 Data가 없으면 Error메시지를 뿌려준다.
			var finJoStlItmCd=sheetObj.GetCellValue(i, prefix+"fin_jo_stl_itm_cd");
			var chkJoStlItmCd=sheetObj.GetCellValue(i, prefix+"jo_stl_itm_cd");
			if (ComTrim(finJoStlItmCd) == ""){
			    if( notExistJoStlItmCdList.indexOf(chkJoStlItmCd) == -1){
			        notExistJoStlItmCdList +=chkJoStlItmCd+",";
			    }
			}
			//displaying error msg in case MDM's center code and Financial Matrix's center code are different.
			var ctrCd=sheetObj.GetCellValue(i, prefix+"dr_ctr_cd");
			var chkCtrCd=sheetObj.GetCellValue(i, prefix+"chk_ctr_cd");
			if (ctrCd != chkCtrCd){
				fCtrCdList += ctrCd+"|";
				mCtrCdList += chkCtrCd+"|";
//				ComShowCodeMessage("JOO00137",chkCtrCd, ctrCd);
//				return;
			}
			//displaying error msg in case MDM's Location code and Financial Matrix's Location code are different.
			var locCd=sheetObj.GetCellValue(i, prefix+"dr_loc_cd");
			var chkLocCd=sheetObj.GetCellValue(i, prefix+"chk_loc_cd");
			if (locCd != chkLocCd){
				fLocCdList += locCd+"|";
				mLocCdList += chkLocCd+"|";
//				ComShowCodeMessage("JOO00138",chkLocCd, locCd);
//				return;
			}
		}
		//diplaying error msg in case of not existing data in Financial Matrix
		if (notExistJoStlItmCdList.length > 1){
			notExistJoStlItmCdList=notExistJoStlItmCdList.substring(0, notExistJoStlItmCdList.length - 1);
			ComShowCodeMessage("JOO00162", notExistJoStlItmCdList );
			return;
		}
		if (fCtrCdList.length > 1){
			ComShowCodeMessage("JOO00163");
			return;
		}
		if (fLocCdList.length > 1){
			ComShowCodeMessage("JOO00164");
			return;
		}*/
		UF_setSheetToInput();
	}else{
		var slpTpCd=sheetObj.GetCellValue(row, prefix+"slp_tp_cd");
		var slpFuncCd=sheetObj.GetCellValue(row, prefix+"slp_func_cd");
		var slpOfcCd=sheetObj.GetCellValue(row, prefix+"slp_ofc_cd");
		var slpIssDt=sheetObj.GetCellValue(row, prefix+"slp_iss_dt");
		formObj.csr_no.value=slpTpCd+slpFuncCd+slpOfcCd+slpIssDt+slpSerNo;
		ComShowCodeMessage("JOO00100");
		UF_resetBody();
		UF_resetSheets();
	}
}

