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
var prefix = "sheet1_";
var ROWMARK="|";
var FIELDMARK=",";

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
            case "btn_Save":
            	//Balance와 Adjuestment Amount 금액 체크.
            	if(!checkBalanceAmount()) return;
            	
                doActionIBSheet(sheetObjects[0], formObj, IBSAVE);
                break;
            case "btnRqstDt":
            	var cal=new ComCalendar();
				cal.setEndFunction("calFr"); 			
				cal.select(form.rqst_dt, 'yyyy-MM-dd');
            	break;
            case "btnInvIssDt":
            	var cal=new ComCalendar();
				cal.setEndFunction("calFr"); 			
				cal.select(form.inv_iss_dt, 'yyyy-MM-dd');
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
    doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}
function initControl() {
    var formObject=document.form;
    
    axon_event.addListenerForm('change', 'obj_change', form);

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
                var HeadTitle1="|Partner|Revenue|Expense|Adjustment|Adjust Revenue|Adjust Expense|thea_adj_edt_flg|rqst_dt|inv_iss_dt|thea_stl_grp_no|bal_act_flg";
                var headCount=ComCountHeadTitle(HeadTitle1);
                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
                var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"}];
                InitHeaders(headers, info);
                
                var cols = [ 
                       {Type:"Status",    Hidden:1, Width:0,	Align:"Center",  ColMerge:1,   SaveName: prefix + "ibflag" },
                       {Type:"Text",      Hidden:0, Width:60,   Align:"Center",  ColMerge:0,   SaveName: prefix + "jo_crr_cd",      		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",     Hidden:0, Width:200,  Align:"Right",   ColMerge:0,   SaveName: prefix + "stl_rev_act_amt",		KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Float",     Hidden:0, Width:200,  Align:"Right",   ColMerge:0,   SaveName: prefix + "stl_exp_act_amt",		KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"AutoSum",   Hidden:0, Width:200,  Align:"Right",   ColMerge:0,   SaveName: prefix + "thea_adj_act_amt",		KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:1,   InsertEdit:0 },
                       {Type:"AutoSum",   Hidden:0, Width:100,  Align:"Right",   ColMerge:0,   SaveName: prefix + "thea_adj_rev_act_amt",	KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"AutoSum",   Hidden:0, Width:100,  Align:"Right",   ColMerge:0,   SaveName: prefix + "thea_adj_exp_act_amt",	KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName: prefix + "thea_adj_edt_flg",      	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,   	Align:"Center",  ColMerge:0,   SaveName: prefix + "rqst_dt",	 			KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,   	Align:"Center",  ColMerge:0,   SaveName: prefix + "inv_iss_dt",	 			KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,   	Align:"Center",  ColMerge:0,   SaveName: prefix + "vndr_seq",	 			KeyField:0,   CalcLogic:"",   Format:"",         	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,   	Align:"Center",  ColMerge:0,   SaveName: prefix + "cust_seq",	 			KeyField:0,   CalcLogic:"",   Format:"",         	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,   	Align:"Center",  ColMerge:0,   SaveName: prefix + "thea_stl_grp_no",		KeyField:0,   CalcLogic:"",   Format:"",	        PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                       {Type:"Text",      Hidden:1, Width:0,   	Align:"Center",  ColMerge:0,   SaveName: prefix + "bal_act_flg",		    KeyField:0,   CalcLogic:"",   Format:"",	        PointCount:0,   UpdateEdit:0,   InsertEdit:0 }
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
                
            var sXml = sheetObj.GetSearchData("FNS_JOO_0207GS.do", param);
            
            var balActFlg = ComGetEtcData(sXml, "BAL_ACT_FLG");
            var balActAmt = ComGetEtcData(sXml, "BAL_ACT_AMT");
           
            setBalanceObject(balActFlg, balActAmt);
            
            ComOpenWait(false);
            
            
            sheetObj.LoadSearchData(sXml);
            
            break;
        
        case IBSEARCH_ASYNC01:  // request date refresh
        	formObj.f_cmd.value = SEARCH28;
            
            var param = FormQueryString(formObj);
                param += "&attr_ctnt1=" + formObj.vndr_seq.value;
                param += "&attr_ctnt2=" + formObj.inv_iss_dt.value;
            
            var sXml = sheetObj.GetSearchData("JOOCommonGS.do", param);
            
            if (ComGetEtcData(sXml, "TRANS_RESULT_KEY") == "S") {
	            ComSetObjValue(formObj.rqst_dt, ComGetEtcData(sXml, "due_dt"));
            }
            break;
            
        case IBSAVE: // save
            if (!validateForm(sheetObj, formObj, sAction)) {
                return;
            }
            sheetObj.SetWaitImageVisible(0);
            ComOpenWait(true);
            formObj.f_cmd.value = MULTI;
            // Due Date (rqst_dt), Issue Date Setting
            for(idx=sheetObj.HeaderRows(); idx < sheetObj.LastRow(); idx++){
            	sheetObj.SetCellValue(idx, prefix + "rqst_dt", 			ComReplaceStr(formObj.rqst_dt,"-","") , 	0);
            	sheetObj.SetCellValue(idx, prefix + "inv_iss_dt", 		ComReplaceStr(formObj.inv_iss_dt,"-","") ,	0);
            	sheetObj.SetCellValue(idx, prefix + "thea_stl_grp_no", 	formObj.thea_stl_grp_no.value , 			0);
            	sheetObj.SetCellValue(idx, prefix + "vndr_seq", 		formObj.vndr_seq.value , 					0);
            	sheetObj.SetCellValue(idx, prefix + "cust_seq", 		formObj.cust_seq.value , 					0);
            }
            
            var aryPrefix=new Array( "sheet1_");
            var sParam = ComGetSaveString(sheetObjects, true, true);
                sParam += "&" + FormQueryString(formObj);
                sParam += "&" + ComGetPrefixParam(aryPrefix);
            var sXml = sheetObj.GetSaveData("FNS_JOO_0207GS.do", sParam);
            
            sheetObj.LoadSaveData(sXml);
            break;
    }
}
function setBalanceObject(balActFlg, balActAmt){
	var formObj = document.form;
	var flgText = "Balance";
	if("R" == balActFlg){
		flgText += "(AR)";
	}else if("E" == balActFlg){
		flgText += "(AP)";
	}
	
	$("#td_bal_txt").text(flgText);
	ComSetObjValue(formObj.bal_act_flg, balActFlg);
	ComSetObjValue(formObj.bal_act_amt, ComAddComma(balActAmt));
	ComChkObjValid(formObj.bal_act_amt);
	
}
function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
    if (sheetObj.RowCount() > 0) {
        
    	var iHeadRow = sheetObj.HeaderRows();
        var iLastRow = sheetObj.LastRow();
        
        for(var i=iHeadRow ; i <= iLastRow ; i++ ){
            var editFlag = sheetObj.GetCellValue(i, prefix+"thea_adj_edt_flg");
            if("N" == editFlag){
            	sheetObj.SetCellEditable(i, prefix+"thea_adj_act_amt", 0);
            }else{
            	sheetObj.SetCellEditable(i, prefix+"thea_adj_act_amt", 1);
            }
        }
        
        sheetObj.SetSumBackColor("#F6CEF5");
    	sheetObj.SetMergeCell(sheetObj.LastRow(), 0, 1, 3);
    	sheetObj.SetSumValue(0, 0, "Adjustment Balance");
    	sheetObj.RenderSheet(2);
    }
}

