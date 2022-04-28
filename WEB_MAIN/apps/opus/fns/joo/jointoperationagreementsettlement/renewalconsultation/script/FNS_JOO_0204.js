/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : FNS_JOO_0204.js
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
            case "btn_Save":
                doActionIBSheet(sheetObjects[0], formObj, IBSAVE);
                break;
            case "btn_Close":
            	comPopupOK();
                //ComClosePopup();  
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
    
    resizeSheet();
}
function initControl() {
    var formObj=document.form;
    
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
                var HeadTitle1="|Original CSR|Original Amount|Reverse Amount|Effective Date|Due Date|Description|";
                	HeadTitle1+="csr_offst_no|slp_tp_cd|slp_func_cd|slp_ofc_cd|slp_iss_dt|slp_ser_no|csr_tp_cd"
                var headCount=ComCountHeadTitle(HeadTitle1);
                SetConfig( { SearchMode:2, MergeSheet:7, Page:20, DataRowMerge:1 } );
                var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"}];
                InitHeaders(headers, info);
                var prefix = "sheet1_";
                
                var cols = [ 
                       {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName: "ibflag" },
                       {Type:"Text",      Hidden:0, Width:120,  Align:"Center",  ColMerge:1,   SaveName: "csr_no",         	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",     Hidden:0, Width:120,  Align:"Right",   ColMerge:0,   SaveName: "csr_locl_amt",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",     Hidden:0, Width:120,  Align:"Right",   ColMerge:0,   SaveName: "rvs_csr_locl_amt",   KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Date",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName: "eff_dt",             KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                       {Type:"Date",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName: "rqst_dt",            KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                       {Type:"Text",      Hidden:0, Width:150,  Align:"Left",    ColMerge:0,   SaveName: "csr_desc",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                       
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: "csr_offst_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: "slp_tp_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: "slp_func_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: "slp_ofc_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: "slp_iss_dt",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: "slp_ser_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: "csr_tp_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }
                        ];
                 
                InitColumns(cols);
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
            var param = FormQueryString(formObj);
                
            var sXml = sheetObj.GetSearchData("FNS_JOO_0204GS.do", param);
            sheetObj.LoadSearchData(sXml);
            ComOpenWait(false);
            break; 

        case IBSAVE: // save
            if (!validateForm(sheetObj, formObj, sAction)) {
                return;
            }
            sheetObj.SetWaitImageVisible(0);
            ComOpenWait(true);
            formObj.f_cmd.value = MULTI;
            var sParam = ComGetSaveString(sheetObjects, true, true);
                sParam += "&" + FormQueryString(formObj);
            var sXml = sheetObj.GetSaveData("FNS_JOO_0204GS.do", sParam);
            
            var tmpTransResultKey = ComGetEtcData(sXml, "TRANS_RESULT_KEY");
            
            if(tmpTransResultKey == "S"){
                sheetObj.LoadSaveData(sXml);
                ComOpenWait(false);
                
                ComFireEvent(ComGetObject("btn_Close") ,"click"); //Close 
            }else{
                ComOpenWait(false);
            }
            break;
    }
}
function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
    if (sheetObj.RowCount() > 0) {

    }
}

function sheet1_OnChange(sheetObj, Row, Col, Value, OldValue, RaiseFlag) {
    var formObj = document.form;
    var colName = sheetObj.ColSaveName(Col);
    switch (colName) {
        case "eff_dt" :
            /*
        	if(!getCheckSheetDateValidation(sheetObj, Row, Col, Value)) return;
        	
            var oldEffDt    = sheetObj.GetCellValue(Row, "eff_dt");
            var tmpOldEffDt = ComReplaceStr(oldEffDt,"-","").substring(0,6);
            
            var sXml        = doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC03, Row);

            var closFlg     = ComGetEtcData(sXml, "clos_yn");
            var effDt       = ComGetEtcData(sXml, "eff_dt");
            var tmpEffDt    = JooGetDateFormat(effDt,"ymd");
            
            if (closFlg=="C"){
                //마감이 되었고 이후의 최초 open된 것이 없다면 closed, and open item not exists ComReplaceStr("2008-01-01", "-", "")
                if (ComIsEmpty(ComTrim(effDt))){
                    ComShowCodeMessage("JOO00139", JooGetDateFormat(tmpOldEffDt,"ym"));
                    sheetObj.SetCellValue(Row, "eff_dt", "", 0);
                    return;                 
                }
                //마감이 되었고 user가 계속가고자 한다면 익월1일자로 setting closed, and user confirmed, setting next month 1 day
                if (ComShowCodeConfirm('JOO00107', JooGetDateFormat(oldEffDt,"ymd"), JooGetDateFormat(tmpEffDt,"ymd"))){
                    sheetObj.SetCellValue(Row, "eff_dt", tmpEffDt, 0);
                }else{
                    sheetObj.SetCellValue(Row, "eff_dt", "", 0);
                }
            //해당월도 마감전이고 이전월도 마감전이라면  before closing month, and before closing previous month
            }else if (closFlg=="X"){
                //Two or more un-closed month exist ! Do you want ignore it 
                //if (!ComShowCodeConfirm("JOO00140")){
                //  formObj.eff_dt.value="";
                //formObj.eff_dt.focus();
                //}
            //데이터가 아예 존재하지 않는 경우 in case of not existing data
            }else if (closFlg=="E"){
                ComShowCodeMessage("JOO00125", JooGetDateFormat(tmpOldEffDt,"ym"));
                sheetObj.SetCellValue(Row, "eff_dt", "", 0);
            }*/  
            break;
            
        case "rqst_dt" :
            
        	if(!getCheckSheetDateValidation(sheetObj, Row, Col, Value)) return;
        	
        	break;
    }
}

