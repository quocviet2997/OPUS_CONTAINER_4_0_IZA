/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_CSR_0008.js
*@FileTitle  : CSR Interface Status 
*@author     : CLT 
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/

		// The common global variables
    	var sheetObjects=new Array();
    	var sheetCnt=0;
    	var Mincount=0;
    	document.onclick=processButtonClick;
    	function retrieve(){
    		var formObject=document.form;
    		doActionIBSheet(sheetObjects[0],formObject, IBSEARCH);
    	}
        function processButtonClick(){
             var sheetObject=sheetObjects[0];
             var sheetObject1=sheetObjects[1];
             var sheetObject2=sheetObjects[2];
             /*******************************************************/
             var formObject=document.form;
        	 try {
        		var srcName=ComGetEvent("name");
        		if(ComGetBtnDisable(srcName)) return false;
    			switch(srcName) {
    				case "btng_retrieve":
    					retrieve();
    					break;
    				case "btng_new":
    					sheetObject.RemoveAll();
    					formObject.reset();
    					try	{
    			    		var formObj=document.form;
    			    		var sheetObj=sheetObjects[0];
    			    		doActionIBSheet(sheetObj, formObj , IBSEARCH_ASYNC02);
    			    		setPeriodFromTo();
    			    		// document.form.fm_eff_dt.focus();
    					} catch(e){}
    						// document.form.fm_eff_dt.focus();
    					break;
    				case "btng_editapprovalstep":
    					ComShowCodeMessage( "COM12111");
    					break;
    				case "btng_csrformat":
    					if (sheetObjects[0].RowCount()<= 0){
    						showErrMessage(getMsg('CSR25006'));
    						return false;
    					}
    					if (sheetObjects[0].GetSelectRow()==undefined || sheetObjects[0].GetSelectRow()==null || sheetObjects[0].GetSelectRow()==0){
    						showErrMessage(getMsg('CSR21908'));
    						return false;
    					}
    					if (sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'csr_no')==undefined ||
    							sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'csr_no')==null ||
    							sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'csr_no').trim()==''){
    						showErrMessage(getMsg('CSR40048')); 
    						return false;
    					}
    					sheetObject1.RemoveAll();
    					sheetObject2.RemoveAll();
    					doActionIBSheet1(sheetObject2,formObject,IBSEARCH);
    					break;
    				case "btng_invoicelistinquiry":
    					if (sheetObjects[0].RowCount()<= 0){
    						showErrMessage(getMsg('CSR25006'));
    						return false;
    					}
    					if (sheetObjects[0].GetSelectRow()==undefined || sheetObjects[0].GetSelectRow()==null || sheetObjects[0].GetSelectRow()==0){
    						showErrMessage(getMsg('CSR21908'));
    						return false;
    					}
    					if (sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'csr_no')==undefined ||
    							sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'csr_no')==null ||
    							sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'csr_no').trim()==''){
    						showErrMessage(getMsg('CSR40048')); 
    						return false;
    					}
    					var csrNo=sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'csr_no');
    					var costOfcCd=sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'cost_ofc_cd');
    					var currCd=sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'csr_curr_cd');
    					var invSubSysCd=document.form.inv_sub_sys_cd.value;

    					var _url = "/opuscntr/COM_CSR_0011.do?csr_no="+csrNo+"&cost_ofc_cd="+costOfcCd+"&inv_sub_sys_cd="+invSubSysCd+"&curr_cd="+currCd;
    					ComOpenPopup(_url, 820, 500, '', "1,0,1,1,1,1,1,1,1,1,1,1", true);
    					
    					break;
    				case "btng_csrcancel":
    					// Checking whether the ofc_cd of session and the inputted in the field are same or not  
    					if (ofc_cd==undefined || ofc_cd==null || ofc_cd.trim()==''){
    						showErrMessage('No Inv OFC data is found in the session');
    						return false;
    					}
    					if (formObject.ofc_cd.value==undefined || formObject.ofc_cd.value==null || formObject.ofc_cd.value.trim()==''){
    						showErrMessage('No Invoice Office data');
    						return false;
    					}
    					if (ofc_cd != formObject.ofc_cd.value){
    						showErrMessage("No authority to cancel CSR - Invoice office mismatch!");
    						return false;
    					}
    					if (sheetObjects[0].RowCount()<= 0){
    						showErrMessage(getMsg('CSR25006'));
    						return false;
    					}
    					if (sheetObjects[0].GetSelectRow()==undefined || sheetObjects[0].GetSelectRow()==null || sheetObjects[0].GetSelectRow()==0){
    						showErrMessage(getMsg('CSR21908'));
    						return false;
    					}
    					if (sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'csr_no')==undefined ||
    							sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'csr_no')==null ||
    							sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'csr_no').trim()==''){
    						showErrMessage(getMsg('CSR40048'));
    						return false;
    					}
    					var ifStatus=sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'if_status');
    					if (sheetObjects[0].RowCount()> 0 && ifStatus=='Approval Requested') {
    						doActionIBSheet(sheetObjects[0],formObject,IBSEARCH_ASYNC01);
    					} else { 
    						if (ifStatus=='I/F Error') {
    							doActionIBSheet(sheetObjects[0],formObject,IBSAVE);
    						} else if (ifStatus=='A/P Rejected' || ifStatus=='Disapproved') {
    							var ifStatusVar=(ifStatus =='Disapproved' ? "R" : "J");
    							var param='?';
    							param=param + 'csr_no='+sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'csr_no');
    							param=param + '&vndr_no='+sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'vndr_no');
    							param=param + '&inv_desc='+encodeURI(sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'inv_desc'));
    							param=param + '&no_of_inv='+sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'no_of_inv');
    							param=param + '&csr_curr_cd='+sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'csr_curr_cd');
    							param=param + '&csr_amt='+sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'csr_amt');
    							param=param + '&attr_ctnt2='+sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'attr_ctnt2');
    							param=param + '&iss_dt='+sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'iss_dt');
    							param=param + '&rcv_dt='+sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'rcv_dt');
    							param=param + '&vndr_term_nm='+sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'vndr_term_nm');
    							param=param + '&due_dt='+sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'due_dt');
    							param=param + '&if_status='+ifStatusVar;
    							ComOpenWindow("/opuscntr/COM_CSR_0014.do"+param,  window,  "dialogWidth:940px;dialogHeight:510px;help:no;status:no;resizable:yes;scroll:no" , true);
    						}
    					}
    					if (ifStatus=='Canceled'||ifStatus=='I/F Success'||ifStatus=='Paid'||ifStatus=='Sending') { 
    						//showErrMessage(getMsg('CSR23028'));
    						return false;
    					}
    					break;
    				case "btng_viewapprovalstep":
    					if (sheetObjects[0].RowCount()<= 0){
    						showErrMessage(getMsg('CSR25006'));
    						return false;
    					}
    					if (sheetObjects[0].GetSelectRow()==undefined || sheetObjects[0].GetSelectRow()==null || sheetObjects[0].GetSelectRow()==0){
    						showErrMessage(getMsg('CSR21908')); 
    						return false;
    					}
