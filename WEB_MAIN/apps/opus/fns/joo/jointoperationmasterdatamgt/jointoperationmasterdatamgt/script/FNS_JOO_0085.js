/*=========================================================
 *Copyright(c) 2010 CyberLogitec
 *@FileName : FNS_JOO_0085.js
 *@FileTitle : Basic Information for Loading Summary
 *Open Issues :
 *Change history :
 *@LastModifyDate : 
 *@LastModifier : 
 *@LastVersion : 1.0
=========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/

/**
 * @extends 
 * @class FNS_JOO_0085 : business script for FNS_JOO_0085
 */

function FNS_JOO_0085() {
	this.processButtonClick = tprocessButtonClick;
	this.setSheetObject = setSheetObject;
	this.loadPage = loadPage;
	this.initSheet = initSheet;
	this.initControl = initControl;
	this.doActionIBSheet = doActionIBSheet;
	this.setTabObject = setTabObject;
	this.validateForm = validateForm;
}



//common global variable
var tabObjects = new Array();
var tabCnt = 0;
var beforetab = 1;

var sheetObjects = new Array();
var sheetCnt = 0;

var comboObjects = new Array();
var comboCnt = 0;

var prefix = "sheet1_";
var gRow = "";

var gTrdLaneCrrArr; //0 : Trade, 1 : Lane, 2 : Carrier

//Event handler processing by button click event */
document.onclick = processButtonClick;

//Event handler processing by button name */
function processButtonClick() {
	/***** setting sheet object *****/
	var sheetObj = sheetObjects[0];

	/*******************************************************/
	var formObj = document.form;

	try {
		var srcName = window.event.srcElement.getAttribute("name");

		switch (srcName) {

		case "btns_copy":
			UF_copyRow();
			break;

		case "btns_add":
			UF_addRow(-1);
			break;

		case "btns_insert":
			UF_addRow();
			break;
			
		case "btns_del":
			JooRowHideDelete(sheetObj, prefix+"del_chk");
			break;
			
		case "btn_retrieve":
			doActionIBSheet(sheetObj, formObj, IBSEARCH);
			break;

		case "btn_new":
			UF_reset();
			break;

		case "btn_downexcel":
			var paramObj = new Object();
			var url = ComJooGetPgmTitle(sheetObj, paramObj);
			sheetObj.SpeedDown2Excel(-1, false, false, "", url);
			break;

		case "btn_save":
			doActionIBSheet(sheetObj, formObj, IBSAVE);
			break;
			
		case "btn_pop_ofc_cd":
			ComOpenPopup("/opuscntr/COM_ENS_071.do", 750, 470, "ofc_cd_pop_event", "1,0,1", true);
			break;

		} // end switch
	} catch (e) {
		if (e == "[object Error]") {
			ComShowCodeMessage('JOO00001');
		} else {
			ComShowMessage(e);
		}
	}
}

/**
 * registering IBSheet Object as list
 * adding process for list in case of needing batch processing with other items
 * defining list on the top of source
 */
function setSheetObject(sheet_obj) {
	sheetObjects[sheetCnt++] = sheet_obj;
}

/** 
 * registering IBCombo Object as list
 * param : combo_obj
 * adding process for list in case of needing batch processing with other items
 * defining list on the top of source
 */
function setComboObject(combo_obj) {
	comboObjects[comboCnt++] = combo_obj;
}

/**
 * initializing sheet
 * implementing onLoad event handler in body tag
 * adding first-served functions after loading screen.
 */
function loadPage() {
	for (i = 0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1);
		ComEndConfigSheet(sheetObjects[i]);
	}

	for ( var k = 0; k < comboObjects.length; k++) {
		initCombo(comboObjects[k], k + 1);
	}

	var arr1d = gTrdLaneCrr.split("|");
	gTrdLaneCrrArr = arr1d;
	for (var i=0; i< arr1d.length; i++){
		var arr2d = arr1d[i];
		gTrdLaneCrrArr[i] = arr2d.split(",");
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
	DATE_SEPARATOR = "-";
	var formObj = document.form;
	
    //handling Axon event. event catch
	axon_event.addListenerFormat('beforedeactivate', 'obj_deactivate',  formObj); //- handling code when OnBeforeDeactivate(blur) event
	axon_event.addListenerFormat('beforeactivate'  , 'obj_activate'  ,  formObj); //- handling code when OnBeforeActivate event in case of existing dataformat property
    axon_event.addListenerFormat('keypress'        , 'obj_keypress'  , 	formObj); //- handling code when onkeypress event in case of existing dataformat property
    axon_event.addListenerFormat('keyup'           , 'obj_keyup'     ,  formObj);
    axon_event.addListenerFormat('click'           , 'obj_onclick'   , 	formObj);

    axon_event.addListener('beforedeactivate', 'ofc_cd_onblur'    , 'ofc_cd');
    axon_event.addListener('keypress', 'ofc_cd_keypress' , 'ofc_cd');
    axon_event.addListener('keyup'   , 'ofc_cd_keyup'    , 'ofc_cd');
}

//function obj_keypress() {
//	var obj = ComGetEvent();
//    switch(ComGetEvent("name")){
//	    case "ofc_cd":
//	        ComKeyOnlyAlphabet('upper');
//	    break;
//	}
//}

function obj_keyup() {
	ComKeyEnter('lengthnextfocus');
}

//handling Axon event 2
function obj_deactivate() {
	ComChkObjValid(event.srcElement);
}

function obj_activate() {
	ComClearSeparator(event.srcElement);
}

