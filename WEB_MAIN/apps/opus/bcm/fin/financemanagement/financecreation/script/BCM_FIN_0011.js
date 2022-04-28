/*=========================================================
 *Copyright(c) 2009 CyberLogitec
 *@FileName : BCM_FIN_0011.js
 *@FileTitle : Revenue Month per Common & Charter VVD
 *Open Issues :
 *Change history :
 *@LastModifyDate : 
 *@LastModifier : 
 *@LastVersion : 1.0
=========================================================*/

// common global variable
var sheetObjects=new Array();
var sheetCnt=0;
// Event handler processing by button click event */
document.onclick=processButtonClick;
// Event handler processing by button name */
function processButtonClick() {
	/***** setting sheet object *****/
	var sheetObject1=sheetObjects[0];
	var sheetObject2=sheetObjects[1];
	/*******************************************************/
	var formObj=document.form;
	try {
		var srcName=ComGetEvent("name");
		switch (srcName) {
			case "tar_yrmon_cal":
				var cal=new ComCalendar();
				cal.setDisplayType('month');
				cal.select(formObj.tar_yrmon, 'yyyy-MM');
				break;
			case "btn_retrieve":
				doActionIBSheet(sheetObject1, formObj, IBSEARCH);
				break;
			case "btn_new":
				formObj.tar_yrmon.value="";
            	sheetObject1.RemoveAll();
            	sheetObject2.RemoveAll();
            	document.getElementById("revenueVvdAdd").style.display='inline';
                break;
			case "btn_save":
				doActionIBSheet(sheetObject2, formObj ,IBSAVE);	
				break;
			case "btn_add":
				doActionIBSheet(sheetObject2, formObj, IBINSERT);
				break;
			case "btn_del":
				rowRemove(sheetObject2)
				break;
			case "revenueVvdAdd":
				if(sheetObject1.RowCount()> 0) {
					copy2Sheet(sheetObject1, sheetObject2);
					document.getElementById("revenueVvdAdd").style.display='none';
				}
		} // end switch
	} catch (e) {
		if (e == "[object Error]") {
			ComShowCodeMessage('SAP00001');
		} else {
			ComShowMessage(e.message);
		}
	}
}
/**
 * copy to sheet
 */
