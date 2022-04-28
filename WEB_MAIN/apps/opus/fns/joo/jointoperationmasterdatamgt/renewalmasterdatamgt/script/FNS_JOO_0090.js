/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : FNS_JOO_0090.js
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
            case "btn_delete":
                var checkedRows=(sheetObjects[0].FindCheckedRow("del_chk")).split("|");
                if (checkedRows == ""){
                    ComShowCodeMessage('JOO00143');
                    return;
                }
                
                for(var i=checkedRows.length-1; i >= 0; i--){
                    stat=sheetObjects[0].GetRowStatus(checkedRows[i]);
                    if ((stat == "I" || stat == "U") && (sheetObjects[0].GetRowHidden(checkedRows[i]) == false)){
                        JooRowHideDelete(sheetObjects[0], "del_chk");
                    }
                }   

                break;
            case "btn_copy":
                var Row = sheetObjects[0].DataCopy();
                
                
                sheetObjects[0].SetCellValue(Row, "cre_dt"              , "", 0);
                sheetObjects[0].SetCellValue(Row, "cre_usr_id"          , "", 0);
                sheetObjects[0].SetCellValue(Row, "upd_dt"              , "", 0);
                sheetObjects[0].SetCellValue(Row, "upd_usr_id"          , "", 0);
                
                sheetObjects[0].SetCellEditable(Row, "del_chk"              , 1);
                break;
            case "btn_add":
                var Row = sheetObjects[0].DataInsert(-1);
                var tmpJoCrrCd  = ComGetObjValue(formObj.jo_crr_cd);
                var tmpTrdCd    = ComGetObjValue(formObj.trd_cd);
                var tmpRlaneCd  = ComGetObjValue(formObj.rlane_cd);
                
                sheetObjects[0].SetCellValue(Row, "jo_crr_cd"       , tmpJoCrrCd, 0);
                sheetObjects[0].SetCellValue(Row, "trd_cd"          , tmpTrdCd  , 0);
                sheetObjects[0].SetCellValue(Row, "rlane_cd"        , tmpRlaneCd, 0);
                break;
            case "btn_insert":
                var Row = sheetObjects[0].DataInsert();
                var tmpJoCrrCd  = ComGetObjValue(formObj.jo_crr_cd);
                var tmpTrdCd    = ComGetObjValue(formObj.trd_cd);
                var tmpRlaneCd  = ComGetObjValue(formObj.rlane_cd);
                
                sheetObjects[0].SetCellValue(Row, "jo_crr_cd"       , tmpJoCrrCd, 0);
                sheetObjects[0].SetCellValue(Row, "trd_cd"          , tmpTrdCd  , 0);
                sheetObjects[0].SetCellValue(Row, "rlane_cd"        , tmpRlaneCd, 0);
                
                break;
            case "btn_Retrieve":
                doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
                break;
            case "btn_New":
                sheetObjects[0].RemoveAll();                
                doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
                break;
            case "btn_Save":
                doActionIBSheet(sheetObjects[0], formObj, IBSAVE);
                break;
            case "btn_DownExcel":
                if(sheetObjects[0].RowCount() < 1){//no data
                    ComShowCodeMessage("COM132501");
                }else{
                    sheetObjects[0].Down2Excel({ HiddenColumn:true, DownCols: makeHiddenSkipCol(sheetObjects[0]), SheetDesign:1,Merge:1 });
                }
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
        case "":
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

/**
 * setting sheet initial values and header param : sheetObj, sheetNo adding case
 * as numbers of counting sheets
 */
