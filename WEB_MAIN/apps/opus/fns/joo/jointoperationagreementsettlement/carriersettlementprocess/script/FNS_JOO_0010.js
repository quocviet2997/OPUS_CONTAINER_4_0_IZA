/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : FNS_JOO_0010.js
*@FileTitle  : Over Used Slot Hire for TDR
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/26
=========================================================*/
//공통전역변수
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
var gCurRow=0;
var gVVD="";
var gChange=true;
var prefix="sheet1_";
//버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick=processButtonClick;
//버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
function processButtonClick() {
	/***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
	var sheetObject1=sheetObjects[0];
	/*******************************************************/
	var formObj=document.form;
	try {
		var srcName=ComGetEvent("name");
		if(ComGetBtnDisable(srcName)) return false;
		if (srcName == null || srcName == "re_divr_cd") {
			return;
		}
		//class 가 btn1_1 이면 return한다.
		if (!JooBtnClickEnable(srcName)) {
			aler("Joo click");
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
				
				var row=sheetObject1.DataInsert(-1);
				var reDivrCd=JooGetRadioValue(formObj.re_divr_cd);
					sheetObjects[0].SetCellValue(row, prefix+"acct_yrmon"   ,ComReplaceStr(formObj.acct_yrmon.value,"-",""),0);
					sheetObjects[0].SetCellValue(row, prefix+"trd_cd"       ,selTrdCd,0);
					sheetObjects[0].SetCellValue(row, prefix+"jo_crr_cd"    ,selJoCrrCd,0);
					sheetObjects[0].SetCellValue(row, prefix+"rlane_cd"     ,selRlaneCd,0);
					sheetObjects[0].SetCellValue(row, prefix+"re_divr_cd"   ,reDivrCd,0);
					sheetObjects[0].SetCellValue(row, prefix+"jo_stl_itm_cd",formObj.jo_stl_itm_cd.value,0);
					sheetObjects[0].SetCellValue(row, prefix+"jo_mnu_nm"    ,formObj.jo_mnu_nm.value,0);
					sheetObjects[0].SetCellValue(row, prefix+"skd_dir_cd"   ,"",0);
					sheetObjects[0].SetCellValue(row, prefix+"rev_dir_cd"   ,"",0);
					sheetObjects[0].SetCellValue(row, prefix+"locl_curr_cd" ,selLoclCurrCd,0);
					sheetObjects[0].SetCellValue(row, prefix+"stl_adj_flg"  ,"N",0);//보정여부 N
					sheetObjects[0].SetCellValue(row, prefix+"stl_lst_flg"  ,"Y",0);//최종여부 Y
					sheetObjects[0].SelectCell(row, prefix+"vsl_cd", true);
				break;
			case "btn_delete":
				JooRowHideDelete(sheetObject1, prefix+"del_chk");
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
					var downCols = "";
					downCols += "sheet1_vsl_cd|sheet1_skd_voy_no|sheet1_skd_dir_cd|sheet1_rev_dir_cd|sheet1_fm_port_cd|";
					downCols += "sheet1_to_port_cd|sheet1_fnl_own_bsa_qty|sheet1_fnl_bsa_wgt|sheet1_usd_slt_bsa_qty|sheet1_usd_slt_wgt|";
					downCols += "sheet1_over_usd_qty|sheet1_over_usd_wgt|sheet1_bsa_per_wgt|sheet1_bsa_qty|sheet1_bsa_slt_prc|";
					downCols += "sheet1_locl_curr_cd|sheet1_stl_locl_amt|sheet1_stl_cmb_seq|sheet1_rvs_cmb_flg|sheet1_stl_bzc_port_cd|sheet1_eta_dt";
					sheetObject1.Down2Excel({ HiddenColumn:1,Merge:1, DownCols:downCols});
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
* IBSheet Object를 배열로 등록
* 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
* 배열은 소스 상단에 정의
*/
function setSheetObject(sheet_obj) {
	sheetObjects[sheetCnt++]=sheet_obj;
}
/** 
* IBCombo Object를 배열로 등록
* param : combo_obj ==> 콤보오브젝트
* 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
* 배열은 소스 상단에 정의
*/ 
function setComboObject(combo_obj) {  
 comboObjects[comboCnt++]=combo_obj;  
}
/**
* Sheet 기본 설정 및 초기화
* body 태그의 onLoad 이벤트핸들러 구현
* 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
*/
function loadPage() {
	for (i=0; i < sheetObjects.length; i++) {
		// khlee-시작 환경 설정 함수 이름 변경
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1);
		// khlee-마지막 환경 설정 함수 추가
		ComEndConfigSheet(sheetObjects[i]);
	}
	for ( var k=0; k < comboObjects.length; k++) {
		initCombo(comboObjects[k], k + 1);
	}
	initControl();
}
/**
* 페이지에 있는 HTML Control의 이벤트를 동적으로 로드한다. <br>
* {@link #loadPage}함수에서 이 함수를 호출하여 IBSheet Object를 초기화 한다. <br>
* @param {ibsheet} sheetObj    IBSheet Object
* @param {int}     sheetNo     sheetObjects 배열에서 순번
**/
function initControl() {
	//** Date 구분자 **/
	DATE_SEPARATOR="-";
	var formObj=document.form;
    //Axon 이벤트 처리1. 이벤트catch
	axon_event.addListenerFormat('blur', 'obj_blur'    , formObj); 	//- form 전체 컨트롤 모든 컨트롤의 OnBeforeDeactivate(blur)이벤트에 코드 처리
	axon_event.addListenerFormat('focus'  , 'obj_focus'   , formObj);            //- form 전체 컨트롤 중 dataformat 속성이 있는 모든 컨트롤의 OnBeforeActivate이벤트에 코드 처리
    axon_event.addListener('click', 'change_event_radio', 're_divr_cd');

	//[2015.09.18] New Carrier jo_crr_cd/trd_cd/rlane_cd 조회.
	doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC20);
	
    formObj.acct_yrmon.focus();
}
// Axon 이벤트 처리2. 이벤트처리함수
function obj_blur() {
	ComChkObjValid(ComGetEvent());
	var src=ComGetEvent("name")
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
* 시트 초기설정값, 헤더 정의
* param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
* 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
*/
function initSheet(sheetObj, sheetNo) {
	var cnt=0;
	switch (sheetNo) {
	case 1: //t1sheet1 init
        with(sheetObj){
			var HeadTitle="STS||VSL|VOY|Dir|Fin.\nDir|Dep. Port|Dep. Port|Final BSA|Final BSA|Used Slot|Used Slot";
				HeadTitle += "|Over Used Slot|Over Used Slot|BSA\nWeight\nPer TEU|Confirm\nOver\nUsed|Over Used\nSlot Price|CUR.|Amount|Combined\nNo|RVS|Basic Port|Schedule|Unit Cost\nBasic Port|acct_yrmon|stl_vvd_seq|stl_seq|trd_cd|jo_crr_cd|rlane_cd|re_divr_cd|jo_stl_itm_cd|jo_mnu_nm|slip_no|uc_bss_port_etd_dt|stl_adj_flg|stl_lst_flg|Dup.";
			var HeadTitle1="STS||VSL|VOY|Dir|Fin.\nDir|Fm|To|TEU|WGT|TEU|WGT";
				HeadTitle1 += "|TEU|WGT|BSA\nWeight\nPer TEU|Confirm\nOver\nUsed|Over Used\nSlot Price|CUR.|Amount|Combined\nNo|RVS|Basic Port|Schedule|Unit Cost\nBasic Port|acct_yrmon|stl_vvd_seq|stl_seq|trd_cd|jo_crr_cd|rlane_cd|re_divr_cd|jo_stl_itm_cd|jo_mnu_nm|slip_no|uc_bss_port_etd_dt|stl_adj_flg|stl_lst_flg|Dup.";
			var headCount=ComCountHeadTitle(HeadTitle);
			(headCount, 8, 0, true);
			InitComboNoMatchText(true); //COMBO에서 match된 data가 없어도 보여짐
			SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
			var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
			var headers = [ { Text:HeadTitle, Align:"Center"}, { Text:HeadTitle1, Align:"Center"} ];
			InitHeaders(headers, info);
			var cols = [ 	{Type:"Status",    Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"ibflag" },
							{Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"del_chk" },
							{Type:"Text",      Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:4 },
							{Type:"Text",      Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"skd_voy_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:4 },
							{Type:"Combo",     Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"skd_dir_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:1 },
							{Type:"Text",      Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"rev_dir_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:1 },
							{Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:prefix+"fm_port_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
							{Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:prefix+"to_port_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
							{Type:"Int",       Hidden:0, Width:50,   Align:"Right",   ColMerge:1,   SaveName:prefix+"fnl_own_bsa_qty",    KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
							{Type:"Float",     Hidden:0, Width:70,   Align:"Right",   ColMerge:1,   SaveName:prefix+"fnl_bsa_wgt",        KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
							{Type:"Int",       Hidden:0, Width:50,   Align:"Right",   ColMerge:1,   SaveName:prefix+"usd_slt_bsa_qty",    KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
							{Type:"Float",     Hidden:0, Width:70,   Align:"Right",   ColMerge:1,   SaveName:prefix+"usd_slt_wgt",        KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
							{Type:"Int",       Hidden:0, Width:40,   Align:"Right",   ColMerge:1,   SaveName:prefix+"over_usd_qty",       KeyField:0,   CalcLogic:"|sheet1_usd_slt_bsa_qty|-|sheet1_fnl_own_bsa_qty|",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Float",     Hidden:0, Width:80,   Align:"Right",   ColMerge:1,   SaveName:prefix+"over_usd_wgt",       KeyField:0,   CalcLogic:"|sheet1_usd_slt_wgt|-|sheet1_fnl_bsa_wgt|",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Float",     Hidden:0, Width:60,   Align:"Right",   ColMerge:1,   SaveName:prefix+"bsa_per_wgt",        KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:1 },
							{Type:"Int",       Hidden:0, Width:60,   Align:"Right",   ColMerge:1,   SaveName:prefix+"bsa_qty",            KeyField:0,   CalcLogic:"setBsaQty(|sheet1_over_usd_qty|,|sheet1_over_usd_wgt|,|sheet1_bsa_per_wgt|)",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Float",     Hidden:0, Width:70,   Align:"Right",   ColMerge:1,   SaveName:prefix+"bsa_slt_prc",        KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
							{Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix+"locl_curr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"AutoSum",   Hidden:0, Width:80,   Align:"Right",   ColMerge:1,   SaveName:prefix+"stl_locl_amt",       KeyField:0,   CalcLogic:"setStlLoclAmt(|sheet1_bsa_qty|,|sheet1_bsa_slt_prc|)",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix+"stl_cmb_seq",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"rvs_cmb_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:prefix+"stl_bzc_port_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:0, Width:110,  Align:"Center",  ColMerge:1,   SaveName:prefix+"eta_dt",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:70,   Align:"Center",  ColMerge:1,   SaveName:prefix+"uc_bss_port_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"acct_yrmon",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_vvd_seq",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_seq",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"trd_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_crr_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"rlane_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"re_divr_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_stl_itm_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_mnu_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"slip_no",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"uc_bss_port_etd_dt", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_adj_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_lst_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
							{Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:1,   SaveName:prefix+"stl_dup_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
			
			InitColumns(cols);
			SetEditable(1);
//			SetSheetHeight(500);
			resizeSheet();
			SetColProperty(prefix+"skd_dir_cd", {ComboText:"E|W|S|N", ComboCode:"E|W|S|N"} );
			SetColProperty(prefix+"eta_dt", {Format:"####-##-## ##:##:##"} );
			SetHeaderRowHeight(25);
		    SetColProperty(0 ,prefix+"vsl_cd", {AcceptKeys:"E|N" , InputCaseSensitive:1});
		    SetColProperty(0 ,prefix+"fm_port_cd", {AcceptKeys:"E|N" , InputCaseSensitive:1});
		    SetColProperty(0 ,prefix+"to_port_cd", {AcceptKeys:"E|N" , InputCaseSensitive:1});
		}
		break;
	}
}
//Sheet관련 프로세스 처리
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	if (!validateForm(sheetObj, formObj, sAction))
		return;
	switch (sAction) {
		case IBSEARCH: //조회
			formObj.f_cmd.value=SEARCH;
			sheetObj.DoSearch("FNS_JOO_0010GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix) );
			break;
		//CREATE
		case IBCREATE:
			formObj.f_cmd.value=SEARCH01;
			var sXml=sheetObj.GetSearchData("FNS_JOO_0010GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			if (ComGetEtcData(sXml,"TRANS_RESULT_KEY") == "S"){
				if (sheetObj.RowCount("I") == 0){
					ComShowCodeMessage('JOO00054');
				}
			}
			break;
		case IBSAVE: //저장
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
			var sXml=sheetObj.GetSaveData("FNS_JOO_0010GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			ComOpenWait(false);
			sheetObj.LoadSearchData(sXml,{Sync:1} );
//			var dupRows = "";
//			for(var i=sheetObj.HeaderRows; i<=(sheetObj.LastRow() -1); i++){
//				if (sheetObj.CellValue(i,prefix+"stl_dup_flg") == "Y"){
//					dupRows = dupRows + i +"|";
//				}
//			}
//			
//			if (dupRows.length > 0)
//				dupRows = dupRows.substring(0, dupRows.length-1);
			var RTNVAL=ComGetEtcData(sXml, "RTNVAL");
			if (RTNVAL == "E"){
				if (ComShowCodeConfirm('JOO00132', dupRows)){
//					doActionIBSheet(sheetObj, document.form, IBINSERT);					
				}
			}else{
				if (ComGetEtcData(sXml,"TRANS_RESULT_KEY") == "S"){
					doActionIBSheet(sheetObj, document.form, IBSEARCH);
				}
			}
			break;
		//묻지마 저장 
//		case IBINSERT: //중복체크하지 않는 저장
//			var SaveStr = ComGetSaveString(sheetObjects[0]);
//			
//			formObj.f_cmd.value = MULTI01;
//			sheetObj.WaitImageVisible=false;
//			ComOpenWait(true);
//			sheetObj.DoSave("FNS_JOO_0010GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix), -1, false);
//			ComOpenWait(false);
//			break;
		case IBDELETE:
			if (!ComShowCodeConfirm("JOO00061")){
				return;
			}
			formObj.f_cmd.value=REMOVE01;
			sheetObj.SetWaitImageVisible(0);
			ComOpenWait(true);
			sheetObj.DoSearch("FNS_JOO_0010GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix) );
			ComOpenWait(false);
			break;
		//VVD변경 9자리
		case IBROWSEARCH:
			formObj.f_cmd.value=SEARCHLIST;
			formObj.cur_row.value=(gCurRow - sheetObj.HeaderRows());
			var SaveStr=ComGetSaveString(sheetObj,true,true,-1);
			var sXml=sheetObj.GetSaveData("FNS_JOO_0010GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
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
		//VVD변경
		case IBSEARCH_ASYNC01:
			formObj.f_cmd.value=SEARCHLIST01;
			formObj.cur_row.value=gCurRow-sheetObj.HeaderRows();
			formObj.super_cd1.value=JooComGetCarrierText(cmb_jo_crr_cd, 2); //rlane_cd
			formObj.super_cd2.value=gVVD;
			var SaveStr=ComGetSaveString(sheetObj,true,true,-1);
			var sXml=sheetObj.GetSaveData("FNS_JOO_0010GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			var CHECKVVD=ComGetEtcData(sXml,"CHECKVVD");
			if (CHECKVVD=="N"){
				sheetObj.SetCellValue(gCurRow, prefix+"stl_vvd_seq"       ,ComGetEtcData(sXml,"stl_vvd_seq"),0);
				sheetObj.SetCellValue(gCurRow, prefix+"stl_bzc_port_cd"   ,ComGetEtcData(sXml,"stl_bzc_port_cd"),0);
				sheetObj.SetCellValue(gCurRow, prefix+"eta_dt"            ,ComGetEtcData(sXml,"eta_dt"),0);
				sheetObj.SetCellValue(gCurRow, prefix+"locl_curr_cd"      ,ComGetEtcData(sXml,"locl_curr_cd"),0);
				//sheetObj.SetCellValue(gCurRow, prefix+"uc_bss_port_cd",ComGetEtcData(sXml,"uc_bss_port_cd"),0);
				//UI개선(201409 민정호 ) - 아래 주석 제거
				sheetObj.SetCellValue(gCurRow, prefix+"uc_bss_port_etd_dt",ComGetEtcData(sXml,"uc_bss_port_etd_dt"),0);
								
				//2010.03.25 query수정으로 fm port변경시로 수정한다.
//				sheetObj.SetCellValue(gCurRow, prefix+"fnl_own_bsa_qty",ComGetEtcData(sXml,"fnl_own_bsa_qty"),0);
//				sheetObj.SetCellValue(gCurRow, prefix+"fnl_bsa_wgt",ComGetEtcData(sXml,"fnl_bsa_wgt"),0);
				sheetObj.SetCellValue(gCurRow, prefix+"bsa_per_wgt",ComGetEtcData(sXml,"bsa_per_wgt"),0);
				sheetObj.SelectCell(gCurRow, prefix+"usd_slt_bsa_qty", true);
			}else{
				if (CHECKVVD=="E"){
					ComShowCodeMessage("JOO00141");
				}else if (CHECKVVD=="T"){
					ComShowCodeMessage("JOO00142");
				}
				sheetObj.SetCellValue(gCurRow, prefix+"stl_vvd_seq"    ,"",0);
				sheetObj.SetCellValue(gCurRow, prefix+"stl_bzc_port_cd","",0);
				sheetObj.SetCellValue(gCurRow, prefix+"eta_dt"         ,"",0);
				sheetObj.SetCellValue(gCurRow, prefix+"locl_curr_cd"   ,"",0);
				sheetObj.SetCellValue(gCurRow, prefix+"vsl_cd"         ,"",0);
				sheetObj.SetCellValue(gCurRow, prefix+"skd_voy_no"     ,"",0);
				sheetObj.SetCellValue(gCurRow, prefix+"skd_dir_cd"     ,"",0);
				sheetObj.SetCellValue(gCurRow, prefix+"rev_dir_cd"     ,"",0);
//				sheetObj.CellValue2(gCurRow, prefix+"fnl_own_bsa_qty") = "";
//				sheetObj.CellValue2(gCurRow, prefix+"fns_bsa_wgt"    ) = "";
				sheetObj.SetCellValue(gCurRow, prefix+"bsa_per_wgt"    ,"",0);
				sheetObj.SelectCell(gCurRow, prefix+"vsl_cd", true);
			}
			var portList=ComGetEtcData(sXml,"portList");
	        sheetObj.SetCellEditable(gCurRow, prefix+"fm_port_cd",1);
	        sheetObj.SetCellEditable(gCurRow, prefix+"to_port_cd",1);
	        sheetObj.InitCellProperty(gCurRow, 6,{ Type:"Combo",Align:"Center",Format:"dfNone"} );
	        sheetObj.InitCellProperty(gCurRow, 7,{ Type:"Combo",Align:"Center",Format:"dfNone"} );
	        //Change event를 타지 못하게 하기 위함...
	        gChange=false;
	        sheetObj.CellComboItem(gCurRow,prefix+"fm_port_cd", {ComboText:portList, ComboCode:portList} );
	        sheetObj.CellComboItem(gCurRow,prefix+"to_port_cd", {ComboText:portList, ComboCode:portList} );
	        gChange=true;
	        sheetObj.SetCellValue(gCurRow, prefix+"fm_port_cd","",0);
	        sheetObj.SetCellValue(gCurRow, prefix+"to_port_cd","",0);
	        //sheetObj.SelectCell(gCurRow, prefix+"uc_bss_port_cd",true);
			break;
		//From Port입력시 Used Slot 정보 조회 
		case IBSEARCH_ASYNC02: 
			formObj.f_cmd.value=SEARCHLIST02;
			formObj.cur_row.value=gCurRow-sheetObj.HeaderRows();
			var SaveStr=ComGetSaveString(sheetObj,true,true,-1);
			var sXml=sheetObj.GetSaveData("FNS_JOO_0010GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			var CHECKVVD=ComGetEtcData(sXml,"CHECKVVD");
			if (CHECKVVD=="N"){
				sheetObj.SetCellValue(gCurRow, prefix+"usd_slt_bsa_qty",ComGetEtcData(sXml,"usd_slt_bsa_qty"),0);
				sheetObj.SetCellValue(gCurRow, prefix+"usd_slt_wgt"    ,ComGetEtcData(sXml,"usd_slt_wgt"),0);
				//2010.03.25 query 수정으로 fm port 변경시에 가져오는 것으로 수정됨
				sheetObj.SetCellValue(gCurRow, prefix+"fnl_own_bsa_qty",ComGetEtcData(sXml,"fnl_own_bsa_qty"),0);
				sheetObj.SetCellValue(gCurRow, prefix+"fnl_bsa_wgt"    ,ComGetEtcData(sXml,"fnl_bsa_wgt"),0);
		        sheetObj.SelectCell(gCurRow, prefix+"over_usd_qty",true);
			}else{
				if (CHECKVVD=="E"){
					ComShowCodeMessage("JOO00143");
					sheetObj.SetCellValue(gCurRow, prefix+"fm_port_cd","",0);
					return;
				}else if (CHECKVVD=="T"){
					ComShowCodeMessage("JOO00144");
					sheetObj.SetCellValue(gCurRow, prefix+"fm_port_cd","",0);
					return;
				}
			}
			break;
		//To Port 입력시 bsa_slt_prc 조회
		case IBSEARCH_ASYNC03: 
			formObj.f_cmd.value=SEARCHLIST03;
			formObj.cur_row.value=gCurRow-sheetObj.HeaderRows();
			var SaveStr=ComGetSaveString(sheetObj,true,true,-1);
			var sXml=sheetObj.GetSaveData("FNS_JOO_0010GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			var CHECKVVD=ComGetEtcData(sXml,"CHECKVVD");
			if (CHECKVVD=="N"){
				sheetObj.SetCellValue(gCurRow, prefix+"bsa_slt_prc"    ,ComGetEtcData(sXml,"bsa_slt_prc"),0);
		        sheetObj.SelectCell(gCurRow, prefix+"over_usd_qty",true);
			}else{
				if (CHECKVVD=="E"){
					ComShowCodeMessage("JOO00143");
					sheetObj.SetCellValue(gCurRow, prefix+"to_port_cd","",0);
					return;
				}else if (CHECKVVD=="T"){
					ComShowCodeMessage("JOO00144");
					sheetObj.SetCellValue(gCurRow, prefix+"to_port_cd","",0);
					return;
				}
			}
			break;
		case IBSEARCH_ASYNC10: //마감여부 조회
			formObj.f_cmd.value=SEARCH10;
			var sXml=sheetObj.GetSearchData("FNS_JOO_0007GS.do", FormQueryString(formObj));
			if (ComGetEtcData(sXml,"TRANS_RESULT_KEY") == "S"){
				gClzYn=ComGetEtcData(sXml,"clz_yn"); 
				if (gClzYn == "C"){
					//ComShowCodeMessage("JOO00177");
					JooSetBtnClass("C", false);
					sheetObjects[0].SetEditable(0);
				//Open상태면 Authority에 따라 Button을 활성화, 비활성화 한다.
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
			ComXml2ComboItem(sXml, cmb_jo_crr_cd, "grp_key", "jo_crr_cd|trd_cd|rlane_cd|jo_stl_opt_cd|jo_crr_auth_cd|locl_curr_cd|jo_stl_tgt_tp_cd");
			return "S";
			break;
	}
}

/**
* Combo 기본 설정 
* param : comboObj ==> 콤보오브젝트, comboNo ==> 콤보오브젝트 태그의 아이디에 붙인 일련번호
* 콤보가 다수일 경우 콤보 수만큼 case를 추가하여 시트 초기화모듈을 구성한다 
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

function cmb_jo_crr_cd_OnBlur(comboObj){
	var selRlaneCd 		= JooComGetCarrierText(comboObj, 2); //rlane_cd
	if (selRlaneCd.length == 5){
		doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
	}
}

function UF_setAuth(auth){
	//마감되었다면 이미 버튼제어가 된 상태고 권한에 상관없이 disable
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
* 화면 폼입력값에 대한 유효성검증 프로세스 처리
*/
function validateForm(sheetObj, formObj, sAction) {
	var selLoclCurrCd 	= JooComGetCarrierText(cmb_jo_crr_cd, 5); //locl_curr_cd
	switch (sAction) {
		case IBCREATE: //저장용 조회
			if (formObj.acct_yrmon.value.length == 0){
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
			if (selLoclCurrCd.length!=3){
				ComShowCodeMessage('JOO00082');
				return false;
			}
			break;
		case IBSEARCH: //조회
			if (formObj.acct_yrmon.value.length == 0){
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
			break;
		case IBSAVE:   //저장
			var cnt=0;

			for (var inx=sheetObj.HeaderRows(); inx < sheetObj.LastRow(); inx++){
				var status=sheetObj.GetRowStatus(inx);
				if (status == "R")
					continue;
				cnt++;
				var slip=sheetObj.GetCellValue(inx, prefix+"stl_cmb_seq");
				if (status == "D" &&  slip != ""){
					ComShowCodeMessage('JOO00057',(inx-sheetObj.HeaderRows()+1), slip);
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
				if (sheetObj.GetCellValue(inx, prefix+"stl_locl_amt").length == 0){
					ComShowCodeMessage('JOO00056',inx);
					sheetObj.SelectCell(inx, prefix+"stl_locl_amt", true);
					return false;
				}
				var fstBsaQty=sheetObj.GetCellValue(inx, prefix+"fnl_own_bsa_qty");
				if (fstBsaQty == "" || Number(fstBsaQty) == 0){
					ComShowCodeMessage('JOO00058',inx, "Final BSA + Swap TEU");
					sheetObj.SelectCell(inx, prefix+"fnl_own_bsa_qty", false);
					return false;
				}
				var fstBsaWgt=sheetObj.GetCellValue(inx, prefix+"fnl_bsa_wgt");
				if (fstBsaWgt == "" || Number(fstBsaWgt)==0){
					ComShowCodeMessage('JOO00058',inx, "Final BSA + Swap WGT");
					sheetObj.SelectCell(inx, prefix+"fnl_bsa_wgt", false);
					return false;
				}
				var bsaPerWgt=sheetObj.GetCellValue(inx, prefix+"bsa_per_wgt");
				if (bsaPerWgt == "" || Number(bsaPerWgt)==0){
					ComShowCodeMessage('JOO00058',inx, "Final BSA Weight Per TEU");
					sheetObj.SelectCell(inx, prefix+"bsa_per_wgt", false);
					return false;
				}
				var bsaSltPrc=sheetObj.GetCellValue(inx, prefix+"bsa_slt_prc");
				if (bsaSltPrc == "" || Number(bsaSltPrc)==0){
					ComShowCodeMessage('JOO00058',inx, "Final BSA Over Used Slot Price");
					sheetObj.SelectCell(inx, prefix+"bsa_slt_prc", false);
					return false;
				}
				//2010.01.05 AMOUNT가 0이면 저장못하도록 수정
				//Adjustment의 0값을 Combined시키기 위함
				if (sheetObj.GetCellValue(inx, prefix+"stl_locl_amt").length == 0
						||  sheetObj.GetCellValue(inx, prefix+"stl_locl_amt") == "0"){
					ComShowCodeMessage('JOO00056',inx);
					sheetObj.SelectCell(inx, prefix+"stl_locl_amt", true);
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
		case IBDELETE: //전체삭제
			var isCombined=false;
			var stlCmbSeq="";
			//전체 Data삭제시 하나라도 Combined된 data가 있으면 삭제불가
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
//	sheetObj.SetMergeCell(0,prefix+"vsl_cd","TOTAL");//TOTAL이라는 글자가 잘리지 않게 넓은데로 옮김
	sheet1.SetMergeCell(sheet1.LastRow(),0,1,3)
	sheetObj.SetSumText(0,0,"TOTAL");//TOTAL이라는 글자가 잘리지 않게 넓은데로 옮김
	//combined data는 삭제 checkbox를 막는다.
	for (var i=sheetObj.HeaderRows(); i < sheetObj.LastRow(); i++){
		var ibflag=sheetObj.GetRowStatus(i);
		var stlCmbSeq=sheetObj.GetCellValue(i, prefix+"stl_cmb_seq");
		if (ibflag == "R"){
			if (ComTrim(stlCmbSeq) == ""){
				sheetObj.SetCellEditable(i, prefix+"del_chk"        ,1);
				sheetObj.SetCellEditable(i, prefix+"usd_slt_bsa_qty",1);
				sheetObj.SetCellEditable(i, prefix+"usd_slt_wgt"    ,1);
				sheetObj.SetCellEditable(i, prefix+"fm_port_cd"    	,1);
				sheetObj.SetCellEditable(i, prefix+"to_port_cd"    	,1);
				sheetObj.SetCellEditable(i, prefix+"fnl_own_bsa_qty",1);
				sheetObj.SetCellEditable(i, prefix+"fnl_bsa_wgt"    ,1);
				sheetObj.SetCellEditable(i, prefix+"bsa_slt_prc"    ,1);
			}else{
				sheetObj.SetCellEditable(i, prefix+"del_chk"        ,0);
				sheetObj.SetCellEditable(i, prefix+"usd_slt_bsa_qty",0);
				sheetObj.SetCellEditable(i, prefix+"usd_slt_wgt"    ,0);
				sheetObj.SetCellEditable(i, prefix+"fm_port_cd"    	,0);
				sheetObj.SetCellEditable(i, prefix+"to_port_cd"    	,0);
				sheetObj.SetCellEditable(i, prefix+"fnl_own_bsa_qty",0);
				sheetObj.SetCellEditable(i, prefix+"fnl_bsa_wgt"    ,0);
				sheetObj.SetCellEditable(i, prefix+"bsa_slt_prc"    ,0);
			}
		}
	}	
}
function sheet1_OnKeyUp(sheetObj, Row, Col, KeyCode, Shift){
	var sName=sheetObj.ColSaveName(Col);
	var Value=sheetObj.GetEditText();
	//4자리 치면 NEXT로 이동
	if ((sName == (prefix+"vsl_cd")) && (Value.length == 4)){
		sheetObj.SelectCell(Row, prefix+"skd_voy_no",true);
	}
	//4자리 치면 NEXT로 이동
	if ((sName == (prefix+"skd_voy_no")) && (Value.length == 4)){
		sheetObj.SelectCell(Row, prefix+"skd_dir_cd",true);
	}
}
/**
 * 
 * @param sheetObj
 * @param Row
 * @param Col
 * @param Value
 * @param CellX
 * @param CellY
 * @param CellW
 * @param CellH
 * @return
 */
function sheet1_OnClick(sheetObj, Row, Col, Value, CellX, CellY, CellW, CellH) {
	var sName=sheetObj.ColSaveName(Col);
	var formObj=document.form;
	gCurRow=Row;
	var tmp=sheetObj.GetComboInfo(Row, prefix+"rev_dir_cd", "Code");
	
	if (sName == prefix+"rev_dir_cd" && tmp.length <= 1 && Value == "" && sheetObj.GetRowStatus(Row) == "I"){
	var vvd=sheetObj.GetCellValue(Row, prefix+"vsl_cd");
		vvd += sheetObj.GetCellValue(Row, prefix+"skd_voy_no");
		vvd += sheetObj.GetCellValue(Row, prefix+"skd_dir_cd");
		if (vvd.length == 9){
			doActionIBSheet(sheetObj, formObj, IBROWSEARCH);
		}
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
	var vvd=vsl + voy + dir + rev;
	if (sName == prefix+"vsl_cd" || sName==prefix+"skd_voy_no" || sName==prefix+"skd_dir_cd" || sName==prefix+"rev_dir_cd"){
		var tmp=sheetObj.GetComboInfo(Row, prefix+"rev_dir_cd", "Code");
		if ( sName!=prefix+"rev_dir_cd" || tmp.length <= 1 && Value == "" && sheetObj.GetRowStatus(Row) == "I"){
			if ((vsl+voy+dir).length == 9){
				doActionIBSheet(sheetObj, formObj, IBROWSEARCH);
			}
		}
		if (vvd.length == 10){
			gVVD=vvd;
			doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC01);
		}
	}
	//From Port변경시 Slot Price를 조회한다.
	if (sName == prefix+"fm_port_cd" && gChange){
		if (vvd.length != 10){
			ComShowCodeMessage("JOO00039");
			sheetObj.SetCellValue(Row, Col,"",0);
			return;
		}
		//to port에도 change event가 걸려 있으므로...to port를 clear시킨다.
		sheetObj.SetCellValue(Row, prefix+"to_port_cd","",0);
		var fmPortCd=sheetObj.GetCellValue(Row, prefix+"fm_port_cd");
		if (fmPortCd.length == 5){
			doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC02);
		}
	}
	//To Port변경시 TEU, WGT를 조회한다.
	if (sName == prefix+"to_port_cd" && gChange){
		var fmPortCd=sheetObj.GetCellValue(Row, prefix+"fm_port_cd");
		var toPortCd=sheetObj.GetCellValue(Row, prefix+"to_port_cd");
		if (toPortCd.length < 5) 
			return;
		if (vvd.length != 10){
			ComShowCodeMessage("JOO00039");
			sheetObj.SetCellValue(Row, Col,"",0);
			return;
		}
		if (fmPortCd.length < 5){
			ComShowCodeMessage("JOO00159");
			sheetObj.SetCellValue(Row, Col,"",0);
			return;
		}
		if (fmPortCd == toPortCd){
			ComShowCodeMessage("JOO00080");
			sheetObj.SetCellValue(Row, prefix+"to_port_cd","",0);
			sheetObj.SelectCell(Row, prefix+"to_port_cd",true);
			return;
		}
		doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC03);
	}
	if (sName == prefix+"usd_slt_bsa_qty" || sName == prefix+"usd_slt_wgt"){
		if (vvd.length != 10){
			ComShowCodeMessage("JOO00039");
			sheetObj.SetCellValue(Row, Col,"",0);
			return;
		}
		var fmPortCd=sheetObj.GetCellValue(Row, prefix+"fm_port_cd");
		var toPortCd=sheetObj.GetCellValue(Row, prefix+"to_port_cd");
		var usdQty=sheetObj.GetCellValue(Row, prefix+"usd_slt_bsa_qty");
		var usdWgt=sheetObj.GetCellValue(Row, prefix+"usd_slt_wgt");
		var amt=sheetObj.GetCellValue(Row, prefix+"stl_locl_amt");
		if (sName == prefix+"usd_slt_bsa_qty"){
			usdQty=Value;
		}else if (sName == prefix+"usd_slt_wgt"){
			usdWgt=Value;
		}
		if (existsSamePair(sheetObj, Row, vsl, voy, dir, rev, fmPortCd, toPortCd, usdQty, usdWgt, amt)){
			//계속하겠냐? 했을 때 아니면 삭제?
			if (!ComShowCodeConfirm("JOO00157")){
				sheetObj.SetCellValue(Row, prefix+"usd_slt_bsa_qty","",0);
				sheetObj.SetCellValue(Row, prefix+"usd_slt_wgt" ,"",0);
				sheetObj.SetCellValue(Row, prefix+"stl_locl_amt","",0);
			}else{
				sheetObj.SetCellValue(Row, prefix+"stl_dup_flg" ,"Y",0);
			}
		}
	}
}
/**
 * 
 * @param sheetObj
 * @param Row
 * @param vsl
 * @param voy
 * @param dir
 * @param fin
 * @param fmPort
 * @param toPort
 * @param usdQty
 * @param usdWgt
 * @param amt
 * @return
 */
function existsSamePair(sheetObj, Row, vsl, voy, dir, fin, fmPort, toPort, usdQty, usdWgt, amt){
	var rtnVal=false;
	for(var inx=sheetObj.HeaderRows(); inx < sheetObj.LastRow(); inx++){
		if (inx==Row) continue;
			lvsl=sheetObj.GetCellValue(inx, prefix+"vsl_cd");
			lvoy=sheetObj.GetCellValue(inx, prefix+"skd_voy_no");
			ldir=sheetObj.GetCellValue(inx, prefix+"skd_dir_cd");
			lfin=sheetObj.GetCellValue(inx, prefix+"rev_dir_cd");
			lfmPort=sheetObj.GetCellValue(inx, prefix+"fm_port_cd");
			ltoPort=sheetObj.GetCellValue(inx, prefix+"to_port_cd");
			lusdQty=sheetObj.GetCellValue(inx, prefix+"usd_slt_bsa_qty");
			lusdWgt=sheetObj.GetCellValue(inx, prefix+"usd_slt_wgt");
			lamt=sheetObj.GetCellValue(inx, prefix+"stl_locl_amt");
		if (lvsl    == vsl    &&
			lvoy    == voy    &&
			ldir    == dir    &&
			lfin    == fin    &&
			lfmPort == fmPort &&
			ltoPort == toPort &&
			lusdQty == usdQty &&
			lusdWgt == usdWgt &&
			lamt    == amt){
			rtnVal=true;
			break;
		}
	}
	return rtnVal;
}

/**
 * bsa_qty 계산 값
 * @param sheet1_over_usd_qty
 * @param sheet1_over_usd_wgt
 * @param sheet1_bsa_per_wgt
 * @return
 */
function setBsaQty( sheet1_over_usd_qty, sheet1_over_usd_wgt, sheet1_bsa_per_wgt){	
// 원본	
// InitDataProperty(0, cnt++, dtData        ,  60, daRight , true, prefix+"bsa_qty"        ,false, "IF (IF(|sheet1_over_usd_qty| >= Round(|sheet1_over_usd_wgt|/|sheet1_bsa_per_wgt|,0), |sheet1_over_usd_qty|, Round(|sheet1_over_usd_wgt|/|sheet1_bsa_per_wgt|,0)) > 0 , IF(|sheet1_over_usd_qty| >= Round(IF(|sheet1_bsa_per_wgt|=0,0,|sheet1_over_usd_wgt|/|sheet1_bsa_per_wgt|),0), |sheet1_over_usd_qty|, Round(IF(|sheet1_bsa_per_wgt|=0,0,|sheet1_over_usd_wgt|/|sheet1_bsa_per_wgt|),0)),0)", dfInteger,0,false,false);//19
	
	var rtn1 = 0;
	var rtn2 = 0;
	var rtn3 = 0;
	var rtn4 = 0;
	
	if(sheet1_over_usd_qty >= ComRound(sheet1_over_usd_wgt/sheet1_bsa_per_wgt,0)){ 
		rtn1 = sheet1_over_usd_qty
	}else{ 
		rtn1 =  ComRound(sheet1_over_usd_wgt/sheet1_bsa_per_wgt,0)
	}

	if(sheet1_bsa_per_wgt == 0){
		rtn2 = 0;
	}else{
		rtn2 = sheet1_over_usd_wgt/sheet1_bsa_per_wgt
	}

	if(sheet1_bsa_per_wgt == 0){
		rtn3 = 0;
	}else{
		rtn3 = sheet1_over_usd_wgt/sheet1_bsa_per_wgt;
	}	
				
	if(rtn1 > 0) {
		if(sheet1_over_usd_qty >= ComRound(rtn2,0)) {
			rtn4 = sheet1_over_usd_qty;
		}else{
			rtn4 = ComRound(rtn3,0);
		}			
	}		      
	
	return rtn4;
}


/**
 * stl_locl_amt 계산 값
 * @param sheet1_bsa_qty
 * @param sheet1_bsa_slt_prc
 * @return
 */
function setStlLoclAmt(sheet1_bsa_qty, sheet1_bsa_slt_prc){
	return ComRound(sheet1_bsa_qty*sheet1_bsa_slt_prc,2);
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

/* 개발자 작업  끝 */
