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
            case "btn_delete":
                var checkedRows=(sheetObjects[0].FindCheckedRow("del_chk")).split("|");
                if (checkedRows == ""){
                    ComShowCodeMessage('JOO00143');
                    return;
                }
                
                for(var i=checkedRows.length-1; i >= 0; i--){
                    stat=sheetObjects[0].GetRowStatus(checkedRows[i]);
                    if ((stat == "I" || stat == "U") && (sheetObjects[0].GetRowHidden(checkedRows[i]) == false)){
                        var tmpExistChildFlg = sheetObjects[0].GetCellValue(checkedRows[i], "exist_child_flg");
                        if(ComIsEmpty(tmpExistChildFlg) || tmpExistChildFlg == "X"){
                            JooRowHideDelete(sheetObjects[0], "del_chk");
                            //sheetObjects[0].RowDelete(checkedRows[i], false);
                        }
                    }
                }   

                //sheetObjects[0].RowDelete(sheetObjects[0].GetSelectRow(), false);
                break;
            case "btn_copy":
                var Row = sheetObjects[0].DataCopy();
                
                //copy 된 Row의 Trade Code의 Rev Lane를 조회 해서 Combo 속성으로 변경한다.
                var joCrrCd = sheetObjects[0].GetCellValue(Row, "jo_crr_cd");
                if(ComIsEmpty(joCrrCd) || joCrrCd.length < 3){
                    ComShowCodeMessage('JOO00116', "Carrier"); // Select a Carrier code
                    return;
                }
                
                var trdCd = sheetObjects[0].GetCellValue(Row, "trd_cd");
                if(ComIsEmpty(trdCd)){
                    ComShowCodeMessage('JOO00116', "Trade"); // Select a Carrier code
                    return;
                }
                //Rev Lane Combo Item 조회.
                doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC05);
                
                //
                sheetObjects[0].SetCellValue(Row, "exist_auth_flg"      , "", 0);
                sheetObjects[0].SetCellValue(Row, "exist_finc_mtx_flg"  , "", 0);
                sheetObjects[0].SetCellValue(Row, "exist_child_flg"     , "", 0);
                sheetObjects[0].SetCellValue(Row, "upd_usr_id"          , "", 0);
                sheetObjects[0].SetCellValue(Row, "cre_dt"              , "", 0);
                sheetObjects[0].SetCellValue(Row, "cre_usr_id"          , "", 0);
                sheetObjects[0].SetCellValue(Row, "upd_dt"              , "", 0);
                sheetObjects[0].SetCellValue(Row, "upd_usr_id"          , "", 0);
                sheetObjects[0].SetCellValue(Row, "jo_stl_opt_cd"       , gJoStlOptCd, 0);
                
                sheetObjects[0].SetCellEditable(Row, "del_chk"              , 1);
                sheetObjects[0].SetCellEditable(Row, "jo_crr_cd"            , 1);
                sheetObjects[0].SetCellEditable(Row, "trd_cd"               , 1);
                sheetObjects[0].SetCellEditable(Row, "rlane_cd"             , 1);
                
                sheetObjects[0].SetCellEditable(Row, "exist_auth_flg"       , 0);
                sheetObjects[0].SetCellEditable(Row, "exist_finc_mtx_flg"   , 0);
                sheetObjects[0].SetCellEditable(Row, "exist_child_flg"      , 0);
                break;
            case "btn_add":
                var Row = sheetObjects[0].DataInsert(-1);

                sheetObjects[0].SetCellValue(Row, "jo_stl_opt_cd"       , gJoStlOptCd, 0);
                break;
            case "btn_insert":
                var Row = sheetObjects[0].DataInsert();
                
                sheetObjects[0].SetCellValue(Row, "jo_stl_opt_cd"       , gJoStlOptCd, 0);
                break;
            case "btn_Retrieve":
                doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
                break;
            case "btn_New":
                sheetObjects[0].RemoveAll();
                comboObjects[0].SetSelectIndex(-1, false);
                comboObjects[1].SetSelectIndex(-1, false);
                comboObjects[1].RemoveAll();
                comboObjects[2].SetSelectIndex(-1, false);
                comboObjects[2].RemoveAll();
                
                doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
                break;
            case "btn_Save":
                doActionIBSheet(sheetObjects[0], formObj, IBSAVE);
                break;
            case "btn_DownExcel":
                var paramObj = new Object();
                paramObj.cols = 10;
                var url = ComJooGetPgmTitle(sheetObjects[0], paramObj);
                sheetObjects[0].Down2Excel({
                    DownCols : makeHiddenSkipCol(sheetObjects[0]),
                    SheetDesign : 1,
                    Merge : 1
                });
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
            var comboItems = joCrrCdComboItems.split("|");
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
    //ComBtnDisable("btn_delete");
    ComBtnDisable("btn_copy");
    // initializing IBMultiCombo
    for (var k = 0; k < comboObjects.length; k++) {
        initCombo(comboObjects[k], k + 1);
    }
    //onInitPage(sheetObjects[0]);
    
    doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}

