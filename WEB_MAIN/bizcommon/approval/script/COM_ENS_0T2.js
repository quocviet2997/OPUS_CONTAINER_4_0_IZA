/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : COM_ENS_0T2.jsp
*@FileTitle : Approval Route PopUp
*Open Issues :
*Change history :
*@LastModifyDate : 2008-09-01
*@LastModifier : Jeong-Hoon, KIM
*@LastVersion : 1.0
* 2008-09-01 Jeong-Hoon, KIM
* 1.0 최초 생성
=========================================================*/ 

var sheetObjects = new Array();
var sheetCnt = 0;

/* 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick = processButtonClick;

/* 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
    function processButtonClick(){
         /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
         var sheetObject = sheetObjects[0];
         var sheetObject1 = sheetObjects[1];
         var sheetObject2 = sheetObjects[2];
         /*******************************************************/
         var formObject = document.form;

    	try {
    		var srcName = window.event.srcElement.getAttribute("name");

            switch(srcName) {
            	case "btns_add":
        	        addUser();        	        
                    break;

        	    case "btns_del":
                    delUser();
        	        break;
        	        
        	    case "btng_save":
        	        doActionIBSheetUser2(sheetObject2, formObject, IBSAVE);
        	        break;

        	    case "btn_close":
    	            window.close();
        	        break;


            } // end switch
    	}catch(e) {
    		if( e == "[object Error]") {
    			ComShowMessage(getMsg("COM12111"));
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
          
        }
       
        // 조직도 세팅
        var sheetObjectDept = sheetObjects[0];
        var formObject = document.form;
        doActionIBSheetDept(sheetObjectDept, formObject, IBSEARCH);
                
        // CSR Approval Route 조회
        var mode = formObject.mode.value;
        var sheetObjectUser2 = sheetObjects[2];
        if(mode == "csr") {
            doActionIBSheetUser2(sheetObjectUser2, formObject, IBSEARCH);
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
            case 1:     // Dept(조직도) 그리드 영역 초기화
                with (sheetObj) {
                    // 높이 설정
                    style.height = 320 ;
                    //전체 너비 설정
                    SheetWidth = mainTable.clientWidth;

                    //Host정보 설정[필수][HostIp, Port, PagePath]
                    if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);

                    //전체Merge 종류 [선택, Default msNone]
                    MergeSheet = msNone;

                    //전체Edit 허용 여부 [선택, Default false]
                    Editable = true;

                    //행정보설정[필수][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
                    InitRowInfo( 0, 1, 9, 100);

                    //컬럼정보설정[필수][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
                    InitColumnInfo(1, 0, 0, true);

                    // 해더에서 처리할 수 있는 각종 기능을 설정한다
                    InitHeadMode(true, true, true, true, false,false)

                    var HeadTitle = "" ;

                    //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                    InitHeadRow(0, HeadTitle, false);

                    //데이터속성    [ROW, COL,  DATATYPE,   WIDTH, DATAALIGN, COLMERGE, SAVENAME,  KEYFIELD, CALCULOGIC, DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
                    //InitDataProperty(0, cnt++ , dtCheckBox,   40,    daCenter,  false,    "checkbox",        false,          "",       dfNone,	    0,     true,       true);
                    InitDataProperty(0, cnt++ , dtData,      110,    daLeft,  false,    "ofc_cd",        false,          "",       dfNone,   	0,     false,       false);
                    //InitDataProperty(0, cnt++ , dtHidden,      0,    daLeft,  false,    "mst_ofc_id",        false,          "",       dfNone,   	0,     true,       true);
                    //InitDataProperty(0, cnt++ , dtHidden,      0,    daLeft,  false,    "loc_cd",        false,          "",       dfNone,   	0,     true,       true);
                    //InitDataProperty(0, cnt++ , dtHidden,      0,    daLeft,  false,    "prnt_loc_id",        false,          "",       dfNone,   	0,     true,       true);
                    
                    InitTreeInfo(0, "sLevel", RgbColor(0,0,255), true);
                    ShowTreeLevel(2);
                    CountPosition = 0;  
                }
                break;
            case 2:      //IBSheet1 init
                with (sheetObj) {
                    //전체 너비 설정
                    SheetWidth = mainTable.clientWidth;

                    //Host정보 설정[필수][HostIp, Port, PagePath]
                    if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);

                    //전체Merge 종류 [선택, Default msNone]
                    MergeSheet = msNone;

                    //전체Edit 허용 여부 [선택, Default false]
                    Editable = false;

                    //행정보설정[필수][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
                    InitRowInfo( 1, 1, 9, 100);

                    //컬럼정보설정[필수][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
                    InitColumnInfo(4, 0, 0, true);

                    // 해더에서 처리할 수 있는 각종 기능을 설정한다
                    InitHeadMode(true, true, false, true, false,false)

                    //var HeadTitle = "Company|Department|Name|Title" ;
                    var HeadTitle = "Name|Dept|Title|Id" ;

                    //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                    InitHeadRow(0, HeadTitle, true);

                    //데이터속성    [ROW, COL,  DATATYPE,   WIDTH, DATAALIGN, COLMERGE, SAVENAME,  KEYFIELD, CALCULOGIC, DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
                    InitDataProperty(0, cnt++ , dtData,      110,   daLeft,  false,    "usr_nm",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      50,    daCenter,    false,    "ofc_cd",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      80,    daLeft,    false,    "title",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtHidden,     0,    daCenter,  false,    "usr_id",       false,          "",       dfNone,     0,     false,       false);

                    CountPosition = 0
                    style.height = GetSheetHeight(10) ;
               }
                break;
              case 3:      //IBSheet2 init
                with (sheetObj) {
                    //전체 너비 설정
                    SheetWidth = mainTable.clientWidth;

                    //Host정보 설정[필수][HostIp, Port, PagePath]
                    if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);

                    //전체Merge 종류 [선택, Default msNone]
                    MergeSheet = msNone;

                    //전체Edit 허용 여부 [선택, Default false]
                    Editable = false;

                    //행정보설정[필수][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
                    InitRowInfo( 1, 1, 9, 100);

                    //컬럼정보설정[필수][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
                    InitColumnInfo(7, 0, 0, true);

                    // 해더에서 처리할 수 있는 각종 기능을 설정한다
                    InitHeadMode(true, true, false, true, false,false)

                    var HeadTitle = "|No|Id|Name|Dept|Title|APP.STS|" ;

                    //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                    InitHeadRow(0, HeadTitle, true);

                    //데이터속성    [ROW, COL,  DATATYPE,   WIDTH, DATAALIGN, COLMERGE, SAVENAME,  KEYFIELD, CALCULOGIC, DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
                    InitDataProperty(0, cnt++ , dtStatus,     0,    daCenter,  true,    "ibflag",            false,        "",       dfNone,   		0,     false,      false);
                    InitDataProperty(0, cnt++ , dtData,      20,    daCenter,    false,    "apro_seq",    false,          "",       dfNone,   	0,     false,       false);
                    InitDataProperty(0, cnt++ , dtHidden,     0,    daLeft,    false,    "apro_usr_id",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      100,    daLeft,  false,   "apro_usr_nm",        false,          "",       dfNone,     	0,     false,       false);

                    InitDataProperty(0, cnt++ , dtData,      50,    daCenter,  false,    "apro_ofc_cd",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      80,    daLeft,    false,    "apro_usr_jb_tit_nm",        false,          "",       dfNone,     0,     false,       false);
                    InitDataProperty(0, cnt++ , dtData,      50,    daCenter,    false,    "apspo_cd",        false,          "",       dfNone,     0,     false,       false);
                    
                    CountPosition = 0
                    SetCellBackColor(0,"name", "#DEFBF8");
                    SetCellBackColor(0,"mail", GetCellBackColor(0,"name"));
                    
                    SetColHidden(0,1);

                    style.height = GetSheetHeight(10) ;
               }
                break;

        }
    }

    /* Sheet관련 프로세스 처리 */
    function doActionIBSheetUser1(sheetObj,formObj,sAction, a, PageNo) {
        sheetObj.ShowDebugMsg = false;

        switch(sAction) {

          case IBSEARCH:        //조회
                
                if(!validateForm(sheetObj,formObj,sAction)) {
                    return false;
                }
                
                formObj.f_cmd.value = SEARCH;                
                selectVal = FormQueryString(formObj)
                sheetObj.DoSearch4Post("COM_ENS_0T2GS.do", selectVal);               
               
           break;
           case IBSEARCHAPPEND:  // 페이징 조회
                formObj.f_cmd.value = SEARCHLIST;  
                sheetObj.DoSearch4Post("COM_ENS_0T2GS.do", selectVal, "iPage=" + PageNo, true);
           break;



        }
    }
    
    function sheetUser1_OnScrollNext(sheet,CondParam, PageNo, OnePageRows) {
     	doActionIBSheetUser1(sheet, document.form, IBSEARCHAPPEND, true, PageNo + 1);
    } 
        
    /* 조직도 세팅 */
    function doActionIBSheetDept(sheetObj, formObj, sAction, a, PageNo) {
        sheetObj.ShowDebugMsg = false;

        switch(sAction) {

          case IBSEARCH:        //조회
                
                if(!validateForm(sheetObj,formObj,sAction)) {
                    return false;
                }

                formObj.f_cmd.value = SEARCH01;                
                selectVal = FormQueryString(formObj)
                sheetObj.DoSearch4Post("COM_ENS_0T2GSDept.do", selectVal);               
               
           break;
        }
    }
    
 /* Sheet관련 프로세스 처리 */
    function doActionIBSheetUser2(sheetObj,formObj,sAction, a, PageNo) {
        
        sheetObj.ShowDebugMsg = false;
       
        switch(sAction) {

          case IBSEARCH:        //조회
                if(!validateForm(sheetObj,formObj,sAction)) {
                    return false;
                }
                
                formObj.f_cmd.value = SEARCH02;                
                selectVal = FormQueryString(formObj)
                sheetObj.DoSearch4Post("COM_ENS_0T2GSRoute.do", selectVal);               
               
           break;
           case IBSAVE:        //저장
              // 모두 재입력을 원칙으로 함
              for(var i=0; i<sheetObj.RowCount; i++) {
                  sheetObj.SetCellValue(i + 1, "ibflag", "I");
              }
              
              formObj.f_cmd.value = MULTI;    
              sheetObj.DoSave("COM_ENS_0T2GSRoute.do", FormQueryString(formObj));
              
              break;
        }
    }


   /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
