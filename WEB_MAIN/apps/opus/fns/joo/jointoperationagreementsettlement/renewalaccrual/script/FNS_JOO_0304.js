/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : FNS_JOO_0304.js
 *@FileTitle : Inquiry By VVD
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
var gRefresh = false;

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
            	//년월 3개월이상일때는 Backendjob으로 조회한다.
                //to 에서 -3개월의 yrmon을 구해서 from 과 비교해서 같으면 그냥 조회, 틀리면 backendjob 조회.
            	var tmpToYmd = ComGetObjValue(formObj.to_yrmon) + "-02";
                var tmpFrYmd = ComGetDateAdd(tmpToYmd, "M", -2);
                tmpFrYm = JooGetDateFormat(tmpFrYmd,"ym");
                
                var frYm = ComGetObjValue(formObj.fr_yrmon);                
            	
            	ComSetObjValue(formObj.job_key, "");
                sheetObjects[0].RemoveAll();
                
                if(tmpFrYm == frYm){
                	doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
                }else{
                	doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC01);
                }
                //doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC01);
                break;
            case "btn_New":
                initPeriod();
                formObj.match_flg[0].checked = "checked";
                ComSetObjValue(formObj.job_key, "");
                ComSetObjValue(formObj.job_flg, "");
                ComSetObjValue(formObj.vvd, "");
                ComSetObjValue(formObj.re_divr_cd, "");
                gRefresh = false;
                
                sheetObjects[0].RemoveAll();
                comboObjects[0].SetSelectIndex(-1, false);
                comboObjects[1].RemoveAll();
                comboObjects[2].RemoveAll();
                comboObjects[3].SetSelectIndex(0);
                
                //doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
                break;
            case "btn_DownExcel":
                if(sheetObjects[0].RowCount() < 1){//no data
                    ComShowCodeMessage("COM132501");
                }else{
                	sheetObjects[0].Down2Excel({DownCols : makeHiddenSkipCol(sheetObjects[0]), SheetDesign : 1, Merge : 1});
                }
                break;             

            case "btn_fr_back":
                UF_addMonth(formObj.fr_yrmon, -1);
                sheetObjects[0].RemoveAll();
                break;
            case "btn_fr_next":
                if (!GetCheckConditionPeriod()){
                    ComShowCodeMessage("JOO00078");
                    return;
                }
                UF_addMonth(formObj.fr_yrmon, +1);
                sheetObjects[0].RemoveAll();
                break;
            case "btn_to_back":
                if (!GetCheckConditionPeriod()){
                    ComShowCodeMessage("JOO00078");
                    return;
                }
                UF_addMonth(formObj.to_yrmon, -1);
                sheetObjects[0].RemoveAll();
                break;
            case "btn_to_next":
                UF_addMonth(formObj.to_yrmon, +1);
                sheetObjects[0].RemoveAll();
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
    initPeriod(); //TO : 현재 월, FR : 현재 월 - 2 : 3개월전.  
	//axon_event.addListenerForm  ('change'	, 'obj_change'	, form);
}

