/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0010.js
*@FileTitle  : Representative Commodity
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
            newPage(); 
            break;
        case "btns_search": // Rep Commodity Code pop-up
            var v1=formObj.mdm_yn.value;
            var classId="COM_ENS_0K1";
            var param='?mdm_yn='+v1+'&classId='+classId;
            ComOpenPopup('/opuscntr/COM_ENS_0K1.do'+param, 700, 400, 'getRep_cmdt_cd', "1,0,1", true);
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
function getRep_cmdt_cd(rowArray) {
    var sheetObj=sheetObjects[0];
    var formObj=document.form;
    var colArray=rowArray[0];
    formObj.rep_cmdt_cd.value=colArray[3];
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
    //1. AUTH Search  
    doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
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
    //doActionIBCombo(sheetObjects[0], formObj, SEARCH01);
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
    formObj.rep_cmdt_cd.disabled=false;
//  formObj.grp_cmdt_cd.text = "";
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
            var sXml=sheetObj.GetSearchData("BCM_CCD_0010GS.do", "f_cmd=" + SEARCH01);
            var rtnValue=sXml.split("|$$|");
            if(rtnValue!=null && rtnValue.length>0){
                for(var i=0; i<rtnValue.length; i++){
                    var comboXml=ComXml2ComboString(rtnValue[i], "cd_desc", "cd");
                    alert(comboXml);
                    if(comboXml!=null){
                        var cdName=comboXml[0].split("|");
                        var cdValue=comboXml[1].split("|");
                        for (var j=0; j < cdName.length; j++) {
                            comboObjects[i].InsertItem(j, cdName[j], cdValue[j]);
                        }
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
              var HeadTitle1="|REP_CMDT_CD|REP_CMDT_NM|DELT_FLG";
              var headCount=ComCountHeadTitle(HeadTitle1);
              (headCount, 0, 0, false);
              var prefix="sheet1_";
              SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
              var info    = { Sort:0, ColMove:0, HeaderCheck:1, ColResize:0 };
              var headers = [ { Text:HeadTitle1, Align:"Center"} ];
              InitHeaders(headers, info);
              var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"rep_cmdt_cd", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"rep_cmdt_nm", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"delt_flg",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_usr_id",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_dt",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_usr_id",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_dt",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }];
               
              InitColumns(cols);
              SetEditable(1);
              SetSelectionMode(smSelectionList);              
              //SetSheetHeight(150);
              SetVisible(false);
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
            formObj.f_cmd.value=SEARCH;
            //sheetObj.RenderSheet(0);
            ComOpenWait(true);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0010GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_"));
            sheetObj.LoadSearchData(sXml,{Sync:1} );
            //sheetObj.RenderSheet(1);
            formObj.rep_cmdt_cd.disabled=true;
            if(sheetObj.RowCount()== 0){ //Update mode, if data exists
                sheetObj.DataInsert(-1);
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
    case IBSAVE: // Save
        if(validateForm(sheetObj, formObj, sAction)){
            sheetObj.SetCellValue(1,'sheet1_rep_cmdt_cd',formObj.rep_cmdt_cd.value);
            sheetObj.SetCellValue(1,'sheet1_rep_cmdt_nm',formObj.rep_cmdt_nm.value);
//          sheetObj.CellValue(1,'sheet1_grp_cmdt_cd')     = formObj.grp_cmdt_cd.Code;
            sheetObj.SetCellValue(1,'sheet1_delt_flg',formObj.delt_flg.value);
            formObj.f_cmd.value=MULTI;
            if(ComGetSaveString(sheetObj)==""){
                sheetObj.SetCellValue(1,'sheet1_ibflag',"U");
            }
            if(ComShowConfirm(ComGetMsg("COM130101", "data"))){
                ComOpenWait(true);
                var sXml=sheetObj.GetSaveData("BCM_CCD_0010GS.do", FormQueryString(formObj) + "&" + ComGetSaveString(sheetObj));
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
                 if (formObj.rep_cmdt_cd.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Rep Commodity Code");
                     formObj.rep_cmdt_cd.focus();
                     return false;
                 }
                 break;
             case IBSAVE:  
                 if (formObj.rep_cmdt_cd.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Rep Commodity Code");
                     formObj.rep_cmdt_cd.focus();
                     return false;
                 } else if (formObj.rep_cmdt_nm.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Name");
                     formObj.rep_cmdt_nm.focus();
                     return false;
                 } 
//                 else if (formObj.grp_cmdt_cd.text.length == 0){
//                   ComShowCodeMessage("CCD00001", "Group Commodity Code");
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
        switch(srcName) {
        case "rep_cmdt_cd":
            if(formObj.rep_cmdt_cd.value.length>0){
                doActionIBSheet(sheetObj, formObj, IBSEARCH);
                if(sheetObj.RowCount("R") == 0) {
                    if (G_MDAA_CHK == "Y") {
                        if (ComShowCodeConfirm("COM130407", "Rep Commodity Code")) {
                            formObj.rep_cmdt_nm.focus();
                        } else {
                            newPage();  
                        }
                    }
                    else {
                        ComShowCodeMessage("COM130402", "Rep Commodity Code");
                        newPage();
                    }
                }   
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
        formObj.rep_cmdt_cd.value=sheet1.GetCellValue(1,'sheet1_rep_cmdt_cd');
        formObj.rep_cmdt_nm.value=sheet1.GetCellValue(1,'sheet1_rep_cmdt_nm');
//          formObj.grp_cmdt_cd.Code  = sheet1.CellValue(1,'sheet1_grp_cmdt_cd');
        formObj.delt_flg.value=sheet1.GetCellValue(1,'sheet1_delt_flg');
        formObj.cre_usr_id.value=sheet1.GetCellValue(1,'sheet1_cre_usr_id');
        formObj.cre_dt.value=sheet1.GetCellValue(1,'sheet1_cre_dt');
        formObj.upd_usr_id.value=sheet1.GetCellValue(1,'sheet1_upd_usr_id');
        formObj.upd_dt.value=sheet1.GetCellValue(1,'sheet1_upd_dt');
    }
}

function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
    ComOpenWait(false);
}
