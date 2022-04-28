/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : fns_joo_0022.js
 *@FileTitle: CSR Approval
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
 * @class fns_joo_0022 : business script for fns_joo_0022
 */

// common global variable
var tabObjects=new Array();
var tabCnt=0;
var beforetab=1;
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects = new Array();
var comboCnt = 0;
var prefix="sheet1_";
// Event handler processing by button click event */
document.onclick=processButtonClick;
// Event handler processing by button name */
function processButtonClick() {
	/***** setting sheet object *****/
	var sheetObject1=sheetObjects[0];
	/*******************************************************/
	var formObject=document.form;
	try {
		var srcName=ComGetEvent("name");
		switch (srcName) {
			case "btn_retrieve":
				doActionIBSheet(sheetObject1, formObject, IBSEARCH);
				break;
			case "btn_calendar":
				var cal=new ComCalendar();
	            cal.setEndFunction("calFr"); 
				cal.select(formObject.slp_iss_dt, 'yyyy-MM-dd');
				break;
			case "btn_downexcel":
				if(sheetObject1.RowCount() < 1){//no data
					ComShowCodeMessage("COM132501");
				}else{
					sheetObject1.Down2Excel({ HiddenColumn:1,Merge:1});
				}		
				break;
			case "btn_new":
				initPeriod();
				ComSetObjValue(formObject.csr_no, "");
				ComSetObjValue(formObject.cxl_desc, "");
				formObject.if_flg[0].checked=true;
				sheetObject1.RemoveAll();
                comboObjects[0].SetSelectIndex(0);
				formObject.if_flg[1].focus();
				ComEnableObject( document.form.btn_approval , true );
				break;
			case "btn_csr":
				if (sheetObject1.GetSelectRow()== undefined || sheetObject1.GetSelectRow()== null){
					ComShowCodeMessage('JOO00072');
					return;
				}
				if (sheetObject1.RowCount()== 0){
					ComShowCodeMessage('JOO00073');
					return;
				}
				var row=sheetObject1.GetSelectRow();
				var csrNo=sheetObject1.GetCellValue(row, prefix+"csr_no");
				if (csrNo == ""){
					ComShowCodeMessage('JOO00074');
					return;
				}
				var param='?csrNo='+csrNo;
				//ComOpenPopup('/opuscntr/FNS_JOO_0024.do'+param, 835, 450, 'popupFinish', '1,0,1,1,1,1,1,1', true);
				//ComOpenPopup('/opuscntr/FNS_JOO_0024.do'+param, 835, 450, '', 'none', false);
				//ComOpenPopup("/opuscntr/FNS_JOO_0024.do"+param, 835, 450, "popupFinish", "none", false, false, 0, 0, 0, "pop1");
				ComJooCsrDetailPopup(param);
				break;
			case "btn_approval":
				if(!setGroupCellValue(sheetObject1, formObject, "A")) return;
				doActionIBSheet(sheetObject1, formObject, IBSAVE, "A");
				break;
			case "btn_cancel":
				if(!setGroupCellValue(sheetObject1, formObject, "C")) return;
				doActionIBSheet(sheetObject1, formObject, IBSAVE, "C");
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
function popupFinish(aryPopupData){
	///alert("popUpFinish");
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
    // initializing IBMultiCombo
    for (var k = 0; k < comboObjects.length; k++) {
        initCombo(comboObjects[k], k + 1);
    }
    initControl();
    document.form.if_flg[1].focus()
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
 * setting Combo basic info
 * 
 * @param comboObj
 * @param comboIndex
 *            Number
 */
function initCombo(comboObj, comboNo) {
    var formObject = document.form;
    switch (comboObj.options.id) {
        case "auth_ofc_cd":
            with (comboObj) {
                SetMultiSelect(0);
                SetUseAutoComplete(1);
                SetColAlign(0, "left");
                // SetColWidth(0, "60");
                ValidChar(2, 1); // Uppercase
                SetDropHeight(160);
                SetMaxLength(3);
            }
            var comboItems = gAuthOfcCdComboItems.split("|");
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
		        var HeadTitle	="|GRP No|CHK|Approval\n/Cancel|Cancel Reason|Offset No|Register No.|Issue Team|CSR Creation Date|Req. Date|Eff. Date|Issuer|1st Approver|Vendor\n/Customer|Vendor\n/Customer Name|Currency|Amount|Description|Error Message";
		        	HeadTitle  +="|slp_tp_cd|slp_func_cd|slp_ofc_cd|slp_ser_no|vndr_seq|cust_cnt_cd|cust_seq|csr_usd_amt|ddct_flg|ddct_locl_amt|proc_jb_flg";
		        	HeadTitle  +="|ddct_desc|rqst_locl_amt|csr_tp_cd|rvs_csr_flg|org_slp_tp_cd|org_slp_func_cd|org_slp_ofc_cd|org_slp_iss_dt|org_slp_ser_no|evid_tp_nm";
		        	HeadTitle  +="|clz_sts_cd|auth_cd|lst_apro_flg|apro_rqst_no|apro_rqst_seq|inv_no|apro_flg|apro_dt|cxl_flg|evid_tp_cd|chk_grp_csr_offst_no|csr_offst_flg|cre_usr_id|n1st_apro_usr_id";
		         
		        var headCount=ComCountHeadTitle(HeadTitle);

		        SetConfig( { SearchMode:2, MergeSheet:2, Page:20, DataRowMerge:0, FrozenCol:6  } );
		        var info    = { Sort:0, ColMove:1, HeaderCheck:0, ColResize:1 };
		        var headers = [ { Text:HeadTitle, Align:"Center"} ];
		        InitHeaders(headers, info);
	
		        var cols = [ 
		                     {Type:"Status",    Hidden:1, 	Width:0,    Align:"Center",  ColMerge:1,   SaveName: prefix+"ibflag" },
		                     {Type:"Text",      Hidden:1, 	Width:30,   Align:"Center",  ColMerge:1,   SaveName: prefix+"grp_csr_offst_no"	},
		                     {Type:"CheckBox",  Hidden:0, 	Width:55,   Align:"Center",  ColMerge:1,   SaveName: prefix+"chk_flg" 	},
		                     {Type:"Combo",     Hidden:1, 	Width:80,   Align:"Center",  ColMerge:0,   SaveName: prefix+"apro_cxl_flg",     KeyField:0,   CalcLogic:"",   Format:"",	UpdateEdit:1,   InsertEdit:1 },
		                     {Type:"Text",      Hidden:1,  	Width:170,	Align:"Left",    ColMerge:0,   SaveName: prefix+"cxl_desc",         KeyField:0,   CalcLogic:"",   Format:"",   	UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Text",  	Hidden:0, 	Width:80,   Align:"Center",  ColMerge:1,   SaveName: prefix+"csr_offst_no", 	KeyField:0,   CalcLogic:"",   Format:"",   	UpdateEdit:0,   InsertEdit:0  	},
		                     {Type:"Text",      Hidden:0,  	Width:140,  Align:"Center",  ColMerge:0,   SaveName: prefix+"csr_no", 			KeyField:0,   CalcLogic:"",   Format:"",   	UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Text",      Hidden:0,  	Width:80,   Align:"Center",  ColMerge:0,   SaveName: prefix+"slp_iss_ofc_cd", 	KeyField:0,   CalcLogic:"",   Format:"",   	UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Text",      Hidden:0,  	Width:100,  Align:"Center",  ColMerge:0,   SaveName: prefix+"slp_iss_dt",       KeyField:0,   CalcLogic:"",   Format:"",   	UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Text",      Hidden:0,  	Width:80,   Align:"Center",  ColMerge:0,   SaveName: prefix+"rqst_dt",          KeyField:0,   CalcLogic:"",   Format:"",   	UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Text",      Hidden:0,  	Width:80,   Align:"Center",  ColMerge:0,   SaveName: prefix+"eff_dt",           KeyField:0,   CalcLogic:"",   Format:"",   	UpdateEdit:0,   InsertEdit:0 },//10
		                     {Type:"Text",      Hidden:0,  	Width:100,   Align:"Center",  ColMerge:0,   SaveName: prefix+"issuer",          KeyField:0,   CalcLogic:"",   Format:"",   	UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Text",      Hidden:0,  	Width:100,   Align:"Center",  ColMerge:0,   SaveName: prefix+"n1st_apro_nm",    KeyField:0,   CalcLogic:"",   Format:"",   	UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Text",      Hidden:0,  	Width:80,   Align:"Center",  ColMerge:0,   SaveName: prefix+"vndr_cust_seq", 	KeyField:0,   CalcLogic:"",   Format:"",   	UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Text",      Hidden:0,  	Width:150,  Align:"Center",  ColMerge:0,   SaveName: prefix+"lgl_eng_nm", 		KeyField:0,   CalcLogic:"",   Format:"",   	UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Text",      Hidden:0,  	Width:80,   Align:"Center",  ColMerge:0,   SaveName: prefix+"csr_locl_curr_cd", KeyField:0,   CalcLogic:"",   Format:"",   	UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Float",     Hidden:0,  	Width:130,  Align:"Right",   ColMerge:0,   SaveName: prefix+"csr_locl_amt",     KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 ,   UpdateEdit:0,   InsertEdit:0},
		                     {Type:"Text",      Hidden:0,  	Width:160,  Align:"Left",    ColMerge:0,   SaveName: prefix+"csr_desc",         KeyField:0,   CalcLogic:"",   Format:"",   	UpdateEdit:0,   InsertEdit:0 }, //17
		                     {Type:"Text",      Hidden:0,  	Width:250,  Align:"Left",    ColMerge:0,   SaveName: prefix+"err_msg",          KeyField:0,   CalcLogic:"",   Format:"",   	UpdateEdit:0,   InsertEdit:0 }, //17
		                     
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"slp_tp_cd",     	KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"slp_func_cd",     	KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"slp_ofc_cd",     	KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"slp_ser_no",     	KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"vndr_seq",     		KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"cust_cnt_cd",     	KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"cust_seq",     		KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"csr_usd_amt",     	KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"ddct_flg",     		KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"ddct_locl_amt",     KeyField:0,   CalcLogic:"",   Format:"" }, //27
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"proc_jb_flg",       KeyField:0,   CalcLogic:"",   Format:"" }, //27
		                     
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"ddct_desc",     	KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"rqst_locl_amt",     KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"csr_tp_cd",     	KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"rvs_csr_flg",     	KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"org_slp_tp_cd",     KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"org_slp_func_cd",   KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"org_slp_ofc_cd",    KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"org_slp_iss_dt",    KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"org_slp_ser_no",    KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"evid_tp_nm",     	KeyField:0,   CalcLogic:"",   Format:"" }, //37
		                     
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"clz_sts_cd",     	KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"auth_cd",     		KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"lst_apro_flg",     	KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"apro_rqst_no",     	KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"apro_rqst_seq",     KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"inv_no",     		KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"apro_flg",     		KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"apro_dt",     		KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"old_apro_dt",     	KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"cxl_flg",     		KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"evid_tp_cd",     	KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"chk_grp_csr_offst_no",     	KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"csr_offst_flg",     	KeyField:0,   CalcLogic:"",   Format:"" }, //49
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"cre_usr_id",     	KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"n1st_apro_usr_id",  KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:1, 	Width:0,  	Align:"Left",    ColMerge:0,   SaveName:prefix+"inv_qty",     	KeyField:0,   CalcLogic:"",   Format:"" }
		                     ];
		         
		        InitColumns(cols);
                SetColProperty(0    , prefix+"apro_cxl_flg" , {ComboText:"|Approval|Cancel", ComboCode:"|A|C", DefaultValue:""} );
		        SetColProperty(0    , prefix+"slp_iss_dt"	, {Format:"####-##-##"} );
		        SetColProperty(0    , prefix+"eff_dt"		, {Format:"####-##-##"} );
		        SetColProperty(0    , prefix+"rqst_dt"		, {Format:"####-##-##"} );	
		        SetEditable(1);
			}
		break;
	}
}
function initControl() {
	//** Date Separator **/
	DATE_SEPARATOR="-";
	var formObject=document.form;
	
	initPeriod();
	
    //handling Axon event. event catch
	//axon_event.addListenerFormat('beforedeactivate', 'obj_blur' , formObject); 	//- handling code when OnBeforeDeactivate(blur) event
    axon_event.addListener  ('click', 'change_event_radio', 'if_flg');   
    axon_event.addListenerForm  ('keyup', 'obj_keyup', form);
    
    resizeSheet();
}

