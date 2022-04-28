/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_COM_1003.js
*@FileTitle  : Estimated Revenue VVD Entry
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/

var tabObjects = new Array();
var tabCnt = 0;
var beforetab = 1;

var sheetObjects = new Array();
var sheetCnt = 0;

var flagSearch = false;

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
		if(ComGetBtnDisable(srcName)) return false;
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
			case "btn_Creation" :
				doActionIBSheet(sheetObject1,formObject, IBBATCH);
				break;
			case "exe_yrmon_cal":
				var cal=new ComCalendar();
				cal.setDisplayType('month');
            	cal.endFunction="ComCalendar_EndFunction_accrual_month";
				cal.select(form.exe_yrmon, 'yyyy-MM');
				break;
			case "rev_yrmon_cal":
				var cal=new ComCalendar();
				cal.setDisplayType('month');
				cal.select(form.rev_yrmon, 'yyyy-MM');
				break;
			case "pop_vsl_code":
				ComOpenPopup("COM_ENS_0A1.do", 630, 445, "setVesselCode", "1,0,1,1,1,1", false, false, 0, 0, 0, "COM_ENS_0A1");
				break;
//			 case "btn_excel_upload":
//				 sheetObject1.LoadExcel({ Mode:"HeaderMatch",Append:false});
//	         	break;
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
	//doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
	//chkText();
}

/**
 * After completing calendar input, execute function.<br>
 */
function ComCalendar_EndFunction_accrual_month(){
	var formObject=document.form;
	with(sheetObjects[0]) {
		doActionIBSheet(sheetObjects[0],formObject,REPLY);
	}
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
	});
}

