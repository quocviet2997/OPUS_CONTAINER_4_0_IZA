/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName   : fns_inv_0115.js
*@FileTitle  : ERP IF Error Inquiry
*Open Issues :
*Change history :
*@LastModifyDate : 2010.12.13
*@LastModifier : 김현화
*@LastVersion : 1.0
* 2010.12.13 김현화
* 1.0 Creation
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [retrieve]SEARCH=2; [리스트retrieve]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/

	/**
	 * @fileoverview define calandar method when common use in java script file.
	 * @author Cyberlogitec
	 */

	/**
	 * @extends 
	 * @class fns_inv_0115 : defile script for create fns_inv_0115 UI. 
	 */
	function fns_inv_0115() {
		this.processButtonClick		= tprocessButtonClick;
		this.setSheetObject 		= setSheetObject;
		this.loadPage 				= loadPage;
		this.initSheet 				= initSheet;
		this.initControl            = initControl;
		this.doActionIBSheet 		= doActionIBSheet;
		this.validateForm 			= validateForm;
	}
    
	
	//common global valiables
	var sheetObjects = new Array();
	var sheetCnt = 0;
	//IBMultiCombo
	var comboObjects = new Array();
	var combo1 = null;
	var comboCnt = 0;

	//define button click event handler */
	document.onclick = processButtonClick;

	/** 
	 * event handler branch process by button name<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  none  
	 * @return none
	 * @see #
	 * @author  KIM HYUN HWA
	 * @version 2010.12.14
	 */
	function processButtonClick(){
		var sheetObject1 = sheetObjects[0];
		/*******************************************************/
		var formObject = document.form;

		try {
			var srcName = window.event.srcElement.getAttribute("name");
			
			switch(srcName) {
				case "btn_retrive":
					doActionIBSheet(sheetObject1,formObject,IBSEARCH);
				break;

				case "btn_new":
					removeAll(formObject);
//					loadPage();

		
				break;

				case "btn_downExcel":
					sheetObject1.SpeedDown2Excel(-1);
				break;
				
				case "btns_calendar1": 
					var cal = new ComCalendar();
					cal.setDisplayType('date');
	             	cal.select(formObject.from_date, 'yyyy-MM-dd');
	            break;
	            
				case "btns_calendar2": 
					var cal = new ComCalendar();
					cal.setDisplayType('date');
	             	cal.select(formObject.to_date, 'yyyy-MM-dd');
	            break;
				
			} // end switch
		} catch(e) {
			if( e == "[object Error]") {
				ComShowMessage(OBJECT_ERROR);
			} else {
				ComShowMessage(e);
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
	 * @author KIM HYUN HWA
	 * @version 2010.12.14
	 */
	function setSheetObject(sheet_obj){
		sheetObjects[sheetCnt++] = sheet_obj;
	}

	/** 
	 * add comboObjects array IBCombo Object<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {IBMultiCombo} combo_obj    IBMultiCombo Object
	 * @return none
	 * @see #
	 * @author KIM HYUN HWA
	 * @version 2010.12.14
	 */
	function setComboObject(combo_obj){
		comboObjects[comboCnt++] = combo_obj;
	}

    /** 
     *  define onLoad event handler<br> 
     * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author KIM HYUN HWA
	 * @version 2010.12.14
	 */
	function loadPage() {
		sheet1 = sheetObjects[0];
		sheetCnt = sheetObjects.length ;
		
		for(i=0;i<sheetObjects.length;i++){
			ComConfigSheet (sheetObjects[i] );
			initSheet(sheetObjects[i],i+1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		
		// init IBMultiCombo
		for(var k=0; k<comboObjects.length; k++){
			initCombo(comboObjects[k],k+1);
		}

		
		var formObj = document.form;
		formObj.date_option.value = 'I'
		formObj.if_flag.value = ''
		doActionIBSheet(sheet1, formObj, IBSEARCH_ASYNC10);
		
		initControl();
		
		setDefaultDateValue(formObj);
		formObj.from_date.focus();
	
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
	 * @author KIM HYUN HWA
	 * @version 2010.12.14
	 */
	function initSheet(sheetObj,sheetNo) {
		var formObject = document.form;
		
		var cnt = 0;
		var dpPrcsKntLocal = formObject.dp_prcs_knt_local.value;
		var dpPrcsKnt = formObject.dp_prcs_knt.value;
		
		var setDpPrcsKnt = "";
		if (Number(dpPrcsKntLocal) > Number(dpPrcsKnt)) {
			setDpPrcsKnt = dpPrcsKntLocal;
		}
		else {
			setDpPrcsKnt = dpPrcsKnt;
		}
		
		switch(sheetNo) {
			case 1:      //sheet1 init
				with (sheetObj) {
					//setting height
					style.height = 380;
					
					//setting width
					SheetWidth = mainTable1.clientWidth;
	
					//Host info setting [required][HostIp, Port, PagePath]
					if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);
	
					//Merge type[optional, Default msNone]
					MergeSheet = msAll;
	
					//Editable [optional, Default false]
					Editable = false;
	
					//row info setting[required][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
					InitRowInfo(1, 1, 3, 100);
	
					//init header mode
					InitHeadMode(true, true, true, true, false, false);
					
					var HeadTitle = "";
				
						HeadTitle = "|Seq|RHQ|Office|I/F\nST|I/F No|I/F\nSer|B/L No|INV No|Rev\nType|Rev\nSource|Transaction\nSource Name|Curr|Amount|I/F Date|Good Date|GL Date|Creation\nDate|Error\nReason";
					
					var headCount = ComCountHeadTitle(HeadTitle);
					
					//column info settion[required][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
	                InitColumnInfo(headCount, 0, 0, true);
	                
					//header info setting [required][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
					InitHeadRow(0, HeadTitle, true);
					
					//data property          [ROW, COL,  DATATYPE,  		WIDTH,  DATAALIGN, COLMERGE, SAVENAME,    KEYFIELD, CALCULOGIC, DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
					InitDataProperty(0, cnt++ , dtHiddenStatus, 0,      daCenter,  false,	"ibflag");
					InitDataProperty(0, cnt++ , dtSeq,			25,		daCenter,  false,   "Seq");
					InitDataProperty(0, cnt++ , dtData,    		50,     daCenter,  false,	"ar_hd_qtr_ofc_cd",	 false,    "",	dfNone);
					InitDataProperty(0, cnt++ , dtData,    		50,     daCenter,  false,	"ar_ofc_cd",      	 false,    "",	dfNone);
					InitDataProperty(0, cnt++ , dtData,    		30,     daCenter,  false,	"inv_erp_if_sts_cd", false,    "",	dfNone);
					InitDataProperty(0, cnt++ , dtData,    		80,  	daCenter,  false,	"ar_if_no",     	 false,    "",	dfNone);
					InitDataProperty(0, cnt++ , dtData,    		30,     daCenter,  false,	"ar_if_ser_no",      false,    "",	dfNone);
					InitDataProperty(0, cnt++ , dtData,    		90,  	daCenter,  false,	"bl_src_no",     	 false,    "",	dfNone);
					InitDataProperty(0, cnt++ , dtData,    		80,  	daCenter,  false,	"inv_no",     	false,    "",	dfNone);
					InitDataProperty(0, cnt++ , dtData,    		40,		daCenter,  false,	"rev_tp",     	false,    "",	dfNone);
					InitDataProperty(0, cnt++ , dtData,    		45,		daCenter,  false,	"rev_tp_src",   false,    "",	dfNone);
					InitDataProperty(0, cnt++ , dtData,    		80,		daCenter,  false,	"tj_src_nm",    false,    "",	dfNone);
					InitDataProperty(0, cnt++ , dtData,    		30,  	daCenter,    false,	"curr_cd",   	false,    "",	dfNone);
					if (setDpPrcsKnt > 0) {
						InitDataProperty(0, cnt++ , dtData,    	80,	daRight,   false,	"inv_amt",		false,    "",	dfNullFloat, setDpPrcsKnt);
					}
					else {
						InitDataProperty(0, cnt++ , dtData,    	80,	daRight,   false,	"inv_amt",		false,    "",	dfInteger);
					}
					InitDataProperty(0, cnt++ , dtData,    		70,		daCenter,  false,	"if_dt",	false,    "",	dfDateYmd);
					InitDataProperty(0, cnt++ , dtData,    		70,		daCenter,  false,	"good_dt",	false,    "",	dfDateYmd);
					InitDataProperty(0, cnt++ , dtData,    		70,		daCenter,  false,	"gl_dt",	false,    "",	dfDateYmd);
					InitDataProperty(0, cnt++ , dtData,    		100,	daCenter,    false,	"cre_dt",	false,    "",	dfUserFormat2);		
					InitDataProperty(0, cnt++ , dtData,    		130,  	daLeft,    false,	"err_desc", false,    "",	dfNone);					
				
					InitUserFormat2(0, "cre_dt", "####-##-## ##:##", "-|:" );
					FrozenCols = 2;
					CountPosition = 2;
					
					WaitImageVisible=false;
				}
			break;
		}
	}
 
	/** 
	 * init combo <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param {IBMultiCombo} comboObj  comboObj
	 * @return none
	 * @see #
	 * @author KIM HYUN HWA
	 * @version 2009.05.04
	 */
  	function initCombo(comboObj, comboNo) {
		switch (comboObj.id) {
			case "ar_ofc_cd":
				with (comboObj) {
					SetColAlign("left");
	                SetColWidth("50");
	                //SetTitle("Office Code");
					MultiSelect = false;
					UseAutoComplete = true;
					DropHeight = 200;
					ValidChar(2,1);
					MaxLength = 6;
				}
			break;
		
			case "rev_tp_cd":
				with (comboObj) {
					InsertItem(0, "ALL",    "A");
		            InsertItem(1, "B/L",    "B");
		            InsertItem(2, "C/A",    "C");
		            InsertItem(3, "MRI",    "M");
		            
		            //Code = "A";
		            
		    		MultiSelect = true;
		    		UseCode = true;
		    		//LineColor = "#ffffff";
		    		SetColAlign("left");
		    		MultiSeparator = ",";
		    		DropHeight = 190;
		    		
		    		SetSelectCode("A");
				}
			break;
			case "if_flg":
				with (comboObj) {
					InsertItem(0, "N",    "N");
		            InsertItem(1, "Y",    "Y");
		            InsertItem(2, "E",    "E");
		            
		            Code = "N";
		            
		    		MultiSelect = false;
		    		UseCode = true;
		    		//LineColor = "#ffffff";
		    		SetColAlign("left");
		    		MultiSeparator = ",";
		    		DropHeight = 190;
				}
			break;
						
			case "rev_src_cd":
				with (comboObj) {
					comboObj.RemoveAll();
					InsertItem(0, "ALL",    "");
		    		MultiSelect = true;
		    		UseCode = true;

		    		SetColAlign("left");
		    		MultiSeparator = ",";
		    		DropHeight = 190;		    		

		    		SetSelectCode("");
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
	 * @author KIM HYUN HWA
	 * @version 2009.05.04
	 */
	function initControl() {
		var formObj = document.form;
		axon_event.addListenerFormat ('keypress', 'obj_keypress', formObj);
		axon_event.addListenerFormat ('beforeactivate', 'obj_activate', formObj);
		axon_event.addListenerForm ('beforedeactivate', 'obj_deactivate', formObj);
		//axon_event.addListenerForm ('focusout', 'obj_focusout', formObj);
		axon_event.addListenerForm ('keyup', 'obj_keyup', formObj);
		
	}

	/** 
	 * OnKeyPress event<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author KIM HYUN HWA
	 * @version 2009.05.04
	 */
	function obj_keypress() {
		switch(event.srcElement.dataformat){
			case "float":
				//number+"."
				ComKeyOnlyNumber(event.srcElement, "."); 
			break;
			
			case "int":
				//number only
				ComKeyOnlyNumber(event.srcElement); 
			break;
			
			case "engup":
				switch(event.srcElement.name){
	
				case "if_no":
					//upper case+number
					ComKeyOnlyAlphabet('uppernum');
				break;
				case "inv_no":
					//upper case+number
					ComKeyOnlyAlphabet('uppernum');
				break;
				case "ar_ofc_cd":
					//upper case only
					ComKeyOnlyAlphabet('upper'); 
				break;
				case "ar_hd_qtr_ofc_cd":
					//upper case only
					ComKeyOnlyAlphabet('upper'); 
				break;
				case "bl_no":
					//upper case+number
					ComKeyOnlyAlphabet('uppernum');
				break;
						}
			break;
			
	        case "num":
	        	//number only
	            ComKeyOnlyNumber('num');
            break;
            
			default:
				//number only
				ComKeyOnlyNumber(event.srcElement);
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
	 * @author KIM HYUN HWA
	 * @version 2009.05.04
	 */
	function obj_activate() {
		var sheetObject = sheetObjects[0];
		var formObject = document.form;
		
		switch(event.srcElement.name){
			case "from_date":
				ComClearSeparator (event.srcElement);
			break;
			case "to_date":
				ComClearSeparator (event.srcElement);
			break;
			default:
				ComClearSeparator (event.srcElement);
			break;
		}
	}

	/** 
	 * Onbeforedeactivate event(on focus out)<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author KIM HYUN HWA
	 * @version 2009.05.04
	 */
	function obj_deactivate(){
		var sheetObject = sheetObjects[0];
		var formObject = document.form;
		
		switch(event.srcElement.name){
			case "from_date":
				ComChkObjValid(event.srcElement);
			break;
			case "to_date":
				ComChkObjValid(event.srcElement);
			break;
		
			default:
				//Validation
				ComChkObjValid(event.srcElement);
			break;
		}
	}

	/** 
	 * OnFocusOut event<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author KIM HYUN HWA
	 * @version 2009.05.04
	 */
	function obj_focusout() {
		var sheetObject = sheetObjects[0];
		var formObject = document.form;
		
		
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
	 * @author KIM HYUN HWA
	 * @version 2009.05.04
	 */
	function obj_keyup() {
		var formObject = document.form;
		switch (event.srcElement.name) {
			case "from_date":
				var fromDt = ComReplaceStr(event.srcElement.value,"-","");
				
				if (fromDt.length == 8) {
					formObject.to_date.focus();
				}
	 		break;
	 		
			case "date_blank":
				var dateOption = formObject.date_option.value;
				var dtBlank = event.srcElement.value;
				
				if (dtBlank == 'blank') {
						formObject.ar_ofc_cd.focus();
					
				}
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
	 * @author KIM HYUN HWA
	 * @version 2010.12.14
	 */
	function doActionIBSheet(sheetObj,formObj,sAction, CondParam, PageNo) {
		sheetObj.ShowDebugMsg = false;
		switch(sAction) {
			case IBSEARCH:      //retrieve
				if(validateForm(sheetObj,formObj,sAction)) {
					formObj.f_cmd.value = SEARCH;
                    sheetObjects[0].RemoveAll();
		 			ComOpenWait(true);
					
					
					var sXml = sheetObj.GetSearchXml("FNS_INV_0115GS.do", FormQueryString(formObj));
	     			
		 			// setting digits
		 			//formObj.dp_prcs_knt_local.value = ComGetEtcData(sXml,"dp_prcs_knt_local");
		 			//formObj.dp_prcs_knt.value = ComGetEtcData(sXml,"dp_prcs_knt");
	 				
                    sheetObjects[0].Reset();
		 			initSheet(sheetObjects[0], 1);
	     			sheetObj.LoadSearchXml(sXml);
	     			
	     			ComOpenWait(false); 
	
				}
			break;
			
			case IBSEARCH_ASYNC10:  
				//retrieve RHQ Office 
				formObj.f_cmd.value = SEARCH01;
				
			
 		        var sXml = sheetObj.GetSearchXml("FNS_INV_0115GS.do", FormQueryString(formObj));
 		      
 				var sStr = ComGetEtcData(sXml,"ar_hd_qtr_ofc_cd");
 				var arrStr = sStr.split("|"); 
 	
 				MakeComboObject(formObj.ar_hd_qtr_ofc_cd, arrStr); 
 				formObj.ar_hd_qtr_ofc_cd.text = arrStr[1];

  			break;
 			
 		    case IBSEARCH_ASYNC20: 
 		    	//retrieve AR Office List 
		         formObj.f_cmd.value = SEARCH02;
	             var sXml = sheetObj.GetSearchXml("FNS_INV_0115GS.do", FormQueryString(formObj));
                 
			     var sStr = ComGetEtcData(sXml,"ar_ofc_cd");
			     var arrStr = sStr.split("|"); 
		
                 MakeComboObject(formObj.ar_ofc_cd, arrStr); 
                 var ofc = formObj.user_ofc_cd.value;
                 var rhq = formObj.ar_hd_qtr_ofc_cd.text;
                 formObj.ar_ofc_cd.text = arrStr[1];


		   break;
 		
		}

	}
	
	/**
	 * cell click  <br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
	 * @param {ibsheet} sheetObj  
	 * @param {ibsheet} Row     	
	 * @param {ibsheet} Col     	
     * @return none
     * @see #
     * @author KIM HYUN HWA
     * @version 2009.05.04
	 **/
	function sheet1_OnDblClick(sheetObj, Row, Col) {
	   	var formObj = document.form;
	   	
	   	if (Col == '17') {
	   		ComUserPopup(sheetObj.CellValue(sheetObj.SelectRow, "upd_usr_id"));
	   	}
	   	else {
	   		var type = ComReplaceStr(sheetObj.CellValue(sheetObj.SelectRow, "type"), " ", "");
	   		var blSrcNo = ComReplaceStr(sheetObj.CellValue(sheetObj.SelectRow, "bl_src_no"), " ", "");
	   		var arIfNo = ComReplaceStr(sheetObj.CellValue(sheetObj.SelectRow, "ar_if_no"), " ", "");
			var arOfcCd = formObj.ar_ofc_cd.text;
			
			var classId = "";
			var param = "";
			

	
	   	}
	}

	/**
	 * OnLoadFinish event<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param {ibsheet} sheetObj 
	 * @return none
	 * @see #
	 * @author KIM HYUN HWA
	 * @version 2009.05.04
	 */ 	  	
//	function sheet1_OnLoadFinish(sheetObj){
//		var formObj = document.form;
//		
//		doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC10);
//		
	//    initControl();
	//	formObj.from_date.focus();
//	}

	/**
	 * OnMouseMove event<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param {ibsheet} sheetObj
	 * @return none
	 * @see #
	 * @author KIM HYUN HWA
	 * @version 2009.05.04
	 */ 
	function sheet1_OnMouseMove(sheetObj, Button, Shift, X, Y){
		var Row = sheetObj.MouseRow;
		var Col = sheetObj.MouseCol;
	        
		var sText = sheetObj.CellText(Row,Col);
		if(sText != "") {
			sheetObj.MouseToolTipText = sText;
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
	 * @author KIM HYUN HWA
	 * @version 2010.12.22
	 */
	function validateForm(sheetObj,formObj,sAction){
		 with(formObj){
			 var arOfcCd = formObj.ar_ofc_cd.text;
			 var nextDate = "";
			 
			 if(((from_date.value == "") && (to_date.value == "")) ) {          		 
				 ComShowCodeMessage("INV00004");
				 from_date.focus();
				 return false;
			 }
			 
			 if (arOfcCd == 'ALL') {
				 nextDate = ComGetDateAdd(from_date.value, "D", 12);
			 }
			 else {
				 nextDate = ComGetDateAdd(from_date.value, "M", 1);
			 }
			 
			 if (to_date.value >= nextDate) {
				 ComShowCodeMessage("INV00043");
				 to_date.focus();
				 return false;
			 }
			 
			 if(rev_tp_cd.text == "") {
				 ComShowCodeMessage("INV00004");
				 rev_tp_cd.focus();
				 return false;
			 }
		 }
		 return true;
	}

	/** 
	 * reset form <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {object} formObj  
	 * @return none
	 * @see #
	 * @author KIM HYUN HWA
	 * @version 2010.12.22
	 */
	function removeAll(formObj) {
		formObj.reset();
		

		formObj.rev_tp_cd.Code = "A";
	   //formObj.inv_clr_flg.Code = "N";
		
		sheetObjects[0].RemoveAll();
		doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC10);
		
		formObj.date_option.value = 'I'
			formObj.if_flag.value = ''
			for(var k=0; k<comboObjects.length; k++){
				initCombo(comboObjects[k],k+1);
			}		
	    setDefaultDateValue(formObj);
		formObj.from_date.focus();
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
	 * @author KIM HYUN HWA
	 * @version 2009.05.04
	 */
	function MakeComboObject(cmbObj, arrStr) {
		cmbObj.RemoveAll(); 
		//String str ="";
	
		for (var i = 1; i < arrStr.length;i++ ) {
			cmbObj.InsertItem(i-1, arrStr[i], arrStr[i]);
			//str = arrStr[i];
		}
		
		//cmbObj.BackColor = "#CCFFFD";
	}
	 

   /**
	 * function called when  ar_hd_qtr_ofc_cd data change<br>
	 *  office setting<br>
	 * <br><b>Example : </b>
	 * <pre>
	 * </pre>
	 * @param {IBMultiCombo} comboObj
     * @param {String} oldIndex
     * @param {String} oldText
     * @param {String} oldCode
     * @param {String} newIndex
     * @param {String} newText
     * @param {String} newCode
	 * @author KIM HYUN HWA
	 * @version 2012.12.20
	 */		 
	function ar_hd_qtr_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){ 
		 sheetObjects[0].RemoveAll();
		 doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC20);
	
	}
		
	/** 
	  * setting value when rev_tp_cd changed.<br>
	  * <br><b>Example :</b>
	  * <pre>
	  * </pre>
	  * @param {IBMultiCombo} comboObj
	  * @param {object} s_index
	  * @param {object} s_code
	  * @return none
	  * @see #
	  * @author KIM HYUN HWA
	  * @version 2009.12.01
	  */
	function rev_tp_cd_OnCheckClick(comboObj, s_index, s_code) {
		if (s_code == "A") {
			if (comboObj.GetSelectCode().indexOf("A") >= 0) {
				comboObj.SetSelectCode("B", false);
				comboObj.SetSelectCode("C", false);
				comboObj.SetSelectCode("M", false);
			}
		} else {
			if (comboObj.GetSelectCode().indexOf("A") >= 0) {
				comboObj.SetSelectCode("A", false);
			}
		}
	}
 
	 /** 
      *  setting Rev Source value when Rev Type change<br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {object} thisObj
      * @return none
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
     function doChange(thisObj){
 		var val = thisObj.options[thisObj.selectedIndex].value;
 		var targetE = document.form.rev_src_cd;
 		targetE.RemoveAll();
      //  if (val != 'ALL'){
    		targetE.InsertItem(0, "ALL",    	"");
      //  }
 		if(val == 'B'){
 			targetE.InsertItem(1, "BBL",    "BL");
 			targetE.InsertItem(2, "BCS",    "CS");
 			targetE.InsertItem(3, "BCC",    "CC"); 		
 		}else if(val == 'C'){
 			targetE.InsertItem(1, "CCA",    "CA");
 			targetE.InsertItem(2, "CCC",    "CC");
 		}else if(val == 'M'){
 			targetE.InsertItem(1, "MIV",    "IV");
 			targetE.InsertItem(2, "MIC",    "IC");
 			targetE.InsertItem(3, "MCT",    "CT");
 			targetE.InsertItem(4, "MOC",    "OC");
 			targetE.InsertItem(5, "MEQ",    "EQ");
 			targetE.InsertItem(6, "MTS",    "TS");
 			targetE.InsertItem(7, "MDM",    "DM");
 			targetE.InsertItem(8, "MDT",    "DT");
 			targetE.InsertItem(9, "MRD",    "RD");
 			targetE.InsertItem(10, "MTH",    "TH");
 			targetE.InsertItem(11, "MTP",    "TP");
 			targetE.InsertItem(12, "MTM",    "TM");
 			targetE.InsertItem(13, "MTN",    "TN");
 			targetE.InsertItem(14, "MWC",    "WC");
 			targetE.InsertItem(15, "MLS",    "LS");
 			targetE.InsertItem(16, "MDO",    "DO");
 		}
 		targetE.text = "ALL";
 	}
     
    
      /** 
  	 * change value when rev_src_cd chanage.<br>
  	 * <br><b>Example :</b>
  	 * <pre>
  	 * </pre>
  	 * @param {IBMultiCombo} comboObj
  	 * @param {object} s_index
  	 * @param {object} s_code
  	 * @return none
  	 * @see #
  	 * @author KIM HYUN HWA
  	 * @version 2009.12.01
  	 */
  	function rev_src_cd_OnCheckClick(comboObj, s_index, s_code) {
  		//alert(comboObj+":"+s_index+":"+s_code);
  		if(s_code == ""){
  				comboObj.SetSelectCode("BL", false);
  		        comboObj.SetSelectCode("CS", false);
  		        comboObj.SetSelectCode("CC", false);
  		        comboObj.SetSelectCode("CA", false);
  		        comboObj.SetSelectCode("CC", false);
  		        comboObj.SetSelectCode("IV", false);
  		        comboObj.SetSelectCode("IC", false);
  		        comboObj.SetSelectCode("CT", false);
  		        comboObj.SetSelectCode("OC", false);
  		        comboObj.SetSelectCode("EQ", false);
  		        comboObj.SetSelectCode("TS", false);
  		        comboObj.SetSelectCode("DM", false);
  		        comboObj.SetSelectCode("DT", false);
  		        comboObj.SetSelectCode("RD", false);
  		        comboObj.SetSelectCode("TH", false);
  		        comboObj.SetSelectCode("TP", false);
  		        comboObj.SetSelectCode("TM", false);
  		        comboObj.SetSelectCode("TN", false);
  		        comboObj.SetSelectCode("WC", false);
  		        comboObj.SetSelectCode("LS", false);
		        comboObj.SetSelectCode("DO", false);
  		}else{
  			comboObj.SetSelectCode("", false);
  		}
  	}
  	
  /** 
   * delete combo box value <br>
   * <br><b>Example :</b>
   * <pre>
   * </pre>
   * @param  {object} e
   * @return none
   * @see #
   * @author 한동훈
   * @version 2009.10.19
   */
  function removeCombo(e){
	    for(var i = 0, limit = e.options.length; i < limit - 1; ++i){
	        e.remove(1);
	    }
	}
	   
   	/** 
      * setting combo box value <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {String} text
      * @param  {String} value
      * @param  {object} e 
      * @return none
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
     function addOption(text,value, e){
 	    var o = new Option(text,value);
 	    try{
 	        e.add(o);
 	    }catch(ee){
 	        e.add(o, null);
 	    }
 	}
      
  	/**
     	 * init date condition.<br>
   	 * <br><b>Example :</b>
   	 * <pre>
   	 * </pre>
     	 * 
     	 * @param formObj
   	 * @return s
   	 * @see #
   	 * @author 
   	 * @version 2009.06.03
     	 */
     	function setDefaultDateValue(formObj) {
     		today= new Date();
     		
     		var year  =today.getYear();
     		var mon  =today.getMonth()+1;
     		var sday =today.getDate();
     		 
     		formObj.to_date.value = year+"-"+ComLpad(mon,2,"0")+"-"+ComLpad(sday,2,"0");
    		
     		nextDate = ComGetDateAdd(formObj.to_date.value, "D", -11);
    		formObj.from_date.value = nextDate;
   		
     	}     
      
      	 
     	 
      
