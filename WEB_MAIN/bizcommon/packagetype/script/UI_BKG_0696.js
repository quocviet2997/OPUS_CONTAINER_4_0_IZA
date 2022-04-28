/*=========================================================
 * *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : UI_BKG_0696.js
*@FileTitle  : Package Type
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/12
=========================================================*/
// 공통전역변수
var sheetObjects=new Array();
var sheetCnt=0;
// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick=processButtonClick;
// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
function processButtonClick(){
     /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
     var sheetObject=sheetObjects[0];
     /*******************************************************/
     var formObject=document.form;
	try {
	    var srcName=ComGetEvent("name");
        switch(srcName) {
			case "btn_Retrieve":
				doActionIBSheet(sheetObject, formObject, IBSEARCH);
            break;
			case "btn_select":
				doActionIBSheet(sheetObject, formObject, COMMAND01);
            break; 
			case "btn_close":
				ComClosePopup(); 
            break;
			case "btn_downexcel":
				if(sheetObj.RowCount() < 1){//no data	
					ComShowCodeMessage("COM132501");
				}else{
					sheetObject.Down2Excel({ DownCols: makeHiddenSkipCol(sheetObject),HiddenColumn:false,Merge:false,TreeLevel:false});
				}		   					
			break;
        } // end switch
	}catch(e) {
		if( e == "[object Error]") {
			ComShowMessage(OBJECT_ERROR);
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
function setSheetObject(sheet_obj){
   sheetObjects[sheetCnt++]=sheet_obj;
}
/**
 * Sheet 기본 설정 및 초기화
 * body 태그의 onLoad 이벤트핸들러 구현
 * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
 */
function loadPage() {
    for(i=0;i<sheetObjects.length;i++){
        ComConfigSheet(sheetObjects[i]);
        initSheet(sheetObjects[i],i+1);
        ComEndConfigSheet(sheetObjects[i]);
    }
	//axon_event.addListenerFormat('keypress', 'obj_keypress', form); //- form 전체 컨트롤 중 dataformat 속성이 있는 모든 컨트롤의 onkeypress이벤트에 코드 처리
   // axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
	doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
}
function obj_keypress(){
    obj=event.srcElement;
    if(obj.dataformat == null) return;
    window.defaultStatus=obj.dataformat;
    switch(obj.dataformat) {
        case "ymd":
        case "ym":
        case "hms":
        case "hm":
        case "jumin":
        case "saupja":
            ComKeyOnlyNumber(obj);
            break;
        case "int":
            if(obj.name=="txtInt") ComKeyOnlyNumber(obj, "-")
            else ComKeyOnlyNumber(obj);
            break;
        case "float":
            ComKeyOnlyNumber(obj, "-.");
            break;
        case "eng":
            ComKeyOnlyAlphabet(); break;
        case "engup":
            if(obj.name=="acct_cd") ComKeyOnlyNumber(obj)
            else ComKeyOnlyAlphabet('upper');
            break;
        case "engdn":
            if(obj.name=="txtEngDn2") ComKeyOnlyAlphabet('lowernum')
            else ComKeyOnlyAlphabet('lower');
            break;
    }
}
/**
 * 시트 초기설정값, 헤더 정의
 * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
 * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
 */
function initSheet(sheetObj,sheetNo) {
    var cnt=0;
    var sheetID=sheetObj.id;
    switch(sheetID) {
        case "sheet1" :      //sheet1 init
            with(sheetObj){
	              var mdmYN=document.form.mdm_yn.value;
	              var HeadTitle1="||Code|Description|US Customs";
	              if(mdmYN.replace(/\s/g,"") != ""){
	              HeadTitle1 += "|Status";
	              }
	              if(mdmYN.replace(/\s/g,"") != ""){
	              (8, 0, 0, true);
	              }else{
	              (7, 0, 0, true);
	              }
	
	              SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
	
	              var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	              var headers = [ { Text:HeadTitle1, Align:"Center"} ];
	              InitHeaders(headers, info);
	
	              var cols = [ {Type:"Radio",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"radio",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                     {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"checkbox",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                     {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"pck_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                     {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",    ColMerge:0,   SaveName:"pck_nm",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                     {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"usa_cstms_pck_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
	                    if(mdmYN.replace(/\s/g,"") != ""){
	              cols.push({Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:"delt_flg",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 });
	              }
	              cols.push({Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"pagerows",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 });
	              cols.push({Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ibflag" });
	         
	              InitColumns(cols);		
	              SetEditable(1);
	              SetSheetHeight(237);
                }
           break;
    }
}
/**
 * Sheet관련 프로세스 처리
 */
function doActionIBSheet(sheetObj,formObj,sAction) 
{
    sheetObj.ShowDebugMsg(false);
    switch(sAction) {
        case IBSEARCH:      //조회
			if (sheetObj.id == "sheet1")
			{
				formObj.f_cmd.value=SEARCH;
				sheetObj.DoSearch("UI_BKG_0696GS.do", FormQueryString(formObj) );
			}
            break;
		case COMMAND01:     // select 버튼 클릭시 처리
	        var selrow=sheetObj.GetSelectRow();
	        if ( selrow > 0 )
	        {
				 comPopupOK();      // acct_cd, acct_eng_nm 호출자에게 매개변수값 전달.
	        }
		break;
    }
}
/**
 * 그리드에서 더블클릭했을 때의 처리 : 선택한 값을 부모창으로 리턴하고, 팝업창을 닫는다.
 */
function sheet1_OnDblClick(sheetObj, row, col, value) 
{
 	comPopupOK();      // 호출자에게 매개변수값 전달.
}
/* 개발자 작업  끝 */
