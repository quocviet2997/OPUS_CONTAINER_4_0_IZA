/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   :  COM_ENS_091.js
*@FileTitle  : VVD
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/

/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/* 공통전역변수 */
var ipageNo=1 ;
var sheetObjects=new Array();
var sheetCnt=0;
var selectVal;
var mainPage;
/* 업무별전역변수는 아래 부분에 추가 선언하여 사용한다. */
    /**
     * tab1의 onChange이벤트핸들러
     * IBSheetConfig.js에서 정의한 핸들러 함수를 구현한 것임
     */
    function tab1_OnChange(nItem){
        ChangeTab(document.all.tab1,nItem);
    }
    function ComKeyOnlyAlphaNumeric(sFlag)
    {
        try {
	        var keyValue=event.keyCode ? event.keyCode : event.which ? event.which : event.charCode;
            var bCanNum=false;
            //ComDebug('key  = '+keyValue);
            if (sFlag==undefined || sFlag==null || sFlag.constructor!=String) sFlag="";
            sFlag=sFlag.toLowerCase();
            if (sFlag.length >= 3){
                if (sFlag.substr(sFlag.length-3)=="num") bCanNum=true;
                if (sFlag.length > 5) sFlag=sFlag.substr(0,5);
            }
            if(keyValue >= 97 && keyValue <= 122){                  //소문자
                if (sFlag=="upper") event.keyCode=keyValue + 65 - 97;
                event.returnValue=true;
            } else if(keyValue >= 65 && keyValue <= 90){            //대문자
                if (sFlag=="lower") event.keyCode=keyValue + 97 - 65;
                event.returnValue=true;
            } else if(keyValue >= 48 && keyValue <= 57) {//숫자
                event.returnValue=true;
            } else {
                event.returnValue=false;
            }
            return true;
        } catch(err) { ComFuncErrMsg(err.message); }
    }    
    /**
     * IBTab Object 클릭할 때 해당 탭의 내용을 보여준다
     * 탭별로 그루핑된 DIV TAG의 ID는 모두 동일하게 "tabLayer"로 정한다.
     */
    function ChangeTab(tabObj,nItem){
          tabObj.SetBackColor("#FFFFFF");
        //no support[check again]CLT tabObj.TabBackColor(nItem)="146,174,230";
        var objs=document.all.item("tabLayer");
        objs[beforetab].style.display="none";
        objs[nItem].style.display="Inline";
        //--------------- 요기가 중요 --------------------------//
        //objs[beforetab].style.zIndex = objs[nItem].style.zIndex -1 ;
        //ksw수정 : zIndex가 -2이하로 가게되면 버튼클릭이 안됨
        objs[beforetab].style.zIndex=0;
        objs[nItem].style.zIndex=9;
        //------------------------------------------------------//
        beforetab=nItem;
    }
    /**
     * IBSheet Object를 배열로 등록
     * comSheetObject(id)에서 호출한다
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
     function loadPage(mainpage) {
    	 mainPage=mainpage;
        for(i=0;i<sheetObjects.length;i++){
        //khlee-시작 환경 설정 함수 이름 변경
            ComConfigSheet(sheetObjects[i]);
            initSheet(sheetObjects[i],i+1);
        //khlee-마지막 환경 설정 함수 추가
            ComEndConfigSheet(sheetObjects[i]);
        }
        // 조직도 세팅
        var sheetObjectDept=sheetObjects[0];
        var formObject=document.form;
        doActionIBSheetDept(sheetObjectDept, formObject, IBSEARCH);
        sheetObjectDept.ShowTreeLevel(2,1);
        // 초기화면에서 조회내용을 보기 위한 소스 추후 삭제
        var sheetObjectUser=sheetObjects[1];        
      	doActionIBSheetUser(sheetObjectUser,formObject,IBSEARCH);
      	initControl();
    }
     function initControl() {
     	var formObject=document.form;
         //Axon 이벤트 처리1. 이벤트catch(개발자변경)
         axon_event.addListenerFormat('keypress', 'keypressFormat', formObject);
         axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
     }
     //업무 자바스크립트 OnKeyPress 이벤트 처리
     function keypressFormat() {
     	obj=event.srcElement;
   	    if(obj.dataformat == null) return;
   	    window.defaultStatus=obj.dataformat;
   	    switch(ComGetEvent("name")) {
   	        case "ofc_cd":
   	        	ComKeyOnlyAlphabet('upper');
   	            break;
   	        case "user_cd":
   	        	ComKeyOnlyAlphabet('upper');
   	            break;
   	    }
     }
    /**
     * 시트 초기설정값, 헤더 정의
     * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
     * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
     */
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
        //sheetObj.UseUtf8 = true;
        switch(sheetNo) {
            case 1:     // Dept(조직도) 그리드 영역 초기화
                with(sheetObj){
                
              var HeadTitle="Office" ;

              SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:0 } );

              var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
              var headers = [ { Text:HeadTitle, Align:"Center" },
         ];
              InitHeaders(headers, info);

              var cols = [ {Type:"Text",      Hidden:0,  Width:10,  Align:"Left",    ColMerge:0,   SaveName:"ofc_cd", LevelSaveName:"sLevel",  TreeCol:1,     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   TreeCol:1 ,  LevelSaveName:"sLevel" } ];
               
              InitColumns(cols);

              SetEditable(1);
              SetCountPosition(0);
                    //InitTreeInfo(0, "sLevel", "#0000FFNAN");
              SetSheetHeight(370);
              //SetSheetWidth(450);
              //ShowTreeLevel(2);
              }


                break;
            case 2:     // User 그리드 영역 초기화
                with(sheetObj){
                
              var HeadTitle;
              if(mainPage == undefined){
              HeadTitle="||Seq|Office|User ID|Name|EMAIL" ;
              }else{
              HeadTitle="Seq|Office|User ID|Name|EMAIL" ;
              }
              var headCount=ComCountHeadTitle(HeadTitle);
              

              SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:0 } );

              var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
              var headers = [ { Text:HeadTitle, Align:"Center"} ];
              InitHeaders(headers, info);
              if(mainPage == undefined){      
            	  var cols = [ {Type:"Radio",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"radio",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                               {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"checkbox",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                               {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                               {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                               {Type:"Text",      Hidden:0,  Width:70,   Align:"Left",    ColMerge:0,   SaveName:"usr_id",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                               {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"usr_nm",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"usr_eml",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
                         
            	  
              }else{
            	  var cols = [ {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                               {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                               {Type:"Text",      Hidden:0,  Width:70,   Align:"Left",    ColMerge:0,   SaveName:"usr_id",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                               {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"usr_nm",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"usr_eml",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
                         
              }
              
              InitColumns(cols);

              SetEditable(1);
//              SetSheetHeight(400);
              SetSheetHeight(370);
//              SetSheetWidth(435);
                   
              }


                break;
        }
    }
    
    function sheetDept_OnSearchEnd() {
    	sheetDept.ShowTreeLevel(1,1);
    }
    /* 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
    document.onclick=processButtonClick;
    /* 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */    
    function processButtonClick(){
         /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
         var sheetObject=sheetObjects[1];
         /*******************************************************/
         var formObject=document.form;
        try {
            var srcName=ComGetEvent("name");
            /***********************************************************************************************************
                이미지 클릭 이벤트 처리, popup도 역시 이곳에서 함
                공통코드: CoFormControl.js 에 정의 되어있습니다. 이 변수를 통하여 ServiceCommand에서 분기 합니다.        
             **********************************************************************************************************/
            /*
               이곳에 document.form 혹은 document.form[0]식으로 코딩하시는 것을 삼가해 주십시오.
               메뉴가 적용되면 left_menu.jsp에 form 이 존재할 것이기 때문에 더이상 form[0]이 아닙니다.
               (순서상도 form[1]이 되겠죠?) 
               그리고 위에서 with(document.form)라고 했기때문에 (브라우저의 DOM 객체중 특정부분만 잡는다는 의미니깐!)
                document.form.f_cmd.value=INSERT;   이런식의 코딩은 지양해주십시오.
            */
            switch(srcName) {
                case "btn_Retrieve":                    
                    doActionIBSheetUser(sheetObject,formObject,IBSEARCH);
        	        break;
        	    case "btn_New":
    	            sheetObject.RemoveAll();
    	            formObject.reset();
        	        break;
                case "btn_Close":
  ComClosePopup(); 
        	        break;
        	    case "btn_OK":
                    comPopupOK();
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
                ComShowMessage(e.message);
            }
        }
    }
    /* Sheet관련 프로세스 처리 */
    function doActionIBSheetUser(sheetObj,formObj,sAction, a, PageNo) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
          case IBSEARCH:        //조회
                if(!validateForm(sheetObj,formObj,sAction)) {
                    return false;
                }
                formObj.f_cmd.value=SEARCH;                
                selectVal=FormQueryString(formObj)
                sheetObj.DoSearch("COM_ENS_091GS.do", selectVal );
           break;
           case IBSEARCHAPPEND:  // 페이징 조회           		
                formObj.f_cmd.value=SEARCHLIST;  
                sheetObj.DoSearch("COM_ENS_091GS.do", selectVal+"&"+ "iPage=" + PageNo,{Append:true} );
           break;
        }
    }
    /* 조직도 세팅 */
    function doActionIBSheetDept(sheetObj, formObj, sAction, a, PageNo) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
          case IBSEARCH:        //조회
                if(!validateForm(sheetObj,formObj,sAction)) {
                    return false;
                }
                formObj.f_cmd.value=SEARCH01;                
                selectVal=FormQueryString(formObj)
                sheetObj.DoSearch("COM_ENS_091GSDept.do", selectVal );
           break;
        }
    }
    
    
	function sheetUser_OnScrollNext(sheet,CondParam, PageNo, OnePageRows) {
        // TODO:sheet에 해당하는 객체와 폼 오브젝트를 doActionIBSheet 함수에 보내 주어야합니다.
       doActionIBSheetUser(sheetObjects[1], document.form, IBSEARCHAPPEND, true, PageNo + 1);
    }  
   /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj,formObj,sAction){
        //with(formObj){
            /*if(formObj.cnt_cd.value == "") {
              ComShowMessage("You must input Country code");
              setFocus(formObj.cnt_cd);
              return false;
            }
            if(formObj.cnt_cd.value.length < 2) {
              ComShowMessage("Country code must be 2 characters");
              setFocus(formObj.cnt_cd);
              return false;
            }
            if(formObj.cnt_cd.value == "US" && formObj.loc_state.value == "") {
              ComShowMessage("You must input State");
              setFocus(formObj.loc_state);
              return false;
            }*/     
        //}
        return true;
    }
    /**
     * 조회결과가 오류가 발생했을 때 공통처리하는 함수
     * IBSheetConfig.js에서 DataSheetObject.prototype.event_OnSearchEnd에서 정의
     */
    function sheet_OnSearchEnd(sheetObj,errMsg){
        if(errMsg!=null){
            ComShowMessage(errMsg);
        }
    }
    function sheetDept_OnClick(sheetObj, row, col, value) {
      var formObject=document.form;
formObject.ofc_cd.value=sheetObj.GetCellValue(sheetObj.GetSelectRow(), 'ofc_cd');
      doActionIBSheetUser(sheetObjects[1], document.form,IBSEARCH);
    }
