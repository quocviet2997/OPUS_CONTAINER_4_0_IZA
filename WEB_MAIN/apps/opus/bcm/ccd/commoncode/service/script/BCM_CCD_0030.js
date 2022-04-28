/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0030.jsp
*@FileTitle  : Trade
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/05
=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
			   MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
			   OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
    function BCM_CCD_0030() {
    	this.processButtonClick=tprocessButtonClick;
    	this.setSheetObject=setSheetObject;
    	this.loadPage=loadPage;
    	this.initSheet=initSheet;
    	this.initControl=initControl;
    	this.doActionIBSheet=doActionIBSheet;
    	this.setTabObject=setTabObject;
    	this.validateForm=validateForFm;
    }
    /** Common global variable */
    var sheetObjects=new Array();
    var sheetCnt=0;
    var comboObjects=new Array();
    var comboCnt=0;
    /** Event handler processing by button click event */
    document.onclick=processButtonClick;
    /** Event handler processing by button click event */
    function processButtonClick(){
        var formObj=document.form;
        try {
            var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
            switch(srcName) {
            case "btn_Retrieve":
				doActionIBSheet(sheetObjects[0],formObj,SEARCH02);
				break;
            case "btn_New":
            	doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
            	break;
            case "btn_Save":
            	doActionIBSheet(sheetObjects[0],formObj,MULTI01);
            	break;
			case "btn_Close":
				ComClosePopup();
				break;
			case "btn_Request":
				doActionIBSheet(sheetObjects[0], document.form, MULTI03);
				break;
            case "btn_Calendar1":
				var cal=new ComCalendar();
				cal.select(formObj.st_eff_dt, 'yyyy-MM-dd');
            	break;
            case "btn_Calendar2":
				var cal=new ComCalendar();
				cal.select(formObj.end_eff_dt, 'yyyy-MM-dd');
            	break;
			case "btns_trade":
				if(window.event.srcElement.style.cursor == "default") return;
 		        var sUrl="/opuscntr/COM_COM_0012.do?code=" + formObj.trd_cd.value + "&main_page=" + "false"+ "&mdm_yn=" + "Y";
 		        var rVal=ComOpenPopup(sUrl, 790, 430, "get_trdCd", "1,0,1", true);
// 		        doActionIBSheet(sheetObjects[0],formObj,SEARCH02);
 				break;
            case "btn_ofc_cd":
            	var sUrl="/opuscntr/COM_ENS_071.do?ofc_cd=" + formObj.ofc_cd.value;
                var rVal=ComOpenPopup(sUrl, 770, 520, "get_ofcCd", "1,0,1", true);
    			break;
            }
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
	 * registering IBCombo Object as list
	 * adding process for list in case of needing batch processing with other items
	 * defining list on the top of source
	 */
   	function setComboObject(combo_obj){
       	comboObjects[comboCnt++]=combo_obj;
   	}
   	/**
     * initializing sheet
     * implementing onLoad event handler in body tag
     * adding first-served functions after loading screen.
     */
    function loadPage() {
        var formObj=document.form;
        for(i=0;i<sheetObjects.length;i++){
            ComConfigSheet (sheetObjects[i] );
            initSheet(sheetObjects[i],i+1);
        }
        initControl();
        doActionIBCombo(sheetObjects[0], formObj, SEARCH01);
        vsl_tp_cd.SetSelectCode("C");
		delt_flg.SetSelectCode("N");
    	// auth_tp_cd retrieve
    	doActionIBSheet(sheetObjects[0], formObj, SEARCH20);
    	var authTpCd=G_AHTU_TP_CD;
    	var rqstNo=formObj.rqst_no.value;
    	if(G_MDAA_CHK == 'Y')
    		formObj.delt_flg.enable=true;
    	else
    		formObj.delt_flg.enable=false;
    	// If the Process Status screen call, in the Detail PopUp
    	if(rqstNo != '') {
    		doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
    		ComSetDisplay('btn_Close', true);
    		var procTpCd=formObj.proc_tp_cd.value;
    		var rqstUsrChk=formObj.rqst_usr_chk.value;
    		ComEnableObject(formObj.btns_trade, false);
    		// Process Type is 'Reject' and AuthType is not 'Approval'(possible modifications and ReOpen)
    		if(procTpCd == 'R' &&  ( ((authTpCd == 'R' || authTpCd == 'S') && rqstUsrChk == 'Y') || G_MDAA_CHK == 'Y') ) {
    			ComSetDisplay('btn_Request', true);
    			ComGetObject("btn_Request").style.setProperty("color", "#FF0000", "important");
    			ComSetDisplay('btn_Retrieve', true);
    			ComSetDisplay('btn_Save', true);
    			doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
    		} else if(procTpCd == 'A') {
    			doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
    			ComEnableObject(formObj.btns_trade, false);
    		} else {
    			doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
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
    }
    /**
     * setting sheet initial values and header
     * param : sheetObj, sheetNo
     * adding case as numbers of counting sheets
     */
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
        switch(sheetNo) {
        case 1:      //sheet1 init
            with(sheetObj){

        		SetConfig( { SearchMode:2, DataRowMerge:0 } );
          		var info    = { Sort:1, ColMove:1, ColResize:1, HeaderCheck:1 };
          		var headers = [{Text:"", Align:"Center"}];
          		InitHeaders(headers, info);

          		var cols = [{}];
          		InitColumns(cols);
          		SetVisible(false);

        	}
        	break;
        }
    }
    /**
     * All the combo box query
     */
	function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
		switch (sAction) {
			case SEARCH01: // load page
			var sXml=sheetObj.GetSearchData("BCM_CCD_0030GS.do", "f_cmd=" + SEARCH01);
			var rtnValue=sXml.split("|$$|");
			for(var i=0; i<rtnValue.length; i++){
				var comboXml=ComXml2ComboString(rtnValue[i], "cd_desc", "cd");
				var cdName=comboXml[0].split("|");
				var cdValue=comboXml[1].split("|");
				for (var j=0; j < cdName.length; j++) {
					comboObjects[i].InsertItem(j, cdName[j], cdValue[j]);
	        	}
			}
     		break;
     	}
	}
    // Sheet processing-related processes
    function doActionIBSheet(sheetObj,formObj,sAction) {
    	switch(sAction) {
    	case SEARCH02:				//query
    		if (validateForm(sheetObj, formObj, sAction)) {
    			if( formObj.rqst_no.value == ''){
    				formObj.f_cmd.value=SEARCH02;
   		 		}else{
   		 			formObj.f_cmd.value=SEARCH05;
   		 		    ComBtnDisable("btn_save");
   		 		}
	    		sheetObj.SetWaitImageVisible(0);
	        	ComOpenWait(true);
	    		var sParam=FormQueryString(formObj);
	    		var sXml=sheetObj.GetSearchData("BCM_CCD_0030GS.do", sParam);
	    		var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
	    		var rqstNo=ComGetEtcData(sXml, "RQST_NO");
   				ComSetObjValue(formObj.rqst_no, rqstNo);
	    		if(sav != "S" ){
	        		ComOpenWait(false);
	        		return;
	    		}
	    		if(ComXmlString(sXml, "delt_flg") == null || ComXmlString(sXml, "delt_flg") == ""){
	    			formObj.creflag.value="Y";
	    			ComOpenWait(false);
	    			formObj.trd_cd.readOnly=true;
//	    			formObj.trd_nm.focus();
	    			if(G_AHTU_TP_CD=="A"){
	    	    		ComShowCodeMessage("CCD00033", "Trade Code");
	    	    		doActionIBSheet(sheetObj, formObj, IBCLEAR);
	    	    	}else{
	    	    		if(!ComShowConfirm(ComGetMsg("CCD00034", "Trade Code"))){
	    	    			doActionIBSheet(sheetObj, formObj, IBCLEAR);
	    	    		}
	    	    	}
	    			return;
	    		}else{
	    			formObj.creflag.value="N";
	    		}
	    		formObj.ibflag.value="U";
	    		formObj.trd_cd.value=getValueForCombo(ComXmlString(sXml, "trd_cd"));
	    		formObj.trd_nm.value=getValueForCombo(ComXmlString(sXml, "trd_nm"));
	    		fm_conti_cd.SetSelectCode(getValueForCombo(ComXmlString(sXml, "fm_conti_cd")));
	    		to_conti_cd.SetSelectCode(getValueForCombo(ComXmlString(sXml, "to_conti_cd")));
	    		vsl_tp_cd.SetSelectCode(getValueForCombo(ComXmlString(sXml, "vsl_tp_cd")));
	    		formObj.ofc_cd.value=getValueForCombo(ComXmlString(sXml, "ofc_cd"));
	    		formObj.st_eff_dt.value=getValueForCombo(ComXmlString(sXml, "st_eff_dt"));
	    		formObj.end_eff_dt.value=getValueForCombo(ComXmlString(sXml, "end_eff_dt"));
	    		delt_flg.SetSelectCode(getValueForCombo(ComXmlString(sXml, "delt_flg")),false);
	    		formObj.modi_cost_ctr_cd.value=getValueForCombo(ComXmlString(sXml, "modi_cost_ctr_cd"));
	    		formObj.cre_usr_id.value=getValueForCombo(ComXmlString(sXml, "cre_usr_id"));
	    		formObj.cre_dt.value=getValueForCombo(ComXmlString(sXml, "cre_dt"));
	    		formObj.upd_usr_id.value=getValueForCombo(ComXmlString(sXml, "upd_usr_id"));
	    		formObj.upd_dt.value=getValueForCombo(ComXmlString(sXml, "upd_dt"));
	    		ComOpenWait(false);
	    		formObj.trd_cd.readOnly=true;
    		}
    		break;
    	case MULTI01:				//save
    		if (validateForm(sheetObj, formObj, sAction)) {
    			if( formObj.creflag.value == "N" && formObj.rqst_no.value == ''){
    				formObj.f_cmd.value=MULTI01;
   		 		}else{
   		 			formObj.f_cmd.value=MULTI02;
   		 			ComEnableObject(form.btns_trade, false);
   		 		}
    			var tmpMsg="";
    			if(formObj.creflag.value != "N" && formObj.rqst_no.value == ''){
    				tmpMsg="CCD00035";
    			}else{
    				tmpMsg="COM130101";
    			}
	    		if(ComShowConfirm(ComGetMsg(tmpMsg, "Data"))){
 	    		sheetObj.SetWaitImageVisible(0);
 	        	ComOpenWait(true);
 	    		var sParam=FormQueryString(formObj);
 	    		var sXml=sheetObj.GetSaveData("BCM_CCD_0030GS.do", sParam);
 	    		var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
 	    		if(sav == "S" ){
 	    			if(formObj.creflag.value != "N" && formObj.rqst_no.value == ''){
    					ComShowCodeMessage("CCD00031");
    				} else {
    					ComShowCodeMessage("COM130102", "Data");
    				}
	        	}else{
	        		ComShowCodeMessage("COM132103", "Data");
	        	}
 	    		ComOpenWait(false);
     			var rqstNo=ComGetEtcData(sXml, "RQST_NO");
				ComSetObjValue(formObj.rqst_no, rqstNo);
				doActionIBSheet(sheetObj,formObj,SEARCH02);
	    		}
    		}
    		break;
    	case IBCLEAR:
    		formObj.reset();
    		formObj.rqst_no.value="";
    		formObj.trd_cd.readOnly=false;
    		vsl_tp_cd.SetSelectCode("C");
    		delt_flg.SetSelectCode("N");
    		fm_conti_cd.SetSelectCode("");
    		to_conti_cd.SetSelectCode("");
    		ComEnableObject(formObj.btns_trade, true);
    		ComBtnEnable("btn_save");
    		break;
    	case SEARCH03:				//query
		if (validateForm(sheetObj, formObj, sAction)) {
    		formObj.f_cmd.value=SEARCH03;
    		sheetObj.SetWaitImageVisible(0);
        	ComOpenWait(true);
    		var sParam=FormQueryString(formObj);
    		var Xml=sheetObj.GetSearchData("BCM_CCD_0030GS.do", sParam);
    		var sav=ComGetEtcData(Xml, "TRANS_RESULT_KEY");
    		if(sav != "S" ){
        		ComOpenWait(false);
        		return;
    		}
    		if(ComGetEtcData(Xml, "result") == null || ComGetEtcData(Xml, "result") == ""){
    			formObj.ofc_cd.value="";
    			ComShowCodeMessage("COM130402", "Admin Office");
    			ComOpenWait(false);
    			return;
    		}
    		ComOpenWait(false);
		}
		break;
    	case SEARCH20: // MDM AUTH_TP_CD query
    		var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=TRDE';
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
    }
    function delt_flg_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {//CHECK OLD CODE: OnChange(comboObj, Index_Code, Text){
    	if(comboObj.GetSelectCode()== "Y"){
     		  if(!ComShowCodeConfirm("COM130301", "data")) comboObj.SetSelectCode("N",false);
        }
    }
    /**
     * handling process for input validation
     */
    function validateForm(sheetObj, formObj, sAction) {
    	switch (sAction) {
    	case SEARCH02:
    		if( formObj.rqst_no.value == ''){
	    		if(formObj.trd_cd.value == "" || formObj.trd_cd.value == null){
	    			ComShowCodeMessage("CCD00001", "Trade Code");
//	    			formObj.trd_cd.focus();
	    			return false;
	    		}
    		}
    		break;
    	case MULTI01:
    		if(formObj.trd_cd.value == "" || formObj.trd_cd.value == null){
    			ComShowCodeMessage("CCD00001", "Trade Code");
//    			formObj.trd_cd.focus();
    			return false;
    		}
    		if(formObj.trd_nm.value == "" || formObj.trd_nm.value == null){
    			ComShowCodeMessage("CCD00001", "Name");
//    			formObj.trd_nm.focus();
    			return false;
    		}
    		if(vsl_tp_cd.GetSelectCode()== "" || vsl_tp_cd.GetSelectCode()== null){
    			ComShowCodeMessage("CCD00001", "Vessel Type");
//    			formObj.vsl_tp_cd.focus();
    			return false;
    		}
    		if(formObj.ofc_cd.value == "" || formObj.ofc_cd.value == null){
    			ComShowCodeMessage("CCD00001", "Admin Office");
//    			formObj.ofc_cd.focus();
    			return false;
    		}
    		if(formObj.st_eff_dt.value == "" || formObj.st_eff_dt.value == null){
    			ComShowCodeMessage("CCD00001", "Effect Date");
//    			formObj.st_eff_dt.focus();
    			return false;
    		}
    		if(formObj.modi_cost_ctr_cd.value == "" || formObj.modi_cost_ctr_cd.value == null){
    			if(formObj.trd_cd.value != "COM"){
//        			ComShowCodeMessage("CCD00001", "Sakura CTR Code");
        			ComShowCodeMessage("CCD00001", "Trade for ERP");
        			formObj.modi_cost_ctr_cd.focus();
        			return false;
    			}
    		}
    		if(formObj.st_eff_dt.value != ""){
    			//Check the date format
				if(!checkDateValue(formObj.st_eff_dt)){
					return false;
				}
    		}
    		if(formObj.end_eff_dt.value != ""){
    			//Check the date format
				if(!checkDateValue(formObj.end_eff_dt)){
					return false;
				}
    		}
    		if((formObj.st_eff_dt.value != "") && (formObj.end_eff_dt.value != "")){
    			if(ComGetDaysBetween(formObj.st_eff_dt, formObj.end_eff_dt) < 0){
    				ComShowCodeMessage("CCD00005", "Expire Date", "Effect Date");
//    				formObj.end_eff_dt.focus();
    				return false;
    			}
    		}
//    		if( formObj.rqst_no.value != ''){
//    			ComShowCodeMessage("CCD00037");
//    			return false;
//    		}
    	}
    	return true;
    }
	function initControl() {
		var formObj=document.form;
//		axon_event.addListenerForm('focus', 'obj_focus', form);
		axon_event.addListenerForm('change', 'obj_change', form);
//		axon_event.addListenerForm('keypress', 'obj_keypress', form);
//		axon_event.addListenerForm('keyup', 'obj_keyup', form);
//		axon_event.addListenerForm('keydown', 'obj_keydown', form);
//		axon_event.addListenerForm('keydown', 'ComKeyEnter', form);
		axon_event.addListenerForm("propertychange", "obj_propertychange", formObj);
	}
   /**
   * HTML Object OnKeyUp Event Handling
   */
   function obj_keypress(event) {
	  obj=event.srcElement;
	  keyValidation(obj);
      var formObj=document.form;
      var eleObj=window.event.srcElement;
      var srcName=eleObj.getAttribute("name");
      switch(srcName) {
      case "st_eff_dt":
    	checkDateForm(formObj.st_eff_dt);
	  break;
	  case "end_eff_dt":
	   	checkDateForm(formObj.end_eff_dt);
	  break;
      }
   }
   /**
   * If the data field to be the CHANGE Event
   */
   function obj_change(){
	   var formObj=document.form;
	   try {
		   var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
	       switch(srcName) {
	       	case "trd_cd":
	       		if(formObj.trd_cd.value.length>0){
	       			doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
	       		}
	       	break;
	       	case "ofc_cd":
	       		if(formObj.ofc_cd.value.length>0){
	       			doActionIBSheet(sheetObjects[0], formObj, SEARCH03);
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
   function get_ofcCd(rowArray) {
		var sheetObj=sheetObjects[0];
	    var formObj=document.form;
	   	var colArray=rowArray[0];
		formObj.ofc_cd.value=colArray[3];
	}
   function get_trdCd(rowArray) {
		var sheetObj=sheetObjects[0];
	    var formObj=document.form;
	   	var colArray=rowArray[0];
      	formObj.trd_cd.value=colArray[3];
      	doActionIBSheet(sheetObjects[0],formObj,SEARCH02);
    }

	  function getValueForCombo(obj) {
		  if (Object.prototype.toString.call(obj) === '[object Array]') {
			  var str = obj[0];
			  return str.split('|')[0];
		  }
		  return obj;
	  }