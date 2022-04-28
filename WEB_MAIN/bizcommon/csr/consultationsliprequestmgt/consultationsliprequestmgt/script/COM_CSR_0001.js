/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_CSR_0001.jsp
*@FileTitle  : CSR Creation - Summary
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/27
=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
					MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
					OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
    var tabObjects=new Array();
    var tabCnt=0;
    var beforetab=1;
    var sheetObjects=new Array();
    var sheetCnt=0;
    var comboObjects=new Array();
    var comboCnt=0;
    //For not to occur the onchange event at IBCombo in case of clicking New button click.
    var gNew=false;
    var gCurRow=0;
    var prefix="sheet1_";
    // Event handler processing by button click event */
    document.onclick=processButtonClick;
    // Event handler processing by button name */
    function processButtonClick() {
    	var sheetObject1=sheetObjects[0];
    	var formObject=document.form;
    	try {
    		var cal=new ComCalendar();
    		var srcName=ComGetEvent("name");
    		switch (srcName) {
			case "btns_vndr":
				var param='';
				ComOpenPopupWithTarget('/opuscntr/COM_ENS_0C1.do', 700, 550, '2:vndr_seq|4:vndr_nm', '1,0,1,1,1', true);
				break;
    		case "btn_retrieve":
    			doActionIBSheet(sheetObject1, formObject, IBSEARCH);
    			break;
			case "btns_calendar1": //Calendar button
				var cal=new ComCalendar();
	         	cal.select(formObject.inv_cfm_dt, 'yyyy-MM-dd');
	        break; 
    		case "btn_new":
    			sheetObject1.RemoveAll();
    			//setDate();
    			document.form.vndr_seq.value="";
    			document.form.vndr_nm.value="";
    			document.form.inv_cfm_dt.value="";
    		break;
    		case "btn_save":
    			doActionIBSheet(sheetObject1, formObject, IBSAVE);
    		break;
    		case "btn_downExcel":
    			if(sheetObject1.RowCount() < 1){//no data
    				ComShowCodeMessage("COM132501");
        	    }else{
        	    	sheetObject1.Down2Excel();
        	    }
    		break;
			case "btn_detail":
				if(sheetObject1.RowCount() >0){
					retrieve_detail();
				}
				break;
    		} // end switch
    	} catch (e) {
    		if (e == "[object Error]") {
    			ComShowCodeMessage('CSR90002');
    		} else {
    			ComShowMessage(e);
    		}
    	}
    }
    function setDate(){
  		var today=new Date();
  		var y=today.getFullYear().toString();
  		var m=today.getMonth()+1;
  		var d=today.getDate();
  		if(m<10){
  			m="0"+m;
  		}
  		if(d<10){
  			d="0"+d;
  		}
  		document.form.inv_cfm_dt.value=y+"-"+m+"-"+d; 
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
	function retrieve_detail(){ 
		if(sheetObjects[0].GetSelectRow()==0){
			//showErrMessage(getMsg('CSR25017'))
			return false;	
		}
		if(sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(), 0) == "" || sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(), 1) =="" || sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(), 2) =="" || sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(), 3) ==""){
			//showErrMessage(getMsg('CSR25017'))
			return false;
		}
		document.form.inv_sub_sys_cd.value=sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),prefix+"inv_sub_sys_cd");
		var inv_cfm_dt=document.form.inv_cfm_dt.value;
		var vndr_seq=sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(), prefix+"vndr_no");
		var vndr_seq_name=encodeURI(sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(), prefix+"vndr_seq_name"));
		var cnt_inv=sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(), prefix+"cnt_inv");
		var curr_cd=sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(), prefix+"inv_curr_cd");
		var total_amt=sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(), prefix+"total_amt");
		var iss_dt=sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(), prefix+"inv_iss_dt");
		var rcv_dt=sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(), prefix+"inv_rcv_dt");
		var gen_pay_term_cd=sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(), prefix+"gen_pay_term_cd");
		var gen_pay_term_desc=sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(), prefix+"gen_pay_term_desc");
		var payment_due_dt=sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(), prefix+"payment_due_dt");
		var pay_term_tp_cd=sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(), prefix+"pay_term_tp_cd");
		//2009-11-23
		var pso_trns_slp_ctnt=sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(), prefix+"pso_trns_slp_ctnt");
		//var pay_group_cd 		= getElementValue(document.form, 'radio', 'pay_group_cd');
		var cost_ofc_cd=sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(), prefix+"cost_ofc_cd");
		var inv_sub_sys_cd=document.form.inv_sub_sys_cd.value;
