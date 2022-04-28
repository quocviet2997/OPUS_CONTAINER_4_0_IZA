/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0008.jsp
*@FileTitle  : Ex. Rate Entry by Date 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/10
=========================================================*/
	/**
	 * @extends 
	 * @class fns_inv_0008 : fns_inv_0008 Defining business script.
	 */
	function fns_inv_0081() {
		this.processButtonClick=tprocessButtonClick;
		this.setSheetObject=setSheetObject;
		this.loadPage=loadPage;
		this.initSheet=initSheet;
		this.initControl=initControl;
		this.doActionIBSheet=doActionIBSheet;
		this.setTabObject=setTabObject;
		this.validateForm=validateForm;
	}
	// Common variables.
	var sheetObjects=new Array();
	var sheetCnt=0;
	// Defining button events. */
	document.onclick=processButtonClick;
	var ROWMARK="|";
	var FIELDMARK="=";
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
			if(ComGetBtnDisable(srcName)) return false;
			switch(srcName) {
				case "btn_retrieve":
					doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
					break; 
				case "btn_new":
					sheetObjects[0].RemoveAll();
					doActionIBSheet(sheetObjects[0],document.form,IBRESET);
					break; 
				case "btns_calendar1": // Calendar button.
					var cal=new ComCalendar();
					cal.select(formObject.fm_dt, 'yyyy-MM-dd');
					break;
				case "btns_calendar2": // Calendar button.
					var cal=new ComCalendar();
					cal.select(formObject.to_dt, 'yyyy-MM-dd');
					break;	
				case "btn_Close":
					ComClosePopup(); 
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
		doActionIBSheet(sheetObjects[0],document.form,IBSEARCH_ASYNC01); 
		doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
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
			      var HeadTitle="|Office|Ex. Rate Date|To Date|Local Curr|Charge Curr|Bound|User ID|Event|Event Date|Ex. Rate|Remark";
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",	Hidden:1, Width:40,   	Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
			                   {Type:"Text",    Hidden:0, Width:80,    	Align:"Center",  ColMerge:1,   SaveName:"ar_ofc_cd" },
			                   {Type:"Text", 	Hidden:0, Width:100,  	Align:"Center",  ColMerge:0,   SaveName:"fm_dt",            Format:"Ymd" },
					           {Type:"Text", 	Hidden:1, Width:100,  	Align:"Center",  ColMerge:0,   SaveName:"to_dt",            Format:"Ymd" },
			                   {Type:"Text",    Hidden:1, Width:80,     Align:"Center",  ColMerge:1,   SaveName:"locl_curr_cd" },
			                   {Type:"Text",    Hidden:0, Width:80,   	Align:"Center",  ColMerge:0,   SaveName:"chg_curr_cd",  },
			                   {Type:"Text",    Hidden:0, Width:60,   	Align:"Center",  ColMerge:0,   SaveName:"io_bnd_cd" },
			                   {Type:"Text",    Hidden:0, Width:120,    Align:"Center",  ColMerge:1,   SaveName:"cre_usr_id" },
			                   {Type:"Text",    Hidden:0, Width:100,    Align:"Center",  ColMerge:1,   SaveName:"op_sts_nm" },
					           {Type:"Text",    Hidden:0, Width:140,    Align:"Center",  ColMerge:1,   SaveName:"locl_cre_dt", 		Format:"YmdHms"  },
					           {Type:"Float",   Hidden:0, Width:120,  	Align:"Right",   ColMerge:0,   SaveName:"inv_xch_rt",      	Format:"NullFloat",   PointCount:6 },
					           {Type:"Text",    Hidden:0, Width:100,    Align:"Left",  	 ColMerge:1,   SaveName:"cng_rmk" } ];
			       
			      InitColumns(cols);
			      SetEditable(0);
			      SetSheetHeight(350);
			      SetWaitImageVisible(0);
			      
			      InitComboNoMatchText(true);
			      
			     // resizeSheet();
	      }
		break;
		}
	}
	
	//function resizeSheet(){
	//    ComResizeSheet(sheetObjects[0]);
	//}
	
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
				formObj.fm_dt.value=ComGetMaskedValue(formObj.fm_dt.value, "ymd");	
				formObj.to_dt.value=ComGetMaskedValue(formObj.to_dt.value, "ymd");	
			break;
			case IBSEARCH:      //retrieve
				ComOpenWait(true);
				formObj.f_cmd.value=SEARCH01;
				sheetObj.DoSearch("FNS_INV_0081GS.do",FormQueryString(formObj) );
				ComOpenWait(false);
			break;
			
			case IBRESET: // New
				var ret=ComGetNowInfo("ym" );
				formObj.fm_dt1.value=ret+"-01";
				var lastDay=ComGetLastDay(ComGetNowInfo("yy"), ComGetNowInfo("mm"));
				formObj.to_dt1.value=ret+"-"+lastDay;
				formObj.io_bnd_cd.value="";
