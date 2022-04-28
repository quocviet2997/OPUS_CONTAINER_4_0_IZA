/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0006.js
*@FileTitle  : Ex. Rate Inquiry
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/27
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/

	// common global variables
	var sheetObjects=new Array();
	var sheetCnt=0;
	var comboObjects=new Array();
	var comboCnt=0;
	var trMode="R";
	var prevDtIdx=-1;
	// define button click event handler */
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
		var sheetObj=sheetObjects[0];
		/*******************************************************/
		var formObj=document.form;
		try {
			var xchRtTpCd=xch_rt_tp_cd.GetSelectCode();
			var srcName=ComGetEvent("name");
			switch(srcName) {
				case "btns_calendar1": 
					var cal=new ComCalendar();
					cal.setDisplayType('date');
	             	cal.select(formObj.from_day, 'yyyy-MM-dd');
	             	break;
				case "btns_calendar2": 
					var cal=new ComCalendar();
					cal.setDisplayType('date');
	             	cal.select(formObj.to_day, 'yyyy-MM-dd');
	             	break;
				case "btns_calendar3": 
					var cal=new ComCalendar();
					cal.setDisplayType('month');
	             	cal.select(formObj.from_month, 'yyyy-MM');
	             	break;
				case "btns_calendar4": 
					var cal=new ComCalendar();
					cal.setDisplayType('month');
	             	cal.select(formObj.to_month, 'yyyy-MM');
	             	break;
				case "btns_port": //retrieve port 
					var loc_cd_val=formObj.port_cd.value;
					var loc_port_ind_val="1";
					var dispaly="1,0,1,1,1,1,1,1,1,1,1,1";
					var classId="COM_ENS_051";
					var param='?loc_cd='+loc_cd_val+'&classId='+classId;
					ComOpenPopup('/opuscntr/COM_ENS_051.do' + param, 1050, 550, 'getCOM_ENS_051_1', dispaly);
					break;
				case "btn_retrieve":
					doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC02);
					break;
				case "btn_new":
					removeAll(formObj);
					break;
				case "btn_downExcel":
//parameter changed[check again]CLT 
					if(sheetObj.RowCount() < 1){//no data
						ComShowCodeMessage("COM132501");
					}else{
						sheetObj.Down2Excel( {DownCols: makeHiddenSkipCol(sheetObj), SheetDesign:1,Merge:1 });
					}
					break;
				case "btn_close":
					window.close();	 
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
	 * add IBSheet Object to sheetObjects array <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj IBSheet Object
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.10.19
	 */
	function setSheetObject(sheet_obj){
		sheetObjects[sheetCnt++]=sheet_obj;
	}
	/** 
	 * add IBCombo Object to comboObjects array<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {IBMultiCombo} combo_obj    IBMultiCombo Object
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.10.19
	 */
	function setComboObject(combo_obj){
		comboObjects[comboCnt++]=combo_obj;
	}
    /** 
     * define onLoad event handler <br>
     * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.10.19
	 */
	function loadPage() {
		for(var k=0;k<comboObjects.length;k++){
			initCombo(comboObjects[k],k+1);
			
		}
		
		for (var i=0; i < sheetObjects.length; i++) {
			ComConfigSheet(sheetObjects[i]);
			initSheet(sheetObjects[i], i + 1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		initControl();
		doActionIBSheet(sheetObjects[0],document.form,IBSEARCH_ASYNC01);
		sheet1_OnLoadFinish(sheetObjects[0]);
		xch_rt_tp_cd_OnChange("","", "", "" , "", "" , "V");
	}		
	// OnLoadFinish event
//no support[check again]CLT 	
	function sheet1_OnLoadFinish(sheetObj) {
		var formObj=document.form;
		var vvdCd=formObj.view_vvd_cd.value;
		var portCd=formObj.view_port_cd.value;
		var loclCurrCd=formObj.view_locl_curr_cd.value;
		var svcScpCd=formObj.view_svc_scp_cd.value;
		var ioBndCd=formObj.view_io_bnd_cd.value;
		//retrieve popup
		if(vvdCd != "") {
			
			//diabled condition field
			ComEnableObject(formObj.chg_curr_cd,	false);	// X
			ComEnableObject(formObj.locl_curr_cd,	false);	// X
			ComEnableObject(formObj.vvd_cd,			false);	// X
			ComEnableObject(formObj.port_cd,		false);	// X
			ComEnableObject(formObj.cust_cnt_cd,	false);	// X
			ComEnableObject(formObj.cust_seq,		false);	// X
			ComEnableObject(formObj.from_day,		false);	// X
			ComEnableObject(formObj.to_day,			false);	// X
			ComEnableObject(formObj.from_month,		false);	// X
			ComEnableObject(formObj.to_month,		false);	// X
			xch_rt_tp_cd.SetEnable(0);// X
			svc_scp_cd.SetEnable(0);// X
			io_bnd_cd.SetEnable(0);// X
			document.getElementById('Date_A').style.display="block";
			document.getElementById('Date_B').style.display="none";
			sheetObj = sheetObj.Reset();
			sheetObjects[0]=sheetObj;
			initSheet(sheetObj,1);
			//set condition field
			formObj.vvd_cd.value=vvdCd;
			formObj.port_cd.value=portCd;
			formObj.locl_curr_cd.value="";
			if (svcScpCd != '') {
				svc_scp_cd.SetSelectCode(svcScpCd);
			}
			else {
				svc_scp_cd.SetSelectCode("ALL");
			}
			if (ioBndCd != '') {
				io_bnd_cd.SetSelectCode(ioBndCd);
			}
			else {
				io_bnd_cd.SetSelectCode("ALL");
			}
			// retrieve VVD 
			doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC02);
		}
		//retrieve Scope list
		doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC10);
		formObj.vvd_cd.focus();
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
	 * @version 2009.10.19
	 */
	function initSheet(sheetObj,sheetNo) {
		var cnt=0;		
		var formObj=document.form;		
		var xchRtTpCd=xch_rt_tp_cd.GetSelectCode();
		switch(sheetNo) {
			case 1:      //t1sheet1 init
			    with(sheetObj){
				
		        	//no support[check again]CLT 					if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);
		        	var HeadTitle="";
		        	if (xchRtTpCd == 'V' || xchRtTpCd=='') {
		        		HeadTitle="|VVD|Port|Bound|ETA/ETD|Scope|Office|Charge Currency|Local Currency|Ex.Rate|Inverse Rate";
		        	} else if (xchRtTpCd == 'I') {
		        		HeadTitle="|Office|Customer|Bound|From Date|To Date|Charge Currency|Local Currency|Ex.Rate";
		        	} else if (xchRtTpCd == 'C') {
		        		HeadTitle="|Office|Bound|From Date|To Date|Charge Currency|Local Currency|Ex.Rate";
		        	} else if (xchRtTpCd == 'D') {
		        		HeadTitle="|Office|Bound|Date|Charge Currency|Local Currency|Ex.Rate";
		        	} else if (xchRtTpCd == 'A') {
		        		HeadTitle="|Month|Currency|Ex.Rate (USD:LCL)|Ex.Rate (LCL:KRW)";
		        	}
		        	var headCount=ComCountHeadTitle(HeadTitle);
		        	
		        	var cols = new Array();
		        	
		        	SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
		        	

	        		var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
	        		var headers = [ { Text:HeadTitle, Align:"Center"} ];
	        		InitHeaders(headers, info);
		        	
		        	if (xchRtTpCd == 'V' || xchRtTpCd=='') {

		        		cols.push({Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" });
		        		cols.push({Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:1,   SaveName:"vvd_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
        				cols.push({Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"port_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
        				cols.push({Type:"Text",      Hidden:0,  Width:75,   Align:"Center",  ColMerge:1,   SaveName:"io_bnd_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
        				cols.push({Type:"Date",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:1,   SaveName:"etda_dt",            KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
        				cols.push({Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:1,   SaveName:"svc_scp_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
        				cols.push({Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:1,   SaveName:"ar_ofc_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
        				cols.push({Type:"Text",      Hidden:0,  Width:140,   Align:"Center",  ColMerge:1,   SaveName:"chg_curr_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
        				cols.push({Type:"Text",      Hidden:0,  Width:140,   Align:"Center",  ColMerge:1,   SaveName:"locl_curr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
        				cols.push({Type:"Float",     Hidden:0,  Width:170,  Align:"Right",   ColMerge:1,   SaveName:"inv_xch_rt",         KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6,   UpdateEdit:0,   InsertEdit:0 });
        				cols.push({Type:"Float",     Hidden:0,  Width:170,  Align:"Right",   ColMerge:1,   SaveName:"ivs_xch_rt",         KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6,   UpdateEdit:0,   InsertEdit:0 });
		        	} else if (xchRtTpCd == 'I') {
		        		cols.push({Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" });
		        		cols.push({Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:1,   SaveName:"ar_ofc_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		        		cols.push({Type:"Text",      Hidden:0,  Width:180,  Align:"Center",  ColMerge:1,   SaveName:"cust_seq",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		        		cols.push({Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:1,   SaveName:"io_bnd_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		        		cols.push({Type:"Date",      Hidden:0,  Width:140,  Align:"Center",  ColMerge:1,   SaveName:"fm_dt",              KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		        		cols.push({Type:"Date",      Hidden:0,  Width:140,  Align:"Center",  ColMerge:1,   SaveName:"to_dt",              KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		        		cols.push({Type:"Text",      Hidden:0,  Width:145,  Align:"Center",  ColMerge:1,   SaveName:"chg_curr_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		        		cols.push({Type:"Text",      Hidden:0,  Width:145,  Align:"Center",  ColMerge:1,   SaveName:"locl_curr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		        		cols.push({Type:"Float",     Hidden:0,  Width:140,   Align:"Right",   ColMerge:1,   SaveName:"inv_xch_rt",         KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6,   UpdateEdit:0,   InsertEdit:0 });
		        	} else if (xchRtTpCd == 'C') {
		        		cols.push({Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" });
		        		cols.push({Type:"Text",      Hidden:0,  Width:140,  Align:"Center",  ColMerge:1,   SaveName:"ar_ofc_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		        		cols.push({Type:"Text",      Hidden:0,  Width:150,   Align:"Center",  ColMerge:1,   SaveName:"io_bnd_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		        		cols.push({Type:"Date",      Hidden:0,  Width:160,   Align:"Center",  ColMerge:1,   SaveName:"fm_dt",              KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		        		cols.push({Type:"Date",      Hidden:0,  Width:160,   Align:"Center",  ColMerge:1,   SaveName:"to_dt",              KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		        		cols.push({Type:"Text",      Hidden:0,  Width:170,   Align:"Center",  ColMerge:1,   SaveName:"chg_curr_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		        		cols.push({Type:"Text",      Hidden:0,  Width:170,  Align:"Center",  ColMerge:1,   SaveName:"locl_curr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		        		cols.push({Type:"Float",     Hidden:0,  Width:170,   Align:"Right",   ColMerge:1,   SaveName:"inv_xch_rt",         KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6,   UpdateEdit:0,   InsertEdit:0 });
		        	} else if (xchRtTpCd == 'D') {
		        		cols.push({Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" });
		        		cols.push({Type:"Text",      Hidden:0,  Width:140,  Align:"Center",  ColMerge:1,   SaveName:"ar_ofc_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		        		cols.push({Type:"Text",      Hidden:0,  Width:150,   Align:"Center",  ColMerge:1,   SaveName:"io_bnd_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		        		cols.push({Type:"Date",      Hidden:0,  Width:160,  Align:"Center",  ColMerge:1,   SaveName:"fm_dt",              KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		        		cols.push({Type:"Text",      Hidden:0,  Width:170,  Align:"Center",  ColMerge:1,   SaveName:"chg_curr_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		        		cols.push({Type:"Text",      Hidden:0,  Width:170,  Align:"Center",  ColMerge:1,   SaveName:"locl_curr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		        		cols.push({Type:"Float",     Hidden:0,  Width:170,   Align:"Right",   ColMerge:1,   SaveName:"inv_xch_rt",         KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6,   UpdateEdit:0,   InsertEdit:0 });
		        	} else if (xchRtTpCd == 'A') {
		        		cols.push({Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" });
		        		cols.push({Type:"Date",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:1,   SaveName:"acct_xch_rt_yrmon",  KeyField:0,   CalcLogic:"",   Format:"Ym",          PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		        		cols.push({Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:1,   SaveName:"curr_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		        		cols.push({Type:"Float",     Hidden:0,  Width:200,  Align:"Right",   ColMerge:1,   SaveName:"usd_locl_xch_rt",    KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6,   UpdateEdit:0,   InsertEdit:0 });
		        		cols.push({Type:"Float",     Hidden:1,  Width:200,  Align:"Right",   ColMerge:1,   SaveName:"locl_krw_xch_rt",    KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6,   UpdateEdit:0,   InsertEdit:0 });
		        	}
		 
		        	InitColumns(cols);
		        	SetEditable(1);
//		        	SetSheetHeight(400);
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
	 * @version 2009.10.19
	 */
	function initCombo(comboObj, comboNo) {
		switch(comboObj.options.id) {
			case "xch_rt_tp_cd": 
				with (comboObj) {
					InsertItem(0, "VVD",				"V");
					InsertItem(1, "Customer",			"I");
					InsertItem(2, "Daily",				"D");
					InsertItem(3, "China",				"C");
					InsertItem(4, "Monthly Accounting",	"A");
					Code="V";					
					SetMultiSelect(0);
					SetUseAutoComplete(1);
					comboObj.SetSelectIndex(0,false);
				}
			break;
			case "svc_scp_cd":
				with(comboObj) {					
					SetMultiSelect(0);
					SetUseAutoComplete(1);					
				}
			break;
			case "io_bnd_cd":
				with (comboObj) {
					InsertItem(0, "ALL",	"ALL");
					InsertItem(1, "O/B",	"O");
					InsertItem(2, "I/B",	"I");
					Code="ALL";					
					SetMultiSelect(0);
					SetUseAutoComplete(1);
					comboObj.SetSelectIndex(0,false);
				}
			break;
			case "ar_ofc_cd":
				with(comboObj) {					
					SetMultiSelect(0);
					SetUseAutoComplete(1);					
				}
		}
	}
	/** 
	 * init controller onload <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.10.19
	 */
	function initControl() {
		var formObj=document.form;
		//axon_event.addListenerForm ('blur', 'obj_deactivate', formObj);
		ComEnableObject(formObj.from_day,		false);	// X
		ComEnableObject(formObj.to_day,			false);	// X
		ComEnableObject(formObj.from_month,		false);	// X
		ComEnableObject(formObj.to_month,		false);	// X
		ComEnableObject(formObj.cust_cnt_cd,	false);	// X
		ComEnableObject(formObj.cust_seq,		false);	// X

		
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
	 * @author 박정진
	 * @version 2009.10.19
	 */
	function obj_deactivate(){
		var sheetObject=sheetObjects[0];
		var formObj=document.form;
		switch(ComGetEvent("name")){
				case "cust_seq":
				if (formObj.cust_cnt_cd.value != '' && formObj.cust_seq.value != '') {
					var valueCustSeq=formObj.cust_seq.value;
					formObj.cust_seq.value=ComLpad(valueCustSeq,6,"0");
					doActionIBSheet(sheetObject,formObj,IBSEARCH_ASYNC20);
					var custCd="";
					//if (formObj.cust_nm.value != '') {
					if (formObj.cust_seq.value != '') {
						custCd=formObj.cust_cnt_cd.value+ComLpad(valueCustSeq,6,"0");
					}
					else {
						custCd="";
						formObj.cust_seq.focus();
					}
					for(i=sheetObject.rowCount; i>0; i--){
						sheetObject.SetCellValue(i, "cust_code",custCd,0);
					}
				}
				else {
					//formObj.cust_nm.value = '';
					for(i=sheetObject.rowCount; i>0; i--){
						sheetObject.SetCellValue(i, "cust_code","",0);
					}
				}
			break;
			default:
				//Validation 
				ComChkObjValid(event.srcElement);
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
	 * @version 2009.10.19
	 */
	function doActionIBSheet(sheetObj, formObj, sAction) {
		sheetObj.ShowDebugMsg(false);
		switch (sAction) {
			case IBSEARCH_ASYNC01: // retrieve AR Office
				formObj.f_cmd.value=SEARCH17;
				var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
				var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
				var arrStr=sStr.split("|");
				MakeComboObject2(ar_ofc_cd, arrStr);
	            var arrStr2=arrStr[1].split("^");
	            var ar_ofc_cd_str=arrStr2[3];
	            ar_ofc_cd.SetSelectText(ar_ofc_cd_str);
			break;
			case IBSEARCH_ASYNC10: // retrieve Service Scope 
				formObj.f_cmd.value=SEARCH01;
//parameter changed[check again]CLT 				
				var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
				var sStr=ComGetEtcData(sXml,"svc_scp_cd1");
				var arrStr=sStr.split("|");
				MakeComboObject(svc_scp_cd, arrStr);
			break;
			case IBSEARCH_ASYNC02: // retrieve
				if(validateForm(sheetObj,formObj,sAction)) {
					formObj.f_cmd.value=SEARCH02;
	                var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
	                formObj.ar_ofc_cd.value=arrStr2[1];
					var xchRtTpCd=xch_rt_tp_cd.GetSelectCode();
					if (xchRtTpCd == "A") {
						formObj.from_dt.value=ComReplaceStr(formObj.from_month.value,"-","");
						formObj.to_dt.value=ComReplaceStr(formObj.to_month.value,"-","");
					}
					else {
						formObj.from_dt.value=ComReplaceStr(formObj.from_day.value,"-","");
						formObj.to_dt.value=ComReplaceStr(formObj.to_day.value,"-","");
					}
					sheetObj.DoSearch("FNS_INV_0006GS.do", FormQueryString(formObj) );
				}
			break;
		}
	}
	/** 
	 *  validateForm <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj   
	 * @param  {object} formObj 
	 * @param  {sAction} sAction
	 * @return true, false
	 * @see #
	 * @author 박정진
	 * @version 2009.10.19
	 */
	function validateForm(sheetObj,formObj,sAction){
		switch(sAction) {
			case IBSEARCH_ASYNC02:      //retireve doc no
				with(formObj){
					if(xch_rt_tp_cd.text == "") {
						ComShowCodeMessage("INV00004");
						xch_rt_tp_cd.Focus();
						return false;
					}
					var xchRtTpCd=xch_rt_tp_cd.value;
					//retrieve VVD 
					if (xchRtTpCd == "V") {
						if(vvd_cd.value == "") {
							ComShowCodeMessage("INV00004");
							vvd_cd.focus();
							return false;
						}
					}
					//retrieve Customer 
					else if (xchRtTpCd == "I") {
						if(cust_cnt_cd.value == "") {
							ComShowCodeMessage("INV00004");
							cust_cnt_cd.focus();
							return false;
						}
						if(cust_seq.value == "") {
							ComShowCodeMessage("INV00004");
							cust_seq.focus();
							return false;
						}
						if(from_day.value == "") {
							ComShowCodeMessage("INV00004");
							from_day.focus();
							return false;
						}
						if(to_day.value == "") {
							ComShowCodeMessage("INV00004");
							to_day.focus();
							return false;
						}
					}
					//retrieve Daily  
					else if (xchRtTpCd == "D") {
						if(locl_curr_cd.value == "") {
							ComShowCodeMessage("INV00004");
							locl_curr_cd.focus();
							return false;
						}
						if(from_day.value == "") {
							ComShowCodeMessage("INV00004");
							from_day.focus();
							return false;
						}
						if(to_day.value == "") {
							ComShowCodeMessage("INV00004");
							to_day.focus();
							return false;
						}
					}
					//retrieve China 
					else if (xchRtTpCd == "C") {
						if(locl_curr_cd.value == "") {
							ComShowCodeMessage("INV00004");
							locl_curr_cd.focus();
							return false;
						}
						if(from_day.value == "") {
							ComShowCodeMessage("INV00004");
							from_day.focus();
							return false;
						}
						if(to_day.value == "") {
							ComShowCodeMessage("INV00004");
							to_day.focus();
							return false;
						}
					}
					//Monthly Accounting
					else if (xchRtTpCd == "A") {
						if(from_month.value == "") {
							ComShowCodeMessage("INV00004");
							from_month.focus();
							return false;
						}
						if(to_month.value == "") {
							ComShowCodeMessage("INV00004");
							to_month.focus();
							return false;
						}
					}
				}
			break;
		}
		return true;
	}
	/** 
	 * init UI when xch_rt_tp_cd change.<br>
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
	 * @version 2009.10.19
	 */
	function xch_rt_tp_cd_OnChange(comboObj,oldindex, oldtext, oldcode , newindex, Text , Index_Code) {		
		var sheetObj=sheetObjects[0];
		var formObj=document.form;
		var xchRtTpCd=xch_rt_tp_cd.GetSelectCode();
		formObj.chg_curr_cd.value="";
		formObj.locl_curr_cd.value="";
		formObj.vvd_cd.value="";
		formObj.port_cd.value="";
		formObj.cust_cnt_cd.value="";
		formObj.cust_seq.value="";
		formObj.from_day.value="";
		formObj.to_day.value="";
		formObj.from_month.value="";
		formObj.to_month.value="";
		svc_scp_cd.SetSelectCode("ALL");
		io_bnd_cd.SetSelectCode("ALL");
		//retrieve VVD 
		if (Index_Code == 'V') {
			ComEnableObject(formObj.chg_curr_cd,	true);	//optional
			ComEnableObject(formObj.locl_curr_cd,	true);	//optional
			ComEnableObject(formObj.vvd_cd,			true);	//required
			ComEnableObject(formObj.port_cd,		true);	//optional
			ComEnableObject(formObj.cust_cnt_cd,	false);	// X
			ComEnableObject(formObj.cust_seq,		false);	// X
			ComEnableObject(formObj.from_day,		false);	// X
			ComEnableObject(formObj.to_day,			false);	// X
			ComEnableObject(formObj.from_month,		false);	// X
			ComEnableObject(formObj.to_month,		false);	// X			
			
			formObj.chg_curr_cd.className="input";		//optional
			formObj.locl_curr_cd.className="input";		//optional	
			formObj.vvd_cd.className="input1";			//required
			formObj.port_cd.className="input";			//optional		
			formObj.cust_cnt_cd.className="input2";		// X
			formObj.cust_seq.className="input2";		// X
			formObj.from_day.className="input2";		// X
			formObj.to_day.className="input2";			// X
			formObj.from_month.className="input2";		// X
			formObj.to_month.className="input2";		// X
			
			svc_scp_cd.SetEnable(1);//optional
			io_bnd_cd.SetEnable(1);//optional
			ar_ofc_cd.SetEnable(1);// optional
			document.getElementById('Date_A').style.display="block";
			document.getElementById('Date_B').style.display="none";
			sheetObj = sheetObj.Reset();
			sheetObjects[0]=sheetObj;
			initSheet(sheetObj,1);
			formObj.vvd_cd.focus();
		}
		//retireve Customer
		else if (Index_Code == 'I') {
			ComEnableObject(formObj.chg_curr_cd,	true);	//optional
			ComEnableObject(formObj.locl_curr_cd,	true);	//optional
			ComEnableObject(formObj.vvd_cd,			false);	// X
			ComEnableObject(formObj.port_cd,		false);	// X
			ComEnableObject(formObj.cust_cnt_cd,	true);	// required
			ComEnableObject(formObj.cust_seq,		true);	// required
			ComEnableObject(formObj.from_day,		true);	// required
			ComEnableObject(formObj.to_day,			true);	// required
			ComEnableObject(formObj.from_month,		false);	// X
			ComEnableObject(formObj.to_month,		false);	// X
			
			
			formObj.chg_curr_cd.className="input";		//optional
			formObj.locl_curr_cd.className="input";		//optional	
			formObj.vvd_cd.className="input2";			// x
			formObj.port_cd.className="input2";			// X		
			formObj.cust_cnt_cd.className="input1";		// required
			formObj.cust_seq.className="input1";		// required
			formObj.from_day.className="input1";		// required
			formObj.to_day.className="input1";			// required
			formObj.from_month.className="input2";		// X
			formObj.to_month.className="input2";		// X
			
			svc_scp_cd.SetEnable(0);// X
			io_bnd_cd.SetEnable(1);// optional
			ar_ofc_cd.SetEnable(1);// optional
			document.getElementById('Date_A').style.display="block";
			document.getElementById('Date_B').style.display="none";
			sheetObj = sheetObj.Reset();	
			sheetObjects[0]=sheetObj;
			initSheet(sheetObj,1);
			formObj.cust_cnt_cd.focus();
		}
		//retrieve Daily 
		else if (Index_Code == 'D') {
			ComEnableObject(formObj.chg_curr_cd,	true);	//optional
			ComEnableObject(formObj.locl_curr_cd,	true);	//required
			ComEnableObject(formObj.vvd_cd,			false);	// X
			ComEnableObject(formObj.port_cd,		false);	// X
			ComEnableObject(formObj.cust_cnt_cd,	false);	// X
			ComEnableObject(formObj.cust_seq,		false);	// X
			ComEnableObject(formObj.from_day,		true);	//required
			ComEnableObject(formObj.to_day,			true);	//required
			ComEnableObject(formObj.from_month,		false);	// X
			ComEnableObject(formObj.to_month,		false);	// X
			
			formObj.chg_curr_cd.className="input";		//optional
			formObj.locl_curr_cd.className="input1";	//required	
			formObj.vvd_cd.className="input2";			// X
			formObj.port_cd.className="input2";			// X		
			formObj.cust_cnt_cd.className="input2";		// X
			formObj.cust_seq.className="input2";		// X
			formObj.from_day.className="input1";		// required
			formObj.to_day.className="input1";			// required
			formObj.from_month.className="input2";		// X
			formObj.to_month.className="input2";		// X			
			
			svc_scp_cd.SetEnable(0);// X
			io_bnd_cd.SetEnable(1);// optional
			ar_ofc_cd.SetEnable(1);// optional
			document.getElementById('Date_A').style.display="block";
			document.getElementById('Date_B').style.display="none";
			sheetObj = sheetObj.Reset();		
			sheetObjects[0]=sheetObj;
			initSheet(sheetObj,1);
			formObj.locl_curr_cd.focus();
		}
		//retrieve China 
		else if (Index_Code == 'C') {
			ComEnableObject(formObj.chg_curr_cd,	true);	//optional
			ComEnableObject(formObj.locl_curr_cd,	true);	//required
			ComEnableObject(formObj.vvd_cd,			false);	// X
			ComEnableObject(formObj.port_cd,		false);	// X
			ComEnableObject(formObj.cust_cnt_cd,	false);	// X
			ComEnableObject(formObj.cust_seq,		false);	// X
			ComEnableObject(formObj.from_day,		true);	//required
			ComEnableObject(formObj.to_day,			true);	//required
			ComEnableObject(formObj.from_month,		false);	// X
			ComEnableObject(formObj.to_month,		false);	// X
			
			formObj.chg_curr_cd.className="input";		//optional
			formObj.locl_curr_cd.className="input1";	//required	
			formObj.vvd_cd.className="input2";			// X
			formObj.port_cd.className="input2";			// X		
			formObj.cust_cnt_cd.className="input2";		// X
			formObj.cust_seq.className="input2";		// X
			formObj.from_day.className="input1";		// required
			formObj.to_day.className="input1";			// required
			formObj.from_month.className="input2";		// X
			formObj.to_month.className="input2";		// X		
			
			svc_scp_cd.SetEnable(0);// X
			io_bnd_cd.SetEnable(1);//optional
			ar_ofc_cd.SetEnable(0);// X
			document.getElementById('Date_A').style.display="block";
			document.getElementById('Date_B').style.display="none";
			sheetObj = sheetObj.Reset();
			sheetObjects[0]=sheetObj;
			initSheet(sheetObj,1);
			formObj.locl_curr_cd.focus();
		}
		//Monthly Accounting
		else if (Index_Code == 'A') {
			ComEnableObject(formObj.chg_curr_cd,	false);	// X
			ComEnableObject(formObj.locl_curr_cd,	true);	//optional
			ComEnableObject(formObj.vvd_cd,			false);	// X
			ComEnableObject(formObj.port_cd,		false);	// X
			ComEnableObject(formObj.cust_cnt_cd,	false);	// X
			ComEnableObject(formObj.cust_seq,		false);	// X
			ComEnableObject(formObj.from_day,		false);	// X
			ComEnableObject(formObj.to_day,			false);	// X
			ComEnableObject(formObj.from_month,		true);	//required
			ComEnableObject(formObj.to_month,		true);	//required
			
			formObj.chg_curr_cd.className="input2";		// X
			formObj.locl_curr_cd.className="input";		// optional	
			formObj.vvd_cd.className="input2";			// X
			formObj.port_cd.className="input2";			// X		
			formObj.cust_cnt_cd.className="input2";		// X
			formObj.cust_seq.className="input2";		// X
			formObj.from_day.className="input1";		// X
			formObj.to_day.className="input1";			// X
			formObj.from_month.className="input1";		// required
			formObj.to_month.className="input1";		// required		
			
			svc_scp_cd.SetEnable(0);// X
			io_bnd_cd.SetEnable(0);// X
			ar_ofc_cd.SetEnable(0);// X
			document.getElementById('Date_A').style.display="none";
			document.getElementById('Date_B').style.display="block";
			sheetObj = sheetObj.Reset();	
			sheetObjects[0]=sheetObj;
			initSheet(sheetObj,1);
			formObj.from_month.focus();
		}
	}
	/** 
	 * remove UI value<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {object} formObj  
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.10.19
	 */
	function removeAll(formObj) {
		formObj.reset();
		sheetObjects[0].RemoveAll();
		doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC01);
		doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC10);
		xch_rt_tp_cd.Focus();
	}
	/** 
	 * Scope List select box <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {IBMultiCombo} comboObj  
	 * @param  {Array} arrStr
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.10.19
	 */
	function MakeComboObject(cmbObj, arrStr) {
		cmbObj.RemoveAll();
		var defaultCode="";
		cmbObj.InsertItem(0, "ALL", "ALL");
		for (var i=1; i < arrStr.length; i++ ) {
			cmbObj.InsertItem(i, arrStr[i], arrStr[i]);
		}
		//cmbObj.BackColor = "#CCFFFD";
		cmbObj.SetSelectCode("ALL");
	}
	/** 
	 * hamdling popup (COM_ENS_051)<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {array} rowArray   
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.10.19
	 */
	function getCOM_ENS_051_1(rowArray) {
		var colArray=rowArray[0];
		document.all.port_cd.value=colArray[3];
	}
	
	function resizeSheet(){
		ComResizeSheet(sheetObjects[0]);
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
	 * @version 2009.10.08
	 */         
	function MakeComboObject2(cmbObj, arrStr) {
	    cmbObj.RemoveAll();
	    cmbObj.SetDropHeight(190);
	    for (var i=1; i < arrStr.length;i++ ) {
	        var arrStr2=arrStr[i].split("^");
	        var ar_ofc_cd_str=arrStr2[1];
	        cmbObj.InsertItem(i-1, ar_ofc_cd_str, arrStr[i]);
	    }
	    cmbObj.InsertItem(0, "ALL", "ALL^");
	}