/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
function initSheet(sheetObj, sheetNo) {
	var cnt = 0;

	switch (sheetNo) {
	case 1: // sheet1 init
		with (sheetObj) {
			// setting height
			style.height = 420;
			// setting width
			SheetWidth = mainTable.clientWidth;

			//setting Host information[mandatory][HostIp, Port, PagePath]
			if (location.hostname != "")
				InitHostInfo(location.hostname, location.port, page_path);

			//Merge Kind [optional, Default msNone]
			MergeSheet = msHeaderOnly;

			//Edit Kind [optional, Default false]
			Editable = true;

			//setting Row information[mandatory][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
			InitRowInfo(1, 1, 3, 100);

			// setting function handling header
			InitHeadMode(true, true, true, true, false, false)

			var HeadTitle = "||Ref No|Office|R/E|Trade|Rev Lane|Carrier|Source|BSA|Ton to TEU|Weight|WET Round|40 HC GUA|40 HC to TEU|40 HC Round|20 HC GUA|20 HC to TEU|20 HC Round|45 GUA|45 to TEU|45 Round|RF GUA(O)|RF GUA(I)|BKG INQ|Fm Date|To Date|Cre Date|Up Date|Cre By|Cre Name|Del|Seq";
			var headCount = ComCountHeadTitle(HeadTitle);

			//setting Column information[mandatory][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
			InitColumnInfo(headCount, 8, 0, true);

			//header information[mandatory][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
			InitHeadRow(0, HeadTitle, true);

			//data property    [ROW, COL,  DATATYPE,		WIDTH, DATAALIGN,		COLMERGE,	SAVENAME,		KEYFIELD, CALCULOGIC, DATAFORMAT,	POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
			InitDataProperty(0, cnt++, dtHiddenStatus, 30, daCenter, false, prefix + "ibflag" );
			InitDataProperty(0, cnt++, dtCheckBox    , 30, daCenter, false, prefix + "del_chk");
			InitDataProperty(0, cnt++, dtData        ,145, daCenter, false, prefix + "jo_ref_no"           , false, "", dfNone        , 0, false, true );
			InitDataProperty(0, cnt++, dtPopupEdit   , 70, daCenter, false, prefix + "ofc_cd"              , false, "", dfNone        , 0, false, true ,6);
			InitDataProperty(0, cnt++, dtCombo       , 40, daCenter, false, prefix + "re_divr_cd"          , false, "", dfNone        , 0, false, true );
			InitDataProperty(0, cnt++, dtCombo       , 50, daCenter, false, prefix + "trd_cd"              , false, "", dfNone        , 0, false, true );
			InitDataProperty(0, cnt++, dtData        , 60, daCenter, false, prefix + "rlane_cd"            , false, "", dfNone        , 0, false, true );
			InitDataProperty(0, cnt++, dtData        , 50, daCenter, false, prefix + "jo_crr_cd"           , false, "", dfNone        , 0, true , true );
			InitDataProperty(0, cnt++, dtData        , 50, daCenter, false, prefix + "jo_src_cd"           , false, "", dfNone        , 0, true , true );
			InitDataProperty(0, cnt++, dtData        , 50, daRight , false, prefix + "bsa_capa"            , false, "", dfNullInteger , 0, true , true );
			InitDataProperty(0, cnt++, dtData        , 70, daRight , false, prefix + "jo_ton_teu_qty"      , false, "", dfNullInteger , 0, true , true );
			InitDataProperty(0, cnt++, dtData        , 60, daRight , false, prefix + "cgo_ton_wgt"         , false, "", dfNullInteger , 0, true , true );
			InitDataProperty(0, cnt++, dtData        , 70, daRight , false, prefix + "jo_ton_wgt_rnd_rt"   , false, "", dfNullFloat   , 2, true , true );
			InitDataProperty(0, cnt++, dtData        , 80, daRight , false, prefix + "jo_40ft_gnte_qty"    , false, "", dfNullInteger , 0, true , true );
			InitDataProperty(0, cnt++, dtData        , 80, daRight , false, prefix + "jo_40ft_teu_qty"     , false, "", dfNullInteger , 0, true , true );
			InitDataProperty(0, cnt++, dtData        , 80, daRight , false, prefix + "jo_40ft_rnd_rt"      , false, "", dfNullFloat   , 2, true , true );
			InitDataProperty(0, cnt++, dtData        , 80, daRight , false, prefix + "jo_20ft_gnte_qty"    , false, "", dfNullInteger , 0, true , true );
			InitDataProperty(0, cnt++, dtData        , 80, daRight , false, prefix + "jo_20ft_teu_qty"     , false, "", dfNullInteger , 0, true , true );
			InitDataProperty(0, cnt++, dtData        , 80, daRight , false, prefix + "jo_20ft_rnd_rt"      , false, "", dfNullFloat   , 2, true , true );
			InitDataProperty(0, cnt++, dtData        , 80, daRight , false, prefix + "jo_45ft_gnte_qty"    , false, "", dfNullInteger , 0, true , true );
			InitDataProperty(0, cnt++, dtData        , 80, daRight , false, prefix + "jo_45ft_teu_qty"     , false, "", dfNullInteger , 0, true , true );
			InitDataProperty(0, cnt++, dtData        , 80, daRight , false, prefix + "jo_45ft_rnd_rt"      , false, "", dfNullFloat   , 2, true , true );
			InitDataProperty(0, cnt++, dtData        , 80, daRight , false, prefix + "jo_rf_gnte_ocn_qty"  , false, "", dfNullInteger , 0, true , true );
			InitDataProperty(0, cnt++, dtData        , 80, daRight , false, prefix + "jo_rf_gnte_inter_qty", false, "", dfNullInteger , 0, true , true );
			InitDataProperty(0, cnt++, dtData        , 80, daCenter, false, prefix + "jo_bkg_tp_cd"        , false, "", dfNone        , 0, false, false);
			InitDataProperty(0, cnt++, dtPopupEdit   , 80, daCenter, false, prefix + "agmt_eff_dt"         , false, "", dfDateYmd     , 0, true , true );
			InitDataProperty(0, cnt++, dtPopupEdit   , 80, daCenter, false, prefix + "agmt_exp_dt"         , false, "", dfDateYmd     , 0, true , true );
			InitDataProperty(0, cnt++, dtData        ,120, daCenter, false, prefix + "cre_dt"              , false, "", dfUserFormat2 , 0, false, false);
			InitDataProperty(0, cnt++, dtData        ,120, daCenter, false, prefix + "upd_dt"              , false, "", dfUserFormat2 , 0, false, false);
			InitDataProperty(0, cnt++, dtData        , 80, daCenter, false, prefix + "cre_usr_id"          , false, "", dfNone        , 0, false, false);
			InitDataProperty(0, cnt++, dtData        , 80, daCenter, false, prefix + "cre_usr_nm"          , false, "", dfNone        , 0, false, false);
			InitDataProperty(0, cnt++, dtCombo       , 80, daCenter, false, prefix + "delt_flg"            , false, "", dfNone        , 0, false, false);
			InitDataProperty(0, cnt++, dtHidden      , 80, daCenter, false, prefix + "jo_ref_seq"          , false, "", dfNone        , 0, false, false);
			SetImageList(0, "/opuscntr/img/button/btns_calendar.gif");

			InitDataCombo(0, prefix+"re_divr_cd" , "R|E", "R|E");
			InitDataCombo(0, prefix+"delt_flg"   , "Y|N", "Y|N");
			var trdList = gTrdCd.split("|");
			var trdSheet = "";
			var trdCodeName = "";
			for (var i=0; i<trdList.length; i++){
				trdCodeName = trdList[i].split(",");
				if (i == 0){
					trdSheet = trdCodeName[0];
				}else{
					trdSheet = trdSheet + "|" + trdCodeName[0];
				}
			}
			InitDataCombo(0, prefix+"trd_cd"      , trdSheet  , trdSheet);
			//InitDataCombo(0, prefix+"jo_src_cd"   , gJoSrcNm  , gJoSrcCd);
			//InitDataCombo(0, prefix+"jo_bkg_tp_cd", gJoBkgTpNm, gJoBkgTpCd);

			InitDataValid(0, prefix+"ofc_cd"   , vtEngUpOnly); //only upper case
			InitUserFormat2(0, prefix+"cre_dt" , "####-##-## ##:##:##", "-|:");
			InitUserFormat2(0, prefix+"upd_dt" , "####-##-## ##:##:##", "-|:");

			InitComboNoMatchText(true);
			ComboOpenMode = true;
		}
		break;

	}
}

//handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg = false;
	if (!validateForm(sheetObj, formObj, sAction))
		return;

	switch (sAction) {

	case IBSEARCH: //retrieve
		formObj.f_cmd.value = SEARCH;
		sheetObj.WaitImageVisible = false;
		sheetObj.DoSearch("FNS_JOO_0085GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
		break;

	case IBSAVE: //save
		formObj.f_cmd.value = MULTI;
		var SaveStr = ComGetSaveString(sheetObj); // array
		if (SaveStr == ""){
			ComShowCodeMessage("JOO00036");
			return false;			
		}
		
		if (!ComShowCodeConfirm("JOO00046")){
			return false;
		}
		sheetObj.WaitImageVisible = false;
		var sXml = sheetObj.GetSaveXml("FNS_JOO_0085GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));

		if (ComGetEtcData(sXml,"RTNVAL") == "N"){
			sheetObj.LoadSaveXml(sXml);		
			doActionIBSheet(sheetObj, formObj, IBSEARCH);
		}else{
			ComShowMessage(ComGetEtcData(sXml,"RTNVAL"));
		}
		break;

	case IBROWSEARCH: //retrieve
		formObj.f_cmd.value = SEARCH01;
		sheetObj.WaitImageVisible = false;
		var sXml = sheetObj.GetSearchXml("FNS_JOO_0085GS.do", FormQueryString(formObj));
		var refNoList = ComGetEtcData(sXml,"REF_NO_COMBO");
		comboObjects[0].RemoveAll();		
		var comboItems = ("ALL, |"+refNoList).split("|");
		UF_addComboItem(comboObjects[0], comboItems);  		
		break;
		
	case IBSEARCH_ASYNC01: //OFFICE CODE Validation Check(For IBSheet Cell)
		formObj.f_cmd.value = SEARCH11;
		sheetObj.WaitImageVisible = false;
		var sXml = sheetObj.GetSearchXml("JOOCommonGS.do", FormQueryString(formObj)+"&code="+sheetObj.CellValue(gRow, prefix+"ofc_cd"));
		if (ComGetEtcData(sXml,"RESULT") == "E"){
			ComShowCodeMessage("JOO00136", "Office");
			sheetObj.SetCellValue(gRow, prefix+"ofc_cd", "");
			sheetObj.SelectCell(gRow, prefix+"ofc_cd");
		}
		break;

	case IBSEARCH_ASYNC02: //OFFICE CODE Validation Check(For Input Box)
		formObj.f_cmd.value = SEARCH11;
		sheetObj.WaitImageVisible = false;
		var sXml = sheetObj.GetSearchXml("JOOCommonGS.do", FormQueryString(formObj)+"&code="+formObj.ofc_cd.value);
		if (ComGetEtcData(sXml,"RESULT") == "E"){
			ComShowCodeMessage("JOO00136", "Office");
			formObj.ofc_cd.value = "";
			formObj.ofc_cd.focus();
		}
		break;

	case IBSEARCH_ASYNC03: //IBSheet상의 Trade Code변경시 Revenue Lane Setting
		formObj.f_cmd.value = SEARCH16;
		sheetObj.WaitImageVisible = false;
		var sXml = sheetObj.GetSearchXml("JOOCommonGS.do", FormQueryString(formObj)+"&code=&super_cd1=&super_cd2="+sheetObj.CellValue(gRow, prefix+"trd_cd"));
		var rlaneCdList = ComGetEtcData(sXml,"rlane_combo_sheet");
		sheetObj.InitCellProperty(gRow, prefix+"rlane_cd", dtCombo);
        sheetObj.CellComboItem(gRow, prefix+"rlane_cd" , rlaneCdList, rlaneCdList);
		sheetObj.SetCellValue(gRow, prefix+"rlane_cd", "");
		sheetObj.SetCellValue(gRow, prefix+"jo_crr_cd", "");
		break;

	case IBSEARCH_ASYNC04: 
		sheetObj.WaitImageVisible = false;
		var sXml = sheetObj.GetSearchXml("FNS_JOO_0085GS.do", "f_cmd=102"
				+"&ofc_cd="+sheetObj.CellValue(gRow, prefix+"ofc_cd")
				+"&re_divr_cd="+sheetObj.CellValue(gRow, prefix+"re_divr_cd")
				+"&trd_cd="+sheetObj.CellValue(gRow, prefix+"trd_cd")
				+"&rlane_cd="+sheetObj.CellValue(gRow, prefix+"rlane_cd"));

		var code = ComGetEtcData(sXml,"CODE");
		var text = ComGetEtcData(sXml,"TEXT");
		var comboList = text.split("|");

		if (sheetObj.RowStatus(gRow) == "I"){
			sheetObj.SetCellValue2(gRow, prefix+"jo_ref_no"  , "");
			sheetObj.SetCellValue2(gRow, prefix+"agmt_eff_dt", "");
			sheetObj.SetCellValue2(gRow, prefix+"agmt_exp_dt", "");
		}

		//can input manually when same data not exists
		if (code == "" || comboList.length == 0){
			sheetObj.InitCellProperty(gRow, prefix+"jo_ref_no", dtData);
			sheetObj.SetCellEditable(gRow, prefix+"jo_ref_no", false);
		}else if (comboList.length >= 1){
			if (ComShowCodeConfirm("JOO00188",comboList.length)){
				sheetObj.InitCellProperty(gRow, prefix+"jo_ref_no", dtData);
				sheetObj.SetCellEditable (gRow, prefix+"jo_ref_no", false  );
				sheetObj.SetCellEditable (gRow, prefix+"agmt_eff_dt",true);
				sheetObj.SetCellEditable (gRow, prefix+"agmt_exp_dt",true);
		        sheetObj.SelectCell(gRow, prefix+"rlane_cd");
			}else{
				sheetObj.InitCellProperty(gRow, prefix+"jo_ref_no", dtCombo);
				sheetObj.SetCellEditable (gRow, prefix+"jo_ref_no", true);
				sheetObj.SetCellEditable (gRow, prefix+"agmt_eff_dt", false);
				sheetObj.SetCellEditable (gRow, prefix+"agmt_exp_dt", false);
		        sheetObj.CellComboItem(gRow, prefix+"jo_ref_no" , text, code);
				sheetObj.SetCellValue(gRow, prefix+"jo_ref_no"  , "");
				sheetObj.SetCellValue(gRow, prefix+"agmt_eff_dt", "");
				sheetObj.SetCellValue(gRow, prefix+"agmt_exp_dt", "");
		        sheetObj.SelectCell(gRow, prefix+"del_chk");
			}
		}

//		formObj.f_cmd.value = SEARCH19;
//		sheetObj.WaitImageVisible = false;
//		var sXml = sheetObj.GetSearchXml("JOOCommonGS.do", FormQueryString(formObj)+"&code=&super_cd1="+sheetObj.CellValue(gRow, prefix+"trd_cd")+"&super_cd2="+sheetObj.CellValue(gRow, prefix+"rlane_cd"));
//		var crrCdList = ComGetEtcData(sXml,"crr_combo_sheet");
//		sheetObj.InitCellProperty(gRow, prefix+"jo_crr_cd", dtCombo);
//        sheetObj.CellComboItem(gRow, prefix+"jo_crr_cd" , crrCdList, crrCdList);
//		sheetObj.CellValue2(gRow, prefix+"jo_crr_cd") = "";
		break;
	}
}

/**
 * setting Combo basic info 
 * param : comboObj, comboNo
 * initializing sheet 
 */
function initCombo(comboObj, comboNo) {
	var formObj = document.form

	switch (comboObj.id) {
	case "jo_ref_no":
		with (comboObj) {
			MultiSelect = false;
			UseAutoComplete = true;
			SetColAlign("left");
			SetColWidth("120");
			DropHeight = 160;
			ValidChar(2, 1);//only upper case, numbers
			MaxLength = 25;
		}
		comboObj.InsertItem(0, "ALL", " ");
		comboObj.Text2 = "ALL";
		break;

	case "re_divr_cd":
		with (comboObj) {
			MultiSelect = false;
			UseAutoComplete = true;
			SetColAlign("left");
			SetColWidth("60");
			DropHeight = 160;
			ValidChar(2, 1);//only upper case
			MaxLength = 7;
		}
		var comboItems = "ALL, |Revenue,R|Expense,E";
		UF_addComboItem(comboObj, comboItems.split("|"));
		comboObj.Text2 = "ALL";
		break;
		
	case "jo_crr_cd":
		with (comboObj) {
			MultiSelect = false;
			UseAutoComplete = true;
			SetColAlign("left");
			SetColWidth("30");
			DropHeight = 160;
			ValidChar(2, 1);//only upper case
			MaxLength = 3;
		}
		var comboItems = ("ALL, |"+gCrrCd).split("|");
		UF_addComboItem(comboObj, comboItems);
		comboObj.Text2 = "ALL";
		break;

	case "trd_cd":
		with (comboObj) {
			MultiSelect = false;
			UseAutoComplete = true;
			SetColAlign("left");
			SetColWidth("30");
			DropHeight = 160;
			ValidChar(2, 1);//only upper case
			MaxLength = 3;
		}
		comboObj.InsertItem(0, "ALL", " ");
		comboObj.Text2 = "ALL";
		
		break;

	case "rlane_cd":
		with (comboObj) {
			MultiSelect = false;
			UseAutoComplete = true;
			SetColAlign("left");
			SetColWidth("50");
			DropHeight = 160;
			ValidChar(2, 1);//only upper case, numbers
			MaxLength = 5;
		}
		comboObj.InsertItem(0, "ALL", " ");
		comboObj.Text2 = "ALL";
		break;
		
	case "delt_flg":
		with (comboObj) {
			MultiSelect = false;
			UseAutoComplete = true;
			SetColAlign("left");
			SetColWidth("60");
			DropHeight = 200;
			ValidChar(2, 1);//only upper case
			MaxLength = 3;
		}
		var comboItems = "ALL, |Yes,Y|No,N";
		UF_addComboItem(comboObj, comboItems.split("|"));
		comboObj.Code2 = "N";
	}

}

//retrieving Lane SVC Type
function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboKey) {
    sheetObj.ShowDebugMsg = false;

    switch(sAction) {

       case IBSEARCH: //TRADE
			if (sComboObj.id == "trd_cd"){
				//initializing combo
				sComboObj.RemoveAll();
				formObj.f_cmd.value = SEARCH15;
				sheetObj.WaitImageVisible = false;
				var sXml = sheetObj.GetSearchXml("JOOCommonGS.do", FormQueryString(formObj)+"&code=&super_cd1="+formObj.jo_crr_cd.Code+"&super_cd2=");
                ComXml2ComboItem(sXml, formObj.trd_cd,"code","code");
				sComboObj.InsertItem(0, "ALL", " ");
				sComboObj.Index2 = 0;
    	   }else if (sComboObj.id == "rlane_cd") {
				//initializing combo
				sComboObj.RemoveAll();
									
				formObj.f_cmd.value = SEARCH16;
				sheetObj.WaitImageVisible = false;
				var sXml = sheetObj.GetSearchXml("JOOCommonGS.do", FormQueryString(formObj)+"&code=&super_cd2="+formObj.trd_cd.Code+"&super_cd1="+formObj.jo_crr_cd.Code);
                ComXml2ComboItem(sXml, formObj.rlane_cd,"code","code");
				sComboObj.InsertItem(0, "ALL", " ");
				sComboObj.Index2 = 0;
			}
														
	        break;
    }
}