//		formObj.bundle_radio[2].checked
		if (document.form.inv_sub_sys_cd.value == "PSO" ){
			if (document.form.asanogb[0].checked){
				document.form.asa_gubun.value="";
			} else {
				document.form.asa_gubun.value="O";
			}
		} else {
			document.form.asa_gubun.value="O";
		}
		document.form.cost_ofc_cd.value=cost_ofc_cd;
		form.f_cmd.value=SEARCH01;
		var sXml=sheetObjects[0].GetSearchData("COM_CSR_0001GS.do" , FormQueryString(form));
        var so_if_cd=ComGetEtcData(sXml,"so_if_cd");
        var ap_ofc_cd=ComGetEtcData(sXml,"ap_ofc_cd"); 
        /*
        if(so_if_cd == 'O'){	//ASA
        	document.form.asanogb[0].checked=false;
    		document.form.asanogb[1].checked=true;
        	asaNoGb=getElementValue(document.form, 'radio', 'asanogb');
        }else{ //A/P
        	document.form.asanogb[0].checked=true;
    		document.form.asanogb[1].checked=false;
        	asaNoGb='A/P';
        }
		*/
        var pgmNo="pgmNo="+document.form.pgm_no.value+"&"; 
        var parentPgmNo="parentPgmNo="+document.form.parent_pgm_no.value; 

        asaNoGb=getElementValue(document.form, 'radio', 'asanogb');
		var detailUrl="COM_CSR_0002.do?"+pgmNo+parentPgmNo+"&inv_cfm_dt="+inv_cfm_dt+ "&vndr_seq="+vndr_seq+ "&vndr_seq_name="+vndr_seq_name+ "&cnt_inv="+cnt_inv+ "&curr_cd="+curr_cd+ "&total_amt="+total_amt+ "&iss_dt="+iss_dt+ "&rcv_dt="+rcv_dt+ "&gen_pay_term_cd="+gen_pay_term_cd+ "&gen_pay_term_desc="+gen_pay_term_desc+ "&payment_due_dt="+payment_due_dt+ "&pay_term_tp_cd="+pay_term_tp_cd+ "&cost_ofc_cd="+cost_ofc_cd+ "&apOfcCd="+ap_ofc_cd+ "&asanogb="+asaNoGb+ "&inv_sub_sys_cd="+inv_sub_sys_cd+ "&pso_trns_slp_ctnt="+pso_trns_slp_ctnt;		
		location.href=detailUrl;
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
        form.f_cmd.value=SEARCH01;
    	sheetObjects[0].SetWaitImageVisible(0);
		var sXml=sheetObjects[0].GetSearchData("COM_CSR_0001GS.do" , FormQueryString(form));
        var so_if_cd=ComGetEtcData(sXml,"so_if_cd");
        if(so_if_cd == 'O'){
        	document.form.asanogb[0].checked=false;
        	document.form.asanogb[1].checked=true;
        }else{ 
        	document.form.asanogb[0].checked=true;
        	document.form.asanogb[1].checked=false;
        }
     	initControl();
     	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
     	
     	// Disable button Detail
     	//ComBtnDisable('btn_detail');
     }
	 function sheet1_OnLoadFinish(sheetObj) {
         //doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
      }
    /**
     * Loading dynamically the event of HTML control in the page<br>
     * Calling this function in loadPage(), and then initializing IBSheet object
     * @param sheetObj, sheetNo
     **/
 	function initControl() {
 		var formObject=document.form;
 		//axon_event.addListenerFormat('keypress', 'obj_keypress', 	formObject);            //- setting the onkeypress event to the forms that contain dataformat
 		axon_event.addListenerFormat('change',	 'obj_change',	formObject); //change event.
     }
 	function obj_change(){
		var obj=ComGetEvent();
		var formObj=document.form;
		var sheetObj=sheetObjects[0];
		if ( ComTrim(obj.value) != "" ) {
			switch(ComGetEvent("name")) {
	    		case "vndr_seq":
	        		doActionIBSheet(sheetObj, formObj , IBSEARCH_ASYNC01);
				   	break;
			}
	    } else {
			switch(ComGetEvent("name")) {
	    		case "vndr_seq":
	        		formObj.vndr_nm.value="";
				   	break;
			}
		}
	}
	function obj_keypress(){
	    obj=ComGetEvent();
	    if(obj.dataformat == null) return;
	    window.defaultStatus=obj.dataformat;
	    switch(ComGetEvent("dataformat")) {
	        case "saupja":
	            ComKeyOnlyNumber(obj);
	            break;
	        case "int":
				ComKeyOnlyNumber(obj);
	            break;
	        case "float":
	            ComKeyOnlyNumber(obj, "-.");
	            break;
	        case "eng":
	            ComKeyOnlyAlphabet(); break;
	        case "engup":
	            if(obj.name=="vndr_seq"){
					ComKeyOnlyNumber(obj);
				} else if(obj.name=="inv_cfm_dt"){
					ComKeyOnlyNumber(obj);
				} else {
					ComKeyOnlyAlphabet('uppernum');
				}
	            break;
	        case "engdn":
				if(obj.name == "phn_no" || obj.name == "fax_no"){
					ComKeyOnlyNumber(obj, "-");
				}	else if(obj.name=="mnr_prnr_eml") {
					MnrKeyOnlyAlphabet('lowereml');
				} 	else {
					ComKeyOnlyAlphabet('lower');
				}
	            break;
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
							
						  var HeadTitle="Seq.|Cost Office|S/P Code|S/P Name|No of Invoice|Invoice Currency|Total Amount" ;

						  SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:1, DataRowMerge:1 } );

						  var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
						  var headers = [ { Text:HeadTitle, Align:"Center"} ];
						  InitHeaders(headers, info);

						  var cols = [ {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"",                         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
								 {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cost_ofc_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
								 {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"vndr_no",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
								 {Type:"Text",      Hidden:0,  Width:300,  Align:"Left",    ColMerge:0,   SaveName:prefix+"vndr_seq_name",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
								 {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cnt_inv",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
								 {Type:"Text",      Hidden:0,  Width:130,  Align:"Center",  ColMerge:0,   SaveName:prefix+"inv_curr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
								 {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:prefix+"total_amt",         KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
								 {Type:"Text",      Hidden:1, Width:1,    Align:"Center",  ColMerge:0,   SaveName:prefix+"inv_iss_dt",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
								 {Type:"Text",      Hidden:1, Width:1,    Align:"Center",  ColMerge:0,   SaveName:prefix+"inv_rcv_dt",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
								 {Type:"Text",      Hidden:1, Width:1,    Align:"Center",  ColMerge:0,   SaveName:prefix+"gen_pay_term_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
								 {Type:"Text",      Hidden:1, Width:1,    Align:"Center",  ColMerge:0,   SaveName:prefix+"gen_pay_term_desc", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
								 {Type:"Text",      Hidden:1, Width:1,    Align:"Center",  ColMerge:0,   SaveName:prefix+"pay_term_tp_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
								 {Type:"Text",      Hidden:1, Width:1,    Align:"Center",  ColMerge:0,   SaveName:prefix+"inv_sub_sys_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
								 {Type:"Text",      Hidden:1, Width:1,    Align:"Center",  ColMerge:0,   SaveName:prefix+"payment_due_dt",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
								 {Type:"Text",      Hidden:1, Width:1,    Align:"Center",  ColMerge:0,   SaveName:prefix+"pso_trns_slp_ctnt", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
						   
								  InitColumns(cols);

								  SetEditable(0);
								  //SetSheetHeight(420);
								  resizeSheet(sheetObj);
								}


    	            break;
    	    }
    	}
    // Handling the process about the sheet
    function doActionIBSheet(sheetObj, formObj, sAction) {
    	sheetObj.ShowDebugMsg(false);
    	switch (sAction) {
    	case IBSEARCH: //Retrieving
    		if (validateForm(sheetObj, formObj, sAction)){
    			formObj.f_cmd.value=SEARCH;
    			//var sXml = sheetObj.GetSearchXml("COM_CSR_0001.do", FormQueryString(formObj));
     			sheetObj.DoSearch("COM_CSR_0001GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix) );
    			//var arrXml = sXml.split("|$$|");
    			//sheetObj.LoadSearchXml(arrXml[0]);
    		}
    	break;
		case IBSEARCH_ASYNC01:	//Retrieving(in case of inputting sevice provider No.)
		if ( validateForm(sheetObj, formObj, sAction) ) {
			//Service Provider Detail Information
			var sXml=CsrGetRepairPartner(sheetObj,formObj.vndr_seq.value);
			if(ComGetEtcData(sXml, "vndr_seq") != 'null'){
				//setting Vender nm
				ComSetObjValue(formObj.vndr_nm, ComGetEtcData(sXml, "vndr_lgl_eng_nm"));
			} else {
				ComShowCodeMessage("COM12114", "Service Provider");
				ComSetObjValue(formObj.vndr_nm, "");
				ComSetObjValue(formObj.vndr_seq, "");
				ComSetFocus(formObj.vndr_seq);
			}
		}
		break;
    	}
    }
    /**
     * Initializing Combo
     * param : comboObj, comboNo
     * adding case as numbers of counting sheets
     */
     function initCombo(comboObj, comboNo, crrCombo) {
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
                 var comboItems=crrCombo.split("|");
                 addComboItem(comboObj, comboItems);
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
         	case 3:
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
    function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
           case IBSEARCH: //TRADE
    	        break;
        }
    }
    /**
     * Adding the data to the combobox field
     */
    function addComboItem(comboObj,comboItems) {
    	for (var i=0 ; i < comboItems.length ; i++) {
    		var comboItem=comboItems[i].split(",");
    		comboObj.InsertItem(i, comboItem[0] + "|" + comboItem[1], comboItem[1]);
    	}
    }
    //In case of changing R/E
    function from_dt_OnChange(idx_cd, text){
    	if (gNew) return;
    	sheetObjects[0].RemoveAll();
    }
    /**
     * Handling the process for the input validation
     */
     /**
      * Handling the process for the input validation
      */
     function validateForm(sheetObj,formObj,sAction){
           with(formObj){
         	switch(sAction) {
 				case IBSAVE:
 					break;
 				case IBCREATE:
 					break;
 				case IBSEARCHAPPEND:
 					break;
 				case IBSEARCH:
         			break;
 				case IBSEARCH_ASYNC01:
         			if( ComGetObjText(formObj.vndr_seq) == "" ) {
         				ComShowCodeMessage("CSR00172","Service Provider Seq ");
         				ComSetFocus(formObj.vndr_seq);
         				return false;
         			}
         			break;
 			}
 		}
         return true;
     }
 	function sheet_OnDblClick (sheetObj, row, col){
		//retrieve_detail(sheetObj);	
	} 
 	function sheet_OnClick (sheetObj, row, col){ 
	}
    function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
    	if (sheetObj.RowCount() > 0)
    		ComBtnEnable('btn_detail');
    }
 	function sheet1_OnSaveEnd(sheetObj,ErrMsg) {
 		doActionIBSheet(sheetObject1, formObject, IBSEARCH);
    }
    function sheet1_OnKeyUp(sheetObj, Row, Col, KeyCode, Shift){
    	var sName=sheetObj.ColSaveName(Col);
     	var Value=sheetObj.EditValue;
    	//Moving to the next cell in case of inputting 4 characters in vsl_cd field
    	if ((sName == (prefix+"vsl_cd")) && (Value.length == 4)){
    		sheetObj.SelectCell(Row, prefix+"skd_voy_no",true);
    	}
    	//Moving to the next cell in case of inputting 4 characters in skd_voy_no field
    	if (sName == prefix+"skd_voy_no" && Value.length==4){
    		sheetObj.SelectCell(Row, prefix+"skd_dir_cd",true);
    	}
    }
    function sheet1_OnChange(sheetObj, Row, Col, Value) {
    	var sName=sheetObj.ColSaveName(Col);
    	var formObj=document.form;
    	gCurRow=Row;
    }

    function resizeSheet(sheetObj){
        ComResizeSheet(sheetObj);
    }
    