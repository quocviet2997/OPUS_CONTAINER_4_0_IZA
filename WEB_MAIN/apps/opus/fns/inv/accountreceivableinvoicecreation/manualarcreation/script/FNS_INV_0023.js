/**=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0023.js
*@FileTitle  : Other Revenue Invoice Inquiry
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/14
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
	 * @author 박정진
	 * @version 2009.10.20
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
				case "btn_new":					
					sheetObj1.RemoveAll();
//					cpntClear();
					ComResetAll();
					ar_ofc_cd.SetSelectText(ar_ofc_cd_text);
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
				case "btns_cust1": //CUST retrieve button
					var v_act_cust_cnt_cd=formObj.act_cust_cnt_cd.value;
					var v_act_cust_seq=formObj.act_cust_seq.value;
					var classId="FNS_INV_0013";
					var param='?cust_cnt_cd='+v_act_cust_cnt_cd+'&cust_seq='+v_act_cust_seq+'&pop_yn=Y&classId='+classId;
					ComOpenWindow('/opuscntr/FNS_INV_0013.do' + param, 'getFNS_INV_0013', 'width=1000,height=680');
				break;
				case "btns_cust2": //CUST retrieve button
					var v_act_cust_cnt_cd= formObj.act_cust_cnt_cd.value;
					var classId="FNS_INV_0086";
					var v_cust_nm = "";
					// v_cust_nm = sheetObj1.UrlEncoding(formObj.cust_nm.value) ;
					var param='?cust_cnt_cd='+v_act_cust_cnt_cd+'&cust_lgl_eng_nm='+v_cust_nm+'&pop_yn=Y&classId='+classId;
					ComOpenPopup('/opuscntr/FNS_INV_0086.do' + param, 900, 450, 'getFNS_INV_0086', '1,0', false, false);
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
	 * @author 박정진
	 * @version 2009.04.27
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
	 * @author 박정진
	 * @version 2009.04.27
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
	 * @author 박정진
	 * @version 2009.04.27
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

		initControl();

		doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC10);
		//MakeComboObject2(acct_cd);

		doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC04);

		sheet1_OnLoadFinish(sheetObjects[0]);
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
	 * @author 박정진
	 * @version 2009.04.27
	 */
	function initSheet(sheetObj,sheetNo) {
		var cnt=0;
		switch(sheetNo) {
			case 1:      //sheet1 init
			    with(sheetObj){			        
			      var HeadTitle="|Seq|Office|G/L Date|Creation Date|Slip No|CR Acct|B/L No|I/F No|Actual Cust|Cur|Amount|Description|User ID|User Name";
			      var headCount=ComCountHeadTitle(HeadTitle);
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"HidStatus" },
			             {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"Seq" },
			             {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:"ar_ofc_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"gl_eff_dt",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"cre_dt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:140,  Align:"Center",  ColMerge:1,   SaveName:"slp_no",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"acct_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"bl_src_no",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"ar_if_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"act_cust_cnt_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"curr_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:100,  Align:"Right",   ColMerge:1,   SaveName:"chg_amt",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",    ColMerge:1,   SaveName:"chg_rmk",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:85,   Align:"Center",  ColMerge:1,   SaveName:"cre_usr_id",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"usr_nm",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
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
	 * @author 박정진
	 * @version 2009.04.27
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
			case "acct_cd":
				with (comboObj) {
					SetMultiSelect(0);
					SetDropHeight(200);
				}
				break;
		}
	}
	/** 
	 * define onLoad event handler <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.04.27
	 */
	function initControl() {
		var formObj=document.form;
		// axon_event.addListenerFormat ('keypress', 'obj_keypress', form);
		// axon_event.addListenerForm ('focus', 'obj_activate', form);
		// axon_event.addListenerForm ('keyup', 'obj_keyup', form);
		// axon_event.addListenerForm ('blur', 'obj_deactivate', form);
		axon_event.addListenerForm ('focusout', 'obj_focusout', formObj);
	}
	
	
	function obj_focusout() {
	    var sheetObject=sheetObjects[0];
	    var formObject=document.form;
	    var v_tmp="";
	    switch(ComGetEvent("name")){
	        case "act_cust_seq":
				if (formObject.act_cust_seq.value.length != 0 && formObject.act_cust_seq.value.length < 7) {
					for(i=0; i < 6 - formObject.act_cust_seq.value.length; i++){
						v_tmp=v_tmp + "0";
					}
					document.form.act_cust_seq.value=v_tmp+formObject.act_cust_seq.value;
				}	            	
	            if (formObject.act_cust_cnt_cd.value != '' && formObject.act_cust_seq.value) {
	                doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20);
	            }
	        break;
	    }
	}		
	/** 
	 * OnKeyPress event <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.04.27
	 */
