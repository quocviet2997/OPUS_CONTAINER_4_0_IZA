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
var openerObj=window.dialogArguments;
if(!openerObj) openerObj= window.opener;
if(!openerObj) openerObj= parent;

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
                doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
                break;
            case "btn_New":
                initPeriod();
                comboObjects[0].SetSelectIndex(0);
                comboObjects[1].SetSelectIndex(0);
                
                doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
                break;
            case "btn_Save":
                doActionIBSheet(sheetObjects[0], formObj, IBSAVE);
                break;         

            case "btn_vvd_from_back":
                UF_addMonth(formObj.fr_acct_yrmon, -1);
                sheetObjects[0].RemoveAll();
                break;
            case "btn_vvd_from_next":
                if (!GetCheckConditionPeriod()){
                    ComShowCodeMessage("JOO00078");
                    return;
                }
                UF_addMonth(formObj.fr_acct_yrmon, +1);
                sheetObjects[0].RemoveAll();
                break;
            case "btn_vvd_to_back":
                if (!GetCheckConditionPeriod()){
                    ComShowCodeMessage("JOO00078");
                    return;
                }
                UF_addMonth(formObj.to_acct_yrmon, -1);
                sheetObjects[0].RemoveAll();
                break;
            case "btn_vvd_to_next":
                UF_addMonth(formObj.to_acct_yrmon, +1);
                sheetObjects[0].RemoveAll();
                break; 
            case "btn_Close":
                ComClosePopup(); 
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
        case "jo_crr_cds":
            with (comboObj) {
                SetMultiSelect(true);
                SetMultiSeparator(",");  // add 
                SetUseAutoComplete(1);
                SetColAlign(0, "left");
                SetColWidth(0, "130");
                ValidChar(2, 1); // Uppercase
                SetDropHeight(160);
                SetMaxLength(3);
            }
            if (ComTrim(gJoCrrCdComboItems) != ""){
                var comboItems=gJoCrrCdComboItems.split(ROWMARK);
                var comboItem="";
                jo_crr_cds.InsertItem(-1, "ALL|", "ALL");    //ALL
                for (var i=0 ; i < comboItems.length ; i++) {
                    comboItem=comboItems[i].split(FIELDMARK);
                    jo_crr_cds.InsertItem(-1, comboItem[0], comboItem[0]);
                }
                jo_crr_cds.SetSelectIndex(0);
            }else{
                jo_crr_cds.RemoveAll();
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
    resizeSheet();
    doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
    
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
    formObj.to_acct_yrmon.value=JooGetDateFormat(tmpToYm,"ym");
    
    //년월 만 하면 -3년이 넘게 설정 되어 동일 월로 설정하기 위해서 2015-07-02 로 Day 를 마춘다.
    var tmpFrYm = ComGetDateAdd(formObj.to_acct_yrmon.value+"-01","M", -2);
    formObj.fr_acct_yrmon.value=JooGetDateFormat(tmpFrYm,"ym"); 
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
                var HeadTitle1="|CHK|Invoice No|Partner|Customer/S.Provider|Customer/S.Provider|Curr.|Rev\nExp|Amount";
                    HeadTitle1+="|||||||||";//15개
                var HeadTitle2="|CHK|Invoice No|Partner|Code|Name|Curr.|Rev\nExp|Amount";
                    HeadTitle2+="|||||||||";//15개
                var headCount=ComCountHeadTitle(HeadTitle1);
                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
                var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"} ,  { Text:HeadTitle2, Align:"Center"}];
                InitHeaders(headers, info);
                var prefix = "sheet1_";
                
                var cols = [ 
                       {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName: prefix + "ibflag" },
                       {Type:"CheckBox",  Hidden:0, Width:55,   Align:"Center",  ColMerge:0,   SaveName: prefix + "chk_del_flg" },
                       {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName: prefix + "inv_no",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName: prefix + "jo_crr_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName: prefix + "prnr_ref_no",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:250,  Align:"Left",    ColMerge:0,   SaveName: prefix + "cust_vndr_eng_nm",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName: prefix + "locl_curr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Combo",     Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName: prefix + "re_divr_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",     Hidden:0, Width:90,   Align:"Right",   ColMerge:0,   SaveName: prefix + "act_amt",            KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Right",   ColMerge:0,   SaveName: prefix + "cust_vndr_cnt_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Right",   ColMerge:0,   SaveName: prefix + "cust_vndr_seq",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "acct_yrmon",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },   
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "slp_tp_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "slp_func_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "slp_ofc_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "slp_iss_dt",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "slp_ser_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "csr_tp_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }
                        ];
                 
                InitColumns(cols);
                SetColProperty(0    , prefix +"re_divr_cd"      , {ComboText:"Rev|Exp", ComboCode:"R|E", DefaultValue:"R"} );
                SetEditable(1);
                SetShowButtonImage(1);
             }
            break;
    }
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction, cRow) {
    sheetObj.ShowDebugMsg(false);
    switch (sAction) {
        case IBSEARCH: // retrieve
            formObj.f_cmd.value = SEARCH;
            if (!validateForm(sheetObj, formObj, sAction)) {
                return;
            }
            ComOpenWait(true);
            var aryPrefix = new Array("sheet1_"); // prefix
            var param = FormQueryString(formObj);
                param += "&" + ComGetPrefixParam(aryPrefix);
                
            var sXml = sheetObj.GetSearchData("FNS_JOO_0106GS.do", param);
            sheetObj.LoadSearchData(sXml);
            ComOpenWait(false);
            break;  
                
        case IBSAVE: // save
            if (!validateForm(sheetObj, formObj, sAction)) {
                return;
            }
            if (!ComShowCodeConfirm("JOO00046")){
                return false;
            }
            sheetObj.SetWaitImageVisible(0);
            ComOpenWait(true);
            formObj.f_cmd.value = MULTI;
            var aryPrefix=new Array( "sheet1_");
            var sParam = ComGetSaveString(sheetObjects, true, true);
                sParam += "&" + FormQueryString(formObj);
                sParam += "&" + ComGetPrefixParam(aryPrefix);
            var sXml = sheetObj.GetSaveData("FNS_JOO_0106GS.do", sParam);
            
            var tmpTransResultKey = ComGetEtcData(sXml, "TRANS_RESULT_KEY");
            
            if(tmpTransResultKey == "S"){
                sheetObj.LoadSaveData(sXml);
                ComOpenWait(false);
                
                openerObj.setRefresh();
                
                doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);  
            }else{
                ComOpenWait(false);
            }
            break;
            
        case IBSEARCH_ASYNC08: // Carrier/Trade/RLane Combo Code By Auth Office Code
            var authOfcCd = auth_ofc_cd.GetSelectCode();
            var param = "";
                param += "f_cmd="   + SEARCH23;
                param += "&auth_ofc_cd=" + authOfcCd;
            
            var sXml = sheetObj.GetSearchData("JOOCommonGS.do", param);
            
            var comboItems=joCrrCds.split(ROWMARK);
            var comboItem="";
            jo_crr_cds.InsertItem(-1, "ALL|", "ALL");    //ALL
            for (var i=0 ; i < comboItems.length ; i++) {
                jo_crr_cds.InsertItem(-1, comboItems[i], comboItems[i]);
            }
            jo_crr_cds.SetSelectIndex(0);            
            
            break;
    }
}
function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
    if (sheetObj.RowCount() > 0) {

    }
}
function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
}
function sheet1_OnSelectCell(sheetObj, OldRow, OldCol, NewRow, NewCol) {
}
function sheet1_OnChange(sheetObj, Row, Col, Value, OldValue, RaiseFlag) {
}

