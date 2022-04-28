/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0006.js
*@FileTitle  : Container Size
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/04
=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
    		   MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
     		   OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends
 * @class BCM_CCD_0006 : BCM_CCD_0006 on the screen for creating the script defines the task using.
 */
/** Common global variable */
var sheetObjects=new Array();
var sheetCnt=0;
var saveRows=new Array();
/** Event handler processing by button click event */
document.onclick=processButtonClick;
/** Event handler processing by button name */
function processButtonClick() {
	/*****Case more than two additional sheets tab sheet is used to specify a variable *****/
	var sheetObj=sheetObjects[0];
	/** **************************************************** */
	var formObj=document.form;
	try {
		var srcName=ComGetEvent("name");
		switch (srcName) {
		case "btn_Retrieve":
			saveRows=new Array();
			doActionIBSheet(sheetObj, formObj, IBSEARCH);
			break;
		case "btn_Save":
			doActionIBSheet(sheetObj, formObj, IBSAVE);
			break;
		case "btn_New":
            newPage();
			break;
		case "btns_search":
			ComOpenPopup('/opuscntr/COM_COM_0003.do?mdm_yn='+formObj.mdm_yn.value, 770, 440, 'getMdmCntrSz', "1,0,1", true);
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
	var sheetObj=sheetObjects[0];
	for (i=0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1);
		ComEndConfigSheet(sheetObjects[i]);
	}
	initControl();
	//1. AUTH Search  
	doActionIBSheet(sheetObj, formObj, SEARCH01);
	//2. AUTH에 따른 버튼  Enable / Disable 처리 
    if (G_MDAA_CHK == "Y") {
    	ComSetDisplay('btn_Retrieve', true);   
    	ComSetDisplay('btn_New', true);   
    	ComSetDisplay('btn_Save', true);   
    }	
    else {
    	ComSetDisplay('btn_Retrieve', true);   
    	ComSetDisplay('btn_New', true);   
    	ComSetDisplay('btn_Save', false);   
    } 
	//3. AUTH에 따른 버튼 delt_flg Enable / Disable 처리 
    if(G_MDAA_CHK == "Y")
		ComEnableObject(formObj.delt_flg, true); 
	else
		ComEnableObject(formObj.delt_flg, false); 
    $("#cntr_sz_cd").blur(function(){
    	obj_change();
    });
    
}
function initPage() {
	var formObj=document.form;
	for (i=0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1);
		ComEndConfigSheet(sheetObjects[i]);
	}
}
/**
 * new page is default Page 
 * newpage() is called by New Button  
 */
