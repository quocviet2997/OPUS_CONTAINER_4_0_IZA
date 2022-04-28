/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0008.js
*@FileTitle  : Container Vessel
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/09
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
        case "btns_search1": // Vessel Code pop-up
            if(window.event.srcElement.style.cursor == "default") return;
            ComOpenPopup('/opuscntr/COM_ENS_0A1.do?mdm_yn='+formObj.mdm_yn.value, 950, 480, 'getVsl_cd', "1,0,1,1,1", true, false, 0, 0, 0, "COM_ENS_0A1");
//            ComOpenPopup("ESM_FMS_0022.do", 520, 440,"setVslCd", "1,0,1,1,1", false, false, 0, 0, 0, "ESM_FMS_0022");
            break;
        case "btns_search2": // Carrier pop-up
            ComOpenPopup('/opuscntr/COM_ENS_0N1.do', 600, 500, 'getCrr_cd', "1,0,1", true);
            break;
        case "btns_search3": // Flag pop-up
            ComOpenPopup('/opuscntr/COM_ENS_0M1.do', 600, 520, 'getVsl_rgst_cnt_cd', "1,0,1", true);
            break;
        case "btns_search4": // Port Of Registry pop-up
            //ComOpenPopup('/opuscntr/COM_ENS_051.do', 1050, 530, 'getRgst_port_cd', "1,0,1", true);
        	ComOpenPopup('/opuscntr/COM_ENS_051.do', 1050, 550, 'getRgst_port_cd', "1,0,1", true);
            break;
            //-----------------[Calendar button Start]------------------//
            case "btns_vsl_kel_ly_dt":
            case "btns_vsl_lnch_dt":
            case "btns_vsl_de_dt":
            case "btns_rgst_dt":
            case "btns_vsl_clz_dt":
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
function getVsl_cd(rowArray) {
    var sheetObj=sheetObjects[0];
    var formObj=document.form;
    var colArray=rowArray[0];
    formObj.vsl_cd.value=colArray[3];
    doActionIBSheet(sheetObj, formObj, IBSEARCH);
}
function getCrr_cd(rowArray) {
    var sheetObj=sheetObjects[0];
    var formObj=document.form;
    var colArray=rowArray[0];
    formObj.crr_cd.value=colArray[3];

//    if(formObj.crr_cd.value == "NYK"){
//    	modi_vsl_opr_tp_cd.SetSelectCode("07");
//    }else{
//    	modi_vsl_opr_tp_cd.SetSelectCode("08");
//    }
}
function getVsl_rgst_cnt_cd(rowArray) {
    var sheetObj=sheetObjects[0];
    var formObj=document.form;
    var colArray=rowArray[0];
    formObj.vsl_rgst_cnt_cd.value=colArray[3];
}
function getRgst_port_cd(rowArray) {
    var sheetObj=sheetObjects[0];
    var formObj=document.form;
    var colArray=rowArray[0];
    formObj.rgst_port_cd.value=colArray[3];
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
    //formObj.fdr_div_cd.Code = "T";
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
        	var sXml=sheetObj.GetSearchData("BCM_CCD_0008GS.do", "f_cmd=" + SEARCH01);
        	var rtnValue=sXml.split("|$$|");
        	for(var i=0; i<rtnValue.length; i++){
                var comboXml=ComXml2ComboString(rtnValue[i], "cd_desc", "cd");
                var cdName=comboXml[0].split("|");
                var cdValue=comboXml[1].split("|");
                for (var j=0; j < cdName.length; j++) {
                	if(i == 1){
                		var item = cdValue[j] + "|" + cdName[j];
                		comboObjects[i].InsertItem(j, item, cdValue[j]);
                	}else{
                		comboObjects[i].InsertItem(j, cdName[j], cdValue[j]);
                	}
                }
            }
        	vsl_own_ind_cd.SetSelectIndex(1);

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
              var HeadTitle1="|VSL_CD|VSL_CLSS_FLG|VSL_ENG_NM|VSL_LOCL_NM|FOIL_CAPA|DOIL_CAPA|FRSH_WTR_CAPA|CALL_SGN_NO|RGST_NO|PHN_NO|FAX_NO|TLX_NO|VSL_EML|PICLB_DESC|RGST_PORT_CD|CLSS_NO_RGST_AREA_NM|VSL_CLSS_NO|VSL_BLDR_NM|LOA_LEN|LBP_LEN|VSL_WDT|VSL_DPTH|SMR_DRFT_HGT|DWT_WGT|LGT_SHP_TONG_WGT|GRS_RGST_TONG_WGT|NET_RGST_TONG_WGT|PNM_GT_WGT|PNM_NET_TONG_WGT|SUZ_GT_WGT|SUZ_NET_TONG_WGT|MN_ENG_MKR_NM|MN_ENG_TP_DESC|MN_ENG_BHP_PWR|VSL_OWN_IND_CD|VSL_RGST_CNT_CD|VSL_BLD_CD|CRR_CD|FDR_DIV_CD|VSL_SVC_SPD|MAX_SPD|ECN_SPD|CRW_KNT|CNTR_DZN_CAPA|CNTR_OP_CAPA|CNTR_PNM_CAPA|CNTR_VSL_CLSS_CAPA|RF_RCPT_KNT|RF_RCPT_MAX_KNT|FBD_CAPA|DPL_CAPA|BLST_TNK_CAPA|FOIL_CSM|DOIL_CSM|FRSH_WTR_CSM|MN_ENG_RPM_PWR|GNR_RPM_PWR|VSL_HGT|RGST_DT|VSL_EDI_NM|CO_CD|VSL_CLZ_DT|VSL_BLD_AREA_NM|GNR_MKR_NM|GNR_TP_DESC|GNR_BHP_PWR|BWTHST_MKR_NM|BWTHST_TP_DESC|BWTHST_BHP_PWR|BWTHST_RPM_PWR|LLOYD_NO|VSL_LNCH_DT|VSL_DE_DT|VSL_KEL_LY_DT|VSL_HL_NO|TTL_TEU_KNT|VSL_HTCH_KNT|VSL_HLD_KNT|VSL_RMK|INTL_TONG_CERTI_FLG|MADN_VOY_SUZ_NET_TONG_WGT|VSL_SFT_CSTRU_CERTI_EXP_DT|VSL_SFT_RDO_CERTI_EXP_DT|VSL_SFT_EQ_CERTI_EXP_DT|VSL_LOD_LINE_CERTI_EXP_DT|VSL_DERAT_CERTI_EXP_DT|DELT_FLG|MODI_VSL_CD||MODI_ALLN_VSL_CD|NYK_LGCY_VSL_CD_CTNT|MOL_LGCY_VSL_CD_CTNT|KLINE_LGCY_VSL_CD_CTNT";
              var headCount=ComCountHeadTitle(HeadTitle1);
              var prefix="sheet1_";
              SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
              var info    = { Sort:0, ColMove:0, HeaderCheck:1, ColResize:0 };
              var headers = [ { Text:HeadTitle1, Align:"Center"} ];
              InitHeaders(headers, info);
              var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag",                    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_cd",                    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_clss_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_eng_nm",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_locl_nm",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"foil_capa",                 KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"doil_capa",                 KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"frsh_wtr_capa",             KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"call_sgn_no",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"rgst_no",                   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"phn_no",                    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"fax_no",                    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"tlx_no",                    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_eml",                   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"piclb_desc",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"rgst_port_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"clss_no_rgst_area_nm",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_clss_no",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_bldr_nm",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"loa_len",                   KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"lbp_len",                   KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_wdt",                   KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_dpth",                  KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"smr_drft_hgt",              KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"dwt_wgt",                   KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"lgt_shp_tong_wgt",          KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"grs_rgst_tong_wgt",         KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"net_rgst_tong_wgt",         KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"pnm_gt_wgt",                KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"pnm_net_tong_wgt",          KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"suz_gt_wgt",                KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"suz_net_tong_wgt",          KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"mn_eng_mkr_nm",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"mn_eng_tp_desc",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"mn_eng_bhp_pwr",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_own_ind_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_rgst_cnt_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_bld_cd",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"crr_cd",                    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"fdr_div_cd",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_svc_spd",               KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"max_spd",                   KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"ecn_spd",                   KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"crw_knt",                   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cntr_dzn_capa",             KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cntr_op_capa",              KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cntr_pnm_capa",             KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cntr_vsl_clss_capa",        KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"rf_rcpt_knt",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"rf_rcpt_max_knt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"fbd_capa",                  KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"dpl_capa",                  KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"blst_tnk_capa",             KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"foil_csm",                  KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:4,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"doil_csm",                  KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:4,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"frsh_wtr_csm",              KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"mn_eng_rpm_pwr",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"gnr_rpm_pwr",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_hgt",                   KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"rgst_dt",                   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_edi_nm",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"co_cd",                     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_clz_dt",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_bld_area_nm",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"gnr_mkr_nm",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"gnr_tp_desc",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"gnr_bhp_pwr",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"bwthst_mkr_nm",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"bwthst_tp_desc",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"bwthst_bhp_pwr",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"bwthst_rpm_pwr",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"lloyd_no",                  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_lnch_dt",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_de_dt",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_kel_ly_dt",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_hl_no",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"ttl_teu_knt",               KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:5,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_htch_knt",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_hld_knt",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_rmk",                   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"intl_tong_certi_flg",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"madn_voy_suz_net_tong_wgt", KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"delt_flg",                  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
              			 {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"modi_vsl_cd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
              			 {Type:"Text", 		Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_usr_id",   			   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
   	                     {Type:"Text", 		Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_dt",       			   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
   	                     {Type:"Text", 		Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_usr_id",   			   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
   	                     {Type:"Text", 		Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_dt",       			   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
   	                     {Type:"Text", 		Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"modi_vsl_opr_tp_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text", 		Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"modi_alln_vsl_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"nyk_lgcy_vsl_cd_ctnt",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"mol_lgcy_vsl_cd_ctnt",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"kline_lgcy_vsl_cd_ctnt",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }
              			 ];
              InitColumns(cols);
              SetEditable(1);
              SetVisible(false);
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
                formObj.f_cmd.value=SEARCH05;
            }
            ComOpenWait(true);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0008GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_"));
            var rqstNo=ComGetEtcData(sXml, "RQST_NO");
            ComSetObjValue(formObj.rqst_no, rqstNo);
            sheetObj.LoadSearchData(sXml,{Sync:1});
            formObj.vsl_cd.disabled=true;
            if(sheetObj.RowCount()== 0){ //Insert mode when no data is
                formObj.creflag.value="Y";
                if(G_AHTU_TP_CD=="A"){
                    ComShowCodeMessage("CCD00033", "Vessel Code");
                    doActionIBSheet(sheetObj, formObj, IBCLEAR);
                }else{
                    if(!ComShowConfirm(ComGetMsg("CCD00034", "Vessel Code"))){
                        doActionIBSheet(sheetObj, formObj, IBCLEAR);
                    }
                }
                sheetObj.DataInsert(-1);
            } else {
                formObj.creflag.value="N";
            }
        }
        break;
    case SEARCH02: // Carrier Code checking
        if (validateForm(sheetObj, formObj, sAction)){
            formObj.f_cmd.value=SEARCH02;
            ComOpenWait(true);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0008GS.do", FormQueryString(formObj));
            var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Carrier");
                    formObj.crr_cd.value="";
                    formObj.crr_cd.focus();
                }
                ComOpenWait(false);
        }
        break;
    case SEARCH03: // Country Code checking
        if (validateForm(sheetObj, formObj, sAction)){
            formObj.f_cmd.value=SEARCH03;
            ComOpenWait(true);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0008GS.do", FormQueryString(formObj));
            var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Flag");
                    formObj.vsl_rgst_cnt_cd.value="";
                    formObj.vsl_rgst_cnt_cd.focus();
                }
                ComOpenWait(false);
        }
        break;
    case SEARCH04: // Port Code checking
        if (validateForm(sheetObj, formObj, sAction)){
            formObj.f_cmd.value=SEARCH04;
            ComOpenWait(true);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0008GS.do", FormQueryString(formObj));
            var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Port Of Registry");
                    formObj.rgst_port_cd.value="";
                    formObj.rgst_port_cd.focus();
                }
                ComOpenWait(false);
        }
        break;
    case SEARCH10: // MDM AUTH_TP_CD query
        var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=VESL';
        var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
        // global var sestting
        G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
        G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
        break;
    case IBSAVE: // Save
        if(validateForm(sheetObj, formObj, sAction)){
            sheetObj.SetCellValue(1,'sheet1_vsl_cd',formObj.vsl_cd.value);
            sheetObj.SetCellValue(1,'sheet1_vsl_clss_flg',formObj.vsl_clss_flg.value);
            sheetObj.SetCellValue(1,'sheet1_vsl_eng_nm',formObj.vsl_eng_nm.value);
            sheetObj.SetCellValue(1,'sheet1_vsl_locl_nm',formObj.vsl_locl_nm.value);
            sheetObj.SetCellValue(1,'sheet1_foil_capa',formObj.foil_capa.value);
            sheetObj.SetCellValue(1,'sheet1_doil_capa',formObj.doil_capa.value);
            sheetObj.SetCellValue(1,'sheet1_frsh_wtr_capa',formObj.frsh_wtr_capa.value);
            sheetObj.SetCellValue(1,'sheet1_call_sgn_no',formObj.call_sgn_no.value);
            sheetObj.SetCellValue(1,'sheet1_rgst_no',formObj.rgst_no.value);
            sheetObj.SetCellValue(1,'sheet1_phn_no',formObj.phn_no.value);
            sheetObj.SetCellValue(1,'sheet1_fax_no',formObj.fax_no.value);
            sheetObj.SetCellValue(1,'sheet1_tlx_no',formObj.tlx_no.value);
            sheetObj.SetCellValue(1,'sheet1_vsl_eml',formObj.vsl_eml.value);
            sheetObj.SetCellValue(1,'sheet1_piclb_desc',formObj.piclb_desc.value);
            sheetObj.SetCellValue(1,'sheet1_rgst_port_cd',formObj.rgst_port_cd.value);
            sheetObj.SetCellValue(1,'sheet1_clss_no_rgst_area_nm',clss_no_rgst_area_nm.GetSelectCode());
            sheetObj.SetCellValue(1,'sheet1_vsl_clss_no',formObj.vsl_clss_no.value);
            sheetObj.SetCellValue(1,'sheet1_vsl_bldr_nm',formObj.vsl_bldr_nm.value);
            sheetObj.SetCellValue(1,'sheet1_loa_len',formObj.loa_len.value);
            sheetObj.SetCellValue(1,'sheet1_lbp_len',formObj.lbp_len.value);
            sheetObj.SetCellValue(1,'sheet1_vsl_wdt',formObj.vsl_wdt.value);
            sheetObj.SetCellValue(1,'sheet1_vsl_dpth',formObj.vsl_dpth.value);
            sheetObj.SetCellValue(1,'sheet1_smr_drft_hgt',formObj.smr_drft_hgt.value);
            sheetObj.SetCellValue(1,'sheet1_dwt_wgt',formObj.dwt_wgt.value);
            sheetObj.SetCellValue(1,'sheet1_lgt_shp_tong_wgt',formObj.lgt_shp_tong_wgt.value);
            sheetObj.SetCellValue(1,'sheet1_grs_rgst_tong_wgt',formObj.grs_rgst_tong_wgt.value);
            sheetObj.SetCellValue(1,'sheet1_net_rgst_tong_wgt',formObj.net_rgst_tong_wgt.value);
            sheetObj.SetCellValue(1,'sheet1_pnm_gt_wgt',formObj.pnm_gt_wgt.value);
            sheetObj.SetCellValue(1,'sheet1_pnm_net_tong_wgt',formObj.pnm_net_tong_wgt.value);
            sheetObj.SetCellValue(1,'sheet1_suz_gt_wgt',formObj.suz_gt_wgt.value);
            sheetObj.SetCellValue(1,'sheet1_suz_net_tong_wgt',formObj.suz_net_tong_wgt.value);
            sheetObj.SetCellValue(1,'sheet1_mn_eng_mkr_nm',formObj.mn_eng_mkr_nm.value);
            sheetObj.SetCellValue(1,'sheet1_mn_eng_tp_desc',formObj.mn_eng_tp_desc.value);
            sheetObj.SetCellValue(1,'sheet1_mn_eng_bhp_pwr',ComGetUnMaskedValue(formObj.mn_eng_bhp_pwr.value,'int'));
            sheetObj.SetCellValue(1,'sheet1_vsl_own_ind_cd',vsl_own_ind_cd.GetSelectCode());
            sheetObj.SetCellValue(1,'sheet1_vsl_rgst_cnt_cd',formObj.vsl_rgst_cnt_cd.value);
            sheetObj.SetCellValue(1,'sheet1_vsl_bld_cd',vsl_bld_cd.GetSelectCode());
            //sheetObj.GetCellValue(1,'sheet1_crr_cd',formObj.crr_cd.value);
            sheetObj.SetCellValue(1,'sheet1_crr_cd',formObj.crr_cd.value);
            sheetObj.SetCellValue(1,'sheet1_fdr_div_cd',fdr_div_cd.GetSelectCode());
            sheetObj.SetCellValue(1,'sheet1_vsl_svc_spd',formObj.vsl_svc_spd.value);
            sheetObj.SetCellValue(1,'sheet1_max_spd',formObj.max_spd.value);
            sheetObj.SetCellValue(1,'sheet1_ecn_spd',formObj.ecn_spd.value);
            sheetObj.SetCellValue(1,'sheet1_crw_knt',ComGetUnMaskedValue(formObj.crw_knt.value,'int'));
            sheetObj.SetCellValue(1,'sheet1_cntr_dzn_capa',formObj.cntr_dzn_capa.value);
            sheetObj.SetCellValue(1,'sheet1_cntr_op_capa',formObj.cntr_op_capa.value);
            sheetObj.SetCellValue(1,'sheet1_cntr_pnm_capa',formObj.cntr_pnm_capa.value);
            sheetObj.SetCellValue(1,'sheet1_cntr_vsl_clss_capa',formObj.cntr_vsl_clss_capa.value);
            sheetObj.SetCellValue(1,'sheet1_rf_rcpt_knt',ComGetUnMaskedValue(formObj.rf_rcpt_knt.value,'int'));
            sheetObj.SetCellValue(1,'sheet1_rf_rcpt_max_knt',ComGetUnMaskedValue(formObj.rf_rcpt_max_knt.value,'int'));
            sheetObj.SetCellValue(1,'sheet1_fbd_capa',formObj.fbd_capa.value);
            sheetObj.SetCellValue(1,'sheet1_dpl_capa',formObj.dpl_capa.value);
            sheetObj.SetCellValue(1,'sheet1_blst_tnk_capa',formObj.blst_tnk_capa.value);
            sheetObj.SetCellValue(1,'sheet1_foil_csm',formObj.foil_csm.value);
            sheetObj.SetCellValue(1,'sheet1_doil_csm',formObj.doil_csm.value);
            sheetObj.SetCellValue(1,'sheet1_frsh_wtr_csm',formObj.frsh_wtr_csm.value);
            sheetObj.SetCellValue(1,'sheet1_mn_eng_rpm_pwr',ComGetUnMaskedValue(formObj.mn_eng_rpm_pwr.value,'int'));
            sheetObj.SetCellValue(1,'sheet1_gnr_rpm_pwr',ComGetUnMaskedValue(formObj.gnr_rpm_pwr.value,'int'));
            sheetObj.SetCellValue(1,'sheet1_vsl_hgt',formObj.vsl_hgt.value);
            sheetObj.SetCellValue(1,'sheet1_rgst_dt',formObj.rgst_dt.value);
            sheetObj.SetCellValue(1,'sheet1_vsl_edi_nm',formObj.vsl_edi_nm.value);
            //sheetObj.GetCellValue(1,'sheet1_co_cd')  =formObj.co_cd.value;
            sheetObj.SetCellValue(1,'sheet1_co_cd',formObj.co_cd.value);
            sheetObj.SetCellValue(1,'sheet1_vsl_clz_dt',formObj.vsl_clz_dt.value);
            //sheetObj.CellValue(1,'sheet1_vsl_cre_ofc_cd')             = formObj.vsl_cre_ofc_cd.value;
            //sheetObj.CellValue(1,'sheet1_vsl_delt_ofc_cd')            = formObj.vsl_delt_ofc_cd.value;
            sheetObj.SetCellValue(1,'sheet1_vsl_bld_area_nm',formObj.vsl_bld_area_nm.value);
            sheetObj.SetCellValue(1,'sheet1_gnr_mkr_nm',formObj.gnr_mkr_nm.value);
            sheetObj.SetCellValue(1,'sheet1_gnr_tp_desc',formObj.gnr_tp_desc.value);
            sheetObj.SetCellValue(1,'sheet1_gnr_bhp_pwr',ComGetUnMaskedValue(formObj.gnr_bhp_pwr.value,'int'));
            sheetObj.SetCellValue(1,'sheet1_bwthst_mkr_nm',formObj.bwthst_mkr_nm.value);
            sheetObj.SetCellValue(1,'sheet1_bwthst_tp_desc',formObj.bwthst_tp_desc.value);
            sheetObj.SetCellValue(1,'sheet1_bwthst_bhp_pwr',ComGetUnMaskedValue(formObj.bwthst_bhp_pwr.value,'int'));
            sheetObj.SetCellValue(1,'sheet1_bwthst_rpm_pwr',ComGetUnMaskedValue(formObj.bwthst_rpm_pwr.value,'int'));
            sheetObj.SetCellValue(1,'sheet1_lloyd_no',formObj.lloyd_no.value);
            sheetObj.SetCellValue(1,'sheet1_vsl_lnch_dt',formObj.vsl_lnch_dt.value);
            sheetObj.SetCellValue(1,'sheet1_vsl_de_dt',formObj.vsl_de_dt.value);
            sheetObj.SetCellValue(1,'sheet1_vsl_kel_ly_dt',formObj.vsl_kel_ly_dt.value);
            sheetObj.SetCellValue(1,'sheet1_vsl_hl_no',formObj.vsl_hl_no.value);
            sheetObj.SetCellValue(1,'sheet1_ttl_teu_knt',formObj.ttl_teu_knt.value);
            sheetObj.SetCellValue(1,'sheet1_vsl_htch_knt',ComGetUnMaskedValue(formObj.vsl_htch_knt.value,'int'));
            sheetObj.SetCellValue(1,'sheet1_vsl_hld_knt',ComGetUnMaskedValue(formObj.vsl_hld_knt.value,'int'));
            sheetObj.SetCellValue(1,'sheet1_vsl_rmk',formObj.vsl_rmk.value);
            sheetObj.SetCellValue(1,'sheet1_intl_tong_certi_flg',formObj.intl_tong_certi_flg.value);
            sheetObj.SetCellValue(1,'sheet1_madn_voy_suz_net_tong_wgt',formObj.madn_voy_suz_net_tong_wgt.value);
            sheetObj.SetCellValue(1,'sheet1_delt_flg',formObj.delt_flg.value);
//            sheetObj.SetCellValue(1,'sheet1_modi_vsl_cd',formObj.modi_vsl_cd.value);
//            sheetObj.SetCellValue(1,'sheet1_modi_vsl_opr_tp_cd',modi_vsl_opr_tp_cd.GetSelectCode());
            sheetObj.SetCellValue(1,'sheet1_modi_alln_vsl_cd',formObj.modi_alln_vsl_cd.value);//2017.02.24 NYK ADD
            sheetObj.SetCellValue(1,'sheet1_nyk_lgcy_vsl_cd_ctnt',formObj.nyk_lgcy_vsl_cd_ctnt.value);
            sheetObj.SetCellValue(1,'sheet1_mol_lgcy_vsl_cd_ctnt',formObj.mol_lgcy_vsl_cd_ctnt.value);
            sheetObj.SetCellValue(1,'sheet1_kline_lgcy_vsl_cd_ctnt',formObj.kline_lgcy_vsl_cd_ctnt.value);
            
            if( formObj.creflag.value == "N" && formObj.rqst_no.value == ''){
                formObj.f_cmd.value=MULTI;
            }else{
                formObj.f_cmd.value=MULTI01;
                ComEnableObject(form.btns_search1, false);
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
                var sXml=sheetObj.GetSaveData("BCM_CCD_0008GS.do", FormQueryString(formObj) + "&" + ComGetSaveString(sheetObj));
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
                ComSetObjValue(formObj.rqst_no, rqstNo);
            }
        }
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
        formObj.vsl_cd.disabled=false;
//        vsl_own_ind_cd.text="";
        vsl_own_ind_cd.SetSelectIndex(1);
        vsl_bld_cd.text="";
        clss_no_rgst_area_nm.text="";
        fdr_div_cd.text="";
        formObj.rqst_no.value="";
        ComEnableObject(form.btns_search1, true);
//        formObj.modi_vsl_cd.className = "input1";
//        modi_vsl_opr_tp_cd.SetBackColor("#FFFFFF");
        break;
    }
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
//     with(formObj){
         switch ( sAction ) {
             case IBSEARCH:
                 if( formObj.rqst_no.value == ''){
                     if (formObj.vsl_cd.value.length == 0){
                         ComShowCodeMessage("CCD00001", "Vessel Code");
//                         formObj.vsl_cd.focus();
                         return false;
                     }

                     if (formObj.vsl_cd.value.length != 4){
                         ComShowCodeMessage("CCD00044");
//                         formObj.vsl_cd.focus();
                         return false;
                     }
                 }
                 break;
             case IBSAVE:
                 if (formObj.vsl_cd.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Vessel Code");
//                     formObj.vsl_cd.focus();
                     return false;
                 } else if (formObj.vsl_eng_nm.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Vessel Name(ENG)");
//                     formObj.vsl_eng_nm.focus();
                     return false;
                 }else if (formObj.crr_cd.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Carrier");
//                     formObj.crr_cd.focus();
                     return false;
                 }else if (formObj.call_sgn_no.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Call Sign");
//                     formObj.call_sgn_no.focus();
                     return false;
                 }else if (formObj.vsl_rgst_cnt_cd.value.length == 0){
                     ComShowCodeMessage("CCD00001", "Flag");
//                     formObj.vsl_rgst_cnt_cd.focus();
                     return false;
                 }else if (formObj.lloyd_no.value.length == 0){
                     ComShowCodeMessage("CCD00001", "IMO No(LLOYD No)");
//                     formObj.lloyd_no.focus();
                     return false;
                 }else if (formObj.grs_rgst_tong_wgt.value.length == 0){
                     ComShowCodeMessage("CCD00001", "International Gross Ton");
//                     formObj.grs_rgst_tong_wgt.focus();
                     return false;
                 }else if (formObj.net_rgst_tong_wgt.value.length == 0){
                     ComShowCodeMessage("CCD00001", "International Net Ton");
//                     formObj.net_rgst_tong_wgt.focus();
                     return false;
                 }else if (fdr_div_cd.GetSelectCode() == ""){
                	 ComShowCodeMessage("CCD00001", "Feeder Division");
                     return false;
                 }
//                 else if (modi_vsl_opr_tp_cd.GetSelectCode() == ""){
//                	 if(fdr_div_cd.GetSelectCode() == "T"){
//                		 ComShowCodeMessage("CCD00001", "VIP Ope. Kind");
//                         return false;
//                	 }
//                 }
//                 else if (formObj.modi_vsl_cd.value.length == 0){
//                     if(formObj.vsl_clss_flg.value != "Y"){
//                    	 ComShowCodeMessage("CCD00001", "VIP Code");
//                         formObj.modi_vsl_cd.focus();
//                         return false;
//                     }
//                     if(formObj.modi_vsl_cd.value.length != 3){
//                    	 ComShowCodeMessage("CCD00049");
//                    	 formObj.modi_vsl_cd.focus();
//                 	     return false;
//                     }
//                 }
                 if (formObj.vsl_cd.value.length != 4){
                     ComShowCodeMessage("CCD00044");
//                     formObj.vsl_cd.focus();
                     return false;
                 }

                 if (formObj.cntr_vsl_clss_capa.value.length == 0){
                	 ComShowCodeMessage("CCD00001", "Vessel Class(TEU)");
//                     formObj.cntr_vsl_clss_capa.focus();
                     return false;
                 }

                 if (formObj.vsl_svc_spd.value.length == 0){
                	 ComShowCodeMessage("CCD00001", "Service");
//                     formObj.vsl_svc_spd.focus();
                     return false;
                 }

                 break;
         }
