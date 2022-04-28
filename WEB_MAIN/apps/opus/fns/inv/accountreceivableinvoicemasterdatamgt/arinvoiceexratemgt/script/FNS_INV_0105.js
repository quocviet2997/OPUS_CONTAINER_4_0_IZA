/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0105.js
*@FileTitle  : VVD Ex. Rate Creation by Date
*@author     : IY Cho
*@version    : 1.0
*@since      : 2014/11/21
=========================================================*/

	var sheetObjects=new Array();
	var sheetCnt=0;
	
	var ROWMARK="|";
	var FIELDMARK="=";
	
	var retrieveFlg=0;  
	var rdObjects=new Array();
	var rdCnt=0;
	
	var svcScpArr="";
	
	// Defining button events. */
	document.onclick=processButtonClick;
	
	/** 
	 * Handling button event. <br>
	 */
	function processButtonClick(){
		/***** Setting each tab's sheet variable. *****/
		var sheetObject1=sheetObjects[0];
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch(srcName) {
			case "btn1_History":
				var param="ar_ofc_cd=" + formObject.ofc_cd.value + "&vvd_cd=" + formObject.vvd_cd.value;
				var popupWin=ComOpenWindowCenter("/opuscntr/FNS_INV_0107.do?" + param, "history_popup", 900, 500, false, "no");
				popupWin.focus();
				break;
			case "Row_Add":
				if (retrieveFlg == 1) {
					var idx=sheetObject1.DataInsert(-1);
					for(i=0;i<formObject.bnd_cd.length;i++){
						if(formObject.bnd_cd[i].checked){
							bndCd=formObject.bnd_cd[i].value;
						}		 					
					}
					sheetObject1.SetCellValue(idx,"io_bnd_cd",bndCd,0);
					sheetObject1.SetCellValue(idx,"ar_ofc_cd",formObject.ofc_cd.value,0);
					sheetObject1.SetCellValue(idx,"vvd_cd",formObject.vvd_cd.value,0);
					sheetObject1.SetCellValue(idx,"vsl_cd",formObject.vvd_cd.value.substring(0,4),0);
					sheetObject1.SetCellValue(idx,"skd_voy_no",formObject.vvd_cd.value.substring(4,8),0);
					sheetObject1.SetCellValue(idx,"skd_dir_cd",formObject.vvd_cd.value.substring(8,9),0);
					sheetObject1.SetCellValue(idx,"port_cd","");
				}	
				break; 
			case "btn2_Row_Copy":
				if (sheetObject1.RowCount()> 0) {
					var idx=sheetObject1.DataCopy();
					for(i=0;i<formObject.bnd_cd.length;i++){
						if(formObject.bnd_cd[i].checked){
							bndCd=formObject.bnd_cd[i].value;
						}		 					
					}
					sheetObject1.SetCellValue(idx,"io_bnd_cd",bndCd,0);
					sheetObject1.SetCellValue(idx,"ar_ofc_cd",formObject.ofc_cd.value,0);
				}
				break;
			case "btn2_Del":
				doActionIBSheet(sheetObject1,formObject,IBDELETE);
				break;
			case "btn1_Retrieve":
				retrieveFlg=1;
				doActionIBSheet(sheetObject1,document.form,IBSEARCH);
				break; 
			case "btn1_New":
				retrieveFlg=0;
				formObject.vvd.value="";
				formObject.vvd_cd.value="";
				formObject.bnd_cd[0].checked=true;
				formObject.bnd.value="";
				vps_port_cd.SetEnable(0);
				svc_scp_cd.SetEnable(0);
				ComBtnDisable("btn_downexcel");
				sheetObject1.RemoveAll();
				doActionIBSheet(sheetObject1,document.form,IBSEARCH_ASYNC01); 	
				break;
			case "btn1_Save":
				if(sheetObject1.RowCount() < 1){//no data					
					ComShowCodeMessage("COM130104");
				}else{
					if (retrieveFlg == 1) {
						doActionIBSheet(sheetObject1,document.form,IBSAVE);
					}
				}
				break;
			case "btn_downexcel":
				if(sheetObject1.RowCount() < 1){//no data	
					ComShowCodeMessage("COM132501");
				}else{	
					sheetObject1.Down2Excel( {KeyFieldMark:false,AutoSizeColumn:true,DownCols: makeHiddenSkipCol(sheetObject1), SheetDesign:1,Merge:1 });
				}
				break;
			} // end switch
		}catch(e) {
			if( e == "[object Error]") {
				ComShowMessage(OBJECT_ERROR);
			} else {
				ComShowMessage(e.message);
			}
		}
	}
	/** 
	 * Register IBSheet object on sheetObjects array. <br>
	 * @param  {IBSheet} sheetObj IBSheet Object
	 */
	function setSheetObject(sheet_obj){
		sheetObjects[sheetCnt++]=sheet_obj;
	}
	/** 
	 * Coding event handler for body tag's OnLoad. <br>
	 * Add  pre-process functions after loading by browser. <br> 
	 */
	function loadPage() {
		for(i=0;i<sheetObjects.length;i++){
			ComConfigSheet (sheetObjects[i] );
			initSheet(sheetObjects[i],i+1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		initControl();
		doActionIBSheet(sheetObjects[0],document.form,IBSEARCH_ASYNC01); 	
		ComBtnDisable("btn_downexcel");
		vps_port_cd.SetEnable(0);
		svc_scp_cd.SetEnable(0);
		document.form.vvd_cd.focus();
	}
	/** 
	 * Initialize sheets. <br>
	 * Add  pre-process functions after loading by browser. <br>
	 * Coding initial modules as sheet's count. <br> 
	 * @param {IBSheet} sheetObj : Sheet object.
	 * @param Serial number for sheet object's ID.  
	 */
	function initSheet(sheetObj,sheetNo) {
		var cnt=0;
		switch(sheetObj.id) {
		case "sheet1":      //sheet1 init
			with(sheetObj){
				
			      //no support[check again]CLT 			if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);
			      var HeadTitle1="|Sel|VVD|Port|ETD|Scope|Bound|Ex. Rate Date|Updated By|Updated Date|Remark||||||";
			      var headCount=ComCountHeadTitle(HeadTitle1);

			      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );

			      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
			      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
			      InitHeaders(headers, info);

			      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
  	                     {Type:"CheckBox",	Hidden:0, 	Width:50,   Align:"Center",  ColMerge:1,   SaveName:"delChk" },
			             {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:1,   SaveName:"vvd_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:"port_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Date",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"etda_dt",         KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:"svc_scp_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:"io_bnd_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Date",     Hidden:0,  Width:80,  Align:"Center",   ColMerge:1,   SaveName:"xch_rt_dt",     KeyField:0,   CalcLogic:"",   Format:"Ymd",   PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Text",      Hidden:0,  Width:140,  Align:"Center",  ColMerge:1,   SaveName:"upd_usr_id",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Date",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:1,   SaveName:"upd_dt",          KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",     Hidden:0,  Width:80,  Align:"Left",   ColMerge:1,   SaveName:"cng_rmk",     KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"skd_voy_no" },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"skd_dir_cd" },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"vsl_cd" },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ar_ofc_cd" },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"org_rmk" } ];
			      
			      InitColumns(cols);
			      SetEditable(1);
			      SetWaitImageVisible(0);
			      InitComboNoMatchText(true);
			      SetSheetHeight(400);
			      FitColWidth("3|10|8|8|8|8|10|8|8|30");
				  SetColProperty("io_bnd_cd", {ComboText:"I/B|O/B", ComboCode:"I|O"} );
				  InitComboNoMatchText(1,"",1);
				  resizeSheet();
			}
			break;
		}
	}
	/** 
	 * Coding retrieve, save... <br>
	 * @param  {IBSheet} sheetObj : Sheet object.  
	 * @param  {object} formObj : Form object.
	 * @param  {sAction} sAction : f_cmd.
	 */
	function doActionIBSheet(sheetObj,formObj,sAction) {
		sheetObj.ShowDebugMsg(false);
		switch(sAction) {
			case IBSEARCH_ASYNC01: // Retrieve AR_OFFICE_LIST.
			ComOpenWait(true);
			formObj.f_cmd.value=SEARCH01; 			
			var sXml=sheetObj.GetSearchData("FNS_INV_0105GS.do", FormQueryString(formObj));
			//===========office list =======================//
			var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
			var arrStr=sStr.split("|");
			MakeComboObject2(ar_ofc_cd, arrStr);
			var arrStr2=arrStr[1].split("^");
			var ar_ofc_cd_text=arrStr2[3];
			for(i=1;i<arrStr.length;i++){
				arrStr2=arrStr[i].split("^");
				if(arrStr2[1]==arrStr2[3]){
					ar_ofc_cd_text = arrStr2[1];
					ar_ofc_cd.SetSelectText(ar_ofc_cd_text);
					formObj.ar_ofc_cd2.value=arrStr2[1];
					formObj.ofc_cd.value=arrStr2[1];
					formObj.svr_id.value=arrStr2[7];
				}
			}
			ComOpenWait(false);
			break;    
			case IBSEARCH_ASYNC02:      //retrieve Port/Scope
        		formObj.f_cmd.value=SEARCH02; 			
        		var sXml=sheetObj.GetSearchData("FNS_INV_0105GS.do", FormQueryString(formObj));
        		//====== port list ====================//
        		var portStr=ComGetEtcData(sXml,"portList");
        		var arrPortStr=portStr.split("|");
        		MakeComboObject(vps_port_cd, arrPortStr);
        		addCellComboItem(sheetObjects[0],portStr,"port_cd",false);
        		//====== scope list ====================//
        		var scpStr=ComGetEtcData(sXml,"svcScpList");
        		var scpStr2="ALL|"+ComGetEtcData(sXml,"svcScpList");
        		var arrScpStr=scpStr.split("|");
        		MakeComboObject(svc_scp_cd, arrScpStr);
        		addCellComboItem(sheetObjects[0],scpStr2,"svc_scp_cd",false);
        		svcScpArr = scpStr;
				break;
			case IBSEARCH:      //retrieve
				if(validateForm(sheetObj,formObj,sAction)){
					ComOpenWait(true);
					formObj.f_cmd.value=SEARCH03; 				
					sheetObj.DoSearch("FNS_INV_0105GS.do",FormQueryString(formObj) );
					ComBtnEnable("btn_downexcel");
					ComOpenWait(false);
				}  
				break;
			case IBSAVE:        //save
			if(validateForm(sheetObj,formObj,sAction)){
				ComOpenWait(true);
				formObj.f_cmd.value=MULTI;
				sheetObj.DoSave("FNS_INV_0105GS.do",FormQueryString(formObj)+ "&"+ ComSetPrifix(sheetObj.GetSaveString(),"sheet1_"),-1,false);
				ComOpenWait(false);
				ComBtnEnable("btn_downexcel");
			}
			break;
			case IBDELETE:      // delete
				var chkRow=sheetObj.FindCheckedRow("delChk");
				if (chkRow== "") {
					ComShowCodeMessage("COM12189");
					return false;
				}
				if(!searchARInvoiceExist(sheetObj)) return false;
				var arrRow=chkRow.split("|");
				for (i=0; i<arrRow.length; i++) {
					if(sheetObj.GetRowStatus(arrRow[i])=="I"){
						continue;
					}else{
						if(sheetObj.GetCellText(arrRow[i],"cng_rmk")=="" || sheetObj.GetCellText(arrRow[i],"cng_rmk")==sheetObj.GetCellText(arrRow[i],"org_rmk")){
							ComShowCodeMessage("INV00139"); //Please specify the reason for deleting exchange rate date?
							sheetObj.SelectCell(arrRow[i],"cng_rmk");
							return false;
						}
					}
				}
				ComRowHideDelete(sheetObj, "delChk");
				break;
		}
	}
	/** 
	 * Validating input value. <br>
	 * @param  {IBSheet} sheetObj : Sheet object.  
	 * @param  {object} formObj : Form object.
	 * @param  {sAction} sAction : f_cmd.
	 * @return true, false
	 */
	function validateForm(sheetObj,formObj,sAction){
		with(formObj){
			switch(sAction) {
			case IBSEARCH: // retrieve
			if (!ComChkValid(formObj)) return false;
			break;
			case IBSAVE:        //save
				for (var i=1; i<=sheetObj.RowCount(); i++) {
					if(sheetObj.GetCellValue(i,"port_cd")==""){
						ComShowCodeMessage("COM130201", "Port"); //Please input Port.
						sheetObj.SelectCell(i,"port_cd");
						return false;
					}
					if(sheetObj.GetCellValue(i,"xch_rt_dt")==""){
						ComShowCodeMessage("COM130201", "Ex. Rate Date"); //Please input Ex. Rate Date.
						sheetObj.SelectCell(i,"xch_rt_dt");
						return false;
					}
				}
				if(svcScpArr =="ALL"){
					ComShowCodeMessage("INV00165");
					return false;
				}
				if(!searchDailyExRateExist(sheetObj)) return false; //Daily exchange rate is missing.

				for (var i=1; i<=sheetObj.RowCount(); i++) {
					if(sheetObj.GetCellValue(i,"ibflag")=="I" && sheetObj.GetCellValue(i,"svc_scp_cd")=="ALL"){
						for(var j=1; j<sheetObj.RowCount(); j++){
							if(i!=j){
								if(sheetObj.GetCellValue(i,"port_cd") == sheetObj.GetCellValue(j,"port_cd")){
									ComShowCodeMessage("INV00147"); //Scope already exist for the VVD/Bound/Port.
									sheetObj.SelectCell(i,"svc_scp_cd");
									return false;
								}
							}
						}
					}
					if(sheetObj.GetCellValue(i,"ibflag")=="U"){
						if(sheetObj.GetCellText(i,"cng_rmk")=="" || sheetObj.GetCellText(i,"cng_rmk")==sheetObj.GetCellText(i,"org_rmk")){
							ComShowCodeMessage("INV00138"); //Please specify the reason for changing exchange rate date?
							sheetObj.SelectCell(i,"cng_rmk");
							return false;
						}
					}
				}
			break;
			}
			return true;
		}
	}
	
	/** 
	 * Initialize IBMultiCombo.<br>
	 */
	function MakeComboObject(cmbObj, arrStr) {
		for (var i=0; i < arrStr.length;i++ ) {
			cmbObj.InsertItem(i, arrStr[i], arrStr[i]);
		}
		cmbObj.SetItemCheck("ALL",true);
		cmbObj.SetDropHeight(200);
	}
	
	/**
	 * Creating combo.<br>
	 * @param object cmbObj
	 * @param String arrStr
	 */         
	function MakeComboObject2(cmbObj, arrStr) {
		cmbObj.SetDropHeight(190);
		for (var i=1; i < arrStr.length;i++ ) {
			var arrStr2=arrStr[i].split("^");
			var ar_ofc_cd_text=arrStr2[1];
			cmbObj.InsertItem(i-1, ar_ofc_cd_text, arrStr[i]);
		}		
	}      
	/**
	 * Add data in combo field.
	 */		
	function addCellComboItem(sheetObj,comboValues,colName,isCellCombo) {
		var sRow=sheetObj.GetSelectRow();
		var comboTxt="";
		var comboVal="";
		var comboItems;
		var comboItem;
		var arrStr2;
		
		if (colName != '') {
			if (comboValues != undefined) {
				comboItems=comboValues.split(ROWMARK);
				for (var i=1 ; i < comboItems.length ; i++) {
					comboItem=comboItems[i].split(FIELDMARK);
					if (comboItem[0] != "") {
						comboTxt += comboItem[0];
						comboVal += comboItem[0];
					}
					if (i < comboItems.length-1) {
						comboTxt += ROWMARK;
						comboVal += ROWMARK;
					}
				}
			}
		}	
		if (isCellCombo) {
			sheetObj.CellComboItem(sRow,colName, {ComboText:comboTxt, ComboCode:comboVal} );
		}
		else {
			sheetObj.SetColProperty(colName, {ComboText:comboTxt, ComboCode:comboVal} );
		}
	}

	function sheet1_OnSearchEnd(sheetObj, Code, ErrMsg){
	}

	function sheet1_OnSaveEnd(sheetObj, Code, ErrMsg){      		
		retrieveFlg=1;
		doActionIBSheet(sheetObj,document.form,IBSEARCH);
	}

	function sheet1_OnChange(sheetObj,Row,col){
		var effDt=ComGetUnMaskedValue(ComGetNowInfo(), "ymd");
		if(sheetObj.ColSaveName(col) == "port_cd" && sheetObj.GetCellValue(Row,"port_cd")!=""){
			if(sheetObj.GetCellValue(Row,"vvd_cd").substring(0,4)!='CFDR'&&sheetObj.GetCellValue(Row,"vvd_cd").substring(0,4)!='USAC'){
				document.form.f_cmd.value=SEARCH07;
				document.form.vvd.value=sheetObj.GetCellValue(Row,"vvd_cd");
				document.form.bnd.value=sheetObj.GetCellValue(Row,"io_bnd_cd");
				document.form.port.value=sheetObj.GetCellValue(Row,"port_cd");
				var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(document.form));
				var sStr=ComGetEtcData(sXml,"sail_arr_dt");
				if(sStr==""&&sheetObj.GetCellValue(Row,"port_cd")!=""){
					ComShowCodeMessage("INV00050"); //Invalid Port!
					sheetObj.SetCellValue(Row,"port_cd","");
					document.form.port.value="";
					return;
				}else{
					sheetObj.SetCellValue(Row,"etda_dt",sStr,0);
				}
			}
		}
	}

	/**
	 * Resetting header by option.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   changeHeaderName('I');
	 * </pre>
	 * @param string value
	 */		 
	function changeHeaderName(value){
		sheetObjects[0].RemoveAll();
		if(value=='I'){
	
		      var HeadTitle1="|Sel|VVD|Port|ETA|Scope|Bound|Ex. Rate Date|Updated By|Updated Date|Remark||||||||||";
			  var titlearr = "";
			  titlearr = HeadTitle1.split("|");
			  for(var i=0;i<titlearr.length;i++){
				  sheetObjects[0].SetCellValue(0,i,titlearr[i]);
			  }
		}else{
		      var HeadTitle2="|Sel|VVD|Port|ETD|Scope|Bound|Ex. Rate Date|Updated By|Updated Date|Remark||||||||||";
			  var titlearr = "";
			  titlearr = HeadTitle2.split("|");
			  for(var i=0;i<titlearr.length;i++){
				  sheetObjects[0].SetCellValue(0,i,titlearr[i]);
			  }
		}
	}
	/**
	 * KEY Event<br>
	 */
	function initControl() {
		// Axon event process. Event catch.
		var formObj=document.form;
		axon_event.addListenerFormat ('keypress', 'obj_keypress', formObj);
		axon_event.addListenerForm ('change', 'obj_onchange', formObj);
	}
	/**
	 * KEY Event<br>
	 */
	function obj_keypress(){
		switch(event.srcElement.dataformat){
			case "float":
				// Only number or '.'.
				ComKeyOnlyNumber(event.srcElement, ".");
				break;
			case "ymd":
				// Only number or '-'.
				ComKeyOnlyNumber(event.srcElement);
				break;
			case "eng":
				// Only Alphabet or number.
				ComKeyOnlyAlphabet();
				break;
			case "engdn":
				// Only lower case.
				ComKeyOnlyAlphabet('lower');
				break;
			case "engup":
				// Only upper case.
				ComKeyOnlyAlphabet('upper');
				break;
			case "num":
				// Only number(integer, date, time).
				ComKeyOnlyNumber('num');
				break;
			case "uppernum":
				// Only upper case or number. 
				ComKeyOnlyAlphabet('uppernum');
				break;
			default:
				// Only upper case.
				ComKeyOnlyAlphabet('upper');
		}
	}

	/** 
	 * handling OnChange event<br>
	 */
	function obj_onchange() {
		var sheetObj=sheetObjects[0];
		var formObj=document.form;
        switch(ComGetEvent("name")){
            case "vvd_cd":
            	if(formObj.vvd_cd.value.length<9){
            		ComShowCodeMessage("INV00039"); // VVD is invalid!
            		formObj.vvd_cd.value ="";
            		formObj.vvd_cd.focus();
            		return false;
            	}
            	vps_port_cd.RemoveAll();
            	svc_scp_cd.RemoveAll();
				vps_port_cd.SetEnable(1);
				svc_scp_cd.SetEnable(1);
            	doActionIBSheet(sheetObj,formObj,IBSEARCH_ASYNC02);
           	break;
        }	    
	}
	
	/**
	 * Checking the existence of Invoice.<br>
	 * @param object sheetObj
	 */
	function searchARInvoiceExist(sheetObj){
		document.form.f_cmd.value=REMOVE;
		var sXml=sheetObj.GetSearchData("FNS_INV_0105GS.do",FormQueryString(document.form)+ "&"+ ComSetPrifix(sheetObj.GetSaveString(),"sheet1_"),-1,false);
		var chkCnt=ComGetEtcData(sXml,"cnt");
		if(chkCnt =="0" || chkCnt ==""){
			return true;
		}else{
			ComShowCodeMessage("INV00037"); // Exchange rate already applied to invoice.
			return false;
		}
	}
	
	/**
	 * Checking the existence of Daily Rate.<br>
	 * @param object sheetObj
	 */
	function searchDailyExRateExist(sheetObj){
/* JHJ 2017-07 start! */
		document.form.f_cmd.value=SEARCH05;
		var sXml=sheetObj.GetSearchData("FNS_INV_0105GS.do",FormQueryString(document.form)+ "&"+ ComSetPrifix(sheetObj.GetSaveString(),"sheet1_"),-1,false);
		var exRtUsdTpCd=ComGetEtcData(sXml,"xch_rt_usd_tp_cd");
/* JHJ 2017-07 end! */
		
		document.form.f_cmd.value=SEARCH04;
		var sXml=sheetObj.GetSearchData("FNS_INV_0105GS.do",FormQueryString(document.form)+ "&"+ ComSetPrifix(sheetObj.GetSaveString(),"sheet1_"),-1,false);
		var chkCnt=ComGetEtcData(sXml,"ex_cnt");
		
/* JHJ 2017-07 start! */
		/*
		if(chkCnt =="0" || chkCnt ==""){
			ComShowCodeMessage("INV00146"); // Daily exchange rate is missing.
			return false;
		}else{
			return true;
		}
		This AR office is set in the <Daily Ex.Rate> area, not the <VVD Ex.Rate> area
		*/

		if(chkCnt =="0" || chkCnt ==""){
			if(exRtUsdTpCd != "V"){
				ComShowMessage("There is no daily exchange rate for this date.\nPlease enter the daily exchange rate in <Ex. Rate Creation by Date>."); // Daily exchange rate is missing.
			} else {
				ComShowCodeMessage("INV00146"); // Daily exchange rate is missing.
			}
			return false;
			
		}else{
			return true;
		}
		
/* JHJ 2017-07 end! */
	}
	
    function resizeSheet(){
 		ComResizeSheet(sheetObjects[0]);
 	}
    
	/**
	 * When change ar_ofc_cd data, execute function.<br>
	 * Setting office.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   ar_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode);
	 * </pre>
	 * @param {IBMultiCombo} comboObj
	 * @param {String} oldIndex
	 * @param {String} oldText
	 * @param {String} oldCode
	 * @param {String} newIndex
	 * @param {String} newText
	 * @param {String} newCode
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */		  
	function ar_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
		sheetObjects[0].RemoveAll();
		var formObj=document.form;
		var arrStr2=comboObj.GetSelectCode().split("^");
		setOfcOtherInfo(arrStr2);

	}
	
    /**
     * setOfcOtherInfo<br>
     * <br><b>Example :</b>
     * <pre>
     *     setOfcOtherInfo(arrStr2)
     * </pre>
     * @param {arrStr2} 
     * @author CLT
     * @version 2014.11.29
     */
    function setOfcOtherInfo(arrStr2) {
    	var formObj=document.form;
    	formObj.ar_ofc_cd2.value=arrStr2[1];
    	formObj.ofc_cd.value=arrStr2[1];
    	formObj.svr_id.value=arrStr2[7];     
    }