function onInitPage(sheetObj) {
    var formObj = document.form;
    doActionIBSheet(sheetObjects[0], formObj, IBCLEAR);
    
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
                var HeadTitle1="||Partner|Trade|Lane|Service Provider|Service Provider|Customer|Customer|Customer|Customer|Curr.|Delete|Authority|Financial\nAffairs|Settlement\nLink|Created Date|Created User|Updated Date|Updated User|cust_cnt_cd|cust_seq|jo_stl_opt_cd";
                var headCount=ComCountHeadTitle(HeadTitle1);
                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
                var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"} ];
                InitHeaders(headers, info); 
    
                var cols = [ 
                       {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
                       {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"del_chk" },
                       {Type:"PopupEdit", Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:"jo_crr_cd",        KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"ComboEdit", Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:"trd_cd",           KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:"rlane_cd",         KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"PopupEdit", Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:"vndr_seq",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                       {Type:"Text",      Hidden:0, Width:160,  Align:"Left",    ColMerge:1,   SaveName:"vndr_lgl_eng_nm",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"PopupEdit", Hidden:0, Width:110,  Align:"Center",  ColMerge:1,   SaveName:"cust_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                       {Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:1,   SaveName:"cust_seq",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                       {Type:"Text",      Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"cust_cnt_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:160,  Align:"Left",    ColMerge:1,   SaveName:"cust_lgl_eng_nm",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Combo",     Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:"locl_curr_cd",     KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                       {Type:"ComboEdit", Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:"delt_flg",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                       {Type:"Popup",     Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:"exist_auth_flg",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:0 },
                       {Type:"Popup",     Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:"exist_finc_mtx_flg", KeyField:0, CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:"exist_child_flg",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:130,  Align:"Center",  ColMerge:1,   SaveName:"cre_dt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:"cre_usr_id",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:130,  Align:"Center",  ColMerge:1,   SaveName:"upd_dt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:"upd_usr_id",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"jo_stl_opt_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
                 
                InitColumns(cols);
                SetColProperty(0    , "delt_flg"        , {ComboText:"N|Y", ComboCode:"N|Y", DefaultValue:"N"} );
                SetColProperty(0    , "trd_cd"          , {ComboText:"|"+mdmTrdCdComboItems, ComboCode:"|"+mdmTrdCdComboItems} );
                SetColProperty(0    , "locl_curr_cd"    , { ComboText : currCdComboItems, ComboCode : currCdComboItems });
                SetColProperty(0    , "jo_crr_cd"       , {AcceptKeys:"E"   , InputCaseSensitive:1});
                SetColProperty(0    , "trd_cd"          , {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0    , "rlane_cd"        , {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0    , "vndr_seq"        , {AcceptKeys:"N"   , InputCaseSensitive:1});
                SetColProperty(0    , "cust_cd"         , {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0    , "delt_flg"        , {AcceptKeys:"E"   , InputCaseSensitive:1});
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
        case IBCLEAR: // initializing
            formObj.f_cmd.value = SEARCH01;
            var param = FormQueryString(formObj)
            var sXml = sheetObj.GetSearchData("FNS_JOO_0088GS.do", param);
            ComXml2ComboItem(sXml, jo_crr_cd, "code", "code");
            break;
        case IBSEARCH: // retrieve
            formObj.f_cmd.value = SEARCH02;
            if (!validateForm(sheetObj, formObj, sAction)) {
                return;
            }
            ComOpenWait(true);
            var param = FormQueryString(formObj);
            var sXml = sheetObj.GetSearchData("FNS_JOO_0088GS.do", param);
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
            var sParam = ComGetSaveString(sheetObj, true, true);
            sParam += "&" + FormQueryString(formObj);
            var sXml = sheetObj.GetSaveData("FNS_JOO_0088GS.do", sParam);
            sheetObj.LoadSaveData(sXml);
            doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
            ComOpenWait(false);
            break;
        case IBINSERT: // insert
            break;
        case IBSEARCH_ASYNC04://Carrier Key In Check.
            ComOpenWait(true);
            var tmpJoCrrCd = sheetObj.GetCellValue(sheetObj.GetSelectRow(), "jo_crr_cd");
            var param = "";
                param += "f_cmd="+SEARCH03;
                param += "&jo_crr_cd="+tmpJoCrrCd;
            var sXml = sheetObj.GetSearchData("FNS_JOO_0088GS.do", param);

            ComOpenWait(false);
            
            var chkFlag = ComGetEtcData(sXml, "CHECK");
            if(chkFlag == "E"){
                ComShowCodeMessage("JOO00136", "Carrier");
                sheetObj.SelectCell(sheetObj.GetSelectRow(), "jo_crr_cd");
            }
            
            break;
        case IBSEARCH_ASYNC05://Rev Lane Combo Item Setting.
            ComOpenWait(true);

            var tmpJoCrrCd  = sheetObj.GetCellValue(sheetObj.GetSelectRow(), "jo_crr_cd");
            var tmpTrdCd    = sheetObj.GetCellValue(sheetObj.GetSelectRow(), "trd_cd");
            var param = "";
                param += "f_cmd="+SEARCH04;
                param += "&jo_crr_cd="+tmpJoCrrCd;
                param += "&trd_cd="+tmpTrdCd;
            var sXml = sheetObj.GetSearchData("FNS_JOO_0088GS.do", param);
            ComOpenWait(false);
            
            var rlaneCdComboItems = ComGetEtcData(sXml, "rlane_cds");           
            
            if(!ComIsEmpty(rlaneCdComboItems)){
                var tmpRlaneCdComboItem = rlaneCdComboItems.split("|");
                var tmpBeforeRlaneCd    = sheetObj.GetCellValue(sheetObj.GetSelectRow(), "rlane_cd");
                
                sheetObj.InitCellProperty   (sheetObj.GetSelectRow(), "rlane_cd"   , {Type:"ComboEdit",Align:"Center"} );
                sheetObj.CellComboItem      (sheetObj.GetSelectRow(), "rlane_cd"   , {ComboText:rlaneCdComboItems, ComboCode:rlaneCdComboItems, DefaultValue:tmpRlaneCdComboItem[0]} );
                
                if(ComIsEmpty(tmpBeforeRlaneCd)){
                    tmpBeforeRlaneCd = tmpRlaneCdComboItem[0];
                }
                
                sheetObj.SetCellValue       (sheetObj.GetSelectRow(), "rlane_cd"    , tmpBeforeRlaneCd,   0);
            }else{
                ComShowCodeMessage("JOO00136", "Lane");
                sheetObj.SelectCell(sheetObj.GetSelectRow(), "trd_cd");
            }
            break;
        case IBSEARCH_ASYNC06://vendor Key In Check.
            ComOpenWait(true);
            var tmpVndrSeq = sheetObj.GetCellValue(sheetObj.GetSelectRow(), "vndr_seq");
            var param = "";
                param += "f_cmd="+SEARCH05;
                param += "&vndr_seq="+tmpVndrSeq;
            var sXml = sheetObj.GetSearchData("FNS_JOO_0088GS.do", param);

            ComOpenWait(false);
            
            var vndrSeq = ComGetEtcData(sXml, "vndr_seq");
            var vndrLglEngNm = ComGetEtcData(sXml, "vndr_lgl_eng_nm");
            if(ComIsEmpty(vndrSeq)){
                ComShowCodeMessage("JOO00136", "Service Provider");
                
                sheetObj.SetCellValue(sheetObj.GetSelectRow(), "vndr_seq"       , ""       , 0);
                sheetObj.SetCellValue(sheetObj.GetSelectRow(), "vndr_lgl_eng_nm", ""       , 0);
                
                sheetObj.SelectCell(sheetObj.GetSelectRow(), "vndr_seq");
                return;
            }else{
                sheetObj.SetCellValue(sheetObj.GetSelectRow(), "vndr_seq"       , vndrSeq       , 0);
                sheetObj.SetCellValue(sheetObj.GetSelectRow(), "vndr_lgl_eng_nm", vndrLglEngNm  , 0);
                
                doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC09); //vendor invoice currency default setting.
            }            
            break;
        case IBSEARCH_ASYNC07://customer Key In Check.
            ComOpenWait(true);
            var tmpCustCd = sheetObj.GetCellValue(sheetObj.GetSelectRow(), "cust_cd");
            var param = "";
                param += "f_cmd="+SEARCH06;
                param += "&cust_cd="+tmpCustCd;
            var sXml = sheetObj.GetSearchData("FNS_JOO_0088GS.do", param);

            ComOpenWait(false);
            
            var custCd = ComGetEtcData(sXml, "cust_cd");
            var custLglEngNm = ComGetEtcData(sXml, "cust_lgl_eng_nm");
            if(ComIsEmpty(custCd)){
                ComShowCodeMessage("JOO00136", "Customer");
                
                sheetObj.SetCellValue(sheetObj.GetSelectRow(), "cust_cd"        , ""  , 0);
                sheetObj.SetCellValue(sheetObj.GetSelectRow(), "cust_cnt_cd"    , ""  , 0);
                sheetObj.SetCellValue(sheetObj.GetSelectRow(), "cust_seq"       , ""  , 0);
                sheetObj.SetCellValue(sheetObj.GetSelectRow(), "cust_lgl_eng_nm", ""  , 0);
                
                sheetObj.SelectCell(sheetObj.GetSelectRow(), "cust_cd");
                return;
            }else{
                var tmpCustCntCd    = custCd.substr(0,2);
                var tmpCustSeq      = custCd.substr(2);
                
                sheetObj.SetCellValue(sheetObj.GetSelectRow(), "cust_cd"        , custCd        , 0);
                sheetObj.SetCellValue(sheetObj.GetSelectRow(), "cust_cnt_cd"    , tmpCustCntCd  , 0);
                sheetObj.SetCellValue(sheetObj.GetSelectRow(), "cust_seq"       , tmpCustSeq    , 0);
                sheetObj.SetCellValue(sheetObj.GetSelectRow(), "cust_lgl_eng_nm", custLglEngNm  , 0);
            }            
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
            doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
            
            break;
            
        case IBSEARCH_ASYNC09://vendor Invoice currency defalut setting.
            ComOpenWait(true);
            var tmpVndrSeq = sheetObj.GetCellValue(sheetObj.GetSelectRow(), "vndr_seq");
            var param = "";
                param += "f_cmd="+SEARCH07;
                param += "&vndr_seq="+tmpVndrSeq;
            var sXml = sheetObj.GetSearchData("FNS_JOO_0088GS.do", param);

            ComOpenWait(false);
            
            var invCurrCd = ComGetEtcData(sXml, "inv_curr_cd");
            if(ComIsEmpty(invCurrCd)){
                ComShowCodeMessage("JOO00136", "Service Provider Invoice Currency");
                
                sheetObj.SetCellValue(sheetObj.GetSelectRow(), "locl_curr_cd"       , ""       , 0);
                return;
            }else{
                sheetObj.SetCellValue(sheetObj.GetSelectRow(), "locl_curr_cd"       , invCurrCd       , 0);
            }            
            break;
    }
}
function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
    if (sheetObj.RowCount() > 0) {
        ComBtnEnable("btn_copy");
        var iStartRow   = sheetObj.HeaderRows();
        var iEndRow     = sheetObj.LastRow();
        for(var i=iStartRow; i<=iEndRow; i++){
            var tmpExistChildFlg = sheetObj.GetCellValue(i, "exist_child_flg");
            if(ComIsEmpty(tmpExistChildFlg) || tmpExistChildFlg == "X"){
                sheetObj.SetCellEditable(i, "del_chk", 1);
                //sheetObj.SetCellEditable(i, "locl_curr_cd", 1);
            }else{
                sheetObj.SetCellEditable(i, "del_chk", 0);
                //sheetObj.SetCellEditable(i, "locl_curr_cd", 0);
            }
        }
    }
}
function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
    if (sheetObj.RowCount() > 0) {
        ComBtnEnable("btn_copy");
        var iStartRow   = sheetObj.HeaderRows();
        var iEndRow     = sheetObj.LastRow();
        for(var i=iStartRow; i<=iEndRow; i++){
            var tmpExistChildFlg = sheetObj.GetCellValue(i, "exist_child_flg");
            if(ComIsEmpty(tmpExistChildFlg) || tmpExistChildFlg == "X"){
                sheetObj.SetCellEditable(i, "del_chk", 1);
                //sheetObj.SetCellEditable(i, "locl_curr_cd", 1);
            }else{
                sheetObj.SetCellEditable(i, "del_chk", 0);
                //sheetObj.SetCellEditable(i, "locl_curr_cd", 0);
            }
        }
    }
}
function sheet1_OnSelectCell(sheetObj, OldRow, OldCol, NewRow, NewCol) {
   /* if (sheetObj.GetRowStatus(NewRow) == "I" || sheetObj.GetRowStatus(NewRow) == "U") {
        ComBtnEnable("btn_delete");
    } else {
        ComBtnDisable("btn_delete");
    }*/
}
function sheet1_OnChange(sheetObj, Row, Col, Value, OldValue, RaiseFlag) {
    var formObj = document.form;
    var colName = sheetObj.ColSaveName(Col);
    switch(colName){
        case "jo_crr_cd":
            //입력된 carrier의 Validation 
            var joCrrCd = sheetObj.GetCellValue(Row, "jo_crr_cd");
            if(ComIsEmpty(joCrrCd) || joCrrCd.length < 3){
                ComShowCodeMessage('JOO00116', "Carrier"); // Select a Carrier code
                return;
            }
            
            doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC04);
            
            break;
        case "trd_cd":
            //trd_cd의 rlane_cd combo item을 조회 한다.
            var joCrrCd = sheetObj.GetCellValue(Row, "jo_crr_cd");
            if(ComIsEmpty(joCrrCd) || joCrrCd.length < 3){
                ComShowCodeMessage('JOO00116', "Carrier"); // Select a Carrier code
                return;
            }
            
            var trdCd = sheetObj.GetCellValue(Row, "trd_cd");
            if(ComIsEmpty(trdCd)){
                ComShowCodeMessage('JOO00116', "Trade"); // Select a Carrier code
                return;
            }
            //Trade 변경시 Revenue Lane 초기화 시킨다.(Default Lane Value를 주기 위한 조건: copy 와 구분하기 위한 값)
            sheetObj.SetCellValue(Row, "rlane_cd", "", 0);
            
            doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC05);
            break;
        case "rlane_cd":
            //trd_cd의 rlane_cd combo item을 조회 한다.
            var joCrrCd = sheetObj.GetCellValue(Row, "jo_crr_cd");
            if(ComIsEmpty(joCrrCd) || joCrrCd.length < 3){
                ComShowCodeMessage('JOO00116', "Carrier"); // Select a Carrier code

                sheetObj.SetCellValue(Row, "rlane_cd", "", 0);
                return;
            }
            
            var trdCd = sheetObj.GetCellValue(Row, "trd_cd");
            if(ComIsEmpty(trdCd)){
                ComShowCodeMessage('JOO00116', "Trade"); // Select a Carrier code

                sheetObj.SetCellValue(Row, "rlane_cd", "", 0);
                return;
            }
            break;
        case "vndr_seq" :
            var vndrSeq = sheetObj.GetCellValue(Row, "vndr_seq");
            if(ComIsEmpty(vndrSeq) || vndrSeq.length < 6){
                sheetObj.SetCellValue(sheetObj.GetSelectRow(), "vndr_seq"       , ""       , 0);
                sheetObj.SetCellValue(sheetObj.GetSelectRow(), "vndr_lgl_eng_nm", ""       , 0);
                //ComShowCodeMessage('JOO00116', "Service Provider"); // Select a Carrier code
                return;
            }
            
            doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC06);
            break;
        case "cust_cd" :
            var custCd = sheetObj.GetCellValue(Row, "cust_cd");
            if(ComIsEmpty(custCd) || custCd.length < 8){
                sheetObj.SetCellValue(sheetObj.GetSelectRow(), "cust_cd"        , ""  , 0);
                sheetObj.SetCellValue(sheetObj.GetSelectRow(), "cust_cnt_cd"    , ""  , 0);
                sheetObj.SetCellValue(sheetObj.GetSelectRow(), "cust_seq"       , ""  , 0);
                sheetObj.SetCellValue(sheetObj.GetSelectRow(), "cust_lgl_eng_nm", ""  , 0);
                //ComShowCodeMessage('JOO00116', "Customer"); // Select a Carrier code
                return;
            }
            
            doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC07);
            break;
           
            
        
    }
}
/**
 * Sheet1 OnPopupClick event
 * 
 * @param sheetObj
 * @param Row
 * @param Col
 * @return
 */
