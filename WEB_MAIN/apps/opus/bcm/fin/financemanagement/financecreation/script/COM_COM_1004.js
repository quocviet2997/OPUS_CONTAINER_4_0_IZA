/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   :  COM_COM_1004.js
*@FileTitle  : Estimated FMC Entry
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
var tabObjects = new Array();
var tabCnt = 0;
var beforetab = 1;

var sheetObjects = new Array();
var sheetCnt = 0;

// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick = processButtonClick;
// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
function processButtonClick() {
	var sheetObject1=sheetObjects[0];
	/** **************************************************** */
	var formObject=document.form;
	// 스크립트 에러 위치를 확인하기 위해 주석처리
	try {
		var srcName=ComGetEvent("name");
		switch (srcName) {
		case "btn_retrieve":
			if(!ComChkValid(formObject)) return;
			doActionIBSheet(sheetObject1, formObject, IBSEARCH);
			break;
		case "btn_save":
			doActionIBSheet(sheetObject1,formObject,IBSAVE);
			break;
		case "btn_add":
			doActionIBSheet(sheetObject1,formObject,IBINSERT);
			break;
		case "btn_del":
			doActionIBSheet(sheetObject1,formObject,REMOVE);
			break;
		case "btn_new" :
			doActionIBSheet(sheetObject1,formObject, IBCREATE);
			break;	
		 case "btn_excel_upload":
			 sheetObject1.LoadExcel({ Mode:"HeaderMatch",WorkSheetNo:"1",Append:false});
         	break;	
		}
    }catch(e) {
        if( e == "[object Error]") {
         ComShowMessage(OBJECT_ERROR);
        } else {
         ComShowMessage(e);
        }
    }
}
/**
 * Sheet 기본 설정 및 초기화
 * body 태그의 onLoad 이벤트핸들러 구현
 * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
 */
function loadPage() {
	for (i=0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1);
		ComEndConfigSheet(sheetObjects[i]);
	}
	
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}
/**
 * 
 */
function validateForm(sheetObj, formObj, sAction) {
	return true;
}

function tRoleApply() {
	var formObj=document.form;
	if (formObj.trole.value != "Authenticated") {
		ComBtnDisable("btn_save");
		ComBtnDisable("btn_del");
		ComBtnDisable("btn_add");
		ComBtnDisable("btn_excel_upload");
	}
} 
 /**
	 * IBSheet Object를 배열로 등록 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
	 * 배열은 소스 상단에 정의
	 */
function setSheetObject(sheet_obj) {
	sheetObjects[sheetCnt++]=sheet_obj;
}
/**
 * 시트 초기설정값, 헤더 정의 param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에
 * 붙인 일련번호 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
 */
function initSheet(sheetObj, sheetNo) {
	var cnt=0;
	switch (sheetNo) {
		case 1: 
			with(sheetObj){
				var HeadTitle="|Sel|GL MISC First Code|GL MISC Second Code|GL MISC third Code|Entry Name|Entry Abbreviation Name|Delete Flag";
				var headCount=ComCountHeadTitle(HeadTitle);
				var prefix="sheet1_";
	
				SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
	
				var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
				var headers = [ { Text:HeadTitle, Align:"Center"} ];
				InitHeaders(headers, info);
	
				var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
				             {Type:"CheckBox",  Hidden:0, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"del_chk" },
				             {Type:"Text",      Hidden:0, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"gl_misc_n1st_cd", KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:2, AcceptKeys:"E|N", InputCaseSensitive:1},
				             {Type:"Text",      Hidden:0, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"gl_misc_n2nd_cd", KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:2, AcceptKeys:"E|N", InputCaseSensitive:1 },
				             {Type:"Text",      Hidden:0, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"gl_misc_n3rd_cd", KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:10, AcceptKeys:"E|N", InputCaseSensitive:1 },
				             {Type:"Text",      Hidden:0, Width:250,  Align:"Left",    ColMerge:0,   SaveName:prefix+"ent_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:100 },
				             {Type:"Text",      Hidden:0, Width:300,  Align:"Left",    ColMerge:0,   SaveName:prefix+"ent_abbr_nm",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:100 },
				             {Type:"Combo",     Hidden:0, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"delt_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1, ComboText:"Yes|No", ComboCode:"Y|N" } ];
				 
				InitColumns(cols);
	    		SetWaitImageVisible(0);
	
	    		SetSheetHeight(ComGetSheetHeight(sheetObj, 15));
			}
	    	break;
	}
}
 // Sheet관련 프로세스 처리
function doActionIBSheet(sheetObj, formObj, sAction) {
	var prefix="sheet1_";
	var sheetObject1=sheetObjects[0];
	switch (sAction) {
    	case IBSEARCH:
    		sheetObj.SetWaitImageVisible(0);
    		ComOpenWait(true);		 	
    		formObj.f_cmd.value=SEARCH;
    		sheetObj.DoSearch("COM_COM_1004GS.do",FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_") );
    		break;
    	case IBSAVE:
     		if(!validateForm(sheetObject1, formObj, sAction))  return false;
     		ComOpenWait(true)
    		formObj.f_cmd.value=MULTI;
    		if(sheetObj.DoSave("COM_COM_1004GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_"))) {
    			ComShowCodeMessage("COM130102", 'Estimated FMC Entry');
    		}
    		break;
    	case IBINSERT:
    		var Row=sheetObj.DataInsert();
    		sheetObj.SetCellValue(Row, prefix + "delt_flg",'N',0);
            break;
    	case REMOVE:
    		ComRowHideDelete(sheetObject1, prefix + "del_chk");
    		break;
    	case IBCREATE:
    		formObj.reset();
    		sheetObject1.RemoveAll();
			break;
	}
}

function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) { 
	ComOpenWait(false);
}

function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) { 
	ComOpenWait(false);
}

function sheet1_OnChange(sheetObj, Row, Col){
	var sheetObj=sheetObjects[0];
 	var prefix="sheet1_";
 	var in1=sheetObj.SaveNameCol(prefix + "gl_misc_n1st_cd");
 	var in2=sheetObj.SaveNameCol(prefix + "gl_misc_n2nd_cd");
 	var in3=sheetObj.SaveNameCol(prefix + "gl_misc_n3rd_cd");
 	var cols = in1 + "|" + in2 + "|" + in3; 
 	if (Row< sheetObj.HeaderRows()) return;
 	if(Col != in1 && Col != in2 && Col != in3) return;
	if (sheet1.ColValueDup(cols)>0) {
		ComShowCodeMessage('COM12115', 'Estimated FMC Entry');
		sheetObj.SetCellValue(Row, Col,'',0);
		sheetObj.SelectCell(Row, Col, true);
	}
}
/* 개발자 작업 */
