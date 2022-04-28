/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0020.js
*@FileTitle  : Yard
*@author     : CLT
*@version    : 1.0
*@since      : 2014/
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
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.n1st_vndr_seq.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 700, 540, "n1VndrCodeHelp", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search2":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.n2nd_vndr_seq.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 700, 540, "n2VndrCodeHelp", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search3":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_0C1.do?vndr_cd=" + formObj.n3rd_vndr_seq.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 700, 540, "n3VndrCodeHelp", "1,0,1,1,1,1,1,1", true);
                break;
            case "btns_search4":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_071.do?ofc_cd=" + formObj.ofc_cd.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 600, 620, "ofcCodeHelp", "0,0", true);
                break;
            case "btns_search5":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_071.do?ofc_cd=" + formObj.dmdt_ofc_cd.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 600, 620, "dmdtOfcCodeHelp", "0,0", true);
                break;
            case "btns_search6":
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_061.do?node_cd=" + formObj.rep_zn_cd.value +"&main_page=&mode=zone&mode_only=Y";
                var rVal=ComOpenPopup(sUrl, 780, 530, "zoneCodeHelp", "0,0", true);
                break;
            case "btns_search7":
                if($(ComGetEvent()).css('cursor') == "default") return;
                var formObj=document.form;
                var sUrl="/opuscntr/COM_ENS_061.do?mdm_yn="+formObj.mdm_yn.value+"&node_cd=" + formObj.yd_cd.value +"&main_page=&mode=yard&mode_only=Y";
                var rVal=ComOpenPopup(sUrl, 850, 530, "yardCodeHelp", "0,0", true);
                break;
