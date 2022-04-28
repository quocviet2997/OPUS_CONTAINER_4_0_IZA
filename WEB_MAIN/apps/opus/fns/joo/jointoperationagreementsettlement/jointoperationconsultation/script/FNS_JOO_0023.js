/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : fns_joo_0023.js
*@FileTitle  : CSR Approval
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/21
=========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class fns_joo_0023 : business script for fns_joo_0023
 */
// common global variable
var tabObjects=new Array();
var tabCnt=0;
var beforetab=1;
var sheetObjects=new Array();
var sheetCnt=0;
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
		if (srcName == null || srcName == "apro_flg" || srcName == "cxl_flg") {
			return;
		}

		if (!ComIsBtnEnable(srcName)) return;             //버튼 상태를 확인을 합니다.
		
		//return in case class is btn1_1
		if (!JooBtnClickEnable(srcName)) {
			return;
		}
		switch (srcName) {
			case "btn_calendar":
				var cal=new ComCalendar();
				cal.select(formObj.slp_iss_dt, 'yyyy-MM-dd');
				break;
			case "btn_csr":
				var csrNo=formObj.csr_no.value;
				if (csrNo.length < gDefaultCsrLength){
					ComShowCodeMessage("JOO00074");
					return;
				}
				var param='?csrNo='+csrNo;
				//ComOpenPopup("/opuscntr/FNS_JOO_0024.do"+param, 835, 450, "popupFinish", "1,0,1,1,1,1,1,1", false, false, 0, 0, 0, "pop1");
				//ComOpenPopup("/opuscntr/FNS_JOO_0024.do"+param, 835, 450, "popupFinish", "none", false, false, 0, 0, 0, "pop1");
				ComJooCsrDetailPopup(param);
				break;
			case "btn_evd":
				var csrNo=formObj.csr_no.value;
				if (csrNo.length < gDefaultCsrLength){
					ComShowCodeMessage("JOO00074");
					return;
				}
				//AP case. Evidence not exists
				if (csrNo.substring(0,2) != "06"){
					ComShowCodeMessage("JOO00119");
					return;
				}
				//Evidence Type is TAX. Evidence exists.
				if (formObj.evid_tp_cd.value != "1"){
					ComShowCodeMessage("JOO00119");
					return;
				}
				var param='?csrNo='+csrNo+'&editable=N';
				ComOpenPopup("/opuscntr/FNS_JOO_0018.do"+param, 900, 600, "popupFinish", "1,0,1,1,1,1,1,1", false, false, 0, 0, 0, "pop2");
				break;
			case "btn_save":
				doActionIBSheet(sheetObject1, formObj, IBSAVE);
				break;
			case "btn_close":
				ComClosePopup(); 
				break;
			case "btn_apro_step_edit":
				var v_ofc_cd=formObj.ofc_cd.value;
				var v_sub_sys_cd="JOO";
				var param='?mode=save&ofc_cd='+v_ofc_cd+'&csr_no='+formObj.csr_no.value+'&sub_sys_cd='+v_sub_sys_cd+'&classId=COM_ENS_0T1&target_obj_nm=apro_step';
				ComOpenPopup('/opuscntr/COM_ENS_0T1.do' + param, 835, 540, 'afterAproStepEdit', 'none', false);
				break;
			case "btn_apro_step_view":
				var param="?apro_rqst_no="+formObj.apro_rqst_no.value;
				ComOpenPopup('/opuscntr/COM_ENS_0W1.do' + param, 640, 310, '', 'none', false);
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
function popupFinish(rowArray){
	var fstArray;
	var scnArray;
//
//	for (var i=0; i < rowArray.length; i++){
//		fstArray = rowArray[i];
//		
//		for(var j=0; j < fstArray.length; j++){
//		}
//	}
}
function afterAproStepEdit(){
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
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
		case 1: //t1sheet1 init
			with (sheetObj) {
		        var HeadTitle="radio|checkbox|ibflag|slp_tp_cd|slp_func_cd|slp_ofc_cd|slp_iss_dt|slp_ser_no|vndr_seq|cust_cnt_cd|cust_seq|csr_desc|csr_locl_curr_cd|csr_locl_amt|csr_usd_amt|eff_dt|evid_tp_cd|apro_flg|apro_dt|cxl_flg|cxl_desc|csr_offst_no|ddct_flg|ddct_locl_amt|ddct_desc|rqst_locl_amt|rqst_dt|csr_tp_cd|rvs_csr_flg|org_slp_tp_cd|org_slp_func_cd|org_slp_ofc_cd|org_slp_iss_dt|org_slp_ser_no	|csr_no	|issuer	|vndr_cust_seq	|lgl_eng_nm	|evid_tp_nm|clz_sts_cd|auth_cd|lst_apro_flg|apro_rqst_no|apro_rqst_seq|slp_iss_ofc_cd";
		        var headCount=ComCountHeadTitle(HeadTitle);
	
		        SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
	
		        var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		        var headers = [ { Text:HeadTitle, Align:"Center"} ];
		        InitHeaders(headers, info);
	
		        var cols = [ {Type:"Radio",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"radio" },
			               {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"check" },
			               {Type:"Status",    Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"slp_tp_cd" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"slp_func_cd" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"slp_ofc_cd" },
			               {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"slp_iss_dt",       KeyField:0,   CalcLogic:"",   Format:"" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"slp_ser_no" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"vndr_seq" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_cnt_cd" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_seq" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"csr_desc" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"csr_locl_curr_cd" },
			               {Type:"Float",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"csr_locl_amt",     KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"csr_usd_amt" },
			               {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"eff_dt",           KeyField:0,   CalcLogic:"",   Format:"" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"evid_tp_cd" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"apro_flg" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"apro_dt" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cxl_flg" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cxl_desc" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"csr_offst_no" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ddct_flg" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ddct_locl_amt" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ddct_desc" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"rqst_locl_amt" },
			               {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"rqst_dt",          KeyField:0,   CalcLogic:"",   Format:"" },
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
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"clz_sts_cd" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"auth_cd" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"lst_apro_flg" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"apro_rqst_no" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"apro_rqst_seq" },
			               {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"slp_iss_ofc_cd" },
                           {Type:"Text",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"inv_no" } ];
		         
		        InitColumns(cols);
	
		        SetEditable(0);
		        SetColProperty(prefix+"slp_iss_dt", {Format:"####-##-##"} );
		        SetColProperty(prefix+"eff_dt", {Format:"####-##-##"} );
		        SetColProperty(prefix+"rqst_dt", {Format:"####-##-##"} );
		        SetVisible(false);
		        SetCountPosition();
			}
		break;
	}
}
function initControl() {
	//** Date Separator **/
	DATE_SEPARATOR="-";
	var formObj=document.form;
    //handling Axon event. event catch
	axon_event.addListenerFormat('beforedeactivate', 'obj_blur' , formObj); 	//- handling code when OnBeforeDeactivate(blur) event
	axon_event.addListenerFormat('beforeactivate',   'obj_focus', formObj);            //- handling code when OnBeforeActivate event in case of existing dataformat property
//    axon_event.addListener('keypress', 'csr_no_keypress' , 'csr_no');		
//    axon_event.addListener('keypress', 'slp_iss_dt_keypress' , 'slp_iss_dt');		
    axon_event.addListener('click', 'apro_flg_click', 'apro_flg');    
    axon_event.addListener('click', 'cxl_flg_click', 'cxl_flg');    
}
//handling Axon event 2
function obj_blur(){
    ComChkObjValid(ComGetEvent());
}
function obj_focus(){
    ComClearSeparator(ComGetEvent());
}
function csr_no_keypress(){
    //converting to upper case
//    ComKeyOnlyAlphabet('uppernum');
    if (document.form.slp_iss_dt.value != "")
    	document.form.slp_iss_dt.value="";
}
function slp_iss_dt_keypress(){
    ComKeyOnlyNumber(document.form.slp_iss_dt);
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	if (!validateForm(sheetObj, formObj, sAction))
		return;
	switch (sAction) {
		case IBSEARCH: //retrieve
			formObj.f_cmd.value=SEARCH;
			sheetObj.DoSearch("FNS_JOO_0023GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix) );	

			setSheet2Input(formObj, sheetObj);
			break;
		case IBSAVE: //save
			var SaveStr=ComGetSaveString(sheetObj);
			if (SaveStr==""){
				ComShowCodeMessage("JOO00036");
				return;
			}
			if (!ComShowCodeConfirm("JOO00046")){
				return false;
			}			
			//sheetObj.SetWaitImageVisible(0);
			//ComOpenWait(true);
			formObj.f_cmd.value=MULTI;
			var param=SaveStr + "&" + FormQueryString(formObj)+"&" + ComGetPrefixParam(prefix);
			//var sXml = sheetObj.DoSave("FNS_JOO_0023GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix), -1, false);
			var sXml=sheetObj.GetSaveData("FNS_JOO_0023GS.do", param);
			//var saveFlag=ComGetSelectSingleNode(sXml, "TR-ALL");
			sheetObj.LoadSaveData(sXml);
			
			//ComOpenWait(false);
/*			
			<ERROR>
			<ETC-DATA>
			<ETC KEY='TRANS_RESULT_KEY'> <![CDATA[F]]></ETC>
			<ETC KEY='Exception'> <![CDATA[]]></ETC>
			</ETC-DATA>
			<MESSAGE> <![CDATA[<||> # Error Type : APP(JOO10007)<||> # Error Message : Failed to retrieve [JOO Consultation]. Please try again.<||><||><||>"OK" : Close Alert Window , "Cancel" : Detail Information]]> </MESSAGE>
			</ERROR>
*/			
			
//			var key=ComGetEtcData(sXml,"key");		
//			UF_getBackEndJobStatus();
//            if (key.length > 0) {
//                formObj.key.value=key;
//                sheetObj.SetWaitTimeOut(10000);
//                timer=setInterval(UF_getBackEndJobStatus, 3000); // action getBackEndJobStatus function after 3 seconds.
//            }			
			break;
		//BackEndJob Status
		case IBSEARCH_ASYNC02: 			
		    formObj.f_cmd.value=SEARCHLIST;
		    var sXml=sheetObj.GetSearchData("FNS_JOO_0023GS.do", FormQueryString(formObj)+"&" + ComGetPrefixParam(prefix));
		    var jobState=ComGetEtcData(sXml, "jb_sts_flg")
		    if (jobState == "3") {
		        ComOpenWait(false);
		        ComShowCodeMessage("JOO00160");
		        clearInterval(timer);
		        //closing window after saving. and refreshing opener.
			    for (var inx=sheetObj.HeaderRows(); inx <= sheetObj.LastRow(); inx++){
			      	sheetObj.SetCellValue(inx, "radio","1",0);
			      	sheetObj.SetCellValue(inx, "check","1",0);
			    }
			    comPopupOK();		        
		    } else if (jobState == "4") {
		        ComOpenWait(false);
		        clearInterval(timer);
		        // BackEndJob Fail
		        ComShowCodeMessage('JOO00151');
		    } else if (jobState == "5") {
		        ComOpenWait(false);
		        clearInterval(timer);
		        // in case of reading BackEndJob result file
		        ComShowCodeMessage('JOO00152');
		    }
			break;
	}
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	switch (sAction) {
		case IBSEARCH: //retrieve
			break;
		case IBSAVE: //save
			if (JooGetRadioValue(formObj.cxl_flg) == "Y" && formObj.cxl_desc.value.length == 0){
				ComShowCodeMessage("JOO00077");
				formObj.cxl_desc.focus();
				return false;
			}
			if (JooGetRadioValue(formObj.apro_flg) == "Y" && sheetObj.GetCellValue(sheetObj.LastRow(), prefix+"clz_sts_cd") == "C"){
				ComShowCodeMessage("JOO00170");
				return false;
			}
			setInput2Sheet(formObj, sheetObj);
			break;
	}
	return true;
}
/**
 * sheet -> input
 * @param formObj
 * @param sheetObj
 * @return
 */
function setSheet2Input(formObj, sheetObj){
	if(sheetObj.RowCount() > 0){
		formObj.slp_team_cd     .value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix+"slp_iss_ofc_cd"       );
		formObj.slp_iss_dt      .value=sheetObj.GetCellText(sheetObj.LastRow(), prefix+"slp_iss_dt"       );
		formObj.rqst_dt         .value=sheetObj.GetCellText(sheetObj.LastRow(), prefix+"rqst_dt"          );
		formObj.eff_dt      	.value=sheetObj.GetCellText(sheetObj.LastRow(), prefix+"eff_dt"	        );
		formObj.issuer          .value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix+"issuer"           );
		formObj.csr_desc        .value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix+"csr_desc"         );
		formObj.vndr_cust_seq   .value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix+"vndr_cust_seq"    );
		formObj.lgl_eng_nm      .value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix+"lgl_eng_nm"       );
		formObj.csr_locl_curr_cd.value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix+"csr_locl_curr_cd" );
		formObj.csr_locl_amt    .value=sheetObj.GetCellText(sheetObj.LastRow(), prefix+"csr_locl_amt"     );
		formObj.evid_tp_nm      .value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix+"evid_tp_nm"       );
		formObj.evid_tp_cd      .value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix+"evid_tp_cd"       );
		formObj.apro_flg        .value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix+"apro_flg"         );
		formObj.apro_dt         .value=sheetObj.GetCellText(sheetObj.LastRow(), prefix+"apro_dt"          );
		formObj.old_apro_dt     .value=sheetObj.GetCellText(sheetObj.LastRow(), prefix+"apro_dt"          );
		formObj.cxl_flg         .value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix+"cxl_flg"          );
		formObj.cxl_desc        .value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix+"cxl_desc"         );
		var aproFlg=sheetObj.GetCellValue(sheetObj.LastRow(), prefix+"apro_flg");
		var cxlFlg=sheetObj.GetCellValue(sheetObj.LastRow(), prefix+"cxl_flg");
		
		if("N" == aproFlg && "N" == cxlFlg){
			//default 생성된 경우

			document.form.apro_flg[1].checked=true;
			setCxlFlgDisable(false);
		}else{
			if (aproFlg == "Y"){
				setCxlFlgDisable(true);
				document.form.apro_flg[0].checked=true;
			}else{
				setCxlFlgDisable(false);
				document.form.apro_flg[1].checked=true;
			}
			
			if (cxlFlg == "Y"){
				document.form.cxl_flg[0].checked=true;
				document.form.cxl_desc.readOnly=false;
				document.form.cxl_desc.className="input";
			}else{
				document.form.cxl_flg[1].checked=true;
				document.form.cxl_desc.readOnly=true;
				document.form.cxl_desc.className="input2";
			}
		}
		ComBtnEnable("btn_save");
		//ComIsBtnEnable("btn_evd");
	}else{
		formObj.slp_team_cd     .value="";
		formObj.slp_iss_dt      .value="";
		formObj.rqst_dt         .value="";
		formObj.eff_dt      	.value="";
		formObj.issuer          .value="";
		formObj.csr_desc        .value="";
		formObj.vndr_cust_seq   .value="";
		formObj.lgl_eng_nm      .value="";
		formObj.csr_locl_curr_cd.value="";
		formObj.csr_locl_amt    .value="";
		formObj.evid_tp_nm      .value="";
		formObj.evid_tp_cd      .value="";
		formObj.apro_flg        .value="";
		formObj.apro_dt         .value="";
		formObj.old_apro_dt     .value="";
		formObj.cxl_flg         .value="";
		formObj.cxl_desc        .value="";
		
		ComBtnDisable("btn_save");
		//ComBtnDisable("btn_evd");
	}
	
}
/**
 * input -> sheet
 * @param formObj
 * @param sheetObj
 * @return
 */
