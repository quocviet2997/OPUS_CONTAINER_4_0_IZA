/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : groupware_mail_popup.js
*@FileTitle : Groupware_Mail_Popup
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.26
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.05.26 김정훈
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
     * @class groupware_mail_popup : groupware_mail_popup 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
     */
    function groupware_mail_popup() {
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
 // sheetObject에 대한 배열화를 한다.
	var sheetObjects = new Array();
	
 //sheet count 를 추가한다.
	var sheetCnt = 0;
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
			//시작 환경 설정 함수 이름 변경
			ComConfigSheet (sheetObjects[i]);
			initSheet(sheetObjects[i],i+1);
			//마지막 환경 설정 함수 추가
			ComEndConfigSheet(sheetObjects[i]);
			doActionIBSheet(sheetObjects[i],document.form,IBSEARCH);
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
                   var HeadTitle1 = "|popup|Subject|Contents";
					var headCount = ComCountHeadTitle(HeadTitle1);
                   //컬럼정보설정[필수][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
                   InitColumnInfo(headCount, 0, 0, true);
                   // 해더에서 처리할 수 있는 각종 기능을 설정한다
                   InitHeadMode(true, true, false, true, false,false);
                   //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                   InitHeadRow(0, HeadTitle1, true);
                   
                   //데이터속성    	[ROW, COL,  DATATYPE,   	WIDTH, DATAALIGN, 		COLMERGE, 	SAVENAME,  		KEYFIELD, CALCULOGIC, DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
					InitDataProperty(0, cnt++ , dtStatus,		30,		daCenter,		false,		"ibflag");	
					InitDataProperty(0, cnt++ , dtPopup,		50,	daCenter,		true,		"popup");
					InitDataProperty(0, cnt++ , dtData,			300,	daCenter,		true,		"eml_tit_nm",		false,			"",      dfNone,		0,		true,		true);	
					InitDataProperty(0, cnt++ , dtData,			700,	daCenter,		true,		"eml_ctnt",		false,			"",      dfNone,		0,		true,		true);			
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
 						sheetObj.DoSearch("Groupware_Mail_PopupGS.do", FormQueryString(formObj));
 					}
 				}
 				break;
        }
    }
    
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
//            if (!isNumber(formObj.iPage)) {
//                return false;
//            }
        }
        return true;
    }
        
	function sheet1_OnPopupClick(sheetObj){
		if (sheetObj.id == "sheet1"){
			document.form.f_cmd.value = COMMAND01;
			var sXml = sheetObj.GetSearchXml("Groupware_Mail_PopupGS.do", FormQueryString(document.form));
			window.open(ComGetEtcData(sXml,"GroupwarePopupURL"));
		}
	}
	/* 개발자 작업  끝 */