//            2015.01.07 not use EQ SCC
//            case "btns_search8":
//                var formObj=document.form;
//                var sUrl="/opuscntr/COM_ENS_051.do?loc_cd=" + formObj.eq_scc_cd.value +"&main_page=false&scc_flg=Y";
//                var rVal=ComOpenPopup(sUrl, 1050, 470, "sccCodeHelp", "0,0", true);
//                break;
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
    var formObj=document.form;
    formObj.ibflag.value="I";
    formObj.edi_if_flg.value = "N";
    ComEnableObject(formObj.rail_arr_ntfc_flg, false);
    
    for(i=0;i<sheetObjects.length;i++){
        ComConfigSheet (sheetObjects[i] );
        initSheet(sheetObjects[i],i+1);
        ComEndConfigSheet(sheetObjects[i]);
    }
    for(var k=0;k<comboObjects.length;k++){
        initCombo(comboObjects[k],k+1);
    }
    initControl();
    doActionIBCombo(sheetObjects[0], document.form, SEARCH01);
    
    // auth_tp_cd retrieve
    doActionIBSheet(sheetObjects[0], formObj, SEARCH20);
    var authTpCd=G_AHTU_TP_CD;

    if(G_MDAA_CHK == 'Y')
        ComEnableObject(formObj.delt_flg, true); 
    else
        ComEnableObject(formObj.delt_flg, false);

    // If the Process Status screen call, in the Detail PopUp
    var rqstNo=formObj.rqst_no.value;
    if(rqstNo != '') {
        doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
        ComSetDisplay('btn_Close', true);
        var procTpCd=formObj.proc_tp_cd.value;
        var rqstUsrChk=formObj.rqst_usr_chk.value;
        ComEnableObject(formObj.btns_search7, false);
        // Process Type is 'Reject' and AuthType is not 'Approval'(possible modifications and ReOpen)
        if(procTpCd == 'R' &&  ( ((authTpCd == 'R' || authTpCd == 'S') && rqstUsrChk == 'Y') || G_MDAA_CHK == 'Y') ) {
            ComSetDisplay('btn_Request', true);
            ComGetObject("btn_Request").style.setProperty("color", "#FF0000", "important");
            ComSetDisplay('btn_Retrieve', true);
            ComSetDisplay('btn_Save', true);
            doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
        } else if(procTpCd == 'A') {
            doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
            ComEnableObject(formObj.btns_search7, false);
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
*Define an event control
*/
function initControl() {
    var formObj=document.form;
    axon_event.addListener('change', 'obj_change', 'yd_fcty_tp_rail_rmp_flg');
//    axon_event.addListener('click', 'obj_click', 'yd_fcty_tp_psdo_yd_flg');
//      axon_event.addListenerForm('focus', 'obj_focus', formObj);
//      axon_event.addListenerFormat ('keypress', 'obj_keypress', form);
//      axon_event.addListenerForm  ('change', 'obj_change', form);
//      axon_event.addListenerForm  ('beforedeactivate', 'obj_deactivate',  form);     //- focus out "
//      axon_event.addListener('keyup', 'obj_keyup', 'yd_brth_len'
//                                                 , 'yd_brth_alng_sd_desc'
//                                                 , 'yd_brth_dpth_chnl_knt'
//                                                 , 'yd_ttl_spc'
//                                                 , 'yd_act_spc'
//                                                 , 'yd_co_spc'
//                                                 , 'yd_cfs_spc'
//                                                 , 'yd_rf_rcpt_440v_knt'
//                                                 , 'yd_rf_rcpt_220v_knt'
//                                                 , 'yd_rf_rcpt_dul_knt'
//                                                 , 'yd_pst_pgc_knt'
//                                                 , 'yd_pgc_knt'
//                                                 , 'trstr_knt'
//                                                 , 'frk_knt'
//                                                 , 'yd_strdl_crr_knt'
//                                                 , 'yd_trct_knt'
//                                                 , 'yd_top_lft_knt'
//                                                 , 'tml_chss_knt'
//                                                 , 'yd_hndl_capa'
//                                                 , 'tml_prod_knt'
//                                                 , 'yd_ttl_vol_teu_knt'
//                                                 , 'yd_ttl_vol_bx_knt'
//                                                 , 'yd_co_vol_teu_knt'
//                                                 , 'yd_co_vol_bx_knt');
//ComClearSeparator (document.form.yd_cd,"eng"); //Only English 
//ComClearSeparator (document.form.yd_nm,"eng"); //Only English
//ComClearSeparator (document.form.n1st_vndr_seq,"eng"); //Only English
//ComClearSeparator (document.form.n2nd_vndr_seq,"eng"); //Only English
//ComClearSeparator (document.form.n3rd_vndr_seq,"eng"); //Only English
//ComClearSeparator (document.form.ofc_cd,"eng"); //Only English
//ComClearSeparator (document.form.dmdt_ofc_cd,"eng"); //Only English
//ComClearSeparator (document.form.rep_zn_cd,"eng"); //Only English
//ComClearSeparator (document.form.yd_addr,"eng"); //Only English
//ComClearSeparator (document.form.yd_cstms_no,"eng"); //Only English
//ComClearSeparator (document.form.yd_ceo_nm,"eng"); //Only English
//ComClearSeparator (document.form.yd_pic_nm,"eng"); //Only English
//ComClearSeparator (document.form.yd_eml,"eng"); //Only English
//ComClearSeparator (document.form.zip_cd,"eng"); //Only English
//ComClearSeparator (document.form.yd_cgo_clz_hrmnt_msg,"eng"); //Only English
//ComClearSeparator (document.form.yd_brth_alng_sd_desc,"eng"); //Only English
//ComClearSeparator (document.form.delt_flg,"eng"); //Only English
}
/**
* The default setting Combo
* If the number of combo a combo by adding the number of case sheets to initialize the module configuration. 
*/ 
function initCombo(comboObj, comboNo) {
var formObject=document.form;
switch(comboObj.options.id) {  
    case "yd_chr_cd":       //Yard Character
        with (comboObj) { 
            SetMultiSelect(0);
            SetUseAutoComplete(1);
            SetColAlign(0, "left");
            SetColWidth(0, "80");
            SetDropHeight(100);
            SetMaxLength(2);
        }
    break;
    
    case "yd_oshp_cd":      //Yard Ownership
        with (comboObj) { 
            SetMultiSelect(0);
            SetUseAutoComplete(1);
            SetColAlign(0, "left");
            SetColWidth(0, "108");
            SetDropHeight(100);
            SetMaxLength(2);
        }
    break;
    
    case "yd_op_sys_cd":        //Operation System
        with (comboObj) { 
            SetMultiSelect(0);
            SetUseAutoComplete(1);
            SetColAlign(0, "left");
            SetColWidth(0, "108");
            SetDropHeight(150);
            SetMaxLength(2);
        }
    break;
}
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
          sheetObj.SetVisible(0);
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
            var sXml=sheetObj.GetSearchData("BCM_CCD_0020GS.do", "f_cmd=" + SEARCH01);
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
   var formObj=document.form;
   var prefix="sheet1_";
   switch(sAction) {
    case IBSEARCH:      //retrieve
        if(validateForm(sheetObj,formObj,sAction)){

            ComOpenWait(true);
            if( formObj.rqst_no.value == ''){
                formObj.f_cmd.value=SEARCH;
            }else{
                formObj.f_cmd.value=SEARCH15;
            }

            var yd_cd=formObj.yd_cd.value;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0020GS.do", sParam);
            sheetObj.LoadSearchData(sXml,{Sync:1} );
            var yd_nm=ComXmlString(sXml, "yd_nm");
            var rqstNo=ComGetEtcData(sXml, "RQST_NO");
            ComSetObjValue(formObj.rqst_no, rqstNo);

            if(yd_nm == ""){
                formObj.reset();
                formObj.creflag.value="Y";
                formObj.yd_cd.value=yd_cd;
                yd_chr_cd.SetSelectText("");
                yd_oshp_cd.SetSelectText("");
                yd_op_sys_cd.SetSelectText("");
//                formObj.modi_yd_cd.value = "";
                formObj.ibflag.value="I"
                if(G_AHTU_TP_CD=="A"){
                    ComShowCodeMessage("CCD00033", "Yard Code");
                    doActionIBSheet(sheetObj, formObj, IBCLEAR);
                }else{
                    if(!ComShowConfirm(ComGetMsg("CCD00034", "Yard Code"))){
                        doActionIBSheet(sheetObj, formObj, IBCLEAR);
                    }
                }
            }else{
                formObj.creflag.value="N";
                formObj.yd_nm.value=yd_nm;
                formObj.yd_cd.value=ComXmlString(sXml, "yd_cd");
                formObj.yd_locl_lang_nm.value=ComXmlString(sXml, "yd_locl_lang_nm");
                //formObj.eq_scc_cd.value=ComXmlString(sXml, "eq_scc_cd");
                formObj.n1st_vndr_seq.value=ComXmlString(sXml, "n1st_vndr_seq");
                formObj.n1st_vndr_nm.value=ComXmlString(sXml, "n1st_vndr_nm");
                formObj.n2nd_vndr_seq.value=ComXmlString(sXml, "n2nd_vndr_seq");
                formObj.n2nd_vndr_nm.value=ComXmlString(sXml, "n2nd_vndr_nm");
                formObj.n3rd_vndr_seq.value=ComXmlString(sXml, "n3rd_vndr_seq");
                formObj.n3rd_vndr_nm.value=ComXmlString(sXml, "n3rd_vndr_nm");
                formObj.ofc_cd.value=ComXmlString(sXml, "ofc_cd");
                formObj.dmdt_ofc_cd.value=ComXmlString(sXml, "dmdt_ofc_cd");
                formObj.dem_ib_clt_flg.value=ComXmlString(sXml, "dem_ib_clt_flg");
                formObj.dem_ob_clt_flg.value=ComXmlString(sXml, "dem_ob_clt_flg");
                formObj.rep_zn_cd.value=ComXmlString(sXml, "rep_zn_cd");
                formObj.bd_yd_flg.value=ComXmlString(sXml, "bd_yd_flg");
                formObj.mnr_shop_flg.value=ComXmlString(sXml, "mnr_shop_flg");
                formObj.eir_svc_flg.value=ComXmlString(sXml, "eir_svc_flg");
                formObj.hub_yd_flg.value=ComXmlString(sXml, "hub_yd_flg");
//                formObj.bkg_pod_yd_flg.value=ComXmlString(sXml, "bkg_pod_yd_flg");
                if(ComXmlString(sXml, "rail_arr_ntfc_flg") != "")
                	formObj.rail_arr_ntfc_flg.value=ComXmlString(sXml, "rail_arr_ntfc_flg");
                else
                	formObj.rail_arr_ntfc_flg.value="N";
                formObj.yd_addr.value=ComXmlString(sXml, "yd_addr");
                formObj.yd_locl_lang_addr.value=ComXmlString(sXml, "yd_locl_lang_addr");
                
                formObj.dry_avg_dwll_hrs.value=ComXmlString(sXml, "dry_avg_dwll_hrs");
                formObj.dry_min_dwll_hrs.value=ComXmlString(sXml, "dry_min_dwll_hrs");
                formObj.rf_avg_dwll_hrs.value=ComXmlString(sXml, "rf_avg_dwll_hrs");
                formObj.rf_min_dwll_hrs.value=ComXmlString(sXml, "rf_min_dwll_hrs");
                
                formObj.yd_cstms_no.value=ComXmlString(sXml, "yd_cstms_no");
                formObj.yd_ceo_nm.value=ComXmlString(sXml, "yd_ceo_nm");
                formObj.yd_pic_nm.value=ComXmlString(sXml, "yd_pic_nm");
                formObj.yd_eml.value=ComXmlString(sXml, "yd_eml");
                formObj.zip_cd.value=ComXmlString(sXml, "zip_cd");
                formObj.intl_phn_no.value=ComXmlString(sXml, "intl_phn_no");
                formObj.phn_no.value=ComXmlString(sXml, "phn_no");
                formObj.fax_no.value=ComXmlString(sXml, "fax_no");
                formObj.gate_opn_hrmnt.value=ComGetMaskedValue(ComXmlString(sXml, "gate_opn_hrmnt"),"hm");
                formObj.gate_clz_hrmnt.value=ComGetMaskedValue(ComXmlString(sXml, "gate_clz_hrmnt"),"hm");
                formObj.sat_gate_opn_hrmnt.value=ComGetMaskedValue(ComXmlString(sXml, "sat_gate_opn_hrmnt"),"hm");
                formObj.sat_gate_clz_hrmnt.value=ComGetMaskedValue(ComXmlString(sXml, "sat_gate_clz_hrmnt"),"hm");
                formObj.sun_gate_opn_hrmnt.value=ComGetMaskedValue(ComXmlString(sXml, "sun_gate_opn_hrmnt"),"hm");
                formObj.sun_gate_clz_hrmnt.value=ComGetMaskedValue(ComXmlString(sXml, "sun_gate_clz_hrmnt"),"hm");
                formObj.hol_gate_opn_hrmnt.value=ComGetMaskedValue(ComXmlString(sXml, "hol_gate_opn_hrmnt"),"hm");
                formObj.hol_gate_clz_hrmnt.value=ComGetMaskedValue(ComXmlString(sXml, "hol_gate_clz_hrmnt"),"hm");
                formObj.yd_inrl_flg.value=ComXmlString(sXml, "yd_inrl_flg");
                formObj.yd_cgo_clz_hrmnt_msg.value=ComXmlString(sXml, "yd_cgo_clz_hrmnt_msg");
                formObj.brth_no.value=ComXmlString(sXml, "brth_no");
                formObj.yd_brth_len.value=ComXmlString(sXml, "yd_brth_len");
                formObj.yd_brth_len.value=ComAddComma(formObj.yd_brth_len);
                formObj.yd_brth_alng_sd_desc.value=ComXmlString(sXml, "yd_brth_alng_sd_desc");
                if(ComIsNumber(formObj.yd_brth_alng_sd_desc.value)) formObj.yd_brth_alng_sd_desc.value=ComAddComma(formObj.yd_brth_alng_sd_desc);
                formObj.yd_brth_dpth_chnl_knt.value=ComXmlString(sXml, "yd_brth_dpth_chnl_knt");
                formObj.yd_brth_dpth_chnl_knt.value=ComAddComma(formObj.yd_brth_dpth_chnl_knt);
                formObj.yd_ttl_spc.value=ComXmlString(sXml, "yd_ttl_spc");
                formObj.yd_ttl_spc.value=ComAddComma(formObj.yd_ttl_spc);
                formObj.yd_act_spc.value=ComXmlString(sXml, "yd_act_spc");
                formObj.yd_act_spc.value=ComAddComma(formObj.yd_act_spc);
                formObj.yd_co_spc.value=ComXmlString(sXml, "yd_co_spc");
                formObj.yd_co_spc.value=ComAddComma(formObj.yd_co_spc);
                formObj.yd_cfs_spc.value=ComXmlString(sXml, "yd_cfs_spc");
                formObj.yd_cfs_spc.value=ComAddComma(formObj.yd_cfs_spc);
                formObj.yd_rf_rcpt_440v_knt.value=ComXmlString(sXml, "yd_rf_rcpt_440v_knt");
                formObj.yd_rf_rcpt_440v_knt.value=ComAddComma(formObj.yd_rf_rcpt_440v_knt);
                formObj.yd_rf_rcpt_220v_knt.value=ComXmlString(sXml, "yd_rf_rcpt_220v_knt");
                formObj.yd_rf_rcpt_220v_knt.value=ComAddComma(formObj.yd_rf_rcpt_220v_knt);
                formObj.yd_rf_rcpt_dul_knt.value=ComXmlString(sXml, "yd_rf_rcpt_dul_knt");
                formObj.yd_rf_rcpt_dul_knt.value=ComAddComma(formObj.yd_rf_rcpt_dul_knt);
                formObj.yd_pst_pgc_knt.value=ComXmlString(sXml, "yd_pst_pgc_knt");
                formObj.yd_pst_pgc_knt.value=ComAddComma(formObj.yd_pst_pgc_knt);
                formObj.yd_pgc_knt.value=ComXmlString(sXml, "yd_pgc_knt");
                formObj.yd_pgc_knt.value=ComAddComma(formObj.yd_pgc_knt);
                formObj.trstr_knt.value=ComXmlString(sXml, "trstr_knt");
                formObj.trstr_knt.value=ComAddComma(formObj.trstr_knt);
                formObj.frk_knt.value=ComXmlString(sXml, "frk_knt");
                formObj.frk_knt.value=ComAddComma(formObj.frk_knt);
                formObj.yd_strdl_crr_knt.value=ComXmlString(sXml, "yd_strdl_crr_knt");
                formObj.yd_strdl_crr_knt.value=ComAddComma(formObj.yd_strdl_crr_knt);
                formObj.yd_trct_knt.value=ComXmlString(sXml, "yd_trct_knt");
                formObj.yd_trct_knt.value=ComAddComma(formObj.yd_trct_knt);
                formObj.yd_top_lft_knt.value=ComXmlString(sXml, "yd_top_lft_knt");
                formObj.yd_top_lft_knt.value=ComAddComma(formObj.yd_top_lft_knt);
                formObj.tml_chss_knt.value=ComXmlString(sXml, "tml_chss_knt");
                formObj.tml_chss_knt.value=ComAddComma(formObj.tml_chss_knt);
                formObj.yd_hndl_yr.value=ComXmlString(sXml, "yd_hndl_yr");
                formObj.yd_hndl_capa.value=ComXmlString(sXml, "yd_hndl_capa");
                formObj.yd_hndl_capa.value=ComAddComma(formObj.yd_hndl_capa);
                formObj.tml_prod_knt.value=ComXmlString(sXml, "tml_prod_knt");
                formObj.tml_prod_knt.value=ComAddComma(formObj.tml_prod_knt);
                formObj.yd_ttl_vol_teu_knt.value=ComXmlString(sXml, "yd_ttl_vol_teu_knt");
                formObj.yd_ttl_vol_teu_knt.value=ComAddComma(formObj.yd_ttl_vol_teu_knt);
                formObj.yd_ttl_vol_bx_knt.value=ComXmlString(sXml, "yd_ttl_vol_bx_knt");
                formObj.yd_ttl_vol_bx_knt.value=ComAddComma(formObj.yd_ttl_vol_bx_knt);
                formObj.yd_co_vol_teu_knt.value=ComXmlString(sXml, "yd_co_vol_teu_knt");
                formObj.yd_co_vol_teu_knt.value=ComAddComma(formObj.yd_co_vol_teu_knt);
                formObj.yd_co_vol_bx_knt.value=ComXmlString(sXml, "yd_co_vol_bx_knt");
                formObj.yd_co_vol_bx_knt.value=ComAddComma(formObj.yd_co_vol_bx_knt);
                formObj.yd_rmk.value=ComXmlString(sXml, "yd_rmk");
                formObj.delt_flg.value=ComXmlString(sXml, "delt_flg");
                yd_chr_cd.SetSelectCode(ComXmlString(sXml, "yd_chr_cd"));
                yd_oshp_cd.SetSelectCode(ComXmlString(sXml, "yd_oshp_cd"));
                yd_op_sys_cd.SetSelectCode(ComXmlString(sXml, "yd_op_sys_cd"));
                if(ComXmlString(sXml, "yd_fcty_tp_cy_flg")=='Y'){
                    formObj.yd_fcty_tp_cy_flg.checked=true;
                }else{
                    formObj.yd_fcty_tp_cy_flg.checked=false;
                }
                if(ComXmlString(sXml, "yd_fcty_tp_rail_rmp_flg")=='Y'){
                    formObj.yd_fcty_tp_rail_rmp_flg.checked=true;
                    ComEnableObject(formObj.rail_arr_ntfc_flg, true);
                }else{
                    formObj.yd_fcty_tp_rail_rmp_flg.checked=false;
                    ComEnableObject(formObj.rail_arr_ntfc_flg, false);
                }
                if(ComXmlString(sXml, "yd_fcty_tp_mrn_tml_flg")=='Y'){
                    formObj.yd_fcty_tp_mrn_tml_flg.checked=true;
                }else{
                    formObj.yd_fcty_tp_mrn_tml_flg.checked=false;
                }
                if(ComXmlString(sXml, "yd_fcty_tp_cfs_flg")=='Y'){
                    formObj.yd_fcty_tp_cfs_flg.checked=true;
                }else{
                    formObj.yd_fcty_tp_cfs_flg.checked=false;
                }
                if(ComXmlString(sXml, "yd_fcty_tp_brg_rmp_flg")=='Y'){
                    formObj.yd_fcty_tp_brg_rmp_flg.checked=true;
                }else{
                    formObj.yd_fcty_tp_brg_rmp_flg.checked=false;
                }
                if(ComXmlString(sXml, "yd_fcty_tp_psdo_yd_flg")=='Y'){
                    formObj.yd_fcty_tp_psdo_yd_flg.checked=true;
                    //setClassName(formObj.eq_scc_cd, "input");
                }else{
                    formObj.yd_fcty_tp_psdo_yd_flg.checked=false;
                    //setClassName(formObj.eq_scc_cd, "input1");
                }
                if(ComXmlString(sXml, "yd_inrl_flg")=='Y'){
                    formObj.yd_inrl_flg.checked=true;
                }else{
                    formObj.yd_inrl_flg.checked=false;
                }
                formObj.ibflag.value="U";
                formObj.yd_cd.readOnly=true;
//     		    formObj.modi_yd_cd.value = ComXmlString(sXml, "modi_yd_cd");
//     		    formObj.old_modi_yd_cd.value = ComXmlString(sXml, "modi_yd_cd");
     		    formObj.cre_usr_id.value = ComXmlString(sXml, "cre_usr_id");
				formObj.cre_dt.value = ComXmlString(sXml, "cre_dt");
				formObj.upd_usr_id.value = ComXmlString(sXml, "upd_usr_id");
				formObj.upd_dt.value = ComXmlString(sXml, "upd_dt");
				
				formObj.yd_lat.value=ComXmlString(sXml, "yd_lat");
				formObj.yd_lon.value=ComXmlString(sXml, "yd_lon");
				
                formObj.vsl_capa.value=ComXmlString(sXml, "vsl_capa"); //2017.02.28 NYK ADD
            }
        }
    break;
    
    case IBSAVE:
        if(validateForm(sheetObj,formObj,sAction)){
            formObj.f_cmd.value=SEARCH11;
            var sParam=FormQueryString(formObj);
            var sXml = sheetObj.GetSearchData("BCM_CCD_0020GS.do", sParam + "&" + ComGetPrefixParam("sheet1_"));
            var result=ComGetEtcData(sXml, "CHECK_RESULT");
            if(result != null && result !=""){
            	ComShowCodeMessage(result, formObj.yd_cd.value.substring(0, 5));
            	return;
            }
            
            if( formObj.creflag.value == "N" && formObj.rqst_no.value == ''){
                formObj.f_cmd.value=MULTI;
            }else{
                formObj.f_cmd.value=MULTI01;
                ComEnableObject(form.btns_search7, false);
            }
            sParam=FormQueryString(formObj);
            var tmpMsg="";
            if(formObj.creflag.value != "N" && formObj.rqst_no.value == ''){
                tmpMsg="CCD00035";
            }else{
                tmpMsg="COM130101";
            }
            if(ComShowCodeConfirm(tmpMsg, "Data")){
                ComOpenWait(true);
                var sXml=sheetObj.GetSaveData("BCM_CCD_0020GS.do", sParam + "&" + ComGetPrefixParam("sheet1_"));
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
    
    case SEARCH02:      //Handling Vendor check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH02;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0020GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Handling Vendor");
                formObj.n1st_vndr_seq.value="";
                formObj.n1st_vndr_nm.value="";
            }else {
                var arrVal=result.split("|&&|");
                formObj.n1st_vndr_seq.value=arrVal[0];
                formObj.n1st_vndr_nm.value=arrVal[1];
            }
            ComOpenWait(false);
        }
    break;
    
    case SEARCH03:      //Stevedoring Vendor check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH03;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0020GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Stevedoring Vendor");
                formObj.n2nd_vndr_seq.value="";
                formObj.n2nd_vndr_nm.value="";
            } else {
                var arrVal=result.split("|&&|");
                formObj.n2nd_vndr_seq.value=arrVal[0];
                formObj.n2nd_vndr_nm.value=arrVal[1];
            }
            ComOpenWait(false);
        }
    break;
    
    case SEARCH04:      //Security Vendor check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH04;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0020GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Security Vendor");
                formObj.n3rd_vndr_seq.value="";
                formObj.n3rd_vndr_nm.value="";
            } else {
                var arrVal=result.split("|&&|");
                formObj.n3rd_vndr_seq.value=arrVal[0];
                formObj.n3rd_vndr_nm.value=arrVal[1];
            }
            ComOpenWait(false);
        }
    break;
    
    case SEARCH05:      //Control Office check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH05;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0020GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Control Office");
                formObj.ofc_cd.value="";
            }
            ComOpenWait(false);
        }
    break;
    
    case SEARCH06:      //DEM/DET Office check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH06;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0020GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "DEM/DET Office");
                formObj.dmdt_ofc_cd.value="";
            }
            ComOpenWait(false);
        }
    break;
    
    case SEARCH07:      //Rep. Zone check
        if(validateForm(sheetObj,formObj,sAction)){
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH07;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0020GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            if(result==""){
                ComShowCodeMessage("COM130402", "Rep.Zone Code");
                formObj.rep_zn_cd.value="";
            }
            ComOpenWait(false);
        }
    break;
    
    case SEARCH08:      //Yark Code :Location Validation of the previous five-digit code
        ComOpenWait(true);
        formObj.f_cmd.value=SEARCH08;
        var sParam="f_cmd="+formObj.f_cmd.value+"&loc_cd="+formObj.yd_cd.value.substring(0, 5);
        var sXml=sheetObj.GetSearchData("BCM_CCD_0020GS.do", sParam);
        var result=ComGetEtcData(sXml, "result");
        ComOpenWait(false);
        return result;
    break;
    
    case SEARCH09:      //Yark Code :Redundancy check with MDM_LSE_CO_YD.LSE_CO_YD_CD
        ComOpenWait(true);
        formObj.f_cmd.value=SEARCH09;
        var sParam="f_cmd="+formObj.f_cmd.value+"&yd_cd="+formObj.yd_cd.value;
        var sXml=sheetObj.GetSearchData("BCM_CCD_0020GS.do", sParam);
        var result=ComGetEtcData(sXml, "result");
        ComOpenWait(false);
        return result;
    break;
    
    case SEARCH12:      //Yark Code :Redundancy check with MDM_LSE_CO_YD.LSE_CO_YD_CD
        ComOpenWait(true);
        formObj.f_cmd.value=SEARCH12;
        var sParam="f_cmd="+formObj.f_cmd.value+"&yd_cd="+formObj.yd_cd.value;
        var sXml=sheetObj.GetSearchData("BCM_CCD_0020GS.do", sParam);
        var result=ComGetEtcData(sXml, "result");
        ComOpenWait(false);
        return result;
    break;
    
