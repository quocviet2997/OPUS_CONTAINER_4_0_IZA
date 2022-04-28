/*=========================================================
*Copyright(c) 2020 CyberLogitec
*@FileName : SINHVIEN.js
*@FileTitle : Sinh Vien
*Open Issues :
*Change history :
*@LastModifyDate : 2020.03.18
*@LastModifier : 
*@LastVersion : 1.0
* 2020.03.18 
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
     * @class SINHVIEN : SINHVIEN 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
     */
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects = new Array();
var comboCnt = 0;
var comboValues = "";
var tabObjects=new Array();
var tabCnt=0 ;
var beforetab=1;
document.onclick=processButtonClick;

function processButtonClick() {
	/** *** setting sheet object **** */
	var sheetObject1 = sheetObjects[0];
	/** **************************************************** */
	var formObj = document.form;
	try {
		var srcName = ComGetEvent("name");
		if (srcName == null) {
			return;
		}
		switch (srcName) {
			case "btn_Retrieve":
				doActionIBSheet(sheetObject1, formObj, IBSEARCH);
				break;
			case "btn_Save":
				doActionIBSheet(sheetObject1, formObj, IBSAVE);
				break;
			case "btn_RowDelete":
				doActionIBSheet(sheetObject1, formObj, IBDELETE);
				break;
			case "btn_RowAdd":
				doActionIBSheet(sheetObject1, formObj, IBINSERT);
				break;
			default :
				break;}
	} catch (e) {
		if (e == "[object Error]") {
			ComShowCodeMessage('JOO00001');
		} else {
			ComShowMessage(e.message);
		}
	}
}

function loadPage(){
	//generate Grid Layout
	for (i = 0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1);
		ComEndConfigSheet(sheetObjects[i]);
	}
	
	for ( var k = 0; k < comboObjects.length; k++) {
		initCombo(comboObjects[k], k + 1);
	}
	initControl();
	
	for(k=0;k<tabObjects.length;k++){
		initTab(tabObjects[k],k+1);
		tabObjects[k].SetSelectedIndex(0);
	}
	
	
	//auto search data after loading finish.
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}

function initControl() {
	
}
/**
 * setting Combo basic info param : comboObj, comboNo initializing sheet
 */
function initCombo(comboObj, comboNo) {
	var formObj = document.form
	switch (comboNo) {
	case 1:
		with (comboObj) {
			SetMultiSelect(1);
	        SetDropHeight(200);
	        ValidChar(2,1);
		}
		var comboItems = khoaHocCombo.split("|");
		addComboItem(comboObj, comboItems);
		break;
	}
}

function addComboItem(comboObj, comboItems) {
	for (var i=0 ; i < comboItems.length ; i++) {
		var comboItem=comboItems[i].split(",");
		//comboObj.InsertItem(i, comboItem[0] + "|" + comboItem[1], comboItem[1]);
		//NYK Modify 2014.10.21
		if(comboItem.length == 1){
			comboObj.InsertItem(i, comboItem[0], comboItem[0]);
		}else{
			comboObj.InsertItem(i, comboItem[0] + "|" + comboItem[1], comboItem[1]);
		}
		
	}   		
}

function setComboObject(combo_obj) {
	comboObjects[comboCnt++] = combo_obj;
}

function setSheetObject(sheet_obj){
	sheetObjects[sheetCnt++] = sheet_obj;
}

