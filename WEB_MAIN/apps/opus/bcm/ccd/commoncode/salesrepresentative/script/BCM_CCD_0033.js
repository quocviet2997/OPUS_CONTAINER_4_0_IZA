/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0033.jsp
*@FileTitle  : Sales rep
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/06
=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
			   MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
			   OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
    /**
     * @extends 
     * @class BCM_CCD_0033 : BCM_CCD_0033 on the screen for creating the script defines the task using.
     */
    /** Common global variable */
    var sheetObjects=new Array();
    var sheetCnt=0;
    var comboObjects=new Array();
    var comboCnt=0;
    var isdoActionIBSheetBeingProcessed=false;
    /** Event handler processing by button click event */
    document.onclick=processButtonClick;
    /** Event handler processing by button name */
    function processButtonClick(){
        var formObj=document.form;
        try {
            var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
            switch(srcName) {
            case "btn_Retrieve":
				doActionIBSheet(sheetObjects[0],formObj,SEARCH02);
//				formObj.srep_cd.focus();
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
            case "btn_cnt_search":
            	var sUrl="/opuscntr/COM_ENS_0M1.do?cnt_cd=" + formObj.cnt_cd.value;
                var rVal=ComOpenPopup(sUrl, 770, 520, "get_cntCd", "1,0,1", true);
    			break;
            case "btn_ofc_search":
            	var sUrl="/opuscntr/COM_ENS_071.do?ofc_cd=" + formObj.ofc_cd.value;
                var rVal=ComOpenPopup(sUrl, 770, 520, "get_ofcCd", "1,0,1", true);
    			break;
            case "btn_code_create":
				doActionIBSheet(sheetObjects[0],formObj,SEARCH05);
//            	formObj.cnt_cd.focus();
				break;
            case "btn_srep_search":
				if(window.event.srcElement.style.cursor == "default") return;
            	var v1=formObj.mdm_yn.value;
            	var sUrl="/opuscntr/COM_COM_0008.do?srep_cd=" + formObj.srep_cd.value + "&mdm_yn="+v1 + "&delt_flg=N";
                var rVal=ComOpenPopup(sUrl, 780, 420, "get_srepCd", "1,0,1", true);            	
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
     * registering IBSheet Object as list
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
        doActionIBCombo(sheetObjects[0],formObj,SEARCH01);
		delt_flg.SetSelectCode("N");
    	// auth_tp_cd retrieve
    	doActionIBSheet(sheetObjects[0], formObj, SEARCH20);
    	var authTpCd=G_AHTU_TP_CD;
    	var rqstNo=formObj.rqst_no.value;
    	if(G_MDAA_CHK == 'Y')
    		//ComEnableObject(formObj.delt_flg, true);
    		formObj.delt_flg.enable=true;
    	else
    		//ComEnableObject(formObj.delt_flg, false);
    		formObj.delt_flg.enable=false;
    	// If the Process Status screen call, in the Detail PopUp
    	if(rqstNo != '') {
    		doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
    		ComSetDisplay('btn_Close', true);
    		var procTpCd=formObj.proc_tp_cd.value;
    		var rqstUsrChk=formObj.rqst_usr_chk.value;
    		ComEnableObject(formObj.btn_srep_search, false);
    		// Process Type is 'Reject' and AuthType is not 'Approval'(possible modifications and ReOpen)
    		if(procTpCd == 'R' &&  ( ((authTpCd == 'R' || authTpCd == 'S') && rqstUsrChk == 'Y') || G_MDAA_CHK == 'Y') ) {
    			ComSetDisplay('btn_Request', true);
    			ComGetObject("btn_Request").style.setProperty("color", "#FF0000", "important");
    			ComSetDisplay('btn_Retrieve', true);
    			ComSetDisplay('btn_Save', true);
    			doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
    		} else if(procTpCd == 'A') {
    			doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
    			ComEnableObject(formObj.btn_srep_search, false);
    		} else {
    			doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
    		}
    	} else {
    		ComSetDisplay('btn_Retrieve', true);
    		// MDM Authority is not Approval('A') or MDDA    		
    		if( authTpCd == 'R' || authTpCd == 'S' || G_MDAA_CHK == 'Y') {    			
    			ComSetDisplay('btn_code_create', true);
    			ComSetDisplay('btn_New', true);
    			ComSetDisplay('btn_Save', true);
    		} else {
    			//General User if you do not have MDM Authority
    			ComSetDisplay('btn_New', true);
    		}
    	}
    	document.getElementById("srep_cd").focus();
    }
     /**
      * All the combo box query
      */
 	function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
 		switch (sAction) {
 			case SEARCH01: // load page
 				var sXml=sheetObj.GetSearchData("BCM_CCD_0033GS.do", "f_cmd=" + SEARCH01);
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
 	/**
 	  * setting sheet initial values and header
 	  * param : sheetObj, sheetNo
 	  * adding case as numbers of counting sheets
 	  */
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
        switch(sheetNo) {
        case 1:      //sheet1 init
        	with (sheetObj) {
	        	SetConfig( { SearchMode:2, DataRowMerge:0 } );
	
	        	var info    = { Sort:1, ColMove:1, ColResize:1, HeaderCheck:1 };
	        	var headers = [{Text:""}];
	        	InitHeaders(headers, info);
	        	var cols = [{}];
	        	InitColumns(cols);
	        	SetVisible(false);
        	}
        	break;
        }
    }
    // handling sheet process
    function doActionIBSheet(sheetObj,formObj,sAction) {
    	switch(sAction) {
    	case SEARCH02:				//Retrieve
    		if (validateForm(sheetObj, formObj, sAction)) {
    			isdoActionIBSheetBeingProcessed=true;
    			if( formObj.rqst_no.value == ''){
    				formObj.f_cmd.value=SEARCH02;
   		 		}else{
   		 			formObj.f_cmd.value=SEARCH10;
   		 		    ComBtnDisable("btn_save");	
   		 		}
    			sheetObj.SetWaitImageVisible(0);
	    		var sParam=FormQueryString(formObj);
	    		ComOpenWait(true);
	    		var sXml=sheetObj.GetSearchData("BCM_CCD_0033GS.do", sParam);
	    		ComOpenWait(false);
	    		var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
	    		var rqstNo=ComGetEtcData(sXml, "RQST_NO");
   				ComSetObjValue(formObj.rqst_no, rqstNo);
	    		if(sav != "S" ){
	    			isdoActionIBSheetBeingProcessed=false;
	        		return false;
	    		}
	    		formObj.ibflag.value="U";
	    		formObj.srep_cd.value=getValueForCombo(ComXmlString(sXml, "srep_cd"));
	    		if(getValueForCombo(ComXmlString(sXml, "srep_cd")) == null || getValueForCombo(ComXmlString(sXml, "srep_cd")) == ""){
		    		ComShowCodeMessage("COM130402", "Sales Rep.");
		    		formObj.srep_cd.value="";
		    		ComBtnEnable("btn_code_create");
		    		formObj.creflag.value="Y";
		    		isdoActionIBSheetBeingProcessed=false;
		    		return false;
	    		}else{
	    			formObj.creflag.value="N";
	    		}
	    		if(formObj.srep_cd.value.length == "2"){
	    			formObj.srep_cd.value="";
	    			formObj.srep_cd.setAttribute("className","input2");
	    			formObj.srep_cd.readOnly=true;
	    		}
	    		formObj.cnt_cd.value=getValueForCombo(ComXmlString(sXml, "cnt_cd"));
	    		formObj.ofc_cd.value=getValueForCombo(ComXmlString(sXml, "ofc_cd"));
	    		formObj.srep_nm.value=getValueForCombo(ComXmlString(sXml, "srep_nm"));
	    		formObj.ofc_team_cd.value=getValueForCombo(ComXmlString(sXml, "ofc_team_cd"));
	    		sex_cd.SetSelectCode(getValueForCombo(ComXmlString(sXml, "sex_cd")));
	    		formObj.srep_abbr_nm.value=getValueForCombo(ComXmlString(sXml, "srep_abbr_nm"));
	    		ib_srep_flg.SetSelectCode(getValueForCombo(ComXmlString(sXml, "ib_srep_flg")));
	    		ob_srep_flg.SetSelectCode(getValueForCombo(ComXmlString(sXml, "ob_srep_flg")));
	    		delt_flg.SetSelectCode(getValueForCombo(ComXmlString(sXml, "delt_flg")));
	    		formObj.empe_cd.value=getValueForCombo(ComXmlString(sXml, "empe_cd"));
	    		formObj.srep_eml.value=getValueForCombo(ComXmlString(sXml, "srep_eml"));
	    		formObj.mphn_no.value=getValueForCombo(ComXmlString(sXml, "mphn_no"));
	    		formObj.modi_srep_cd.value=getValueForCombo(ComXmlString(sXml, "modi_srep_cd"));
	    		formObj.cre_usr_id.value=getValueForCombo(ComXmlString(sXml, "cre_usr_id"));
	    		formObj.cre_dt.value=getValueForCombo(ComXmlString(sXml, "cre_dt"));
	    		formObj.upd_usr_id.value=getValueForCombo(ComXmlString(sXml, "upd_usr_id"));
	    		formObj.upd_dt.value=getValueForCombo(ComXmlString(sXml, "upd_dt"));
	    		formObj.srep_cd.readOnly=true;
	    		isdoActionIBSheetBeingProcessed=false;
    		}
    		break;
    	case MULTI01:				//Save
    		if (validateForm(sheetObj, formObj, sAction)) {
//    		if(!formObj.srep_cd.value == ""){
    			if( formObj.creflag.value == "N" && formObj.rqst_no.value == ''){
    				formObj.f_cmd.value=MULTI01;
   		 		}else{
   		 			formObj.f_cmd.value=MULTI02;
   		 			ComEnableObject(form.btn_srep_search, false);
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
	 	        	// if spre_cd is empty(Create Mode), set country code into spre_cd field.
	 	        	if (formObj.srep_cd.value == "")
	 	        		formObj.srep_cd.value=formObj.cnt_cd.value;
	 	    		var sParam=FormQueryString(formObj);
	 	    		var sXml=sheetObj.GetSaveData("BCM_CCD_0033GS.do", sParam);
	 	    		var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
	 	    		if(sav == "S" ){					//Saved after a successful re-viewed
	 	    			if(formObj.creflag.value != "N" && formObj.rqst_no.value == ''){
	    					ComShowCodeMessage("CCD00031");
	    				} else {
	    					ComShowCodeMessage("COM130102", "Data");
	    				}
		        	}else{
		        		ComShowCodeMessage("COM132103", "Data");
		        	}
	 	    		var rqstNo=ComGetEtcData(sXml, "RQST_NO");
	 	    		if (rqstNo == "undefined"){
	 	    			rqstNo="";
	 	    		}
					ComSetObjValue(formObj.rqst_no, rqstNo);
	 	    		doActionIBSheet(sheetObj,formObj,SEARCH02);
	 	    		ComOpenWait(false);
	    		}
    		}
    		break;
    	case IBCLEAR:
    		formObj.reset();
    		formObj.rqst_no.value = "";
    		formObj.srep_cd.readOnly=false;		
    		formObj.ibflag.value = "I";
    		formObj.creflag.value = "Y";
    		sex_cd.SetSelectCode("");
    		ib_srep_flg.SetSelectCode("");
    		ob_srep_flg.SetSelectCode("");
    		delt_flg.SetSelectCode("N");
    		ComBtnEnable("btn_code_create");
    		formObj.srep_cd.className= "input1";
//    		formObj.srep_cd.style.backgroundColor="#d4f6ff";
    		ComEnableObject(form.btn_srep_search, true);
    		ComBtnEnable("btn_save"); 
//    		formObj.srep_cd.focus();
    		break;
    	case SEARCH03:				//Retrieve
		if (validateForm(sheetObj, formObj, sAction)) {
    		formObj.f_cmd.value=SEARCH03;
    		sheetObj.SetWaitImageVisible(0);
        	ComOpenWait(true);
    		var sParam=FormQueryString(formObj);
    		ComOpenWait(false);
    		var Xml=sheetObj.GetSearchData("BCM_CCD_0033GS.do", sParam);
    		var sav=ComGetEtcData(Xml, "TRANS_RESULT_KEY");
    		if(sav != "S" ){
        		return false;
    		}
    		if(ComGetEtcData(Xml, "result") == null || ComGetEtcData(Xml, "result") == ""){
    			formObj.cnt_cd.value="";
    			ComShowCodeMessage("COM130402", "SR Country");
    			return false;
    		}
    		ComSetNextFocus();
		}		
		break;
    	case SEARCH04:				//Retrieve
		if (validateForm(sheetObj, formObj, sAction)) {
    		formObj.f_cmd.value=SEARCH04;
    		sheetObj.SetWaitImageVisible(0);
    		var sParam=FormQueryString(formObj);
    		ComOpenWait(true);
    		var Xml=sheetObj.GetSearchData("BCM_CCD_0033GS.do", sParam);
    		ComOpenWait(false);
    		var sav=ComGetEtcData(Xml, "TRANS_RESULT_KEY");
    		if(sav != "S" ){
        		return false;
    		}
    		if(ComGetEtcData(Xml, "result") == null || ComGetEtcData(Xml, "result") == ""){
    			formObj.ofc_cd.value="";
    			ComShowCodeMessage("COM130402", "Office Code");
    			return false;
    		}
    		ComSetNextFocus();
    	}
		break;
    	case SEARCH05:				//create
//		if (validateForm(sheetObj, formObj, sAction)) {
//    		formObj.f_cmd.value = SEARCH05;
//    		
//    		sheetObj.WaitImageVisible=false;            	
//        	ComOpenWait(true);
//
//    		var sParam = FormQueryString(formObj);
//
//    		var Xml = sheetObj.GetSearchXml("BCM_CCD_0033GS.do", sParam);
//
//    		var sav = ComGetEtcData(Xml, "TRANS_RESULT_KEY");
//    		if(sav != "S" ){
//        		ComOpenWait(false);
//        		return;
//    		}
//    		if(ComGetEtcData(Xml, "result") != null || ComGetEtcData(Xml, "result") != ""){
//    			var max_seq = ComGetEtcData(Xml, "result");
//    			if(max_seq < 10){
//    				max_seq = "00" + max_seq;
//    			}else if(max_seq < 100){
//    				max_seq = "0" + max_seq;
//    			}
//    			formObj.srep_cd.value = "" + formObj.cnt_cd.value + max_seq;
    			formObj.reset();
    			formObj.rqst_no.value = "";
    			sex_cd.SetSelectCode("");
        		ib_srep_flg.SetSelectCode("");
        		ob_srep_flg.SetSelectCode("");
        		delt_flg.SetSelectCode("N");
    			formObj.ibflag.value="I";
    			formObj.creflag.value="Y";
    			ComEnableObject(formObj.srep_cd, false);
    			ComEnableObject(formObj.btn_srep_search, false);
    			formObj.srep_cd.readOnly=true;
    			ComBtnDisable("btn_code_create");
    			document.getElementById("cnt_cd").focus();
//    			ComOpenWait(false);
    			return;
//    		}
//    		ComOpenWait(false);
//		}		
		break;
    	case SEARCH20: // MDM AUTH_TP_CD query
    		var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=SREP';
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
    	return true;
    }
    /**
     * handling process for input validation
     */
    function validateForm(sheetObj, formObj, sAction) {
    	switch (sAction) {
    	case SEARCH02:
    		if( formObj.rqst_no.value == ''){
	    		if(formObj.srep_cd.value == "" || formObj.srep_cd.value == null){
	    			ComShowCodeMessage("CCD00001", "Sales Rep.");
	    			formObj.srep_cd.focus();
	    			return false;
	    		}
    		}
    		break;
    	case MULTI01:
//    		if(formObj.srep_cd.value == "" || formObj.srep_cd.value == null){
//    			ComShowCodeMessage("CCD00001", "Sales Rep.");
//    			formObj.srep_cd.focus();
//    			return false;
//    		}
    		if(formObj.cnt_cd.value == "" || formObj.cnt_cd.value == null){
    			ComShowCodeMessage("CCD00001", "SR Country");
    			formObj.cnt_cd.focus();
    			return false;
    		}
    		if(formObj.ofc_cd.value == "" || formObj.ofc_cd.value == null){
    			ComShowCodeMessage("CCD00001", "Office Code");
    			formObj.ofc_cd.focus();
    			return false;
    		}
    		if(formObj.srep_nm.value == "" || formObj.srep_nm.value == null){
    			ComShowCodeMessage("CCD00001", "Name");
    			formObj.srep_nm.focus();
    			return false;
    		}
    		if(formObj.empe_cd.value == "" || formObj.empe_cd.value == null){
    			ComShowCodeMessage("CCD00001", "Employee No");
    			formObj.empe_cd.focus();
    			return false;
    		}
    		if(formObj.srep_eml.value == "" || formObj.srep_eml.value == null){
    			ComShowCodeMessage("CCD00001", "Email");
    			formObj.srep_eml.focus();
    			return false;
    		}else if(!checkEmailValue(formObj.srep_eml)){
    			return false;
    		}
    		if(formObj.mphn_no.value == "" || formObj.mphn_no.value == null){
    			ComShowCodeMessage("CCD00001", "Mobile Number");
//    			formObj.mphn_no.focus();
    			return false;
    		}
    		break;
		case SEARCH05:
    		if(formObj.cnt_cd.value == "" || formObj.cnt_cd.value == null){
    			ComShowCodeMessage("CCD00001", "SR Country");
//    			formObj.cnt_cd.focus();
    			return false;
    		}
    		break;
    	}
    	return true;
    }
	function initControl() {
		var formObj=document.form;
		axon_event.addListenerForm('change', 'obj_change', formObj);
//		axon_event.addListenerForm('keypress', 'obj_keypress', formObj); 
 		axon_event.addListener('blur', 'isEmailAddr', 'srep_eml');
	}
   /**
   * HTML Object OnKeyUp event handling
   */
   function obj_keypress(event) {
      var obj=event.srcElement;
      keyValidation(obj);
   }
   /**
   * If the data field to be the change event
   */
   function obj_change(){
	   var formObj=document.form;
	   try {
		   var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
	       switch(srcName) {
	       	case "srep_cd":
	       		if(formObj.srep_cd.value.length>0){
	       			if (isdoActionIBSheetBeingProcessed)
	       				return true;
	       			if (doActionIBSheet(sheetObjects[0], formObj, SEARCH02)) {
	       				return true;
	       			}
	       			else {
//	       				formObj.srep_cd.focus();
	       				return false;
	       			}
	       		}
	       	break;
	       	case "cnt_cd":
	       		if(formObj.cnt_cd.value.length>0){
	       			if (doActionIBSheet(sheetObjects[0], formObj, SEARCH03)) {
	       				return true;
	       			}
	       			else {
//	       				formObj.cnt_cd.focus();
	       				return false;
	       			}
	       		}
	       	break;
	       	case "ofc_cd":
	       		if(formObj.ofc_cd.value.length>0){
	       			if (doActionIBSheet(sheetObjects[0], formObj, SEARCH04)) {
	       				return true;
	       			}
	       			else {
//	       				formObj.ofc_cd.focus();
	       				return false;
	       			}
	       		}
	       	break;
	       	case "delt_flg":
	     	   if( !ComShowConfirm(ComGetMsg("CCD00012")) ) {
	     		   comboObj.SetSelectCode('N',false);
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
	   return true;
   }
   function get_ofcCd(rowArray) {
		var sheetObj=sheetObjects[0];
	    var formObj=document.form;
	   	var colArray=rowArray[0];
		formObj.ofc_cd.value=colArray[3];
	}
   function get_cntCd(rowArray) {
		var sheetObj=sheetObjects[0];
	    var formObj=document.form;
	   	var colArray=rowArray[0];
		formObj.cnt_cd.value=colArray[3];
	}
    function get_srepCd(rowArray) {
		var sheetObj=sheetObjects[0];
	    var formObj=document.form;
	   	var colArray=rowArray[0];
		formObj.srep_cd.value=colArray[2];
		doActionIBSheet(sheetObjects[0],formObj,SEARCH02);
	}
    
	  function getValueForCombo(obj) {
		  if (Object.prototype.toString.call(obj) === '[object Array]') {
			  var str = obj[0];
			  if(str == undefined) return obj;
			  return str.split('|')[0];
		  }
		  return obj;
	  }
	     
	function isEmailAddr(event){
	    eventElement=ComGetEvent();
		if(eventElement.value.length > 0) {
			if(!ComIsEmailAddr(eventElement)) {
				ComShowCodeMessage("CCD00007");
				//eventElement.focus(); chrome54 infinite alert bug
			}
		}
	}