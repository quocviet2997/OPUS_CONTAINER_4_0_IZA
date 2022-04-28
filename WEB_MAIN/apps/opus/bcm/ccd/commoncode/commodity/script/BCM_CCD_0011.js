/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0010.js
*@FileTitle  : Commodity
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/03
=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
               MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
               OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/** Common global variable */
var sheetObjects=new Array();
var sheetCnt=0;
var saveRows=new Array();
var comboObjects=new Array();
var comboCnt=0;
/** Event handler processing by button click event */
document.onclick=processButtonClick;
/** Event handler processing by button name */
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
        case "btn_Close":
            ComClosePopup(); 
            break;
        case "btn_Request":
            doActionIBSheet(sheetObjects[0], document.form, MULTI03); 
            break;
        case "btns_search": // Commodity Code pop-up
            var v1=formObj.mdm_yn.value;
            var classId="COM_ENS_011";
            var param='?mdm_yn='+v1+'&classId='+classId;

            ComOpenPopup('/opuscntr/COM_ENS_011.do' + param, 850, 450, 'getCmdt_cd', "1,0,1", true);
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
function getCmdt_cd(rowArray) {
    var sheetObj=sheetObjects[0];
    var formObj=document.form;
    var colArray=rowArray[0];
    formObj.cmdt_cd.value=colArray[2];
    doActionIBSheet(sheetObj, formObj, IBSEARCH);
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
        case SEARCH01: // load page 
            var sXml=sheetObj.GetSearchData("BCM_CCD_0011GS.do", "f_cmd=" + SEARCH01);
            var rtnValue=sXml.split("|$$|");
            if(rtnValue!=null && rtnValue.length>0){
                for(var i=0;i<rtnValue.length;i++){
                    var frm;
                    switch(i){
                        case 0:frm=rep_cmdt_cd; break;
                        case 1:frm=rep_imdg_lvl_cd; break;
                    }
                    ComXml2ComboItem(rtnValue[i], frm, "cd", "cd|cd_desc");
                    rep_cmdt_cd.SetColWidth(0, "50");
                    rep_cmdt_cd.SetColWidth(1, "555");
                }
                /*
                for(var i=0; i<rtnValue.length; i++){
                    var comboXml=ComXml2ComboString(rtnValue[i], "cd_desc", "cd");
                    if(comboXml!=null && comboXml!=undefined && comboXml!='undefined'){
                        var cdName=comboXml[0].split("|");
                        var cdValue=comboXml[1].split("|");
                        for (var j=0; j < cdName.length; j++) {
                            comboObjects[i].InsertItem(j, cdName[j], cdValue[j]);
                        }
                    }
                }
                */
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
              var HeadTitle1="|CMDT_CD|CMDT_NM|REP_IMDG_LVL_CD|REP_CMDT_CD|FMC_EXP_FLG|DELT_FLG|MODI_CMDT_CD";
              var headCount=ComCountHeadTitle(HeadTitle1);
              (headCount, 0, 0, false);
              var prefix="sheet1_";
              SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
              var info    = { Sort:0, ColMove:0, HeaderCheck:1, ColResize:0 };
              var headers = [ { Text:HeadTitle1, Align:"Center"} ];
              InitHeaders(headers, info);
              var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cmdt_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cmdt_nm",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"rep_imdg_lvl_cd", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"rep_cmdt_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"fmc_exp_flg",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"delt_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
              		 {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"modi_cmdt_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
              		 {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_usr_id",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
              		 {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_dt",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
              		 {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_usr_id",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
              		 {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_dt",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
              		 {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"eu_xpt_flg",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }];
               
              InitColumns(cols);
              SetEditable(1);
//            SetSheetHeight(150);
              SetVisible(0);
              SetSelectionMode(smSelectionList);
            }
        break;
    }
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
    sheetObj.ShowDebugMsg(false);
    switch (sAction) {
    case IBSEARCH: // Retrieve
        if (validateForm(sheetObj, formObj, sAction)){
            if( formObj.rqst_no.value == ''){
                formObj.f_cmd.value=SEARCH;
            }else{
                formObj.f_cmd.value=SEARCH02;
//                ComBtnDisable("btn_Save");  
            }
            ComOpenWait(true);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0011GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_"));
            var rqstNo=ComGetEtcData(sXml, "RQST_NO");
            ComSetObjValue(formObj.rqst_no, rqstNo);
            sheetObj.LoadSearchData(sXml,{Sync:1} );
            formObj.cmdt_cd.disabled=true;
            if(sheetObj.RowCount()== 0){ // Insert mode when no data is
                formObj.creflag.value="Y";
                if(G_AHTU_TP_CD=="A"){
                    ComShowCodeMessage("CCD00033", "Commodity Code");
                    doActionIBSheet(sheetObj, formObj, IBCLEAR);
                }else{
                    if(!ComShowConfirm(ComGetMsg("CCD00034", "Commodity Code"))){
                        doActionIBSheet(sheetObj, formObj, IBCLEAR);
                    }
                }
                sheetObj.DataInsert(-1);
            } else {
                formObj.creflag.value="N";
            }
        }
        break;
    case IBSAVE: // Save
        if(validateForm(sheetObj, formObj, sAction)){
            sheetObj.SetCellValue(1,'sheet1_cmdt_cd',formObj.cmdt_cd.value);
            sheetObj.SetCellValue(1,'sheet1_cmdt_nm',formObj.cmdt_nm.value);
            sheetObj.SetCellValue(1,'sheet1_rep_imdg_lvl_cd',rep_imdg_lvl_cd.GetSelectCode());
            sheetObj.SetCellValue(1,'sheet1_rep_cmdt_cd',rep_cmdt_cd.GetSelectCode());
//          sheetObj.CellValue(1,'sheet1_grp_cmdt_cd')     = formObj.grp_cmdt_cd.Code;
            sheetObj.SetCellValue(1,'sheet1_fmc_exp_flg',formObj.fmc_exp_flg.value);
            sheetObj.SetCellValue(1,'sheet1_delt_flg',formObj.delt_flg.value);
            sheetObj.SetCellValue(1,'sheet1_modi_cmdt_cd',formObj.modi_cmdt_cd.value);
            sheetObj.SetCellValue(1,'sheet1_eu_xpt_flg',formObj.eu_xpt_flg.value);
            if( formObj.creflag.value == "N" && formObj.rqst_no.value == ''){
                formObj.f_cmd.value=MULTI;
            }else{
                formObj.f_cmd.value=MULTI01;
                ComEnableObject(form.btns_search, false);
            }
            if(ComGetSaveString(sheetObj)==""){
                sheetObj.SetCellValue(1,'sheet1_ibflag',"U");
            }
            var tmpMsg="";
            if(formObj.creflag.value != "N" && formObj.rqst_no.value == ''){
                tmpMsg="CCD00035";
            }else{
                tmpMsg="COM130101";
            }
            if(ComShowConfirm(ComGetMsg(tmpMsg, "data"))){
                ComOpenWait(true);
                var sXml=sheetObj.GetSaveData("BCM_CCD_0011GS.do", FormQueryString(formObj) + "&" + ComGetSaveString(sheetObj));
                sheetObj.LoadSaveData(sXml);
                var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
                if(result != "F"){
                    if(formObj.creflag.value != "N" && formObj.rqst_no.value == ''){
                        ComShowCodeMessage("CCD00031");
                    } else {
                        ComShowCodeMessage("COM130102", "Data");
                    }
                }else{
                    ComShowCodeMessage("COM130103", "data");
                }
                var rqstNo=ComGetEtcData(sXml, "RQST_NO");
                if (rqstNo == "undefined"){
                    rqstNo="";
                }
                ComSetObjValue(formObj.rqst_no, rqstNo);
                doActionIBSheet(sheetObj,formObj,IBSEARCH);
            }
        }
        break;
    case SEARCH10: // MDM AUTH_TP_CD query
        var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=CMDT';
        var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
        // global var sestting
        G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
        G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
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
    case IBCLEAR:
        sheetObj.RemoveAll();
        formObj.reset();
        formObj.cmdt_cd.disabled=false;
        rep_cmdt_cd.text="";
//      formObj.grp_cmdt_cd.text = "";
        rep_imdg_lvl_cd.text="";
        formObj.rqst_no.value="";
        ComEnableObject(form.btns_search, true);
        ComBtnEnable("btn_Save"); 
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
                     if (formObj.cmdt_cd.value.length == 0){
                         ComShowCodeMessage("CCD00001", "Code");
                         formObj.cmdt_cd.focus();
                         return false;
                     }
                 }
                 break;
             case IBSAVE:  
                 if (formObj.cmdt_cd.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Code");
                     formObj.cmdt_cd.focus();
                     return false;
                 } else if (ComTrimAll(formObj.cmdt_nm.value).length == 0){
                     ComShowCodeMessage("CCD00001", "Name");
                     formObj.cmdt_nm.focus();
                     return false;
                 } else if (rep_cmdt_cd.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Rep Code");
                     formObj.rep_cmdt_cd.focus();
                     return false;
                 } 
//                 else if (formObj.grp_cmdt_cd.text.length == 0){
//                   ComShowCodeMessage("CCD00001", "Group Code");
//                   formObj.grp_cmdt_cd.focus();
//                   return false;
//                 }
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
    //axon_event.addListenerFormat('keypress', 'obj_keypress', formObj);
}
/**
* If the data field to be the change event
*/
function obj_change(){
    var formObj=document.form;
    var sheetObj=sheetObjects[0];
    try {
        var srcName=ComGetEvent("name");
        if(ComGetBtnDisable(srcName)) return false;
        switch(srcName) {
        case "cmdt_cd":
            if(formObj.cmdt_cd.value.length>0){
                doActionIBSheet(sheetObj, formObj, IBSEARCH);
            }
        break;
        case "delt_flg":
            if(formObj.delt_flg.value=='Y'){
                if(!ComShowConfirm(ComGetMsg("COM12165", "data"))){
                    formObj.delt_flg.value='N';
                }
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

function sheet1_OnSearchEnd(sheet1, ErrMsg){
    ComOpenWait(false);
    var formObj=document.form;
    if (sheet1.RowCount()> 0){
        formObj.cmdt_cd.value=sheet1.GetCellValue(1,'sheet1_cmdt_cd');
        formObj.cmdt_nm.value=sheet1.GetCellValue(1,'sheet1_cmdt_nm');
        rep_imdg_lvl_cd.SetSelectCode(sheet1.GetCellValue(1,'sheet1_rep_imdg_lvl_cd'));
        rep_cmdt_cd.SetSelectCode(sheet1.GetCellValue(1,'sheet1_rep_cmdt_cd'));
//          formObj.grp_cmdt_cd.Code      = sheet1.CellValue(1,'sheet1_grp_cmdt_cd');
        formObj.fmc_exp_flg.value=sheet1.GetCellValue(1,'sheet1_fmc_exp_flg');
        formObj.delt_flg.value=sheet1.GetCellValue(1,'sheet1_delt_flg');
        formObj.modi_cmdt_cd.value=sheet1.GetCellValue(1,'sheet1_modi_cmdt_cd');
        formObj.cre_usr_id.value=sheet1.GetCellValue(1,'sheet1_cre_usr_id');
        formObj.cre_dt.value=sheet1.GetCellValue(1,'sheet1_cre_dt');
        formObj.upd_usr_id.value=sheet1.GetCellValue(1,'sheet1_upd_usr_id');
        formObj.upd_dt.value=sheet1.GetCellValue(1,'sheet1_upd_dt');
        formObj.eu_xpt_flg.value=sheet1.GetCellValue(1,'sheet1_eu_xpt_flg');
    }
}

function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
    ComOpenWait(false);
}