function setInput2Sheet(formObj, sheetObj){
	var aproFlg=JooGetRadioValue(formObj.apro_flg);
	var cxlFlg=JooGetRadioValue(formObj.cxl_flg);
	sheetObj.SetCellValue(sheetObj.LastRow(), prefix+"apro_flg",aproFlg);
	sheetObj.SetCellValue(sheetObj.LastRow(), prefix+"apro_dt" ,ComReplaceStr(formObj.apro_dt .value,"-",""));
	sheetObj.SetCellValue(sheetObj.LastRow(), prefix+"cxl_flg" ,cxlFlg);
	sheetObj.SetCellValue(sheetObj.LastRow(), prefix+"cxl_desc",formObj.cxl_desc.value);
}
/**
 * approval flag clicked
 * @return
 */
function apro_flg_click(){
	if (document.form.apro_flg[0].checked){
		setCxlFlgDisable(true);
	}else{
		setCxlFlgDisable(false);
	}
}
function cxl_flg_click(){
	if (document.form.cxl_flg[0].checked){
		document.form.cxl_desc.readOnly=false;
		document.form.cxl_desc.className="input";
		document.form.cxl_desc.focus();
	}else{
		document.form.cxl_desc.value="";
		document.form.cxl_desc.readOnly=true;
		document.form.cxl_desc.className="input2";
	}
}
/**
 * Cancel reason disabled 
 * @param argBol
 * @return
 */