//    					if (sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'csr_no')==undefined ||
//    							sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'csr_no')==null ||
//    							sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'csr_no').trim()==''){
//    						showErrMessage(getMsg('CSR40048')); 
//    						return false;
//    					}
    					var apro_rqst_no=sheetObject.GetCellValue(sheetObjects[0].GetSelectRow(), "apro_rqst_no");
    					if (apro_rqst_no==undefined || apro_rqst_no==null || apro_rqst_no.trim()==''){
    						ComShowMessage(getMsg('CSR40041','Approval Request No'));  
    						return false;
    					}
						var param="?apro_rqst_no="+apro_rqst_no;
	 					ComOpenPopup('/opuscntr/COM_ENS_0W1.do' + param, 700, 340, '', 'none', true);
    					break;
    				case "btng_print":
    					if(sheetObjects[0].RowCount() < 1){//no data
    						ComShowCodeMessage("COM132501");
		        	    }else{
		        	    	sheetObjects[0].Down2Excel({ HiddenColumn: 1});
		        	    }
    					break;
    	 			case "btns_Calendar2" :		// Agreement Date (To Date)
    	 				var cal=new ComCalendarFromTo();
    	 				cal.select(formObject.fm_eff_dt,  formObject.to_eff_dt,  'yyyy-MM-dd');
     	    		break;   
                } // end switch
        	}catch(e) {
        		if( e == "[object Error]") {
        			showErrMessage(getMsg('CSR23028')); //ComShowMessage(OBJECT_ERROR);
        		} else {
        			ComShowMessage(e.message);
        		}
        	}
        }
        
        /**
         * Registering IBSheet Object as list
         * Adding process for list in case of needing batch processing with other items
         * Defining list on the top of source
         */
        function setSheetObject(sheet_obj) {
        	sheetObjects[sheetCnt++]=sheet_obj;
        }
        
        function loadPage() {
            for(i=0;i<sheetObjects.length;i++){
                ComConfigSheet(sheetObjects[i]);
                initSheet(sheetObjects[i],i+1);
                ComEndConfigSheet(sheetObjects[i]);
            }
            formObj=document.form;
            axon_event.addListenerFormat('keypress', 'obj_keypress', formObj);
            axon_event.addListenerForm  ('beforedeactivate', 'obj_deactivate', formObj);
            axon_event.addListenerFormat('beforeactivate',	 'obj_activate',	formObj);
    		// csr_setBackColorAllTextTypeReadonly(document.form);
    		var formObj=document.form;
    		var sheetObj=sheetObjects[0];
    		doActionIBSheet(sheetObj, formObj , IBSEARCH_ASYNC02);
    		setPeriodFromTo();
    		// document.form.fm_eff_dt.focus();
    		retrieve();
    	}
        
    	function setPeriodFromTo(){
    		var formObj=document.form;
    		var to_dt=new String(formObj.DB_DATE.value).substring(0,8);
    		var fr_dt;
    		if (to_dt!=undefined && to_dt!=null && to_dt.trim()!='' && to_dt.length==8 && !isNaN(to_dt)){
    			//fr_dt = csr_getDiffDate(to_dt, -30, 'D');
    			fr_dt=csr_getDiffDate(to_dt, -1, 'M') + to_dt.substring(6,8);
    			if (fr_dt!=undefined && fr_dt!=null && fr_dt.trim()!='' && fr_dt.length==8){
    				if (fr_dt.substring(6,8) > getEndDay(fr_dt.substring(0,4),fr_dt.substring(4,6))){
    					fr_dt=fr_dt.substring(0,6) + getEndDay(fr_dt.substring(0,4),fr_dt.substring(4,6));
    				}
    				formObj.fm_eff_dt.value=fr_dt.substring(0,4)+'-'+fr_dt.substring(4,6)+'-'+fr_dt.substring(6,8);
    				formObj.to_eff_dt.value=to_dt.substring(0,4)+'-'+to_dt.substring(4,6)+'-'+to_dt.substring(6,8);
    			}
    		}
    		if (formObj.fm_eff_dt.value!=null && formObj.to_eff_dt.value!=null){
    			if (readonly_yn!=undefined && readonly_yn!=null && readonly_yn=='Y'){
    				retrieve();
    			}
    		}
    	}
    	
        function initSheet(sheetObj,sheetNo) {
        	var cnt=0;
            switch(sheetNo) {
            	case 1:      //sheet1 init
            		with(sheetObj){
                		var HeadTitle1="|CSR No.|Payment S/P|Payment S/P|I/F\nStatus|I/F Status\nUpdated Time|Error\nReason|CSR\nCreated Time|CSR Registered|CSR Registered|1st Approver|1st Approver|1st Approver|2nd Approver|2nd Approver|2nd Approver|No. of\n Invoice|Currency|Total\nAmount|Payment\nDue Date|Payment\nGroup|ASA No." ;
                		var HeadTitle2="|CSR No.|Payment S/P|Payment S/P|I/F\nStatus|I/F Status\nUpdated Time|Error\nReason|CSR\nCreated Time|ID|Name|ID|Name|APP.STS|ID|Name|APP.STS|No. of\n Invoice|Currency|Total\nAmount|Payment\nDue Date|Payment\nGroup|ASA No." ;
                		sheetObj.FrozenCols=2;

                		SetConfig( { SearchMode:2, FrozenCol:2, MergeSheet:5, Page:20, DataRowMerge:1 } );

                		var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                		var headers = [ { Text:HeadTitle1, Align:"Center"}, { Text:HeadTitle2, Align:"Center"} ];
                		InitHeaders(headers, info);

                		var cols = [ {Type:"Status",    Hidden:1,  Width:20,   Align:"Center",  ColMerge:0,   SaveName:"ibflag",               KeyField:0,   CalcLogic:"" },
                		             {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:"csr_no",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                		             {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"vndr_no",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:150,  Align:"Left",    ColMerge:0,   SaveName:"inv_desc",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:180,  Align:"Left",    ColMerge:0,   SaveName:"if_status",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Date",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"if_dt",                KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:130,  Align:"Left",    ColMerge:0,   SaveName:"if_err_rsn",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"csr_cre_dt",           KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				                     {Type:"Text",      Hidden:0,  Width:70,   Align:"Left",    ColMerge:0,   SaveName:"rqst_usr_id",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				                     {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",    ColMerge:0,   SaveName:"rqst_usr_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				                     {Type:"Text",      Hidden:0,  Width:70,   Align:"Left",    ColMerge:0,   SaveName:"first_apro_usr_id",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				                     {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",    ColMerge:0,   SaveName:"first_apro_usr_nm",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
									 {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"first_apro_sts",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				                     {Type:"Text",      Hidden:0,  Width:70,   Align:"Left",    ColMerge:0,   SaveName:"second_apro_usr_id",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				                     {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",    ColMerge:0,   SaveName:"second_apro_usr_nm",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
									 {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"second_apro_sts",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				                     {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"no_of_inv",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"csr_curr_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"csr_amt",              KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Date",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"due_dt",               KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:60,   Align:"Left",    ColMerge:0,   SaveName:"pay_grp_lu_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:1,  Width:0,    Align:"Left",    ColMerge:0,   SaveName:"attr_ctnt2",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:1,  Width:0,    Align:"Left",    ColMerge:0,   SaveName:"iss_dt",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:1,  Width:0,    Align:"Left",    ColMerge:0,   SaveName:"rcv_dt",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:1,  Width:0,    Align:"Left",    ColMerge:0,   SaveName:"vndr_term_nm",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:1,  Width:0,    Align:"Left",    ColMerge:0,   SaveName:"aft_act_flg",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:1,  Width:0,    Align:"Left",    ColMerge:0,   SaveName:"if_flg",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:1,  Width:0,    Align:"Left",    ColMerge:0,   SaveName:"rcv_err_flg",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:1,  Width:0,    Align:"Left",    ColMerge:0,   SaveName:"tml_inv_sts_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:1,  Width:0,    Align:"Left",    ColMerge:0,   SaveName:"tml_inv_rjct_sts_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:1,  Width:0,    Align:"Left",    ColMerge:0,   SaveName:"apro_rqst_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:1,  Width:0,    Align:"Left",    ColMerge:0,   SaveName:"cost_ofc_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
                    
                		InitColumns(cols);

                		SetEditable(1);
                		//SetSheetHeight(550);
                		resizeSheet(sheetObj);
            		}
            		break;
                case 2:      //sheet2 init
                    with(sheetObj){
                		var HeadTitle="csr no|office|prpd by|pay to|csr type|desc|pay group|evi tp|due date|asa no|inv dt|currcd|amt|pay_curr_cd|pay_amt|apro_step|title|chk_addr1|chk_addr2|chk_addr3|chk_cty_nm|chk_ste_cd|chk_zip_cd|chk_cnt_cd" ;

                		SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:1, DataRowMerge:1 } );

                		var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                		var headers = [ { Text:HeadTitle, Align:"Center"} ];
                		InitHeaders(headers, info);

                		var cols = [ {Type:"Text",      Hidden:0,  Width:70,   Align:"Left",    ColMerge:0,   SaveName:"pre_csr_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                		             {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"pre_office",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"pre_prpd_dy",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"pre_pay_to",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"pre_csr_type",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"pre_desc",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"pre_pay_group",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"pre_evi_tp",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"pre_due_date",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"pre_asa_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"pre_inv_dt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"pre_curr_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"pre_amt",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"pre_pay_curr_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"pre_pay_amt",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"apro_step",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"pre_title",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"chk_addr1",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"chk_addr2",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"chk_addr3",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"chk_cty_nm",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"chk_ste_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"chk_zip_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                         {Type:"Text",      Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"chk_cnt_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
                   
                		InitColumns(cols);

                		SetEditable(1);
                	}
                    break;
                case 3:      //sheet3 init
                    with(sheetObj){
                		var HeadTitle="char of account|account name|gl date|city|inv no|desc|debit|credit|debit2|credit2" ;

                		SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:1, DataRowMerge:1 } );

                		var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                		var headers = [ { Text:HeadTitle, Align:"Center"} ];
                		InitHeaders(headers, info);

                		var cols = [ {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"pre_chart_of_account",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                		             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"pre_account_name",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                		             {Type:"Text",      Hidden:0,  Width:80,   Align:"Left",    ColMerge:0,   SaveName:"pre_gl_date",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                		             {Type:"Text",      Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"pre_city",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                		             {Type:"Text",      Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"pre_inv_no",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                		             {Type:"Text",      Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"pre_desc",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                		             {Type:"Text",      Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"pre_debit",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                		             {Type:"Text",      Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"pre_credit",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                		             {Type:"Text",      Hidden:1, Width:0,    Align:"Right",   ColMerge:0,   SaveName:"pre_debit2",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                		             {Type:"Text",      Hidden:1, Width:0,    Align:"Right",   ColMerge:0,   SaveName:"pre_credit2",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
                		InitColumns(cols);
                		SetEditable(1);
                	}
                    break;
            }
        }
        
        // Handling the process about the sheet
        function doActionIBSheet(sheetObj,formObj,sAction) {
            sheetObj.ShowDebugMsg(false);
            switch(sAction) {
               case IBSEARCH:      //retrieving
                    if (!validateForm(sheetObj,formObj,sAction)){
    			        return false;
    			    }
	    			formObj.f_cmd.value=SEARCHLIST;
	    			sheetObj.DoSearch("COM_CSR_0008GS.do", FormQueryString(formObj) );
    			    break;
               case IBSAVE:        //saving
    				if (!validateForm(sheetObj,formObj,sAction)){
    			        return false;
    			    }
    				formObj.f_cmd.value=MULTI;
    				formObj.csr_no.value=sheetObj.GetCellValue(sheetObj.GetSelectRow(),'csr_no');
    				var sXml=sheetObj.GetSaveData("COM_CSR_00081GS.do", FormQueryString(formObj));
    				sheetObj.LoadSaveData(sXml,true);
                    break;
               case IBSEARCH_ASYNC01:        //saving
    				if (!validateForm(sheetObj,formObj,sAction)){
    			        return false;
    			    }
    				formObj.f_cmd.value=SEARCH01;
    				formObj.csr_no.value=sheetObj.GetCellValue(sheetObj.GetSelectRow(),'csr_no');
					var sXml=sheetObj.GetSaveData("COM_CSR_00081GS.do", FormQueryString(formObj));
        			retrieve();
                    break;
	       		case IBSEARCH_ASYNC02:	
	    			var sXml=csr_getInputValue(sheetObj,formObj.ofc_cd.value);
    				ComSetObjValue(formObj.DB_DATE, ComGetEtcData(sXml, "curr_date"));
	    		break;
    		}
        }
        
        function doActionIBSheet1(sheetObj,formObj,sAction) {
            sheetObj.ShowDebugMsg(false);
            switch(sAction) {
               case IBSEARCH:      
	   			formObj.f_cmd.value=SEARCH02;
	   			formObj.csr_no.value=sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'csr_no'); //Checking whether CSR_NO is already existed or not
	   			var sXml=sheetObjects[2].GetSearchData("COM_CSR_00081GS.do", FormQueryString(formObj),"",true);
	   			var arrXml=sXml.split("|$$|");
	   			sheetObjects[1].LoadSearchData(arrXml[0],{Sync:1} );
	   			sheetObjects[2].LoadSearchData(arrXml[1],{Sync:1} );
	           break;
            }
        }
        
    	function sheet1_OnSearchEnd(sheet1, ErrMsg){
    		with(sheet1) {
	    		if (RowCount()> 0){
	    			for (var i=HeaderRows(); i<RowCount()+HeaderRows(); i++){
	    				if (GetCellValue(i,'aft_act_flg')!=null && (GetCellValue(i,'aft_act_flg')=='N' || GetCellValue(i,'aft_act_flg')=='X')){
	    					SetRowBackColor(i,"#FF9999");
	    				}
	    			}
	    		}
    		}
    	}
    	
    	function sheet1_OnSaveEnd(sheet1, ErrMsg){
    		with(sheet1) {
	    		if (RowCount()> 0){
	    			for (var i=HeaderRows(); i<RowCount()+HeaderRows(); i++){
	    				if (GetCellValue(i,'aft_act_flg')!=null && (GetCellValue(i,'aft_act_flg')=='N' || GetCellValue(i,'aft_act_flg')=='X')){
	    					SetRowBackColor(i,"#FF9999");
	    				}
	    			}
	    		}
    		}
    	}
    	
        function sheet3_OnSearchEnd(sheetObj,errMsg){
         	var srcName=ComGetEvent("name");
            if(errMsg!=null){
                showErrMessage(errMsg);
            }
            var previewFlg="";
			var pre_csr_no=sheetObjects[1].GetCellValue(1,"pre_csr_no") 	 ;
			var pre_prpd_dy=sheetObjects[1].GetCellValue(1,"pre_prpd_dy")  ;
			var pre_pay_to=sheetObjects[1].GetCellValue(1,"pre_pay_to") 	 ;
			var pre_csr_type=sheetObjects[1].GetCellValue(1,"pre_csr_type") ;
			var pre_desc=sheetObjects[1].GetCellValue(1,"pre_desc") 		 ;
			var pre_pay_group=sheetObjects[1].GetCellValue(1,"pre_pay_group");
			var pre_evi_tp=sheetObjects[1].GetCellValue(1,"pre_evi_tp") 	 ;
			var pre_due_date=sheetObjects[1].GetCellValue(1,"pre_due_date") ;
			var pre_asa_no=sheetObjects[1].GetCellValue(1,"pre_asa_no") 	 ;
			var pre_inv_dt=sheetObjects[1].GetCellValue(1,"pre_inv_dt") 	 ;
			var pre_curr_cd=sheetObjects[1].GetCellValue(1,"pre_curr_cd")  ;
			var pre_amt=sheetObjects[1].GetCellValue(1,"pre_amt") 		 ;
			var pre_pay_curr_cd=sheetObjects[1].GetCellValue(1,"pre_pay_curr_cd")  ;
			var pre_pay_amt=sheetObjects[1].GetCellValue(1,"pre_pay_amt") 		 ;
			var pre_title=sheetObjects[1].GetCellValue(1,"pre_title") 	 ;
			var apro_step=sheetObjects[1].GetCellValue(1,"apro_step") 	 ;
			var chk_addr1=sheetObjects[1].GetCellValue(1,"chk_addr1") 	 ;
			var chk_addr2=sheetObjects[1].GetCellValue(1,"chk_addr2") 	 ;
			var chk_addr3=sheetObjects[1].GetCellValue(1,"chk_addr3") 	 ;
			var chk_cty_nm=sheetObjects[1].GetCellValue(1,"chk_cty_nm") 	 ;
			var chk_ste_cd=sheetObjects[1].GetCellValue(1,"chk_ste_cd") 	 ;
			var chk_zip_cd=sheetObjects[1].GetCellValue(1,"chk_zip_cd") 	 ;
			var chk_cnt_cd=sheetObjects[1].GetCellValue(1,"chk_cnt_cd") 	 ;
			var ofc_cd=sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'cost_ofc_cd');
    		var pre_evi_tp_count="";
    		var pre_title="CONSULTATION SLIP";
    		var pre_evi_tp;
    		//2014.11.12 Delete KR, KRW hard-coding logic, TAX logic change by IY Cho
			var sRow=sheetObjects[0].FindCheckedRow(1);
			var arrRow=sRow.split("|");
			pre_evi_tp_count=arrRow.length-1;
			pre_evi_tp_count=sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),'no_of_inv');
			pre_evi_tp=pre_evi_tp+"/"+pre_evi_tp_count;

    			if(pre_curr_cd=="KRW" || pre_curr_cd=="JPY" || pre_curr_cd=="TWD"){
             	previewFlg="krjp";
             	pre_amt=csr_chkAmtFmt(pre_amt,pre_curr_cd);
             	pre_pay_amt=csr_chkAmtFmt(pre_pay_amt,pre_curr_cd);
            }else{
            	pre_amt=csr_chkAmtFmt(pre_amt);
            	pre_pay_amt=csr_chkAmtFmt(pre_pay_amt);
            }
            sheetObjects[1].RemoveAll();
    		sheetObjects[1].DataInsert(-1);
            sheetObjects[1].SetCellValue(1,"pre_csr_no",pre_csr_no   );
            sheetObjects[1].SetCellValue(1,"pre_prpd_dy",pre_prpd_dy  );
            sheetObjects[1].SetCellValue(1,"pre_pay_to",pre_pay_to   );
            sheetObjects[1].SetCellValue(1,"pre_csr_type",pre_csr_type );
            sheetObjects[1].SetCellValue(1,"pre_desc",pre_desc     );
            sheetObjects[1].SetCellValue(1,"pre_pay_group",pre_pay_group);
            sheetObjects[1].SetCellValue(1,"pre_evi_tp",pre_evi_tp   );
            sheetObjects[1].SetCellValue(1,"pre_due_date",pre_due_date );
            sheetObjects[1].SetCellValue(1,"pre_asa_no",pre_asa_no   );
            sheetObjects[1].SetCellValue(1,"pre_inv_dt",pre_inv_dt   );
            sheetObjects[1].SetCellValue(1,"pre_curr_cd",pre_curr_cd  );
            sheetObjects[1].SetCellValue(1,"pre_amt",ComReplaceStr(pre_amt,",",""));
            sheetObjects[1].SetCellValue(1,"pre_pay_curr_cd",pre_pay_curr_cd  );
            sheetObjects[1].SetCellValue(1,"pre_pay_amt",ComReplaceStr(pre_pay_amt,",",""));
            sheetObjects[1].SetCellValue(1,"pre_title",pre_title    );
            sheetObjects[1].SetCellValue(1,"apro_step",apro_step    );
            sheetObjects[1].SetCellValue(1,"pre_office",ofc_cd);
            sheetObjects[1].SetCellValue(1,"chk_addr1",chk_addr1    );
            sheetObjects[1].SetCellValue(1,"chk_addr2",chk_addr2    );
            sheetObjects[1].SetCellValue(1,"chk_addr3",chk_addr3    );
            sheetObjects[1].SetCellValue(1,"chk_cty_nm",chk_cty_nm   );
            sheetObjects[1].SetCellValue(1,"chk_ste_cd",chk_ste_cd   );
            sheetObjects[1].SetCellValue(1,"chk_zip_cd",chk_zip_cd   );
            sheetObjects[1].SetCellValue(1,"chk_cnt_cd",chk_cnt_cd   );
            
			ComOpenPopup("/opuscntr/COM_CSR_0006.do?previewFlg="+previewFlg+"&previewFlgYN=N", 775, 680, '', "1,0,1,1,1,1,1,1");
        }
        
       /**
         * Handling the process for the input validation
         */
        function validateForm(sheetObj,formObj,sAction){
            with(formObj){
            }
            return true;
        }
        
      	/** 
         * Handling the occuring onkeypress event
         */ 
        function obj_keypress(){
        	obj=event.srcElement;
       	 	if(obj.dataformat == null) return;
       	 	window.defaultStatus=obj.dataformat;
       	 	switch(obj.dataformat) {
	       	 	case "ymd":
	       	 		ComKeyOnlyNumber(obj);
	       	        break;
	       	    case "eng":
	       	    	if(obj.name=="sts_evnt_yd_cd") ComKeyOnlyAlphabet('uppernum')
	       	        else ComKeyOnlyAlphabet('upper');
	       	        break;
	       	    case "engup":
	       	        if(obj.name=="eq_no") ComKeyOnlyAlphabet('uppernum')
	       	        else ComKeyOnlyAlphabet('upper');
	       	        break;
       	 	}
        }
        
        /** 
         * Handling the occuring deactivating event
         */
        function obj_deactivate(){
        	var formObj=document.form;
       	 	obj=event.srcElement;
       	 	if(obj.name=="fm_eff_dt"  ){
       	 		with(formObj){
       	 			var creDtFr=ComReplaceStr(fm_eff_dt.value,"-","");
       	 		}
       	 		ComChkObjValid(event.srcElement);
       	 	}
       	 	if(obj.name=="to_eff_dt"  ){
       	 		with(formObj){
       	 			var creDtFr=ComReplaceStr(to_eff_dt.value,"-","");
       	 		}
       	 		ComChkObjValid(event.srcElement);
       	 	}
        }
        
        function obj_activate(){
        	ComClearSeparator(event.srcElement);
        }

        function resizeSheet(sheetObj){
            ComResizeSheet(sheetObj);
        }
        