/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0012.js
*@FileTitle  : Customs Package Type Creation
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/03
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
            newPage();
            break;
        case "btns_search": // Customs Country 팝업
            ComOpenPopup('/opuscntr/COM_ENS_0M1.do', 780, 510, 'getCnt_cd', "1,0,1", true);
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
function getCnt_cd(rowArray) {
    var sheetObj=sheetObjects[0];
    var formObj=document.form;
    var colArray=rowArray[0];
    formObj.cstms_cnt_cd.value=colArray[3];
    if(formObj.pck_cd.value.length>0 && formObj.cstms_cnt_cd.value.length>0){
           doActionIBSheet(sheetObj, formObj, IBSEARCH);
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
    doActionIBSheet(sheetObjects[0], formObj, SEARCH03);
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
    pck_cd.SetEnable(1);
    pck_cd.text="";
    formObj.cstms_cnt_cd.disabled=false;
}
/**
* All the combo box query
*/
function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
    switch (sAction) {
        case SEARCH01: // load page 시
            var sXml=sheetObj.GetSearchData("BCM_CCD_0012GS.do", "f_cmd=" + SEARCH01);
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
    case 1: // sheet1 init
        with(sheetObj){    
              var HeadTitle1="|PCK_CD|CSTMS_CNT_CD|PCK_CSTMS_CD|DELT_FLG";
              var headCount=ComCountHeadTitle(HeadTitle1);
              (headCount, 0, 0, false);
              var prefix="sheet1_";
              SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
              var info    = { Sort:0, ColMove:0, HeaderCheck:1, ColResize:0 };
              var headers = [ { Text:HeadTitle1, Align:"Center"} ];
              InitHeaders(headers, info);
        
              var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"pck_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cstms_cnt_cd", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"pck_cstms_cd", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"delt_flg",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
               
              InitColumns(cols);
              SetEditable(1);
              SetVisible(false);
//            SetSheetHeight(150);
              SetSelectionMode(smSelectionList);
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
            //sheetObj.RenderSheet(0);
            ComOpenWait(true);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0012GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_"));
            sheetObj.LoadSearchData(sXml,{Sync:1} );
            //sheetObj.RenderSheet(1);
            pck_cd.SetEnable(0);
            formObj.cstms_cnt_cd.disabled=true;
            if(sheetObj.RowCount()== 0){
                sheetObj.DataInsert(-1);
            }
        }
        break;
    case SEARCH02: // Country Code checking
        if (validateForm(sheetObj, formObj, sAction)){
            formObj.f_cmd.value=SEARCH02;
            ComOpenWait(true);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0012GS.do", FormQueryString(formObj));
            var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Customs Country");
                    formObj.cstms_cnt_cd.value="";
                    formObj.cstms_cnt_cd.focus();
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
            sheetObj.SetCellValue(1,'sheet1_pck_cd',pck_cd.GetSelectCode());
            sheetObj.SetCellValue(1,'sheet1_cstms_cnt_cd',formObj.cstms_cnt_cd.value);
            sheetObj.SetCellValue(1,'sheet1_pck_cstms_cd',formObj.pck_cstms_cd.value);
            sheetObj.SetCellValue(1,'sheet1_delt_flg',formObj.delt_flg.value);
            formObj.f_cmd.value=MULTI;
            if(ComGetSaveString(sheetObj)==""){
                sheetObj.SetCellValue(1,'sheet1_ibflag',"U");
            }
            if(ComShowConfirm(ComGetMsg("COM130101", "data"))){
                ComOpenWait(true);
                var sXml=sheetObj.GetSaveData("BCM_CCD_0012GS.do", FormQueryString(formObj) + "&" + ComGetSaveString(sheetObj));
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
                 if (pck_cd.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Package Type");
                     pck_cd.focus();
                     return false;
                 } else if (formObj.cstms_cnt_cd.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Customs Country");
                     formObj.cstms_cnt_cd.focus();
                     return false;
                 }
                 break;
             case IBSAVE:  
                 if (pck_cd.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Package Type");
                     pck_cd.focus();
                     return false;
                 } else if (formObj.cstms_cnt_cd.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Customs Country");
                     formObj.cstms_cnt_cd.focus();
                     return false;
                 } else if (formObj.pck_cstms_cd.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Package Customs");
                     formObj.pck_cstms_cd.focus();
                     return false;
                 }
                 break;
             case SEARCH02:  
                 if(formObj.cstms_cnt_cd.value.length==0){
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
    //axon_event.addListenerFormat('keypress', 'obj_keypress', formObj);
}

function obj_change(){
    var formObj=document.form;
    var sheetObj=sheetObjects[0];
    try {
        var srcName=ComGetEvent("name");
        if(ComGetBtnDisable(srcName)) return false;
        switch(srcName) {
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

function pck_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
    var formObj=document.form;
    var sheetObj=sheetObjects[0];
    if(pck_cd.GetSelectText().length>0 && formObj.cstms_cnt_cd.value.length>0){
        doActionIBSheet(sheetObj, formObj, IBSEARCH);
    }
}
/**
* If the data field to be the CHANGE Event
*/
function cstms_cnt_cd_OnChange() {
    var sheetObj=sheetObjects[0];
    var formObj=document.form;
    doActionIBSheet(sheetObj, formObj, SEARCH02);
    if(pck_cd.GetSelectText().length>0 && formObj.cstms_cnt_cd.value.length>0){
       doActionIBSheet(sheetObj, formObj, IBSEARCH);
    }
}
function sheet1_OnSearchEnd(sheet1, ErrMsg){
    ComOpenWait(false);
    var formObj=document.form;
    if (sheet1.RowCount()> 0){
        pck_cd.SetSelectCode(sheet1.GetCellValue(1,'sheet1_pck_cd'));
        formObj.cstms_cnt_cd.value=sheet1.GetCellValue(1,'sheet1_cstms_cnt_cd');
        formObj.pck_cstms_cd.value=sheet1.GetCellValue(1,'sheet1_pck_cstms_cd');
        formObj.delt_flg.value=sheet1.GetCellValue(1,'sheet1_delt_flg');
    }
}

function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
    ComOpenWait(false);
}
