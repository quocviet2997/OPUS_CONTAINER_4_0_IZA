/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : fns_inv_0098.js
*@FileTitle  : Container No
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/22
=========================================================*/
	/**
	 * fns_inv_0098 : fns_inv_0098 Defining business script. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     fns_inv_0098()
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
	// Defining button events. */
	document.onclick=processButtonClick;
	/**
	 * Handling button event. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     processButtonClick()
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function processButtonClick(){
		/***** Setting each tab's sheet variable. *****/
		var sheetObject1=sheetObjects[0];
		var sheetObject2=sheetObjects[1];
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch(srcName) {
			case "btn_OK":
				if(document.form.ar_if_no.value!=""){
					closeContainerByIfNo();
				}else{
					closeContainer();
				}
				break;
			case "btn_close":
				ComClosePopup(); 
				break; 
			case "btn_add":		        	
				sheetObject1.DataInsert(-1);
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
	 *     setSheetObject(sheetObj)
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
	 *     loadPage()
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
		var row_cnt=opener.sheet_container.RowCount();
		var row=0;
		var col=0;
		var j=0;
		if(document.form.ar_if_no.value!=""){
			for (var i=0; i < row_cnt; i++){
				if(document.form.ar_if_no.value==opener.sheet_container.GetCellValue(i+1, 'ar_if_no')){
					row=parseInt(j/4)+parseInt(1);
					col=parseInt(j%4)*parseInt(3);
					if(parseInt((j+1)%4) == 1) {
						sheetObjects[0].DataInsert(-1);
					}
					sheetObjects[0].SetCellValue(row, col,j+1,0);
					sheetObjects[0].SetCellValue(row, col+1,opener.sheet_container.GetCellValue(i+1, "cntr_tpsz_cd"),0);
					sheetObjects[0].SetCellValue(row, col+2,opener.sheet_container.GetCellValue(i+1, "cntr_no"),0);
					j++;
				}
			}
		}else{
			for (var i=0; i < row_cnt; i++){
				row=parseInt(i/4)+parseInt(1);
				col=parseInt(i%4)*parseInt(3);
				if(parseInt((i+1)%4) == 1) {
					sheetObjects[0].DataInsert(-1);
				}
				sheetObjects[0].SetCellValue(row, col,i+1,0);
				sheetObjects[0].SetCellValue(row, col+1,opener.sheet_container.GetCellValue(i+1, 1),0);
				sheetObjects[0].SetCellValue(row, col+2,opener.sheet_container.GetCellValue(i+1, 2),0);
			}
		}
	}
	/**
	 * When OK button a click, sending container information for parent.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     closeContainer()
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function closeContainer() {
		var row_cnt=sheetObjects[0].RowCount();
		var row=0;
		var v_tpsz="";
		var v_cntr="";
		opener.sheet_container.RemoveAll();
		var cnt_teu=0;
		var cnt_feu=0;
		for (var i=0; i < row_cnt; i++){
			for (var j=0; j < 4; j++){
				v_tpsz=sheetObjects[0].GetCellValue(i+1, j*3+1);
				v_cntr=sheetObjects[0].GetCellValue(i+1, j*3+2);
				if (v_tpsz != "" && v_cntr != "") {
					opener.sheet_container.DataInsert(-1);
					row++;
					opener.sheet_container.SetCellValue(row, 1,sheetObjects[0].GetCellValue(i+1, j*3+1));
					opener.sheet_container.SetCellValue(row, 2,sheetObjects[0].GetCellValue(i+1, j*3+2));
					if (sheetObjects[0].GetCellValue(i+1, j*3+1).substr(1,1) == "2") {
						cnt_teu++;
					} else {
						cnt_feu++;
					}
				}
			}
		}
		opener.document.form.bkg_teu_qty.value=cnt_teu;
		opener.document.form.bkg_feu_qty.value=cnt_feu;
		comPopupOK();
		ComClosePopup(); 
	}   
	/**
	 * When OK button a click, sending container information for parent.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     closeContainerByIfNo()
	 * </pre>
	 * @param none.
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function closeContainerByIfNo() {
		var row_cnt=sheetObjects[0].RowCount();
		var row=0;
		var v_tpsz="";
		var v_cntr="";
		for(k=1; k <= opener.sheet_container.RowCount();k++){
			if(opener.sheet_container.GetCellValue(k,'ar_if_no') == document.form.ar_if_no.value){
				opener.sheet_container.SetCellValue(k,'check',1);
			}
		}
		ComRowHideDelete(opener.sheet_container, "check");
		for (var i=0; i < row_cnt; i++){
			for (var j=0; j < 4; j++){
				v_tpsz=sheetObjects[0].GetCellValue(i+1, j*3+1);
				v_cntr=sheetObjects[0].GetCellValue(i+1, j*3+2);
				if (v_tpsz != "" && v_cntr != "") {
					insrow=opener.sheet_container.DataInsert(-1);
					row++;
					opener.sheet_container.SetCellValue(insrow, 'ar_if_no',document.form.ar_if_no.value);
					opener.sheet_container.SetCellValue(insrow, "cntr_tpsz_cd",sheetObjects[0].GetCellValue(i+1, j*3+1));
					opener.sheet_container.SetCellValue(insrow, "cntr_no",sheetObjects[0].GetCellValue(i+1, j*3+2));
					opener.sheet_container.SetCellValue(insrow, "cntr_seq",row);
				}
			}
		}
		comPopupOK();
		ComClosePopup(); 
	}  
	/**
	 * Coding event for sheet1_OnChange.<br>
	 * Container Type/Size retrieve <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     sheet1_OnChange(sheetObj,Row,Col,Value)
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
		var formObj=document.form;
		var v_cntrCd=sheetObj.GetCellValue(Row, Col);
		var v_max_no=0;    
		var cnt=0;
		if((Col == 2 || Col == 5 || Col == 8 || Col == 11)){    
			for (var i=0; i < sheetObj.RowCount(); i++){
				for (var j=2; j < 12; j=j+3){
					//alert(sheetObj.CellValue(i+1, j));            			
					if (v_cntrCd == sheetObj.GetCellValue(i+1, j) && v_cntrCd != ""){
						cnt++;  
					}
				}            		
			}       
			if (cnt > 1) {
				ComShowCodeMessage("INV00068");
				sheetObj.SetCellValue(Row, Col-2,"",0);
				sheetObj.SetCellValue(Row, Col-1,"",0);
				sheetObj.SetCellValue(Row,Col,"",0);
				return;
			}            	
			for (var i=0; i < sheetObj.RowCount(); i++){
				for (var j=0; j < 4; j++){
					if (sheetObj.GetCellValue(i+1, j*3) != ""){
						v_max_no++;
					}
				}            		
			}    
			if (sheetObj.GetCellValue(Row, Col) != "") {
				formObj.cntr_no.value=sheetObj.GetCellValue(Row, Col);
				doActionIBSheet(sheetObj,document.form,IBSEARCH);   
				if (formObj.cntr_tpsz_cd.value != "") {
					sheetObj.SetCellValue(Row, Col-1,formObj.cntr_tpsz_cd.value,0);
				} else {
					ComShowCodeMessage("INV00056", formObj.cntr_no.value);
					sheetObj.SetCellValue(Row, Col-2,"",0);
					sheetObj.SetCellValue(Row, Col-1,"",0);
					sheetObj.SetCellValue(Row, Col,"",0);
					return;
				}
				sheetObj.SetCellValue(Row, Col-2,v_max_no+1,0);
			}        		      		
		}        	
	}  
	/**
	 * Initialize sheet. Define header. <br> 
	 * Initialize moudle by sheet count. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     initSheet(sheetObj, 0)
	 * </pre>
	 * @param {ibsheet} sheetObj required IBSheet Object
	 * @param {int} sheetNo sheet object  
	 * @return none. 
	 * @author 
	 * @version 2009.10.20     
	 */   
	function initSheet(sheetObj,sheetNo) {
		var cnt=0;
		switch(sheetNo) {
		case 1:      //sheet1 init
		    with(sheetObj){
	        
	        var v_pagetype=document.form.pagetype.value;
	        
	        var HeadTitle="No.|TP/SZ|CNTR No.|No.|TP/SZ|CNTR No.|No.|TP/SZ|CNTR No.|No.|TP/SZ|CNTR No.";

	        SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );

	        var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	        var headers = [ { Text:HeadTitle, Align:"Center"} ];
	        InitHeaders(headers, info);

	        var cols = [ {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:"No1",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"TPSZ1",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"CNTRNo1",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:"No2",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"TPSZ2",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"CNTRNo2",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:"No3",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"TPSZ3",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"CNTRNo3",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:"No4",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"TPSZ4",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"CNTRNo4",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
	       
	        InitColumns(cols);
	        SetSheetHeight(220);
	        if (v_pagetype == "E") {
	        SetEditable(1);
	        } else {
	        SetEditable(0);
	        }
	      }
		break;
		}
	}
	/**
	 * Process function for sheet. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     doActionIBSheet(sheetObj, document.form, IBSEARCH)
	 * </pre>
	 * @param {ibsheet} sheetObj required IBSheet Object
	 * @param {form} formObj
	 * @param {int} sAction
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function doActionIBSheet(sheetObj,formObj,sAction) {
		sheetObj.ShowDebugMsg(false);
		switch(sAction) {
		case IBSEARCH:      //retrieve
		formObj.f_cmd.value=SEARCH;
		var sXml=sheetObj.GetSearchData("FNS_INV_0098GS.do", FormQueryString(formObj));
		var sStr=ComGetEtcData(sXml,"cntr_tpsz_cd");
		formObj.cntr_tpsz_cd.value=sStr;                
		break;    
		case IBSAVE:        //save
		break;
		case IBINSERT:      // input
		break;
		}
	}
	/**
	 * Validating input values. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     validateForm(sheetObj, document.form, IBSEARCH)
	 * </pre>
	 * @param {ibsheet} sheetObj required IBSheet Object
	 * @param {form} formObj required html form object
	 * @param {int} sAction
	 * @return boolean
	 * @author 
	 * @version 2009.10.20
	 */
	function validateForm(sheetObj,formObj,sAction){
		with(formObj){
			//                if (!isNumber(formObj.iPage)) {
	//		return false;
	//		}
		}
		return true;
	}