function initPeriod(){
    var formObj=document.form;
    var tmpNowYmd = ComGetNowInfo("ymd","-"); //ComGetDateAdd(formObj.exe_yrmon.value,"M", 1);
    
    ComSetObjValue(formObj.slp_iss_dt, tmpNowYmd);
}

//handling Axon event 2
function obj_blur(){
    ComChkObjValid(event.srcElement);
}
function obj_keyup(){
    var eleObj=event.srcElement;
    var form=document.form;
    switch (eleObj.name) {
        case "slp_iss_dt":
            var slpIssDt=ComReplaceStr(form.slp_iss_dt.value,"-","");
            if (slpIssDt.length == 8){
                sheetObjects[0].RemoveAll();
                doActionIBSheet(sheetObjects[0], form, IBROWSEARCH);
            }
            break; 
        case "cxl_desc":
        	var tmpCxlDesc = ComGetObjValue(form.cxl_desc);
        	if(!ComIsEmpty(tmpCxlDesc)){
        		ComEnableObject( form.btn_approval , false );
        	}
        	else{
        		ComEnableObject( form.btn_approval , true );
        	}
        	break;
    }
}
function change_event_radio(){
	sheetObjects[0].RemoveAll();

    doActionIBSheet(sheetObjects[0], document.form, IBROWSEARCH);
}


