/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_0M1.js
*@FileTitle  : Country
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
                    [수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
                    기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
 
/* 공통전역변수 */
var ipageNo =1 ;

var sheetObjects = new Array();
var sheetCnt = 0;
var selectVal;
var mainPage;
/* 업무별전역변수는 아래 부분에 추가 선언하여 사용한다. */
//var opener = parent;

/* 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick = processButtonClick;

/* 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */    
function processButtonClick(){
     /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
     var sheetObject=sheetObjects[0];
     /*******************************************************/
     var formObject=document.form;
    try {
        var srcName=ComGetEvent("name");
        /***********************************************************************************************************
            이미지 클릭 이벤트 처리, popup도 역시 이곳에서 함
            공통코드: CoFormControl.js 에 정의 되어있습니다. 이 변수를 통하여 ServiceCommand에서 분기 합니다.        
         **********************************************************************************************************/
        switch(srcName) {
            case "btn_Retrieve":
                doActionIBSheet(sheetObject,formObject,IBSEARCH);
                break;
            case "btn_New":
                sheetObject.RemoveAll();
                formObject.reset();
                break;
            case "btn_Close":
                ComClosePopup(); 
                break;
            case "btn_OK":
                comPopupOK();
                break;
            case "btn2_Down_Excel":
                if(sheetObject.RowCount() < 1){//no data
                    ComShowCodeMessage("COM132501");
                }else{
                    sheetObject.Down2Excel({ HiddenColumn:1,Merge:1,TreeLevel:1, AutoSizeColumn:1,CheckBoxOnValue:"Y",CheckBoxOffValue:"N"});
                }
                break;
        } // end switch
    }catch(e) {            
        if( e == "[object Error]") {
            ComShowMessage(OBJECT_ERROR);
        } else {
            ComShowMessage(e);
        }
    }
}
/**
 * IBSheet Object를 배열로 등록
 * comSheetObject(id)에서 호출한다
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
 function loadPage(mainpage) {
     mainPage=mainpage;
    for(i=0;i<sheetObjects.length;i++){
        //khlee-시작 환경 설정 함수 이름 변경
        ComConfigSheet(sheetObjects[i]);
        initSheet(sheetObjects[i],i+1);
        //khlee-마지막 환경 설정 함수 추가
        ComEndConfigSheet(sheetObjects[i]);
    }
    initControl();
    
    doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
}
 function initControl() {
     //Axon 이벤트 처리1. 이벤트catch(개발자변경)
     //axon_event.addListenerForm ('keydown', 'ComKeyEnter', document.form);
 }

/**
 * 시트 초기설정값, 헤더 정의
 * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
 * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
 */
function initSheet(sheetObj,sheetNo) {
    var cnt=0;
    switch(sheetNo) {
        case 1:      //IBSheet1 init
            with(sheetObj){
                var HeadTitle;
                if(mainPage == undefined){
                    HeadTitle="||Seq.|Code|Name|Continent Code|Continent|Sub Continent Code|Sub Continent|ISO Code|Currency" ;
                }else{
                    HeadTitle="Seq.|Code|Name|Continent Code|Continent|Sub Continent Code|Sub Continent|ISO Code|Currency" ;
                }
                var mdmYN=document.form.mdm_yn.value;
                if(mdmYN.replace(/\s/g,"") != ""){
                    HeadTitle += "|Status";
                }
                var headCount=ComCountHeadTitle(HeadTitle);
    
                SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:0 } );
    
                var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1, HeaderCheck:0 };
                var headers = [ { Text:HeadTitle, Align:"Center"} ];
                InitHeaders(headers, info);

                if(mainPage == undefined){
                    var cols = [ {Type:"Radio",     Hidden:0, Width:20,   Align:"Center",  ColMerge:0,   SaveName:"radio",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                                 {Type:"CheckBox",  Hidden:0, Width:35,   Align:"Center",  ColMerge:0,   SaveName:"checkbox",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                                 {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"seq",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"cnt_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                                 {Type:"Text",      Hidden:0,  Width:170,  Align:"Left",    ColMerge:0,   SaveName:"cnt_nm",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                                 {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"conti_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                                 {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"conti_nm",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                                 {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"sconti_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Center",  ColMerge:0,   SaveName:"sconti_nm",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                                 {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"cnt_iso_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                                 {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"curr_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 }];
                }else{
                    var cols = [ {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"seq",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                                 {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"cnt_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                                 {Type:"Text",      Hidden:0,  Width:170,  Align:"Left",    ColMerge:0,   SaveName:"cnt_nm",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                                 {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"conti_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                                 {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"conti_nm",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                                 {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"sconti_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Center",  ColMerge:0,   SaveName:"sconti_nm",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                                 {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"cnt_iso_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                                 {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"curr_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 }];
                }

                if(mdmYN.replace(/\s/g,"") != ""){
                    cols.push({Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"delt_flg",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                }
                 
                InitColumns(cols);
                SetCountFormat("[SELECTDATAROW / TOTALROWS]");
                SetWaitImageVisible(0);
                //SetSheetHeight(ComGetSheetHeight(sheetObj, 12));
                SetSheetHeight(310);
                //resizeSheet()
                RemoveAll();//this code very important

            }
            break;
    }
}
/*function resizeSheet(){
	 ComResizeSheet(sheetObjects[0]);
}*/

/* Sheet관련 프로세스 처리 */
function doActionIBSheet(sheetObj,formObj,sAction, a, PageNo) {
    switch(sAction) {
      case IBSEARCH:        //조회
            if(!validateForm(sheetObj,formObj,sAction))  return false;
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH;                
            selectVal=FormQueryString(formObj);
            iPageNo = 1;
            sheetObj.DoSearch("COM_ENS_0M1GS.do", selectVal );
       break;
       case IBSEARCHAPPEND:  // 페이징 조회
            formObj.f_cmd.value=SEARCHLIST;  
            sheetObj.DoSearch("COM_ENS_0M1GS.do", selectVal+"&iPage=" + iPageNo,{Append:true} );
       break;
    }
}
/**
 * 화면 폼입력값에 대한 유효성검증 프로세스 처리
 */
function validateForm(sheetObj,formObj,sAction){
    with(formObj){
    }
    return true;
}
/**
 * 국가 선택에 따른 해당 주(State) 목록 세팅
 */
function setSubConti(){
    var formObject=document.form;
    //formObject.cnt_cd.value = formObject.conti_cd.value;
    formObject.target="iframe_bizcom";
    formObject.action="/opuscntr/bizcommon/common/COM_ENS_COMMON.jsp";
    result=formObject.submit();
}

var iPageNo = 1;

function sheet1_OnVScroll(sheetObj, vpos, oldvpos, isTop, isBottom) {
	var iLast = sheetObj.LastRow();
	if (iLast >= sheetObj.GetTotalRows()) return;

	if (isBottom || (iLast-12) == sheetObj.GetTopRow()) {
		doActionIBSheet(sheetObj, document.form, IBSEARCHAPPEND, true, ++iPageNo);
	}
}

function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) {
    sheetObj.FitColWidth();
    ComOpenWait(false);
}