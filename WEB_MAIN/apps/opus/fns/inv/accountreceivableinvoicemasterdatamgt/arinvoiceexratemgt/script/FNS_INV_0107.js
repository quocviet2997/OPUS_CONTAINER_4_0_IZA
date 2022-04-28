/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0107.js
*@FileTitle  : VVD Ex. Rate Date History Inquiry
*@author     : IY Cho
*@version    : 1.0
*@since      : 2014/11/21
=========================================================*/

	var sheetObjects=new Array();
	var sheetCnt=0;
	
	var ROWMARK="|";
	var FIELDMARK="=";
	
	var retrieveFlg=0;  
	var rdObjects=new Array();
	var rdCnt=0;
	
	// Defining button events. */
	document.onclick=processButtonClick;
	/** 
	 * Handling button event. <br>
	 */
	function processButtonClick(){
		/***** Setting each tab's sheet variable. *****/
		var sheetObject1=sheetObjects[0];
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch(srcName) {
			case "btn1_Retrieve":
				retrieveFlg=1;
				doActionIBSheet(sheetObject1,document.form,IBSEARCH);
				break; 
			case "btn1_New":
				retrieveFlg=0;
				formObject.vvd_cd.value="";
				sheetObject1.RemoveAll();
				break;
			case "btn1_Close":
				alert(srcName);
				break;
			case "btns_calendar": // Calendar button.
				var cal=new ComCalendar();
				cal.select(formObject.from_dt, 'yyyy-MM-dd');
				break;
			case "btns_calendar2": // Calendar button.
				var cal=new ComCalendar();
				cal.select(formObject.to_dt, 'yyyy-MM-dd');
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
	 * @param  {IBSheet} sheetObj IBSheet Object
	 */
	function setSheetObject(sheet_obj){
		sheetObjects[sheetCnt++]=sheet_obj;
	}
	/** 
	 * Coding event handler for body tag's OnLoad. <br>
	 * Add  pre-process functions after loading by browser. <br> 
	 */
	function loadPage() {
		for(i=0;i<sheetObjects.length;i++){
			ComConfigSheet (sheetObjects[i] );
			initSheet(sheetObjects[i],i+1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		initControl();
		if(document.form.vvd_cd.value!=""){
			doActionIBSheet(sheetObjects[0],document.form,IBSEARCH); 	
		}else{
			document.form.vvd_cd.focus();
		}
	}
	/** 
	 * Initialize sheets. <br>
	 * Add  pre-process functions after loading by browser. <br>
	 * Coding initial modules as sheet's count. <br> 
	 * @param {IBSheet} sheetObj : Sheet object.
	 * @param Serial number for sheet object's ID.  
	 */
	function initSheet(sheetObj,sheetNo) {
		var cnt=0;
		switch(sheetObj.id) {
		case "sheet1":      //sheet1 init
			with(sheetObj){
				
			      var HeadTitle1="|User ID|VVD|Port|Scope|Bound|Ex. Rate Date|Event Date|Event|Remark|||||";
			      var headCount=ComCountHeadTitle(HeadTitle1);

			      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );

			      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
			      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
			      InitHeaders(headers, info);

			      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
			             {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:1,   SaveName:"cre_usr_id",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:1,   SaveName:"vvd_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",     Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:"port_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",     Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:"svc_scp_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",     Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:"io_bnd_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Date",     Hidden:0,  Width:80,  Align:"Center",   ColMerge:1,   SaveName:"xch_rt_dt",     KeyField:0,   CalcLogic:"",   Format:"Ymd",   PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Date",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:1,   SaveName:"cre_dt",          KeyField:0,   CalcLogic:"",   Format:"YmdHms",  PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",     Hidden:0,  Width:80,  Align:"Left",   ColMerge:1,   SaveName:"op_sts_nm",     KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",     Hidden:0,  Width:80,  Align:"Left",   ColMerge:1,   SaveName:"cng_rmk",     KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"skd_voy_no" },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"skd_dir_cd" },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"vsl_cd" },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ar_ofc_cd" } ];
			      
			      InitColumns(cols);
			      SetEditable(1);
			      SetWaitImageVisible(0);
			      InitComboNoMatchText(true);
			      SetSheetHeight(400);
			      FitColWidth("10|10|8|8|6|11|15|8|20");
			      resizeSheet();
			}
			break;
		}
	}
	/** 
	 * Coding retrieve, save... <br>
	 * @param  {IBSheet} sheetObj : Sheet object.  
	 * @param  {object} formObj : Form object.
	 * @param  {sAction} sAction : f_cmd.
	 */
	function doActionIBSheet(sheetObj,formObj,sAction) {
		sheetObj.ShowDebugMsg(false);
		switch(sAction) {
			case IBSEARCH:      //retrieve
			ComOpenWait(true);
			formObj.f_cmd.value=SEARCH01; 				
			sheetObj.DoSearch("FNS_INV_0107GS.do",FormQueryString(formObj) );
			ComOpenWait(false);
			break;
		}
	}

	/**
	 * KEY Event<br>
	 */
	function initControl() {
		// Axon event process. Event catch.
		var formObj=document.form;
		axon_event.addListenerFormat ('keypress', 'obj_keypress', formObj);
	}
	/**
	 * KEY Event<br>
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
	
    function resizeSheet(){
 		ComResizeSheet(sheetObjects[0]);
 	}
