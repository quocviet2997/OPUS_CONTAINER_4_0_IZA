/*=========================================================
 *Copyright(c) 2009 CyberLogitec
 *@FileName : fns_joo_0044.js
 *@FileTitle : Tax Inquiry
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
 * @class fns_joo_0044 : business script for fns_joo_0044
 */

function fns_joo_0044() {
	this.processButtonClick = tprocessButtonClick;
	this.setSheetObject = setSheetObject;
	this.loadPage = loadPage;
	this.initSheet = initSheet;
	this.initControl = initControl;
	this.doActionIBSheet = doActionIBSheet;
	this.setTabObject = setTabObject;
	this.validateForm = validateForm;
}



// common global variable
var sheetObjects = new Array();
var sheetCnt = 0;

var rdObjects = new Array();
var rdCnt = 0;
var queryStr = "";

// Event handler processing by button click event */
document.onclick = processButtonClick;

// Event handler processing by button name */
function processButtonClick() {
	/***** setting sheet object *****/

	var sheetObject1 = sheetObjects[0];

	/*******************************************************/
	var formObject = document.form;
	var rdObject = rdObjects[0];
    try {
		var srcName = window.event.srcElement.getAttribute("name");
		
		switch (srcName) {

		case "btn_retrieve":
			doActionIBSheet(sheetObject1, formObject, IBSEARCH);
			break;

		case "btns_back1":
			if (formObject.tax_inv_yrmon_fr.value!=""){
				formObject.tax_inv_yrmon_fr.value = ComGetDateAdd(formObject.tax_inv_yrmon_fr.value+"-01","M",-1).substring(0,7);
			}
			break;

		case "btns_next1":
			if (formObject.tax_inv_yrmon_fr.value!=""){
				formObject.tax_inv_yrmon_fr.value = ComGetDateAdd(formObject.tax_inv_yrmon_fr.value+"-01","M",1).substring(0,7);
			}
			break;

		case "btns_back2":
			if (formObject.tax_inv_yrmon_to.value!=""){
				formObject.tax_inv_yrmon_to.value = ComGetDateAdd(formObject.tax_inv_yrmon_to.value+"-01","M",-1).substring(0,7);
			}
			break;

		case "btns_next2":
			if (formObject.tax_inv_yrmon_to.value!=""){
				formObject.tax_inv_yrmon_to.value = ComGetDateAdd(formObject.tax_inv_yrmon_to.value+"-01","M",1).substring(0,7);
			}
			break;
			
		case "btn_new":
			sheetObject1.RemoveAll();
			break;

		case "btn_downExcel":
			sheetObject1.SpeedDown2Excel({ HiddenColumn:1,Merge:1});
			break;

		case "btn_print":
 
            rdOpen(  document.form);
            break;

		} // end switch
	} catch (e) {
		if (e == "[object Error]") {
			ComShowMessage(OBJECT_ERROR);
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
 * initializing sheet
 * implementing onLoad event handler in body tag
 * adding first-served functions after loading screen.
 */
function loadPage(tpCombo, plCombo, tpNmCombo, plNmCombo) {

	for (i = 0; i < sheetObjects.length; i++) {

		
		ComConfigSheet(sheetObjects[i]);

		initSheet(sheetObjects[i], i + 1, tpCombo, plCombo, tpNmCombo, plNmCombo);
		
		ComEndConfigSheet(sheetObjects[i]);
	}

	//handling Axon event. event catch
	axon_event.addListenerForm  ('beforedeactivate', 'obj_deactivate',  form, "rdoCity"); //- handling code when OnBeforeDeactivate event except rdoCity
	axon_event.addListenerFormat('beforeactivate',   'obj_activate',    form);            //- handling code when OnBeforeActivate event in case of existing dataformat property
	axon_event.addListenerFormat('keypress',         'obj_keypress', 	form);            //- handling code when onkeypress event in case of existing dataformat property

	axon_event.addListener('keypress', 'tax_inv_yrmon_fr_keypress', 'tax_inv_yrmon_fr');	
	axon_event.addListener('keypress', 'tax_inv_yrmon_to_keypress', 'tax_inv_yrmon_to');	
	
	//doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
    var doc = document.all;
    var formObj = document.form;
    formObj.com_mrdBodyTitle.value = doc.title.innerHTML.replace("&nbsp;","");
    formObj.com_mrdTitle.value = doc.title.innerHTML.replace("&nbsp;","");
}
 
 function rdOpen(){
     var formObj = document.form;
     queryStr="";
     if( !setQueryStr() ){
         return;
     }
    var rdParam = '/rp '+queryStr;
    var strPath   =  "apps/opus/fns/joo/jointoperationagreementsettlement/jointoperationletter/report/FNS_JOO_0072.mrd";

	//2014.10.02 RD License Add
	// Rdviewer.ApplyLicense("0.0.0.0");
    // Rdviewer.FileOpen( strPath, RDServerBAT + rdParam);
 
    formObj.com_mrdPath.value = strPath;
    formObj.com_mrdArguments.value = rdParam;
    ComOpenRDPopup();

 }
 function setQueryStr(){
 
     var formObj = document.form;
     if( formObj.tax_inv_yrmon_fr.value == ""){
         if( !ComChkObjValid( formObj.tax_inv_yrmon_fr ) ){
             return false;
         }
     }
     if( formObj.tax_inv_yrmon_to.value == ""){
         if( !ComChkObjValid( formObj.tax_inv_yrmon_to ) ){
             return false;
         }
     }
//     var fr = tax_inv_yrmon_fr.value;
//     var to = tax_inv_yrmon_to.value;
 
     queryStr += " ["+formObj.tax_inv_yrmon_fr.value+"]";
     queryStr += " ["+formObj.tax_inv_yrmon_to.value  +"]";
    //queryStr += " ["+formObj.ofc_cd.value  +"]";     
     
 
     return true;
 }
//handling Axon event 2
function obj_deactivate(){
    ComChkObjValid(event.srcElement);
}

function obj_activate(){
    ComClearSeparator(event.srcElement);
}

function tax_inv_yrmon_fr_keypress(){
	ComKeyOnlyNumber(this, '');
}

function tax_inv_yrmon_to_keypress(){
	ComKeyOnlyNumber(this, '');
}

/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
function initSheet(sheetObj, sheetNo, tpCombo, plCombo, tpNmCombo, plNmCombo) {

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
			Editable = false;

			//setting Row information[mandatory][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
			InitRowInfo(1, 1, 3, 100);

			//setting Column information[mandatory][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
			InitColumnInfo(13, 0, 0, true);

			// setting function handling header
			InitHeadMode(true, true, false, true, false, false);

			var HeadTitle = "|세금계산서 번호|세금계산서 번호|세금계산서 번호|사업자번호|상호|발행일자|공급가액|세액|품목|TP|흑.적|전표번호";

			//header information[mandatory][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
			InitHeadRow(0, HeadTitle, true);

			var prefix = "sheet1_";
			
			//data property    [ROW, COL,  DATATYPE,		WIDTH, DATAALIGN,		COLMERGE,	SAVENAME,	KEYFIELD, CALCULOGIC, DATAFORMAT,	POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
			InitDataProperty(0, cnt++, dtHiddenStatus,  30, daCenter, true, prefix+"ibflag");
			InitDataProperty(0, cnt++, dtData        ,  50, daCenter, true, prefix+"tax_inv_yrmon", false ,"", dfNone   , 0, true, true);
			InitDataProperty(0, cnt++, dtData        ,  50, daCenter, true, prefix+"ofc_cd"       , false ,"", dfNone   , 0, true, true);
			InitDataProperty(0, cnt++, dtData        ,  50, daCenter, true, prefix+"tax_ser_no"   , false ,"", dfNone   , 0, true, true);
			InitDataProperty(0, cnt++, dtData        , 100, daCenter, true, prefix+"spl_rgst_no"  , false ,"", dfSaupNo , 0, true, true);
			InitDataProperty(0, cnt++, dtData        , 100, daLeft  , true, prefix+"co_nm"        , false ,"", dfNone   , 0, true, true);
			InitDataProperty(0, cnt++, dtData        , 100, daCenter, true, prefix+"iss_dt"       , false ,"", dfDateYmd, 0, true, true);
			InitDataProperty(0, cnt++, dtAutoSum     , 100, daRight , true, prefix+"spl_amt"      , false ,"", dfInteger, 0, true, true);
			InitDataProperty(0, cnt++, dtData        ,  50, daRight , true, prefix+"tax_amt"      , false ,"", dfNone   , 0, true, true);
			InitDataProperty(0, cnt++, dtData        , 100, daCenter, true, prefix+"itm_nm"       , false ,"", dfNone   , 0, true, true);
			InitDataProperty(0, cnt++, dtCombo       ,  50, daCenter, true, prefix+"tax_vat_tp_cd", false ,"", dfNone   , 0, true, true);
			InitDataProperty(0, cnt++, dtCombo       ,  50, daCenter, true, prefix+"tax_pl_cd"    , false ,"", dfNone   , 0, true, true);
			InitDataProperty(0, cnt++, dtData        ,   0, daCenter, true, prefix+"slp_no"       , false ,"", dfNone   , 0, true, true);
			
			InitDataCombo(0, prefix+"tax_vat_tp_cd", tpNmCombo, tpCombo);
			InitDataCombo(0, prefix+"tax_pl_cd"    , plNmCombo, plCombo);
		}
		break;

	}
}

// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg = false;
	
	if (!validateForm(sheetObj, formObj, sAction)) return;
	
	switch (sAction) {
		case IBSEARCH: //retrieve 
			formObj.f_cmd.value = SEARCH;
			var prefix = "sheet1_";
			sheetObj.DoSearch("FNS_JOO_0044GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			break;
	}
}

/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	with (formObj) {
		switch(sAction){
			case IBSEARCH:
				var fr = tax_inv_yrmon_fr.value;
				var to = tax_inv_yrmon_to.value;
				
				if (fr ==""){
					ComShowCodeMessage();
					tax_inv_yrmon_fr.focus();
					return false;
				}
				if (ComGetDaysBetween(fr+"-01", to+"-01") < 0){
					ComShowCodeMessage("JOO00078");
					tax_inv_yrmon_to.focus();
					return false;
				}
				break;
		}
	}

	return true;
}