function initSheet(sheetObj, sheetNo) {
    var cnt = 0;
    switch (sheetObj.id) {
        case "sheet1": // t1sheet1 init     //t1sheet1 init 
            with(sheetObj){
                var HeadTitle1="||Carrier|Trade|Lane|Authority Office|Authority Code|Delete|Created\nDate|Created\nUser|Updated Date|Updated User";
                var headCount=ComCountHeadTitle(HeadTitle1);
                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
    
                var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"} ];
                InitHeaders(headers, info);
    
                var cols = [ 
                       {Type:"Status",    Hidden:1,     Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
                       {Type:"CheckBox",  Hidden:0,     Width:30,   Align:"Center",  ColMerge:1,   SaveName:"del_chk" },
                       {Type:"Text",      Hidden:0,     Width:60,   Align:"Center",  ColMerge:1,   SaveName:"jo_crr_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0,     Width:50,   Align:"Center",  ColMerge:1,   SaveName:"trd_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0,     Width:50,   Align:"Center",  ColMerge:1,   SaveName:"rlane_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"PopupEdit", Hidden:0,     Width:150,  Align:"Center",  ColMerge:1,   SaveName:"auth_ofc_cd",      KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:6 },
                       {Type:"Combo",     Hidden:1,     Width:150,   Align:"Center",  ColMerge:1,   SaveName:"jo_crr_auth_cd",   KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Combo",     Hidden:0,     Width:80,   Align:"Center",  ColMerge:1,   SaveName:"delt_flg",         KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                       {Type:"Text",      Hidden:1,     Width:130,  Align:"Center",  ColMerge:1,   SaveName:"cre_dt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1,     Width:80,   Align:"Center",  ColMerge:1,   SaveName:"cre_usr_id",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0,     Width:130,  Align:"Center",  ColMerge:1,   SaveName:"upd_dt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0,     Width:80,   Align:"Center",  ColMerge:1,   SaveName:"upd_usr_id",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }
                       ];
                 
                InitColumns(cols);
                SetColProperty(0, "jo_crr_auth_cd"  , {ComboText:"R|W"      , ComboCode:"R|W", DefaultValue:"W"} );
                SetColProperty(0, "delt_flg"        , {ComboText:"NO|YES"   , ComboCode:"N|Y", DefaultValue:"N"} );
                SetColProperty(0, "auth_ofc_cd"     , {AcceptKeys:"E" , InputCaseSensitive:1});

                SetEditable(1);
                SetShowButtonImage(1);
                resizeSheet();
             }
            break;
    }
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
    sheetObj.ShowDebugMsg(false);
    switch (sAction) {
        case IBCLEAR: // initializing
            
            break;
        case IBSEARCH: // retrieve
            formObj.f_cmd.value = SEARCH01;
            if (!validateForm(sheetObj, formObj, sAction)) {
                return;
            }
            ComOpenWait(true);
            var param = FormQueryString(formObj);
            var sXml = sheetObj.GetSearchData("FNS_JOO_0090GS.do", param);
            sheetObj.LoadSearchData(sXml);
            ComOpenWait(false);
            break;
        case IBSEARCH_ASYNC01:      //Check Office Code , KeyUp Event
            formObj.f_cmd.value=SEARCH11;  
            var code=sheetObjects[0].GetCellValue( sheetObjects[0].GetSelectRow(), "auth_ofc_cd");
            var param=FormQueryString(formObj)+"&code="+code+"&auth_delcheck_yn=N";
             var sXml=sheetObj.GetSearchData("JOOCommonGS.do", param);
             
            if (ComGetEtcData(sXml,"TRANS_RESULT_KEY") == "S"){
                if(ComGetTotalRows(sXml) == 0 ){
                    ComShowCodeMessage("JOO00117", "Authority Office");
                    sheetObjects[0].SetCellValue( sheetObjects[0].GetSelectRow(), "auth_ofc_cd","",0);
                    sheetObjects[0].SelectCell( sheetObjects[0].GetSelectRow(), "auth_ofc_cd");
                } 
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
            var sXml = sheetObj.GetSaveData("FNS_JOO_0090GS.do", sParam);
            
            var tmpResultKey = ComGetSelectSingleNode(sXml, "TR-ALL");
            if(tmpResultKey == "OK"){
                ComOpenWait(false);
                //sheetObj.LoadSaveData(sXml);
                
                openerObj.setRefresh();
                doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
            }else{
                ComOpenWait(false);
            }
            break;
    }
}
function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
    if (sheetObj.RowCount() > 0) {
        ComBtnEnable("btn_copy");
    }
}
function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
    if (sheetObj.RowCount() > 0) {
        ComBtnEnable("btn_copy");
    }
}
function sheet1_OnChange(sheetObj, Row, Col, Value, OldValue, RaiseFlag) {
    var formObj = document.form;
    var colName = sheetObj.ColSaveName(Col);
    switch(colName){
        case "auth_ofc_cd" :
            if( sheetObj.GetEditText().length < 6 ){
                doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC01);
            }
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
        case "auth_ofc_cd":
            ComOpenPopup('/opuscntr/COM_ENS_071.do',  770, 480, "SetAuthOfficeCode", "1,0,0", true, false, Row, Col, 0);
            break;
    }
}
function SetAuthOfficeCode(aryPopupData, row, col, seetIdx) {
    sheetObjects[seetIdx].SetCellValue(row, col,aryPopupData[0][3],0);
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
                var Row = sheetObj.ColValueDup("jo_crr_cd|rlane_cd|auth_ofc_cd", false);
                if (Row > -1) {
                    ComShowCodeMessage("JOO00161");
                    sheetObj.SelectCell(Row, "auth_ofc_cd");
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
function resizeSheet() {
    ComResizeSheet(sheetObjects[0]);
}