function jo_ref_no_OnChange(comboObj, Code, Text) {
	sheetObjects[0].RemoveAll();
}

function jo_ref_no_OnFocus(comboObj) {
//	if (comboObj.GetCount() == 1){
		comboObj.Enable = false;
		doActionIBSheet(sheetObjects[0], document.form, IBROWSEARCH);
		comboObj.Enable = true;
//	}
}


/**
 * Popup Data Validation Check. <br>
 **/
function ofc_cd_pop_event(aryPopupData) {
	document.form.ofc_cd.value = aryPopupData[0][3];
	sheetObjects[0].RemoveAll();
}

function ofc_cd_onblur() {
	var formObj = document.form;
    if (formObj.ofc_cd.value.length < 6 && formObj.ofc_cd.value.length != 0){
		ComShowCodeMessage("JOO00136", "Office");
		formObj.ofc_cd.value = "";
		formObj.ofc_cd.focus();
    }
}

function ofc_cd_keyup() {
	sheetObjects[0].RemoveAll();
    if (document.form.ofc_cd.value.length == 6){
    	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC02);
    }
}

function ofc_cd_keypress(){
	ComKeyOnlyAlphabet('upper');	
}

function re_divr_cd_OnChange(comboObj, Code, Text) {
	sheetObjects[0].RemoveAll();
}

