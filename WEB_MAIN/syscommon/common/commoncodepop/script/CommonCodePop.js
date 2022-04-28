/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CommonCodePop.js
*@FileTitle : 공통코드검색
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-08
*@LastModifier : HOESOO_JANG
*@LastVersion : 1.0
* 2006-09-08 HOESOO_JANG
* 1.0 최초 생성
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
var docObjects = new Array();
var sheetCnt = 0;

/* 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick = processButtonClick;

/* 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
    function processButtonClick(){
         /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
         var sheetObject = docObjects[0];
         /*******************************************************/
         var formObject = document.codeFrm;

    	try {
    		var srcName = window.event.srcElement.getAttribute("name");

            switch(srcName) {
			
        	    case "btn_retrieve":
    	            doActionIBSheet(sheetObject,formObject,IBSEARCH);
        	        break;

        	    case "btn_ok":
    	              alert("btn_ok Click!!");
        	      break;

        	    case "btn_close":
    	              window.close();
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
     * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
     * 배열은 소스 상단에 정의
     */
    function setDocumentObject(sheet_obj){
       docObjects[sheetCnt++] = sheet_obj;
    }

    /**
     * Sheet 기본 설정 및 초기화
     * body 태그의 onLoad 이벤트핸들러 구현
     * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
     */
    function loadPage() {
        for(i=0;i<docObjects.length;i++){

        //khlee-시작 환경 설정 함수 이름 변경
            comConfigSheet(docObjects[i],SYSTEM_BMS);
            initSheet(docObjects[i],i+1);
        //khlee-마지막 환경 설정 함수 추가
        	
            comEndConfigSheet(docObjects[i]);

	        //alert(docObjects[i].id);
        }
        
        //alert(document.codeFrm.name);
        doActionIBSheet(docObjects[0],document.codeFrm,IBSEARCH);

    }

   /**
     * 시트 초기설정값, 헤더 정의
     * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
     * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
     */
    function initSheet(sheetObj,sheetNo) {

        var cnt = 0;

        switch(sheetNo) {
             case 1:      //IBSheet1 init

                with (sheetObj) {

                    // 높이 설정
                    style.height = 240 ;
                    //전체 너비 설정
                    SheetWidth = mainTable.clientWidth;

                    //Host정보 설정[필수][HostIp, Port, PagePath]
                    if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);

                    //전체Merge 종류 [선택, Default msNone]
                    MergeSheet = msHeaderOnly;

                   //전체Edit 허용 여부 [선택, Default false]
                    Editable = true;

                    //행정보설정[필수][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
                    InitRowInfo( 1, 1, 9, 100);

                    //컬럼정보설정[필수][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
                    InitColumnInfo(5, 0, 0, true);

                    // 해더에서 처리할 수 있는 각종 기능을 설정한다
                    InitHeadMode(true, true, false, true, false,false) ;

                    var HeadTitle = " |Code ID|Code Value|Code Display Name|Code Value Description" ;

                    //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                    InitHeadRow(0, HeadTitle, false);

                    //데이터속성    [ROW, COL,  DATATYPE,   WIDTH, DATAALIGN, COLMERGE, SAVENAME,  KEYFIELD, CALCULOGIC, DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
                    InitDataProperty(0, cnt++ , dtRadioCheck, 30,    daCenter,  false,   "");
                    InitDataProperty(0, cnt++ , dtData,       90,    daCenter,  false,   "sheet1_code_id",         false,          "",       dfDateYmd,   	0,     true,       true);
                    InitDataProperty(0, cnt++ , dtData,       80,    daCenter,  false,   "sheet1_code_value",         false,          "",       dfTimeHm,   	0,     true,       true);
                    InitDataProperty(0, cnt++ , dtData,      120,    daCenter,  false,   "sheet1_code_name",         false,          "",       dfNone,	        0,     true,       true);
                    InitDataProperty(0, cnt++ , dtData,       70,    daCenter,  false,   "sheet1_code_desc",         false,          "",       dfNone,   	0,     true,       true);

//                    FitColWidth();

               }
               break;

        }
    }

  // Sheet관련 프로세스 처리
    function doActionIBSheet(sheetObj,formObj,sAction) {
        sheetObj.ShowDebugMsg = false;
	
        switch(sAction) {
           case IBSEARCH:      //조회
                if(validateForm(sheetObj,formObj,sAction)){              
                    sheetObj.DoSearch4Post("com.clt.syscommon.codepop.CodePopupSearch.do", FormQueryString(formObj));
                    
                 }
               //sheetObj.DoSearch4Post("com.clt.apps.bms.bms.pfm.managemarketstatus.UIBMSPFM001Action.do", FormQueryString(formObj));
                break;
        }
    }

   /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj,formObj,sAction){
        return true;
    }
    
    
    /**
     * 시트명_OnScrollNext(시트명에 해당하는 OnScrollNext 이벤트)를 구현해주며, 이 함수는
     * 시트에서 스크링이 마지막까지 되었을 때 발생된다.<br>
     * 페이징을 할 때 필요한 것은 sheet에 해당하는 폼에 iPage INPUT tag를 선언해 주어야 한다.
     * 
     */
    function sheet1_OnScrollNext(CondParam, PageNo, OnePageRows) {
       document.form.iPage.value = PageNo;
       // TODO:sheet에 해당하는 객체와 폼 오브젝트를 doActionIBSheet 함수에 보내 주어야합니다.
       doActionIBSheet(docObjects[0], document.form, IBSEARCH, true);
    }
    
    
	/**
     * opener로 값을 리턴하는 기능 구
     * opener의 폼 element로 리턴하는 경우는 settingData함수를 사용하고,
     * opener의 IBSheet로 리턴하는 경우는 settingDataIBSheet를 사용합니다.
     * 사용방법은 동일하지만 두 함수 내에서 처리하는 로직만 다릅니다.
     * 둘중 하나만 사용한다 .
     */
    function sheet1_OnDblClick(sheetObj, Row, Col) {
    	// 1. form control에 들어갈 .
        try{
			//alert(sheetObj.CellValue(Row, "sheet1_code_id"));
			//alert(sheetObj.CellValue(Row, "sheet1_code_value"));
			//alert(sheetObj.CellValue(Row, "sheet1_code_name"));
			//alert(sheetObj.CellValue(Row, "sheet1_code_desc"));
                                
                                
         	settingData(sheetObj.CellValue(Row, "sheet1_code_id"),
         				sheetObj.CellValue(Row, "sheet1_code_value"),
         				sheetObj.CellValue(Row, "sheet1_code_name"),
         				sheetObj.CellValue(Row, "sheet1_code_desc"));
         	
        }catch(e){}
        
    	// 2. ibSheet control에 들어갈 .        
        //try{
        // settingDataIBSheet(sheetObj.CellValue(Row, "sheet1_code"),sheetObj.CellValue(Row, "sheet1_name"));
        //}catch(e){}
        
    }
    
    
    
    
    
    
    