/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
    sheetObj.ShowDebugMsg(false);
    switch (sAction) {
        case IBSAVE: //save
            if (sheetObj.RowCount() > 0) {
                var iHeadRow = sheetObj.HeaderRows();
                var iLastRow = sheetObj.LastRow();
            
                var chkCsrFlgCnt = sheetObj.CheckedRows("sheet1_chk_del_flg");
                if(chkCsrFlgCnt <= 0){
                    ComShowCodeMessage("JOO00117", "[CHK]");//Please check {?msg1}
                    return false;
                } 
            }else{
                ComShowCodeMessage('JOO00036');
                return false;
            }
            
            break;
    }
    return true;
}

function jo_crr_cds_OnCheckClick(comboObj, index, code) {
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
/**
 * 
 * @param comboObj
 * @param value
 * @param text
 */
function jo_crr_cds_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
}
function auth_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){
    //변경된 Office cd에 해당하는 Carrier, Trade, lane ComboItem을 재조회 한다.
    var formObj = document.form;
    sheetObjects[0].RemoveAll();
    jo_crr_cds.RemoveAll();
    
    doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC08);
    
}

function GetCheckConditionPeriod(){
    var formObj=document.form;
    var frDt=formObj.fr_acct_yrmon.value.replaceStr("-","")+"01";
    var toDt=formObj.to_acct_yrmon.value.replaceStr("-","")+"01";
    if (ComGetDaysBetween(frDt, toDt) <= 0){
        return false;
    }   
    return true;
}
function resizeSheet() {
    ComResizeSheet(sheetObjects[0]);
}