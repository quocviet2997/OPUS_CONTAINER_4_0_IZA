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
            case "btn_copy": // not used.
                break;
            case "btn_add": // not used.
                break;
            case "btn_insert": // not used.
                break;
            case "btn_Retrieve":
                doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
                break;
            case "btn_Save":
                doActionIBSheet(sheetObjects[0], formObj, IBSAVE);
                break;
            case "btn_DownExcel":
                sheetObjects[0].Down2ExcelBuffer(true);
                
                if(sheetObjects[0].RowCount() >= 0){
                    sheetObjects[0].Down2Excel({DownCols: makeHiddenSkipCol(sheetObjects[0]), SheetDesign:1, DebugMode:1, Merge:1, ExcelRowHeight: 20, AutoSizeColumn: 1, SheetName:"Revenue"});
                }
                if(sheetObjects[1].RowCount() >= 0){
                    sheetObjects[1].Down2Excel({DownCols: makeHiddenSkipCol(sheetObjects[1]), SheetDesign:1, DebugMode:1, Merge:1, ExcelRowHeight: 20, AutoSizeColumn: 1, SheetName:"Expense"});
                }
                sheetObjects[0].Down2ExcelBuffer(false);
                break;
            case "btn_delete1":
                JooRowHideDelete(sheetObjects[0], "sheet1_del_chk");
                break;
            case "btn_delete2":
                JooRowHideDelete(sheetObjects[1], "sheet2_del_chk");
                break;
            case "btn_Create":
                doActionIBSheet(sheetObjects[0], formObj, IBCREATE);
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
        case 1: // currency
            /*
            with (comboObj) {
                SetMultiSelect(0);
                SetUseAutoComplete(1);
                SetColAlign(0, "left");
                ValidChar(2,1);    // Uppercase
                SetDropHeight(160);
                SetMaxLength(3);
            }
            comboObj.RemoveAll();
            var codeItems = loclCurrCdComboItem.split("|");
            for ( var i = 0; i < codeItems.length; i++) {
                comboObj.InsertItem(i, codeItems[i], codeItems[i]);
            }
            
            comboObj.SetSelectCode(gLoclCurrCd);
            */
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
    //onInitPage(sheetObjects[0]);
    
    resizeSheet();
    
    doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}

/**
 * setting sheet initial values and header param : sheetObj, sheetNo adding case
 * as numbers of counting sheets
 */