function jo_crr_cd_OnChange(comboObj, code, text){
	sheetObjects[0].RemoveAll();

	comboObjects[3].RemoveAll();
	comboObjects[3].InsertItem(0, "ALL", " ");
	comboObjects[3].Text2 = "ALL";

	comboObjects[4].RemoveAll();
	comboObjects[4].InsertItem(0, "ALL", " ");
	comboObjects[4].Text2 = "ALL";
}

function trd_cd_OnFocus(comboObj) {
	var formObj = document.form;

//	if (comboObj.GetCount() == 0) {
		comboObj.Enable = false;
		doActionIBCombo(sheetObjects[0], formObj, IBSEARCH, comboObj ,"trd_cd");
		comboObj.Enable = true;
//	}
}

//changing Lane in case of changing TRADE
function trd_cd_OnChange(comboObj, Code, Text){
	sheetObjects[0].RemoveAll();

	comboObjects[4].RemoveAll();
	comboObjects[4].InsertItem(0, "ALL", " ");
	comboObjects[4].Text2 = "ALL";
}

function rlane_cd_OnFocus(comboObj){
	var formObj = document.form;
//	if (comboObj.GetCount() == 0){
		comboObj.Enable = false;
		doActionIBCombo(sheetObjects[0], formObj, IBSEARCH, comboObj ,"rlane_cd");
		comboObj.Enable = true;
//	}
}

function rlane_cd_OnChange(comboObj, code, text){
	sheetObjects[0].RemoveAll();
}

function delt_flg_OnChange(comboObj, Code, Text) {
	sheetObjects[0].RemoveAll();
}

