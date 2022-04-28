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

                //최초 한번만 값을 가지고 잇고 그외에는 초기화 시킨다.
                ComSetObjValue(formObj.jo_crr_cd    , "");
                ComSetObjValue(formObj.jo_stl_itm_cd, "");
                ComSetObjValue(formObj.rev_vvd      , "");
                ComSetObjValue(formObj.rev_yrmon    , "");
                ComSetObjValue(formObj.stl_vvd_seq  , "");
                
                sheetObjects[0].RemoveAll();
                comboObjects[0].SetSelectIndex(-1, false);
                comboObjects[1].SetSelectIndex(-1, false);
                comboObjects[2].SetSelectIndex(0);
                
                //doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
                break; 
            case "btn_vvd_from_back":
                UF_addMonth(formObj.fr_acct_yrmon, -1);
                initInvoiceNoComboItem();
                break;
            case "btn_vvd_from_next":
                if (!GetCheckConditionPeriod()){
                    ComShowCodeMessage("JOO00078");
                    return;
                }
                UF_addMonth(formObj.fr_acct_yrmon, +1);
                initInvoiceNoComboItem();
                break;
            case "btn_vvd_to_back":
                if (!GetCheckConditionPeriod()){
                    ComShowCodeMessage("JOO00078");
                    return;
                }
                UF_addMonth(formObj.to_acct_yrmon, -1);
                initInvoiceNoComboItem();
                break;
            case "btn_vvd_to_next":
                UF_addMonth(formObj.to_acct_yrmon, +1);
                initInvoiceNoComboItem();
                break;
            case "btn_DownExcel":
                //var paramObj = new Object();
                //paramObj.cols = 10;
                //var url = ComJooGetPgmTitle(sheetObjects[0], paramObj);
                sheetObjects[0].Down2Excel({DownCols : makeHiddenSkipCol(sheetObjects[0]), SheetDesign : 1,Merge : 1});
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
        case "acctg_crr_cd":
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
        case "inv_no":
            with (comboObj) {
                SetMultiSelect(0);
                SetUseAutoComplete(1);
                SetColAlign(0, "left");
                // SetColWidth(0, "60");
                ValidChar(2, 1); // Uppercase
                SetDropHeight(160);
                SetMaxLength(7);
            }
            //var comboItems = gJoCrrCdComboItems.split("|");
            //addComboItem(comboObj, comboItems);
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
}
function initControl() {
    var formObj=document.form;   

    /*
    TO : 현재 월
    FR : 현재 월 - 2 : 3개월전.
    */ 
    initPeriod();  
    
    initParameter();
    
    initInvoiceNoComboItem();
    
    axon_event.addListenerForm('change', 'obj_change', form);
    
    doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
}

