/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : fns_joo_0007.js
*@FileTitle  : Slot Hire
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/17
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
		    	sheetObjects[0].RemoveAll();
				if (formObj.acct_yrmon.value!=""){
					formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M",-1).substring(0,7);
				}
				doActionIBSheet(sheetObjects[1], formObj, IBSEARCH_ASYNC10);
				break;
			case "btns_next":
				sheetObjects[0].RemoveAll();
				if (formObj.acct_yrmon.value!=""){
					formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M", +1).substring(0,7);
				}
				doActionIBSheet(sheetObjects[1], formObj, IBSEARCH_ASYNC10);
				break;
			case "btn_add":
				if (!validateForm(sheetObject1, formObj, IBSEARCHAPPEND)) return;	
				
				UF_addRow();
				break;
			case "btn_delete":
				JooRowHideDelete(sheetObject1, prefix+"del_chk");
				break;
			case "btn_copy":
				if (!validateForm(sheetObject1, formObj, IBSEARCHAPPEND)) return;	
				
				UF_copyRow();
				break;
			case "btn_delete_all":
				doActionIBSheet(sheetObject1, formObj, IBDELETE);
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
	       			sheetObject1.Down2Excel( {DownCols: makeHiddenSkipCol(sheetObject1), SheetDesign:1,Merge:1 });
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
	axon_event.addListenerFormat('blur', 'obj_blur'    , formObj);
	axon_event.addListenerFormat('focus'  , 'obj_focus'   , formObj);
    axon_event.addListener('click', 'change_event_radio', 're_divr_cd');
    //axon_event.addListener('click', 'g6_ga_yn_click', 'g6_ga_yn');
    
	//[2015.09.18] New Carrier jo_crr_cd/trd_cd/rlane_cd 조회.
	doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC20);
	
    formObj.acct_yrmon.focus();
}
//handling Axon event 2
function obj_blur(){
    ComChkObjValid(event.srcElement);
	var src=ComGetEvent("name")
    if (src == "acct_yrmon"){
    	ComAddSeparator(ComGetEvent(), "Ym");
    	doActionIBSheet(sheetObjects[1], document.form, IBSEARCH_ASYNC10);
    }
}
function obj_focus(){
    ComClearSeparator(event.srcElement);
}
function change_event_radio(){
	var formObj = document.form;
	
	sheetObjects[0].RemoveAll();

	doActionIBSheet(sheetObjects[1], document.form, IBSEARCH_ASYNC10);	
	
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
	    with(sheetObj){
      if (location.hostname != "")
      var HeadTitle="STS||VSL|VOY|Dir.|Fin.\nDir.|BSA Type|Port To Port|Port To Port|TEU|Price|From\nDate/Time|To\nDate/Time|Days|Cur|Amount|Combined\nNo.|RVS|Basic\nPort|Schedule|Unit Cost\nBasic Port|acct_yrmon|stl_vvd_seq|stl_seq|trd_cd|jo_crr_cd|rlane_cd|re_divr_cd|jo_stl_itm_cd|jo_mnu_nm|slip_no|stl_adj_flg|stl_lst_flg|uc_bss_port_etd_dt|Dup.";
      var headCount=ComCountHeadTitle(HeadTitle);

      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );

      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
      var headers = [ { Text:HeadTitle, Align:"Center"} ];
      InitHeaders(headers, info);

      var cols = [ {Type:"Status",    Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"ibflag" },
             {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"del_chk" },
             {Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_cd",            	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
             {Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:prefix+"skd_voy_no",         	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:4 },
             {Type:"Combo",     Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"skd_dir_cd",        	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:1 },
             {Type:"Text",      Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"rev_dir_cd",         	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:1 },
             {Type:"Combo",     Hidden:0, Width:200,  Align:"Left",    ColMerge:1,   SaveName:prefix+"jo_stl_jb_cd",       	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
             {Type:"Text",      Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:prefix+"fm_port_cd",     		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 , EditLen:5},
             {Type:"Text",      Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:prefix+"to_port_cd",     		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 , EditLen:5},
             {Type:"Float",     Hidden:0, Width:70,   Align:"Right",   ColMerge:1,   SaveName:prefix+"bsa_qty",            	KeyField:0,   CalcLogic:"",   Format:"NullFloat", 	PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
             {Type:"Float",     Hidden:0, Width:70,   Align:"Right",   ColMerge:1,   SaveName:prefix+"bsa_slt_prc",        	KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
             {Type:"Text",      Hidden:0, Width:110,  Align:"Left",    ColMerge:0,   SaveName:prefix+"st_dt", 				KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
             {Type:"Text",      Hidden:0, Width:110,  Align:"Left",    ColMerge:0,   SaveName:prefix+"end_dt", 				KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
             {Type:"Float",     Hidden:0, Width:70,   Align:"Right",   ColMerge:1,   SaveName:prefix+"sail_dys",        	KeyField:0,   CalcLogic:"",   Format:"NullFloat",   UpdateEdit:0,   InsertEdit:0 },
             {Type:"Text",      Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"locl_curr_cd",       	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
             {Type:"AutoSum",   Hidden:0, Width:110,   Align:"Right",   ColMerge:1,   SaveName:prefix+"stl_locl_amt",       	KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
             {Type:"Text",      Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:prefix+"stl_cmb_seq",        	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
             {Type:"Text",      Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"rvs_cmb_flg",        	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
             {Type:"Text",      Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:prefix+"stl_bzc_port_cd",    	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
             {Type:"Text",      Hidden:0, Width:110,  Align:"Center",  ColMerge:1,   SaveName:prefix+"eta_dt",             	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
             {Type:"Text",      Hidden:1, Width:70,   Align:"Center",  ColMerge:1,   SaveName:prefix+"uc_bss_port_cd",     	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
             {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"acct_yrmon",         	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
             {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_vvd_seq",        	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
             {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_seq",            	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
             {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"trd_cd",             	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
             {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_crr_cd",          	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
             {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"rlane_cd",           	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
             {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"re_divr_cd",         	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
             {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_stl_itm_cd",      	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
             {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_mnu_nm",          	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
             {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"slip_no",            	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
             {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_adj_flg",        	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
             {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_lst_flg",        	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
             {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"uc_bss_port_etd_dt", 	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"stl_dup_flg",        	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
       
      		InitColumns(cols);

			SetEditable(1);
//			SetSheetHeight(460);
			resizeSheet();
			SetColProperty(0 ,prefix+"vsl_cd", {AcceptKeys:"E|N" , InputCaseSensitive:1});
			SetColProperty(0 ,prefix+"skd_voy_no", {AcceptKeys:"E|N" , InputCaseSensitive:1});
			SetColProperty(0 ,prefix+"fm_port_cd", {AcceptKeys:"E|N" , InputCaseSensitive:1});
			SetColProperty(0 ,prefix+"to_port_cd", {AcceptKeys:"E|N" , InputCaseSensitive:1});
			SetColProperty(prefix+"skd_dir_cd", {ComboText:"E|W|S|N", ComboCode:"E|W|S|N"} );
			SetColProperty(prefix+"jo_stl_jb_cd", {ComboText:gStlComnm, ComboCode:gStlCombo} );
			SetColProperty(prefix+"eta_dt", {Format:"####-##-## ##:##:##"} );
			SetColProperty(prefix+"st_dt", {Format:"####-##-## ##:##"} );
			SetColProperty(prefix+"end_dt", {Format:"####-##-## ##:##"} );
			
			SetColHidden(prefix+"fm_port_cd"	, 1);
			SetColHidden(prefix+"to_port_cd"	, 1);
			SetColHidden(prefix+"st_dt"			, 1);
			SetColHidden(prefix+"end_dt"		, 1);
			SetColHidden(prefix+"sail_dys"		, 1);
			
      }


		break;
	case 2: //t1sheet1 init
//		sheetObj.SetSheetHeight(0);
		sheetObj.SetVisible(false);
		break;
	}
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	if (!validateForm(sheetObj, formObj, sAction))
		return;
	switch (sAction) {
		case IBSEARCH: //retrieve
			formObj.f_cmd.value=SEARCH;
			var sXml=sheetObj.GetSearchData("FNS_JOO_0007GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			break;
		//CREATE
		case IBCREATE:
			formObj.f_cmd.value=SEARCH01;
 			var sXml=sheetObj.GetSearchData("FNS_JOO_0007GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			if (ComGetEtcData(sXml,"TRANS_RESULT_KEY") == "S"){
				if (sheetObj.RowCount("I") == 0){
					ComShowCodeMessage('JOO00054');
				}
			}
			break;
		//displaying Error Message and close in case of duplication
		case IBSAVE: //save
			var SaveStr=ComGetSaveString(sheetObjects[0], true, true);
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
 			var sXml=sheetObj.GetSaveData("FNS_JOO_0007GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			ComOpenWait(false);
			sheetObj.LoadSearchData(sXml,{Sync:1} );
//			var dupRows = "";
//			for(var i=sheetObj.HeaderRows; i<=sheetObj.RowCount(); i++){
//				if (sheetObj.CellValue(i,prefix+"stl_dup_flg") == "Y"){
//					dupRows = dupRows + i +"|";
//				}
//			}
//			
//			if (dupRows.length > 0)
//				dupRows = dupRows.substring(0, dupRows.length-1);
			var RTNVAL=ComGetEtcData(sXml, "RTNVAL");
			if (RTNVAL == "E"){
				ComShowCodeMessage("JOO00161");
				return;
//				if (ComShowCodeConfirm('JOO00132', dupRows)){
//					doActionIBSheet(sheetObj, document.form, IBINSERT);					
//				}
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
 			var sXml=sheetObj.GetSaveData("FNS_JOO_0007GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			ComOpenWait(false);
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			var dupRows="";
			for(var i=sheetObj.HeaderRows(); i < sheetObj.LastRow(); i++){
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
		//whole deletion
		case IBDELETE:
			if (!ComShowCodeConfirm("JOO00061")){
				return;
			}
			formObj.f_cmd.value=REMOVE01;
			sheetObj.SetWaitImageVisible(0);
			ComOpenWait(true);
 			//sheetObj.DoSearch("FNS_JOO_0007GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix) );
 			var sXml=sheetObj.GetSaveData("FNS_JOO_0007GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			ComOpenWait(false);
			var resultKey=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
			if("S" == resultKey){
				doActionIBSheet(sheetObj, formObj, IBSEARCH);
			}
			
			break;
		//inputting VVD 9 charaters
		case IBROWSEARCH:
			formObj.f_cmd.value=SEARCHLIST;
			formObj.cur_row.value=(gCurRow - sheetObj.HeaderRows());
			var SaveStr=ComGetSaveString(sheetObj,true,true,-1);
 			var sXml=sheetObj.GetSaveData("FNS_JOO_0007GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
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
		//in case of inputting VVD 10 characters
		case IBSEARCH_ASYNC01:
			formObj.f_cmd.value=SEARCHLIST01;
			formObj.cur_row.value=gCurRow - sheetObj.HeaderRows();
			var SaveStr=ComGetSaveString(sheetObj,true,true,-1);
 			var sXml=sheetObj.GetSaveData("FNS_JOO_0007GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			var CHECKVVD=ComGetEtcData(sXml,"CHECKVVD");
			if (CHECKVVD=="N"){
				sheetObj.SetCellValue(gCurRow, prefix+"stl_vvd_seq"       	,ComGetEtcData(sXml,"stl_vvd_seq")		,0);
				sheetObj.SetCellValue(gCurRow, prefix+"stl_bzc_port_cd"   	,ComGetEtcData(sXml,"stl_bzc_port_cd")	,0);
				sheetObj.SetCellValue(gCurRow, prefix+"eta_dt"            	,ComGetEtcData(sXml,"eta_dt")			,0);
				//sheetObj.CellValue2(gCurRow, prefix+"uc_bss_port_cd"    ) = ComGetEtcData(sXml,"uc_bss_port_cd");
				sheetObj.SetCellValue(gCurRow, prefix+"uc_bss_port_etd_dt"	,ComGetEtcData(sXml,"uc_bss_port_etd_dt"),0);
				//Option G6/GA 일때만 아래 날짜를 넣는다.
				if("G" == $("#sch_tp_cd").val()){
					sheetObj.SetCellValue(gCurRow, prefix+"st_dt"			,ComGetEtcData(sXml,"st_dt")			,0);
					sheetObj.SetCellValue(gCurRow, prefix+"end_dt"			,ComGetEtcData(sXml,"end_dt")			,0);
					
					//날짜 계산.
					initSetSailDays(sheetObj, gCurRow);
				}
				sheetObj.SelectCell(gCurRow, prefix+"bsa_qty", true);
			}else{
				if (CHECKVVD=="E"){
					ComShowCodeMessage("JOO00141");
				}else if (CHECKVVD=="T"){
					ComShowCodeMessage("JOO00142");
				}
				sheetObj.SetCellValue(gCurRow, prefix+"stl_vvd_seq"    ,"",0);
				sheetObj.SetCellValue(gCurRow, prefix+"stl_bzc_port_cd","",0);
				sheetObj.SetCellValue(gCurRow, prefix+"eta_dt"         ,"",0);
				sheetObj.SetCellValue(gCurRow, prefix+"vsl_cd"         ,"",0);
				sheetObj.SetCellValue(gCurRow, prefix+"skd_voy_no"     ,"",0);
				sheetObj.SetCellValue(gCurRow, prefix+"skd_dir_cd"     ,"",0);
				sheetObj.SetCellValue(gCurRow, prefix+"rev_dir_cd"     ,"",0);
				sheetObj.SelectCell(gCurRow, prefix+"vsl_cd", true);
			}
			break;
		case IBSEARCH_ASYNC10: //searching whether closing
			formObj.f_cmd.value=SEARCH10;
 			var sXml=sheetObj.GetSearchData("FNS_JOO_0007GS.do", FormQueryString(formObj));
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

			
		case IBSEARCH_ASYNC20 : //2015.09.17 MultiCombo Rlane CD			
			var params = "";					
			params += "f_cmd=" + SEARCH21; 
			params += "&jo_stl_itm_cd="+ComGetObjValue(formObj.jo_stl_itm_cd);	 			
			params += "&re_divr_cd="+JooGetRadioValue(formObj.re_divr_cd); 
			
			var sXml = sheetObj.GetSearchData("JOOCommonGS.do", params);
			ComXml2ComboItem(sXml, cmb_jo_crr_cd, "grp_key", "jo_crr_cd|trd_cd|rlane_cd|jo_stl_opt_cd|jo_crr_auth_cd|locl_curr_cd");
			
			return "S";
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
				SetTitleVisible(1);//title
				SetTitle("Carrier|Trade|Lane|S.Option|Auth|Currency")
				SetColAlign(0, "center");
				SetColAlign(1, "center");
				SetColAlign(2, "center");
				SetColAlign(3, "center");
				SetColAlign(4, "center");
				SetColAlign(5, "center");
				SetColWidth(0, "40");
				SetColWidth(1, "40");
				SetColWidth(2, "60");
				SetColWidth(3, "0");
				SetColWidth(4, "0");
				SetColWidth(5, "0");
				//SetDropHeight(160);
				ValidChar(2,1);//only upper case, numbers
				SetSelectIndex(0);
		    }
			break;
    	case 2: 
            with (comboObj) { 
				SetDropHeight(100);
 				SetMultiSelect(0);
				SetColAlign(0, "left");
				SetColWidth(0, "100");
                ValidChar(2,1);    // Uppercase
                SetUseAutoComplete(true);
 				//comboObj.InsertItem(0, 'VVD', 'V');
 				//comboObj.InsertItem(1, 'Port to Port', 'P'); 				
  		    }
            var comboItems="VVD,V|G6/GA,G|Port to Port,P".split("|");
            addComboItem(comboObj, comboItems);
            comboObj.SetSelectIndex(0,false);
  			break;
 	} 
}

//jo_crr_cd|trd_cd|rlane_cd|jo_stl_opt_cd|jo_crr_auth_cd|locl_curr_cd
function cmb_jo_crr_cd_OnChange(comboObj, OldIndex, OldText, OldCode, NewIndex, NewText, NewCode){
	if(OldIndex == NewIndex) return;
	
	var formObj = document.form;
	var selJoCrrCd 		= JooComGetCarrierText(comboObj, 0); //jo_crr_cd
	var selTrdCd 		= JooComGetCarrierText(comboObj, 1); //trd_cd
	var selRlaneCd 		= JooComGetCarrierText(comboObj, 2); //rlane_cd
	var selJoStlOptCd 	= JooComGetCarrierText(comboObj, 3); //jo_stl_opt_cd
	var selCrrAuthCd 	= JooComGetCarrierText(comboObj, 4); //jo_crr_auth_cd
	var selLoclCurrCd 	= JooComGetCarrierText(comboObj, 5); //locl_curr_cd	

	ComSetObjValue(formObj.jo_crr_cd	, selJoCrrCd);
	ComSetObjValue(formObj.trd_cd		, selTrdCd);
	ComSetObjValue(formObj.rlane_cd		, selRlaneCd);	
	
	sheetObjects[0].RemoveAll();
	
	UF_setAuth(selCrrAuthCd);
}

function cmb_jo_crr_cd_OnBlur(comboObj){
	var selRlaneCd 		= JooComGetCarrierText(comboObj, 2); //rlane_cd
	
	if (selRlaneCd.length == 5){
		doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
	}
}

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
		sheetObjects[i].SetEditable(editable);
	}
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	var selLoclCurrCd 	= JooComGetCarrierText(cmb_jo_crr_cd, 5); //locl_curr_cd
	
	switch (sAction) {
		case IBCREATE: //retrieving for saving
		case IBSEARCH: //retrieve
			if (ComIsEmpty(formObj.acct_yrmon)){
				ComShowCodeMessage('JOO00033');
				formObj.acct_yrmon.focus();
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
			if(sAction == IBCREATE){
				if (selLoclCurrCd.length!=3){
					ComShowCodeMessage('JOO00082');
					return false;
				}
			}			
			break;
		case IBSAVE:   //save
			var cnt=0; //checking changed item
			
			for (var inx=sheetObj.HeaderRows(); inx <= sheetObj.LastRow(1); inx++){
				var status=sheetObj.GetRowStatus(inx);
				if (status =="R")
					continue;
				cnt++;
				var slip=sheetObj.GetCellValue(inx, prefix+"stl_cmb_seq");
				if (status == "D" &&  slip != ""){
					ComShowCodeMessage('JOO00057',inx, slip);
					sheetObj.SelectCell(inx, prefix+"del_chk", true);
					return false;
				}
				if ((status == "I" || status == "U") && sheetObj.GetCellValue(inx, prefix+"del_chk") == "1"){
					ComShowCodeMessage("JOO00079");
					sheetObj.SelectCell(inx,prefix+"del_chk",true);
					return false;
				}
				if (status == "D") 
					continue;
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
				if (sheetObj.GetCellValue(inx, prefix+"jo_stl_jb_cd").length < 3){
					ComShowCodeMessage('JOO00158',inx);
					sheetObj.SelectCell(inx, prefix+"jo_stl_jb_cd", true);
					return false;
				}
				if (sheetObj.GetCellValue(inx, prefix+"stl_locl_amt").length == 0
				||  sheetObj.GetCellValue(inx, prefix+"stl_locl_amt") == "0"){
					ComShowCodeMessage('JOO00056',inx);
					sheetObj.SelectCell(inx, prefix+"stl_locl_amt", true);
					return false;
				}
				
				//VVD, G6/GA, Port to Port
				var tmpSchTpCd = $("#sch_tp_cd").val();
				if("P"==tmpSchTpCd){
					if (sheetObj.GetCellValue(inx, prefix+"fm_port_cd").length < 1){
						ComShowCodeMessage('JOO00193',inx);
						sheetObj.SelectCell(inx, prefix+"fm_port_cd", true);
						return false;
					}
					if (sheetObj.GetCellValue(inx, prefix+"to_port_cd").length < 1){
						ComShowCodeMessage('JOO00194',inx);
						sheetObj.SelectCell(inx, prefix+"to_port_cd", true);
						return false;
					}
				}else if("G"==tmpSchTpCd){
					if (sheetObj.GetCellValue(inx, prefix+"st_dt").length < 1){
						ComShowCodeMessage('JOO00195',inx);
						sheetObj.SelectCell(inx, prefix+"st_dt", true);
						return false;
					}
					if (sheetObj.GetCellValue(inx, prefix+"end_dt").length < 1){
						ComShowCodeMessage('JOO00196',inx);
						sheetObj.SelectCell(inx, prefix+"end_dt", true);
						return false;
					}
				}
				
				//Dup Check
				if(isExistsSamePair(sheetObj, inx)){
					return false;
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
		case IBDELETE: //whole deletion
			var isCombined=false;
			var stlCmbSeq="";
			for (var i=sheetObj.HeaderRows(); i <= sheetObj.LastRow(1); i++){
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
	initSheetColHidden(sheetObj);
	
	if(sheetObj.RowCount() == 0){
		return;
	}
	//UI개선(201408 민정호)
	//Too many letters and numbers 에러 메시지 발생
 	sheetObj.SetSumText(0,prefix+"vsl_cd","TOTAL");	
 	var iChkBsaCurrency = 0; 
	//if combined data
	for (var i=sheetObj.HeaderRows(); i<= sheetObj.LastRow(1); i++){
		var ibflag=sheetObj.GetRowStatus(i);
		var stlCmbSeq=sheetObj.GetCellValue(i, prefix+"stl_cmb_seq");
		
		if (ibflag == "R"){
			if (ComTrim(stlCmbSeq) == ""){
				sheetObj.SetCellEditable(i, prefix+"del_chk"     ,1);
				sheetObj.SetCellEditable(i, prefix+"stl_locl_amt",1);
			}else{
				sheetObj.SetCellEditable(i, prefix+"del_chk"     ,0);
				sheetObj.SetCellEditable(i, prefix+"stl_locl_amt",0);
				
				sheetObj.SetCellEditable(i, prefix+"bsa_qty",0);
				sheetObj.SetCellEditable(i, prefix+"bsa_slt_prc",0);
				
				sheetObj.SetCellEditable(i, prefix+"fm_port_cd",0);
				sheetObj.SetCellEditable(i, prefix+"to_port_cd",0);
				
				sheetObj.SetCellEditable(i, prefix+"st_dt",0);
				sheetObj.SetCellEditable(i, prefix+"end_dt",0);
			}
		}else if(ibflag == "I" || ibflag == "U"){
			initSetSailDays(sheetObj, i);			
			
			//stl_locl_amt Create 시 생성한다.
			initSheetColMakeStlLoclAmt(sheetObj, i);

		}
		
	}
	
	//-Create 시 BSA에서 Price를 가져 온 경우만 : "Check the currency : it's different BSA with JOO settlement" //JOO00197
	getCheckCurrency(sheetObj, "I");
	
	//Ammount 금액을 구한다. VVD, Port to Prot : TEU * Price, G6/GA : TEU * Price * Days	
	
}

function getCheckCurrency(sheetObj, flag){
	var iChkBsaCurrency = 0;
	with(sheetObj){
		switch(flag){
			case "I" :
			case "U" :
				for (var i=HeaderRows(); i< LastRow(); i++){	
					var ibflag=GetRowStatus(i);
					
					var varBsaSltPrc = GetCellValue(i, prefix+"bsa_slt_prc");
					var varLoclCurrCd = GetCellValue(i, prefix+"locl_curr_cd");
					if("I"== ibflag && "" != varBsaSltPrc && gCurrencyUSD != varLoclCurrCd){
						iChkBsaCurrency ++;
					}
				}
				break;
		}
	}
	//Create 시 BSA에서 Price를 가져 온 경우만 : "Check the currency : it's different BSA with JOO settlement" //JOO00197
	if(iChkBsaCurrency > 0){
		ComShowCodeMessage("JOO00197");
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
}
function sheet1_OnChange(sheetObj, Row, Col, Value) {
	var sName=sheetObj.ColSaveName(Col);
	var formObj=document.form;
	gCurRow=Row;
	var vsl=sheetObj.GetCellValue(Row, prefix+"vsl_cd");
	var voy=sheetObj.GetCellValue(Row, prefix+"skd_voy_no");
	var dir=sheetObj.GetCellValue(Row, prefix+"skd_dir_cd");
	var rev=sheetObj.GetCellValue(Row, prefix+"rev_dir_cd");
	var vvd=vsl+voy+dir+rev;
	
	switch(sName){
		case prefix+"vsl_cd":
		case prefix+"skd_voy_no":
		case prefix+"skd_dir_cd":
		case prefix+"rev_dir_cd":
			var tmp=sheetObj.GetComboInfo(Row, prefix+"rev_dir_cd", "Code");
			if ( sName!=prefix+"rev_dir_cd" || tmp.length <= 1 && Value == "" && sheetObj.GetRowStatus(Row) == "I"){
				var vvd1=vsl + voy + dir;
				if (vvd1.length == 9){
					doActionIBSheet(sheetObj, formObj, IBROWSEARCH);
				}
			}
			if (vvd.length == 10){
				doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC01);
			}
			break;
		case prefix+"jo_stl_jb_cd":
			var bsaType=sheetObj.GetCellValue(Row, prefix+"jo_stl_jb_cd");
			if (bsaType.length != 3){
				ComShowCodeMessage("JOO00158", Row);
				sheetObj.SetCellValue(Row, Col,"",0);
				return;
			}
			break;
		case prefix+"bsa_qty":
		case prefix+"bsa_slt_prc":
		case prefix+"st_dt": 
		case prefix+"end_dt":			
			var qty=sheetObj.GetCellValue(Row, prefix+"bsa_qty");
			if (sName == prefix+"bsa_qty"){
				qty=Value;
			}
			var prc=sheetObj.GetCellValue(Row, prefix+"bsa_slt_prc");
			if (sName == prefix+"bsa_slt_prc"){
				prc=Value;
			}
			
			initSetSailDays(sheetObj, Row);
			
			
			initSheetColMakeStlLoclAmt(sheetObj, Row);
			
			var amt = qty*prc;
			
			// Dup Check.
			isExistsSamePair(sheetObj, Row);
			
			//if (isExistsSamePair(sheetObj, Row)){
				/*if (!ComShowCodeConfirm("JOO00157")){
					sheetObj.CellValue2(Row, prefix+"bsa_qty"     ) = "";
					sheetObj.CellValue2(Row, prefix+"bsa_slt_prc" ) = "";
					sheetObj.CellValue2(Row, prefix+"stl_locl_amt") = "";
				}else{
					sheetObj.CellValue2(Row, prefix+"stl_dup_flg" ) = "Y";
				}*/
				
			//}
			break;
	}
	
}

function sheet1_OnLoadFinish(sheetObj) {
	initSheetColHidden(sheetObj);
}
/**
 * checking whether same data exists
 * @param sheetObj
 * @param Row
 * @param vsl
 * @param voy
 * @param dir
 * @param fin
 * @param bsaTp
 * @param qty
 * @param amt
 * @return
 */
function isExistsSamePair(sheetObj, Row){
	var rtnVal=false;
	var tmpSchTpCd = $("#sch_tp_cd").val();
	
	var currVsl 		= sheetObj.GetCellValue(Row, prefix+"vsl_cd");
	var currSkdVoyNo 	= sheetObj.GetCellValue(Row, prefix+"skd_voy_no");
	var currSkdDirCd 	= sheetObj.GetCellValue(Row, prefix+"skd_dir_cd");
	var currFinDir 		= sheetObj.GetCellValue(Row, prefix+"rev_dir_cd");
	var currJoStlJbCd 	= sheetObj.GetCellValue(Row, prefix+"jo_stl_jb_cd");
	var currBsaQty 		= sheetObj.GetCellValue(Row, prefix+"bsa_qty");
	var currStlLoclAmt 	= sheetObj.GetCellValue(Row, prefix+"stl_locl_amt");
	var currStDt		= sheetObj.GetCellValue(Row, prefix+"st_dt");
	var currEndDt		= sheetObj.GetCellValue(Row, prefix+"end_dt");
	var currSailDys		= sheetObj.GetCellValue(Row, prefix+"sail_dys");	
	var currFmPortCd	= sheetObj.GetCellValue(Row, prefix+"fm_port_cd");
	var currToPortCd	= sheetObj.GetCellValue(Row, prefix+"to_port_cd");	
	
	
	for(var inx=sheetObj.HeaderRows(); inx<= sheetObj.LastRow(1); inx++){
		if (inx==Row) continue;
		var lvsl=sheetObj.GetCellValue(inx, prefix+"vsl_cd");
		var lvoy=sheetObj.GetCellValue(inx, prefix+"skd_voy_no");
		var ldir=sheetObj.GetCellValue(inx, prefix+"skd_dir_cd");
		var lfin=sheetObj.GetCellValue(inx, prefix+"rev_dir_cd");
		var lbsaTp=sheetObj.GetCellValue(inx, prefix+"jo_stl_jb_cd");
		var lqty=sheetObj.GetCellValue(inx, prefix+"bsa_qty");
		var lamt=sheetObj.GetCellValue(inx, prefix+"stl_locl_amt");
		
		if (lvsl == currVsl && lvoy == currSkdVoyNo &&  ldir == currSkdDirCd && lfin == currFinDir && 
		    lbsaTp == currJoStlJbCd && lqty == currBsaQty && lamt == currStlLoclAmt){
			if("V"==tmpSchTpCd){
				rtnVal=true;
				break;
			}else if("G"==tmpSchTpCd){
				
				var lStDt=sheetObj.GetCellValue(inx, prefix+"st_dt");
				var lEndDt=sheetObj.GetCellValue(inx, prefix+"end_dt");
				var lSailDys=sheetObj.GetCellValue(inx, prefix+"sail_dys");	
				
				if(lStDt == currStDt && lEndDt == currEndDt && lSailDys == currSailDys){
					rtnVal=true;
					break;
				}				
			}else if("P"==tmpSchTpCd){
				var lFmPortCd=sheetObj.GetCellValue(inx, prefix+"fm_port_cd");
				var lToPortCd=sheetObj.GetCellValue(inx, prefix+"to_port_cd");
				
				if(lFmPortCd == currFmPortCd && lToPortCd == currToPortCd){
					rtnVal=true;
					break;
				}				
			}
		}
	}
	
	if(rtnVal){
		ComShowCodeMessage("JOO00059", Row);
		
		sheetObj.SetCellValue(Row, prefix+"bsa_qty"     ,"",0);
		sheetObj.SetCellValue(Row, prefix+"bsa_slt_prc" ,"",0);
		sheetObj.SetCellValue(Row, prefix+"stl_locl_amt","",0);
		
		if("G"==tmpSchTpCd){
			sheetObj.SetCellValue(Row, prefix+"st_dt"     	,"",0);
			sheetObj.SetCellValue(Row, prefix+"end_dt" 		,"",0);
			sheetObj.SetCellValue(Row, prefix+"sail_dt" 	,"",0);
		}else if("P"==tmpSchTpCd){
			sheetObj.SetCellValue(Row, prefix+"fm_port_cd"     	,"",0);
			sheetObj.SetCellValue(Row, prefix+"to_port_cd" 		,"",0);
		}
	}	
	
	return rtnVal;
}

function sch_tp_cd_OnChange(Obj, OldIndex, OldText, OldCode, NewIndex, NewText, NewCode) {
	var formObj=document.form;
	if(OldCode != NewCode){
		/*$("#g6_ga_yn").prop("checked", false);
		$("#g6_ga_yn").attr("value","N");
		if("P" == NewCode){
			$("#g6_ga_yn").prop("disabled", true );
		}else{
			$("#g6_ga_yn").prop("disabled", false );
		}*/
		//initSheetColHidden(sheetObjects[0]);
		
		//재조회를 한다.
		doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
	}
}

function initSheetColHidden(sheetObj){
	
	var tmpCondOption = $("#sch_tp_cd").val();
	
	if("P" == tmpCondOption){ // Option : Port to Port
		sheetObj.SetColHidden(prefix+"fm_port_cd"	, 0);
		sheetObj.SetColHidden(prefix+"to_port_cd"	, 0);
		sheetObj.SetColHidden(prefix+"st_dt"		, 1);
		sheetObj.SetColHidden(prefix+"end_dt"		, 1);
		sheetObj.SetColHidden(prefix+"sail_dys"		, 1);
	}else if("G" == tmpCondOption){ //G6/GA
		sheetObj.SetColHidden(prefix+"fm_port_cd"	, 1);
		sheetObj.SetColHidden(prefix+"to_port_cd"	, 1);
		sheetObj.SetColHidden(prefix+"st_dt"		, 0);
		sheetObj.SetColHidden(prefix+"end_dt"		, 0);
		sheetObj.SetColHidden(prefix+"sail_dys"		, 0);
	}else{ // Option : VVD		
		sheetObj.SetColHidden(prefix+"fm_port_cd"	, 1);
		sheetObj.SetColHidden(prefix+"to_port_cd"	, 1);
		sheetObj.SetColHidden(prefix+"st_dt"		, 1);
		sheetObj.SetColHidden(prefix+"end_dt"		, 1);
		sheetObj.SetColHidden(prefix+"sail_dys"		, 1);
	}	
}

function initSetSailDays(sheetObj, Row){
	if("G"==$("#sch_tp_cd").val()){
		var varStartDateTime 	=  sheetObj.GetCellValue(Row, prefix+"st_dt");
		var varEndDateTime 		=  sheetObj.GetCellValue(Row, prefix+"end_dt");
		
		var tmpSailDys = GetVoySailDays(varStartDateTime, varEndDateTime);
		sheetObj.SetCellValue(Row, prefix+"sail_dys",tmpSailDys,1);
		/*
		if(!ComIsEmpty(varStartDateTime) && !ComIsEmpty(varEndDateTime)){
			var diffDayTime = getDateTimesBetween(varStartDateTime+"00", varEndDateTime+"59"); 
			sheetObj.SetCellValue(Row, prefix+"sail_dys",diffDayTime,1);
		}*/
	}
}

function GetVoySailDays(sFrDate, sToDate) {
	var dVoyDays = 0;
	sFrDate = getArgValue(ComGetUnMaskedValue(sFrDate	, "ymdhm"));
	sToDate = getArgValue(ComGetUnMaskedValue(sToDate	, "ymdhm"));

	if(!getCheckPeriod(sFrDate, sToDate)) return;
	
	//ComJoo Function Call.
	try {
		
		dVoyDays = JooComGetDaysBetween2(sFrDate, sToDate, 3);//소수점 5자리까지.
		
	} catch(err) {ComFuncErrMsg(err.message);}
	
	return dVoyDays;
}

function getCheckPeriod(sFrDate, sToDate){
	sFrDate = getArgValue(ComGetUnMaskedValue(sFrDate	, "ymdhm"));
	sToDate = getArgValue(ComGetUnMaskedValue(sToDate	, "ymdhm"));
	/*//1.년월일시분 인지 체크
	if(!ComIsDateTime(sFrDate	, "ymd", "hm")){
		ComShowMessage(ComGetMsg('JOO00201')); //Please input Duration From exactly.
		return false;
	}
	if(!ComIsDateTime(sToDate	, "ymd", "hm")){
		ComShowMessage(ComGetMsg('JOO00202')); //Please input Duration To exactly.
		return false;
	}*/
	
	//2.from, to 날짜 비교
	var sFrYmd = sFrDate.substring(0,8);
	var sToYmd = sToDate.substring(0,8);
	if(ComChkPeriod(sFrYmd, sToYmd) < 1) {
		ComShowMessage(ComGetMsg('JOO00200')); //Please input Duration(From ~ To) exactly.
		return false;
	}
	
	return true;
}

function initSheetColMakeStlLoclAmt(sheetObj, Row){
	
	var varTeu = sheetObj.GetCellValue(Row, prefix+"bsa_qty");
	var varPrice = sheetObj.GetCellValue(Row, prefix+"bsa_slt_prc");
	var varSailDys = sheetObj.GetCellValue(Row, prefix+"sail_dys");
	var tmpStlLoclAmt = "";
	if("G"==$("#sch_tp_cd").val()){
		//G : TEU * Price * Days
		tmpStlLoclAmt = parseFloat(varTeu) * parseFloat(varPrice) * parseFloat(varSailDys);
	}else{
		//TEU * Price
		tmpStlLoclAmt = parseFloat(varTeu) * parseFloat(varPrice);
	}
	
	tmpStlLoclAmt = ComRound(tmpStlLoclAmt, 2);
	
	sheetObj.SetCellValue(Row, prefix+"stl_locl_amt", tmpStlLoclAmt, 0);
	
}

function UF_copyRow(){
	var formObj=document.form;
	var sheetObj=sheetObjects[0];
	var arrs=sheetObj.GetSelectionRows(",");
	var rows=arrs.split(",");
	for (var i=rows.length-1; i >= 0; i--){
		sheetObj.SelectCell(rows[i], 7);
		var row=sheetObj.DataCopy();

		sheetObj.SetCellValue(row, prefix+"slip_no","",0);
		sheetObj.SetCellValue(row, prefix+"stl_seq","",0);
		//sheetObj.SetCellValue(row, prefix+"stl_vvd_seq","",0);
		sheetObj.SetCellValue(row, prefix+"stl_cmb_seq","",0);
		sheetObj.SetCellValue(row, prefix+"rvs_cmb_flg","N",0);
		sheetObj.SetCellValue(row, prefix+"stl_dup_flg","N",0);
		sheetObj.SetCellValue(row, prefix+"stl_adj_flg","N",0);
		sheetObj.SetCellValue(row, prefix+"stl_lst_flg","Y",0);
		
		//수정 가능하도록
		sheetObj.SetCellEditable(row, prefix+"del_chk"     	,1);
		sheetObj.SetCellEditable(row, prefix+"fm_port_cd"	,1);
		sheetObj.SetCellEditable(row, prefix+"to_port_cd"	,1);
		sheetObj.SetCellEditable(row, prefix+"bsa_qty"		,1);
		sheetObj.SetCellEditable(row, prefix+"bsa_slt_prc"	,1);
		sheetObj.SetCellEditable(row, prefix+"st_dt"		,1);
		sheetObj.SetCellEditable(row, prefix+"end_dt"		,1);
	}
}

function UF_addRow(){
	var formObj=document.form;
	var sheetObject1=sheetObjects[0];

	var selJoCrrCd 		= JooComGetCarrierText(cmb_jo_crr_cd, 0); //jo_crr_cd
	var selTrdCd 		= JooComGetCarrierText(cmb_jo_crr_cd, 1); //trd_cd
	var selRlaneCd 		= JooComGetCarrierText(cmb_jo_crr_cd, 2); //rlane_cd
	var selLoclCurrCd 	= JooComGetCarrierText(cmb_jo_crr_cd, 5); //locl_curr_cd	
	
	var row=sheetObject1.DataInsert(-1);
	var reDivrCd=JooGetRadioValue(formObj.re_divr_cd);
	sheetObject1.SetCellValue(row, prefix+"acct_yrmon"   ,ComReplaceStr(formObj.acct_yrmon.value,"-",""),0);
	sheetObject1.SetCellValue(row, prefix+"trd_cd"       ,selTrdCd,0);
	sheetObject1.SetCellValue(row, prefix+"jo_crr_cd"    ,selJoCrrCd,0);
	sheetObject1.SetCellValue(row, prefix+"rlane_cd"     ,selRlaneCd,0);
	sheetObject1.SetCellValue(row, prefix+"re_divr_cd"   ,reDivrCd,0);
	sheetObject1.SetCellValue(row, prefix+"jo_stl_itm_cd",formObj.jo_stl_itm_cd.value,0);
	sheetObject1.SetCellValue(row, prefix+"jo_mnu_nm"    ,formObj.jo_mnu_nm.value,0);
	sheetObject1.SetCellValue(row, prefix+"skd_dir_cd"   ,"",0);
	sheetObject1.SetCellValue(row, prefix+"rev_dir_cd"   ,"",0);
	sheetObject1.SetCellValue(row, prefix+"locl_curr_cd" ,selLoclCurrCd,0);
	sheetObject1.SetCellValue(row, prefix+"stl_adj_flg"  ,"N",0);
	sheetObject1.SetCellValue(row, prefix+"stl_lst_flg"  ,"Y",0);
	sheetObject1.SetCellValue(row, prefix+"rvs_cmb_flg"  ,"N",0);
	sheetObject1.SetCellValue(row, prefix+"jo_stl_jb_cd" ,"101",0);//BSA Type : Joint Operation
	//sheetObject1.InitDataProperty(0, 10, dtAutoSum,  80, daRight ,  true, prefix+"stl_locl_amt"   ,false, "|sheet1_bsa_qty|*|sheet1_bsa_slt_prc|", dfNullFloat  ,2, true, true);				
	sheetObject1.SelectCell(row, prefix+"vsl_cd", true);
	
	return row;
}

function UF_reset(){
	var formObj = document.form;
	ComResetAll();
	sheetObjects[0].RemoveAll();

	cmb_jo_crr_cd.SetSelectIndex(-1,0);
	sch_tp_cd.SetSelectIndex(0, 0);
	formObj.re_divr_cd[0].checked=true;
	
	formObj.acct_yrmon.focus();
}

function resizeSheet(){
    ComResizeSheet(sheetObjects[0]);
}
