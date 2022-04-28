/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0033.js
*@FileTitle  : Invoice Split After Invoice Issue
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/10
=========================================================*/
	var tabObjects=new Array();
	var tabCnt=0 ;
	var beforetab=1;
	var sheetObjects=new Array();
	var sheetCnt=0;
	//var rdObjects=new Array();
	//var rdCnt=0;
	var appendReport = [];
	var comboObjects=new Array();
	var bfrTabIdx=1; 

	// Defining button events. */
	document.onclick=processButtonClick;
	
	var cfmFlg = ""; //2018-04-30	
	var mmFlg = ""; //2018-04-30
	var arrOffice = ""; // Office Array 목록(재조회 방지용)
	var initTaxCnt = ""; // Tax Cnt Flag (재조회 방지용)
	/** 
	 * Handling button event. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  none.  
	 * @return none.
	 * @see #
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	function processButtonClick(){
		/***** Setting each tab's sheet variable. *****/
		var sheetObject=sheetObjects[0];
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			 if(ComGetBtnDisable(srcName)) return false;
			switch(srcName) {
			case "btn_retrive":	
				
				/*
				//new btn 기증 추가 
				tabObjects[0].RemoveAll();
				//ComResetAll();
				sheetObjects[0] = sheetObjects[0].Reset();
				sheetObjects[1] = sheetObjects[1].Reset();
				sheetObjects[2] = sheetObjects[2].Reset();
				sheetObjects[3] = sheetObjects[3].Reset();
				sheetObjects[4] = sheetObjects[4].Reset();
				sheetObjects[5] = sheetObjects[5].Reset();
				sheetObjects[6] = sheetObjects[6].Reset();
				sheetObjects[7] = sheetObjects[7].Reset();
				sheetObjects[8] = sheetObjects[8].Reset();
				sheetObjects[9] = sheetObjects[9].Reset();
				sheetObjects[10] = sheetObjects[10].Reset();
				sheetObjects[11] = sheetObjects[11].Reset();
				sheetObjects[12] = sheetObjects[12].Reset();
				sheetObjects[13] = sheetObjects[13].Reset();
				sheetObjects[14] = sheetObjects[14].Reset();
				
				for(i=0;i<4;i++){
					ComConfigSheet (sheetObjects[i] );	
					initSheet(sheetObjects[i],i+1);
					ComEndConfigSheet(sheetObjects[i]);
				}				
//				sheetObjects[14].RemoveAll();
				document.getElementById("mst_sum").innerHTML="";
				document.getElementById("split_sum").innerHTML="";
				//doActionIBSheet(sheetObjects[0],formObject,IBSEARCH_ASYNC01);
				ComBtnDisable("btn_go");
				ComBtnDisable("btn_paper");
				ComBtnEnable("btn_retrive");
				ComBtnEnable("btn_save");
				formObject.inv_no.readOnly=false;
				formObject.split_cnt.readOnly=false;					
				formObject.inv_no.className="input1";
				formObject.split_cnt.className="input1";
				formObject.inv_no.focus();
				f_Search = 0;
				
				*/
				
				if(tabObjects[0].GetCount() == 0){
					bfrTabIdx = 1;
				} else {
					bfrTabIdx = tabObjects[0].GetSelectedIndex();
					if(bfrTabIdx == 0) bfrTabIdx = 1;
				}
				
				tabObjects[0].RemoveAll();
				document.getElementById("mst_sum").innerHTML="";
				document.getElementById("split_sum").innerHTML="";
				doActionIBSheet(sheetObject,formObject,IBSEARCH);	
				break;
			case "btn_new":
				fncResetAll();				
				break;
			case "btn_save":
				sheetObjects[9].RemoveAll();
				sheetObjects[10].RemoveAll();
				sheetObjects[11].RemoveAll();
				doActionIBSheet(sheetObjects[9],formObject,IBSAVE);
				break;
			case "btn_paper":
				if(validateForm(sheetObjects[9],formObject,IBINSERT)){
					formObject.email_flag.value="N";
					setCustTargetYN();
					doActionIBSheet(sheetObjects[0],document.form,IBINSERT);              
				}
				break;
			case "btn_go":
				if(validateForm(sheetObjects[9],document.form,IBINSERT)){
					var ar_ofc_cd_str=formObject.ar_ofc_cd2.value;
					//if (ar_ofc_cd_str == "DXBBB") {
					//	formObject.bl_nos.value="'"+ formObject.frm_bl_src_no.value + "'";
					//	var arrStr2= ar_ofc_cd.GetSelectCode().split("^");
					//	formObject.svr_id.value=arrStr2[7]; 			    
					//	formObject.ots_smry_cd.value=arrStr2[13]; 	
					//	formObject.inv_dup_flg.value=arrStr2[14]; 
					//	formObject.inv_mlt_bl_iss_flg.value=arrStr2[15]; 	
					//	formObject.office_cnt_cd.value = arrStr2[6].substring(0,2);
					//	var param=FormQueryString(formObject);
					//	ComOpenWindowCenter("FNS_INV_0110.do?"+param, "pop", 730, 400);
					//}else{
						formObject.email_flag.value="Y";
						setCustTargetYN();
						doActionIBSheet(sheetObjects[0],document.form,IBINSERT);
						var state=formObject.state.value;  
						var r_invs=formObject.inv_nos.value;  
//						var arrStr2= ar_ofc_cd.GetSelectText();
//						formObject.ar_ofc_cd2.value=arrStr2[1];
						formObject.ar_ofc_cd2.value= formObject.ofc.value;
					//}
				} else {
					return;
				} 		
				break;
			case "btn_actcust":
				var param=('?pgmNo(FNS_INV_0013&cust_cnt_cd='+formObject.act_cust_cnt_cd[tabObjects[0].GetSelectedIndex()].value+'&cust_seq='+formObject.act_cust_seq[tabObjects[0].GetSelectedIndex()].value+'&pop_yn=Y');
				ComOpenPopup('/opuscntr/FNS_INV_0013.do'+param, 1200, 650, '', '0,0', false, false, "", "", 0);
				break;
			case "btn_frmactcust":
				var param='?pgmNo=FNS_INV_0013&cust_cnt_cd='+formObject.frm_act_cust_cnt_cd.value+'&cust_seq='+formObject.frm_act_cust_seq.value+'&pop_yn=Y';
				ComOpenPopup('/opuscntr/FNS_INV_0013.do'+param, 1200, 650, '', '0,0', false, false, "", "", 0);
				break;
			case "btn_shprcust":
				var param='?pgmNo=FNS_INV_0013&cust_cnt_cd='+formObject.frm_shpr_cust_cnt_cd.value+'&cust_seq='+formObject.frm_shpr_cust_seq.value+'&pop_yn=Y';
				ComOpenPopup('/opuscntr/FNS_INV_0013.do'+param, 1200, 650, '', '0,0', false, false, "", "", 0);
				break;
			case "btn_fwdrcust":
				var param='?pgmNo=FNS_INV_0013&cust_cnt_cd='+formObject.frm_fwdr_cust_cnt_cd.value+'&cust_seq='+formObject.frm_fwdr_cust_seq.value+'&pop_yn=Y';
				ComOpenPopup('/opuscntr/FNS_INV_0013.do'+param, 1200, 650, '', '0,0', false, false, "", "", 0);
				break;
			case "btn_custNm":
				param='?pgmNo=FNS_INV_0086&cust_seq='+formObject.act_cust_seq[tabObjects[0].GetSelectedIndex()].value+'&cust_cnt_cd='+formObject.act_cust_cnt_cd[tabObjects[0].GetSelectedIndex()].value;
				ComOpenPopup('/opuscntr/FNS_INV_0086.do' + param, 900, 450, 'getFNS_INV_0086', '1,0', false, false, 1, 1, 0);
				break;
			case "btn_container":
				sheet_container=sheetObjects[2]; 
				ComOpenPopup('/opuscntr/FNS_INV_0098.do?pgmNo=FNS_INV_0098', 700, 380, '', '0,0');  
				break; 
			case "btn_container_e":
				sheet_container=sheetObjects[12]; 
				ComOpenPopup('/opuscntr/FNS_INV_0098.do?arIfNo='+tabObjects[0].GetTabTitle([tabObjects[0].GetSelectedIndex()]) +'&pagetype=E&pgmNo=FNS_INV_0098&', 700, 400, 'getFNS_INV_0098', '0,0');
				break;
			case "btn_rfano":
				ComOpenPopup('/opuscntr/FNS_INV_0090.do?pgmNo=FNS_INV_0090&rfa_no='+formObject.frm_rfa_no.value, 600, 368, '', '0,0');  
				break; 
			case "btn_scno":
				ComOpenPopup('/opuscntr/FNS_INV_0091.do?pgmNo=FNS_INV_0091&sc_no='+formObject.frm_sc_no.value, 600, 368, '', '0,0');  
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
	 * Register IBSheet object on sheetObjects array. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj IBSheet Object
	 * @return none.
	 * @see #
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	function setSheetObject(sheet_obj){
		sheetObjects[sheetCnt++]=sheet_obj;
	}
	
	function setComboObject(combo_obj){
		comboObjects[comboCnt++]=combo_obj;
	}
	
	/** 
	 * Coding event handler for body tag's OnLoad. <br>
	 * Add  pre-process functions after loading by browser. <br> 
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  none.
	 * @return none.
	 * @see #
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	function loadPage() {
		//for(i=0;i<4;i++){
		for(i=0;i<sheetObjects.length;i++){
			ComConfigSheet (sheetObjects[i] );	
			initSheet(sheetObjects[i],i+1);
			ComEndConfigSheet(sheetObjects[i]);	
		}
		
	    //init IBMultiCombo
	    for(var k=0; k<comboObjects.length; k++){
	        initCombo(comboObjects[k],k+1);
	    }
	    
		initControl();
		//initRdConfig(rdObjects[0]);
		ComBtnDisable("btn_go");
		ComBtnDisable("btn_paper");
		doActionIBSheet(sheetObjects[0],document.form,IBSEARCH_ASYNC01); 
		document.form.inv_no.focus();
		
		checkTaxCountry();  // Whether or not the invoice tax country (2017.12.08)
		
		cfmFlg = ""; //2018-04-30	
		mmFlg = ""; //2018-04-30	
	}
	function initRdConfig(rdObject){
		   var Rdviewer=rdObject;
		      Rdviewer.AutoAdjust=true;
		      Rdviewer.ViewShowMode(0);
		      Rdviewer.IsShowDlg=0;
		      Rdviewer.SetBackgroundColor(128, 128, 128);
		      Rdviewer.ApplyLicense("0.0.0.0");
		      Rdviewer.SetPageLineColor(128, 128, 128);
		      Rdviewer.style.height = 0;

	}
	/** 
	 * init combo<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param {IBMultiCombo} comboObj  comboObj
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.05.04
	 */
	function initCombo(comboObj, comboNo) {
	    switch (comboObj.options.id) {
	        case "ar_ofc_cd":
	            with (comboObj) {
	                SetColAlign(0, "left");
	                SetColWidth(0, "50");
	                //SetTitle("Office Code");
	                SetMultiSelect(0);
	                SetUseAutoComplete(1);
	                SetDropHeight(200);
	                SetMaxLength(6);
	            }
	        break;
	    }
	}	
	/** 
	 * Initialize sheets. <br>
	 * Add  pre-process functions after loading by browser. <br>
	 * Coding initial modules as sheet's count. <br> 
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {IBSheet} sheetObj : Sheet object.
	 * @param Serial number for sheet object's ID.  
	 * @return none.
	 * @see #
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	function initSheet(sheetObj,sheetNo) {
		var cnt=0;
		var shtID=sheetObj.id;
		var prefix = shtID + "_";
		switch(shtID) {
		case "sheet1":      //sheet1 init
		    with(sheetObj){
			      var HeadTitle="|bl_no|bkg_no|if_no|actual cust seq| actual cust cd|cust_nm |cust_rgst_no|inv cust cd|inv_cust_seq |crdt limit cd |crdt limit amt | crdt term ob|crdt term ib| crdt office| vsl_cd|skd_voy_no|skd_dir_cd|local vvd| scope| bound|s/a Date|trnk_vsl_cd|trnk_skd_voy_no|trnk_skd_dir_cd|Trunk vvd|Lane|PoR|pol|pod|del|c/a no.|c/a Date|COM Ref.|INV ref.no|Bkg Ref.No|S/I Ref.No|Description|Rev.Type|Source|Master B/L|RFA No.|S/C No|Sales Rep.|Weight|Measure|WHF DEC|WHF Date|TEU|FEU|I/F Date|Good Date|Eff.Date|INV No.|Issue Date|Due Date|FWDR Code|FWDR Seq|cr_flg|zn_ioc_cd|locl_curr_cd|inv_delt_div_cd|CR_TERM_DYS|CUST_CR_FLG|XCH_RT_N3RD_TP_CD|XCH_RT_USD_TP_CD|XCH_RT_DT|sail_dt|inv_curr_cd|dflt_inv_curr_div_cd";
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"bl_src_no" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"bkg_no" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ar_if_no" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"act_cust_cnt_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"act_cust_seq" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cust_nm" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cust_rgst_no" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"inv_cust_cnt_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"inv_cust_seq" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cr_curr_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cr_amt" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ob_cr_term_dys" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ib_cr_term_dys" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cr_clt_ofc_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"vsl_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"skd_voy_no" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"skd_dir_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"local_vvd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"svc_scp_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"io_bnd_cd" },
			             {Type:"Date",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"sail_arr_dt",        KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"trnk_vsl_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"trnk_skd_voy_no" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"trnk_skd_dir_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"trunk_vvd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"slan_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"por_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"pol_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"pod_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"del_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"bkg_corr_no" },
			             {Type:"Date",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"bkg_corr_dt",        KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"co_stf_ctnt" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"inv_ref_no" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"bkg_ref_no" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"si_ref_no" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"inv_rmk" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"rev_tp_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"rev_src_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"mst_bl_no" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"rfa_no" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"sc_no" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"srep_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cgo_wgt" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cgo_meas_qty" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"whf_decl_no" },
			             {Type:"Date",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"whf_decl_cfm_dt",    KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"bkg_teu_qty" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"bkg_feu_qty" },
			             {Type:"Date",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"bl_inv_if_dt",       KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Date",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"bl_inv_cfm_dt",      KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Date",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"gl_eff_dt",          KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"inv_no" },
			             {Type:"Date",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"iss_dt",             KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Date",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"due_dt",             KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"frt_fwrd_cnt_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"frt_fwrd_cust_seq" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cr_flg" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"zn_ioc_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"locl_curr_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"inv_delt_div_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cr_term_dys" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cust_cr_flg" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"xch_rt_n3rd_tp_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"xch_rt_usd_tp_cd" },
			             {Type:"Date",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"xch_rt_dt",          KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"sail_dt" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"inv_curr_cd" },
			      		 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"dflt_inv_curr_div_cd" } ];
			      InitColumns(cols);
			      SetEditable(1);
			      SetVisible(false);
			      SetWaitImageVisible(0);
	            }
		    break;
		case "sheet2":     
		    with(sheetObj){	        
			      var HeadTitle="|Seq.|CHG|Cur|Rate|Rated As|Per|Amount|Ex. Rate|||";
			      var rowCnt=0;
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag",           KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"Seq",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:-1 },
			             {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:"chg_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:-1 },
			             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"curr_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:-1 },
			             {Type:"Float",     Hidden:0,  Width:90,   Align:"Right",   ColMerge:1,   SaveName:"trf_rt_amt",       KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0,   EditLen:50 },
			             {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:1,   SaveName:"rat_as_cntr_qty",  KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0,   EditLen:50 },
			             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"per_tp_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:-1 },
			             {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:1,   SaveName:"chg_amt",          KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0,   EditLen:50 },
			             {Type:"Float",     Hidden:0,  Width:65,   Align:"Center",  ColMerge:1,   SaveName:"inv_xch_rt",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:7,   UpdateEdit:0,   InsertEdit:0,   EditLen:50 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"tj_src_nm",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"dp_prcs_knt",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ida_oft_expt_flg",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
			      InitColumns(cols);
			      SetEditable(1);
			      SetSheetHeight(135);
			      SetEditableColorDiff(0);
			      SetWaitImageVisible(0);
			      
			      ShowSubSum([{StdCol:"curr_cd", SumCols:"chg_amt", Sort:0,   CaptionCol:3, CaptionText:"%col"}]);
	            }
			break;
		case "sheet3":      //container
		    with(sheetObj){
			      var HeadTitle="|cntr_tpsz_cd|cntr_no|cntr_seq|teu|feu|ar_if_no|";
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cntr_tpsz_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cntr_no" },
			             {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"cntr_seq" },
			             {Type:"AutoSum",   Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"teu" },
			             {Type:"AutoSum",   Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"feu" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ar_if_no" } ];
			      InitColumns(cols);
			      SetEditable(1);
			      SetVisible(false);
			      SetWaitImageVisible(0);
	            }
		    break;
		case "sheet4":       
		    with(sheetObj){
			      var HeadTitle="|shpr_cust_cnt_cd|shpr_cust_seq|shpr_cust_nm|fwdr_cust_cnt_cd|fwdr_cust_seq|fwdr_cust_nm";
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
			             {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"shpr_cust_cnt_cd" },
			             {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"shpr_cust_seq" },
			             {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"shpr_cust_nm" },
			             {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"fwdr_cust_cnt_cd" },
			             {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"fwdr_cust_seq" },
			             {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"fwdr_cust_nm" } ];
			      InitColumns(cols);
			      SetEditable(1);
			      SetVisible(false);
			      SetWaitImageVisible(0);
	            }
			break;
		case "t0sheet1":   			
		    with(sheetObj){	       
			      var HeadTitle="|Seq.|CHG|Cur|Rate|Rated As|Per|Amount|inv_xch_rt|tj_src_nm|ar_if_no|ar_if_ser_no|chg_seq|inv_xch_rt_dt|rep_chg_cd|chg_full_nm|trf_no|sob_id|inv_rev_tp_src_cd|rev_coa_co_cd"+
			      "|rev_coa_rgn_cd|rev_coa_ctr_cd|rev_coa_acct_cd|rev_coa_inter_co_cd|rev_coa_vsl_cd|rev_coa_voy_no|rev_coa_skd_dir_cd|rev_coa_dir_cd|acct_cd|tva_flg|chg_rmk|mnl_flg|mf_div_cd||||";
			      var headCount=ComCountHeadTitle(HeadTitle);
			      var rowCnt=0;
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag",               KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"Seq",                  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0},
			             {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"chg_cd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0},
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"curr_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0},
			             {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:1,   SaveName:"trf_rt_amt",           KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
			             {Type:"Float",     Hidden:0,  Width:70,   Align:"Right",   ColMerge:1,   SaveName:"rat_as_cntr_qty",      KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"per_tp_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0},
			             {Type:"Float",     Hidden:0,  Width:70,   Align:"Right",   ColMerge:1,   SaveName:"chg_amt",              KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0},
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"inv_xch_rt",           KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:7,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"tj_src_nm",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ar_if_no",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ar_if_ser_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"chg_seq",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"inv_xch_rt_dt",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rep_chg_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"chg_full_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"trf_no",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"sob_id",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"inv_rev_tp_src_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_co_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_rgn_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_ctr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_acct_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_inter_co_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_vsl_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_voy_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_skd_dir_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_dir_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"acct_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"tva_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"chg_rmk",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"mnl_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"mf_div_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"new_ser_no",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"new_chg_seq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"dp_prcs_knt",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ida_oft_expt_flg",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
			      InitColumns(cols);
			      SetEditable(1);
			      SetSheetHeight(137);
			      SetWaitImageVisible(0);
			      ShowSubSum([{StdCol:"curr_cd", SumCols:"chg_amt", Sort:0,   CaptionCol:3, CaptionText:"%col"}]);
			      
	            }
			break;	
		case "t1sheet1":   			
		    with(sheetObj){
			      var HeadTitle="|Seq.|CHG|Cur|Rate|Rated As|Per|Amount|inv_xch_rt|tj_src_nm|ar_if_no|ar_if_ser_no|chg_seq|inv_xch_rt_dt|rep_chg_cd|chg_full_nm|trf_no|sob_id|inv_rev_tp_src_cd|rev_coa_co_cd"+
			      "|rev_coa_rgn_cd|rev_coa_ctr_cd|rev_coa_acct_cd|rev_coa_inter_co_cd|rev_coa_vsl_cd|rev_coa_voy_no|rev_coa_skd_dir_cd|rev_coa_dir_cd|acct_cd|tva_flg|chg_rmk|mnl_flg|mf_div_cd||||";
			      var headCount=ComCountHeadTitle(HeadTitle);
			      var rowCnt=0;
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag",               KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"Seq",                  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0},
			             {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"chg_cd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0},
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"curr_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0},
			             {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:1,   SaveName:"trf_rt_amt",           KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
			             {Type:"Float",     Hidden:0,  Width:70,   Align:"Right",   ColMerge:1,   SaveName:"rat_as_cntr_qty",      KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"per_tp_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0},
			             {Type:"Float",     Hidden:0,  Width:70,   Align:"Right",   ColMerge:1,   SaveName:"chg_amt",              KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0},
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"inv_xch_rt",           KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:7,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"tj_src_nm",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ar_if_no",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ar_if_ser_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"chg_seq",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"inv_xch_rt_dt",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rep_chg_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"chg_full_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"trf_no",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"sob_id",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"inv_rev_tp_src_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_co_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_rgn_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_ctr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_acct_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_inter_co_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_vsl_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_voy_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_skd_dir_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_dir_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"acct_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"tva_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"chg_rmk",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"mnl_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"mf_div_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"new_ser_no",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"new_chg_seq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"dp_prcs_knt",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ida_oft_expt_flg",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
			      InitColumns(cols);
			      SetEditable(1);
			      SetSheetHeight(137);
			      SetWaitImageVisible(0);
			      ShowSubSum([{StdCol:"curr_cd", SumCols:"chg_amt", Sort:0,   CaptionCol:3, CaptionText:"%col"}]);
			      
	            }
			break;
		case "t2sheet1":   			
		    with(sheetObj){
			      var HeadTitle="|Seq.|CHG|Cur|Rate|Rated As|Per|Amount|inv_xch_rt|tj_src_nm|ar_if_no|ar_if_ser_no|chg_seq|inv_xch_rt_dt|rep_chg_cd|chg_full_nm|trf_no|sob_id|inv_rev_tp_src_cd|rev_coa_co_cd"+
			      "|rev_coa_rgn_cd|rev_coa_ctr_cd|rev_coa_acct_cd|rev_coa_inter_co_cd|rev_coa_vsl_cd|rev_coa_voy_no|rev_coa_skd_dir_cd|rev_coa_dir_cd|acct_cd|tva_flg|chg_rmk|mnl_flg|mf_div_cd||||";
			      var headCount=ComCountHeadTitle(HeadTitle);
			      var rowCnt=0;
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag",               KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"Seq",                  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"chg_cd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0},
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"curr_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0},
			             {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:1,   SaveName:"trf_rt_amt",           KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
			             {Type:"Float",     Hidden:0,  Width:70,   Align:"Right",   ColMerge:1,   SaveName:"rat_as_cntr_qty",      KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"per_tp_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Float",     Hidden:0,  Width:70,   Align:"Right",   ColMerge:1,   SaveName:"chg_amt",              KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0},
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"inv_xch_rt",           KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:7,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"tj_src_nm",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ar_if_no",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ar_if_ser_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"chg_seq",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"inv_xch_rt_dt",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rep_chg_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"chg_full_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"trf_no",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"sob_id",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"inv_rev_tp_src_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_co_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_rgn_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_ctr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_acct_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_inter_co_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_vsl_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_voy_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_skd_dir_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_dir_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"acct_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"tva_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"chg_rmk",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"mnl_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"mf_div_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"new_ser_no",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"new_chg_seq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"dp_prcs_knt",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ida_oft_expt_flg",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
			      InitColumns(cols);
			      SetEditable(1);
			      SetSheetHeight(137);
			      SetWaitImageVisible(0);
			      ShowSubSum([{StdCol:"curr_cd", SumCols:"chg_amt", Sort:0,   CaptionCol:3, CaptionText:"%col"}]);
			      
	            }
			break;
		case "t3sheet1":   			
            with(sheetObj){
				var HeadTitle="|Seq.|CHG|Cur|Rate|Rated As|Per|Amount|inv_xch_rt|tj_src_nm|ar_if_no|ar_if_ser_no|chg_seq|inv_xch_rt_dt|rep_chg_cd|chg_full_nm|trf_no|sob_id|inv_rev_tp_src_cd|rev_coa_co_cd"+
				"|rev_coa_rgn_cd|rev_coa_ctr_cd|rev_coa_acct_cd|rev_coa_inter_co_cd|rev_coa_vsl_cd|rev_coa_voy_no|rev_coa_skd_dir_cd|rev_coa_dir_cd|acct_cd|tva_flg|chg_rmk|mnl_flg|mf_div_cd||||";
				var headCount=ComCountHeadTitle(HeadTitle);
				var rowCnt=0;
				SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
				var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
				var headers = [ { Text:HeadTitle, Align:"Center"} ];
				InitHeaders(headers, info);
				var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag",               KeyField:0,   CalcLogic:"",   Format:"" },
							{Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"Seq",                  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0},
							{Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"chg_cd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0},
							{Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"curr_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:1,   SaveName:"trf_rt_amt",           KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
							{Type:"Float",     Hidden:0,  Width:70,   Align:"Right",   ColMerge:1,   SaveName:"rat_as_cntr_qty",      KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
							{Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"per_tp_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0},
							{Type:"Float",     Hidden:0,  Width:70,   Align:"Right",   ColMerge:1,   SaveName:"chg_amt",              KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"inv_xch_rt",           KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:7,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"tj_src_nm",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ar_if_no",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ar_if_ser_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"chg_seq",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"inv_xch_rt_dt",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rep_chg_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"chg_full_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"trf_no",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"sob_id",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"inv_rev_tp_src_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_co_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_rgn_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_ctr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_acct_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_inter_co_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_vsl_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_voy_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_skd_dir_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_dir_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"acct_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"tva_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"chg_rmk",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"mnl_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"mf_div_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"new_ser_no",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"new_chg_seq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"dp_prcs_knt",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				            {Type:"Text",      Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ida_oft_expt_flg",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
				InitColumns(cols);
				SetEditable(1);
				SetSheetHeight(137);
				SetWaitImageVisible(0);
				ShowSubSum([{StdCol:"curr_cd", SumCols:"chg_amt", Sort:0,   CaptionCol:3, CaptionText:"%col"}]);
			      
        	}
            break;
		case "t4sheet1":   			
		    with(sheetObj){
			      var HeadTitle="|Seq.|CHG|Cur|Rate|Rated As|Per|Amount|inv_xch_rt|tj_src_nm|ar_if_no|ar_if_ser_no|chg_seq|inv_xch_rt_dt|rep_chg_cd|chg_full_nm|trf_no|sob_id|inv_rev_tp_src_cd|rev_coa_co_cd"+
			      "|rev_coa_rgn_cd|rev_coa_ctr_cd|rev_coa_acct_cd|rev_coa_inter_co_cd|rev_coa_vsl_cd|rev_coa_voy_no|rev_coa_skd_dir_cd|rev_coa_dir_cd|acct_cd|tva_flg|chg_rmk|mnl_flg|mf_div_cd||||";
			      var headCount=ComCountHeadTitle(HeadTitle);
			      var rowCnt=0;
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag",               KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"Seq",                  KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"chg_cd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:"curr_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Float",     Hidden:0, Width:80,   Align:"Right",   ColMerge:1,   SaveName:"trf_rt_amt",           KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
			             {Type:"Float",     Hidden:0, Width:70,   Align:"Right",   ColMerge:1,   SaveName:"rat_as_cntr_qty",      KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
			             {Type:"Text",      Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:"per_tp_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Float",     Hidden:0, Width:70,   Align:"Right",   ColMerge:1,   SaveName:"chg_amt",              KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"inv_xch_rt",           KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:7,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"tj_src_nm",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ar_if_no",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ar_if_ser_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"chg_seq",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"inv_xch_rt_dt",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rep_chg_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"chg_full_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"trf_no",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"sob_id",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"inv_rev_tp_src_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_co_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_rgn_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_ctr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_acct_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_inter_co_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_vsl_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_voy_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_skd_dir_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"rev_coa_dir_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"acct_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"tva_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"chg_rmk",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"mnl_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"mf_div_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"new_ser_no",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"new_chg_seq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"dp_prcs_knt",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ida_oft_expt_flg",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
			      InitColumns(cols);
			      SetEditable(1);
			      SetSheetHeight(137);
			      SetWaitImageVisible(0);
			      ShowSubSum([{StdCol:"curr_cd", SumCols:"chg_amt", Sort:0,   CaptionCol:3, CaptionText:"%col"}]);
			      
	            }
			break;			
		case "s0sheet1":      //sheet1 init
		    with(sheetObj){
			      var HeadTitle="|ar_if_no|act_cust_cnt_cd|act_cust_seq|bkg_teu_qty|bkg_feu_qty|inv_ref_no|co_stf_ctnt|inv_rmk|io_bnd_cd|sail_dt|cust_cd|bfr_inv_curr_cd";
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
			             {Type:"Text",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"ar_if_no",         KeyField:1 },
			             {Type:"Text",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"act_cust_cnt_cd",  KeyField:1 },
			             {Type:"Text",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"act_cust_seq",     KeyField:1 },
			             {Type:"Text",     Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"bkg_teu_qty" },
			             {Type:"Text",     Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"bkg_feu_qty" },
			             {Type:"Text",     Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"inv_ref_no" },
			             {Type:"Text",     Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"co_stf_ctnt" },
			             {Type:"Text",     Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"inv_rmk" },
			             {Type:"Text",     Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"io_bnd_cd" },
			             {Type:"Text",     Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"sail_arr_dt" },
			             {Type:"Text",     Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"cust_cd" },
			             {Type:"Text",     Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"bfr_inv_curr_cd" } ];
			      InitColumns(cols);
			      SetEditable(1);
			      SetVisible(false);
			      SetWaitImageVisible(0);
	            }
		    break;
		case "s0sheet2":   			
		    with(sheetObj){
			      var HeadTitle="|ar_if_no|ar_if_ser_no|chg_seq|chg_cd|rat_as_cntr_qty|trf_rt_amt|per_tp_cd|curr_cd|chg_amt|inv_xch_rt|tj_src_nm|inv_xch_rt_dt|rep_chg_cd|chg_full_nm|trf_no|sob_id|inv_rev_tp_src_cd|rev_coa_co_cd"+
			      "|rev_coa_rgn_cd|rev_coa_ctr_cd|rev_coa_acct_cd|rev_coa_inter_co_cd|rev_coa_vsl_cd|rev_coa_voy_no|rev_coa_skd_dir_cd|rev_coa_dir_cd|acct_cd|tva_flg|chg_rmk|mnl_flg|mf_div_cd|ar_if_chg_seq|ida_oft_expt_flg";
			      var headCount=ComCountHeadTitle(HeadTitle);
			      var rowCnt=0;
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag",               KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"ar_if_no",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"ar_if_ser_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"chg_seq",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"chg_cd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Float",     Hidden:0,  Width:70,   Align:"Right",   ColMerge:1,   SaveName:"rat_as_cntr_qty",      KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:1,   SaveName:"trf_rt_amt",           KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"per_tp_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"curr_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Float",     Hidden:0,  Width:70,   Align:"Right",   ColMerge:1,   SaveName:"chg_amt",              KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Float",     Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"inv_xch_rt",           KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:7,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"tj_src_nm",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"inv_xch_rt_dt",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"rep_chg_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"chg_full_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"trf_no",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"sob_id",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"inv_rev_tp_src_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"rev_coa_co_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"rev_coa_rgn_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"rev_coa_ctr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"rev_coa_acct_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"rev_coa_inter_co_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"rev_coa_vsl_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"rev_coa_voy_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"rev_coa_skd_dir_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"rev_coa_dir_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"acct_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"tva_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"chg_rmk",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"mnl_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"mf_div_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"ar_if_chg_seq",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"ida_oft_expt_flg",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }];
			      InitColumns(cols);
			      SetEditable(1);
			      SetVisible(false);
			      SetWaitImageVisible(0);
	            }
			break;	
		case "s0sheet3":      //container
		    with(sheetObj){
			      var HeadTitle="|ar_if_no|ar_if_ser_no|tj_src_nm|curr_cd|inv_amt";
			      var headCount=ComCountHeadTitle(HeadTitle);
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
			             {Type:"Text",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"ar_if_no" },
			             {Type:"Text",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"ar_if_ser_no" },
			             {Type:"Text",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"tj_src_nm" },
			             {Type:"Text",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"curr_cd" },
			             {Type:"Text",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"inv_amt" } ];
			      InitColumns(cols);
			      SetEditable(1);
			      SetVisible(false);
			      SetWaitImageVisible(0);
	            }
		    break;
		case "s0sheet4":      //container
		    with(sheetObj){
			      var HeadTitle="|check||ar_if_no|cntr_seq|cntr_tpsz_cd|cntr_no";
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
			             {Type:"CheckBox",  Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"check" },
			             {Type:"Text",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"ar_if_no" },
			             {Type:"Text",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"cntr_seq" },
			             {Type:"Text",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"cntr_tpsz_cd" },
			             {Type:"Text",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"cntr_no" } ];
			      InitColumns(cols);
			      SetEditable(1);
			      SetVisible(false);
			      SetWaitImageVisible(0);
	            }
		    break;
		case "s0sheet5":      //container
		    with(sheetObj){
			      var HeadTitle="|if_no|cancel_if_no|max_if_no|m_if_no";
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
			             {Type:"Text",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"if_no" },
			             {Type:"Text",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"cancel_if_no" },
			             {Type:"Text",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"max_if_no" },
			             {Type:"Text",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"m_if_no" } ];
			      InitColumns(cols);
			      SetEditable(1);
			      SetVisible(false);
			      SetWaitImageVisible(0);
	            }
		    break;
		case "s0sheet6":           // CustomerListForIssue
		    with(sheetObj){		      
		      var HeadTitle1="|ACT_CUST_CNT_CD|ACT_CUST_SEQ|DEFAULT_INVOICE_CURRENCY|BL_SRC_NO|TARGET_YN";
		      
		      var headCount=ComCountHeadTitle(HeadTitle1) ;
		      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
		      var info    = { Sort:0, ColMove:1, HeaderCheck:0, ColResize:1 };
		      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
		      InitHeaders(headers, info);
		      var cols = [ {Type:"Status",    Hidden:1,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
			               {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"act_cust_cnt_cd",          KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"act_cust_seq",             KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"Text",      Hidden:0,  Width:200,  Align:"Center",  ColMerge:0,   SaveName:prefix+"dflt_inv_curr_div_cd",	    KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"bl_src_no",               	KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"target_yn",               	KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
			               
			               
			  InitColumns(cols);
			  SetEditable(1);
			  SetSheetHeight(200);
	      }
		   break;  
		}
	}
	/** 
	 * Coding retrieve, save... <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj : Sheet object.  
	 * @param  {object} formObj : Form object.
	 * @param  {sAction} sAction : f_cmd.
	 * @return none.
	 * @see #
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	var f_Search = 0;
	function doActionIBSheet(sheetObj,formObj,sAction) {
		sheetObj.ShowDebugMsg(false);
		switch(sAction) {
		case IBSEARCH_ASYNC01: // Retrieve AR_OFFICE_LIST.
			ComOpenWait(true);
			//formObj.f_cmd.value=SEARCH02;
			formObj.f_cmd.value=SEARCH17;
			var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
			var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
			arrOffice = sStr.split("|");
			ComOpenWait(false);
			
			MakeComboObject2(ar_ofc_cd, arrOffice);
	
			break;
		case IBSEARCH:      //retrieve
			if(validateForm(sheetObj,formObj,sAction)){
				ComOpenWait(true);
				if(f_Search==0){
					f_Search = 1;
					for(i=4;i<sheetObjects.length;i++){
						ComConfigSheet (sheetObjects[i] );	
						initSheet(sheetObjects[i],i+1);
						ComEndConfigSheet(sheetObjects[i]);	
					}
				}
				tabObjects[0].RemoveAll();
				formObj.f_cmd.value=SEARCH;
				var sXml=sheetObj.GetSearchData("FNS_INV_0033GS.do" , FormQueryString(formObj));
				var arrXml=sXml.split("|$$|");
				if ( arrXml[0] != null)	{
					sheetObjects[0].LoadSearchData(arrXml[0],{Sync:1} );
				}
				if ( arrXml[1] != null)	{
					sheetObjects[1].LoadSearchData(arrXml[1],{Sync:1} );
				}	
				if ( arrXml[2] != null)	{
					sheetObjects[2].LoadSearchData(arrXml[2],{Sync:1} );
				}
				if ( arrXml[4] != null)	{
					sheetObjects[3].LoadSearchData(arrXml[4],{Sync:1} );
				}
				if ( arrXml[3] != null)	{
					sheetObjects[13].LoadSearchData(arrXml[3],{Sync:1} );
				}
				if(ComGetEtcData(arrXml[0],"TRANS_RESULT_KEY")=="F"){
					ComOpenWait(false);
					document.form.inv_no.select();
					fncResetAll();
					return;
				}
				IBS_CopyRowToForm(sheetObjects[0],document.form, 1,"frm_") ;  
				IBS_CopyRowToForm(sheetObjects[3],document.form, 1,"frm_") ; 
				
				document.form.inv_curr_cd.value = document.form.frm_inv_curr_cd.value;
				formObj.frm_dflt_inv_curr_div_cd.value=sheetObjects[0].GetCellText(1, "dflt_inv_curr_div_cd");
				
				formObj.frm_sail_arr_dt.value=sheetObjects[0].GetCellText(1, "sail_arr_dt");
				formObj.frm_iss_dt.value=sheetObjects[0].GetCellText(1, "iss_dt");
				formObj.frm_port_cd.value=sheetObjects[0].GetCellValue(1, "io_bnd_cd")=="I/B"?sheetObjects[0].GetCellValue(1, "pod_cd"):sheetObjects[0].GetCellValue(1, "pol_cd");
				var sStr=ComGetEtcData(arrXml[0],"max_seq");
				formObj.max_seq.value=sStr;
				formObj.if_no.value=sheetObjects[13].GetCellValue(1,"max_if_no")==""?sheetObjects[13].GetCellValue(1,"m_if_no"):sheetObjects[13].GetCellValue(1,"max_if_no");
				for(k=0;k<tabObjects.length;k++){
					initTab(tabObjects[k],k+1);
				}
				var split_cnt=document.form.split_cnt.value;
				if(split_cnt!=''&&sStr!=''){
					for(cnt=0;cnt < split_cnt; cnt++){
						for(i=0;i<sheetObjects.length;i++){
							if(sheetObjects[i].id=="t"+cnt+"sheet1"){
								sheetObjects[i].LoadSearchData(arrXml[1],{Sync:1} );
								for(k=1;k<=sheetObjects[i].RowCount();k++){
									sheetObjects[i].SetCellValue(k,"ar_if_no",tabObjects[0].GetTabTitle(cnt));
									currPoint=sheetObjects[i].GetCellValue(k,"dp_prcs_knt");
									if (currPoint == '0') {
										sheetObjects[i].InitCellProperty(k, "chg_amt",{ Type:"Data",Align:"Right",Format:"Int"} );
									}
									else {
										sheetObjects[i].InitCellProperty(k, "chg_amt",{ Type:"Data",Align:"Right",Format:"NullFloat",PointCount:currPoint} );
									}
								}
							}
						}
						document.form.inv_ref_no[cnt].value=sheetObjects[0].GetCellValue(1,"inv_ref_no");
						document.form.co_stf_ctnt[cnt].value=document.form.user_nm.value;	
						for(x=1;x<sheetObjects[2].RowCount()+1;x++){
							var nRow=sheetObjects[12].DataInsert(-1);
							sheetObjects[12].SetCellValue(nRow,"ar_if_no",tabObjects[0].GetTabTitle(cnt));
						sheetObjects[12].SetCellValue(nRow,"cntr_seq",sheetObjects[2].GetCellValue(x,"cntr_seq"));
						sheetObjects[12].SetCellValue(nRow,"cntr_no",sheetObjects[2].GetCellValue(x,"cntr_no"));
						sheetObjects[12].SetCellValue(nRow,"cntr_tpsz_cd",sheetObjects[2].GetCellValue(x,"cntr_tpsz_cd"));
						}
						formObj.bkg_teu_qty[cnt].value=formObj.frm_bkg_teu_qty.value;
						formObj.bkg_feu_qty[cnt].value=formObj.frm_bkg_feu_qty.value;
					}
				}
				reSum(sheetObjects[4]);
				ComOpenWait(false);
				beforetab=bfrTabIdx;
				tabObjects[0].SetSelectedIndex(0);
			}
			break;
		case IBSAVE:        //save
			
			if(sheetObjects[0].RowCount() < 1) {
				ComShowCodeMessage("INV00091");
				formObj.inv_no.focus();
				break;
			}
			
			if(formObj.split_cnt.value != ""){
				var split_cnt=document.form.split_cnt.value;
				if(split_cnt==2 && tabObjects[0].GetSelectedIndex()!=1){
					tabObjects[0].SetSelectedIndex(1); 
				}else if(split_cnt==3 && tabObjects[0].GetSelectedIndex()!=2){
					tabObjects[0].SetSelectedIndex(2); 
				}else if(split_cnt==4 && tabObjects[0].GetSelectedIndex()!=3){
					tabObjects[0].SetSelectedIndex(3); 
				}else if(split_cnt==5 && tabObjects[0].GetSelectedIndex()!=4){
					tabObjects[0].SetSelectedIndex(4); 
				}			
				for(cnt=0;cnt < formObj.split_cnt.value; cnt++){
					sheetObjects[9].DataInsert(-1);
					sheetObjects[9].SetCellValue(cnt+1,"ar_if_no",tabObjects[0].GetTabTitle(cnt));
					sheetObjects[9].SetCellValue(cnt+1,"act_cust_cnt_cd",formObj.act_cust_cnt_cd[cnt].value);
					sheetObjects[9].SetCellValue(cnt+1,"act_cust_seq",formObj.act_cust_seq[cnt].value);
					sheetObjects[9].SetCellValue(cnt+1,"bkg_teu_qty",formObj.bkg_teu_qty[cnt].value);
					sheetObjects[9].SetCellValue(cnt+1,"bkg_feu_qty",formObj.bkg_feu_qty[cnt].value);
					sheetObjects[9].SetCellValue(cnt+1,"inv_ref_no",formObj.inv_ref_no[cnt].value);
					sheetObjects[9].SetCellValue(cnt+1,"co_stf_ctnt",formObj.co_stf_ctnt[cnt].value);
					sheetObjects[9].SetCellValue(cnt+1,"inv_rmk",formObj.inv_rmk[cnt].value);
					sheetObjects[9].SetCellValue(cnt+1,"io_bnd_cd",sheetObjects[0].GetCellValue(1,"io_bnd_cd").substring(0,1));
					sheetObjects[9].SetCellValue(cnt+1,"sail_arr_dt",sheetObjects[0].GetCellValue(1,"sail_arr_dt"));
					sheetObjects[9].SetCellValue(cnt+1,"cust_cd",formObj.act_cust_cnt_cd[cnt].value+formObj.act_cust_seq[cnt].value);
					
					if(cnt == 0) sheetObjects[9].SetCellValue(cnt+1,"bfr_inv_curr_cd",formObj.inv_curr_cd1.value);
					if(cnt == 1) sheetObjects[9].SetCellValue(cnt+1,"bfr_inv_curr_cd",formObj.inv_curr_cd2.value);
					if(cnt == 2) sheetObjects[9].SetCellValue(cnt+1,"bfr_inv_curr_cd",formObj.inv_curr_cd3.value);
					if(cnt == 3) sheetObjects[9].SetCellValue(cnt+1,"bfr_inv_curr_cd",formObj.inv_curr_cd4.value);
					if(cnt == 4) sheetObjects[9].SetCellValue(cnt+1,"bfr_inv_curr_cd",formObj.inv_curr_cd5.value);
					
					for(i=0;i<sheetObjects.length;i++){
						if(sheetObjects[i].id=="t"+cnt+"sheet1"){
							var serNo=0;
							var chgSeq=0;
							var arIfChgSeq=1;
							var prev_tjSrcNm="";
							var prev_curr="";
							var chgAmt=0;
							var c=1;
							for(c; c<=sheetObjects[i].RowCount();c++){
								if(sheetObjects[i].GetCellValue(c,"chg_amt")!="0"&&sheetObjects[i].GetCellValue(c,"Seq")!=""){
									chgSeq=chgSeq + 1;
									if(prev_curr!=sheetObjects[i].GetCellValue(c,"curr_cd")||prev_tjSrcNm!=sheetObjects[i].GetCellValue(c,"tj_src_nm")){
										serNo=serNo+1;
										arIfChgSeq=1;											
									}else{
										serNo=serNo;
										arIfChgSeq=arIfChgSeq+1;
									}
									sheetObjects[i].SetCellValue(c,"new_ser_no",serNo);
									sheetObjects[i].SetCellValue(c,"new_chg_seq",chgSeq);
									prev_curr=sheetObjects[i].GetCellValue(c,"curr_cd");
									prev_tjSrcNm=sheetObjects[i].GetCellValue(c,"tj_src_nm");
									var nRow=sheetObjects[10].DataInsert(-1);
									sheetObjects[10].SetCellValue(nRow,"ar_if_no",sheetObjects[i].GetCellValue(c,"ar_if_no"));
									sheetObjects[10].SetCellValue(nRow,"ar_if_ser_no",sheetObjects[i].GetCellValue(c,"new_ser_no"));
									sheetObjects[10].SetCellValue(nRow,"chg_seq",sheetObjects[i].GetCellValue(c,"new_chg_seq"));
									sheetObjects[10].SetCellValue(nRow,"chg_cd",sheetObjects[i].GetCellValue(c,"chg_cd"));
									sheetObjects[10].SetCellValue(nRow,"rat_as_cntr_qty",sheetObjects[i].GetCellValue(c,"rat_as_cntr_qty"));
									sheetObjects[10].SetCellValue(nRow,"trf_rt_amt",sheetObjects[i].GetCellValue(c,"trf_rt_amt"));
									sheetObjects[10].SetCellValue(nRow,"per_tp_cd",sheetObjects[i].GetCellValue(c,"per_tp_cd"));
									sheetObjects[10].SetCellValue(nRow,"curr_cd",sheetObjects[i].GetCellValue(c,"curr_cd"));
									sheetObjects[10].SetCellValue(nRow,"chg_amt",sheetObjects[i].GetCellValue(c,"chg_amt"));
									sheetObjects[10].SetCellValue(nRow,"inv_xch_rt",sheetObjects[i].GetCellValue(c,"inv_xch_rt"));
									sheetObjects[10].SetCellValue(nRow,"tj_src_nm",sheetObjects[i].GetCellValue(c,"tj_src_nm"));
									sheetObjects[10].SetCellValue(nRow,"inv_xch_rt_dt",sheetObjects[i].GetCellValue(c,"inv_xch_rt_dt"));
									sheetObjects[10].SetCellValue(nRow,"rep_chg_cd",sheetObjects[i].GetCellValue(c,"rep_chg_cd"));
									sheetObjects[10].SetCellValue(nRow,"chg_full_nm",sheetObjects[i].GetCellValue(c,"chg_full_nm"));
									sheetObjects[10].SetCellValue(nRow,"trf_no",sheetObjects[i].GetCellValue(c,"trf_no"));
									sheetObjects[10].SetCellValue(nRow,"sob_id",sheetObjects[i].GetCellValue(c,"sob_id"));
									sheetObjects[10].SetCellValue(nRow,"inv_rev_tp_src_cd",sheetObjects[i].GetCellValue(c,"inv_rev_tp_src_cd"));
									sheetObjects[10].SetCellValue(nRow,"rev_coa_co_cd",sheetObjects[i].GetCellValue(c,"rev_coa_co_cd"));
									sheetObjects[10].SetCellValue(nRow,"rev_coa_rgn_cd",sheetObjects[i].GetCellValue(c,"rev_coa_rgn_cd"));
									sheetObjects[10].SetCellValue(nRow,"rev_coa_ctr_cd",sheetObjects[i].GetCellValue(c,"rev_coa_ctr_cd"));
									sheetObjects[10].SetCellValue(nRow,"rev_coa_acct_cd",sheetObjects[i].GetCellValue(c,"rev_coa_acct_cd"));
									sheetObjects[10].SetCellValue(nRow,"rev_coa_inter_co_cd",sheetObjects[i].GetCellValue(c,"rev_coa_inter_co_cd"));
									sheetObjects[10].SetCellValue(nRow,"rev_coa_vsl_cd",sheetObjects[i].GetCellValue(c,"rev_coa_vsl_cd"));
									sheetObjects[10].SetCellValue(nRow,"rev_coa_voy_no",sheetObjects[i].GetCellValue(c,"rev_coa_voy_no"));
									sheetObjects[10].SetCellValue(nRow,"rev_coa_skd_dir_cd",sheetObjects[i].GetCellValue(c,"rev_coa_skd_dir_cd"));
									sheetObjects[10].SetCellValue(nRow,"rev_coa_dir_cd",sheetObjects[i].GetCellValue(c,"rev_coa_dir_cd"));
									sheetObjects[10].SetCellValue(nRow,"acct_cd",sheetObjects[i].GetCellValue(c,"acct_cd"));
									sheetObjects[10].SetCellValue(nRow,"tva_flg",sheetObjects[i].GetCellValue(c,"tva_flg"));
									sheetObjects[10].SetCellValue(nRow,"chg_rmk",sheetObjects[i].GetCellValue(c,"chg_rmk"));
									sheetObjects[10].SetCellValue(nRow,"mnl_flg",sheetObjects[i].GetCellValue(c,"mnl_flg"));
									sheetObjects[10].SetCellValue(nRow,"mf_div_cd",sheetObjects[i].GetCellValue(c,"mf_div_cd"));
									sheetObjects[10].SetCellValue(nRow,"ar_if_chg_seq",arIfChgSeq);
									sheetObjects[10].SetCellValue(nRow,"ida_oft_expt_flg",sheetObjects[i].GetCellValue(c,"ida_oft_expt_flg"));
								}
							}								
						}
					}
				}
			}
			var amt=0.000;
			var T=Number('1e'+1);
			for(a=1; a<=sheetObjects[10].RowCount();a++){
				var arIfNo=sheetObjects[10].GetCellValue(a,"ar_if_no");
				var arIfSerNo=sheetObjects[10].GetCellValue(a,"ar_if_ser_no");
				var nxtArIfNo=sheetObjects[10].GetCellValue(a+1,"ar_if_no");
				var nxtArIfSerNo=sheetObjects[10].GetCellValue(a+1,"ar_if_ser_no");
				var chgAmt=sheetObjects[10].GetCellValue(a,"chg_amt");
				if(arIfNo == nxtArIfNo && arIfSerNo == nxtArIfSerNo){
					amt=amt + parseFloat(chgAmt);
				}
				if(arIfNo != nxtArIfNo || arIfSerNo != nxtArIfSerNo){
					var nRow=sheetObjects[11].DataInsert(-1);
					sheetObjects[11].SetCellValue(nRow,"ar_if_no",sheetObjects[10].GetCellValue(a,"ar_if_no"));
					sheetObjects[11].SetCellValue(nRow,"ar_if_ser_no",sheetObjects[10].GetCellValue(a,"ar_if_ser_no"));
					sheetObjects[11].SetCellValue(nRow,"tj_src_nm",sheetObjects[10].GetCellValue(a,"tj_src_nm"));
					sheetObjects[11].SetCellValue(nRow,"curr_cd",sheetObjects[10].GetCellValue(a,"curr_cd"));
					sheetObjects[11].SetCellValue(nRow,"inv_amt",(amt + parseFloat(chgAmt))* T / T);
					amt=0;
				}
			}
		
			if(validateForm(sheetObj,formObj,sAction)){		
				if (ComShowCodeConfirm("INV00160")) {
					ComBtnDisable("btn_save");
					formObj.f_cmd.value=MULTI;
					InvOpenWait(true, true);  
					setTimeout( function () {				
						formObj.f_cmd.value=MULTI;
						var mParam = FormQueryString(formObj) + "&" 
									+ ComSetPrifix(sheetObjects[9].GetSaveString(true),"s0sheet1_")  + "&" 
									+ ComSetPrifix(sheetObjects[10].GetSaveString(true),"s0sheet2_") + "&" 
									+ ComSetPrifix(sheetObjects[11].GetSaveString(true),"s0sheet3_") + "&" 
									+ ComSetPrifix(sheetObjects[12].GetSaveString(true),"s0sheet4_") + "&" 
									+ ComSetPrifix(sheetObjects[13].GetSaveString(true),"s0sheet5_");
						
						sheetObj.DoSave("FNS_INV_0033GS.do",{Param:mParam,Quest:"false", Sync:1} );
						ar_ofc_cd.SetSelectText(document.form.ofc_cd.value);					
						
						formObj.inv_no.readOnly=true;
						formObj.split_cnt.readOnly=true;					
						formObj.inv_no.className="input2";
						formObj.split_cnt.className="input2";
						//InvOpenWait(false, true); 						
					} , 100);
	        	} else {
	        		break;
	        	}
				
			}
		
			break;
		case IBINSERT:      //input
			formObj.bl_nos.value="'"+ formObj.frm_bl_src_no.value + "'";
			var arrStr2=ar_ofc_cd.GetSelectCode().split("^");			
			formObj.svr_id.value=arrStr2[7]; 			    
			formObj.ots_smry_cd.value=arrStr2[13]; 	
			formObj.inv_dup_flg.value=arrStr2[14]; 
			formObj.inv_mlt_bl_iss_flg.value=arrStr2[15]; 	   		    
			formObj.cust_cnt_cd.value="";
			formObj.cust_seq.value="";
			formObj.ar_ofc_cd2.value= formObj.ofc.value;
			formObj.office_cnt_cd.value = arrStr2[6].substring(0,2);
			
			formObj.f_cmd.value=MULTI;
	
			//var sXml=sheetObj.GetSearchData("FNS_INV_0034_01GS.do", FormQueryString(formObj));
			
			
			var sParam1=ComGetSaveString(sheetObjects[14], true, true);
			if(sParam1 == "" ){
				ComShowCodeMessage("INV00097");
				return;
			}
	        
			var sParam = sParam1 +"&" +FormQueryString(formObj);
			ComOpenWait(true);
			
	        var sXml=sheetObj.GetSearchData("FNS_INV_0034_01GS.do", sParam, {Sync:1});
	        
	        ComOpenWait(false);
			var arrXml=sXml.split("|$$|");
			var backEndJobKey=ComGetEtcData(arrXml[0], "BackEndJobKey");
			if(backEndJobKey.length > 0) {
				formObj.backendjob_key.value=backEndJobKey;
				sheetObj.SetWaitImageVisible(0);
				ComOpenWait(true);
				sheetObj.SetWaitTimeOut(10000);
				timer=setInterval(getBackEndJobStatus, 3000);
			}
			break;
		case IBSEARCH_ASYNC10: // Number of copy invoice retrieve
			var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
			formObj.ar_ofc_cd2.value=arrStr2[1];
			
			formObj.f_cmd.value=SEARCH;
			var sXml=sheetObj.GetSearchData("FNS_INV_0034_01GS.do", FormQueryString(formObj));
			formObj.copy_cnt.value=ComGetEtcData(sXml,"copy_cnt");
			var sStr=ComGetEtcData(sXml,"inv_prn_dvc_nm");
			formObj.print_nm.value=sStr;
			break;
		case IBSEARCH_ASYNC20: // Tax country retrieve
			var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
			formObj.ar_ofc_cd2.value=arrStr2[1];
			formObj.f_cmd.value=SEARCH02;
	 		var sXml=sheetObj.GetSearchData("FNS_INV_0033GS.do", FormQueryString(formObj));
			var sStr=ComGetEtcData(sXml,"tax_cnt_flg");
			initTaxCnt = sStr;
			formObj.tax_cnt_flg.value=initTaxCnt;
			break;
		}
	}
	/**
	 * Register IBTab object on array.
	 * 
	 * Array define top on source.
	 */
	function setTabObject(tab_obj){
		tabObjects[tabCnt++]=tab_obj;
	}
	/**
	 * Setting default values for tab.
	 * Setting tap's items.
	 */
	function initTab(tabObj , tabNo) {
		switch(tabNo) {
		case 1:
			with (tabObj) {
				var cnt=0 ;				
				var max_seq=document.form.max_seq.value;
				var if_seq = max_seq.split("^");
				var split_cnt=document.form.split_cnt.value;
				//var min_seq=max_seq-split_cnt+1;
				if(split_cnt!=''&&max_seq!=''){
					for(cnt=0;cnt < split_cnt; cnt++){
//						InsertItem( document.form.ofc.value.substring(0,"0")+document.form.ofc.value.substring(0,3)+ComLpad(min_seq));
						InsertItem(document.form.ofc.value.substring(0,3) + ComLpad(if_seq[cnt+1], 8, "0"),"");
						//min_seq=min_seq+1;						
					}
				}
				//cancelIfSeq=max_seq-split_cnt
				document.form.cancel_if_no.value=document.form.ofc.value.substring(0,3)+ComLpad(if_seq[0], 8, "0");
			}
			break;
		}
	}
	/**
	 * Tap click event.
	 * Activating selected tab.
	 */
	function tab1_OnChange(tabObj , nItem){	
		var objs=document.all.item("tabLayer");
		objs[nItem].style.display="Inline";
		objs[beforetab].style.display="none";
		objs[beforetab].style.zIndex=objs[nItem].style.zIndex -1 ;
		var split_cnt=document.form.split_cnt.value;
		
		if(split_cnt == 2 && nItem == 1){	
			for(i=1; i<=sheetObjects[1].RowCount();i++){
				var mst_seq=sheetObjects[1].GetCellValue(i,"Seq");
				var tab_row;
				
				for(j=1; j<=sheetObjects[4].RowCount();j++){					
					if(sheetObjects[4].GetCellValue(j,"Seq")==mst_seq){					
						tab_row = j;
						continue;
					}
				}
							
				
				var mst_rat_as_cntr_qty=sheetObjects[1].GetCellValue(i,"rat_as_cntr_qty");
				var mst_trf_rt_amt=sheetObjects[1].GetCellValue(i,"trf_rt_amt");
				
				
				var tab1_rat_as_cntr_qty=sheetObjects[4].GetCellValue(tab_row,"rat_as_cntr_qty");
				var tab1_trf_rt_amt=sheetObjects[4].GetCellValue(tab_row,"trf_rt_amt");
			
				if(mst_rat_as_cntr_qty == tab1_rat_as_cntr_qty && mst_trf_rt_amt == tab1_trf_rt_amt){
					sheetObjects[5].SetCellValue(tab_row,"trf_rt_amt",mst_trf_rt_amt-tab1_trf_rt_amt,0);
					sheetObjects[5].SetCellValue(tab_row,"rat_as_cntr_qty",mst_rat_as_cntr_qty,0);
				}
				if(mst_rat_as_cntr_qty != tab1_rat_as_cntr_qty){
					sheetObjects[5].SetCellValue(tab_row,"rat_as_cntr_qty",mst_rat_as_cntr_qty-tab1_rat_as_cntr_qty,0);
					sheetObjects[5].SetCellValue(tab_row,"trf_rt_amt",mst_trf_rt_amt,0);
				}
				if(mst_trf_rt_amt != tab1_trf_rt_amt){
					sheetObjects[5].SetCellValue(tab_row,"trf_rt_amt",mst_trf_rt_amt-tab1_trf_rt_amt,0);
					sheetObjects[5].SetCellValue(tab_row,"rat_as_cntr_qty",mst_rat_as_cntr_qty,0);
				}
				if(sheetObjects[1].GetCellValue(i,"per_tp_cd")!='PC'){
					sheetObjects[5].SetCellValue(tab_row,"chg_amt",InvRound(sheetObjects[5].GetCellValue(tab_row,"rat_as_cntr_qty")*sheetObjects[5].GetCellValue(tab_row,"trf_rt_amt"),sheetObjects[5].GetCellValue(tab_row,"dp_prcs_knt")),0);
				}else{
					sheetObjects[5].SetCellValue(tab_row,"chg_amt",InvRound(sheetObjects[5].GetCellValue(tab_row,"rat_as_cntr_qty")*sheetObjects[5].GetCellValue(tab_row,"trf_rt_amt")/100,sheetObjects[5].GetCellValue(tab_row,"dp_prcs_knt")),0);
				}				
			}
			reSum(sheetObjects[5]);
		}
		if(split_cnt == 3 && nItem == 2){
			for(i=1; i<=sheetObjects[1].RowCount();i++){
				
				var mst_seq=sheetObjects[1].GetCellValue(i,"Seq");
				var tab_row;
				
				for(j=1; j<=sheetObjects[4].RowCount();j++){					
					if(sheetObjects[4].GetCellValue(j,"Seq")==mst_seq){					
						tab_row = j;
						continue;
					}
				}
							
				
				var mst_rat_as_cntr_qty=sheetObjects[1].GetCellValue(i,"rat_as_cntr_qty");
				var mst_trf_rt_amt=sheetObjects[1].GetCellValue(i,"trf_rt_amt");
				var tab1_rat_as_cntr_qty=sheetObjects[4].GetCellValue(tab_row,"rat_as_cntr_qty");
				var tab1_trf_rt_amt=sheetObjects[4].GetCellValue(tab_row,"trf_rt_amt");
				var tab2_rat_as_cntr_qty=sheetObjects[5].GetCellValue(tab_row,"rat_as_cntr_qty");
				var tab2_trf_rt_amt=sheetObjects[5].GetCellValue(tab_row,"trf_rt_amt");
				if((mst_rat_as_cntr_qty == tab1_rat_as_cntr_qty && mst_trf_rt_amt == tab1_trf_rt_amt) ||
						(mst_rat_as_cntr_qty == tab2_rat_as_cntr_qty && mst_trf_rt_amt == tab2_trf_rt_amt)){
					sheetObjects[6].SetCellValue(tab_row,"trf_rt_amt",mst_trf_rt_amt-tab1_trf_rt_amt,0);
					sheetObjects[6].SetCellValue(tab_row,"rat_as_cntr_qty",mst_rat_as_cntr_qty,0);
				}				
				if(mst_rat_as_cntr_qty != tab1_rat_as_cntr_qty || mst_rat_as_cntr_qty != tab2_rat_as_cntr_qty){
					sheetObjects[6].SetCellValue(tab_row,"rat_as_cntr_qty",mst_rat_as_cntr_qty - tab1_rat_as_cntr_qty - tab2_rat_as_cntr_qty,0);
					sheetObjects[6].SetCellValue(tab_row,"trf_rt_amt",mst_trf_rt_amt,0);
				}
				if(mst_trf_rt_amt != tab1_trf_rt_amt || mst_trf_rt_amt != tab2_trf_rt_amt){
					sheetObjects[6].SetCellValue(tab_row,"trf_rt_amt",mst_trf_rt_amt - tab1_trf_rt_amt - tab2_trf_rt_amt,0);
					sheetObjects[6].SetCellValue(tab_row,"rat_as_cntr_qty",mst_rat_as_cntr_qty,0);
				}
				if(sheetObjects[1].GetCellValue(i,"per_tp_cd")!='PC'){
					sheetObjects[6].SetCellValue(tab_row,"chg_amt",InvRound(sheetObjects[6].GetCellValue(tab_row,"rat_as_cntr_qty")*sheetObjects[6].GetCellValue(tab_row,"trf_rt_amt"),sheetObjects[6].GetCellValue(tab_row,"dp_prcs_knt")),0);
				}else{
					sheetObjects[6].SetCellValue(tab_row,"chg_amt",InvRound(sheetObjects[6].GetCellValue(tab_row,"rat_as_cntr_qty")*sheetObjects[6].GetCellValue(tab_row,"trf_rt_amt")/100,sheetObjects[6].GetCellValue(tab_row,"dp_prcs_knt")),0);
				}				
			}
			reSum(sheetObjects[6]);
		}
		if(split_cnt == 4 && nItem == 3){
			for(i=1; i<=sheetObjects[1].RowCount();i++){
				
				var mst_seq=sheetObjects[1].GetCellValue(i,"Seq");
				var tab_row;
				
				for(j=1; j<=sheetObjects[4].RowCount();j++){					
					if(sheetObjects[4].GetCellValue(j,"Seq")==mst_seq){					
						tab_row = j;
						continue;
					}
				}
							
				
				var mst_rat_as_cntr_qty=sheetObjects[1].GetCellValue(i,"rat_as_cntr_qty");
				var mst_trf_rt_amt=sheetObjects[1].GetCellValue(i,"trf_rt_amt");
				var tab1_rat_as_cntr_qty=sheetObjects[4].GetCellValue(tab_row,"rat_as_cntr_qty");
				var tab1_trf_rt_amt=sheetObjects[4].GetCellValue(tab_row,"trf_rt_amt");
				var tab2_rat_as_cntr_qty=sheetObjects[5].GetCellValue(tab_row,"rat_as_cntr_qty");
				var tab2_trf_rt_amt=sheetObjects[5].GetCellValue(tab_row,"trf_rt_amt");
				var tab3_rat_as_cntr_qty=sheetObjects[6].GetCellValue(tab_row,"rat_as_cntr_qty");
				var tab3_trf_rt_amt=sheetObjects[6].GetCellValue(tab_row,"trf_rt_amt");
				if((mst_rat_as_cntr_qty == tab1_rat_as_cntr_qty && mst_trf_rt_amt == tab1_trf_rt_amt) ||
						(mst_rat_as_cntr_qty == tab2_rat_as_cntr_qty && mst_trf_rt_amt == tab2_trf_rt_amt) ||
						(mst_rat_as_cntr_qty == tab3_rat_as_cntr_qty && mst_trf_rt_amt == tab3_trf_rt_amt)) {
					sheetObjects[7].SetCellValue(tab_row,"trf_rt_amt",mst_trf_rt_amt-tab1_trf_rt_amt,0);
					sheetObjects[7].SetCellValue(tab_row,"rat_as_cntr_qty",mst_rat_as_cntr_qty,0);
				}				
				if(mst_rat_as_cntr_qty != tab1_rat_as_cntr_qty || mst_rat_as_cntr_qty != tab2_rat_as_cntr_qty || mst_rat_as_cntr_qty != tab3_rat_as_cntr_qty){
					sheetObjects[7].SetCellValue(tab_row,"rat_as_cntr_qty",mst_rat_as_cntr_qty - tab1_rat_as_cntr_qty - tab2_rat_as_cntr_qty - tab3_rat_as_cntr_qty,0);
					sheetObjects[7].SetCellValue(tab_row,"trf_rt_amt",mst_trf_rt_amt,0);
				}
				if(mst_trf_rt_amt != tab1_trf_rt_amt || mst_trf_rt_amt != tab2_trf_rt_amt || mst_trf_rt_amt != tab3_trf_rt_amt){
					sheetObjects[7].SetCellValue(tab_row,"trf_rt_amt",mst_trf_rt_amt - tab1_trf_rt_amt - tab2_trf_rt_amt - tab3_trf_rt_amt,0);
					sheetObjects[7].SetCellValue(tab_row,"rat_as_cntr_qty",mst_rat_as_cntr_qty,0);
				}
				if(sheetObjects[1].GetCellValue(i,"per_tp_cd")!='PC'){
					sheetObjects[7].SetCellValue(tab_row,"chg_amt",InvRound(sheetObjects[7].GetCellValue(tab_row,"rat_as_cntr_qty")*sheetObjects[7].GetCellValue(tab_row,"trf_rt_amt"),sheetObjects[7].GetCellValue(tab_row,"dp_prcs_knt")),0);
				}else{
					sheetObjects[7].SetCellValue(tab_row,"chg_amt",InvRound(sheetObjects[7].GetCellValue(tab_row,"rat_as_cntr_qty")*sheetObjects[7].GetCellValue(tab_row,"trf_rt_amt")/100,sheetObjects[7].GetCellValue(tab_row,"dp_prcs_knt")),0);
				}				
			}
			reSum(sheetObjects[7]);
		}
		if(split_cnt == 5 && nItem == 4){
			for(i=1; i<=sheetObjects[1].RowCount();i++){
				
				var mst_seq=sheetObjects[1].GetCellValue(i,"Seq");
				var tab_row;
				
				for(j=1; j<=sheetObjects[4].RowCount();j++){					
					if(sheetObjects[4].GetCellValue(j,"Seq")==mst_seq){					
						tab_row = j;
						continue;
					}
				}
							
				
				var mst_rat_as_cntr_qty=sheetObjects[1].GetCellValue(i,"rat_as_cntr_qty");
				var mst_trf_rt_amt=sheetObjects[1].GetCellValue(i,"trf_rt_amt");
				var tab1_rat_as_cntr_qty=sheetObjects[4].GetCellValue(tab_row,"rat_as_cntr_qty");
				var tab1_trf_rt_amt=sheetObjects[4].GetCellValue(tab_row,"trf_rt_amt");
				var tab2_rat_as_cntr_qty=sheetObjects[5].GetCellValue(tab_row,"rat_as_cntr_qty");
				var tab2_trf_rt_amt=sheetObjects[5].GetCellValue(tab_row,"trf_rt_amt");
				var tab3_rat_as_cntr_qty=sheetObjects[6].GetCellValue(tab_row,"rat_as_cntr_qty");
				var tab3_trf_rt_amt=sheetObjects[6].GetCellValue(tab_row,"trf_rt_amt");
				var tab4_rat_as_cntr_qty=sheetObjects[7].GetCellValue(tab_row,"rat_as_cntr_qty");
				var tab4_trf_rt_amt=sheetObjects[7].GetCellValue(tab_row,"trf_rt_amt");
				if((mst_rat_as_cntr_qty == tab1_rat_as_cntr_qty && mst_trf_rt_amt == tab1_trf_rt_amt) ||
						(mst_rat_as_cntr_qty == tab2_rat_as_cntr_qty && mst_trf_rt_amt == tab2_trf_rt_amt) ||
						(mst_rat_as_cntr_qty == tab3_rat_as_cntr_qty && mst_trf_rt_amt == tab3_trf_rt_amt) ||
						(mst_rat_as_cntr_qty == tab4_rat_as_cntr_qty && mst_trf_rt_amt == tab4_trf_rt_amt)) {
					sheetObjects[8].SetCellValue(tab_row,"trf_rt_amt",mst_trf_rt_amt-tab1_trf_rt_amt,0);
					sheetObjects[8].SetCellValue(tab_row,"rat_as_cntr_qty",mst_rat_as_cntr_qty,0);
				}				
				if(mst_rat_as_cntr_qty != tab1_rat_as_cntr_qty || 
						mst_rat_as_cntr_qty != tab2_rat_as_cntr_qty || 
						mst_rat_as_cntr_qty != tab3_rat_as_cntr_qty ||
						mst_rat_as_cntr_qty != tab4_rat_as_cntr_qty){
					sheetObjects[8].SetCellValue(tab_row,"rat_as_cntr_qty",mst_rat_as_cntr_qty - tab1_rat_as_cntr_qty - tab2_rat_as_cntr_qty - tab3_rat_as_cntr_qty - tab4_rat_as_cntr_qty,0);
					sheetObjects[8].SetCellValue(tab_row,"trf_rt_amt",mst_trf_rt_amt,0);
				}
				if(mst_trf_rt_amt != tab1_trf_rt_amt || 
						mst_trf_rt_amt != tab2_trf_rt_amt || 
						mst_trf_rt_amt != tab3_trf_rt_amt ||
						mst_trf_rt_amt != tab4_trf_rt_amt){
					sheetObjects[8].SetCellValue(tab_row,"trf_rt_amt",mst_trf_rt_amt - tab1_trf_rt_amt - tab2_trf_rt_amt - tab3_trf_rt_amt - tab4_trf_rt_amt,0);
					sheetObjects[8].SetCellValue(tab_row,"rat_as_cntr_qty",mst_rat_as_cntr_qty,0);
				}
				if(sheetObjects[1].GetCellValue(i,"per_tp_cd")!='PC'){
					sheetObjects[8].SetCellValue(tab_row,"chg_amt",InvRound(sheetObjects[8].GetCellValue(tab_row,"rat_as_cntr_qty")*sheetObjects[8].GetCellValue(tab_row,"trf_rt_amt"),sheetObjects[8].GetCellValue(tab_row,"dp_prcs_knt")),0);
				}else{
					sheetObjects[8].SetCellValue(tab_row,"chg_amt",InvRound(sheetObjects[8].GetCellValue(tab_row,"rat_as_cntr_qty")*sheetObjects[8].GetCellValue(tab_row,"trf_rt_amt")/100,sheetObjects[8].GetCellValue(tab_row,"dp_prcs_knt")),0);
				}				
			}
			reSum(sheetObjects[8]);
		}
		beforetab=nItem;		
	}
	/** 
	 * Validating input value. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj : Sheet object.  
	 * @param  {object} formObj : Form object.
	 * @param  {sAction} sAction : f_cmd.
	 * @return true, false
	 * @see #
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	function validateForm(sheetObj,formObj,sAction){
		with(formObj){
			switch(sAction) {
			case IBSEARCH:        //retrieve				
				if( formObj.inv_no.value.trim() == "") {
					ComShowCodeMessage("INV00004");
					formObj.inv_no.focus();
					return false;
				} 
				if( formObj.split_cnt.value.trim() == "") {
					ComShowCodeMessage("INV00079");
					formObj.split_cnt.focus();
					return false;
				} 
				if( formObj.split_cnt.value<2||formObj.split_cnt.value>5) {
					ComShowCodeMessage("INV00079");
					formObj.split_cnt.focus();
					return false;
				} 
				break;
			case IBSAVE:        //save
				if(formObj.split_cnt.value != ""){
					
					if (formObj.inv_curr_cd.value == "") {
			    		 ComShowCodeMessage("INV00004");
			             formObj.inv_curr_cd.focus();
			             return false;
			        }
					
					for(cnt=0;cnt < formObj.split_cnt.value; cnt++){						
						if( formObj.act_cust_cnt_cd[cnt].value.trim() == "" || formObj.act_cust_seq[cnt].value.trim() == "" ) {
							ComShowCodeMessage("INV00004");
							tabObjects[0].SetSelectedIndex(cnt);
							formObj.act_cust_cnt_cd[cnt].focus();
							return false;
						}		
						
						if (cnt == 0 && formObj.inv_curr_cd1.value == "") {
				    		 ComShowCodeMessage("INV00004");
				    		 tabObjects[0].SetSelectedIndex(cnt);
				             formObj.inv_curr_cd1.focus();
				             return false;
				        }
						if (cnt == 1 && formObj.inv_curr_cd2.value == "") {
				    		 ComShowCodeMessage("INV00004");
				    		 tabObjects[0].SetSelectedIndex(cnt);
				             formObj.inv_curr_cd2.focus();
				             return false;
				        }
						if (cnt == 2 && formObj.inv_curr_cd3.value == "") {
				    		 ComShowCodeMessage("INV00004");
				    		 tabObjects[0].SetSelectedIndex(cnt);
				             formObj.inv_curr_cd3.focus();
				             return false;
				        }
						if (cnt == 3 && formObj.inv_curr_cd4.value == "") {
				    		 ComShowCodeMessage("INV00004");
				    		 tabObjects[0].SetSelectedIndex(cnt);
				             formObj.inv_curr_cd4.focus();
				             return false;
				        }
						if (cnt == 4 && formObj.inv_curr_cd5.value == "") {
				    		 ComShowCodeMessage("INV00004");
				    		 tabObjects[0].SetSelectedIndex(cnt);
				             formObj.inv_curr_cd5.focus();
				             return false;
				        }
					}
					for (i=0; i<document.form.split_curr_cd.length; i++) {						
						if(parseFloat(document.form.mst_chg_amt[i].value.replace("/\,/gi","")) != parseFloat(document.form.split_chg_amt[i].value.replace("/\,/gi",""))){
							ComShowCodeMessage("INV00035");
							return false;
						}						
					}
					for(cnt=0;cnt < document.form.split_cnt.value; cnt++){
						for(j=0;j<sheetObjects.length;j++){
							var amt=0;
							if(sheetObjects[j].id=="t"+cnt+"sheet1"){
								sumrow=sheetObjects[j].FindSubSumRow("curr_cd");
								arrRow=sumrow.split("|");
								for (idx=0; idx<arrRow.length; idx++) {
									amt=amt + parseFloat(sheetObjects[j].GetCellValue(arrRow[idx], "chg_amt"));
								}	
								if(amt==0){
									ComShowCodeMessage("INV00033");
									return false;
								}
							}							
						}
					}
					
					var T=Number('1e'+1);	
					for(a=1; a<=sheetObjects[1].RowCount();a++){
						var aChgAmt=0;						
						aChgCd=sheetObjects[1].GetCellValue(a,"chg_cd");
						aCurrPoint=sheetObjects[1].GetCellValue(a,"dp_prcs_knt");
						if(aChgCd!=""){
							for(b=1; b<=sheetObjects[1].RowCount();b++){
								bChgCd=sheetObjects[1].GetCellValue(b,"chg_cd");
								if(aChgCd == bChgCd){
									aChgAmt=aChgAmt + parseFloat(sheetObjects[1].GetCellValue(b,"chg_amt"));
									aChgAmt=aChgAmt* T / T;
									posV=Math.pow(10, aCurrPoint)
									aChgAmt=Math.round(aChgAmt*posV)/posV;	
								}							
							}
							var cChgAmt=0;							
							for (c=1; c<=sheetObjects[10].RowCount();c++){
								cChgCd=sheetObjects[10].GetCellValue(c,"chg_cd");
								if(aChgCd == cChgCd){
									cChgAmt=cChgAmt + parseFloat(sheetObjects[10].GetCellValue(c,"chg_amt"));
									cChgAmt=cChgAmt* T / T;
									posV=Math.pow(10, aCurrPoint)
									cChgAmt=Math.round(cChgAmt*posV)/posV;	
								}							
							}
							if(aChgAmt!=cChgAmt){
								ComShowCodeMessage("INV00035");
								return false;
							}
						}
					}
				}				
				break;
			case IBINSERT:        //Issue (Paper Issue, Go to Send)				
				if(formObj.split_cnt.value != ""){
					
					if (formObj.inv_curr_cd.value == "") {
			    		 ComShowCodeMessage("INV00004");
			             formObj.inv_curr_cd.focus();
			             return false;
			        }
					
					for(cnt=0;cnt < formObj.split_cnt.value; cnt++){						
						if( formObj.act_cust_cnt_cd[cnt].value.trim() == "" || formObj.act_cust_seq[cnt].value.trim() == "" ) {
							ComShowCodeMessage("INV00004");
							tabObjects[0].SetSelectedIndex(cnt);
							formObj.act_cust_cnt_cd[cnt].focus();
							return false;
						}					
					}
					
					if (formObj.inv_curr_cd.value == "") {
						ComShowCodeMessage("INV00004");
						formObj.inv_curr_cd.focus();
						return false;
					}
					
					for (i=0; i<document.form.split_curr_cd.length; i++) {						
						if(parseFloat(document.form.mst_chg_amt[i].value.replace("/\,/gi","")) != parseFloat(document.form.split_chg_amt[i].value.replace("/\,/gi",""))){
							ComShowCodeMessage("INV00035");
							return false;
						}						
					}
					for(cnt=0;cnt < document.form.split_cnt.value; cnt++){
						for(j=0;j<sheetObjects.length;j++){
							var amt=0;
							if(sheetObjects[j].id=="t"+cnt+"sheet1"){
								sumrow=sheetObjects[j].FindSubSumRow("curr_cd");
								arrRow=sumrow.split("|");
								for (idx=0; idx<arrRow.length; idx++) {
									amt=amt + parseFloat(sheetObjects[j].GetCellValue(arrRow[idx], "chg_amt"));
								}	
								if(amt==0){
									ComShowCodeMessage("INV00033");
									return false;
								}
							}							
						}
					}
					
					var T=Number('1e'+1);	
					for(a=1; a<=sheetObjects[1].RowCount();a++){
						var aChgAmt=0;						
						aChgCd=sheetObjects[1].GetCellValue(a,"chg_cd");
						aCurrPoint=sheetObjects[1].GetCellValue(a,"dp_prcs_knt");
						if(aChgCd!=""){
							for(b=1; b<=sheetObjects[1].RowCount();b++){
								bChgCd=sheetObjects[1].GetCellValue(b,"chg_cd");
								if(aChgCd == bChgCd){
									aChgAmt=aChgAmt + parseFloat(sheetObjects[1].GetCellValue(b,"chg_amt"));
									aChgAmt=aChgAmt* T / T;
									posV=Math.pow(10, aCurrPoint)
									aChgAmt=Math.round(aChgAmt*posV)/posV;	
								}							
							}
							var cChgAmt=0;							
							for (c=1; c<=sheetObjects[10].RowCount();c++){
								cChgCd=sheetObjects[10].GetCellValue(c,"chg_cd");
								if(aChgCd == cChgCd){
									cChgAmt=cChgAmt + parseFloat(sheetObjects[10].GetCellValue(c,"chg_amt"));
									cChgAmt=cChgAmt* T / T;
									posV=Math.pow(10, aCurrPoint)
									cChgAmt=Math.round(cChgAmt*posV)/posV;	
								}							
							}
							if(aChgAmt!=cChgAmt){
								ComShowCodeMessage("INV00035");
								return false;
							}
						}
					}
				}				
				break;
			}
		}     
		return true;
	}
	/**
	 * sheet2 After complete retrieve, execute function.<br>
	 * 
	 * <br><b>Example : </b>
	 * <pre>
	 *   sheet2_OnSearchEnd(sheetObjects[0],"");
	 * </pre>
	 * @param object sheetObj
	 * @param String ErrMsg
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function sheet2_OnSearchEnd(sheetObj, ErrMsg){
		for(k=1;k<=sheetObj.RowCount();k++){
			currPoint=sheetObj.GetCellValue(k,"dp_prcs_knt");
			if (currPoint == '0') {
				sheetObj.InitCellProperty(k, "chg_amt",{ Type:"Data",Align:"Right",Format:"dfInteger"} );
			}
			else {
				sheetObj.InitCellProperty(k, "chg_amt",{ Type:"Data",Align:"Right",Format:"dfNullFloat",PointCount:currPoint} );
			}
		}	
		
		var info = [{StdCol:"curr_cd", SumCols:"7"}];
		sheetObj.ShowSubSum(info);
		
		var sumrow=sheetObj.FindSubSumRow("curr_cd");
		var arrRow=sumrow.split("|");
		var mst_sum_con="<table cellpadding=0 cellspacing=0 border=0> <input type=hidden name=mst_curr_point> <input type=hidden name=mst_curr_cd><input type=hidden name=mst_chg_amt value=0>";
		var split_sum_con="<table cellpadding=0 cellspacing=0 border=0> <input type=hidden name=split_curr_point> <input type=hidden name=split_curr_cd><input type=hidden name=split_chg_amt value=0>";
		for (idx=0; idx<arrRow.length; idx++) {
			
			currPoint=sheetObjects[1].GetCellValue(arrRow[idx]-1, "dp_prcs_knt");
			sVal=ComRound( parseFloat(sheetObjects[1].GetCellValue(arrRow[idx], "chg_amt")), currPoint ) +"";	
			p=sVal.split("."); 
			p[0]=ComAddComma(p[0]);
			if      (p.length == 1&&currPoint>0) {
				sVal=p[0]+"."+ComRpad("", currPoint, "0");
			}else if (p.length == 2&&currPoint>0) {
				sVal=p[0]+"."+ComRpad(p[1], currPoint, "0");
			}else {
				sVal=p[0];
			}  
			
			mst_sum_con=mst_sum_con + "<tr><td>"+
			"<input type=hidden style='width:45;text-align:center;background-color:#ffffcc;' class='input2' name='mst_curr_point' value="+currPoint+">&nbsp;" +			
			"<input type=text style='width:45;text-align:center;background-color:#ffffcc;' class='input2' name='mst_curr_cd' readOnly value="+sheetObjects[1].GetCellValue(arrRow[idx]-1, "curr_cd")+">&nbsp;" +
			"<input type=text style='width:80;text-align:right;background-color:#ffffcc;' class='input2' name='mst_chg_amt' readOnly dataformat='float' pointcount="+currPoint+" value="+sVal+">"+															  
			"</td></tr>";	
			split_sum_con=split_sum_con + "<tr><td>"+
			"<input type=hidden style='width:45;text-align:center;background-color:#ffffcc;' class='input2' name='split_curr_point' value="+currPoint+">&nbsp;" +			
			"<input type=text style='width:45;text-align:center;background-color:#ffffcc;' class='input2' name='split_curr_cd' readOnly value="+sheetObjects[1].GetCellValue(arrRow[idx]-1, "curr_cd")+">&nbsp;" +
			"<input type=text style='width:80;text-align:right;background-color:#ffffcc;' class='input2' name='split_chg_amt' readOnly dataformat='float' pointcount="+currPoint+" value="+sVal+">"+															  
			"</td></tr>";	
			sheetObjects[1].SetRowHidden(arrRow[idx],1);
			
		}
		document.getElementById ("mst_sum").innerHTML=mst_sum_con + "</table>"
		document.getElementById ("split_sum").innerHTML=split_sum_con + "</table>"
		
		sheetObj.HideSubSum();
		sheetObj.ShowSubSum(info);
	}
	/**
	 * Setting total price from each tap's charge.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   reSum(sheetObjects[0]);
	 * </pre>
	 * @param object sheetObj
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function reSum(sheetObj){	
		var max_seq=document.form.max_seq.value;
		var split_cnt=document.form.split_cnt.value;
		var sumrow=0;	
		var T=Number('1e'+1);
		if(split_cnt!=''&&max_seq!=''){
			for (i=0; i<document.form.split_curr_cd.length; i++) {	
				var amt=0.000;
				for(cnt=0;cnt < split_cnt; cnt++){
					for(j=0;j<sheetObjects.length;j++){
						if(sheetObjects[j].id=="t"+cnt+"sheet1"){
							sumrow=sheetObjects[j].FindSubSumRow("curr_cd");
							arrRow=sumrow.split("|");
							for (idx=0; idx<arrRow.length; idx++) {
								if(document.form.split_curr_cd[i].value==sheetObjects[j].GetCellValue(arrRow[idx], "curr_cd")){
									amt=amt + parseFloat(sheetObjects[j].GetCellValue(arrRow[idx], "chg_amt"));
								}
							}
						}
					}
				}
				currPoint=document.form.split_curr_point[i].value;
				var sVal=(amt)* T / T;
				var posV=Math.pow(10, currPoint)
				sVal=Math.round(sVal*posV)/posV;	            
				sVal=sVal.toString();				
				p=sVal.split("."); 
				p[0]=ComAddComma(p[0]);
				if      (p.length == 1&&currPoint>0) {
					sVal=p[0]+"."+ComRpad("", currPoint, "0");
				}else if (p.length == 2&&currPoint>0) {
					sVal=p[0]+"."+ComRpad(p[1], currPoint, "0");
				}else {
					sVal=p[0];
				} 
				document.form.split_chg_amt[i].value=sVal;
			}
		}
	}
	/**
	 * When change a af_ofc_cd data, execute function.<br>
	 * Setting office.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   ar_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode);
	 * </pre>
	 * @param object comboObj
	 * @param string value
	 * @param string text
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function ar_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){ 
		
		var formObj = document.form;
		sheetObjects[0].RemoveAll();
		sheetObjects[1].RemoveAll();
		sheetObjects[2].RemoveAll();
		sheetObjects[3].RemoveAll();
		arrStr=newCode.split("^");
		document.form.ofc.value=arrStr[1];
		document.form.ofc_cd.value=arrStr[1];
		//India GST 사용 목적
		document.form.office_cnt_cd.value=arrStr[6].substring(0,2);
		get_copy_cnt();
		
		setOfcOtherInfo(arrStr);
	    //inv_curr_cd setting
		inv_curr_cd1.RemoveAll();
	    inv_curr_cd2.RemoveAll();
	    inv_curr_cd3.RemoveAll();
	    inv_curr_cd4.RemoveAll();
	    inv_curr_cd5.RemoveAll();
	    var lclCurr = formObj.locl_curr_cd.value;
	    var altnCurr = formObj.altn_curr_div_cd.value;
	    inv_curr_cd1.InsertItem(0, lclCurr, lclCurr);
	    inv_curr_cd2.InsertItem(0, lclCurr, lclCurr);
	    inv_curr_cd3.InsertItem(0, lclCurr, lclCurr);
	    inv_curr_cd4.InsertItem(0, lclCurr, lclCurr);
	    inv_curr_cd5.InsertItem(0, lclCurr, lclCurr);
	    if(lclCurr != altnCurr && altnCurr != "" && altnCurr != "LCL" ) { 
	    	inv_curr_cd1.InsertItem(1, altnCurr, altnCurr);
	    	inv_curr_cd2.InsertItem(1, altnCurr, altnCurr);
	    	inv_curr_cd3.InsertItem(1, altnCurr, altnCurr);
	    	inv_curr_cd4.InsertItem(1, altnCurr, altnCurr);
	    	inv_curr_cd5.InsertItem(1, altnCurr, altnCurr);
	    } else {
	    	inv_curr_cd1.SetSelectText(lclCurr);
	    	inv_curr_cd2.SetSelectText(lclCurr);
	    	inv_curr_cd3.SetSelectText(lclCurr);
	    	inv_curr_cd4.SetSelectText(lclCurr);
	    	inv_curr_cd5.SetSelectText(lclCurr);
	    }
	    checkTaxCountry();
	    
	}
	
	/**
	 * Setting number of copy invoice. <br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   get_copy_cnt();
	 * </pre>
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function get_copy_cnt() {
		var sheetObject=sheetObjects[0];
		var formObject=document.form;		    
		doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC10); 	    
	}
	/**
	 * Creating combo.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    MakeComboObject2(formObj.ar_ofc_cd, arrStr);
	 * </pre>
	 * @param object cmbObj
	 * @param String arrStr
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function MakeComboObject2(cmbObj, arrStr) {
		cmbObj.RemoveAll();
		var arrStr2 = "";
		var ar_ofc_cd_c = "";
		for (var i=1; i < arrStr.length;i++ ) {
			arrStr2    = arrStr[i].split("^");
			ar_ofc_cd_c = arrStr2[1];
			cmbObj.InsertItem(i-1, ar_ofc_cd_c, arrStr[i]);			 
		}
		
		cmbObj.SetDropHeight(190);
		
		var ar_ofc_cd_str="";
		for (var i=1; i < arrStr.length; i++) {
			arrStr2 = arrStr[i].split("^");
			if (arrStr2[1] == arrStr2[3]) {
				ar_ofc_cd_str = arrStr2[1];
				cmbObj.SetSelectText(ar_ofc_cd_str);
				document.form.ofc.value = ar_ofc_cd_str;
				document.form.ofc_cd.value = document.form.ofc.value;	
				document.form.office_cnt_cd.value = arrStr2[6].substring(0,2);
			}
		}		
	}
	/**
	 * Popup (FNS_INV_0086) After process, execute function.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    getFNS_INV_0086(rowArray, 1, 1);
	 * </pre>
	 * @param String rowArray
	 * @param number row
	 * @param number col
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function getFNS_INV_0086(rowArray, row, col) {    	 
		var colArray=rowArray[0];	
		document.form.act_cust_cnt_cd[tabObjects[0].GetSelectedIndex()].value = colArray[8];
		document.form.act_cust_seq[tabObjects[0].GetSelectedIndex()].value = ComLpad(colArray[9], 6, '0');
		fn_act_cust_chg();
	}
	/**
	 * Popup (FNS_INV_0098) After process, execute function.<br>
	 * 
	 * <br><b>Example : </b>
	 * <pre>
	 *    getFNS_INV_0098();
	 * </pre>
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function getFNS_INV_0098() {
		var cnt_teu=0;
		var cnt_feu=0;
		/*
	    	for(j=0;j<sheetObjects.length;j++){
				if(sheetObjects[j].id=="t"+[tabObjects[0].GetSelectedIndex()]+"sheet2"){
					for (var i=1; i <= sheetObjects[j].RowCount(); i++){
						if (sheetObjects[j].GetCellValue(i, "cntr_tpsz_cd").substr(1,1) == "2") {
	    					cnt_teu++;
	    				} else {
	    					cnt_feu++;
	    				}        			
	        		}
		        }
			}
		 */
		for (var i=1; i <= sheetObjects[12].RowCount(); i++){
			if(sheetObjects[12].GetCellValue(i, "ar_if_no") == tabObjects[0].GetTabTitle([tabObjects[0].GetSelectedIndex()])){
				if (sheetObjects[12].GetCellValue(i, "cntr_tpsz_cd").substr(1,1) == "2") {
					cnt_teu++;
				} else {
					cnt_feu++;
				}
			}
		}
		document.form.bkg_teu_qty[tabObjects[0].GetSelectedIndex()].value = cnt_teu;
		document.form.bkg_feu_qty[tabObjects[0].GetSelectedIndex()].value = cnt_feu;
	}
	/**
	 * When change a act_cust_cnt_cd and a act_cust_seq, execute function.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    fn_act_cust_chg();
	 * </pre>
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function fn_act_cust_chg(){
		document.form.cust_cnt_cd.value="";
		document.form.cust_seq.value="";
		fn_dueDate_chg();
		fn_cust_nm(); 
	}
	/**
	 * When change a act_cust_cnt_cd and a act_cust_seq, execute function.<br>
	 * fn_act_cust_chg()
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function fn_dueDate_chg(){
		if(document.form.act_cust_seq[tabObjects[0].GetSelectedIndex()].value!=''){
			document.form.act_cust_seq[tabObjects[0].GetSelectedIndex()].value=ComLpad(document.form.act_cust_seq[tabObjects[0].GetSelectedIndex()].value.trim(), 6, "0");
			/* 
	  			 if( form.act_cust_cnt_cd[tabObjects[0].GetSelectedIndex()].value == form.frm_act_cust_cnt_cd.value&&form.act_cust_seq[tabObjects[0].GetSelectedIndex()].value==form.frm_act_cust_seq.value){
	  				  ComShowCodeMessage("INV00031");
	  				  form.act_cust_cnt_cd[tabObjects[0].SetSelectedIndex].value("");
	  				  form.act_cust_seq[tabObjects[0].SetSelectedIndex].value("");
	  				  form.cust_lgl_eng_nm[tabObjects[0].SetSelectedIndex].value("");
	  				  form.act_cust_cnt_cd[tabObjects[0].GetSelectedIndex()].focus();
	  				  return;
	  			  }
			 */
			document.form.cust_cnt_cd.value=document.form.act_cust_cnt_cd[tabObjects[0].GetSelectedIndex()].value;
			document.form.cust_seq.value=document.form.act_cust_seq[tabObjects[0].GetSelectedIndex()].value;
			document.form.ofc_cd.value=document.form.ofc.value;
		}  		 
	}
	/**
	 * When change a act_cust_cnt_cd and a act_cust_seq, execute function.<br>
	 * fn_act_cust_chg()
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function fn_cust_nm(){
		document.form.f_cmd.value=SEARCH03;
		var cust_nm="";
		var dfltInvCurrDivCd = "";
		if ((document.form.cust_cnt_cd.value.trim() != "" )&&(document.form.cust_seq.value.trim() != "")&&(document.form.cust_seq.value.trim() != "000000")){
			var sXml=sheetObjects[0].GetSearchData("INVCommonGS.do", FormQueryString(document.form));
			cust_nm=ComGetEtcData(sXml,"cust_eng_nm");
			dfltInvCurrDivCd=ComGetEtcData(sXml,"dflt_inv_curr_div_cd");
			delt_flg=ComGetEtcData(sXml,"delt_flg");
			if(delt_flg=='Y'){
				document.form.cust_lgl_eng_nm[tabObjects[0].GetSelectedIndex()].value = "";
				document.form.act_cust_seq[tabObjects[0].GetSelectedIndex()].value = "";
				document.form.cust_seq.value="";
				ComShowCodeMessage("INV00060");
				document.form.act_cust_cnt_cd[tabObjects[0].GetSelectedIndex()].focus();
				return;
			}
			if (cust_nm == undefined) {
				document.form.cust_lgl_eng_nm[tabObjects[0].GetSelectedIndex()].value = "";
				document.form.act_cust_seq[tabObjects[0].GetSelectedIndex()].value = "";
				ComShowCodeMessage("INV00008");
				document.form.act_cust_cnt_cd[tabObjects[0].GetSelectedIndex()].focus();
				return;   	    		  
			}else{
				if(sheetObjects[1].RowCount()>0){
					//sheetObjects[1].CellValue(1,"act_cust_cnt_cd") = form.act_cust_cnt_cd.value;
					//sheetObjects[1].CellValue(1,"act_cust_seq") = form.act_cust_seq.value; 	     			  
				}  
				document.form.cust_lgl_eng_nm[tabObjects[0].GetSelectedIndex()].value=cust_nm;
				document.form.dflt_inv_curr_div_cd[tabObjects[0].GetSelectedIndex()].value=dfltInvCurrDivCd;
			}
		} else {
			document.form.cust_lgl_eng_nm[tabObjects[0].GetSelectedIndex()].value="";
		}
//JHJ 2018-07-09 start!
		if( document.form.cust_cnt_cd.value == "IN" && document.form.cust_seq.value != "") {
	    	//alert("indian OK.");		
			fn_cust_gst_no();
	    }
//JHJ 2018-07-09 end!
	}
	
//JHJ 2018-07-09 start!
	/**
	 * In case indian invoice, get a selection tab's gst no by cust code.<br>
	 * fn_cust_gst_no()
	 * @author Hyun-Jae Jeong
	 */
	function fn_cust_gst_no(){

		//input Validation
		document.form.f_cmd.value=SEARCH03;
		var ida_gst_no_yn="";
		if ((document.form.cust_cnt_cd.value.trim() != "" )&&(document.form.cust_seq.value.trim() != "")&&(document.form.cust_seq.value.trim() != "000000")){

			var sXml=sheetObjects[0].GetSearchData("FNS_INV_0033GS.do", FormQueryString(document.form));

			ida_gst_no_yn=ComGetEtcData(sXml,"ida_gst_no_yn");
			//alert(ida_gst_no_yn);
			if(ida_gst_no_yn=='N'){	
				var gstCustCd = document.form.cust_cnt_cd.value+"-"+document.form.cust_seq.value;
				document.form.cust_lgl_eng_nm[tabObjects[0].GetSelectedIndex()].value = "";
				document.form.act_cust_seq[tabObjects[0].GetSelectedIndex()].value = "";
				document.form.cust_seq.value="";
				ComShowCodeMessage("INV00182",gstCustCd);
				document.form.act_cust_cnt_cd[tabObjects[0].GetSelectedIndex()].focus();
				return;
			}
		} else {
			document.form.cust_lgl_eng_nm[tabObjects[0].GetSelectedIndex()].value="";
		}
	}
