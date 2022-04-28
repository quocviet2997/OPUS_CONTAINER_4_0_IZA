/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0032.js
*@FileTitle  : organization
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/31
*@history
=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
			   MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
			   THER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
    /** Common global variable */
	var sheetObjects=new Array();
	var sheetCnt=0;
	var comboObjects=new Array();
	var comboCnt=0;
	var create_ofc_cd='';
	/** Event handler processing by button click event */
	document.onclick=processButtonClick;   
   /**
    * initializing sheet
    * implementing onLoad event handler in body tag
    * adding first-served functions after loading screen.
    */
		function loadPage() {
	        //페이지 로드시 선처리 기능을 호출한다.
	        var formObj=document.form;   
			for (i=0; i < sheetObjects.length; i++) {
				// khlee-시작 환경 설정 함수 이름 변경
				ComConfigSheet(sheetObjects[i]);
				initSheet(sheetObjects[i], i + 1);
				// khlee-마지막 환경 설정 함수 추가
				ComEndConfigSheet(sheetObjects[i]);	
			}
			doActionIBCombo(sheetObjects[0], formObj, SEARCH);	
			ComSetFocus(formObj.ofc_cd);	
	        initControl();
	        delt_flg.SetSelectCode('N');
	        ppd_pty_tp_cd.SetSelectIndex(0, 0);
	        formObj.ibflag.value="I";
	        formObj.edi_if_flg.value = "N";
			// auth_tp_cd retrieve
			doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
			if(G_MDAA_CHK == 'Y') {
				//ComEnableObject(delt_flg, true);
				delt_flg.enable=true;
				ComSetDisplay('btn_save', true);
			} else {
				//ComEnableObject(delt_flg, false);
				delt_flg.enable=false;
				ComSetDisplay('btn_save', false);
			}
		}		   
	/**
	  * setting sheet initial values and header
	  * param : sheetObj, sheetNo
	  * adding case as numbers of counting sheets
	  */
	function initSheet(sheetObj,sheetNo) {
		var cnt=0;
		var sheetID=sheetObj.id;
     	switch(sheetID) {
     	case "sheet1":
     	    with(sheetObj){
	          var HeadTitle="ibflag|ofc_cd|ofc_eng_nm|ofc_locl_nm|intl_phn_no|ofc_phn_no|intl_fax_no|ofc_fax_no|ofc_url|ofc_rep_eml|ofc_zip_cd|ofc_addr|ofc_locl_lang_addr|ofc_tp_cd|ofc_cmmc_cd|ofc_knd_cd|agn_knd_cd|prnt_ofc_cd|"; // ||||||||||||||||||||||||||||||||||||||||||";
	          HeadTitle=HeadTitle+"ofc_sls_delt_flg|loc_cd|fax_ip|opn_dt|clz_dt|finc_psdo_ofc_flg|doc_rcvr_hide_flg|finc_hide_flg|subs_co_flg|sls_ofc_div_cd|mnl_bkg_no_opt_cd|ofc_rfa_sc_use_flg|ofc_rmk|ar_ofc_cd|";
	          HeadTitle=HeadTitle+"ar_ctrl_ofc_cd|ar_hd_qtr_ofc_cd|ar_ctr_cd|altn_curr_div_cd|finc_rgn_cd|ob_cr_term_dys|ib_cr_term_dys|ar_curr_cd|rep_cust_cnt_cd|";
	          HeadTitle=HeadTitle+"rep_cust_seq|inv_pfx_cd|fx_curr_rt|ofc_tax_id|asa_cr_term_dys|sub_agn_flg|ar_agn_stl_cd|ap_ofc_cd|ap_ctrl_ofc_cd|ap_ctr_cd|gl_ctr_cd|comm_if_ind_cd|bil_curr_cd|";
	          HeadTitle=HeadTitle+"vndr_seq|vndr_cnt_cd|so_if_cd|delt_flg|hidden_ofc_cd|vndr_cd|rep_cust_cd|ppd_pty_tp_cd|modi_ofc_cd|modi_cost_ctr_cd|modi_agn_cd";
	          var headCount=ComCountHeadTitle(HeadTitle);
	
	          SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );
	
	          var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
	          var headers = [ { Text:HeadTitle, Align:"Center"} ];
	          InitHeaders(headers, info);
	
	          var cols = [ {Type:"Status",    Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ofc_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ofc_eng_nm" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ofc_locl_nm" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"intl_phn_no" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ofc_phn_no" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"intl_fax_no" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ofc_fax_no" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ofc_url" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ofc_rep_eml" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ofc_zip_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ofc_addr" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ofc_locl_lang_addr" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ofc_tp_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ofc_cmmc_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ofc_knd_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"agn_knd_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"prnt_ofc_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ofc_sls_delt_flg" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"loc_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"fax_ip" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"opn_dt",                KeyField:0,   CalcLogic:"",   Format:"Ymd",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"clz_dt",                KeyField:0,   CalcLogic:"",   Format:"Ymd",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"finc_psdo_ofc_flg" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"doc_rcvr_hide_flg" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"finc_hide_flg" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"subs_co_flg" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"sls_ofc_div_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"mnl_bkg_no_opt_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ofc_rfa_sc_use_flg" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ofc_rmk" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ar_ofc_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ar_ctrl_ofc_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ar_hd_qtr_ofc_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ar_ctr_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"altn_curr_div_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"finc_rgn_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ob_cr_term_dys" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ib_cr_term_dys" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ar_curr_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"rep_cust_cnt_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"rep_cust_seq" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"inv_pfx_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"fx_curr_rt" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ofc_tax_id" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"asa_cr_term_dys" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"sub_agn_flg" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ar_agn_stl_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ap_ofc_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ap_ctrl_ofc_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ap_ctr_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"gl_ctr_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"comm_if_ind_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"bil_curr_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"vndr_seq" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"vndr_cnt_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"so_if_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"delt_flg" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"hidden_ofc_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"vndr_cd" },
	                 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"rep_cust_cd" },
	          		 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ppd_pty_tp_cd" },
	          		 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"modi_ofc_cd" },
	          		 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"modi_cost_ctr_cd" },
	          		 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"modi_agn_cd" },
	          		 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cre_usr_id" },
	          		 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cre_dt" },
	          		 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"upd_usr_id" },
	          		 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"upd_dt" },
	          		 {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"sprt_eml_inv_flg" }];
	           
	          InitColumns(cols);
	          SetEditable(1);
	          SetWaitImageVisible(0);
	          SetSheetHeight(100);
         	}
          break;
     	}
	}
	/**
     * 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 <br>
     * @return 없음
     * @author 서미진
     * @version 2011.02.19
     */
	function processButtonClick(){
        /*****Case more than two additional sheets tab sheet is used to specify a variable *****/
        var sheetObject1=sheetObjects[0];      
        /*******************************************************/
        var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch (srcName) {		
				case "btn_retrieve": //조회
					doActionIBSheet(sheetObject1,	formObject,	SEARCH01);
					break;
				case "btn_new": 	//New
					doActionIBSheet(sheetObject1,	formObject,	IBCLEAR);
					break;	
				case "btn_save": //저장
					doActionIBSheet(sheetObject1,	formObject,	IBSAVE);
					break;
		/*****************grid button ************************/	
				case "btn_com_ens_071_ofc_cd": 	
		  			var formObj=document.form;
		         	var sUrl="COM_ENS_071.do?ofc_cd=" + formObj.ofc_cd.value +"&main_page=false"+"&mdm_yn="+ formObj.mdm_yn.value;
		         	var rVal=ComOpenPopup(sUrl, 980, 620, "getCOM_ENS_071_ofc_cd", "0,0", true);
					break;
				case "btn_com_ens_071_prnt_ofc_cd": 
		  			var formObj=document.form;
		         	var sUrl="COM_ENS_071.do?ofc_cd=" + formObj.prnt_ofc_cd.value +"&main_page=false";
		         	var rVal=ComOpenPopup(sUrl, 980, 620, "getCOM_ENS_071_prnt_ofc_cd", "0,0", true);
					break;
				case "btn_com_ens_071_ar_ofc_cd":   
		  			var formObj=document.form;
		         	var sUrl="COM_ENS_071.do?ofc_cd=" + formObj.ar_ofc_cd.value +"&main_page=false";
		         	var rVal=ComOpenPopup(sUrl, 980, 620, "getCOM_ENS_071_ar_ofc_cd", "0,0", true);
					break;
				case "btn_com_ens_071_ar_ctrl_ofc_cd": 
		  			var formObj=document.form;
		         	var sUrl="COM_ENS_071.do?ofc_cd=" + formObj.ar_ctrl_ofc_cd.value +"&main_page=false";
		         	var rVal=ComOpenPopup(sUrl, 980, 600, "getCOM_ENS_071_ar_ctrl_ofc_cd", "0,0", true);
					break;
				case "btn_com_ens_071_ar_hd_qtr_ofc_cd": 
		  			var formObj=document.form;
		         	var sUrl="COM_ENS_071.do?ofc_cd=" + ar_hd_qtr_ofc_cd.value +"&main_page=false";
		         	var rVal=ComOpenPopup(sUrl, 980, 600, "getCOM_ENS_071_ar_hd_qtr_ofc_cd", "0,0", true);
					break;
				case "btn_com_ens_071_ap_ofc_cd": 
		  			var formObj=document.form;
		         	var sUrl="COM_ENS_071.do?ofc_cd=" + formObj.ap_ofc_cd.value +"&main_page=false";
		         	var rVal=ComOpenPopup(sUrl, 980, 620, "getCOM_ENS_071_ap_ofc_cd", "0,0", true);
					break;
				case "btn_com_ens_071_ap_ctrl_ofc_cd": 
		  			var formObj=document.form;
		         	var sUrl="COM_ENS_071.do?ofc_cd=" + formObj.ap_ctrl_ofc_cd.value +"&main_page=false";
		         	var rVal=ComOpenPopup(sUrl, 980, 620, "getCOM_ENS_071_ap_ctrl_ofc_cd", "0,0", true);
					break;
				case "btn_com_ens_051_loc_cd": 
		  			var formObj=document.form;
		         	var sUrl="COM_ENS_051.do?loc_cd=" + formObj.loc_cd.value +"&main_page=false";
		         	var rVal=ComOpenPopup(sUrl, 870, 460, "getCOM_ENS_051_loc_cd", "0,0", true);
					break;
				case "btn_com_ens_n13_ar_curr_cd": 
		  			var formObj=document.form;
		         	var sUrl="COM_ENS_N13.do?curr_cd=" + formObj.ar_curr_cd.value +"&main_page=false";
		         	var rVal=ComOpenPopup(sUrl, 770, 500, "getCOM_ENS_N13_ar_curr_cd", "0,0", true);
					break;	
				case "btn_com_ens_n13_bil_curr_cd": 
		  			var formObj=document.form;
		         	var sUrl="COM_ENS_N13.do?curr_cd=" + formObj.bil_curr_cd.value +"&main_page=false";
		         	var rVal=ComOpenPopup(sUrl, 770, 500, "getCOM_ENS_N13_bil_curr_cd", "0,0", true);
					break;	
				case "btn_com_ens_041_rep_cust_cd": 
		  			var formObj=document.form;
		         	var sUrl="COM_ENS_041.do?cust_cd=" + formObj.rep_cust_cd.value +"&main_page=false";
		         	var rVal=ComOpenPopup(sUrl, 780, 500, "getCOM_ENS_041_rep_cust_cd", "0,0,1,1,1,1", true);
					break;	
				case "btn_com_ens_0c1_vndr_cd": 
		  			var formObj=document.form;
		         	//var sUrl="COM_ENS_0C1.do?vndr_cd=" + formObj.rep_cust_cd.value +"&main_page=false";
		  			var sUrl="COM_ENS_0C1.do?vndr_cd=" + formObj.vndr_cd.value +"&main_page=false";		         	
		         	var rVal=ComOpenPopup(sUrl, 770, 540, "getCOM_ENS_0C1_vndr_cd", "0,0,1,1,1,1", true);
					break;	
				case "btn_opn_dt_cal": //달력
		                var cal=new ComCalendar();                
		                cal.select(document.form.opn_dt, 'yyyy-MM-dd');
	                break; 
				case "btn_clz_dt_cal": //달력
		                var cal=new ComCalendar();                
		                cal.select(document.form.clz_dt, 'yyyy-MM-dd');
	                break;
				case "btn_ar_ctr_cd":
	        		var param="?f_center=" + document.form.ar_ctr_cd.value;
	        		ComOpenPopup("STM_SAP_0440.do" + param, 500, 400, "setARCenter", "0,0", true, false);
					break;
				case "btn_ap_ctr_cd":
	        		var param="?f_center=" + document.form.ap_ctr_cd.value;
	        		ComOpenPopup("STM_SAP_0440.do" + param, 500, 400, "setAPCenter", "0,0", true, false);
					break;
			} // end switch
		} catch (e) {
			if (e == "[object Error]") {
				ComShowMessage(OBJECT_ERROR);
			} else {
				ComShowMessage(e.message);
			}
		}
	}

	/**
	 * /handling sheet process <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     doActionIBSheet(sheetObj, document.form, IBSEARCH)
	 * </pre>			 
	 * 
	 * @param {ibsheet} sheetObj 필수 IBSheet Object
	 * @param {form} formObj 필수 html form object
	 * @param {int} sAction 필수 프로세스 플래그 상수
	 * @return 없음
	 * @author 서미진
	 * @version 2010.10.13
	 */
	function doActionIBSheet(sheetObj, formObj, sAction) {
		try {
	 		sheetObj.ShowDebugMsg(false);
	 		switch (sAction) {
	 			case IBSEARCH: // 조회
	 				if (!validateForm(sheetObj,document.form,sAction)) {
						return false;
					}
	 				break;
		 		case SEARCH01: //	Office Code 정보를 조회		
		 			if (!validateForm(sheetObj,document.form,sAction)) {
						return false;
					}			 			
		 			formObj.f_cmd.value=SEARCH01;	
		 			create_ofc_cd=formObj.ofc_cd.value;
 		 			var sXml=sheetObjects[0].GetSearchData("BCM_CCD_0032GS.do", FormQueryString(formObj));
		 			// sheetObjects[0].LoadSearchXml(sXml);
		 			//새로운 ofc_cd 인지 확인
	 		 		if (ComGetEtcData(sXml,"input_flg")  != undefined){ 
	 		 			formObj.input_flg.value=ComGetEtcData(sXml,"input_flg");
	 		 			ComSetObjValue(ofc_tp_cd, ComGetEtcData(sXml,"ofc_tp_cd"));
	 		 			ComSetObjValue(ofc_knd_cd, ComGetEtcData(sXml,"ofc_knd_cd"));
	 		 			ComSetObjValue(agn_knd_cd, ComGetEtcData(sXml,"agn_knd_cd"));	 		 		
	 		 			ComSetObjValue(ofc_sls_delt_flg, ComGetEtcData(sXml,"ofc_sls_delt_flg"));	 		 			
//	 		 			ComSetObjValue(doc_rcvr_hide_flg, ComGetEtcData(sXml,"doc_rcvr_hide_flg"));
//	 		 			ComSetObjValue(finc_hide_flg, ComGetEtcData(sXml,"finc_hide_flg"));
	 		 			ComSetObjValue(subs_co_flg, ComGetEtcData(sXml,"subs_co_flg"));
	 		 			ComSetObjValue(sls_ofc_div_cd, ComGetEtcData(sXml,"sls_ofc_div_cd"));
	 		 			ComSetObjValue(mnl_bkg_no_opt_cd, ComGetEtcData(sXml,"mnl_bkg_no_opt_cd"));
//	 		 			ComSetObjValue(ofc_rfa_sc_use_flg, ComGetEtcData(sXml,"ofc_rfa_sc_use_flg"));	 		 			
	 		 			ComSetObjValue(sub_agn_flg, ComGetEtcData(sXml,"sub_agn_flg"));	 		 				
	 		 			//ComSetObjValue(ap_euro_curr_use_flg, ComGetEtcData(sXml,"ap_euro_curr_use_flg"));	 		 			
	 		 			ComSetObjValue(so_if_cd, ComGetEtcData(sXml,"so_if_cd"));
	 		 			ComSetObjValue(ar_hd_qtr_ofc_cd, ComGetEtcData(sXml,"ar_hd_qtr_ofc_cd"));
	 		 			ComSetObjValue(altn_curr_div_cd, ComGetEtcData(sXml,"altn_curr_div_cd"));
	 		 			ComSetObjValue(finc_rgn_cd, ComGetEtcData(sXml,"finc_rgn_cd"));
	 		 			ComSetObjValue(delt_flg, ComGetEtcData(sXml,"delt_flg"));
	 		 			ComSetObjValue(ppd_pty_tp_cd, ComGetEtcData(sXml,"ppd_pty_tp_cd"));
	 		 			// modi_ofc_cd은 콤보가 아니고 일단 Text type
//	 		 			ComSetObjValue(modi_ofc_cd, ComGetEtcData(sXml,"modi_ofc_cd"));
	 		 			//document.form.modi_ofc_cd.value = ComGetEtcData(sXml,"modi_ofc_cd");
	 		 			//document.form.old_modi_ofc_cd.value = ComGetEtcData(sXml,"modi_ofc_cd");
	 		 			document.form.modi_cost_ctr_cd.value = ComGetEtcData(sXml,"modi_cost_ctr_cd");
	 		 			document.form.modi_agn_cd.value = ComGetEtcData(sXml,"modi_agn_cd");
	 		 			
	 		 			formObj.ibflag.value="U";
	 		 		}else { 
     					//ComOpenWait(false);
     					// showing message when data not exists
     					if (G_MDAA_CHK == "Y") {
     						if (ComShowCodeConfirm("COM130407", "Office Code")) {
     		 		 			//새로운 ofc_cd 이다.
     		 		 			formObj.input_flg.value="Y";
     		 		 			delt_flg.SetSelectCode("N");
     		 		 			formObj.ibflag.value="I";
     	     		       		formObj.ofc_cd.readOnly=true;
     	     		       		formObj.ofc_eng_nm.focus();
     	     		       		// office code copy to SAP Office ID 
     	     		       	    formObj.modi_agn_cd.value = formObj.ofc_cd.value;
     	     		       	    //formObj.modi_agn_cd.readOnly=true;
     							
     						} else {
     							doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
     						}
     					} else {
     						ComShowCodeMessage("COM130402", "Office Code");
     						doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
     					}
     					return;
	 		 		}
		 			sheetObj.LoadSearchData(sXml,{Sync:1} );
		 			ComSetObjValue(formObj.ar_agn_stl_cd, sheetObjects[0].GetCellValue(1,"ar_agn_stl_cd"));	
	 		 		break;				 		
	    		case SEARCH02: // MDM AUTH_TP_CD query
					var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=MDAA';
 					var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
					// global var setting
					G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
					G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
					break;
		 		case IBCLEAR:      // 초기화 	 
		 			formObj.reset();
		 			sheetObj.RemoveAll();
		 			formObj.ofc_cd.readOnly=false;
		 			formObj.fax_ip.value="NA";
		    		ofc_tp_cd.SetSelectCode("");
		    		ofc_knd_cd.SetSelectCode("");
		    		agn_knd_cd.SetSelectCode("");
		    		ofc_sls_delt_flg.SetSelectCode("");
//		    		doc_rcvr_hide_flg.SetSelectCode("");
//		    		finc_hide_flg.SetSelectCode("");
		    		subs_co_flg.SetSelectCode("");
		    		sls_ofc_div_cd.SetSelectCode("");
		    		mnl_bkg_no_opt_cd.SetSelectCode("");
//		    		ofc_rfa_sc_use_flg.SetSelectCode("");
		    		sub_agn_flg.SetSelectCode("");
		    		//ap_euro_curr_use_flg.SetSelectCode("");
		    		so_if_cd.SetSelectCode("");
		    		delt_flg.SetSelectCode("");
		    		ar_hd_qtr_ofc_cd.SetSelectCode(-1);
		    		altn_curr_div_cd.SetSelectCode("USD");
		    		finc_rgn_cd.SetSelectCode("");
		    		ppd_pty_tp_cd.SetSelectIndex(0, 0);
		    		//formObj.old_modi_ofc_cd.value = "";
		    		formObj.edi_if_flg.value = "N";
		 			ComSetFocus(document.form.ofc_cd);					
		 			formObj.ibflag.value="I";
		 			formObj.sprt_eml_inv_flg.value = "N";
	 		 		break;			
		 		case IBSAVE: // 저장
		 			if (!validateForm(sheetObj,document.form,sAction)) {
						return false;
					}
					if (!ComShowCodeConfirm("COM130101", "Data")) {
					    return false;
					}
		 			formObj.f_cmd.value=MULTI;
//		 			var sParam = sheetObj.GetSaveString(false, true);
//		 			sParam += "&f_cmd=" + formObj.f_cmd.value;
		 			var sParam=FormQueryString(formObj);
 		 			var sXml=sheetObj.GetSaveData("BCM_CCD_0032GS.do", sParam);
		 			var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
			     	   if(sav == "S"  ){
			     		  ComShowCodeMessage("COM130102", "Data");
			     		  doActionIBSheet(sheetObjects[0], document.form, SEARCH01);
			       	   }else{
			       		  //ComShowCodeMessage("COM130103", "Data");
			       	   }
 		 			sheetObj.LoadSaveData(sXml);
	 		 		break;
	 		}
		}catch(e){
			if (e == "[object Error]") {
				ComShowMessage(OBJECT_ERROR);
			} else {
				ComShowMessage(e.message);
			}
		}finally {
			 ComOpenWait(false);
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
     * All the combo box query
     */
	function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
		switch (sAction) {
			case SEARCH: // load page 시
 	     		var sXml=sheetObj.GetSearchData("BCM_CCD_0032GS.do", "f_cmd=" + SEARCH);
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
 	 * OnSearchEnd event function <br>
 	 */
 	function sheet1_OnSearchEnd(sheetObj, errMsg){
 		var formObj=document.form; 		
 		formObj.ofc_cd.readOnly=true;
 		//Unless there is a new add ofc_cd.
		if(formObj.input_flg.value == "Y"){
	 			sheetObj.DataInsert(-1);
	 			sheetObj.SetCellValue(1, "ofc_cd",create_ofc_cd);
	 			sheetObj.SetCellValue(1, "delt_flg","N");
	 			ComSetFocus(formObj.ofc_eng_nm);				
		}else{		
	 		// in sheet form Object set in the contents are retrieved.
			formObj.ofc_cd.value=sheetObj.GetCellValue(1, "ofc_cd");
			formObj.ofc_eng_nm.value=sheetObj.GetCellValue(1, "ofc_eng_nm");
			formObj.ofc_locl_nm.value=sheetObj.GetCellValue(1, "ofc_locl_nm");
			formObj.ofc_addr.value=sheetObj.GetCellValue(1, "ofc_addr");
			formObj.ofc_zip_cd.value=sheetObj.GetCellValue(1, "ofc_zip_cd");
			formObj.vndr_cd.value=sheetObj.GetCellValue(1, "vndr_seq");
			sheetObj.SetCellValue(1, "vndr_cd",sheetObj.GetCellValue(1, "vndr_seq"));
			formObj.intl_phn_no.value=sheetObj.GetCellValue(1, "intl_phn_no");
			formObj.ofc_phn_no.value=sheetObj.GetCellValue(1, "ofc_phn_no");
			formObj.intl_fax_no.value=sheetObj.GetCellValue(1, "intl_fax_no");
			formObj.ofc_fax_no.value=sheetObj.GetCellValue(1, "ofc_fax_no");
			formObj.ofc_rmk.value=sheetObj.GetCellValue(1, "ofc_rmk");
			formObj.loc_cd.value=sheetObj.GetCellValue(1, "loc_cd");
			formObj.bil_curr_cd.value=sheetObj.GetCellValue(1, "bil_curr_cd");
			formObj.ar_curr_cd.value=sheetObj.GetCellValue(1, "ar_curr_cd");
			formObj.ar_ctr_cd.value=sheetObj.GetCellValue(1, "ar_ctr_cd");
			formObj.prnt_ofc_cd.value=sheetObj.GetCellValue(1, "prnt_ofc_cd");
			formObj.opn_dt.value=ComGetMaskedValue(sheetObj.GetCellValue(1, "opn_dt"), "ymd");
			formObj.clz_dt.value=ComGetMaskedValue(sheetObj.GetCellValue(1, "clz_dt"), "ymd");
			//formObj.finc_rgn_cd.value=sheetObj.GetCellValue(1, "finc_rgn_cd");
			formObj.ar_ofc_cd.value=sheetObj.GetCellValue(1, "ar_ofc_cd");
			formObj.ib_cr_term_dys.value=sheetObj.GetCellValue(1, "ib_cr_term_dys");
			formObj.ob_cr_term_dys.value=sheetObj.GetCellValue(1, "ob_cr_term_dys");
			if(sheetObj.GetCellValue(1, "rep_cust_cnt_cd")!=undefined){
				formObj.rep_cust_cd.value=sheetObj.GetCellValue(1, "rep_cust_cnt_cd")+sheetObj.GetCellValue(1, "rep_cust_seq");
				sheetObj.SetCellValue(1, "rep_cust_cd",sheetObj.GetCellValue(1, "rep_cust_cnt_cd")+sheetObj.GetCellValue(1, "rep_cust_seq"));
	 		}else{
	 			formObj.rep_cust_cd.value="";
	 		}
			formObj.inv_pfx_cd.value=sheetObj.GetCellValue(1, "inv_pfx_cd");
			formObj.ap_ofc_cd.value=sheetObj.GetCellValue(1, "ap_ofc_cd");
			formObj.ap_ctrl_ofc_cd.value=sheetObj.GetCellValue(1, "ap_ctrl_ofc_cd");
			formObj.ap_ctr_cd.value=sheetObj.GetCellValue(1, "ap_ctr_cd");
			formObj.fx_curr_rt.value=sheetObj.GetCellValue(1, "fx_curr_rt");
			formObj.asa_cr_term_dys.value=sheetObj.GetCellValue(1, "asa_cr_term_dys");
			formObj.ofc_tax_id.value=sheetObj.GetCellValue(1, "ofc_tax_id");
			formObj.fax_ip.value=sheetObj.GetCellValue(1, "fax_ip");
			formObj.ofc_cmmc_cd.value=sheetObj.GetCellValue(1, "ofc_cmmc_cd");
			formObj.ofc_url.value=sheetObj.GetCellValue(1, "ofc_url");
			formObj.ofc_rep_eml.value=sheetObj.GetCellValue(1, "ofc_rep_eml");
			formObj.gl_ctr_cd.value=sheetObj.GetCellValue(1, "gl_ctr_cd");
			formObj.ofc_locl_lang_addr.value=sheetObj.GetCellValue(1, "ofc_locl_lang_addr");
			formObj.ppd_pty_tp_cd.value=sheetObj.GetCellValue(1, "ppd_pty_tp_cd");
			//formObj.modi_ofc_cd.value=sheetObj.GetCellValue(1, "modi_ofc_cd");
			formObj.cre_usr_id.value=sheetObj.GetCellValue(1, "cre_usr_id");
			formObj.cre_dt.value=sheetObj.GetCellValue(1, "cre_dt");
			formObj.upd_usr_id.value=sheetObj.GetCellValue(1, "upd_usr_id");
			formObj.upd_dt.value=sheetObj.GetCellValue(1, "upd_dt");
			formObj.sprt_eml_inv_flg.value=sheetObj.GetCellValue(1, "sprt_eml_inv_flg");
		}
 	}	
    /**
     * handling process for input validation <br>
     */
 	function validateForm(sheetObj, formObj, sAction) {
    	 switch (sAction) {
	    	 case SEARCH01: // retrieve
	    		// Office Code is null
		    	 if(formObj.ofc_cd.value == "") {
						ComShowCodeMessage('CCD00001',"Office Code"); 
						ComSetFocus(document.form.ofc_cd);					
						return false;
					}
	    	 	break;
	    	 case IBSAVE: // save
	    		// Office Code is null
		    	 if(formObj.ofc_cd.value == "") {
						ComShowCodeMessage('CCD00001',"Office Code"); 
						ComSetFocus(document.form.ofc_cd);					
						return false;
					}
	    		 //English Name is null
	    		 if(formObj.ofc_eng_nm.value == "") {
						ComShowCodeMessage('CCD00001',"English Name"); 
						ComSetFocus(document.form.ofc_eng_nm);					
						return false;
					}
	    		// Tel. No is null
	    		 if(formObj.intl_phn_no.value == "") {
						ComShowCodeMessage('CCD00001',"Tel. No"); 
						ComSetFocus(document.form.intl_phn_no);					
						return false;
					}
	    		// Tel. No is null
	    		 if(formObj.ofc_phn_no.value == "") {
						ComShowCodeMessage('CCD00001',"Tel. No"); 
						ComSetFocus(document.form.ofc_phn_no);					
						return false;
					}
		    	// Address is null
	    		 if(formObj.ofc_addr.value == "") {
						ComShowCodeMessage('CCD00001',"Address"); 
						ComSetFocus(document.form.ofc_addr);
						return false;
					}
	          	//Office Type is null
	          	if(ofc_tp_cd.GetSelectCode()==""){
	          		ComShowCodeMessage('CCD00001',"Office Type");
      				ComSetFocus(document.form.ofc_tp_cd);
	          		return false;
	          	}else if (ofc_tp_cd.GetSelectCode()== "BA"){
	          			if (agn_knd_cd.GetSelectCode()== ""){
	          				ComShowCodeMessage('CCD00001',"Agent Type"); 
	          				ComSetFocus(document.form.ofc_tp_cd);
	          				return false;
	          			}else if (agn_knd_cd.GetSelectCode()== " "){
	          				ComShowCodeMessage('CCD00001',"Agent Type");
	          				ComSetFocus(document.form.ofc_tp_cd);
	          				return false;
	          			}
	           	}
	          	//Office Kind is null
	          	if(ofc_knd_cd.GetSelectCode()==""){
	          		ComShowCodeMessage('CCD00001',"Office Kind");
      				ComSetFocus(document.form.ofc_knd_cd);
	          		return false;
	          	}
	          //Location Code is null
	    		 if(formObj.loc_cd.value == "") {
						ComShowCodeMessage('CCD00001',"Location Code"); 
						ComSetFocus(document.form.loc_cd);
						return false;
					}
	    	      //A/R Regional HQ is null
	    	     if(ofc_tp_cd.GetSelectCode()!= "HO"){
	    	    	 if(ar_hd_qtr_ofc_cd.GetSelectCode()== "") {
	    				ComShowCodeMessage('CCD00001',"A/R Regional HQ");
						ComSetFocus(document.form.ar_hd_qtr_ofc_cd);
						return false;
	    	    	 }else if (ar_hd_qtr_ofc_cd.GetSelectCode()== " ")	 {
						ComShowCodeMessage('CCD00001',"A/R Regional HQ");
						ComSetFocus(document.form.ar_hd_qtr_ofc_cd);
						return false;
	    	    	 }
	    	     }
	    	     
//	    	     if (formObj.modi_ofc_cd.value == "") {
//					ComShowCodeMessage('CCD00001', "Legacy Code");
//					ComSetFocus(document.form.modi_ofc_cd);
//					return false;
//				 }

				 if (formObj.modi_cost_ctr_cd.value == "") {
					ComShowCodeMessage('CCD00001', "SAP CTR Code");
					ComSetFocus(document.form.modi_cost_ctr_cd);
					return false;
				 }

				 if (formObj.modi_agn_cd.value == "") {
					ComShowCodeMessage('CCD00001', "SAP Office ID");
					ComSetFocus(document.form.modi_agn_cd);
					return false;
				 }
	    	     
//	    	     if (formObj.modi_ofc_cd.value != formObj.old_modi_ofc_cd.value) {
//	    	    	 formObj.edi_if_flg.value = "Y";
//	    	     } else {
//	    	    	 formObj.edi_if_flg.value = "N";
//	    	     }
	    		 break;
    	 }
 		return true;
 	}	
    /**
     * Axon  EVENT Catch.<br>
     */    
      function initControl() {
          //Axon event handling catch            
//        axon_event.addListenerForm('keydown', 'obj_deactivate', document.form);   
// 		axon_event.addListenerFormat ('keypress', 'obj_keypress', document.form	);
 		axon_event.addListenerForm('change', 'obj_change', form);
 		axon_event.addListener('blur', 'isEmailAddr', 'ofc_rep_eml');
 		//axon_event.addListener('blur', 'isIpAddr', 'fax_ip');
 		//Only English 
 		ComClearSeparator (document.form.ofc_eng_nm,"eng"); 
 		ComClearSeparator (document.form.ofc_url,"eng"); 
 		//ComClearSeparator (document.form.ofc_rep_eml,"eng");
 		ComClearSeparator (document.form.ofc_cmmc_cd,"eng");
      } 
      /**
       * If the event data fields to be CHANGE
       */
      function obj_change(){
      	  var formObject=document.form;
      	  /*****Case more than two additional sheets tab sheet is used to specify a variable *****/
          var sheetObject1=sheetObjects[0];
          /*******************************************************/
      		try {
      		var srcName=ComGetEvent("name");
              switch(srcName) {                
	              	case "ofc_cd":	              	
	              		if(formObject.ofc_cd.value.length > 0){	              			
	        		        doActionIBSheet(sheetObject1, formObject, SEARCH01);
	              		}
	              		break;
	              	case "prnt_ofc_cd":
	              		if(formObject.prnt_ofc_cd.value.length>0){	
	              			formObject.f_cmd.value=SEARCH02;
	    		 			var sParam="f_cmd="       +formObject.f_cmd.value
	    		 						+ "&hidden_ofc_cd=" +formObject.prnt_ofc_cd.value;
 	    		 			var sXml=sheetObject1.GetSearchData("BCM_CCD_0032GS.do", sParam);
	    		 			var hidden_ofc_cd=ComGetEtcData(sXml, "result");
	        		        if(hidden_ofc_cd == ""){
	        		        	formObject.prnt_ofc_cd.value="";
	        		        	ComShowCodeMessage("COM130402", "Parent Office"); 		
	        		        	ComSetFocus(document.form.prnt_ofc_cd);		
	        		        } 
	              		}
	              		break;
	              	case "ar_ofc_cd":
	              		if(formObject.ar_ofc_cd.value.length>0){
	              			formObject.f_cmd.value=SEARCH02;
	    		 			var sParam="f_cmd="       +formObject.f_cmd.value
	    		 						+ "&hidden_ofc_cd=" +formObject.ar_ofc_cd.value;
 	    		 			var sXml=sheetObject1.GetSearchData("BCM_CCD_0032GS.do", sParam);
	    		 			var hidden_ofc_cd=ComGetEtcData(sXml, "result");
	    		 			 if(hidden_ofc_cd == ""){
	        		        	formObject.ar_ofc_cd.value="";
	        		        	ComShowCodeMessage("COM130402", "A/R Office"); 	
	        		        	ComSetFocus(document.form.ar_ofc_cd);		
	        		        }     
	              		}
	              		break;
//	              	case "ar_ctrl_ofc_cd":
//	              		if(formObject.ar_ctrl_ofc_cd.value.length>0){
//	              			formObject.f_cmd.value=SEARCH02;
//	    		 			var sParam="f_cmd="       +formObject.f_cmd.value
//	    		 						+ "&hidden_ofc_cd=" +formObject.ar_ctrl_ofc_cd.value;
// 	    		 			var sXml=sheetObject1.GetSearchData("BCM_CCD_0032GS.do", sParam);
//	    		 			var hidden_ofc_cd=ComGetEtcData(sXml, "result");
//	    		 			 if(hidden_ofc_cd == ""){
//	        		        	formObject.ar_ctrl_ofc_cd.value="";
//	        		        	ComShowCodeMessage("COM130402", "A/R Control Office"); 	
//	        		        	ComSetFocus(document.form.ar_ctrl_ofc_cd);	
//	        		        }    
//	              		}
//	              		break;
	              	case "ar_hd_qtr_ofc_cd":
	              		if(formObject.ar_hd_qtr_ofc_cd.value.length>0){
	              			formObject.f_cmd.value=SEARCH02;
	    		 			var sParam="f_cmd="       +formObject.f_cmd.value
	    		 						+ "&hidden_ofc_cd=" +formObject.ar_hd_qtr_ofc_cd.value;
 	    		 			var sXml=sheetObject1.GetSearchData("BCM_CCD_0032GS.do", sParam);
	    		 			var hidden_ofc_cd=ComGetEtcData(sXml, "result");
	    		 			 if(hidden_ofc_cd == ""){
	        		        	formObject.ar_hd_qtr_ofc_cd.value="";
	        		        	ComShowCodeMessage("COM130402", "A/R Regional HQ"); 	
	        		        	ComSetFocus(document.form.ar_hd_qtr_ofc_cd);
	        		        }      		        
	              		}
	              		break;
	              	case "ap_ofc_cd":
	              		if(formObject.ap_ofc_cd.value.length>0){
	              			formObject.f_cmd.value=SEARCH02;
	    		 			var sParam="f_cmd="       +formObject.f_cmd.value
	    		 						+ "&hidden_ofc_cd=" +formObject.ap_ofc_cd.value;
 	    		 			var sXml=sheetObject1.GetSearchData("BCM_CCD_0032GS.do", sParam);
	    		 			var hidden_ofc_cd=ComGetEtcData(sXml, "result");
	    		 			 if(hidden_ofc_cd == ""){
	        		        	formObject.ap_ofc_cd.value="";
	        		        	ComShowCodeMessage("COM130402", "A/P Office"); 	
	        		        	ComSetFocus(document.form.ap_ofc_cd);		
	        		        }    
	              		}
	              		break;
	              	case "ap_ctrl_ofc_cd":
	              		if(formObject.ap_ctrl_ofc_cd.value.length>0){
	              			formObject.f_cmd.value=SEARCH02;
	    		 			var sParam="f_cmd="       +formObject.f_cmd.value
	    		 						+ "&hidden_ofc_cd=" +formObject.ap_ctrl_ofc_cd.value;
 	    		 			var sXml=sheetObject1.GetSearchData("BCM_CCD_0032GS.do", sParam);
	    		 			var hidden_ofc_cd=ComGetEtcData(sXml, "result");
	    		 			 if(hidden_ofc_cd == ""){
	        		        	formObject.ap_ctrl_ofc_cd.value="";
	        		        	ComShowCodeMessage("COM130402", "A/P Control Office"); 	
	        		        	ComSetFocus(document.form.ap_ctrl_ofc_cd);		
	        		        }   
	              		}
	              		break;
	              	case "loc_cd":
	              		if(formObject.loc_cd.value.length>0){
	              			formObject.f_cmd.value=SEARCH03;
	    		 			var sParam="f_cmd="       +formObject.f_cmd.value
	    		 						+ "&hidden_ofc_cd=" +formObject.loc_cd.value;
 	    		 			var sXml=sheetObject1.GetSearchData("BCM_CCD_0032GS.do", sParam);
	    		 			var hidden_ofc_cd=ComGetEtcData(sXml, "result");
	    		 			 if(hidden_ofc_cd == ""){
	        		        	formObject.loc_cd.value="";
	        		        	ComShowCodeMessage("COM130402", "Location Code"); 	
	        		        	ComSetFocus(document.form.loc_cd);		
	        		        }   
	              		}
	              		break;
	              	case "ar_curr_cd":
	              		if(formObject.ar_curr_cd.value.length>0){
	              			formObject.f_cmd.value=SEARCH04;
	    		 			var sParam="f_cmd="       +formObject.f_cmd.value
	    		 						+ "&hidden_ofc_cd=" +formObject.ar_curr_cd.value;
 	    		 			var sXml=sheetObject1.GetSearchData("BCM_CCD_0032GS.do", sParam);
	    		 			var hidden_ofc_cd=ComGetEtcData(sXml, "result");
	    		 			 if(hidden_ofc_cd == ""){
	        		        	formObject.ar_curr_cd.value="";
	        		        	ComShowCodeMessage("COM130402", "A/R Currency"); 	
	        		        	ComSetFocus(document.form.ar_curr_cd);		
	        		        }   
	              		}
	              		break;
	              	case "bil_curr_cd":
	              		if(formObject.bil_curr_cd.value.length>0){
	              			formObject.f_cmd.value=SEARCH04;
	    		 			var sParam="f_cmd="       +formObject.f_cmd.value
	    		 						+ "&hidden_ofc_cd=" +formObject.bil_curr_cd.value;
 	    		 			var sXml=sheetObject1.GetSearchData("BCM_CCD_0032GS.do", sParam);
	    		 			var hidden_ofc_cd=ComGetEtcData(sXml, "result");
	    		 			 if(hidden_ofc_cd == ""){
	        		        	formObject.bil_curr_cd.value="";
	        		        	ComShowCodeMessage("COM130402", "A/P Currency"); 	
	        		        	ComSetFocus(document.form.bil_curr_cd);		
	        		        }   
	              		}
	              		break;
	              	case "rep_cust_cd":
	              		if(formObject.rep_cust_cd.value.length>0){
	              			if(formObject.rep_cust_cd.value.length!=8 || !ComIsNumber(formObject.rep_cust_cd.value.substring(3,6))){
	        		        	formObject.rep_cust_cd.value="";
	        		        	ComShowCodeMessage("COM130402", "Rep. Customer Code"); 	
	        		        	ComSetFocus(document.form.rep_cust_cd);	
	        		        	return false;
	              			}
	              			formObject.f_cmd.value=SEARCH05;
	    		 			var sParam="f_cmd="+formObject.f_cmd.value + "&hidden_ofc_cd=" +formObject.rep_cust_cd.value;
 	    		 			var sXml=sheetObject1.GetSearchData("BCM_CCD_0032GS.do", sParam);
	    		 			var hidden_ofc_cd=ComGetEtcData(sXml, "result");
	    		 			 if(hidden_ofc_cd == ""){
	        		        	formObject.rep_cust_cd.value="";
	        		        	ComShowCodeMessage("COM130402", "Rep. Customer Code"); 	
	        		        	ComSetFocus(document.form.rep_cust_cd);		
	        		        }   
	              		}
	              		break;
	              	case "vndr_cd":
	              		if(formObject.vndr_cd.value.length>0){
	              			formObject.f_cmd.value=SEARCH06;
	    		 			var sParam="f_cmd="       +formObject.f_cmd.value
	    		 						+ "&hidden_ofc_cd=" +formObject.vndr_cd.value;
	    		 			var sParam2="f_cmd="       + SEARCH07
	 						+ "&hidden_ofc_cd=" +formObject.vndr_cd.value;
 	    		 			var sXml=sheetObject1.GetSearchData("BCM_CCD_0032GS.do", sParam);
	    		 			var hidden_ofc_cd=ComGetEtcData(sXml, "result");
 	    		 			var sXml2=sheetObject1.GetSearchData("BCM_CCD_0032GS.do", sParam2);
	    		 			sheetObject1.SetCellValue(1, "vndr_cnt_cd",ComGetEtcData(sXml2, "result"));
	    		 			 if(hidden_ofc_cd == ""){
	        		        	formObject.vndr_cd.value="";
	        		        	sheetObject1.SetCellValue(1, "vndr_cnt_cd","");
	        		        	ComShowCodeMessage("COM130402", "Vendor Code"); 	
	        		        	ComSetFocus(document.form.vndr_cd);		
	        		        }
	              		}else{
	              			sheetObjects[0].SetCellValue(1, "vndr_cnt_cd","");
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
       * Onbeforedeactivate  event handling. <br>
       */   
       function obj_deactivate() {
           var formObj=document.form;
           var sheetObj=sheetObjects[0];   
           var eleName=event.srcElement.name;
           switch(eleName){     
           		case "fx_curr_rt":
           			ComChkObjValid(event.srcElement);         			
           			com_change_sheet( sheetObj, eleName );
               default:      
            	   com_change_sheet( sheetObj, eleName );
           }          
       }  
   /**
    * When you change the value of the hidden Sheet Html Object to reflect the changed value.<br>
    * Value is stored using a hidden sheet.<br>
    */  
    function com_change_sheet( sheetObj, colNm ){
    	var formObj=document.form;
        var eleValue="";
        if(document.getElementById(colNm).type=="text"){
            switch(colNm){
                default:
                    eleValue=document.getElementById(colNm).value;    
                    break;                  
            }           
            sheetObj.SetCellValue(1,colNm,eleValue);
        }else{
            sheetObj.SetCellValue(1,colNm,document.getElementById(colNm).GetSelectCode());
        }
    }
    
    function isEmailAddr(event){
        eventElement=ComGetEvent();
		if(eventElement.value.length > 0) {
			if(!ComIsEmailAddr(eventElement)) {
				ComShowCodeMessage("COM131501");
			}
		}
    }
    
//    function isIpAddr(event){
//        eventElement=ComGetEvent();
//        var sVal = getArgValue(eventElement);
//		if(sVal.length > 0) {
//			if(/^(?!0)(?!.*\.$)((1?\d?\d|25[0-5]|2[0-4]\d)(\.|$)){4}$/.test(sVal)) {
//				return;
//			}else{
//				ComShowCodeMessage("COM12114", "Fax IP Address");
//			}
//		}
//    }
    
    /**
     * COM_ENS_071 : Values ​​are selected from a pop-up
     */
    function getCOM_ENS_071_ofc_cd(rowArray) {
    	var formObj=document.form;
    	var colArray=rowArray[0];
    	formObj.ofc_cd.value=colArray[1];
    	doActionIBSheet(sheetObjects[0], formObj, SEARCH01);
		com_change_sheet( sheetObjects[0], "ofc_cd" );
    }	
    /**
     * COM_ENS_071 : Check the selection in the pop-up a multi-input hangyeongwoo one at a row
     */
    function getCOM_ENS_071_prnt_ofc_cd(rowArray) { 
    	var formObj=document.form;
    	var colArray=rowArray[0];	
    	formObj.prnt_ofc_cd.value=colArray[1];		
		com_change_sheet( sheetObjects[0], "prnt_ofc_cd" );	
    }
    /**
     * COM_ENS_071 :Check the selection in the pop-up a multi-input hangyeongwoo one at a row
     */
    function getCOM_ENS_071_ar_ofc_cd(rowArray) {  
    	var formObj=document.form;
    	var colArray=rowArray[0];	
    	formObj.ar_ofc_cd.value=colArray[1];		
		com_change_sheet( sheetObjects[0], "ar_ofc_cd" );	
    }
    /**
     * COM_ENS_071 : Check the selection in the pop-up a multi-input hangyeongwoo one at a row
      */
    function getCOM_ENS_071_ar_ctrl_ofc_cd(rowArray) { 
    	var formObj=document.form;
    	var colArray=rowArray[0];	
    	formObj.ar_ctrl_ofc_cd.value=colArray[1];		
		com_change_sheet( sheetObjects[0], "ar_ctrl_ofc_cd" );	
    }
    /**
     * COM_ENS_071 : Check the selection in the pop-up a multi-input hangyeongwoo one at a row
     */
    function getCOM_ENS_071_ar_hd_qtr_ofc_cd(rowArray) {    
    	var formObj=document.form;
    	var colArray=rowArray[0];	
    	ar_hd_qtr_ofc_cd.value=colArray[1];		
		com_change_sheet( sheetObjects[0], "ar_hd_qtr_ofc_cd" );	
    }   
    /**
     * COM_ENS_071 : Check the selection in the pop-up a multi-input hangyeongwoo one at a row
     */
    function getCOM_ENS_071_ap_ofc_cd(rowArray) {    
    	var formObj=document.form;
    	var colArray=rowArray[0];	
    	formObj.ap_ofc_cd.value=colArray[1];		
		com_change_sheet( sheetObjects[0], "ap_ofc_cd" );	
    } 
    /**
     * COM_ENS_071 : Check the selection in the pop-up a multi-input hangyeongwoo one at a row
     */
    function getCOM_ENS_071_ap_ctrl_ofc_cd(rowArray) { 
    	var formObj=document.form;
    	var colArray=rowArray[0];	
    	formObj.ap_ctrl_ofc_cd.value=colArray[1];		
		com_change_sheet( sheetObjects[0], "ap_ctrl_ofc_cd" );	
    }    
    /**
     * COM_ENS_071 :Check the selection in the pop-up a multi-input hangyeongwoo one at a row
     */
    function getCOM_ENS_051_loc_cd(rowArray) { 
    	var formObj=document.form;
    	var colArray=rowArray[0];	
    	formObj.loc_cd.value=colArray[1];		
		com_change_sheet( sheetObjects[0], "loc_cd" );	
    }  
    /**
     * COM_ENS_N13 :Check the selection in the pop-up a multi-input hangyeongwoo one at a row
     */
    function getCOM_ENS_N13_ar_curr_cd(rowArray) { 
    	var formObj=document.form;
    	var colArray=rowArray[0];	
    	formObj.ar_curr_cd.value=colArray[0];		
		com_change_sheet( sheetObjects[0], "ar_curr_cd" );	
    } 
    /**
     * COM_ENS_N13 : Check the selection in the pop-up a multi-input hangyeongwoo one at a row
     */
    function getCOM_ENS_N13_bil_curr_cd(rowArray) {       	
    	var formObj=document.form;
    	var colArray=rowArray[0];	
    	formObj.bil_curr_cd.value=colArray[0];		
		com_change_sheet( sheetObjects[0], "bil_curr_cd" );	
    } 
    /**
     * COM_ENS_041 : Check the selection in the pop-up a multi-input hangyeongwoo one at a row
     */
    function getCOM_ENS_041_rep_cust_cd(rowArray) {   
    	var formObj=document.form;
    	var colArray=rowArray[0];	
    	formObj.rep_cust_cd.value=colArray[3];		
		com_change_sheet( sheetObjects[0], "rep_cust_cd" );	
    } 
    /**
     * COM_ENS_0C1 : Vendor code 
     */
   function getCOM_ENS_0C1_vndr_cd(rowArray, row, col) {   
   	var formObj=document.form;
	var colArray=rowArray[0];	
	formObj.vndr_cd.value=colArray[2];		
	sheetObjects[0].SetCellValue(1, "vndr_cnt_cd",colArray[7]);
	com_change_sheet( sheetObjects[0], "vndr_cd" );
    } 
    /**
     * IBMulti Combo Item's selected the events that occur when changes are made.<br>
     * The changes com_change_sheet () function should be reflected in Sheet. <br>
     */     
    function ofc_tp_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, text, code) {
        var formObj=document.form;
        var sheetObj=sheetObjects[0];
        var arrText=text.split("|");
    	if (arrText != null && arrText.length > 1) {
    		ofc_tp_cd.SetSelectCode(-1);
    	}
        com_change_sheet( sheetObj, "ofc_tp_cd" );
    }    
    /**
     * IBMulti Combo Item's selected the events that occur when changes are made.<br>
     * The changes com_change_sheet () function should be reflected in Sheet. <br>
     */     
    function ofc_knd_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, text, code) {
        var formObj=document.form;
        var sheetObj=sheetObjects[0];
        var arrText=text.split("|");
    	if (arrText != null && arrText.length > 1) {
    		ofc_knd_cd.SetSelectCode(-1);
    	}
        com_change_sheet( sheetObj, "ofc_knd_cd" );
    }    
    /**
     * IBMulti Combo Item's selected the events that occur when changes are made.<br>
     * The changes com_change_sheet () function should be reflected in Sheet. <br>
     */     
    function agn_knd_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, text, code) {
        var formObj=document.form;
        var sheetObj=sheetObjects[0];
        var arrText=text.split("|");
    	if (arrText != null && arrText.length > 1) {
    		agn_knd_cd.SetSelectCode(-1);
    	}
        com_change_sheet( sheetObj, "agn_knd_cd" );
    }    
    /**
     * IBMulti Combo Item's selected the events that occur when changes are made.<br>
     * The changes com_change_sheet () function should be reflected in Sheet. <br>
     */     
    function ofc_sls_delt_flg_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, text, code) {
        var formObj=document.form;
        var sheetObj=sheetObjects[0];
        var arrText=text.split("|");
    	if (arrText != null && arrText.length > 1) {
    		ofc_sls_delt_flg.SetSelectCode(-1);
    	}
        com_change_sheet( sheetObj, "ofc_sls_delt_flg" );
    }    
//    /**
//     * IBMulti Combo Item's selected the events that occur when changes are made.<br>
//     * The changes com_change_sheet () function should be reflected in Sheet. <br>
//     */     
//    function doc_rcvr_hide_flg_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, text, code) {
//        var formObj=document.form;
//        var sheetObj=sheetObjects[0];
//        var arrText=text.split("|");
//    	if (arrText != null && arrText.length > 1) {
//    		doc_rcvr_hide_flg.SetSelectCode(-1);
//    	}
//        com_change_sheet( sheetObj, "doc_rcvr_hide_flg" );
//    }  
//    /**
//     * IBMulti Combo Item's selected the events that occur when changes are made.<br>
//     * The changes com_change_sheet () function should be reflected in Sheet. <br>
//     */     
//    function finc_hide_flg_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, text, code) {
//        var formObj=document.form;
//        var sheetObj=sheetObjects[0];
//        var arrText=text.split("|");
//    	if (arrText != null && arrText.length > 1) {
//    		finc_hide_flg.SetSelectCode(-1);
//    	}
//        com_change_sheet( sheetObj, "finc_hide_flg" );
//    }  
    /**
     * IBMulti Combo Item's selected the events that occur when changes are made.<br>
     * The changes com_change_sheet () function should be reflected in Sheet. <br>
     */     
    function subs_co_flg_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, text, code) {
        var formObj=document.form;
        var sheetObj=sheetObjects[0];
        var arrText=text.split("|");
    	if (arrText != null && arrText.length > 1) {
    		subs_co_flg.SetSelectCode(-1);
    	}
        com_change_sheet( sheetObj, "subs_co_flg" );
    }  
    /**
     * IBMulti Combo Item's selected the events that occur when changes are made.<br>
     * The changes com_change_sheet () function should be reflected in Sheet. <br>
     */     
    function sls_ofc_div_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, text, code) {
        var formObj=document.form;
        var sheetObj=sheetObjects[0];
        var arrText=text.split("|");
    	if (arrText != null && arrText.length > 1) {
    		sls_ofc_div_cd.SetSelectCode(-1);
    	}
        com_change_sheet( sheetObj, "sls_ofc_div_cd" );
    }  
    /**
     * IBMulti Combo Item's selected the events that occur when changes are made.<br>
     * The changes com_change_sheet () function should be reflected in Sheet. <br>
     */     
    function mnl_bkg_no_opt_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, text, code) {
        var formObj=document.form;
        var sheetObj=sheetObjects[0];
        var arrText=text.split("|");
    	if (arrText != null && arrText.length > 1) {
    		mnl_bkg_no_opt_cd.SetSelectCode(-1);
    	}
        com_change_sheet( sheetObj, "mnl_bkg_no_opt_cd" );
    }  
    /**
     * IBMulti Combo Item's selected the events that occur when changes are made.<br>
     * The changes com_change_sheet () function should be reflected in Sheet. <br>
     */     
    function so_if_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, text, code) {
        var formObj=document.form;
        var sheetObj=sheetObjects[0];
        var arrText=text.split("|");
    	if (arrText != null && arrText.length > 1) {
    		so_if_cd.SetSelectCode(-1);
    	}
        com_change_sheet( sheetObj, "so_if_cd" );
    }  
    /**
     * IBMulti Combo Item's selected the events that occur when changes are made.<br>
     * The changes com_change_sheet () function should be reflected in Sheet. <br>
     */     
    function delt_flg_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, text, code) {
        var formObj=document.form;
        var sheetObj=sheetObjects[0];
        var arrText=text.split("|");
    	if (arrText != null && arrText.length > 1) {
    		delt_flg.SetSelectCode(-1);
    	}
    	
        com_change_sheet( sheetObj, "delt_flg" );
        if (code == 'Y' && !ComIsEmpty(oldText)){
			var checkFirm=ComShowConfirm(ComGetMsg("CCD00012"));
			if (checkFirm == 1){
				comboObj.SetSelectCode('Y');
			}else{
				comboObj.SetSelectCode('N');
			}
		}
    }
    /**
     * IBMulti Combo Item's selected the events that occur when changes are made.<br>
     * The changes com_change_sheet () function should be reflected in Sheet. <br>
     */
    function ar_hd_qtr_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, text, code) {
        var formObj=document.form;
        var sheetObj=sheetObjects[0];
        var arrText=text.split("|");
    	if (arrText != null && arrText.length > 1) {
     		ar_hd_qtr_ofc_cd.SetSelectCode(-1);
     	}
         com_change_sheet( sheetObj, "ar_hd_qtr_ofc_cd" );
    } //comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode

    /**
     * IBMulti Combo Item's selected the events that occur when changes are made.<br>
     * The changes com_change_sheet () function should be reflected in Sheet. <br>
     */
    function altn_curr_div_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, text, code) {
        var formObj=document.form;
        var sheetObj=sheetObjects[0];
        var arrText=text.split("|");
    	if (arrText != null && arrText.length > 1) {
    		altn_curr_div_cd.SetSelectCode(-1);
     	}
         com_change_sheet( sheetObj, "altn_curr_div_cd" );
    } //comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode

    /**
     * IBMulti Combo Item's selected the events that occur when changes are made.<br>
     * The changes com_change_sheet () function should be reflected in Sheet. <br>
     */     
    function ppd_pty_tp_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, text, code) {
        var formObj=document.form;
        var sheetObj=sheetObjects[0];
        var arrText=text.split("|");
      	if (arrText != null && arrText.length > 1) {
      		ppd_pty_tp_cd.SetSelectCode(-1);
      	}
        com_change_sheet( sheetObj, "ppd_pty_tp_cd" );
    }

    /**
     * OnKeyPress event handling. <br>
     */     
    function obj_keypress() {	   
    	obj=ComGetEvent();
		keyValidation(obj);
        var formObj=document.form;
        var srcName=ComGetEvent("name");
        switch(srcName) {
        	case "opn_dt":						
        		checkDateForm(formObj.opn_dt);
        		break;
        	case "clz_dt":				
        		checkDateForm(formObj.clz_dt);
        		break;
        }
   }
   
   function email() {
	   ComKeyOnlyAlphabet('num', "45|46|64|95");
   }
   
	/**
	 * Center 조회 후 값 Return 받아 셋팅한다.
	 */
	function setARCenter(aryPopupData) {
	    document.form.ar_ctr_cd.value=aryPopupData[0][1];
	}
   
	/**
	 * Center 조회 후 값 Return 받아 셋팅한다.
	 */
	function setAPCenter(aryPopupData) {
	    document.form.ap_ctr_cd.value=aryPopupData[0][1];
	}
