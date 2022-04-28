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
var gGenPayTermCd = "";
var gInvIssDt = "";

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
                initAllSheetRemove();
                formObj.rqst_dt.value="";
                formObj.inv_iss_dt.value="";
                doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
                break;
            case "btn_New":
                initPeriod();
                initAllSheetRemove();
                comboObjects[0].SetSelectIndex(0);
                comboObjects[1].SetSelectIndex(-1, false);
                comboObjects[2].SetSelectIndex(0);
                comboObjects[3].SetSelectIndex(-1, false);
                formObj.rqst_dt.value="";
                formObj.inv_iss_dt.value="";
                doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
                break;
            case "btn_Delete":
                var sUrl = "/opuscntr/FNS_JOO_0106.do";
                /*sUrl += "?fr_rev_yrmon="+fr_rev_yrmon;
                sUrl += "&to_rev_yrmon="+to_rev_yrmon;
                sUrl += "&jo_crr_cd="+jo_crr_cd;
                sUrl += "&trd_cd="+trd_cd;
                sUrl += "&rlane_cd="+rlane_cd;
                sUrl += "&jo_stl_itm_cds="+jo_stl_itm_cds;
                sUrl += "&rev_vvd="+rev_vvd;*/
            
                ComOpenPopup(sUrl, 1000, 700,"setInvDelete", "0,0", true, false, 0, 0, 0, "FNS_JOO_0106");
                //doActionIBSheet(sheetObjects[0], formObj, IBDELETE);
                break;
            case "btn_Save":
                doActionIBSheet(sheetObjects[0], formObj, IBSAVE);
                break;
            case "btn_DownExcel":
            	if(sheetObjects[1].RowCount() < 1){//no data
                    ComShowCodeMessage("COM132501");
                }else{
                	sheetObjects[0].Down2ExcelBuffer(true);
                	if(sheetObjects[0].RowCount() > 0){
                		sheetObjects[0].Down2Excel({SheetDesign:1, Merge:1, CheckBoxOnValue:"Y", CheckBoxOffValue:"N", AutoSizeColumn: 1, DownCols : makeHiddenSkipCol(sheetObjects[1]),FileName:'Invoice Create Excel',SheetName:'Master'});
                	}
                	if(sheetObjects[1].RowCount() >= 0){
                		sheetObjects[1].Down2Excel({SheetDesign:1, Merge:1, AutoSizeColumn: 1, DownCols : makeHiddenSkipCol(sheetObjects[1]),FileName:'Invoice Create Excel',SheetName:'Detail'});
                	}
    			   	sheetObjects[0].Down2ExcelBuffer(false);            	
                    /*
                    var paramObj = new Object();
                    paramObj.cols = 10;
                    var url = ComJooGetPgmTitle(sheetObjects[0], paramObj);
                    sheetObjects[0].Down2Excel({DownCols : makeHiddenSkipCol(sheetObjects[1]), SheetDesign : 1, Merge : 1});
                    */
                }
                break;
            case "btn_Print":
                rdOpen(formObj);
                break;              

            case "btn_vvd_from_back":
                UF_addMonth(formObj.fr_rev_yrmon, -1);
                initAllSheetRemove();
                break;
            case "btn_vvd_from_next":
                if (!GetCheckConditionPeriod()){
                    ComShowCodeMessage("JOO00078");
                    return;
                }
                UF_addMonth(formObj.fr_rev_yrmon, +1);
                initAllSheetRemove();
                break;
            case "btn_vvd_to_back":
                if (!GetCheckConditionPeriod()){
                    ComShowCodeMessage("JOO00078");
                    return;
                }
                UF_addMonth(formObj.to_rev_yrmon, -1);
                initAllSheetRemove();
                break;
            case "btn_vvd_to_next":
                UF_addMonth(formObj.to_rev_yrmon, +1);
                initAllSheetRemove();
                break;
            case "btn_GoToStl":
                var params      = "parentPgmNo=FNS_JOO_M001&moved_from=0201&pgmNo=FNS_JOO_0201";
                this.location   = "/opuscntr/FNS_JOO_0201.do?" + params;
                break;
            case "btn_SlipCreate":
                var sUrl = "/opuscntr/FNS_JOO_0103Pop.do?pop_mode=Y";
                /*sUrl += "?fr_rev_yrmon="+fr_rev_yrmon;
                sUrl += "&to_rev_yrmon="+to_rev_yrmon;
                sUrl += "&jo_crr_cd="+jo_crr_cd;
                sUrl += "&trd_cd="+trd_cd;
                sUrl += "&rlane_cd="+rlane_cd;
                sUrl += "&jo_stl_itm_cds="+jo_stl_itm_cds;
                sUrl += "&rev_vvd="+rev_vvd;*/
            
                ComOpenPopup(sUrl, 1000, 700,"setCsrCreate", "0,0", true, false, 0, 0, 0, "FNS_JOO_0103");
            
                /*var fr_rev_yrmon    = ComGetObjValue(form.fr_rev_yrmon);
                var to_rev_yrmon    = ComGetObjValue(form.to_rev_yrmon);
                var jo_crr_cd       = "";
                var trd_cd          = "";
                var rlane_cd        = "";
                var jo_stl_itm_cds  = "";
                var rev_vvd         = "";
                
                var sUrl = "/opuscntr/FNS_JOO_0104.do";
                    sUrl += "?fr_rev_yrmon="+fr_rev_yrmon;
                    sUrl += "&to_rev_yrmon="+to_rev_yrmon;
                    sUrl += "&jo_crr_cd="+jo_crr_cd;
                    sUrl += "&trd_cd="+trd_cd;
                    sUrl += "&rlane_cd="+rlane_cd;
                    sUrl += "&jo_stl_itm_cds="+jo_stl_itm_cds;
                    sUrl += "&rev_vvd="+rev_vvd;
                
                ComOpenPopup(sUrl, 1000, 700,"setInvoiceAutoCreate", "0,0", true, false, 0, 0, 0, "FNS_JOO_0104");*/
                break;
            case "btn_InvoiceReport":
            	var params    = "parentPgmNo=FNS_JOO_M001&pgmNo=FNS_JOO_0109&pop_flg=N" ;
            	ComOpenPopup("FNS_JOO_0109.do?"+params, 840, 900, "", '1,0', false);
            	break;
            case "btnRqstDt":
            	var cal=new ComCalendar();
				cal.select(form.rqst_dt, 'yyyy-MM-dd');
            	break;
            case "btnInvIssDt":
            	var cal=new ComCalendar();
            	cal.setEndFunction("fnRelay");
				cal.select(form.inv_iss_dt, 'yyyy-MM-dd');
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
                // SetColWidth(0, "60");
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
            trd_cd.InsertItem(-1, "ALL|", "");    //ALL
            trd_cd.SetSelectIndex(0);
            
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
            var comboItems = gAuthOfcCdComboItems.split(ROWMARK);
            addComboItem(comboObj, comboItems);
            comboObj.SetSelectIndex(0,false);
            if (comboItems.length == 1){
                comboObj.SetEnable(0);
            }else{
                comboObj.SetEnable(1);
            }
            break;
        case "re_divr_cd": 
            with (comboObj) { 
                SetMultiSelect(0);
                SetUseAutoComplete(1);
                SetColAlign(0, "left");
                SetColWidth(0, "90");
                SetDropHeight(160);
                ValidChar(2,1);//only upper case
                SetMaxLength(7);
            }
            comboObj.RemoveAll();
            comboObj.InsertItem(0, "","");
            comboObj.InsertItem(1, "EXPENSE","E");
            comboObj.InsertItem(2, "REVENUE","R");
            break;
        case "locl_curr_cd": 
            with (comboObj) { 
                SetMultiSelect(0);
                SetUseAutoComplete(1);
                SetColAlign(0, "left");
                SetColWidth(0, "55");
                SetDropHeight(160);
                ValidChar(2,1);//only upper case
                SetMaxLength(7);
            }
            comboObj.RemoveAll();
            var comboItems = gCurrencyCdComboItems.split(ROWMARK);
            addComboItem(comboObj, comboItems);
            comboObj.SetSelectCode(gCurrencyUSD);
            break;
        case "jo_stl_itm_cds":
        	with (comboObj) {
        		SetMultiSelect(true);
        		SetMultiSeparator(",");  // add 
        		SetUseAutoComplete(1);
        		SetColAlign(0, "left");
        		SetColWidth(0, "80");
        		ValidChar(2, 1); // Uppercase
        		SetDropHeight(170);
        		SetMaxLength(7);
        		}
        	
        	comboObj.InsertItem(-1, "ALL|", "ALL");    //ALL
        	var comboItems = gSettlementItemComboItems.split(ROWMARK);
        	
        	for (var i=0 ; i < comboItems.length ; i++) {
                comboItem=comboItems[i].split(FIELDMARK);
                comboObj.InsertItem(-1, comboItem[0], comboItem[0]);
            }
        	comboObj.SetSelectIndex(0);
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
    //doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}