function initSheet(sheetObj, sheetNo) {
    var cnt = 0;
    switch (sheetObj.id) {
        case "sheet1":
            with (sheetObj) {
                //var HeadTitle = "STS||Item|Item Name|Customer|DR|DR|DR|CR|CR|CR|Cur.|Carrier|Lane|RE|vndr_seq";
                //var HeadTitle1 = "STS||Item|Item Name|Customer|Account|Center|City|Account|Center|City|Cur.|Carrier|Lane|RE|vndr_seq";
                
                var HeadTitle = "STS||Item|Item Name|Customer|Account|Account|DR|DR|CR|CR|Cur.|Carrier|Lane|RE|vndr_seq|dr_acct_nm|cr_acct_nm";
                var HeadTitle1 = "STS||Item|Item Name|Customer|DR|CR|Center|City|Center|City|Cur.|Carrier|Lane|RE|vndr_seq|dr_acct_nm|cr_acct_nm";
                
                var headCount = ComCountHeadTitle(HeadTitle);
                var prefix = "sheet1_";
    
                SetConfig({SearchMode : 2, MergeSheet : 5, Page : 20, DataRowMerge : 1});
    
                var info = {Sort : 1, ColMove : 1, HeaderCheck : 1, ColResize : 1};
                var headers = [ { Text : HeadTitle, Align : "Center" }, { Text : HeadTitle1, Align : "Center"} ];
                InitHeaders(headers, info);
    
                var cols = [ 
                     { Type : "Status",     Hidden : 0, Width : 40,     Align : "Center",   ColMerge : 1, SaveName : prefix + "ibflag" }, 
                     { Type : "CheckBox",   Hidden : 0, Width : 30,     Align : "Center",   ColMerge : 1, SaveName : prefix + "del_chk" }, 
                     { Type : "Text",       Hidden : 0, Width : 50,     Align : "Center",   ColMerge : 1, SaveName : prefix + "jo_stl_itm_cd",  KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 },
                     { Type : "Text",       Hidden : 0, Width : 200,    Align : "Left",     ColMerge : 1, SaveName : prefix + "jo_stl_itm_nm",  KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
                     { Type : "Text",       Hidden : 1, Width : 70,     Align : "Center",   ColMerge : 1, SaveName : prefix + "cust_cd",        KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
                     { Type : "Text",       Hidden : 0, Width : 65,     Align : "Center",   ColMerge : 0, SaveName : prefix + "dr_acct_cd",     KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 },
                     { Type : "Text",       Hidden : 0, Width : 65,     Align : "Center",   ColMerge : 0, SaveName : prefix + "cr_acct_cd",     KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 },  
                     { Type : "Text",       Hidden : 1, Width : 70,     Align : "Center",   ColMerge : 0, SaveName : prefix + "dr_ctr_cd",      KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
                     { Type : "Text",       Hidden : 1, Width : 70,     Align : "Center",   ColMerge : 0, SaveName : prefix + "dr_loc_cd",      KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
                     { Type : "Text",       Hidden : 1, Width : 70,     Align : "Center",   ColMerge : 0, SaveName : prefix + "cr_ctr_cd",      KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
                     { Type : "Text",       Hidden : 1, Width : 70,     Align : "Center",   ColMerge : 0, SaveName : prefix + "cr_loc_cd",      KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 },  
                     { Type : "Text",       Hidden : 1, Width : 0,      Align : "Center",   ColMerge : 1, SaveName : prefix + "locl_curr_cd",   KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 1, InsertEdit : 1 }, 
                     { Type : "Text",       Hidden : 1, Width : 0,      Align : "Left",     ColMerge : 1, SaveName : prefix + "jo_crr_cd",      KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
                     { Type : "Text",       Hidden : 1, Width : 0,      Align : "Left",     ColMerge : 1, SaveName : prefix + "rlane_cd",       KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
                     { Type : "Text",       Hidden : 1, Width : 0,      Align : "Left",     ColMerge : 1, SaveName : prefix + "re_divr_cd",     KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 },
                     { Type : "Text",       Hidden : 1, Width : 0,      Align : "Left",     ColMerge : 1, SaveName : prefix + "vndr_seq",       KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 },
                     { Type : "Text",       Hidden : 1, Width : 0,      Align : "Left",     ColMerge : 1, SaveName : prefix + "dr_acct_nm",     KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 },
                     { Type : "Text",       Hidden : 1, Width : 0,      Align : "Left",     ColMerge : 1, SaveName : prefix + "cr_acct_nm",     KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }
                     ];
    
                InitColumns(cols);
                SetEditable(1);
                //SetSheetHeight(200);
            }
            break;
            
        case "sheet2":
            with (sheetObj) {
                //var HeadTitle = "STS||Item|Item Name|Service\nProvider|DR|DR|DR|CR|CR|CR|Cur.|Carrier|Lane|RE|vndr_seq";
                //var HeadTitle1 = "STS||Item|Item Name|Service\nProvider|Account|Center|City|Account|Center|City|Cur.|Carrier|Lane|RE|vndr_seq";
                var HeadTitle = "STS||Item|Item Name|Service\nProvider|Account|Account|DR|DR|CR|CR|Cur.|Carrier|Lane|RE|vndr_seq|dr_acct_nm|cr_acct_nm";
                var HeadTitle1 = "STS||Item|Item Name|Service\nProvider|DR|CR|Center|City|Center|City|Cur.|Carrier|Lane|RE|vndr_seq|dr_acct_nm|cr_acct_nm";
                var headCount = ComCountHeadTitle(HeadTitle);
                var prefix = "sheet2_";
    
                SetConfig({SearchMode : 2, MergeSheet : 5, Page : 20, DataRowMerge : 1});
    
                var info = {Sort : 1, ColMove : 1, HeaderCheck : 1, ColResize : 1};
                var headers = [ { Text : HeadTitle, Align : "Center" }, { Text : HeadTitle1, Align : "Center"} ];
                InitHeaders(headers, info);
    
                var cols = [ 
                     { Type : "Status",     Hidden : 0, Width : 40,     Align : "Center",   ColMerge : 1, SaveName : prefix + "ibflag" }, 
                     { Type : "CheckBox",   Hidden : 0, Width : 30,     Align : "Center",   ColMerge : 1, SaveName : prefix + "del_chk" }, 
                     { Type : "Text",       Hidden : 0, Width : 50,     Align : "Center",   ColMerge : 1, SaveName : prefix + "jo_stl_itm_cd",  KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 },
                     { Type : "Text",       Hidden : 0, Width : 200,    Align : "Left",     ColMerge : 1, SaveName : prefix + "jo_stl_itm_nm",  KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
                     { Type : "Text",       Hidden : 1, Width : 70,     Align : "Center",   ColMerge : 1, SaveName : prefix + "vndr_seq",       KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
                     { Type : "Text",       Hidden : 0, Width : 65,     Align : "Center",   ColMerge : 0, SaveName : prefix + "dr_acct_cd",     KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 },
                     { Type : "Text",       Hidden : 0, Width : 65,     Align : "Center",   ColMerge : 0, SaveName : prefix + "cr_acct_cd",     KeyField : 1, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 },  
                     { Type : "Text",       Hidden : 1, Width : 70,     Align : "Center",   ColMerge : 0, SaveName : prefix + "dr_ctr_cd",      KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
                     { Type : "Text",       Hidden : 1, Width : 70,     Align : "Center",   ColMerge : 0, SaveName : prefix + "dr_loc_cd",      KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
                     { Type : "Text",       Hidden : 1, Width : 70,     Align : "Center",   ColMerge : 0, SaveName : prefix + "cr_ctr_cd",      KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
                     { Type : "Text",       Hidden : 1, Width : 70,     Align : "Center",   ColMerge : 0, SaveName : prefix + "cr_loc_cd",      KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 },  
                     { Type : "Text",       Hidden : 1, Width : 0,      Align : "Center",   ColMerge : 1, SaveName : prefix + "locl_curr_cd",   KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 1, InsertEdit : 1 }, 
                     { Type : "Text",       Hidden : 1, Width : 0,      Align : "Left",     ColMerge : 1, SaveName : prefix + "jo_crr_cd",      KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
                     { Type : "Text",       Hidden : 1, Width : 0,      Align : "Left",     ColMerge : 1, SaveName : prefix + "rlane_cd",       KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }, 
                     { Type : "Text",       Hidden : 1, Width : 0,      Align : "Left",     ColMerge : 1, SaveName : prefix + "re_divr_cd",     KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 },
                     { Type : "Text",       Hidden : 1, Width : 0,      Align : "Left",     ColMerge : 1, SaveName : prefix + "cust_cd",        KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 },
                     { Type : "Text",       Hidden : 1, Width : 0,      Align : "Left",     ColMerge : 1, SaveName : prefix + "dr_acct_nm",     KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 },
                     { Type : "Text",       Hidden : 1, Width : 0,      Align : "Left",     ColMerge : 1, SaveName : prefix + "cr_acct_nm",     KeyField : 0, CalcLogic : "", Format : "", PointCount : 0, UpdateEdit : 0, InsertEdit : 0 }
                     ];
    
                InitColumns(cols);
                SetEditable(1);
                //SetSheetHeight(200);
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
            if (!validateForm(sheetObj, formObj, sAction)) {
                return;
            }
            ComOpenWait(true);
            formObj.f_cmd.value = SEARCH01;
            
            sheetObjects[0].RemoveAll();
            sheetObjects[1].RemoveAll();
            
            var aryPrefix = new Array("sheet1_", "sheet2_"); // prefix
            var param = FormQueryString(formObj);
                param += "&" + ComGetPrefixParam(aryPrefix);
                
            var sXml = sheetObj.GetSearchData("FNS_JOO_0089GS.do", param);
            var arrXml = sXml.split("|$$|");
            for ( var inx = 0; inx < arrXml.length; inx++) {
                sheetObjects[inx].LoadSearchData(arrXml[inx], { Sync : 1 });
            }
            ComOpenWait(false);
            break;
        case IBCREATE:
            if (!validateForm(sheetObj, formObj, sAction)) {
                return;
            }
            ComOpenWait(true);
            formObj.f_cmd.value = SEARCH02;
            
            sheetObjects[0].RemoveAll();
            sheetObjects[1].RemoveAll();
            
            var aryPrefix = new Array("sheet1_", "sheet2_");
            var param = FormQueryString(formObj);
                param += "&" + ComGetPrefixParam(aryPrefix);            
        
            var sXml = sheetObj.GetSearchData("FNS_JOO_0089GS.do", param);
            var arrXml = sXml.split("|$$|");
            for ( var inx = 0; inx < arrXml.length; inx++) { 
                sheetObjects[inx].LoadSearchData(arrXml[inx], { Sync : 1 });
            }
            ComOpenWait(false);
            
            break;
        case IBSAVE: // save
            if (!validateForm(sheetObj, formObj, sAction)) {
                return;
            }
            var SaveStr     = ComGetSaveString(sheetObjects);
            var aryPrefix   = new Array("sheet1_", "sheet2_"); // prefix
            sheetObj.SetWaitImageVisible(0);
            ComOpenWait(true);
            formObj.f_cmd.value = MULTI;
            var param = SaveStr;
                param += "&" + FormQueryString(formObj);
                param += "&" + ComGetPrefixParam(aryPrefix);

            var sXml = sheetObj.GetSaveData("FNS_JOO_0089GS.do", param);
            
            var tmpOk = ComGetSelectSingleNode(sXml, "TR-ALL");
            if(tmpOk == "OK"){
                //sheetObj.LoadSearchData(sXml, { Sync : 1 });
                ComOpenWait(false);
                
                openerObj.setRefresh();
                doActionIBSheet(sheetObj, formObj, IBSEARCH);
            }else{
                ComOpenWait(false);
            }
            break;
    }
}
function sheet1_OnSearchEnd(sheetObj, ErrMsg) {

}
function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
    
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
function sheet1_OnMouseMove(sheetObj, Button, Shift, X, Y){
    var Row=sheetObj.MouseRow();
    var Col=sheetObj.MouseCol();
    var prefix="sheet1_";
    var sText = "";
    var selColName = sheetObj.CellSaveName (Row, Col);
    switch(selColName){
        case prefix+"dr_acct_cd":
            sText = sheetObj.GetCellText(Row,prefix+"dr_acct_nm");
            break;
        case prefix+"cr_acct_cd":
            sText = sheetObj.GetCellText(Row,prefix+"cr_acct_nm");
            break;
    }
    
    if(sText != ""){
        sheetObj.SetToolTipText(Row,Col,sText);
    }
}
function sheet2_OnSearchEnd(sheetObj, ErrMsg) {

}
function sheet2_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {

}
function sheet2_OnChange(sheetObj, Row, Col, Value, OldValue, RaiseFlag) {
    var formObj = document.form;
    var colName = sheetObj.ColSaveName(Col);
    switch(colName){
        case " " :
            break;
    }
}
function sheet2_OnMouseMove(sheetObj, Button, Shift, X, Y){
    var Row=sheetObj.MouseRow();
    var Col=sheetObj.MouseCol();
    var prefix="sheet2_";
    var sText = "";
    var selColName = sheetObj.CellSaveName (Row, Col);
    switch(selColName){
        case prefix+"dr_acct_cd":
            sText = sheetObj.GetCellText(Row,prefix+"dr_acct_nm");
            break;
        case prefix+"cr_acct_cd":
            sText = sheetObj.GetCellText(Row,prefix+"cr_acct_nm");
            break;
    }
    
    if(sText != ""){
        sheetObj.SetToolTipText(Row,Col,sText);
    }
}

function locl_curr_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex,newText, newCode) {
    var formObj = document.form;
   /* var sheetObj = sheetObjects[2];
    // if Carrier Code is changed
    if (formObj.jo_crr_cd_hid.value != formObj.jo_crr_cd.value) {
        UF_reset(formObj.jo_crr_cd.value);
        doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC03);
    }*/
}

/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
    with (formObj) {
        switch (sAction) {
            case IBSAVE:
                var sParam = ComGetSaveString(sheetObjects);
                if (sParam == "") {
                    ComShowCodeMessage('JOO00036'); // not existing data
                    return false;
                }
                
                var Row = sheetObjects[0].ColValueDup("sheet1_jo_crr_cd|sheet1_rlane_cd|sheet1_re_divr_cd|sheet1_jo_stl_itm_cd", false);
                if (Row > -1) {
                    ComShowCodeMessage("JOO00205","Revenue");
                    return false;
                }
                Row = -1;
                Row = sheetObjects[1].ColValueDup("sheet2_jo_crr_cd|sheet2_rlane_cd|sheet2_re_divr_cd|sheet2_jo_stl_itm_cd", false);
                if (Row > -1) {
                    ComShowCodeMessage("JOO00205","Revenue");
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
    for (i = 0; i < sheetObjects.length; i++) {
        ComResizeSheet(sheetObjects[i]);
    }
    //ComResizeSheet(sheetObjects[0]);
}