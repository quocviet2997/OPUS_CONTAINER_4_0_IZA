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
    initControl();
    doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}
function initControl() {}

/**
 * setting sheet initial values and header param : sheetObj, sheetNo adding case
 * as numbers of counting sheets
 */
function initSheet(sheetObj, sheetNo) {
    var cnt = 0;
    switch (sheetObj.id) {
        case "sheet1": // t1sheet1 init     //t1sheet1 init
            with(sheetObj){
                var HeadTitle1="|Partner|Curr.|Invoiced|Invoiced|Settlement|Settlement";
                var HeadTitle2="|Partner|Curr.|Revenue|Expense|Revenue|Expense";
                
                var prefix = "sheet1_";
                var headCount=ComCountHeadTitle(HeadTitle1);
                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
                var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"}, { Text:HeadTitle2, Align:"Center"} ];
                InitHeaders(headers, info);
    
                var cols = [ 
                       {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName: prefix + "ibflag" },
                       {Type:"Text",      Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName: prefix + "jo_crr_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Text",      Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName: prefix + "locl_curr_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Float",     Hidden:0, Width:120,  Align:"right",   ColMerge:1,   SaveName: prefix + "inv_rev_act_amt",  KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Float",     Hidden:0, Width:120,  Align:"right",   ColMerge:1,   SaveName: prefix + "inv_exp_act_amt",  KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Float",     Hidden:0, Width:120,  Align:"right",   ColMerge:1,   SaveName: prefix + "stl_rev_act_amt",  KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",     Hidden:0, Width:120,  Align:"right",   ColMerge:1,   SaveName: prefix + "stl_exp_act_amt",  KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:1 }
                       ];
                 
                InitColumns(cols);
                SetEditable(1);
                SetCountPosition();
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
                
            var sXml = sheetObj.GetSearchData("FNS_JOO_0108GS.do", param);
            sheetObj.LoadSearchData(sXml);
            ComOpenWait(false);
            break;
    }
}
function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) {
    if (sheetObj.RowCount() > 0) {

        //Row 강제머지할 셀의 Row Index
        //Col 강제머지할 셀의 Column Index 
        //Rows 강제머지할 셀의 Row 개수
        //Cols 강제머지할 셀의 Col 개수
        //ObjId.SetMergeCell(Row, Col, Rows, Cols)

        var str = "";
        var iStRow = sheetObj.HeaderRows();
        var iEdRow = sheetObj.LastRow();
        for(var i=iStRow;i<=iEdRow;i++){
            str = sheetObj.GetCellText(i,"sheet1_jo_crr_cd");   // ITM 항목 읽기
            
            if(str.indexOf("Total")>-1){
                var iMergeRowCnt = (iEdRow - i) + 1;
                //sheetObj.SetMergeCell(i, 0, iMergeRowCnt, 1); // OWN 5칸 머지
                sheetObj.SetCellValue(i, "sheet1_jo_crr_cd", "", 0);
                sheetObj.SetRowBackColor(i,"#FCDCEE");
                sheetObj.SetCellFontBold(i, "sheet1_jo_crr_cd", 1);
                sheetObj.SetCellFontBold(i, "sheet1_locl_curr_cd", 1);
                sheetObj.SetCellFontBold(i, "sheet1_inv_rev_act_amt", 1);
                sheetObj.SetCellFontBold(i, "sheet1_inv_exp_act_amt", 1);
                sheetObj.SetCellFontBold(i, "sheet1_stl_rev_act_amt", 1);
                sheetObj.SetCellFontBold(i, "sheet1_stl_exp_act_amt", 1);
                /*
                if(iMergeRowCnt > 1){
                    for(var j=1; j< iMergeRowCnt; j++){
                        var iRow = i+j;
                        sheetObj.SetRowBackColor(iRow,"#FCDCEE");
                        sheetObj.SetCellFontBold(iRow, "sheet1_jo_crr_cd", 1);
                        sheetObj.SetCellFontBold(iRow, "sheet1_locl_curr_cd", 1);
                        sheetObj.SetCellFontBold(iRow, "sheet1_inv_rev_act_amt", 1);
                        sheetObj.SetCellFontBold(iRow, "sheet1_inv_exp_act_amt", 1);
                        sheetObj.SetCellFontBold(iRow, "sheet1_stl_rev_act_amt", 1);
                        sheetObj.SetCellFontBold(iRow, "sheet1_stl_exp_act_amt", 1);
                    }
                }
                
                break;
                */
            }
        }
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

/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
    return true;
}

function resizeSheet() {
    ComResizeSheet(sheetObjects[0]);
}