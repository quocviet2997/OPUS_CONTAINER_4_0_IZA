/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_021.js
*@FileTitle  : Contract No 조회
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/02
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
                case "btns_calendar1":
                	var cal=new ComCalendarFromTo();
                	cal.select(formObject.sdate,  formObject.edate,  'yyyy-MM-dd');
        	        break;
                case "btn_close":
    	            ComClosePopup();
        	        break;
        	    case "btn_ok":
                    comPopupOK();
        	        break;
        	    case "btn2_down_excel":
        	    	if (sheetObject.RowCount()== 0 ) {
        		   		ComShowCodeMessage("COM132501"); // No data to dowload as Excel
        		   	    return;
        		   	} else {
        		   		ComOpenWait(true);	    	
            	    	formObject.f_cmd.value = SEARCH01;
            	    	formObject.target = "_self"
            	    	formObject.action = "COM_ENS_021DL.do?"+ FormQueryString(formObject);
            	    	formObject.submit();
    					ComOpenWait(false);
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
    function initControl() {
    	var formObject=document.form;
        //Axon 이벤트 처리1. 이벤트catch(개발자변경)
        axon_event.addListenerFormat('keypress', 'keypressFormat', formObject);
        axon_event.addListenerFormat ('focus', 'obj_activate', formObject);
        axon_event.addListenerForm ('focusout', 'obj_deactivate', formObject);
        axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
    }
    //업무 자바스크립트 OnKeyPress 이벤트 처리
    function keypressFormat() {
    	obj=event.srcElement;
  	    if(obj.dataformat == null) return;
  	    window.defaultStatus=obj.dataformat;
  	    switch(ComGetEvent("name")) {
  	        case "cont_no":
  	        	ComKeyOnlyNumber(obj);
  	            break;
  	        case "cont_tp":
  	        	ComKeyOnlyAlphabet('upper');
  	            break;
  	        case "sdate":
  	        	ComKeyOnlyNumber(obj);
	            break;
  	        case "edate":
	        	ComKeyOnlyNumber(obj);
	            break;
  	        case "cust_nm":
	        	ComKeyOnlyAlphabet('uppernum');
	            break;
  	        case "ofc_cd":
	        	ComKeyOnlyAlphabet('upper');
	            break;
  	        case "ctrt_cust_sls_ofc_cd":
  	        	ComKeyOnlyAlphabet('upper');
            break;
  	    }
    }
  //업무 자바스크립트 OnFocus 이벤트 처리
    function obj_activate() {
    	obj=event.srcElement;
	  	//마스크 구분자 없애기
//    	if(obj.name == 'edate'){
//    		if(document.form.edate.value == ''){
//    			document.form.edate.value = getCurrDate('-');
//    		}
//    	}
    	ComClearSeparator (event.srcElement);
    }
    //업무 자바스크립트 Onblur 이벤트 처리
    function obj_deactivate(){
        //입력Validation 확인 및 마스킹 처리
        obj=event.srcElement;
	  	//마스크 구분자 없애기
    	if(obj.name != 'cont_no'){
    		ComChkObjValid(event.srcElement);
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
	                /**
	                 * 20120206 JUN SUNG, KIM
	                 * mdm 데이타 만 delete flag 값 display 해 달라는 요청 건으로 .jsp 페이지에 delt_flg_status 값을 setting 해서 check 한다.
	                 */
	                var mdmYN = document.form.mdm_yn.value;
	
	            	SetConfig( { SearchMode:2, MergeSheet:0, Page:50, FrozenCol:0, FrozenCol:0, DataRowMerge:0 } );
	
	                var HeadTitle = "||Contract No.|Customer Name|Effective Date|Expire Date|S Office|C Office" ;
	                if(mdmYN.replace(/\s/g,"") != ""){
	                	HeadTitle += "|Status";
	                }
	
	                var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
	            	var headers = [ { Text:HeadTitle, Align:"Center"} ];
	            	InitHeaders(headers, info);
	
	            	var cols = [ {Type:"Radio",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:"radio",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	            	             {Type:"CheckBox",  Hidden:0, TrueValue:"Y", FalseValue:"N"  , Width:30,   Align:"Center",  ColMerge:0,   SaveName:"checkbox",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	            	             {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"sc_no",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	            	             {Type:"Text",      Hidden:0,  Width:250,  Align:"Left",    ColMerge:0,   SaveName:"cust_lgl_eng_nm",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	            	             {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"ctrt_eff_dt",           KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	            	             {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"ctrt_exp_dt",           KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	            	             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	            	             {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"ctrt_cust_sls_ofc_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 }  ];
	            	if(mdmYN.replace(/\s/g,"") != ""){
		            	cols.push({Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"delt_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
	            	}
	            	 
	            	InitColumns(cols);
	
	            	SetSheetHeight(ComGetSheetHeight(sheetObj, 9));
	            	SetEditable(1);
	            	SetCountFormat("[SELECTDATAROW / TOTALROWS]");
            	}
            	break;
        }
    }
    
    // Sheet관련 프로세스 처리
    function doActionIBSheet(sheetObj,formObj,sAction, a, PageNo) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
           case IBSEARCH:      //조회
                if(!validateForm(sheetObj,formObj,sAction)) {
                    return false;
                }
                formObj.f_cmd.value=SEARCH;
                selectVal=FormQueryString(formObj);
                iPageNo=1;
                sheetObj.DoSearch("COM_ENS_021GS.do",selectVal );
           break;
           case IBSEARCHAPPEND:  // 페이징 조회
                formObj.f_cmd.value=SEARCH;    
                sheetObj.DoSearch("COM_ENS_021GS.do",selectVal+"&iPage="+iPageNo,{Append:true} );
           break;
        }
    }
    
    var iPageNo = 1;
    function sheet1_OnVScroll(sheetObj, vpos, oldvpos, isTop, isBottom) {
        if (!isBottom || sheetObj.RowCount() >= sheetObj.GetTotalRows()) return;
        doActionIBSheet(sheetObj, document.form, IBSEARCHAPPEND, true, ++iPageNo);
    }
    
   /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
            // Period 유효성 체크
            if(formObj.sdate.value != "") {
                if(formObj.edate.value == "") {
                    ComShowMessage("You must input period(end date)");
                    setFocus(formObj.edate);
                    return false;
                }
            } else {
                if(formObj.edate.value != "") {
                    ComShowMessage("You must input period(start date)");
                    setFocus(formObj.sdate);
                    return false;
                }
            }
        }
        return true;
    }
     /**
      * 현재일자를 구함
      * str : YYYY-MM-DD형태의 일자를 리턴
      */
   	function getCurrDate(delimiter){
       var current_date=new Date();
       var year=current_date.getFullYear().toString();
       var month=current_date.getMonth() + 1;
       month=(month < 10 ? "0" : "") + month;
       var day=current_date.getDay();
       day=(day < 10 ? "0" : "") + day;
       if(delimiter == null) delimiter="";
       return year + delimiter + month + delimiter + day;
   	}