function doActionIBSheet(sheetObj, formObj, sAction, sVal) {
	sheetObj.ShowDebugMsg(false);
	if (!validateForm(sheetObj, formObj, sAction, sVal))
		return;
	//formObj.slp_iss_dt.value=ComReplaceStr(formObj.slp_iss_dt,"-","");
	switch (sAction) {
		case IBSEARCH: //retrieve
//			if (formObj.csr_no.value.length >= gDefaultCsrLength){
//				var param='?csrNo='+formObj.csr_no.value+"&editable=Y";
//				ComOpenPopup("/opuscntr/FNS_JOO_0023.do"+param, 1024, 410, "popupFinish1", "1,0,1,1,1,1,1,1", false);
//			}else{
			formObj.csr_offst_no.value = "";
			formObj.f_cmd.value=SEARCH;
 			sheetObj.DoSearch("FNS_JOO_0205GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix) );
//			}
			break;
			
        case IBROWSEARCH: //setting OFFICE LIST combo
            comboObjects[0].RemoveAll();
            formObj.f_cmd.value=SEARCHLIST01;
            var sXml=sheetObj.GetSearchData("FNS_JOO_0205GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
            var authOfcList=ComGetEtcData(sXml,"auth_ofc_cds");
            
            var comboItems=authOfcList.split("|");
            addComboItem(comboObjects[0], comboItems);
            comboObjects[0].SetSelectIndex(0,false);
            if (comboItems.length == 1){
                comboObjects[0].SetEnable(0);
            }else{
                comboObjects[0].SetEnable(1);
            }
            break;
			
		case IBSAVE: //save
			var SaveStr=ComGetSaveString(sheetObj);
			if (SaveStr==""){
				ComShowCodeMessage("JOO00036");
				return;
			}
			if(sVal == "A"){
				if (!ComShowCodeConfirm("JOO00225","Approve CSR")){
					return false;
				}	
			}
			else{
				if (!ComShowCodeConfirm("JOO00225","Cancel CSR")){
					return false;
				}
			}			
			
			sheetObj.SetWaitImageVisible(0);
			ComOpenWait(true);
			
			ComSetObjValue(formObj.f_cmd, MULTI);
            var aryPrefix=new Array( "sheet1_");
            var sParam = SaveStr;
                sParam += "&" + FormQueryString(formObj);
                sParam += "&" + ComGetPrefixParam(aryPrefix);
            var sXml = sheetObj.GetSaveData("FNS_JOO_0205GS.do", sParam);
            
            // 2018-07-09 :: Add Back-End Job :: Start
            
			var backendJobKey = ComGetEtcData(sXml, "backendjob_key");
			
			if (backendJobKey != undefined && backendJobKey != '') {
    			if(backendJobKey == "7"){
					ComShowCodeMessage("JOO00151");
					formObj.csr_offst_no.value = "";
					ComOpenWait(false);
				} else if(backendJobKey == "8"){
					ComShowCodeMessage("JOO10022", "Another JOO CSR Approval");
					formObj.csr_offst_no.value = "";
					ComOpenWait(false);
				} else if(backendJobKey == "9"){
					ComShowCodeMessage("JOO10024");
					for(var i = 0; i < sheetObj.RowCount(); i++){
						if(sheetObj.GetCellValue(i, prefix+"csr_offst_no") == formObj.csr_offst_no.value ){
							sheetObj.SetCellValue(i, prefix+"proc_jb_flg", "Y");
							sheetObj.SetCellValue(i, prefix+"err_msg", "Processing...");
						}
					}
					formObj.csr_offst_no.value = "";
					ComOpenWait(false);
				} else {
					ComSetObjValue(formObj.backendjob_key, backendJobKey);
					sheetObj.SetWaitImageVisible(0);
					ComOpenWait(true);
					
					sheetObj.SetWaitTimeOut(10000);
					timer = setInterval(getBackEndJobStatus, 3000);  // 3초마다 getBackEndJobStatus함수 실행
				}
			} else {
				ComShowCodeMessage("JOO00151");
				formObj.csr_offst_no.value = "";
				ComOpenWait(false);
			}
			// 2018-07-09 :: Add Back-End Job :: End
            
//            sheetObj.LoadSaveData(sXml);
            /*
            var tmpTransResultKey = ComGetEtcData(sXml, "TRANS_RESULT_KEY");
            
            if(tmpTransResultKey == "S"){
                //sheetObj.LoadSaveData(sXml);
                ComOpenWait(false);
                doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);  
            }else{
            	sheetObj.LoadSaveData(sXml);
                //ComOpenWait(false);
            }*/
            break;
            
		case IBSEARCH_ASYNC10: // BackEndJob Status

		    var sXml = sheetObj.GetSearchData("FNS_JOO_0205GS.do", "f_cmd=" + SEARCH02 + "&backendjob_key=" + ComGetObjValue(formObj.backendjob_key));
		    var jobState = ComGetEtcData(sXml, "jb_sts_flg");

			 	if (jobState == "3") { // Success
			 		ComOpenWait(false);
			 		clearInterval(timer);
			 		ComShowCodeMessage("JOO10018");
			 		formObj.csr_offst_no.value = "";
			 		doActionIBSheet(sheetObj, formObj, IBSEARCH);
			 	} else if (jobState == "4") { // Fail
			 		ComOpenWait(false);
			 		clearInterval(timer);
			 	    var sXml = sheetObj.GetSearchData("FNS_JOO_0205GS.do", "f_cmd=" + SEARCH03 + "&backendjob_key=" + ComGetObjValue(formObj.backendjob_key) + "&csr_offst_no=" + ComGetObjValue(formObj.csr_offst_no));
			 	    var jbUsrErrMsg = ComGetEtcData(sXml, "jb_usr_err_msg");
			 	    ComShowMessage(jbUsrErrMsg);
			 	    formObj.csr_offst_no.value = "";
			 	    doActionIBSheet(sheetObj, formObj, IBSEARCH);
			 	} else if (jobState == "5") { // Unexpected System Error
			 		ComOpenWait(false);
			 		clearInterval(timer);
			 		ComShowCodeMessage("JOO10019");
			 	}
		break;
	}
	
	formObj.slp_iss_dt.focus();
}

/**
 * BackEndJob 호출함수
 */
function getBackEndJobStatus() {
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC10);
}

/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction, sVal) {
	switch (sAction) {
		case IBSEARCH: //retrieve
			var csrNo=formObj.csr_no.value; 
			if (csrNo.length > 0 && csrNo.length < gDefaultCsrLength){
				ComShowCodeMessage("JOO00075");
				formObj.csr_no.focus();
				return false;
			}
			var slpIssDt=ComReplaceStr(formObj.slp_iss_dt,"-","");
			if (csrNo.length == 0 && slpIssDt.length == 0){
				ComShowCodeMessage("JOO00076");
				formObj.csr_no.focus();
				return false;
			}
		break;
        case IBROWSEARCH:
            var slpIssDt=ComReplaceStr(formObj.slp_iss_dt,"-","");
            if (slpIssDt.length == 0){
                ComShowCodeMessage("JOO00076");
                //formObj.csr_no.focus();
                return false;
            }                  
            break;
            
        case IBSAVE:
        	if (sheetObj.RowCount() > 0) {
                var iHeadRow = sheetObj.HeaderRows();
                var iLastRow = sheetObj.LastRow();
                
                var chkRows = sheetObj.FindCheckedRow(prefix+"chk_flg");
                
                if(chkRows == ""){
                	ComShowCodeMessage("JOO00117", "[CHK]");//Please check {?msg1}
                	return false;
                }
                var arrChkRow = chkRows.split("|");                
                
                var chkFlgCnt = sheetObj.CheckedRows(prefix+"chk_flg");
                if(chkFlgCnt <= 0){
                    ComShowCodeMessage("JOO00117", "[CHK]");//Please check {?msg1}
                    return false;
                }
                
                var chkGrpCsrOffstCnt 	= sheetObj.GetCellValue(arrChkRow[0], prefix+"chk_grp_csr_offst_no");
                var grpCsrOffstNo 		= sheetObj.GetCellValue(arrChkRow[0], prefix+"grp_csr_offst_no");
                
                if(chkFlgCnt != chkGrpCsrOffstCnt){
                	ComShowCodeMessage("JOO00224", "same Offset No");//Please check {?msg1}
                	return false;
                }
                
                for(idx=0; idx<arrChkRow.length; idx++){
                	var tmpRow			= arrChkRow[idx];
                    var tmpGrpCsrOffstNo= sheetObj.GetCellValue(tmpRow, prefix+"grp_csr_offst_no");
                    var tmpAproFlg 		= sheetObj.GetCellValue(tmpRow, prefix+"apro_flg");
                    var tmpCxlFlg 		= sheetObj.GetCellValue(tmpRow, prefix+"cxl_flg");
                    var tmpCxlDesc 		= sheetObj.GetCellValue(tmpRow, prefix+"cxl_desc");
                    
                    if(grpCsrOffstNo != tmpGrpCsrOffstNo){
                    	ComShowCodeMessage("JOO00224", "same Offset No");
                    	return false;
                    }
                    
                    if("A" == sVal){ //JOO00136']="{?msg1} code is invalid !
                    	if(ComIsNull(tmpAproFlg) || "N" == tmpAproFlg){
                        	ComShowCodeMessage("JOO00136", "["+tmpRow+"] Approval");
                        	return false;
                        }else if(tmpCxlFlg == "Y"){                    	
                        	ComShowCodeMessage("JOO00136", "["+tmpRow+"] Approval");
                        	return false;
                        }
                    }else if("C" == sVal){
                    	if(ComIsNull(tmpCxlFlg) || "N" == tmpCxlFlg){
                        	ComShowCodeMessage("JOO00136", "["+tmpRow+"] Cancel");
                        	return false;
                        }else if(tmpCxlFlg == "Y" && ComIsNull(tmpCxlDesc)){                    	
                        	ComShowCodeMessage("JOO00116", "Cancel Reason");
                        	return false;
                        }else if(tmpAproFlg == "Y"){                    	
                        	ComShowCodeMessage("JOO00136", "["+tmpRow+"] Cancel");
                        	return false;
                        }
                    }
                }
                
        	}else{
        		 ComShowCodeMessage('JOO00036');
                 return false;
        	}
                
            break;
	}
	return true;
}
/**
 * double Click 시
 * @param sheetObj
 * @param Row
 * @param Col
 * @param CellX
 * @param CellY
 * @param CellW
 * @param CellH
 * @return
 */
