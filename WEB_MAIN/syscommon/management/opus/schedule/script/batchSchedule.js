/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : schedule.js
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2008.12.24
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2008.12.24 정인선
* 1.0 최초 생성
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/

    /*------------------다음 코드는 JSDoc을 잘 만들기 위해서 추가된 코드임 ------------------*/
    /**
     * @fileoverview schedule 위한 화면에서 사용하는 업무 스크립트를 정의한다.
     * @author 한진해운
     */

    /**
     * @extends schedule
     * @class schedule : schedule 위한 화면에서 사용하는 업무 스크립트를 정의한다.
     */
  	function schedule() {
        this.processButtonClick     = processButtonClick;
        this.setSheetObject     	= setSheetObject;
        this.loadPage     			= loadPage;
        this.initSheet     			= initSheet;
        this.doActionIBSheet     	= doActionIBSheet;
        this.setTabObject    		= setTabObject;
        this.initTab     			= initTab;
       
        this.validateForm     		= validateForm;
    }
  	
	/*------------------여기서 부터 공통자바스크립트 함수를 정의한다.     ------------------*/
	
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
            	case "btn_Add":
            		doActionIBSheet(sheetObject1,formObject,IBINSERT);
            		break;
            		
            	case "btn_Retrieve":
            		doActionIBSheet(sheetObject1,formObject,IBSEARCH);
            		break;

            	case "btn_Save":
            		doActionIBSheet(sheetObject1,formObject,IBSAVE);
            		break;

            	case "btn_DownExcel":
					doActionIBSheet(sheetObject1,formObject,IBDOWNEXCEL);
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
                    style.height = 322;
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
                    var HeadTitle1 = "|DEL|Schedule ID|Schedule Type|Program No.|Program Name|Server|Reserved Time|Previous Job ID|Parameter|Minute|Hour|Day|Month|Week|Description";
					var headCount = ComCountHeadTitle(HeadTitle1);
                    //컬럼정보설정[필수][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
                    InitColumnInfo(headCount, 0, 0, true);
                    // 해더에서 처리할 수 있는 각종 기능을 설정한다
                    InitHeadMode(true, true, false, true, false,false);
                    //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                    InitHeadRow(0, HeadTitle1, true);
                    
                    //데이터속성    	[ROW, COL,  DATATYPE,   	WIDTH, DATAALIGN, 		COLMERGE, 	SAVENAME,  		KEYFIELD, CALCULOGIC, DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
					InitDataProperty(0, cnt++ , dtHiddenStatus,		30,		daCenter,		false,		"ibflag");	
					InitDataProperty(0, cnt++ , dtDelCheck,		30,		daCenter,		true,		"DEL",			false,			"",      dfNone,		0,		true,		true);
					InitDataProperty(0, cnt++ , dtData,			100,	daCenter,		true,		"skd_id",		false,			"",      dfNone,		0,		false,		false);
					InitDataProperty(0, cnt++ , dtCombo,		100,	daCenter,		true,		"skd_tp_cd",	false,			"",      dfNone,		0,		true,		true);
					InitDataProperty(0, cnt++ , dtPopup,		100,	daCenter,		true,		"pgm_no",		false,			"",      dfNone,		0,		true,		true);
					InitDataProperty(0, cnt++ , dtData,			150,	daCenter,		true,		"pgm_nm",		false,			"",      dfNone,		0,		true,		true);
					InitDataProperty(0, cnt++ , dtCombo,		70,		daCenter,		true,		"svr_id",		false,			"",      dfNone,		0,		true,		true);
					InitDataProperty(0, cnt++ , dtData,			130,	daCenter,		true,		"rsv_dt",		false,			"",      dfUserFormat2,	0,		true,		true);
					InitDataProperty(0, cnt++ , dtData,			100,	daCenter,		true,		"pre_skd_id",	false,			"",      dfNone,		0,		true,		true);
					InitDataProperty(0, cnt++ , dtData,			100,	daCenter,		true,		"skd_para_ctnt",		false,			"",      dfNone,		0,		true,		true);
					InitDataProperty(0, cnt++ , dtData,			100,	daCenter,		true,		"skd_mnt_ctnt",		false,			"",      dfNone,		0,		true,		true);		
					InitDataProperty(0, cnt++ , dtData,			100,	daCenter,		true,		"skd_hr_ctnt",		false,			"",      dfNone,		0,		true,		true);
					InitDataProperty(0, cnt++ , dtData,			100,	daCenter,		true,		"skd_dy_ctnt",		false,			"",      dfNone,		0,		true,		true);
					InitDataProperty(0, cnt++ , dtData,			100,	daCenter,		true,		"skd_mon_ctnt",		false,			"",      dfNone,		0,		true,		true);
					InitDataProperty(0, cnt++ , dtData,			100,	daCenter,		true,		"skd_wk_ctnt",		false,			"",      dfNone,		0,		true,		true);
					InitDataProperty(0, cnt++ , dtData,			200,	daLeft,			true,		"skd_desc",		false,			"",      dfNone,		0,		true,		true);

					InitDataCombo(0, "skd_tp_cd", "Scheduled|Direct|Direct(C)|Reserved", "S|D|C|R");
					InitDataCombo(0, "svr_id", "Korea|China|West Asia|USA|Europe", "KOR|CHN|SWA|USA|EUR");

					InitUserFormat2(0, "rsv_dt", "####-##-## ##:##", "-|:" );

					CountPosition = 0;
					PopupImage = "/opuscntr/img/btns_search.gif";
                    ShowButtonImage = 2;
                }
                break;

        }
    }

    /**
     * IBSheet 관련 각종 기능(조회,저장 등)을 처리한다. <br>
     * {@link #processButtonClick}함수에서 이 함수를 호출하여 버튼에서 IBSheet의 기능을 호추할 때 사용한다. <br>
     * @param {ibsheet} sheetObj    IBSheet Object
     * @param {form}    formObj     Form Object
     * @param {int}     sAction     처리할 Action 코드(예:IBSEARCH,IBSAVE,IBDELETE,IBDOWNEXCEL 등이며 CoObject.js에 정의됨)
     **/
    function doActionIBSheet(sheetObj,formObj,sAction) {
        sheetObj.ShowDebugMsg = false;
        switch(sAction) {
			case IBSEARCH:      //조회
				if(validateForm(sheetObj,formObj,sAction)){
					if (sheetObj.id == "sheet1"){
						formObj.f_cmd.value = SEARCH;
						sheetObj.DoSearch("BatchScheduleGS.do", FormQueryString(formObj));
					}
				}
				break;

			case IBSAVE:        //저장
				if(!validateForm(sheetObj,formObj,sAction))return;
            	formObj.f_cmd.value = MULTI;
                //저장처리
                var formparam = FormQueryString(formObj);
                
                /********* 아래의 6줄 코드는 DoSave 한줄과 동일하므로 DoSave함수로 대체할것 *******
                var sheetparam = sheetObj.GetSaveString();
                if (!sheetObj.IsDataModified && sheetparam == "") return;
                ComOpenWait(true);
                var sXml = sheetObj.GetSaveXml("BatchScheduleGS.do", formparam + "&" + sheetparam);
                sheetObj.LoadSaveXml(sXml);
                ComOpenWait(false);
                ***********************************************************************************/
                
                sheetObj.DoSave("BatchScheduleGS.do", formparam);
				break;

			case IBINSERT:      // 입력
				row = sheetObj.DataInsert(-1);
				break;
           case IBDOWNEXCEL:  //엑셀내려받기
                sheetObj.SpeedDown2Excel(-1);
                break;
        }
    }


    /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리한다. <br>
     * @param {ibsheet} sheetObj    IBSheet Object
     * @param {form}    formObj     Form Object
     * @param {int}     sAction     처리할 Action 코드(예:IBSEARCH,IBSAVE,IBDELETE,IBDOWNEXCEL 등이며 CoObject.js에 정의됨)
     **/
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
//            if (!isNumber(formObj.iPage)) {
//                return false;
//            }
        }
        return true;
    }
    
    /**
     * Program Name Data List OpenWindow. <br>
     * @param {int}	Row	행번호
     * @param {int}	Col	컬럼번호
     **/
    function sheet1_OnPopupClick(sheetObj,Row,Col){
    	ComOpenPopup("/opuscntr/ESM_HJS_0101.do", 770, 465, "setProgramNo", "1,0,1,1,1", false, false, Row, "pgm_no", 0);
    }
    
    /**
     * programNo 입력부분.<br>
     * @param {arry}	aryPopupData
     */
    function setProgramNo(aryPopupData, row, col, sheetIdx){
    	sheetObjects[sheetIdx].CellValue2(row,col) = aryPopupData[0][2];
    	sheetObjects[sheetIdx].Cellvalue2(row,5) = aryPopupData[0][3];
    }

