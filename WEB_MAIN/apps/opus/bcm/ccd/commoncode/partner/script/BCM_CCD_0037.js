/*=========================================================
** 1.0 Creation
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0037.js
*@FileTitle  :  Customer Contact Point Code Creation
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/04

=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
			   MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
			   OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
	/**
	 * @extends
	 * @class BCM_CCD_0037 : BCM_CCD_0037 on the screen for creating the script defines the task using.
	 */
	function BCM_CCD_0037() {
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
	var CustomerCodeChk="";
	var prefix="sheet1_";
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
					doActionIBSheet(sheetObjects[0],formObj,IBINSERT);
					break;
			 case "btn_del":                                                                                                   
					doActionIBSheet(sheetObjects[0],formObj,IBDELETE);	
				break;
			case "btn_com_ens_041":
				var param="";
	    		param=param + "&" + "cust_cd=" + form.cust_cd.value+"&mdm_yn="+ formObj.mdm_yn.value;
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
	 *  HTML Control of the event is dynamically loaded. <br>
	 * {@link #loadPage}Function calls this function initializes the IBSheet Object. <br>
	 * 
	 * @param {ibsheet} sheetObj IBSheet Object
	 * @param {int} SheetObjects sequence number in the array
	 */
	function initControl() {
		 var formObject=document.form;
		//Axon event handling
		axon_event.addListenerForm('focus', 'obj_focus', form);
		axon_event.addListenerForm('change', 'obj_change', form);
//	    axon_event.addListenerFormat('keypress',       'obj_keypress',    formObject);
//	    axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
	    ComClearSeparator (formObject.cust_cd,"eng"); //English Only
	}
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
			      var HeadTitle1="|Del|Seq.|E-Mail|IP|URL|International\nPhone No.|Phone No.|International\nFax No.|Fax No.|||";
			      var headCount=ComCountHeadTitle(HeadTitle1);
			      (headCount, 0, 0, true);
			      var prefix="sheet1_";
		
			      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
		
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
			      InitHeaders(headers, info);
		
			      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
			             {Type:"DummyCheck", Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"DelChk" },
			             {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"Seq" },
			             {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_eml",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:50, AcceptKeys:"N|E|[.@_- &]" },
			             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_ip",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20, AcceptKeys:"N|[.]" },
			             {Type:"Text",      Hidden:0,  Width:250,  Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_url",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:50, AcceptKeys:"N|E|[.@_-: &/?=]" },
			             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"intl_phn_no",       KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:4, AcceptKeys:"N" },
			             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"phn_no",            KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20, AcceptKeys:"N|[-]" },
			             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"intl_fax_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:4, AcceptKeys:"N" },
			             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"fax_no",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20, AcceptKeys:"N|[-]" },
			             {Type:"Text",      Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_cntc_pnt_seq", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 },
			             {Type:"Text",      Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_cnt_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Text",      Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_seq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
			       
			      InitColumns(cols);		
			      SetEditable(1);
			      SetColHidden("check",1);
			      SetSheetHeight(350);
	      }
			break;
		}
	}
	 /**
	  * setDataInsert call .<br>
	  * DELT FLG setting 'N' 
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
	// handling sheet process
		function doActionIBSheet(sheetObj, formObj, sAction) {
			var prefix="sheet1_";
			sheetObj.ShowDebugMsg(false);
			switch (sAction) {
	    	case SEARCH01: // MDM AUTH_TP_CD query
		    	var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=CUST';
		    	var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
		    	// global var setting
		    	G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
		    	G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
		    	break;
			case SEARCH: //Retrieve
				if(!validateForm(sheetObj,formObj,sAction)) {
					return false;
				}
				formObj.f_cmd.value=SEARCH;
				formObj.cust_cnt_cd.value=formObj.cust_cd.value.substring(0,2);
				formObj.cust_seq.value=formObj.cust_cd.value.substring(2,formObj.cust_cd.value.length);

				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("BCM_CCD_0037GS.do", sParam);
				sheetObj.DoSearch("BCM_CCD_0037GS.do", FormQueryString(formObj )
						+ "&" + ComGetPrefixParam("sheet1_"));
//				var intl_phn_no=ComXmlString(sXml, "intl_phn_no");
//		        if(intl_phn_no == ""){
//		       		formObj.ibflag.value="I";
//		       		//ComBtnEnable("btn_add");
//		       		formObj.cust_cd.readOnly=false;
//		        }else{
//		        	//ComBtnDisable("btn_add");
//		        	formObj.cust_cd.value=sheetObj.GetCellValue(1,prefix+"cust_cnt_cd")+sheetObj.GetCellValue(1,prefix+"cust_seq");
//		        	formObj.ibflag.value="U";
//		        	formObj.cust_cd.readOnly=true;
//		        }
		        for(i=1; i <=sheetObj.RowCount(); i++){
			 	    if(sheetObj.RowCount()> 0){ // Update mode, if data exists
		    	    	sheetObj.SetCellValue(i,'sheet1_ibflag',"U");
		    	    } else { // Insert mode, if data exists
		    	    	sheetObj.SetCellValue(i,'sheet1_ibflag',"I");
		    	    }
			        }
				ComOpenWait(false);
				break;
			case MULTI:        //Save
				if(!validateForm(sheetObj,formObj,sAction)) {
					return false;
				}
				formObj.f_cmd.value=MULTI;
				formObj.cust_cnt_cd.value=formObj.cust_cd.value.substring(0,2);
				formObj.cust_seq.value=formObj.cust_cd.value.substring(2,formObj.cust_cd.value.length); 
//				if(sheetObj.GetSaveString(false, true, prefix+"ibflag")==""||sheetObj.GetSaveString(false, true, prefix+"ibflag")== null){
//					ComShowCodeMessage("CCD00011");
//					return;
//					}
		        var sParam=FormQueryString(formObj) + "&" + sheetObj.GetSaveString(false, true, prefix+"ibflag");
		        if(ComShowConfirm(ComGetMsg("COM130101","Data"))){
		        	ComOpenWait(true);
		        	var Xml=sheetObj.GetSaveData("BCM_CCD_0037GS.do", sParam);
				    ComOpenWait(false);
			        var sav=ComGetEtcData(Xml, "TRANS_RESULT_KEY");
		    		if(sav == "S" ){					//Saved after a successful re-viewed
		    			ComShowCodeMessage("COM130102", "Data");
		    			doActionIBSheet(sheetObj,formObj,SEARCH);
		        	}else{
		        		ComShowCodeMessage("COM132103", "Data");
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
  		   formObj.cust_cd.readOnly=false;
  		 //ComBtnEnable("btn_add");
		    break;
			case IBINSERT:      // insert
			var sheetIdx=sheetObj.DataInsert(-1);
			//sheetObj.SetCellBackColor(sheetIdx,prefix+"phn_no","#555555");
			break;
			case SEARCH04:      //Customer Code check
			if(validateForm(sheetObj,formObj,sAction)){
				//ComOpenWait(true);
				formObj.f_cmd.value=SEARCH04;
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("BCM_CCD_0037GS.do", sParam);
		        var result=ComGetEtcData(sXml, "result");
		        if(result==""){
		        	ComShowCodeMessage("COM130402", "Customer Code");
		        	formObj.cust_cd.value="";
		        	document.form.cust_cd.focus();
		        	CustomerCodeChk="N"; // customer code check
		        }
		        sheetObj.LoadSearchData(sXml,{Sync:1} );
				//ComOpenWait(false);
			}
		break;
			}	
	 		//ComOpenWait(false);
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
	            switch(srcName) {
	            	case "cust_cd":
	            		CustomerCodeChk="Y"; // customer code check
/*	            		if(formObject.cust_cd.value.length>0){
	            			if(!ComIsNumber(formObject.cust_cd.value.substring(2,formObject.cust_cd.value.length))){
	        		        	formObject.cust_cd.value="";
	        		        	ComShowCodeMessage("COM130402", "Customer Code"); 	
	        		        	ComSetFocus(document.form.cust_cd);	
	        		        	return false;
	              			}*/
	
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
	            			doActionIBSheet(sheetObject1, formObject, SEARCH04); //Customer code check
	            			if(CustomerCodeChk!="N"){
	            			doActionIBSheet(sheetObject1, formObject, SEARCH);// customer code check
	            			}
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
	 * When selecting from the pop-up check, pass a value to parent window. <br>
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
		 * Read from Carrier Code Pop up. <br>
		 */ 
		function setCallBack0B2(aryPopupData) {
			var form=document.form;
			form.cust_cd.value=aryPopupData[0][3];
			doActionIBSheet(sheetObjects[0], form, SEARCH);
		} 
	 /**
	 * handling process for input validation
	 */
	function validateForm(sheetObj, formObj, sAction) {
		 switch (sAction) {
	    	case SEARCH:
	    		if(formObj.cust_cd.value == "" || formObj.cust_cd.value == null){
	    			ComShowCodeMessage("CCD00001", "Customer Code");
	    			return false;
	    		}
	    		break;
	    	case MULTI:
	    		var prefix="sheet1_";
	    		if(formObj.cust_cd.value == "" || formObj.cust_cd.value == null){
	    			ComShowCodeMessage("CCD00001", "Customer Code");
	    			return false;
	    		}
//	    		if(shetObj.intl_phn_no.value == "" || shetObj.intl_phn_no.value == null){
//	    			ComShowCodeMessage("CCD00001", "International Phone No.");
//	    			return false;
//	    		}
//	    		if(sheetObj.phn_no.value == "" || sheetObj.phn_no.value == null){
//	    			ComShowCodeMessage("CCD00001", "Phone No.");
//	    			return false;
//	    		}
	    		var cnt=0;
	    		for(i=1; i <= sheetObj.LastRow(); i++){
	    			if("U" == sheetObj.GetCellValue(i, prefix+"ibflag") || "I" == sheetObj.GetCellValue(i, prefix+"ibflag") || "D" == sheetObj.GetCellValue(i, prefix+"ibflag")){
	    				cnt++;
	    			}
	    		} 
				if(cnt>0 && !(sheetObj.GetSaveString(false, true, prefix+"ibflag"))){
					return false;
				}
				if (cnt <= 0){
					ComShowCodeMessage("CCD00019");
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
	  * 키보드가 눌릴 때 dataformat으로 세팅하고 엔터키를 누를때 조회한다.
	 * @author  
	  */
//	  function obj_keypress() {
//		 	obj=event.srcElement;	 	
//		 	keyValidation(obj);  
//	 } 
