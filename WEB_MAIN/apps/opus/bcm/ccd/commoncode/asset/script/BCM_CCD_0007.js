/*=========================================================
** 1.0 Creation
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0007.js
*@FileTitle  :  Container Type Size
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/03

=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
			   MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
			   THER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/*------------------From here the common JavaScript function is defined.     ------------------*/
function BCM_CCD_0007() {
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
var saveRows=new Array();
var comboObjects=new Array();
var comboCnt=0;
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
			doActionIBSheet(sheetObj, formObj, IBSEARCH);
			break;
		case "btn_Save":
			doActionIBSheet(sheetObj, formObj, IBSAVE);
			break;
		case "btn_New":
			newPage();
			break;
		case "btns_search":
			ComOpenPopup('/opuscntr/COM_ENS_0G1.do?mdm_yn='+formObj.mdm_yn.value, 750, 460, 'getCntr_tpsz_cd', "1,0,1", true);
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
function getCntr_tpsz_cd(rowArray) {
	var sheetObj=sheetObjects[0];
    var formObj=document.form;
   	var colArray=rowArray[0];
	formObj.cntr_tpsz_cd.value=colArray[3];
	doActionIBSheet(sheetObj, formObj, IBSEARCH);
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
 function setComboObject(combo_obj) {  
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
    for (i=0; i < comboObjects.length; i++) {
        initCombo(comboObjects[i], comboObjects[i].options.id);
    }
	initControl();
	//1. AUTH Search  
	doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
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
	doActionIBCombo(sheetObjects[0], formObj, SEARCH01);
}
/**
 * setting Combo text and value
 * param : comboObj, comboNo
 * adding case as numbers of counting combos
 */
function initCombo(comboObj, comboId) {
    with (comboObj) {
        switch (comboId) {
	        case "cntr_tpsz_grp_cd":
	            with (comboObj) {
		            SetColAlign(0, "left");
		            SetColAlign(1, "left");
		            SetColWidth(0, "20");
		            SetColWidth(1, "120");
		            SetDropHeight(200);
		        }
	    	break;
	        case "cntr_tpsz_psa_cd":
	            with (comboObj) {
		            SetColAlign(0, "left");
		            SetColAlign(1, "left");
		            SetColWidth(0, "40");
		            SetColWidth(1, "170");
		            SetDropHeight(200);
		        }
	    	break;
	        case "cntr_tpsz_iso_cd":
	            with (comboObj) {
		            SetColAlign(0, "left");
		            SetColAlign(1, "left");
		            SetColWidth(0, "50");
		            SetColWidth(1, "240");
		            SetDropHeight(200);
		        }
	    	break;
        }
    }
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
	formObj.cntr_tpsz_cd.disabled=false;
	//cntr_tp_cd.text="";
	cntr_tp_cd.SetSelectCode("",true);
	//cntr_sz_cd.text="";
	cntr_sz_cd.SetSelectCode("",true);
	//cntr_tpsz_grp_cd.text="";
	cntr_tpsz_grp_cd.SetSelectCode("",true);
}	
/**
*  All the combo box query
*/
function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
	switch (sAction) {
		case SEARCH01: // load page 
			var sXml=sheetObj.GetSearchData("BCM_CCD_0007GS.do", "f_cmd=" + SEARCH01);
			var rtnValue=sXml.split("|$$|");
			if(rtnValue!=null && rtnValue.length > 1){
				for(var i=0;i<rtnValue.length;i++){
					var frm;
					switch(i){
						case 0:frm=cntr_tp_cd; break;
						case 1:frm=cntr_sz_cd; break;
						case 2:frm=cntr_tpsz_iso_cd; break;
						case 3:frm=cntr_tpsz_psa_cd; break;
						case 4:frm=cntr_tpsz_grp_cd; break;
					}
					ComXml2ComboItem(rtnValue[i], frm, "cd", "cd|cd_desc");
				}
				//ComXml2ComboItem(rtnValue[1], cntr_sz_cd, "cd", "cd|cd_desc");
				/*
				for(var i=0; i<rtnValue.length; i++){
					var comboXml=ComXml2ComboString(rtnValue[i], "cd_desc", "cd|cd_desc");
					if(comboXml!=null){
					}
				}
				*/
			}
		break;
	}
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
		      var HeadTitle1="|CNTR_TPSZ_CD|CNTR_TPSZ_DESC|CNTR_TPSZ_RMK|CNTR_TP_CD|CNTR_SZ_CD|CNTR_TPSZ_LODG_WGT|CNTR_TPSZ_LODG_CAPA|CNTR_TPSZ_TARE_WGT|CNTR_TPSZ_PSA_CD|CNTR_TPSZ_ISO_CD|CNTR_TPSZ_GRP_CD|DELT_FLG|MODI_CNTR_TPSZ_CD|ACIAC_DIV_CD";
		      var headCount=ComCountHeadTitle(HeadTitle1);
		      (headCount, 0, 0, false);
		      var prefix="sheet1_";
		
		      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
		
		      var info    = { Sort:0, ColMove:0, HeaderCheck:1, ColResize:0 };
		      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
		      InitHeaders(headers, info);
		
		      var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cntr_tpsz_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cntr_tpsz_desc",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cntr_tpsz_rmk",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cntr_tp_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cntr_sz_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cntr_tpsz_lodg_wgt",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Float",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cntr_tpsz_lodg_capa", KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cntr_tpsz_tare_wgt",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cntr_tpsz_psa_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cntr_tpsz_iso_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cntr_tpsz_grp_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"delt_flg",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             	 {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"modi_cntr_tpsz_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             	// 2014.12.08 synchronize delt_flg and aciac_div_cd
	             	 {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"aciac_div_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }, 
	             	 {Type:"Text", Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_usr_id",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                 {Type:"Text", Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_dt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                 {Type:"Text", Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_usr_id",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                 {Type:"Text", Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_dt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }];
		       
		      InitColumns(cols);		
		      SetEditable(1);
		      SetVisible(false);		      
            }
		break;
	}
}
// /handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	switch (sAction) {
	case IBSEARCH: // retrieve
		if (validateForm(sheetObj, formObj, sAction)){
			formObj.f_cmd.value=SEARCH;
			//sheetObj.RenderSheet(0);
			ComOpenWait(true);
			var sXml=sheetObj.GetSearchData("BCM_CCD_0007GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_"));
			ComOpenWait(false);
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			//sheetObj.RenderSheet(1);
			formObj.cntr_tpsz_cd.disabled=true;
    	    if(sheetObj.RowCount()== 0){
    	    	sheetObj.DataInsert(-1);
    	    }
		}
		break;
	case SEARCH02: // MDM AUTH_TP_CD query
		var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=MDAA';
		var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
		// global var sestting
		G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
		G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
		break;
	case IBSAVE: // Save
		if(validateForm(sheetObj, formObj, sAction)){
			sheetObj.SetCellValue(1,'sheet1_cntr_tpsz_cd',formObj.cntr_tpsz_cd.value, 0);
			sheetObj.SetCellValue(1,'sheet1_cntr_tpsz_desc',formObj.cntr_tpsz_desc.value, 0);
			sheetObj.SetCellValue(1,'sheet1_cntr_tpsz_rmk',formObj.cntr_tpsz_rmk.value, 0);
			sheetObj.SetCellValue(1,'sheet1_cntr_tp_cd',cntr_tp_cd.GetSelectCode(), 0);
			sheetObj.SetCellValue(1,'sheet1_cntr_sz_cd',cntr_sz_cd.GetSelectCode(), 0);
			sheetObj.SetCellValue(1,'sheet1_cntr_tpsz_lodg_wgt',ComGetUnMaskedValue(formObj.cntr_tpsz_lodg_wgt.value, "int"), 0);
			sheetObj.SetCellValue(1,'sheet1_cntr_tpsz_lodg_capa',ComGetUnMaskedValue(formObj.cntr_tpsz_lodg_capa.value, "int"), 0);
			sheetObj.SetCellValue(1,'sheet1_cntr_tpsz_tare_wgt',ComGetUnMaskedValue(formObj.cntr_tpsz_tare_wgt.value, "int"), 0);
			sheetObj.SetCellValue(1,'sheet1_cntr_tpsz_psa_cd',cntr_tpsz_psa_cd.GetSelectCode(), 0);
			sheetObj.SetCellValue(1,'sheet1_cntr_tpsz_iso_cd',cntr_tpsz_iso_cd.GetSelectCode(), 0);
			sheetObj.SetCellValue(1,'sheet1_cntr_tpsz_grp_cd',cntr_tpsz_grp_cd.GetSelectCode(), 0);
			sheetObj.SetCellValue(1,'sheet1_delt_flg',formObj.delt_flg.value, 0);
			//sheetObj.SetCellValue(1,'sheet1_modi_cntr_tpsz_cd',formObj.modi_cntr_tpsz_cd.value, 0);
			// 2014.12.08 synchronize delt_flg and aciac_div_cd
			if (formObj.delt_flg.value == 'Y')
				sheetObj.SetCellValue(1,'sheet1_aciac_div_cd','I', 0);
			else
				sheetObj.SetCellValue(1,'sheet1_aciac_div_cd','A', 0);			
			
			formObj.f_cmd.value=MULTI;
			if(ComGetSaveString(sheetObj)==""){
				sheetObj.SetCellValue(1,'sheet1_ibflag',"U");
			}
			
			if(ComShowConfirm(ComGetMsg("COM130101", "data"))){
				ComOpenWait(true);
				var sXml=sheetObj.GetSaveData("BCM_CCD_0007GS.do", FormQueryString(formObj) + "&" + ComGetSaveString(sheetObj));
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
                 if (formObj.cntr_tpsz_cd.value.length == 0){
                	 ComShowCodeMessage("CCD00001", "Type Size Code");
                     formObj.cntr_tpsz_cd.focus();
                     return false;
                 }
                 break;
             case IBSAVE:              	
            	 //alert(window["cntr_tp_cd"].GetSelectCode());      
            	 //alert(window["cntr_tp_cd"].GetSelectText());
            	 //alert(cntr_sz_cd.GetSelectText());
            	 //alert(cntr_tpsz_grp_cd.GetSelectText());
                 if (formObj.cntr_tpsz_cd.value.length == 0){
                	 ComShowCodeMessage("CCD00001", "Type Size Code");
                     formObj.cntr_tpsz_cd.focus();
                     return false;
                 } else if (formObj.cntr_tpsz_desc.value.length == 0){
                	 ComShowCodeMessage("CCD00001", "Type Size Name");
                     formObj.cntr_tpsz_desc.focus();
                     return false;
                 } else if (formObj.cntr_tpsz_rmk.value.length == 0){
                	 ComShowCodeMessage("CCD00001", "Remark");
                	 formObj.cntr_tpsz_rmk.focus();
                	 return false;
                 //}else if (cntr_tp_cd.text.length == 0){
                 }else if (window["cntr_tp_cd"].GetSelectText().length == 0){
                	 ComShowCodeMessage("CCD00001", "Type");
                	 cntr_tp_cd.focus();
                	 return false;
                 }else if (window["cntr_sz_cd"].GetSelectText().length == 0){
                	 ComShowCodeMessage("CCD00001", "Size");
                	 cntr_sz_cd.focus();
                	 return false;
                 }else if (window["cntr_tpsz_grp_cd"].GetSelectText().length == 0){
                	 ComShowCodeMessage("CCD00001", "Cost Group");
                	 cntr_tpsz_grp_cd.focus();
                	 return false;
		         }else if (formObj.cntr_tpsz_cd.value.substr(0,1) != window["cntr_tp_cd"].GetSelectCode()){
		        	 ComShowCodeMessage("CCD00010", "Type");
		        	 cntr_tp_cd.focus();
		        	 return false;
		         }else if (formObj.cntr_tpsz_cd.value.substr(1,2) != window["cntr_sz_cd"].GetSelectCode()){
		        	 ComShowCodeMessage("CCD00010", "Size");
		        	 cntr_sz_cd.focus();
		        	 return false;
		         }  else if (formObj.cntr_tpsz_lodg_wgt.value.length == 0){
                	 ComShowCodeMessage("CCD00001", "Loading Weight(KG)");
                	 formObj.cntr_tpsz_lodg_wgt.focus();
                	 return false;
		         } else if (formObj.cntr_tpsz_lodg_capa.value.length == 0){
                	 ComShowCodeMessage("CCD00001", "Loading Capacity(CBM)");
                	 formObj.cntr_tpsz_lodg_capa.focus();
                	 return false;
		         } else if (formObj.cntr_tpsz_tare_wgt.value.length == 0){
                	 ComShowCodeMessage("CCD00001", "Tare Weight(KG)");
                	 formObj.cntr_tpsz_tare_wgt.focus();
                	 return false;
		         }
            	 break;
         }
     }
     return true;	 
 }
