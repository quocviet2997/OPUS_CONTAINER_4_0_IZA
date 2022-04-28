/*=========================================================
 *Copyright(c) 2018 CyberLogitec
 *@FileName : FNS_JOO_0210.js
 *@FileTitle : THEA Invoice Inquiry
 *@author     : CLT
 *@version    : 1.0
 *@since      : 2018/10/17
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
var tabObjects=new Array();
var tabCnt=0 ;
var beforetab=1;
var tabLoad=new Array();
tabLoad[0]=0;
tabLoad[1]=0;

var ROWMARK="|";
var FIELDMARK=",";

// Event handler processing by button click event */
document.onclick = processButtonClick;
// Event handler processing by button name */
function processButtonClick() {
    /** *** setting sheet object **** */
    var sheetObject = getCurrentSheet();
    /** **************************************************** */
    var formObj = document.form;
    var doc = document.all;
    try {
        var srcName = ComGetEvent("name");
        if (ComGetBtnDisable(srcName))
            return false;
        switch (srcName) {
            case "btn_retrieve":
                sheetObject.RemoveAll();
                doActionIBSheet(sheetObject, formObj, IBSEARCH);
                break;
            case "btn_new":
                initPeriod();
                sheetObjects[0].RemoveAll();
                sheetObjects[1].RemoveAll();
                comboObjects[0].SetSelectIndex(0);
                comboObjects[1].SetSelectIndex(-1, false);
                comboObjects[2].SetSelectIndex(0);
                comboObjects[3].SetSelectIndex(-1, false);
                
                break;
            case "btn_downexcel":
                if(sheetObject.RowCount() < 1){//no data
                    ComShowCodeMessage("COM132501");
                    return;
                 }else{
                     var varSheetName = "Summary"
                     if(sheetObject.id=="t2sheet1"){
                         varSheetName = "Detail";
                     }
                     sheetObject.Down2Excel({DownCols : makeHiddenSkipCol(sheetObject), SheetDesign : 1, Merge : 1, SheetName : varSheetName});
                 }
                break;           

            case "btn_vvd_from_back":
                UF_addMonth(formObj.fr_acct_yrmon, -1);
                sheetObject.RemoveAll();
                break;
            case "btn_vvd_from_next":
                if (!GetCheckConditionPeriod()){
                    ComShowCodeMessage("JOO00078");
                    return;
                }
                UF_addMonth(formObj.fr_acct_yrmon, +1);
                sheetObject.RemoveAll();
                break;
            case "btn_vvd_to_back":
                if (!GetCheckConditionPeriod()){
                    ComShowCodeMessage("JOO00078");
                    return;
                }
                UF_addMonth(formObj.to_acct_yrmon, -1);
                sheetObject.RemoveAll();
                break;
            case "btn_vvd_to_next":
                UF_addMonth(formObj.to_acct_yrmon, +1);
                sheetObject.RemoveAll();
                break;
            case "btn_gotostl":
                var params      = "parentPgmNo=FNS_JOO_M001&pgmNo=FNS_JOO_0206";
                this.location   = "/opuscntr/FNS_JOO_0206.do?" + params;
                break;
            case "btn_invoicereport":
            	if(sheetObject.RowCount() > 0){//no data
            		var inv_no  = sheetObject.GetCellValue(sheetObject.GetSelectRow(), sheetObject.id+"_inv_no");
            		if (ComTrim(inv_no) != ""){
            			var params    = "parentPgmNo=FNS_JOO_M001&pgmNo=FNS_JOO_0211&inv_no="+inv_no ;
                    	ComOpenPopup("FNS_JOO_0211.do?"+params, 840, 900, "", '1,0', false);	
            		}
            	}
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
function getCurrentSheet(){
    var sheetObj=null;
    if(beforetab == 0){
        sheetObj=sheetObjects[0];
    }else{
        sheetObj=sheetObjects[1];
    }
    
    return sheetObj;
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
 * registering IBTab Object as list
 * adding process for list in case of needing batch processing with other items
 * defining list on the top of source
 */
function setTabObject(tab_obj){
    tabObjects[tabCnt++]=tab_obj;
}
/**
 * initializing Tab
 * setting Tab items
 */
function initTab(tabObj , tabNo) {
     switch(tabNo) {
         case 1:
            with (tabObj) {
                var cnt=0 ;
                InsertItem( "Summary" , "");
                InsertItem( "Detail" , "");
            }
         break;
     }
}
/**
 * Event when clicking Tab
 * activating selected tab items
 */
function tab1_OnChange(tabObj , nItem)
{
    var objs=document.all.item("tabLayer");
    objs[nItem].style.display="Inline";
    objs[beforetab].style.display="none";
    //--------------- important --------------------------//
    objs[beforetab].style.zIndex=objs[nItem].style.zIndex -1 ;
    //------------------------------------------------------//
    beforetab=nItem;
    
    if (beforetab == 0) {
        ComFireEvent(ComGetObject("btn_retrieve") ,"click");
    }else{
        ComFireEvent(ComGetObject("btn_retrieve") ,"click");
    }
    
    resizeSheet();
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
                SetColWidth(0, "150");
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
                ValidChar(2, 1); // Uppercase
                SetDropHeight(160);
                SetMaxLength(3);
            }
            break;
        case "auth_ofc_cd":
            with (comboObj) {
                SetMultiSelect(0);
                SetUseAutoComplete(1);
                SetColAlign(0, "left");
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
    for(k=0;k<tabObjects.length;k++){
        initTab(tabObjects[k],k+1);
        tabObjects[k].SetSelectedIndex(0);
    }
    
    // initializing IBMultiCombo
    for (var k = 0; k < comboObjects.length; k++) {
        initCombo(comboObjects[k], k + 1);
    }
    initControl();
    resizeSheet();
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
    
    var tmpToYm = ComGetNowInfo("ymd","-");
    formObj.to_acct_yrmon.value=JooGetDateFormat(tmpToYm,"ym");
    
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
        case "t1sheet1": // t1sheet1 init     //t1sheet1 init
            with(sheetObj){
                var HeadTitle1="|Partner|THEA Invoice|Lane|Invoice No|Slip No|Approved|Curr.|Revenue|Expense|Customer/S.Provider|Customer/S.Provider|cust_vndr_cnt_cd|cust_vndr_seq";
                var HeadTitle2="|Partner|THEA Invoice|Lane|Invoice No|Slip No|Approved|Curr.|Revenue|Expense|Code|Name|cust_vndr_cnt_cd|cust_vndr_seq";
                var headCount=ComCountHeadTitle(HeadTitle1);
                SetConfig( { SearchMode:0, MergeSheet:7, Page:500, DataRowMerge:0 } );
                var info    = { Sort:0, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"} ,  { Text:HeadTitle2, Align:"Center"}];
                InitHeaders(headers, info);
                var prefix = "t1sheet1_";
                
                var cols = [
    						{Type:"Status",	Hidden:1,	Width:0,	Align:"Center",	ColMerge:1,	SaveName:prefix+"ibflag"},
    						{Type:"Text", 	Hidden:0,	Width:55,	Align:"Center",	ColMerge:0,	SaveName:prefix+"jo_crr_cd",		KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text", 	Hidden:0,	Width:90,	Align:"Center",	ColMerge:1,	SaveName:prefix+"thea_inv_no",		KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text",	Hidden:0,	Width:70,	Align:"Center",	ColMerge:0,	SaveName:prefix+"rlane_cd",			KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text",	Hidden:0,	Width:90,	Align:"Center",	ColMerge:1,	SaveName:prefix+"inv_no",			KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text",	Hidden:0,	Width:120,	Align:"Center",	ColMerge:1,	SaveName:prefix+"csr_no",			KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text",	Hidden:0,	Width:90,	Align:"Center",	ColMerge:1,	SaveName:prefix+"apro_flg",			KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text",	Hidden:0,	Width:50,	Align:"Center",	ColMerge:0,	SaveName:prefix+"locl_curr_cd",		KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Float",	Hidden:0,	Width:120,	Align:"Right",	ColMerge:0,	SaveName:prefix+"inv_rev_act_amt",	KeyField:0,	CalcLogic:"",	Format:"NullFloat",	PointCount:2,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Float",	Hidden:0,	Width:120,	Align:"Right",	ColMerge:0,	SaveName:prefix+"inv_exp_act_amt",	KeyField:0,	CalcLogic:"",	Format:"NullFloat",	PointCount:2,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text",	Hidden:0,	Width:90,	Align:"Left",	ColMerge:0,	SaveName:prefix+"prnr_ref_no",		KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text",	Hidden:0,	Width:200,	Align:"Left",	ColMerge:0,	SaveName:prefix+"cust_vndr_eng_nm",	KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text", 	Hidden:1,	Width:90,	Align:"Left",	ColMerge:0,	SaveName:prefix+"cust_vndr_cnt_cd",	KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text",	Hidden:1,	Width:90,	Align:"Left",	ColMerge:0,	SaveName:prefix+"cust_vndr_seq",	KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0}
					];
                
                InitColumns(cols);
                SetCountPosition();
                SetEditable(1);
             }
            break;
        case "t2sheet1": // t2sheet1 init     //t2sheet1 init
            with(sheetObj){
                var HeadTitle1="|Partner|THEA Invoice|Lane|Invoice No|Slip No|Approved|Rev\nExp|Item|Curr.|Customer/S.Provider|Customer/S.Provider|Rev.VVD|Revenue|Expense|Remark|Udate User|Update Date";
                var HeadTitle2="|Partner|THEA Invoice|Lane|Invoice No|Slip No|Approved|Rev\nExp|Item|Curr.|Code|Name|Rev.VVD|Revenue|Expense|Remark|Udate User|Update Date";
                var headCount=ComCountHeadTitle(HeadTitle1);
                SetConfig( { SearchMode:2, MergeSheet:7, Page:50, DataRowMerge:0 } );
                var info    = { Sort:0, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"} ,  { Text:HeadTitle2, Align:"Center"}];
                InitHeaders(headers, info);
                var prefix = "t2sheet1_";
                
                var cols = [
    						{Type:"Status",	Hidden:1,	Width:0,	Align:"Center",	ColMerge:1,	SaveName:prefix + "ibflag"},
    						{Type:"Text",	Hidden:0,	Width:55,	Align:"Center",	ColMerge:0,	SaveName:prefix + "jo_crr_cd",			KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text",	Hidden:0,	Width:90,	Align:"Center",	ColMerge:1,	SaveName:prefix + "thea_inv_no",		KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text",	Hidden:0,	Width:70,	Align:"Center",	ColMerge:0,	SaveName:prefix + "rlane_cd",			KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text",	Hidden:0,	Width:90,	Align:"Center",	ColMerge:1,	SaveName:prefix + "inv_no",				KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text",	Hidden:0,	Width:120,	Align:"Center",	ColMerge:1,	SaveName:prefix + "csr_no",				KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text",	Hidden:0,	Width:65,	Align:"Center",	ColMerge:1,	SaveName:prefix + "apro_flg",			KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Combo",	Hidden:0,	Width:45,	Align:"Center",	ColMerge:0,	SaveName:prefix + "re_divr_cd",			KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text",	Hidden:0,	Width:55,	Align:"Center",	ColMerge:0,	SaveName:prefix + "jo_stl_itm_cd",		KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text",	Hidden:0,	Width:45,	Align:"Center",	ColMerge:0,	SaveName:prefix + "locl_curr_cd",		KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text",	Hidden:0,	Width:80,	Align:"Center",	ColMerge:0,	SaveName:prefix + "prnr_ref_no",		KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text",	Hidden:0,	Width:150,	Align:"Left",	ColMerge:0,	SaveName:prefix + "cust_vndr_eng_nm",	KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text",	Hidden:0,	Width:90,	Align:"Center",	ColMerge:0,	SaveName:prefix + "rev_vvd",			KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Float",	Hidden:0,	Width:120,	Align:"Right",	ColMerge:0,	SaveName:prefix + "rev_act_amt",		KeyField:0,	CalcLogic:"",	Format:"NullFloat",	PointCount:2,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Float",	Hidden:0,	Width:120,	Align:"Right",	ColMerge:0,	SaveName:prefix + "exp_act_amt",		KeyField:0,	CalcLogic:"",	Format:"NullFloat",	PointCount:2,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text",	Hidden:0,	Width:150,	Align:"Left",	ColMerge:0,	SaveName:prefix + "stl_rmk",			KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text",	Hidden:0,	Width:100,	Align:"Center",	ColMerge:0,	SaveName:prefix + "upd_usr_id",			KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0},
    						{Type:"Text",	Hidden:0,	Width:150,	Align:"Center",	ColMerge:0,	SaveName:prefix + "upd_dt",				KeyField:0,	CalcLogic:"",	Format:"",			PointCount:0,	UpdateEdit:0,	InsertEdit:0}
					];
                 
                InitColumns(cols);
                SetColProperty(0, prefix +"re_divr_cd", {ComboText:"|Rev|Exp", ComboCode:"|R|E", DefaultValue:"R"} );
                SetCountPosition();
                SetEditable(1);
                
             }
            break;
    }
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction, cRow) {
    sheetObj.ShowDebugMsg(false);
    var sheetID=sheetObj.id;
    switch (sAction) {
        case IBSEARCH: // retrieve
            if( !validateForm(sheetObj,formObj,sAction) ){return;}
            if ( sheetID == "t1sheet1"){
                formObj.f_cmd.value=SEARCH;
                var param = FormQueryString(formObj);
                    param += "&" + ComGetPrefixParam(sheetID+"_");
                ComOpenWait(true);
                var sXml=sheetObj.GetSearchData("FNS_JOO_0210GS.do", param);
                sheetObj.LoadSearchData(sXml,{Sync:1} );
                ComOpenWait(false);
            }else if ( sheetID == "t2sheet1"){
                formObj.f_cmd.value=SEARCH01;
                var param = FormQueryString(formObj);
                    param += "&" + ComGetPrefixParam(sheetID+"_");
                ComOpenWait(true);
                var sXml=sheetObj.GetSearchData("FNS_JOO_0210GS.do", param);
                sheetObj.LoadSearchData(sXml,{Sync:1} );
                ComOpenWait(false);
            }
            break; 

        case IBSEARCH_ASYNC02: // Get List Trade Code By Carrier Code
            formObj.f_cmd.value = SEARCH24; //SEARCHLIST06;
            var joCrrCds = jo_crr_cds.GetSelectCode();
            var param = FormQueryString(formObj);
                param += "&super_cds1=" + joCrrCds; //북수형
                
            var sXml = sheetObj.GetSearchData("JOOCommonGS.do", param);
            ComXml2ComboItem(sXml, trd_cd, "code", "code");
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
function t1sheet1_OnSearchEnd(sheetObj, ErrMsg) {
    if (sheetObj.RowCount() > 0) {
        var str = "";
        var iStRow = sheetObj.HeaderRows();
        var iEdRow = sheetObj.LastRow();
        var prefix = "t1sheet1_";
        for(var i=iStRow;i<=iEdRow;i++){
            str = sheetObj.GetCellText(i, prefix + "jo_crr_cd");
            
            if(str.indexOf("Total")>-1){
                sheetObj.SetMergeCell(i,1,1,7);
                
                var tmpStr = ComReplaceStr(str+"","Total:","");
                sheetObj.SetCellValue(i, prefix + "jo_crr_cd", tmpStr, 0);
                
                sheetObj.SetRowBackColor(i,"#FCDCEE");
                sheetObj.SetCellFontBold(i,  prefix + "jo_crr_cd", 1);
                sheetObj.SetCellFontBold(i,  prefix + "locl_curr_cd", 1);
                sheetObj.SetCellFontBold(i,  prefix + "inv_rev_act_amt", 1);
                sheetObj.SetCellFontBold(i,  prefix + "inv_exp_act_amt", 1);
            }else if(str.indexOf("Subtotal")>-1){
                sheetObj.SetMergeCell(i,1,1,7);
                
                var tmpStr = ComReplaceStr(str+"","Subtotal:","");
                sheetObj.SetCellValue(i, prefix + "jo_crr_cd", tmpStr, 0);
                
                sheetObj.SetRowBackColor(i,"#FEFA91");   
                sheetObj.SetCellFontBold(i,  prefix + "jo_crr_cd", 1);  
                sheetObj.SetCellFontBold(i,  prefix + "locl_curr_cd", 1);   
                sheetObj.SetCellFontBold(i,  prefix + "inv_rev_act_amt", 1);    
                sheetObj.SetCellFontBold(i,  prefix + "inv_exp_act_amt", 1);         
            }
        }
    }
}
function t1sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
    if (sheetObj.RowCount() > 0) {
    }
}

function t2sheet1_OnSearchEnd(sheetObj, ErrMsg) {
    if (sheetObj.RowCount() > 0) {
        //Row 강제머지할 셀의 Row Index
        //Col 강제머지할 셀의 Column Index 
        //Rows 강제머지할 셀의 Row 개수
        //Cols 강제머지할 셀의 Col 개수
        //ObjId.SetMergeCell(Row, Col, Rows, Cols)

        var str = "";
        var iStRow = sheetObj.HeaderRows();
        var iEdRow = sheetObj.LastRow();
        var prefix = "t2sheet1_";
        for(var i=iStRow;i<=iEdRow;i++){
            str = sheetObj.GetCellText(i, prefix + "jo_crr_cd");
            
            if(str.indexOf("Total")>-1){
                sheetObj.SetMergeCell(i,1,1,12);
                
                var tmpStr = ComReplaceStr(str+"","Total:","");
                sheetObj.SetCellValue(i, prefix + "jo_crr_cd", tmpStr, 0);
                
                sheetObj.SetRowBackColor(i,"#FCDCEE");
                sheetObj.SetCellFontBold(i,  prefix + "jo_crr_cd", 1);
                sheetObj.SetCellFontBold(i,  prefix + "locl_curr_cd", 1);
                sheetObj.SetCellFontBold(i,  prefix + "inv_act_amt", 1);
                sheetObj.SetCellFontBold(i,  prefix + "slp_act_amt", 1);
            }else if(str.indexOf("Subtotal")>-1){
                sheetObj.SetMergeCell(i,1,1,12);
                
                var tmpStr = ComReplaceStr(str+"","Subtotal:","");
                sheetObj.SetCellValue(i, prefix + "jo_crr_cd", tmpStr, 0);
                
                sheetObj.SetRowBackColor(i,"#FEFA91");   
                sheetObj.SetCellFontBold(i,  prefix + "jo_crr_cd", 1);  
                sheetObj.SetCellFontBold(i,  prefix + "locl_curr_cd", 1);   
                sheetObj.SetCellFontBold(i,  prefix + "inv_act_amt", 1);    
                sheetObj.SetCellFontBold(i,  prefix + "slp_act_amt", 1);         
            }
        }
    }
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
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
    sheetObjects[0].RemoveAll();
    sheetObjects[1].RemoveAll();
    jo_crr_cds.RemoveAll();
    trd_cd.RemoveAll();
    
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
    if(beforetab == 0){
        ComResizeSheet(sheetObjects[0]);
    }else{
        ComResizeSheet(sheetObjects[1]);
    }
}