//JHJ 2018-07-09 end!
	
	
	
	
	
	
	
	/**
	 * When click a 'Go to Send', opening mail popup<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    open_email();
	 * </pre>
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function openEmail() {
		//ComOpenWindowCenter("FNS_INV_0034_02.do?issueGubn=I", "pop", 1010, 750);

		var ar_ofc_cd=document.form.ar_ofc_cd2.value;
		var invMltBlIssFlg=document.form.inv_mlt_bl_iss_flg.value;
		//2014.10.16 INV Form logic change by IY Cho
		var otsSmryCd = document.form.ots_smry_cd.value;
		var officeCntCd = document.form.office_cnt_cd.value;
		var taxCntFlg = document.form.tax_cnt_flg.value;

		//ComOpenWindowCenter("FNS_INV_0034_02.do?issueGubn=I&invMltBlIssFlg="+invMltBlIssFlg+"&otsSmryCd="+otsSmryCd+"&officeCntCd="+officeCntCd, "pop", 1010, 700);			
		//var param = "issueGubn=I&invMltBlIssFlg="+invMltBlIssFlg+"&otsSmryCd="+otsSmryCd+"&officeCntCd="+officeCntCd;
		var param = "issueGubn=I&invMltBlIssFlg="+invMltBlIssFlg+"&otsSmryCd="+otsSmryCd+"&officeCntCd="+officeCntCd+"&taxCntFlg="+taxCntFlg;
		//alert(param);
		ComOpenWindowCenter("FNS_INV_0034_02.do?"+param, "pop", 1010, 700, true);	 
			
	}
	/**
	 * Checking cust_cnt_cd length in selected tab.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    checkCustLeng();
	 * </pre>
	 * @param string value
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function checkCustLeng(value){    	  
		if(value.length==2){
			document.form.act_cust_seq[tabObjects[0].GetSelectedIndex()].focus();
		}
	}
	/**
	 * RD File open <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     rdOpen(Rdviewer, inv_no, line_num, user_nm, ofc_cd, logo, vvd, port_cd, attach, paperYn)
	 * </pre>
	 * @param {rdviewer} rdObject Rdviewer Object
	 * @param {String} inv_no Invoice number
	 * @param {String} line_num Description lile count 
	 * @param {String} user_nm
	 * @param {String} ofc_cd office code
	 * @param {String} logo
	 * @param {String} vvd vvd
	 * @param {String} port_cd port code
	 * @param {String} attach letter wording attach flag
	 * @param {String} paperYn print, email
	 * @return none.
	 * @author 
	 * @version 2009.10.20
	 */ 
	function rdOpen(inv_no, line_num, user_nm, ofc_cd, logo, vvd, port_cd, attach, paperYn){
		
		//2014.10.16 INV Form logic change by IY Cho
		var formObj = document.form;
		var rdFile = "";
		var loginOfcCd = "";
		var rdParam = "";
		var issue_type = "";
		var ots_smry_cd = formObj.ots_smry_cd.value;
		var inv_mlt_bl_iss_flg = formObj.inv_mlt_bl_iss_flg.value;
		var office_cnt_cd = formObj.office_cnt_cd.value;
		var tax_cnt_flg = formObj.tax_cnt_flg.value;
		
		if(ots_smry_cd == "INV" || inv_mlt_bl_iss_flg=="N"){
			rdFile = "FNS_INV_0001.mrd";
		}else{
			rdFile = "FNS_INV_0003.mrd";
		}
		
		if(office_cnt_cd == "BR"){
			if(ots_smry_cd == "INV" || inv_mlt_bl_iss_flg=="N"){
				rdFile = "FNS_INV_0005.mrd";
			}else{
				rdFile = "FNS_INV_0004.mrd";
			}
//		}else if(office_cnt_cd == "FR"){
//			rdFile = "FNS_INV_0522.mrd";
		}else if(office_cnt_cd == "IN"){
			if(inv_no.length > 9){
				rdFile = "FNS_INV_0515.mrd"; // new India Invoice 2017.07.01
			}else{
				rdFile = "FNS_INV_0514.mrd"; // India 이전버전
			}
		}else if(office_cnt_cd == "TH"){
			rdFile = "FNS_INV_0540.mrd";
		}else if(office_cnt_cd == "VN"){
			rdFile = "FNS_INV_0531_SINGLE.mrd";
		}else if(office_cnt_cd == "KR"){
			//rdFile = "FNS_INV_0104.mrd";
			if(formObj.ar_ofc_cd2.value == 'PUSBB'){
				rdFile = "FNS_INV_0104.mrd";
			}
		}

//*********** JHJ 2018.01  START!  *************      
		if(tax_cnt_flg =="Y"){

			//if(office_cnt_cd == "DE" || office_cnt_cd == "CI" ){
			if(office_cnt_cd == "CI" ){
				//alert("Ivory Coast!!!-DE");
				rdFile = "FNS_INV_0101.mrd";
			} else if(office_cnt_cd == "MM" ){
				rdFile = "FNS_INV_0001.mrd";
			} else {
				rdFile = "FNS_INV_0102.mrd";
			}
			
			if(office_cnt_cd == "AE" ){	
				rdFile = "FNS_INV_0103.mrd";
				if(cfmFlg == "" ) {  //2018-04-30	
					if(ComShowCodeConfirm("INV00180")) {   //YES
						mmFlg = "Y";
					} else {						
						mmFlg = "";
					}
					cfmFlg = "Y";
				} 			
			}	
			
		}
//*********** JHJ 2018.01  END!  *************      

		rdParam = "/rv frm1_inv_no["+inv_no+"] frm1_logo["+logo+"] frm1_login_nm ["+user_nm+"] frm1_ofc_cd ["+ofc_cd+"] frm1_line_num ["+line_num+"] frm1_vsl_cd["+vvd.substr(0,4)+"] frm1_skd_voy_no["+vvd.substr(4,4)+"] frm1_skd_dir_cd["+vvd.substr(8,1)+"] frm1_port_cd ["+port_cd+"] frm1_att_gb ["+attach+"] frm1_paper_yn ["+paperYn+"] frm1_issue_type["+issue_type+"] frm1_att_gb2[N] frm1_cust_cnt_cd[] frm1_cust_seq[] frm1_mm_flg["+mmFlg+"]";
		var rdUrl="apps/opus/fns/inv/accountreceivableinvoicemgt/invoiceissue/report/";
		//Rdviewer.FileOpen(RD_path + rdUrl + rdFile, RDServer + rdParam + "/rpagenuminit [1] /riprnmargin /rwait");
		appendReport.push({mrdPath:RD_path + rdUrl + rdFile, mrdParam: RDServer + rdParam + "/rpagenuminit [1] /riprnmargin /rwait"});
	}   
	
	
	/**
	 * Checking until BackEndJob's status become 3.<br>
	 *
	 * @return none.
	 * @see #doActionIBSheet
	 */
	 function getBackEndJobStatus() {
	    form.f_cmd.value=SEARCH02;
		var sXml=sheetObjects[0].GetSearchData("FNS_INV_0034_01GS.do", FormQueryString(form));
	    var arrXml=sXml.split("|$$|");
	    var jobState=ComGetEtcData(arrXml[0], "jb_sts_flg")
	    if(jobState == "3") {
	        clearInterval(timer);
	        ComBtnDisable("btn_go");
			ComBtnDisable("btn_paper");
	        getBackEndJobLoadFile();
	        ComOpenWait(false);
	    } else if(jobState == "4") {
	        clearInterval(timer);
	        // BackEndJob was failed
	 		var jbUsrErrMsg=getBackEndJobErrMsg( ComGetEtcData(sXml, "jb_usr_err_msg") ) ;
	 		if (jbUsrErrMsg != undefined && jbUsrErrMsg != '')
	 			ComShowMessage(jbUsrErrMsg);
	 		else
	 			ComShowCodeMessage("INV00136");
	 		ComOpenWait(false);
	    } else if(jobState == "5") {
	        clearInterval(timer);
	        // already read BackEndJob result file.
	        ComShowCodeMessage("INV00090");
	        ComOpenWait(false);
	    }
	}
	 
	 
	//get jb_usr_err_msg
	function getBackEndJobErrMsg(params) {
		var ary=params.split('<||>');
		return ary[ary.length-1];
	}
		
	/**
	 * After BackEndJob's complete, retrieving result.<br>
	 * 
	 * @return none.
	 * @see #getBackEndJobLoadFile
	 */
	function getBackEndJobLoadFile() {
		document.form.f_cmd.value=SEARCH03;
		var sXml=sheetObjects[0].GetSearchData("FNS_INV_0034_01GS.do", FormQueryString(form));
		//alert(sXml);
		var arrXml=sXml.split("|$$|");
		if(arrXml.length > 0) {
			//sheetObjects[0].LoadSearchXml(arrXml[0]);
			document.form.backendjob_key.value="";
			var sStr=ComGetEtcData(sXml,"inv_nos");	
			//alert(sStr);
	//		if (sStr == "") {
	//		ComShowCodeMessage("INV00095");
	//		return;
	//		}	
			var sStr2=sStr.split("&");
			var arrStr=sStr2[0].split("|");
			if (arrStr.length > 1) {
				document.form.invoice_nos.value=arrStr;  //India New Invoice 때문에 추가
				document.form.f_inv.value=arrStr[0];	
				document.form.t_inv.value=arrStr[arrStr.length - 2];
				document.form.tot_inv_cnt.value=ComAddComma2(arrStr.length - 1, "#,###");
			} 
			var state=ComGetEtcData(sXml,ComWebKey.Trans_Result_Key); 
			var r_invs=arrStr[0];  
			/*
					if (sStr2[1] != "") {
						ComShowCodeMessage("INV00096", sStr2[1]);
					} else if (r_invs == "") {
						ComShowCodeMessage("INV00097");
					}
			 */
			if (r_invs == "") {
				ComShowCodeMessage("INV00097");
				document.form.f_inv.value="";
				document.form.t_inv.value="";
				document.form.tot_inv_cnt.value="";
				return false;
			}
			if (state == "S" && r_invs != "") {	 						
				//alert(r_invs);
//				var arrStr2=ar_ofc_cd.GetSelectText();
//				document.form.ar_ofc_cd2.value=arrStr2[1];	  
				
				document.form.ar_ofc_cd2.value=ar_ofc_cd.GetSelectText();
				 var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
		            setOfcOtherInfo(arrStr2);
				
				
				var v_f_inv=document.form.f_inv.value;
				var v_t_inv=document.form.t_inv.value;
				var arrStr3=sStr2[0].split("|");
				var v_copy_cnt=document.form.copy_cnt.value;  
				//alert(form.email_flag.value);
				if (document.form.email_flag.value == "N") {
					//rdObjects[0].SetAppendReport(1);
					//rdObjects[0].ApplyLicense("0.0.0.0");
					for(var i=0; i<arrStr3.length -1; i++){
						//alert(arrStr3[i]);
						rdOpen(arrStr3[i], 15, document.form.user_nm.value, document.form.ar_ofc_cd2.value, "ORIGINAL", "", "", "N", "Y");
						for(var j=0; j<v_copy_cnt; j++) {  						
							rdOpen(arrStr3[i], 15, document.form.user_nm.value, document.form.ar_ofc_cd2.value, "COPY", "", "", "N", "Y");
						}
					}  
					//rdObjects[0].SetAppendReport(0); 
					// Setting printer.
					//var print_nm=document.form.print_nm.value;
					//if(print_nm != ""){
					//	rdObjects[0].SetPrintInfo (print_nm, 1, 1, 4);
					//}
					//rdObjects[0].CMPrint (); // Starting printer.
					//viewer.openFile(appendReport, {timeout:3000});
					//viewer.print({isServerSide:true}); // Starting printer.
					directReportDownload(appendReport);
					appendReport = [];					
				} else {
					openEmail();
				}
				cfmFlg = ""; //2018-04-30	
				mmFlg = ""; //2018-04-30	
			} 
		}
	}
	
	
	function t0sheet1_OnSearchEnd(sheetObj, Code, ErrMsg){
		with(sheetObj) {
	        var sRow=FindSubSumRow();
	        var arrRow=sRow.split("|");
	        for(var i=0; i < arrRow.length; i++){
	        	SetCellValue(arrRow[i], 6, "Total")
	        }
	    }
	}
	
	function t1sheet1_OnSearchEnd(sheetObj, Code, ErrMsg){
		with(sheetObj) {
	        var sRow=FindSubSumRow();
	        var arrRow=sRow.split("|");
	        for(var i=0; i < arrRow.length; i++){
	        	SetCellValue(arrRow[i], 6, "Total")
	        }
	    }
	}
	
	/**
	 * When change a charge's price, execute function.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   t0sheet1_OnChange(sheetObjects[0],1, 1,'1');
	 * </pre>
	 * @param object sheetObj
	 * @param number Row
	 * @param number Col
	 * @param string Value
	 * @see reSum(sheetObj);
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function t0sheet1_OnChange(sheetObj, Row, Col,Value){    	 
		if(sheetObj.ColSaveName(Col)=="rat_as_cntr_qty"||sheetObj.ColSaveName(Col)=="trf_rt_amt"){
			if(sheetObj.GetCellValue(Row,"per_tp_cd")!='PC'){
				sheetObj.SetCellValue(Row,"chg_amt",InvRound(sheetObj.GetCellValue(Row,"rat_as_cntr_qty")*sheetObj.GetCellValue(Row,"trf_rt_amt"),sheetObj.GetCellValue(Row,"dp_prcs_knt")),0);
			}else{
				sheetObj.SetCellValue(Row,"chg_amt",InvRound(sheetObj.GetCellValue(Row,"rat_as_cntr_qty")*sheetObj.GetCellValue(Row,"trf_rt_amt")/100,sheetObj.GetCellValue(Row,"dp_prcs_knt")),0);
			}
			reSum(sheetObj);
		}
	}
	/**
	 * When change a charge's price, execute function.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   t1sheet1_OnChange(sheetObjects[0],1, 1,'1');
	 * </pre>
	 * @param object sheetObj
	 * @param number Row
	 * @param number Col
	 * @param string Value
	 * @see reSum(sheetObj);
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function t1sheet1_OnChange(sheetObj, Row, Col,Value){
		if(sheetObj.ColSaveName(Col)=="rat_as_cntr_qty"||sheetObj.ColSaveName(Col)=="trf_rt_amt"){
			if(sheetObj.GetCellValue(Row,"per_tp_cd")!='PC'){
				sheetObj.SetCellValue(Row,"chg_amt",InvRound(sheetObj.GetCellValue(Row,"rat_as_cntr_qty")*sheetObj.GetCellValue(Row,"trf_rt_amt"),sheetObj.GetCellValue(Row,"dp_prcs_knt")),0);
			}else{
				sheetObj.SetCellValue(Row,"chg_amt",InvRound(sheetObj.GetCellValue(Row,"rat_as_cntr_qty")*sheetObj.GetCellValue(Row,"trf_rt_amt")/100,sheetObj.GetCellValue(Row,"dp_prcs_knt")),0);
			}
			reSum(sheetObj);
		}
	}
	/**
	 * When change a charge's price, execute function.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   t2sheet1_OnChange(sheetObjects[0],1, 1,'1');
	 * </pre>
	 * @param object sheetObj
	 * @param number Row
	 * @param number Col
	 * @param string Value
	 * @see reSum(sheetObj);
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function t2sheet1_OnChange(sheetObj, Row, Col,Value){
		if(sheetObj.ColSaveName(Col)=="rat_as_cntr_qty"||sheetObj.ColSaveName(Col)=="trf_rt_amt"){
			if(sheetObj.GetCellValue(Row,"per_tp_cd")!='PC'){
				sheetObj.SetCellValue(Row,"chg_amt",InvRound(sheetObj.GetCellValue(Row,"rat_as_cntr_qty")*sheetObj.GetCellValue(Row,"trf_rt_amt"),sheetObj.GetCellValue(Row,"dp_prcs_knt")),0);
			}else{
				sheetObj.SetCellValue(Row,"chg_amt",InvRound(sheetObj.GetCellValue(Row,"rat_as_cntr_qty")*sheetObj.GetCellValue(Row,"trf_rt_amt")/100,sheetObj.GetCellValue(Row,"dp_prcs_knt")),0);
			}
			reSum(sheetObj);
		}
	}
	/**
	 * When change a charge's price, execute function.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   t3sheet1_OnChange(sheetObjects[0],1, 1,'1');
	 * </pre>
	 * @param object sheetObj
	 * @param number Row
	 * @param number Col
	 * @param string Value
	 * @see reSum(sheetObj);
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function t3sheet1_OnChange(sheetObj, Row, Col,Value){
		if(sheetObj.ColSaveName(Col)=="rat_as_cntr_qty"||sheetObj.ColSaveName(Col)=="trf_rt_amt"){
			if(sheetObj.GetCellValue(Row,"per_tp_cd")!='PC'){
				sheetObj.SetCellValue(Row,"chg_amt",InvRound(sheetObj.GetCellValue(Row,"rat_as_cntr_qty")*sheetObj.GetCellValue(Row,"trf_rt_amt"),sheetObj.GetCellValue(Row,"dp_prcs_knt")),0);
			}else{
				sheetObj.SetCellValue(Row,"chg_amt",InvRound(sheetObj.GetCellValue(Row,"rat_as_cntr_qty")*sheetObj.GetCellValue(Row,"trf_rt_amt")/100,sheetObj.GetCellValue(Row,"dp_prcs_knt")),0);
			}
			reSum(sheetObj);
		}
	}
	/**
	 * When change a charge's price, execute function.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   t4sheet1_OnChange(sheetObjects[0],1, 1,'1');
	 * </pre>
	 * @param object sheetObj
	 * @param number Row
	 * @param number Col
	 * @param string Value
	 * @see reSum(sheetObj);
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function t4sheet1_OnChange(sheetObj, Row, Col,Value){
		if(sheetObj.ColSaveName(Col)=="rat_as_cntr_qty"||sheetObj.ColSaveName(Col)=="trf_rt_amt"){
			if(sheetObj.GetCellValue(Row,"per_tp_cd")!='PC'){
				sheetObj.SetCellValue(Row,"chg_amt",InvRound(sheetObj.GetCellValue(Row,"rat_as_cntr_qty")*sheetObj.GetCellValue(Row,"trf_rt_amt"),sheetObj.GetCellValue(Row,"dp_prcs_knt")),0);
			}else{
				sheetObj.SetCellValue(Row,"chg_amt",InvRound(sheetObj.GetCellValue(Row,"rat_as_cntr_qty")*sheetObj.GetCellValue(Row,"trf_rt_amt")/100,sheetObj.GetCellValue(Row,"dp_prcs_knt")),0);
			}
			reSum(sheetObj);
		}
	}
	
	function s0sheet1_OnSaveEnd(sheetObj, ErrMsg) {

		InvOpenWait(false, true); 		
		
        if (ErrMsg != "") {
        	return;
        } else {
        				
        	ComShowCodeMessage("COM130102", "Data");    // {?msg1} was saved successfully.
        	ComBtnEnable("btn_paper");						
			ComBtnEnable("btn_go");
			ComBtnDisable("btn_retrive");
			ComBtnDisable("btn_save");
        }
    }	
	 
	
	
	/**KEY Event<br>
	 * @author Choi Do Soon
	 * @version 2009.11.10
	 */
	function initControl() {
		// Axon event process. Event catch.
		//axon_event.addListenerFormat('keypress',       'obj_keypress',    form); // When entering keyboard.
	}
	/**KEY Event<br>
	 * @author Choi Do Soon
	 * @version 2009.11.10
	 */
