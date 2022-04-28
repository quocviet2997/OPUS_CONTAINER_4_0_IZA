/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_JOO_0003.js
*@FileTitle  : Inquiry of Vendor / Customer Code
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/22
=========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/

// common global variable
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
// Event handler processing by button click event */
document.onclick=processButtonClick;
// Event handler processing by button name */
function processButtonClick() {
	/***** setting sheet object *****/
	var sheetObject=sheetObjects[0];
	/*******************************************************/
	var formObj=document.form;
	try {
		var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
		switch (srcName) {
			case "btn_retrieve":
				doActionIBSheet(sheetObject, formObj, IBSEARCH);
				break;
			case "btn_downexcel":
				if(sheetObject.RowCount() < 1){//no data
					ComShowCodeMessage("COM132501");
				} else{
					sheetObject.Down2Excel({ HiddenColumn:1,Merge:1});
				}
				break;
		} // end switch
	} catch (e) {
		if (e == "[object Error]") {
			ComShowCodeMessage('JOO00001');
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
 * param : combo_obj
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
function loadPage(crrCombo) {
	for (i=0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1);
		ComEndConfigSheet(sheetObjects[i]);
	}
	//initializing combo
	for(var k=0;k<comboObjects.length;k++){
	    initCombo(comboObjects[k], k+1, crrCombo);
	}
	initControl();
}
/**
 * loading HTML Control event <br>
 * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
 * @param {ibsheet} sheetObj    IBSheet Object
 * @param {int}     sheetNo     sequence number in sheetObjects array
 **/
function initControl() {
	//** Date Separator **/
	DATE_SEPARATOR="-";
	var formObj=document.form;
    //handling Axon event. event catch
	axon_event.addListenerFormat('beforedeactivate', 'obj_blur'    , formObj); 	//- handling code when OnBeforeDeactivate(blur) event
//	axon_event.addListenerFormat('beforeactivate'  , 'obj_focus'   , formObj);   //- handling code when OnBeforeActivate event in case of existing dataformat property
//    axon_event.addListenerFormat('keypress'        , 'obj_keypress', formObj); 	//- handling code when onkeypress event in case of existing dataformat property
//    axon_event.addListenerFormat('keyup'           , 'form_keyup'  , formObj);    
    axon_event.addListener('click', 'change_event_radio', 'delt_flg');
//    formObj.jo_crr_cd.focus();
}
function form_keyup(){
	ComKeyEnter('lengthnextfocus');
}
//radio button click
function change_event_radio(){
	sheetObjects[0].RemoveAll();
}
/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
function initSheet(sheetObj, sheetNo) {
	var cnt=0;
	switch (sheetNo) {
	case 1: //t1sheet1 init
	    with(sheetObj){
		      var HeadTitle="|Carrier|Trade|Lane|Service Provider|Customer|Service Provider / Customer Name|Address|Delete";
		      var prefix="sheet1_";

		      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );

		      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		      var headers = [ { Text:HeadTitle, Align:"Center"} ];
		      InitHeaders(headers, info);

		      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
		             {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:prefix+"jo_crr_cd",       KeyField:0,   CalcLogic:"",   Format:"" },
		             {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:prefix+"trd_cd",          KeyField:0,   CalcLogic:"",   Format:"" },
		             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"rlane_cd",        KeyField:0,   CalcLogic:"",   Format:"" },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"vndr_seq",        KeyField:0,   CalcLogic:"",   Format:"" },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_seq",        KeyField:0,   CalcLogic:"",   Format:"" },
		             {Type:"Text",      Hidden:0,  Width:220,  Align:"Left",    ColMerge:0,   SaveName:prefix+"cust_lgl_eng_nm", KeyField:0,   CalcLogic:"",   Format:"" },
		             {Type:"Text",      Hidden:0,  Width:350,  Align:"Left",    ColMerge:0,   SaveName:prefix+"bzet_addr",       KeyField:0,   CalcLogic:"",   Format:"" },
		             {Type:"Combo",     Hidden:0, Width:60,   Align:"Center",  ColMerge:0,   SaveName:prefix+"delt_flg",        KeyField:0,   CalcLogic:"",   Format:"" } ];

		      SetColProperty(prefix+"delt_flg", {ComboText:"Yes|No", ComboCode:"Y|N"} );
		      InitColumns(cols);
		      SetEditable(0);
//		      SetSheetHeight(500);
		      resizeSheet();
      	}
		break;
	case 2: //t1sheet1 init
		with (sheetObj) {
			SetConfig( { SearchMode:2, DataRowMerge:0 } );
			var info    = { Sort:1, ColMove:1, ColResize:1, HeaderCheck:1 };
			var headers = [{Text:""}];
			InitHeaders(headers, info);
			var cols = [{}];
			InitColumns(cols);
			SetVisible(false);
		}
		break;
	}
}
// initializing combo object
function initCombo(comboObj, comboNo, crrCombo) {
    var formObj=document.form
    switch(comboNo) {  
    	case 1: 
           with (comboObj) { 
				SetMultiSelect(0);
				SetUseAutoComplete(1);
				SetColAlign(0, "left");
 				SetDropHeight(160);
 				SetMaxLength(3);
 				ValidChar(2, 1);
 		    }
            var comboItems=crrCombo.split("|");
            addComboItem(comboObj, comboItems);           	
 			break; 
    	case 2: 
            with (comboObj) { 
 				SetMultiSelect(0);
 				SetUseAutoComplete(1);
				SetColAlign(0, "left");
  				SetDropHeight(160);
 				SetMaxLength(3);
 				ValidChar(2, 1);
  		    }
  			break; 
    	case 3: 
            with (comboObj) { 
 				SetMultiSelect(0);
 				SetUseAutoComplete(1);
				SetColAlign(0, "left");
  				SetDropHeight(160);
 				SetMaxLength(5);
 				ValidChar(2, 1);
  		    }
  			break; 
    } 
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	switch (sAction) {
		case IBSEARCH: // retrieve
			formObj.f_cmd.value=SEARCH;
			var prefix="sheet1_";
			sheetObj.DoSearch("FNS_JOO_0003GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix) );
			break;
	}
}
//retrieving Lane SVC Type
function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboKey) {
    sheetObj.ShowDebugMsg(false);
    switch(sAction) {
       case IBSEARCH: //TRADE
			if (sComboObj.options.id == "trd_cd") {
				//initializing combo
				sComboObj.RemoveAll();
				formObj.f_cmd.value=SEARCH15;
				formObj.code.value="";
				formObj.super_cd1.value=jo_crr_cd.GetSelectCode();
				formObj.super_cd2.value="";
				var sXml=sheetObj.GetSearchData("JOOCommonGS.do", FormQueryString(formObj));
                ComXml2ComboItem(sXml, trd_cd,"code","code");
			}else if (sComboObj.options.id == "rlane_cd"){
				//initializing combo
				sComboObj.RemoveAll();
				formObj.f_cmd.value=SEARCH16;
				formObj.super_cd1.value=jo_crr_cd.GetSelectCode();
				formObj.code.value="";
				formObj.super_cd2.value=trd_cd.GetSelectCode();
				var sXml=sheetObj.GetSearchData("JOOCommonGS.do", FormQueryString(formObj));
				var comboItems=ComGetEtcData(sXml, sComboKey).split("|");
				addComboItem(sComboObj,comboItems);
			}
	        break;
    }
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	with (formObj) {
	}
	return true;
}
//reset in case of changing carrier
function jo_crr_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {//CHECK OLD CODE: OnChange(comboObj, idx_cd, text){
	sheetObjects[0].RemoveAll();
	comboObjects[1].SetSelectIndex(-1, false);
	comboObjects[2].SetSelectIndex(-1, false);
	comboObjects[1].RemoveAll();
	comboObjects[2].RemoveAll();
	trd_cd_OnFocus(comboObjects[1]);
}
//retrieving Trade Code list in case of onFocus event in Trade
function trd_cd_OnFocus(comboObj){
	var formObj=document.form;
	if (comboObj.GetItemCount() == 0){
		comboObj.SetEnable(0);
		doActionIBCombo(sheetObjects[1], formObj, IBSEARCH, comboObj, "trd_cd");
		comboObj.SetEnable(1);
	}
}
//reset in case of changing Trade
function trd_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {//CHECK OLD CODE: OnChange(comboObj, idx_cd, text){
	sheetObjects[0].RemoveAll();
	comboObjects[2].SetSelectIndex(-1,false);
	comboObjects[2].RemoveAll();
	rlane_cd_OnFocus(comboObjects[2]);
}
//retrieving RLANE CODE LIST onFocus event in RLANE Code
function rlane_cd_OnFocus(comboObj){
	var formObj=document.form;
	if (comboObj.GetItemCount() == 0){
		comboObj.SetEnable(0);
		doActionIBCombo(sheetObjects[1] , formObj ,IBSEARCH , comboObj, "rlane_cd");
		comboObj.SetEnable(1);
	}
}
//Reset in case of changing Lane
function rlane_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {//CHECK OLD CODE: OnChange(comboObj, idx_cd, text){
	sheetObjects[0].RemoveAll();
}

function resizeSheet(){
    ComResizeSheet(sheetObjects[0]);
}