/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	with (formObj) {
		switch (sAction) {
		case IBSEARCH:
			break;
			
		case IBSAVE:
			for (var i=sheetObj.HeaderRows(); i <= sheetObj.LastRow(); i++){
				var rowStatus = sheetObj.RowStatus(i);
				
				if (rowStatus == "R" || rowStatus == "D")
					continue;
				
				if (sheetObj.CellValue(i, prefix+"ofc_cd").length < 5){
					ComShowCodeMessage("JOO00112");
					sheetObj.SelectCell(i, prefix+"ofc_cd");
					return false;
				}

				if (sheetObj.CellValue(i, prefix+"re_divr_cd").length < 1){
					ComShowCodeMessage("JOO00184");
					sheetObj.SelectCell(i, prefix+"re_divr_cd");
					return false;
				}

				if (sheetObj.CellValue(i, prefix+"trd_cd").length < 3){
					ComShowCodeMessage("JOO00009");
					sheetObj.SelectCell(i, prefix+"trd_cd");
					return false;
				}

				if (sheetObj.CellValue(i, prefix+"rlane_cd").length < 5){
					ComShowCodeMessage("JOO00010");
					sheetObj.SelectCell(i, prefix+"rlane_cd");
					return false;
				}

				if (sheetObj.CellValue(i, prefix+"jo_crr_cd").length < 3){
					ComShowCodeMessage("JOO00008");
					sheetObj.SelectCell(i, prefix+"jo_crr_cd");
					return false;
				}

				if (sheetObj.CellValue(i, prefix+"jo_src_cd").length < 1){
					ComShowCodeMessage("JOO00185");
					sheetObj.SelectCell(i, prefix+"jo_src_cd");
					return false;
				}

				if (sheetObj.CellValue(i, prefix+"jo_src_cd") == "B"){
					if (sheetObj.CellValue(i, prefix+"jo_bkg_tp_cd").length < 1){
						ComShowCodeMessage("JOO00186");
						sheetObj.SelectCell(i, prefix+"jo_bkg_tp_cd");
						return false;
					}
				}
				if (sheetObj.CellValue(i, prefix+"agmt_eff_dt").length < 8){
					ComShowCodeMessage("JOO00187", "Fm Date");
					sheetObj.SelectCell(i, prefix+"agmt_eff_dt");
					return false;
				}
				if (sheetObj.CellValue(i, prefix+"agmt_exp_dt").length < 8){
					ComShowCodeMessage("JOO00187", "To Date");
					sheetObj.SelectCell(i, prefix+"agmt_exp_dt");
					return false;
				}
				if (Number(sheetObj.CellValue(i, prefix+"agmt_eff_dt")) > Number(sheetObj.CellValue(i, prefix+"agmt_exp_dt"))){
					ComShowCodeMessage("JOO00078");
					sheetObj.SelectCell(i, prefix+"agmt_exp_dt");
					return false;
				}
			}
			break;
		}
	}

	return true;
}

function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
	for(var i=sheetObj.HeaderRows(); i <= sheetObj.LastRow(); i++){
		if (sheetObj.CellValue(i, prefix+"jo_ref_no") == "") break;
		var joCrrCd = sheetObj.CellValue(i, prefix+"jo_crr_cd");
		var deltFlg = sheetObj.CellValue(i, prefix+"delt_flg");
		if (deltFlg == "Y"){
			sheetObj.SetRowEditable(i, false);
			//sheetObj.CellEditable(i, prefix+"del_chk") = false;
		}else{
			sheetObj.SetRowEditable(i, true);
			//sheetObj.CellEditable(i, prefix+"del_chk") = true;
		}
		
		var trd   = sheetObj.CellValue(i, prefix+"trd_cd");
		var rlane = sheetObj.CellValue(i, prefix+"rlane_cd");
		
		var crrList = "";
		for(var k=0; k<gTrdLaneCrrArr.length; k++){
			if (trd == gTrdLaneCrrArr[k][0] && rlane == gTrdLaneCrrArr[k][1]){
				if (k==0){
					crrList = gTrdLaneCrrArr[k][2];
				}else{
					crrList = crrList+"|"+gTrdLaneCrrArr[k][2];
				}
			}
		}
		sheetObj.InitCellProperty(i, prefix+"jo_crr_cd", dtCombo);
        sheetObj.CellComboItem(i, prefix+"jo_crr_cd" , crrList, crrList);
        sheetObj.SetCellValue(i, prefix+"jo_crr_cd", joCrrCd);
        
        var reDivrCd = sheetObj.CellValue(i, prefix+"re_divr_cd");
        var joSrcCd  = sheetObj.CellValue(i, prefix+"jo_src_cd");
        
        var cdList = "";
        var nmList = "";
        for (var j=0; j<gJoSrcCd.length; j++){
        	if (reDivrCd == "E"){
        		if (gJoSrcCd[j] == "B"){
	        		if (j==0){
	        			cdList = gJoSrcCd[j];
	        			nmList = gJoSrcNm[j];
	        		}else{
	        			cdList = cdList+"|"+gJoSrcCd[j];
	        			nmList = nmList+"|"+gJoSrcNm[j];
	        		}
        		}
        	}else if (reDivrCd == "R"){
        		if (gJoSrcCd[j] != "B"){
	        		if (j==0){
	        			cdList = gJoSrcCd[j];
	        			nmList = gJoSrcNm[j];
	        		}else{
	        			cdList = cdList+"|"+gJoSrcCd[j];
	        			nmList = nmList+"|"+gJoSrcNm[j];
	        		}
        		}
        	}
        }
		sheetObj.InitCellProperty(i, prefix+"jo_src_cd", dtCombo);
        sheetObj.CellComboItem(i, prefix+"jo_src_cd" , nmList, cdList);
        sheetObj.SetCellValue(i, prefix+"jo_src_cd", joSrcCd);

        cdList = "";
        nmList = "";
        var joBkgTpCd = sheetObj.CellValue(i, prefix+"jo_bkg_tp_cd"); 
        if (joSrcCd == "B"){
        	for (var j=0; j<gJoBkgTpCd.length; j++){
        		if (j==0){
        			cdList = gJoBkgTpCd[j];
        			nmList = gJoBkgTpNm[j];
        		}else{
        			cdList = cdList+"|"+gJoBkgTpCd[j];
        			nmList = nmList+"|"+gJoBkgTpNm[j];
        		}
        	}
			sheetObj.InitCellProperty(i, prefix+"jo_bkg_tp_cd", dtCombo);
            sheetObj.CellComboItem(i, prefix+"jo_bkg_tp_cd" , nmList, cdList);
            sheetObj.SetCellEditable(i, prefix+"jo_bkg_tp_cd", true);
            sheetObj.SetCellValue(i, prefix+"jo_bkg_tp_cd", joBkgTpCd);
        }else{
			sheetObj.InitCellProperty(i, prefix+"jo_bkg_tp_cd", dtData);
            sheetObj.SetCellEditable(i, prefix+"jo_bkg_tp_cd", false);
        }
	}
}

function sheet1_OnKeyUp(sheetObj, Row, Col, KeyCode, Shift) {
	var sName = sheetObj.ColSaveName(Col);

	var Value = sheetObj.EditValue;
}

