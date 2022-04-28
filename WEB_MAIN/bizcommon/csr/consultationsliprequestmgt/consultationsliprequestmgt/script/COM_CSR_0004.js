/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_CSR_0004.js
*@FileTitle  : Input the tax invoice
*@author     : CLT
*@version    : 1.0
*@since      : 2014/09/03
=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
					MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
					OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
    /**
     * @extends
     * @class COM_CSR_0004 : business script for COM_CSR_0004 
     */
    function COM_CSR_0004() {
    	this.processButtonClick=tprocessButtonClick;
    	this.setSheetObject=setSheetObject;
    	this.loadPage=loadPage;
    	this.initSheet=initSheet;
    	this.initControl=initControl;
    	this.doActionIBSheet=doActionIBSheet;
    	this.setTabObject=setTabObject;
    	this.validateForm=validateForm;
    }
    // The common global variables
    var sheetObjects=new Array();
    var sheetCnt=0;
    var Radiocount=0;
    var comboObjects=new Array();
    var comboCnt=0 ;
    var tax_no2_onchageFlg="";
    var tax_no2_count=0;
    /* Event handler processing by button click event */
    document.onclick=processButtonClick;
    /* Event handler processing by button name */
        function processButtonClick(){
        	 var sheetObject=sheetObjects[0];
             /*******************************************************/
             var formObject=document.form;
        	try {
        		var srcName=ComGetEvent("name");
    			switch(srcName) {
    				case "btng_ok_k":
    					if(isNull2(document.form.tax_no1.value)){
    							showErrMessage(getMsg('CSR24007','tax no.'));
    							return false;
    					}
    					if(csr_deleteComma(formObject.vat_amt_hdr.value) != csr_deleteComma(formObject.vat_amt.value)){
    							showErrMessage(getMsg('CSR25008'));
    							return false;
    					}
    					if(csr_deleteComma(formObject.total_amt_hdr.value) != csr_deleteComma(formObject.total_amt.value)){
    							showErrMessage(getMsg('CSR25009'));
    							return false;
    					}
    					if(comboObjects[0].GetSelectCode()== ""){
    							showErrMessage(getMsg('CSR25010'));
    							return false;
    					}
    					if(isNull2(getRadioValue(formObject.finance_flg))){
    							showErrMessage(getMsg('CSR25011'));
    							return false;
    					}
    					if(!isCheckedOnlyOne(document.form.attr_ctnt8)){
							showErrMessage(getMsg('CSR25033'));
							return false;
    					}
    					if(csr_deleteComma(document.form.total_amt.value)>0){
    							if(document.form.finance_flg[0].checked == false){
    									showErrMessage(getMsg('CSR25022'));
    									return false;
    							}
    					}else if(csr_deleteComma(document.form.total_amt.value)<=0){
    							if(document.form.finance_flg[1].checked == false){
    									showErrMessage(getMsg('CSR25023'));
    									return false;
    							}
    					}
    					if(csr_deleteComma(document.form.vat_amt.value)==0){
    							if(document.form.tax_type[0].checked == false){
    									showErrMessage(getMsg('CSR25024'));
    									return false;
    							}
    					}else if(csr_deleteComma(document.form.vat_amt.value)>0){
    							if(document.form.tax_type[1].checked == false){
    									showErrMessage(getMsg('CSR25025'));
    									return false;
    							}
    					}
    					if(isNull2(getRadioValue(formObject.tax_type))){
    							showErrMessage(getMsg('CSR25012'));
    							return false;
    					}
    					var saupjano=formObject.comp_no1+formObject.comp_no2 + formObject.comp_no3;
    					var saupjano1=formObject.comp_no1.value+formObject.comp_no2.value + formObject.comp_no3.value;
    					//showErrMessage("1111"+isValidSaupja(saupjano));
    					if(!check_busino(saupjano1)){
    							showErrMessage(getMsg('CSR25013'));
    							return false;
    					}
    					if(sheetObjects[0].RowCount()<1){
    							showErrMessage(getMsg('CSR25014'));
    							return false;
    					}
    					if(sheetObjects[0].RowCount()>0){
    							for(var i=0;i<sheetObjects[0].RowCount();i++){
    								if(sheetObjects[0].GetCellValue(i+1,3)==""){
    											showErrMessage(getMsg('CSR25026'));
    											return false;
    											break;
    									}
    							}
    					}
    				   /* creating TAX CODE */
    				   formObject.f_cmd.value=SEARCH04; 
    	               doActionIBSheet1(sheetObjects[1], formObject, IBSEARCH);
	                   if(formObject.tax_code.value == "" || formObject.tax_code.value == "undefined"){
	                	   showErrMessage(getMsg('CSR25034'));
	                       return false;
	                   }
    	               //creating tax_no
    	               if(formObject.tax_no3.value == null || formObject.tax_no3.value == "")    searchTaxNo3(comboObjects[0]);
	    		       if(setOpenerInsertData()){
	    				   showErrMessage(getMsg('CSR25015'));
	    				   ComClosePopup(); 
	    		       }
    				   break;
    				case "btng_cancel_k":
    					ComClosePopup(); 
    					break;
    				case "btng_new_k":
    					comboObjects[0].SetSelectCode("");
    					formObject.tax_no3.value="";
    					formObject.finance_flg[0].checked=false;
    					formObject.finance_flg[1].checked=false;
    					formObject.tax_type[0].checked=false;
    					formObject.tax_type[1].checked=false;
    					formObject.comp_no1.value="";
    					formObject.comp_no2.value="";
    					formObject.comp_no3.value="";
    					formObject.inv_dt.value="";
    					sheetObjects[0].RemoveAll();
    					break;
    				case "btng_add_k":
    					if(isNull2(document.form.tax_no1.value)){
    							showErrMessage(getMsg('CSR24007','tax no.'));
    							return false;
    					}
    					doActionIBSheet(sheetObject,formObject,IBINSERT);
    					break;
    				case "btng_delete_k":
    						var k=0;
    		    		var net_amt=0;
    		     		var vat_amt=0;
    		     		var total_amt=0;
    			 	 	  for(var i=0;i<sheetObjects[0].RowCount();i++){
    			 	 		  if(sheetObjects[0].GetCellValue(i+1,0)==1){
    			 	 						sheetObjects[0].RowDelete(i+1, false);
    			 	 						k++;
    			 	 						i=i-k;
    			 	 				}
    			 	 	  }
    		 				for(var i=0;i<sheetObjects[0].RowCount();i++){
    		 					net_amt=parseFloat(sheetObjects[0].GetCellValue(i+1,4)*100)+parseFloat((net_amt));
    		 					vat_amt=parseFloat(sheetObjects[0].GetCellValue(i+1,5)*100)+parseFloat((vat_amt));
    		 					total_amt=parseFloat(sheetObjects[0].GetCellValue(i+1,6)*100)+parseFloat((total_amt));
    		 				}
    		        document.form.net_amt.value=csr_addComma(net_amt/100);
    		        document.form.vat_amt.value=csr_addComma(vat_amt/100);
    		        document.form.total_amt.value=csr_addComma(total_amt/100);
    					break;
                } // end switch
        	}catch(e) {
        		if( e == "[object Error]") {
        			showErrMessage(getMsg('CSR21025'));
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
        function loadPage() {
         	for (i=0; i < sheetObjects.length; i++) {
         		ComConfigSheet(sheetObjects[i]);
         		initSheet(sheetObjects[i], i + 1);
         		ComEndConfigSheet(sheetObjects[i]);
         	}
         	//initializing the combo
         	for(var k=0;k<comboObjects.length;k++){
         	    initCombo(comboObjects[k], k+1);
         	}
			disableObject(document.form.vndr_seq_hdr);
			disableObject(document.form.vat_amt_hdr);
			disableObject(document.form.total_amt_hdr);
			//disableObject(document.form.tax_no1);
			disableObject(document.form.tax_no3);
			disableObject(document.form.volume);
			disableObject(document.form.ho);
			disableObject(document.form.vndr_nm);
			disableObject(document.form.bzct_nm);
			disableObject(document.form.vndr_addr);
			disableObject(document.form.bzct_nm);
			disableObject(document.form.bztp_nm);
			disableObject(document.form.ceo_nm);
			disableObject(document.form.vndr_seq);
			disableObject(document.form.net_amt);
			disableObject(document.form.vat_amt);
			disableObject(document.form.total_amt);
			insertValue();
			//not being MMR and PSO module
			if(document.form.inv_sub_sys_cd.value != "MNR" && document.form.inv_sub_sys_cd.value != "PSO"){
				disableObject(document.form.comp_no1);
				disableObject(document.form.comp_no2);
				disableObject(document.form.comp_no3);
			}
			//tax_no2 combo
		 	doActionIBCombo(sheetObjects[0] , document.form ,IBSEARCH , comboObjects[0], SEARCHLIST01 ,"tax_no2");
		 	taxInfo();
        }
        function sheet1_OnLoadFinish(sheetObj) {
        	 //retrieving rgst_no 
             doActionIBSheet(sheetObjects[0],document.form, IBCLEAR);
         }
    	function validateDateObj(obj){
    		obj.value=obj.value.trim();
    		if (obj.value==null || obj.value.trim()==''){return false;}
    		if (!checkPeriodFormat(obj.value) || !csr_isValidDateObject(obj.value.substring(0,4)+'-'+obj.value.substring(4,6)+'-01','-')){
    			showErrMessage(getMsg('CSR23011')); 
    			obj.focus();
    			return false;
    		}
    		return true;
    	}
    	function checkPeriodFormat(prd_dt){
    		var date_regexp=/(^\d{6}$)/;
    		if (!csr_checkFormat2(prd_dt, date_regexp)){	return false;
    		} else { return true;
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
            	with(sheetObj){

    //no support[check again]CLT style.height=GetSheetHeight(8);

		    var HeadTitle1=" |STS|순번|품명|공급가액|세액|합계" ;
		
		    SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:1, DataRowMerge:1 } );
		
		    var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		    var headers = [ { Text:HeadTitle1, Align:"Center"} ];
		    InitHeaders(headers, info);
		
		    var cols = [ {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		{Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		{Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		{Type:"Text",      Hidden:0,  Width:200,  Align:"Left",    ColMerge:1,   SaveName:"",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		{Type:"Int",       Hidden:0,  Width:150,  Align:"Right",   ColMerge:1,   SaveName:"",  KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		{Type:"Int",       Hidden:0,  Width:150,  Align:"Right",   ColMerge:1,   SaveName:"",  KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		{Type:"Int",       Hidden:0,  Width:100,  Align:"Right",   ColMerge:1,   SaveName:"",  KeyField:0,   CalcLogic:"|4|+|5|",Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
		     
		    InitColumns(cols);
		
		    SetEditable(1);
            SetCountFormat("[SELECTDATAROW / ROWCOUNT]");
            SetSheetHeight(150);
	    }
	    break;
            case 2:      //sheet1 init
            	with(sheetObj){

            	//no support[check again]CLT style.height=GetSheetHeight(8);

		var HeadTitle1="순번" ;
		
		SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:1, DataRowMerge:1 } );
		
		var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		var headers = [ { Text:HeadTitle1, Align:"Center"} ];
		InitHeaders(headers, info);
		
		var cols = [ {Type:"Text",      Hidden:0,  Width:150,  Align:"Right",   ColMerge:1,   SaveName:"",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
		
		InitColumns(cols);
		
		SetEditable(1);
		SetVisible(0);
        }
		break;

            }
        }
      // Handling the process about the sheet
        function doActionIBSheet(sheetObj,formObj,sAction) {
            sheetObj.ShowDebugMsg(false);
            switch(sAction) {
               case IBSEARCH:      //retrieving
                   	formObj.f_cmd.value=SEARCHLIST;
                     sheetObj.DoSearch("COM_CSR_0004.do", FormQueryString(formObj) );
                    break;
               case IBINSERT:      // saving
               			if(sheetObj.RowCount()== 4){
               					showErrMessage(getMsg('CSR25027'));
               			}else{
                    		sheetObj.DataInsert();
                    }
                    break;
               case IBCOPYROW:      //copying row
                  sheetObj.DataCopy();
                  break;
               case IBCLEAR:		//retrieving RGST_NO
				    form.f_cmd.value=SEARCH03;
					sheetObjects[0].SetWaitImageVisible(0);
 				    var sXml=sheetObjects[0].GetSearchData("COM_CSR_0004GS.do" , FormQueryString(form));
				    var compNo=ComGetEtcData(sXml,"comp_no");
					document.form.comp_no1.value=compNo.substring(0,3);
					document.form.comp_no2.value=compNo.substring(3,5);
					document.form.comp_no3.value=compNo.substring(5,10);
					//taxInfo();
               break;
            }
        }
      // Handling the process about the sheet
        function doActionIBSheet1(sheetObj,formObj,sAction) {
            sheetObj.ShowDebugMsg(false);
            switch(sAction) {
               case IBSEARCH:      //retrieving
               	sheetObj.DoSearch("COM_CSR_0004GS.do", csrFrmQryStr(formObj) );
               break; 
            }
        }
        function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey) {
    	   switch(sAction) {
    	      case IBSEARCH:
    			if (sComboObj.id == "tax_no2") {
    				//initializing the combo field
    				sComboObj.RemoveAll();
    				formObj.f_cmd.value=sComboAction;
     				var sXml=sheetObj.GetSearchData("COM_CSR_0004GS.do", FormQueryString(formObj));
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
        function validateForm(sheetObj,formObj,sAction){
            with(formObj){
//                if (!isNumber(iPage)) {
    //
//                    return false;
//                }
            }
            return true;
        }
    		function insertValue(){
    				var opener_obj=window.dialogArguments;
    				if (!opener_obj)  opener_obj=window.opener;  
    				if (!opener_obj) opener_obj=parent; 
    				//var opener_obj = opener;
    				var opener_sheet_obj=opener_obj.sheet1;
    				document.form.vndr_seq.value=opener_obj.document.form.vndr_seq.value;
    				document.form.vndr_seq_hdr.value=opener_obj.document.form.vndr_seq.value;
    				var k=0;
    				var vat_amt=0;
    				var total_amt=0;
    				var checkRow=opener_sheet_obj.FindCheckedRow(1);
    				var checkRowArray=checkRow.split("|");
    				for(k=0;k<checkRowArray.length-1;k++){
    					vat_amt=vat_amt+parseFloat(opener_sheet_obj.GetCellValue(checkRowArray[k], "inv_vat_amt"));
    					total_amt=total_amt+parseFloat(opener_sheet_obj.GetCellValue(checkRowArray[k], "inv_ttl_amt"));
    				} 
    				document.form.vat_amt_hdr.value=csr_addComma(vat_amt);
    				document.form.total_amt_hdr.value=csr_addComma(total_amt);
    				if(total_amt>0){
    						document.form.finance_flg[0].checked=true;
    				}else if(total_amt<=0){
    						document.form.finance_flg[1].checked=true;
    				}
    				if(vat_amt==0){
    						document.form.tax_type[0].checked=true;
    						document.form.tax_type[1].disabled=true;
//    						sheetObjects[0].InitDataProperty(0, 5 , dtData,				150,		daRight,			true,    	"",				false,					"",			dfInteger,			0,			false,				false);
    				}else if(total_amt>0){
    						document.form.tax_type[1].checked=true;
    				}
    		}
    		function insertValueEvi(){
    				var opener_obj=window.dialogArguments;
    				if (!opener_obj)  opener_obj=window.opener;  
    				if (!opener_obj) opener_obj=parent; 
    				//var opener_obj = opener;
    				var opener_sheet_obj=opener_obj.sheet1;
    				var k=0;
    				var total_amt=0;
    				if(opener_obj.document.form.eviInputFlg.value=="Y"){
    						if(opener_obj.document.form.attr_ctnt8.value == "ELECTRONIC"){
    							document.form.attr_ctnt8[0].checked=true;
    							document.form.attr_ctnt8[1].checked=false;
    						}else if(opener_obj.document.form.attr_ctnt8.value == "PAPER"){
    							document.form.attr_ctnt8[0].checked=false;
    							document.form.attr_ctnt8[1].checked=true;
    						}
    						tax_no2_onchageFlg="Y";
    						document.form.tax_no1.value=opener_obj.document.form.evi_tax_no.value.substring(0,6);
    						if(opener_obj.document.form.evi_tax_no.value.length==16){
    								comboObjects[0].SetSelectCode(opener_obj.document.form.evi_tax_no.value.substring(6,12),false);
    								document.form.tax_no3.value=opener_obj.document.form.evi_tax_no.value.substring(12,16);
    						}else if(opener_obj.document.form.evi_tax_no.value.length==15){
    								comboObjects[0].SetSelectCode(opener_obj.document.form.evi_tax_no.value.substring(6,11),false);
    								document.form.tax_no3.value=opener_obj.document.form.evi_tax_no.value.substring(11,16);
    						}
    						if(opener_obj.document.form.tax_naid_flg.value == "Y"){
    								document.form.tax_naid_flg[0].checked=true;
    								document.form.tax_naid_flg[1].checked=false;
    						}else if(opener_obj.document.form.tax_naid_flg.value == "N"){
    								document.form.tax_naid_flg[1].checked=true;
    								document.form.tax_naid_flg[0].checked=false;
    						}
    						if(opener_obj.document.form.finance_flg.value == "Y"){
    								document.form.finance_flg[0].checked=true;
    								document.form.finance_flg[1].checked=false;
    						}else if(opener_obj.document.form.finance_flg.value == "N"){
    								document.form.finance_flg[1].checked=true;
    								document.form.finance_flg[0].checked=false;
    						}
    						if(opener_obj.document.form.fa_flg.value == "Y"){
    								document.form.fa_flg[0].checked=true;
    								document.form.fa_flg[1].checked=false;
    						}else if(opener_obj.document.form.fa_flg.value == "N"){
    								document.form.fa_flg[1].checked=true;
    								document.form.fa_flg[0].checked=false;
    						}
    						if(opener_obj.document.form.tax_type.value == "0"){
    								document.form.tax_type[0].checked=true;
    								document.form.tax_type[1].checked=false;
    						}else if(opener_obj.document.form.tax_type.value == "10"){
    								document.form.tax_type[1].checked=true;
    								document.form.tax_type[0].checked=false;
    						}
    						if(opener_obj.document.form.tax_nsl_flg.value == "Y"){
    								document.form.tax_nsl_flg[0].checked=true;
    								document.form.tax_nsl_flg[1].checked=false;
    						}else if(opener_obj.document.form.tax_nsl_flg.value == "N"){
    								document.form.tax_nsl_flg[1].checked=true;
    								document.form.tax_nsl_flg[0].checked=false;
    						}
    						document.form.comp_no1.value=opener_obj.document.form.evi_comp_no.value.substring(0,3);
    						document.form.comp_no2.value=opener_obj.document.form.evi_comp_no.value.substring(3,5);
    						document.form.comp_no3.value=opener_obj.document.form.evi_comp_no.value.substring(5,10);
    						//taxInfo();
    						document.form.inv_dt.value=opener_obj.document.form.evi_inv_dt.value;
    						document.form.net_amt.value=csr_addComma(opener_obj.document.form.evi_total_net_amt.value);
    						document.form.vat_amt.value=csr_addComma(opener_obj.document.form.evi_total_tax_amt.value);
    						for(var i=0;i<4;i++){
    								if(eval("opener_obj.document.form.evi_ctnt"+(k+1)).value != "" || eval("opener_obj.document.form.evi_ctnt"+(k+2)).value != "" || eval("opener_obj.document.form.evi_ctnt"+(k+3)).value != ""){
    										sheetObjects[0].DataInsert(-1);
    										k++;
    										sheetObjects[0].SetCellValue(i+1,3,eval("opener_obj.document.form.evi_ctnt"+k).value,0);
    										k++;
    										sheetObjects[0].SetCellValue(i+1,4,eval("opener_obj.document.form.evi_ctnt"+k).value,0);
    										k++;
    										sheetObjects[0].SetCellValue(i+1,5,eval("opener_obj.document.form.evi_ctnt"+k).value,0);
    										total_amt=parseFloat(sheetObjects[0].GetCellValue(i+1,6)*100)+parseFloat(csr_deleteComma(total_amt));
    								}
    						}
    						document.form.total_amt.value=csr_addComma(total_amt/100);
    				}
    		}
    	/** 
        function sheet1_OnChange(Row, Col,Value){
         		var net_amt=0;
         		var vat_amt=0;
         		var total_amt=0;
    				for(var i=0;i<sheetObjects[0].RowCount();i++){
    				}
    				if(Col==4){
sheetObjects[0].SetCellValue(Row, 5,parseFloat(sheetObjects[0].GetCellValue(i+1,4)*100)/10);
    				}
         		//if(Col == 4 || Col == 5){
     				for(var i=0;i<sheetObjects[0].RowCount();i++){
net_amt=parseFloat(sheetObjects[0].GetCellValue(i+1,4)*100)+parseFloat(net_amt);
vat_amt=parseFloat(sheetObjects[0].GetCellValue(i+1,5)*100)+parseFloat(vat_amt);
total_amt=parseFloat(sheetObjects[0].GetCellValue(i+1,6)*100)+parseFloat(total_amt);
     				}
         		//}
            document.form.net_amt.value=net_amt/100;
            document.form.vat_amt.value=vat_amt/100;
            document.form.total_amt.value=total_amt/100;
        }
        */
        function sheet1_OnSearchEnd(sheetObj,errMsg){
            if(errMsg!=null){
                showErrMessage(errMsg);
            }
           /*
    				if(tax_no2_count==0){
    						var wkplc_nmstring=sheetObj.GetEtcData("wkplc_nmstring");
    						for(p=0;p< comboObjects.length;p++){
    						  	initCombo (comboObjects[p],p+1, wkplc_nmstring);
    						}
    						tax_no2_count=comboObjects[0].GetItemCount();
    				}
	 		var vndr_nm=sheetObj.GetEtcData("vndr_nm");
	 		var bzct_nm=sheetObj.GetEtcData("bzct_nm");
	 		var bztp_nm=sheetObj.GetEtcData("bztp_nm");
	 		var vndr_addr=sheetObj.GetEtcData("vndr_addr");
	 		var ceo_nm=sheetObj.GetEtcData("ceo_nm");
            document.form.vndr_nm.value=vndr_nm;
            document.form.bzct_nm.value=bzct_nm;
            document.form.bztp_nm.value=bztp_nm;
            document.form.vndr_addr.value=vndr_addr;
            document.form.ceo_nm.value=ceo_nm;
            */
        }
        function sheet2_OnSearchEnd(sheetObj,errMsg){
            if(errMsg!=null){
                showErrMessage(errMsg);
            }
            var gsFlg=sheetObj.GetEtcData("gs_flg");
            if(gsFlg=="SEARCH02"){
		        var tax_no3=sheetObj.GetEtcData("tax_no3");
		        document.form.tax_no3.value=tax_no3;
	        }else if(gsFlg=="SEARCH04"){
		        var tax_code=sheetObj.GetEtcData("tax_code");
		        document.form.tax_code.value=tax_code;
	        }
        }
        /**
         * setting combo initial values and header
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
          				SetColWidth(1, "30");
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
           				SetDropHeight(160);
           		    }
           			break;
             }
         }
        function tax_no2_OnChange(comObj , oldindex, oldtext , oldcode , newindex, newtext , newcode)
        {
           document.form.tax_no2.value=comObj.GetSelectCode();
            /**
           if(comObj.GetSelectCode()!= "" || tax_no2_onchageFlg != "Y"){
    	       document.form.f_cmd.value=COMMAND01;
    	       doActionIBSheet1(sheetObjects[1], document.form, IBSEARCH);
           }
            **/
        }
    		function getElementValue(formObject, eleTp, eleNm) {
    			var element;
    			var numOfEle=formObject.elements.length;
    			for (var i=0; i < numOfEle; i++){
    				if (formObject.elements[i].type == eleTp && formObject.elements[i].name == eleNm){
    					if (formObject.elements[i].checked == true){
    						var ele_value=formObject.elements[i].value;
    						break;
    					}
    				}
    			}
    			return ele_value;
    		}
    		function isNum(obj){
    			//number only..
    			if (!isNumber(obj)){
    				obj.value='';
    			}
    		}
    		function isNum1(obj){
    			//number only..
    			if (!isNumDash(obj)){
    				obj.value='';
    			}
    		}
    		function isDate1(obj){
    			//number only..
    			if (!isDate(obj)){
    				obj.value='';
    			}
    		}
    		function setOpenerInsertData(){
    				var opener_obj=window.dialogArguments;
    				if (!opener_obj)  opener_obj=window.opener;  
    				if (!opener_obj) opener_obj=parent; 
    				//var opener_obj = opener;
    				var opener_sheet_obj=opener_obj.sheet1;
    				var k=0;
    				opener_obj.document.form.tax_naid_flg.value=getElementValue(document.form, 'radio', 'tax_naid_flg');
    				opener_obj.document.form.finance_flg.value=getElementValue(document.form, 'radio', 'finance_flg');
    				opener_obj.document.form.fa_flg.value=getElementValue(document.form, 'radio', 'fa_flg');
    				opener_obj.document.form.tax_type.value=getElementValue(document.form, 'radio', 'tax_type');
    				opener_obj.document.form.tax_nsl_flg.value=getElementValue(document.form, 'radio', 'tax_nsl_flg');
    				opener_obj.document.form.evi_inv_dt.value=document.form.inv_dt.value;
    				opener_obj.document.form.evi_comp_no.value=document.form.comp_no1.value+ document.form.comp_no2.value+ document.form.comp_no3.value;
    				opener_obj.document.form.evi_total_net_amt.value=csr_deleteComma(document.form.net_amt.value);
    				//opener_obj.document.form.evi_tax_no2.value = document.form.tax_no2.value;
    				opener_obj.document.form.evi_tax_no2.value=comboObjects[0].GetSelectCode();
    				opener_obj.document.form.evi_total_tax_amt.value=csr_deleteComma(document.form.vat_amt.value);
    				opener_obj.document.form.attr_ctnt8.value=getElementValue(document.form, 'checkbox', 'attr_ctnt8');
    				for(var i=0;i<4;i++){
    					if((sheetObjects[0].GetCellValue(i+1,3)!="" && sheetObjects[0].GetCellValue(i+1,3)!=undefined) && (sheetObjects[0].GetCellValue(i+1,4) != "" && sheetObjects[0].GetCellValue(i+1,4)!=undefined) && (sheetObjects[0].GetCellValue(i+1,5) !="" && sheetObjects[0].GetCellValue(i+1,4)!=undefined)){
    								k++;
    								eval("opener_obj.document.form.evi_ctnt"+ k).value=sheetObjects[0].GetCellValue(i+1,3);
    								k++;
    								eval("opener_obj.document.form.evi_ctnt"+ k).value=sheetObjects[0].GetCellValue(i+1,4);
    								k++;
    								eval("opener_obj.document.form.evi_ctnt"+ k).value=sheetObjects[0].GetCellValue(i+1,5);
    						}else{
    								k++;
    								eval("opener_obj.document.form.evi_ctnt"+ k).value="";
    								k++;
    								eval("opener_obj.document.form.evi_ctnt"+ k).value="";
    								k++;
    								eval("opener_obj.document.form.evi_ctnt"+ k).value="";
    						}
    				} 
    				opener_obj.document.form.evi_tax_no.value=document.form.tax_no1.value+comboObjects[0].GetSelectCode()+document.form.tax_no3.value;
    				opener_obj.document.form.evi_tax_code.value=document.form.tax_code.value;
    				opener_obj.document.form.eviInputFlg.value="Y";
    				return true;
    		}
    		function check_busino(vencod) {
    				var sum=0;
    				var getlist=new Array(10);
    				var chkvalue=new Array("1","3","7","1","3","7","1","3","5");
    				for(var i=0; i<10; i++) { getlist[i]=vencod.substring(i, i+1); }
    				for(var i=0; i<9; i++) { sum += getlist[i]*chkvalue[i]; }
    				sum=sum + parseInt((getlist[8]*5)/10);
    				sidliy=sum % 10;
    				sidchk=0;
    				if(sidliy != 0) { sidchk=10 - sidliy; }
    				else { sidchk=0; }
    				if(sidchk != getlist[9]) { return false; }
    				return true;
    		}
    		function taxInfo(){
    			var formObject=document.form;
    			var saupjano1=formObject.comp_no1.value+formObject.comp_no2.value + formObject.comp_no3.value;
    			if(!check_busino(saupjano1)){
    				/*
    		    	formObject.vndr_nm.value="";
    		    	formObject.bzct_nm.value="";
    		    	formObject.bztp_nm.value="";
    		    	formObject.vndr_addr.value="";
    		    	formObject.ceo_nm.value="";
    		    	*/
    				showErrMessage(getMsg('CSR25010'));
    				return false;
    			}
    			formObject.comp_no.value=saupjano1;
    		    form.f_cmd.value=SEARCH01;
    			sheetObjects[0].SetWaitImageVisible(0);
     		    var sXml=sheetObjects[0].GetSearchData("COM_CSR_0004GS.do" , FormQueryString(form));
    		    //Getting the combo code and text(vndr_nm, bzct_nm, bztp_nm, vndr_addr,ceo_nm)
    		    var vndr_nm=ComGetEtcData(sXml,"vndr_nm");
    		    var bzct_nm=ComGetEtcData(sXml,"bzct_nm");
    		    var bztp_nm=ComGetEtcData(sXml,"bztp_nm");
    		    var vndr_addr=ComGetEtcData(sXml,"vndr_addr");
    		    var ceo_nm=ComGetEtcData(sXml,"ceo_nm");
    		    if(vndr_nm == "null"){
    		    	/*
    		    	formObject.vndr_nm.value="";
    		    	formObject.bzct_nm.value="";
    		    	formObject.bztp_nm.value="";
    		    	formObject.vndr_addr.value="";
    		    	formObject.ceo_nm.value="";
    			    */
    		    }else{
    		    	formObject.vndr_nm.value=vndr_nm;
    		    	formObject.bzct_nm.value=bzct_nm;
    		    	formObject.bztp_nm.value=bztp_nm;
    		    	formObject.vndr_addr.value=vndr_addr;
    		    	formObject.ceo_nm.value=ceo_nm;
    		    }
    		}
    		function checkInvDt(obj){
    				if(obj.value.length!=10){
    						return false;
    				}
    				var day_gab=getDaysToToday(obj);
    				if(day_gab>365){
    						showErrMessage(getMsg('CSR25028'));
    						obj.value="";
    						obj.focus();
    				}
    		}
    		function isDateCheck(obj){
    				if(obj.value.length==10){
    						if(!isDate(obj)){
    								showErrMessage(getMsg('CSR25029'));
    								document.form.inv_dt.focus();
    								return false;
    						}
    				}
    		}
    		function validateDateObj2(obj){
    			if (obj.readOnly==true){return false;}
    			obj.value=obj.value.trim();
    			if (obj.value==null || obj.value.trim()==''){return false;}
    			if (!checkPeriodFormat2(obj.value) || !csr_isValidDateObject(obj.value,'-')){
    				showErrMessage(getMsg('CSR23011'));
    				obj.focus();
    				return false;
    			}
    			return true;
    		}
    		function checkPeriodFormat2(prd_dt){
    			var date_regexp=/(^\d{4}\-\d{2}\-\d{2}$)/;
    			if (!csr_checkFormat2(prd_dt, date_regexp)){	return false;
    			} else { return true;
    			}
    		}
    		function checkType(i){
    			if(i == 0){
					document.form.attr_ctnt8[1].checked=false;
    			}
    			if(i == 1){
					document.form.attr_ctnt8[0].checked=false;
    			}
    		}
    		function searchTaxNo3(comObj)
    		{
    		   document.form.tax_no2.value=comObj.GetSelectCode();
    		   if(comObj.GetSelectCode()!= "" || tax_no2_onchageFlg != "Y"){
    		       document.form.f_cmd.value=SEARCH02; 
    		       doActionIBSheet1(sheetObjects[1], document.form, IBSEARCH); 
    		   }
    		}     
