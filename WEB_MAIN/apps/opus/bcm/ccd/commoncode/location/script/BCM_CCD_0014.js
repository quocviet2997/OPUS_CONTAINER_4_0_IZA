/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   :BCM_CCD_0014.js
*@FileTitle  : Continent 
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
/** Event handler processing by button click event */
document.onclick=processButtonClick;
/** Event handler processing by button name */
function processButtonClick(){
    /*****Case more than two additional sheets tab sheet is used to specify a variable *****/
    var sheetObject1=sheetObjects[0];
     /*******************************************************/
    var formObject=document.form;
    try {
        var srcName=ComGetEvent("name");
        if(ComGetBtnDisable(srcName)) return false;
        switch(srcName) {
                case "btn_Retrieve":
                    doActionIBSheet(sheetObject1, formObject, IBSEARCH);
                    break;
                case "btn_New":
                    clearAllData(sheetObject1, formObject);
                    break;
                case "btn_Save":
                    doActionIBSheet(sheetObject1, formObject, IBSAVE);
                    break;
                case "btns_search1":
                    openContiCd();
                    //doActionIBSheet(sheetObject1, formObject, IBSEARCH);
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
 * registering IBSheet Object as list
 * adding process for list in case of needing batch processing with other items 
 * defining list on the top of source
 */
function setSheetObject(sheet_obj){
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
    for(i=0;i<sheetObjects.length;i++){
        ComConfigSheet (sheetObjects[i] );
        initSheet(sheetObjects[i],i+1);
        ComEndConfigSheet(sheetObjects[i]);
        }
    initControl();
    document.form.ibflag.value="I";
    //1. AUTH Search  
    doActionIBSheet(sheetObj, formObj, SEARCH01);
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
/**
 * Define an event control
 */
function initControl() {
    var formObj=document.form;
    //axon_event.addListenerForm('focus', 'obj_focus', formObj);
    //axon_event.addListenerForm('deactivate', 'obj_deactivate', formObj);
//  axon_event.addListenerFormat ('keypress', 'obj_keypress', form);
    //axon_event.addListenerForm  ('change', 'obj_change', form);
    //ComClearSeparator (document.form.conti_cd,"eng"); //English only can be entered
}
/**
 * Lane Code Help file open
 */
function openContiCd() {
    var formObj=document.form;
    var sUrl="/opuscntr/COM_ENS_0H1.do?conti_cd=" + formObj.conti_cd.value +"&main_page=false"+ "&mdm_yn=Y";
    var rVal=ComOpenPopup(sUrl, 680, 410, "contiCodeHelp", "0,0", true);
}
/**
 * sconti code Inquiry set to a value selected from the pop-up
 */
function contiCodeHelp(rowArray) {
    var formObj=document.form;
    var sheetObj=sheetObjects[0];
    var colArray=rowArray[0];   
    formObj.conti_cd.value=colArray[1];
    doActionIBSheet(sheetObj, formObj, IBSEARCH);
}
/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
 function initSheet(sheetObj,sheetNo) {
     var cnt=0;
    var sheetID=sheetObj.id;
     switch(sheetID) {
        case "sheet1":      //sheet1 init
         with(sheetObj){               
             var HeadTitle="";
             var headCount=ComCountHeadTitle(HeadTitle);
             (headCount, 0, 0, true);
             var prefix="sheet1_";
             SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
             var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
             var headers = [ { Text:HeadTitle, Align:"Center"} ];
             InitHeaders(headers, info);
             var cols = [ {Type:"Status",    Hidden:1,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                          {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"conti_cd", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                          {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"conti_nm", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                          {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"delt_flg",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                          {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_usr_id",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                          {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_dt",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                          {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_usr_id",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                          {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_dt",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }];              
             InitColumns(cols);
             SetEditable(0);
             SetWaitImageVisible(0);             
             SetVisible(false);
        }
        break;
     }
 }
//handling sheet process
 function doActionIBSheet(sheetObj,formObj,sAction) {
//       sheetObj.ShowDebugMsg = false;
//       sheetObj.WaitImageVisible = false;
     var prefix="sheet1_";
     switch(sAction) {
        case IBSEARCH:      //retrieve
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0014GS.do", sParam + "&" + ComGetPrefixParam("sheet1_"));
                var conti_nm=ComGetEtcData(sXml, "conti_nm");
                sheetObj.LoadSearchData(sXml,{Sync:1} );
                if(conti_nm == undefined){
                    formObj.conti_nm.value="";
                    formObj.delt_flg.value="N";
                    formObj.ibflag.value="I";
                }else{
                    formObj.conti_nm.value=conti_nm;
                    formObj.delt_flg.value=ComGetEtcData(sXml, "delt_flg");
                    formObj.ibflag.value="U";
                    formObj.conti_cd.readOnly=true;
                    formObj.conti_cd.disabled=true;
                    formObj.cre_usr_id.value = sheetObj.GetCellValue(1, "sheet1_cre_usr_id");
                    formObj.cre_dt.value = sheetObj.GetCellValue(1, "sheet1_cre_dt");
                    formObj.upd_usr_id.value = sheetObj.GetCellValue(1, "sheet1_upd_usr_id");
                    formObj.upd_dt.value = sheetObj.GetCellValue(1, "sheet1_upd_dt");
                }
            }
        break;
        case SEARCH01: // MDM AUTH_TP_CD query
            var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=MDAA';
            var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
            // global var sestting
            G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
            G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
            break;
        case IBSAVE:
            if(validateForm(sheetObj,formObj,sAction)){
                formObj.f_cmd.value=MULTI;
                var sParam=FormQueryString(formObj);
                if(ComShowCodeConfirm("COM130101", "Data")){
                    ComOpenWait(true);
                    var sXml=sheetObj.GetSaveData("BCM_CCD_0014GS.do", sParam);
                    sheetObj.LoadSaveData(sXml);
                    var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
                    if(result != "F"){
                        ComShowCodeMessage("COM130102", "Data");
                        doActionIBSheet(sheetObj, formObj, IBSEARCH);
                    }else{
                        ComShowCodeMessage("COM130103", "Data");
                    }
                }
            }
        break;
     }
 }
 /**
  * handling process for input validation
  */
 function validateForm(sheetObj,formObj,sAction){
    switch(sAction) {
        case IBSEARCH:      //retrieve
            if(formObj.conti_cd.value == ""){
                ComShowCodeMessage("CCD00001", "Continent Code");
                formObj.conti_cd.focus();
                return false;
            }
            break;
        case IBSAVE:        //save
            if(formObj.conti_cd.value == ""){
                ComShowCodeMessage("CCD00001", "Continent Code");
                formObj.conti_cd.focus();
                return false;
            }else if(formObj.conti_nm.value == ""){
                ComShowCodeMessage("CCD00001", "Continent Name");
                formObj.conti_nm.focus();
                return false;
            }
            break;
    }
     return true;
 }
 /**
  * If the data field to be the change event
  */
 function obj_change(){
    var formObject=document.form;
    /*****Case more than two additional sheets tab sheet is used to specify a variable *****/
    var sheetObject1=sheetObjects[0];
      /*******************************************************/
    try {
        var srcName=ComGetEvent("name");
          switch(srcName) {
            case "conti_cd":
                if(formObject.conti_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, IBSEARCH);
                    if((formObject.conti_nm.value == null) || (formObject.conti_nm.value == "")) {
                        if (G_MDAA_CHK == "Y") { 
                            if (ComShowCodeConfirm("COM130407", "Continent Code")) {
                                formObject.conti_nm.focus();
                            } else {
                                clearAllData(sheetObject1, formObject);
                            }
                        }   
                        else {
                            ComShowCodeMessage("COM130402", "Continent Code");
                            clearAllData(sheetObject1, formObject);
                        }   
                    }   
                }
            break;
            case "delt_flg":
                if(formObject.delt_flg.value == "Y") {
                    if(!ComShowCodeConfirm("COM130301", "data")) formObject.delt_flg.value="N";
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

function clearAllData(sheetObj, formObj){
    formObj.conti_cd.value="";
    formObj.conti_nm.value="";
    formObj.delt_flg.value="N";
    formObj.ibflag.value="I";
    formObj.conti_cd.disabled=false;
    formObj.conti_cd.readOnly=false;
    formObj.cre_usr_id.value="";
    formObj.cre_dt.value="";
    formObj.upd_usr_id.value="";
    formObj.upd_dt.value="";
}

function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) {
    ComOpenWait(false);
}

function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
    ComOpenWait(false);
}