//	function obj_keypress(){
//		switch(event.srcElement.dataformat){
//		case "float":
//			// Only number or '.'.
//			ComKeyOnlyNumber(event.srcElement, ".");
//			break;
//		case "ymd":
//			// Only number or '-'.
//			ComKeyOnlyNumber(event.srcElement);
//			break;
//		case "eng":
//			// Only Alphabet or number.
//			ComKeyOnlyAlphabet();
//			break;
//		case "engdn":
//			// Only lower case.
//			ComKeyOnlyAlphabet('lower');
//			break;
//		case "engup":
//			// Only upper case.
//			ComKeyOnlyAlphabet('upper');
//			break;
//		case "num":
//			// Only number(integer, date, time).
//			ComKeyOnlyNumber('num');
//			break;
//		case "uppernum":
//			// Only upper case or number. 
//			ComKeyOnlyAlphabet('uppernum');
//			break;
//		default:
//			// Only upper case.
//			ComKeyOnlyAlphabet('upper');
//		}
//	} 
	 /**
	  * Call function after opening popup. <br>
	  * <br><b>Example :</b>
	  * @param
	  * @return
	  * @author 
	  * @version 2009.10.20
	  */
	 function getFnsInv0110(){
		 document.form.email_flag.value="Y";
		 doActionIBSheet(sheetObjects[0],document.form,IBINSERT);
		 var state=document.form.state.value;  
		 var r_invs=document.form.inv_nos.value;  
		 var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
		 document.form.ar_ofc_cd2.value=arrStr2[1];	
	 }
	 
	 /**
	  * setOfcOtherInfo<br>
	  * <br><b>Example :</b>
	  * <pre>
	  *     setOfcOtherInfo(arrStr2)
	  * </pre>
	  * @param {arrStr2} 
	  * @author CLT
	  * @version 2014.11.29
	  */
	 function setOfcOtherInfo(arrStr2) {
	 	var formObject=document.form;
		formObject.ar_ofc_cd2.value=arrStr2[1];
		formObject.svr_id.value=arrStr2[7];     
		formObject.ots_smry_cd.value=arrStr2[13];   
		formObject.inv_dup_flg.value=arrStr2[14]; 
		formObject.inv_mlt_bl_iss_flg.value=arrStr2[15]; 	
		formObject.locl_curr_cd.value=arrStr2[4]; 
		formObject.altn_curr_div_cd.value=arrStr2[20]; 
	 }	 
	 
	 /**
	  * setCustTargetYN<br>
	  * @author CLT
	  * @version 2014.11.25
	  */
	 function setCustTargetYN() {
	 	var formObject=document.form;
	 	var sheetObj = sheetObjects[14];
	 	var prefix = sheetObj.id + "_";
	 	
	 	var inv_curr_cd = formObject.inv_curr_cd.value;
	 	
	 	var custInfoMsg = "";
	 	var dfltInvCurr = "";
	 	
	 	sheetObj.RemoveAll();
	 	
	 	//Actual Customer Add
	 	var cnt=0;
	 	sheetObj.DataInsert(-1);
 		sheetObj.SetCellValue(cnt+1,prefix+"act_cust_cnt_cd",formObject.frm_act_cust_cnt_cd.value);
 		sheetObj.SetCellValue(cnt+1,prefix+"act_cust_seq",formObject.frm_act_cust_seq.value);
 		sheetObj.SetCellValue(cnt+1,prefix+"dflt_inv_curr_div_cd",formObject.frm_dflt_inv_curr_div_cd.value);
 		sheetObj.SetCellValue(cnt+1,prefix+"bl_src_no",formObject.frm_bl_src_no.value);
 		
 		dfltInvCurr = sheetObj.GetCellValue(cnt+1, prefix + "dflt_inv_curr_div_cd");
 		dfltInvCurr = (dfltInvCurr == "LCL") ? formObject.locl_curr_cd.value : dfltInvCurr;
 		
 		if ( inv_curr_cd != dfltInvCurr && dfltInvCurr != "" ) {
 			custInfoMsg = "Customer : [" + sheetObj.GetCellValue(cnt+1, prefix + "act_cust_cnt_cd") + "-" + ComLpad(sheetObj.GetCellValue(cnt+1, prefix + "act_cust_seq"), 6, '0') + "]";
 			
 			if (ComShowCodeConfirm("INV00137", custInfoMsg)) {
 				sheetObj.SetCellValue(cnt+1, prefix + "target_yn", "Y");
 			} else {
 				sheetObj.SetCellValue(cnt+1, prefix + "target_yn", "N");
 			}
 			
 		} else {
 			sheetObj.SetCellValue(cnt+1, prefix + "target_yn", "Y");
 		}
 		
 		var preCust = formObject.frm_act_cust_cnt_cd.value + formObject.frm_act_cust_seq.value;
	 	
	 	for(cnt=1;cnt <= formObject.split_cnt.value; cnt++){
	 		var nowCust = formObject.act_cust_cnt_cd[cnt-1].value + formObject.act_cust_seq[cnt-1].value;	 		
	 		if (preCust != nowCust) {
		 		var row = sheetObj.DataInsert(-1);
		 		sheetObj.SetCellValue(row,prefix+"act_cust_cnt_cd",formObject.act_cust_cnt_cd[cnt-1].value);
		 		sheetObj.SetCellValue(row,prefix+"act_cust_seq",formObject.act_cust_seq[cnt-1].value);
		 		sheetObj.SetCellValue(row,prefix+"dflt_inv_curr_div_cd",formObject.dflt_inv_curr_div_cd[cnt-1].value);
		 		sheetObj.SetCellValue(row,prefix+"bl_src_no",formObject.frm_bl_src_no.value);
		 		
		 		dfltInvCurr = sheetObj.GetCellValue(row, prefix + "dflt_inv_curr_div_cd");
		 		dfltInvCurr = (dfltInvCurr == "LCL") ? formObject.locl_curr_cd.value : dfltInvCurr;
		 		
		 		if ( inv_curr_cd != dfltInvCurr && dfltInvCurr != "" ) {
		 			custInfoMsg = "Customer : [" + sheetObj.GetCellValue(row, prefix + "act_cust_cnt_cd") + "-" + ComLpad(sheetObj.GetCellValue(row, prefix + "act_cust_seq"), 6, '0') + "]";
		 			
		 			if (ComShowCodeConfirm("INV00137", custInfoMsg)) {
		 				sheetObj.SetCellValue(row, prefix + "target_yn", "Y");
		 			} else {
		 				sheetObj.SetCellValue(row, prefix + "target_yn", "N");
		 			}
		 			
		 		} else {
		 			sheetObj.SetCellValue(row, prefix + "target_yn", "Y");
		 		}
		 		
		 		preCust = nowCust;
	 		}// end of if (preCust != preCust) {
	 		
	 	}
	 	
	 	removeDupRows();
	 	
	 }	 
	 
	 function removeDupRows() {
		 
		 var sheetObj = sheetObjects[14];
		 var duprows1 = sheetObj.ColValueDupRows("2|3|4|5");

		  //가져온 행을 배열로 반든다.
		  var arrRow = duprows1.split(",");

		  var initTotRow = arrRow.length;
	    	
	      for(var idx=initTotRow; idx >= 1; idx-- ) {	//RowDelete 로 인한 영향으로 거꾸로 for 문 사용 
	    	  //alert(arrRow[idx-1] + "행"); 
			  sheetObj.RowDelete(arrRow[idx-1], 0);	
	      }


	 }

	 /**Tax Invoice Exemption (2017-12-08)*/
	 function fn_tax_exp_chk(){
	 	 if(document.form.tax_exp_chk.checked ){
	 		 document.form.tax_exp_flg.value = "Y";
	      }else{
	   	     document.form.tax_exp_flg.value = "N"; 
	      }
	 }
	 /**Check Tax Country HJ.Jeong (2017-12-08)*/
	 function checkTaxCountry() {
		 var sheetObject=sheetObjects[0];
		 var formObject=document.form;	 
		 doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20);
		 if(formObject.tax_cnt_flg.value == "Y") {
			 document.getElementById('tax_cnt_area').style.display="block";
		 } else{
			 document.getElementById('tax_cnt_area').style.display="none";
		 }
		 formObject.tax_exp_chk.checked = false;
		 formObject.tax_exp_flg.value = "N";
	 }	 

	// 화면 초기화 - Form, Sheet, Combo, Button 등등 
	function fncResetAll()
	{
		var formObject=document.form;

		tabObjects[0].RemoveAll();
		ComResetAll();

		sheetObjects[0] = sheetObjects[0].Reset();
		sheetObjects[1] = sheetObjects[1].Reset();
		sheetObjects[2] = sheetObjects[2].Reset();
		sheetObjects[3] = sheetObjects[3].Reset();
		sheetObjects[4] = sheetObjects[4].Reset();
		sheetObjects[5] = sheetObjects[5].Reset();
		sheetObjects[6] = sheetObjects[6].Reset();
		sheetObjects[7] = sheetObjects[7].Reset();
		sheetObjects[8] = sheetObjects[8].Reset();
		sheetObjects[9] = sheetObjects[9].Reset();
		sheetObjects[10] = sheetObjects[10].Reset();
		sheetObjects[11] = sheetObjects[11].Reset();
		sheetObjects[12] = sheetObjects[12].Reset();
		sheetObjects[13] = sheetObjects[13].Reset();
		sheetObjects[14] = sheetObjects[14].Reset();
		
		for(var i=0;i<4;i++){
			ComConfigSheet (sheetObjects[i] );	
			initSheet(sheetObjects[i],i+1);
			ComEndConfigSheet(sheetObjects[i]);
		}				

		document.getElementById("mst_sum").innerHTML="";
		document.getElementById("split_sum").innerHTML="";

		ComBtnDisable("btn_go");
		ComBtnDisable("btn_paper");
		ComBtnEnable("btn_retrive");
		ComBtnEnable("btn_save");
		formObject.inv_no.readOnly=false;
		formObject.split_cnt.readOnly=false;					
		formObject.inv_no.className="input1";
		formObject.split_cnt.className="input1";
		formObject.inv_no.focus();
		f_Search = 0; 
		
		MakeComboObject2(ar_ofc_cd, arrOffice);		
		
		cfmFlg = ""; //2018-04-30	
		mmFlg = ""; //2018-04-30	
	}	 