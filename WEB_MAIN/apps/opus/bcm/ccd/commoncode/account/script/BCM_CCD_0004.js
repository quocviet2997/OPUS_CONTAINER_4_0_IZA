/*=========================================================
*
** 1.0 Creation
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0004.js
*@FileTitle  :  Currency
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/03
=========================================================*/
/** Common global variable */
var sheetObjects=new Array();
var sheetCnt=0;
var saveRows=new Array();
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
            saveRows=new Array();
            doActionIBSheet(sheetObj, formObj, IBSEARCH);
            break;
        case "btn_Save":
            doActionIBSheet(sheetObj, formObj, IBSAVE);
            break;
        case "btn_New":
            newPage();
            break;
        case "btns_search1":
            var sUrl="/opuscntr/COM_ENS_N13.do?curr_cd=" + formObj.curr_cd.value +"&main_page=false"+"&mdm_yn="+ formObj.mdm_yn.value + "&delt_flg=" + formObj.delt_flg.value;
            var rVal=ComOpenPopup(sUrl, 700, 490, "getCurr_cd", "0,0", true);           
            break;
        case "btns_search2":
            ComOpenPopup('/opuscntr/COM_ENS_0M1.do', 770, 520, 'getCnt_cd', "1,0,1,1,1,1,1", true);
            break;
            //-----------------[Calendar button Start]------------------//      
            case "btns_fm_eff_dt":
            case "btns_to_eff_dt":
                var result=srcName.replace("btns_", "");
                var vCalObj=eval("formObj." + result );
                var vCal=new ComCalendar();
                vCal.setDisplayType('date');
                vCal.select(vCalObj, 'yyyy-MM-dd');
                break;
            //-----------------[Calendar button End]------------------//    
        } // end switch
    } catch (e) {
        if (e == "[object Error]") {
            ComShowMessage(OBJECT_ERROR);
        } else {
            ComShowMessage(e.message);
        }
    }
}
function getCurr_cd(rowArray) {
    var sheetObj=sheetObjects[0];
    var formObj=document.form;
    var colArray=rowArray[0];
    formObj.curr_cd.value=colArray[0];
    doActionIBSheet(sheetObj, formObj, IBSEARCH);
}
function getCnt_cd(rowArray) {
    var sheetObj=sheetObjects[0];
    var formObj=document.form;
    var colArray=rowArray[0];
    formObj.cnt_cd.value=colArray[3];
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
    var formObj=document.form;
    var sheetObj=sheetObjects[0];
    for (i=0; i < sheetObjects.length; i++) {
        ComConfigSheet(sheetObjects[i]);
        initSheet(sheetObjects[i], i + 1);
        ComEndConfigSheet(sheetObjects[i]);
    }
    initControl();
    //1. AUTH Search  
    doActionIBSheet(sheetObj, formObj, SEARCH03);
    //2. AUTH에 따른 버튼  Enable / Disable 처리 
    if (G_MDAA_CHK == "Y") {
        ComSetDisplay('btn_Retrieve', true);   
        ComSetDisplay('btn_New', true);   
        ComSetDisplay('btn_Save', true);   
    }   
    else {
        ComSetDisplay('btn_Retrieve', true);   
        ComSetDisplay('btn_New', true);   
        ComSetDisplay('btn_Save', false);   
    } 
    //3. AUTH에 따른 버튼 delt_flg Enable / Disable 처리 
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
    formObj.curr_cd.disabled=false;
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
              var HeadTitle1="|CURR_CD|CURR_NM|CURR_DESC|CNT_CD|FM_EFF_DT|TO_EFF_DT|DP_PRCS_KNT|XTD_PRCS_KNT|CRE_USR_ID|CRE_DT|UPD_USR_ID|UPD_DT|DELT_FLG|EAI_EVNT_DT|EAI_IF_ID";
              var headCount=ComCountHeadTitle(HeadTitle1);
              (headCount, 0, 0, false);
              var prefix="sheet1_";
        
              SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
        
              var info    = { Sort:0, ColMove:0, HeaderCheck:1, ColResize:0 };
              var headers = [ { Text:HeadTitle1, Align:"Center"} ];
              InitHeaders(headers, info);
        
              var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"curr_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"curr_nm",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"curr_desc",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cnt_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"fm_eff_dt",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"to_eff_dt",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"dp_prcs_knt",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"xtd_prcs_knt", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_usr_id",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_dt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_usr_id",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_dt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"delt_flg",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"eai_evnt_dt",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"eai_if_id",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];            
              InitColumns(cols);
              SetEditable(1);
              SetVisible(false);
              //SetSheetHeight(130);
            }
        break;
    }
}
// Sheet processing-related processes
function doActionIBSheet(sheetObj, formObj, sAction) {
//  sheetObj.ShowDebugMsg(false);
    switch (sAction) {
    case IBSEARCH: // retrieve
        if (validateForm(sheetObj, formObj, sAction)){
            formObj.f_cmd.value=SEARCH;
            //sheetObj.RenderSheet(0);
            ComOpenWait(true);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0004GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_"));
            sheetObj.LoadSearchData(sXml,{Sync:1} );
            //sheetObj.RenderSheet(1);
            formObj.curr_cd.disabled=true;
            if(sheetObj.RowCount()== 0){
                sheetObj.DataInsert(-1);
            }
        }
        break;
    case SEARCH02: // Country Code checking
        if (validateForm(sheetObj, formObj, sAction)){
            formObj.f_cmd.value=SEARCH02;
            ComOpenWait(true);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0004GS.do", FormQueryString(formObj));
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Country Code");
                formObj.cnt_cd.value="";
                formObj.cnt_cd.focus();
            }
            ComOpenWait(false);
        }
        break;
    case SEARCH03: // MDM AUTH_TP_CD query
        var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=MDAA';
        var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
        // global var sestting
        G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
        G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
        break;
    case IBSAVE: // Save
        if(validateForm(sheetObj, formObj, sAction)){
            sheetObj.SetCellValue(1, 'sheet1_curr_cd',formObj.curr_cd.value);
            sheetObj.SetCellValue(1, 'sheet1_curr_nm',formObj.curr_nm.value);
            sheetObj.SetCellValue(1, 'sheet1_curr_desc',formObj.curr_desc.value);
            sheetObj.SetCellValue(1, 'sheet1_cnt_cd',formObj.cnt_cd.value);
            sheetObj.SetCellValue(1, 'sheet1_fm_eff_dt',formObj.fm_eff_dt.value);
            sheetObj.SetCellValue(1, 'sheet1_to_eff_dt',formObj.to_eff_dt.value);
            sheetObj.SetCellValue(1, 'sheet1_dp_prcs_knt',formObj.dp_prcs_knt.value);
            sheetObj.SetCellValue(1, 'sheet1_xtd_prcs_knt',formObj.xtd_prcs_knt.value);
            sheetObj.SetCellValue(1, 'sheet1_delt_flg',formObj.delt_flg.value);
            formObj.f_cmd.value=MULTI;
            if(ComGetSaveString(sheetObj)==""){
                sheetObj.SetCellValue(1,'sheet1_ibflag',"U");
            }
            if(ComShowConfirm(ComGetMsg("COM130101", "data"))){
                ComOpenWait(true);
                var sXml=sheetObj.GetSaveData("BCM_CCD_0004GS.do", FormQueryString(formObj) + "&" + ComGetSaveString(sheetObj));
                ComOpenWait(false);
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
    }
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
     with(formObj){
         switch ( sAction ) {
             case IBSEARCH:
                 if (formObj.curr_cd.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Currency Code");
                     formObj.curr_cd.focus();
                     return false;
                 }
                 break;
             case IBSAVE:  
                 if (formObj.curr_cd.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Currency Code");
                     formObj.curr_cd.focus();
                     return false;
                 } else if (formObj.curr_nm.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Currency Name");
                     formObj.curr_nm.focus();
                     return false;
                 } else if (!checkDate(formObj.fm_eff_dt.value.trimAll("-"), formObj.to_eff_dt.value.trimAll("-"))) {
                     ComShowCodeMessage("COM12133", "Expire Date", "Effective Date", "greater");
                     formObj.to_eff_dt.focus();
                     return false;
                 }
                 break;
         }
     }
     return true;    
 }
function checkDate(stDate, endDate) {
      if(parseInt(stDate) > parseInt(endDate)) {
          return false;
      } else {
          return true;
      }
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
    var formObj=document.form;
    var sheetObj=sheetObjects[0];
    try {
        var srcName=ComGetEvent("name");
        switch(srcName) {
            case "curr_cd":
                if(formObj.curr_cd.value.length>0){                 
                    doActionIBSheet(sheetObj, formObj, IBSEARCH);                   
                    if(sheetObj.RowCount("R") == 0) {
                        if (G_MDAA_CHK == "Y") { 
                            if (ComShowCodeConfirm("COM130407", "Currency Code")) {
                                formObj.curr_nm.focus();
                            } else {
                                newPage();  
                            }
                        }   
                        else {
                            ComShowCodeMessage("COM130402", "Currency Code");
                            newPage();
                        }   
                    }   
                }
            break;
            case "cnt_cd":
                if(formObj.cnt_cd.value.length>0){
                    doActionIBSheet(sheetObj, formObj, SEARCH02);
                }
            break;
            case "delt_flg" :
                if(formObj.delt_flg.value == "Y") {
                    if(!ComShowCodeConfirm("COM130301", "data")) formObj.delt_flg.value="N";
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
 *HTML Control loses the focus to handle events that occur.
 */
function obj_deactivate() {
    var formObj=document.form;
    var obj=ComGetEvent();
    if(obj.dataformat == 'ymd'){
        ComChkObjValid(obj);
    }
return true;
}
 function sheet1_OnSearchEnd(sheet1, ErrMsg){
    ComOpenWait(false);
    var formObj=document.form;
    if (sheet1.RowCount()> 0){
        formObj.curr_cd.value=sheet1.GetCellValue(1, 'sheet1_curr_cd');
        formObj.curr_nm.value=sheet1.GetCellValue(1, 'sheet1_curr_nm');
        formObj.curr_desc.value=sheet1.GetCellValue(1, 'sheet1_curr_desc');
        formObj.cnt_cd.value=sheet1.GetCellValue(1, 'sheet1_cnt_cd');
        formObj.fm_eff_dt.value=sheet1.GetCellValue(1, 'sheet1_fm_eff_dt');
        formObj.to_eff_dt.value=sheet1.GetCellValue(1, 'sheet1_to_eff_dt');
        formObj.dp_prcs_knt.value=sheet1.GetCellValue(1, 'sheet1_dp_prcs_knt');
        formObj.xtd_prcs_knt.value=sheet1.GetCellValue(1, 'sheet1_xtd_prcs_knt');
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