function sheet1_OnChange(sheetObj, Row, Col, Value) {
	gRow = Row;
	var formObj = document.form;
    switch (sheetObj.ColSaveName(Col)) {
		case prefix+"ofc_cd":
			doActionIBSheet(sheetObj, document.form, IBSEARCH_ASYNC01);
			break;
	
		case prefix+"trd_cd":
			if (sheetObj.RowStatus(Row) == "I" || sheetObj.RowStatus(Row) == "U"){
				if (Value == ""){
					ComShowCodeMessage("JOO00009");
					sheetObj.SelectCell(Row, Col);
					return;
				}
				sheetObj.SetCellValue2(Row, prefix+"rlane_cd" , "");
				sheetObj.SetCellValue2(Row, prefix+"jo_crr_cd", "");
				doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC03);
			}
			break;

		case prefix+"rlane_cd":
			if (sheetObj.RowStatus(Row) == "I" || sheetObj.RowStatus(Row) == "U"){
				if (sheetObj.CellValue(Row, prefix+"trd_cd") == ""){
					ComShowCodeMessage("JOO00009");
					sheetObj.SelectCell(Row, prefix+"trd_cd");
					return;
				}
				if (Value == ""){
					ComShowCodeMessage("JOO00010");
					sheetObj.SelectCell(Row, Col);
					return;
				}
				
				var trd   = sheetObj.CellValue(Row, prefix+"trd_cd");
				var rlane = sheetObj.CellValue(Row, prefix+"rlane_cd");
				
				var crrList = "";
				for(var k=0; k<gTrdLaneCrrArr.length; k++){
					if (trd == gTrdLaneCrrArr[k][0] && rlane == gTrdLaneCrrArr[k][1]){
						if (k==0){
							crrList = gTrdLaneCrrArr[k][2];
						}else{
							crrList = crrList+"|"+gTrdLaneCrrArr[k][2];
						}
					}
				}
				sheetObj.InitCellProperty(Row, prefix+"jo_crr_cd", dtCombo);
		        sheetObj.CellComboItem(Row, prefix+"jo_crr_cd" , crrList, crrList);
		        sheetObj.SetCellValue(Row, prefix+"jo_crr_cd", "");
		        
//		        var findSameRefNo = false;
//		        for (var i=sheetObj.HeaderRows; i<=sheetObj.RowCount(); i++){
//		        	if (i == Row || sheetObj.CellValue(i, prefix+"delt_flg") == "Y" || sheetObj.RowStatus(i) == "D") continue;
//		        	if (sheetObj.CellValue(i, prefix+"ofc_cd"    ) == sheetObj.CellValue(Row, prefix+"ofc_cd"    )
//		        	&&  sheetObj.CellValue(i, prefix+"re_divr_cd") == sheetObj.CellValue(Row, prefix+"re_divr_cd")
//		        	&&  sheetObj.CellValue(i, prefix+"trd_cd"    ) == sheetObj.CellValue(Row, prefix+"trd_cd"    )
//		        	&&  sheetObj.CellValue(i, prefix+"rlane_cd"  ) == sheetObj.CellValue(Row, prefix+"rlane_cd"  )){
//		        		
//		        		sheetObj.CellValue2(Row, prefix+"agmt_eff_dt") = sheetObj.CellValue(i, prefix+"agmt_eff_dt"); 
//		        		sheetObj.CellValue2(Row, prefix+"agmt_exp_dt") = sheetObj.CellValue(i, prefix+"agmt_exp_dt");
//		        		sheetObj.CellEditable(Row, prefix+"agmt_eff_dt") = false;
//		        		sheetObj.CellEditable(Row, prefix+"agmt_exp_dt") = false;
//		        		findSameRefNo = true;
//		        		break;
//		        	}
//		        }
		        
//		        if (!findSameRefNo && Value != ""){
		        	doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC04);
//		        }
			}
			break;
			
		case prefix+"jo_ref_no":
			var arrText = (sheetObj.GetComboInfo(Row, Col, "Text")).split("|");
			var idx     = sheetObj.GetComboInfo(Row, Col, "SelectedIndex");

			if (arrText.length > 0 ){
				var arrTextArr = (arrText[idx]).split("\t");
				sheetObj.SetCellValue(Row, prefix+"agmt_eff_dt", arrTextArr[1]);
				sheetObj.SetCellValue(Row, prefix+"agmt_exp_dt", arrTextArr[2]);
			}
			break;
			
		case prefix+"agmt_eff_dt":
			var arrText = (sheetObj.GetComboInfo(Row, Col, "Text")).split("|");
			//var arrCode = sheetObj.GetComboInfo(Row, Col, "Code");
			var idx     = sheetObj.GetComboInfo(Row, Col, "SelectedIndex");
			if (arrText.length > 0 ){
				var arrTextArr = (arrText[idx]).split("\t");
				sheetObj.SetCellValue(Row, prefix+"agmt_exp_dt", arrTextArr[1]);
				sheetObj.SetCellValue(Row, prefix+"jo_ref_no", arrTextArr[2]);
			}
			break;
			
		case prefix+"re_divr_cd":
	        var reDivrCd = sheetObj.CellValue(Row, prefix+"re_divr_cd");
	        
	        var cdList = "";
	        var nmList = "";
	        
	        for (var j=0; j<gJoSrcCd.length; j++){
	        	if (reDivrCd == "E"){
	        		if (gJoSrcCd[j] == "B"){
		        		if (j==0){
		        			cdList = gJoSrcCd[j];
		        			nmList = gJoSrcNm[j];
		        		}else{
		        			cdList = cdList+"|"+gJoSrcCd[j];
		        			nmList = nmList+"|"+gJoSrcNm[j];
		        		}
	        		}
	        	}else if (reDivrCd == "R"){
	        		if (gJoSrcCd[j] != "B"){
		        		if (j==0){
		        			cdList = gJoSrcCd[j];
		        			nmList = gJoSrcNm[j];
		        		}else{
		        			cdList = cdList+"|"+gJoSrcCd[j];
		        			nmList = nmList+"|"+gJoSrcNm[j];
		        		}
	        		}
	        	}
	        }
			sheetObj.InitCellProperty(Row, prefix+"jo_src_cd", dtCombo);
	        sheetObj.CellComboItem(Row, prefix+"jo_src_cd" , nmList, cdList);
			
			break;
			
		case prefix+"jo_src_cd":
	        var cdList = "";
	        var nmList = "";

	        if (Value == "B"){
	        	for (var j=0; j<gJoBkgTpCd.length; j++){
	        		if (j==0){
	        			cdList = gJoBkgTpCd[j];
	        			nmList = gJoBkgTpNm[j];
	        		}else{
	        			cdList = cdList+"|"+gJoBkgTpCd[j];
	        			nmList = nmList+"|"+gJoBkgTpNm[j];
	        		}
	        	}
				sheetObj.InitCellProperty(Row, prefix+"jo_bkg_tp_cd", dtCombo);
	            sheetObj.CellComboItem(Row, prefix+"jo_bkg_tp_cd" , nmList, cdList);
				sheetObj.SetCellEditable(Row, prefix+"jo_bkg_tp_cd", true);
	        }else{
				sheetObj.InitCellProperty(Row, prefix+"jo_bkg_tp_cd", dtData);
				sheetObj.SetCellEditable(Row, prefix+"jo_bkg_tp_cd", false);
	        }
			break;
    }
}

