/*=========================================================
 *Copyright(c) 2018 CyberLogitec
 *@FileName : FNS_JOO_0209.js
 *@FileTitle : THEA CSR Creation
 *@author     : CLT
 *@version    : 1.0
 *@since      : 2018/06/27
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
                sheetObjects[0].RemoveAll();
                //comboObjects[0].SetSelectIndex(-1, false);
                comboObjects[0].SetSelectIndex(0);
                comboObjects[1].SetSelectIndex(0);
                
                doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
                break;
            case "btn_Save":
                doActionIBSheet(sheetObjects[0], formObj, IBSAVE);
                break;
            case "btn_DownExcel":  
                if(sheetObjects[0].RowCount() < 1){//no data
                    ComShowCodeMessage("COM132501");
                }else{
                    sheetObjects[0].Down2Excel({DownCols : makeHiddenSkipCol(sheetObjects[0]),SheetDesign : 1,Merge : 1});
                }
                break;
            case "btn_Print":
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
            var comboItems = gAuthOfcCdComboItems.split("|");
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
    //doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
    
    resizeSheet();
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
                var HeadTitle1="|GRP NO|CHK|THEA\nInvoice No|Invoice No|Partner|Customer/S.Provider|Customer/S.Provider|Curr.|Rev\nExp|Original\nAmount|Adjust\nAmount|Net Amount|Effective\nDate|Due Date|Description";
                    HeadTitle1+="|||||||||||||||";//16개
                    HeadTitle1+="||";//5개
                var HeadTitle2="|GRP NO|CHK|THEA\nInvoice No|Invoice No|Partner|Code|Name|Curr.|Rev\nExp|Original\nAmount|Adjust\nAmount|Net Amount|Effective\nDate|Due Date|Description";
                    HeadTitle2+="|||||||||||||||";//16개
                    HeadTitle2+="||";//5개
                var headCount=ComCountHeadTitle(HeadTitle1);
                SetConfig( { SearchMode:2, MergeSheet:7, Page:20, DataRowMerge:1 } );
                var info    = { Sort:0, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"} ,  { Text:HeadTitle2, Align:"Center"}];
                InitHeaders(headers, info);
                var prefix = "sheet1_";
                
                var cols = [ 
                       {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName: prefix + "ibflag" },
                       {Type:"Text",      Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName: prefix + "grp_inv_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"CheckBox",  Hidden:0, Width:55,   Align:"Center",  ColMerge:1,   SaveName: prefix + "chk_csr_flg" },
                       {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName: prefix + "thea_inv_no",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName: prefix + "inv_no",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName: prefix + "jo_crr_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:70,   Align:"Center",  ColMerge:0,   SaveName: prefix + "prnr_ref_no",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:120,  Align:"Left",    ColMerge:0,   SaveName: prefix + "cust_vndr_eng_nm",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:45,   Align:"Center",  ColMerge:0,   SaveName: prefix + "locl_curr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Combo",     Hidden:0, Width:45,   Align:"Center",  ColMerge:0,   SaveName: prefix + "re_divr_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",     Hidden:0, Width:90,   Align:"Right",   ColMerge:0,   SaveName: prefix + "tot_amount",         KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",     Hidden:0, Width:90,   Align:"Right",   ColMerge:0,   SaveName: prefix + "adj_amount",         KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",     Hidden:0, Width:90,   Align:"Right",   ColMerge:0,   SaveName: prefix + "thea_tot_amount",         KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Date",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName: prefix + "eff_dt",             KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                       {Type:"Date",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName: prefix + "rqst_dt",            KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:150,  Align:"Left",    ColMerge:0,   SaveName: prefix + "csr_desc",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 ,	EditLen:100 },
                       
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Right",   ColMerge:0,   SaveName: prefix + "cust_vndr_cnt_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Right",   ColMerge:0,   SaveName: prefix + "cust_vndr_seq",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "acct_yrmon",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },   
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "ar_ap_div_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },   
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "csr_offst_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "issuer_id",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "slp_iss_ofc_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "slp_iss_rgn_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "slp_tp_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "slp_func_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "slp_ofc_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "slp_iss_dt",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "slp_ser_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "csr_tp_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "slp_iss_inter_co_cd",KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "iss_dt",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "evid_tp_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "offst_rev_amt",         KeyField:0,   CalcLogic:"",   Format:"",         UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "offst_exp_amt",         KeyField:0,   CalcLogic:"",   Format:"",         UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "offst_bal_amt",         KeyField:0,   CalcLogic:"",   Format:"",         UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "offst_amt",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "offst_flg",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }
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
                
            var sXml = sheetObj.GetSearchData("FNS_JOO_0209GS.do", param);
            sheetObj.LoadSearchData(sXml);
            ComOpenWait(false);
            break;        
       
        case IBSEARCH_ASYNC02: // Get List Trade Code By Carrier Code
                //formObj.f_cmd.value = SEARCHLIST06; //auth ofc
                //var param = FormQueryString(formObj) + "&super_cd1=" + code + "&auth_delcheck_yn=N";
                
                var param   = "f_cmd="+SEARCH15;
                    param   += "&super_cd1=";
                var sXml = sheetObj.GetSearchData("JOOCommonGS.do", param);
                ComXml2ComboItem(sXml, trd_cd, "code", "code");
                break;                

        case IBSEARCH_ASYNC03: //retrieving whether EFF_DT Close (EFF_DT ON_BLUR)
            formObj.f_cmd.value=SEARCH01;
            var param   = "f_cmd="+SEARCH01;
                param   += "&eff_dt="       +sheetObj.GetCellValue(cRow, "sheet1_eff_dt");
                param   += "&ar_ap_div_cd=" +sheetObj.GetCellValue(cRow, "sheet1_ar_ap_div_cd");
                param   += "&slp_ofc_cd="   +sheetObj.GetCellValue(cRow, "sheet1_slp_ofc_cd");
                
            var sXml    = sheetObj.GetSearchData("FNS_JOO_0209GS.do", param);
            
            return sXml;
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
            var sXml = sheetObj.GetSaveData("FNS_JOO_0209GS.do", sParam);
            
            var tmpTransResultKey = ComGetEtcData(sXml, "TRANS_RESULT_KEY");
            
            if(tmpTransResultKey == "S"){
                sheetObj.LoadSaveData(sXml);
                ComOpenWait(false);
                
                //팝업 호출일때만 처리함.
                if(gPopYn == "Y") openerObj.setRefresh();
                
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
            
            var joCrrCds    = ComGetEtcData(sXml, "jo_crr_cds");
            var trdCds      = ComGetEtcData(sXml, "trd_cds");
            var rlaneCds    = ComGetEtcData(sXml, "rlane_cds");            
            
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
    var formObj = document.form;
    var colName = sheetObj.ColSaveName(Col);
    var prefix = "sheet1_";
    switch (colName) {
	    case prefix + "chk_csr_flg":
	    	var iHeadRow = sheetObj.HeaderRows();
            var iLastRow = sheetObj.LastRow();
            var chkGrpInvNo = sheetObj.GetCellValue(Row, "sheet1_grp_inv_no");              
            
            for(var i=iHeadRow ; i <= iLastRow ; i++ ){
            	var tmpGrpInvNo    = sheetObj.GetCellValue(i, "sheet1_grp_inv_no");//Number > String 변환.
            	if(Row == i){
            		continue;
            	}else{
            		if(chkGrpInvNo == tmpGrpInvNo){
            			sheetObj.SetCellValue(i, "sheet1_chk_csr_flg", Value, 0);  
            		}
            	}
            }
	    	break;
        case prefix + "eff_dt" :
            
        	if(!getCheckSheetDateValidation(sheetObj, Row, Col, Value)) return;
        	
            var oldEffDt    = sheetObj.GetCellValue(Row, prefix +"eff_dt");
            var tmpOldEffDt = ComReplaceStr(oldEffDt,"-","").substring(0,6);
            
            var sXml        = doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC03, Row);

            var closFlg     = ComGetEtcData(sXml, "clos_yn");
            var effDt       = ComGetEtcData(sXml, "eff_dt");
            var tmpEffDt    = JooGetDateFormat(effDt,"ymd");
            
            if (closFlg=="C"){
                //마감이 되었고 이후의 최초 open된 것이 없다면 closed, and open item not exists ComReplaceStr("2008-01-01", "-", "")
                if (ComIsEmpty(ComTrim(effDt))){
                    ComShowCodeMessage("JOO00139", JooGetDateFormat(tmpOldEffDt,"ym"));
                    sheetObj.SetCellValue(Row, prefix +"eff_dt", "", 0);
                    return;                 
                }
                //마감이 되었고 user가 계속가고자 한다면 익월1일자로 setting closed, and user confirmed, setting next month 1 day
                if (ComShowCodeConfirm('JOO00107', JooGetDateFormat(oldEffDt,"ymd"), JooGetDateFormat(tmpEffDt,"ymd"))){
                    sheetObj.SetCellValue(Row, prefix +"eff_dt", tmpEffDt, 0);
                }else{
                    sheetObj.SetCellValue(Row, prefix +"eff_dt", "", 0);
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
                sheetObj.SetCellValue(Row, prefix +"eff_dt", "", 0);
            }  
            break;
            
        case prefix + "rqst_dt" :
            
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
        //ComShowMessage(ComGetMsg('JOO00211'), "Effective Date","Due Date"); //Please input Duration(From ~ To) exactly.
        return false;
    }
    
    return true;
}

function getCheckSheetDateValidation(sheetObj,Row, Col, Value) {
	var formObj = document.form;
    var colName = sheetObj.ColSaveName(Col);
    var prefix = "sheet1_";
    var msg = "";
    switch (colName) {
        case prefix + "eff_dt" :
            var effDate = getArgValue(ComGetUnMaskedValue(Value   , "ymd"));
            if(!ComIsDate(effDate)){
            	msg = ComGetMsg("JOO00224", "effective date"); //Please check the {?msg1}.
            	ComShowMessage(msg);
            	return false;
                //sheetObj.ValidateFail(2, msg);
            }
            
            var tmpRqstDt   = sheetObj.GetCellValue(Row, prefix+"rqst_dt");
            if(!ComIsEmpty(effDate) && !ComIsEmpty(tmpRqstDt)){
                if(!GetCheckPeriod(effDate, tmpRqstDt)){
                	msg = ComGetMsg("JOO00211", "effective date", "due date");
                	ComShowMessage(msg);
                	return false;
                    //sheetObj.ValidateFail(2, msg);
                }
            }
            break;
        case prefix + "rqst_dt" :
            var tmpChkCsrFlg    = sheetObj.GetCellValue(i, "sheet1_chk_csr_flg");
            
            if(ComIsEmpty(Value)) return false;
            
            var rqstDate        = getArgValue(ComGetUnMaskedValue(Value   , "ymd"));
            if(!ComIsDate(rqstDate)){
            	msg = ComGetMsg("JOO00224", "due date");
            	ComShowMessage(msg);
            	return false;
                //sheetObj.ValidateFail(2, msg); 
            }
            
            var tmpEffDt    = sheetObj.GetCellValue(Row, prefix+"eff_dt");
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

/*function sheet1_OnEditValidation(sheetObj,Row, Col, Value) { 
    var formObj = document.form;
    var colName = sheetObj.ColSaveName(Col);
    var prefix = "sheet1_";
    var msg = "";
    switch (colName) {
        case prefix + "eff_dt" :
            var effDate = getArgValue(ComGetUnMaskedValue(Value   , "ymd"));
            if(!ComIsDate(effDate)){
            	msg = ComGetMsg("JOO00224", "effective date"); //Please check the {?msg1}.
                sheetObj.ValidateFail(2, msg);
            }
            
            var tmpRqstDt   = sheetObj.GetCellValue(Row, prefix+"rqst_dt");
            if(!ComIsEmpty(effDate) && !ComIsEmpty(tmpRqstDt)){
                if(!GetCheckPeriod(effDate, tmpRqstDt)){
                	msg = ComGetMsg("JOO00211", "effective date", "due date");
                    sheetObj.ValidateFail(2, msg);
                }
            }
            break;
        case prefix + "rqst_dt" :
            var tmpChkCsrFlg    = sheetObj.GetCellValue(i, "sheet1_chk_csr_flg");
            
            if(ComIsEmpty(Value)) return;
            
            var rqstDate        = getArgValue(ComGetUnMaskedValue(Value   , "ymd"));
            if(!ComIsDate(rqstDate)){
            	msg = ComGetMsg("JOO00224", "due date");
                sheetObj.ValidateFail(2, msg); 
            }
            
            var tmpEffDt    = sheetObj.GetCellValue(Row, prefix+"eff_dt");
            if(!ComIsEmpty(tmpEffDt) && !ComIsEmpty(rqstDate)){
                if(!GetCheckPeriod(tmpEffDt, rqstDate)){
                	msg = ComGetMsg("JOO00211", "effective date", "due date");
                    sheetObj.ValidateFail(2, msg);
                }
            }
            
            break;
    }
}*/

