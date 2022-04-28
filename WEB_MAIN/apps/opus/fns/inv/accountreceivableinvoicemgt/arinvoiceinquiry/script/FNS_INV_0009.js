/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	: FNS_INV_0009.js
*@FileTitle : Invoice Inquiry by B/L No
*@author    : CLT
*@version   : 1.0
*@since     : 2014/06/15
=========================================================*/
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
	var sheet_history=null;
	var sheet_total=null;
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
	 * @version 2009.06.08
	 */
	function processButtonClick(){
		/***** Setting each tab's sheet variable. *****/
		var sheetObject1=sheetObjects[0];
		var sheetObject2=sheetObjects[1];
		var sheetObject3=sheetObjects[2];
		var sheetObject4=sheetObjects[3];
		var sheetObject5=sheetObjects[4];
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
					ComOpenPopup('/opuscntr/FNS_INV_0098.do?pagetype=I', 700, 340, '', '0,0');
				break; 					
			/*** Tab Total Amount (S) ***/
				case "btn_retrieve":
					formObject.office.value="";
					formObject.inv_dup_flg.value="";
					doActionIBSheet(sheetObject1,formObject,IBSEARCH);
				break;
				case "btn_t1new":
					removeAll(formObject);
				break;
			/*** Tab Total Amount (E) ***/					
			/*** Tab History (S) ***/
				case "btn_t2new":
					removeAll(formObject);
				break; 
				case "btn_t2downexcel":
					doActionIBSheet(sheetObjects[2],formObject,IBDOWNEXCEL);
				break;
				case "btn_t2history":				
					var v_bl_src_no=formObject.bl_src_no.value;
					var v_bkg_no=formObject.bkg_no.value;
					var v_bl_tp_cd=formObject.bl_tp_cd.value;
					var v_bl_tp_cd=formObject.bl_tp_cd.value;
					var v_ar_ofc_cd=formObject.ar_ofc_cd.value;
//					var v_ar_ofc_cd=formObject.ar_ofc_cd.GetSelectText();
					
					if (v_ar_ofc_cd == '') {
						v_ar_ofc_cd=formObject.ar_ofc_cd_text.value;
					}
					var classId="FNS_INV_0010";
					var param='?bl_src_no='+v_bl_src_no+'&bkg_no='+v_bkg_no+'&bl_tp_cd='+v_bl_tp_cd+'&ar_ofc_cd='+v_ar_ofc_cd+'&classId='+classId;
					
//					ComOpenWindow('/opuscntr/FNS_INV_0010.do' + param, 'FNS_INV_0010', 'width=850,height=700');
					ComOpenPopup('/opuscntr/FNS_INV_0010.do' + param, 1020, 600, null, 'none', true);
				break;
				case "btn_t2sysclear":
					doActionIBSheet(sheetObject3,formObject,IBROWSEARCH);
				break; 	
				case "btn_paymentsts":
					var v_bl_src_no=formObject.bl_src_no.value;
					var classId="ESM_BKG_1902";
					var param='?bl_no='+v_bl_src_no+'&classId='+classId;
					ComOpenPopup('/opuscntr/ESM_BKG_1902.do' + param, 1020, 600, null, 'none', true);
					break; 	
				case "btn_close":
					ComClosePopup(); 
				break;
				/*** Tab History (E) ***/
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
	 * @version 2009.06.08
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
	 * @version 2009.06.08
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
	 * @version 2009.06.08
	 */
	function loadPage() {
		sheet_container=sheetObjects[4];
		sheet_history=sheetObjects[2];
		sheet_total=sheetObjects[3];
		for(i=0;i<sheetObjects.length;i++){
			ComConfigSheet (sheetObjects[i] );
			initSheet(sheetObjects[i],i+1);
			ComEndConfigSheet(sheetObjects[i]);
		}
	    resizeSheet();
		for(k=0;k<tabObjects.length;k++){
			initTab(tabObjects[k],k+1);
			tabObjects[k].SetSelectedIndex(0);
		}  
		// Initialize IBMultiCombo.
		for(var k=0; k<comboObjects.length; k++){
			initCombo(comboObjects[k],k+1);
		}
		initControl();
		t1sheet1_OnLoadFinish(t1sheet1);
		tab_init(); 
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
	 * @version 2009.06.08
	 */
	function initSheet(sheetObj,sheetNo) {
		var formObject=document.form;
		var cnt=0;
		var dpPrcsKnt=formObject.dp_prcs_knt.value;
		var dpPrcsKntLocal=formObject.dp_prcs_knt_local.value;
		var setDpPrcsKnt=dpPrcsKntLocal;

		switch(sheetNo) {
			case 1:      //t1sheet1 init
			    with(sheetObj){
		      var HeadTitle="|Cur|Amount|Ex. Rate|Local Amount";

		      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );

		      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		      var headers = [ { Text:HeadTitle, Align:"Center"} ];
		      InitHeaders(headers, info);
		      
	    	  var cols = [ {Type:"Status",    Hidden:1,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
	  		               {Type:"Text",      Hidden:0,  Width:79,   Align:"Center",  ColMerge:0,   SaveName:"curr_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	  		               {Type:"Text",      Hidden:0,  Width:150,  Align:"Right",   ColMerge:0,   SaveName:"chg_amt",      KeyField:0,   CalcLogic:"",   Format:"" },
	  		               {Type:"Float",     Hidden:0,  Width:120,  Align:"Right",   ColMerge:0,   SaveName:"inv_xch_rt",   KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6 },
	  		               {Type:"AutoSum",   Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:"local_total",  KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:setDpPrcsKnt }];

	    	  InitColumns(cols);
//		      SetSheetHeight(240); 
//		      SetSheetWidth(550);
		      SetEditable(0);
		      SetWaitImageVisible(0);
		      //resizeSheet();
		            }


			break;
			case 2:      //t1sheet2 init
			    with(sheetObj){
				      var HeadTitle="CHG|M/N|Cur|Rate|Rated As|Per|Amount";
		
				      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
		
				      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
				      var headers = [ { Text:HeadTitle, Align:"Center"} ];
				      InitHeaders(headers, info);
				      
			    	  var cols = [{Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"chg_cd",           KeyField:0,   CalcLogic:"",   Format:"" },
			  		              {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"mnl_flg",          KeyField:0,   CalcLogic:"",   Format:"" },
			  		              {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"curr_cd",          KeyField:0,   CalcLogic:"",   Format:"" },
			  		              {Type:"Text",      Hidden:0,  Width:120,  Align:"Right",   ColMerge:0,   SaveName:"trf_rt_amt",       KeyField:0,   CalcLogic:"",   Format:"" },
			  		              {Type:"Float",     Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:"rat_as_cntr_qty",  KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:3 },
			  		              {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"per_tp_cd",        KeyField:0,   CalcLogic:"",   Format:"" },
			  		              {Type:"Text",      Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:"chg_amt",          KeyField:0,   CalcLogic:"",   Format:"" }];
				     
				      InitColumns(cols);
//				      SetSheetHeight(240);
//				      SetSheetWidth(685);
				      SetEditable(0);
				      SetWaitImageVisible(0);
				      //resizeSheet();
		            }


			break;                 
			case 3:      //t2sheet1 init
			    with(sheetObj){
		        
		      var HeadTitle="Seq.|I/F No.|Local VVD|Act Cust|Type|I/F Date|Good Date|Invoice No.|Group Invoice No.|Cur|Amount|Ex. Rate|Local Amount|CR Agreement No.|inv clr flg|arIfNo|invSplitCd";

		      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );

		      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		      var headers = [ { Text:HeadTitle, Align:"Center"} ];
		      InitHeaders(headers, info);

	    	  var cols = [{Type:"Seq",       Hidden:0,  Width:35,   Align:"Center",  ColMerge:0,   SaveName:"Seq" },
	  		              {Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"ar_if_no_inv_split_cd",  KeyField:0,   CalcLogic:"",   Format:"" },
	  		              {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"vvd",                    KeyField:0,   CalcLogic:"",   Format:"" },
	  		              {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"cust_cd",                KeyField:0,   CalcLogic:"",   Format:"" },
	  		              {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:0,   SaveName:"rev_type",               KeyField:0,   CalcLogic:"",   Format:"" },
	  		              {Type:"Date",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"bl_inv_if_dt",           KeyField:0,   CalcLogic:"",   Format:"Ymd" },
	  		              {Type:"Date",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"bl_inv_cfm_dt",          KeyField:0,   CalcLogic:"",   Format:"Ymd" },
	  		              {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"inv_no",                 KeyField:0,   CalcLogic:"",   Format:"" },
	  		              {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"grp_inv_no",             KeyField:0,   CalcLogic:"",   Format:"" },
	  		              {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"curr_cd",                KeyField:0,   CalcLogic:"",   Format:"" },
			  		      {Type:"Text",      Hidden:0,  Width:120,  Align:"Right",   ColMerge:0,   SaveName:"chg_amt",                KeyField:0,   CalcLogic:"",   Format:"" },
			  		      {Type:"Float",     Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:"inv_xch_rt",             KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6 },
			  		      {Type:"Text",      Hidden:0,  Width:120,  Align:"Right",   ColMerge:0,   SaveName:"local_total",            KeyField:0,   CalcLogic:"",   Format:"" },
	  		              {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"cust_agmt_no",           KeyField:0,   CalcLogic:"",   Format:"" },
			  		      {Type:"Text",      Hidden:1,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:"inv_clr_flg",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			  		      {Type:"Text",      Hidden:1,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"ar_if_no",               KeyField:0,   CalcLogic:"",   Format:"" },
			  		      {Type:"Text",      Hidden:1,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"inv_split_cd",           KeyField:0,   CalcLogic:"",   Format:"" } ];
	      
		      InitColumns(cols);
//		      SetSheetHeight(260);
//		      SetSheetWidth(1235);
		      SetEditable(0);
		      SetWaitImageVisible(0);
		      //resizeSheet();
		            }


			break; 
			case 4:      //t2sheet2 init
			    with(sheetObj){
		        
			      var HeadTitle="|Cur|Amount|Ex.Rate|Local Total";
	
			      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:0 } );
	
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);

			    	  var cols = [ {Type:"Status",   Hidden:1,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
						           {Type:"Text",     Hidden:0,  Width:75,   Align:"Center",  ColMerge:0,   SaveName:"curr_cd",      KeyField:0,   CalcLogic:"",   Format:"" },
						           {Type:"Text",     Hidden:0,  Width:150,  Align:"Right",   ColMerge:0,   SaveName:"chg_amt",      KeyField:0,   CalcLogic:"",   Format:"" },
						           {Type:"Float",    Hidden:0,  Width:130,  Align:"Right",   ColMerge:0,   SaveName:"inv_xch_rt",   KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6 },
						           {Type:"Text",     Hidden:0,  Width:120,  Align:"Right",   ColMerge:0,   SaveName:"local_total",  KeyField:0,   CalcLogic:"",   Format:"" } ];

			      InitColumns(cols);
			      SetSheetHeight(110);
			      SetSheetWidth(475);
			      SetEditable(0);
			      SetWaitImageVisible(0);
			      SetRowHidden(0, 1);
			      //resizeSheet();
		            }


			break;
			case 5:      //Container init
			    with(sheetObj){
					HeadTitle1=" |Cntr_tpsz_cd|Cntr_no";
					SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );

			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
			      InitHeaders(headers, info);

			      var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
		             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"cntr_tpsz_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"cntr_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
		       
			      InitColumns(cols);
			      SetSheetHeight(100);
			      SetEditable(0);
			      SetWaitImageVisible(0);
			      SetWaitImageVisible(0);
			      //resizeSheet();
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
	 * @version 2009.06.08
	 */
  	function initCombo(comboObj, comboNo) {
		switch (comboObj.options.id) {
			case "ar_ofc_cd":
				with (comboObj) {
					SetColAlign(0, "left");
					SetColWidth(0, "77");
	                //SetTitle("Office Code");
					SetMultiSelect(0);
					SetUseAutoComplete(1);
					SetDropHeight(200);
					ValidChar(2,1);
					SetMaxLength(6);
				}
				break;
		}
  	}
	/** 
	 * Initialize tab.<br>
	 * Setting tap's items.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param {IBTab} tabObjects  tabObjects
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.06.08
	 */
	function initTab(tabObj , tabNo) {
		switch(tabNo) {
			case 1:
				with (tabObj) {
					var cnt=0 ;
					InsertItem( "Total Amount" , "");
					InsertItem( "History" , "");
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
	 * @version 2009.06.08
	 */
	function initControl() {
		// Axon event process. Event catch.
		axon_event.addListenerFormat ('beforeactivate', 'obj_activate', form);
		axon_event.addListenerForm ('beforedeactivate', 'obj_deactivate', form);
		axon_event.addListener('click', 'revType_click', 'chk_rev_type');
//		axon_event.addListener('keydown', 'ComKeyEnter', form);
		
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
	 * @version 2009.06.08
	 */
	function obj_activate() {
		// Removing mask separator.
		ComClearSeparator (ComGetEvent());
		ComGetEvent().select();
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
	 * @version 2009.06.08
	 */
	function obj_deactivate(){
		switch(ComGetEvent("name")){
			case "date_value":
				ComChkObjValid(ComGetEvent());
			break;
			case "port":
				ComChkObjValid(ComGetEvent());
			break;
        }
	}
	function revType_click() {
		var obj=ComGetEvent();
		doEnableRevType(obj);
	}
	function doEnableRevType(obj) {
		var formObj=document.form;
		// All (total)
		if(obj.value == 'A') {
			if(obj.checked) {
				ComEnableObject(formObj.chk_rev_type[1], false);	//	B/L
				ComEnableObject(formObj.chk_rev_type[2], false);	//	C/A
				ComEnableObject(formObj.chk_rev_type[3], false);	//	DEM/DET
				ComEnableObject(formObj.chk_rev_type[4], false);	//	Mis
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
				formObj.rev_type_A.value="";
				formObj.rev_type_B.value="B";
			} else {
				formObj.rev_type_B.value="";
			}
		}
		// C/A:C(REV_TP_CD = 'C')
		else if(obj.value == 'C') {
			if(obj.checked) {
				formObj.rev_type_A.value="";
				formObj.rev_type_C.value="C";
			} else {
				formObj.rev_type_C.value="";
			}
		}
		// DEM:D(REV_TP_CD = 'M' REV_SRC_CD = 'DT')
		else if(obj.value == 'D') {
			if(obj.checked) {
				formObj.rev_type_A.value="";
				formObj.rev_type_D.value="D";
			} else {
				formObj.rev_type_D.value="";
			}
		}
		// DEM:D(REV_TP_CD = 'M' REV_SRC_CD <> 'DT')
		else if(obj.value == 'M') {
			if(obj.checked) {
				formObj.rev_type_A.value="";
				formObj.rev_type_M.value="M";
			} else {
				formObj.rev_type_M.value="";
			}
		}
		formObj.rev_type.value=formObj.rev_type_A.value + formObj.rev_type_B.value + formObj.rev_type_C.value + formObj.rev_type_D.value + formObj.rev_type_M.value;
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
	 * @version 2009.06.08
	 */
	function doActionIBSheet(sheetObj,formObj,sAction) {
		var rtnStr="Delay Time \n"; 
		sheetObj.ShowDebugMsg(false);
		switch(sAction) {
			case IBSEARCH:      //retrieve
				if(validateForm(sheetObj,formObj,sAction)) {
					formObj.f_cmd.value=SEARCH;
					
					// OFFICE
					var viewBlSrcNo=formObj.view_bl_src_no.value;
					var viewArOfcCd=formObj.view_ar_ofc_cd.value;
					ComOpenWait(true);
					var sXml=sheetObj.GetSearchData("FNS_INV_0009GS.do", FormQueryString(formObj));
	     			var arrXml=sXml.split("|$$|");
	     			if(CoInvShowXmlMessage(arrXml[0]) != "") {
	     				var blSrcNo=formObj.bl_src_no.value;
	     				var arOfcCd=comboObjects[0].GetSelectText();
	     				var revType=formObj.rev_type.value;
	     				removeAll(formObj);
	     				formObj.bl_src_no.value=blSrcNo;
	     				comboObjects[0].SetSelectText(arOfcCd);
	     				formObj.rev_type.value=revType;
						if (revType.length > 0) {
							if (revType == "A") {
								ComEnableObject(formObj.chk_rev_type[1], false);
								ComEnableObject(formObj.chk_rev_type[2], false);
								ComEnableObject(formObj.chk_rev_type[3], false);
								ComEnableObject(formObj.chk_rev_type[4], false);
								formObj.chk_rev_type[0].checked=true;
								formObj.chk_rev_type[1].checked=false;
								formObj.chk_rev_type[2].checked=false;
								formObj.chk_rev_type[3].checked=false;
								formObj.chk_rev_type[4].checked=false;
							}
							else {
								ComEnableObject(formObj.chk_rev_type[1], true);
								ComEnableObject(formObj.chk_rev_type[2], true);
								ComEnableObject(formObj.chk_rev_type[3], true);
								ComEnableObject(formObj.chk_rev_type[4], true);
								if (revType.indexOf("B") > -1) {
									formObj.chk_rev_type[1].checked=true; 
									formObj.chk_rev_type[0].checked=false;
								}
								if (revType.indexOf("C") > -1) {
									formObj.chk_rev_type[2].checked=true; 
									formObj.chk_rev_type[0].checked=false;
								}
								if (revType.indexOf("D") > -1) {
									formObj.chk_rev_type[3].checked=true; 
									formObj.chk_rev_type[0].checked=false;
								}
								if (revType.indexOf("M") > -1) {
									formObj.chk_rev_type[4].checked=true; 
									formObj.chk_rev_type[0].checked=false;
								}
							}
						}
		     			
						ComOpenWait(false); 
						ComAlertFocus(formObj.bl_src_no, CoInvShowXmlMessage(arrXml[0]));
					} else {

						if (arrXml.length > 0) {
							var ar_ofc_cd_text="";
							var sStr=ComGetEtcData(arrXml[0],"ar_ofc_cd");
							if (sStr != null) {
								var arrStr=sStr.split("|");
								if (arrStr.length > 2) {
									document.getElementById('arOfcCdDiv1').style.display="none";
									document.getElementById('arOfcCdDiv2').style.display="block";
									MakeComboObject(comboObjects[0], arrStr);
									var arrStr2=arrStr[1].split("^");
									comboObjects[0].SetSelectText(arrStr2[0]);
								}
								else {
									var arrStr2=arrStr[1].split("^");
									comboObjects[0].SetSelectText(arrStr2[0]);
									document.getElementById('arOfcCdDiv1').style.display="block";
									document.getElementById('arOfcCdDiv2').style.display="none";
								}
							}
							var currPoint=ComGetEtcData(arrXml[0], "dp_prcs_knt");
							var lclCurrPoint=ComGetEtcData(arrXml[0], "dp_prcs_knt_local");
							var list=ComXml2ListMap(arrXml[0]);
							//retrieve condition save
							var blSrcNo="";
							var bkgNo="";
							var blTpCd="";
							var arOfcCd="";
							var revType="";
							var revTypeA="";
							var revTypeB="";
							var revTypeC="";
							var revTypeD="";
							var revTypeM="";
							if (list.length > 0) {
								var expensInfo=list[1];
								//if (expensInfo["act_cust_cnt_cd"] != '') {
									var vRevTpCd="";
									var vRevSrcCd=""; 
									//retrievecondition save
									blTpCd=formObj.bl_tp_cd.value;
									revType=formObj.rev_type.value;
									revTypeA=formObj.rev_type_A.value;
									revTypeB=formObj.rev_type_B.value;
									revTypeC=formObj.rev_type_C.value;
									revTypeD=formObj.rev_type_D.value;
									revTypeM=formObj.rev_type_M.value;
									ComMapToForm(formObj,expensInfo);
									formObj.bl_tp_cd.value=blTpCd;
									formObj.rev_type.value=revType;
									formObj.rev_type_A.value=revTypeA;
									formObj.rev_type_B.value=revTypeB;
									formObj.rev_type_C.value=revTypeC;
									formObj.rev_type_D.value=revTypeD;
									formObj.rev_type_M.value=revTypeM;
									if (revType.length > 0) {
										if (revType.indexOf("B") > -1) {
											formObj.chk_rev_type[1].checked=true; 
											formObj.chk_rev_type[0].checked=false;
										}
										if (revType.indexOf("C") > -1) {
											formObj.chk_rev_type[2].checked=true; 
											formObj.chk_rev_type[0].checked=false;
										}
										if (revType.indexOf("D") > -1) {
											formObj.chk_rev_type[3].checked=true; 
											formObj.chk_rev_type[0].checked=false;
										}
										if (revType.indexOf("M") > -1) {
											formObj.chk_rev_type[4].checked=true; 
											formObj.chk_rev_type[0].checked=false;
										}
									}
									else {
										formObj.chk_rev_type[0].checked=true;
										formObj.chk_rev_type[1].checked=false;
										formObj.chk_rev_type[2].checked=false;
										formObj.chk_rev_type[3].checked=false;
										formObj.chk_rev_type[4].checked=false;
									}
								//}
							}
						}
						formObj.dp_prcs_knt.value=currPoint;
						formObj.dp_prcs_knt_local.value=lclCurrPoint;
						if (comboObjects[0].GetSelectText() != '') {
							formObj.ar_ofc_cd_text.value=comboObjects[0].GetSelectText();
						}
						else {
							formObj.ar_ofc_cd_text.value=expensInfo["ar_ofc_cd"];
						}
						if (arrXml.length > 1) {
							sheetObjects[0] = sheetObjects[0].Reset();
							sheetObjects[3] = sheetObjects[3].Reset();
							initSheet(sheetObjects[0],1);
							initSheet(sheetObjects[3],4); // 메세지
//							sheetObjects[0].MessageText("Sum")="TTL LCL";
							sheetObjects[0].SetSumText(0,1, "TTL LCL");
							sheetObjects[0].LoadSearchData(arrXml[1],{Sync:1} );
							sheetObjects[3].LoadSearchData(arrXml[1],{Sync:1} );
							var invXchRt="";
							var invXchRtZero="";
							for (var i=1; i <= sheetObjects[0].rowCount; i++) {
								if("" == sheetObjects[0].cellValue(i,3)) {
									invXchRtZero="Y";
								}
							}
							if (invXchRtZero != "") {
								sheetObjects[0].SetSumValue(0, "local_total","");
							}
						}
						if (arrXml.length > 2) {
							sheetObjects[1] = sheetObjects[1].Reset();
							initSheet(sheetObjects[1],2); // 늘어남 
							sheetObjects[1].LoadSearchData(arrXml[2],{Sync:1} );
						}
						if (arrXml.length > 3) {
							sheetObjects[2] = sheetObjects[2].Reset();
							initSheet(sheetObjects[2],3);
							sheetObjects[2].LoadSearchData(arrXml[3],{Sync:1} );
						}
						if (arrXml.length > 4) {
							sheetObjects[4] = sheetObjects[4].Reset();
							sheet_container=sheetObjects[4];
							initSheet(sheetObjects[4],5);
							sheetObjects[4].LoadSearchData(arrXml[4],{Sync:1} );
						}
		     			ComOpenWait(false);
					}
	     			//ComOpenWait(false);
	     			resizeSheet();
				}
			break;
			case IBROWSEARCH:   //SYS CLEAR
				for ( var i=1; i <= sheetObj.RowCount(); i++) {
					if (sheetObj.GetCellValue(i, 14) == "Y") {
						if(sheetObj.GetRowHidden(i)) {
							sheetObj.SetRowHidden(i,0);
						}
						else {
							sheetObj.SetRowHidden(i,1);
						}
					}
				}
			break;
			case IBSEARCH_ASYNC11: // popup retrieve AR Office retrieve
				formObj.f_cmd.value=SEARCH01;
				var sXml=sheetObj.GetSearchData("FNS_INV_0009GS.do", FormQueryString(formObj), "", true);
				if(CoInvShowXmlMessage(sXml) != "") {
					ComAlertFocus(formObj.bl_src_no, CoInvShowXmlMessage(sXml));
				}
				else {
					var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
					var arrStr2=sStr.split("^");
					var ar_ofc_cd_text=arrStr2[0];
					var ar_ofc_cd_code=arrStr2[0];
					comboObjects[0].InsertItem(-1, ar_ofc_cd_text, ar_ofc_cd_code);
					comboObjects[0].SetSelectText(ar_ofc_cd_text);
					formObj.ar_ofc_cd_text.value=ar_ofc_cd_text;
					doActionIBSheet(sheetObj,formObj,IBSEARCH);
				}
			break;
			case IBDOWNEXCEL:  // Download excel.
//				sheetObj.Down2Excel({ HiddenColumn:-1});
				sheetObj.Down2Excel({DownCols: makeHiddenSkipCol(sheetObj), SheetDesign:1,Merge:1});
			break; 
		}
	}
		
	
	function t1sheet1_OnSearchEnd(sheetObj, Code , ErrMsg) {
    }

	function t1sheet2_OnSearchEnd(sheetObj, Code , ErrMsg) {
    }
	
	function t2sheet1_OnSearchEnd(sheetObj, Code , ErrMsg) {
		tab_init();
    }
	
	function t2sheet2_OnSearchEnd(sheetObj, Code , ErrMsg) {
		ComOpenWait(false); 
    }
	
	function sheet3_OnSearchEnd(sheetObj, Code , ErrMsg) {
		ComOpenWait(false); 
    }
		
	function textarea_write(msg){
		document.form.SEARCH_LOG.value=document.form.SEARCH_LOG.value+"\n"+msg;
	}
	
	function tab_init(){
		var current = tabObjects[0].GetSelectedIndex();
		if(current == 0){ 
			tab1_OnChange(tabObjects[0],1);
			tab1_OnChange(tabObjects[0],0);
		} else {
			tab1_OnChange(tabObjects[0],0); 
			tab1_OnChange(tabObjects[0],1);
		}
	}
	/**
	 * Register IBTab object on array.
	 * 
	 * Array define top on source.
	 */
	function setTabObject(tab_obj){
		tabObjects[tabCnt++]=tab_obj;
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
	 * @version 2009.06.08
	 */
	function validateForm(sheetObj,formObj,sAction){
		with(formObj){
			 if("" == bl_src_no.value && "" == bkg_no.value) {
				 ComShowCodeMessage("COM12114", "B/L No, BKG No");
				 bl_src_no.focus();
				 return false;
			 }
			 if(chk_rev_type[0].checked == false && chk_rev_type[1].checked == false && chk_rev_type[2].checked == false && chk_rev_type[3].checked == false && chk_rev_type[4].checked == false) {
				 chk_rev_type[0].checked=true;
				 chk_rev_type[1].checked=false;
				 chk_rev_type[2].checked=false;
				 chk_rev_type[3].checked=false;
				 chk_rev_type[4].checked=false;
				ComEnableObject(chk_rev_type[1], false);
				ComEnableObject(chk_rev_type[2], false);
				ComEnableObject(chk_rev_type[3], false);
				ComEnableObject(chk_rev_type[4], false);
			 }
		}
		return true;
	}
    /** 
     * When tab click, execute function. <br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  {IBTab} tabObj        
     * @param  {object} nItem        
     * @return none.
     * @see #
     * @author 
     * @version 2009.06.08
     */
	function tab1_OnChange(tabObj , nItem) {
		var objs=document.all.item("tabLayer");
		objs[beforetab].style.display="none";
		objs[nItem].style.display="Inline";
		objs[beforetab].style.zIndex=objs[nItem].style.zIndex -1 ;
		beforetab=nItem;
	    resizeSheet();
	}
    /** 
	 * Coding event for OnLoadFinish<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
     * @param {ibsheet} sheetObj required IBSheet Object        
     * @return none.
     * @see #
     * @author 
     * @version 2009.06.08
     */	  	
	function t1sheet1_OnLoadFinish(sheetObj){
		var formObj=document.form;
		var viewBlSrcNo=formObj.view_bl_src_no.value;
		var viewArOfcCd=formObj.view_ar_ofc_cd.value;
		removeAll(formObj);
		ComEnableObject(formObj.bl_src_no,true);
		ComEnableObject(formObj.bkg_no,true);
		formObj.bl_src_no.className="input1";
		formObj.bl_src_no.tabIndex="";
		formObj.bkg_no.className="input1";
		formObj.bkg_no.tabIndex="";
		comboObjects[0].SetEnable(1);
		ComBtnEnable("btn_t1new");
		ComBtnEnable("btn_t2new");
		ComBtnEnable("btn_retrieve");
		if (viewBlSrcNo != '' && viewArOfcCd != '') {
			ComEnableObject(formObj.bl_src_no,false);
			ComEnableObject(formObj.bkg_no,false);
			formObj.bl_src_no.className="input2";
			formObj.bl_src_no.tabIndex="-1";
			formObj.bkg_no.className="input2";
			formObj.bkg_no.tabIndex="-1";
			comboObjects[0].SetEnable(0);
			ComEnableObject(formObj.chk_rev_type[0], false);
			ComBtnDisable("btn_t1new");
			ComBtnDisable("btn_t2new");
			ComBtnDisable("btn_retrieve");
			formObj.bl_src_no.value=viewBlSrcNo;
			formObj.login_ofc_cd.value=viewArOfcCd;
			doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC11);
		}
		else {
			formObj.bl_src_no.focus();
		}
	}
    /** 
	 * When click cell, execute function. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {ibsheet} sheetObj    IBSheet Object
	 * @param {ibsheet} Row     	sheetObj's selected row
	 * @param {ibsheet} Col     	sheetObj's selected column
     * @return none.
     * @see #
     * @author 
     * @version 2009.06.08
     */
	function t2sheet1_OnDblClick(sheetObj, Row, Col) {
		var formObj=document.form;
		var arIfNo=ComReplaceStr(sheetObj.GetCellValue(sheetObj.GetSelectRow(), "ar_if_no"), " ", "");
		var invSplitCd=ComReplaceStr(sheetObj.GetCellValue(sheetObj.GetSelectRow(), "inv_split_cd"), " ", "");
		var arOfcCd="";
		
		var arOfcCd=formObj.ar_ofc_cd.value;		
		if (arOfcCd == '') {
			arOfcCd=formObj.ar_ofc_cd_text.value;
		}
		
		var classId="FNS_INV_0011";
		var param='?pgmNo=FNS_INV_0011-01&ar_if_no='+arIfNo+'&ar_ofc_cd='+arOfcCd+'&classId='+classId+'&inv_split_cd='+invSplitCd;

		ComOpenWindow('/opuscntr/FNS_INV_0011.do' + param, 'FNS_INV_0011', 'width=1230,height=700');
	}
	/** 
	 * ar_ofc_cd If combo box's value changed, initialize screen.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {IBMultiCombo} comboObj
     * @param {String} oldIndex
     * @param {String} oldText
     * @param {String} oldCode
     * @param {String} newIndex
     * @param {String} newText
     * @param {String} newCode
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.04.27
	 */
	function ar_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){ 
		var formObj=document.form;
		var firstView=false;
		if (formObj.office.value == '' && formObj.inv_dup_flg.value == '') {
			firstView=true;
		}
		else {
			firstView=false;
		}
		if (comboObjects[0].GetSelectText()!= '') {
			var arrStr2=comboObjects[0].GetSelectCode().split("^");
 			formObj.office.value=arrStr2[0];
 			formObj.inv_dup_flg.value=arrStr2[1];
 			if (!firstView) { 			
 				doActionIBSheet(sheetObjects[0],formObj,IBSEARCH);
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
	 * @version 2009.06.08
	 */
	function removeAll(formObj) {
		formObj.reset();
		document.getElementById('arOfcCdDiv1').style.display="block";
		document.getElementById('arOfcCdDiv2').style.display="none";
		tabObjects[0].SetSelectedIndex(0);
		ComEnableObject(formObj.chk_rev_type[1], false);
		ComEnableObject(formObj.chk_rev_type[2], false);
		ComEnableObject(formObj.chk_rev_type[3], false);
		ComEnableObject(formObj.chk_rev_type[4], false);
		sheetObjects[0].RemoveAll();
		sheetObjects[1].RemoveAll();
		sheetObjects[2].RemoveAll();
		sheetObjects[3].RemoveAll();
		sheetObjects[4].RemoveAll();
		comboObjects[0].RemoveAll();
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
	 * @version 2009.06.08
	 */
	function MakeComboObject(cmbObj, arrStr) {
		cmbObj.RemoveAll();
		for (var i=1; i < arrStr.length;i++ ) {
			var arrStr2=arrStr[i].split("^");
			var ar_ofc_cd=arrStr2[0];
			cmbObj.InsertItem(i-1, ar_ofc_cd, arrStr[i]);
		}
		//cmbObj.BackColor = "#CCFFFD";
	}
	/** 
	 * VoList => array[array[name]]<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param {xml} xmlStr 
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.06.08
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
	 * If array's name is equal to form's name, set value on form object.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param {form} form html 
	 * @param {map} Array[name] 
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.06.08
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
							case "cust_rgst_no":
								if (xvalue.length == 10) {
									form.elements[i].value=ComGetMaskedValue(xvalue, "saupja");
								}
								else {
									form.elements[i].value=xvalue;
								}
							break;
							default:
								form.elements[i].value=xvalue;
							break;
						}
						break;
				}
			}
			if(form.elements[i].name == 'ar_ofc_cd') {
				var xvalue=map[form.elements[i].name];
				$("#ar_ofc_cd_text").val(xvalue);
			}
		}
	}
	/** 
	 * If event completed, call parent window. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  none.  
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.06.08
	 */
	function getFNS_INV_0013() {
	}
	
	function resizeSheet(){
		ComResizeSheet(sheetObjects[0]);
		ComResizeSheet(sheetObjects[1]);
		ComResizeSheet(sheetObjects[2], 120);
	}
