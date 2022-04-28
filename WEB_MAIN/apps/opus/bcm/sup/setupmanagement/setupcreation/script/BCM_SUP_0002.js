/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_SUP_0002.js
*@FileTitle  : EDI GROUP CUSTOMER 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/21
=========================================================
*/

/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
 MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
 OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends
 * @class EDI GROUP CUSTOMER : business script for EDI GROUP CUSTOMER
 */
	function BCM_SUP_0002() {
		this.processButtonClick=processButtonClick;
		this.setSheetObject=setSheetObject;
		this.loadPage=loadPage;
		this.initSheet=initSheet;
		this.initControl=initControl;
		this.doActionIBSheet=doActionIBSheet;
		this.setTabObject=setTabObject;
		this.rowRemove=rowRemove;
		this.obj_deactivate=obj_deactivate;
		this.engnum_keypress=engnum_keypress;
		this.eng_keypress=eng_keypress;
		this.validateForm=validateForm;
	}
	// The common variables
	var tabObjects=new Array();
	var tabCnt=0;
	var beforetab=1;
	var sheetObjects=new Array();
	var sheetCnt=0;
	var vslCombo="";
	var vvdCombo="";
	// Event handler processing by button click event */
	document.onclick = processButtonClick;
	// Event handler processing by button name */
	function processButtonClick() {
		var sheetObject=sheetObjects[0];
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
			switch (srcName) {
			case "btn_retrieve":
				doActionIBSheet(sheetObject, formObject, IBSEARCH);
				break;
			case "btn_new":
				ComResetAll();
				break;
			case "btn_save":
				doActionIBSheet(sheetObject, formObject, IBSAVE);
				break;
			case "btn_savetofile":
				if(sheetObject.RowCount() < 1){//no data
	        	     ComShowCodeMessage("COM132501");
	        	    }else{
	        	    	sheetObject.Down2Excel( {DownCols: makeHiddenSkipCol(sheetObject), SheetDesign:1,Merge:1 });
	        	    }
				break;
			case "btn_add":
				var row=sheetObject.DataInsert(-1);
				sheetObject.SetCellEditable(row, "bkg_ctrt_div_cd",0);
				sheetObject.SelectCell(row, "edi_grp_cd");
				sheetObject.SetCellValue(row,"an_flg","N");
				break;
			case "btn_del":
				rowRemove(sheetObject);
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
	 * registering IBCombo Object as list adding process for list in case of needing
	 * batch processing with other items defining list on the top of source
	 */
	function setSheetObject(sheet_obj) {
		sheetObjects[sheetCnt++]=sheet_obj;
	}
	/**
	 * initializing sheet implementing onLoad event handler in body tag adding
	 * first-served functions after loading screen.
	 */
	function loadPage() {
		for (i=0; i < sheetObjects.length; i++) {
			ComConfigSheet(sheetObjects[i]);
			initSheet(sheetObjects[i], i + 1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		sheetObjects[0].SetExtendLastCol(0);
		for (k=0; k < tabObjects.length; k++) {
			initTab(tabObjects[k], k + 1);
		}
		initControl();
	}
	/**
	 * setting sheet initial values and header param : sheetObj, sheetNo adding case
	 * as numbers of counting sheets
	 */
	function initSheet(sheetObj, sheetNo) {
		var cnt=0;
		switch (sheetNo) {
		case 1: // sheet1 init
            with(sheetObj){
				SetFocusEditMode(1);
				var HeadTitle="|Seq|Del|Group Code|Company Div.|Country|Customer Seq.|SC / RFA No.|Effective Date|Expire Date|Customer Role|Partner Office|I/B Service Flag|Arrival Notice|B/L Type|BKG Confirm Flag|BKG Confirm Flag(Auto)|B/L Flag(Auto)|B/L Flag|Cargo Tracking Flag|Contract Type";
				SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
				var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
				var headers = [ { Text:HeadTitle, Align:"Center"} ];
				InitHeaders(headers, info);
				var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
							{Type:"Text",       Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"Seq" },
							{Type:"DummyCheck", Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
							{Type:"Text",       Hidden:0, Width:105,  Align:"Center",  ColMerge:0,   SaveName:"edi_grp_cd",        KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:10, AcceptKeys:"E|N|[-_]", InputCaseSensitive:1 },
							{Type:"Text",       Hidden:0, Width:130,  Align:"Center",  ColMerge:0,   SaveName:"co_div_cd",         KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:10, AcceptKeys:"E|N", InputCaseSensitive:1 },
							{Type:"Text",       Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"cust_cnt_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:2, AcceptKeys:"E|N", InputCaseSensitive:1 },
							{Type:"Text",       Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"cust_seq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:6 },
							{Type:"Text",       Hidden:0, Width:110,  Align:"Center",  ColMerge:0,   SaveName:"sc_no",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20, AcceptKeys:"E|N", InputCaseSensitive:1 },
							{Type:"Date",       Hidden:0, Width:120,  Align:"Center",  ColMerge:1,   SaveName:"sc_eff_st_dt",      KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
							{Type:"Date",       Hidden:0, Width:120,  Align:"Center",  ColMerge:1,   SaveName:"sc_eff_end_dt",     KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
							{Type:"Text",       Hidden:0, Width:110,  Align:"Center",  ColMerge:0,   SaveName:"cust_role",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20, InputCaseSensitive:1 },
							{Type:"Text",       Hidden:1, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"vt_cust_ofc_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20, AcceptKeys:"E|N|[-_]", InputCaseSensitive:1 },
							{Type:"Combo",      Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"ib_svc_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
							{Type:"Combo",      Hidden:0, Width:120,   Align:"Center",  ColMerge:0,   SaveName:"an_flg",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
							{Type:"Combo",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"esvc_bl_tp_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
							{Type:"Combo",      Hidden:0, Width:130,  Align:"Center",  ColMerge:0,   SaveName:"bkg_cfm_flg",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
							{Type:"Combo",      Hidden:0, Width:170,  Align:"Center",  ColMerge:0,   SaveName:"bkg_cfm_auto_flg",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
							{Type:"Combo",      Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"bl_drft_auto_flg",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
							{Type:"Combo",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"bl_drft_flg",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
							{Type:"Combo",      Hidden:0, Width:150,  Align:"Center",  ColMerge:0,   SaveName:"cgo_trc_svc_flg",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
							{Type:"Combo",      Hidden:0, Width:130,  Align:"Center",  ColMerge:0,   SaveName:"bkg_ctrt_div_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
				InitColumns(cols);
				SetEditable(1);
				SetColProperty("ib_svc_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
				SetColProperty("an_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
				SetColProperty("esvc_bl_tp_cd", {ComboText:"|BLF|BLN|BIF|BIN", ComboCode:"|BLF|BLN|BIF|BIN"} );
				SetColProperty("bkg_cfm_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
				SetColProperty("bkg_cfm_auto_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
				SetColProperty("bl_drft_auto_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
				SetColProperty("bl_drft_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
				SetColProperty("cgo_trc_svc_flg", {ComboText:"Y|N", ComboCode:"Y|N"} );
				SetColProperty("bkg_ctrt_div_cd", {ComboText:"|S/C|RFA", ComboCode:"|1|2"} );
				SetSheetHeight(380);
			}
		break;
		}
	}
	/**
	 * Handling the process about the sheet <br>
	 * param : sheetObj ,formObj, sAction, Col, Row
	 */
	function doActionIBSheet(sheetObj, formObj, sAction, Col, Row) {
		sheetObj.ShowDebugMsg(false);
		switch (sAction) {
		case IBSEARCH: // retrieving
			if(!validateForm(sheetObj,formObj,sAction)) {
				return false;
			}
			formObj.f_cmd.value=SEARCH;
			var sXml=sheetObj.GetSearchData("BCM_SUP_0002GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(""));
			var arrXml=sXml.split("|$$|");
			if (arrXml.length > 0)
				sheetObjects[0].LoadSearchData(arrXml[0],{Sync:0} );
			break;
			
		case IBSAVE: // saving
			if (!validateForm(sheetObj, formObj, sAction))
				return;
			formObj.f_cmd.value=MULTI;
			var arrSheets=new Array(sheetObjects[0]);
			var sParam=ComGetSaveString(arrSheets);
			if (sheetObj.RowCount()== 0 || (!sheetObj.IsDataModified()&& sParam == "")) {
				ComShowCodeMessage("SUP00002");
				return;
			}
			var aryPrefix=new Array("");
			sParam += "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix);
			var sXml=sheetObj.GetSaveData("BCM_SUP_0002GS.do", sParam);
			var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
			var arrXml=sXml.split("|$$|");
			if (arrXml.length > 0) {
				if (result == 'S') {
					ComShowCodeMessage('SUP00019');
					sheetObjects[0].LoadSearchData(arrXml[0],{Sync:0} );
				} else {
					sheetObjects[0].LoadSaveData(arrXml[0]);
				}
			}
			  // fix  Auto clear data in Grid 
			   doActionIBSheet(sheetObj,formObj,IBSEARCH);
			break;
			
		case IBROWSEARCH:
			if (Col == "cust_cnt_cd" || Col == "cust_seq") {
				var param='f_cmd=' + SEARCH01;
				param += "&cust_cnt_cd=" + sheetObj.GetCellValue(Row, "cust_cnt_cd") + "&cust_seq=" + sheetObj.GetCellValue(Row, "cust_seq");// calling
				ComOpenWait(true);
				var sXml=sheetObj.GetSearchData("SUPCommonGS.do", param);
				ComOpenWait(false);
				var custCntCd=ComGetEtcData(sXml, "custCntCd");
				if (typeof custCntCd == "undefined" || custCntCd == "") {
					if (Col == "cust_cnt_cd") {
						ComShowCodeMessage("SUP00006");
						sheetObj.SetCellValue(Row, Col,"",0);
						sheetObj.SelectCell(Row, Col);
					} else {
						ComShowCodeMessage("SUP00007");
						sheetObj.SetCellValue(Row, Col,"",0);
						sheetObj.SelectCell(Row, Col);
					}
				} else {
					if (sheetObj.GetCellValue(Row, "cust_seq") == "") {
					}
					sheetObj.SetCellEditable(Row, "sc_no",0);
				}
			}
			break;
		}
	}
	/**
	 * Removing IBSheet Row <br>
	 * 
	 * @param {ibsheet}
	 * sheetObj IBSheet Object
	 */
	function rowRemove(sheetObj) {
		ComRowHideDelete(sheetObj, "DelChk");
	}
	/**
	 * Loading the event of HTML control in the page dynamically. <br>
	 */
	function initControl() {
		// axon_event.addListener('keypress', 'engnum_keypress', 's_grp_cd', 's_sc_no');
		// axon_event.addListener('keypress', 'eng_keypress', 's_co_div_cd');
		axon_event.addListener('keydown', 'ComKeyEnter', 'form');
	}
	/**
	 * Checking the validation in case of occurring blur event in HTML control <br>
	 */
	function obj_deactivate() {
		switch (event.srcElement.name) {
		case "bnk_yrmon":
			ComChkObjValid(event.srcElement);
			break;
		default:
			ComChkObjValid(event.srcElement);
		}
	}
	/**
	 * Converting the uppercase from the inputted alphabet and allowed to input
	 * alphabet only
	 */
//	function eng_keypress() {
//		ComKeyOnlyAlphabet('upper');
//	}
	/**
	 * Converting the uppercase from the inputted alphabet and allowed to input
	 * number and alphabet only
	 */
//	function engnum_keypress() {
//		ComKeyOnlyAlphabet('uppernum');
//	}
	/**
	 * Calling this function in case of changing the cell value in sheet param :
	 * sheetObj, Row, Col, Value
	 */
	function sheet1_OnChange(sheetObj, Row, Col, Value) {
		var custCntCd=sheetObj.GetCellValue(Row, "cust_cnt_cd");
		var custSeq=sheetObj.GetCellValue(Row, "cust_seq");
		var scNo=sheetObj.GetCellValue(Row, "sc_no");
		var custRole=sheetObj.GetCellValue(Row, "cust_role");
		if (sheetObj.ColSaveName(Col) == "cust_cnt_cd") {
			if (custCntCd == "" && custSeq == "" && custRole == "") {
				sheetObj.SetCellEditable(Row, "sc_no",1);
			} else {
				if (custCntCd.length == 2) {
					doActionIBSheet(sheetObj, document.form, IBROWSEARCH, sheetObj
							.ColSaveName(Col), Row);
				} else {
					ComShowCodeMessage("SUP00005");
					sheetObj.SelectCell(Row, Col);
					return;
				}
			}
		} else if (sheetObj.ColSaveName(Col) == "cust_seq") {
			if (custCntCd == "" && custSeq == "" && custRole == "") {
				sheetObj.SetCellEditable(Row, "sc_no",1);
			} else {
				if (custCntCd != "" && custSeq != "") {
					doActionIBSheet(sheetObj, document.form, IBROWSEARCH, sheetObj.ColSaveName(Col), Row);
				} else if (sheetObj.GetCellValue(Row, "cust_cnt_cd") == "") {
					sheetObj.SelectCell(Row, "cust_cnt_cd");
				}
				sheetObj.SetCellEditable(Row, "sc_no",0);
			}
		} else if (sheetObj.ColSaveName(Col) == "sc_no") {
			if (scNo == "") {
				sheetObj.SetCellEditable(Row, "cust_cnt_cd",1);
				sheetObj.SetCellEditable(Row, "cust_seq",1);
				sheetObj.SetCellEditable(Row, "cust_role",1);
				sheetObj.SetCellValue(Row, "bkg_ctrt_div_cd","");
				sheetObj.SetCellEditable(Row, "bkg_ctrt_div_cd",0);
			} else {
				sheetObj.SetCellEditable(Row, "cust_cnt_cd",0);
				sheetObj.SetCellEditable(Row, "cust_seq",0);
				sheetObj.SetCellEditable(Row, "cust_role",0);
				sheetObj.SetCellEditable(Row, "bkg_ctrt_div_cd",1);
			}
		} else if (sheetObj.ColSaveName(Col) == "cust_role") {
			if (custRole == "") {
				if(sheetObj.GetRowStatus(Row) == "I"){
					sheetObj.SetCellEditable(Row, "cust_cnt_cd",1);
					sheetObj.SetCellEditable(Row, "cust_seq",1);
				}
				if (custCntCd == "" && custSeq == "") {
					sheetObj.SetCellEditable(Row, "sc_no",1);
					sheetObj.SetCellEditable(Row, "bkg_ctrt_div_cd",1);
				}

			} else {
				if(sheetObj.GetRowStatus(Row) == "I"){
					sheetObj.SetCellEditable(Row, "cust_cnt_cd",1);
					sheetObj.SetCellEditable(Row, "cust_seq",1);
				}
				sheetObj.SetCellEditable(Row, "sc_no",0);
				sheetObj.SetCellEditable(Row, "bkg_ctrt_div_cd",0);
			}
		} else if (sheetObj.ColSaveName(Col) == "sc_eff_st_dt") {
			var endDt=sheetObj.GetCellValue(Row, "sc_eff_end_dt");
			if (endDt != "" && Value > endDt) {
				ComShowCodeMessage("SUP00003");
				sheetObj.SetCellValue(Row, Col,"",0);
				sheetObj.SelectCell(Row, Col);
			}
		} else if (sheetObj.ColSaveName(Col) == "sc_eff_end_dt") {
			var startDt=sheetObj.GetCellValue(Row, "sc_eff_st_dt");
			if (startDt != "" && Value < startDt) {
				ComShowCodeMessage("SUP00004");
				sheetObj.SetCellValue(Row, Col,'',0);
				sheetObj.SelectCell(Row, Col);
			}
		}
	}
	/**
	 * handling process for input validation <br>
	 * param : sheetObj, formObj, sAction
	 */
	function validateForm(sheetObj, formObj, sAction) {
		with(formObj){
			switch(sAction) {
			case IBSEARCH:
				if( formObj.s_grp_cd.value == "" ){
					ComShowCodeMessage( "SUP00001", "Group Code"  );					
					return false;
				}
			case IBSAVE:
				for ( var ir=1; ir <= sheetObj.LastRow(); ir++) {
					if (sheetObj.GetRowStatus(ir) == "D")
						continue;
					if (sheetObj.GetCellValue(ir, "edi_grp_cd") == "") {
						ComShowCodeMessage("SUP00001", "Group Code");
						sheetObj.SelectCell(ir, "edi_grp_cd");
						return false;
					}
					if (sheetObj.GetCellValue(ir, "co_div_cd") == "") {
						ComShowCodeMessage("SUP00001", "Company Div.");
						sheetObj.SelectCell(ir, "co_div_cd");
						return false;
					}
					if (sheetObj.GetCellValue(ir, "cust_cnt_cd").trim() == "" && sheetObj.GetCellValue(ir, "cust_seq").trim() == "" && sheetObj.GetCellValue(ir, "sc_no").trim() == "") {
						ComShowCodeMessage("SUP00001", "Either Customer Code(Country, Customer Seq.) or SC / RFA No.");
						sheetObj.SelectCell(ir, "cust_cnt_cd");
						return false;
					}
					if (sheetObj.GetCellValue(ir, "cust_cnt_cd").trim() != "" && sheetObj.GetCellValue(ir, "cust_seq").trim() == "") {
						ComShowCodeMessage("SUP00001", "Customer Seq.");
						sheetObj.SelectCell(ir, "cust_seq");
						return false;
					}
					if (sheetObj.GetCellValue(ir, "cust_cnt_cd").trim() == "" && sheetObj.GetCellValue(ir, "cust_seq").trim() != "") {
						ComShowCodeMessage("SUP00001", "Customer Country Code");
						sheetObj.SelectCell(ir, "cust_cnt_cd");
						return false;
					}
					if (sheetObj.GetCellValue(ir, "sc_no").trim() != ""	&& sheetObj.GetCellValue(ir, "bkg_ctrt_div_cd").trim() == "") {
						ComShowCodeMessage("SUP00001", "Contract Type");
						sheetObj.SelectCell(ir, "bkg_ctrt_div_cd");
						return false;
					}	
				}
			}
		}
		return true;
	}
	/**
	 * Calling this function after finishing to retrieve sheet1 param : sheetObj,
	 * ErrMsg
	 */
	function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
		for ( var ir=1; ir <= sheetObj.LastRow(); ir++) {
			sheetObj.SetCellEditable(ir, "edi_grp_cd",0);
			sheetObj.SetCellEditable(ir, "co_div_cd",0);
			sheetObj.SetCellEditable(ir, "cust_cnt_cd",0);
			sheetObj.SetCellEditable(ir, "cust_seq",0);
			sheetObj.SetCellEditable(ir, "sc_no",0);
			if (sheetObj.GetCellValue(ir, "cust_cnt_cd").trim() != "") {
				sheetObj.SetCellEditable(ir, "bkg_ctrt_div_cd",0);
			}
			
			if (sheetObj.GetCellValue(ir, "sc_no").trim() != "") {
				sheetObj.SetCellEditable(ir, "cust_role",0);
			}
			
			
			
		}
	}
	
    // halding edit th customer info
    function openCustomer(){
    	ComOpenPopup('ESD_SCE_0062.do?mycust=2', 700, 400, "findCustomer", "1,0", false);
    }	
    
    function findCustomer(rtnVal) {
    	form.s_cust_cd.value = rtnVal.cust_cnt_cd+rtnVal.cust_seq;
    }