function GetCheckPeriod(sFrDate, sToDate){
    sFrDate = getArgValue(ComGetUnMaskedValue(sFrDate   , "ymd"));
    sToDate = getArgValue(ComGetUnMaskedValue(sToDate   , "ymd"));
    
    //2.from, to 날짜 비교
    var sFrYmd = sFrDate.substring(0,8);
    var sToYmd = sToDate.substring(0,8);
    if(ComChkPeriod(sFrYmd, sToYmd) < 1) {
        return false;
    }
    
    return true;
}

function getCheckSheetDateValidation(sheetObj,Row, Col, Value) {
	var formObj = document.form;
    var colName = sheetObj.ColSaveName(Col);
    var msg = "";
    switch (colName) {
        case "eff_dt" :
            var effDate = getArgValue(ComGetUnMaskedValue(Value   , "ymd"));
            if(!ComIsDate(effDate)){
            	msg = ComGetMsg("JOO00224", "effective date"); //Please check the {?msg1}.
            	ComShowMessage(msg);
            	return false;
                //sheetObj.ValidateFail(2, msg);
            }
            
            var tmpRqstDt   = sheetObj.GetCellValue(Row, "rqst_dt");
            if(!ComIsEmpty(effDate) && !ComIsEmpty(tmpRqstDt)){
                if(!GetCheckPeriod(effDate, tmpRqstDt)){
                	msg = ComGetMsg("JOO00211", "effective date", "due date");
                	ComShowMessage(msg);
                	return false;
                    //sheetObj.ValidateFail(2, msg);
                }
            }
            break;
        case "rqst_dt" :
            if(ComIsEmpty(Value)) return false;
            
            var rqstDate        = getArgValue(ComGetUnMaskedValue(Value   , "ymd"));
            if(!ComIsDate(rqstDate)){
            	msg = ComGetMsg("JOO00224", "due date");
            	ComShowMessage(msg);
            	return false;
                //sheetObj.ValidateFail(2, msg); 
            }
            
            var tmpEffDt    = sheetObj.GetCellValue(Row, "eff_dt");
            if(!ComIsEmpty(tmpEffDt) && !ComIsEmpty(rqstDate)){
                if(!GetCheckPeriod(tmpEffDt, rqstDate)){
                	msg = ComGetMsg("JOO00211", "effective date", "due date");
                	ComShowMessage(msg);
                	return false;
                    //sheetObj.ValidateFail(2, msg);
                }
            }
            
            break;
    }
    
    return true;
}

/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
    sheetObj.ShowDebugMsg(false);
    switch (sAction) {
	    case IBSEARCH: //retrieve
	    	break;
        case IBSAVE: //save
            if (sheetObj.RowCount() > 0) {
                var iHeadRow = sheetObj.HeaderRows();
                var iLastRow = sheetObj.LastRow();
            
                for(var i=iHeadRow ; i <= iLastRow ; i++ ){
                    var tmpEffDt        = sheetObj.GetCellValue(i, "eff_dt");
                    var tmpRqstDt       = sheetObj.GetCellValue(i, "rqst_dt");
                    var tmpCsrDesc      = sheetObj.GetCellValue(i, "csr_desc");
                                       
                    if(ComIsEmpty(tmpEffDt)){
                        ComShowCodeMessage("JOO00101");//Please input  Eff.Date
                        sheetObj.SelectCell(i, "eff_dt");
                        return false;
                    }
                    if(ComIsEmpty(tmpRqstDt)){
                        ComShowCodeMessage("JOO00102");//Please input  Due Date.
                        sheetObj.SelectCell(i, "rqst_dt");
                        return false;
                    }
                    if(ComIsEmpty(tmpCsrDesc)){
                        ComShowCodeMessage("JOO00097");//Please input  description.
                        sheetObj.SelectCell(i, "csr_desc");
                        return false;
                    }
                    
                    //Effective Date < Due Date
                    if (tmpEffDt > tmpRqstDt){
                        ComShowCodeMessage("JOO00176");
                        return false;
                    }
                }
            }else{
                ComShowCodeMessage('JOO00036');
                return false;
            }

            if (!ComShowCodeConfirm("JOO00046")){
                return false;
            }
            
            break;
    }
    return true;
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