function obj_change() {
    var formObj=document.form;
    try {
        var srcName=ComGetEvent("name");
        switch (srcName) {
            case "fr_acct_yrmon":
            case "to_acct_yrmon":    
                initInvoiceNoComboItem();
                break;
        }
    } catch (e) {
        if (e == "[object Error]") {
            ComShowCodeMessage('VSK00011');
        } else {
            ComShowMessage(e);
        }
    }
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

function initParameter(){
    var formObj = document.form;
    
    //Target Rev.Month
    if(!ComIsEmpty(gParamFrAcctYrmon)){
        ComSetObjValue(formObj.fr_acct_yrmon , gParamFrAcctYrmon);
        ComSetObjValue(formObj.to_acct_yrmon , gParamToAcctYrmon);
    }
    
    if(!ComIsEmpty(gParamJoCrrCd)){
        //acctg_crr_cd.SetSelectCode(gParamJoCrrCd);
    }

    if(!ComIsEmpty(gParamJoStlItmCds)){
        jo_stl_itm_cds.SetSelectCode(gParamJoStlItmCds);
    }
}

function initInvoiceNoComboItem(){
    if (!GetCheckConditionPeriod()){
        ComShowCodeMessage("JOO00078");
        return;
    }
    sheetObjects[0].RemoveAll();
    
    doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC01); //Invoice No Combo Item
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
                var HeadTitle1="|Invoice No|Slip No|Approved|Rev/Exp|Item|Curr.|Partner|Actual\nPayer/Receiver|Rev. VVD|Rev.\nLane|Amount|Amount|Remark|Update User|Update Date";
                var HeadTitle2="|Invoice No|Slip No|Approved|Rev/Exp|Item|Curr.|Partner|Actual\nPayer/Receiver|Rev. VVD|Rev.\nLane|Invoice|Slip|Remark|Update User|Update Date";
                var headCount=ComCountHeadTitle(HeadTitle1);
                var prefix = "sheet1_";
                SetConfig( { SearchMode:2, MergeSheet:8, Page:200, DataRowMerge:0} );
                var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"}, { Text:HeadTitle2, Align:"Center"} ];
                InitHeaders(headers, info);
    
                var cols = [ 
                       {Type:"Status",  Hidden:1, Width:0,    Align:"Center",   ColMerge:1,   SaveName: prefix + "ibflag" },
                       {Type:"Text",    Hidden:0, Width:100,  Align:"Center",   ColMerge:1,   SaveName: prefix + "inv_no",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Text",    Hidden:0, Width:120,  Align:"Center",   ColMerge:1,   SaveName: prefix + "csr_no",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Text",    Hidden:0, Width:60,   Align:"Center",   ColMerge:1,   SaveName: prefix + "apro_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Combo",   Hidden:0, Width:60,   Align:"Center",   ColMerge:0,   SaveName: prefix + "re_divr_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Text",    Hidden:0, Width:50,   Align:"Center",   ColMerge:0,   SaveName: prefix + "jo_stl_itm_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Text",    Hidden:0, Width:50,   Align:"Center",   ColMerge:0,   SaveName: prefix + "locl_curr_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",    Hidden:0, Width:50,   Align:"Center",   ColMerge:0,   SaveName: prefix + "jo_crr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Text",    Hidden:0, Width:80,   Align:"Center",   ColMerge:0,   SaveName: prefix + "acctg_crr_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Text",    Hidden:0, Width:90,   Align:"Center",   ColMerge:0,   SaveName: prefix + "rev_vvd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",    Hidden:0, Width:60,   Align:"Center",   ColMerge:0,   SaveName: prefix + "rlane_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",    Hidden:0, Width:100,  Align:"Right",    ColMerge:0,   SaveName: prefix + "inv_act_amt",     KeyField:0,   CalcLogic:"",   Format:"NullFloat",            PointCount:2,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Float",    Hidden:0, Width:100,  Align:"Right",    ColMerge:0,   SaveName: prefix + "slp_act_amt",     KeyField:0,   CalcLogic:"",   Format:"NullFloat",            PointCount:2,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Text",    Hidden:0, Width:150,  Align:"Left",     ColMerge:0,   SaveName: prefix + "stl_rmk",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",    Hidden:0, Width:80,   Align:"Center",   ColMerge:0,   SaveName: prefix + "upd_usr_id",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",    Hidden:0, Width:120,  Align:"Center",   ColMerge:0,   SaveName: prefix + "upd_dt",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }
                       ];
                 
                InitColumns(cols);
                SetColProperty(0    , prefix +"re_divr_cd"      , {ComboText:"Rev|Exp", ComboCode:"R|E", DefaultValue:"R"} );
                
                
                //var cols2="sheet1_inv_act_amt|sheet1_slp_act_amt";
                
                //ShowSubSum([{StdCol:"sheet1_inv_no", SumCols:cols2, Sort:false, ShowCumulate:false, CaptionCol:"sheet1_inv_no", CaptionText:"Total"}
                //           ,{StdCol:"sheet1_re_divr_cd", SumCols:cols2, Sort:false, ShowCumulate:false, CaptionCol:"sheet1_inv_no", CaptionText:"Subtotal"}]);
                
                SetEditable(1);
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
            //ComOpenWait(true);
            var aryPrefix = new Array("sheet1_"); // prefix
            var param = FormQueryString(formObj);
                param += "&" + ComGetPrefixParam(aryPrefix);
                
            
                
            //var sXml = sheetObj.GetSearchData("FNS_JOO_0105GS.do", param);
            //sheetObj.LoadSearchData(sXml);
            sheetObj.DoSearch("FNS_JOO_0105GS.do", param );

            //ComOpenWait(false);
            break;
            
        case IBSEARCH_ASYNC01: // Invoice No Combo.
            ComOpenWait(true);
            formObj.f_cmd.value = SEARCH01;
            var param = FormQueryString(formObj);
            var sXml = sheetObj.GetSearchData("FNS_JOO_0105GS.do", param);
            ComOpenWait(false);
            var resultKey           = ComGetEtcData(sXml, "TRANS_RESULT_KEY");
            var invNosComboItems    = ComGetEtcData(sXml, "inv_nos");
            if(resultKey == "S"){
                comboObjects[1].RemoveAll();
                var comboItems = invNosComboItems.split(ROWMARK); // "|"
                addComboItem(inv_no, comboItems);
            }
            break;
        case IBSAVE: // save
            if (!validateForm(sheetObj, formObj, sAction)) {
                return;
            }
            sheetObj.SetWaitImageVisible(0);
            ComOpenWait(true);
            formObj.f_cmd.value = MULTI;
            var sParam = ComGetSaveString(sheetObj, true, true);
            sParam += "&" + FormQueryString(formObj);
            var sXml = sheetObj.GetSaveData("FNS_JOO_0104GS.do", sParam);
            sheetObj.LoadSaveData(sXml);
            doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
            ComOpenWait(false);
            break;
    }
}
function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
    if (sheetObj.RowCount() > 0) {
        //sheetObj.SetSumText(0, "sheet1_inv_no", "TOTAL");
        
        //Row 강제머지할 셀의 Row Index
        //Col 강제머지할 셀의 Column Index 
        //Rows 강제머지할 셀의 Row 개수
        //Cols 강제머지할 셀의 Col 개수
        //ObjId.SetMergeCell(Row, Col, Rows, Cols)

        var str = "";
        var iStRow = sheetObj.HeaderRows();
        var iEdRow = sheetObj.LastRow();
        for(var i=iStRow;i<=iEdRow;i++){
            str = sheetObj.GetCellText(i,"sheet1_inv_no");   // ITM 항목 읽기
            
            if(str.indexOf("Total")>-1){
                sheetObj.SetMergeCell(i,1,1,10); // OWN 5칸 머지
                sheetObj.SetRowBackColor(i,"#FCDCEE");
                sheetObj.SetCellFontBold(i,1, 1);
                sheetObj.SetCellFontBold(i, "sheet1_inv_act_amt", 1);
                sheetObj.SetCellFontBold(i, "sheet1_slp_act_amt", 1);
                //sheetObj.SetRowHidden(i,1); // OWN 5칸 머지 
            }else if(str.indexOf("Subtotal")>-1){
                sheetObj.SetMergeCell(i,1,1,10); // OWN 5칸 머지   
                sheetObj.SetRowBackColor(i,"#FEFA91");   
                sheetObj.SetCellFontBold(i,1, 1);     
                sheetObj.SetCellFontBold(i, "sheet1_inv_act_amt", 1);    
                sheetObj.SetCellFontBold(i, "sheet1_slp_act_amt", 1);         
                //sheetObj.SetCellText(i, "sheet1_inv_no", "Total", 0);
            }
        }
        
        /*for(var i=iEdRow;i>iStRow;i--){
            str = sheetObj.GetCellText(i,"sheet1_inv_no");   // ITM 항목 읽기
            
            if(str.indexOf("Total")>-1){
                sheetObj.SetRowHidden(i,1); // OWN 5칸 머지 
            }else if(str.indexOf("Subtotal")>-1){
                sheetObj.SetMergeCell(i,1,1,10); // OWN 5칸 머지                
                //sheetObj.SetCellText(i, "sheet1_inv_no", "Total", 0);
            }
        }*/
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
    return true;
}
/**
 * 
 * @param comboObj
 * @param value
 * @param text
 */
function acctg_crr_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
    var formObj = document.form;

    initInvoiceNoComboItem();
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