/*=========================================================
** 1.0 Creation
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0003.js
*@FileTitle  :  Representative Charge
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/03
=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
			   MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
			   OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends
 * @class BCM_CCD_0003 : BCM_CCD_0003 on the screen for creating the script defines the task using.
 */
function BCM_CCD_0003() {
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
/** Event handler processing by button click event */
document.onclick=processButtonClick;
/** Event handler processing by button name */
function processButtonClick() {
	/*****Case more than two additional sheets tab sheet is used to specify a variable *****/
	var sheetObj=sheetObjects[0];
	/** **************************************************** */
	var formObj=document.form;
	var prefix="sheet1_";	
	try {
		var srcName=ComGetEvent("name");
		switch (srcName) {
		case "btn_DownExcel":
			if(sheetObj.RowCount() < 1){//no data	
				ComShowCodeMessage("COM132501");
			}else{	
				sheetObj.Down2Excel( {DownCols: makeHiddenSkipCol(sheetObj), SheetDesign:1,Merge:1,KeyFieldMark:0 });
			}	

			break;
		case "btn_RowAdd":
			var row=sheetObj.DataInsert(-1);
			sheetObj.SetCellValue(row, prefix + "delt_flg","N",0);
			break;	
		case "btn_RowDelete":
			var col = prefix + "delChk";
			var sRow = sheetObj.FindCheckedRow(col);
			if (sRow == "") {
				ComShowCodeMessage("COM12189");
				break;
			}

			var arrRow = sRow.split("|");
			for ( var idx = arrRow.length-1; idx >= 0; idx--) {
				var row = arrRow[idx];
				sheetObj.SetCellValue(row, prefix + "delt_flg","Y",0); // change business status
				

				sheetObj.SetCellValue(row, col, 0, 0); // unchecked
				if( sheetObj.GetRowStatus(row) == "I"){
					sheetObj.RowDelete(row , 0);
				} else {
					sheetObj.SetRowStatus(row, "U"); // change row status as UPDATE
				}
				
			}
			//ComRowHideDelete(sheetObj, prefix + "delChk"); // hide rows
			break;
		case "btn_Retrieve":
			doActionIBSheet(sheetObj, formObj, IBSEARCH);
			break;
		case "btn_Save":
			doActionIBSheet(sheetObj, formObj, IBSAVE);
			break;
		case "btn_New":
			sheetObj.RemoveAll();
			formObj.reset();
			formObj.rep_chg_cd.disabled=false;
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
	doActionIBSheet(sheetObj, formObj, SEARCH02);
	//2. AUTH에 따른 버튼 Enable / Disable 처리 
    if (G_MDAA_CHK == "Y") {
    	ComSetDisplay('btn_Retrieve', true);   
    	ComSetDisplay('btn_New', true);   
    	ComSetDisplay('btn_Save', true);   
    	ComSetDisplay('btn_DownExcel', true);      	
    	ComSetDisplay('btn_RowAdd', true);   
    	ComSetDisplay('btn_RowDelete', true);
    }	
    else {
    	ComSetDisplay('btn_Retrieve', true);   
    	ComSetDisplay('btn_New', true);   
    	ComSetDisplay('btn_Save', false);   
    	ComSetDisplay('btn_DownExcel', true);      	
    	ComSetDisplay('btn_RowAdd', false);   
    	ComSetDisplay('btn_RowDelete', false);
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
		      var HeadTitle1="|Sel.|Code|Description|Status|Create User|Create Date/Time|Last Update User|Last Update Date/Time|EAI_EVNT_DT|EAI_IF_ID";
		      var headCount=ComCountHeadTitle(HeadTitle1);
		      (headCount, 0, 0, false);
		      var prefix="sheet1_";
		
		      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
		
		      var info    = { Sort:0, ColMove:0, HeaderCheck:1, ColResize:0 };
		      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
		      InitHeaders(headers, info);
		
		      var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		             {Type:"CheckBox",  Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"delChk",      KeyField:0,   CalcLogic:"",   Format:"" },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"rep_chg_cd",  KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:3 },
		             {Type:"Text",      Hidden:0,  Width:600,  Align:"Left",    ColMerge:1,   SaveName:prefix+"rep_chg_nm",  KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
		             {Type:"Combo",     Hidden:0, Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"delt_flg",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		             {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_usr_id",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Date",      Hidden:0, Width:150,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_dt",      KeyField:0,   CalcLogic:"",   Format:"YmdHms",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:0, Width:120,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_usr_id",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Date",      Hidden:0, Width:150,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_dt",      KeyField:0,   CalcLogic:"",   Format:"YmdHms",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"eai_evnt_dt", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"eai_if_id",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
		       
		      InitColumns(cols);		
		      SetEditable(1);
		      SetColProperty(0 ,prefix+"rep_chg_cd" , {AcceptKeys:"E|N" , InputCaseSensitive:1});
		      SetColProperty(0 ,prefix+"rep_chg_nm" , {AcceptKeys:"E|N|[ ]" , InputCaseSensitive:1});
		      SetColProperty(prefix+"delt_flg", {ComboText:"Active|Delete", ComboCode:"N|Y"} );
		      //SetSheetHeight(490);
		      resizeSheet();
      }
		break;
	}
}

function resizeSheet(){
	         ComResizeSheet(sheetObjects[0]);
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	switch (sAction) {
	case SEARCH02: // MDM AUTH_TP_CD query
		var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=MDAA';
		var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
		// global var sestting
		G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
		G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
		break;
	case IBSEARCH: //Retrieve
		formObj.f_cmd.value=SEARCH;
		sheetObj.RenderSheet(0);
		var sXml=sheetObj.GetSearchData("BCM_CCD_0003GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_"));
		sheetObj.LoadSearchData(sXml,{Sync:0} );
		sheetObj.RenderSheet(1);
		break;
	case SEARCH01: //Code check
		formObj.f_cmd.value=SEARCH01;
		var sXml=sheetObj.GetSearchData("BCM_CCD_0003GS.do", "f_cmd=" + SEARCH01 +"&rep_chg_cd=" + formObj.repChgCd.value);
		var chk=ComGetEtcData(sXml, "repChgCdChk");
		formObj.repChgCdChk.value=chk ;
		break;	
	case IBSAVE: // Save
		if(!validateForm(sheetObj,formObj,sAction)) return;
		var SaveStr=ComGetSaveString(sheetObj);
		if(SaveStr == undefined || SaveStr.length <= 0 ){
			ComShowCodeMessage("COM130503");
			return;
		}
		formObj.f_cmd.value=MULTI;
		if(ComShowConfirm(ComGetMsg("COM130101", "data"))){
			var sXml=sheetObj.GetSaveData("BCM_CCD_0003GS.do", FormQueryString(formObj) + "&" + SaveStr);
			sheetObj.LoadSaveData(sXml);
    		var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
    		if(result != "F"){
    			ComShowCodeMessage("COM130102", "Data");
    		}else{
    			ComShowCodeMessage("COM130103", "data");
    		}
		}
		doActionIBSheet(sheetObj, formObj, IBSEARCH);
		break;
	}
}
function rep_chg_cd_OnChange() {
	var sheetObj=sheetObjects[0];
    var formObj=document.form;
    doActionIBSheet(sheetObj, formObj, IBSEARCH);
    // Insert mode when no data is
    if(sheetObj.RowCount()==0){
    	sheetObj.SetCellValue(1,'sheet1_ibflag',"I");
    	sheetObj.DataInsert(-1);
    }
}
function initControl() {
	var formObj=document.form;
//	axon_event.addListenerForm('deactivate', 'obj_deactivate', formObj);
//	axon_event.addListenerForm('focus',      'obj_activate',   formObj);
//	axon_event.addListenerFormat('keypress', 'obj_keypress',   formObj);
}
function obj_activate(){
	if(event.srcElement.options){
		event.srcElement.focus();
	}else{
		event.srcElement.select();
	}
}
/**
 * HTML Control in onkeypress event of the English to the input processing.<br>
 **
 function eng_keypress() {
     ComKeyOnlyAlphabet('upper');
 }
 **
 * HTML Control in onkeypress event of the English/numbers to the input processing. <br>
 **
function engnum_keypress() {
	 ComKeyOnlyAlphabet('num', "45|46|47|40|41|32|39|44|38|64");
}
*/
/**
* KEY PRESS EVENT
*/
//function obj_keypress() {
//	obj=event.srcElement;
//	keyValidation(obj);
//}
/**
 * HTML Control loses the focus to handle events that occur.
 */
function obj_deactivate() {
	var formObj=document.form;
	var obj=event.srcElement;
}
/**
 * sheet1 OnChange EVENT HANDLING
 * @param sheetObj
 * @param row
 * @param col
 * @param value
 */
function sheet1_OnChange(sheetObj, row, col, value) {
	var colNm=sheetObj.ColSaveName(col);
	if(colNm == "sheet1_delt_flg") {
		if(value == "Y") {
			if(!ComShowCodeConfirm("COM130301", "data")) sheetObj.SetCellValue(row, col,"N",0);
		}
	}
}
function validateForm(sheetObj, formObj, sAction) {
   with(formObj){
 		for (var i=1; i<=sheetObj.RowCount(); i++) {
 			var cd=sheetObj.GetCellValue(i,"sheet1_rep_chg_cd");
 			var cdNm=sheetObj.GetCellValue(i,"sheet1_rep_chg_nm");
 			var rowSts=sheetObj.GetCellValue(i,"ibflag");
			if(cd == undefined || cd.length <= 0 ){
				ComShowCodeMessage("CCD00001", "Code");
				sheetObj.SelectCell(i,2);
				return false;	
			}else{
				if (sheetObj.GetRowStatus(i) == "I" ){
				formObj.repChgCd.value=cd ;
				doActionIBSheet(sheetObj, formObj, SEARCH01);
				if (formObj.repChgCdChk.value =='Y'){
					ComShowCodeMessage("CCD00006");
					sheetObj.SelectCell(i,2);
					return false;	
				}
			  }
			}
			if(cdNm == undefined || cdNm.length <= 0 ){
				ComShowCodeMessage("CCD00001", "Description");
				sheetObj.SelectCell(i,3);
				return false;	
			}
			// 중복 row check
			for (var j=1; j<=sheetObj.RowCount(); j++) {
				var cdj=sheetObj.GetCellValue(j,"sheet1_rep_chg_cd");
				if (j != i && cd == cdj) {
					ComShowCodeMessage("CCD00004", cd);
					sheetObj.SelectCell(i,2);
					return false;
				}
			}
		  }
        }
    return true;	 
}