//function sheet1_OnDblClick(sheetObj, Row, Col, CellX, CellY, CellW, CellH) {
function sheet1_OnDblClick(sheetObj, Row, Col) {
	//var param='?csrNo='+sheetObj.GetCellValue(Row, prefix+'csr_no')+'&editable=Y';
	//ComOpenPopup('/opuscntr/FNS_JOO_0023.do'+param, 1024, 410, 'popupFinish1', '1,0,1,1,1,1,1,1', true);
}
function sheet1_OnSearchEnd(sheetObj, errMsg){
	//TO-DO AUTH_CD 에 따른 버튼 컨트롤??
	if (sheetObj.RowCount()> 0 ){
		var iHeadRow = sheetObj.HeaderRows();
	    var iLastRow = sheetObj.LastRow();
		
		for(var i=iHeadRow ; i <= iLastRow ; i++ ){
			var auth_cd=sheetObj.GetCellValue(i, prefix+"auth_cd");
			if (auth_cd == "W"){
				sheetObj.SetCellEditable(i, prefix + "chk_flg", 1);
			}else{
				sheetObj.SetCellEditable(i, prefix + "chk_flg", 0);
			}
		}
	}
	ComSetObjValue(document.form.cxl_desc, "");
	ComEnableObject( document.form.btn_approval , true );
}
function sheet1_OnSaveEnd(sheetObj, code, msg, stCode, stMsg, responseText) {
	ComOpenWait(false);
	if(code >= 0){
		doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);  
	}
}
function sheet1_OnChange(sheetObj, Row, Col, Value, OldValue, RaiseFlag) {
    var formObj = document.form;
    var colName = sheetObj.ColSaveName(Col);
    var prefix = "sheet1_";
    var iHeadRow = sheetObj.HeaderRows();
    var iLastRow = sheetObj.LastRow();
    
    switch (colName) {
	    case prefix + "chk_flg":
	    	if(sheetObj.GetCellValue(Row, prefix+"proc_jb_flg") == "Y"){
	    		ComShowCodeMessage("JOO10023", sheetObj.GetCellValue(Row, prefix+"grp_csr_offst_no"));
	    		setSheetCellValueConfig(sheetObj, i, formObj, "INIT")
	    		sheetObj.SetCellValue(Row, prefix+"chk_flg"	, "" , 0);
	    		break;
	    	}
	    	var grpCsrOffstNo = sheetObj.GetCellValue(Row, prefix+"grp_csr_offst_no");   
	    	
	    	formObj.csr_offst_no.value = grpCsrOffstNo;
	    	
            for(var i=iHeadRow ; i <= iLastRow ; i++ ){
            	var tmpGrpCsrOffstNo    = sheetObj.GetCellValue(i, prefix+"grp_csr_offst_no");//Number > String 변환.
            	
            	if("0" == Value) setSheetCellValueConfig(sheetObj, i, formObj, "INIT");//Uncheck 된 데이타 초기화.
            	
            	if(Row == i){
            		continue;
            	}else{
            		if(grpCsrOffstNo == tmpGrpCsrOffstNo){
            			sheetObj.SetCellValue(i, prefix+"chk_flg"	, Value	, 0);  
            		}else{
            			sheetObj.SetCellValue(i, prefix+"chk_flg"	, ""	, 0);
            		}
            	}
            }
	    	break;
	    /*case prefix + "apro_cxl_flg":
	    	var grpCsrOffstNo = sheetObj.GetCellValue(Row, prefix+"grp_csr_offst_no"); 
	    	
	    	var isEditable = (Value == "C") ? true : false;
            
            for(var i=iHeadRow ; i <= iLastRow ; i++ ){
            	var tmpGrpCsrOffstNo    = sheetObj.GetCellValue(i, prefix+"grp_csr_offst_no");//Number > String 변환.
            	
            	sheetObj.SetCellEditable(i, prefix+"cxl_desc", 0);//default로 비활성화 시킨다.
            	
            	if(Row == i){//선택된 자신 Row
            		sheetObj.SetCellEditable(i, prefix+"cxl_desc", isEditable);
            		
            		setSheetCellValueConfig(sheetObj, i, Value);
            		continue;
            	}else{
            		if(grpCsrOffstNo == tmpGrpCsrOffstNo){//선택된 Row의 그룹에 속한 Row
            			sheetObj.SetCellValue(i, prefix+"apro_cxl_flg", Value, 0);  
            			sheetObj.SetCellEditable(i, prefix+"cxl_desc", isEditable);
            			
            			setSheetCellValueConfig(sheetObj, i, Value);
            		}else{
            			sheetObj.SetCellValue(i, prefix+"apro_cxl_flg"	, "", 0);
            			sheetObj.SetCellValue(i, prefix+"cxl_desc"		, "", 0);
            			sheetObj.SetCellEditable(i, prefix+"cxl_desc", false);
            		}
            	}
            }
	    	break;*/	    	
    }
}

