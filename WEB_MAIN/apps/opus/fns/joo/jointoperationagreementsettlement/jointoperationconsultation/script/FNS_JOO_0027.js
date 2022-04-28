/*=========================================================
 *Copyright(c) 2009 CyberLogitec
 *@FileName : fns_joo_0027.js
 *@FileTitle : AP Data ERP Interface Inquiry
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
 * @class fns_joo_0027 : business script for fns_joo_0027
 */

function fns_joo_0027() {
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
var tabObjects = new Array();
var tabCnt = 0;
var beforetab = 1;

var sheetObjects = new Array();
var sheetCnt = 0;

// Event handler processing by button click event */
document.onclick = processButtonClick;

// Event handler processing by button name */
function processButtonClick() {
	/***** setting sheet object *****/
	var sheetObject = sheetObjects[0];

	/*******************************************************/
	var formObject = document.form;

	try {
		var srcName = window.event.srcElement.getAttribute("name");

		switch (srcName) {

		case "btn_retrieve":
			doActionIBSheet(sheetObject, formObject, IBSEARCH);
			break;

		case "btn_new":
			sheetObject.RemoveAll();
			break;

		case "btn_downExcel":
			sheetObject.SpeedDown2Excel({ HiddenColumn:1,Merge:1});
			break;

		case "btn_calendar1":
			var cal = new ComCalendar();
			cal.select(formObject.iss_dt_fr, 'yyyy-MM-dd');
			break;

		case "btn_calendar2":
			var cal = new ComCalendar();
			cal.select(formObject.iss_dt_to, 'yyyy-MM-dd');
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
function loadPage() {

	for (i = 0; i < sheetObjects.length; i++) {

		
		ComConfigSheet(sheetObjects[i]);

		initSheet(sheetObjects[i], i + 1);
		
		ComEndConfigSheet(sheetObjects[i]);
	}

	//handling Axon event. event catch
	axon_event.addListenerForm  ('beforedeactivate', 'obj_deactivate',  form, "rdoCity"); //- handling code when OnBeforeDeactivate event except rdoCity
	axon_event.addListenerFormat('beforeactivate',   'obj_activate',    form);            //- handling code when OnBeforeActivate event in case of existing dataformat property
	axon_event.addListenerFormat('keypress',         'obj_keypress', 	form);            //- handling code when onkeypress event in case of existing dataformat property
}

//handling Axon event 2
function obj_deactivate(){
    ComChkObjValid(event.srcElement);
}

function obj_activate(){
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
	case 1: //t1sheet1 init
		with (sheetObj) {

			// setting height
			style.height = 400;
			//setting width
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

			var HeadTitle = "|Row|CSR No.|Invoice Date|Terms Date|G/L Date|Service\nProvider\nCode|Amount|Off-Set No.|Approval\nFlag|Interface\nFlag|Interface\nError Reason";
			var headCount = ComCountHeadTitle(HeadTitle);

			//setting Column information[mandatory][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
			InitColumnInfo(headCount, 0, 0, true);

			// setting function handling header
			InitHeadMode(true, true, false, true, false, false)

			//header information[mandatory][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
			InitHeadRow(0, HeadTitle, true);

			var prefix="sheet1_";
			//data property    [ROW, COL,  DATATYPE,   WIDTH, DATAALIGN, COLMERGE, SAVENAME,  KEYFIELD, CALCULOGIC, DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
			InitDataProperty(0, cnt++, dtHiddenStatus, 0, daCenter, true, prefix+"ibflg");
			InitDataProperty(0, cnt++, dtDataSeq     , 0, daCenter, true, prefix+"rowno"       , false,	"", dfNone);
			InitDataProperty(0, cnt++, dtData        , 0, daCenter, true, prefix+"csr_no"      , false, "", dfNone);
			InitDataProperty(0, cnt++, dtData        , 0, daCenter, true, prefix+"inv_dt"      , false, "", dfDateYmd);
			InitDataProperty(0, cnt++, dtData        , 0, daCenter, true, prefix+"inv_term_dt" , false, "", dfDateYmd);
			InitDataProperty(0, cnt++, dtData        , 0, daCenter, true, prefix+"gl_dt"       , false, "", dfDateYmd);
			InitDataProperty(0, cnt++, dtData        , 0, daCenter, true, prefix+"vndr_no"     , false, "", dfNone);
			InitDataProperty(0, cnt++, dtData        , 0, daRight , true, prefix+"csr_amt"     , false, "", dfFloat, 2);
			InitDataProperty(0, cnt++, dtData        , 0, daCenter, true, prefix+"ftu_use_ctnt", false, "", dfNone);
			InitDataProperty(0, cnt++, dtData        , 0, daCenter, true, prefix+"apro_flg"    , false, "", dfNone);
			InitDataProperty(0, cnt++, dtData        , 0, daCenter, true, prefix+"if_flg"      , false, "", dfNone);
			InitDataProperty(0, cnt++, dtData        , 0, daCenter, true, prefix+"if_err_rsn"  , false, "", dfNone);

			FitColWidth("0|3|15|8|8|8|8|8|8|");

		}
		break;

	}
}

// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg = false;
	switch (sAction) {

	case IBSEARCH: //retrieve
		if (validateForm(sheetObj, formObj, sAction)){
			formObj.f_cmd.value = SEARCH;
			var prefix = "sheet1_";
			sheetObj.DoSearch("FNS_JOO_0027GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
		}
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
				var fr = iss_dt_fr.value;
				var to = iss_dt_to.value;

				if (ComGetDaysBetween(fr, to) < 0){
					ComShowCodeMessage("JOO00078");
					iss_dt_to.focus();
					return false;
				}
				break;
		}
	}

	return true;
}

