/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0034.js
*@FileTitle  : carrier
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/03
=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
			   MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
			   OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
    /**
	 * @extends
	 * @class BCM_CCD_0034 : BCM_CCD_0034 on the screen for creating the script defines the task using.
	 */
    /** Common global variable */
	var sheetObjects=new Array();
	var sheetCnt=0;
	var newConfirmChk = false;
	
	/** Event handler processing by button click event */
	document.onclick=processButtonClick;
	/** Event handler processing by button name */
	function processButtonClick() {
		/*****Case more than two additional sheets tab sheet is used to specify a variable *****/
		var sheetObject=sheetObjects[0];
		/** **************************************************** */
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch (srcName) {
			case "btn_Retrieve":
				doActionIBSheet(sheetObjects[0], formObject, IBSEARCH);
				break;
			case "btn_Save":                                   
			    doActionIBSheet(sheetObjects[0],document.form,IBSAVE); 
				break;	
			case "btn_New":
				doActionIBSheet(sheetObjects[0],document.form,IBCLEAR);
			    break;
			case "btn_Close":
				ComClosePopup(); 
				break;
			case "btn_Request":
				doActionIBSheet(sheetObjects[0], document.form, MULTI03); 
				break;
			case "btn_com_ens_on1":
				if(window.event.srcElement.style.cursor == "default") return;
				var param="crr_cd=" + formObject.crr_cd.value;
	    		param=param + "&mdm_yn=" + formObject.mdm_yn.value;
	    		ComOpenPopup('/opuscntr/COM_ENS_0N1.do?' + param, 620, 500, 'setCallBack0B2', '1,0,1,1,1,1,1,1', true);
				break;
			} 
		} catch (e) {
			if (e == "[object Error]") {
				ComShowCodeMessage("COM12111");
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
	function setSheetObject(sheet_obj) {
		sheetObjects[sheetCnt++]=sheet_obj;
	}
	/**
	  * initializing sheet
	  * implementing onLoad event handler in body tag
	  * adding first-served functions after loading screen.
	  */
	function loadPage() {
		for (i=0; i < sheetObjects.length; i++) {
			ComConfigSheet(sheetObjects[i]);
			initSheet(sheetObjects[i], i + 1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		initControl();
		document.form.ibflag.value="I";
		// auth_tp_cd retrieve
		doActionIBSheet(sheetObjects[0], form, SEARCH10);
		var authTpCd=G_AHTU_TP_CD;
		var rqstNo=form.rqst_no.value;
		if(G_MDAA_CHK == 'Y')
			ComEnableObject(form.delt_flg, true); 
		else
			ComEnableObject(form.delt_flg, false); 
		// If the Process Status screen call, in the Detail PopUp
		if(rqstNo != '') {
			doActionIBSheet(sheetObjects[0], form, IBSEARCH);
			ComSetDisplay('btn_Close', true);
			var procTpCd=form.proc_tp_cd.value;
			var rqstUsrChk=form.rqst_usr_chk.value;
			ComEnableObject(form.btn_com_ens_on1, false);
			// Process Type is 'Reject' and AuthType is not 'Approval'(possible modifications and ReOpen)
			if(procTpCd == 'R' &&  ( ((authTpCd == 'R' || authTpCd == 'S') && rqstUsrChk == 'Y') || G_MDAA_CHK == 'Y') ) {
				ComSetDisplay('btn_Request', true);
				ComGetObject("btn_Request").style.setProperty("color", "#FF0000", "important");
				ComSetDisplay('btn_Retrieve', true);
				ComSetDisplay('btn_Save', true);
				doActionIBSheet(sheetObjects[0], form, IBSEARCH);
			} else if(procTpCd == 'A') {
				doActionIBSheet(sheetObjects[0], form, IBSEARCH);
				ComEnableObject(form.btn_com_ens_on1, false);
			} else {
				doActionIBSheet(sheetObjects[0], form, IBSEARCH);
			}
		} else {
			ComSetDisplay('btn_Retrieve', true);
			// MDM Authority is not Approval('A') or MDDA
			if( authTpCd == 'R' || authTpCd == 'S' || G_MDAA_CHK == 'Y') {
				ComSetDisplay('btn_New', true);
				ComSetDisplay('btn_Save', true);
			} else {
				//General User if you do not have MDM Authority
				ComSetDisplay('btn_New', true);
			}
		}
		$("#crr_cd").blur(function(){
			newConfirmChk = true;
			obj_change();
		});
	}
	/**
	 *  HTML Control of the event is dynamically loaded. <br>
	 * {@link #loadPage}Function calls this function initializes the IBSheet Object.<br>
	 * 
	 * @param {ibsheet} sheetObj IBSheet Object
	 * @param {int} SheetObjects sequence number in the array
	 */
	function initControl() {
		var formObject=document.form;
		// Axon event handling 
	    axon_event.addListenerForm  ('beforedeactivate', 'obj_deactivate',  formObject); //focus out
	    axon_event.addListenerFormat('beforeactivate',   'obj_activate',    formObject); //focus in
//	    axon_event.addListenerFormat('keypress',       'obj_keypress',    form);         //key press					
//	    axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
	    axon_event.addListenerForm  ('change', 'obj_change', form);
	    ComClearSeparator (document.form.crr_cd,"eng"); //English only 
//      ComClearSeparator (document.form.crr_nm,"eng"); //English only
        ComClearSeparator (document.form.bkg_edi_cd,"eng"); //English only
	}
	 /** 
	 * OnKeyPress event handling<br>
	 */
//	 function obj_keypress() {
//		 	obj=event.srcElement;	 	
//		 	keyValidation(obj);  
//	 } 
	 /**
	  * setting sheet initial values and header
	  * param : sheetObj, sheetNo
	  * adding case as numbers of counting sheets
	  */
	function initSheet(sheetObj, sheetNo) {
		var cnt=0;
		var sheetId=sheetObj.id;
		switch (sheetId) {
		case "sheet1":
		    with(sheetObj){
			      if (location.hostname != "")
			      var HeadTitle1="|ibflag|deltflg|crrCd|nykLgcyCrrCdCtnt|molLgcyCrrCdCtnt|klineLgcyCrrCdCtnt|crrNm|bkgEdiCd|";
			      var headCount=ComCountHeadTitle(HeadTitle1);
			      (headCount, 0, 0, true);
			      var prefix="";
		
			      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
		
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
			      InitHeaders(headers, info);
		
			      var cols = [ {Type:"Status",    Hidden:0, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
			             {Type:"Text",      Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"delt_flg",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"crr_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:10 },
			             {Type:"Text",      Hidden:1, Width:80,   Align:"Left",    ColMerge:0,   SaveName:"nyk_lgcy_crr_cd_ctnt",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1, InsertEdit:1, EditLen:10 },
			             {Type:"Text",      Hidden:1, Width:80,   Align:"Left",    ColMerge:0,   SaveName:"mol_lgcy_crr_cd_ctnt",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1, InsertEdit:1, EditLen:10 },
			             {Type:"Text",      Hidden:1, Width:80,   Align:"Left",    ColMerge:0,   SaveName:"kline_lgcy_crr_cd_ctnt",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1, InsertEdit:1, EditLen:10 },
			             {Type:"Text",      Hidden:1, Width:350,  Align:"Left",    ColMerge:0,   SaveName:"crr_nm",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1 },
			             {Type:"Text",      Hidden:1, Width:80,   Align:"Left",    ColMerge:0,   SaveName:"bkg_edi_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1 }];
			       
			      InitColumns(cols);
		
			      SetEditable(1);
			      SetVisible(false);
	            }
			break;
		}
	}
	
	// handling sheet process
	function doActionIBSheet(sheetObj, formObj, sAction) {
		sheetObj.ShowDebugMsg(false);
		switch (sAction) {
		case IBSEARCH: //Retrieve
			if(!validateForm(sheetObj,formObj,sAction)) {
			return false;
			}
			ComOpenWait(true);
			if( formObj.rqst_no.value == ''){
				formObj.f_cmd.value=SEARCH;
	 		}else{
	 			formObj.f_cmd.value=SEARCH01;
	 		}
			var sParam=FormQueryString(formObj);
 	        var sXml=sheetObj.GetSearchData("BCM_CCD_0034GS.do", sParam);
	        var crr_nm=ComXmlString(sXml, "crr_nm");
	        if(crr_nm == ""){
	        	formObj.creflag.value="Y";
	        	formObj.crr_nm.value="";
	        	formObj.delt_flg.value="N";
	       		formObj.ibflag.value="I";
	       		formObj.nyk_lgcy_crr_cd_ctnt.value="";
	       		formObj.mol_lgcy_crr_cd_ctnt.value="";
	       		formObj.kline_lgcy_crr_cd_ctnt.value="";
	       		if(G_AHTU_TP_CD=="A"){
    	    		ComShowCodeMessage("CCD00033", "Carrier Code");
    	    		doActionIBSheet(sheetObj, formObj, IBCLEAR);
    	    	}else{
    	    		if(newConfirmChk && !ComShowConfirm(ComGetMsg("CCD00034", "Carrier Code"))){
    	    			doActionIBSheet(sheetObj, formObj, IBCLEAR);
    	    		}
    	    	}
	        }else{
	        	formObj.creflag.value="N";
	        	formObj.crr_nm.value=crr_nm;
	        	formObj.crr_cd.value=ComXmlString(sXml, "crr_cd");
	        	formObj.delt_flg.value=ComXmlString(sXml, "delt_flg");
	        	formObj.bkg_edi_cd.value=ComXmlString(sXml, "bkg_edi_cd");
	        	formObj.cre_usr_id.value=ComXmlString(sXml, "cre_usr_id");
	        	formObj.cre_dt.value=ComXmlString(sXml, "cre_dt");
	        	formObj.upd_usr_id.value=ComXmlString(sXml, "upd_usr_id");
	        	formObj.upd_dt.value=ComXmlString(sXml, "upd_dt");
	        	formObj.nyk_lgcy_crr_cd_ctnt.value=ComXmlString(sXml, "nyk_lgcy_crr_cd_ctnt");
	        	formObj.mol_lgcy_crr_cd_ctnt.value=ComXmlString(sXml, "mol_lgcy_crr_cd_ctnt");
	        	formObj.kline_lgcy_crr_cd_ctnt.value=ComXmlString(sXml, "kline_lgcy_crr_cd_ctnt");
	        	formObj.ibflag.value="U";
	        	formObj.crr_cd.readOnly=true;
	        }
			ComOpenWait(false);
			break;
		case IBSAVE:        //Save
			if(!validateForm(sheetObj,formObj,sAction)) {
	        return false;
			}
			if( formObj.creflag.value == "N" && formObj.rqst_no.value == ''){
	 			formObj.f_cmd.value=MULTI;
	 		}else{
	 			formObj.f_cmd.value=MULTI01;
	 			ComEnableObject(form.btn_com_ens_on1, false);
	 		}
 			var sParam=FormQueryString(formObj);
 			var tmpMsg="";
			if(formObj.creflag.value != "N" && formObj.rqst_no.value == ''){
				tmpMsg="CCD00035";
			}else{
				tmpMsg="COM130101";
			}
 			if(ComShowConfirm(ComGetMsg(tmpMsg,"Data"))){
     			ComOpenWait(true);
      			var sXml=sheetObj.GetSaveData("BCM_CCD_0034GS.do", sParam);
     			ComOpenWait(false);
     			if(formObj.creflag.value != "N" && formObj.rqst_no.value == ''){
					ComShowCodeMessage("CCD00031");
				} else {
					ComShowCodeMessage("COM130102", "Data");
				}
     			var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
     			var rqstNo=ComGetEtcData(sXml, "RQST_NO");
				ComSetObjValue(formObj.rqst_no, rqstNo);
     			if(result != "F"){
     				doActionIBSheet(sheetObj, formObj, IBSEARCH);
     			}else{
     				ComShowCodeMessage("COM132103","Data");
     			}
     			//doActionIBSheet(sheetObj, formObj, IBSEARCH);
 			}
		break;
		case IBCLEAR:      //Initialization
		   ComEnableObject(form.btn_com_ens_on1, true);
		   ComClearObject(formObj.crr_cd);
		   ComClearObject(formObj.crr_nm);
		   ComClearObject(formObj.bkg_edi_cd);
		   ComClearObject(formObj.delt_flg);
		   ComClearObject(formObj.nyk_lgcy_crr_cd_ctnt);
		   ComClearObject(formObj.mol_lgcy_crr_cd_ctnt);
		   ComClearObject(formObj.kline_lgcy_crr_cd_ctnt);
		   formObj.crr_cd.readOnly=false;
		   formObj.rqst_no.value="";
		   formObj.cre_usr_id.value="";
		   formObj.cre_dt.value="";
		   formObj.upd_usr_id.value="";
		   formObj.upd_dt.value="";
		   sheetObj.SetCellValue(1, "ibflag","I",0);
	    break;
		case SEARCH10: // MDM AUTH_TP_CD query
		var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=CARR';
 		var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
		// global var sestting
		G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
		G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
		break;
		case MULTI03:	// Request
		if (!ComShowCodeConfirm("CCD00030")) {
		    return;
		}
		var sParam='f_cmd=' + MULTI03 + '&rqst_no=' + ComGetObjValue(formObj.rqst_no) + '&rqst_ofc_cd=' + ComGetObjValue(formObj.rqst_ofc_cd) + '&proc_tp_cd=O';
  		var sXml=sheetObj.GetSaveData("BCM_CCD_2002GS.do", sParam);
		var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
		if(sav == "S"  ){
			ComShowCodeMessage("CCD00031");
			ComPopUpReturnValue("Y");
			ComClosePopup(); 
		} else {
			ComShowCodeMessage("COM130103", "Data");
		}
		break;
		}	
 		//ComOpenWait(false);
	}
	//===================================================================================
	//UI Object Event Handler
	// ===================================================================================
	/**
	 * Read from Carrier Code Pop up. <br>
	 */ 
	function setCallBack0B2(aryPopupData) {
		var formObject=document.form;
		formObject.crr_cd.value=aryPopupData[0][3];
		formObject.rqst_no.value=""; 
		doActionIBSheet(sheetObjects[0], formObject, IBSEARCH);
	} 
	 /**
		 * handling process for input validation
		 */
    function validateForm(sheetObj, formObj, sAction) {
      switch (sAction) {
		case IBSEARCH:
			if(formObj.rqst_no.value == ""){
	    		if(formObj.crr_cd.value == "" || formObj.crr_cd.value == null){
	    			ComShowCodeMessage("CCD00001", "Carrier Code");
	    			return false;
	    		}
			}
    		break;
		 case IBSAVE:
    		if(formObj.crr_cd.value == "" || formObj.crr_cd.value == null){
    			ComShowCodeMessage("CCD00001", "Carrier Code");
    			return false;
    		}
    		if(formObj.crr_nm.value == "" || formObj.crr_nm.value == null){
    			ComShowCodeMessage("CCD00001", "Carrier Name");
    			formObj.crr_nm.focus();
    			return false;
    		}
    		break;
		}
		return true;
	}
    function obj_focus() {
      	if(event.srcElement.options){
      		event.srcElement.focus();
      	}else{
      		event.srcElement.select();
      	}
      }
    /**
     * If the data field to be the change event
     */
    function obj_change(){
    	var formObject=document.form;
    	/*****Case more than two additional sheets tab sheet is used to specify a variable *****/
        var sheetObject1=sheetObjects[0];
        /*******************************************************/
    	try {
    		var srcName=ComGetEvent("name");
            switch(srcName) {
            	case "crr_cd":
            		if(formObject.crr_cd.value.length>0){
            			doActionIBSheet(sheetObject1, formObject, IBSEARCH);
            		}
            	break;
               	case "delt_flg":
               		if(formObject.delt_flg.value == "Y") {
               			if(!ComShowCodeConfirm("COM130301", "data")) formObject.delt_flg.value="N";
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
    	newConfirmChk = false;
    }
