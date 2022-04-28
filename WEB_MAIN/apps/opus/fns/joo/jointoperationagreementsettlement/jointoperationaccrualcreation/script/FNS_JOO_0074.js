/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : FNS_JOO_0074.jsp
 *@FileTitle : Estimate Performance Inquiry
 *@author     : CLT
 *@version    : 1.0
 *@since      : 2014/06/17
 =========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30; 
 ***************************************************************************************/
/**
 * @extends 
 * @class FNS_JOO_0074 : business script for FNS_JOO_0074
 */
//common global variable
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
var prefix="sheet1_";
var ROWMARK="|";
var FIELDMARK=",";
var dftUserFormatYmdhhmi = "####-##-## ##:##";
//Event handler processing by button click event */
document.onclick=processButtonClick;
//Event handler processing by button name */
function processButtonClick() {
	/***** setting sheet object *****/
	var sheetObject=sheetObjects[0];
	/*******************************************************/
	var formObj=document.form;
	try {
		var srcName=ComGetEvent("name");
		switch (srcName) {
			case "btn_retrieve":
				doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
				break;
			case "btn_new":
				UF_reset();
				break;
			case "btn_downexcel":
 				sheetObjects[0].Down2Excel( {DownCols: makeHiddenSkipCol(sheetObjects[0]), SheetDesign:1,Merge:1 });
				break;
			case "btn_exe_back":
				UF_addMonth(formObj.exe_yrmon, -1);
				UF_setCond("1");
				break;
			case "btn_exe_next":
				UF_addMonth(formObj.exe_yrmon, +1);
				UF_setCond("1");
				break;
			case "btn_vvd_from_back":
				UF_addMonth(formObj.rev_yrmon_fr, -1);
				UF_setCond("2");
				break;
			case "btn_vvd_from_next":
				if (!UF_checkPeriod()){
					ComShowCodeMessage("JOO00078");
					return;
				}
				UF_addMonth(formObj.rev_yrmon_fr, +1);
				UF_setCond("2");
				break;
			case "btn_vvd_to_back":
				if (!UF_checkPeriod()){
					ComShowCodeMessage("JOO00078");
					return;
				}
				UF_addMonth(formObj.rev_yrmon_to, -1);
				UF_setCond("2");
				break;
			case "btn_vvd_to_next":
				UF_addMonth(formObj.rev_yrmon_to, 1);
				UF_setCond("2");
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
	// initializing IBMultiCombo
	for ( var k=0; k < comboObjects.length; k++) {
		initCombo(comboObjects[k], k + 1);
	}
	initControl();	
}
/**
 * setting Combo basic info
 * @param comboObj 
 * @param comboIndex Number
 */
function initCombo(comboObj, comboNo) {
	var formObject=document.form
	switch (comboNo) {
		case 1: 
			with (comboObj) { 
				SetMultiSelect(0);
				SetUseAutoComplete(0);
				SetColAlign(0, "left");
//				SetColWidth(0, "30");
				SetDropHeight(160);
				ValidChar(2,1);//only upper case
				SetMaxLength(3);
			}
			if (ComTrim(gTrdCd) != ""){
				var comboItems=(" |"+gTrdCd).split("|");
				addComboItem(comboObj, comboItems);
			}
			break; 
		case 2: 
			with (comboObj) { 
				SetMultiSelect(0);
				SetUseAutoComplete(0);
				SetColAlign(0, "left");
//				SetColWidth(0, "50");
				SetDropHeight(160);
 				ValidChar(2,1);//only upper case, numbers
				SetMaxLength(5);
			}
			if (ComTrim(gRlaneCd) != ""){
				var comboItems=(" |"+gRlaneCd).split("|");
				addComboItem(comboObj, comboItems);
			}
			break;
		case 3: 
			with (comboObj) { 
				SetMultiSelect(0);
				SetUseAutoComplete(0);
				SetColAlign(0, "left");
//				SetColWidth(0, "30");
				SetDropHeight(160);
 				ValidChar(2,1);//only upper case
				SetMaxLength(3);
			}
			if (ComTrim(gJoCrrCd) != ""){
				var comboItems=(" |"+gJoCrrCd).split("|");
				addComboItem(comboObj, comboItems);
			}
			break;
		case 4: 
			with (comboObj) { 
				SetMultiSelect(true);
			    SetMultiSeparator(",");  // add 
				SetUseAutoComplete(1);
 				SetColAlign(0, "left");
				//SetColAlign(1, "left");
				SetColWidth(0, "80");
				//SetColWidth(1, "130");
				SetDropHeight(160);
 				ValidChar(2,1);//only upper case
 				SetMaxLength(7);
			}
			if (ComTrim(gJoStlItmCd) != ""){
				var comboItems=gJoStlItmCd.split(ROWMARK);
				var comboItem="";
				jo_stl_itm_cd.InsertItem(-1, "ALL|", "ALL");	//ALL
				for (var i=0 ; i < comboItems.length ; i++) {
					comboItem=comboItems[i].split(FIELDMARK);
					jo_stl_itm_cd.InsertItem(-1, comboItem[0], comboItem[0]);
				}
				//jo_stl_itm_cd.SetSelectIndex(0);

				jo_stl_itm_cd.SetSelectCode("S/H", true);
				jo_stl_itm_cd.SetSelectCode("OPR", true);
			}else{
				jo_stl_itm_cd.RemoveAll();
			}
			break;
		case 5: 
            with (comboObj) { 
 				SetMultiSelect(0);
 				SetUseAutoComplete(0);
 				SetColAlign(0, "left");
 				SetColAlign(1, "left");
 				SetColWidth(0, "240");
 				SetColWidth(1, "0");
  				SetDropHeight(160);
 				ValidChar(2,1);//only upper case
  		    }
			comboObj.RemoveAll();
			var codeItems=(" |"+gBsaTpCd).split("|");
			var nameItems=(" |"+gBsaTpNm).split("|");
			for (var i=0 ; i < codeItems.length ; i++) {
				comboObj.InsertItem(i, nameItems[i]+"|"+codeItems[i], codeItems[i]);
			}   	
			break;
	}
}
var selComboIndex, selComboCode;
function jo_stl_itm_cd_OnSelect(comboObj ,index, text , code) {
	selComboIndex = index;
	selComboCode = code;
}
function jo_stl_itm_cd_OnChange(comboObj , oldIndex, oldText, oldCode, newIndex, newText, newCode) {
	ComSetMultiCombo(comboObj, selComboIndex, selComboCode);
	var cnt=0;
	var count = parseInt(comboObj.GetItemCount());
	var name = "";
	//var isAllText = false;
	for(var i = 1 ; i <  count; i++) {
	   if(comboObj.GetItemCheck(i)) {
	       cnt++;
	       if(comboObj.GetSelectCode().indexOf("ALL") > -1){
	    	   //isAllText = true;
	    	   break;
	       }else{
	    	   name = comboObj.GetText(comboObj.GetSelectCode(), 1);
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
	var formObject=document.form;
		
	//axon_event.addListenerFormat('blur', 'fnDeactivate', formObject);
	/*
	var tmpFrYm = ComGetDateAdd(formObject.exe_yrmon.value,"M", -6);
	var tmpToYm = ComGetDateAdd(formObject.exe_yrmon.value,"M", 1);
	formObject.rev_yrmon_fr.value=JooGetDateFormat(tmpFrYm,"ym");
	formObject.rev_yrmon_to.value=JooGetDateFormat(tmpToYm,"ym");
	*/
	//From : -3년, To : +1 월
	var tmpToYm = ComGetDateAdd(formObject.exe_yrmon.value,"M", 1);
	formObject.rev_yrmon_to.value=JooGetDateFormat(tmpToYm,"ym");	
	
	//년월 만 하면 -3년이 넘게 설정 되어 동일 월로 설정하기 위해서 2015-07-02 로 Day 를 마춘다.
	var tmpFrYm = ComGetDateAdd(formObject.rev_yrmon_to.value+"-02","Y", -3);
	formObject.rev_yrmon_fr.value=JooGetDateFormat(tmpFrYm,"ym");
	
	document.getElementById("exe_yrmon").focus();
}
/*function re_divr_cd_click(){
	UF_setCond("1");
}
*/
function diff_option_click(){
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
	        var HeadTitle = "STS||G.No|Seq.|Revenue\nMonth|Activity\nDate|Carrier\nCode|Vendor/\nCustomer|Rev.VVD|Rev.Lane|BSA Type";
	            HeadTitle += "|Port to\nPort|BSA|Slot\nPrice|VVD Duration|VVD Duration|Voy Days|Voy Days|Voy Days|Item";
	        	HeadTitle += "|Estimated\nCost|Actual\nCost|Accrual\nCost";
	        	HeadTitle += "|exe_yrmon|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd|estm_vvd_tp_cd|acct_cd|estm_act_seq|sys_src_id|loc_cd";
	            HeadTitle += "|jo_ioc_div_cd|estm_vvd_hdr_id|jo_cntr_div_ctnt|cntr_blk_div_cd|jo_stl_jb_cd|cust_cnt_cd|cust_seq|org_estm_amt|org_act_amt|min_estm_yrmon|max_estm_yrmon";
        
	        var HeadTitle1 = "STS||G.No|Seq.|Revenue\nMonth|Activity\nDate|Carrier\nCode|Vendor/\nCustomer|Rev.VVD|Rev.Lane|BSA Type";
	        	HeadTitle1 += "|Port to\nPort|BSA|Slot\nPrice|From|To|Total|By Month|Days|Item"
	            HeadTitle1 += "|Estimated\nCost|Actual\nCost|Accrual\nCost";
	        	HeadTitle1 += "|exe_yrmon|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd|estm_vvd_tp_cd|acct_cd|estm_act_seq|sys_src_id|loc_cd";
	            HeadTitle1 += "|jo_ioc_div_cd|estm_vvd_hdr_id|jo_cntr_div_ctnt|cntr_blk_div_cd|jo_stl_jb_cd|cust_cnt_cd|cust_seq|org_estm_amt|org_act_amt|min_estm_yrmon|max_estm_yrmon";
        
            var headCount=ComCountHeadTitle(HeadTitle);
        	
	        SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
	
	        var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	        var headers = [ { Text:HeadTitle, Align:"Center"},{ Text:HeadTitle1, Align:"Center"} ];
	        InitHeaders(headers, info);

	        var cols = [ 
	 	               {Type:"Status",    Hidden:1,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag"},
	 	  	           {Type:"CheckBox",  Hidden:1,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"del_chk",   UpdateEdit:0,   InsertEdit:0},
	 	               {Type:"Text",      Hidden:1,  Width:40,    Align:"Center",  ColMerge:0,   SaveName:prefix+"grp_no",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Seq",       Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"seq",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Date",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:prefix+"rev_yrmon",         KeyField:0,   CalcLogic:"",   Format:"Ym",          PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Date",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"act_dt",            KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"jo_crr_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:prefix+"vndr_cust_seq",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",    ColMerge:0,   SaveName:prefix+"vvd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:prefix+"rlane_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:0,  Width:130,  Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_stl_jb_nm",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               
	 	               {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:prefix+"accl_amt_corr_flg", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",     Hidden:0,  Width:50,   Align:"Right",   ColMerge:0,   SaveName:prefix+"bsa_qty",           KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",     Hidden:0,  Width:70,  Align:"Right",   ColMerge:0,   SaveName:prefix+"bsa_slt_prc",       KeyField:0,   CalcLogic:"",   Format:"Float",       UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"st_dt",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"end_dt",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Float",     Hidden:0,  Width:65,  Align:"Right",   ColMerge:0,   SaveName:prefix+"sail_dys",          KeyField:0,   CalcLogic:"",   Format:"Float",       UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Date",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:prefix+"estm_yrmon",        KeyField:0,   CalcLogic:"",   Format:"Ym",          PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Float",     Hidden:0,  Width:65,  Align:"Right",   ColMerge:0,   SaveName:prefix+"estm_dys",          KeyField:0,   CalcLogic:"",   Format:"Float",       UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"jo_stl_itm_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               
	 	               {Type:"AutoSum",   Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:prefix+"estm_amt",          KeyField:0,   CalcLogic:"",   Format:"Float",       UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"AutoSum",   Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:prefix+"act_amt",           KeyField:0,   CalcLogic:"",   Format:"Float",       UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"AutoSum",   Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:prefix+"accl_amt",          KeyField:0,   CalcLogic:"",   Format:"Float",       UpdateEdit:0,   InsertEdit:0 },
	 	               
	 	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"exe_yrmon",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"vsl_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"skd_voy_no",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"skd_dir_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"rev_dir_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"estm_vvd_tp_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"acct_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"estm_act_seq",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"sys_src_id",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"loc_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               
	 	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"jo_ioc_div_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"estm_vvd_hdr_id",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"jo_cntr_div_ctnt",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"cntr_blk_div_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_stl_jb_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_cnt_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_seq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               //var CalcuLogicOriEstmAmt = "|sheet1_bsa_qty|*|sheet1_bsa_slt_prc;
	 	               {Type:"AutoSum",   Hidden:1,  Width:120,    Align:"Right",   ColMerge:0,   SaveName:prefix+"org_estm_amt",  	 KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"AutoSum",   Hidden:1,  Width:120,    Align:"Right",   ColMerge:0,   SaveName:prefix+"org_act_amt",   	 KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:1,  Width:100,    Align:"Center",  ColMerge:0,   SaveName:prefix+"min_estm_yrmon",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	 	               {Type:"Text",      Hidden:1,  Width:100,    Align:"Center",  ColMerge:0,   SaveName:prefix+"max_estm_yrmon",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },];
	 	               
	 	         
	 	        InitColumns(cols);
	 	        SetColProperty(0, prefix+"st_dt", {Format:dftUserFormatYmdhhmi, AcceptKeys:"N"} );
	 			SetColProperty(0, prefix+"end_dt", {Format:dftUserFormatYmdhhmi, AcceptKeys:"N"} );
	 			SetColProperty(0, prefix+"bsa_qty", {AcceptKeys:"N|[.]"} );
	 			SetColProperty(0, prefix+"bsa_slt_prc", {AcceptKeys:"N|[.]"} );	        
	 			
	 			resizeSheet();
			   	}
			break;
	}
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
//	sheetObj.ShowDebugMsg(false);
	if (!validateForm(sheetObj, formObj, sAction)) {
		return;
	}
	switch (sAction) {
		case IBSEARCH: //retrieve
			formObj.f_cmd.value=SEARCH;
			var param=FormQueryString(formObj)+"&" + ComGetPrefixParam(prefix);
 			sheetObj.DoSearch("FNS_JOO_0074GS.do", param );
			break;
		case IBROWSEARCH:
			formObj.f_cmd.value=SEARCHLIST01;
 			var sXml=sheetObj.GetSearchData("FNS_JOO_0074GS.do", FormQueryString(formObj));
			var conFlg=formObj.estm_cond_flg.value;
			switch(conFlg){
				//retrieving REV_YRMON_FR, REV_YRMON_TO, TRADE, LANE, CARRIER in case of changing EXE_YRMON, RE_DIVR_Cd
				/*case "1":
					var revYrmonFr=ComReplaceStr(ComGetEtcData(sXml, "REV_YRMON_FR"),"-","");
					var revYrmonTo=ComReplaceStr(ComGetEtcData(sXml, "REV_YRMON_TO"),"-","");
					formObj.rev_yrmon_fr.value=JooGetDateFormat(revYrmonFr,"ym");
					formObj.rev_yrmon_to.value=JooGetDateFormat(revYrmonTo,"ym");
					//formObj.rev_yrmon_fr.value=revYrmonFr.substring(0,4)+"-"+revYrmonFr.substring(5,7);
					//formObj.rev_yrmon_to.value=revYrmonTo.substring(0,4)+"-"+revYrmonTo.substring(5,7);
				*/	
				//retrieving REV_YRMON_FR, REV_YRMON_TO, TRADE, LANE, CARRIER in case of changing EXE_YRMON, RE_DIVR_Cd
				case "1":
				case "2":
					var trdCombo=ComGetEtcData(sXml, "TRD_CD");
					if (ComTrim(trdCombo) != ""){
						var comboItems=(" |"+trdCombo).split("|");
						addComboItem(comboObjects[0], comboItems);
					}
				case "3":
					var rlaneCombo=ComGetEtcData(sXml, "RLANE_CD");
					if (ComTrim(rlaneCombo) != ""){
						var comboItems=(" |"+rlaneCombo).split("|");
						addComboItem(comboObjects[1], comboItems);
					}
				case "4":
					var crrCombo=ComGetEtcData(sXml, "JO_CRR_CD");
					if (ComTrim(crrCombo) != ""){
						var comboItems=(" |"+crrCombo).split("|");
						addComboItem(comboObjects[2], comboItems);
					}
					break;
			}
			break;
		case IBRESET: //NEW button  
			UF_reset();
			break;
	}	
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	with (formObj) {
		switch (sAction) {
			case IBSEARCH:
				if (formObj.exe_yrmon.value.length == 0){
					ComShowCodeMessage('JOO00089');
					formObj.exe_yrmon.focus();
					return false;
				}
				break;
		}
	}
	return true;
}
function trd_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
	UF_setCond("3");
}
function rlane_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
	UF_setCond("4");
}
function jo_crr_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
	sheetObjects[0].RemoveAll();
}
function jo_stl_jb_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
	sheetObjects[0].RemoveAll();
}
/**************************************USER FUNCTION *****************************************************/
/**
 * NEW button 
 * @param    void
 * @return   void
 */
function UF_reset() {
	var formObj=document.form;
	sheetObjects[0].RemoveAll();
	comboObjects[0].RemoveAll();
	comboObjects[1].RemoveAll();
	comboObjects[2].RemoveAll();
	comboObjects[3].SetSelectIndex(-1,false);
	var comboItems;
	if (ComTrim(gTrdCd) != ""){
		comboItems=(" |"+gTrdCd).split("|");
		addComboItem(comboObjects[0], comboItems);           	
	}
	//Rlane Combo setting
	if (ComTrim(gRlaneCd) != ""){
		comboItems=(" |"+gRlaneCd).split("|");
		addComboItem(comboObjects[1], comboItems);
	}
	//Carrier Combo setting
	if (ComTrim(gJoCrrCd) != ""){
		comboItems=(" |"+gJoCrrCd).split("|");
		addComboItem(comboObjects[2], comboItems);           	
	}

	//Item Combo setting
	if (ComTrim(gJoStlItmCd) != ""){
		var comboItems=gJoStlItmCd.split(ROWMARK);
		var comboItem="";
		jo_stl_itm_cd.InsertItem(-1, "ALL|", "ALL");	//ALL
		for (var i=0 ; i < comboItems.length ; i++) {
			comboItem=comboItems[i].split(FIELDMARK);
			jo_stl_itm_cd.InsertItem(-1, comboItem[0], comboItem[0]);
		}
		//jo_stl_itm_cd.SetSelectIndex(0);
		jo_stl_itm_cd.SetSelectCode("S/H", true);
		jo_stl_itm_cd.SetSelectCode("OPR", true);
	}else{
		jo_stl_itm_cd.RemoveAll();
	}
	
	formObj.exe_yrmon.value=ComGetDateAdd(gYyyyMM+"01","M",-1,"-").substring(0,7);
	
	/*
	var tmpFrYm = ComGetDateAdd(formObj.exe_yrmon.value,"M", -6);
	var tmpToYm = ComGetDateAdd(formObj.exe_yrmon.value,"M", 1);
	formObj.rev_yrmon_fr.value=JooGetDateFormat(tmpFrYm,"ym");
	formObj.rev_yrmon_to.value=JooGetDateFormat(tmpToYm,"ym");
	*/

	//From : -3년, To : +1 월
	var tmpToYm = ComGetDateAdd(formObj.exe_yrmon.value,"M", 1);
	formObj.rev_yrmon_to.value=JooGetDateFormat(tmpToYm,"ym");	
	
	//년월 만 하면 -3년이 넘게 설정 되어 동일 월로 설정하기 위해서 2015-07-02 로 Day 를 마춘다.
	var tmpFrYm = ComGetDateAdd(formObj.rev_yrmon_to.value+"-02","Y", -3);
	formObj.rev_yrmon_fr.value=JooGetDateFormat(tmpFrYm,"ym");
	
	formObj.re_divr_cd[2].checked=true;
	formObj.diff_option[0].checked=true;
	formObj.vvd.value="";
	
	formObj.exe_yrmon.focus();	
	
}
/**
 * <pre>
 *     input validation,
 *     focus out.
 * </pre>
 * 
 * @return void
 */
function fnDeactivate() {
	switch (event.srcElement.name) {
		case 'exe_yrmon':
			ComAddSeparator(event.srcElement);
			UF_setCond("1");
			break;
		case 'rev_yrmon_fr':
			ComChkObjValid(event.srcElement); // checking duration in case of focus out                
			UF_setCond("2");
			break;
		case 'rev_yrmon_to':
			ComChkObjValid(event.srcElement); // checking duration in case of focus out                     
			UF_setCond("2");
			break;
	}
}
function UF_setCond(flg){
	var formObj=document.form;
	formObj.estm_cond_flg.value=flg;
	switch (flg){
		//in case of changing exe month, re_divr_cd
		case "1":
			//formObj.rev_yrmon_fr.value="";
			//formObj.rev_yrmon_to.value="";
		//in case of changing rev year month
		case "2":
			trd_cd.SetSelectIndex(-1,false);
			trd_cd.RemoveAll();
		//in case of changing Trade
		case "3":
			rlane_cd.SetSelectIndex(-1,false);
			rlane_cd.RemoveAll();
		//in case of changing Lane
		case "4":
			jo_crr_cd.SetSelectIndex(-1,false);
			jo_crr_cd.RemoveAll();
			break;
	}
	sheetObjects[0].RemoveAll();
	doActionIBSheet(sheetObjects[0], formObj, IBROWSEARCH);		
}
function UF_checkPeriod(){
	var formObj=document.form;
	var frDt=formObj.rev_yrmon_fr.value.replaceStr("-","")+"01";
	var toDt=formObj.rev_yrmon_to.value.replaceStr("-","")+"01";
	if (ComGetDaysBetween(frDt, toDt) <= 0){
		return false;
	}	
	return true;
}
function trd_cd_OnKeyDown(comboObj, KeyCode, Shift) {
	if (KeyCode == 9 || KeyCode == 13)
		setTimeout("document.getElementById(\"" + comboObjects[1].id  + "\").focus()", 0.1);
}
function rlane_cd_OnKeyDown(comboObj, KeyCode, Shift) {
	if (KeyCode == 9 || KeyCode == 13)
		setTimeout("document.getElementById(\"" + comboObjects[2].id  + "\").focus()", 0.1);
}
function jo_crr_cd_OnKeyDown(comboObj, KeyCode, Shift) {
	if (KeyCode == 9 || KeyCode == 13)
		setTimeout("document.getElementById(\"" + comboObjects[3].id  + "\").focus()", 0.1);
}

function setVoyDaysOnClick(val){
	//재조회 한다.
	sheetObjects[0].RemoveAll();
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}

function resizeSheet(){
    ComResizeSheet(sheetObjects[0]);
}