function initPeriod(){
    var formObj=document.form;
    var tmpNowYmd = ComGetNowInfo("ymd","-"); //ComGetDateAdd(formObj.exe_yrmon.value,"M", 1);
    var tmpNowYm = JooGetDateFormat(tmpNowYmd,"ym");
    
    //From : to -3개월, To : 당월
    ComSetObjValue(formObj.to_yrmon, tmpNowYm);
    
    //년월 만 하면 -3개월이 넘게 설정 되어 동일 월로 설정하기 위해서 2015-07-02 로 Day 를 마춘다.
    var tmpToYmd = ComGetObjValue(formObj.to_yrmon) + "-02";
    var tmpFrYmd = ComGetDateAdd(tmpToYmd, "M", -2);
    tmpFrYm = JooGetDateFormat(tmpFrYmd,"ym");
    //From : to - 3개월
    ComSetObjValue(formObj.fr_yrmon, tmpFrYm);  
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
        		var HeadTitle  = "|Accrual\nMonth|Dummy\nFlag|VVD or Vessel\n(for dummy)|Activity\nMonth|Lane|Trade|Partner|Rev/\nExp.|Item|Estimation|Actual|[1]Accrual|[2]Previous\nAccrual|Interface\n[2]*-1+[1]|Update User|Upate Date";
        		    HeadTitle +="|rev_yrmon|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd|estm_vvd_tp_cd|acct_cd|estm_act_seq|jo_stl_jb_cd|accl_amt_corr_flg";
        		    //HeadTitle +="|sys_src_id|loc_cd|jo_ioc_div_cd|estm_vvd_hdr_id|jo_cntr_div_ctnt|cntr_blk_div_cd|accl_amt_corr_flg";
        		
                var headCount=ComCountHeadTitle(HeadTitle);
                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1, FrozenCol:10 } );
                var info    = { Sort:0, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle, Align:"Center"}];
                InitHeaders(headers, info);
    
                var cols = [ 
                       {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
                       {Type:"Text",      Hidden:0, Width:60,   Align:"Center",  ColMerge:0,   SaveName:"exe_yrmon",        KeyField:0,   CalcLogic:"",   Format:"Ym",			PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text", 	  Hidden:0, Width:55,   Align:"Center",  ColMerge:1,   SaveName:"dummy_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text", 	  Hidden:0, Width:95,   Align:"Center",  ColMerge:1,   SaveName:"vvd",          	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:"estm_yrmon",       KeyField:0,   CalcLogic:"",   Format:"Ym",         	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:45,   Align:"Center",  ColMerge:1,   SaveName:"rlane_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:"trd_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text", 	  Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"jo_crr_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"re_divr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:45,   Align:"Center",  ColMerge:1,   SaveName:"jo_stl_itm_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"AutoSum",   Hidden:0, Width:90,   Align:"Right",   ColMerge:0,   SaveName:"estm_amt",         KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"AutoSum",   Hidden:0, Width:90,   Align:"Right",   ColMerge:0,   SaveName:"act_amt",         	KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"AutoSum",   Hidden:0, Width:85,   Align:"Right",   ColMerge:0,   SaveName:"accl_amt",         KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",     Hidden:0, Width:85,   Align:"Right",   ColMerge:0,   SaveName:"pre_accl_amt",     KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",     Hidden:0, Width:80,   Align:"Right",   ColMerge:0,   SaveName:"if_amt",         	KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:85,   Align:"Center",  ColMerge:0,   SaveName:"upd_usr_id",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:0, Width:110,  Align:"Center",  ColMerge:0,   SaveName:"upd_dt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       
    	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"rev_yrmon",         	KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
    	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"vsl_cd",            	KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
    	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"skd_voy_no",        	KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
    	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"skd_dir_cd",        	KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
    	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"rev_dir_cd",        	KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
    	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"estm_vvd_tp_cd",    	KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
    	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"acct_cd",           	KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
    	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"estm_act_seq",      	KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
    	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"jo_stl_jb_cd",      	KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
    	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"accl_amt_corr_flg",   KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 }
                       ];
                 
                InitColumns(cols);
                
                SetEditable(1);
                SetShowButtonImage(1);
                resizeSheet();
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
	        var sXml=sheetObj.GetSearchData("FNS_JOO_0304GS.do", param);
	        
	        var tmpTransResultKey = ComGetEtcData(sXml, "TRANS_RESULT_KEY");
            
            if(tmpTransResultKey == "S"){
            	sheetObj.LoadSearchData(sXml, {Sync:2});
                ComOpenWait(false);
            }else{
                ComOpenWait(false);
            }
	        
	        break;
        case IBSEARCH_ASYNC01: // retrieve
            if (!validateForm(sheetObj, formObj, sAction)) {
                return;
            }
            
            ComOpenWait(true);
            ComSetObjValue(formObj.f_cmd, SEARCH03);
            ComSetObjValue(formObj.job_flg, "RETRIEVE_VVD");
            var param = FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("FNS_JOO_0301GS.do", param);
            
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
            var sXml=sheetObj.GetSearchData("FNS_JOO_0304GS.do", param);
            
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
                }
            } else if (jobState == "4") { // BackEndJob Fail
                ComOpenWait(false);
                clearInterval(timer);
                ComShowMessage("Fail to retrieve.");
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
            var sXml=sheetObj.GetSearchData("FNS_JOO_0304GS.do", param);
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
    }
}

function sheet1_OnSearchEnd(sheetObj, code, msg, stCode, stMsg, responseText) {
	var formObj = document.form;
/*
    if (sheetObj.RowCount() > 0) { //
    	var iHeadRow = sheetObj.HeaderRows();
        var iLastRow = sheetObj.LastRow();
        
        for(var i=iHeadRow ; i <= iLastRow ; i++ ){
            var tmpAdditionEstmFlg    = sheetObj.GetCellValue(i, "accl_amt_corr_flg");
            
            if("Y" == tmpAdditionEstmFlg){
            	sheetObj.SetRowFontColor(i, COLOR_BLUE);
            }
        }
    }
*/
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
    var frDt=formObj.fr_yrmon.value.replaceStr("-","")+"01";
    var toDt=formObj.to_yrmon.value.replaceStr("-","")+"01";
    if (ComGetDaysBetween(frDt, toDt) <= 0){
        return false;
    }   
    return true;
}

function resizeSheet() {
    ComResizeSheet(sheetObjects[0]);
}