//            if (!isNumber(iPage)) {
//
//                return false;
//            }
        }

        return true;
    }
    
    function sheetDept_OnClick(sheetObj, row, col, value) {
      var formObject = document.form;
      formObject.ofc_cd_deptsrch.value = sheetObj.GetCellValue(sheetObj.SelectRow, 'ofc_cd');      
      doActionIBSheetUser1(sheetObjects[1], document.form,IBSEARCH);
    }
    
    // 소속 Office 자동 펼침 처리
    function sheetDept_OnSearchEnd(sheetObj,ErrMsg) {
    	sheetObj.ShowTreeLevel(2, 1);
    	
    	var usr_ofc_cd = document.form.usr_ofc_cd.value;    	
    	if(usr_ofc_cd == null || usr_ofc_cd == "")
    		return;
    	
    	expandUserDept(sheetObj, usr_ofc_cd);
    }
    
    function expandUserDept(sheetObj, usr_ofc_cd) {
    	var userDeptSelRow = sheetObj.findText(0, usr_ofc_cd, 0);
    	
    	// 상위 Office 자동 펼침 처리
    	var selRow = userDeptSelRow;
    	var rowLevel = sheetObj.RowLevel(userDeptSelRow);
    	do {
			sheetObj.SetRowExpanded(selRow,1);
    		selRow = sheetObj.findText(0, getUpperDept(sheetObj, selRow, rowLevel), 0);
    		rowLevel = sheetObj.RowLevel(selRow);
    	} while(rowLevel > 2)
    	
    	// 소속 Office Focus
    	if(userDeptSelRow > 7)
	    	sheetObj.TopRow = userDeptSelRow - 7;
	    else
	    	sheetObj.TopRow = 1
	    	
    	sheetObj.SelectRow = userDeptSelRow;
    	sheetDept_OnClick(sheetObj, userDeptSelRow, "ofc_cd", "");
    }
    
    function getUpperDept(sheetObj, selRow, rowLevel) {
    	var upperDept = "";
    	for(var i=selRow-1; i>0; i--) {
    		if(sheetObj.RowLevel(i) == rowLevel - 1) {
    			upperDept = sheetObj.GetcellValue(i, "ofc_cd");
    			break;
    		}
    	}
    	
    	return upperDept;
    }
    
    function sheetUser1_OnDblClick(sheetObj, row, col, value) {
        addUser();
    }
    
    function sheetUser2_OnDblClick(sheetObj, row, col, value) {
        delUser();
    }
    
    function addUser() {
        var sheetObject1 = sheetObjects[1];
        var sheetObject2 = sheetObjects[2];
        
        var selrow = sheetObject1.SelectRow;
        if ( selrow > 0 )
        {
            var usr_id = sheetObject1.GetCellValue(selrow, "usr_id");
            var usr_nm = sheetObject1.GetCellValue(selrow, "usr_nm");
            var ofc_cd = sheetObject1.GetCellValue(selrow, "ofc_cd");
            var title = sheetObject1.GetCellValue(selrow, "title");
            
            // Duplication(중복) 체크
            for(var i=0; i<sheetObject2.RowCount; i++) {
                if(sheetObject2.GetCellValue(i + 1, "apro_usr_id") == usr_id) {
                    ComShowMessage(getMsg("COM12115", usr_nm));
                    return;
                }
            }
            
            // 대상 Sheet로 데이타 이행
            row = sheetObject2.DataInsert(0);
			sheetObject2.SetCellValue(row, "apro_usr_nm", usr_nm);
			sheetObject2.SetCellValue(row, "apro_ofc_cd", ofc_cd);            			
			sheetObject2.SetCellValue(row, "apro_usr_jb_tit_nm", title); 
			sheetObject2.SetCellValue(row, "apro_usr_id", usr_id);
			
            // APPROVAL SEQ 재정렬
            var rowCount = sheetObject2.RowCount;
            for(var i=0; i<rowCount; i++) {
                  sheetObject2.SetCellValue(i + 1, "apro_seq", rowCount - i);
            }
        }   
    }
    
    function delUser() {
        var sheetObject2 = sheetObjects[2];
        
        var selrow = sheetObject2.SelectRow;
        
        
        // Approval 완료 체크
        if(sheetObject2.GetCellValue(selrow, "apspo_cd") == "Approved"){
        	ComShowMessage(getMsg("COM12186"));
        	return;
        }
                    
        if(selrow > 0) {
            sheetObject2.RowDelete(selrow, false);
        }
        
        // APPROVAL SEQ 재정렬
        var rowCount = sheetObject2.RowCount;
        for(var i=0; i<rowCount; i++) {
              sheetObject2.SetCellValue(i + 1, "apro_seq", rowCount - i);
        }
    }