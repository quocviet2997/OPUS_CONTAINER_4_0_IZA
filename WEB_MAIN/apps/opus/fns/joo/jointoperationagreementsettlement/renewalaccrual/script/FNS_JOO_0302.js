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
var gSelRow = -1;
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
				var downCols = "dummy_flg|vvd|estm_yrmon|trd_cd|jo_crr_cd|re_divr_cd|jo_stl_itm_cd|estm_amt";
				sheetObject.Down2Excel({DownCols : downCols, SheetDesign : 1, Merge : 1});
				break;	
			case "btn_Retrieve":
				doActionIBSheet(sheetObject, formObj, IBSEARCH);
				break;
	        case "btn_FileImport":
	        	doActionIBSheet(sheetObject, formObj, IBLOADEXCEL);
	        	break;
	        	
	        case "btn_Verify" :
	        	if(sheetObject.RowCount() < 1){//There is no data !
                    ComShowCodeMessage("JOO00143");
                }else{
    	        	ComSetObjValue(formObj.job_key, "");
                	ComSetObjValue(formObj.job_flg, "");
                    doActionIBSheet(sheetObject, formObj, IBSEARCH_ASYNC01);
                }
	        	break;
            case "btn_New":
            	initPeriod();
            	ComSetObjValue(formObj.job_key, "");
            	ComSetObjValue(formObj.job_flg, "");
            	sheetObject.RemoveAll();
                break;
            case "btn_Save":
                ComSetObjValue(formObj.job_key, "");
            	ComSetObjValue(formObj.job_flg, "");
                doActionIBSheet(sheetObject, formObj, IBSAVE);
                break;
                
            case "btn_DownExcel":
                if(sheetObject.RowCount() < 1){//no data
                    ComShowCodeMessage("COM132501");
                }else{
                	sheetObject.Down2Excel({DownCols : makeHiddenSkipCol(sheetObject), SheetDesign : 1, Merge : 1});
                }
                break;  
                
            case "btn_delete":
                var checkedRows=(sheetObject.FindCheckedRow("del_chk")).split("|");
                if (checkedRows == ""){
                    ComShowCodeMessage('JOO00143');
                    return;
                }
                
                sheetObject.RenderSheet(0);
                for(var i=checkedRows.length-1; i >= 0; i--){
                    var chkRow = checkedRows[i];
                    stat=sheetObject.GetRowStatus(chkRow);
                    if (sheetObject.GetRowHidden(chkRow) == false){
                        sheetObject.RowDelete(chkRow, false);
                    }
                }
                sheetObject.ReNumberSeq();
                sheetObject.RenderSheet(1);                
                break;
                
            case "btn_add":
            	sheetObject.RenderSheet(0);
                var Row = sheetObject.DataInsert(-1);
                setSheetCellEditable(sheetObject, Row);
                sheetObject.ReNumberSeq();
                sheetObject.RenderSheet(1); 
                break;
                
            case "btn_insert":
            	sheetObject.RenderSheet(0);
                var Row = sheetObject.DataInsert();
                setSheetCellEditable(sheetObject, Row);
                sheetObject.ReNumberSeq();
                sheetObject.RenderSheet(1); 
                break;

            case "btn_vvd_from_back":
                UF_addMonth(formObj.fr_act_yrmon, -1);
                sheetObject.RemoveAll();
                break;
            case "btn_vvd_from_next":
                if (!GetCheckConditionPeriod()){
                    ComShowCodeMessage("JOO00078");
                    return;
                }
                UF_addMonth(formObj.fr_act_yrmon, +1);
                sheetObject.RemoveAll();
                break;
            case "btn_vvd_to_back":
                if (!GetCheckConditionPeriod()){
                    ComShowCodeMessage("JOO00078");
                    return;
                }
                UF_addMonth(formObj.to_act_yrmon, -1);
                sheetObject.RemoveAll();
                break;
            case "btn_vvd_to_next":
                UF_addMonth(formObj.to_act_yrmon, +1);
                sheetObject.RemoveAll();
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
	initPeriod();
	ComEnableObject(document.form.btn_Save, false); //비활성.
}

