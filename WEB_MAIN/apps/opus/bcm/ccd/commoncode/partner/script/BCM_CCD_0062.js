/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0062.js
*@FileTitle  : Credit Customer Detail
*@author     : CLT
*@version    : 1.0
*@since      : 2018/12/19
=========================================================
*/

/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
			   MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
			   OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class BCM_CCD_0062 : BCM_CCD_0062 on the screen for creating the script defines the task using.
 */
    /** Common global variable */
	var sheetObjects=new Array();     
	var sheetCnt=0;
	var comboObjects=new Array();
	var comboCnt=0;
	var SH_CTRT = 0;
	var SH_RTL = 1;
	var oldCustomerXML = "";
	var oldTermXML = "";

	/** Event handler processing by button click event */
	document.onclick=processButtonClick;
	/** Event handler processing by button name */
	function processButtonClick() {

		/***** using extra sheet valuable if there are more 2 sheets다. *****/
        var sheetObject1=sheetObjects[0];
        var sheetObject2=sheetObjects[1];
        /*******************************************************/

        var formObj=document.form;
		try {
			var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
			
			switch (srcName) {
			case "btn_save":                                   
			    doActionIBSheet(sheetObjects[0], formObj, MULTI); 
				break;	
			case "btn_history":
				doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC01);
				break;
			// Payment Office POP
            case "btn_com_ens_071":
				var param="";
	    		param=param + "&" + "cr_clt_ofc_cd=" + form.cr_clt_ofc_cd.value;
	    		ComOpenPopup('/opuscntr/COM_ENS_071.do?' + param, 780, 510, 'setCallBackOffice', '1,0,1,1,1,1,1,1', true);
				break;
			// Credit Currency POP
            case "btn_com_ens_n13": 
 				var param="";
 	    		param=param + "&" + "cr_curr_cd=" + form.cr_curr_cd.value;
 	    		ComOpenPopup('/opuscntr/COM_ENS_N13.do?' + param, 700, 490, 'setCallBackCurrency', '1,0,1,1,1,1,1,1', true);
 				break;
 			// Credit Start Date POP 
            case "btn_cr_cust_st_dt": 
             	var cal=new ComCalendar();                
             	cal.select(document.form.cr_cust_st_dt, 'yyyy-MM-dd');
                break; 
             // Credit End Date POP 
            case "btn_cr_cust_end_dt": 
             	var cal=new ComCalendar();                
             	cal.select(document.form.cr_cust_end_dt, 'yyyy-MM-dd');
             	break;
             // Contract Number ADD
             case "btn_RowAdd1":
            	var iRow = sheetObject1.DataInsert(-1);
            	sheetObject1.SetCellValue(iRow, "cust_cd", document.form.cust_cd.value, 0);
				break;
			// Contract Number DEL
             case "btn_RowDelete1":					
            	var iRow = sheetObject1.GetSelectRow(); 
            	sheetObject1.SetRowHidden(iRow, 1); // 행 숨기기
     			if( sheetObject1.GetRowStatus(iRow) == "I"){
     				sheetObject1.RowDelete(iRow , 0);
     			} else {
     				sheetObject1.SetRowStatus(iRow, "D"); // 트랜잭션 상태 "삭제"로 만들기
     			}
     			
				break;
			// Associated/Child Customer ADD
             case "btn_RowAdd2":
            	var iRow = sheetObject2.DataInsert(-1);
            	sheetObject2.SetCellValue(iRow, "cust_cd", document.form.cust_cd.value, 0);
				break;
			// Associated/Child Customer DEL
             case "btn_RowDelete2":					
            	 var iRow = sheetObject2.GetSelectRow(); 
             	sheetObject2.SetRowHidden(iRow, 1); // 행 숨기기
      			if( sheetObject2.GetRowStatus(iRow) == "I"){
      				sheetObject2.RowDelete(iRow , 0);
      			} else {
      				sheetObject2.SetRowStatus(iRow, "D"); // 트랜잭션 상태 "삭제"로 만들기
      			}
				 break;
             case "btn_close":
             	ComClosePopup(); 
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
            ComEndConfigSheet(sheetObjects[i]);
        }
        
        initControl();
        
        doActionIBSheet(sheetObjects[0],formObj,INIT);
    }
    
    /**
     * All the combo box query
     */    
 	function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
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
				var HeadTitle="|||Contract Number";

				SetConfig( { Page:20} );

				var info    = { Sort:0, ColMove:0, HeaderCheck:0, ColResize:1 };
				var headers = [ { Text:HeadTitle, Align:"Center"} ];
				InitHeaders(headers, info);

				var cols = [ {Type:"Status", Hidden:1, Width:30, Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
				             {Type:"Text",   Hidden:1, Width:35, Align:"Center",  ColMerge:0,   SaveName:"cust_cd", KeyField:1, UpdateEdit:0, InsertEdit:1 },
				             {Type:"Text",   Hidden:1, Width:35, Align:"Center",  ColMerge:0,   SaveName:"cust_ctrt_seq" },
	             			 {Type:"Text",   Hidden:0, Width:35, Align:"Center",  ColMerge:0,   SaveName:"ctrt_no", KeyField:1, EditLen:20, UpdateEdit:0, InsertEdit:1 }
				              ];
				 
				InitColumns(cols);

				SetEditable(1);
				SetColProperty(0 ,"ctrt_no" ,  {AcceptKeys: "E|N" , InputCaseSensitive:1});

				SetWaitImageVisible(0);
				SetSheetHeight(ComGetSheetHeight(sheetObj, 4));
			}
			break;
		case "sheet2":
			with(sheetObj){
				var HeadTitle="|||Cutomer Code|Customer Name|Payment Office|Financial Risk Flag";
				
				SetConfig( { Page:20 } );
				
				var info    = { Sort:0, ColMove:0, HeaderCheck:0, ColResize:1 };
				var headers = [ { Text:HeadTitle, Align:"Center"} ];
				InitHeaders(headers, info);
				
				var cols = [ {Type:"Status",  Hidden:1,  Width:40,  Align:"Center",  ColMerge:0, SaveName:"ibflag" },
				             {Type:"Text",    Hidden:1,  Width:70,  Align:"Center",  ColMerge:0, SaveName:"cust_cd",         		KeyField:1, UpdateEdit:0, InsertEdit:1 },
				             {Type:"Text",    Hidden:1,  Width:100, Align:"Center",  ColMerge:0, SaveName:"cust_rlt_seq" },
							 {Type:"Text",    Hidden:0,  Width:110, Align:"Center",  ColMerge:0, SaveName:"chd_cust_cd",     		KeyField:1, EditLen:8, FullInput:1, UpdateEdit:0, InsertEdit:1 },
							 {Type:"Text",    Hidden:0,  Width:350, Align:"left",    ColMerge:0, SaveName:"chd_cust_nm",     		KeyField:1,                         UpdateEdit:0, InsertEdit:0 },
							 {Type:"Text",    Hidden:0,  Width:120, Align:"Center",  ColMerge:0, SaveName:"chd_clt_ofc_cd",  		KeyField:1, EditLen:5, FullInput:1, UpdateEdit:1, InsertEdit:1 },
							 {Type:"Combo",   Hidden:0,  Width:60,  Align:"Center",  ColMerge:0, SaveName:"chd_cust_rlse_ctrl_flg", KeyField:1, EditLen:1, FullInput:1, UpdateEdit:1, InsertEdit:1 }
							 ];
				
				InitColumns(cols);
				
				SetEditable(1);
				SetColProperty(0 ,"chd_cust_cd",    {AcceptKeys: "E|N" , InputCaseSensitive:1});
				SetColProperty(0 ,"chd_clt_ofc_cd", {AcceptKeys: "E|N" , InputCaseSensitive:1});
				SetColProperty("chd_cust_rlse_ctrl_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
				
				SetWaitImageVisible(0);
				SetSheetHeight(ComGetSheetHeight(sheetObj, 4));
			}
			break;			
		}		
   }
   
   // handling sheet process
   function doActionIBSheet(sheetObj,formObj,sAction) {
       switch(sAction) {
       
       	case INIT: 

			formObj.reset();
 			
            doActionIBSheet(sheetObj, formObj, SEARCH01);
            doActionIBSheet(sheetObj, formObj, SEARCH06);
            
            if (G_MDAA_CHK == 'Y' || CRDT_CHK == 'Y') {
    			ComSetDisplay('btn_save', true);
    			ComBtnEnable('btn_save');
    		} else {
    			ComSetDisplay('btn_save', false);
    		}
       		
	    	ComSetObjValue(formObj.cust_input_flg, "I"); // Credit Customer : NEW
	    	ComSetObjValue(formObj.term_input_flg, "I"); // Credit Customer Term : NEW
	    	
	    	ComSetObjValue(formObj.mlt_cnt_flg,    "N"); // Multiple Country Country : 'N'
	    	ComSetObjValue(formObj.ob_cr_term_dys, "0"); // O/B Credit Term : 0
	    	ComSetObjValue(formObj.ib_cr_term_dys, "0"); // I/B Credit Term : 0
	    	ComSetObjValue(formObj.delt_flg,       "N"); // Delete Flag : 'N'
	    	ComSetObjValue(formObj.cr_rdy_flg,     "N"); // Freight Release Ready Flag : 'N'
	    		    		    	
       		if (validateForm(sheetObj,formObj,sAction)) {
       			// NEW
       			if (formObj.cust_agmt_no.value == "") {
       				ComEnableObject(formObj.cust_agmt_no, true);
       			}
       			// MODIFY
       			else { 
       				ComEnableObject(formObj.cust_agmt_no, false);
				}
       			
       			doActionIBSheet(sheetObj, formObj, SEARCH);
			}
       		
       		break;
       		
		case SEARCH01: // MDM AUTH_TP_CD
			
			var sParam = 'f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=MDAA';
			var sXml   = sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
			G_MDAA_CHK = ComGetEtcData(sXml, "MDAA_CHK");
			G_AHTU_TP_CD = ComGetEtcData(sXml, "AUTH_TP_CD");

       		break;
       		
    	case SEARCH06: // MDM AUTH_TP_CD query
    		
			var sParam = 'f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=CRDT';
			var sXml   = sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
			CRDT_CHK   = ComGetEtcData(sXml, "AUTH_TP_CD") != "A" ? "Y" : "N";
			break;		      		
			
    	case SEARCH: //Retrieve

			if(!validateForm(sheetObj,formObj,sAction)) {
				return false;
			}
			
			formObj.f_cmd.value = SEARCH;
			
			var sXml=sheetObj.GetSearchData("BCM_CCD_0062GS.do", FormQueryString(formObj));
			var arrXml=sXml.split("|$$|");  
            
            // Customer & Credit Customer 
           	setCreditCustomerFormData(arrXml[0], arrXml[1]);
            // Credit Customer Term 
           	setCreditCustomerTermFromData(arrXml[2]);
            // Credit customer Constract
            sheetObjects[SH_CTRT].LoadSearchData(arrXml[3],{Sync:1} ); 
            // Credit Customer Relation
            sheetObjects[SH_RTL].LoadSearchData(arrXml[4],{Sync:1} ); 
           	
			break;
			
		case SEARCH02: // Payment Office check
			
			if (validateForm(sheetObj,formObj,sAction)) {
				ComOpenWait(true);
				formObj.f_cmd.value = SEARCH02;
				var sParam = FormQueryString(formObj);
				var sXml   = sheetObj.GetSearchData("BCM_CCD_0062GS.do", sParam);
		        var result = ComGetEtcData(sXml, "result");
		        if (result == "") {
		        	ComShowCodeMessage("COM130402", "Payment Office");
		        	formObj.cr_clt_ofc_cd.value = "";
		        }
		        
				ComOpenWait(false);
			}
			break;
				
    	case SEARCH03:      // Currency check
    		
			if (validateForm(sheetObj,formObj,sAction)) {
				ComOpenWait(true);
				formObj.f_cmd.value = SEARCH03;
				var sParam = FormQueryString(formObj);
				var sXml   = sheetObj.GetSearchData("BCM_CCD_0062GS.do", sParam);
		        var result = ComGetEtcData(sXml, "result");
		        if (result=="") {
		        	ComShowCodeMessage("COM130402", "Credit Currency Code");
		        	formObj.cr_curr_cd.value = "";
		        }
		        
				ComOpenWait(false);
			}
			break;		
    		
    	case MULTI: // SAVE

			if(!validateForm(sheetObj,formObj,sAction))  break;
    		
			if (isModified() == false) {
            	ComShowCodeMessage("COM130503");
            	break;
        	}
			
			if (ComShowCodeConfirm("COM130101", "Data") == false) break;
			
			formObj.f_cmd.value = MULTI;
			formObj.cr_amt.value         = ComGetUnMaskedValue(formObj.cr_amt.value, "int");
			formObj.cr_cust_st_dt.value  = ComGetUnMaskedValue(formObj.cr_cust_st_dt.value, "ymd"); 
			formObj.cr_cust_end_dt.value = ComGetUnMaskedValue(formObj.cr_cust_end_dt.value, "ymd");
			formObj.rvw_dt.value         = ComGetUnMaskedValue(formObj.rvw_dt.value, "ymd");
			
			var sParam = FormQueryString(formObj);
			
            var sParamSheet1=sheetObjects[SH_CTRT].GetSaveString();
            if (sParamSheet1 != "") {
                sParam += "&" + ComSetPrifix(sParamSheet1, "sheet1_");
            }
            var sParamSheet2=sheetObjects[SH_RTL].GetSaveString();
            if (sParamSheet2 != "") {
                sParam += "&" + ComSetPrifix(sParamSheet2, "sheet2_");
            } 

			var sXml = sheetObj.GetSaveData("BCM_CCD_0062GS.do", sParam);				
 			var sav  = ComGetEtcData(sXml, "TRANS_RESULT_KEY");
     	    if (sav == "S" ) {
     		    ComShowCodeMessage("COM130102", "Data");
         	    parent.setCallBackDetail();
         	    ComClosePopup(); 
       	    } else{
        		ComShowCodeMessage("COM132103", "Data");

    			formObj.cr_amt.value         = ComAddComma(formObj.cr_amt.value);
    			formObj.cr_cust_st_dt.value  = ComGetMaskedValue(formObj.cr_cust_st_dt.value, "ymd"); 
    			formObj.cr_cust_end_dt.value = ComGetMaskedValue(formObj.cr_cust_end_dt.value, "ymd");
    			formObj.rvw_dt.value         = ComGetMaskedValue(formObj.rvw_dt.value, "ymd");
       	    }	     
     	    
     	    sheetObj.LoadSaveData(sXml);		
		 		
    		break;
    		
    	case IBSEARCH_ASYNC01: // Credit Customer History
    		if(!validateForm(sheetObj,formObj,sAction)) return;
    		var cust_cd = ComGetObjValue(formObj.cust_cd);
    		var classId = "BCM_CCD_0063_POP"; 
    		var param = '?cust_cd='+cust_cd+'&pop_yn=Y&classId='+classId;
    		ComOpenPopup('/opuscntr/BCM_CCD_0063_POP.do' + param, 1024, 600, 'setCallBackHistory', '0,0', true, false);
    		break;
       }      		
	   
   }  

    /**
     * Customer & Credit Customer 조회결과 데이터를 FORM element 에 셋팅한다.
     * @param sXml
     */
    function setCreditCustomerFormData(custXml, crCustXml) {
    	
    	var formObj = document.form;
    	    	
	    // 삭제된 Customer or Credit Customer 인 경우, 등록 불가
	    if (ComXmlString(custXml, "delt_flg") == "Y" || ComXmlString(crCustXml, "delt_flg") == "Y") {
        	ComShowCodeMessage("COM12167", "Credit Customer");
	    	ComClosePopup();
	    	return;
	    }
	    
	    //  To-Be Customer Code 가 있는 경우 등록 불가
	    if (ComXmlString(custXml, "modi_cust_cd2") != "" ) {
	    	var toBeCustomer = ComXmlString(custXml, "modi_cust_cd2");
	    	
        	ComShowCodeMessage('CCD00074', toBeCustomer, formObj.cust_cd.value);
        	parent.setToBeCustomer(toBeCustomer);
	    	ComClosePopup();
        	return;
        } 

	    
    	// Customer Information
   		ComSetObjValue(formObj.cust_lgl_eng_nm, ComXmlString(custXml, "cust_lgl_eng_nm"));

   		
   		// Credit Customer Information
    	oldCustomerXML = crCustXml; // 원본 데이터 저장. 데이터 변경 여부 체크 시 사용
	    if (ComGetTotalRows(crCustXml) == 0) 
	    {
	    	formObj.cust_input_flg.value = "I";	// NEW  
	    } 
	    else 
	    {	    	
	    	formObj.cust_input_flg.value = "U";	// MODIFY
	    	
			ComSetObjValue(formObj.cr_clt_ofc_cd, 			ComXmlString(crCustXml, "cr_clt_ofc_cd"));
			ComSetObjValue(formObj.cust_rlse_ctrl_flg, 		ComXmlString(crCustXml, "cust_rlse_ctrl_flg"));
			ComSetObjValue(formObj.cust_cr_due_dt_div_cd, 	ComXmlString(crCustXml, "cust_cr_due_dt_div_cd"));
	    }
    }
    
    /**
     * Credit Customer Term 조회결과 데이터를 FORM element 에 셋팅한다.
     * @param sXml
     */
    function setCreditCustomerTermFromData(sXml) {
    	var formObj = document.form;
    	
    	oldTermXML = sXml; // 원본 데이터 저장. 데이터 변경 여부 체크 시 사용
    	
	    if (ComGetTotalRows(sXml) == 0) 
	    {
	    	if (formObj.cust_agmt_no.value != "") {
	    		ComShowCodeMessage("COM130402", "Credit Agreement No"); // Invalid
	    		ComClosePopup();
	    		return;
	    	} else {
		    	formObj.term_input_flg.value = "I";	// NEW  
		    	ComGetObject("cust_agmt_no").className = "input1";    
	    	}
	    } 
	    else 
	    {
	    	formObj.term_input_flg.value = "U";	// MODIFY
	    	ComGetObject("cust_agmt_no").className = "input2";    
	    	
	    	ComSetObjValue(formObj.cr_curr_cd, 		ComXmlString(sXml, "cr_curr_cd"));
	    	ComSetObjValue(formObj.cr_amt, 			ComAddComma(ComXmlString(sXml, "cr_amt")));
	    	ComSetObjValue(formObj.cr_cust_st_dt, 	ComGetMaskedValue(ComXmlString(sXml, "cr_cust_st_dt"),"ymd"));
	    	ComSetObjValue(formObj.cr_cust_end_dt, 	ComGetMaskedValue(ComXmlString(sXml, "cr_cust_end_dt"),"ymd"));
	    	ComSetObjValue(formObj.ib_cr_term_dys, 	ComXmlString(sXml, "ib_cr_term_dys"));
	    	ComSetObjValue(formObj.ob_cr_term_dys, 	ComXmlString(sXml, "ob_cr_term_dys"));
	    	ComSetObjValue(formObj.pay_dt_dy1, 		ComXmlString(sXml, "pay_dt_dy1"));
	    	ComSetObjValue(formObj.pay_dt_dy2, 		ComXmlString(sXml, "pay_dt_dy2"));
	    	ComSetObjValue(formObj.pay_dt_dy3, 		ComXmlString(sXml, "pay_dt_dy3"));
	    	ComSetObjValue(formObj.pay_dt_dy4, 		ComXmlString(sXml, "pay_dt_dy4"));
	    	ComSetObjValue(formObj.pic_eml, 		ComXmlString(sXml, "pic_eml"));
	    	ComSetObjValue(formObj.rvw_dt, 			ComGetMaskedValue(ComXmlString(sXml, "rvw_dt"),"ymd"));
	    	ComSetObjValue(formObj.aply_cnt_ctnt, 	ComXmlString(sXml, "aply_cnt_ctnt"));
	    	ComSetObjValue(formObj.mlt_cnt_flg, 	ComXmlString(sXml, "mlt_cnt_flg"));
	    	ComSetObjValue(formObj.cre_usr_id, 		ComXmlString(sXml, "cre_usr_id"));
	    	ComSetObjValue(formObj.cre_dt, 			ComXmlString(sXml, "cre_dt"));
	    	ComSetObjValue(formObj.upd_usr_id, 		ComXmlString(sXml, "upd_usr_id"));
	    	ComSetObjValue(formObj.upd_dt, 			ComXmlString(sXml, "upd_dt"));
			ComSetObjValue(formObj.delt_flg, 		ComXmlString(sXml, "delt_flg"));
			ComSetObjValue(formObj.cr_rdy_flg, 		ComXmlString(sXml, "cr_rdy_flg"));
			ComSetObjValue(formObj.cr_cust_rmk, 	ComXmlString(sXml, "cr_cust_rmk"));
				    	
	    	setMultipleCountry();	// Multiple Country Flag
	    }
    }
   
   /**
    * handling process for input validation
    */
    function validateForm(sheetObj, formObj, sAction) {
		switch (sAction) {
	    	
		case INIT:
		case SEARCH:
    		if (ComIsNull(formObj.cust_cd)) {
    			ComShowCodeMessage("CCD00001", "Customer Code");
    			return false;
    		}
    		break;	
    	case MULTI:
    		if(ComIsNull(formObj.cust_cd)){
    			ComShowCodeMessage("CCD00001", "Customer Code");
    			return false;
    		}

    		if(ComIsNull(formObj.cust_agmt_no)){
    			ComShowCodeMessage("CCD00001", "Credit Agreement No");
    			ComSetFocus(formObj.cust_agmt_no);
    			return false;
    		}
    		
    		if (!ComChkValid(formObj)) return false;
    		
    		if(!ComIsNull(formObj.pic_eml) && !ComIsEmailAddr(formObj.pic_eml)){
	   			ComShowCodeMessage("COM12114", " 'PIC Email'", "");
	   			ComSetFocus(formObj.pic_eml);
	   			return false;
	   		}
    		
    		// Multiple Country Flag
    		if (ComGetObjValue(formObj.mlt_cnt_flg) == "Y") 
      		{
      			if (ComIsNull(formObj.aply_cnt_ctnt)) 
      			{
      				ComShowCodeMessage("CCD00001", "Country/RHQ");
      				ComSetFocus(formObj.aply_cnt_ctnt);
      				return false;
      			}
      		}
    		
    		// Start date < End date
    		if (ComGetDaysBetween(formObj.cr_cust_st_dt, formObj.cr_cust_end_dt) < 0) 
    		{
				ComShowCodeMessage("CCD00005", "Credit End Date", "Credit Start Date");
				ComSetFocus(formObj.cr_cust_st_dt);
				return false;
			}
    		
    		// Term 은 최대 15개월
       		if(!ComCcdMonthsBetweenCheck(formObj.cr_cust_st_dt.value, formObj.cr_cust_end_dt.value, 15)) {
				ComShowCodeMessage("CCD00081", "15"); //only less than {?msg1}-month periods allowed
				ComSetFocus(formObj.cr_cust_st_dt);
				return false;
			 }
       		
       		if (ComIsNull(formObj.rvw_dt)) {
       			// Review Date 는 (End Date - 3개월)
           		ComSetObjValue(formObj.rvw_dt, ComGetDateAdd( ComGetObjValue(formObj.cr_cust_end_dt), "M", -3));
           		if (ComIsNull(formObj.rvw_dt)) {
           			ComShowCodeMessage("COM130403", "Review Date");
    				ComSetFocus(formObj.rvw_dt);
           			return false;
           		}
       		}
       		
       		// O/B or I/B or Payment1/2/3/4 필수
       		if ( ComIsNull(formObj.ob_cr_term_dys) && ComIsNull(formObj.ib_cr_term_dys) &&
       				ComIsNull(formObj.pay_dt_dy1) &&  ComIsNull(formObj.pay_dt_dy2) &&  
       				ComIsNull(formObj.pay_dt_dy3) &&  ComIsNull(formObj.pay_dt_dy4) ) 
       		{
       			ComShowCodeMessage("COM12138", "O/B Credit Term", "I/B Credit Term, Payment Date1/2/3/4");
				ComSetFocus(formObj.ob_cr_term_dys);
				return false;
       		}
    		
			// Payment Date1 - 일자 포맷 체크
			if(!ComIsNull(formObj.pay_dt_dy1)){
				if(!ComIsDay2(formObj.pay_dt_dy1)){
					ComShowCodeMessage("COM12187", "01~31");
					ComSetFocus(formObj.pay_dt_dy1);
					return false;
				}
			}
			// Payment Date2 - 일자 포맷 체크
			if(!ComIsNull(formObj.pay_dt_dy2)){
				if(!ComIsDay2(formObj.pay_dt_dy2)){
					ComShowCodeMessage("COM12187", "01~31");
					ComSetFocus(formObj.pay_dt_dy2);
					return false;
				}
			}
			// Payment Date3 - 일자 포맷 체크
			if(!ComIsNull(formObj.pay_dt_dy3)){
				if(!ComIsDay2(formObj.pay_dt_dy3)){
					ComShowCodeMessage("COM12187", "01~31");
					ComSetFocus(formObj.pay_dt_dy3);
					return false;
				}
			}
			// Payment Date4 - 일자 포맷 체크
			if(!ComIsNull(formObj.pay_dt_dy4)){
				if(!ComIsDay2(formObj.pay_dt_dy4)){
					ComShowCodeMessage("COM12187", "01~31");
					ComSetFocus(formObj.pay_dt_dy4);
					return false;
				}
			}
			
			// Contract Number 중복 체크
			var dRow = sheetObjects[SH_CTRT].ColValueDup("ctrt_no",{"IncludeDelRow":0, "IncludeEmpty":0});
			if (dRow >= 0) {
        	    ComShowCodeMessage('COM12115', 'Contract Number : [' + sheetObjects[SH_CTRT].GetCellValue(dRow, "ctrt_no")+']');
        	    sheetObjects[SH_CTRT].SelectCell(dRow, sheetObjects[SH_CTRT].SaveNameCol("ctrt_no"));
                return false;
            }
			
			// Child Customer 중복 체크
			dRow = sheetObjects[SH_RTL].ColValueDup("chd_cust_cd",{"IncludeDelRow":0, "IncludeEmpty":0});
			if (dRow >= 0) {
        	    ComShowCodeMessage('COM12115', 'Customer Code : [' + sheetObjects[SH_RTL].GetCellValue(dRow, "chd_cust_cd")+']');
        	    sheetObjects[SH_RTL].SelectCell(dRow, sheetObjects[SH_RTL].SaveNameCol("chd_cust_cd"));
                return false;
            }
			
			// Customer 와 Child 간 중복 체크
			dRow = sheetObjects[SH_RTL].FindText("chd_cust_cd", ComGetObjValue(formObj.cust_cd))
			if (dRow >= 0) {
        	    ComShowCodeMessage('CCD00082', 'Associated / Child Customer Code', "Customer Code");
        	    sheetObjects[SH_RTL].SelectCell(dRow, sheetObjects[SH_RTL].SaveNameCol("chd_cust_cd"));
                return false;
            }
				
			// Contract Number 필수 체크
			for (var i=1; i<=sheetObjects[SH_CTRT].RowCount(); i++)
    		{
				if (sheetObjects[SH_CTRT].GetRowStatus(i) == "D") continue; 
    			
    			if (sheetObjects[SH_CTRT].GetCellValue(i, "ctrt_no") == "")
    			{
    				ComShowCodeMessage("CCD00001", "Contract Number");
    				sheetObjects[SH_CTRT].SelectCell(i, sheetObjects[SH_CTRT].SaveNameCol("ctrt_no"));
    				return false;
    			}
    		}
			
			// Child Customer Code 필수
			for (var i=1; i<=sheetObjects[SH_RTL].RowCount(); i++)
    		{
    			if (sheetObjects[SH_RTL].GetRowStatus(i) == "D") continue; 
    			
    			if (sheetObjects[SH_RTL].GetCellValue(i, "chd_cust_cd") == "")
    			{
    				ComShowCodeMessage("CCD00001", "Customer Code");
    				sheetObjects[SH_RTL].SelectCell(i, sheetObjects[SH_RTL].SaveNameCol("chd_cust_cd"));
    				return false;
    			}
    			
    			if (sheetObjects[SH_RTL].GetCellValue(i, "chd_clt_ofc_cd") == "")
    			{
    				ComShowCodeMessage("CCD00001", "Payment Office");
    				sheetObjects[SH_RTL].SelectCell(i, sheetObjects[SH_RTL].SaveNameCol("chd_clt_ofc_cd"));
    				return false;
    			}
    		}

		  break;
		}
		 
		return true;	 
    }
   
	function initControl() {
		var formObj = document.form;
		axon_event.addListenerForm('change', 'obj_change', formObj);
		axon_event.addListenerForm('keypress', 'obj_keypress', formObj);
		axon_event.addListenerForm('focusout', 'obj_focusout', formObj);		
		axon_event.addListener('keyup', 'obj_keyup', 'cr_amt');
	}
	
   /**
   * HTML Object OnKeyUp event handling
   */
   function obj_keypress(event) {
      var obj=event.srcElement;
      keyValidation(obj);      
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
	   		//if(ComGetBtnDisable(srcName)) return false;
            switch(srcName) {
           	case "cr_clt_ofc_cd":
           		if (formObject.cr_clt_ofc_cd.value.length > 0) {
           			doActionIBSheet(sheetObject1, formObject, SEARCH02);
           		}
           		break;
           	case "cr_curr_cd":
           		if (formObject.cr_curr_cd.value.length > 0) {
           			doActionIBSheet(sheetObject1, formObject, SEARCH03);
           		}
           		break;           	
           	case "delt_flg":
           		if (formObject.delt_flg.value == "Y" ) {
		   			if (ComShowConfirm(ComGetMsg("CCD00012"))) {
		   				formObject.delt_flg.value = "Y";
		   			} else {
		   				formObject.delt_flg.value = "N";
		   			}
		   		}
           		break;
           	case "mlt_cnt_flg":
           		setMultipleCountry();           		
           		break;
           	case "cr_cust_end_dt": // Credit End Date
            	if (ComIsNull(formObject.cr_cust_end_dt)) {
           			ComSetObjValue(formObject.rvw_dt, "");
           		} else {
               		// Review Date 는 (End Date - 3개월)
               		ComSetObjValue(formObject.rvw_dt, ComGetDateAdd( ComGetObjValue(formObject.cr_cust_end_dt), "M", -3));
           		}
           	case "cr_cust_st_dt": // Credit Start Date
            	if (!ComIsNull(formObject.cr_cust_st_dt) && !ComIsNull(formObject.cr_cust_end_dt)) {
               		if(!ComCcdMonthsBetweenCheck(formObject.cr_cust_st_dt.value, formObject.cr_cust_end_dt.value,15)) {
        				ComShowCodeMessage("CCD00081", "15"); //only less than {?msg1}-month periods allowed
        				event.srcElement.value = "";
        				event.srcElement.focus();
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
 
    function obj_focusout() {
        var formObject = document.form;

        switch(ComGetEvent("name")){
       	case "cr_cust_end_dt": // Credit End Date
        	if (ComIsNull(formObject.cr_cust_end_dt)) {
       			ComSetObjValue(formObject.rvw_dt, "");
       		} else {
           		// Review Date 는 (End Date - 3개월)
           		ComSetObjValue(formObject.rvw_dt, ComGetDateAdd( ComGetObjValue(formObject.cr_cust_end_dt), "M", -3));
       		}
       	case "cr_cust_st_dt": // Credit Start Date
        	if (!ComIsNull(formObject.cr_cust_st_dt) && !ComIsNull(formObject.cr_cust_end_dt)) {
           		if(!ComCcdMonthsBetweenCheck(formObject.cr_cust_st_dt.value, formObject.cr_cust_end_dt.value,15)) {
    				ComShowCodeMessage("CCD00081", "15"); //only less than {?msg1}-month periods allowed
    				event.srcElement.value = "";
    				event.srcElement.focus();
    			 }
        	}
       		break;
        }
    } 
    
    /**
     * Multiple Country Flag 변경에 따른 셋팅
     */
    function setMultipleCountry() {
	    var formObj = document.form;
	   
	    if (ComGetObjValue(formObj.mlt_cnt_flg) == "Y") 
  		{
  			ComEnableObject(formObj.aply_cnt_ctnt, true);
  			ComGetObject("aply_cnt_ctnt").className = "input1";
  		} else {
  			ComSetObjValue(formObj.aply_cnt_ctnt, "");
  			ComEnableObject(formObj.aply_cnt_ctnt, false);
  			ComGetObject("aply_cnt_ctnt").className = "input2";
  		}
    }
    
	/**
	 * When selecting from the pop-up check, pass a value to parent window. <br>
	 */
	function chkCallPopupOK(sheetObj) {
		var formObj = document.form;
		var calllFunc;
		var rArray = null;
		
		rArray = chkGetLocalCheckedRows(sheetObj);
		
		if (rArray == null) {
			ComShowCodeMessage("COM12114", "row");
			return;
		}
		calllFunc = formObj.calllFunc.value;
		opener.eval(calllFunc)(rArray);
		ComClosePopup(); 
	}
	
	/**
	 * Read from Pop up. <br>
	 */ 
	function setCallBackOffice(aryPopupData) {
		var formObj = document.form;
		formObj.cr_clt_ofc_cd.value = aryPopupData[0][3];
	} 
	
	function setCallBackCurrency(aryPopupData) {
		var formObj = document.form;
		formObj.cr_curr_cd.value = aryPopupData[0][2];
	}
	
	/**
	 * Read from History Pop-up. <br>
	 */ 
	function setCallBackHistory(aryPopupData) {
		var formObj=document.form;
	} 
	
    /**
     * initializing Form <br>
     * 
     * @return 
     */
    function resetFormData()  {
    	with(document.form) {
    	}
    }

   // Associated / Child Customer Code
   function sheet2_OnChange(sheetObj, row, col, val) {
		
		var colName = sheetObj.ColSaveName(col);

		switch (colName) {
	    
        case "chd_cust_cd":
        	
        	if (val.length == 8) {
        		
      			if (!ComIsNumber(val.substring(2, val.length))) {
		        	ComShowCodeMessage("COM12114", "Customer Code"); 	
		        	
    				sheetObj.SetCellValue(row, "chd_cust_cd",    "", 0);
    				sheetObj.SetCellValue(row, "chd_cust_nm",    "", 0);
    				sheetObj.SetCellValue(row, "chd_clt_ofc_cd", "", 0);
    				
    				sheetObj.SelectCell  (row, "chd_cust_cd");
    				
    				break;
      			}
        		
    			var sParam = "f_cmd=" + SEARCH09 + "&cust_cd=" + val;        
    			var sXml = sheetObjects[0].GetSearchData("BCM_CCD_0062GS.do", sParam);
    			
    			if(ComGetSelectSingleNode(sXml, "MESSAGE") != "") {
    				ComShowMessage(ComGetSelectSingleNode(sXml, "MESSAGE"));
    				sheetObj.SetCellValue(row, "chd_cust_cd",    "", 0);
    				sheetObj.SetCellValue(row, "chd_cust_nm",    "", 0);
    				sheetObj.SetCellValue(row, "chd_clt_ofc_cd", "", 0);
    				
    				sheetObj.SelectCell  (row, "chd_cust_cd");
    			} else {
    				sheetObj.SetCellValue(row, "chd_cust_nm",    ComGetEtcData(sXml,"cust_lgl_eng_nm"), 0);
    				sheetObj.SetCellValue(row, "chd_clt_ofc_cd", ComGetEtcData(sXml,"ofc_cd"), 0);
    			}
        	} else {
        		ComShowCodeMessage("COM12114", "Customer Code"); 
        		
				sheetObj.SetCellValue(row, "chd_cust_cd",    val, 0);
				sheetObj.SetCellValue(row, "chd_cust_nm",    "", 0);
				sheetObj.SetCellValue(row, "chd_clt_ofc_cd", "", 0);
				
				sheetObj.SelectCell  (row, "chd_cust_cd",    "");
        	}
			
            break;
            // chd_cust_cd -- END
            
        case "chd_clt_ofc_cd":
        	if (val.length == 0) break;
        	
        	if (val.length == 5) {
        		
        		var sParam = "f_cmd=" + SEARCH02 + "&cr_clt_ofc_cd=" + val;        
        		var sXml   = sheetObj.GetSearchData("BCM_CCD_0062GS.do", sParam);
		        var result = ComGetEtcData(sXml, "result");
		        if (result == "") {
		        	ComShowCodeMessage("COM130402", "Payment Office");
    				sheetObj.SetCellValue(row, "chd_clt_ofc_cd", "", 0);
    				sheetObj.SelectCell  (row, "chd_clt_ofc_cd");
		        }
        	} else {
        		ComShowCodeMessage("COM12114", "Payment Office"); 
        		
				sheetObj.SetCellValue(row, "chd_clt_ofc_cd", "", 0);
				sheetObj.SelectCell  (row, "chd_clt_ofc_cd",    "");
        	}
        	break;
        	// chd_clt_ofc_cd -- END
	    }
    }

	function isModified() {
		var formObj=document.form;
		var bRet = false;
		
		// Customer 변경 여부 체크
		if ( bRet == false) {
			if ( (ComGetObjValue(formObj.cr_clt_ofc_cd) 			!= ComXmlString(oldCustomerXML, "cr_clt_ofc_cd"))
				|| (ComGetObjValue(formObj.cust_rlse_ctrl_flg) 		!= ComXmlString(oldCustomerXML, "cust_rlse_ctrl_flg"))
				|| (ComGetObjValue(formObj.cust_cr_due_dt_div_cd) 	!= ComXmlString(oldCustomerXML, "cust_cr_due_dt_div_cd")) ) 
			{
				bRet = true;
			}			
		}
		
		// Term 변경 여부 체크
		if ( bRet == false) {
	    	if ( (ComGetObjValue(formObj.cr_curr_cd) 		!= ComXmlString(oldTermXML, "cr_curr_cd"))
		    	|| (ComGetUnMaskedValue(ComGetObjValue(formObj.cr_amt), "int") 		!= ComXmlString(oldTermXML, "cr_amt"))
		    	|| (ComGetUnMaskedValue(ComGetObjValue(formObj.cr_cust_st_dt), "ymd") 	!= ComXmlString(oldTermXML, "cr_cust_st_dt"))
		    	|| (ComGetUnMaskedValue(ComGetObjValue(formObj.cr_cust_end_dt), "ymd") != ComXmlString(oldTermXML, "cr_cust_end_dt"))
		    	|| (ComGetObjValue(formObj.ib_cr_term_dys) 	!= ComXmlString(oldTermXML, "ib_cr_term_dys"))
		    	|| (ComGetObjValue(formObj.ob_cr_term_dys) 	!= ComXmlString(oldTermXML, "ob_cr_term_dys"))
		    	|| (ComGetObjValue(formObj.pay_dt_dy1) 		!= ComXmlString(oldTermXML, "pay_dt_dy1"))
		    	|| (ComGetObjValue(formObj.pay_dt_dy2) 		!= ComXmlString(oldTermXML, "pay_dt_dy2"))
		    	|| (ComGetObjValue(formObj.pay_dt_dy3) 		!= ComXmlString(oldTermXML, "pay_dt_dy3"))
		    	|| (ComGetObjValue(formObj.pay_dt_dy4) 		!= ComXmlString(oldTermXML, "pay_dt_dy4"))
		    	|| (ComGetObjValue(formObj.pic_eml) 		!= ComXmlString(oldTermXML, "pic_eml"))
		    	|| (ComGetObjValue(formObj.aply_cnt_ctnt) 	!= ComXmlString(oldTermXML, "aply_cnt_ctnt"))
		    	|| (ComGetObjValue(formObj.mlt_cnt_flg) 	!= ComXmlString(oldTermXML, "mlt_cnt_flg")) 
		    	|| (ComGetObjValue(formObj.delt_flg) 		!= ComXmlString(oldTermXML, "delt_flg"))
		    	|| (ComGetObjValue(formObj.cr_rdy_flg) 		!= ComXmlString(oldTermXML, "cr_rdy_flg"))		  
		    	|| (ComGetObjValue(formObj.cr_cust_rmk) 	!= ComXmlString(oldTermXML, "cr_cust_rmk"))
		    	) 
	    	{
		    	bRet = true;
		    }
		}
		
		// Sheet (Contract Number, Child Customer) 변경 여부 체크
		if ( bRet == false) {
			if (ComIsModifiedSheets(sheetObjects)) {
	        	bRet = true;
			}
    	}

		return bRet;
	}
	