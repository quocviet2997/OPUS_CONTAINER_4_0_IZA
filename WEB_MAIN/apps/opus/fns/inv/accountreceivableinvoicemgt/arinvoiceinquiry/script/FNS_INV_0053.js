/**=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0053.js
*@FileTitle  : Invoice Inquiry by Invoice No
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/14
=========================================================**/


	var sheetObjects=new Array();
	var sheetCnt=0;
	
	//IBMultiCombo
	var comboObjects=new Array();
	var combo1=null;
	var comboCnt=0;
	
	/**
	 * Defining button events. 
	 **/
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
		var sheetObject1=sheetObjects[0];
		//var sheetObject2 = sheetObjects[1];
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch(srcName) {
				case "btn_Retrieve":					
					doActionIBSheet(sheetObject1,formObject,IBSEARCH);
				break;
				case "btn_new":
					ComResetAll(); 		
					ar_ofc_cd.SetSelectText(ar_ofc_cd_text);
					//sheetObject1.RemoveAll();
					//removeAll(formObject);
				break;
				case "btns_cust": // CUST retrieve button.
					var v_act_cust_cnt_cd=formObject.act_cust_cnt_cd.value;
					var v_act_cust_seq=formObject.act_cust_seq.value;
					var classId="FNS_INV_0013";
					var param='?cust_cnt_cd='+v_act_cust_cnt_cd+'&cust_seq='+v_act_cust_seq+'&pop_yn=Y&classId='+classId;
					ComOpenPopup('/opuscntr/FNS_INV_0013.do' + param, 1000, 680, 'getFNS_INV_0013', '1,0,1,1,1', true);
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
	 * 
	 * Array define top on source.
	 * </pre>
	 * @param  {IBSheet} sheetObj IBSheet Object
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function setSheetObject(sheet_obj){
		sheetObjects[sheetCnt++]=sheet_obj;
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
		doActionIBSheet(sheetObjects[0],document.form,IBSEARCH_ASYNC10); 	
		document.form.inv_no.focus();
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
		var formObject=document.form;
		var cnt=0;
		var dpPrcsKntLocal=formObject.dp_prcs_knt_local.value;
		var dpPrcsKnt=formObject.dp_prcs_knt.value;
		var setDpPrcsKnt=dpPrcsKntLocal;

		switch(sheetNo) {
			case 1:      //sheet1 init
			    with(sheetObj){			        
			      //no support[check again]CLT 					if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);
			      var HeadTitle="|B/L No.|POL|POD|Local VVD|Trunk VVD|Scope|Bound|Lane|S/A Date|Due Date|CHG|Rated As|Rate|Per|Curr|Amount|Ex. Rate|Local Amount|INV Curr|INV Ex. Rate|INV Amount|Description";
	
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
	
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);

			      var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
					             {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"bl_src_no",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
					             {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:0,   SaveName:"pol_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
					             {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:0,   SaveName:"pod_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
					             {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"vvd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },  
						         {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"trunk_vvd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },  
							     {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:0,   SaveName:"svc_scp_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },  
								 {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:0,   SaveName:"io_bnd_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },  
								 {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:0,   SaveName:"slan_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },  
								 {Type:"Date",      Hidden:0,  Width:75,   Align:"Center",  ColMerge:0,   SaveName:"sail_arr_dt",      KeyField:0,   CalcLogic:"",   Format:"Ymd" },
								 {Type:"Date",      Hidden:0,  Width:75,   Align:"Center",  ColMerge:0,   SaveName:"due_dt",           KeyField:0,   CalcLogic:"",   Format:"Ymd" },
								 {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:0,   SaveName:"chg_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
					             {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"rat_as_cntr_qty",  KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:3 },
					             {Type:"Text",      Hidden:0,  Width:90,   Align:"Right",   ColMerge:0,   SaveName:"trf_rt_amt",       KeyField:0,   CalcLogic:"",   Format:"" },
						         {Type:"Text",      Hidden:0,  Width:55,   Align:"Center",  ColMerge:0,   SaveName:"per_tp_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
						         {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"curr_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
						         {Type:"Text",      Hidden:0,  Width:110,  Align:"Right",   ColMerge:0,   SaveName:"chg_amt",          KeyField:0,   CalcLogic:"",   Format:"" },
						         {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"inv_xch_rt",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6 },
						         {Type:"AutoSum",   Hidden:0,  Width:110,  Align:"Right",   ColMerge:0,   SaveName:"local_total",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:setDpPrcsKnt },
						         {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"inv_curr_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
						         {Type:"Float",     Hidden:0,  Width:90,   Align:"Right",   ColMerge:0,   SaveName:"iss_xch_rt",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6 },
						         {Type:"AutoSum",   Hidden:0,  Width:110,  Align:"Right",   ColMerge:0,   SaveName:"inv_total",        KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:setDpPrcsKnt },
			         			 {Type:"Text",      Hidden:0,  Width:350,   Align:"Left",   ColMerge:0,   SaveName:"inv_rmk",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 }];

			      InitColumns(cols);	
			      SetEditable(0);
			      
			      resizeSheet();
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
			case "ar_ofc_cd":
				with (comboObj) {
					SetColAlign(0, "left");
					SetColWidth(0, "95");
	                //SetTitle("Office Code");
					SetMultiSelect(0);
					SetUseAutoComplete(1);
					SetDropHeight(140);
					//no support[check again]CLT 					ValidChar(2,1);
					SetMaxLength(6);
				}
				break;
		}
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
		// Axon event process. Event catch.
		//axon_event.addListenerFormat ('keypress', 'obj_keypress', form);
		axon_event.addListenerFormat ('beforeactivate', 'obj_activate', form);
		axon_event.addListenerForm ('beforedeactivate', 'obj_deactivate', form);
		axon_event.addListener('keydown', 'ComKeyEnter', 'form');
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
	function obj_keypress() {
		var srcName=ComGetEvent(); 
		switch(srcName.dataformat){
			case "float":
				// Only number or '.'.
				ComKeyOnlyNumber(ComGetEvent(), "."); 
			break;
			case "int":
				// Only number.
				ComKeyOnlyNumber(ComGetEvent()); 
			break;
			case "engup":
				switch(ComGetEvent().name){
					case "inv_no":
						// Only number or upper case.
						ComKeyOnlyAlphabet('uppernum'); 
					break;
					case "ar_ofc_cd":
						// Only upper case.
						ComKeyOnlyAlphabet('upper'); 
					break;
					case "bl_src_no":
						// Only number or upper case.
						ComKeyOnlyAlphabet('uppernum'); 
					break;
					case "bl_src_no":
						// Only number or upper case.
						ComKeyOnlyAlphabet('uppernum'); 
					break;
					case "bkg_no":
						// Only number or upper case.
						ComKeyOnlyAlphabet('uppernum'); 
					break;
					case "act_cust_cnt_cd":
						// Only upper case.
						ComKeyOnlyAlphabet('upper'); 
					break;
					case "inv_cust_cnt_cd":
						// Only upper case.
						ComKeyOnlyAlphabet('upper'); 
					break;
					case "cr_curr_cd":
						// Only upper case.
						ComKeyOnlyAlphabet('upper'); 
					break;
					case "cr_clt_ofc_cd":
						// Only upper case.
						ComKeyOnlyAlphabet('upper'); 
					break;
//					case "vvd":
						// Only number or upper case.
//						ComKeyOnlyAlphabet('uppernum'); 
//					break;
				}
			break;          
			default:
				// Only number.
				ComKeyOnlyNumber(ComGetEvent());
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
	function obj_activate() {
		// Removing mask separator.
		ComClearSeparator (ComGetEvent());
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
	function obj_deactivate(){
		var srcName=ComGetEvent();
		switch(srcName.name){
			case "date_value":
				ComChkObjValid(ComGetEvent());
			break;
			case "port":
				ComChkObjValid(ComGetEvent());
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
	var ar_ofc_cd_text = "";
	function doActionIBSheet(sheetObj,formObj,sAction) {
		sheetObj.ShowDebugMsg(false);
		switch(sAction) {
		case IBSEARCH:      //retrieve
			if(validateForm(sheetObj,formObj,sAction)) {
			//check cancelled data for india.	
				formObj.f_cmd.value=SEARCH01;
				var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
     			formObj.ofc.value=arrStr2[1];
                //ComOpenWait(true); 	 
                var sXml=sheetObj.GetSearchData("FNS_INV_0053GS.do", FormQueryString(formObj));
    			var sStr=ComGetEtcData(sXml,"missn_flg");
    			//alert(sStr);
                if(sStr == 'Y'){
        			ComShowMessage("Invoice number is cancelled in the system");
					ComResetAll(); 		
					ar_ofc_cd.SetSelectText(ar_ofc_cd_text);
					return;
                } 

				// normal search
				formObj.f_cmd.value=SEARCH;
				var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
     			formObj.ofc.value=arrStr2[1];
                ComOpenWait(true); 	     			
                var sXml=sheetObj.GetSearchData("FNS_INV_0053GS.do", FormQueryString(formObj));
                
                var arrXml=sXml.split("|$$|");
				
     			if(CoInvShowXmlMessage(arrXml[0]) != "") {
     				var invNo=formObj.inv_no.value;
     				var arOfcCd=ar_ofc_cd.GetSelectText();
     				removeAll(formObj);
     				formObj.inv_no.value=invNo;
     				formObj.ar_ofc_cd.text=arOfcCd;
     				ComOpenWait(false); 
     				ComAlertFocus(formObj.inv_no, CoInvShowXmlMessage(arrXml[0]));
				} else {
					sheetObjects[0]= sheetObjects[0].Reset();
					formObj.reset();
     				// Set number of decimal places
		 			formObj.dp_prcs_knt_local.value=ComGetEtcData(arrXml[0],"dp_prcs_knt_local");
		 			formObj.dp_prcs_knt.value=ComGetEtcData(arrXml[0],"dp_prcs_knt");
		 		    ar_ofc_cd_text=ar_ofc_cd.GetSelectText();
		 			ar_ofc_cd.SetSelectText(ar_ofc_cd_text);
					if (arrXml.length > 0) {
						var list=ComXml2ListMap(arrXml[0]);
						if (list.length > 0) {
							var expensInfo=list[0];
							ComMapToForm(formObj,expensInfo);
						}
						else {
							var inv_no=formObj.inv_no.value;
							
							ComShowCodeMessage("INV00095");
							ComResetAll();
							formObj.inv_no.value=inv_no;
							
						}
					}					
		 			initSheet(sheetObjects[0],1);
					if (arrXml.length > 1) {
						sheetObjects[0].LoadSearchData(arrXml[1],{Sync:1} );
					}	
					ComOpenWait(false); 
				}
                
			}

			break;			
		 	
 			
			case IBSEARCH_ASYNC10: // Retrieving AR office.
				formObj.f_cmd.value=SEARCH02; 				
				var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
				var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
				var arrStr=sStr.split("|");
				MakeComboObject(ar_ofc_cd, arrStr);
				var arrStr2=arrStr[1].split("^");
				ar_ofc_cd_text=arrStr2[3];
				ar_ofc_cd.SetSelectText(ar_ofc_cd_text);
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
    	 switch(sAction) {
 			case IBSEARCH:      //Retrieve
				 with(formObj){
					 if(inv_no.value == "") {          		 
						 ComShowCodeMessage("COM12114", "Invoice No");
						 inv_no.focus();
						 return false;
					 }					 
					 /*if(ar_ofc_cd.GetSelectText() == "") {*/
					 /*if(ar_ofc_cd.value == "") {
						 ComShowCodeMessage("COM12114", "Office");
						 //ar_ofc_cd.focus();
						 return false;
					 }*/ //AS_IS가 필수검사요소가 아니므로 주석처리함					 
				 }
    	 }
		 return true;
	}
	/** 
 	 * Coding event for OnLoadFinish.<br>
 	 * <br><b>Example :</b>
 	 * <pre>
 	 * </pre>
 	 * @param {ibsheet} sheetObj required IBSheet Object
 	 * @return none.
 	 * @see #
 	 * @author 
 	 * @version 2009.10.19
 	 */
     function sheet1_OnLoadFinish(sheetObj){
 		var formObj=document.form;
		doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC10);
		initControl();
		formObj.inv_no.focus();
 	}
	/** 
	 * office code select box <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {IBMultiCombo} comboObj  
	 * @param  {Array} arrStr
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function MakeComboObject(cmbObj, arrStr) {		
		//alert(cmbObj.options.id);
		cmbObj.RemoveAll();
		for (var i=1; i < arrStr.length;i++ ) {
			 var arrStr2=arrStr[i].split("^");
			    ar_ofc_cd_text=arrStr2[1];
			cmbObj.InsertItem(i-1, ar_ofc_cd_text, arrStr[i]);
		}
		cmbObj.SetBackColor("#e9f4ff");
	}
	/** 
	 * Popup - (COM_ENS_051). If event completed, call parent window. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {array} rowArray   
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function getCOM_ENS_051_1(rowArray) {
		var colArray=rowArray[0];
		document.all.port.value=colArray[3];
	}
	/** 
	 * Transform VoList to array[array[name]].<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param {xml} xmlStr retrieve => setRsVoList , setRsVo
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function ComXml2ListMap(xmlStr) {
		var rtnArr=new Array();
		if (xmlStr == null || xmlStr == "") {
			return rtnArr;
		}
		try {
			var xmlDoc = ComGetXmlDoc(xmlStr);
			if (xmlDoc == null) return;
			var xmlRoot = xmlDoc.documentElement;
			var dataNode=xmlRoot.getElementsByTagName("DATA").item(0);
			if (dataNode == null || dataNode.attributes.length < 3) {
				return rtnArr;
			}
			var col=dataNode.getAttribute("COLORDER");
			var colArr=col.split("|");
			var sep=dataNode.getAttribute("COLSEPARATOR");
			var total=dataNode.getAttribute("TOTAL");
			var dataChileNodes=dataNode.childNodes;
			if (dataChileNodes == null) {
				return rtnArr;
			}
			var count=0;
			for ( var i=0; i < dataChileNodes.length; i++) {
				if (dataChileNodes[i].nodeType != 1) {
					continue;
				}
				var arrData=dataChileNodes[i].firstChild.nodeValue.split(sep);
				var subDataArr=new Array();
				for ( var j=0; j < arrData.length; j++) {
					subDataArr[colArr[j]]=arrData[j];
				}
				rtnArr[count]=(subDataArr);
				count++;
			}
		} catch (err) {
			ComFuncErrMsg(err.message);
		}
		return rtnArr;
	}
	/** 
	 * Setting value on form object.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param {form} form html form 
	 * @param {map} Array[name] 
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function ComMapToForm(form, map) {			
			var len=form.elements.length;
			for (var i=0; i < len; i++) {
				if (form.elements[i].classid == undefined) {
					var xvalue=map[form.elements[i].name];
					if (xvalue == undefined)
						continue;
					switch (form.elements[i].type) {
					case "button":
					case "reset":
					case "submit":
						break;
					case "radio":
						var eRadio=document.all[form.elements[i].name];
						var idx=0;
						for ( var k=0; k < eRadio.length; k++) {
							if (eRadio[k].value == xvalue) {
								idx=k;
								break;
							}
						}
						eRadio[idx].checked=true;
						break;
					case "checkbox":
						form.elements[i].checked=xvalue;
						break;
					case "select-one":
						var eOpt=form.elements[i].options;
						var idx=0;
						if (eOpt != null && eOpt.length != null && eOpt.length >= 1) {
							var opt_len=eOpt.length;
							for ( var k=0; k < opt_len; k++) {
								if (eOpt[k].value == xvalue) {
									idx=k;
									break;
								}
							}
						}
						form.elements[i].selectedIndex=idx;
						break;
					case "select-multiple":
						var eOpt=form.elements[i].options;
						var idx=0;
						if (eOpt != null && eOpt.length != null && eOpt.length >= 1) {
							var opt_len=eOpt.length;
							var tvalue=xvalue.split("|");
							var tval_len=tvalue.length;
							for ( var k=0; k < opt_len; k++) {
								for ( var m=0; m < tval_len; m++) {
									if (eOpt[k].value == tvalue[m])
										eOpt[k].selected=true;
								}
							}
						}
						break;
					default:
						switch (form.elements[i].name) {
							case "cr_amt":
								form.elements[i].value=ComAddCommaRun(xvalue);
							break;
							case "cust_rgst_no":
								form.elements[i].value=ComGetMaskedValue(xvalue, "saupja");
							break;
							case "iss_dt":
								form.elements[i].value=ComGetMaskedValue(xvalue, "ymd");
							break;
//							case "sail_arr_dt":
//								form.elements[i].value=ComGetMaskedValue(xvalue, "ymd");
//							break;
//							case "due_dt":
//								form.elements[i].value=ComGetMaskedValue(xvalue, "ymd");
//							break;
							default:
								form.elements[i].value=xvalue;
							break;
						}
					}
				}
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
	function removeAll(formObj) {
		formObj.reset();
		sheetObjects[0].RemoveAll();
		doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC10);
		formObj.inv_no.focus();
	}
	/** 
	 * Popup-(FNS_INV_0013). If event completed, call parent window. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {array} rowArray   
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function getFNS_INV_0013() {
		var colArray=rowArray[0];
		var formObject=document.form;
	}
	/** 
	 * Coding event for OnSearchEnd.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param {ibsheet} sheetObj required IBSheet Object
	 * @param {string} ErrMsg required
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.05.04
	 */ 	  	
	function sheet1_OnSearchEnd(sheetObj, errMsg){
		ComOpenWait(false);
		sheetObj.SetSumText(0,1, "TOTAL");
	} 
	
	
	function resizeSheet(){
		ComResizeSheet(sheetObjects[0]);
	}
