/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0019.js
*@FileTitle  : Location 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/10
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
        if(ComGetBtnDisable(srcName)) return false;
        switch(srcName) {
            case "btn_Retrieve":
                doActionIBSheet(sheetObject1, formObject, IBSEARCH);
                break;
            case "btn_New":
                doActionIBSheet(sheetObject1, formObject, IBCLEAR);
                break;
            case "btn_Save":
                doActionIBSheet(sheetObject1, formObject, IBSAVE);
                break;
            case "btn_Close":
                ComClosePopup(); 
                break;
            case "btn_Request":
                doActionIBSheet(sheetObjects[0], document.form, MULTI03); 
                break;
            case "btns_search1":
                if(ComGetEvent().style.cursor == "default") return;
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_051.do?loc_cd=" + formObj.loc_cd.value +"&main_page=false&mdm_yn="+formObj.mdm_yn.value;
                var rVal=ComOpenPopup(sUrl, 870, 460, "locCodeHelp", "0,0", true);
                break;
            case "btns_search2":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0I1.do?sconti_cd=" + formObj.sconti_cd.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 650, 380, "scontiCodeHelp", "0,0", true);
                break;
            case "btns_search3":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0M1.do?cnt_cd=" + formObj.cnt_cd.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 770, 520, "cntCodeHelp", "0,0", true);
                break;
            case "btns_search4":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0J1.do?rgn_cd=" + formObj.rgn_cd.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 650, 430, "rgnCodeHelp", "0,0", true);
                break;
            case "btns_search5"://approval route management
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0X1.do?ste_cd=" + formObj.ste_cd.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 650, 460, "steCodeHelp", "0,0,1,1,1", true);
                break;
            case "btns_search6":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_051.do?scc_cd=" + formObj.scc_cd.value +"&main_page=false&scc_flg=Y";
                var rVal=ComOpenPopup(sUrl, 750, 460, "sccCodeHelp", "0,0", true);
                break;
            case "btns_search7":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_061.do?node_cd=" + formObj.rep_zn_cd.value +"&main_page=&mode=zone&mode_only=Y";
                var rVal=ComOpenPopup(sUrl, 780, 530, "zoneCodeHelp", "0,0", true);                
                break;
            case "btns_search8":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_071.do?ofc_cd=" + formObj.sls_ofc_cd.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 650, 620, "slsOfcCodeHelp", "0,0", true);
                break;
            case "btns_search9":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_071.do?ofc_cd=" + formObj.eq_ctrl_ofc_cd.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 650, 620, "eqCtrlOfcCodeHelp", "0,0", true);
                break;
            case "btns_search10":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_071.do?ofc_cd=" + formObj.finc_ctrl_ofc_cd.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 650, 620, "fincCtrlOfcCodeHelp", "0,0", true);
                break;
            case "btns_search11":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_061.do?node_cd=" + formObj.mty_pkup_yd_cd.value +"&main_page=&mode=yard&mode_only=Y";
                var rVal=ComOpenPopup(sUrl, 800, 530, "mtyPkupYdCodeHelp", "0,0", true);
                break;
            case "btns_search12":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_061.do?node_cd=" + formObj.eq_rtn_yd_cd.value +"&main_page=&mode=yard&mode_only=Y";
                var rVal=ComOpenPopup(sUrl, 800, 530, "eqRtnYdCodeHelp", "0,0", true);
                break;
            case "btns_search13":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_051.do?loc_cd=" + formObj.hub_loc_cd.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 800, 460, "hubLocCodeHelp", "0,0", true);
                break;
            case "btns_set_country":
                var formObj=document.form;
                if(!ComIsNull(formObj.rgn_cd.value)) {
                    doActionIBSheet(sheetObject1, formObject, SEARCH14);
                }else {
                    ComShowCodeMessage("CCD00025");
                    formObject.rgn_cd.focus();
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
    document.form.edi_if_flg.value = "N";
    doActionIBCombo(sheetObjects[0], document.form, SEARCH01);
    var formObj=document.form;
    // auth_tp_cd retrieve
    doActionIBSheet(sheetObjects[0], formObj, SEARCH20);
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
        ComEnableObject(formObj.btns_search1, false);
        // Process Type is 'Reject' and AuthType is not 'Approval'(possible modifications and ReOpen)
        if(procTpCd == 'R' &&  ( ((authTpCd == 'R' || authTpCd == 'S') && rqstUsrChk == 'Y') || G_MDAA_CHK == 'Y') ) {
            ComSetDisplay('btn_Request', true);
            ComGetObject("btn_Request").style.setProperty("color", "#FF0000", "important");
            ComSetDisplay('btn_Retrieve', true);
            ComSetDisplay('btn_Save', true);
            doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
        } else if(procTpCd == 'A') {
            doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
            ComEnableObject(formObj.btns_search1, false);
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
/**
* Define an event control
*/
function initControl() {
    var formObj=document.form;
    // axon_event.addListenerForm('focus', 'obj_focus', formObj);
    // axon_event.addListenerFormat ('keypress', 'obj_keypress', form);
    //axon_event.addListenerForm  ('change', 'obj_change', form);
    // axon_event.addListenerForm  ('beforedeactivate', 'obj_deactivate',  form);     // focust out
    //ComClearSeparator (document.form.loc_cd,"eng"); //Only English 
    //ComClearSeparator (document.form.loc_nm,"eng"); //Only English
    //ComClearSeparator (document.form.sconti_cd,"eng"); //Only English
    //ComClearSeparator (document.form.cnt_cd,"eng"); //Only English
    //ComClearSeparator (document.form.rgn_cd,"eng"); //Only English
    //ComClearSeparator (document.form.ste_cd,"eng"); //Only English
    //ComClearSeparator (document.form.scc_cd,"eng"); //Only English
    //ComClearSeparator (document.form.rep_zn_cd,"eng"); //Only English
    //ComClearSeparator (document.form.un_loc_cd,"eng"); //Only English
    //ComClearSeparator (document.form.sls_ofc_cd,"eng"); //Only English
    //ComClearSeparator (document.form.eq_ctrl_ofc_cd,"eng"); //Only English
    //ComClearSeparator (document.form.finc_ctrl_ofc_cd,"eng"); //Only English
    //ComClearSeparator (document.form.mty_pkup_yd_cd,"eng"); //Only English
    //ComClearSeparator (document.form.eq_rtn_yd_cd,"eng"); //Only English
    //ComClearSeparator (document.form.hub_loc_cd,"eng"); //Only English
    //ComClearSeparator (document.form.loc_grd_no,"eng"); //Only English
    //ComClearSeparator (document.form.zip_cd,"eng"); //Only English
    //ComClearSeparator (document.form.utc_gap_hr_ctnt,"eng"); //Only English
    //ComClearSeparator (document.form.loc_ams_port_cd,"eng"); //Only English
    //ComClearSeparator (document.form.cstms_cd,"eng"); //Only English
    //ComClearSeparator (document.form.loc_lat,"eng"); //Only English
    //ComClearSeparator (document.form.loc_lon,"eng"); //Only English
}
/**
* The default setting Combo
*/ 
function initCombo(comboObj, comboNo) {
    var formObject=document.form;
    switch(comboObj.options.id) {  
        case "loc_chr_cd":      //Character
            with (comboObj) { 
                SetMultiSelect(0);
                SetUseAutoComplete(1);
                SetColAlign(0, "left");
                SetColWidth(0, "180");
                SetDropHeight(100);
                SetMaxLength(2);
            }
        break;
        case "loc_tp_cd":       //Type
            with (comboObj) { 
                SetMultiSelect(0);
                SetUseAutoComplete(1);
                SetColAlign(0, "left");
                SetColWidth(0, "240");
                SetDropHeight(100);
                SetMaxLength(2);
            }
        break;
        case "conti_cd":        //Continent
            with (comboObj) { 
                SetMultiSelect(0);
                SetUseAutoComplete(1);
                SetColAlign(0, "left");
                SetColWidth(0, "100");
                SetDropHeight(100);
                SetMaxLength(2);
            }
        break;
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
                  SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
                  var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                  var headers = [ { Text:HeadTitle, Align:"Center"} ];
                  InitHeaders(headers, info);
                  var cols = [ {Type:"Status",    Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" } ];
                  InitColumns(cols);
                  SetEditable(0);
                  SetWaitImageVisible(0);
                  SetVisible(0);
            }
        break;
    }
}
/**
 * All the combo box query
 */
function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
    switch (sAction) {
        case SEARCH01: // load page
            var sXml=sheetObj.GetSearchData("BCM_CCD_0019GS.do", "f_cmd=" + SEARCH01);
            var rtnValue=sXml.split("|$$|");
            for(var i=0; i<rtnValue.length; i++){
                var comboXml=ComXml2ComboString(rtnValue[i], "cd_desc", "cd");
                if(comboXml!=null){
                    var cdName=comboXml[0].split("|");
                    var cdValue=comboXml[1].split("|");
                    for (var j=0; j < cdName.length; j++) {
                        comboObjects[i].InsertItem(j, cdName[j], cdValue[j]);
                    }
                }
            }
        break;
    }
}
function doActionIBSheet(sheetObj,formObj,sAction) {
    var prefix="sheet1_";
    switch(sAction) {
        case IBSEARCH:      //retrieve
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                if( formObj.rqst_no.value == ''){
                    formObj.f_cmd.value=SEARCH;
                }else{
                    formObj.f_cmd.value=SEARCH15;
//                    ComBtnDisable("btn_Save");  
                }
                var loc_cd=formObj.loc_cd.value;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0019GS.do", sParam);
                sheetObj.LoadSearchData(sXml,{Sync:1} );
                var rqstNo=ComGetEtcData(sXml, "RQST_NO");
                ComSetObjValue(formObj.rqst_no, rqstNo);
                
                //var loc_nm=ComXmlString(sXml, "loc_nm");
                sheetObj.LoadSearchData(sXml,{Sync:1} );
                var loc_nm= "";
                if(sheetObj.RowCount()== 0){
                    loc_nm = "";
                } else {
                    loc_nm = ComXmlString(sXml, "loc_nm");
                }
                
                if(loc_nm == ""){
                    formObj.creflag.value="Y";
                    formObj.reset();
                    formObj.loc_cd.value=loc_cd;
                    formObj.call_port_flg.checked=false;
                    loc_chr_cd.SetSelectText("");
                    loc_tp_cd.SetSelectText("");
                    conti_cd.SetSelectText("");
    
                    formObj.ibflag.value="I"
                    if(G_AHTU_TP_CD=="A"){
                        ComShowCodeMessage("CCD00033", "Location Code");
                        doActionIBSheet(sheetObj, formObj, IBCLEAR);
                    }else{
                        if(!ComShowConfirm(ComGetMsg("CCD00034", "Location Code"))){
                            doActionIBSheet(sheetObj, formObj, IBCLEAR);
                        }
                    }
                    if (formObj.loc_cd.value.substring(0, 2) == "IN") {
                    	formObj.locl_ste_cd.className = "input1";
                    	formObj.locl_ste_cd.disabled = false;
                    } else {
                    	formObj.locl_ste_cd.className = "input";
                    	formObj.locl_ste_cd.disabled = true;
                    }
                } else{
                    formObj.creflag.value="N";
                    formObj.loc_nm.value=loc_nm;
                    formObj.loc_cd.value=ComXmlString(sXml, "loc_cd");
                    formObj.loc_locl_lang_nm.value=ComXmlString(sXml, "loc_locl_lang_nm");
                    formObj.sconti_cd.value=ComXmlString(sXml, "sconti_cd");
                    formObj.cnt_cd.value=ComXmlString(sXml, "cnt_cd");
                    formObj.rgn_cd.value=ComXmlString(sXml, "rgn_cd");
                    formObj.ste_cd.value=ComXmlString(sXml, "ste_cd");
                    formObj.scc_cd.value=ComXmlString(sXml, "scc_cd");
                    formObj.rep_zn_cd.value=ComXmlString(sXml, "rep_zn_cd");
                    formObj.un_loc_cd.value=ComXmlString(sXml, "un_loc_cd");
                    formObj.old_un_loc_cd.value=ComXmlString(sXml, "un_loc_cd");
                    formObj.sls_ofc_cd.value=ComXmlString(sXml, "sls_ofc_cd");
                    formObj.eq_ctrl_ofc_cd.value=ComXmlString(sXml, "eq_ctrl_ofc_cd");
                    formObj.finc_ctrl_ofc_cd.value=ComXmlString(sXml, "finc_ctrl_ofc_cd");
                    formObj.yd_flg.value=ComXmlString(sXml, "yd_flg");
                    
                    // 2017.05.16
                    // Enable "India GST Office" item for India Office only
                    if (ComXmlString(sXml, "cnt_cd") == "IN") {
                    	formObj.locl_ste_cd.className = "input1";
                    	formObj.locl_ste_cd.disabled = false;
                    } else {
                    	formObj.locl_ste_cd.className = "input";
                    	formObj.locl_ste_cd.disabled = true;
                    }
                    formObj.locl_ste_cd.value=ComXmlString(sXml, "locl_ste_cd");
                    
                    formObj.mty_pkup_yd_cd.value=ComXmlString(sXml, "mty_pkup_yd_cd");
                    formObj.eq_rtn_yd_cd.value=ComXmlString(sXml, "eq_rtn_yd_cd");
                    formObj.hub_loc_cd.value=ComXmlString(sXml, "hub_loc_cd");
//                    formObj.loc_grd_no.value=ComXmlString(sXml, "loc_grd_no");
                    formObj.zip_cd.value=ComXmlString(sXml, "zip_cd");
                    formObj.gmt_hrs.value=ComXmlString(sXml, "gmt_hrs");
                    formObj.utc_gap_hr_ctnt.value=ComXmlString(sXml, "utc_gap_hr_ctnt");
                    formObj.loc_ams_port_cd.value=ComXmlString(sXml, "loc_ams_port_cd");
                    formObj.cstms_cd.value=ComXmlString(sXml, "cstms_cd");
                    formObj.new_loc_lat.value=ComXmlString(sXml, "new_loc_lat");
                    formObj.new_loc_lon.value=ComXmlString(sXml, "new_loc_lon");                    
                    loc_chr_cd.SetSelectCode(ComXmlString(sXml, "loc_chr_cd"),false);
                    loc_tp_cd.SetSelectCode(ComXmlString(sXml, "loc_tp_cd"),false);
                    conti_cd.SetSelectCode(ComXmlString(sXml, "conti_cd"),false);
                    formObj.loc_lat.value=ComXmlString(sXml, "loc_lat");
                    formObj.loc_lon.value=ComXmlString(sXml, "loc_lon");
                    
                    if(ComXmlString(sXml, "call_port_flg")=='Y'){
                        formObj.call_port_flg.checked=true;
                    }else{
                        formObj.call_port_flg.checked=false;
                    }
                    formObj.delt_flg.value=ComXmlString(sXml, "delt_flg");
                    formObj.old_delt_flg.value=ComXmlString(sXml, "delt_flg");
                    formObj.port_inlnd_flg.value=ComXmlString(sXml, "port_inlnd_flg");
                    formObj.un_loc_ind_cd.value=ComXmlString(sXml, "un_loc_ind_cd");
                    formObj.cml_zn_flg.value=ComXmlString(sXml, "cml_zn_flg");
//                    formObj.lat_ut_cd.value=ComXmlString(sXml, "lat_ut_cd");
//                    formObj.lon_ut_cd.value=ComXmlString(sXml, "lon_ut_cd");
//					formObj.modi_loc_cd.value = ComXmlString(sXml, "modi_loc_cd");
//					formObj.modi_loc_cd2.value = ComXmlString(sXml, "modi_loc_cd2");
					formObj.cre_usr_id.value = ComXmlString(sXml, "cre_usr_id");
					formObj.cre_dt.value = ComXmlString(sXml, "cre_dt");
					formObj.upd_usr_id.value = ComXmlString(sXml, "upd_usr_id");
					formObj.upd_dt.value = ComXmlString(sXml, "upd_dt");
                    formObj.ibflag.value="U";
                    formObj.loc_cd.readOnly=true;
                }
            }
        break;
        
        case IBSAVE:
            if(validateForm(sheetObj,formObj,sAction)){
                if( formObj.creflag.value == "N" && formObj.rqst_no.value == ''){
                    formObj.f_cmd.value=MULTI;
                }else{
                    formObj.f_cmd.value=MULTI01;
                    ComEnableObject(form.btns_search1, false);
                }
                var sParam=FormQueryString(formObj);
                if(formObj.creflag.value != "N" && formObj.rqst_no.value == ''){
                    tmpMsg="CCD00035";
                }else{
                    tmpMsg="COM130101";
                }
                if(ComShowCodeConfirm(tmpMsg, "Data")){
                    ComOpenWait(true);
                    var sXml=sheetObj.GetSaveData("BCM_CCD_0019GS.do", sParam + "&" + ComGetPrefixParam("sheet1_"));
                    sheetObj.LoadSaveData(sXml);
                    var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
                    if(result != "F"){
                        if(formObj.creflag.value != "N" && formObj.rqst_no.value == ''){
                            ComShowCodeMessage("CCD00031");
                        } else {
                            ComShowCodeMessage("COM130102", "Data");
                        }
                    }else{
                        ComShowCodeMessage("COM130103", "Data");
                    }
                    var rqstNo=ComGetEtcData(sXml, "RQST_NO");
                    ComSetObjValue(formObj.rqst_no, rqstNo);
                    doActionIBSheet(sheetObj, formObj, IBSEARCH);
                }
            }
        break;
        
        case SEARCH02:      //Sub Continent check
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH02;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0019GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Sub Continent Code");
                    formObj.sconti_cd.value="";
                }
                ComOpenWait(false);
            }
        break;
        
        case SEARCH03:      //Country code check
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH03;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0019GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Country Code");
                    formObj.cnt_cd.value="";
                }
                ComOpenWait(false);
            }
        break;
        
        case SEARCH04:      //Region check
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH04;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0019GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Region Code");
                    formObj.rgn_cd.value="";
                }
                ComOpenWait(false);
            }
        break;
        
        case SEARCH05:      //State check
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH05;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0019GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "State Code");
                    formObj.ste_cd.value="";
                }
                ComOpenWait(false);
            }
        break;
        case SEARCH06:      //SCC, EQ SCC : MDM_EQ_ORZ_CHT.SCC_CD 존재 Validation
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH06;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0019GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("CCD00041");
                    formObj.scc_cd.value="";
                }
                ComOpenWait(false);
            }
        break;
        
        case SEARCH07:      //REP Zone code check
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH07;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0019GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Rep.Zone Code");
                    formObj.rep_zn_cd.value="";
                }
                ComOpenWait(false);
            }
        break;
        
        case SEARCH08:  
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH08;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0019GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Sales OFC Code");
                    formObj.sls_ofc_cd.value="";
                }
                ComOpenWait(false);
            }
        break;
        
        case SEARCH09:      //sls_ofc_cd, eq_ctrl_ofc_cd, finc_ctrl_ofc_cd  check
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
            formObj.f_cmd.value=SEARCH09;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0019GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "EQ OFC Code");
                formObj.eq_ctrl_ofc_cd.value="";
            }
            ComOpenWait(false);
            }
        break;
        
        case SEARCH10:      //sls_ofc_cd, eq_ctrl_ofc_cd, finc_ctrl_ofc_cd  check
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH10;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0019GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Fin OFC Code");
                    formObj.finc_ctrl_ofc_cd.value="";
                }
                ComOpenWait(false);
            }
        break;
        
        case SEARCH11:      //mty_pkup_yd_cd, eq_rtn_yd_cd check
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH11;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0019GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Rep Empty P/Up CY");
                    formObj.mty_pkup_yd_cd.value="";
                }
                ComOpenWait(false);
            }
        break;
        
        case SEARCH12:      //mty_pkup_yd_cd, eq_rtn_yd_cd check
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH12;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0019GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "EQ Return CY");
                    formObj.eq_rtn_yd_cd.value="";
                }
                ComOpenWait(false);
            }
        break;
        
        case SEARCH13:      //SCC, Hub Location check
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH13;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0019GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Hub Location Code");
                    formObj.hub_loc_cd.value="";
                }
                ComOpenWait(false);
            }
        break;
        case SEARCH14:      //Set Country Click
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH14;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0019GS.do", sParam);
                var cntCd=ComGetEtcData(sXml, "cnt_cd");
                if(cntCd!="") formObj.cnt_cd.value=cntCd;
                var scontiCd=ComGetEtcData(sXml, "sconti_cd");
                if(scontiCd!="") formObj.sconti_cd.value=scontiCd;
                var contiCd=ComGetEtcData(sXml, "conti_cd");
                if(contiCd!="") comboObjects[2].SetSelectCode(contiCd);
                ComOpenWait(false);
            }
        break;
        
        case SEARCH16:      //Check whether active yard code exists
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH16;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0019GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                
                if(result!=""){
                    ComShowCodeMessage("CCD00077", formObj.loc_cd.value);
                    formObj.scc_cd.value=result;
                }

                ComOpenWait(false);
            }
        break;
        
        case SEARCH20: // MDM AUTH_TP_CD query
            var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=LOCA';
            var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
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
            clearAllData(sheetObj, formObj);
            ComEnableObject(formObj.btns_search1, true);
            ComBtnEnable("btn_Save"); 
            break;
    }
}
/**
* handling process for input validation
*/
function validateForm(sheetObj,formObj,sAction){
    switch(sAction) {
        case IBSEARCH:      //retrieve
            if( formObj.rqst_no.value == ''){
                if(formObj.loc_cd.value == ""){
                    ComShowCodeMessage("CCD00001", "Location Code");
                    return false;
                }
            }
        break;
        case IBSAVE:        //save
            if(formObj.loc_cd.value == ""){
                ComShowCodeMessage("CCD00001", "Location Code");
                formObj.loc_cd.focus();
                return false;
            }else if(formObj.loc_nm.value == ""){
                ComShowCodeMessage("CCD00001", "English Name");
                formObj.loc_nm.focus();
                return false;
            }else if(loc_chr_cd.GetSelectText()== ""){
                ComShowCodeMessage("CCD00001", "Character");
                loc_chr_cd.Focus();
                return false;
            }else if(formObj.port_inlnd_flg.value == ""){
                ComShowCodeMessage("CCD00001", "Port");
                formObj.port_inlnd_flg.focus();
                return false;
            }else if(loc_tp_cd.GetSelectText() == ""){
                ComShowCodeMessage("CCD00001", "Type");
                loc_tp_cd.Focus();
                return false;
            }else if(conti_cd.GetSelectText() == ""){
                ComShowCodeMessage("CCD00001", "Continent");
                conti_cd.Focus();
                return false;
            }else if(formObj.sconti_cd.value == ""){
                ComShowCodeMessage("CCD00001", "Sub Continent");
                formObj.sconti_cd.focus();
                return false;
            }else if(formObj.cnt_cd.value == ""){
                ComShowCodeMessage("CCD00001", "Country");
                formObj.cnt_cd.focus();
                return false;
            }else if(formObj.rgn_cd.value == ""){
                ComShowCodeMessage("CCD00001", "Region");
                formObj.rgn_cd.focus();
                return false;
            }else if(formObj.un_loc_ind_cd.value == ""){
                ComShowCodeMessage("CCD00001", "UN LOC Flag");
                formObj.un_loc_ind_cd.focus();
                return false;
            }else if(formObj.sls_ofc_cd.value == ""){
                ComShowCodeMessage("CCD00001", "Sales OFC");
                formObj.sls_ofc_cd.focus();
                return false;
            }else if(formObj.eq_ctrl_ofc_cd.value == ""){
                ComShowCodeMessage("CCD00001", "EQ OFC");
                formObj.eq_ctrl_ofc_cd.focus();
                return false;
            }else if(formObj.finc_ctrl_ofc_cd.value == ""){
                ComShowCodeMessage("CCD00001", "Fin OFC");
                formObj.finc_ctrl_ofc_cd.focus();
                return false;
            }else if(loc_chr_cd.GetSelectText()== "Inland" && formObj.port_inlnd_flg.value == "Y") {
                ComShowCodeMessage("CCD00022");
                loc_chr_cd.Focus();
                return false;
            } else if (ComGetLenByByte(formObj.loc_locl_lang_nm.value) >200){
                ComShowCodeMessage("COM12142", "Local Name","200 Bytes");
                formObj.loc_locl_lang_nm.focus();
                return false;
            } else if(formObj.gmt_hrs.value == ""){
                ComShowCodeMessage("CCD00001", "UTC Gap");
                formObj.gmt_hrs.focus();
                return false;
//            } else if(formObj.modi_loc_cd.value == ""){
//                ComShowCodeMessage("CCD00001", "VIP Code");
//                formObj.modi_loc_cd.focus();
//                return false;
            } else if(formObj.cnt_cd.value == "IN" && formObj.locl_ste_cd.value == ""){ // Check "India GST Office" as mandatory for India Offices
                ComShowCodeMessage("CCD00001", "India GST Office");
                formObj.locl_ste_cd.focus();
                return false;
            } else if(formObj.loc_cd.value.substring(0, 2) != formObj.cnt_cd.value){
                ComShowCodeMessage("CCD00062");
                formObj.cnt_cd.focus();
                return false;
            }

            if(formObj.un_loc_cd.value != formObj.old_un_loc_cd.value){
            	if(formObj.old_un_loc_cd.value == ""){
            		formObj.edi_if_flg.value = "I";
            	}else if(formObj.un_loc_cd.value == ""){
            		formObj.edi_if_flg.value = "D";
            	}else{
            		formObj.edi_if_flg.value = "U";
            	}
            }else{
            	if(   formObj.delt_flg.value != formObj.old_delt_flg.value
                   && formObj.delt_flg.value == "N"
                   && formObj.un_loc_cd.value != ""                         ){
            		formObj.edi_if_flg.value = "I";
            	} else {
            		formObj.edi_if_flg.value = "N";	
            	}
            }
        break;
    }
    return true;
}
/**
 * If the data field to be the change Event
 */
