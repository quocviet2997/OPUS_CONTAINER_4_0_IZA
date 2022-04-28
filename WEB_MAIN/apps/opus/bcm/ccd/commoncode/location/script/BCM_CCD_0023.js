/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0023.js
*@FileTitle  : Leasing Company Yard 
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
                clearAllData(sheetObject1, formObject);
                break;
            case "btn_Save":
                doActionIBSheet(sheetObject1, formObject, IBSAVE);
                break;
            case "btns_search2":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.lse_co_vndr_seq1.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 780, 540, "vndr1Help", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search3":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.lse_co_vndr_seq11.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 780, 540, "vndr11Help", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search4":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.lse_co_vndr_seq2.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 780, 540, "vndr2Help", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search5":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.lse_co_vndr_seq12.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 780, 540, "vndr12Help", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search6":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.lse_co_vndr_seq3.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 780, 540, "vndr3Help", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search7":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.lse_co_vndr_seq13.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 780, 540, "vndr13Help", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search8":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.lse_co_vndr_seq4.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 780, 540, "vndr4Help", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search9":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.lse_co_vndr_seq14.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 780, 540, "vndr14Help", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search10":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.lse_co_vndr_seq5.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 780, 540, "vndr5Help", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search11":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.lse_co_vndr_seq15.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 780, 540, "vndr15Help", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search12":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.lse_co_vndr_seq6.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 780, 540, "vndr6Help", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search13":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.lse_co_vndr_seq16.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 780, 540, "vndr16Help", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search14":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.lse_co_vndr_seq7.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 780, 540, "vndr7Help", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search15":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.lse_co_vndr_seq17.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 780, 540, "vndr17Help", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search16":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.lse_co_vndr_seq8.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 780, 540, "vndr8Help", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search17":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.lse_co_vndr_seq18.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 780, 540, "vndr18Help", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search18":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.lse_co_vndr_seq9.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 780, 540, "vndr9Help", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search19":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.lse_co_vndr_seq19.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 780, 540, "vndr19Help", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search20":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.lse_co_vndr_seq10.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 780, 540, "vndr10Help", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search21":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.lse_co_vndr_seq20.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 780, 540, "vndr20Help", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search1":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_COM_0004.do?mdm_yn="+formObj.mdm_yn.value+"&lse_co_yd_cd=" + formObj.lse_co_yd_cd.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 780, 410, "yardCodeHelp", "1,0,1,1,1,1,1,1", true);
                break;                      
        } // end switch
    } catch(e) {
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
* setting sheet initial values and header
* param : sheetObj, sheetNo
* adding case as numbers of counting sheets
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
    doActionIBSheet(sheetObjects[0], formObj, SEARCHLIST02);
    if(G_MDAA_CHK == 'Y') {
        ComEnableObject(formObj.delt_flg, true);
        ComSetDisplay('btn_Save', true);
    } else {
        ComEnableObject(formObj.delt_flg, false);
        ComSetDisplay('btn_Save', false);
    }
}
/**
*Define an event control
*/
function initControl() {
var formObj=document.form;
// axon_event.addListenerForm('focus', 'obj_focus', formObj);
// axon_event.addListenerFormat ('keypress', 'obj_keypress', form);
// axon_event.addListenerForm  ('change', 'obj_change', form);
// ComClearSeparator (document.form.lse_co_yd_cd,"eng"); //Only English 
// ComClearSeparator (document.form.lse_co_yd_nm,"eng"); //Only English
// ComClearSeparator (document.form.intl_phn_no,"eng"); //Only English
// ComClearSeparator (document.form.phn_no,"eng"); //Only English
// ComClearSeparator (document.form.fax_no,"eng"); //Only English 
// ComClearSeparator (document.form.yd_eml,"eng"); //Only English
// ComClearSeparator (document.form.yd_pic_nm,"eng"); //Only English 
// ComClearSeparator (document.form.lse_co_vndr_seq1,"eng"); //Only English
// ComClearSeparator (document.form.lse_co_vndr_seq2,"eng"); //Only English
// ComClearSeparator (document.form.lse_co_vndr_seq3,"eng"); //Only English
// ComClearSeparator (document.form.lse_co_vndr_seq4,"eng"); //Only English
// ComClearSeparator (document.form.lse_co_vndr_seq5,"eng"); //Only English
// ComClearSeparator (document.form.lse_co_vndr_seq6,"eng"); //Only English
// ComClearSeparator (document.form.lse_co_vndr_seq7,"eng"); //Only English
// ComClearSeparator (document.form.lse_co_vndr_seq8,"eng"); //Only English
// ComClearSeparator (document.form.lse_co_vndr_seq9,"eng"); //Only English
// ComClearSeparator (document.form.lse_co_vndr_seq10,"eng"); //Only English
// ComClearSeparator (document.form.lse_co_vndr_seq11,"eng"); //Only English
// ComClearSeparator (document.form.lse_co_vndr_seq12,"eng"); //Only English
// ComClearSeparator (document.form.lse_co_vndr_seq13,"eng"); //Only English
// ComClearSeparator (document.form.lse_co_vndr_seq14,"eng"); //Only English
// ComClearSeparator (document.form.lse_co_vndr_seq15,"eng"); //Only English
// ComClearSeparator (document.form.lse_co_vndr_seq16,"eng"); //Only English
// ComClearSeparator (document.form.lse_co_vndr_seq17,"eng"); //Only English
// ComClearSeparator (document.form.lse_co_vndr_seq18,"eng"); //Only English
// ComClearSeparator (document.form.lse_co_vndr_seq19,"eng"); //Only English
// ComClearSeparator (document.form.lse_co_vndr_seq20,"eng"); //Only English
}
/**
* The initial setting sheet, Header definition
* param : sheetObj ==> sheet object, sheetNo ==> Sheet object ID of the tag attached to the serial number
* If the number of seats a case by adding the number of sheets sheets should initialize the module configuration
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
                SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
                var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle, Align:"Center"} ];
                InitHeaders(headers, info);
                var cols = [ {} ];
                InitColumns(cols);
                SetEditable(0);
                SetWaitImageVisible(0);
                SetVisible(0);
            }
        break;
    }
}
function doActionIBSheet(sheetObj,formObj,sAction) {
   var prefix="sheet1_";
   switch(sAction) {
    case IBSEARCH:      //retrieve
        if(validateForm(sheetObj,formObj,sAction)){
            var ydCd=formObj.lse_co_yd_cd.value;
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
            var lse_co_yd_nm=ComXmlString(sXml, "lse_co_yd_nm");
            sheetObj.LoadSearchData(sXml,{Sync:1} );
            if(lse_co_yd_nm == ""){
                if (G_MDAA_CHK == "Y") {
                    if (ComShowCodeConfirm("COM130407", "Leasing Yard Code")) {
                        formObj.reset();
                        formObj.lse_co_yd_cd.value=ydCd;
                        formObj.delt_flg.value="N";
                        formObj.ibflag.value="I";
                        formObj.lse_co_yd_cd.readOnly=true;
                    } else {
                        clearAllData(sheetObjects[0], formObj);
                    }
                } else {
                    ComShowCodeMessage("COM130402", "Leasing Yard Code");
                    clearAllData(sheetObjects[0], formObj);
                }
                return;
            } else{
                formObj.lse_co_yd_nm.value=lse_co_yd_nm;
                formObj.yd_addr.value=ComXmlString(sXml, "yd_addr");
                formObj.intl_phn_no.value=ComXmlString(sXml, "intl_phn_no");
                formObj.phn_no.value=ComXmlString(sXml, "phn_no");
                formObj.fax_no.value=ComXmlString(sXml, "fax_no");
                formObj.yd_eml.value=ComXmlString(sXml, "yd_eml");
                formObj.yd_pic_nm.value=ComXmlString(sXml, "yd_pic_nm");
                formObj.lse_co_vndr_seq1.value=ComXmlString(sXml, "lse_co_vndr_seq1");
                formObj.lse_co_vndr_seq2.value=ComXmlString(sXml, "lse_co_vndr_seq2");
                formObj.lse_co_vndr_seq3.value=ComXmlString(sXml, "lse_co_vndr_seq3");
                formObj.lse_co_vndr_seq4.value=ComXmlString(sXml, "lse_co_vndr_seq4");
                formObj.lse_co_vndr_seq5.value=ComXmlString(sXml, "lse_co_vndr_seq5");
                formObj.lse_co_vndr_seq6.value=ComXmlString(sXml, "lse_co_vndr_seq6");
                formObj.lse_co_vndr_seq7.value=ComXmlString(sXml, "lse_co_vndr_seq7");
                formObj.lse_co_vndr_seq8.value=ComXmlString(sXml, "lse_co_vndr_seq8");
                formObj.lse_co_vndr_seq9.value=ComXmlString(sXml, "lse_co_vndr_seq9");
                formObj.lse_co_vndr_seq10.value=ComXmlString(sXml, "lse_co_vndr_seq10");
                formObj.lse_co_vndr_seq11.value=ComXmlString(sXml, "lse_co_vndr_seq11");
                formObj.lse_co_vndr_seq12.value=ComXmlString(sXml, "lse_co_vndr_seq12");
                formObj.lse_co_vndr_seq13.value=ComXmlString(sXml, "lse_co_vndr_seq13");
                formObj.lse_co_vndr_seq14.value=ComXmlString(sXml, "lse_co_vndr_seq14");
                formObj.lse_co_vndr_seq15.value=ComXmlString(sXml, "lse_co_vndr_seq15");
                formObj.lse_co_vndr_seq16.value=ComXmlString(sXml, "lse_co_vndr_seq16");
                formObj.lse_co_vndr_seq17.value=ComXmlString(sXml, "lse_co_vndr_seq17");
                formObj.lse_co_vndr_seq18.value=ComXmlString(sXml, "lse_co_vndr_seq18");
                formObj.lse_co_vndr_seq19.value=ComXmlString(sXml, "lse_co_vndr_seq19");
                formObj.lse_co_vndr_seq20.value=ComXmlString(sXml, "lse_co_vndr_seq20");
                formObj.cre_usr_id.value=ComXmlString(sXml, "cre_usr_id");
                formObj.cre_dt.value=ComXmlString(sXml, "cre_dt");
                formObj.upd_usr_id.value=ComXmlString(sXml, "upd_usr_id");
                formObj.upd_dt.value=ComXmlString(sXml, "upd_dt");

                formObj.delt_flg.value=ComXmlString(sXml, "delt_flg");
	        	formObj.modi_lse_co_yd_cd.value = ComXmlString(sXml, "modi_lse_co_yd_cd");

	        	formObj.ibflag.value="U";
                formObj.lse_co_yd_cd.readOnly=true;
            }
        }
    break;
    
    case IBSAVE:
        if(validateForm(sheetObj,formObj,sAction)){
            formObj.f_cmd.value=MULTI;
            var sParam=FormQueryString(formObj);
            if(ComShowCodeConfirm("COM130101", "Data")){
                ComOpenWait(true);
                var sXml=sheetObj.GetSaveData("BCM_CCD_0023GS.do", sParam + "&" + ComGetPrefixParam("sheet1_"));
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
    
    case SEARCHLIST02: // MDM AUTH_TP_CD query
        var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=MDAA';
        var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
        G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
        G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
    break;
    
    case SEARCH01:      //lse_co_vndr_seq1 check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH01;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Leasing Company Vendor 1");
                formObj.lse_co_vndr_seq1.value="";
            }
            ComOpenWait(false);
        }
    break;
    
    case SEARCH02:      //lse_co_vndr_seq2 check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH02;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Leasing Company Vendor 2");
                formObj.lse_co_vndr_seq2.value="";
            }
            ComOpenWait(false);
        }
    break;
    
    case SEARCH03:      //lse_co_vndr_seq3 check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH03;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Leasing Company Vendor 3");
                formObj.lse_co_vndr_seq3.value="";
            }
            ComOpenWait(false);
        }
    break;
    
    case SEARCH04:      //lse_co_vndr_seq4 check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH04;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Leasing Company Vendor 4");
                formObj.lse_co_vndr_seq4.value="";
            }
            ComOpenWait(false);
        }
    break;
    
    case SEARCH05:      //lse_co_vndr_seq5 check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH05;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Leasing Company Vendor 5");
                formObj.lse_co_vndr_seq5.value="";
            }
            ComOpenWait(false);
        }
    break;
    
    case SEARCH06:      //lse_co_vndr_seq6 check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH06;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Leasing Company Vendor 6");
                formObj.lse_co_vndr_seq6.value="";
            }
            ComOpenWait(false);
        }
    break;
    
    case SEARCH07:      //lse_co_vndr_seq7 check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH07;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Leasing Company Vendor 7");
                formObj.lse_co_vndr_seq7.value="";
            }
            ComOpenWait(false);
        }
    break;
    
    case SEARCH08:      //lse_co_vndr_seq8 check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH08;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Leasing Company Vendor 8");
                formObj.lse_co_vndr_seq8.value="";
            }
            ComOpenWait(false);
        }
    break;
    
    case SEARCH09:      //lse_co_vndr_seq9 check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH09;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Leasing Company Vendor 9");
                formObj.lse_co_vndr_seq9.value="";
            }
            ComOpenWait(false);
        }
    break;
    
    case SEARCH10:      //lse_co_vndr_seq10 check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH10;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Leasing Company Vendor 10");
                formObj.lse_co_vndr_seq10.value="";
            }
            ComOpenWait(false);
        }
    break;
    
    case SEARCH11:      //lse_co_vndr_seq11 check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
        formObj.f_cmd.value=SEARCH11;
        var sParam=FormQueryString(formObj);
        var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
        var result=ComGetEtcData(sXml, "result");
        if(result==""){
            ComShowCodeMessage("COM130402", "Leasing Company Vendor 11");
            formObj.lse_co_vndr_seq11.value="";
        }
        ComOpenWait(false);
    }
    break;
    
    case SEARCH12:      //lse_co_vndr_seq12 check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH12;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Leasing Company Vendor 12");
                formObj.lse_co_vndr_seq12.value="";
            }
            ComOpenWait(false);
        }
    break;
    
    case SEARCH13:      //lse_co_vndr_seq13 check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
        formObj.f_cmd.value=SEARCH13;
        var sParam=FormQueryString(formObj);
        var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
        var result=ComGetEtcData(sXml, "result");
        if(result==""){
            ComShowCodeMessage("COM130402", "Leasing Company Vendor 13");
            formObj.lse_co_vndr_seq13.value="";
        }
        ComOpenWait(false);
    }
    break;
    
    case SEARCH14:      //lse_co_vndr_seq14 check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH14;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Leasing Company Vendor 14");
                formObj.lse_co_vndr_seq14.value="";
            }
            ComOpenWait(false);
        }
    break;
    
    case SEARCH15:      //lse_co_vndr_seq15 check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
        formObj.f_cmd.value=SEARCH15;
        var sParam=FormQueryString(formObj);
        var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
        var result=ComGetEtcData(sXml, "result");
        if(result==""){
            ComShowCodeMessage("COM130402", "Leasing Company Vendor 15");
            formObj.lse_co_vndr_seq15.value="";
        }
        ComOpenWait(false);
    }
    break;
    
    case SEARCH16:      //lse_co_vndr_seq16 check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH16;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Leasing Company Vendor 16");
                formObj.lse_co_vndr_seq16.value="";
            }
            ComOpenWait(false);
        }
    break;
    
    case SEARCH17:      //lse_co_vndr_seq17 check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
        formObj.f_cmd.value=SEARCH17;
        var sParam=FormQueryString(formObj);
        var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
        var result=ComGetEtcData(sXml, "result");
        if(result==""){
            ComShowCodeMessage("COM130402", "Leasing Company Vendor 17");
            formObj.lse_co_vndr_seq17.value="";
        }
        ComOpenWait(false);
    }
    break;
    
    case SEARCH18:      //lse_co_vndr_seq18 check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH18;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Leasing Company Vendor 18");
                formObj.lse_co_vndr_seq18.value="";
            }
            ComOpenWait(false);
        }
    break;
    
    case SEARCH19:      //lse_co_vndr_seq19 check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
        formObj.f_cmd.value=SEARCH19;
        var sParam=FormQueryString(formObj);
        var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
        var result=ComGetEtcData(sXml, "result");
        if(result==""){
            ComShowCodeMessage("COM130402", "Leasing Company Vendor 19");
            formObj.lse_co_vndr_seq19.value="";
        }
        ComOpenWait(false);
    }
    break;
    
    case SEARCH20:      //lse_co_vndr_seq20 check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
        formObj.f_cmd.value=SEARCH20;
        var sParam=FormQueryString(formObj);
        var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
        var result=ComGetEtcData(sXml, "result");
        if(result==""){
            ComShowCodeMessage("COM130402", "Leasing Company Vendor 20");
            formObj.lse_co_vndr_seq20.value="";
        }
        ComOpenWait(false);
    }
    break;
    
    case SEARCHLIST01:      //MDM_YARD.YD_CD dup check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
        formObj.f_cmd.value=SEARCHLIST01;
        var sParam=FormQueryString(formObj);
        var sXml=sheetObj.GetSearchData("BCM_CCD_0023GS.do", sParam);
        var result=ComGetEtcData(sXml, "result");
        if(result!=""){
            ComShowCodeMessage("CCD00024");
            formObj.lse_co_yd_cd.value="";
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
    case IBSEARCH:      //retrieve
        if(formObj.lse_co_yd_cd.value == ""){
            ComShowCodeMessage("CCD00001", "Yard Code");
            return false;
        }
        break;
    case IBSAVE:        //save
        if(formObj.lse_co_yd_cd.value == ""){
            ComShowCodeMessage("CCD00001", "Yard Code");
//                  formObj.lse_co_yd_cd.focus();
            return false;
        }else if(formObj.lse_co_yd_nm.value == ""){
            ComShowCodeMessage("CCD00001", "Yard Name");
//                  formObj.lse_co_yd_nm.focus();
            return false;
        }else if(formObj.yd_addr.value == ""){
            ComShowCodeMessage("CCD00001", "Yard Address");
//                  formObj.yd_addr.focus();
            return false;
        }else if(formObj.intl_phn_no.value == ""){
            ComShowCodeMessage("CCD00001", "International Tel No");
//                  formObj.intl_phn_no.focus();
            return false;
        }else if(formObj.phn_no.value == ""){
            ComShowCodeMessage("CCD00001", "Tel No");
//                  formObj.phn_no.focus();
            return false;
        }else if(formObj.fax_no.value == ""){
            ComShowCodeMessage("CCD00001", "Fax No");
//                  formObj.fax_no.focus();
            return false;
        }else if(formObj.lse_co_vndr_seq1.value == ""){
            ComShowCodeMessage("CCD00001", "Leasing Company Vendor");
//                  formObj.lse_co_vndr_seq1.focus();
            return false;
        }
    break;
}
   return true;
}
/**
 *If the data field to be the CHANGE Event
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
            case "lse_co_yd_cd":
                if(formObject.lse_co_yd_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCHLIST01);
                    if(formObject.lse_co_yd_cd.value.length>0) {
                        doActionIBSheet(sheetObject1, formObject, IBSEARCH);
                    }
                }
            break;
            case "lse_co_vndr_seq1":
                if(formObject.lse_co_vndr_seq1.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH01);
                }
            break;
            case "lse_co_vndr_seq2":
                if(formObject.lse_co_vndr_seq2.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH02);
                }
            break;
            case "lse_co_vndr_seq3":
                if(formObject.lse_co_vndr_seq3.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH03);
                }
            break;
            case "lse_co_vndr_seq4":
                if(formObject.lse_co_vndr_seq4.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH04);
                }
            break;
            case "lse_co_vndr_seq5":
                if(formObject.lse_co_vndr_seq5.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH05);
                }
            break;
            case "lse_co_vndr_seq6":
                if(formObject.lse_co_vndr_seq6.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH06);
                }
            break;
            case "lse_co_vndr_seq7":
                if(formObject.lse_co_vndr_seq7.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH07);
                }
            break;
            case "lse_co_vndr_seq8":
                if(formObject.lse_co_vndr_seq8.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH08);
                }
            break;
            case "lse_co_vndr_seq9":
                if(formObject.lse_co_vndr_seq9.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH09);
                }
            break;
            case "lse_co_vndr_seq10":
                if(formObject.lse_co_vndr_seq10.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH10);
                }
            break;
            case "lse_co_vndr_seq11":
                if(formObject.lse_co_vndr_seq11.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH11);
                }
            break;
            case "lse_co_vndr_seq12":
                if(formObject.lse_co_vndr_seq12.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH12);
                }
            break;
            case "lse_co_vndr_seq13":
                if(formObject.lse_co_vndr_seq13.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH13);
                }
            break;
            case "lse_co_vndr_seq14":
                if(formObject.lse_co_vndr_seq14.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH14);
                }
            break;
            case "lse_co_vndr_seq15":
                if(formObject.lse_co_vndr_seq15.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH15);
                }
            break;
            case "lse_co_vndr_seq16":
                if(formObject.lse_co_vndr_seq16.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH16);
                }
            break;
            case "lse_co_vndr_seq17":
                if(formObject.lse_co_vndr_seq17.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH17);
                }
            break;
            case "lse_co_vndr_seq18":
                if(formObject.lse_co_vndr_seq18.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH18);
                }
            break;
            case "lse_co_vndr_seq19":
                if(formObject.lse_co_vndr_seq19.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH19);
                }
            break;
            case "lse_co_vndr_seq20":
                if(formObject.lse_co_vndr_seq20.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH20);
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
/*
 *
 * 
 */
