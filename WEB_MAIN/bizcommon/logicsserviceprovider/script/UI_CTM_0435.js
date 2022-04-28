/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : UI_CTM_0435.js
*@FileTitle  : Lane 조회(공통 Popup)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/20
=========================================================*/
var sheetObjects=new Array();
var sheetCnt=0;
var selectVal;
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
                    doActionIBSheet(sheetObject,formObject,IBSEARCH);
                    break;
                case "btn_new":
                	sheetObject.RemoveAll();
    	            formObject.reset();
                    break;
                case "btn_ok":
                	doActionIBSheet(sheetObject, document.form, COMMAND01);
                    break;
                case "btn_close":
                	ComClosePopup(); 
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
            ComConfigSheet (sheetObjects[i] );
            initSheet(sheetObjects[i],i+1);
        //khlee-마지막 환경 설정 함수 추가
            ComEndConfigSheet(sheetObjects[i]);
        }
        axon_event.addListenerFormat('keypress', 'obj_keypress', form); //- 키보드 입력할때
        axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
    }
 	function obj_keypress(){
	    obj=event.srcElement;
	    if(obj.dataformat == null) return;
	    window.defaultStatus=obj.dataformat;
	    switch(obj.dataformat) {
	        case "engup":
	            ComKeyOnlyAlphabet('uppernum');
	            break;
	    }
	}
	/**
     * 시트 초기설정값, 헤더 정의
     * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
     * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
     */
    function initSheet(sheetObj,sheetNo) 
     {
        var cnt=0;
        switch(sheetNo) {
            case 1:      //t1sheet1 init
                with(sheetObj){
                
		              var HeadTitle="||S/P Code|Control Office|Name|Address";
		
		              SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:0 } );
		
		              var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		              var headers = [ { Text:HeadTitle, Align:"Center"} ];
		              InitHeaders(headers, info);
		
		              var cols = [ {Type:"Radio",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"radio",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                     {Type:"CheckBox",  Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"checkbox",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                     {Type:"Text",      Hidden:0, Width:60,   Align:"Center",  ColMerge:0,   SaveName:"vndr_seq",         KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",           KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Text",      Hidden:0, Width:210,  Align:"Left",    ColMerge:0,   SaveName:"vndr_lgl_eng_nm",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:25 },
		                     {Type:"Text",      Hidden:0, Width:110,  Align:"Left",    ColMerge:0,   SaveName:"eng_addr",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:30 },
		                     {Type:"Text",      Hidden:1, Width:60,   Align:"Center",  ColMerge:0,   SaveName:"usa_edi_cd",       KeyField:0,   CalcLogic:"",   Format:"" },
		                     {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"pagerows",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                     {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ibflag" } ];
		               
		              InitColumns(cols);
		              SetEditable(1);
		              SetSheetHeight(177);
                    }
              break;
        }
    }
    function sheet1_OnScrollNext(sheet,CondParam, PageNo, OnePageRows) 
     {
         // TODO:sheet에 해당하는 객체와 폼 오브젝트를 doActionIBSheet 함수에 보내 주어야합니다.
         doActionIBSheet(sheetObjects[0], document.form, IBSEARCHAPPEND, true, PageNo);
     } 
     // Sheet관련 프로세스 처리
     function doActionIBSheet(sheetObj,formObj,sAction) 
     {
        sheetObj.ShowDebugMsg(false);
         switch(sAction) 
        {
	       	case IBSEARCH: // 조회
		   		if (sheetObj.id == "sheet1") {
		   			formObj.f_cmd.value=SEARCH;
		   			sheetObj.DoSearch("UI_CTM_0435GS.do", FormQueryString(formObj) );
		   		}
		   		break;
			case COMMAND01: // 선택
		   		var selrow=sheetObj.GetSelectRow();
		   		if (selrow > 0) {
		   			comPopupOK();
		   		}
		   		break;
           case IBSEARCHAPPEND:  // 페이징 조회
	           formObj.f_cmd.value=SEARCH;         
	           sheetObj.DoSearch("UI_CTM_0435GS.do", selectVal+"&"+ "iPage=" + PageNo,{Append:true} );
	           break;
        }
         sheetObj.ShowDebugMsg(false);
    }
	/**
	 * 그리드에서 더블클릭했을 때의 처리 : 선택한 값을 부모창으로 리턴하고, 팝업창을 닫는다.
	 */
	function sheet1_OnDblClick(sheetObj, row, col, value) {
		var selrow=sheetObj.GetSelectRow();
		if (selrow > 0) {
			comPopupOK();
		}
	}