function setGroupCellValue(sheetObj, formObj, val){	
	if (sheetObj.RowCount() > 0) {
        var iHeadRow = sheetObj.HeaderRows();
        var iLastRow = sheetObj.LastRow();
        
        var chkRows = sheetObj.FindCheckedRow(prefix+"chk_flg");
        
        if(chkRows == ""){
        	ComShowCodeMessage("JOO00117", "[CHK]");//Please check {?msg1}
        	return false;
        }
        
        if("C" == val){
        	var tmpCxlDesc = ComGetObjValue(formObj.cxl_desc);
        	if(ComIsEmpty(tmpCxlDesc)){
        		ComShowCodeMessage("JOO00116", "Cancel Reason");//Please input {?msg1}.
        		return false;
        	}
        }
        
        var arrChkRow = chkRows.split("|");
        var chkGrpCsrOffstCnt 	= sheetObj.GetCellValue(arrChkRow[0], prefix+"chk_grp_csr_offst_no");
        var grpCsrOffstNo 		= sheetObj.GetCellValue(arrChkRow[0], prefix+"grp_csr_offst_no");

        // Issuer 나 1st Approver와 같을시 Approval 불가 - 2018.05.30
        for(idx=0; idx<arrChkRow.length; idx++){
        	
        	var csrIssuerNm  = sheetObj.GetCellValue(arrChkRow[idx], prefix+"issuer");
        	var csrIssuerId  = sheetObj.GetCellValue(arrChkRow[idx], prefix+"cre_usr_id");
        	var csr1stAproNm = sheetObj.GetCellValue(arrChkRow[idx], prefix+"n1st_apro_nm");
        	var csr1stAproId = sheetObj.GetCellValue(arrChkRow[idx], prefix+"n1st_apro_usr_id");
        	
        	if((gUsrId == csrIssuerId)||(gUsrId == csr1stAproId)){
        		ComShowCodeMessage('JOO00227', csrIssuerNm, csr1stAproNm);
        		return false;
        	}
        }
        
        for(idx=0; idx<arrChkRow.length; idx++){
        	setSheetCellValueConfig(sheetObj, arrChkRow[idx], formObj, val);
        }
        
	}else{
		 ComShowCodeMessage('JOO00036');
         return false;
	}
	return true;
}

