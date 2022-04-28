/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_JOO_0016.js
*@FileTitle  : Combined Monthly Clearance Creation & Inquiry
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/01
=========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class FNS_JOO_0016 : business script for FNS_JOO_0016
 */
//common global variable
var tabObjects=new Array();
var tabCnt=0;
var beforetab=1;
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
var rdCnt=0;
var queryStr="";
var aryPrefix=new Array("sheet1_","sheet2_");
// Event handler processing by button click event */
document.onclick=processButtonClick;
// Event handler processing by button name */
function processButtonClick() {
	/***** setting sheet object *****/
	var sheetObject1=sheetObjects[0];
	var sheetObject2=sheetObjects[1];
	/*******************************************************/
	var formObj=document.form;
	try {
		var srcName=ComGetEvent("name");
		if (srcName == null || srcName == undefined) return;
		switch (srcName) {
			case "btns_back":
		    	sheetObjects[0].RemoveAll();
		    	sheetObjects[1].RemoveAll();
				if (formObj.acct_yrmon.value!=""){
					formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M",-1).substring(0,7);
				}
				UF_resetCondition();
//				formObj.jo_crr_cd.focus();
				break;
			case "btns_next":
				sheetObjects[0].RemoveAll();
		    	sheetObjects[1].RemoveAll();
				if (formObj.acct_yrmon.value!=""){
					formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M", 1).substring(0,7);
				}
				UF_resetCondition();
				//formObj.jo_crr_cd.focus();
				break;
			case "btn_del":
				doActionIBSheet(sheetObject1, formObj, IBDELETE);
				break;
			case "btn_retrieve":
				doActionIBSheet(sheetObject1, formObj, IBSEARCH);
				break;
			case "btn_new":
				UF_resetCondition();
				UF_resetSheets();
//				formObj.acct_yrmon.focus();
				break;
			case "btn_save":
				doActionIBSheet(sheetObject2, formObj, IBSAVE);
				break;
			case "btn_downexcel":
				if(sheetObject2.RowCount() < 1){//no data
					ComShowCodeMessage("COM132501");
		        }else{
		    	   sheetObject2.Down2Excel({ HiddenColumn:1,Merge:1});
		        }
				break;
			case "btn_print":
				rdOpen(formObj);
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
	for (var i=0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1);
		ComEndConfigSheet(sheetObjects[i]);
	}
    for(var k=0;k<comboObjects.length;k++){
        initCombo(comboObjects[k],k+1);
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
//    formObj.acct_yrmon.focus();
}
//handling Axon event 2
function obj_blur(){
    ComChkObjValid(ComGetEvent());
    if (ComGetEvent().name == "acct_yrmon"){
    	sheetObjects[0].RemoveAll();
    	sheetObjects[1].RemoveAll();
    	UF_resetCondition();
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
		case 1: //t1sheet1 init
			with (sheetObj) {
	        var HeadTitle="Lane|Cur.|CFM|AUTH";
	        var headCount=ComCountHeadTitle(HeadTitle);
	        (headCount, 0, 0, true);
	        SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
	        var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	        var headers = [ { Text:HeadTitle, Align:"Center"} ];
	        InitHeaders(headers, info);
	        var cols = [ {Type:"Text",      Hidden:0,  Width:55,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[0]+"rlane_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                     {Type:"Text",      Hidden:0,  Width:55,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[0]+"locl_curr_cd",   KeyField:0,   CalcLogic:"",   Format:"" },
	                     {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[0]+"cmb_cfm_flg", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	               {Type:"Text",      Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[0]+"stl_dup_flg", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
	        InitColumns(cols);
	        SetEditable(1);
	        SetSheetHeight(490);
//	        resizeSheet01();	        
			}
			break;
		case 2: //t1sheet1 init
			with (sheetObj) {
            var HeadTitle="STS|Lane|Item|BSA Type|Cur.|Revenue|Revenue|Revenue|Revenue|Expense|Expense|Expense|Expense|Remark|ACCT_YRMON|JO_CRR_CD|RE_DIVR_CD|STL_VVD_SEQ|STL_SEQ";
            var HeadTitle1="STS|Lane|Item|BSA Type|Cur.|VVD|BSA|Price|Amount|VVD|BSA|Price|Amount|Remark|ACCT_YRMON|JO_CRR_CD|RE_DIVR_CD|STL_VVD_SEQ|STL_SEQ";
            var headCount=ComCountHeadTitle(HeadTitle);
            (headCount, 0, 0, true);
            SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
            var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
            var headers = [ { Text:HeadTitle, Align:"Center"},
                      { Text:HeadTitle1, Align:"Center"} ];
            InitHeaders(headers, info);
            var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"ibflag" },
                {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"rlane_cd",       KeyField:0,   CalcLogic:"",   Format:"" },
                {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"jo_stl_itm_cd",  KeyField:0,   CalcLogic:"",   Format:"" },
                {Type:"Combo",     Hidden:0, Width:150,   Align:"Left",    ColMerge:1,   SaveName:aryPrefix[1]+"jo_stl_jb_cd",   KeyField:0,   CalcLogic:"",   Format:"" },
                {Type:"Text",      Hidden:0,  Width:35,   Align:"Center",  ColMerge:1,   SaveName:aryPrefix[1]+"locl_curr_cd",   KeyField:0,   CalcLogic:"",   Format:"" },
                {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:aryPrefix[1]+"r_vvd",          KeyField:0,   CalcLogic:"",   Format:"" },
                {Type:"Float",     Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:aryPrefix[1]+"r_bsa_qty",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 },
                {Type:"Float",     Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:aryPrefix[1]+"r_bsa_slt_prc",  KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 },
                {Type:"AutoSum",   Hidden:0, Width:100,  Align:"Right",   ColMerge:0,   SaveName:aryPrefix[1]+"r_stl_locl_amt", KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 },
                {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:aryPrefix[1]+"e_vvd",          KeyField:0,   CalcLogic:"",   Format:"" },
                {Type:"Float",     Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:aryPrefix[1]+"e_bsa_qty",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 },
                {Type:"Float",     Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:aryPrefix[1]+"e_bsa_slt_prc",  KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 },
                {Type:"AutoSum",   Hidden:0, Width:100,   Align:"Right",   ColMerge:0,   SaveName:aryPrefix[1]+"e_stl_locl_amt", KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 },
                {Type:"Text",      Hidden:0, Width:90,    Align:"Left",    ColMerge:0,   SaveName:aryPrefix[1]+"stl_rmk" },
                {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:aryPrefix[1]+"acct_yrmon" },
                {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:aryPrefix[1]+"jo_crr_cd" },
                {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:aryPrefix[1]+"re_divr_cd" },
                {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:aryPrefix[1]+"stl_vvd_seq" },
                {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:aryPrefix[1]+"stl_seq" } ];
            InitColumns(cols);
            SetEditable(0);
            SetColProperty(aryPrefix[1]+"jo_stl_jb_cd", {ComboText:gStlComnm, ComboCode:gStlCombo} );
            SetSheetHeight(490);
//            resizeSheet02();            
	        SetCountPosition();
			}
			break;
		case 3: //t1sheet1 init
			sheetObj.SetVisible(false);
			break;
		}
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	if (!validateForm(sheetObj, formObj, sAction))
		return;
	switch (sAction) {
		case IBSEARCH: //retrieve
			UF_resetSheets();
			formObj.rlane_cd.value=UF_getSeletedRlane();
			//retrieving RLANE List when Combined No is not selected
			if (stl_cmb_seq.GetSelectCode()== ""){
				formObj.f_cmd.value=SEARCHLIST01;
				var sXml=sheetObjects[0].GetSearchData("FNS_JOO_0016GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix[0]));
				sheetObjects[0].LoadSearchData(sXml,{Sync:1} );
			//retrieving RLANE List and Settlement when Combined No is selected
			}else{
				formObj.f_cmd.value=SEARCH;
				var sXml=sheetObjects[0].GetSearchData("FNS_JOO_0016GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix));
				var arrXml=sXml.split("|$$|");
				for(var inx=0; inx<arrXml.length; inx++){
					sheetObjects[inx].LoadSearchData(arrXml[inx],{Sync:1} );
				}
			}
			break;
			//retrieving COMBINED info in case of selecting RLANE
		case IBSEARCH_ASYNC01:
			formObj.f_cmd.value=SEARCHLIST02;
			var sXml=sheetObjects[1].GetSearchData("FNS_JOO_0016GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix[1]));
			sheetObjects[1].LoadSearchData(sXml,{Sync:0} );			
			 sheet2_OnSearchEnd(sheetObjects[1], "");			
			break;
		case IBSAVE: //save
			if (!ComShowCodeConfirm("JOO00046")){
				return false;
			}
			formObj.rlane_cd.value=UF_getSeletedRlane();
			formObj.f_cmd.value=MULTI;
			var SaveStr=ComGetSaveString(sheetObjects[1]);
			sheetObj.SetWaitImageVisible(0);
			ComOpenWait(true);			
			var sXml=sheetObj.GetSaveData("FNS_JOO_0016GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix[1]));
			sheetObj.LoadSearchData(sXml,{Sync:0} );
			ComOpenWait(false);
			//retrieving with last index
			doActionIBCombo(sheetObjects[0] , document.form ,IBSEARCH , comboObjects[3] ,"stl_cmb_seq1");			
			break;
		case IBDELETE: // canceling combined data in case of creating slip
			if (!ComShowCodeConfirm("JOO00061")){
				return;
			}
			formObj.f_cmd.value=REMOVE;
			var SaveStr=ComGetSaveString(sheetObjects[1], true, true);
			sheetObj.SetWaitImageVisible(0);
			ComOpenWait(true);
			var sXml=sheetObj.GetSaveData("FNS_JOO_0016GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix[1]));
			
			var delFlg = ComGetEtcData(sXml, "del_flg");
			if(delFlg == "F"){
				ComShowMessage(ComGetSelectSingleNode(sXml,"MESSAGE"));
			}else{
				sheetObj.LoadSearchData(sXml,{Sync:0} );				
			}
			ComOpenWait(false);
			//retrieving with last index
			doActionIBCombo(sheetObjects[0] , document.form ,IBSEARCH , comboObjects[3] ,"stl_cmb_seq2");
			
			break;
	}
}
/**
 * setting Combo basic info 
 * param : comboObj, comboNo
 * initializing sheet 
 */ 
function initCombo(comboObj, comboNo) {
    var formObj=document.form
    switch(comboNo) {  
    	case 1: 
           with (comboObj) { 
				SetMultiSelect(0);
				SetUseAutoComplete(1);
				SetColAlign(0, "left");
				SetColWidth(0, "55");
 				SetDropHeight(160);
 				ValidChar(2,1);//only upper case
 				SetMaxLength(3);
 		    }
            var comboItems=gCrrCombo.split("|");
            addComboItem(comboObj, comboItems);           	
 			break; 
    	case 2: 
            with (comboObj) { 
 				SetMultiSelect(0);
 				SetUseAutoComplete(1);
				SetColAlign(0, "left");
				SetColWidth(0, "55");
  				SetDropHeight(160);
  				ValidChar(2,1);//only upper case
 				SetMaxLength(3);
  		    }
  			break;
    	case 3: 
            with (comboObj) { 
 				SetMultiSelect(0);
 				SetUseAutoComplete(1);
				SetColAlign(0, "left");
				SetColWidth(0, "90");
  				SetDropHeight(160);
  				ValidChar(2,1);//only upper case
 				SetMaxLength(7);
  		    }
			comboObj.RemoveAll();
			comboObj.InsertItem(0, "","");
			comboObj.InsertItem(1, "EXPENSE","E");
			comboObj.InsertItem(2, "REVENUE","R");
  			break;
    	case 4: 
            with (comboObj) { 
 				SetMultiSelect(0);
 				SetUseAutoComplete(1);
				SetColAlign(0, "left");
				SetColAlign(1, "left");
				SetColWidth(0, "55");
				SetColWidth(1, "150");
  				SetDropHeight(160);
  				ValidChar(2,1);//only upper case, numbers
  		    }
  			break;
 	} 
}
// retrieving Lane SVC Type
function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboKey) {
    sheetObj.ShowDebugMsg(false);
    switch(sAction) {
       case IBSEARCH: //TRADE
			//if(validateForm(sheetObj,formObj,sAction))
			if (sComboObj.options.id == "trd_cd") {
				//initializing combo
				sComboObj.RemoveAll();
				comboObjects[3].RemoveAll();
				formObj.f_cmd.value=SEARCHLIST17;
				formObj.code.value="";
				formObj.super_cd1.value=jo_crr_cd.GetSelectCode();
				formObj.super_cd2.value=formObj.acct_yrmon.value; //Item
				var sXml=sheetObj.GetSearchData("JOOCommonGS.do", FormQueryString(formObj));
				//Trade setting
				var comboItems=(",|"+ComGetEtcData(sXml, sComboKey)).split("|"); 
				addComboItem(sComboObj,comboItems);
				//Combined No.
				var codeList=ComGetEtcData(sXml, "combined_no").split("|");
				var nameList=ComGetEtcData(sXml, "slip_no").split("|");
				if (codeList.length == 1 && codeList[0] == ""){
					comboObjects[3].InsertItem(0, " | ", " ");
				}else{
					comboObjects[3].InsertItem(0, " | ", " ");
					for(var i=1; i <=codeList.length; i++){
						comboObjects[3].InsertItem(i, codeList[i-1]+"|"+nameList[i-1], codeList[i-1]);
					}
				}
				//trd_cd.focus();
			}
			// UI개선(201408 민정호)
			else if (sComboObj.options.id == "stl_cmb_seq") {
				//initializing combo
				sComboObj.RemoveAll();
				formObj.f_cmd.value=SEARCHLIST18;
				formObj.code.value="";
				formObj.name.value=trd_cd.GetSelectCode();
				formObj.super_cd1.value=jo_crr_cd.GetSelectCode();
				formObj.super_cd2.value=formObj.acct_yrmon.value; //Item
				var sXml=sheetObj.GetSearchData("JOOCommonGS.do", FormQueryString(formObj));
				//Combined No.
				var codeList=ComGetEtcData(sXml, "combined_no").split("|");
				var nameList=ComGetEtcData(sXml, "slip_no").split("|");
				if (codeList.length == 1 && codeList[0] == ""){
					comboObjects[3].InsertItem(0, " | ", " ");
				}else{
					comboObjects[3].InsertItem(0, " | ", " ");
					for(var i=1; i <=codeList.length; i++){
						comboObjects[3].InsertItem(i, codeList[i-1]+"|"+nameList[i-1], codeList[i-1]);
					}
				}
				//stl_cmb_seq.focus();
				//refreshing stl_cmb_seq after saving, and retrieving with last stl_cmb_seq.
				if (sComboKey=="stl_cmb_seq1"){
					sComboObj.SetSelectIndex(sComboObj.GetItemCount()-1,false);
					comboObjects[1].SetSelectIndex(-1,false);
					comboObjects[2].SetSelectIndex(-1,false);
					comboObjects[1].SetEnable(0);
					comboObjects[2].SetEnable(0);
					doActionIBSheet(sheetObj, formObj, IBSEARCH);
				//delete후 stl_cmb_seq를 refresh하고 stl_cmb_seq를 선택하지 않고  조회한다.
				//refreshing stl_cmb_seq after deleting, and retrieving with not selecting stl_cmb_seq.
				}else if (sComboKey=="stl_cmb_seq2"){
					sComboObj.SetSelectIndex(-1,false);
					comboObjects[1].SetEnable(1);
					comboObjects[2].SetEnable(1);
					doActionIBSheet(sheetObj, formObj, IBSEARCH);
				}
			}
	        break;
    }
}
function UF_resetSheets(){
	var formObj=document.form;
	sheetObjects[0].RemoveAll();
	sheetObjects[1].RemoveAll();
	formObj.bal_jo_crr_cd.value="";
	formObj.balance.value="";
}
//Carrier onchange
function jo_crr_cd_OnChange(comboObj, idx_cd, text){
	comboObjects[1].SetSelectIndex(-1,false);
	comboObjects[3].SetSelectIndex(-1,false);
	comboObjects[1].RemoveAll();
	comboObjects[3].RemoveAll();
	UF_resetSheets();
	
	trd_cd_OnFocus(comboObjects[1]);
}
function trd_cd_OnFocus(comboObj){
	var formObj=document.form;
	if (comboObjects[0].GetSelectCode().length < 3){
		ComShowCodeMessage("JOO00008");
//		formObj.jo_crr_cd.focus();
		return;
	}
	if (comboObj.GetItemCount() == 0){
		comboObj.SetEnable(0);
		doActionIBCombo(sheetObjects[2], formObj, IBSEARCH, comboObj ,"trd_cd");
		comboObj.SetEnable(1);
	}	
}
//TRADE onchange
function trd_cd_OnChange(comboObj, idx_cd, text){	
	UF_resetSheets();
}
function re_divr_cd_OnChange(comboObj, idx_cd, text){
	UF_resetSheets();
	stl_cmb_seq_OnFocus(comboObjects[2]);	
}
function stl_cmb_seq_OnFocus(comboObj){
	var formObj=document.form;
	if (comboObjects[0].GetSelectCode().length < 3){
		ComShowCodeMessage("JOO00008");
//		formObj.jo_crr_cd.focus();
		return;
	}
	if (comboObj.GetItemCount() == 0){
		comboObj.SetEnable(0);
		doActionIBCombo(sheetObjects[2], formObj, IBSEARCH, comboObj, "trd_cd");
		comboObj.SetEnable(1);
	}	
}
function stl_cmb_seq_OnChange(comboObj, idx_cd, text){
	var form=document.form;
	//deactivating R/E in case of existing Combined. No
	if (ComTrim(idx_cd) == ""){
		trd_cd.SetEnable(1);
		re_divr_cd.SetEnable(1);
	}else{
		trd_cd.SetSelectIndex(-1,false);
		re_divr_cd.SetSelectIndex(-1,false);
		trd_cd.SetEnable(0);
		re_divr_cd.SetEnable(0);
	}
	UF_resetSheets();
	//retrieve
	if (idx_cd != "" && form.acct_yrmon.value != "" && jo_crr_cd.GetSelectCode()!= ""){
		doActionIBSheet(sheetObjects[0], form, IBSEARCH);
	}
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	switch (sAction) {
		case IBSEARCH: //retrieve
			if (formObj.acct_yrmon.value.length == 0){
				ComShowCodeMessage('JOO00033');
				//sheetObj.acct_yrmon.focus();
				return false;
			}
			if (jo_crr_cd.GetSelectIndex() == -1){
				ComShowCodeMessage('JOO00008');
//				sheetObj.jo_crr_cd.focus();
				return false;
			}
//			if (trd_cd.Index == -1){
//				ComShowCodeMessage('JOO00009');
//				trd_cd.focus();
//				return false;
//			}
			break;
		case IBSAVE:   //save
			if (formObj.acct_yrmon.value.length == 0){
				ComShowCodeMessage('JOO00033');
//				acct_yrmon.focus();
				return false;
			}
			if (jo_crr_cd.GetSelectIndex() == -1){
				ComShowCodeMessage('JOO00008');
//				sheetObj.jo_crr_cd.focus();
				return false;
			}
//			if (trd_cd.Index == -1){
//				ComShowCodeMessage('JOO00009');
//				trd_cd.focus();
//				return false;
//			}
			//if (stl_cmb_seq.Index != -1){
			if (ComTrim(stl_cmb_seq.GetSelectCode()) != ""){
				ComShowCodeMessage('JOO00094');
//				sheetObj.stl_cmb_seq.focus();
				return false;
			}
			if (sheetObjects[1].HeaderRows()>= sheetObjects[1].LastRow()){
				ComShowCodeMessage('JOO00036');
				return false;
			}
			break;
		case IBDELETE:   //delete
			if (formObj.acct_yrmon.value.length == 0){
				ComShowCodeMessage('JOO00033');
//				sheetObj.acct_yrmon.focus();
				return false;
			}
			if (jo_crr_cd.index == -1){
				ComShowCodeMessage('JOO00008');
//				sheetObj.jo_crr_cd.focus();
				return false;
			}
//			if (trd_cd.Index == -1){
//				ComShowCodeMessage('JOO00009');
//				trd_cd.focus();
//				return false;
//			}
			if (stl_cmb_seq.GetSelectIndex()== -1){
				ComShowCodeMessage('JOO00092');
//				sheetObj.stl_cmb_seq.focus();
				return false;
			}
			var idx_cd=comboObjects[3].GetSelectCode();
			if (comboObjects[3].GetText(idx_cd,1) != ""){
				ComShowCodeMessage('JOO00095');
//				sheetObj.stl_cmb_seq.focus();
				return false;
			}
			if (sheetObjects[1].RowCount()== 0){
				ComShowCodeMessage('JOO00093');
				return false;
			}
			break;
	}
	return true;
}
function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
	var formObj=document.form;
	var aBoolean=false;
	//can ckeck in case of not existing Combined No
	if (ComTrim(comboObjects[3].GetSelectCode()) == ""){
		aBoolean=true;
	}
	for (var inx=sheetObj.HeaderRows(); inx <= sheetObj.LastRow(); inx++){
		//can't select in case of having not authority
		if (sheetObj.GetCellValue(inx, aryPrefix[0]+"stl_dup_flg") == "R"){
			sheetObj.SetCellEditable(inx, aryPrefix[0]+"cmb_cfm_flg",0);
		}else{
			sheetObj.SetCellEditable(inx, aryPrefix[0]+"cmb_cfm_flg",aBoolean);
		}
	}
	//for Deleting
	formObj.rlane_cd.value=UF_getSeletedRlane();
}
function sheet2_OnSearchEnd(sheetObj, ErrMsg) {
	var formObj=document.form;
	sheetObj.SetSumText(0,aryPrefix[1]+"rlane_cd","TOTAL");
	//UI개선(201408 민정호)
    sheetObj.ShowSubSum([{StdCol:aryPrefix[1]+"rlane_cd", SumCols:"8|12"}]);
       
    var own=sheetObj.GetSumValue(0,aryPrefix[1]+"r_stl_locl_amt");
    var crr=sheetObj.GetSumValue(0,aryPrefix[1]+"e_stl_locl_amt");
    var nOwn=(new Number(own)).toFixed(2);
    var nCrr=(new Number(crr)).toFixed(2);
    var balAmt=new Number(Math.abs(nOwn - nCrr)).toFixed(2);
    var balCarrier=jo_crr_cd.GetSelectCode();
    if (own >= crr){
    	balCarrier="OWN";
    }
    formObj.balance.value=balAmt;
    formObj.bal_jo_crr_cd.value=balCarrier;
    ComAddSeparator(formObj.balance,"float");
}
function sheet1_OnChange(sheetObj, Row, Col, Value) {
	var sName=sheetObj.ColSaveName(Col);
	var formObj=document.form;
	if (sName == aryPrefix[0]+"cmb_cfm_flg"){
		
		//NYK Modify 2014.11.04
		if(!isCurrencyChecked(sheetObj, Row, Col)){
			ComShowCodeMessage('JOO00189');//Can not selected a different exchange currency.
			return false;
		}
		
		var rlane=UF_getSeletedRlane();
		formObj.locl_curr_cd.value= sheetObj.GetCellValue(Row,aryPrefix[0]+"locl_curr_cd");
		formObj.rlane_cd.value=rlane;
		doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC01);
	}
}
function rdOpen( formObj){
    var formObj=document.form;
    queryStr="";
    if( !setQueryStr() ){
        return;
    } 
    var rdParam='/rp '+queryStr;
    //NYK Modify 2014.10.07 
    //var strPath="rpt/report/FNS_JOO_0071.mrd"; 
    var strPath="apps/opus/fns/joo/jointoperationagreementsettlement/jointoperationconsultation/report/FNS_JOO_0071.mrd"; 
    formObj.com_mrdPath.value=strPath;
    formObj.com_mrdArguments.value=rdParam;
    ComOpenRDPopup();
}
function setQueryStr(){
    var formObj=document.form;         
    queryStr += " ["+formObj.acct_yrmon.value+"]";
    queryStr += " ["+jo_crr_cd.GetSelectCode()+"]";
    var varStlCmbSeq = ComTrim(stl_cmb_seq.GetSelectCode());
    
    if( varStlCmbSeq== ""){
        ComShowCodeMessage("JOO00092");
        return false;         
    }else{
        queryStr += " ["+varStlCmbSeq+"]";//5  COMB
    }
    var bal_jo_crr_cd=formObj.bal_jo_crr_cd.value;
    queryStr += " ["+bal_jo_crr_cd+"]";           
    return true;
}
/**
 * NYK Modify 2014.11.04
 * 2건의 currency 로 전표를 발행 할 수 없으므로 체크로직 추가
 */
function isCurrencyChecked(sheetObj, Row, Col){
	var chkRows = sheetObj.FindCheckedRow(aryPrefix[0]+"cmb_cfm_flg");
	var arrChkRow = chkRows.split("|");
	var tmpLoclCurrCd = "";
	var iDiffCnt = 0;
	for(idx=0; idx<arrChkRow.length; idx++){
		var iRow = arrChkRow[idx];
		if(idx == 0 ){
			tmpLoclCurrCd = sheetObj.GetCellValue(iRow, aryPrefix[0]+"locl_curr_cd");
		}			
		
		if(idx > 0){ //2번째 Row부터 Currency가 틀린지 체크 한다.
			var tmpNextLoclCurrCd = sheetObj.GetCellValue(iRow, aryPrefix[0]+"locl_curr_cd");
			if(tmpLoclCurrCd != tmpNextLoclCurrCd){
				
				iDiffCnt++;
			}
		}	
	}
	
	if(iDiffCnt > 0){
		//우측 조회된 Lane, Currency Data Checked.
		for(var i=sheetObjects[1].HeaderRows(); i < (sheetObjects[1].LastRow() -1); i++){
			var selRightLane = sheetObjects[1].GetCellValue(i,aryPrefix[1]+"rlane_cd");
			var selRightCurrCd = sheetObjects[1].GetCellValue(i,aryPrefix[1]+"locl_curr_cd");
			
			for (var inx=sheetObjects[0].HeaderRows(); inx <= sheetObjects[0].LastRow(); inx++){
				var selLeftLane = sheetObjects[0].GetCellValue(inx,aryPrefix[0]+"rlane_cd");
				var selLeftCurrCd = sheetObjects[0].GetCellValue(inx,aryPrefix[0]+"locl_curr_cd");
				if(selRightLane == selLeftLane && selRightCurrCd == selLeftCurrCd){
					sheetObj.SetCellValue(inx, aryPrefix[0]+"cmb_cfm_flg", 1, 0);
				}else{
					sheetObj.SetCellValue(inx, aryPrefix[0]+"cmb_cfm_flg", 0, 0);
				}
			}
		}		
		return false;
	}
	
	return true;	
	
}
/**
 * making selected rlane code to AEXAE','FEXAE type
 * @return
 */
function UF_getSeletedRlane(){
	var rlane="";		
	for (var inx=sheetObjects[0].HeaderRows(); inx <= sheetObjects[0].LastRow(); inx++){
		if (sheetObjects[0].GetCellValue(inx, aryPrefix[0]+"cmb_cfm_flg") != "1") continue;
		//rlane += "'"+sheetObjects[0].CellValue(inx, aryPrefix[0]+"rlane_cd")+"',"; 
		rlane += sheetObjects[0].GetCellValue(inx, aryPrefix[0]+"rlane_cd")+",";
	}
	if (rlane.length != 0){
		//rlane = rlane.substring(1);
		//rlane = rlane.substring(0,rlane.length-2);
		rlane=rlane.substring(0,rlane.length-1);
	}
	return rlane;
}
function UF_resetCondition(){
	var formObj=document.form;
	stl_cmb_seq.RemoveAll();
	re_divr_cd.SetSelectIndex(-1,false);
	re_divr_cd.SetEnable(1);
	trd_cd.RemoveAll();
	trd_cd.SetEnable(1);
	jo_crr_cd.SetSelectIndex(-1,false);
}

function resizeSheet01(){
    ComResizeSheet(sheetObjects[0], 80);
}

function resizeSheet02(){
    ComResizeSheet(sheetObjects[1], 80);
}