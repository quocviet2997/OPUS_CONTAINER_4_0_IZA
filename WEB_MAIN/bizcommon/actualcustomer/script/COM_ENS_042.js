// 공통전역변수
var ipageNo1 =1 ;
var ipageNo2 =1 ;

var sheetObjects = new Array();
var sheetCnt = 0;
var selectVal;

/* 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick = processButtonClick;

/* 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
    function processButtonClick(){
         /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
         var sheetObject = sheetObjects[0];
         var sheetObject1 = sheetObjects[1];
         /*******************************************************/
         var formObject = document.form;

    	try {
    		var srcName = window.event.srcElement.getAttribute("name");

            switch(srcName) {

        	    case "btn_Retrieve":
            	    sheetObject1.RemoveAll();
    	            doActionIBSheet(sheetObject,formObject,IBSEARCH);
        	        break;

        	    case "btn_New":
    	            sheetObject.RemoveAll();
    	            sheetObject1.RemoveAll();
    	            formObject.reset();
        	        break;

                case "btn_Close":
    	            self.close();
        	        break;

        	    case "btn_OK":
                    comPopupOK();
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
        sheetObjects[sheetCnt++] = sheet_obj;
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
            doActionIBSheet(sheetObjects[i],document.form,IBSEARCH);
        }
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
                    style.height = GetSheetHeight(5) ;
                    //전체 너비 설정
                    SheetWidth = mainTable.clientWidth;

                    //Host정보 설정[필수][HostIp, Port, PagePath]
                    if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);

                    //전체Merge 종류 [선택, Default msNone]
                    MergeSheet = msNone;

                    //전체Edit 허용 여부 [선택, Default false]
                    Editable = true;

                    //행정보설정[필수][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
                    InitRowInfo( 1, 1, 9, 50);

                    //컬럼정보설정[필수][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
                    InitColumnInfo(3, 0, 0, true);

                    // 해더에서 처리할 수 있는 각종 기능을 설정한다
                    InitHeadMode(true, true, true, true, false,false)

                    var HeadTitle = "SEQ|Customer Code|Customer Name" ;

                    //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                    InitHeadRow(0, HeadTitle, false);

                    //데이터속성    [ROW, COL,  DATATYPE,   WIDTH, DATAALIGN, COLMERGE, SAVENAME,     KEYFIELD, CALCULOGIC, DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
                    InitDataProperty(0, cnt++ , dtSeq,       30,    daCenter,  false,    "",           false,          "",       dfNone,   	0,     false,       true);
                    InitDataProperty(0, cnt++ , dtData,     200,    daCenter,  false,    "cust_cd",    false,          "",       dfNone,    0,     false,       true);
                    InitDataProperty(0, cnt++ , dtData,     450,    daLeft  ,  false,    "cust_name",  false,          "",       dfNone,    0,     false,       true);
            }
                break;

            case 2:      //sheet2 init                
                with (sheetObj) {
                    // 높이 설정
                    style.height = GetSheetHeight(6) ;
                    //전체 너비 설정
                    SheetWidth = mainTable.clientWidth;

                    //Host정보 설정[필수][HostIp, Port, PagePath]
                    if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);

                    //전체Merge 종류 [선택, Default msNone]
                    MergeSheet = msNone;

                    //전체Edit 허용 여부 [선택, Default false]
                    Editable = true;

                    //행정보설정[필수][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
                    InitRowInfo( 1, 1, 9, 50);

                    //컬럼정보설정[필수][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
                    //InitColumnInfo(11, 0, 0, true);
                    InitColumnInfo(10, 0, 0, true);

                    // 해더에서 처리할 수 있는 각종 기능을 설정한다
                    InitHeadMode(true, true, true, true, false,false)

                    //var HeadTitle = "||Factory Name|Contact\nPIC Name|Address|ZIP Code|Email|Remark|Cust_cd|Cust_nm|Location" ;
                    var HeadTitle = "||Factory Name|Contact\nPIC Name|Address|ZIP Code|Email|Cust_cd|Cust_nm|Location" ;

                    //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                    InitHeadRow(0, HeadTitle, false);

                    //데이터속성    [ROW, COL,  DATATYPE,   WIDTH, DATAALIGN, COLMERGE, SAVENAME,  KEYFIELD, CALCULOGIC, DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
                    InitDataProperty(0, cnt++ , dtRadioCheck,30,    daCenter,  false,    "radio",   false,          "",       dfNone,	    0,     true,       true);
                    InitDataProperty(0, cnt++ , dtCheckBox,  30,    daCenter,  false,    "checkbox",   false,          "",       dfNone,   	0,     true,       true);
                    InitDataProperty(0, cnt++ , dtData,      80,    daCenter,  false,    "",        false,          "",       dfNone,   	0,     false,       true);
                    InitDataProperty(0, cnt++ , dtData,      150,    daCenter,  false,    "",        false,          "",       dfNone,       0,     false,       true);
                    InitDataProperty(0, cnt++ , dtData,     210,    daLeft  ,  false,    "",        false,          "",       dfNone,       0,     false,       true);

                    InitDataProperty(0, cnt++ , dtData,      80,    daCenter,  false,    "",        false,          "",       dfPostNo,     0,     false,       true);
                    InitDataProperty(0, cnt++ , dtData,      80,    daCenter,  false,    "",        false,          "",       dfNone,   	0,     false,       true);
                    //InitDataProperty(0, cnt++ , dtData,      130,    daCenter,  false,    "",        false,          "",       dfNone,       0,     false,       true);
                    InitDataProperty(0, cnt++ , dtHidden,      0,    daCenter,  false,    "cust_cd",        false,          "",       dfNone,       0,     false,       true);
                    InitDataProperty(0, cnt++ , dtHidden,      0,    daCenter,  false,    "cust_nm",        false,          "",       dfNone,       0,     false,       true);
                    InitDataProperty(0, cnt++ , dtHidden,      0,    daCenter,  false,    "loc_cd",        false,          "",       dfNone,       0,     false,       true);

                    WordWrap  = true;
               }
                break;

        }
    }



    function sheet1_OnScrollNext(sheet,CondParam, PageNo, OnePageRows) {
       // TODO:sheet에 해당하는 객체와 폼 오브젝트를 doActionIBSheet 함수에 보내 주어야합니다.
       doActionIBSheet(sheetObjects[0], document.form, IBSEARCHAPPEND, true, PageNo);
    }
    
    function sheet2_OnScrollNext(sheet,CondParam, PageNo, OnePageRows) {
       // TODO:sheet에 해당하는 객체와 폼 오브젝트를 doActionIBSheet 함수에 보내 주어야합니다.
       doActionIBSheet2(sheetObjects[1], document.form, IBSEARCHAPPEND, true, PageNo);
    }  


  // Sheet관련 프로세스 처리
    function doActionIBSheet(sheetObj,formObj,sAction, a, PageNo) {
        sheetObj.ShowDebugMsg = false;

        switch(sAction) {

           case IBSEARCH:        //조회
                if(!validateForm(sheetObj,formObj,sAction)) {
                  return false;
                }
               
                formObj.f_cmd.value = SEARCH;
                selectVal = FormQueryString(formObj);
                sheetObj.DoSearch4Post("COM_ENS_042GS.do", selectVal);
               
           break;
           case IBSEARCHAPPEND:  // 페이징 조회
           
                formObj.f_cmd.value = SEARCH;
                sheetObj.DoSearch4Post("COM_ENS_042GS.do", selectVal, "iPage1=" + PageNo, true);
           break;

        }
    }
    
    
    function sheet1_OnDblClick(sheetObj, row, col, value) {
     
      doActionIBSheet2(sheetObjects[1], document.form,IBSEARCH);
    }      
    

  // Sheet관련 프로세스 처리
    function doActionIBSheet2(sheetObj,formObj,sAction, a, PageNo) {
        sheetObj.ShowDebugMsg = false;
        
        var cust_cd = sheetObjects[0].CellValue(sheetObjects[0].SelectRow, 'cust_cd');
        var cnt    = 0;

        switch(sAction) {

           case IBSEARCH:     // Sheet1에서 더블 클릭 시            
           formObj.f_cmd.value = SEARCH;
           //selectVal = FormQueryString(formObj);
           
           // 선택한 row의 정보를 넘겨주어야 함
           selectVal = "f_cmd="+SEARCH+"&cust_cd="+cust_cd;
           
           sheetObj.DoSearch4Post("COM_ENS_042GS2.do", selectVal);
           
           break;
           case IBSEARCHAPPEND:
           
           formObj.f_cmd.value = SEARCH01;
           sheetObj.DoSearch4Post("COM_ENS_042GS2.do", selectVal, "iPage1=" + PageNo, true);
                     
           break;

        }
    }

   /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
          
            /*if(formObj.loc_cd.value == "" && formObj.cust_cd.value == "") {
              showErrMessage("You must input Location or Customer code");
              setFocus(formObj.loc_cd);
              return false;
            } else {
                if(formObj.cust_cd.value != "") {
                    if(formObj.cust_cd.value.length < 2) {
                      showErrMessage("Customer code must be 2 characters");
                      setFocus(formObj.cust_cd);
                      return false;
                    }
                } else {                    
                    if(formObj.loc_cd.value.length < 5) {
                      showErrMessage("Location must be 5 characters");
                      setFocus(formObj.loc_cd);
                      return false;
                    } 
                }
            }*/
        }

        return true;
    }
