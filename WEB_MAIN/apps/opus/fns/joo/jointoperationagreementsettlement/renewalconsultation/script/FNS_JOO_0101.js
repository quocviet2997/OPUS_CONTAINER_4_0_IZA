/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : FNS_JOO_0088.js
 *@FileTitle : Authority Office Creation
 *@author     : CLT
 *@version    : 1.0
 *@since      : 2014/06/17
 =========================================================*/
/*******************************************************************************
 * Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3; MODIFY=4; REMOVE=5;
 * REMOVELIST=6 MULTI=7 OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ******************************************************************************/
// common global variable
var sheetObjects = new Array();
var sheetCnt = 0;
var comboObjects = new Array();
var comboCnt = 0;
var gJoStlOptCd = "X";
var ROWMARK="|";
var FIELDMARK=",";
var gRefresh = false;
var dftUserFormatYmdhhmi = "####-##-## ##:##";
var gJoStlItmCdByOPR = "OPR";
var gCheckJoStlItmCds = ["S/H","OPR"];
var gAmountRoundPoint = 2;
var gDysRoundPoint = 5;

// Event handler processing by button click event */
document.onclick = processButtonClick;
// Event handler processing by button name */
function processButtonClick() {
    /** *** setting sheet object **** */
    var sheetObject = sheetObjects[0];
    /** **************************************************** */
    var formObj = document.form;
    var doc = document.all;
    try {
        var srcName = ComGetEvent("name");
        if (ComGetBtnDisable(srcName))
            return false;
        switch (srcName) {
            case "btn_Retrieve":
                ComSetObjValue(formObj.job_key, "");
                sheetObjects[0].RemoveAll();
                doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
                break;
            case "btn_New":
                initPeriod();
                ComSetObjValue(formObj.rev_vvd, "");
                ComSetObjValue(formObj.job_flg, "");
                gRefresh = false;
                formObj.proc_jb_flg.checked=true;
                formObj.proc_jb_flg.value ="Y";
                
                sheetObjects[0].RemoveAll();
                comboObjects[0].SetSelectIndex(-1, false);
                comboObjects[1].SetSelectIndex(-1, false);
                comboObjects[2].SetSelectIndex(-1, false);
                comboObjects[2].RemoveAll();
                comboObjects[3].SetSelectIndex(0);
                
                //doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
                break;
            case "btn_Save":
                ComSetObjValue(formObj.job_key, "");
                doActionIBSheet(sheetObjects[0], formObj, IBSAVE);
                break;
            case "btn_DownExcel":
                if(sheetObjects[0].RowCount() < 1){//no data
                    ComShowCodeMessage("COM132501");
                }else{
                    var paramObj = new Object();
                    paramObj.cols = 10;
                    var url = ComJooGetPgmTitle(sheetObjects[0], paramObj);
                    sheetObjects[0].Down2Excel({DownCols : makeHiddenSkipCol(sheetObjects[0]), SheetDesign : 1, Merge : 1});
                }
                break;              

            case "btn_vvd_from_back":
                UF_addMonth(formObj.fr_rev_yrmon, -1);
                sheetObjects[0].RemoveAll();
                break;
            case "btn_vvd_from_next":
                if (!GetCheckConditionPeriod()){
                    ComShowCodeMessage("JOO00078");
                    return;
                }
                UF_addMonth(formObj.fr_rev_yrmon, +1);
                sheetObjects[0].RemoveAll();
                break;
            case "btn_vvd_to_back":
                if (!GetCheckConditionPeriod()){
                    ComShowCodeMessage("JOO00078");
                    return;
                }
                UF_addMonth(formObj.to_rev_yrmon, -1);
                sheetObjects[0].RemoveAll();
                break;
            case "btn_vvd_to_next":
                UF_addMonth(formObj.to_rev_yrmon, +1);
                sheetObjects[0].RemoveAll();
                break;
            case "btn_Create":
                ComSetObjValue(formObj.job_key, "");
                sheetObjects[0].RemoveAll();
                doActionIBSheet(sheetObjects[0], formObj, IBCREATE);
                break;
            case "btn_Detail":
                if(sheetObjects[0].RowCount() < 1){//no data
                    ComShowCodeMessage("JOO00143");
                    return;
                }
                
                var selRow          = sheetObjects[0].GetSelectRow();
                var fr_rev_yrmon    = ComGetObjValue(form.fr_rev_yrmon);
                var to_rev_yrmon    = ComGetObjValue(form.to_rev_yrmon);
                var jo_crr_cd       = comboObjects[0].GetSelectCode();
                var jo_stl_itm_cds  = comboObjects[4].GetSelectCode();
                
                var sheet_jo_crr_cd = "";
                var sheet_jo_stl_itm_cd = "";
                var sheet_rev_vvd   = "";
                var sheet_rev_yrmon = "";
                var sheet_stl_vvd_seq = "";
                
                if(selRow >= sheetObjects[0].HeaderRows()){ 
                    sheet_jo_crr_cd = sheetObjects[0].GetCellValue(selRow, "jo_crr_cd");
                    sheet_jo_stl_itm_cd  = sheetObjects[0].GetCellValue(selRow, "jo_stl_itm_cd");
                    sheet_rev_vvd   = sheetObjects[0].GetCellValue(selRow, "rev_vvd");
                    sheet_rev_yrmon = sheetObjects[0].GetCellValue(selRow, "rev_yrmon");
                    sheet_stl_vvd_seq = sheetObjects[0].GetCellValue(selRow, "stl_vvd_seq");
                }
                
                var sUrl = "/opuscntr/FNS_JOO_0105.do";
                    sUrl += "?fr_rev_yrmon="+fr_rev_yrmon;
                    sUrl += "&to_rev_yrmon="+to_rev_yrmon;
                    sUrl += "&jo_crr_cd="+jo_crr_cd;
                    sUrl += "&jo_stl_itm_cds="+jo_stl_itm_cds;
                    sUrl += "&sheet_jo_crr_cd="+sheet_jo_crr_cd;
                    sUrl += "&sheet_jo_stl_itm_cd="+sheet_jo_stl_itm_cd;
                    sUrl += "&sheet_rev_vvd="+sheet_rev_vvd;
                    sUrl += "&sheet_rev_yrmon="+sheet_rev_yrmon;
                    sUrl += "&sheet_stl_vvd_seq="+sheet_stl_vvd_seq;
                
                ComOpenPopup(sUrl, 1000, 700,"SetActualDetail", "0,0", true, false, 0, 0, 0, "FNS_JOO_0105");
                break;
            case "btn_InvAautoCreate":
                var fr_rev_yrmon    = ComGetObjValue(form.fr_rev_yrmon);
                var to_rev_yrmon    = ComGetObjValue(form.to_rev_yrmon);
                var re_divr_cd      = ComGetObjValue(form.re_divr_cd);
                var jo_crr_cd       = comboObjects[0].GetSelectCode();
                var trd_cd          = comboObjects[1].GetSelectCode();
                var rlane_cd        = comboObjects[2].GetSelectCode();
                var auth_ofc_cd     = comboObjects[3].GetSelectCode();
                var jo_stl_itm_cds  = comboObjects[4].GetSelectCode();
                var rev_vvd         = ComGetObjValue(form.rev_vvd);
                
                var sUrl = "/opuscntr/FNS_JOO_0104.do";
                    sUrl += "?fr_rev_yrmon="+fr_rev_yrmon;
                    sUrl += "&to_rev_yrmon="+to_rev_yrmon;
                    sUrl += "&re_divr_cd="+re_divr_cd;
                    sUrl += "&jo_crr_cd="+jo_crr_cd;
                    sUrl += "&trd_cd="+trd_cd;
                    sUrl += "&rlane_cd="+rlane_cd;
                    sUrl += "&auth_ofc_cd="+auth_ofc_cd;
                    sUrl += "&jo_stl_itm_cds="+jo_stl_itm_cds;
                    sUrl += "&rev_vvd="+rev_vvd;
                
                ComOpenPopup(sUrl, 1000, 700,"SetInvoiceAutoCreate", "0,0", true, false, 0, 0, 0, "FNS_JOO_0104");
                break;
            case "btn_InvInquiry":
                alert("[btn_InvInquiry] 개발 진행중..");
                return;
                break;
                
            case "btn_delete":
                var checkedRows=(sheetObjects[0].FindCheckedRow("del_chk")).split("|");
                if (checkedRows == ""){
                    ComShowCodeMessage('JOO00143');
                    return;
                }
                
                sheetObjects[0].RenderSheet(0);
                for(var i=checkedRows.length-1; i >= 0; i--){
                    var chkRow = checkedRows[i];
                    stat=sheetObjects[0].GetRowStatus(chkRow);
                    if (sheetObjects[0].GetRowHidden(chkRow) == false){
                        var tmpStlVvdSeq  = sheetObjects[0].GetCellValue(chkRow, "stl_vvd_seq");
                        var tmpActSlipAmt = sheetObjects[0].GetCellValue(chkRow, "act_slip_amt");
                        var tmpActApprAmt = sheetObjects[0].GetCellValue(chkRow, "act_appr_amt");
                        var tmpChkDel     = sheetObjects[0].GetCellValue(chkRow, "chk_del_flg");
                        //chk_del : Y - Delete 가능, N - Delete 불가.
                        if(tmpChkDel == "N"){
                            continue;
                        }else{
                            if (sheetObjects[0].GetRowStatus(chkRow) == "I"){
                                sheetObjects[0].RowDelete(chkRow, false);
                            }else{
                                sheetObjects[0].SetCellValue(chkRow, "del_chk", 0, 0);
                                sheetObjects[0].SetRowHidden(chkRow, 1);
                                sheetObjects[0].SetRowStatus(chkRow, "D");
                            }
                        }
                    }
                }
                sheetObjects[0].RenderSheet(1);

                break;
            case "btn_add":
                break;
                
            case "proc_jb_flg":
                if (formObj.proc_jb_flg.checked){
                    formObj.proc_jb_flg.value="Y";
                }else{
                    formObj.proc_jb_flg.value="N";
                }
                break;

            case "btn_summary":
                var fr_rev_yrmon    = ComGetObjValue(form.fr_rev_yrmon);
                var to_rev_yrmon    = ComGetObjValue(form.to_rev_yrmon);
                var re_divr_cd      = ComGetObjValue(form.re_divr_cd);
                var jo_crr_cd       = comboObjects[0].GetSelectCode();
                var trd_cd          = comboObjects[1].GetSelectCode();
                var rlane_cd        = comboObjects[2].GetSelectCode();
                var jo_stl_itm_cds  = comboObjects[4].GetSelectCode();
                var rev_vvd         = ComGetObjValue(form.rev_vvd);
                var auth_ofc_cd     = ComGetObjValue(form.auth_ofc_cd);
                
                var sUrl = "/opuscntr/FNS_JOO_0108.do";
                    sUrl += "?fr_rev_yrmon="+fr_rev_yrmon;
                    sUrl += "&to_rev_yrmon="+to_rev_yrmon;
                    sUrl += "&re_divr_cd="+re_divr_cd;
                    sUrl += "&jo_crr_cd="+jo_crr_cd;
                    sUrl += "&trd_cd="+trd_cd;
                    sUrl += "&rlane_cd="+rlane_cd;
                    sUrl += "&jo_stl_itm_cds="+jo_stl_itm_cds;
                    sUrl += "&rev_vvd="+rev_vvd;
                    sUrl += "&auth_ofc_cd="+auth_ofc_cd;
                
                ComOpenPopup(sUrl, 700, 500,"SetSettlementTargetSummary", "0,0", true, false, 0, 0, 0, "FNS_JOO_0108");
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
/**
 * registering IBSheet Object as list adding process for list in case of needing
 * batch processing with other items defining list on the top of source
 */
function setSheetObject(sheet_obj) {
    sheetObjects[sheetCnt++] = sheet_obj;
}
/**
 * registering IBCombo Object as list param : combo_obj adding process for list
 * in case of needing batch processing with other items defining list on the top
 * of source
 */
function setComboObject(combo_obj) {
    comboObjects[comboCnt++] = combo_obj;
}
/**
 * setting Combo basic info
 * 
 * @param comboObj
 * @param comboIndex
 *            Number
 */
function initCombo(comboObj, comboNo) {
    var formObject = document.form;
    switch (comboObj.options.id) {
        case "jo_crr_cd":
            with (comboObj) {
                SetMultiSelect(0);
                SetUseAutoComplete(1);
                SetColAlign(0, "left");
                // SetColWidth(0, "60");
                ValidChar(2, 1); // Uppercase
                SetDropHeight(160);
                SetMaxLength(3);
            }
            var comboItems = gJoCrrCdComboItems.split("|");
            addComboItem(comboObj, comboItems);
            break;
        case "trd_cd":
            with (comboObj) {
                SetMultiSelect(0);
                SetUseAutoComplete(1);
                SetColAlign(0, "left");
                // SetColWidth(0, "60");
                ValidChar(2, 1); // Uppercase
                SetDropHeight(160);
                SetMaxLength(3);
            }
            break;
        case "rlane_cd":
            with (comboObj) {
                SetMultiSelect(0);
                SetUseAutoComplete(1);
                SetColAlign(0, "left");
                // SetColWidth(0, "80");
                ValidChar(2, 1); // Uppercase
                SetDropHeight(200);
            }
            break;
        case "auth_ofc_cd":
            with (comboObj) {
                SetMultiSelect(0);
                SetUseAutoComplete(1);
                SetColAlign(0, "left");
                // SetColWidth(0, "60");
                ValidChar(2, 1); // Uppercase
                SetDropHeight(160);
                SetMaxLength(3);
            }
            var comboItems = authOfcCdComboItems.split("|");
            addComboItem(comboObj, comboItems);
            comboObj.SetSelectIndex(0,false);
            if (comboItems.length == 1){
                comboObj.SetEnable(0);
            }else{
                comboObj.SetEnable(1);
            }
            break;
        case "jo_stl_itm_cds":
            with (comboObj) { 
                SetMultiSelect(true);
                SetMultiSeparator(",");  // add 
                SetUseAutoComplete(1);
                SetColAlign(0, "left");
                //SetColAlign(1, "left");
                SetColWidth(0, "80");
                //SetColWidth(1, "130");
                SetDropHeight(170);
                ValidChar(2,1);//only upper case
                SetMaxLength(7);
            }
            if (ComTrim(gJoStlItmCdComboItems) != ""){
                var comboItems=gJoStlItmCdComboItems.split(ROWMARK);
                var comboItem="";
                jo_stl_itm_cds.InsertItem(-1, "ALL|", "ALL");    //ALL
                for (var i=0 ; i < comboItems.length ; i++) {
                    comboItem=comboItems[i].split(FIELDMARK);
                    jo_stl_itm_cds.InsertItem(-1, comboItem[0], comboItem[0]);
                }
                jo_stl_itm_cds.SetSelectIndex(0);
            }else{
                jo_stl_itm_cds.RemoveAll();
            }
            break;
    }
}
/**
 * initializing sheet implementing onLoad event handler in body tag adding
 * first-served functions after loading screen.
 */
function loadPage() {
    for (i = 0; i < sheetObjects.length; i++) {
        ComConfigSheet(sheetObjects[i]);
        initSheet(sheetObjects[i], i + 1);
        ComEndConfigSheet(sheetObjects[i]);
    }
    
    // initializing IBMultiCombo
    for (var k = 0; k < comboObjects.length; k++) {
        initCombo(comboObjects[k], k + 1);
    }
    initControl();
    //doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}
function initControl() {
    var formObject=document.form;   

    /*
    TO : 현재 월
    FR : 현재 월 - 2 : 3개월전.
    */ 
    initPeriod();  
    
}

function initPeriod(){
    var formObj=document.form;
    
    //From : -3년, To : +1 월
    var tmpToYm = ComGetNowInfo("ymd","-"); //ComGetDateAdd(formObj.exe_yrmon.value,"M", 1);
    formObj.to_rev_yrmon.value=JooGetDateFormat(tmpToYm,"ym");
    
    //년월 만 하면 -3년이 넘게 설정 되어 동일 월로 설정하기 위해서 2015-07-02 로 Day 를 마춘다.
    var tmpFrYm = ComGetDateAdd(formObj.to_rev_yrmon.value+"-01","M", -2);
    formObj.fr_rev_yrmon.value=JooGetDateFormat(tmpFrYm,"ym"); 
}

/**
 * setting sheet initial values and header param : sheetObj, sheetNo adding case
 * as numbers of counting sheets
 */
function initSheet(sheetObj, sheetNo) {
    var cnt = 0;
    switch (sheetObj.id) {
        case "sheet1": // t1sheet1 init     //t1sheet1 init
            with(sheetObj){
                var HeadTitle1 ="|Del|CHK|G.No|Rev\n/Exp|Item|Curr.|Partner|Rev.VVD|Rev.\nLane|VVD Duration|VVD Duration|VVD Duration|VVD Duration|VVD Duration|";
                    HeadTitle1 +="BSA|BSA|BSA|BSA|From\nEstimation|Actual Status|Actual Status|Actual Status|Settlement\nAmount|Remark|";
                    HeadTitle1 +="stl_vvd_seq|rev_yrmon|act_dt|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd|min_estm_yrmon|max_estm_yrmon|acct_cd|BSA Priority|PRC Priority|chk_del_flg|chk_eq_act_flg|chk_edit_flg";
                var HeadTitle2 ="|Del|CHK|G.No|Rev\n/Exp|Item|Curr.|Partner|Rev.VVD|Rev.\nLane|From Date|To Date|Total\nDays|Month|Month\nDays|";
                    HeadTitle2 +="Type|BSA|Slot\nPrice|Slottage|From\nEstimation|Invoiced|Slip|Approved|Settlement\nAmount|Remark|";
                    HeadTitle2 +="stl_vvd_seq|rev_yrmon|act_dt|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd|min_estm_yrmon|max_estm_yrmon|acct_cd|BSA Priority|PRC Priority|chk_del_flg|chk_eq_act_flg|chk_edit_flg";
               var headCount=ComCountHeadTitle(HeadTitle1);
                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1, FrozenCol:10 } );
                var info    = { Sort:0, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"}, { Text:HeadTitle2, Align:"Center"} ];
                InitHeaders(headers, info);
    
                var cols = [ 
                       {Type:"Status",    Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
                       {Type:"CheckBox",  Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"del_chk" },
                       {Type:"CheckBox",  Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"stl_tgt_flg",      TrueValue:"Y", FalseValue:"N"},
                       {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"grp_no",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Combo",     Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"re_divr_cd",       KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"ComboEdit", Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"jo_stl_itm_cd",    KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:"locl_curr_cd",     KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"PopupEdit", Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:"jo_crr_cd",        KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"PopupEdit", Hidden:0, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"rev_vvd",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"rlane_cd",         KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:110,  Align:"Center",  ColMerge:0,   SaveName:"st_dt",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                       {Type:"Text",      Hidden:0, Width:110,  Align:"Center",  ColMerge:0,   SaveName:"end_dt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                       {Type:"Text",      Hidden:0, Width:75,   Align:"Right",   ColMerge:0,   SaveName:"sail_dys",         KeyField:0,   CalcLogic:"",   Format:"Float",       UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Date",      Hidden:0, Width:60,   Align:"Center",  ColMerge:0,   SaveName:"estm_yrmon",       KeyField:0,   CalcLogic:"",   Format:"Ym",          PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:75,   Align:"Right",   ColMerge:0,   SaveName:"estm_dys",         KeyField:0,   CalcLogic:"",   Format:"Float",       UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Combo",     Hidden:0, Width:80,   Align:"Left",    ColMerge:0,   SaveName:"jo_stl_jb_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:60,   Align:"Right",   ColMerge:0,   SaveName:"bsa_qty",          KeyField:0,   CalcLogic:"",   Format:"Float",       UpdateEdit:1,   InsertEdit:1 },
                       {Type:"Text",      Hidden:0, Width:60,   Align:"Right",   ColMerge:0,   SaveName:"bsa_slt_prc",      KeyField:0,   CalcLogic:"",   Format:"Float",       UpdateEdit:1,   InsertEdit:1 },
                       {Type:"Float",     Hidden:0, Width:80,   Align:"Right",   ColMerge:0,   SaveName:"estm_amt",         KeyField:0,   CalcLogic:"",   Format:"Float",       UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",     Hidden:0, Width:80,   Align:"Right",   ColMerge:0,   SaveName:"from_estm_amt",    KeyField:0,   CalcLogic:"",   Format:"Float",       UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",     Hidden:0, Width:80,   Align:"Right",   ColMerge:0,   SaveName:"act_inv_amt",      KeyField:0,   CalcLogic:"",   Format:"Float",       UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",     Hidden:0, Width:80,   Align:"Right",   ColMerge:0,   SaveName:"act_slip_amt",     KeyField:0,   CalcLogic:"",   Format:"Float",       UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",     Hidden:0, Width:80,   Align:"Right",   ColMerge:0,   SaveName:"act_appr_amt",     KeyField:0,   CalcLogic:"",   Format:"Float",       UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",     Hidden:0, Width:80,   Align:"Right",   ColMerge:0,   SaveName:"act_amt",          KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
                       {Type:"Text",      Hidden:0, Width:160,  Align:"Left",    ColMerge:0,   SaveName:"stl_rmk",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"stl_vvd_seq",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"rev_yrmon",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"act_dt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"vsl_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"skd_voy_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"skd_dir_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"rev_dir_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"min_estm_yrmon",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"max_estm_yrmon",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"acct_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"chk_qty_priority", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"chk_prc_priority", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"chk_del_flg",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"chk_eq_act_flg",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"chk_del_mrk_flg",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"chk_edit_flg",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }
                       ];
                 
                InitColumns(cols);
                SetColProperty(0    , "re_divr_cd"      , {ComboText:"Rev|Exp", ComboCode:"R|E", DefaultValue:"R"} );
                SetColProperty(0    , "jo_stl_itm_cd"   , {ComboText:"|"+gJoStlItmCdComboItems, ComboCode:"|"+gJoStlItmCdComboItems} );
                SetColProperty(0    , "jo_stl_jb_cd"    , {ComboText:"|"+joStlJbNmComboItems, ComboCode:"|"+joStlJbCdComboItems} ); 
                SetColProperty(0    , "jo_crr_cd"       , {AcceptKeys:"E"   , InputCaseSensitive:1});
                SetColProperty(0    , "rlane_cd"        , {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0    , "st_dt"           , {Format:dftUserFormatYmdhhmi, AcceptKeys:"N"} );
                SetColProperty(0    , "end_dt"          , {Format:dftUserFormatYmdhhmi, AcceptKeys:"N"} );
                SetColProperty(0    , "bsa_qty"         , {AcceptKeys:"N|[.]"} );
                SetColProperty(0    , "bsa_slt_prc"     , {AcceptKeys:"N|[.]"} );
                SetEditable(1);
                SetShowButtonImage(1);
                resizeSheet();
             }
            break;
    }
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction, cRow) {
    sheetObj.ShowDebugMsg(false);
    switch (sAction) {
        case IBSEARCH: // retrieve
            if (!validateForm(sheetObj, formObj, sAction)) {
                return;
            }
            
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH;
            var param = FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("FNS_JOO_0101GS.do", param);
            
            var jobKey=ComGetEtcData(sXml,"job_key");
            if (jobKey.length > 0) {
                gRefresh = true;
                ComSetObjValue(formObj.job_flg, "RETRIEVE");
                ComSetObjValue(formObj.job_key, jobKey);
                sheetObj.SetWaitImageVisible(0);
                ComOpenWait(true);
                sheetObj.SetWaitTimeOut(10000);
                timer = setInterval(GetBackEndJobStatus, 3000); // action GetBackEndJobStatus function after 3 seconds.
            }
            break;

        case IBCREATE: // create 
            if (!validateForm(sheetObj, formObj, sAction)) {
                return;
            }
            
            ComOpenWait(true);
            formObj.f_cmd.value=COMMAND01;
            var param = FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("FNS_JOO_0101GS.do", param);
            
            var jobKey=ComGetEtcData(sXml,"job_key");
            if (jobKey.length > 0) {
                gRefresh = true;
                ComSetObjValue(formObj.job_flg, "CREATE");
                ComSetObjValue(formObj.job_key, jobKey);
                sheetObj.SetWaitImageVisible(0);
                ComOpenWait(true);
                sheetObj.SetWaitTimeOut(10000);
                timer = setInterval(GetBackEndJobStatus, 3000); // action GetBackEndJobStatus function after 3 seconds.
            }
            break;
            
        case IBSEARCH_ASYNC10: //BackEndJob Status
            formObj.f_cmd.value=SEARCH01;
            var param = FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("FNS_JOO_0101GS.do", param);
            
            var jobState=ComGetEtcData(sXml, "jb_sts_flg")+"";
            
            // 2 : processing, 3:success , 4:fail
            if (jobState == "3") {//success
                ComOpenWait(false);
                clearInterval(timer);
                //ComShowCodeMessage("JOO00160"); //Success to execute
                //ComShowMessage("Success to execute.");
                //ComSetObjValue(formObj.job_key, "");
                var jobFlg = ComGetObjValue(formObj.job_flg);
                if (jobFlg == "RETRIEVE" || jobFlg == "CREATE"){
                    doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC11);
                }else if(jobFlg == "SAVE"){
                    ComFireEvent(ComGetObject("btn_Retrieve") ,"click");
                }
                
            } else if (jobState == "4") { // BackEndJob Fail
                ComOpenWait(false);
                clearInterval(timer);
                ComShowMessage("Fail to retrieve or create.");
            } else if (jobState == "5") {
                ComOpenWait(false);
                clearInterval(timer);
                ComShowMessage("Read result file aleady.");
            }
            break;            
        case IBSEARCH_ASYNC11://BackEndJob result - process 3.          
            sheetObj.SetWaitImageVisible(1);
            formObj.f_cmd.value=SEARCH02;
            var param = FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("FNS_JOO_0101GS.do", param);
            sheetObj.LoadSearchData(sXml,{Sync:1} );
            //초기화
            ComSetObjValue(formObj.job_flg, "");
            break;    
            
        case IBSEARCH_ASYNC02: // Get List Trade Code By Carrier Code
            formObj.f_cmd.value = SEARCH24; //SEARCHLIST06;
            var joCrrCd = jo_crr_cd.GetSelectCode();
            var param = FormQueryString(formObj);
                param += "&super_cd1=" + joCrrCd;
                
            var sXml = sheetObj.GetSearchData("JOOCommonGS.do", param);
            ComXml2ComboItem(sXml, trd_cd, "code", "code");
            break;
        case IBSEARCH_ASYNC03: // Get List Lane Code By Trade Code
            formObj.f_cmd.value = SEARCH25; //SEARCHLIST07;
            var joCrrCd = jo_crr_cd.GetSelectCode();
            var trdCd   = trd_cd.GetSelectCode();
            var param = FormQueryString(formObj);
                param += "&super_cd1=" + joCrrCd;
                param += "&super_cd2=" + trdCd;
                
            var sXml = sheetObj.GetSearchData("JOOCommonGS.do", param);
            ComXml2ComboItem(sXml, rlane_cd, "code", "code");
            break;
            
        case IBSAVE: // save
            if (!validateForm(sheetObj, formObj, sAction)) {
                return;
            }
            sheetObj.SetWaitImageVisible(0);
            ComOpenWait(true);
            formObj.f_cmd.value = MULTI;
            var param = ComGetSaveString(sheetObj, true, true);
                param += "&" + FormQueryString(formObj);
            var sXml = sheetObj.GetSaveData("FNS_JOO_0101GS.do", param);
            
            var jobKey=ComGetEtcData(sXml, "job_key");
            if (jobKey.length > 0) {
                gRefresh=false;
                ComSetObjValue(formObj.job_flg, "SAVE");
                ComSetObjValue(formObj.job_key, jobKey);
                sheetObj.SetWaitImageVisible(0);
                ComOpenWait(true);
                sheetObj.SetWaitTimeOut(10000);
                timer=setInterval(GetBackEndJobStatus, 3000); // action GetBackEndJobStatus function after 3 seconds.
            }
            break;
        case IBINSERT: // insert
            break;
            
        case IBSEARCH_ASYNC08: // Carrier/Trade/RLane Combo Code By Auth Office Code
            var authOfcCd = auth_ofc_cd.GetSelectCode();
            var param = "";
                param += "f_cmd="   + SEARCH23;
                param += "&auth_ofc_cd=" + authOfcCd;
            
            var sXml = sheetObj.GetSearchData("JOOCommonGS.do", param);
            
            var joCrrCds    = ComGetEtcData(sXml, "jo_crr_cds");
            var trdCds      = ComGetEtcData(sXml, "trd_cds");
            var rlaneCds    = ComGetEtcData(sXml, "rlane_cds");
            
            var joCrrCdComboItems = joCrrCds.split("|");
            addComboItem(jo_crr_cd, joCrrCdComboItems);
            
            //재조회.
            //doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
            
            break;
    }
}
function sheet1_OnChange(sheetObj, Row, Col, Value, OldValue, RaiseFlag) {
    var value = sheetObj.GetCellValue(Row, Col);
    var colName = sheetObj.ColSaveName(Col);
    switch (colName) {
        case "bsa_qty" :
            SetMakeCalculation(sheetObj, Row, Col);
            break;
        case "bsa_slt_prc":
            SetMakeCalculation(sheetObj, Row, Col);
            break;
        case "st_dt":
            var tmpJoStlItmCd   = sheetObj.GetCellValue(Row, "jo_stl_itm_cd");
            if(!GetCheckJoStlOptItem(tmpJoStlItmCd)) return;
            
            var sFrDate = sheetObj.GetCellValue(Row, "st_dt");
            var sToDate = sheetObj.GetCellValue(Row, "end_dt");
            if(!GetCheckPeriod(sFrDate, sToDate)){
                return;
            }else{
                SetMakeVvdDurationCalculation(sheetObj, Row, Col);
            }
            break;
        case "end_dt":
            var tmpJoStlItmCd   = sheetObj.GetCellValue(Row, "jo_stl_itm_cd");
            if(!GetCheckJoStlOptItem(tmpJoStlItmCd)) return;
            
            var sFrDate = sheetObj.GetCellValue(Row, "st_dt");
            var sToDate = sheetObj.GetCellValue(Row, "end_dt");
            if(!GetCheckPeriod(sFrDate, sToDate)){
                return;
            }else{
                SetMakeVvdDurationCalculation(sheetObj, Row, Col);
            }           
            
            break;
    }
}
function sheet1_OnAfterEdit(sheetObj, Row, Col) {
    var value = sheetObj.GetCellValue(Row, Col);
    var colName = sheetObj.ColSaveName(Col);
    switch (colName) {
        case "bsa_qty" :
            //SetMakeCalculation(sheetObj, Row, Col);
            break;
        case "bsa_slt_prc":
            //SetMakeCalculation(sheetObj, Row, Col);
            break;
        case "st_dt":
            var tmpJoStlItmCd   = sheetObj.GetCellValue(Row, "jo_stl_itm_cd");
            if(!GetCheckJoStlOptItem(tmpJoStlItmCd)) return;
            
            var sFrDate = sheetObj.GetCellValue(Row, "st_dt");
            var sToDate = sheetObj.GetCellValue(Row, "end_dt");
            if(!GetCheckPeriod(sFrDate, sToDate)){
                return;
            }else{
                //SetMakeVvdDurationCalculation(sheetObj, Row, Col);
            }
            break;
        case "end_dt":
            var tmpJoStlItmCd   = sheetObj.GetCellValue(Row, "jo_stl_itm_cd");
            if(!GetCheckJoStlOptItem(tmpJoStlItmCd)) return;
            
            var sFrDate = sheetObj.GetCellValue(Row, "st_dt");
            var sToDate = sheetObj.GetCellValue(Row, "end_dt");
            if(!GetCheckPeriod(sFrDate, sToDate)){
                return;
            }else{
                //SetMakeVvdDurationCalculation(sheetObj, Row, Col);
            }           
            
            break;
    }
}
function sheet1_OnEditValidation(sheetObj,Row, Col, Value) { 
    var colName = sheetObj.ColSaveName(Col);
    switch (colName) {
        case "del_chk" :
            //정책2. 체크된 레코드의 Estimated Cost 를 빼주어야 한다. Value = 1 : 빼준다. Value = 0 더해준다.
            
            //정책3. Total Count 를 그룹체크만큼 제외 시켜 준다.
            break;
        case "bsa_qty" :
            //var val=sheetObj.GetCellValue(Row, Col);
            if(!SetCipherLess(Value, 10, 3)){
                sheetObj.ValidateFail(2);
            }
            break;
        case "bsa_slt_prc":
            //var val=sheetObj.GetCellValue(Row, Col);
            if(!SetCipherLess(Value, 13, 3)){
                sheetObj.ValidateFail(2); 
            }
            break;
        case "st_dt":
            var tmpJoStlItmCd   = sheetObj.GetCellValue(Row, "jo_stl_itm_cd");
            if(!GetCheckJoStlOptItem(tmpJoStlItmCd)) return;
            
            if(ComIsEmpty(Value)) return;
            
            var sDate = getArgValue(ComGetUnMaskedValue(Value   , "ymdhm"));
            if(!ComIsDateTime(sDate , "ymd", "hm")){
                
                sheetObj.ValidateFail(2, ComShowMessage(ComGetMsg('JOO00201'))); 
                //sheetObj.SelectCell(Row, Col);
            }
            break;
        case "end_dt":
            var tmpJoStlItmCd   = sheetObj.GetCellValue(Row, "jo_stl_itm_cd");
            if(!GetCheckJoStlOptItem(tmpJoStlItmCd)) return;
            
            if(ComIsEmpty(Value)) return;
            
            var sDate = getArgValue(ComGetUnMaskedValue(Value   , "ymdhm"));
            if(!ComIsDateTime(sDate , "ymd", "hm")){
                sheetObj.ValidateFail(2, ComShowMessage(ComGetMsg('JOO00202'))); 
                //sheetObj.SelectCell(Row, Col);
            }
            break;
    }
}
function GetCheckJoStlOptItem(chkItem){
    for(var i=0; i < gCheckJoStlItmCds.length; i++){
        if(gCheckJoStlItmCds[i].indexOf(chkItem) > -1 ){
            return true;
        }
    }
    return false;
}

function GetCheckManualJoStlOptItem(chkItem){
    if(gJoStlMnlItmCdComboItems.indexOf(chkItem) > -1){
        return true;
    }else{
        return false;
    }
}

/**
 * 정책1.sheet1_org_estm_amt = sheet1_bsa_qty|*|sheet1_bsa_slt_prc (변경된 Row를 가지고 동일 그룹 모두 변경)
 * @param sheetObj
 */
function SetMakeCalculation(sheetObj,Row, Col){
    var bsaQty          = sheetObj.GetCellValue(Row, "bsa_qty");
    var bsaSltPrc       = sheetObj.GetCellValue(Row, "bsa_slt_prc");
    var grpNo           = sheetObj.GetCellValue(Row, "grp_no");
    
    var orgEstmAmt      = JooComGetRound(Number(bsaQty) * Number(bsaSltPrc), gAmountRoundPoint);
    var nowTmpTotEstmAmt= 0;
    
    var iStRow          = GetSheetRangeRow(sheetObj, Row, "S");
    var iEdRow          = GetSheetRangeRow(sheetObj, Row, "E");
    
    var tmpJoStlItmCd   = sheetObj.GetCellValue(Row, "jo_stl_itm_cd");
    if(tmpJoStlItmCd == gJoStlItmCdByOPR || GetCheckManualJoStlOptItem(tmpJoStlItmCd)){ //S/H 를 제외한 나머지 Item.
        //bsa_qty Data Set.
        sheetObj.SetCellValue(Row, "bsa_qty"      , bsaQty, 0);
        
        //bsa_slt_prc Data Set.
        sheetObj.SetCellValue(Row, "bsa_slt_prc"  , bsaSltPrc, 0);
        
        //Opr은 estm_dys를 * 연산 추가.
        var sheetEstmDys    = sheetObj.GetCellValue(Row, "estm_dys"); 
        orgEstmAmt          = JooComGetRound(Number(bsaQty) * Number(bsaSltPrc) * Number(sheetEstmDys), gAmountRoundPoint);        
        
        //org_estm_amt Data Set.
        sheetObj.SetCellValue(Row, "org_estm_amt" , orgEstmAmt, 0);
        
        sheetObj.SetCellValue(Row, "estm_amt"     , orgEstmAmt, 0);
    }else{      
        for (var i=iStRow; i<=iEdRow; i++){
            //1. 동일 그룹 찾기 ( 나 자신 포함)
            var tmpGrpNo        = sheetObj.GetCellValue(i, "grp_no");
            var tmpJoStlItmCd   = sheetObj.GetCellValue(i, "jo_stl_itm_cd");
            var sheetSailDys    = "";
            var sheetEstmDys    = "";
            var tmpEstmAmt      = "";
            var tmpEstmYrmon    = "";
            if(grpNo == tmpGrpNo){            
                //bsa_qty Data Set.
                sheetObj.SetCellValue(i, "bsa_qty"      , bsaQty, 0);
                
                //bsa_slt_prc Data Set.
                sheetObj.SetCellValue(i, "bsa_slt_prc"  , bsaSltPrc, 0);
                
                //org_estm_amt Data Set.
                sheetObj.SetCellValue(i, "org_estm_amt" , orgEstmAmt, 0);
                
                sheetSailDys = sheetObj.GetCellValue(i, "sail_dys");
                sheetEstmDys = sheetObj.GetCellValue(i, "estm_dys");                
                
                //각월별 Estimated Cost Data Set. orgEstmAmt * Days / Total
                var tmpEstmYrMonDys = JooComGetRound( Number(sheetEstmDys) / Number(sheetSailDys), gDysRoundPoint);
                var tmpEstmAmt      = JooComGetRound( Number(orgEstmAmt) *  Number(tmpEstmYrMonDys) , gAmountRoundPoint);
                
                //estm_amt Data Set.
                sheetObj.SetCellValue(i, "estm_amt", tmpEstmAmt, 0);
                
                nowTmpTotEstmAmt    = Number(nowTmpTotEstmAmt) + Number(tmpEstmAmt);
                
                var sheetEndDt      = sheetObj.GetCellValue(i, "end_dt");
                var sheetEstmYrmon  = sheetObj.GetCellValue(i, "estm_yrmon");
                
                //5.End Duration 년월 == estmYrmon 가 동일할때는 수치 보정을 해준다.
                if(sheetEndDt.substring(0,6) == sheetEstmYrmon){
                    //Estimated Cost 보정.
                    tmpEstmAmt = Number(tmpEstmAmt) + (Number(orgEstmAmt) - Number(nowTmpTotEstmAmt));
                    sheetObj.SetCellValue(i, "estm_amt", tmpEstmAmt, 0);
                }
            }
        }
    }
}

function GetVoySailDays(sFrDate, sToDate) {
    var dVoyDays = 0;
    sFrDate = getArgValue(ComGetUnMaskedValue(sFrDate   , "ymdhm"));
    sToDate = getArgValue(ComGetUnMaskedValue(sToDate   , "ymdhm"));

    if(!GetCheckPeriod(sFrDate, sToDate)) return;
    try {
        dVoyDays = JooComGetDaysBetween2(sFrDate, sToDate, gDysRoundPoint);//소수점 5자리까지.
    } catch(err) {ComFuncErrMsg(err.message);}
    
    return dVoyDays;
}

function GetVvdDurationMonthData(stDt, endDt, maxDt)
{
    var sText = getArgValue(stDt);
    var eText = getArgValue(endDt);
    var mText = getArgValue(maxDt);
    sYear  = sText.substring(0,4);
    sMonth = sText.substring(4,6);
    sDay   = sText.substring(6,8);
    eYear  = eText.substring(0,4);
    eMonth = eText.substring(4,6);
    eDay   = eText.substring(6,8);
    
    mTextYrmon = mText.substring(0,6);
    
    if(!ComIsDay( year,month ,day)) return false;
    
    var FromDate    = new Date(ComParseInt(sYear),ComParseInt(sMonth)-1,ComParseInt(sDay));
    var ToDate      = new Date(ComParseInt(eYear),ComParseInt(eMonth)-1,ComParseInt(eDay));

    var diffYears   = ToDate.getFullYear()  - FromDate.getFullYear();
    var diffMonths  = ToDate.getMonth()     - FromDate.getMonth() + 1;
    var diffDays    = ToDate.getDate()      - FromDate.getDate();
    
    var months = (diffYears*12 + diffMonths);
    var arryEstmYrmon = new Array();
    
    //sText는 Day는 무조건 01로 준다.
    for(var i=0 ; i < months ; i++){
        var tmpEstmYrmon = ComGetUnMaskedValue(JooGetDateFormat(ComGetDateAdd(sText, "M", i),"ym"),"ym");
        if(parseInt(tmpEstmYrmon) <= parseInt(mTextYrmon)){
            arryEstmYrmon[i] = tmpEstmYrmon;
        }
    }
    return arryEstmYrmon;
}

function GetVvdDurationMonthSheetContains(sheetObj, yrMon, grpNo, iStRow, iEdRow){
    for (var i=iStRow; i<=iEdRow; i++){
        //1. 동일 그룹 찾기 ( 나 자신 포함)
        var tmpGrpNo = sheetObj.GetCellValue(i, "grp_no");
        if(grpNo == tmpGrpNo){
            var tmpEstmYrmon = sheetObj.GetCellValue(i, "estm_yrmon");
            if(yrMon == tmpEstmYrmon){
                return true;
            }
        }
    }
    
    return false;
}
function GetVoyEstmDays(sFrDate, sToDate, sEstmYrmon){
    sFrDate     = getArgValue(ComGetUnMaskedValue(sFrDate       , "ymdhm"));
    sToDate     = getArgValue(ComGetUnMaskedValue(sToDate       , "ymdhm"));
    sEstmYrmon  = getArgValue(ComGetUnMaskedValue(sEstmYrmon    , "ym"));
    
    //YYYYMMDDHH24MISS 포맷으로 맞추어 준다.
    var tmpFrDate = "";
    var tmpToDate = "";
    //Estm 시작일
    if(sEstmYrmon == sFrDate.substring(0,6)){
        tmpFrDate = sFrDate     + "00";
    }else{
        tmpFrDate = sEstmYrmon  + "01000000";
    }
    
    //Estm 종료일
    if(sEstmYrmon ==  sToDate.substring(0,6)){
        //tmpToDate = sToDate + "00";
        tmpToDate = sToDate + "59";
    }else{
        //마지막 날을 찾는다.
        var varLastDay = ComGetLastDay(parseInt(sEstmYrmon.substr(0,4)), parseInt(sEstmYrmon.substr(4,6)));
        //tmpToDate = sEstmYrmon + varLastDay + "235900";
        tmpToDate = sEstmYrmon + varLastDay + "235959";
    }
    
    var dEstmDays = 0;
    try {
        dEstmDays = JooComGetDaysBetween2(tmpFrDate, tmpToDate, gDysRoundPoint);//소수점 5자리까지.
    } catch(err) {ComFuncErrMsg(err.message);}
    
    return dEstmDays;
}
function GetVvdDurationMonthContains(arrayObj, yrMon){
    if(arrayObj.length > 0){
        for (var j=0 ; j < arrayObj.length; j++){
            var varEstmYrmon = arrayObj[j];
            if(varEstmYrmon == yrMon){
                return true;
            }
        }       
    }
    return false;
}
/*
//From 정책1. 수정된 년월이 ByMonth 보다 얼마나 작은지 확인. >> 차수 만큼 Row Insert 한다.
//From 정책2. 수정된 년월이 Bymonth 보다 얼마나 큰지 확인.   >> 차수 만큼 Row Delete 한다.
*/
function SetMakeVvdDurationCalculation(sheetObj,Row, Col){
    var grpNo           = sheetObj.GetCellValue(Row, "grp_no"); 
    var stDt            = sheetObj.GetCellValue(Row, "st_dt"); 
    var endDt           = sheetObj.GetCellValue(Row, "end_dt"); 
    var estmYrmon       = sheetObj.GetCellValue(Row, "estm_yrmon");
    var minEstmYrmon    = sheetObj.GetCellValue(Row, "min_estm_yrmon");
    var maxEstmYrmon    = sheetObj.GetCellValue(Row, "max_estm_yrmon");
    
    var bsaQty          = sheetObj.GetCellValue(Row, "bsa_qty");
    var bsaSltPrc       = sheetObj.GetCellValue(Row, "bsa_slt_prc");
    var orgEstmAmt      = JooComGetRound(Number(bsaQty) * Number(bsaSltPrc), gAmountRoundPoint);
    
    var tmpFrDate = stDt.substring(0,6)     + "01";
    var tmpToDate = endDt.substring(0,6)    + "01";
    var tmpMaxDate= endDt.substring(0,6)    + "01";
    //var tmpMaxDate= exeYrmon.substring(0,6) + "01";
    
    var tmpSailDys = GetVoySailDays(stDt, endDt);
    
    var arrayEstmYrmon = GetVvdDurationMonthData(tmpFrDate, tmpToDate, tmpMaxDate);
    
    var iStRow          = GetSheetRangeRow(sheetObj, Row, "S");
    var iEdRow          = GetSheetRangeRow(sheetObj, Row, "E");
    
    var iSheetBreakCnt=0;
    if(arrayEstmYrmon.length > 0){
        //insert 
        for (var j=0 ; j < arrayEstmYrmon.length; j++){
            var varEstmYrmon = arrayEstmYrmon[j];       
            //var iSheetBreakCnt=0;
            var isFirstRow = true;
            var iStartMaxRow = 0;

            for (var i=iStRow; i<=iEdRow; i++){
                //1. 동일 그룹 찾기 ( 나 자신 포함)
                var tmpGrpNo = sheetObj.GetCellValue(i, "grp_no");
                if(grpNo == tmpGrpNo){
                    if(isFirstRow){
                        iStartMaxRow = i;
                        isFirstRow= false;
                    }
                    var sheetEstmYrmon = sheetObj.GetCellValue(i, "estm_yrmon");
                    if(GetVvdDurationMonthSheetContains(sheetObj, varEstmYrmon, grpNo, iStRow, iEdRow)){
                        break;
                    }else{
                        var inRow = Row;
                        if(parseInt(varEstmYrmon) < parseInt(sheetEstmYrmon) && parseInt(varEstmYrmon) < parseInt(minEstmYrmon)){
                            inRow = i;
                            //DataInsert : DataCopy 후에 이동시켜준다.
                            sheetObj.DataCopy();
                            //DataMove시 시작은 1부터 시작. Move후에 Move된 Row를 리턴한다.
                            inRow = sheetObj.DataMove(inRow);
                            //estm_yrmon 를 Data Set.
                            sheetObj.SetCellValue(inRow, "estm_yrmon"       , varEstmYrmon  , 0);
                            sheetObj.SetCellValue(inRow, "min_estm_yrmon"   , varEstmYrmon  , 0);
                            sheetObj.SetCellValue(inRow, "stl_vvd_seq"      , ""            , 0);//신규 입력시 널로 해주어야야 신규로 인식 가능함.
                            
                            //Copy 된 Row의 기본 데이타는 초기화.
                            SetSheetInitCols(sheetObj, inRow);
                            
                            //minEstmYrmon 를 바꾸어 준다.
                            minEstmYrmon = varEstmYrmon;
                            break;
                        }else if(parseInt(varEstmYrmon) > parseInt(sheetEstmYrmon) && parseInt(varEstmYrmon) > parseInt(maxEstmYrmon)){
                            inRow = iStartMaxRow + j + 1;
                            //DataInsert : DataCopy후에 마지막 라인으로 이동시켜 준다.
                            sheetObj.DataCopy();
                            //DataMove시 시작은 1부터 시작. Move후에 Move된 Row를 리턴한다.
                            inRow = sheetObj.DataMove(inRow);
                            //estm_yrmon 를 Data Set.
                            sheetObj.SetCellValue(inRow, "estm_yrmon"       , varEstmYrmon  , 0);
                            sheetObj.SetCellValue(inRow, "max_estm_yrmon"   , varEstmYrmon  , 0);
                            sheetObj.SetCellValue(inRow, "stl_vvd_seq"      , ""            , 0);//신규 입력시 널로 해주어야야 신규로 인식 가능함.
                            
                            //Copy 된 Row의 기본 데이타는 초기화.
                            SetSheetInitCols(sheetObj, inRow);
                            
                            //maxEstmYrmon 를 바꾸어 준다.
                            maxEstmYrmon = varEstmYrmon;
                            break;
                        }
                    }
                    iSheetBreakCnt ++;
                }
                //선택된 grpNo 만 Loop를 돌리기 위한 로직. 
                if(arrayEstmYrmon.length == iSheetBreakCnt) break;
            }
        }//insert end
        
        //delete 시에는 전체로 찾아서 지우도록 한다.
        for (var j=0 ; j < arrayEstmYrmon.length; j++){
            var varEstmYrmon = arrayEstmYrmon[j];       
            
            var iSheetDeleteCnt =0;
            for (var i=iStRow; i<=iEdRow; i++){
                //1. 동일 그룹 찾기 ( 나 자신 포함)
                var tmpGrpNo = sheetObj.GetCellValue(i, "grp_no");
                if(grpNo == tmpGrpNo){
                    var sheetEstmYrmon = sheetObj.GetCellValue(i, "estm_yrmon");
                    if(!GetVvdDurationMonthContains(arrayEstmYrmon, sheetEstmYrmon)){
                        sheetObj.SetCellValue(i, "del_chk",  1, 0);
                        iSheetDeleteCnt++;
                    }
                    //iSheetBreakCnt ++;
                }
                //선택된 grpNo 만 Loop를 돌리기 위한 로직. 
                //if(arrayEstmYrmon.length == iSheetBreakCnt) break;
            }
        }//delete end
        
        //선택 Row Delete
        if(iSheetDeleteCnt> 0) JooRowHideDelete(sheetObj, 1);
        
        //계산 로직을 돌린다.
        var nowTmpTotEstmAmt    = 0;
        var nowTmpTotActAmt     = 0;
        var nowTmpTotEstmDys    = 0;
        iSheetBreakCnt          = 0;
        
        //위에서 Delete Row가 존재하므로 새로 구한다.
        var iStRow          = GetSheetRangeRow(sheetObj, Row, "S");
        var iEdRow          = GetSheetRangeRow(sheetObj, Row, "E");
        for (var i=iStRow; i<=iEdRow; i++){
            //1. 동일 그룹 찾기 ( 나 자신 포함)
            var tmpGrpNo        = sheetObj.GetCellValue(i, "grp_no");
            var tmpJoStlItmCd   = sheetObj.GetCellValue(i, "jo_stl_itm_cd");
            if(grpNo == tmpGrpNo){
                //1.Voy Days Total(sail_dys) Data Set.
                sheetObj.SetCellValue(i, "sail_dys", tmpSailDys, 0);
                
                //2.Voy Days Days(estm_dys) Data Set.
                var sheetEstmYrmon  = sheetObj.GetCellValue(i, "estm_yrmon");
                var tmpEstmDys      = GetVoyEstmDays(stDt, endDt, sheetEstmYrmon);
                sheetObj.SetCellValue(i, "estm_dys", tmpEstmDys, 0);
                
                //2.1.Estm Dys 수치 보정 : End Duration 년월 == estmYrmon 가 동일할때는 수치 보정을 해준다.
                nowTmpTotEstmDys = Number(nowTmpTotEstmDys) +  Number(tmpEstmDys);
                if(endDt.substring(0,6) == sheetEstmYrmon){
                    //Estimated Cost 보정.
                    tmpEstmDys = Number(tmpEstmDys) + (Number(tmpSailDys) - Number(nowTmpTotEstmDys));
                    tmpEstmDys = JooComGetRound(tmpEstmDys, gDysRoundPoint);
                    sheetObj.SetCellValue(i, "estm_dys", tmpEstmDys, 0);
                }
                
                var tmpEstmYrmonDys = JooComGetRound( (Number(tmpEstmDys) / Number(tmpSailDys)), gDysRoundPoint);
                
                if(tmpJoStlItmCd == gJoStlItmCdByOPR ){ //OPR
                    var tmpOprBsaQty    = sheetObj.GetCellValue(i, "bsa_qty");
                    var tmpOprBsaSltPrc = sheetObj.GetCellValue(i, "bsa_slt_prc");
                    var tmpOprOrgEstmAmt= Number(tmpOprBsaQty) * Number(tmpOprBsaSltPrc) * Number(tmpEstmDys);
                    tmpOprOrgEstmAmt    = JooComGetRound(tmpOprOrgEstmAmt, gAmountRoundPoint);
               
                    sheetObj.SetCellValue(i, "estm_amt", tmpOprOrgEstmAmt, 0);
                    
                }else{                
                    //3.각월별 Estimated Cost Data Set. orgEstmAmt * Days / Total
                    //var sheetOrgEstmAmt = sheetObj.GetCellValue(i, "org_estm_amt");
                    var tmpEstmAmt  = JooComGetRound( Number(orgEstmAmt) *  Number(tmpEstmYrmonDys) , gAmountRoundPoint);
                    sheetObj.SetCellValue(i, "estm_amt", tmpEstmAmt, 0);
                    
                    nowTmpTotEstmAmt = Number(nowTmpTotEstmAmt) +  Number(tmpEstmAmt);
                    
                    //5.End Duration 년월 == estmYrmon 가 동일할때는 수치 보정을 해준다.
                    if(endDt.substring(0,6) == sheetEstmYrmon){
                        //Estimated Cost 보정.
                        tmpEstmAmt  = Number(tmpEstmAmt) + (Number(orgEstmAmt) - Number(nowTmpTotEstmAmt));
                        sheetObj.SetCellValue(i, "estm_amt", tmpEstmAmt, 0);
                    }
                }
                //7.VVD Duration 다시 셋팅.
                sheetObj.SetCellValue(i, "st_dt"    , stDt  , 0);
                sheetObj.SetCellValue(i, "end_dt"   , endDt , 0);
                
                //8.Min/Max estm yrmon Data Set.
                sheetObj.SetCellValue(i, "min_estm_yrmon", tmpFrDate.substr(0,6), 0);
                sheetObj.SetCellValue(i, "max_estm_yrmon", tmpToDate.substr(0,6), 0);
                
                
                //9.IBFlag 변경한다.
                var tmpStlVvdSeq    = sheetObj.GetCellValue(i, "stl_vvd_seq");
                if(tmpStlVvdSeq == ""){
                    sheetObj.SetCellValue(i, "ibflag", "I", 0);
                }else{
                    sheetObj.SetCellValue(i, "ibflag", "U", 0);
                }
                iSheetBreakCnt++;
            }
            //선택된 grpNo 만 Loop를 돌리기 위한 로직. 
            if(arrayEstmYrmon.length == iSheetBreakCnt) break;
        }
    }
    
    return;
    
}

var gSheetInitCols = "act_inv_amt|act_slip_amt|act_appr_amt|act_amt|stl_rmk|stl_vvd_seq|chk_qty_priority|chk_prc_priority|chk_del_flg|chk_eq_act_flg|chk_del_mrk_flg|chk_edit_flg";
function SetSheetInitCols(sheetObj, Row){
    var tmpCols=gSheetInitCols.split(ROWMARK);
    for (var i=0 ; i < tmpCols.length ; i++) {
        sheetObj.SetCellValue(Row, tmpCols[i], "", 0);
    }
}

function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
    if (sheetObj.RowCount() > 0) {
        var iHeadRow = sheetObj.HeaderRows();
        var iLastRow = sheetObj.LastRow();

        var actCellBackcolor = "#FEFA91";
        var stlRmkCellBackcolor = "#FFEAEA";
        
        for(var i=iHeadRow ; i <= iLastRow ; i++ ){
            var tmpChkDelFlg    = sheetObj.GetCellValue(i, "chk_del_flg");
            var tmpChkEqActFlg  = sheetObj.GetCellValue(i, "chk_eq_act_flg");
            var tmpChkDelMrkFlg = sheetObj.GetCellValue(i, "chk_del_mrk_flg");
            var tmpJoStlItmCd   = sheetObj.GetCellValue(i, "jo_stl_itm_cd");
            var tmpChkEditFlg   = sheetObj.GetCellValue(i, "chk_edit_flg");
            
            if(tmpChkDelFlg == "N"){
                sheetObj.SetCellEditable(i, "del_chk", 0);
            }
            
            if(tmpChkEditFlg == "N"){
                sheetObj.SetCellEditable(i, "st_dt", 0);
                sheetObj.SetCellEditable(i, "end_dt", 0);
            }
            
            if(!GetCheckJoStlOptItem(tmpJoStlItmCd)){
                sheetObj.SetCellEditable(i, "st_dt" , 0);
                sheetObj.SetCellEditable(i, "end_dt", 0);
                
                //초기화 
                sheetObj.SetCellValue(i, "st_dt"        , "", 0);
                sheetObj.SetCellValue(i, "end_dt"       , "", 0);
                sheetObj.SetCellValue(i, "sail_dys"     , "", 0);
                sheetObj.SetCellValue(i, "estm_yrmon"   , "", 0);
                sheetObj.SetCellValue(i, "estm_dys"     , "", 0);
            }
            
            if(tmpChkEqActFlg == "N"){
                sheetObj.SetCellBackColor(i, "act_inv_amt"    , actCellBackcolor);
                sheetObj.SetCellBackColor(i, "act_slip_amt"   , actCellBackcolor);
                sheetObj.SetCellBackColor(i, "act_appr_amt"   , actCellBackcolor);
            }
            if(tmpChkDelMrkFlg == "Y"){
                sheetObj.SetCellBackColor(i, "stl_rmk"    , stlRmkCellBackcolor);
            }
            
        }
    }
}
function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
}
function sheet1_OnSelectCell(sheetObj, OldRow, OldCol, NewRow, NewCol) {
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
    switch (sAction) {
        case IBSAVE: //save
            if(sheetObj.RowCount() < 1 ){
                ComShowCodeMessage("JOO00036");
                return false;
            }
            if (!ComShowCodeConfirm("JOO00046")){
                return false;
            }
            break;
    }
    return true;
}
/**
 * 
 * @param comboObj
 * @param value
 * @param text
 */
function jo_crr_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
    var formObj = document.form;
    trd_cd.RemoveAll();
    rlane_cd.RemoveAll();

    if (comboObj.GetSelectCode() == "") {
        return;
    }
    if (trd_cd.GetItemCount() == 0) {
        trd_cd.SetEnable(0);
        doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC02);
        trd_cd.SetEnable(1);
    }
}
/**
 * 
 * @param comboObj
 * @param value
 * @param text
 */
function trd_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
    var formObj = document.form;
    rlane_cd.RemoveAll();
    
    if (jo_crr_cd.GetSelectCode() == "") {
        return;
    }
    if (rlane_cd.GetItemCount() == 0) {
        rlane_cd.SetEnable(0);
        doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC03);
        rlane_cd.SetEnable(1);
    }
}
function auth_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){
    //변경된 Office cd에 해당하는 Carrier, Trade, lane ComboItem을 재조회 한다.
    var formObj = document.form;
    sheetObjects[0].RemoveAll();
    jo_crr_cd.RemoveAll();
    trd_cd.RemoveAll();
    rlane_cd.RemoveAll();
    
    doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC08);
    
}
function jo_stl_itm_cds_OnCheckClick(comboObj, index, code) {
    if(index==0) {          
        var bChk=comboObj.GetItemCheck(index);
        if(bChk){
            for(var i=1 ; i < comboObj.GetItemCount() ; i++) {
                comboObj.SetItemCheck(i,0);
            }
        }
    } else {
        //ALL 이 아닌 다른 Item 체크.
        var bChk=comboObj.GetItemCheck(index);
        if (bChk) {
            comboObj.SetItemCheck(0,0);
        }
    }
    //Combo Item이 전부 Uncheck 일때 자동으로 All 선택이 되도록 한다.
    var checkCnt=0;
    var count = parseInt(comboObj.GetItemCount());
    for(var i = 1 ; i <  count; i++) {
        if(comboObj.GetItemCheck(i)) {
            checkCnt++;
        }
    }
    if(checkCnt == 0) {
        comboObj.SetItemCheck(0,true, null, null, false);
    }
}

