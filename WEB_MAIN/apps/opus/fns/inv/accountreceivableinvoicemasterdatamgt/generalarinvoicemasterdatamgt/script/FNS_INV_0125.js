/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName :FNS_INV_0125.js
 *@FileTitle : TAX Profile Setup
 *Open Issues :
 *Change history :
 *@LastModifyDate : 
 *@LastModifier : 
 *@LastVersion : 1.0
 * 2017.11.01 HRJ(JWY)
 * 1.0 Creation
=========================================================*/
/* 개발자 작업	*/

//공통전역변수
var sheetObjects = new Array();
var sheetCnt = 0;
var comboObjects = new Array();
var comboCnt = 0;
//DATA 구분자 정의
var ROWMARK = "|";
var FIELDMARK = "=";	 
//var isNoChangeActive = false;
//var isNoInitActive = false;	

//버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick = processButtonClick;

/** 
 * IBSheet Object를 sheetObjects 배열로 등록 <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {IBSheet} sheetObj IBSheet Object
 * @return 없음
 * @see #
 * @author
 * @version 
 */
function setSheetObject(sheet_obj){
	sheetObjects[sheetCnt++] = sheet_obj;
}

/** 
 * IBCombo Object set to an array
 * param : combo_obj 
 * adding process for list in case of needing batch processing with other items
 * defining list on the top of source
 */ 
function setComboObject(combo_obj) {  
	comboObjects[comboCnt++] = combo_obj;  
}

/** 
 * body 태그의 onLoad 이벤트핸들러 구현 <br>
 * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다. <br> 
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  없음
 * @return 없음
 * @see #
 * @author 
 * @version 
 */
function loadPage() {
	for(var k = 0; k<comboObjects.length; k++){
		initCombo(comboObjects[k], k+1);
	} 
	for(i = 0; i<sheetObjects.length; i++){
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i+1);
		ComEndConfigSheet(sheetObjects[i]);
	}
	//initControl();
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC01);
	ComBtnDisable("btn_RowAdd1"); 
	ComBtnDisable("btn_Delete1");
	ComBtnDisable("btn_RowAdd2"); 
	ComBtnDisable("btn_Delete2"); 	 
}

/**
 * Initializing Cond Combo 
 * param : comboObj , comboNo
 * adding case as numbers of counting Combos 
 */ 
function initCombo(comboObj, comboNo) {
	var formObject = document.form
	switch(comboNo) {

	case 1:
		with (comboObj) { 
		SetMultiSelect(0);
		SetColAlign(0, "Center");
		SetColAlign(1, "left");
		SetColWidth(0, 40);
		SetColWidth(1, 150);
		ValidChar(2, 2);	
	}
		break;

	case 2: 
		with (comboObj) { 		
	}
		break;

	case 3: 
		with (comboObj) { 		
	}
		break;
	} 
}    	

/** 
 * Sheet 기본 설정 및 초기화 <br>
 * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다. <br>
 * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다. <br> 
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param {IBSheet} sheetObj : 시트오브젝트
 * @param {int} sheetNo : 시트오브젝트 태그의 아이디에 붙인 일련번호  
 * @return 없음
 * @see #
 * @author HRJ
 * @version 2011.03.04
 */