function setCxlFlgDisable(argBol){
	if (argBol){
		if (document.form.old_apro_dt.value == ""){
			document.form.apro_dt.value=document.form.sysdate.value;
		}else{
			document.form.apro_dt.value=document.form.old_apro_dt.value;
		}
		document.form.cxl_flg[1].checked=true;
		document.form.cxl_desc.readOnly=true;
		document.form.cxl_desc.className="input2";
		document.form.cxl_desc.value="";
	}else{
		document.form.apro_dt.value="";
		
		document.form.cxl_flg[0].checked=true;
		document.form.cxl_desc.readOnly=false;
		document.form.cxl_desc.className="input";
		document.form.cxl_desc.value="";
	}
	for (var inx=0; inx < document.form.cxl_flg.length; inx++){
		document.form.cxl_flg[inx].disabled=argBol;
	}
}
function sheet1_OnSearchEnd(sheetObj, errMsg){
	setSheet2Input(document.form, sheetObj);
	
	if (sheetObj.RowCount()> 0 ){
		var auth_cd=sheetObj.GetCellValue(sheetObj.LastRow(), prefix+"auth_cd");
		if (auth_cd == "W"){
			JooSetBtnClass("C", true);
		}else{
			JooSetBtnClass("C", false);
		}
		if (sheetObj.GetCellValue(sheetObj.LastRow(), prefix+"evid_tp_cd") == "1"){
			JooSetBtnClass("U", true);
		}else{
			JooSetBtnClass("U", false);
		}
		document.form.apro_rqst_no.value=sheetObj.GetCellValue(sheetObj.LastRow(), prefix+"apro_rqst_no");
	}else{
		JooSetBtnClass("C", false);
		JooSetBtnClass("U", false);
	}
}
function UF_getBackEndJobStatus() {
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC02);
}


/**
 * Setting Bond No<br>
 */
function sheet1_OnSaveEnd(ErrMsg) {
	 ComOpenWait(false);
}