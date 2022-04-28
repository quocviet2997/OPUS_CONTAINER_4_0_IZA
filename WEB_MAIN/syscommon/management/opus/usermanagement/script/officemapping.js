var sheetObjects = new Array();
var sheetCnt = 0;

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
        	    case "btn_retrieve":
                  //zu_openRunning(true);
    	            doActionIBSheet(sheetObject,formObject,IBSEARCH);
    	            doActionIBSheet(sheetObject1,formObject,IBSEARCH);
                  //zu_openRunning(false);
        	        break;
        	    case "btns_add":
                  IBS_Sheet2SheetCheck(sheetObject, sheetObject1, 0);
        	        break;
        	    case "btns_delete":
                  IBS_Sheet2SheetCheck(sheetObject1, sheetObject, 0);
        	        break;
        	    case "btng_save":
    	            doActionIBSheet(sheetObject1,formObject,IBSAVE);
        	        break;
        	    case "btn_confirm":
				    	    		comPopupOK();
				    	    		break;
             case "btn_close":
            	 ComClosePopup();
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
      	          ComConfigSheet(sheetObjects[i]);
      	    	          initSheet(sheetObjects[i],i+1);
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
		sheetObj.UseUtf8=true;
       // sheetObj.WaitImageVisible = false;

        switch(sheetNo) {
             case 1:      //IBSheet1 init
                with (sheetObj) {

	              // (4, 0, 0, true);
            	 var HeadTitle = "||OfficeCode|English Office Name|Local Office Name";
	
	               SetConfig( { SearchMode:2, MergeSheet:0, Page:10, DataRowMerge:0 } );
	               var info    = { Sort:0, ColMove:1, HeaderCheck:1, ColResize:1 };
	               var headers = [ { Text:HeadTitle, Align:"Center"} ];
	               InitHeaders(headers, info);
	
		              var cols = [ {Type:"Radio",  Hidden:0, Width:20,   Align:"Center",  ColMerge:0,   SaveName:"radio" },
		 		                  {Type:"CheckBox",   Hidden:0,  Width:35,  Align:"Center",  ColMerge:0,   SaveName:"checkbox"},
		 		                  {Type:"Text",       Hidden:0,  Width:100,  Align:"Left",    ColMerge:0,   SaveName:"ofc_cd",  KeyField:1,   CalcLogic:"",   	Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, TreeCol:1 ,  LevelSaveName:"level" },
		 		                  {Type:"Text",       Hidden:0,  Width:200,  Align:"Left",    ColMerge:0,   SaveName:"ofc_eng_nm",  KeyField:1,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		 		                  {Type:"Text",       Hidden:0,  Width:200,  Align:"Left",    ColMerge:0,   SaveName:"ofc_krn_nm",  KeyField:1,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:0 } 
		 		                  ];

				      InitColumns(cols);
	                    // InitTreeInfo("level"	, "level");
//	                     SetSheetHeight(340);
	                     resizeSheet();
		           //   InitHeaders(headers, info);
	               //      InitTreeInfo(1, "level");
                  //InitTreeInfo("level", "level");
               }
             break;
        }
    }
    
    function resizeSheet(){
   	 ComResizeSheet(sheetObjects[0]);
   }

  // Sheet관련 프로세스 처리
    function doActionIBSheet(sheetObj,formObj,sAction) {
        sheetObj.ShowDebugMsg = false;
        switch(sAction) {
           case IBSEARCH:      //조회
              formObj.f_cmd.value = SEARCH01;
              sheetObj.DoSearch("searchOrg.do", FormQueryString(formObj));

              break;
            case IBSAVE:        //저장
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
     * opener로 값을 리턴하는 기능 구
     * opener의 폼 element로 리턴하는 경우는 settingData함수를 사용하고,
     * opener의 IBSheet로 리턴하는 경우는 settingDataIBSheet를 사용합니다.
     * 사용방법은 동일하지만 두 함수 내에서 처리하는 로직만 다릅니다.
     * 둘중 하나만 사용한다 .
     */
    function sheet1_OnDblClick(sheetObj, Row, Col) {
    
      //ComShowMessage("the sheet is doubleclicked!!");
    	// 1. form control에 들어갈 .
      //  try{
      //   settingData(sheetObj.CellValue(Row, "ofc_cd"));
      //  }catch(e){
      //    ComShowMessage(e);
      //  }
        
    	// 2. ibSheet control에 들어갈 .        
        //try{
    				comPopupOK();
    				
//         settingDataIBSheet(sheetObj.CellValue(Row, "ofc_cd"));
         //ComShowMessage("settingDataIBSheet!!");
        //}catch(e){
        //  ComShowMessage(e);
        //}
        
    }
    