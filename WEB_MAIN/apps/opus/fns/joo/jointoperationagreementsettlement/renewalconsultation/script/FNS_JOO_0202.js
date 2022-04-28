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
			case "btn_FileTemplate":
				doActionIBSheet(sheetObjects[1], formObj, IBDOWNEXCEL);
				break;	
	        case "btn_FileImport":
	        	doActionIBSheet(sheetObject, formObj, IBLOADEXCEL);
	        	break;
	        	
	        case "btn_Verify" :
	        	ComSetObjValue(formObj.job_key, "");
            	ComSetObjValue(formObj.job_flg, "");
                doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC01);
	        	break;
            case "btn_New":
            	ComSetObjValue(formObj.job_key, "");
            	ComSetObjValue(formObj.job_flg, "");
                sheetObjects[0].RemoveAll();
                sheetObjects[1].RemoveAll();
                break;
            case "btn_Save":
                ComSetObjValue(formObj.job_key, "");
            	ComSetObjValue(formObj.job_flg, "");
                doActionIBSheet(sheetObjects[0], formObj, IBSAVE);
                break;
                
            case "btn_DownExcel":
                if(sheetObjects[0].RowCount() < 1){//no data
                    ComShowCodeMessage("COM132501");
                }else{
                    sheetObjects[0].Down2Excel({DownCols : makeHiddenSkipCol(sheetObjects[0]), SheetDesign : 1, Merge : 1});
                }
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
                        sheetObjects[0].RowDelete(chkRow, false);
                        
                        /*var tmpChkDel     = sheetObjects[0].GetCellValue(chkRow, "chk_del_flg");
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
                        }*/
                    }
                }
                sheetObjects[0].ReNumberSeq();

                sheetObjects[0].RenderSheet(1);                
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
    //doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}