function setSheetCellValueConfig(sheetObj, Row, formObj, val){
	var aproDt  	= ComGetObjValue(formObj.sysdate);
	var oldAproDt 	= sheetObj.GetCellValue(Row, prefix+"old_apro_dt");
	var cxlDesc 	= ComGetObjValue(formObj.cxl_desc);
	
	if(!ComIsEmpty(oldAproDt)) aproDt = oldAproDt;
	
	if(ComIsEmpty(val)) return false;
	
	switch(val){
		case "C" ://cancel
			sheetObj.SetCellValue(Row, prefix+"cxl_flg"		, "Y", 0);
			sheetObj.SetCellValue(Row, prefix+"cxl_desc"	, cxlDesc , 0);
			sheetObj.SetCellValue(Row, prefix+"apro_flg"	, "N", 0);
			sheetObj.SetCellValue(Row, prefix+"apro_dt"		, "" , 0);
			break;
		case "A" ://approval
			sheetObj.SetCellValue(Row, prefix+"cxl_flg"		, "N", 0);
			sheetObj.SetCellValue(Row, prefix+"cxl_desc"	, "" , 0);
			sheetObj.SetCellValue(Row, prefix+"apro_flg"	, "Y", 0);
			sheetObj.SetCellValue(Row, prefix+"apro_dt"		, aproDt, 0);
			ComSetObjValue(formObj.cxl_desc, "");
			break;
		case "INIT" ://Default
			sheetObj.SetCellValue(Row, prefix+"cxl_flg"		, "N", 0);
			sheetObj.SetCellValue(Row, prefix+"cxl_desc"	, "" , 0);
			sheetObj.SetCellValue(Row, prefix+"apro_flg"	, "N", 0);
			sheetObj.SetCellValue(Row, prefix+"apro_dt"		, "" , 0);
			break;
	}
}
/**
 * pop up window is closed
 * @param arry
 * @return
 */
function popupFinish1(arry){
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}

function auth_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){
    var formObj = document.form;
    sheetObjects[0].RemoveAll();
}

/**
 * calling after selecting calendar
 * @return
 */
function calFr(){
    var form=document.form;
    sheetObjects[0].RemoveAll();
    doActionIBSheet(sheetObjects[0], form, IBROWSEARCH);
}

function resizeSheet(){
    ComResizeSheet(sheetObjects[0], 70);
}