function sheet1_OnPopupClick(sheetObj, Row, Col) {
    var colName = sheetObj.ColSaveName(Col);
    switch(colName){
        case "jo_crr_cd":
            ComOpenPopup('/opuscntr/COM_ENS_0N1.do', 800, 500, "SetJoCrrCd", "1,0,1", true, false, Row, Col, 0);
            break;
        case "vndr_seq":
            var sUrl="/opuscntr/COM_ENS_0C1.do";
            ComOpenPopup(sUrl, 780, 550, "SetVndrSeq", "1,0,1", true, false, Row, Col, 0);
            break;
        case "cust_cd":
            var sUrl="/opuscntr/COM_ENS_041.do";
            ComOpenPopup(sUrl, 780, 500, "SetCustCd", "1,0,1", true, false, Row, Col, 0);
            break;
        case "exist_auth_flg":
            var jo_crr_cd   = sheetObj.GetCellValue(Row, "jo_crr_cd");
            var trd_cd      = sheetObj.GetCellValue(Row, "trd_cd");
            var rlane_cd    = sheetObj.GetCellValue(Row, "rlane_cd");
            var vndr_seq    = sheetObj.GetCellValue(Row, "vndr_seq");
            var cust_cd     = sheetObj.GetCellValue(Row, "cust_cd");
            
            var sUrl = "/opuscntr/FNS_JOO_0090.do";
                sUrl += "?jo_crr_cd="+jo_crr_cd;
                sUrl += "&trd_cd="+trd_cd;
                sUrl += "&rlane_cd="+rlane_cd;
                sUrl += "&vndr_seq="+vndr_seq;
                sUrl += "&cust_cd="+cust_cd;
            
            ComOpenPopup(sUrl, 1000, 700,"setAuthorityOffice", "0,0", true, false, 0, 0, 0, "FNS_JOO_0090");
            break;
        case "exist_finc_mtx_flg":
            var jo_crr_cd   = sheetObj.GetCellValue(Row, "jo_crr_cd");
            var trd_cd      = sheetObj.GetCellValue(Row, "trd_cd");
            var rlane_cd    = sheetObj.GetCellValue(Row, "rlane_cd");
            var vndr_seq    = sheetObj.GetCellValue(Row, "vndr_seq");
            var cust_cd     = sheetObj.GetCellValue(Row, "cust_cd");
            var locl_curr_cd= sheetObj.GetCellValue(Row, "locl_curr_cd");
            
            var sUrl = "/opuscntr/FNS_JOO_0089.do";
                sUrl += "?jo_crr_cd="+jo_crr_cd;
                sUrl += "&trd_cd="+trd_cd;
                sUrl += "&rlane_cd="+rlane_cd;
                sUrl += "&vndr_seq="+vndr_seq;
                sUrl += "&cust_cd="+cust_cd;
                sUrl += "&locl_curr_cd="+locl_curr_cd;
            
            ComOpenPopup(sUrl, 1000, 700,"setFinancialMtx", "0,0", true, false, 0, 0, 0, "FNS_JOO_0089");
            break;
    }
}
function setAuthorityOffice(){}
function setFinancialMtx(){}