//     }
     return true;
 }
function initControl() {
    var formObj=document.form;
    //axon_event.addListenerForm('deactivate', 'obj_deactivate', formObj);
    //axon_event.addListenerForm('focus', 'obj_activate', formObj);
    //axon_event.addListenerForm('change', 'obj_change', formObj);
//  axon_event.addListenerFormat('keypress', 'obj_keypress', formObj);
//  axon_event.addListenerForm('keyup', 'obj_keyup', formObj);
}
/**
 * When you change the value of the hidden Sheet Html Object to reflect the changed value.<br>
 */
function com_change_sheet( sheetObj, colNm ){
    var formObj=document.form;
    var eleValue="";
    if(document.getElementById(colNm).type=="text"){
        switch(colNm){
            default:
                eleValue=document.getElementById(colNm).value;
                break;
        }
        sheetObj.SetCellValue(1,colNm,eleValue);
    }else{
        sheetObj.SetCellValue(1,colNm,document.getElementById(colNm).GetSelectCode());
    }
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
        case "vsl_cd":
           if(formObj.vsl_cd.value.length>0){
                doActionIBSheet(sheetObj, formObj, IBSEARCH);
            }
        break;
        case "crr_cd":
            if(formObj.crr_cd.value.length>0){
//2017.12.26  legacy Vessel Code 수정 제외            	
//            	if( formObj.crr_cd.value == formObj.own_crr_cd.value ){
//            		formObj.nyk_lgcy_vsl_cd_ctnt.value = "";
//            		formObj.mol_lgcy_vsl_cd_ctnt.value = "";
//            		formObj.kline_lgcy_vsl_cd_ctnt.value = "";
//            		formObj.nyk_lgcy_vsl_cd_ctnt.readOnly = true;
//            		formObj.mol_lgcy_vsl_cd_ctnt.readOnly = true;
//            		formObj.kline_lgcy_vsl_cd_ctnt.readOnly = true;
//            	}else{
//            		formObj.nyk_lgcy_vsl_cd_ctnt.readOnly = false;
//            		formObj.mol_lgcy_vsl_cd_ctnt.readOnly = false;
//            		formObj.kline_lgcy_vsl_cd_ctnt.readOnly = false;
//            	}
                doActionIBSheet(sheetObj, formObj, SEARCH02);
//                if(formObj.crr_cd.value == "NYK"){
//                	modi_vsl_opr_tp_cd.SetSelectCode("07");
//                }else{
//                	modi_vsl_opr_tp_cd.SetSelectCode("08");
//                }
            }
        break;
        case "vsl_rgst_cnt_cd":
            if(formObj.vsl_rgst_cnt_cd.value.length>0){
                doActionIBSheet(sheetObj, formObj, SEARCH03);
            }
        break;
        case "rgst_port_cd":
            if(formObj.rgst_port_cd.value.length>0){
                doActionIBSheet(sheetObj, formObj, SEARCH04);
            }
        break;
        case "delt_flg":
            if (formObj.delt_flg.value == 'Y'){
                var checkFirm=ComShowConfirm(ComGetMsg("CCD00012"));
                if (checkFirm == 1){
                    formObj.delt_flg.value='Y';
                }else{
                    formObj.delt_flg.value='N';
                }
            }
        break;
//        case "vsl_clss_flg":
//        	if(formObj.vsl_clss_flg.value == "Y"){
//        		formObj.modi_vsl_cd.className = "input";
//        	}else{
//        		formObj.modi_vsl_cd.className = "input1";
//        	}
//        break;
//        case "modi_vsl_cd":
//        	if(formObj.modi_vsl_cd.value != "" && formObj.modi_vsl_cd.value.length != 3){
//        		ComShowCodeMessage("CCD00049");
//        		formObj.modi_vsl_cd.focus();
//        		return;
//        	}
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
   * Change the selected Item IBMulti Combo is an event that occurs when.<br>
   */
  function fdr_div_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
      var formObj=document.form;
      var sheetObj=sheetObjects[0];
      var arrText=newText.split("|");

    if (arrText != null && arrText.length > 1) {
        formObj.fdr_div_cd.value=comboObj.GetText(oldCode, 1);
    }
      com_change_sheet( sheetObj, "fdr_div_cd" );
      if(newCode == 'O'){
           formObj.vsl_clss_flg.value='Y';
//           modi_vsl_opr_tp_cd.SetBackColor("#FFFFFF");
        }else {
           formObj.vsl_clss_flg.value='N';
//           if(newCode == 'T'){
//        	   modi_vsl_opr_tp_cd.SetBackColor("#d4f6ff");
//           }else{
//        	   modi_vsl_opr_tp_cd.SetBackColor("#FFFFFF");
//           }
        }
   }
 function sheet1_OnSearchEnd(sheet1, ErrMsg){
     ComOpenWait(false);
     var formObj=document.form;
    if (sheet1.RowCount()> 0){
        formObj.vsl_cd.value =sheet1.GetCellValue(1,'sheet1_vsl_cd');
        formObj.vsl_clss_flg.value=sheet1.GetCellValue(1,'sheet1_vsl_clss_flg');

        formObj.vsl_eng_nm.value=sheet1.GetCellValue(1,'sheet1_vsl_eng_nm');
        formObj.vsl_locl_nm.value=sheet1.GetCellValue(1,'sheet1_vsl_locl_nm');
        formObj.foil_capa.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_foil_capa'));
        formObj.doil_capa.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_doil_capa'));
        formObj.frsh_wtr_capa.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_frsh_wtr_capa'));
        formObj.call_sgn_no.value=sheet1.GetCellValue(1,'sheet1_call_sgn_no');
        formObj.rgst_no.value=sheet1.GetCellValue(1,'sheet1_rgst_no');
        formObj.phn_no.value =sheet1.GetCellValue(1,'sheet1_phn_no');
        formObj.fax_no.value =sheet1.GetCellValue(1,'sheet1_fax_no');
        formObj.tlx_no.value =sheet1.GetCellValue(1,'sheet1_tlx_no');
        formObj.vsl_eml.value=sheet1.GetCellValue(1,'sheet1_vsl_eml');
        formObj.piclb_desc.value=sheet1.GetCellValue(1,'sheet1_piclb_desc');
        formObj.rgst_port_cd.value=sheet1.GetCellValue(1,'sheet1_rgst_port_cd');
        clss_no_rgst_area_nm.SetSelectCode(sheet1.GetCellValue(1,'sheet1_clss_no_rgst_area_nm'));
        formObj.vsl_clss_no.value=sheet1.GetCellValue(1,'sheet1_vsl_clss_no');
        formObj.vsl_bldr_nm.value=sheet1.GetCellValue(1,'sheet1_vsl_bldr_nm');
        formObj.loa_len.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_loa_len'));
        formObj.lbp_len.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_lbp_len'));
        formObj.vsl_wdt.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_vsl_wdt'));
        formObj.vsl_dpth.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_vsl_dpth'));
        formObj.smr_drft_hgt.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_smr_drft_hgt'));
        formObj.dwt_wgt.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_dwt_wgt'));
        formObj.lgt_shp_tong_wgt.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_lgt_shp_tong_wgt'));
        formObj.grs_rgst_tong_wgt.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_grs_rgst_tong_wgt'));
        formObj.net_rgst_tong_wgt.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_net_rgst_tong_wgt'));
        formObj.pnm_gt_wgt.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_pnm_gt_wgt'));
        formObj.pnm_net_tong_wgt.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_pnm_net_tong_wgt'));
        formObj.suz_gt_wgt.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_suz_gt_wgt'));
        formObj.suz_net_tong_wgt.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_suz_net_tong_wgt'));
        formObj.mn_eng_mkr_nm.value=sheet1.GetCellValue(1,'sheet1_mn_eng_mkr_nm');
        formObj.mn_eng_tp_desc.value=sheet1.GetCellValue(1,'sheet1_mn_eng_tp_desc');
        formObj.mn_eng_bhp_pwr.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_mn_eng_bhp_pwr'));
        vsl_own_ind_cd.SetSelectCode(sheet1.GetCellValue(1,'sheet1_vsl_own_ind_cd'));
        formObj.vsl_rgst_cnt_cd.value=sheet1.GetCellValue(1,'sheet1_vsl_rgst_cnt_cd');
        vsl_bld_cd.SetSelectCode(sheet1.GetCellValue(1,'sheet1_vsl_bld_cd'));
        formObj.crr_cd.value =sheet1.GetCellValue(1,'sheet1_crr_cd');
        fdr_div_cd.SetSelectCode(sheet1.GetCellValue(1,'sheet1_fdr_div_cd'));
        formObj.vsl_svc_spd.value=sheet1.GetCellValue(1,'sheet1_vsl_svc_spd');
        formObj.max_spd.value=sheet1.GetCellValue(1,'sheet1_max_spd');
        formObj.ecn_spd.value=sheet1.GetCellValue(1,'sheet1_ecn_spd');
        formObj.crw_knt.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_crw_knt'));
        formObj.cntr_dzn_capa.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_cntr_dzn_capa'));
        formObj.cntr_op_capa.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_cntr_op_capa'));
        formObj.cntr_pnm_capa.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_cntr_pnm_capa'));
        formObj.cntr_vsl_clss_capa.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_cntr_vsl_clss_capa'));
        formObj.rf_rcpt_knt.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_rf_rcpt_knt'));
        formObj.rf_rcpt_max_knt.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_rf_rcpt_max_knt'));
        formObj.fbd_capa.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_fbd_capa'));
        formObj.dpl_capa.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_dpl_capa'));
        formObj.blst_tnk_capa.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_blst_tnk_capa'));
        formObj.foil_csm.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_foil_csm'));
        formObj.doil_csm.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_doil_csm'));
        formObj.frsh_wtr_csm.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_frsh_wtr_csm'));
        formObj.mn_eng_rpm_pwr.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_mn_eng_rpm_pwr'));
        formObj.gnr_rpm_pwr.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_gnr_rpm_pwr'));
        formObj.vsl_hgt.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_vsl_hgt'));
        formObj.rgst_dt.value=sheet1.GetCellValue(1,'sheet1_rgst_dt');
        formObj.vsl_edi_nm.value=sheet1.GetCellValue(1,'sheet1_vsl_edi_nm');
        formObj.co_cd.value  =sheet1.GetCellValue(1,'sheet1_co_cd');
        formObj.vsl_clz_dt.value=sheet1.GetCellValue(1,'sheet1_vsl_clz_dt');
        formObj.vsl_bld_area_nm.value=sheet1.GetCellValue(1,'sheet1_vsl_bld_area_nm');
        formObj.gnr_mkr_nm.value=sheet1.GetCellValue(1,'sheet1_gnr_mkr_nm');
        formObj.gnr_tp_desc.value=sheet1.GetCellValue(1,'sheet1_gnr_tp_desc');
        formObj.gnr_bhp_pwr.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_gnr_bhp_pwr'));
        formObj.bwthst_mkr_nm.value=sheet1.GetCellValue(1,'sheet1_bwthst_mkr_nm');
        formObj.bwthst_tp_desc.value=sheet1.GetCellValue(1,'sheet1_bwthst_tp_desc');
        formObj.bwthst_bhp_pwr.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_bwthst_bhp_pwr'));
        formObj.bwthst_rpm_pwr.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_bwthst_rpm_pwr'));
        formObj.lloyd_no.value=sheet1.GetCellValue(1,'sheet1_lloyd_no');
        formObj.vsl_lnch_dt.value=sheet1.GetCellValue(1,'sheet1_vsl_lnch_dt');
        formObj.vsl_de_dt.value=sheet1.GetCellValue(1,'sheet1_vsl_de_dt');
        formObj.vsl_kel_ly_dt.value=sheet1.GetCellValue(1,'sheet1_vsl_kel_ly_dt');
        formObj.vsl_hl_no.value=sheet1.GetCellValue(1,'sheet1_vsl_hl_no');
        formObj.ttl_teu_knt.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_ttl_teu_knt'));
        formObj.vsl_htch_knt.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_vsl_htch_knt'));
        formObj.vsl_hld_knt.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_vsl_hld_knt'));
        formObj.vsl_rmk.value=sheet1.GetCellValue(1,'sheet1_vsl_rmk');
        formObj.intl_tong_certi_flg.value=sheet1.GetCellValue(1,'sheet1_intl_tong_certi_flg');
        formObj.madn_voy_suz_net_tong_wgt.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_madn_voy_suz_net_tong_wgt'));
        formObj.delt_flg.value=sheet1.GetCellValue(1,'sheet1_delt_flg');
//        formObj.modi_vsl_cd.value=sheet1.GetCellValue(1,'sheet1_modi_vsl_cd');
        formObj.cre_usr_id.value=sheet1.GetCellValue(1,'sheet1_cre_usr_id');
        formObj.cre_dt.value=sheet1.GetCellValue(1,'sheet1_cre_dt');
        formObj.upd_usr_id.value=sheet1.GetCellValue(1,'sheet1_upd_usr_id');
        formObj.upd_dt.value=sheet1.GetCellValue(1,'sheet1_upd_dt');
//        modi_vsl_opr_tp_cd.SetSelectCode(sheet1.GetCellValue(1,'sheet1_modi_vsl_opr_tp_cd'));
        formObj.modi_alln_vsl_cd.value=sheet1.GetCellValue(1,'sheet1_modi_alln_vsl_cd');//2017.02.24 NYK ADD
//        if(formObj.vsl_clss_flg.value == "Y"){
//        	formObj.modi_vsl_cd.className = "input";
//        }else{
//        	formObj.modi_vsl_cd.className = "input1";
//        }

        formObj.nyk_lgcy_vsl_cd_ctnt.value=sheet1.GetCellValue(1,'sheet1_nyk_lgcy_vsl_cd_ctnt');
        formObj.mol_lgcy_vsl_cd_ctnt.value=sheet1.GetCellValue(1,'sheet1_mol_lgcy_vsl_cd_ctnt');
        formObj.kline_lgcy_vsl_cd_ctnt.value=sheet1.GetCellValue(1,'sheet1_kline_lgcy_vsl_cd_ctnt');
        
//2017.12.26 수정 제외        
//        if( formObj.crr_cd.value == formObj.own_crr_cd.value ){
//    		formObj.nyk_lgcy_vsl_cd_ctnt.readOnly = true;
//    		formObj.mol_lgcy_vsl_cd_ctnt.readOnly = true;
//    		formObj.kline_lgcy_vsl_cd_ctnt.readOnly = true;
//    	}else{
//    		formObj.nyk_lgcy_vsl_cd_ctnt.readOnly = false;
//    		formObj.mol_lgcy_vsl_cd_ctnt.readOnly = false;
//    		formObj.kline_lgcy_vsl_cd_ctnt.readOnly = false;
//    	}
    }
}

function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
    ComOpenWait(false);
}
