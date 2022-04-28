/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : ADM_SYS_0011.js
*@FileTitle  : Item Control Management
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
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
			for (i=0; i < sheetObjects.length; i++) {
				ComConfigSheet(sheetObjects[i]);
				initSheet(sheetObjects[i], i + 1);
				ComEndConfigSheet(sheetObjects[i]);	
			}
	    	var comboObjMaxLen=comboObjects.length;
	    	for (i=0; i < comboObjMaxLen; i++) {
	    		// initializeIBCombo
	    		initCombo(comboObjects[i], i + 1);
	    	}
			initControl();
			doActionIBCombo(sheetObjects[0], formObj, SEARCH);
		}		
	/** Event handler processing by button click event */
	function processButtonClick(){
		/*****Case more than two additional sheets tab sheet is used to specify a variable *****/
        var sheetObject1=sheetObjects[0];      
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
				ComShowMessage(e);
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
			    var HeadTitle="ibflag||Seq|Module|Program No|Item ID|Item Name|Control Type|Setting Type|Apply Type|Desc|"
			    + "Create User|Create Date|Update User|Update Date|search_pgm_sub_sys_cd|search_pgm_no|search_pgm_itm_id";
			    var headCount=ComCountHeadTitle(HeadTitle);
			    SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataGetRowMerge:1 } );
			    var info={ Sort:0, ColMove:1, HeaderCheck:1, ColResize:1 };
			    var headers=[ { Text:HeadTitle, Align:"Center"} ];
			    InitHeaders(headers, info);
			    var cols=[ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
			             {Type:"DelCheck",  Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"check" },
			             {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"Seq" },
			             {Type:"Combo",     Hidden:0, Width:60,   Align:"Center",  ColMerge:0,   SaveName:"pgm_sub_sys_cd",      KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3 },
			             {Type:"Text",      Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"pgm_no",              KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Text",      Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"pgm_itm_id",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Text",      Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"itm_dp_nm",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Combo",     Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"ctrl_tp_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, ComboText:"|Item|Function", ComboCode:"|I|F" },
			             {Type:"Combo",     Hidden:0, Width:90,   Align:"Left",    ColMerge:0,   SaveName:"set_tp_cd",           KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, ComboText:"|Disable|Hidden|Yes|No", ComboCode:"|D|H|Y|N" },
			             {Type:"Combo",     Hidden:0, Width:90,   Align:"Left",    ColMerge:0,   SaveName:"aply_flg",            KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, ComboText:"Yes|No", ComboCode:"Y|N" },
			             {Type:"Text",      Hidden:0, Width:150,  Align:"Center",  ColMerge:0,   SaveName:"itm_desc",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"cre_usr_id",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"cre_dt",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"upd_usr_id",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"upd_dt",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:60,   Align:"Center",  ColMerge:0,   SaveName:"key_pgm_sub_sys_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3 },
			             {Type:"Text",      Hidden:1, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"key_pgm_no",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Text",      Hidden:1, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"key_pgm_itm_id",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
     			InitColumns(cols);
     			SetSheetHeight(300);
 			}
          	break;
     	}
	}	
	  /**
	   * Sheet processing-related processes <br>
	   */
	 	function doActionIBSheet(sheetObj, formObj, sAction, row, col) {
		   try {
		 		sheetObj.ShowDebugMsg(false);
		 		switch (sAction) {																		
		 			case IBSEARCH: // query
		 				if (!validateForm(sheetObj,document.form,sAction)) {
							return false;
						}
		 				break;
			 		case SEARCH01: // Access Group Information query	 			
			 			formObj.f_cmd.value=SEARCH01;
			 			ComOpenWait(true);
 						var sXml=sheetObj.GetSearchData("ADM_SYS_0011GS.do", FormQueryString(formObj));
						if (sXml != "") sheetObj.LoadSearchData(sXml,{Sync:1} );
		 		 		break;	 				 		
			 		case SEARCH11: 	 					 		
			 			formObj.f_cmd.value=SEARCH11;	
						var pgmSubSysd=sheetObj.GetCellValue(row, "pgm_sub_sys_cd");
						var pgmNo=sheetObj.GetCellValue(row, "pgm_no");
						var pgmImId=sheetObj.GetCellValue(row, "pgm_itm_id");
			 			var sParma="";
			 				sParam += "&f_cmd=" + formObj.f_cmd.value;  
			 				sParam += "&pgm_sub_sys_cd=" + pgmSubSysd;
			 				sParam += "&pgm_no=" 		 + pgmNo;
			 				sParam += "&pgm_itm_id=" 	 + pgmImId;
 						var sXml=sheetObj.GetSearchData("ADM_SYS_0011GS.do", sParam);
						var retVal=ComGetEtcData(sXml, "retVal");
						if(retVal == "Y") {
							ComShowCodeMessage('COM131302', "[Module : " + pgmSubSysd + ", Program No : " + pgmNo + ", Item ID : " + pgmImId + "]");
							sheetObj.SetCellValue(row, col,sheetObj.CellSearchValue(row, col),0);
						}
		 		 		break;	 				 		
			 		case IBCLEAR:      // init 
			 			sheetObj.RemoveAll();
			 			//comboObjects[1].SetSelectCode("All");
			 			pgm_sub_sys_cd.SetSelectText("All");
			 			ctrl_tp_cd.SetSelectText("All");
			 			set_tp_cd.SetSelectText("All");
			 			//ComSetFocus(document.form.pgm_sub_sys_cd);			
		 		 		break;	
			 		case IBINSERT: // Row Add	

			 			with (sheetObjects[0]) {
				 			sheetObj.DataInsert(-1);
				 			return true;
			 			}
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
			 			if (sheetObj.IsDataModified() && sParam == "") return;
			 			sParam += "&f_cmd=" + formObj.f_cmd.value;       
 			 			var sXml=sheetObj.GetSaveData("ADM_SYS_0011GS.do", sParam);
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
					ComShowMessage(e);
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
    /**
     * All the combo box query
     */
	function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
		switch (sAction) {
			case SEARCH: // load page
 	     		var sXml=sheetObj.GetSearchData("BCM_CCD_0041GS.do", "f_cmd=" + SEARCH);
				var rtnValue=sXml.split("|$$|");
				var comboXml=ComXml2ComboString(rtnValue[0], "cd", "cd");
				var cdName=comboXml[0].split("|");
				var cdValue=comboXml[1].split("|");
				for (var j=0; j < cdName.length; j++) {
					pgm_sub_sys_cd.InsertItem(j, (cdName[j] == " " ? "All" : cdName[j]), cdValue[j]);
	        	}
				pgm_sub_sys_cd.SetSelectCode(" ");
				pgm_sub_sys_cd.SetDropHeight(300);
				sheetObj.SetColProperty("pgm_sub_sys_cd", {ComboText:comboXml[0].trim(), ComboCode:comboXml[1].trim()} );
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
		    	 if(pgm_sub_sys_cd.GetSelectCode().length != 3) {
						ComShowCodeMessage('CCD00001',"Module Code"); // Access Group ID is null
						//ComSetFocus(document.form.pgm_sub_sys_cd);					
						return false;
					}
	    	 	break;
	    	 case IBSAVE: // save
	            //Office Code duplicate check
 		        sheetObj.SpaceDupCheck=false;           
	            var dupRow=sheetObj.ColValueDup("ofc_grp_nm",false);
//	            if (dupRow>0){
//	            	sheetObj.SetSelectRow(dupRow);
//	                ComShowCodeMessage("COM12115","Group Name");
//	                ComSetFocus(sheetObj.ColValueDupRows("ofc_grp_nm"));	
//	                return false;
//	            }	  
	            	if(!sheetObjects[0].IsDataModified()){
	                 ComShowCodeMessage('COM130503'); 
	                 return false;
            	 }	            	
		    	 break;	    
	    	 case IBINSERT: // Row Add		
	    		 //Sub System Code is null		 
		    	 if(pgm_sub_sys_cd.GetSelectCode().length != 3) {
						ComShowCodeMessage('CCD00001',"Module Code"); 
						//ComSetFocus(document.form.pgm_sub_sys_cd);					
						return false;
					}
		    	 break;
	    	 case IBSEARCH_ASYNC01: // Detail
	    		 //Sub System Code is null		 	
	    		 var check_ofc_grp_id=sheetObj.cellValue(sheetObj.GetSelectRow(), "ofc_grp_id");
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
        //ComClearSeparator (pgm_sub_sys_cd,"engup"); //Only English 
      } 	
  /**
   * OnKeyPress event handling. <br>
   */     
 function obj_keypress() {
	 	obj=ComGetEvent();	 	
	 	keyValidation(obj);  
 } 


 /**
  * initalizeCombo Object 
  * 
  * @param comboObj
  * @param comNo
  * @return
  */
 function initCombo(comboObj, comNo) {
 	var i=0;
 	switch (comboObj.options.id) {
		case "ctrl_tp_cd": {	// Control Type
 			i=0;
 			with (comboObj) {
 				InsertItem(i++, "All", " ");
 				InsertItem(i++, "Item", "I");
 				InsertItem(i++, "Function", "F");
 				SetSelectCode(" ");
 				SetDropHeight(63);	
 			}
 			break;
 		}
 		case "set_tp_cd": {	// Setting Type
 			i=0;
 			with (comboObj) {
 				InsertItem(i++, "All", " ");
 				InsertItem(i++, "Disable(Item)", "D");
 				InsertItem(i++, "Hidden(Item)", "H");
 				InsertItem(i++, "Yes(Function)", "Y");
 				InsertItem(i++, "No(Function)", "N");
 				SetSelectCode(" ");
 			}
 			break;
 		}
 		case "aply_tp_cd": {	// aply_tp_cd
 			i=0;
 			with (comboObj) {
 				InsertItem(i++, "Yes", "Y");
 				InsertItem(i++, "No", "N");
 				SetSelectCode("Y");
 			}
 			break;
 		}
 	} // end switch
 }
	/**
	 * sheet Change event
	 * 
	 * @param sheetObj
	 * @param Row
	 * @param Col
	 * @param Value
	 * @return
	 */
	function sheet1_OnChange(sheetObj, row, col, value) {
		var rowCnt=sheetObj.RowCount();
		var colSaveName=sheetObj.ColSaveName(col);
		var formObj=document.form;
		switch(colSaveName) {
			case "pgm_sub_sys_cd":
			case "pgm_no":
			case "pgm_itm_id":
				if(sheetObj.GetCellValue(row, "pgm_sub_sys_cd") != ""
				&& sheetObj.GetCellValue(row, "pgm_no") != ""
				&& sheetObj.GetCellValue(row, "pgm_itm_id") != "") {
					doActionIBSheet(sheetObj,formObj,SEARCH11, row, col); // input validation
				}
				break;
		}
	}		