//    2015.01.07 not use EQ SCC
//    case SEARCH10:      //EQ SCC : Validation data exist MDM_EQ_ORZ_CHT.
//        ComOpenWait(true);
//        formObj.f_cmd.value=SEARCH10;
//        var sParam="f_cmd="+formObj.f_cmd.value+"&scc_cd="+formObj.eq_scc_cd.value;
//        var sXml=sheetObj.GetSearchData("BCM_CCD_0020GS.do", sParam);
//        var result=ComGetEtcData(sXml, "result");
//        ComOpenWait(false);
//        return result;
//    break;
    
    case SEARCH20: // MDM AUTH_TP_CD query
        var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=YARD';
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
        clearAllData(sheetObj, formObj);
        ComEnableObject(formObj.btns_search7, true);
        ComEnableObject(formObj.rail_arr_ntfc_flg, false);
        formObj.old_modi_yd_cd.value = "";
		formObj.edi_if_flg.value = "N";
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
            if(formObj.yd_cd.value == ""){
                ComShowCodeMessage("CCD00001", "Yard Code");
                return false;
            }
        }
        break;
    case IBSAVE:        //save
        if(formObj.yd_inrl_flg.checked){
            formObj.yd_inrl_flg.value='Y';
        }
        if(formObj.yd_cd.value == ""){
            ComShowCodeMessage("CCD00001", "Yard Code");
            formObj.yd_cd.focus();
            return false;
        }else if(formObj.yd_nm.value == ""){
            ComShowCodeMessage("CCD00001", "English Name");
            formObj.yd_nm.focus();
            return false;
        }else if(yd_chr_cd.GetSelectText()== ""){
            ComShowCodeMessage("CCD00001", "Yard Character");
            yd_chr_cd.Focus();
            return false;
        }else if(yd_oshp_cd.GetSelectText()== ""){
            ComShowCodeMessage("CCD00001", "Yard Ownership");
            yd_oshp_cd.Focus();
            return false;
//        2015.01.07 not use EQ SCC
//        }else if(!formObj.yd_fcty_tp_psdo_yd_flg.checked && formObj.eq_scc_cd.value == ""){
//            ComShowCodeMessage("CCD00001", "EQ SCC");
//            formObj.eq_scc_cd.focus();
//            return false;
        }else if(formObj.n1st_vndr_seq.value == ""){
            ComShowCodeMessage("CCD00001", "Handling Vendor");
            formObj.n1st_vndr_seq.focus();
            return false;
        }else if(formObj.ofc_cd.value == ""){
            ComShowCodeMessage("CCD00001", "Control Office");
            formObj.ofc_cd.focus();
            return false;
        }else if(formObj.dmdt_ofc_cd.value == ""){
            ComShowCodeMessage("CCD00001", "DEM/DET Office");
            formObj.dmdt_ofc_cd.focus();
            return false;
        }else if(formObj.yd_addr.value == ""){
            ComShowCodeMessage("CCD00001", "English Address");
            formObj.yd_addr.focus();
            return false;
        }else if(formObj.intl_phn_no.value == ""){
            ComShowCodeMessage("CCD00001", "International Tel No");
            formObj.intl_phn_no.focus();
            return false;
        }else if(formObj.phn_no.value == ""){
            ComShowCodeMessage("CCD00001", "Tel No");
            formObj.phn_no.focus();
            return false;
        }else if(formObj.fax_no.value == ""){
            ComShowCodeMessage("CCD00001", "Fax No");
            formObj.fax_no.focus();
            return false;
        }else if(formObj.gate_opn_hrmnt.value == ""){
            ComShowCodeMessage("CCD00001", "GATE OPN(WEEK)");
            formObj.gate_opn_hrmnt.focus();
            return false;
        }else if(formObj.gate_clz_hrmnt.value == ""){
            ComShowCodeMessage("CCD00001", "GATE CLZ(WEEK)");
            formObj.gate_clz_hrmnt.focus();
            return false;
        }else if(formObj.sat_gate_opn_hrmnt.value == ""){
            ComShowCodeMessage("CCD00001", "GATE OPN(Sat)");
            formObj.sat_gate_opn_hrmnt.focus();
            return false;
        }else if(formObj.sat_gate_clz_hrmnt.value == ""){
            ComShowCodeMessage("CCD00001", "GATE CLZ(Sat)");
            formObj.sat_gate_clz_hrmnt.focus();
            return false;
        }else if(formObj.sun_gate_opn_hrmnt.value == ""){
            ComShowCodeMessage("CCD00001", "GATE OPN(Sun)");
            formObj.sun_gate_opn_hrmnt.focus();
            return false;
        }else if(formObj.sun_gate_clz_hrmnt.value == ""){
            ComShowCodeMessage("CCD00001", "GATE CLZ(Sun)");
            formObj.sun_gate_clz_hrmnt.focus();
            return false;
        }else if(formObj.hol_gate_opn_hrmnt.value == ""){
            ComShowCodeMessage("CCD00001", "GATE OPN(Hol)");
            formObj.hol_gate_opn_hrmnt.focus();
            return false;
        }else if(formObj.hol_gate_clz_hrmnt.value == ""){
            ComShowCodeMessage("CCD00001", "GATE CLZ(Hol)");
            formObj.hol_gate_clz_hrmnt.focus();
            return false;
        }else if(formObj.dry_avg_dwll_hrs.value == ""){
            ComShowCodeMessage("CCD00001", "Dry AVG Dwell Hours");
            formObj.dry_avg_dwll_hrs.focus();
            return false;
        }else if(formObj.dry_min_dwll_hrs.value == ""){
            ComShowCodeMessage("CCD00001", "Dry MIN Dwell Hours");
            formObj.dry_min_dwll_hrs.focus();
            return false;
        }else if(formObj.rf_avg_dwll_hrs.value == ""){
            ComShowCodeMessage("CCD00001", "Reffer AVG Dwell Hours");
            formObj.rf_avg_dwll_hrs.focus();
            return false;
        }else if(formObj.rf_min_dwll_hrs.value == ""){
            ComShowCodeMessage("CCD00001", "Reffer MIN Dwell Hours");
            formObj.rf_min_dwll_hrs.focus();
            return false;
        }    
