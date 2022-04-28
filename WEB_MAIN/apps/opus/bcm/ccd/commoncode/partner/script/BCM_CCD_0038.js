/*=========================================================
** 1.0 Creation
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0038.js
*@FileTitle  :  activity
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/04
=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
			   MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
			   OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
    /**
     * @extends 
     * @class BCM_CCD_0038 : BCM_CCD_0038  BCM_CCD_0003 on the screen for creating the script defines the task using.
     */
    function BCM_CCD_0038() {
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
            case "btn_Create":
            	doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
	        	formObj.delt_flg.value="N";	        	
	        	formObj.ibflag.value="I";
	        	//formObj.cust_grp_id.readOnly=true;
	        	//formObj.cust_grp_id.style.backgroundColor="#bebebe";
	        	formObj.create_yn.value="Y";
	        	ComBtnDisable("btn_Create");
	        	// MDM 
	        	formObj.creflag.value="Y";
 			    formObj.saveflag.value="N";
	        	ComEnableObject(formObj.btn_com_com_0006, false);
				break;
            case "btn_Close":
            	ComClosePopup(); 
				break;
            case "btn_Retrieve":
            	if(formObj.rqst_no.value != '') {
            		doActionIBSheet(sheetObjects[0],formObj,SEARCH05);
            	}else{
            		doActionIBSheet(sheetObjects[0],formObj,SEARCH);
            	}
				break;
            case "btn_New":
            	doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
            	formObj.rqst_no.value="";
            	formObj.creflag.value="N";
 				formObj.saveflag.value="N";
            	break;
            case "btn_CheckDup":
            	var param="rqst_no=" + ComGetObjValue(formObj.rqst_no);
				param=param + "&" + "cust_grp_nm=" + form.cust_grp_nm.value;
				param=param + "&" + "ofc_cd=" + form.ofc_cd.value;
				ComOpenPopup('/opuscntr/BCM_CCD_1038.do?' + param, 880, 450, 'saveCustGrp', '1,0,1,1,1,1,1,1', true); 
				break;
            case "btn_Save":
            	if(formObj.create_yn.value == "Y"){
            		if(validateForm(sheetObjects[0], formObj, MULTI)){ 
						var param="";
						param= "cust_grp_nm=" + form.cust_grp_nm.value;
						param=param + "&" + "ofc_cd=" + form.ofc_cd.value;
						ComOpenPopup('/opuscntr/BCM_CCD_1038.do?' + param, 880, 450, 'saveCustGrp', '1,0,1,1,1,1,1,1', true);
            		}
            	}else{
                	doActionIBSheet(sheetObjects[0],formObj,MULTI);
            	}            	
            	break;
            case "btn_Request":
				doActionIBSheet(sheetObjects[0],formObj,MULTI03); 
				break;
            case "btn_com_ens_071":
				var param="";
	    		param=param + "&" + "ofc_cd=" + form.ofc_cd.value;
	    		ComOpenPopup('/opuscntr/COM_ENS_071.do?' + param, 780, 510, 'setCallBack0B1', '1,0,1,1,1,1,1,1', true);
				break;
			case "btn_com_ens_091":
				var param="";
	    		param=param + "&" + "srep_cd=" + form.srep_cd.value;
	    		ComOpenPopup('/opuscntr/COM_ENS_091.do?' + param, 780, 600, 'setCallBack0B2', '1,0,1,1,1,1,1,1', true);
				break;
			case "btn_com_com_0006":
				if(formObj.rqst_no.value == ""){
					if(formObj.create_yn.value != "Y"){
				    	var param="";						
		    		    param=param + "cust_grp_id=" + form.cust_grp_id.value+"&mdm_yn="+ form.mdm_yn.value;	    		
		    		    ComOpenPopup('/opuscntr/COM_COM_0006.do?' + param, 780, 430, 'setCustGrpId', '1,0,1,1,1,1,1,1', true);
					}
				}
				break;
			case "btn_com_com_0008":
				var param="";		    	
	    		param=param + "srep_cd=" + form.srep_cd.value;				
	    		ComOpenPopup('/opuscntr/COM_COM_0008.do?' + param, 770, 410, 'setSalesRep', '1,0,1,1,1,1', true);				
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
        //페이지 로드시 선처리 기능을 호출한다.
        var formObj=document.form;
        for(i=0;i<sheetObjects.length;i++){
            ComConfigSheet (sheetObjects[i] );
            initSheet(sheetObjects[i],i+1);
        }
        initControl();
        doActionIBCombo(sheetObjects[0],formObj,SEARCH01);
        doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
        // auth_tp_cd retrieve
		doActionIBSheet(sheetObjects[0], formObj, SEARCH01);
		// RQST_NO's MDM_DATA_PROCESS info retrieve (if needed)
		//doActionIBSheet(sheetObj, formObj, SEARCH13);
		var authTpCd=G_AHTU_TP_CD;
		var rqstNo=formObj.rqst_no.value;
		if(G_MDAA_CHK == 'Y')
			ComEnableObject(formObj.delt_flg, true); 
		else
			ComEnableObject(formObj.delt_flg, false); 
		// If the Process Status screen call, in the Detail PopUp
		if(rqstNo != '') {
			doActionIBSheet(sheetObjects[0], formObj, SEARCH05);
			ComSetDisplay('btn_Close', true);
			var procTpCd=formObj.proc_tp_cd.value;
			var custGrpId=formObj.cust_grp_id.value;
			var rqstUsrChk=formObj.rqst_usr_chk.value;
			ComEnableObject(formObj.btn_com_com_0006, false);
			// AuthType not Request, ProcessType is Open, 'CheckDup' button display
			if(authTpCd != 'R' && procTpCd == 'O') {
				ComSetDisplay('btn_CheckDup', true);
			}
			// Process Type is 'Reject' and AuthType is not 'Approval'(possible modifications and ReOpen)
			if(procTpCd == 'R' &&  ( ((authTpCd == 'R' || authTpCd == 'S') && rqstUsrChk == 'Y') || G_MDAA_CHK == 'Y') ) {
				ComSetDisplay('btn_Request', true);
				ComGetObject("btn_Request").style.setProperty("color", "#FF0000", "important");
				ComSetDisplay('btn_Retrieve', true);
				ComSetDisplay('btn_Save', true);
				doActionIBSheet(sheetObjects[0], formObj, SEARCH05);
			} else if(procTpCd == 'A') {
				doActionIBSheet(sheetObjects[0], formObj, SEARCH);
				formObj.create_yn.value="Y";
				ComEnableObject(formObj.btn_com_com_0006, false);
			} else {
				doActionIBSheet(sheetObjects[0], formObj, SEARCH05);
			}
		} else {
			ComSetDisplay('btn_Retrieve', true);
			// MDM Authority is not Approval('A') or MDDA
			if( authTpCd == 'R' || authTpCd == 'S' || G_MDAA_CHK == 'Y') {
				ComSetDisplay('btn_Create', true);
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
        	with (sheetObj) {
                //Setting Host information [mandatory][HostIp, Port, PagePath]
                //no support[check again]CLT if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);
        	}
        	break;
        }
    }
    /**
     * All the combo box query
     */
	function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
		switch (sAction) {
			case SEARCH01: // load page 시;
				var sXml=sheetObj.GetSearchData("BCM_CCD_0038GS.do", "f_cmd=" + SEARCH01);
	     		var arrXml=sXml.split("|$$|");
				if (arrXml.length > 0) 
					ComXml2ComboItem(arrXml[0], vbs_clss_cd, "cd", "cd|cd_desc");
				ComXml2ComboItem(arrXml[1], nbs_clss_cd1, "cd", "cd|cd_desc");
				ComXml2ComboItem(arrXml[2], nbs_clss_cd2, "cd", "cd|cd_desc");
				ComXml2ComboItem(arrXml[3], nbs_clss_cd3, "cd", "cd|cd_desc");
     		break;
     	}
	}
    // handling sheet process
    function doActionIBSheet(sheetObj,formObj,sAction) {
    	switch(sAction) {
    	case SEARCH:				//Retrieve
    		if (validateForm(sheetObj, formObj, sAction)) {
	    		formObj.f_cmd.value=SEARCH;
//	    		sheetObj.SetWaitImageVisible(0);
	    		sheetObj.WaitImageVisible=false;

	        	ComOpenWait(true);
	    		var sParam=FormQueryString(formObj);
	    		var sXml=sheetObj.GetSearchData("BCM_CCD_0038GS.do", sParam);
	    		var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
	    		if(sav == "F" ){
	        		ComOpenWait(false);
	        		return;
	    		}
	    		var cust_grp_nm=ComXmlString(sXml, "cust_grp_nm");
		        if(cust_grp_nm == ""){
		        	ComShowCodeMessage("COM130402", "Group Customer Code");
		        	doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
	            	formObj.creflag.value="N";
	 				formObj.saveflag.value="N";
		        }else{
		        	formObj.cust_grp_nm.value=cust_grp_nm;
		        	formObj.cust_grp_abbr_nm.value=ComXmlString(sXml, "cust_grp_abbr_nm");		        	
		        	formObj.ofc_cd.value=ComXmlString(sXml, "ofc_cd");
		    		formObj.srep_cd.value=ComXmlString(sXml, "srep_cd");
		    		formObj.cre_usr_id.value=ComXmlString(sXml, "cre_usr_id");
		    		formObj.cre_dt.value=ComXmlString(sXml, "cre_dt");
		    		formObj.upd_usr_id.value=ComXmlString(sXml, "upd_usr_id");
		    		formObj.upd_dt.value=ComXmlString(sXml, "upd_dt");
		    		
		    		vbs_clss_cd.SetSelectCode(ComXmlString(sXml, "vbs_clss_cd"));
		    		nbs_clss_cd1.SetSelectCode(ComXmlString(sXml, "nbs_clss_cd1"));
		    		nbs_clss_cd2.SetSelectCode(ComXmlString(sXml, "nbs_clss_cd2"));
		    		nbs_clss_cd3.SetSelectCode(ComXmlString(sXml, "nbs_clss_cd3"));
		    		
		    		formObj.delt_flg.value=ComXmlString(sXml, "delt_flg");
		        	formObj.ibflag.value="U";
		        }
	    		ComOpenWait(false);
    		}
    		break;
    	case SEARCH04:
    		formObj.f_cmd.value=SEARCH04;            
//    		sheetObj.SetWaitImageVisible(0);
    		sheetObj.WaitImageVisible=false;

        	ComOpenWait(true);
//    		var sParam = FormQueryString(formObj);
//    		
//    		var sXml = sheetObj.GetSearchXml("BCM_CCD_0038GS.do", sParam);
//    		var sav = ComGetEtcData(sXml, "TRANS_RESULT_KEY");
//    		if(sav == "F" ){
//        		ComOpenWait(false);
//        		return;
//    		}
//    	    
//    		var cust_grp_id = ComXmlString(sXml, "cust_grp_id");
//	        if(cust_grp_id == ""){
//	        	formObj.cust_grp_id.value = "";
//	        	formObj.delt_flg.value = "N";
//	       		formObj.ibflag.value = "I";
//	        }else{
	        	formObj.delt_flg.value="N";	        	
	        	formObj.ibflag.value="I";
	        	//formObj.cust_grp_id.readOnly=true;
	        	formObj.create_yn.value="Y";
	        	ComBtnDisable("btn_Create");
	        	doActionIBSheet(sheetObjects[0],formObj,MULTI);
//	        }
    		ComOpenWait(false);    		
    		break;
    	case MULTI:				//save
	    	if (validateForm(sheetObj, formObj, sAction)) {
	    		if( formObj.creflag.value == "N" && formObj.rqst_no.value == ''){
		    		if (!ComShowCodeConfirm("COM130101", "Data")) {
					    return false;
					}
		    		formObj.f_cmd.value=MULTI;
//		    		sheetObj.SetWaitImageVisible(0);
		    		sheetObj.WaitImageVisible=false;

		        	ComOpenWait(true);
		    		var sParam=FormQueryString(formObj);
		    		var sXml=sheetObj.GetSearchData("BCM_CCD_0038GS.do", sParam);
		    		var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
		     	    if(sav == "S"  ){
		     		  ComShowCodeMessage("COM130102", "Data");
		     		  doActionIBSheet(sheetObjects[0], document.form, SEARCH);
		       	    }else{
		        		ComShowCodeMessage("COM132103", "Data");
		        	}	    	
		           formObj.create_yn.value="N";
		 		   ComBtnEnable("btn_Create");
	    		} else {
					formObj.f_cmd.value=MULTI01;
//					sheetObj.SetWaitImageVisible(0);
					sheetObj.WaitImageVisible=false;

					ComOpenWait(true);
					//formObj.cust_grp_id.value="G-"
					var sParam=FormQueryString(formObj);
					formObj.cust_grp_id.value='';
					var sXml=sheetObj.GetSearchData("BCM_CCD_0038GS.do", sParam);
					var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
					if(sav == "S"  ){
						if(formObj.rqst_no.value == ''){
							ComShowCodeMessage("CCD00031");
						} else {
							ComShowCodeMessage("COM130102", "Data");
						}
						var rqstNo=ComGetEtcData(sXml, "RQST_NO");
						ComSetObjValue(formObj.rqst_no, rqstNo);
						doActionIBSheet(sheetObj, formObj, SEARCH05);
					}else{
						ComShowCodeMessage("COM132103", "Data");
					}	    	
					formObj.create_yn.value="N";
					ComBtnEnable("btn_Create");					
	    		}
			}
	    	
    		break;
    	case MULTI03:	// Request
			if (!ComShowCodeConfirm("CCD00030")) {
			    return;
			}
			var sParam='f_cmd=' + MULTI03 + '&rqst_no=' + ComGetObjValue(formObj.rqst_no) + '&proc_tp_cd=O';
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
    	case IBCLEAR:
		   formObj.ibflag.value="I";	
		   ComClearObject(formObj.cust_grp_id);
 		   ComClearObject(formObj.cust_grp_nm);
 		   ComClearObject(formObj.cust_grp_abbr_nm);
 		   ComClearObject(formObj.ofc_cd);
 		   ComClearObject(formObj.srep_cd);
 		   vbs_clss_cd.value="";
 		   nbs_clss_cd1.value="";
 		   nbs_clss_cd2.value="";
 		   nbs_clss_cd3.value="";
 		   formObj.cust_grp_abbr_nm.text="";     		   
 		   ComClearObject(formObj.delt_flg);
 		   formObj.cust_grp_id.style.backgroundColor="#d4f6ff";//"#cdffff";
 		   formObj.cust_grp_id.readOnly=false;
           formObj.create_yn.value="N";
           formObj.cre_usr_id.value="";
           formObj.cre_dt.value="";
           formObj.upd_usr_id.value="";
           formObj.upd_dt.value="";
 		   ComBtnEnable("btn_Create");
 		   ComEnableObject(formObj.btn_com_com_0006, true);
    		break;
    	case SEARCH02:      //Control Office Code check
			if(validateForm(sheetObj,formObj,sAction)){
				ComOpenWait(true);
				formObj.f_cmd.value=SEARCH02;
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("BCM_CCD_0038GS.do", sParam);
		        var result=ComGetEtcData(sXml, "result");
		        if(result==""){
		        	ComShowCodeMessage("COM130402", "Control Office Code");
		        	formObj.ofc_cd.value="";
		        	document.form.ofc_cd.focus();
		        }else{
		        	document.form.srep_cd.focus();
		        }
				ComOpenWait(false);
			}
			break;
    	case SEARCH03:      //Sales Rep. Code check
			if(validateForm(sheetObj,formObj,sAction)){
				ComOpenWait(true);
				formObj.f_cmd.value=SEARCH03;
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("BCM_CCD_0038GS.do", sParam);
		        var result=ComGetEtcData(sXml, "result");
		        if(result==""){
		        	ComShowCodeMessage("COM130402", "Sales Rep. Code");
		        	formObj.srep_cd.value="";
		        	formObj.srep_cd.focus();
		        }
				ComOpenWait(false);
			}
			break;
    	case SEARCH05:				//Retrieve
			if (validateForm(sheetObj, formObj, sAction)) {
	    		formObj.f_cmd.value=SEARCH05;
	//    		sheetObj.SetWaitImageVisible(0);
	    		sheetObj.WaitImageVisible=false;
	
	        	ComOpenWait(true);
	    		var sParam=FormQueryString(formObj);
	    		var sXml=sheetObj.GetSearchData("BCM_CCD_0038GS.do", sParam);
	    		var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
	    		if(sav == "F" ){
	        		ComOpenWait(false);
	        		return;
	    		}
	    		var rqst_no=ComXmlString(sXml, "rqst_no");
		        if(rqst_no == ""){
		        	formObj.cust_grp_nm.value="";
		        	formObj.delt_flg.value="N";
		       		formObj.ibflag.value="I";
		        }else{
		        	formObj.cust_grp_id.readOnly=true;
		        	formObj.cust_grp_id.style.backgroundColor="#bebebe";
		        	//if(formObj.proc_tp_cd.value == 'A'){
		        		formObj.cust_grp_id.value=ComXmlString(sXml, "cust_grp_id");
		        	//}else{
		        	//	formObj.cust_grp_id.value='';
		        	//}
		        	formObj.cust_grp_nm.value=ComXmlString(sXml, "cust_grp_nm");
		        	formObj.cust_grp_abbr_nm.value=ComXmlString(sXml, "cust_grp_abbr_nm");		        	
		        	formObj.ofc_cd.value=ComXmlString(sXml, "ofc_cd");
		    		formObj.srep_cd.value=ComXmlString(sXml, "srep_cd");
		    		vbs_clss_cd.SetSelectText=ComXmlString(sXml, "vbs_clss_cd");
		    		nbs_clss_cd1.value=ComXmlString(sXml, "nbs_clss_cd1");
		    		nbs_clss_cd2.value=ComXmlString(sXml, "nbs_clss_cd2");
		    		nbs_clss_cd3.value=ComXmlString(sXml, "nbs_clss_cd3");
		    		formObj.delt_flg.value=ComXmlString(sXml, "delt_flg");
		        	formObj.ibflag.value="U";
		        }
	    		ComOpenWait(false);
			}
		    break;
    	case SEARCH01: // MDM AUTH_TP_CD query
			var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=GCST';
			var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
			// global var sestting
			G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
			G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
			break;
			
    	case SEARCH06: // duplicate customer group code retrieve query
    		//formObj.f_cmd.value=SEARCH;
    		formObj.f_cmd.value=SEARCH07;
    		sheetObj.WaitImageVisible=false;

        	ComOpenWait(true);

        	var sParam=FormQueryString(formObj);
    		var sXml=sheetObj.GetSearchData("BCM_CCD_0038GS.do", sParam);
    		// 2017.08.29.Customer Code Validation Logic 추가(Start)
    		
            if(ComXmlString(sXml, "cust_grp_nm").length == 0 && ComXmlString(sXml, "cust_grp_id").length == 0) {
            	ComShowCodeMessage("CCD00061"); //Incorrect format Code
            	formObj.cust_grp_id.value='';
            	ComOpenWait(false);
            	break;
            }else if(ComXmlString(sXml, "cust_grp_nm").length > 0 && ComXmlString(sXml, "cust_grp_id").length > 0) {
            	ComShowCodeMessage("COM131301", "Group Customer Code"); 
	        	formObj.cust_grp_id.value='';
	        	ComOpenWait(false);
	        	break;
            }
            
            checkToBeCustomer();
    		//if(ComXmlString(sXml, "cust_grp_nm").length == '' && ComXmlString(sXml, "cust_grp_id").length > 0)
    		// CUST_GRP_NM = 0 && CUST_GRP_ID > 0 THEN CREATION
    		// CUST_GRP_NM > 0 && CUST_GRP_ID > 0 THEN DUPLICATION
    		// CUST_GRP_NM = 0 && CUST_GRP_ID = 0 THEN RESET

    		// 2017.08.29.End
    		
//            if(ComXmlString(sXml, "cust_grp_nm").length > 0){ // duplicated code exist
//	        	ComShowCodeMessage("COM131301", "Group Customer Code"); 
//	        	formObj.cust_grp_id.value='';
//            }
    		        	
    		ComOpenWait(false);
    		break;
    	}
    }
    /**
     * handling process for input validation
     */
    function validateForm(sheetObj, formObj, sAction) {
    	switch (sAction) {
    	case SEARCH:
    		if(formObj.cust_grp_id.value == "" || formObj.cust_grp_id.value == null){
    			ComShowCodeMessage("CCD00001", "Group Customer Code");
    			return false;
    		}
    		break;
    	case MULTI:
    		if( formObj.creflag.value == "N" && formObj.rqst_no.value == ''){
	    		if(formObj.create_yn.value != "Y"){
		    		if(formObj.cust_grp_id.value == "" || formObj.cust_grp_id.value == null){
		    			ComShowCodeMessage("CCD00001", "Group Customer Code");
		    			return false;
		    		}
	    		}
    		}else{
    			if(formObj.cust_grp_id.value == "" || formObj.cust_grp_id.value == null){
	    			ComShowCodeMessage("CCD00001", "Group Customer Code");
	    			return false;
	    		}
    		}
    		if(formObj.cust_grp_nm.value == "" || formObj.cust_grp_nm.value == null){
    			ComShowCodeMessage("CCD00001", "Group Name");
    			return false;
    		}
//    		if(formObj.cust_grp_abbr_nm.value == "" || formObj.cust_grp_abbr_nm.value == null){
//    			ComShowCodeMessage("CCD00001", "Abbreviation");
//    			return false;
//    		}      		
    		if(formObj.ofc_cd.value == "" || formObj.ofc_cd.value == null){
    			ComShowCodeMessage("CCD00001", "Control Office");
    			return false;
    		}
    		if(formObj.srep_cd.value == "" || formObj.srep_cd.value == null){
    			ComShowCodeMessage("CCD00001", "Sales Rep.");
    			return false;
    		}
    		if(formObj.cust_grp_id.value.substring(0, 2) != "G-") { // 2017.08.24. group code가 G-로 시작하지 않으면
    			ComShowCodeMessage("CCD00060");
    			return false;
    		}
    		break;
    	}   	     
    	return true;
    }
	//===================================================================================
		//UI Object Event Handler
		// ===================================================================================
		/**
		 * Read from Carrier Code Pop-up. <br>
		 */ 
		function setCallBack0B1(aryPopupData) {
			var form=document.form;
			form.ofc_cd.value=aryPopupData[0][3];
		} 
		/**
		 * Read from  Carrier Code Popup. <br>
		 */ 
		function setCallBack0B2(aryPopupData) {
			var form=document.form;
			form.srep_cd.value=aryPopupData[0][4];
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
		  ComClearSeparator (document.form.cust_grp_id,"eng"); //English Only
		  ComClearSeparator (document.form.cust_grp_nm,"eng"); //English Only
		  ComClearSeparator (document.form.ofc_cd,"eng"); //English Only
		  ComClearSeparator (document.form.srep_cd,"eng"); //English Only
	}
