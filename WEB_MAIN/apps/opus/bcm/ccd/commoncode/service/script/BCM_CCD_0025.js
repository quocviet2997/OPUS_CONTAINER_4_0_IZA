/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0025.js
*@FileTitle  : activity
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/04
=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
    		   MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
     		   OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
    /**
     * @extends 
     * @class BCM_CCD_0025 : BCM_CCD_0025 on the screen for creating the script defines the task using.
     */
    function BCM_CCD_0025() {
    	this.processButtonClick=tprocessButtonClick;
    	this.setSheetObject=setSheetObject;
    	this.loadPage=loadPage;
    	this.initSheet=initSheet;
    	this.initControl=initControl;
    	this.doActionIBSheet=doActionIBSheet;
    	this.setTabObject=setTabObject;
    	this.validateForm=validateForm;
    }
/** Common global variable */
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
/** Event handler processing by button click event */
document.onclick=processButtonClick;
/** Event handler processing by button name */
    function processButtonClick(){
        var formObj=document.form;
        try {
            var srcName=ComGetEvent("name");
            switch(srcName) {
            case "btn_retrieve":
				doActionIBSheet(sheetObjects[0],formObj,SEARCH02);
				break;
            case "btn_new":
            	doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
            	break;
            case "btn_save":
            	doActionIBSheet(sheetObjects[0],formObj,MULTI01);
            	break;
			case "btns_search1":
			   	var formObj=document.form;
  			   	var sUrl="/opuscntr/COM_COM_0009.do?mdm_yn="+formObj.mdm_yn.value;			    
				ComOpenPopup(sUrl, 660, 440, 'getAct_Cd', "1,0,1,1,1", true);
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
        doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
        // auth_tp_cd retrieve
    	doActionIBSheet(sheetObjects[0], formObj, SEARCH01);
    	if(G_MDAA_CHK == 'Y') {
    		//ComEnableObject(formObj.delt_flg, true);
    		formObj.delt_flg.enable=true;
    		ComSetDisplay('btn_save',1);
    	} else {
    		//ComEnableObject(formObj.delt_flg, false);
    		formObj.delt_flg.enable=false;
    		ComSetDisplay('btn_save',0);
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
 	     		var sXml=sheetObj.GetSearchData("BCM_CCD_0025GS.do", "f_cmd=" + SEARCH01);
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
    	case SEARCH01: // MDM AUTH_TP_CD query
	    	var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=MDAA';
 	    	var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
	    	// global var setting
	    	G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
	    	G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
	    	break;
    	case SEARCH02:				//retrieve
    		if (validateForm(sheetObj, formObj, sAction)) {
	    		formObj.f_cmd.value=SEARCH02;
	    		sheetObj.SetWaitImageVisible(0);
	        	ComOpenWait(true);
	    		var sParam=FormQueryString(formObj);
 	    		var sXml=sheetObj.GetSearchData("BCM_CCD_0025GS.do", sParam);
	    		var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
	    		if(sav != "S" ){
	        		ComOpenWait(false);
	        		return;
	    		}
	    		if(ComXmlString(sXml, "delt_flg") == null || ComXmlString(sXml, "delt_flg") == ""){
	    			ComOpenWait(false);
       				// showing message when data not exists
	    			if (G_MDAA_CHK == "Y") {
       					if (ComShowCodeConfirm("COM130407", "Activity Code")) {
       		    			formObj.act_cd.readOnly=true;	
       		    			formObj.act_nm.focus();
       					} else {
       						doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
       					}
       				} else {
       					ComShowCodeMessage("COM130402", "Activity Code");
       					doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
       				}
	    			return;
	    		}
	    		formObj.ibflag.value="U";	
	    		formObj.act_nm.value=getValueForCombo(ComXmlString(sXml, "act_nm"));
	    		formObj.act_desc.value=getValueForCombo(ComXmlString(sXml, "act_desc"));
	    		act_tp_cd.SetSelectCode(getValueForCombo(ComXmlString(sXml, "act_tp_cd")));
	    		full_mty_cd.SetSelectCode(getValueForCombo(ComXmlString(sXml, "full_mty_cd")));
	    		bnd_vskd_seq_cd.SetSelectCode(getValueForCombo(ComXmlString(sXml, "bnd_vskd_seq_cd")));
	    		nod_tp_cd.SetSelectCode(getValueForCombo(ComXmlString(sXml, "nod_tp_cd")));
	    		act_op_tp_cd.SetSelectCode(getValueForCombo(ComXmlString(sXml, "act_op_tp_cd")));
	    		trsp_mod_cd.SetSelectCode(getValueForCombo(ComXmlString(sXml, "trsp_mod_cd")));
	    		org_dest_cd.SetSelectCode(getValueForCombo(ComXmlString(sXml, "org_dest_cd")));
	    		act_flg.SetSelectCode(getValueForCombo(ComXmlString(sXml, "act_flg")));
	    		formObj.act_stnd_edi_sts_cd.value=getValueForCombo(ComXmlString(sXml, "act_stnd_edi_sts_cd"));
	    		formObj.cop_skd_lgc_no.value=getValueForCombo(ComXmlString(sXml, "cop_skd_lgc_no"));
	    		//OnChange()를 발생시키지 않는다. 
	    		delt_flg.SetSelectCode(getValueForCombo(ComXmlString(sXml, "delt_flg")),false);
	    		formObj.cre_usr_id.value=getValueForCombo(ComXmlString(sXml, "cre_usr_id"));
	    		formObj.cre_dt.value=getValueForCombo(ComXmlString(sXml, "cre_dt"));
	    		formObj.upd_usr_id.value=getValueForCombo(ComXmlString(sXml, "upd_usr_id"));
	    		formObj.upd_dt.value=getValueForCombo(ComXmlString(sXml, "upd_dt"));
	    		ComOpenWait(false);
	    		act_tp_cd_OnChange();
	    		formObj.act_cd.readOnly=true;
    		}
    		break;
    	case MULTI01:				//save
    		if (validateForm(sheetObj, formObj, sAction)) {
	    		formObj.f_cmd.value=MULTI01;
	    		if(ComShowConfirm(ComGetMsg("COM130101", "Data"))){
		    		sheetObj.SetWaitImageVisible(0);
		        	ComOpenWait(true);
		    		var sParam=FormQueryString(formObj);
 		    		var sXml=sheetObj.GetSaveData("BCM_CCD_0025GS.do", sParam);
		    		var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
		    		if(sav == "S" ){					//Saved after a successful re-viewed
		    			ComShowCodeMessage("COM130102", "Data");
		    			doActionIBSheet(sheetObj,formObj,SEARCH02);
		        	}else{
		        		ComShowCodeMessage("COM130103", "Data");
		        	}
		    		ComOpenWait(false);
	    		}
    		}
    		break;
    	case IBCLEAR:
    		formObj.reset();
    		formObj.act_cd.readOnly = false;
    		formObj.ibflag.value = "I";
    		act_tp_cd.SetSelectCode("T");
    		full_mty_cd.SetSelectCode("");
			act_op_tp_cd.SetSelectCode("");
    		org_dest_cd.SetSelectCode("");
    		act_flg.SetSelectCode("Y");
    		delt_flg.SetSelectCode("N");
    		break;
    	}
    }

    /**
     * handling process for input validation
     */
    function validateForm(sheetObj, formObj, sAction) {
    	switch (sAction) {
    	case SEARCH02:
    		if(formObj.act_cd.value == "" || formObj.act_cd.value == null){
    			ComShowCodeMessage("CCD00001", "Activity Code");
    			formObj.act_cd.focus();
    			return false;
    		}
    		break;
    	case MULTI01:
    		
    		if(formObj.act_cd.value == "" || formObj.act_cd.value == null){
    			ComShowCodeMessage("CCD00001", "Activity Code");
    			formObj.act_cd.focus();
    			return false;
    		}
    		if(formObj.act_nm.value == "" || formObj.act_nm.value == null){
    			ComShowCodeMessage("CCD00001", "Name");
    			formObj.act_nm.focus();
    			return false;
    		}
//    		if(formObj.act_desc.value == "" || formObj.act_desc.value == null){
//    			ComShowCodeMessage("CCD00001", "Description");
//    			formObj.act_desc.focus();
//    			return false;
//    		}
    		if(act_tp_cd.GetSelectCode()== "T"){
    			if(formObj.full_mty_cd.value == "" || formObj.full_mty_cd.value == null){
    				ComShowCodeMessage("CCD00003", "Full/Empty");
        			return false;
    			}
    			if(formObj.bnd_vskd_seq_cd.value == "" || formObj.bnd_vskd_seq_cd.value == null){
    				ComShowCodeMessage("CCD00003", "BND / SKD Seq.");
        			return false;
    			}
    			if(formObj.nod_tp_cd.value == "" || formObj.nod_tp_cd.value == null){
    				ComShowCodeMessage("CCD00003", "Node Type");
    				return false;
    			}
    			if(formObj.act_op_tp_cd.value == "" || formObj.act_op_tp_cd.value== null){
    				ComShowCodeMessage("CCD00003", "Operation Type");
        			return false;
    			}
    			if(formObj.trsp_mod_cd.value == "" || formObj.trsp_mod_cd.value == null){
    				ComShowCodeMessage("CCD00003", "Trans. Mode");
        			return false;
    			}
    			if(formObj.org_dest_cd.value== "" || formObj.org_dest_cd.value== null){
    				ComShowCodeMessage("CCD00003", "ORG/DST");
        			return false;
    			}
    		}
    	}
    	return true;
    }
	/**
	 * Change the combo box based on combo box linked to enable / disable
	 */
    function act_tp_cd_OnChange(){
		var formObj=document.form;
		if(act_tp_cd.GetSelectCode()== "D"){
			full_mty_cd.SetSelectCode("");
			bnd_vskd_seq_cd.SetSelectCode("");
			nod_tp_cd.SetSelectCode("");
			act_op_tp_cd.SetSelectCode("");
			trsp_mod_cd.SetSelectCode("");
			org_dest_cd.SetSelectCode("");			
			full_mty_cd.SetEnable(false);//formObj.full_mty_cd.SetEnable=false;
			bnd_vskd_seq_cd.SetEnable(false);
			nod_tp_cd.SetEnable(false);			
			act_op_tp_cd.SetEnable(false);
			trsp_mod_cd.SetEnable(false);
			org_dest_cd.SetEnable(false);
		}else{			
			full_mty_cd.SetEnable(true);//formObj.full_mty_cd.SetEnable=true;
			bnd_vskd_seq_cd.SetEnable(true);
			nod_tp_cd.SetEnable(true);
			act_op_tp_cd.SetEnable(true);
			trsp_mod_cd.SetEnable(true);
			org_dest_cd.SetEnable(true);
		}
	}
    function delt_flg_OnChange(comboObj, oldindex, oldtext, oldcode, newindex, newtext, newcode){
    	if(comboObj.GetSelectCode()== "Y"){
    		if(!ComShowCodeConfirm("COM130301", "data")) comboObj.SetSelectCode("N",false);
    	}
	}
	function initControl() {
		var formObj=document.form;
		axon_event.addListenerForm('focus', 'obj_focus', form);
		axon_event.addListenerForm('change', 'obj_change', form); 		
		/*axon_event.addListenerForm('keypress', 'obj_keypress', form); 	
		axon_event.addListenerForm('keyup', 'obj_keyup', form); 		
		axon_event.addListenerForm('keydown', 'obj_keydown', form); 	
		axon_event.addListenerForm('keydown', 'ComKeyEnter', form);*/
		axon_event.addListenerForm("propertychange", "obj_propertychange", formObj);
	}
    /**
    * HTML Object  OnKeyUp event handling
    */
//   function obj_keypress(event) {
//     	obj=event.srcElement;
//     	keyValidation(obj);
//    }
    /**
     * If the data field to be the change Event
     */
    function obj_change(){
    	var formObj=document.form;
    	try {
    		var srcName=ComGetEvent("name");
            switch(srcName) {
            	case "act_cd":
            		if(formObj.act_cd.value.length>0){
            			doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
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
    function getAct_Cd(rowArray) {
	    var sheetObj=sheetObjects[0];
        var formObj=document.form;
   	    var colArray=rowArray[0];
	    formObj.act_cd.value=colArray[2];
	    doActionIBSheet(sheetObj, formObj, SEARCH02);
    }
	  function getValueForCombo(obj) {
		  if (Object.prototype.toString.call(obj) === '[object Array]') {
			  var str = obj[0];
			  return str.split('|')[0];
		  }
		  return obj;
	  }         
