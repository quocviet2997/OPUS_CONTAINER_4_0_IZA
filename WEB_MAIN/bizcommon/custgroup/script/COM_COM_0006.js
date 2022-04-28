/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_COM_0006.js
*@FileTitle  : 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
// 공통전역변수
var ipageNo =1 ;

var sheetObjects = new Array();
var sheetCnt = 0;
var selectVal;

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
        switch(srcName) {
    	    case "btn_Retrieve":
	            doActionIBSheet(sheetObject,formObject,IBSEARCH);
    	        break;
            case "btn_Close":
            	ComClosePopup(); 
    	        break;
    	    case "btn_OK":
                comPopupOK();
    	        break;
    	    case "btn_Down_Excel":
    	    	sheetObject.Down2Excel({ DownCols: makeHiddenSkipCol(sheetObject),HiddenColumn:false,Merge:false,TreeLevel:false});
    	        break;
    	    case "btn_New":
    	    	formObject.reset();
    	    	sheetObject.RemoveAll();
    	    	formObject.delt_flg.value="N";
    	    	iPageNo = 1;
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
    	//khlee-시작 환경 설정 함수 이름 변경
        ComConfigSheet(sheetObjects[i]);
        initSheet(sheetObjects[i],i+1);
        //khlee-마지막 환경 설정 함수 추가
        ComEndConfigSheet(sheetObjects[i]);
    }
    initControl();
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
	        	var mdmYN=document.form.mdm_yn.value;
	        	var HeadTitle="||Code|Name|Abbreviation|Control Office" ;
	        	if(mdmYN.replace(/\s/g,"") != ""){
	        		HeadTitle += "|Status";
	        	}
	
	        	SetConfig( { SearchMode:2, MergeSheet:0, Page:200, FrozenCol:0, FrozenCol:0, DataRowMerge:1 } );
	
	        	var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
	        	var headers = [ { Text:HeadTitle, Align:"Center"} ];
	        	InitHeaders(headers, info);
	
	        	var cols = [ {Type:"Radio",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"radio",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	        	             {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"checkbox",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	        	             {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"cust_grp_id",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	        	             {Type:"Text",      Hidden:0, Width:160,  Align:"Left",    ColMerge:0,   SaveName:"cust_grp_nm",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	        	             {Type:"Text",      Hidden:0, Width:160,  Align:"Left",    ColMerge:0,   SaveName:"cust_grp_abbr_nm",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	        	             {Type:"Text",      Hidden:0, Width:110,  Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 } ];
	        	if(mdmYN.replace(/\s/g,"") != ""){
	        		cols.push({Type:"Text",      Hidden:0, Width:75,   Align:"Center",  ColMerge:0,   SaveName:"delt_flg",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
	        	}
	        	 
	        	InitColumns(cols);
	
	        	//SetCountPosition(0);
	            SetCountFormat("[SELECTDATAROW / TOTALROWS]");
	        	SetWaitImageVisible(0);
	        	SetSheetHeight(ComGetSheetHeight(sheetObj, 10));

        	}

            break;
    }
}

// Sheet관련 프로세스 처리
function doActionIBSheet(sheetObj,formObj,sAction, a, PageNo) {
    switch(sAction) {
       case IBSEARCH:      //조회
            if(validateForm(sheetObj,formObj,sAction)) {
            	ComOpenWait(true);
            	iPageNo = 1;
            	 formObj.f_cmd.value=SEARCH;
                 selectVal=FormQueryString(formObj);
                 sheetObj.DoSearch("COM_COM_0006GS.do", selectVal);
            }else{
            	return true;
            }
       break;
       case IBSEARCHAPPEND:  // 페이징 조회
       	   ComOpenWait(true);
           formObj.f_cmd.value=SEARCH;
           selectVal=FormQueryString(formObj);
           sheetObj.DoSearch("COM_COM_0006GS.do", selectVal + "&iPage=" + iPageNo, {Append:true} );
           break;

    }
}

var iPageNo = 1;
function sheet1_OnVScroll(sheetObj, vpos, oldvpos, isTop, isBottom) {
    if (!isBottom || sheetObj.RowCount() >= sheetObj.GetTotalRows()) return;
    doActionIBSheet(sheetObj, document.form, IBSEARCHAPPEND, true, ++iPageNo);
}

function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) { 
	ComOpenWait(false);
}
/**
 * 화면 폼입력값에 대한 유효성검증 프로세스 처리
 */
function validateForm(sheetObj,formObj,sAction){
	 switch(sAction){}
    return true;
}
