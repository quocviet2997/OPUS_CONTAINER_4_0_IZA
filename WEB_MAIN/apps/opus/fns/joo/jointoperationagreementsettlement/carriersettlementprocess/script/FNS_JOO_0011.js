/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_JOO_0011.js
*@FileTitle  : Reefer Surcharge Creation
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/12
=========================================================*/
/* 개발자 작업	*/
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
		if (srcName == null || srcName == "re_divr_cd" || srcName == "rf_scg_stl_tp_cd") {
			return;
		}
		//class 가 btn1_1 이면 return한다.
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
				sheetObjects[0].SetCellEditable(row, prefix+"vsl_cd"          ,1);//Row Add한 것은 수정가능하게 한다.
				sheetObjects[0].SetCellEditable(row, prefix+"skd_voy_no"      ,1);//Row Add한 것은 수정가능하게 한다.
				sheetObjects[0].SetCellEditable(row, prefix+"skd_dir_cd"      ,1);//Row Add한 것은 수정가능하게 한다.
				sheetObjects[0].SetCellEditable(row, prefix+"rf_scg_stl_tp_cd",1);//Row Add한 것은 수정가능하게 한다.
				sheetObjects[0].SetCellValue(row, prefix+"acct_yrmon"      ,ComReplaceStr(formObj.acct_yrmon.value,"-",""),0);
				sheetObjects[0].SetCellValue(row, prefix+"trd_cd"          ,selTrdCd,0);
				sheetObjects[0].SetCellValue(row, prefix+"jo_crr_cd"       ,selJoCrrCd,0);
				sheetObjects[0].SetCellValue(row, prefix+"rlane_cd"        ,selRlaneCd,0);
				sheetObjects[0].SetCellValue(row, prefix+"re_divr_cd"      ,reDivrCd,0);
				sheetObjects[0].SetCellValue(row, prefix+"jo_stl_itm_cd"   ,formObj.jo_stl_itm_cd.value,0);
				sheetObjects[0].SetCellValue(row, prefix+"jo_mnu_nm"       ,formObj.jo_mnu_nm.value,0);
				sheetObjects[0].SetCellValue(row, prefix+"rf_scg_stl_tp_cd",selJoStlTgtTpCd,0);//선택할 수 있도록 한다.
				sheetObjects[0].SetCellValue(row, prefix+"skd_dir_cd"      ,"",0);
				sheetObjects[0].SetCellValue(row, prefix+"rev_dir_cd"      ,"",0);
				sheetObjects[0].SetCellValue(row, prefix+"stl_adj_flg"     ,"N",0);//보정여부 N
				sheetObjects[0].SetCellValue(row, prefix+"stl_lst_flg"     ,"Y",0);//최종여부 Y
				sheetObjects[0].SetCellValue(row, prefix+"locl_curr_cd"    ,selLoclCurrCd,0);
				sheetObjects[0].SetCellValue(row, prefix+"ioc_cd"          ,"",0);
				sheetObjects[0].SetCellValue(row, prefix+"sconti_cd"       ,"",0);
				//TDR 인 경우 I/O는 Inter Port이고 RGN은 A로 임의 setting한다. ==> VVD변경시(10자리) T이면 I로 setting한다. (수정불가) 
				if (selJoStlTgtTpCd == "T"){
					sheetObjects[0].SetCellEditable(row, prefix+"ioc_cd"        ,0);
					sheetObjects[0].SetCellEditable(row, prefix+"sconti_cd"     ,0);
				//RDR, UI인 경우 수정가능함
				}else{
					sheetObjects[0].SetCellEditable(row, prefix+"ioc_cd"        ,1);
					sheetObjects[0].SetCellEditable(row, prefix+"sconti_cd"     ,1);
				}
				//vsl_cd에 focus
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
					sheetObject1.Down2Excel({ HiddenColumn:1,Merge:1, DownCols :"2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22|23|24"});
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
		//khlee-시작 환경 설정 함수 이름 변경
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1);
		//khlee-마지막 환경 설정 함수 추가
		ComEndConfigSheet(sheetObjects[i]);
	}
	for(var k=0;k<comboObjects.length;k++){
		initCombo(comboObjects[k],k+1);
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
	axon_event.addListenerFormat('blur'		, 'obj_blur'    , formObj); 	//- form 전체 컨트롤 모든 컨트롤의 OnBeforeDeactivate(blur)이벤트에 코드 처리
	axon_event.addListenerFormat('focus'  	, 'obj_focus'   , formObj);            //- form 전체 컨트롤 중 dataformat 속성이 있는 모든 컨트롤의 OnBeforeActivate이벤트에 코드 처리
    axon_event.addListener('click'   , 'change_event_radio' , 're_divr_cd');
    axon_event.addListener('click'   , 'rt_click'           , 'rf_scg_stl_tp_cd');

	//[2015.09.18] New Carrier jo_crr_cd/trd_cd/rlane_cd 조회.
	doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC20);
	
    formObj.acct_yrmon.focus();
}
// Axon 이벤트 처리2. 이벤트처리함수
function obj_blur() {
	ComChkObjValid(ComGetEvent());
	var src=ComGetEvent("name");
    if (src == "acct_yrmon"){
    	ComAddSeparator(ComGetEvent(), "Ym");
    	doActionIBSheet(sheetObjects[1], document.form, IBSEARCH_ASYNC10);
    }
}
function obj_focus() {
	ComClearSeparator(ComGetEvent());
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
 * RDR/TDR Radio Button Click 
 * @return
 */
function rt_click(){
	var sheetObj=sheetObjects[0]; 
	sheetObj.RemoveAll();
	var rtuNmList="";
	var rtuCdList="";
	var rtu=JooGetRadioValue(document.form.rf_scg_stl_tp_cd);
	//RDR이면
	rtuCdList="R|T|U";
	rtuNmList="RDR|TDR|UI";
	
	/*if (rtu == "R"){
		rtuCdList="R|U";
		rtuNmList="RDR|UI";
	}else if (rtu == "T"){
		rtuCdList="T|U";
		rtuNmList="TDR|UI";
	}*/
	sheetObj.SetColProperty(prefix+"rf_scg_stl_tp_cd", {ComboText:rtuNmList, ComboCode:rtuCdList} );
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
		with (sheetObj) {
        var HeadTitle="STS||VSL|VOY|Dir.|Fin.\nDir|R/T/U|Ocean/\nInter port|RGN|Port|Port|Used RF|Used RF|RF Surcharge|RF Surcharge|CUR.|Amount|Amount|Amount|VVD Amt|Combined\nNo.|RVS|Basic Port|Schedule|Unit Cost\nBasic Port";
        HeadTitle += "|ACCT_YRMON|STL_VVD_SEQ|STL_SEQ_20|STL_SEQ_40|TRD_CD|JO_CRR_CD|RLANE_CD|RE_DIVR_CD|JO_STL_ITM_CD|JO_MNU_NM|SLIP_NO|UC_BSS_PORT_ETD_DT|FR_PORT|TO_PORT|STL_ADJ_FLG|STL_LST_FLG|DUP|DUP|";
        var HeadTitle1="STS||VSL|VOY|Dir.|Fin.\nDir|R/T/U|Ocean/\nInter port|RGN|POL|POD|20FT|40FT|20FT|40FT|CUR.|20FT|40FT|Total|VVD Amt|Combined\nNo.|RVS|Basic Port|Schedule|Unit Cost\nBasic Port";
        HeadTitle1 += "|ACCT_YRMON|STL_VVD_SEQ|STL_SEQ_20|STL_SEQ_40|TRD_CD|JO_CRR_CD|RLANE_CD|RE_DIVR_CD|JO_STL_ITM_CD|JO_MNU_NM|SLIP_NO|UC_BSS_PORT_ETD_DT|FR_PORT|TO_PORT|STL_ADJ_FLG|STL_LST_FLG|20FT|40FT|";
        var headCount=ComCountHeadTitle(HeadTitle);
        (headCount,11, 0, true);
        InitComboNoMatchText(true); //COMBO에서 match된 data가 없어도 보여짐
        SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
        var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
        var headers = [ { Text:HeadTitle, Align:"Center"},
                    { Text:HeadTitle1, Align:"Center"} ];
        InitHeaders(headers, info);
        var cols = [ 
                   {Type:"Status",    Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"ibflag" },
	               {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"del_chk" },
	               {Type:"Text",      Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:10 },
	               {Type:"Text",      Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"skd_voy_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:10 },
	               {Type:"Combo",     Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"skd_dir_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:10 },
	               {Type:"Text",      Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"rev_dir_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:10 },
	               {Type:"Combo",     Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:prefix+"rf_scg_stl_tp_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	               {Type:"Combo",     Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:prefix+"ioc_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Combo",     Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"sconti_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:prefix+"fm_port_cd1",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:prefix+"to_port_cd1",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"AutoSum",   Hidden:0, Width:50,   Align:"Right",   ColMerge:1,   SaveName:prefix+"usd_slt_bsa_qty_20", KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"AutoSum",   Hidden:0, Width:50,   Align:"Right",   ColMerge:1,   SaveName:prefix+"usd_slt_bsa_qty_40", KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Float",     Hidden:0, Width:60,   Align:"Right",   ColMerge:1,   SaveName:prefix+"rf_scg_prc_20",      KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
	               {Type:"Float",     Hidden:0, Width:60,   Align:"Right",   ColMerge:1,   SaveName:prefix+"rf_scg_prc_40",      KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
	               
	               {Type:"Text",      Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"locl_curr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"AutoSum",   Hidden:0, Width:80,   Align:"Right",   ColMerge:1,   SaveName:prefix+"stl_locl_amt_20", 	 KeyField:0,   CalcLogic:"setStlLoclAmt20(|sheet1_usd_slt_bsa_qty_20|, |sheet1_rf_scg_prc_20|, |sheet1_rvs_cmb_type|, |sheet1_stl_locl_amt_20|)",   Format:"Float",     PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"AutoSum",   Hidden:0, Width:80,   Align:"Right",   ColMerge:1,   SaveName:prefix+"stl_locl_amt_40", 	 KeyField:0,   CalcLogic:"setStlLoclAmt40(|sheet1_usd_slt_bsa_qty_40|, |sheet1_rf_scg_prc_40|, |sheet1_rvs_cmb_type|, |sheet1_stl_locl_amt_40|)",   Format:"Float",     PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"AutoSum",   Hidden:0, Width:100,  Align:"Right",   ColMerge:1,   SaveName:prefix+"stl_locl_amt", 		 KeyField:0,   CalcLogic:"setStlLoclAmt(|sheet1_usd_slt_bsa_qty_20|, |sheet1_rf_scg_prc_20|, |sheet1_usd_slt_bsa_qty_40|, |sheet1_rf_scg_prc_40|, |sheet1_stl_locl_amt_20|, |sheet1_stl_locl_amt_40|, |sheet1_rvs_cmb_type|)",   Format:"Float",     PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:100,  Align:"Right",   ColMerge:1,   SaveName:prefix+"vvd_sum_amt",        KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix+"stl_cmb_seq",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"rvs_cmb_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:prefix+"stl_bzc_port_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:0, Width:110,  Align:"Center",  ColMerge:1,   SaveName:prefix+"eta_dt",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:70,   Align:"Center",  ColMerge:1,   SaveName:prefix+"uc_bss_port_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"acct_yrmon",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_vvd_seq",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_seq_20",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_seq_40",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"trd_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_crr_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"rlane_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"re_divr_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_stl_itm_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_mnu_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"slip_no",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"uc_bss_port_etd_dt", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"fm_port_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"to_port_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_adj_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_lst_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"stl_dup_flg_20",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"stl_dup_flg_40",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Float",     Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"rvs_cmb_type",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }];
        
        InitColumns(cols);
        SetEditable(1);
        SetColProperty(prefix+"skd_dir_cd", {ComboText:"E|W|S|N", ComboCode:"E|W|S|N"} );
        SetColProperty(prefix+"ioc_cd", {ComboText:"A|"+gIocNm, ComboCode:"A|"+gIoc} );
        
        if(gRgn != null && gRgn != undefined && gRgn != ""){
			var rgnComboArr=gRgn.split("|");
			var rgnComboNmArr=gRgnNm.split("|");
			var iCnt=rgnComboArr.length;
			var rgnComboTxt=rgnComboArr[0] + "\t" + rgnComboNmArr[0];
			for(var i=1; i<iCnt; i++){
				rgnComboTxt=rgnComboTxt + "|" + rgnComboArr[i] + "\t" + rgnComboNmArr[i];
			}
			SetColProperty(prefix+"sconti_cd", {ComboText:rgnComboTxt, ComboCode:gRgn} );
        }	
        //SetColProperty(prefix+"sconti_cd", {ComboText:gRgnNm, ComboCode:gRgn} );
        SetColProperty(prefix+"eta_dt", {Format:"####-##-## ##:##:##"} );
        SetHeaderRowHeight(25);
//      SetSheetHeight(500);
        resizeSheet();
        SetRangeBackColor(1, 3, 1, 23,"#555555");
	    SetColProperty(0 ,prefix+"vsl_cd", {AcceptKeys:"E|N" , InputCaseSensitive:1});
	    SetColProperty(0 ,prefix+"fm_port_cd1", {AcceptKeys:"E|N" , InputCaseSensitive:1});
	    SetColProperty(0 ,prefix+"to_port_cd1", {AcceptKeys:"E|N" , InputCaseSensitive:1});	    
		}
		break;
	case 2: //t1sheet1 init
		with (sheetObj) {
		 SetVisible(false);
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
			sheetObj.DoSearch("FNS_JOO_0011GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix) );
			break;
		//Create
		case IBCREATE:
			formObj.f_cmd.value=SEARCH01;
			var sXml=sheetObj.GetSearchData("FNS_JOO_0011GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			if (ComGetEtcData(sXml,"TRANS_RESULT_KEY") == "S"){
				var addedCnt = sheetObj.RowCount("I");
				if (addedCnt == 0){
					ComShowCodeMessage('JOO00054'); //append된 data가 존재하지 않습니다.
				}
			}
			break;
		case IBSAVE: //저장
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
			var sXml=sheetObj.GetSaveData("FNS_JOO_0011GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			ComOpenWait(false);
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			var RTNVAL=ComGetEtcData(sXml, "RTNVAL");
			if (RTNVAL == "E"){
// DUPLICATE ERROR나면 confirm하지 않고 종료함				
//				if (ComShowCodeConfirm('JOO00132', dupRows)){
//					doActionIBSheet(sheetObj, document.form, IBINSERT);					
//				}
			}else{
				if (ComGetEtcData(sXml,"TRANS_RESULT_KEY") == "S"){
					doActionIBSheet(sheetObj, document.form, IBSEARCH);
				}
			}
			break;
		//SAVE => Do you want to save the changes? 물음 없이...저장 ==> Dup 나면 error message뿌리고 종료하므로 필요없음
		/*
		case IBINSERT: //중복체크하지 않는 저장
			var SaveStr = ComGetSaveString(sheetObjects[0], true, true);
			
			formObj.f_cmd.value = MULTI;

			var sXml = sheetObj.GetSaveXml("FNS_JOO_0011GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			sheetObj.LoadSearchXml(sXml);
			
			var dupRows = "";
			for(var i=sheetObj.HeaderRows; i<=sheetObj.RowCount(); i++){
				if (sheetObj.RowStatus(i) == "R" || sheetObj.RowStatus(i) == "D")
					continue;
				
				if (sheetObj.CellValue(i,prefix+"stl_dup_flg_20") == "Y"
				||  sheetObj.CellValue(i,prefix+"stl_dup_flg_40") == "Y"){
					dupRows = dupRows + (i-sheetObj.HeaderRows+1) +"|";
				}
			}
			
			if (dupRows.length > 0)
				dupRows = dupRows.substring(0, dupRows.length-1);
			
			
			var RTNVAL = ComGetEtcData(sXml, "RTNVAL");
			if (RTNVAL == "E"){
				if (ComShowCodeConfirm('JOO00132', dupRows)){
					doActionIBSheet(sheetObj, document.form, IBINSERT);					
				}
			}else{
				doActionIBSheet(sheetObj, document.form, IBSEARCH);					
			}
			
			break;*/
		//전체삭제
		case IBDELETE:
			if (!ComShowCodeConfirm("JOO00061")){
				return;
			}
			formObj.f_cmd.value=REMOVE01;
			sheetObj.SetWaitImageVisible(0);
			ComOpenWait(true);
			sheetObj.DoSearch("FNS_JOO_0011GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix) );
			ComOpenWait(false);
			break;
		//VVD 9자리 입력시 REVENUE Dir.을 조회한다.
		case IBROWSEARCH:
			formObj.f_cmd.value=SEARCHLIST;
			formObj.cur_row.value=(gCurRow - sheetObj.HeaderRows());
			var SaveStr=ComGetSaveString(sheetObj,true,true,-1);
			var sXml=sheetObj.GetSaveData("FNS_JOO_0011GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			var revDirList=ComGetEtcData(sXml,"REV_DIR_LIST");
			var errCd=ComGetEtcData(sXml,"ERR_CD");
			if (errCd == "N"){
				if ((revDirList.split("|")).length > 1){
					sheetObj.InitCellProperty(gCurRow, 5,{ Type:"Combo",Align:"Center",Format:""} );
					sheetObj.CellComboItem(gCurRow,prefix+"rev_dir_cd", {ComboText:revDirList, ComboCode:revDirList} );
				}else{
					sheetObj.SetCellValue(gCurRow, prefix+"rev_dir_cd",revDirList);
				}
			}else{
				ComShowCodeMessage("JOO00031");
				sheetObj.SetCellValue(gCurRow, prefix+"skd_dir_cd","",0);
			}
			break;
		//VVD변경시 (10자리)
		case IBSEARCH_ASYNC01:
			formObj.f_cmd.value=SEARCHLIST01;
			formObj.cur_row.value=gCurRow-sheetObj.HeaderRows();
			formObj.super_cd1.value=JooComGetCarrierText(cmb_jo_crr_cd, 2); //rlane_cd
			formObj.super_cd2.value=gVVD;
			var SaveStr=ComGetSaveString(sheetObj,true,true,-1); //전체 다 넘김
			var sXml=sheetObj.GetSaveData("FNS_JOO_0011GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			var CHECKVVD=ComGetEtcData(sXml,"CHECKVVD");
			//VVD가 유효하다면
			if (CHECKVVD=="N"){
				sheetObj.SetCellValue(gCurRow, prefix+"stl_vvd_seq"       ,ComGetEtcData(sXml,"stl_vvd_seq"),0);
				sheetObj.SetCellValue(gCurRow, prefix+"stl_bzc_port_cd"   ,ComGetEtcData(sXml,"stl_bzc_port_cd"),0);
				sheetObj.SetCellValue(gCurRow, prefix+"eta_dt"            ,ComGetEtcData(sXml,"eta_dt"),0);
				sheetObj.SetCellValue(gCurRow, prefix+"uc_bss_port_cd"    ,ComGetEtcData(sXml,"uc_bss_port_cd"),0);
				sheetObj.SetCellValue(gCurRow, prefix+"uc_bss_port_etd_dt",ComGetEtcData(sXml,"uc_bss_port_etd_dt"),0);
				//sheetObj.CellValue2(gCurRow, prefix+"uc_bss_port_cd"    ) = ComGetEtcData(sXml,"uc_bss_port_cd");
				//sheetObj.CellValue2(gCurRow, prefix+"uc_bss_port_etd_dt") = ComGetEtcData(sXml,"uc_bss_port_etd_dt");
				//2010.01.21 ==> R/F Surcharge Price를 가져오기 위해 필요함
				//formObj.uc_bss_port_etd_dt.value = ComGetEtcData(sXml,"uc_bss_port_etd_dt");
				var portList=ComGetEtcData(sXml,"portList");
				sheetObj.InitCellProperty(gCurRow, 9,{ Type:"Combo",Align:"Center",Format:""} );
				sheetObj.InitCellProperty(gCurRow,10,{ Type:"Combo",Align:"Center",Format:""} );
		        //Change event를 타지 못하게 하기 위함...
		        gChange=false;
		        sheetObj.CellComboItem(gCurRow,prefix+"fm_port_cd1", {ComboText:portList, ComboCode:portList} );
		        sheetObj.CellComboItem(gCurRow,prefix+"to_port_cd1", {ComboText:portList, ComboCode:portList} );
		        gChange=true;
		        sheetObj.SetCellValue(gCurRow, prefix+"fm_port_cd1","",0);
		        sheetObj.SetCellValue(gCurRow, prefix+"to_port_cd1","",0);
		        //TDR인 경우 InterPort에 Region 정보가 없으므로 자동으로 sheet1_OnChange의 ioc_cd 를 실행하도록 한다.
				if (JooGetRadioValue(formObj.rf_scg_stl_tp_cd) == "T"){
					sheetObj.SetCellValue(gCurRow, prefix+"ioc_cd","I");
				}
			}else{
				if (CHECKVVD=="E"){
					ComShowCodeMessage("JOO00141"); //No data found in 'Target VVD'.
				}else if (CHECKVVD=="T"){
					ComShowCodeMessage("JOO00142"); //Two or more data in 'Target VVD'.
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
		//I/O 변경
		case IBSEARCH_ASYNC03:
			formObj.f_cmd.value=SEARCHLIST03;
			formObj.cur_row.value=gCurRow-sheetObj.HeaderRows();
			var SaveStr=ComGetSaveString(sheetObj,true,true,-1);
			var sXml=sheetObj.GetSaveData("FNS_JOO_0011GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			var CHECKVVD=ComGetEtcData(sXml,"CHECKVVD");
			if (CHECKVVD=="N"){
				var arrIocCd=ComGetEtcData(sXml,"ioc_cd").split("|");
				var arrPrc20=ComGetEtcData(sXml,"rf_scg_prc_20").split("|");
				var arrPrc40=ComGetEtcData(sXml,"rf_scg_prc_40").split("|");
				sheetObj.SetCellValue(gCurRow, prefix+"ioc_cd",arrIocCd[0],0);
				sheetObj.SetCellValue(gCurRow, prefix+"rf_scg_prc_20",arrPrc20[0],0);
				sheetObj.SetCellValue(gCurRow, prefix+"rf_scg_prc_40",arrPrc40[0],0);
				//TDR인 경우 InterPort에 Region 정보가 없으므로 자동으로 타게 한다.
				if (JooGetRadioValue(formObj.rf_scg_stl_tp_cd) == "T"){
					sheetObj.SetCellValue(gCurRow, prefix+"sconti_cd","A");
				}				
				for (i=1; i<arrIocCd.length; i++){
					sheetObj.SelectCell(gCurRow, 12);
					var row=sheetObj.DataCopy();
					sheetObj.SetCellValue(row, prefix+"ioc_cd",arrIocCd[i],0);
					sheetObj.SetCellValue(row, prefix+"rf_scg_prc_20",arrPrc20[i],0);
					sheetObj.SetCellValue(row, prefix+"rf_scg_prc_40",arrPrc40[i],0);
					//TDR인 경우 InterPort에 Region 정보가 없으므로 자동으로 타게 한다.
					if (JooGetRadioValue(formObj.rf_scg_stl_tp_cd) == "T"){
						sheetObj.SetCellValue(row, prefix+"sconti_cd","A");
					}				
				}
				getCheckCurrency(sheetObj, "U");
			}else{
				if (CHECKVVD=="E"){
					ComShowCodeMessage("JOO00143");
					sheetObj.SetCellValue(gCurRow, prefix+"ioc_cd","",0);
				}
			}
			break;
		//RGN변경시
		case IBSEARCH_ASYNC04:
			formObj.f_cmd.value=SEARCHLIST04;
			formObj.cur_row.value=gCurRow-sheetObj.HeaderRows();
			var SaveStr=ComGetSaveString(sheetObj,true,true,-1);
			var sXml=sheetObj.GetSaveData("FNS_JOO_0011GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			var CHECKVVD=ComGetEtcData(sXml,"CHECKVVD");
			if (CHECKVVD=="N"){
				//여러건이 올수 있으므로...data copy로 넣는다.
				var arrFmPort=ComGetEtcData(sXml,"fm_port_cd").split("|");
				var arrToPort=ComGetEtcData(sXml,"to_port_cd").split("|");
				var arrQty20=ComGetEtcData(sXml,"usd_slt_bsa_qty_20").split("|");
				var arrQty40=ComGetEtcData(sXml,"usd_slt_bsa_qty_40").split("|");
				sheetObj.InitCellProperty(gCurRow, 9,{ Type:"Text",Align:"Center",Format:""} );
				sheetObj.InitCellProperty(gCurRow,10,{ Type:"Text",Align:"Center",Format:""} );
				sheetObj.SetCellValue(gCurRow, prefix+"fm_port_cd",arrFmPort[0],0);
				sheetObj.SetCellValue(gCurRow, prefix+"to_port_cd",arrToPort[0],0);
				sheetObj.SetCellValue(gCurRow, prefix+"fm_port_cd1",arrFmPort[0],0);
				sheetObj.SetCellValue(gCurRow, prefix+"to_port_cd1",arrToPort[0],0);
				sheetObj.SetCellValue(gCurRow, prefix+"usd_slt_bsa_qty_20",arrQty20[0],0);
				sheetObj.SetCellValue(gCurRow, prefix+"usd_slt_bsa_qty_40",arrQty40[0],0);
				for (i=1; i<arrFmPort.length; i++){
					sheetObj.SelectCell(gCurRow, 12);
					var row=sheetObj.DataCopy();
					sheetObj.InitCellProperty(row, 9,{ Type:"Text",Align:"Center",Format:""} );
					sheetObj.InitCellProperty(row,10,{ Type:"Text",Align:"Center",Format:""} );
					sheetObj.SetCellValue(row, prefix+"fm_port_cd",arrFmPort[i],0);
					sheetObj.SetCellValue(row, prefix+"to_port_cd",arrToPort[i],0);
					sheetObj.SetCellValue(row, prefix+"fm_port_cd1",arrFmPort[i],0);
					sheetObj.SetCellValue(row, prefix+"to_port_cd1",arrToPort[i],0);
					sheetObj.SetCellValue(row, prefix+"usd_slt_bsa_qty_20",arrQty20[i],0);
					sheetObj.SetCellValue(row, prefix+"usd_slt_bsa_qty_40",arrQty40[i],0);
				}
			}else if (CHECKVVD=="E"){
				sheetObj.SetCellValue(gCurRow, prefix+"sconti_cd"         ,"",0);
				sheetObj.SetCellValue(gCurRow, prefix+"usd_slt_bsa_qty_20","",0);
				sheetObj.SetCellValue(gCurRow, prefix+"usd_slt_bsa_qty_40","",0);
				ComShowCodeMessage("JOO00143");
			}
			break;
		case IBSEARCH_ASYNC10: //마감여부 조회
			formObj.f_cmd.value=SEARCH10;
			var sXml=sheetObj.GetSearchData("FNS_JOO_0011GS.do", FormQueryString(formObj));
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
				if (canRetrieve()){
					doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
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
	ComSetObjValue(formObj.locl_curr_cd	, selLoclCurrCd);
	
	sheetObjects[0].RemoveAll();
	
	var rtu = selJoStlTgtTpCd;
	
	//Bound, Round이면 RDR/TDR을 Basic Port 에서 읽어 setting해준다.
	if (selJoStlOptCd == null || selJoStlOptCd == undefined || ComTrim(selJoStlOptCd) == "" || selJoStlOptCd == "B" ||  selJoStlOptCd == "R"){
		if (rtu == null || rtu == undefined || ComTrim(rtu) == ""){
			JooSetRadioDisabled(formObj.rf_scg_stl_tp_cd, false);
		}else{
			JooSetRadioValue(formObj.rf_scg_stl_tp_cd, rtu);
			JooSetRadioDisabled(formObj.rf_scg_stl_tp_cd, true);
		}
	//Cycle이면 RDR/TDR 선택가능하게 한다. 
	}else if (selJoStlOptCd == "C"){	
		JooSetRadioValue(formObj.rf_scg_stl_tp_cd, rtu);
		JooSetRadioDisabled(formObj.rf_scg_stl_tp_cd, false);
	}

	var rtuNmList="";
	var rtuCdList="";
	//RDR이면
	//rtuCdList="R|T|U";
	//rtuNmList="RDR|TDR|UI";
	
	//RDR이면
	if (rtu == "R"){
		rtuCdList="R|U";
		rtuNmList="RDR|UI";
	}else if (rtu == "T"){
		rtuCdList="T|U";
		rtuNmList="TDR|UI";
	}else{
		rtuCdList="R|T|U";
		rtuNmList="RDR|TDR|UI";
	}
	sheetObjects[0].SetColProperty(prefix+"rf_scg_stl_tp_cd", {ComboText:rtuNmList, ComboCode:rtuCdList} );	
	
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
		if(editable){
			sheetObjects[i].SetEditable(1);
		}else{						
			sheetObjects[i].SetEditable(0);
		}
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
			if (JooGetRadioValue(formObj.rf_scg_stl_tp_cd) == ""){
				ComShowCodeMessage('JOO00171');
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
						
			for (var inx=sheetObj.HeaderRows(); inx < sheetObj.LastRow(); inx++){		// 이 경우는 LastRow() 적용, Total 포함해서 < 사용 (201409 민정호)
				var status=sheetObj.GetRowStatus(inx);
				if (status == "R")
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
				var rfScgStlTpCd=sheetObj.GetCellValue(inx, prefix+"rf_scg_stl_tp_cd");
				if (rfScgStlTpCd.length == 0){
					ComShowCodeMessage('JOO00084',inx);
					sheetObj.SelectCell(inx, prefix+"rf_scg_stl_tp_cd", true);
					return false;
				}
				var iocCd=sheetObj.GetCellValue(inx, prefix+"ioc_cd");
				if (iocCd.length == 0){
					ComShowCodeMessage('JOO00085',inx);
					sheetObj.SelectCell(inx, prefix+"ioc_cd", true);
					return false;
				}
				var scontiCd=sheetObj.GetCellValue(inx, prefix+"sconti_cd");
				if (scontiCd.length == 0){
					ComShowCodeMessage('JOO00086',inx);
					sheetObj.SelectCell(inx, prefix+"sconti_cd", true);
					return false;
				}
				var fmPortCd=sheetObj.GetCellValue(inx, prefix+"fm_port_cd");
				if (fmPortCd.length == 0){
					ComShowCodeMessage('JOO00087',inx);
					sheetObj.SelectCell(inx, prefix+"fm_port_cd1", true);
					return false;
				}
				var toPortCd=sheetObj.GetCellValue(inx, prefix+"to_port_cd");
				if (toPortCd.length == 0){
					ComShowCodeMessage('JOO00088',inx);
					sheetObj.SelectCell(inx, prefix+"to_port_cd1", true);
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
			if (JooGetRadioValue(formObj.rf_scg_stl_tp_cd) == ""){
				ComShowCodeMessage('JOO00171');
				return false;
			}
			break;
	}
	return true;
}
/**
 * sheet1_OnSearchEnd
 * @param sheetObj
 * @param ErrMsg
 * @return
 */
function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
	
	var editSw = 1;
	var rtuEditSw = 1;	
	
	var formObj = document.form;
	sheetObj.SetSumText(0,prefix+"vsl_cd","TOTAL");//TOTAL이라는 글자가 잘리지 않게 넓은데로 옮김
	var rtu=JooGetRadioValue(formObj.rf_scg_stl_tp_cd);
	
	var rtuEditable=true;
		
	//TDR인 경우는 CREATE시 모든 값을 가져오므로 editable을 막아준다.
	if (rtu == "T"){
		rtuEditable=false;
	}	
	
	//combined data는 삭제 checkbox를 막는다.
	for (var i=sheetObj.HeaderRows(); i< sheetObj.LastRow(); i++){			// 이 경우는 LastRow를 사용해야함201409 민정호)
		var stlCmbSeq=sheetObj.GetCellValue(i, prefix+"stl_cmb_seq");
		//combined No가 있으면 usd slot 을 수정할 수 없다.
		var bEditable=true;
		if (stlCmbSeq.length != 0){
			bEditable=false;
		}
		
		if(bEditable){
			editSw = 1;
		}else{
			editSw = 0;			
		}
			
		if(rtuEditable){
			rtuEditSw = 1;			
		}else{
			rtuEditSw = 0;			
		}
		
		sheetObj.SetCellEditable(i, prefix+"del_chk"           ,editSw);
		sheetObj.SetCellEditable(i, prefix+"usd_slt_bsa_qty_20",editSw);
		sheetObj.SetCellEditable(i, prefix+"usd_slt_bsa_qty_40",editSw);
		sheetObj.SetCellEditable(i, prefix+"rf_scg_prc_20",editSw);
		sheetObj.SetCellEditable(i, prefix+"rf_scg_prc_40",editSw);
		
		var ibflag=sheetObj.GetRowStatus(i);
		if (ibflag == "R"){
			sheetObj.SetCellEditable(i, prefix+"ioc_cd"   ,0);
			sheetObj.SetCellEditable(i, prefix+"sconti_cd",0);
		}else if (ibflag == "I"){
			sheetObj.SetCellEditable(i, prefix+"ioc_cd"   ,rtuEditSw);
			sheetObj.SetCellEditable(i, prefix+"sconti_cd",rtuEditSw);
			
		} 
	}
	
	sheetObj.SetCellFont("FontBold",sheetObj.HeaderRows(), prefix+"stl_locl_amt", sheetObj.LastRow(),1);
	
	getCheckCurrency(sheetObj, "I");
	
//	var ft20 = sheetObj.SumText(0,prefix+"stl_locl_amt_20");
//	var ft40 = sheetObj.SumText(0,prefix+"stl_locl_amt_40");
//	var total = Number(ComReplaceStr(ft20,",","")) + Number(ComReplaceStr(ft40,",",""));
//	sheetObj.SumText(0,prefix+"stl_cmb_seq") = ComAddCommaRun(total+"");  
}

/**
 * Sheet1_OnKeyUp
 * @param sheetObj
 * @param Row
 * @param Col
 * @param KeyCode
 * @param Shift
 * @return
 */
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
	gCurRow=Row;
	var vvd=sheetObj.GetCellValue(Row, prefix+"vsl_cd");
	vvd += sheetObj.GetCellValue(Row, prefix+"skd_voy_no");
	vvd += sheetObj.GetCellValue(Row, prefix+"skd_dir_cd");
	vvd += sheetObj.GetCellValue(Row, prefix+"rev_dir_cd");
	if (vvd.length == 10){
		gVVD=vvd;
	}
	//VVD변경시 기본정보 조회
	if (sName == prefix+"vsl_cd" || sName==prefix+"skd_voy_no" || sName==prefix+"skd_dir_cd" || sName==prefix+"rev_dir_cd"){
		//9자리 입력시 Rev Dir.을 자동조회한다.
		var tmp=sheetObj.GetComboInfo(Row, prefix+"rev_dir_cd", "Code");
		if ( sName!=prefix+"rev_dir_cd" || tmp.length <= 1 && Value == "" && sheetObj.GetRowStatus(Row) == "I"){
		var vvd1=sheetObj.GetCellValue(Row, prefix+"vsl_cd");
		vvd1 += sheetObj.GetCellValue(Row, prefix+"skd_voy_no");
		vvd1 += sheetObj.GetCellValue(Row, prefix+"skd_dir_cd");
			if (vvd1.length == 9){
				doActionIBSheet(sheetObj, formObj, IBROWSEARCH);
			}
		}
		if (vvd.length == 10){
			doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC01);
		}
	}
	// R/T/U 변경시 Editable 변경 로직
	if (sName == prefix+"rf_scg_stl_tp_cd"){
		//User Input 인 경우 변경 못하도록 한다. 
		if (Value == "U"){
			sheetObj.SetCellEditable(Row, prefix+"rf_scg_stl_tp_cd"  ,0);
			sheetObj.SetCellEditable(Row, prefix+"ioc_cd"            ,1);
			sheetObj.SetCellEditable(Row, prefix+"sconti_cd"         ,1);
			sheetObj.SetCellEditable(Row, prefix+"fm_port_cd1"       ,1);
			sheetObj.SetCellEditable(Row, prefix+"to_port_cd1"       ,1);
			sheetObj.SetCellEditable(Row, prefix+"usd_slt_bsa_qty_20",1);
			sheetObj.SetCellEditable(Row, prefix+"usd_slt_bsa_qty_40",1);
			sheetObj.SetCellValue(Row, prefix+"usd_slt_bsa_qty_20",0);
			sheetObj.SetCellValue(Row, prefix+"usd_slt_bsa_qty_40",0);
		}else if (Value == "T"){
			sheetObj.SetCellEditable(Row, prefix+"rf_scg_stl_tp_cd"  ,1);
			sheetObj.SetCellEditable(Row, prefix+"ioc_cd"            ,0);
			sheetObj.SetCellEditable(Row, prefix+"sconti_cd"         ,0);
			sheetObj.SetCellEditable(Row, prefix+"fm_port_cd1"       ,1);
			sheetObj.SetCellEditable(Row, prefix+"to_port_cd1"       ,1);
			sheetObj.SetCellEditable(Row, prefix+"usd_slt_bsa_qty_20",1);
			sheetObj.SetCellEditable(Row, prefix+"usd_slt_bsa_qty_40",1);
			sheetObj.SetCellValue(Row, prefix+"ioc_cd"   ,"I");
			sheetObj.SetCellValue(Row, prefix+"sconti_cd","A");
		}else{
			sheetObj.SetCellEditable(Row, prefix+"rf_scg_stl_tp_cd"  ,1);
			sheetObj.SetCellEditable(Row, prefix+"ioc_cd"            ,1);
			sheetObj.SetCellEditable(Row, prefix+"sconti_cd"         ,1);
			sheetObj.SetCellEditable(Row, prefix+"fm_port_cd1"       ,0);
			sheetObj.SetCellEditable(Row, prefix+"to_port_cd1"       ,0);
			sheetObj.SetCellEditable(Row, prefix+"usd_slt_bsa_qty_20",0);
			sheetObj.SetCellEditable(Row, prefix+"usd_slt_bsa_qty_40",0);
		}
		//2010.01.25 박효숙 차장 => Create해온 data중에 POL, POD가 없다면 UI로 변경시에 Port List를 조회해서 Combo로 Setting해준다.
		var tmp=sheetObj.GetComboInfo(Row, prefix+"fm_port_cd1", "Code");
		if (sheetObj.GetCellValue(Row, prefix+"fm_port_cd1") == "" && tmp.length <= 1){
			doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC01);
		}
	}
	// I/O 변경시 RF Surcharge (단가정보)를 조회한다.
	if (sName == prefix+"ioc_cd"){
		if (vvd.length != 10){
			ComShowCodeMessage("JOO00039");
			sheetObj.SetCellValue(Row, Col,"",0);
			return;
		}
		var rf_scg_stl_tp_cd=sheetObj.GetCellValue(Row, prefix+"rf_scg_stl_tp_cd");
		if (rf_scg_stl_tp_cd.length < 1){
			ComShowCodeMessage("JOO00084");
			sheetObj.SetCellValue(Row, Col,"",0);
			return;
		}
		sheetObj.SetCellValue(Row, prefix+"sconti_cd"  ,"",0);
		sheetObj.SetCellValue(Row, prefix+"fm_port_cd" ,"",0);
		sheetObj.SetCellValue(Row, prefix+"to_port_cd" ,"",0);
		sheetObj.SetCellValue(Row, prefix+"fm_port_cd1","",0);
		sheetObj.SetCellValue(Row, prefix+"to_port_cd1","",0);
		sheetObj.SetCellValue(Row, prefix+"usd_slt_bsa_qty_20","",0);
		sheetObj.SetCellValue(Row, prefix+"usd_slt_bsa_qty_40","",0);
		if (Value.length == 1){
			//2010.11.17 신자영  uc_bss_port_etd_dt 관련 로직 막음		
			//var ucBssPortEtdDt = sheetObj.CellValue(Row, prefix+"uc_bss_port_etd_dt");
			//if (ComTrim(ucBssPortEtdDt).length == 0){
			//	ComShowCodeMessage("JOO00173");
			//	sheetObj.CellValue2(Row, prefix+"ioc_cd") = "";
			//	return;
			//}
			doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC03);
		}
	}
	// RGN변경시 Used RF 를 조회한다.
	if (sName == prefix+"sconti_cd"){
		if (vvd.length != 10){
			ComShowCodeMessage("JOO00039");
			sheetObj.SetCellValue(Row, Col,"",0);
			return;
		}
		var ioc=sheetObj.GetCellValue(Row, prefix+"ioc_cd");
		if (ioc == ""){
			ComShowCodeMessage("JOO00155");
			sheetObj.SetCellValue(Row, Col,"",0);
			return;
		}
		//RGN 변경시 R/T/U가 UI이면 user가 입력하는 것이므로 server에서 읽어올 필요 없다.
		var rtu=sheetObj.GetCellValue(Row, prefix+"rf_scg_stl_tp_cd");
		if (rtu != "U" && Value.length == 1)
			doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC04);
	}
	//From Port, To Port 변경시 Check
	if ((sName == prefix+"fm_port_cd1" || sName == prefix+"to_port_cd1") && gChange){
		var fmPortCd=sheetObj.GetCellValue(Row, prefix+"fm_port_cd1");
		var toPortCd=sheetObj.GetCellValue(Row, prefix+"to_port_cd1");
		sheetObj.SetCellValue(Row, prefix+"fm_port_cd",fmPortCd,0);
		sheetObj.SetCellValue(Row, prefix+"to_port_cd",toPortCd,0);
//		if (fmPortCd == toPortCd && fmPortCd.length >0 && toPortCd.length > 0){
//			ComShowCodeMessage("JOO00080");
//			sheetObj.CellValue2(Row, prefix+"to_port_cd1") = "";
//			sheetObj.SelectCell(Row, prefix+"to_port_cd1",true);
//			return;
//		}
	}
	//Used RF 변경시 중복체크
	if (sName == prefix+"usd_slt_bsa_qty_20" || sName == prefix+"usd_slt_bsa_qty_40"){
		if (vvd.length != 10){
			ComShowCodeMessage("JOO00039");
			sheetObj.SetCellValue(Row, Col,"",0);
			return;
		}
		var ioc=sheetObj.GetCellValue(Row, prefix+"ioc_cd");
		if (ioc == ""){
			ComShowCodeMessage("JOO00155"); // Please input 'Inter/Ocean' at first.
			sheetObj.SetCellValue(Row, Col,"",0);
			return;
		}
		var rgn=sheetObj.GetCellValue(Row, prefix+"sconti_cd");
		if (rgn == ""){
			ComShowCodeMessage("JOO00156"); // Please input 'RGN' at first.
			sheetObj.SetCellValue(Row, Col,"",0);
			return;
		}
		var vsl=sheetObj.GetCellValue(Row, prefix+"vsl_cd");
		var voy=sheetObj.GetCellValue(Row, prefix+"skd_voy_no");
		var dir=sheetObj.GetCellValue(Row, prefix+"skd_dir_cd");
		var fin=sheetObj.GetCellValue(Row, prefix+"rev_dir_cd");
		var fmPort=sheetObj.GetCellValue(Row, prefix+"fm_port_cd1");
		var toPort=sheetObj.GetCellValue(Row, prefix+"to_port_cd1");
		var qty20=sheetObj.GetCellValue(Row, prefix+"usd_slt_bsa_qty_20");
		var qty40=sheetObj.GetCellValue(Row, prefix+"usd_slt_bsa_qty_40");
		var amt20=sheetObj.GetCellValue(Row, prefix+"stl_locl_amt_20");
		var amt40=sheetObj.GetCellValue(Row, prefix+"stl_locl_amt_40");
		//같은 데이터가 있는지 확인
		if (existsSamePair(sheetObj, Row, vsl, voy, dir, fin, ioc, rgn, fmPort, toPort, qty20, qty40, amt20, amt40)){
			//계속하겠냐? 했을 때 아니면 삭제?
			if (!ComShowCodeConfirm("JOO00157")){
				sheetObj.SetCellValue(Row, prefix+"sconti_cd" ,"",0);
				sheetObj.SetCellValue(Row, prefix+"fm_port_cd","",0);
				sheetObj.SetCellValue(Row, prefix+"fm_port_cd1","",0);
				sheetObj.SetCellValue(Row, prefix+"to_port_cd","",0);
				sheetObj.SetCellValue(Row, prefix+"to_port_cd1","",0);
				sheetObj.SetCellValue(Row, prefix+"usd_slt_bsa_qty_20","",0);
				sheetObj.SetCellValue(Row, prefix+"usd_slt_bsa_qty_40","",0);
				sheetObj.SetCellValue(Row, prefix+"stl_locl_amt_20","",0);
				sheetObj.SetCellValue(Row, prefix+"stl_locl_amt_40","",0);
			}else{
				sheetObj.SetCellValue(Row, prefix+"stl_dup_flg_20" ,"Y",0);
				sheetObj.SetCellValue(Row, prefix+"stl_dup_flg_40" ,"Y",0);
			}
		}
	}
}
/**
 * 
 * @param sheetObj
 * @param Row
 * @param Col
 * @param CellX
 * @param CellY
 * @param CellW
 * @param CellH
 * @return
 */

function sheet1_OnDblClick(sheetObj, Row, Col, CellX, CellY, CellW, CellH) {
	var sName=sheetObj.ColSaveName(Col);
	var formObj=document.form;
	if (sName == prefix+"stl_locl_amt"){
		sheetObj.InitCellProperty(Row, Col, {Type:"AutoSum",   Hidden:0, Width:80,   Align:"Right",   ColMerge:1,   SaveName:prefix+"stl_locl_amt_20", 	 KeyField:0,   CalcLogic:"setStlLoclAmt20(|sheet1_usd_slt_bsa_qty_20|, |sheet1_rf_scg_prc_20|, |sheet1_rvs_cmb_type|, |sheet1_stl_locl_amt_20|)",   Format:"Float",     PointCount:2,   UpdateEdit:0,   InsertEdit:0 });
		sheetObj.InitCellProperty(Row, Col, {Type:"AutoSum",   Hidden:0, Width:80,   Align:"Right",   ColMerge:1,   SaveName:prefix+"stl_locl_amt_40", 	 KeyField:0,   CalcLogic:"setStlLoclAmt40(|sheet1_usd_slt_bsa_qty_40|, |sheet1_rf_scg_prc_40|, |sheet1_rvs_cmb_type|, |sheet1_stl_locl_amt_40|)",   Format:"Float",     PointCount:2,   UpdateEdit:0,   InsertEdit:0 });
        
		//sheetObj.InitDataProperty(0, 16, dtAutoSum ,  80, daRight ,  true, prefix+"stl_locl_amt_20"   ,false, "Round(|sheet1_usd_slt_bsa_qty_20|*|sheet1_rf_scg_prc_20|,2)", dfFloat,2,false,false); //16
		//sheetObj.InitDataProperty(0, 17, dtAutoSum ,  80, daRight ,  true, prefix+"stl_locl_amt_40"   ,false, "Round(|sheet1_usd_slt_bsa_qty_40|*|sheet1_rf_scg_prc_40|,2)", dfFloat,2,false,false); //17
	}
}


/**
 * 같은 Data가 있는 지 확인한다. (VVD, From port, To Port, 20FT Used RF, 40FT Used RF)
 * @param sheetObj
 * @param Row
 * @param vsl
 * @param voy
 * @param dir
 * @param fin
 * @param fmPort
 * @param toPort
 * @param qty20
 * @param qty40
 * @param amt20
 * @param amt40
 * @return
 */
function existsSamePair(sheetObj, Row, vsl, voy, dir, fin, ioc, rgn, fmPort, toPort, qty20,  qty40, amt20, amt40){
	var rtnVal=false;
	for(var inx=sheetObj.HeaderRows(); inx < sheetObj.LastRow(); inx++){
		if (inx==Row) continue;
			var lvsl=sheetObj.GetCellValue(inx, prefix+"vsl_cd");
			var lvoy=sheetObj.GetCellValue(inx, prefix+"skd_voy_no");
			var ldir=sheetObj.GetCellValue(inx, prefix+"skd_dir_cd");
			var lfin=sheetObj.GetCellValue(inx, prefix+"rev_dir_cd");
			var lioc=sheetObj.GetCellValue(inx, prefix+"ioc_cd");
			var lrgn=sheetObj.GetCellValue(inx, prefix+"sconti_cd");
			var lfmPort=sheetObj.GetCellValue(inx, prefix+"fm_port_cd");
			var ltoPort=sheetObj.GetCellValue(inx, prefix+"to_port_cd");
			var lqty20=sheetObj.GetCellValue(inx, prefix+"usd_slt_bsa_qty_20");
			var lqty40=sheetObj.GetCellValue(inx, prefix+"usd_slt_bsa_qty_40");
			var lamt20=sheetObj.GetCellValue(inx, prefix+"stl_locl_amt_20");
			var lamt40=sheetObj.GetCellValue(inx, prefix+"stl_locl_amt_40");
		if (lvsl    == vsl 
		&&  lvoy    == voy  
		&&  ldir    == dir    
		&&  lfin    == fin    
		&&  lioc    == ioc    
		&&  lrgn    == rgn    
		&&  lfmPort == fmPort 
		&&  ltoPort == toPort 
		&& ((lqty20  == qty20 && lamt20  == amt20)
		 || (lqty40  == qty40 && lamt40  == amt40))){
			rtnVal=true;
			break;
		}
	}
	return rtnVal;
}
/**
 * account year month 버튼으로 변경시 조회가능여부를 check한다.
 * @return
 */
function canRetrieve(){
	formObj=document.form;
	var selJoCrrCd 		= JooComGetCarrierText(cmb_jo_crr_cd, 0); //jo_crr_cd
	var selTrdCd 		= JooComGetCarrierText(cmb_jo_crr_cd, 1); //trd_cd
	var selRlaneCd 		= JooComGetCarrierText(cmb_jo_crr_cd, 2); //rlane_cd
	
	var acctYrmon=ComReplaceStr(formObj.acct_yrmon.value,"-","");
	if (acctYrmon.length < 6)
		return false;
	if (selJoCrrCd.length < 3)
		return false;
	if (selTrdCd.length < 3)
		return false;
	if (selRlaneCd.length < 5)
		return false;
	return true;
}
/* 개발자 작업  끝 */


function setStlLoclAmt20(sheet1_usd_slt_bsa_qty_20, sheet1_rf_scg_prc_20, sheet1_rvs_cmb_type, sheet1_stl_locl_amt_20){
	if (sheet1_rvs_cmb_type == 1 && sheet1_stl_locl_amt_20 < 0) {
		return sheet1_stl_locl_amt_20;
	} else {
		return ComRound(sheet1_usd_slt_bsa_qty_20*sheet1_rf_scg_prc_20,2);	
	}
	
}

function setStlLoclAmt40(sheet1_usd_slt_bsa_qty_40, sheet1_rf_scg_prc_40, sheet1_rvs_cmb_type, sheet1_stl_locl_amt_40){
	if (sheet1_rvs_cmb_type == 1 && sheet1_stl_locl_amt_40 < 0) {
		return sheet1_stl_locl_amt_40;
	} else {
		return ComRound(sheet1_usd_slt_bsa_qty_40*sheet1_rf_scg_prc_40,2);
	}
}

function setStlLoclAmt(sheet1_usd_slt_bsa_qty_20, sheet1_rf_scg_prc_20, sheet1_usd_slt_bsa_qty_40, sheet1_rf_scg_prc_40, sheet1_stl_locl_amt_20, sheet1_stl_locl_amt_40, sheet1_rvs_cmb_type){
	
	if (sheet1_rvs_cmb_type == 1 && sheet1_stl_locl_amt_20 < 0 && sheet1_stl_locl_amt_40 < 0) {
		return ComRound(sheet1_stl_locl_amt_20 + sheet1_stl_locl_amt_40, 2);
	} else {
		return ComRound(sheet1_usd_slt_bsa_qty_20*sheet1_rf_scg_prc_20,2) + ComRound(sheet1_usd_slt_bsa_qty_40*sheet1_rf_scg_prc_40,2);
	}	
}

function resizeSheet(){
    ComResizeSheet(sheetObjects[0]);
}


function getCheckCurrency(sheetObj, flag){
	var iChkBsaCurrency = 0;
	with(sheetObj){
		switch(flag){
			case "I" :
			case "U" :
				for (var i=HeaderRows(); i< LastRow(); i++){	
					var ibflag=GetRowStatus(i);
					
					var varRfScgPrc20 = GetCellValue(i, prefix+"rf_scg_prc_20");
					var varRfScgPrc40 = GetCellValue(i, prefix+"rf_scg_prc_40");
					var varLoclCurrCd = GetCellValue(i, prefix+"locl_curr_cd");
					if("I"== ibflag && "" != varRfScgPrc20 && "" != varRfScgPrc40 && (Number(varRfScgPrc20) > 0 || Number(varRfScgPrc40) > 0) &&	
							gCurrencyUSD != varLoclCurrCd){
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

function UF_reset(){
	var formObj = document.form;
	ComResetAll();
	sheetObjects[0].RemoveAll();

	cmb_jo_crr_cd.SetSelectIndex(-1,0);	
	formObj.re_divr_cd[0].checked=true;	
	formObj.acct_yrmon.focus();
}