function initSheet(sheetObj,sheetNo) {
	var cnt = 0;
	switch (sheetNo) {
	case 1: // sheet1 init
		with (sheetObj) {
			sheetObj.SetSheetHeight(300);
			var HeadTitle = "STS|Del|SV ID|Ten|Tuoi|Khoa Hoc|Hoc Phi|Ngay Nhap Hoc";
			var headCount = ComCountHeadTitle(HeadTitle);
			// (headCount, 0, 0, true);

			SetConfig({SearchMode : 2, MergeSheet : 5, Page : 20, DataRowMerge : 0});

			var info = {Sort : 1, ColMove : 1, HeaderCheck : 0, ColResize : 1};
			var headers = [ { Text : HeadTitle, Align : "Center" }];
			InitHeaders(headers, info);

			var cols = [ 
	             { Type : "Status", Hidden : 1, Width : 50, Align : "Center", ColMerge : 0, SaveName : "ibflag" }, 
	             { Type : "CheckBox", Hidden : 0, Width : 50, Align : "Center", ColMerge : 0, SaveName : "del_chk" }, 
	             { Type : "Text", Hidden : 0, Width : 100, Align : "Center", ColMerge : 0, SaveName : "sv_id", KeyField : 1, Format : "", UpdateEdit : 0, InsertEdit : 1, EditLen: 3 }, 
	             { Type : "Text", Hidden : 0, Width : 500, Align : "Center", ColMerge : 0, SaveName : "ten", KeyField : 1, Format : "", UpdateEdit : 1, InsertEdit : 1, EditLen: 50  }, 
	             { Type : "Text", Hidden : 0, Width : 100, Align : "Center", ColMerge : 0, SaveName : "tuoi", KeyField : 1, Format : "", UpdateEdit : 1, InsertEdit : 1 , EditLen: 6 }, 
	             { Type : "Text", Hidden : 0, Width : 300, Align : "Left", ColMerge : 0, SaveName : "khoahoc", KeyField : 1, Format : "", UpdateEdit : 1, InsertEdit : 1 , EditLen: 50 }, 
	             { Type : "Text", Hidden : 0, Width : 300, Align : "Left", ColMerge : 0, SaveName : "hocphi", KeyField : 1, Format : "", UpdateEdit : 1, InsertEdit : 1 , EditLen: 22 },
	             { Type : "Text", Hidden : 0, Width : 100, Align : "Center", ColMerge : 0, SaveName : "ngaynhaphoc", KeyField : 1, Format : "YYYY-MM-DD", UpdateEdit : 1, InsertEdit : 1 , EditLen: 50 }
	             ];

			InitColumns(cols);
			SetEditable(1);
//			SetColProperty("jo_crr_cd", { AcceptKeys : "E|N", InputCaseSensitive : 1 });
//			SetColProperty("vndr_seq", { AcceptKeys : "N"});
//			SetColProperty("cust_cnt_cd", { AcceptKeys : "E|N", InputCaseSensitive : 1});
//			SetColProperty("cust_seq", { AcceptKeys : "N"});
//			SetColProperty("trd_cd", { AcceptKeys : "E|N", InputCaseSensitive : 1 });
			SetWaitImageVisible(0);
			resizeSheet();
		}
		break;
	case 2: // sheet2 init
		with (sheetObj) {
			sheetObj.SetSheetHeight(500);
			var HeadTitle = "STS|STT|Sinh Vien ID|Ngay Muon|So Tien";
			var headCount = ComCountHeadTitle(HeadTitle);
			// (headCount, 0, 0, true);

			SetConfig({SearchMode : 2, MergeSheet : 5, Page : 20, DataRowMerge : 0});

			var info = {Sort : 1, ColMove : 1, HeaderCheck : 0, ColResize : 1};
			var headers = [ { Text : HeadTitle, Align : "Center" }];
			InitHeaders(headers, info);

			var cols = [ 
	             { Type : "Status", Hidden : 1, Width : 50, Align : "Center", ColMerge : 0, SaveName : "ibflag" }, 
	             { Type : "Text", Hidden : 0, Width : 100, Align : "Center", ColMerge : 0, SaveName : "stt", KeyField : 1, Format : "", UpdateEdit : 0, InsertEdit : 0, EditLen: 3 }, 
	             { Type : "Text", Hidden : 0, Width : 150, Align : "Center", ColMerge : 0, SaveName : "sinhvien_id", KeyField : 1, Format : "", UpdateEdit : 0, InsertEdit : 0, EditLen: 3 }, 
	             { Type : "Text", Hidden : 0, Width : 500, Align : "Center", ColMerge : 0, SaveName : "ngay", KeyField : 1, Format : "YYYY-MM-DD", UpdateEdit : 0, InsertEdit : 0 , EditLen: 50 },
	             { Type : "Text", Hidden : 0, Width : 500, Align : "Center", ColMerge : 0, SaveName : "sotien", KeyField : 1, Format : "", UpdateEdit : 0, InsertEdit : 0, EditLen: 50  }
	             ];

			InitColumns(cols);
			SetEditable(1);
			SetWaitImageVisible(0);
			resizeSheet();
		}
		break;
	}

}

