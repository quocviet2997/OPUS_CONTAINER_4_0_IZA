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
		         var sheetObject2 = sheetObjects[1];
         /*******************************************************/
         var formObject = document.form;

    	try {
    		var srcName = window.event.srcElement.getAttribute("name");

            switch(srcName) {
				case "btn_Retrieve":
						doActionIBSheet(sheetObject1,formObject,IBSEARCH);
						break;
				case "btn_DownExcel":
						alert(srcName);
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
				ComConfigSheet (sheetObjects[i] );

				initSheet(sheetObjects[i],i+1);
	        //khlee-마지막 환경 설정 함수 추가
				ComEndConfigSheet(sheetObjects[i]);
			}
			doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
		}
    
  /**
     * 시트 초기설정값, 헤더 정의
     * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
     * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
     */
    function initSheet(sheetObj,sheetNo) {

        var cnt = 0;
		var sheetID = sheetObj.id;

        switch(sheetID) {

            case "sheet1":
	           with (sheetObj) {
	
	                    // 높이 설정
	           style.height = 142;
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
	
	           var HeadTitle1 = "|File Save ID|File Upload Name|File Size|File Path|Module ID|Delete|User ID";
											var headCount = ComCountHeadTitle(HeadTitle1);
	
	                    //컬럼정보설정[필수][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
	           InitColumnInfo(headCount, 0, 0, true);
	
	                    // 해더에서 처리할 수 있는 각종 기능을 설정한다
	           InitHeadMode(true, true, false, true, false,false);
	
	                    //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
	           InitHeadRow(0, HeadTitle1, true);
	
	                    //데이터속성    [ROW, COL,  DATATYPE,   WIDTH, DATAALIGN, COLMERGE, SAVENAME,  KEYFIELD, CALCULOGIC, DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
	           	InitDataProperty(0, cnt++ , dtHiddenStatus,	30,		daCenter,	false,	"ibflag");
				InitDataProperty(0, cnt++ , dtData,			200,	daCenter,	true,	"file_sav_id",		false,	"",      dfNone,	0,	true,	true);
				InitDataProperty(0, cnt++ , dtData,			200,	daCenter,	true,	"file_upld_nm",		false,	"",      dfNone,	0,	true,	true);
				InitDataProperty(0, cnt++ , dtData,			100,	daCenter,	true,	"file_sz_capa",		false,	"",      dfNone,	0,	true,	true);
				InitDataProperty(0, cnt++ , dtData,			300,	daCenter,	true,	"file_path_url",	false,	"",      dfNone,	0,	true,	true);
				InitDataProperty(0, cnt++ , dtData,			70,		daCenter,	true,	"pgm_sub_sys_cd",	false,	"",      dfNone,	0,	true,	true);
				InitDataProperty(0, cnt++ , dtData,			70,		daCenter,	true,	"delt_flg",			false,	"",      dfNone,	0,	true,	true);
				InitDataProperty(0, cnt++ , dtData,			70,		daCenter,	true,	"cre_usr_id",		false,	"",      dfNone,	0,	true,	true);
				
				CountPosition = 0;
				}
	            break;
        }
    }

  // Sheet관련 프로세스 처리
    function doActionIBSheet(sheetObj,formObj,sAction) {
        sheetObj.ShowDebugMsg = false;
        switch(sAction) {
			case IBSEARCH:      //조회
				if (sheetObj.id == "sheet1"){
					formObj.f_cmd.value = SEARCH;
					sheetObj.DoSearch("FileManagementGS.do", FormQueryString(formObj));
//	        		sheetObj.ShowDebugMsg = false;
				}
			break;
        }
    }