//        }else if(formObj.modi_yd_cd.value == ""){
//            ComShowCodeMessage("CCD00001", "Legacy Code");
//            formObj.modi_yd_cd.focus();
//            return false;
//        }
        
//        if (formObj.modi_yd_cd.value != formObj.old_modi_yd_cd.value) {
//        	formObj.edi_if_flg.value = "Y";
//        } else {
//        	formObj.edi_if_flg.value = "N";
//        }
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
            case "yd_cd":
                if(formObject.yd_cd.value.length>0){
                    if(doActionIBSheet(sheetObject1, formObject, SEARCH08)==""){
                        ComShowCodeMessage("CCD00013", formObject.yd_cd.value.substring(0, 5));
                        formObject.yd_cd.value="";
                        formObject.yd_cd.focus();
                    }else if(!doActionIBSheet(sheetObject1, formObject, SEARCH09)==""){
                        ComShowCodeMessage("CCD00014");
                        formObject.yd_cd.value="";
                        formObject.yd_cd.focus();
                    }else {
                    	result = doActionIBSheet(sheetObject1, formObject, SEARCH12);
                    	
                    	if(result == "no scc(c)"){
                    		ComShowCodeMessage("CCD00078", formObject.yd_cd.value.substring(0, 5), "creation");
                    		formObject.yd_cd.value="";
                            formObject.yd_cd.focus();
                    	} else if(result == "no scc(a)"){
                    		ComShowCodeMessage("CCD00078", formObject.yd_cd.value.substring(0, 5), "amendment");
                    		doActionIBSheet(sheetObject1, formObject, IBSEARCH);	
                    	} else {
                    		doActionIBSheet(sheetObject1, formObject, IBSEARCH);
                    	}
                    }
                }
            break;
            case "yd_fcty_tp_rail_rmp_flg":
                if(formObject.yd_fcty_tp_rail_rmp_flg.checked){
                    ComEnableObject(formObject.rail_arr_ntfc_flg, true);
                }else{
                	if(formObject.rail_arr_ntfc_flg.value=="Y") {
                    	alert("Check Arrival Notification value first.");
                    	formObject.yd_fcty_tp_rail_rmp_flg.checked=true;
                    	break;
                	}
                    ComEnableObject(formObject.rail_arr_ntfc_flg, false);
                }
            break;