/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
    sheetObj.ShowDebugMsg(false);
    switch (sAction) {
	    case IBSEARCH: //retrieve
	    	if (!GetCheckConditionPeriod()){
                ComShowCodeMessage("JOO00078");
                return false;
            }
			break;
        case IBSAVE: //save
            if (sheetObj.RowCount() > 0) {
                var iHeadRow = sheetObj.HeaderRows();
                var iLastRow = sheetObj.LastRow();
            
                var chkCsrFlgCnt = sheetObj.CheckedRows("sheet1_chk_csr_flg");
                if(chkCsrFlgCnt <= 0){
                    ComShowCodeMessage("JOO00117", "[CHK]");//Please check {?msg1}
                    return false;
                }                
                
                for(var i=iHeadRow ; i <= iLastRow ; i++ ){
                    var tmpChkCsrFlg    = sheetObj.GetCellValue(i, "sheet1_chk_csr_flg")+"";//Number > String 변환.
                    var tmpEffDt        = sheetObj.GetCellValue(i, "sheet1_eff_dt");
                    var tmpRqstDt       = sheetObj.GetCellValue(i, "sheet1_rqst_dt");
                    var tmpCsrDesc      = sheetObj.GetCellValue(i, "sheet1_csr_desc");
                    
                    if(!ComIsEmpty(tmpChkCsrFlg) && tmpChkCsrFlg == "1"){                    
                        if(ComIsEmpty(tmpEffDt)){
                            ComShowCodeMessage("JOO00101");//Please input  Eff.Date
                            sheetObj.SelectCell(i, "sheet1_eff_dt");
                            return false;
                        }
                        if(ComIsEmpty(tmpRqstDt)){
                            ComShowCodeMessage("JOO00102");//Please input  Due Date.
                            sheetObj.SelectCell(i, "sheet1_rqst_dt");
                            return false;
                        }
                        if(ComIsEmpty(tmpCsrDesc)){
                            ComShowCodeMessage("JOO00097");//Please input  description.
                            sheetObj.SelectCell(i, "sheet1_csr_desc");
                            return false;
                        }
                        
                        //Effective Date < Due Date
                        if (tmpEffDt > tmpRqstDt){
                            ComShowCodeMessage("JOO00176");
                            return false;
                        }
                    }                    
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
    var formObj = document.form;
    //trd_cd.RemoveAll();

}

/**
 * 
 * @param comboObj
 * @param value
 * @param text
 */
function trd_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {

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
//팝업에서 재호출 하기 위한 함수.
function setRefresh(){
    var formObj = document.form;
    doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}
function resizeSheet() {
    ComResizeSheet(sheetObjects[0]);
}