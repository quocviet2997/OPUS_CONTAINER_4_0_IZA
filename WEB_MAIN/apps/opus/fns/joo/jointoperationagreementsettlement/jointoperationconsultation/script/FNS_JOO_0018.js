/*=========================================================
*Copyright(c) 2009 CyberLogitec. All Rights Reserved.
*@FileName   FNS_JOO_0018.js
*@FileTitle  : AP CSR Creation Evidence PopUp
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/05
=========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class fn_joo_0018 : business script for fn_joo_0018
 */
// common global variable
var tabObjects=new Array();
var tabCnt=0;
var beforetab=1;
var aryPrefix=new Array("sheet1_", "sheet2_");
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
// Event handler processing by button click event */
document.onclick=processButtonClick;
// Event handler processing by button name */
function processButtonClick() {
	/***** setting sheet object *****/
	var sheetObj1=sheetObjects[0];
	var sheetObj2=sheetObjects[1];
	/*******************************************************/
	var formObj=document.form;
	try {
		var srcName=ComGetEvent("name");
		switch (srcName) {
		case "btn_confirm":
			if (formObj.tax_inv_yrmon.value.length ==0){
				ComShowCodeMessage('JOO00062');
				formObj.tax_inv_yrmon.focus();
				return;
			}
			if (ofc_cd.GetSelectCode().length == 0){
				ComShowCodeMessage('JOO00063');
				//ofc_cd.focus();
				return;
			}
			if (JooGetRadioValue(formObj.doc_evid_tp_cd) == ""){
				ComShowCodeMessage("JOO00178");
				formObj.doc_evid_tp_cd[0].focus();
				return;
			}
			if (formObj.iss_dt.value.length ==0){
				ComShowCodeMessage('JOO00064');
				formObj.iss_dt.focus();
				return;
			}
			if (formObj.jo_xch_rt.value == ""){
				ComShowCodeMessage('JOO00065');
				formObj.jo_xch_rt.focus();
				return;
			}
			var taxPlCd=JooGetRadioValue(formObj.tax_pl_cd);
			var taxInvYrmon=ComReplaceStr(formObj.tax_inv_yrmon.value,"-","");
			var issDt=ComReplaceStr(formObj.iss_dt.value,"-","");
			if (taxInvYrmon != issDt.substring(0,6)){
				ComShowCodeMessage('JOO00066');
				formObj.iss_dt.focus();
				return;
			}
			var row=sheetObj1.LastRow();
			var prefix="sheet1_";
			var itmNm=sheetObj1.GetGetGetCellValue(row, prefix+"itm_nm");
			if (itmNm.length == 0){
				ComShowCodeMessage('JOO00067');
				sheetObj1.SelectCell(row,prefix+"itm_nm",true);
				return;
			}
			var splAmt=sheetObj1.GetGetGetCellValue(row, prefix+"spl_amt");
			if (splAmt.length == 0){
				ComShowCodeMessage('JOO00068');
				sheetObj1.SelectCell(row,prefix+"spl_amt",true);
				return;
			}
			var amt=Number(splAmt);
			if (taxPlCd == "B" && amt < 0){
				ComShowCodeMessage('JOO00069');
				sheetObj1.SelectCell(row,prefix+"spl_amt",true);
				return;
			}
			if (taxPlCd == "R" && amt > 0){
				ComShowCodeMessage('JOO00070');
				sheetObj1.SelectCell(row,prefix+"spl_amt",true);
				return;
			}
			var sndAmt=Number(gSplyAmt);
			var xchRt=Number(ComReplaceStr(formObj.jo_xch_rt.value,",",""));			
			var splAmt=Number(sheetObj1.GetGetGetCellValue(row,prefix+"spl_amt"));
			if (Math.round(sndAmt * xchRt) != splAmt){
				if (!ComShowCodeConfirm('JOO00071'))
					return;
			}
			setInput2Sheet(formObj, sheetObjects[1]);
			comPopupOK();
			break;
		case "btn_cancel":
//			if (!ComShowConfirm("Are you sure to reset all?"))
//				return;
			setInit();
			break;
		case "btn_close":
			ComClosePopup(); 
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
function loadPage() {
	for (i=0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1);
		ComEndConfigSheet(sheetObjects[i]);
	}
    for(var k=0;k<comboObjects.length;k++){
        initCombo(comboObjects[k],k+1);
    }
    initControl();
    setEditable();
    //retrieving in case CRS number exists in parameters
    if (gCsrNo != ""){
    	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
    }else{
    	//in case CRS number not exists and datarow exists
    	if (gRowdata != ""){
    		setParentToChild(document.form, sheetObjects[1]);
    	}else{
    		// retrieving vendor info
	    	if (gVndrSeq != ""){
	        	doActionIBSheet(sheetObjects[1], document.form, IBROWSEARCH);
	    	}
    	}
    }
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
	var formObject=document.form;
    //handling Axon event. event catch
	axon_event.addListenerFormat('blur', 'obj_blur'      , formObject); 	//- handling code when OnBeforeDeactivate(blur) event
	axon_event.addListenerFormat('focus'  , 'obj_focus'     , formObject);            //- handling code when OnBeforeActivate event in case of existing dataformat property
    //axon_event.addListenerFormat('keypress'        , 'obj_keypress'  , formObject); 	//- handling code when onkeypress event in case of existing dataformat property
    //axon_event.addListenerFormat('keyup'           , 'form_keyup'    , formObject);    
    //axon_event.addListener('keypress', 'taxBillNo_keypress', 'tax_inv_yrmon');	
    //axon_event.addListener('keypress', 'iss_dt_keypress', 'iss_dt');	
    //axon_event.addListener('keypress', 'jo_xch_rt_keypress', 'jo_xch_rt');	
}
//handling Axon event 2
function obj_blur(){
    ComChkObjValid(ComGetEvent());
}
function obj_focus(){
    ComClearSeparator(ComGetEvent());
}
function obj_keypress(){
	var src=ComGetEvent("name")
}
function form_keyup(){
	ComKeyEnter('lengthnextfocus');
}
function taxBillNo_keypress(){
	ComKeyOnlyNumber(this, '');
}
function iss_dt_keypress(){
	ComKeyOnlyNumber(this, '');
}
function jo_xch_rt_keypress(){
	ComKeyOnlyNumber(this, '.');
}
function initCombo(comboObj, comboNo) {
    var formObject=document.form
    switch(comboNo) {  
    	case 1: 
           with (comboObj) { 
				SetGetMultiSelect()(0);
				SetGetUseAutoComplete()(0);
				SetColAlign(0, "0");
				SetColAlign(0, "0");
				SetColWidth(0, "0");
				SetColWidth(0, "0");
 				SetGetDropHeight()(160);
 		    }
            var comboItems=gOfcList.split("|");
            addComboItem(comboObj, comboItems);           	
 			break; 
 	} 
}
function ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
	document.form.ofc_cd_text.value=ofc_cd.GetText(parseInt(ofc_cd.GetSelectIndex()), 0);
}
function ofc_cd_OnBlur() {
	document.form.ofc_cd_text.value=ofc_cd.GetText(parseInt(ofc_cd.GetSelectIndex()), 0);
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
			with (sheetObj) {
		        var HeadTitle="순번|품명|공급가액|세액|합계";
		        var headCount=ComCountHeadTitle(HeadTitle);
		        SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataGetRowMerge:1 } );
		        var info={ Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		        var headers=[ { Text:HeadTitle, Align:"Center"} ];
		        InitHeaders(headers, info);
		        var cols=[ {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[0]+"",        KeyField:0,   CalcLogic:"",   Format:"" },
		               {Type:"Text",      Hidden:0,  Width:350,  Align:"Left",    ColMerge:1,   SaveName:aryPrefix[0]+"itm_nm",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		               {Type:"Int",       Hidden:0,  Width:150,  Align:"Right",   ColMerge:1,   SaveName:aryPrefix[0]+"spl_amt", KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		               {Type:"Int",       Hidden:0,  Width:100,  Align:"Right",   ColMerge:1,   SaveName:aryPrefix[0]+"tax_amt", KeyField:0,   CalcLogic:"|2|*0",Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		               {Type:"Int",       Hidden:0,  Width:80,   Align:"Right",   ColMerge:1,   SaveName:aryPrefix[0]+"ttl_amt", KeyField:0,   CalcLogic:"|2|",Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
		        InitColumns(cols);
				SetEditable(1);
				SetSheetHeight(120);
			}
			break;
		case 2: //t1sheet1 init
			with (sheetObj) {
		        var HeadTitle="radio|check|vendor|tax_inv_yrmon|ofc_cd|tax_ser_no|Tax구분|매입세액불공제|흑적자구분|고정자산여부|Tax Type|의제매출분|사업자번호|상호|대표자명|업태|종목|주소|발행일자|환율|공급가액|세액|총합계|품명|계산서발행구분";
		        var headCount=ComCountHeadTitle(HeadTitle);
	//	        (headCount, 0, 0, true);
		        SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataGetRowMerge:1 } );
		        var info={ Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		        var headers=[ { Text:HeadTitle, Align:"Center"} ];
		        InitHeaders(headers, info);
		        var cols=[ {Type:"Radio",     Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"radio",                       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		               {Type:"CheckBox",  Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"check",                       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"vndr_seq",       KeyField:0,   CalcLogic:"",   Format:"" },
		               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"tax_inv_yrmon",  KeyField:0,   CalcLogic:"",   Format:"" },
		               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"ofc_cd",         KeyField:0,   CalcLogic:"",   Format:"" },
		               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"tax_ser_no",     KeyField:0,   CalcLogic:"",   Format:"" },
		               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"tax_div_cd",     KeyField:0,   CalcLogic:"",   Format:"" },
		               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"tax_naid_flg",   KeyField:0,   CalcLogic:"",   Format:"" },
		               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"tax_pl_cd",      KeyField:0,   CalcLogic:"",   Format:"" },
		               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"fa_flg",         KeyField:0,   CalcLogic:"",   Format:"" },
		               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"tax_vat_tp_cd",  KeyField:0,   CalcLogic:"",   Format:"" },
		               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"tax_nsl_flg",    KeyField:0,   CalcLogic:"",   Format:"" },
		               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"spl_rgst_no",    KeyField:0,   CalcLogic:"",   Format:"SaupNo" },
		               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"co_nm",          KeyField:0,   CalcLogic:"",   Format:"" },
		               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"ownr_nm",        KeyField:0,   CalcLogic:"",   Format:"" },
		               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"bzct_nm",        KeyField:0,   CalcLogic:"",   Format:"" },
		               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"bztp_nm",        KeyField:0,   CalcLogic:"",   Format:"" },
		               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"spl_addr",       KeyField:0,   CalcLogic:"",   Format:"" },
		               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"iss_dt",         KeyField:0,   CalcLogic:"",   Format:"" },
		               {Type:"Float",     Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"jo_xch_rt",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 },
		               {Type:"Int",       Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"spl_amt",        KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0 },
		               {Type:"Int",       Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"tax_amt",        KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0 },
		               {Type:"Int",       Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"ttl_amt",        KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0 },
		               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"doc_evid_tp_cd", KeyField:0,   CalcLogic:"",   Format:"" },
		               {Type:"Text",      Hidden:0,  Width:30,   Align:"Left",    ColMerge:1,   SaveName:aryPrefix[1]+"itm_nm",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
		        InitColumns(cols);
	        	SetEditable(1);
              SetColProperty(aryPrefix[1]+"tax_inv_yrmon", {Format:"####-##"} );
              SetColProperty(aryPrefix[1]+"iss_dt", {Format:"####-##-##"} );
              SetVisible(false);
		}
		break;
	}
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	switch (sAction) {
	case IBSEARCH: //retrieve
		formObj.f_cmd.value=SEARCH;
		var sXml=sheetObj.GetSearchData("FNS_JOO_0018GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix));
		var arrXml=sXml.split("|$$|");
		for(var inx=0; inx<arrXml.length; inx++){
			sheetObjects[inx].LoadSearchData(arrXml[inx],{Sync:1} );
		}
		setSheet2Input(formObj, sheetObjects[1]);		
		break;
	case IBROWSEARCH:
		formObj.f_cmd.value=SEARCHLIST01;
        var sXml=sheetObj.GetSearchData("FNS_JOO_0018GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix[1]));
        sheetObj.LoadSearchData(sXml,{Sync:1} );
		setSheet2Input(formObj, sheetObj);		
		sheetObjects[0].DataInsert(-1);
		sheetObjects[0].SetGetCellValue(sheetObjects[0].LastRow(),"radio","1");
		sheetObjects[0].SetGetCellValue(sheetObjects[0].LastRow(),"check","1");
		sheetObjects[1].SetGetCellValue(sheetObjects[1].LastRow(),"radio","1");
		sheetObjects[1].SetGetCellValue(sheetObjects[1].LastRow(),"check","1");
		formObj.tax_inv_yrmon.focus();
        break;
	}
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	switch (sAction) {
		case IBSEARCH: //retrieve
			break;
		case IBSAVE: //save
			setInputToSheet(formObj, sheetObj);
			break;
	}
	return true;
}
/**
 * setting sheet in Html input value
 * @param formObj
 * @param sheetObj
 * @return
 */
function setInput2Sheet(formObj, sheetObj){
	var row=sheetObj.LastRow();
	var pre="sheet2_";
	var prefix="sheet1_";
	var row1=sheetObjects[0].LastRow();
	var form=document.form;
	sheetObj.SetGetCellValue(row, pre+"vndr_seq"     ,form.vndr_seq.value);
	sheetObj.SetGetCellValue(row, pre+"tax_inv_yrmon",ComReplaceStr(form.tax_inv_yrmon.value,"-",""));
	sheetObj.SetGetCellValue(row, pre+"ofc_cd"       ,ofc_cd.GetSelectCode());
	sheetObj.SetGetCellValue(row, pre+"tax_ser_no"   ,"");
	sheetObj.SetGetCellValue(row, pre+"tax_div_cd"   ,JooGetRadioValue(form.tax_div_cd));
	sheetObj.SetGetCellValue(row, pre+"tax_naid_flg" ,JooGetRadioValue(form.tax_naid_flg));
	sheetObj.SetGetCellValue(row, pre+"tax_pl_cd"    ,JooGetRadioValue(form.tax_pl_cd));
	sheetObj.SetGetCellValue(row, pre+"fa_flg"       ,JooGetRadioValue(form.fa_flg));
	sheetObj.SetGetCellValue(row, pre+"tax_vat_tp_cd",JooGetRadioValue(form.tax_vat_tp_cd));
	sheetObj.SetGetCellValue(row, pre+"tax_nsl_flg"  ,JooGetRadioValue(form.tax_nsl_flg));
	sheetObj.SetGetCellValue(row, pre+"spl_rgst_no"  ,ComReplaceStr(form.spl_rgst_no.value,"-",""));
	sheetObj.SetGetCellValue(row, pre+"co_nm"        ,form.co_nm.value);
	sheetObj.SetGetCellValue(row, pre+"ownr_nm"      ,form.ownr_nm.value);
	sheetObj.SetGetCellValue(row, pre+"bzct_nm"      ,form.bzct_nm.value);
	sheetObj.SetGetCellValue(row, pre+"bztp_nm"      ,form.bztp_nm.value);
	sheetObj.SetGetCellValue(row, pre+"spl_addr"     ,form.spl_addr.value);
	sheetObj.SetGetCellValue(row, pre+"iss_dt"       ,ComReplaceStr(form.iss_dt.value,"-",""));
	sheetObj.SetGetCellValue(row, pre+"jo_xch_rt"    ,ComReplaceStr(form.jo_xch_rt.value,",",""));
	sheetObj.SetGetCellValue(row, pre+"spl_amt"      ,ComReplaceStr(form.spl_amt.value,",",""));
	sheetObj.SetGetCellValue(row, pre+"tax_amt"      ,ComReplaceStr(form.tax_amt.value,",",""));
	sheetObj.SetGetCellValue(row, pre+"ttl_amt"      ,ComReplaceStr(form.ttl_amt.value,",",""));
	sheetObj.SetGetCellValue(row, pre+"itm_nm"       ,sheetObjects[0].GetGetGetCellValue(row1,prefix+"itm_nm"));
	sheetObj.SetGetCellValue(row, pre+"doc_evid_tp_cd",JooGetRadioValue(form.doc_evid_tp_cd));
}
/**
 * displaying Html input in Sheet value
 * @param formObj
 * @param sheetObj
 * @return
 */
function setSheet2Input(formObj, sheetObj){
	var prefix="sheet2_";                                                                    
	formObj.tax_inv_yrmon.value=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"tax_inv_yrmon");
	ofc_cd.SetSelectCode(sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"ofc_cd"       ));
	formObj.tax_ser_no.value=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"tax_ser_no"   );
	formObj.tax_div_cd.value=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"tax_div_cd"   );
	formObj.tax_naid_flg.value=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"tax_naid_flg" );
	formObj.tax_pl_cd.value=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"tax_pl_cd"    );
	formObj.fa_flg.value=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"fa_flg"       );
	formObj.tax_vat_tp_cd.value=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"tax_vat_tp_cd");
	formObj.tax_nsl_flg.value=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"tax_nsl_flg"  );
	formObj.spl_rgst_no.value=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"spl_rgst_no"  );
	formObj.vndr_seq.value=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"vndr_seq"     );
	formObj.co_nm.value=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"co_nm"        );
	formObj.ownr_nm.value=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"ownr_nm"      );
	formObj.bzct_nm.value=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"bzct_nm"      );
	formObj.bztp_nm.value=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"bztp_nm"      );
	formObj.spl_addr.value=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"spl_addr"     );
	formObj.iss_dt.value=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"iss_dt"       );
	formObj.jo_xch_rt.value=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"jo_xch_rt"    );
	formObj.spl_amt.value=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"spl_amt"      );
	formObj.tax_amt.value=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"tax_amt"      );
	formObj.ttl_amt.value=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"ttl_amt"      );
	formObj.doc_evid_tp_cd.value=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"doc_evid_tp_cd");
	var taxInvYrmon=sheetObj.GetGetGetCellText(sheetObj.LastRow(),prefix+"tax_inv_yrmon");
	if (taxInvYrmon == null || taxInvYrmon == "" ){
		var lastMonth=ComGetDateAdd(gSysdate, "M", -1, "-"); 
		formObj.tax_inv_yrmon.value=lastMonth.substring(0,7);
		formObj.iss_dt.value=lastMonth.substring(0,8) + ComGetLastDay(ComParseInt(lastMonth.substring(0,4)),ComParseInt(lastMonth.substring(5,7)));
	}
	var taxDivCd=sheetObj.GetGetGetCellText(sheetObj.LastRow(), prefix+"tax_div_cd");
	if (taxDivCd == null || taxDivCd == "")
		taxDivCd="2";
	if (taxDivCd == "1"){
		document.form.tax_div_cd[0].checked=true;
	}else if (taxDivCd == "2"){
		document.form.tax_div_cd[1].checked=true;
	}
	var taxPlCd=sheetObj.GetGetGetCellText(sheetObj.LastRow(), prefix+"tax_pl_cd");
	if (taxPlCd == null || taxPlCd == "")
		taxPlCd="B";
	if (taxPlCd == "B"){
		document.form.tax_pl_cd[0].checked=true;
	}else if (taxPlCd == "R"){
		document.form.tax_pl_cd[1].checked=true;
	}
	var taxVatTpCd=sheetObj.GetGetGetCellText(sheetObj.LastRow(), prefix+"tax_vat_tp_cd");
	if (taxVatTpCd == null || taxVatTpCd == "")
		taxVatTpCd="1";
	if (taxVatTpCd == "1"){
		document.form.tax_vat_tp_cd[0].checked=true;
	}else if (taxVatTpCd == "2"){
		document.form.tax_vat_tp_cd[1].checked=true;
	}
	var taxNaidFlg=sheetObj.GetGetGetCellText(sheetObj.LastRow(), prefix+"tax_naid_flg");
	if (taxNaidFlg==null || taxNaidFlg=="")
		taxNaidFlg="N";
	if (taxNaidFlg == "Y"){
		document.form.tax_naid_flg[0].checked=true;
	}else if (taxNaidFlg == "N"){
		document.form.tax_naid_flg[1].checked=true;
	}
	var faFlg=sheetObj.GetGetGetCellText(sheetObj.LastRow(), prefix+"fa_flg");
	if (faFlg == null || faFlg=="")
		faFlg="N";
	if (faFlg == "Y"){
		document.form.fa_flg[0].checked=true;
	}else if (faFlg == "N"){
		document.form.fa_flg[1].checked=true;
	}
	var taxNslFlg=sheetObj.GetGetGetCellText(sheetObj.LastRow(), prefix+"tax_nsl_flg");
	if (taxNslFlg == null || taxNslFlg =="")
		taxNslFlg="N";
	if (taxNslFlg == "Y"){
		document.form.tax_nsl_flg[0].checked=true;
	}else if (taxNslFlg == "N"){
		document.form.tax_nsl_flg[1].checked=true;
	}
	var docEvidTpCd=sheetObj.GetGetGetCellText(sheetObj.LastRow(), prefix+"doc_evid_tp_cd");