function copy2Sheet(sheetObject1, sheetObject2) {
	sheetObject1.Copy2SheetCol(
		sheetObject2		
		,"rlane_cd|rev_yrmon|voy_tp_cd|slan_cd|rev_port_cd|vvd_com_lvl|vsl_cd|skd_voy_no|skd_dir_cd|rlane_dir_cd"
		,"rlane_cd|rev_yrmon|voy_tp_cd|slan_cd|rev_port_cd|vvd_com_lvl|vsl_cd|skd_voy_no|skd_dir_cd|rlane_dir_cd" 
		,-1 
		,-1 
		,-1 
		,2 
		,true
		,false
		,""
		,""
	);
	for(var i=sheetObject2.HeaderRows(); i<(sheetObject2.RowCount()+sheetObject2.HeaderRows()); i++) {
		sheetObject2.SetCellValue(i, "skd_voy_no",ComLpad(Number(sheetObject2.GetCellValue(i,"skd_voy_no")) + 1, 4, '0'));
		sheetObject2.SetCellValue(i, "vvd",sheetObject2.GetCellValue(i, "vsl_cd") + sheetObject2.GetCellValue(i, "skd_voy_no") + sheetObject2.GetCellValue(i, "skd_dir_cd") + sheetObject2.GetCellValue(i, "rlane_dir_cd"),0);
		var tar_yrmon=document.getElementById("tar_yrmon").value;
		sheetObject2.SetCellValue(i, "rev_yrmon",tar_yrmon + "-" + ComGetLastDay(tar_yrmon.substring(0, 4), Number(tar_yrmon.substring(5, 7))),0);
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
    
    doActionIBSheet(sheetObjects[1], document.form, IBROWSEARCH, "", "ComCd");
}
/**
 * Removing IBSheet Row
 **/
function rowRemove(sheetObj){
	ComRowHideDelete(sheetObj, "DelChk");
}
/**
 * loading HTML Control event <br>
 * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
 * @param {ibsheet} sheetObj    IBSheet Object
 * @param {int}     sheetNo     sequence number in sheetObjects array
 **/
function initControl() {
	//** Date Separator **/
	DATE_SEPARATOR="-";
	var formObj=document.form;
    //handling Axon event. event catch
	axon_event.addListenerFormat('beforedeactivate', 'obj_blur'    , formObj); 	//- handling code when OnBeforeDeactivate(blur) event
	axon_event.addListenerFormat('beforeactivate'  , 'obj_focus'   , formObj);            //- handling code when OnBeforeActivate event in case of existing dataformat property
    //axon_event.addListenerFormat('keypress'        , 'obj_keypress', formObj); 	//- handling code when onkeypress event in case of existing dataformat property
//    axon_event.addListenerFormat('keyup'           , 'form_keyup'  , formObj);
//    axon_event.addListenerForm('keypress'          , 'obj_keypress', formObj);
}

/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
function initSheet(sheetObj, sheetNo) {
	var cnt=0;	
	switch (sheetObj.id) {
	case "sheet1": //t1sheet1 init
		with(sheetObj){
			//no support[check again]CLT 		if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);
			var HeadTitle1="|Previous Month|Previous Month|Previous Month|Previous Month|Previous Month|Previous Month|Previous Month|Previous Month|Previous Month|Previous Month|Previous Month";
			var HeadTitle2="|VVD|Revenue\nLane|Rev Date|Voyage Type|Service Lane|Revenue Port|VVD Common\nLevel|Vessel Code|Voyage No|Direction Code|Revenue Lane Direction";
			var headCount=ComCountHeadTitle(HeadTitle1);

			SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );

			var info    = { Sort:0, ColMove:1, HeaderCheck:0, ColResize:1 };
			var headers = [ { Text:HeadTitle1, Align:"Center"},
			                { Text:HeadTitle2, Align:"Center"} ];
			InitHeaders(headers, info);

			var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
			             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,  SaveName:"vvd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,  SaveName:"rlane_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,  SaveName:"rev_yrmon",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,  SaveName:"voy_tp_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"slan_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"rev_port_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,  SaveName:"vvd_com_lvl",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"vsl_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"skd_voy_no",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"skd_dir_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"rlane_dir_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
       
			InitColumns(cols);

			SetEditable(1);
			resizeSheet();	//SetSheetHeight(360);
		}
		break;
	case "sheet2": //t1sheet1 init
	    with(sheetObj){
			var HeadTitle1="|This Month|This Month|This Month|This Month|This Month|This Month|This Month|This Month|This Month|This Month|This Month|This Month";
			var HeadTitle2="|VVD|Revenue\nLane|Rev Date|Voyage Type|Service Lane|Revenue Port|VVD Common\nLevel|Vessel Code|Voyage No|Direction Code|Revenue Lane Direction|Del";
			var headCount=ComCountHeadTitle(HeadTitle1);

			SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );

			var info    = { Sort:0, ColMove:1, HeaderCheck:0, ColResize:1 };
			var headers = [ { Text:HeadTitle1, Align:"Center"},
			                { Text:HeadTitle2, Align:"Center"} ];
			InitHeaders(headers, info);

			var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
			             {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"vvd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:10,	AcceptKeys:"E|[0123456789]",	InputCaseSensitive:1 },
			             {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:"rlane_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:5,	AcceptKeys:"E|[0123456789]", 	InputCaseSensitive:1 },
			             {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:"rev_yrmon",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Combo",     Hidden:0, Width:100,  Align:"Left",    ColMerge:1,   SaveName:"voy_tp_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"slan_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"rev_port_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Combo",     Hidden:0, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"vvd_com_lvl",   KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 },
			             {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"vsl_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"skd_voy_no",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"skd_dir_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"rlane_dir_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"CheckBox",  Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"DelChk" } ];
       
			InitColumns(cols);

			SetEditable(1);
			resizeSheet();	//SetSheetHeight(360);
		}
	    break;
	}
}

function resizeSheet(){
	ComResizeSheet(sheetObjects[0]);
	ComResizeSheet(sheetObjects[1]);
}

/**
 * Removing IBSheet Row <br>
 * @param{ibsheet} sheetObj    IBSheet Object
 **/
function rowRemove(sheetObj){
	ComRowHideDelete(sheetObj, "DelChk");
}

// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction, row, col) {
	if (!validateForm(sheetObj, formObj, sAction))		
		return;
	switch (sAction) {
		case IBSEARCH: //retrieve
			formObj.f_cmd.value=SEARCH;
//parameter changed[check again]CLT
			var sXml=sheetObj.GetSearchData("BCM_FIN_0011GS.do", FormQueryString(formObj));
			var arrXml=sXml.split("|$$|");
			if (arrXml.length > 0) sheetObjects[0].LoadSearchData(arrXml[0],{Sync:1} );
			if (arrXml.length > 1) { 
				sheetObjects[1].LoadSearchData(arrXml[1],{Sync:1} );
				if(sheetObjects[1].RowCount()> 0) {
					document.getElementById("revenueVvdAdd").style.display='none';
				} else {
					document.getElementById("revenueVvdAdd").style.display='inline';
				}
			}
//	   	  	sheetObject1.LoadSearchXml(sXml,false);
			break;
		case IBSAVE:        //save
			if(ComShowConfirm(ComGetMsg("COM130101", "data"))){
				if (sheetObj.RowCount()== 0 || (!sheetObj.IsDataModified())){
					ComShowCodeMessage("FIN00002");
					return; 
				}
				
				if (!validateForm(sheetObj,formObj,sAction)) return false;
				
				var sParam=ComGetSaveString(sheetObj, true, true);	// sheetObj, encoding=true, allsheetSave=true
	 			formObj.f_cmd.value=MULTI;
	 			sParam += "&" + FormQueryString(formObj);
//parameter changed[check again]CLT
	 			var sXml=sheetObj.GetSaveData("BCM_FIN_0011GS.do", sParam);
	 			var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
	 			if (result == 'S') {
	 				ComShowCodeMessage("FIN00006");
	 			}
//parameter changed[check again]CLT
	 			sheetObj.LoadSaveData(sXml);
			}
 			break;
		case IBINSERT: //Header Row Insert		
			if (!validateForm(sheetObj, document.form, sAction)) {
				return false;
			}
			var idx=sheetObj.DataInsert(-1);
			var tar_yrmon=document.getElementById("tar_yrmon").value;
			sheetObj.SetCellValue(sheetObj.LastRow(), "rev_yrmon",tar_yrmon + "-" + ComGetLastDay(tar_yrmon.substring(0, 4), Number(tar_yrmon.substring(5, 7))),0);
			break;
		case IBROWSEARCH:  
			if (col == "ComCd") {
				//Voyage Type Code
				CoFinGetBizCombo('GRID', document.form, sheetObj, 'CD01226', 'voy_tp_cd', 'voy_tp_nm', '7', 'FINCommonGS.do', '','Y');
				
				//VVD Common Level
				CoFinGetBizCombo('GRID', document.form, sheetObj, 'CD30003', 'vvd_com_lvl', 'vvd_com_lvl_desc', '7', 'FINCommonGS.do', '','Y');
			}
			break;
		case SEARCH03:
			formObj.f_cmd.value=SEARCH03;
			var val=sheetObj.GetCellValue(row, col);
			var params=FormQueryString(formObj) + "&rlane_cd=" + val;
//parameter changed[check again]CLT
			var sXml=sheetObj.GetSearchData("FINCommonGS.do", params);
			var state=ComGetEtcData(sXml, ComWebKey.Trans_Result_Key);
			if (state == 'S') {
				if(ComGetEtcData(sXml, "result") == null || ComGetEtcData(sXml, "result") == 'null'){
					ComShowCodeMessage("FIN00003", "Revenue Lane");
					sheetObj.SetCellValue(row, "rlane_cd","",0);
					sheetObj.SelectCell(row, "rlane_cd");
				} else {
					sheetObj.SetCellValue(row, "slan_cd",sheetObj.GetCellValue(row, "rlane_cd").substring(0, 3),0);
				}
			}
			break;
		case SEARCH04:
			formObj.f_cmd.value=SEARCH04;
			var vsl_cd=sheetObj.GetCellValue(row, col).substring(0, 4);
			var params=FormQueryString(formObj) + "&vsl_cd=" + vsl_cd;
//parameter changed[check again]CLT
			var sXml=sheetObj.GetSearchData("FINCommonGS.do", params);
			var state=ComGetEtcData(sXml, ComWebKey.Trans_Result_Key);
			if (state == 'S') {
				if(ComGetEtcData(sXml, "result") == null || ComGetEtcData(sXml, "result") == 'null'){
					ComShowCodeMessage("FIN00003", "Vessel Code");
					sheetObj.SetCellValue(row, "vvd","",0);
					sheetObj.SelectCell(row, "vvd");
				} else {
					sheetObj.SetCellValue(row, "vsl_cd",sheetObj.GetCellValue(row, "vvd").substring(0, 4),0);
					sheetObj.SetCellValue(row, "skd_voy_no",sheetObj.GetCellValue(row, "vvd").substring(4, 8),0);
					sheetObj.SetCellValue(row, "skd_dir_cd",sheetObj.GetCellValue(row, "vvd").substring(8, 9),0);
					sheetObj.SetCellValue(row, "rlane_dir_cd",sheetObj.GetCellValue(row, "vvd").substring(9, 10),0);
				}
			}
			break;
	}
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction, row, col) {
	sheetObj.ShowDebugMsg(false);
	switch (sAction) {
		case IBSEARCH: //retrieve
			if (!ComChkValid(formObj)) return false;
			break;
		case IBINSERT: //insert
			if (!ComChkValid(formObj)) return false;
			break;
		case IBSAVE:
			if (sheetObj.RowCount()== 0){
				ComShowCodeMessage("FIN00002");
				return false; 
			}
			for(var i=sheetObj.HeaderRows(); i<=sheetObj.LastRow(); i++ ){
				if(sheetObj.GetCellValue(i, "vvd") == "") {
					ComShowCodeMessage("COM130403", "VVD");
					sheetObj.SelectCell(i, "vvd");
					return false;
				}
			}
			if (!chkDuplicateData(sheetObj)) {
				return false;
			}
			break;
		case IBDELETE:
			if (ComPriSheetCheckedRows(sheetObj, "del_chk") == "") {
				ComShowCodeMessage('SCO00004', 'Select', 'checkbox');
				return false;	  
			}
			break;	
	}
	return true;
}
/**
 * Calling this function in case of changing the cell value in sheet
 **/
function sheet2_OnChange(sheetObj, row, col, val) {
	var formObject=document.form;
	var col_save_name=sheetObj.ColSaveName(col);
	if(sheetObj.ColSaveName(col) == "vvd" && sheetObj.GetCellValue(row, "vvd") != "") {
		var vvd=sheetObj.GetCellValue(row, "vvd");
		if(vvd.length != 10){
			ComShowCodeMessage("FIN00003", "VVD");
			sheetObj.SetCellValue(row, "vvd","",0);
			sheetObj.SelectCell(row, "vvd");
			return;
		}
		doActionIBSheet(sheetObj, document.form, SEARCH04, row, col);
	}else if(sheetObj.ColSaveName(col) == "vvd_com_lvl" && sheetObj.GetCellValue(row, "vvd_com_lvl") != "") {
		var lvl=sheetObj.GetCellValue(row, "vvd_com_lvl");
		if(lvl > 6 || lvl < 1){
			ComShowCodeMessage("FIN00003", "VVD Common Level");
			sheetObj.SetCellValue(row, "vvd_com_lvl","",0);
			sheetObj.SelectCell(row,"vvd_com_lvl");
			return;
		}
	}else if(sheetObj.ColSaveName(col) == "rlane_cd" && sheetObj.GetCellValue(row, "rlane_cd") != "") {
		doActionIBSheet(sheetObj, document.form, SEARCH03, row, col);
	}else if(sheetObj.ColSaveName(col) == "rev_yrmon" && sheetObj.GetCellValue(row, "rev_yrmon") != ""){
		var yrmon=sheetObj.GetCellValue(row, "rev_yrmon");
		if(yrmon < "200001"){
			ComShowCodeMessage("FIN00007", "");
			sheetObj.SelectCell(row,"rev_yrmon");
			return;			
		}	
	}
}

function chkDuplicateData(sheetObj) {
	for(var i=sheetObj.HeaderRows(); i<=sheetObj.LastRow()-1; i++ ){		
		for(var k=i+1; k<=sheetObj.LastRow(); k++ ){
			if(sheetObj.GetCellValue(i, "vvd") == sheetObj.GetCellValue(k, "vvd")) {
				ComShowCodeMessage('COM12115', sheetObj.GetCellValue(k, "vvd"));
				return false;
			} 
		}
	}
	
	return true;
}