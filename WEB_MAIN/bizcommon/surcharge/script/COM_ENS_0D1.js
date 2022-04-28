// 공통전역변수


var docObjects = new Array();
var sheetCnt = 0;

/* 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick = processButtonClick;

/* 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
    function processButtonClick(){
         /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
         var sheetObject = docObjects[0];
         /*******************************************************/
         var formObject = document.form;

    	try {
    		var srcName = window.event.srcElement.getAttribute("name");

            switch(srcName) {

        	    case "btn_retrieve":
        	       doActionIBSheet(sheetObject,formObject,IBSEARCH);
        	       break;

        	    case "btn_new":
    	           sheetObject.RemoveAll();
    	           formObject.reset();
        	       break;

                case "btn_close":
    	           self.close();
        	       break;

        	    case "btn_ok":
                   showErrMessage("btn_ok");
        	       break;
        	    
        	    case "btn_por_cd":
        	       var loc_cd = formObject.por.value;
        	       var targetObjList = "loc_cd:por";        	       
                   var v_display = "1,0,1,1,1,1,1,1,1,1,1,1";
        	       var param = "?loc_cd="+loc_cd+"&classId=COM_ENS_051";
      				  
      			   comPopupWithTargetObj('/opuscntr/COM_ENS_051.do' + param, 770, 485, targetObjList, v_display, true);
      			   break;
      		    case "btn_pol_cd":
        	       var loc_cd = formObject.pol.value;
        	       var targetObjList = "loc_cd:pol";        	       
                   var v_display = "1,0,1,1,1,1,1,1,1,1,1,1";
        	       var param = "?loc_cd="+loc_cd+"&classId=COM_ENS_051";
      				  
      			   comPopupWithTargetObj('/opuscntr/COM_ENS_051.do' + param, 770, 485, targetObjList, v_display, true);
      			   break;
      		    case "btn_pod_cd":
        	       var loc_cd = formObject.pod.value;
        	       var targetObjList = "loc_cd:pod";        	       
                   var v_display = "1,0,1,1,1,1,1,1,1,1,1,1";
        	       var param = "?loc_cd="+loc_cd+"&classId=COM_ENS_051";
      				  
      			   comPopupWithTargetObj('/opuscntr/COM_ENS_051.do' + param, 770, 485, targetObjList, v_display, true);
      			   break;
      			case "btn_del_cd":
        	       var loc_cd = formObject.del.value;
        	       var targetObjList = "loc_cd:del";        	       
                   var v_display = "1,0,1,1,1,1,1,1,1,1,1,1";
        	       var param = "?loc_cd="+loc_cd+"&classId=COM_ENS_051";
      				  
      			   comPopupWithTargetObj('/opuscntr/COM_ENS_051.do' + param, 770, 485, targetObjList, v_display, true);
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
            comConfigSheet(docObjects[i],SYSTEM_ENIS);

            initSheet(docObjects[i],i+1);
        //khlee-마지막 환경 설정 함수 추가
            comEndConfigSheet(docObjects[i]);
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
                    style.height = GetSheetHeight(10) ;
                    //전체 너비 설정
                    SheetWidth = mainTable.clientWidth;

                    //Host정보 설정[필수][HostIp, Port, PagePath]
                    if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);

                    //전체Merge 종류 [선택, Default msNone]
                    MergeSheet = msAll;

                    //전체Edit 허용 여부 [선택, Default false]
                    Editable = true;

                    //행정보설정[필수][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
                    InitRowInfo( 1, 1, 9, 100);

                    //컬럼정보설정[필수][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
                    InitColumnInfo(16, 0, 0, true);

                    // 해더에서 처리할 수 있는 각종 기능을 설정한다
                    InitHeadMode(true, true, true, true, false,false)

                    var HeadTitle = "|||Per|CURR|Rate|%|B/L Min|Spcl|Pay|Origin|Destin|Eff Date|Exp Date|N|E" ;

                    //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                    InitHeadRow(0, HeadTitle, false);

                    //데이터속성    [ROW, COL,  DATATYPE,   WIDTH, DATAALIGN, COLMERGE, SAVENAME,  KEYFIELD, CALCULOGIC, DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
                    InitDataProperty(0, cnt++ , dtRadioCheck,30,    daCenter,  false,    "",        false,          "",       dfNone,	    0,     true,      true);
                    InitDataProperty(0, cnt++ , dtCheckBox,  30,    daCenter,  false,    "",        false,          "",       dfNone,   	0,     true,      true);
                    InitDataProperty(0, cnt++ , dtData,     130,    daCenter,   true,    "",        false,          "",       dfNone,   	0,     true,      true);
                    InitDataProperty(0, cnt++ , dtData,      50,    daCenter,  false,    "",        false,          "",       dfNone,       0,     true,      true);
                    InitDataProperty(0, cnt++ , dtData,      50,    daCenter,  false,    "",        false,          "",       dfNone,       0,     true,      true);
                                                                                                                                                   
                    InitDataProperty(0, cnt++ , dtData,      50,    daCenter,  false,    "",        false,          "",       dfFloat,      2,     true,      true);
                    InitDataProperty(0, cnt++ , dtData,      50,    daCenter,  false,    "",        false,          "",       dfFloat,      2,     true,      true);
                    InitDataProperty(0, cnt++ , dtData,      50,    daCenter,  false,    "",        false,          "",       dfInteger,    0,     true,      true);
                    InitDataProperty(0, cnt++ , dtData,      50,    daCenter,  false,    "",        false,          "",       dfNone,       0,     true,      true);
                    InitDataProperty(0, cnt++ , dtData,      50,    daCenter,  false,    "",        false,          "",       dfNone,       0,     true,      true);
                                                                                                                                                  
                    InitDataProperty(0, cnt++ , dtData,      50,    daCenter,  false,    "",        false,          "",       dfNone,       0,     true,      true);
                    InitDataProperty(0, cnt++ , dtData,      50,    daCenter,  false,    "",        false,          "",       dfNone, 	    0,     true,      true);
                    InitDataProperty(0, cnt++ , dtData,      70,    daCenter,  false,    "",        false,          "",       dfDateYmd,    0,     true,      true);
                    InitDataProperty(0, cnt++ , dtData,      70,    daCenter,  false,    "",        false,          "",       dfDateYmd,    0,     true,      true);
                    InitDataProperty(0, cnt++ , dtCheckBox,  30,    daCenter,  false,    "",        false,          "",       dfNone,       0,     true,      true);
                                                                                                                                                  
                    InitDataProperty(0, cnt++ , dtCheckBox,  30,    daCenter,  false,    "",        false,          "",       dfNone,       0,     true,      true);
                    
                    WordWrap = true; 
               }
                break;

        }
    }

  // Sheet관련 프로세스 처리
    function doActionIBSheet(sheetObj,formObj,sAction) {
        sheetObj.ShowDebugMsg = false;

        switch(sAction) {

           case IBSEARCH:      //조회
                if(validateForm(sheetObj,formObj,sAction))
               // formObj.f_cmd.value = SEARCH;

                sheetObj.DoSearch("UI_COM_ENS_0D1_DATA.htm");

               //sheetObj.DoSearch4Post("com.clt.apps.bms.bms.pfm.managemarketstatus.UIBMSPFM001Action.do", FormQueryString(formObj));
                break;
            case IBSAVE:        //저장
              if(validateForm(sheetObj,formObj,sAction))
                  alert (" Save .. ");
//                formObj.f_cmd.value = MULTI;

                //sheetObj.DoAllSave("com.clt.apps.bms.bms.pfm.managemarketstatus.UIBMSPFM001Action.do", FormQueryString(formObj));
                break;

           case IBINSERT:      // 입력
                sheetObj.DataInsert();
                break;

           case IBCOPYROW:        //행 복사
              sheetObj.DataCopy();
              break;

           case IBDOWNEXCEL:        //엑셀 다운로드
              sheetObj.Down2Excel(-1, false, false, true);
              break;

           case IBLOADEXCEL:        //엑셀 업로드
              sheetObj.LoadExcel();
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

   /**
     * POR, DEL 값에 따른, Service Scope 조회
     */
    function setSvcScope() {        
        var formObject = document.form;
        var por_val = formObject.por.value;
        var del_val = formObject.del.value;
        
        if(por_val.length != 5 || del_val.length != 5) {
            return;
        }
        document.all.iframe_bizcom.src = "/opuscntr/bizcommon/common/COM_ENS_COMMON.jsp?"
 		                + "func=SVC_SCOPE&"
 		                + "targetCombo=selSvcScope&"
 		                + "por="+por_val+"&"
 		                + "del="+del_val;
    }