//	function obj_keypress() {
//		switch(ComGetEvent().dataformat){
//			case "float":
//				ComKeyOnlyNumber(ComGetEvent(), "."); 
//			break;
//			case "int":
//				ComKeyOnlyNumber(ComGetEvent()); 
//			break;
//			case "engup":
//				switch(ComGetEvent().name){
//					case "slp_no":	
//						//upper case+number
//						ComKeyOnlyAlphabet('uppernum'); 
//					break;
//					case "ar_if_no":	
//						//upper case+number
//						ComKeyOnlyAlphabet('uppernum'); 
//					break;
//					case "act_cust_cnt_cd":	
//						//upper case only		    	        
//						ComKeyOnlyAlphabet('upper'); 
//					break;
//					case "port":	
//						//upper case only		    	        
//						ComKeyOnlyAlphabet('upper'); 
//					break;
//				}
//			break;
//	        case "num":
//	        	//number only
//	            ComKeyOnlyNumber('num');
//            break;
//			default:
//				//number only
//				ComKeyOnlyNumber(ComGetEvent());
//		}
//	}
	/** 
	 * OnBeforeActivate event(on focus in)<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.04.27
	 */
	function obj_activate() {
		ComClearSeparator(ComGetEvent());
	}
	/** 
	 * HTML Control KeyUp event<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.04.27
	 */
