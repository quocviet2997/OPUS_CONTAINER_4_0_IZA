/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0001.js
*@FileTitle  :  Account
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/04
=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
               MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
               OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/** Common global variable */
var sheetObjects=new Array();
var sheetCnt=0;
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
        switch (srcName) {
        case "btn_Retrieve":
            doActionIBSheet(sheetObj, formObj, IBSEARCH);
            break;
        case "btn_Save":
            doActionIBSheet(sheetObj, formObj, IBSAVE);
            break;
        case "btn_New":
            newPage();
            break;
        case "btns_search":
            ComOpenPopup('/opuscntr/COM_ENS_N11.do?mdm_yn=' + formObj.mdm_yn.value, 700, 520, 'getAcct_cd', "1,0,1", true);
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
function getAcct_cd(rowArray) {
    var sheetObj=sheetObjects[0];
    var formObj=document.form;
    var colArray=rowArray[0];
    formObj.acct_cd.value=colArray[2];
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
    doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
    if (G_MDAA_CHK == "Y") {
        ComSetDisplay('btn_Retrieve', true);   
        ComSetDisplay('btn_New', true);   
        ComSetDisplay('btn_Save', true);   
    }   
    else {
        ComSetDisplay('btn_Save', false);   
        ComSetDisplay('btn_Retrieve', true);   
        ComSetDisplay('btn_New', true);   
    } 
    if(G_MDAA_CHK == "Y")
        ComEnableObject(formObj.delt_flg, true);
    else
        ComEnableObject(formObj.delt_flg, false);
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
 * new page is default Page 
 * newpage() is called by New Button  
 */
function newPage() {
    var formObj=document.form;
    var sheetObj=sheetObjects[0];
    sheetObj.RemoveAll();
    formObj.reset();
    formObj.acct_cd.disabled=false;
    acctg_mng_tp_cd.text="";
}
/**
 * All the combo box query
 */
function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
    switch (sAction) {
        case SEARCH01: // load page
            var sXml=sheetObj.GetSearchData("BCM_CCD_0001GS.do", "f_cmd=" + SEARCH01);
            var rtnValue=sXml.split("|$$|");
            for(var i=0; i<rtnValue.length; i++){
                var comboXml=ComXml2ComboString(rtnValue[i], "cd_desc", "cd");
                var cdName=comboXml[0].split("|");
                var cdValue=comboXml[1].split("|");
                for (var j=0; j < cdName.length; j++) {
                    comboObjects[i].InsertItem(j, cdName[j], cdValue[j]);
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
    case 1:
        with(sheetObj){
              SetSelectionMode(smSelectionList);
              var HeadTitle1="|ACCT_CD|ACCT_ENG_NM|ACCT_LOCL_NM|BUD_IF_FLG|BUD_USE_FLG|JNL_CRE_FLG|ACCTG_MNG_TP_CD|PND_TGT_FLG|ESTM_TGT_FLG|VVD_LVL_FLG1|VVD_LVL_FLG2|VVD_LVL_FLG3|VVD_LVL_FLG4|VVD_LVL_FLG5|VVD_LVL_FLG6|AUTO_CURR_XCH_RT_FLG|ENTR_EXPN_FLG|CRE_USR_ID|CRE_DT|UPD_USR_ID|UPD_DT|DELT_FLG|EAI_EVNT_DT|EAI_IF_ID|MODI_ACCT_CD";
              var headCount=ComCountHeadTitle(HeadTitle1);
              var prefix="sheet1_";
              SetConfig( { SearchMode:2, MergeSheet:5, Page:100, FrozenCol:0, DataGetRowMerge:1 } );
              var info={ Sort:0, ColMove:0, HeaderCheck:1, ColResize:0 };
              var headers=[ { Text:HeadTitle1, Align:"Center"} ];
              InitHeaders(headers, info);
              var cols=[ {Type:"Status",    Hidden:1,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"acct_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:1,   SaveName:prefix+"acct_eng_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	             {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:1,   SaveName:prefix+"acct_locl_nm",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"bud_if_flg",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"bud_use_flg",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"jnl_cre_flg",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"acctg_mng_tp_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"pnd_tgt_flg",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"estm_tgt_flg",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"vvd_lvl_flg1",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"vvd_lvl_flg2",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"vvd_lvl_flg3",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"vvd_lvl_flg4",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"vvd_lvl_flg5",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"vvd_lvl_flg6",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"auto_curr_xch_rt_flg", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"entr_expn_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_usr_id",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_dt",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_usr_id",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_dt",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"delt_flg",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"eai_evnt_dt",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"eai_if_id",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"modi_acct_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }
	             ];
	          InitColumns(cols);
	          SetSheetWidth(mainTable.clientWidth);
	          SetEditable(true);
	          SetVisible(false);
	
       }
    	break;
    }
}
// Sheet processing-related processes
function doActionIBSheet(sheetObj, formObj, sAction) {
    sheetObj.ShowDebugMsg(false);
    switch (sAction) {
    case IBSEARCH: // query
        if (validateForm(sheetObj, formObj, sAction)){
            formObj.f_cmd.value=SEARCH;
            ComOpenWait(true);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0001GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_"));
            sheetObj.LoadSearchData(sXml,{Sync:1} );
            formObj.acct_cd.disabled=true;
            if(sheetObj.RowCount()== 0){
                sheetObj.DataInsert(-1);
            }
        }
        break;
    case IBSAVE: // Save
        if(validateForm(sheetObj, formObj, sAction)){
            sheetObj.SetCellValue(1,'sheet1_acct_cd',formObj.acct_cd.value);
            sheetObj.SetCellValue(1,'sheet1_acctg_mng_tp_cd',acctg_mng_tp_cd.GetSelectCode());
            sheetObj.SetCellValue(1,'sheet1_acct_eng_nm',formObj.acct_eng_nm.value);
            sheetObj.SetCellValue(1,'sheet1_acct_locl_nm',formObj.acct_locl_nm.value);
            sheetObj.SetCellValue(1,'sheet1_bud_use_flg',formObj.bud_use_flg.value);
            sheetObj.SetCellValue(1,'sheet1_jnl_cre_flg',formObj.jnl_cre_flg.value);
            sheetObj.SetCellValue(1,'sheet1_pnd_tgt_flg',formObj.pnd_tgt_flg.value);
            sheetObj.SetCellValue(1,'sheet1_estm_tgt_flg',formObj.estm_tgt_flg.value);
            sheetObj.SetCellValue(1,'sheet1_vvd_lvl_flg1',formObj.vvd_lvl_flg1.value);
            sheetObj.SetCellValue(1,'sheet1_vvd_lvl_flg2',formObj.vvd_lvl_flg2.value);
            sheetObj.SetCellValue(1,'sheet1_vvd_lvl_flg3',formObj.vvd_lvl_flg3.value);
            sheetObj.SetCellValue(1,'sheet1_vvd_lvl_flg4',formObj.vvd_lvl_flg4.value);
            sheetObj.SetCellValue(1,'sheet1_vvd_lvl_flg5',formObj.vvd_lvl_flg5.value);
            sheetObj.SetCellValue(1,'sheet1_vvd_lvl_flg6',formObj.vvd_lvl_flg6.value);
            sheetObj.SetCellValue(1,'sheet1_auto_curr_xch_rt_flg',formObj.auto_curr_xch_rt_flg.value);
            sheetObj.SetCellValue(1,'sheet1_entr_expn_flg',formObj.entr_expn_flg.value);
            sheetObj.SetCellValue(1,'sheet1_bud_if_flg',formObj.bud_if_flg.value);
            sheetObj.SetCellValue(1,'sheet1_delt_flg',formObj.delt_flg.value);
            sheetObj.SetCellValue(1,'sheet1_modi_acct_cd',formObj.modi_acct_cd.value);

            formObj.f_cmd.value=MULTI;
            if(ComGetSaveString(sheetObj)==""){
                sheetObj.SetCellValue(1,'sheet1_ibflag',"U");
            }
            if(ComShowConfirm(ComGetMsg("COM130101", "data"))){
                ComOpenWait(true);
                var sXml=sheetObj.GetSaveData("BCM_CCD_0001GS.do", FormQueryString(formObj) + "&" + ComGetSaveString(sheetObj));
                sheetObj.LoadSaveData(sXml);
                var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
                if(result != "F"){
                    ComShowCodeMessage("COM130102", "Data");
                }else{
                    ComShowCodeMessage("COM130103", "data");
                }
            }
        }
        break;
    case SEARCH02: // MDM AUTH_TP_CD query
        var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=MDAA';
        var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
        // global var sestting
        G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
        G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
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
                 if (formObj.acct_cd.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Account Code");
                     formObj.acct_cd.focus();
                     return false;
                 }
                 break;
             case IBSAVE:  
                 if (formObj.acct_cd.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Account Code");
                     formObj.acct_cd.focus();
                     return false;
                 } else if (formObj.acct_eng_nm.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Account Name(ENG)");
                     formObj.acct_eng_nm.focus();
                     return false;
                 } else if (formObj.auto_curr_xch_rt_flg.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Auto Currency Exchange Rate Flag");
                     formObj.auto_curr_xch_rt_flg.focus();
                     return false;
                 } else if (ComGetLenByByte(formObj.acct_locl_nm.value) >100){
                     ComShowCodeMessage("COM12142", "Account Name(Local)","100 Bytes");
                     formObj.acct_locl_nm.focus();
                     return false;
                 }
                 break;
         }
     }
     return true;    
 }
function acct_cd_OnChange() {
    var sheetObj=sheetObjects[0];
    var formObj=document.form;
    if(formObj.acct_cd.value=="")	return;
    doActionIBSheet(sheetObj, formObj, IBSEARCH);
    if(sheetObj.RowCount("R") == 0) {
        if (G_MDAA_CHK == "Y") { 
            if (ComShowCodeConfirm("COM130407", "Account Code")) {
                acctg_mng_tp_cd.Focus();
                //acctg_mng_tp_cd.options[0].selected = true;
            } else {
                newPage();  
            }
        }   
        else {
            ComShowCodeMessage("COM130402", "Account Code");
            newPage();
        }   
    }       
}
/**
* If the data field to be the CHANGE Event
*/
function obj_change(){
    var formObj=document.form;
    var sheetObj=sheetObjects[0];
    try {
        var srcName=ComGetEvent("name");
        switch(srcName) {
        case "delt_flg" :
            if(formObj.delt_flg.value == "Y") {
                if(!ComShowCodeConfirm("COM130301", "data")) formObj.delt_flg.value="N";
            }
        break;
        case "acct_locl_nm" :
            var ret=ComGetLenByByte(formObj.acct_locl_nm.value);
            if(ret > 100) {
                ComShowCodeMessage("COM12142", "Account Name(Local)","100 Bytes");
                formObj.acct_locl_nm.focus();
                return false;
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
function initControl() {
    var formObj=document.form;
    //axon_event.addListenerForm('deactivate', 'obj_deactivate', formObj);
    //axon_event.addListenerForm('focus', 'obj_activate', formObj);
    axon_event.addListenerForm('change', 'obj_change', formObj);
    //axon_event.addListenerFormat('keypress', 'obj_keypress', formObj);
}

 function sheet1_OnSearchEnd(sheet1, ErrMsg){
     ComOpenWait(false);
     var formObj=document.form;
     if (sheet1.RowCount()> 0){
         formObj.acct_cd.value=sheet1.GetCellValue(1,'sheet1_acct_cd');
         acctg_mng_tp_cd.SetSelectCode(sheet1.GetCellValue(1,'sheet1_acctg_mng_tp_cd'));
         formObj.acct_eng_nm.value=sheet1.GetCellValue(1,'sheet1_acct_eng_nm');
         formObj.acct_locl_nm.value=sheet1.GetCellValue(1,'sheet1_acct_locl_nm');
         formObj.bud_use_flg.value=sheet1.GetCellValue(1,'sheet1_bud_use_flg');
         formObj.jnl_cre_flg.value=sheet1.GetCellValue(1,'sheet1_jnl_cre_flg');
         formObj.pnd_tgt_flg.value=sheet1.GetCellValue(1,'sheet1_pnd_tgt_flg');
         formObj.estm_tgt_flg.value=sheet1.GetCellValue(1,'sheet1_estm_tgt_flg');
         formObj.vvd_lvl_flg1.value=sheet1.GetCellValue(1,'sheet1_vvd_lvl_flg1');
         formObj.vvd_lvl_flg2.value=sheet1.GetCellValue(1,'sheet1_vvd_lvl_flg2');
         formObj.vvd_lvl_flg3.value=sheet1.GetCellValue(1,'sheet1_vvd_lvl_flg3');
         formObj.vvd_lvl_flg4.value=sheet1.GetCellValue(1,'sheet1_vvd_lvl_flg4');
         formObj.vvd_lvl_flg5.value=sheet1.GetCellValue(1,'sheet1_vvd_lvl_flg5');
         formObj.vvd_lvl_flg6.value=sheet1.GetCellValue(1,'sheet1_vvd_lvl_flg6');
         formObj.auto_curr_xch_rt_flg.value=sheet1.GetCellValue(1,'sheet1_auto_curr_xch_rt_flg');
         formObj.entr_expn_flg.value=sheet1.GetCellValue(1,'sheet1_entr_expn_flg');
         formObj.bud_if_flg.value=sheet1.GetCellValue(1,'sheet1_bud_if_flg');
         formObj.delt_flg.value=sheet1.GetCellValue(1,'sheet1_delt_flg');
         formObj.modi_acct_cd.value=sheet1.GetCellValue(1,'sheet1_modi_acct_cd');
         formObj.cre_usr_id.value=sheet1.GetCellValue(1,'sheet1_cre_usr_id');
         formObj.cre_dt.value=sheet1.GetCellValue(1,'sheet1_cre_dt');
         formObj.upd_usr_id.value=sheet1.GetCellValue(1,'sheet1_upd_usr_id');
         formObj.upd_dt.value=sheet1.GetCellValue(1,'sheet1_upd_dt');
    }
}

function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
    ComOpenWait(false);
}
