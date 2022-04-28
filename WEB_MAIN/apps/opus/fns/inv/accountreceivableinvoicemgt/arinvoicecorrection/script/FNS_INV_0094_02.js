/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0094_02.js
*@FileTitle  : Invoice Customer Change(Single)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/04
=========================================================*/
	/**
	 * @extends 
	 * @class FNS_INV_0094_02 : FNS_INV_0094_02 Defining business script.
	 */
	function FNS_INV_0094_02() {
		this.processButtonClick=tprocessButtonClick;
		this.setSheetObject=setSheetObject;
		this.loadPage=loadPage;
		this.initSheet=initSheet;
		this.initControl=initControl;
		this.doActionIBSheet=doActionIBSheet;
		this.setTabObject=setTabObject;
		this.validateForm=validateForm;
	}
	// Global variables.
	var tabObjects=new Array();
	var tabCnt=0 ;
	var beforetab=0;
	var sheetObjects=new Array();
	var sheetCnt=0;
	//var rdObjects=new Array();
	//var rdCnt=0;
	var appendReport = [];
	var comboObjects=new Array();
	var comboCnt=0;
	//Defining button events. */
	document.onclick=processButtonClick;
	
	var cfmFlg = ""; //2018-04-30	
	var mmFlg = ""; //2018-04-30	
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
		var sheetObject2=sheetObjects[1];
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch(srcName) {
			case "btn_Retrieve":
				doActionIBSheet(sheetObject1,formObject,IBSEARCH);
				break;
			case "btn_New":
				comboObjects[0].RemoveAll();
				sheetObject1.RemoveAll();
				sheetObject2.RemoveAll();
				ComResetAll();
				doActionIBSheet(sheetObject1,document.form,IBSEARCH_ASYNC01);
				ComBtnDisable("btn_GotoSend");
				ComBtnDisable("btn_PaperIssue");
				ComBtnEnable("btn_Retrieve");
				ComBtnEnable("btn_Save");
				formObject.cnt_cd.readOnly=false;
				formObject.cust_cd.readOnly=false;
				formObject.act_cust_cnt_cd.readOnly=false;
				formObject.act_cust_seq.readOnly=false;
				formObject.inv_cust_cnt_cd.readOnly=false;
				formObject.inv_cust_seq.readOnly=false;
				formObject.iss_fm_dt.readOnly=false;
				formObject.iss_to_dt.readOnly=false;
				formObject.cnt_cd.className="input1";
				formObject.cust_cd.className="input1";
				formObject.act_cust_cnt_cd.className="input1";
				formObject.act_cust_seq.className="input1";
				formObject.inv_cust_cnt_cd.className="input1";
				formObject.inv_cust_seq.className="input1";
				formObject.iss_fm_dt.className="input1";
				formObject.iss_to_dt.className="input1";
				sheetObject1.SetEditable(1);
				formObject.cnt_cd.focus();
				checkTaxCountry();  // Whether or not the invoice tax country (2017.12.08)
				cfmFlg = ""; //2018-04-30	
				mmFlg = ""; //2018-04-30	
				break;
			case "btn_Save":
				doActionIBSheet(sheetObject1,formObject,IBSAVE);
				break;
			case "btn_actcust":
				var param='?pgmNo=FNS_INV_0013&cust_cnt_cd='+formObject.act_cust_cnt_cd.value+'&cust_seq='+formObject.act_cust_seq.value+'&pop_yn=Y';
				var Row=1;
				var Col=1;
				ComOpenPopup('/opuscntr/FNS_INV_0013.do'+param, 950, 700, '', '0,0', false, false, "", "", 0);
				break; 
			case "btn_invcust":
				var param='?pgmNo=FNS_INV_0013&cust_cnt_cd='+formObject.inv_cust_cnt_cd.value+'&cust_seq='+formObject.inv_cust_seq.value+'&pop_yn=Y';
				var Row=1;
				var Col=1;
				ComOpenPopup('/opuscntr/FNS_INV_0013.do'+param, 950, 700, '', '0,0', false, false, "", "", 0);
				break; 
			case "btn_custNm":
				param='?pgmNo=FNS_INV_0086&cust_seq='+formObject.act_cust_seq.value+'&cust_cnt_cd='+formObject.act_cust_cnt_cd.value;
				ComOpenPopup('/opuscntr/FNS_INV_0086.do' + param, 900, 400, 'getFNS_INV_0086_1', '1,0', false, false, Row, Col, 0);
				break;
			case "btn_invCustNm":
				param='?pgmNo=FNS_INV_0086&cust_seq='+formObject.inv_cust_seq.value+'&cust_cnt_cd='+formObject.inv_cust_cnt_cd.value;
				ComOpenPopup('/opuscntr/FNS_INV_0086.do' + param, 900, 400, 'getFNS_INV_0086_2', '1,0', false, false, Row, Col, 0);
				break;
			case "btn_PaperIssue":
				if(validateForm(sheetObject1,formObject,"IBSAVE")){
					var iCheckRow=sheetObject1.FindCheckedRow("sel");
					if (iCheckRow== "") {
						ComShowCodeMessage("COM12189");
						return false;
					}
					formObject.email_flag.value="N";
					setCustTargetYN();
					doActionIBSheet(sheetObjects[0],document.form,IBINSERT);
				}
				break;
			case "btn_GotoSend":
				var iCheckRow=sheetObject1.FindCheckedRow("sel");
				if (iCheckRow== "") {
					ComShowCodeMessage("COM12189");
					return false;
				}
				if(validateForm(sheetObjects[0],document.form,"")){
					var var_ar_ofc_cd=formObject.ar_ofc_cd2.value;
					//if (var_ar_ofc_cd == "DXBBB") {
					//	var arrRow=iCheckRow.split("|");
					//	var bl_nos="";
					//	for (idx=0; idx<arrRow.length-1; idx++) {
					//		bl_nos=bl_nos + "'"+ sheetObjects[0].GetCellValue(arrRow[idx], "bl_src_no") + "',";
					//	} 			    
					//	if (bl_nos != ""){
					//		bl_nos=bl_nos + "''";
					//	} 
					//	formObject.bl_nos.value=bl_nos;
					//	var arrStr2=comboObjects[0].GetSelectCode().split("^");
					//	formObject.svr_id.value=arrStr2[7]; 			    
					//	formObject.ots_smry_cd.value=arrStr2[13]; 	
					//	formObject.inv_dup_flg.value=arrStr2[14]; 
					//	formObject.inv_mlt_bl_iss_flg.value=arrStr2[15]; 	
					//	var param=FormQueryString(formObject);
					//	ComOpenWindowCenter("FNS_INV_0110.do?"+param, "pop", 730, 400);
					//}else{	
						formObject.email_flag.value="Y";
						setCustTargetYN();
						doActionIBSheet(sheetObjects[0],document.form,IBINSERT);
						var state=formObject.state.value;  
						var r_invs=formObject.inv_nos.value;  
						var arrStr2=comboObjects[0].GetSelectCode().split("^");
						formObject.ar_ofc_cd2.value=arrStr2[1];	
					//}
				} else {
					return;
				} 		
				break;
			case "btns_calendar":
				var cal=new ComCalendar();
				cal.select(formObject.iss_fm_dt,'yyyy-MM-dd');
				break;
			case "btns_calendar1":
				var cal=new ComCalendar();
				cal.select(formObject.iss_to_dt,'yyyy-MM-dd');
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
	 * registering IBMultiCombo Object as array <br>
	 * adding process for list in case of needing batch processing with other items  <br>
	 * defining list on the top of source <br>
	 */
	function setComboObject(combo_obj) {
	    comboObjects[comboCnt++]=combo_obj;
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
		for(k=0;k<tabObjects.length;k++){
			initTab(tabObjects[k],k+1);
			tabObjects[k].SetSelectedIndex(1);
		}
		for(i=0;i<sheetObjects.length;i++){
			ComConfigSheet (sheetObjects[i] );
			initSheet(sheetObjects[i],i+1);
			ComEndConfigSheet(sheetObjects[i]);
		}	
		initControl();
		//initRdConfig(rdObjects[0]);
		ComBtnDisable("btn_GotoSend");
		ComBtnDisable("btn_PaperIssue");
		tabObjects[0].SetSelectedIndex(1);
		doActionIBSheet(sheetObjects[0],document.form,IBSEARCH_ASYNC01); 
		
		checkTaxCountry();  // Whether or not the invoice tax country (2017.12.08)
		cfmFlg = ""; //2018-04-30	
		mmFlg = ""; //2018-04-30	
		
		form.cnt_cd.focus();
	}
	function initRdConfig(rdObject){
		var Rdviewer=rdObject ;
//		Rdviewer.SetSheetHeight(0);
//		Rdviewer.style.width=0;
//		Rdviewer.AutoAdjust=true;
//		Rdviewer.ViewShowMode(0);
//		Rdviewer.SetBackgroundColor(128,128,128);
//		Rdviewer.SetPageLineColor(128,128,128);
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
		var sheetID=sheetObj.id;
		var prefix = sheetID + "_";
		
		switch(sheetID) {
		case "sheet1":
		    with(sheetObj){
	       
	      var HeadTitle1="|Sel.|Invoice No.|INV Ref. No.|Issue Date|B/L No.|Invoice Cust.|VVD|POL|POD|Scope|Bound|Curr|Amount|Issue Curr";
	      var headCount=ComCountHeadTitle(HeadTitle1);
	      var rowCnt=0;

	      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );

	      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
	      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
	      InitHeaders(headers, info);

	      var cols = [ {Type:"Status",    Hidden:1, Width:00,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
	             {Type:"CheckBox",  Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"sel",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1 },
	             {Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:1,   SaveName:"inv_no",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"inv_ref_no",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
	             {Type:"Date",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"iss_dt",            KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:1,   SaveName:"bl_src_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"inv_cust_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:1,   SaveName:"vvd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"pol_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"pod_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"svc_scp_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"io_bnd_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"locl_curr_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
	             {Type:"Text",     Hidden:0,  Width:130,  Align:"Right",   ColMerge:0,   SaveName:"inv_ttl_locl_amt",  KeyField:0,   CalcLogic:"",   Format:"", 		  PointCount:0,   UpdateEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:"inv_curr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 } ];
	       
	      InitColumns(cols);

	      SetEditable(1);
	      SetEditableColorDiff(0);
	      SetWaitImageVisible(0);
	      //SetSheetHeight(300);
	      resizeSheet();
	            }


			break;		
		case "sheet2":
		    with(sheetObj){
	      
	      var HeadTitle1="|Select|ar_if_no|bnd|sa_dt|ofc_cd|gl_eff_dt|inv_no|bkg_no|sail_dt|rev_tp_cd|rev_src_cd|inv_curr_cd";
	      var headCount=ComCountHeadTitle(HeadTitle1);
	      var rowCnt=0;

	      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );

	      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
	      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
	      InitHeaders(headers, info);

	      var cols = [ {Type:"Status",    Hidden:1,  Width:00,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
			           {Type:"CheckBox",  Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"sel",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1 },
			           {Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:1,   SaveName:"ar_if_no",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
			           {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"bnd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
			           {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"sa_dt",            KeyField:0,   CalcLogic:"",   Format:"",         PointCount:0,   UpdateEdit:0 },
			           {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"ofc_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
			           {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"gl_eff_dt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
			           {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"inv_no",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
			           {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:"bkg_no",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
			           {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:"sail_dt",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
			           {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:"rev_tp_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
			           {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:"rev_src_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
			           {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:"inv_curr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 } ];
	       
	      InitColumns(cols);

	      SetEditable(1);
	      SetEditableColorDiff(0);
	      SetWaitImageVisible(0);
	      SetVisible(false);
	            }


			break;
		case "sheet3":           // CustomerListForIssue
		    with(sheetObj){		      
		      var HeadTitle1="|ACT_CUST_CNT_CD|ACT_CUST_SEQ|DEFAULT_INVOICE_CURRENCY|BL_SRC_NO|TARGET_YN";
		      
		      var headCount=ComCountHeadTitle(HeadTitle1) ;
		      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
		      var info    = { Sort:0, ColMove:1, HeaderCheck:0, ColResize:1 };
		      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
		      InitHeaders(headers, info);
		      var cols = [ {Type:"Status",    Hidden:1,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
			               {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"act_cust_cnt_cd",          KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"act_cust_seq",             KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"Text",      Hidden:0,  Width:200,  Align:"Center",  ColMerge:0,   SaveName:prefix+"dflt_inv_curr_div_cd",	    KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"bl_src_no",               	KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"target_yn",               	KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
			               
			               
			  InitColumns(cols);
			  SetEditable(1);
			  SetSheetHeight(200);
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
			//formObj.f_cmd.value=SEARCH02;
			formObj.f_cmd.value=SEARCH17;
	 		var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
			var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
			var arrStr=sStr.split("|");
			MakeComboObject2(comboObjects[0], arrStr);
			var arrStr2="";
			var var_ar_ofc_cd="";
			for(i=1;i<arrStr.length;i++){
				arrStr2=arrStr[i].split("^");
				if(arrStr2[1]==arrStr2[3]){
					var_ar_ofc_cd=arrStr2[1];
					ar_ofc_cd.SetSelectText(var_ar_ofc_cd);
					formObj.ofc.value=var_ar_ofc_cd;
					formObj.ofc_cd.value=formObj.ofc.value;	
					setOfcOtherInfo(arrStr2);
				}
			}
			ar_ofc_cd.SetSelectText(var_ar_ofc_cd);			
			
		break;
		case IBSEARCH:      //retrieve
			if(validateForm(sheetObj,formObj,sAction)){
				ComOpenWait(true);
				formObj.f_cmd.value=SEARCH;
	 			var sXml=sheetObj.GetSearchData("FNS_INV_0094_02GS.do" , FormQueryString(formObj));
				var arrXml=sXml.split("|$$|");
				if ( arrXml[0] != null)	{
					sheetObjects[0].LoadSearchData(arrXml[0],{Sync:1} );
				}
				if ( arrXml[1] != null)	{
					sheetObjects[1].LoadSearchData(arrXml[1],{Sync:1} );
				}
				formObj.act_cust_cnt_cd.value="";
				formObj.act_cust_seq.value="";
				formObj.cust_lgl_eng_nm.value="";
				ComOpenWait(false);
			}
		break;
		case IBSAVE:        //save
			if(validateForm(sheetObj,formObj,sAction)){

				var iCheckRow=sheetObj.FindCheckedRow("sel");
				var inRow=sheetObjects[1].RowCount();
				if (iCheckRow== "") {
					ComShowCodeMessage("COM12189");
					return false;
				}
				
				ComOpenWait(true);
				var arrRow=iCheckRow.split("|");
				for (i=1; i<= inRow; i++) {
					for (idx=0; idx<arrRow.length; idx++) {
						if(sheetObjects[1].GetCellValue(i, "inv_no")==sheetObj.GetCellValue(arrRow[idx], "inv_no")){
							sheetObjects[1].SetCellValue(i, "sel","1");
						}
					}
				}
				//formObj.f_cmd.value = MULTI;
				//sheetObj.DoSave("FNS_INV_0094_02GS.do", FormQueryString(formObj)+ "&" + ComSetPrifix(sheetObjects[1].GetSaveString(false,true,"sel"),"sheet2_") ,"");
				formObj.f_cmd.value=MULTI01;
	 			var sXml=sheetObj.GetSaveData("FNS_INV_0094_02GS.do",FormQueryString(formObj) + "&" + ComSetPrifix(sheetObjects[1].GetSaveString(false,true,"sel"),"sheet2_"));
				var backEndJobKey=ComGetEtcData(sXml, "BackEndJobKey")
				if(backEndJobKey.length > 0) {
					inputReadOnly(2);
					formObj.backendjob_key.value=backEndJobKey;
					sheetObj.SetWaitImageVisible(0);
					ComOpenWait(true);
					sheetObj.SetWaitTimeOut(10000);
					timer=setInterval(getMultiBackEndJobStatus, 3000);
				}	
			}
		break;
		case IBINSERT:      //input
			var iCheckRow=sheetObj.FindCheckedRow("sel");
			var arrRow=iCheckRow.split("|");
			if (iCheckRow== "") {
				ComShowCodeMessage("COM12189");
				return false;
			}
			var bl_nos="";
			for (idx=0; idx<arrRow.length-1; idx++) {
				bl_nos=bl_nos + "'"+ sheetObj.GetCellValue(arrRow[idx], "bl_src_no") + "',";
			} 			    
			if (bl_nos != ""){
				bl_nos=bl_nos + "''";
			} 
			formObj.bl_nos.value=bl_nos;
			var arrStr2=comboObjects[0].GetSelectCode().split("^");
			formObj.svr_id.value=arrStr2[7]; 			    
			formObj.ots_smry_cd.value=arrStr2[13]; 	
			formObj.inv_dup_flg.value=arrStr2[14]; 
			formObj.inv_mlt_bl_iss_flg.value=arrStr2[15]; 
			formObj.office_cnt_cd.value=arrStr2[6].substring(0,2);
			formObj.cust_cnt_cd.value="";
			formObj.cust_seq.value="";
			formObj.f_cmd.value=MULTI;
	 		//var sXml=sheetObj.GetSearchData("FNS_INV_0034_01GS.do", FormQueryString(formObj));
			
			var sParam1=ComGetSaveString(sheetObjects[2], true, true);
			if(sParam1 == "" ){
				ComShowCodeMessage("INV00097");
				return;
			}
	        
			var sParam = sParam1 +"&" +FormQueryString(formObj);
			
	        var sXml=sheetObj.GetSearchData("FNS_INV_0034_01GS.do", sParam, {Sync:1});
	        
			var arrXml=sXml.split("|$$|");
			var backEndJobKey=ComGetEtcData(arrXml[0], "BackEndJobKey")
			if(backEndJobKey.length > 0) {
				formObj.backendjob_key.value=backEndJobKey;
				sheetObj.SetWaitImageVisible(0);
				ComOpenWait(true);
				sheetObj.SetWaitTimeOut(10000);
				timer=setInterval(getBackEndJobStatus, 3000);
			}
			break;
		case IBSEARCH_ASYNC10: // Number of copy invoice retrieve
			var arrStr2=comboObjects[0].GetSelectCode().split("^");
			formObj.ar_ofc_cd2.value=arrStr2[1];
			formObj.f_cmd.value=SEARCH;
	 		var sXml=sheetObj.GetSearchData("FNS_INV_0034_01GS.do", FormQueryString(formObj));
			formObj.copy_cnt.value=ComGetEtcData(sXml,"copy_cnt");
			var sStr=ComGetEtcData(sXml,"inv_prn_dvc_nm");
			formObj.print_nm.value=sStr;
			break;
		case IBSEARCH_ASYNC20: // Tax country retrieve
			var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
			formObj.ar_ofc_cd2.value=arrStr2[1];
			formObj.f_cmd.value=SEARCH02;
	 		var sXml=sheetObj.GetSearchData("FNS_INV_0094_02GS.do", FormQueryString(formObj));
			var sStr=ComGetEtcData(sXml,"tax_cnt_flg");
			formObj.tax_cnt_flg.value=sStr;
			break;
		}
	}
	/**
	 * Register IBTab object on array.
	 * Array define top on source.
	 */
	function setTabObject(tab_obj){
		tabObjects[tabCnt++]=tab_obj;
	}
	/**
	 * Setting default values for tab.
	 * Setting tap's items.
	 */
	function initTab(tabObj , tabNo) {
		switch(tabNo) {
		case 1:
			with (tabObj) {
				var cnt=0 ;
					InsertItem( "Single" , "");
					InsertItem( "Multi" , "");
			}
			break;
		}
	}
	/**
	 * Tap click event.
	 * Activating selected tab.
	 */
	function tab1_OnChange(tabObj , nItem)
	{
		switch(nItem) {
		case 0:	
			//window.top.location.href = "/opuscntr/FNS_INV_0094_01.do?pgmNo=FNS_INV_0094";
			var url = "/opuscntr/FNS_INV_0094_01.do?pid=FNS_INV_M003&MENU=Y&pgmNo=FNS_INV_0094&parentPgmNo=FNS_INV_M001&main_page=true&mainMenuLinkFlag=true&menuflag=true&mainPage=true";
			window.top.location.href = url;
			break;
		case 1:				   			
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
			case IBSEARCH:        //retrieve	
				
				if( formObj.cnt_cd.value.trim() == "" || formObj.cust_cd.value.trim() == "" || formObj.iss_fm_dt.value.trim() == "" ) {
					ComShowCodeMessage("INV00004");
					formObj.cnt_cd.focus();
					return false;
				} 
				if (formObj.inv_curr_cd.value == "") {
		    		 ComShowCodeMessage("INV00004");
		             formObj.inv_curr_cd.focus();
		             return false;
		        }
				break;
			case IBSAVE:        //save
				if (formObj.inv_curr_cd.value == "") {
		    		 ComShowCodeMessage("INV00004");
		             formObj.inv_curr_cd.focus();
		             return false;
		        }
				if( (formObj.act_cust_cnt_cd.value.trim() == "" || formObj.act_cust_seq.value.trim() == "") &&
						(formObj.inv_cust_cnt_cd.value.trim() == "" || formObj.inv_cust_seq.value.trim() == "") ) {
					ComShowCodeMessage("INV00004");
					formObj.act_cust_cnt_cd.focus();
					return false;
				}
				break;
			}
		}     
		return true;
	}
	/**
	 * Dynamic loading for HTML control's event. <br>
	 * Initialize IBSheet object. <br>
	 * 
	 * @param {ibsheet}
	 *            sheetObj IBSheet Object
	 * @param {int}
	 *            sheetNo sheetObjects
	 */
	function initControl() {
		DATE_SEPARATOR="-";
		var formObject=document.form;
		axon_event.addListenerForm  ('beforedeactivate', 'obj_deactivate',  formObject);
		axon_event.addListenerFormat('beforeactivate',   'obj_activate',    formObject);
		axon_event.addListenerFormat('keypress', 'obj_KeyPress', formObject); // When entering keyboard.
		axon_event.addListener('keydown', 'ComKeyEnter', 'form');
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
	 * @version 2009.10.06
	 */
	function MakeComboObject2(cmbObj, arrStr) {
		cmbObj.RemoveAll();
		for (var i=1; i < arrStr.length;i++ ) {
			var arrStr2=arrStr[i].split("^");
			var var_ar_ofc_cd=arrStr2[1];
			cmbObj.InsertItem(i-1, var_ar_ofc_cd, arrStr[i]);			 
		}
		cmbObj.SetDropHeight(190);
	}
	/**
	 * Opening mail popup.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    open_email();
	 * </pre>
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function openEmail() {
		//ComOpenWindowCenter("FNS_INV_0034_02.do?issueGubn=I", "pop", 1010, 750);

		var ar_ofc_cd=document.form.ar_ofc_cd2.value;
		var invMltBlIssFlg=document.form.inv_mlt_bl_iss_flg.value;
		//2014.10.16 INV Form logic change by IY Cho
		var otsSmryCd = document.form.ots_smry_cd.value;
		var officeCntCd = document.form.office_cnt_cd.value;
		var taxCntFlg = document.form.tax_cnt_flg.value;

		ComOpenWindowCenter("FNS_INV_0034_02.do?issueGubn=I&invMltBlIssFlg="+invMltBlIssFlg+"&otsSmryCd="+otsSmryCd+"&officeCntCd="+officeCntCd+"&taxCntFlg="+taxCntFlg, "pop", 1010, 700);	

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
	 * @version 2009.10.06
	 */
	function getFNS_INV_0086_1(rowArray, row, col) {    	 
		var colArray=rowArray[0];	
		document.form.act_cust_cnt_cd.value=colArray[8];
		document.form.act_cust_seq.value=ComLpad(colArray[9], 6, '0');
		fn_act_cust_chg();
	}
	 /**
	 * Popup (FNS_INV_0086) After process, execute function.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    getFNS_INV_0086_2(rowArray, 1, 1);
	 * </pre>
	 * @param String rowArray
	 * @param number row
	 * @param number col
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function getFNS_INV_0086_2(rowArray, row, col) {    	 
		var colArray=rowArray[0];	
		document.form.inv_cust_cnt_cd.value=colArray[8];
		document.form.inv_cust_seq.value=ComLpad(colArray[9], 6, '0');
		fn_inv_cust_chg();
	}
	/**
	 * When change a act_cust_cnt_cd and act_cust_seq, execute function.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    fn_act_cust_chg();
	 * </pre>
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function fn_act_cust_chg(){
		fn_dueDate_chg();
		fn_cust_nm(); 
	}
	 /**
	 * When change a inv_cust_cnt_cd and a inv_cust_seq, execute function.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    fn_inv_cust_chg();
	 * </pre>
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function fn_inv_cust_chg(){
		if(form.inv_cust_seq.value!=''){
			form.inv_cust_seq.value=ComLpad(form.inv_cust_seq.value.trim(), 6, "0");
		}
		form.cust_cnt_cd.value=form.inv_cust_cnt_cd.value;
		form.cust_seq.value=form.inv_cust_seq.value;
		form.ofc_cd.value=form.ofc.value;
		document.form.f_cmd.value=SEARCH03;
		var cust_nm="";
		if ((form.cust_cnt_cd.value.trim() != "" )&&(form.cust_seq.value.trim() != "")&&(form.cust_seq.value.trim() != "000000")){
 			var sXml=sheetObjects[0].GetSearchData("INVCommonGS.do", FormQueryString(document.form));
			cust_nm=ComGetEtcData(sXml,"cust_eng_nm");
			delt_flg=ComGetEtcData(sXml,"delt_flg");
			if(delt_flg=='Y'){
				form.inv_cust_lgl_eng_nm.value="";
				form.inv_cust_seq.value="";
				form.cust_seq.value="";
				ComShowCodeMessage("INV00060");
				form.inv_cust_cnt_cd.focus();
				return;
			}
			if (cust_nm == undefined) {
				form.inv_cust_lgl_eng_nm.value="";
				form.inv_cust_seq.value="";
				ComShowCodeMessage("INV00008");
				form.inv_cust_cnt_cd.focus();
				return;   	    		  
			}else{	
				form.inv_cust_lgl_eng_nm.value=cust_nm;    
			}
			document.form.f_cmd.value=SEARCH01;
 			var sXml=sheetObjects[0].GetSearchData("FNS_INV_0094_02GS.do", FormQueryString(document.form));
			var repCustCnt=ComGetEtcData(sXml,"rep_cust_cnt");
			if(repCustCnt>0){
				form.inv_cust_lgl_eng_nm.value="";
				form.inv_cust_seq.value="";
				ComShowCodeMessage("INV00123");				
				form.inv_cust_cnt_cd.focus();
				return;
			}
		} else {
			form.inv_cust_lgl_eng_nm.value="";
		}
		
//JHJ 2018-07-09 start!
		if( document.form.cust_cnt_cd.value == "IN" && document.form.cust_seq.value != "") {
	    	//alert("indian OK.");		
			fn_cust_gst_no("INV");
	    }
//JHJ 2018-07-09 end!
		
	}
	
//JHJ 2018-07-09 start!
	/**
	 * In case indian invoice, get a selection tab's gst no by cust code.<br>
	 * fn_cust_gst_no()
	 * @author Hyun-Jae Jeong
	 */
	function fn_cust_gst_no(cust_type){
		//input Validation
		document.form.f_cmd.value=SEARCH03;
		var ida_gst_no_yn="";
		if ((document.form.cust_cnt_cd.value.trim() != "" )&&(document.form.cust_seq.value.trim() != "")&&(document.form.cust_seq.value.trim() != "000000")){

			var sXml=sheetObjects[0].GetSearchData("FNS_INV_0094_01GS.do", FormQueryString(document.form));

			ida_gst_no_yn=ComGetEtcData(sXml,"ida_gst_no_yn");
			//alert(ida_gst_no_yn);
			if(ida_gst_no_yn=='N'){	
				var gstCustCd = document.form.cust_cnt_cd.value+"-"+document.form.cust_seq.value;
				
			
				if(cust_type=="ACT"){
					document.form.cust_lgl_eng_nm.value="";	
					document.form.act_cust_seq.value="";	
					document.form.cust_seq.value="";
					ComShowCodeMessage("INV00182",gstCustCd);
					document.form.act_cust_cnt_cd.focus();					
				} else if(cust_type=="INV"){
					document.form.inv_cust_lgl_eng_nm.value="";	
					document.form.inv_cust_seq.value="";
					document.form.cust_seq.value="";
					ComShowCodeMessage("INV00182",gstCustCd);
					document.form.inv_cust_cnt_cd.focus();
				}
				
				return;
			}
		} else {
			if(cust_type=="ACT"){
				document.form.cust_lgl_eng_nm.value="";
			} else if(cust_type=="INV"){
				document.form.inv_cust_lgl_eng_nm.value="";
			}
		}
	}
//JHJ 2018-07-09 end!
	
	/**
	 * When change a cust_cd and a cust_seq, execute function.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    fn_cust_chg();
	 * </pre>
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function fn_cust_chg(){
		if(form.cust_cd.value!=''){
			form.cust_cd.value=ComLpad(form.cust_cd.value.trim(), 6, "0");
		}
		form.cust_cnt_cd.value=form.cnt_cd.value;
		form.cust_seq.value=form.cust_cd.value;
		form.ofc_cd.value=form.ofc.value;
		document.form.f_cmd.value=SEARCH03;
		var cust_nm="";
		if ((form.cnt_cd.value.trim() != "" )&&(form.cust_cd.value.trim() != "")&&(form.cust_cd.value.trim() != "000000")){
 			var sXml=sheetObjects[0].GetSearchData("INVCommonGS.do", FormQueryString(document.form));
			cust_nm=ComGetEtcData(sXml,"cust_eng_nm");
			if (cust_nm == undefined) {
				form.cust_nm.value="";
				form.cust_cd.value="";
				ComShowCodeMessage("INV00008");
				form.cnt_cd.focus();
				return;   	    		  
			}else{  	    	  
				form.cust_nm.value=cust_nm;
				form.cust_cnt_cd.value="";
				form.cust_seq.value="";
			}
		} else {
			form.cust_nm.value="";
		}

	}
	/**
	 * When change a act_cust_cnt_cd and a act_cust_seq, execute function.<br>
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function fn_cust_nm(){
		var cust_nm="";
		if ((form.cust_cnt_cd.value.trim() != "" )&&(form.cust_seq.value.trim() != "")&&(form.cust_seq.value.trim() != "000000")){
			document.form.f_cmd.value=SEARCH03;
 			var sXml=sheetObjects[0].GetSearchData("INVCommonGS.do", FormQueryString(document.form));
			cust_nm=ComGetEtcData(sXml,"cust_eng_nm");
			dfltInvCurrDivCd=ComGetEtcData(sXml,"dflt_inv_curr_div_cd");
			delt_flg=ComGetEtcData(sXml,"delt_flg");
			if(delt_flg=='Y'){
				form.cust_lgl_eng_nm.value="";
				form.act_cust_seq.value="";
				form.cust_seq.value="";
				ComShowCodeMessage("INV00060");
				form.act_cust_cnt_cd.focus();
				return;
			}
			if (cust_nm == undefined) {
				form.cust_lgl_eng_nm.value="";
				form.act_cust_seq.value="";
				ComShowCodeMessage("INV00008");
				form.act_cust_cnt_cd.focus();
				return;   	    		  
			}else{  	    	  
				form.cust_lgl_eng_nm.value=cust_nm;   
				form.dflt_inv_curr_div_cd.value=dfltInvCurrDivCd;
			}
			document.form.f_cmd.value=SEARCH01;
 			var sXml=sheetObjects[0].GetSearchData("FNS_INV_0094_02GS.do", FormQueryString(document.form));
			var repCustCnt=ComGetEtcData(sXml,"rep_cust_cnt");
			if(repCustCnt>0){
				form.cust_lgl_eng_nm.value="";
				form.act_cust_seq.value="";
				ComShowCodeMessage("INV00123");				
				form.act_cust_cnt_cd.focus();
				return;
			}
		} else {
			form.cust_lgl_eng_nm.value="";
		}
		
		
//JHJ 2018-07-09 start!
		if( document.form.cust_cnt_cd.value == "IN" && document.form.cust_seq.value != "") {
	    	//alert("indian OK.");		
			fn_cust_gst_no("ACT");
	    }
//JHJ 2018-07-09 end!
		
		document.form.f_cmd.value=SEARCH01;
	}    
	/**
	 * When change a act_cust_cnt_cd and a act_cust_seq, execute function.<br>
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function fn_dueDate_chg(){
		if(form.act_cust_seq.value!=''){
			form.act_cust_seq.value=ComLpad(form.act_cust_seq.value.trim(), 6, "0");
			//2015.08.20 같은 customer도 가능하도록 변경 by IY Cho
//			if( form.act_cust_cnt_cd.value == form.cnt_cd.value&&form.act_cust_seq.value==form.cust_cd.value){
//				ComShowCodeMessage("INV00031");
//				form.act_cust_cnt_cd.value="";
//				form.act_cust_seq.value="";
//				form.cust_lgl_eng_nm.value="";
//				form.act_cust_cnt_cd.focus();
//				return;
//			}
		}
		form.cust_cnt_cd.value=form.act_cust_cnt_cd.value;
		form.cust_seq.value=form.act_cust_seq.value;
		form.ofc_cd.value=form.ofc.value;
	}
	/**
	 * When change a af_ofc_cd data, execute function.<br>
	 * Setting office.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   ar_ofc_cd_OnChange(comboObj, oldindex, oldtext, oldcode, newindex, newtext, newcode);
	 * </pre>
	 * @param object comboObj
	 * @param string value
	 * @param string text
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */	
	function ar_ofc_cd_OnChange(comboObj, oldindex, oldtext, oldcode, newindex, newtext, newcode){ 
		sheetObjects[0].RemoveAll();
		sheetObjects[1].RemoveAll();
		arrStr=newcode.split("^");
		document.form.ofc.value=arrStr[1];
		document.form.ofc_cd.value=arrStr[1];
		//India GST 사용 목적
		document.form.office_cnt_cd.value=arrStr[6].substring(0,2);
		get_copy_cnt();
		setOfcOtherInfo(arrStr);
		
	    //inv_curr_cd setting
	    inv_curr_cd.RemoveAll();
	    var lclCurr = document.form.locl_curr_cd.value;
	    var altnCurr = document.form.altn_curr_div_cd.value;
	    
	    inv_curr_cd.InsertItem(0, lclCurr, lclCurr);
	    if(lclCurr != altnCurr && altnCurr != "" && altnCurr != "LCL" ) { 
	    	inv_curr_cd.InsertItem(1, altnCurr, altnCurr);
	    } else {
	    	inv_curr_cd.SetSelectText(lclCurr);
	    }
	    
	    checkTaxCountry();
	}
	/**
	 * Setting number of copy invoice. <br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   get_copy_cnt();
	 * </pre>
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */	
	function get_copy_cnt() {
		var sheetObject=sheetObjects[0];
		var formObject=document.form;		    
		doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC10);	    	
	}
	/**
	 * RD File open <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     rdOpen(Rdviewer, inv_no, line_num, user_nm, ofc_cd, logo, vvd, port_cd, attach, paperYn)
	 * </pre>
	 * @param {rdviewer} rdObject Rdviewer Object
	 * @param {String} inv_no Invoice number
	 * @param {String} line_num Description lile count 
	 * @param {String} user_nm
	 * @param {String} ofc_cd office code
	 * @param {String} logo
	 * @param {String} vvd vvd
	 * @param {String} port_cd port code
	 * @param {String} attach letter wording attach flag
	 * @param {String} paperYn print, email
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */ 
	function rdOpen(inv_no, line_num, user_nm, ofc_cd, logo, vvd, port_cd, attach, paperYn){
		//2014.10.16 INV Form logic change by IY Cho
		var formObj = document.form;
		var rdFile = "";
		var loginOfcCd = "";
		var rdParam = "";
		var issue_type = "";
		var ots_smry_cd = formObj.ots_smry_cd.value;
		var inv_mlt_bl_iss_flg = formObj.inv_mlt_bl_iss_flg.value;
		var office_cnt_cd = formObj.office_cnt_cd.value;
		var tax_cnt_flg = formObj.tax_cnt_flg.value;
		
		if(ots_smry_cd == "INV" || inv_mlt_bl_iss_flg=="N"){
			rdFile = "FNS_INV_0001.mrd";
		}else{
			rdFile = "FNS_INV_0003.mrd";
		}
		
		if(office_cnt_cd == "BR"){
			if(ots_smry_cd == "INV" || inv_mlt_bl_iss_flg=="N"){
				rdFile = "FNS_INV_0005.mrd";
			}else{
				rdFile = "FNS_INV_0004.mrd";
			}
//		}else if(office_cnt_cd == "FR"){
//			rdFile = "FNS_INV_0522.mrd";
		}else if(office_cnt_cd == "IN"){
			if(inv_no.length > 9){
				rdFile = "FNS_INV_0515.mrd"; // new India Invoice 2017.07.01
			}else{
				rdFile = "FNS_INV_0514.mrd"; // India 이전버전
			}
		}else if(office_cnt_cd == "TH"){
			rdFile = "FNS_INV_0540.mrd";
		}else if(office_cnt_cd == "VN"){
			rdFile = "FNS_INV_0531_SINGLE.mrd";
		}else if(office_cnt_cd == "KR"){
			//rdFile = "FNS_INV_0104.mrd";
			if(formObj.ar_ofc_cd2.value == 'PUSBB'){
				rdFile = "FNS_INV_0104.mrd";
			}
		}

//*********** JHJ 2018.01  START!  *************      
		if(tax_cnt_flg =="Y"){

			//if(office_cnt_cd == "DE" || office_cnt_cd == "CI" ){
			if(office_cnt_cd == "CI" ){
				//alert("Ivory Coast!!!-DE");
				rdFile = "FNS_INV_0101.mrd";
			} else if(office_cnt_cd == "MM" ){
				rdFile = "FNS_INV_0001.mrd";
			} else {
				rdFile = "FNS_INV_0102.mrd";
			}
			
			if(office_cnt_cd == "AE" ){	
				rdFile = "FNS_INV_0103.mrd";
				if(cfmFlg == "" ) {  //2018-04-30	
					if(ComShowCodeConfirm("INV00180")) {   //YES
						mmFlg = "Y";
					} else {						
						mmFlg = "";
					}
					cfmFlg = "Y";
				} 			
			}	
			
		}
//*********** JHJ 2018.01  END!  *************     	
		
		
		rdParam="/rv frm1_inv_no["+inv_no+"] frm1_logo["+logo+"] frm1_login_nm ["+user_nm+"] frm1_ofc_cd ["+ofc_cd+"] frm1_line_num ["+line_num+"] frm1_vsl_cd["+vvd.substr(0,4)+"] frm1_skd_voy_no["+vvd.substr(4,4)+"] frm1_skd_dir_cd["+vvd.substr(8,1)+"] frm1_port_cd ["+port_cd+"] frm1_att_gb ["+attach+"] frm1_paper_yn ["+paperYn+"] frm1_issue_type[] frm1_att_gb2[N] frm1_cust_cnt_cd[] frm1_cust_seq[] frm1_mm_flg["+mmFlg+"]";
		var rdUrl="apps/opus/fns/inv/accountreceivableinvoicemgt/invoiceissue/report/";	
		//Rdviewer.FileOpen(RD_path + rdUrl + rdFile, RDServer + rdParam + "/rpagenuminit [1] /riprnmargin /rwait");
		appendReport.push({mrdPath:RD_path + rdUrl + rdFile, mrdParam: RDServer + rdParam + "/rpagenuminit [1] /riprnmargin /rwait"});
	}    
	/**
	 * Setting masked value, After validating date.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   fn_ComGetMaskedValue('iss_fm_dt');
	 * </pre>
	 * @param String value
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function fn_ComGetMaskedValue(elNm) {
		var formObj;
		if (elNm == "iss_fm_dt") {
			formObj=form.iss_fm_dt;
		} else {
			formObj=form.iss_to_dt;
		}
		var value=formObj.value;
		if (value=='') return;
		value=ComReplaceStr(value,"-","");
		if (value.length < 8) {
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
		if (value.substring(6,8) > 31) {
			ComShowCodeMessage("INV00024");
			return;
		} 
		if (value.substring(6,8) == 00) {
			ComShowCodeMessage("INV00024");
			return;
		} 
		var ret=ComGetMaskedValue(value, "ymd")  ; 
		formObj.value=ret;
		if(elNm == "iss_fm_dt"){
			if(form.iss_to_dt.value==""){
				form.iss_to_dt.value=ret;
			}
			form.iss_to_dt.select(); 
		}
	}
	/**
	 * Moving focus by value length.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    checkCustLeng('cnt_cd');
	 * </pre>
	 * @param string value
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function checkCustLeng(elNm){
		var formObj;
		if (elNm == "cnt_cd") {
			formObj=form.cnt_cd;
		} else if (elNm == "act_cust_cnt_cd") {
			formObj=form.act_cust_cnt_cd;
		} else { 
			formObj=form.inv_cust_cnt_cd;
		}
		var value=formObj.value;
		if(value.length==2&&elNm == "cnt_cd"){
			form.cust_cd.focus();
		}else if(value.length==2&&elNm == "act_cust_cnt_cd"){
			form.act_cust_seq.focus(); 
		}else if(value.length==2&&elNm == "inv_cust_cnt_cd"){
			form.inv_cust_seq.focus(); 
		}
	}
	/**
	 * Moving focus by value length.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    checkCustLeng('20090901');
	 * </pre>
	 * @param string value
	 * @author Choi Do Soon
	 * @version 2009.11.10
	 */
	function checkFmDtLeng(value){    	  
		if( ComTrimAll(value," ", "-", ":").length==8){
			if(form.iss_to_dt.value==""){
				form.iss_to_dt.value=ComTrimAll(value," ", "-", ":");
			}
			form.iss_to_dt.select(); 
		}
	}
	/**
	 * Checking until BackEndJob's status become 3.<br>
	 *
	 * @return none.
	 * @see #doActionIBSheet
	 */
	 function getBackEndJobStatus() {
	    form.f_cmd.value=SEARCH02;
		var sXml=sheetObjects[0].GetSearchData("FNS_INV_0034_01GS.do", FormQueryString(form));
	    var arrXml=sXml.split("|$$|");
	    var jobState=ComGetEtcData(arrXml[0], "jb_sts_flg")
	    if(jobState == "3") {
	        clearInterval(timer);
	        ComBtnDisable("btn_PaperIssue");
			ComBtnDisable("btn_GotoSend");
	        getBackEndJobLoadFile();
	        ComOpenWait(false);
	    } else if(jobState == "4") {
	        clearInterval(timer);
	        // BackEndJob was failed
	 		var jbUsrErrMsg=getBackEndJobErrMsg( ComGetEtcData(sXml, "jb_usr_err_msg") ) ;
	 		if (jbUsrErrMsg != undefined && jbUsrErrMsg != '')
	 			ComShowMessage(jbUsrErrMsg);
	 		else
	 			ComShowCodeMessage("INV00136");
	 		ComOpenWait(false);
	    } else if(jobState == "5") {
	        clearInterval(timer);
	        // already read BackEndJob result file.
	        ComShowCodeMessage("INV00090");
	        ComOpenWait(false);
	    }
	}
	 
	 
	//get jb_usr_err_msg
	function getBackEndJobErrMsg(params) {
		var ary=params.split('<||>');
		return ary[ary.length-1];
	}
	
	
	/**
	 * After BackEndJob's complete, retrieving result.<br>
	 * 
	 * @return none.
	 * @see #getBackEndJobStatus
	 */
	function getBackEndJobLoadFile() {
		form.f_cmd.value=SEARCH03;
 		var sXml=sheetObjects[0].GetSearchData("FNS_INV_0034_01GS.do", FormQueryString(form));
		//alert(sXml);
		var arrXml=sXml.split("|$$|");
		if(arrXml.length > 0) {
			//sheetObjects[0].LoadSearchXml(arrXml[0]);
			form.backendjob_key.value="";
			var sStr=ComGetEtcData(sXml,"inv_nos");	
			//alert(sStr);
	//		if (sStr == "") {
	//		ComShowCodeMessage("INV00095");
	//		return;
	//		}	
			var sStr2=sStr.split("&");
			var arrStr=sStr2[0].split("|");
			if (arrStr.length > 1) {
				document.form.invoice_nos.value=arrStr;  //India New Invoice 때문에 추가
				document.form.f_inv.value=arrStr[0];	
				document.form.t_inv.value=arrStr[arrStr.length - 2];
				document.form.tot_inv_cnt.value=ComAddComma2(arrStr.length - 1, "#,###");
			} 				
			var state=ComGetEtcData(sXml,ComWebKey.Trans_Result_Key); 
			var r_invs=arrStr[0];  
			/*
					if (sStr2[1] != "") {
						ComShowCodeMessage("INV00096", sStr2[1]);
					} else if (r_invs == "") {
						ComShowCodeMessage("INV00097");
					}
			 */
			if (r_invs == "") {
				ComShowCodeMessage("INV00097");
				form.f_inv.value="";
				form.t_inv.value="";
				form.tot_inv_cnt.value="";
				return false;
			}
			if (state == "S" && r_invs != "") {	 						
				//alert(r_invs);
				var arrStr2=comboObjects[0].GetSelectCode().split("^");
				form.ar_ofc_cd2.value=arrStr2[1];	                    
				var v_f_inv=form.f_inv.value;
				var v_t_inv=form.t_inv.value;
				var arrStr3=sStr2[0].split("|");
				var v_copy_cnt=form.copy_cnt.value;  
				//alert(form.email_flag.value);
				if (form.email_flag.value == "N") {
					//rdObjects[0].SetAppendReport(1);
					for(var i=0; i<arrStr3.length -1; i++){
						//alert(arrStr3[i]);
						rdOpen(arrStr3[i], 15, form.user_nm.value, form.ar_ofc_cd2.value, "ORIGINAL", "", "", "N", "Y");
						for(var j=0; j<v_copy_cnt; j++) {  						
							rdOpen(arrStr3[i], 15, form.user_nm.value, form.ar_ofc_cd2.value, "COPY", "", "", "N", "Y");
						}
					}  
					//rdObjects[0].SetAppendReport(0);
					// Setting printer.
					//var print_nm=form.print_nm.value;
					//if(print_nm != ""){
					//	rdObjects[0].SetPrintInfo (print_nm, 1, 1, 4);
					//}
					//rdObjects[0].CMPrint (); // Starting printer.
					//viewer.openFile(appendReport, {timeout:3000});
					//viewer.print({isServerSide:true}); // Starting printer.
					directReportDownload(appendReport);
					appendReport = [];
				} else {
					openEmail();
				}
				cfmFlg = ""; //2018-04-30	
				mmFlg = ""; //2018-04-30	
			} 
		}
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
	  * Call function after opening popup. <br>
	  * <br><b>Example :</b>
	  * @param
	  * @return
	  * @author 
	  * @version 2009.10.20
	  */
	 function getFnsInv0110(){
		 document.form.email_flag.value="Y";
		 doActionIBSheet(sheetObjects[0],document.form,IBINSERT);
		 var state=document.form.state.value;  
		 var r_invs=document.form.inv_nos.value;  
		 var arrStr2=comboObjects[0].GetSelectCode().split("^");
		 document.form.ar_ofc_cd2.value=arrStr2[1];	
	 }
	  /**
	 * Checking until BackEndJob's status become 3.<br>
	 *
	 * @return none.
	 * @see #doActionIBSheet
	 */
	function getMultiBackEndJobStatus() {
		form.f_cmd.value=MULTI02;
 		var sXml=sheetObjects[0].GetSearchData("FNS_INV_0094_02GS.do", FormQueryString(form));
		var arrXml=sXml.split("|$$|");
		var jobState=ComGetEtcData(arrXml[0], "jb_sts_flg")
		if(jobState == "3") {
			clearInterval(timer);
			getMultiBackEndJobLoadFile();
			ComOpenWait(false);
			inputReadOnly(1);
		} else if(jobState == "4") {
			clearInterval(timer);
			ComShowCodeMessage("INV00089");
			ComOpenWait(false);
		} else if(jobState == "5") {
			clearInterval(timer);
			ComShowCodeMessage("INV00090");
			ComOpenWait(false);
			inputReadOnly(1);
		}
	}
	/**
	 * After BackEndJob's complete, retrieving result.<br>
	 * 
	 * @return none.
	 * @see #getBackEndJobStatus
	 */
	function getMultiBackEndJobLoadFile() {
		form.f_cmd.value=MULTI03;
 		var sXml=sheetObjects[0].GetSearchData("FNS_INV_0094_02GS.do", FormQueryString(form));
		var arrXml=sXml.split("|$$|");
		if(arrXml.length > 0) {
			if(ComGetEtcData(sXml,"TRANS_RESULT_KEY")=="S"){
				ComShowCodeMessage("INV00051");
			}
			form.backendjob_key.value="";
		}
	}
	/**
	 * Setting use object by condition.<br>
	 * 
	 * @param {int} flag
	 * @return none.
	 * @see #getBackEndJobStatus, #doActionIBSheet
	 */
	function inputReadOnly(flag) {
		if(flag == 1) {
			comboObjects[0].SetSelectText(document.form.ofc_cd.value);
			//if(ar_ofc_cd == "SZPBB" || ar_ofc_cd == "XMNBB" || ar_ofc_cd == "CANBS"){
			//	ComBtnDisable("btn_PaperIssue");
			//}else{
				ComBtnEnable("btn_PaperIssue");						
			//}
			ComBtnEnable("btn_GotoSend");
			ComBtnDisable("btn_Retrieve");
			ComBtnDisable("btn_Save");
			document.form.cnt_cd.readOnly=true;
			document.form.cust_cd.readOnly=true;
			document.form.act_cust_cnt_cd.readOnly=true;
			document.form.act_cust_seq.readOnly=true;
			document.form.inv_cust_cnt_cd.readOnly=true;
			document.form.inv_cust_seq.readOnly=true;
			document.form.iss_fm_dt.readOnly=true;
			document.form.iss_to_dt.readOnly=true;
			document.form.cnt_cd.className="input2";
			document.form.cust_cd.className="input2";
			document.form.act_cust_cnt_cd.className="input2";
			document.form.act_cust_seq.className="input2";
			document.form.inv_cust_cnt_cd.className="input2";
			document.form.inv_cust_seq.className="input2";
			document.form.iss_fm_dt.className="input2";
			document.form.iss_to_dt.className="input2";
			sheetObjects[0].SetEditable(0);
		}
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
	 	var formObject=document.form;
		formObject.ar_ofc_cd2.value=arrStr2[1];
		formObject.svr_id.value=arrStr2[7];     
		formObject.ots_smry_cd.value=arrStr2[13];   
		formObject.inv_dup_flg.value=arrStr2[14]; 
		formObject.inv_mlt_bl_iss_flg.value=arrStr2[15]; 	
		formObject.locl_curr_cd.value=arrStr2[4]; 
		formObject.altn_curr_div_cd.value=arrStr2[20]; 
		formObject.office_cnt_cd.value=arrStr2[6].substring(0,2);
	 }	 
	 
	 /**
	  * setCustTargetYN<br>
	  * @author CLT
	  * @version 2014.11.25
	  */
	 function setCustTargetYN() {
	 	var formObject=document.form;
	 	var sheetObj1 = sheetObjects[0];
	 	var sheetObj3 = sheetObjects[2];
	 	
	 	
	 	var prefix = sheetObj3.id + "_"; 	

	 	
	 	var custInfoMsg = "";
	 	var dfltInvCurr = "";
	 	
	 	sheetObj3.RemoveAll();
	 	
	 	var iCheckRow=sheetObj1.FindCheckedRow("sel");
	 	
		var inRow=sheetObjects[1].RowCount();
		if (iCheckRow== "") {
			return;
		}
		
		var inv_curr_cd = "";
		

		for (i=1; i<= sheetObj1.RowCount(); i++) {
				
			if(sheetObj1.GetCellValue(i, "sel") == "1") {
				
				inv_curr_cd = sheetObj1.GetCellValue(i, "inv_curr_cd")
				
				
				//old customer
				var row = sheetObj3.DataInsert(-1);
					
				sheetObj3.SetCellValue(row,prefix+"act_cust_cnt_cd",formObject.cnt_cd.value);
				sheetObj3.SetCellValue(row,prefix+"act_cust_seq",formObject.cust_cd.value);
				sheetObj3.SetCellValue(row,prefix+"dflt_inv_curr_div_cd",inv_curr_cd);
				sheetObj3.SetCellValue(row,prefix+"bl_src_no",sheetObj1.GetCellValue(i, "bl_src_no"));
				sheetObj3.SetCellValue(row, prefix + "target_yn", "Y");
				
				var oldCust = formObject.cnt_cd.value + formObject.cust_cd.value;
				var oldBl = sheetObj1.GetCellValue(i, "bl_src_no");
		 		var newCust = formObject.act_cust_cnt_cd.value + formObject.act_cust_seq.value;
		 		
		 		
		 		if ( oldCust != newCust && newCust != ""  ) {
					//new customer
					var row = sheetObj3.DataInsert(-1);
					
					sheetObj3.SetCellValue(row,prefix+"act_cust_cnt_cd",formObject.act_cust_cnt_cd.value);
					sheetObj3.SetCellValue(row,prefix+"act_cust_seq",formObject.act_cust_seq.value);
					sheetObj3.SetCellValue(row,prefix+"dflt_inv_curr_div_cd",formObject.dflt_inv_curr_div_cd.value);
					sheetObj3.SetCellValue(row,prefix+"bl_src_no",sheetObj1.GetCellValue(i, "bl_src_no"));
					
					dfltInvCurr = sheetObj3.GetCellValue(row, prefix + "dflt_inv_curr_div_cd");
					dfltInvCurr = (dfltInvCurr == "LCL") ? formObject.locl_curr_cd.value : dfltInvCurr;
					
					
					
					if ( inv_curr_cd != dfltInvCurr && dfltInvCurr != "" ) {
						custInfoMsg = "Customer : [" + sheetObj3.GetCellValue(row, prefix + "act_cust_cnt_cd") + "-" + ComLpad(sheetObj3.GetCellValue(row, prefix + "act_cust_seq"), 6, '0') + "]";
						custInfoMsg = custInfoMsg + " Invoice No. : [" + sheetObj1.GetCellValue(i, "inv_no") + "]";
						if (ComShowCodeConfirm("INV00137", custInfoMsg)) {
							sheetObj3.SetCellValue(row, prefix + "target_yn", "Y");
						} else {
							sheetObj3.SetCellValue(row, prefix + "target_yn", "N");
						}
						
					} else {
						sheetObj3.SetCellValue(row, prefix + "target_yn", "Y");
					}
		 		}
			}	
		}
		
		removeDupRows();
	 }
	 
	 function removeDupRows() {
		 
		 var sheetObj = sheetObjects[2];
		 var duprows1 = sheetObj.ColValueDupRows("2|3|4|5");

		  //가져온 행을 배열로 반든다.
		  var arrRow = duprows1.split(",");

		  var initTotRow = arrRow.length;
	    	
	      for(var idx=initTotRow; idx >= 1; idx-- ) {	//RowDelete 로 인한 영향으로 거꾸로 for 문 사용 
	    	  //alert(arrRow[idx-1] + "행"); 
			  sheetObj.RowDelete(arrRow[idx-1], 0);	
	      }


	 }

	 function resizeSheet(){
		 ComResizeSheet(sheetObjects[0],140);
	 }
	 
	 /**Tax Invoice Exemption (2017-12-08)*/
	 function fn_tax_exp_chk(){
	 	 if(document.form.tax_exp_chk.checked ){
	 		 document.form.tax_exp_flg.value = "Y";
	      }else{
	   	     document.form.tax_exp_flg.value = "N"; 
	      }
	 }
	 /**Check Tax Country HJ.Jeong (2017-12-08)*/
	 function checkTaxCountry() {

		 var sheetObject=sheetObjects[0];
		 var formObject=document.form;	 
		 doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20);
		 if(formObject.tax_cnt_flg.value == "Y") {
			 document.getElementById('tax_cnt_area').style.display="block";
		 } else{
			 document.getElementById('tax_cnt_area').style.display="none";
		 }

		 formObject.tax_exp_chk.checked = false;
		 formObject.tax_exp_flg.value = "N";

	 }