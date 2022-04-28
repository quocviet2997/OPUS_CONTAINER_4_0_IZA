// 공통전역변수
var sheetObjects = new Array();
var sheetCnt = 0;

/* 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick = processButtonClick;

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
        ComConfigSheet(sheetObjects[i]);

        initSheet(sheetObjects[i],i+1);
    //khlee-마지막 환경 설정 함수 추가
            ComEndConfigSheet(sheetObjects[i]);
        }
    
    // 초기화면에서 조회내용을 보기 위한 소스 추후 삭제
    var sheetObject = sheetObjects[0];
    var formObject = document.form;
  	doActionIBSheet(sheetObject,formObject,IBSEARCH);
}

/* 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
function processButtonClick(){
     /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
     var sheetObject = sheetObjects[0];
     /*******************************************************/
     var formObject = document.form;

	 try {
		var srcName = window.event.srcElement.getAttribute("name");
        
        switch(srcName) {

    	    case "btn_retrieve":
	            doActionIBSheet(sheetObject,formObject,IBSEARCH);
    	        break;
        } // end switch
	 } catch(e) {
		if( e == "[object Error]") {
			ComShowMessage(OBJECT_ERROR);
		} else {
			ComShowMessage(e);
		}
	 }
}

// Sheet관련 프로세스 처리
function doActionIBSheet(sheetObj, formObj, sAction) {
    
    sheetObj.ShowDebugMsg = false;
    switch(sAction) {

       case IBSEARCH:      //조회
            sheetObj.DoSearch("data_004.htm");
            break;
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
                //전체 너비 설정
                style.height = 100 ;
                SheetWidth = mainTable.clientWidth;

                //Host정보 설정[필수][HostIp, Port, PagePath]
                if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);

                //전체Merge 종류 [선택, Default msNone]
                MergeSheet = msNone;

                //전체Edit 허용 여부 [선택, Default false]
                Editable = true;

                //행정보설정[필수][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
                InitRowInfo( 1, 1, 9, 100);

                //컬럼정보설정[필수][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
                InitColumnInfo(4, 0, 0, true);

                // 해더에서 처리할 수 있는 각종 기능을 설정한다
                InitHeadMode(true, true, false, true, false,false)

                var HeadTitle = "Seq.|Currency|Hidden|Port" ;

                //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                InitHeadRow(0, HeadTitle, false);

                //데이터속성    [ROW, COL,  DATATYPE,   WIDTH, DATAALIGN, COLMERGE, SAVENAME,  KEYFIELD, CALCULOGIC, DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
                InitDataProperty(0, cnt++ , dtSeq,        40,    daCenter,  false,    "",     false,          "",       dfNone,   	0,     true,       true);
                InitDataProperty(0, cnt++ , dtCombo,      70,    daCenter,  false,    "combo1",   true,       "",       dfNone,	0,     true,       true);
                InitDataProperty(0, cnt++ , dtHidden,      70,    daCenter,  false,    "",   true,       "",       dfNone,	0,     true,       true);
                InitDataProperty(0, cnt++ , dtData,      70,    daCenter,  false,    "",   true,       "",       dfNone,	0,     true,       true);
                
                //콤보항목설정[ROW, COL, COMBO-TEXT, COMBO-CODE, DEFAULT-TEXT]
	            InitDataCombo (0, "combo1", sel_currText, sel_currCode, "SLL");
                }
                break;

        }
}

/**
 * 시트에서 Biz 공통 팝업 호출
 * - comPopupInSheet() 호출 : row, col 정보를 Parameter로 전달  
 */
function sheet1_OnPopupClick(sheetObj, row, col)
{   
    if ( sheetObj.ColSaveName(col) == "pop1" )
    {
        var loc_cd_val = sheetObj.CellValue(row, col);
       
        var dispaly = "1,0,1,1,1,1,1,1,1,1,1,1";    // Radio PopUp
        
        var classId = "COM_ENS_051";
	    var param = '?loc_cd='+loc_cd_val+'&classId='+classId;
		  
	    var chkStr = dispaly.substring(0,3)          
        
        // Radio PopUp  
        if(chkStr == "1,0") {
           comPopupInSheet('/opuscntr/COM_ENS_051.do' + param, 770, 470, 'getCOM_ENS_051_1', dispaly, row, col);
       
        // CheckBox PopUp (멀티 데이터 선택용) => Sheet를 대상으로 하는 경우는 의미가 없음
        //} else if(chkStr == "0,1") {
            //comPopupInSheet('/opuscntr/COM_ENS_051.do' + param, 770, 470, 'getCOM_ENS_051_2', dispaly, sheetIdx, row, col);
           
        // Row 선택 PopUp
        } else if(chkStr == "0,0") {
           comPopupInSheet('/opuscntr/COM_ENS_051.do' + param, 770, 470, 'getCOM_ENS_051_3', dispaly, row, col);
        } else if(chkStr == "1,1"){
           showErrMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) dispaly속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
           return;
        } else {
           showErrMessage("팝업을 띄우기dispaly속성 정보가 부족합니다.");
           return;
        }
    }
}

/**
 * Location : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_051_1(rowArray, row, col) {
    var sheetObj = sheetObjects[0];
    
	var colArray = rowArray[0];
	sheetObj.CellValue(row, col) = colArray[3];
}


/**
 * Location : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_051_3(rowArray, row, col) {
    var sheetObj = sheetObjects[0];
    
	var colArray = rowArray[0];
	sheetObj.CellValue(row, col) = colArray[3];
}

/**
 * Tab 기본 설정
 * 탭의 항목을 설정한다.
 */
function initCombo (comboObj, comboNo) {
    var cnt  = 0 ;
    switch(comboNo) {
        case 1:
           with (comboObj) {

	       SetColAlign("left|left");

	       InsertItem(cnt ++, "01|All", "01");
	       InsertItem(cnt ++, "02|Cope", "02");
	       InsertItem(cnt ++, "03|Handymax", "03");
	       InsertItem(cnt ++, "04|Panamax", "04");

           Code = "01";
	    }
           break;

        case 2:
           with (comboObj) {

	       SetColAlign("left|left");

	       MultiSelect = true;
	       MaxSelect = 2 ;
	       InsertItem(cnt ++, "01|All", "01");
	       InsertItem(cnt ++, "02|Cope", "02");
	       InsertItem(cnt ++, "03|Handymax", "03");
	       InsertItem(cnt ++, "04|Panamax", "04");

           Code = "01";
	    }
           break;
     }
}