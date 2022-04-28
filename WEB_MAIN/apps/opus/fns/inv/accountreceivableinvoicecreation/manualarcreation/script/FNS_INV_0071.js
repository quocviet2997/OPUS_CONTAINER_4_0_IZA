/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0071.js
*@FileTitle  : Miscellaneous Revenue Invoice Creation
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/05
=========================================================*/
	/****************************************************************************************
	  event 구분 코드: [초기화]INIT=0; [입력]ADD=1; [retrieve]SEARCH=2; [리스트retrieve]SEARCHLIST=3;
						[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
						기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
	 ***************************************************************************************/
	var sheet_container=null;
	var auto_bl_no_flag = false;
	/**
	 * @fileoverview define calandar method when common use in java script file.
	 * @author Cyberlogitec
	 */
	/**
	 * fns_inv_0071 :  defile script for create fns_inv_0071  UI.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     fns_inv_0071()
	 * </pre>
	 * @param none
	 * @return none
	 * @author 
	 * @version 2009.10.20
	 */

	var ROWMARK="|";
	var FIELDMARK="^";
	/**
	 * OnKeyPress event Catch <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *    initControl();
	 * </pre>
	 * @param none
	 * @return none
	 * @author 
	 * @version 2009.10.20
	 */
	function initControl() {
		axon_event.addListenerForm ('blur', 'objOnChange', document.form);  
		axon_event.addListenerForm ('beforedeactivate', 'objDeactivate', document.form);
		axon_event.addListener ('keydown', 'objKeyDown', 'form');   
		axon_event.addListenerFormat ('keypress', 'objKeyPress', document.form);
		axon_event.addListenerForm ('focusout', 'obj_focusout', document.form);
	}
	/**
	 * OnChange event <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *    objOnChange();
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */
	function objOnChange() {
		switch(event.srcElement.name){
		case "lcl_vvd":
			getExRateSaDate();
			chkLclVvd();
//			if(!chkLclVvd()){
//				document.form.lcl_vvd.focus();
//			}
			break;   
		case "io_bnd_cd":
			setButtons();
			getExRateSaDate();
			break;
		case "pol_cd":
			getExRateSaDate();
			break;
		case "pod_cd":
			getExRateSaDate();
			break;
		case "svc_scp_cd":
			getExRate();
			chkscp();
			break;
		case "cust_seq":	        	
			var formObject=document.form;	 
			var v_tmp="";
			if (formObject.cust_seq.value.length != 0 && formObject.cust_seq.value.length < 6) {
				for(i=0; i < 6 - formObject.cust_seq.value.length; i++){
					v_tmp=v_tmp + "0";
				}
				document.form.cust_seq.value=v_tmp+document.form.cust_seq.value;
			}	    
			getCustNmByCustCd();
			break;      
		case "cust_rgst_no":	        	
			getCustNmByCustRgstNo();
			break;       
		case "bl_no":

			//alert(ComIsBtnEnable("btn_save"));
			if(ComIsBtnEnable("btn_save")){  //true - btn_save
			
//			alert(event.keyCode);
				//initField();
				document.form.ar_if_no.value="";
				tabObjects[0].SetSelectedIndex(0);
				sheetObjects[0].RemoveAll();
				sheetObjects[1].RemoveAll();
				sheetObjects[2].RemoveAll();
				getRevSrcCd();
				doRetrieve();
				
				
			}	
			break; 	
			
		default:
			//Validation
			//ComChkObjValid(event.srcElement);
		}	    
	}
	/**
	 * Onbeforedeactivate event <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *    objDeactivate()
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */
	function objDeactivate(){
		switch(event.srcElement.name){
		case "eff_dt":
			ComChkObjValid(event.srcElement);
			break;
		default:
			//ComChkObjValid(event.srcElement);
		}
	}    	
	/**
	 * OnKeyDown event <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *    objKeyDown();
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */	
	function objKeyDown() {
//		switch(event.srcElement.name){
//		case "bl_no":
////			alert(event.keyCode);
//			if (event.keyCode == 9 || event.keyCode == 13) {
//				//initField();
//				document.form.ar_if_no.value="";
//				tabObjects[0].SetSelectedIndex(0);
//				sheetObjects[0].RemoveAll();
//				sheetObjects[1].RemoveAll();
//				sheetObjects[2].RemoveAll();
//				getRevSrcCd();
//				doRetrieve();
//			}
//			break;   
//		default:
//			//ComChkObjValid(event.srcElement);
//		}	    
	}
	/**
	 * OnKeyPress event <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *    objKeyPress();
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */
	function objKeyPress() {
		switch(event.srcElement.dataformat){
		case "float":
			// number+"."
			ComKeyOnlyNumber(event.srcElement, "."); break;
		case "int":
			// number only
			ComKeyOnlyNumber(event.srcElement); break;
		case "engup":
			switch(event.srcElement.name){
			case "cust_cnt_cd" :	
				//upper case only		    	        
				ComKeyOnlyAlphabet('upper'); break;		
			case "lcl_vvd" :	
				//upper case only		    	        
				ComKeyOnlyAlphabet('uppernum'); break;	
			case "svc_scp_cd" :	
				//upper case only		    	        
				ComKeyOnlyAlphabet('upper'); break;	
			case "trunk_vvd" :	
				//upper case only		    	        
				ComKeyOnlyAlphabet('uppernum'); break;	
			case "por_cd" :	
				//upper case only		    	        
				ComKeyOnlyAlphabet('upper'); break;	
			case "pol_cd" :	
				//upper case only		    	        
				ComKeyOnlyAlphabet('upper'); break;	
			case "pod_cd" :	
				//upper case only		    	        
				ComKeyOnlyAlphabet('upper'); break;	
			case "del_cd" :	
				//upper case only		    	        
				ComKeyOnlyAlphabet('upper'); break;	
			case "bl_no":
				//upper case+number
				ComKeyOnlyAlphabet('uppernum'); 
				break;
			case "mst_if_no" :	
				//upper case only		    	        
				ComKeyOnlyAlphabet('uppernum'); break;	
			}
			break;              
		default:
			//number only
			//ComKeyOnlyNumber(event.srcElement);
		}
	} 
	
	/** 
	 * OnFocusOut event(on focus out)<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.05.04
	 */
	function obj_focusout() {
	    var sheetObject=sheetObjects[0];
	    var formObject=document.form;
	    var v_tmp="";
	    switch(ComGetEvent("name")){
	        case "cust_seq":
				if (formObject.cust_seq.value.length != 0 && formObject.cust_seq.value.length < 6) {
					for(i=0; i < 6 - formObject.cust_seq.value.length; i++){
						v_tmp=v_tmp + "0";
					}
					formObject.cust_seq.value=v_tmp+formObject.cust_seq.value;
				}	            	
	            if (formObject.cust_cnt_cd.value != '' && formObject.cust_seq.value) {
	                doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20);
	                //get  due-date
	        		doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC06);	

	            }
	            if(formObject.cust_cnt_cd.value == '' || formObject.cust_seq.value == ''){
	            	formObject.cust_nm.value = '';
	            }
	        case "cust_cnt_cd":
	            if(formObject.cust_cnt_cd.value == '' || formObject.cust_seq.value == ''){
	            	formObject.cust_nm.value = '';
	            }
	        	
	        break;
	    }
	}
	/**
	 * retrieve Customer Name  <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *    getCustNmByCustCd();
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */
	function getCustNmByCustCd() {
		var sheetObject=sheetObjects[0];
		var formObject=document.form;
		doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20);	

        //get  due-date
		doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC06);	

	} 
	/**
	 * retrieve Customer Name  <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *    getCustNmByCustRgstNo();
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */
	function getCustNmByCustRgstNo() {
		var sheetObject=sheetObjects[0];
		var formObject=document.form;
		doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC03);	
		
        //get  due-date
		doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC06);	
	} 	 
	/**
	 * retrieve Office Code, Rev. Type  <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *    getOfcRevCd();
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */
	function getOfcRevCd() {
		var sheetObject=sheetObjects[0];
		var formObject=document.form;		    
		doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC15);	    	
	}
	/**
	 * retrieve Rev. Type  <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *    getRevSrcCd();
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */
	function getRevSrcCd() {
		var sheetObject=sheetObjects[0];
		var formObject=document.form;	
		var arrStr=comboObjects[0].GetSelectCode().split("^");
		formObject.ofc_cd.value=arrStr[3];
		doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC16);		
	}
	/**
	 * Office change event <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     ar_ofc_cd_OnChange(comboObj, oldindex, oldtext, oldcode, newindex, newtext, newcode);
	 * </pre>
	 * @param {ibCombo} cmbObj 필수 IBCombo Object
	 * @param {String} value cmbObj value
	 * @param {String} text cmbObj text
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */
	function ar_ofc_cd_OnChange(comboObj, oldindex, oldtext, oldcode, newindex, newtext, newcode) {
		
		var arrStr=newcode.split("^");
		if (arrStr == "" ) { 
			return;
		}
		document.form.office_cnt_cd.value=arrStr[6].substring(0,2);
		document.form.lcl_curr.value=arrStr[4];  
		// India Exempt
		var office_cnt_cd = document.form.office_cnt_cd.value;
	
		if(office_cnt_cd == "IN"){
	    	ComEnableObject(document.form.ida_gst_expt_cd, true);
	    	document.getElementById('ida_gst_expt_cd').style.display="";
	    	document.getElementById('ida_gst_expt_nm').style.display="";
	    }else{
	    	document.form.ida_gst_expt_cd.value ="";
	    	ComEnableObject(document.form.ida_gst_expt_cd, false);
	    	document.getElementById('ida_gst_expt_cd').style.display="none";
	    	document.getElementById('ida_gst_expt_nm').style.display="none";
	    } 	
		
		document.form.cust_cnt_cd.value=arrStr[6].substring(0,2);
		document.form.cust_seq.value = "";
		document.form.cust_nm.value="";
		document.form.cust_rgst_no.value="";
		document.form.cr_curr_cd.value="";
		document.form.cr_amt.value="";
		document.form.ob_cr_term_dys.value="";
		document.form.ib_cr_term_dys.value="";
		document.form.cr_clt_ofc_cd.value="";
		document.form.inv_cust_cnt_cd.value="";
		document.form.inv_cust_seq.value="";
		
		if (document.form.classId.value == "") {
			getRevSrcCd();
		} else {
			var sStr="|TM";        	 
			var arrStr2=sStr.split("|");
			MakeComboObject2(comboObjects[1], arrStr2);
			comboObjects[1].SetSelectText("TM");
		}	
		var sheetObject=sheetObjects[0];
		if (arrStr[16] != "") {
			sheetObject.SetCellValue(0, "tva_flg",arrStr[16]);
		}else {
			sheetObject.SetCellValue(0, "tva_flg","TVA");
		}
		setButtons();
		
        if (sheetObject.RowCount()>0) {
		     setSummary();
		     getExRate();
        }
        
	}
	/**
	 * Rev. Type change event<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     rev_src_cd_OnChange(comboObj,value,text);
	 * </pre>
	 * @param {ibCombo} cmbObj
	 * @param {String} value 
	 * @param {String} text 
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */
	function rev_src_cd_OnChange(comboObj, oldindex, oldtext, oldcode, newindex, newtext, newcode) {
		// AS-IS 엔 없으나  TO-BE 에 새로생김 문제가되서 일단 주석처리함 한진에서만 보이게 하는것 같음
//		if (newcode == "TN" || newcode == "EQ") {
//			setLclVvd(newcode);
//			ComBtnEnable("btn_auto");
//		} else {
//			ComBtnDisable("btn_auto"); 
//		}
		

		if (newcode == "TM" || newcode == "TP" || newcode == "LS" || newcode == "DT" || newcode == "RD" || newcode == "DO" || newcode == "DM") {
			ComBtnDisable("btn_add");    
			ComBtnDisable("btn_del"); 
		} else {
			ComBtnEnable("btn_add");    
			ComBtnEnable("btn_del");     		
		}
		if ((newcode == "TM" || newcode == "TN" || newcode == "EQ") && (document.form.classId.value == "")) {
			document.form.eff_dt.className="input1";
			document.form.eff_dt.readOnly=false;
			document.form.eff_dt.value=document.form.local_time.value.substring(0,4)+"-"
			+ document.form.local_time.value.substring(4,6)+"-"
			+ document.form.local_time.value.substring(6,8);			
		} else {	
			document.form.eff_dt.className="input2";
			document.form.eff_dt.readOnly=true;
			document.form.eff_dt.value=document.form.eff_dt_tmp.value;
		}
		if(newcode =='IC' && document.form.io_bnd_cd.value == 'I'){
			document.form.mst_if_no.readOnly=true;
			document.form.mst_if_no.value='';
			document.form.mst_if_no.className="input2";
		}
		if(newcode == 'OS') {
			document.form.master_inv.className="input1";
		} else {
			document.form.master_inv.className="input2";
		}
     
		if(newcode == "OC" || document.form.tmp_bl_src_no.value != ""){
			ComEnableObject(document.form.ida_gst_expt_cd, true);
		} else {
			document.form.ida_gst_expt_cd.value = document.form.tmp_gst_expt_cd.value ;
			if (document.form.ida_gst_expt_cd.value == "E"){
				document.form.ida_gst_expt_cd.checked = true;
			}else{ 
				document.form.ida_gst_expt_cd.checked = false;
		    }
			ComEnableObject(document.form.ida_gst_expt_cd, false);
		}

		
		chrgChk();    
//		chkLclVvd(); 
	}  
	/**
	 * check Charge Code  <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *    chrgChk();
	 * </pre>
	 * @param none
	 * @return Boolean
	 * @author 정휘택
	 * @version 2009.10.20
	 */
	function chrgChk() {  
		var formObj=document.form;	
		var sheetObj=sheetObjects[0];    	
		var revSrcCd=comboObjects[1].GetSelectCode();
		for (var j=1; j < sheetObj.RowCount()+ 1; j++) {
			var revTpCds=form.rev_src_cds.value;
			//if(sheetObj.CellValue(j, 2) == ""){
			//	return false;
			//}
			if (revTpCds.lastIndexOf("WC") > 0) {
				if (sheetObj.GetCellValue(j, 2) == "WHF" && revSrcCd != "WC" && revSrcCd != "OC") {
					ComShowCodeMessage("INV00106");					
					sheetObj.SelectCell(j,2);
					//sheetObj.CellValue2(j, 2) = "";
					return false;
				}
				if (sheetObj.GetCellValue(j, 2) != "WHF" && revSrcCd == "WC") {
					ComShowCodeMessage("INV00106");
					sheetObj.SelectCell(j,2);
					//sheetObj.CellValue2(j, 2) = "";
					return false;
				}
			}
			if (revTpCds.lastIndexOf("TS") > 0) {
				if ((sheetObj.GetCellValue(j, 2) == "OTS" || sheetObj.GetCellValue(j, 2) == "DTS") && revSrcCd != "TS") {
					ComShowCodeMessage("INV00107");
					sheetObj.SelectCell(j,2);
					//sheetObj.CellValue2(j, 2) = "";
					return false;
				}
				if (sheetObj.GetCellValue(j, 2) != "OTS" && sheetObj.GetCellValue(j, 2) != "DTS" && revSrcCd == "TS") {
					ComShowCodeMessage("INV00107");
					sheetObj.SelectCell(j,2);
					//sheetObj.CellValue2(j, 2) = "";
					return false;
				}
			}
			if (revTpCds.lastIndexOf("EQ") > 0) {	
				if (sheetObj.GetCellValue(j, 2) == "CRC" && revSrcCd != "EQ") {
					ComShowCodeMessage("INV00108");
					sheetObj.SelectCell(j,2);
					//sheetObj.CellValue2(j, 2) = "";
					return false;
				}
				if (sheetObj.GetCellValue(j, 2) != "CRC" && revSrcCd == "EQ") {
					ComShowCodeMessage("INV00108");
					sheetObj.SelectCell(j,2);
					//sheetObj.CellValue2(j, 2) = "";
					return false;
				}
			}    
			if (revTpCds.lastIndexOf("TM") > 0 || revTpCds.lastIndexOf("TN") > 0) {	
				if ((revSrcCd == "TM" || revSrcCd == "TN")
						&& !(sheetObj.GetCellValue(j, 2) == "CFR" || sheetObj.GetCellValue(j, 2) == "JOP" || sheetObj.GetCellValue(j, 2) == "TVA")) {
					ComShowCodeMessage("INV00120");
					sheetObj.SelectCell(j,2);
					//sheetObj.CellValue2(j, 2) = "";
					return false;
				}
			}   
		}
		return true;
	}
	/**
	 * LCL VVD setting <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *    setLclVvd(value);
	 * </pre>
	 * @param {String} value Rev. Type Code
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */     
	function setLclVvd(value) {
		var sheetObject1=sheetObjects[0];
		var formObject=document.form;
		doActionIBSheet(sheetObject1,formObject,IBSEARCH_ASYNC13);
		var localTime=formObject.local_time.value;
		if (value == "EQ") {
			formObject.lcl_vvd.value="USAC"+localTime.substring(2,6)+"M";
		} else if (value == "TN") {
			formObject.lcl_vvd.value="CFDR"+localTime.substring(2,6)+"E";
		}
		getExRateSaDate();
	}
	/**
	 * sheet value change event <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     sheet2_OnChange(sheetObj,Row,Col,Value);
	 * </pre>
	 * @param {ibsheet} sheetObj 
	 * @param {int} Row ibsheet
	 * @param {int} Col ibsheet
	 * @param {String} value 
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */     
	function sheet2_OnChange(sheetObj,Row,Col,Value){
		var sheetObject1=sheetObjects[0];
		var sheetObject2=sheetObjects[1];
		var formObject=document.form;
		if (sheetObj.ColSaveName(Col) == "per_tp_cd") {
			var perTpCd=formObject.per_tp_cds.value;
			if (perTpCd.indexOf("|"+Value) < 0) {
				ComShowCodeMessage("INV00041", "Per"); 
				sheetObj.SetCellValue(Row, Col,"",0);
				return;
			}
		}
		if (sheetObj.ColSaveName(Col) == "chg_cd") {
			if (Value != " "){    	
				var arrStr=comboObjects[0].GetSelectCode().split("^");
				formObject.ofc_cd.value=arrStr[1];
				formObject.p_chg_cd.value=Value;
				doActionIBSheet(sheetObject1,formObject,IBSEARCH_ASYNC14);	
				var chgCds=formObject.chg_cds.value;
				if (chgCds.indexOf(Value) < 0||Value.length!=3) {
					ComShowCodeMessage("INV00041", "Charge"); 
					sheetObj.SetCellValue(Row, Col,"",0);
					sheetObj.SelectCell(Row, Col)
					return;
				}
				//check when rev_src_cd is 'IV'
				var var_rev_src_cd=comboObjects[1].GetSelectText();
				if (var_rev_src_cd == "IV"){
					if (formObject.blck_chg.value != "") {
						ComShowCodeMessage("INV00114");
						sheetObject1.SetCellValue(Row, Col,"",0);
						return;
					}
				}
				var arrStr=comboObjects[0].GetSelectCode().split("^");
				var chgCd=Value;
				var ofcCd=arrStr[1];
				var svrId=arrStr[7];
				var invVatChgCd=arrStr[16];
				if (chrgChk()) {	
					if (invVatChgCd != "" && chgCd != "TVA") {
						sheetObject1.SetCellEditable(Row, "tva_flg",1);
					} else {
						sheetObject1.SetCellEditable(Row, "tva_flg",0);
					}	    		    	
				} 
			}
		}
		if (sheetObj.ColSaveName(Col) == "rat_as_cntr_qty") {
			if (Value <= 0 && Value != "") {
				ComShowCodeMessage("INV00105");
				sheetObj.SetCellValue(sheetObj.GetSelectRow(), "rat_as_cntr_qty","",0);
				return;
			}
		}
		if (sheetObj.ColSaveName(Col) == "trf_rt_amt") {
			if(comboObjects[1].GetSelectCode()== "IV") {
				//if (Value < 1 && Value != "") {
				if (Value < 0 && Value != "") {
					ComShowCodeMessage("INV00101");
					sheetObj.SetCellValue(sheetObj.GetSelectRow(), "trf_rt_amt","",0);
					return;	
				}
			} else if(comboObjects[1].GetSelectCode()== "IC") {
				//if (Value > -1 && Value != "") {
				if (Value > 0 && Value != "") {
					ComShowCodeMessage("INV00102");
					sheetObj.SetCellValue(sheetObj.GetSelectRow(), "trf_rt_amt","",0);
					return;
				}
			}
		}
		if (sheetObj.ColSaveName(Col) == "curr_cd") {
			var arrStr=comboObjects[0].GetSelectCode().split("^");
			var loclCurr=arrStr[4].substring(0,3); 
			var ofcCd=arrStr[1];
			var svrId=arrStr[7];
			var tvaFlg=sheetObj.GetCellValue(Row, 9);
			var currCds=formObject.curr_cds.value;
			if (currCds.indexOf(Value) < 0) {
				ComShowCodeMessage("INV00041", "Currency"); 
				sheetObj.SetCellValue(Row, Col,arrStr[4]+"^"+arrStr[9],0);
				return;
			}
			if (svrId == "KOR") {
				if (tvaFlg == 1 && loclCurr != Value.substring(0,3)) {
					ComShowCodeMessage("INV00118", Value.substring(0,3));
					sheetObj.SetCellValue(Row, Col,"",0);
					return;
				}
			}
			if (tvaFlg == 1) {
				sheetObj.SetCellValue(sheetObj.RowCount(), Col,Value,0);
			}
		}
		if (sheetObj.ColSaveName(Col) == "trf_rt_amt"
			|| sheetObj.ColSaveName(Col) == "rat_as_cntr_qty"
				|| sheetObj.ColSaveName(Col) == "per_tp_cd"
					|| sheetObj.ColSaveName(Col) == "curr_cd") {
				var rated_as=sheetObj.GetCellValue(sheetObj.GetSelectRow(), "rat_as_cntr_qty");
				var rate=sheetObj.GetCellValue(sheetObj.GetSelectRow(), "trf_rt_amt");
				var per=sheetObj.GetCellValue(sheetObj.GetSelectRow(), "per_tp_cd");
				var cur=sheetObj.GetCellValue(sheetObj.GetSelectRow(), "curr_cd").split(FIELDMARK);
			if (document.form.classId.value == "") {
				var point=cur[1];
			} else {
				var point=sheetObj.GetCellValue(sheetObj.GetSelectRow(), 11);
			}
			var amount=rated_as * rate;
			if(rated_as != "" && rate != "" && per != ""){
				if (point == '0' || point == undefined) {
 					sheetObj.InitCellProperty(sheetObj.GetSelectRow(), 7,{ Type:"Int",Align:"Right",Format:"NullInteger"} );
				} else {
 					sheetObj.InitCellProperty(sheetObj.GetSelectRow(), 7,{ Type:"Float",Align:"Right",Format:"NullFloat",PointCount:point} );
				}
				if (per == "PC") { 			
					sheetObj.SetCellValue(sheetObj.GetSelectRow(), 7,amount / 100,0);
				} else {
					sheetObj.SetCellValue(sheetObj.GetSelectRow(), 7,amount,0);
				}
				if (sheetObj.GetCellValue(Row, "tva_flg") == "1") {
					setChgSumTvaClick(sheetObj,Row);
				}
				setSummary();
				getExRate();
				//sheetObj.CellValue(sheetObj.SelectRow, 10) = formObject.ex_rate.value;
			} else {
				sheetObj.SetCellValue(sheetObj.GetSelectRow(), 7,"");
			}
			if (sheetObj.GetCellValue(Row, Col) == "") {
				sheetObj.SelectCell(Row, Col, false);
			}
		}
		if (sheetObj.ColSaveName(Col) == "tva_flg") {
			if (Row == 0 ){
				return;
			}
			sheetObj.SetCellEditable(Row, Col,0);
			setChgSumTvaClick(sheetObj,Row);
			setSummary();
			getExRate();
			//sheetObj.CellValue(sheetObj.SelectRow, 10) = formObject.ex_rate.value;
			sheetObj.SetCellEditable(Row, Col,1);
		}
//		if (sheetObj.ColSaveName(Col) == "trf_rt_amt"
//			|| sheetObj.ColSaveName(Col) == "rat_as_cntr_qty"
//				|| sheetObj.ColSaveName(Col) == "per_tp_cd") {
//	
//			if (sheetObj.CellValue(Row, "trf_rt_amt") != "" 
//				&& sheetObj.CellValue(Row, "rat_as_cntr_qty") != ""
//					&& sheetObj.CellValue(Row, "per_tp_cd") != "") {
//				addChgSumRateChange(sheetObj,Row);
//				setSummary();
//				getExRate();
//				sheetObj.CellValue(sheetObj.SelectRow, 10) = formObject.ex_rate.value;
//				if (sheetObj.CellValue(Row, Col) == "") {
//					sheetObj.SelectCell(Row, Col, false);
//				}
//			}	
//		}    
	}
	/**
	 * calculate Charge Sum when TVA click <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     setChgSumTvaClick(sheetObj,Row);
	 * </pre>
	 * @param {ibsheet} sheetObj
	 * @param {int} Row 
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */     	
	function setChgSumTvaClick(sheetObj,Row){
		var tvaChgCd=sheetObj.GetCellValue(sheetObj.RowCount(), "chg_cd");
		var cur=sheetObj.GetCellValue(Row, "curr_cd").split(FIELDMARK);
		var point=cur[1];
		var sheetObject1=sheetObjects[0];
		var sheetObject2=sheetObjects[1];
		var formObject=document.form;
		var rated=sheetObj.GetCellValue(Row, "trf_rt_amt");
		var rateAs=sheetObj.GetCellValue(Row, "rat_as_cntr_qty");
		var perTpCd=sheetObj.GetCellValue(Row, "per_tp_cd");
		var arrStr=comboObjects[0].GetSelectCode().split("^");
		formObject.ofc_cd.value=arrStr[1];
		var arOfcCd=arrStr[1];
		var vatChgRt=arrStr[17];
		var chgAmtSum2=0;
		if (rated != "" && rated != "0" && rateAs != "" && rateAs != "0" && perTpCd != "") {
			var tvaFlg=sheetObj.GetCellValue(sheetObj.GetSelectRow(), 9);
			var tvaFlgCnt=0;
			var chgAmt=0;
			var chgAmtSum=0;
			var chgSum=0;
			for (var i=1; i < sheetObj.RowCount()+ 1; i++) {
				if (sheetObj.GetCellValue(i, "tva_flg") == "1") {
					tvaFlgCnt++;		
					chgAmt=sheetObj.GetCellValue(i, "chg_amt") == "" ? "0" : sheetObj.GetCellValue(i, "chg_amt");
					chgAmtSum=parseFloat(chgAmtSum) + parseFloat(chgAmt);
					chgSum=parseFloat(chgSum) + parseFloat(chgAmt) * parseFloat(vatChgRt) / 100;
				}
			}
			//alert(chgAmtSum);
			
			if(tvaFlg == "1") {
				if (tvaFlgCnt >= 1) {
					if (tvaChgCd != arrStr[16]) {
						sheetObj.DataInsert(-1);
						doActionIBSheet(sheetObject1,formObject,IBSEARCH_ASYNC17);	 
					}
				}  	
				if (point == '0' || point == undefined) {
 					sheetObj.InitCellProperty(sheetObj.GetSelectRow(), 7,{ Type:"Int",Align:"Right",Format:"NullInteger"} );
				} else {
 					sheetObj.InitCellProperty(sheetObj.GetSelectRow(), 7,{ Type:"Float",Align:"Right",Format:"NullFloat",PointCount:point} );
				}
				sheetObj.SetCellValue(sheetObj.RowCount(), "chg_cd",arrStr[16] != "" ? arrStr[16] : "TVA",0);
				getExRate();
	//			sheetObj.CellValue2(sheetObj.RowCount, "inv_xch_rt") = formObject.ex_rate.value;
				sheetObj.SetCellValue(sheetObj.RowCount(), "rat_as_cntr_qty",vatChgRt,0);
				sheetObj.SetCellValue(sheetObj.RowCount(), "per_tp_cd","PC",0);
				sheetObj.SetCellValue(sheetObj.RowCount(), "curr_cd",arrStr[4]+"^"+arrStr[9],0);
				sheetObj.SetCellValue(sheetObj.RowCount(), "trf_rt_amt",chgAmtSum,0);
				chgAmtSum2=chgAmtSum * vatChgRt / 100;
				sheetObj.SetCellValue(sheetObj.RowCount(), "chg_amt",InvRound(chgAmtSum2,2),0);
				if (sheetObj.GetCellValue(sheetObj.RowCount(), "trf_rt_amt") == "0") {
					sheetObj.SetRowEditable(sheetObj.RowCount(),0);
				}
			} else if(tvaFlg == "0") {
				if (tvaFlgCnt == 0) {
					sheetObj.RowDelete(sheetObj.RowCount(), false);
				} else {
					sheetObj.SetCellValue(sheetObj.RowCount(), "trf_rt_amt",chgAmtSum,0);
					chgAmtSum2=chgAmtSum * vatChgRt / 100;
					sheetObj.SetCellValue(sheetObj.RowCount(), "chg_amt",InvRound(chgAmtSum2,2),0);
				}    			
			}
		}
	}
	/**
	 * calculate Cahrge Sum when Row delete click<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     setChgSumRowDelete();
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */    
	function setChgSumRowDelete(){
		var sheetObject1=sheetObjects[0];
		var formObject=document.form;
		var arrStr=comboObjects[0].GetSelectCode().split("^");
		var vatChgRt=arrStr[17];
		var chgCd=sheetObject1.GetCellValue(sheetObject1.RowCount(), "chg_cd");
		var chgAmt=0;
		var chgAmtSum=0;
		var chgSum=0;
		var chgAmtSum2=0;
		for(var i=1; i < sheetObject1.RowCount(); i++) {
			if (sheetObject1.GetCellValue(i, "tva_flg") == "1") {
//				chgAmt = sheetObject1.CellValue(i, "chg_amt") == "" ? "0" : sheetObject1.CellValue(i, "chg_amt");
//				chgSum = parseFloat(chgSum) + parseFloat(chgAmt) * parseFloat(vatChgRt) / 100;				
				chgAmt=sheetObject1.GetCellValue(i, "chg_amt") == "" ? "0" : sheetObject1.GetCellValue(i, "chg_amt");
				chgAmtSum=parseFloat(chgAmtSum) + parseFloat(chgAmt);
				chgSum=parseFloat(chgSum) + parseFloat(chgAmt) * parseFloat(vatChgRt) / 100;
			}    		
		}
		if (sheetObject1.RowCount()> 0 &&  chgCd == arrStr[16]) {
//			sheetObject1.CellValue2(sheetObject1.RowCount, "trf_rt_amt") = chgSum;
//			sheetObject1.CellValue2(sheetObject1.RowCount, "chg_amt") = chgSum;
			sheetObject1.SetCellValue(sheetObject1.RowCount(), "trf_rt_amt",chgAmtSum,0);
			chgAmtSum2=chgAmtSum * vatChgRt / 100;
			sheetObject1.SetCellValue(sheetObject1.RowCount(), "chg_amt",InvRound(chgAmtSum2,2),0);
		}
	}
	/**
	 * calculate Charge Sum when Rate change <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     addChgSumRateChange(sheetObj,Row);
	 * </pre>
	 * @param {ibsheet} sheetObj
	 * @param {int} Row 
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */   
	function addChgSumRateChange(sheetObj,Row){
		var sheetObject1=sheetObjects[0];
		var sheetObject2=sheetObjects[1];
		var formObject=document.form;
		var tvaChgCd=sheetObj.GetCellValue(sheetObj.RowCount(), "chg_cd");
		var rated=sheetObj.GetCellValue(Row, "trf_rt_amt");
		var rateAs=sheetObj.GetCellValue(Row, "rat_as_cntr_qty");
		var perTpCd=sheetObj.GetCellValue(Row, "per_tp_cd");
		var arrStr=comboObjects[0].GetSelectCode().split("^");
		var vatChgRt=arrStr[17];
		var invVatChgCd=arrStr[16] != "" ? arrStr[16] : "TVA";  
		if (rated != "" && rated != "0" && rateAs != "" && rateAs != "0" && perTpCd != "") {
			var tvaFlg=sheetObj.GetCellValue(sheetObj.GetSelectRow(), 9);
			var tvaFlgCnt=0;
			var chgAmt=0;
			var chgAmtSum=0;
			var chgSum=0;
			var chgAmtSum2=0;
			for (var i=1; i < sheetObj.RowCount()+ 1; i++) {
				if (sheetObj.GetCellValue(i, "tva_flg") == "1") {
					tvaFlgCnt++;					
					chgAmt=sheetObj.GetCellValue(i, "chg_amt") == "" ? "0" : sheetObj.GetCellValue(i, "chg_amt");
					chgAmtSum=parseFloat(chgAmtSum) + parseFloat(chgAmt);
					chgSum=parseFloat(chgSum) + parseFloat(chgAmt) * parseFloat(vatChgRt) / 100;
				}				
			}
			if(tvaFlg == "1") {
				if (tvaFlgCnt > 0) {
					if (tvaChgCd != invVatChgCd) {
						sheetObj.DataInsert(-1);
						doActionIBSheet(sheetObject1,formObject,IBSEARCH_ASYNC17);	
					}
				}  	
				var cur=sheetObj.GetCellValue(Row, "curr_cd").split(FIELDMARK);
				var point=cur[1];
				if (point == '0' || point == undefined) {
 					sheetObj.InitCellProperty(sheetObj.RowCount(), 7,{ Type:"Int",Align:"Right",Format:"NullInteger"} );
				} else {
 					sheetObj.InitCellProperty(sheetObj.RowCount(), 7,{ Type:"Float",Align:"Right",Format:"NullFloat",PointCount:point} );
				}
				sheetObj.SetCellValue(sheetObj.RowCount(), "chg_cd",arrStr[16] != "" ? arrStr[16] : "TVA",0);
				getExRate();
	//			sheetObj.CellValue2(sheetObj.RowCount, "inv_xch_rt") = formObject.ex_rate.value;
				sheetObj.SetCellValue(sheetObj.RowCount(), "rat_as_cntr_qty",vatChgRt,0);
				sheetObj.SetCellValue(sheetObj.RowCount(), "per_tp_cd","PC",0);
				sheetObj.SetCellValue(sheetObj.RowCount(), "curr_cd",arrStr[4]+"^"+arrStr[9],0);
				sheetObj.SetCellValue(sheetObj.RowCount(), "trf_rt_amt",chgAmtSum,0);
				chgAmtSum2=chgAmtSum * vatChgRt / 100;
				sheetObj.SetCellValue(sheetObj.RowCount(), "chg_amt",InvRound(chgAmtSum2,2),0);
				sheetObj.SetRowEditable(sheetObj.RowCount(),0);
			} 
		}
	}
	/**
	 * add VLCBB Office's Charge Sum  <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     addChgSumVlcbb(chgCd, bnd);
	 * </pre>
	 * @param {String} chgCd CHG
	 * @param {String} bnd BND
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */  
	function addChgSumVlcbb(chgCd, bnd){
		var sheetObject1=sheetObjects[0];
		var sheetObject2=sheetObjects[1];
		var formObject=document.form;
		var arrStr2=comboObjects[0].GetSelectCode().split("^");
		var tvaChgCnt=0;
		var tvaChgRow=0;
		var invVatChgCd=arrStr2[16] != "" ? arrStr2[16] : "TVA";  
		for (var i=1; i < sheetObject1.RowCount()+ 1; i++) {
			if (sheetObject1.GetCellValue(i, "chg_cd") == invVatChgCd) {
				tvaChgCnt++;	
				tvaChgRow=i;
			}
		}	 			 
		if (tvaChgCnt == 0) {
			sheetObject1.DataInsert(-1);
			doActionIBSheet(sheetObject1,formObject,IBSEARCH_ASYNC17);				
			sheetObject1.SetCellValue(sheetObject1.RowCount(), "chg_cd",chgCd,0);
			if (bnd == "I") {
				if (chgCd == "WHS") {
					sheetObject1.SetCellEditable(sheetObject1.RowCount(), "tva_flg",0);
					sheetObject1.SetCellValue(sheetObject1.RowCount(), "tva_flg","0");
				} else {
					sheetObject1.SetCellEditable(sheetObject1.RowCount(), "tva_flg",1);
					sheetObject1.SetCellValue(sheetObject1.RowCount(), "tva_flg","1");
				}
			} else {
				sheetObject1.SetCellEditable(sheetObject1.RowCount(), "tva_flg",0);
			}
		} else {	 				 
			sheetObject1.DataInsert(tvaChgRow - 1);
			doActionIBSheet(sheetObject1,formObject,IBSEARCH_ASYNC17);				
			sheetObject1.SetCellValue(tvaChgRow, "chg_cd",chgCd,0);
			if (bnd == "I" ) {
				if (chgCd == "WHS") {
					sheetObject1.SetCellEditable(tvaChgRow, "tva_flg",0);
					sheetObject1.SetCellValue(tvaChgRow, "tva_flg","0");
				} else {
					sheetObject1.SetCellEditable(tvaChgRow, "tva_flg",1);
					sheetObject1.SetCellValue(tvaChgRow, "tva_flg","1");
				}
			} else {
				sheetObject1.SetCellEditable(tvaChgRow, "tva_flg",0);
			}
		}			
		var rowCnt1=sheetObject2.RowCount();
		if (rowCnt1 == 0) {
			sheetObject2.DataInsert(-1);
			sheetObject2.SetCellValue(sheetObject2.GetSelectRow(), 1,arrStr2[4]);
			sheetObject2.SetCellValue(sheetObject2.GetSelectRow(), 4,arrStr2[4]);
		}
		sheetObject1.SetCellValue(sheetObject1.GetSelectRow(), "curr_cd",arrStr2[4]+"^"+arrStr2[9],0);
		formObject.p_chg_cd.value=chgCd;
		formObject.exist_yn.value="N";
		sheetObject1.SetCellEditable(sheetObject1.GetSelectRow(), "curr_cd",1);
		setSummary();	
		getExRate();	
	}
	/**
	 * create By Currency GRID <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     setSummary();
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */ 
	function setSummary() {		
		var sheetObject1=sheetObjects[0];
		var sheetObject2=sheetObjects[1];
		var formObject=document.form;
		var arrStr2=comboObjects[0].GetSelectCode().split("^");
		var point=arrStr2[9]
        if (point == 0) {
        	point=-1;
        }
		sheetObject2.RemoveAll();
		initSheet(sheetObject2,2,point);
		var rowCnt1=sheetObject2.RowCount();
		var rowCnt2=sheetObject1.RowCount();
		var curCnt=0;
		var curs="";
		var sums="";
		for(var j=1; j <= rowCnt2; j++){
//			sums=sums + sheetObject1.GetCellValue(j, "curr_cd")+"~"+Number(sheetObject1.GetCellValue(j, 7).replace(/,/gi, ''))+"|"; // replace 에러나서 주석 처리함
			sums=sums + sheetObject1.GetCellValue(j, "curr_cd")+"~"+Number(sheetObject1.GetCellValue(j, 7))+"|";
			if (curs.indexOf(sheetObject1.GetCellValue(j, "curr_cd")) == -1) {
				curs=curs + sheetObject1.GetCellValue(j, "curr_cd")+"@"+sheetObject1.GetCellValue(j, 11) +"|";
			} 		
		}
		var curs_item=curs.split("|");
		var curs_item2="";
		var curs_item3="";
		for (var i=0; i < curs_item.length - 1; i++) {
			curs_item2=curs_item[i].split("^");
			curs_item3=curs_item2[0].split("@");
			sheetObject2.DataInsert(-1);
			sheetObject2.SetCellValue(i+1, 1,curs_item3[0]);
			sheetObject2.SetCellValue(i+1, 4,arrStr2[4]);
			sheetObject2.SetCellValue(i+1, 6,curs_item3[1]);
		}	
		var sums_item=sums.split("|");
		var sums_item2="";
		var sums_item3="";
		for (var i=0; i < sums_item.length - 1; i++) {
			sums_item2=sums_item[i].split("~");
			sums_item3=sums_item2[0].split("^");
			for (var j=0; j < sheetObject2.RowCount(); j ++) {
				if (sheetObject2.GetCellValue(j+1, 1) == sums_item3[0] && sums_item2[1] != "") {
					if (document.form.classId.value == "") {
						if (sums_item3[1] == 0 ) {
							sheetObject2.InitCellProperty(j+1, 2,{ Type:"Int",Align:"Right",Format:"NullInteger"} );
						} else {
 							sheetObject2.InitCellProperty(j+1, 2,{ Type:"Float",Align:"Right",Format:"NullFloat",PointCount:sums_item3[1]} );
						}
					} else {
						if (sheetObject2.GetCellValue(j+1, 6) == 0 ) {
							sheetObject2.InitCellProperty(j+1, 2,{ Type:"{Type:Text",Align:"Align:Right"} );
						} else {
							sheetObject2.InitCellProperty(j+1, 2,{ Type:"{Type:Text",Align:"Align:Right"} );
						}
					}
					sheetObject2.SetCellValue(j+1, 2,Number(sheetObject2.GetCellValue(j+1, 2)) + Number(sums_item2[1]));
				}				 
			}
		}				 
	}	
	/**
	 * retrieve MRI process target B/L  <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     doRetrieve();
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */     
	function doRetrieve() {
		var sheetObject=sheetObjects[1];
		var formObject=document.form;
		if(formObject.bl_no.value != "" && auto_bl_no_flag == false){ 
			doActionIBSheet(sheetObject,formObject,IBSEARCH);
			//get due-date
			//doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC03);  
			doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC06);  	
			
		}
		if (auto_bl_no_flag) {
			auto_bl_no_flag = false;
		}
		ComBtnEnable("btn_save"); 
	}
	/**
	 * retrieve exchange rate  <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     getExRate();
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */   
	function getExRate() {
		var sheetObject1=sheetObjects[0];
		var sheetObject2=sheetObjects[1];
		var formObject=document.form;
		for (var i=0; i < sheetObject2.RowCount(); i++) {
			var arrStr2=comboObjects[0].GetSelectCode().split("^");
			formObject.curr_cd.value=sheetObject2.GetCellValue(i+1, 1);
			formObject.ofc_cd.value=arrStr2[1];
			formObject.lcl_curr.value=arrStr2[4];  
			formObject.select_row.value=i+1;  
			doActionIBSheet(sheetObject2,formObject,IBSEARCH_ASYNC19);
			for (var j=1; j <= sheetObject1.RowCount(); j++) {
				if (sheetObject1.GetCellValue(j, "curr_cd").substr(0,3) == sheetObject2.GetCellValue(i+1, "curr_cd")) {
					sheetObject1.SetCellValue(j, "inv_xch_rt",sheetObject2.GetCellValue(i+1, "inv_xch_rt"));
				}    			
			}    		
		}    
		var lclAmt=0;
		for (var k=1; k <= sheetObject2.RowCount(); k++) {
             lclAmt=lclAmt + Number(sheetObject2.GetCellValue(k, 5));
		}
		var dp_prcs_knt=formObject.dp_prcs_knt.value;
		sheetObject2.SetCellValue(sheetObject2.RowCount()+1, 5,lclAmt);
	}
	/**
	 * retrieve exchange rate, SA Date  <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     getExRateSaDate();
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */ 
	function getExRateSaDate() {
		var sheetObject=sheetObjects[1];
		var formObject=document.form;
		if (sheetObject.RowCount()> 0) {
			for (var i=0; i < sheetObject.RowCount(); i++) {
				var arrStr2=comboObjects[0].GetSelectCode().split("^");
				formObject.curr_cd.value=sheetObject.GetCellValue(i+1, 1);
				formObject.ofc_cd.value=arrStr2[1];
				formObject.lcl_curr.value=arrStr2[4];    		
				formObject.select_row.value=i+1;  
				//alert("aaaaa");
				doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC11);
				doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC06);
			}
		} else {
			var lclVvd=formObject.lcl_vvd.value;
			if (lclVvd.substring(0,4) == "CFDR" || lclVvd.substring(0,4) == "USAC") {
				formObject.sail_arr_dt.value=formObject.local_time.value.substring(0,4)+"-"
				+ formObject.local_time.value.substring(4,6)+"-"
				+ formObject.local_time.value.substring(6,8);
			} else {  
				//alert("bbbb");
				doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC12);
				doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC06);
			}
		}
		
	}  
	/**
	 * check LCL VVD <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     chkLclVvd();
	 * </pre>
	 * @param none
	 * @return Boolean
	 * @author 정휘택
	 * @version 2009.10.20
	 */     
	function chkLclVvd() {
		var formObject=document.form;
//		var revTpCd=comboObjects[1].text;
//		var revTpCd=comboObjects[1].GetSelectText();

		//Avoid entering Common VVD in LCL VVD Field 
		var lclVvd=formObject.lcl_vvd.value.substring(0,4);
		if(lclVvd == "CFDR" || lclVvd == "CNTC" || lclVvd == "COMC" ){
			ComShowCodeMessage("INV00172");
			tabObjects[0].SetSelectedIndex(0);
			return false;
		}
		
//		if (revTpCd == "EQ") {
//			if (lclVvd.length < 9) {
//				ComShowCodeMessage("INV00121");
//				return false;
//			}
//			if (lclVvd.substring(0,4) != "USAC") {
//				ComShowCodeMessage("INV00121");
//				return false;
//			}
//			if (!ComIsNumber(lclVvd.substring(4,6))) {
//				ComShowCodeMessage("INV00121");
//				return false;
//			}
//			if (!ComIsMonth(lclVvd.substring(6,8))) {
//				ComShowCodeMessage("INV00121");
//				return false;
//			}
//			if (lclVvd.substring(8,9) != "M") {
//				ComShowCodeMessage("INV00121");
//				return false;
//			}
//		}
		return true;
	}
	
	/**
	 * check svc scope <br>
	 */ 
  function chkscp() {
		var formObject=document.form;
		var lclVvd=formObject.lcl_vvd.value.substring(0,4);
		var svcscp = formObject.svc_scp_cd.value;
    //  Prevent the use of "OTH"
		if( svcscp == "OTH"){
		   if(lclVvd != "CFDR" && lclVvd != "CNTC" && lclVvd != "COMC" ){
			    ComShowCodeMessage("INV00041", "Svc Scope"); 
			    formObject.svc_scp_cd.value ="";
		   }
		}
    }	
  
	/**
	 * add combo field data on gird. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     addCellComboItem(sheetObj,comboValues,colName,isCellCombo);
	 * </pre>
	 * @param {ibsheet} sheetObj
	 * @param {String} comboValues 
	 * @param {String} colName 
	 * @param {String} isCellCombo 
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */
	function addCellComboItem(sheetObj,comboValues,colName,isCellCombo) {
		var sRow=sheetObj.GetSelectRow();
		var comboTxt="";
		var comboVal="";
		var comboItems;
		var comboItem;
		if (comboValues != undefined) {
			comboItems=comboValues.split(ROWMARK);
			for (var i=0 ; i < comboItems.length ; i++) {
				comboItem=comboItems[i].split(FIELDMARK);
				if (comboItem[0] != "") {
					comboTxt += comboItem[0];
					//comboVal += comboItem[0];
					if (comboItem[1] != undefined) {
						comboVal += comboItem[0] +"^"+ comboItem[1];
					} else {
						comboVal += comboItem[0];
					}
				}
				if (i < comboItems.length-1) {
					comboTxt += ROWMARK;
					comboVal += ROWMARK;
				}				
			}
		}
		if (isCellCombo) {
			sheetObj.CellComboItem(sRow,colName, {ComboText:comboTxt, ComboCode:comboVal} );
		}
		else {
			sheetObj.SetColProperty(colName, {ComboText:comboTxt, ComboCode:comboVal} );
		}
	}
	/**
	 * Container Info. open UI <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     openContainer();
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */      
	function openContainer() {
		ComOpenPopup('/opuscntr/FNS_INV_0098.do?pagetype=E', 700, 400, '', '0,0');    	
	}
	var tabObjects=new Array();
	var tabCnt=0 ;
	var beforetab=1;
	var sheetObjects=new Array();
	var sheetCnt=0;
	var comboObjects=new Array();
	var comboCnt=0;
	// define button click event handler */
	document.onclick=processButtonClick;
	/**
	 * event handler branch process by button name  <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     processButtonClick()
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */
	function processButtonClick(){
		var sheetObject1=sheetObjects[0];
		var sheetObject2=sheetObjects[1];
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch(srcName) {
			case "btn_retrieve":           	 	
				doActionIBSheet(sheetObject2,formObject,IBSEARCH);    
				doActionIBSheet(sheetObject2,formObject,IBSEARCH_ASYNC06);  				
				break;
			case "btn_new":
				initField();
				checkTaxCountry();  // Whether or not the invoice tax country (2017.12.08)
				break;
			case "btn_save":
				doActionIBSheet(sheetObject1,formObject,IBSAVE); 
				break;
			case "btn_add":
				var arrStr2=comboObjects[0].GetSelectCode().split("^");
				var tvaChgCnt=0;
				var tvaChgRow=0;
				var invVatChgCd=arrStr2[16] != "" ? arrStr2[16] : "TVA";  
				for (var i=1; i < sheetObject1.RowCount()+ 1; i++) {
					if (sheetObject1.GetCellValue(i, "chg_cd") == invVatChgCd) {
						tvaChgCnt++;	
						tvaChgRow=i;
					}
				}	
				if (tvaChgCnt == 0) {
					sheetObject1.DataInsert(-1);
					doActionIBSheet(sheetObject1,formObject,IBSEARCH_ASYNC17);	
					sheetObject2.SetCellValue(sheetObject2.GetSelectRow(), 1,arrStr2[4]);
				} else {	 				 
					sheetObject1.DataInsert(tvaChgRow - 1);
					doActionIBSheet(sheetObject1,formObject,IBSEARCH_ASYNC17);		
					sheetObject2.SetCellValue(sheetObject2.GetSelectRow(), 1,arrStr2[4]);
				}	
				var rowCnt1=sheetObject2.RowCount();
				if (rowCnt1 == 0) {
					sheetObject2.DataInsert(-1);
					sheetObject2.SetCellValue(sheetObject2.GetSelectRow(), 1,arrStr2[4]);
					sheetObject2.SetCellValue(sheetObject2.GetSelectRow(), 4,arrStr2[4]);
				}
				sheetObject1.SetCellValue(sheetObject1.GetSelectRow(), "curr_cd",arrStr2[4]+"^"+arrStr2[9]);
				var arrStr=comboObjects[0].GetSelectCode().split("^");
				break;
			case "btn_del":
				var arrStr=comboObjects[0].GetSelectCode().split("^");
				var tvaChgCnt=0;
				var chgCd=sheetObject1.GetCellValue(sheetObject1.GetSelectRow(), "chg_cd");
				var invVatChgCd=arrStr[16] != "" ? arrStr[16] : "TVA";  
				if (sheetObject1.RowCount()== 2 &&  chgCd != invVatChgCd) {
					for (var i=1; i < sheetObject1.RowCount()+ 1; i++) {
						if (sheetObject1.GetCellValue(i, "chg_cd") == invVatChgCd) {
							tvaChgCnt++;	 					
						}
					}
					if (tvaChgCnt == 1) {
						sheetObject1.RowDelete();
						sheetObject1.RowDelete(sheetObject1.RowCount(), false);
					} else {						
						sheetObject1.RowDelete();
					}	        		 
				} else if (chgCd != invVatChgCd) {
					sheetObject1.RowDelete();
				}	       
				setChgSumRowDelete();
				setSummary();	
				getExRate();	
				break;
			case "btn_close":
				ComClosePopup(); 
				break;   
			case "btn_auto":
				auto_bl_no_flag = true;
				doActionIBSheet(sheetObject1,formObject,IBSEARCH_ASYNC09);
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
	 * add IBSheet Object array<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     setSheetObject(sheetObj)
	 * </pre>
	 * @param {ibsheet} sheetObj
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */      
	function setSheetObject(sheet_obj){
		sheetObjects[sheetCnt++]=sheet_obj;
	}
	/** 
	 * add IBCombo Object to comboObjects array<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {IBMultiCombo} combo_obj    IBMultiCombo Object
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */
	function setComboObject(combo_obj){
		comboObjects[comboCnt++]=combo_obj;
	}         
	/**
	 * init Office Combo <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     MakeComboObject(cmbObj, arrStr);
	 * </pre>
	 * @param {ibCombo} cmbObj 
	 * @param {String}
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */      
	function MakeComboObject(cmbObj, arrStr) {
		cmbObj.RemoveAll();
		for (var i=1; i < arrStr.length; i++ ) {
			var arrStr2=arrStr[i].split("^");
			var var_ar_ofc_cd=arrStr2[1];
			cmbObj.InsertItem(i-1, var_ar_ofc_cd, arrStr[i]);
		}
		cmbObj.SetBackColor("#CCFFFD");
		cmbObj.SetDropHeight(190);
	}     
	/**
	 * init Rev. Type Combo <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     MakeComboObject2(cmbObj, arrStr);
	 * </pre>
	 * @param {ibCombo} cmbObj
	 * @param {String}
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */      
	function MakeComboObject2(cmbObj, arrStr) {
		document.form.rev_src_cds.value=arrStr;
		cmbObj.RemoveAll();
		for (var i=1; i < arrStr.length; i++ ) {
			cmbObj.InsertItem(i-1, arrStr[i], arrStr[i]);
		}
		cmbObj.SetBackColor("#CCFFFD");
		cmbObj.SetDropHeight(190);
	}  
	/**
	 * define onLoad event handler<br> 
	 * <br><b>Example :</b>
	 * <pre>
	 *     loadPage()
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */
	function loadPage() {
		sheet_container=sheetObjects[2]; 
		for(i=0;i<sheetObjects.length;i++){
			ComConfigSheet (sheetObjects[i] );
			initSheet(sheetObjects[i],i+1,-1);
			ComEndConfigSheet(sheetObjects[i]);
		}
	    resizeSheet();
		//init IBMultiCombo
		for(var k=0; k<comboObjects.length; k++){
			initCombo(comboObjects[k],k+1);
		}
		for(k=0;k<tabObjects.length;k++){
			initTab(tabObjects[k],k+1);
			tabObjects[k].SetSelectedIndex(0);
		}
		//ComBtnDisable("btn_save");         
		// open by menu
		
		if (document.form.classId.value == "") {
			getOfcRevCd();             
			document.form.bl_inv_if_dt.value=document.form.local_time.value.substring(0,4)+"-"
			+ document.form.local_time.value.substring(4,6)+"-"
			+ document.form.local_time.value.substring(6,8);
			document.form.bl_no.focus();               
			initControl();      
			// open by popup             
		} else {      
			getOfcRevCd();
			comboObjects[0].SetEnable(0);
			ComBtnDisable("btn_new");
			initControl();
			doActionIBSheet(sheetObjects[1],document.form,IBSEARCH_ASYNC08);
			getExRate();
		}
//		if (document.form.rev_src_cd.Code == "TM" || document.form.rev_src_cd.Code == "TN") {
//			document.form.eff_dt.value = document.form.local_time.value.substring(0,4)+"-"
//			+ document.form.local_time.value.substring(4,6)+"-"
//			+ document.form.local_time.value.substring(6,8);
//		}
		
		checkTaxCountry();  // Whether or not the invoice tax country (2017.12.08)
		
		setButtons();
		
	}
	/**
	 * init Field <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     initField()
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */     
	function initField() {
		var formObj = document.form;
		tabObjects[0].SetSelectedIndex(0);
		with(formObj){
			bl_no.value="";
			bkg_no.value="";
			//bkg_no_split.value = "";
			cust_cnt_cd.value="";
			cust_seq.value="";
			cust_nm.value="";
			cust_rgst_no.value="";
			cr_curr_cd.value="";
			cr_amt.value="";
			ob_cr_term_dys.value="";
			ib_cr_term_dys.value="";
			cr_clt_ofc_cd.value="";
			lcl_vvd.value="";
			svc_scp_cd.value="";
			sail_arr_dt.value="";
			trunk_vvd.value="";
			por_cd.value="";
			pol_cd.value="";
			pod_cd.value="";
			del_cd.value="";
			master_inv.value="";
			co_ref.value="";
			bkg_teu_qty.value="";
			bkg_feu_qty.value="";
			inv_ref_no.value="";
			bkg_ref_no.value="";
			si_ref_no.value="";
			due_dt.value="";  
			eff_dt.value = "";
			eff_dt_tmp.value = "";
			inv_rmk.value="";
			ar_if_no.value="";
			io_bnd_cd.value = "O";
			tmp_bl_src_no.value="";
			mst_if_no.value="";
			ComEnableObject(ida_gst_expt_cd, true); 
			ida_gst_expt_cd.checked = false;
	   	    ida_gst_expt_cd.value = "" ;
	   	    tmp_gst_expt_cd.value = "" ;
		}
		sheetObjects[0].RemoveAll();
		sheetObjects[1].RemoveAll();
		sheetObjects[2].RemoveAll();
//		ComBtnEnable("btn_ib_all");
//		ComBtnEnable("btn_ib_ats");
//		ComBtnEnable("btn_ib_dhs");
//		ComBtnEnable("btn_ib_sis");
//		ComBtnEnable("btn_ib_ahc");
//		ComBtnEnable("btn_ib_whs");
//		ComBtnEnable("btn_ib_psm");		           
//		ComBtnEnable("btn_ob_all");
//		ComBtnEnable("btn_ob_ats");
//		ComBtnEnable("btn_ob_dhs");
//		ComBtnEnable("btn_ob_bcu");
//		ComBtnEnable("btn_ob_whs");	
		getOfcRevCd();
		ComBtnDisable("btn_save"); 
		document.form.bl_no.focus();  
		//document.form.cust_cnt_cd.value = document.form.str_cnt_cd.value;
		document.form.co_ref.value=document.form.str_usr_nm.value;
		releField();
		setButtons();
	}
	/**
	 * field Disable<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     lockField()
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */   
	function lockField() {
		var formObj=document.form;
		with(formObj){
			bl_no.readOnly=true;
			cust_cnt_cd.readOnly=true;
			cust_seq.readOnly=true;
			cust_nm.readOnly=true;
			cust_rgst_no.readOnly=true;
			comboObjects[1].readOnly=true;
			cr_curr_cd.readOnly=true;
			cr_amt.readOnly=true;
			ob_cr_term_dys.readOnly=true;
			ib_cr_term_dys.readOnly=true;
			cr_clt_ofc_cd.readOnly=true;
			lcl_vvd.readOnly=true;
			svc_scp_cd.readOnly=true;
			sail_arr_dt.readOnly=true;
			trunk_vvd.readOnly=true;
			por_cd.readOnly=true;
			pol_cd.readOnly=true;
			pod_cd.readOnly=true;
			del_cd.readOnly=true;
			master_inv.readOnly=true;
			co_ref.readOnly=true;
			bkg_teu_qty.readOnly=true;
			bkg_feu_qty.readOnly=true;
			inv_ref_no.readOnly=true;
			bkg_ref_no.readOnly=true;
			si_ref_no.readOnly=true;
			due_dt.readOnly=true; 
			eff_dt.readOnly=true;
			inv_rmk.readOnly=true;
			io_bnd_cd.disabled=true;
			popup1.disabled=true;
			popup2.disabled=true;
			popup3.disabled=true;		  
			comboObjects[0].SetEnable(0);
		}
		sheetObjects[1].SetEditable(0);
		sheetObjects[0].SetEditable(0);
		sheetObjects[2].SetEditable(0);
		//comboObjects[0].Enable = false; 
		ComBtnDisable("btn_add"); 
		ComBtnDisable("btn_del"); 
	}  
	/**
	 * field Inable  <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     releField()
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */         
	function releField() {
		var formObj=document.form;
		with(formObj){
			bl_no.readOnly=false;
			cust_cnt_cd.readOnly=false;
			cust_seq.readOnly=false;
			cust_nm.readOnly=true;
			cust_rgst_no.readOnly=true;
			comboObjects[1].readOnly=false;
			cr_curr_cd.readOnly=true;
			cr_amt.readOnly=true;
			ob_cr_term_dys.readOnly=true;
			ib_cr_term_dys.readOnly=true;
			cr_clt_ofc_cd.readOnly=false;
			lcl_vvd.readOnly=false;
			svc_scp_cd.readOnly=false;
			sail_arr_dt.readOnly=true;
			trunk_vvd.readOnly=false;
			por_cd.readOnly=false;
			pol_cd.readOnly=false;
			pod_cd.readOnly=false;
			del_cd.readOnly=false;
			master_inv.readOnly=false;
			co_ref.readOnly=false;
			bkg_teu_qty.readOnly=false;
			bkg_feu_qty.readOnly=false;
			inv_ref_no.readOnly=false;
			bkg_ref_no.readOnly=false;
			si_ref_no.readOnly=false;
			due_dt.readOnly=true; 
			eff_dt.readOnly=true;
			inv_rmk.readOnly=false;
			io_bnd_cd.disabled=false;
			popup1.disabled=false;
			popup2.disabled=false;
			popup3.disabled=false;
			comboObjects[0].SetEnable=true;
			mst_if_no.readOnly=true;
			mst_if_no.className="input2";
		}
		sheetObjects[0].SetEditable(1);
		sheetObjects[1].SetEditable(1);
		sheetObjects[2].SetEditable(1);
		//comboObjects[0].Enable = true; 
		ComBtnEnable("btn_add"); 
		ComBtnEnable("btn_del"); 
		ComBtnEnable("btn_save"); 
		ComBtnEnable("btn_auto");
	}    
	/**
	 * open Customer Information Inquiry UI <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     openFnsInv0013()
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */ 	
	function openFnsInv0013() { 	
		var formObject=document.form;
		if(formObject.cust_cnt_cd.value != "" && formObject.cust_seq.value != "") {
			var param='?cust_cnt_cd='+formObject.cust_cnt_cd.value+'&cust_seq='+formObject.cust_seq.value+'&pop_yn=Y&ret_yn=Y';
			ComOpenPopup('/opuscntr/FNS_INV_0013.do' + param, 1300, 650, 'getPopData', '0,0', false, false, "", "", 0);    
		}
	}
	/**
	 * open Quick Customer Search UI <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     openFnsInv0086()
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */ 
	function openFnsInv0086() {
		var classId="FNS_INV_0086";
		var office=comboObjects[0].GetSelectText();
		ComOpenPopup('/opuscntr/FNS_INV_0086.do?office='+office, 910, 450, 'getFnsInv0086', '1,0', false, false);
	}   
	/**
	 * handling Quick Customer Search popup <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     getFnsInv0086()
	 * </pre>
	 * @param rowArray
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */    
	function getFnsInv0086(rowArray) {
		var colArray=rowArray[0];		
		var formObject=document.form;
		formObject.cust_cnt_cd.value=colArray[8];
		formObject.cust_seq.value=ComLpad(colArray[9], 6, '0');
		formObject.cust_nm.value=colArray[4];
		formObject.delt_flg.value=colArray[12] == "Delete" ? "Y" : "N";
	}    
	/** 
	 * init combo box<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 	   initCombo(comboObj, comboNo)
	 * </pre>
	 * @param {IBMultiCombo} comboObj  comboObj
	 * @param comboNo 
	 * @author 정휘택
	 * @version 2009.10.20 
	 * @version 2009.04.27
	 */
	function initCombo(comboObj, comboNo) {
		switch (comboObj.id) {
		case "ar_ofc_cd":
			with (comboObj) {
				SetColAlign(0, "left");
				SetColWidth(0, "50");
				SetMultiSelect(0);
				SetUseAutoComplete(1);
				SetDropHeight(200);
//no support[check again]CLT 				ValidChar(2,1);
				SetMaxLength(6);
			}
			break;
		}
	}
	/**
	 * initializing sheet, define header<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     initSheet(sheetObj,sheetNo,point);
	 * </pre>
	 * @param {ibsheet} sheetObj 
	 * @param {int} sheetNo 
	 * @param {int} point chg_amt
	 * @return none 
	 * @author 정휘택
	 * @version 2009.10.20     
	 */ 
	function initSheet(sheetObj,sheetNo,point) {
		var cnt=0;
		switch(sheetNo) {
		case 1:      //t1sheet1 init
            with(sheetObj){
			      var HeadTitle1=" |Seq.|CHG|Cur|Rate|Rated As|Per|Amount|Remark(s)|TVA|";
			
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
			
			      var info    = { Sort:0, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
			      InitHeaders(headers, info);
			
			      var cols = [ {Type:"Status",    Hidden:1, Width:70,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
			                   {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"seq" } ];
			                      if (document.form.classId.value == "") {
			                     	  cols.push({Type:"Combo", Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"chg_cd",           KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3 });
			                      } else {
							    	  cols.push({Type:"Combo", Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"chg_cd",           KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:3 });
							      }
							      if (document.form.classId.value == "") {
							    	  cols.push({Type:"Combo", Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"curr_cd",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3 });
							      } else {
							    	  cols.push({Type:"Combo", Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"curr_cd",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:3 });
							      }
							      if (document.form.classId.value == "") {
							    	  cols.push({Type:"Float",     Hidden:0,  Width:90,   Align:"Right",   ColMerge:0,   SaveName:"trf_rt_amt",       KeyField:1,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:1,   InsertEdit:1 });
							      } else {
							    	  cols.push({Type:"Float",     Hidden:0,  Width:90,   Align:"Right",   ColMerge:0,   SaveName:"trf_rt_amt",       KeyField:1,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 });
							      }
							      if (document.form.classId.value == "") {
							    	  cols.push({Type:"Float",     Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:"rat_as_cntr_qty",  KeyField:1,   CalcLogic:"",   Format:"NullFloat",   PointCount:3,   UpdateEdit:1,   InsertEdit:1 });
							      } else {
							    	  cols.push({Type:"Float",     Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:"rat_as_cntr_qty",  KeyField:1,   CalcLogic:"",   Format:"NullFloat",   PointCount:3,   UpdateEdit:0,   InsertEdit:0 });
							      }
							      if (document.form.classId.value == "") {
							    	  cols.push({Type:"Combo", Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"per_tp_cd",        KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:2 });
							      } else {
							    	  cols.push({Type:"Combo", Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"per_tp_cd",        KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:2 });
							      }
							      if (document.form.classId.value == "") {
							    	  cols.push({Type:"Float",     Hidden:0,  Width:150,   Align:"Right",   ColMerge:0,   SaveName:"chg_amt",          KeyField:1,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,UpdateEdit:0,   InsertEdit:0 });
							      } else {
							    	  cols.push({Type:"Float",     Hidden:0,  Width:150,   Align:"Right",   ColMerge:0,   SaveName:"chg_amt",          KeyField:1,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,UpdateEdit:0,   InsertEdit:0 });
							      }
							      if (document.form.classId.value == "") {
							    	  cols.push({Type:"Text",      Hidden:0,  Width:420,  Align:"Center",  ColMerge:0,   SaveName:"chg_rmk",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 });
							      } else {
							    	  cols.push({Type:"Text",      Hidden:0,  Width:420,  Align:"Center",  ColMerge:0,   SaveName:"chg_rmk",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
							      }
					      cols.push({Type:"CheckBox",  Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"tva_flg",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
					      cols.push({Type:"Text",      Hidden:1, Width:10,   Align:"Right",   ColMerge:0,   SaveName:"inv_xch_rt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
					      cols.push({Type:"Text",      Hidden:1, Width:10,   Align:"Right",   ColMerge:0,   SaveName:"dp_prcs_knt",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
					      cols.push({Type:"Text",      Hidden:1, Width:10,   Align:"Right",   ColMerge:0,   SaveName:"chg_seq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
					      cols.push({Type:"Text",      Hidden:1, Width:10,   Align:"Right",   ColMerge:0,   SaveName:"ar_if_ser_no",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
			
			      InitColumns(cols);			
			      SetEditable(1);
			      SetWaitImageVisible(0);
			      SetSheetHeight(182);	
			      resizeSheet();
			      SetColProperty(0 ,"chg_cd" , {AcceptKeys:"E|N" , InputCaseSensitive:1});
			      SetColProperty(0 ,"per_tp_cd" , {AcceptKeys:"E|N" , InputCaseSensitive:1});
			      SetColProperty(0 ,"curr_cd" , {AcceptKeys:"E|N" , InputCaseSensitive:1});
			      InitComboNoMatchText(false);
     }


		break;
		case 2:      //t1sheet1 init
		    with(sheetObj){
	       
			      var HeadTitle1=" |Cur.|Amount|Ex. Rate|Local Cur|Local Amount";
		
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
		
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
			      InitHeaders(headers, info);
		
			      var cols = [ {Type:"Status",    Hidden:1, Width:70,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
			             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"curr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
			            if (document.form.classId.value == "") {
			      cols.push({Type:"Float",     Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:"chg_amt",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 });
			      } else {
			      cols.push({Type:"Float",     Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:"chg_amt",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 });
			      }
			      cols.push({Type:"Text",      Hidden:0,  Width:90,   Align:"Right",   ColMerge:0,   SaveName:"inv_xch_rt",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
			      cols.push({Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"locl_curr_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
			      if (document.form.classId.value == "") {
			      cols.push({Type:"AutoSum",   Hidden:0, Width:100,  Align:"Right",   ColMerge:0,   SaveName:"local_total",   KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,UpdateEdit:0,   InsertEdit:0 });
			      } else {
			      cols.push({Type:"AutoSum",   Hidden:0, Width:100,  Align:"Right",   ColMerge:0,   SaveName:"local_total",   KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,UpdateEdit:0,   InsertEdit:0 });
			      }
			      cols.push({Type:"Text",      Hidden:1, Width:10,   Align:"Right",   ColMerge:0,   SaveName:"dp_prcs_knt",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
			 
			      InitColumns(cols);
		
			      SetEditable(1);
			      SetWaitImageVisible(0);
//			      SetSheetHeight(130);
			      resizeSheet();
	            }


		break; 
		case 3:      //Container init
            with(sheetObj){          

				var HeadTitle1=" |Cntr_tpsz_cd|Cntr_no";
				
				SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
				
				var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
				var headers = [ { Text:HeadTitle1, Align:"Center"} ];
				InitHeaders(headers, info);
				
				var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
				{Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"cntr_tpsz_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				{Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"cntr_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
				
				InitColumns(cols);
				
				SetEditable(1);
				SetWaitImageVisible(0);
				
//				SetSheetHeight(100);
				resizeSheet();
            }


		break;
		}
	}
	/**
	 * doActionIBSheet<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     doActionIBSheet(sheetObj, document.form, IBSEARCH)
	 * </pre>
	 * @param {ibsheet} sheetObj 
	 * @param {form} formObj 
	 * @param {int} sAction 
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */
	function doActionIBSheet(sheetObj,formObj,sAction) {
		sheetObj.ShowDebugMsg(false);
		switch(sAction) {
		case IBSEARCH_ASYNC10: // retrieve AR Office 
								//formObj.f_cmd.value=SEARCH02;
								formObj.f_cmd.value=SEARCH17;
						 		var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
								var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
								var arrStr=sStr.split("|");
								MakeComboObject(comboObjects[0], arrStr);
								var arrStr2=arrStr[1].split("^");
								var var_ar_ofc_cd=arrStr2[3];
//								comboObjects[0].text=var_ar_ofc_cd;
								comboObjects[0].SetSelectText(var_ar_ofc_cd);
		break;
		case IBSEARCH_ASYNC20: // customer name retrieve
								if (formObj.cust_cnt_cd.value != "" && formObj.cust_seq.value != ""){
									var arrStr2=comboObjects[0].GetSelectCode().split("^");
									
									formObj.ar_ofc_cd2.value=arrStr2[1];
									formObj.f_cmd.value=SEARCH03;
									formObj.cust_rgst_no.value="";
						 			var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
									var deltFlg=ComGetEtcData(sXml,"delt_flg");   
									if (deltFlg == undefined) {						
										formObj.delt_flg.value="Y";
										formObj.cust_nm.value="";
										formObj.cust_rgst_no.value="";
										formObj.cr_curr_cd.value="";
										formObj.cr_amt.value="";
										formObj.ob_cr_term_dys.value="";
										formObj.ib_cr_term_dys.value="";
										formObj.cr_clt_ofc_cd.value="";
										formObj.inv_cust_cnt_cd.value="";
										formObj.inv_cust_seq.value="";
										ComShowCodeMessage("INV00060");
										return;						
									} else {
										formObj.delt_flg.value=deltFlg;
									}
									var cust_cnt_cd=ComGetEtcData(sXml,"cust_cnt_cd");    
									if (cust_cnt_cd != undefined) {
										formObj.cust_cnt_cd.value=cust_cnt_cd;
									} else {
										formObj.cust_cnt_cd.value="";
									}
									var cust_seq=ComGetEtcData(sXml,"cust_seq");    
									if (cust_seq != undefined) {
										formObj.cust_seq.value=ComLpad(cust_seq, 6, '0');
									} else {
										formObj.cust_seq.value="";
									}
									var cust_nm=ComGetEtcData(sXml,"cust_eng_nm");    
									if (cust_nm != undefined) {
										formObj.cust_nm.value=cust_nm;
									} else {
										formObj.cust_nm.value="";
									}		
									var cust_rgst_no=ComGetEtcData(sXml,"cust_rgst_no");    
									if (cust_rgst_no != undefined) {
										formObj.cust_rgst_no.value=cust_rgst_no;
									} else {
										formObj.cust_rgst_no.value="";
									}
									var cr_curr_cd=ComGetEtcData(sXml,"cr_curr_cd");    
									if (cr_curr_cd != undefined) {
										formObj.cr_curr_cd.value=cr_curr_cd;
									} else {
										formObj.cr_curr_cd.value="";
									}
									var cr_amt=ComGetEtcData(sXml,"cr_amt");    
									if (cr_amt != undefined) {
										formObj.cr_amt.value=ComAddComma(cr_amt);
									} else {
										formObj.cr_amt.value="";
									}
									var ob_cr_term_dys=ComGetEtcData(sXml,"ob_cr_term_dys");    
									if (ob_cr_term_dys != undefined) {
										formObj.ob_cr_term_dys.value=ob_cr_term_dys;
									} else {
										formObj.ob_cr_term_dys.value="";
									}
									var ib_cr_term_dys=ComGetEtcData(sXml,"ib_cr_term_dys");    
									if (ib_cr_term_dys != undefined) {
										formObj.ib_cr_term_dys.value=ib_cr_term_dys;
									} else {
										formObj.ib_cr_term_dys.value="";
									}
									var cr_clt_ofc_cd=ComGetEtcData(sXml,"cr_clt_ofc_cd");    
									if (cr_clt_ofc_cd != undefined) {
										formObj.cr_clt_ofc_cd.value=cr_clt_ofc_cd;
									} else {
										formObj.cr_clt_ofc_cd.value="";
									}
								}
		break;
		case IBSEARCH_ASYNC03: // customer name retrieve
		if (formObj.cust_rgst_no.value != ""){
			var arrStr2=comboObjects[0].GetSelectCode().split("^");
			formObj.ar_ofc_cd2.value=arrStr2[1];
			formObj.f_cmd.value=SEARCH16;
			formObj.cust_cnt_cd.value="";
			formObj.cust_seq.value="";
 			var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
			var deltFlg=ComGetEtcData(sXml,"delt_flg");   
			if (deltFlg == undefined) {						
				formObj.delt_flg.value="Y";
				formObj.cust_nm.value="";
				formObj.cust_rgst_no.value="";
				formObj.cr_curr_cd.value="";
				formObj.cr_amt.value="";
				formObj.ob_cr_term_dys.value="";
				formObj.ib_cr_term_dys.value="";
				formObj.cr_clt_ofc_cd.value="";
				formObj.inv_cust_cnt_cd.value="";
				formObj.inv_cust_seq.value="";
				ComShowCodeMessage("INV00060");
				return;						
			} else {
				formObj.delt_flg.value=deltFlg;
			}
			var cust_cnt_cd=ComGetEtcData(sXml,"cust_cnt_cd");    
			if (cust_cnt_cd != undefined) {
				formObj.cust_cnt_cd.value=cust_cnt_cd;
			} else {
				formObj.cust_cnt_cd.value="";
			}
			var cust_seq=ComGetEtcData(sXml,"cust_seq");    
			if (cust_seq != undefined) {
				formObj.cust_seq.value=ComLpad(cust_seq, 6, '0');
			} else {
				formObj.cust_seq.value="";
			}
			var cust_nm=ComGetEtcData(sXml,"cust_eng_nm");    
			if (cust_nm != undefined) {
				formObj.cust_nm.value=cust_nm;
			} else {
				formObj.cust_nm.value="";
			}		
			var cust_rgst_no=ComGetEtcData(sXml,"cust_rgst_no");    
			if (cust_rgst_no != undefined) {
				formObj.cust_rgst_no.value=cust_rgst_no;
			} else {
				formObj.cust_rgst_no.value="";
			}
			var cr_curr_cd=ComGetEtcData(sXml,"cr_curr_cd");    
			if (cr_curr_cd != undefined) {
				formObj.cr_curr_cd.value=cr_curr_cd;
			} else {
				formObj.cr_curr_cd.value="";
			}
			var cr_amt=ComGetEtcData(sXml,"cr_amt");    
			if (cr_amt != undefined) {
				formObj.cr_amt.value=ComAddComma(cr_amt);
			} else {
				formObj.cr_amt.value="";
			}

			var ob_cr_term_dys=ComGetEtcData(sXml,"ob_cr_term_dys");    
			if (ob_cr_term_dys != undefined) {
				formObj.ob_cr_term_dys.value=ob_cr_term_dys;
			} else {
				formObj.ob_cr_term_dys.value="";
			}
						
			var ib_cr_term_dys=ComGetEtcData(sXml,"ib_cr_term_dys");    
			if (ib_cr_term_dys != undefined) {
				formObj.ib_cr_term_dys.value=ib_cr_term_dys;
			} else {
				formObj.ib_cr_term_dys.value="";
			}
						
			var cr_clt_ofc_cd=ComGetEtcData(sXml,"cr_clt_ofc_cd");    
			if (cr_clt_ofc_cd != undefined) {
				formObj.cr_clt_ofc_cd.value=cr_clt_ofc_cd;
			} else {
				formObj.cr_clt_ofc_cd.value="";
			}
			
		}
		break;
		case IBSEARCH_ASYNC15: // retrieve AR Office, Rev. Type 	   
				formObj.f_cmd.value=SEARCH04;
		 		var sXml=sheetObj.GetSearchData("FNS_INV_0071GS.do", FormQueryString(formObj));
				// retrieve Office 	
				var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
				var arrStr=sStr.split("|");
				MakeComboObject(comboObjects[0], arrStr);
				var arrStr2=arrStr[1].split("^");
				var var_ar_ofc_cd=arrStr2[3];
//				comboObjects[0].text=var_ar_ofc_cd;
				comboObjects[0].SetSelectText(var_ar_ofc_cd);
				// retrieve Local Time 
				var localTime=ComGetEtcData(sXml, "local_time");	
				formObj.local_time.value=localTime;
				var office_cnt_cd="";
	 			for (var i=1; i < arrStr.length; i++) {
	 				var arrStr3=arrStr[i].split("^");
		 			if (arrStr3[1] == arrStr3[3]) {
		 				office_cnt_cd=arrStr3[6].substring(0,2);
		 				formObj.office_cnt_cd.value = office_cnt_cd;
		 			}
		 		
	 			}
		break;	        	
		case IBSEARCH_ASYNC16: // Rev. Type retrieve	   
		if (document.form.classId.value == "") {
			formObj.f_cmd.value=SEARCH06;
			var arrStr2=comboObjects[0].GetSelectCode().split("^");
			formObj.rhq_cd.value=arrStr2[0];
			formObj.ofc_cd.value=arrStr2[3];
			formObj.svr_id.value=arrStr2[7];
 			var sXml=sheetObj.GetSearchData("FNS_INV_0071GS.do", FormQueryString(formObj));
			var sStr2=ComGetEtcData(sXml,"rev_src_cd");
			if (formObj.office_cnt_cd.value == "IN"){
				// 2017.07.12 RHQ만 허용되던 OC Type을 인도지역만 허용
				sStr2 = sStr2+"|OC"
			}
			var arrStr2=sStr2.split("|");
			MakeComboObject2(comboObjects[1], arrStr2);	     
//			formObj.rev_src_cd_text.value="IV";				
			rev_src_cd.SetSelectText("IV");				
		}
		break;	
		case IBSEARCH_ASYNC17: // retrieve Cur. Code 	 
			formObj.f_cmd.value=SEARCH07;
	 		var sXml=sheetObj.GetSearchData("FNS_INV_0071GS.do", FormQueryString(formObj));
			var comboValues=ComGetEtcData(sXml, "chgInfo");	
			formObj.chg_cds.value=comboValues;
			addCellComboItem(sheetObj,comboValues,"chg_cd",true);	
			var comboValues2=ComGetEtcData(sXml, "currInfo");	
			formObj.curr_cds.value=comboValues2;
			var comboItems=comboValues2.split(ROWMARK);
			sheetObj.SetCellValue(sheetObj.GetSelectRow(), "curr_cd",comboItems[1],0);
			addCellComboItem(sheetObj,comboValues2,"curr_cd",true);	
			//var comboValues3 = "| |A2|A4|BL|BX|D2|D4|D5|D7|F2|F4|F5|O2|O4|P2|P4|Q2|Q4|R2|R4|R5|R7|S2|S4|T2|T4|20|40|45|PC|";
			var comboValues3=ComGetEtcData(sXml, "perInfo");	
			formObj.per_tp_cds.value=comboValues3;
			addCellComboItem(sheetObj,comboValues3,"per_tp_cd",true);	
		break;	
		case IBSEARCH_ASYNC19: //retrieve Ex.Rate 	   
			formObj.f_cmd.value=SEARCH05;
			var arrStr2=comboObjects[0].GetSelectCode().split("^");
			formObj.svr_id.value=arrStr2[7];
	 		var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
			var ex_rate=ComGetEtcData(sXml,"ex_rate");
			var ex_rate_date=ComGetEtcData(sXml,"ex_rate_date");
			var curr=ComGetEtcData(sXml,"curr");
			var usd_exrate_type=ComGetEtcData(sXml,"usd_exrate_type");
			var third_exrate_type=ComGetEtcData(sXml,"third_exrate_type");
			formObj.usd_exrate_type.value=usd_exrate_type;
			formObj.third_exrate_type.value=third_exrate_type;
			formObj.ex_rate_date.value=ex_rate_date;
			formObj.ex_rate.value=ex_rate;
			var select_row=formObj.select_row.value;
			// Locl 과 chg curr이 동일한 경우 환율이 누락되는 Case 보완
			 if(ex_rate != 1 && sheetObj.GetCellValue(select_row,1) == sheetObj.GetCellValue(select_row,4)){
				 ex_rate = 1 ; 
			 }
			sheetObj.SetCellValue(select_row, 3,ex_rate);
			var arrStr2=comboObjects[0].GetSelectCode().split("^");
			var dp_prcs_knt=arrStr2[9];
			formObj.dp_prcs_knt.value=dp_prcs_knt;
			if (dp_prcs_knt == '0') {
	 			sheetObj.InitCellProperty(select_row, 5,{ Type:"Int",Align:"Right",Format:"NullInteger"} );
			} else {
	 			sheetObj.InitCellProperty(select_row, 5,{ Type:"Float",Align:"Right",Format:"NullFloat",PointCount:dp_prcs_knt} );
			}
			sheetObj.SetCellValue(select_row, 5,Number(ComReplaceStr(sheetObj.GetCellValue(select_row, 2), ",", "")) * ex_rate);
		break;
		case IBSEARCH_ASYNC11: // retrieve Ex.Rate, Sa Date 
			formObj.f_cmd.value=SEARCH09;
			var arrStr2=comboObjects[0].GetSelectCode().split("^");
			formObj.svr_id.value=arrStr2[7];
	 		var sXml=sheetObj.GetSearchData("FNS_INV_0071GS.do", FormQueryString(formObj));
			var ex_rate=ComGetEtcData(sXml,"ex_rate");
			var ex_rate_date=ComGetEtcData(sXml,"ex_rate_date");
			var curr=ComGetEtcData(sXml,"curr");
			var usd_exrate_type=ComGetEtcData(sXml,"usd_exrate_type");
			var third_exrate_type=ComGetEtcData(sXml,"third_exrate_type");	
			formObj.usd_exrate_type.value=usd_exrate_type;
			formObj.third_exrate_type.value=third_exrate_type;
			formObj.ex_rate_date.value=ex_rate_date;
			var select_row=formObj.select_row.value;
//			 Locl 과 chg curr이 동일한 경우 환율이 누락되는 Case 보완 2018.02.05
			 if(sheetObj.GetCellValue(select_row, 1) == formObj.lcl_curr.value){
				 ex_rate = 1 ; 
			 }
			 sheetObj.SetCellValue(select_row, 3,ex_rate);
			for (var j=1; j <= sheetObjects[0].RowCount(); j++) {
				if (sheetObjects[0].GetCellValue(j, "curr_cd").substr(0,3) == sheetObj.GetCellValue(select_row, "curr_cd")) {
					sheetObjects[0].SetCellValue(j, "inv_xch_rt",ex_rate);
				}    			
			}   
			//sheetObjects[0].SetCellValue(sheetObjects[0].GetSelectRow(), "inv_xch_rt",ex_rate);
			var arrStr2=comboObjects[0].GetSelectCode().split("^");
			var dp_prcs_knt=arrStr2[9];
			formObj.dp_prcs_knt.value=dp_prcs_knt;
			if (dp_prcs_knt == '0') {
	 			sheetObj.InitCellProperty(select_row, 5,{ Type:"Int",Align:"Right",Format:"NullInteger"} );
			} else {
	 			sheetObj.InitCellProperty(select_row, 5,{ Type:"Float",Align:"Right",Format:"NullFloat",PointCount:dp_prcs_knt} );
			}
			sheetObj.SetCellValue(select_row, 5,Number(ComReplaceStr(sheetObj.GetCellValue(select_row, 2), ",", "")) * ex_rate);
			var sa_date=ComGetEtcData(sXml,"sa_date");
			var lclVvd=formObj.lcl_vvd.value;
			if (lclVvd.substring(0,4) == "CFDR" || lclVvd.substring(0,4) == "USAC") {
				formObj.sail_arr_dt.value=formObj.local_time.value.substring(0,4)+"-"
				+ formObj.local_time.value.substring(4,6)+"-"
				+ formObj.local_time.value.substring(6,8);
			} else {  
				formObj.sail_arr_dt.value=sa_date;
			}
		break;
		case IBSEARCH_ASYNC12: // retrieve Sa Date 	
		formObj.vvd.value=formObj.lcl_vvd.value;		        
		formObj.bnd.value=formObj.io_bnd_cd.value;
		if(formObj.bnd.value == "I") {
			formObj.port.value=formObj.pod_cd.value;
		} else {
			formObj.port.value=formObj.pol_cd.value;
		}		        
		formObj.f_cmd.value=SEARCH07;
 		var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
		var sail_arr_dt=ComGetEtcData(sXml,"sail_arr_dt");
		formObj.sail_arr_dt.value=sail_arr_dt;
		break;
		case IBSEARCH: //retrieve                
		if(validateForm(sheetObj,formObj,sAction)) {
			var arrStr2=comboObjects[0].GetSelectCode().split("^");
			formObj.rhq_cd.value=arrStr2[0];
			formObj.ofc_cd.value=arrStr2[1];
			formObj.svr_id.value=arrStr2[7];
			formObj.loc_cd.value=arrStr2[6];
			formObj.f_cmd.value=SEARCH;
			ComOpenWait(true);
 			var sXml=sheetObj.GetSearchData("FNS_INV_0071GS.do", FormQueryString(formObj));
			ComOpenWait(false);
			var cust_ref_no3=ComGetEtcData(sXml,"cust_ref_no3");
			var act_cust_seq=ComGetEtcData(sXml,"act_cust_seq");
			var cust_ref_no1=ComGetEtcData(sXml,"cust_ref_no1");
			var inv_cust_cnt_cd=ComGetEtcData(sXml,"inv_cust_cnt_cd");
			var cust_ref_no2=ComGetEtcData(sXml,"cust_ref_no2");
			var pol_cd=ComGetEtcData(sXml,"pol_cd");
			var bkg_feu_qty=ComGetEtcData(sXml,"bkg_feu_qty");     
			var inv_cust_seq=ComGetEtcData(sXml,"inv_cust_seq");
			var pagerows=ComGetEtcData(sXml,"pagerows"); 
			var sail_arr_dt=ComGetEtcData(sXml,"sail_arr_dt");
			var ibflag=ComGetEtcData(sXml,"ibflag");
			var io_bnd_cd=ComGetEtcData(sXml,"io_bnd_cd");
			var bkg_no=ComGetEtcData(sXml,"bkg_no");
			var locl_curr_cd=ComGetEtcData(sXml,"locl_curr_cd");
			var master_inv=ComGetEtcData(sXml,"master_inv");
			var act_cust_cnt_cd=ComGetEtcData(sXml,"act_cust_cnt_cd");     
			var bkg_teu_qty=ComGetEtcData(sXml,"bkg_teu_qty");
			var due_dt=ComGetEtcData(sXml,"due_dt"); 
			var gl_eff_dt=ComGetEtcData(sXml,"gl_eff_dt"); 
			var svc_scp_cd=ComGetEtcData(sXml,"svc_scp_cd");
			var del_cd=ComGetEtcData(sXml,"del_cd");
			var por_cd=ComGetEtcData(sXml,"por_cd");
			var bl_src_no=ComGetEtcData(sXml,"bl_src_no");
			var pod_cd=ComGetEtcData(sXml,"pod_cd");     
			var cust_cr_flg=ComGetEtcData(sXml,"cust_cr_flg");
			var lcl_vvd=ComGetEtcData(sXml,"lcl_vvd");
			var trunk_vvd=ComGetEtcData(sXml,"trunk_vvd"); 
			var rev_tp_cd=ComGetEtcData(sXml,"rev_tp_cd"); 
			var var_rev_src_cd=ComGetEtcData(sXml,"rev_src_cd"); 
			var inv_svc_scp_cd=ComGetEtcData(sXml,"inv_svc_scp_cd");
			var cust_nm=ComGetEtcData(sXml,"cust_eng_nm");  			        		        	
			var cust_rgst_no=ComGetEtcData(sXml,"cust_rgst_no");			        	
			var cr_curr_cd=ComGetEtcData(sXml,"cr_curr_cd");  			        	
			var cr_amt=ComGetEtcData(sXml,"cr_amt");  			        	
			var ob_cr_term_dys=ComGetEtcData(sXml,"ob_cr_term_dys"); 			        	
			var ib_cr_term_dys=ComGetEtcData(sXml,"ib_cr_term_dys"); 			        	
			var cr_clt_ofc_cd=ComGetEtcData(sXml,"cr_clt_ofc_cd");   
			var delt_flg=ComGetEtcData(sXml,"delt_flg");  
			var ots_pay_cd=ComGetEtcData(sXml,"ots_pay_cd");   
			var org_inv_no=ComGetEtcData(sXml,"org_inv_no");
			var ida_gst_expt_cd=ComGetEtcData(sXml,"ida_gst_expt_cd");
			var cntr_if_no=ComGetEtcData(sXml,"cntr_if_no");
			
			if ((lcl_vvd != undefined && lcl_vvd != "") && (ots_pay_cd == "" || ots_pay_cd == null || ots_pay_cd == undefined) && (org_inv_no == null || org_inv_no == "" || org_inv_no == undefined)) {
				formObj.lcl_vvd.value=lcl_vvd;	 		           
				formObj.svc_scp_cd.value=svc_scp_cd;
				formObj.io_bnd_cd.value=io_bnd_cd;	 		            
				formObj.sail_arr_dt.value=sail_arr_dt;	 		            
				formObj.trunk_vvd.value=trunk_vvd;
				formObj.por_cd.value=por_cd;
				formObj.pol_cd.value=pol_cd;
				formObj.pod_cd.value=pod_cd;
				formObj.del_cd.value=del_cd;	 		            
				formObj.master_inv.value=master_inv;
				formObj.bkg_teu_qty.value=bkg_teu_qty;
				formObj.bkg_feu_qty.value=bkg_feu_qty;	
				formObj.inv_ref_no.value=cust_ref_no1;	
				formObj.bkg_ref_no.value=cust_ref_no2;
				formObj.si_ref_no.value=cust_ref_no3;
				formObj.due_dt.value=due_dt;	
				formObj.eff_dt.value=gl_eff_dt;	
				formObj.eff_dt_tmp.value=gl_eff_dt;	
				formObj.cust_cnt_cd.value=act_cust_cnt_cd;
				formObj.cust_seq.value=act_cust_seq;
				formObj.inv_svc_scp_cd.value=inv_svc_scp_cd;
				if (delt_flg != undefined && delt_flg != "Y") {
					//formObj.cust_cnt_cd.value = act_cust_cnt_cd;
					//formObj.cust_seq.value = act_cust_seq;		 		        	
					formObj.cust_nm.value=cust_nm;
					formObj.cust_rgst_no.value=cust_rgst_no;
					formObj.cr_curr_cd.value=cr_curr_cd;
					formObj.cr_amt.value=ComAddComma(cr_amt);
					formObj.ob_cr_term_dys.value=ob_cr_term_dys;
					formObj.ib_cr_term_dys.value=ib_cr_term_dys;
					formObj.cr_clt_ofc_cd.value=cr_clt_ofc_cd;
				}
				formObj.bl_no.value=bl_src_no;
				formObj.bkg_no.value=bkg_no;
				formObj.tmp_bl_src_no.value = "";
				formObj.inv_cust_cnt_cd.value=inv_cust_cnt_cd;
				formObj.inv_cust_seq.value=inv_cust_seq;
				formObj.cntr_if_no.value = cntr_if_no;
				
				if(ida_gst_expt_cd == "E" ){
			        formObj.ida_gst_expt_cd.checked = true;
			        formObj.ida_gst_expt_cd.value = ida_gst_expt_cd ;
			        formObj.tmp_gst_expt_cd.value = ida_gst_expt_cd ;
			     }else{
	   	            formObj.ida_gst_expt_cd.checked = false;
	   	            formObj.ida_gst_expt_cd.value = "" ;
	   	            formObj.tmp_gst_expt_cd.value = "" ;
	             }
	            ComEnableObject(formObj.ida_gst_expt_cd, false); 
				sheetObjects[2].LoadSearchData(sXml,{Sync:1} );
				for ( var i=0; i < sheetObjects[2].RowCount(); i++) {
					var row=i + 1;
					sheetObjects[2].SetCellValue(row, 0,"I",0);
				}
			} else {
				formObj.lcl_vvd.value="";	 		           
				formObj.svc_scp_cd.value="";
				formObj.io_bnd_cd.value="";	 		            
				formObj.sail_arr_dt.value="";	 		            
				formObj.trunk_vvd.value="";
				formObj.por_cd.value="";
				formObj.pol_cd.value="";
				formObj.pod_cd.value="";
				formObj.del_cd.value=""; 		            
				formObj.master_inv.value="";
				formObj.bkg_teu_qty.value="";
				formObj.bkg_feu_qty.value="";	
				formObj.inv_ref_no.value="";	
				formObj.bkg_ref_no.value="";
				formObj.si_ref_no.value="";
				formObj.due_dt.value="";
				formObj.eff_dt.value="";
				formObj.inv_cust_cnt_cd.value="";
				formObj.inv_cust_seq.value="";
				formObj.ida_gst_expt_cd.value = "" ;
				formObj.cntr_if_no.value = "" ;
				sheetObjects[2].RemoveAll();
				
				if(ComShowCodeConfirm("INV00070")) {
					formObj.bnd.value="O";	
					formObj.io_bnd_cd.value="O";
				} else {
					formObj.bnd.value="I";	
					formObj.io_bnd_cd.value="I";	 //JHJ 2017-06
				}
				
				formObj.f_cmd.value=SEARCH05;
				ComOpenWait(true);
 				sXml=sheetObj.GetSearchData("FNS_INV_0071GS.do", FormQueryString(formObj));
				ComOpenWait(false);
				var cust_ref_no3=ComGetEtcData(sXml,"cust_ref_no3");
				//var act_cust_seq = ComGetEtcData(sXml,"act_cust_seq");
				//var act_cust_seq = "";
				var cust_ref_no1=ComGetEtcData(sXml,"cust_ref_no1");
				var inv_cust_cnt_cd=ComGetEtcData(sXml,"inv_cust_cnt_cd");
				var cust_ref_no2=ComGetEtcData(sXml,"cust_ref_no2");
				var pol_cd=ComGetEtcData(sXml,"pol_cd");
				var bkg_feu_qty=ComGetEtcData(sXml,"bkg_feu_qty");     
				var inv_cust_seq=ComGetEtcData(sXml,"inv_cust_seq");
				var pagerows=ComGetEtcData(sXml,"pagerows"); 
				var sail_arr_dt=ComGetEtcData(sXml,"sail_arr_dt");
				var ibflag=ComGetEtcData(sXml,"ibflag");
				var io_bnd_cd = ComGetEtcData(sXml,"io_bnd_cd");
				var bkg_no=ComGetEtcData(sXml,"bkg_no");
				var locl_curr_cd=ComGetEtcData(sXml,"locl_curr_cd");
				var master_inv=ComGetEtcData(sXml,"master_inv");
				//var act_cust_cnt_cd = ComGetEtcData(sXml,"act_cust_cnt_cd");     
				//var act_cust_cnt_cd = "";
				var bkg_teu_qty=ComGetEtcData(sXml,"bkg_teu_qty");
				var due_dt=ComGetEtcData(sXml,"due_dt"); 
				var gl_eff_dt=ComGetEtcData(sXml,"gl_eff_dt");
				var svc_scp_cd=ComGetEtcData(sXml,"svc_scp_cd");
				var del_cd=ComGetEtcData(sXml,"del_cd");
				var por_cd=ComGetEtcData(sXml,"por_cd");
				var bl_src_no=ComGetEtcData(sXml,"bl_src_no");
				var pod_cd=ComGetEtcData(sXml,"pod_cd");     
				var cust_cr_flg=ComGetEtcData(sXml,"cust_cr_flg");
				var lcl_vvd=ComGetEtcData(sXml,"lcl_vvd");
				var trunk_vvd=ComGetEtcData(sXml,"trunk_vvd"); 
				var rev_tp_cd=ComGetEtcData(sXml,"rev_tp_cd"); 
				var var_rev_src_cd=ComGetEtcData(sXml,"rev_src_cd");
				var cust_nm="";  			        		        	
				var cust_rgst_no="";			        	
				var cr_curr_cd="";  			        	
				var cr_amt=""; 			        	
				var ob_cr_term_dys="";			        	
				var ib_cr_term_dys=""; 			        	
				var cr_clt_ofc_cd="";  
				
				if (lcl_vvd != undefined && lcl_vvd != "") {
					formObj.lcl_vvd.value=lcl_vvd;	 		           
					formObj.svc_scp_cd.value=svc_scp_cd;
					formObj.io_bnd_cd.value = io_bnd_cd;	 		            
					formObj.sail_arr_dt.value=sail_arr_dt;	 		            
					formObj.trunk_vvd.value=trunk_vvd;
					formObj.por_cd.value=por_cd;
					formObj.pol_cd.value=pol_cd;
					formObj.pod_cd.value=pod_cd;
					formObj.del_cd.value=del_cd;	 		            
					formObj.master_inv.value=master_inv;
					formObj.bkg_teu_qty.value=bkg_teu_qty;
					formObj.bkg_feu_qty.value=bkg_feu_qty;	
					formObj.inv_ref_no.value=cust_ref_no1;	
					formObj.bkg_ref_no.value=cust_ref_no2;
					formObj.si_ref_no.value=cust_ref_no3;
					formObj.due_dt.value=due_dt;	
					formObj.eff_dt.value=gl_eff_dt;
					formObj.eff_dt_tmp.value=gl_eff_dt;	
					//formObj.cust_cnt_cd.value = act_cust_cnt_cd;
					//formObj.cust_seq.value = act_cust_seq;		 		        	
					formObj.cust_nm.value=cust_nm;
					formObj.cust_rgst_no.value=cust_rgst_no;
					formObj.cr_curr_cd.value=cr_curr_cd;
					formObj.cr_amt.value=ComAddComma(cr_amt);
					formObj.ob_cr_term_dys.value=ob_cr_term_dys;
					formObj.ib_cr_term_dys.value=ib_cr_term_dys;
					formObj.cr_clt_ofc_cd.value=cr_clt_ofc_cd;
					formObj.bl_no.value=bl_src_no;
					formObj.bkg_no.value=bkg_no;
					formObj.inv_cust_cnt_cd.value=inv_cust_cnt_cd;
					formObj.inv_cust_seq.value=inv_cust_seq;
					sheetObjects[2].LoadSearchData(sXml,{Sync:1} );
					for ( var i=0; i < sheetObjects[2].RowCount(); i++) {
						var row=i + 1;
						sheetObjects[2].SetCellValue(row, 0,"I",0);
					}
				} else {
					if ((ots_pay_cd != undefined && ots_pay_cd != "") || (org_inv_no != undefined && org_inv_no != "")) {
						formObj.bl_no.value="";
					}
					
					formObj.lcl_vvd.value="";	 		           
					formObj.svc_scp_cd.value="";

					formObj.io_bnd_cd.value = formObj.bnd.value ;            
					formObj.sail_arr_dt.value="";	 		            
					formObj.trunk_vvd.value="";
					formObj.por_cd.value="";
					formObj.pol_cd.value="";
					formObj.pod_cd.value="";
					formObj.del_cd.value=""; 		            
					formObj.master_inv.value="";
					formObj.bkg_teu_qty.value="";
					formObj.bkg_feu_qty.value="";	
					formObj.inv_ref_no.value="";	
					formObj.bkg_ref_no.value="";
					formObj.si_ref_no.value="";
					formObj.due_dt.value="";	
					formObj.eff_dt.value="";
					formObj.inv_cust_cnt_cd.value="";
					formObj.inv_cust_seq.value="";
					formObj.ida_gst_expt_cd.value = "" ;
				}	        		
			}	 		 		            
		}
		setButtons();
		break;
		case IBSEARCH_ASYNC08:
			if (formObj.ar_if_no.value != "") {		
				formObj.f_cmd.value=SEARCH10;
				//ComOpenWait(true);
 				var sXml=sheetObj.GetSearchData("FNS_INV_0071GS.do", FormQueryString(formObj));
				var arrXml=sXml.split("|$$|");
				//ComOpenWait(false);
				if (arrXml.length > 0) {
					sheetObjects[1].LoadSearchData(arrXml[0],{Sync:1} );
				}
				if (arrXml.length > 1) {
					sheetObjects[0].LoadSearchData(arrXml[1],{Sync:1} );
				}
				if (arrXml.length > 2) {
					sheetObjects[2].LoadSearchData(arrXml[2],{Sync:1} );
				}
				formObj.f_cmd.value=SEARCH07;
 				var sXml=sheetObjects[0].GetSearchData("FNS_INV_0071GS.do", FormQueryString(formObj));
				var comboValues2=ComGetEtcData(sXml, "currInfo");	
				formObj.curr_cds.value=comboValues2;
				var comboItems=comboValues2.split(ROWMARK);				
				addCellComboItem(sheetObjects[0],comboValues2,"curr_cd",true);	
				formObj.bl_no.value=ComGetEtcData(arrXml[0],"bl_src_no"); 
				formObj.value=ComGetEtcData(arrXml[0],"act_cust_cnt_cd"); 
				formObj.cust_seq.value=ComGetEtcData(arrXml[0],"act_cust_seq"); 
				formObj.cust_nm.value=ComGetEtcData(arrXml[0],"cust_nm"); 
				formObj.cust_rgst_no.value=ComGetEtcData(arrXml[0],"cust_rgst_no");  	        		 
				formObj.cr_curr_cd.value=ComGetEtcData(arrXml[0],"cr_curr_cd"); 
				formObj.cr_amt.value=ComAddComma(ComGetEtcData(arrXml[0],"cr_amt")); 
				formObj.ob_cr_term_dys.value=ComGetEtcData(arrXml[0],"ob_cr_term_dys"); 
				formObj.ib_cr_term_dys.value=ComGetEtcData(arrXml[0],"ib_cr_term_dys"); 
				formObj.cr_clt_ofc_cd.value=ComGetEtcData(arrXml[0],"cr_clt_ofc_cd"); 
				formObj.lcl_vvd.value=ComGetEtcData(arrXml[0],"vsl_cd")
				+ ComGetEtcData(arrXml[0],"skd_voy_no")
				+ ComGetEtcData(arrXml[0],"skd_dir_cd");
				formObj.svc_scp_cd.value=ComGetEtcData(arrXml[0],"svc_scp_cd");
				formObj.io_bnd_cd.value=ComGetEtcData(arrXml[0],"io_bnd_cd");
				formObj.sail_arr_dt.value=ComGetEtcData(arrXml[0],"sail_arr_dt");
				formObj.trunk_vvd.value=ComGetEtcData(arrXml[0],"trnk_vsl_cd")
				+ ComGetEtcData(arrXml[0],"trnk_skd_voy_no")
				+ ComGetEtcData(arrXml[0],"trnk_skd_dir_cd");
				formObj.por_cd.value=ComGetEtcData(arrXml[0],"por_cd");
				formObj.pol_cd.value=ComGetEtcData(arrXml[0],"pol_cd");
				formObj.pod_cd.value=ComGetEtcData(arrXml[0],"pod_cd");
				formObj.del_cd.value=ComGetEtcData(arrXml[0],"del_cd");
				formObj.master_inv.value=ComGetEtcData(arrXml[0],"mst_bl_no");
				formObj.co_ref.value=ComGetEtcData(arrXml[0],"co_stf_ctnt");
				formObj.bkg_teu_qty.value=ComGetEtcData(arrXml[0],"bkg_teu_qty");
				formObj.bkg_feu_qty.value=ComGetEtcData(arrXml[0],"bkg_feu_qty");
				formObj.inv_ref_no.value=ComGetEtcData(arrXml[0],"inv_ref_no");
				formObj.bkg_ref_no.value=ComGetEtcData(arrXml[0],"bkg_ref_no");
				formObj.si_ref_no.value=ComGetEtcData(arrXml[0],"si_ref_no");
				formObj.inv_rmk.value=ComGetEtcData(arrXml[0],"inv_rmk");
				formObj.due_dt.value=ComGetEtcData(arrXml[0],"due_dt");
				formObj.eff_dt.value=ComGetEtcData(arrXml[0],"gl_eff_dt");
				formObj.eff_dt_tmp.value=ComGetEtcData(arrXml[0],"gl_eff_dt");
				formObj.bl_inv_if_dt.value=ComGetEtcData(arrXml[0],"bl_inv_if_dt");
//				comboObjects[0].text=ComGetEtcData(arrXml[0],"ar_ofc_cd");	
				comboObjects[0].SetSelectText(ComGetEtcData(arrXml[0],"ar_ofc_cd"));
				formObj.delt_flg.value=ComGetEtcData(arrXml[0],"delt_flg");		
				formObj.bl_inv_cfm_dt.value=ComGetEtcData(arrXml[0],"bl_inv_cfm_dt");
				formObj.inv_svc_scp_cd.value=ComGetEtcData(arrXml[0],"inv_svc_scp_cd");				
				if (formObj.bl_inv_cfm_dt.value != "") {						 
					with(formObj){
						bl_no.readOnly=true;
						cust_cnt_cd.readOnly=true;
						cust_seq.readOnly=true;
						cust_nm.readOnly=true;
						cust_rgst_no.readOnly=true;
						comboObjects[1].readOnly=true;
						cr_curr_cd.readOnly=true;
						cr_amt.readOnly=true;
						ob_cr_term_dys.readOnly=true;
						ib_cr_term_dys.readOnly=true;
						cr_clt_ofc_cd.readOnly=true;
						lcl_vvd.readOnly=true;
						svc_scp_cd.readOnly=true;
						sail_arr_dt.readOnly=true;
						trunk_vvd.readOnly=true;
						por_cd.readOnly=true;
						pol_cd.readOnly=true;
						pod_cd.readOnly=true;
						del_cd.readOnly=true;
						master_inv.readOnly=true;
						co_ref.readOnly=true;
						bkg_teu_qty.readOnly=true;
						bkg_feu_qty.readOnly=true;
						inv_ref_no.readOnly=false;
						bkg_ref_no.readOnly=true;
						si_ref_no.readOnly=true;
						due_dt.readOnly=true; 
						eff_dt.readOnly=true;
						inv_rmk.readOnly=false;
						io_bnd_cd.disabled=true;
						popup1.disabled=true;
						popup2.disabled=true;
						popup3.disabled=true;		  
						comboObjects[0].SetEnable(0);
						comboObjects[1].SetEnable(0);
					}
					document.getElementById("bl_no").className="input2";
					document.getElementById("cust_cnt_cd").className="input2";
					document.getElementById("cust_seq").className="input2";
					document.getElementById("lcl_vvd").className="input2";
					document.getElementById("svc_scp_cd").className="input2";
					document.getElementById("trunk_vvd").className="input2";
					document.getElementById("por_cd").className="input2";
					document.getElementById("pol_cd").className="input2";
					document.getElementById("pod_cd").className="input2";
					document.getElementById("del_cd").className="input2";
					document.getElementById("master_inv").className="input2";
					document.getElementById("co_ref").className="input2";
					document.getElementById("bkg_teu_qty").className="input2";
					document.getElementById("bkg_feu_qty").className="input2";
					document.getElementById("io_bnd_cd").className="input2";
					document.getElementById("cust_rgst_no").className="input2";
					document.getElementById("eff_dt").className="input2";
					sheetObjects[1].SetEditable(0);
					sheetObjects[0].SetEditable(0);
					sheetObjects[2].SetEditable(0);
					ComBtnDisable("btn_add"); 
					ComBtnDisable("btn_del"); 
				} else {
					document.form.eff_dt.className="input1";
					document.form.eff_dt.readOnly=false;
					if (comboObjects[1].GetSelectCode()== "TM" || comboObjects[1].GetSelectCode()== "TN") {
						document.form.eff_dt.value=document.form.local_time.value.substring(0,4)+"-"
						+ document.form.local_time.value.substring(4,6)+"-"
						+ document.form.local_time.value.substring(6,8);
					}
					//2010-03-31
					sheetObjects[1].SetEditable(0);
					sheetObjects[0].SetEditable(1);
					sheetObjects[2].SetEditable(0);
					for(var i=1; i < sheetObjects[0].RowCount()+ 1; i++) {
						var arrStr=comboObjects[0].GetSelectCode().split("^");
						var chgCd=sheetObjects[0].GetCellValue(i,"chg_cd");
						var ofcCd=arrStr[1];
						var svrId=arrStr[7];
						var invVatChgCd=arrStr[16];
						if (invVatChgCd != "" && chgCd != "TVA") {
							sheetObjects[0].SetCellEditable(i, "tva_flg",1);
						} else {
							sheetObjects[0].SetCellEditable(i, "tva_flg",0);
						}	
						sheetObjects[0].SetCellValue(i,"curr_cd",sheetObjects[0].GetCellValue(i,"curr_cd")+"^"+sheetObjects[0].GetCellValue(i,"dp_prcs_knt"),0);
						sheetObj.SetCellValue(i, "chg_amt",ComTrimAll(sheetObj.GetCellValue(i, "chg_amt"),","),0);
						point=sheetObjects[0].GetCellValue(i,"dp_prcs_knt");
						if (point == '0' || point == undefined) {
 							sheetObjects[0].InitCellProperty(i, 7,{ Type:"Int",Align:"Right",Format:"NullInteger"} );
						} else {
 							sheetObjects[0].InitCellProperty(i, 7,{ Type:"Float",Align:"Right",Format:"NullFloat",PointCount:point} );
						}
					}					
					ComBtnDisable("btn_add"); 
					ComBtnDisable("btn_del"); 
				}
			}	
			break;
		case IBSAVE:        //save	
		if(validateForm2(sheetObj,formObj,sAction) && chkLclVvd()) {
			InvOpenWait(true, true); 
			ComBtnDisable("btn_save"); 
			ComBtnDisable("btn_new");
			ComBtnDisable("btn_auto");
			ComBtnDisable("btn_add");
			ComBtnDisable("btn_del");
		
			//check chg_cd - curr start
			var arrStr=comboObjects[0].GetSelectCode().split("^");
			var ofcCd=arrStr[1];
			var arrStr2=comboObjects[0].GetSelectCode().split("^");
			formObj.ofc_cd.value=arrStr2[1];
			formObj.svr_id.value=arrStr2[7];
			formObj.lcl_curr.value=arrStr2[4];
			formObj.f_cmd.value=MULTI;
			var sParam=FormQueryString(formObj);					
			var sParam1=sheetObjects[0].GetSaveString(true);
			var sParam2=sheetObjects[2].GetSaveString(true);
			if (sParam1 == "") {				
				return; 
			} else {
				sParam1=ComSetPrifix(sParam1, "sheet1_");
				sParam=sParam + "&" + sParam1;
			}
			if (sParam2 == "") {				
				//return; 
			} else {
				sParam2=ComSetPrifix(sParam2, "sheet2_");
				sParam=sParam + "&" + sParam2;
			}	
////			sParam=sheetObjects[0].GetSaveString(true) +"&" + FormQueryString(formObj);
			
//			var sXml=sheetObjects[1].GetSaveData("FNS_INV_0071GS.do", sParam );
// 			sheetObjects[1].LoadSaveData(sXml);
 			 setTimeout( function () {
 	        	var sXml=sheetObjects[1].GetSaveData("FNS_INV_0071GS.do", sParam );
 	        	sheetObjects[1].LoadSaveData(sXml);
				var arIfNo=ComGetEtcData(sXml,"ar_if_no");
				var dueDt=ComGetEtcData(sXml,"due_dt");
				var effDt=ComGetEtcData(sXml,"eff_dt");
			
				if (arIfNo != undefined && arIfNo != "") {
					formObj.ar_if_no.value=arIfNo; 
				} 
				if (dueDt != undefined && dueDt != "") {
					formObj.due_dt.value=dueDt.substring(0,4)+"-"+dueDt.substring(4,6)+"-"+dueDt.substring(6,8); 
				} 
				if (effDt != undefined && dueDt != "") {
					formObj.eff_dt.value=effDt.substring(0,4)+"-"+effDt.substring(4,6)+"-"+effDt.substring(6,8); 
				}

 	        	InvOpenWait(false, true);
 	        	ComBtnEnable("btn_new");
 	     
					if(formObj.office_cnt_cd.value =="IN" &&arIfNo != undefined && arIfNo != ""){
						sheetObjects[0].RemoveAll();
						sheetObjects[1].RemoveAll();
					    doActionIBSheet(sheetObjects[1],document.form,IBSEARCH_ASYNC01);
					} 			
	

					var state=ComGetEtcData(sXml,ComWebKey.Trans_Result_Key); 
					formObj.state.value=state;
					
					if (state == "F") {
						ComBtnEnable("btn_save"); 
						ComBtnEnable("btn_add");
						ComBtnEnable("btn_del");
							
						if(formObj.classId.value != "FNS_INV_0071"){
							formObj.ar_if_no.value=""; 
						}
					}else{
						if(formObj.classId.value == "FNS_INV_0071"){
							ComClosePopup(); 
						}
					}
 	 	   } , 100);
    	} 
		break;
		case IBSEARCH_ASYNC13: // retrieve Local Time    
		formObj.f_cmd.value=SEARCH11;		
		var arrStr=comboObjects[0].GetSelectCode().split("^");
		formObj.ofc_cd.value=arrStr[1];
 		var sXml=sheetObj.GetSearchData("FNS_INV_0071GS.do", FormQueryString(formObj));
		var localTime=ComGetEtcData(sXml, "local_time");	
		formObj.local_time.value=localTime;	
		break;	  
		case IBSEARCH_ASYNC14: //retrieve Block Charge    
		formObj.f_cmd.value=SEARCH12;		
 		var sXml=sheetObj.GetSearchData("FNS_INV_0071GS.do", FormQueryString(formObj));
		var blckChg=ComGetEtcData(sXml, "blck_chg");	
		formObj.blck_chg.value=blckChg;	
		break;	  	
		case IBSEARCH_ASYNC09: //retrieve auto BL No 
			var tmpBlSrcNo=formObj.tmp_bl_src_no.value;
			var arOfcCd="";
			var arHdQtrOfcCd="";
			if (tmpBlSrcNo == '') {
				formObj.f_cmd.value=MULTI01;
				// OFFICE Info
				var arrStr2=comboObjects[0].GetSelectCode().split("^");
				arHdQtrOfcCd=arrStr2[0];
				arOfcCd=arrStr2[1];
	 			formObj.ofc_cd.value=arOfcCd;
	 			var sXml=sheetObj.GetSaveData("FNS_INV_0071GS.do", FormQueryString(formObj));
				var blMaxSeq=ComGetEtcData(sXml,"bl_max_seq");
				if (blMaxSeq != undefined && blMaxSeq != "") {
					formObj.bl_no.value=blMaxSeq;
					formObj.tmp_bl_src_no.value=blMaxSeq;
					formObj.bl_no.focus();
				}
				else {
					ComShowMessage(ComGetMsg('INV00095'));
				}
			}
			else {
				formObj.bl_no.value=tmpBlSrcNo;
				formObj.bl_no.focus();
			}			
		break;		
		case IBINSERT:      // insert
		break;
		case IBSEARCH_ASYNC05:
		formObj.f_cmd.value=SEARCH13;		   
 		var sXml=sheetObj.GetSearchData("FNS_INV_0071GS.do", FormQueryString(formObj));
		var ivaRate=ComGetEtcData(sXml, "iva_rate");	
		formObj.iva_rate.value=ivaRate;
		break;
		case IBSEARCH_ASYNC01: //retrieve include India GST Charge
			if (formObj.ar_if_no.value != "") {	
				formObj.f_cmd.value=SEARCH01;	
				var sXml=sheetObj.GetSearchData("FNS_INV_0071GS.do", FormQueryString(formObj));
				var arrXml=sXml.split("|$$|");
				if (arrXml.length > 0) {
					sheetObjects[0].LoadSearchData(arrXml[0],{Sync:1} );
				}
				if (arrXml.length > 1) {
					sheetObjects[1].LoadSearchData(arrXml[1],{Sync:1} );
				}
			
				for(var i=1; i < sheetObjects[0].RowCount()+ 1; i++) {
				     sheetObjects[0].InitCellProperty(i, "chg_cd",{ Type:"Text"} );
					 sheetObjects[0].InitCellProperty(i, "curr_cd",{ Type:"Text"} );
					 sheetObjects[0].InitCellProperty(i, "per_tp_cd",{ Type:"Text"} );
				}
			}
		break;	
		case IBSEARCH_ASYNC18: // customer name retrieve
			var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
			formObj.ar_ofc_cd2.value=arrStr2[1];
			formObj.f_cmd.value=SEARCH02;
	 		var sXml=sheetObj.GetSearchData("FNS_INV_0071GS.do", FormQueryString(formObj));
			var sStr=ComGetEtcData(sXml,"tax_cnt_flg");
			formObj.tax_cnt_flg.value=sStr;		
        break; 
        
		case IBSEARCH_ASYNC06: // customer name retrieve
			var arrStr2=comboObjects[0].GetSelectCode().split("^");				
			formObj.ar_ofc_cd2.value=arrStr2[1];	
			formObj.f_cmd.value=SEARCH16;
	 		var sXml=sheetObj.GetSearchData("FNS_INV_0071GS.do", FormQueryString(formObj));
			// retrieve due date 	
			var dueDt=ComGetEtcData(sXml,"due_date");
			var crCltOfcCd=ComGetEtcData(sXml,"cr_clt_ofc_cd");
			var ibCrTermDys=ComGetEtcData(sXml,"ib_cr_term_dys");
			var obCrTermDys=ComGetEtcData(sXml,"ob_cr_term_dys");
			var crAmt=ComGetEtcData(sXml,"cr_amt");
			var crCurrCd=ComGetEtcData(sXml,"cr_curr_cd");
			
			//alert(dueDt);
			if (dueDt != undefined) {
				formObj.due_dt.value=dueDt;
			} else {
				formObj.due_dt.value="";
			}

			if (crCltOfcCd != undefined) {
				formObj.cr_clt_ofc_cd.value=crCltOfcCd;
			} else {
				formObj.cr_clt_ofc_cd.value="";
			}
			
			if (ibCrTermDys != undefined) {
				formObj.ib_cr_term_dys.value=ibCrTermDys;
			} else {
				formObj.ib_cr_term_dys.value="";
			}
			
			if (obCrTermDys != undefined) {
				formObj.ob_cr_term_dys.value=obCrTermDys;
			} else {
				formObj.ob_cr_term_dys.value="";
			}
			
			if (crAmt != undefined) {
				formObj.cr_amt.value=crAmt;
			} else {
				formObj.cr_amt.value="";
			}
			
			if (crCurrCd != undefined) {
				formObj.cr_curr_cd.value=crCurrCd;
			} else {
				formObj.cr_curr_cd.value="";
			}
			
        break; 
        
		}
	}
	function chkChgCurr(){
		var formObject=document.form;
		var chg_cd="";
		var curr_cd="";		
		for (var i=1; i<=sheetObjects[0].RowCount(); i++) {
			chg_cd=sheetObjects[0].GetCellText(i,"chg_cd");
			curr_cd=sheetObjects[0].GetCellText(i,"curr_cd");
			formObject.exist_yn.value="N";
			formObject.p_chg_cd.value=chg_cd;
		}
		return true;
	}
	/**
	 * add IBTab Object to array <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     setTabObject(tab_obj)
	 * </pre>
	 * @param {ibtab} tab_obj
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */      
	function setTabObject(tab_obj){
		tabObjects[tabCnt++]=tab_obj;
	}
	/**
	 * init Tab <br> 
	 * <br><b>Example :</b>
	 * <pre>
	 *     initTab(tabObj, tabNo)
	 * </pre>
	 * @param {ibtab} tabObj 
	 * @param {int} tabNo  
	 * @return none 
	 * @author 정휘택
	 * @version 2009.10.20     
	 */       
	function initTab(tabObj , tabNo) {
		switch(tabNo) {
		case 1:
			with (tabObj) {
				var cnt=0 ;
					InsertItem( "Information" , "");
					InsertItem( "Charge" , "");
			}
			break;
		}
	}
	/**
	 * Tab click event<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     tab1_OnChange(tabObj, nItem);
	 * </pre>
	 * @param {ibtab} tabObj 
	 * @param {int} nItem 
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */        
	function tab1_OnChange(tabObj, nItem)
	{
		var objs=document.all.item("tabLayer");
		objs[nItem].style.display="Inline";		
		//--------------- this is important! --------------------------//
		for(var i = 0; i<objs.length; i++){
			  if(i != nItem){
			   objs[i].style.display="none";
			   objs[beforetab].style.zIndex=objs[nItem].style.zIndex - 1 ;
			  }
			}
		//------------------------------------------------------//
		beforetab=nItem;
	    resizeSheet();
	} 
	/**
	 * validateForm <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     validateForm(sheetObj, formObj, sAction)
	 * </pre>
	 * @param {ibsheet} sheetObj 
	 * @param {form} formObj 
	 * @param {int} sAction 
	 * @return boolean
	 * @author 정휘택
	 * @version 2009.10.20
	 */
	function validateForm(sheetObj,formObj,sAction){
		with(formObj){
	        	 if(formObj.bl_no.value != "") {        	 
			         var v_bl_no=bl_no.value;
			         var sum=0;
			         var v1=0;
			         if(v_bl_no.length < 6) {
			        	 ComShowCodeMessage("COM12114", "B/L No.");
			        	 bl_no.focus();
			        	 return false;
			         } else if(v_bl_no.length=12){
			        	 for(var i=0; i < v_bl_no.length - 1; i++){
			        		 if(v_bl_no.charAt(i) >= 0 && v_bl_no.charAt(i) <= 9){
			        			 sum=sum + parseInt(v_bl_no.charAt(i));
			        		 } else {
			        			 if(v_bl_no.charAt(i).charCodeAt(0) >= "A".charCodeAt(0) && v_bl_no.charAt(i).charCodeAt(0) <= "Z".charCodeAt(0)){
			        				 v1=v_bl_no.charAt(i).charCodeAt(0) - 64;
			        				 if(String(v1).length != 1){
			        					 v1=parseInt(String(v1).charAt(0)) + parseInt(String(v1).charAt(1));   
			        				 }
			        				 sum=sum + v1;            				 
			        			 } else {
			        				 ComShowCodeMessage("COM12114", "B/L No.");
			        	        	 bl_no.focus();
			        	        	 return false;
			        			 }        			 
			        		 }        		 
			        	 } // for        	 
			         }
//			         var bl_ck=v_bl_no.charAt(11);
//			         var bl_rtn=sum % 7; 
//			         var rev_src=comboObjects[1].GetSelectCode()
//			         if(parseInt(bl_ck) != bl_rtn && parseInt(bl_ck) != bl_rtn + 1 && rev_src != "TM"){
//			        	 ComShowCodeMessage("COM12114", "B/L No.");
//			        	 bl_no.focus();
//			        	 return false;        	 
//			         }
	        	 }
	        	 if(formObj.bl_no.value == "" && formObj.bkg_no.value == ""){
	        		 ComShowCodeMessage("COM12114", "B/L No. or BKG No.");
	        		 return false;   
	        	 }
			       	 
		}
		return true;
	}
	

	
	
	/**
	 * validateForm2 <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     validateForm2(sheetObj, formObj, sAction)
	 * </pre>
	 * @param {ibsheet} sheetObj
	 * @param {form} formObj
	 * @param {int} sAction
	 * @return boolean
	 * @author 정휘택
	 * @version 2009.10.20
	 */
	function validateForm2(sheetObj,formObj,sAction){	  
		with(formObj){ 	  
			
			//if (document.form.classId.value == "") {
			if (!chrgChk()) {
				return false;
			}
			//}
			if( formObj.cust_cnt_cd.value == "" ){  
				tabObjects[0].SetSelectedIndex(0);
				formObj.cust_cnt_cd.focus();
				ComShowCodeMessage("INV00004");
				return false;
			}
			if( formObj.cust_seq.value == "" ){  
				tabObjects[0].SetSelectedIndex(0);
				formObj.cust_seq.focus();
				ComShowCodeMessage("INV00004");
				return false;
			}
			//2016.05.20 Rep.Customer인 경우 저장 불가
			var arrStr2=comboObjects[0].GetSelectCode().split("^");
			var repCustCntCd ="";
			var repCustSeq ="";
			repCustCntCd=arrStr2[10];
			repCustSeq=arrStr2[11];
			if(repCustCntCd != "" && repCustSeq != ""){
				if(formObj.cust_cnt_cd.value == repCustCntCd && formObj.cust_seq.value == repCustSeq){
					tabObjects[0].SetSelectedIndex(0);
					formObj.cust_seq.focus();
					ComShowCodeMessage("INV00168");
					return false;
				}
			}
			if (formObj.delt_flg.value == "Y") {
				ComShowCodeMessage("INV00060");
				return;						
			}	    	  
			if( formObj.lcl_vvd.value == "" ){  
				tabObjects[0].SetSelectedIndex(0);
				formObj.lcl_vvd.focus();
				ComShowCodeMessage("INV00004");
				return false;
			}
			if( formObj.sail_arr_dt.value == "" ){  
				tabObjects[0].SetSelectedIndex(0);
				formObj.lcl_vvd.focus();
				ComShowCodeMessage("INV00007");
				return false;
			}
			chkscp();
			if( formObj.svc_scp_cd.value == "" ){  
				tabObjects[0].SetSelectedIndex(0);
				formObj.svc_scp_cd.focus();
				ComShowCodeMessage("INV00004");
				return false;
			}
						
			if( formObj.io_bnd_cd.value == "" ){  
				tabObjects[0].SetSelectedIndex(0);
				formObj.io_bnd_cd.focus();
				ComShowCodeMessage("INV00004");
				return false;
			}
			if( formObj.pol_cd.value == "" ){  
				tabObjects[0].SetSelectedIndex(0);
				formObj.pol_cd.focus();
				ComShowCodeMessage("INV00004");
				return false;
			}
			if( formObj.pod_cd.value == "" ){  
				tabObjects[0].SetSelectedIndex(0);
				formObj.pod_cd.focus();
				ComShowCodeMessage("INV00004");
				return false;
			}
			if( formObj.sail_arr_dt.value == "" ){  
				ComShowCodeMessage("INV00011");
				return false;
			}
			if(sheetObj.RowCount()< 1){
				ComShowCodeMessage("INV00072");
				return false;        		 
			}
			for(var i=1; i < sheetObj.RowCount()+ 1; i++) {
				//CHG
				if (sheetObj.GetCellValue(i,2) == "" || sheetObj.GetCellValue(i,2) == " ") {
					ComShowCodeMessage("INV00004");
					return false;
				}
				//CUR
				if (sheetObj.GetCellValue(i,3) == "" || sheetObj.GetCellValue(i,3) == " ") {
					ComShowCodeMessage("INV00004");
					return false;
				}
				//rate
				if (sheetObj.GetCellValue(i,4) == "" || sheetObj.GetCellValue(i,4) == "0") {
					ComShowCodeMessage("INV00004");
					return false;
				}
				//rated as
				if (sheetObj.GetCellValue(i,5) == "" || sheetObj.GetCellValue(i,5) == "0") {
					ComShowCodeMessage("INV00004");
					return false;
				}
				//PER
				if (sheetObj.GetCellValue(i,6) == "" || sheetObj.GetCellValue(i,6) == " ") {
					ComShowCodeMessage("INV00004");
					return false;
				}
				if (sheetObj.GetCellValue(i,7) == "0") {
					ComShowCodeMessage("INV00004");
					return false;
				}
                 //  2018.02.06 local curr 환율 0 방지
				if ((sheetObj.GetCellValue(i,3).substring(0,3) == formObj.lcl_curr.value) && sheetObj.GetCellValue(i, "inv_xch_rt") != 1 ) {
					sheetObj.SetCellValue(i, "inv_xch_rt", 1);
				}
				
			}
			if( formObj.bl_no.value == "" ){  
				ComShowCodeMessage("INV00004");
				return false;
			}
			if( formObj.cust_cnt_cd.value == "" ){  
				ComShowCodeMessage("INV00004");
				return false;
			}
			if( formObj.cust_seq.value == "" ){  
				ComShowCodeMessage("INV00004");
				return false;
			}
			if( comboObjects[1].GetSelectCode()== "" ){
				ComShowCodeMessage("INV00004");
				return false;
			}
			if(comboObjects[1].GetSelectCode()== "IV"){
				var cnt=0;
				var arrStr=comboObjects[0].GetSelectCode().split("^");
				formObj.ofc_cd.value=arrStr[1];
				for(var i=1; i < sheetObj.RowCount()+ 1; i++) {
					if (sheetObj.GetCellValue(i, "trf_rt_amt") < 0) {
						cnt++;	    				  
					}
					formObj.p_chg_cd.value=sheetObj.GetCellValue(i, "chg_cd");
					doActionIBSheet(sheetObj,formObj,IBSEARCH_ASYNC14);	
					if (formObj.blck_chg.value != "") {
						ComShowCodeMessage("INV00114");
						sheetObj.SetCellValue(i, "chg_cd","",0);
						return;
					}
				}
				if (cnt > 0) {
					ComShowCodeMessage("INV00101");
					return false;
				}
			}
			if(comboObjects[1].GetSelectCode()== "IC"){
				var cnt=0;
				for(var i=1; i < sheetObj.RowCount()+ 1; i++) {
					//if (sheetObj.CellValue(i, "trf_rt_amt") > -1) {
					if (sheetObj.GetCellValue(i, "trf_rt_amt") > 0) {
						cnt++;	    				  
					}
				}
				if (cnt > 0) {
					ComShowCodeMessage("INV00102");
					return false;
				}
			}
			
			if(comboObjects[1].GetSelectCode()== "OS"){
				
				if(ComIsEmpty(formObj.master_inv)){
					ComShowCodeMessage("INV00171");
					return false;					
				}	
				
				formObj.f_cmd.value=SEARCH14;
				var sXml=sheetObj.GetSearchData("FNS_INV_0071GS.do", FormQueryString(formObj));
				var blNoYN = ComGetEtcData(sXml,"bl_no_yn");
				if(blNoYN == "N") {
					
					formObj.f_cmd.value=SEARCH15;
				 	sXml=sheetObj.GetSearchData("FNS_INV_0071GS.do", FormQueryString(formObj));
				 	var orgInvYN = ComGetEtcData(sXml,"org_inv_yn");						
					if(orgInvYN == "N") {
						ComShowCodeMessage("INV00170");
						return false;
					}				
					
				} else {
					ComShowCodeMessage("INV00169");
					return false;
				}			
				
			}
			
			//2015.07.16 It is only possible to input one of X-charges (XLP,XBS,XAD,XBA) by IY Cho
			if(formObj.office_cnt_cd.value =="TH"){
				var x_cnt=0;
				var strTHLocalChgList = InvGetTHLocalChgList( sheetObj );
				
				
				for(var i=1; i < sheetObj.RowCount()+ 1; i++) {
					var chgCd = sheetObj.GetCellValue(i, "chg_cd");
					if (strTHLocalChgList.indexOf(chgCd) > -1) {
					//if (sheetObj.GetCellValue(i, "chg_cd") == "XLP" || sheetObj.GetCellValue(i, "chg_cd") == "XBS" || sheetObj.GetCellValue(i, "chg_cd") == "XAD" || sheetObj.GetCellValue(i, "chg_cd") == "XBA") {
						x_cnt++;	    				  
					}
				}
				
				
				if(x_cnt > 1){
					ComShowCodeMessage("INV00164", InvReplaceAll(strTHLocalChgList,"|", ","));
					return false;
				}
			}
			//India  check
			if(formObj.office_cnt_cd.value =="IN"){
				if( formObj.io_bnd_cd.value == "I" && formObj.del_cd.value == "" ){  
					ComShowCodeMessage("INV00176","DEL");
					return false;
				}
				
				if( formObj.io_bnd_cd.value == "O" && formObj.por_cd.value == "" ){  
					ComShowCodeMessage("INV00176","POR");
					return false;
				}
				
				// GST 계산을 위해서 환율이 없는 경우를 제한.
				var ex_cnt=0;
				for(var k=1; k < sheetObjects[1].RowCount()+ 1; k++) {
					if (Number(sheetObjects[1].GetCellValue(k, "inv_xch_rt")) == 0 ||sheetObjects[1].GetCellValue(k, "inv_xch_rt")== "" || sheetObjects[1].GetCellValue(k, "inv_xch_rt")== "0") {
						 ex_cnt++;	    				  
					}
				 }
				if(ex_cnt > 0){
					ComShowCodeMessage("INV00098");
					return false;
				}

			}
		}

		return true;
	}
	/**
	 * set VLCBB Charge button<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     setButtons();
	 * </pre>
	 * @param none
	 * @return none
	 * @author 정휘택
	 * @version 2009.10.20
	 */   	  
	function setButtons() {
		var formObj=document.form;	
		var arrStr=comboObjects[0].GetSelectCode().split("^");
		var ofcCd=arrStr[1];
		var ioBndCd=formObj.io_bnd_cd.value;
//		document.all.btn_layer_ob.style.display="none";
//		document.all.btn_layer_ib.style.display="none";
	}
	
	function resizeSheet(){
//		ComResizeSheet(sheetObjects[0]);
		ComResizeSheet(sheetObjects[1]);
	}
	
	/**India GST 면제*/
	function fn_ida_gst_expt_cd(){
		
		 if(document.form.ida_gst_expt_cd.checked ){
			 document.form.ida_gst_expt_cd.value =  "E";
	     }else{
	   	   document.form.ida_gst_expt_cd.value =  ""; 
	     }

	}
	
//	function sheet2_OnSaveEnd(sheetObj, ErrMsg) {
//
//		InvOpenWait(false, true); 		
//		
//        if (ErrMsg != "") {
//        	return;
//        } else {
//           ComBtnDisable("btn_save");
//        }
//    }	
	
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
		/*******************************************************/
		var formObject=document.form;
		 doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC18);
		 if(formObject.tax_cnt_flg.value == "Y") {
		     document.getElementById('tax_exp_mn').style.display="block";
		     document.getElementById('tax_exp_chk').style.display="block";
		 } else{
		     document.getElementById('tax_exp_mn').style.display="none";
		     document.getElementById('tax_exp_chk').style.display="none";
		 }
		 formObject.tax_exp_chk.checked = false;
		 formObject.tax_exp_flg.value = "N";
	}
