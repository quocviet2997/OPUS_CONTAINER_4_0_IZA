/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : FNS_JOO_0017.js
*@FileTitle  : AP CSR Creation
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/17
=========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class FNS_JOO_0017 : business script for FNS_JOO_0017
 */

// common global variable
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
var rdObjects=new Array();
var rdCnt=0;
var queryStr="";
var prefix="sheet1_";
var aryPrefix=new Array("sheet1_", "sheet2_");
var gArCheckVvd = "S";
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
			case "btns_back":
				if (formObj.acct_yrmon.value!=""){
					formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M",-1).substring(0,7);
				}
				acct_yrmon_blur();
				break;
			case "btns_next":
				if (formObj.acct_yrmon.value!=""){
					formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M", 1).substring(0,7);
				}
				acct_yrmon_blur();
				break;
			case "btn_iss":
				var cal=new ComCalendar();
				cal.select(formObj.slp_iss_dt, 'yyyy-MM-dd');
				break;
			case "btn_eff":
				if (formObj.acct_yrmon.value.length == 0){
					ComShowCodeMessage('JOO00033');
					return false;
				}
				if (jo_crr_cd.GetSelectIndex() == -1){
					ComShowCodeMessage('JOO00008');
					return false;
				}
				if (stl_cmb_seq.GetSelectIndex()== -1){
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
                rdOpen( formObj);
				break;
			case "btn_evid":
				if (formObj.acct_yrmon.value.length == 0){
					ComShowCodeMessage('JOO00033');
					return false;
				}
				if (jo_crr_cd.GetSelectIndex() == -1){
					ComShowCodeMessage('JOO00008');
					return false;
				}
				if (stl_cmb_seq.GetSelectIndex()== -1){
					ComShowCodeMessage('JOO00096');
					return false;
				}
				var csrNo=formObj.csr_no.value;
				var editable="Y";
				var vndrSeq=formObj.cust_vndr_seq.value;
				var splyAmt=ComReplaceStr(formObj.stl_locl_amt.value,",","");
				var rowdata="";
				//simple retrieving in case of exsisting CRS number
				if (csrNo.length >= gDefaultCsrLength){
					//can input evidence in case of VAT
					if (evid_tp_cd_combo.GetSelectCode()!= gEvidenceClassTaxE3){
						return false;
					}
					editable="N";
					vndrSeq="zzz";
					splyAmt="0";
				}else{
					if (sheetObjects[0].RowCount()== 0){
						ComShowCodeMessage('JOO00104');
						return false;
					}
					//can input evidence in case of VAT
					if (evid_tp_cd_combo.GetSelectCode()!= gEvidenceClassTaxE3){
						ComShowCodeMessage('JOO00105');
						return false;
					}
					if (!ComIsNumber(splyAmt,'-,.')){
						ComShowCodeMessage('JOO00108');
						return false;
					}
					//displaying in case CRS number not exists and evidence is inputted, 
					var rownum=sheetObjects[1].RowCount();
					if (rownum == 1 && sheetObjects[1].GetRowStatus(rownum) == "I"){
						for (var j=0; j<sheetObjects[1].LastCol();j++)
							rowdata=rowdata + sheetObjects[1].GetCellValue(rownum, j)+"|";
					}
				}
				var param='?csrNo='+csrNo+'&editable='+editable+'&vndrSeq='+vndrSeq+'&splyAmt='+splyAmt+'&rowdata='+rowdata;
				ComOpenPopup("/opuscntr/FNS_JOO_0018.do"+param, 900, 500, "popupFinish", "1,0,1,1,1,1,1,1", true, false, 0, 0, 0, "pop2");
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
 * fns_joo_0018 when evidence input screen is closed with confirm
 * @param rowArray
 * @return
 */
function popupFinish(rowArray){
	var fstArray;
	var scnArray;
	sheetObjects[1].RemoveAll();
	for (var i=0; i < rowArray.length; i++){
		fstArray=rowArray[i];
		var row=sheetObjects[1].DataInsert(-1);
		for(var j=0; j < fstArray.length; j++){
			sheetObjects[1].SetRowStatus(row,"I");
			sheetObjects[1].SetCellValue(row,j,fstArray[j],0);
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
function rdOpen( formObj){
    //var Rdviewer = rdObject ;
    if( !setQueryStr() ){
        return;
    }
    var rdParam='/rp '+queryStr;
    var strPath="apps/opus/fns/joo/jointoperationagreementsettlement/jointoperationconsultation/report/FNS_JOO_0019.mrd";

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
    for(var k=0;k<comboObjects.length;k++){
        initCombo(comboObjects[k],k+1);
    }
    initControl();
//    sheet1_OnSearchEnd(sheet1);
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
	axon_event.addListenerFormat('beforedeactivate', 	'obj_blur'    		, formObj); 	//- handling code when OnBeforeDeactivate(blur) event
    axon_event.addListener  	('beforedeactivate', 	'acct_yrmon_blur'   , 'acct_yrmon');	
    axon_event.addListener		('change', 				'eff_dt_blur'		, 'eff_dt'); 
////    formObj.acct_yrmon.focus();
}
//handling Axon event 2
function obj_blur(){
    ComChkObjValid(ComGetEvent());
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
function eff_dt_blur(){
	var sheetObj=sheetObjects[0];
	var formObj=document.form;
	if (ComTrim(formObj.slp_ofc_cd.value) == ""){
		return
	}
	if (ComIsDate(formObj.eff_dt.value)){
		doActionIBSheet(sheetObj, formObj, IBROWSEARCH);
	}
}
function obj_onclick(){
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
		    with(sheetObj){
	       
			      var HeadTitle="STS|acct_yrmon|jo_crr_cd|stl_cmb_seq|cust_vndr_seq|cust_vndr_cnt_cd|cust_vndr_kor_nm|cust_vndr_eng_nm|cust_vndr_rgst_no|" +
			      "slp_tp_cd|slp_func_cd|slp_ofc_cd|slp_iss_dt|slp_ser_no|csr_desc|locl_curr_cd|stl_locl_amt|evid_tp_cd|" +
			      "csr_tp_cd|eff_dt|rqst_dt|rev_yrmon|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd|rlane_cd|" +
			      "dr_ctr_cd|dr_loc_cd|dr_acct_cd|cr_ctr_cd|cr_loc_cd|cr_acct_cd|slp_desc|vvd_cxl_flg|dr_cr_cd|" +
			      "key_no|issuer_id|re_divr_cd|tot_amount|slp_iss_ofc_cd|csr_offst_no|slp_iss_rgn_cd|slp_iss_inter_co_cd|jo_stl_itm_cd|bsa_qty|bsa_slt_prc|chk_ctr_cd|chk_loc_cd|stl_vvd_seq|stl_seq|fin_jo_stl_itm_cd|apro_step";
			      var headCount=ComCountHeadTitle(HeadTitle);
		
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
		case 2: //t1sheet1 init
		    with(sheetObj){
			      
			      if (location.hostname != "")
			      var HeadTitle="radio|check|vendor|tax_inv_yrmon|ofc_cd|tax_ser_no|Tax구분|매입세액불공제|흑적자구분|고정자산여부|" +
			      "Tax Type|의제매출분|사업자번호|상호|대표자명|업태|종목|주소|발행일자|환율|" +
			      "공급가액|세액|총합계|세금계산서발행구분|품명|status|slp_tp_cd|slp_func_cd|slp_ofc_cd|slp_iss_dt|slp_ser_no";
			      var headCount=ComCountHeadTitle(HeadTitle);
		//	      (headCount, 0, 0, true);
			      var prefix1="sheet2_";
		
			      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
		
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
		
			      var cols = [ {Type:"Radio",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"radio",                  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"CheckBox",  Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"check",                  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"vndr_seq",       KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"tax_inv_yrmon",  KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"ofc_cd",         KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"tax_ser_no",     KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"tax_div_cd",     KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"tax_naid_flg",   KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"tax_pl_cd",      KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"fa_flg",         KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"tax_vat_tp_cd",  KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"tax_nsl_flg",    KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"spl_rgst_no",    KeyField:0,   CalcLogic:"",   Format:"SaupNo" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"co_nm",          KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"ownr_nm",        KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"bzct_nm",        KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"bztp_nm",        KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"spl_addr",       KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"iss_dt",         KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Float",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"jo_xch_rt",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 },
			             {Type:"Float",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"spl_amt",        KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 },
			             {Type:"Float",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"tax_amt",        KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 },
			             {Type:"Float",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"ttl_amt",        KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"doc_evid_tp_cd", KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Left",    ColMerge:1,   SaveName:prefix1+"itm_nm",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Status",    Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"ibflag",         KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"slp_tp_cd",      KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"slp_func_cd",    KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"slp_ofc_cd",     KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"slp_iss_dt",     KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"slp_ser_no",     KeyField:0,   CalcLogic:"",   Format:"" } ];
			       
			      InitColumns(cols);
		
			      SetEditable(1);
			      SetColProperty(prefix1+"tax_inv_yrmon", {Format:"####-##"} );
			      SetColProperty(prefix1+"iss_dt", {Format:"####-##-##"} );
			      SetVisible(false);
	      }


	}
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	if (!validateForm(sheetObj, formObj, sAction))
		return;
	switch (sAction) {
		case IBSEARCH: //retrieve
			formObj.f_cmd.value=SEARCH;
// 			sheetObj.DoSearch("FNS_JOO_0017GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix) );		
 			// UI개선(201408 민정호)
 	        var sXml=sheetObj.GetSearchData("FNS_JOO_0017GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
 	        gArCheckVvd=ComGetEtcData(sXml, "check_vvd");
 	        sheetObj.LoadSearchData(sXml,{Sync:1} ); 		
 	        
			break;
		case IBROWSEARCH: //retrieving whether EFF_DT Close (EFF_DT ON_BLUR)
			formObj.f_cmd.value=SEARCH01;
 			var sXml=sheetObj.GetSearchData("FNS_JOO_0017GS.do", FormQueryString(formObj));
			var closFlg=ComGetEtcData(sXml, "clos_yn");
			var effDt=ComGetEtcData(sXml, "eff_dt");
			var oldEffDt=formObj.eff_dt.value;
			var tmpOldEffDt = ComReplaceStr(oldEffDt,"-","").substring(0,6);
			var tmpEffDt = JooGetDateFormat(effDt,"ymd");
			if (closFlg=="C"){
				//마감이 되었고 이후의 최초 open된 것이 없다면 closed, and open item not exists ComReplaceStr("2008-01-01", "-", "")
				if (ComTrim(effDt) == ""){
					ComShowCodeMessage("JOO00139", tmpOldEffDt);
					formObj.eff_dt.value="";
					//formObj.eff_dt.focus();
					return;					
				}
				//마감이 되었고 user가 계속가고자 한다면 익월1일자로 setting closed, and user confirmed, setting next month 1 day
				if (ComShowCodeConfirm('JOO00107',oldEffDt, tmpEffDt)){
					formObj.eff_dt.value=tmpEffDt;
				}else{
					formObj.eff_dt.value="";
					//formObj.eff_dt.focus();
				}
			//해당월도 마감전이고 이전월도 마감전이라면  before closing month, and before closing previous month
			}else if (closFlg=="X"){
				//Two or more un-closed month exist ! Do you want ignore it 
				//if (!ComShowCodeConfirm("JOO00140")){
				//	formObj.eff_dt.value="";
				//formObj.eff_dt.focus();
				//}
			//데이터가 아예 존재하지 않는 경우 in case of not existing data
			}else if (closFlg=="E"){
				ComShowCodeMessage("JOO00125", tmpOldEffDt);
				formObj.eff_dt.value="";
				//formObj.eff_dt.focus();
			}
			break;
		case IBSAVE: //save
			UF_setInputToSheet();
			if (!ComShowCodeConfirm("JOO00046")){
				return false;
			}
			formObj.f_cmd.value=MULTI;
			var SaveStr=ComGetSaveString(sheetObjects);
			sheetObj.SetWaitImageVisible(0);
			ComOpenWait(true);
 			var sXml=sheetObj.GetSaveData("FNS_JOO_0017GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix));
			//sheetObj.LoadSearchXml(sXml);
			ComOpenWait(false);
			var csrNo=ComGetEtcData(sXml,"csr_no");
			if (csrNo == null || csrNo == undefined){
				formObj.csr_no.value="";
				ComShowMessage("Fail to create AP CSR");
			}else if (csrNo.length >= gDefaultCsrLength){
				formObj.csr_no.value=csrNo;
				ComShowMessage("Sucess to create AP CSR ["+csrNo+"]");
			}
			break;
	}
}
/**
 * setting Combo basic info 
 * param : comboObj, comboNo
 * initializing sheet 
 */ 
//function initCombo(comboObj, comboNo) {
//    var formObj=document.form
//    switch(comboObj.options.id) {  
//    	//Carrier Code
//    	case 1: 
//           with (comboObj) { 
//				SetMultiSelect(0);
//				SetUseAutoComplete(1);
//				SetColAlign(0, "left");
//				SetColWidth(0, "30");
// 				SetDropHeight(160);
// 				SetMaxLength(3);
// 		    }
//            var comboItems=gCrrCombo.split("|");
//            addComboItem(comboObj, comboItems);           	
// 			break; 
// 		//Combined No, CSR No
//    	case 2: 
//            with (comboObj) { 
// 				SetMultiSelect(0);
// 				SetUseAutoComplete(0);
// 				SetColAlign(0, "left");
// 				SetColAlign(1, "left");
// 				SetColWidth(0, "30");
// 				SetColWidth(1, "150");
//  				SetDropHeight(160);
//  		    }
//  			break;
//  		//Evidence Class : Tax, CI, ETC
//    	case 3: 
//            with (comboObj) { 
// 				SetMultiSelect(0);
// 				SetUseAutoComplete(1);
// 				SetColAlign(0, "left");
// 				SetColWidth(0, "50");
//  				SetDropHeight(160);
//  		    }
//			comboObj.RemoveAll();
//			var codeItems=gEvidTpCode.split("|");
//			var nameItems=gEvidTpName.split("|");
//			for (var i=0 ; i < codeItems.length ; i++) {
//				comboObj.InsertItem(i, nameItems[i], codeItems[i]);
//			}   	
//			break;
//		//Evidence Type : STANDARD, CREDIT
//    	case 4: 
//            with (comboObj) { 
// 				SetMultiSelect(0);
// 				SetUseAutoComplete(1);
// 				SetColAlign(0, "left");
// 				SetColWidth(0, "50");
//  				SetDropHeight(160);
//  		    }
//			comboObj.RemoveAll();
//			var codeItems=gCsrTpCode.split("|");
//			var nameItems=gCsrTpName.split("|");
//			for (var i=0 ; i < codeItems.length ; i++) {
//				comboObj.InsertItem(i, nameItems[i], codeItems[i]);
//			}   	
//			break;
// 	} 
//}
function initCombo(comboObj, comboNo) {
    var formObj=document.form
    switch(comboObj.options.id) {  
    	//Carrier Code
    	case 'jo_crr_cd': 
           with (comboObj) { 
				SetMultiSelect(0);
				SetUseAutoComplete(1);
				SetColAlign(0, "left");
//UI성능개선(민정호,201407)				
//				SetColWidth(0, "30");
 				SetDropHeight(160);
 				SetMaxLength(3);
 				ValidChar(2,1);    // Uppercase 				
 		    }
            var comboItems=gCrrCombo.split("|");
            addComboItem(comboObj, comboItems);           	
 			break; 
 		//Combined No, CSR No
    	case 'stl_cmb_seq': 
            with (comboObj) { 
 				SetMultiSelect(0);
 				SetUseAutoComplete(1);
 				SetColAlign(0, "left");
 				SetColAlign(1, "left");
//UI성능개선(민정호,201407) 				
				SetColWidth(0, "30");
 				SetColWidth(1, "150");
  				SetDropHeight(160);
  				SetColWidth(150);
 				ValidChar(2,1);    // Uppercase  				
  		    }
  			break;
  		//Evidence Class : Tax, CI, ETC
    	case 'evid_tp_cd_combo': 
            with (comboObj) { 
 				SetMultiSelect(0);
 				SetUseAutoComplete(1);
 				SetColAlign(0, "left");
 				SetColWidth(0, "124");
  				SetDropHeight(100);
 				ValidChar(2,1);    // Uppercase  				
  		    }
			comboObj.RemoveAll();
			var codeItems=gEvidTpCode.split("|");
			var nameItems=gEvidTpName.split("|");
			for (var i=0 ; i < codeItems.length ; i++) {
				comboObj.InsertItem(i, nameItems[i], codeItems[i]);
			}   
			//NYK Modify 2014.11.07
			comboObj.SetSelectCode(gEvidenceClassTaxF0, 0);
			comboObj.SetEnable(false);
			formObj.evid_tp_cd.value = comboObj.GetSelectCode();
			formObj.evid_tp_cd_text.value = comboObj.GetText(parseInt(comboObj.GetSelectIndex()), 0);
			break;
		//Evidence Type : STANDARD, CREDIT
    	case 'csr_tp_cd': 
            with (comboObj) { 
 				SetMultiSelect(0);
 				SetUseAutoComplete(1);
 				SetColAlign(0, "left");
 				SetColWidth(0, "124");
  				SetDropHeight(100);
 				ValidChar(2,1);    // Uppercase  				
  		    }
			comboObj.RemoveAll();
			var codeItems=gCsrTpCode.split("|");
			var nameItems=gCsrTpName.split("|");
			for (var i=0 ; i < codeItems.length ; i++) {
				comboObj.InsertItem(i, nameItems[i], codeItems[i]);
			}   	
			break;
 	} 
}
// retrieving Lane SVC Type
function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboKey) {
    sheetObj.ShowDebugMsg(false);
    switch(sAction) {
       case IBSEARCH: //TRADE
			//if(validateForm(sheetObj,formObj,sAction))
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
				for(var i=0; i < codeList.length; i++){
					comboObjects[1].InsertItem(i, codeList[i]+"|"+nameList[i], codeList[i]);
				}
//				//formObj.stl_cmb_seq.focus();
			}
	        break;
    }
}
function UF_resetSheets(){
	sheetObjects[0].RemoveAll();
	sheetObjects[1].RemoveAll();
}
function jo_crr_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {//CHECK OLD CODE: OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){
	var formObj=document.form;
	comboObjects[1].SetSelectIndex(-1,false);
	comboObjects[1].RemoveAll();
	formObj.csr_no.value="";
	UF_resetBody();
	UF_resetSheets();
	
	stl_cmb_seq_OnFocus(comboObjects[1]);
}
function stl_cmb_seq_OnFocus(comboObj){
	var formObj=document.form;
	if (comboObjects[0].GetSelectCode().length < 3){
		ComShowCodeMessage("JOO00008");
		return;
	}
	if (comboObj.GetItemCount() == 0){
		comboObj.SetEnable(0);
		doActionIBCombo(sheetObjects[0], formObj, IBSEARCH, comboObj, "stl_cmb_seq");
		comboObj.SetEnable(1);
	}
}
function stl_cmb_seq_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {//CHECK OLD CODE: OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){
	UF_resetSheets();
	var form=document.form;
	form.csr_no.value="";
	if (comboObj.GetSelectIndex()!= -1 && form.acct_yrmon.value.length > 0 && jo_crr_cd.GetSelectCode().length == 3 && newCode != ""){
		doActionIBSheet(sheetObjects[0], form, IBSEARCH);
		
	}
	if (newCode == undefined)
		stl_cmb_seq.value = oldText;
}
function evid_tp_cd_combo_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {//CHECK OLD CODE: OnChange(comboObj, idx_cd, text){	
	if (newCode == "1"){ //<ETC KEY='evidTpCode'><![CDATA[1|4|5]]></ETC> <ETC KEY='evidTpName'><![CDATA[TAX|CI|ETC]]></ETC>
//		docObj.className="btn_normal";
		ComBtnEnable( "btn_evid" );
	}else{
		ComBtnDisable("btn_evid");
	}
	document.form.evid_tp_cd_text.value = evid_tp_cd_combo.GetText(parseInt(evid_tp_cd_combo.GetSelectIndex()), 0);
	document.form.evid_tp_cd_combo_text.value = evid_tp_cd_combo.GetText(parseInt(evid_tp_cd_combo.GetSelectIndex()), 0);
}


function stl_cmb_seq_OnBlur(comboObj) {
	stl_cmb_seq_text.value = comboObj.GetSelectCode();
}


/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	switch (sAction) {
		case IBSEARCH: //retrieve
			if (formObj.acct_yrmon.value.length == 0){
				ComShowCodeMessage('JOO00033');
//				formObj.acct_yrmon.focus();
				return false;
			}
			if (jo_crr_cd.GetSelectIndex() == -1){
				ComShowCodeMessage('JOO00008');
				return false;
			}
			if (stl_cmb_seq.GetSelectIndex()== -1){
				ComShowCodeMessage('JOO00096');
				return false;
			}
			break;
		case IBSAVE:   //save
			if (formObj.acct_yrmon.value.length == 0){
				ComShowCodeMessage('JOO00033');
//				formObj.acct_yrmon.focus();
				return false;
			}
			if (jo_crr_cd.GetSelectIndex()== -1){
				ComShowCodeMessage('JOO00008');
				return false;
			}
			if (stl_cmb_seq.GetSelectIndex()== -1){
				ComShowCodeMessage('JOO00096');
				return false;
			}
			//can't create in case of existing CRS number
			if (ComTrim(formObj.csr_no.value).length >= gDefaultCsrLength){
				ComShowCodeMessage('JOO00100');
				return false;
			}
 			if (sheetObjects[0].DataRows < 1){
				ComShowCodeMessage('JOO00036');
				return false;
			}
			if (formObj.cust_vndr_seq.value.length == 0){
				ComShowCodeMessage('JOO00036');
				return false;
			}
			if (formObj.csr_desc.value.length == 0){
				ComShowCodeMessage('JOO00097');
//				formObj.csr_desc.focus();
				return false;
			}
			/*if (evid_tp_cd_combo.GetSelectIndex()== -1){
				ComShowCodeMessage('JOO00098');
				return false;
			}*/
			if (csr_tp_cd.GetSelectIndex()== -1){
				ComShowCodeMessage('JOO00099');
				return false;
			}
			if (formObj.eff_dt.value == ""){
				ComShowCodeMessage('JOO00101');
//				formObj.eff_dt.focus();
				return false;
			}
			if (formObj.rqst_dt.value == ""){
				ComShowCodeMessage('JOO00102');
//				formObj.rqst_dt.focus();
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
			for (var inx=sheetObj.HeaderRows(); inx <= sheetObj.LastRow(); inx++){
				revYrmon=sheetObj.GetCellValue(inx, prefix+"vvd_vxl_flg");
				if (revYrmon == "Y"){
					vvd=sheetObj.GetCellValue(inx, prefix+"vsl_cd");
					vvd += sheetObj.GetCellValue(inx, prefix+"skd_voy_no");
					vvd += sheetObj.GetCellValue(inx, prefix+"skd_dir_cd");
					vvd += sheetObj.GetCellValue(inx, prefix+"rev_dir_cd");
					canceledVVD+=vvd+"\n";
				}
			}
			if (canceledVVD != ""){
				if (!ComShowCodeConfirm("JOO00103", canceledVVD)){
					return false;
				}
			}
			//must input evidence when evidence class is VAT
			//NYK Modify 2014.11.07
			/*
			var evidTpCd=evid_tp_cd_combo.GetSelectCode();
			if (evidTpCd == "1"){
				if (sheetObjects[1].RowCount()== 0){
					ComShowCodeMessage('JOO00106');
					return false;
				}
			}*/
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
function UF_setSheetToInput(){
	var form=document.form;
	var sheet1=sheetObjects[0];
	var row=sheet1.HeaderRows();
	form.cust_vndr_seq.value	= sheet1.GetCellValue(row, prefix+"cust_vndr_seq")    ;
	form.cust_vndr_cnt_cd.value	= sheet1.GetCellValue(row, prefix+"cust_vndr_cnt_cd") ;
	form.cust_vndr_kor_nm.value	= sheet1.GetCellValue(row, prefix+"cust_vndr_kor_nm") ;
	form.cust_vndr_eng_nm.value	= sheet1.GetCellValue(row, prefix+"cust_vndr_eng_nm") ;
	form.cust_vndr_rgst_no.value= sheet1.GetCellValue(row, prefix+"cust_vndr_rgst_no");
	form.locl_curr_cd.value		= sheet1.GetCellValue(row, prefix+"locl_curr_cd")     ;
    form.stl_locl_amt.value		= sheet1.GetSumText  (0  , prefix+"stl_locl_amt")     ;
	//form.evid_tp_cd.Code         = sheet1.CellValue(row, prefix+"evid_tp_cd")       ;
    form.slp_ofc_cd.value		= sheet1.GetCellValue(row, prefix+"slp_ofc_cd")       ;
	//form.csr_tp_cd.Code          = sheet1.CellValue(row, prefix+"csr_tp_cd")        ;
	//form.eff_dt.value            = sheet1.CellValue(row, prefix+"eff_dt")           ;
	//form.rqst_dt.value           = sheet1.CellValue(row, prefix+"rqst_dt")          ;
    //orm.slp_iss_dt.focus();
}
/**
 * setting sheet in input box info
 * @return
 */
function UF_setInputToSheet(){
	//UI개선(201408 민정호)	
	var form=document.form;
	var sheet1=sheetObjects[0];
	var sheet2=sheetObjects[1];
	for ( var row=sheet1.HeaderRows(); row <= sheet1.LastRow(); row++) {
		sheet1.SetCellValue(row, prefix + "slp_tp_cd"  ,form.slp_tp_cd.value);
		sheet1.SetCellValue(row, prefix + "slp_func_cd",form.slp_func_cd.value);
		sheet1.SetCellValue(row, prefix + "slp_iss_ofc_cd" ,form.slp_iss_ofc_cd.value);
		sheet1.SetCellValue(row, prefix + "slp_iss_dt" ,ComReplaceStr(form.slp_iss_dt.value, "-", ""));
		sheet1.SetCellValue(row, prefix + "issuer_id"  ,form.issuer_id.value);
		sheet1.SetCellValue(row, prefix + "csr_desc"   ,form.csr_desc.value);
		sheet1.SetCellValue(row, prefix + "evid_tp_cd" ,form.evid_tp_cd.value);
		//sheet1.SetCellValue(row, prefix + "evid_tp_cd" ,evid_tp_cd_combo.GetSelectCode());
		sheet1.SetCellValue(row, prefix + "csr_tp_cd"  ,csr_tp_cd.GetSelectCode());
		sheet1.SetCellValue(row, prefix + "re_divr_cd" ,form.re_divr_cd.value);
		//setting EFF.DT in case of uncanceled VVD
		//setting EFF.DT - 1 in case of canceled VVD
		//UI개선(201408 민정호)
		if (sheet1.GetCellValue(row, prefix + "vvd_cxl_flg") == "N"){
			sheet1.SetCellValue(row, prefix + "eff_dt"     ,ComReplaceStr(form.eff_dt.value, "-", ""));
		}
		sheet1.SetCellValue(row, prefix + "rqst_dt"    ,ComReplaceStr(form.rqst_dt.value, "-", ""));
		sheet1.SetCellValue(row, prefix + "tot_amount" ,ComReplaceStr(form.stl_locl_amt.value, ",", ""));
		//UI개선(201408 민정호)
		sheet1.SetCellValue(row, prefix + "apro_step" ,form.apro_step.value,0);		
//		sheet1.SetCellValue(row, prefix + "apro_step"  ,"");
	}
	for ( var row=sheet2.HeaderRows(); row <= sheet2.LastRow(); row++) {
		sheet2.SetCellValue(row, aryPrefix[1] + "slp_tp_cd"  ,form.slp_tp_cd.value);
		sheet2.SetCellValue(row, aryPrefix[1] + "slp_func_cd",form.slp_func_cd.value);
		sheet2.SetCellValue(row, aryPrefix[1] + "slp_ofc_cd" ,form.slp_ofc_cd.value);
		sheet2.SetCellValue(row, aryPrefix[1] + "slp_iss_dt" ,ComReplaceStr(form.slp_iss_dt.value, "-", ""));
	}
}
/**
 * reset
 * 
 * @return
 */
function UF_resetBody(){
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
	evid_tp_cd_combo.SetSelectIndex(0,false); //NYK Modify 2014.11.07
	form.evid_tp_cd.value = evid_tp_cd_combo.GetSelectCode();
	form.evid_tp_cd_text.value = evid_tp_cd_combo.GetText(parseInt(evid_tp_cd_combo.GetSelectIndex()), 0);
	//evid_tp_cd.SetSelectIndex(-1,false);
	csr_tp_cd.SetSelectIndex(-1,false);
	form.eff_dt.value="";
	form.rqst_dt.value="";
}
function UF_resetCondition(){
	var form=document.form;
	form.acct_yrmon.value=gYYYYMM;
	comboObjects[0].SetSelectIndex(-1,false);
	comboObjects[1].SetSelectIndex(-1,false);
	comboObjects[1].RemoveAll();
	form.csr_no.value="";
}
/**
 * after Search sheet1
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
		//2015.04.30 Modify Checked Validation Delete.
		/*for (var i=sheetObj.HeaderRows(); i <= sheetObj.LastRow(); i++){
			//diplaying error msg in case of not existing data in Financial Matrix
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
			ComShowCodeMessage("JOO00162", notExistJoStlItmCdList);
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
		var totalAmt=Number(sheetObj.GetSumValue(0, prefix+"stl_locl_amt"));
		//setting C in case total amount is negative, setting S in case total amount is positive
		if (totalAmt < 0){
			formObj.slp_func_cd.value="C";
			csr_tp_cd.SetSelectCode("CREDIT");
		}else{
			formObj.slp_func_cd.value="S";
			csr_tp_cd.SetSelectCode("STANDARD");
		}
		csr_tp_cd.SetEnable(0);
		var custVndrCntCd=sheetObj.GetCellValue(row, prefix+"cust_vndr_cnt_cd");
		var custVndrRgstNo=sheetObj.GetCellValue(row, prefix+"cust_vndr_rgst_no");
		/*evid_tp_cd_combo.SetEnable(1);
		if (custVndrCntCd == "KR" && custVndrRgstNo != ""){
			evid_tp_cd_combo.SetSelectCode("1");//VAT
		}else{
			evid_tp_cd_combo.SetSelectCode("5");//Other
		}
		evid_tp_cd_combo.SetEnable(0);*/
		//UI개선(201408 민정호);
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