/**=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0122.js
*@FileTitle  : GSTR-1 Report
*@author     : CLT
*@version    : 1.0
*@since      : 2017/06/08
=========================================================**/

/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [retrieve]SEARCH=2; [리스트retrieve]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
    var sheetObjects=new Array();
    var sheetCnt=0;
	var comboObjects=new Array();
	var combo1=null;
	var comboCnt=0;
	document.onclick=processButtonClick;
	/** 
	 * event handler branch process by button name <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  none  
	 * @return none
	 * @see #
	 * @author 
	 * @version 
	 */
	function processButtonClick(){
		var sheetObj1=sheetObjects[0];
		var sheetObj2=sheetObjects[1];
		/*******************************************************/
		var formObj=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch(srcName) {
				case "btn_retrieve":
					doActionIBSheet(sheetObj1,formObj,IBSEARCH);
				break;
				case "btn_downExcel": 			
					if(sheetObj1.RowCount() < 1){//no data						
						ComShowCodeMessage("COM132501");
	        		 }else{
	        			sheetObj1.Down2Excel( {AutoSizeColumn :true,DownCols: makeHiddenSkipCol(sheetObj1), SheetDesign:1,Merge:1 });
	        		 }
				break;
				case "btns_calendar1": 
					var cal=new ComCalendar();
					cal.setDisplayType('date');
	             	cal.select(formObj.fm_dt, 'yyyy-MM-dd');
	            break;
				case "btns_calendar2": 
					var cal=new ComCalendar();
					cal.setDisplayType('date');
	             	cal.select(formObj.to_dt, 'yyyy-MM-dd');
	            break;
				case "btn_new":
		                removeAll(formObj);
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
	 * add IBSheet Object array <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj IBSheet Object
	 * @return none
	 * @see #
	 * @author 
	 * @version
	 */
	function setSheetObject(sheet_obj){
		sheetObjects[sheetCnt++]=sheet_obj;
	}
	/** 
	 * add comboObjects array IBCombo Object <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {IBMultiCombo} combo_obj    IBMultiCombo Object
	 * @return none
	 * @see #
	 * @author
	 * @version
	 */
	function setComboObject(combo_obj){
		comboObjects[comboCnt++]=combo_obj;
	}
    /** 
     * define onLoad event handler<br>
     * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author
	 * @version
	 */
	function loadPage() {
		for(i=0;i<sheetObjects.length;i++){
			ComConfigSheet (sheetObjects[i] );
			initSheet(sheetObjects[i],i+1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		//IBMultiCombo초기화
		for(var k=0; k<comboObjects.length; k++){
			initCombo(comboObjects[k],k+1);
		}
		
		doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC10);
//		MakeComboObject2(acct_cd);
		
//		sheet1_OnLoadFinish(sheetObjects[0]);
	}
	/** 
	 * initializing sheet, define header<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param sheetObj 
	 * @param sheetNo 
	 * @return none
	 * @see #
	 * @author
	 * @version
	 */
	function initSheet(sheetObj,sheetNo) {
		var cnt=0;
		switch(sheetNo) {
			case 1:      //sheet1 init
			    with(sheetObj){			        
			      var HeadTitle = "|Seq|GST Of ONE|Name of Taxpayer|Period\nMonth|Period\nYear|GSTIN of Customer|Name of the Customer|Invoice No|Original\nInvoice No|Original\nInvoice Date|Date|INV Amount|SAC|Taxable Value|IGST\nRate(%)|IGST Amount|CGST\nRate(%)|CGST Amount|SGST\nRate(%)|SGST Amount"
			    	            + "|BL Number|POS\n(Customer)|POS\n(ONE)|Bound\nCode|POR\nLocation\nCode|First\nPOL\nLocation|Last\nPOD\nLocation|DEL\nLocation\nCode|Trade\nCode|Actual\nCustomer\nSAP ID|Invoice\nCreate\nOffice|Actual\nCustomer\nName|Actual\nCustomer\nCode|VVD|Lane|SYS|SEZ\nStatus";
			      var headCount=ComCountHeadTitle(HeadTitle);
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"HidStatus" },
			                   {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"Seq" },
					           {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:1,   SaveName:"nyk_gst" },
					           {Type:"Text",      Hidden:0,  Width:190,  Align:"Center",  ColMerge:1,   SaveName:"nyk_name",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					           {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"period_month",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					           {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"period_year",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					           {Type:"Text",      Hidden:0,  Width:135,  Align:"Center",  ColMerge:1,   SaveName:"ida_gst_no",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					           {Type:"Text",      Hidden:0,  Width:220,  Align:"left",    ColMerge:1,   SaveName:"cust_lgl_eng_nm",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					           {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"inv_no",        	  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					           {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"dr_inv_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					           {Type:"Text",      Hidden:0,  Width:85,   Align:"Center",  ColMerge:1,   SaveName:"dr_iss_dt", 		  KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					           {Type:"Text",      Hidden:0,  Width:85,   Align:"Center",  ColMerge:1,   SaveName:"iss_dt", 			  KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					           {Type:"Text",      Hidden:0,  Width:100,  Align:"Right",   ColMerge:1,   SaveName:"inv_amt",  		  KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
					           {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"locl_chg_grp_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					           {Type:"Text",      Hidden:0,  Width:90,   Align:"Right",   ColMerge:1,   SaveName:"tax_bse_amt",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
					           {Type:"Text",      Hidden:0,  Width:60,   Align:"Right",   ColMerge:1,   SaveName:"inter_tax_rt",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
					           {Type:"Text",      Hidden:0,  Width:90,   Align:"Right",   ColMerge:1,   SaveName:"inter_tax_amt",     KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
					      	   {Type:"Text",      Hidden:0,  Width:60,   Align:"Right",   ColMerge:1,   SaveName:"cnt_tax_rt",        KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
					      	   {Type:"Text",      Hidden:0,  Width:90,   Align:"Right",   ColMerge:1,   SaveName:"cnt_tax_amt",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
					      	   {Type:"Text",      Hidden:0,  Width:60,   Align:"Right",   ColMerge:1,   SaveName:"ste_tax_rt",       	KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
					      	   {Type:"Text",      Hidden:0,  Width:90,   Align:"Right",   ColMerge:1,   SaveName:"ste_tax_amt",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
					      	   {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"bl_src_no",       	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					      	   {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"pos_cust",       	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					      	   {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"pos_nyk",       	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					      	   {Type:"Text",      Hidden:0,  Width:55,   Align:"Center",  ColMerge:1,   SaveName:"io_bnd_cd",       	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					      	   {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"por_cd",       		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					      	   {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"pol_cd",       		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					      	   {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"pod_cd",       		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					      	   {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"del_cd",       		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					      	   {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"trade_cd",       	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					      	   {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"sap_cd",	        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					      	   {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"iss_ofc_cd",       	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					      	   {Type:"Text",      Hidden:0,  Width:130,   Align:"Left",    ColMerge:1,   SaveName:"cust_nm",	        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					      	   {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"cust_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					      	   {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"vvd_cd",       		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					      	   {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"slan_cd",       	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					      	   {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"sys_nm",       	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					      	   {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"sez_flg",       	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }];
			      InitColumns(cols);
			      SetEditable(0);
			      SetWaitImageVisible(0);
			      SetSheetHeight(380);
			      resizeSheet();
				}
				break;
		}
	}
	/** 
	 * init combo box<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param {IBMultiCombo} comboObj  comboObj
	 * @return none
	 * @see #
	 * @author
	 * @version
	 */
	function initCombo(comboObj, comboNo) {
		switch (comboObj.id) {
			case "ar_ofc_cd":
				with (comboObj) {
					SetColAlign(0, "left");
					SetColWidth(0, "50");
					SetMultiSelect(0);
					SetUseAutoComplete(1);
					SetDropHeight(200);
					SetMaxLength(6);
				}
				break;
		}
	}

	/** 
	 * OnBeforeActivate event(on focus in)<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 
	 * @version
	 */
	function obj_activate() {
		ComClearSeparator(ComGetEvent());
	}

	/** 
	 * Onbeforedeactivate event (on focus out)<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 
	 * @version
	 */
	function obj_deactivate(){
		var sheetObject=sheetObjects[0];
		var formObj=document.form;
		switch(ComGetEvent().name){
			case "gl_eff_dt":
				ComChkObjValid(ComGetEvent());
			break;
			default:
				//Validation
				ComChkObjValid(ComGetEvent());
			break;
        }
	}
	/** 
	 * doActionIBSheet<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param  {IBSheet} sheetObj  
	 * @param  {object} formObj
	 * @param  {sAction} sAction 
	 * @param  {int} Row
	 * @param  {int} Col
	 * @param  {String}Val
	 * @return none
	 * @see #
	 * @author 
	 * @version
	 */
	
	function doActionIBSheet(sheetObj, formObj, sAction, CondParam, PageNo) {
		sheetObj.ShowDebugMsg(false);
		switch(sAction) {
			case IBSEARCH:      //retrieve
				ComOpenWait(true);
				if(validateForm(sheetObj,formObj,sAction)) {
					formObj.f_cmd.value=SEARCH;
					var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
		 			formObj.ofc_cd.value=arrStr2[1];
		 					 			
		 			sheetObj.DoSearch("FNS_INV_0122GS.do", FormQueryString(formObj) );
		 			 
				}else{
				ComOpenWait(false); 
				}
			break;
			case IBSEARCH_ASYNC10: //retrieve AR Office 
	 			formObj.f_cmd.value=SEARCH02; 	 			
	 			var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
	 			var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
	 			var arrStr=sStr.split("|");
	 			var arrStr2=arrStr[1].split("^");
	 			var office_cnt_cd="";
	 			//office
	 			
	 			MakeComboObject(ar_ofc_cd, arrStr);
	 			for (var i=0; i < arrStr.length; i++) {
	 				var arrStr3=arrStr[i].split("^");
		 			if (arrStr3[1] == ar_ofc_cd) {
		 				office_cnt_cd=arrStr3[6].substring(0,2);
		 			}
	 			}
	 			var ar_ofc_cd_text = "";
	 			ar_ofc_cd_text=arrStr2[3];
				ar_ofc_cd.SetSelectText(ar_ofc_cd_text);
			break;
		}
	}
	/** 
	 * validateForm <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj  
	 * @param  {object} formObj 
	 * @param  {sAction} sAction 
	 * @return true, false
	 * @see #
	 * @author 
	 * @version
	 */
	function validateForm(sheetObj,formObj,sAction){
    	switch(sAction) {
		case IBSEARCH:      //Retrieve
			with(formObj){
				if(fm_dt.value == "") {
					ComShowCodeMessage("INV00004");
					fm_dt.focus();
					return false;
				}
				if(to_dt.value == "") {
					ComShowCodeMessage("INV00004");
					to_dt.focus();
					return false;
				}

			}
			if(ar_ofc_cd.GetSelectText() == "") {
				 ComShowCodeMessage("COM12114", "Office");
				 //ar_ofc_cd.focus();
				 return false;
			 }
    	}
		return true;
	}
    /** 
	 * handling OnLoadFinish event<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
     * @param {ibsheet} sheetObj        
     * @return none
     * @see #
     * @author
     * @version
     */	  	
	function sheet1_OnLoadFinish(sheetObj){
		initControl();
		doActionIBSheet(sheetObj, document.form, IBSEARCH_ASYNC10);
	}

	/** 
	 * office code select box <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {IBMultiCombo} comboObj  
	 * @param  {Array} arrStr
	 * @return none
	 * @see #
	 * @author 
	 * @version
	 */
	function MakeComboObject(cmbObj, arrStr) {
		cmbObj.RemoveAll();
		 j = 0;
		for (var i=1; i < arrStr.length;i++ ) {
               
			var arrStr2=arrStr[i].split("^");
			var ar_ofc_cd_text=arrStr2[1];
			var ofc_cnt_cd = arrStr2[6].substring(0,2);
		    if(ofc_cnt_cd == "IN"){
			    cmbObj.InsertItem(j, ar_ofc_cd_text, arrStr[i]);
			    j = j+1 ;
		    }
		}
		cmbObj.InsertItem(0, "All", "ALL^");
		cmbObj.SetBackColor("#CCFFFD");
	}
	/** 
	 * init UI when ar_ofc_cd changed.<br>
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
	 * @return none
	 * @see #
	 * @author 
	 * @version
	 */
    function ar_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){
    	var formObject=document.form;
    	var expensInfo1=newCode.split("^");
    	ComSetObjValue(formObject.ofc_cd,expensInfo1[1]);
    }


	/** 
	 * init UI<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {object} formObj  
	 * @return none
	 * @see #
	 * @author 
	 * @version
	 */
	function removeAll(formObj) {
		formObj.reset();
		sheetObjects[0].RemoveAll();
		doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC10);
	}
	
	function resizeSheet(){
		ComResizeSheet(sheetObjects[0]);
	}
	function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) {
		ComOpenWait(false); 
	}