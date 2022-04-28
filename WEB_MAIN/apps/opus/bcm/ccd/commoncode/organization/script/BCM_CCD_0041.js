/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0041.js
*@FileTitle  :  Office Access Group Creation
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/10
=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
			   MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
			   OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
 
    /** Common global variable */   
	var sheetObjects=new Array();
	var sheetCnt=0;
	var comboObjects=new Array();
	var comboCnt=0;
	/** Event handler processing by button click event */
	document.onclick=processButtonClick;  
	/**
	  * initializing sheet
	  * implementing onLoad event handler in body tag
	  * adding first-served functions after loading screen.
	  */
		function loadPage() {
	        var formObj=document.form;
	        initControl()	        
			for (i=0; i < sheetObjects.length; i++) {
				ComConfigSheet(sheetObjects[i]);
				initSheet(sheetObjects[i], i + 1);
				ComEndConfigSheet(sheetObjects[i]);	
			}
			doActionIBCombo(sheetObjects[0], formObj, SEARCH);	
			ComBtnDisable("btn_detail");			
			ComSetFocus(document.form.sub_sys_cd);		
		}		
	/** Event handler processing by button click event */
	function processButtonClick(){
		/*****Case more than two additional sheets tab sheet is used to specify a variable *****/
        var sheetObject1=sheetObjects[0];      
        /*******************************************************/
        var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch (srcName) {
				case "btn_retrieve": //query
					doActionIBSheet(sheetObject1, formObject, SEARCH01);
					break;
				case "btn_new": //clear
					doActionIBSheet(sheetObject1,	formObject,	IBCLEAR);
					break;	
				case "btn_save": //save
					doActionIBSheet(sheetObject1, formObject, IBSAVE);
					break;
				case "btn_detail": //Detail
					doActionIBSheet(sheetObject1, formObject, IBSEARCH_ASYNC01);
					break;	
		/*****************grid button ************************/				
				case "btn_rowadd": //add row  
	                doActionIBSheet(sheetObject1,	formObject,	IBINSERT);
					break;
				case "btn_rowdelete": //delete row
					doActionIBSheet(sheetObject1,	formObject,	MODIFY01);					
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
		            
		          var HeadTitle="ibflag|Del|Seq|Module Code|Access Group ID|Group Name|Group Description|Create User ID|Create Date|Update User ID|Update Date";
		          var headCount=ComCountHeadTitle(HeadTitle);
		          (headCount, 0, 0, true);
		
		          SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
		
		          var info    = { Sort:0, ColMove:1, HeaderCheck:1, ColResize:1 };
		          var headers = [ { Text:HeadTitle, Align:"Center"} ];
		          InitHeaders(headers, info);
		
		          var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
		                 {Type:"DelCheck",  Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"del" },
		                 {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"seq" },
		                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"sub_sys_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"ofc_grp_id",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",    ColMerge:0,   SaveName:"ofc_grp_nm",    KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
		                 {Type:"Text",      Hidden:0,  Width:500,  Align:"Left",    ColMerge:0,   SaveName:"ofc_grp_desc",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1000 },
		                 {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"cre_usr_id",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"cre_dt",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"upd_usr_id",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"upd_dt",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
		           
		          InitColumns(cols);
		          SetEditable(1);
		          SetSheetHeight(300);
                }
          	break;
     	}
	}	
	  /**
	   * Sheet processing-related processes <br>
	   */
	 	function doActionIBSheet(sheetObj, formObj, sAction) {
		   try {
		 		sheetObj.ShowDebugMsg(false);
		 		switch (sAction) {																		
		 			case IBSEARCH: // query
		 				if (!validateForm(sheetObj,document.form,sAction)) {
							return false;
						}
		 				break;
			 		case SEARCH01: // Access Group Information query	 			
			 			if (!validateForm(sheetObj,document.form,sAction)) {
							return false;
						}		 		
			 			formObj.f_cmd.value=SEARCH01;	
			 			var sXml=sheetObj.GetSearchData("BCM_CCD_0041GS.do", FormQueryString(formObj));
			 			sheetObj.LoadSearchData(sXml,{Sync:1} );
			 			ComBtnEnable("btn_detail");	
		 		 		break;	 				 		
			 		case IBCLEAR:      // init 
			 			sheetObj.RemoveAll();
			 			sub_sys_cd.SetSelectText('');
			 			formObj.acc_grp_id.value="";
			 			ComSetFocus(document.form.sub_sys_cd);			
		 		 		break;	
			 		case IBINSERT: // Row Add	
			 			if (!validateForm(sheetObj,document.form,sAction)) {
						return false;
			 			}	
			 			with (sheetObj) {
			 				DataInsert(-1);
				 			SetCellValue(LastRow(), "sub_sys_cd", sub_sys_cd.GetSelectText());
//				 			SetCellValue(lastRows(), "sub_sys_cd",sub_sys_cd.text);
				 			return true;
			 			}
		 		 		break;	
			 		case IBSEARCH_ASYNC01:      // Detail pop-up		 
		 				if (!validateForm(sheetObj,document.form,sAction)) {
							return false;
						}
						goDetail(sheetObj);
		 		 		break;		 		 		
			 		case IBSAVE: // save
			 			if (!validateForm(sheetObj,document.form,sAction)) {
							return false;
						}			 			
	                    var sParamSheet1=sheetObjects[0].GetSaveString(true);
						if (sheetObjects[0].IsDataModified()&& sParamSheet1 == "") {
						    return;
						}						
						//Confirmation message to save
						if (!ComShowCodeConfirm("COM130101", "Data")) {
						    return false;
						}						
			 			formObj.f_cmd.value=MULTI;	
			 			var sParam=sheetObj.GetSaveString(false, true);
			 			sParam += "&f_cmd=" + formObj.f_cmd.value;
			 			sXml=sheetObj.GetSaveData("BCM_CCD_0041GS.do", sParam);
			 			var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
				     	   if(sav != "F" ){
				     		  ComShowCodeMessage("COM130102", "Data");
				     		  doActionIBSheet(sheetObjects[0], document.form, SEARCH01);
				       	   }else{
					       		  ComShowCodeMessage("COM130103", "Data");
				       	   }
				     	   sheetObj.LoadSaveData(sXml);
		 		 		break;	
			 		case MODIFY01: // Row Delete
		 	        	   for(var i=1; i<sheetObj.RowCount()+1 ;i++){
		 	        		   if(sheetObj.GetRowStatus(i) =="D"){
		 	        			   sheetObj.SetRowHidden(i,1);
		 	        		   }
		 	        	   }
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
 	 * registering IBCombo Object as list
 	 * adding process for list in case of needing batch processing with other items 
 	 * defining list on the top of source
 	 */
	function setComboObject(combo_obj){
		comboObjects[comboCnt++]=combo_obj;
	}	
	/**
	 * registering IBSheet Object as list
	 * adding process for list in case of needing batch processing with other items 
	 * defining list on the top of source
	 */
	function setSheetObject(sheet_obj){
		sheetObjects[sheetCnt++]=sheet_obj;
	} 
	function goDetail(sheetObj){
			var params="&accGrpId=" 	    + sheetObj.GetCellValue(sheetObj.GetSelectRow(), "ofc_grp_id")
	      		       		+ "&subSysCd="    + sheetObj.GetCellValue(sheetObj.GetSelectRow(), "sub_sys_cd");
		    var sUrl="/opuscntr/BCM_CCD_0042.do?";
		    var rtnVal=ComOpenWindowCenter(sUrl + params, "BCM_CCD_0042", 880, 550, true);		
	}	
    /**
     * All the combo box query
     */
	function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
		switch (sAction) {
			case SEARCH: // load page
				var sXml=sheetObj.GetSearchData("BCM_CCD_0041GS.do", "f_cmd=" + SEARCH);
				var rtnValue=sXml.split("|$$|");
				for(var i=0; i<rtnValue.length; i++){
					var comboXml=ComXml2ComboString(rtnValue[i], "cd", "cd");
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
     * handling process for input validation <br>
     */
 	function validateForm(sheetObj, formObj, sAction) {
    	 switch (sAction) {				
	    	 case SEARCH01: // query 	    		 
	    		 //Sub System Code is null		 
		    	 if(sub_sys_cd.GetSelectCode().length != 3) {
						ComShowCodeMessage('CCD00001',"Module Code"); // Access Group ID is null
						ComSetFocus(document.form.sub_sys_cd);					
						return false;
					}
	    	 	break;
	    	 case IBSAVE: // save
	            //Office Code duplicate check
//no support[check again]CLT 		        sheetObj.SpaceDupCheck=false;           
	            var dupRow=sheetObj.ColValueDup("ofc_grp_nm",false);
	            if (dupRow>0){
	            	sheetObj.SetSelectRow(dupRow);
	                ComShowCodeMessage("COM12115","Group Name");
	                ComSetFocus(sheetObj.ColValueDupRows("ofc_grp_nm"));	
	                return false;
	            }	  
            	if(!sheetObjects[0].IsDataModified()){
	                 ComShowCodeMessage('COM130503'); 
	                 return false;
            	 }	            	
		    	 break;	    
	    	 case IBINSERT: // Row Add		
	    		 //Sub System Code is null		 
		    	 if(sub_sys_cd.GetSelectCode().length != 3) {
						ComShowCodeMessage('CCD00001',"Module Code"); 
						ComSetFocus(document.form.sub_sys_cd);					
						return false;
					}
		    	 break;
	    	 case IBSEARCH_ASYNC01: // Detail
	    		 //Sub System Code is null		 	
	    		 var check_ofc_grp_id=sheetObj.GetCellValue(sheetObj.GetSelectRow(), "ofc_grp_id");
		    	 if(check_ofc_grp_id == "") {
						return false;
					}
		    	 break;	 
    	 }
 		return true;
 	}
    /**
     * Axon event handling Catch.<br>
     */    
      function initControl() {
         //axon_event.addListenerForm('beforeactivate', 'obj_activate', document.form);
         //axon_event.addListenerForm('beforedeactivate', 'obj_deactivate', document.form);
         //axon_event.addListenerFormat('mousemove', 'obj_onmousemove', document.form);            
// 		axon_event.addListenerFormat ('keypress', 'obj_keypress', document.form	); 	
//        axon_event.addListenerFormat ('keydown', 'obj_keydown', document.form);
        ComClearSeparator (document.form.sub_sys_cd,"eng"); //Only English 
        ComClearSeparator (document.form.acc_grp_id,"eng"); //Only English
      } 	
  /**
   * OnKeyPress event handling. <br>
   */     
// function obj_keypress() {
//	 	obj=event.srcElement;	 	
//	 	keyValidation(obj);  
// } 
      

 function sub_sys_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
     var formObj=document.form;
     var sheetObj=sheetObjects[0];
     sheetObj.RemoveAll();
     formObj.acc_grp_id.value="";
     ComBtnDisable("btn_detail");	
 }  
 /*
  * ROW Double click
  */
	function sheet1_OnDblClick(sheetObj, Row, Col) {
		 var check_ofc_grp_id=sheetObj.GetCellValue(sheetObj.GetSelectRow(), "ofc_grp_id");
    	 if(check_ofc_grp_id == "") {
				return false;
    	 }else {
    		 goDetail(sheetObj);
    	 }
	}