function SetJoCrrCd(aryPopupData, row, col, seetIdx) {
    sheetObjects[seetIdx].SetCellValue(row, col, aryPopupData[0][3], 1);
}
function SetVndrSeq(aryPopupData, row, col, seetIdx) {
    sheetObjects[seetIdx].SetCellValue(row, "vndr_seq"          , aryPopupData[0][2], 0);
    sheetObjects[seetIdx].SetCellValue(row, "vndr_lgl_eng_nm"   , aryPopupData[0][4], 0);
    
    doActionIBSheet(sheetObjects[seetIdx], document.form, IBSEARCH_ASYNC09); //vendor invoice currency default setting.
}
function SetCustCd(aryPopupData, row, col, seetIdx) {
    var tmpCustCd       = aryPopupData[0][3];
    var tmpCustCntCd    = tmpCustCd.substr(0,2);
    var tmpCustSeq      = tmpCustCd.substr(2);
    sheetObjects[seetIdx].SetCellValue(row, "cust_cd"           , tmpCustCd, 0);
    sheetObjects[seetIdx].SetCellValue(row, "cust_seq"          , tmpCustSeq, 0);
    sheetObjects[seetIdx].SetCellValue(row, "cust_cnt_cd"       , tmpCustCntCd, 0);
    sheetObjects[seetIdx].SetCellValue(row, "cust_lgl_eng_nm"   , aryPopupData[0][4], 0);
}
function initSheetRow(){
    
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
    with (formObj) {
        switch (sAction) {
            case IBSAVE:
                var sParam = ComGetSaveString(sheetObj);
                if (sParam == "") {
                    return false;
                }
                // Vendor or Customer must exists
                if (sheetObj.RowCount() > 0) {
                    var iStartRow   = sheetObj.HeaderRows();
                    var iEndRow     = sheetObj.LastRow();
                    for(var i=iStartRow; i<=iEndRow; i++){
                        var vndrSeq = sheetObj.GetCellValue(i, "vndr_seq");
                        var custCd  = sheetObj.GetCellValue(i, "cust_cd");
                        if(ComIsEmpty(vndrSeq) && ComIsEmpty(custCd)){
                        	ComShowCodeMessage("JOO00005");
                        	return;
                        }
                    }
                }
                
                var Row = sheetObj.ColValueDup("jo_crr_cd|rlane_cd", false);
                if (Row > -1) {
                    ComShowCodeMessage("JOO00161");
                    sheetObj.SelectCell(Row, "rlane_cd");
                    return false;
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

    //trd_cd_OnFocus(comboObjects[1]);
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
    
    //rlane_cd_OnFocus(comboObjects[2]);
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
//팝업에서 재호출 하기 위한 함수.
function setRefresh(){
    var formObj = document.form;
    doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}
function resizeSheet() {
    ComResizeSheet(sheetObjects[0]);
}