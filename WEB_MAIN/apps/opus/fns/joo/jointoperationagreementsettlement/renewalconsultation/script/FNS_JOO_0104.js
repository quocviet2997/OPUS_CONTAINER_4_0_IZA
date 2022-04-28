/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : FNS_JOO_0104.js
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
                ComSetObjValue(formObj.rev_vvd, "");
                sheetObjects[0].RemoveAll();
                comboObjects[0].SetSelectIndex(-1, false);
                comboObjects[1].SetSelectIndex(-1, false);
                comboObjects[2].SetSelectIndex(-1, false);
                comboObjects[2].RemoveAll();
                comboObjects[3].SetSelectIndex(0);
                comboObjects[4].SetSelectIndex(0);
                
                doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
                break;
            case "btn_Save":
                doActionIBSheet(sheetObjects[0], formObj, IBSAVE);
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
                SetDropHeight(160);
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
    doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}
function initControl() {
    var formObject=document.form;   

    /*
    TO : 현재 월
    FR : 현재 월 - 2 : 3개월전.
    */ 
    initPeriod();
    
    initParameter();
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

function initParameter(){
    var formObj = document.form;
    
    //Target Rev.Month
    if(!ComIsEmpty(gParamFrRevYrmon)){
        ComSetObjValue(formObj.fr_rev_yrmon , gParamFrRevYrmon);
        ComSetObjValue(formObj.to_rev_yrmon , gParamToRevYrmon);
    }
    ComSetObjValue(formObj.re_divr_cd   , gParamReDivrCd);
    if(!ComIsEmpty(gParamJoCrrCd)){
        jo_crr_cd.SetSelectCode(gParamJoCrrCd);
    }
    /*
    ComSetObjValue(formObj.rev_vvd      , gParamRevVvd);
    
    
    if(!ComIsEmpty(gParamTrdCd)){
        trd_cd.SetSelectCode(gParamTrdCd);
    }
    if(!ComIsEmpty(gParamRlaneCd)){
        rlane_cd.SetSelectCode(gParamRlaneCd);
    }
    
    if(!ComIsEmpty(gParamJoStlItmCds)){
        jo_stl_itm_cds.SetSelectCode(gParamJoStlItmCds);
    }*/
    
    if(!ComIsEmpty(gParamAuthOfcCd)){
        auth_ofc_cd.SetSelectCode(gParamAuthOfcCd);
    }
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
                var HeadTitle1="|Partner|Curr.|Invoiced|Invoiced|Settlement|Settlement|Actual Payer/Receiver|Actual Payer/Receiver|Actual Payer/Receiver|Invoice Month";
                var HeadTitle2="|Partner|Curr.|Revenue|Expense|Revenue|Expense|Carrier|Customer|Service Provider|Invoice Month";
                
                var prefix = "sheet1_";
                var headCount=ComCountHeadTitle(HeadTitle1);
                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
                var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"}, { Text:HeadTitle2, Align:"Center"} ];
                InitHeaders(headers, info);
    
                var cols = [ 
                       {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName: prefix + "ibflag" },
                       {Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName: prefix + "jo_crr_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName: prefix + "locl_curr_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Float",     Hidden:0, Width:90,   Align:"right",   ColMerge:1,   SaveName: prefix + "inv_rev_act_amt",  KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Float",     Hidden:0, Width:90,   Align:"right",   ColMerge:1,   SaveName: prefix + "inv_exp_act_amt",  KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Float",     Hidden:0, Width:90,   Align:"right",   ColMerge:1,   SaveName: prefix + "stl_rev_act_amt",  KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",     Hidden:0, Width:90,   Align:"right",   ColMerge:1,   SaveName: prefix + "stl_exp_act_amt",  KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Combo",     Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName: prefix + "acctg_crr_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                       {Type:"Text",      Hidden:0, Width:200,  Align:"Left",    ColMerge:1,   SaveName: prefix + "cust_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },   
                       {Type:"Text",      Hidden:0, Width:170,  Align:"Left",    ColMerge:1,   SaveName: prefix + "vndr_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },   
                       {Type:"Text",      Hidden:1, Width:170,  Align:"Left",    ColMerge:1,   SaveName: prefix + "acct_yrmon",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }
                       ];
                 
                InitColumns(cols);
                SetColProperty(0    ,  prefix + "acctg_crr_cd"   , {ComboText:"|"+gAcctgCrrNmComboItems, ComboCode:"|"+gAcctgCrrCdComboItems} );
                SetColProperty(0    ,  prefix + "acctg_crr_cd"   , {AcceptKeys:"E"   , InputCaseSensitive:1});
                //SetColProperty(0    , "jo_stl_jb_cd"    , {ComboText:"|"+joStlJbNmComboItems, ComboCode:"|"+joStlJbCdComboItems} );
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
            formObj.f_cmd.value = SEARCH;
            if (!validateForm(sheetObj, formObj, sAction)) {
                return;
            }
            ComOpenWait(true);
            var aryPrefix = new Array("sheet1_"); // prefix
            var param = FormQueryString(formObj);
                param += "&" + ComGetPrefixParam(aryPrefix);
                
            var sXml = sheetObj.GetSearchData("FNS_JOO_0104GS.do", param);
            sheetObj.LoadSearchData(sXml);
            ComOpenWait(false);
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

            var aryPrefix   = new Array("sheet1_"); // prefix
            var param = ComGetSaveString(sheetObj, true, true);
                param += "&" + FormQueryString(formObj);
                param += "&" + ComGetPrefixParam(aryPrefix);

            var sXml = sheetObj.GetSaveData("FNS_JOO_0104GS.do", param);
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
function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) {
    if (sheetObj.RowCount() > 0) {
        var iHeadRow = sheetObj.HeaderRows();
        var iLastRow = sheetObj.LastRow();
        
        for(var i=iHeadRow ; i <= iLastRow ; i++ ){
            SetSheetComboText(sheetObj, i, "sheet1_acctg_crr_cd");
        }
    }
}
function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
}
function sheet1_OnSelectCell(sheetObj, OldRow, OldCol, NewRow, NewCol) {
}
function sheet1_OnChange(sheetObj, Row, Col, Value, OldValue, RaiseFlag) {    
    var formObj = document.form;
    var colName = sheetObj.ColSaveName(Col);
    switch(colName){
        case "sheet1_acctg_crr_cd":
            SetSheetComboText(sheetObj, Row, colName);
            break;
    }
}
function sheet1_OnMouseMove(sheetObj, Button, Shift, X, Y){
    var Row=sheetObj.MouseRow();
    var Col=sheetObj.MouseCol();
    var prefix="sheet1_";
    var sText = "";
    var selColName = sheetObj.CellSaveName (Row, Col);
    sText = sheetObj.GetCellText(Row,selColName)
    if(sText != ""){
        sheetObj.SetToolTipText(Row,Col,sText);
    }
}
function SetSheetComboText(sheetObj, Row, colName){
    var idx             = sheetObj.GetComboInfo(Row, colName, "SelectedIndex");
    var strComboCodeInfo= sheetObj.GetComboInfo(Row, colName,"Code");
    var strComboTextInfo= sheetObj.GetComboInfo(Row, colName,"Text");
    
    var strComboCodeRowArr = strComboCodeInfo.split("|");
    var strComboTextRowArr = strComboTextInfo.split("|");
    
    for(var k=0;k<strComboTextRowArr.length;k++) {
        if(idx == k){
            var strComboTextColArr = strComboTextRowArr[k].split("\t");

            sheetObj.SetCellValue(Row, "sheet1_cust_nm", strComboTextColArr[1].replace(/\s/gi, '')  , 0);
            sheetObj.SetCellValue(Row, "sheet1_vndr_nm", strComboTextColArr[2].replace(/\s/gi, '')  , 0);
        }
    }
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
    with (formObj) {
        switch (sAction) {
            case IBSAVE:
                
                if (sheetObj.RowCount() > 0) {
                    var iHeadRow = sheetObj.HeaderRows();
                    var iLastRow = sheetObj.LastRow();
                    
                    for(var i=iHeadRow ; i <= iLastRow ; i++ ){
                        var tmpAcctgCrrCd   = sheetObj.GetCellValue(i, "sheet1_acctg_crr_cd");
                        
                        if(ComIsEmpty(tmpAcctgCrrCd)){
                            ComShowCodeMessage("JOO00115", "[Actual Payer/Receiver]");
                            sheetObj.SelectCell(i, "acctg_crr_cd");
                            return false;
                        }
                    }
                }
                
                if (!ComShowCodeConfirm("JOO00046")) {
                    return false;
                }
                break;
        } // end switch
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
//팝업에서 재호출 하기 위한 함수.
function setRefresh(){
    var formObj = document.form;
    doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}
function resizeSheet() {
    ComResizeSheet(sheetObjects[0]);
}