function initControl() {
	var formObj=document.form;
	//axon_event.addListenerForm('deactivate', 'obj_deactivate', formObj);
	//axon_event.addListenerForm('focus', 'obj_activate', formObj);
	axon_event.addListenerForm('change', 'obj_change', formObj);
//	axon_event.addListenerFormat('keypress', 'obj_keypress', formObj);
//	axon_event.addListener('keyup', 'obj_keyup', 'cntr_tpsz_lodg_wgt');
//	axon_event.addListener('keyup', 'obj_keyup', 'cntr_tpsz_tare_wgt');
//	axon_event.addListener('keyup', 'obj_keyup', 'cntr_tpsz_lodg_capa');
}
/**
* If the data field to be the CHANGE Event
*/
function obj_change(){
	var formObj=document.form;
    var sheetObj=sheetObjects[0];
	try {
		var srcName=ComGetEvent("name");
        switch(srcName) {
       	case "cntr_tpsz_cd":
       		if(formObj.cntr_tpsz_cd.value.length>0){
    			doActionIBSheet(sheetObj, formObj, IBSEARCH);
    		    if(sheetObj.RowCount("R") == 0) {
    		    	if (G_MDAA_CHK == "Y") { 
    		    		if (ComShowCodeConfirm("COM130407", "Container Type/Size Code")) {
    		    			formObj.cntr_tpsz_desc.focus();
         		        } else {
         		        	newPage();	
         		        }
    		    	}	
    		    	else {
    		    		ComShowCodeMessage("COM130402", "Container Type/Size Code");
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
//function obj_keyup(){
//	var obj=event.srcElement;
//	var val=ComGetUnMaskedValue(obj.value, "int");
//	var tmp=ComAddComma(val);
//	if(tmp) {
//		obj.value=tmp;
//	}else{
//		ComChkObjValid(obj); 
//		obj.focus();
//	} 
//}
/**
 * HTML Control loses the focus to handle events that occur.
 */
function obj_deactivate() {
	var formObj=document.form;
	var obj=ComGetEvent();
  	if(obj.dataformat == 'ymd' || obj.dataformat == 'ym' || obj.dataformat == 'float'){
 		ComChkObjValid(obj);
 	}
}
 function sheet1_OnSearchEnd(sheet1, ErrMsg){
	 var formObj=document.form;
	 	if (sheet1.RowCount()> 0){
	 		formObj.cntr_tpsz_cd.value=sheet1.GetCellValue(1,'sheet1_cntr_tpsz_cd');
	 		formObj.cntr_tpsz_desc.value=sheet1.GetCellValue(1,'sheet1_cntr_tpsz_desc');
	 		formObj.cntr_tpsz_rmk.value=sheet1.GetCellValue(1,'sheet1_cntr_tpsz_rmk');
	 		cntr_tp_cd.SetSelectCode(sheet1.GetCellValue(1,'sheet1_cntr_tp_cd'));
	 		cntr_sz_cd.SetSelectCode(sheet1.GetCellValue(1,'sheet1_cntr_sz_cd'));
	 		formObj.cntr_tpsz_lodg_wgt.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_cntr_tpsz_lodg_wgt'));
	 		formObj.cntr_tpsz_lodg_capa.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_cntr_tpsz_lodg_capa'));
	 		formObj.cntr_tpsz_tare_wgt.value=ComAddComma(sheet1.GetCellValue(1,'sheet1_cntr_tpsz_tare_wgt'));
	 		cntr_tpsz_psa_cd.SetSelectCode(sheet1.GetCellValue(1,'sheet1_cntr_tpsz_psa_cd'));
	 		cntr_tpsz_iso_cd.SetSelectCode(sheet1.GetCellValue(1,'sheet1_cntr_tpsz_iso_cd'));
	 		cntr_tpsz_grp_cd.SetSelectCode(sheet1.GetCellValue(1,'sheet1_cntr_tpsz_grp_cd'));
	 		formObj.delt_flg.value=sheet1.GetCellValue(1,'sheet1_delt_flg');
	 		//formObj.modi_cntr_tpsz_cd.value=sheet1.GetCellValue(1,'sheet1_modi_cntr_tpsz_cd');
	 		formObj.cre_usr_id.value=sheet1.GetCellValue(1,'sheet1_cre_usr_id');
	        formObj.cre_dt.value=sheet1.GetCellValue(1,'sheet1_cre_dt');
	        formObj.upd_usr_id.value=sheet1.GetCellValue(1,'sheet1_upd_usr_id');
	        formObj.upd_dt.value=sheet1.GetCellValue(1,'sheet1_upd_dt');
	 		}
	 	}
