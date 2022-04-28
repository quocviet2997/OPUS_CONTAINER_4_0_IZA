/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_N13.js
*@FileTitle  : Currency Code
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/12
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
 * @class Currency Code : Currency Code 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
 */
/* 개발자 작업 */
// 공통전역변수
var sheetObjects=new Array();
var sheetCnt=0;
var mainPage;
// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick=processButtonClick;
// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
function processButtonClick() {
    /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
    var sheetObject1=sheetObjects[0];
    /*******************************************************/
    var formObject=document.form;
    try {
        var srcName=ComGetEvent("name");
        switch (srcName) {
        case "btn_Retrieve":
            doActionIBSheet(sheetObject1, document.form, IBSEARCH);
            break;
        case "btn_select":
            doActionIBSheet(sheetObject1, document.form, COMMAND01);
            break;
        case "btn_Close":
            ComClosePopup(); 
            break;
        case "btn_downexcel":
            sheetObject1.Down2Excel({ HiddenColumn:true});
        break;
        } // end switch
    } catch (e) {
        if (e == "[object Error]") {
            ComShowMessage(OBJECT_ERROR);
        } else {
            ComShowMessage(e.message);
        }
    }
}
/**
 * IBSheet Object를 배열로 등록 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다 배열은 소스
 * 상단에 정의
 */
function setSheetObject(sheet_obj) {
    sheetObjects[sheetCnt++]=sheet_obj;
}
/**
 * Sheet 기본 설정 및 초기화 body 태그의 onLoad 이벤트핸들러 구현 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을
 * 추가한다
 */
 function loadPage(mainpage) {
     mainPage=mainpage;
    for (i=0; i < sheetObjects.length; i++) {
        ComConfigSheet(sheetObjects[i]);
        initSheet(sheetObjects[i], i + 1);
        ComEndConfigSheet(sheetObjects[i]);
    }
//  axon_event.addListenerFormat('keypress', 'obj_keypress', form); //- form 전체 컨트롤 중 dataformat 속성이 있는 모든 컨트롤의 onkeypress이벤트에 코드 처리
//  axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
    doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}
//  function obj_keypress(){
//      obj=event.srcElement;
//      if(obj.dataformat == null) return;
//      window.defaultStatus=obj.dataformat;
//      switch(obj.dataformat) {
//          case "ymd":
//          case "ym":
//          case "hms":
//          case "hm":
//          case "jumin":
//          case "saupja":
//              ComKeyOnlyNumber(obj);
//              break;
//          case "int":
//              if(obj.name=="txtInt") ComKeyOnlyNumber(obj, "-")
//              else ComKeyOnlyNumber(obj);
//              break;
//          case "float":
//              ComKeyOnlyNumber(obj, "-.");
//              break;
//          case "eng":
//              ComKeyOnlyAlphabet(); break;
//          case "engup":
//              if(obj.name=="spec_yr"){ ComKeyOnlyNumber(obj)}
//              else if(obj.name=="curr_desc"){ComKeyOnlyAlphabet('uppernum')}
//              else ComKeyOnlyAlphabet('upper');
//              break;
//          case "engdn":
//              if(obj.name=="txtEngDn2") ComKeyOnlyAlphabet('lowernum')
//              else ComKeyOnlyAlphabet('lower');
//              break;
//      }
//  }
/**
 * 시트 초기설정값, 헤더 정의 param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인
 * 일련번호 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
 */
function initSheet(sheetObj, sheetNo) {
    var cnt=0;
    var sheetID=sheetObj.id;
    switch (sheetID) {
    case "sheet1":
        with(sheetObj){
              var HeadTitle;
              if(mainPage == undefined){
              HeadTitle="||Currency|Country|Description";
              }else{
              HeadTitle="Currency|Country|Description";
              }
              var mdmYN=document.form.mdm_yn.value;
              if(mdmYN.replace(/\s/g,"") != ""){
              HeadTitle += "|Status";
              }
              var headCount=ComCountHeadTitle(HeadTitle);
              (headCount, 0, 0, true);
              SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
              var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
              var headers = [ { Text:HeadTitle, Align:"Center"} ];
              InitHeaders(headers, info);
              var cols = [ {Type:"Radio",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"radio",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
  	                     {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"checkbox",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
  	                     {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"curr_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
  	                     {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:"cnt_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
  	                     {Type:"Text",      Hidden:0,  Width:180,  Align:"Left",    ColMerge:1,   SaveName:"curr_desc",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
              
              if(mainPage != undefined){
	              cols = [ {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"curr_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                       {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:"cnt_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                       {Type:"Text",      Hidden:0,  Width:180,  Align:"Left",    ColMerge:1,   SaveName:"curr_desc",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
              }
              if(mdmYN.replace(/\s/g,"") != ""){
            	  cols.push({Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:"delt_flg",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 });
              }
              InitColumns(cols);
              SetEditable(1);
              //SetCountPosition(0);
              SetCountFormat("[SELECTDATAROW / TOTALROWS]");
              SetWaitImageVisible(false);
              SetSheetHeight(310);
              //resizeSheet();
          }
        break;
    }
}

/*function resizeSheet(){
	 ComResizeSheet(sheetObjects[0]);
}*/

// Sheet관련 프로세스 처리
function doActionIBSheet(sheetObj, formObj, sAction) {
    switch (sAction) {
    case IBSEARCH: // 조회
        if (sheetObj.id == "sheet1") {
            formObj.f_cmd.value=SEARCH;
            ComOpenWait(true);
            sheetObj.DoSearch("COM_ENS_N13GS.do", FormQueryString(formObj) );
        }
        break;
    case COMMAND01: // 선택
        var selrow = sheetObj.GetSelectRow();
        if (selrow > 0) {
            comPopupOK();
        }
        break;
    }
}
///**
// * 그리드에서 더블클릭했을 때의 처리 : 선택한 값을 부모창으로 리턴하고, 팝업창을 닫는다.
// */
//function sheet1_OnDblClick(sheetObj, row, col, value) {
//    var selrow=sheetObj.GetSelectRow();
//    if (selrow > 0) {
//        comPopupOK();
//    }
//}

function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) { 
    ComOpenWait(false);
}
/* 개발자 작업 끝 */
