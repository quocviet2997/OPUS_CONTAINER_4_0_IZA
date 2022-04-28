/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : FNS_JOO_0206.js
 *@FileTitle : Create Settlement Data for THEA
 *@author     : CLT
 *@version    : 1.0
 *@since      : 2018/06/18
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
var gRefresh = false;
var gAmountRoundPoint = 2;
var gDysRoundPoint = 5;
var gPopup = false;
var theaStlGrpNo = "";
var vndrSeq = "";
var custCntCdSeq = "";
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
	        case "btn_Upload":
	        	var auth_ofc_cd  = ComGetObjValue(formObj.auth_ofc_cd);
	        	var sUrl = "/opuscntr/FNS_JOO_0202.do";
                sUrl += "?auth_ofc_cd="+auth_ofc_cd+"&ui=0206";
            
                ComOpenPopup(sUrl, 1500, 800,"setExcelUpload", "0,0", true, false, 0, 0, 0, "FNS_JOO_0202");
	        	break;
            case "btn_Retrieve":
                ComSetObjValue(formObj.job_key, "");
                sheetObjects[0].RemoveAll();
                doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
                break;
            case "btn_New":
                initPeriod();
                ComSetObjValue(formObj.rev_vvd, "");
                ComSetObjValue(formObj.re_divr_cd, "");
                ComSetObjValue(formObj.inv_flg, "N");
                ComSetObjValue(formObj.dummy_flg, "");
                gRefresh = false;
                
                sheetObjects[0].RemoveAll();
                sheetObjects[1].RemoveAll();
                comboObjects[0].SetSelectIndex(-1, false);
                comboObjects[1].SetSelectIndex(-1, false);
                comboObjects[2].SetSelectIndex(-1, false);
                comboObjects[2].RemoveAll();
                comboObjects[3].SetSelectIndex(0);
                
                //doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
                break;
            case "btn_Save":
            	if(!checkVndrCustCurr(sheetObjects[0])) {
            		ComShowCodeMessage("JOO10020");
            		return false;
            	}
            	
                ComSetObjValue(formObj.job_key, "");
                formObj.f_cmd.value = MULTI;
                doActionIBSheet(sheetObjects[0], formObj, IBSAVE);
                break;
                
            case "btn_Invoice":
            	if(!checkTheaInvTgt(sheetObjects[0])) {
            		ComShowCodeMessage("JOO00115", "THEA Invoice Target");
            		return false;
            	}
            	
            	if(!checkVndrCustCurr(sheetObjects[0])) {
            		ComShowCodeMessage("JOO10020");
            		return false;
            	}
            	
            	if(!doActionIBSheet(sheetObjects[0], formObj, COMMAND04)){
            		return false;
            	}
            	
            	gPopup = true;
                doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC12);
                setTheaStlGrpNoChkKey(sheetObjects[0]);
                ComSetObjValue(formObj.job_key, "");
                formObj.f_cmd.value = MULTI02;
                doActionIBSheet(sheetObjects[0], formObj, IBSAVE);
                break;
                
            case "btn_DownExcel":
                if(sheetObjects[0].RowCount() < 1){//no data
                    ComShowCodeMessage("COM132501");
                }else{
                    var paramObj = new Object();
                    paramObj.cols = 10;
                    var url = ComJooGetPgmTitle(sheetObjects[0], paramObj);
                    sheetObjects[0].Down2Excel({DownCols : makeHiddenSkipCol(sheetObjects[0]), SheetDesign : 1, Merge : 1});
                }
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
                
            case "btn_delete":
                var checkedRows=(sheetObjects[0].FindCheckedRow("del_chk")).split("|");
                if (checkedRows == ""){
                    ComShowCodeMessage('JOO00143');
                    return;
                }
                
                sheetObjects[0].RenderSheet(0);
                for(var i=checkedRows.length-1; i >= 0; i--){
                    var chkRow = checkedRows[i];
                    stat=sheetObjects[0].GetRowStatus(chkRow);
                    if (sheetObjects[0].GetRowHidden(chkRow) == false){
                        var tmpChkDel     = sheetObjects[0].GetCellValue(chkRow, "chk_del_flg");
                        //chk_del : Y - Delete 가능, N - Delete 불가.
                        if(tmpChkDel == "N"){
                            continue;
                        }else{
                            if (sheetObjects[0].GetRowStatus(chkRow) == "I"){
                                sheetObjects[0].RowDelete(chkRow, false);
                            }else{
                                sheetObjects[0].SetCellValue(chkRow, "del_chk", 0, 0);
                                sheetObjects[0].SetRowHidden(chkRow, 1);
                                sheetObjects[0].SetRowStatus(chkRow, "D");
                            }
                        }
                    }
                }
                sheetObjects[0].RenderSheet(1);

                break;
            case "btn_add":
                var Row = sheetObjects[0].DataInsert(-1);
                setSheetCellEditable(sheetObjects[0], Row);
                sheetObjects[0].SetCellValue(Row, "thea_stl_flg", "Y", 0);
                break;
            case "btn_insert":
                var Row = sheetObjects[0].DataInsert();
                setSheetCellEditable(sheetObjects[0], Row);
                sheetObjects[0].SetCellValue(Row, "thea_stl_flg", "Y", 0);
                break;                 
			case "btn_FileTemplate":
				sheetObjects[1].Down2Excel( {DownCols: makeHiddenSkipCol(sheetObjects[1]), SheetDesign:1,Merge:1 });
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
                SetDropHeight(170);
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
    //doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
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
    formObj.to_rev_yrmon.value=JooGetDateFormat(tmpToYm,"ym");
    
    //년월 만 하면 -3년이 넘게 설정 되어 동일 월로 설정하기 위해서 2015-07-02 로 Day 를 마춘다.
    var tmpFrYm = ComGetDateAdd(formObj.to_rev_yrmon.value+"-01","M", -1);
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
                var HeadTitle1 ="|Del|Dummy\nFlag|THEA Invoice\nTarget|VVD or Vessel\n(for dummy)|Activity\nDate|Lane|Trade|Partner|Curr.|Rev/Exp|Item|Amount|Vendor|Customer|Remark|Invoice No|CSR No|Accrued";
                    HeadTitle1 +="|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd|rev_yrmon|stl_vvd_seq|st_dt|end_dt|acct_cd|auth_ofc_cd|auth_flg|chk_del_flg|valid_col_cd|valid_cd|valid_nm|valid_msg|valid_row|thea_stl_grp_no|vndr_seq|cust_cnt_cd|cust_seq|thea_stl_flg";

                var headCount=ComCountHeadTitle(HeadTitle1);
                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1, FrozenCol:12 } );
                var info    = { Sort:0, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"}];
                InitHeaders(headers, info);
    
                var cols = [ 
                       {Type:"Status",    Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
                       {Type:"CheckBox",  Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"del_chk" },
//                       {Type:"CheckBox",  Hidden:1, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"stl_tgt_flg",      TrueValue:"Y", FalseValue:"N"},
                       {Type:"Combo", 	  Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"dummy_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1},
                       {Type:"CheckBox",  Hidden:0, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"stl_tgt_flg",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, TrueValue:"Y", FalseValue:"N"},
                       {Type:"Text", 	  Hidden:0, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"rev_vvd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,	EditLen:9 },
                       {Type:"Text",      Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:"act_dt",           KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:55,   Align:"Center",  ColMerge:1,   SaveName:"rlane_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:"trd_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text", 	  Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:"jo_crr_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,	EditLen:3 },
                       {Type:"Combo",     Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"locl_curr_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Combo",     Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:"re_divr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1},
                       {Type:"Combo",     Hidden:0, Width:55,   Align:"Center",  ColMerge:1,   SaveName:"jo_stl_itm_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Float",     Hidden:0, Width:120,  Align:"Right",   ColMerge:0,   SaveName:"act_amt",          KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:1,   InsertEdit:1,   MinimumValue:0 },
                       {Type:"Text",      Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"vndr_seq",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"cust_cnt_cd_seq",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:200,  Align:"Left",    ColMerge:0,   SaveName:"stl_rmk",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                       {Type:"Text",      Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"inv_no",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"csr_no",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"accr_flg",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },

                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"vsl_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"skd_voy_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"skd_dir_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"rev_dir_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"rev_yrmon",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"stl_vvd_seq",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"st_dt",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"end_dt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"acct_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"auth_ofc_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"auth_flg",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"chk_del_flg",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"valid_col_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"valid_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"valid_nm",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"valid_msg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"valid_row",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"thea_stl_grp_no",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cust_cnt_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cust_seq",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"thea_stl_flg",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }
                       ];
                 
                InitColumns(cols);
                SetColProperty(0    , "dummy_flg"      , {ComboText:"|Y", ComboCode:"|Y"} );
                SetColProperty(0    , "re_divr_cd"      , {ComboText:"|R|E", ComboCode:"|R|E"} );
                SetColProperty(0    , "jo_stl_itm_cd"   , {ComboText:"|"+gJoStlItmCdComboItems, ComboCode:"|"+gJoStlItmCdComboItems} );
                SetColProperty(0    , "locl_curr_cd"    , {ComboText : "|"+currCdComboItems, ComboCode : "|"+currCdComboItems });
                SetColProperty(0    , "locl_curr_cd"    , {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0    , "re_divr_cd"      , {AcceptKeys:"E" , InputCaseSensitive:1});
                SetColProperty(0    , "jo_stl_itm_cd"   , {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0    , "trd_cd"        	, {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0    , "rev_vvd"       	, {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0    , "jo_crr_cd"       , {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0    , "rlane_cd"        , {AcceptKeys:"E|N" , InputCaseSensitive:1});
                
                SetEditable(1);
                SetShowButtonImage(1);
                resizeSheet();
             }
            break;
            
        case "sheet2": // file Template
            with(sheetObj){
        		var prefix = "sheet2_";
        		var HeadTitle1 ="Dummy\nFlag|VVD or Vessel\n(for dummy)|Activity\nDate|Trade|Partner|Curr.|Rev/Exp|Item|Amount|Remark|a|b|";                
                var headCount=ComCountHeadTitle(HeadTitle1);
                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1, FrozenCol:10 } );
                var info    = { Sort:0, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"} ];
                InitHeaders(headers, info);
    
                var cols = [ 
                            {Type:"Text", 	Hidden:0, Width:100,  	Align:"Center",  ColMerge:0,   SaveName:"dummy_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                            {Type:"Text", 	Hidden:0, Width:100,  	Align:"Center",  ColMerge:0,   SaveName:"rev_vvd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                            {Type:"Text", 	Hidden:0, Width:100,   	Align:"Center",  ColMerge:0,   SaveName:"act_dt",        	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                            {Type:"Text", 	Hidden:0, Width:100,   	Align:"Center",  ColMerge:0,   SaveName:"trd_cd",        	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                            {Type:"Text", 	Hidden:0, Width:100,   	Align:"Center",  ColMerge:0,   SaveName:"jo_crr_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                            {Type:"Text",   Hidden:0, Width:100,   	Align:"Center",  ColMerge:0,   SaveName:"locl_curr_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                            {Type:"Text",   Hidden:0, Width:100,   	Align:"Center",  ColMerge:0,   SaveName:"re_divr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                            {Type:"Text",   Hidden:0, Width:100,   	Align:"Center",  ColMerge:0,   SaveName:"jo_stl_itm_cd",    KeyField:0,   CalcLogic:"",   Format:"",       	    PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                            {Type:"Float",  Hidden:0, Width:100,   	Align:"Right",   ColMerge:0,   SaveName:"act_amt",          KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:1 },
                            {Type:"Text",   Hidden:0, Width:200,  	Align:"Left",    ColMerge:0,   SaveName:"stl_rmk",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                            
                            //내부 체크로직을 위한 Dummy 항목
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"rlane_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            //{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"trd_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"vsl_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"skd_voy_no",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"skd_dir_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"rev_dir_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"rev_yrmon",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"stl_vvd_seq",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            //{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"act_dt",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"st_dt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"end_dt",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"acct_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"auth_ofc_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"auth_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"valid_col_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"valid_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"valid_nm",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"valid_msg",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }
                            ];
                 
                InitColumns(cols);
                SetEditable(0);
             }
            break;
    }
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction, Row, ColName) {
    sheetObj.ShowDebugMsg(false);
    switch (sAction) {
        case IBSEARCH: // retrieve
            if (!validateForm(sheetObj, formObj, sAction)) {
                return;
            }
            
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH;
            var param = FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("FNS_JOO_0206GS.do", param);
            
            var jobKey=ComGetEtcData(sXml,"job_key");
            if (jobKey.length > 0) {
                gRefresh = true;
                ComSetObjValue(formObj.job_flg, "RETRIEVE_VVD");
                ComSetObjValue(formObj.job_key, jobKey);
                sheetObj.SetWaitImageVisible(0);
                ComOpenWait(true);
                sheetObj.SetWaitTimeOut(10000);
                timer = setInterval(GetBackEndJobStatus, 3000); // action GetBackEndJobStatus function after 3 seconds.
            }
            break;
            
        case IBSEARCH_ASYNC10: //BackEndJob Status
            formObj.f_cmd.value=SEARCH01;
            var param = FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("FNS_JOO_0206GS.do", param);
            
            var jobState=ComGetEtcData(sXml, "jb_sts_flg")+"";
            
            // 2 : processing, 3:success , 4:fail
            if (jobState == "3") {//success
                ComOpenWait(false);
                clearInterval(timer);
                //ComShowCodeMessage("JOO00160"); //Success to execute
                //ComShowMessage("Success to execute.");
                //ComSetObjValue(formObj.job_key, "");
                var jobFlg = ComGetObjValue(formObj.job_flg);
                if (jobFlg == "RETRIEVE_VVD"){
                    doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC11);
                }else if(jobFlg == "SAVE_VVD"){
                    ComFireEvent(ComGetObject("btn_Retrieve") ,"click");
                }
                
            } else if (jobState == "4") { // BackEndJob Fail
                ComOpenWait(false);
                clearInterval(timer);
                ComShowMessage("Fail to retrieve or create.");
            } else if (jobState == "5") {
                ComOpenWait(false);
                clearInterval(timer);
                ComShowMessage("Read result file aleady.");
            }
            break;            
        case IBSEARCH_ASYNC11://BackEndJob result - process 3.          
            sheetObj.SetWaitImageVisible(1);
            formObj.f_cmd.value=SEARCH02;
            var param = FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("FNS_JOO_0206GS.do", param);
            sheetObj.LoadSearchData(sXml,{Sync:1} );
            //초기화
            ComSetObjValue(formObj.job_flg, "");
            //ComSetObjValue(formObj.job_key, "");
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
            	gPopup = false;
                return;
            }
            
            sheetObj.SetWaitImageVisible(0);
            ComOpenWait(true);
//            formObj.f_cmd.value = MULTI;
            var param = ComGetSaveString(sheetObj, true, true);
                param += "&" + FormQueryString(formObj);
            var sXml = sheetObj.GetSaveData("FNS_JOO_0206GS.do", param);
            
            var jobKey=ComGetEtcData(sXml, "job_key");
            if (jobKey.length > 0) {
                gRefresh=false;
                ComSetObjValue(formObj.job_flg, "SAVE_VVD");
                ComSetObjValue(formObj.job_key, jobKey);
                sheetObj.SetWaitImageVisible(0);
                ComOpenWait(true);
                sheetObj.SetWaitTimeOut(10000);
                timer=setInterval(GetBackEndJobStatus, 3000); // action GetBackEndJobStatus function after 3 seconds.
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

		case IBROWSEARCH:    // Row Search
			//var queryStr = "";//sheetObj.RowSaveStr(Row);
			
			if(ColName == "rev_vvd" || ColName == "trd_cd" || ColName == "act_dt"){
				ComSetObjValue(formObj.f_cmd, COMMAND02);
			}else{
				ComSetObjValue(formObj.f_cmd, COMMAND03);
			}
			
			sheetObj.SetCellValue(Row, "valid_col_cd", ColName, 0);
			sheetObj.SetCellValue(Row, "valid_row", Row, 0);
			
			var queryStr  = sheetObj.RowSaveStr(Row);
		    queryStr += "&f_cmd="+ComGetObjValue(formObj.f_cmd);
		
		    sheetObj.DoRowSearch(Row, "FNS_JOO_0206GS.do", queryStr, {Sync:2});
		break;
		
        case MODIFY:// STL_TGT_FLG STATUS>N
             sheetObj.SetWaitImageVisible(0);
             ComOpenWait(true);
             formObj.f_cmd.value = COMMAND01;
             var param = ComGetSaveString(sheetObj, true, true);
                 param += "&" + FormQueryString(formObj);
             sheetObj.GetSaveData("FNS_JOO_0206GS.do", param);
             ComOpenWait(false);
             break;
             
        case COMMAND04: // 해당 target의 작업여부 check
             formObj.f_cmd.value=SEARCH04;
             var working	= "";
             var updUsrId	= "";
             var param		= ComGetSaveString(sheetObj, true, true);
             
             param += "&" + FormQueryString(formObj);
             var sXml=sheetObj.GetSearchData("FNS_JOO_0206GS.do", param);
             
             working	= ComGetEtcData(sXml, "working");
             updUsrId	= ComGetEtcData(sXml, "updUsrId");
             
             if(working == 'N') {
            	 return true;
             }else{
				if(ComShowCodeConfirm('JOO10017', updUsrId)){
					return true;
				}else{
	            	return false;
				}
             }
             break;
        case IBSEARCH_ASYNC12:
            var param = "";
                param += "f_cmd="   + SEARCH05;
            
            var sXml = sheetObj.GetSearchData("FNS_JOO_0206GS.do", param);
            theaStlGrpNo = ComGetEtcData(sXml, "thea_stl_grp_no");
            break;
    }
}

var gSelRow = "";
function sheet1_OnChange(sheetObj, Row, Col, Value, OldValue, RaiseFlag) {
    var value = sheetObj.GetCellValue(Row, Col);
    var colName = sheetObj.ColSaveName(Col);
    gSelRow = Row;
    
    var dummyFlg = sheetObj.GetCellValue(Row, "dummy_flg");
    
    if("Y" == dummyFlg){
    	//dummy case.
    	switch (colName) {
	    	case "dummy_flg" :
	    		//기등록된 데이타 초기화 한다.
	    		setSheetCellEditable(sheetObj, Row, Col);
	    		setSheetCellInitData(sheetObj, Row, colName);
	    		break;
	    	case "rev_vvd" :
	    	case "act_dt" :
	    	case "trd_cd" :
	    		var revVvd 	= sheetObj.GetCellValue(Row, "rev_vvd");
	    		var actDt 	= sheetObj.GetCellValue(Row, "act_dt");
	    		var trdCd 	= sheetObj.GetCellValue(Row, "trd_cd");
	        	if(ComIsEmpty(revVvd) || revVvd.length != 4){ 
	    			//normal case
	    			if(ComIsEmpty(Value)){
	        			ComShowCodeMessage("JOO00116", "VVD");
	        		}else if(Value.length != 4){
	        			ComShowCodeMessage("COM132201", "VVD");
	        		}	        		
	        		//초기화.
	        		setSheetCellInitData(sheetObj, Row, colName);
	        	}/*else if(ComIsEmpty(actDt)){
	        		ComShowCodeMessage("JOO00116", "Activity Date");
	        	}else if(ComIsEmpty(trdCd)){
	        		ComShowCodeMessage("JOO00116", "Trade");
	        	}*/else if(!ComIsEmpty(actDt) && !ComIsEmpty(trdCd)){
	        		doActionIBSheet(sheetObjects[0], document.form, IBROWSEARCH, Row, colName);
	        	}
	            break;
	        case "jo_crr_cd" :
	        case "re_divr_cd" :
	        case "jo_stl_itm_cd":
	        	var iChkCnt		= 0;
	        	var revVvd 		= sheetObj.GetCellValue(Row, "rev_vvd");
	        	var actDt 		= sheetObj.GetCellValue(Row, "act_dt");
	        	var trdCd 		= sheetObj.GetCellValue(Row, "trd_cd");
	        	var rlaneCd 	= sheetObj.GetCellValue(Row, "rlane_cd");
	        	var joCrrCd 	= sheetObj.GetCellValue(Row, "jo_crr_cd");
	        	var reDivrCd 	= sheetObj.GetCellValue(Row, "re_divr_cd");
	        	var joStlItmCd 	= sheetObj.GetCellValue(Row, "jo_stl_itm_cd");
	        	if(ComIsEmpty(revVvd) || ComIsEmpty(rlaneCd)){
	        		ComShowCodeMessage("JOO00116", "VVD");
	        		iChkCnt++;
	        	}else if(ComIsEmpty(actDt)){
	        		ComShowCodeMessage("JOO00116", "Activity Date");
	        		iChkCnt++;
	        	}else if(ComIsEmpty(trdCd)){
	        		ComShowCodeMessage("JOO00116", "Trade");
	        		iChkCnt++;
	        	}else if(ComIsEmpty(joCrrCd) || joCrrCd.length < 3){
	        		if(ComIsEmpty(joCrrCd)){
	        			ComShowCodeMessage("JOO00116", "Partner");
	        			iChkCnt++;
	        		}else{
	        			ComShowCodeMessage("COM132201", "Partner");
	        			iChkCnt++;
	        		}        		
	        	}else if(!ComIsEmpty(joStlItmCd)){
	        		if(ComIsEmpty(reDivrCd)){
	        			ComShowCodeMessage("JOO00116", "Exp/Rev");
	        			iChkCnt++;
	        		}
	        	}
	        	
	        	if(iChkCnt <= 0){
	        		doActionIBSheet(sheetObjects[0], document.form, IBROWSEARCH, Row, colName);
	        	}	        	
	            break;
    	}
    	
    }else{
    	//normal case.
    	switch (colName) {
	    	case "dummy_flg" :
	    		//기등록된 데이타 초기화 한다.
	    		setSheetCellEditable(sheetObj, Row, Col);
	    		setSheetCellInitData(sheetObj, Row, colName);
	    		break;
	    	case "rev_vvd" : 
	        	if(ComIsEmpty(Value) || Value.length != 9){ 
        			//normal case
        			if(ComIsEmpty(Value)){
            			ComShowCodeMessage("JOO00116", "VVD");
            		}else if(Value.length != 9){
            			ComShowCodeMessage("COM132201", "VVD");
            		}	        		
	        		//초기화.
	        		setSheetCellInitData(sheetObj, Row, colName);
	        	}else{
	        		doActionIBSheet(sheetObjects[0], document.form, IBROWSEARCH, Row, colName);
	        	}
	            break;
	        case "jo_crr_cd" :
	        case "re_divr_cd" :
	        case "jo_stl_itm_cd":
	        	var iChkCnt		= 0;
	        	var revVvd 		= sheetObj.GetCellValue(Row, "rev_vvd");
	        	var rlaneCd 	= sheetObj.GetCellValue(Row, "rlane_cd");
	        	var joCrrCd 	= sheetObj.GetCellValue(Row, "jo_crr_cd");
	        	var reDivrCd 	= sheetObj.GetCellValue(Row, "re_divr_cd");
	        	var joStlItmCd 	= sheetObj.GetCellValue(Row, "jo_stl_itm_cd");
	        	if(ComIsEmpty(revVvd) || ComIsEmpty(rlaneCd)){
	        		ComShowCodeMessage("JOO00116", "VVD");
	        		iChkCnt++;
	        	}else if(ComIsEmpty(joCrrCd) || joCrrCd.length < 3){
	        		if(ComIsEmpty(joCrrCd)){
	        			ComShowCodeMessage("JOO00116", "Partner");
	        			iChkCnt++;
	        		}else{
	        			ComShowCodeMessage("COM132201", "Partner");
	        			iChkCnt++;
	        		}        		
	        	}else if(!ComIsEmpty(joStlItmCd)){
	        		if(ComIsEmpty(reDivrCd)){
	        			ComShowCodeMessage("JOO00116", "Exp/Rev");
	        			iChkCnt++;
	        		}
	        	}
	        	
	        	if(iChkCnt <= 0){
	        		doActionIBSheet(sheetObjects[0], document.form, IBROWSEARCH, Row, colName);
	        	}	        	
	            break;
	    }
    }
}

function setCheckDuplicatedData(sheetObj, nRow, sAction){
	var iStRow = sheetObj.HeaderRows();
    var iEdRow = sheetObj.LastRow();
    var tmpDupRows = new Array();
    
    if(sAction == IBSAVE){
    	//전체 단위에서 전체 비교.
    	for( var i=iStRow; i <= iEdRow; i++ ) {
        	var ibflag 	= sheetObj.GetCellValue(i, "ibflag");
        	var validCd = sheetObj.GetCellValue(i, "valid_cd");
        	if("R" == ibflag || "D" == ibflag || "E" == validCd) continue;
        	var tmpVal = "";

        	var sDummyFlg 	= sheetObj.GetCellValue(i, "dummy_flg");
        	var sRevVvd 	= sheetObj.GetCellValue(i, "rev_vvd");
        	var sRlaneCd 	= sheetObj.GetCellValue(i, "rlane_cd");
        	var sJoCrrCd 	= sheetObj.GetCellValue(i, "jo_crr_cd");
        	var sReDivrCd 	= sheetObj.GetCellValue(i, "re_divr_cd");
        	var sJoStlItmCd = sheetObj.GetCellValue(i, "jo_stl_itm_cd");
        	var sTrdCd 		= sheetObj.GetCellValue(i, "trd_cd");
        	var sLoclCurrCd = sheetObj.GetCellValue(i, "locl_curr_cd");
        	var sActDt 		= sheetObj.GetCellValue(i, "act_dt");
        	sActDt 			= ComTrimAll(sActDt, " ", "-", ":");
        	
        	for(var j=iStRow; j <= iEdRow; j++ ){
        		var tIbflag 	= sheetObj.GetCellValue(j, "ibflag");
    			var tChkDelFlg  = sheetObj.GetCellValue(j, "chk_del_flg");
    			
        		if("D" == tIbflag || "N" == tChkDelFlg || i == j) continue;

    			var tDummyFlg 	= sheetObj.GetCellValue(j, "dummy_flg");
        		var tRevVvd 	= sheetObj.GetCellValue(j, "rev_vvd");
            	var tRlaneCd 	= sheetObj.GetCellValue(j, "rlane_cd");
            	var tJoCrrCd 	= sheetObj.GetCellValue(j, "jo_crr_cd");
            	var tReDivrCd 	= sheetObj.GetCellValue(j, "re_divr_cd");
            	var tJoStlItmCd	= sheetObj.GetCellValue(j, "jo_stl_itm_cd");
            	var tTrdCd 		= sheetObj.GetCellValue(j, "trd_cd");
            	var tLoclCurrCd = sheetObj.GetCellValue(j, "locl_curr_cd");
            	var tActDt 		= sheetObj.GetCellValue(j, "act_dt");
            	tActDt 			= ComTrimAll(tActDt, " ", "-", ":");
        		
            	if("Y" == sDummyFlg){
            		if(sDummyFlg == tDummyFlg && sRevVvd == tRevVvd && sActDt == tActDt && sTrdCd == tTrdCd && sJoCrrCd == tJoCrrCd && sLoclCurrCd == tLoclCurrCd  && sReDivrCd == tReDivrCd && sJoStlItmCd == tJoStlItmCd){
                		tmpDupRows.push(j);
                	}
            	}else{
            		if(sDummyFlg == tDummyFlg && sRevVvd == tRevVvd && sRlaneCd == tRlaneCd && sTrdCd == tTrdCd && sJoCrrCd == tJoCrrCd && sLoclCurrCd == tLoclCurrCd  && sReDivrCd == tReDivrCd && sJoStlItmCd == tJoStlItmCd){
                		tmpDupRows.push(j);
                	}
            	}
        	}
        }
    	//message 처리 후 리턴
		var tmpDupRowStr = tmpDupRows.join();
        if(!ComIsEmpty(tmpDupRowStr)){
        	ComShowCodeMessage("COM12115", "[ "+tmpDupRowStr+" ] Row");
        	return false;
        }
    }else{
    	//Row 단위로 데이타가 오므로 해당 Row를 가지고 전체 비교.
    	//전체 단위에서 전체 비교.
    	var validColCd 	= sheetObj.GetCellValue(nRow, "valid_col_cd");
    	var sDummyFlg 	= sheetObj.GetCellValue(nRow, "dummy_flg");
    	var sRevVvd 	= sheetObj.GetCellValue(nRow, "rev_vvd");
    	var sRlaneCd 	= sheetObj.GetCellValue(nRow, "rlane_cd");
    	var sJoCrrCd 	= sheetObj.GetCellValue(nRow, "jo_crr_cd");
    	var sReDivrCd 	= sheetObj.GetCellValue(nRow, "re_divr_cd");
    	var sJoStlItmCd = sheetObj.GetCellValue(nRow, "jo_stl_itm_cd");
    	var sTrdCd 		= sheetObj.GetCellValue(nRow, "trd_cd");
    	var sLoclCurrCd = sheetObj.GetCellValue(nRow, "locl_curr_cd");
    	var sActDt 		= sheetObj.GetCellValue(nRow, "act_dt");
    	sActDt 			= ComTrimAll(sActDt, " ", "-", ":");
    	
    	var iDupCnt 	= 0;
    	
    	for(var j=iStRow; j <= iEdRow; j++ ){
    		var tIbflag 	= sheetObj.GetCellValue(j, "ibflag");
			var tChkDelFlg  = sheetObj.GetCellValue(j, "chk_del_flg");
			
    		if("D" == tIbflag || "N" == tChkDelFlg || j == nRow) continue;

			var tDummyFlg 	= sheetObj.GetCellValue(j, "dummy_flg");
    		var tRevVvd 	= sheetObj.GetCellValue(j, "rev_vvd");
        	var tRlaneCd 	= sheetObj.GetCellValue(j, "rlane_cd");
        	var tJoCrrCd 	= sheetObj.GetCellValue(j, "jo_crr_cd");
        	var tReDivrCd 	= sheetObj.GetCellValue(j, "re_divr_cd");
        	var tJoStlItmCd	= sheetObj.GetCellValue(j, "jo_stl_itm_cd");
        	var tTrdCd 		= sheetObj.GetCellValue(j, "trd_cd");
        	var tLoclCurrCd = sheetObj.GetCellValue(j, "locl_curr_cd");
        	var tActDt 		= sheetObj.GetCellValue(j, "act_dt");
        	tActDt 			= ComTrimAll(tActDt, " ", "-", ":");
    		
        	if("Y" == sDummyFlg){
        		if(sDummyFlg == tDummyFlg && sRevVvd == tRevVvd && sActDt == tActDt && sTrdCd == tTrdCd && sJoCrrCd == tJoCrrCd && sLoclCurrCd == tLoclCurrCd  && sReDivrCd == tReDivrCd && sJoStlItmCd == tJoStlItmCd){
            		//tmpDupRows.push(j);
        			iDupCnt++;
            	}
        	}else{
        		if(sDummyFlg == tDummyFlg && sRevVvd == tRevVvd && sRlaneCd == tRlaneCd && sTrdCd == tTrdCd && sJoCrrCd == tJoCrrCd && sLoclCurrCd == tLoclCurrCd  && sReDivrCd == tReDivrCd && sJoStlItmCd == tJoStlItmCd){
            		//tmpDupRows.push(j);
            		iDupCnt++;
            	}
        	}
    	}
    	
    	//iDupCnt > 0 : Dup 존재함. 해당 Row에 Dup 메세지 처리.
    	if(iDupCnt > 0){
    		//체크 후 Message에 Dup 처리.
    		var dupMsg = ComGetMsg("JOO00223");
    		
    		sheetObj.SetCellValue(nRow, "valid_cd", "E", 0);
    		sheetObj.SetCellValue(nRow, "valid_msg", dupMsg, 0); // Duplicated
    		
    		setSheetRowFontColorConfig(sheetObj, nRow, "E");
    		
    		ComShowCodeMessage("COM12115", "[ "+nRow+" ] Row");
    		sheetObj.SetCellValue(nRow, validColCd, "", 0);
    	}
    }
        
    return true;
}

//var COLOR_RED = "#FF0000";
//var COLOR_BLACK = "#000000";
//var COLOR_BLUE = "#8fd8ef";
function setSheetRowFontColorConfig(sheetObj, Row, validCd){
	if (sheetObj.RowCount() > 0) {
		//var cols = "";
		//var isEditable = true;
		validCd = ComIsEmpty(validCd) ? sheetObj.GetCellValue(Row, "valid_cd") : validCd;
		//var tmpValidCd = sheetObj.GetCellValue(Row, "valid_cd");
		//if(ComIsEmpty(tmpValidCd)) tmpValidCd = "E";
		
		//색상 초기화 : Black
		sheetObj.SetRowFontColor(Row, COLOR_BLACK);
		
		switch(validCd){
			case "E" :
				sheetObj.SetRowFontColor(Row, COLOR_RED);
				break;
			case "I" :
			case "U" :
				sheetObj.SetRowFontColor(Row, COLOR_BLUE);
				break;
			case "S" :
				sheetObj.SetRowFontColor(Row, COLOR_BLACK);
				break;
			default :
				sheetObj.SetRowFontColor(Row, COLOR_BLACK);
				break;
		}		
	}
}

function setSheetValidationConfig(sheetObj){
	var dummyFlg 	= sheetObj.GetCellValue(gSelRow, "dummy_flg");
	var validColCd 	= sheetObj.GetCellValue(gSelRow, "valid_col_cd");
	var validCd 	= sheetObj.GetCellValue(gSelRow, "valid_cd");
	var validMsg 	= sheetObj.GetCellValue(gSelRow, "valid_msg");
	var validRow 	= sheetObj.GetCellValue(gSelRow, "valid_row");
	
	//Message 처리.
	switch(validCd){
		case "E":
		case "U":
			ComShowMessage(validMsg);
			setSheetCellInitData(sheetObj, validRow, validColCd);
			setSheetRowFontColorConfig(sheetObj, validRow, validCd);
			break;
		case "I":
		case "S":
			// Remove Dup check : 2018-05-16
			//setCheckDuplicatedData(sheetObj, validRow, "");
			sheetObj.SetCellValue(validRow, "valid_col_cd"	, "", 0);
			sheetObj.SetCellValue(validRow, "valid_row"		, "", 0);
			setSheetRowFontColorConfig(sheetObj, validRow, validCd);
			break;
	}
	
	
}


function setSheetCellInitData(sheetObj, Row, ColName){
	var cols = "";
	var dummyFlg = sheetObj.GetCellValue(Row, "dummy_flg");
	
	if("Y" == dummyFlg){
		//dummy case
		switch (ColName) {
			case "dummy_flg":
				cols  = "rev_vvd|act_dt|rlane_cd|trd_cd|jo_crr_cd|locl_curr_cd|re_divr_cd|jo_stl_itm_cd|act_amt|stl_rmk";
			    cols += "|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd|stl_vvd_seq|st_dt|end_dt|acct_cd|chk_del_flg";
			    cols += "|valid_col_cd|valid_cd|valid_nm|valid_msg|valid_row";
				break;
	    	case "rev_vvd" :
	    		cols  = "rev_vvd|act_dt|rlane_cd|trd_cd|jo_crr_cd|locl_curr_cd|re_divr_cd|jo_stl_itm_cd|act_amt|stl_rmk";
			    cols += "|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd|stl_vvd_seq|st_dt|end_dt|acct_cd|chk_del_flg";
			    //cols += "|valid_col_cd|valid_cd|valid_nm|valid_msg|valid_row";    	    
	    		break;
	    	case "act_dt" :
	    		cols  = "act_dt|rlane_cd|trd_cd|jo_crr_cd|locl_curr_cd|re_divr_cd|jo_stl_itm_cd|act_amt|stl_rmk";
			    cols += "|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd|stl_vvd_seq|st_dt|end_dt|acct_cd|chk_del_flg";
			    //cols += "|valid_col_cd|valid_cd|valid_nm|valid_msg|valid_row";  
	    		break;
	    	case "trd_cd" :
	    		cols  = "rlane_cd|trd_cd|jo_crr_cd|locl_curr_cd|re_divr_cd|jo_stl_itm_cd|act_amt|stl_rmk";
			    cols += "|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd|stl_vvd_seq|st_dt|end_dt|acct_cd|chk_del_flg";
			    //cols += "|valid_col_cd|valid_cd|valid_nm|valid_msg|valid_row";  		    
	    		break;
	    	case "jo_crr_cd" :
	    		cols  = "jo_crr_cd|locl_curr_cd|re_divr_cd|jo_stl_itm_cd|acct_cd|chk_del_flg";
			    //cols += "|valid_col_cd|valid_cd|valid_nm|valid_msg|valid_row";
	    		break;
	    	case "re_divr_cd" :
			    cols += "re_divr_cd|chk_del_flg";
			    //cols += "|valid_col_cd|valid_cd|valid_nm|valid_msg|valid_row";
	    		break;
	    	case "jo_stl_itm_cd" :
			    cols += "jo_stl_itm_cd|chk_del_flg";
			    //cols += "|valid_col_cd|valid_cd|valid_nm|valid_msg|valid_row";
	    		break;
		}
	}else{
		//normal case
		switch (ColName) {
			case "dummy_flg":
				cols  = "rev_vvd|act_dt|rlane_cd|trd_cd|jo_crr_cd|locl_curr_cd|re_divr_cd|jo_stl_itm_cd|act_amt|stl_rmk";
			    cols += "|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd|stl_vvd_seq|st_dt|end_dt|acct_cd|chk_del_flg";
			    cols += "|valid_col_cd|valid_cd|valid_nm|valid_msg|valid_row";
				break;
	    	case "rev_vvd" :
	    		cols  = "rev_vvd|act_dt|rlane_cd|trd_cd|jo_crr_cd|locl_curr_cd|re_divr_cd|jo_stl_itm_cd|act_amt|stl_rmk";
			    cols += "|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd|stl_vvd_seq|st_dt|end_dt|acct_cd|chk_del_flg";
			    //cols += "|valid_col_cd|valid_cd|valid_nm|valid_msg|valid_row";    	    
	    		break;
	    	case "jo_crr_cd" :
	    		cols  = "jo_crr_cd|locl_curr_cd|re_divr_cd|jo_stl_itm_cd|acct_cd|chk_del_flg";
			    //cols += "|valid_col_cd|valid_cd|valid_nm|valid_msg|valid_row";
	    		break;
	    	case "re_divr_cd" :
			    cols += "re_divr_cd|chk_del_flg";
			    //cols += "|valid_col_cd|valid_cd|valid_nm|valid_msg|valid_row";
	    		break;
	    	case "jo_stl_itm_cd" :
			    cols += "jo_stl_itm_cd|chk_del_flg";
			    //cols += "|valid_col_cd|valid_cd|valid_nm|valid_msg|valid_row";
	    		break;
		}
	}
	
	
	if(!ComIsEmpty(cols)){
		var arrCols = cols.split("|");
		for(var j=0; j<arrCols.length; j++){
			sheetObj.SetCellValue(Row, arrCols[j], "", 0);
		}
	}
	sheetObj.SelectCell(Row, ColName);
	
}

function sheet1_OnSearchEnd(sheetObj, code, msg, stCode, stMsg, responseText) {
	var formObj = document.form;
    if (sheetObj.RowCount() > 0) {
    	var f_cmd = ComGetObjValue(formObj.f_cmd);
    	if(f_cmd == COMMAND02 || f_cmd == COMMAND03){
    		//DoRowSearch Validation Message
    		setSheetValidationConfig(sheetObj);
    	}else{
	        var iHeadRow = sheetObj.HeaderRows();
	        var iLastRow = sheetObj.LastRow();
	        
	        for(var i=iHeadRow ; i <= iLastRow ; i++ ){
	            var tmpChkDelFlg    = sheetObj.GetCellValue(i, "chk_del_flg");
	            
	            sheetObj.SetCellValue(i, "cust_cnt_cd_seq", sheetObj.GetCellValue(i, "cust_cnt_cd") + sheetObj.GetCellValue(i, "cust_seq"),0);
	            sheetObj.SetCellValue(i, "ibflag", "R",0);
	            
	            if(tmpChkDelFlg == "N"){ //act_amt stl_rmk
	                sheetObj.SetCellEditable(i, "del_chk", 0);
	                sheetObj.SetCellEditable(i, "act_amt", 0);
	                sheetObj.SetCellEditable(i, "stl_rmk", 0);
	            }
	            var invoice = sheetObj.GetCellValue(i, "inv_no");
	            var stl_tgt_flg = sheetObj.GetCellValue(i, "stl_tgt_flg");
	            if(invoice != '' || stl_tgt_flg == '1') {
	            	sheetObj.SetCellEditable(i, "stl_tgt_flg", 0);
	            }
	        }
	    	if(gPopup) {
	    		openCreateInvoice();
	    	}
    	}
    }
}

function setSheetCellEditable(sheetObj, Row, Col){
	var tmpDummyFlg    = sheetObj.GetCellValue(Row, "dummy_flg");
	var editTrueCols 	= "";
	var editFalseCols 	= "";
	if("Y" == tmpDummyFlg){
		//dummy case
		editTrueCols = "dummy_flg|rev_vvd|act_dt|trd_cd|jo_crr_cd|re_divr_cd|jo_stl_itm_cd|act_amt|stl_rmk";
		editFalseCols = "rlane_cd|locl_curr_cd"; 		
	}else{
		//normal case
		editTrueCols = "dummy_flg|rev_vvd|jo_crr_cd|re_divr_cd|jo_stl_itm_cd|act_amt|stl_rmk";
		editFalseCols = "act_dt|trd_cd|rlane_cd|locl_curr_cd";
	}
	
	//Edit True
	if(!ComIsEmpty(editTrueCols)){
		var arrCols = editTrueCols.split("|");
		for(var j=0; j<arrCols.length; j++){
			sheetObj.SetCellEditable(Row, arrCols[j], 1);
		}
	}
	
	//Edit False
	if(!ComIsEmpty(editFalseCols)){
		var arrCols = editFalseCols.split("|");
		for(var j=0; j<arrCols.length; j++){
			sheetObj.SetCellEditable(Row, arrCols[j], 0);
		}
	}
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
    switch (sAction) {
        case IBSAVE: //save
            if(sheetObj.RowCount() < 1 ){
                ComShowCodeMessage("JOO00036");
                return false;
            }
            
            //화면에 입력된 데이타 DUP 체크
            // remove dup check : 2018-05-16
            //if(!setCheckDuplicatedData(sheetObj, "", sAction)) return false;
            
            /*var duprows = sheetObj.ColValueDupRows("rev_vvd|rlane_cd|jo_crr_cd|re_divr_cd|jo_stl_itm_cd",{"IncludeDelRow" : 0});
            //var arrDupRows = duprows.split(“,”);
            if(!ComIsEmpty(duprows)){
            	ComShowCodeMessage("COM12115", "[ "+duprows+" ] Row");
            	return false;
            }*/
            
            var iStRow = sheetObj.HeaderRows();
            var iEdRow = sheetObj.LastRow();
            for( var i=iStRow; i <= iEdRow; i++ ) {
            	var ibflag 		= sheetObj.GetCellValue(i, "ibflag");
            	var dummyFlg 	= sheetObj.GetCellValue(i, "dummy_flg");
            	if("R" == ibflag || "D" == ibflag) continue;
            	var tmpVal = "";
            	//Hidden 데이타 Validation 체크
            	var revVvd = sheetObj.GetCellValue(i, "rev_vvd");
            	
            	var cols = new Array("rev_vvd", "rlane_cd", "trd_cd", "vsl_cd", "skd_voy_no", "skd_dir_cd", "rev_dir_cd", "rev_yrmon", "act_dt", "st_dt", "end_dt");
        		if("Y" == dummyFlg) cols = new Array("rev_vvd", "rlane_cd", "trd_cd", "vsl_cd", "skd_voy_no", "skd_dir_cd", "rev_dir_cd", "rev_yrmon", "act_dt", "st_dt");
            	
        		for(var j=0; j<cols.length; j++){
        			tmpVal = sheetObj.GetCellValue(i, cols[j]);
        			if(ComIsEmpty(tmpVal)){
        				//JOO00219 [{?msg1}] {?msg2} not exists in schedule.
        				ComShowCodeMessage("JOO00219", revVvd, "VVD");
        				//ComShowMessage("["+revVvd+"] VVD not exists in schedule");
        				return false;
        			}
        		}
        		
        		var cols2 = new Array("jo_crr_cd", "locl_curr_cd");
        		var joCrrCd = sheetObj.GetCellValue(i, "jo_crr_cd");
        		for(var j=0; j<cols2.length; j++){
        			tmpVal = sheetObj.GetCellValue(i, cols2[j]);
        			if(ComIsEmpty(tmpVal)){
        				//JOO00217 [{?msg1}] {?msg2} not exists in JOO Setup.
        				ComShowCodeMessage("JOO00217", joCrrCd, "Partner");
        				//ComShowMessage("["+joCrrCd+"] Partner not exists in JOO Setup.");
        				return false;
        			}
        		}
        		
        		var cols3 = new Array("re_divr_cd", "acct_cd");
        		var reDivrCd = sheetObj.GetCellValue(i, "re_divr_cd");
        		for(var j=0; j<cols2.length; j++){
        			var tmpVal = sheetObj.GetCellValue(i, cols3[j]);
        			if(ComIsEmpty(tmpVal)){
        				//JOO00217 [{?msg1}] {?msg2} not exists in JOO Setup.
        				ComShowCodeMessage("JOO00217", reDivrCd, "Exp/Rev");
        				//ComShowMessage("["+reDivrCd+"] Exp/Rev not exists in JOO Setup.");
        				break;
        			}
        		}
        		
        		tmpVal = sheetObj.GetCellValue(i, "jo_stl_itm_cd");
        		if(ComIsEmpty(tmpVal)){
    				//JOO00217 [{?msg1}] {?msg2} not exists in JOO Setup.
    				ComShowCodeMessage("JOO00217", tmpVal, "Item");
    				//ComShowMessage("["+tmpVal+"] Item not exists in JOO Setup.");
    				return false;
    			}
        		
        		
            	
            }
            
            /*if( sheetObjects[0].RowCount()> 0 ) {
    			for( var i=sheetObjects[0].HeaderRows(); i <= sheetObjects[0].LastRow(); i++ ) {
    				if(sheetObjects[0].GetCellValue(i, "sheet1_yd_cd1") == "" ||  sheetObjects[0].GetCellValue(i, "sheet1_yd_cd2") == "" ){
    					ComShowCodeMessage('PSO00001',"Terminal");
    					return false;    	  		
    				}
    			}
    		}*/
            if(ComGetObjValue(formObj.f_cmd) == MULTI){
                if (!ComShowCodeConfirm("JOO00046")){
                    return false;
                }
        	}
            break;
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

function GetBackEndJobStatus() {
    //alert("UF_GetBackEndJobStatus");
    doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC10);
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
/*
 *  Setting data with integerPlace and decimalPlace
 */
function SetCipherLess(val, integerPlace, decimalPlace){
    val = val+"";
    var arrVal=val.split(".");
    if(arrVal.length == 1){
        if(arrVal[0].length > integerPlace){
            ComShowCodeMessage("JOO00199", "[The Part Of The Integer]", "[Less Than or Equal To " + integerPlace + "-Digit]");
            return false;
        }
    } else if(arrVal.length == 2){
        if(arrVal[0].length > integerPlace){
            ComShowCodeMessage("JOO00199", "[The Part Of The Integer]", "[Less Than or Equal To " + integerPlace + "-Digit]");
            return false;
        }
        if(arrVal[1].length > decimalPlace){
            ComShowCodeMessage("JOO00199", "[The Part Of The Decimal]", "[Less Than or Equal To " + decimalPlace + "-Digit]");
            return false;
        }
    }   
    return true;
}


function setExcelUpload(){
	setRefresh();
}
//팝업에서 재호출 하기 위한 함수.
function setRefresh(){ 
	ComFireEvent(ComGetObject("btn_Retrieve") ,"click");
	//doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}
function resizeSheet() {
    ComResizeSheet(sheetObjects[0]);
}
function openCreateInvoice() {
	// popup open
	var sUrl = "/opuscntr/FNS_JOO_0207.do?thea_stl_grp_no="+theaStlGrpNo+"&vndr_seq="+vndrSeq+"&cust_cnt_cd_seq="+custCntCdSeq;
	
	
    ComOpenPopup(sUrl, 1000, 600,"setInvoice", "0,0", true, false, 0, 0, 0, "FNS_JOO_0207");
	gPopup			= false;
	theaStlGrpNo	= "";
	vndrSeq			= "";
	custCntCdSeq	= "";
	
}
function setInvoice(){
	doActionIBSheet(sheetObjects[0], document.form, MODIFY);
	setRefresh();
}

function checkTheaInvTgt(sheetObj) {
	with(sheetObj){
		var rtn		= true;
		var chkCnt	= 0;
		
		if(RowCount() > 0){
			for(var i=HeaderRows(); i<=LastRow(); i++) {
				if(GetCellValue(i, "stl_tgt_flg") == 1 && GetCellValue(i, "inv_no") == "" && GetCellValue(i, "chk_del_flg") == "Y"){
					chkCnt++;
				}
			}
			
			if(chkCnt < 1){
				rtn = false;
			}
		}else{
			rtn = false;
		}
	}
	return rtn;
}

function checkVndrCustCurr(sheetObj) {
	with(sheetObj){
		var rtn		= true;
		var chkCnt	= 0;
		var tmpStr1	= "";
		var tmpStr2	= "";
		
		if(RowCount() > 0){
			for(var i=HeaderRows(); i<=LastRow(); i++) {
				if(GetCellValue(i, "stl_tgt_flg") == 1 && GetCellValue(i, "inv_no") == "" && GetCellValue(i, "chk_del_flg") == "Y"){
					if(chkCnt < 1){
						tmpStr1 = GetCellValue(i, "vndr_seq") + GetCellValue(i, "cust_cnt_cd") + GetCellValue(i, "cust_seq") + GetCellValue(i, "locl_curr_cd");
					}else{
						tmpStr2 = GetCellValue(i, "vndr_seq") + GetCellValue(i, "cust_cnt_cd") + GetCellValue(i, "cust_seq") + GetCellValue(i, "locl_curr_cd");
						if(tmpStr1 != tmpStr2){
							rtn = false;
							break;
						}
					}
					chkCnt++;
				}
			}
		}else{
			rtn = false;
		}
	}
	return rtn;
}

function setTheaStlGrpNoChkKey(sheetObj) {

	// THEA_STL_GRP_NO 설정을 위한 비교 후 셋팅
	with(sheetObj){
		for(var i=HeaderRows(); i<=LastRow(); i++) {
			if(GetCellValue(i, "stl_tgt_flg") == 1 && GetCellValue(i, "inv_no") == "" && GetCellValue(i, "chk_del_flg") == "Y"){
				SetCellValue(i, "thea_stl_grp_no", theaStlGrpNo , 0);
				
				if(vndrSeq == ""){
					vndrSeq			= GetCellValue(i, "vndr_seq");
					custCntCdSeq	= GetCellValue(i, "cust_cnt_cd_seq");
				}
			}
		}
	}
}
