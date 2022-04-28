/*=========================================================
** 1.0 Creation
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0036.js
*@FileTitle  :  carrier
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/09
=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
    		   MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
     		   OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
	/**
	 * @extends
	 * @class BCM_CCD_0036 : BCM_CCD_0036 on the screen for creating the script defines the task using.
	 */
	function BCM_CCD_0036() {
		this.processButtonClick=tprocessButtonClick;
		this.setSheetObject=setSheetObject;
		this.loadPage=loadPage;
		this.initSheet=initSheet;
		this.initControl=initControl;
		this.doActionIBSheet=doActionIBSheet;
		this.setTabObject=setTabObject;
		this.validateForm=validateForm;
	}
	/** Common global variable */
	var sheetObjects=new Array();
	var sheetCnt=0;
	var comboObjects=new Array();
	var comboCnt=0;
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
			switch (srcName) {
			case "btn_Retrieve":
				doActionIBSheet(sheetObjects[0], formObj, SEARCH);
				break;
			case "btn_Save":                                   
			    doActionIBSheet(sheetObjects[0],formObj,MULTI); 
				break;	
			case "btn_New":
				ComResetAll();
				doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
			    break;				
			 case "btn_add":
				 var newRow=setDataInsert(sheetObject, 1);
                 break;
			case "btn_del":                                                                                                   
					doActionIBSheet(sheetObjects[0],formObj,IBDELETE);												     //del 추가
				break;
			case "btn_com_ens_041":
				var param="";
	    		param=param + "&" + "cust_cd=" + form.cust_cd.value+"&mdm_yn="+ formObj.mdm_yn.value;
	    		//alert("param:::"+param);
	    		ComOpenPopup('/opuscntr/COM_ENS_041.do?' + param, 780, 500, 'setCallBack0B2', '1,0,1,1,1,1,1,1', true);
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
		doActionIBCombo(sheetObjects[0], formObj, SEARCH01);
		doActionIBSheet(sheetObjects[0],document.form,IBCLEAR);
     	// auth_tp_cd retrieve
		doActionIBSheet(sheetObjects[0], formObj, SEARCH01);		
		if(G_MDAA_CHK == 'Y' || G_AHTU_TP_CD == 'R' || G_AHTU_TP_CD == 'S') {
			//ComEnableObject(formObj.delt_flg, true);
			ComSetDisplay('btn_add', true);
			ComSetDisplay('btn_del', true);
			ComSetDisplay('btn_Save', true);
		} else {
			//ComEnableObject(formObj.delt_flg, false);
			ComSetDisplay('btn_add', false);
			ComSetDisplay('btn_del', false);
			ComSetDisplay('btn_Save', false);
		}
	}
	/**
	 * 페이지에 있는 HTML Control의 이벤트를 동적으로 로드한다. <br>
	 * {@link #loadPage}함수에서 이 함수를 호출하여 IBSheet Object를 초기화 한다. <br>
	 * 
	 * @param {ibsheet}
	 *            sheetObj IBSheet Object
	 * @param {int}
	 *            sheetNo sheetObjects 배열에서 순번
	 */
	function initControl() {
		var formObject=document.form;
		//Axon 이벤트 처리1. 이벤트catch(개발자변경)
		axon_event.addListenerForm('change', 'obj_change', form);
//	    axon_event.addListenerFormat('keypress',       'obj_keypress',    formObject); //- 키보드 입력할때
//	    axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
//	    axon_event.addListener  ('keyup'  , 'obj_keyup', 'cust_cd', 'addr_tp_cd');
	    ComClearSeparator (formObject.cust_cd,"eng"); //Only English 
	}
	/**
	 * CustomerCode, AddressType 입력시 자동조회. <br>
	 **/
