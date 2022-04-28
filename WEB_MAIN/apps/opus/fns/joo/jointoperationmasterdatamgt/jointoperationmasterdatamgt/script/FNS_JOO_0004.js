/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_JOO_0004.js
*@FileTitle  : Entry and Inquiry of Basic Port Choose by Settlement Item
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
 * @class fns_joo_0004 : business script for fns_joo_0004
 */

//common global variable
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0; 
var gPortComboItem;
//prohibiting in case of Carrier combo change event
var gCopyFlg=false;
//checking whether carrier is changed
var gJoCrrCd="";
var gTrdCd="";
var gRlaneCd="";
// Event handler processing by button click event */
document.onclick=processButtonClick;
var gTdrRdrCd="";
var gTdrRdrNm="";
var gDirCombo="";
var prefix="sheet1_";
// Event handler processing by button name */
function processButtonClick() {
	/***** setting sheet object *****/
	var sheetObject1=sheetObjects[0];
	/*******************************************************/
	var formObj=document.form;
	var srcName=ComGetEvent("name");
	if (srcName == null) {
		return;
	}
	if (!JooBtnClickEnable(srcName)) {
		return;
	}	
	try {
		var srcName=ComGetEvent("name");
		switch (srcName) {
			case "btn_retrieve":
				doActionIBSheet(sheetObject1, formObj, IBSEARCH);
				break;
			case "btn_create":
				var selJoStlOptCd = JooComGetCarrierText(cmb_jo_crr_cd, 3); //jo_stl_opt_cd
				if (selJoStlOptCd == "C"){
					ComShowCodeMessage("JOO00175");
					return;
				}
				doActionIBSheet(sheetObject1, formObj, IBCREATE);
				break;
			case "btn_copy":
				if (sheetObject1.RowCount()== 0){
					ComShowCodeMessage('JOO00011');//"There is no data to copy...");
					return;
				}
				//Copy is possible only retrieved status.
				var iudRowArray=sheetObject1.FindStatusRow("I|U|D");
				var iCnt = 0;
				if(iudRowArray != ""){
					iCnt = iudRowArray.split(";").length;
				}
				if (iCnt > 0){
					ComShowCodeMessage('JOO00012');
					return;
				}
				if (!ComShowCodeConfirm('JOO00013')){ //Are you sure to copy data?
					return;
				}
				
				gJoCrrCd 	= JooComGetCarrierText(cmb_jo_crr_cd, 0); //jo_crr_cd
				gTrdCd 		= JooComGetCarrierText(cmb_jo_crr_cd, 1); //trd_cd
				gRlaneCd 	= JooComGetCarrierText(cmb_jo_crr_cd, 2); //rlane_cd
				
				gCopyFlg=true;
				cmb_jo_crr_cd.SetSelectIndex(-1,false);
				ComSetObjValue(formObj.jo_crr_cd	, "");
				break;
			case "btn_save":
				doActionIBSheet(sheetObject1, formObj, IBSAVE);
				break;
			case "btn_new":
				UF_reset();
				break;
			case "btn_del":
				JooRowHideDelete(sheetObject1, prefix+"del_chk");
				break;
			case "btn_downexcel":
				if(sheetObject1.RowCount() < 1){//no data
					ComShowCodeMessage("COM132501");
			    }else{
			    	sheetObject1.Down2Excel({ HiddenColumn:1,Merge:1});
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
function loadPage(crrCombo,abbrCombo,dirCombo,codeSheet,nameSheet) {
	gTdrRdrCd=codeSheet;
	gTdrRdrNm=nameSheet;
	gDirCombo=dirCombo;
	for (i=0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1, codeSheet, nameSheet);
		ComEndConfigSheet(sheetObjects[i]);
	}
	//retriving only trade at the first time. retriving lane in case trade is changed.
    for(var k=0;k<comboObjects.length;k++){
        initCombo(comboObjects[k],k+1, crrCombo, abbrCombo, dirCombo);
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
	
	//[2015.09.18] New Carrier jo_crr_cd/trd_cd/rlane_cd 조회.
	doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC20);
}

/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */

function initSheet(sheetObj, sheetNo, codeSheet, nameSheet) {
	var cnt=0;
	switch (sheetNo) {
		case 1: //sheet1 init
			with (sheetObj) {
	        if (location.hostname != "")
	            var HeadTitle="STS||Item|Dir|Status|Status|Status|Status|TDR/RDR|Basic|2nd|3rd|Pair Basic|Pair 2nd|Pair 3rd|Settlement Item Full Name|Unit Cost\nBasic Port|Carrier|Trade|Lane|Status";
	            var headCount=ComCountHeadTitle(HeadTitle);
	            SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
	            var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
	            var headers = [ { Text:HeadTitle, Align:"Center"} ];
	            InitHeaders(headers, info);
	           var cols = [ {Type:"Status",    Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
	          {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"del_chk" },
	          {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"jo_stl_itm_cd",         KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	          {Type:"Combo",     Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:prefix+"skd_dir_cd",            KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	          {Type:"Combo",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"agmt_mon_cond_cd",      KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   InsertEdit:0,   InsertEdit:1 },
	          {Type:"Combo",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"agmt_port_cond_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	          {Type:"Combo",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"agmt_port_tp_cond_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	          {Type:"Combo",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"agmt_op_tp_cond_cd",    KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	          {Type:"Combo",     Hidden:0, Width:75,   Align:"Center",  ColMerge:0,   SaveName:prefix+"jo_stl_tgt_tp_cd",      KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	          //{Type:"Text",      Hidden:0, Width:65,   Align:"Center",  ColMerge:0,   SaveName:prefix+"n1st_stl_bzc_port_cd",  KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1	,   EditLen:5  },
	          {Type:"Combo",      Hidden:0, Width:65,   Align:"Center",  ColMerge:0,   SaveName:prefix+"n1st_stl_bzc_port_cd",  KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1	,   EditLen:5  },
	          {Type:"Combo",     Hidden:0, Width:65,   Align:"Center",  ColMerge:0,   SaveName:prefix+"n2nd_stl_bzc_port_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	          {Type:"Combo",     Hidden:0, Width:65,   Align:"Center",  ColMerge:0,   SaveName:prefix+"n3rd_stl_bzc_port_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	          {Type:"Combo",     Hidden:1, Width:65,   Align:"Center",  ColMerge:0,   SaveName:prefix+"n1st_stl_pair_port_cd", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	          {Type:"Combo",     Hidden:1, Width:65,   Align:"Center",  ColMerge:0,   SaveName:prefix+"n2nd_stl_pair_port_cd", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	          {Type:"Combo",     Hidden:1, Width:65,   Align:"Center",  ColMerge:0,   SaveName:prefix+"n3rd_stl_pair_port_cd", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	          {Type:"Text",      Hidden:0,  Width:170,  Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_stl_itm_nm",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	          {Type:"Text",      Hidden:1, Width:70,   Align:"Center",  ColMerge:0,   SaveName:prefix+"uc_bss_port_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	          {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_crr_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	          {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"trd_cd",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	          {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"rlane_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	          {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"stl_tgt_vvd_bss_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
	            InitColumns(cols);
	            SetEditable(1); 
	            SetDataAutoTrim(1);
	            
				InitDataCombo(0, prefix+"agmt_mon_cond_cd"     , UF_getComboStringForSheet(gMnthCondSheet, gMnthNameSheet), gMnthCondSheet);
				InitDataCombo(0, prefix+"agmt_port_cond_cd"    , UF_getComboStringForSheet(gPortCondSheet, gPortNameSheet), gPortCondSheet);
				InitDataCombo(0, prefix+"agmt_port_tp_cond_cd" , UF_getComboStringForSheet(gPortTypeSheet, gPtTpNameSheet), gPortTypeSheet);
				InitDataCombo(0, prefix+"agmt_op_tp_cond_cd"   , UF_getComboStringForSheet(gOperTypeSheet, gOperNameSheet), gOperTypeSheet);
				
	            SetColProperty(0, prefix+"skd_dir_cd", {ComboText:"E|W|N|S", ComboCode:"E|W|N|S"} );
	            SetColProperty(0, prefix+"jo_stl_tgt_tp_cd"		, {ComboText:nameSheet	, ComboCode:codeSheet});   
	            SetColProperty(0, prefix+"n1st_stl_bzc_port_cd" , {AcceptKeys:"E"		, InputCaseSensitive:1});	
				SetSheetHeight(480);
				resizeSheet();
			}
			break;
			
		case "2" :
			with (sheetObj) {
		        if (location.hostname != "")
		            var HeadTitle="||||||||||"; //11
		        var headCount=ComCountHeadTitle(HeadTitle);
		        SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
		        var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
		        var headers = [ { Text:HeadTitle, Align:"Center"} ];
		        InitHeaders(headers, info);
		        var cols = 
		        	[ {Type:"Status",   Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
			          {Type:"Text",     Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"jo_crr_auth_cd",		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			          {Type:"Text",     Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",          	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			          {Type:"Text",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"acct_yrmon",      	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			          {Type:"Text",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"super_cd1",     		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			          {Type:"Text",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"auth_delcheck_yn",	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			          {Type:"Text",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"super_cd2",    		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			          {Type:"Text",     Hidden:0, Width:75,   Align:"Center",  ColMerge:0,   SaveName:"name",      			KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			          {Type:"Text",     Hidden:0, Width:65,   Align:"Center",  ColMerge:0,   SaveName:"jo_crr_cd",  		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			          {Type:"Text",     Hidden:0, Width:65,   Align:"Center",  ColMerge:0,   SaveName:"code",  				KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			          {Type:"Text",     Hidden:0, Width:65,   Align:"Center",  ColMerge:0,   SaveName:"sort_key",  			KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			          ];
	            InitColumns(cols);
	            SetEditable(1);
			    SetVisible(0);
				SetSheetHeight(70);
			}
			break;
	
		}
}

//handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	if (!validateForm(sheetObj, formObj, sAction))
		return;
	switch (sAction) {
		case IBSEARCH: //retrieve
			sheetObj.RemoveAll();
			gCopyFlg=false;
			formObj.f_cmd.value=SEARCH;
			sheetObj.DoSearch("FNS_JOO_0004GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix) );
			break;
		case IBCREATE: //CREATE
			gCopyFlg=false;
			sheetObj.RemoveAll();
			formObj.f_cmd.value=SEARCHLIST01;
			sheetObj.DoSearch("FNS_JOO_0004GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix), {Sync:2}  );
				
			break;
		//getting port in case of changing Rlane
		case IBROWSEARCH:
			gCopyFlg=false;
			
			formObj.f_cmd.value=SEARCHLIST11;
			formObj.code.value="";			
			formObj.super_cd1.value=JooComGetCarrierText(cmb_jo_crr_cd, 2); //rlane_cd
			formObj.super_cd2.value="";
			
			var sXml=sheetObjects[1].GetSearchData("JOOCommonGS.do", FormQueryString(formObj));
	        var basicPortCombo=ComGetEtcData(sXml, "portCode");
	        var portCombo="     |";
	        portCombo += basicPortCombo;
	        sheetObj.SetColProperty(prefix+"n1st_stl_bzc_port_cd", {ComboText:basicPortCombo, ComboCode:basicPortCombo} );
	        sheetObj.SetColProperty(prefix+"n2nd_stl_bzc_port_cd", {ComboText:portCombo, ComboCode:portCombo} );
	        sheetObj.SetColProperty(prefix+"n3rd_stl_bzc_port_cd", {ComboText:portCombo, ComboCode:portCombo} );
	        sheetObj.SetColProperty(prefix+"n1st_stl_pair_port_cd", {ComboText:basicPortCombo, ComboCode:basicPortCombo} );
	        sheetObj.SetColProperty(prefix+"n2nd_stl_pair_port_cd", {ComboText:portCombo, ComboCode:portCombo} );
	        sheetObj.SetColProperty(prefix+"n3rd_stl_pair_port_cd", {ComboText:portCombo, ComboCode:portCombo} );
	        sheetObj.SetColProperty(prefix+"uc_bss_port_cd", {ComboText:portCombo, ComboCode:portCombo} );
	        //jo_stl_itm_cd.focus();
	        var basicVslSlanDirCombo=ComGetEtcData(sXml, "vslSlanDirCode");
	        var vslSlanDirCombo="     |";
	        vslSlanDirCombo += basicVslSlanDirCombo;
	        sheetObj.SetColProperty(prefix+"skd_dir_cd", {ComboText:vslSlanDirCombo, ComboCode:vslSlanDirCombo} );
	        
	        //Dir Combo
	        initDirCombo(basicVslSlanDirCombo);
	        /*comboObjects[4].RemoveAll();
	        var comboItems=vslSlanDirCombo.split("|");
            UF_addComboItem(comboObjects[4], comboItems);*/
	        
	        break;
		case IBSAVE: //save
			var SaveStr=ComGetSaveString(sheetObjects[0]);
			if (SaveStr == ""){
				ComShowCodeMessage("JOO00036");
				return false;
			}
			if (!ComShowCodeConfirm("JOO00046")){
				return false;
			}
			formObj.f_cmd.value=MULTI;
			sheetObj.SetWaitImageVisible(0);
			ComOpenWait(true);
			var sXml=sheetObj.GetSaveData("FNS_JOO_0004GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			ComOpenWait(false);
			var RTNVAL=ComGetEtcData(sXml, "RTNVAL");
			if (RTNVAL == "E"){
				if (ComShowCodeConfirm("JOO00145")){
					doActionIBSheet(sheetObj, document.form, IBCOPYROW);					
				}
			}else if (RTNVAL == "W"){
				ComShowCodeMessage("JOO00146");
			}else{
				sheetObj.LoadSearchData(sXml,{Sync:0} );
				doActionIBSheet(sheetObj, document.form, IBSEARCH);				
			}
			break;
		case IBCOPYROW: //inputting after deleting
			formObj.f_cmd.value=SEARCH01;
			var SaveStr=ComGetSaveString(sheetObjects[0]);
			sheetObj.SetWaitImageVisible(0);
			ComOpenWait(true);
			var sXml=sheetObj.GetSaveData("FNS_JOO_0004GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			ComOpenWait(false);
			sheetObj.LoadSearchData(sXml,{Sync:0} );
			doActionIBSheet(sheetObj, document.form, IBSEARCH);				
			break;
			
		case IBSEARCH_ASYNC20 : //2015.09.17 MultiCombo Rlane CD			
			var params = "";					
			params += "f_cmd=" + SEARCH21; 
			params += "&jo_stl_itm_cd=";	 			
			params += "&re_divr_cd="; 
			
			var sXml = sheetObj.GetSearchData("JOOCommonGS.do", params);
			ComXml2ComboItem(sXml, cmb_jo_crr_cd, "grp_key", "jo_crr_cd|trd_cd|rlane_cd|jo_stl_opt_cd|jo_crr_auth_cd");
			break;
	}
}

function initCombo(comboObj, comboNo, crrCombo, abbrCombo, dirCombo) {
    var formObj=document.form
    
    switch(comboNo) { 
		case 1: 
	        with (comboObj) { 
				SetMultiSelect(0);
				SetUseAutoComplete(1);
				SetTitleVisible(1);//title
				SetTitle("Carrier|Trade|Lane|S.Option|Auth")
				SetColAlign(0, "center");
				SetColAlign(1, "center");
				SetColAlign(2, "center");
				SetColAlign(3, "center");
				SetColAlign(4, "center");
				SetColWidth(0, "40");
				SetColWidth(1, "40");
				SetColWidth(2, "60");
				SetColWidth(3, "60");
				SetColWidth(4, "0");
				SetDropHeight(200);
				ValidChar(2,1);//only upper case, numbers
				SetEditable(1);
				SetSelectIndex(0);
		    }
			break;
    	case 2: 
            with (comboObj) { 
 				SetMultiSelect(0);
 				SetUseAutoComplete(1);
				SetColAlign(0, "left");
  				SetDropHeight(160);
  				ValidChar(2,1);//only upper case, special characters
 				SetMaxLength(3);
 				SetSelectIndex(0);
  		    }
            var comboItems=abbrCombo.split("|");
            UF_addComboItem(comboObj, comboItems);           	
  			break;
    	case 3: 
            with (comboObj) { 
 				SetMultiSelect(0);
 				SetUseAutoComplete(1);
				SetColAlign(0, "left");
  				SetDropHeight(160);
  				ValidChar(2,1);//only upper case
 				SetMaxLength(1);
 				SetSelectIndex(0);
  		    }
            initDirCombo(dirCombo);
            /*
            var comboItems=dirCombo.split("|");
            comboObj.InsertItem(0, "","");
            for(var i=0; i< comboItems.length; i++){
            	//comboObj.InsertItem(i+1, comboItems[i]+"|"+comboItems[i]);
            	comboObj.InsertItem(i+1, comboItems[i],comboItems[i]);//NYK Modify 2014.10.21
            }*/
  			break; 			
 	} 
}

//jo_crr_cd|trd_cd|rlane_cd|jo_stl_opt_cd|jo_crr_auth_cd
function cmb_jo_crr_cd_OnChange(comboObj, OldIndex, OldText, OldCode, NewIndex, NewText, NewCode) { 
	if(OldIndex == NewIndex) return;
	
	var formObj = document.form;
	//comboObj.GetText(NewIndex, 0);
	/*var selIdx			= comboObj.GetSelectCode();
	var selJoCrrCd 		= comboObj.GetText(selIdx, 0); //jo_crr_cd
	var selTrdCd 		= comboObj.GetText(selIdx, 1); //trd_cd
	var selRlaneCd 		= comboObj.GetText(selIdx, 2); //rlane_cd
	var selJoStlOptCd 	= comboObj.GetText(selIdx, 3); //jo_stl_opt_cd
	var selCrrAuthCd 	= comboObj.GetText(selIdx, 4); //jo_crr_auth_cd
	*/
	var selJoCrrCd 		= JooComGetCarrierText(comboObj, 0); //jo_crr_cd
	var selTrdCd 		= JooComGetCarrierText(comboObj, 1); //trd_cd
	var selRlaneCd 		= JooComGetCarrierText(comboObj, 2); //rlane_cd
	var selJoStlOptCd 	= JooComGetCarrierText(comboObj, 3); //jo_stl_opt_cd
	var selCrrAuthCd 	= JooComGetCarrierText(comboObj, 4); //jo_crr_auth_cd
	
	if (gCopyFlg){
		//error message
		if (gJoCrrCd == selJoCrrCd){
			ComShowCodeMessage('JOO00014'); //Please select different carrier code.
			cmb_jo_crr_cd.SetSelectIndex(-1,false);
			ComSetObjValue(formObj.jo_crr_cd	, "");
			return;
		}
		if(gTrdCd != selTrdCd && gRlaneCd != selRlaneCd){
			ComShowCodeMessage('JOO00209'); //Please select same Trade & Revenue Lane.
			cmb_jo_crr_cd.SetSelectIndex(-1,false);
			ComSetObjValue(formObj.jo_crr_cd	, "");
			return;
		}
		
		for (var inx=sheetObjects[0].HeaderRows(); inx <= sheetObjects[0].LastRow(); inx++){
			sheetObjects[0].SetCellValue(inx,prefix+"jo_crr_cd"	,selJoCrrCd,0);
			sheetObjects[0].SetCellValue(inx,prefix+"trd_cd"	,selTrdCd,0);
			sheetObjects[0].SetCellValue(inx,prefix+"rlane_cd"	,selRlaneCd,0);
			sheetObjects[0].SetRowStatus(inx,"I");
		}
		
		ComSetObjValue(formObj.jo_crr_cd	, selJoCrrCd);
		ComSetObjValue(formObj.trd_cd		, selTrdCd);
		ComSetObjValue(formObj.rlane_cd		, selRlaneCd);
		ComSetObjValue(formObj.jo_stl_opt_cd, selJoStlOptCd);
		
		gCopyFlg = false;
		
	}else{
		
		initDirCombo(gDirCombo);
		
		ComSetObjValue(formObj.jo_crr_cd	, selJoCrrCd);
		ComSetObjValue(formObj.trd_cd		, selTrdCd);
		ComSetObjValue(formObj.rlane_cd		, selRlaneCd);
		ComSetObjValue(formObj.jo_stl_opt_cd, selJoStlOptCd);
		
		setAuth(selCrrAuthCd); //Button Control by AUTH_CD 
		
		sheetObjects[0].RemoveAll();
		
		doActionIBSheet(sheetObjects[0], formObj, IBROWSEARCH);//Combo로 setting sheet combo
		
	}
}

function setAuth(auth){
	if (auth == null || auth == undefined){
		auth="R";
	}
	var editable=true;
	if (auth == "R"){
		editable=false;
	}
	JooSetBtnClass("C", editable);
	for (var i=0; i < sheetObjects.length; i++) {
		if(editable){
			sheetObjects[i].SetEditable(1);			
		}else{
			sheetObjects[i].SetEditable(0);			
		}
		
	}
}
//clear in case of changing ABBR
function jo_stl_itm_cd_OnChange(comboObj, idx_cd, text){
	sheetObjects[0].RemoveAll();
}
//clearing in case of changing DIR
function skd_dir_cd_OnChange(comboObj, idx_cd, text){
	sheetObjects[0].RemoveAll();
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	//sheetObj.ShowDebugMsg(false);
	switch (sAction) {
		case IBCREATE: //retrieve

			if (ComIsEmpty(formObj.jo_crr_cd)){
				ComShowCodeMessage('JOO00008');
				return false;
			}
			if (ComIsEmpty(formObj.trd_cd)){
				ComShowCodeMessage('JOO00009');
				return false;
			}
			if (ComIsEmpty(formObj.rlane_cd)){
				ComShowCodeMessage('JOO00010');
				return false;
			}
			
			if (jo_stl_itm_cd.GetSelectCode().length != 0){
				ComShowCodeMessage('JOO00015');
				jo_stl_itm_cd.SetSelectIndex(-1,false);
				skd_dir_cd.SetSelectIndex(-1,false);
				return false;
			}
			if (skd_dir_cd.GetSelectCode().length != 0){
				ComShowCodeMessage('JOO00016');
				skd_dir_cd.SetSelectIndex(-1,false);
				return false;
			}
			break;
		case IBSEARCH: //retrieve

			if (ComIsEmpty(formObj.jo_crr_cd)){
				ComShowCodeMessage('JOO00008');
				return false;
			}
			if (ComIsEmpty(formObj.trd_cd)){
				ComShowCodeMessage('JOO00009');
				return false;
			}
			if (ComIsEmpty(formObj.rlane_cd)){
				ComShowCodeMessage('JOO00010');
				return false;
			}
			break;
		case IBSAVE:   //save

			if (ComIsEmpty(formObj.jo_crr_cd)){
				ComShowCodeMessage('JOO00008');
				return false;
			}
			if (ComIsEmpty(formObj.trd_cd)){
				ComShowCodeMessage('JOO00009');
				return false;
			}
			if (ComIsEmpty(formObj.rlane_cd)){
				ComShowCodeMessage('JOO00010');
				return false;
			}
			var joStlOptCd 	= JooComGetCarrierText(cmb_jo_crr_cd, 3); //jo_stl_opt_cd
			for(var inx=sheetObj.HeaderRows(); inx <= sheetObj.LastRow(); inx++){
				var status=sheetObj.GetRowStatus(inx);
				if (status == "R" || status == "D") 
					continue;
				//to prohibit that del_chk is checked and Row Delete button is not clicked.
				if ((status == "I" || status == "U") && sheetObj.GetCellValue(inx, prefix+"del_chk") == "1" && !sheetObj.GetRowHidden(inx)){
					ComShowCodeMessage("JOO00079");
					sheetObj.SelectCell(inx,prefix+"del_chk",true);
					return false;
				}
				var joStlItmCd=sheetObj.GetCellValue(inx,prefix+"jo_stl_itm_cd");
				if (joStlItmCd == ""){
					ComShowCodeMessage('JOO00017', inx);
					sheetObj.SelectCell(inx,prefix+"jo_stl_itm_cd",true);
					return false;
				}
				var skdDirCd=sheetObj.GetCellValue(inx,prefix+"skd_dir_cd");
				if (skdDirCd == ""){
					ComShowCodeMessage('JOO00018', inx);
					sheetObj.SelectCell(inx,prefix+"skd_dir_cd",true);
					return false;
				}
//				var stlTgtVvdBssCd = sheetObj.CellValue(inx,prefix+"stl_tgt_vvd_bss_cd"); 
//				if (stlTgtVvdBssCd == ""){
//					ComShowCodeMessage('JOO00019', inx);
//					sheetObj.SelectCell(inx,prefix+"stl_tgt_vvd_bss_cd",true);
//					return false;
//				}
				var mnthCondCd=sheetObj.GetCellValue(inx,prefix+"agmt_mon_cond_cd");
				if (mnthCondCd == ""){
					ComShowCodeMessage('JOO00019', inx + " Month Option ");
					sheetObj.SelectCell(inx,prefix+"agmt_mon_cond_cd",true);
					return false;
				}
				var portCondCd=sheetObj.GetCellValue(inx,prefix+"agmt_port_cond_cd");
				if (portCondCd == ""){
					ComShowCodeMessage('JOO00019', inx + " Port Option ");
					sheetObj.SelectCell(inx,prefix+"agmt_port_cond_cd",true);
					return false;
				}
				//PortCondCd, PortTypeCd are optional in case of Round
				//First, Last are necessary.
				if (joStlOptCd == "B" || joStlOptCd == "C"){
					var portTypeCd=sheetObj.GetCellValue(inx,prefix+"agmt_port_tp_cond_cd");
					if (portTypeCd == ""){
						ComShowCodeMessage('JOO00019', inx + " Port Type ");
						sheetObj.SelectCell(inx,prefix+"agmt_port_tp_cond_cd",true);
						return false;
					}
				}
				var operTypeCd=sheetObj.GetCellValue(inx,prefix+"agmt_op_tp_cond_cd");
				if (operTypeCd == ""){
					ComShowCodeMessage('JOO00019', inx + " Operation Type ");
					sheetObj.SelectCell(inx,prefix+"agmt_op_tp_cond_cd",true);
					return false;
				}
				var joStlTgtTpCd=sheetObj.GetCellValue(inx,prefix+"jo_stl_tgt_tp_cd");
				if (joStlTgtTpCd == ""){
					ComShowCodeMessage('JOO00020', inx);
					sheetObj.SelectCell(inx,prefix+"jo_stl_tgt_tp_cd",true);
					return false;
				}
				var bss1st=sheetObj.GetCellValue(inx,prefix+"n1st_stl_bzc_port_cd");
				var bss2nd=sheetObj.GetCellValue(inx,prefix+"n2nd_stl_bzc_port_cd");
				var bss3rd=sheetObj.GetCellValue(inx,prefix+"n3rd_stl_bzc_port_cd");
				var par1st=sheetObj.GetCellValue(inx,prefix+"n1st_stl_pair_port_cd");
				var par2nd=sheetObj.GetCellValue(inx,prefix+"n2nd_stl_pair_port_cd");
				var par3rd=sheetObj.GetCellValue(inx,prefix+"n3rd_stl_pair_port_cd");
				var untPort=sheetObj.GetCellValue(inx,prefix+"uc_bss_port_cd");
				if (bss1st == ""){
					ComShowCodeMessage('JOO00021', inx);
					sheetObj.SelectCell(inx,prefix+"n1st_stl_bzc_port_cd",true);
					return false;
				}
				if (bss1st == bss2nd){
					ComShowCodeMessage('JOO00022', inx);
					sheetObj.SelectCell(inx,prefix+"n2nd_stl_bzc_port_cd",true);
					return false;
				}
				if (bss1st == bss3rd){
					ComShowCodeMessage('JOO00023', inx);
					sheetObj.SelectCell(inx,prefix+"n3rd_stl_bzc_port_cd",true);
					return false;
				}
				if (bss2nd != "" && bss2nd == bss3rd){
					ComShowCodeMessage('JOO00024', inx);
					sheetObj.SelectCell(inx,prefix+"n3rd_stl_bzc_port_cd",true);
					return false;
				}
			}
			break;
	}
	return true;
}
/**
 * Sheet1_OnChange
 * @param sheetObj
 * @param Row
 * @param Col
 * @param Value
 * @return
 */
function sheet1_OnChange(sheetObj, Row, Col, Value) {
	var sName=sheetObj.ColSaveName(Col);
	//setting TDR/RDR Combo in case of changing Item
	if (sName == prefix+"jo_stl_itm_cd"){
		UF_setTdrRdrCombo(sheetObj, Row);
	}
}
/**
 * Sheet1_OnSearchEnd
 * @param sheetObj
 * @param ErrMsg
 * @return
 */
function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
	gCopyFlg=false;
	//TDR/RDR combo setting	
	for (var inx=sheetObj.HeaderRows(); inx <= sheetObj.LastRow(); inx++){		
		UF_setTdrRdrCombo(sheetObj, inx);
	}
}
/**
 * setting TDR/RDR combo
 * @param sheetObj
 * @param Row
 * @return
 */
function UF_setTdrRdrCombo(sheetObj, Row){
	var code="";
	var name="";
	var defaultVal = "";
	var arrCode=gTdrRdrCd.split("|");
	var arrName=gTdrRdrNm.split("|");
	
	var joStlItmCd=sheetObj.GetCellValue(Row,prefix+"jo_stl_itm_cd");
	for (var inx=0; inx < arrCode.length; inx++){
		if (joStlItmCd == "S/H" || joStlItmCd == "OPR"){
			if (arrCode[inx] == "S"){
				code=code + arrCode[inx] + "|";
				name=name + arrName[inx] + "|";
			}
		}else{
			if (arrCode[inx] != "S"){
				code=code + arrCode[inx] + "|";
				name=name + arrName[inx] + "|";
			}
		}
	}
	if (code.length > 0){
		code=code.substring(0,code.length-1);
		name=name.substring(0,name.length-1);
		var tmpArrCode = code.split("|");
		defaultVal = tmpArrCode[0];
	}
    sheetObj.CellComboItem(Row,	prefix+"jo_stl_tgt_tp_cd", {ComboText:name, ComboCode:code} );
    //sheetObj.SetColProperty(Row, prefix+"jo_stl_tgt_tp_cd" , {DefaultValue:"R"});
    var varStatus = sheetObj.GetRowStatus(Row);
    if("I" == varStatus){
	    if(joStlItmCd != "S/H" && joStlItmCd != "R/F" && joStlItmCd != "OUS" && joStlItmCd != "OPR"){
	    	defaultVal = "U";    	
	    }
	    sheetObj.SetCellValue(Row, prefix+"jo_stl_tgt_tp_cd", defaultVal, 0);
    }
}
/**
 * initializing
 * @return
 */
function UF_reset(){
	var formObj = document.form;
	ComResetAll();
	sheetObjects[0].RemoveAll();

	comboObjects[0].SetSelectIndex(-1,false);
	comboObjects[1].SetSelectIndex(-1,false);
	comboObjects[2].SetSelectIndex(-1,false);
	
	gCopyFlg=false;
}

function initCarrierObject(){
	var formObj = document.form;
	ComSetObjValue(formObj.jo_crr_cd	, "");
	ComSetObjValue(formObj.trd_cd		, "");
	ComSetObjValue(formObj.rlane_cd		, "");
	ComSetObjValue(formObj.jo_stl_opt_cd, "");
}

function initDirCombo(item){
	//Dir Combo
    comboObjects[2].RemoveAll();
    var items = "     |"+item;//빈공백(전체 개념)
    var comboItems=items.split("|");
    UF_addComboItem(comboObjects[2], comboItems);
}

function resizeSheet(){
    ComResizeSheet(sheetObjects[0]);
}