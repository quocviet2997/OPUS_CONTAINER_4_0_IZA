/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_0B2.js
*@FileTitle  : Vessel SKD조회(공통 Popup)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/

// 공통전역변수
var ipageNo=1 ;
var sheetObjects=new Array();
var sheetCnt=0;
var selectVal;
/* 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick=processButtonClick;
/* 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
    function processButtonClick(){
         /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
         var sheetObject=sheetObjects[0];
         /*******************************************************/
         var formObject=document.form;
    	try {
    		var srcName = ComGetEvent("name");
            switch(srcName) {
        	    case "btn_retrieve":
    	            doActionIBSheet(sheetObject,formObject,IBSEARCH);
        	        break;
        	    case "btn_new":
    	            sheetObject.RemoveAll();
    	            formObject.reset();
        	        break;
              case "btns_calendar2":
            	  var cal=new ComCalendarFromTo();
            	  cal.select(formObject.sdate, formObject.edate, 'yyyy-MM-dd');
        	      break;
              case "btn_close":
    	            ComClosePopup();
        	        break;
        	    case "btn_ok":
                    comPopupOK();
        	        break;
        	    case "btn2_down_excel":
        	    	
        	    	if(sheetObject.RowCount() < 1){//no data
        	    		ComShowCodeMessage("COM132501");
        	    	}else{
        	    		sheetObject.Down2Excel({DownCols: makeHiddenSkipCol(sheetObj),HiddenColumn:false,Merge:false,TreeLevel:false});
        	    	}
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
       sheetObjects[sheetCnt++]=sheet_obj;
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
        initControl();
    }
     function initControl() {
      	var formObject=document.form;
          //Axon 이벤트 처리1. 이벤트catch(개발자변경)
          axon_event.addListenerForm ('keydown', 'ComKeyEnter', formObject);
          axon_event.addListenerForm('change', 'obj_change', formObject);
      }
     
   /**
     * 시트 초기설정값, 헤더 정의
     * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
     * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
     */
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
        switch(sheetNo) {
            case 1:      //IBSheet1 init
            	with(sheetObj){
            		var HeadTitle="Sel| |Seq.|Lane|Port|ETD|ETA|VVD" ;

            		SetConfig( { SearchMode:2, MergeSheet:0, Page:50, FrozenCol:0, DataRowMerge:0 } );

            		var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
            		var headers = [ { Text:HeadTitle, Align:"Center"} ];
            		InitHeaders(headers, info);

            		var cols = [ {Type:"Radio",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:"radio",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
            		             {Type:"CheckBox",  Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:"checkbox",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
            		             {Type:"Seq",       Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:"",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
            		             {Type:"Text",      Hidden:0,  Width:116,  Align:"Center",  ColMerge:0,   SaveName:"slan_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
            		             {Type:"Text",      Hidden:0,  Width:116,  Align:"Center",  ColMerge:0,   SaveName:"vps_port_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
            		             {Type:"Text",      Hidden:0,  Width:116,  Align:"Center",  ColMerge:0,   SaveName:"vps_etd_dt",   KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
            		             {Type:"Text",      Hidden:0,  Width:116,  Align:"Center",  ColMerge:0,   SaveName:"vps_eta_dt",   KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
            		             {Type:"Text",      Hidden:0,  Width:116,  Align:"Center",  ColMerge:0,   SaveName:"vvd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 }  ];
            		 
            		InitColumns(cols);

            		SetWaitImageVisible(false);
            		//SetSheetHeight(ComGetSheetHeight(sheetObj, 10));
            		ComResizeSheet(sheetObjects[0]);
            	}
            	break;

            	
        }
    }

    var iPageNo = 1;
    function sheet1_OnVScroll(sheetObj, vpos, oldvpos, isTop, isBottom) {
    	if (vpos==oldvpos || !isBottom || sheetObj.RowCount() >= sheetObj.GetTotalRows()) return;
        // TODO:sheet에 해당하는 객체와 폼 오브젝트를 doActionIBSheet 함수에 보내 주어야합니다.
        doActionIBSheet(sheetObjects[0], document.form, IBSEARCHAPPEND, true, ++iPageNo);
     }

  // Sheet관련 프로세스 처리
    function doActionIBSheet(sheetObj,formObj,sAction,a,PageNo) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
           case IBSEARCH:      //조회
                var formObject=document.form;
                if(validateForm(sheetObj,formObj,sAction)) {
                	  formObj.f_cmd.value=SEARCH;                
                      selectVal=FormQueryString(formObj);
                      iPageNo = 1;
                      sheetObj.DoSearch("COM_ENS_0B2GS.do",selectVal );
                }
           break;
           case IBSEARCHAPPEND:  // 페이징 조회
                formObj.f_cmd.value=SEARCH;              
                sheetObj.DoSearch("COM_ENS_0B2GS.do",selectVal+ "&iPage="+PageNo,{Append:true} );
           break;
        }
    }
   /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj,formObj,sAction){
    	switch (sAction) {
    		case IBSEARCH:
		 		var fmDtValue=formObj.sdate.value.replace(/-/g, "");
		 		var toDtValue=formObj.edate.value.replace(/-/g, "");
		 		if (!ComIsDate(fmDtValue)  && fmDtValue != "" ){
	 				 ComShowCodeMessage("COM12134", "From Date");
					 ComSetFocus(formObj.sdate);
					 return false;
	 			} 
	 			if (!ComIsDate(toDtValue)  && toDtValue != "" ){
	 				 ComShowCodeMessage("COM12134", "To Date");
					 ComSetFocus(formObj.edate);
					 return false;
	 			} 
 	 			if( ("" != fmDtValue && "" != toDtValue) && parseInt(fmDtValue,10) > parseInt(toDtValue, 10) ) {
					 ComShowCodeMessage("COM12133", "From Date", "To Date", "earlier");
					 ComSetFocus(formObj.sdate);
					 return false;
		 		}
    			break;
    	}
        return true;
    }
    function obj_change() {
		var formObject=document.form;
		switch(ComGetEvent("name")){
			case "sdate":
				if (!ComIsDate(formObject.sdate.value) && formObject.sdate.value != "" ){
	 				 ComShowCodeMessage("COM12134", "From Date");
	 				 formObject.sdate.value="";
					 ComSetFocus(formObject.sdate);
					 return false;
	 			} 
			break;
			case "edate":
				if (!ComIsDate(formObject.edate.value) && formObject.edate.value != ""){
					 formObject.edate.value="" ;
	 				 ComShowCodeMessage("COM12134", "To Date");
	 				 ComSetFocus(formObject.edate);
					 return false;
	 			} 
			break;
	    }
	}  
