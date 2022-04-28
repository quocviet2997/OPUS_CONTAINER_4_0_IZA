/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_011.js
*@FileTitle  : Commodity inquiry
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/02
=========================================================*/
// 공통전역변수
var ipageNo=1 ;
var sheetObjects=new Array();
var sheetCnt=0;
var selectVal;
var mainPage;

/* 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick=processButtonClick;

/* 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
function processButtonClick(){
    /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
    var sheetObject=sheetObjects[0];
    /*******************************************************/
    var formObject=document.form;
    try {
        var srcName=ComGetEvent("name");
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
                if(sheetObject.RowCount() < 1){
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
            ComShowMessage(e);
        }
    }
}

function initControl() {
    var formObject=document.form;
    //Axon 이벤트 처리1. 이벤트catch(개발자변경)
    axon_event.addListenerFormat('keypress', 'keypressFormat', formObject);
    axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
}

//업무 자바스크립트 OnKeyPress 이벤트 처리
function keypressFormat() {
    obj=ComGetEvent();
    if(obj.dataformat == null) return;
    window.defaultStatus=obj.dataformat;
    switch(obj.dataformat) {
        case "num":
            ComKeyOnlyNumber(obj);
            break;
        case "engup":
            if(obj.name == "cmdt_nm"){
                ComKeyOnlyAlphabet('upper','32');
            }else{
                ComKeyOnlyAlphabet('upper');
            }
            break;
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
     var sheetObject=sheetObjects[0];
     var formObject=document.form;
     doActionIBSheet(sheetObject,formObject,IBSEARCH);
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
                var mdmYN=document.form.mdm_yn.value;
                var cols;
                if(mainPage ==undefined){
                    HeadTitle="||Code|Brief Description|REP|DG|Create/update Date" ;
    
                    if(mdmYN.replace(/\s/g,"") != ""){
                        HeadTitle += "|Status";
                    }
    
                    var headCount=ComCountHeadTitle(HeadTitle);
                    
                    SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
                    
                    var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                    var headers = [ { Text:HeadTitle, Align:"Center"} ];
                    InitHeaders(headers, info);
                    
                    var cols = [{Type:"Radio",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"radio",      KeyField:0,   CalcLogic:"",   Format:"", PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                                {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"checkbox",   KeyField:0,   CalcLogic:"",   Format:"", PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                            {Type:"Text",      Hidden:0, Width:60,   Align:"Center",  ColMerge:0,   SaveName:"cmdt_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                            {Type:"Text",      Hidden:0, Width:400,  Align:"Left",    ColMerge:0,   SaveName:"cmdt_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                            {Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"rep_cmdt_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                            {Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"rep_imdg_lvl_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                            {Type:"Text",      Hidden:0, Width:130,  Align:"Center",  ColMerge:0,   SaveName:"upd_dt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 } ];
    
                    if(mdmYN.replace(/\s/g,"") != ""){
                        cols.push({Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"delt_flg",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                    }
                }
                else {
                    HeadTitle="Code|Brief Description|REP|DG|Create/update Date" ;
    
                    if(mdmYN.replace(/\s/g,"") != ""){
                        HeadTitle += "|Status";
                    }
    
                    var headCount=ComCountHeadTitle(HeadTitle);
                    
                    SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
                    
                    var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                    var headers = [ { Text:HeadTitle, Align:"Center"} ];
                    InitHeaders(headers, info);
                    
                    var cols = [{Type:"Text",      Hidden:0, Width:60,   Align:"Center",  ColMerge:0,   SaveName:"cmdt_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                                {Type:"Text",      Hidden:0, Width:400,  Align:"Left",    ColMerge:0,   SaveName:"cmdt_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                                {Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"rep_cmdt_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                                {Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"rep_imdg_lvl_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                                {Type:"Text",      Hidden:0, Width:130,  Align:"Center",  ColMerge:0,   SaveName:"upd_dt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 } ];
    
                    if(mdmYN.replace(/\s/g,"") != ""){
                        cols.push({Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"delt_flg",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                    }
                }
    
                InitColumns(cols);
                SetWaitImageVisible(0);
                SetEditable(1);
//                SetSheetHeight(220);
                ComResizeSheet(sheetObj);
            }

        break;
    }
}

function sheet1_OnScrollNext(sheet,CondParam, PageNo, OnePageRows) {
    // TODO:sheet에 해당하는 객체와 폼 오브젝트를 doActionIBSheet 함수에 보내 주어야합니다.
    doActionIBSheet(sheetObjects[0], document.form, IBSEARCHAPPEND, true, PageNo);
} 

// Sheet관련 프로세스 처리
function doActionIBSheet(sheetObj,formObj,sAction, a, PageNo) {
    sheetObj.ShowDebugMsg(false);
    switch(sAction) {
       case IBSEARCH:         // 조회
    	    ComOpenWait(true);
            formObj.f_cmd.value=SEARCH;   
            selectVal=FormQueryString(formObj);
            sheetObj.DoSearch("COM_ENS_011GS.do", selectVal );
       break;
       case IBSEARCHAPPEND:  // 페이징 조회
            formObj.f_cmd.value=SEARCH;
            sheetObj.DoSearch("COM_ENS_011GS.do", selectVal+"&"+ "iPage=" + PageNo,{Append:true} );
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

function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) { 
	ComOpenWait(false);
}