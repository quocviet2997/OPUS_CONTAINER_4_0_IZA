/**=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : FNS_INV_0108.js
*@FileTitle  : Invoice Printer Set up
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/27
=========================================================**/

    var sheetObjects=new Array();
	var sheetCnt=0;
	
	//var rdObjects=new Array();
	//var rdCnt=0;
	
	var timer1=null;
	var timer2=null;
	
	var comboObjects=new Array();        
	
	
	// Defining button events. */
	document.onclick=processButtonClick;
	// Handling button event. */
    function processButtonClick(){
         /***** Setting each tab's sheet variable. *****/
         var sheetObject=sheetObjects[0];
         /*******************************************************/
         var formObject=document.form;
    	try {
    		var srcName=ComGetEvent("name");
            switch(srcName) {
                case "btn_new":
                	formObject.inv_prn_dvc_nm.value="";
                    break;
                case "btn_save":
                	doActionIBSheet(sheetObject,formObject,IBSAVE);
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
     * Register IBSheet object on array.<br>
     * <br>
     * Array define top on source.<br>
     *
     * @param {object} sheet_obj
     * @return none.
     */
    function setSheetObject(sheet_obj){
       sheetObjects[sheetCnt++]=sheet_obj;
    }
    
    /** 
     * registering IBCombo Object as list
     * param : combo_obj
     * adding process for list in case of needing batch processing with other items
     * defining list on the top of source
     */ 
    function setComboObject(combo_obj) {  
        comboObjects[comboCnt++]=combo_obj;  
    }
    
    /**
     * Initialize sheets.<br>
     * Coding event handler for body tag's OnLoad.<br>
     * After complete on load, add pre-function.<br>
     * 
     * @return none.
     */
    function loadPage() {
    	var sheetObject1=sheetObjects[0];
    	var formObj=document.form;
    	for(i=0;i<sheetObjects.length;i++){
            ComConfigSheet (sheetObjects[i] );
            initSheet(sheetObjects[i],i+1);
            ComEndConfigSheet(sheetObjects[i]);
        }
    	for ( var k=0; k < comboObjects.length; k++) {
    		initCombo(comboObjects[k], k + 1);
    	}
    	//initRdConfig(rdObjects[0]);    	
    	//initPrintList();
    	getDataInfo();
    	doActionIBSheet(sheetObject1,formObj,IBSEARCH); 
    }
    
    

	function initCombo(comboObj, comboNo) {
		switch (comboObj.options.id) {
	 		case "prn_dvc_nm":
	 			var i=0;
	 			with (comboObj) {
	 				//BackColor = "cyan";
	 				SetDropHeight(200);
	 				SetMultiSelect(0);
	 				SetMaxSelect(1); 
	 			}
	 			break;
		}
	}	

    /**
     * Initialize sheet. Define header.<br>
     * param : sheetObj ==> sheet object, sheetNo ==> sheet object tag id<br>
     * Initialize moudle by sheet count.<br>
     * 
     * @param {object} sheetObj
     * @param {int} sheetNo
     * @return none.
     * @see #loadPage
     */
    function initSheet(sheetObj,sheetNo) {
    	switch(sheetObj.id) {
    		case "sheet1":
    			  with(sheetObj){		    		    
		    		   //no support[check again]CLT 
    			       //if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);	
		    		   SetConfig( { SearchMode:2, DataRowMerge:0 } );		
		    		   var info    = { Sort:1, ColMove:1, ColResize:1, HeaderCheck:1 };
		    		   var headers = [ ];
		    		   InitHeaders(headers, info);		
		    		   var cols = [  ];		    		    
		    		   //InitColumns(cols);
		    		   //SetSheetHeight(0);
    			}    			
                break;
        }
    }
    /** Process function for sheet.<br>
     * 
     * @param {object} sheetObj
     * @param {object} formObj
     * @param {int} sAction
     * @return none.
     * @see #processButtonClick
     */
    function doActionIBSheet(sheetObj,formObj,sAction) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
        	case IBSEARCH:
        		formObj.f_cmd.value=SEARCH;
        		var sXml=sheetObj.GetSearchData("FNS_INV_0108GS.do", FormQueryString(formObj));
	   			var arOfcCd=ComGetEtcData(sXml, "ArOfcCd"); 
	   			var invPrnDvcNm=ComGetEtcData(sXml, "InvPrnDvcNm");	
	   			if(typeof arOfcCd != "undefined" && arOfcCd != "" ) {
	   				formObj.ar_ofc_cd.value=arOfcCd;
	   				prn_dvc_nm.SetSelectCode(invPrnDvcNm);  
	   				//if(invPrnDvcNm == "") {
	   				//	var defaultPrint = rdObjects[0].GetLocalInfo("DefaultPrnName", "");
	   				//	prn_dvc_nm.SetSelectCode(defaultPrint);
	   				//}
	   			}	   			
    			break;
			case IBSAVE:
				if(validateForm(sheetObj,formObj,sAction)) {
        			formObj.f_cmd.value=MULTI;
        			form.inv_prn_dvc_nm.value=prn_dvc_nm.GetSelectText();         			
        			var sXml=sheetObj.GetSaveData("FNS_INV_0108GS.do", FormQueryString(formObj));
        			var state=ComGetEtcData(sXml,ComWebKey.Trans_Result_Key);
        			if(state == "S") {
        				ComShowCodeMessage("INV00051");
        			} else{
        				ComShowCodeMessage("INV00053");
        			}
        		}
				break;
        }
    }
    /**
     * Validating input values.<br>
     *
     * @param {object} sheetObj
     * @param {object} formObj
     * @param {int} sAction
     * @return bool;
     */
    function validateForm(sheetObj,formObj,sAction){
    	if (!ComChkValid(formObj)){
    		return false;
    	}
        return true;
    }
    /**
  	 * Initialize RD object.<br>
  	 * 
  	 * @return none.
     * @see #loadPage
     */
    function initRdConfig(rdObject){
  		var Rdviewer=rdObject ;
		Rdviewer.AutoAdjust=true;
		Rdviewer.ViewShowMode(0);
		Rdviewer.SetBackgroundColor(128,128,128);
		Rdviewer.SetPageLineColor(128,128,128);
		Rdviewer.ApplyLicense("0.0.0.0");
		Rdviewer.style.height=0 
 	}
    /**
     * Initialize print information.<br>
     * 
     * @return none.
     * @see #loadPage
     */
    function initPrintList(){ 
    	var rdViewer = document.form.Rdviewer;    // for IE11
    	if (rdViewer == undefined) rdViewer = Rdviewer;    // for Chrome
    	strPrintList = rdViewer.GetLocalInfo("PrnNames", "");
    	defaultPrint = rdViewer.GetLocalInfo("DefaultPrnName", "");

    	if (strPrintList == undefined || strPrintList == null || strPrintList == "") return;
    	var arrPrintList = strPrintList.split("|");
    	printListXml = " <SHEET> \n";
    	printListXml += " <DATA COLORDER='val' COLSEPARATOR='☜☞' TOTAL='" + (arrPrintList.length - 1) + "'> \n";
    	for (var i=0; i<arrPrintList.length-1; i++) {
    		printListXml += " 	<TR><![CDATA[" + arrPrintList[i] + "]]></TR> \n";
    	}
    	printListXml += " </DATA> \n";
    	printListXml += " </SHEET> "; 
    	ComXml2ComboItem(printListXml, prn_dvc_nm, "val", "val"); 
	  	//clearInterval(timer1); 
 	}
    /**
     * Get print information.<br>
     * 
     * @return none.
     */
    function getDataInfo() {
    	//doActionIBSheet(sheetObjects[0],form,IBSEARCH);
    	//clearInterval(timer2);
    }