function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg, responseText) {
	ComOpenWait(false);
	if(Code >= 0){
		ComFireEvent(ComGetObject("btn_Close") ,"click"); 
	}
}

function sheet1_OnEditValidation(sheetObj, Row, Col, Value) {
	var formObj = document.form;
    var colName = sheetObj.ColSaveName(Col);
    
    var balActFlg = ComGetObjValue(formObj.bal_act_flg);
    var tmpStlActAmt = 0;
    
    if("R" == balActFlg){
		tmpStlActAmt = sheetObj.GetCellValue(Row, prefix+"stl_rev_act_amt");
	}else if("E" == balActFlg){
		tmpStlActAmt = sheetObj.GetCellValue(Row, prefix+"stl_exp_act_amt");
	}
    
    //입력된 값은 R Case > Revenue 금액보다 큰 경우 리턴. E Case -> Expense 금액 보다 큰 경우 리턴.
	if(Number(tmpStlActAmt) < Number(Value)){
		sheetObj.ValidateFail(1);
	}
}

function sheet1_OnChange(sheetObj, Row, Col, Value, OldValue, RaiseFlag) {    
    var formObj = document.form;
    var colName = sheetObj.ColSaveName(Col);
    
    var balActFlg = ComGetObjValue(formObj.bal_act_flg);
    
    switch(colName){
        case prefix+"thea_adj_act_amt":
        	var tmpStlActAmt = 0;
        	var tmpAdjActAmt = 0;
        	
        	if("R" == balActFlg){
        		tmpStlActAmt = sheetObj.GetCellValue(Row, prefix+"stl_rev_act_amt");
        		//Adjustment - Revenue = Adjust Rev
        	}else if("E" == balActFlg){
        		//Adjustment - Expense = Adjust Exp
        		tmpStlActAmt = sheetObj.GetCellValue(Row, prefix+"stl_exp_act_amt");
        	}
        	
        	tmpAdjActAmt = JooComGetRound(Number(Value) - Number(tmpStlActAmt), 2);
        	if("R" == balActFlg){
        		sheetObj.SetCellValue(Row, prefix+"thea_adj_rev_act_amt", tmpAdjActAmt, 0);
        	}else if("E" == balActFlg){
        		sheetObj.SetCellValue(Row, prefix+"thea_adj_exp_act_amt", tmpAdjActAmt, 0);
        	}
        	
            break;
    }
}
function checkBalanceAmount(){
	var formObj=document.form;
	var sheetObj=sheetObjects[0];
	
	var balActAmt = ComGetObjValue(formObj.bal_act_amt);
	balActAmt = (balActAmt == '') ? 0 : balActAmt.replace(/,/g, '')*1;
	balActAmt = JooComGetRound(Number(balActAmt), 2);
	
	if(sheetObj.RowCount()== 0) return false;
	
	var chkBalActAmt = sheetObj.GetCellValue(sheetObj.LastRow(), prefix+"thea_adj_act_amt")*1;
	chkBalActAmt = (chkBalActAmt == '') ? 0 : chkBalActAmt;
	chkBalActAmt = JooComGetRound(Number(chkBalActAmt), 2);
	
	if(balActAmt != chkBalActAmt){
		ComShowCodeMessage("JOO10021");
//		formObj.bal_act_amt.value = sheetObj.ComputeSum("|thea_adj_act_amt|");
		return false;
	}
	return true;
	
}

/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
    switch (sAction) {
	    case IBSEARCH:
	    	/*if(ComIsEmpty(formObj.thea_stl_grp_no)){
	    		//JOO00143 There is no data !
	    		ComShowCodeMessage("JOO00143");
	    		return false;
	    	}*/
	    	break;
        case IBSAVE: //save

            if(sheetObjects[0].RowCount() < 1 ){
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

function obj_change(){
	var formObj=document.form;
	try {
		var srcName=ComGetEvent("name");
        switch(srcName) {
            case "inv_iss_dt":
            	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC01);
            	break;
        } // end switch
	}catch(e) {
		ComShowMessage(e.message);
	}
}