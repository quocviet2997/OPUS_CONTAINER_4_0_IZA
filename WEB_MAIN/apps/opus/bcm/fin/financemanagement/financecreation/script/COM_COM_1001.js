/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_COM_1001.js
*@FileTitle  : Center Code Entry
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
var tabObjects = new Array();
var sheetObjects = new Array();
var sheetCnt = 0;

// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick = processButtonClick;
//버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
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
	switch(sAction){
	case IBSAVE: // 저장	
		for(var i=1; i<=sheetObj.RowCount(); i++){
			if (sheetObj.GetCellValue(i,3).length != 6) {
			ComShowCodeMessage("COM12174", "Center Code", '6');
			return false;
			}
			if (sheetObj.GetCellValue(i,7) == "" || sheetObj.GetCellValue(i,7) == null) 
			{
				ComShowCodeMessage("FIN00001", "Currency Code");
				sheetObj.SelectCell(i, 7, true);
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
			var HeadTitle="|Del.|Seq.|Center No.|Center Code|Local Name|ENG Name|CURR CD|CNT CD|RGN CD|FLG|BIZ CD";
			var prefix="sheet1_";
	
			SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
	
			var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			var headers = [ { Text:HeadTitle, Align:"Center"} ];
			InitHeaders(headers, info);
	
			var cols = [ {Type:"Status",    Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
			             {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"del_chk" },
			             {Type:"Seq",       Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"Seq" },
			             {Type:"Text",      Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"ctr_erp_no",        KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:6, AcceptKeys:"N", FullInput:1},
			             {Type:"Text",      Hidden:0, Width:140,  Align:"Center",  ColMerge:0,   SaveName:prefix+"ctr_erp_cd",        KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:6, AcceptKeys:"E", InputCaseSensitive:1 },
			             {Type:"Text",      Hidden:0, Width:350,  Align:"left",    ColMerge:0,   SaveName:prefix+"ctr_locl_nm",       KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
			             {Type:"Text",      Hidden:0, Width:350,  Align:"left",    ColMerge:0,   SaveName:prefix+"ctr_eng_nm",        KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:50, AcceptKeys:"E", InputCaseSensitive:1 },
			             {Type:"PopupEdit", Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"curr_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3, AcceptKeys:"E" , InputCaseSensitive:1 },
			             {Type:"PopupEdit", Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cnt_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:2, AcceptKeys:"E" },
			             {Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"rgn_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:2, ComboText:"11|21|31|41", ComboCode:"11|21|31|41" },
			             {Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"jnl_smry_trns_flg", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, ComboText:"No|Yes", ComboCode:"N|Y" },
			             {Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"biz_div_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, ComboText:"CNTR|BULK|Logistics|Common|Terminal&CNTR", ComboCode:"C|B|L|M|T" } ];
			 
			InitColumns(cols);
			SetShowButtonImage(2);
			SetWaitImageVisible(0);
			SetSheetHeight(450);
			resizeSheet();
		}
    	break;
	}
}

function resizeSheet(){
	 ComResizeSheet(sheetObjects[0]);
}
// Sheet관련 프로세스 처리
function doActionIBSheet(sheetObj, formObj, sAction, row, col) {
	var prefix="sheet1_";
	var sheetObject1=sheetObjects[0];
	switch (sAction) {
    	case IBSEARCH: // 조회    		
    		ComOpenWait(true);		 	
    		formObj.f_cmd.value=SEARCH;
    		sheetObj.DoSearch("COM_COM_1001GS.do",FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_") );
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
    		var rtnVal = sheetObj.DoSave("COM_COM_1001GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_"));
    		if ( rtnVal ) ComShowCodeMessage('FIN00006');
    		ComOpenWait(false)
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
		case SEARCH06:
			formObj.f_cmd.value=SEARCH06;
			var val=sheetObj.GetCellValue(row, col);
			var params=FormQueryString(formObj) + "&curr_cd=" + val;
			var sXml=sheetObj.GetSearchData("FINCommonGS.do", params);
			var state=ComGetEtcData(sXml, ComWebKey.Trans_Result_Key);
			if (state == 'S') 
			{
				if(ComGetEtcData(sXml, "result") == null || ComGetEtcData(sXml, "result") == 'null')
				{
					ComShowCodeMessage("FIN00003", "Currency Code");
					sheetObj.SetCellValue(row, "sheet1_curr_cd","",0);
				}
			}
			break;
	}
}

function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) { 
	ComOpenWait(false);
}

function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) { 
	ComOpenWait(false);
}

function sheet1_OnPopupClick(sheetObj,Row,Col){
	var prefix="sheet1_";	
    switch (sheetObj.ColSaveName(Col)) {
   		case prefix + "curr_cd" :
   			var param='?classId='+"COM_ENS_N13"
   			param=param+'&curr_cd='+sheetObj.GetCellValue(Row, Col);
   			ComOpenPopup('/opuscntr/COM_ENS_N13.do' + param , 700, 450, 'getcurrency' , "1,0,1,1,1,1,1,1,1,1,1,1", false);  			
   			break;
   		case prefix + "cnt_cd" :
   			var param='?classId='+"COM_ENS_051"
   			param=param+'&cnt_cd='+sheetObj.GetCellValue(Row, Col);
   			ComOpenPopup('/opuscntr/COM_ENS_0M1.do' + param, 750, 530, 'getCountry', "1,0,1,1,1,1,1,1,1,1,1,1", false);
   			break;
    }
}

function getCountry(rowArray) {
	var colArray=rowArray[0];	
    var sheetObj=sheetObjects[0];
    sheetObj.SetCellValue(sheetObj.GetSelectRow(),8 ,colArray[3],0);
}
function getcurrency(rowArray) {
	var colArray=rowArray[0];	
    var sheetObj=sheetObjects[0];
    sheetObj.SetCellValue(sheetObj.GetSelectRow(),7 ,colArray[2],0);
}
/**
 * 중복 체크
 */
function sheet1_OnChange(sheetObj, Row, Col, val){
	var sheetObj=sheetObjects[0];
 	var prefix="sheet1_";
 	var invCtrErpNo=sheetObj.SaveNameCol(prefix + "ctr_erp_no");
 	
	var col_save_name=sheetObj.ColSaveName(Col);
	
    // 대문자처리
	if(col_save_name==prefix+"curr_cd"||col_save_name==prefix+"cnt_cd"){
		sheetObj.SetCellValue(Row, Col, val.toUpperCase(),0);
	}
	
    // Currency Code Valid Check
 	if(sheetObj.ColSaveName(Col) == "sheet1_curr_cd" && sheetObj.GetCellValue(Row, "sheet1_curr_cd") != "") 
 	{
 		doActionIBSheet(sheetObj, document.form, SEARCH06, Row, Col);
 	}
	
 	if(Row <= 0 || Col != invCtrErpNo)  return;
 	if (sheetObj.ColValueDup(Col) > 0) {
		ComShowCodeMessage('COM12115', 'Center Code Entry');
		sheetObj.SetCellValue(Row, Col,'',0);
		sheetObj.SelectCell(Row, Col, true);
 		
 	}
}
/* 개발자 작업 */
