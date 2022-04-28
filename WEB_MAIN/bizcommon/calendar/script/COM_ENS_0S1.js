/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0S1.js
*@FileTitle : country
*Open Issues :
*Change history :
*@LastModifyDate : 2006-11-03
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-11-03 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/

/* 공통전역변수 */
var tabObjects = new Array();
var tabCnt = 0 ;
var beforetab = 1;

var ipageNo =1 ;

var sheetObjects = new Array();
var sheetCnt = 0;
var selectVal;

/* 업무별전역변수는 아래 부분에 추가 선언하여 사용한다. */    



	/* 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
	document.onclick = processButtonClick;    
	
	/* 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */    
	function processButtonClick(){
	     /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/         
	     var sheetObject = sheetObjects[beforetab];
	     /*******************************************************/
	     var formObject = document.form;
	        
	    try {
	        var srcName = window.event.srcElement.getAttribute("name");
	        /***********************************************************************************************************
	            이미지 클릭 이벤트 처리, popup도 역시 이곳에서 함
	            공통코드: CoFormControl.js 에 정의 되어있습니다. 이 변수를 통하여 ServiceCommand에서 분기 합니다.        
	         **********************************************************************************************************/
	        /*
	           이곳에 document.form 혹은 document.form[0]식으로 코딩하시는 것을 삼가해 주십시오.
	           메뉴가 적용되면 left_menu.jsp에 form 이 존재할 것이기 때문에 더이상 form[0]이 아닙니다.
	           (순서상도 form[1]이 되겠죠?) 
	           그리고 위에서 with(document.form)라고 했기때문에 (브라우저의 DOM 객체중 특정부분만 잡는다는 의미니깐!)
	            document.form.f_cmd.value = INSERT;   이런식의 코딩은 지양해주십시오.
	        */
	        switch(srcName) {
	            case "btn_Retrieve":
	                if(beforetab == 0)
	                   doActionIBSheet_cnt(sheetObject,formObject,IBSEARCH);
	                else if(beforetab == 1)
	                   doActionIBSheet_ste(sheetObject,formObject,IBSEARCH);
	                else if(beforetab == 2)
	                   doActionIBSheet_loc(sheetObject,formObject,IBSEARCH); 
	                else if(beforetab == 3)
	                   doActionIBSheet_month(sheetObject,formObject,IBSEARCH);   
	    	        break;
	
	    	    case "btn_New":
		            sheetObject.RemoveAll();
		            formObject.reset();
	    	        break;
	    	    
	    	    case "btn_Save":
	    	        if(beforetab == 0)
	   	               doActionIBSheet_cnt(sheetObject,formObject,IBSAVE);
	   	            else if(beforetab == 1)
	                   doActionIBSheet_ste(sheetObject,formObject,IBSAVE);
	                else if(beforetab == 2)
	                   doActionIBSheet_loc(sheetObject,formObject,IBSAVE);
	    	        break;
	
	            case "btn_close":
		            self.close();
	    	        break;
	
	    	    case "btn_ok":
	                comPopupOK();
	    	        break;
	    	        
	    	    case "btn_cnt_cd":        	        
	    	        // 국가조회 팝업
	    	        var conti_cd = "";
	    	        var cnt_cd = "";
	    	        var targetObjList = "";
	    	        
	    	        if(beforetab == 0) {
	    	            cnt_cd = formObject.cnt_cd_cnt.value;
	    	            targetObjList = "cnt_cd:cnt_cd_cnt";
	    	        } else if(beforetab == 1) {
	    	            cnt_cd = formObject.cnt_cd_ste.value;
	    	            targetObjList = "cnt_cd:cnt_cd_ste";
	    	        } else if(beforetab == 2) {
	    	            cnt_cd = formObject.cnt_cd_loc.value;
	    	            targetObjList = "cnt_cd:cnt_cd_loc";
	    	        } else if(beforetab == 3) {
	    	            cnt_cd = formObject.cnt_cd_month.value;
	    	            conti_cd = formObject.conti_cd.value;
	    	            targetObjList = "cnt_cd:cnt_cd_month";
	    	        }
	    	        var v_display = "1,0,1,1,1,1,1";
	    	        var param = "?conti_cd="+conti_cd+"&cnt_cd="+cnt_cd+"&classId=COM_ENS_0M1";		
	  				ComOpenPopupWithTarget('/opuscntr/COM_ENS_0M1.do' + param, 560, 620, targetObjList, v_display, true);
	    	        break;
	    	    
	    	    case "btn_loc_cd":        	        
	    	        // Location 조회 팝업
	    	        var cnt_cd = "";
	    	        var loc_cd = "";
	    	        var targetObjList = "";
	    	           
		            cnt_cd = formObject.cnt_cd_loc.value;
		            loc_cd = formObject.loc_cd_loc.value;
		            targetObjList = "loc_cd:loc_cd_loc";
	    	        
	    	        var v_display = "1,0,1,1,1,1,1";
	    	        var param = "?cnt_cd="+cnt_cd+"&loc_cd="+loc_cd+"&classId=COM_ENS_051";

	  				ComOpenPopupWithTarget('/opuscntr/COM_ENS_051.do' + param, 770, 480, targetObjList, v_display, true);
	    	        break;
	    	    
	    	    case "btn_calendar_fr":
	    	        // 달력 팝업
	    	        var cal = new ComCalendar();
	    	        if(beforetab == 0) {
	       	            cal.select(formObject.frDate_cnt, 'yyyy-MM-dd');    
	    	        } else if(beforetab == 1) {
	    	            cal.select(formObject.frDate_ste, 'yyyy-MM-dd'); 
	    	        } else if(beforetab == 2) {
	    	            cal.select(formObject.frDate_loc, 'yyyy-MM-dd');
	    	        }
	       		    
	    	        break;
	    	    
	    	    case "btn_calendar_to":
	    	        // 달력 팝업
	    	    	var cal = new ComCalendar();
	    	        if(beforetab == 0) {
	       	            cal.select(formObject.toDate_cnt, 'yyyy-MM-dd');    
	    	        } else if(beforetab == 1) {
	    	            cal.select(formObject.toDate_ste, 'yyyy-MM-dd'); 
	    	        } else if(beforetab == 2) {
	    	            cal.select(formObject.toDate_loc, 'yyyy-MM-dd');
	    	        }
	    	        break;
	    	    
	    	    case "btn_Down_Excel":
	    	        if(beforetab == 0) {
	       	            doActionIBSheet_cnt(sheetObject,formObject,IBDOWNEXCEL);  
	    	        } else if(beforetab == 1) {
	    	            doActionIBSheet_ste(sheetObject,formObject,IBDOWNEXCEL);
	    	        } else if(beforetab == 2) {
	    	            doActionIBSheet_loc(sheetObject,formObject,IBDOWNEXCEL);
	    	        } else if(beforetab == 3) {
	    	            doActionIBSheet_month(sheetObject,formObject,IBDOWNEXCEL);
	    	        }
		            
	    	        break;
	    	        
	    	    case "btn_rowadd_cnt":        	        
		            doActionIBSheet_cnt(sheetObject,formObject,IBINSERT);
	    	        break;
	    	        
	    	    case "btn_rowadd_ste":        	        
		            doActionIBSheet_ste(sheetObject,formObject,IBINSERT);
	    	        break;
	    	    case "btn_rowadd_loc":        	        
		            doActionIBSheet_loc(sheetObject,formObject,IBINSERT);
	    	        break;
	    
	        } // end switch
	    }catch(e) {            
	        /*
	        자바 스크립트 에러가 발생할시 오동작이 납니다. 고객에게 이 경우 아래의 메세지가 뿌려지게 해야합니다.
	        물론 화면에서 다음의 메세지를 보시면 무조건 '자바스크립트 에러구나'라고 확인하실수 가 있습니다.
	        */
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
           // doActionIBSheet(sheetObjects[i],document.form,IBSEARCH);
        }
        for(k=0;k<tabObjects.length;k++){
			initTab(tabObjects[k],k+1);
		}
	} 
    
    /**
     * IBTab Object를 배열로 등록
     * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
     * 배열은 소스 상단에 정의
    */
    function setTabObject(tab_obj){
    	tabObjects[tabCnt++] = tab_obj;
    }

    /**
     * Tab 기본 설정
     * 탭의 항목을 설정한다.
    */
    function initTab(tabObj , tabNo) {
    	switch(tabNo) {
                case 1:
                    with (tabObj) {
                        var cnt  = 0 ;
                        InsertTab( cnt++, "   Country   " , -1 );
    					InsertTab( cnt++, " State/Prov. " , -1 );
    					InsertTab( cnt++, "   Location  " , -1 );
    					InsertTab( cnt++, "Country/Month" , -1 );
                    }
                    break;

            }
    }
    
    /**
     * Tab 클릭시 이벤트 관련
     * 선택한 탭의 요소가 활성화 된다.
    */
    function tab1_OnChange(tabObj , nItem){

    	var objs = document.all.item("tabLayer");

            objs[nItem].style.display = "Inline";
            objs[beforetab].style.display = "none";

            //--------------- 요기가 중요 --------------------------//
            objs[beforetab].style.zIndex = objs[nItem].style.zIndex -1 ;
            //------------------------------------------------------//
            beforetab= nItem;
            
    		if(beforetab == 3) {
    			document.all.item("table_save").style.display = "none";
    			document.all.item("table_row_add").style.display = "none";
    		} else {
    			document.all.item("table_save").style.display = "inline";
    			document.all.item("table_row_add").style.display = "inline";
    		}
    }
    
    /**
     * 시트 초기설정값, 헤더 정의
     * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
     * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
     */
    function initSheet(sheetObj,sheetNo) {
        var cnt = 0;
        
        //sheetObj.UseUtf8 = true;
        switch(sheetNo) {
            case 1:      //IBSheet1 init
                with (sheetObj) {
                    // 높이 설정
                    style.height = GetSheetHeight(10) ;
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
                    InitColumnInfo(10, 0, 0, true);
        
                    // 해더에서 처리할 수 있는 각종 기능을 설정한다
                    InitHeadMode(true, true, false, true, false,false)

                    var HeadTitle = "Del|STS|Country|Country|From Date|Week of Day|To Date|Week of Day|Holiday|" ;
                    var HeadTitle1 = "Del|STS|Country Code|Country Name|From Date|Week of Day|To Date|Week of Day|Holiday|" ;

                    //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                    InitHeadRow(0, HeadTitle, true);
                    InitHeadRow(1, HeadTitle1, true);
        
                    //데이터속성    [ROW,      COL,            DATATYPE, WIDTH,   DATAALIGN, COLMERGE,     SAVENAME,   KEYFIELD, CALCULOGIC,   DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
                    InitDataProperty(0, cnt++ , dtDelCheck,   30,    daCenter,  true,    "checkbox",            false,        "",       dfNone,   		0,     true,       true);
                    InitDataProperty(0, cnt++ , dtStatus,     30,    daCenter,  true,    "ibflag",            false,        "",       dfNone,   		0,     false,      false);
                    InitDataProperty(0, cnt++ , dtPopupEdit,      40,    daCenter,  false,   "cnt_cd",        false,          "",       dfNone,     0,     true,       true, 2);
                    InitDataProperty(0, cnt++ , dtData,      100,    daLeft,  false,   "cnt_nm",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtPopupEditFormat,      80,    daCenter,  false,   "frDate",        false,          "",       dfUserFormat2,     0,     true,       true);
                    InitDataProperty(0, cnt++ , dtData,      75,    daCenter,  false,   "frDay",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtPopupEditFormat,      80,    daCenter,  false,   "toDate",    false,          "",       dfUserFormat2,     0,     true,       true);
                    InitDataProperty(0, cnt++ , dtData,      75,    daCenter,  false,   "toDay",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      150,    daLeft,  false,   "hol_nm",        false,          "",       dfNone,     0,     true,       true);
                    InitDataProperty(0, cnt++ , dtHidden,      0,    daCenter,  false,   "hol_id",        false,          "",       dfNone,     0,     false,       true);
                    
                    InitDataValid(0, "cnt_cd", vtEngUpOnly); //14
                    
                    //sheetObj.RowHidden(1) = true;
                    
                    sheetObj.InitUserFormat2(0, "frDate", "####-##-##", "-|:" );
                    sheetObj.InitUserFormat2(0, "toDate", "####-##-##", "-|:" );
                }
                break;
            case 2:      //IBSheet2 init
                with (sheetObj) {
                    // 높이 설정
                    style.height = GetSheetHeight(10) ;
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
                    InitColumnInfo(13, 0, 0, true);
        
                    // 해더에서 처리할 수 있는 각종 기능을 설정한다
                    InitHeadMode(true, true, false, true, false,false)

                    var HeadTitle = "Del|STS|Country|Country|State/Province|State/Province|From Date|Week of Day|To Date|Week of Day|Holiday||" ;
                    var HeadTitle1 = "Del|STS|Country Code|Country Name|STE_CD|STE_NM|From Date|Week of Day|To Date|Week of Day|Holiday||" ;

                    //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                    InitHeadRow(0, HeadTitle, true);
                    InitHeadRow(1, HeadTitle1, true);
        
                    //데이터속성    [ROW,      COL,            DATATYPE, WIDTH,   DATAALIGN, COLMERGE,     SAVENAME,   KEYFIELD, CALCULOGIC,   DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
                    InitDataProperty(0, cnt++ , dtDelCheck,   30,    daCenter,  true,    "checkbox",            false,        "",       dfNone,   		0,     true,       true);
                    InitDataProperty(0, cnt++ , dtStatus,     30,    daCenter,  true,    "ibflag",            false,        "",       dfNone,   		0,     false,      false);
                    InitDataProperty(0, cnt++ , dtPopupEdit,      40,    daCenter,  false,   "cnt_cd",        false,          "",       dfNone,     0,     true,       true, 2);
                    InitDataProperty(0, cnt++ , dtData,      100,    daLeft,  false,   "cnt_nm",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtPopupEdit,      40,    daCenter,  false,   "ste_cd",        false,          "",       dfNone,     0,     false,       false, 2);
                    InitDataProperty(0, cnt++ , dtData,      100,    daCenter,  false,   "ste_nm",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtPopupEditFormat,      80,    daCenter,  false,   "frDate",        false,          "",       dfUserFormat2,     0,     true,       true);
                    InitDataProperty(0, cnt++ , dtData,      75,    daCenter,  false,   "frDay",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtPopupEditFormat,      80,    daCenter,  false,   "toDate",    false,          "",       dfUserFormat2,     0,     true,       true);
                    InitDataProperty(0, cnt++ , dtData,      75,    daCenter,  false,   "toDay",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      150,    daLeft,  false,   "hol_nm",        false,          "",       dfNone,     0,     true,       true);
                    InitDataProperty(0, cnt++ , dtHidden,      0,    daCenter,  false,   "hol_id",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtHidden,      0,    daCenter,  false,   "hol_knd_cd",        false,          "",       dfNone,     0,     false,       false);
                    
                    InitDataValid(0, "cnt_cd", vtEngUpOnly); //14
                    InitDataValid(0, "ste_cd", vtEngUpOnly); //14
                    
                    //sheetObj.RowHidden(1) = true;
                    
                    sheetObj.InitUserFormat2(0, "frDate", "####-##-##", "-|:" );
                    sheetObj.InitUserFormat2(0, "toDate", "####-##-##", "-|:" );
                }
                break;
                
            case 3:      //IBSheet3 init
                with (sheetObj) {
                    // 높이 설정
                    style.height = GetSheetHeight(10) ;
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
                    InitColumnInfo(15, 0, 0, true);
        
                    // 해더에서 처리할 수 있는 각종 기능을 설정한다
                    InitHeadMode(true, true, false, true, false,false)

                    var HeadTitle = "Del|STS|Country|Country|STE_CD|STE_NM|Location|Location|From Date|Week of Day|To Date|Week of Day|Holiday||" ;
                    var HeadTitle1 = "Del|STS|Country Code|Country Name|STE_CD|STE_NM|Location Code|Location Name|From Date|Week of Day|To Date|Week of Day|Holiday||" ;

                    //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                    InitHeadRow(0, HeadTitle, true);
                    InitHeadRow(1, HeadTitle1, true);
        
                    //데이터속성    [ROW,      COL,            DATATYPE, WIDTH,   DATAALIGN, COLMERGE,     SAVENAME,   KEYFIELD, CALCULOGIC,   DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
                    InitDataProperty(0, cnt++ , dtDelCheck,   30,    daCenter,  true,    "checkbox",            false,        "",       dfNone,   		0,     true,       true);
                    InitDataProperty(0, cnt++ , dtStatus,     30,    daCenter,  true,    "ibflag",            false,        "",       dfNone,   		0,     false,      false);
                    InitDataProperty(0, cnt++ , dtPopupEdit,      40,    daCenter,  false,   "cnt_cd",        false,          "",       dfNone,     0,     true,       true, 2);
                    InitDataProperty(0, cnt++ , dtData,      100,    daLeft,  false,   "cnt_nm",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtHidden,      0,    daCenter,  false,   "ste_cd",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtHidden,      0,    daCenter,  false,   "ste_nm",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtPopupEdit,      50,    daCenter,  false,   "loc_cd",        false,          "",       dfNone,     0,     false,       false, 5);
                    InitDataProperty(0, cnt++ , dtData,      100,    daLeft,  false,   "loc_nm",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtPopupEditFormat,      80,    daCenter,  false,   "frDate",        false,          "",       dfUserFormat2,     0,     true,       true);
                    InitDataProperty(0, cnt++ , dtData,      75,    daCenter,  false,   "frDay",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtPopupEditFormat,      80,    daCenter,  false,   "toDate",    false,          "",       dfUserFormat2,     0,     true,       true);
                    InitDataProperty(0, cnt++ , dtData,      75,    daCenter,  false,   "toDay",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      150,    daLeft,  false,   "hol_nm",        false,          "",       dfNone,     0,     true,       true);
                    InitDataProperty(0, cnt++ , dtHidden,      0,    daCenter,  false,   "hol_id",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtHidden,      0,    daCenter,  false,   "hol_knd_cd",        false,          "",       dfNone,     0,     false,       false);
                    
                    InitDataValid(0, "cnt_cd", vtEngUpOnly); //14
                    InitDataValid(0, "loc_cd", vtEngUpOnly); //14
                    
                    //sheetObj.RowHidden(1) = true;
                    
                    sheetObj.InitUserFormat2(0, "frDate", "####-##-##", "-|:" );
                    sheetObj.InitUserFormat2(0, "toDate", "####-##-##", "-|:" );
                }
                break;
                
            case 4:      //IBSheet4 init
                with (sheetObj) {
                    // 높이 설정
                    style.height = GetSheetHeight(10) ;
                    //전체 너비 설정
                    SheetWidth = mainTable.clientWidth;

                    //Host정보 설정[필수][HostIp, Port, PagePath]
                    if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);

                    //전체Merge 종류 [선택, Default msNone]
                    MergeSheet = msAll;

                    //전체Edit 허용 여부 [선택, Default false]
                    Editable = false;
        
                    //행정보설정[필수][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
                    InitRowInfo( 1, 1, 9, 100);
        
                    //컬럼정보설정[필수][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
                    InitColumnInfo(37, 0, 0, true);
        
                    // 해더에서 처리할 수 있는 각종 기능을 설정한다
                    InitHeadMode(true, true, false, true, false,false)

                    var HeadTitle = "Country|Jan.|Jan.|Jan.|Feb.|Feb.|Feb.|Mar.|Mar.|Mar.|Apr.|Apr.|Apr.|May|May|May|Jun.|Jun.|Jun.|Jul.|Jul.|Jul.|Aug.|Aug.|Aug.|Sep.|Sep.|Sep.|Oct.|Oct.|Oct.|Nov.|Nov.|Nov.|Dec.|Dec.|Dec." ;
                    var HeadTitle1 = "Country|jan_fr|jan_to|jan_hol_nm|feb_fr|feb_to|feb_hol_nm|mar_fr|mar_to|mar_hol_nm|apr_fr|apr_to|apr_hol_nm|may_fr|may_to|may_hol_nm|jun_fr|jun_to|jun_hol_nm|jul_fr|jul_to|jul_hol_nm|aug_fr|aug_to|aug_hol_nm|sep_fr|sep_to|sep_hol_nm|oct_fr|oct_to|oct_hol_nm|nov_fr|nov_to|nov_hol_nm|dec_fr|dec_to|dec_hol_nm" ;

                    //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                    InitHeadRow(0, HeadTitle, true);
                    InitHeadRow(1, HeadTitle1, true);
        
                    //데이터속성    [ROW,      COL,            DATATYPE, WIDTH,   DATAALIGN, COLMERGE,     SAVENAME,   KEYFIELD, CALCULOGIC,   DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
                    InitDataProperty(0, cnt++ , dtData,      80,    daLeft,  true,   "cnt_nm",        true,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "jan_frday",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "jan_today",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      100,    daLeft,  false,   "jan_hol_nm",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "feb_frday",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "feb_today",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      100,    daLeft,  false,   "feb_hol_nm",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "mar_frday",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "mar_today",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      100,    daLeft,  false,   "mar_hol_nm",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "apr_frday",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "apr_today",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      100,    daLeft,  false,   "apr_hol_nm",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "may_frday",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "may_today",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      100,    daLeft,  false,   "may_hol_nm",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "jun_frday",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "jun_today",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      100,    daLeft,  false,   "jun_hol_nm",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "jul_frday",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "jul_today",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      100,    daLeft,  false,   "jul_hol_nm",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "aug_frday",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "aug_today",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      100,    daLeft,  false,   "aug_hol_nm",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "sep_frday",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "sep_today",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      100,    daLeft,  false,   "sep_hol_nm",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "oct_frday",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "oct_today",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      100,    daLeft,  false,   "oct_hol_nm",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "nov_frday",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "nov_today",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      100,    daLeft,  false,   "nov_hol_nm",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "dec_frday",    false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,  false,   "dec_today",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      100    ,    daLeft,  false,   "dec_hol_nm",    false,          "",       dfNone,     0,     false,       false);
                    
                    //sheetObj.RowHidden(1) = true;
                }
                break;
        }
    }
    
    /**
     * 시트에서 Biz 공통 팝업 호출
     * - comPopupInSheet() 호출 : row, col 정보를 Parameter로 전달  
     */
    function sheet_cnt_OnPopupClick(sheetObj, row, col)
    {   
        if ( sheetObj.ColSaveName(col) == "cnt_cd" ) {
            var cnt_cd_val = sheetObj.CellValue(row, col);
           
            var display = "1,0,1,1,1,1,1";
            
            var classId = "COM_ENS_0M1";
            var param = '?cnt_cd='+cnt_cd_val+'&classId='+classId;
        	  
            var chkStr = display.substring(0,3);
            var sheetIdx = 0; 
            comPopupInSheet('/opuscntr/COM_ENS_0M1.do' + param, 565, 480, 'setCntInfoInSheet', display, row, col, true, false, sheetIdx);
        } else if ( sheetObj.ColSaveName(col) == "frDate" || sheetObj.ColSaveName(col) == "toDate" ) {
            var cal = new calendarPopupGrid();
            cal.select(sheetObj, 'sheet_cnt', row, col, 'yyyy-MM-dd');
        }
    }
    
    function sheet_cnt_OnChange(sheetObj, Row, Col, Value){
        
        // 국가코드 유효성 체크 및 국가명 세팅
        if (sheetObj.ColSaveName(Col) == "cnt_cd") {            
            if(Value.length != 2) {
                showErrMessage("You Must Input 2 characters.");
                sheetObj.SelectCell(Row, Col, true);
                return;
            }
            document.all.iframe_bizcom.src="/opuscntr/bizcommon/common/COM_ENS_COMMON.jsp?func=CNT_VALID&cnt_cd="+Value+"&sheetIdx=0&row="+Row+"&col="+Col;
        } else if(sheetObj.ColSaveName(Col) == "frDate" || sheetObj.ColSaveName(Col) == "toDate") {
            setYoil(sheetObj, Row, Col, Value);
        }
    }
    
    function setYoil(sheetObj, Row, Col, Value) {
        var year = parseInt(Value.substring(0,4), 10);
        var month = parseInt(Value.substring(4,6), 10) - 1;
        var day = parseInt(Value.substring(6,8), 10);
       
        var date = new Date(year, month, day);
        var yoil= date.getDay();
        var yoilDesc = "";
        if(yoil == 0)
            yoilDesc = "SUN"
        else if(yoil == 1)
            yoilDesc = "MON"
        else if(yoil == 2)
            yoilDesc = "TUE"
        else if(yoil == 3)
            yoilDesc = "WED"
        else if(yoil == 4)
            yoilDesc = "THU"
        else if(yoil == 5)
            yoilDesc = "FRI"
        else if(yoil == 6)
            yoilDesc = "SAT"
            
        //sheetObj.CellValue(Row, Col + 1) = yoilDesc;
    }
    
    /**
     * 시트에서 Biz 공통 팝업 호출
     * - comPopupInSheet() 호출 : row, col 정보를 Parameter로 전달  
     */
    function sheet_ste_OnPopupClick(sheetObj, row, col)
    {   
        if ( sheetObj.ColSaveName(col) == "cnt_cd" )
        {
            var cnt_cd_val = sheetObj.CellValue(row, col);
           
            var display = "1,0,1,1,1,1,1";
            
            var classId = "COM_ENS_0M1";
            var param = '?cnt_cd='+cnt_cd_val+'&classId='+classId;
        	  
            var chkStr = display.substring(0,3);
            var sheetIdx = 1; 
            comPopupInSheet('/opuscntr/COM_ENS_0M1.do' + param, 565, 480, 'setCntInfoInSheet', display, row, col, true, false, sheetIdx);
        } else if ( sheetObj.ColSaveName(col) == "frDate" || sheetObj.ColSaveName(col) == "toDate" ) {
            var cal = new calendarPopupGrid();
            cal.select(sheetObj, 'sheet_ste', row, col, 'yyyy-MM-dd');
        } else if ( sheetObj.ColSaveName(col) == "ste_cd" )
        {
            var cnt_cd_val = sheetObj.CellValue(row, "cnt_cd");
            
            var display = "1,0,1,1,1,1,1";
            
            var classId = "COM_ENS_0X1";
            var param = '?cnt_cd='+cnt_cd_val+'&classId='+classId;
        	  
            var chkStr = display.substring(0,3);
            var sheetIdx = 1; 
            comPopupInSheet('/opuscntr/COM_ENS_0X1.do' + param, 300, 380, 'setSteInfoInSheet', display, row, col, true, false, sheetIdx);
        }
    }
    
    function sheet_ste_OnChange(sheetObj, Row, Col, Value){
        
        // 국가코드 유효성 체크 및 국가명 세팅
        if (sheetObj.ColSaveName(Col) == "cnt_cd") {            
            if(Value.length != 2) {
                showErrMessage("You Must Input 2 characters.");
                sheetObj.SelectCell(Row, Col, true);
                return;
            }
            document.all.iframe_bizcom.src="/opuscntr/bizcommon/common/COM_ENS_COMMON.jsp?func=CNT_VALID&cnt_cd="+Value+"&sheetIdx=1&row="+Row+"&col="+Col;
        } else if(sheetObj.ColSaveName(Col) == "frDate" || sheetObj.ColSaveName(Col) == "toDate") {
            setYoil(sheetObj, Row, Col, Value);
        } else if (sheetObj.ColSaveName(Col) == "ste_cd") {   
            if(Value.length != 2) {
                showErrMessage("You Must Input 2 characters.");
                sheetObj.SelectCell(Row, Col, true);
                return;
            }
            document.all.iframe_bizcom.src="/opuscntr/bizcommon/common/COM_ENS_COMMON.jsp?func=STE_VALID&ste_cd="+Value+"&sheetIdx=1&row="+Row+"&col="+Col;
        }      
    }
    
    function sheet_ste_OnClick(sheetObj, Row, Col, Value){
        if (sheetObj.ColSaveName(Col) == "ste_cd") {
            var hol_knd_cd = sheetObj.CellValue(Row, "hol_knd_cd");
            if(hol_knd_cd == 'C')
              return;
              
            var cnt_cd = sheetObj.CellValue(Row, "cnt_cd");
            
            document.all.iframe_bizcom.src="/opuscntr/bizcommon/common/COM_ENS_COMMON.jsp?func=STE_EXIST&cnt_cd="+cnt_cd+"&sheetIdx=1&row="+Row+"&col="+Col;
        } else if (sheetObj.ColSaveName(Col) == "checkbox") {   
            if(Value == 0) {
                var hol_knd_cd = sheetObj.CellValue(Row, "hol_knd_cd");
                var ste_cd = document.form.ste_cd_ste.value;                
//                if(hol_knd_cd == "C" && (ste_cd  == null || ste_cd == "")) {
//                    if(confirm("It is Country's Holiday. \nDo you want to delete it?")) {
//                        sheetObj.CellValue(Row, Col) = 0;
//                    } else {
//                        sheetObj.CellValue(Row, Col) = 1;
//                    }                    
//                }
            }
        }
    }
    
    /**
     * 시트에서 Biz 공통 팝업 호출
     * - comPopupInSheet() 호출 : row, col 정보를 Parameter로 전달  
     */
    function sheet_loc_OnPopupClick(sheetObj, row, col)
    {   
        if ( sheetObj.ColSaveName(col) == "cnt_cd" )
        {
            var cnt_cd_val = sheetObj.CellValue(row, col);
           
            var display = "1,0,1,1,1,1,1";
            
            var classId = "COM_ENS_0M1";
            var param = '?cnt_cd='+cnt_cd_val+'&classId='+classId;
        	  
            var chkStr = display.substring(0,3);
            var sheetIdx = 2; 
            comPopupInSheet('/opuscntr/COM_ENS_0M1.do' + param, 565, 480, 'setCntInfoInSheet', display, row, col, true, false, sheetIdx);
        } else if ( sheetObj.ColSaveName(col) == "loc_cd" )
        {
            var cnt_cd_val = sheetObj.CellValue(row, "cnt_cd");
           
            var display = "1,0,1,1,1,1,1,1,1,1,1,1";
            
            var classId = "COM_ENS_051";
            var param = '?cnt_cd='+cnt_cd_val+'&classId='+classId;
        	  
            var chkStr = display.substring(0,3);
            var sheetIdx = 2; 
            comPopupInSheet('/opuscntr/COM_ENS_051.do' + param, 770, 480, 'setLocInfoInSheet', display, row, col, true, false, sheetIdx);
        } else if ( sheetObj.ColSaveName(col) == "frDate" || sheetObj.ColSaveName(col) == "toDate" ) {
            var cal = new calendarPopupGrid();
            cal.select(sheetObj, 'sheet_loc', row, col, 'yyyy-MM-dd');
        }
    }    
    
    function sheet_loc_OnChange(sheetObj, Row, Col, Value){
        
        // 국가코드 유효성 체크 및 국가명 세팅
        if (sheetObj.ColSaveName(Col) == "cnt_cd") {            
            if(Value.length != 2) {
                showErrMessage("You Must Input 2 characters.");
                sheetObj.SelectCell(Row, Col, true);
                return;
            }
            document.all.iframe_bizcom.src="/opuscntr/bizcommon/common/COM_ENS_COMMON.jsp?func=CNT_VALID&cnt_cd="+Value+"&sheetIdx=2&row="+Row+"&col="+Col;
        } else if(sheetObj.ColSaveName(Col) == "frDate" || sheetObj.ColSaveName(Col) == "toDate") {
            setYoil(sheetObj, Row, Col, Value);
        } else if (sheetObj.ColSaveName(Col) == "loc_cd") {   
            if(Value.length != 5) {
                showErrMessage("You Must Input 5 characters.");
                sheetObj.SelectCell(Row, Col, true);
                return;
            }
            document.all.iframe_bizcom.src="/opuscntr/bizcommon/common/COM_ENS_COMMON.jsp?func=LOC_VALID&loc_cd="+Value+"&sheetIdx=2&row="+Row+"&col="+Col;
        }      
    }
    
    function sheet_loc_OnClick(sheetObj, Row, Col, Value){
        if (sheetObj.ColSaveName(Col) == "loc_cd") {
            var hol_knd_cd = sheetObj.CellValue(Row, "hol_knd_cd");
            if(hol_knd_cd == 'C' || hol_knd_cd == 'S')
              return;
              
            var cnt_cd = sheetObj.CellValue(Row, "cnt_cd");            
            document.all.iframe_bizcom.src="/opuscntr/bizcommon/common/COM_ENS_COMMON.jsp?func=LOC_EXIST&cnt_cd="+cnt_cd+"&sheetIdx=2&row="+Row+"&col="+Col;
        }
    }
    
    function setCntInfoInSheet(rowArray, row, col, sheetIdx) {
        var sheetObj = sheetObjects[sheetIdx];
    
    	var colArray = rowArray[0];
//    	sheetObj.CellValue2(row, col) = colArray[3];
//    	sheetObj.CellValue2(row, col + 1) = colArray[4];
    }
    
    function setSteInfoInSheet(rowArray, row, col, sheetIdx) {
        var sheetObj = sheetObjects[sheetIdx];
    
    	var colArray = rowArray[0];
//    	sheetObj.CellValue2(row, col) = colArray[3];
//    	sheetObj.CellValue2(row, col + 1) = colArray[4];
    }
    
    function setLocInfoInSheet(rowArray, row, col, sheetIdx) {
        var sheetObj = sheetObjects[sheetIdx];
    
    	var colArray = rowArray[0];
//    	sheetObj.CellValue2(row, col) = colArray[3];
//    	sheetObj.CellValue2(row, col + 1) = colArray[4];
    }
    
    /* Sheet관련 프로세스 처리 */
    function doActionIBSheet_cnt(sheetObj,formObj,sAction, a, PageNo) {
        sheetObj.ShowDebugMsg = false;
        
        switch(sAction) {

          case IBSEARCH:        //조회
                if(!validateForm(sheetObj,formObj,sAction)) {
                    return false;
                }
               
                formObj.f_cmd.value = SEARCHLIST;  
                selectVal = FormQueryString(formObj)
                sheetObj.DoSearch4Post("COM_ENS_0S1GS.do", selectVal);   
               
           break;
           case IBSEARCHAPPEND:  // 페이징 조회
                formObj.f_cmd.value = SEARCHLIST;  
                sheetObj.DoSearch4Post("COM_ENS_0S1GS.do", selectVal, "iPage=" + PageNo, true);
           break;

           case IBINSERT:      // 입력
                //sheetObj.DataInsert();
                //새로운 ROW입력 시 KEY 정보 입력
                var Row = sheetObj.DataInsert(0); 
//                sheetObj.CellValue(Row,"hol_knd_cd") = "C";
                
                break;

           case IBDOWNEXCEL:        //엑셀 다운로드
              sheetObj.Down2Excel(-1, false, false, true);
              break;
           
           case IBSAVE:        //저장
              if(validateForm(sheetObj,formObj,sAction)) 
              {                
                    formObj.f_cmd.value = MULTI;    
                    sheetObj.DoSave("COM_ENS_0S1GS.do", FormQueryString(formObj));
              }
                break;
        }
    }
    
    /* Sheet관련 프로세스 처리 */
    function doActionIBSheet_ste(sheetObj,formObj,sAction, a, PageNo) {
       // sheetObj.ShowDebugMsg = true;
        switch(sAction) {

          case IBSEARCH:        //조회
                if(!validateForm(sheetObj,formObj,sAction)) {
                    return false;
                }
               
                formObj.f_cmd.value = SEARCHLIST;                
                selectVal = FormQueryString(formObj)
                sheetObj.DoSearch4Post("COM_ENS_0S2GS.do", selectVal);
           break;
           case IBSEARCHAPPEND:  // 페이징 조회
                formObj.f_cmd.value = SEARCHLIST;  
                sheetObj.DoSearch4Post("COM_ENS_0S2GS.do", selectVal, "iPage=" + PageNo, true);
           break;

           case IBINSERT:      // 입력
                //sheetObj.DataInsert();
                //새로운 ROW입력 시 KEY 정보 입력
                var Row = sheetObj.DataInsert(0);
//                sheetObj.CellValue(Row,"hol_knd_cd") = "S";
                
                break;

           case IBDOWNEXCEL:        //엑셀 다운로드
              sheetObj.Down2Excel(-1, false, false, true);
              break;
           
           case IBSAVE:        //저장
              if(validateForm(sheetObj,formObj,sAction)) 
              {
                    formObj.f_cmd.value = MULTI;    
                    sheetObj.DoSave("COM_ENS_0S2GS.do", FormQueryString(formObj));
              }
                break;
        }
    }
    
    /* Sheet관련 프로세스 처리 */
    function doActionIBSheet_loc(sheetObj,formObj,sAction, a, PageNo) {
        sheetObj.ShowDebugMsg = false;

        switch(sAction) {

          case IBSEARCH:        //조회
                if(!validateForm(sheetObj,formObj,sAction)) {
                    return false;
                }
               
                formObj.f_cmd.value = SEARCHLIST;                
                selectVal = FormQueryString(formObj)
                sheetObj.DoSearch4Post("COM_ENS_0S3GS.do", selectVal);               
               
           break;
           case IBSEARCHAPPEND:  // 페이징 조회
                formObj.f_cmd.value = SEARCHLIST;  
                sheetObj.DoSearch4Post("COM_ENS_0S3GS.do", selectVal, "iPage=" + PageNo, true);
           break;

           case IBINSERT:      // 입력
                //sheetObj.DataInsert();
                //새로운 ROW입력 시 KEY 정보 입력
                var Row = sheetObj.DataInsert(0); 
                //sheetObj.CellValue(Row,"hol_knd_cd") = "L";
                
                break;

           case IBDOWNEXCEL:        //엑셀 다운로드
              sheetObj.Down2Excel(-1, false, false, true);
              break;
           
           case IBSAVE:        //저장
              if(validateForm(sheetObj,formObj,sAction)) 
              {
                    formObj.f_cmd.value = MULTI;
                    sheetObj.DoSave("COM_ENS_0S3GS.do", FormQueryString(formObj));
              }
                break;
        }
    }
    
    /* Sheet관련 프로세스 처리 */
    function doActionIBSheet_month(sheetObj,formObj,sAction, a, PageNo) {
        sheetObj.ShowDebugMsg = false;

        switch(sAction) {

          case IBSEARCH:        //조회
                if(!validateForm(sheetObj,formObj,sAction)) {
                    return false;
                }
               
                formObj.f_cmd.value = SEARCHLIST;                
                selectVal = FormQueryString(formObj)
                sheetObj.DoSearch4Post("COM_ENS_0S4GS.do", selectVal);               
               
           break;
           case IBSEARCHAPPEND:  // 페이징 조회
                formObj.f_cmd.value = SEARCHLIST;  
                sheetObj.DoSearch4Post("COM_ENS_0S4GS.do", selectVal, "iPage=" + PageNo, true);
           break;

           case IBINSERT:      // 입력
                //sheetObj.DataInsert();
                //새로운 ROW입력 시 KEY 정보 입력
                var Row = sheetObj.DataInsert(0); 
//                sheetObj.CellValue(Row,"cnt_cd") = sheetObj.CellValue(Row +1,"cnt_cd");
//                sheetObj.CellValue(Row,"cnt_nm") = sheetObj.CellValue(Row +1,"cnt_nm");
                
                 // agnes - 기존 조회 내역일 경우 Lane / VVD 수정불가.
                if(sheetObj.CellValue(Row, 'ibflag') != 'I'){
                    //sheetObj.CellEditable(Row, 'vsl_lane_cd') = false;
                    //sheetObj.CellEditable(Row, 'vvd') = false;
                }   
                else{
                    //sheetObj.CellEditable(Row, 'vsl_sz_cd') = false;
                }                                          
                break;

           case IBDOWNEXCEL:        //엑셀 다운로드
              sheetObj.Down2Excel(-1, false, false, true);
              break;
           
           case IBSAVE:        //저장
              if(validateForm(sheetObj,formObj,sAction)) 
              {
                    formObj.f_cmd.value = MULTI;    
                    sheetObj.DoSave("COM_ENS_0S4GS.do", FormQueryString(formObj));
                    showErrMessage('');
              }
                break;
        }
    }
    
    function sheet_cnt_OnScrollNext(sheet,CondParam, PageNo, OnePageRows) {
        // TODO:sheet에 해당하는 객체와 폼 오브젝트를 doActionIBSheet 함수에 보내 주어야합니다.
       doActionIBSheet_cnt(sheetObjects[0], document.form, IBSEARCHAPPEND, true, PageNo);
    }  
    
    function sheet_ste_OnScrollNext(sheet,CondParam, PageNo, OnePageRows) {
        // TODO:sheet에 해당하는 객체와 폼 오브젝트를 doActionIBSheet 함수에 보내 주어야합니다.
       doActionIBSheet_ste(sheetObjects[1], document.form, IBSEARCHAPPEND, true, PageNo);
    }
    
    function sheet_loc_OnScrollNext(sheet,CondParam, PageNo, OnePageRows) {
        // TODO:sheet에 해당하는 객체와 폼 오브젝트를 doActionIBSheet 함수에 보내 주어야합니다.
       doActionIBSheet_loc(sheetObjects[2], document.form, IBSEARCHAPPEND, true, PageNo);
    }
    
    function sheet_month_OnScrollNext(sheet,CondParam, PageNo, OnePageRows) {
        // TODO:sheet에 해당하는 객체와 폼 오브젝트를 doActionIBSheet 함수에 보내 주어야합니다.
       doActionIBSheet_month(sheetObjects[3], document.form, IBSEARCHAPPEND, true, PageNo);
    }
    
   /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
          if(beforetab == 0) {              
            if(cnt_cd_cnt.value == "") {
              showErrMessage("You must input Country code");
              setFocus(cnt_cd_cnt);
              return false;
            }
            
            if(cnt_cd_cnt.value.length < 2) {
              showErrMessage("Country code must be 2 characters");
              setFocus(cnt_cd_cnt);
              return false;
            }  
          } else if(beforetab == 1) {          
            if(cnt_cd_ste.value == "") {
              showErrMessage("You must input Country code");
              setFocus(cnt_cd_ste);
              return false;
            }
            
            if(cnt_cd_ste.value.length < 2) {
              showErrMessage("Country code must be 2 characters");
              setFocus(cnt_cd_ste);
              return false;
            }
            
            if(ste_cd_ste.length > 1 && ste_cd_ste.value == "") {
              showErrMessage("You must input State");
              setFocus(ste_cd_ste);
              return false;
            } 
          } else if(beforetab == 2) {
            if(cnt_cd_loc.value == "") {
              showErrMessage("You must input Country code");
              setFocus(cnt_cd_loc);
              return false;
            }
            
            if(cnt_cd_loc.value.length < 2) {
              showErrMessage("Country code must be 2 characters");
              setFocus(cnt_cd_loc);
              return false;
            }
            
            if(loc_cd_loc.value == "") {
              showErrMessage("You must input Location code");
              setFocus(loc_cd_loc);
              return false;
            }
            
            if(loc_cd_loc.value.length != 5) {
              showErrMessage("Location code must be 2 characters");
              setFocus(loc_cd_loc);
              return false;
            }
          } else if(beforetab == 3) {
            if(cnt_cd_month.value == "") {
              showErrMessage("You must input Country code");
              setFocus(cnt_cd_month);
              return false;
            }
            
            if(cnt_cd_month.value.length < 2) {
              showErrMessage("Country code must be 2 characters");
              setFocus(cnt_cd_month);
              return false;
            }           
          }   
        }
        return true;
    }
    
    /**
     * 국가 선택에 따른 해당 주(State) 목록 세팅
     */
    function setSteList(cntObj, targetObj){
        upper(cntObj);
        var formObject = document.form;
        formObject.target="iframe_bizcom";
 		formObject.action="/opuscntr/bizcommon/common/COM_ENS_COMMON.jsp?func=STE_COMBO&targetCombo="+targetObj.name+"&cnt_cd="+cntObj.value;
 		result = formObject.submit();
 		
 		//document.all.iframe_bizcom02.src="/opuscntr/bizcommon/common/COM_ENS_COMMON.jsp?func=STE_IB&cnt_cd="+cntObj.value+"&sheetIdx=1&row=0";
    }
    
    function setFormConti(cntObj, targetObj) {
        upper(cntObj);
        var formObject = document.form;
        formObject.target="iframe_bizcom";
 		formObject.action="/opuscntr/bizcommon/common/COM_ENS_COMMON.jsp?func=CONTI_CNT&targetObj="+targetObj.name+"&cnt_cd="+cntObj.value;
 		result = formObject.submit();
    }
    
    function cntPopup(seq) {
        if (window.event.keyCode==13) {
            document.all["btn_cnt_cd"][seq].fireEvent("onclick");
        }
    }
    
    function locPopup(seq) {
        if (window.event.keyCode==13) {
            document.all["btn_loc_cd"].fireEvent("onclick");
        }
    }