/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : DOU_TRAINING_0003.js
*@FileTitle : Invoice Management
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.25
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.25 
* 1.0 Creation
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/

/*------------------다음 코드는 JSDoc을 잘 만들기 위해서 추가된 코드임 ------------------*/
   /**
     * @fileoverview 업무에서 공통으로 사용하는 자바스크립트파일로 달력 관련 함수가 정의되어 있다.
     * @author 한진해운
     */

    /**
     * @extends 
     * @class DOU_TRAINING_0003 : DOU_TRAINING_0003 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
     */

var IBSEARCH02 = 14;
var IBNEW = 15;
var IBDOWNEXCEL2 = 16;

var sheetObjects = new Array();
var sheetCnt = 0;
document.onclick = processButtonClick;


    
// Functions that calls a common function that sets the default settings of the sheet.
// It is the first called area when fire jsp onload event
function loadPage(){
	for(var i=0; i<comboObjects.length; i++){
		initCombo(comboObjects[i], i+1);
	}
	
	for(var i=0; i<tabObjects.length; i++){
		initTab(tabObjects[i], i+1);
		tabObjects[i].SetSelectedIndex(0);
		tab1_OnClick(tabObjects[i], 0);
	}
	
	for(var i=0; i<sheetObjects.length; i++){
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i+1);
		ComEndConfigSheet(sheetObjects[i]);
	}
	
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
	doActionIBSheet(sheetObjects[1], document.form, IBSEARCH02);
	document.getElementById('dt_fm').disabled = true;
	document.getElementById('dt_to').disabled = true;
//	initControl();
	
	initDateTime("dt_fm", "dt_to");	
	
	lane.SetEnable(false);
	trade.SetEnable(false);
}

// Functions for branching to the corresponding logic when a button on the screen is pressed
function processButtonClick(){
	var sheetObject1 = sheetObjects[0];
	var sheetObject2 = sheetObjects[1];
	var formObject = document.form;

	try{
		// Get name or id of object where the event appears
		var srcName = ComGetEvent("name");
		switch(srcName){
			case "btn_Pre_Month_Fm":
				year_month_fm_preMonth("dt_fm", "dt_to");
				break;
			case "btn_Next_Month_Fm":
				year_month_fm_nextMonth("dt_fm", "dt_to");
				break;
			case "btn_Pre_Month_To":
				year_month_to_preMonth("dt_fm", "dt_to");
				break;
			case "btn_Next_Month_To":
				year_month_to_nextMonth("dt_fm", "dt_to");
				break;
			case "btn_Retrieve":
				if(!validateMandatoryItems())
					return;
				validateYearMonth("dt_fm", "dt_to");
				doActionIBSheet(sheetObject1, formObject, IBSEARCH);
				doActionIBSheet(sheetObject2, formObject, IBSEARCH02);
				break;
			case "btn_New":
				doActionIBSheet(sheetObject1, formObject, IBNEW);
				break;
			case "btn_DownExcel":
				sheetObject1.Down2ExcelBuffer(true);
				doActionIBSheet(sheetObject1, formObject, IBDOWNEXCEL);
				doActionIBSheet(sheetObject2, formObject, IBDOWNEXCEL);
				sheetObject1.Down2ExcelBuffer(false);
				break;
			case "btn_DownExcel2":
				doActionIBSheet(sheetObject1, formObject, IBDOWNEXCEL2);
				break;
			default:
				break;
		}
	}
	catch(e) {
		if(e == "[object Error]") {
			ComShowMessage(OBJECT_ERROR);
		} else {
			ComShowMessage(e);
		}
	}
}

//Put sheet objects in global variable "sheetObjects"
function setSheetObject(sheet_obj){
	sheetObjects[sheetCnt++] = sheet_obj;
}

