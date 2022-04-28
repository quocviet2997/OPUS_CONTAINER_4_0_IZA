/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_SUP_0003.js
*@FileTitle  : EDI GROUP CARGO 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/
=========================================================
*/
	// The common variables
	var tabObjects = new Array();
	var tabCnt = 0;
	var beforetab = 1;
	var sheetObjects = new Array();
	var sheetCnt = 0;
	var vslCombo = "";
	var vvdCombo = "";
	
	// Event handler processing by button click event */
	document.onclick = processButtonClick;
	
	// Event handler processing by button name */
	function processButtonClick() {
		var sheetObject = sheetObjects[0];
		var formObject = document.form;
		try {
			var srcName = ComGetEvent('name');
			if(ComGetBtnDisable(srcName)) return false;
			switch (srcName) {
			case "btn_retrieve":
				doActionIBSheet(sheetObject, formObject, IBSEARCH);
				break;
			case "btn_new":
				ComResetAll();
				inputReadOnly('new');
				break;
			case "btn_save":
				doActionIBSheet(sheetObject, formObject, IBSAVE);
				break;
			case "btn_add":
				if (!ComChkValid(formObject))
					return;
				var row = sheetObject.DataInsert(-1);
				sheetObject.SetCellValue(row, "edi_grp_cd", formObject.s_grp_cd.value); 
				sheetObject.SetCellEditable(row, "bkg_ctrt_div_cd", false);
				inputReadOnly();
				break;
			case "btn_del":
				rowRemove(sheetObject);
				break;
			} // end switch
		} catch (e) {
			if (e == "[object Error]") {
				ComShowMessage(OBJECT_ERROR);
			} else {
				ComShowMessage(e);
			}
		}
	}
	
	/**
	 * registering IBCombo Object as list adding process for list in case of needing
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
		sheetObjects[0].ExtendLastCol = false;
		for (k = 0; k < tabObjects.length; k++) {
			initTab(tabObjects[k], k + 1);
		}
		initControl();
	}
	
	/**
	 * setting sheet initial values and header param : sheetObj, sheetNo adding case
	 * as numbers of counting sheets
	 */
	function initSheet(sheetObj, sheetNo) {
		var cnt = 0;
		switch (sheetNo) {
		case 1: // sheet1 init
			with(sheetObj) {
			  var HeadTitle = "|Seq|Del|Group Code|Company Div.|Country|Customer Seq.|Standard Status|Customer EDI Status|Event Seq.|EDI Send Flag|Vessel Type|Send Interval|CNTR Send Type|Origin Continent|Origin Country|Dest. Continent|Dest. Country|Remark|Auto Send Flag|Status Seq.";
              SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
              var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
              var headers = [ { Text:HeadTitle, Align:"Center"} ];
              InitHeaders(headers, info);
              var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
                           {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"Seq" },
                           {Type:"DummyCheck", Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
                           {Type:"Text",      Hidden:0,  Width:105,  Align:"Center",  ColMerge:0,   SaveName:"edi_grp_cd",           KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:10, AcceptKeys:"E|N", InputCaseSensitive:1 },
                           {Type:"Text",      Hidden:0,  Width:130,  Align:"Center",  ColMerge:0,   SaveName:"co_div_cd",            KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:10, AcceptKeys:"E|N", InputCaseSensitive:1 },
                           {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"cust_cnt_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:2, AcceptKeys:"E|N", InputCaseSensitive:1 },
						   {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"cust_seq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:6 },
                           {Type:"Text",      Hidden:0,  Width:140,  Align:"Center",  ColMerge:0,   SaveName:"edi_stnd_sts_cd",      KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:10, AcceptKeys:"E|N", InputCaseSensitive:1 },
                           {Type:"Text",      Hidden:0,  Width:160,  Align:"Center",  ColMerge:0,   SaveName:"cust_edi_sts_cd",      KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:10, AcceptKeys:"E|N", InputCaseSensitive:1 },
                           {Type:"Combo",     Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"edi_evnt_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                           {Type:"Combo",     Hidden:0, Width:110,  Align:"Center",  ColMerge:0,   SaveName:"edi_snd_flg",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                           {Type:"Combo",     Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"edi_vsl_tp_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                           {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"edi_snd_itval_hrmnt",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:4,AcceptKeys:"E|N", InputCaseSensitive:1 },
                           {Type:"Combo",     Hidden:0, Width:130,  Align:"Center",  ColMerge:0,   SaveName:"edi_cntr_snd_tp_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                           {Type:"Text",      Hidden:0,  Width:140,  Align:"Center",  ColMerge:0,   SaveName:"org_conti_desc",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:100, AcceptKeys:"E|N", InputCaseSensitive:1},
                           {Type:"Text",      Hidden:0,  Width:160,  Align:"Center",  ColMerge:0,   SaveName:"org_dest_cnt_desc",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:4000 },
                           {Type:"Text",      Hidden:0,  Width:140,  Align:"Center",  ColMerge:0,   SaveName:"dest_conti_desc",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:100, AcceptKeys:"E|N", InputCaseSensitive:1},
                           {Type:"Text",      Hidden:0,  Width:160,  Align:"Center",  ColMerge:0,   SaveName:"dest_cnt_desc",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:4000 },
                           {Type:"Text",      Hidden:0,  Width:105,  Align:"Center",  ColMerge:0,   SaveName:"edi_cgo_rmk",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1000 },
                           {Type:"Combo",     Hidden:0, Width:110,  Align:"Center",  ColMerge:0,   SaveName:"edi_auto_snd_flg",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                           {Type:"Text",      Hidden:1, Width:130,  Align:"Center",  ColMerge:0,   SaveName:"edi_sts_seq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
              InitColumns(cols);
              SetEditable(1);
              SetColProperty("edi_evnt_cd", {ComboText: "All|First|Not first|Last|Not last", ComboCode: "5|1|2|3|4"});
              SetColProperty("edi_snd_flg", {ComboText: "N|Y", ComboCode: "N|Y"});
              SetColProperty("edi_vsl_tp_cd", {ComboText: "ALL|NOT TRUNK|TRUNK", ComboCode: "3|2|1"});
              SetColProperty("edi_cntr_snd_tp_cd", {ComboText: "Container|B/L", ComboCode: "C|B"});
              SetColProperty("edi_auto_snd_flg", {ComboText: "N|Y", ComboCode: "N|Y"});
              SetSheetHeight(380);              
           // InitDataValid(0, "edi_snd_itval_hrmnt", vtEngUpOther, "-0123456789");
            //SetColProperty(0 ,"edi_snd_itval_hrmnt", {AcceptKeys:"E|N|[.-/,() &]"});
  			//InitDataValid(0, "edi_grp_cd", vtEngUpOther, "0123456789");
  			SetColProperty(0 ,"edi_grp_cd" , {AcceptKeys:"E|N" , InputCaseSensitive:1});
  			//InitDataValid(0, "cust_edi_sts_cd", vtEngUpOther, "0123456789");
  			SetColProperty(0 ,"cust_edi_sts_cd" , {AcceptKeys:"E|N" , InputCaseSensitive:1});

  			//InitDataValid(0, "org_conti_desc", vtEngUpOther, ",");
  			SetColProperty(0 ,"org_conti_desc" , {AcceptKeys:"E|N|[,]",InputCaseSensitive:1});
  			//InitDataValid(0, "org_dest_cnt_desc", vtEngUpOther, ",");
  			SetColProperty(0 ,"org_dest_cnt_desc" , {AcceptKeys:"E|N|[,]",InputCaseSensitive:1});
  			//InitDataValid(0, "dest_conti_desc", vtEngUpOther, ",");
  			SetColProperty(0 ,"dest_conti_desc" , {AcceptKeys:"E|N|[,]",InputCaseSensitive:1});
  			//InitDataValid(0, "dest_cnt_desc", vtEngUpOther, ",");
  			SetColProperty(0 ,"dest_cnt_desc" , {AcceptKeys:"E|N|[,]",InputCaseSensitive:1});

  		//	InitDataValid(0, "co_div_cd", vtEngUpOnly);
  			//SetColProperty(0 ,"dest_cnt_desc" , {AcceptKeys:"E"});
  		//	InitDataValid(0, "edi_stnd_sts_cd", vtEngUpOnly);
  			//SetColProperty(0 ,"dest_cnt_desc" , {AcceptKeys:"E"});
              
              
	       }
		break;
		}
	}
	
	/**
	 * Handling the process about the sheet <br>
	 * param : sheetObj, formObj, sAction, Col, Row
	 */
	function doActionIBSheet(sheetObj, formObj, sAction, Col, Row) {
		sheetObj.ShowDebugMsg = false;
		switch (sAction) {
		case IBSEARCH: // retrieving
			if (validateForm(sheetObj, formObj, sAction)) {
				formObj.f_cmd.value = SEARCH;
				var sXml = sheetObj.GetSearchData("BCM_SUP_0003GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(""));
				var arrXml = sXml.split("|$$|");
				if (arrXml.length > 0)
					sheetObjects[0].LoadSearchData(arrXml[0]);
			}
			break;
	
		case IBSAVE: // saving
			if (!validateForm(sheetObj, formObj, sAction))
				return;
			formObj.f_cmd.value = MULTI;
			var arrSheets = new Array(sheetObjects[0]);
			var sParam = ComGetSaveString(arrSheets);
			if (sheetObj.RowCount == 0 || (!sheetObj.IsDataModified && sParam == "")) {
				ComShowCodeMessage("SUP00002");
				return;
			}
			var aryPrefix = new Array("");
			sParam += "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix);
			var sXml = sheetObj.GetSaveData("BCM_SUP_0003GS.do", sParam);
			var result = ComGetEtcData(sXml, "TRANS_RESULT_KEY");
			var arrXml = sXml.split("|$$|");
			if (arrXml.length > 0) {
				if (result == 'S') {
					sheetObjects[0].LoadSearchData(arrXml[0]);
				} else {
					sheetObjects[0].LoadSaveData(arrXml[0]);
				}
			}
			  // fix  Auto clear data in Grid 
			   doActionIBSheet(sheetObj,formObj,IBSEARCH);
			break;
	
		case IBROWSEARCH:
			// Checking Customer Country Code
			if (Col == "edi_stnd_sts_cd") {
				var param = 'f_cmd=' + SEARCH01;
				param += "&edi_stnd_sts_cd=" + sheetObj.GetCellValue(Row, "edi_stnd_sts_cd");// call from
				var sXml = sheetObj.GetSearchData("BCM_SUP_0003GS.do", param);
				var stndStsCd = ComGetEtcData(sXml, "stndStsCd");
				if (typeof stndStsCd == "undefined" || stndStsCd == "") {
					ComShowCodeMessage("SUP00009");
					sheetObj.SetCellValue(Row, Col, "");
					sheetObj.SelectCell(Row, Col);
				}
			} else if (Col == "org_conti_desc" || Col == "dest_conti_desc") {
				var param = 'f_cmd=' + SEARCH02;
				var gridContiDesc = "";
				if (Col == "org_conti_desc") {
					gridContiDesc = sheetObj.GetCellValue(Row, "org_conti_desc");
				} else {
					gridContiDesc = sheetObj.GetCellValue(Row, "dest_conti_desc");
				}
				param += "&conti_desc=" + gridContiDesc;// call from the grid
				ComOpenWait(true);
				var sXml = sheetObj.GetSearchData("SUPCommonGS.do", param);
				var contiDesc = ComGetEtcData(sXml, "contiDesc");
				ComOpenWait(false);
				if (typeof contiDesc == "undefined" || contiDesc == "") {
					ComShowCodeMessage("SUP00012");
					sheetObj.SetCellValue(Row, Col, "");
					sheetObj.SelectCell(Row, Col);
				} else {
					if (gridContiDesc != contiDesc) {
						compareContinentCode(sheetObj, Row, Col, gridContiDesc,
								contiDesc);
					}
				}
			} else if (Col == "org_dest_cnt_desc" || Col == "dest_cnt_desc") {
				var param = 'f_cmd=' + SEARCH03;
				var gridCntDesc = "";
				if (Col == "org_dest_cnt_desc") {
					gridCntDesc = sheetObj.GetCellValue(Row, "org_dest_cnt_desc");
				} else {
					gridCntDesc = sheetObj.GetCellValue(Row, "dest_cnt_desc");
				}
				param += "&cnt_desc=" + gridCntDesc;// call from the grid
				var sXml = sheetObj.GetSearchData("SUPCommonGS.do", param);
				var cntDesc = ComGetEtcData(sXml, "cntDesc");
				if (typeof cntDesc == "undefined" || cntDesc == "") {
					ComShowCodeMessage("SUP00013");
					sheetObj.SetCellValue(Row, Col, "");
					sheetObj.SelectCell(Row, Col);
				} else {
					if (gridCntDesc != cntDesc) {
						compareCountryCode(sheetObj, Row, Col, gridCntDesc, cntDesc);
					}
				}
			}
			break;
		}
	}
	
	/**
	 * Removing IBSheet Row <br>
	 * 
	 * @param {ibsheet}
	 *            sheetObj IBSheet Object
	 */
	function rowRemove(sheetObj) {
		ComRowHideDelete(sheetObj, "DelChk");
	}
	
	/**
	 * Loading the event of HTML control in the page dynamically. <br>
	 */
	function initControl() {
		// axon_event.addListener('keypress', 'engnum_keypress', 's_grp_cd');
		// axon_event.addListener('keypress', 'eng_keypress', 's_co_div_cd', 's_stnd_sts_cd');
		axon_event.addListener('keydown', 'ComKeyEnter', 'form');
	}
	
	/**
	 * Checking the validation in case of occuring blur event in HTML control <br>
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
	 * allowed to input alphabet only and converting the uppercase from the inputted
	 * alphabet
	 */
//	function eng_keypress() {
//		ComKeyOnlyAlphabet('upper');
//	}
	
	/**
	 * allowed to input number and alphabet only and converting the uppercase from
	 * the inputted alphabet
	 */
//	function engnum_keypress() {
//		ComKeyOnlyAlphabet('uppernum');
//	}
	
	/**
	 * Setting readonly at s_grp_cd field by the flag value
	 */
	function inputReadOnly(flag) {
		if (flag == "new") {
			form.s_grp_cd.readOnly = false;
		} else {
			form.s_grp_cd.readOnly = true;
		}
	}
	
	/**
	 * Calling this function in case of changing the cell value in sheet param :
	 * sheetObj, Row, Col, Value
	 */
	function sheet1_OnChange(sheetObj, Row, Col, Value) {
		if (sheetObj.ColSaveName(Col) == "edi_stnd_sts_cd") {
			doActionIBSheet(sheetObj, document.form, IBROWSEARCH, "edi_stnd_sts_cd", Row);
		} else if (sheetObj.ColSaveName(Col) == "org_conti_desc") {
			var orgContiDesc = sheetObj.GetCellValue(Row, "org_conti_desc");
			if (orgContiDesc != "") {
				var arrOrgConti = orgContiDesc.split(",");
				for ( var idx = 0; idx < arrOrgConti.length; idx++) {
					if (arrOrgConti[idx].length != 1) {
						ComShowCodeMessage("SUP00008", "1", "Origin Continent");
						sheetObj.SetCellValue(Row, "org_conti_desc", "");
						sheetObj.SelectCell(Row, "org_conti_desc");
						return false;
					}
				}
				doActionIBSheet(sheetObj, document.form, IBROWSEARCH, "org_conti_desc", Row);
			}
	
		} else if (sheetObj.ColSaveName(Col) == "dest_conti_desc") {
			var destContiDesc = sheetObj.GetCellValue(Row, "dest_conti_desc");
			if (destContiDesc != "") {
				var arrDestConti = destContiDesc.split(",");
				for ( var idx = 0; idx < arrDestConti.length; idx++) {
					if (arrDestConti[idx].length != 1) {
						ComShowCodeMessage("SUP00008", "1", "Dest. Continent");
						sheetObj.SetCellValue(Row, "dest_conti_desc", "");
						sheetObj.SelectCell(Row, "dest_conti_desc");
						return false;
					}
				}
				doActionIBSheet(sheetObj, document.form, IBROWSEARCH, "dest_conti_desc", Row);
			}
	
		} else if (sheetObj.ColSaveName(Col) == "org_dest_cnt_desc") {
			var orgDestCntDesc = sheetObj.GetCellValue(Row, "org_dest_cnt_desc");
			if (orgDestCntDesc != "") {
				var arrOrgDest = orgDestCntDesc.split(",");
				for ( var idx = 0; idx < arrOrgDest.length; idx++) {
					if (arrOrgDest[idx].length != 2) {
						ComShowCodeMessage("SUP00008", "2", "Origin Country");
						sheetObj.SetCellValue(Row, "org_dest_cnt_desc","");
						sheetObj.SelectCell(Row, "org_dest_cnt_desc");
						return false;
					}
				}
				doActionIBSheet(sheetObj, document.form, IBROWSEARCH, "org_dest_cnt_desc", Row);
			}
	
		} else if (sheetObj.ColSaveName(Col) == "dest_cnt_desc") {
			var destCntDesc = sheetObj.GetCellValue(Row, "dest_cnt_desc");
			if (destCntDesc != "") {
				var arrDestCnt = destCntDesc.split(",");
				for ( var idx = 0; idx < arrDestCnt.length; idx++) {
					if (arrDestCnt[idx].length != 2) {
						ComShowCodeMessage("SUP00008", "2", "Dest. Country");
						sheetObj.SetCellValue(Row, "dest_cnt_desc", "");
						sheetObj.SelectCell(Row, "dest_cnt_desc");
						return false;
					}
				}
				doActionIBSheet(sheetObj, document.form, IBROWSEARCH, "dest_cnt_desc", Row);
			}
		}
	}
	
	/**
	 * checking whether the inputted value is existed or not after retrieving
	 * Continent Code param : sheetObj, Row, Col, gridContiDesc, contiDesc
	 */
	function compareContinentCode(sheetObj, Row, Col, gridContiDesc, contiDesc) {
		var arrGridContiDesc = gridContiDesc.split(",");
		var arrDbContiDesc = contiDesc.split(",");
		for ( var i = 0; i < arrGridContiDesc.length; i++) {
			var cnt = 0;
			for ( var j = 0; j < arrDbContiDesc.length; j++) {
				if (arrGridContiDesc[i] == arrDbContiDesc[j]) {
					cnt = cnt + 1;
				}
			}
			if (cnt == 0) {
				ComShowCodeMessage("SUP00010", arrGridContiDesc[i]);
				sheetObj.SetCellValue(Row, Col, "");
				sheetObj.SelectCell(Row, Col);
				return false;
			}
		}
	}
	
	/**
	 * checking whether the inputted value is existed or not after retrieving
	 * Country Code param : sheetObj, Row, Col, gridCntDesc, cntDesc
	 */
	function compareCountryCode(sheetObj, Row, Col, gridCntDesc, cntDesc) {
		var arrGridCntDesc = gridCntDesc.split(",");
		var arrDbCntDesc = cntDesc.split(",");
		for ( var i = 0; i < arrGridCntDesc.length; i++) {
			var cnt = 0;
			for ( var j = 0; j < arrDbCntDesc.length; j++) {
				if (arrGridCntDesc[i] == arrDbCntDesc[j]) {
					cnt = cnt + 1;
				}
			}
			if (cnt == 0) {
				ComShowCodeMessage("SUP00011", arrGridCntDesc[i]);
				sheetObj.SetCellValue(Row, Col, "");
				sheetObj.SelectCell(Row, Col);
	
				return false;
			}
		}
	}
	
	/**
	 * handling process for input validation <br>
	 * param : sheetObj, formObj, sAction
	 */
	function validateForm(sheetObj, formObj, sAction) {
		if (sAction == 0) {
			if (!ComChkValid(formObj))
				return false;
		} else {
			var orgContiDesc = "";
			var orgDestCntDesc = "";
			var destContiDesc = "";
			var destCntDesc = "";
			for ( var ir = 1; ir <= sheetObj.LastRow(); ir++) {
				if (sheetObj.GetRowStatus(ir) == "D")
					continue;
				if (sheetObj.GetCellValue(ir, "edi_grp_cd")=="") {
					ComShowCodeMessage("SUP00001", "Group Code");
					sheetObj.SelectCell(ir, "edi_grp_cd");
					return false;
				} else if (sheetObj.GetCellValue(ir, "co_div_cd")=="") {
					ComShowCodeMessage("SUP00001", "Company Div.");
					sheetObj.SelectCell(ir, "co_div_cd");
					return false;
				} else if (sheetObj.GetCellValue(ir, "edi_stnd_sts_cd")== "") {
					ComShowCodeMessage("SUP00001", "Standard Status");
					sheetObj.SelectCell(ir, "edi_stnd_sts_cd");
					return false;
				} else if (sheetObj.GetCellValue(ir, "cust_edi_sts_cd")== "") {
					ComShowCodeMessage("SUP00001", "Customer EDI Status");
					sheetObj.SelectCell(ir, "cust_edi_sts_cd");
					return false;
				}
				orgContiDesc = sheetObj.GetCellValue(ir, "org_conti_desc");
				orgDestCntDesc = sheetObj.GetCellValue(ir, "org_dest_cnt_desc");
				destContiDesc = sheetObj.GetCellValue(ir, "dest_conti_desc");
				destCntDesc = sheetObj.GetCellValue(ir, "dest_cnt_desc");
				if (orgContiDesc == "" && orgDestCntDesc == "") { ComShowCodeMessage("SUP00001", "Origin Continent or Origin Country");
					sheetObj.SelectCell(ir, "org_conti_desc");
					return false;
				} else if (destContiDesc == "" && destCntDesc == "") {
					ComShowCodeMessage("SUP00001", "Continent or Country");
					sheetObj.SelectCell(ir, "dest_conti_desc");
					return false;
				}
				if (orgContiDesc != "") {
					var arrOrgConti = orgContiDesc.split(",");
					for ( var idx = 0; idx < arrOrgConti.length; idx++) {
						if (arrOrgConti[idx].length != 1) {
							ComShowCodeMessage("SUP00008", "1", "Origin Continent");
							sheetObj.SelectCell(ir, "org_conti_desc");
							return false;
						}
					}
				}
				if (orgDestCntDesc != "") {
					var arrOrgDest = orgDestCntDesc.split(",");
					for ( var idx = 0; idx < arrOrgDest.length; idx++) {
						if (arrOrgDest[idx].length != 2) {
							ComShowCodeMessage("SUP00008", "2", "Origin Country");
							sheetObj.SelectCell(ir, "org_dest_cnt_desc");
							return false;
						}
					}
				}
				if (destContiDesc != "") {
					var arrDestConti = destContiDesc.split(",");
					for ( var idx = 0; idx < arrDestConti.length; idx++) {
						if (arrDestConti[idx].length != 1) {
							ComShowCodeMessage("SUP00008", "1", "Dest. Continent");
							sheetObj.SelectCell(ir, "dest_conti_desc");
							return false;
						}
					}
				}
				if (destCntDesc != "") {
					var arrDestCnt = destCntDesc.split(",");
					for ( var idx = 0; idx < arrDestCnt.length; idx++) {
						if (arrDestCnt[idx].length != 2) {
							ComShowCodeMessage("SUP00008", "2", "Dest. Country");
							sheetObj.SelectCell(ir, "dest_cnt_desc");
							return false;
						}
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
		for ( var ir = 1; ir <= sheetObj.LastRow; ir++) {
			sheetObj.SetCellEditable(ir, "co_div_cd", 0);
			sheetObj.SetCellEditable(ir, "edi_stnd_sts_cd", 0);
		}
	}
	
    // halding edit th customer info
    function openCustomer(){
    	ComOpenPopup('ESD_SCE_0062.do?mycust=2', 700, 400, "findCustomer", "1,0", false);
    }	
    
    function findCustomer(rtnVal) {
    	form.s_cust_cd.value = rtnVal.cust_cnt_cd+rtnVal.cust_seq;
    }
	