function GetBackEndJobStatus() {
    //alert("UF_GetBackEndJobStatus");
    doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC10);
}

function SetCondition(flg){
    var formObj=document.form;
    var varFlag = flg+"";
    switch (varFlag){
        case "1":
            //jo_crr_cd.SetSelectIndex(-1,false);
            //trd_cd.SetSelectIndex(-1,false);
            //rlane_cd.SetSelectIndex(-1,false);
            break;
    }
    sheetObjects[0].RemoveAll();       
}
function GetCheckConditionPeriod(){
    var formObj=document.form;
    var frDt=formObj.fr_rev_yrmon.value.replaceStr("-","")+"01";
    var toDt=formObj.to_rev_yrmon.value.replaceStr("-","")+"01";
    if (ComGetDaysBetween(frDt, toDt) <= 0){
        return false;
    }   
    return true;
}

/*
 * Sheet의 Row가 많으므로 특정 Gap으로 범위를 줄이기 위한 Row값 리턴.
 */
function GetSheetRangeRow(sheetObj, selRow, flg){
    var iHeadRow = sheetObj.HeaderRows();
    var iLastRow = sheetObj.LastRow();
    var iGapRow = 20;
    var iReturnRow = iHeadRow;
    switch(flg){
        case "S":
            var iStartRow = selRow - iGapRow;
            
            if(iHeadRow >= iStartRow){
                iReturnRow = iHeadRow;
            }else{
                iReturnRow = iStartRow;
            }
            break;
        case "E":
            var iEndRow = selRow + iGapRow;
            
            if(iLastRow <= iEndRow){
                iReturnRow = iLastRow;
            }else{
                iReturnRow = iEndRow;
            }            
            break;
    }
    
    return iReturnRow;
}

