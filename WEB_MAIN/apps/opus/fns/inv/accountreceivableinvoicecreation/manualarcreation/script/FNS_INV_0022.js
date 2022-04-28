/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0022.js
*@FileTitle  : Other Revenue Invoice Creation 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/23
=========================================================
*/
    var sheetObjects=new Array();
    var sheetCnt=0;
	//IBMultiCombo
	var comboObjects=new Array();
	var combo1=null;
	var comboCnt=0;
	//RD
    //var rdObjects=new Array();
	//var rdCnt=0;
	// define DATA seperator 
	var ROWMARK="|";
	var FIELDMARK="=";
	var arrAcctCd=new Array();
	var arrAcctEngNm=new Array();
	var arrAcctKrnNm=new Array();
	var arrRevCd=new Array();
	var arrChgCd=new Array();
	var arrRepChgCd=new Array();
	var arrCurrInfo=new Array();
	var arrDpPrcsKnt=new Array();
	var maxAcctEndDt = ""; 	//maxAcctEndDt
    // define button click event handler */
    document.onclick=processButtonClick;
	/** 
	 *  event handler branch proecss by button name <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  none
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function processButtonClick(){
		var sheetObject=sheetObjects[0];
		//var rdObject=rdObjects[0];
		/*******************************************************/
		var formObj=document.form;
		try {
			var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
			
			var param="";
			switch(srcName) {
				case "btn_new":
					removeAll(formObj);
					formObj.view_ar_if_no.value  = '';
					formObj.view_ar_ofc_cd.value = '';
					formObj.view_yn.value="N";
					setSearchValueType();
				break;
				case "btn_print1":
					rdOpen(formObj);
				break;
				case "btn_print2":
					rdOpen(formObj);
				break;
				case "btn_close":
					ComClosePopup(); 
				break;
				case "btn_save":
					doActionIBSheet(sheetObject,formObj,IBSAVE);
				break;
				case "btn_create":
					doActionIBSheet(sheetObject,formObj,IBINSERT);
				break;
				case "btn_auto":
					doActionIBSheet(sheetObject,formObj,IBSEARCH_ASYNC12);
				break;														
				case "btn_add":
					if(validateForm(sheetObject,formObj,IBSEARCH_ASYNC13)) {
						var currPoint=formObj.curr_point.value;
						var lclCurrPoint=formObj.lcl_curr_point.value;
						var invVatChgCd=formObj.inv_vat_chg_cd.value;
						var tvaChgCnt=0;
						var tvaChgRow=0;
						for (var i=1; i < sheetObject.RowCount()+ 1; i++) {
							if (sheetObject.GetCellValue(i, "chg_cd") == invVatChgCd && sheetObject.GetCellValue(i, "tax_yn") == "T") {
								tvaChgCnt++;	
								tvaChgRow=i;
							}
						}
			    		if (tvaChgCnt == 0) {
			    			sheetObject.DataInsert(-1);
			    		}
			    		else {	 				 
			    			sheetObject.DataInsert(tvaChgRow - 1);
			    		}
						if (currPoint == '0') {
							sheetObject.InitCellProperty(sheetObject.GetSelectRow(), "chg_amt",{ Type:"Int",Align:"Right",Format:"NullInteger"} );
						}
						else {
							sheetObject.InitCellProperty(sheetObject.GetSelectRow(), "chg_amt",{ Type:"Float",Align:"Right",Format:"NullFloat",PointCount:currPoint} );
						}
						addCellComboItem(sheetObject,'acct_cd',true);
						sheetObject.SetCellValue(sheetObject.GetSelectRow(), "cust_code",formObj.cust_cnt_cd.value + formObj.cust_seq.value ,0);
						sheetObject.SetCellValue(sheetObject.GetSelectRow(), "city",formObj.pol_cd.value,0);
						sheetObject.SetCellValue(sheetObject.GetSelectRow(), "curr_cd",comboObjects[1].GetSelectText(),0);
						sheetObject.SetCellValue(sheetObject.GetSelectRow(), "inv_rev_tp_src_cd","XXX",0);
						sheetObject.SetCellValue(sheetObject.GetSelectRow(), "chg_cd","TVA",0);
						sheetObject.SetCellValue(sheetObject.GetSelectRow(), "rep_chg_cd","SLC",0);
						sheetObject.SetCellValue(sheetObject.GetSelectRow(), "inv_xch_rt",formObj.inv_xch_rt.value,0);
						sheetObject.SetCellValue(sheetObject.GetSelectRow(), "tax_yn","N",0);
						sheetObject.SetCellValue(sheetObject.GetSelectRow(), "mnl_flg","Y",0);
						//disabled VAT checkbox when create.
						sheetObject.SetCellEditable(sheetObject.GetSelectRow(), "tva_flg",0);
					}
				break;
				case "btn_copy":
					if(validateForm(sheetObject,formObj,IBSEARCH_ASYNC13)) {
						if(sheetObject.RowCount()> 0) {
							if (sheetObject.GetCellValue(sheetObject.GetSelectRow(), "mnl_flg") == "Y") {
								var currPoint=formObj.curr_point.value;
								var lclCurrPoint=formObj.lcl_curr_point.value;
								var invVatChgCd=formObj.inv_vat_chg_cd.value;
								var acctCd=sheetObject.GetCellValue(sheetObject.GetSelectRow(), "acct_cd");
								var chgFullNm=sheetObject.GetCellValue(sheetObject.GetSelectRow(), "chg_full_nm");
								var custCode=sheetObject.GetCellValue(sheetObject.GetSelectRow(), "cust_code");
								var city=sheetObject.GetCellValue(sheetObject.GetSelectRow(), "city");
								var currCd=sheetObject.GetCellValue(sheetObject.GetSelectRow(), "curr_cd");
								var chgAmt=sheetObject.GetCellValue(sheetObject.GetSelectRow(), "chg_amt");
								var chgRmk=sheetObject.GetCellValue(sheetObject.GetSelectRow(), "chg_rmk");
								var revCd=sheetObject.GetCellValue(sheetObject.GetSelectRow(), "inv_rev_tp_src_cd");
								var chgCd=sheetObject.GetCellValue(sheetObject.GetSelectRow(), "chg_cd");
								var repChgCd=sheetObject.GetCellValue(sheetObject.GetSelectRow(), "rep_chg_cd");
								var invXchRt=sheetObject.GetCellValue(sheetObject.GetSelectRow(), "inv_xch_rt");
								var taxYn=sheetObject.GetCellValue(sheetObject.GetSelectRow(), "tax_yn");
								var mnlFlg=sheetObject.GetCellValue(sheetObject.GetSelectRow(), "mnl_flg");
								var tvaChgCnt=0;
								var tvaChgRow=0;
								for (var i=1; i < sheetObject.RowCount()+ 1; i++) {
									if (sheetObject.GetCellValue(i, "chg_cd") == invVatChgCd && sheetObject.GetCellValue(i, "tax_yn") == "T") {
										tvaChgCnt++;	
										tvaChgRow=i;
									}
								}
					    		if (tvaChgCnt == 0) {
					    			sheetObject.DataInsert(-1);
					    		}
					    		else {	 				 
					    			sheetObject.DataInsert(tvaChgRow - 1);
					    		}
								addCellComboItem(sheetObject,'acct_cd',true);
								sheetObject.SetCellValue(sheetObject.GetSelectRow(), "acct_cd",acctCd,0);
								sheetObject.SetCellValue(sheetObject.GetSelectRow(), "chg_full_nm",chgFullNm,0);
								sheetObject.SetCellValue(sheetObject.GetSelectRow(), "cust_code",custCode,0);
								sheetObject.SetCellValue(sheetObject.GetSelectRow(), "city",city,0);
								sheetObject.SetCellValue(sheetObject.GetSelectRow(), "curr_cd",currCd,0);
								sheetObject.SetCellValue(sheetObject.GetSelectRow(), "chg_amt",chgAmt,0);
								sheetObject.SetCellValue(sheetObject.GetSelectRow(), "chg_rmk",chgRmk,0);
								sheetObject.SetCellValue(sheetObject.GetSelectRow(), "inv_rev_tp_src_cd",revCd,0);
								sheetObject.SetCellValue(sheetObject.GetSelectRow(), "chg_cd",chgCd,0);
								sheetObject.SetCellValue(sheetObject.GetSelectRow(), "rep_chg_cd",repChgCd,0);
								sheetObject.SetCellValue(sheetObject.GetSelectRow(), "inv_xch_rt",invXchRt,0);
								sheetObject.SetCellValue(sheetObject.GetSelectRow(), "tax_yn","N",0);
								sheetObject.SetCellValue(sheetObject.GetSelectRow(), "mnl_flg",mnlFlg,0);
								//setting CR grid
								crGridSet();
								//setting INV_AR_AMT grid
								amtGridSet();
							}
						}
					}
				break;
				case "btn_delete":
					if (gridCopyDeleteOK(sheetObject, sheetObject.GetSelectRow(), formObj)) {
						sheetObject.RowDelete();
						//setting CR grid
						crGridSet();
						//setting INV_AR_AMT grid
						amtGridSet();
					}
				break;
				case "btns_calendar": // calandar button
					if (formObj.view_yn.value != "Y") {
						var cal=new ComCalendar();
						cal.setDisplayType('date');
		             	cal.select(formObj.eff_dt, 'yyyy-MM-dd');
					}
	            break;
				case "btns_cust1": // CUST retrieve button
					var v_cust_cnt_cd=formObj.cust_cnt_cd.value;
					var v_cust_seq=formObj.cust_seq.value;
					var classId="FNS_INV_0013";
					var param='?cust_cnt_cd='+v_cust_cnt_cd+'&cust_seq='+v_cust_seq+'&pop_yn=Y&classId='+classId;
					ComOpenWindow('/opuscntr/FNS_INV_0013.do' + param, 'getFNS_INV_0013', 'width=950,height=700');
				break;
				case "btns_cust2": // CUST retrieve button
					if (formObj.view_yn.value != "Y") {
						var v_cust_cnt_cd=formObj.cust_cnt_cd.value;
						var v_cust_seq=formObj.cust_seq.value;
						// var v_cust_nm=sheetObject.UrlEncoding(formObj.cust_nm.value);
						var v_cust_nm= formObj.cust_nm.value;
						var classId="FNS_INV_0086";
						var param='?cust_cnt_cd='+v_cust_cnt_cd+'&cust_seq='+v_cust_seq+'&pop_yn=Y&classId='+classId;
						ComOpenPopup('/opuscntr/FNS_INV_0086.do' + param, 900, 450, 'getFNS_INV_0086', '1,0', false, false);
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
	 * add IBSheet Object array <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * add array when need batch another item 
	 * define array top side in source  
	 * </pre>
	 * @param  {IBSheet} sheetObj IBSheet Object
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function setSheetObject(sheet_obj){
		sheetObjects[sheetCnt++]=sheet_obj;
	}
	/** 
	 * add comboObjects array IBCombo Object<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * add array when need batch another item 
	 * define array top side in source 
	 * </pre>
	 * @param {IBMultiCombo} combo_obj    IBMultiCombo Object
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function setComboObject(combo_obj){
		comboObjects[comboCnt++]=combo_obj;
	}
    /** 
     * define onLoad event handler<br>
     * <br><b>Example :</b>
	 * <pre>
	 * function when browser onload
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function loadPage() {
		var formObj=document.form;
		if (formObj.view_ar_if_no.value == '' && formObj.view_ar_ofc_cd.value == '') {
			for(i=0;i<sheetObjects.length;i++){
				ComConfigSheet (sheetObjects[i] );
				initSheet(sheetObjects[i],i+1);
				ComEndConfigSheet(sheetObjects[i]);
			}
			//IBMultiCombo init
			for(var k=0; k<comboObjects.length; k++){
				initCombo(comboObjects[k],k+1);
			}
			initControl();
			//RD
			//initRdConfig(rdObjects[0]);
			formObj.pagetype.value="E";
			//input 
			doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC10);
			// init condition - input
			setSearchValueType();

			comboObjects[2].InsertItem(0, formObj.inv_vat_chg_rt.value + "%", formObj.inv_vat_chg_rt.value);
			comboObjects[2].SetSelectText(formObj.inv_vat_chg_rt.value + "%");

		}
		//retrieve
		else {
			formObj.pagetype.value="I";
//			document.title = "Other Revenue Invoice";
//			document.getElementById("title").innerHTML = "&nbsp;&nbsp;Other Revenue Invoice";
			doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC14);
			comboObjects[0].SetSelectText(formObj.view_ar_ofc_cd.value);
			formObj.ofc_cd.value=formObj.view_ar_ofc_cd.value;
			formObj.ar_if_no.value=formObj.view_ar_if_no.value;
			
			//init condition - retrieve
			setSearchValueType();
			
			if(formObj.inv_vat_chg_rt.value != "") {
				comboObjects[2].InsertItem(0, formObj.inv_vat_chg_rt.value + "%", formObj.inv_vat_chg_rt.value);
			//comboObjects[2].SetSelectText(formObj.inv_vat_chg_rt.value + "%");
			}

			// retrieve input data
			doActionIBSheet(sheetObjects[0],formObj,IBSEARCH);
			//disable cr  grid
			for(var i=sheetObjects[0].RowCount(); i>0; i--){
				sheetObjects[0].SetRowEditable(i,0);
			}
		}		
		
	    formObj.com_mrdTitle.value="Other Revenue Invoice  Print";
	    formObj.com_mrdBodyTitle.value="Other Revenue Invoice  Print";
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
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function initSheet(sheetObj,sheetNo) {
		var formObject=document.form;
		var cnt=0;
		var currPoint=formObject.curr_point.value;
		var lclCurrPoint=formObject.lcl_curr_point.value;
		var setCurrPoint="";
		if (Number(currPoint) > Number(lclCurrPoint)) {
			setCurrPoint=currPoint;
		}else {
			setCurrPoint=lclCurrPoint;
		}
		switch(sheetNo) {
			case 1:      //sheet1 init
			    with(sheetObj){
			      var HeadTitle="|CR Acct|Account Name|Cust Code|City|Curr|Amount|Remark|TVA|revCd|chgCd|repChgCd|invXchRt|taxYn|chgSeq|mnlFlg";
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
			      var info    = { Sort:0, ColMove:0, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
			             {Type:"Combo",     Hidden:0, Width:80,   Align:"Left",    ColMerge:0,   SaveName:"acct_cd",            KeyField:1,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:270,  Align:"Left",    ColMerge:0,   SaveName:"chg_full_nm",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:85,   Align:"Center",  ColMerge:0,   SaveName:"cust_code",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:0,   SaveName:"city",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"curr_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Float",     Hidden:0,  Width:140,  Align:"Right",   ColMerge:0,   SaveName:"chg_amt",            KeyField:1,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 },
			             {Type:"Text",      Hidden:0,  Width:235,  Align:"Left",    ColMerge:0,   SaveName:"chg_rmk",            KeyField:0,   CalcLogic:"",   Format:"",	EditLen:50 },
			             {Type:"CheckBox",  Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"tva_flg",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:50,   Align:"Left",    ColMerge:0,   SaveName:"inv_rev_tp_src_cd",  KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:1, Width:50,   Align:"Left",    ColMerge:0,   SaveName:"chg_cd",             KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:1, Width:50,   Align:"Left",    ColMerge:0,   SaveName:"rep_chg_cd",         KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:1, Width:80,   Align:"Right",   ColMerge:0,   SaveName:"inv_xch_rt",         KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6 },
			             {Type:"Text",      Hidden:1, Width:80,   Align:"Right",   ColMerge:0,   SaveName:"tax_yn",             KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:1, Width:80,   Align:"Right",   ColMerge:0,   SaveName:"chg_seq",            KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:1, Width:80,   Align:"Right",   ColMerge:0,   SaveName:"mnl_flg",            KeyField:0,   CalcLogic:"",   Format:"" } ];
			      InitColumns(cols);
			      SetEditable(1);
			      SetWaitImageVisible(0);
			      SetSheetHeight(200);
			      SetColProperty("acct_cd", {ComboText:"", ComboCode:""} );
			      FitColWidth("10|20|10|10|10|10|20|10");
			      resizeSheet();
	            }
			break;
			
			case 2:      //sheet2 init
			    with(sheetObj){
				  var HeadTitle="|Curr|Local Total|Amount";
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:0 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
			                   {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"curr_cd",      KeyField:0,   CalcLogic:"",   Format:"" }];
			      if (setCurrPoint > 0) {
			    	  cols.push({Type:"AutoSum",   Hidden:1, Width:150,  Align:"Right",   ColMerge:0,   SaveName:"local_total",  KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:setCurrPoint });
				      cols.push({Type:"Float",     Hidden:0,  Width:110,  Align:"Right",   ColMerge:0,   SaveName:"chg_amt",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:setCurrPoint });
			      } else {
			    	  cols.push({Type:"AutoSum",   Hidden:1, Width:150,  Align:"Right",   ColMerge:0,   SaveName:"local_total",  KeyField:0,   CalcLogic:"",   Format:"Integer" });
				      cols.push({Type:"Int",       Hidden:0,  Width:110,  Align:"Right",   ColMerge:0,   SaveName:"chg_amt",      KeyField:0,   CalcLogic:"",         Format:"Integer" });
			      }
			      InitColumns(cols);
			      SetEditable(0);
			      SetWaitImageVisible(0);
			      SetRowHidden(0, 1);
			      SetSheetHeight(100);
			      SetSheetWidth(300);
	            }
			break;
			case 3:      //sheet3 init
			    with(sheetObj){
			      var HeadTitle3="|Curr|Amount|Ex.Rate|Local Total";
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:0 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle3, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
			                   {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"curr_cd",      KeyField:0,   CalcLogic:"",   Format:"" } ];
			      if (setCurrPoint > 0) {
				      cols.push({Type:"Float",     Hidden:0,  Width:110,  Align:"Right",   ColMerge:0,   SaveName:"chg_amt",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:setCurrPoint });
				      cols.push({Type:"Text",      Hidden:1, Width:90,   Align:"Right",   ColMerge:0,   SaveName:"inv_xch_rt",   KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6 });
				      cols.push({Type:"AutoSum",   Hidden:0, Width:100,  Align:"Right",   ColMerge:0,   SaveName:"local_total",  KeyField:0,   CalcLogic:"|2|*|3|",Format:"NullFloat",   PointCount:setCurrPoint });
			      }
			      else {
				      cols.push({Type:"Int",       Hidden:0,  Width:110,  Align:"Right",   ColMerge:0,   SaveName:"chg_amt",      KeyField:0,   CalcLogic:"",         Format:"Integer" });
				      cols.push({Type:"Text",      Hidden:1,  Width:90,   Align:"Right",   ColMerge:0,   SaveName:"inv_xch_rt",   KeyField:0,   CalcLogic:"",         Format:"NullFloat",   PointCount:6 });
				      cols.push({Type:"AutoSum",   Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:"local_total",  KeyField:0,   CalcLogic:"|2|*|3|",  Format:"Integer" });
			      }
			      InitColumns(cols);
			      SetEditable(0);
			      SetColHidden(4, 1);
			      SetWaitImageVisible(0);
			      SetRowHidden(0, 1);
			      SetSheetHeight(100);
			      SetSheetWidth(300);
	            }
			break;
			case 4:      //sheet4 init (INV_AR_AMT)
			    with(sheetObj){
			      var HeadTitle4="|TjSrcNm|Curr|Amount";
			      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:0 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle4, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
			             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"tj_src_nm",  KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"curr_cd",    KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Float",     Hidden:0,  Width:110,  Align:"Right",   ColMerge:0,   SaveName:"inv_amt",    KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:setCurrPoint } ];
			      InitColumns(cols);
			      SetEditable(0);
			      SetWaitImageVisible(0);
			      SetSheetHeight(100);
		      }
			break;
		}
	}
	/** 
	 * init combo<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param {IBMultiCombo} comboObj  comboObj
	 * @param comboNo 
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
  	function initCombo(comboObj, comboNo) {
//		switch (comboObj.options.id) {
//			case "ar_ofc_cd":
//				with (comboObj) {
//					SetColAlign(0, "left");
//					SetColWidth(0, "100");
//					SetMultiSelect(0);
//					SetUseAutoComplete(1);
//					SetDropHeight(200);
//					SetMaxLength(6);
//				}
//				break;
//			case "curr_cd":
//				with (comboObj) {
//					SetColAlign(0, "left");
//					SetColWidth(0, "50");
//					SetMultiSelect(0);
//					SetUseAutoComplete(1);
//					SetDropHeight(200);
//					SetMaxLength(3);
//				}
//				break;
//			case "ar_tax_ind_cd":
//				with (comboObj) {
//					SetColAlign(0, "left");
//					SetColWidth(0, "50");
//					SetMultiSelect(0);
//					SetUseAutoComplete(1);
//					SetDropHeight(200);
//					SetMaxLength(3);
//				}
//				break;
//		}
  	}
	/** 
	 * init RD <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param {RdObject} rdObject
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function initRdConfig(rdObject){
		var Rdviewer=rdObject;
		Rdviewer.AutoAdjust=true;
//		Rdviewer.ViewShowMode(0); 
//		Rdviewer.SetBackgroundColor(128,128,128);
//		Rdviewer.SetPageLineColor(128,128,128);
	}
	/** 
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function initControl() {
		var formObj=document.form;
		// axon_event.addListenerFormat ('keypress', 'obj_keypress', formObj);
		axon_event.addListenerFormat ('focus', 'obj_activate', formObj);
		// axon_event.addListenerForm ('keyup', 'obj_keyup', formObj);
		axon_event.addListenerForm ('blur', 'obj_deactivate', formObj);
		axon_event.addListenerForm ('change', 'obj_onchange', formObj);
	}
	/** 
	 * handling OnKeyPress event<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
//	function obj_keypress() {
//		var formObj=document.form;
//		if (formObj.view_yn.value != "Y") {
//			switch(ComGetEvent().dataformat){
//				case "float":
//					//number+"."
//					ComKeyOnlyNumber(ComGetEvent(), ".-"); 
//				break;
//				case "int":
//					//only number
//					ComKeyOnlyNumber(ComGetEvent(),"-"); 
//				break;
//				case "engup":
//					switch(ComGetEvent("name")){
//						case "bl_src_no":	
//							//uppercase + number
//							ComKeyOnlyAlphabet('uppernum'); 
//						break;
//						case "ar_if_no":	
//							//uppercase + number
//							ComKeyOnlyAlphabet('uppernum'); 
//						break;
//						case "cust_cnt_cd":	
//							//uppercase + number		    	        
//							ComKeyOnlyAlphabet('upper'); 
//						break;
//						case "port":	
//							//uppercase + number		    	        
//							ComKeyOnlyAlphabet('upper'); 
//						break;
//					}
//				break;
//		        case "num":
//		        	//only number
//		            ComKeyOnlyNumber('num');
//	            break;
//				default:
//					//only number
//					ComKeyOnlyNumber(ComGetEvent());
//				break;
//			}
//		}
//	}
	/** 
	 * handling OnBeforeActivate event (on focus in)<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function obj_activate() {
		var formObj=document.form;
		if (formObj.view_yn.value != "Y") {
			//remve separator
			ComClearSeparator(ComGetEvent());
			ComGetEvent().select();
		}
	}
	/** 
	 * call HTML Control KeyUp event<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
//	function obj_keyup() {
//		var formObj=document.form;
//		if (formObj.view_yn.value != "Y") {
//			switch (ComGetEvent("name")) {
//				case "eff_dt":
//					var glEffDt=ComReplaceStr(ComGetEvent().value,"-","");
//					if (glEffDt.length == 8) {
//						formObj.cust_cnt_cd.focus();
//					}
//		 		break;
//				case "cust_cnt_cd":
//					var custCntCd=ComGetEvent().value;
//					if (custCntCd.length == 2) {
//						formObj.cust_seq.focus();
//					}
//		 		break;
//			}
//		}
//	}
	/** 
	 * handling Onbeforedeactivate event (on focus out)<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function obj_deactivate(){
		var sheetObject=sheetObjects[0];
		var formObj=document.form;
		if (formObj.view_yn.value != "Y") {
			var eName = ComGetEvent("name");
			switch(eName){
				case "eff_dt":
					var glEffDt=ComReplaceStr(ComGetEvent().value,"-","");
					if (glEffDt.length == 8) {
						if (ComChkObjValid(ComGetEvent())) {
							//Office AR Currency 
							if(getLoclXchRt()) {
								//Amount calculate
								calLocalAmount();
								//CR Detail grid setting
								dtlGridSet('amount');
								dtlGridSet('exRate');
								//calculate TVA Amount 
								calTVAAmount(sheetObject, formObj);
								//DR grid setting
								drGridSet();
								//CR grid setting
								crGridSet();
								//INV_AR_AMT grid setting
								amtGridSet();
									
				            	doActionIBSheet(sheetObject, formObj, IBSEARCH_ASYNC16);
				            	addCellComboItem2(sheetObjects[0],'acct_cd',true);
							}
						}
					}
				break;
				case "cust_seq":
					if (formObj.cust_cnt_cd.value != '' && formObj.cust_seq.value != '') {
						var valueCustSeq=formObj.cust_seq.value;
						formObj.cust_seq.value=ComLpad(valueCustSeq,6,"0");
						doActionIBSheet(sheetObject,formObj,IBSEARCH_ASYNC20);
						var custCd="";
						if (formObj.cust_nm.value != '') {
							custCd=formObj.cust_cnt_cd.value+ComLpad(valueCustSeq,6,"0");
						}
						else {
							custCd="";
							formObj.cust_seq.focus();
						}
						for(i=sheetObject.RowCount(); i>0; i--){
							sheetObject.SetCellValue(i, "cust_code",custCd,0);
						}
					}
					else {
						formObj.cust_nm.value='';
						for(i=sheetObject.RowCount(); i>0; i--){
							sheetObject.SetCellValue(i, "cust_code","",0);
						}
					}
				break;
				case "amount":
					//Amount calculate
					calLocalAmount();
					//CR Detail grid setting
					dtlGridSet('amount');
					//TVA Amount calculate
					calTVAAmount(sheetObject, formObj);
					//DR grid setting
					drGridSet();
					//CR grid setting
					crGridSet();
					//INV_AR_AMT grid setting
					amtGridSet();
				break;
				case "inv_xch_rt":
					if(ComChkObjValid(ComGetEvent())) {
						if (!ComIsNull(formObj.usd_locl_xch_rt) && !ComIsNull(formObj.inv_xch_rt)) {
							//check exchange rate
							if (chkXchRate()) {
								//Amount calculate
								calLocalAmount();
								//CR Detail grid setting
								dtlGridSet('exRate');
								//TVA Amount calculate
								calTVAAmount(sheetObject, formObj);
								//DR grid setting
								drGridSet();
								//CR grid setting
								crGridSet();
								//INV_AR_AMT grid setting
								amtGridSet();
							}
							else {
								ComShowMessage(ComGetMsg('INV00016'));
								//formObj.inv_xch_rt.value = "";
								formObj.inv_xch_rt.focus();
							}
						}
					}
				break;				
				default:
					//Validation all(lenght,format,min,max ..)
					ComChkObjValid(ComGetEvent());
				break;
			}
		}
	}
	/** 
	 * handling OnChange event<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function obj_onchange() {
		var sheetObject=sheetObjects[0];
		var formObj=document.form;
        switch(ComGetEvent("name")){
            case "bl_src_no":
            	doActionIBSheet(sheetObject,formObj,IBSEARCH_ASYNC15);
            	break;
            case "lcl_vvd":
    			getExRateSaDate();
    			//chkLclVvd();            	
    			break;   
    		case "io_bnd_cd":
    			//setButtons();
    			getExRateSaDate();
    			break;
    		case "pol_cd":
    			getExRateSaDate();
    			break;
    		case "svc_scp_cd":
    			getExRateSaDate();
    			//getExRate();
    			break;
        }	    
	}
	/**
	 * retrieve exchange rate, SA Date  <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     getExRateSaDate();
	 * </pre>
	 * @param none
	 * @return none
	 * @author �젙�쐶�깮
	 * @version 2009.10.20
	 */ 
	function getExRateSaDate() { //2016.06.13 Add
		var sheetObject=sheetObjects[0];
		var formObj=document.form;
		var lclVvd=formObj.lcl_vvd.value;
		if (lclVvd != '' && formObj.pol_cd.value != '' && formObj.svc_scp_cd.value != '' && formObj.io_bnd_cd.value != '') {
			if (lclVvd.substring(0,4) == "CFDR" || lclVvd.substring(0,4) == "USAC" || lclVvd.substring(0,4) == "CNTC" || lclVvd.substring(0,4) == "COMC") {
				formObj.sail_arr_dt.value = "";
				formObj.svc_scp_cd.value="OTH"; 
				formObj.io_bnd_cd.value="O"; 
				
				if(getLoclXchRt()) {
					//Amount calculate
					calLocalAmount();
					//CR Detail grid setting
					dtlGridSet('amount');
					dtlGridSet('exRate');
					//calculate TVA Amount 
					calTVAAmount(sheetObject, formObj);
					//DR grid setting
					drGridSet();
					//CR grid setting
					crGridSet();
					//INV_AR_AMT grid setting
					amtGridSet();
						
	            	doActionIBSheet(sheetObject, formObj, IBSEARCH_ASYNC16);
	            	addCellComboItem2(sheetObjects[0],'acct_cd',true);
				}
				
			} else {
				var arrStr2=comboObjects[0].GetSelectCode().split("^");
				formObj.ofc_cd.value=arrStr2[1];
				formObj.lcl_curr.value=arrStr2[4];    
				doActionIBSheet(sheetObject, formObj, IBSEARCH_ASYNC09);
				
				//Amount calculate
				calLocalAmount();
				//CR Detail grid setting
				dtlGridSet('amount');
				dtlGridSet('exRate');
				//calculate TVA Amount 
				calTVAAmount(sheetObject, formObj);
				//DR grid setting
				drGridSet();
				//CR grid setting
				crGridSet();
				//INV_AR_AMT grid setting
				amtGridSet();
					
            	doActionIBSheet(sheetObject, formObj, IBSEARCH_ASYNC16);
            	addCellComboItem2(sheetObjects[0],'acct_cd',true);
			}
		}
	}
	
	/**
	 * retrieve exchange rate  <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     getExRate();
	 * </pre>
	 * @param none
	 * @return none
	 * @author �젙�쐶�깮
	 * @version 2009.10.20
	 */   
	function getExRate() {
		var sheetObject=sheetObjects[0];
		var formObj=document.form;
		var arrStr2=comboObjects[0].GetSelectCode().split("^");
		formObj.ofc_cd.value=arrStr2[1];
		formObj.lcl_curr.value=arrStr2[4]; 
		doActionIBSheet(sheetObject, formObj, IBSEARCH_ASYNC08);
		
		//Amount calculate
		calLocalAmount();
		//CR Detail grid setting
		dtlGridSet('amount');
		dtlGridSet('exRate');
		//calculate TVA Amount 
		calTVAAmount(sheetObject, formObj);
		//DR grid setting
		drGridSet();
		//CR grid setting
		crGridSet();
		//INV_AR_AMT grid setting
		amtGridSet();
			
    	doActionIBSheet(sheetObject, formObj, IBSEARCH_ASYNC16);
    	addCellComboItem2(sheetObjects[0],'acct_cd',true);
	}
	
	/** 
	 * doActionIBSheet<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param  {IBSheet} sheetObj   
	 * @param  {object} formObj 
	 * @param  {sAction} sAction : f_cmd value setting on form when ues retrieve, save..
	 * @param  {int} Row : selected Row
	 * @param  {int} Col : selected Col
	 * @param  {String}Val : selected Row,Col value
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function doActionIBSheet(sheetObj,formObj,sAction) {
		sheetObj.ShowDebugMsg(false);
		switch(sAction) {
			case IBSEARCH:      //retrieve
				if(validateForm(sheetObj,formObj,sAction)) {
					formObj.f_cmd.value=SEARCH;
					var arrStr2=comboObjects[0].GetSelectCode().split("^");
					formObj.ofc_cd.value=arrStr2[1];
					formObj.ots_smry_cd.value=arrStr2[13];
					var sheetObj1=sheetObjects[0];
					var sheetObj2=sheetObjects[1];
					var sheetObj3=sheetObjects[2];
					var sheetObj4=sheetObjects[3];
					//ComOpenWait(true); 
					var sXml=sheetObj.GetSearchData("FNS_INV_0022GS.do", FormQueryString(formObj));
					var arrXml=sXml.split("|$$|");
					if (arrXml.length > 0) {
						var currPoint=ComGetEtcData(arrXml[0], "dp_prcs_knt");
						var lclCurrPoint=ComGetEtcData(arrXml[0], "dp_prcs_knt_lcl");
						var list=ComXml2ListMap(arrXml[0]);
						//save retrieve condition
						var arIfNo="";
						var arOfcCd="";
						if (list.length > 0) {
							var expensInfo=list[1];
							
							if(formObj.inv_vat_chg_rt.value == ""){
								comboObjects[2].InsertItem(0, expensInfo["ar_tax_ind_cd"] + "%", expensInfo["ar_tax_ind_cd"]);
							}	
							
							if (expensInfo["cust_cnt_cd"] != '') {
								formObj.curr_point.value=currPoint;
								formObj.lcl_curr_point.value=lclCurrPoint;
								ComMapToForm(formObj,expensInfo);
								comboObjects[1].SetSelectText(expensInfo["curr_cd"]);
								if (expensInfo["ar_tax_ind_cd"] != 'N') {
									comboObjects[2].SetSelectText(expensInfo["ar_tax_ind_cd"]+"%");
								}
								else {
									comboObjects[2].SetSelectText(expensInfo["ar_tax_ind_cd"]);
								}								
								//alert(comboObjects[2].GetSelectText());
								
							}else {
								arIfNo=formObj.ar_if_no.value;
								arOfcCd=comboObjects[0].GetSelectText();
								ComResetAll();
								formObj.ar_if_no.value=arIfNo;
								comboObjects[0].SetSelectText(arOfcCd);
							}
						}
					}
			    	// init sheet 
					sheetObjects[0] = sheetObj1.Reset();
					sheetObjects[1] = sheetObj2.Reset();
					sheetObjects[2] = sheetObj3.Reset();
					sheetObjects[3] = sheetObj4.Reset();
//					sheetObjects[0] = sheetObjt1;
//					sheetObjects[1] = sheetObjt2;
//					sheetObjects[2] = sheetObjt3;
//					sheetObjects[3] = sheetObjt4;
					var currCd=comboObjects[1].GetSelectText();
					var lclCurrCd=formObj.lcl_curr.value;
					initSheet(sheetObjects[0],1);
			    	initSheet(sheetObjects[1],2);
			    	initSheet(sheetObjects[2],3);
			    	initSheet(sheetObjects[3],4);
			    	if (arrXml.length > 1) {
						addCellComboItem(sheetObjects[0],'acct_cd',false);
						sheetObjects[0].LoadSearchData(arrXml[1],{Sync:1} );
						var taxInfoCnt=0;
						for(var i=sheetObjects[0].RowCount(); i>0; i--){
							if(sheetObjects[0].GetCellValue(i, "ibflag") != "" && sheetObjects[0].GetCellValue(i, "mnl_flg") == "N") {
								taxInfoCnt ++;
							}
						}
						if (taxInfoCnt > 0) {
							document.getElementById('taxDiv1').style.display="block";
							document.getElementById('taxDiv2').style.display="none";
							comboObjects[2].SetEnable(0);
						}
					}
					//DR grid setting
					drGridSet();
					//CR grid setting
					crGridSet();
					//INV_AR_AMT grid setting
					amtGridSet();
					if (formObj.ots_smry_cd.value == 'INV' && formObj.inv_no.value == '') {
						ComBtnEnable("btn_create");
					} else {
						ComBtnDisable("btn_create");
					}
					//ComOpenWait(false); 
				}
			break;
			case IBSAVE:        //save
				if(validateForm(sheetObj,formObj,sAction)) {
					if (ComShowCodeConfirm("INV00160")) {
						var arrStr2=comboObjects[0].GetSelectCode().split("^");
						formObj.ofc_cd.value=arrStr2[1];
						formObj.f_cmd.value=MULTI;
						var sParam=FormQueryString(formObj);
						var sParam1=sheetObjects[0].GetSaveString();
						var sParam2=sheetObjects[3].GetSaveString();
						if (sParam1 == "") {
							return;
						}
						else {
							sParam1=ComSetPrifix(sParam1, "sheet1_");
							sParam2=ComSetPrifix(sParam2, "sheet4_");
							sParam=sParam + "&" + sParam1 + "&" + sParam2;
						}
						formObj.tmp_bl_src_no.value="";
						ComOpenWait(true); 
						
						setTimeout( function () {
							var sXml=sheetObj.GetSaveData("FNS_INV_0022GS.do", sParam );
							var ERR_MSG = ComGetSelectSingleNode(sXml, "MESSAGE").trim();
							if(ERR_MSG.substring(0,4)=="<||>") ERR_MSG=ERR_MSG.substring(5,ERR_MSG.length);
							if(ERR_MSG.substring(ERR_MSG.length-4)=="<||>") ERR_MSG=ERR_MSG.substring(0,ERR_MSG.length-4);
							if(ERR_MSG.indexOf("Error Message") != -1) ERR_MSG=ERR_MSG.substring(ERR_MSG.indexOf("Error Message")+16,ERR_MSG.length);
							ERR_MSG=ERR_MSG.replace(/\<\|\|\>/g,"\n");

							if (sXml.indexOf("ERROR") < 1){
								var arIfNo=ComGetEtcData(sXml,"ar_if_no");
								var slpNo=ComGetEtcData(sXml,"slp_no");
								sheetObj.LoadSaveData(sXml);
								InvOpenWait(false, true);
								if (arIfNo != undefined) {
									formObj.view_ar_if_no.value=arIfNo;
									formObj.view_ar_ofc_cd.value=arrStr2[1];
									formObj.ar_if_no.value=arIfNo;
								} else {
									formObj.view_ar_if_no.value="";
									formObj.view_ar_ofc_cd.value="";
									formObj.ar_if_no.value="";
								}
								if (slpNo != undefined) {
									formObj.slp_no.value=slpNo;
								} else {
									formObj.slp_no.value="";
								}
								if (arIfNo != '' && slpNo != '') {
									formObj.view_yn.value="Y";
									formObj.view_ar_ofc_cd.value=comboObjects[0].GetSelectText();
									loadPage();
	//								formObj.pagetype.value = "I";
	//								document.title = "Other Revenue Invoice";
	//								document.getElementById("title").innerHTML = "&nbsp;&nbsp;Other Revenue Invoice";
	//								
	//								ar_ofc_cd.text = formObj.view_ar_ofc_cd.value;
	//								formObj.ofc_cd.value = formObj.view_ar_ofc_cd.value;
	//								formObj.ar_if_no.value = formObj.view_ar_if_no.value;
	//								
	//								setSearchValueType();
	//								
	//								for(var i=sheetObj.rowCount; i>0; i--){
	//									sheetObj.RowEditable(i) = false;
	//								}
								}
								if (formObj.ots_smry_cd.value == 'INV' && formObj.inv_no.value == '') {
									ComBtnEnable("btn_create");
								} else {
									ComBtnDisable("btn_create");
								}
								ComShowCodeMessage("INV00051");		// save success
							}
							else {
								InvOpenWait(false, true);
								ComShowCodeMessage("INV00053", ERR_MSG);		// save fail
							}
						} , 100);
					}				
				}
			break;
			case IBINSERT:        //inv no creation
				if(validateForm(sheetObj,formObj,sAction)) {
					var arrStr2=comboObjects[0].GetSelectCode().split("^");
					formObj.ofc_cd.value=arrStr2[1];
					formObj.f_cmd.value=MULTI02;
					var sParam=FormQueryString(formObj);
					var sParam1=sheetObjects[0].GetSaveString(true);
					var sParam2=sheetObjects[3].GetSaveString();
					if (sParam1 == "") {
						return;
					}
					else {
						sParam1=ComSetPrifix(sParam1, "sheet1_");
						sParam2=ComSetPrifix(sParam2, "sheet4_");
						sParam=sParam + "&" + sParam1 + "&" + sParam2;
					}
					formObj.tmp_bl_src_no.value="";
					ComOpenWait(true);
					var sXml=sheetObj.GetSaveData("FNS_INV_0022GS.do", sParam );
					if (sXml.indexOf("ERROR") < 1){
						var invNo=ComGetEtcData(sXml,"inv_no");
						if (invNo != undefined) {
							formObj.inv_no.value=invNo;
						} else {
							formObj.inv_no.value="";
						}
						ComBtnDisable("btn_create");
						ComOpenWait(false);
						ComShowCodeMessage("INV00051");
					}
					else {
						ComOpenWait(false);
						ComShowCodeMessage("INV00053");
					}
				}
			break;
			case IBSEARCH_ASYNC10: //  AR Office retrieve when onload
	 			formObj.f_cmd.value=SEARCH05;
	 			var sXml=sheetObj.GetSearchData("FNS_INV_0022GS.do", FormQueryString(formObj));

	 			//ar_ofc_cd  肄ㅻ낫 �떆�옉
	 			var sStr=ComGetEtcData(sXml, "ar_ofc_cd");
	 			var	arrStr= sStr.split("|");
	 			MakeComboObject(comboObjects[0], arrStr);
	 		    var arrStr2=arrStr[1].split("^");
	 			
	 			var ar_ofc_cd_val=arrStr2[3];
	 			comboObjects[0].SetSelectText(ar_ofc_cd_val);
	 			// retrieve login user's office info 
	 			//ar_ofc_cd  肄ㅻ낫 �걹

		
	 			var ofcStr;
	 			var ofcStr2;
	 			
	 			for (var i=0; i < arrStr.length; i++) {
	 				var sStr9 = arrStr[i].split("^");
	 				if (sStr9[1] == ar_ofc_cd_val) {
	 					ofcStr = arrStr[i]
	 				}
	 			}
	 			var ofcStr2 = ofcStr.split("^");
	 			
	 			//tax
				MakeComboObject3(comboObjects[2], ofcStr2[6].substring(0,2));
	            var sStr2=ComGetEtcData(sXml,"currInfo");
				arrCurrInfo=sStr2.split("|");
				//currency
				MakeComboObject2(comboObjects[1], arrCurrInfo);
				var sStr9=ComGetEtcData(sXml,"dpPrcsKnt");
				arrDpPrcsKnt=sStr9.split("|");
				var sStr3=ComGetEtcData(sXml,"acct_cd");
				var sStr4=ComGetEtcData(sXml,"acct_eng_nm");
				var sStr5=ComGetEtcData(sXml,"acct_krn_nm");
				var sStr6=ComGetEtcData(sXml,"rev_cd");
				var sStr7=ComGetEtcData(sXml,"chg_cd");
				var sStr8=ComGetEtcData(sXml,"rep_chg_cd");
				// acccount code
				arrAcctCd=sStr3.split("|");
				arrAcctEngNm=sStr4.split("|");
				arrAcctKrnNm=sStr5.split("|");
				arrRevCd=sStr6.split("|");
				arrChgCd=sStr7.split("|");
				arrRepChgCd=sStr8.split("|");

				comboObjects[0].SetSelectText(ofcStr2[3]);
				comboObjects[1].SetSelectText(ofcStr2[4]);
	 			formObj.office_cnt_cd.value=ofcStr2[6].substring(0,2);
	 			formObj.lcl_curr.value=ofcStr2[4];
	 			formObj.tax_curr_cd.value=ofcStr2[4];
	 			formObj.total_curr_cd.value=ofcStr2[4];
	 			formObj.pol_cd.value=ofcStr2[6];
	 			formObj.svr_id.value=ofcStr2[7];
	 			formObj.ots_smry_cd.value=ofcStr2[13];
	 			formObj.inv_vat_chg_cd.value=ofcStr2[16];
	 			formObj.inv_vat_chg_rt.value=ofcStr2[17];
	 			formObj.inv_xch_rt.value="1.000000";
	 	    	var currPoint=getDpPrcsKnt(ofcStr2[4],arrDpPrcsKnt);
	 	    	// local digits setting
	 	    	formObj.lcl_curr_point.value=currPoint;
	 	    	formObj.curr_point.value=currPoint;
	 	    	//2015.05.14 Remove KR,HQ hardcoding by IY Cho
 				document.getElementById('taxDiv1').style.display="none";
	 			document.getElementById('taxDiv2').style.display="block";
	 			if (ofcStr2[13] == "INV") {
	 				document.getElementById('invNoDiv').style.display="block";
	 			}
	 			else {
	 				document.getElementById('invNoDiv').style.display="none";
	 			}
	 			//DR Account
	 			formObj.acct_cd.value=ComGetEtcData(sXml,"dr_acct_code");
	 			formObj.acct_eng_nm.value=ComGetEtcData(sXml,"dr_acct_name");
			break;
			case IBSEARCH_ASYNC11: // exchange rate retrieve
				formObj.f_cmd.value=SEARCH06;
				// OFFICE
				var arrStr2=comboObjects[0].GetSelectCode().split("^");
	 			formObj.ofc_cd.value=arrStr2[1];
	 			var sXml=sheetObj.GetSearchData("FNS_INV_0022GS.do", FormQueryString(formObj));
				var usdLoclXchRt=ComGetEtcData(sXml,"usd_locl_xch_rt");
				if (usdLoclXchRt != undefined) {
					if (comboObjects[1].GetSelectText() != '') {
						formObj.usd_locl_xch_rt.value=usdLoclXchRt;
						formObj.inv_xch_rt.value=usdLoclXchRt;
					}
				}
				else {
					ComShowCodeMessage("INV00015");
					formObj.eff_dt.value="";
					formObj.eff_dt.focus();
				}
			break;
			case IBSEARCH_ASYNC12: // auto BL No retrieve
				var tmpBlSrcNo=formObj.tmp_bl_src_no.value;
				var arOfcCd=""; //20150101
				var arHdQtrOfcCd="";
				if (tmpBlSrcNo == '') {
					formObj.f_cmd.value=MULTI01;
					// OFFICE Info
					var arrStr2=comboObjects[0].GetSelectCode().split("^");
					arHdQtrOfcCd=arrStr2[0];
					arOfcCd=arrStr2[1];
		 			formObj.ofc_cd.value=arOfcCd;
		 			var sXml=sheetObj.GetSaveData("FNS_INV_0022GS.do", FormQueryString(formObj));
					var blMaxSeq=ComGetEtcData(sXml,"bl_max_seq");
					if (blMaxSeq != undefined) {
						// when RHQ is 'SELHO' OFC setting (ex : OFC = SELPIO �넂 BL NO = PIO090828001) 
						if (arHdQtrOfcCd == 'SELHO') {
							blMaxSeq=arOfcCd.substring(3)+blMaxSeq.substring(3);
						}
						formObj.bl_src_no.value=blMaxSeq;
						formObj.tmp_bl_src_no.value=blMaxSeq;
						formObj.eff_dt.focus();
					}
					else {
						ComShowMessage(ComGetMsg('INV00095'));
					}
				}
				else {
					formObj.bl_src_no.value=tmpBlSrcNo;
					formObj.eff_dt.focus();
				}
			break;
			case IBSEARCH_ASYNC14: //AR Office retrieve
				
				formObj.f_cmd.value=SEARCH05;
	 			var sXml=sheetObj.GetSearchData("FNS_INV_0022GS.do", FormQueryString(formObj));
	 			var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
	 			var arrStr=sStr.split("|");
	 			//office
	 			
	 			MakeComboObject(comboObjects[0], arrStr);
	 			var arrStr2=arrStr[1].split("^");
	 			var ar_ofc_cd=formObj.view_ar_ofc_cd.value;
	 			var ofcStr;
	 			var ofcStr2;
	 			for (var i=0; i < arrStr.length; i++) {
	 				var sStr9=arrStr[i].split("^");
	 				if (sStr9[1] == ar_ofc_cd) {
	 					ofcStr=arrStr[i]
	 				}
	 			}
	 			var ofcStr2=ofcStr.split("^");
	 			//tax
				MakeComboObject3(comboObjects[2], ofcStr2[6].substring(0,2));
	            var sStr2=ComGetEtcData(sXml,"currInfo");
				arrCurrInfo=sStr2.split("|");
				//currency
				MakeComboObject2(curr_cd, arrCurrInfo);
				var sStr9=ComGetEtcData(sXml,"dpPrcsKnt");
				arrDpPrcsKnt=sStr9.split("|");
				var sStr3=ComGetEtcData(sXml,"acct_cd");
				var sStr4=ComGetEtcData(sXml,"acct_eng_nm");
				var sStr5=ComGetEtcData(sXml,"acct_krn_nm");
				var sStr6=ComGetEtcData(sXml,"rev_cd");
				var sStr7=ComGetEtcData(sXml,"chg_cd");
				var sStr8=ComGetEtcData(sXml,"rep_chg_cd");
				
				// acccount code
				arrAcctCd=sStr3.split("|");
				arrAcctEngNm=sStr4.split("|");
				arrAcctKrnNm=sStr5.split("|");
				arrRevCd=sStr6.split("|");
				arrChgCd=sStr7.split("|");
				arrRepChgCd=sStr8.split("|");

	 			formObj.office_cnt_cd.value=ofcStr2[6].substring(0,2);
	 			
	 			//2015.05.14 Remove KR,HQ hardcoding by IY Cho
				document.getElementById('taxDiv1').style.display="none";
	 			document.getElementById('taxDiv2').style.display="block";

	 			if (ofcStr2[13] == "INV") {
	 				document.getElementById('invNoDiv').style.display="block";
	 			}
	 			else {
	 				document.getElementById('invNoDiv').style.display="none";
	 			}
			break;
			case IBSEARCH_ASYNC20: // customer name retrieve
				var arrStr2=comboObjects[0].GetSelectCode().split("^");
				formObj.ofc_cd.value=arrStr2[1];
				formObj.f_cmd.value=SEARCH03;
				var actCustCntCd=formObj.cust_cnt_cd.value;
				var actCustSeq=ComReplaceStr(formObj.cust_seq.value,",","");
				var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj)+"&cust_cnt_cd="+actCustCntCd+"&cust_seq="+actCustSeq);
				if(CoInvShowXmlMessage(sXml) != "") {
					formObj.cust_seq.value="";
					formObj.cust_nm.value="";
					ComAlertFocus(formObj.cust_cnt_cd, CoInvShowXmlMessage(sXml));
				} else {
					var cust_nm=ComGetEtcData(sXml,"cust_eng_nm");
					var delt_flg=ComGetEtcData(sXml,"delt_flg");
					if (cust_nm != undefined && delt_flg != undefined) {
						formObj.cust_nm.value=cust_nm;
					} else {
						formObj.cust_seq.value="";
						formObj.cust_nm.value="";
					}
				}
			break;
			case IBSEARCH_ASYNC15: //retrieve customer by  B/L No
				var arrStr2=comboObjects[0].GetSelectCode().split("^");
				formObj.ofc_cd.value=arrStr2[1];
				formObj.f_cmd.value=SEARCH07;
				var sXml=sheetObj.GetSearchData("FNS_INV_0022GS.do", FormQueryString(formObj));
				var cust_cnt_cd=ComGetEtcData(sXml,"cust_cnt_cd");
				var cust_seq=ComGetEtcData(sXml,"cust_seq");
				var cust_nm=ComGetEtcData(sXml,"cust_eng_nm");
				var delt_flg=ComGetEtcData(sXml,"delt_flg");
				var ots_pay_cd=ComGetEtcData(sXml,"ots_pay_cd"); //migration data
				var org_inv_no=ComGetEtcData(sXml,"org_inv_no"); //migration data
				var lcl_vvd=ComGetEtcData(sXml,"oth_lcl_vvd");
				var pol_cd=ComGetEtcData(sXml,"oth_pol_cd");
				var svc_scp_cd=ComGetEtcData(sXml,"oth_svc_scp_cd");
				var io_bnd_cd=ComGetEtcData(sXml,"oth_io_bnd_cd");
				var sail_arr_dt=ComGetEtcData(sXml,"oth_sail_arr_dt");
				
				if (cust_nm != undefined && delt_flg != undefined) {
					if (delt_flg != 'Y') {
						formObj.cust_cnt_cd.value=cust_cnt_cd;
						formObj.cust_seq.value=ComLpad(cust_seq, 6, '0');;
						formObj.cust_nm.value=cust_nm;
						formObj.lcl_vvd.value=lcl_vvd;
						formObj.pol_cd.value=pol_cd;
						formObj.svc_scp_cd.value=svc_scp_cd;
						formObj.io_bnd_cd.value=io_bnd_cd;
						formObj.sail_arr_dt.value=sail_arr_dt;
					} else {
						formObj.cust_cnt_cd.value="";
						formObj.cust_seq.value="";
						formObj.cust_nm.value="";
					}
				} else {
					formObj.cust_cnt_cd.value="";
					formObj.cust_seq.value="";
					formObj.cust_nm.value="";
				}
				if ((ots_pay_cd != "" && ots_pay_cd != undefined) || (org_inv_no != "" && org_inv_no != undefined)) {
					formObj.bl_src_no.value="";
					formObj.cust_cnt_cd.value="";
					formObj.cust_seq.value="";
					formObj.cust_nm.value="";
				}
			break;
			case IBSEARCH_ASYNC16: //retrieve acct_cd
				formObj.f_cmd.value=SEARCH05;
	 			var sXml=sheetObj.GetSearchData("FNS_INV_0022GS.do", FormQueryString(formObj));
	 			var sStr3=ComGetEtcData(sXml,"acct_cd");
				var sStr4=ComGetEtcData(sXml,"acct_eng_nm");
				var sStr5=ComGetEtcData(sXml,"acct_krn_nm");
				var sStr6=ComGetEtcData(sXml,"rev_cd");
				var sStr7=ComGetEtcData(sXml,"chg_cd");
				var sStr8=ComGetEtcData(sXml,"rep_chg_cd");
				
				
				this.arrAcctCd=sStr3.split("|");
				this.arrAcctEngNm=sStr4.split("|");
				this.arrAcctKrnNm=sStr5.split("|");
				this.arrRevCd=sStr6.split("|");
				this.arrChgCd=sStr7.split("|");
				this.arrRepChgCd=sStr8.split("|");
				
			break;
			
			case IBSEARCH_ASYNC09: // retrieve Ex.Rate, Sa Date - actual VVD
				formObj.f_cmd.value=SEARCH09;
				var arrStr2=comboObjects[0].GetSelectCode().split("^");
				formObj.svr_id.value=arrStr2[7];
		 		var sXml=sheetObj.GetSearchData("FNS_INV_0022GS.do", FormQueryString(formObj));
				//var ex_rate=ComGetEtcData(sXml,"ex_rate");
				//var ex_rate_date=ComGetEtcData(sXml,"ex_rate_date");
				//var curr=ComGetEtcData(sXml,"curr");
				//var usd_exrate_type=ComGetEtcData(sXml,"usd_exrate_type");
				//var third_exrate_type=ComGetEtcData(sXml,"third_exrate_type");
				//formObj.usd_exrate_type.value=usd_exrate_type;
				//formObj.third_exrate_type.value=third_exrate_type;
				//formObj.ex_rate_date.value=ex_rate_date;
				//if (ex_rate != undefined) {
				//	formObj.usd_locl_xch_rt.value=ex_rate;
				//	formObj.inv_xch_rt.value=ex_rate;
				//}
				var sa_date=ComGetEtcData(sXml,"sa_date");
				formObj.sail_arr_dt.value=sa_date;
			break;
			
			case IBSEARCH_ASYNC08: //retrieve Ex.Rate 	   
				formObj.f_cmd.value=SEARCH05;
				var arrStr2=comboObjects[0].GetSelectCode().split("^");
				formObj.svr_id.value=arrStr2[7];
				formObj.inv_cust_cnt_cd.value = formObj.cust_cnt_cd.value;
				formObj.inv_cust_seq.value = formObj.cust_seq.value;
				formObj.bkg_no.value = formObj.bl_src_no.value;
				formObj.pod_cd.value = formObj.pol_cd.value;
		 		var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
				var ex_rate=ComGetEtcData(sXml,"ex_rate");
				var ex_rate_date=ComGetEtcData(sXml,"ex_rate_date");
				var curr=ComGetEtcData(sXml,"curr");
				var usd_exrate_type=ComGetEtcData(sXml,"usd_exrate_type");
				var third_exrate_type=ComGetEtcData(sXml,"third_exrate_type");
				formObj.usd_exrate_type.value=usd_exrate_type;
				formObj.third_exrate_type.value=third_exrate_type;
				formObj.ex_rate_date.value=ex_rate_date;
				if(ex_rate != undefined) {
					formObj.inv_xch_rt.value=ex_rate;
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
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function validateForm(sheetObj,formObj,sAction){
    	switch(sAction) {
    		case IBSEARCH:      //retrieve
				with(formObj){
					if(ar_if_no.value == "") {
						ComShowCodeMessage("INV00004");
						ar_if_no.focus();
						return false;
					 }
					if(comboObjects[0].GetSelectText() == "") {
						ComShowCodeMessage("INV00004");
						comboObjects[0].focus();
						return false;
					 }
				}
    		break;
    		case IBSEARCH_ASYNC11:      //exchange rate retrieve
				with(formObj){
					if(bl_src_no.value == "") {
						ComShowCodeMessage("INV00004");
						bl_src_no.focus();
						return false;
					}
					if(eff_dt.text == "") {
						ComShowCodeMessage("INV00004");
						eff_dt.focus();
						return false;
					}
					if(cust_cnt_cd.value == "") {
						ComShowCodeMessage("INV00004");
						cust_cnt_cd.focus();
						return false;
					}
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
					if(inv_rmk.value == "") {
						ComShowCodeMessage("INV00004");
						inv_rmk.focus();
						return false;
					}
				}
			break;
    		case IBSEARCH_ASYNC13:      //when Row Add button click.
				with(formObj){
					if(bl_src_no.value == "") {
						ComShowCodeMessage("INV00004");
						bl_src_no.focus();
						return false;
					}
					if(eff_dt.value == "") {
						ComShowCodeMessage("INV00004");
						eff_dt.focus();
						return false;
					 }
					if(cust_cnt_cd.value == "") {
						ComShowCodeMessage("INV00004");
						cust_cnt_cd.focus();
						return false;
					 }
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
					if(amount.value == "") {
						ComShowCodeMessage("INV00004");
						amount.focus();
						return false;
					}
					if(inv_xch_rt.value == "") {
						ComShowCodeMessage("INV00004");
						inv_xch_rt.focus();
						return false;
					}
				}
			break;
    		case IBSAVE:      //save
    			with(formObj){
					if(bl_src_no.value == "") {
						ComShowCodeMessage("INV00004");
						bl_src_no.focus();
						return false;
					}
					if(eff_dt.text == "") {
						ComShowCodeMessage("INV00004");
						eff_dt.focus();
						return false;
					}
					if(cust_cnt_cd.value == "") {
						ComShowCodeMessage("INV00004");
						cust_cnt_cd.focus();
						return false;
					}
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
					if(inv_rmk.value == "") {
						ComShowCodeMessage("INV00073");
						inv_rmk.focus();
						return false;
					}
					if(lcl_vvd.value == "") {
						ComShowCodeMessage("INV00004");
						lcl_vvd.focus();
						return false;
					}
					if(pol_cd.value == "") {
						ComShowCodeMessage("INV00004");
						pol_cd.focus();
						return false;
					}
					if(svc_scp_cd.value == "") {
						ComShowCodeMessage("INV00004");
						svc_scp_cd.focus();
						return false;
					}
					//compare DR SUM and CR SUM 
					
					if(ComReplaceStr(ComReplaceStr(sheetObjects[1].GetSumValue(0, "chg_amt"),"-",""),",","") != ComReplaceStr(ComReplaceStr(sheetObjects[2].GetSumValue(0, "chg_amt"),"-",""),",","")) {
						ComShowCodeMessage("INV00064");
						return false;
					}
				}
			break;
    		case IBINSERT:      //inv no creation
				with(formObj){
					if(bl_src_no.value == "") {
						ComShowCodeMessage("INV00004");
						bl_src_no.focus();
						return false;
					}
					if(eff_dt.text == "") {
						ComShowCodeMessage("INV00004");
						eff_dt.focus();
						return false;
					}
					if(cust_cnt_cd.value == "") {
						ComShowCodeMessage("INV00004");
						cust_cnt_cd.focus();
						return false;
					}
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
					if(inv_rmk.value == "") {
						ComShowCodeMessage("INV00073");
						inv_rmk.focus();
						return false;
					}
				}
    		break;
    	}
		return true;
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
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function MakeComboObject(cmbObj, arrStr) {
	    for (var i=1; i < arrStr.length;i++ ) {
	        var arrStr2=arrStr[i].split("^");
	        var ar_ofc_cd_str=arrStr2[1];
	        cmbObj.InsertItem(i-1, ar_ofc_cd_str, arrStr[i]);            
	    }
	    cmbObj.SetDropHeight(190);
	}
	
	
	/** 
	 * currency select box <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {IBMultiCombo} comboObj  
	 * @param  {Array} arrStr
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function MakeComboObject2(cmbObj, arrStr) {
		cmbObj.RemoveAll();
		for (var i=1; i < arrStr.length;i++ ) {
			cmbObj.InsertItem(i-1, arrStr[i], arrStr[i]);
		}
		cmbObj.SetBackColor("#CCFFFD");
	}
	/** 
	 * update Tax select box by contry <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {IBMultiCombo} comboObj  
	 * @param  {Array} arrStr
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function MakeComboObject3(cmbObj, cntCd) {
		var arrStr1="";
		var arrStr2="";
			arrStr1=",0%,10%";
			arrStr2=",0,10";
		var arrStrSpl1=arrStr1.split(",");
		var arrStrSpl2=arrStr2.split(",");
		 cmbObj.RemoveAll();
		for (var i=1; i < arrStrSpl1.length;i++ ) {
			cmbObj.InsertItem(i-1, arrStrSpl1[i], arrStrSpl2[i]);
		}
		cmbObj.SetSelectText("");
		cmbObj.SetBackColor("#CCFFFD");
	}
	/** 
	 * add data combo field on grid.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj  
	 * @param  {object} colName
	 * @param  {IBMultiCombo} isCellCombo
	 * @return true, false
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function addCellComboItem(sheetObj,colName,isCellCombo) {
    	var sRow=sheetObj.GetSelectRow();
    	var formObj=document.form;
    	var viewYn=formObj.view_yn.value;
    	var officeCd=comboObjects[0].GetSelectText();
    	var officeCntCd=formObj.office_cnt_cd.value;
		var sRow=sheetObj.GetSelectRow();
		var comboTxt="";
	    var comboVal="";
		for (var i=0; i < arrAcctCd.length;i++ ) {
			if (arrAcctCd[i] != "") {
				if (viewYn == "Y") {
					//2015.05.14 Remove KR,HQ hardcoding by IY Cho
					comboTxt += arrAcctCd[i]+"\t"+arrAcctEngNm[i];
					comboVal += arrAcctCd[i];
					if (i < arrAcctCd.length-1) {
						comboTxt += ROWMARK;
						comboVal += ROWMARK;
					}
				}
				else {
					//2015.05.14 Remove KR,HQ hardcoding by IY Cho
					if (arrAcctCd[i] != "47101010") {
						comboTxt += arrAcctCd[i]+"\t"+arrAcctEngNm[i];
						comboVal += arrAcctCd[i];
						if (i < arrAcctCd.length-1) {
							comboTxt += ROWMARK;
							comboVal += ROWMARK;
						}
					}
				}
			}
			else {
				comboTxt += " \t ";
				comboVal += " ";
				if (i < arrAcctCd.length-1) {
					comboTxt += ROWMARK;
					comboVal += ROWMARK;
				}
			}
		}
		
		//setting combo [ROW, COL, COMBO-TEXT, COMBO-CODE, DEFAULT-TEXT]
		if (isCellCombo) {
			sheetObj.CellComboItem(sRow,colName, {ComboText:comboTxt, ComboCode:comboVal} );
		}
		else {
			sheetObj.SetColProperty(colName, {ComboText:comboTxt , ComboCode:comboVal} );
		}
	}
	
	/** 
	 * add data combo field on grid.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj  
	 * @param  {object} colName
	 * @param  {IBMultiCombo} isCellCombo
	 * @return true, false
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function addCellComboItem2(sheetObj,colName,isCellCombo) {
    	var sRow=sheetObj.GetSelectRow();
    	var formObj=document.form;
    	var viewYn=formObj.view_yn.value;
    	var officeCd=comboObjects[0].GetSelectText();
    	var officeCntCd=formObj.office_cnt_cd.value;
		var sRow=sheetObj.GetSelectRow();
		var comboTxt="";
	    var comboVal="";
		for (var i=0; i < arrAcctCd.length;i++ ) {
			if (arrAcctCd[i] != "") {
				if (viewYn == "Y") {
					//2015.05.14 Remove KR,HQ hardcoding by IY Cho
					comboTxt += arrAcctCd[i]+"\t"+arrAcctEngNm[i];
					comboVal += arrAcctCd[i];
					if (i < arrAcctCd.length-1) {
						comboTxt += ROWMARK;
						comboVal += ROWMARK;
					}
				}
				else {
					//2015.05.14 Remove KR,HQ hardcoding by IY Cho
					if (arrAcctCd[i] != "47101010") {
						comboTxt += arrAcctCd[i]+"\t"+arrAcctEngNm[i];
						comboVal += arrAcctCd[i];
						if (i < arrAcctCd.length-1) {
							comboTxt += ROWMARK;
							comboVal += ROWMARK;
						}
					}
				}
			}
			else {
				comboTxt += " \t ";
				comboVal += " ";
				if (i < arrAcctCd.length-1) {
					comboTxt += ROWMARK;
					comboVal += ROWMARK;
				}
			}
		}
		
		//setting combo [ROW, COL, COMBO-TEXT, COMBO-CODE, DEFAULT-TEXT]
		if (isCellCombo) {
			
			var glDt = formObj.eff_dt.value;
			for(var j=1; j <= sheetObj.RowCount(); j++){
				var currAcct = sheetObj.GetCellValue(j, "acct_cd")
				if(currAcct != "" && comboVal.indexOf(currAcct) < 0) {
					ComShowCodeMessage("INV00159", currAcct, glDt);					
				}
				setAccountInfo(sheetObj, j, currAcct);
				sheetObj.CellComboItem(j,colName, {ComboText:comboTxt, ComboCode:comboVal} );
			}
		}
		else {
			sheetObj.SetColProperty(colName, {ComboText:comboTxt , ComboCode:comboVal} );
		}
	}
	
	/** 
	 * call method when select event on popup(FNS_INV_0086)<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {array} rowArray   
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function getFNS_INV_0086(rowArray) {
		var colArray=rowArray[0];
		var formObj=document.form;
		formObj.cust_cnt_cd.value=colArray[8];
		formObj.cust_seq.value=ComLpad(colArray[9], 6, '0');
		formObj.cust_nm.value=colArray[4];
	}
	/** 
	 * init<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {object} formObj  
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function removeAll(formObj) {
		//document.title="Other Revenue Invoice Creation";
		//document.getElementById("title").innerHTML="&nbsp;&nbspOther Revenue Invoice Creation";
		formObj.reset();
		sheetObjects[0].RemoveAll();
		sheetObjects[1].RemoveAll();
		sheetObjects[2].RemoveAll();
		sheetObjects[3].RemoveAll();
		doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC10);
		// init retrieve condition
		setSearchValueType();
	}
    /** 
	 * init attribute by retrieve condition <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param   none  
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function setSearchValueType() {
		var formObj=document.form;
		if (formObj.view_ar_if_no.value == '' && formObj.view_ar_ofc_cd.value == '') {
			ComEnableObject(formObj.bl_src_no,true);
			ComEnableObject(formObj.eff_dt,true);
			ComEnableObject(formObj.cust_cnt_cd,true);
			ComEnableObject(formObj.cust_seq,true);
			ComEnableObject(formObj.amount,true);
			ComEnableObject(formObj.inv_xch_rt,true);
			ComEnableObject(formObj.inv_rmk,true);
			ComEnableObject(formObj.lcl_vvd,true);
			ComEnableObject(formObj.pol_cd,true);
			ComEnableObject(formObj.svc_scp_cd,true);
			ComEnableObject(formObj.io_bnd_cd,true);
			formObj.bl_src_no.className="input1";
			formObj.bl_src_no.tabIndex="";
			formObj.eff_dt.className="input1";
			formObj.eff_dt.tabIndex="";
			formObj.cust_cnt_cd.className="input1";
			formObj.cust_cnt_cd.tabIndex="";
			formObj.cust_seq.className="input1";
			formObj.cust_seq.tabIndex="";
			formObj.amount.className="input1";
			formObj.amount.tabIndex="";
			formObj.inv_xch_rt.className="input";
			formObj.inv_xch_rt.tabIndex="";
			formObj.inv_rmk.className="input1";
			formObj.inv_rmk.tabIndex="";
			formObj.lcl_vvd.className="input1";
			formObj.lcl_vvd.tabIndex="";
			formObj.pol_cd.className="input1";
			formObj.pol_cd.tabIndex="";
			formObj.svc_scp_cd.className="input1";
			formObj.svc_scp_cd.tabIndex="";
			ar_ofc_cd.SetEnable(1);
			curr_cd.SetEnable(1);
			ar_tax_ind_cd.SetEnable(1);
			ComEnableObject(formObj.ar_if_no,false);
			formObj.ar_if_no.className="input2";
			formObj.ar_if_no.tabIndex="-1";
			ComBtnEnable("btn_auto");
			ComBtnEnable("btn_save");
			ComBtnDisable("btn_print1");
			ComBtnDisable("btn_print2");
			ComBtnDisable("btn_create");
			ComBtnEnable("btn_add");
			ComBtnEnable("btn_copy");
			ComBtnEnable("btn_delete");
			ComBtnEnable("btns_calendar");
			ComBtnEnable("btns_cust2");
			formObj.bl_src_no.focus();
	    	var currCdStr=curr_cd.GetSelectText();
	    	var lclCurrStr=formObj.lcl_curr.value;
	    	if (currCdStr == lclCurrStr) {
	    		ComEnableObject(formObj.inv_xch_rt,false);
	    	}
	    	else {
	    		ComEnableObject(formObj.inv_xch_rt,true);
	    	}
		}
		else {
			ComEnableObject(formObj.bl_src_no,false);
			ComEnableObject(formObj.eff_dt,false);
			ComEnableObject(formObj.cust_cnt_cd,false);
			ComEnableObject(formObj.cust_seq,false);
			ComEnableObject(formObj.amount,false);
			ComEnableObject(formObj.lcl_vvd,false);
			ComEnableObject(formObj.pol_cd,false);
			ComEnableObject(formObj.svc_scp_cd,false);
			ComEnableObject(formObj.io_bnd_cd,false);
			if (formObj.inv_xch_rt.className == 'input') {
				ComEnableObject(formObj.inv_xch_rt,false);
			}
			else {
				formObj.inv_xch_rt.className="input2";
				formObj.inv_xch_rt.tabIndex="";
			}
			ComEnableObject(formObj.inv_rmk,false);
			ar_ofc_cd.SetEnable(0);
			curr_cd.SetEnable(0);
			ar_tax_ind_cd.SetEnable(0);
			ComBtnDisable("btn_auto");
			ComBtnDisable("btn_save");
			ComBtnEnable("btn_print1");
			ComBtnEnable("btn_print2");
			ComBtnDisable("btn_add");
			ComBtnDisable("btn_copy");
			ComBtnDisable("btn_delete");
			ComBtnDisable("btns_calendar");
			ComBtnDisable("btns_cust2");
		}
	}
	/** 
	 * Office AR Currency exchange rate retrieve<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  none  
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function getLoclXchRt() {
		var sheetObj=sheetObjects[0];
		var rowCnt=sheetObj.RowCount();
		var formObj=document.form;
		var rtnValue=false;
		if (formObj.eff_dt.value != '' && formObj.lcl_curr.value != '' /*&& formObj.sail_arr_dt.value == ''*/) { //2016.06.13 Add
			doActionIBSheet(sheetObjects[0],document.form,IBSEARCH_ASYNC11);
			var glEffDt=ComReplaceStr(formObj.eff_dt.value,"-","");
			if (glEffDt != '') {
				if(formObj.sail_arr_dt.value == '') { //2016.06.13 Add
					var lclVvd="";
					var acctCnt=0;
					for(var j=1; j <= rowCnt; j++){
						if (sheetObj.GetCellValue(j, "acct_cd") == "41202010" || sheetObj.GetCellValue(j, "acct_cd") == "41101010" || sheetObj.GetCellValue(j, "acct_cd") == "47101010") {
							acctCnt++;
						}
					}
					if (acctCnt > 0) {
						lclVvd="CNTC"+glEffDt.substring(2,6)+"M";
					}
					else {
						lclVvd="COMC"+glEffDt.substring(2,6)+"M";
					}
					formObj.lcl_vvd.value=lclVvd;
					formObj.svc_scp_cd.value="OTH"; //2016.06.13 Add
					formObj.io_bnd_cd.value="O"; //2016.06.13 Add
					rtnValue=true;
				} else{		
					sheetObjects[0].RowDelete();
	            	doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC16); // add 2018.08.29
				}
			}
			if (formObj.inv_xch_rt.value == '') {
				ComShowMessage(ComGetMsg('INV00001'));
				rtnValue=false;
			}
		}
		return rtnValue;
	}
	/** 
	 * Amount calculate<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  none  
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function calLocalAmount() {
		var formObj=document.form;
		var rtnValue=false;
		var currPoint=formObj.curr_point.value;
		var lclCurrPoint=formObj.lcl_curr_point.value;
		if (formObj.eff_dt.value != '' && formObj.amount.value != '' && formObj.inv_xch_rt.value != '') {
			var amount=ComReplaceStr(formObj.amount.value,",","");
			var xchRate=ComReplaceStr(formObj.inv_xch_rt.value,",","");
			var tax=comboObjects[2].GetSelectCode();
			var localAmount;
			var taxAmount;
			formObj.amount.value=setCurrPointValue(InvRound(parseFloat(amount),currPoint), currPoint);
			//1. Local Amount calculate
			localAmount=parseFloat(amount) * parseFloat(xchRate);
			formObj.local_amount.value=setCurrPointValue(InvRound(localAmount,lclCurrPoint), lclCurrPoint);
			//2. Tax calculate
			if (localAmount != '0' && tax != '') {
				var taxRate="";
				if (tax == '0') {
					formObj.tax_amount_ori.value=setCurrPointValue(InvRound("0", lclCurrPoint), lclCurrPoint);
					formObj.tax_amount.value=setCurrPointValue(InvRound("0", lclCurrPoint), lclCurrPoint);
				}
				else if (tax == '10' || tax == 'N') {
					taxAmount=parseFloat(localAmount) / 10;
					formObj.tax_amount_ori.value=setCurrPointValue(InvRound(taxAmount, lclCurrPoint), lclCurrPoint);
					formObj.tax_amount.value=setCurrPointValue(InvRound(taxAmount, lclCurrPoint), lclCurrPoint);
				}
			}
			else {
				formObj.tax_amount_ori.value=setCurrPointValue(InvRound("0", lclCurrPoint), lclCurrPoint);
				formObj.tax_amount.value=setCurrPointValue(InvRound("0", lclCurrPoint), lclCurrPoint);
			}
			//3. Local Total calculate
			formObj.total_local_amt.value=setCurrPointValue(InvRound(Number(ComReplaceStr(formObj.local_amount.value,",","")) + Number(ComReplaceStr(formObj.tax_amount.value,",","")), lclCurrPoint), lclCurrPoint);
			rtnValue=true;
		}
		else {
			currPoint="0";
			formObj.local_amount.value=setCurrPointValue("0", lclCurrPoint);
			formObj.tax_amount_ori.value=setCurrPointValue("0", lclCurrPoint);
			formObj.tax_amount.value=setCurrPointValue("0", lclCurrPoint);
			formObj.total_local_amt.value=setCurrPointValue("0", lclCurrPoint);
			rtnValue=false;
		}
		return rtnValue;
	}
	/** 
	 *  Amount calculate when cr changed <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  none  
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function calLocalAmount2() {
		var formObj=document.form;
		var rtnValue=false;
		var currPoint=formObj.curr_point.value;
		var lclCurrPoint=formObj.lcl_curr_point.value;
		if (formObj.eff_dt.value != '' && formObj.amount.value != '' && formObj.inv_xch_rt.value != '') {
			var amount=ComReplaceStr(formObj.amount.value,",","");
			var xchRate=ComReplaceStr(formObj.inv_xch_rt.value,",","");
			var tax=comboObjects[2].GetSelectCode();
			formObj.amount.value=setCurrPointValue(InvRound(amount,currPoint), currPoint);
			//3. Local Total calculate
			formObj.total_local_amt.value=setCurrPointValue(InvRound(Number(ComReplaceStr(formObj.local_amount.value,",","")) + Number(ComReplaceStr(formObj.tax_amount.value,",","")), lclCurrPoint), lclCurrPoint);
			rtnValue=true;
		}
		else {
			currPoint="0";
			formObj.local_amount.value=setCurrPointValue("0", lclCurrPoint);
			formObj.tax_amount.value=setCurrPointValue("0", lclCurrPoint);
			formObj.total_local_amt.value=setCurrPointValue("0", lclCurrPoint);
			rtnValue=false;
		}
		return rtnValue;
	}
	/** 
	 * TVA Amount calculate when cr changed <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  none  
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function calTVAAmount(sheetObj, formObj) {
		var rtnValue=false;
		var invVatChgCd=formObj.inv_vat_chg_cd.value;
		var invVatChgRt=formObj.inv_vat_chg_rt.value;
		var currPoint=formObj.curr_point.value;
		var lclCurrPoint=formObj.lcl_curr_point.value;
		var invXchRt=formObj.inv_xch_rt.value;
		var officeCntCd=formObj.office_cnt_cd.value;
		var tvaFlgCnt=0;		
		var taxInfoCnt=0;		
		var totalChgAmt=0;
		var taxChgAmt=0;
		for(var i=sheetObj.RowCount(); i>0; i--){
			if(sheetObj.GetCellValue(i, "ibflag") != "" && sheetObj.GetCellValue(i, "acct_cd") == "11303015" && sheetObj.GetCellValue(i, "tax_yn") == "T") {
				taxInfoCnt ++;
			}
			if(sheetObj.GetCellValue(i, "ibflag") != "" && sheetObj.GetCellValue(i, "tva_flg") == "1") {
				tvaFlgCnt ++;
				if (sheetObj.GetCellValue(i, "chg_amt") != "") {
					totalChgAmt += ComReplaceStr(parseFloat(sheetObj.GetCellValue(i, "chg_amt")),",","");
				}
			}
		}
		taxChgAmt=totalChgAmt * invXchRt * invVatChgRt / 100;
		if (tvaFlgCnt > 0 && taxInfoCnt == 0) {
			document.getElementById('taxDiv1').style.display="block";
			document.getElementById('taxDiv2').style.display="none";
			comboObjects[2].SetEnable(0);
			sheetObj.DataInsert(-1);
			if (lclCurrPoint == '0') {
				sheetObj.InitCellProperty(sheetObj.GetSelectRow(), "chg_amt",{ Type:"Int",Align:"Right",Format:"NullInteger"} );
			}
			else {
				sheetObj.InitCellProperty(sheetObj.GetSelectRow(), "chg_amt",{ Type:"Float",Align:"Right",Format:"NullFloat",PointCount:lclCurrPoint} );
			}
			addCellComboItem(sheetObj,'acct_cd',true);
			sheetObj.SetCellValue(sheetObj.GetSelectRow(), "acct_cd","11303015");
			sheetObj.SetCellValue(sheetObj.GetSelectRow(), "chg_full_nm","V.A.T. RECEIVED");
			sheetObj.SetCellValue(sheetObj.GetSelectRow(), "cust_code",formObj.cust_cnt_cd.value + formObj.cust_seq.value );
			sheetObj.SetCellValue(sheetObj.GetSelectRow(), "city",formObj.pol_cd.value);
			sheetObj.SetCellValue(sheetObj.GetSelectRow(), "curr_cd",formObj.lcl_curr.value);
			sheetObj.SetCellValue(sheetObj.GetSelectRow(), "chg_amt",InvRound(taxChgAmt, lclCurrPoint) ,0);
			sheetObj.SetCellValue(sheetObj.GetSelectRow(), "chg_rmk","");
			sheetObj.SetCellValue(sheetObj.GetSelectRow(), "inv_rev_tp_src_cd","XXX");
			sheetObj.SetCellValue(sheetObj.GetSelectRow(), "chg_cd",invVatChgCd);
			sheetObj.SetCellValue(sheetObj.GetSelectRow(), "rep_chg_cd","SLC");
			sheetObj.SetCellValue(sheetObj.GetSelectRow(), "inv_xch_rt","1");
			sheetObj.SetCellValue(sheetObj.GetSelectRow(), "tax_yn","T");
			sheetObj.SetCellValue(sheetObj.GetSelectRow(), "mnl_flg","N");
			sheetObj.SetCellEditable(sheetObj.GetSelectRow(), "acct_cd",0);
			sheetObj.SetCellEditable(sheetObj.GetSelectRow(), "chg_amt",0);
			sheetObj.SetCellEditable(sheetObj.GetSelectRow(), "chg_rmk",0);
			sheetObj.SetCellEditable(sheetObj.GetSelectRow(), "tva_flg",0);
			formObj.tax_amount.value=setCurrPointValue(InvRound(Number(ComReplaceStr(taxChgAmt,",","")), lclCurrPoint), lclCurrPoint);
			formObj.total_local_amt.value=setCurrPointValue(InvRound(Number(ComReplaceStr(formObj.local_amount.value,",","")) + Number(ComReplaceStr(formObj.tax_amount.value,",","")), lclCurrPoint), lclCurrPoint);
		}
		else if (tvaFlgCnt > 0 && taxInfoCnt > 0) {
			for(var i=sheetObj.RowCount(); i>0; i--){
				if(sheetObj.GetCellValue(i, "ibflag") != "" && sheetObj.GetCellValue(i, "acct_cd")=="11303015" && sheetObj.GetCellValue(i, "tax_yn") == "T") {
					sheetObj.SetCellValue(i, "chg_amt",InvRound(taxChgAmt, lclCurrPoint),0);
				}
			}
			formObj.tax_amount.value=setCurrPointValue(InvRound(Number(ComReplaceStr(taxChgAmt,",","")), lclCurrPoint), lclCurrPoint);
			formObj.total_local_amt.value=setCurrPointValue(InvRound(Number(ComReplaceStr(formObj.local_amount.value,",","")) + Number(ComReplaceStr(formObj.tax_amount.value,",","")), lclCurrPoint), lclCurrPoint);
		}
		else {
			//2015.05.14 Remove KR,HQ hardcoding by IY Cho
			document.getElementById('taxDiv1').style.display="none";
			document.getElementById('taxDiv2').style.display="block";
			for(i=sheetObj.RowCount(); i>0; i--){
				if(sheetObj.GetCellValue(i, "ibflag") != "" && sheetObj.GetCellValue(i, "acct_cd")=="11303015" && sheetObj.GetCellValue(i, "tax_yn")=="T") {
					sheetObj.RowDelete(i, false);
				}
			}
			formObj.tva_amount.value=0;
			formObj.total_local_amt.value=setCurrPointValue(InvRound(Number(ComReplaceStr(formObj.local_amount.value,",","")) + Number(ComReplaceStr(formObj.tax_amount.value,",","")), lclCurrPoint), lclCurrPoint);
		}
	}
	/** 
	 * CR Detail grid setting<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {object} gridType  
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function dtlGridSet(gridType) {
		var sheetObj=sheetObjects[0];
		var formObj=document.form;
		var currPoint=formObj.curr_point.value;
		var lclCurrPoint=formObj.lcl_curr_point.value;
		var officeCntCd=formObj.office_cnt_cd.value;
		if (gridType == 'amount') {
			//2015.05.14 Remove KR,HQ hardcoding by IY Cho
			for(i=sheetObj.RowCount(); i>0; i--){
				if(sheetObj.GetCellValue(i, "ibflag") != "" && sheetObj.GetCellValue(i, "tax_yn")=="Y") {
					sheetObj.RowDelete(i, false);
				}
			}
		}
		else if (gridType == 'exRate') {
			for(var i=sheetObj.RowCount(); i>0; i--){
				if(sheetObj.GetCellValue(i, "ibflag") != "" && sheetObj.GetCellValue(i, "acct_cd")=="11303015" && sheetObj.GetCellValue(i, "tax_yn")== "Y") {
					sheetObj.SetCellValue(i, "chg_amt",formObj.tax_amount.value,0);
				}
				else if(sheetObj.GetCellValue(i, "ibflag") != "" && sheetObj.GetCellValue(i, "acct_cd")=="11303015" && sheetObj.GetCellValue(i, "tax_yn")== "T") {
					sheetObj.SetCellValue(i, "inv_xch_rt","1",0);
				}
				else {
					sheetObj.SetCellValue(i, "inv_xch_rt",formObj.inv_xch_rt.value,0);
				}
			}
		}
		else if (gridType == 'currency') {
			for(var i=sheetObj.RowCount(); i>0; i--){
				if (sheetObj.GetCellValue(i, "ibflag") != "" && sheetObj.GetCellValue(i, "acct_cd") == "11303015" && sheetObj.GetCellValue(i, "tax_yn") == "Y") {
					sheetObj.SetCellValue(i, "chg_amt",formObj.tax_amount.value,0);
				}
				else if (sheetObj.GetCellValue(i, "ibflag") != "" && sheetObj.GetCellValue(i, "acct_cd") == "11303015" && sheetObj.GetCellValue(i, "tax_yn") == "T") {
					if (currPoint > 0) {
						sheetObj.InitCellProperty(i, "chg_amt",{ Type:"Float",Align:"Right",Format:"NullFloat",PointCount:currPoint} );
					}
					else {
						sheetObj.InitCellProperty(i, "chg_amt",{ Type:"Int",Align:"Right",Format:"NullInteger"} );
					}
					sheetObj.SetCellValue(i, "chg_amt",formObj.tax_amount.value,0);
				}
				else {
					if (currPoint > 0) {
						sheetObj.InitCellProperty(i, "chg_amt",{ Type:"Float",Align:"Right",Format:"NullFloat",PointCount:currPoint} );
					}
					else {
						sheetObj.InitCellProperty(i, "chg_amt",{ Type:"Int",Align:"Right",Format:"NullInteger"} );
					}
					sheetObj.SetCellValue(i, "curr_cd",comboObjects[1].GetSelectText());
					sheetObj.SetCellValue(i, "inv_xch_rt",formObj.inv_xch_rt.value);
				}
			}
		}
	}
	/**
	 * DR grid setting<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  none  
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function drGridSet() {
		var sheetObj=sheetObjects[1]; 
		var formObj=document.form;
		if (formObj.eff_dt.value != '' && formObj.amount.value != '' && formObj.inv_xch_rt.value != '') {
			sheetObj.RemoveAll();
			var curs="";
			var sums="";
			
			var currPoint=formObj.curr_point.value;
			var lclCurrPoint=formObj.lcl_curr_point.value;
			
			var currCd=comboObjects[1].GetSelectText();
			var lclCurrCd=formObj.lcl_curr.value;
			
			var amount=ComReplaceStr(formObj.amount.value,",","");
			var taxAmount=ComReplaceStr(formObj.tax_amount.value,",","");
			
			if (Number(amount) != 0) {
				sums=sums + comboObjects[1].GetSelectText()+"^"+amount+"|";
				if (curs.indexOf(comboObjects[1].GetSelectText()) == -1) {
					curs=curs + comboObjects[1].GetSelectText() +"|";
				}
			}
			
			if (Number(taxAmount) != 0) {
				sums=sums + formObj.tax_curr_cd.value+"^"+taxAmount+"|";
				if (curs.indexOf(formObj.tax_curr_cd.value) == -1) {
					curs=curs + formObj.tax_curr_cd.value +"|";
				}
			}
			//"|Curr|Local Total";
			var curs_item=curs.split("|");
			
			sheetObj.SetSumText(0,1,"Total : " + formObj.lcl_curr.value);

			
			for (var i=0; i < curs_item.length - 1; i++) {
				sheetObj.DataInsert(-1);
				sheetObj.SetCellValue(i+1, 1,curs_item[i]);
			}
			
			var sums_item=sums.split("|");
			var sums_item2="";
			
			for (var i=0; i < sums_item.length - 1; i++) {
				sums_item2=sums_item[i].split("^");
				var totalAmount=0;
				
				for (var j=0; j < sheetObj.RowCount(); j ++) {
					if (sheetObj.GetCellValue(j+1, 1) == sums_item2[0] && sums_item2[1] != "") {
						if (sheetObj.GetCellValue(j+1, 1) == currCd ) {
							totalAmount=InvRound((sheetObj.GetCellValue(j+1, 2) == "" ? 0 : Number(ComReplaceStr(sheetObj.GetCellValue(j+1, 2),",",""))) + Number(ComReplaceStr(sums_item2[1],",","")), currPoint);
							sheetObj.SetCellValue(j+1, 2,setCurrPointValue(totalAmount, currPoint));
							sheetObj.SetCellValue(j+1, 3,setCurrPointValue(totalAmount, currPoint));
//							sheetObj.SetCellValue(j+1, 2,totalAmount);
						}
						else {
							totalAmount=InvRound((sheetObj.GetCellValue(j+1, 2) == "" ? 0 : Number(ComReplaceStr(sheetObj.GetCellValue(j+1, 2),",",""))) + Number(ComReplaceStr(sums_item2[1],",","")), lclCurrPoint);
							sheetObj.SetCellValue(j+1, 2,setCurrPointValue(totalAmount, lclCurrPoint));
							sheetObj.SetCellValue(j+1, 3,setCurrPointValue(totalAmount, lclCurrPoint));
//							sheetObj.SetCellValue(j+1, 2,totalAmount);
						}
					}
				}
			}
			sheetObj.SetSumValue(0, "chg_amt",formObj.total_local_amt.value);
		}
	}
	/** 
	 * CR grid setting<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  none  
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function crGridSet() {
		var sheetObj1=sheetObjects[0];
		var sheetObj2=sheetObjects[2];
		var formObj=document.form;
		var currPoint=formObj.curr_point.value;
		var lclCurrPoint=formObj.lcl_curr_point.value;
		var setCurrPoint="";
		if (Number(currPoint) > Number(lclCurrPoint)) {
			setCurrPoint=currPoint;
		}
		else {
			setCurrPoint=lclCurrPoint;
		}
		if (formObj.eff_dt.value != '' && formObj.amount.value != '' && formObj.inv_xch_rt.value != '') {
			var arrStr2=comboObjects[0].GetSelectCode().split("^");
			var currPoint=formObj.curr_point.value;
			var lclCurrPoint=formObj.lcl_curr_point.value;
			var currCd=comboObjects[1].GetSelectText();
			var lclCurrCd=formObj.lcl_curr.value;
			sheetObj2.RemoveAll();
			var rowCnt1=sheetObj1.RowCount();
			var rowCnt2=sheetObj2.RowCount();
			var curCnt=0;
			var curs="";
			var sums="";
			for(var j=1; j <= rowCnt1; j++){
				if (sheetObj1.GetCellValue(j, "curr_cd") != "KRW") {
					if (sheetObj1.GetCellValue(j, "inv_xch_rt") != 0) {
						sums=sums + sheetObj1.GetCellValue(j, "curr_cd")+"^"+sheetObj1.GetCellValue(j, "chg_amt")+"^"+sheetObj1.GetCellValue(j, "inv_xch_rt")+"|";
						if (curs.indexOf(sheetObj1.GetCellValue(j, "curr_cd")) == -1) {
							curs=curs + sheetObj1.GetCellValue(j, "curr_cd") +"|";
						}
					}
				}
			}
			for(var j=1; j <= rowCnt1; j++){
				if (sheetObj1.GetCellValue(j, "curr_cd") == "KRW") {
					if (sheetObj1.GetCellValue(j, "inv_xch_rt") != 0) {
						sums=sums + sheetObj1.GetCellValue(j, "curr_cd")+"^"+sheetObj1.GetCellValue(j, "chg_amt")+"^"+sheetObj1.GetCellValue(j, "inv_xch_rt")+"|";
						if (curs.indexOf(sheetObj1.GetCellValue(j, "curr_cd")) == -1) {
							curs=curs + sheetObj1.GetCellValue(j, "curr_cd") +"|";
						}
					}
				}
			}
			var curs_item=curs.split("|");
//			sheetObj2.MessageText("Sum")="Total : " + formObj.lcl_curr.value;
			sheetObj2.SetSumText(0,1,"Total : " + formObj.lcl_curr.value);
			for (var i=0; i < curs_item.length - 1; i++) {
				sheetObj2.DataInsert(-1);
				sheetObj2.SetCellValue(i+1, 1,curs_item[i]);
			}
			var sums_item=sums.split("|");
			var sums_item2="";
			for (var i=0; i < sums_item.length - 1; i++) {
				sums_item2=sums_item[i].split("^");
				for (var j=0; j < sheetObj2.RowCount(); j ++) {
					if (sheetObj2.GetCellValue(j+1, 1) == sums_item2[0] && sums_item2[1] != "" && sums_item2[2] != "") {
						if (sheetObj2.GetCellValue(j+1, 1) == currCd ) {
							var localTotal=InvRound((sheetObj2.GetCellValue(j+1, 2) == "" ? 0 : Number(ComReplaceStr(sheetObj2.GetCellValue(j+1, 2),",",""))) + Number(ComReplaceStr(sums_item2[1],",","")), currPoint);
							sheetObj2.SetCellValue(j+1, 2,setCurrPointValue(localTotal, currPoint));
							sheetObj2.SetCellValue(j+1, 3,sums_item2[2]);
						}
						else {
							var localTotal=InvRound((sheetObj2.GetCellValue(j+1, 2) == "" ? 0 : Number(ComReplaceStr(sheetObj2.GetCellValue(j+1, 2),",",""))) + Number(ComReplaceStr(sums_item2[1],",","")), lclCurrPoint);
							sheetObj2.SetCellValue(j+1, 2,setCurrPointValue(localTotal, lclCurrPoint));
							sheetObj2.SetCellValue(j+1, 3,sums_item2[2]);
						}
					}
				}
			}
		}
		if (lclCurrPoint == '0') {
			sheetObj2.SetSumValue(0, "chg_amt",setCurrPointValue(InvRound(sheetObj2.GetSumValue(0, "local_total"), lclCurrPoint), lclCurrPoint));
		}
		else {
			sheetObj2.SetSumValue(0, "chg_amt",setCurrPointValue(InvRound(sheetObj2.GetSumValue(0, "local_total"), setCurrPoint), setCurrPoint));
		}	
	}
	/** 
	 * INV_AR_AMT grid setting<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  none  
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function amtGridSet() {
		var sheetObj1=sheetObjects[0];
		var sheetObj2=sheetObjects[3];
		var formObj=document.form;
		if (formObj.eff_dt.value != '' && formObj.amount.value != '' && formObj.inv_xch_rt.value != '') {
			var arrStr2=comboObjects[0].GetSelectCode().split("^");
			var currPoint=formObj.curr_point.value;
			var lclCurrPoint=formObj.lcl_curr_point.value;
			var currCd=comboObjects[1].GetSelectText();
			var lclCurrCd=formObj.lcl_curr.value;
			sheetObj2.RemoveAll();
			var rowCnt1=sheetObj1.RowCount();
			var curCnt=0;
			var curs="";
			var curs2="";
			var sums="";
			var tjSrcNm="";
			for(var j=1; j <= rowCnt1; j++){
				if (sheetObj1.GetCellValue(j, "chg_cd") == 'XXX') {
					tjSrcNm="NONRE";
				}
				else if (sheetObj1.GetCellValue(j, "tax_yn") != 'N') {
					tjSrcNm="VAT";
				}
				else {
					tjSrcNm="OTHER";
				}
				sums=sums + tjSrcNm+"^"+sheetObj1.GetCellValue(j, "curr_cd")+"^"+sheetObj1.GetCellValue(j, "chg_cd")+"^"+sheetObj1.GetCellValue(j, "chg_amt")+"^"+sheetObj1.GetCellValue(j, "inv_xch_rt")+"|";
				if (curs.indexOf(tjSrcNm+"^"+sheetObj1.GetCellValue(j, "curr_cd")) == -1) {
					curs=curs + tjSrcNm+"^"+sheetObj1.GetCellValue(j, "curr_cd")+"|";
				}
			}
			var curs_item=curs.split("|");
			for (var i=0; i < curs_item.length - 1; i++) {
				var curs_item2=curs_item[i].split("^");
				sheetObj2.DataInsert(-1);
				sheetObj2.SetCellValue(i+1, 1,curs_item2[0]);
				sheetObj2.SetCellValue(i+1, 2,curs_item2[1]);
			}
			var sums_item=sums.split("|");
			var sums_item2="";
			for (var i=0; i < sums_item.length - 1; i++) {
				sums_item2=sums_item[i].split("^");
				for (var j=0; j < sheetObj2.RowCount(); j ++) {
					if (sheetObj2.GetCellValue(j+1, 1) == sums_item2[0] && sheetObj2.GetCellValue(j+1, 2) == sums_item2[1] && sums_item2[3] != "") {
						sheetObj2.SetCellValue(j+1, 3,(sheetObj2.GetCellValue(j+1, 3) == "" ? 0 : Number(ComReplaceStr(sheetObj2.GetCellValue(j+1, 3),",",""))) + Number(ComReplaceStr(sums_item2[3],",","")));
					}
				}
			}
		}
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
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function ar_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){ 
		var formObj=document.form;
		var viewYn=formObj.view_yn.value; 
		if (viewYn == "Y") {
			return;
		}
		// OFFICE
		var arrStr2=comboObjects[0].GetSelectCode().split("^");
//		formObj.reset();
		sheetObjects[0].RemoveAll();
		sheetObjects[1].RemoveAll();
		sheetObjects[2].RemoveAll();
		setSearchValueType();
		if (arrStr2!='') {
			comboObjects[1].SetSelectText(arrStr2[4]);
			formObj.office_cnt_cd.value=arrStr2[6].substring(0,2);
			formObj.lcl_curr.value=arrStr2[4];
			formObj.tax_curr_cd.value=arrStr2[4];
			formObj.total_curr_cd.value=arrStr2[4];
			formObj.pol_cd.value=arrStr2[6];
			formObj.svr_id.value=arrStr2[7];
			formObj.ots_smry_cd.value=arrStr2[13];
 			formObj.inv_vat_chg_cd.value=arrStr2[16];
 			formObj.inv_vat_chg_rt.value=arrStr2[17];
			formObj.inv_xch_rt.value="1.000000";
 	    	var currPoint=getDpPrcsKnt(arrStr2[4],arrDpPrcsKnt);
 	    	formObj.lcl_curr_point.value=currPoint;
 	    	formObj.curr_point.value=currPoint;
 	    	//2015.05.14 Remove KR,HQ hardcoding by IY Cho
			document.getElementById('taxDiv1').style.display="none";
			document.getElementById('taxDiv2').style.display="block";
			comboObjects[2].SetSelectText("");
 			if (arrStr2[13] == "INV") {
 				document.getElementById('invNoDiv').style.display="block";
 			}
 			else {
 				document.getElementById('invNoDiv').style.display="none";
 			}
 	    	var currCdStr=comboObjects[1].GetSelectText();
 	    	var lclCurrStr=formObj.lcl_curr.value;
 	    	if (currCdStr == lclCurrStr) {
 	    		ComEnableObject(formObj.inv_xch_rt,false);
 	    	}
 	    	else {
 	    		ComEnableObject(formObj.inv_xch_rt,true);
 	    	}
		}
		else {
			comboObjects[1].SetSelectText("");
			formObj.office_cnt_cd.value="";
			formObj.lcl_curr.value="";
			formObj.tax_curr_cd.value="";
			formObj.total_curr_cd.value="";
			formObj.pol_cd.value="";
			formObj.svr_id.value="";
			formObj.inv_xch_rt.value="1.000000";
		}
	}
	/** 
	 * Amount Currency Cd change<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * - Amount calculate
	 * - CR Detail grid setting(currency code)
	 * - DR grid setting
	 * - CR grid setting
	 * - INV_AR_AMT grid setting
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
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function curr_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){ 
		var sheetObj1=sheetObjects[0];
		var sheetObj2=sheetObjects[1];
		var sheetObj3=sheetObjects[2];
		var sheetObj4=sheetObjects[3];
    	var formObj=document.form;
    	var sXml="";
		var viewYn=formObj.view_yn.value;
		if (viewYn == "Y") {
			return;
		}
    	var currCdStr=comboObjects[1].GetSelectText();
    	var lclCurrStr=formObj.lcl_curr.value;
    	if (currCdStr == lclCurrStr) {
    		ComEnableObject(formObj.inv_xch_rt,false);
    	}
    	else {
//        	formObj.lcl_curr.value =currCdStr; 

    		ComEnableObject(formObj.inv_xch_rt,true);
    	}
    	var currPoint=getDpPrcsKnt(comboObjects[1].GetSelectText(),arrDpPrcsKnt);
    	formObj.curr_point.value=currPoint;
    	if (sheetObj1.RowCount() > 0) {
    		var chgAmt=0;
    		for(i=sheetObj1.RowCount(); i>0; i--){
    			if (currPoint == 0) {
    				chgAmt=sheetObj1.GetCellValue(i, "chg_amt");
	    			sheetObj1.SetCellValue(i, "chg_amt",parseInt(InvRound(parseFloat(chgAmt),currPoint)),0);
    			}
    		}
    		sXml=ComMakeSearchXml(sheetObj1, true);
    	}
//		sheetObj1.RemoveAll();
//		sheetObj2.RemoveAll();
//		sheetObj3.RemoveAll();
//		sheetObj4.RemoveAll();

    	sheetObjects[0]=sheetObj1.Reset();
    	sheetObjects[1]=sheetObj2.Reset();
		sheetObjects[2]=sheetObj3.Reset();
		sheetObjects[3]=sheetObj4.Reset();		
		sheetObj1=sheetObjects[0];
		sheetObj2=sheetObjects[1];
		sheetObj3=sheetObjects[2];
		sheetObj4=sheetObjects[3];		


    	initSheet(sheetObj1,1);
    	if (sXml != '') {
    		addCellComboItem(sheetObj1,'acct_cd',false);
    		sheetObj1.LoadSearchData(sXml,{Sync:1} );
    	}
		for(i=sheetObj1.RowCount(); i>0; i--){
			if(sheetObj1.GetCellValue(i, "ibflag") != "" && (sheetObj1.GetCellValue(i, "tax_yn")=="Y" || sheetObj1.GetCellValue(i, "tax_yn")=="T")) {
				sheetObj1.SetCellEditable(i, "acct_cd",0);
			}
			if(sheetObj1.GetCellValue(i, "ibflag") != "" && sheetObj1.GetCellValue(i, "acct_cd") != "11303015" && sheetObj1.GetCellValue(i, "mnl_flg") == "Y") {
				sheetObj1.SetCellEditable(i, "tva_flg",1);
			}
		}
    	initSheet(sheetObj2,2);
    	initSheet(sheetObj3,3);
    	initSheet(sheetObj4,4);
    	
    	//var lclVvd=formObj.lcl_vvd.value; //2016.07.14 Only use the Cooperate Rate
		//if (lclVvd.substring(0,4) == "CFDR" || lclVvd.substring(0,4) == "USAC" || lclVvd.substring(0,4) == "CNTC" || lclVvd.substring(0,4) == "COMC") {
	    	//Office AR Currency exchange rate retrieve
			if(getLoclXchRt()) {
	//	    	if (currCdStr != lclCurrStr) {
	//	        	formObj.lcl_curr.value =currCdStr; 
	//	    	}			
				//Amount calculate
				calLocalAmount();
				//TVA Amount calculate
				calTVAAmount(sheetObj1, formObj);
				//CR Detail grid setting
				dtlGridSet('currency');
				//DR grid setting
				drGridSet();
				//CR grid setting
				crGridSet();
				//INV_AR_AMT grid setting
				amtGridSet();
			}
		//}
		//else if (lclVvd != '') {
		//	getExRate();
		//}

	}
	/** 
	 * init UI when  ar_tax_ind_cd changed.<br>
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
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function ar_tax_ind_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){ 
		var formObj=document.form;
		var viewYn=formObj.view_yn.value;
		if (viewYn == "Y") {
			return;
		}
		var sheetObj=sheetObjects[0];
		if (formObj.eff_dt.value != '' && formObj.amount.value != '' && formObj.inv_xch_rt.value != '') {
			var officeCntCd=formObj.office_cnt_cd.value;
			//Amount calculate
			calLocalAmount();
			//2015.05.14 Remove KR,HQ hardcoding by IY Cho
			//DR grid setting
			drGridSet();
			//CR grid setting
			crGridSet();
			//INV_AR_AMT grid setting
			amtGridSet();
		}
	}
	/** 
	 * check exchange rate <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function chkXchRate() {
		var rtnValue=false;
		var formObj=document.form;
		//retrieved exchange rate
		var usdLoclXchRt=formObj.usd_locl_xch_rt.value;
		//inputed exchange rate
		var invXchRt=formObj.inv_xch_rt.value;
		var maxInvXchRt;
		var minInvXchRt;
		if (!ComIsNull(formObj.usd_locl_xch_rt) && !ComIsNull(formObj.inv_xch_rt)) {
			maxInvXchRt=Number(ComReplaceStr(usdLoclXchRt,",","")) * 1.5;
			minInvXchRt=Number(ComReplaceStr(usdLoclXchRt,",","")) * 0.5;
			if (Number(ComReplaceStr(invXchRt,",","")) <= Number(maxInvXchRt) && Number(ComReplaceStr(invXchRt,",","")) >= Number(minInvXchRt)) {
				rtnValue=true;
				formObj.inv_xch_rt.value=ComAddComma(invXchRt);
			}
			else {
				formObj.inv_xch_rt.value=ComAddComma(usdLoclXchRt);
			}
		}
		return rtnValue;
	}
    /** 
     * OnChange event <br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  {IBSheet} sheetObj        
     * @param  {rownum} Row        
     * @param  {colnum} Col        
     * @param  {object} Value        
     * @return none
     * @see #
     * @author 諛뺤젙吏�
     * @version 2009.04.27
     */
	function sheet1_OnChange(sheetObj,Row,Col,Value){
    	var formObj=document.form;
    	var currPoint=formObj.curr_point.value;
    	var officeCntCd=formObj.office_cnt_cd.value;
    	//ACCT_CD
    	if (Col == 1) {
    		if (chkAccountCondition(sheetObj, sheetObj.GetSelectRow(), Value)) {
    			//CR detail Grid�쓽 Account 蹂�寃쎌떆 Account Nmae, Remark �룞�떆 蹂�寃쎌쿂由�
    			setAccountInfo(sheetObj, sheetObj.GetSelectRow(), Value);
    		}
    		else {
    			ComShowMessage(ComGetMsg('INV00059'));
    		}
    		var lclVvd=formObj.lcl_vvd.value;
    		if(formObj.sail_arr_dt.value == '' && lclVvd != '' && (lclVvd.substring(0,4) == "CNTC" || lclVvd.substring(0,4) == "COMC")) { //2016.06.13 Add
				var glEffDt=ComReplaceStr(formObj.eff_dt.value,"-","");
				if (lclVvd == '') {
					lclVvd="COMC"+glEffDt.substring(2,6)+"M";
				}
				var chkAcct=false;
				for(var i=sheetObj.RowCount(); i>0; i--){
					if(sheetObj.GetCellValue(i, "ibflag") != "" && (sheetObj.GetCellValue(i, "acct_cd")=="41202010" || sheetObj.GetCellValue(i, "acct_cd")=="41101010" || sheetObj.GetCellValue(i, "acct_cd")=="47101010")) {
						chkAcct=true;
					}
				}
				if (chkAcct) {
					formObj.lcl_vvd.value="CNTC"+lclVvd.substring(4,9);
				}
				else {
					formObj.lcl_vvd.value="COMC"+lclVvd.substring(4,9);
				}
    		}
			var invVatChgCd=formObj.inv_vat_chg_cd.value;
			var invVatChgRt=formObj.inv_vat_chg_rt.value;
			//2015.05.14 Remove KR,HQ hardcoding by IY Cho
			if (invVatChgCd != '' && invVatChgRt > 0 && sheetObj.GetCellValue(Row, "acct_cd") == "11303015") {
				sheetObj.SetCellValue(Row, "tva_flg",0);
				sheetObj.SetCellEditable(Row, "tva_flg",0);
			}
			else if (invVatChgCd != '' && invVatChgRt > 0 && sheetObj.GetCellValue(Row, "acct_cd") != "11303015") {
				sheetObj.SetCellEditable(Row, "tva_flg",1);
			}
			
			if( sheetObj.GetCellValue(Row, "chg_cd") == "TVA") {
				sheetObj.SetCellValue(Row, "tax_yn","M",0);		// Manuual Input		
			//2017.11.01 pkh from khh ::: chg_cd 값이 "TVA" 가 아닌 다른 값으로 변경시 tax_yn 값 원복하는 로직 추가
			} else {
				sheetObj.SetCellValue(Row, "tax_yn","N",0);
			}
			//2017.10.31 pkh from khh ::: chkAccountCondition 에서 잘못입려된 Acct가 있어 row 삭제시 합계 계산이 안되어 추가
    		calLocalAmount2();
			//TVA Amount calculate
			calTVAAmount(sheetObj, formObj);
    		//DR grid setting
    		drGridSet();
    		//CR grid setting
    		crGridSet();
			//2017.10.31 pkh from khh ::: END
			//INV_AR_AMT grid setting
			amtGridSet();
    	}
    	//CHG_AMT
    	else if (Col == 6) {
    		if (sheetObj.GetSelectRow()== 1 && (comboObjects[2].GetSelectText() == '10%' || comboObjects[2].GetSelectText() == 'N') && sheetObj.GetCellValue(sheetObj.GetSelectRow(), "tax_yn") == 'Y') {
    			var defTaxAmt=Number(ComReplaceStr(sheetObj.GetCellValue(sheetObj.GetSelectRow(), "chg_amt"),",",""));
    			var minTaxAmt=Number(ComReplaceStr(formObj.tax_amount_ori.value,",","")) - 10;
    			var maxTaxAmt=Number(ComReplaceStr(formObj.tax_amount_ori.value,",","")) + 10;
    			if (defTaxAmt >= minTaxAmt && defTaxAmt <= maxTaxAmt) {
    				formObj.tax_amount.value=ComAddComma(sheetObj.GetCellValue(sheetObj.GetSelectRow(), "chg_amt"));
    			}else {
    				ComShowMessage(ComGetMsg('INV00076'));
    				sheetObj.SetCellValue(sheetObj.GetSelectRow(), "chg_amt",formObj.tax_amount_ori.value,0);
    				formObj.tax_amount.value=formObj.tax_amount_ori.value;
    			}
    		}
    		calLocalAmount2();
			//TVA Amount calculate
			calTVAAmount(sheetObj, formObj);
    		//DR grid setting
    		drGridSet();
    		//CR grid setting
    		crGridSet();
    		//INV_AR_AMT grid setting
    		amtGridSet();
    	}
    	// TVA
    	else if (Col == 8) {
			//Amount calculate
			calLocalAmount();
    		//TVA Amount calculate
    		calTVAAmount(sheetObj, formObj);
    		//DR grid setting
    		drGridSet();
    		//CR grid setting
    		crGridSet();
    		//INV_AR_AMT grid setting
    		amtGridSet();
    	}
	}
    /** 
	 * digit setting by currency.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
     * @param {object} amtVal        
     * @param {object} currPoint  
     * @return {object} return_value
     * @see #
     * @author 諛뺤젙吏�
     * @version 2009.04.27
     */
	function setCurrPointValue(amtVal, currPoint) {
		var amountValue=amtVal+"";
		if (currPoint == '0') {
			return ComAddComma(amountValue);
		}
		else if (currPoint == '1') {
			var amountSplit=amountValue.split(".");
			amountSplit[0]=ComAddComma(amountSplit[0]);
            if (amountSplit.length == 1) {
            	return amountSplit[0]+".0";
            }
            else if (amountSplit.length == 2) {
            	return amountSplit[0]+"."+amountSplit[1];
            }
            else {
            	return "";		
            }
		}
		else if (currPoint == '2') {
			var amountSplit=amountValue.split(".");
			amountSplit[0]=ComAddComma(amountSplit[0]);
            if (amountSplit.length == 1) {
            	return amountSplit[0]+".00";
            }
            else if (amountSplit.length == 2) {
           		return amountSplit[0]+"."+ComRpad(amountSplit[1], 2, "0");
            }
            else {
            	return "";
            }
		}
		else if (currPoint == '3') {
			var amountSplit=amountValue.split(".");
			amountSplit[0]=ComAddComma(amountSplit[0]);
            if (amountSplit.length == 1) {
            	return amountSplit[0]+".000";
            }
            else if (amountSplit.length == 2) {
           		return amountSplit[0]+"."+ComRpad(amountSplit[1], 3, "0");
            }
            else {
            	return "";
            }
		}
	}
    /** 
	 * check not use grid.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * �옒紐� �엯�젰�꽑�깮�뻽�쓣�떆 硫붿꽭吏�(INV00059)
	 * </pre>
     * @param  {IBSheet} sheetObj        
     * @param {object} Row  
     * @param {object} val
     * @return {object} rtnValue
     * @see #
     * @author 諛뺤젙吏�
     * @version 2009.04.27
     */
	function chkAccountCondition(sheetObj, Row, val) {
		var rtnValue=true;
		var curs="";
		var otherCurs="";
		val=ComReplaceStr(val," ","");
		if (val != '') {
			for(var i=sheetObj.RowCount(); i>0; i--){
				if(sheetObj.GetCellValue(i, "ibflag") != "" && (sheetObj.GetCellValue(i, "acct_cd")=="41202010" || sheetObj.GetCellValue(i, "acct_cd")=="41101010" || sheetObj.GetCellValue(i, "acct_cd")=="97110020" || sheetObj.GetCellValue(i, "acct_cd")=="41101010" ||sheetObj.GetCellValue(i, "acct_cd")=="47101010")) {
					if (curs.indexOf(sheetObj.GetCellValue(i, "acct_cd")) == -1) {
						curs=curs + sheetObj.GetCellValue(i, "acct_cd") +"|";
					}
				}
				else {
					if(sheetObj.GetCellValue(i, "ibflag") != "" && sheetObj.GetCellValue(i, "acct_cd")!="11303015") {
						if (curs.indexOf(sheetObj.GetCellValue(i, "acct_cd")) == -1) {
							otherCurs=otherCurs + sheetObj.GetCellValue(i, "acct_cd") +"|";
						}
					}
				}
			}
		}
		var curs_item=curs.split("|");
		if (curs_item.length == 2) {
			if (otherCurs.length >= 2) {
				rtnValue=false;
				sheetObj.RowDelete(Row, false);
			}
			else {
				if (sheetObj.GetCellValue(Row, "acct_cd") != '11303015') {
					if (sheetObj.GetCellValue(Row, "acct_cd") != curs_item[0]) {
						rtnValue=false;
						sheetObj.RowDelete(Row, false);
					}
				}
			}
		}
		else if (curs_item.length > 2) {
			rtnValue=false;
			sheetObj.RowDelete(Row, false);
		}
		return rtnValue;
	}
    /**
	 * whent CR detail Grid�쓽 Account changed Account Nmae, Remark change <br>
	 * - �븳援�吏��뿭 �궗�슜�옄�뒗 ACCT_KRN_NM�쓣 Remark�뿉 �꽔�뼱二쇨퀬 �닔�젙媛��뒫�븯�룄濡� �븿.
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
     * @param  {IBSheet} sheetObj        
     * @param {object} Row  
     * @param {object} val
     * @return none
     * @see #
     * @author 諛뺤젙吏�
     * @version 2009.04.27
     */
	function setAccountInfo(sheetObj, Row, comboValue) {
		var formObj=document.form;
    	var currPoint=formObj.curr_point.value;
    	var officeCntCd=formObj.office_cnt_cd.value;
		sheetObj.SetCellValue(Row, "chg_full_nm",getCodeName(comboValue, arrAcctEngNm),0);
		//2015.05.14 Remove KR,HQ hardcoding by IY Cho
		sheetObj.SetCellValue(Row, "inv_rev_tp_src_cd",getCodeName(comboValue, arrRevCd),0);
		sheetObj.SetCellValue(Row, "chg_cd",getCodeName(comboValue, arrChgCd),0);
		sheetObj.SetCellValue(Row, "rep_chg_cd",getCodeName(comboValue, arrRepChgCd),0);
	}
    /** 
	 * check CR detail Grid <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
     * @param  {IBSheet} sheetObj        
     * @param {object} Row  
     * @param {object} formObj
     * @return boolean
     * @see #
     * @author 諛뺤젙吏�
     * @version 2009.04.27
     */
	function gridCopyDeleteOK(sheetObj, Row, formObj) {
		var rtnValue=true;
		if (sheetObj.GetCellValue(Row, "acct_cd") == "11303015" && sheetObj.GetCellValue(Row, "mnl_flg") == "N") {
			ComShowMessage(ComGetMsg('INV00014'));
			rtnValue=false;
		}
		return rtnValue;
	}
    /** 
	 * return Arrary  index.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
     * @param {object} searchValue        
     * @param {array} targetArr  
     * @return {object}rtnValue
     * @see #
     * @author 諛뺤젙吏�
     * @version 2009.04.27
     */
	function getCodeName(searchValue, targetArr) {
		var rtnValue=""
		for (var i=1; i < targetArr.length;i++ ) {
			if (arrAcctCd[i] == searchValue) {
				rtnValue=targetArr[i];
			}
		}
		return rtnValue
	}
    /** 
	 * retrieve digit by currency in Arrary .<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
     * @param {object} searchValue        
     * @param {array} targetArr  
     * @return {object}rtnValue
     * @see #
     * @author 諛뺤젙吏�
     * @version 2009.04.27
     */
	function getDpPrcsKnt(searchValue, targetArr) {
		var rtnValue=""
		for (var i=1; i < targetArr.length;i++ ) {
			if (arrCurrInfo[i] == searchValue) {
				rtnValue=targetArr[i];
			}
		}
		return rtnValue
	}
	/** 
	 * Rd open <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {RdObject} rdObject
	 * @param  {object} formObj    
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function rdOpen(formObj){
		//var Rdviewer=rdObject ;	
		var user_id=formObj.user_id.value;		
		//review open
		formObj.com_mrdPath.value="apps/opus/fns/inv/accountreceivableinvoicecreation/manualarcreation/report/FNS_INV_0022.mrd";
		//alert(formObj.ar_if_no.value + " , " + user_id);
		formObj.com_mrdArguments.value="/rv " + "frm1_ar_if_no['"+formObj.ar_if_no.value+"']  frm1_login_id["+user_id+"]";
		var feature="resizable=yes,width=1000,height=650"
			
//			alert(formObj.com_mrdArguments.value)
		ComOpenRDPopup(feature);
	}
	/** 
	 * VoList into array[array[name]]<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param {xml} xmlStr retrieve result setRsVoList , setRsVo
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function ComXml2ListMap(xmlStr) {
		  var rtnArr=new Array();
		  if (xmlStr == null || xmlStr == "") {
		   return rtnArr;
		  }
		  try {
		   //var xmlDoc=new ActiveXObject(""Microsoft.XMLDOM"");
		   //xmlDoc.loadXML(xmlStr);
		   //var xmlRoot=xmlDoc.documentElement;
		   //if (xmlRoot == null) {
		   // return rtnArr;
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
	 * init form value<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param {form} form html 
	 * @param {map} Array[name]  
	 * @return none
	 * @see #
	 * @author 諛뺤젙吏�
	 * @version 2009.04.27
	 */
	function ComMapToForm(form, map) {		
		var len=form.elements.length;
		var currPoint=form.curr_point.value;
		var lclCurrPoint=form.lcl_curr_point.value;
		for (var i=0; i < len; i++) {
			if (form.elements[i].classid == undefined) {
				var xvalue=map[form.elements[i].name];
				if (xvalue == undefined) {
					continue;
				}
				
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
							form.elements[i].value=ComGetMaskedValue(xvalue, "saupja");
						break;
						case "amount":
							form.elements[i].value=setCurrPointValue(xvalue, currPoint);
						break;
						case "local_amount":
							form.elements[i].value=setCurrPointValue(xvalue, lclCurrPoint);
						break;
						case "total_local_amt":
							form.elements[i].value=setCurrPointValue(xvalue, lclCurrPoint);
						break;
						case "tax_amount":
							form.elements[i].value=setCurrPointValue(xvalue, lclCurrPoint);
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
		ComResizeSheet(sheetObjects[0],250);
	}