// Functions that define the basic properties of the sheet on the screen, for example Column information, sheet basic attributes, etc.
function initSheet(sheetObj, sheetNo){
	with(sheetObj){
		switch(sheetNo){
			case 1:
				SetConfig( {SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:0});
				
				var headTitle1 ="|Partner|Lane|Invoice No|Slip No|Approved|Curr.|Revenue|Expense|Customer/S.Provider|Customer/S.Provider";
				var headTitle2 ="|Partner|Lane|Invoice No|Slip No|Approved|Curr.|Revenue|Expense|Code|Name";
				var headers = [{Text:headTitle1, Align:"Center"},
				               {Text:headTitle2, Align:"Center"}];
				var info ={Sort:1, ColMove:1, ColResize:1, HeaderCheck:0};
				InitHeaders(headers, info);
				
				var prefix="sheet1_";
				
				var cols = [{Type:"Status", Hidden:1, Width:30, Align:"Center", ColMerge:0, SaveName: prefix+"ibflag", UpdateEdit: 0, InsertEdit: 0},
							{Type:"Text", Hidden:0, Width:100, Align:"Center", ColMerge:0, SaveName: prefix+"jo_crr_cd", UpdateEdit: 0, InsertEdit: 0},
							{Type:"Text", Hidden:0, Width:100, Align:"Center", ColMerge:0, SaveName: prefix+"rlane_cd", UpdateEdit: 0, InsertEdit: 0},
							{Type:"Text", Hidden:0, Width:200, Align:"Left", ColMerge:0, SaveName: prefix+"inv_no", UpdateEdit: 0, InsertEdit: 0},
							{Type:"Text", Hidden:0, Width:200, Align:"Left", ColMerge:0, SaveName: prefix+"csr_no", UpdateEdit: 0, InsertEdit: 0},
							{Type:"Text", Hidden:0, Width:100, Align:"Center", ColMerge:0, SaveName: prefix+"apro_flg", UpdateEdit: 0, InsertEdit: 0},
							{Type:"Text", Hidden:0, Width:100, Align:"Center", ColMerge:0, SaveName: prefix+"locl_curr_cd", UpdateEdit: 0, InsertEdit: 0},
							{Type:"Text", Hidden:0, Width:200, Align:"Right", ColMerge:0, SaveName: prefix+"inv_rev_act_amt", UpdateEdit: 0, InsertEdit: 0},
							{Type:"Text", Hidden:0, Width:200, Align:"Right", ColMerge:0, SaveName: prefix+"inv_exp_act_amt", UpdateEdit: 0, InsertEdit: 0},
							{Type:"Text", Hidden:0, Width:200, Align:"Left", ColMerge:0, SaveName: prefix+"cust_vndr_cnt_cd", UpdateEdit: 0, InsertEdit: 0},
							{Type:"Text", Hidden:0, Align:"Left", ColMerge:0, SaveName: prefix+"cust_vndr_seq", UpdateEdit: 0, InsertEdit: 0}];
				InitColumns(cols);
				
				SetWaitImageVisible(0);
				SetAutoSumPosition(1);
				ComResizeSheet(sheetObjects[0]);	
				break;
			case 2:
				SetConfig( {SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:0});
				
				var headTitle1 ="|Partner|Lane|Invoice No|Slip No|Approved|Rev/Exp|Item|Curr.|Revenue|Expense|Customer/S.Provider|Customer/S.Provider";
				var headTitle2 ="|Partner|Lane|Invoice No|Slip No|Approved|Rev/Exp|Item|Curr.|Revenue|Expense|Code|Name";
				var headers = [{Text:headTitle1, Align:"Center"},
				               {Text:headTitle2, Align:"Center"}];
				var info ={Sort:1, ColMove:1, ColResize:1, HeaderCheck:0};
				InitHeaders(headers, info);
				
				var prefix="sheet2_";
				
				var cols = [{Type:"Status", Hidden:1, Width:30, Align:"Center", ColMerge:0, SaveName: prefix+"ibflag", UpdateEdit: 0, InsertEdit: 0},
							{Type:"Text", Hidden:0, Width:100, Align:"Center", ColMerge:0, SaveName: prefix+"jo_crr_cd", UpdateEdit: 0, InsertEdit: 0},
							{Type:"Text", Hidden:0, Width:100, Align:"Center", ColMerge:0, SaveName: prefix+"rlane_cd", UpdateEdit: 0, InsertEdit: 0},
							{Type:"Text", Hidden:0, Width:200, Align:"Left", ColMerge:0, SaveName: prefix+"inv_no", UpdateEdit: 0, InsertEdit: 0},
							{Type:"Text", Hidden:0, Width:200, Align:"Left", ColMerge:0, SaveName: prefix+"csr_no", UpdateEdit: 0, InsertEdit: 0},
							{Type:"Text", Hidden:0, Width:100, Align:"Center", ColMerge:0, SaveName: prefix+"apro_flg", UpdateEdit: 0, InsertEdit: 0},
							{Type:"Combo", Hidden:0, Width:200, Align:"Center", ColMerge:0, SaveName: prefix+"rev_exp", UpdateEdit: 0, InsertEdit: 0, ComboText:"Rev|Exp", ComboCode: "R|E"},
							{Type:"Text", Hidden:0, Width:100, Align:"Center", ColMerge:0, SaveName: prefix+"item", UpdateEdit: 0, InsertEdit: 0},
							{Type:"Text", Hidden:0, Width:100, Align:"Center", ColMerge:0, SaveName: prefix+"locl_curr_cd", UpdateEdit: 0, InsertEdit: 0},
							{Type:"Text", Hidden:0, Width:200, Align:"Right", ColMerge:0, SaveName: prefix+"inv_rev_act_amt", UpdateEdit: 0, InsertEdit: 0},
							{Type:"Text", Hidden:0, Width:200, Align:"Right", ColMerge:0, SaveName: prefix+"inv_exp_act_amt", UpdateEdit: 0, InsertEdit: 0},
							{Type:"Text", Hidden:0, Width:100, Align:"Left", ColMerge:0, SaveName: prefix+"cust_vndr_cnt_cd", UpdateEdit: 0, InsertEdit: 0},
							{Type:"Text", Hidden:0, Align:"Left", ColMerge:0, SaveName: prefix+"cust_vndr_seq", UpdateEdit: 0, InsertEdit: 0}];
				InitColumns(cols);
				
				SetWaitImageVisible(0);
				ComResizeSheet(sheetObjects[1]);
				SetAutoSumPosition(1);
				SetSheetHeight(750)
				break;
			case 3:
				SetWaitImageVisible(0);
				break;
		}
		
	}
}

