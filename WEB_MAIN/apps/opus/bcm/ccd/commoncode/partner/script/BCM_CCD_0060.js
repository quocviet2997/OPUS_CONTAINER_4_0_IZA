/*=========================================================
** 1.0 Creation
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0060.js
*@FileTitle  :  Credit Customer
*@author     : CLT
*@version    : 1.0
*@since      : 2018/12/19
=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
			   MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
			   OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends
 * @class BCM_CCD_0060 : BCM_CCD_0060 on the screen for creating the script defines the task using.
 */
function BCM_CCD_0060() {
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
		case "btn_Cust":
			doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC01);
    		break;
		case "btn_New":
			sheetObj.RemoveAll();
			formObj.reset();
			formObj.f_btn_gb.value="";
			formObj.f_cust_cd.value="";
			formObj.f_cust_agmt_no.value="";
			break;
		case "btn_History":
			doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC03);
			break;
		case "btn_Retrieve":
			doActionIBSheet(sheetObj, formObj, IBSEARCH);
			break;
		case "btn_RowAdd":
			formObj.f_btn_gb.value = "ADD";
			formObj.f_cust_agmt_no.value = "";
			doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC02);
			break;	
		case "btn_RowEdit":
			if (ComIsNull(formObj.f_cust_agmt_no)) {  
				ComShowCodeMessage("CCD00076", "Credit Agreement No.");
				return;
			}
			doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC02);
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
		      var HeadTitle1="|Seq.|Credit Agreement No|Payment Office|Curr|Credit Amount Limit|Credit Start Date|Credit End Date|O/B Credit Term|I/B Credit Term|Payment Date1|Payment Date2|Payment Date3|Payment Date4|Delete Flag";
		      var headCount=ComCountHeadTitle(HeadTitle1);
		      (headCount, 0, 0, false);
		      var prefix="sheet1_";
		
		      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
		
		      var info    = { Sort:0, ColMove:0, HeaderCheck:1, ColResize:0 };
		      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
		      InitHeaders(headers, info);
		
		      var cols = [ {Type:"Status",	Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag",      	KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                   {Type:"Seq",		Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"Seq" },
				           {Type:"Text",    Hidden:0, Width:150,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cust_agmt_no", 	KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				           {Type:"Text",    Hidden:0, Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cr_clt_ofc_cd",  	KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				           {Type:"Text",    Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"cr_curr_cd",    	KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				           {Type:"Int",    	Hidden:0, Width:150,  Align:"Right",   ColMerge:1,   SaveName:prefix+"cr_amt",  		KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				           {Type:"Date",    Hidden:0, Width:120,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cr_cust_st_dt",   KeyField:0,   CalcLogic:"",   Format:"Ymd",		PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				           {Type:"Date",    Hidden:0, Width:120,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cr_cust_end_dt",  KeyField:0,   CalcLogic:"",   Format:"Ymd",  	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				           {Type:"Text",    Hidden:0, Width:120,  Align:"Center",  ColMerge:1,   SaveName:prefix+"ob_cr_term_dys",  KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				           {Type:"Text",    Hidden:0, Width:120,  Align:"Center",  ColMerge:1,   SaveName:prefix+"ib_cr_term_dys",  KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				           {Type:"Text",    Hidden:0, Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"pay_dt_dy1", 		KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				           {Type:"Text",    Hidden:0, Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"pay_dt_dy2", 		KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				           {Type:"Text",    Hidden:0, Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"pay_dt_dy3", 		KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				           {Type:"Text",    Hidden:0, Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"pay_dt_dy4", 		KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				           {Type:"Text",    Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"delt_flg",   		KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				           {Type:"Text",    Hidden:1, Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"cust_cnt_cd", 	KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				           {Type:"Text",    Hidden:1, Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix+"cust_seq", 		KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				           {Type:"Text",    Hidden:1, Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix+"cust_lgl_eng_nm",	KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:0 }
				           ];
		      
		      InitColumns(cols);		
		      SetEditable(1);
		      //SetSheetHeight(490);
		      resizeSheet();
      }
		break;
	}
}

function resizeSheet(){
	ComResizeSheet(sheetObjects[0], 70);
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	switch (sAction) {
	case IBSEARCH: //Retrieve
		if(!validateForm(sheetObj,formObj,sAction)) return;
		ComOpenWait(true);
		ComBtnEnable("btn_RowAdd");
		formObj.f_cmd.value=SEARCH;
		var prefix="sheet1_";
		var sXml=sheetObj.GetSearchData("BCM_CCD_0060GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_"));
		sheetObj.LoadSearchData(sXml,{Sync:1} );
		var arrXml=sXml.split("|$$|");
		if(ComGetSelectSingleNode(arrXml[0], "MESSAGE") != "") {
			ComShowMessage(ComGetSelectSingleNode(arrXml[0], "MESSAGE"));
			formObj.cust_cd.focus();
		} else {
			formObj.cre_usr_id.value=ComXmlString(arrXml[0],prefix+"cre_usr_id");
			formObj.cre_dt.value=ComXmlString(arrXml[0],prefix+"cre_dt");
			formObj.upd_usr_id.value=ComXmlString(arrXml[0],prefix+"upd_usr_id");
			formObj.upd_dt.value=ComXmlString(arrXml[0],prefix+"upd_dt");
		}
		ComOpenWait(false);
		break;
	case SEARCH01: //cust_lgl_eng_nm search
		formObj.f_cmd.value=SEARCH01;
		var sXml=sheetObj.GetSearchData("BCM_CCD_0060GS.do", FormQueryString(formObj));
		if(ComGetSelectSingleNode(sXml, "MESSAGE") != "") {
			ComShowCodeMessage("CCD00033", "Customer Code");
			ComClearObject(formObj.cust_cd);
			ComClearObject(formObj.cust_lgl_eng_nm);
		} else {
			formObj.cust_lgl_eng_nm.value=ComGetEtcData(sXml,"cust_lgl_eng_nm");
			formObj.cust_agmt_no.focus();
			//doActionIBSheet(sheetObj, formObj, IBSEARCH);
		}
		break;	
	case SEARCH02: //credit customer delete YN
		formObj.f_cmd.value=SEARCH02;
		var cust_cd=ComGetObjValue(formObj.cust_cd);
		var param='?cust_cd='+cust_cd;
		var sXml=sheetObj.GetSearchData("BCM_CCD_0060GS.do", FormQueryString(formObj));
		var deleteYn = ComGetEtcData(sXml,"DELETE_YN");
		if(deleteYn == "Y") {
			if (ComShowCodeConfirm("CCD00079")) {
				window.open('/opuscntr/BCM_CCD_0039.do' + param, '_blank');
			} else {
				sheetObj.RemoveAll();
				formObj.reset();
				formObj.f_btn_gb.value="";
				formObj.f_cust_cd.value="";
				formObj.f_cust_agmt_no.value="";
			}
		} else {
			doActionIBSheet(sheetObj, formObj, SEARCH01);
		}
		break;	
	case IBSEARCH_ASYNC01:	// Search cust
		var cust_cnt_cd=ComGetObjValue(formObj.cust_cd).substring(0,2);
		var cust_seq=ComGetObjValue(formObj.cust_cd).substring(2);
		var classId="BCM_CCD_0061_POP"; 
		var param='?cust_cnt_cd='+cust_cnt_cd+'&cust_seq='+cust_seq+'&pop_yn=Y&classId='+classId;
		ComOpenPopup('/opuscntr/BCM_CCD_0061_POP.do' + param, 900, 450, 'setCallBackCust', '0,0', true, false);
		break;
	case IBSEARCH_ASYNC02: // Add Credit Customer Detail
		if(!validateForm(sheetObj,formObj,sAction)) return;
	case IBSEARCH_ASYNC04: // Modify Credit Customer Detail
		var cust_cd = "";
		if(ComGetObjValue(formObj.f_btn_gb) == "ADD") {
			cust_cd=ComGetObjValue(formObj.cust_cd);
		} else {
			if(sheetObj.RowCount() < 1) {
				cust_cd=ComGetObjValue(formObj.cust_cd);
			} else {
				cust_cd=ComGetObjValue(formObj.f_cust_cd);
			}
		}
		var f_cust_agmt_no=ComGetObjValue(formObj.f_cust_agmt_no);
		var classId="BCM_CCD_0062_POP"; 
		var param='?cust_cd='+cust_cd+'&cust_agmt_no='+f_cust_agmt_no+'&pop_yn=Y&classId='+classId;
		ComOpenPopup('/opuscntr/BCM_CCD_0062_POP.do' + param, 1024, 615, 'setCallBackDetail', '0,0', true, false);
		break;
	case IBSEARCH_ASYNC03:	//Credit Customer History
		if(!validateForm(sheetObj,formObj,sAction)) return;
		var cust_cd=ComGetObjValue(formObj.cust_cd)
		var classId="BCM_CCD_0063_POP"; 
		var param='?cust_cd='+cust_cd+'&pop_yn=Y&classId='+classId;
		ComOpenPopup('/opuscntr/BCM_CCD_0063_POP.do' + param, 1024, 600, 'setCallBackHistory', '0,0', true, false);
		break;
	}
}

function initControl() {
	var formObj=document.form;
	axon_event.addListenerForm ('change', 'obj_change',   formObj);
}

function sheet1_OnSearchEnd(sheetObj, Row, Col, Value) {
	var formObj = document.form;
	if(sheetObj.RowCount() < 1) {
		if (ComIsNull(formObj.cust_cd) == false) {
			if (ComShowCodeConfirm("CCD00080")) {
				formObj.f_cust_agmt_no.value = "";
				doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC02);
			}
		}
	} else {
		var prefix="sheet1_";
		if (ComIsNull(formObj.cust_cd) && ComIsNull(formObj.cust_agmt_no) == false) {
			formObj.cust_cd.value = sheetObj.GetCellValue(1, prefix+"cust_cnt_cd") + sheetObj.GetCellValue(1, prefix+"cust_seq");
			formObj.cust_lgl_eng_nm.value = sheetObj.GetCellValue(1, prefix+"cust_lgl_eng_nm");
		}
	}
}

/** 
 * Validating input value. <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {IBSheet} sheetObj : Sheet object.  
 * @param  {object} formObj : Form object.
 * @param  {sAction} sAction : f_cmd.
 * @return true, false
 * @see #
 * @author 
 * @version 2018.12.19
 */
function validateForm(sheetObj,formObj,sAction){
    with(formObj){
    	switch (sAction) {
    	case IBSEARCH:
    		if (ComIsNull(formObj.cust_cd) && ComIsNull(formObj.cust_lgl_eng_nm) && ComIsNull(formObj.cust_agmt_no) ) {            		
    			ComShowCodeMessage("COM12138", "Customer Code", "Legal English Name or Credit Agreement No");
    			ComSetFocus(form.cust_cd);
    			return false;
    		}
    		break;
    	case IBSEARCH_ASYNC02: // Add
    	case IBSEARCH_ASYNC03: // History
    		if (ComIsNull(formObj.cust_cd) ) {            		
    			ComShowCodeMessage("CCD00001", "Customer Code");
    			ComSetFocus(form.cust_cd);
    			return false;
    		}
    		break;
    	}
    }
    return true;
}

/**
 * Read from Cust Code Pop-up. <br>
 */ 
function setCallBackCust(aryPopupData) {
	var formObj=document.form;
	formObj.cust_cd.value=aryPopupData[0][3];
	formObj.cust_lgl_eng_nm.value=aryPopupData[0][4];
	formObj.cust_agmt_no.value=aryPopupData[0][7];
	doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
} 

/**
 * Read from History Pop-up. <br>
 */ 
function setCallBackHistory(aryPopupData) {
	var formObj=document.form;
	formObj.ofc_cd.value=aryPopupData[0][3];
} 
/**
 * Read from Detail Pop-up. <br>
 */ 
function setCallBackDetail(aryPopupData) {
	var formObj=document.form;
	doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
} 

function obj_change() {
	var formObject=document.form;
	var sheetObject1=sheetObjects[0];
	try {
		var srcName=ComGetEvent("name");
        switch(srcName) {
        	case "cust_cd":	
        		if (formObject.cust_cd.value.length > 2) {
          			if (!ComIsNumber(formObject.cust_cd.value.substring(2,formObject.cust_cd.value.length))) {
    		        	formObject.cust_cd.value = "";
    		        	ComShowCodeMessage("COM130402", "Customer Code"); 	
    		        	ComSetFocus(document.form.cust_cd);	
    		        	return false;
          			}
          			
      			    doActionIBSheet(sheetObject1, formObject, SEARCH02);
		         } else {
        	         ComClearObject(formObject.cust_cd);
        	         ComClearObject(formObject.cust_lgl_eng_nm);
                 }
        		
        		 break;
        }
    } catch(e) {
   		if( e == "[object Error]") {
   			ComShowMessage(OBJECT_ERROR);
   		} else {
   			ComShowMessage(e.message);
   		}
    }
}

function sheet1_OnClick(sheetObj, Row, Col) {
}

/**
 * Handling grid double click process
 */
function sheet1_OnDblClick(sheetObj, Row, Col) {
	var formObj=document.form;
	var prefix="sheet1_";
	var cust_agmt_no=sheetObj.GetCellValue(Row, prefix+"cust_agmt_no");
	var cust_cnt_cd=sheetObj.GetCellValue(Row, prefix+"cust_cnt_cd");
	var cust_seq=sheetObj.GetCellValue(Row, prefix+"cust_seq");
	formObj.f_btn_gb.value = "DTL";
	formObj.f_cust_cd.value = cust_cnt_cd + cust_seq;
	formObj.f_cust_agmt_no.value = cust_agmt_no;
	doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC04);    		
}

/**
 * To-Be Customer 로 전환 
 * @param custCd
 */
function setToBeCustomer(custCd) {
	var formObj=document.form;
	
	formObj.cust_cd.value  = custCd;
	formObj.cust_lgl_eng_nm.value = "";
	formObj.f_cust_agmt_no.value = "";
	
	doActionIBSheet(sheetObjects[0], formObj, SEARCH02);	
}