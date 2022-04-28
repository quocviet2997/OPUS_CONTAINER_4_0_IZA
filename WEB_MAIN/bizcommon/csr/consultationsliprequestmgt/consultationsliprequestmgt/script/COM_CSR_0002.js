/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_CSR_0002.js
*@FileTitle  : CSR Creation(Detail) 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/

    // The common global variables
    var tabObjects=new Array();
    var beforetab=1;
    var queryStr="";
	var sheetCnt=0;
	var Mincount=0;
	var comboCnt=0;
    var sheetObjects=new Array();
    var comboObjects=new Array();
	var approvalFlg="";
	var asaNoCurrCodeArr="";
	var asaNoCurrCode="";
	var edi_inv_yn=false;
    //Not to occur the change event to IBCombo when clicking New button.
    var gNew=false;
    var gCurRow=0;
    // Event handler processing by button click event
    document.onclick=processButtonClick;
	var time_out=false;
	
	function chkTimeOut(){
	   time_out=false;
	}
	
    function setAttenCC(){
    	 var formObj=document.form;
	   	//formObj.atten.value = at1;
    }
    
    // Event handler processing by button name */
    function processButtonClick() {
    	var sheetObject=sheetObjects[0];
        var sheetObject1=sheetObjects[1];
        var sheetObject2=sheetObjects[2];
    	var formObject=document.form;
    	try {
    		var cal=new ComCalendar();
    		var srcName=ComGetEvent("name");
    		switch (srcName) {
            case "apro_route_btn":
            	ComShowCodeMessage( "COM12111");
                break;
    		case "btn_retrieve":
    			doActionIBSheet(sheetObject1, formObject, IBSEARCH);
    			break;
    		case "btn_main":
    			var inv_sub_sys_cd=document.form.inv_sub_sys_cd.value;
    			var pgm_no=document.form.pgm_no.value;
    			var parent_pgm_no=document.form.parent_pgm_no.value;
    			var detailUrl="";
    			if(inv_sub_sys_cd == 'TLL') inv_sub_sys_cd='MNR';
    			detailUrl = "COM_CSR_0001.do?INV_SUB_SYS_CD="+inv_sub_sys_cd+"&pgmNo="+pgm_no+"&parentPgmNo="+parent_pgm_no;
    			location.href=detailUrl;
    			break;
//    		case "btn_save":
//    			doActionIBSheet(sheetObject1, formObject, IBSAVE);
//    			break;
    		case "btn_downExcel":
//parameter changed[check again]CLT
    			if(sheetObject1.RowCount() < 1){//no data
    				ComShowCodeMessage("COM132501");
    			}else{
    				sheetObject1.Down2Excel();
    			}
    			break;
			case "btn_evidence":
				//Running it in case of clicking the button when the the ASA number is selected if ASA number passed from mode
				if (formObject.asanogb.value!=undefined && formObject.asanogb.value!=null && formObject.asanogb.value=="ASA"){
					if (comboObjects[0].GetSelectCode()==undefined || comboObjects[0].GetSelectCode()==null || comboObjects[0].GetSelectCode()==''){
						ComShowCodeMessage( "COM12113", " ASA No."  );
						return false;
					}
				}
				if(sheetObject.FindCheckedRow(1) == "" || sheetObject.FindCheckedRow(1) == null || sheetObject.FindCheckedRow(1) == undefined){
					ComShowCodeMessage( "COM12114", " row"  );
					return false;
				}
				//Setting the param module
				var inv_sub_sys_cd=formObject.inv_sub_sys_cd.value;
				var leftpos=(screen.width - 1040)/2;    if(leftpos<0) leftpos=0;
			    var toppos=(screen.height- 700)/2;   if(toppos<0)  toppos=0;
				if(approvalFlg==""){
					if(formObject.evi_gb.value=="1"){	//Tax Invoice
						ComOpenWindow("/opuscntr/COM_CSR_0004.do?inv_sub_sys_cd="+inv_sub_sys_cd,  window,  "dialogWidth:790px; dialogHeight:540px; help:no; status:no; resizable:no; scroll:no" , true);
					}else if(formObject.evi_gb.value=="2"){	//Invoice
						ComOpenWindow("/opuscntr/COM_CSR_0005.do?inv_sub_sys_cd="+inv_sub_sys_cd,  window,  "dialogWidth:790px; dialogHeight:500px; help:no; status:no; resizable:no; scroll:no" , true);
					}else if(formObject.evi_gb.value=="3"){
						
					}else{
							showErrMessage(getMsg('CSR25002'));
					}
				}
				break;
			case "btn_preview":
				var ppay_cnt = 0;
				var ppd_no_cnt = 0;
				var ppd_no_tmp = '';
				var ppd_no_end = '';
				var ppay_stl_cnt = 0;
    			var inv_sub_sys_cd = document.form.inv_sub_sys_cd.value;
    			if (inv_sub_sys_cd == 'PSO') {
    		        var chkRow = sheetObject.FindCheckedRow(1);
    		        var arrRow = chkRow.split("|");
    		        for (idx=0; idx<arrRow.length; idx++) {
    		        	if (sheetObject.GetCellValue(arrRow[idx],"ppay_aply_flg") == 'Y') {
    		        		ppay_cnt++;	
    		        	}
    		        	
		        		if (sheetObject.GetCellValue(arrRow[idx],"ppd_no") != null && sheetObject.GetCellValue(arrRow[idx],"ppd_no") != '') {
		        			if (ppd_no_tmp == null || ppd_no_tmp == ''){
		        				ppd_no_tmp = sheetObject.GetCellValue(arrRow[idx],"ppd_no");
		        			}
		        			if (ppd_no_end == null || ppd_no_end == ''){
		        				ppd_no_end = sheetObject.GetCellValue(arrRow[idx],"ppd_no");	
		        			} else {
		        				if (ppd_no_end != sheetObject.GetCellValue(arrRow[idx],"ppd_no")){
		        					ppd_no_end = sheetObject.GetCellValue(arrRow[idx],"ppd_no");	
		        				}
		        			}
		        			ppd_no_cnt++;
		        			ppay_stl_cnt++;
		        		}
    		        }
    		        
    		        if (ppay_cnt > 0) {
    		        	if (ppay_cnt == arrRow.length){
    		        		if (ppay_cnt == 1){
    		        			document.form.csr_tp_cd.value = 'P';	
    		        		} else {
    		        			showErrMessage(getMsg('COM12190'));
    		        			return false;
    		        		}
    		        	} else {
    		        		showErrMessage(getMsg('COM12187'));
    		        		return false;
    		        	}
    		        } else {
    		        	if (ppd_no_cnt > 0){
    		        		if (ppd_no_cnt == arrRow.length){
        		        		if (!((ppd_no_tmp != null && ppd_no_tmp != '' && ppd_no_end != null && ppd_no_end != '' && ppd_no_tmp == ppd_no_end))){
        		        			showErrMessage(getMsg('COM12188'));
        		        			return false;
        		        		}
    		        		} else {
    		        			showErrMessage(getMsg('COM12189'));
    		        			return false;
    		        		}
    		        	}
    		        }
    		        
    		        // Settlement Prepayment CSR Check.
			        if (ppay_stl_cnt > 0) {
			        	if (ppay_stl_cnt == arrRow.length) {
			        		if (ppay_stl_cnt == 1) {
			        			document.form.csr_tp_cd.value = 'S';	
			        		} else {
			        			showErrMessage(getMsg('COM12190'));
			        			return false;
			        		}
			        	} 
			        	
			        	if (ppd_no_cnt != 1) {
		        			showErrMessage(getMsg('COM12190'));
		        			return false;
			        	}
			        }
    		        
    			}			
				//Running it in case of clicking the button when the the ASA number is selected if ASA number passed from mode
				if (formObject.asanogb.value!=undefined && formObject.asanogb.value!=null && formObject.asanogb.value=="ASA"){
					if (comboObjects[0].GetSelectCode()==undefined || comboObjects[0].GetSelectCode()==null || comboObjects[0].GetSelectCode()==''){
						showErrMessage(getMsg('CSR40025','ASA No.'));
						return false;
					}
				}
				if(approvalFlg==""){
					if(sheetObject.FindCheckedRow(1) == "" || sheetObject.FindCheckedRow(1) == null || sheetObject.FindCheckedRow(1) == undefined){
						showErrMessage(getMsg('CSR25001'));
						return false;
					}

					var csr_amt=0;
					for(var i=0;i<sheetObject.RowCount();i++){
						if(sheetObject.GetCellValue(i+1,1)==1){
							csr_amt=parseFloat(sheetObject.GetCellValue(i+1,"inv_ttl_amt")*100)+parseFloat(csr_amt);
							}
					}
					formObject.csr_amt.value=roundXL((csr_amt/100), 2);
					//Setting the date
					dateUnMask();
					sheetObject1.RemoveAll();
					sheetObject2.RemoveAll();
					doActionIBSheet1(sheetObject2,formObject,IBSEARCH);
				}
				break;
			case "btn_approvalrequest":
				/*
				 * Convert the local time of createApInvHDR and createApInvDTRB by the Invoice Office 
				 */
				if (time_out){
					return;
				}

				var ppay_cnt = 0;
				var ppd_no_cnt = 0;
				var ppd_no_tmp = '';
				var ppd_no_end = '';
				var ppay_stl_cnt = 0;
    			var inv_sub_sys_cd = document.form.inv_sub_sys_cd.value;
    			if (inv_sub_sys_cd == 'PSO') {
    		        var chkRow = sheetObject.FindCheckedRow(1);
    		        var arrRow = chkRow.split("|");
    		        for (idx=0; idx<arrRow.length; idx++){
    		        	if (sheetObject.GetCellValue(arrRow[idx],"ppay_aply_flg") == 'Y'){
    		        		ppay_cnt++;	
    		        	} 
		        		if (sheetObject.GetCellValue(arrRow[idx],"ppd_no") != null && sheetObject.GetCellValue(arrRow[idx],"ppd_no") != ''){
		        			if (ppd_no_tmp == null || ppd_no_tmp == ''){
		        				ppd_no_tmp = sheetObject.GetCellValue(arrRow[idx],"ppd_no");
		        			}
		        			if (ppd_no_end == null || ppd_no_end == ''){
		        				ppd_no_end = sheetObject.GetCellValue(arrRow[idx],"ppd_no");	
		        			} else {
		        				if (ppd_no_end != sheetObject.GetCellValue(arrRow[idx],"ppd_no")){
		        					ppd_no_end = sheetObject.GetCellValue(arrRow[idx],"ppd_no");	
		        				}
		        			}
		        			ppd_no_cnt++;
		        			ppay_stl_cnt++;
		        		}
    		        }
    		        if (ppay_cnt > 0){
    		        	if (ppay_cnt == arrRow.length){
    		        		if (ppay_cnt == 1){
    		        			document.form.csr_tp_cd.value = 'P';	
    		        		} else {
    		        			showErrMessage(getMsg('COM12190'));
    		        			return false;
    		        		}
    		        	} else {
    		        		showErrMessage(getMsg('COM12187'));
    		        		return false;
    		        	}
    		        } else {
    		        	if (ppd_no_cnt > 0){
    		        		if (ppd_no_cnt == arrRow.length){
        		        		if (!((ppd_no_tmp != null && ppd_no_tmp != '' && ppd_no_end != null && ppd_no_end != '' && ppd_no_tmp == ppd_no_end))){
        		        			showErrMessage(getMsg('COM12188'));
        		        			return false;
        		        		}
    		        		} else {
    		        			showErrMessage(getMsg('COM12189'));
    		        			return false;
    		        		}
    		        	}
    		        }
    		        
    		        // Settlement Prepayment CSR Check.
			        if (ppay_stl_cnt > 0) {
			        	if (ppay_stl_cnt == arrRow.length) {
			        		if (ppay_stl_cnt == 1) {
			        			document.form.csr_tp_cd.value = 'S';	
			        		} else {
			        			showErrMessage(getMsg('COM12190'));
			        			return false;
			        		}
			        	} 
			        	
			        	if (ppd_no_cnt != 1) {
		        			showErrMessage(getMsg('COM12190'));
		        			return false;
			        	}
			        }
    		        
    			}
				//Running it in case of clicking the button when the the ASA number is selected if ASA number passed from mode
				if (formObject.asanogb.value!=undefined && formObject.asanogb.value!=null && formObject.asanogb.value=="ASA"){
					if (comboObjects[0].GetSelectCode()==undefined || comboObjects[0].GetSelectCode()==null || comboObjects[0].GetSelectCode()==''){
						showErrMessage(getMsg('CSR22018','ASA No.'));
						return false;
					}
					if(formObject.curr_cd.value != comboObjects[0].GetSelectCode().substring(11,14)){
						showErrMessage(getMsg('CSR25032'));
					}
				}
				if(approvalFlg==""){

					if(sheetObject.FindCheckedRow(1) == "" || sheetObject.FindCheckedRow(1) == null || sheetObject.FindCheckedRow(1) == undefined){
							showErrMessage(getMsg('CSR25001'));
							return false;
					}

					var csr_amt=0;
					for(var i=0;i<sheetObject.RowCount();i++){
						if(sheetObject.GetCellValue(i+1,1)==1){
							csr_amt=parseFloat(sheetObject.GetCellValue(i+1,"inv_ttl_amt")*100)+parseFloat(csr_amt);
							}
					}
					formObject.csr_amt.value=roundXL((csr_amt/100), 2);
					eviData();
					//Setting the date
					dateUnMask();
					doActionIBSheet1(sheetObject, formObject, IBSAVE);
					time_out=true;
					window.setTimeout('chkTimeOut()',3000);
				}
				break;
    		} // end switch
    	} catch (e) {
    		if (e == "[object Error]") {
    			ComShowCodeMessage('CSR90002');
    		} else {
    			ComShowMessage(e.message);
    		}
    		time_out=true;
    	}
    }
    
    function dateUnMask(){
    	var formObject=document.form;
        var iss_dt=ComGetUnMaskedValue( formObject.max_iss_dt.value, "ymdhms", "-");
        var rcv_dt=ComGetUnMaskedValue( formObject.max_rcv_dt.value, "ymdhms", "-");
        var payment_due_dt=ComGetUnMaskedValue( formObject.payment_due_dt.value, "ymdhms", "-");
        var evi_inv_dt=ComGetUnMaskedValue( formObject.evi_inv_dt.value, "ymdhms", "-");
        formObject.max_iss_dt.value=iss_dt;
        formObject.max_rcv_dt.value=rcv_dt;
        formObject.payment_due_dt.value=payment_due_dt;
        formObject.evi_inv_dt.value=evi_inv_dt;
    }
    
    /**
     * Registering IBSheet Object as list
     * Adding process for list in case of needing batch processing with other items
     * Defining list on the top of source
     */
    function setSheetObject(sheet_obj) {
    	sheetObjects[sheetCnt++]=sheet_obj;
    }
    
    /**
     * Registering IBCombo Object as list
     * param : combo_obj
     * Adding process for list in case of needing batch processing with other items
     * Defining list on the top of source
     */
    function setComboObject(combo_obj) {
        comboObjects[comboCnt++]=combo_obj;
    }
    
    /**
     * initializing sheet
     * implementing onLoad event handler in body tag
     * adding first-served functions after loading screen.
     */
     /**
      * initializing sheet
      * implementing onLoad event handler in body tag
      * adding first-served functions after loading screen.
      */
     function loadPage() {
     	for (i=0; i < sheetObjects.length; i++) {
     		ComConfigSheet(sheetObjects[i]);
     		initSheet(sheetObjects[i], i + 1);
     		ComEndConfigSheet(sheetObjects[i]);
     	}
     	//initializing the combobox
     	for(var k=0;k<comboObjects.length;k++){
     	    initCombo(comboObjects[k], k+1);
     	}
     	var formObj=document.form;
    	//the combobox of asa_no
    	doActionIBCombo(sheetObjects[0] , document.form ,IBSEARCH , comboObjects[0], SEARCHLIST01 ,"asa_no");
    	//Checking the cnt_cd
    	var asanogb=formObj.asanogb.value;
    	var currCd=formObj.curr_cd.value;
    	//2014.11.12 Delete KR, KRW hard-coding logic, TAX logic change by IY Cho
    	if(asanogb=="ASA"){
			document.all.item("srLayer")[0].style.display="inline";
			document.all.item("srLayer")[1].style.display="none";
			document.all.item("srLayer")[2].style.display="none";
			document.all.item("btLayer")[1].style.display="none";
			document.all.item("btLayer")[0].style.display="inline";
			document.all.item("btLayer")[2].style.display="none";
		}else if(asanogb=="A/P"){
			document.all.item("srLayer")[0].style.display="none";
			document.all.item("srLayer")[1].style.display="none";
			document.all.item("srLayer")[2].style.display="none";
			document.all.item("btLayer")[1].style.display="none";
			document.all.item("btLayer")[0].style.display="inline";
			document.all.item("btLayer")[2].style.display="none";
		}
		disableObject(formObj.cost_ofc_cd); 
		disableObject(formObj.vndr_seq);
		disableObject(formObj.vndr_seq_name);
		disableObject(formObj.cnt_inv);
		disableObject(formObj.curr_cd);         
		disableObject(formObj.total_amt);
		disableObject(formObj.max_iss_dt);
		disableObject(formObj.max_rcv_dt);
		disableObject(formObj.gen_pay_term_desc);
		disableObject(formObj.apro_step);	
		disableObject(formObj.csr_no);	
		var inv_sub_sys_cd=formObj.inv_sub_sys_cd.value;
		var gen_pay_term_cd=formObj.gen_pay_term_cd.value;
		//Being able to modify PAMENT DUE DT when the statement is 05(in case of the CSR('MNR', 'TLL', 'LSE', 'PSO', 'CHS', 'MGS', 'CNI') module) and O60.
		if(inv_sub_sys_cd=="MNR" || inv_sub_sys_cd=="TLL" || inv_sub_sys_cd=="LSE" || inv_sub_sys_cd=="PSO" || inv_sub_sys_cd=="CHS" || inv_sub_sys_cd=="MGS" || inv_sub_sys_cd=="CNI"){
			if (gen_pay_term_cd!=null && gen_pay_term_cd.trim()!='' && (gen_pay_term_cd.substring(0,1)=='O' || gen_pay_term_cd.substring(0,1)=='I')){
				if(gen_pay_term_cd.substring(0,3)!='O60'){
					disableObject(formObj.payment_due_dt);
				}
			}
		}
		initControl();
		//Retriving the list
	    doActionIBSheet(sheetObjects[0],formObj,IBSEARCH);
     }
     
     /**
      * Initializing the control
      **/
  	function initControl() {
  		var formObject=document.form;
    }
  	
    /**
	 * Setting ASA TO_DATE to Effect Date in case of changing ASA No.
	 */
	function asa_no_OnChange(){
		var formObj=document.form;
		var asaNoStr=comboObjects[0].GetSelectCode();
		formObj.asa_no_s.value=asaNoStr.substr(0,10);
	}
	
	/**
     * setting sheet initial values and header
     * param : sheetObj, sheetNo
     * adding case as numbers of counting sheets 
     */
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
        var pnt=0;
        var currCd=document.form.curr_cd.value;
        if(currCd == "KRW" || currCd == "JPY" ){
        	pnt=0;
        }else{
        	pnt=2;
        }
        switch(sheetNo) {
            case 1:      //sheet1 init
                with(sheetObj){
            		var HeadTitle="Seq.||Invoice No.|Prepayment\nInv No.|Prepaid\nCSR No.|Payment Term|Currency|Net Amount|Tax Amount|W.H.T|Total Amount|Issue Date|Receive Date|Confirm Date||||||||||" ;

            		SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:1, DataRowMerge:1 } );

            		var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
            		var headers = [ { Text:HeadTitle, Align:"Center"} ];
            		InitHeaders(headers, info);
            		var inv_sub_sys_cd = document.form.inv_sub_sys_cd.value;
            		
            		var cols = [ {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"",                   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false },
            		             {Type:"CheckBox",  Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"chk",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:false },
            		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Left",    ColMerge:0,   SaveName:"inv_no",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false }]
	    			if (inv_sub_sys_cd == 'PSO') {
	    				cols.push({Type:"Text",      Hidden:0, Width:70,    Align:"Center",   ColMerge:0,   SaveName:"ppay_aply_flg",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
	    				cols.push({Type:"Text",      Hidden:0, Width:120,   Align:"Left",     ColMerge:0,   SaveName:"ppd_no",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
	    			} else {
	    				cols.push({Type:"Text",      Hidden:1, Width:70,    Align:"Center",   ColMerge:0,   SaveName:"ppay_aply_flg",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
	    				cols.push({Type:"Text",      Hidden:1, Width:120,   Align:"Left",     ColMerge:0,   SaveName:"ppd_no",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });	    				
	    			}
            		cols.push({Type:"Text",      Hidden:0,  Width:90,   Align:"Center",   ColMerge:0,   SaveName:"vndr_term_nm",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
            		cols.push({Type:"Text",      Hidden:0,  Width:90,   Align:"Center",   ColMerge:0,   SaveName:"inv_curr_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });            		
            		if(pnt == 0){	//KRW, TWD, JPY
            			cols.push({Type:"Int",       Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:"inv_net_amt",        KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
			            cols.push({Type:"Int",       Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:"inv_vat_amt",        KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
			            cols.push({Type:"Int",       Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:"whld_tax_amt",       KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
			            cols.push({Type:"Int",       Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:"inv_ttl_amt",        KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
            		}else{	//USD
			            cols.push({Type:"Float",     Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:"inv_net_amt",        KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
			            cols.push({Type:"Float",     Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:"inv_vat_amt",        KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
			            cols.push({Type:"Float",     Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:"whld_tax_amt",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
			            cols.push({Type:"Float",     Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:"inv_ttl_amt",        KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
			        }
		            cols.push({Type:"Text",      Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"iss_dt",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
		            cols.push({Type:"Text",      Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"rcv_dt",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
		            cols.push({Type:"Text",      Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"inv_cfm_dt",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
	    			var inv_sub_sys_cd = document.form.inv_sub_sys_cd.value;
		            cols.push({Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"pso_trns_slp_ctnt",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
		            cols.push({Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"pay_due_dt",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
		            cols.push({Type:"Text",      Hidden:1, Width:40,   Align:"Right",   ColMerge:0,   SaveName:"ttl_lss_div_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
		            cols.push({Type:"Text",      Hidden:1, Width:200,  Align:"Left",    ColMerge:0,   SaveName:"inv_rgst_no",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
		            cols.push({Type:"Text",      Hidden:1, Width:1,    Align:"Right",   ColMerge:0,   SaveName:"inv_ofc_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
		            cols.push({Type:"Text",      Hidden:1, Width:1,    Align:"Right",   ColMerge:0,   SaveName:"vndr_seq",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
		            cols.push({Type:"Text",      Hidden:1, Width:1,    Align:"Right",   ColMerge:0,   SaveName:"asa_no",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
		            cols.push({Type:"Status",    Hidden:1, Width:1,    Align:"Right",   ColMerge:0,   SaveName:"ibflag",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
		            cols.push({Type:"Text",      Hidden:1, Width:1,    Align:"Right",   ColMerge:0,   SaveName:"edi_flg",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false });
		            
		            InitColumns(cols);

		            SetEditable(1);
		            SetSheetHeight(440);
            	}
                break;
           case 2:      //sheet1 init
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
            case 3:      //sheet1 init
            	with(sheetObj){
            		var HeadTitle="char of account|account name|gl date|city|inv no|desc|debit|credit|debit2|credit2" ;

        	   		SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:1, DataRowMerge:1 } );

        	   		var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
        	   		var headers = [ { Text:HeadTitle, Align:"Center"} ];
        	   		InitHeaders(headers, info);

        	   		var cols = [ {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"pre_chart_of_account",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
        	   		             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"pre_account_name",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
        	   		             {Type:"Text",      Hidden:0,  Width:80,   Align:"Left",    ColMerge:0,   SaveName:"pre_gl_date",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
        	   		             {Type:"Text",	      Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"pre_city",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
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
    function doActionIBSheet(sheetObj, formObj, sAction) {
    	sheetObj.ShowDebugMsg(false);
    	switch (sAction) {
    	case IBSEARCH: //Retrieving
    			formObj.f_cmd.value=SEARCH;
				var formParams="";
				formParams+="f_cmd="+ComGetObjValue(formObj.f_cmd);
				formParams+="&pagerows="+ComGetObjValue(formObj.pagerows);
				formParams+="&iPage="+ComGetObjValue(formObj.iPage);
				formParams+="&ofc_cd="+ComGetObjValue(formObj.ofc_cd);
				formParams+="&inv_sub_sys_cd="+ComGetObjValue(formObj.inv_sub_sys_cd);
				formParams+="&inv_ofc_cd="+ComGetObjValue(formObj.inv_ofc_cd);
				formParams+="&cnt_cd="+ComGetObjValue(formObj.cnt_cd);
				formParams+="&asanogb="+ComGetObjValue(formObj.asanogb);
				formParams+="&pay_group_cd="+ComGetObjValue(formObj.pay_group_cd);
				formParams+="&csr_amt="+ComGetObjValue(formObj.csr_amt);
				formParams+="&iss_dt="+ComGetObjValue(formObj.iss_dt);
				formParams+="&rcv_dt="+ComGetObjValue(formObj.rcv_dt);
				formParams+="&gen_pay_term_cd="+ComGetObjValue(formObj.gen_pay_term_cd);
				formParams+="&temp_payment_due_dt="+ComGetObjValue(formObj.temp_payment_due_dt);
				formParams+="&pay_term_tp_cd="+ComGetObjValue(formObj.pay_term_tp_cd);
				formParams+="&ap_ofc_cd="+ComGetObjValue(formObj.ap_ofc_cd);
				formParams+="&usr_eml="+ComGetObjValue(formObj.usr_eml);
				formParams+="&usr_nm="+ComGetObjValue(formObj.usr_nm);
				formParams+="&cre_usr_id="+ComGetObjValue(formObj.cre_usr_id);
				formParams+="&csr_tp_cd="+ComGetObjValue(formObj.csr_tp_cd);
				formParams+="&evi_gb="+ComGetObjValue(formObj.evi_gb);
				formParams+="&inv_knt="+ComGetObjValue(formObj.inv_knt);
				formParams+="&inv_cfm_dt="+ComGetObjValue(formObj.inv_cfm_dt);
				formParams+="&pso_trns_slp_ctnt="+ComGetObjValue(formObj.pso_trns_slp_ctnt);
				formParams+="&tax_naid_flg="+ComGetObjValue(formObj.tax_naid_flg);
				formParams+="&finance_flg="+ComGetObjValue(formObj.finance_flg);
				formParams+="&fa_flg="+ComGetObjValue(formObj.fa_flg);
				formParams+="&tax_type="+ComGetObjValue(formObj.tax_type);
				formParams+="&tax_nsl_flg="+ComGetObjValue(formObj.tax_nsl_flg);
				formParams+="&evi_inv_dt="+ComGetObjValue(formObj.evi_inv_dt);
				formParams+="&evi_comp_no="+ComGetObjValue(formObj.evi_comp_no);
				formParams+="&evi_total_net_amt="+ComGetObjValue(formObj.evi_total_net_amt);
				formParams+="&evi_tax_no2="+ComGetObjValue(formObj.evi_tax_no2);
				formParams+="&evi_total_tax_amt="+ComGetObjValue(formObj.evi_total_tax_amt);
				formParams+="&evi_ctnt1="+ComGetObjValue(formObj.evi_ctnt1);
				formParams+="&evi_ctnt2="+ComGetObjValue(formObj.evi_ctnt2);
				formParams+="&evi_ctnt3="+ComGetObjValue(formObj.evi_ctnt3);
				formParams+="&evi_ctnt4="+ComGetObjValue(formObj.evi_ctnt4);
				formParams+="&evi_ctnt5="+ComGetObjValue(formObj.evi_ctnt5);
				formParams+="&evi_ctnt6="+ComGetObjValue(formObj.evi_ctnt6);
				formParams+="&evi_ctnt7="+ComGetObjValue(formObj.evi_ctnt7);
				formParams+="&evi_ctnt8="+ComGetObjValue(formObj.evi_ctnt8);
				formParams+="&evi_ctnt9="+ComGetObjValue(formObj.evi_ctnt9);
				formParams+="&evi_ctnt10="+ComGetObjValue(formObj.evi_ctnt10);
				formParams+="&evi_ctnt11="+ComGetObjValue(formObj.evi_ctnt11);
				formParams+="&evi_ctnt12="+ComGetObjValue(formObj.evi_ctnt12);
				formParams+="&evi_tax_no="+ComGetObjValue(formObj.evi_tax_no);
				formParams+="&evi_tax_code="+ComGetObjValue(formObj.evi_tax_code);
				formParams+="&s_tax_naid_flg="+ComGetObjValue(formObj.s_tax_naid_flg);
				formParams+="&s_finance_flg="+ComGetObjValue(formObj.s_finance_flg);
				formParams+="&s_fa_flg="+ComGetObjValue(formObj.s_fa_flg);
				formParams+="&s_tax_type="+ComGetObjValue(formObj.s_tax_type);
				formParams+="&s_tax_nsl_flg="+ComGetObjValue(formObj.s_tax_nsl_flg);
				formParams+="&s_evi_inv_dt="+ComGetObjValue(formObj.s_evi_inv_dt);
				formParams+="&s_evi_comp_no="+ComGetObjValue(formObj.s_evi_comp_no);
				formParams+="&s_evi_total_net_amt="+ComGetObjValue(formObj.s_evi_total_net_amt);
				formParams+="&s_evi_tax_no2="+ComGetObjValue(formObj.s_evi_tax_no2);
				formParams+="&s_evi_total_tax_amt="+ComGetObjValue(formObj.s_evi_total_tax_amt);
				formParams+="&s_evi_ctnt1="+ComGetObjValue(formObj.s_evi_ctnt1);
				formParams+="&s_evi_ctnt2="+ComGetObjValue(formObj.s_evi_ctnt2);
				formParams+="&s_evi_ctnt3="+ComGetObjValue(formObj.s_evi_ctnt3);
				formParams+="&s_evi_ctnt4="+ComGetObjValue(formObj.s_evi_ctnt4);
				formParams+="&s_evi_ctnt5="+ComGetObjValue(formObj.s_evi_ctnt5);
				formParams+="&s_evi_ctnt6="+ComGetObjValue(formObj.s_evi_ctnt6);
				formParams+="&s_evi_ctnt7="+ComGetObjValue(formObj.s_evi_ctnt7);
				formParams+="&s_evi_ctnt8="+ComGetObjValue(formObj.s_evi_ctnt8);
				formParams+="&s_evi_ctnt9="+ComGetObjValue(formObj.s_evi_ctnt9);
				formParams+="&s_evi_ctnt10="+ComGetObjValue(formObj.s_evi_ctnt10);
				formParams+="&s_evi_ctnt11="+ComGetObjValue(formObj.s_evi_ctnt11);
				formParams+="&s_evi_ctnt12="+ComGetObjValue(formObj.s_evi_ctnt12);
				formParams+="&s_evi_tax_no="+ComGetObjValue(formObj.s_evi_tax_no);
				formParams+="&s_evi_tax_code="+ComGetObjValue(formObj.s_evi_tax_code);
				formParams+="&ttl_lss_div_cd="+ComGetObjValue(formObj.ttl_lss_div_cd);
				formParams+="&inv_rgst_no="+ComGetObjValue(formObj.inv_rgst_no);
				formParams+="&eviInputFlg="+ComGetObjValue(formObj.eviInputFlg);
				formParams+="&s_eviInputFlg="+ComGetObjValue(formObj.s_eviInputFlg);
				formParams+="&apopen="+ComGetObjValue(formObj.apopen);
				formParams+="&asa_no_s="+ComGetObjValue(formObj.asa_no_s);
				formParams+="&aproSeqKey="+ComGetObjValue(formObj.aproSeqKey);
				formParams+="&key="+ComGetObjValue(formObj.key);
				formParams+="&cost_ofc_cd="+ComGetObjValue(formObj.cost_ofc_cd);
				formParams+="&vndr_seq="+ComGetObjValue(formObj.vndr_seq);
				formParams+="&cnt_inv="+ComGetObjValue(formObj.cnt_inv);
				formParams+="&curr_cd="+ComGetObjValue(formObj.curr_cd);
				formParams+="&total_amt="+ComGetObjValue(formObj.total_amt);
				formParams+="&max_iss_dt="+ComGetObjValue(formObj.max_iss_dt);
				formParams+="&max_rcv_dt="+ComGetObjValue(formObj.max_rcv_dt);
				formParams+="&gen_pay_term_desc="+ComGetObjValue(formObj.gen_pay_term_desc);
				formParams+="&payment_due_dt="+ComGetObjValue(formObj.payment_due_dt);
				formParams+="&apro_step="+ComGetObjValue(formObj.apro_step);
				formParams+="&csr_no="+ComGetObjValue(formObj.csr_no);
				formParams+="&inv_curr_cd="+ComGetObjValue(formObj.curr_cd);
//parameter changed[check again]CLT
				var sXml=sheetObjects[2].GetSearchData("COM_CSR_0002GS.do", formParams);
    			var arrXml=sXml.split("|$$|");
    			sheetObj.LoadSearchData((sXml == arrXml)?sXml:arrXml,{Sync:1} );
    		break;
    	}
    }
    
    // Handling the process about the sheet
    function doActionIBSheet1(sheetObj, formObj, sAction) {
    	sheetObj.ShowDebugMsg(false);
    	switch (sAction) {
        case IBSEARCH:      //Retrieving
			formObj.f_cmd.value=SEARCH01;
			var formParams="";
			formParams+="f_cmd="+ComGetObjValue(formObj.f_cmd);
			formParams+="&pagerows="+ComGetObjValue(formObj.pagerows);
			formParams+="&iPage="+ComGetObjValue(formObj.iPage);
			formParams+="&ofc_cd="+ComGetObjValue(formObj.ofc_cd);
			formParams+="&inv_sub_sys_cd="+ComGetObjValue(formObj.inv_sub_sys_cd);
			formParams+="&inv_ofc_cd="+ComGetObjValue(formObj.inv_ofc_cd);
			formParams+="&cnt_cd="+ComGetObjValue(formObj.cnt_cd);
			formParams+="&asanogb="+ComGetObjValue(formObj.asanogb);
			formParams+="&pay_group_cd="+ComGetObjValue(formObj.pay_group_cd);
			formParams+="&csr_amt="+ComGetObjValue(formObj.csr_amt);
			formParams+="&iss_dt="+ComGetObjValue(formObj.iss_dt);
			formParams+="&rcv_dt="+ComGetObjValue(formObj.rcv_dt);
			formParams+="&gen_pay_term_cd="+ComGetObjValue(formObj.gen_pay_term_cd);
			formParams+="&temp_payment_due_dt="+ComGetObjValue(formObj.temp_payment_due_dt);
			formParams+="&pay_term_tp_cd="+ComGetObjValue(formObj.pay_term_tp_cd);
			formParams+="&ap_ofc_cd="+ComGetObjValue(formObj.ap_ofc_cd);
			formParams+="&usr_eml="+ComGetObjValue(formObj.usr_eml);
			formParams+="&usr_nm="+ComGetObjValue(formObj.usr_nm);
			formParams+="&cre_usr_id="+ComGetObjValue(formObj.cre_usr_id);
			formParams+="&csr_tp_cd="+ComGetObjValue(formObj.csr_tp_cd);
			formParams+="&evi_gb="+ComGetObjValue(formObj.evi_gb);
			formParams+="&inv_knt="+ComGetObjValue(formObj.inv_knt);
			formParams+="&inv_cfm_dt="+ComGetObjValue(formObj.inv_cfm_dt);
			formParams+="&pso_trns_slp_ctnt="+ComGetObjValue(formObj.pso_trns_slp_ctnt);
			formParams+="&tax_naid_flg="+ComGetObjValue(formObj.tax_naid_flg);
			formParams+="&finance_flg="+ComGetObjValue(formObj.finance_flg);
			formParams+="&fa_flg="+ComGetObjValue(formObj.fa_flg);
			formParams+="&tax_type="+ComGetObjValue(formObj.tax_type);
			formParams+="&tax_nsl_flg="+ComGetObjValue(formObj.tax_nsl_flg);
			formParams+="&evi_inv_dt="+ComGetObjValue(formObj.evi_inv_dt);
			formParams+="&evi_comp_no="+ComGetObjValue(formObj.evi_comp_no);
			formParams+="&evi_total_net_amt="+ComGetObjValue(formObj.evi_total_net_amt);
			formParams+="&evi_tax_no2="+ComGetObjValue(formObj.evi_tax_no2);
			formParams+="&evi_total_tax_amt="+ComGetObjValue(formObj.evi_total_tax_amt);
			formParams+="&evi_ctnt1="+ComGetObjValue(formObj.evi_ctnt1);
			formParams+="&evi_ctnt2="+ComGetObjValue(formObj.evi_ctnt2);
			formParams+="&evi_ctnt3="+ComGetObjValue(formObj.evi_ctnt3);
			formParams+="&evi_ctnt4="+ComGetObjValue(formObj.evi_ctnt4);
			formParams+="&evi_ctnt5="+ComGetObjValue(formObj.evi_ctnt5);
			formParams+="&evi_ctnt6="+ComGetObjValue(formObj.evi_ctnt6);
			formParams+="&evi_ctnt7="+ComGetObjValue(formObj.evi_ctnt7);
			formParams+="&evi_ctnt8="+ComGetObjValue(formObj.evi_ctnt8);
			formParams+="&evi_ctnt9="+ComGetObjValue(formObj.evi_ctnt9);
			formParams+="&evi_ctnt10="+ComGetObjValue(formObj.evi_ctnt10);
			formParams+="&evi_ctnt11="+ComGetObjValue(formObj.evi_ctnt11);
			formParams+="&evi_ctnt12="+ComGetObjValue(formObj.evi_ctnt12);
			formParams+="&evi_tax_no="+ComGetObjValue(formObj.evi_tax_no);
			formParams+="&evi_tax_code="+ComGetObjValue(formObj.evi_tax_code);
			formParams+="&s_tax_naid_flg="+ComGetObjValue(formObj.s_tax_naid_flg);
			formParams+="&s_finance_flg="+ComGetObjValue(formObj.s_finance_flg);
			formParams+="&s_fa_flg="+ComGetObjValue(formObj.s_fa_flg);
			formParams+="&s_tax_type="+ComGetObjValue(formObj.s_tax_type);
			formParams+="&s_tax_nsl_flg="+ComGetObjValue(formObj.s_tax_nsl_flg);
			formParams+="&s_evi_inv_dt="+ComGetObjValue(formObj.s_evi_inv_dt);
			formParams+="&s_evi_comp_no="+ComGetObjValue(formObj.s_evi_comp_no);
			formParams+="&s_evi_total_net_amt="+ComGetObjValue(formObj.s_evi_total_net_amt);
			formParams+="&s_evi_tax_no2="+ComGetObjValue(formObj.s_evi_tax_no2);
			formParams+="&s_evi_total_tax_amt="+ComGetObjValue(formObj.s_evi_total_tax_amt);
			formParams+="&s_evi_ctnt1="+ComGetObjValue(formObj.s_evi_ctnt1);
			formParams+="&s_evi_ctnt2="+ComGetObjValue(formObj.s_evi_ctnt2);
			formParams+="&s_evi_ctnt3="+ComGetObjValue(formObj.s_evi_ctnt3);
			formParams+="&s_evi_ctnt4="+ComGetObjValue(formObj.s_evi_ctnt4);
			formParams+="&s_evi_ctnt5="+ComGetObjValue(formObj.s_evi_ctnt5);
			formParams+="&s_evi_ctnt6="+ComGetObjValue(formObj.s_evi_ctnt6);
			formParams+="&s_evi_ctnt7="+ComGetObjValue(formObj.s_evi_ctnt7);
			formParams+="&s_evi_ctnt8="+ComGetObjValue(formObj.s_evi_ctnt8);
			formParams+="&s_evi_ctnt9="+ComGetObjValue(formObj.s_evi_ctnt9);
			formParams+="&s_evi_ctnt10="+ComGetObjValue(formObj.s_evi_ctnt10);
			formParams+="&s_evi_ctnt11="+ComGetObjValue(formObj.s_evi_ctnt11);
			formParams+="&s_evi_ctnt12="+ComGetObjValue(formObj.s_evi_ctnt12);
			formParams+="&s_evi_tax_no="+ComGetObjValue(formObj.s_evi_tax_no);
			formParams+="&s_evi_tax_code="+ComGetObjValue(formObj.s_evi_tax_code);
			formParams+="&ttl_lss_div_cd="+ComGetObjValue(formObj.ttl_lss_div_cd);
			formParams+="&inv_rgst_no="+ComGetObjValue(formObj.inv_rgst_no);
			formParams+="&eviInputFlg="+ComGetObjValue(formObj.eviInputFlg);
			formParams+="&s_eviInputFlg="+ComGetObjValue(formObj.s_eviInputFlg);
			formParams+="&apopen="+ComGetObjValue(formObj.apopen);
			formParams+="&asa_no_s="+ComGetObjValue(formObj.asa_no_s);
			formParams+="&aproSeqKey="+ComGetObjValue(formObj.aproSeqKey);
			formParams+="&key="+ComGetObjValue(formObj.key);
			formParams+="&cost_ofc_cd="+ComGetObjValue(formObj.cost_ofc_cd);
			formParams+="&vndr_seq="+ComGetObjValue(formObj.vndr_seq);
			formParams+="&cnt_inv="+ComGetObjValue(formObj.cnt_inv);
			formParams+="&curr_cd="+ComGetObjValue(formObj.curr_cd);
			formParams+="&total_amt="+ComGetObjValue(formObj.total_amt);
			formParams+="&max_iss_dt="+ComGetObjValue(formObj.max_iss_dt);
			formParams+="&max_rcv_dt="+ComGetObjValue(formObj.max_rcv_dt);
			formParams+="&gen_pay_term_desc="+ComGetObjValue(formObj.gen_pay_term_desc);
			formParams+="&payment_due_dt="+ComGetObjValue(formObj.payment_due_dt);
			formParams+="&apro_step="+ComGetObjValue(formObj.apro_step);
			formParams+="&csr_no="+ComGetObjValue(formObj.csr_no);
			var param=sheetObjects[0].GetSaveString(false,true,1);
//parameter changed[check again]CLT 			
			var sXml=sheetObjects[2].GetSearchData("COM_CSR_0002GS.do", param+'&'+formParams,"",true);
   			var arrXml=sXml.split("|$$|");
   			sheetObjects[1].LoadSearchData(arrXml[0],{Sync:1} );
   			sheetObjects[2].LoadSearchData(arrXml[1],{Sync:1} );
   			break;
        case IBSAVE:      //Saving
			var sRow=sheetObj.FindCheckedRow(1);
			var arrRow=sRow.split("|");
			formObj.inv_knt.value=arrRow.length;
        	formObj.f_cmd.value=MULTI01;
        	var param=sheetObj.GetSaveString(false,true,1);
			var formParams="";
			formParams+="f_cmd="+ComGetObjValue(formObj.f_cmd);
			formParams+="&pagerows="+ComGetObjValue(formObj.pagerows);
			formParams+="&iPage="+ComGetObjValue(formObj.iPage);
			formParams+="&ofc_cd="+ComGetObjValue(formObj.ofc_cd);
			formParams+="&inv_sub_sys_cd="+ComGetObjValue(formObj.inv_sub_sys_cd);
			formParams+="&inv_ofc_cd="+ComGetObjValue(formObj.inv_ofc_cd);
			formParams+="&cnt_cd="+ComGetObjValue(formObj.cnt_cd);
			formParams+="&asanogb="+ComGetObjValue(formObj.asanogb);
			formParams+="&pay_group_cd="+ComGetObjValue(formObj.pay_group_cd);
			formParams+="&csr_amt="+ComGetObjValue(formObj.csr_amt);
			formParams+="&iss_dt="+ComGetObjValue(formObj.iss_dt);
			formParams+="&rcv_dt="+ComGetObjValue(formObj.rcv_dt);
			formParams+="&gen_pay_term_cd="+ComGetObjValue(formObj.gen_pay_term_cd);
			formParams+="&temp_payment_due_dt="+ComGetObjValue(formObj.temp_payment_due_dt);
			formParams+="&pay_term_tp_cd="+ComGetObjValue(formObj.pay_term_tp_cd);
			formParams+="&ap_ofc_cd="+ComGetObjValue(formObj.ap_ofc_cd);
			formParams+="&usr_eml="+ComGetObjValue(formObj.usr_eml);
			formParams+="&usr_nm="+ComGetObjValue(formObj.usr_nm);
			formParams+="&cre_usr_id="+ComGetObjValue(formObj.cre_usr_id);
			formParams+="&csr_tp_cd="+ComGetObjValue(formObj.csr_tp_cd);
			formParams+="&evi_gb="+ComGetObjValue(formObj.evi_gb);
			formParams+="&inv_knt="+ComGetObjValue(formObj.inv_knt);
			formParams+="&inv_cfm_dt="+ComGetObjValue(formObj.inv_cfm_dt);
			formParams+="&pso_trns_slp_ctnt="+ComGetObjValue(formObj.pso_trns_slp_ctnt);
			formParams+="&tax_naid_flg="+ComGetObjValue(formObj.tax_naid_flg);
			formParams+="&finance_flg="+ComGetObjValue(formObj.finance_flg);
			formParams+="&fa_flg="+ComGetObjValue(formObj.fa_flg);
			formParams+="&tax_type="+ComGetObjValue(formObj.tax_type);
			formParams+="&tax_nsl_flg="+ComGetObjValue(formObj.tax_nsl_flg);
			formParams+="&evi_inv_dt="+ComGetObjValue(formObj.evi_inv_dt);
			formParams+="&evi_comp_no="+ComGetObjValue(formObj.evi_comp_no);
			formParams+="&evi_total_net_amt="+ComGetObjValue(formObj.evi_total_net_amt);
			formParams+="&evi_tax_no2="+ComGetObjValue(formObj.evi_tax_no2);
			formParams+="&evi_total_tax_amt="+ComGetObjValue(formObj.evi_total_tax_amt);
			formParams+="&evi_ctnt1="+ComGetObjValue(formObj.evi_ctnt1);
			formParams+="&evi_ctnt2="+ComGetObjValue(formObj.evi_ctnt2);
			formParams+="&evi_ctnt3="+ComGetObjValue(formObj.evi_ctnt3);
			formParams+="&evi_ctnt4="+ComGetObjValue(formObj.evi_ctnt4);
			formParams+="&evi_ctnt5="+ComGetObjValue(formObj.evi_ctnt5);
			formParams+="&evi_ctnt6="+ComGetObjValue(formObj.evi_ctnt6);
			formParams+="&evi_ctnt7="+ComGetObjValue(formObj.evi_ctnt7);
			formParams+="&evi_ctnt8="+ComGetObjValue(formObj.evi_ctnt8);
			formParams+="&evi_ctnt9="+ComGetObjValue(formObj.evi_ctnt9);
			formParams+="&evi_ctnt10="+ComGetObjValue(formObj.evi_ctnt10);
			formParams+="&evi_ctnt11="+ComGetObjValue(formObj.evi_ctnt11);
			formParams+="&evi_ctnt12="+ComGetObjValue(formObj.evi_ctnt12);
			formParams+="&evi_tax_no="+ComGetObjValue(formObj.evi_tax_no);
			formParams+="&evi_tax_code="+ComGetObjValue(formObj.evi_tax_code);
			formParams+="&s_tax_naid_flg="+ComGetObjValue(formObj.s_tax_naid_flg);
			formParams+="&s_finance_flg="+ComGetObjValue(formObj.s_finance_flg);
			formParams+="&s_fa_flg="+ComGetObjValue(formObj.s_fa_flg);
			formParams+="&s_tax_type="+ComGetObjValue(formObj.s_tax_type);
			formParams+="&s_tax_nsl_flg="+ComGetObjValue(formObj.s_tax_nsl_flg);
			formParams+="&s_evi_inv_dt="+ComGetObjValue(formObj.s_evi_inv_dt);
			formParams+="&s_evi_comp_no="+ComGetObjValue(formObj.s_evi_comp_no);
			formParams+="&s_evi_total_net_amt="+ComGetObjValue(formObj.s_evi_total_net_amt);
			formParams+="&s_evi_tax_no2="+ComGetObjValue(formObj.s_evi_tax_no2);
			formParams+="&s_evi_total_tax_amt="+ComGetObjValue(formObj.s_evi_total_tax_amt);
			formParams+="&s_evi_ctnt1="+ComGetObjValue(formObj.s_evi_ctnt1);
			formParams+="&s_evi_ctnt2="+ComGetObjValue(formObj.s_evi_ctnt2);
			formParams+="&s_evi_ctnt3="+ComGetObjValue(formObj.s_evi_ctnt3);
			formParams+="&s_evi_ctnt4="+ComGetObjValue(formObj.s_evi_ctnt4);
			formParams+="&s_evi_ctnt5="+ComGetObjValue(formObj.s_evi_ctnt5);
			formParams+="&s_evi_ctnt6="+ComGetObjValue(formObj.s_evi_ctnt6);
			formParams+="&s_evi_ctnt7="+ComGetObjValue(formObj.s_evi_ctnt7);
			formParams+="&s_evi_ctnt8="+ComGetObjValue(formObj.s_evi_ctnt8);
			formParams+="&s_evi_ctnt9="+ComGetObjValue(formObj.s_evi_ctnt9);
			formParams+="&s_evi_ctnt10="+ComGetObjValue(formObj.s_evi_ctnt10);
			formParams+="&s_evi_ctnt11="+ComGetObjValue(formObj.s_evi_ctnt11);
			formParams+="&s_evi_ctnt12="+ComGetObjValue(formObj.s_evi_ctnt12);
			formParams+="&s_evi_tax_no="+ComGetObjValue(formObj.s_evi_tax_no);
			formParams+="&s_evi_tax_code="+ComGetObjValue(formObj.s_evi_tax_code);
			formParams+="&attr_ctnt8="+ComGetObjValue(formObj.attr_ctnt8);
			formParams+="&ttl_lss_div_cd="+ComGetObjValue(formObj.ttl_lss_div_cd);
			formParams+="&inv_rgst_no="+ComGetObjValue(formObj.inv_rgst_no);
			formParams+="&eviInputFlg="+ComGetObjValue(formObj.eviInputFlg);
			formParams+="&s_eviInputFlg="+ComGetObjValue(formObj.s_eviInputFlg);
			formParams+="&apopen="+ComGetObjValue(formObj.apopen);
			formParams+="&asa_no_s="+ComGetObjValue(formObj.asa_no_s);
			formParams+="&aproSeqKey="+ComGetObjValue(formObj.aproSeqKey);
			formParams+="&key="+ComGetObjValue(formObj.key);
			formParams+="&cost_ofc_cd="+ComGetObjValue(formObj.cost_ofc_cd);
			formParams+="&vndr_seq="+ComGetObjValue(formObj.vndr_seq);
			formParams+="&cnt_inv="+ComGetObjValue(formObj.cnt_inv);
			formParams+="&curr_cd="+ComGetObjValue(formObj.curr_cd);
			formParams+="&total_amt="+ComGetObjValue(formObj.total_amt);
			formParams+="&max_iss_dt="+ComGetObjValue(formObj.max_iss_dt);
			formParams+="&max_rcv_dt="+ComGetObjValue(formObj.max_rcv_dt);
			formParams+="&gen_pay_term_desc="+ComGetObjValue(formObj.gen_pay_term_desc);
			formParams+="&payment_due_dt="+ComGetObjValue(formObj.payment_due_dt);
			formParams+="&apro_step="+ComGetObjValue(formObj.apro_step);
			formParams+="&csr_no="+ComGetObjValue(formObj.csr_no);
//parameter changed[check again]CLT
			var sXml=sheetObj.GetSearchData("COM_CSR_0002GS.do", param+'&'+formParams);
			var key=ComGetEtcData(sXml,"key");
	        if (key.length > 0) {
				gRefresh=true; // Having to retrieve from the result file
	            formObj.key.value=key;
	            sheetObj.SetWaitImageVisible(0);
	            ComOpenWait(true);
	            sheetObj.SetWaitTimeOut(1000);
	            timer=setInterval(UF_getBackEndJobStatus, 3000); // Calling getBackEndJobStatus after 3 seconds(Recursive calling)
	        }
	        break;
		//Retrieving BackEndJob Status and JB_ERR_MSG
		case IBSEARCH_ASYNC02:
		    formObj.f_cmd.value=SEARCHLIST;
		    var param=sheetObj.GetSaveString(false,true,1);
			var formParams="";
			formParams+="f_cmd="+ComGetObjValue(formObj.f_cmd);
			formParams+="&pagerows="+ComGetObjValue(formObj.pagerows);
			formParams+="&iPage="+ComGetObjValue(formObj.iPage);
			formParams+="&ofc_cd="+ComGetObjValue(formObj.ofc_cd);
			formParams+="&inv_sub_sys_cd="+ComGetObjValue(formObj.inv_sub_sys_cd);
			formParams+="&inv_ofc_cd="+ComGetObjValue(formObj.inv_ofc_cd);
			formParams+="&cnt_cd="+ComGetObjValue(formObj.cnt_cd);
			formParams+="&asanogb="+ComGetObjValue(formObj.asanogb);
			formParams+="&pay_group_cd="+ComGetObjValue(formObj.pay_group_cd);
			formParams+="&csr_amt="+ComGetObjValue(formObj.csr_amt);
			formParams+="&iss_dt="+ComGetObjValue(formObj.iss_dt);
			formParams+="&rcv_dt="+ComGetObjValue(formObj.rcv_dt);
			formParams+="&gen_pay_term_cd="+ComGetObjValue(formObj.gen_pay_term_cd);
			formParams+="&temp_payment_due_dt="+ComGetObjValue(formObj.temp_payment_due_dt);
			formParams+="&pay_term_tp_cd="+ComGetObjValue(formObj.pay_term_tp_cd);
			formParams+="&ap_ofc_cd="+ComGetObjValue(formObj.ap_ofc_cd);
			formParams+="&usr_eml="+ComGetObjValue(formObj.usr_eml);
			formParams+="&usr_nm="+ComGetObjValue(formObj.usr_nm);
			formParams+="&cre_usr_id="+ComGetObjValue(formObj.cre_usr_id);
			formParams+="&csr_tp_cd="+ComGetObjValue(formObj.csr_tp_cd);
			formParams+="&evi_gb="+ComGetObjValue(formObj.evi_gb);
			formParams+="&inv_knt="+ComGetObjValue(formObj.inv_knt);
			formParams+="&inv_cfm_dt="+ComGetObjValue(formObj.inv_cfm_dt);
			formParams+="&pso_trns_slp_ctnt="+ComGetObjValue(formObj.pso_trns_slp_ctnt);
			formParams+="&tax_naid_flg="+ComGetObjValue(formObj.tax_naid_flg);
			formParams+="&finance_flg="+ComGetObjValue(formObj.finance_flg);
			formParams+="&fa_flg="+ComGetObjValue(formObj.fa_flg);
			formParams+="&tax_type="+ComGetObjValue(formObj.tax_type);
			formParams+="&tax_nsl_flg="+ComGetObjValue(formObj.tax_nsl_flg);
			formParams+="&evi_inv_dt="+ComGetObjValue(formObj.evi_inv_dt);
			formParams+="&evi_comp_no="+ComGetObjValue(formObj.evi_comp_no);
			formParams+="&evi_total_net_amt="+ComGetObjValue(formObj.evi_total_net_amt);
			formParams+="&evi_tax_no2="+ComGetObjValue(formObj.evi_tax_no2);
			formParams+="&evi_total_tax_amt="+ComGetObjValue(formObj.evi_total_tax_amt);
			formParams+="&evi_ctnt1="+ComGetObjValue(formObj.evi_ctnt1);
			formParams+="&evi_ctnt2="+ComGetObjValue(formObj.evi_ctnt2);
			formParams+="&evi_ctnt3="+ComGetObjValue(formObj.evi_ctnt3);
			formParams+="&evi_ctnt4="+ComGetObjValue(formObj.evi_ctnt4);
			formParams+="&evi_ctnt5="+ComGetObjValue(formObj.evi_ctnt5);
			formParams+="&evi_ctnt6="+ComGetObjValue(formObj.evi_ctnt6);
			formParams+="&evi_ctnt7="+ComGetObjValue(formObj.evi_ctnt7);
			formParams+="&evi_ctnt8="+ComGetObjValue(formObj.evi_ctnt8);
			formParams+="&evi_ctnt9="+ComGetObjValue(formObj.evi_ctnt9);
			formParams+="&evi_ctnt10="+ComGetObjValue(formObj.evi_ctnt10);
			formParams+="&evi_ctnt11="+ComGetObjValue(formObj.evi_ctnt11);
			formParams+="&evi_ctnt12="+ComGetObjValue(formObj.evi_ctnt12);
			formParams+="&evi_tax_no="+ComGetObjValue(formObj.evi_tax_no);
			formParams+="&evi_tax_code="+ComGetObjValue(formObj.evi_tax_code);
			formParams+="&s_tax_naid_flg="+ComGetObjValue(formObj.s_tax_naid_flg);
			formParams+="&s_finance_flg="+ComGetObjValue(formObj.s_finance_flg);
			formParams+="&s_fa_flg="+ComGetObjValue(formObj.s_fa_flg);
			formParams+="&s_tax_type="+ComGetObjValue(formObj.s_tax_type);
			formParams+="&s_tax_nsl_flg="+ComGetObjValue(formObj.s_tax_nsl_flg);
			formParams+="&s_evi_inv_dt="+ComGetObjValue(formObj.s_evi_inv_dt);
			formParams+="&s_evi_comp_no="+ComGetObjValue(formObj.s_evi_comp_no);
			formParams+="&s_evi_total_net_amt="+ComGetObjValue(formObj.s_evi_total_net_amt);
			formParams+="&s_evi_tax_no2="+ComGetObjValue(formObj.s_evi_tax_no2);
			formParams+="&s_evi_total_tax_amt="+ComGetObjValue(formObj.s_evi_total_tax_amt);
			formParams+="&s_evi_ctnt1="+ComGetObjValue(formObj.s_evi_ctnt1);
			formParams+="&s_evi_ctnt2="+ComGetObjValue(formObj.s_evi_ctnt2);
			formParams+="&s_evi_ctnt3="+ComGetObjValue(formObj.s_evi_ctnt3);
			formParams+="&s_evi_ctnt4="+ComGetObjValue(formObj.s_evi_ctnt4);
			formParams+="&s_evi_ctnt5="+ComGetObjValue(formObj.s_evi_ctnt5);
			formParams+="&s_evi_ctnt6="+ComGetObjValue(formObj.s_evi_ctnt6);
			formParams+="&s_evi_ctnt7="+ComGetObjValue(formObj.s_evi_ctnt7);
			formParams+="&s_evi_ctnt8="+ComGetObjValue(formObj.s_evi_ctnt8);
			formParams+="&s_evi_ctnt9="+ComGetObjValue(formObj.s_evi_ctnt9);
			formParams+="&s_evi_ctnt10="+ComGetObjValue(formObj.s_evi_ctnt10);
			formParams+="&s_evi_ctnt11="+ComGetObjValue(formObj.s_evi_ctnt11);
			formParams+="&s_evi_ctnt12="+ComGetObjValue(formObj.s_evi_ctnt12);
			formParams+="&s_evi_tax_no="+ComGetObjValue(formObj.s_evi_tax_no);
			formParams+="&s_evi_tax_code="+ComGetObjValue(formObj.s_evi_tax_code);
			formParams+="&ttl_lss_div_cd="+ComGetObjValue(formObj.ttl_lss_div_cd);
			formParams+="&inv_rgst_no="+ComGetObjValue(formObj.inv_rgst_no);
			formParams+="&eviInputFlg="+ComGetObjValue(formObj.eviInputFlg);
			formParams+="&s_eviInputFlg="+ComGetObjValue(formObj.s_eviInputFlg);
			formParams+="&apopen="+ComGetObjValue(formObj.apopen);
			formParams+="&asa_no_s="+ComGetObjValue(formObj.asa_no_s);
			formParams+="&aproSeqKey="+ComGetObjValue(formObj.aproSeqKey);
			formParams+="&key="+ComGetObjValue(formObj.key);
			formParams+="&cost_ofc_cd="+ComGetObjValue(formObj.cost_ofc_cd);
			formParams+="&vndr_seq="+ComGetObjValue(formObj.vndr_seq);
			formParams+="&cnt_inv="+ComGetObjValue(formObj.cnt_inv);
			formParams+="&curr_cd="+ComGetObjValue(formObj.curr_cd);
			formParams+="&total_amt="+ComGetObjValue(formObj.total_amt);
			formParams+="&max_iss_dt="+ComGetObjValue(formObj.max_iss_dt);
			formParams+="&max_rcv_dt="+ComGetObjValue(formObj.max_rcv_dt);
			formParams+="&gen_pay_term_desc="+ComGetObjValue(formObj.gen_pay_term_desc);
			formParams+="&payment_due_dt="+ComGetObjValue(formObj.payment_due_dt);
			formParams+="&apro_step="+ComGetObjValue(formObj.apro_step);
			formParams+="&csr_no="+ComGetObjValue(formObj.csr_no);
//parameter changed[check again]CLT
			var sXml=sheetObj.GetSearchData("COM_CSR_0002GS.do", param+'&'+formParams);
		    var jobState=ComGetEtcData(sXml, "jb_sts_flg")
		    var jobError=ComGetEtcData(sXml, "jb_usr_err_msg")
		    if (jobState == "3") {
		        ComOpenWait(false);
		        ComShowCodeMessage("CSR25021");
		        if (gRefresh)
		        	doActionIBSheet1(sheetObj, formObj, IBSEARCH_ASYNC03);
		        clearInterval(timer);
		    } else if (jobState == "4") {
		        ComOpenWait(false);
		        clearInterval(timer);
		        ComShowMessage(jobError);
		    } else if (jobState == "5") {
		        ComOpenWait(false);
		        clearInterval(timer);
		        ComShowCodeMessage('JOO00152');
		    }
			break;
		//Retrieving the result of BackEndJob : Retrieving CSR_NO
		case IBSEARCH_ASYNC03:
            sheetObj.SetWaitImageVisible(1);
            var param=sheetObj.GetSaveString(false,true,1);
		    formObj.f_cmd.value=SEARCHLIST03;
			var formParams="";
			formParams+="f_cmd="+ComGetObjValue(formObj.f_cmd);
			formParams+="&pagerows="+ComGetObjValue(formObj.pagerows);
			formParams+="&iPage="+ComGetObjValue(formObj.iPage);
			formParams+="&ofc_cd="+ComGetObjValue(formObj.ofc_cd);
			formParams+="&inv_sub_sys_cd="+ComGetObjValue(formObj.inv_sub_sys_cd);
			formParams+="&inv_ofc_cd="+ComGetObjValue(formObj.inv_ofc_cd);
			formParams+="&cnt_cd="+ComGetObjValue(formObj.cnt_cd);
			formParams+="&asanogb="+ComGetObjValue(formObj.asanogb);
			formParams+="&pay_group_cd="+ComGetObjValue(formObj.pay_group_cd);
			formParams+="&csr_amt="+ComGetObjValue(formObj.csr_amt);
			formParams+="&iss_dt="+ComGetObjValue(formObj.iss_dt);
			formParams+="&rcv_dt="+ComGetObjValue(formObj.rcv_dt);
			formParams+="&gen_pay_term_cd="+ComGetObjValue(formObj.gen_pay_term_cd);
			formParams+="&temp_payment_due_dt="+ComGetObjValue(formObj.temp_payment_due_dt);
			formParams+="&pay_term_tp_cd="+ComGetObjValue(formObj.pay_term_tp_cd);
			formParams+="&ap_ofc_cd="+ComGetObjValue(formObj.ap_ofc_cd);
			formParams+="&usr_eml="+ComGetObjValue(formObj.usr_eml);
			formParams+="&usr_nm="+ComGetObjValue(formObj.usr_nm);
			formParams+="&cre_usr_id="+ComGetObjValue(formObj.cre_usr_id);
			formParams+="&csr_tp_cd="+ComGetObjValue(formObj.csr_tp_cd);
			formParams+="&evi_gb="+ComGetObjValue(formObj.evi_gb);
			formParams+="&inv_knt="+ComGetObjValue(formObj.inv_knt);
			formParams+="&inv_cfm_dt="+ComGetObjValue(formObj.inv_cfm_dt);
			formParams+="&pso_trns_slp_ctnt="+ComGetObjValue(formObj.pso_trns_slp_ctnt);
			formParams+="&tax_naid_flg="+ComGetObjValue(formObj.tax_naid_flg);
			formParams+="&finance_flg="+ComGetObjValue(formObj.finance_flg);
			formParams+="&fa_flg="+ComGetObjValue(formObj.fa_flg);
			formParams+="&tax_type="+ComGetObjValue(formObj.tax_type);
			formParams+="&tax_nsl_flg="+ComGetObjValue(formObj.tax_nsl_flg);
			formParams+="&evi_inv_dt="+ComGetObjValue(formObj.evi_inv_dt);
			formParams+="&evi_comp_no="+ComGetObjValue(formObj.evi_comp_no);
			formParams+="&evi_total_net_amt="+ComGetObjValue(formObj.evi_total_net_amt);
			formParams+="&evi_tax_no2="+ComGetObjValue(formObj.evi_tax_no2);
			formParams+="&evi_total_tax_amt="+ComGetObjValue(formObj.evi_total_tax_amt);
			formParams+="&evi_ctnt1="+ComGetObjValue(formObj.evi_ctnt1);
			formParams+="&evi_ctnt2="+ComGetObjValue(formObj.evi_ctnt2);
			formParams+="&evi_ctnt3="+ComGetObjValue(formObj.evi_ctnt3);
			formParams+="&evi_ctnt4="+ComGetObjValue(formObj.evi_ctnt4);
			formParams+="&evi_ctnt5="+ComGetObjValue(formObj.evi_ctnt5);
			formParams+="&evi_ctnt6="+ComGetObjValue(formObj.evi_ctnt6);
			formParams+="&evi_ctnt7="+ComGetObjValue(formObj.evi_ctnt7);
			formParams+="&evi_ctnt8="+ComGetObjValue(formObj.evi_ctnt8);
			formParams+="&evi_ctnt9="+ComGetObjValue(formObj.evi_ctnt9);
			formParams+="&evi_ctnt10="+ComGetObjValue(formObj.evi_ctnt10);
			formParams+="&evi_ctnt11="+ComGetObjValue(formObj.evi_ctnt11);
			formParams+="&evi_ctnt12="+ComGetObjValue(formObj.evi_ctnt12);
			formParams+="&evi_tax_no="+ComGetObjValue(formObj.evi_tax_no);
			formParams+="&evi_tax_code="+ComGetObjValue(formObj.evi_tax_code);
			formParams+="&s_tax_naid_flg="+ComGetObjValue(formObj.s_tax_naid_flg);
			formParams+="&s_finance_flg="+ComGetObjValue(formObj.s_finance_flg);
			formParams+="&s_fa_flg="+ComGetObjValue(formObj.s_fa_flg);
			formParams+="&s_tax_type="+ComGetObjValue(formObj.s_tax_type);
			formParams+="&s_tax_nsl_flg="+ComGetObjValue(formObj.s_tax_nsl_flg);
			formParams+="&s_evi_inv_dt="+ComGetObjValue(formObj.s_evi_inv_dt);
			formParams+="&s_evi_comp_no="+ComGetObjValue(formObj.s_evi_comp_no);
			formParams+="&s_evi_total_net_amt="+ComGetObjValue(formObj.s_evi_total_net_amt);
			formParams+="&s_evi_tax_no2="+ComGetObjValue(formObj.s_evi_tax_no2);
			formParams+="&s_evi_total_tax_amt="+ComGetObjValue(formObj.s_evi_total_tax_amt);
			formParams+="&s_evi_ctnt1="+ComGetObjValue(formObj.s_evi_ctnt1);
			formParams+="&s_evi_ctnt2="+ComGetObjValue(formObj.s_evi_ctnt2);
			formParams+="&s_evi_ctnt3="+ComGetObjValue(formObj.s_evi_ctnt3);
			formParams+="&s_evi_ctnt4="+ComGetObjValue(formObj.s_evi_ctnt4);
			formParams+="&s_evi_ctnt5="+ComGetObjValue(formObj.s_evi_ctnt5);
			formParams+="&s_evi_ctnt6="+ComGetObjValue(formObj.s_evi_ctnt6);
			formParams+="&s_evi_ctnt7="+ComGetObjValue(formObj.s_evi_ctnt7);
			formParams+="&s_evi_ctnt8="+ComGetObjValue(formObj.s_evi_ctnt8);
			formParams+="&s_evi_ctnt9="+ComGetObjValue(formObj.s_evi_ctnt9);
			formParams+="&s_evi_ctnt10="+ComGetObjValue(formObj.s_evi_ctnt10);
			formParams+="&s_evi_ctnt11="+ComGetObjValue(formObj.s_evi_ctnt11);
			formParams+="&s_evi_ctnt12="+ComGetObjValue(formObj.s_evi_ctnt12);
			formParams+="&s_evi_tax_no="+ComGetObjValue(formObj.s_evi_tax_no);
			formParams+="&s_evi_tax_code="+ComGetObjValue(formObj.s_evi_tax_code);
			formParams+="&ttl_lss_div_cd="+ComGetObjValue(formObj.ttl_lss_div_cd);
			formParams+="&inv_rgst_no="+ComGetObjValue(formObj.inv_rgst_no);
			formParams+="&eviInputFlg="+ComGetObjValue(formObj.eviInputFlg);
			formParams+="&s_eviInputFlg="+ComGetObjValue(formObj.s_eviInputFlg);
			formParams+="&apopen="+ComGetObjValue(formObj.apopen);
			formParams+="&asa_no_s="+ComGetObjValue(formObj.asa_no_s);
			formParams+="&aproSeqKey="+ComGetObjValue(formObj.aproSeqKey);
			formParams+="&key="+ComGetObjValue(formObj.key);
			formParams+="&cost_ofc_cd="+ComGetObjValue(formObj.cost_ofc_cd);
			formParams+="&vndr_seq="+ComGetObjValue(formObj.vndr_seq);
			formParams+="&cnt_inv="+ComGetObjValue(formObj.cnt_inv);
			formParams+="&curr_cd="+ComGetObjValue(formObj.curr_cd);
			formParams+="&total_amt="+ComGetObjValue(formObj.total_amt);
			formParams+="&max_iss_dt="+ComGetObjValue(formObj.max_iss_dt);
			formParams+="&max_rcv_dt="+ComGetObjValue(formObj.max_rcv_dt);
			formParams+="&gen_pay_term_desc="+ComGetObjValue(formObj.gen_pay_term_desc);
			formParams+="&payment_due_dt="+ComGetObjValue(formObj.payment_due_dt);
			formParams+="&apro_step="+ComGetObjValue(formObj.apro_step);
			formParams+="&csr_no="+ComGetObjValue(formObj.csr_no);
//parameter changed[check again]CLT
			var sXml=sheetObj.GetSearchData("COM_CSR_0002GS.do", param+'&'+formParams);
		    formObj.csr_no.value=ComGetEtcData(sXml,"csr_no");
		    if(formObj.csr_no.value.length > 1 && formObj.csr_no.value != ""){
		    	//if (errMsg != "") return false; 
		    	showErrMessage(getMsg('CSR25021'));
				var chkRow=sheetObj.FindCheckedRow("chk");
				var arrRow=chkRow.split("|");
				for (var idx=0; idx<arrRow.length; idx++){  
					sheetObj.SetCellEditable(arrRow[idx] , "chk",0);
					sheetObj.SetCellValue(arrRow[idx] , "chk",0);
					sheetObj.SetRowBackColor(arrRow[idx],"#808080");
				}
		        deleteCheck();
				//document.form.eviInputFlg.value = '';
				resetEviData();
				if(formObj.apopen.value == "Y"){
					formObj.apopen.value="N";
					var previewFlg="";
					var pre_curr_cd=sheetObjects[1].GetCellValue(1,"pre_curr_cd");
			        if(pre_curr_cd=="KRW" || pre_curr_cd=="JPY" || pre_curr_cd=="TWD"){
			         		previewFlg="krjp";
			        }
	                sheetObjects[1].SetCellValue(1,"pre_csr_no",formObj.csr_no.value);
	                var apro_step_arr=document.form.apro_step.value.split("-");
	                myWin=null;
	                //sheetObjects[0].RemoveAll();
					 ComOpenWindow("/opuscntr/COM_CSR_0006.do?previewFlg="+previewFlg+"&previewFlgYN=N",  window,  "dialogWidth:775px;dialogHeight:700px;help:no;status:no;scroll:no;resizable:no;" , true);
				}
			}
			break;
    	}
    }
    
    /**
     * Initializing Combo
     * param : comboObj, comboNo
     * adding case as numbers of counting comboes
     */
    function initCombo(comboObj, comboNo) {
    	var formObject=document.form
        switch(comboNo) {
        	case 1:
                with (comboObj) {
      			SetMultiSelect(0);
      			SetUseAutoComplete(1);
				SetColAlign(0, "left");
				SetColAlign(1, "left");
				SetColWidth(0, "0");
				SetColWidth(1, "276");
     			SetMaxLength(3);
       			SetDropHeight(160);
       	    }
       		break;
        	case 2:
                with (comboObj) {
      			SetMultiSelect(0);
      			SetUseAutoComplete(1);
				SetColAlign(0, "left");
				SetColAlign(1, "left");
				SetColWidth(0, "0");
				SetColWidth(1, "30");
     			SetMaxLength(3);
       			SetDropHeight(160);
       	    }
       		break;
        }
    }
     
    // Retrieving the Lane SVC Type data
    function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey) {
	   switch(sAction) {
	      case IBSEARCH:
			if (sComboKey == "asa_no") {
				//Initializing the combo fields
				sComboObj.RemoveAll();
				formObj.f_cmd.value=sComboAction;
//parameter changed[check again]CLT
				var sXml=sheetObj.GetSearchData("COM_CSR_0002GS.do", FormQueryString(formObj));
				//Trade setting
				var comboItems=ComGetEtcData(sXml, sComboKey).split("|");
				addComboItem(sComboObj,comboItems);
			}
	        break;
	   }
    }
    
    /**
     * Adding the data to the combo field
     */
    function addComboItem(comboObj,comboItems) {
    	for (var i=0 ; i < comboItems.length ; i++) {
    		var comboItem=comboItems[i].split(",");
    		comboObj.InsertItem(i, comboItem[0] + "|" + comboItem[1], comboItem[1]);
    	}
    }
    
    /**
     * Handling the process for the input validation
     */
    function validateForm(sheetObj, formObj, sAction) {
    	sheetObj.ShowDebugMsg(false);
    	switch (sAction) {
    		case IBCREATE: 
    		case IBSEARCH: 
    			break;
    		case IBSAVE:   
    			var cnt=0;
    			for (var inx=1; inx <= sheetObj.LastRow(); inx++){
    				if (sheetObj.GetCellValue(inx, "ibflag") == "R")
    					continue;
    				cnt++;
    			}
    			if (cnt==0){
    				ComShowMessage("There is no data to save");
    				return false;
    			}
    			break;
    	}
    	return true;
    }
    
    function sheet1_OnSearchEnd(sheetObj,errMsg){
 		/* eBilling - Checking whether the button that is for retrieving source invoce is visible or not*/
 		sheetObj.SelectCell(sheetObj.GetSelectRow(), sheetObj.GetSelectCol());
 		for (var i=1; i<=sheetObj.RowCount(); i++) {
 			if (sheetObj.GetCellValue(i,'edi_flg')) {
 				edi_inv_yn=true;
 			}
 		}
 		if (edi_inv_yn){
 			document.all.EDILayer01.style.display="inline";
 		} else {
 			document.all.EDILayer01.style.display="none";
 		} 
    }
    
    function sheet1_OnChange(sheetObj , row , col, value)
    {
    	var formObj=document.form;
		var sName=sheetObj.ColSaveName(col);
//no support[check again]CLT 		
		var rows=sheetObj.RowCount();
		var pi=0;
		if (sName == "chk") {
			resetEviData();
   			if(row > 0 && row <= rows) {
   				if(sheetObj.GetCellValue(row,"chk") == 1) {	 //Check
   					document.form.csr_no.value="";
   				}
   			}
		}
        var chkRow=sheetObj.FindCheckedRow(1);
        var arrRow=chkRow.split("|");
        var chkRowCount=0 ;
        var maxIss=0;
        var maxRcv=0 ;
        var total_amt=0;
        var vat_amt=0;
        var pso_trns_slp_ctnt_var="";
        var pay_due_dt=0;
        var maxPayDueDt=0;
        for (idx=0; idx<arrRow.length; idx++)
        {
	          var iss_dt_var=ComGetUnMaskedValue( sheetObj.GetCellValue( arrRow[idx] , "iss_dt"), "ymdhms", "-");
	          var rcv_dt=ComGetUnMaskedValue( sheetObj.GetCellValue( arrRow[idx] , "rcv_dt"), "ymdhms", "-");
	          pso_trns_slp_ctnt_var=sheetObj.GetCellValue( arrRow[idx] , "pso_trns_slp_ctnt");
	          var pay_due_dt=ComGetUnMaskedValue( sheetObj.GetCellValue( arrRow[idx] , "pay_due_dt"), "ymdhms", "-");
	          if(maxPayDueDt < pay_due_dt){
	        	  maxPayDueDt=pay_due_dt;
	          }
	          if (idx == 0){
	        	  maxIss = iss_dt_var; // minIss를 담기위해 초기화
	          }
	          if( maxIss > iss_dt_var)  // 변수 만들기 귀찮아서리 maxIss에 minIss를 담는다	          
	          {
	              maxIss=iss_dt_var;
	          }
	          if( maxRcv < rcv_dt)
	          {
	              maxRcv=rcv_dt;
	          }
	          if(arrRow[idx] == "") {
	        	  total_amt = 0;
	        	  vat_amt = 0;
	          } else {
	        	  total_amt=parseFloat(sheetObj.GetCellValue( arrRow[idx],"inv_ttl_amt")*100)+parseFloat(total_amt)*100;
	        	  vat_amt=parseFloat(sheetObj.GetCellValue( arrRow[idx],"inv_vat_amt")*100)+parseFloat(vat_amt)*100;
	        	  total_amt=total_amt/100;
	        	  vat_amt=vat_amt/100 ;
	        	  chkRowCount++;
	          }
        }
        if ( maxIss == "0")  maxIss="";
        if ( maxRcv == "0")  maxRcv="";
        if ( chkRowCount == "0")  chkRowCount = "";
        formObj.max_iss_dt.value=maxIss;
        formObj.max_rcv_dt.value=maxRcv;
        var pre_curr_cd=document.form.curr_cd.value;
		if(pre_curr_cd=="KRW" || pre_curr_cd=="JPY" || pre_curr_cd=="TWD"){
			 formObj.total_amt.value=roundXL(total_amt, 2);
			 formObj.total_amt.value=ComAddComma(total_amt);
		}else{
			 formObj.total_amt.value=csr_chkAmtFmt(roundXL(total_amt, 2));
		}
        ComReplaceStr(formObj.max_iss_dt,"-","");
        ComReplaceStr(formObj.max_rcv_dt,"-","");
        formObj.cnt_inv.value = chkRowCount;
        var total_amt=ComReplaceStr(formObj.total_amt,",","");
        if(total_amt >= 0){
				formObj.csr_tp_cd.value="S";
		}else{
				formObj.csr_tp_cd.value="C";
		}
        var gen_pay_term_cd=formObj.gen_pay_term_cd.value;
        if(pso_trns_slp_ctnt_var == "GO"){	//advance payment
        	formObj.pso_trns_slp_ctnt_var.value=pso_trns_slp_ctnt_var;
        	formObj.payment_due_dt.value=maxPayDueDt;
        }else{
//	        if(gen_pay_term_cd == "IN"){
//	        	formObj.payment_due_dt.value=getAddDate(formObj.max_iss_dt.value, 5);
//	        }else if(gen_pay_term_cd == "OUT"){
//	        	formObj.payment_due_dt.value=getAddDate(formObj.max_iss_dt.value, 60);
//	        }else  if(gen_pay_term_cd == "" || gen_pay_term_cd == "O60" || gen_pay_term_cd == "O45"){
//	        	formObj.payment_due_dt.value=maxIss;
//	        }else{
	        	formObj.payment_due_dt.value=getAddDate(formObj.max_iss_dt.value, Number(gen_pay_term_cd));
	    		var sFromDate=formObj.max_iss_dt.value;
	    		var sToDate=formObj.payment_due_dt.value; 
				var gen_pay_term_desc=ComGetDaysBetween(sFromDate, sToDate);
				formObj.gen_pay_term_desc.value=gen_pay_term_desc;
//	        }
        }
        var sToDate=ComGetMaskedValue(formObj.payment_due_dt.value, "ymd");
        formObj.payment_due_dt.value=sToDate; 
        maxIss=ComGetMaskedValue( maxIss, "ymd");
        maxRcv=ComGetMaskedValue( maxRcv, "ymd");
        formObj.max_iss_dt.value=maxIss;
        formObj.max_rcv_dt.value=maxRcv;
        formObj.inv_rgst_no.value=sheetObj.GetCellValue(row,"inv_rgst_no");
    	var asanogb=formObj.asanogb.value;
        var currCd=formObj.curr_cd.value;

        /****************************************** Start of TLL logic**********************************************/
        if( (formObj.inv_sub_sys_cd.value == "CNI" && sheetObj.GetCellValue(row,"ttl_lss_div_cd") == "CP") || (formObj.inv_sub_sys_cd.value == "CNI" && formObj.csr_tp_cd.value == "C")){
        	formObj.ttl_lss_div_cd.value=sheetObj.GetCellValue(row,"ttl_lss_div_cd");
		  	var ttl_lss_div_cd=formObj.ttl_lss_div_cd.value;
		  	if(ttl_lss_div_cd == "PO" || ttl_lss_div_cd == "PL" || ttl_lss_div_cd == "CP"){
		  		formObj.csr_tp_cd.value="P";
		  	}
		   	 switch (sName) {
		   	 //1 
		   		case "chk" : 
		   			if(row > 0 && row <= rows) {
		   				if(sheetObj.GetCellValue(row,"chk") == 0) {	//unCheck
		         			for(var i=0; i < rows+1; i++ ){
		         				if(i!=row){
		         		        	if(sheetObj.GetRowBackColor(i)=="#808080"){
		         		        		sheetObj.SetCellEditable(i , "chk",0);
		         			       	}else{
		         			       		sheetObj.SetCellEditable(i,"chk",1);
		         			       	}
		         				}
		         			}
	   						return;
		   				}
		   				if(sheetObj.GetCellValue(row,"chk") == 1) {	 //Check
		           			for(var i=0; i < rows+1; i++ ){
		           				if(i!=row){
		           					sheetObj.SetCellEditable(i,"chk",0);
		             				document.form.evi_gb1.options[2].selected=true ;
		             				document.form.evi_gb1.disabled=true;
		            				eviGbSelect(1);
		           				}
		           			}
		   					return;
		   				}
		   			}
		   			break;
		   	 }
	    }
	    /******************************************End of TLL logic**********************************************/
    }
    
    function sheet3_OnSearchEnd(sheetObj,Code, errMsg){
		var srcName=ComGetEvent("name");
        var previewFlg="";
		var pre_csr_no=sheetObjects[1].GetCellValue(1,"pre_csr_no");
		var pre_office=document.form.cost_ofc_cd.value; //sheetObjects[1].GetCellValue(1,"pre_office");
		var pre_prpd_dy=sheetObjects[1].GetCellValue(1,"pre_prpd_dy");
		var pre_pay_to=sheetObjects[1].GetCellValue(1,"pre_pay_to");
		var pre_csr_type=sheetObjects[1].GetCellValue(1,"pre_csr_type");
		var pre_desc=sheetObjects[1].GetCellValue(1,"pre_desc");
		var pre_pay_group=sheetObjects[1].GetCellValue(1,"pre_pay_group");
		var pre_evi_tp=sheetObjects[1].GetCellValue(1,"pre_evi_tp");
		var pre_due_date=sheetObjects[1].GetCellValue(1,"pre_due_date");
		var apro_step=sheetObjects[1].GetCellValue(1,"apro_step");
		if(document.form.asa_no.value != "" || comboObjects[0].GetSelectCode()!= ""){
			var pre_asa_no=document.form.asa_no_s.value; //comboObjects[0].GetSelectCode();
		}else{
			var pre_asa_no=sheetObjects[1].GetCellValue(1,"pre_asa_no");
		}
		var pre_inv_dt=sheetObjects[1].GetCellValue(1,"pre_inv_dt");
		var pre_curr_cd=sheetObjects[1].GetCellValue(1,"pre_curr_cd");
		var pre_amt=sheetObjects[1].GetCellValue(1,"pre_amt");
		var pre_pay_amt=sheetObjects[1].GetCellValue(1,"pre_pay_amt"); // [2018-02-28]
		var chk_addr1=sheetObjects[1].GetCellValue(1,"chk_addr1");
		var chk_addr2=sheetObjects[1].GetCellValue(1,"chk_addr2");
		var chk_addr3=sheetObjects[1].GetCellValue(1,"chk_addr3");
		var chk_cty_nm=sheetObjects[1].GetCellValue(1,"chk_cty_nm");
		var chk_ste_cd=sheetObjects[1].GetCellValue(1,"chk_ste_cd");
		var chk_zip_cd=sheetObjects[1].GetCellValue(1,"chk_zip_cd");
		var chk_cnt_cd=sheetObjects[1].GetCellValue(1,"chk_cnt_cd");
		var pre_evi_tp_count="";
		var pre_title="";
		pre_due_date=document.form.payment_due_dt.value;
		
		pre_title="CONSULTATION SLIP";
		var pre_evi_tp;

		var sRow=sheetObjects[0].FindCheckedRow(1);
		var arrRow=sRow.split("|");
		pre_evi_tp_count=arrRow.length;
		pre_evi_tp=pre_evi_tp+"/"+pre_evi_tp_count;
		
		if(pre_curr_cd=="KRW" || pre_curr_cd=="JPY" || pre_curr_cd=="TWD"){
				pre_amt=pre_amt;
				pre_pay_amt=csr_chkAmtFmt(pre_pay_amt,pre_curr_cd); // [2018-02-28]
		}else{
				pre_amt=csr_chkAmtFmt(pre_amt);
				pre_pay_amt=csr_chkAmtFmt(pre_pay_amt,pre_curr_cd); // [2018-02-28]
		}
		
        if(pre_curr_cd=="KRW" || pre_curr_cd=="JPY" || pre_curr_cd=="TWD"){
         		previewFlg="krjp";
        }
		sheetObjects[1].RemoveAll();
		sheetObjects[1].DataInsert(-1);
        if(srcName=="btn_preview"){
         		pre_csr_no="";
        }
        sheetObjects[1].SetCellValue(1,"pre_csr_no",pre_csr_no);
        sheetObjects[1].SetCellValue(1,"pre_office",pre_office);
        sheetObjects[1].SetCellValue(1,"pre_prpd_dy",pre_prpd_dy);
        sheetObjects[1].SetCellValue(1,"pre_pay_to",pre_pay_to);
        sheetObjects[1].SetCellValue(1,"pre_csr_type",pre_csr_type);
        sheetObjects[1].SetCellValue(1,"pre_desc",pre_desc);
        sheetObjects[1].SetCellValue(1,"pre_pay_group",pre_pay_group);
        sheetObjects[1].SetCellValue(1,"pre_evi_tp",pre_evi_tp);
        sheetObjects[1].SetCellValue(1,"pre_due_date",pre_due_date);
        sheetObjects[1].SetCellValue(1,"pre_asa_no",pre_asa_no);
        sheetObjects[1].SetCellValue(1,"pre_inv_dt",pre_inv_dt);
        sheetObjects[1].SetCellValue(1,"pre_curr_cd",pre_curr_cd);
        sheetObjects[1].SetCellValue(1,"pre_amt",ComReplaceStr(pre_amt,",",""));
        sheetObjects[1].SetCellValue(1,"pre_pay_amt",ComReplaceStr(pre_pay_amt,",","")); // [2018-02-28]
        sheetObjects[1].SetCellValue(1,"pre_title",pre_title);
        sheetObjects[1].SetCellValue(1,"chk_addr1",chk_addr1);
        sheetObjects[1].SetCellValue(1,"chk_addr2",chk_addr2);
        sheetObjects[1].SetCellValue(1,"chk_addr3",chk_addr3);
        sheetObjects[1].SetCellValue(1,"chk_cty_nm",chk_cty_nm);
        sheetObjects[1].SetCellValue(1,"chk_ste_cd",chk_ste_cd);
        sheetObjects[1].SetCellValue(1,"chk_zip_cd",chk_zip_cd);
        sheetObjects[1].SetCellValue(1,"chk_cnt_cd",chk_cnt_cd);
        sheetObjects[1].SetCellValue(1,"apro_step",apro_step);
        
		if (Code == 0) {
			 ComOpenWindow("/opuscntr/COM_CSR_0006.do?previewFlg="+previewFlg+"&previewFlgYN=Y",  window,  "dialogWidth:775px;dialogHeight:700px;help:no;status:no;scroll:no;resizable:no;" , true);
		}
    }
    
    function approvalrequest(){
 		var sheetObject=sheetObjects[0];
 		var formObject=document.form;
/* 		
		if(formObject.apro_step.value==""){
			showErrMessage(getMsg('CSR25020'));
			return false;
		}
*/		
		if(sheetObject.FindCheckedRow(1) == "" || sheetObject.FindCheckedRow(1) == null || sheetObject.FindCheckedRow(1) == undefined){
			showErrMessage(getMsg('CSR25001'));
			return false;
		}

		var csr_amt=0;
		for(var i=0;i<sheetObject.RowCount();i++){
			if(sheetObject.GetCellValue(i+1,1)==1){
				csr_amt=parseFloat(sheetObject.GetCellValue(i+1,"inv_ttl_amt")*100)+parseFloat(csr_amt);
				}
		}
		formObject.csr_amt.value=roundXL((csr_amt/100), 2);
		eviData();
		formObject.apopen.value="Y";
		doActionIBSheet1(sheetObject,formObject,IBSAVE);
    }
    
    function roundXL(n, digits) {
    	if (digits >= 0) return parseFloat(n.toFixed(digits)); // rounding off below the decimal point
    	digits=Math.pow(10, digits); // 
    	var t=Math.round(n * digits) / digits;
    	return parseFloat(t.toFixed(0));
    }
    
 	function eviGbSelect(evi_gb){
 		var formObj=document.form;
 		if(evi_gb==1){
 			formObj.evi_gb.value=formObj.evi_gb1.value;
 		}else if(evi_gb==2){
			formObj.evi_gb.value=formObj.evi_gb2.value;
 		} 
		formObj.attr_ctnt8.value="";
	}
 	
	function resetEviData(){ 
		var formObj=document.form;
		formObj.eviInputFlg.value='';
		formObj.tax_naid_flg.value='';
		formObj.finance_flg.value='';
		formObj.fa_flg.value='';
		formObj.tax_type.value='';
		formObj.tax_nsl_flg.value='';
		formObj.s_tax_naid_flg.value='';
		formObj.s_finance_flg.value='';
		formObj.s_fa_flg.value='';
		formObj.s_tax_type.value='';
		formObj.s_tax_nsl_flg.value='';
		formObj.attr_ctnt8.value="";
		for (var i=0; i < formObj.elements.length; i++){
			try {
				if ((formObj.elements[i].name.length >= 4 && formObj.elements[i].name.substring(0,4) == 'evi_') ||
					(formObj.elements[i].name.length >= 6 && formObj.elements[i].name.substring(0,6) == 's_evi_'))
				{
					formObj.elements[i].value='';
				}
			}
			catch (e){
			}
		}
	}
	
 	function eviData(){
 		if(	document.form.evi_gb.value==2){
			document.form.tax_naid_flg.value=document.form.s_tax_naid_flg.value;
			document.form.finance_flg.value=document.form.s_finance_flg.value ;
			document.form.fa_flg.value=document.form.s_fa_flg.value;
			document.form.tax_type.value=document.form.s_tax_type.value;
			document.form.tax_nsl_flg.value=document.form.s_tax_nsl_flg.value;
			document.form.evi_inv_dt.value=document.form.s_evi_inv_dt.value;
			document.form.evi_comp_no.value=document.form.s_evi_comp_no.value;
			document.form.evi_total_net_amt.value=document.form.s_evi_total_net_amt.value;
			document.form.evi_tax_no2.value=document.form.s_evi_tax_no2.value;
			document.form.evi_total_tax_amt.value=document.form.s_evi_total_tax_amt.value;
			document.form.evi_ctnt1.value=document.form.s_evi_ctnt1.value;
			document.form.evi_ctnt2.value=document.form.s_evi_ctnt2.value;
			document.form.evi_ctnt3.value=document.form.s_evi_ctnt3.value;
			document.form.evi_ctnt4.value=document.form.s_evi_ctnt4.value;
			document.form.evi_ctnt5.value=document.form.s_evi_ctnt5.value;
			document.form.evi_ctnt6.value=document.form.s_evi_ctnt6.value;
			document.form.evi_ctnt7.value=document.form.s_evi_ctnt7.value;
			document.form.evi_ctnt8.value=document.form.s_evi_ctnt8.value;
			document.form.evi_ctnt9.value=document.form.s_evi_ctnt9.value;
			document.form.evi_ctnt10.value=document.form.s_evi_ctnt10.value;
			document.form.evi_ctnt11.value=document.form.s_evi_ctnt11.value;
			document.form.evi_ctnt12.value=document.form.s_evi_ctnt12.value;
			document.form.evi_tax_no.value=document.form.s_evi_tax_no.value;
			document.form.evi_tax_code.value=document.form.s_evi_tax_code.value;
 		}
 	}
 	
	function validateDateObj(obj){
		if (obj.readOnly==true){return false;}
		obj.value=obj.value.trim();
		if (obj.value==null || obj.value.trim()==''){return false;}
		if (!checkPeriodFormat(obj.value) || !csr_isValidDateObject(obj.value,'-')){
			showErrMessage(getMsg('CSR23011'));	
			obj.focus();
			return false;
		}
		return true;
	}
	
	function validateDateObj2(obj){
		if (obj.readOnly==true){return false;}
		obj.value=obj.value.trim();
		if (obj.value==null || obj.value.trim()==''){return false;}
		if (!checkPeriodFormat(obj.value) || !csr_isValidDateObject(obj.value,'-')){
			showErrMessage(getMsg('CSR23011'));
			obj.focus();
			return false;
		}
		var formObj=document.form;
		/*****************************************************************************************
		 Only payment_due_dt can be inputted if gen_pay_term_cd does not start 'O'.
		 And also MAX_ISS_DT is not allowed the previous date or over 100 days after.
		 remove condition abount limit 100 dyas - 20160727 BP#15786 
		*****************************************************************************************/
		if(formObj.pso_trns_slp_ctnt_var.value == "GO"){
			if (formObj.max_iss_dt.value!=null && formObj.max_iss_dt.value.trim()!='' &&
			formObj.payment_due_dt.value!=null && formObj.payment_due_dt.value.trim()!=''){
				//if (ComGetDaysBetween(formObj.max_iss_dt.value, formObj.payment_due_dt.value) > 100){
				//	formObj.payment_due_dt.value=getAddDate(formObj.max_iss_dt.value, 100);
				//}
				if(ComGetDaysBetween(formObj.max_iss_dt.value, formObj.payment_due_dt.value) > 0){
					formObj.gen_pay_term_cd.value=ComGetDaysBetween(formObj.max_iss_dt.value, formObj.payment_due_dt.value);
					formObj.gen_pay_term_desc.value=ComGetDaysBetween(formObj.max_iss_dt.value, formObj.payment_due_dt.value);
				}
			}
		}else{
			if (formObj.max_iss_dt.value!=null && formObj.max_iss_dt.value.trim()!='' &&
			formObj.payment_due_dt.value!=null && formObj.payment_due_dt.value.trim()!=''){
				if (ComGetDaysBetween(formObj.max_iss_dt.value, formObj.payment_due_dt.value) < 0){
					formObj.payment_due_dt.value=formObj.max_iss_dt.value;
				}
				//if (ComGetDaysBetween(formObj.max_iss_dt.value, formObj.payment_due_dt.value) > 100){
				//	formObj.payment_due_dt.value=getAddDate(formObj.max_iss_dt.value, 100);
				//}
				formObj.gen_pay_term_cd.value=ComGetDaysBetween(formObj.max_iss_dt.value, formObj.payment_due_dt.value);
				formObj.gen_pay_term_desc.value=ComGetDaysBetween(formObj.max_iss_dt.value, formObj.payment_due_dt.value);
			}
			if (formObj.max_iss_dt.value!=null && formObj.max_iss_dt.value.trim()!='' &&
				formObj.payment_due_dt.value!=null && formObj.payment_due_dt.value.trim()!='' &&
				!isValIssDueDt()){
				showErrMessage('Issue date must be earlier than payment due date.');	
				return false;
			}
		}
		return true;
	}
	
	function isValIssDueDt(){
		var str_issDt=document.form.max_iss_dt.value.replace(/-/gi,'');
		var str_dueDt=document.form.payment_due_dt.value.replace(/-/gi,'');
		if (isNaN(str_issDt) || isNaN(str_dueDt) || str_issDt.trim().length!=8 || str_dueDt.trim().length!=8) {
			return false;
		}
		if (parseInt(str_issDt,10) - parseInt(str_dueDt,10) > 0){
			return false;
		}
		return true;
	}
	
	function checkPeriodFormat(prd_dt){
		var date_regexp=/(^\d{4}\-\d{2}\-\d{2}$)/;
		if (!csr_checkFormat2(prd_dt, date_regexp)){	return false;
		} else { return true;
		}
	}
	
	function deleteCheck(){
		var k=0;
		for(var i=0;i<sheetObjects[0].RowCount();i++){
			if(sheetObjects[0].GetCellValue(i+1,1)==1){
				sheetObjects[0].RowDelete(i+1, false);
				k++;
				i=i-k;
			}
		}
		if(sheetObjects[0].RowCount()==0){
			approvalFlg="Y";
		}
	}

	 
	 function setQueryStr(){
		 var formObj=document.form;
	     queryStr += " ["+formObj.cost_ofc_cd.value+"]";
	     queryStr += " [TESTDT]";
	     queryStr += " ["+formObj.vndr_seq.value+"]";
	     return true;
	 }
	 
	 function UF_getBackEndJobStatus() {
		doActionIBSheet1(sheetObjects[0], document.form, IBSEARCH_ASYNC02);
	}