// Functions that define transaction logic between UI and server
function doActionIBSheet(sheetObj, formObj, sAction){
	with(sheetObj)
	{
		switch(sAction) {
			case IBSEARCH:
				ComOpenWait(true);
				formObj.f_cmd.value = SEARCH01;
				var arr1=new Array("sheet1_");
	        	var sParam1=FormQueryString(formObj)+ "&" + ComGetPrefixParam(arr1);
	        	DoSearch("DOU_TRAINING_0003GS.do", sParam1);
				break;
			case IBSEARCH02:
				formObj.f_cmd.value = SEARCH02;
				var arr2=new Array("sheet2_");
	        	var sParam2=FormQueryString(formObj)+ "&" + ComGetPrefixParam(arr2);
	        	DoSearch("DOU_TRAINING_0003GS.do", sParam2);
				break;
			case IBNEW:
				RemoveAll();
				resetCondition();
				break;
			case IBDOWNEXCEL:
				if(RowCount() < 1)
				{
					alert("Can't download Excel file because there are no data in it.");
					break;
				}
				var sheetName = '';
				switch(sheetObj.id){
					case 'sheet1':
						sheetName = "Summary";
						break;
					case 'sheet2':
						sheetName = "Details";
						break;
				}
				Down2Excel({FileName: "Invoice_Carrier", SheetName: sheetName, SheetDesign:1, OnlyHeaderMerge: 1, Merge: 1, HiddenColumn: 1});
				break;
			case IBDOWNEXCEL2:
				if(RowCount() < 1)
				{
					alert("Can't download Excel file because there are no data in it.");
					break;
				}
//				formObj.f_cmd.value = SEARCH01;
//				var arr3=new Array("sheet1_");
//	        	var sParam3=FormQueryString(formObj)+ "&" + ComGetPrefixParam(arr3);
//	        	
//				var xml= {URL:"DOU_TRAINING_0003GS.do"
//					,ExtendParam:sParam3
//					,FileName:"Invoice_Carrier_Summary_02.xls"};
//				console.log(xml);
//				DirectDown2Excel(xml);
				break;
		}
	}
}

function sheet1_OnSearchEnd(Code, Msg, StCode, StMsg) {
	ComOpenWait(false);
	var totalRows = sheet1.RowCount();
	for(var i = 1; i <= totalRows+1; i++){
		if(sheet1.GetCellValue(i, master_invoice_enum.partner) == ''){
			if(sheet1.GetCellValue(i, master_invoice_enum.invoice_no) != '')
			{
				sheet1.SetRowFontColor(i, "#cc2900");
				sheet1.SetCellValue(i, master_invoice_enum.invoice_no, "");
				sheet1.SetRangeFontBold(i, master_invoice_enum.partner, i, master_invoice_enum.name, 1);
			}
			else if(sheet1.GetCellValue(i, master_invoice_enum.revenue) != '')
			{
				sheet1.SetCellFont("FontBold", i,1,i,10,1) ;
				sheet1.SetRowBackColor(i,"#ffe6cc");
			}
		}
	}
}

function sheet2_OnSearchEnd(Code, Msg, StCode, StMsg) {
	ComOpenWait(false);
	var totalRows = sheet2.RowCount();
	for(var i = 1; i <= totalRows+1; i++){
		if(sheet2.GetCellValue(i, detail_invoice_enum.partner) == ''){
			if(sheet2.GetCellValue(i, detail_invoice_enum.invoice_no) != '')
			{
				sheet2.SetRowFontColor(i, "#cc2900");
				sheet2.SetCellValue(i, detail_invoice_enum.invoice_no, "");
				sheet2.SetRangeFontBold(i, detail_invoice_enum.partner, i, detail_invoice_enum.name, 1);
			}
			else if(sheet2.GetCellValue(i, detail_invoice_enum.revenue) != '')
			{
				sheet2.SetCellFont("FontBold", i,1,i,10,1) ;
				sheet2.SetRowBackColor(i,"#ffe6cc");
			}
		}
	}
}

