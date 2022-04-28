/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0101.js
*@FileTitle  : VVD Ex. Rate Creation by VVD
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/16
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
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch(srcName) {
			case "Row_Add":
				if (retrieveFlg == 1) {
					var idx=sheetObject1.DataInsert(-1);
					for(i=0;i<formObject.bnd_cd.length;i++){
						if(formObject.bnd_cd[i].checked){
							bndCd=formObject.bnd_cd[i].value;
						}		 					
					}
					sheetObject1.SetCellValue(idx,"io_bnd_cd",bndCd,0);
					sheetObject1.SetCellValue(idx,"ar_ofc_cd",formObject.ofc_cd.value,0);
					sheetObject1.SetCellValue(idx,"xch_rt_tp_cd","V",0);
					sheetObject1.SetCellValue(idx,"locl_curr_cd",formObject.locl_curr_cd.value,0);
					sheetObject1.SetCellValue(idx,"io_bnd_cd",bndCd,0);
					sheetObject1.SetCellValue(idx,"vvd_cd",formObject.vvd_cd.value,0);
					sheetObject1.SetCellValue(idx,"vsl_cd",formObject.vvd_cd.value.substring(0,4),0);
					sheetObject1.SetCellValue(idx,"skd_voy_no",formObject.vvd_cd.value.substring(4,8),0);
					sheetObject1.SetCellValue(idx,"skd_dir_cd",formObject.vvd_cd.value.substring(8,9),0);
					formObject.f_cmd.value=SEARCH07;
					formObject.vvd.value=formObject.vvd_cd.value;
					formObject.bnd.value=bndCd;
					formObject.port.value=sheetObject1.GetCellValue(idx,"port_cd"); 					
					var sXml=sheetObject1.GetSearchData("INVCommonGS.do", FormQueryString(formObject));
					var sStr=ComGetEtcData(sXml,"sail_arr_dt");	 					
					sheetObject1.SetCellValue(idx,"etda_dt",sStr,0);
				}	
				break; 
			case "btn2_Row_Copy":
				if (sheetObject1.RowCount()> 0) {
					var idx=sheetObject1.DataCopy();
					for(i=0;i<formObject.bnd_cd.length;i++){
						if(formObject.bnd_cd[i].checked){
							bndCd=formObject.bnd_cd[i].value;
						}		 					
					}
					sheetObject1.SetCellValue(idx,"io_bnd_cd",bndCd,0);
					sheetObject1.SetCellValue(idx,"ar_ofc_cd",formObject.ofc_cd.value,0);
					sheetObject1.SetCellValue(idx,"xch_rt_tp_cd","V",0);
				}
				break;
			case "btn2_Row_Delete":
				if (retrieveFlg == 1&& sheetObject1.RowCount()> 0) {
					doActionIBSheet(sheetObject1,formObject,IBDELETE);
				}
				break; 
			case "btn2_Down_Excel": 	
				 sheetObject1.Down2Excel({HiddenColumn:1,Merge:true,TreeLevel:false});
				break;
			case "btn2_Load_Excel":
				sheetObject1.LoadExcel();
				break;
			case "btn1_Retrieve":
				retrieveFlg=1;
				doActionIBSheet(sheetObject1,document.form,IBSEARCH);
				break; 
			case "btn1_New":
				retrieveFlg == 0;
				formObject.vvd.value="";
				formObject.vvd_cd.value="";
				formObject.bnd_cd[0].checked=true;
				formObject.bnd.value="";
				vps_port_cd.RemoveAll();
				ar_ofc_cd.RemoveAll();
				inv_curr_cd.RemoveAll();
            	svc_scp_cd.RemoveAll();
				formObject.svc_scp_cd_text.value="ALL";
				formObject.vps_port_cd_text.value="ALL";
				vps_port_cd.SetEnable(0);
				svc_scp_cd.SetEnable(0);
				ComBtnDisable("btn_downexcel");
				sheetObject1.RemoveAll();
				doActionIBSheet(sheetObject1,document.form,IBSEARCH_ASYNC01); 	
				break;
			case "btn1_Save":
				if(sheetObject1.RowCount() < 1){//no data					
					ComShowCodeMessage("COM130104");
				}else{
					if (retrieveFlg == 1) {
						doActionIBSheet(sheetObject1,document.form,IBSAVE);
					}
				}
				break;
			case "btn1_Close":
				alert(srcName);
				break;
			case "btn_downexcel":
				if(sheetObject1.RowCount() < 1){//no data	
					ComShowCodeMessage("COM132501");
				}else{	
					sheetObject1.Down2Excel( {KeyFieldMark:false,AutoSizeColumn:true,DownCols: makeHiddenSkipCol(sheetObject1), SheetDesign:1,Merge:1 });
				}
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
		for(i=0;i<sheetObjects.length;i++){
			ComConfigSheet (sheetObjects[i] );
			initSheet(sheetObjects[i],i+1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		initControl();
		doActionIBSheet(sheetObjects[0],document.form,IBSEARCH_ASYNC01); 
		ComBtnDisable("btn_downexcel");
		vps_port_cd.SetEnable(0);
		svc_scp_cd.SetEnable(0);
		document.form.vvd_cd.focus();
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
		switch(sheetObj.id) {
		case "sheet1":      //sheet1 init
			with(sheetObj){
				
			      //no support[check again]CLT 			if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);
			      var HeadTitle1="|VVD|Port|ETD|Scope|Bound|Charge Curr|Ex. Rate|Ex. Rate Date|Updated By|Updated Date|||||||";
			      var headCount=ComCountHeadTitle(HeadTitle1);

			      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );

			      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
			      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
			      InitHeaders(headers, info);

			      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
			             {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:1,   SaveName:"vvd_cd",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:"port_cd",         KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Date",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"etda_dt",         KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:"svc_scp_cd",      KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:"io_bnd_cd",       KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:"chg_curr_cd",     KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Float",     Hidden:0,  Width:80,  Align:"Right",   ColMerge:1,   SaveName:"inv_xch_rt",     KeyField:1,   CalcLogic:"",   Format:"NullFloat",   PointCount:6,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Date",     Hidden:0,  Width:0,    Align:"Center",  ColMerge:1,   SaveName:"xch_rt_dt",       KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Text",      Hidden:0,  Width:140,  Align:"Center",  ColMerge:1,   SaveName:"upd_usr_id",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Date",     Hidden:0,  Width:0,    Align:"Center",  ColMerge:1,   SaveName:"upd_dt",          KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"ivs_xch_rt" },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"skd_voy_no" },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"skd_dir_cd" },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"vsl_cd" },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"locl_curr_cd" },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ar_ofc_cd" },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"xch_rt_tp_cd" } ];
			      
			      InitColumns(cols);
			      SetEditable(1);
			      SetWaitImageVisible(0);
			      InitComboNoMatchText(true);
			      SetSheetHeight(500);
			      FitColWidth("15|8|10|8|8|8|8|11|10|8");
				  SetColProperty("io_bnd_cd", {ComboText:"I/B|O/B", ComboCode:"I|O"} );
	              InitComboNoMatchText(1,"",1);
				  resizeSheet();
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
			ComOpenWait(true);
			formObj.f_cmd.value=SEARCH01; 			
			var sXml=sheetObj.GetSearchData("FNS_INV_0101GS.do", FormQueryString(formObj));
			//===========office list =======================//
			var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
			var arrStr=sStr.split("|");
			MakeComboObject2(ar_ofc_cd, arrStr);
			var arrStr2=arrStr[1].split("^");
			var ar_ofc_cd_text=arrStr2[3];
			ar_ofc_cd.SetSelectText(ar_ofc_cd_text);
			//===========office list =======================//
			
			//====== currInfo combo list ====================//
			var comboValues=ComGetEtcData(sXml, "currInfo");	
			addCellComboItem(sheetObjects[0],comboValues,"chg_curr_cd",false);						
			//====== currInfo combo list ====================//
			
			//Port, Scope 는 초기에 ALL 로 세팅
			formObj.vps_port_cd_text.value="ALL";   
			formObj.svc_scp_cd_text.value="ALL";
			ComOpenWait(false);
			break;
			case IBSEARCH_ASYNC02:      //retrieve Port/Scope
        		formObj.f_cmd.value=SEARCH02; 			
        		var sXml=sheetObj.GetSearchData("FNS_INV_0101GS.do", FormQueryString(formObj));
        		//====== port list ====================//
        		var portStr=ComGetEtcData(sXml,"portList");
        		var arrPortStr=portStr.split("|");
        		MakeComboObject(vps_port_cd, arrPortStr);
        		addCellComboItem(sheetObjects[0],portStr,"port_cd",false);
        		//====== scope list ====================//
        		var scpStr=ComGetEtcData(sXml,"svcScpList");
        		var arrScpStr=scpStr.split("|");
        		MakeComboObject(svc_scp_cd, arrScpStr);
        		addCellComboItem(sheetObjects[0],scpStr,"svc_scp_cd",false);
        		
        		vps_port_cd.SetSelectText("ALL");  //default setting
            	svc_scp_cd.SetSelectText("ALL");  //default setting
        		
			break;
			case IBSEARCH:      //retrieve
				if(!validateForm(sheetObj,formObj,sAction)) return;
				ComOpenWait(true);
				formObj.f_cmd.value=SEARCH03; 				
				sheetObj.DoSearch("FNS_INV_0101GS.do",FormQueryString(formObj) );
				ComBtnEnable("btn_downexcel");
				ComOpenWait(false);
			break;
			case IBSAVE:        //save
			if(validateForm(sheetObj,formObj,sAction)){
				ComOpenWait(true);
				formObj.f_cmd.value=MULTI;
				sheetObj.DoSave("FNS_INV_0101GS.do",FormQueryString(formObj)+ "&"+ ComSetPrifix(sheetObj.GetSaveString(),"sheet1_"),-1,false);
				ComOpenWait(false);
				ComBtnEnable("btn_downexcel");
			}
			break;
			case IBDELETE:      // input
			idx=sheetObj.GetSelectRow();
			searchARInvoiceExist(sheetObj,idx);    
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
		//alert("validateForm");
		with(formObj){
			switch(sAction) {
			case IBSEARCH: // retrieve
				if (!ComChkValid(formObj)) return false;
				//if((formObj.vvd_cd.value).length < 9) {
				//	alert("aaa");
				//	return false;
				//}
				break;

			}
			
		}
		return true;
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
		cmbObj.SetDropHeight(190);
		for (var i=1; i < arrStr.length;i++ ) {
			var arrStr2=arrStr[i].split("^");
			var ar_ofc_cd_text=arrStr2[1];
			cmbObj.InsertItem(i-1, ar_ofc_cd_text, arrStr[i]);
		}		
	}    
	
 
	/**
	 * Add data in combo field.
	 */		
	function addCellComboItem(sheetObj,comboValues,colName,isCellCombo) {
		var sRow=sheetObj.GetSelectRow();
		var comboTxt="";
		var comboVal="";
		var comboItems;
		var comboItem;
		var arrStr2;
		if (comboValues != undefined) {
			comboItems=comboValues.split(ROWMARK);
			for (var i=1 ; i < comboItems.length ; i++) {
				arrStr2=comboItems[i].split("^");
				comboItem=comboItems[i].split(FIELDMARK);
				comboTxt += arrStr2[0];
				comboVal += arrStr2[0];
				if (i < comboItems.length-1) {
					comboTxt += ROWMARK;
					comboVal += ROWMARK;
				}
			}
		}
		if (isCellCombo) {
			sheetObj.CellComboItem(sRow,colName, {ComboText:comboTxt, ComboCode:comboVal} );
		}
		else {
			sheetObj.SetColProperty(colName, {ComboText:comboTxt, ComboCode:comboVal} );
		}
	}

	/**
	 * Copy column.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *     sheet1_OnSearchEnd(sheetObjects[0],'');
	 * </pre>
	 * @param object sheetObj
	 * @param string ErrMsg
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function sheet1_OnSearchEnd(sheetObj, Code, ErrMsg){      		
	}
	/**
	 * Sheet Retrieve<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *     sheet1_OnSaveEnd(sheetObjects[0],'');
	 * </pre>
	 * @param object sheetObj
	 * @param string ErrMsg
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function sheet1_OnSaveEnd(sheetObj, Code, ErrMsg){      		
		retrieveFlg=1;
		doActionIBSheet(sheetObj,document.form,IBSEARCH);
	}
	/**
	 * Check Finance Rates.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *     sheet1_OnChange(sheetObjects[0],1,1);
	 * </pre>
	 * @param object sheetObj
	 * @param number Row
	 * @param number col
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function sheet1_OnChange(sheetObj,Row,col){
		var effDt=ComGetUnMaskedValue(ComGetNowInfo(), "ymd");
		if (sheetObj.ColSaveName(col) == "inv_xch_rt") {
			var sValue=sheetObj.GetCellValue(Row,"inv_xch_rt");
			if(sValue==0){
				ComShowCodeMessage("INV00150"); // Exchange rate cannot be zero.
				sheetObj.SetCellValue(Row,"inv_xch_rt","");
				return false;
			}
			var ivs_rate=1/sValue;
			ivs_rate=InvRound(ivs_rate, 4);
			sheetObj.SetCellValue(Row,"ivs_xch_rt",ivs_rate);
			
		}else if(sheetObj.ColSaveName(col) == "port_cd"){
			if(sheetObj.GetCellValue(Row,"vvd_cd").substring(0,4)!='CFDR'&&sheetObj.GetCellValue(Row,"vvd_cd").substring(0,4)!='USAC'){
				document.form.f_cmd.value=SEARCH07;
				document.form.vvd.value=sheetObj.GetCellValue(Row,"vvd_cd");
				document.form.bnd.value=sheetObj.GetCellValue(Row,"io_bnd_cd");
				document.form.port.value=sheetObj.GetCellValue(Row,"port_cd");
				var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(document.form));
				var sStr=ComGetEtcData(sXml,"sail_arr_dt");
				if(sStr==""&&sheetObj.GetCellValue(Row,"port_cd")!=""){
					ComShowCodeMessage("INV00050");
					sheetObj.SetCellValue(Row,"port_cd","");
					document.form.port.value="";
					return;
				}else{
					sheetObj.SetCellValue(Row,"etda_dt",sStr,0);
				}
			}
		}
	}
	/**
	 * Checking the existence Finance Rates.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *     searchARInvoiceExist(sheetObjects[0],1);
	 * </pre>
	 * @param object sheetObj
	 * @param number Row
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function searchARInvoiceExist(sheetObj,Row){  
		document.form2.f_cmd.value=REMOVE;
		document.form2.chg_curr_cd.value=sheetObj.GetCellValue(Row,"chg_curr_cd");
		document.form2.locl_curr_cd.value=document.form.locl_curr_cd.value;
		document.form2.vsl_cd.value=sheetObj.GetCellValue(Row,"vsl_cd");
		document.form2.skd_voy_no.value=sheetObj.GetCellValue(Row,"skd_voy_no");
		document.form2.skd_dir_cd.value=sheetObj.GetCellValue(Row,"skd_dir_cd");
		document.form2.port_cd.value=sheetObj.GetCellValue(Row,"port_cd");
		document.form2.io_bnd_cd.value=sheetObj.GetCellValue(Row,"io_bnd_cd");
		document.form2.svc_scp_cd.value=sheetObj.GetCellValue(Row,"svc_scp_cd"); 		
		var sXml=sheetObj.GetSearchData("FNS_INV_0101GS.do", FormQueryString(document.form2));
		var chkCnt=ComGetEtcData(sXml,"cnt");
		if(sheetObj.GetRowStatus(Row)=="I"){
			sheetObj.SetRowHidden(Row,1);//2.Hiding row.
			sheetObj.SetRowStatus(Row,"D");//3.delete
		}else{
			if(chkCnt =="0"){				
				if (!ComShowCodeConfirm("INV00028")) return;
				sheetObj.SetRowHidden(Row,1);//2.Hiding row.
				sheetObj.SetRowStatus(Row,"D");//3.delete
			}else {
				ComShowCodeMessage("INV00037");
				return;
			}
		}
	}
	/**
	 * When change ar_ofc_cd data, execute function.<br>
	 * Setting office.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   ar_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode);
	 * </pre>
	 * @param {IBMultiCombo} comboObj
	 * @param {String} oldIndex
	 * @param {String} oldText
	 * @param {String} oldCode
	 * @param {String} newIndex
	 * @param {String} newText
	 * @param {String} newCode
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */		  
	function ar_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
		sheetObjects[0].RemoveAll();
		var formObj=document.form;
		var arrStr2=comboObj.GetSelectCode().split("^");
		setOfcOtherInfo(arrStr2);

	    //inv_curr_cd setting
	    inv_curr_cd.RemoveAll();
	    var lclCurr = formObj.locl_curr_cd.value;
	    var altnCurr = formObj.altn_curr_div_cd.value;
	    inv_curr_cd.InsertItem(0, lclCurr, lclCurr);
	    if(lclCurr != altnCurr && altnCurr != "" && altnCurr != "LCL" ) { 
	    	inv_curr_cd.InsertItem(1, altnCurr, altnCurr);
	    	inv_curr_cd.SetSelectText(lclCurr);
	    } else {
	    	inv_curr_cd.SetSelectText(lclCurr);
	    }
	}
	
	/**
	 * When change locl_curr_cd data, execute function.<br>
	 * Setting Local currency.<br>
	 */		  
	function inv_curr_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
		sheetObjects[0].RemoveAll();
		var formObj=document.form;
		formObj.locl_curr_cd.value=inv_curr_cd.GetSelectText();
	}
	/**
	 * Resetting header by option.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   changeHeaderName('I');
	 * </pre>
	 * @param string value
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */		 
	function changeHeaderName(value){
		sheetObjects[0].RemoveAll();
		if(value=='I'){
	
		      var HeadTitle1="|VVD|Port|ETA|Scope|Bound|Charge Curr|Ex. Rate|Ex. Rate Date|Updated By|Updated Date|||||||";
			  var titlearr = "";
			  titlearr = HeadTitle1.split("|");
			  for(var i=0;i<titlearr.length;i++){
				  sheetObjects[0].SetCellValue(0,i,titlearr[i]);
			  }
//			no support[implemented common]CLT 			sheetObjects[0].InitHeadRow(0, "|VVD|Port|ETA|Scope|Bound|Cur.|Ex. Rate|Updated By|Updated Date||||||||");
		}else{
		      var HeadTitle2="|VVD|Port|ETD|Scope|Bound|Charge Curr|Ex. Rate|Ex. Rate Date|Updated By|Updated Date|||||||";
			  var titlearr = "";
			  titlearr = HeadTitle2.split("|");
			  for(var i=0;i<titlearr.length;i++){
				  sheetObjects[0].SetCellValue(0,i,titlearr[i]);
			  }
//			no support[implemented common]CLT 			sheetObjects[0].InitHeadRow(0, "|VVD|Port|ETD|Scope|Bound|Cur.|Ex. Rate|Updated By|Updated Date||||||||");
		}
	}
	/**KEY Event<br>
	 * @author Choi Do Soon
	 * @version 2009.11.10
	 */
	function initControl() {
		// Axon event process. Event catch.
		var formObj=document.form;
		axon_event.addListenerFormat ('keypress', 'obj_keypress', formObj);
		axon_event.addListenerForm ('change', 'obj_onchange', formObj);
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
	function MakeComboObject(cmbObj, arrStr) {
		// Initialize IBMultiCombo.
		for (var i=0; i < arrStr.length;i++ ) {
			cmbObj.InsertItem(i, arrStr[i], arrStr[i]);
		}
		cmbObj.SetDropHeight(190);
	}
	
	/** 
	 * handling OnChange event<br>
	 */
	function obj_onchange() {
		var sheetObj=sheetObjects[0];
		var formObj=document.form;
        switch(ComGetEvent("name")){
            case "vvd_cd":
            	vps_port_cd.RemoveAll();
            	svc_scp_cd.RemoveAll();
            	
            	if((formObj.vvd_cd.value).length == 9) {
	            	vps_port_cd.SetEnable(1);
					svc_scp_cd.SetEnable(1);
	            	doActionIBSheet(sheetObj,formObj,IBSEARCH_ASYNC02);
            	}
           	break;
        }	    
	}
	
    function resizeSheet(){
 		ComResizeSheet(sheetObjects[0]);
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
    	var formObj=document.form;
    	formObj.ar_ofc_cd2.value=arrStr2[1];
    	formObj.ofc_cd.value=arrStr2[1];
    	formObj.svr_id.value=arrStr2[7];     
    	formObj.locl_curr_cd.value=arrStr2[4]; 
    	formObj.altn_curr_div_cd.value=arrStr2[20]; 
    	formObj.xch_rt_rvs_flg.value=arrStr2[8];
    }