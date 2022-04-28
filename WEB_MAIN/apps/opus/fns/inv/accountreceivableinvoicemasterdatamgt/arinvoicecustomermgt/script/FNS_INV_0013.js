/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0013.js
*@FileTitle  : Customer Information Inquiry 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/

    // Common variables.
    var tabObjects=new Array();
    var tabCnt=0 ;
    var beforetab=1;
    var sheetObjects=new Array();
    var sheetCnt=0;
    // Defining button events.
    document.onclick=processButtonClick;
    /** 
    * Handling button event. <br>
    * <br><b>Example :</b>
    * <pre>
    * </pre>
    * @param  none.  
    * @return none.
    * @see #
    * @author 
    * @version 2009.10.19
    */ 
    function processButtonClick(){
        /***** Setting each tab's sheet variable. *****/
    	var sheetObject1=sheetObjects[0];
		var sheetObject2=sheetObjects[1];
        /*******************************************************/
        var formObject=document.form;
    	try {
    		var srcName=ComGetEvent("name");
            switch(srcName) {
                case "btn_retrieve":
					doActionIBSheet(sheetObjects[0],formObject,IBSEARCH);
					break;								
				case "btn_new":
					ComResetAll();
					document.getElementById('del_flg').style.display='none';
					ComSetFocus(form.frm_cust_cnt_cd);	
					break;
				case "btn_Pop":
					var param='?cust_cnt_cd='+formObject.frm_cust_cnt_cd.value+'&cust_seq='+formObject.frm_cust_seq.value+'&pop_yn=Y';
					var Row=1;
					var Col=1;
					ComOpenPopup('/opuscntr/FNS_INV_0013.do'+param, 920, 660, 'getPopData', '0,0', false, false, "", "", 0);
					break;
				case "btn_close":
					ComClosePopup(); 
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
    * @author 
    * @version 2009.10.19
    */ 
    function setSheetObject(sheet_obj){
       sheetObjects[sheetCnt++]=sheet_obj;
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
    * @author 
    * @version 2009.10.19
    */ 
    function loadPage() {
		for(i=0;i<sheetObjects.length;i++){
			ComConfigSheet (sheetObjects[i] );
			initSheet(sheetObjects[i],i+1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		document.form.frm_cust_cnt_cd.focus();
		if(document.form.pop_yn.value == "Y"){
			if(document.form.frm_cust_cnt_cd.value != "" && document.form.frm_cust_seq.value != "")
			doActionIBSheet(sheetObjects[0],document.form, IBSEARCH);
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
    * @author 
    * @version 2009.10.19
    */ 
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
		var sheetID=sheetObj.id;
        switch(sheetID) {
            case "sheet1":
                with(sheetObj){
            		var HeadTitle1="|cust_cnt_cd|cust_seq|cust_lgl_eng_nm|cust_lgl_eng_nm2|cust_rgst_no|cust_rgst_no2|bzet_addr|zip_cd|phn_no|fax_no|ofc_cd|cnt_cd|ste_nm|cty_nm|cust_rmk|cr_curr_cd|cr_amt|cr_st_dt|cr_end_dt|cr_clt_ofc_cd|ib_cr_term_dys|ob_cr_term_dys|cust_rlse_ctrl_flg|cntc_pson_nm|xch_rt_div_cd|cng_indiv_cd|act_cust_cnt_cd|act_cust_seq|ob_eml|ib_eml|inv_due_dt_dp_flg|cr_cust_rmk|pay_div_cd|bank_acct_no|ownr_nm|tva_no|bzct_nm|bztp_nm|locl_nm|indiv_corp_div_cd|locl_addr1|locl_addr2|locl_addr3|locl_addr4|cr_cust_tp_cd|kr_ib_ofc_cd|locl_zip_cd|ob_phn_no|ob_fax_no|cust_scr_div_cd|cust_scr_locl_amt|scr_st_dt|scr_end_dt|iss_div_cd|cust_cr_due_dt_div_cd|pay_dt_dy1|pay_dt_dy2|PAY_DT_DY3|PAY_DT_DY4|DELT_FLG";
            		var headCount=ComCountHeadTitle(HeadTitle1);
            		var prefix="sheet1_";

            		SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );

            		var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
            		var headers = [ { Text:HeadTitle1, Align:"Center"} ];
            		InitHeaders(headers, info);

            		var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
            		             {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cust_cnt_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
            		             {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cust_seq",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
            		             {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cust_lgl_eng_nm",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
            		             {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cust_lgl_eng_nm2",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
            		             {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cust_rgst_no",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cust_rgst_no2",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"bzet_addr",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"zip_cd",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"phn_no",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"fax_no",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cnt_cd",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ste_nm",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cty_nm",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cust_rmk",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cr_curr_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cr_amt",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cr_st_dt",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cr_end_dt",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cr_clt_ofc_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ib_cr_term_dys",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ob_cr_term_dys",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cust_rlse_ctrl_flg",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cntc_pson_nm",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"xch_rt_div_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cng_indiv_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"act_cust_cnt_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"act_cust_seq",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ob_eml",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ib_eml",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"inv_due_dt_dp_flg",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cr_cust_rmk",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"pay_div_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"bank_acct_no",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ownr_nm",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"tva_no",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"bzct_nm",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"bztp_nm",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"locl_nm",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"indiv_corp_div_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"locl_addr1",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"locl_addr2",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"locl_addr3",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"locl_addr4",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cr_cust_tp_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"kr_ib_ofc_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"locl_zip_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ob_phn_no",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ob_fax_no",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cust_scr_div_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cust_scr_locl_amt",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"scr_st_dt",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"scr_end_dt",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"iss_div_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cust_cr_due_dt_div_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"pay_dt_dy1",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"pay_dt_dy2",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"pay_dt_dy3",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"pay_dt_dy4",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                     {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"delt_flg",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
               
            		InitColumns(cols);

            		SetEditable(1);
            		SetSheetHeight(222);
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
    * @author 
    * @version 2009.10.19
    */ 
    function doActionIBSheet(sheetObj,formObj,sAction) {
    	sheetObj.ShowDebugMsg(false);
        switch(sAction) {
        	case IBSEARCH:      //retrieve				            		
        		if(validateForm(sheetObj,formObj,sAction) == false) return false;  
        		ComOpenWait(true);	
				if (sheetObj.id == "sheet1") {						
					formObj.f_cmd.value=SEARCH;
//parameter changed[check again]CLT
					sheetObj.DoSearch("FNS_INV_0013GS.do", FormQueryString(formObj) );
//					formObj.f_cmd.value=SEARCH;
//					sheetObj.DoSearch("FNS_INV_0013GS.do", FormQueryString(formObj) );
				}
				ComOpenWait(false);

            break;
		}
    }        
    //조회후
    function sheet1_OnSearchEnd(code, message) {
    	var formObj = document.form;
        if(message == 0) {

			if(sheetObjects[0].RowCount()> 0){
				IBS_CopyRowToForm(sheetObjects[0], formObj, 1, "frm_");
				formObj.frm_cr_amt.value=ComAddComma2(formObj.frm_cr_amt, "#,###.00");
				formObj.frm_cust_scr_locl_amt.value=ComAddComma2(formObj.frm_cust_scr_locl_amt, "#,###");
				if(formObj.frm_cust_cr_due_dt_div_cd.value == "S"){
					formObj.frm_cust_cr_due_dt_div_cd1.checked=true;
					formObj.frm_cust_cr_due_dt_div_cd2.checked=false;
				}else if(formObj.frm_cust_cr_due_dt_div_cd.value == "I"){
					formObj.frm_cust_cr_due_dt_div_cd1.checked=false;
					formObj.frm_cust_cr_due_dt_div_cd2.checked=true;
				}	
				if(formObj.frm_delt_flg.value == "Y"){
					//formObj.del_flg.style.display="";
					document.getElementById('del_flg').style.display='';
				}else{
					document.getElementById('del_flg').style.display='none';
				}
			} else {					
				formObj.frm_cust_lgl_eng_nm.value="";
				formObj.frm_cust_rgst_no.value="";					
				formObj.frm_bzet_addr.value="";
				formObj.frm_zip_cd.value="";
				formObj.frm_phn_no.value="";
				formObj.frm_fax_no.value="";
				formObj.frm_ofc_cd.value="";
				formObj.frm_cnt_cd.value="";
				formObj.frm_ste_nm.value="";
				formObj.frm_cty_nm.value="";
				formObj.frm_cust_rmk.value="";
				formObj.frm_cr_curr_cd.value="";
				formObj.frm_cr_amt.value="";
				formObj.frm_cr_st_dt.value="";
				formObj.frm_cr_end_dt.value="";
				formObj.frm_cr_clt_ofc_cd.value="";
				formObj.frm_ib_cr_term_dys.value="";
				formObj.frm_ob_cr_term_dys.value="";
				formObj.frm_cust_rlse_ctrl_flg.value="";
				formObj.frm_cntc_pson_nm.value="";					
				formObj.frm_xch_rt_div_cd.value="";
				formObj.frm_cng_indiv_cd.value="";
				formObj.frm_ob_eml.value="";
				formObj.frm_ib_eml.value="";					
				formObj.frm_inv_due_dt_dp_flg.value="";
				formObj.frm_cr_cust_rmk.value="";
				formObj.frm_pay_div_cd.value="";
				formObj.frm_bank_acct_no.value="";
				formObj.frm_ownr_nm.value="";
				formObj.frm_tva_no.value="";
				formObj.frm_bzct_nm.value="";
				formObj.frm_bztp_nm.value="";
				formObj.frm_locl_nm.value="";
				formObj.frm_indiv_corp_div_cd.value="";
				formObj.frm_locl_addr1.value="";
				formObj.frm_locl_addr2.value="";
				formObj.frm_locl_addr3.value="";
				formObj.frm_locl_addr4.value="";
				formObj.frm_cr_cust_tp_cd.value="";
				formObj.frm_kr_ib_ofc_cd.value="";
				formObj.frm_locl_zip_cd.value="";
				formObj.frm_ob_phn_no.value="";
				formObj.frm_ob_fax_no.value="";
				formObj.frm_cust_scr_div_cd.value="";
				formObj.frm_cust_scr_locl_amt.value="";
				formObj.frm_scr_st_dt.value="";
				formObj.frm_scr_end_dt.value="";
				formObj.frm_iss_div_cd.value="";
				formObj.frm_cust_cr_due_dt_div_cd1.checked=false;
				formObj.frm_cust_cr_due_dt_div_cd2.checked=false;
				formObj.frm_pay_dt_dy1.value="";
				formObj.frm_pay_dt_dy2.value="";
				formObj.frm_pay_dt_dy3.value="";
				formObj.frm_pay_dt_dy4.value="";
				formObj.frm_delt_flg.value="";
			}

            //조회 후 작업 수행

		    } else {
		
		
	   }

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
    * @author 
    * @version 2009.10.19
    */ 
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
        	if (ComIsNull(formObj.frm_cust_seq) && ComIsNull(formObj.frm_cust_rgst_no)) {
				ComShowCodeMessage('INV00004');
				ComSetFocus(form.frm_cust_seq);
				return false;
			}
			if(!ComIsNull(formObj.frm_cust_seq) && ComIsNull(formObj.frm_cust_cnt_cd)){
				ComShowCodeMessage('INV00004');
				ComSetFocus(form.frm_cust_cnt_cd);
				return false;
			}
        }
        return true;
    }				                			
    /** 
     * Sending parent window values.<br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  {object} formObj : Form object.[array]
     * @return none.
     * @see #
     * @author 
     * @version 2009.10.19
     */ 
    function getPopData(rowArray){
		var colArray=rowArray[0];	
		document.form.frm_cust_cnt_cd.value=colArray[1];
		document.form.frm_cust_seq.value=colArray[2];
	}
    /** 
     * Moving focus. <br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  {object} id_from 
     * @param  {object} id_to 
     * @param  {number} maxSize 
     * @return none.
     * @see #
     * @author 
     * @version 2009.10.19
     */ 
	function moveNext(id_from,id_to,maxSize) {			
		var cur=document.getElementById(id_from).value;
		curSize=cur.length;
		if (curSize == maxSize) {
			document.getElementById(id_to).focus();
		}
	}
	/** 
     * Coding event for OnFocusOut<br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  
     * @return none.
     * @see #
     * @author 
     * @version 2009.10.19
     */ 
  	function obj_focusout() {
  		var sheetObject=sheetObjects[0];
  		var formObject=document.form;
  		switch(event.srcElement.name){
  			case "frm_cust_rgst_no":
  				var rgst=formObject.frm_cust_rgst_no.value;
  				if(rgst.length == 13){
  					formObject.frm_cust_rgst_no.value=rgst.substr(0,6)+"-"+rgst.substr(6,7);
  				}else if(rgst.length == 10){
  					formObject.frm_cust_rgst_no.value=rgst.substr(0,3)+"-"+rgst.substr(3,2)+"-"+rgst.substr(5,5);
  				}
  			break;	  
  			case "frm_cust_seq":
  				var valueCustSeq=formObject.frm_cust_seq.value;
  				if(valueCustSeq != ""){
  					formObject.frm_cust_seq.value=ComLpad(valueCustSeq,6,"0");
  				}
  			break;	
  	    }
  	}
  	function msgmove(gubun){
  		msg.style.posLeft=event.x - 150 + document.body.scrollLeft;
  		msg.style.posTop=event.y - 35 + document.body.scrollTop;
	}
  	function msgset(gubun){
  		var formObject=document.form;
  		var textValue="";
  		var strmsg="";
  		if(gubun == "1"){
  			textValue=formObject.frm_xch_rt_div_cd.value;
  			if(textValue != "" && textValue != undefined){
	  			if(textValue == "A3"){
	  				strmsg="All + 3rd LCL";
	  			}else if(textValue == "AA"){
	  				strmsg="Inbound + Outbound";
	  			}else if(textValue == "I3"){
	  				strmsg="Inbound + 3rd LCL";
	  			}else if(textValue == "II"){
	  				strmsg="Inbound";
	  			}else if(textValue == "NN"){
	  				strmsg="None";
	  			}else if(textValue == "O3"){
	  				strmsg="Outbound + 3rd LCL";
	  			}else if(textValue == "OO"){
	  				strmsg="Outbound";
	  			}	  			
  			text='<table  width=150  bgcolor=#FFFFCC><tr><td style="height: 20px; border: #7896B1 1px solid; font-family: Tahoma,Arial,dotum,gulim; font-size: 14px; color: #606060; text-indent: 2px;  background-color:#CCFFFD;">' + strmsg + '</td></tr></table>';
  	  		msg.innerHTML=text;	
  			}	
  		}else{
  			textValue=formObject.frm_cng_indiv_cd.value;
  			if(textValue != "" && textValue != undefined){
	  			if(textValue == "B"){
	  				strmsg="Onboard Date";
	  			}else if(textValue == "C"){
	  				strmsg="Cargo Receiving Date";
	  			}else if(textValue == "N"){
	  				strmsg="S/A Date";
	  			}else if(textValue == "O"){
	  				strmsg="Sailing Date";
	  			}
  			text='<table  width=150  bgcolor=#FFFFCC><tr><td style="height: 20px; border: #7896B1 1px solid; font-family: Tahoma,Arial,dotum,gulim; font-size: 14px; color: #606060; text-indent: 2px;  background-color:#CCFFFD;">' + strmsg + '</td></tr></table>';
  	  		msg.innerHTML=text;	
  			}	
  		}  		
	}
	function msghide(gubun){
		msg.innerHTML='';
	}