function initPeriod(){
    var formObj=document.form;
    var tmpNowYmd = ComGetNowInfo("ymd","-"); //ComGetDateAdd(formObj.exe_yrmon.value,"M", 1);
    var tmpNowYm = JooGetDateFormat(tmpNowYmd,"ym");
    
    //실행월 셋팅 - 당월.
    //ComSetObjValue(formObj.exe_yrmon, tmpNowYm);
    
    //From : to -3개월, To : 당월
    ComSetObjValue(formObj.to_act_yrmon, tmpNowYm);
    
    //년월 만 하면 -3개월이 넘게 설정 되어 동일 월로 설정하기 위해서 2015-07-02 로 Day 를 마춘다.
    var tmpToActYmd = ComGetObjValue(formObj.to_act_yrmon) + "-02";
    var tmpFrActYmd = ComGetDateAdd(tmpToActYmd, "M", -2);
    tmpFrActYm = JooGetDateFormat(tmpFrActYmd,"ym");
    //From : to - 3개월
    ComSetObjValue(formObj.fr_act_yrmon, tmpFrActYm);
    
    //readonly로 변동한다.
    //ComEnableObject(formObj.exe_yrmon, false);
    //ComEnableObject(formObj.btn_exe_back, false);
    //ComEnableObject(formObj.btn_exe_next, false);   
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
                var HeadTitle1 ="|Del|No|Dummy\nFlag|VVD or Vessel\n(for dummy)|Activity\nMonth|Trade|Partner|Rev/Exp|Item|Amount|Validation message";
                    HeadTitle1 +="|exe_yrmon|rev_yrmon|rlane_cd|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd|estm_vvd_tp_cd|acct_cd|estm_act_seq|act_dt|valid_col_cd|valid_cd|valid_nm|valid_row";
                
                var headCount=ComCountHeadTitle(HeadTitle1);
                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
                var info    = { Sort:0, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"}];
                InitHeaders(headers, info);
    
                var cols = [ 
                       {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
                       {Type:"CheckBox",  Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"del_chk" },
                       {Type:"Seq",       Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"seq" },
                       {Type:"Combo",  	  Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"dummy_flg",		KeyField:0,   CalcLogic:"",   Format:"",            UpdateEdit:0,   InsertEdit:1 },
                       {Type:"Text", 	  Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"vvd",              KeyField:0,   CalcLogic:"",   Format:"",            UpdateEdit:0,   InsertEdit:1,	EditLen:9 },
                       {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"estm_yrmon",       KeyField:0,   CalcLogic:"",   Format:"Ym",          UpdateEdit:0,   InsertEdit:0,	EditLen:6 },
                       {Type:"Text",      Hidden:0, Width:60,   Align:"Center",  ColMerge:0,   SaveName:"trd_cd",           KeyField:0,   CalcLogic:"",   Format:"",            UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text", 	  Hidden:0, Width:60,   Align:"Center",  ColMerge:0,   SaveName:"jo_crr_cd",        KeyField:0,   CalcLogic:"",   Format:"",            UpdateEdit:0,   InsertEdit:1,	EditLen:3 },
                       {Type:"Text",      Hidden:0, Width:70,   Align:"Center",  ColMerge:0,   SaveName:"re_divr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            UpdateEdit:0,   InsertEdit:1,	EditLen:1 },
                       {Type:"Text", 	  Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:"jo_stl_itm_cd",    KeyField:0,   CalcLogic:"",   Format:"",            UpdateEdit:0,   InsertEdit:1,	EditLen:3 },
                       {Type:"Float",     Hidden:0, Width:120,  Align:"Right",   ColMerge:0,   SaveName:"estm_amt",         KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
                       {Type:"Text",      Hidden:0, Width:200,  Align:"Left",    ColMerge:0,   SaveName:"valid_msg",        KeyField:0,   CalcLogic:"",   Format:"",            UpdateEdit:0,   InsertEdit:0 },

                       {Type:"Text",      Hidden:1, Width:0,   Align:"Center",   ColMerge:0,   SaveName:"exe_yrmon",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"rev_yrmon",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,   Align:"Center",   ColMerge:0,   SaveName:"rlane_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"vsl_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"skd_voy_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"skd_dir_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"rev_dir_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"estm_vvd_tp_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"acct_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"estm_act_seq",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"act_dt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"valid_col_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"valid_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"valid_nm",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"valid_row",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }
                       
                       ];
                 
                InitColumns(cols);
                SetColProperty(0    , "dummy_flg"      	, {ComboText:"|Y", ComboCode:"|Y"} );
                SetColProperty(0    , "vvd"         	, {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0    , "trd_cd"       	, {AcceptKeys:"E|N" , InputCaseSensitive:1});
                //SetColProperty(0    , "rlane_cd"        , {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0    , "jo_crr_cd"       , {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0    , "re_divr_cd"      , {AcceptKeys:"E" , InputCaseSensitive:1});
                SetColProperty(0    , "jo_stl_itm_cd"   , {AcceptKeys:"E|N|[-_/,() &]" , InputCaseSensitive:1});
                
                SetEditable(1);
             }
            break;
    }
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction, Row, ColName) {
    sheetObj.ShowDebugMsg(false);
    switch (sAction) {
	    case IBSEARCH: //Excel Target List Retrieve(VVD)
	    	if (!validateForm(sheetObj, formObj, sAction)) {
	            return;
	        }
	    	
	    	ComOpenWait(true);
            ComSetObjValue(formObj.f_cmd	, SEARCH);
            ComSetObjValue(formObj.job_flg	, "RETRIEVE_XLS");
            ComSetObjValue(formObj.job_key	, "");
            var param  = FormQueryString(formObj);
            var sXml = sheetObj.GetSearchData("FNS_JOO_0302GS.do", param);
            
            var jobKey=ComGetEtcData(sXml,"job_key");
            if (jobKey.length > 0) {
                ComSetObjValue(formObj.job_flg, "RETRIEVE_XLS");
                ComSetObjValue(formObj.job_key, jobKey);
                sheetObj.SetWaitImageVisible(0);
                ComOpenWait(true);
                sheetObj.SetWaitTimeOut(10000);
                timer = setInterval(GetBackEndJobStatus, 3000); // action GetBackEndJobStatus function after 3 seconds.
            }
        	break;
	    	
	    	
	    	break;
		case IBLOADEXCEL:
			sheetObj.RemoveAll();
			sheetObj.RenderSheet(0);
			sheetObj.LoadExcel({ Mode:"HeaderMatch"} );
			sheetObj.RenderSheet(1);
			break;
            
        case IBSEARCH_ASYNC01: //Excel Verify
        	if (!validateForm(sheetObj, formObj, sAction)) {
                return;
            }
            
            ComOpenWait(true);
            ComSetObjValue(formObj.f_cmd	, COMMAND01);
            ComSetObjValue(formObj.job_flg	, "VERIFY_XLS");
            ComSetObjValue(formObj.job_key	, "");
            
            var param  = ComGetSaveString(sheetObj, true, true);
            	param += "&" + FormQueryString(formObj);
            var sXml = sheetObj.GetSearchData("FNS_JOO_0302GS.do", param);
            
            var jobKey=ComGetEtcData(sXml,"job_key");
            if (jobKey.length > 0) {
                ComSetObjValue(formObj.job_flg, "VERIFY_XLS");
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
            var sXml=sheetObj.GetSearchData("FNS_JOO_0302GS.do", param);
            
            var jobState=ComGetEtcData(sXml, "jb_sts_flg")+"";
            
            // 2 : processing, 3:success , 4:fail
            if (jobState == "3") {//success
                ComOpenWait(false);
                clearInterval(timer);
                //ComShowCodeMessage("JOO00160"); //Success to execute
                //ComShowMessage("Success to execute.");
                //ComSetObjValue(formObj.job_key, "");
                var jobFlg = ComGetObjValue(formObj.job_flg);
                if(jobFlg == "RETRIEVE_XLS"){
                	doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC11); // Result 조회.
                }else if(jobFlg == "SAVE_XLS"){
                	ComShowCodeMessage("COM130102", "Estimation Upload"); //'{?msg1} was saved successfully.'
                    ComFireEvent(ComGetObject("btn_Close") ,"click");
                }else if(jobFlg == "VERIFY_XLS" || jobFlg == "DUP_XLS"){
                	doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC11); // Result 조회.
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
            var sXml=sheetObj.GetSearchData("FNS_JOO_0302GS.do", param);
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
            ComSetObjValue(formObj.f_cmd	, MULTI);
            ComSetObjValue(formObj.job_flg	, "SAVE_XLS");
            ComSetObjValue(formObj.job_key	, "");
            
            var param = ComGetSaveString(sheetObj, true, true);
                param += "&" + FormQueryString(formObj);
            var sXml = sheetObj.GetSaveData("FNS_JOO_0302GS.do", param);
            
            var jobKey=ComGetEtcData(sXml, "job_key");
            if (jobKey.length > 0) {
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
			var tmpExeYrmon = ComTrimAll(ComGetObjValue(formObj.exe_yrmon), " ", "-", ":");
			sheetObj.SetCellValue(Row, "exe_yrmon"		, tmpExeYrmon	, 0);
			sheetObj.SetCellValue(Row, "valid_col_cd"	, ColName		, 0);
			sheetObj.SetCellValue(Row, "valid_row"		, Row			, 0);
			
			var queryStr  = sheetObj.RowSaveStr(Row);
			    queryStr += "&f_cmd="+ComGetObjValue(formObj.f_cmd);
			
			sheetObj.DoRowSearch(Row, "FNS_JOO_0302GS.do", queryStr, {Sync:2});
		break;
    }
}

function sheet1_OnLoadExcel(sheetObj,result,code, msg) {
	if(isExceedMaxRow(msg))return;
	var formObj = document.form;
	if (result) {
		var iStartRow 	= sheetObj.HeaderRows();
		var iEndRow 	= sheetObj.LastRow();
		var isEditable 	= false;
		
		var tmpExeYrmon = ComTrimAll(ComGetObjValue(formObj.exe_yrmon), " ", "-", ":");
		
		for( var i=iStartRow; i <= iEndRow; i++ ) {
			var validCd = "";
			var validMsg = "";
			
			var tmpDummyFlg 	= sheetObj.GetCellValue(i, "dummy_flg");
			
			var tmpEstmYrmon 	= sheetObj.GetCellValue(i, "estm_yrmon");
			var tmpTrdCd 		= sheetObj.GetCellValue(i, "trd_cd");
			
			var tmpVvd 			= sheetObj.GetCellValue(i, "vvd");
			var tmpJoCrrCd 		= sheetObj.GetCellValue(i, "jo_crr_cd");
			var tmpReDivrCd 	= sheetObj.GetCellValue(i, "re_divr_cd");
			var tmpJoStlItmCd 	= sheetObj.GetCellValue(i, "jo_stl_itm_cd");
			
			//exe_yrmon set
			sheetObj.SetCellValue(i, "exe_yrmon", tmpExeYrmon, 0);
			
			//JOO00214 {?msg1} is empty.
			if(ComIsNull(tmpVvd)){
				validCd = "E";
				validMsg = ComGetMsg("JOO00214", "VVD");				
				setValidMsg(sheetObj, i, validCd, validMsg);
				continue;
			}else if(ComIsNull(tmpJoCrrCd)){
				validCd = "E";
				validMsg = ComGetMsg("JOO00214", "Partner");				
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
				//dummy case
				if(ComIsNull(tmpEstmYrmon)){
					validCd = "E";
					validMsg = ComGetMsg("JOO00214", "Activity Month");				
					setValidMsg(sheetObj, i, validCd, validMsg);
					continue;
				}else if(ComIsNull(tmpTrdCd)){
					validCd = "E";
					validMsg = ComGetMsg("JOO00214", "Trade");				
					setValidMsg(sheetObj, i, validCd, validMsg);
					continue;
				}
				
				if(tmpVvd.length != 4){
					validCd = "E";
					validMsg = ComGetMsg("JOO00206", tmpVvd, "VVD");				
					setValidMsg(sheetObj, i, validCd, validMsg);
					continue;
				}
			}else{
				//normal case
				//Activity Month, Trade 데이타 존재시 초기화 함.
				if(!ComIsNull(tmpEstmYrmon)) sheetObj.SetCellValue(i, "estm_yrmon", "", 0);
				if(!ComIsNull(tmpTrdCd)) sheetObj.SetCellValue(i, "trd_cd", "", 0);
				
				//JOO00206 [{?msg1}] {?msg2} is missing.
				if(tmpVvd.length != 9){
					validCd = "E";
					validMsg = ComGetMsg("JOO00206", tmpVvd, "VVD");				
					setValidMsg(sheetObj, i, validCd, validMsg);
					continue;
				}
			}
			
			if(tmpJoCrrCd.length < 3){
				validCd = "E";
				validMsg = ComGetMsg("JOO00206", tmpJoCrrCd, "Partner");				
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
				sheetObj.SetCellEditable(i, "estm_yrmon"	, false);
				sheetObj.SetCellEditable(i, "trd_cd"		, false);
			}else{
				//dummy
				sheetObj.SetCellEditable(i, "estm_yrmon"	, true);
				sheetObj.SetCellEditable(i, "trd_cd"		, true);
			}
			
			
		}
		setCheckDuplicatedList(sheetObj);
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
		    case "dummy_flg" :
	    		//기등록된 데이타 초기화 한다.
	    		setSheetCellEditable(sheetObj, Row, Col);
	    		setSheetCellInitData(sheetObj, Row, colName);
	    		break;
		    case "vvd" :
		    case "estm_yrmon" :
		    case "trd_cd" :
		    	var vvd 		= sheetObj.GetCellValue(Row, "vvd");
		    	var estmYrmon 	= sheetObj.GetCellValue(Row, "estm_yrmon");
	    		var trdCd 		= sheetObj.GetCellValue(Row, "trd_cd");
		    	if(ComIsEmpty(vvd) || vvd.length != 4){ 
	    			//normal case
	    			if(ComIsEmpty(Value)){
	        			ComShowCodeMessage("JOO00116", "VVD");
	        		}else if(Value.length != 9){
	        			ComShowCodeMessage("COM132201", "VVD");
	        		}	        		
	        		//초기화.
	    			sheetObj.SetCellValue(Row, colName, OldValue, 0);
	        	}else if(!ComIsEmpty(estmYrmon) && !ComIsEmpty(trdCd)){
	        		doActionIBSheet(sheetObjects[0], document.form, IBROWSEARCH, Row, colName);
	        	}
		    	break;
		    case "jo_crr_cd" :
		    case "re_divr_cd" :
		    case "jo_stl_itm_cd":
		    	var vvd = sheetObj.GetCellValue(Row, "vvd");
		    	if(ComIsEmpty(vvd) || vvd.length != 4){ 
	    			//normal case
	    			if(ComIsEmpty(Value)){
	        			ComShowCodeMessage("JOO00116", "VVD");
	        		}else if(Value.length != 9){
	        			ComShowCodeMessage("COM132201", "VVD");
	        		}	        		
	        		//초기화.
	    			sheetObj.SetCellValue(Row, colName, OldValue, 0);
	        	}else{
	        		doActionIBSheet(sheetObjects[0], document.form, IBROWSEARCH, Row, colName);
	        	}
		    	break;
	    }
    }else{
    	switch (colName) {
    		case "dummy_flg" :
	    		//기등록된 데이타 초기화 한다.
	    		setSheetCellEditable(sheetObj, Row, Col);
	    		setSheetCellInitData(sheetObj, Row, colName);
	    		break;
		    case "vvd" :
		    	var vvd 		= sheetObj.GetCellValue(Row, "vvd");
		    	if(ComIsEmpty(Value) || Value.length != 9){ 
	    			//normal case
	    			if(ComIsEmpty(Value)){
	        			ComShowCodeMessage("JOO00116", "VVD");
	        		}else if(Value.length != 9){
	        			ComShowCodeMessage("COM132201", "VVD");
	        		}	        		
	        		//초기화.
	    			sheetObj.SetCellValue(Row, colName, OldValue, 0);
	        	}else{
	        		doActionIBSheet(sheetObjects[0], document.form, IBROWSEARCH, Row, colName);
	        	}
	            break;
		    case "jo_crr_cd" :
		    case "re_divr_cd" :
		    case "jo_stl_itm_cd":
		    	//sheetObjects[1].RemoveAll();
		    	var vvd = sheetObj.GetCellValue(Row, "vvd");
		    	if(ComIsEmpty(vvd) || vvd.length != 9){ 
	    			//normal case
	    			if(ComIsEmpty(Value)){
	        			ComShowCodeMessage("JOO00116", "VVD");
	        		}else if(Value.length != 9){
	        			ComShowCodeMessage("COM132201", "VVD");
	        		}	        		
	        		//초기화.
	    			sheetObj.SetCellValue(Row, colName, OldValue, 0);
	        	}else{
	        		doActionIBSheet(sheetObjects[0], document.form, IBROWSEARCH, Row, colName);
	        	}
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
function setSheetCellEditable(sheetObj, Row, Col){
	var tmpDummyFlg    = sheetObj.GetCellValue(Row, "dummy_flg");
	var editTrueCols 	= "";
	var editFalseCols 	= "";
	if("Y" == tmpDummyFlg){
		//dummy case
		editTrueCols = "dummy_flg|vvd|estm_yrmon|trd_cd|jo_crr_cd|re_divr_cd|jo_stl_itm_cd";
		editFalseCols = ""; 		
	}else{
		//normal case
		editTrueCols = "dummy_flg|vvd|jo_crr_cd|re_divr_cd|jo_stl_itm_cd";
		editFalseCols = "estm_yrmon|trd_cd";
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
function setSheetCellInitData(sheetObj, Row, ColName){
	var cols = "";
	var dummyFlg = sheetObj.GetCellValue(Row, "dummy_flg");
	var tmpExeYrmon = ComTrimAll(ComGetObjValue(document.form.exe_yrmon), " ", "-", ":");
	
	if("Y" == dummyFlg){
		cols  = "vvd|estm_yrmon|trd_cd|jo_crr_cd|re_divr_cd|jo_stl_itm_cd|estm_amt|valid_msg";
	    cols += "|exe_yrmon|rev_yrmon|rlane_cd|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd|estm_vvd_tp_cd|acct_cd|estm_act_seq|act_dt";
	    cols += "|valid_col_cd|valid_cd|valid_nm|valid_row";		
	}else{
		cols  = "vvd|estm_yrmon|trd_cd|jo_crr_cd|re_divr_cd|jo_stl_itm_cd|estm_amt|valid_msg";
	    cols += "|exe_yrmon|rev_yrmon|rlane_cd|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd|estm_vvd_tp_cd|acct_cd|estm_act_seq|act_dt";
	    cols += "|valid_col_cd|valid_cd|valid_nm|valid_row";
	}
	
	
	if(!ComIsEmpty(cols)){
		var arrCols = cols.split("|");
		for(var j=0; j<arrCols.length; j++){
			sheetObj.SetCellValue(Row, arrCols[j], "", 0);
		}
	}
	sheetObj.SetCellValue(Row, "exe_yrmon", tmpExeYrmon, 0);
	sheetObj.SelectCell(Row, ColName);	
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
		var cols  = "vvd|jo_crr_cd|re_divr_cd|jo_stl_itm_cd";
	
		var tmpDummyFlg = sheetObj.GetCellValue(Row, "dummy_flg");
		if("Y" == tmpDummyFlg) cols = "vvd|estm_yrmon|trd_cd|jo_crr_cd|re_divr_cd|jo_stl_itm_cd";
		
		var arrCols = cols.split("|");
		for(var j=0; j<arrCols.length; j++){
			sheetObj.SetCellEditable(Row, arrCols[j], isEditable);
		}
		
	}
}

function setSheetDefaultCellEditable(sheetObj, Row){
	var tmpDummyFlg = sheetObj.GetCellValue(Row, "dummy_flg");	

	var allEditFalse  = "dummy_flg|vvd|estm_yrmon|trd_cd|jo_crr_cd|re_divr_cd|jo_stl_itm_cd";
	var arrAllFalseCols = allEditFalse.split("|");
	for(var j=0; j<arrAllFalseCols.length; j++){
		sheetObj.SetCellEditable(Row, arrAllFalseCols[j], false);
	}
	
	if("Y" == tmpDummyFlg){
		var dummyEditTrue  = "dummy_flg|vvd|estm_yrmon|trd_cd|jo_crr_cd|re_divr_cd|jo_stl_itm_cd";
		
		var arrTrueCols = dummyEditTrue.split("|");
		for(var j=0; j<arrTrueCols.length; j++){
			sheetObj.SetCellEditable(Row, arrTrueCols[j], true);
		}
	}else{
		var normalEditTrue  = "dummy_flg|vvd|jo_crr_cd|re_divr_cd|jo_stl_itm_cd";
				
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
		
//		setCheckDuplicatedData(sheetObj);//Dup message 처리.

		if(f_cmd == COMMAND02){
			setCheckDuplicatedData(sheetObj, gSelRow);//Dup message 처리.
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
function setCheckDuplicatedList(sheetObj){

	var formObj = document.form;
    sheetObj.SetWaitImageVisible(0);
    ComOpenWait(true);
    ComSetObjValue(formObj.f_cmd	, MULTI);
    ComSetObjValue(formObj.job_flg	, "DUP_XLS");
    ComSetObjValue(formObj.job_key	, "");

    var param = ComGetSaveString(sheetObj, false, true);
        param += "&" + FormQueryString(formObj);
    var sXml = sheetObj.GetSaveData("FNS_JOO_0302GS.do", param);
    var jobKey=ComGetEtcData(sXml, "job_key");
    if (jobKey.length > 0) {
        ComSetObjValue(formObj.job_flg, "DUP_XLS");
        ComSetObjValue(formObj.job_key, jobKey);
        sheetObj.SetWaitImageVisible(0);
        ComOpenWait(true);
        sheetObj.SetWaitTimeOut(10000);
        timer=setInterval(GetBackEndJobStatus, 3000); // action GetBackEndJobStatus function after 3 seconds.
    }
}

function setCheckDuplicatedData(sheetObj, Row) {
	var rtn = true;
	var iStRow = sheetObj.HeaderRows();
    var iEdRow = sheetObj.LastRow();
    var tmpDupRows = new Array();
    
	var ibflag 	= sheetObj.GetCellValue(Row, "ibflag");
	var validCd = sheetObj.GetCellValue(Row, "valid_cd");

//	if("R" == ibflag || "D" == ibflag || "E" == validCd) continue;
	var tmpVal = "";

	var sDummyFlg 	= sheetObj.GetCellValue(Row, "dummy_flg");
	var sVvd 		= sheetObj.GetCellValue(Row, "vvd");
	var sRlaneCd 	= sheetObj.GetCellValue(Row, "rlane_cd");
	var sJoCrrCd 	= sheetObj.GetCellValue(Row, "jo_crr_cd");
	var sReDivrCd 	= sheetObj.GetCellValue(Row, "re_divr_cd");
	var sJoStlItmCd = sheetObj.GetCellValue(Row, "jo_stl_itm_cd");
	var sTrdCd 		= sheetObj.GetCellValue(Row, "trd_cd");
	
	var bDup = false;
	for(var j=iStRow; j <= iEdRow; j++ ){
		var tIbflag 	= sheetObj.GetCellValue(j, "ibflag");
		
		if("D" == tIbflag || Row == j) continue;

		var tDummyFlg 	= sheetObj.GetCellValue(j, "dummy_flg");
		var tVvd 		= sheetObj.GetCellValue(j, "vvd");
    	var tRlaneCd 	= sheetObj.GetCellValue(j, "rlane_cd");
    	var tJoCrrCd 	= sheetObj.GetCellValue(j, "jo_crr_cd");
    	var tReDivrCd 	= sheetObj.GetCellValue(j, "re_divr_cd");
    	var tJoStlItmCd	= sheetObj.GetCellValue(j, "jo_stl_itm_cd");
    	var tTrdCd 		= sheetObj.GetCellValue(j, "trd_cd");
		
    	if("Y" == sDummyFlg){
    		if(sDummyFlg == tDummyFlg && sTrdCd == tTrdCd && sJoCrrCd == tJoCrrCd && sReDivrCd == tReDivrCd && sJoStlItmCd == tJoStlItmCd){
    			tmpDupRows.push(j);
    			bDup = true;
    		}
    	}else{
    		if(sDummyFlg == tDummyFlg && sVvd == tVvd && sRlaneCd == tRlaneCd && sTrdCd == tTrdCd && sJoCrrCd == tJoCrrCd && sReDivrCd == tReDivrCd && sJoStlItmCd == tJoStlItmCd){
        		tmpDupRows.push(j);
        		bDup = true;
        	}
    	}
	}
	
	if(bDup) {
		tmpDupRows.push(Row);
	}
	
	//체크 후 Message에 Dup 처리.
	var dupMsg = ComGetMsg("JOO00223");
	var tmpDupRowStr = tmpDupRows.join();
    if(!ComIsEmpty(tmpDupRowStr)){
    	// 비교한 자신도 duplicate이므로 추가
    	var arrDupRows = tmpDupRowStr.split(FIELDMARK); // , 구분자.
    	for(var i=0; i<=arrDupRows.length; i++){
    		var dupRow = arrDupRows[i];
    		sheetObj.SetCellValue(dupRow, "valid_cd", "E", 0);
    		sheetObj.SetCellValue(dupRow, "valid_msg", dupMsg, 0); // Duplicated
    		
    		setSheetCellConfig(sheetObj, dupRow);
    		rtn = false;
    	}
    }
    
    return rtn;
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
            
//            if(!setCheckDuplicatedData(sheetObj, sAction)) return false;
//            if(!checkVerify(sheetObj)) return false;
            /*
            //화면에 입력된 데이타 DUP 체크
            var duprows = sheetObj.ColValueDupRows("vvd|rlane_cd|jo_crr_cd|re_divr_cd|jo_stl_itm_cd",{"IncludeDelRow" : 0});
            //var arrDupRows = duprows.split(“,”);
            if(!ComIsEmpty(duprows)){
            	ComShowCodeMessage("COM12115", "[ "+duprows+" ] Row");
            	return false;
            }*/
            
            var iStRow = sheetObj.HeaderRows();
            var iEdRow = sheetObj.LastRow();
            var tmpDupRows = new Array();
            
            for( var i=iStRow; i <= iEdRow; i++ ) {
            	var ibflag 		= sheetObj.GetCellValue(i, "ibflag");
            	var dummyFlg 	= sheetObj.GetCellValue(i, "dummy_flg");
            	var validCd 	= sheetObj.GetCellValue(i, "valid_cd");
            	var seq 		= sheetObj.GetCellValue(i, "seq");
            	if("R" == ibflag || "D" == ibflag || "E" == validCd) continue;
            	var tmpVal = "";
            	            	
            	//Hidden 데이타 Validation 체크
            	var vvd = sheetObj.GetCellValue(i, "vvd");
            	var cols = new Array("vvd", "estm_yrmon", "rlane_cd", "trd_cd", "vsl_cd", "skd_voy_no", "skd_dir_cd", "rev_dir_cd", "rev_yrmon","act_dt", "exe_yrmon");
        		if("Y" == dummyFlg) cols = new Array("vvd", "estm_yrmon", "rlane_cd", "trd_cd", "vsl_cd", "skd_voy_no", "skd_dir_cd", "rev_dir_cd", "rev_yrmon", "exe_yrmon");
            	for(var j=0; j<cols.length; j++){
        			tmpVal = sheetObj.GetCellValue(i, cols[j]);
        			if(ComIsEmpty(tmpVal)){
        				//JOO00219 [{?msg1}] {?msg2} not exists in schedule.
        				ComShowCodeMessage("JOO00219", "No."+seq+" "+ vvd, "VVD");
        				//ComShowMessage("["+revVvd+"] VVD not exists in schedule");
        				return false;
        			}
        		}
        		
        		var cols2 = new Array("jo_crr_cd");
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

function GetCheckConditionPeriod(){
    var formObj=document.form;
    var frDt=formObj.fr_act_yrmon.value.replaceStr("-","")+"01";
    var toDt=formObj.to_act_yrmon.value.replaceStr("-","")+"01";
    if (ComGetDaysBetween(frDt, toDt) <= 0){
        return false;
    }   
    return true;
}
function resizeSheet() {
    ComResizeSheet(sheetObjects[0]);
}

///*
// * Check the verify results before saving.
// */
//function checkVerify(sheetObj) {
//    with(sheetObj) {
//		for(var i=HeaderRows(); i <= LastRow(); i++) {
//			if(GetCellValue(i, "valid_cd") != "S") {
//				ComShowCodeMessage("JOO00117", "up the verify result");
//				return false;
//			}
//		}
//    }
//    return true;
//}
