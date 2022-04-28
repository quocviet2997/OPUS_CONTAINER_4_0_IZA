/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0016.jsp
*@FileTitle  : country
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/29
=========================================================*/
/** Common global variable */
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
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
                    openScontiCd();
                    break;
                case "btns_search2":
                    openCurrCd();
                    break;
                case "btns_search3":
                    openCntCd();
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
    for(i=0;i<sheetObjects.length;i++){
        ComConfigSheet (sheetObjects[i] );
        initSheet(sheetObjects[i],i+1);
        ComEndConfigSheet(sheetObjects[i]);
        }
    for(var k=0;k<comboObjects.length;k++){
        initCombo(comboObjects[k],k+1);
    }
    initControl();
    document.form.ibflag.value="I";
    var formObj=document.form;
    // auth_tp_cd retrieve
    doActionIBSheet(sheetObjects[0], formObj, SEARCH01);
    if(G_MDAA_CHK == 'Y') {
        ComEnableObject(formObj.delt_flg, true);
        ComSetDisplay('btn_Save', true);
    } else {
        ComEnableObject(formObj.delt_flg, false);
        ComSetDisplay('btn_Save', false);
    }
 }
 /**
  * Define an event control
  */
 function initControl() {
    var formObj=document.form;
    //axon_event.addListenerForm('focus', 'obj_focus', formObj);
    //axon_event.addListenerFormat ('keypress', 'obj_keypress', form);
    //axon_event.addListenerForm  ('change', 'obj_change', form);
    //ComClearSeparator (document.form.cnt_cd,"eng"); //English Only
    //ComClearSeparator (document.form.sconti_cd,"eng"); //English Only
    //ComClearSeparator (document.form.curr_cd,"eng"); //English Only
    //ComClearSeparator (document.form.cnt_iso_cd,"eng"); //English Only
 }
 /**
  * registering IBCombo Object as list
  * adding process for list in case of needing batch processing with other items 
  * defining list on the top of source
  */
  function initCombo(comboObj, comboNo) {
    var formObject=document.form;
    switch(comboObj.id) {  
    }
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
                 var prefix="sheet1_";
             
    
                 SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
    
                 var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                 var headers = [ { Text:HeadTitle, Align:"Center"} ];
                 InitHeaders(headers, info);
    
                 var cols = [ {Type:"",    Hidden:1, Width:30,   Align:"",  ColMerge:0,   SaveName:"",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 } ];
                  
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
      var prefix="sheet1_";
      switch(sAction) {
        case IBSEARCH:      //Retrieve
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0016GS.do", sParam);
                sheetObj.LoadSearchData(sXml,{Sync:1} );
                var cnt_nm="";
                
                if(sheetObj.RowCount()== 0){
                    cnt_nm = "";
                } else {
                    cnt_nm = getValueForCombo(ComXmlString(sXml, "cnt_nm"));
                }
                  
                if(cnt_nm == ""){
                    // showing message when data not exists
                    if (G_MDAA_CHK == "Y") {
                        if (ComShowCodeConfirm("COM130407", "Country Code")) {
                            formObj.cnt_nm.value="";
                            formObj.sconti_cd.value="";
                            formObj.curr_cd.value="";
                            formObj.cnt_iso_cd.value="";
                            formObj.delt_flg.value="N";
                            formObj.ibflag.value="I";
                            formObj.cnt_cd.readOnly=true;
                            formObj.cnt_nm.focus();
                        } else {
                            clearAllData(sheetObjects[0], formObj);
                        }
                    } else {
                        ComShowCodeMessage("COM130402", "Country Code");
                        clearAllData(sheetObjects[0], formObj);
                    }
                    return;
                }else{
                    formObj.cnt_nm.value=cnt_nm;
                    formObj.sconti_cd.value=getValueForCombo(ComXmlString(sXml, "sconti_cd"));
                    formObj.curr_cd.value=getValueForCombo(ComXmlString(sXml, "curr_cd"));
                    formObj.cnt_iso_cd.value=getValueForCombo(ComXmlString(sXml, "cnt_iso_cd"));
                    formObj.delt_flg.value=getValueForCombo(ComXmlString(sXml, "delt_flg"));
                    formObj.cre_usr_id.value=getValueForCombo(ComXmlString(sXml, "cre_usr_id"));
                    formObj.cre_dt.value=getValueForCombo(ComXmlString(sXml, "cre_dt"));
                    formObj.upd_usr_id.value=getValueForCombo(ComXmlString(sXml, "upd_usr_id"));
                    formObj.upd_dt.value=getValueForCombo(ComXmlString(sXml, "upd_dt"));
                    formObj.eu_cnt_flg.value=getValueForCombo(ComXmlString(sXml, "eu_cnt_flg"));
                    formObj.cnt_flg.value = ComXmlString(sXml, "cnt_flg");
                    formObj.ibflag.value="U";
                    formObj.cnt_cd.readOnly=true;
                }
            }
        break;
        case IBSAVE:
            if(validateForm(sheetObj,formObj,sAction)){
                formObj.f_cmd.value=MULTI;
                var sParam=FormQueryString(formObj);
                if(ComShowCodeConfirm("COM130101", "Data")){
                    ComOpenWait(true);
                    var sXml=sheetObj.GetSaveData("BCM_CCD_0016GS.do", sParam + "&" + ComGetPrefixParam("sheet1_"));
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
        case SEARCH01: // MDM AUTH_TP_CD query
            var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=MDAA';
            var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
            // global var setting
            G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
            G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
        break;
        case SEARCH02:      //Sub Continent check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH02;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0016GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Sub Continent Code");
                formObj.sconti_cd.value="";
                formObj.sconti_cd.focus();
            }
            ComOpenWait(false);
        }
        break;
        case SEARCH03:      //curr code check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH03;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0016GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Currency Code");
                formObj.curr_cd.value="";
                formObj.curr_cd.focus();
            }
            ComOpenWait(false);
        }
        break;
      }
  }
  /**
   * handling process for input validation
   */
  function validateForm(sheetObj,formObj,sAction){
    switch(sAction) {
        case IBSEARCH:      //Retrieve
            if(formObj.cnt_cd.value == ""){
                ComShowCodeMessage("CCD00001", "Country Code");
                formObj.cnt_cd.focus();
                return false;
            }
            break;
        case IBSAVE:        //Save
            if(formObj.cnt_cd.value == ""){
                ComShowCodeMessage("CCD00001", "Country Code");
                formObj.cnt_cd.focus();
                return false;
            }else if(formObj.cnt_nm.value == ""){
                ComShowCodeMessage("CCD00001", "Country Name");
                formObj.cnt_nm.focus();
                return false;
            }else if(formObj.sconti_cd.value == ""){
                ComShowCodeMessage("CCD00001", "Sub Continent Code");
                formObj.sconti_cd.focus();
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
            case "cnt_cd":
                if(formObject.cnt_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, IBSEARCH);
                }
            break;
            case "sconti_cd":
                if(formObject.sconti_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH02);
                }
            break;
            case "curr_cd":
                if(formObject.curr_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH03);
                }
            break;
            case "delt_flg":
                if(formObject.delt_flg.value == "Y") {
                	if (formObject.cnt_flg.value == "Y") {
                    	ComShowCodeMessage("CCD00077");
                    	formObject.delt_flg.value = "N";
                    	break;
                    }
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
        formObj.cnt_cd.value="";
        formObj.cnt_nm.value="";
        formObj.sconti_cd.value="";
        formObj.curr_cd.value="";
        formObj.cnt_iso_cd.value="";
        formObj.delt_flg.value="N";
        formObj.ibflag.value="I";
        formObj.cnt_cd.readOnly=false;
        formObj.cre_usr_id.value="";
        formObj.cre_dt.value="";
        formObj.upd_usr_id.value="";
        formObj.upd_dt.value="";
    }
     /**
      * Lane Code Help file open
      */
     function openScontiCd() {
        var formObj=document.form;
        var sUrl="/opuscntr/COM_ENS_0I1.do?sconti_cd=" + formObj.sconti_cd.value +"&main_page=false";
        var rVal=ComOpenPopup(sUrl, 700, 410, "scontiCodeHelp", "0,0", true);
     }
     function openCurrCd() {
        var formObj=document.form;
        var sUrl="/opuscntr/COM_ENS_N13.do?curr_cd=" + formObj.curr_cd.value +"&main_page=false";
        var rVal=ComOpenPopup(sUrl, 700, 500, "currCodeHelp", "0,0", true);
     }
     function openCntCd() {
        var formObj=document.form;
        var sUrl="/opuscntr/COM_ENS_0M1.do?cnt_cd=" + formObj.cnt_cd.value +"&main_page=false&mdm_yn=" + formObj.mdm_yn.value;
        var rVal=ComOpenPopup(sUrl, 850, 530, "cntCodeHelp", "0,0", true);
      }
     /**
     * sconti code Inquiry of selected values ??from the pop-up Setting.
     */
    function scontiCodeHelp(rowArray) {
        var formObj=document.form;
        var colArray=rowArray[0];               
        formObj.sconti_cd.value=colArray[1];
    }
     /**
     * curr code Inquiry of selected values ??from the pop-up Setting.
     */
    function currCodeHelp(rowArray) {
        var formObj=document.form;
        var colArray=rowArray[0];           
        formObj.curr_cd.value=colArray[0];
    }
    /**
     * cnt code Inquiry of selected values ??from the pop-up Setting.
     */
    function cntCodeHelp(rowArray) {
        var formObj=document.form;
        var colArray=rowArray[0];           
        formObj.cnt_cd.value=colArray[1];
        doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
    }
    function getValueForCombo(obj) {
      if (Object.prototype.toString.call(obj) == '[object Array]') {
          var str = obj[0];
          if(str ==null || str == "") return "";
          return str.split('|')[0];
      }
      return obj;
  }   

function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) {
    ComOpenWait(false);
}

function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
    ComOpenWait(false);
}
