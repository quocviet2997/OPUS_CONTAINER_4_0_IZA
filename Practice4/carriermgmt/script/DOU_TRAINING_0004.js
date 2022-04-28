/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : DOU_TRAINING_0004.js
*@FileTitle : Carrier List
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.23
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.23 
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
     * @class DOU_TRAINING_0004 : DOU_TRAINING_0004 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
     */

var sheetObjects = new Array();
var sheetCnt = 0;
var comboObjects = new Array();
var comboCnt = 0;
document.onclick = processButtonClick;

function loadPage(){
	// Generate Grid Layout
	for(i=0; i<sheetObjects.length; i++){
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i+1);
		ComEndConfigSheet(sheetObjects[i]);
		doActionIBSheet(sheetObjects[i], document.form, IBSEARCH);
	}
	
	for(i=0; i<comboObjects.length; i++){
		initCombo(comboObjects[i], i+1);
	}
}

// Functions for branching to the corresponding logic when a button on the screen is pressed
function processButtonClick(){
	var sheetObject1 = sheetObjects[0];
	var formObject = document.form;

	try{
		var srcName = ComGetEvent("name");
		switch(srcName){
			case "btn_Retrieve":
				doActionIBSheet(sheetObject1, formObject, IBSEARCH);
				break;
			case "btn_New":
				sheetObject1.RemoveAll();
				document.getElementById('DIV_sheet1').style.display = "none";
				break;
			case "btn_Save":
				doActionIBSheet(sheetObject1, formObject, IBSAVE);
				break;
			case "btn_DownExcel":
				doActionIBSheet(sheetObject1, formObject, IBDOWNEXCEL);
				break;
			case "btn_Add":
				doActionIBSheet(sheetObject1, formObject, IBINSERT);
				break;
			case "btn_Del":
				doActionIBSheet(sheetObject1, formObject, IBDELETE);
				break;
			case "btn_calendar_fm":
			case "btn_calendar_to":
                var cal=new ComCalendar();
                if(srcName == "btn_calendar_fm"){
                	console.log(formObject.cre_dt_fm);
                	cal.select(formObject.cre_dt_fm, 'yyyy-MM-dd');
                }else{
                    cal.select(formObject.cre_dt_to, 'yyyy-MM-dd');
                }
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

//Put combo objects in global variable "comboObjects"
function setComboObject(combo_obj) {
	comboObjects[comboCnt++] = combo_obj;
}

// Functions that define the basic properties of the sheet on the screen, for example Column information, sheet basic attributes, etc.
function initSheet(sheetObj, sheetNo){
	with(sheetObj){
		SetConfig( {SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:0});
		
		var headTitle ="|Chk|Carrier|Rev.Lane|Vendor Code|Customer Code|Customer Code|Trade|Delete Flag|Create Date|Create User ID|Update Date|Update User ID";
		var headers = [{Text:headTitle, Align:"Center"}];
		var info ={Sort:1, ColMove:1, ColResize:1, HeaderCheck:0};
		InitHeaders(headers, info);
		
		var cols = [{Type:"Status", Hidden:1, Width:30, Align:"Center", ColMerge:0, SaveName:"ibflag"},
					{Type:"DelCheck", Hidden:0, Width:30, Align:"Center", ColMerge:0, SaveName:"chk", KeyField:0},
					{Type:"Text", Hidden:0, Width:100, Align:"Center", ColMerge:0, SaveName:"jo_crr_cd", KeyField:1, UpdateEdit:0, InsertEdit:1, EditLen:3},
//					{Type:"Text", Hidden:0, Width:100, Align:"Center", ColMerge:0, SaveName:"rlane_cd", KeyField:1, UpdateEdit:1, InsertEdit:1, EditLen:5},
		            {Type:"Combo", Hidden:0, Width:100, Align:"Center", ColMerge:0, SaveName:"rlane_cd", KeyField:1, UpdateEdit:1, InsertEdit:1, EditLen:5, ComboText: rLaneCombo, ComboCode: rLaneCombo}, 
					{Type:"Float", Hidden:0, Width:100, Align:"Center", ColMerge:0, SaveName:"vndr_seq", KeyField:1, UpdateEdit:1, InsertEdit:1, EditLen:6},
					{Type:"Text", Hidden:0, Width:50, Align:"Center", ColMerge:0, SaveName:"cust_cnt_cd", KeyField:1, UpdateEdit:1, InsertEdit:1, EditLen:2},
					{Type:"Float", Hidden:0, Width:100, Align:"Center", ColMerge:0, SaveName:"cust_seq", KeyField:1, UpdateEdit:1, InsertEdit:1, EditLen:6},
					{Type:"Text", Hidden:0, Width:100, Align:"Center", ColMerge:0, SaveName:"trd_cd", KeyField:0, UpdateEdit:1, InsertEdit:1, EditLen:3},
					{Type:"Text", Hidden:0, Width:80, Align:"Center", ColMerge:0, SaveName:"delt_flg", KeyField:0, UpdateEdit:1, InsertEdit:0, EditLen:1},
					{Type:"Text", Hidden:0, Width:300, Align:"Center", ColMerge:0, SaveName:"cre_dt", KeyField:0, UpdateEdit:0, InsertEdit:0},
					{Type:"Text", Hidden:0, Width:300, Align:"Center", ColMerge:0, SaveName:"cre_usr_id", KeyField:0, UpdateEdit:0, InsertEdit:0},
					{Type:"Text", Hidden:0, Width:300, Align:"Center", ColMerge:0, SaveName:"upd_dt", KeyField:0, UpdateEdit:0, InsertEdit:0},
					{Type:"Text", Hidden:0, Width:300, Align:"Center", ColMerge:0, SaveName:"upd_usr_id", KeyField:0, UpdateEdit:0, InsertEdit:0}];
		InitColumns(cols);

		SetWaitImageVisible(0);
		ComResizeSheet(sheetObjects[0]);	
	}
}



function initCombo(comboObj, comboNo){
	if(comboNo == 1)
	{
		comboObj.SetMultiSelect(1);
		comboObj.SetDropHeight(210);
		var comboItems = carrierCombo.split('|');
		for(i=0; i<comboItems.length; i++){
			comboObj.InsertItem(i, comboItems[i], comboItems[i]);
		}
		comboObj.SetItemCheck(0,1);
	}
}

// Functions that define transaction logic between UI and server
function doActionIBSheet(sheetObj, formObj, sAction){
	with(sheetObj)
	{
		switch(sAction) {
			case IBSEARCH:
				if(document.getElementById('DIV_'+sheetObj.id).style.display == 'none'){
					document.getElementById('DIV_'+sheetObj.id).style.display = 'block';
				}
				formObj.f_cmd.value = SEARCH;
				DoSearch("DOU_TRAINING_0004GS.do", FormQueryString(formObj));
				break;
			case IBSAVE:
				formObj.f_cmd.value = MULTI;
				DoSave("DOU_TRAINING_0004GS.do", FormQueryString(formObj));
				break;
			case IBINSERT:
				DataInsert();
				break;
			case IBDELETE:
				var cbValue = GetCellValue(GetSelectRow(), 1);
				if(cbValue == 0){
					SetCellValue(GetSelectRow(), 1, 1);
				}
				if(cbValue == 1){
					SetCellValue(GetSelectRow(), 1, 0);
				}
				break;
			case IBDOWNEXCEL:
				if(RowCount() < 1)
				{
					alert("Can't download Excel file because there are no data in it.");
					break;
				}
				Down2Excel({FileName:"Error_Message", SheetName:"Sheet1", SheetDesign:1, DownCols:"2|3|4|5|6"});
				break;
		}
	}
}

function sheet1_OnDblClick(Row, Col, CellX, CellY, CellW, CellH) {
	//Set to move to another page when a row is double-clicked
	console.log(Row+' '+ Col);
}

function jo_crr_cd_OnCheckClick(comboObj, index, code) {
	if(code == 'ALL' && comboObj.GetItemCheck(index) == 1){
		for(i = 0; i<comboObj.GetItemCount(); i++){
			if(i != index){
				if(comboObj.GetItemCheck(i) == 1){
					comboObj.SetSelectIndex(-1, true);
					break;
				}
			}
		}
		comboObj.SetItemCheck(0,1);
	}
	else{
		comboObj.SetItemCheck(0,0);
	}
}

function DOU_TRAINING_0004() {
	this.processButtonClick		= tprocessButtonClick;
	this.setSheetObject 		= setSheetObject;
	this.loadPage 				= loadPage;
	this.initSheet 				= initSheet;
	this.initControl            = initControl;
	this.doActionIBSheet 		= doActionIBSheet;
	this.setTabObject 			= setTabObject;
	this.validateForm 			= validateForm;
}
    
   	/* 개발자 작업	*/


	/* 개발자 작업  끝 */