//				ar_ofc_cd2.text = formObj.ar_ofc_cd_1.value;
				//ar_ofc_cd2_text.value = ""
					ar_ofc_cd2.SetItemCheck(formObj.ar_ofc_cd_1.value, true);
				formObj.locl_curr_cd.value=formObj.locl_curr_cd_1.value;
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
			for (var i=1; i<=sheetObj.RowCount(); i++) {
				if (sheetObj.GetRowStatus(i) == "I") {
					var fmDt=sheetObj.GetCellText(i,"fm_dt");
					var toDt=sheetObj.GetCellText(i,"to_dt");
					var fmDt1=formObj.fm_dt1.value;
					var toDt1=formObj.to_dt1.value;
					if ((formObj.xch_rt_tp_cd.value!='C' && formObj.xch_rt_tp_cd.value!='D' && formObj.xch_rt_tp_cd.value!='V')
						&&(formObj.xch_rt_n3rd_tp_cd.value!='C'&&formObj.xch_rt_n3rd_tp_cd.value!='D'&&formObj.xch_rt_n3rd_tp_cd.value!='V')){
						ComShowCodeMessage("INV00077");
						return;
					}
					if (fmDt == "") {
						ComShowCodeMessage("COM130201", "From Date");
						return;
					}
					if (toDt == "") {
						ComShowCodeMessage("COM130201", "To Date");
						return;
					}
					if ((fmDt < fmDt1) || (fmDt > toDt1) || (toDt < fmDt1) || (toDt > toDt1) || (fmDt > toDt)) {
						ComShowCodeMessage("INV00024");
						return;
					}
					if (sheetObj.GetCellText(i,"chg_curr_cd").trim() == ""){
						ComShowCodeMessage("COM130201", "Currency");
						return;
					}
					if (sheetObj.GetCellText(i,"inv_xch_rt").trim() == ""){
						ComShowCodeMessage("COM130201", "Ex. Rate");
						return;
					} else {
						if (RateCheck(sheetObj, i, ComTrimAll(sheetObj.GetCellText(i,"inv_xch_rt"),",")) == 0 ) {
							return;
						}
					}
				} else if (sheetObj.GetRowStatus(i) == "U") {
					if (sheetObj.GetCellText(i,"inv_xch_rt").trim() == ""){
						ComShowCodeMessage("INV00041");
						return;
					} else {
						if (RateCheck(sheetObj, i, ComTrimAll(sheetObj.GetCellText(i,"inv_xch_rt"),",")) == 0 ) {
							return;
						}
					}
//					if (sheetObj.GetCellText(i,"pre_inv_xch_rt").trim() != ""&&sheetObj.GetCellText(i,"pre_inv_xch_rt").trim() != "0"){
//						if (!ComShowCodeConfirm("INV00126")){
//							return false;
//						}else{
//							return true;
//						}
//					}
				}	
			}
		}
		return true;
	}

	/**
	 * Validating input date.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    sheet1_OnPopupClick(SheetObjects[0], 1,1);
	 * </pre>
	 * @param object sheetObj
	 * @param number row
	 * @param number col
	 * @param string Value
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function sheet1_OnPopupClick(sheetObj, row,col){
		if (sheetObj.ColSaveName(col) == "fm_dt") {
			var cal=new ComCalendarGrid("fm_dt");
			cal.endFunction="ComCalendar_tmpEndFunction2";
			cal.select(sheetObj, row, col, 'yyyy-MM-dd');
		}
		if (sheetObj.ColSaveName(col) == "to_dt") {
			var cal2=new ComCalendarGrid("to_dt");
			cal2.select(sheetObj, row, col, 'yyyy-MM-dd');
		}
	}
	/**
	 * After completing calendar input, execute function.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    ComCalendar_tmpEndFunction2()
	 * </pre>
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function ComCalendar_tmpEndFunction2(){
		sheetObjects[0].SelectCell(sheetObjects[0].GetSelectRow(), "to_dt",true,sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(), "fm_dt"));
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
				if ((comboItem[0] != "")&&(comboItem[0] != form.locl_curr_cd.value)) {
					comboTxt += comboItem[0];
					comboVal += comboItem[0];
				}
				if (i < comboItems.length-1&&(comboItem[0] != "")&&(comboItem[0] != form.locl_curr_cd.value)) {
					comboTxt += ROWMARK;
					comboVal += ROWMARK;
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
	function sheet1_OnKeyUp(sheetObj, Row, Col, KeyCode) {
		if (sheetObj.ColSaveName(Col) == "fm_dt"){
			fmDtVal=sheetObj.GetCellValue(Row, Col).replace('-','');
		}  
	}
	/**
	 * Validating input date.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    sheet1_OnPopupClick(SheetObjects[0], 1,1,'20090901');
	 * </pre>
	 * @param object sheetObj
	 * @param number Row
	 * @param number Col
	 * @param string Value
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function sheet1_OnChange(sheetObj, Row, Col, Value) {
		if (sheetObj.ColSaveName(Col) == "fm_dt"){
			sheetObj.SelectCell(Row, "to_dt",true,Value)
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
		document.form.f_cmd.value=SEARCH04;
		var effDt=sheetObj.GetCellText(Row,"fm_dt").substring(0,7);
		document.form.eff_dt.value=ComReplaceStr(effDt,"-",""); 
		document.form.curr_cd.value=sheetObj.GetCellValue(Row,"chg_curr_cd");
		var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(document.form));
		var usd_locl_xch_rt=ComGetEtcData(sXml,"usd_locl_xch_rt");
		var valRate=Value/usd_locl_xch_rt
		if((valRate > 1.5) ||((valRate < 0.5))) {
			ComShowCodeMessage("INV00016");
			return 0;
		} else {
			return 1;
		}
	}


