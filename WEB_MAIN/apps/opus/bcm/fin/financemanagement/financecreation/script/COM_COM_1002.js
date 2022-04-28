/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_COM_1002.js
*@FileTitle  : ERROR VVD ENTRY
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
var tabObjects = new Array();
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
	chkText();
}

var chkText = function (index, Element){
	$(".opus_design_inquiry  input").each(function(){
                                		var maxLength = $(this).attr("maxlength");
                                		$(this).keydown(function(event){
                                			             // 키다운이 되면 값이 입력되기 전에 먼저 일어나는 이벤트
                                			             // maxLength 값과 입력값의 길이가 같다면 maxLength 초과 한경우 이기때문에 이전에 입력된값은 초기화 대고 
                                			             // 새로 입력한 값만 남게 된다.
                                			            if(maxLength<=($(this).val().length)){
                                			            	$(this).val("");
                                			              }
                                				                
                                		                })
	                                     }
	);
}
/**
 * 
 */
function validateForm(sheetObj, formObj, sAction) {
	var prefix="sheet1_";
	var errvvd=new Array();
	switch(sAction){
	case IBSAVE: // 저장
		for(var i=1; i<=sheetObj.RowCount(); i++){
			if (sheetObj.GetCellValue(i,3).length != 10) {
				ComShowCodeMessage("COM12174", "Error VVD", '10');
				return false;
			}
			if (sheetObj.GetCellValue(i,4).length != '' && sheetObj.GetCellValue(i,4).length != 10) {
				ComShowCodeMessage("COM12174", "CORRECTION VVD", '10');
				return false;
			}
		}
	return true;
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
			var HeadTitle="|Del.|Seq.|Error VVD|CORRECTION VVD|AVAILBLE FLAG";
			var headCount=ComCountHeadTitle(HeadTitle);
			var prefix="sheet1_";
	
			SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
	
			var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			var headers = [ { Text:HeadTitle, Align:"Center"} ];
			InitHeaders(headers, info);
	
			var cols = [ {Type:"Status",    Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
			             {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"del_chk" },
			             {Type:"Seq",       Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"Seq" },
			             {Type:"Text",      Hidden:0, Width:380,  Align:"Center",  ColMerge:0,   SaveName:prefix+"err_vvd",  KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:10, AcceptKeys:"E|N", InputCaseSensitive:1, FullInput:1 },
			             {Type:"Text",      Hidden:0, Width:380,  Align:"Center",  ColMerge:0,   SaveName:prefix+"corr_vvd", KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:10, AcceptKeys:"E|N", InputCaseSensitive:1, FullInput:1 },
			             {Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"aval_flg", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, ComboText:"No|Yes", ComboCode:"N|Y" } ];
			 
			InitColumns(cols);
    		SetWaitImageVisible(0);
			SetSheetHeight(450);
		}
		break;
	}
}
 // Sheet관련 프로세스 처리
function doActionIBSheet(sheetObj, formObj, sAction) {
	var prefix="sheet1_";
	var sheetObject1=sheetObjects[0];
	switch (sAction) {
    	case IBSEARCH: // 조회
    		ComOpenWait(true);		 	
    		formObj.f_cmd.value=SEARCH;
    		sheetObj.DoSearch("COM_COM_1002GS.do",FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_") );
    		break;
    	case IBSAVE: // 저장
     		if(!validateForm(sheetObject1, formObj, sAction))  return false;
     		var SaveStr = sheetObj.GetSaveString();
     		if(sheetObj.IsDataModified()== false || SaveStr == ""){
     			ComShowCodeMessage('COM130104');
				return;
			}
     		ComOpenWait(true)
    		formObj.f_cmd.value=MULTI;
    		sheetObj.DoSave("COM_COM_1002GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_"));
    		break;
    	case IBINSERT: // 입력
    		var Row=sheetObj.DataInsert();
            break;
    	case REMOVE: // 삭제
    		ComRowHideDelete(sheetObject1, prefix + "del_chk");
    		break;
    	case IBCREATE: // New
    		formObj.reset();
    		sheetObj.RemoveAll();
			break;
	}
}

function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) { 
	ComOpenWait(false);
}

function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) { 
	ComOpenWait(false);
}
/**
 * 중복 체크
 */
function sheet1_OnChange(sheetObj, Row, Col, Value, OldValue, RaiseFlag){
	var sheetObj=sheetObjects[0];
 	var prefix="sheet1_";
 	var invErrVvd=sheetObj.SaveNameCol(prefix + "err_vvd");
 	if(Row <= 0|| Col != invErrVvd) return;
 	if (sheetObj.ColValueDup(Col) > 0) {
		ComShowCodeMessage('COM12115', 'ERROR VVD Entry');
		sheetObj.SetCellValue(Row, Col,'',0);
		sheetObj.SelectCell(Row, Col, true); 		
 	}
}
/* 개발자 작업 */
