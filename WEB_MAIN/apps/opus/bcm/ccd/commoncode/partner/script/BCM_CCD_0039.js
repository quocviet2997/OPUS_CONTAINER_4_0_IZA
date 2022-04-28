/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0039.js
*@FileTitle  : Credit Customer 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/10
=========================================================
*/

/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
			   MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
			   OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class BCM_CCD_0039 : BCM_CCD_0039 on the screen for creating the script defines the task using.
 */
    /** Common global variable */
	var sheetObjects=new Array();
	var sheetCnt=0;
	var CustomerCodeChk="";
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
			switch (srcName) {
			case "btn_Retrieve":
				doActionIBSheet(sheetObjects[0], formObj, SEARCH);
				break;
			case "btn_Save":                                   
			    doActionIBSheet(sheetObjects[0],formObj,MULTI); 
				break;	
			case "btn_New":
				doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
			    break;				
			case "btn_com_ens_041":
				var param="";
	    		param=param + "&" + "cust_cd=" + form.cust_cd.value+"&mdm_yn="+ formObj.mdm_yn.value;
	    		ComOpenPopup('/opuscntr/COM_ENS_041.do?' + param, 780, 480, 'setCallBack0B2', '1,0,1,1,1,1,1,1', true);
				break;
             case "btn_com_ens_071":
				var param="";
	    		param=param + "&" + "cr_clt_ofc_cd=" + form.cr_clt_ofc_cd.value;
	    		ComOpenPopup('/opuscntr/COM_ENS_071.do?' + param, 780, 510, 'setCallBack0B1', '1,0,1,1,1,1,1,1', true);
				break;
             case "btn_com_ens_n13":
 				var param="";
// 	    		param=param + "&" + "cr_curr_cd=" + form.cr_curr_cd.value;
 	    		ComOpenPopup('/opuscntr/COM_ENS_N13.do?' + param, 700, 490, 'setCallBack0B3', '1,0,1,1,1,1,1,1', true);
 				break;
             case "btn_com_ens_042":
  				var param="";
  	    		param=param + "&" + "act_cust_cd=" + form.act_cust_cd.value;
  	    		ComOpenPopup('/opuscntr/COM_ENS_041.do?' + param, 780, 480, 'setCallBack0B4', '1,0,1,1,1,1,1,1', true);
  				break;
             case "btn_opn_dt_cal": //Calendar
//             	var cal=new ComCalendar();                
//             	cal.select(document.form.cr_st_dt, 'yyyy-MM-dd');
                break; 
             case "btn_clz_dt_cal": //Calendar
//             	var cal=new ComCalendar();                
//             	cal.select(document.form.cr_end_dt, 'yyyy-MM-dd');
             	break;
             case "btn_opn_dt_cal_1": //Calendar
          		var cal=new ComCalendar();                
          		cal.select(document.form.dy_xch_aply_st_dt, 'yyyy-MM-dd');
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
	  	  * initializing sheet
	  	  * implementing onLoad event handler in body tag
	  	  * adding first-served functions after loading screen.
	  	  */
	function loadPage() {
		var formObj=document.form;
		for (i=0; i < sheetObjects.length; i++) {
			ComConfigSheet(sheetObjects[i]);
			initSheet(sheetObjects[i], i + 1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		initControl();
		doActionIBCombo(sheetObjects[0],formObj, SEARCH01);
		// auth_tp_cd retrieve
		doActionIBSheet(sheetObjects[0], formObj, SEARCH01);
		doActionIBSheet(sheetObjects[0], formObj, SEARCH06);
		if(G_MDAA_CHK == 'Y'||CRDT_CHK == 'Y') {
			ComEnableObject(formObj.delt_flg, true);
			ComSetDisplay('btn_Save', true);
		} else {
			ComEnableObject(formObj.delt_flg, false); 
			ComSetDisplay('btn_Save', false);
		}
		ComEnableObject(formObj.cust_rlse_ctrl_flg, false);
		ComEnableObject(formObj.cr_flg, false);
		
		if(formObj.cust_cd.value != "") {
			doActionIBSheet(sheetObjects[0], formObj, SEARCH);
		} else {
			doActionIBSheet(sheet1,formObj,IBCLEAR);
		}
	}
	/**
	 *  HTML Control of the event is dynamically loaded. <br>
	 * {@link #loadPage}Function calls this function initializes the IBSheet Object.<br>
	 * 
	 * @param {ibsheet} sheetObj IBSheet Object
	 * @param {int} SheetObjects sequence number in the array
	 *  SheetObjects sequence number in the array
	 */
	function initControl() {
		var formObject=document.form;
		// Axon event handling 
		axon_event.addListenerForm('change', 'obj_change', form);
		axon_event.addListenerFormat('keypress','obj_keypress',formObject); //key press	
		// Axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
//		axon_event.addListener('keyup', 'obj_keyup', 'cr_amt');
	    ComClearSeparator (formObject.cust_cd,"eng");//English only 
	}
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
			      var HeadTitle1="ibflag|Del|Seq.|||||||||||||||||||||||||||||||||||||||||";
			      var headCount=ComCountHeadTitle(HeadTitle1);
			      var prefix="sheet1_";
			      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cust_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cust_cnt_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cust_seq" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cust_lgl_eng_nm" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cr_clt_ofc_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cr_curr_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ob_cr_term_dys" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ib_cr_term_dys" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cr_amt" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"riss_inv_flg" },
			             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cr_st_dt",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cr_end_dt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cust_rlse_ctrl_flg" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cr_flg" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"xch_rt_div_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cng_indiv_cd" },
			             {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"dy_xch_aply_st_dt",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"act_cust_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"act_cust_cnt_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"act_cust_seq" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cntc_pson_nm" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"inv_iss_curr_tp_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"pay_dt_dy1" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"pay_dt_dy2" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"pay_dt_dy3" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"pay_dt_dy4" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"pay_div_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"bank_acct_no" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cr_cust_rmk" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"locl_nm" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"locl_zip_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"locl_addr1" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"locl_addr2" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"locl_addr3" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"locl_addr4" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ownr_nm" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"bzct_nm" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"bztp_nm" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ob_eml" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ib_eml" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ob_fax_no" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ib_fax_no" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cust_cr_due_dt_div_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"delt_flg" } ];
			      
			      InitColumns(cols);
			      SetEditable(1);
			      SetWaitImageVisible(0);
		          SetColProperty("cr_st_dt", {Format:"####-##-##"} );
			      SetColProperty("cr_end_dt", {Format:"####-##-##"} );
			      SetColProperty("dy_xch_aply_st_dt", {Format:"####-##-##"} );
			      SetSheetHeight(322);
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
					var sXml=sheetObj.GetSearchData("BCM_CCD_0039GS.do", "f_cmd=" + SEARCH01);
					var arrXml=sXml.split("|$$|");
					if (arrXml.length > 0){
						ComXml2ComboItem(arrXml[0],xch_rt_div_cd, "cd", "cd|cd_desc");
						ComXml2ComboItem(arrXml[1],cng_indiv_cd, "cd", "cd|cd_desc");
						ComXml2ComboItem(arrXml[2],inv_iss_curr_tp_cd, "cd", "cd|cd_desc");
						ComXml2ComboItem(arrXml[3],pay_div_cd, "cd", "cd|cd_desc");
					}
	     		break;
	     	}
		}
		
		function doActionIBSheet(sheetObj, formObj, sAction) {
			sheetObj.ShowDebugMsg(false);
			switch (sAction) {
			case SEARCH: //Retrieve
				if(!validateForm(sheetObj,formObj,sAction)) {
				return false;
				}
				formObj.f_cmd.value=SEARCH;
				formObj.cust_cnt_cd.value=formObj.cust_cd.value.substring(0,2);
				formObj.cust_seq.value=formObj.cust_cd.value.substring(2,formObj.cust_cd.value.length);
				create_cust_cd=formObj.cust_cd.value;
				var sXml=sheetObj.GetSearchData("BCM_CCD_0039GS.do", FormQueryString(formObj));
 		 		if (ComGetEtcData(sXml,"input_flg")  != undefined){ 
 		 			formObj.input_flg.value=ComGetEtcData(sXml,"input_flg");
// 		 			ComSetObjValue(formObj.riss_inv_flg, ComGetEtcData(sXml,"riss_inv_flg"));
 		 			ComSetObjValue(formObj.cust_rlse_ctrl_flg, ComGetEtcData(sXml,"cust_rlse_ctrl_flg"));
 		 			ComSetObjValue(formObj.cr_flg, ComGetEtcData(sXml,"cr_flg"));
 		 			ComSetObjValue(xch_rt_div_cd, ComGetEtcData(sXml,"xch_rt_div_cd"));	 		 			
 		 			ComSetObjValue(cng_indiv_cd, ComGetEtcData(sXml,"cng_indiv_cd"));
 		 			ComSetObjValue(inv_iss_curr_tp_cd, ComGetEtcData(sXml,"inv_iss_curr_tp_cd"));
 		 			ComSetObjValue(pay_div_cd, ComGetEtcData(sXml,"pay_div_cd"));
 		 			ComSetObjValue(formObj.delt_flg, ComGetEtcData(sXml,"delt_flg"));	 	
 		 			ComSetObjValue(formObj.cre_usr_id, ComXmlString(sXml, "cre_usr_id"));
 		 			ComSetObjValue(formObj.cre_dt, ComXmlString(sXml, "cre_dt"));
 		 			ComSetObjValue(formObj.upd_usr_id, ComXmlString(sXml, "upd_usr_id"));
 		 			ComSetObjValue(formObj.upd_dt, ComXmlString(sXml, "upd_dt"));
 		 		} else { 
 		 			formObj.input_flg.value="Y";
 		 			ComShowCodeMessage("CCD00040");
 		 		}		 			
	 			sheetObj.LoadSearchData(sXml,{Sync:1} );
 		 		break;
 		 		
			case SEARCH01: // MDM AUTH_TP_CD query
				var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=MDAA';
				var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
				G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
				G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
				break;
				
			case MULTI:        //save
				
				/////CR0010136///////////////////////////////////////////// 
				var customer_country = formObj.cust_cd.value.substring(0,2);
				var customer_seq = formObj.cust_cd.value.substring(2,formObj.cust_cd.value.length);
				
				var result = "";
				if(customer_country != "" && customer_seq != ""){
					result = checkToBeCustomer(customer_country, customer_seq);
				}
				
				if(result == "BAD"){
					return;
				}
				/////////////////////////////////////////////////////////////////
				
				if(!validateForm(sheetObj,formObj,sAction)) {
					return false;
				}
				if (!ComShowCodeConfirm("COM130101", "Data")) {
				    return false;
				}
				formObj.f_cmd.value=MULTI;
				formObj.cust_cnt_cd.value=formObj.cust_cd.value.substring(0,2);
				formObj.cust_seq.value=formObj.cust_cd.value.substring(2,formObj.cust_cd.value.length);
//				formObj.cr_amt.value=ComGetUnMaskedValue(formObj.cr_amt.value, "int"); 
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSaveData("BCM_CCD_0039GS.do", sParam);				
	 			var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
	     	    if (sav == "S"  ){
	     		  ComShowCodeMessage("COM130102", "Data");
	     		  doActionIBSheet(sheetObjects[0], document.form, SEARCH);
	       	    } else{
	        		ComShowCodeMessage("COM132103", "Data");
	        	}	     	    
	     	    sheetObj.LoadSaveData(sXml);
 		 		break;	
 		 		
			case IBCLEAR:      //Initialization
				formObj.ibflag.value="I";
				formObj.cust_cd.readOnly=false;
				formObj.reset();
//	 			sheetObj.RemoveAll();
//	    		riss_inv_flg.SetSelectCode("");
//	    		cust_rlse_ctrl_flg.SetSelectCode("");
//	    		cr_flg.SetSelectCode("");
//				riss_inv_flg.selectedIndex = 0;
//				cust_rlse_ctrl_flg.selectedIndex = 0;
//				cr_flg.selectedIndex = 0;
//				cust_cr_due_dt_div_cd.SetSelectCode("");
	    		xch_rt_div_cd.SetSelectCode("");
	    		cng_indiv_cd.SetSelectCode("");
	    		inv_iss_curr_tp_cd.SetSelectCode("");
	    		pay_div_cd.SetSelectCode("");
//	    		delt_flg.SetSelectCode("");
//	    		delt_flg.selectedIndex = 0;
	 			ComSetFocus(document.form.cust_cd);					
			    break;
			    
			case SEARCH02:      //Control Office Code check
				if(validateForm(sheetObj,formObj,sAction)){
					ComOpenWait(true);
					formObj.f_cmd.value=SEARCH02;
					var sParam=FormQueryString(formObj);
					var sXml=sheetObj.GetSearchData("BCM_CCD_0039GS.do", sParam);
			        var result=ComGetEtcData(sXml, "result");
//			        if(result==""){
//			        	ComShowCodeMessage("COM130402", "Credit Control Office Code");
//			        	formObj.cr_clt_ofc_cd.value="";
//			        }
					ComOpenWait(false);
				}
				break;
				
	    	case SEARCH03:      //Sales Rep. Code check
				if(validateForm(sheetObj,formObj,sAction)){
					ComOpenWait(true);
					formObj.f_cmd.value=SEARCH03;
					var sParam=FormQueryString(formObj);
					var sXml=sheetObj.GetSearchData("BCM_CCD_0039GS.do", sParam);
			        var result=ComGetEtcData(sXml, "result");
			        if(result==""){
			        	ComShowCodeMessage("COM130402", "Credit Currency Code");
//			        	formObj.cr_curr_cd.value="";
			        }
					ComOpenWait(false);
				}
				break;
				
	    	case SEARCH04:      //Sales Rep. Code check
				if(validateForm(sheetObj,formObj,sAction)){
					ComOpenWait(true);
					formObj.f_cmd.value=SEARCH04;
					var sParam=FormQueryString(formObj);
					var sXml=sheetObj.GetSearchData("BCM_CCD_0039GS.do", sParam);
			        var result=ComGetEtcData(sXml, "result");
			        if(result==""){
			        	ComShowCodeMessage("COM130402", "Actual Payer Code");
			        	formObj.act_cust_cd.value="";
			        }
					ComOpenWait(false);
				}
				break;
				
	    	case SEARCH05:      //Customer Code check
	    		if(validateForm(sheetObj,formObj,sAction)){
	    			ComOpenWait(true);
	    			formObj.f_cmd.value=SEARCH05;
	    			var sParam=FormQueryString(formObj);
	    			var sXml=sheetObj.GetSearchData("BCM_CCD_0039GS.do", sParam);
	    	        var result=ComGetEtcData(sXml, "result");
	    	        if(result==""){
	    	        	ComShowCodeMessage("COM130402", "Customer Code");
	    	        	formObj.cust_cd.value="";
			        	CustomerCodeChk="N"; // customer code check
	    	        }
	    			ComOpenWait(false);
	    		}
	    		break;
	    		
	    	case SEARCH06: // MDM AUTH_TP_CD query
				var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=CRDT';
				var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
				CRDT_CHK=ComGetEtcData(sXml, "AUTH_TP_CD") != "A" ? "Y" : "N";
				break;
			}	
		}
		/**
	 	 * OnSearchEnd event handling <br>
	 	 */
	 	function sheet1_OnSearchEnd(sheetObj, errMsg){
	 		var formObj=document.form; 		
	 		formObj.cust_cd.readOnly=true;
	 		//ofc_cd is new does not exist. 
			if(formObj.input_flg.value == "Y"){
		 			sheetObj.DataInsert(-1);
		 			sheetObj.RemoveAll();
		 			sheetObj.SetCellValue(1, "cust_cd",create_cust_cd);
//		 			ComSetFocus(formObj.cr_clt_ofc_cd);	
			} else{		
				if(sheetObj.GetCellValue(1, "delt_flg")==undefined){
		 			formObj.cust_cd.value="";
		 		}
			formObj.cust_cd.value=sheetObj.GetCellValue(1,"cust_cnt_cd")+sheetObj.GetCellValue(1,"cust_seq");
			formObj.cr_clt_ofc_cd.value=sheetObj.GetCellValue(1, "cr_clt_ofc_cd");
//			formObj.cr_curr_cd.value=sheetObj.GetCellValue(1, "cr_curr_cd");
//			formObj.ob_cr_term_dys.value=sheetObj.GetCellValue(1, "ob_cr_term_dys");
//			formObj.ib_cr_term_dys.value=sheetObj.GetCellValue(1, "ib_cr_term_dys");
			//formObj.cr_amt.value = sheetObj.CellValue(1, "cr_amt");
//			formObj.cr_amt.value=ComAddComma(sheetObj.GetCellValue(1, "cr_amt"));
//			formObj.cr_st_dt.value=ComGetMaskedValue(sheetObj.GetCellValue(1, "cr_st_dt"),"ymd");
//			formObj.cr_end_dt.value=ComGetMaskedValue(sheetObj.GetCellValue(1, "cr_end_dt"),"ymd");
			formObj.dy_xch_aply_st_dt.value=ComGetMaskedValue(sheetObj.GetCellValue(1, "dy_xch_aply_st_dt"),"ymd");
			if(sheetObj.GetCellValue(1, "act_cust_cnt_cd") != undefined && sheetObj.GetCellValue(1, "act_cust_cnt_cd") != ""){
           		var custlpad="";
           		if (sheetObj.GetCellValue(1, "act_cust_seq").length < 6 ){
           			for(i=1; i <= 6- sheetObj.GetCellValue(1, "act_cust_seq").length; i++){
           				 custlpad=custlpad+"0";
           			}
           			//formObj.act_cust_cd.value=sheetObj.GetCellValue(1, "act_cust_cnt_cd") + custlpad + sheetObj.GetCellValue(1, "act_cust_seq");
           		}
           		formObj.act_cust_cd.value=sheetObj.GetCellValue(1, "act_cust_cnt_cd") + custlpad + sheetObj.GetCellValue(1, "act_cust_seq");
	 		}else{
	 			formObj.act_cust_cd.value="";
	 		}
			formObj.cntc_pson_nm.value=sheetObj.GetCellValue(1, "cntc_pson_nm");
//			formObj.pay_dt_dy1.value=sheetObj.GetCellValue(1, "pay_dt_dy1");
//			formObj.pay_dt_dy2.value=sheetObj.GetCellValue(1, "pay_dt_dy2");
//			formObj.pay_dt_dy3.value=sheetObj.GetCellValue(1, "pay_dt_dy3");
//			formObj.pay_dt_dy4.value=sheetObj.GetCellValue(1, "pay_dt_dy4");
			formObj.bank_acct_no.value=sheetObj.GetCellValue(1, "bank_acct_no");
			formObj.cr_cust_rmk.value=sheetObj.GetCellValue(1, "cr_cust_rmk");
			formObj.locl_nm.value=sheetObj.GetCellValue(1, "locl_nm");
			formObj.locl_zip_cd.value=sheetObj.GetCellValue(1, "locl_zip_cd");
			formObj.locl_addr1.value=sheetObj.GetCellValue(1, "locl_addr1");
			formObj.locl_addr2.value=sheetObj.GetCellValue(1, "locl_addr2");
			formObj.locl_addr3.value=sheetObj.GetCellValue(1, "locl_addr3");
			formObj.locl_addr4.value=sheetObj.GetCellValue(1, "locl_addr4");
			formObj.ownr_nm.value=sheetObj.GetCellValue(1, "ownr_nm");
			formObj.bzct_nm.value=sheetObj.GetCellValue(1, "bzct_nm");
			formObj.bztp_nm.value=sheetObj.GetCellValue(1, "bztp_nm");
			
			formObj.cust_lgl_eng_nm.value=sheetObj.GetCellValue(1, "cust_lgl_eng_nm");
			formObj.ob_eml.value=sheetObj.GetCellValue(1, "ob_eml");
			formObj.ib_eml.value=sheetObj.GetCellValue(1, "ib_eml");
			formObj.ob_fax_no.value=sheetObj.GetCellValue(1, "ob_fax_no");
			formObj.ib_fax_no.value=sheetObj.GetCellValue(1, "ib_fax_no");
            formObj.cust_cr_due_dt_div_cd.value = sheetObj.GetCellValue(1, "cust_cr_due_dt_div_cd");
	 		formObj.ibflag.value="U";
	 		formObj.cust_cd.readOnly=true;
			}
	 	}	
	/**
	 * When selecting from the pop-up check, pass a value to parent window. <br>
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
	/**
	 * Read from Carrier Code Pop up. <br>
	 */ 
	function setCallBack0B2(aryPopupData) {
		var form=document.form;
		form.cust_cd.value=aryPopupData[0][3];
		doActionIBSheet(sheetObjects[0], form, SEARCH);
	} 
	function setCallBack0B1(aryPopupData) {
		var form=document.form;
//		form.cr_clt_ofc_cd.value=aryPopupData[0][3];
	} 
	function setCallBack0B3(aryPopupData) {
		var form=document.form;
//		form.cr_curr_cd.value=aryPopupData[0][2];
	}
	function setCallBack0B4(aryPopupData) {
		var formObj=document.form;
		var actData = aryPopupData[0][3];
		formObj.act_cust_cd.value=actData;
		formObj.act_cust_cnt_cd.value=actData.substr(0,2);
		formObj.act_cust_seq.value=actData.substr(2,6);
		doActionIBSheet(sheetObjects[0], formObj, SEARCH04);		
	}
	 /**
	 * handling process for input validation
	 */
	function validateForm(sheetObj, formObj, sAction) {
		 switch (sAction) {
	    	case SEARCH:
	    		if(formObj.cust_cd.value == "" || formObj.cust_cd.value == null){
	    			ComShowCodeMessage("CCD00001", "Customer Code");
//	    			document.form.cust_cd.focus();
	    			return false;
	    		}
	    		break;
	    	case MULTI:
	    		if(formObj.cust_cd.value == "" || formObj.cust_cd.value == null){
	    			ComShowCodeMessage("CCD00001", "Customer Code");
//	    			document.form.cust_cd.focus();
	    			return false;
	    		}
//           	if(formObj.cr_st_dt.value != ""){
    			//Check the date format is correct for
//				if(!checkDateValue(formObj.cr_st_dt)){
//					formObj.cr_st_dt.value=""
//					return false;
//				}
//    		}
//    		if(formObj.cr_end_dt.value != ""){
//    			//Check the date format is correct for
//				if(!checkDateValue(formObj.cr_end_dt)){
//					formObj.cr_end_dt.value=""
//					return false;
//				}
//    		}
    		if(formObj.dy_xch_aply_st_dt.value != ""){
    			//Check the date format is correct for
				if(!checkDateValue(formObj.dy_xch_aply_st_dt)){
					formObj.dy_xch_aply_st_dt.value=""
					return false;
				}
    		}
//    		if(formObj.pay_dt_dy1.value != ""){
//    			//Check the date format is correct for
//				if(!ComIsDay2(formObj.pay_dt_dy1)){
//					ComShowCodeMessage("COM12187", "01~31");
//					return false;
//				}
//    		}
//    		if(formObj.pay_dt_dy2.value != ""){
//    			//날짜형식에 맞는지 체크
//				if(!ComIsDay2(formObj.pay_dt_dy2)){
//					ComShowCodeMessage("COM12187", "01~31");
//					return false;
//				}
//    		}
//    		if(formObj.pay_dt_dy3.value != ""){
//    			//날짜형식에 맞는지 체크
//				if(!ComIsDay2(formObj.pay_dt_dy3)){
//					ComShowCodeMessage("COM12187", "01~31");
//					return false;
//				}
//    		}
//    		if(formObj.pay_dt_dy4.value != ""){
//    			//Check the date format is correct for
//				if(!ComIsDay2(formObj.pay_dt_dy4)){
//					ComShowCodeMessage("COM12187", "01~31");
//					return false;
//				}
//    		}
//    		if((formObj.cr_st_dt.value != "") && (formObj.cr_end_dt.value != "")){
//    			if(ComGetDaysBetween(formObj.cr_st_dt, formObj.cr_end_dt) < 0){
//    				ComShowCodeMessage("CCD00005", "Credit End Date", "Credit Start Date");
////    				formObj.cr_st_dt.focus();
//    				return false;
//    			}
//    		}
    		  break;
	    		}
	    	return true;
		}
	   function obj_focus() {
	      	if (event.srcElement.options){
	      	} else{
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
	    		if(ComGetBtnDisable(srcName)) return false;
	            switch(srcName) {
	            	case "cust_cd":	
	            		/*CustomerCodeChk="Y"; // customer code check
	            		if(formObject.cust_cd.value.length>0){
	              			if(!ComIsNumber(formObject.cust_cd.value.substring(2,formObject.cust_cd.value.length))){
	        		        	formObject.cust_cd.value="";
	        		        	ComShowCodeMessage("COM130402", "Customer Code"); 	
	        		        	ComSetFocus(document.form.cust_cd);	
	        		        	return false;
	              			}*/
	            		CustomerCodeChk="Y";
	            		if(formObject.cust_cd.value.length>2){	            			
	                   		formObject.cust_cnt_cd.value=formObject.cust_cd.value.substr(0,2);
	                   		formObject.cust_seq.value=formObject.cust_cd.value.substr(2,6);
	                   		if(formObject.cust_seq.value.match(/[^0-9]{1}/)){
	                   			  ComShowCodeMessage("COM130402", "Customer Code");
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
	              			doActionIBSheet(sheetObject1, formObject, SEARCH05); //Customer code check
	            			if(CustomerCodeChk!="N"){
	            				doActionIBSheet(sheetObject1, formObject, SEARCH);
		            		}
	            		}
	            	break;
	            	case "cr_clt_ofc_cd":
//	            		if(formObject.cr_clt_ofc_cd.value.length>0){
//	            			doActionIBSheet(sheetObject1, formObject, SEARCH02);
//	            		if(formObject.cr_clt_ofc_cd.value.length==0){
//	            			}else{
//	            			}
//	            		}
	            	break;
	            	case "cr_curr_cd":
//	            		if(formObject.cr_curr_cd.value.length>0){
//	            			doActionIBSheet(sheetObject1, formObject, SEARCH03);
//	            			if(formObject.cr_curr_cd.value.length==0){
//		            			}else{
//		            			}
//	            		}
	            	break;
	            	case "act_cust_cd":
//	            		if(formObject.act_cust_cd.value.length>0){
//	            			if(!ComIsNumber(formObject.act_cust_cd.value.substring(3,formObject.act_cust_cd.value.length))){
//	        		        	formObject.act_cust_cd.value="";
//	        		        	ComShowCodeMessage("COM130402", "Actual Payer Code"); 	
//	        		        	ComSetFocus(document.form.act_cust_cd);	
//	        		        	return false;
//	              			}
//	            			doActionIBSheet(sheetObject1, formObject, SEARCH04);
//	            			if(formObject.act_cust_cd.value.length==0){
//		            			}else{
//		            			}
//	            		}	   
	            		if(formObject.act_cust_cd.value.length>0){	            			
	                   		formObject.act_cust_cnt_cd.value=formObject.act_cust_cd.value.substr(0,2);
	                   		formObject.act_cust_seq.value=formObject.act_cust_cd.value.substr(2,6);
	                   		if(formObject.act_cust_seq.value.match(/[^0-9]{1}/)){
	                   			ComShowCodeMessage("COM130402", "Actual Payer Code");
	                   			  formObject.act_cust_cd.value='';
	                   			  return false;
	                   		} 
	                   		var custlpad="";
	                   		if (formObject.act_cust_seq.value.length < 6 ){
	                   			for(i=1; i <= 6- formObject.act_cust_seq.value.length; i++){
	                   				 custlpad=custlpad+"0" ;
	                   			}
	                   			formObject.act_cust_cd.value=formObject.act_cust_cnt_cd.value + custlpad + formObject.act_cust_seq.value;
	                   		}
	                   		doActionIBSheet(sheetObject1, formObject, SEARCH04);
	            		}else{
	            			formObject.act_cust_cnt_cd.value="";
	            			formObject.act_cust_seq.value="";
	            		}
	            	break;
	            	case "delt_flg":
	            		if(formObject.delt_flg.value == "Y" ){
				   			if(ComShowConfirm(ComGetMsg("CCD00012"))){
				   				formObject.delt_flg.value="Y";
				   			}else{
				   				formObject.delt_flg.value="N";
				   			}
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
	    function obj_keypress(event) {
			   obj=ComGetEvent();
			   keyValidation(obj);
		       var formObj=document.form;
		       var eleObj=ComGetEvent();
		       var srcName=ComGetEvent("name");
		       switch(srcName) {
//		          case "cr_st_dt":						//Check the date format is correct for
//		          	checkDateForm(formObj.cr_st_dt);
//		          break;
//		          case "cr_end_dt":					//Check the date format is correct for
//		          	checkDateForm(formObj.cr_end_dt);
//		          break;
		          case "dy_xch_aply_st_dt":						//Check the date format is correct for
		          	checkDateForm(formObj.dy_xch_aply_st_dt);
		          break;
		      }
		 }
	   function obj_keyup(){
			var obj=ComGetEvent();
			var val=ComGetUnMaskedValue(obj.value, "int");
			var tmp=ComAddComma(val);
			if(tmp) {
				obj.value=tmp;
			}else{
				ComChkObjValid(obj); 
			} 
		}
	   
	   function checkToBeCustomer(customer_country, customer_seq){
           var result = "GOOD";
           var cust_cnt_cd = customer_country;
           var cust_seq = customer_seq;
            if(cust_cnt_cd != "" && cust_seq !="" ){
                var sParam="f_cmd="+SEARCH25+"&etc1="+cust_cnt_cd+"&etc2="+cust_seq;        
                var sXml=sheetObjects[0].GetSearchData("PRICommonGS.do", sParam);
                var tobeCust = ComGetEtcData(sXml,"tobe");
                if(tobeCust != "N" && tobeCust != "" ){
                	ComShowCodeMessage('CCD00074', tobeCust ,cust_cnt_cd+cust_seq);
                	result = "BAD";
                }
            }
            return result;
       }