/**=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : FNS_INV_0076.js
*@FileTitle  : Revenue Account Code Creation
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/27
=========================================================**/
	
	
	// Global variables.

	var tabObjects=new Array();
	var tabCnt=0 ;
	var beforetab=1;
	
	var sheetObjects=new Array();
	var sheetCnt=0;
	
	//Defining button events. */
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
		var sheetObject=sheetObjects[0];
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch(srcName) {
			case "btn_retrive":
				doActionIBSheet(sheetObject,formObject,IBSEARCH);
				break;
			case "btn_new":
				formObject.inv_src_cd.value="";
				formObject.rev_tp_grp_cd.value="";
				formObject.delt_flg.value="N";
				sheetObject.RemoveAll();
				break;
			case "btn_Save":
           	 	doActionIBSheet(sheetObjects[0],document.form,IBSAVE);
                break;
			case "btn_downExcel": 	
				if(sheetObject.RowCount() < 1){//no data						
					ComShowCodeMessage("COM132501");
				}else{
					sheetObject.Down2Excel();
				}				
				break;
			case "btn_RowAdd":
				sheetObject.DataInsert(-1);
                break;
             case "btn_Delete":
            	 if(!validateForm(sheetObjects[0],formObject,IBDELETE)) {
     				return false;
     			 }
            	ComRowHideDelete(sheetObjects[0], "DelChk");
            	break;
             case "btn_Retrieve":
            	doActionIBSheet(sheetObjects[0],formObject,IBSEARCH);
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
	function setSheetObject(sheet_obj){
		sheetObjects[sheetCnt++]=sheet_obj;
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
		doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
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
		case 1:      //t1sheet1 init
		    with(sheetObj){			        
			      //no support[check again]CLT 			if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);
			      var HeadTitle="|Sel|Seq.|Source|Rev. GRP|Rev. Code|Acct Div.|CHRG.|Acct Code|Acct Eng Name|Del.|Last Update Date";
		
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
		
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
		
			      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
			             {Type:"DummyCheck", Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
			             {Type:"Seq",       Hidden:0, Width:47,   Align:"Center",  ColMerge:1,   SaveName:"SEQ",              KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:56,   Align:"Center",  ColMerge:1,   SaveName:"inv_src_cd",       KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:10, InputCaseSensitive:1, AcceptKeys:"E"},
			             {Type:"Text",      Hidden:0,  Width:75,   Align:"Center",  ColMerge:1,   SaveName:"rev_tp_grp_cd",    KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:3, InputCaseSensitive:1, AcceptKeys:"E" },
			             {Type:"Text",      Hidden:0,  Width:75,   Align:"Center",  ColMerge:1,   SaveName:"rev_tp_src_cd",    KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:3, InputCaseSensitive:1, AcceptKeys:"E" },
			             {Type:"Text",      Hidden:0,  Width:75,   Align:"Center",  ColMerge:1,   SaveName:"inv_acct_div_cd",  KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:2, InputCaseSensitive:1, AcceptKeys:"E" },
			             {Type:"Text",      Hidden:0,  Width:75,   Align:"Center",  ColMerge:1,   SaveName:"chg_cd",           KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:3, InputCaseSensitive:1, AcceptKeys:"E|N" },
			             {Type:"Text",      Hidden:0,  Width:75,   Align:"Center",  ColMerge:1,   SaveName:"acct_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:6 },
			             {Type:"Text",      Hidden:0,  Width:350,  Align:"Left",    ColMerge:1,   SaveName:"acct_eng_nm",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"delt_flg",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 },
			             {Type:"Text",      Hidden:0,  Width:109,  Align:"Center",  ColMerge:1,   SaveName:"upd_dt",           KeyField:0,   CalcLogic:"",   Format:"####-##-## ##:##:##" } ];
			       
			      InitColumns(cols);		
			      SetEditable(1);
			      SetWaitImageVisible(0);
			      SetSheetHeight(460);
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
	 * @param {form} formObj required html form object
	 * @param {int} sAction
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */
	function doActionIBSheet(sheetObj,formObj,sAction) {
		var formObject=document.form
		switch(sAction) {
		case IBSEARCH:      //retrieve
			if(validateForm(sheetObj,formObj,sAction)){
				formObj.f_cmd.value=SEARCH;				
			}else{
				break;
			}
			ComOpenWait(true);
			sheetObj.DoSearch("FNS_INV_0076GS.do", FormQueryString(formObj) );	
			break;		
			
		case IBSAVE:        //save
			if(!validateForm(sheetObj,formObj,sAction)) {
				return;
			}
		   	if(sheetObj.RowCount()== 0) {
		   		return;
		   	}
			formObj.f_cmd.value=MULTI;					
			var sParam=ComGetSaveString(sheetObj);
			if (sheetObj.IsDataModified()&& sParam == ""){ 
				return;
			}
	        sParam += "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_"); 			
	        var SaveXml=sheetObj.GetSaveData("FNS_INV_0076GS.do", sParam ); 			
	        sheetObj.LoadSaveData(SaveXml);
			if (SaveXml.indexOf(">OK<") > -1){
				doActionIBSheet(sheetObj,formObj,IBSEARCH);
			}
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
		 switch(sAction) {
		 }
      return true;
	}

	function sheet_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) { 
    	ComOpenWait(false);
    }