//	  function obj_keypress() {
//		 	obj=event.srcElement;	 
//		 	keyValidation(obj);  		 	
//	 } 
//	    function obj_focus() {
//	      	if(event.srcElement.options){
//	      		event.srcElement.focus();
//	      	}else{
//	      		event.srcElement.select();
//	      	}
//	      }
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
	            	case "cust_grp_id":
	            		if(formObject.creflag.value == "N" && formObject.cust_grp_id.value.length>0){  // 기존 Group Code 조회
	            			doActionIBSheet(sheetObject1, formObject, SEARCH);
	            		} else if(formObject.creflag.value == "Y" && formObject.cust_grp_id.value.length>0){ // Group Code 생성시 로직
	            			doActionIBSheet(sheetObject1, formObject, SEARCH06);
	            		}
	            	break;
	            	case "ofc_cd":
	            		if(formObject.ofc_cd.value.length>0){
	            			doActionIBSheet(sheetObject1, formObject, SEARCH02);
	            		}
	            	break;
	            	case "srep_cd":
	            		if(formObject.srep_cd.value.length>0){
	            			doActionIBSheet(sheetObject1, formObject, SEARCH03);
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
	    }
	    function setCustGrpId(rowArray){
			var sheetObj=sheetObjects[0];
		    var formObj=document.form;
		   	var colArray=rowArray[0];
			formObj.cust_grp_id.value=colArray[2];	
    		if(formObj.cust_grp_id.value.length>0){	
    			doActionIBSheet(sheetObj, formObj, SEARCH);
    		}
	    }
	    function setSalesRep(rowArray){	    	
			var sheetObj=sheetObjects[0];
		    var formObj=document.form;
		   	var colArray=rowArray[0];
		   	formObj.srep_cd.value=colArray[2];			
    		if(formObj.srep_cd.value.length>0){
    			doActionIBSheet(sheetObj, formObj, SEARCH03);
    		}
	    }
	    function saveCustGrp(){
	    	var formObj=document.form;
	    	doActionIBSheet(sheetObjects[0],formObj,SEARCH04);
	    }
	    
	    /**
	      * To be Customer Check <br>
	      * <br><b>Example :</b>
	      * <pre>
	      *    checkToBeCustomer();
	      * </pre>
	      * @param {ibsheet} sheetObj Mandatory HTMLtag(Object) Object
	      * @param {int} Row mandatory Onclick ,Cell's Row Index
	      * @return void
	      * @author Sungkil Hyun
	      * @version 2018.10.31
	      */ 
	     function checkToBeCustomer(){
	    	   var formObj=document.form;
	           var custGrpId = formObj.cust_grp_id.value;
	           var cust_cnt_cd = custGrpId.substr(2,2);
	           var cust_seq = custGrpId.substr(4,6);
	            if(cust_cnt_cd != "" && cust_seq !="" ){
	                var sParam="f_cmd="+SEARCH25+"&etc1="+cust_cnt_cd+"&etc2="+cust_seq;        
	                var sXml=sheetObjects[0].GetSearchData("PRICommonGS.do", sParam);
	                var tobeCust = ComGetEtcData(sXml,"tobe");
	                if(tobeCust != "N" && tobeCust != "" ){
	                	ComShowCodeMessage('CCD00074', tobeCust ,cust_cnt_cd+cust_seq);
	            		formObj.cust_grp_id.value='';
	                }
	            }
	       }
