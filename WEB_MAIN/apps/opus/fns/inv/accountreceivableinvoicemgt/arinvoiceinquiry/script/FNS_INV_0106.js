/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : FNS_INV_0106.js
 *@FileTitle : Invoice Search
 *Open Issues :
 *Change history :
 *@LastModifyDate :
 *@LastModifier : 
 *@LastVersion : 1.0
=========================================================*/

	// Common variables.
	var sheetObjects=new Array();
	var sheetCnt=0;
	// Defining button events. */
	document.onclick=processButtonClick;
	/**
	 * Handling button event. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     processButtonClick()
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function processButtonClick(){
		/***** Setting each tab's sheet variable. *****/
		var sheetObject=sheetObjects[0];
		/*******************************************************/
		var formObject=document.form;
		var cal=new ComCalendar();
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
				//callParent();
				//comPopupOK();
				callParentF();
				break;
			case "btn_close":
				ComClosePopup(); 
				break;
			case "btn_add":
				sheetObject.DataInsert(-1);
				break;							
			case "btn_delete":
				sheetObject.RowDelete();
				break;							
			case "btn_downexcel":
				if (sheetObj.RowCount()== 0 ) {
			   		ComShowCodeMessage("COM132501"); // No data to dowload as Excel
			   	    return;
			   	} else {
			   		sheetObject.Down2Excel();
			   	}
				
				break;
			case "btn_save":
				alert(srcName);
				break; 
			case "btn_print":
				alert(srcName);
				break;
			case "btns_calendar1":
				cal.setDisplayType('date');
				cal.select(formObject.iss_fm_dt, 'yyyy-MM-dd');
				break;
			case "btns_calendar2":
				cal.setDisplayType('date');
				cal.select(formObject.iss_to_dt, 'yyyy-MM-dd');
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
	 * Register IBSheet object on array. <br>
	 *  <br>
	 * Array define top on source. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     setSheetObject(sheetObj)
	 * </pre>
	 * @param {ibsheet} sheetObj required IBSheet Object
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function setSheetObject(sheetObj){
		sheetObjects[sheetCnt++]=sheetObj;
	}
	/**
	 * Initialize sheets. <br>
	 * Coding event handler for body tag's OnLoad. <br>
	 * After complete on load, add pre-function. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     loadPage()
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function loadPage() {
		for(i=0;i<sheetObjects.length;i++){
			ComConfigSheet (sheetObjects[i] );
			initSheet(sheetObjects[i],i+1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		initControl();
		if (document.form.sel_option.value == "M") {
			ComBtnDisable("btn_apply");    
		} 
	}
	/**
	 * Initialize screen. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     initField()
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function initField() {
		var formObj=document.form;
		with(formObj){
			iss_fm_dt.value="";
			iss_to_dt.value="";
			bl_src_no.value="";
			cust_cnt_cd.value="";
			cust_seq.value="";
			cust_nm.value="";
			usr_id.value="";
			vvd.value="";
			scope.value="";
			port.value="";
			bound.value="";
		}        	
	}
	/**
	 * Coding event for OnKeyPress<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *    initControl()
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function initControl() {
		// Axon event process. Event catch.
//		axon_event.addListenerFormat ('keypress', 'objKeypress', document.form);
//		axon_event.addListenerFormat ('beforeactivate', 'objActivate', document.form);
//		axon_event.addListenerForm ('beforedeactivate', 'objDeactivate', document.form);
//		axon_event.addListenerForm ('keyup', 'objKeyup', document.form); 
	}
	/**
	 * Coding event for OnKeyUp. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *    objKeyup()
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
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
	 * Coding event for OnKeyPress. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *    objKeypress()
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function objKeypress() {
		switch(event.srcElement.dataformat){
		case "float":
			// Only number or '.'.
			ComKeyOnlyNumber(event.srcElement, "."); break;
		case "int":
			// Only number.
			ComKeyOnlyNumber(event.srcElement); break;
		case "engup":
			switch(event.srcElement.name){
			case "cust_cnt_cd":	
				// Only upper case.		    	        
				ComKeyOnlyAlphabet('upper'); break;
			/*
	        case "cust_seq":	    	        	
	        	// Only number.
    	        ComKeyOnlyNumber(event.srcElement);
			*/
			case "bl_src_no":
				// Only number or upper case.
				ComKeyOnlyAlphabet('uppernum'); break;
			case "giro_no":
				// Only number or upper case.
				ComKeyOnlyAlphabet('uppernum'); break;
			case "vvd":
				// Only number or upper case.
				ComKeyOnlyAlphabet('uppernum'); break;
			case "scope":
				// Only upper case.
				ComKeyOnlyAlphabet('upper'); break;
			case "port":
				// Only upper case.
				ComKeyOnlyAlphabet('upper'); break;
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
		default:
			// Only number.
			ComKeyOnlyNumber(event.srcElement);
		}
	}
	/**
	 * Coding event for OnBeforeActivate. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *    objActivate()
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function objActivate() {
		ComClearSeparator (event.srcElement);
	}
	/**
	 * Coding event for OnBeforeDeactivate. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *    objDeactivate()
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
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
			if (formObject.cust_cnt_cd.value != '' && formObject.cust_seq.value != '') {
				var valueCustSeq=formObject.cust_seq.value;
				formObject.cust_seq.value=ComLpad(valueCustSeq,6,"0");
				doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20);
			}
			else {
				formObject.cust_cnt_cd.value='';
				formObject.cust_seq.value='';
				formObject.cust_nm.value='';
			}      		            
			break;     
		default:
			ComChkObjValid(event.srcElement);
		}
	}   
	/**
	 * Initialize sheet. Define header. <br> 
	 * Initialize moudle by sheet count. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     initSheet(sheetObj, 0)
	 * </pre>
	 * @param {ibsheet} sheetObj required IBSheet Object
	 * @param {int} sheetNo sheet object  
	 * @return none. 
	 * @author 
	 * @version 2009.10.20     
	 */   
	function initSheet(sheetObj,sheetNo) {
		var cnt=0;
		switch(sheetNo) {
		case 1:      //t1sheet1 init
		    with(sheetObj){
	      
	      var HeadTitle="Sel.||B/L No.|Invoice No.|Group Invoice No.|Group Invoice Flag|VVD|S/A Date|Actual Cust.|Issue Date|Local Amount|User ID";

	      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );

	      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
	      var headers = [ { Text:HeadTitle, Align:"Center"} ];
	      InitHeaders(headers, info);

	      var cols = [ {Type:"CheckBox",  Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"SelChk",       KeyField:0,   CalcLogic:"" },
	                   {Type:"CheckBox",  Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"DelChk",       KeyField:0,   CalcLogic:"" },
			           {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"bl_src_no",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			           {Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:1,   SaveName:"inv_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			           {Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:1,   SaveName:"grp_inv_no",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			           {Type:"Text",      Hidden:1,  Width:110,  Align:"Center",  ColMerge:1,   SaveName:"grp_iss_flg",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			           {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"vvd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			           {Type:"Date",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"sail_arr_dt",  KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			           {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"cust_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			           {Type:"Date",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"iss_dt",       KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			           {Type:"Text",      Hidden:0,  Width:120,  Align:"Right",   ColMerge:1,   SaveName:"local_total",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			           {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"cre_usr_id1",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
	       
	      InitColumns(cols);

	      SetSheetHeight(242);
	      SetEditable(1);
	      }
		break;     
		}
	}
	/**
	 * Process function for sheet. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     doActionIBSheet(sheetObj, document.form, IBSEARCH)
	 * </pre>
	 * @param {ibsheet} sheetObj required IBSheet Object
	 * @param {form} formObj required html form object
	 * @param {int} sAction 
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function doActionIBSheet(sheetObj,formObj,sAction) {
		sheetObj.ShowDebugMsg(false);
		switch(sAction) {
		case IBSEARCH:      //retrieve
		if(validateForm(sheetObj,formObj,sAction)) {
			formObj.f_cmd.value=SEARCH;	
			sheetObj.DoSearch("FNS_INV_0106GS.do", FormQueryString(formObj)+ "&" + ComGetPrefixParam("") );
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
		case IBSAVE:        //save
		if(validateForm(sheetObj,formObj,sAction))
		break;
		case IBINSERT:      // input
		break;
		}
	}
	/**
	 * Validating input values. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     validateForm(sheetObj, document.form, IBSEARCH)
	 * </pre>
	 * @param {ibsheet} sheetObj required IBSheet Object
	 * @param {form} formObj required html form object
	 * @param {int} sAction 
	 * @return boolean
	 * @author 
	 * @version 2009.10.20
	 */
	function validateForm(sheetObj,formObj,sAction){
		with(formObj){
			if(bl_src_no.value == "" && vvd.value == "") {
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
function callParentF() {
		
		var rArray = null; //행데이터를 담고 있는 배열
		
			rArray=getChecked();
			if(rArray == null) {
				ComShowCodeMessage("COM12114", "row");
				return;
			}
		if(!opener) {
			opener=parent;
		}

		try {
		
			opener.getFnsInv0106(rArray);
			ComClosePopup(); 
			
		}
		catch(e) {
		 	ComShowCodeMessage("COM12111");
		}
	}


function findArray(invNos, invNo) {
	
	for (var i=0; i<invNos.length; i++) {
		if (invNos[i] == invNo) return true;
	}
	
	return false;
}

function getChecked() {
	var sheetObj = sheetObjects[0];
	var rows = sheetObj.RowCount();
	var checkRows = sheetObj.CheckedRows("SelChk");
	
	var rArray = null; //The array is row data.
	
	var invNos = "";
	var invNo = "";
	
	if(checkRows == 0) {
		return null;
	}
	else if(checkRows > 100) {
		if(ComShowCodeConfirm("INV00078")) {
			var idx = 0;
			invNos = "";
			rArray = new Array();
			for(var i = 1; i < 101; i++) {
				if(sheetObj.GetCellValue(i, "SelChk") == 1) {
					invNo = sheetObj.GetCellValue(i, "inv_no") ;
					if (findArray(rArray, invNo) == false) {
						rArray[idx] = invNo;
						idx++;
					}
				}
			}
		}else {
			rArray = new Array(0);
		}
	} else {
		var idx = 0;
		invNos = "";
		rArray = new Array();
	
		for(var i = 1; i < rows+1; i++) {
			if(sheetObj.GetCellValue(i, "SelChk") == 1) {
				invNo = sheetObj.GetCellValue(i, "inv_no") ;
				if (findArray(rArray, invNo) == false) {
					rArray[idx] = invNo;
					idx++;
				}
			}		
		}

	}

	return rArray;
}

function fn_cust_nm(){
	var formObject=document.form;
	var sheetObject=sheetObjects[0];

	if (formObject.cust_cnt_cd.value != '' && formObject.cust_seq.value != '') {
		var valueCustSeq=formObject.cust_seq.value;
		formObject.cust_seq.value=ComLpad(valueCustSeq,6,"0");
		doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20);
	}
	else {
		formObject.cust_cnt_cd.value='';
		formObject.cust_seq.value='';
		formObject.cust_nm.value='';
	}      	
	
}

function sheet1_OnChange(sheetObj, row, col, val) {

	var flag = sheetObj.GetCellText(row,"SelChk");	
	var invNo = sheetObj.GetCellValue(row, "inv_no");
	
    for (var iRow=1;iRow<=sheetObj.LastRow();iRow++){
    	if(sheetObj.GetCellValue(iRow, "inv_no") == invNo ){
    		sheetObj.SetCellValue(iRow, "SelChk", flag, 0);     
    	}
    }
}