function initControl() {
	ComEnableObject(document.form.btn_Save, false); //비활성.
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
                var HeadTitle1 ="|Del|No|Dummy\nFlag|VVD or Vessel\n(for dummy)|Activity\nDate|Trade|Partner|Curr.|Rev/Exp|Item|Amount|Remark|Validation message";
                    HeadTitle1 +="|rlane_cd|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd|rev_yrmon|stl_vvd_seq|act_dt|st_dt|end_dt|trd_cd|acct_cd|auth_ofc_cd|valid_col_cd|valid_cd|valid_nm|valid_row|thea_stl_flg";
                
                var headCount=ComCountHeadTitle(HeadTitle1);
                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
                var info    = { Sort:0, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"}];
                InitHeaders(headers, info);
    
                var cols = [ 
                       {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
                       {Type:"CheckBox",  Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"del_chk" },
                       {Type:"Seq",       Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"" },
                       {Type:"Text",  	  Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"dummy_flg",		KeyField:0,   CalcLogic:"",   Format:"",            UpdateEdit:0,   InsertEdit:0,	EditLen:1},
                       {Type:"Text", 	  Hidden:0, Width:100, 	Align:"Center",  ColMerge:0,   SaveName:"rev_vvd",          KeyField:0,   CalcLogic:"",   Format:"",            UpdateEdit:0,   InsertEdit:1,	EditLen:9 },
                       {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"act_dt",           KeyField:0,   CalcLogic:"",   Format:"Ymd",         UpdateEdit:0,   InsertEdit:0,	EditLen:8 },
                       {Type:"Text",      Hidden:0, Width:60,   Align:"Center",  ColMerge:0,   SaveName:"trd_cd",           KeyField:0,   CalcLogic:"",   Format:"",            UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text", 	  Hidden:0, Width:60,   Align:"Center",  ColMerge:0,   SaveName:"jo_crr_cd",        KeyField:0,   CalcLogic:"",   Format:"",            UpdateEdit:0,   InsertEdit:1,	EditLen:3 },
                       {Type:"Text",      Hidden:0, Width:60,   Align:"Center",  ColMerge:0,   SaveName:"locl_curr_cd",     KeyField:0,   CalcLogic:"",   Format:"",            UpdateEdit:0,   InsertEdit:1,	EditLen:3 },
                       {Type:"Text",      Hidden:0, Width:70,   Align:"Center",  ColMerge:0,   SaveName:"re_divr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            UpdateEdit:0,   InsertEdit:1,	EditLen:1 },
                       {Type:"Text", 	  Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:"jo_stl_itm_cd",    KeyField:0,   CalcLogic:"",   Format:"",            UpdateEdit:0,   InsertEdit:1,	EditLen:3 },
                       {Type:"Float",     Hidden:0, Width:120,  Align:"Right",   ColMerge:0,   SaveName:"act_amt",          KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Text",      Hidden:0, Width:200,  Align:"Left",    ColMerge:0,   SaveName:"stl_rmk",          KeyField:0,   CalcLogic:"",   Format:"",            UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Text",      Hidden:0, Width:200,  Align:"Left",    ColMerge:0,   SaveName:"valid_msg",        KeyField:0,   CalcLogic:"",   Format:"",            UpdateEdit:0,   InsertEdit:0 },

                       {Type:"Text",      Hidden:1, Width:0,   Align:"Center",   ColMerge:0,   SaveName:"rlane_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
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
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"valid_col_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"valid_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"valid_nm",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"valid_row",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"thea_stl_flg",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }
                       
                       ];
                 
                InitColumns(cols);
                SetColProperty(0    , "dummy_flg"       , {AcceptKeys:"E" , InputCaseSensitive:1});
                SetColProperty(0    , "rev_vvd"       	, {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0    , "trd_cd"       	, {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0    , "rlane_cd"        , {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0    , "jo_crr_cd"       , {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0    , "locl_curr_cd"    , {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0    , "re_divr_cd"      , {AcceptKeys:"E" , InputCaseSensitive:1});
                SetColProperty(0    , "jo_stl_itm_cd"   , {AcceptKeys:"E|N|[-_/,() &]" , InputCaseSensitive:1});
                
                SetEditable(1);
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
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"rlane_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            //{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"trd_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"vsl_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"skd_voy_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"skd_dir_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"rev_dir_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"rev_yrmon",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"stl_vvd_seq",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            //{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"act_dt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"st_dt",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"end_dt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"acct_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"valid_col_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"valid_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"valid_nm",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"valid_msg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }
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

		case IBDOWNEXCEL:
			sheetObj.Down2Excel( {DownCols: makeHiddenSkipCol(sheetObj), SheetDesign:1, Merge:1} );
			break;
			
		case IBLOADEXCEL:
			sheetObj.RemoveAll();
			sheetObj.RenderSheet(0);
			sheetObj.LoadExcel({ Mode:"HeaderMatch"} );
			sheetObj.RenderSheet(1);
			setVesselCodeForDummy(sheetObj);
			break;
            
        case IBSEARCH_ASYNC01: //Excel Verify
        	if (!validateForm(sheetObj, formObj, sAction)) {
                return;
            }
        	
            ComOpenWait(true);
            formObj.f_cmd.value=COMMAND01;
            var param  = ComGetSaveString(sheetObj, true, true);
            	param += "&" + FormQueryString(formObj);
            var sXml = sheetObj.GetSearchData("FNS_JOO_0202GS.do", param);
            
            var jobKey=ComGetEtcData(sXml,"job_key");
            if (jobKey.length > 0) {
                gRefresh = true;
                var job_flg_nm = "VERIFY_XLS";
                if(formObj.p_ui.value == "0206") {
                	job_flg_nm = "VERIFY_0206_XLS";
                } 
                ComSetObjValue(formObj.job_flg, job_flg_nm);
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
            var sXml=sheetObj.GetSearchData("FNS_JOO_0202GS.do", param);
            
            var jobState=ComGetEtcData(sXml, "jb_sts_flg")+"";
            
            // 2 : processing, 3:success , 4:fail
            if (jobState == "3") {//success
                ComOpenWait(false);
                clearInterval(timer);
                //ComShowCodeMessage("JOO00160"); //Success to execute
                //ComShowMessage("Success to execute.");
                //ComSetObjValue(formObj.job_key, "");
                var jobFlg = ComGetObjValue(formObj.job_flg);
                if(jobFlg == "SAVE_XLS"){
                	ComShowCodeMessage("COM130102", "Settlement Upload"); //'{?msg1} was saved successfully.'
                    ComFireEvent(ComGetObject("btn_Close") ,"click");
                }else if(jobFlg == "VERIFY_XLS" || jobFlg == "VERIFY_0206_XLS"){
                	doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC11);
                	ComEnableObject(document.form.btn_Save, true); //저장 활성.
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
            var sXml=sheetObj.GetSearchData("FNS_JOO_0202GS.do", param);
            sheetObj.LoadSearchData(sXml,{Sync:1} );
            //초기화
            ComSetObjValue(formObj.job_flg, "");
            //ComSetObjValue(formObj.job_key, "");
            break; 
            
        case IBSAVE: // save
            if (!validateForm(sheetObj, formObj, sAction)) {
                return;
            }
            sheetObj.SetWaitImageVisible(0);
            ComOpenWait(true);
            formObj.f_cmd.value = MULTI;
            var param = ComGetSaveString(sheetObj, true, true);
                param += "&" + FormQueryString(formObj);
            var sXml = sheetObj.GetSaveData("FNS_JOO_0202GS.do", param);
            
            var jobKey=ComGetEtcData(sXml, "job_key");
            if (jobKey.length > 0) {
                gRefresh=false;
                ComSetObjValue(formObj.job_flg, "SAVE_XLS");
                ComSetObjValue(formObj.job_key, jobKey);
                sheetObj.SetWaitImageVisible(0);
                ComOpenWait(true);
                sheetObj.SetWaitTimeOut(10000);
                timer=setInterval(GetBackEndJobStatus, 3000); // action GetBackEndJobStatus function after 3 seconds.
            }
            break;

		case IBROWSEARCH:    // Row Search
			ComSetObjValue(formObj.f_cmd, COMMAND02);
			
			sheetObj.SetCellValue(Row, "valid_col_cd", ColName, 0);
			sheetObj.SetCellValue(Row, "valid_row", Row, 0);
			
			var queryStr  = sheetObj.RowSaveStr(Row);
			    queryStr += "&f_cmd="+ComGetObjValue(formObj.f_cmd);
			
			sheetObj.DoRowSearch(Row, "FNS_JOO_0202GS.do", queryStr, {Sync:2});
		break;
    }
}

function sheet1_OnLoadExcel(sheetObj,result,code, msg) {
	if(isExceedMaxRow(msg))return;
	var formObj = document.form;
	if (result) {
		var iStartRow = sheetObj.HeaderRows();
		var iEndRow = sheetObj.LastRow();
		var isEditable = false;
		var tmpAuthOfcCd = ComGetObjValue(formObj.p_auth_ofc_cd);
		setVesselCodeForDummy(sheetObj);
		for( var i=iStartRow; i <= iEndRow; i++ ) {
			var validCd = "";
			var validMsg = "";
			
			if(ComGetObjValue(formObj.p_ui) == "0206"){
				sheetObj.SetCellValue(i, "thea_stl_flg", "Y", 0);
				sheetObj.SetRowStatus(i, "I");
			}else{
				sheetObj.SetCellValue(i, "thea_stl_flg", "N", 0);
				sheetObj.SetRowStatus(i, "I");
			}
			
			var tmpDummyFlg = sheetObj.GetCellValue(i, "dummy_flg");
			
			
			var tmpActDt = sheetObj.GetCellValue(i, "act_dt");
			var tmpTrdCd = sheetObj.GetCellValue(i, "trd_cd");
			
			var tmpRevVvd = sheetObj.GetCellValue(i, "rev_vvd");
			var tmpJoCrrCd = sheetObj.GetCellValue(i, "jo_crr_cd");
			var tmpLoclCurrCd = sheetObj.GetCellValue(i, "locl_curr_cd");
			var tmpReDivrCd = sheetObj.GetCellValue(i, "re_divr_cd");
			var tmpJoStlItmCd = sheetObj.GetCellValue(i, "jo_stl_itm_cd");
			
			//auth_ofc_cd set
			sheetObj.SetCellValue(i, "auth_ofc_cd", tmpAuthOfcCd, 0);
			
			//JOO00214 {?msg1} is empty.
			if(ComIsNull(tmpRevVvd)){
				validCd = "E";
				validMsg = ComGetMsg("JOO00214", "VVD");				
				setValidMsg(sheetObj, i, validCd, validMsg);
				continue;
			}else if(ComIsNull(tmpJoCrrCd)){
				validCd = "E";
				validMsg = ComGetMsg("JOO00214", "Partner");				
				setValidMsg(sheetObj, i, validCd, validMsg);
				continue;
			}else if(ComIsNull(tmpLoclCurrCd)){
				validCd = "E";
				validMsg = ComGetMsg("JOO00214", "Curr.");				
				setValidMsg(sheetObj, i, validCd, validMsg);
				continue;
			}else if(ComIsNull(tmpReDivrCd)){
				validCd = "E";
				validMsg = ComGetMsg("JOO00214", "Rev/Exp");				
				setValidMsg(sheetObj, i, validCd, validMsg);
				continue;
			}else if(ComIsNull(tmpJoStlItmCd)){
				validCd = "E";
				validMsg = ComGetMsg("JOO00214", "Item");				
				setValidMsg(sheetObj, i, validCd, validMsg);
				continue;
			}
			
			if("Y" == tmpDummyFlg){
				if(ComIsNull(tmpActDt)){
					validCd = "E";
					validMsg = ComGetMsg("JOO00214", "Activity Date");				
					setValidMsg(sheetObj, i, validCd, validMsg);
					continue;
				}else if(ComIsNull(tmpTrdCd)){
					validCd = "E";
					validMsg = ComGetMsg("JOO00214", "Trade");				
					setValidMsg(sheetObj, i, validCd, validMsg);
					continue;
				}
			}
			
			if("Y" == tmpDummyFlg){
				if(tmpRevVvd.length != 4){
					validCd = "E";
					validMsg = ComGetMsg("JOO00206", tmpRevVvd, "VVD");				
					setValidMsg(sheetObj, i, validCd, validMsg);
					continue;
				}
			}else{
				//JOO00206 [{?msg1}] {?msg2} is missing.
				if(tmpRevVvd.length != 9){
					validCd = "E";
					validMsg = ComGetMsg("JOO00206", tmpRevVvd, "VVD");				
					setValidMsg(sheetObj, i, validCd, validMsg);
					continue;
				}
			}
			
			if(tmpJoCrrCd.length < 3){
				validCd = "E";
				validMsg = ComGetMsg("JOO00206", tmpJoCrrCd, "Partner");				
				setValidMsg(sheetObj, i, validCd, validMsg);
				continue;
			}else if(tmpLoclCurrCd.length < 3){
				validCd = "E";
				validMsg = ComGetMsg("JOO00206", tmpLoclCurrCd, "Curr.");				
				setValidMsg(sheetObj, i, validCd, validMsg);
				continue;
			}else if(tmpReDivrCd.length != 1){
				validCd = "E";
				validMsg = ComGetMsg("JOO00206", tmpReDivrCd, "Rev/Exp");				
				setValidMsg(sheetObj, i, validCd, validMsg);
				continue;
			}
			
			if("Y" != tmpDummyFlg){
				//normal
				sheetObj.SetCellEditable(i, "act_dt", false);
				sheetObj.SetCellEditable(i, "trd_cd", false);
			}else{
				//dummy
				sheetObj.SetCellEditable(i, "act_dt", true);
				sheetObj.SetCellEditable(i, "trd_cd", true);
			}
		}
		// Remove Dup Check : 2018-05-16
		//setCheckDuplicatedData(sheetObj);
		ComEnableObject(document.form.btn_Save, false); //비활성.

		//setShowValidMessage(sheetObj);
	}
	
}

function setValidMsg(sheetObj, Row, validCd, ValidMsg){
	sheetObj.SetCellValue(Row, "valid_cd", validCd , 0);
	sheetObj.SetCellValue(Row, "valid_msg", ValidMsg, 0);
	
	setSheetCellConfig(sheetObj, Row);
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
		    case "rev_vvd" :
		    case "act_dt" :
		    case "trd_cd" :
		    case "jo_crr_cd" :
		    case "re_divr_cd" :
		    case "locl_curr_cd" :
		    case "jo_stl_itm_cd":
		    	//sheetObjects[1].RemoveAll();
	    		doActionIBSheet(sheetObjects[0], document.form, IBROWSEARCH, Row, colName);
		    	break;
	    }
    }else{
    	switch (colName) {
		    case "rev_vvd" :
		    case "jo_crr_cd" :
		    case "re_divr_cd" :
		    case "locl_curr_cd" :
		    case "jo_stl_itm_cd":
		    	//sheetObjects[1].RemoveAll();
	    		doActionIBSheet(sheetObjects[0], document.form, IBROWSEARCH, Row, colName);
		    	break;
    	}
    }
}

function setSheetEndConfig(sheetObj, Row){
	if (sheetObj.RowCount() > 0) {
        var iHeadRow = sheetObj.HeaderRows();
        var iLastRow = sheetObj.LastRow();
        
        for( var i=iHeadRow; i <= iLastRow; i++ ) {
        	setSheetCellConfig(sheetObj, i);
        }
    }
}

//var COLOR_RED = "#FF0000";
//var COLOR_BLACK = "#000000";
//var COLOR_BLUE = "#8fd8ef";
function setSheetCellConfig(sheetObj, Row){
	if (sheetObj.RowCount() > 0) {
		var cols = "";
		var isEditable = true;
		var tmpValidCd = sheetObj.GetCellValue(Row, "valid_cd");
		if(ComIsEmpty(tmpValidCd)) tmpValidCd = "E";
		
		setSheetDefaultCellEditable(sheetObj, Row);
		
		switch(tmpValidCd){
			case "E" :
				sheetObj.SetCellFontColor(Row, "valid_msg", COLOR_RED);
				isEditable = true;
				break;
			case "I" :
			case "U" :
				sheetObj.SetCellFontColor(Row, "valid_msg", COLOR_BLUE);
				isEditable = false;
				break;
			case "S" :
				sheetObj.SetCellFontColor(Row, "valid_msg", COLOR_BLACK);
				isEditable = false;
				break;
		}
		
		//celledit 설정
		var cols  = "rev_vvd|jo_crr_cd|locl_curr_cd|re_divr_cd|jo_stl_itm_cd";
	
		var tmpDummyFlg = sheetObj.GetCellValue(Row, "dummy_flg");
		if("Y" == tmpDummyFlg) cols = "rev_vvd|act_dt|trd_cd|jo_crr_cd|locl_curr_cd|re_divr_cd|jo_stl_itm_cd";
		
		var arrCols = cols.split("|");
		for(var j=0; j<arrCols.length; j++){
			sheetObj.SetCellEditable(Row, arrCols[j], isEditable);
		}
		
	}
}

function setSheetDefaultCellEditable(sheetObj, Row){
	var tmpDummyFlg = sheetObj.GetCellValue(Row, "dummy_flg");	

	var allEditFalse  = "rev_vvd|act_dt|trd_cd|jo_crr_cd|locl_curr_cd|re_divr_cd|jo_stl_itm_cd";
	var arrAllFalseCols = allEditFalse.split("|");
	for(var j=0; j<arrAllFalseCols.length; j++){
		sheetObj.SetCellEditable(Row, arrAllFalseCols[j], false);
	}
	
	if("Y" == tmpDummyFlg){
		var dummyEditTrue  = "rev_vvd|act_dt|trd_cd|jo_crr_cd|locl_curr_cd|re_divr_cd|jo_stl_itm_cd";
		
		var arrTrueCols = dummyEditTrue.split("|");
		for(var j=0; j<arrTrueCols.length; j++){
			sheetObj.SetCellEditable(Row, arrTrueCols[j], true);
		}
	}else{
		var normalEditTrue  = "rev_vvd|jo_crr_cd|locl_curr_cd|re_divr_cd|jo_stl_itm_cd";
				
		var arrTrueCols = normalEditTrue.split("|");
		for(var j=0; j<arrTrueCols.length; j++){
			sheetObj.SetCellEditable(Row, arrTrueCols[j], true);
		}
	}	
}


function setShowValidMessage(sheetObj){
	if (sheetObj.RowCount() > 0) {
		var iError = 0;
		var iSuccess = 0;
		var iWarning = 0;
		
		var iHeadRow = sheetObj.HeaderRows();
        var iLastRow = sheetObj.LastRow();

        for( var i=iHeadRow; i <= iLastRow; i++ ) {
        	var tmpValidCd = sheetObj.GetCellValue(i, "valid_cd");
    		if(ComIsEmpty(tmpValidCd)) tmpValidCd = "E";
    		
    		switch(tmpValidCd){
    			case "E" :
    				iError++;
    				break;
    			case "I" :
    			case "U" :
    				iWarning++;
    				break;
    			case "S" :
    				iSuccess++;
    				break;
    		}
        }
        
        var vaildCountMsg  = "Total     : "+iLastRow;
            vaildCountMsg += "\n Success : "+iSuccess;
            vaildCountMsg += "\n Warning : "+iWarning;
            vaildCountMsg += "\n Error   : "+iError;
            
            ComShowMessage(vaildCountMsg);
	}
}

function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
	var formObj = document.form;
	var f_cmd = ComGetObjValue(formObj.f_cmd);
	if (sheetObj.RowCount() > 0) {
		// Remove Dup check : 2018-05-16
		//setCheckDuplicatedData(sheetObj);//Dup message 처리.
		
		if(f_cmd == COMMAND02){
			setSheetCellConfig(sheetObj, gSelRow);
			gSelRow = "";
		}else{
		    setSheetEndConfig(sheetObj);
		    //setShowValidMessage(sheetObj);
		}
	}
}
function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
}
function sheet1_OnSelectCell(sheetObj, OldRow, OldCol, NewRow, NewCol) {
}

function setVesselCodeForDummy(sheetObj){
	var iStRow = sheetObj.HeaderRows();
    var iEdRow = sheetObj.LastRow();

    
    for( var i=iStRow; i <= iEdRow; i++ ) {
        var sRevVvd = sheetObj.GetCellValue(i, "rev_vvd");
        var sVslCd = sheetObj.GetCellValue(i, "vsl_cd");
        
    	if(!ComIsEmpty(sRevVvd) && ComIsEmpty(sVslCd)){
    		sheetObj.SetCellValue(i,"vsl_cd",sRevVvd.substring(0,4));
    	}
    }
}

function setCheckDuplicatedData(sheetObj, sAction){
	var iStRow = sheetObj.HeaderRows();
    var iEdRow = sheetObj.LastRow();
    var tmpDupRows = new Array();
    
    for( var i=iStRow; i <= iEdRow; i++ ) {
    	var ibflag 	= sheetObj.GetCellValue(i, "ibflag");
    	var validCd = sheetObj.GetCellValue(i, "valid_cd");
    	if("R" == ibflag || "D" == ibflag || "E" == validCd) continue;
    	var tmpVal = "";

    	var sDummyFlg 	= sheetObj.GetCellValue(i, "dummy_flg");
    	var sRevVvd 	= sheetObj.GetCellValue(i, "rev_vvd");
    	var sVslCd		= sheetObj.GetCellValue(i, "vsl_cd");
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
	    	var tVslCd		= sheetObj.GetCellValue(j, "vsl_cd");
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
        		if(sDummyFlg == tDummyFlg && sVslCd == tVslCd && sActDt == tActDt && sTrdCd == tTrdCd && sJoCrrCd == tJoCrrCd && sLoclCurrCd == tLoclCurrCd && sReDivrCd == tReDivrCd && sJoStlItmCd == tJoStlItmCd){
            		tmpDupRows.push(j);
            	}
        	}else{
        		if(sDummyFlg == tDummyFlg && sRevVvd == tRevVvd && sRlaneCd == tRlaneCd && sTrdCd == tTrdCd && sJoCrrCd == tJoCrrCd && sLoclCurrCd == tLoclCurrCd && sReDivrCd == tReDivrCd && sJoStlItmCd == tJoStlItmCd){
            		tmpDupRows.push(j);
            	}
        	}
    	}
    }
    
	if(sAction == IBSAVE){
		//message 처리 후 리턴
		var tmpDupRowStr = tmpDupRows.join();
        if(!ComIsEmpty(tmpDupRowStr)){
        	ComShowCodeMessage("COM12115", "[ "+tmpDupRowStr+" ] Row");
        	return false;
        }
	}else{
		//체크 후 Message에 Dup 처리.
		var dupMsg = ComGetMsg("JOO00223");
		var tmpDupRowStr = tmpDupRows.join();
	    if(!ComIsEmpty(tmpDupRowStr)){
	    	var arrDupRows = tmpDupRowStr.split(FIELDMARK); // , 구분자.
	    	for(var i=0; i<=arrDupRows.length; i++){
	    		var dupRow = arrDupRows[i];
	    		sheetObj.SetCellValue(dupRow, "valid_cd", "E", 0);
	    		sheetObj.SetCellValue(dupRow, "valid_msg", dupMsg, 0); // Duplicated
	    		
	    		setSheetCellConfig(sheetObj, dupRow);
	    	}
	    }
	}
    
    return true;
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
            
            /*
            // User 요청에 따라 Duplication 허용 - 2018-05-16
            if(!setCheckDuplicatedData(sheetObj, sAction)) return false;
            */
            
            /*
            //화면에 입력된 데이타 DUP 체크
            var duprows = sheetObj.ColValueDupRows("rev_vvd|rlane_cd|jo_crr_cd|re_divr_cd|jo_stl_itm_cd",{"IncludeDelRow" : 0});
            //var arrDupRows = duprows.split(“,”);
            if(!ComIsEmpty(duprows)){
            	ComShowCodeMessage("COM12115", "[ "+duprows+" ] Row");
            	return false;
            }*/
            
            var iStRow = sheetObj.HeaderRows();
            var iEdRow = sheetObj.LastRow();
            var tmpDupRows = new Array();
            
            for( var i=iStRow; i <= iEdRow; i++ ) {
            	var ibflag = sheetObj.GetCellValue(i, "ibflag");
            	var dummyFlg = sheetObj.GetCellValue(i, "dummy_flg");
            	var validCd = sheetObj.GetCellValue(i, "valid_cd");
            	if("R" == ibflag || "D" == ibflag || "E" == validCd) continue;
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
                        
            if (!ComShowCodeConfirm("JOO00046")){
                return false;
            }
            break;
    }
    return true;
}

function GetBackEndJobStatus() {
    //alert("UF_GetBackEndJobStatus");
    doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC10);
}
function resizeSheet() {
    ComResizeSheet(sheetObjects[0]);
}