//    function obj_keyup() {
//    	//var keyValue = event.keyCode;
//    	var formObj=document.form;
//    	if(formObj.cust_cd.value != "" && addr_tp_cd.GetSelectCode()!= ""){
//    		doActionIBSheet(sheetObjects[0], formObj, SEARCH);
//    	}
//    }
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
			        
			      if (location.hostname != "")
			      var HeadTitle1="|Del|Seq.|Customer Name|Address|Country|City|State|Zip Code|Contact Email|Contact Person|LOCAL ADDRESS1|LOCAL ADDRESS2|LOCAL ADDRESS3|LOCAL ADDRESS4|Remark|Primary Flag|Delete Flag|ADDR_TP_CD|||";
			      var headCount=ComCountHeadTitle(HeadTitle1);
			      (headCount, 0, 0, true);
			      var prefix="sheet1_";
		
			      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
		
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
			      InitHeaders(headers, info);
		
			      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
			             {Type:"DummyCheck", Hidden:0, Width:25,   Align:"Center",  ColMerge:0,   SaveName:prefix+"DelChk" },
			             {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"Seq" },
			             {Type:"Text",      Hidden:0,  Width:330,  Align:"Center",  ColMerge:0,   SaveName:prefix+"bzet_nm",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
			             {Type:"Text",      Hidden:0,  Width:550,  Align:"Center",  ColMerge:0,   SaveName:prefix+"bzet_addr",     KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:200 },
			             {Type:"PopupEdit", Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cnt_cd",        KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:2, AcceptKeys:"E" , InputCaseSensitive:1 },
			             {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cty_nm",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
			             {Type:"PopupEdit", Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ste_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3 },
			             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"zip_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:10 },
			             {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"cntc_eml",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
			             {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"cntc_pson_nm",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
			             {Type:"Text",      Hidden:0,  Width:140,  Align:"Center",  ColMerge:0,   SaveName:prefix+"locl_addr1",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:30 },
			             {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"locl_addr2",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:30 },
			             {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"locl_addr3",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:30 },
			             {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"locl_addr4",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:30 },
			             {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"bzet_rmk",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1000 },
			             {Type:"Combo",     Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:prefix+"prmry_chk_flg", KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 },
			             {Type:"Combo",     Hidden:0, Width:70,   Align:"Center",  ColMerge:0,   SaveName:prefix+"delt_flg",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 },
			             {Type:"Text",      Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"addr_tp_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 },
			             {Type:"Text",      Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"addr_seq",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 },
			             {Type:"Text",      Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_cnt_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Text",      Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_seq",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
			       
			      InitColumns(cols);
		
			      SetEditable(1);
			      SetColHidden("check",1);
			      SetColProperty(prefix+'prmry_chk_flg', {ComboText:"N|Y", ComboCode:"N|Y"} );
			      SetColProperty(prefix+'delt_flg', {ComboText:"N|Y", ComboCode:"N|Y"} );
			      SetColProperty(0 ,prefix+"bzet_nm", {AcceptKeys:"E" , InputCaseSensitive:1});
			      SetShowButtonImage(2);
			      SetSheetHeight(322);
	      }
			break;
		}
	}
	 	function sheet1_OnPopupClick(sheetObj,Row,Col)
	 		{
	    	 var formObj=document.form;
	 		var param="";
	 		var prefix="sheet1_";
	 		if (sheetObj.ColSaveName(Col) == prefix+"cnt_cd") {
	 		param=param + "&" + "cnt_cd=" 
	 		//+sheetObj.CellValue(Row,Col);
    		ComOpenPopup('/opuscntr/COM_ENS_0M1.do?' + param, 780, 510, 'getCOM_ENS_0M1', '1,0,1,1,1,1,1,1', true, Col, Row);
	 		}else if (sheetObj.ColSaveName(Col) == prefix+"ste_cd") {
 				param=param + "&" + "ste_cd=" 
 				//+sheetObj.CellValue(Row,Col);
 				ComOpenPopup('/opuscntr/COM_ENS_0X1.do?' + param, 650, 460, 'getCOM_ENS_0X1', '1,0,1,1,1,1,1,1', true, Col,Row);
 			}
	 		}
		function getCOM_ENS_0M1(aryPopupData, Row, Col) {
			var sheetObj=sheetObjects[0];
			var formObj=document.form;
			var prefix="sheet1_"
			if ( aryPopupData.length > 0 ) {
				sheetObj.SetCellValue(Row,prefix+"cnt_cd",aryPopupData[0][3]);
			}
		}
	     function getCOM_ENS_0X1(aryPopupData, Row, Col) {
	        var sheetObj=sheetObjects[0];
			var formObj=document.form;
			var prefix="sheet1_"
			if ( aryPopupData.length > 0 ) {
	        sheetObj.SetCellValue(Row,prefix+"ste_cd",aryPopupData[0][3]);
			}
		}
	 /**
	  * setDataInsert call .<br>
	  * DELT FLG set 'N' 
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
					var sXml=sheetObj.GetSearchData("BCM_CCD_0036GS.do", "f_cmd=" + SEARCH01);
				var arrXml=sXml.split("|$$|");
							if (arrXml.length > 0) 
								ComXml2ComboItem(arrXml[0], addr_tp_cd, "cd", "cd|cd_desc");
	     		break;
	     	}
		}
	// Sheet processing-related processes
		function doActionIBSheet(sheetObj, formObj, sAction) {
			sheetObj.ShowDebugMsg(false);
			switch (sAction) {
	    	case SEARCH01: // MDM AUTH_TP_CD query
		    	var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=CUST';
		    	var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
		    	// global var setting
		    	G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
		    	G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
		    	break;
			case SEARCH: //retrieve
				if(!validateForm(sheetObj,formObj,sAction)) {
				return false;
				}
				formObj.f_cmd.value=SEARCH;
				formObj.cust_cnt_cd.value=formObj.cust_cd.value.substring(0,2);
				formObj.cust_seq.value=formObj.cust_cd.value.substring(2,formObj.cust_cd.value.length);
				var prefix="sheet1_";
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("BCM_CCD_0036GS.do", sParam);
				sheetObj.DoSearch("BCM_CCD_0036GS.do", FormQueryString(formObj)
						+ "&" + ComGetPrefixParam("sheet1_"));
////				var addr_seq=ComXmlString(sXml, prefix+"addr_seq");
//		        if(addr_seq == ""){
//		       		formObj.ibflag.value="I";
//		       		formObj.cust_cd.readOnly=false;
//		        }else{
//		        	formObj.cust_cd.value=sheetObj.GetCellValue(1,prefix+"cust_cnt_cd")+sheetObj.GetCellValue(1,prefix+"cust_seq");
//		        	formObj.ibflag.value="U";
//		        	formObj.cust_cd.readOnly=true;
//		        }
		        for(i=1; i <=sheetObj.RowCount(); i++){
		 	    if(sheetObj.RowCount()> 0){ // Update mode, if data exists
	    	    	sheetObj.SetCellValue(i,'sheet1_ibflag',"U");
	    	    } else { // Insert mode when no data is
	    	    	sheetObj.SetCellValue(i,'sheet1_ibflag',"I");
	    	    }
		        }
				//ComOpenWait(false);
				break;
			case MULTI:        //Save
				if(!validateForm(sheetObj,formObj,sAction)) {
					return false;
				}
				formObj.f_cmd.value=MULTI;
				formObj.cust_cnt_cd.value=formObj.cust_cd.value.substring(0,2);
				formObj.cust_seq.value=formObj.cust_cd.value.substring(2,formObj.cust_cd.value.length);
				var prefix="sheet1_";
				if(sheetObj.GetSaveString(false, true, prefix+"ibflag")==""){
					ComShowCodeMessage("COM130503");
					return false;
				}
		        var sParam=FormQueryString(formObj) + "&" + sheetObj.GetSaveString(false, true, prefix+"ibflag");
			        if(ComShowConfirm(ComGetMsg("COM130101","Data"))){
	         			//ComOpenWait(true);
			        	var sXml=sheetObj.GetSaveData("BCM_CCD_0036GS.do", sParam);
	         			//ComOpenWait(false);
	         			var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
	         			if(result != "F"){
	         				ComShowCodeMessage("COM130102", "Data");
	         				doActionIBSheet(sheetObj, formObj, SEARCH);
	         			}else{
	         				ComShowCodeMessage("COM130103", "Data");
	         			}
         			} 
			break;
			case IBDELETE:      // delete	 		
			formObj.ibflag.value="D";
			ComRowHideDelete(sheetObj, "sheet1_DelChk");
		break;
			case IBCLEAR:      //Initialization
			 formObj.ibflag.value="I";	
 		     ComClearObject(formObj.cust_cd);
 		     addr_tp_cd.SetSelectCode("");
  		     formObj.cust_cd.readOnly=false;
  		     ComBtnEnable("btn_del");
		    break;
			case SEARCH04:      //Customer Code check
			if(validateForm(sheetObj,formObj,sAction)){
				formObj.f_cmd.value=SEARCH04;
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("BCM_CCD_0036GS.do", sParam);
		        var result=ComGetEtcData(sXml, "result");
		        if(result==""){
		        	ComShowCodeMessage("COM130402", "Customer Code");
		        	formObj.cust_cd.value="";
		        	document.form.cust_cd.focus();
		        }else{
		        	document.form.addr_tp_cd.focus();
		        }
				ComOpenWait(false);
			}
		break;
			}	
		}
	function addr_tp_cd_OnChange(comboObj, value, code) {
		var formObj=document.form;
		var arrText=code.split("|");
//		if(arrText[0]=="1"){
//			ComBtnDisable("btn_del");
//		}else {
//			ComBtnEnable("btn_del");
//		}
		 //* CustomerCode, AddressType 입력시 자동조회
		if(formObj.cust_cd.value != "" && comboObj.GetSelectText()!= ""){
    		doActionIBSheet(sheetObjects[0], formObj, SEARCH);
    	}
	}
	/**
	 * When selecting from the pop-up check, pass a value to parent window. <br>
	 * 
	 * @param {ibsheet} sheetObj IBSheet Object
	 * @param {String} value sheetObj input value
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
	//===================================================================================
		//UI Object Event Handler
		// ===================================================================================
		/**
		 * Read from the Carrier Code Pop up. <br>
		 */ 
		function setCallBack0B2(aryPopupData) {
			var form=document.form;
			form.cust_cd.value=aryPopupData[0][3];
		} 
	 /**
	 * handling process for input validation
	 */
	function validateForm(sheetObj, formObj, sAction) {
		 switch (sAction) {
	    	case SEARCH:
	    		if(formObj.cust_cd.value == "" || formObj.cust_cd.value == null){
	    			ComShowCodeMessage("CCD00001", "Customer Code");
	    			document.form.cust_cd.focus();
	    			return false;
	    		}	    		
	    		if(addr_tp_cd.GetSelectCode()== "" || addr_tp_cd.GetSelectCode()== null){
	    			ComShowCodeMessage("CCD00001", "Address Type");
	    			document.form.addr_tp_cd.focus();
	    			return false;
	    		}
	    		break;
	    	case MULTI:
	    		var prefix="sheet1_";
	    		if(formObj.cust_cd.value == "" || formObj.cust_cd.value == null){
	    			ComShowCodeMessage("CCD00001", "Customer Code");
	    			document.form.cust_cd.focus();
	    			return false;
	    		}
	    		if(addr_tp_cd.GetSelectCode()== "" || addr_tp_cd.GetSelectCode()== null){
	    			ComShowCodeMessage("CCD00001", "Address Type");
	    			document.form.addr_tp_cd.focus();
	    			return false;
	    		}
	            for (i=1;i<=sheetObj.LastRow();i++){
	            	if(addr_tp_cd.GetSelectCode()=="1" && sheetObj.GetCellValue(i, prefix+"prmry_chk_flg") == "Y"){
	            		if(sheetObj.GetCellValue(i,prefix+"ibflag")=="I"||sheetObj.GetCellValue(i,prefix+"ibflag")=="U"){
	            			if(sheetObj.GetCellValue(i,prefix+"bzet_nm") == ""){
				        	ComShowCodeMessage("CCD00001", "Customer Name");
				        	sheetObj.SelectCell(i, 3, true, '');
				        	return ;
				           												}
	                	 											}
	    		         									}
	    		       									}
	    		var cnt=0;
	    		var cntPrimary=0;
	    		for(i=1; i <= sheetObj.LastRow(); i++){
	    			if("U" == sheetObj.GetCellValue(i, prefix+"ibflag") || "I" == sheetObj.GetCellValue(i, prefix+"ibflag") || "D" == sheetObj.GetCellValue(i, prefix+"ibflag")){
	    				cnt++;
	    			}
	    			if(sheetObj.GetCellValue(i,prefix+"prmry_chk_flg")=="Y"){
	    				cntPrimary++;
	    			}
	    		}    			
				if(cnt>0 && !(sheetObj.GetSaveString(false, true, prefix+"ibflag"))){
					return false;
				}
				var rowCnt = sheetObj.RowCount("I")+sheetObj.RowCount("R")+sheetObj.RowCount("U") ;
				if(cntPrimary == 0 && rowCnt > 0){
					ComShowCodeMessage("CCD00008");
					return false;
				}
               break;
		 	}
	    	return true;
	}
	function obj_focus() {
	      	if(ComGetEvent("options")){
	      		ComGetEvent("focus");
	      	}else{
	      		ComGetEvent("select");
	      	}
	}
	/**
	   * OnChange function that is called when an event occurs <br>
	   * @author 
	   * @version 2011.02.25
	 */  	
	function sheet1_OnChange(sheetObj, Row, Col, Value){
		  	var formObject=document.form;
		   	var colname=sheetObj.ColSaveName(Col);
		   	var prefix="sheet1_";
	   	with (sheetObj) {
		   	switch(colname){
		   		case prefix+"cnt_cd":
		    		if (Value.length>0){ 
	          			formObject.f_cmd.value=SEARCH02;
			 			var sParam="f_cmd="+formObject.f_cmd.value	+ "&cnt_cd=" +sheetObj.GetCellValue(Row,Col);
			 			var sXml=sheetObj.GetSearchData("BCM_CCD_0036GS.do", sParam);
			 			var cnt_cd=ComGetEtcData(sXml, "result");
	    		        if(cnt_cd == ""){
	    		        	ComShowCodeMessage("COM130402", "Country Code"); 		
	    		        	sheetObj.SetCellValue(Row,prefix+"cnt_cd","",0);
	    		        }
	          		}
		    	break; 	
		   		case prefix+"ste_cd":
		    		if (Value.length>0){ 
	          			formObject.f_cmd.value=SEARCH03;
			 			var sParam="f_cmd="+formObject.f_cmd.value+ "&ste_cd=" +sheetObj.GetCellValue(Row,Col);
			 			var sXml=sheetObj.GetSearchData("BCM_CCD_0036GS.do", sParam);
			 			var cnt_cd=ComGetEtcData(sXml, "result");
	    		        if(cnt_cd == ""){
	    		        	ComShowCodeMessage("COM130402", "State Code"); 		
	    		        	sheetObj.SetCellValue(Row,prefix+"ste_cd","",0);
	    		        }
	          		}
		    	break; 	
		   	    case prefix+"prmry_chk_flg":
		   	    	if (Value.length>0){
		    			var chkFlg="N";
		    			if(sheetObj.GetCellValue(Row,prefix+"prmry_chk_flg")=="Y"){
			    			for (i=1;i<sheetObj.RowCount();i++){
			    				if(i != Row && sheetObj.GetCellValue(i,prefix+"prmry_chk_flg")=="Y"){
			    					chkFlg="Y";
			    					break;
			    				}
			    			}
			    			if( (chkFlg =="Y")&&(sheetObj.GetCellValue(Row,prefix+"prmry_chk_flg")=="Y") ){
			    				ComShowCodeMessage("CCD00009");
			    				sheetObj.SetCellValue(Row,prefix+"prmry_chk_flg","N",0);
			    				return;
			    			}
		    			}
		    		}
		    	break; 
		   	 case prefix+"delt_flg":
		   		 if(sheetObj.GetCellValue(Row,prefix+"delt_flg")=="Y" ){
		   			if(ComShowConfirm(ComGetMsg("CCD00012"))){
		   				sheetObj.SetCellValue(Row,prefix+"delt_flg","Y");
		   			}else{
		   				sheetObj.SetCellValue(Row,prefix+"delt_flg","N");
		   			}
		   		}
		    	break; 
		   	}
	        if(colname == prefix+"bzet_nm" || colname == prefix+"bzet_addr" || colname == prefix+"cnt_cd"){
	           	 if(chkSheetVal(sheetObj, Row, Col)){
	           		 return;
	           	 }
	        }		   	
	   	}
	} 
		/**
		 * 
		 * @param sheetObj
		 * @param Row
		 * @param Col
		 * @returns {Boolean}
		 */
		function chkSheetVal(sheetObj, Row, Col){
			var prefix="sheet1_";
			with (sheetObj) {
				for(i=1; i <= LastRow(); i++){
					if(i != Row){
						if(sheetObj.GetCellValue(i, prefix+"bzet_nm") == sheetObj.GetCellValue(Row, prefix+"bzet_nm")){
							if(sheetObj.GetCellValue(i, prefix+"bzet_addr") == sheetObj.GetCellValue(Row, prefix+"bzet_addr")){
								if(sheetObj.GetCellValue(i, prefix+"cnt_cd") == sheetObj.GetCellValue(Row, prefix+"cnt_cd")){
									ComShowCodeMessage("CCD00006");
									sheetObj.SetCellValue(Row, Col,"",0);
									sheetObj.SelectCell(Row, Col);
			            			return true;
								}						
							}					
						}
					}
				}
			}
		}
		 /**
	     * If the data field to be the change Event
	     */
	    function obj_change(){
	    	var formObject=document.form;
	    	/*****Case more than two additional sheets tab sheet is used to specify a variable *****/
	        var sheetObject1=sheetObjects[0];
	        /*******************************************************/
	    	try {
	    		var srcName=ComGetEvent("name");
	            switch(srcName) {
	            	case "cust_cd":	
/*	            		if(formObject.cust_cd.value.length>0){
	              			if(!ComIsNumber(formObject.cust_cd.value.substring(2,formObject.cust_cd.value.length))){
	        		        	formObject.cust_cd.value="";
	        		        	ComShowCodeMessage("COM130402", "Customer Code"); 	
	        		        	ComSetFocus(document.form.cust_cd);	
	        		        	return false;
	              			}
              			         doActionIBSheet(sheetObject1, formObject, SEARCH04);
              			         //ComSetFocus(document.form.addr_tp_cd_text);
        		         }
	            		break;*/
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
	                   		doActionIBSheet(sheetObject1, formObject, SEARCH04);
	            		}
	            	break;
	            	}
	    	}catch(e) {
	    		if( e == "[object Error]") {
	    			ComShowMessage(OBJECT_ERROR);
	    		} else {
	    			ComShowMessage(e.message);
	    		}
	    	}
	    }
//	  function obj_keypress() {
//		 	obj=event.srcElement;	 	
//		 	keyValidation(obj);  
//	 } 