function initControl() {
    var formObject=document.form;   

    /*
    TO : 현재 월
    FR : 현재 월 - 2 : 3개월전.
    */ 
    initPeriod();  
    doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC02);
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
                //var HeadTitle1="|Partner|Lane|Curr.|Revenue|Expense|Combined for Invoice|Invoice Month|dtl_grp_key";
                var HeadTitle1="|Partner|Lane|Curr.|Revenue|Expense|Invoice\nTarget|Partner|Partner|acctg_crr_cd|Invoice Month|dtl_grp_key|cre_inv_grp_key|rqst_dt|inv_iss_dt";
                var HeadTitle2="|Partner|Lane|Curr.|Revenue|Expense|Invoice\nTarget|Customer|S. Provider|acctg_crr_cd|Invoice Month|dtl_grp_key|cre_inv_grp_key|rqst_dt|inv_iss_dt";
                var headCount=ComCountHeadTitle(HeadTitle1);
                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
                var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"}, { Text:HeadTitle2, Align:"Center"}];
                InitHeaders(headers, info);
                var prefix = "sheet1_";
                
                var cols = [ 
                       {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName: prefix + "ibflag" },
                       {Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName: prefix + "jo_crr_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName: prefix + "rlane_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName: prefix + "locl_curr_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",     Hidden:0, Width:100,   Align:"Right",   ColMerge:0,   SaveName: prefix + "stl_rev_act_amt",KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",     Hidden:0, Width:100,   Align:"Right",   ColMerge:0,   SaveName: prefix + "stl_exp_act_amt",KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"CheckBox",  Hidden:0, Width:100,   Align:"Center",  ColMerge:0,   SaveName: prefix + "chk_cmb_flg" },
                       {Type:"Text",      Hidden:0, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "cust_nm",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },   
                       {Type:"Text",      Hidden:0, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "vndr_nm",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName: prefix + "acctg_crr_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },   
                       {Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName: prefix + "acct_yrmon",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName: prefix + "dtl_grp_key",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName: prefix + "cre_inv_grp_key",KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName: prefix + "rqst_dt",	 	KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName: prefix + "inv_iss_dt",	 	KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName: prefix + "gen_pay_term_cd",KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }
                        ];
                 
                InitColumns(cols);
                //SetColProperty(0    ,  prefix + "acctg_crr_cd"   , {ComboText:"|"+gAcctgCrrNmComboItems, ComboCode:"|"+gAcctgCrrCdComboItems} );
                //SetColProperty(0    ,  prefix + "acctg_crr_cd"   , {AcceptKeys:"E"   , InputCaseSensitive:1});
                SetEditable(1);
                SetShowButtonImage(1);
             }
            break;
        case "sheet2": // t1sheet1 init     //t1sheet1 init
            with(sheetObj){
                var HeadTitle1="|Lane|Item|Revenue|Revenue|Expense|Expense|Remark";
                    HeadTitle1+="|VVD|VVD|VVD|Rev.Dir|Rev.Month|STL.Seq.|Partner|BSA|Curr.|Rev/Exp|dtl_grp_key";
                var HeadTitle2="|Lane|Item|VVD|Amount|VVD|Amount|Remark";
                    HeadTitle2+="|VVD|VVD|VVD|Rev.Dir|Rev.Month|STL.Seq.|Partner|BSA|Curr.|Rev/Exp|dtl_grp_key";
                var headCount=ComCountHeadTitle(HeadTitle1);
                //SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );
                var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"},  { Text:HeadTitle2, Align:"Center"} ];
                InitHeaders(headers, info);
                
                var prefix = "sheet2_";
                var cols = [ 
                       {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName: prefix + "ibflag" },
                       {Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName: prefix + "rlane_cd",       KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName: prefix + "jo_stl_itm_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName: prefix + "rev_vvd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       //{Type:"AutoSum",   Hidden:0, Width:90,   Align:"Right",   ColMerge:0,   SaveName: prefix + "rev_act_amt",    KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",     Hidden:0, Width:90,   Align:"Right",   ColMerge:0,   SaveName: prefix + "rev_act_amt",    KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName: prefix + "exp_vvd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       //{Type:"AutoSum",   Hidden:0, Width:90,   Align:"Right",   ColMerge:0,   SaveName: prefix + "exp_act_amt",    KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",     Hidden:0, Width:90,   Align:"Right",   ColMerge:0,   SaveName: prefix + "exp_act_amt",    KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:50,   Align:"Left",    ColMerge:0,   SaveName: prefix + "stl_rmk",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,   Align:"Center",  ColMerge:0,   SaveName: prefix + "vsl_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,   Align:"Center",  ColMerge:0,   SaveName: prefix + "skd_voy_no",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,   Align:"Center",  ColMerge:0,   SaveName: prefix + "skd_dir_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,   Align:"Center",  ColMerge:0,   SaveName: prefix + "rev_dir_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,   Align:"Center",  ColMerge:0,   SaveName: prefix + "rev_yrmon",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,   Align:"Center",  ColMerge:0,   SaveName: prefix + "stl_vvd_seq",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,   Align:"Center",  ColMerge:0,   SaveName: prefix + "jo_crr_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,   Align:"Center",  ColMerge:0,   SaveName: prefix + "jo_stl_jb_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,   Align:"Center",  ColMerge:0,   SaveName: prefix + "locl_curr_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,   Align:"Center",  ColMerge:0,   SaveName: prefix + "re_divr_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,   Align:"Center",  ColMerge:0,   SaveName: prefix + "dtl_grp_key",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }
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
            var aryPrefix = new Array("sheet1_"); // prefix
            var param = FormQueryString(formObj);
                param += "&" + ComGetPrefixParam(aryPrefix);
                
            var sXml = sheetObj.GetSearchData("FNS_JOO_0102GS.do", param);
            sheetObj.LoadSearchData(sXml);
            ComOpenWait(false);
            break;
        case IBSEARCH_ASYNC01: // retrieve  Detail          
            formObj.f_cmd.value = SEARCH01;
            if (!validateForm(sheetObj, formObj, sAction)) {
                return;
            }
            ComOpenWait(true);
            var aryPrefix = new Array("sheet2_"); // prefix
            var selRow  = sheetObjects[0].GetSelectRow();
            var param = FormQueryString(formObj);
                param += "&" + ComGetPrefixParam(aryPrefix);
                param += "&jo_crr_cd="      + sheetObjects[0].GetCellValue(selRow, "sheet1_jo_crr_cd");
                param += "&rlane_cd="       + sheetObjects[0].GetCellValue(selRow, "sheet1_rlane_cd");
                param += "&locl_curr_cd="   + sheetObjects[0].GetCellValue(selRow, "sheet1_locl_curr_cd");                
            var sXml = sheetObj.GetSearchData("FNS_JOO_0102GS.do", param);
            sheetObj.LoadSearchData(sXml,{Append:1 , Sync:1});
            ComOpenWait(false);
            break;
        case IBSEARCH_ASYNC02: // Get List Trade Code By Carrier Code
            formObj.f_cmd.value = SEARCH26; //SEARCH24;
            var joCrrCds = jo_crr_cds.GetSelectCode();
            var param = FormQueryString(formObj);
                param += "&super_cds1=" + joCrrCds; //북수형
            
            var sXml = sheetObj.GetSearchData("JOOCommonGS.do", param);
            //ComXml2ComboItem(sXml, trd_cd, "code", "code");
            
            var tmpTrdCds      = ComGetEtcData(sXml, "trd_cds");
            trd_cd.RemoveAll();
            if (ComTrim(tmpTrdCds) != ""){
                var comboItems=tmpTrdCds.split(ROWMARK);
                var comboItem="";
                trd_cd.InsertItem(-1, "ALL|", "");    //ALL
                for (var i=0 ; i < comboItems.length ; i++) {
                    comboItem=comboItems[i].split(FIELDMARK);
                    trd_cd.InsertItem(-1, comboItem[0], comboItem[0]);
                }
                trd_cd.SetSelectIndex(0);
            }else{
            	trd_cd.InsertItem(-1, "ALL|", "");    //ALL
            }
            trd_cd.SetSelectIndex(0);
            
            
            break;
        case IBSAVE: // save
            if (!validateForm(sheetObj, formObj, sAction)) {
                return;
            }
            sheetObj.SetWaitImageVisible(0);
            ComOpenWait(true);
            formObj.f_cmd.value = MULTI;
            // Due Date (rqst_dt), Issue Date Setting
            var chkRows = sheetObjects[0].FindCheckedRow("sheet1_chk_cmb_flg");
            var arrChkRow = chkRows.split("|");
            
            for(idx=0; idx<arrChkRow.length; idx++){
            	sheetObjects[0].SetCellValue(arrChkRow[idx], "sheet1_rqst_dt", document.form.rqst_dt.value.replaceStr("-","") , 0);
            	sheetObjects[0].SetCellValue(arrChkRow[idx], "sheet1_inv_iss_dt", document.form.inv_iss_dt.value.replaceStr("-","") , 0);
            }
            
            var aryPrefix=new Array( "sheet1_" ,"sheet2_");
            var sParam = ComGetSaveString(sheetObjects, true, true);
                sParam += "&" + FormQueryString(formObj);
                sParam += "&" + ComGetPrefixParam(aryPrefix);
            var sXml = sheetObj.GetSaveData("FNS_JOO_0102GS.do", sParam);
            
            sheetObj.LoadSaveData(sXml);
            initAllSheetRemove();
            formObj.rqst_dt.value="";
            formObj.inv_iss_dt.value="";
            doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
            ComOpenWait(false);
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
        /*
    	var iHeadRow = sheetObj.HeaderRows();
        var iLastRow = sheetObj.LastRow();
        
        for(var i=iHeadRow ; i <= iLastRow ; i++ ){
            SetSheetComboText(sheetObj, i, "sheet1_acctg_crr_cd");
        }
        */
    }
}
function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
    if (sheetObj.RowCount() > 0) {

    }
}
function sheet1_OnSelectCell(sheetObj, OldRow, OldCol, NewRow, NewCol) {
}
function sheet1_OnChange(sheetObj, Row, Col, Value, OldValue, RaiseFlag) {    
    var formObj = document.form;
    var colName = sheetObj.ColSaveName(Col);
    switch(colName){
        case "sheet1_chk_cmb_flg":
            SetSheetInvoiceDetail(sheetObj, Row, Value);
            break;
        /*    
        case "sheet1_acctg_crr_cd":
            //Actual Payer/Reciver Carrier, Customer, Service Provider 체크 함.
            var chkCmbFlg = sheetObj.GetCellValue(Row, "sheet1_chk_cmb_flg");
            if(chkCmbFlg == "1"){
                if(!GetIsActualPayerOrReciverChecked(sheetObj, Row, Value)){
                    ComShowCodeMessage('JOO00210');//Can't make an invoice with different partners.
                    
                    //기존 값으로 돌린다.
                    sheetObj.SetCellValue(Row, "sheet1_acctg_crr_cd", OldValue, 1);
                    return false;
                }
            }
            SetSheetComboText(sheetObj, Row, colName);
            break;
        */
    }
}
function sheet1_OnBeforeCheck(sheetObj, Row, Col) {
    var formObj = document.form;
    var colName = sheetObj.ColSaveName(Col);
    switch(colName){
        case "sheet1_chk_cmb_flg":
            var selLoclCurrCd = sheetObj.GetCellValue(Row, "sheet1_locl_curr_cd");
            if(!GetIsCurrencyChecked(sheetObj, Row, selLoclCurrCd)){
                ComShowCodeMessage('JOO00189');//Can not selected a different exchange currency. >> Please check the currency.\nEach different currency cant't be invoiced.
                sheetObj.SetAllowCheck(0);//체크를 막는다.

            }else{
            	//동일 Carrier, Customer, Service Provider 체크 함.
                var selCreInvGrpKey   = sheetObj.GetCellValue(Row, "sheet1_cre_inv_grp_key");
                if(!GetIsMultiPartnerChecked(sheetObj, Row, selCreInvGrpKey)){
                    ComShowCodeMessage('JOO00210');//Can't make an invoice with different partners.
                    sheetObj.SetAllowCheck(0);//체크를 막는다.
                }else{
                    sheetObj.SetAllowCheck(1);//반드시 else인 경우에는 체크를 열어줘야 한다.
                }
                //sheetObj.SetAllowCheck(1);//반드시 else인 경우에는 체크를 열어줘야 한다.
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
    sText = sheetObj.GetCellText(Row,selColName)
    if(sText != ""){
        sheetObj.SetToolTipText(Row,Col,sText);
    }
}

function setShowFooterRow(){
	var sheetObj = sheetObjects[1];
	if (sheetObj.RowCount() > 0) {
		var iRevActAmt = sheetObj.ComputeSum('|sheet2_rev_act_amt|');
		var iExpActAmt = sheetObj.ComputeSum('|sheet2_exp_act_amt|');
	
		var balanceAmt = Math.abs(JooComGetRound(iRevActAmt - iExpActAmt, 2));
		/*
		var varAmountText  = "Revenue :"+ComAddComma2(iRevActAmt, "#,###.00") +"  ";
		    varAmountText += "Expense :"+ComAddComma2(iExpActAmt, "#,###.00") +"  ";
		    varAmountText += " = Balance :"+ComAddComma2(balanceAmt, "#,###.00") +"  ";
		
		var varAmountText  = "Revenue :"+ComGetMaskedValue(iRevActAmt, "float") +"  ";
		    varAmountText += "Expense :"+ComGetMaskedValue(iExpActAmt, "float") +"  ";
		    varAmountText += " = Balance :"+ComGetMaskedValue(balanceAmt, "float") +"  ";
		*/    
		    
		sheetObj.RenderSheet(0);
		sheetObj.ShowFooterRow([{
			"sheet2_rlane_cd": "Total",
			"sheet2_rlane_cd#ColSpan": 2, 
	        "sheet2_rlane_cd#FontBold": 1,
	        "sheet2_rlane_cd#FontColor": "Blue",
			"sheet2_rev_vvd": "Total",
			"sheet2_rev_vvd#ColSpan": 2,
			"sheet2_rev_vvd": iRevActAmt, 
	        "sheet2_rev_vvd#Align": "right", 
	        "sheet2_rev_vvd#Type": "Float",
	        "sheet2_rev_vvd#Format": "NullFloat",
	        "sheet2_rev_vvd#PointCount": 2,
	        "sheet2_rev_vvd#FontBold": 1,
	        "sheet2_rev_vvd#FontColor": "Blue",
			"sheet2_exp_vvd": iExpActAmt,
	        "sheet2_exp_vvd#ColSpan": 2, 
	        "sheet2_exp_vvd#Align": "right", 
	        "sheet2_exp_vvd#Type": "Float",
	        "sheet2_exp_vvd#Format": "NullFloat",
	        "sheet2_exp_vvd#PointCount": 2,
	        "sheet2_exp_vvd#FontBold": 1,
	        "sheet2_exp_vvd#FontColor": "Blue"
		    },
		    {
			"sheet2_rlane_cd": "Balance",
			"sheet2_rlane_cd#ColSpan": 2,
	        "sheet2_rlane_cd#FontBold": 1,
	        "sheet2_rlane_cd#FontColor": "Blue",
			"sheet2_rev_vvd": balanceAmt,
	        "sheet2_rev_vvd#ColSpan": 4, 
	        "sheet2_rev_vvd#Align": "right", 
	        "sheet2_rev_vvd#Type": "Float",
	        "sheet2_rev_vvd#Format": "NullFloat",
	        "sheet2_rev_vvd#PointCount": 2,
	        "sheet2_rev_vvd#FontBold": 1,
	        "sheet2_rev_vvd#FontColor": "Blue"
		    }/*,
		    {
			"sheet2_rlane_cd": varAmountText,
			"sheet2_rlane_cd#ColSpan": 7,
	        "sheet2_rlane_cd#Align": "Center", 
	        "sheet2_rlane_cd#Type": "Text",
	        "sheet2_rlane_cd#FontBold": 1,
	        "sheet2_rlane_cd#FontColor": "Blue"
		    }*/
		    ]);
		sheetObj.RenderSheet(1);
	}else{
		sheetObj.RemoveFooterRow();
	}
} 

function sheet2_OnSearchEnd(sheetObj, ErrMsg) {
	setShowFooterRow();
}
function GetIsCurrencyChecked(sheetObj, Row, selValue){
    var chkRows = sheetObj.FindCheckedRow("sheet1_chk_cmb_flg");
    
    if(chkRows == "") return true;
    var arrChkRow = chkRows.split("|");
    
    for(idx=0; idx<arrChkRow.length; idx++){
        var tmpLoclCurrCd = sheetObj.GetCellValue(arrChkRow[idx], "sheet1_locl_curr_cd");
        if(tmpLoclCurrCd != selValue){
            return false;
        }
    }
    return true;
}
function SetSheetInvoiceDetail(sheetObj, Row, selValue){
    var sheetDtlObj     = sheetObjects[1];
    
    var selGrpKey       = sheetObj.GetCellValue(Row, "sheet1_dtl_grp_key"); //e.g. APLLP1USD
    //var selAcctgCrrCd   = sheetObj.GetCellValue(Row, "sheet1_acctg_crr_cd");
    //var selGrpKey = selJoCrrCd + selRlaneCd + selLoclCurrCd;
    
    if(selValue == "1"){
        //Detail 정보를 조회 해 온다.- 기존 데이타에 Append 처리.
        doActionIBSheet(sheetDtlObj, document.form, IBSEARCH_ASYNC01);
        
        var nChkRow = sheetDtlObj.FindText("sheet2_dtl_grp_key", selGrpKey);
        
        if(nChkRow == -1){
            ComShowCodeMessage('JOO00143');//There is no data !
            sheetObj.SetCellValue(Row, "sheet1_chk_cmb_flg", 0, 0);
        } else {
        	gGenPayTermCd = sheetObj.GetCellValue(Row, "sheet1_gen_pay_term_cd");
        	setDueDtDefault();
        }
    }else{
        //Detail Sheet에 들어간 정보를 삭제한다.         
        if(!ComIsEmpty(selGrpKey)){
            sheetDtlObj.RenderSheet(0);
            var iHeadRow = sheetDtlObj.HeaderRows();
            var iLastRow = sheetDtlObj.LastRow();
            
            for (var idx=iLastRow; idx>=iHeadRow; idx--){
                var tmpDtlGrpKey = sheetDtlObj.GetCellValue(idx, "sheet2_dtl_grp_key");
                if(tmpDtlGrpKey == selGrpKey){
                    sheetDtlObj.RowDelete(idx, false);
                }
            }
            sheetDtlObj.RenderSheet(1);
            
            setShowFooterRow();
            gGenPayTermCd = ""; // init
        }
        
    }
}

function GetIsMultiPartnerChecked(sheetObj, Row, selCreInvGrpKey){
    var chkRows = sheetObj.FindCheckedRow("sheet1_chk_cmb_flg");
    if (chkRows == "") {
        //1건도 존재 하지 않으므로 skip
        return true;
    }
    //combined check된 Rows
    var arrChkRows      = chkRows.split("|"); //result : "1|3|5|"
    var condRedivrCd    = ComGetObjValue(form.re_divr_cd);
    
    // selCreInvGrpKey : APL^CN00001^123456
    // arrSelAcctgCrrCds[0] : Carrier, arrSelAcctgCrrCds[1] : Customer, arrSelAcctgCrrCds[2] : Service Provider
    
    for (var idx=0; idx<arrChkRows.length; idx++){
        var nRow            = arrChkRows[idx];
        
        if(Row == nRow) continue;
        
        var tmpCreInvGrpKey   = sheetObj.GetCellValue(nRow, "sheet1_cre_inv_grp_key");        
        if(selCreInvGrpKey != tmpCreInvGrpKey){
        	return false;
        }
        
        /*
        //Rev/Exp All 일대.
        if(ComIsEmpty(condRedivrCd)){
            if(selValue != tmpAcctgCrrCd) return false;
        }else if(condRedivrCd == "R"){
            //Carrier & Customer 비교
            var tmpSelRevValue  = arrSelAcctgCrrCds[0] + arrSelAcctgCrrCds[1];
            var tmpRevValue     = arrTmpAcctgCrrCds[0] + arrTmpAcctgCrrCds[1];
            if(tmpSelRevValue != tmpRevValue) return false;
            
        }else if(condRedivrCd == "E"){
            //Carrier & Service Provider 비교
            //Carrier & Customer 비교
            var tmpSelExpValue  = arrSelAcctgCrrCds[0] + arrSelAcctgCrrCds[2];
            var tmpExpValue     = arrTmpAcctgCrrCds[0] + arrTmpAcctgCrrCds[2];
            if(tmpSelExpValue != tmpExpValue) return false;
        }*/
    }
    
    return true;
    
}

/*
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
*/
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
    switch (sAction) {
	    case IBSEARCH:
	    	if(ComIsEmpty(formObj.locl_curr_cd)){
	    		//JOO00115 Please select  {?msg1}.
	    		ComShowCodeMessage("JOO00115", "Curr");
	    		return false;
	    	}
	    	break;
        case IBSAVE: //save

            if(sheetObjects[0].RowCount() < 1 ){
                ComShowCodeMessage("JOO00036");
                return false;
            }
            if(sheetObjects[1].RowCount() < 1 ){
                ComShowCodeMessage("JOO00036");
                return false;
            }
            if(ComIsEmpty(formObj.rqst_dt)){
                ComShowCodeMessage("JOO00102"); //Please input  Due Date.
                return false;
            }
            if(ComIsEmpty(formObj.inv_iss_dt)){
                ComShowCodeMessage("JOO00064"); //Please input  Issue Date.
                return false;
            }
            if (!ComShowCodeConfirm("JOO00046")){
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
    trd_cd.RemoveAll();

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

}
function auth_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){
    //변경된 Office cd에 해당하는 Carrier, Trade, lane ComboItem을 재조회 한다.
    var formObj = document.form;
    initAllSheetRemove();
    jo_crr_cds.RemoveAll();
    trd_cd.RemoveAll();
    //rlane_cd.RemoveAll();
    
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
    for (i = 0; i < sheetObjects.length; i++) {
        ComResizeSheet(sheetObjects[i]);
    }
}
function initAllSheetRemove(){
    sheetObjects[0].RemoveAll();
    sheetObjects[1].RemoveAll();
    sheetObjects[1].RemoveFooterRow();
}
function blur_inv_iss_dt(obj) {
	if(ComIsDate(document.form.inv_iss_dt.value) && document.form.inv_iss_dt.value != gInvIssDt) {
		if(sheetObjects[1].RowCount() < 1) {
			gGenPayTermCd = "";
		}
		setDueDtDefault();
	}
	gInvIssDt = document.form.inv_iss_dt.value;
}
function setDueDtDefault() {
	var invIssDt = document.form.inv_iss_dt.value;
	var date = "";
	if(invIssDt != '' && gGenPayTermCd != '') {
		if("N" == gGenPayTermCd.charAt(0)){
			date = new Date(invIssDt.substr(0, 4), parseInt(invIssDt.substr(5, 2))+parseInt(1), 0);  // Get max date of next month
			if(gGenPayTermCd.slice(1) < date.getDate()){
				date.setDate(gGenPayTermCd.slice(1))
			}
		} else {
			date = new Date(invIssDt);
			date.setDate(date.getDate() + parseInt(gGenPayTermCd));
		}
		
		document.form.rqst_dt.value = date.getFullYear() 
	    + "-" + ComLpad(date.getMonth()+1,2,"0") 
	    + "-" + ComLpad(date.getDate(),   2,"0");
	}
}

function fnRelay(){
	formObj = document.form;
	if(ComGetObjValue(formObj.inv_iss_dt) != ''){
		blur_inv_iss_dt(formObj.inv_iss_dt);
	}
}