//	if (docEvidTpCd == null || docEvidTpCd =="")
//		docEvidTpCd = "ELECTRONIC";
	if (docEvidTpCd == "ELECTRONIC"){
		document.form.doc_evid_tp_cd[0].checked=true;
	}else if (docEvidTpCd == "PAPER"){
		document.form.doc_evid_tp_cd[1].checked=true;
	}
}
function setParentToChild(form, sheetObj){
	sheetObjects[0].RemoveAll();
	sheetObj.RemoveAll();
	sheetObjects[0].DataInsert(-1);
	sheetObj.DataInsert(-1);
	var arr=gRowdata.split("|");
	for (var i=0; i<=sheetObj.LastCol(); i++){
sheetObj.SetGetCellValue(1, i,arr[i]);
	}
	var pre="sheet2_";
	var pre1="sheet1_";
	form.vndr_seq.value=sheetObj.GetGetGetCellValue(1, pre+"vndr_seq"     );
	form.tax_inv_yrmon.value=sheetObj.GetGetGetCellValue(1, pre+"tax_inv_yrmon");
	ofc_cd.SetSelectCode(sheetObj.GetGetGetCellValue(1, pre+"ofc_cd"       ));
	form.tax_div_cd.value=sheetObj.GetGetGetCellValue(1, pre+"tax_div_cd"   );
	form.tax_naid_flg.value=sheetObj.GetGetGetCellValue(1, pre+"tax_naid_flg" );
	form.tax_pl_cd.value=sheetObj.GetGetGetCellValue(1, pre+"tax_pl_cd"    );
	form.fa_flg.value=sheetObj.GetGetGetCellValue(1, pre+"fa_flg"       );
	form.tax_vat_tp_cd.value=sheetObj.GetGetGetCellValue(1, pre+"tax_vat_tp_cd");
	form.tax_nsl_flg.value=sheetObj.GetGetGetCellValue(1, pre+"tax_nsl_flg"  );
	form.spl_rgst_no.value=sheetObj.GetGetGetCellValue(1, pre+"spl_rgst_no"  );
	form.co_nm.value=sheetObj.GetGetGetCellValue(1, pre+"co_nm"        );
	form.ownr_nm.value=sheetObj.GetGetGetCellValue(1, pre+"ownr_nm"      );
	form.bzct_nm.value=sheetObj.GetGetGetCellValue(1, pre+"bzct_nm"      );
	form.bztp_nm.value=sheetObj.GetGetGetCellValue(1, pre+"bztp_nm"      );
	form.spl_addr.value=sheetObj.GetGetGetCellValue(1, pre+"spl_addr"     );
	form.iss_dt.value=sheetObj.GetGetGetCellText(1, pre+"iss_dt"       );
	form.jo_xch_rt.value=sheetObj.GetGetGetCellText(1, pre+"jo_xch_rt"    );
	form.spl_amt.value=sheetObj.GetGetGetCellText(1, pre+"spl_amt"      );
	form.tax_amt.value=sheetObj.GetGetGetCellText(1, pre+"tax_amt"      );
	form.ttl_amt.value=sheetObj.GetGetGetCellText(1, pre+"ttl_amt"      );
	form.doc_evid_tp_cd.value=sheetObj.GetGetGetCellValue(1, pre+"doc_evid_tp_cd");
	sheetObjects[0].SetGetCellValue(1,pre1+"itm_nm",sheetObj.GetGetGetCellValue(1, pre+"itm_nm" ));
	sheetObjects[0].SetGetCellValue(1,pre1+"spl_amt",sheetObj.GetGetGetCellValue(1, pre+"spl_amt"));
	sheetObjects[0].SetGetCellValue(1,pre1+"tax_amt",sheetObj.GetGetGetCellValue(1, pre+"tax_amt"));
	sheetObjects[0].SetGetCellValue(1,pre1+"ttl_amt",sheetObj.GetGetGetCellValue(1, pre+"ttl_amt"));
	var taxDivCd=sheetObj.GetGetGetCellValue(sheetObj.LastRow(), pre+"tax_div_cd");
	if (taxDivCd == null || taxDivCd == "")
		taxDivCd="2";
	if (taxDivCd == "1"){
		form.tax_div_cd[0].checked=true;
	}else if (taxDivCd == "2"){
		form.tax_div_cd[1].checked=true;
	}
	var taxPlCd=sheetObj.GetGetGetCellText(sheetObj.LastRow(), pre+"tax_pl_cd");
	if (taxPlCd == null || taxPlCd == "")
		taxPlCd="B";
	if (taxPlCd == "B"){
		form.tax_pl_cd[0].checked=true;
	}else if (taxPlCd == "R"){
		form.tax_pl_cd[1].checked=true;
	}
	var taxVatTpCd=sheetObj.GetGetGetCellText(sheetObj.LastRow(), pre+"tax_vat_tp_cd");
	if (taxVatTpCd == null || taxVatTpCd == "")
		taxVatTpCd="1";
	if (taxVatTpCd == "1"){
		form.tax_vat_tp_cd[0].checked=true;
	}else if (taxVatTpCd == "2"){
		form.tax_vat_tp_cd[1].checked=true;
	}
	var taxNaidFlg=sheetObj.GetGetGetCellText(sheetObj.LastRow(), pre+"tax_naid_flg");
	if (taxNaidFlg==null || taxNaidFlg=="")
		taxNaidFlg="N";
	if (taxNaidFlg == "Y"){
		form.tax_naid_flg[0].checked=true;
	}else if (taxNaidFlg == "N"){
		form.tax_naid_flg[1].checked=true;
	}
	var faFlg=sheetObj.GetGetGetCellText(sheetObj.LastRow(), pre+"fa_flg");
	if (faFlg == null || faFlg=="")
		faFlg="N";
	if (faFlg == "Y"){
		form.fa_flg[0].checked=true;
	}else if (faFlg == "N"){
		form.fa_flg[1].checked=true;
	}
	var taxNslFlg=sheetObj.GetGetGetCellText(sheetObj.LastRow(), pre+"tax_nsl_flg");
	if (taxNslFlg == null || taxNslFlg =="")
		taxNslFlg="N";
	if (taxNslFlg == "Y"){
		form.tax_nsl_flg[0].checked=true;
	}else if (taxNslFlg == "N"){
		form.tax_nsl_flg[1].checked=true;
	}	
	var docEvidTpCd=sheetObj.GetGetGetCellText(sheetObj.LastRow(), pre+"doc_evid_tp_cd");
	if (docEvidTpCd == null || docEvidTpCd =="")
		docEvidTpCd="ELECTRONIC";
	if (docEvidTpCd == "ELECTRONIC"){
		form.doc_evid_tp_cd[0].checked=true;
	}else if (docEvidTpCd == "PAPER"){
		form.doc_evid_tp_cd[1].checked=true;
	}
}
/**
 * setting screen Editable
 * @return
 */