//	function obj_keyup() {
//		var formObj=document.form;
//		switch (ComGetEvent().name) {
//			case "fm_dt":
//				var fmDt=ComReplaceStr(ComGetEvent().value,"-","");
//				if (fmDt.length == 8) {
//					formObj.to_dt.focus();
//				}
//	 		break;
//			case "act_cust_cnt_cd":
//				var custCntCd=ComGetEvent().value;
//				if (custCntCd.length == 2) {
//					formObj.act_cust_seq.focus();
//				}
//	 		break;
//		}
//	}
	/** 
	 * Onbeforedeactivate event (on focus out)<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.04.27
	 */
	function obj_deactivate(){
		var sheetObject=sheetObjects[0];
		var formObj=document.form;
		switch(ComGetEvent().name){
			case "gl_eff_dt":
				ComChkObjValid(ComGetEvent());
			break;
			case "act_cust_seq":
				if (formObj.act_cust_cnt_cd.value != '' && formObj.act_cust_seq.value != '') {
					var valueCustSeq=formObj.act_cust_seq.value;
					formObj.act_cust_seq.value=ComLpad(valueCustSeq,6,"0");
					doActionIBSheet(sheetObject,formObj,IBSEARCH_ASYNC20);
				}
				else {
					formObj.cust_nm.value='';
				}
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
	 * @author 박정진
	 * @version 2009.04.27
	 */
	var ar_ofc_cd_text = "";
	function doActionIBSheet(sheetObj, formObj, sAction, CondParam, PageNo) {
		sheetObj.ShowDebugMsg(false);
		switch(sAction) {
			case IBSEARCH:      //retrieve
				if(validateForm(sheetObj,formObj,sAction)) {
					formObj.f_cmd.value=SEARCH;
					var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
		 			formObj.office.value=arrStr2[1];
		 			ComOpenWait(true); 		 			
		 			sheetObj.DoSearch("FNS_INV_0023GS.do", FormQueryString(formObj) );
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
	 			ar_ofc_cd_text=arrStr2[3];
				ar_ofc_cd.SetSelectText(ar_ofc_cd_text);
			break;
			case IBSEARCH_ASYNC20: // customer name retrieve
				var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
				formObj.office.value=arrStr2[1];
				formObj.f_cmd.value=SEARCH03;
				var actCustCntCd=formObj.act_cust_cnt_cd.value;
				var actCustSeq=formObj.act_cust_seq.value; 				
				var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj)+"&cust_cnt_cd="+actCustCntCd+"&cust_seq="+actCustSeq);
				var cust_nm=ComGetEtcData(sXml,"cust_eng_nm");    
				if (cust_nm != undefined) {
					formObj.cust_nm.value=cust_nm;
				} else {
					formObj.cust_nm.value="";
				}
			break;
			case IBSEARCH_ASYNC04: // get account code list from AR account matrix.
				formObj.f_cmd.value=SEARCH01;
				var sXml = sheetObj.GetSearchData("FNS_INV_0023GS.do", FormQueryString(formObj));
				
				var arrXml = sXml.split("|$$|");
				var acctCdList = ComGetEtcData(arrXml[0],"acctCdList");
				var arrStr = acctCdList.split("|");
				//alert(arrStr);
				MakeComboObject2(acct_cd, arrStr);

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
	 * @author 박정진
	 * @version 2009.04.27
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
     * @author 박정진
     * @version 2009.04.27
     */	  	
	function sheet1_OnLoadFinish(sheetObj){
		initControl();
		doActionIBSheet(sheetObj, document.form, IBSEARCH_ASYNC10);
		//MakeComboObject2(acct_cd);
	}
	/**
	 * handling cell click event <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {ibsheet} sheetObj 
	 * @param {ibsheet} Row     
	 * @param {ibsheet} Col     
     * @return none
     * @see #
     * @author 박정진
     * @version 2009.04.27
	 **/
	function sheet1_OnDblClick(sheetObj, Row, Col) {
	   	var formObj=document.form;
	   	var arIfNo=ComReplaceStr(sheetObj.GetCellValue(sheetObj.GetSelectRow(), "ar_if_no"), ",", "");
	   	var arOfcCd=ComReplaceStr(sheetObj.GetCellValue(sheetObj.GetSelectRow(), "ar_ofc_cd"), ",", "");
		//var arOfcCd = formObj.ar_ofc_cd.text;
		var classId="FNS_INV_0022";
		var param='?pgmNo=FNS_INV_0022&ar_if_no='+arIfNo+'&ar_ofc_cd='+arOfcCd+'&classId='+classId;
//		ComOpenWindow('/opuscntr/FNS_INV_0022_01.do' + param, 'FNS_INV_0022', 'width=1100,height=600');
		ComOpenPopup('/opuscntr/FNS_INV_0022_01.do' + param, 1100, 750, 'FNS_INV_0022', '1,0,1,1,1', false, false);
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
	 * @author 박정진
	 * @version 2009.04.27
	 */
	function MakeComboObject(cmbObj, arrStr) {
		cmbObj.RemoveAll();
		for (var i=1; i < arrStr.length;i++ ) {
			var arrStr2=arrStr[i].split("^");
			var ar_ofc_cd_text=arrStr2[1];
			cmbObj.InsertItem(i-1, ar_ofc_cd_text, arrStr[i]);
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
	 * @author 박정진
	 * @version 2009.12.01
	 */
    function ar_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){
    	var formObject=document.form;
    	var expensInfo1=newCode.split("^");
    	ComSetObjValue(formObject.office,expensInfo1[1]);
    }
	/** 
	 * account code select box <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {IBMultiCombo} comboObj  
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.04.27
	 */
	function MakeComboObject2(cmbObj, arrStr) {
   		cmbObj.RemoveAll();
   		cmbObj.SetColAlign(0, "center");
   		cmbObj.SetColAlign(1, "left");
		cmbObj.SetColWidth(0, "65");
		cmbObj.SetColWidth(1, "310");
		cmbObj.InsertItem(0, "ALL | ALL", "ALL" );
  		for (var i = 0; i < arrStr.length;i++ ) {
  			if(arrStr[i] != ""){
  				var acctCdList = arrStr[i].split("▶");
   				cmbObj.InsertItem(i+1, acctCdList[0]+'|'+acctCdList[1], arrStr[i] );
  			}
  		}
  		cmbObj.SetDropHeight(190);

		
		/* Hard Coding Account Code 제거. 2017.08.18 HJJEONG */
		/* 
		cmbObj.RemoveAll();
		var formObj=document.form;
    	var officeCntCd=formObj.office_cnt_cd.value;
	    var sTextKr=" \t \t "
	    	        +"|ALL\tALL"
	    	        +"|411911\tMIS. REVENUE(CNTR)-EQ RENTAL\t부대수입-컨테이너-EQ Rental"
			        +"|411531\tNON SHIPPING REVENUE-BUILDING RENTAL INCOME\t비해운수입-임대수입"
			        +"|411591\tNON SHIPPING REVENUE-OTHERS\t비해운수입-기타"
			        +"|411541\tNON SHIPPING REVENUE-PERSON SERVICE\t비해운수입-용역수입"
			        +"|411915\tMIS. REVENUE(CNTR)-OTHER\t부대수입-겉네이너-OTHER"
			        +"|212111\tV.A.T RECEIVED\t예수부가가치세"
			        +"|957112\tCLEARING AR AND FA FOR RETIREMENT\t정산-유형자산처분(AR/FA)"
			        +"|954111\tCLEARING AR AND AP\t정산-채권채무상계(AR/AP)"
			        +"|712911\tMIS.INCOME\t잡이익"
			        +"|422011\tMIS.INCOME\t잡이익";
		var sText=" \t "
			        +"|ALL\tALL"
			        +"|411911\tMIS. REVENUE(CNTR)-EQ RENTAL"
			        +"|411531\tNON SHIPPING REVENUE-BUILDING RENTAL INCOME"
			        +"|411591\tNON SHIPPING REVENUE-OTHERS"
			        +"|411541\tNON SHIPPING REVENUE-PERSON SERVICE"
			        +"|411915\tMIS. REVENUE(CNTR)-OTHER"
			        +"|212111\tV.A.T RECEIVED"
			        +"|957112\tCLEARING AR AND FA FOR RETIREMENT"
			        +"|954111\tCLEARING AR AND AP"
			        +"|712911\tMIS.INCOME"
			        +"|422011\tMIS.INCOME";
    	var comboVal="||411911|411531|411591|411541|411915|212111|957112|954111|712911|422011";
		var comboTxt="";
		//2015.05.14 Remove KR,HQ hardcoding by IY Cho
		cmbObj.SetColAlign(0, "left");
		cmbObj.SetColAlign(1, "left");
		cmbObj.SetColWidth(0, "65");
		cmbObj.SetColWidth(1, "310");
		comboTxt=sText;
		var arrTxt=comboTxt.split("|");
		var arrVal=comboVal.split("|");
		for (var i=1; i < arrTxt.length;i++ ) {
			var arrTxt2=arrTxt[i].split("\t");
			cmbObj.InsertItem(i-1, arrTxt2[0]+"|"+arrTxt2[1], arrVal[i]);
		}
		*/
     		
	}
	/** 
	 * init UI<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {object} formObj  
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.04.27
	 */
	function removeAll(formObj) {
		formObj.reset();
		sheetObjects[0].RemoveAll();
		doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC10);
		//MakeComboObject2(acct_cd);
	}
	/** 
	 * handling popup(FNS_INV_0086)<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {array} rowArray  
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.04.27
	 */
	function getFNS_INV_0086(rowArray) {
		var colArray=rowArray[0];
		var formObj=document.form;
		formObj.act_cust_cnt_cd.value=colArray[8];
		formObj.act_cust_seq.value=ComLpad(colArray[9], 6, '0');
		formObj.cust_nm.value=colArray[4];
	}
	
	function cpntClear()
	{
		document.form.fm_dt.value = "";
		document.form.to_dt.value = "";
		document.form.cre_usr_id.value = "";
		document.form.act_cust_cnt_cd.value = "";
		acct_cd_text.value = "";
		ar_ofc_cd_text.value = "";
	}
	
	function resizeSheet(){
		ComResizeSheet(sheetObjects[0]);
	}