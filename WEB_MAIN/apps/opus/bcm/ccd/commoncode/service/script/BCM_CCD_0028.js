/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0028.js
*@FileTitle  : Vessel service lane
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
     * @class BCM_CCD_0028 : BCM_CCD_0028 on the screen for creating the script defines the task using.
     */

    /** Common global variable */
    var sheetObjects=new Array();
    var sheetCnt=0;
    var comboObjects=new Array();
    var comboCnt=0;
    var prefix="sheet1_";
    /** Event handler processing by button click event */
    document.onclick=processButtonClick;
    /** Event handler processing by button name */
    function processButtonClick(){
        var formObj=document.form;
        try {
            var srcName=ComGetEvent("name");
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
            case "btn_row_add":
            	addRow();
            	break;
            case "btn_row_delete":
            	deleteRow();
            	break;
            case "btn_Calendar1":
				var cal=new ComCalendar();
				cal.select(formObj.st_eff_dt, 'yyyy-MM-dd');
            	break;
            case "btn_Calendar2":
				var cal=new ComCalendar();
				cal.select(formObj.end_eff_dt, 'yyyy-MM-dd');
            	break;
            case "btns_search1":
            	if(ComGetEvent().style.cursor == "default") return;
		      	var formObj=document.form;
		      	var sUrl="/opuscntr/COM_ENS_081.do?mdm_yn="+formObj.mdm_yn.value+"&vsl_slan_cd=" + formObj.vsl_slan_cd.value + "&main_page=" + "false";
 		        var rVal=ComOpenPopup(sUrl, 770, 420, "vslSlanCodeHelp", "1,0,1,1,1,1,1,1", true);
				break;
            case "btns_search2":
            	if(ComGetEvent().style.cursor == "default") return;
            	var formObj=document.form;
 		        var sUrl="/opuscntr/COM_COM_0012.do?code=" + formObj.modi_cost_ctr_cd.value + "&main_page=" + "false"+ "&mdm_yn=" + "Y";
 		        var rVal=ComOpenPopup(sUrl, 790, 430, "get_trdCd", "1,0,1", true);
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
            ComConfigSheet (sheetObjects[i]);
            initSheet(sheetObjects[i],i+1);
            ComEndConfigSheet(sheetObjects[i]);
        }
        initControl();
        doActionIBCombo(sheetObjects[0], formObj, SEARCH01);
//        doActionIBSheet(sheetObjects[0], formObj, IBCLEAR);
        vsl_tp_cd.SetSelectCode("C");
        // 2014.12.04 set Company Code disabled
        //co_cd.SetSelectCode("H");
        //co_cd.SetEnable(false);

		delt_flg.SetSelectCode("N");
		formObj.edi_if_flg.value = "N";
    	// auth_tp_cd retrieve
    	doActionIBSheet(sheetObjects[0], formObj, SEARCH10);
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
    		ComEnableObject(formObj.btns_search1, false);
    		// Process Type is 'Reject' and AuthType is not 'Approval'(possible modifications and ReOpen)
    		if(procTpCd == 'R' &&  ( ((authTpCd == 'R' || authTpCd == 'S') && rqstUsrChk == 'Y') || G_MDAA_CHK == 'Y') ) {
    			ComSetDisplay('btn_Request', true);
    			ComGetObject("btn_Request").style.setProperty("color", "#FF0000", "important");
    			ComSetDisplay('btn_Retrieve', true);
    			ComSetDisplay('btn_Save', true);
    			doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
    		} else if(procTpCd == 'A') {
    			doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
    			ComEnableObject(formObj.btns_search1, false);
    			ComSetDisplay('btn_Retrieve', false);
    			ComSetDisplay('btn_Save', false);
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
        with(sheetObj){
	          var HeadTitle="|Del.|Vessel Service Lane Direction|VIP Dir Code|Vessel Service Lane Direction Sequence|Delete Flag|Create User|Create Date/Time|Last Update User|Last Update Date/Time|modi_vsl_slan_cd|nyk_lgcy_slan_cd_ctnt|mol_lgcy_slan_cd_ctnt|kline_lgcy_slan_cd_ctnt";

	          SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:0 } );

	          var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	          var headers = [ { Text:HeadTitle, Align:"Center"} ];
	          InitHeaders(headers, info);

	          var cols = [ {Type:"Status",    Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
	                 {Type:"DummyCheck", Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"del_chk",          KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Combo",     Hidden:0, Width:300,  Align:"Center",  ColMerge:0,   SaveName:prefix+"vsl_slan_dir_cd",  KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
//	                 {Type:"Combo",      Hidden:0,  Width:80,  Align:"Center",  ColMerge:0,   SaveName:prefix+"modi_vsl_slan_dir_cd", KeyField:1,   CalcLogic:"",   Format:"", PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:2 },
	                 {Type:"Combo",      Hidden:1,  Width:80,  Align:"Center",  ColMerge:0,   SaveName:prefix+"modi_vsl_slan_dir_cd", KeyField:0,   CalcLogic:"",   Format:"", PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:2 },
	                 {Type:"Int",       Hidden:0,  Width:300,  Align:"Center",  ColMerge:0,   SaveName:prefix+"vsl_slan_dir_seq", KeyField:1,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 },
	                 {Type:"Combo",     Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"dir_delt_flg",     KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Text",      Hidden:0,  Width:80,  Align:"Center",    ColMerge:1,   SaveName:prefix+"cre_usr_id",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
                     {Type:"Date",      Hidden:0,  Width:150,  Align:"Center",    ColMerge:1,   SaveName:prefix+"cre_dt",  KeyField:0,   CalcLogic:"",   Format:"YmdHms",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",    ColMerge:1,   SaveName:prefix+"upd_usr_id",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
                     {Type:"Date",      Hidden:0,  Width:150,  Align:"Center",    ColMerge:1,   SaveName:prefix+"upd_dt",  KeyField:0,   CalcLogic:"",   Format:"YmdHms",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
	                 {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
              		 {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"modi_vsl_slan_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },  
              		 {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"nyk_lgcy_slan_cd_ctnt", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 }, 
              		 {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"mol_lgcy_slan_cd_ctnt", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 }, 
              		 {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"kline_lgcy_slan_cd_ctnt", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } 	                 
	                 ];

	          InitColumns(cols);
	          SetColProperty(0 ,prefix+"modi_vsl_slan_dir_cd" , {AcceptKeys:"E|[0123456789]" , InputCaseSensitive:1});
	          SetEditable(1);
	          SetSheetHeight(375);
          }
    }
    /**
     * All the combo box query
     */
    	function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
    		switch (sAction) {
    			case SEARCH01: // load page
    				var sXml=sheetObj.GetSearchData("BCM_CCD_0028GS.do", "f_cmd=" + SEARCH01);
					var rtnValue=sXml.split("|$$|");
					// 2015.01.14 rtnValue legnth is not equal combo objects count
					var comboIndex = 0;
					for(var i=0; i < rtnValue.length; i++){
						if(i==3) { // Company Code
							formObj.co_cd.value=getValueForCombo(ComXmlString(rtnValue[i], "cd"));
							formObj.co_nm.value=getValueForCombo(ComXmlString(rtnValue[i], "cd_desc"));
							continue;
						}

						var comboXml=ComXml2ComboString(rtnValue[i], "cd_desc", "cd");
						var cdName=comboXml[0].split("|");
						var cdValue=comboXml[1].split("|");
						for (var j=0; j < cdName.length; j++) {
							if(i < 5){
								comboObjects[comboIndex].InsertItem(j, cdName[j], cdValue[j]);
							}
			        	}
						if(i == 5){
							sheetObj.SetColProperty(prefix+"vsl_slan_dir_cd", {ComboText:"|"+comboXml[0], ComboCode:"|"+comboXml[1]} );
						}else if(i == 6){
							sheetObj.SetColProperty(prefix+"dir_delt_flg", {ComboText:"|"+comboXml[0], ComboCode:"|"+comboXml[1]} );
						}else if(i == 7){
							sheetObj.SetColProperty(prefix+"modi_vsl_slan_dir_cd", {ComboText:"|"+comboXml[0], ComboCode:"|"+comboXml[1]} );
						}
						comboIndex ++;
					}
         		break;
         	}
    	}
    // handling sheet process
    function doActionIBSheet(sheetObj,formObj,sAction) {
    	switch(sAction) {
    	case SEARCH02:				//Retrieve
    		if (validateForm(sheetObj, formObj, sAction)) {
    			if( formObj.rqst_no.value == ''){
    				formObj.f_cmd.value=SEARCH02;
    	 		}else{
    	 			formObj.f_cmd.value=SEARCH05;
    	 		}
	    		sheetObj.SetWaitImageVisible(0);
	        	ComOpenWait(true);
	        	sheetObj.RemoveAll();
	        	sheetObj.RemoveEtcData();
	    		var sParam=FormQueryString(formObj);
	    		var prefixArr=new Array("", prefix);
	    		var sXml=sheetObj.GetSearchData("BCM_CCD_0028GS.do", sParam
	    				+ "&" + ComGetPrefixParam(prefixArr));
	    		var rtnValue=sXml.split("|$$|");
	    		var sav=ComGetEtcData(rtnValue[0], "TRANS_RESULT_KEY");
	    		var rqstNo=ComGetEtcData(rtnValue[0], "RQST_NO");
	    		if (rqstNo == "undefined"){
 	    			rqstNo="";
 	    		}
				ComSetObjValue(formObj.rqst_no, rqstNo);
	    		if(sav != "S" ){
	        		ComOpenWait(false);
	        		return;
	    		}
	    		if(ComXmlString(rtnValue[0], "delt_flg") == null || ComXmlString(rtnValue[0], "delt_flg") == ""){
	    			ComOpenWait(false);
	    			formObj.creflag.value="Y";
	    			formObj.vsl_slan_cd.readOnly=true;
	    			ComBtnEnable("btn_row_add");
    	    		ComBtnEnable("btn_row_delete");
    	    		formObj.vsl_slan_nm.focus();
    	    		if(G_AHTU_TP_CD=="A"){
        	    		ComShowCodeMessage("CCD00034", "Vessel Service Lane Code");
        	    		doActionIBSheet(sheetObj, formObj, IBCLEAR);
        	    	}else{
        	    		if(!ComShowConfirm(ComGetMsg("CCD00034", "Vessel Service Lane Code"))){
        	    			doActionIBSheet(sheetObj, formObj, IBCLEAR);
        	    		}
        	    	}
	    			return;
	    		}else{
	    			formObj.creflag.value="N";
	    		}
	    		formObj.add_flg.value="U";
	    		formObj.vsl_slan_cd.value=getValueForCombo(ComXmlString(rtnValue[0], "vsl_slan_cd"));
	    		formObj.vsl_slan_nm.value=getValueForCombo(ComXmlString(rtnValue[0], "vsl_slan_nm"));
	    		vsl_tp_cd.SetSelectCode(getValueForCombo(ComXmlString(rtnValue[0], "vsl_tp_cd")));
	    		vsl_svc_tp_cd.SetSelectCode(getValueForCombo(ComXmlString(rtnValue[0], "vsl_svc_tp_cd")));
	    		fdr_div_cd.SetSelectCode(getValueForCombo(ComXmlString(rtnValue[0], "fdr_div_cd")));
	    		formObj.st_eff_dt.value=getValueForCombo(ComXmlString(rtnValue[0], "st_eff_dt"));
	    		formObj.end_eff_dt.value=getValueForCombo(ComXmlString(rtnValue[0], "end_eff_dt"));
	    		//co_cd.SetSelectCode(getValueForCombo(ComXmlString(rtnValue[0], "co_cd")));
	    		delt_flg.SetSelectCode(getValueForCombo(ComXmlString(rtnValue[0], "delt_flg")),false);
	    		formObj.modi_vsl_slan_cd.value=ComXmlString(rtnValue[0], "modi_vsl_slan_cd");
	    		formObj.old_modi_vsl_slan_cd.value=ComXmlString(rtnValue[0], "modi_vsl_slan_cd");
	    		formObj.modi_cost_ctr_cd.value=getValueForCombo(ComXmlString(rtnValue[0], "modi_cost_ctr_cd"));
	    		formObj.modi_vsl_slan_cd2.value=ComXmlString(rtnValue[0], "modi_vsl_slan_cd2");
	    		formObj.modi_vip_team_cd.value=ComXmlString(rtnValue[0], "modi_vip_team_cd");
	    		formObj.cre_usr_id.value=ComXmlString(rtnValue[0], "cre_usr_id");
	    		formObj.cre_dt.value=ComXmlString(rtnValue[0], "cre_dt");
	    		formObj.upd_usr_id.value=ComXmlString(rtnValue[0], "upd_usr_id");
	    		formObj.upd_dt.value=ComXmlString(rtnValue[0], "upd_dt");
	    		formObj.nyk_lgcy_slan_cd_ctnt.value=ComXmlString(rtnValue[0], "nyk_lgcy_slan_cd_ctnt");
	    		formObj.mol_lgcy_slan_cd_ctnt.value=ComXmlString(rtnValue[0], "mol_lgcy_slan_cd_ctnt");
	    		formObj.kline_lgcy_slan_cd_ctnt.value=ComXmlString(rtnValue[0], "kline_lgcy_slan_cd_ctnt");
	    		
	    		
	    		sheetObj.LoadSearchData(rtnValue[1],{Sync:1} );
	    		ComOpenWait(false);
	    		formObj.vsl_slan_cd.readOnly=true;
	    		ComBtnEnable("btn_row_add");
	    		ComBtnEnable("btn_row_delete");
    		}
    		break;
    	case MULTI01:				//save
    		if (validateForm(sheetObj, formObj, sAction)) {
    			if( formObj.creflag.value == "N" && formObj.rqst_no.value == ''){
    				formObj.f_cmd.value=MULTI01;
    	 		}else{
    	 			formObj.f_cmd.value=MULTI02;
    	 			ComEnableObject(formObj.btns_search1, false);
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
		    		sParam += "&" + sheetObj.GetSaveString(false, true, prefix+"ibflag");
		    		var sXml=sheetObj.GetSaveData("BCM_CCD_0028GS.do", sParam);
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
					ComSetObjValue(formObj.rqst_no, rqstNo);
					doActionIBSheet(sheetObjects[0],formObj,SEARCH02);
		    		ComOpenWait(false);
	    		}
    		}
    		break;
    	case IBCLEAR:
    		formObj.reset();
    		formObj.rqst_no.value = "";
    		formObj.co_cd.value = "H";
//    		formObj.co_nm.value = "NYK";
    		formObj.vsl_slan_cd.readOnly=false;
    		vsl_tp_cd.SetSelectCode("C");
    		delt_flg.SetSelectCode("N");
    		formObj.vsl_svc_tp_cd.text="";
    		formObj.fdr_div_cd.text="";
    		formObj.old_modi_vsl_slan_cd.value = "";
    		formObj.edi_if_flg.value = "N";
    		//co_cd.SetSelectCode("H");
    		sheetObj.RemoveAll();
        	sheetObj.RemoveEtcData();
    		ComBtnDisable("btn_row_add");
            ComBtnDisable("btn_row_delete");
            ComEnableObject(formObj.btns_search1, true);
    		formObj.add_flg.value="I";
    		break;
    	case SEARCH10: // MDM AUTH_TP_CD query
			var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=SCVL';
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
    	case SEARCH03: //query
			formObj.f_cmd.value=SEARCH02;
    		sheetObj.SetWaitImageVisible(0);
        	ComOpenWait(true);
    		var sParam=FormQueryString(formObj);
    		var sXml=sheetObj.GetSearchData("BCM_CCD_0030GS.do", sParam + "&trd_cd="+formObj.modi_cost_ctr_cd.value);
    		var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
    		ComOpenWait(false);
    		if(sav != "S" ){
        		return;
    		}
    		if(ComXmlString(sXml, "delt_flg") == null || ComXmlString(sXml, "delt_flg") == "") {
    	    	ComShowCodeMessage("CCD00033", "Trade Code");
    	    	formObj.modi_cost_ctr_cd.value = "";
    		}
    		break;
    	}
    }
    /**
     * handling process for input validation
     */
    function validateForm(sheetObj, formObj, sAction) {
    	switch (sAction) {
    	case SEARCH02:
    		if( formObj.rqst_no.value == ''){
	    		if(formObj.vsl_slan_cd.value == "" || formObj.vsl_slan_cd.value == null){
	    			ComShowCodeMessage("CCD00001", "Service Lane Code");
//	    			formObj.vsl_slan_cd.focus();
	    			return false;
	    		}
    		}
    		break;
    	case MULTI01:
    		if(ComTrimAll(formObj.vsl_slan_cd.value) == "" || formObj.vsl_slan_cd.value == null){
    			ComShowCodeMessage("CCD00001", "Service Lane Code");
//    			formObj.vsl_slan_cd.focus();
    			return false;
    		}
    		if(ComTrimAll(formObj.vsl_slan_nm.value) == "" || formObj.vsl_slan_nm.value == null){
    			ComShowCodeMessage("CCD00001", "Name");
//    			formObj.vsl_slan_nm.focus();
    			return false;
    		}
    		//if(vsl_svc_tp_cd.GetSelectCode()== "" || vsl_svc_tp_cd.GetSelectCode()== null){
    		if(ComTrimAll(formObj.vsl_svc_tp_cd.value) == "" || formObj.vsl_svc_tp_cd.value == null){
    			ComShowCodeMessage("CCD00001", "Lane Service Type");
//    			formObj.vsl_svc_tp_cd.focus();
    			return false;
    		}
    		if(ComTrimAll(formObj.vsl_tp_cd.value) == "" || formObj.vsl_tp_cd.value == null){
    		//if(vsl_tp_cd.GetSelectCode()== "" || vsl_tp_cd.GetSelectCode()== null){
    			ComShowCodeMessage("CCD00001", "Vessel Type");
//    			formObj.vsl_tp_cd.focus();
    			return false;
    		}
    		if(ComTrimAll(formObj.fdr_div_cd.value) == "" || formObj.fdr_div_cd.value == null){
    		//if(fdr_div_cd.GetSelectCode()== "" || fdr_div_cd.GetSelectCode()== null){
    			ComShowCodeMessage("CCD00001", "Feeder/Trunk");
//    			formObj.fdr_div_cd.focus();
    			return false;
    		}
//    		if(co_cd.GetSelectCode()== "" || co_cd.GetSelectCode()== null){
//				ComShowCodeMessage("CCD00001", "Company Code");
//    			formObj.co_cd.focus();
//    			return false;
//    		}
    		if(formObj.st_eff_dt.value != ""){
    			//Check the date format is correct
				if(!checkDateValue(formObj.st_eff_dt)){
					return false;
				}
    		}
    		if(formObj.end_eff_dt.value != ""){
    			//Check the date format is correct
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
//    		if(ComTrimAll(formObj.modi_vsl_slan_cd.value) == "" || formObj.modi_vsl_slan_cd.value == null){
//    			ComShowCodeMessage("CCD00001", "VIP Code");
////    			formObj.vsl_slan_nm.focus();
//    			return false;
//    		}
    		if(ComTrimAll(formObj.modi_vsl_slan_cd2.value) == "" || formObj.modi_vsl_slan_cd2.value == null){
    			//2017.12.26 주석 처리
    			ComShowCodeMessage("CCD00001", "Legacy Code");
    			formObj.modi_vsl_slan_cd2.focus();
    			return false;
    		}
    		if(ComTrimAll(formObj.modi_cost_ctr_cd.value) == "" || formObj.modi_cost_ctr_cd.value == null){
//    			ComShowCodeMessage("CCD00001", "Sakura CTR Code");
//    			ComShowCodeMessage("CCD00001", "Trade for ERP");
    			ComShowCodeMessage("CCD00001", "SAP CTR Code");
//    			formObj.vsl_slan_nm.focus();
    			return false;
    		}
//    		if(ComTrimAll(formObj.modi_vip_team_cd.value) == "" || formObj.modi_vip_team_cd.value == null){
//			    if (fdr_div_cd.GetSelectCode() == "T") {
//					ComShowCodeMessage("CCD00001", "VIP Team Code");
//					return false;
//			    }
//            }
    		var cnt=0;
    		for(i=1; i <= sheetObj.LastRow(); i++){
    			if("U" == sheetObj.GetCellValue(i, prefix+"ibflag") || "I" == sheetObj.GetCellValue(i, prefix+"ibflag") || "D" == sheetObj.GetCellValue(i, prefix+"ibflag")){
    				cnt++;
    			}
    		}
			if(cnt>0 && !(sheetObj.GetSaveString(false, true, prefix+"ibflag"))){
				return false;
			}

			if (formObj.modi_vsl_slan_cd.value != formObj.old_modi_vsl_slan_cd.value) {
   	    	 	formObj.edi_if_flg.value = "Y";
   	     	} else {
   	     		formObj.edi_if_flg.value = "N";
   	     	}
    		break;
    	}
    	return true;
    }
    function delt_flg_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){
    	if(comboObj.GetSelectCode()== "Y"){
     		  if(!ComShowCodeConfirm("COM130301", "data")) comboObj.SetSelectCode("N",false);
        }
    }
	function initControl() {
		var formObj=document.form;
		axon_event.addListenerForm('focus', 'obj_focus', form);
		axon_event.addListenerForm('blur', 'obj_change', form);
//		axon_event.addListenerForm('keypress', 'obj_keypress', form);
//		axon_event.addListenerForm('keyup', 'obj_keyup', form);
//		axon_event.addListenerForm('keydown', 'obj_keydown', form);
//		axon_event.addListenerForm('keydown', 'ComKeyEnter', form);
		axon_event.addListenerForm("propertychange", "obj_propertychange", formObj);
	}
   /**
   * HTML Object OnKeyPress event handling
   */
   /*function obj_keypress(event) {
	   obj=event.srcElement;
	   keyValidation(obj);
       var formObj=document.form;
       var eleObj=window.event.srcElement;
       var srcName=eleObj.getAttribute("name");
       switch(srcName) {
          case "st_eff_dt":						//Check the date format is correct
          	checkDateForm(formObj.st_eff_dt);
          break;
          case "end_eff_dt":					//Check the date format is correct
          	checkDateForm(formObj.end_eff_dt);
          break;
      }
   }*/
    /**
    * If the data field to be the change event
    */
   function obj_change(){
	   	var formObj=document.form;
	   	try {
	   		var srcName=ComGetEvent("name");
	           switch(srcName) {
	           	case "vsl_slan_cd":
	           		if(formObj.vsl_slan_cd.value.length>0){
	           			doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
	           		}
	           	break;
	           	case "modi_cost_ctr_cd":
	           		if(formObj.modi_cost_ctr_cd.value.length>0){
	           			if(formObj.vsl_slan_cd.value != "CNT" 
	           			 & formObj.vsl_slan_cd.value != "COM") {
	           				doActionIBSheet(sheetObjects[0], formObj, SEARCH03);
	           			}
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
	/**
	 * sheet1 add row handling
	 * add row.
	 */
	function addRow() {
		with (sheetObjects[0]) {
			var nowRow=GetSelectRow();
	     	nowRow=DataInsert(-1);
	     	SetCellValue(nowRow, prefix+"dir_delt_flg","N",0);
	     	SetCellValue(nowRow, prefix+"flg","Y",0);
	     	return true;
	    }
	}
	 /**
	  * sheet1 delete row
	  * delete row.
	  */
	function deleteRow() {
        with (sheetObjects[0]) {
            var sRowStr=FindCheckedRow(prefix+"del_chk");
            if(sRowStr == "")
            	return;
            var arr=sRowStr.split("|");
            var len = 0;
            for (var i=0; i < arr.length; i++) {
            	var idx = arr[i] - len;
            	if (GetCellValue(idx, prefix+"flg") == "Y") {
                    RowDelete(idx);
                    len++;
                }else{
	            	SetRowStatus(idx,"D");
	            	SetRowHidden(idx,1);
                }
            }
        }
	}
	  /**
	   * Sheet1 OnSearchEnd event handling
	   */
	  function sheet_OnSearchEnd(sheetObj, ErrMsg) {
	     var frmObj=document.form;
	     for (i=1; i <= sheetObj.LastRow(); i++ ) {
	    	 if(sheetObj.GetCellValue(i, prefix+"dir_delt_flg") == "" || sheetObj.GetCellValue(i, prefix+"dir_delt_flg") == null){
	   		  sheetObj.RowDelete(i, false);
	         }
	      }
	  }
	/**
	 * Sheet1 OnChange  event handling
	 */
	function sheet_OnChange(sheetObj, Row, Col, Value) {
         with (sheetObj) {
             switch(ColSaveName(Col)) {
             case prefix+"vsl_slan_dir_cd":
            	 for(i=1; i <= LastRow(); i++){
            		 if(i != Row){
            			 if(GetCellValue(i, prefix+"vsl_slan_dir_cd") == Value){
	            			 ComShowCodeMessage("CCD00006");
	            			 SetCellValue(Row, prefix+"vsl_slan_dir_cd","",0);
	            			 SelectCell(Row, Col);
	            			 return;
	            		 }
            		 }
            	 }
            	 break;
             }
         }
	}

	function fdr_div_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
		var formObj = document.form;
		if(newCode == "T"){
			formObj.modi_vip_team_cd.className = "input1";
		}else{
			formObj.modi_vip_team_cd.className = "input";
		}

	}

	 /**
     * Set selected value in the  vessel Lane code Inquiry pop-up.
     *
     * @param rtnObjs
     * @param row
     * @param col
     * @param sheetIdx
     * @return
     */
    function vslSlanCodeHelp(rtnObjs, row, col, sheetIdx) {
    	var formObj=document.form;
    	formObj.vsl_slan_cd.value=rtnObjs[0][3];
		if(formObj.vsl_slan_cd.value.length>0){
			doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
		}
    }
	  function getValueForCombo(obj) {
		  if (Object.prototype.toString.call(obj) === '[object Array]') {
			  var str = obj[0];
			  return str.split('|')[0];
		  }
		  return obj;
	  }
	  
	function get_trdCd(rowArray) {
		var sheetObj=sheetObjects[0];
		var formObj=document.form;
		var colArray=rowArray[0];
		formObj.modi_cost_ctr_cd.value=colArray[3];
	}