function newPage() {
	var formObj=document.form;
	var sheetObj=sheetObjects[0];
	sheetObj.RemoveAll();
	formObj.reset();
	formObj.cntr_sz_cd.disabled=false;
}
/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
function initSheet(sheetObj, sheetNo) {
	var cnt=0;
	switch (sheetNo) {
	case 1: // sheet1 init
	    with(sheetObj){
		        
		      if (location.hostname != "")
		      SetSelectionMode(smSelectionList);
		      var HeadTitle1="|CNTR_SZ_CD|CNTR_SZ_DESC|CNTR_SZ_TEU_CAPA|DELT_FLG|MODI_CNTR_SZ_CD";
		      var headCount=ComCountHeadTitle(HeadTitle1);
		      (headCount, 0, 0, false);
		      var prefix="sheet1_";
		
		      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
		
		      var info    = { Sort:0, ColMove:0, HeaderCheck:1, ColResize:0 };
		      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
		      InitHeaders(headers, info);
		
		      var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag",      KeyField:0,   CalcLogic:"",   Format:"", PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cntr_sz_cd",       KeyField:0,   CalcLogic:"",   Format:"", PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cntr_sz_desc",     KeyField:0,   CalcLogic:"",   Format:"", PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cntr_sz_teu_capa", KeyField:0,   CalcLogic:"",   Format:"", PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"delt_flg",         KeyField:0,   CalcLogic:"",   Format:"", PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		      		 {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"modi_cntr_sz_cd",  KeyField:0,   CalcLogic:"",   Format:"", PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		      		 {Type:"Text", 		Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_usr_id",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                 {Type:"Text", 		Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_dt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                 {Type:"Text",		Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_usr_id",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                 {Type:"Text", 		Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_dt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }];
		       
		      InitColumns(cols);		
		      SetEditable(1);		      
		      SetVisible(false);
			}
		break;
	}
}
// Sheet processing-related processes
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	switch (sAction) {
	case IBSEARCH: // retrieve
		if (validateForm(sheetObj, formObj, sAction)){
			formObj.f_cmd.value=SEARCH;
			//sheetObj.RenderSheet(0);
			ComOpenWait(true);
			var sXml=sheetObj.GetSearchData("BCM_CCD_0006GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_"));
			ComOpenWait(false);
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			//sheetObj.RenderSheet(1);
			formObj.cntr_sz_cd.disabled=true;
    	    if(sheetObj.RowCount()== 0){ // Insert mode when no data is
    	    	sheetObj.DataInsert(-1);
    	    }
		}
		break;
	case SEARCH01: // MDM AUTH_TP_CD query
		var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=MDAA';
		var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
		// global var sestting
		G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
		G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
		break;
	case IBSAVE: // Save
		if(validateForm(sheetObj, formObj, sAction)){
			sheetObj.SetCellValue(1, 'sheet1_cntr_sz_cd',formObj.cntr_sz_cd.value);
			sheetObj.SetCellValue(1, 'sheet1_cntr_sz_desc',formObj.cntr_sz_desc.value);
			sheetObj.SetCellValue(1, 'sheet1_cntr_sz_teu_capa',ComGetUnMaskedValue(formObj.cntr_sz_teu_capa.value, "float"));
			sheetObj.SetCellValue(1, 'sheet1_delt_flg',formObj.delt_flg.value);
			sheetObj.SetCellValue(1, 'sheet1_modi_cntr_sz_cd',formObj.modi_cntr_sz_cd.value);
			formObj.f_cmd.value=MULTI;

			if(ComGetSaveString(sheetObj)==""){
				sheetObj.SetCellValue(1,'sheet1_ibflag',"U");
			}
			if(ComShowConfirm(ComGetMsg("COM130101", "data"))){
				ComOpenWait(true);
				var sXml=sheetObj.GetSaveData("BCM_CCD_0006GS.do", FormQueryString(formObj) + "&" + ComGetSaveString(sheetObj));
				ComOpenWait(false);
				sheetObj.LoadSaveData(sXml);
     			var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
     			if(result != "F"){
     				ComShowCodeMessage("COM130102", "Data");
     			}else{
     				ComShowCodeMessage("COM130103", "data");
     			}
			}
		}
		break;
	}
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
     with(formObj){
         switch ( sAction ) {
             case IBSEARCH:
                 if (formObj.cntr_sz_cd.value.length == 0){
                	 ComShowCodeMessage("CCD00001", "Container Size Code");
                     formObj.cntr_sz_cd.focus();
                     return false;
                 }
                 break;
             case IBSAVE:  
            	var val=ComAddComma(ComGetUnMaskedValue(formObj.cntr_sz_teu_capa.value, "float"));
                 if (formObj.cntr_sz_cd.value.length == 0){
                	 ComShowCodeMessage("CCD00001", "Container Size Code");
                     formObj.cntr_sz_cd.focus();
                     return false;
                 } else if (formObj.cntr_sz_desc.value.length == 0){
                	 ComShowCodeMessage("CCD00001", "Container Size Name");
                	 formObj.cntr_sz_desc.focus();
                	 return false;
		         } else if (formObj.cntr_sz_teu_capa.value.length == 0){
		        	 ComShowCodeMessage("CCD00001", "TEU");
		        	 formObj.cntr_sz_teu_capa.focus();
		        	 return false;
		 		 } else if(!ComIsMoneyNumber(formObj.cntr_sz_teu_capa.value,true,true,true)){
		 			ComChkObjValid(formObj.cntr_sz_teu_capa); 
		 			formObj.cntr_sz_teu_capa.focus();
		 			return false;
		 		 }
                var sVal=ComReplaceStr(formObj.cntr_sz_teu_capa.value, ",", "") ;
                var arrVal=sVal.split(".");
             	if(ComGetLenByByte(arrVal[0]) > 15 ){
             	   ComShowCodeMessage("COM12114", "TEU (Max length:15 digit integer part and 3 digit fixed point part)");
             	   formObj.cntr_sz_teu_capa.focus();
             	   return false;
             	  }
            	 break;
         }
     }
     return true;	 
 }