function GetCheckPeriod(sFrDate, sToDate){
    sFrDate = getArgValue(ComGetUnMaskedValue(sFrDate   , "ymdhm"));
    sToDate = getArgValue(ComGetUnMaskedValue(sToDate   , "ymdhm"));
    /*//1.년월일시분 인지 체크
    if(!ComIsDateTime(sFrDate   , "ymd", "hm")){
        ComShowMessage(ComGetMsg('JOO00201')); //Please input Duration From exactly.
        return false;
    }
    if(!ComIsDateTime(sToDate   , "ymd", "hm")){
        ComShowMessage(ComGetMsg('JOO00202')); //Please input Duration To exactly.
        return false;
    }*/
    
    //2.from, to 날짜 비교
    var sFrYmd = sFrDate.substring(0,8);
    var sToYmd = sToDate.substring(0,8);
    if(ComChkPeriod(sFrYmd, sToYmd) < 1) {
        ComShowMessage(ComGetMsg('JOO00200')); //Please input Duration(From ~ To) exactly.
        return false;
    }
    
    return true;
}
/*
 *  Setting data with integerPlace and decimalPlace
 */
function SetCipherLess(val, integerPlace, decimalPlace){
    val = val+"";
    var arrVal=val.split(".");
    if(arrVal.length == 1){
        if(arrVal[0].length > integerPlace){
            ComShowCodeMessage("JOO00199", "[The Part Of The Integer]", "[Less Than or Equal To " + integerPlace + "-Digit]");
            return false;
        }
    } else if(arrVal.length == 2){
        if(arrVal[0].length > integerPlace){
            ComShowCodeMessage("JOO00199", "[The Part Of The Integer]", "[Less Than or Equal To " + integerPlace + "-Digit]");
            return false;
        }
        if(arrVal[1].length > decimalPlace){
            ComShowCodeMessage("JOO00199", "[The Part Of The Decimal]", "[Less Than or Equal To " + decimalPlace + "-Digit]");
            return false;
        }
    }   
    return true;
}
function SetActualDetail(){
    setRefresh();
}
function SetInvoiceAutoCreate(){
    setRefresh();
}

//팝업에서 재호출 하기 위한 함수.
function setRefresh(){
    doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}
function resizeSheet() {
    ComResizeSheet(sheetObjects[0]);
}