function obj_change(){
    var formObject=document.form;
    /*****Case more than two additional sheets tab sheet is used to specify a variable *****/
    var sheetObject1=sheetObjects[0];
    /*******************************************************/
    
    try {
        var srcName=ComGetEvent("name");
        if(ComGetBtnDisable(srcName)) return false;
        switch(srcName) {
            case "loc_cd":
                if(formObject.loc_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, IBSEARCH);
                }
            break;
            case "sconti_cd":
                if(formObject.sconti_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH02);
                }
            break;
            case "cnt_cd":
                if(formObject.cnt_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH03);
                }
            break;
            case "rgn_cd":
                if(formObject.rgn_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH04);
                }
            break;
            case "ste_cd":
                if(formObject.ste_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH05);
                }
            break;
            case "scc_cd":
                if(formObject.scc_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH06);
                } else {
                	doActionIBSheet(sheetObject1, formObject, SEARCH16);
                }
            break;
            case "rep_zn_cd":
                if(formObject.rep_zn_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH07);
                }
            break;
            case "sls_ofc_cd":
                if(formObject.sls_ofc_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH08);
                }
            break;
            case "eq_ctrl_ofc_cd":
                if(formObject.eq_ctrl_ofc_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH09);
                }
            break;
            case "finc_ctrl_ofc_cd":
                if(formObject.finc_ctrl_ofc_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH10);
                }
            break;
            case "mty_pkup_yd_cd":
                if(formObject.mty_pkup_yd_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH11);
                }
            break;
            case "eq_rtn_yd_cd":
                if(formObject.eq_rtn_yd_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH12);
                }
            break;
            case "hub_loc_cd":
                if(formObject.hub_loc_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH13);
                }
            break;
            case "un_loc_ind_cd":
                if(formObject.un_loc_ind_cd.value == "Y"){
                    formObject.un_loc_cd.value=formObject.loc_cd.value;
                }
            break;
            case "delt_flg":
                if(formObject.delt_flg.value == "Y") {
                	if (formObject.yd_flg.value == "Y") {
                    	ComShowCodeMessage("CCD00070");
                    	formObject.delt_flg.value = "N";
                    	break;
                    }
                    if(!ComShowCodeConfirm("COM130301", "data")){
                    	formObject.delt_flg.value="N";
                    }
                }
            break;
            case "loc_locl_lang_nm" :
                var ret=ComGetLenByByte(formObject.loc_locl_lang_nm.value);
                if(ret > 200) {
                    ComShowCodeMessage("COM12142", "Local Name","200 Bytes");
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
/*
 * 
 */
function clearAllData(sheetObj, formObj){
    formObj.reset();
    formObj.rqst_no.value="";

    formObj.call_port_flg.checked=false;
    loc_chr_cd.SetSelectText("");
    loc_tp_cd.SetSelectText("");
    conti_cd.SetSelectText("");
    formObj.delt_flg.value="N";
    formObj.edi_if_flg.value = "N";
    formObj.old_un_loc_cd.value = "";
    formObj.ibflag.value="I";
    formObj.loc_cd.readOnly=false;
    formObj.locl_ste_cd.className = "input";
    formObj.locl_ste_cd.disabled = true;
}
function locCodeHelp(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.loc_cd.value=colArray[1];
   doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
}
function scontiCodeHelp(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.sconti_cd.value=colArray[1];
}
function cntCodeHelp(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.cnt_cd.value=colArray[1];
}
function rgnCodeHelp(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.rgn_cd.value=colArray[1];
}
function steCodeHelp(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.ste_cd.value=colArray[3];
}
function sccCodeHelp(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.scc_cd.value=colArray[1];
}
function zoneCodeHelp(rowArray) {	
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.rep_zn_cd.value=colArray[3];
}
function slsOfcCodeHelp(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.sls_ofc_cd.value=colArray[1];
}
function eqCtrlOfcCodeHelp(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.eq_ctrl_ofc_cd.value=colArray[1];
}
function fincCtrlOfcCodeHelp(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.finc_ctrl_ofc_cd.value=colArray[1];
}
function mtyPkupYdCodeHelp(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.mty_pkup_yd_cd.value=colArray[3];
}
function eqRtnYdCodeHelp(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.eq_rtn_yd_cd.value=colArray[3];
}
function hubLocCodeHelp(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.hub_loc_cd.value=colArray[1];
}

function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) {
    ComOpenWait(false);
}

function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
    ComOpenWait(false);
}