function sheet1_OnPopupClick(sheetObj, Row, Col) {
    switch (sheetObj.ColSaveName(Col)) {
		case prefix+"agmt_eff_dt":
			var cal = new ComCalendarGrid();
			cal.select(sheetObj, Row, Col, "yyyy-MM-dd");
			break;
		case prefix+"agmt_exp_dt":
			var cal = new ComCalendarGrid();
			cal.select(sheetObj, Row, Col, "yyyy-MM-dd");
			break;
		case prefix+"ofc_cd":
			ComOpenPopup("/opuscntr/COM_ENS_071.do", 750, 470, "ofc_cd_sheet_pop_event", "1,0,1", true, false, Row, Col, 0);
			break;

	}
}

function ofc_cd_sheet_pop_event(aryPopupData, row, col, sheetIdx){
	sheetObjects[sheetIdx].SetCellValue(row, col, aryPopupData[0][3]) ;
}


function ofc_cd_OnChange(comObj, Value, Text) {
	sheetObjects[0].RemoveAll();
}

function UF_copyRow(){
	var formObj  = document.form;
	var sheetObj = sheetObjects[0];
	
	var arrs = sheetObj.GetSelectionRows(",");
	var rows = arrs.split(",");
	for (var i = rows.length-1; i >= 0; i--){
		sheetObj.SelectCell(rows[i], 7);		
		var row = sheetObj.DataCopy();
		sheetObj.SetCellValue(row, prefix+"ibflag"    , "I");
		sheetObj.SetCellValue(row, prefix+"jo_ref_no" , "");
		sheetObj.SetCellValue(row, prefix+"jo_ref_seq", "");
		sheetObj.SetCellValue(row, prefix+"delt_flg"  , "N");
		sheetObj.SetCellValue(row, prefix+"cre_dt"    , "");
		sheetObj.SetCellValue(row, prefix+"upd_dt"    , "");
		sheetObj.SetCellValue(row, prefix+"cre_usr_id", gUsrId);
		sheetObj.SetCellValue(row, prefix+"cre_usr_nm", gUsrNm);
		
		var sCode = sheetObj.GetComboInfo(row, prefix+"rlane_cd", "Code");
		var arrCode = sCode.split("|");
		
		//creating combo when lane is not combo
		if (arrCode.length <= 1){
			var trd = sheetObj.CellValue(row, prefix+"trd_cd");
			
			var laneList = "";
			var lane = "";
			var cnt = 0;
			for(var k=0; k<gTrdLaneCrrArr.length; k++){
				if (trd == gTrdLaneCrrArr[k][0]){
					//deleting duplication
					if (lane != gTrdLaneCrrArr[k][1]){
						lane = gTrdLaneCrrArr[k][1];
						
						if (cnt==0){
							laneList = gTrdLaneCrrArr[k][1];
						}else{
							laneList = laneList+"|"+gTrdLaneCrrArr[k][1];
						}
						cnt++;
					}
				}
			}
			sheetObj.InitCellProperty(row, prefix+"rlane_cd", dtCombo);
	        sheetObj.CellComboItem(row, prefix+"rlane_cd" , laneList, laneList);
		}
		
		if (i==0){
			sheetObj.SelectCell(row, prefix+"ofc_cd");
		}			
	}
}

function UF_addRow(i){
	var formObj = document.form;
	var sheetObj = sheetObjects[0];
	
	var row;
	if (i == undefined || i == null || i == ""){
		row = sheetObj.DataInsert();
	}else{
		row = sheetObj.DataInsert(-1);		
	}

	sheetObj.SetCellValue(row, prefix+"re_divr_cd", "");
	sheetObj.SetCellValue(row, prefix+"trd_cd"    , "");
	sheetObj.SetCellValue(row, prefix+"jo_src_cd" , "");
	sheetObj.SetCellValue(row, prefix+"jo_bkg_tp_cd","");
	sheetObj.SetCellValue(row, prefix+"delt_flg", "N");
	sheetObj.SetCellValue(row, prefix+"cre_usr_id", gUsrId);
	sheetObj.SetCellValue(row, prefix+"cre_usr_nm", gUsrNm);
	sheetObj.SelectCell(row, prefix+"ofc_cd");
	return row;
}

function UF_reset(){
	for(var i=0; i<comboObjects.length; i++){
		if (i == 5){
			comboObjects[i].SetSelectCode("2", false);
		}else{
			comboObjects[i].SetSelectCode(comboObjects[i].GetItemCount() == 0? -1 : 0, false);
		}
	}
	document.form.ofc_cd.value = "";
	sheetObjects[0].RemoveAll();
}