function resizeSheet() {
	ComResizeSheet(sheetObjects[0]);
}


function doActionIBSheet(sheetObj,formObj,sAction) {
	sheetObj.ShowDebugMsg(false);
//	if (!validateForm(sheetObj, formObj, sAction)) {
//		return false;
//	}
	switch (sAction) {
	case IBSEARCH: // retrieve
		formObj.f_cmd.value = SEARCH;
		ComOpenWait(true);
		sheetObj.DoSearch("SinhVienGS.do", FormQueryString(formObj) );
//		var sParam=FormQueryString(formObj);
//		var sXml=sheetObj.GetSearchData("DOU_TRN_001GS.do", sParam);
//		sheetObj.LoadSearchData(sXml,{Sync:1});
		break;
	case IBSAVE: // retrieve
		formObj.f_cmd.value = MULTI;
		sheetObj.DoSave("SinhVienGS.do", FormQueryString(formObj));
		break;
	case IBINSERT: //Row Add button event
		sheetObj.DataInsert(-1);
		break;
	case IBDELETE: //Row Delete button event
		for( var i = sheetObj.LastRow(); i >= sheetObj.HeaderRows(); i-- ) {
			if(sheetObj.GetCellValue(i, "del_chk") == 1){
				sheetObj.SetRowHidden(i, 1);
				sheetObj.SetRowStatus(i,"D");
			}
		}
		break;
	}
}

function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) { 
 	ComOpenWait(false);
 	var rowCnt = sheet1.GetTotalRows();
 	var ids = "";
 	for (var i = 1; i <= rowCnt; i ++) {
 		ids+=sheet1.GetCellValue(i, 2);
 		if (i < rowCnt) {
 			ids+=",";
 		}
 	}
 	searchKhoaHocBySVID(ids);
 	
}

function sheet1_OnDblClick(Row, Col, Value, CellX, CellY, CellW, CellH) {
	 if (Value == 2) {
		 searchKhoaHocBySVID(CellX);
	 }
}

function setTabObject(tab_obj){
	tabObjects[tabCnt++]=tab_obj;
}


function initTab(tabObj , tabNo) {
	switch(tabNo) {
	case 1:
		with (tabObj) {
			var cnt=0 ;
				InsertItem( "Sinh Vien" , "");
				InsertItem( "Muon Sach" , "");
		}
		break;
	}
}

function tab1_OnChange(tabObj, nItem)
{
	var objs=document.all.item("tabLayer");
	objs[nItem].style.display="Inline";		
	//--------------- this is important! --------------------------//
	for(var i = 0; i<objs.length; i++){
		  if(i != nItem){
		   objs[i].style.display="none";
		   objs[beforetab].style.zIndex=objs[nItem].style.zIndex - 1 ;
		  }
		}
	//------------------------------------------------------//
	beforetab=nItem;
    resizeSheet();
} 

function searchKhoaHocBySVID(id) {
	document.form.f_cmd.value = SEARCH;
	 ComOpenWait(true);
	 var sParam=FormQueryString(document.form);
	 sParam+="&sinhvien_id=" + id;
	 var sXml= sheetObjects[1].GetSearchData("MuonSachGS.do", sParam);
	 sheetObjects[1].LoadSearchData(sXml,{Sync:1});
	 ComOpenWait(false);
}

function s_khoahoc_OnCheckClick(Index, Code, Checked) {
	 document.form.f_cmd.value = SEARCH;
	 var sParam=FormQueryString(document.form);
	 var sXml= sheetObjects[0].GetSearchData("SinhVienGS.do", sParam);
	 sheetObjects[0].LoadSearchData(sXml,{Sync:1});
}


function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) { 
	if (StCode === 200) {
		alert("Save successfully");
		doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
	} else {
		alert("Save failed");
	}

}


function validateForm(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
}

function SINHVIEN() {
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