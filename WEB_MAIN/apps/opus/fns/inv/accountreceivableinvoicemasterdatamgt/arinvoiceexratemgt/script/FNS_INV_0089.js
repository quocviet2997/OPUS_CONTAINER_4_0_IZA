/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0089.js
*@FileTitle  : Ex Rate Entry by Cusomtomer - Multi Cust
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/19
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
	/**
	 * @fileoverview define calandar method when common use in java script file.
     * @author Cyberlogitec
	 */
	/**
	 * @extends 
	 * @class fns_inv_0089 : defile script for create fns_inv_0089 UI.
	 */
	function fns_inv_0089() {
		this.processButtonClick=tprocessButtonClick;
		this.setSheetObject=setSheetObject;
		this.loadPage=loadPage;
		this.initSheet=initSheet;
		this.initControl=initControl;
		this.doActionIBSheet=doActionIBSheet;
		this.validateForm=validateForm;
	}
 	/* developer */
    // common global valiables
	var sheetObjects=new Array();
	var sheetCnt=0;
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
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	function processButtonClick(){
		var sheetObject1=sheetObjects[0];
		var sheetObject2=sheetObjects[1];
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch(srcName) {
				case "btn_add":
					var indexKey=sheetObject1.DataInsert(-1);
					sheetObject1.SetCellEditable(indexKey,6,0);
					break;  
				case "btn_del":
					ComRowHideDelete(sheetObject1, "DelChk");
					break;                                         
				case "btn_new":
					sheetObject1.RemoveAll();
					break; 
				case "btn_save":
					doActionIBSheet(sheetObjects[0],document.form,IBSAVE);
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
	 * add IBSheet Object array <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj IBSheet Object
	 * @return none
	 * @see #
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	function setSheetObject(sheet_obj){
		sheetObjects[sheetCnt++]=sheet_obj;
	}
	/** 
	 * define onLoad event handler <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  none
	 * @return none
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
		sheetObjects[1].SetVisible(0);
		openerCopy();	
	}
	/** 
	 * initializing sheet, define header<br> 
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {IBSheet} sheetObj
	 * @param {int} sheetNo  
	 * @return none
	 * @see #
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
function initSheet(sheetObj,sheetNo) {
		var cnt=0;
		switch(sheetNo) {
			case 1:      //sheet1 init
                with(sheetObj){
                
				  var HeadTitle="||Sel.|Seq.|Affiliate Cust.|Affiliate Cust.|Customer Name";
				
				  SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );
				
				  var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
				  var headers = [ { Text:HeadTitle, Align:"Center"} ];
				  InitHeaders(headers, info);
				
				   var cols = [ {Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
					{Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"Status" },
					{Type:"CheckBox",  Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
					{Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"Seq" },
					{Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"cust_cnt_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:2 },
					{Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"cust_seq",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:6 },
					{Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"cust_nm",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
					{Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"confirm_flag",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
					   
					  InitColumns(cols);

				      SetEditable(1);
				      SetSheetHeight(240);                           				
				      SetColProperty(0 ,"cust_cnt_cd" , {AcceptKeys:"E" , InputCaseSensitive:1});
				      SetColProperty(0 ,"cust_seq" , {AcceptKeys:"N"});
               }
			   break;
		case 2:      //sheet2 init
                with(sheetObj){
				                
				  // no support[check again]CLT if (location.hostname != "")
					// InitHostInfo(location.hostname, location.port, page_path);
				  var HeadTitle="|||From Date|To Date|Currency|Bound|Ex. Rate|Check Digit|Updated By|Updated Date";
				
				  SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
				
				  var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
				  var headers = [ { Text:HeadTitle, Align:"Center"} ];
				  InitHeaders(headers, info);
				
				  var cols = [ {Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
				{Type:"CheckBox",  Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
				{Type:"Seq",       Hidden:0, Width:55,   Align:"Center",  ColMerge:0,   SaveName:"Seq" },
				{Type:"PopupEdit", Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"fm_dt",           KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
				{Type:"PopupEdit", Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"to_dt",           KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
				{Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"chg_curr_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
				{Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"io_bnd_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
				{Type:"Float",     Hidden:0,  Width:110,  Align:"Right",   ColMerge:0,   SaveName:"inv_xch_rt",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6,   UpdateEdit:1,   InsertEdit:1 },
				{Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"check_digit",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
				{Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"upd_usr_id",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				{Type:"Date",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"upd_dt",          KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"xch_rt_rvs_flg",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
				{Type:"Text",      Hidden:1, Width:0,    Align:"Right",   ColMerge:0,   SaveName:"ivs_xch_rt",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6,   UpdateEdit:0,   InsertEdit:1 },
				{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"xch_rt_tp_cd" },
				{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"locl_curr_cd" },
				{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ar_ofc_cd" } ];
				   
				  InitColumns(cols);
				
				  SetEditable(1);
				  SetVisible(0);
		     }
			break;	
		 }	
	}
	/** 
	 * doActionIBSheet <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj
	 * @param  {object} formObj
	 * @param  {sAction} sAction
	 * @return none
	 * @see #
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	function doActionIBSheet(sheetObj,formObj,sAction) {
		sheetObj.ShowDebugMsg(false);
		switch(sAction) {
			case IBSEARCH:      //retrieve
			break;
			case IBSAVE:        //save
			if(validateForm(sheetObjects[0],formObj,sAction)) return;
			var iCheckRow=sheetObjects[0].FindCheckedRow("DelChk");
			var iCheckRow2=sheetObjects[1].FindCheckedRow("DelChk");
			if (iCheckRow== "") {
				ComShowCodeMessage("INV00025");
				return false;
			}
			if (iCheckRow2== "") {
				ComShowCodeMessage("INV00025");
				return false;
			}
			formObj.f_cmd.value=MULTI;
			sheetObj.DoSave("FNS_INV_0089GS.do",FormQueryString(formObj) + "&" + ComSetPrifix(sheetObjects[0].GetSaveString(false,true,"DelChk"),"sheet1_") + "&" + ComSetPrifix(sheetObjects[1].GetSaveString(false,true,"DelChk"),"sheet2_"));
			break;
			case IBINSERT:      // insert	
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
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	function validateForm(sheetObj,formObj,sAction){
		with(formObj){
			switch(sAction) {
				case IBSAVE:        //save
					if (sheetObj.RowCount()< 0) {
					ComShowCodeMessage("INV00001");
					return true;
				} else {
					for (var i=1; i<=sheetObj.RowCount(); i++) {
						if (sheetObj.GetCellText(i,"cust_nm").trim() == ""){
							ComShowCodeMessage("INV00042",i+" Line");
							return true;
						}
					}
				}	
				break;
			}
		}     
		return;    
	}
	/**
	 * retrieve customer name by Customer Code.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    fn_cust_nm(1);
	 * </pre>
	 * @param number Row
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */	      
	function fn_cust_nm(Row){
		document.form.f_cmd.value=SEARCH03;
		var cust_nm="";
		var delt_flg = "";
sheetObjects[0].SetCellValue(Row,"cust_seq",ComLpad(sheetObjects[0].GetCellValue(Row,"cust_seq"), 6, "0"),0);
document.form.cust_cnt_cd.value=sheetObjects[0].GetCellValue(Row,"cust_cnt_cd");
document.form.cust_seq.value=sheetObjects[0].GetCellValue(Row,"cust_seq");
		if ((form.v_cust_cnt_cd.value.trim() != "" )&&(form.v_cust_seq.value.trim() != "" )){
//parameter changed[check again]CLT 			
			var sXml=sheetObjects[0].GetSearchData("INVCommonGS.do", FormQueryString(document.form));
			cust_nm=ComGetEtcData(sXml,"cust_eng_nm");
			delt_flg = ComGetEtcData(sXml,"delt_flg");
			if (cust_nm == undefined) {
				form.cust_nm.value="";
				sheetObjects[0].SetCellValue(Row,"cust_nm","",0);
				ComShowCodeMessage("INV00054");
				sheetObjects[0].SelectCell(Row,"cust_seq");
				return;    	    		  
			}else if (delt_flg =="Y") {
				ComShowCodeMessage("INV00060");
				sheetObjects[0].SelectCell(Row,"cust_seq");	
				return;
			}
			sheetObjects[0].SetCellValue(Row,"cust_nm",cust_nm,0);
		}
	}
	/**
	 * retrieve duplicate customer.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    fn_cust_nm(1);
	 * </pre>
	 * @param number Row
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */	
	function fn_cust_nm_dupli_chk(Row){
		document.form.f_cmd.value=SEARCH;
		var cnt=0;
document.form.cust_cnt_cd.value=sheetObjects[0].GetCellValue(Row,"cust_cnt_cd");
document.form.cust_seq.value=sheetObjects[0].GetCellValue(Row,"cust_seq");
		if ((form.v_cust_cnt_cd.value.trim() != "" )&&(form.v_cust_seq.value.trim() != "" )){
//parameter changed[check again]CLT 			
			var sXml=sheetObjects[0].GetSearchData("FNS_INV_0089GS.do", FormQueryString(document.form));
			cnt=ComGetEtcData(sXml,"cnt");
			if (cnt > 0) {
				var result=ComShowCodeConfirm("INV00047");
				if (result) {
					sheetObjects[0].SetCellValue(Row,"confirm_flag","U",0);
				} else {
					sheetObjects[0].SetCellValue(Row,"DelChk",1,0);
					ComRowHideDelete(sheetObjects[0], "DelChk");
				}
			} else {
				sheetObjects[0].SetCellValue(Row,"confirm_flag","I",0);
			} 
		}
	}
	/**
	 * Customer Validation<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    sheet1_OnPopupClick(SheetObjects[0], 1,1,'20090901');
	 * </pre>
	 * @param object sheetObj
	 * @param number Row
	 * @param number Col
	 * @param string Value
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */  
	function sheet1_OnChange(sheetObj, Row, Col, Value) {
		if (sheetObjects[0].ColSaveName(Col) == "cust_seq"){
			fn_cust_nm(Row);
if(sheetObjects[0].GetCellValue(Row,"cust_nm")!=''){
				fn_cust_nm_dupli_chk(Row);
			}
		}
		return;
	}
	function sheet1_OnKeyUp(sheetObj,Row,Col,KeyCode,Shift){
		if(Col == 4&& sheetObj.EditText.length ==2){
			sheetObj.SelectCell(Row,5);
		}
	}
	/**
	 * Popup setting <br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   openerCopy();
	 * </pre>
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */  
	function openerCopy() {
		var sheetObj=opener.sheetObjects[0];
		var sheetObj2=sheetObjects[1];
		for (var i=1; i<=sheetObj.RowCount(); i++) {
			sheetObj2.DataInsert(-1);
			//sheetObj2.CellValue(i,"ibflag") = "I";
			sheetObj2.SetRowStatus(i,"I");
			sheetObj2.SetCellValue(i,"DelChk",sheetObj.GetCellText(i,"DelChk"));
			sheetObj2.SetCellValue(i,"Seq",sheetObj.GetCellText(i,"Seq"));
			sheetObj2.SetCellValue(i,"fm_dt",sheetObj.GetCellText(i,"fm_dt"));
			sheetObj2.SetCellValue(i,"to_dt",sheetObj.GetCellText(i,"to_dt"));
			sheetObj2.SetCellValue(i,"chg_curr_cd",sheetObj.GetCellText(i,"chg_curr_cd"));
sheetObj2.SetCellValue(i,"io_bnd_cd",sheetObj.GetCellValue(i,"io_bnd_cd"));
			sheetObj2.SetCellValue(i,"inv_xch_rt",sheetObj.GetCellText(i,"inv_xch_rt"));
			sheetObj2.SetCellValue(i,"check_digit",sheetObj.GetCellText(i,"check_digit"));
			sheetObj2.SetCellValue(i,"upd_usr_id",sheetObj.GetCellText(i,"upd_usr_id"));
			sheetObj2.SetCellValue(i,"upd_dt",sheetObj.GetCellText(i,"upd_dt"));
			sheetObj2.SetCellValue(i,"xch_rt_rvs_flg",sheetObj.GetCellText(i,"xch_rt_rvs_flg"));
			sheetObj2.SetCellValue(i,"ivs_xch_rt",sheetObj.GetCellText(i,"ivs_xch_rt"));
			sheetObj2.SetCellValue(i,"xch_rt_tp_cd",sheetObj.GetCellText(i,"xch_rt_tp_cd"));
			sheetObj2.SetCellValue(i,"locl_curr_cd",sheetObj.GetCellText(i,"locl_curr_cd"));
			sheetObj2.SetCellValue(i,"ar_ofc_cd",sheetObj.GetCellText(i,"ar_ofc_cd"));
		}
	}
