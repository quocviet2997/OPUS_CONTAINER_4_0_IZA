/*=========================================================
*Copyright(c) 2018 CyberLogitec. All Rights Reserved.
*@FileName   : JOO_VVD_LIST.js
*@FileTitle  : VVD Code Help
*@author     : CLT
*@version    : 1.0
*@since      : 2018/12/03
=========================================================*/
/****************************************************************************************
   Event Code: INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
               MODIFY=4; REMOVE=5; REMOVELIST=6; MULTI=7;
               Other Case: COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
	// public variable
	var sheetObjects=new Array();
	var sheetCnt=0;
	// Event handler processing by button click event */
	document.onclick=processButtonClick;
	// Event handler processing by button name */
	function processButtonClick(){
		var sheetObject=sheetObjects[0];
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			if (!ComIsBtnEnable(srcName)) return;  
			switch(srcName) {
				case "btn_Retrieve":
					doActionIBSheet(sheetObject,formObject,IBSEARCH);
					break;
				case "btn_ok":
					var row=sheetObject.GetSelectRow();
					var col=sheetObject.GetSelectCol();
					if(row < sheetObject.HeaderRows()){
						ComClosePopup();
						return;
					}
					doReturnValue(sheetObject, row, col);
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
	 * registering IBSheet Object as list
     * adding process for list in case of needing batch processing with other items 
     * defining list on the top of source
	 */
	function setSheetObject(sheet_obj){
		sheetObjects[sheetCnt++]=sheet_obj;
	}
	/**
	 * initializing sheet
     * implementing onLoad event handler in body tag
     * adding first-served functions after loading screen.
	 */
	function loadPage() {
		for(i=0;i<sheetObjects.length;i++){
			ComConfigSheet (sheetObjects[i]);
			initSheet(sheetObjects[i],i+1);
			ComEndConfigSheet(sheetObjects[i]);
		}
//		doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
	}
	/**
	 * setting sheet initial values and header
     * param : sheetObj, sheetNo
     * adding case as numbers of counting sheets
	 */
	function initSheet(sheetObj,sheetNo) {
		var cnt=0;
		switch(sheetNo) {
			case 1:      // sheet1 init
				with(sheetObj){
					var HeadTitle="";
					var headCount=0;
					var cols= new Array();
					SetConfig({SearchMode:2, DataRowMerge:1})
					HeadTitle="|VSL|Voyage No.|DIR|First Port ETA|Lane";
					headCount=ComCountHeadTitle(HeadTitle);
					var headers=[ { Text:HeadTitle, Align:"Center"}  ];
					var info={ Sort:0, ColMove:1, HeaderCheck:1, ColResize:1 };
					InitHeaders(headers, info);
					cols.push({Type:"Status",    Hidden:1,  Width:0,    Align:"Center",  ColMerge:1,   SaveName:"Status" });
					cols.push({Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"vsl_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
					cols.push({Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"skd_voy_no",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
					cols.push({Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"skd_dir_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
					cols.push({Type:"Date",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"vps_eta_dt",      KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
					cols.push({Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"vsl_slan_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
					
					InitColumns(cols);
					SetMergeSheet(5);
					SetEditable(1);
					SetSheetHeight(260);
				}
				break;
		}
	}
	// handling sheet process
	function doActionIBSheet(sheetObj,formObj,sAction) {
		switch(sAction) {
		   case IBSEARCH:
				if(validateForm(sheetObj,formObj,sAction)){
					formObj.f_cmd.value=SEARCH29;
					var sParam=FormQueryString(formObj);
					var sXml=sheetObj.GetSearchData("JOOCommonGS.do", sParam);
					sheetObj.LoadSearchData(sXml,{Sync:1});
				}
				break;
		}
	}
	
	/**
	 * handling process for input validation
	 */
	function validateForm(sheetObj,formObj,sAction){
		with(formObj){
			switch(sAction) {
				case IBSEARCH:
					 var vsl_cd=formObj.vsl_cd;
				     with(formObj){
				    	 if (ComChkLen(vsl_cd, 2)==1){
				    		 vsl_cd.focus();
				    		 ComShowCodeMessage('JOO10025', "2", "vessel code");
				    		 return false;
				    	 }
				     }
					return true;
					break;
			}
		}
		
		return true;
	}
	/**
	 * Handling grid double click process
	 * - call doReturnValue
	 * 
	 * @param sheetObj
	 * @param row
	 * @param col
	 * @param value
	 * @return
	 */
	function sheet1_OnDblClick(sheetObj, row, col, value) {
		comPopupOK();
    }
	
	function sheet1_OnSearchEnd(){
	}
