/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved
 *@FileName : ui_joo_0028.js
 *@FileTitle: Settlement Item & Account Code List
 *@author   : CLT
 *@version  : 1.0
 *@since    : 2014/06/18
 =========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class fns_joo_0028 : business script for fns_joo_0028
 */

//common global variable
var sheetObjects=new Array();
var sheetCnt=0;
//gloabl variable
var gCurrRow;
//Event handler processing by button click event */
document.onclick=processButtonClick;
//Event handler processing by button name */
function processButtonClick() {
	/***** setting sheet object *****/
	var sheetObject1=sheetObjects[0];
	/*******************************************************/
	var formObj=document.form;
	try {
		var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
		switch (srcName) {
			case "btn_Add":
				doActionIBSheet(sheetObject1, formObj, IBINSERT);
				break;
			case "btn_Retrieve":
				doActionIBSheet(sheetObject1, formObj, IBSEARCH);
				break;
			case "btn_Save":
				doActionIBSheet(sheetObject1, formObj, IBSAVE);
				break;
			case "btn_DownExcel":
				doActionIBSheet(sheetObject1, formObj, IBDOWNEXCEL);
				break;
			case "btn_Delete":
				JooRowHideDelete(sheetObject1, 1);
				break;
		} // end switch
	} catch (e) {
		if (e == "[object Error]") {
			ComShowCodeMessage('JOO00001');
		} else {
			ComShowMessage(e.message);
		}
	}
}
/**
 * registering IBSheet Object as list
 * adding process for list in case of needing batch processing with other items
 * defining list on the top of source
 */
function setSheetObject(sheet_obj) {
	sheetObjects[sheetCnt++]=sheet_obj;
}
/**
 * initializing sheet
 * implementing onLoad event handler in body tag
 * adding first-served functions after loading screen.
 */
