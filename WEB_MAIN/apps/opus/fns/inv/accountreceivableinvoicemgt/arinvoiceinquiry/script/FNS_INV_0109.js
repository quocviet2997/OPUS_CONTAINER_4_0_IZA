/**=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0109.js
*@FileTitle  : Invoice Search(FAC Agreement Management)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/28
=========================================================**/
	/**
	 * @extends 
	 * @class FNS_INV_0109 : FNS_INV_0109 Defining business script.
	 */
	var sheetObjects=new Array();
	var sheetCnt=0;
	//IBMultiCombo
	var comboObjects=new Array();
	var combo1=null;
	var comboCnt=0;
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
	 * @author 
	 * @version 2009.10.20
	 */
	function processButtonClick(){
		/***** Setting each tab's sheet variable. *****/
		var sheetObject=sheetObjects[0];
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch(srcName) {
				case "btn_retrieve":
					doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
				break;
				case "btn_new":
					initField();
					sheetObject.RemoveAll();
				break;
				case "btn_apply":
					callParent();
				break;
				case "btn_close":
					ComClosePopup(); 
				break;
				case "btns_calendar1":
					var cal=new ComCalendar();
					cal.setDisplayType('date');
	             	cal.select(formObject.iss_fm_dt, 'yyyy-MM-dd');
				break;
				case "btns_calendar2":
					var cal=new ComCalendar();
					cal.setDisplayType('date');
	             	cal.select(formObject.iss_to_dt, 'yyyy-MM-dd');
				break;
			} // end switch
		} catch(e) {
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
	 * 
	 * Array define top on source.
	 * </pre>
	 * @param  {IBSheet} sheetObj IBSheet Object
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function setSheetObject(sheetObj){
		sheetObjects[sheetCnt++]=sheetObj;
	}
	/** 
	 * Register IBCombo object on array. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * Array define top on source.
	 * </pre>
	 * @param {IBMultiCombo} combo_obj    IBMultiCombo Object
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function setComboObject(combo_obj){
		comboObjects[comboCnt++]=combo_obj;
	}
    /** 
     * Coding event handler for body tag's OnLoad. <br>
     * <br><b>Example :</b>
	 * <pre>
	 * After complete on load, add pre-function.
	 * </pre>
	 * @param none.
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function loadPage() {
		var formObj=document.form;
		for(i=0;i<sheetObjects.length;i++){
			ComConfigSheet (sheetObjects[i] );
			initSheet(sheetObjects[i],i+1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		// Initialize IBMultiCombo.
		for(var k=0; k<comboObjects.length; k++){
			initCombo(comboObjects[k],k+1);
		}
		initControl();
		formObj.iss_fm_dt.focus();
		if (document.form.sel_option.value == "M") {
        	ComBtnDisable("btn_apply");    
        } 
	}
	/** 
	 * Initialize screen.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {object} formObj  
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function initField() {
		var formObj=document.form;
		with(formObj){
			iss_fm_dt.value="";
			iss_to_dt.value="";
			cust_cnt_cd.value="";
			cust_seq.value="";
			cust_nm.value="";
			usr_id.value="";
			bl_src_no.value="";
			inv_no.value="";
			act_inv_no.value="";
		}
		inv_type.SetSelectText("");
		inv_type.SetSelectText("ALL");
	}
	/** 
	 * Coding event for OnLoad.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none.
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function initControl() {
		axon_event.addListenerFormat ('keypress', 'objKeypress', document.form);
		axon_event.addListenerFormat ('beforeactivate', 'objActivate', document.form);
		axon_event.addListenerForm ('beforedeactivate', 'objDeactivate', document.form);
		axon_event.addListenerForm ('keyup', 'objKeyup', document.form);
	}
	/** 
	 * Coding event for OnKeyUp. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none.
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function objKeyup() {
		var formObject=document.form;
		var srcName=ComGetEvent("name");
		if (srcName == "cust_cnt_cd" ) {
			var v_cust_cnt_cd=formObject.cust_cnt_cd.value
			if (v_cust_cnt_cd.length == 2) {
				formObject.cust_seq.focus();
			}
		}
		if (srcName == "iss_fm_dt" ) {
			var v_iss_fm_dt=formObject.iss_fm_dt.value
			if (v_iss_fm_dt.length == 8) {
				formObject.iss_to_dt.focus();
			}
		}
	}
	/** 
	 * Coding event for OnKeyPress.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none.
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function objKeypress() {
		switch(event.srcElement.dataformat){
			case "float":
				// Only number or '.'.
				ComKeyOnlyNumber(event.srcElement, "."); 
			break;
			case "int":
				// Only number.
				ComKeyOnlyNumber(event.srcElement); 
			break;
			case "engup":
				switch(event.srcElement.name){
					case "bl_src_no":
						// Only number or upper case.
						ComKeyOnlyAlphabet('uppernum');
					break;
					case "inv_no":
						// Only number or upper case.
						ComKeyOnlyAlphabet('uppernum');
					break;
					case "act_inv_no":
						// Only number or upper case.
						ComKeyOnlyAlphabet('uppernum');
					break;
					case "cust_cnt_cd":
						// Only upper case.
						ComKeyOnlyAlphabet('upper');
					break;
				}
			break;
			case "eng":
				switch(event.srcElement.name){
					case "usr_id":
						// Only Alphabet or number.
						ComKeyOnlyAlphabet('num');
					break;
				}
			break;
	        case "num":
	        	// Only number(integer, date, time).
	            ComKeyOnlyNumber('num');
            break;
			default:
				// Only number.
				ComKeyOnlyNumber(event.srcElement);
			break;
		}
	}
	/** 
	 * Coding event for OnBeForeActivate.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none.
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function objActivate() {
		ComClearSeparator (event.srcElement);
		event.srcElement.select();
	}
	/** 
	 * Coding event for Onbeforedeactivate.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none.
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function objDeactivate(){
		var formObject=document.form;
		var sheetObject=sheetObjects[0];
		switch(event.srcElement.name){
			case "iss_fm_dt":
				ComChkObjValid(event.srcElement);
			break;
			case "iss_to_dt":
				ComChkObjValid(event.srcElement);
			break;
			case "cust_seq":
				if (formObject.cust_seq.value != '') {
					var valueCustSeq=formObject.cust_seq.value;
					formObject.cust_seq.value=ComLpad(valueCustSeq,6,"0");
				}
				if (formObject.cust_cnt_cd.value != '' && formObject.cust_seq.value != '') {
					doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20);
				}
				else {
					formObject.cust_nm.value='';
				}
			break;
			default:
				ComChkObjValid(event.srcElement);
			break;
		}
	}
	/** 
	 * Initialize sheet. Define header.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * Initialize moudle by sheet count.
	 * </pre>
	 * @param sheetObj sheet object
	 * @param sheetNo sheet object 
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function initSheet(sheetObj,sheetNo) {
		var cnt=0;
		switch(sheetNo) {
			case 1:      //t1sheet1 init
			    with(sheetObj){
		      var HeadTitle="Sel.|B/L No.|INV No.|Act. Inv No|Inv Type|Actual Cust.|Issue Date|Local Amount|User ID";

		      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );

		      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
		      var headers = [ { Text:HeadTitle, Align:"Center"} ];
		      InitHeaders(headers, info);

		      var cols = [ {Type:"CheckBox",  Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"SelChk",      KeyField:0,   CalcLogic:"" },
		             {Type:"Text",      Hidden:0,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"bl_src_no",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"inv_no",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:0,  Width:85,   Align:"Center",  ColMerge:1,   SaveName:"act_inv_no",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"inv_type",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:0,  Width:85,   Align:"Center",  ColMerge:1,   SaveName:"customer",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Date",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"iss_dt",      KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Float",     Hidden:0,  Width:110,  Align:"Right",   ColMerge:1,   SaveName:"lcl_amt",     KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:1,   SaveName:"cre_usr_id",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
		       
		      InitColumns(cols);
		      SetSheetHeight(160);
			}
			break;
		}
	}
	/** 
	 * Initialize combo.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param {IBMultiCombo} comboObj  comboObj
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function initCombo(comboObj, comboNo) {
		switch (comboObj.options.id) {
			case "inv_type": 
				with (comboObj) {
					InsertItem(0, "ALL",	" ");
					InsertItem(1, "FRT",	"F");
		            InsertItem(2, "THC",	"T");
		            InsertItem(3, "DHF",	"H");
		            InsertItem(4, "DMR",	"D");
		            InsertItem(5, "M&R",	"R");
		            InsertItem(6, "MRI",	"M");
		            InsertItem(7, "SLF",	"S");
		            InsertItem(8, "CLN",	"C");
		    		SetMultiSelect(1);
		    		SetColAlign(0, "left");
		    		SetMultiSeparator(",");
		    		SetDropHeight(190);
		    		comboObj.SetSelectText("ALL");
				}
			break;
		}
	}
	/** 
	 * Coding retrieve, save...<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param  {IBSheet} sheetObj : Sheet object.  
	 * @param  {object} formObj : Form object.
	 * @param  {sAction} sAction : f_cmd.
	 * @param  {int} Row : Selected row.
	 * @param  {int} Col : Selected column.
	 * @param  {String}Val : Selected row, column value
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function doActionIBSheet(sheetObj,formObj,sAction) {
		sheetObj.ShowDebugMsg(false);
		switch(sAction) {
			case IBSEARCH:      //retrieve
				if(validateForm(sheetObj,formObj,sAction)) {
					formObj.f_cmd.value=SEARCH;
 					sheetObj.DoSearch("FNS_INV_0109GS.do", FormQueryString(formObj) );
				}
			break;
			case IBSEARCH_ASYNC20: // customer name retrieve
				if (formObj.cust_cnt_cd.value != "" && formObj.cust_seq.value != ""){
					formObj.f_cmd.value=SEARCH03;
					var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
					var cust_nm=ComGetEtcData(sXml,"cust_eng_nm");
					if (cust_nm != undefined) {
						formObj.cust_nm.value=cust_nm;
					} else {
						formObj.cust_nm.value="";
					}
				}
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
	 * @author 
	 * @version 2009.10.19
	 */
	function validateForm(sheetObj,formObj,sAction){
		with(formObj){
			if(bl_src_no.value == "") {
				if(iss_fm_dt.value == "" || iss_to_dt.value == "") {
					ComShowCodeMessage("INV00004");
					if(iss_fm_dt.value == "") {
						iss_fm_dt.focus();
					}
					else {
						iss_to_dt.focus();
					}
					return false;
				}
				else {
					if (ComGetDaysBetween(iss_fm_dt.value,iss_to_dt.value) < 0) {
						ComShowCodeMessage("INV00043");
						iss_to_dt.focus();
						return false;
					}
					else {
						var nextDate=ComGetDateAdd(iss_fm_dt.value, "M", 1);
						if (iss_to_dt.value >= nextDate) {
							ComShowCodeMessage("INV00043");
							iss_to_dt.focus();
							return false;
						}
					}
				}
			}
		}
		return true;
	}
	/** 
	 * If combo box's value changed, selected value change.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {IBMultiCombo} comboObj
	 * @param {object} s_index
	 * @param {object} s_code
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.12.01
	 */
	function inv_type_OnCheckClick(comboObj, s_index, s_code) {
		//alert(comboObj+":"+s_index+":"+s_code);
		if(s_code == " "){
			
				comboObj.SetSelectCode("F", false);
		        comboObj.SetSelectCode("T", false);
		        comboObj.SetSelectCode("H", false);
		        comboObj.SetSelectCode("D", false);
		        comboObj.SetSelectCode("R", false);
		        comboObj.SetSelectCode("M", false);
		        comboObj.SetSelectCode("S", false);
		        comboObj.SetSelectCode("C", false);
			
		}else{
			comboObj.SetSelectCode(" ", false);
		}
	}
