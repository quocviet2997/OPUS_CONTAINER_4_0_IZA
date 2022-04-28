/**=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0007.js
*@FileTitle  : Ex. Rate Creation by Customer
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/14
=========================================================**/
	
	// Common variables.
	var sheetObjects=new Array();
	var sheetCnt=0;
	
	var retrieveFlg=0;
	var ROWMARK="|";
	var FIELDMARK="=";
	
	// Defining button events. */
	document.onclick=processButtonClick;
	/** 
	 * Handling button event. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  none.  
	 * @return none.
	 * @see #
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	function processButtonClick(){
		/***** Setting each tab's sheet variable. *****/
		var sheetObject1=sheetObjects[0];
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch(srcName) {
				case "btn_retrieve":
					form.dispaly.disabled=false;
					doActionIBSheet(sheetObject1,document.form,IBSEARCH);
					break; 
				case "btn_new":
					form.exrate_btn.style.display="none";
					form.dispaly.checked=false;
					retrieveFlg == 1;
					form.dispaly.disabled=true;
					sheetObject1.RemoveAll();
					doActionIBSheet(sheetObjects[0],document.form,IBRESET);
					break; 
				case "btn_save":
					doActionIBSheet(sheetObject1,document.form,IBSAVE);
					break;
				case "btn_downexcel": 					
					//sheetObject1.Down2Excel({ HiddenColumn:-1,Merge:true,TreeLevel:false});
					if(sheetObject1.RowCount() < 1){//no data
						ComShowCodeMessage("COM132501");
	        		 }else{
	        			sheetObject1.Down2Excel({ HiddenColumn:-1,Merge:true,TreeLevel:false}); 
	        			//sheetObject1.Down2Excel({ HiddenColumn:1 });
	        		 }
					break; 
				case "btn_add":
					if (retrieveFlg == 1) {
						doActionIBSheet(sheetObject1,document.form,IBINSERT);
					}	
					break;  
				case "btn_copy":
					//sheetObject1.DataCopy();					
					if(sheetObject1.RowCount() < 1){//no data
						alert("Can not copy the Row Data. There is exist only Header.");
					}else{
						sheetObject1.DataCopy();
					}
					break; 
				case "btn_del":
					ComRowHideDelete(sheetObject1, "DelChk");
					break;                                         
				case "btns_calendar": // Calendar button.
				var cal=new ComCalendar();
				cal.setDisplayType('month');
				cal.select(formObject.fm_dt, 'yyyy-MM');
				break;
				case "exrate_btn":   
					if(form.dispaly.checked) {
						if (retrieveFlg == 1) {
							var iCheckRow=sheetObject1.FindCheckedRow("DelChk");
							if (iCheckRow== "") {
								ComShowCodeMessage("INV00025");
								return false;
							}
							doActionIBSheet(sheetObject1,document.form,IBSEARCH_ASYNC02);
						}	
					}	
					break;
				case "btn_custNm":
					var Row=1;
					var Col=1;
					param='?pgmNo=FNS_INV_0086&cust_seq='+formObject.cust_seq.value+'&cust_cnt_cd='+formObject.cust_cnt_cd.value;
					ComOpenPopup('/opuscntr/FNS_INV_0086.do' + param, 900, 450, 'getFNS_INV_0086_1', '1,0', false, false, Row, Col, 0);
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
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj IBSheet Object
	 * @return none.
	 * @see #
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	function setSheetObject(sheet_obj){
		sheetObjects[sheetCnt++]=sheet_obj;
	}
	/** 
	 * Coding event handler for body tag's OnLoad. <br>
	 * Add  pre-process functions after loading by browser. <br> 
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  none.
	 * @return none.
	 * @see #
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	function loadPage() {
		for(i=0;i<sheetObjects.length;i++){
			ComConfigSheet (sheetObjects[i] );
			initSheet(sheetObjects[i],i+1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		initControl();
		doActionIBSheet(sheetObjects[0],document.form,IBSEARCH_ASYNC01); 	
		document.form.cust_cnt_cd.focus();
	}
	/** 
	 * Initialize sheets. <br>
	 * Add  pre-process functions after loading by browser. <br>
	 * Coding initial modules as sheet's count. <br> 
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {IBSheet} sheetObj : Sheet object.
	 * @param Serial number for sheet object's ID.  
	 * @return none.
	 * @see #
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	function initSheet(sheetObj,sheetNo) {
		var cnt=0;
		switch(sheetNo) {
			case 1:      //sheet1 init
			    with(sheetObj){
					  
				      var HeadTitle="|Sel.|Seq|From Date|To Date|Currency|Bound|Ex. Rate|Updated By|Updated Date";

				      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );

				      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
				      var headers = [ { Text:HeadTitle, Align:"Center"} ];
				      InitHeaders(headers, info);

				      var cols = [ {Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
				             {Type:"CheckBox",  Hidden:0, Width:55,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
				             {Type:"Seq",       Hidden:0, Width:65,   Align:"Center",  ColMerge:0,   SaveName:"Seq" },
				             {Type:"PopupEdit", Hidden:0, Width:150,  Align:"Center",  ColMerge:0,   SaveName:"fm_dt",           KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
				             {Type:"PopupEdit", Hidden:0, Width:150,  Align:"Center",  ColMerge:0,   SaveName:"to_dt",           KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
				             {Type:"Combo",     Hidden:0, Width:150,  Align:"Center",  ColMerge:0,   SaveName:"chg_curr_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
				             {Type:"Combo",     Hidden:0, Width:150,  Align:"Center",  ColMerge:0,   SaveName:"io_bnd_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
				             {Type:"Float",     Hidden:0, Width:150,  Align:"Right",   ColMerge:0,   SaveName:"inv_xch_rt",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6,   UpdateEdit:1,   InsertEdit:1 },
				             {Type:"Text",      Hidden:0, Width:150,  Align:"Center",  ColMerge:0,   SaveName:"upd_usr_id",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0, Width:150,  Align:"Center",  ColMerge:0,   SaveName:"upd_dt",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"xch_rt_rvs_flg",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
				             {Type:"Text",      Hidden:1, Width:50,   Align:"Right",   ColMerge:0,   SaveName:"ivs_xch_rt",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6,   UpdateEdit:0,   InsertEdit:1 },
				             {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"xch_rt_tp_cd" },
				             {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"cust_cnt_cd" },
				             {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"cust_seq" },
				             {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"locl_curr_cd" },
				             {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"ar_ofc_cd" },
				             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"pre_inv_xch_rt" } ];
				       
				      InitColumns(cols);
				      SetEditable(1);
				      SetColProperty("chg_curr_cd", {ComboText:"CHF|GBP|NOK|USD", ComboCode:"1|2|3|4"} );
				      SetWaitImageVisible(0);
				      //no support[check again]CLT 				PopupImage="img/btns_calendar.gif";
				      SetColProperty("io_bnd_cd", {ComboText:"O/B|I/B", ComboCode:"O|I"} );				      
				      InitComboNoMatchText(true);
//				      SetSheetHeight(450);
				      resizeSheet();
				}


				break;	
		}
	}
	/** 
	 * Coding retrieve, save... <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj : Sheet object.  
	 * @param  {object} formObj : Form object.
	 * @param  {sAction} sAction : f_cmd.
	 * @return none.
	 * @see #
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	function doActionIBSheet(sheetObj,formObj,sAction) {
		sheetObj.ShowDebugMsg(false);
		switch(sAction) {
			case IBSEARCH_ASYNC01: // Retrieve AR_OFFICE_LIST.
					ComOpenWait(true);
					formObj.f_cmd.value=SEARCH02; 			
					var sXml=sheetObj.GetSearchData("FNS_INV_0007GS.do", FormQueryString(formObj));
					var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
					var arrStr=sStr.split("|");
					MakeComboObject2(ar_ofc_cd2, arrStr);
					var arrStr2=arrStr[1].split("^");
					var ar_ofc_cd_text=arrStr2[3];
					ar_ofc_cd2.SetSelectText(ar_ofc_cd_text);
					//====== combo list ====================//
					var comboValues=ComGetEtcData(sXml, "currInfo");	
					addCellComboItem(sheetObj,comboValues,"chg_curr_cd",false);						
					//====== combo list ====================//
					var ret=ComGetNowInfo("ym" );
					formObj.fm_dt.value=ret;
					ComOpenWait(false);
			break;
			case IBSEARCH:      //retrieve
				retrieveFlg=1;
				formObj.f_cmd.value=SEARCH01;
				if(validateForm(sheetObj,formObj,sAction)) return;
				ComOpenWait(true); 			
				sheetObj.DoSearch("FNS_INV_0007GS.do",FormQueryString(formObj) );
				ComOpenWait(false);
			break;
			case IBSEARCH_ASYNC02:      //retrieve				
				if(validateForm(sheetObj,formObj,sAction)){
				} else {	
					var v_custCntCd=formObj.cust_cnt_cd.value;
					var v_custSeq=formObj.cust_seq.value;
					var v_mon=formObj.fm_dt.value;
					var param='?pgmNo=FNS_INV_0089&cust_cnt_cd='+v_custCntCd+'&cust_seq='+v_custSeq+'&mon='+v_mon;
					ComOpenPopup('/opuscntr/FNS_INV_0089.do' + param, 620, 425, 'getPopMulti', '0,0', false, false, "", "", 0);
				}		
			break;
			case IBSAVE:        //save
				if(validateForm(sheetObj,formObj,sAction)){
					return;
				}
				ComOpenWait(true);
				formObj.f_cmd.value=MULTI;
				sheetObj.DoSave("FNS_INV_0008GS.do", FormQueryString(formObj),-1,false);
				ComOpenWait(false);
			break;
			case IBINSERT:      // input
				var sheetIdx=sheetObj.DataInsert(-1);
				if (document.form.io_bnd_cd.value =="I") {
					sheetObj.SetCellText(sheetIdx,"io_bnd_cd" ,"I/B");
				} else {
					sheetObj.SetCellText(sheetIdx,"io_bnd_cd" ,"O/B");
				}
				sheetObj.SetCellText(sheetIdx,"xch_rt_tp_cd" ,"I");
				sheetObj.SetCellText(sheetIdx,"cust_cnt_cd" ,document.form.cust_cnt_cd.value);
				sheetObj.SetCellText(sheetIdx,"cust_seq" ,document.form.cust_seq.value);
				sheetObj.SetCellText(sheetIdx,"locl_curr_cd" ,document.form.locl_curr_cd.value);
				sheetObj.SetCellText(sheetIdx,"ar_ofc_cd" ,document.form.ar_ofc_cd.value);
			break;
			case IBRESET: // New
				var ret=ComGetNowInfo("ym" );
				formObj.fm_dt.value=ret;
				formObj.io_bnd_cd.value="";
				formObj.cust_cnt_cd.value="";
				formObj.cust_seq.value="";
				formObj.cust_nm.value="";
				formObj.io_bnd_cd.value="";
			break;	
		}
	}
	/** 
	 * Validating input value. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj : Sheet object.  
	 * @param  {object} formObj : Form object.
	 * @param  {sAction} sAction : f_cmd.
	 * @return true, false
	 * @see #
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	function validateForm(sheetObj,formObj,sAction){
		with(formObj){
			switch(sAction) {
			case IBSEARCH:      //retrieve
			if (formObj.cust_cnt_cd.value.trim() == ""){
				ComShowCodeMessage("INV00004");
				formObj.cust_cnt_cd.focus();
				return true;
			}
			if (formObj.cust_seq.value.trim() == ""){
				ComShowCodeMessage("INV00004");
				formObj.cust_seq.focus();
				return true;
			}
			if (formObj.cust_nm.value == "") {
				ComShowCodeMessage("INV00054");
				formObj.cust_cnt_cd.focus();
				return true;
			}
			break;
			case IBSAVE:        //save
			var cnt=sheetObj.RowCount();
			if (cnt < 1) {
				ComShowCodeMessage("INV00001");
				return true;
			}
			fn_ComGetMaskedValue();
			for (var i=1; i<=sheetObj.RowCount(); i++) {
				if (sheetObj.GetRowStatus(i) == "I") {
					var fmDt=sheetObj.GetCellValue(i,"fm_dt");
					var toDt=sheetObj.GetCellValue(i,"to_dt");
					var fmDt1=formObj.fm_dt.value;
					if (fmDt > toDt) {
						ComShowCodeMessage("INV00024",i+" Line");
						return true;
					}
					/*
					if(document.form.ar_ofc_cd.value != 'DXBBB'){							
						var Sdate=new Date(fmDt.substring(0,4), fmDt.substring(5,7)-1, fmDt.substring(8,10));
						var Edate=new Date(toDt.substring(0,4),toDt.substring(5,7)-1, toDt.substring(8,10));
						var interval=Edate - Sdate;
						var day=1000*60*60*24;
						if (parseInt(interval/day)>31) {	        			 
							ComShowCodeMessage("INV00024",i+" Line");
							return true;
						}					
					}
					*/
					if (sheetObj.GetCellValue(i,"chg_curr_cd").trim() == ""){
						ComShowCodeMessage("INV00041",i+" Line");
						return true;
					}
					    var xch = sheetObj.GetCellValue(i,"inv_xch_rt");
					if (xch == "" || xch == 0 ){
						ComShowCodeMessage("INV00041",i+" Line");
						return true;
					}else{
					//if (RateCheck(sheetObj, i, ComTrimAll(sheetObj.GetCellValue(i,"inv_xch_rt"),",")) == 0 ) {
					  if (RateCheck(sheetObj, i, sheetObj.GetCellValue(i,"inv_xch_rt")) == 0 ) {	  
							return true;
					   }
					}
				} else if (sheetObj.GetRowStatus(i) == "U") {
//					if (sheetObj.GetCellValue(i,"pre_inv_xch_rt").trim() != ""&&sheetObj.GetCellValue(i,"pre_inv_xch_rt").trim() != "0"){
//						if (!ComShowCodeConfirm("INV00126")){
//							return false;
//						}
//					}
					 var xch = sheetObj.GetCellValue(i,"inv_xch_rt");
					if (xch == "" || xch == 0 ){
						ComShowCodeMessage("INV00041",i+" Line");
						return true;
					} else {
					//	if (RateCheck(sheetObj, i, ComTrimAll(sheetObj.GetCellValue(i,"inv_xch_rt"),",")) == 0 ) {
						if (RateCheck(sheetObj, i, sheetObj.GetCellValue(i,"inv_xch_rt")) == 0 ) {
							return true;
						}
					}
				}	
			}
			break;
			case IBSEARCH_ASYNC02:        //save
			var cnt=sheetObj.RowCount();
			if (cnt < 1) {
				ComShowCodeMessage("INV00048");
				return true;
			}
			fn_ComGetMaskedValue();
			for (var i=1; i<=sheetObj.RowCount(); i++) {
				if (sheetObj.GetRowStatus(i) == "I") {
					var fmDt=sheetObj.GetCellText(i,"fm_dt");
					var toDt=sheetObj.GetCellText(i,"to_dt");
					var fmDt1=formObj.fm_dt.value;
					if (fmDt > toDt) {
						ComShowCodeMessage("INV00024",i+" Line");
						return true;
					}
					if (sheetObj.GetCellText(i,"chg_curr_cd").trim() == ""){
						ComShowCodeMessage("INV00041",i+" Line");
						return true;
					}
					if (sheetObj.GetCellText(i,"inv_xch_rt").trim() == ""){
						ComShowCodeMessage("INV00041",i+" Line");
						return true;
					} else {
					//	if (RateCheck(sheetObj, i, ComTrimAll(sheetObj.GetCellText(i,"inv_xch_rt"),",")) == 0 ) {
						if (RateCheck(sheetObj, i, sheetObj.GetCellText(i,"inv_xch_rt")) == 0 ) {	
							return true;
						}c
					}
				} else if (sheetObj.GetRowStatus(i) == "U") {
					if (sheetObj.GetCellText(i,"inv_xch_rt").trim() == ""){
						ComShowCodeMessage("INV00041",i+" Line");
						return true;
					} else {
					//	if (RateCheck(sheetObj, i, ComTrimAll(sheetObj.GetCellText(i,"inv_xch_rt"),",")) == 0 ) {
						if (RateCheck(sheetObj, i, sheetObj.GetCellText(i,"inv_xch_rt")) == 0 ) {		
							return true;
						}
					}
				}	
			}
			break;
			}
		}
		return;
	}
	/**
	 * Popup (FNS_INV_0086) After process, execute function.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    getFNS_INV_0086_1(rowArray, 1, 1);
	 * </pre>
	 * @param String rowArray
	 * @param number row
	 * @param number col
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function getFNS_INV_0086_1(rowArray, row, col) {    	 
		var colArray=rowArray[0];	
		document.form.cust_cnt_cd.value=colArray[8];
		document.form.cust_seq.value=ComLpad(colArray[9], 6, '0');
		fn_cust_nm();
	}
	/**
	 * Executing calendar popup.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    sheet1_OnPopupClick(SheetObjects[0], 1,1);
	 * </pre>
	 * @param object sheetObj
	 * @param number row
	 * @param number col
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function sheet1_OnPopupClick(sheetObj, row,col){
		if (sheetObj.ColSaveName(col) == "fm_dt") {
			var cal=new ComCalendarGrid("fm_dt");
			cal.select(sheetObj, row, col, 'yyyy-MM-dd');
		}
		if (sheetObj.ColSaveName(col) == "to_dt") {
			var cal=new ComCalendarGrid("to_dt");
			cal.select(sheetObj, row, col, 'yyyy-MM-dd');
		}
	}
	/**
	 * Validating input date.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    sheet1_OnPopupClick(SheetObjects[0], 1,1);
	 * </pre>
	 * @param object sheetObj
	 * @param number Row
	 * @param number Col
	 * @param string Value
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function sheet1_OnChange(sheetObj, Row, Col, Value) {
		if (sheetObjects[0].ColSaveName(Col) == "fm_dt"||sheetObjects[0].ColSaveName(Col) == "to_dt"){
			if(sheetObj.GetCellValue(Row,"fm_dt")!=""&&sheetObj.GetCellValue(Row,"to_dt")!=""){
				if(sheetObj.GetCellValue(Row,"fm_dt") > sheetObj.GetCellValue(Row,"to_dt")){
					ComShowCodeMessage("INV00024",Row+" Line");
					sheetObj.SelectCell(Row,"fm_dt");
				}
			}
		}
	}
	/**
	 * Creating combo.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    MakeComboObject2(formObj.ar_ofc_cd, arrStr);
	 * </pre>
	 * @param object cmbObj
	 * @param String arrStr
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function MakeComboObject2(cmbObj, arrStr) {		
		cmbObj.SetDropHeight(190);
		for (var i=1; i < arrStr.length;i++ ) {
			var arrStr2=arrStr[i].split("^");
			var ar_ofc_value=arrStr2[1];
			var ar_ofc_cd=arrStr2[1]+"|"+arrStr2[4]+"|"+arrStr2[5];
			cmbObj.InsertItem(i-1, ar_ofc_value, arrStr[i]);
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
		comboValues="|"+" "+comboValues;
		if (comboValues != undefined) {
			comboItems=comboValues.split(ROWMARK);
			for (var i=1 ; i < comboItems.length ; i++) {
				comboItem=comboItems[i].split(FIELDMARK);
				if (comboItem[0] != "") {
					comboTxt += comboItem[0];
					comboVal += comboItem[0];
				}
				if (i < comboItems.length-1&&(comboItem[0] != "")) {
					comboTxt += ROWMARK;
					comboVal += ROWMARK;
				}				
			}
		}
		if (isCellCombo) {
			sheetObj.CellComboItem(sRow,colName, {ComboText:comboTxt, ComboCode:comboTxt} );
		}
		else {
			sheetObj.SetColProperty(colName, {ComboText:comboTxt, ComboCode:comboTxt} );
		}
	}
	/**
	 * When enter custom code, get custom name.<br>
	 * Setting office.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    fn_cust_nm();
	 * </pre>
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */	
	function fn_cust_nm(){
		document.form.f_cmd.value=SEARCH03;
		var cust_nm="";
		if ((form.cust_cnt_cd.value.trim() != "" )&&(form.cust_seq.value.trim() != "" )){
			form.cust_seq.value=ComLpad(form.cust_seq.value.trim(), 6, "0"); 			
			var sXml=sheetObjects[0].GetSearchData("INVCommonGS.do", FormQueryString(document.form));
			cust_nm=ComGetEtcData(sXml,"cust_eng_nm");
			if (cust_nm == undefined) {
				form.cust_nm.value="";
				ComShowCodeMessage("INV00008");
				form.cust_seq.value="";	
				form.cust_seq.focus();				
				return;
			} else { 	
				form.cust_nm.value=cust_nm;
			}
		}
	}
	/**
	 * Comparing input item and Accounting Rates.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   RateCheck(shhetObjects[0], 1, '0.1111');
	 * </pre>
	 * @param object sheetObj
	 * @param number Row
	 * @param string Value
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */	
	function RateCheck(sheetObj, Row, Value) {
		var effDt=sheetObj.GetCellText(Row,"fm_dt").substring(0,7);
		document.form.eff_dt.value=ComReplaceStr(effDt,"-",""); 
		document.form.curr_cd.value=sheetObj.GetCellValue(Row,"chg_curr_cd");
			document.form.f_cmd.value=SEARCH04;
			var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(document.form));
			var usd_locl_xch_rt=ComGetEtcData(sXml,"usd_locl_xch_rt");
			var valRate=Value/usd_locl_xch_rt;
			if(usd_locl_xch_rt == "") {
				ComShowCodeMessage("INV00001",Row+" Line");
				return 0;
			} 
			if((valRate > 1.5) ||(valRate < 0.5)) { // +- 50% 초과
				var minus50Rate = ComRound ( usd_locl_xch_rt * 0.5, 6 ) ;
				var plus50Rate = ComRound ( usd_locl_xch_rt * 1.5, 6 ) ;
				ComShowCodeMessage("INV00162",Row+" Line ", minus50Rate + "~" +plus50Rate); //{?msg1}Rate exceeds 50% tolerance level of monthly rate: {?msg2}
				return 0;
				
			} else	if( ((valRate >= 1.1) && (valRate <= 1.5)) ||  ((valRate >= 0.5) && (valRate <= 0.9))    ) {  // +-  10%이상, 50% 이하
				var minus10Rate = ComRound ( usd_locl_xch_rt * 0.9, 6 ) ;
				var plus10Rate = ComRound ( usd_locl_xch_rt * 1.1, 6 ) ;
				
				if (ComShowCodeConfirm("INV00163", Row+" Line ", minus10Rate + "~" +plus10Rate)) {   //{?msg1}Rate exceeds 10% tolerance level of monthly rate: {?msg2}\nDo you want to proceed anyway?
					return 1;
				} else {
					return 0;
				}
					
			} else {
				return 1;
			}
	}
	/**
	 * fm_dt Setting masked value, After validating date.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   fn_ComGetMaskedValue('20090101');
	 * </pre>
	 * @param String value
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function fn_ComGetMaskedValue(value) {
		var value=form.fm_dt.value;
		value=ComReplaceStr(value,"-","");
		if (value=="") return;
		if (value.length < 6) {
			ComShowCodeMessage("INV00024");
			return;
		} 
		if (value.substring(4,6) > 12) {
			ComShowCodeMessage("INV00024");
			return;
		} 
		if (value.substring(4,6) == 00) {
			ComShowCodeMessage("INV00024");
			return;
		} 
		var ret=ComGetMaskedValue(value, "ym")  ;     
		form.fm_dt.value=ret;
	}
	/**
	 * Validating rates.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   fn_CheckDigit(sheetObjects[0], 1, '0.1111');
	 * </pre>
	 * @param object sheetObj
	 * @param number row
	 * @param string Value
	 * @return number
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	/**
	 * Setting button.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    fn_buttonChk();
	 * </pre>
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function fn_buttonChk() {
		if (document.form.dispaly.checked) {
			form.exrate_btn.style.display="";
		} else {
			form.dispaly.checked=false;
			form.exrate_btn.style.display="none";
		}
	}
	/**KEY Event<br>
	 * @author Choi Do Soon
	 * @version 2009.11.10
	 */
	function initControl() {
		// Axon event process. Event catch.
		axon_event.addListenerFormat('keypress',       'obj_keypress',    form); // When entering keyboard.
	    axon_event.addListenerForm ('focusout', 'obj_focusout', form);
	}
	/**KEY Event<br>
	 * @author Choi Do Soon
	 * @version 2009.11.10
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
	 * When completing sheet retrieve, copying sheet column.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *     sheet1_OnSearchEnd(sheetObjects[0],'');
	 * </pre>
	 * @param object sheetObj
	 * @param string ErrMsg
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function sheet1_OnSearchEnd(sheetObj,ErrMsg){      		
		sheetObj.Copy2SheetCol(sheetObj,"inv_xch_rt","pre_inv_xch_rt") 
	}
	
	function resizeSheet(){
		ComResizeSheet(sheetObjects[0]);
	}
	
	/** 
	 * OnFocusOut event(on focus out)<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.05.04
	 */
	function obj_focusout() {
	    var sheetObject=sheetObjects[0];
	    var formObject=document.form;
	    var v_tmp="";
	    switch(ComGetEvent("name")){
	        case "cust_seq":
				if (formObject.cust_seq.value.length != 0 && formObject.cust_seq.value.length < 6) {
					for(i=0; i < 6 - formObject.cust_seq.value.length; i++){
						v_tmp=v_tmp + "0";
					}
					formObject.cust_seq.value=v_tmp+formObject.cust_seq.value;
				}	            	
	            if (formObject.cust_cnt_cd.value != '' && formObject.cust_seq.value) {
	                doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20);
	            }
	            if(formObject.cust_cnt_cd.value == '' || formObject.cust_seq.value == ''){
	            	formObject.cust_nm.value = '';
	            }
	        case "cust_cnt_cd":
	            if(formObject.cust_cnt_cd.value == '' || formObject.cust_seq.value == ''){
	            	formObject.cust_nm.value = '';
	            }
	        	
	        break;
	    }
	}
	
	/**
	 * When change ar_ofc_cd data, execute function.<br>
	 * Setting office.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   ar_ofc_cd_OnChange(document.form,'HAMBB','HAMBB');
	 * </pre>
	 * @param object comboObj
	 * @param string value
	 * @param string text
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */		  
	function ar_ofc_cd2_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
		sheetObjects[0].RemoveAll();
		var formObj=document.form;
		var arrStr2=comboObj.GetSelectCode().split("^");
		setOfcOtherInfo(arrStr2);

	    //inv_curr_cd setting
	    inv_curr_cd.RemoveAll();
	    var lclCurr = formObj.locl_curr_cd.value;
	    var altnCurr = formObj.altn_curr_div_cd.value;
	    inv_curr_cd.InsertItem(0, lclCurr, lclCurr);
	    if(lclCurr != altnCurr && altnCurr != "" && altnCurr != "LCL" ) { 
	    	inv_curr_cd.InsertItem(1, altnCurr, altnCurr);
	    	inv_curr_cd.SetSelectText(lclCurr);
	    } else {
	    	inv_curr_cd.SetSelectText(lclCurr);
	    }
	}
	
	/**
	 * When change locl_curr_cd data, execute function.<br>
	 * Setting Local currency.<br>
	 */		  
	function inv_curr_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
		sheetObjects[0].RemoveAll();
		var formObj=document.form;
		formObj.locl_curr_cd.value=inv_curr_cd.GetSelectText();
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
    	formObj.ar_ofc_cd.value=arrStr2[1];
    	formObj.locl_curr_cd.value=arrStr2[4];
    	formObj.ar_ctrl_ofc_cd.value=arrStr2[5];
    	formObj.loc_cd.value=arrStr2[6].substring(0,2);
    	formObj.xch_rt_rvs_flg.value=arrStr2[8];
    	formObj.altn_curr_div_cd.value=arrStr2[20]; 
    }