//          2015.01.07 not use EQ SCC
//            case "eq_scc_cd":
//                if(formObject.eq_scc_cd.value.length>0){
//                    if(doActionIBSheet(sheetObject1, formObject, SEARCH10)==""){
//                        ComShowCodeMessage("CCD00015");
//                        formObject.eq_scc_cd.value="";
//                        formObject.eq_scc_cd.focus();
//                    }
//                }
//            break;
            case "n1st_vndr_seq":
                if(formObject.n1st_vndr_seq.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH02);
                }else{
                    formObject.n1st_vndr_nm.value="";
                }
            break;
            case "n2nd_vndr_seq":
                if(formObject.n2nd_vndr_seq.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH03);
                }else{
                    formObject.n2nd_vndr_nm.value="";
                }
            break;
            case "n3rd_vndr_seq":
                if(formObject.n3rd_vndr_seq.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH04);
                }else{
                    formObject.n3rd_vndr_nm.value="";
                }
            break;
            case "ofc_cd":
                if(formObject.ofc_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH05);
                }
            break;
            case "dmdt_ofc_cd":
                if(formObject.dmdt_ofc_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH06);
                }
            break;
            case "rep_zn_cd":
                if(formObject.rep_zn_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH07);
                }
            break;
            case "delt_flg":
                if(formObject.delt_flg.value == "Y") {
                    if(!ComShowCodeConfirm("COM130301", "data")) formObject.delt_flg.value="N";
                } else if(formObject.delt_flg.value == "N") {
                	if(doActionIBSheet(sheetObject1, formObject, SEARCH12)=="no scc"){
                    	ComShowCodeMessage("CCD00078", formObject.yd_cd.value.substring(0, 5), "reactivation");
                    	formObject.delt_flg.value="Y";
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
// 2015.01.07 not use EQ SCC
//function obj_click() {
//    var obj=ComGetEvent();
//    var formObj=document.form;
//
//    if(obj.checked) {
//        setClassName(formObj.eq_scc_cd, "input");
//    }else {
//        setClassName(formObj.eq_scc_cd, "input1");
//    }
//}
/*
 * 
 */
function clearAllData(sheetObj, formObj){
    formObj.reset();
    formObj.rqst_no.value="";
    yd_chr_cd.SetSelectText("");
    yd_oshp_cd.SetSelectText("");
    yd_op_sys_cd.SetSelectText("");
    formObj.delt_flg.value="N";
    formObj.ibflag.value="I";
    formObj.yd_cd.readOnly=false;
//  2015.01.07 not use EQ SCC
//    setClassName(formObj.eq_scc_cd, "input1");
}
function n1VndrCodeHelp(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.n1st_vndr_seq.value=colArray[2];
    formObj.n1st_vndr_nm.value=colArray[4];
}
function n2VndrCodeHelp(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.n2nd_vndr_seq.value=colArray[2];
    formObj.n2nd_vndr_nm.value=colArray[4];
}
function n3VndrCodeHelp(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.n3rd_vndr_seq.value=colArray[2];
    formObj.n3rd_vndr_nm.value=colArray[4];
}
function ofcCodeHelp(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.ofc_cd.value=colArray[1];
}
function dmdtOfcCodeHelp(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.dmdt_ofc_cd.value=colArray[1];
}
function zoneCodeHelp(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];   
    formObj.rep_zn_cd.value=colArray[3];
}
function yardCodeHelp(rowArray) {
    var formObj=document.form;
    var colArray=rowArray[0];
    if(rowArray != "") {
    	formObj.yd_cd.value=colArray[3];
    } else {
    	formObj.yd_cd.value="Node Code";
    }    
    if(formObj.yd_cd.value.length>0){    	
    	doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
    }
}

//2015.01.07 not use EQ SCC
//function sccCodeHelp(rowArray) {
//    var formObj=document.form;
//    var colArray=rowArray[0];   
//    formObj.eq_scc_cd.value=colArray[1];
//}

//2015.01.07 not use EQ SCC
//function setClassName(obj, val) {
//     obj.className=val;
//}

function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) {
    ComOpenWait(false);
}

function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
    ComOpenWait(false);
}
