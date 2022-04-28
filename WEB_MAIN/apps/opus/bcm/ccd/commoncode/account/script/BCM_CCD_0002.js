/*=========================================================
** 1.0 Creation
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0002.js
*@FileTitle  :  Charge
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/04
=========================================================*/
/** Common global variable */
var sheetObjects=new Array();
var sheetCnt=0;
var saveRows=new Array();
var comboObjects=new Array();
var comboCnt=0;
/** Event handler processing by button click event */
document.onclick=processButtonClick;
/** Event handler processing by button click event */
function processButtonClick() {
    /*****Case more than two additional sheets tab sheet is used to specify a variable *****/
    var sheetObj=sheetObjects[0];
    /** **************************************************** */
    var formObj=document.form;
    try {
        var srcName=ComGetEvent("name");
        if(ComGetBtnDisable(srcName)) return false;
        switch (srcName) {
        case "btn_Retrieve":
            doActionIBSheet(sheetObj, formObj, IBSEARCH);
            break;
        case "btn_Save":
            doActionIBSheet(sheetObj, formObj, IBSAVE);
            break;
        case "btn_New":
            doActionIBSheet(sheetObj, formObj, IBCLEAR);
            break;
        case "btns_search":
            if(ComGetEvent("default")) return;
            	var sUrl="/opuscntr/COM_COM_0001.do?chg_cd=" + formObj.chg_cd.value +"&main_page=false"+"&mdm_yn="+ formObj.mdm_yn.value + "&delt_flg=" + formObj.delt_flg.value;
            	var rVal=ComOpenPopup(sUrl, 770, 450, "getChg_cd", "1,0,1", true);
            break;  
        case "btns_search1":
            ComOpenPopup('/opuscntr/COM_ENS_N11.do', 770, 520, 'getAcct_cd', "1,0,1", true);
            break;
        case "btn_Close":
            ComClosePopup(); 
            break;
        case "btn_Request":
            doActionIBSheet(sheetObjects[0], document.form, MULTI03); 
            break;
        case "btns_tax_cnt_cd":
            openCntCd();
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
function getChg_cd(rowArray) {
    var sheetObj=sheetObjects[0];
    var formObj=document.form;
    var colArray=rowArray[0];
    formObj.chg_cd.value=colArray[3];
    if(formObj.chg_cd.value.length > 0){
        doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
    }
}
function getAcct_cd(rowArray) {
    var sheetObj=sheetObjects[0];
    var formObj=document.form;
    var colArray=rowArray[0];
    formObj.co_chg_acct_cd.value=colArray[2];
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
    var formObj=document.form;
    for (i=0; i < sheetObjects.length; i++) {
        ComConfigSheet(sheetObjects[i]);
        initSheet(sheetObjects[i], i + 1);
        ComEndConfigSheet(sheetObjects[i]);
    }
    initControl();
    doActionIBCombo(sheetObjects[0], formObj, SEARCH01);
    // auth_tp_cd retrieve
    doActionIBSheet(sheetObjects[0], formObj, SEARCH10);
    var authTpCd=G_AHTU_TP_CD;
    var rqstNo=formObj.rqst_no.value;
    if(G_MDAA_CHK == 'Y')
        ComEnableObject(formObj.delt_flg, true); 
    else
        ComEnableObject(formObj.delt_flg, false); 
    // If the Process Status screen call, in the Detail PopUp
    if(rqstNo != '') {
        doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
        ComSetDisplay('btn_Close', true);
        var procTpCd=formObj.proc_tp_cd.value;
        var rqstUsrChk=formObj.rqst_usr_chk.value;
        ComEnableObject(formObj.btns_search, false);
        // Process Type is 'Reject' and AuthType is not 'Approval'(possible modifications and ReOpen)
        if(procTpCd == 'R' &&  ( ((authTpCd == 'R' || authTpCd == 'S') && rqstUsrChk == 'Y') || G_MDAA_CHK == 'Y') ) {
            ComSetDisplay('btn_Request', true);
            ComGetObject("btn_Request").style.setProperty("color", "#FF0000", "important");
            ComSetDisplay('btn_Retrieve', true);
            ComSetDisplay('btn_Save', true);
            doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
        } else if(procTpCd == 'A') {
            doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
            ComEnableObject(formObj.btns_search, false);
        } else {
            doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
        }
    } else {
        ComSetDisplay('btn_Retrieve', true);
        // MDM Authority is not Approval('A') or MDDA
        if( authTpCd == 'R' || authTpCd == 'S' || G_MDAA_CHK == 'Y') {
            ComSetDisplay('btn_New', true);
            ComSetDisplay('btn_Save', true);
        } else {
            //General User if you do not have MDM Authority
            ComSetDisplay('btn_New', true);
        }
    }
}
function initPage() {
    var formObj=document.form;
    for (i=0; i < sheetObjects.length; i++) {
        ComConfigSheet(sheetObjects[i]);
        initSheet(sheetObjects[i], i + 1);
        ComEndConfigSheet(sheetObjects[i]);
    }
}
/**
* All the combo box query
*/
function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
    switch (sAction) {
        case SEARCH01: // load page 시
            var sXml=sheetObj.GetSearchData("BCM_CCD_0002GS.do", "f_cmd=" + SEARCH01);
            var rtnValue=sXml.split("|$$|");
            for(var i=0; i<rtnValue.length; i++){
                var comboXml=ComXml2ComboString(rtnValue[i], "cd_desc", "cd");
                if(comboXml == null || comboXml == "" || comboXml == undefined) {}
                else{
                    var cdName;
                    var cdValue;
                    if(i==4) { 
                        cdName=comboXml[1].split("|");
                        cdValue=comboXml[1].split("|");
                    }else {
                        cdName=comboXml[0].split("|");
                        cdValue=comboXml[1].split("|");
                    }
                    for (var j=0; j < cdName.length; j++) {
                        var colText="";
                        if(i==3) colText=cdValue[j] +"|"+ cdName[j]; 
                        else colText=cdName[j];
                        comboObjects[i].InsertItem(j, colText, cdValue[j]);
                    }
                }
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
    case 1: // sheet1 init
        with(sheetObj){
              if (location.hostname != "")
              SetSelectionMode(smSelectionList);
              var HeadTitle1="|CHG_CD|CHG_NM|FRT_CHG_TP_CD|CO_CHG_ACCT_CD|REP_CHG_CD|CHG_REV_TP_CD|CHG_APLY_TP_CD|CHG_APLY_AREA_CD|CY_RD_TERM_FLG|CFS_RD_TERM_FLG|DOR_RD_TERM_FLG|NA_RD_TERM_FLG|TKL_TML_FLG|APLY_SVC_MOD_FLG|USE_CO_TP_CD|AUTO_RAT_FLG|TAX_FLG|DP_SEQ|CRE_USR_ID|CRE_DT|UPD_USR_ID|UPD_DT|DELT_FLG|EAI_EVNT_DT|EAI_IF_ID";
              var headCount=ComCountHeadTitle(HeadTitle1);
              (headCount, 0, 0, false);
              var prefix="sheet1_";
        
              SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
        
              var info    = { Sort:0, ColMove:0, HeaderCheck:1, ColResize:0 };
              var headers = [ { Text:HeadTitle1, Align:"Center"} ];
              InitHeaders(headers, info);
        
              var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"chg_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"chg_nm",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"frt_chg_tp_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"co_chg_acct_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"rep_chg_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"chg_rev_tp_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"chg_aply_tp_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"chg_aply_area_cd", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cy_rd_term_flg",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cfs_rd_term_flg",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"dor_rd_term_flg",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"na_rd_term_flg",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"tkl_tml_flg",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"aply_svc_mod_flg", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"use_co_tp_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"auto_rat_flg",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"tax_flg",     	  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"tax_cnt_cd",    	  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"dp_seq",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_usr_id",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_dt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_usr_id",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_dt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"delt_flg",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"eai_evnt_dt",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"eai_if_id",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
               
              InitColumns(cols);
              SetEditable(1);
              SetVisible(false);
            }
        break;
    }
}
// Sheet processing-related processes
function doActionIBSheet(sheetObj, formObj, sAction) {
    sheetObj.ShowDebugMsg(false);
    switch (sAction) {
    case IBSEARCH: // 조회
        if (validateForm(sheetObj, formObj, sAction)){
            if( formObj.rqst_no.value == ''){
                formObj.f_cmd.value=SEARCH;
            }else{
                formObj.f_cmd.value=SEARCH05;
            }
            //sheetObj.RenderSheet(0);
            ComOpenWait(true);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0002GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_"));
            var rqstNo=ComGetEtcData(sXml, "RQST_NO");
            ComSetObjValue(formObj.rqst_no, rqstNo);
            sheetObj.LoadSearchData(sXml,{Sync:1} );
            //sheetObj.RenderSheet(1);
            formObj.chg_cd.disabled=true;
            if(sheetObj.RowCount()== 0){
                formObj.creflag.value="Y";

                if(G_AHTU_TP_CD=="A"){
                    ComShowCodeMessage("CCD00033", "Charge Code");
                    doActionIBSheet(sheetObj, formObj, IBCLEAR);
                }else{
                    if(!ComShowConfirm(ComGetMsg("CCD00034", "Charge Code"))){
                        doActionIBSheet(sheetObj, formObj, IBCLEAR);
                    }
                }
                sheetObj.DataInsert(-1);
            } else {
                formObj.creflag.value="N";
            }
        }
        break;
    case SEARCH02: // Account Code checking
        if (validateForm(sheetObj, formObj, sAction)){
            formObj.f_cmd.value=SEARCH02;
            ComOpenWait(true);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0002GS.do", FormQueryString(formObj));
            var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Account (G/L)");
                    formObj.co_chg_acct_cd.value="";
                    formObj.co_chg_acct_cd.focus();
                }
                ComOpenWait(false);
        }
        break;
    case SEARCH03: // check tax country code
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            var sParam="f_cmd=" + SEARCH03 + "&tax_cnt_cd=" + formObj.tax_cnt_cd.value;
            var sXml=sheetObj.GetSearchData("BCM_CCD_0002GS.do", sParam);
            if(ComGetEtcData(sXml, "TRANS_RESULT_KEY")=="F") {
            	showErrorMsg(sXml);
                formObj.tax_cnt_cd.value="";
                formObj.tax_cnt_cd.focus();
            } else {
	            var result=ComGetEtcData(sXml, "result");
	            if(result==""){
	                ComShowCodeMessage("COM130402", "Country Code");
	                formObj.tax_cnt_cd.value="";
	                formObj.tax_cnt_cd.focus();
	            }
            }
            ComOpenWait(false);
        }
    break;
    case SEARCH10: // MDM AUTH_TP_CD query
        var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=CHRG';
        var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
        // global var sestting
        G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
        G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
        break;
    case IBSAVE: // Save
        if(validateForm(sheetObj, formObj, sAction)){
            var cy_rd_term_flg="N";
            var cfs_rd_term_flg="N";
            var dor_rd_term_flg="N";
            var na_rd_term_flg="N";
            var tkl_tml_flg="N";
            if(formObj.cy_rd_term_flg.checked == true){
                cy_rd_term_flg="Y";
            }else{
                cy_rd_term_flg="N";
            }
            if(formObj.cfs_rd_term_flg.checked == true){
                cfs_rd_term_flg="Y";
            }else{
             cfs_rd_term_flg="N";
            }
            if(formObj.dor_rd_term_flg.checked == true){
                dor_rd_term_flg="Y";
            }else{
                dor_rd_term_flg="N";
            }
            if(formObj.na_rd_term_flg.checked == true){
                na_rd_term_flg="Y";
            }else{
                na_rd_term_flg="N";
            }
            if(formObj.tkl_tml_flg.checked == true){
                tkl_tml_flg="Y";
            }else{
                tkl_tml_flg="N";
            }
            sheetObj.SetCellValue(1, 'sheet1_chg_cd', formObj.chg_cd.value, 0);
            sheetObj.SetCellValue(1, 'sheet1_chg_nm', formObj.chg_nm.value, 0);
            sheetObj.SetCellValue(1, 'sheet1_frt_chg_tp_cd', frt_chg_tp_cd.GetSelectCode(), 0);
            sheetObj.SetCellValue(1, 'sheet1_co_chg_acct_cd', formObj.co_chg_acct_cd.value, 0);
            sheetObj.SetCellValue(1, 'sheet1_rep_chg_cd', rep_chg_cd.GetSelectCode(), 0);
            sheetObj.SetCellValue(1, 'sheet1_chg_rev_tp_cd', chg_rev_tp_cd.GetSelectCode(), 0);
            sheetObj.SetCellValue(1, 'sheet1_chg_aply_tp_cd', chg_aply_tp_cd.GetSelectCode(), 0);
            sheetObj.SetCellValue(1, 'sheet1_chg_aply_area_cd', chg_aply_area_cd.GetSelectCode(), 0);
            sheetObj.SetCellValue(1, 'sheet1_cy_rd_term_flg', cy_rd_term_flg, 0);
            sheetObj.SetCellValue(1, 'sheet1_cfs_rd_term_flg', cfs_rd_term_flg, 0);
            sheetObj.SetCellValue(1, 'sheet1_dor_rd_term_flg', dor_rd_term_flg, 0);
            sheetObj.SetCellValue(1, 'sheet1_na_rd_term_flg', na_rd_term_flg, 0);
            sheetObj.SetCellValue(1, 'sheet1_tkl_tml_flg', tkl_tml_flg, 0);
//            sheetObj.SetCellValue(1,'sheet1_aply_svc_mod_flg',formObj.aply_svc_mod_flg.value);
//            sheetObj.SetCellValue(1,'sheet1_use_co_tp_cd',use_co_tp_cd.GetSelectCode());
            sheetObj.SetCellValue(1, 'sheet1_auto_rat_flg', formObj.auto_rat_flg.value, 0);
            sheetObj.SetCellValue(1, 'sheet1_dp_seq', formObj.dp_seq.value, 0);
            sheetObj.SetCellValue(1, 'sheet1_tax_flg', formObj.tax_flg.value, 0);
            sheetObj.SetCellValue(1, 'sheet1_tax_cnt_cd', formObj.tax_cnt_cd.value, 0);
            sheetObj.SetCellValue(1, 'sheet1_delt_flg', formObj.delt_flg.value, 0);
            if( formObj.creflag.value == "N" && formObj.rqst_no.value == ''){
                formObj.f_cmd.value=MULTI;
            }else{
                formObj.f_cmd.value=MULTI01;
                ComEnableObject(form.btns_search, false);
            }
            if(ComGetSaveString(sheetObj)==""){
                sheetObj.SetCellValue(1, 'sheet1_ibflag', "U", 0);
            }
            var tmpMsg="";
            if(formObj.creflag.value != "N" && formObj.rqst_no.value == ''){
                tmpMsg="CCD00035";
            }else{
                tmpMsg="COM130101";
            }
            if(ComShowConfirm(ComGetMsg(tmpMsg, "data"))){
                ComOpenWait(true);
                var sXml=sheetObj.GetSaveData("BCM_CCD_0002GS.do", FormQueryString(formObj) + "&" + ComGetSaveString(sheetObj));
                sheetObj.LoadSaveData(sXml);
                var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
                if(result != "F"){
                    if(formObj.creflag.value != "N" && formObj.rqst_no.value == ''){
                        ComShowCodeMessage("CCD00031");
                    } else {
                        ComShowCodeMessage("COM130102", "Data");
                    }
                    //doActionIBSheet(sheetObj, formObj, IBSEARCH);
                }else{
                    ComShowCodeMessage("COM130103", "data");
                }
                var rqstNo=ComGetEtcData(sXml, "RQST_NO");
                ComSetObjValue(formObj.rqst_no, rqstNo);
            }
        }
        break;
    case MULTI03:   // Request
        if (!ComShowCodeConfirm("CCD00030")) {
            return;
        }
        var sParam='f_cmd=' + MULTI03 + '&rqst_no=' + ComGetObjValue(formObj.rqst_no) + '&rqst_ofc_cd=' + ComGetObjValue(formObj.rqst_ofc_cd) + '&proc_tp_cd=O';
        var sXml=sheetObj.GetSaveData("BCM_CCD_2002GS.do", sParam);
        var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
        if(sav == "S"  ){
            ComShowCodeMessage("CCD00031");
            ComPopUpReturnValue("Y");
            ComClosePopup(); 
        } else {
            ComShowCodeMessage("COM130103", "Data");
        }
        break;
    case IBCLEAR:   // Request
        sheetObj.RemoveAll();
        formObj.reset();
        formObj.chg_cd.disabled=false;
        frt_chg_tp_cd.text="";
        chg_rev_tp_cd.text="";
        chg_aply_tp_cd.text="";
        chg_aply_area_cd.text="";
        rep_chg_cd.text="";
//        use_co_tp_cd.text="";
        formObj.rqst_no.value="";
        ComEnableObject(form.btns_search, true);
        formObj.tax_cnt_cd.disabled = true;
        ComEnableObject(formObj.btns_tax_cnt_cd, false);
        break;
    }
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
     with(formObj){
         switch ( sAction ) {
             case IBSEARCH:
                 if( formObj.rqst_no.value == ''){
                     if (formObj.chg_cd.value.length == 0){
                         ComShowCodeMessage("CCD00001", "Charge Code");
                         formObj.chg_cd.focus();
                         return false;
                     }
                 }
                 break;
             case IBSAVE:  
                 if (formObj.chg_cd.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Charge Code");
                     formObj.chg_cd.focus();
                     return false;
                 } else if (formObj.chg_nm.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Charge Name");
                     formObj.chg_nm.focus();
                     return false;
                 // 2014.03.07필수체크 해제
//                 }else if (frt_chg_tp_cd.text.length == 0){
//                   ComShowCodeMessage("CCD00001", "Charge Type");
//                   frt_chg_tp_cd.focus();
//                   return false;
//                   
//                 }else if (chg_rev_tp_cd.text.length == 0){
//                   ComShowCodeMessage("CCD00001", "Charge Rev Type");
//                   chg_rev_tp_cd.focus();
//                   return false;
//                   
//                 }else if (chg_aply_tp_cd.text.length == 0){
//                   ComShowCodeMessage("CCD00001", "Charge Applying Type");
//                   chg_aply_tp_cd.focus();
//                   return false;
                 }else if (chg_aply_area_cd.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Charge Applying Area Code");
                     chg_aply_area_cd.focus();
                     return false;
//                 }else if (formObj.aply_svc_mod_flg.value.length == 0){
//                     ComShowCodeMessage("CCD00001", "Applying Service Mode Flag");
//                     formObj.aply_svc_mod_flg.focus();
//                     return false;
                 }else if (co_chg_acct_cd.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Account(G/L)");
                     formObj.co_chg_acct_cd.focus();
                     return false;
                 }else if (rep_chg_cd.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Rep. Charge");
                     rep_chg_cd.focus();
                     return false;
//                 }else if (use_co_tp_cd.value.length == 0){
//                     ComShowCodeMessage("CCD00001", "Apply Company");
//                     use_co_tp_cd.focus();
//                     return false;
                 }else if (formObj.auto_rat_flg.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Auto Rating Flag");
                     formObj.auto_rat_flg.focus();
                     return false;
                 }else if (formObj.dp_seq.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Display Seq. on B/L");
                     formObj.dp_seq.focus();
                     return false;
                 }
                 break;
         }
     }
     return true;    
 }
function initControl() {
    var formObj=document.form;
    //axon_event.addListenerForm('deactivate', 'obj_deactivate', formObj);
    //axon_event.addListenerForm('focus', 'obj_activate', formObj);
    //axon_event.addListenerForm('change', 'obj_change', formObj);
//  axon_event.addListenerFormat('keypress', 'obj_keypress', formObj);
}
/**
* If the data field to be the CHANGE Event
*/
function obj_change(){
    var formObj = document.form;
    var sheetObj = sheetObjects[0];
    try {
        var srcName = ComGetEvent("name");
        
        switch(srcName) {
        case "chg_cd":
            if(formObj.chg_cd.value.length > 0){
                doActionIBSheet(sheetObj, formObj, IBSEARCH);
            }
        break;
        case "co_chg_acct_cd":
            if(formObj.co_chg_acct_cd.value.length > 0){
                doActionIBSheet(sheetObj, formObj, SEARCH02);
            }
        break;
        case "delt_flg" :
            if(formObj.delt_flg.value == "Y") {
                if(!ComShowCodeConfirm("COM130301", "data")) formObj.delt_flg.value = "N";
            }
        break;
        case "tax_cnt_cd":
            if(formObj.tax_cnt_cd.value.length > 0){
                doActionIBSheet(sheetObj, formObj, SEARCH03);
            }
        break;
        case "tax_flg":
        	if(formObj.tax_flg.value == "Y"){
        		formObj.tax_cnt_cd.disabled = false;
        		ComEnableObject(formObj.btns_tax_cnt_cd, true);
        	}else{
        		formObj.tax_cnt_cd.disabled = true;
        		ComEnableObject(formObj.btns_tax_cnt_cd, false);
        	}
        break;
       } // end switch
    }catch(e) {
        if( e == "[object Error]") {
            ComShowMessage(OBJECT_ERROR);
        } else {
            ComShowMessage(e.message);
        }
    }
}
/**
* KEY PRESS EVENT
*/
//function obj_keypress() {
//  obj=event.srcElement;
//  keyValidation(obj);
//}
/**
 * HTML Control loses the focus to handle events that occur.
 */
function obj_deactivate() {
    var formObj=document.form;
    var obj=ComGetEvent();
}
 function sheet1_OnSearchEnd(sheet1, ErrMsg){
     ComOpenWait(false);
     var formObj=document.form;
 
    if (sheet1.RowCount()> 0){
         formObj.chg_cd.value=sheet1.GetCellValue(1,'sheet1_chg_cd');
         formObj.chg_nm.value=sheet1.GetCellValue(1,'sheet1_chg_nm');       
         frt_chg_tp_cd.SetSelectCode(sheet1.GetCellValue(1,'sheet1_frt_chg_tp_cd'));
         formObj.co_chg_acct_cd.value=sheet1.GetCellValue(1,'sheet1_co_chg_acct_cd');
         rep_chg_cd.SetSelectCode(sheet1.GetCellValue(1,'sheet1_rep_chg_cd'));
         chg_rev_tp_cd.SetSelectCode(sheet1.GetCellValue(1,'sheet1_chg_rev_tp_cd'));
         chg_aply_tp_cd.SetSelectCode(sheet1.GetCellValue(1,'sheet1_chg_aply_tp_cd'));
         chg_aply_area_cd.SetSelectCode(sheet1.GetCellValue(1,'sheet1_chg_aply_area_cd'));
         if(sheet1.GetCellValue(1,'sheet1_cy_rd_term_flg') == "Y"){
             formObj.cy_rd_term_flg.checked=true;
         }else{
             formObj.cy_rd_term_flg.checked=false;
         }
         if(sheet1.GetCellValue(1,'sheet1_cfs_rd_term_flg') == "Y"){
             formObj.cfs_rd_term_flg.checked=true;
         }else{
             formObj.cfs_rd_term_flg.checked=false;
         }
         if(sheet1.GetCellValue(1,'sheet1_dor_rd_term_flg') == "Y"){
             formObj.dor_rd_term_flg.checked=true;
         }else{
             formObj.dor_rd_term_flg.checked=false;
         }
         if(sheet1.GetCellValue(1,'sheet1_na_rd_term_flg') == "Y"){
             formObj.na_rd_term_flg.checked=true;
         }else{
             formObj.na_rd_term_flg.checked=false;
         }
         if(sheet1.GetCellValue(1,'sheet1_tkl_tml_flg') == "Y"){
             formObj.tkl_tml_flg.checked=true;
         }else{
             formObj.tkl_tml_flg.checked=false;
         }               
//             formObj.aply_svc_mod_flg.value=sheet1.GetCellValue(1,'sheet1_aply_svc_mod_flg');
//             use_co_tp_cd.SetSelectCode(sheet1.GetCellValue(1,'sheet1_use_co_tp_cd'));
         formObj.auto_rat_flg.value=sheet1.GetCellValue(1, 'sheet1_auto_rat_flg');
         formObj.tax_flg.value=sheet1.GetCellValue(1, 'sheet1_tax_flg');
         formObj.tax_cnt_cd.value=sheet1.GetCellValue(1, 'sheet1_tax_cnt_cd');
         formObj.dp_seq.value=sheet1.GetCellValue(1, 'sheet1_dp_seq');
         formObj.delt_flg.value=sheet1.GetCellValue(1, 'sheet1_delt_flg');
         formObj.cre_usr_id.value=sheet1.GetCellValue(1,'sheet1_cre_usr_id');
         formObj.cre_dt.value=sheet1.GetCellValue(1,'sheet1_cre_dt');
         formObj.upd_usr_id.value=sheet1.GetCellValue(1,'sheet1_upd_usr_id');
         formObj.upd_dt.value=sheet1.GetCellValue(1,'sheet1_upd_dt');
    }
}

function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
    ComOpenWait(false);
}

function openCntCd() {
	var formObj=document.form;
	var sUrl="/opuscntr/COM_ENS_0M1.do?cnt_cd=" + formObj.tax_cnt_cd.value +"&main_page=false&mdm_yn=" + formObj.mdm_yn.value;
	var rVal=ComOpenPopup(sUrl, 850, 530, "cntCodeHelp", "0,0", true);
}

/**
 * cnt code Inquiry of selected values ??from the pop-up Setting.
 */
function cntCodeHelp(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];           
    formObj.tax_cnt_cd.value=colArray[1];
}