function initSheet(sheetObj, sheetNo) {
	var cnt = 0;
	var sheetId = sheetObj.id;
	switch(sheetId) {
	case "sheet0":       
		with(sheetObj){		
		var prefix = sheetId +"_";  
		var HeadTitle1="|Sel|Seq||Country|Name|EFF fm Dt|EFF to Dt|VAT Tp|VAT Rate(%)|In/Exclude|Date Tp|INV Tp|Trade Tp|ALL CHG|!Marking|!CURR|!AR Office|!Cust Inv|Round Tp|Language Charge Rmk|CAL SEQ|Delete YN";
		SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
		var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		var headers = [ { Text:HeadTitle1, Align:"Center"} ];
		InitHeaders(headers, info);

		var cols = [ {Type:"Status",     Hidden:1,  Width:0,     Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
		             {Type:"DummyCheck", Hidden:0,  Width:40,    Align:"Center",  ColMerge:0,   SaveName:prefix+"DelChk" },
		             {Type:"Seq",        Hidden:0,  Width:47,    Align:"Center",  ColMerge:0,   SaveName:prefix+"SEQ",             KeyField:0,   CalcLogic:"",   Format:"" },
		             {Type:"Text",       Hidden:1,  Width:0,     Align:"Center",  ColMerge:0,   SaveName:prefix+"tax_cnt_seq",     KeyField:0,   CalcLogic:"",   Format:"",          PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Combo",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:0,   SaveName:prefix+"tax_cnt_cd",      KeyField:1,   CalcLogic:"",   Format:"",          PointCount:0,   UpdateEdit:0,   InsertEdit:1, EditLen:2, AcceptKeys:"E|N|[ ]", InputCaseSensitive:1 },
		             {Type:"Text",       Hidden:0,  Width:200,   Align:"Left",    ColMerge:0,   SaveName:prefix+"cnt_nm",          KeyField:0,   CalcLogic:"",   Format:"",          PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Date",       Hidden:0,  Width:90,    Align:"Center",  ColMerge:0,   SaveName:prefix+"fm_dt",           KeyField:1,   CalcLogic:"",   Format:"Ymd",       PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		             {Type:"Date",       Hidden:0,  Width:90,    Align:"Center",  ColMerge:0,   SaveName:prefix+"to_dt",           KeyField:1,   CalcLogic:"",   Format:"Ymd",       PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		             {Type:"Combo",      Hidden:0,  Width:70,    Align:"Center",  ColMerge:0,   SaveName:prefix+"vat_cd",          KeyField:1,   CalcLogic:"",   Format:"",          PointCount:0,   UpdateEdit:1,   InsertEdit:1 },  
		             {Type:"Float",      Hidden:0,  Width:90,    Align:"Right",   ColMerge:0,   SaveName:prefix+"vat_rt",          KeyField:1,   CalcLogic:"",   Format:"Float",     PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
		             {Type:"Combo",      Hidden:0,  Width:70,    Align:"Center",  ColMerge:0,   SaveName:prefix+"incl_flg",        KeyField:0,   CalcLogic:"",   Format:"",          PointCount:0,   UpdateEdit:1,   InsertEdit:1 },      
		             {Type:"Combo",      Hidden:0,  Width:70,    Align:"Center",  ColMerge:0,   SaveName:prefix+"dt_aply_tp_cd",   KeyField:1,   CalcLogic:"",   Format:"",          PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		             {Type:"Combo",      Hidden:0,  Width:70,    Align:"Center",  ColMerge:0,   SaveName:prefix+"tax_inv_tp_cd",   KeyField:1,   CalcLogic:"",   Format:"",          PointCount:0,   UpdateEdit:1,   InsertEdit:1 }, 
		             {Type:"Combo",      Hidden:0,  Width:70,    Align:"Center",  ColMerge:0,   SaveName:prefix+"trd_tp_cd",       KeyField:1,   CalcLogic:"",   Format:"",          PointCount:0,   UpdateEdit:1,   InsertEdit:1 }, 
		             {Type:"Combo",      Hidden:0,  Width:85,    Align:"Center",  ColMerge:0,   SaveName:prefix+"all_chg_flg",     KeyField:1,   CalcLogic:"",   Format:"",          PointCount:0,   UpdateEdit:1,   InsertEdit:1, ComboText:"No|Yes", ComboCode:"N|Y" } ,
		             {Type:"Combo",      Hidden:1,  Width:70,    Align:"Center",  ColMerge:0,   SaveName:prefix+"mkg_flg",         KeyField:1,   CalcLogic:"",   Format:"",          PointCount:0,   UpdateEdit:1,   InsertEdit:1 },  
		             {Type:"Combo",      Hidden:1,  Width:70,    Align:"Center",  ColMerge:0,   SaveName:prefix+"tax_curr_cd",     KeyField:0,   CalcLogic:"",   Format:"",          PointCount:0,   UpdateEdit:1,   InsertEdit:1, EditLen:3, AcceptKeys:"E|N|[ ]", InputCaseSensitive:1 },
		             {Type:"Combo",      Hidden:1,  Width:100,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ar_ofc_cd",       KeyField:0,   CalcLogic:"",   Format:"",          PointCount:0,   UpdateEdit:0,   InsertEdit:0, ComboText:"ALL", ComboCode:"ALL" },
		             {Type:"Combo",      Hidden:1,  Width:70,    Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_inv_tp_cd",  KeyField:0,   CalcLogic:"",   Format:"",          PointCount:0,   UpdateEdit:1,   InsertEdit:1 }, 
		             {Type:"Combo",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:0,   SaveName:prefix+"rnd_tp_cd",       KeyField:0,   CalcLogic:"",   Format:"",          PointCount:0,   UpdateEdit:1,   InsertEdit:1, EditLen:3},
		             {Type:"Combo",      Hidden:0,  Width:200,   Align:"Left",    ColMerge:0,   SaveName:prefix+"lang_chg_rmk",    KeyField:0,   CalcLogic:"",   Format:"",          PointCount:0,   UpdateEdit:1,   InsertEdit:1, EditLen:99 }, 
		             {Type:"Combo",      Hidden:0,  Width:70,    Align:"Center",  ColMerge:0,   SaveName:prefix+"calc_seq",        KeyField:0,   CalcLogic:"",   Format:"",          PointCount:0,   UpdateEdit:1,   InsertEdit:1, ComboText:"1|2|3|4|5", ComboCode:"1|2|3|4|5" },
		             {Type:"Combo",      Hidden:0,  Width:70,    Align:"Center",  ColMerge:0,   SaveName:prefix+"delt_flg",        KeyField:0,   CalcLogic:"",   Format:"",          PointCount:0,   UpdateEdit:1,   InsertEdit:1, ComboText:"No|Yes", ComboCode:"N|Y" }  ]; 

		InitColumns(cols);		
		SetEditable(1);
		SetWaitImageVisible(0);
		SetColProperty(prefix+"rnd_tp_cd", {ComboText:rndTpCdText, ComboCode:rndTpCdCode} );
		resizeSheet();
	}
		break;

	case "sheet1":      
		with(sheetObj){		
		var prefix = sheetId +"_";  
		var HeadTitle2="|Sel|Seq|||Charge|Name|In/Exclude|!Delete YN";
		SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
		var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		var headers = [ { Text:HeadTitle2, Align:"Center"} ];
		InitHeaders(headers, info);

		var cols = [ {Type:"Status",     Hidden:1,  Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"ibflag" },
		             {Type:"DummyCheck", Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:prefix+"DelChk" },
		             {Type:"Seq",        Hidden:0,  Width:47,   Align:"Center",  ColMerge:0,   SaveName:prefix+"SEQ",             KeyField:0,   CalcLogic:"",   Format:"" },
		             {Type:"Text",       Hidden:1,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"tax_cnt_cd",      KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:1 }, 
		             {Type:"Text",       Hidden:1,  Width:47,   Align:"Center",  ColMerge:0,   SaveName:prefix+"tax_cnt_seq",     KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		             {Type:"Combo",      Hidden:0,  Width:140,  Align:"Center",  ColMerge:0,   SaveName:prefix+"chg_cd",          KeyField:1,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		             {Type:"Text",       Hidden:0,  Width:260,  Align:"Left",    ColMerge:0,   SaveName:prefix+"chg_nm",          KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Combo",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"incl_xcld_tp_cd", KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:1,   InsertEdit:1 },      
		             {Type:"Combo",      Hidden:1,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:prefix+"delt_flg",        KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:1,   InsertEdit:1, ComboText:"No", ComboCode:"N" }  ]; 

		InitColumns(cols);		
		SetEditable(1);
		SetWaitImageVisible(0);
		SetSheetHeight(160);
	}
		break;

	case "sheet2":      
		with(sheetObj){		
		var prefix = sheetId +"_";  
		var HeadTitle3="|Sel|Seq|||FM Country|Name|TO Country|Name|!Delete YN";
		SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
		var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		var headers = [ { Text:HeadTitle3, Align:"Center"} ];
		InitHeaders(headers, info);

		var cols = [ {Type:"Status",     Hidden:1,  Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"ibflag" },
		             {Type:"DummyCheck", Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:prefix+"DelChk" },
		             {Type:"Seq",        Hidden:0,  Width:47,   Align:"Center",  ColMerge:0,   SaveName:prefix+"SEQ",             KeyField:0,   CalcLogic:"",   Format:"" },
		             {Type:"Text",       Hidden:1,  Width:47,   Align:"Center",  ColMerge:0,   SaveName:prefix+"tax_cnt_seq",     KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		             {Type:"Text",       Hidden:1,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"tax_cnt_cd",      KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:1 }, 
		             {Type:"Combo",      Hidden:0,  Width:125,  Align:"Center",  ColMerge:0,   SaveName:prefix+"fm_cnt_cd",       KeyField:1,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:1,   InsertEdit:1,  EditLen:2, AcceptKeys:"E|N|[ ]", InputCaseSensitive:1 }, 
		             {Type:"Text",       Hidden:0,  Width:215,  Align:"Left",    ColMerge:0,   SaveName:prefix+"fm_cnt_nm",       KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Combo",      Hidden:0,  Width:125,  Align:"Center",  ColMerge:0,   SaveName:prefix+"to_cnt_cd",       KeyField:1,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:1,   InsertEdit:1,  EditLen:2, AcceptKeys:"E|N|[ ]", InputCaseSensitive:1 }, 
		             {Type:"Text",       Hidden:0,  Width:215,  Align:"Left",    ColMerge:0,   SaveName:prefix+"to_cnt_nm",       KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		             {Type:"Combo",      Hidden:1,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:prefix+"delt_flg",        KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:1,   InsertEdit:1, ComboText:"No", ComboCode:"N" }  ]; 

		InitColumns(cols);		
		SetEditable(1);
		SetWaitImageVisible(0);
		SetSheetHeight(160);
	}
		break;
		
	case "sheet3":      
		with(sheetObj){		
		var prefix = sheetId +"_";  
		var HeadTitle4="|Charge|Name|C-In/Exclude|T-Country|T-Name|T-Seq|T-ALL CHG|T-EFF fm Dt|T-EFF to Dt|T-VAT Tp|T-VAT Rate(%)|T-In/Exclude|T-Date Tp|T-INV Tp|T-Trade Tp|T-Round Tp|T-Language Charge Rmk|T-CAL SEQ|T-Delete YN";
		SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
		var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		var headers = [ { Text:HeadTitle4, Align:"Center"} ];
		InitHeaders(headers, info);

		var cols = [ {Type:"Status",  Hidden:1,  Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"ibflag"          },
		             {Type:"Text",    Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"chg_cd"          },
		             {Type:"Text",    Hidden:0,  Width:150,  Align:"Left",    ColMerge:0,   SaveName:prefix+"chg_nm"          },  
		             {Type:"Text",    Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"incl_xcld_tp_cd" }, 
		             {Type:"Text",    Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"tax_cnt_cd"      }, 
		             {Type:"Text",    Hidden:0,  Width:120,  Align:"Left",    ColMerge:0,   SaveName:prefix+"cnt_nm"          },  
		             {Type:"Text",    Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"tax_cnt_seq"     },   
		             {Type:"Text",    Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"all_chg_flg"     },
		             {Type:"Text",    Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:prefix+"fm_dt"           },
		             {Type:"Text",    Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:prefix+"to_dt"           },         
		             {Type:"Text",    Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"vat_cd"          },   
		             {Type:"Text",    Hidden:0,  Width:50,   Align:"Right",   ColMerge:0,   SaveName:prefix+"vat_rt"          }, 
		             {Type:"Text",    Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"incl_flg"        },       
		             {Type:"Text",    Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"dt_aply_tp_cd"   },
		             {Type:"Text",    Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"tax_inv_tp_cd"   }, 
		             {Type:"Text",    Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"trd_tp_cd"       },  
		             {Type:"Text",    Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"rnd_tp_cd"       },
		             {Type:"Text",    Hidden:0,  Width:100,  Align:"Left",    ColMerge:0,   SaveName:prefix+"lang_chg_rmk"    }, 
		             {Type:"Text",    Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"calc_seq"        },
		             {Type:"Text",    Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"delt_flg"        }  ]; 
		                  
		
		InitColumns(cols);		
		SetEditable(0);
		SetWaitImageVisible(0);
		SetSheetHeight(160);
	}
		break;
		
	}
}

/** 
 * 조회 저장등 서버 기능을 호출하는 doActionIBSheet <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {IBSheet} sheetObj : 시트오브젝트  
 * @param  {object} formObj : 폼 오브젝트
 * @param  {sAction} sAction : form의 f_cmd에 설정하여 조회/저장등에 사용되는 상수값
 * @return 없음
 * @see #
 * @author HRJ
 * @version 
 */
function doActionIBSheet(sheetObj, formObj, sAction) {
	var formObject = document.form
	

	switch(sAction) {

	case IBSEARCH_ASYNC01: 
		formObj.f_cmd.value = SEARCH01;
		var sXml = sheetObj.GetSearchData("FNS_INV_0125GS.do", FormQueryString(formObj));

		var sStr = ComGetEtcData(sXml,"COUNTRY");
		sStr = " = |" + sStr;
		var arrStr = sStr.split("|");
		makeComboObject2(cnt_cd, arrStr);
		addCellComboItem(sheetObjects[0], sStr, "sheet0_tax_cnt_cd", false);
		addCellComboItem(sheetObjects[2], sStr, "sheet2_fm_cnt_cd", false);
		addCellComboItem(sheetObjects[2], sStr, "sheet2_to_cnt_cd", false);

		sStr = ComGetEtcData(sXml,"CURRENCY");
		sStr = " = |" + sStr;
		arrStr = sStr.split("|");
		addCellComboItem(sheetObjects[0], sStr, "sheet0_tax_curr_cd", false);

		sStr = ComGetEtcData(sXml,"CHARGE");
		sStr = " = |" + sStr;
		arrStr = sStr.split("|");
		addCellComboItem(sheetObjects[1], sStr, "sheet1_chg_cd", false);			

		sStr = ComGetEtcData(sXml,"ADTC");
		addCellComboItem(sheetObjects[0], sStr, "sheet0_dt_aply_tp_cd", false);

		sStr = ComGetEtcData(sXml,"TITC");
		addCellComboItem(sheetObjects[0], sStr, "sheet0_tax_inv_tp_cd", false);

		sStr = ComGetEtcData(sXml,"ITTC");
		addCellComboItem(sheetObjects[0], sStr, "sheet0_trd_tp_cd", false);

		sStr = ComGetEtcData(sXml,"IMF");
		addCellComboItem(sheetObjects[0], sStr, "sheet0_mkg_flg", false);

		sStr = ComGetEtcData(sXml,"IIF");
		addCellComboItem(sheetObjects[0], sStr, "sheet0_incl_flg", false);
		addCellComboItem(sheetObjects[1], sStr, "sheet1_incl_xcld_tp_cd", false);

		sStr = ComGetEtcData(sXml,"VC");
		addCellComboItem(sheetObjects[0], sStr, "sheet0_vat_cd", false);

		sStr = ComGetEtcData(sXml,"CITC");
		addCellComboItem(sheetObjects[0], sStr, "sheet0_cust_inv_tp_cd", false); 			

		sStr = ComGetEtcData(sXml,"ICL");
		sStr = " = |" + sStr;
		arrStr = sStr.split("|");
		addCellComboItem(sheetObjects[0], sStr, "sheet0_lang_chg_rmk", false);
		
		break;

	case IBSEARCH:      //retrieve

		
		formObj.tax_cnt_cd.value = "";
		formObj.tax_cnt_seq.value = "";
		if(!validateForm(sheetObj, formObj, sAction)){
			return;
		}
		formObj.f_cmd.value = SEARCH;				
		ComOpenWait(true);
		var sXml = sheetObj.GetSearchData("FNS_INV_0125GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet0_"));
		sheetObj.LoadSearchData(sXml, {Sync:1} );

		if(sheetObj.RowCount() > 0){
			sheet0_OnClick(sheetObj, 1, 4);
		}
		ComOpenWait(false);
		break;	
		
//*************
	case IBDOWNEXCEL:      //retrieve  DUP & down EXL
		
		if(!validateForm(sheetObj, formObj, sAction)){
			return false;
		}
		formObj.f_cmd.value = SEARCH04;		
		ComOpenWait(true);
		var sXml = sheetObj.GetSearchData("FNS_INV_0125GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet3_"));
		sheetObj.LoadSearchData(sXml, {Sync:1} );

		sheetObj.Down2ExcelBuffer(true);
		if (sheetObj.RowCount()> 0) {
			sheetObj.Down2Excel({KeyFieldMark:false, DownCols: makeHiddenSkipCol(sheetObj), SheetName:"DUP", SheetDesign:1, Merge:1 });
		}
		sheetObj.Down2ExcelBuffer(false);
		ComOpenWait(false);
		break;		

		//*************

	case IBDELETE:
//		if (sheetObjects[1].IsDataModified() || sheetObjects[2].IsDataModified())  {
//			if(!ComShowCodeConfirm("COM130504")) {
//				return ;
//				}
//		}
		break;			

	
	case IBSAVE:        //save
		if(!validateForm(sheetObj, formObj, sAction)) {
			return false ;
		}
		
		if(sheetObj.RowCount() == 0 ) {
			ComShowCodeMessage("COM130104", "Data");
			return;
		}

		var sRow = sheetObj.FindStatusRow("I|U");
		var arRow = sRow.split(";");
		if (sRow != "" && sRow != null) {
			for ( var i = 0; i < arRow.length; i++) {
				var insVal = sheetObj.GetCellValue(arRow[i], "sheet0_tax_cnt_cd") +  
				sheetObj.GetCellValue(arRow[i], "sheet0_fm_dt") +
				sheetObj.GetCellValue(arRow[i], "sheet0_to_dt") +
				sheetObj.GetCellValue(arRow[i], "sheet0_vat_cd") +
				sheetObj.GetCellValue(arRow[i], "sheet0_vat_rt") +
				sheetObj.GetCellValue(arRow[i], "sheet0_tax_inv_tp_cd") +
				sheetObj.GetCellValue(arRow[i], "sheet0_all_chg_flg") +
				sheetObj.GetCellValue(arRow[i], "sheet0_trd_tp_cd") ;

				var insValDt = sheetObj.GetCellValue(arRow[i], "sheet0_tax_cnt_cd") +  
				sheetObj.GetCellValue(arRow[i], "sheet0_vat_cd") +
				sheetObj.GetCellValue(arRow[i], "sheet0_vat_rt") +
				sheetObj.GetCellValue(arRow[i], "sheet0_tax_inv_tp_cd") +
				sheetObj.GetCellValue(arRow[i], "sheet0_all_chg_flg") +
				sheetObj.GetCellValue(arRow[i], "sheet0_trd_tp_cd") ;

				for(var j = 1; j <= sheetObj.RowCount()-1; j++){
					if (arRow[i] == j){
						continue;
					}
					var orgVal = sheetObj.GetCellValue(j, "sheet0_tax_cnt_cd") + 
					sheetObj.GetCellValue(j, "sheet0_fm_dt") +
					sheetObj.GetCellValue(j, "sheet0_to_dt") +
					sheetObj.GetCellValue(j, "sheet0_vat_cd") +
					sheetObj.GetCellValue(j, "sheet0_vat_rt") +
					sheetObj.GetCellValue(j, "sheet0_tax_inv_tp_cd") +
					sheetObj.GetCellValue(j, "sheet0_all_chg_flg") +
					sheetObj.GetCellValue(j, "sheet0_trd_tp_cd") ;
					if(insVal == orgVal) {
						ComShowCodeMessage("COM131302", "Country/EFF fm Dt/EFF to Dt/VAT Tp/VAT Rate(%)/Inv Tp/Trade Tp/All CHG");
						return;
					} else {
						var orgValDt = sheetObj.GetCellValue(j, "sheet0_tax_cnt_cd") + 
						sheetObj.GetCellValue(j, "sheet0_vat_cd") +
						sheetObj.GetCellValue(j, "sheet0_vat_rt") +
						sheetObj.GetCellValue(j, "sheet0_tax_inv_tp_cd") +
						sheetObj.GetCellValue(j, "sheet0_all_chg_flg") +
						sheetObj.GetCellValue(j, "sheet0_trd_tp_cd");
						if(insValDt == orgValDt) {
							if(sheetObj.GetCellValue(arRow[i], "sheet0_fm_dt") <= sheetObj.GetCellValue(j, "sheet0_to_dt")) {
								ComShowCodeMessage("INV00181", "The EFF fm Dt inputted should be bigger than the EFF to Dt of existed Setup Data.");
								return;
							}
						}

					}
				}
			}
		}

//		if (sheetObjects[1].IsDataModified() || sheetObjects[2].IsDataModified())  {
//			if(!ComShowCodeConfirm("COM130504")) {
//				return false;
//			}
//			else {
//				doActionIBSheet(sheetObjects[0], document.form, IBSAVE);
//			}			
//		}
		
		if (!sheetObjects[0].IsDataModified() && !sheetObjects[1].IsDataModified() && !sheetObjects[2].IsDataModified()) {
			return;
		}
		if (sheetObjects[0].IsDataModified() && ComGetSaveString(sheetObjects[0])  == "") {
			return;
		}
		if (sheetObjects[1].IsDataModified() && ComGetSaveString(sheetObjects[1])  == "") {
			return;
		}
		if (sheetObjects[2].IsDataModified() && ComGetSaveString(sheetObjects[2])  == "") {
			return;
		}

	
		ComOpenWait(true);
		formObj.f_cmd.value = MULTI;	
		var sXml = sheetObj.GetSaveData("FNS_INV_0125GS.do", FormQueryString(formObj) + "&" + ComGetSaveString(sheetObjects[0]) + "&" + ComGetSaveString(sheetObjects[1]) + "&" + ComGetSaveString(sheetObjects[2]));

		var sav = ComGetEtcData(sXml, "TRANS_RESULT_KEY");
		if(sav == "S"){
			ComShowCodeMessage("COM130102", "Data");
			doActionIBSheet(sheetObjects[0], formObject, IBSEARCH);
		} else {
			ComShowCodeMessage("COM130103", "Data");
		}
		ComOpenWait(false);
		break;

	case IBINSERT:      // input

		break;
	}
}

/** 
 * 업무 자바스크립트 OnKeyPress 이벤트 처리 (키보드가 눌릴 때)<br>
 * <br><b>Example :</b>
 * <pre>
 * 
 * </pre>
 * @param 없음
 * @return 없음
 * @see #
 * @author 김현화
 * @version 2011.03.04
 */
function obj_keypress(){
	switch(event.srcElement.dataformat){
	case "float":
		//숫자+"."입력하기
		ComKeyOnlyNumber(event.srcElement, ".");
		break;
	case "ymd":
		//숫자+"-"입력하기
		ComKeyOnlyNumber(event.srcElement);
		break;
	case "eng":
		//영문만 입력하기, 영문+숫자 -> ComKeyOnlyAlphabet('num');
		ComKeyOnlyAlphabet();
		break;
	case "engdn":
		//영문 소문자만 입력하기, 영문소+숫자 -> ComKeyOnlyAlphabet('lowernum');
		ComKeyOnlyAlphabet('lower');
		break;
	case "engup":
		//영문 대문자만 입력하기, 영문대+숫자 -> ComKeyOnlyAlphabet('uppernum');
		ComKeyOnlyAlphabet('upper');
		break;
	case "num":
		//숫자만입력하기(정수,날짜,시간)
		ComKeyOnlyNumber('num');
		break;
	case "uppernum":
		//영문대+숫자 
		ComKeyOnlyAlphabet('uppernum');
		break;
	default:
		//영문 대문자만 입력하기, 영문대+숫자 -> ComKeyOnlyAlphabet('uppernum');
		ComKeyOnlyAlphabet('upper');
	}
}

/** 
 * 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  없음  
 * @return 없음
 * @see #
 * @author HRJ
 * @version 
 */
function processButtonClick(){
	/***** Setting each tab's sheet variable. *****/
//	var sheetObject = sheetObjects[0];
//	var sheetObject1 = sheetObjects[1];
//	var sheetObject2 = sheetObjects[2]; 
	/*******************************************************/
	var formObject = document.form;
	try {
		var srcName = ComGetEvent("name");
		switch(srcName) {
		case "btn_Retrieve":

			if (sheetObjects[1].IsDataModified() || sheetObjects[2].IsDataModified())  {
				if(!ComShowCodeConfirm("COM130504")) {
					return false;
					}
				else {
					doActionIBSheet(sheetObjects[0], document.form, IBSAVE);
				}
			}
			
			sheetObjects[1].RemoveAll();
			sheetObjects[2].RemoveAll();
			doActionIBSheet(sheetObjects[0], formObject, IBSEARCH);
			break;

		case "btn_New":
//			if (sheetObjects[1].IsDataModified() || sheetObjects[2].IsDataModified())  {
//				if(!ComShowCodeConfirm("COM130504")) {
//					return false;
//					}
//				else {
//					doActionIBSheet(sheetObjects[0], document.form, IBSAVE);
//				}			
//			}
			
			
			ComResetAll();
			sheetObjects[0].RemoveAll();
			sheetObjects[1].RemoveAll();
			sheetObjects[2].RemoveAll();
			ComBtnDisable("btn_RowAdd1"); 
			ComBtnDisable("btn_Delete1");
			ComBtnDisable("btn_RowAdd2"); 
			ComBtnDisable("btn_Delete2"); 	 
			break;

		case "btn_Save":
			if(!validateForm(sheetObjects[0], formObject, IBSAVE)) {
				return false;
			}	
			doActionIBSheet(sheetObjects[0], document.form, IBSAVE);
	

			if (sheetObjects[1].IsDataModified() || sheetObjects[2].IsDataModified())  {
				if(!ComShowCodeConfirm("COM130504")) {
					return false;
					}
				else {
					doActionIBSheet(sheetObjects[0], document.form, IBSAVE);
				}			
			}
				break;

//**********			
			
		case "btn_RowAdd0":
			if(!validateForm(sheetObjects[0], formObject, IBINSERT)) {
				return false;
			}	

			if (sheetObjects[1].IsDataModified() || sheetObjects[2].IsDataModified())  {
				if(!ComShowCodeConfirm("COM130504")) {
					return false;
					}
				else {
					doActionIBSheet(sheetObjects[0], document.form, IBSAVE);
				}
			}
			
			ComBtnDisable("btn_RowAdd1"); 
			ComBtnDisable("btn_Delete1");
			ComBtnDisable("btn_RowAdd2"); 
			ComBtnDisable("btn_Delete2");
			sheetObjects[1].RemoveAll();
			sheetObjects[2].RemoveAll();
			var idx = sheetObjects[0].DataInsert(-1);
			sheetObjects[0].SetCellValue(idx,"sheet0_delt_flg","N");
			break;

		case "btn_RowAdd1":
				
			var row = sheetObjects[0].GetSelectRow();
			var idx = sheetObjects[1].DataInsert(-1);
			var taxCntCd = sheetObjects[0].GetCellValue(row, "sheet0_tax_cnt_cd");
			var taxCntSeq = sheetObjects[0].GetCellValue(row, "sheet0_tax_cnt_seq");
			sheetObjects[1].SetCellValue(idx, "sheet1_tax_cnt_cd", taxCntCd);
			sheetObjects[1].SetCellValue(idx, "sheet1_tax_cnt_seq", taxCntSeq);
			sheetObjects[1].SetCellValue(idx, "sheet1_delt_flg","N");

			var allChgFlg = sheetObjects[0].GetCellValue(row, "sheet0_all_chg_flg");
			if (allChgFlg == "Y" ) {
				sheetObjects[1].SetColProperty("sheet1_incl_xcld_tp_cd", {ComboText:"Exclude", ComboCode:"E"} );
			} else {
				sheetObjects[1].SetColProperty("sheet1_incl_xcld_tp_cd", {ComboText:"Include|Exclude", ComboCode:"I|E"} );
			}

			break;

		case "btn_RowAdd2":

			var row = sheetObjects[0].GetSelectRow();
			var idx = sheetObjects[2].DataInsert(-1);
			var taxCntCd = sheetObjects[0].GetCellValue(row, "sheet0_tax_cnt_cd");
			var taxCntSeq = sheetObjects[0].GetCellValue(row, "sheet0_tax_cnt_seq");
			sheetObjects[2].SetCellValue(idx,"sheet2_tax_cnt_cd", taxCntCd);
			sheetObjects[2].SetCellValue(idx,"sheet2_tax_cnt_seq", taxCntSeq);
			sheetObjects[2].SetCellValue(idx,"sheet2_delt_flg","N");

			break;

		case "btn_Delete0":
			if(!validateForm(sheetObjects[0], formObject, IBDELETE)) {
				return false;
			}			
			ComRowHideDelete(sheetObjects[0], "sheet0_DelChk");

			break;

		case "btn_Delete1":
			
			if(sheetObjects[1].CheckedRows("sheet1_DelChk") == 0 ) {
				ComShowCodeMessage("INV00025");
				return false;
			}
			if(sheetObjects[1].CheckedRows("sheet1_DelChk") > 0 )  {
				if(ComShowCodeConfirm("INV00028")) {
					ComRowHideDelete(sheetObjects[1], "sheet1_DelChk");
				}
			}	
			break;

		case "btn_Delete2":
			
			if(sheetObjects[2].CheckedRows("sheet2_DelChk") == 0 ) {
				ComShowCodeMessage("INV00025");
				return false;
			}
			if(sheetObjects[2].CheckedRows("sheet2_DelChk") > 0 )  {
				if(ComShowCodeConfirm("INV00028")) {
					ComRowHideDelete(sheetObjects[2], "sheet2_DelChk");
				}
			}	
			break;

		case "btn_DownExcel":
			if (sheetObjects[0].RowCount() < 1){  
				ComShowCodeMessage("COM132501");
				return;
			}
			sheetObjects[0].Down2ExcelBuffer(true);
			if (sheetObjects[0].RowCount()> 0) {
				sheetObjects[0].Down2Excel({KeyFieldMark:false, DownCols: makeHiddenSkipCol(sheetObjects[0]), SheetName:"TAX", SheetDesign:1, Merge:1 });
			}
			if (sheetObjects[1].RowCount()> 0) {
				sheetObjects[1].Down2Excel({KeyFieldMark:false, DownCols: makeHiddenSkipCol(sheetObjects[1]), SheetName:"CHG", SheetDesign:1, Merge:1 });
			}
			if (sheetObjects[2].RowCount()> 0) {
				sheetObjects[2].Down2Excel({KeyFieldMark:false, DownCols: makeHiddenSkipCol(sheetObjects[2]), SheetName:"DOM", SheetDesign:1, Merge:1 });
			}
			sheetObjects[0].Down2ExcelBuffer(false);
			break; 				

//btn_DupCheck			
			
		case "btn_DupCheck":
			doActionIBSheet(sheetObjects[3], formObject, IBDOWNEXCEL);

			if (sheetObjects[3].RowCount() < 1){  
				ComShowCodeMessage("COM132501");
				return;
			}
			break;			
			
			
		} // end switch
	} catch(e) {
		if( e == "[object Error]") {
			ComShowMessage(OBJECT_ERROR);
		} else {
			ComShowMessage(e.message);
		}
	}
}

/**
 * combo object creation
 * @author HRJ
 * @version 
 */
function makeComboObject2(cmbObj, arrStr) {
	cmbObj.InsertItem(0,  " " + "|" + " ", "");  
	for (var i=1; i < arrStr.length; i++ ) {
		var arrStr2 = arrStr[i].split("=");
		var cnt_cd_str = arrStr2[0];
//		var ar_ofc_cd_str = arrStr2[0];
//		var curr_cd_str = arrStr2[0];
//		cmbObj.InsertItem(i-1, ar_ofc_cd_str, arrStr[i]);   
		cmbObj.InsertItem(i, arrStr2[0] + "|" + arrStr2[1], arrStr2[0]);  
	}
	cmbObj.SetDropHeight(190);
}

/** 
 * add data combo field on grid.<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * IBSeet 부문
 * @param  {IBSheet} sheetObj  
 * @param  {object} colName
 * @param  {IBMultiCombo} isCellCombo
 * @return true, false
 * @see #
 * @author HRJ
 * @version 2011.11.13
 */
function addCellComboItem(sheetObj, comboDatas, sComboKey, isCellCombo, isOnlyTextView) {
	var sRow = sheetObj.GetSelectRow();
	var comboTxt = "";
	var comboVal = "";
	var comboItems;
	var comboItem;
	var comboInitTxt ="";
	var comboInitVal ="";
	if (comboDatas != undefined && ComTrim(comboDatas).length > 0) {
		comboItems=comboDatas.split(ROWMARK);
		for (var i=0 ; i < comboItems.length ; i++) {
			comboItem=comboItems[i].split(FIELDMARK);
			//InitDataCombo 메소드를 태울 경우 선택값을 주지 않을 경우
			//Code, Value 가 콤보에 나타나 글자가 밀리는 현상을 방지하기 위함.
			if (!isCellCombo && i == 0) {
				comboInitTxt = comboItem[0];
				comboInitVal = comboItem[0];
			}
			if (ComTrim(comboItem[0]) != "") {
				//Text 만 보여줘야 할 때
				if (isOnlyTextView) {
					comboTxt += comboItem[1];
				}
				//Text 가 '^' 을 구분자로 해서 내려올 때
				else if (comboItem[1].indexOf("\^") != -1) {
					comboTxt += comboItem[1].replace("^", " - ");
				}
				//Text 와 Code 를 둘 다 보여줘야 할 때
				else {
					comboTxt += comboItem[0] + "\t" + comboItem[1];
				}
				comboVal += comboItem[0];
			}
			else {
				comboTxt += " \t ";
				comboVal += " ";
			}
			if (i < comboItems.length-1) {
				comboTxt += ROWMARK;
				comboVal += ROWMARK;
			}				
		}
	}
	else {
		comboTxt += " \t ";
		comboVal += " ";			
	}
	var colName = sComboKey;
	if (isCellCombo) {
		sheetObj.CellComboItem(sRow, colName, {ComboText:comboTxt, ComboCode:comboVal} );
		sheetObj.SetGetCellValue(sRow, colName, "", 0);
	}
	else {
		sheetObj.SetColProperty(colName, {ComboText:comboTxt, ComboCode:comboVal} );
	}
}

/**
 * sheet를 클릭시 발생한다.<br>
 * 체크박스를 언체크 한다.
 * <br><b>Example :</b>
 * <pre>
 *     sheet0_OnClick(sheetObj, Row, Col, value)
 * </pre>
 * @param {ibsheet} sheetObj 필수 IBSheet Object
 * @param {int} Row 
 * @param {int} Col   
 * @param {String} value   
 * @return 없음
 * @author HRJ
 * @version 2009.06.10
 */
function sheet0_OnClick(sheetObj, Row, Col, value) {

	
	var frm = document.form;
	
	var taxCntCd = sheetObj.GetCellValue(Row, "sheet0_tax_cnt_cd");
	var taxCntSeq = sheetObj.GetCellValue(Row, "sheet0_tax_cnt_seq");
	
	if (taxCntSeq !="") {
		ComBtnEnable("btn_RowAdd1");
		ComBtnEnable("btn_Delete1");
		ComBtnEnable("btn_RowAdd2");
		ComBtnEnable("btn_Delete2");
	}else {
		ComBtnDisable("btn_RowAdd1"); 
		ComBtnDisable("btn_Delete1");
		ComBtnDisable("btn_RowAdd2");
		ComBtnDisable("btn_Delete2");
		sheetObjects[1].RemoveAll();
		sheetObjects[2].RemoveAll();
	}
	
	
	if (taxCntCd == "") {
		return;
	}
	
	if (taxCntCd == frm.tax_cnt_cd.value && taxCntSeq == frm.tax_cnt_seq.value) {
		return;
	}

//	if (sheetObjects[1].IsDataModified() || sheetObjects[2].IsDataModified())  {
//		if(!ComShowCodeConfirm("COM130504")) {
//			return false;
//		}
//		else {
//			doActionIBSheet(sheetObjects[0], document.form, IBSAVE);
//		}
//	}

	
	
	sheetObjects[1].RemoveAll();
	sheetObjects[2].RemoveAll();
	sheetObjects[1].SetColProperty("sheet1_incl_xcld_tp_cd", {ComboText:"Include|Exclude", ComboCode:"I|E"} );

	
	
	var trdTpCd = sheetObj.GetCellValue(Row, "sheet0_trd_tp_cd"); 
	if  ( trdTpCd == "D" ) {
		ComBtnEnable("btn_RowAdd2");
		ComBtnEnable("btn_Delete2");
	}else if (trdTpCd != "D" ){
		ComBtnDisable("btn_RowAdd2");
		ComBtnDisable("btn_Delete2");		
	}


	
	frm.f_cmd.value = SEARCH02;
	frm.tax_cnt_cd.value = taxCntCd;
	frm.tax_cnt_seq.value = taxCntSeq;
	var sXml = sheetObjects[1].GetSearchData("FNS_INV_0125GS.do" , FormQueryString(frm) + "&" + ComGetPrefixParam("sheet1_"));   
	sheetObjects[1].LoadSearchData(sXml, {Sync:1});

	frm.f_cmd.value = SEARCH03;
	var sXml = sheetObjects[2].GetSearchData("FNS_INV_0125GS.do" , FormQueryString(frm) + "&" + ComGetPrefixParam("sheet2_"));   
	sheetObjects[2].LoadSearchData(sXml, {Sync:1});
}

/** 
 * 화면 폼입력값에 대한 유효성검증 프로세스 처리하는 validateForm <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {IBSheet} sheetObj : 시트오브젝트  
 * @param  {object} formObj : 폼 오브젝트
 * @param  {sAction} sAction : form의 f_cmd에 설정하여 조회/저장등에 사용되는 상수값
 * @return true, false
 * @see #
 * @author HRJ
 * @version 2009.10.19
 */
function validateForm(sheetObj, formObj, sAction){
	switch (sAction) {

//			case IBSEARCH:
//			}
//			break;
	}
	return true;
}

/** 
 * 업무 자바스크립트 Sheet0의 OnChange 이벤트 처리 <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {IBSheet} sheetObj : 시트오브젝트 
 * @param  {int} Row : 포커스가 위치해 있는 sheet의 Row
 * @param  {int} Col : 포커스가 위치해 있는 sheet의 Col 
 * @return 없음
 */
function sheet0_OnChange(sheetObj, Row, Col, Value, OldValue){

	var colNm = sheetObjects[0].ColSaveName(Col);

	if (colNm == "sheet0_tax_cnt_cd") {
		var sText = sheetObj.GetComboInfo(Row, Col, "Text");
		var arrText = sText.split("|");
		var idx = sheetObj.GetComboInfo(Row, Col, "SelectedIndex");
		var vText = arrText[idx].split("\t");
		sheetObj.SetCellValue(Row, "sheet0_cnt_nm", vText[1]);

	}

	
	if (colNm == "sheet0_to_dt") { 		
		var fmDt = ComGetUnMaskedValue(sheetObj.GetCellValue(Row, "sheet0_fm_dt"), "ymd");
		var toDt = ComGetUnMaskedValue(sheetObj.GetCellValue(Row, "sheet0_to_dt"), "ymd");
		if (ComChkPeriod(fmDt, toDt) <= 0) {
			ComShowCodeMessage("COM132002");
			sheetObj.SetCellValue(Row, "sheet0_to_dt", "", 0);
			return ;
		}
	}

	if (colNm == "sheet0_all_chg_flg" && Value == "Y" ) {
		var existInclude = false; 			
		for (var i = 1; i <= sheetObjects[1].RowCount()+1; i++){
			var inChk = sheetObjects[1].GetCellValue(i, "sheet1_incl_xcld_tp_cd");
			if(inChk == "I") {
				existInclude = true;
				break;
			}
		}
		if (existInclude) {
			ComShowCodeMessage("INV00178");	
			sheetObjects[0].SetCellValue(Row, "sheet0_all_chg_flg", "N", 0);
			return;
		}
	}

	if (colNm == "sheet0_trd_tp_cd") {
		if (Value == "D") {
			ComBtnEnable("btn_RowAdd2");
			ComBtnEnable("btn_Delete2");
		}else if(Value != "D") {
			ComBtnDisable("btn_RowAdd2");
			ComBtnDisable("btn_Delete2");
		}
	}

	if (colNm == "sheet0_trd_tp_cd" && Value != "D" ) {
		for (var i = 1; i <= sheetObjects[2].LastRow(1); i++){
			var inChk = sheetObjects[2].GetCellValue(i, "sheet2_tax_cnt_cd");

			if(inChk != " ") {
				ComShowCodeMessage("INV00179");	
				sheetObjects[0].SetCellValue(Row, "sheet0_trd_tp_cd", "D");
				return;	
			}
		}
	}
}
	
	/** 
	 * 업무 자바스크립트 Sheet1의 OnChange 이벤트 처리 <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj : 시트오브젝트 
	 * @param  {int} Row : 포커스가 위치해 있는 sheet의 Row
	 * @param  {int} Col : 포커스가 위치해 있는 sheet의 Col 
	 * @return 없음
	 */
	function sheet1_OnChange(sheetObj, Row, Col){
		if((sheetObj.GetCellValue(Row, "sheet1_chg_cd") != ""  && sheetObj.GetCellValue(Row, "sheet1_chg_cd") != null) 
				&& (sheetObj.GetCellValue(Row, "sheet1_incl_xcld_tp_cd") != "" && sheetObj.GetCellValue(Row, "sheet1_incl_xcld_tp_cd") != null)){
			var insVal = sheetObj.GetCellValue(Row, "sheet1_chg_cd") + sheetObj.GetCellValue(Row, "sheet1_incl_xcld_tp_cd");
			for(var i=1; i <= sheetObj.RowCount()+1; i++){
				if(i == Row) {
					continue;
				}
				var orgVal = sheetObj.GetCellValue(i, "sheet1_chg_cd") + sheetObj.GetCellValue(i, "sheet1_incl_xcld_tp_cd");
				if(insVal == orgVal) {
					ComShowCodeMessage("COM131302", "Charge Code and Include/Exclude");
					return;
				}
			}
		}


		
		var colNm = sheetObjects[1].ColSaveName(Col);

		if (colNm == "sheet1_chg_cd") {
			var sText = sheetObj.GetComboInfo(Row, Col, "Text");
			var arrText = sText.split("|");
			var idx = sheetObj.GetComboInfo(Row, Col, "SelectedIndex");
			var vText = arrText[idx].split("\t");
			sheetObj.SetCellValue(Row, "sheet1_chg_nm", vText[1]);
		}

	}  

	/** 
	 * 업무 자바스크립트 Sheet2의 OnChange 이벤트 처리 <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj : 시트오브젝트 
	 * @param  {int} Row : 포커스가 위치해 있는 sheet의 Row
	 * @param  {int} Col : 포커스가 위치해 있는 sheet의 Col 
	 * @return 없음
	 */
	function sheet2_OnChange(sheetObj, Row, Col){
		if((sheetObj.GetCellValue(Row, "sheet2_fm_cnt_cd") != ""  && sheetObj.GetCellValue(Row, "sheet2_fm_cnt_cd") != null) 
				&& (sheetObj.GetCellValue(Row, "sheet2_to_cnt_cd") != "" && sheetObj.GetCellValue(Row, "sheet2_to_cnt_cd") != null)){
			var insVal = sheetObj.GetCellValue(Row, "sheet2_fm_cnt_cd") + sheetObj.GetCellValue(Row, "sheet2_to_cnt_cd");
			for(var i=1; i <= sheetObj.RowCount()+1; i++){
				if(i == Row) {
					continue;
				}
				var orgVal = sheetObj.GetCellValue(i, "sheet2_fm_cnt_cd") + sheetObj.GetCellValue(i, "sheet2_to_cnt_cd");
				if(insVal == orgVal) {
					ComShowCodeMessage("COM131302", "FM/TO Country Code");
					return;
				}
			}
		}

		var colNm = sheetObjects[2].ColSaveName(Col);

		if (colNm == "sheet2_fm_cnt_cd") {
			var sText = sheetObj.GetComboInfo(Row, Col, "Text");
			var arrText = sText.split("|");
			var idx = sheetObj.GetComboInfo(Row, Col, "SelectedIndex");
			var vText = arrText[idx].split("\t");
			sheetObj.SetCellValue(Row, "sheet2_fm_cnt_nm", vText[1]);
		} 
		else if	(colNm == "sheet2_to_cnt_cd") {
			var sText = sheetObj.GetComboInfo(Row, Col, "Text");
			var arrText = sText.split("|");
			var idx = sheetObj.GetComboInfo(Row, Col, "SelectedIndex");
			var vText = arrText[idx].split("\t");
			sheetObj.SetCellValue(Row, "sheet2_to_cnt_nm", vText[1]);
		} 
	}   	   

	function resizeSheet(){
		ComResizeSheet(sheetObjects[0], 220);
	}