function loadPage() {
	for (i=0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1);
		ComEndConfigSheet(sheetObjects[i]);
	}
    initControl();
}
function initControl() {
	//** Date Separator **/
	DATE_SEPARATOR="-";
	var formObj=document.form;
} 
/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
function initSheet(sheetObj, sheetNo) {
	var cnt=0;
	switch (sheetNo) {
	case 1: //t1sheet1 init
		with (sheetObj) {
			var rAcct="";
	        var eAcct="";
	        var HeadTitle ="STS||Item|Manual\nItem|Basic\nPort\nCheck|Sorting\nOption|Full Name|Expense Account Code|Expense Account Code|Revenue Account Code|Revenue Account Code|Performance of Estimated|Performance of Estimated|Clear Account Code|Clear Account Code";
	        var HeadTitle1="STS||Item|Manual\nItem|Basic\nPort\nCheck|Sorting\nOption|Full Name|DR|CR|DR|CR|EXP.|REV.|EXP.|REV.";
	        var headCount=ComCountHeadTitle(HeadTitle);
	//        (headCount, 0, 0, true);
	        var prefix="sheet1_";
	        SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
	        var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
	        var headers = [{ Text:HeadTitle, Align:"Center"},
	                    { Text:HeadTitle1, Align:"Center"} ];
	        InitHeaders(headers, info);
	        // Account Code Length Change ( 6 > 8 ) - Iza
	        var cols = [ {Type:"Status",    Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"ibflag" },
	               {Type:"DelCheck",  Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"del_chk" },
	               {Type:"Text",      Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"jo_stl_itm_cd",   KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:3 },
	               {Type:"CheckBox",  Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"jo_mnl_cre_flg",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1},
	               {Type:"CheckBox",  Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"jo_auto_cre_flg", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1},
	               {Type:"Int",       Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"ord_seq",   KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 },
	               {Type:"Text",      Hidden:0, Width:0,    Align:"Left",    ColMerge:1,   SaveName:prefix+"jo_stl_itm_nm",   KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
	               {Type:"Text",      Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"e_dr_acct_cd",    KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:8 },
	               {Type:"Text",      Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"e_cr_acct_cd",    KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:8 },
	               {Type:"Text",      Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"r_dr_acct_cd",    KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:8 },
	               {Type:"Text",      Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"r_cr_acct_cd",    KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:8 },
	               {Type:"Text",      Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"e_es_acct_cd",    KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:8 },
	               {Type:"Text",      Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"r_es_acct_cd",    KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:8 },
	               {Type:"Text",      Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"e_clr_acct_cd",    KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:8 },
	               {Type:"Text",      Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"r_clr_acct_cd",    KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:8 } ];
	        /*
	        var tmpArr = gEstmAcctCd.split("|");
	        for (var i=0; i<tmpArr.length; i++)
	        	if (tmpArr[i].substring(0,1) == "4")
	        		rAcct=rAcct+tmpArr[i]+"|";
	        	else if (tmpArr[i].substring(0,1) == "5")
	        		eAcct=eAcct+tmpArr[i]+"|";
	        if (rAcct.length > 0)
	        	rAcct=rAcct.substring(0, rAcct.length-1)
	        if (eAcct.length > 0)
	        	eAcct=eAcct.substring(0, eAcct.length-1)*/
	        InitColumns(cols);
	        SetEditable(1);
//	        SetSheetHeight(540);
	        resizeSheet();
	        FitColWidth("3|3|7|5|10|9|9|9|9|9|9|9|9");        
	        //SetColProperty(prefix+"e_es_acct_cd", {ComboText:eAcct, ComboCode:eAcct} );
	        //SetColProperty(prefix+"r_es_acct_cd", {ComboText:rAcct, ComboCode:rAcct} );
	        SetColProperty(prefix+"ord_seq" , {AcceptKeys:"N" , InputCaseSensitive:1});
	        SetColProperty(prefix+"jo_stl_itm_cd" , {AcceptKeys:"E|[0123456789/]" , InputCaseSensitive:1});

		}
		break;
	}
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction, Row, Col) {
	var prefix="sheet1_";
	sheetObj.ShowDebugMsg(false);
	switch (sAction) {
		case IBSEARCH: //retrieve
			formObj.f_cmd.value=SEARCH;
 			sheetObj.DoSearch("FNS_JOO_0028GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix) );
 			//sheetObj.CheckAll(3,1,0);
 			//sheetObj.CheckAll(4,1,0);
			break;
		case IBSAVE: //save
			if (!validateForm(sheetObj, formObj, sAction)) {
				return false;
			}//end if
			formObj.f_cmd.value=MULTI;
			sheetObj.SetWaitImageVisible(0);
			ComOpenWait(true);
			sheetObj.DoSave("FNS_JOO_0028GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix), -1, false);
			ComOpenWait(false);
			break;
		case IBINSERT: // insert
			sheetObj.DataInsert(-1);
			var row=sheetObj.LastRow();
			sheetObj.SetCellValue(row, prefix+"r_es_acct_cd","",0);
			sheetObj.SetCellValue(row, prefix+"e_es_acct_cd","",0);
			break;
		case IBDOWNEXCEL: // excel download
			if(sheetObj.RowCount() < 1){//no data
       		 ComShowCodeMessage("COM132501");
	   		}else{
	   			sheetObj.Down2Excel({ HiddenColumn:1, Merge:1,DownCols:"2|6|7|8|9|10|11|12|13",CheckBoxOnValue:"Y",CheckBoxOffValue:"N" });
	   		}	
 			
			break;
		//Perfomance of Estimated Account Validation Check
		case IBSEARCH_ASYNC05:  
			formObj.f_cmd.value=SEARCHLIST09;
			var colName = sheetObj.ColSaveName(Col);
			formObj.code.value=sheetObj.GetCellValue(Row,colName);
			formObj.super_cd1.value="";
			formObj.super_cd2.value="";
 			var sXml=sheetObj.GetSearchData("JOOCommonGS.do", FormQueryString(formObj));
			if (ComGetEtcData(sXml,"CHECKVVD")=="E"){
				ComShowMessage(ComGetEtcData(sXml,"VVDMSG"));
				sheetObj.SetCellValue(Row, colName,"");//VVD Clear
				sheetObj.SelectCell(Row, colName,true);
			}
			break;
	}
}
//sheet1_OnChange
function sheet1_OnChange(sheetObj, Row, Col, Value, OldValue, RaiseFlag) {
	var prefix="sheet1_";
	var formObj=document.form;
	if(Value != OldValue){
		gCurrRow=Row;
		var colName = sheetObj.ColSaveName(Col);
		switch (colName) {
			case prefix+"e_dr_acct_cd":
				//if (sheetObj.GetCellValue(Row, prefix+"e_dr_acct_cd").length==6){
					doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC05, Row, Col);
				//}
				break;
			case prefix+"e_cr_acct_cd":
				//if (sheetObj.GetCellValue(Row, prefix+"e_cr_acct_cd").length==6){
					doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC05, Row, Col);
				//}
				break;
			case prefix+"r_dr_acct_cd":
				//if (sheetObj.GetCellValue(Row, prefix+"r_dr_acct_cd").length==6){
					doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC05, Row, Col);
				//}
				break;
			case prefix+"r_cr_acct_cd":
				//if (sheetObj.GetCellValue(Row, prefix+"r_cr_acct_cd").length==6){
					doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC05, Row, Col);
				//}
				break;
			case prefix+"e_es_acct_cd":
				//if (sheetObj.GetCellValue(Row, prefix+"e_es_acct_cd").length==6){
					doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC05, Row, Col);
				//}
				break;
			case prefix+"r_es_acct_cd":
				//if (sheetObj.GetCellValue(Row, prefix+"r_es_acct_cd").length==6){
					doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC05, Row, Col);
				//}
				break;
		}
	}
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	var prefix="sheet1_";
	switch (sAction) {
		case IBSAVE:   //save
			var cnt=0;

			for(var inx=sheetObj.HeaderRows(); inx <= sheetObj.LastRow(); inx++){
				var status=sheetObj.GetRowStatus(inx);
				//skip in case of not changing
				if (status == "R"){
					continue;
				}
				cnt++;
				//delete item
				if (status == "D")
					continue;
				//only del_chk checked
				if ((status == "I" || status == "U") && sheetObj.GetCellValue(inx,prefix+"del_chk") == "1"){
					ComShowCodeMessage("JOO00079");
					sheetObj.SelectCell(inx,prefix+"del_chk",true);
					return false;
				}
				var rownum=(inx-1)+"th row";
				if (inx-1 == 1){
					rownum=(inx-1)+"st row";
				}else if (inx-1==2){
					rownum=(inx-1)+"nd row";
				}
				if (sheetObj.GetCellValue(inx,prefix+"jo_stl_itm_cd").length < 3){
					ComShowCodeMessage('JOO00017',rownum);
					sheetObj.SelectCell(inx,prefix+"jo_stl_itm_cd",true);
					return false;
				}
				if (sheetObj.GetCellValue(inx,prefix+"jo_stl_itm_nm").length == 0){
					ComShowCodeMessage('JOO00052',rownum);
					sheetObj.SelectCell(inx,prefix+"jo_stl_itm_nm",true);
					return false;
				}
				// Account Code Length Change ( 6 > 8 )
				if (sheetObj.GetCellValue(inx,prefix+"e_dr_acct_cd").length < 8){
					ComShowCodeMessage('JOO00053',rownum);
					sheetObj.SelectCell(inx,prefix+"e_dr_acct_cd",true);
					return false;
				}
				if (sheetObj.GetCellValue(inx,prefix+"e_cr_acct_cd").length < 8){
					ComShowCodeMessage('JOO00053',rownum);
					sheetObj.SelectCell(inx,prefix+"e_cr_acct_cd",true);
					return false;
				}
				if (sheetObj.GetCellValue(inx,prefix+"r_dr_acct_cd").length < 8){
					ComShowCodeMessage('JOO00053',rownum);
					sheetObj.SelectCell(inx,prefix+"r_dr_acct_cd",true);
					return false;
				}
				if (sheetObj.GetCellValue(inx,prefix+"r_cr_acct_cd").length < 8){
					ComShowCodeMessage('JOO00053',rownum);
					sheetObj.SelectCell(inx,prefix+"r_cr_acct_cd",true);
					return false;
				}

				if (sheetObj.GetCellValue(inx,prefix+"ord_seq").length == 0){
					ComShowCodeMessage('JOO00116',"Sorting Option ["+rownum+"]");
					sheetObj.SelectCell(inx,prefix+"ord_seq",true);
					return false;
				}
			}
			if(cnt==0){
				cnt = sheetObj.RowCount("D");
			}
			if (cnt==0){
				ComShowCodeMessage('JOO00036'); //There is no data to save.
				return false;
			}
			break;
		case IBSEARCH: //retrieve
			break;
	}
	return true;
}
function sheet1_OnSearchEnd(sheetObj,ErrMsg) {
	//sheetObj.CheckAll(3,1,0);
	//sheetObj.CheckAll(4,1,0);
}

function resizeSheet(){
    ComResizeSheet(sheetObjects[0]);
}