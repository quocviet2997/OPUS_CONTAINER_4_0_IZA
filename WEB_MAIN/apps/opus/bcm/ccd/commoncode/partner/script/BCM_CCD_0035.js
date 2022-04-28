/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0035.js
*@FileTitle  : Customer 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/
=========================================================
*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
		       MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
		       OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
    /** Common global variable */
	var sheetObjects=new Array();
	var sheetCnt=0;
	var comboObjects=new Array();
	var comboCnt=0;
	var create_cust_cd='';
	/** Event handler processing by button click event */
	document.onclick=processButtonClick;
	/** Event handler processing by button name */
	function processButtonClick() {
		/*****Case more than two additional sheets tab sheet is used to specify a variable *****/
		var sheetObject=sheetObjects[0];
		var sheetObject1=sheetObjects[1];
		/** **************************************************** */
		var formObj=document.form;
		try {
			var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
			if(srcName != null && srcName.indexOf('btn_com') != -1) {
				//if(window.event.srcElement.style.cursor == "default") return;
			}
			switch (srcName) {
			case "btn_Retrieve":
				if(formObj.rqst_no.value != '' && formObj.cust_cd.value == '')
					doActionIBSheet(sheetObjects[0], formObj, SEARCH12);
				else
					doActionIBSheet(sheetObjects[0], formObj, SEARCH);
				break;
			case "btn_Save":  
			    doActionIBSheet(sheetObjects[0],formObj,MULTI); 
				break;
			case "btn_Close":
				ComClosePopup(); 
				break;
			case "btn_Request":
				doActionIBSheet(sheetObjects[0],formObj,MULTI03); 
				break;
			case "btn_New":
				formObj.cust_cd.style.backgroundColor="#d4f6ff";
				doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
 				formObj.creflag.value="N";
 				formObj.saveflag.value="N";
 				formObj.cust_cd.readOnly=false;
 				ComBtnEnable("btn_Create");
// 				ComEnableObject(formObj.btn_com_ens_041, true);
 				ComBtnEnable("btn_com_ens_041");
			    break;	
			case "btn_CheckDup":
			    var param="rqst_no=" + ComGetObjValue(formObj.rqst_no);
				param=param + "&cust_cnt_cd=" + formObj.cust_cnt_cd.value+" &cust_nm=" + formObj.cust_lgl_eng_nm.value+"&loc_cd=" 
				              + formObj.loc_cd.value+" &cust_rgst_no=" + formObj.cust_rgst_no.value;
				var rtn=ComOpenPopup('/opuscntr/BCM_CCD_1035.do?' + param, 780, 470, '', '0,0', true); 
				break;
			case "btn_com_ens_041":
				if(formObj.creflag.value != "Y"){
				   var param="";
   	    	  	   param=param + "&" + "cust_seq=" + form.cust_seq.value+"&mdm_yn="+ formObj.mdm_yn.value;
	    		   ComOpenPopup('/opuscntr/COM_ENS_041.do?' + param, 780, 500, 'setCallBack0B2', '1,0,1,1,1,1,1,1', true);
				}
				break;
			case "btn_com_ens_0M1":
				var param="";
	    		param=param + "&" + "cust_cnt_cd=" + form.cust_cnt_cd.value;
	    		ComOpenPopup('/opuscntr/COM_ENS_0M1.do?' + param, 780, 470, 'setCallBack0B5', '1,0,1,1,1,1,1,1', true);
				break;
             case "btn_com_ens_051":
				var param="";
	    		param=param + "&" + "loc_cd=" + form.loc_cd.value;
	    		ComOpenPopup('/opuscntr/COM_ENS_051.do?' + param, 780, 470, 'setCallBack0B1', '1,0,1,1,1,1,1,1', true);
				break;
             case "btn_com_ens_071":
 				var param="";
 	    		param=param + "&" + "ofc_cd=" + form.ofc_cd.value;
 	    		ComOpenPopup('/opuscntr/COM_ENS_071.do?' + param, 780, 520, 'setCallBack0B3', '1,0,1,1,1,1,1,1', true);
 				break;
             case "btn_com_ens_0C1":
  				var param="";
  	    		param=param + "&" + "vndr_seq=" + form.vndr_seq.value;
  	    		ComOpenPopup('/opuscntr/COM_ENS_0C1.do?' + param, 780, 540, 'setCallBack0B4', '1,0,1,1,1,1,1,1', true);
  				break;
             case "btn_com_ens_n13":
   				var param="";
   	    		param=param + "&" + "curr_cd=" + form.capi_curr_cd.value;
   	    		ComOpenPopup('/opuscntr/COM_ENS_N13.do?' + param, 700, 500, 'setCallBack0B6', '1,0,1,1,1,1,1,1', true);
   				break;
 			case "btn_com_com_0006":
				var param="";						
	    		param=param + "cust_grp_id=" + form.cust_grp_id.value+"&mdm_yn="+ form.mdm_yn.value;	    		
	    		ComOpenPopup('/opuscntr/COM_COM_0006.do?' + param, 780, 430, 'setCustGrpId', '1,0,1,1,1,1,1,1', true);				
				break;
             case "btn_com_ens_0G1":
    			var param="";
    			ComOpenPopup('/opuscntr/COM_ENS_0G1.do', 600, 430, 'setCallBack0B9', "1,0,1", true);
    			break;
             case "btn_opn_dt_cal": //Calendar
             	var cal=new ComCalendar();                
             	cal.select(document.form.key_acct_st_eff_dt, 'yyyy-MM-dd');
                break; 
             case "btn_clz_dt_cal": //Calendar
             	var cal=new ComCalendar();                
             	cal.select(document.form.key_acct_end_eff_dt, 'yyyy-MM-dd');
             	break;
             case "btn_opn_dt_cal_1": //Calendar
          		var cal=new ComCalendar();                
          		cal.select(document.form.fndt_dt, 'yyyy-MM-dd');
          		break; 
             case "btn_opn_dt_cal_2": //Calendar
	          	var cal=new ComCalendar();                
	          	cal.select(document.form.nvocc_bd_st_eff_dt, 'yyyy-MM-dd');
	            break;
             case "btn_opn_dt_cal_3": //Calendar
	          	var cal=new ComCalendar();                
	          	cal.select(document.form.nvocc_bd_end_eff_dt, 'yyyy-MM-dd');
	            break; 
             case "btn_opn_dt_cal_4": //Calendar
 	          	var cal=new ComCalendar();                
 	          	cal.select(document.form.sls_delt_eff_dt, 'yyyy-MM-dd');
 	            break; 
             case "btn_Create":
 				doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
 				formObj.creflag.value="Y";
 			    formObj.saveflag.value="N";
 			    formObj.cntr_div_flg.value="Y";
 				formObj.cust_cd.readOnly=true;
 				formObj.cust_cd.style.backgroundColor="#bebebe";
 				ComBtnDisable("btn_Create");
 				ComEnableObject(formObj.btn_com_ens_041, false);
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
	 * registering IBCombo Object as list
	 * adding process for list in case of needing batch processing with other items 
	 * defining list on the top of source
	 */
	  	function setComboObject(combo_obj){	     
	      	comboObjects[comboCnt++]=combo_obj;  
	  	} 
  	/**
  	  * setting sheet initial values and header
  	  * param : sheetObj, sheetNo
  	  * adding case as numbers of counting sheets
  	  */
	function loadPage() {
		for (i=0; i < sheetObjects.length; i++) {
			ComConfigSheet(sheetObjects[i]);
			initSheet(sheetObjects[i], i + 1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		var formObj=document.form;
		var sheetObj=sheetObjects[0];
		initControl();
		formObj.creflag.value="N";
	    formObj.saveflag.value="N";
		doActionIBCombo(sheetObj, formObj, SEARCH01);
//		doActionIBSheet(sheetObj, formObj, IBCLEAR);
		// auth_tp_cd retrieve
		doActionIBSheet(sheetObj, formObj, SEARCH01);
		var authTpCd=G_AHTU_TP_CD;
		var rqstNo=formObj.rqst_no.value;
		if(G_MDAA_CHK == 'Y')
			ComEnableObject(formObj.delt_flg, true); 
		else
			ComEnableObject(formObj.delt_flg, false); 
		// If the Process Status screen call, in the Detail PopUp
		if(rqstNo != '') {
			ComSetDisplay('btn_Close', true);
			var procTpCd=formObj.proc_tp_cd.value;
			var custCd=formObj.cust_cd.value;
			var rqstUsrChk=formObj.rqst_usr_chk.value;
			if(authTpCd != 'R' && procTpCd == 'O') {
				ComSetDisplay('btn_CheckDup', true);
			}
			var objEnableFlag=false; 
			if(procTpCd == 'R' &&  ( ((authTpCd == 'R' || authTpCd == 'S') && rqstUsrChk == 'Y') || G_MDAA_CHK == 'Y') ) {
				ComSetDisplay('btn_Request', true);
				ComGetObject("btn_Request").style.setProperty("color", "#FF0000", "important");
				ComSetDisplay('btn_Retrieve', true);
				ComSetDisplay('btn_Save', true);
				doActionIBSheet(sheetObj, formObj, SEARCH12);
				objEnableFlag=true;
			} else if(procTpCd == 'A' && custCd != '') {
				formObj.cust_cnt_cd.value=custCd.substring(0, 2);
				formObj.cust_seq.value=custCd.substring(2);
				doActionIBSheet(sheetObj, formObj, SEARCH);
			} else {
				doActionIBSheet(sheetObj, formObj, SEARCH12);
			}
			if(objEnableFlag) {
				with(formObj) {
					ComEnableManyObjects(false,	cust_cd, btn_com_ens_041);
				}
			} else {	
				with(formObj) {
					ComEnableManyObjects(false,	cust_cd, btn_com_ens_041, btn_com_ens_051, btn_com_ens_071, btn_com_com_0006,
												btn_com_ens_0C1, btn_com_ens_n13);
				}
			}
		} else {
			ComSetDisplay('btn_Retrieve', true);
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
	 * Control of the event is dynamically loaded.. <br>
	 * {@link #loadPage}Function calls this function initializes the IBSheet Object. <br>
	 * 
	 * @param {ibsheet}  sheetObj IBSheet Object
	 * @param {int}	SheetObjects sequence number in the array
	 */
	function initControl() {
		var formObject=document.form;
		//Axon Event handling
		axon_event.addListenerForm('change', 'obj_change', form);
//	    axon_event.addListenerFormat('keypress',       'obj_keypress',    formObject); 
//	    axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
//	    ComClearSeparator (formObject.cust_cd,"eng"); //Only English 
//	    ComClearSeparator (document.form.cust_cnt_cd,"eng"); //Only English 
//	    ComClearSeparator (document.form.cust_lgl_eng_nm,"eng");
	}
	   /**
	    * The initial setting sheet, Header definition
	    * param : sheetObj ==> sheet object, sheetNo ==> Sheet object ID of the tag attached to the serial number
	    * If the number of seats a case by adding the number of sheets sheets should initialize the module configuration
	    */
	function initSheet(sheetObj, sheetNo) {
		var cnt=0;
		var sheetId=sheetObj.id;
		switch (sheetId) {
		case "sheet1":
		    with(sheetObj){
			      var HeadTitle1="ibflag|Del|Seq.|||||||||||||||||||||||||||||||||||||";
			      var headCount=ComCountHeadTitle(HeadTitle1);
			      var prefix="sheet1_";
			      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cust_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cust_cnt_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cust_seq" } ];
			      InitColumns(cols);
			      SetEditable(1);
			      SetWaitImageVisible(0);
			      sheetObj.SetVisible(0);
	            }
			break;
		}
	}
	 /**
	  * setDataInsert call .<br>
	  * DELT FLG setting 'N' 
	  * @param sheetObj, sNo
	  */
		function setDataInsert(sheetObj, sNo) {
			var formObj=document.form;
			switch (sNo) {
			case 1:
				var prefix="";
				var nRow=sheetObj.DataInsert(-1);
				sheetObj.SetCellValue(nRow, prefix + "delt_flg",'N');
				break;
			}
			return nRow;
		}
	   /**
	     * All the combo box query
	     */
		function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
			switch (sAction) {
				case SEARCH01: // load page
					var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", "f_cmd=" + SEARCH01);
					var arrXml=sXml.split("|$$|");
					if (arrXml.length > 0) 
						{
							ComXml2ComboItem(arrXml[0], indiv_corp_div_cd, "cd", "cd|cd_desc");
							ComXml2ComboItem(arrXml[1], cntr_cust_tp_cd, "cd", "cd|cd_desc");
							ComXml2ComboItem(arrXml[2], nbs_clss_cd1, "cd", "cd|cd_desc");
							ComXml2ComboItem(arrXml[3], nbs_clss_cd2, "cd", "cd|cd_desc");
							ComXml2ComboItem(arrXml[4], nbs_clss_cd3, "cd", "cd|cd_desc");
							ComXml2ComboItem(arrXml[5], vbs_clss_cd, "cd", "cd|cd_desc");
							ComXml2ComboItem(arrXml[6], finc_sts_lvl_cd, "cd", "cd|cd_desc");
							ComXml2ComboItem(arrXml[7], cust_div_cd, "cd", "cd|cd_desc");
						}
	     		break;
	     	}
		}
	// Sheet processing-related processes
	function doActionIBSheet(sheetObj, formObj, sAction) {
		sheetObj.ShowDebugMsg(false);
		switch (sAction) {
			case SEARCH: //retrieve
				if(!validateForm(sheetObj,formObj,sAction)) {
					return false;
				}
	    		formObj.f_cmd.value=SEARCH;
	    		sheetObj.SetWaitImageVisible(0);
	        	ComOpenWait(true);
	    		var sParam=FormQueryString(formObj);
	    		var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
	    		var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
	    		if(sav != "S" ){
	        		ComOpenWait(false);
	        		return;
	    		}
	    		if(ComXmlString(sXml, "delt_flg") == null || ComXmlString(sXml, "delt_flg") == ""){
	    			ComOpenWait(false);
	    			formObj.cust_cd.readOnly=true;		//Content viewed when entering input data, so this change keys disabled to prevent
	    			return;
	    		}
	    		formObj.ibflag.value="U";							//After the query is not entered for the queried data is to be modified
	    		formObj.cust_lgl_eng_nm.value=ComXmlString(sXml, "cust_lgl_eng_nm");
	    		formObj.cust_locl_lang_nm.value=ComXmlString(sXml, "cust_locl_lang_nm");
	    		formObj.bzet_addr.value=ComXmlString(sXml, "bzet_addr");
	    		formObj.cust_abbr_nm.value=ComXmlString(sXml, "cust_abbr_nm");
	    		formObj.cust_rgst_no.value=ComXmlString(sXml, "cust_rgst_no");
	    		formObj.loc_cd.value=ComXmlString(sXml, "loc_cd");
	    		formObj.ofc_cd.value=ComXmlString(sXml, "ofc_cd");
	    		formObj.srep_cd.value=ComXmlString(sXml, "srep_cd");
	    		indiv_corp_div_cd.SetSelectCode(ComXmlString(sXml, "indiv_corp_div_cd"));
	    		formObj.cntr_div_flg.value=ComXmlString(sXml, "cntr_div_flg");
	    		cntr_cust_tp_cd.SetSelectCode(ComXmlString(sXml, "cntr_cust_tp_cd"));
	    		cust_div_cd.SetSelectCode(ComXmlString(sXml, "cust_div_cd"));
	    		nbs_clss_cd1.SetSelectCode(ComXmlString(sXml, "nbs_clss_cd1"));
	    		nbs_clss_cd2.SetSelectCode(ComXmlString(sXml, "nbs_clss_cd2"));
	    		nbs_clss_cd3.SetSelectCode(ComXmlString(sXml, "nbs_clss_cd3"));
	    		vbs_clss_cd.SetSelectCode(ComXmlString(sXml, "vbs_clss_cd"));
	    		formObj.vndr_seq.value=ComXmlString(sXml, "vndr_seq");
	    		formObj.cust_grp_id.value=ComXmlString(sXml, "cust_grp_id");
	    		formObj.mlt_trd_acct_flg.value=ComXmlString(sXml, "mlt_trd_acct_flg");
	    		formObj.nmd_cust_flg.value=ComXmlString(sXml, "nmd_cust_flg");
	    		formObj.key_acct_flg.value=ComXmlString(sXml, "key_acct_flg");
	    		formObj.key_acct_st_eff_dt.value=ComXmlString(sXml, "key_acct_st_eff_dt");
	    		formObj.key_acct_end_eff_dt.value=ComXmlString(sXml, "key_acct_end_eff_dt");
	    		//formObj.cmpt_desc.value 			= ComXmlString(sXml, "cmpt_desc");
	    		formObj.fndt_dt.value=ComXmlString(sXml, "fndt_dt");
	    		finc_sts_lvl_cd.SetSelectCode(ComXmlString(sXml, "finc_sts_lvl_cd"));
	    		formObj.empe_knt.value=ComXmlString(sXml, "empe_knt");
	    		formObj.indus_desc.value=ComXmlString(sXml, "indus_desc");
	    		formObj.crnt_vol_knt.value=ComXmlString(sXml, "crnt_vol_knt");
	    		formObj.lstk_flg.value=ComXmlString(sXml, "lstk_flg");
	    		formObj.cts_no.value=ComXmlString(sXml, "cts_no");
	    		formObj.capi_curr_cd.value=ComXmlString(sXml, "capi_curr_cd");
	    		formObj.capi_amt.value=ComXmlString(sXml, "capi_amt");
	    	//	formObj.capi_amt.value 			    = ComAddComma(formObj.capi_amt);    		
	    		formObj.cust_rmk.value=ComXmlString(sXml, "cust_rmk");
	    		//formObj.prf_rep_cmdt_cd.value 		= ComXmlString(sXml, "prf_rep_cmdt_cd");
	    		//formObj.prf_grp_cmdt_cd.Code 		= ComXmlString(sXml, "prf_grp_cmdt_cd");
	    		//formObj.prf_cntr_tpsz_cd.value 		= ComXmlString(sXml, "prf_cntr_tpsz_cd");
	    		//formObj.prf_svc_desc.Code 			= ComXmlString(sXml, "prf_svc_desc");
	    		//formObj.prf_svc_dtl_desc.Code 		= ComXmlString(sXml, "prf_svc_dtl_desc");
	    		//formObj.spcl_req_desc.value 		= ComXmlString(sXml, "spcl_req_desc");
	    		formObj.nvocc_co_scac_cd.value=ComXmlString(sXml, "nvocc_co_scac_cd");
	    		formObj.nvocc_lic_no.value=ComXmlString(sXml, "nvocc_lic_no");
	    		formObj.nvocc_bd_no.value=ComXmlString(sXml, "nvocc_bd_no");
	    		formObj.nvocc_bd_amt.value=ComXmlString(sXml, "nvocc_bd_amt");
	    	//	formObj.nvocc_bd_amt.value 			= ComAddComma(formObj.nvocc_bd_amt);    		
	    		formObj.nvocc_bd_st_eff_dt.value=ComXmlString(sXml, "nvocc_bd_st_eff_dt");
	    		formObj.nvocc_bd_end_eff_dt.value=ComXmlString(sXml, "nvocc_bd_end_eff_dt");
	    		formObj.sls_delt_eff_dt.value=ComXmlString(sXml, "sls_delt_eff_dt");
	    		formObj.frt_fwrd_fmc_no.value=ComXmlString(sXml, "frt_fwrd_fmc_no");
	    		formObj.delt_flg.value=ComXmlString(sXml, "delt_flg");
	    		formObj.addr_tp_cd.value=ComXmlString(sXml, "addr_tp_cd");
	    		formObj.addr_seq.value=ComXmlString(sXml, "addr_seq");
	    		formObj.fndt_dt.value=ComGetMaskedValue(formObj.fndt_dt.value, "ymd") ;
	    		formObj.nvocc_bd_st_eff_dt.value=ComGetMaskedValue(formObj.nvocc_bd_st_eff_dt.value, "ymd") ;
	    		formObj.nvocc_bd_end_eff_dt.value=ComGetMaskedValue(formObj.nvocc_bd_end_eff_dt.value, "ymd") ;
	    		formObj.sls_delt_eff_dt.value=ComGetMaskedValue(formObj.sls_delt_eff_dt.value, "ymd") ;
	    		ComOpenWait(false);
	    		formObj.cust_seq.readOnly=true;		//Modifying the contents of a query for the update, so that cases can not change the key values ​​to disable
	    		formObj.cust_cnt_cd.readOnly=true;
	    		break;
	    		
			case SEARCH01: // MDM AUTH_TP_CD query
	    		var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=CUST';
	    		var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
	    		// global var sestting
	    		G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
	    		G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
				break;
				
			case SEARCH12:
				formObj.f_cmd.value=SEARCH12;
	    		sheetObj.SetWaitImageVisible(0);
	        	ComOpenWait(true);
	    		var sParam=FormQueryString(formObj);
	    		var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
	            var arrXml=sXml.split("|$$|");
	    		ComOpenWait(false);
	    		var sav=ComGetEtcData(arrXml[0], "TRANS_RESULT_KEY");
	    		if(sav != "S" ){
	        		return;
	    		}
	    		sheetObj.LoadSearchData(arrXml[0],{Sync:1} );
	        	ComEtcDataToForm(formObj, sheetObj);
				break;
			case SEARCH13: // MDM AUTH_TP_CD 조회
	    		var sParam='f_cmd=' + SEARCH04 + '&rqst_no=' + ComGetObjValue(formObj.rqst_no);
	    		var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
				break;
				
			case MULTI:        //저장
				if(!validateForm(sheetObj,formObj,sAction)) {
					return false;
				}
				var confMsg;
				var saveMsg;
				if( formObj.creflag.value == "Y" && formObj.cust_cd.value == "" && formObj.rqst_no.value == "") {
					var param="";
					param=param + "&cust_cnt_cd=" + form.cust_cnt_cd.value+" &cust_nm=" + form.cust_lgl_eng_nm.value+"&loc_cd=" 
					              + form.loc_cd.value+" &cust_rgst_no=" + form.cust_rgst_no.value;
					ComOpenPopup('/opuscntr/BCM_CCD_1035.do?' + param, 780, 470, "getBCM_CCD_1035_saveflag", '0,0', true);
				} else {
					confMsg=ComGetMsg('CCD00023', 'save');
					saveMsg=ComGetMsg("COM130102", "Data");
				}
				setSave(confMsg,saveMsg);
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
				
			case IBCLEAR:      //Initialization
				formObj.ibflag.value="I";
				formObj.cust_seq.readOnly=false;
	//			formObj.cust_cnt_cd.readOnly = false;
				formObj.reset();
	    		indiv_corp_div_cd.SetSelectCode("");
	    		formObj.cntr_div_flg.value="";//.SetSelectCode("");
	    		cntr_cust_tp_cd.SetSelectCode("");
	    		nbs_clss_cd1.SetSelectCode("");
	    		nbs_clss_cd2.SetSelectCode("");
	    		nbs_clss_cd3.SetSelectCode("");
	    		vbs_clss_cd.SetSelectCode("");
	    		formObj.cust_grp_id.value="";//.SetSelectCode("");
	    		formObj.nmd_cust_flg.value="";
	    		formObj.key_acct_flg.value="";
	    		finc_sts_lvl_cd.SetSelectCode("");
	    		formObj.lstk_flg.value="";
	    		//formObj.prf_grp_cmdt_cd.Code = "";
	    		//formObj.prf_svc_desc.Code = "";
	    		//formObj.prf_svc_dtl_desc.Code = "";
	    		formObj.delt_flg.value="N";
	    		cust_div_cd.SetSelectCode("");
	    		//ComBtnEnable("btn_Cre");
	 			ComSetFocus(document.form.cust_cnt_cd);					
	 //			ComBtnDisable("btn_Cre");
		    break;
		    
		case SEARCH02:      //Customer Country Code check
			if(validateForm(sheetObj,formObj,sAction)){
				ComOpenWait(true);
				formObj.f_cmd.value=SEARCH02;
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
		        var result=ComGetEtcData(sXml, "result");
		        if(result==""){
		        	ComShowCodeMessage("COM130402", "Customer Country Code");
		        	formObj.cust_cnt_cd.value="";
		        }
				ComOpenWait(false);
			}
			break;
			
    	case SEARCH03:      //Location Code check
			if(validateForm(sheetObj,formObj,sAction)){
				ComOpenWait(true);
				formObj.f_cmd.value=SEARCH03;
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
		        var result=ComGetEtcData(sXml, "result");
		        if(result==""){
		        	ComShowCodeMessage("COM130402", "Location Code");
		        	formObj.loc_cd.value="";
		        }
				ComOpenWait(false);
			}
			break;
			
    	case SEARCH04:      //Office Code check
			if(validateForm(sheetObj,formObj,sAction)){
				ComOpenWait(true);
				formObj.f_cmd.value=SEARCH04;
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
		        var result=ComGetEtcData(sXml, "result");
		        if(result==""){
		        	ComShowCodeMessage("COM130402", "Admin. Officd Code");
		        	formObj.ofc_cd.value="";
		        }
				ComOpenWait(false);
			}
		break;
		
    	case SEARCH05:      //Vendor Code check
			if(validateForm(sheetObj,formObj,sAction)){
				ComOpenWait(true);
				formObj.f_cmd.value=SEARCH05;
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
		        var result=ComGetEtcData(sXml, "result");
		        if(result==""){
		        	ComShowCodeMessage("COM130402", "Vendor Code");
		        	formObj.vndr_seq.value="";
		        }
				ComOpenWait(false);
			}
		break;
    	case SEARCH06:      //Capital Currency Code check
			if(validateForm(sheetObj,formObj,sAction)){
				ComOpenWait(true);
				formObj.f_cmd.value=SEARCH06;
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
		        var result=ComGetEtcData(sXml, "result");
		        if(result==""){
		        	ComShowCodeMessage("COM130402", "Capital Currency Code");
		        	formObj.capi_curr_cd.value="";
		        }
				ComOpenWait(false);
			}
		break;
		
    	case SEARCH09:      //Customer Code check
			if(validateForm(sheetObj,formObj,sAction)){
				ComOpenWait(true);
				formObj.f_cmd.value=SEARCH09;
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
		        var result=ComGetEtcData(sXml, "result");
		        ;
		        if(result=="" ){
		        	ComShowCodeMessage("COM130402", "Customer Code");
		        	formObj.cust_cnt_cd.value="";
		        	formObj.cust_seq.value="";
		        	formObj.cust_cd.value="";
		        }
				ComOpenWait(false);
			}
		break;
		
    	case SEARCH10:      //Sales Rep Code check
			if(validateForm(sheetObj,formObj,sAction)){
				ComOpenWait(true);
				formObj.f_cmd.value=SEARCH10;
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
		        var result=ComGetEtcData(sXml, "result");
		        if(result==""){
		        	ComShowCodeMessage("COM130402", "Sales Rep Code");
		        	formObj.srep_cd.value="";
	//	        	document.form.srep_cd.focus();
		        }
				ComOpenWait(false);
			}
		break;
		
    	case SEARCH11:      //Group Customer Code check
			if(validateForm(sheetObj,formObj,sAction)){
				ComOpenWait(true);
				formObj.f_cmd.value=SEARCH11;
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
		        var result=ComGetEtcData(sXml, "result");
		        if(result==""){
		        	ComShowCodeMessage("COM130402", "Group Customer Code");
		        	formObj.cust_grp_id.value="";
	//	        	document.form.cust_grp_id.focus();
		        }
				ComOpenWait(false);
			}
	break;
			}	
	 		//ComOpenWait(false);
		}
	/**
	 * Checkbox in the pop-up when you pass a value to parent window. <br>
	 * @param {ibsheet} sheetObj IBSheet Object
	 * @param {String} value sheetObj input value
	 */
	function chkCallPopupOK(sheetObj) {
		var formObj=document.form;
		var calllFunc;
		var rArray=null;
		rArray=chkGetLocalCheckedRows(sheetObj);
		if(rArray == null) {
			ComShowCodeMessage("COM12114", "row");
			return;
		}
		calllFunc=formObj.calllFunc.value;
		opener.eval(calllFunc)(rArray);
		ComClosePopup(); 
	}
	//===================================================================================
		//UI Object Event Handler
		// ===================================================================================
		/**
		 * Carrier Code Pop up to read from. <br>
		 */ 
		function setCallBack0B2(aryPopupData) {
			var form=document.form;
			//alert("setCallBack0B2  aryPopupData"+aryPopupData);
			form.cust_seq.value=aryPopupData[0][3].substring(2,8);
			form.cust_cnt_cd.value=aryPopupData[0][3].substring(0,2);
			form.cust_cd.value=aryPopupData[0][3];
			doActionIBSheet(sheetObjects[0], form, SEARCH);
		}
		function setCallBack0B1(aryPopupData) {
			var form=document.form;
			form.loc_cd.value=aryPopupData[0][3];
		} 
		function setCallBack0B3(aryPopupData) {
			var form=document.form;
			form.ofc_cd.value=aryPopupData[0][3];
		}
		function setCallBack0B4(aryPopupData) {
			var form=document.form;
			form.vndr_seq.value=aryPopupData[0][2];
		}
		function setCallBack0B5(aryPopupData) {
			var form=document.form;
			form.cust_cnt_cd.value=aryPopupData[0][3];
		}
		function setCallBack0B6(aryPopupData) {
			var form=document.form;
			form.capi_curr_cd.value=aryPopupData[0][2];
		}
	   function setCustGrpId(aryPopupData){
		   var form=document.form;
		   form.cust_grp_id.value=aryPopupData[0][2];
	   }
	 /**
	 * handling process for input validation
	 */
	function validateForm(sheetObj, formObj, sAction) {
		 switch (sAction) {
	    	case SEARCH:
	    		if( ComIsNull(formObj.rqst_no) && ComIsNull(formObj.cust_cd) ){
	    			ComShowCodeMessage("CCD00001", "Customer Code");
//	    			document.form.cust_cd.focus();
	    			return false;
	    		}
	    		break;
	    	case SEARCH08:
	    		if(formObj.loc_cd.value == "" || formObj.loc_cd.value == null){
	    			ComShowCodeMessage("CCD00001", "Location Code");
//	    			document.form.loc_cd.focus();
	    			return false;
	    		}
	    		break;
	    	case MULTI:
		    	if(formObj.creflag.value == "N" && formObj.rqst_no.value == ''){
		    		if(formObj.cust_cd.value == "" || formObj.cust_cd.value == null){
		    			ComShowCodeMessage("CCD00001", "Customer Code");
//		    			document.form.cust_cd.focus();
		    			return false;
		    		}
		    	}
	    		if(formObj.cust_lgl_eng_nm.value == "" || formObj.cust_lgl_eng_nm.value == null){
	    			ComShowCodeMessage("CCD00001", "Legal English Name");
//	    			document.form.cust_lgl_eng_nm.focus();
	    			return false;
	    		}
	    		if(formObj.loc_cd.value == "" || formObj.loc_cd.value == null){
	    			ComShowCodeMessage("CCD00001", "Location Code");
//	    			document.form.loc_cd.focus();
	    			return false;
	    		}
	    		if(formObj.ofc_cd.value == "" || formObj.ofc_cd.value == null){
	    			ComShowCodeMessage("CCD00001", "Admin. Office");
//	    			document.form.ofc_cd.focus();
	    			return false;
	    		}
	    		if(cntr_cust_tp_cd.GetSelectCode()== "" || cntr_cust_tp_cd.GetSelectCode()== null|| cntr_cust_tp_cd.GetSelectText()== ""){
	    			ComShowCodeMessage("CCD00001", "Container Customer Type");
//	    			document.form.cntr_cust_tp_cd.focus();
	    			return false;
	    		}
	    		if(cust_div_cd.GetSelectCode()== "" || cust_div_cd.GetSelectCode()== null|| cust_div_cd.GetSelectText()== ""){
	      			ComShowCodeMessage("CCD00001", "Individual/Group");
//	    			document.form.cust_div_cd.focus();
	    			return false;
	    		}else if (cust_div_cd.GetSelectCode()== "G" ){
	    		    if(formObj.cust_grp_id.value == "" || formObj.cust_grp_id.value == null){
	    			   ComShowCodeMessage("CCD00001", "Group Customer");
//	    			   document.form.cust_grp_id.focus();
	    		      return false;
	    		    }
	    		}	
	    		if(formObj.key_acct_st_eff_dt.value != ""){
	    			//Check the date format is correct for input
					if(!checkDateValue(formObj.key_acct_st_eff_dt)){
						formObj.key_acct_st_eff_dt.value="";
//						formObj.key_acct_st_eff_dt.focus();
						return false;
					}
	    		}
	    		if(formObj.key_acct_end_eff_dt.value != ""){
	    			//Check the date format is correct for input
					if(!checkDateValue(formObj.key_acct_end_eff_dt)){
						formObj.key_acct_end_eff_dt.value="";
//						formObj.key_acct_end_eff_dt.focus();
						return false;
					}
	    		}
	    		if(formObj.fndt_dt.value != ""){
	    			//Check the date format is correct for input
					if(!checkDateValue(formObj.fndt_dt)){
						formObj.fndt_dt.value="";
//						formObj.fndt_dt.focus();
						return false;
					}
	    		}
	    		if(formObj.nvocc_bd_st_eff_dt.value != ""){
	    			//Check the date format is correct for input
					if(!checkDateValue(formObj.nvocc_bd_st_eff_dt)){
						formObj.nvocc_bd_st_eff_dt.value="";
//						formObj.nvocc_bd_st_eff_dt.focus();
						return false;
					}
	    		}
	    		if(formObj.nvocc_bd_end_eff_dt.value != ""){
	    			//Check the date format is correct for input
					if(!checkDateValue(formObj.nvocc_bd_end_eff_dt)){
						formObj.nvocc_bd_end_eff_dt.value="";
//						formObj.nvocc_bd_end_eff_dt.focus();
						return false;
					}
	    		}
	    		if((formObj.key_acct_st_eff_dt.value != "") && (formObj.key_acct_end_eff_dt.value != "")){
	    			if(ComGetDaysBetween(formObj.key_acct_st_eff_dt, formObj.key_acct_end_eff_dt) < 0){
	    				ComShowCodeMessage("CCD00005", "Key Account Expire Date", "Key Account Effective Date");
	    				formObj.key_acct_st_eff_dt.value="";
	    				formObj.key_acct_end_eff_dt.value="";
//	    				formObj.key_acct_st_eff_dt.focus();
	    				return false;
	    			}
	    		}
	    		if((formObj.nvocc_bd_st_eff_dt.value != "") && (formObj.nvocc_bd_end_eff_dt.value != "")){
	    			if(ComGetDaysBetween(formObj.nvocc_bd_st_eff_dt, formObj.nvocc_bd_end_eff_dt) < 0){
	    				ComShowCodeMessage("CCD00005", "Bond Expire Date", "Bond Effective Date");
	    				formObj.nvocc_bd_st_eff_dt.value="";
	    				formObj.nvocc_bd_end_eff_dt.value="";
//	    				formObj.nvocc_bd_st_eff_dt.focus();
	    				return false;
	    			}
	    		}
               break;
	    	}
	    	return true;
		}
	   /**
        * When Save, Call Function 
       */
	    function setSave(confMsg, saveMsg) {
			var formObj   = document.form;
			var sheetObj  = sheetObjects[0];
			if (formObj.cust_seq.value == "" && formObj.saveflag.value == "N") return;	
			if (!confirm(confMsg)) {
				formObj.saveflag.value="N";
			    return false;
			}
			if( formObj.creflag.value == "N" && formObj.cust_seq.value != "" && formObj.rqst_no.value == ''){
				formObj.f_cmd.value=MULTI;
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSaveData("BCM_CCD_0035GS.do", sParam);
	 			var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
	 			if(sav == "S"  ){
	 				ComShowCodeMessage("COM130102", "Data");
	 				doActionIBSheet(sheetObjects[0], document.form, SEARCH);
	 			}else{
	 				ComShowCodeMessage("COM130103", "Data");
	 			}
			} else {
				formObj.f_cmd.value=MULTI01;
				formObj.cust_cnt_cd.value=formObj.loc_cd.value.substr(0,2);
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSaveData("BCM_CCD_0035GS.do", sParam);
	 			var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
	 			if(sav == "S"  ){
	 				var rqstNo=ComGetEtcData(sXml, "RQST_NO");
	 				ComSetObjValue(formObj.rqst_no, rqstNo);
	 				doActionIBSheet(sheetObj, formObj, SEARCH12);
	 			} else {
	 				ComShowCodeMessage("COM130103", "Data");
	 			}
			}
	   }
		 /**
	     * Call Back Function  
	     */
	   function getBCM_CCD_1035_saveflag(saveFlag) {
			var formObj   = document.form;
 		    var confMsg;
			var saveMsg;
			formObj.saveflag.value=saveFlag;	
			confMsg=ComGetMsg("CCD00030");
			saveMsg=ComGetMsg("CCD00031");
			setSave(confMsg, saveMsg );
			ComShowCodeMessage("CCD00031", "Data");
	   }
	
	
		function obj_focus() {
	      	if(event.srcElement.options){
//	      		event.srcElement.focus();
	      	}else{
	      		event.srcElement.select();
	      	}
	      }
		 /**
	     *If the data field to be the CHANGE Event
	     */
	    function obj_change(){
	    	var formObject=document.form;
	        /*****Case more than two additional sheets tab sheet is used to specify a variable *****/
	        var sheetObject1=sheetObjects[0];
	        /*******************************************************/
	    	try {
	    		var srcName=ComGetEvent("name");
	    		if(ComGetBtnDisable(srcName)) return false;
	            switch(srcName) {
	            	case "cust_cd":
	            		if(formObject.cust_cd.value.length>2){	            			
	                   		formObject.cust_cnt_cd.value=formObject.cust_cd.value.substr(0,2);
	                   		formObject.cust_seq.value=formObject.cust_cd.value.substr(2,6);
	                   		if(formObject.cust_seq.value.match(/[^0-9]{1}/)){
	                   			  ComShowCodeMessage("CCD00039", "Customer Code");
	                   			  formObject.cust_cd.value='';
	                   			  return false;
	                   		}  
	                   		var custlpad="";
	                   		if (formObject.cust_seq.value.length <6 ){
	                   			for(i=1; i <= 6- formObject.cust_seq.value.length; i++){
	                   				 custlpad=custlpad+"0" ;
	                   			}
	                   			formObject.cust_cd.value=formObject.cust_cnt_cd.value+custlpad+formObject.cust_seq.value ;
	                   		}
	                   		doActionIBSheet(sheetObject1, formObject, SEARCH09);
	            			if(formObject.cust_cd.value.length==0){
//		            			document.form.cust_cd.focus();
		            			}else{
		            				formObject.ibflag.value="U";
		            				formObject.cust_cd.readOnly=true;		
//		            				document.form.cust_lgl_eng_nm.focus();
		            				doActionIBSheet(sheetObject1, formObject, SEARCH);
		            			}
	            		}
	            	break;
	            	case "loc_cd":
	            		if(formObject.loc_cd.value.length>0){
	            			doActionIBSheet(sheetObject1, formObject, SEARCH03);
	            			if(formObject.loc_cd.value.length==0){
//		            			document.form.loc_cd.focus();
		            			}else{
//		            				document.form.ofc_cd.focus();
		            			}
	            			if(formObject.creflag.value == "Y"){
	            				formObject.cust_cnt_cd.value=formObject.loc_cd.value.substr(0,2);
	            			}
	            		}
	            	break;
	            	case "ofc_cd":
	            		if(formObject.ofc_cd.value.length>0){
	            			doActionIBSheet(sheetObject1, formObject, SEARCH04);
	            			if(formObject.ofc_cd.value.length==0){
//		            			document.form.ofc_cd.focus();
		            			}else{
//		            				document.form.srep_cd.focus();
		            			}
	            		}
	            	break;
	            	case "vndr_seq":
	            		if(formObject.vndr_seq.value.length>0){
	            			doActionIBSheet(sheetObject1, formObject, SEARCH05);
	            			if(formObject.vndr_seq.value.length==0){
//		            			document.form.vndr_seq.focus();
		            			}else{
//		            				document.form.cust_grp_id.focus();
		            			}
	            		}
	            	break;
	            	case "capi_curr_cd":
	            		if(formObject.capi_curr_cd.value.length>0){
	            			doActionIBSheet(sheetObject1, formObject, SEARCH06);
	            			if(formObject.capi_curr_cd.value.length==0){
//		            			document.form.capi_curr_cd.focus();
		            			}else{
//		            				document.form.capi_amt.focus();
		            			}
	            		}
	            	break;
	            	case "srep_cd":
	            		if(formObject.srep_cd.value.length>0){
	            			doActionIBSheet(sheetObject1, formObject, SEARCH10);
	            			if(formObject.srep_cd.value.length==0){
//		            			document.form.srep_cd.focus();
		            			}else{
//		            				document.form.indiv_corp_div_cd.focus();
		            			}
	            		}
	            	break;
	            	case "cust_grp_id":
	            		if(formObject.cust_grp_id.value.length>0){
	            			doActionIBSheet(sheetObject1, formObject, SEARCH11);
	            			if(formObject.cust_grp_id.value.length==0){
//		            			document.form.cust_grp_id.focus();
		            			}else{
//		            				document.form.mlt_trd_acct_flg.focus();
		            			}
	            		}
	            	break;
	               	case "delt_flg":
	               		if(formObject.delt_flg.value == "Y") {
	               			if(!ComShowCodeConfirm("COM130301", "data")) formObject.delt_flg.value="N";
	               		}
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
	   * HTML Object OnKeyPress event handling
	   */
//	   function obj_keypress(event) {
//		   obj=event.srcElement;
//		   keyValidation(obj);
//	       var formObj=document.form;
//	       var eleObj=window.event.srcElement;
//	       var srcName=eleObj.getAttribute("name");
//	       switch(srcName) {
//	          case "key_acct_st_eff_dt":						
//	          	checkDateForm(formObj.key_acct_st_eff_dt);
//	          break;
//	          case "key_acct_end_eff_dt":					
//	          	checkDateForm(formObj.key_acct_end_eff_dt);
//	          break;
//	          case "nvocc_bd_st_eff_dt":					
//	          	checkDateForm(formObj.nvocc_bd_st_eff_dt);
//	          break;
//	          case "nvocc_bd_end_eff_dt":					
//	          	checkDateForm(formObj.nvocc_bd_end_eff_dt);
//	          break;
//	          case "fndt_dt":			
//	          	checkDateForm(formObj.fndt_dt);
//	          break;
//	      }
//	   }