function sheet1_OnDblClick(Row, Col, CellX, CellY, CellW, CellH){
	setSelectRowToOtherSheet(sheetObjects[0], sheetObjects[1], Col, 0, 2);
	tab1.SetSelectedIndex(1);
	showTabData(1);
	console.log(sheet1.GetCellValue(Col, CellX));
}

function sheet2_OnDblClick(Row, Col, CellX, CellY, CellW, CellH){
	setSelectRowToOtherSheet(sheetObjects[1], sheetObjects[0], Col, 2, 0);
	tab1.SetSelectedIndex(0);
	showTabData(0);
}

function setSelectRowToOtherSheet(sheetFm, sheetTo, Row, GapFm, GapTo){
	var datarowSheet1 = {partner: sheetFm.GetCellValue(Row, 1),
		lane: sheetFm.GetCellValue(Row, 2),
		invoice_no: sheetFm.GetCellValue(Row, 3),
		slip_no: sheetFm.GetCellValue(Row, 4),
		approved: sheetFm.GetCellValue(Row, 5),
		curr: sheetFm.GetCellValue(Row, GapFm + 6),
		revenue: sheetFm.GetCellValue(Row, GapFm + 7),
		// expense: sheetFm.GetCellValue(Row, GapFm + 8),
		c_code: sheetFm.GetCellValue(Row, GapFm + 9),
		c_name: sheetFm.GetCellValue(Row, GapFm + 10)};

	var indexSelected = -1;

	for(var i = 1; i<sheetTo.SearchRows()+1; i++){
		var partnerIndex = sheetTo.FindText(1, datarowSheet1.partner, i);
		if(partnerIndex != -1){
			i = partnerIndex;
			laneIndex = sheetTo.FindText(2, datarowSheet1.lane, i);
			if(partnerIndex == laneIndex){
				invoiceIndex = sheetTo.FindText(3, datarowSheet1.invoice_no, i);
				if(invoiceIndex == laneIndex){
					slipIndex = sheetTo.FindText(4, datarowSheet1.slip_no, i);
					if(slipIndex == invoiceIndex){
						approvedIndex = sheetTo.FindText(5, datarowSheet1.approved, i);
						if(approvedIndex == slipIndex){
							currIndex = sheetTo.FindText(GapTo + 6, datarowSheet1.curr, i);
							if(currIndex == approvedIndex){
								revenueIndex = sheetTo.FindText(GapTo + 7, datarowSheet1.revenue, i);
								if(revenueIndex == currIndex){
									// expenseIndex = sheetTo.FindText(GapTo + 8, datarowSheet1.expense, i);
									// if(expenseIndex == revenueIndex){
										cCodeIndex = sheetTo.FindText(GapTo + 9, datarowSheet1.c_code, i);
										if(cCodeIndex == revenueIndex){
											cNameIndex = sheetTo.FindText(GapTo + 10, datarowSheet1.c_name, i);
											if(cNameIndex == cCodeIndex){
												indexSelected = i;
												break;
											}
										}
									// }
								}
							}
						}
					}
				}
			}
		}
	}
	sheetTo.SetSelectRow(indexSelected);
}


function validateMandatoryItems(){
	if(document.form.partner.value == null || document.form.partner.value == '' || typeof document.form.partner.value == 'undefined'){
		ComShowCodeMessage('INV10001');
		return false;
	}
	if(document.form.lane.value == null || document.form.lane.value == '' || typeof document.form.lane.value == 'undefined'){
		ComShowCodeMessage('INV10002');
		return false;
	}
	if(document.form.trade.value == null || typeof document.form.trade.value == 'undefined'){
		ComShowCodeMessage('INV10003');
		return false;
	}
	return true;
}

function initControl(){
	var formObject = document.form;
	initPeriod();
}

function DOU_TRAINING_0003() {
	this.processButtonClick		= processButtonClick;
	this.setSheetObject 		= setSheetObject;
	this.loadPage 				= loadPage;
	this.initSheet 				= initSheet;
	this.doActionIBSheet 		= doActionIBSheet;
	this.setTabObject 			= setTabObject;
	this.validateForm 			= validateForm;
}

/* 개발자 작업	*/


/* 개발자 작업  끝 */