function initControl() {
	var formObj=document.form;
//	axon_event.addListenerForm('focus', 'obj_activate', formObj);
//	axon_event.addListenerForm('change', 'obj_change', formObj);
//	axon_event.addListenerFormat('keypress', 'obj_keypress', formObj);
//	ComClearSeparator(formObj.cntr_sz_cd, "eng"); //Only English
//	axon_event.addListener('keyup', 'obj_keyup', 'cntr_sz_teu_capa');
	//axon_event.addListener('blur',	'obj_blur',  'cntr_sz_teu_capa');
}
//function obj_keyup(){
//	var obj=ComGetEvent();
//	var val=ComGetUnMaskedValue(obj.value, "float");
//	var tmp=ComAddComma(val);
//	if(tmp) {
//		obj.value=tmp;
//	}else{
//		ComChkObjValid(obj); 
//		obj.focus();
//	} 
//}
function obj_activate(){
	if(ComGetEvent("options")){
		ComGetEvent("focus");
	}else{
		ComGetEvent("select");
	}
}
/**
 * If the data field to be the change Event
 */
function obj_change(){
	var formObj=document.form;
    var sheetObj=sheetObjects[0];
	try {
		var srcName=ComGetEvent("name");
        switch(srcName) {
        	case "cntr_sz_cd":
        		if(formObj.cntr_sz_cd.value.length>0){
        			doActionIBSheet(sheetObj, formObj, IBSEARCH);
        		    if(sheetObj.RowCount("R") == 0) {
        		    	if (G_MDAA_CHK == "Y") { 
        		    		if (ComShowCodeConfirm("COM130407", "Container Size Code")) {
        		    			//formObj.cntr_sz_desc.focus();
             		        } else {
             		        	newPage();	
             		        }
        		    	}	
        		    	else {
        		    		ComShowCodeMessage("COM130402", "Container Size Code");
        		    		newPage();
        		    	}	
        		    }   
        		}
        	break;
        	case "delt_flg":
        		if(formObj.delt_flg.value=='Y'){
    				if(!ComShowConfirm(ComGetMsg("COM12165", "data"))){
    					formObj.delt_flg.value='N';
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
 * KEY PRESS EVENT
 */
//function obj_keypress() {
//	obj=event.srcElement;
//	keyValidation(obj);
//}
 function sheet1_OnSearchEnd(sheet1, ErrMsg){
	 var formObj=document.form;
	 	if (sheet1.RowCount()> 0){
	 		formObj.cntr_sz_cd.value=sheet1.GetCellValue(1, 'sheet1_cntr_sz_cd');
	 		formObj.cntr_sz_desc.value=sheet1.GetCellValue(1, 'sheet1_cntr_sz_desc');
	 		formObj.cntr_sz_teu_capa.value=ComAddComma(sheet1.GetCellValue(1, 'sheet1_cntr_sz_teu_capa'));
	 		formObj.delt_flg.value=sheet1.GetCellValue(1, 'sheet1_delt_flg');
	 		formObj.modi_cntr_sz_cd.value=sheet1.GetCellValue(1, 'sheet1_modi_cntr_sz_cd');
	 		formObj.cre_usr_id.value=sheet1.GetCellValue(1,'sheet1_cre_usr_id');
	        formObj.cre_dt.value=sheet1.GetCellValue(1,'sheet1_cre_dt');
	        formObj.upd_usr_id.value=sheet1.GetCellValue(1,'sheet1_upd_usr_id');
	        formObj.upd_dt.value=sheet1.GetCellValue(1,'sheet1_upd_dt');
	 	}
	}
 function getMdmCntrSz(rowArray) {
		var sheetObj=sheetObjects[0];
	    var formObj=document.form;
	   	var colArray=rowArray[0];
		formObj.cntr_sz_cd.value=colArray[2];		
		doActionIBSheet(sheetObj, formObj, IBSEARCH);
}
