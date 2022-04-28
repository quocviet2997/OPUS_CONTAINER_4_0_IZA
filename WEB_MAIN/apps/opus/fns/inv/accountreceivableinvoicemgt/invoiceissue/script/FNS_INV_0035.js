/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0035
*@FileTitle  : Invoice Re-Issue
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/17
=========================================================*/
	/**
	 * fns_inv_0035 : fns_inv_0035 Defining business script. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     fns_inv_0035()
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */

	// Common variables.
	var tabObjects=new Array();
	var tabCnt=0 ;
	var beforetab=1;
	var sheetObjects=new Array();
	var sheetCnt=0;
	//var rdObjects=new Array();
	//var rdCnt=0;
	var appendReport = [];
	// Defining button events. */
	document.onclick=processButtonClick;
	
	var cfmFlg = ""; //2018-04-30	
	var mmFlg = ""; //2018-04-30	
	
	
    /**
     * Preview issue<br>
     *
     * @param none.
     * @return none.
     */
    function getPreviewIssue(){   
    	var sheetObject=sheetObjects[0];
    	var formObject=document.form;
		var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
		formObject.iss_ofc_cd.value=arrStr2[1];
		formObject.ots_smry_cd.value=arrStr2[13];
		if (formObject.sel_option[0].checked){                         		
			var invs="";
			for (var i=0; i < sheetObject.RowCount(); i++) {
				for (var j=0; j < 5; j++) {
					if(sheetObject.GetCellValue(i+1, j) != "") { 
						//invs = invs + (invs == "" ? "" : "'") +sheetObject.CellValue(i+1, j) + "',";
						invs=invs + "'" + sheetObject.GetCellValue(i+1, j) + "',";
					}
				}
			}
			if (invs == "") {
				ComShowCodeMessage("INV00071");
				sheetObject.SetCellValue(1,0,"");
				return false;
			}   
			invs=invs + "''";     
			formObject.flag.value="S";
			formObject.invs.value=invs;
			formObject.prev_flg.value="N";
			formObject.goto_flg.value="N";
			doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20);   
			if (formObject.r_invs.value != "") {
				var r_invs=formObject.r_invs.value;               	
				var arrStr=r_invs.split("|");
				var cmbFlg=formObject.cmb_flg.value;               	
				var arrStr2=cmbFlg.split("|");
				var v_copy_cnt=formObject.copy_cnt.value;  
				//rdObjects[0].SetAppendReport(0);
				for(var i=0; i<arrStr.length-1; i++){
					rdOpen(arrStr[i], 15, formObject.user_nm.value, formObject.iss_ofc_cd.value, "ORIGINAL", "", "", "N", "Y", arrStr2[i]);
					//rdObjects[0].SetAppendReport(1);
					for(var j=0; j<v_copy_cnt; j++) {  						
						rdOpen(arrStr[i], 15, formObject.user_nm.value, formObject.iss_ofc_cd.value, "COPY", "", "", "N", "Y", arrStr2[i]);
					}
					formObject.inv_no.value=arrStr[i];        					
				}  
				// Setting printer.
		    	//var print_nm=form.print_nm.value;
		    	//if(print_nm != ""){
		    	//	rdObjects[0].SetPrintInfo (print_nm, 1, 1, 4);
		    	//}
				//rdObjects[0].CMPrint (); // Starting printer.
				//rdObjects[0].SetAppendReport(0);
				//viewer.openFile(appendReport, {timeout:3000});
				//viewer.print({isServerSide:true}); // Starting printer.
				directReportDownload(appendReport);
				appendReport = [];				
			} else {
				ComShowCodeMessage("INV00097");
				return false;
			}   
		} else {
			var v_f_inv=formObject.f_inv.value;
			var v_t_inv=formObject.t_inv.value;
			var inv_no="";
			if (v_f_inv == "") {
				ComShowCodeMessage("INV00004");
				formObject.f_inv.focus();
				return false;
			}
			if (v_t_inv == "") {
				ComShowCodeMessage("INV00004");
				formObject.t_inv.focus();
				return false;
			}
			formObject.flag.value="M";
			formObject.prev_flg.value="N";
			formObject.goto_flg.value="N";
			doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20);   
			if (formObject.r_invs.value != "") {
				var r_invs=formObject.r_invs.value;               	
				var arrStr=r_invs.split("|");
				var v_copy_cnt=formObject.copy_cnt.value;  
				//rdObjects[0].SetAppendReport(0);
				for(var i=0; i<arrStr.length-1; i++){
					rdOpen(arrStr[i], 15, formObject.user_nm.value, formObject.iss_ofc_cd.value, "ORIGINAL", "", "", "N", "Y", "");
					//rdObjects[0].SetAppendReport(1); 
					for(var j=0; j<v_copy_cnt; j++) {  						
						rdOpen(arrStr[i], 15, formObject.user_nm.value, formObject.iss_ofc_cd.value, "COPY", "", "", "N", "Y", "");
					}
					formObject.inv_no.value=arrStr[i];        					
				}  
				// Setting printer.
		    	//var print_nm=form.print_nm.value;
		    	//if(print_nm != ""){
		    	//	rdObjects[0].SetPrintInfo (print_nm, 1, 1, 4);
		    	//}
				//rdObjects[0].CMPrint (); // Starting printer.
				//rdObjects[0].SetAppendReport(0);           	
				//viewer.openFile(appendReport, {timeout:3000});
				//viewer.print({isServerSide:true}); // Starting printer.
				directReportDownload(appendReport);
				appendReport = [];
			} else {
				ComShowCodeMessage("INV00097");
				return false;
			}                        	
		} 
		cfmFlg = ""; //2018-04-30	
		mmFlg = ""; //2018-04-30	
    }
	/**
	 * Handling button event. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     processButtonClick();
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function processButtonClick(){
		/***** Setting each tab's sheet variable. *****/
		var sheetObject=sheetObjects[0];
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch(srcName) {
			case "btn_paper":
				var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
				formObject.iss_ofc_cd.value=arrStr2[1];
				formObject.ots_smry_cd.value=arrStr2[13];
				if (formObject.sel_option[0].checked){                         		
					var invs="";
					for (var i=0; i < sheetObject.RowCount(); i++) {
						for (var j=0; j < 5; j++) {
							if(sheetObject.GetCellValue(i+1, j) != "") {
								//invs = invs + (invs == "" ? "" : "'") +sheetObject.CellValue(i+1, j) + "',";
								var inputedInvNo = sheetObject.GetCellValue(i+1, j);
									if(!chkInvFormat(inputedInvNo)){								
										ComShowCodeMessage("INV00166", inputedInvNo);
										return false;
									}
								invs=invs + "'" + sheetObject.GetCellValue(i+1, j) + "',";
							}
						}
					}
					if (invs == "") {
						ComShowCodeMessage("INV00071");
						sheetObject.SetCellValue(1,0,"");
						return false;
					} 
					
					
					invs=invs + "''";     
					formObject.flag.value="S";
					formObject.invs.value=invs;
					formObject.prev_flg.value="N";
					formObject.goto_flg.value="N";
					doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20); 
					
					if(formObject.state.value == "F"){
						ComOpenWait(false);
						ComShowCodeMessage("INV00087");
						return false;
					}
					
					ComOpenWait(true);
					setTimeout( function () {	
						if (formObject.r_invs.value != "") {
							var r_invs=formObject.r_invs.value;               	
							var arrStr=r_invs.split("|");
							var cmbFlg=formObject.cmb_flg.value;               	
							var arrStr2=cmbFlg.split("|");
							//2015.07.31 Save ISS_GRP_TP_CD column to print same form in case of Re-issue by IY Cho
							var issGrpTpCd=formObject.iss_grp_tp_cd.value;               	
							var arrStr3=issGrpTpCd.split("|");
							var v_copy_cnt=formObject.copy_cnt.value;  
							//rdObjects[0].SetAppendReport(0);
							for(var i=0; i<arrStr.length-1; i++){
								rdOpen(arrStr[i], 15, formObject.user_nm.value, formObject.iss_ofc_cd.value, "ORIGINAL", "", "", "N", "Y", arrStr2[i], arrStr3[i]);
								//rdObjects[0].SetAppendReport(1);
								for(var j=0; j<v_copy_cnt; j++) {  						
									rdOpen(arrStr[i], 15, formObject.user_nm.value, formObject.iss_ofc_cd.value, "COPY", "", "", "N", "Y", arrStr2[i], arrStr3[i]);
								}
								formObject.inv_no.value=arrStr[i];        					
							}  
							ComOpenWait(false);
							
							// Setting printer.
					    	//var print_nm=form.print_nm.value;
					    	//if(print_nm != ""){
					    	//	rdObjects[0].SetPrintInfo (print_nm, 1, 1, 4);
					    	//}
					    	
							//rdObjects[0].CMPrint (); // Starting printer.
							//rdObjects[0].SetAppendReport(0);
							//viewer.openFile(appendReport, {timeout:3000});
							//viewer.print({isServerSide:true}); // Starting printer.
							directReportDownload(appendReport);
							appendReport = [];
							
						} else {
							ComOpenWait(false);
							ComShowCodeMessage("INV00097");
							return false;
						}
					} , 100);	
				} else {
					var v_f_inv=formObject.f_inv.value;
					var v_t_inv=formObject.t_inv.value;
					var inv_no="";
					if (v_f_inv == "") {
						ComShowCodeMessage("INV00004");
						formObject.f_inv.focus();
						return false;
					}
					if (v_t_inv == "") {
						ComShowCodeMessage("INV00004");
						formObject.t_inv.focus();
						return false;
					}
					if(!chkInvFormat(v_f_inv)){								
						ComShowCodeMessage("INV00166", v_f_inv);
						return false;
					}
					if(!chkInvFormat(v_t_inv)){
						ComShowCodeMessage("INV00166", v_t_inv);
						return false;
					}
					
					
					formObject.flag.value="M";
					formObject.prev_flg.value="N";
					formObject.goto_flg.value="N";
					doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20);   
					
					if(formObject.state.value == "F"){
						ComOpenWait(false);
						ComShowCodeMessage("INV00087");
						return false;
					}
					
					ComOpenWait(true);
					
					setTimeout( function () {	
						if (formObject.r_invs.value != "") {
							var r_invs=formObject.r_invs.value;               	
							var arrStr=r_invs.split("|");
							//2015.07.31 Save ISS_GRP_TP_CD column to print same form in case of Re-issue by IY Cho
							var issGrpTpCd=formObject.iss_grp_tp_cd.value;               	
							var arrStr3=issGrpTpCd.split("|");
							var v_copy_cnt=formObject.copy_cnt.value;  
							//rdObjects[0].SetAppendReport(0);
							for(var i=0; i<arrStr.length-1; i++){
								rdOpen(arrStr[i], 15, formObject.user_nm.value, formObject.iss_ofc_cd.value, "ORIGINAL", "", "", "N", "Y", "", arrStr3[i]);
								//rdObjects[0].SetAppendReport(1);
								for(var j=0; j<v_copy_cnt; j++) {  						
									rdOpen(arrStr[i], 15, formObject.user_nm.value, formObject.iss_ofc_cd.value, "COPY", "", "", "N", "Y", "", arrStr3[i]);
								}
								formObject.inv_no.value=arrStr[i];        					
							}
							ComOpenWait(false);  
							// Setting printer.
					    	//var print_nm=form.print_nm.value;
					    	//if(print_nm != ""){
					    	//	rdObjects[0].SetPrintInfo (print_nm, 1, 1, 4);
					    	//}
							//rdObjects[0].CMPrint (); // Starting printer.
							//rdObjects[0].SetAppendReport(0);      
					    	//viewer.openFile(appendReport, {timeout:3000});
							//viewer.print({isServerSide:true}); // Starting printer.
							directReportDownload(appendReport);
							appendReport = [];
						} else {
							ComOpenWait(false);
							ComShowCodeMessage("INV00097");
							return false;
						}   
					} , 100);	
				}
				cfmFlg = ""; //2018-04-30	
				mmFlg = ""; //2018-04-30	
				
				break;
			case "btn_new":
				formObject.sel_option[0].checked=true;
				clickOption();
				ar_ofc_cd.text=formObject.user_ofc.value;
				cfmFlg = ""; //2018-04-30		
				mmFlg = ""; //2018-04-30	
				break;
			case "btn_goto":
				var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
				formObject.iss_ofc_cd.value=arrStr2[1];
				formObject.office_cnt_cd.value=arrStr2[6].substring(0,2);
				if (formObject.sel_option[0].checked){                         		
					var invs="";
					for (var i=0; i < sheetObject.RowCount(); i++) {
						for (var j=0; j < 5; j++) {
							if(sheetObject.GetCellValue(i+1, j) != "") {
								//invs = invs + (invs == "" ? "" : "'") +sheetObject.CellValue(i+1, j) + "',";
								var inputedInvNo = sheetObject.GetCellValue(i+1, j);
								if(!chkInvFormat(inputedInvNo)){								
									ComShowCodeMessage("INV00166", inputedInvNo);
									return false;
								}
								invs=invs + "'" + sheetObject.GetCellValue(i+1, j) + "',";
							}
						}
					}
										
					if (invs == "") {
						ComShowCodeMessage("INV00071");
						sheetObject.SetCellValue(1,0,"");
						return false;
					}   
					
					invs=invs + "''";     
					
					formObject.flag.value="S";
					formObject.invs.value=invs;
					//formObject.goto_flg.value = "Y";
					formObject.prev_flg.value="Y";
					
					
					doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20);   
					if (formObject.r_invs.value == "") {
						ComShowCodeMessage("INV00097");  //There is no data for issue.
						return false;
					}   
				} else {
					var v_f_inv=formObject.f_inv.value;
					var v_t_inv=formObject.t_inv.value;
					var inv_no="";
					if (v_f_inv == "") {
						ComShowCodeMessage("INV00004");
						formObject.f_inv.focus();
						return false;
					}
					if (v_t_inv == "") {
						ComShowCodeMessage("INV00004");
						formObject.t_inv.focus();
						return false;
					}
					if(!chkInvFormat(v_f_inv)){								
						ComShowCodeMessage("INV00166", v_f_inv);
						return false;
					}
					if(!chkInvFormat(v_t_inv)){
						ComShowCodeMessage("INV00166", v_t_inv);
						return false;
					}				
					
					formObject.flag.value="M";
					//formObject.goto_flg.value = "Y";
					formObject.prev_flg.value="Y";
					doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20);   
					if (formObject.r_invs.value == "") {
						ComShowCodeMessage("INV00097");  //There is no data for issue.
						return false;
					}                        	
				}         				
				var invs="";
				for (var i=0; i < sheetObject.RowCount(); i++) {
					for (var j=0; j < 5; j++) {
						if(sheetObject.GetCellValue(i+1, j) != "") {
							//invs = invs + (invs == "" ? "" : "'") +sheetObject.CellValue(i+1, j) + "',";
							invs=invs + "'" + sheetObject.GetCellValue(i+1, j) + "',";
						}
					}
				}
				invs=invs + "''";			
				formObject.invs_email.value=invs;   
				openEmail();
				break;
			case "btn_close":
				ComClosePopup(); 
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
	 * Register IBSheet object on array. <br>
	 *  <br>
	 * Array define top on source. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     setSheetObject(sheetObj);
	 * </pre>
	 * @param {ibsheet} sheetObj required IBSheet Object
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function setSheetObject(sheetObj){
		sheetObjects[sheetCnt++]=sheetObj;
	}
	/**
	 * Initialize sheets. <br>
	 * Coding event handler for body tag's OnLoad. <br>
	 * After complete on load, add pre-function. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     loadPage();
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function loadPage() {
		for(i=0;i<sheetObjects.length;i++){
			ComConfigSheet (sheetObjects[i] );
			initSheet(sheetObjects[i],i+1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		for(k=0;k<tabObjects.length;k++){
			initTab(tabObjects[k],k+1);
		}
		
		sheet1_OnLoadFinish(sheetObjects[0]);
		initControl();
		//initRdConfig(rdObjects[0]);
		
		doActionIBSheet(sheetObjects[0], document.form,IBSEARCH_ASYNC02);
		cfmFlg = ""; //2018-04-30	
		mmFlg = ""; //2018-04-30	
	}
	/**
	 * Coding event for sheet1_OnLoadFinish.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     sheet1_OnLoadFinish(sheetObj);
	 * </pre>
	 * @param {ibsheet} sheetObj required IBSheet Object
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function sheet1_OnLoadFinish(sheetObj) {
		for(var i=0; i<20; i++){			
			sheetObj.DataInsert(-1);
		}
		sheetObj.SelectCell(1,0,false);
		doActionIBSheet(sheetObj,document.form,IBSEARCH);    
		var ar_ofc_cd=document.form.ar_ofc_cd.text
	}
	/**
	 * Initialize sheet. Define header. <br> 
	 * Initialize moudle by sheet count. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     initSheet(sheetObj, 0);
	 * </pre>
	 * @param {ibsheet} sheetObj required IBSheet Object
	 * @param {int} sheetNo sheet object  
	 * @return none. 
	 * @author 
	 * @version 2009.10.20     
	 */  
	function initSheet(sheetObj,sheetNo) {
		var cnt=0;
		var sheetID=sheetObj.id;
		switch(sheetID) {
		case "sheet1":  
		    with(sheetObj){
	        
	      var HeadTitle="1|2|3|4|5";

	      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );

	      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
	      var headers = [ { Text:HeadTitle, Align:"Center"} ];
	      InitHeaders(headers, info);

	      var cols = [ {Type:"Text",      Hidden:0,  Width:230,  Align:"Center",  ColMerge:0,   SaveName:"A",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:15 },
	                   {Type:"Text",      Hidden:0,  Width:230,  Align:"Center",  ColMerge:0,   SaveName:"B",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:15 },
	                   {Type:"Text",      Hidden:0,  Width:230,  Align:"Center",  ColMerge:0,   SaveName:"C",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:15 },
	                   {Type:"Text",      Hidden:0,  Width:230,  Align:"Center",  ColMerge:0,   SaveName:"D",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:15 },
	                   {Type:"Text",      Hidden:0,  Width:230,  Align:"Center",  ColMerge:0,   SaveName:"E",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:15 } ];
	       
	      InitColumns(cols);

	      SetWaitImageVisible(0);
	      SetEditable(1);
	      SetRowHidden(0, 1);
	      SetSheetHeight(330);
	      SetSheetWidth(1200);
	      }


			break;
		}
	}
	/**
	 * Process function for sheet. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     doActionIBSheet(sheetObj, document.form, IBSEARCH);
	 * </pre>
	 * @param {ibsheet} sheetObj required IBSheet Object
	 * @param {form} formObj required html form object
	 * @param {int} sAction 
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function doActionIBSheet(sheetObj,formObj,sAction) {
		sheetObj.ShowDebugMsg(false);
		switch(sAction) {
		case IBSEARCH: // AR Office & Number of copy invoice retrieve
			formObj.f_cmd.value=SEARCH;
			var sXml=sheetObj.GetSearchData("FNS_INV_0035GS.do", FormQueryString(formObj));
			var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
			var arrStr=sStr.split("|");
			MakeComboObject(ar_ofc_cd, arrStr);
			var arrStr2=arrStr[1].split("^");
			var office_cnt_cd="";
			//2015.01.30 Retrieve Country of office by IY Cho
 			for (var i=1; i < arrStr.length; i++) {
 				var arrStr3=arrStr[i].split("^");
	 			if (arrStr3[1] == arrStr3[3]) {
	 				office_cnt_cd=arrStr3[6].substring(0,2);
	 				formObj.office_cnt_cd.value = office_cnt_cd;
	 			}
 			}
			var v_ar_ofc_cd=arrStr2[3];
			var ofc_idx = ar_ofc_cd.FindItem(v_ar_ofc_cd, 0, true);
			
			if( ofc_idx >= 0){
	      		ar_ofc_cd.SetItemCheck(ofc_idx, true);
			}	
			formObj.copy_cnt.value=ComGetEtcData(sXml,"copy_cnt");				        
			//formObj.ar_ofc_cd.text=v_ar_ofc_cd;
			
	
			var sStr=ComGetEtcData(sXml,"inv_prn_dvc_nm");
			formObj.print_nm.value=sStr;
			var arrStr3=ar_ofc_cd.GetSelectCode().split("^");
			formObj.inv_mlt_bl_iss_flg.value=arrStr3[15]; 	
			//2014.10.16 INV Form logic change by IY Cho
			formObj.ots_smry_cd.value = arrStr3[13];
		break;    
		case IBSEARCH_ASYNC10: // Number of copy invoice retrieve
			var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
			formObj.iss_ofc_cd.value=arrStr2[1];
			formObj.f_cmd.value=SEARCH;
			var sXml=sheetObj.GetSearchData("FNS_INV_0035GS.do", FormQueryString(formObj));
			formObj.copy_cnt.value=ComGetEtcData(sXml,"copy_cnt");
		break;	
		case IBSEARCH_ASYNC20: // invoice number check
			var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
			formObj.iss_ofc_cd.value=arrStr2[1];
			formObj.f_cmd.value=SEARCH01;
			ComOpenWait(true);
			var sXml=sheetObj.GetSearchData("FNS_INV_0035GS.do", FormQueryString(formObj));
			var state=ComGetEtcData(sXml,ComWebKey.Trans_Result_Key);
	        formObj.state.value = state;			
	        if (state == "F") {
	            return true;  
	        }
			ComOpenWait(false);	
			var sStr=ComGetEtcData(sXml,"r_inv_nos");
			formObj.r_invs.value=sStr;
			
			var sStr2=ComGetEtcData(sXml,"cmb_flg");
			formObj.cmb_flg.value=sStr2;
			
			var sStr3=ComGetEtcData(sXml,"iss_grp_tp_cd");
			formObj.iss_grp_tp_cd.value=sStr3;
			
			var sStr4=ComGetEtcData(sXml,"grp_iss_flg");
			formObj.grp_inv_flg.value=sStr4;
		break;	
		case IBINSERT:      // input
		break;
		case IBSEARCH_ASYNC02: // Tax country retrieve
			var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
			formObj.ar_ofc_cd2.value=arrStr2[1];			
			formObj.f_cmd.value=SEARCH02;
	 		var sXml=sheetObj.GetSearchData("FNS_INV_0035GS.do", FormQueryString(formObj));
			var sStr=ComGetEtcData(sXml,"tax_cnt_flg");
			formObj.tax_cnt_flg.value=sStr;
			break;
		}
	}
	/**
	 * Coding event for OnKeyPress.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *    initControl();
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function initControl() {
		// Axon event process. Event catch.
		var formObject=document.form;
		axon_event.addListenerFormat ('keypress', 'objKeypress', formObject);            
		axon_event.addListenerFormat('blur', 'objBlur', formObject);  
	//	axon_event.addListenerFormat('beforeactivate', 'objActivate', formObject);      
	}
	/**
	 * Coding event for OnKeyPress.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *    objKeypress();
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function objKeypress() {
		switch(event.srcElement.dataformat){        	    
		case "engup":
			switch(event.srcElement.name){
			case "f_inv":	
				// Only upper case or number.  	        
				ComKeyOnlyAlphabet('uppernum'); 
				break;		
			case "t_inv":	
				// Only upper case or number.		    	        
				ComKeyOnlyAlphabet('uppernum'); 
				break;
			}
			break;              
		default:
			// Only number.
			ComKeyOnlyNumber(event.srcElement);
		}
	}         
	/**
	 * Coding event for blur.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *    objBlur();
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function objBlur(){
		var formObject=document.form;
		switch(event.srcElement.name){
		case "f_inv":	
			//chkInvNum(formObject.f_inv.value);
			chk_inv_per(event.srcElement);
			break;
		case "t_inv":	
			chk_inv_per(event.srcElement);
			break;
		}
	}
	/**
	 * Invoice Number check <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *    chkInvNum(obj);
	 * </pre>
	 * @param {form} obj required html form object
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function chkInvNum(obj) {        	
		var v_inv_no=obj.value;
		var v_inv_no_e="";
		var v_inv_no_n="";
		if (v_inv_no.length != 0) {
			if (v_inv_no.length != 9) {
				ComShowCodeMessage("INV00019");
				obj.focus();
				obj.value="";
				return false;          		    
			}
			return true;
		}        	
	}
	/**
	 * Invoice Number check <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     chkInvNum2(sheetObj,Row,Col,Value);
	 * </pre>
	 * @param {ibsheet} sheetObj required IBSheet Object
	 * @param {int} Row ibsheet row
	 * @param {int} Col ibsheet col
	 * @param {String} value ibsheet row, col value
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */ 
	function chkInvNum2(sheetObj,Row,Col,Value) {        	
		var v_inv_no=Value;
		var v_inv_no_e="";
		var v_inv_no_n="";
		if (v_inv_no.length != 0) {
			if (v_inv_no.length != 9) {
				ComShowCodeMessage("INV00019");
				sheetObj.SetCellValue(Row,Col,"");
				sheetObj.SelectCell(Row,Col);
				return false;          		    
			}
			v_inv_no_e=v_inv_no.substr(0,2);
			v_inv_no_n=v_inv_no.substr(2,9);
			if(!ComIsAlphabet(v_inv_no_e, "u") || !ComIsNumber(v_inv_no_n) ) {
				ComShowCodeMessage("INV00019");
				sheetObj.SetCellValue(Row,Col,"");
				return false; 
			}
			return true;
		}        	
	}
	/**
	 * Number scope check <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *    chk_inv_per(obj);
	 * </pre>
	 * @param {form} obj required html form object
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function chk_inv_per(obj) {  
		if(!chkInvNum(obj)) {
			return false;
		}
		var formObject=document.form;
		var v_inv_no_frm=formObject.f_inv.value;
		var v_inv_no_to=formObject.t_inv.value;
		if(v_inv_no_frm.length == 9 && v_inv_no_to.length == 9) {
			if(Number(v_inv_no_frm.substr(2,9)) > Number(v_inv_no_to.substr(2,9))) {
				ComShowCodeMessage("INV00020");
				formObject.t_inv.focus();
				formObject.t_inv.value="";
				return false; 
			}  
			return true;
		}        	
	}
	/**
	 * Coding event for sheet1_OnChange<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     sheet1_OnChange(sheetObj,Row,Col,Value);
	 * </pre>
	 * @param {ibsheet} sheetObj required IBSheet Object
	 * @param {int} row
	 * @param {int} column
	 * @param {String} value
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function sheet1_OnChange(sheetObj,Row,Col,Value){        	
		invnoDupChk(sheetObj,Value);
		sheetObj.SetCellValue(Row,Col,Value.toUpperCase(),0);
	}
	/**
	 * Initialize office combo. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     MakeComboObject(cmbObj, arrStr);
	 * </pre>
	 * @param {ibCombo} cmbObj required IBCombo Object
	 * @param {String} 
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function MakeComboObject(cmbObj, arrStr) {
		cmbObj.RemoveAll();
		for (var i=1; i < arrStr.length;i++ ) {
			var arrStr2=arrStr[i].split("^");
			var ar_ofc_cd=arrStr2[1];
			cmbObj.InsertItem(i-1, ar_ofc_cd, arrStr[i]);
		}
		cmbObj.SetBackColor("#CCFFFD");
		cmbObj.SetDropHeight(190);
	}  
	/**
	 * When change a office, event<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     ar_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode);
	 * </pre>
	 * @param {IBMultiCombo} comboObj
     * @param {String} oldIndex
     * @param {String} oldText
     * @param {String} oldCode
     * @param {String} newIndex
     * @param {String} newText
     * @param {String} newCode
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function ar_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){
		var formObject=document.form;
		var arrStr2 = ar_ofc_cd.GetSelectCode().split("^");
		formObject.iss_ofc_cd.value =arrStr2[1];
		formObject.ar_ofc_cd2.value=arrStr2[1];	
		formObject.ots_smry_cd.value = arrStr2[13];
		formObject.inv_mlt_bl_iss_flg.value = arrStr2[15];
		formObject.office_cnt_cd.value = arrStr2[6].substring(0,2);
		
		doActionIBSheet(sheetObjects[0], formObject,IBSEARCH_ASYNC02);
		
		getCopyCnt();
	}
	/**
	 * Number of copy invoice retrieve <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     getCopyCnt();
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function getCopyCnt() {
		var sheetObject=sheetObjects[0];
		var formObject=document.form;		    
		doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC10);	    	
	}
	/**
	 * Select Option click <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     clickOption();
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function clickOption() {
		var formObj=document.form;
		var sheetObj=sheetObjects[0];
		if (formObj.sel_option[0].checked) {
			formObj.f_inv.value="";
			formObj.t_inv.value="";
			formObj.f_inv.readOnly=true;
			formObj.t_inv.readOnly=true;
			document.getElementById("f_inv").className="input2";
			document.getElementById("t_inv").className="input2";
			sheetObj.SetEditable(1);
			//sheetObj.SheetBackColor = "#FFFFFF"; 
			sheetObj.RemoveAll();
			for(var i=0; i<20; i++){
				sheetObj.DataInsert(-1);
			}
			setColor(sheetObj, "E");
			sheetObj.SelectBackColor="#E7FAF6";
			sheetObj.SelectCell(1,0);
			//formObj.btn_search.disabled = false;
		} else {
			formObj.f_inv.value="";
			formObj.t_inv.value="";
			formObj.f_inv.readOnly=false;
			formObj.t_inv.readOnly=false;
			document.getElementById("f_inv").className="input1";
			document.getElementById("t_inv").className="input1";
			sheetObj.SetEditable(0);
			//sheetObj.SheetBackColor = "#E8E7EC";   		 
			sheetObj.RemoveAll();
			for(var i=0; i<20; i++){
				sheetObj.DataInsert(-1);
			}
			setColor(sheetObj, "D");
			sheetObj.SelectBackColor="#E8E7EC";
			formObj.f_inv.focus();	
			//formObj.btn_search.disabled = true;
		}
	}
	/**
	 * Change sheet color<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     setColor(sheetObj, key);
	 * </pre>
	 * @param {ibsheet} sheetObj required IBSheet Object
	 * @param {String} key color 
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */ 
	function setColor(sheetObj, key){
		for (var i=1; i<=sheetObj.RowCount(); i++) {
			for (var j=0; j<5; j++) {
				if (key == "E") {        			
					sheetObj.SetCellBackColor(i,j,"#FFFFFF");
				} else {
					sheetObj.SetCellBackColor(i,j,"#E8E7EC");
				}    		        		
			}               	
		}            
	} 
	/**
	 * Invoice Number check <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     invnoDupChk(sheetObj,Value);
	 * </pre>
	 * @param {ibsheet} sheetObj required IBSheet Object
	 * @param {String} value 
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */ 
	function invnoDupChk(sheetObj,value){
		var cnt=0;
		for (var i=1; i<=sheetObj.RowCount(); i++) {
			for (var j=0; j<5; j++) {
				if (value != "" && value == sheetObj.GetCellValue(i, j)) {
					cnt++;
					if (cnt > 1) {
						ComShowCodeMessage("INV00021");
						sheetObj.SetCellValue(i, j,"");
						return;
					}
				}        		        		
			}               	
		}            
	}   
	/**
	 * Initialize RD object. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     initRdConfig(rdObject)
	 * </pre>
	 * @param {rdviewer} rdObject Rdviewer Object
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */ 
	function initRdConfig(rdObject){
		var Rdviewer=rdObject ;
		//Rdviewer.SetSheetHeight(0);
		Rdviewer.style.width=0;
		Rdviewer.AutoAdjust=true;
		Rdviewer.ViewShowMode(0);
		Rdviewer.SetBackgroundColor(128,128,128);
		Rdviewer.SetPageLineColor(128,128,128);
		Rdviewer.ApplyLicense("0.0.0.0"); 
	}
	/**
	 * Invoice Issue (Email) screen open <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     openEmail()
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */ 
	function openEmail() {
		var formObject=document.form;
		var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
		var issOfcCd=arrStr2[1];
		formObject.ar_ofc_cd2.value=arrStr2[1];	
		var invMltBlIssFlg=formObject.inv_mlt_bl_iss_flg.value;
		//2014.10.16 INV Form logic change by IY Cho
		var otsSmryCd = formObject.ots_smry_cd.value;
		var officeCntCd = formObject.office_cnt_cd.value;
		var taxCntFlg = formObject.tax_cnt_flg.value;
		//ComOpenWindowCenter("FNS_INV_0034_02.do?issueGubn=R&invMltBlIssFlg="+invMltBlIssFlg+"&otsSmryCd="+otsSmryCd+"&officeCntCd="+officeCntCd, "pop", 1010, 700);
		var param = "issueGubn=R&invMltBlIssFlg="+invMltBlIssFlg+"&otsSmryCd="+otsSmryCd+"&officeCntCd="+officeCntCd+"&taxCntFlg="+taxCntFlg;
		//alert(param);
		ComOpenWindowCenter("FNS_INV_0034_02.do?"+param, "pop", 1010, 700, true);
	
	}
	/**
	 * Invoice Search (FNS_INV_0106) screen open <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     openFnsInv0106()
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */ 
	function openFnsInv0106() {
		var formObject=document.form;
		var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
		var issOfcCd=arrStr2[1];
		var selOption="";
		if (formObject.sel_option[0].checked) {
			selOption="S"; 	
		} else {
			selOption="M"; 
		}
		 var Row = 1;
		 var Col = 1;
		ComOpenPopup('/opuscntr/FNS_INV_0106.do?sel_option='+selOption+'&iss_ofc_cd='+issOfcCd, 800, 475, 'getFnsInv0106', '1,0,1', false, false, Row, Col,0);
		
	}    
	/**
	 * Call function on popup.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     openFnsInv0106()
	 * </pre>
	 * @param rowArray
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */ 
	function getFnsInv0106(rowArray) {
		var sheetObj=sheetObjects[0];

		var cnt=0;
		for (var i=1; i<=sheetObj.RowCount(); i++) {
			for (var j=0; j<5; j++) {
				sheetObj.SetCellValue(i, j,rowArray[cnt++]);
			}
		}
	}
	/**
	 * Invoice Search (FNS_INV_0109) screen open <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     openFnsInv0109()
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */ 
	function openFnsInv0109() {
		var formObject=document.form;
		var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
		var issOfcCd=arrStr2[1];
		var selOption="";
		if (formObject.sel_option[0].checked) {
			selOption="S"; 	
		} else {
			selOption="M"; 
		}
		ComOpenPopup('/opuscntr/FNS_INV_0109.do?sel_option='+selOption+'&iss_ofc_cd='+issOfcCd, 800, 440, 'getFnsInv0109', '1,0,1,1,1', false, false);
	}
	/**
	 * Call function on popup.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     openFnsInv0109()
	 * </pre>
	 * @param rowArray
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */ 
	function getFnsInv0109(rowArray) {
		var sheetObj=sheetObjects[0];
		var invNos="";
		for (var i=0; i<rowArray.length; i++) {
			if (invNos.indexOf(rowArray[i][2]) == -1) {
				invNos=invNos + rowArray[i][2] + "|" ;
			}
		}
		var arrStr=invNos.split("|");
		var cnt=0;
		for (var i=1; i<=sheetObj.RowCount(); i++) {
			for (var j=0; j<5; j++) {
				sheetObj.SetCellValue(i, j,arrStr[cnt++]);
			}
		}
	}
	/**
	 * Invoice Search screen open <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     openInvPopUp()
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */ 
	function openInvPopUp() {
		var formObject=document.form;
		var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
		var issOfcCd=arrStr2[1];
		openFnsInv0106();	
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
	 * @param {String} cmbFlg SGNBB Rd file
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */ 
	function rdOpen(inv_no, line_num, user_nm, ofc_cd, logo, vvd, port_cd, attach, paperYn, cmbFlg, iss_grp_tp_cd){
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
		var grp_inv_flg = formObj.grp_inv_flg.value.substr(0,1);
		
		//2015.07.31 Save ISS_GRP_TP_CD column to print same form in case of Re-issue by IY Cho
		if(ots_smry_cd == "INV" || inv_mlt_bl_iss_flg == "N"){
			rdFile = "FNS_INV_0001.mrd";
		}else{
			if(iss_grp_tp_cd == "C" || iss_grp_tp_cd == ""){
				rdFile = "FNS_INV_0003.mrd";
			}else if(iss_grp_tp_cd == "V"){
				rdFile = "FNS_INV_0002.mrd";
			}
		}
		
		if(office_cnt_cd == "BR"){
			if(ots_smry_cd == "INV" || inv_mlt_bl_iss_flg == "N"){
				rdFile = "FNS_INV_0005.mrd";
			}else{
				if(iss_grp_tp_cd == "C" || iss_grp_tp_cd == ""){
					rdFile = "FNS_INV_0004.mrd";
				}else if(iss_grp_tp_cd == "V"){
					rdFile = "FNS_INV_0006.mrd";
				}
			}
//		}else if(office_cnt_cd == "FR"){
//			rdFile = "FNS_INV_0522.mrd";
		}else if(office_cnt_cd == "IN"){
			if(grp_inv_flg =="Y"){
				rdFile = "FNS_INV_0516.mrd";
			}else{
				if(inv_no.length > 9){
					rdFile = "FNS_INV_0515.mrd";
				}else{
					rdFile = "FNS_INV_0514.mrd";
				}
			}
		}else if(office_cnt_cd == "TH"){
			rdFile = "FNS_INV_0540.mrd";
		}else if(office_cnt_cd == "VN"){
			rdFile = "FNS_INV_0531_SINGLE.mrd";
		}else if(office_cnt_cd == "KR"){
			if(formObj.ar_ofc_cd2.value == 'PUSBB'){
				rdFile = "FNS_INV_0104.mrd";
			}
		}

//*********** JHJ 2018.01  START!  *************      
		if(tax_cnt_flg =="Y"){
			
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

		if(rdFile==""){
			rdFile="FNS_INV_0003.mrd";
		}

		
		rdParam = "/rv frm1_inv_no["+inv_no+"] frm1_logo["+logo+"] frm1_login_nm ["+user_nm+"] frm1_ofc_cd ["+ofc_cd+"] frm1_line_num ["+line_num+"] frm1_vsl_cd["+vvd.substr(0,4)+"] frm1_skd_voy_no["+vvd.substr(4,4)+"] frm1_skd_dir_cd["+vvd.substr(8,1)+"] frm1_port_cd ["+port_cd+"] frm1_att_gb ["+attach+"] frm1_paper_yn ["+paperYn+"] frm1_issue_type["+issue_type+"] frm1_att_gb2[N] frm1_cust_cnt_cd[] frm1_cust_seq[] frm1_mm_flg["+mmFlg+"]";
		//alert(rdParam);
		var rdUrl="apps/opus/fns/inv/accountreceivableinvoicemgt/invoiceissue/report/";
		//Rdviewer.FileOpen(RD_path + rdUrl + rdFile, RDServer + rdParam + "/rpagenuminit [1] /riprnmargin /rwait");
		appendReport.push({mrdPath:RD_path + rdUrl + rdFile, mrdParam: RDServer + rdParam + "/rpagenuminit [1] /riprnmargin /rwait"});
	}     
	
	/* 
	 * Inputed Invoice No Format Check (2 Alphabets, 7 Numbers)
	 */
	function chkInvFormat(inputedInvNo){
		if(inputedInvNo.length != 9 && inputedInvNo.length != 13){
			return false;			
		}else if(!ComIsAlphabet(inputedInvNo.substring(0,2))){
			return false;
		}else if(!ComIsNumber(inputedInvNo.substring(2,9))) {
			return false;
		}
			return true;
	}