function validateForm(sheetObj, formObj, sAction) {
	var prefix="sheet1_";
	switch(sAction){
		case IBSEARCH: // 조회
			if (!ComChkValid(formObj)) return false;
			break;
		case IBSAVE: // 저장
			break;
	}
	return true;
}
function tRoleApply() {
	var formObj=document.form;
	if (formObj.trole.value != "Authenticated") {
		ComBtnDisable("btn_save");
		ComBtnDisable("btn_del");
		ComBtnDisable("btn_add");
//		ComBtnDisable("btn_excel_upload");
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
				var HeadTitle="|Sel|Execute Month|Revenue Month|Vessel Code|Schedule Voyage No|Schedule Direction Code|Revenue Direction Code|Estimate VVD Type Code|Estimate In out Division Code|Estimate VVD Header ID|Estimate BC Division Code|Vessel Start Date|Vessel End Date|Revenue Lane Code|Line Number|Accrual I/F Flag";
				var prefix="sheet1_";
	
				SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
	
				var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
				var headers = [ { Text:HeadTitle, Align:"Center"} ];
				InitHeaders(headers, info);
	
				var cols = [ {Type:"Status",    Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
				             {Type:"CheckBox",  Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"del_chk" },
				             {Type:"Text",      Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"exe_yrmon",       KeyField:1,   CalcLogic:"",   Format:"Ym",          PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:6 },
				             {Type:"Text",      Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"rev_yrmon",       KeyField:1,   CalcLogic:"",   Format:"Ym",          PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:6 },
				             {Type:"Text",      Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"vsl_cd",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:4, AcceptKeys:"E|[0123456789]", InputCaseSensitive:1 },
				             {Type:"Text",      Hidden:0, Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"skd_voy_no",      KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:4, AcceptKeys:"N" },
				             {Type:"Text",      Hidden:0, Width:170,  Align:"Center",  ColMerge:0,   SaveName:prefix+"skd_dir_cd",      KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:1, AcceptKeys:"E", InputCaseSensitive:1 },
				             {Type:"Text",      Hidden:0, Width:170,  Align:"Center",  ColMerge:0,   SaveName:prefix+"rev_dir_cd",      KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:1, AcceptKeys:"E", InputCaseSensitive:1 },
				             {Type:"Text",      Hidden:0, Width:170,  Align:"Center",  ColMerge:0,   SaveName:prefix+"estm_vvd_tp_cd",  KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:2, AcceptKeys:"E", InputCaseSensitive:1 },
				             {Type:"Text",      Hidden:0, Width:200,  Align:"Center",  ColMerge:0,   SaveName:prefix+"estm_ioc_div_cd", KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:2, AcceptKeys:"E", InputCaseSensitive:1 },
				             {Type:"Text",      Hidden:1, Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"estm_vvd_hdr_id", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20, AcceptKeys:"N" },
				             {Type:"Text",      Hidden:0, Width:170,  Align:"Center",  ColMerge:0,   SaveName:prefix+"estm_bc_div_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:1, AcceptKeys:"E", InputCaseSensitive:1 },
				             {Type:"Date",      Hidden:1, Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"vst_dt",          KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:8 },
				             {Type:"Date",      Hidden:1, Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"ved_dt",          KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:8 },
				             {Type:"Text",      Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"rlane_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:5, AcceptKeys:"E", InputCaseSensitive:1 },
				             {Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"line_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:4, AcceptKeys:"N" },
	             			 {Type:"Text",      Hidden:0, Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"if_flg",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:1 } ];
		            	 
				InitColumns(cols);
	
				SetWaitImageVisible(0);
				SetShowButtonImage(2);
				//SetSheetHeight(450);2014
				resizeSheet();
				//FitColWidth();
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
	if (!validateForm(sheetObj, formObj, sAction)) return;
	switch (sAction) {
    	case IBSEARCH: // 조회
    		ComOpenWait(true);		 	 
    		formObj.f_cmd.value=SEARCH;
    		sheetObj.DoSearch("STM_SAC_0010GS.do",FormQueryString(formObj, true) + "&" + ComGetPrefixParam("sheet1_") );
    		break;
    		
    	case IBSAVE: //		저장 버튼
 			if(ComShowConfirm(ComGetMsg("COM130101", "data"))){
	     		if(!validateForm(sheetObject1, formObj, sAction))  return false;	//	없으면 수정하고 Save 하
	     		var SaveStr = sheetObj.GetSaveString();
	     		
	     		if(sheetObj.IsDataModified()== false || SaveStr == ""){			//	없으면 Save 할 내용이 없어도 무한 In progress
	     			
	     			//ComShowCodeMessage('COM130104');
					return;
				}
	     		//if (ComShowConfirm(ComGetMsg("COM130101"))) {
	     			
	     		ComOpenWait(true);												//	저장이 빈 칸으로 된다
	        	formObj.f_cmd.value=MULTI;
	        	sheetObj.DoSave("STM_SAC_0010GS.do", FormQueryString(formObj, true) + "&" + ComGetPrefixParam("sheet1_"),-1,false);
	        	ComOpenWait(false);
	     		//}
 			}
     		
    		break;
    		
    	case IBINSERT: // 입력
    		var Row=sheetObj.DataInsert();
            break;
    	case REMOVE: // 삭제
    		ComRowHideDelete(sheetObject1, prefix + "del_chk");
    		break;
    	case IBCREATE: // New
    		formObj.reset();
    		sheetObject1.RemoveAll();
			ComBtnEnable("btn_Creation");
			break;
 		case IBBATCH:        //Accrual Data Batch Creation
 			if(ComShowConfirm(ComGetMsg("FIN00010"))){
				if(formObj.exe_yrmon.value == "")
	 			{
					ComShowCodeMessage("COM12113", "Execute Month");
					return;
	 			}
				
				formObj.f_cmd.value=COMMAND01;
	 			/*
				sheetObj.DoSearch("STM_SAC_0010GS.do", FormQueryString(formObj, true));
	 			*/
				var sXml=sheetObj.GetSaveData("STM_SAC_0010GS.do", FormQueryString(formObj, true));
				setTimeout( function () {
					flagSearch = true;
					doActionIBSheet(sheetObj, document.form, IBSEARCH);
				} , 5000);
				break;
 			}
    	case SEARCH04: 
			formObj.f_cmd.value=SEARCH04;
			var val=sheetObj.GetCellValue(row, col);
			//var params = FormQueryString(formObj);
            params="f_cmd=104&pagerows=&trole=Authenticated&exe_yrmon=&rev_yrmon=&vsl_cd="+val+"&skd_voy_no=&skd_dir_cd=";
            var sXml=sheetObj.GetSearchData("FINCommonGS.do", params);
			var state=ComGetEtcData(sXml, ComWebKey.Trans_Result_Key);
			if (state == 'S') {
				if(ComGetEtcData(sXml, "result") == null || ComGetEtcData(sXml, "result") == 'null'){
//					ComShowCodeMessage("FIN00003", "Vessel Code");
					sheetObj.SetCellValue(row, "sheet1_vsl_cd","", 0);
					sheetObj.SelectCell(row, "sheet1_vsl_cd");
				}
			}
			break;
    	case REPLY: // Accrual Month calendar 선택시...
    		formObj.f_cmd.value=REPLY;
    		var sXml=sheetObj.GetSearchData("STM_SAC_0010GS.do", FormQueryString(formObj, true));
    		if("Y" == ComGetEtcData(sXml, "btnBlckFlg")) {
    			ComBtnDisable("btn_Creation");
    		} else {
    			ComBtnEnable("btn_Creation");
    		}
    		break;
	}
}

function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) {
	ComOpenWait(false);
	if(flagSearch) 
	{
		ComShowCodeMessage("COM130102", 'Estimated Revenue VVD Entry'); //save success
		flagSearch = false;
	}
}

function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
	ComOpenWait(false);
	if (Code==0) ComShowCodeMessage("COM130102", 'Estimated Revenue VVD Entry'); //save success
}

function sheet1_OnPopupClick(sheetObj,Row,Col){
	var prefix="sheet1_";
    switch (sheetObj.ColSaveName(Col)) {
   		case prefix + "vst_dt" :
   			var cal=new ComCalendarGrid();
   			cal.select(sheetObj, Row, Col, 'yyyyMMdd');
   			break;
   		case prefix + "ved_dt" :
   			var cal=new ComCalendarGrid();
   			cal.select(sheetObj, Row, Col, 'yyyyMMdd');
   			break;
   		case prefix + "exe_yrmon" :
   			var cal=new ComCalendarGrid();
   			cal.setDisplayType('month');
   			cal.select(sheetObj, Row, Col, 'yyyy-MM');
   			break;
   		case prefix + "rev_yrmon" :
   			var cal=new ComCalendarGrid();
   			cal.setDisplayType('month');
   			cal.select(sheetObj, Row, Col, 'yyyy-MM');
   			break;   			
    }
}
/**
 * 
 */
function sheet1_OnChange(sheetObj, Row, Col, sValue, sOldValue){
	var sheetObj=sheetObjects[0];
 	var prefix="sheet1_";
 	var invExeYrmon=sheetObj.SaveNameCol(prefix + "exe_yrmon");
 	var invRevYrmon=sheetObj.SaveNameCol(prefix + "rev_yrmon");
 	var invVslCd=sheetObj.SaveNameCol(prefix + "vsl_cd");
 	var invSkdVoyNo=sheetObj.SaveNameCol(prefix + "skd_voy_no");
 	var invSkdDirCd=sheetObj.SaveNameCol(prefix + "skd_dir_cd");
 	var invRevDirCd=sheetObj.SaveNameCol(prefix + "rev_dir_cd");
 	var invEstmVvdTpCd=sheetObj.SaveNameCol(prefix + "estm_vvd_tp_cd");
 	var invEstmIocDivCd=sheetObj.SaveNameCol(prefix + "estm_ioc_div_cd");
 	var sCols = invExeYrmon + "|" + invRevYrmon + "|" + invVslCd + "|" + invSkdVoyNo + "|" + invSkdDirCd + "|" + invRevDirCd + "|" + invEstmVvdTpCd + "|" + invEstmIocDivCd;
 	
 	if(Row <= 0) return;
 	
 
 	
	switch(Col){
 		case invExeYrmon:
 		case invRevYrmon:
 			if(sValue !="" && sValue < "200001"){
	 			ComShowCodeMessage("FIN00007", "");
	 			sheetObj.SelectCell(Row,Col);
                return;
 			}
 			break;
 		case invVslCd:
 			if(sValue != "") {
 				doActionIBSheet(sheetObj, document.form, SEARCH04, Row, "sheet1_vsl_cd");
 			}
 			break;
 		case invSkdVoyNo:
 			sheetObj.SetCellValue(Row, Col,ComLpad(sValue, 4, '0'),0);
 			break;
 		case invSkdDirCd:
 		case invRevDirCd:
 		case invEstmVvdTpCd:
 		case invEstmIocDivCd:
 			break;
 		default :
 			return;

	}

}

/**
* Vessel Code Popup<br>
* @param {arry} aryPopupData   sheetObjects[0]  sheetIdx
*/
function setVesselCode(aryPopupData, Row, Col, sheetIdx) {
	form.vsl_cd.value=aryPopupData[0][3];
}
/* 개발자 작업 */