function setEditable(){
	var formObj=document.form;
	var bEditable=true;
	var vClassName="input";
	if (gEditable == "N"){
		bEditable=false;
		vClassName="input2"; // readOnly
	}
	formObj.tax_inv_yrmon.readOnly=!bEditable;
	ofc_cd.SetEnable(bEditable);
	for (var inx=0; inx<formObj.tax_pl_cd.length; inx++){
		formObj.tax_pl_cd[inx].disabled=!bEditable;
		formObj.tax_pl_cd[inx].classNmae=vClassName;
	}
	for (var inx=0; inx<formObj.doc_evid_tp_cd.length; inx++){
		formObj.doc_evid_tp_cd[inx].disabled=!bEditable;
		formObj.doc_evid_tp_cd[inx].classNmae=vClassName;
	}
	formObj.iss_dt.readOnly=!bEditable;
	formObj.jo_xch_rt.readOnly=!bEditable;
	formObj.tax_inv_yrmon.className=vClassName;
	ofc_cd.ClassName=vClassName;
	formObj.iss_dt.className=vClassName;
	formObj.jo_xch_rt.className=vClassName;
	sheetObjects[0].SetEditable(bEditable);
}
/**
 * initializing
 * @return
 */
function setInit(){
	var formObj=document.form;
	var lastMonth=ComGetDateAdd(gSysdate, "M", -1, "-"); 
	formObj.tax_inv_yrmon.value=lastMonth.substring(0,7);
	formObj.iss_dt.value=lastMonth.substring(0,8) + ComGetLastDay(ComParseInt(lastMonth.substring(0,4)),ComParseInt(lastMonth.substring(5,7)));
	ofc_cd.SetSelectIndex(-1);
	formObj.tax_pl_cd[0].checked=true;
	formObj.jo_xch_rt.value="";
	sheetObjects[0].RemoveAll();
	sheetObjects[0].DataInsert(-1);
	formObj.tax_inv_yrmon.focus();
}
function sheet1_OnKeyUp(sheetObj, Row, Col, KeyCode, Shift){
	var pre="sheet1_";
	var sName=sheetObj.ColSaveName(Col);
//no support[check again]CLT 	var Value=sheetObj.EditText;
	if (sName == (pre+"spl_amt")){
		document.form.spl_amt.value=Value;
		document.form.tax_amt.value=0;
		document.form.ttl_amt.value=Value;
	}
}
/**
* HTML Control Focus in
*/
function taxBillNo_keyup(){	
	var formObj=document.form;
	if (formObj.tax_inv_yrmon.value.length == 6) {
		var lastYear=formObj.tax_inv_yrmon.value.substring(0,4);
		var lastMonth=formObj.tax_inv_yrmon.value.substring(4,6);
		var lastDay=ComGetLastDay(ComParseInt(lastYear),ComParseInt(lastMonth));
		formObj.iss_dt.value=lastYear + "-" + lastMonth + "-" + lastDay;
	} else {
		formObj.iss_dt.value="";
	}
} 