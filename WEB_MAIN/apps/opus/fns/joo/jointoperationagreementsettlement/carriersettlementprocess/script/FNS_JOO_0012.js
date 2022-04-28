/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : fns_joo_0012.js
*@FileTitle  : Other
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
 * @class fns_joo_0012 : business script for fns_joo_0012
 */
// common global variable
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
var gCurRow=0;
var prefix="sheet1_";
// Event handler processing by button click event */
document.onclick=processButtonClick;
// Event handler processing by button name */
function processButtonClick() {
	/***** setting sheet object *****/
	var sheetObject1=sheetObjects[0];
	/*******************************************************/
	var formObj=document.form;
	try {
		var srcName=ComGetEvent("name");
		if (srcName == null || srcName == "re_divr_cd") {
			return;
		}
		//return in case class is btn1_1
		if (!JooBtnClickEnable(srcName)) {
			return;
		}
		switch (srcName) {
		case "btns_back":
			//jo_crr_cd.focus();
	    	sheetObjects[0].RemoveAll();
			if (formObj.acct_yrmon.value!=""){
				formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M",-1).substring(0,7);
			}
			doActionIBSheet(sheetObjects[1], formObj, IBSEARCH_ASYNC10);
			break;
		case "btns_next":
			//jo_crr_cd.focus();
			sheetObjects[0].RemoveAll();
			if (formObj.acct_yrmon.value!=""){
				formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M", 1).substring(0,7);
			}
			doActionIBSheet(sheetObjects[1], formObj, IBSEARCH_ASYNC10);
			break;
		case "btn_add":
			if (!validateForm(sheetObject1, formObj, IBSEARCHAPPEND)) return;
			
			var selJoCrrCd 		= JooComGetCarrierText(cmb_jo_crr_cd, 0); //jo_crr_cd
			var selTrdCd 		= JooComGetCarrierText(cmb_jo_crr_cd, 1); //trd_cd
			var selRlaneCd 		= JooComGetCarrierText(cmb_jo_crr_cd, 2); //rlane_cd
			var selJoStlOptCd 	= JooComGetCarrierText(cmb_jo_crr_cd, 3); //jo_stl_opt_cd
			var selCrrAuthCd 	= JooComGetCarrierText(cmb_jo_crr_cd, 4); //jo_crr_auth_cd
			var selLoclCurrCd 	= JooComGetCarrierText(cmb_jo_crr_cd, 5); //locl_curr_cd
			var selJoStlTgtTpCd	= JooComGetCarrierText(cmb_jo_crr_cd, 6); //jo_stl_tgt_tp_cd
						
			var row=sheetObject1.DataInsert(-1);
			var reDivrCd=JooGetRadioValue(formObj.re_divr_cd);
			sheetObjects[0].SetCellValue(row, prefix+"acct_yrmon"   ,ComReplaceStr(formObj.acct_yrmon.value,"-",""),0);
			sheetObjects[0].SetCellValue(row, prefix+"trd_cd"       ,selTrdCd,0);
			sheetObjects[0].SetCellValue(row, prefix+"jo_crr_cd"    ,selJoCrrCd,0);
			sheetObjects[0].SetCellValue(row, prefix+"rlane_cd"     ,selRlaneCd,0);
			sheetObjects[0].SetCellValue(row, prefix+"re_divr_cd"   ,reDivrCd,0);
			sheetObjects[0].SetCellValue(row, prefix+"jo_stl_itm_cd",jo_stl_itm_cd.GetSelectCode(),0);
			sheetObjects[0].SetCellValue(row, prefix+"jo_mnu_nm"    ,formObj.jo_mnu_nm.value,0);
			sheetObjects[0].SetCellValue(row, prefix+"skd_dir_cd"   ,"",0);
			sheetObjects[0].SetCellValue(row, prefix+"rev_dir_cd"   ,"",0);
			sheetObjects[0].SetCellValue(row, prefix+"locl_curr_cd" ,selLoclCurrCd,0);
			sheetObjects[0].SetCellValue(row, prefix+"jo_stl_jb_cd" ,"",0);
			sheetObjects[0].SetCellValue(row, prefix+"stl_adj_flg"  ,"N",0);
			sheetObjects[0].SetCellValue(row, prefix+"stl_lst_flg"  ,"Y",0);
			sheetObjects[0].SelectCell(row, prefix+"jo_stl_itm_cd", true);
			break;
		case "btn_delete":
			JooRowHideDelete(sheetObject1, prefix+"del_chk");
			break;
		case "btn_retrieve":
			doActionIBSheet(sheetObject1, formObj, IBSEARCH);
			break;
		case "btn_create":
			doActionIBSheet(sheetObject1, formObj, IBCREATE);
			break;
		case "btn_new":
			UF_reset();
			break;
		case "btn_save":
			doActionIBSheet(sheetObject1, formObj, IBSAVE);
			break;
		case "btn_downexcel":
			if(sheetObject1.RowCount() < 1){//no data
			       ComShowCodeMessage("COM132501");
			       }else{
			    	   sheetObject1.Down2Excel({ HiddenColumn:1,Merge:1});
			       }
			break;
		case "btn_copy":
			var row=sheetObject1.DataInsert();
			var reDivrCd=JooGetRadioValue(formObj.re_divr_cd);
			
			var selJoCrrCd 		= JooComGetCarrierText(cmb_jo_crr_cd, 0); //jo_crr_cd
			var selTrdCd 		= JooComGetCarrierText(cmb_jo_crr_cd, 1); //trd_cd
			var selRlaneCd 		= JooComGetCarrierText(cmb_jo_crr_cd, 2); //rlane_cd
			var selJoStlOptCd 	= JooComGetCarrierText(cmb_jo_crr_cd, 3); //jo_stl_opt_cd
			var selCrrAuthCd 	= JooComGetCarrierText(cmb_jo_crr_cd, 4); //jo_crr_auth_cd
			var selLoclCurrCd 	= JooComGetCarrierText(cmb_jo_crr_cd, 5); //locl_curr_cd
			var selJoStlTgtTpCd	= JooComGetCarrierText(cmb_jo_crr_cd, 6); //jo_stl_tgt_tp_cd			
			
			if(sheetObject1.RowCount()> 1) {
				sheetObjects[0].SetCellValue(row, prefix+"jo_stl_itm_cd",sheetObjects[0].GetCellValue(row-1, prefix+"jo_stl_itm_cd"),0);
				sheetObjects[0].SetCellValue(row, prefix+"vsl_cd"      ,sheetObjects[0].GetCellValue(row-1, prefix+"vsl_cd"       ),0);
				sheetObjects[0].SetCellValue(row, prefix+"skd_voy_no"  ,sheetObjects[0].GetCellValue(row-1, prefix+"skd_voy_no"   ),0);
				sheetObjects[0].SetCellValue(row, prefix+"skd_dir_cd"  ,sheetObjects[0].GetCellValue(row-1, prefix+"skd_dir_cd"   ),0);
				sheetObjects[0].SetCellValue(row, prefix+"rev_dir_cd"  ,sheetObjects[0].GetCellValue(row-1, prefix+"rev_dir_cd"   ),0);
				sheetObjects[0].SetCellValue(row, prefix+"locl_curr_cd",sheetObjects[0].GetCellValue(row-1, prefix+"locl_curr_cd" ),0);
				sheetObjects[0].SetCellValue(row, prefix+"stl_vvd_seq",sheetObjects[0].GetCellValue(row-1, prefix+"stl_vvd_seq"  ),0);
				sheetObjects[0].SetCellValue(row, prefix+"acct_yrmon"   ,ComReplaceStr(formObj.acct_yrmon.value,"-",""),0);
				sheetObjects[0].SetCellValue(row, prefix+"trd_cd"       ,selTrdCd,0);
				sheetObjects[0].SetCellValue(row, prefix+"jo_crr_cd"    ,selJoCrrCd,0);
				sheetObjects[0].SetCellValue(row, prefix+"rlane_cd"     ,selRlaneCd,0);
				sheetObjects[0].SetCellValue(row, prefix+"re_divr_cd"   ,reDivrCd,0);
				sheetObjects[0].SetCellValue(row, prefix+"jo_mnu_nm"    ,formObj.jo_mnu_nm.value,0);
				sheetObjects[0].SetCellValue(row, prefix+"locl_curr_cd" ,selLoclCurrCd,0);
				sheetObjects[0].SetCellValue(row, prefix+"jo_stl_jb_cd" ,"",0);
				
				setComboItemOfJoStlJbCd(sheetObjects[0], row, sheetObjects[0].GetCellValue(row-1, prefix+"jo_stl_itm_cd"));
				
				sheetObjects[0].SetCellValue(row, prefix+"stl_adj_flg"  ,"N",0);
				sheetObjects[0].SetCellValue(row, prefix+"stl_lst_flg"  ,"Y",0);
			} else {
				sheetObjects[0].SetCellValue(row, prefix+"skd_dir_cd"  ,"",0);
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
	axon_event.addListenerFormat('blur', 'obj_blur'    , formObj); 	//- handling code when OnBeforeDeactivate(blur) event
    axon_event.addListener('click', 'change_event_radio', 're_divr_cd');

	//[2015.09.18] New Carrier jo_crr_cd/trd_cd/rlane_cd 조회.
	doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC20);
	
    formObj.acct_yrmon.focus();    
}
//handling Axon event 2
function obj_blur(){
    ComChkObjValid(ComGetEvent());
	var src=ComGetEvent("name");
    if (src == "acct_yrmon"){
    	ComAddSeparator(ComGetEvent(), "Ym");
    	doActionIBSheet(sheetObjects[1], document.form, IBSEARCH_ASYNC10);
    }
}

function change_event_radio(){
	var formObj = document.form;
	sheetObjects[0].RemoveAll();

	doActionIBSheet(sheetObjects[1], formObj, IBSEARCH_ASYNC10);
	
	//[2015.09.18] New Carrier jo_crr_cd/trd_cd/rlane_cd 조회.
	var rtnFlg = doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC20);
	
	if(rtnFlg == "S"){
		var tmpJoCrrCd 	= ComGetObjValue(formObj.jo_crr_cd);
		var tmpTrdCd 	= ComGetObjValue(formObj.trd_cd);
		var tmpRlaneCd 	= ComGetObjValue(formObj.rlane_cd);
		
		var tmpGrpKey 	= tmpJoCrrCd + tmpTrdCd + tmpRlaneCd;
		
		ComSetObjValue(formObj.jo_crr_cd	, "");
		ComSetObjValue(formObj.trd_cd		, "");
		ComSetObjValue(formObj.rlane_cd		, "");
		
		cmb_jo_crr_cd.SetSelectCode(tmpGrpKey, 1);
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
        if (location.hostname != "")
        var HeadTitle="STS||ITEM|VSL|VOY|Dir.|Fin.Dir|CUR.|TEU|Slot Price|Amount|BSA Type|Remarks|Combined\nNo|RVS|acct_yrmon|stl_vvd_seq|stl_seq|trd_cd|jo_crr_cd|rlane_cd|re_divr_cd|jo_mnu_nm|stl_bzc_port_cd|eta_dt|slip_no|stl_adj_flg|stl_lst_flg|uc_bss_port_cd|uc_bss_port_etd_dt|Dup.|Canceled\nVVD";
        var headCount=ComCountHeadTitle(HeadTitle);
        (headCount, 0, 0, true);
        SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
        var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
        var headers = [ { Text:HeadTitle, Align:"Center"} ];
        InitHeaders(headers, info);
        var cols = [ {Type:"Status",    Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"ibflag" },
               {Type:"CheckBox",  Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"del_chk" },
               {Type:"Combo",     Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"jo_stl_itm_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_cd",                   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:4 },
               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"skd_voy_no",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:4 },
               {Type:"Combo",     Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:prefix+"skd_dir_cd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:prefix+"rev_dir_cd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"locl_curr_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"AutoSum",   Hidden:0, Width:60,   Align:"Right",   ColMerge:1,   SaveName:prefix+"bsa_qty",                  KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
               {Type:"Float",     Hidden:0,  Width:120,   Align:"Right",   ColMerge:1,   SaveName:prefix+"bsa_slt_prc",              KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
               {Type:"AutoSum",   Hidden:0, Width:110,  Align:"Right",   ColMerge:1,   SaveName:prefix+"stl_locl_amt",             KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
               {Type:"Combo",     Hidden:0, Width:120,  Align:"Left",    ColMerge:1,   SaveName:prefix+"jo_stl_jb_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
               {Type:"Text",      Hidden:0,  Width:250,  Align:"Left",    ColMerge:1,   SaveName:prefix+"stl_rmk",                  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"stl_cmb_seq",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:3 },
               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:prefix+"rvs_cmb_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:3 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"acct_yrmon",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_vvd_seq",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_seq",                  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"trd_cd",                   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_crr_cd",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"rlane_cd",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"re_divr_cd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_mnu_nm",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_bzc_port_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"eta_dt",                   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"slip_no",                  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_adj_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_lst_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"uc_bss_port_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"uc_bss_port_etd_dt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"stl_dup_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cxl_vvd_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
         
        InitColumns(cols);
        //UI개선(201408 민정호)
        SetEditable(1);
        SetColProperty(prefix+"skd_dir_cd", {ComboText:"E|W|S|N", ComboCode:"E|W|S|N"} );
        SetColProperty(prefix+"jo_stl_itm_cd", {ComboText:gAbbrSheet, ComboCode:gAbbrSheet} );
        SetColProperty(prefix+"jo_stl_jb_cd", {ComboText:gStlComnm, ComboCode:gStlCombo} );
//        SetSheetHeight(460);
        resizeSheet();        
        SetColProperty(0, prefix+"vsl_cd", {AcceptKeys:"E|[0123456789]", InputCaseSensitive:1});
        SetColProperty(0, prefix+"skd_voy_no", {AcceptKeys:"N"});
        SetColProperty(0, prefix+"skd_dir_cd", {AcceptKeys:"E|[0123456789]", InputCaseSensitive:1});
        SetColProperty(0, prefix+"rev_dir_cd", {AcceptKeys:"E", InputCaseSensitive:1});
        SetColProperty(0, prefix+"locl_curr_cd", {AcceptKeys:"E", InputCaseSensitive:1});                
		}
		break;
	case 2: //t1sheet1 init
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
			formObj.f_cmd.value=SEARCH;
			sheetObj.DoSearch("FNS_JOO_0012GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix) );
			break;
		case IBSAVE: //save
			var SaveStr=ComGetSaveString(sheetObjects[0], true, true);
			if (SaveStr == ""){
				ComShowCodeMessage("JOO00036");
				return false;
			}
			if (!ComShowCodeConfirm("JOO00046")){
				return false;
			}
			sheetObj.SetWaitImageVisible(0);
			ComOpenWait(true);
			formObj.f_cmd.value=MULTI;
			var sXml=sheetObj.GetSaveData("FNS_JOO_0012GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			ComOpenWait(false);
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			var dupRows="";
			for(var i=sheetObj.HeaderRows(); i < sheetObj.LastRow(); i++){
				if (sheetObj.GetRowStatus(i) == "R" || sheetObj.GetRowStatus(i) == "D")
					continue;
				if (sheetObj.GetCellValue(i,prefix+"stl_dup_flg") == "Y"){
					dupRows=dupRows + i +"|";
				}
			}
			if (dupRows.length > 0)
				dupRows=dupRows.substring(0, dupRows.length-1);
			var RTNVAL=ComGetEtcData(sXml, "RTNVAL");
			if (RTNVAL == "E"){
				if (ComShowCodeConfirm('JOO00132', dupRows)){
					doActionIBSheet(sheetObj, document.form, IBINSERT);					
				}
			}else{
				if (ComGetEtcData(sXml,"TRANS_RESULT_KEY") == "S"){
					doActionIBSheet(sheetObj, document.form, IBSEARCH);
				}
			}
			break;
		case IBINSERT:
			var SaveStr=ComGetSaveString(sheetObjects[0], true, true);
			formObj.f_cmd.value=MULTI;
			sheetObj.SetWaitImageVisible(0);
			ComOpenWait(true);
			var sXml=sheetObj.GetSaveData("FNS_JOO_0012GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			ComOpenWait(false);
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			var dupRows="";
			for(var i=sheetObj.HeaderRows(); i < sheetObj.LastRow(); i++){
				if (sheetObj.GetRowStatus(i) == "R" || sheetObj.GetRowStatus(i) == "D")
					continue;
				if (sheetObj.GetCellValue(i,prefix+"stl_dup_flg") == "Y"){
					dupRows=dupRows + i +"|";
				}
			}
			if (dupRows.length > 0)
				dupRows=dupRows.substring(0, dupRows.length-1);
			var RTNVAL=ComGetEtcData(sXml, "RTNVAL");
			if (RTNVAL == "E"){
				if (ComShowCodeConfirm('JOO00132', dupRows)){
					doActionIBSheet(sheetObj, document.form, IBINSERT);					
				}
			}else{
				doActionIBSheet(sheetObj, document.form, IBSEARCH);					
			}
			break;
		//retrieving REV_DIR_CD in case of inputting VVD 9 characters
		case IBROWSEARCH:
			formObj.f_cmd.value=SEARCHLIST;
			formObj.cur_row.value=(gCurRow - sheetObj.HeaderRows());
			var SaveStr=ComGetSaveString(sheetObj,true,true,-1);
			var sXml=sheetObj.GetSaveData("FNS_JOO_0012GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			var revDirList=ComGetEtcData(sXml,"REV_DIR_LIST");
			var errCd=ComGetEtcData(sXml,"ERR_CD");
			if (errCd == "N"){
				if ((revDirList.split("|")).length > 1){
					sheetObj.InitCellProperty(gCurRow, 5,{ Type:"Combo",Align:"Center",Format:"dfNone"} );
					sheetObj.CellComboItem(gCurRow,prefix+"rev_dir_cd", {ComboText:revDirList, ComboCode:revDirList} );
				}else{
					sheetObj.SetCellValue(gCurRow, prefix+"rev_dir_cd",revDirList);
				}
			}else{
				ComShowCodeMessage("JOO00031");
				sheetObj.SetCellValue(gCurRow, prefix+"skd_dir_cd","",0);
			}
			break;
		//VVD Validation Check
		case IBSEARCH_ASYNC01:
			formObj.f_cmd.value=SEARCHLIST01;
			formObj.cur_row.value=gCurRow-1;
			var SaveStr=ComGetSaveString(sheetObj,true,true,-1);
			var sXml=sheetObj.GetSaveData("FNS_JOO_0012GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			var CHECKVVD=ComGetEtcData(sXml,"CHECKVVD");
			if (CHECKVVD=="N"){
				sheetObj.SetCellValue(gCurRow, prefix+"stl_vvd_seq"       ,ComGetEtcData(sXml,"stl_vvd_seq"),0);
				sheetObj.SetCellValue(gCurRow, prefix+"stl_bzc_port_cd"   ,ComGetEtcData(sXml,"stl_bzc_port_cd"),0);
				sheetObj.SetCellValue(gCurRow, prefix+"eta_dt"            ,ComGetEtcData(sXml,"eta_dt"),0);
				sheetObj.SetCellValue(gCurRow, prefix+"uc_bss_port_cd"    ,ComGetEtcData(sXml,"uc_bss_port_cd"),0);
				sheetObj.SetCellValue(gCurRow, prefix+"uc_bss_port_etd_dt",ComGetEtcData(sXml,"uc_bss_port_etd_dt"),0);
				sheetObj.SetCellValue(gCurRow, prefix+"cxl_vvd_flg"       ,"N",0);
				sheetObj.SelectCell(gCurRow, prefix+"bsa_qty", true);
			//Cancel된 VVD면 0053 POP-UP
			}else if (CHECKVVD=="P"){
				sheetObj.SetCellValue(gCurRow, prefix+"cxl_vvd_flg"       ,"Y",0);
				/*var vslCd=sheetObj.GetCellValue(gCurRow, prefix+"vsl_cd");
				var skdVoyNo=sheetObj.GetCellValue(gCurRow, prefix+"skd_voy_no");
				var skdDirCd=sheetObj.GetCellValue(gCurRow, prefix+"skd_dir_cd");
				var revDirCd=sheetObj.GetCellValue(gCurRow, prefix+"rev_dir_cd");
				var reDivrCd=sheetObj.GetCellValue(gCurRow, prefix+"re_divr_cd");
				var joCrrCd=sheetObj.GetCellValue(gCurRow, prefix+"jo_crr_cd");
				var rlaneCd=sheetObj.GetCellValue(gCurRow, prefix+"rlane_cd");
				var param='?vslCd='+vslCd+'&skdVoyNo='+skdVoyNo+'&skdDirCd='+skdDirCd+'&revDirCd='+revDirCd+'&reDivrCd='+reDivrCd+'&joCrrCd='+joCrrCd+'&rlaneCd='+rlaneCd;
				ComOpenPopup('/opuscntr/FNS_JOO_0053.do'+param, 600, 380, 'popupFinish', '1,0,1,1,1,1,1,1', true);*/
			}else{
				if (CHECKVVD=="E"){
					ComShowCodeMessage("JOO00141");
				}else if (CHECKVVD=="T"){
					ComShowCodeMessage("JOO00142");
				}
				sheetObj.SetCellValue(gCurRow, prefix+"stl_vvd_seq"       ,"",0);
				sheetObj.SetCellValue(gCurRow, prefix+"stl_bzc_port_cd"   ,"",0);
				sheetObj.SetCellValue(gCurRow, prefix+"eta_dt"            ,"",0);
				sheetObj.SetCellValue(gCurRow, prefix+"vsl_cd"            ,"",0);
				sheetObj.SetCellValue(gCurRow, prefix+"skd_voy_no"        ,"",0);
				sheetObj.SetCellValue(gCurRow, prefix+"skd_dir_cd"        ,"",0);
				sheetObj.SetCellValue(gCurRow, prefix+"rev_dir_cd"        ,"",0);
				sheetObj.SetCellValue(gCurRow, prefix+"uc_bss_port_cd"    ,"",0);
				sheetObj.SetCellValue(gCurRow, prefix+"uc_bss_port_etd_dt","",0);
				sheetObj.SelectCell(gCurRow, prefix+"vsl_cd", true);
			}
			break;
		//Create
		case IBCREATE:
			/**
			if (document.form.jo_stl_itm_cd.GetSelectCode().length != 0){
				ComShowCodeMessage("JOO00060");
				document.form.jo_stl_itm_cd.SetSelectCode("");
				return;
			}
			*/
			formObj.f_cmd.value=SEARCH01;
			var sXml=sheetObj.GetSearchData("FNS_JOO_0012GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			if (ComGetEtcData(sXml,"TRANS_RESULT_KEY") == "S"){
				var addedCnt = sheetObj.RowCount("I");
				if (addedCnt == 0){
					ComShowCodeMessage('JOO00054');
				}
			}
			break;
		case IBSEARCH_ASYNC10: //retrieving closing status
			formObj.f_cmd.value=SEARCH10;
			var sXml=sheetObj.GetSearchData("FNS_JOO_0012GS.do", FormQueryString(formObj));
			if (ComGetEtcData(sXml,"TRANS_RESULT_KEY") == "S"){
				gClzYn=ComGetEtcData(sXml,"clz_yn"); 
				if (gClzYn == "C"){
					//ComShowCodeMessage("JOO00177");
					JooSetBtnClass("C", false);
			
					sheetObjects[0].SetEditable(0);
				//if Open status, activating or deactivating button by Authority
				}else{
					JooSetBtnClass("C", true);
					if (!(Number(cmb_jo_crr_cd.GetSelectIndex()) == -1 || cmb_jo_crr_cd.GetSelectCode() == "")){	
						var selCrrAuthCd 	= JooComGetCarrierText(cmb_jo_crr_cd, 4);//jo_crr_auth_cd
						UF_setAuth(selCrrAuthCd);
					}
				}
			}
			break;
		case IBSEARCH_ASYNC02:
			formObj.f_cmd.value=SEARCHLIST02;
			formObj.cur_row.value=gCurRow-1;
			var SaveStr=ComGetSaveString(sheetObj,true,true,-1);
			var sXml=sheetObj.GetSaveData("FNS_JOO_0012GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			var CHECKVVD=ComGetEtcData(sXml,"CHECK_BSA_TYPE");
			if (CHECKVVD=="E"){
				ComShowCodeMessage("JOO00180");
				sheetObj.SetCellValue(gCurRow, prefix+"jo_stl_jb_cd","",0);
				sheetObj.SelectCell(gCurRow, prefix+"jo_stl_jb_cd", true);
			}
			break;

			
		case IBSEARCH_ASYNC20 : //2015.09.17 MultiCombo Rlane CD			
			var params = "";					
			params += "f_cmd=" + SEARCH21; 
			params += "&jo_stl_itm_cd="+ComGetObjValue(formObj.jo_stl_itm_cd);	 			
			params += "&re_divr_cd="+JooGetRadioValue(formObj.re_divr_cd); 
			
			var sXml = sheetObj.GetSearchData("JOOCommonGS.do", params);
			ComXml2ComboItem(sXml, cmb_jo_crr_cd, "grp_key", "jo_crr_cd|trd_cd|rlane_cd|jo_stl_opt_cd|jo_crr_auth_cd|locl_curr_cd|jo_stl_tgt_tp_cd");
			return "S";
			break;
	}
}
function popupFinish(){
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
				SetTitleVisible(1);//title
				SetTitle("Carrier|Trade|Lane|S.Option|Auth|Currency|JO_STL_TGT_TP_CD")
				SetColAlign(0, "center");
				SetColAlign(1, "center");
				SetColAlign(2, "center");
				SetColAlign(3, "center");
				SetColAlign(4, "center");
				SetColAlign(5, "center");
				SetColAlign(6, "center");
				SetColWidth(0, "40");
				SetColWidth(1, "40");
				SetColWidth(2, "60");
				SetColWidth(3, "0");
				SetColWidth(4, "0");
				SetColWidth(5, "0");
				SetColWidth(6, "0");
				//SetDropHeight(160);
				ValidChar(2,1);//only upper case, numbers
				SetSelectIndex(0);
		    }
			break;
    	case 2: 
            with (comboObj) { 
 				SetMultiSelect(0);
 				SetColWidth(0, "50");
				SetColWidth(1, "0");
 				SetUseAutoComplete(1);
				SetColAlign(0, "left");
  				ValidChar(2,1);//only upper case
 				SetMaxLength(3);
  		    }
            gAbbrCombo=",|"+gAbbrCombo;
            var comboItems=gAbbrCombo.split("|");
            addComboItem(comboObj, comboItems);           	
  			break;
    } 
}


//jo_crr_cd|trd_cd|rlane_cd|jo_stl_opt_cd|jo_crr_auth_cd|locl_curr_cd|jo_stl_tgt_tp_cd
function cmb_jo_crr_cd_OnChange(comboObj, OldIndex, OldText, OldCode, NewIndex, NewText, NewCode){
	if(OldIndex == NewIndex) return;
	
	var formObj = document.form;
	var selJoCrrCd 		= JooComGetCarrierText(comboObj, 0); //jo_crr_cd
	var selTrdCd 		= JooComGetCarrierText(comboObj, 1); //trd_cd
	var selRlaneCd 		= JooComGetCarrierText(comboObj, 2); //rlane_cd
	var selJoStlOptCd 	= JooComGetCarrierText(comboObj, 3); //jo_stl_opt_cd
	var selCrrAuthCd 	= JooComGetCarrierText(comboObj, 4); //jo_crr_auth_cd
	var selLoclCurrCd 	= JooComGetCarrierText(comboObj, 5); //locl_curr_cd	
	var selJoStlTgtTpCd	= JooComGetCarrierText(comboObj, 6); //jo_stl_tgt_tp_cd	

	ComSetObjValue(formObj.jo_crr_cd	, selJoCrrCd);
	ComSetObjValue(formObj.trd_cd		, selTrdCd);
	ComSetObjValue(formObj.rlane_cd		, selRlaneCd);	
	
	sheetObjects[0].RemoveAll();
	
	UF_setAuth(selCrrAuthCd);		
}
/*
function cmb_jo_crr_cd_OnBlur(comboObj){
	var selRlaneCd 		= JooComGetCarrierText(comboObj, 2); //rlane_cd
	if (selRlaneCd.length == 5){
		doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
	}
}*/

function UF_setAuth(auth){	
	if (gClzYn == "C") return;
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
//JO_STL_ITM_CD change
function jo_stl_itm_cd_OnBlur(comboObj){
	sheetObjects[0].RemoveAll();
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);	
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	var selLoclCurrCd 	= JooComGetCarrierText(cmb_jo_crr_cd, 5); //locl_curr_cd
	switch (sAction) {
		case IBCREATE: //retrieving for saving
			if (formObj.acct_yrmon.value.length == 0){
				ComShowCodeMessage('JOO00033');
				//formObj.acct_yrmon.focus();
				return false;
			}
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
			if (selLoclCurrCd.length!=3){
				ComShowCodeMessage('JOO00082');
				return false;
			}
			break;
		case IBSEARCH: //retrieve
			if (formObj.acct_yrmon.value.length == 0){
				ComShowCodeMessage('JOO00033');
				//formObj.acct_yrmon.focus();
				return false;
			}
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
			var cnt_novalue=0;
			//for (var idx=sheetObj.LastRow()-1; idx>=0; idx--){
			//NYK Modify 2014.12.09 Check 로직 주석처리
			/*for (var idx=sheetObj.HeaderRows(); idx < sheetObj.LastRow(); idx++){
				var bsa=sheetObj.GetCellValue(idx, prefix+"bsa_qty");
				var sltPrc=sheetObj.GetCellValue(idx, prefix+"bsa_slt_prc");
				if ((bsa == "0" || bsa == "") && (sltPrc == "0" || sltPrc == "")){					
					if (cnt_novalue != 1 && !ComShowCodeConfirm("JOO00181")){
						return false; 
					}else{cnt_novalue=1}
						if (sheetObj.GetRowStatus(idx) == "I"){
							sheetObj.RowDelete(idx, false);
					}else{
						sheetObj.SetCellValue(idx, prefix+"del_chk",0,0);
						sheetObj.SetRowHidden(idx,1);
						sheetObj.SetRowStatus(idx,"D");
					}
				}
			}*/
			var cnt=0;
			//UI 개선 수정(민정호,201407)			
			for (var inx=sheetObj.HeaderRows(); inx < sheetObj.LastRow(); inx++){
				var status=sheetObj.GetRowStatus(inx);
				if (status =="R")
					continue;
				cnt++;
				if (status == "D"){ 
					var slip=sheetObj.GetCellValue(inx, prefix+"stl_cmb_seq");
					if (slip != ""){
						ComShowCodeMessage('JOO00057',inx ,slip);
						sheetObj.SelectCell(inx, prefix+"del_chk", true);
						return false;
					}
				}else{
					if ((status == "I" || status == "U") && sheetObj.GetCellValue(inx, prefix+"del_chk") == "1"){
						ComShowCodeMessage("JOO00079");
						sheetObj.SelectCell(inx,prefix+"del_chk",true);
						return false;
					}
					if (sheetObj.GetCellValue(inx, prefix+"vsl_cd").length < 4){
						ComShowCodeMessage('JOO00040',inx);
						sheetObj.SelectCell(inx, prefix+"vsl_cd", true);
						return false;
					}
					if (sheetObj.GetCellValue(inx, prefix+"skd_voy_no").length < 4){
						ComShowCodeMessage('JOO00041',inx);
						sheetObj.SelectCell(inx, prefix+"skd_voy_no", true);
						return false;
					}
					if (sheetObj.GetCellValue(inx, prefix+"skd_dir_cd").length < 1){
						ComShowCodeMessage('JOO00042',inx);
						sheetObj.SelectCell(inx, prefix+"skd_dir_cd", true);
						return false;
					}
					if (sheetObj.GetCellValue(inx, prefix+"rev_dir_cd").length < 1){
						ComShowCodeMessage('JOO00055',inx);
						sheetObj.SelectCell(inx, prefix+"rev_dir_cd", true);
						return false;
					}
					var itm=sheetObj.GetCellValue(inx, prefix+"jo_stl_itm_cd");
					//NYK Modify 2014.12.09 Amount 직접 입력 가능. TEU/Slot Price 체크로직 주석처리.
					/*if (itm == "S/H" || itm == "OUS"){
						var bsa=sheetObj.GetCellValue(inx, prefix+"bsa_qty");
						if (bsa == "0" || bsa == ""){
							ComShowCodeMessage('JOO00058',inx, "BSA TEU");
							sheetObj.SelectCell(inx, prefix+"bsa_qty", true);
							return false;
						}
						var sltPrc=sheetObj.GetCellValue(inx, prefix+"bsa_slt_prc");
						if (sltPrc == "0" || sltPrc == ""){
							ComShowCodeMessage('JOO00058',inx, "Slot Price");
							sheetObj.SelectCell(inx, prefix+"bsa_slt_prc", true);
							return false;
						} 
					}*/
					if (itm == "S/H"){
						var joStlJbCd=sheetObj.GetCellValue(inx, prefix+"jo_stl_jb_cd");
						if (joStlJbCd == ""){
							ComShowCodeMessage('JOO00058',inx, "BSA Type");
							sheetObj.SelectCell(inx, prefix+"jo_stl_jb_cd", true);
							return false;
						}
					}
					if (sheetObj.GetCellValue(inx, prefix+"stl_locl_amt").length == 0
						||  sheetObj.GetCellValue(inx, prefix+"stl_locl_amt") == "0"){
						ComShowCodeMessage('JOO00056',inx);
						sheetObj.SelectCell(inx, prefix+"stl_locl_amt", true);
						return false;
					}
				}
			}
			if(cnt==0){
				cnt = sheetObj.RowCount("D");
			}
			if (cnt==0){
				ComShowCodeMessage('JOO00036');
				return false;
			}
			break;
		case IBDELETE: //whole delete
			var isCombined=false;
			var stlCmbSeq="";
			//can't delete in case of existing combined data
			for (var i=sheetObj.HeaderRows(); i < sheetObj.LastRow(); i++){
				stlCmbSeq=sheetObj.GetCellValue(i, prefix+"stl_cmb_seq");
				if (ComTrim(stlCmbSeq) != ""){
					isCombined=true;
					break;
				}
			}
			if (isCombined){
				ComShowCodeMessage('JOO00057',i, stlCmbSeq);
				return false;
			}
			break;
			
		case IBSEARCHAPPEND:
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
			if (selLoclCurrCd.length!=3){
				ComShowCodeMessage('JOO00082');
				return false;
			}
			break;
	}
	return true;
}

function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
	sheetObj.SetSumText(0,prefix+"jo_stl_itm_cd","TOTAL");
	for (var i=sheetObj.HeaderRows(); i < sheetObj.LastRow(); i++){
		var ibflag=sheetObj.GetRowStatus(i);
		var stlCmbSeq=sheetObj.GetCellValue(i, prefix+"stl_cmb_seq");
		if (ComTrim(stlCmbSeq) == ""){
			sheetObj.SetCellEditable(i, prefix+"del_chk"    ,1);
			sheetObj.SetCellEditable(i, prefix+"bsa_qty"    ,1);
			sheetObj.SetCellEditable(i, prefix+"bsa_slt_prc",1);
			sheetObj.SetCellEditable(i, prefix+"stl_rmk"    ,1);
			var itm=sheetObj.GetCellValue(i,prefix+"jo_stl_itm_cd");
			if (itm == "S/H" || itm == "OPR"){
				sheetObj.SetCellEditable(i, prefix+"jo_stl_jb_cd",1);
				sheetObj.SetCellEditable(i, prefix+"stl_locl_amt",1);//NYK Modify 2014.12.03 0 > 1
			}else if (itm == "OTH"){
				sheetObj.SetCellEditable(i, prefix+"jo_stl_jb_cd",0);
				sheetObj.SetCellEditable(i, prefix+"stl_locl_amt",1);
			}else{
				sheetObj.SetCellValue(i, prefix+"jo_stl_jb_cd","",0);
				sheetObj.SetCellEditable(i, prefix+"jo_stl_jb_cd",0);
				sheetObj.SetCellEditable(i, prefix+"stl_locl_amt",1);//NYK Modify 2014.12.03 0 > 1
			}
		}else{
			sheetObj.SetCellEditable(i, prefix+"del_chk"     ,0);
			sheetObj.SetCellEditable(i, prefix+"bsa_qty"     ,0);
			sheetObj.SetCellEditable(i, prefix+"bsa_slt_prc" ,0);
			sheetObj.SetCellEditable(i, prefix+"stl_rmk"     ,0);
			sheetObj.SetCellEditable(i, prefix+"jo_stl_jb_cd",0);
			sheetObj.SetCellEditable(i, prefix+"stl_locl_amt",0);
		}
		if (sheetObj.GetCellValue(i,prefix+"cxl_vvd_flg") == "Y"){
			sheetObj.SetCellBackColor(i,prefix+"cxl_vvd_flg","#FF0000");
		}
	}	
}
function sheet1_OnKeyUp(sheetObj, Row, Col, KeyCode, Shift){
	var sName=sheetObj.ColSaveName(Col);
	var Value=sheetObj.GetEditText();
	//moving next field in case of inputting 4 characters
	if ((sName == (prefix+"vsl_cd")) && (Value.length == 4)){
		sheetObj.SelectCell(Row, prefix+"skd_voy_no",true);
	}
	//moving next field in case of inputting 4 characters
	if (sName == prefix+"skd_voy_no" && Value.length==4){
		sheetObj.SelectCell(Row, prefix+"skd_dir_cd",true);
	}
	//moving next field in case of inputting 1 characters
	if (sName == (prefix+"skd_dir_cd")){
		sheetObj.SelectCell(Row, prefix+"rev_dir_cd",true);
	}
	//moving next field in case of inputting 1 characters
	if (sName == (prefix+"rev_dir_cd")){
		sheetObj.SelectCell(Row, prefix+"bsa_qty",true);
	}
}

var gCmbStlByShCd = "101|102|103";
var gCmbStlByShNm = "JOINT OPERATION|LEASE|ADDITIONAL";
var gCmbStlByOprCd = "104|105|106";
var gCmbStlByOprNm = "(OPR)JOINT OPERATION|(OPR)LEASE|(OPR)ADDITIONAL";
function setComboItemOfJoStlJbCd(sheetObj, Row, Item){
	if(Item == "OPR"){
		sheetObj.CellComboItem(Row, prefix+"jo_stl_jb_cd", {ComboText:gCmbStlByOprNm, ComboCode:gCmbStlByOprCd} );
	}else{
		sheetObj.CellComboItem(Row, prefix+"jo_stl_jb_cd", {ComboText:gCmbStlByShNm, ComboCode:gCmbStlByShCd} );
	}
}
/**
 * sheet1_OnChange
 * @param sheetObj
 * @param Row
 * @param Col
 * @param Value
 * @return
 */
function sheet1_OnChange(sheetObj, Row, Col, Value) {
	var sName=sheetObj.ColSaveName(Col);
	var formObj=document.form;

	//UI개선(201408 민정호)
	sheetObj.SetCellEditable(Row, prefix+"skd_dir_cd",1);
	sheetObj.SetCellEditable(Row, prefix+"rev_dir_cd",1);	
		
	gCurRow=Row;
	if (sName == prefix+"jo_stl_itm_cd"){
		sheetObj.SetCellValue(Row, prefix+"vsl_cd","",0);
		sheetObj.SetCellValue(Row, prefix+"skd_voy_no","",0);
		sheetObj.SetCellValue(Row, prefix+"skd_dir_cd","",0);
		sheetObj.SetCellValue(Row, prefix+"rev_dir_cd","",0);
		if (Value == "S/H" || Value == "OPR"){
			sheetObj.SetCellEditable(Row, prefix+"jo_stl_jb_cd",1);
			sheetObj.SetCellValue(Row, prefix+"stl_locl_amt","",0);
			sheetObj.SetCellEditable(Row, prefix+"stl_locl_amt",1);//NYK Modify 2014.12.03 0 > 1
			
			setComboItemOfJoStlJbCd(sheetObj, Row, Value);
			
		}else if (Value == "OTH"){
			sheetObj.SetCellValue(Row, prefix+"jo_stl_jb_cd","",0);
			sheetObj.SetCellEditable(Row, prefix+"jo_stl_jb_cd",0);
			sheetObj.SetCellEditable(Row, prefix+"stl_locl_amt",1);
		}else{
			sheetObj.SetCellValue(Row, prefix+"jo_stl_jb_cd","",0);
			sheetObj.SetCellValue(Row, prefix+"stl_locl_amt","",0);
			sheetObj.SetCellEditable(Row, prefix+"stl_locl_amt",1);//NYK Modify 2014.12.03 0 > 1
			sheetObj.SetCellEditable(Row, prefix+"jo_stl_jb_cd",0);
		}
	}
	//calculating in case of changing
	if (sName == prefix+"bsa_qty" || sName == prefix+"bsa_slt_prc"){
		var bsaQty=sheetObj.GetCellValue(Row, prefix+"bsa_qty");
		var bsaSltPrc=sheetObj.GetCellValue(Row, prefix+"bsa_slt_prc");
		var stlLoclAmt=ComRound(Number(bsaQty) * Number(bsaSltPrc), 2);
		sheetObj.SetCellValue(Row, prefix+"stl_locl_amt",stlLoclAmt);
	}
	var vvd=sheetObj.GetCellValue(Row, prefix+"vsl_cd");
	vvd += sheetObj.GetCellValue(Row, prefix+"skd_voy_no");
	vvd += sheetObj.GetCellValue(Row, prefix+"skd_dir_cd");
	vvd += sheetObj.GetCellValue(Row, prefix+"rev_dir_cd");
	if (sName == prefix+"vsl_cd" || sName==prefix+"skd_voy_no" || sName==prefix+"skd_dir_cd" || sName==prefix+"rev_dir_cd"){
		if (sheetObj.GetCellValue(Row, prefix+"jo_stl_itm_cd").length != 3){
			ComShowCodeMessage("JOO00043", Row - sheetObj.HeaderRows()+ 1);
			sheetObj.SelectCell(Row, prefix+"jo_stl_itm_cd", true);
		}
		var tmp=sheetObj.GetComboInfo(Row, prefix+"rev_dir_cd", "Code");
		if ( sName!=prefix+"rev_dir_cd" || tmp.length <= 1 && Value == "" && sheetObj.GetRowStatus(Row) == "I"){
		var vvd1=sheetObj.GetCellValue(Row, prefix+"vsl_cd");
		vvd1 += sheetObj.GetCellValue(Row, prefix+"skd_voy_no");
		vvd1 += sheetObj.GetCellValue(Row, prefix+"skd_dir_cd");
			//retrieving revenue dir. list
			if (vvd1.length == 9){
				doActionIBSheet(sheetObj, formObj, IBROWSEARCH);
			}
		}
		if (vvd.length == 10){
			doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC01);
		}
	}
	if (sName == prefix+"jo_stl_jb_cd"){
		var joStlItmCd=sheetObj.GetCellValue(Row, prefix+"jo_stl_itm_cd");
		if (joStlItmCd.length == 0){
			ComShowCodeMessage("JOO00043", Row - sheetObj.HeaderRows()+ 1);
			sheetObj.SetCellValue(Row, prefix+"jo_stl_jb_cd","",0);
			sheetObj.SelectCell(Row, prefix+"jo_stl_itm_cd", true);
			return;
		}
		if (joStlItmCd == "S/H" || joStlItmCd == "OPR"){
			if (vvd.length < 10){
				ComShowCodeMessage("JOO00039");
				sheetObj.SetCellValue(Row, prefix+"jo_stl_jb_cd","",0);
				sheetObj.SelectCell(Row, prefix+"vsl_cd", true);
				return;
			}
			//BSA Type Validation Check
			//doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC02);
		}
	}
}
/**
 * 
 * @param sheetObj
 * @param Row
 * @param Col
 * @return
 */
function sheet1_OnDblClick(sheetObj, Row, Col) {
	var sName=sheetObj.ColSaveName(Col);
	var Val=sheetObj.GetCellValue(Row, Col);
	//displaying history of canceled VVD
	if (sName == prefix+"cxl_vvd_flg" && Val == "Y"){
		var vslCd=sheetObj.GetCellValue(Row, prefix+"vsl_cd");
		var skdVoyNo=sheetObj.GetCellValue(Row, prefix+"skd_voy_no");
		var skdDirCd=sheetObj.GetCellValue(Row, prefix+"skd_dir_cd");
		var revDirCd=sheetObj.GetCellValue(Row, prefix+"rev_dir_cd");
		var reDivrCd=sheetObj.GetCellValue(Row, prefix+"re_divr_cd");
		var joCrrCd=sheetObj.GetCellValue(Row, prefix+"jo_crr_cd");
		var rlaneCd=sheetObj.GetCellValue(Row, prefix+"rlane_cd");
		var param="?vslCd="+vslCd+"&skdVoyNo="+skdVoyNo+"&skdDirCd="+skdDirCd+"&revDirCd="+revDirCd+"&reDivrCd="+reDivrCd+"&joCrrCd="+joCrrCd+"&rlaneCd="+rlaneCd;
		ComOpenPopup("/opuscntr/FNS_JOO_0053.do"+param, 600, 380, "popupFinish", "1,0,1,1,1,1,1,1", true);
	}
}

function UF_reset(){
	var formObj = document.form;
	ComResetAll();
	sheetObjects[0].RemoveAll();

	cmb_jo_crr_cd.SetSelectIndex(-1,0);	
	formObj.re_divr_cd[0].checked=true;	
	formObj.acct_yrmon.focus();
}

function resizeSheet(){
    ComResizeSheet(sheetObjects[0]);
}
