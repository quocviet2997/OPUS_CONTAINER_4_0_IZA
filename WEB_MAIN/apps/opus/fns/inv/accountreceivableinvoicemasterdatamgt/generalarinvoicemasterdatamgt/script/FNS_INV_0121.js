/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0121.js
*@FileTitle  : Charge Info. by Service Account
*@author     : CLT
*@version    : 1.0
*@since      : 2017/04/24
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
	 * @class fns_inv_0121 : for create fns_inv_0120 UI.
	 */
	function fns_inv_0121() {
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
		var sheetObj=sheetObjects[0];

		/*******************************************************/
		try {
			var srcName=ComGetEvent("name");
			switch(srcName) {
				case "btn_add":
					var indexKey=sheetObj.DataInsert(-1);
					sheetObj.SetCellValue(indexKey,"cnt_cd",document.form.p_cnt_cd.value);
					break;  
				case "btn_del":
					ComRowHideDelete(sheetObj, "DelChk");
					break;                                         
				case "btn_new":
					sheetObj.RemoveAll();
					break;
				case "btn_retrive":
					doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
					break;
				case "btn_save":
					doActionIBSheet(sheetObjects[0],document.form,IBSAVE);
					break;        
				case "btn_downExcel": 	
					if(sheetObj.RowCount() < 1){//no data						
						ComShowCodeMessage("COM132501");
					}else{
						sheetObj.Down2Excel({KeyFieldMark:false,DownCols: makeHiddenSkipCol(sheetObj), SheetDesign:1,Merge:1 });
						
					}				
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
	 * @author 
	 * @version 
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
	 * @author 
	 * @version 
	 */
	function loadPage() {
		document.form.p_cnt_cd.value = "IN";

		for(i=0;i<sheetObjects.length;i++){
			ComConfigSheet (sheetObjects[i] );	
			initSheet(sheetObjects[i],i+1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		
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
	 * @author 
	 * @version 
	 */
function initSheet(sheetObj,sheetNo) {
		var cnt=0;
		switch(sheetNo) {
			case 1:      //sheet1 init
                with(sheetObj){
                
				  var HeadTitle="||Del|Seq.|CntCd|Service Account.|Charge code|Charge Name|Rep.charge";
				
				  SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );
				
				  var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
				  var headers = [ { Text:HeadTitle, Align:"Center"} ];
				  InitHeaders(headers, info);
				
				   var cols = [ {Type:"Status",   Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
					{Type:"Status",    Hidden:1,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:"Status" },
					{Type:"CheckBox",  Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
					{Type:"Seq",       Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"Seq" },
					{Type:"Text",      Hidden:1,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"cnt_cd",           KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
					{Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:"locl_chg_grp_cd",  KeyField:1,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:8, InputCaseSensitive:1, AcceptKeys:"E|N"  },
					{Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"chg_cd",           KeyField:1,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3, InputCaseSensitive:1, AcceptKeys:"E|N" },
					{Type:"Text",      Hidden:0,  Width:250,  Align:"Left",    ColMerge:0,   SaveName:"chg_nm",           KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					{Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"rep_chg_cd",       KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
					   
					  InitColumns(cols);

				      //SetEditable(1);
				      SetSheetHeight(300);                           				
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
				 ComOpenWait(true);
				 formObj.f_cmd.value=SEARCH;
				 var sXml=sheetObj.GetSearchData("FNS_INV_0121GS.do", FormQueryString(formObj));
				 sheetObj.LoadSearchData(sXml,{Sync:1} );
				 ComOpenWait(false); 
			break;
			case IBSAVE:        //save
			if(validateForm(sheetObjects[0],formObj,sAction)) return;
			 ComOpenWait(true);
//			var iCheckRow=sheetObjects[0].FindCheckedRow("DelChk");
//			if (iCheckRow== "") {
//				ComShowCodeMessage("INV00025");
//				return false;
//			}
//			if (iCheckRow2== "") {
//				ComShowCodeMessage("INV00025");
//				return false;
//			}
			formObj.f_cmd.value=MULTI;
			sheetObj.DoSave("FNS_INV_0121GS.do",FormQueryString(formObj)+ "&"+ ComSetPrifix(sheetObj.GetSaveString(),"sheet1_"),-1,false);
			 ComOpenWait(false); 
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
					ComShowCodeMessage("INV00091");
					return true;
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
	
