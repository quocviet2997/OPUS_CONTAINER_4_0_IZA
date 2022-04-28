/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : errormessagemanagement.js
*@FileTitle : Error Message Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.26
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2009.02.26 김경범
* 1.0 Creation
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
     * @class Error Message Management : Error Message Management 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
     */
    function errormessagemanagement() {
    	this.processButtonClick		= tprocessButtonClick;
    	this.setSheetObject 		= setSheetObject;
    	this.loadPage 				= loadPage;
    	this.initSheet 				= initSheet;
    	this.initControl            = initControl;
    	this.doActionIBSheet 		= doActionIBSheet;
    	this.setTabObject 			= setTabObject;
    	this.validateForm 			= validateForm;
    }
    
   	/* 개발자 작업	*/

  	// 공통전역변수
	var tabObjects = new Array();
	var tabCnt = 0 ;
	var beforetab = 1;
	var sheetObjects = new Array();
	var sheetCnt = 0;

	// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
	document.onclick = processButtonClick;

	// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
    function processButtonClick(){
         /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
         var sheetObject1 = sheetObjects[0];
         /*******************************************************/
         var formObject = document.form;

    	try {
    		var srcName = window.event.srcElement.getAttribute("name");
            switch(srcName) {
            	case "btn_Search":
            		if ( document.getElementById("search_text").value == "" ) return;
            		findXML(document.getElementById("search").value, document.getElementById("search_text").value);
            		break;
            		
            	case "btn_Confirm":
            		comPopupOK();
            		break;

            	case "btn_Close":
            		self.close();
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
     * 페이지에 생성된 IBSheet Object를 sheetObjects배열에 등록한다. <br>
     * sheetObjects 배열은 공통전역변수로 상단에 정의하고, 이 함수는 {@link CoObject#ComSheetObject} 함수에 의해서 IBSheet Object가 생성되면서 자동 호출된다. <br>
     * @param {ibsheet} sheet_obj    IBSheet Object
     **/
    function setSheetObject(sheet_obj){
       sheetObjects[sheetCnt++] = sheet_obj;
    }

    /**
     * body.onload 이벤트에서 호출되는 함수로 페이지 로드완료 후 선처리해야할 기능을 추가한다. <br>
     * HTML컨트롤의 각종 이벤트와 IBSheet, IBTab 등을 초기화 한다. <br>
     **/
    function loadPage() {
    	    	
    	for(i=0;i<sheetObjects.length;i++){
			//khlee-시작 환경 설정 함수 이름 변경
			ComConfigSheet (sheetObjects[i]);
			initSheet(sheetObjects[i],i+1);
			//khlee-마지막 환경 설정 함수 추가
			ComEndConfigSheet(sheetObjects[i]);
		}
    }

    /**
     * 페이지에 있는 IBSheet Object를 초기화 한다. <br>
     * IBSheet가 여러개일 경우 개수만큼 case를 추가하여 IBSheet 초기화 모듈을 구성한다. <br>
     * {@link #loadPage}함수에서 이 함수를 호출하여 IBSheet Object를 초기화 한다. <br>
     * @param {ibsheet} sheetObj    IBSheet Object
     * @param {int}     sheetNo     sheetObjects 배열에서 순번
     **/
    function initSheet(sheetObj,sheetNo) {
        var cnt = 0;
		var sheetID = sheetObj.id;
        switch(sheetID) {
            case "sheet1":
                with (sheetObj) {
                    // 높이 설정
                    style.height = 262;
                    //전체 너비 설정
                    SheetWidth = mainTable.clientWidth;
                    //Host정보 설정[필수][HostIp, Port, PagePath]
                    if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);
                    //전체Merge 종류 [선택, Default msNone]
                    MergeSheet = msHeaderOnly;
                   //전체Edit 허용 여부 [선택, Default false]
                    Editable = true;
                    //행정보설정[필수][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
                    InitRowInfo(1, 1, 2, 100);
                    var HeadTitle = "||Dept.|Name|Mail|Phone|ID|Local Name|Position|Job Name|Job Code|Dept. Code|Init. Name|Title|SIP" ;
					var headCount = ComCountHeadTitle(HeadTitle);
                    //컬럼정보설정[필수][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
                    InitColumnInfo(headCount, 0, 0, true);
                    // 해더에서 처리할 수 있는 각종 기능을 설정한다
                    //InitHeadMode(true, true, false, true, false,false);
                    //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                    InitHeadRow(0, HeadTitle, true);
                    
                    //데이터속성    	[ROW, COL,  DATATYPE,   	WIDTH, DATAALIGN, 		COLMERGE, 	SAVENAME,  		KEYFIELD, CALCULOGIC, DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
                    InitDataProperty(0, cnt++ , dtRadioCheck,30,    daCenter,  false,    "radio",           false,          "",       dfNone,	    0,     true,       true);
                    InitDataProperty(0, cnt++ , dtCheckBox,  30,    daCenter,  false,    "checkbox",           false,          "",       dfNone,   	0,     true,       true);
                    InitDataProperty(0, cnt++ , dtData,         120,    daLeft,  false,   "TEAMNM",  false,          "",       dfNone,   			0,     false,      true);
                    InitDataProperty(0, cnt++ , dtData,         110,    daLeft,  false,   "NAME",	 false,          "",       dfNone,   			0,     false,       true);                    
                    InitDataProperty(0, cnt++ , dtData,         150,    daLeft,    false,   "MAIL",     false,          "",       dfNone,	        0,     false,       true);
                    InitDataProperty(0, cnt++ , dtData,         100,    daLeft,    false,   "PHONE",    false,         "",       dfNone,	        0,     false,       true);                    

                    InitDataProperty(0, cnt++ , dtData,         100,    daLeft,    false,   "CN",    false,         "",       dfNone,	        0,     false,       true);                    
                    InitDataProperty(0, cnt++ , dtData,         100,    daLeft,    false,   "LNAME",    false,         "",       dfNone,	        0,     false,       true);                    
                    InitDataProperty(0, cnt++ , dtData,         100,    daLeft,    false,   "POS",    false,         "",       dfNone,	        0,     false,       true);                    
                    InitDataProperty(0, cnt++ , dtData,         100,    daLeft,    false,   "JOB",    false,         "",       dfNone,	        0,     false,       true);                    
                    InitDataProperty(0, cnt++ , dtData,         100,    daLeft,    false,   "JCODE",    false,         "",       dfNone,	        0,     false,       true);                    
                    InitDataProperty(0, cnt++ , dtData,         100,    daLeft,    false,   "TEAM",    false,         "",       dfNone,	        0,     false,       true);                    
                    InitDataProperty(0, cnt++ , dtData,         100,    daLeft,    false,   "INITNM",    false,         "",       dfNone,	        0,     false,       true);                    
                    InitDataProperty(0, cnt++ , dtData,         100,    daLeft,    false,   "BUJAE",    false,         "",       dfNone,	        0,     false,       true);                    
                    InitDataProperty(0, cnt++ , dtData,         100,    daLeft,    false,   "SIP",    false,         "",       dfNone,	        0,     false,       true);                    
                    CountPosition = 0;
                }
                break;

        }
    }

     // OrganTree 로 부터 받은 HashMap 결과를 시트에 바인딩
    function loadData(data) {
    	var sheetObject = sheetObjects[0];
    	var sheetXml = "<SHEET><DATA COLSEPARATOR='|'>";
    	for( var i = 0 ; i < data.length ; i++ ) {
    		sheetXml += "<TR><![CDATA[|";
    		for ( var j = 0 ; j < 13 ; j++ ) sheetXml += "|"+data[i].getPos(j);
    		sheetXml += "]]></TR>";
    	}
    	//alert(sheetXml+"</DATA></SHEET>");
    	sheetObject.LoadSearchXml(sheetXml+"</DATA></SHEET>");
}
	/* 개발자 작업  끝 */