function clearAllData(sheetObj, formObj){
    formObj.reset();
    formObj.ibflag.value="I";
    formObj.lse_co_yd_cd.readOnly=false;
}
function vndr1Help(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.lse_co_vndr_seq1.value=colArray[2];
}
function vndr2Help(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.lse_co_vndr_seq2.value=colArray[2];
}
function vndr3Help(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.lse_co_vndr_seq3.value=colArray[2];
}
function vndr4Help(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.lse_co_vndr_seq4.value=colArray[2];
}
function vndr5Help(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.lse_co_vndr_seq5.value=colArray[2];
}
function vndr6Help(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.lse_co_vndr_seq6.value=colArray[2];
}
function vndr7Help(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.lse_co_vndr_seq7.value=colArray[2];
}
function vndr8Help(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.lse_co_vndr_seq8.value=colArray[2];
}
function vndr9Help(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.lse_co_vndr_seq9.value=colArray[2];
}
function vndr10Help(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.lse_co_vndr_seq10.value=colArray[2];
}
function vndr11Help(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.lse_co_vndr_seq11.value=colArray[2];
}
function vndr12Help(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.lse_co_vndr_seq12.value=colArray[2];
}
function vndr13Help(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.lse_co_vndr_seq13.value=colArray[2];
}
function vndr14Help(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.lse_co_vndr_seq14.value=colArray[2];
}
function vndr15Help(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.lse_co_vndr_seq15.value=colArray[2];
}
function vndr16Help(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.lse_co_vndr_seq16.value=colArray[2];
}
function vndr17Help(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.lse_co_vndr_seq17.value=colArray[2];
}
function vndr18Help(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.lse_co_vndr_seq18.value=colArray[2];
}
function vndr19Help(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.lse_co_vndr_seq19.value=colArray[2];
}
function vndr20Help(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.lse_co_vndr_seq20.value=colArray[2];
}
function yardCodeHelp(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.lse_co_yd_cd.value=colArray[2];
    if(formObj.lse_co_yd_cd.value.length>0){
        doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
    }
}

function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) {
    ComOpenWait(false);
}

function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
    ComOpenWait(false);
}
