/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0011.js
*@FileTitle  : Invoice Inquiry by I/F No
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/26
=========================================================*/

	// Global variables.
	var tabObjects=new Array();
	var tabCnt=0 ;
	var beforetab=1;
	var sheetObjects=new Array();
	var sheetCnt=0;
	//IBMultiCombo
	var comboObjects=new Array();
	var combo1=null;
	var comboCnt=0;
	var sheet_container=null;
	//Defining button events. */
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
		var sheetObject2=sheetObjects[1];
		var sheetObject3=sheetObjects[2];
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch(srcName) { 
				case "btns_cust": // CUST retrieve button.
					var v_act_cust_cnt_cd=formObject.act_cust_cnt_cd.value;
					var v_act_cust_seq=formObject.act_cust_seq.value;
					var classId="FNS_INV_0013";
					var param='?cust_cnt_cd='+v_act_cust_cnt_cd+'&cust_seq='+v_act_cust_seq+'&pop_yn=Y&classId='+classId;
					ComOpenWindow('/opuscntr/FNS_INV_0013.do' + param, 'getFNS_INV_0013', 'width=1000,height=680');
				break;
				case "btns_container":
					ComOpenPopup('/opuscntr/FNS_INV_0098.do', 700, 380, '', '0,0');
				break;
				case "btn_Retrieve":
					doActionIBSheet(sheetObject1,formObject,IBSEARCH);
				break;
				case "btn_new":
					removeAll(formObject);
					document.getElementById('ida_gst_expt_nm').style.display='none';
					document.getElementById('ida_gst_expt_cd').style.display='none';
					document.getElementById('sez_nm').style.display='none';
					document.getElementById('sez_flg').style.display='none';
				break; 
				case "btn_close":
					//ComClosePopup();
					window.close();
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
	 * Register IBTab object on array.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * Array define top on source.
	 * </pre>
	 * @param {IBTab} tab_obj    IBTab Object
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function setTabObject(tab_obj){
		tabObjects[tabCnt++]=tab_obj;
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
		sheet_container=sheetObjects[2];
		for(i=0;i<sheetObjects.length;i++){
			ComConfigSheet (sheetObjects[i] );
			initSheet(sheetObjects[i],i+1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		for(k=0;k<tabObjects.length;k++){
			initTab(tabObjects[k],k+1);
			tabObjects[k].SetSelectedIndex(0);
		}
		// Initialize IBMultiCombo.
//		for(var k=0; k<comboObjects.length; k++){
//			initCombo(comboObjects[k],k+1);
//		}
		initControl();

		setSearchValueType();
		if ((formObj.view_ar_if_no.value == '' && formObj.view_ar_ofc_cd.value == '')) {
			//doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC10);
			document.form.ar_if_no.focus();
		}
		// Popupscreen retrieve
		else {
			
			//doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC10);
			formObj.ar_ofc_cd.text=formObj.view_ar_ofc_cd.value;
			formObj.ar_if_no.value=formObj.view_ar_if_no.value;
			formObj.inv_split_cd.value=formObj.view_inv_split_cd.value;
			doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
		}
		resizeSheet();
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
		var dpPrcsKnt=formObject.dp_prcs_knt.value;
		var dpPrcsKntLocal=formObject.dp_prcs_knt_local.value;
		switch(sheetNo) {
			case 1:      //t2sheet1 init
			    with(sheetObj){
		        	
		        	//	no support[check again]CLT 					if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);
		        	var HeadTitle="Cur|Amount|Ex. Rate|Local Cur|Local Amount";

		        	SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );

		        	var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		        	var headers = [ { Text:HeadTitle, Align:"Center"} ];
		        	InitHeaders(headers, info);

		        	var cols = [ {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"curr_cd",       KeyField:0,   CalcLogic:"",   Format:"" } ];
		           		cols.push({Type:"Text",       Hidden:0,  Width:150,  Align:"Right",   ColMerge:0,   SaveName:"chg_amt",       KeyField:0,   CalcLogic:"",   Format:"" });
		            	cols.push({Type:"Float",     Hidden:0,  Width:90,   Align:"Right",   ColMerge:0,   SaveName:"inv_xch_rt",    KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6 });
		            	cols.push({Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"locl_curr_cd",  KeyField:0,   CalcLogic:"",   Format:"" });
		            	if (dpPrcsKntLocal > 0) {
		            		cols.push({Type:"AutoSum",   Hidden:0, Width:150,  Align:"Right",   ColMerge:0,   SaveName:"local_total",   KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:dpPrcsKntLocal });
		            	} else {
		            		cols.push({Type:"AutoSum",   Hidden:0, Width:150,  Align:"Right",   ColMerge:0,   SaveName:"local_total",   KeyField:0,   CalcLogic:"",   Format:"Integer" });
		            	}
		            	
		            	InitColumns(cols);
		            	SetSumText(0,"curr_cd","Total");
		            	SetEditable(0);
		            	SetWaitImageVisible(0);
		            	SetSheetHeight(200);
		            	SetSheetWidth(550);
//			        	resizeSheet();
			}
			break;
			case 2:      //t2sheet2 init
			    with(sheetObj){
		        	
		        	//no support[check again]CLT 					if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);
		        	var HeadTitle="Seq.|CHG|M/N|Cur|Rate|Rated As|Per|Amount|VAT|SGST(%)|CGST(%)|IGST(%)|Remark(s)";

		        	SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );

		        	var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		        	var headers = [ { Text:HeadTitle, Align:"Center"} ];
		        	InitHeaders(headers, info);

		        	var cols = [ {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"Seq" },
		        	             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"chg_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		        	             {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"mnl_flg",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		        	             {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"curr_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		        	             {Type:"Text",      Hidden:0,  Width:130,  Align:"Right",   ColMerge:0,   SaveName:"trf_rt_amt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		        	             {Type:"Float",     Hidden:0,  Width:100,   Align:"Right",   ColMerge:0,   SaveName:"rat_as_cntr_qty",  KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:3,   UpdateEdit:1,   InsertEdit:1 },
		        	             {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"per_tp_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		        	             {Type:"Text",      Hidden:0,  Width:160,  Align:"Right",   ColMerge:0,   SaveName:"chg_amt",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		        	             {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"tva_flg",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 }];
		           if(formObject.ida_gst_expt_cd.value == "X"){        
		        		   cols.push({Type:"Text",  Hidden:1,  Width:0,  Align:"Center",   ColMerge:0,   SaveName:"ste_tax_rt",       KeyField:0,   CalcLogic:"",   Format:"" });
		        		   cols.push({Type:"Text",  Hidden:1,  Width:0,  Align:"Center",   ColMerge:0,   SaveName:"cnt_tax_rt",       KeyField:0,   CalcLogic:"",   Format:"" });
		        		   cols.push({Type:"Text",  Hidden:1,  Width:0,  Align:"Center",   ColMerge:0,   SaveName:"inter_tax_rt",     KeyField:0,   CalcLogic:"",   Format:"" });
		           }else{
	        		       cols.push({Type:"Float",  Hidden:0,  Width:55,  Align:"Center",   ColMerge:0,   SaveName:"ste_tax_rt",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:1 });
	        		       cols.push({Type:"Float",  Hidden:0,  Width:55,  Align:"Center",   ColMerge:0,   SaveName:"cnt_tax_rt",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:1 });
	        		       cols.push({Type:"Float",  Hidden:0,  Width:55,  Align:"Center",   ColMerge:0,   SaveName:"inter_tax_rt",     KeyField:0,   CalcLogic:"",   Format:"NullFloat",    PointCount:1 });
		           }	   
		                   cols.push({Type:"Text",      Hidden:0,  Width:430,  Align:"Left",    ColMerge:0,   SaveName:"chg_rmk",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 });
		       
		        	InitColumns(cols);

		        	SetEditable(0);
		        	SetWaitImageVisible(0);
//		        	SetSheetHeight(240);
//		        	SetSheetWidth(1230);
		        	resizeSheet();
			}
			break;
			case 3:      //Container init
			    with(sheetObj){
					
					//no support[check again]CLT 	                if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);
					var HeadTitle1=" |Cntr_tpsz_cd|Cntr_no";

					SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );

					var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
					var headers = [ { Text:HeadTitle1, Align:"Center"} ];
					InitHeaders(headers, info);

					var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
					             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"cntr_tpsz_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"cntr_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
		       
					InitColumns(cols);

					SetEditable(0);
					SetWaitImageVisible(0);
					SetCountPosition(0);
					SetWaitImageVisible(0);
					SetSheetHeight(100);
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
					SetColWidth(0, "50");
	                //SetTitle("Office Code");
					SetMultiSelect(0);
					SetUseAutoComplete(1);
					SetDropHeight(200);
//no support[check again]CLT 					ValidChar(2,1);
					SetMaxLength(6);
				}
			break;
		}
  	}
	/** 
	 * Setting default values for tab.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * Setting tap's items.
	 * </pre>
	 * @param {IBTab} tabObj
	 * @param {object} tabNo
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function initTab(tabObj , tabNo) {
		switch(tabNo) {
			case 1:
				with (tabObj) {
					var cnt=0 ;
					InsertItem( "General" , "");
					InsertItem( "Charge" , "");
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
		axon_event.addListenerFormat ('keypress', 'obj_keypress', form);
		axon_event.addListenerFormat ('beforeactivate', 'obj_activate', form);
		axon_event.addListenerForm ('beforedeactivate', 'obj_deactivate', form);
		axon_event.addListener('click', 'revType_click', 'chk_rev_type');
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
					case "ar_if_no":
						// Only number or upper case.
						ComKeyOnlyAlphabet('uppernum'); 
					break;
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
					case "vvd":
						// Only number or upper case.
						ComKeyOnlyAlphabet('uppernum'); 
					break;
				}
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
	function obj_activate() {
		// Removing mask separator.
		ComClearSeparator (event.srcElement);
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
		switch(event.srcElement.name){
			case "date_value":
				ComChkObjValid(event.srcElement);
			break;
			case "port":
				ComChkObjValid(event.srcElement);
			break;
        }
	}
	function revType_click() {
		var obj=event.srcElement;
		doEnableRevType(obj);
	}
	function doEnableRevType(obj) {
		var formObj=document.form;
		// All (total)
		if(obj.value == 'A') {
			if(obj.checked) {
				ComEnableObject(formObj.chk_rev_type[1], false);
				ComEnableObject(formObj.chk_rev_type[2], false);
				ComEnableObject(formObj.chk_rev_type[3], false);
				ComEnableObject(formObj.chk_rev_type[4], false);
	 	 		formObj.chk_rev_type[1].checked=false;
	 	 		formObj.chk_rev_type[2].checked=false;
	 	 		formObj.chk_rev_type[3].checked=false;
	 	 		formObj.chk_rev_type[4].checked=false;
	 	 		formObj.rev_type_A.value="A";
	 	 		formObj.rev_type_B.value="";
	 	 		formObj.rev_type_C.value="";
	 	 		formObj.rev_type_D.value="";
	 	 		formObj.rev_type_M.value="";
			} else {
				ComEnableObject(formObj.chk_rev_type[1], true);
				ComEnableObject(formObj.chk_rev_type[2], true);
				ComEnableObject(formObj.chk_rev_type[3], true);
				ComEnableObject(formObj.chk_rev_type[4], true);
	 	 		formObj.rev_type_A.value="";
			}
		}
		// B/L:B(REV_TP_CD = 'B')
		else if(obj.value == 'B') {
			if(obj.checked) {
				formObj.rev_type_B.value="B";
			} else {
				formObj.rev_type_B.value="";
			}
		}
		// C/A:C(REV_TP_CD = 'C')
		else if(obj.value == 'C') {
			if(obj.checked) {
				formObj.rev_type_C.value="C";
			} else {
				formObj.rev_type_C.value="";
			}
		}
		// DEM:D(REV_TP_CD = 'M' REV_SRC_CD = 'DT')
		else if(obj.value == 'D') {
			if(obj.checked) {
				formObj.rev_type_D.value="D";
			} else {
				formObj.rev_type_D.value="";
			}
		}
		// DEM:D(REV_TP_CD = 'M' REV_SRC_CD <> 'DT')
		else if(obj.value == 'M') {
			if(obj.checked) {
				formObj.rev_type_M.value="M";
			} else {
				formObj.rev_type_M.value="";
			}
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
					
					//tabObjects[0].SelectedIndex = 0;
					ComOpenWait(true);
//parameter changed[check again]CLT 	     			
					var sXml=sheetObj.GetSearchData("FNS_INV_0011GS.do", FormQueryString(formObj));
					var arrXml=sXml.split("|$$|");
	     			if(CoInvShowXmlMessage(arrXml[0]) != "") {
	     				var arIfNo=formObj.ar_if_no.value;
	     				var arOfcCd=formObj.ar_ofc_cd.text;
	     				removeAll(formObj);
	     				formObj.ar_if_no.value=arIfNo;
	     				formObj.ar_ofc_cd.text=arOfcCd;
	     				ComAlertFocus(formObj.ar_if_no, CoInvShowXmlMessage(arrXml[0]));
					} else {
						if (arrXml.length > 0) {
							var currPoint=ComGetEtcData(arrXml[0], "dp_prcs_knt");
							var lclCurrPoint=ComGetEtcData(arrXml[0], "dp_prcs_knt_local");
							var list=ComXml2ListMap(arrXml[0]);
							//retrievecondition save
							var arIfNo=formObj.ar_if_no.value;
							var blSrcNo=formObj.bl_src_no.value;
							var bkgNo=formObj.bkg_no.value;
							var arOfcCd=formObj.ar_ofc_cd.text;
							if (list.length > 0) {
								var expensInfo=list[1];
								if (expensInfo["act_cust_cnt_cd"] != '') {
									var vRevTpCd="";
									var vRevSrcCd="";
									formObj.reset();
									ComMapToForm(formObj,expensInfo);
									
									if(formObj.ida_gst_expt_cd.value == "X"){
										document.getElementById('ida_gst_expt_nm').style.display='none';
										document.getElementById('ida_gst_expt_cd').style.display='none';
										document.getElementById('sez_nm').style.display='none';
										document.getElementById('sez_flg').style.display='none';
									}else{
										document.getElementById('ida_gst_expt_nm').style.display='';
										document.getElementById('ida_gst_expt_cd').style.display='';
										document.getElementById('sez_nm').style.display='';
										document.getElementById('sez_flg').style.display='';
									}
								}
								else {
									ComResetAll();
									formObj.ar_if_no.value=arIfNo;
									formObj.ar_ofc_cd.text=arOfcCd;
									ComShowCodeMessage("INV00095");
								}
							}
							formObj.dp_prcs_knt.value=currPoint;
							formObj.dp_prcs_knt_local.value=lclCurrPoint;
						}
												
						if (arrXml.length > 1) {
							sheetObjects[0] = sheetObjects[0].Reset();
							initSheet(sheetObjects[0],1);
							sheetObjects[0].LoadSearchData(arrXml[1],{Sync:1} );
						}
						if (arrXml.length > 2) {
							sheetObjects[1] = sheetObjects[1].Reset();
							initSheet(sheetObjects[1],2);
							sheetObjects[1].LoadSearchData(arrXml[2],{Sync:1} );
						}
						if (arrXml.length > 3) {
							sheetObjects[2].LoadSearchData(arrXml[3],{Sync:1} );
						}
					}
	     			ComOpenWait(false);
		 		}
		 	break;
			case IBSEARCH_ASYNC10: // Retrieving AR office.
				formObj.f_cmd.value=SEARCH02;
//parameter changed[check again]CLT 				
				var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
				var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
				var arrStr=sStr.split("|");
				MakeComboObject(formObj.ar_ofc_cd, arrStr);
				var arrStr2=arrStr[1].split("^");
				var ar_ofc_cd=arrStr2[3];
				formObj.ar_ofc_cd.text=ar_ofc_cd;
			break;
		 	case IBINSERT:      // input
		 	break;
		 }
	}
	
	/** 
	 * Tap click event. function <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * Activating selected tab.
	 * </pre>
     * @param {IBTab} tabObj required tabObj Object        
     * @param {object} nItem
     * @return none.
     * @see #
     * @author 
     * @version 2009.10.19
     */
	function tab1_OnChange(tabObj , nItem) {
		var objs=document.all.item("tabLayer");
		objs[nItem].style.display="Inline";
		objs[beforetab].style.display="none";
		objs[beforetab].style.zIndex=objs[nItem].style.zIndex -1 ;
		beforetab=nItem;
		resizeSheet();
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
			 if(ar_if_no.value == "") {          		 
				 ComShowCodeMessage("COM12114", "I/F No.");
				 ar_if_no.focus();
				 return false;
			 }
			 if(ar_ofc_cd.text == "") {
				 ComShowCodeMessage("COM12114", "Office");
				 ar_ofc_cd.focus();
				 return false;
			 }
		}
		return true;
	}
	/**
	 * When clicking cell, issuing event. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {ibsheet} sheetObj    IBSheet Object
	 * @param {ibsheet} row     	sheetObj's selected row
	 * @param {ibsheet} col     	sheetObj's selected column
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	**/
	function t2sheet2_OnClick(sheetObj, row, col, value) {
		switch (sheetObj.ColSaveName(col)) {
	  		case "chg_rmk":
	    		sheetObj.SetCellEditable(row,"chg_rmk",0);
    			readOnly=true;
	    		ComShowMemoPad(sheetObj, row, col, readOnly, 310, 60);
	    	break;
		}
	}
	/**
	 * Grid's item edittable.
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {object} sAction
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function initProperty(sAction) {
		switch (sAction) {
			case IBSEARCH: //Open
				var obj=frm.sch_office_code;
				obj.disabled=true;
				obj.className="input2";
				// SUMUP Office Reset
				combo1.RemoveAll();
				combo1.SetEnable(0);
				break;
			case SEARCHLIST: //retrieve
				for(var row=2; row<=sheet1.LastRow(); row++) {
					sheet1.SetCellEditable(row,"ofc_cd",0);
					sheet1.SetCellEditable(row, "ofc_eng_nm",0);
					sheet1.SetCellEditable(row, "ctr_cd",0);
					sheet1.SetCellEditable(row, "ap_ctrl_ofc_cd",0);
					if(sheet1.GetCellValue(row, "ofc_his_cnt") > 0) {
//conversion of function[check again]CLT 						
						sheet1.SetCellImage(row, "hisPopup",1);
					}
					else {
//conversion of function[check again]CLT 						
						sheet1.SetCellImage(row, "hisPopup",0);
					}
				}
				break;	
		}
	}
	/**
	 * Setting retrievecondition input<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param none.
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	*/
	function setSearchValueType() {
		var formObj=document.form;
		if (formObj.view_ar_if_no.value == '' && formObj.view_ar_ofc_cd.value == '') {
			ComEnableObject(formObj.ar_if_no,true);
			formObj.ar_if_no.className="input1";
			formObj.ar_if_no.tabIndex="";
			formObj.ar_if_no.focus();
		}
		else {
			ComEnableObject(formObj.ar_if_no,false);
//			formObj.ar_ofc_cd.SetEnable(0);
		}
	}
	/** 
	 * If event completed, call parent window. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {array} rowArray   
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function getFNS_INV_0099(rowArray, row, col) {
		var colArray=rowArray[0];	
		var sheetObject=sheetObjects[1];
        sheetObject.SetCellValue(row,col+1,colArray[3]);
	}
	/** 
	 * If event completed, call parent window. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {array} rowArray   
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
	function getFNS_INV_0013(rowArray) {
		var colArray=rowArray[0];
		var formObject=document.form;
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
		tabObjects[0].SetSelectedIndex(0);
		sheetObjects[0].RemoveAll();
		sheetObjects[1].RemoveAll();
		sheetObjects[2].RemoveAll();
		
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
		cmbObj.RemoveAll();
		for (var i=1; i < arrStr.length;i++ ) {
			var arrStr2=arrStr[i].split("^");
			var ar_ofc_cd=arrStr2[1];
			cmbObj.InsertItem(i-1, ar_ofc_cd, arrStr[i]);
		}
		cmbObj.SetBackColor("#CCFFFD");
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
			//var xmlDoc=new ActiveXObject("Microsoft.XMLDOM");
			//xmlDoc.loadXML(xmlStr);
			//var xmlRoot=xmlDoc.documentElement;
			//if (xmlRoot == null) {
			//	return rtnArr;
			//}
			
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
			for ( var i=0; i < dataChileNodes.length; i++) {
				if (dataChileNodes[i].nodeType != 1) {
					continue;
				}
				var arrData=dataChileNodes[i].firstChild.nodeValue.split(sep);
				var subDataArr=new Array();
				for ( var j=0; j < arrData.length; j++) {
					subDataArr[colArr[j]]=arrData[j];
				}
				rtnArr[i]=(subDataArr);
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
						case "cgo_wgt":
							form.elements[i].value=ComAddCommaRun(xvalue);
						break;
						case "cgo_meas_qty":
							form.elements[i].value=ComAddCommaRun(xvalue);
						break;
						case "bkg_teu_qty":
							form.elements[i].value=ComAddCommaRun(xvalue);
						break;
						case "bkg_feu_qty":
							form.elements[i].value=ComAddCommaRun(xvalue);
						break;
						case "good":
							form.elements[i].value=ComAddCommaRun(xvalue);
						break;
						case "nogood":
							form.elements[i].value=ComAddCommaRun(xvalue);
						break;
						case "inv_rmk":
							form.elements[i].value=ComReplaceStr(xvalue,"◀▶"," ");
						break;
						case "cust_rgst_no":
							form.elements[i].value=ComGetMaskedValue(xvalue, "saupja");
						break;
						case "frt_fwrd_cust_seq":
							if (xvalue != '' && xvalue != '0') {
								form.elements[i].value=ComLpad(xvalue, 6, '0');
							}
						break;
						default:
							form.elements[i].value=xvalue;
						break;
					}
				}
			}
		}
	}
	
	
	function resizeSheet(){
//		ComResizeSheet(sheetObjects[0]);
		ComResizeSheet(sheetObjects[1]);

	}

