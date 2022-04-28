/*=========================================================
 *Copyright(c) 2009 CyberLogitec
 *@FileName : FNS_JOO_0078.js
 *@FileTitle : CSR Invoice Interface Status
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
 * @class FNS_JOO_0078 : business script for FNS_JOO_0078
 */

function FNS_JOO_0078() {
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

var rdObjects = new Array();
var rdCnt = 0;

var prefix = "sheet1_";

// Event handler processing by button click event */
document.onclick = processButtonClick;

// Event handler processing by button name */
function processButtonClick() {
	/***** setting sheet object *****/
	var sheetObject = sheetObjects[0];
	var formObj = document.form;

	try {
		var srcName = window.event.srcElement.getAttribute("name");

		switch (srcName) {

		case "btn_retrieve":

			if (!duration_change())
				return;

			doActionIBSheet(sheetObject, formObj, IBSEARCH);
			break;

		case "btn_new":
			ComResetAll();
			break;

		case "btn_save":
			if (ComIsBtnEnable("btn_save")) {
				doActionIBSheet(sheetObject, formObj, IBSAVE);
			}
			break;

		case "btn_fr_duration":
			var cal = new ComCalendar();

			cal.setEndFunction("duration_change"); 			
			cal.setDisplayType('date');
			cal.select(form.eff_dt_fr, 'yyyy-MM-dd');
			duration_change();
			break;

		case "btn_to_duration":
			var cal = new ComCalendar();

			cal.setEndFunction("duration_change"); 			
			cal.setDisplayType('date');
			cal.select(form.eff_dt_to, 'yyyy-MM-dd');
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

function obj_focus(){
    ComClearSeparator(event.srcElement);
}
/**
 * validation check <br>
 **/
function obj_blur() {
	ComChkObjValid(event.srcElement);
}

/**
 * only numbers <br>
 **/
function obj_keypress() {

	obj = event.srcElement;

	if (obj.dataformat == null)
		return;
	window.defaultStatus = obj.dataformat;

	switch (event.srcElement.dataformat) {
		case "engup":
			ComKeyOnlyAlphabet('uppernum', "0123456789");
			break;
		case "int":
			//only numbers
			ComKeyOnlyNumber(event.srcElement);
	
			break;
		case "float":
			//only numbers,  "."
			ComKeyOnlyNumber(event.srcElement, ".");
			break;
		default:
			//only numbers
			ComKeyOnlyNumber(event.srcElement);
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

	
	sheetObjects[0].ExtendLastCol = false;

	//initializing
	initControl();
}

/**
 * loading HTML Control event <br>
 * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
 * @param {ibsheet} sheetObj    IBSheet Object
 * @param {int}     sheetNo     sequence number in sheetObjects array
 **/
function initControl() {

	//handling Axon event. event catch
	axon_event.addListenerForm('blur', 'obj_blur', document.form); //- handling code when OnBeforeDeactivate(blur) event
	axon_event.addListenerFormat('keypress', 'obj_keypress', document.form); //- handling code when onkeypress event in case of existing dataformat property
	axon_event.addListenerFormat('beforeactivate',   'obj_focus', form);            //- handling code when OnBeforeActivate event in case of existing dataformat property

	axon_event.addListener('change', 'duration_change', 'eff_dt_fr'); //- Duration 입력 후 From~To 비교
	axon_event.addListener('change', 'duration_change', 'eff_dt_to'); //- Duration 입력 후 From~To 비교
}

/**
 * comparing From~To after inputting duration
 **/
function duration_change() {

	var formObj = document.form;
	var eff_dt_fr = ComReplaceStr(formObj.eff_dt_fr.value, '-');
	var eff_dt_to = ComReplaceStr(formObj.eff_dt_to.value, '-');
	if (eff_dt_fr != '' && eff_dt_to != '') {
		if (parseFloat(eff_dt_fr) > parseFloat(eff_dt_to)) {
			ComShowCodeMessage('JOO00078');
			formObj.eff_dt_to.value = "";
			return false;
		}

	}

	return true;

}

/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
function initSheet(sheetObj, sheetNo) {

	var cnt = 0;
	var sheetID = sheetObj.id;
	switch (sheetID) {

	case "sheet1":
		with (sheetObj) {

			// setting height
			style.height = 384;
			//setting width
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

			var HeadTitle1 = "|Seq|Aply|CSR No.|Offset\nNo.|Carrier|Vendor\nCode|Effective Date|Currency|Balance Amount|CSR Description|Error Type|Interface Error Message|TP|FUNC|OFC|ISS_DT|SER_NO|ACCT_YRMON|RE|SLP_ISS_OFC_CD"
				+"|evid_tp_cd|apro_flg|apro_dt|cxl_flg|cxl_desc|stl_cmb_seq|ddct_flg|ddct_locl_amt|ddct_desc|rqst_locl_amt"
				+"|rqst_dt|csr_tp_cd|slp_iss_rgn_cd|slp_iss_inter_co_cd|rvs_csr_flg|rjct_csr_flg|org_slp_tp_cd"
				+"|org_slp_func_cd|org_slp_ofc_cd|org_slp_iss_dt|org_slp_ser_no|if_flg|rcv_err_flg";	
			var headCount = ComCountHeadTitle(HeadTitle1);

			//setting Column information[mandatory][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
			InitColumnInfo(headCount, 0, 0, true);

			// setting function handling header
			InitHeadMode(true, true, false, true, false, false)

			//header information[mandatory][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
			InitHeadRow(0, HeadTitle1, true);

			//data property    [ROW, COL,  DATATYPE,   WIDTH, DATAALIGN, COLMERGE, SAVENAME,  KEYFIELD, CALCULOGIC, DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
			InitDataProperty(0, cnt++, dtHiddenStatus,  30, daCenter, true, prefix+"ibflag");
			InitDataProperty(0, cnt++, dtSeq         ,  35, daCenter, true, prefix+"seq"   );
			InitDataProperty(0, cnt++, dtCheckBox    ,  35, daCenter, true, prefix+"aply_chk"        , false, "", dfNone     , 0, false, false);
			InitDataProperty(0, cnt++, dtData        , 150, daCenter, true, prefix+"csr_no"          , false, "", dfNone     , 0, false, false);
			InitDataProperty(0, cnt++, dtData        ,  50, daCenter, true, prefix+"csr_offst_no"    , false, "", dfNone     , 0, false, false);
			InitDataProperty(0, cnt++, dtData        ,  50, daCenter, true, prefix+"jo_crr_cd"       , false, "", dfNone     , 0, false, false);
			InitDataProperty(0, cnt++, dtHidden      ,  60, daCenter, true, prefix+"vndr_seq"        , false, "", dfNone     , 0, false, false);
			InitDataProperty(0, cnt++, dtData        ,  95, daCenter,false, prefix+"eff_dt"          , false, "", dfDateYmd  , 0, false, false);
			InitDataProperty(0, cnt++, dtData        ,  60, daCenter, true,	prefix+"csr_locl_curr_cd", false, "", dfNone     , 0, false, false);
			InitDataProperty(0, cnt++, dtData        , 100, daRight , true, prefix+"csr_locl_amt"    , false, "", dfNullFloat, 2, false, false);
			InitDataProperty(0, cnt++, dtData        , 120, daLeft  , true, prefix+"csr_desc"        , false, "", dfNone     , 0, false, false);
			InitDataProperty(0, cnt++, dtData        , 100, daLeft  , true, prefix+"if_rcv_msg"      , false, "", dfNone     , 0, false, false);
			InitDataProperty(0, cnt++, dtData        , 220, daLeft  , true, prefix+"rcv_err_rsn"     , false, "", dfNone     , 0, false, false);
			InitDataProperty(0, cnt++, dtHidden      ,   0, daLeft  , true, prefix+"slp_tp_cd"       , false, "", dfNone     , 0, false, false);
			InitDataProperty(0, cnt++, dtHidden      ,   0, daLeft  , true, prefix+"slp_func_cd"     , false, "", dfNone     , 0, false, false);
			InitDataProperty(0, cnt++, dtHidden      ,   0, daLeft  , true, prefix+"slp_ofc_cd"      , false, "", dfNone     , 0, false, false);
			InitDataProperty(0, cnt++, dtHidden      ,   0, daLeft  , true, prefix+"slp_iss_dt"      , false, "", dfNone     , 0, false, false);
			InitDataProperty(0, cnt++, dtHidden      ,   0, daLeft  , true, prefix+"slp_ser_no"      , false, "", dfNone     , 0, false, false);
			InitDataProperty(0, cnt++, dtHidden      ,   0, daLeft  , true, prefix+"acct_yrmon"      , false, "", dfNone     , 0, false, false);
			InitDataProperty(0, cnt++, dtHidden      ,   0, daLeft  , true, prefix+"re_divr_cd"      , false, "", dfNone     , 0, false, false);
			InitDataProperty(0, cnt++, dtHidden      ,   0, daLeft  , true, prefix+"slp_iss_ofc_cd"  , false, "", dfNone     , 0, false, false);
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"evid_tp_cd"       );
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"apro_flg"         );
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"apro_dt"          );
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"cxl_flg"          );
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"cxl_desc"         );
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"stl_cmb_seq"      );
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"ddct_flg"         );
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"ddct_locl_amt"    );
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"ddct_desc"        );
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"rqst_locl_amt"    );
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"rqst_dt"          );
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"csr_tp_cd"        );
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"slp_iss_rgn_cd"   );
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"slp_iss_inter_co_cd");
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"rvs_csr_flg"      );
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"rjct_csr_flg"     );
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"org_slp_tp_cd"    );
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"org_slp_func_cd"  );
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"org_slp_ofc_cd"   );
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"org_slp_iss_dt"   );
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"org_slp_ser_no"   );	
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"if_flg"           );	
			InitDataProperty(0, cnt++, dtHidden      ,  30, daLeft  ,false, prefix+"rcv_err_flg"      );	
		}
		break;
	}
}

// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {

	sheetObj.ShowDebugMsg = false;
	
	if (!validateForm(sheetObj, formObj, sAction))
		return;

	switch (sAction) {
		case IBSEARCH: //retrieve
			formObj.f_cmd.value = SEARCH;
			sheetObj.DoSearch("FNS_JOO_0078GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			break;
	
		case IBSAVE: //save
			var SaveStr = ComGetSaveString(sheetObj);
			
			if (SaveStr==""){
				ComShowCodeMessage("JOO00165"); //Please click the row that you want to reject.
				return;
			}
	
			if (!ComShowCodeConfirm("JOO00166")){ //Are you sure to reject it?
				return false;
			}
			
			sheetObj.WaitImageVisible=false;
			ComOpenWait(true);
			formObj.f_cmd.value = MULTI;
			var sXml = sheetObj.GetSaveXml("FNS_JOO_0078GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			ComOpenWait(false);
			sheetObj.LoadSearchXml(sXml);
			
			doActionIBSheet(sheetObj, formObj, IBSEARCH);
			break;
	}
}

/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	switch (sAction) {
		case IBSEARCH: //retrieve
			var fr = formObj.eff_dt_fr.value;
			var to = formObj.eff_dt_to.value;
			var csrNo = formObj.csr_no.value;
			if (fr.length == 0 && to.length == 0 && csrNo.length < gDefaultCsrLength){
				ComShowCodeMessage("JOO00167");
				return false;
			}
			
			if ((fr.length == 0 && to.length != 0)||(fr.length != 0 && to.length == 0)){
				ComShowCodeMessage("JOO00168");
				return false;
			}
			break;
			
		case IBSAVE: //REject
			break;
	}
	
	return true;
}

/**
 * Sheet click event
 */
function sheet1_OnClick(sheetObj, Row, Col, Value) {
	for (var i=sheetObj.HeaderRows(); i <= sheetObj.LastRow(); i++){
		if (i == Row){
			sheetObj.SetCellValue(i, prefix+"aply_chk", "1");
		}else{
			sheetObj.CellValue(i, prefix+"aply_chk", "");
		}
	}
}
