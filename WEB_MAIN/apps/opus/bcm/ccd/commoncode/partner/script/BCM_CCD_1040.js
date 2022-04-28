/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_1040.js
*@FileTitle  : Vendor Code Duplicate Check Inquiry
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/04
=========================================================*/
   	/* 개발자 작업	*/
	var sheetObjects=new Array();
	var sheetCnt=0;
	var selectVal=0;
	// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
	document.onclick=processButtonClick;  
	/**
     * 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 <br>
     */
	function processButtonClick(){
        /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
        var sheetObject1=sheetObjects[0];   
        /*******************************************************/
        var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch(srcName) {
        	case "btn_Close":
        		ComClosePopup(); 
        		break;
        	case "btn_Go":
        		comPopupGo();
        		break;
        	case "btn_Check":
        		 doActionIBSheet(sheetObject1,formObject,IBSEARCH);
        		break;	
//        	case "btn2_Down_Excel":
//    	    	sheetObject1.Down2Excel(false,false,true,false,"","",false,false,"",false,"0|1");
//    	        break;
			} // end switch
		} catch (e) {
			if (e == "[object Error]") {
				ComShowMessage(OBJECT_ERROR);
			} else {
				ComShowMessage(e.message);
			}
		}
	}
	/**
	* IBSheet Object를 배열로 등록 <br>
	* 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다 <br>
	* 배열은 소스 상단에 정의 <br>
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
        //페이지 로드시 선처리 기능을 호출한다.
        for (i=0; i < sheetObjects.length; i++) {
        	ComConfigSheet(sheetObjects[i]);
            initSheet(sheetObjects[i],i+1);
            ComEndConfigSheet(sheetObjects[i]);	
            //로드 시 조회
            initControl()
            searchSimilarName();
            if(ComGetObjValue(document.form.rqst_no) == '') {
            	ComSetDisplay('btn_Go', true);
            }
		}
	}
     function initControl() {
        //Axon 이벤트 처리1. 이벤트catch(개발자변경)
  		axon_event.addListenerForm('beforedeactivate', 'obj_deactivate', document.form);   
		axon_event.addListenerFormat('keypress', 'obj_keypress', document.form	); 	//- form 전체 컨트롤 중 dataformat 속성이 있는 모든 컨트롤의 onkeypress 이벤트에 코드 처리
		axon_event.addListenerForm('change', 'obj_change', form);
     }    
     /**
      * HTML Object의 OnKeyPress이벤트 처리
      */
     function obj_keypress(event) {
       	obj=event.srcElement;
       	keyValidation(obj);
      }
    /**
     * 시트 초기설정값, 헤더 정의
     * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
     * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
     */
	function initSheet(sheetObj,sheetNo) {
		var cnt=0;
		var sheetID=sheetObj.id;
     	switch(sheetID) {
     	case "sheet1":
//        switch(sheetNo) {
//        case 1:      //IBSheet1 init
            with (sheetObj) {
            var HeadTitle="Seq.|Code|Name|Location|Control Office";
            var headCount=ComCountHeadTitle(HeadTitle);
            SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
            var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
            var headers = [ { Text:HeadTitle, Align:"Center"} ];
            InitHeaders(headers, info);
            var cols = [ {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"no",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                   {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"code",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                   {Type:"Text",      Hidden:0,  Width:350,  Align:"Left",    ColMerge:0,   SaveName:"name",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                   {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"location",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                   {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"office",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 } ];
            InitColumns(cols);
            SetEditable(1);
	        SetCountFormat("[SELECTDATAROW / TOTALROWS]");
	        SetSheetHeight(215);
             }
          	break;
     	}
	}
  /**
   * Sheet관련 프로세스 처리 <br>
   */
 	function doActionIBSheet(sheetObj, formObj, sAction) {
 		sheetObj.ShowDebugMsg(false);
	 		switch (sAction) {																		
	 			case IBSEARCH: // 조회
	 				if (sheetObj.id == "sheet1") {
	 				formObj.f_cmd.value=SEARCH;
	 				selectVal=FormQueryString(formObj)
	 				sheetObj.DoSearch("BCM_CCD_1040GS.do", selectVal );
	 				}
	 				break;
	 		}
	}	
 	  /**
 	   * 조회 기능 처리 <br>
 	   */
 	function searchSimilarName() {
 		var formObject=document.form;
 		var word1="";
 		var word2="";
 	//Vendor Name의 첫 두 단어를 추출
 	var vndName=formObject.name.value;
	var space=vndName.indexOf(" "); // 첫 공백의 위치
	if (space < 0) { //공백이 없을 경우에는 Vendor명 그대로 조회조건1에 저장.
		word1=vndName;
	} else { //공백이 있을 경우 
		word1=vndName.substring(0,space); // 조회조건1 
	}
	vndName=vndName.substring(space+1,vndName.length); // 조회조건1을 제외한 나머지 텍스트
	space=vndName.indexOf(" ");
	if (space < 0) { //공백이 없을 경우에는 나머지 텍스트 그대로 조회조건2에 저장.
		word2=vndName;
	} else {
		word2=vndName.substring(0,space); // 조회조건2
	}
	formObject.word1.value=word1;
	formObject.word2.value=word2;
	doActionIBSheet(sheetObjects[0],formObject,IBSEARCH);
 	}
//    /**
//     * 대문자로 바꾼는 함수.
//     */
//    function SetUpper(obj) {
//    	return obj.value = obj.value.toUpperCase()
//    }
    /**
     * 팝업창에서 Go 버튼 눌렀을 경우 데이터 Save.
     */
    function comPopupGo() {
    	if (!ComShowCodeConfirm("CCD00030")) {
		    return;
		}
//    	opener = window.dialogArguments;
//    	if (!opener) 
//    		opener=window.opener;  
//		if(!opener)
//			opener=parent;	
//    	opener.document.form.saveflag.value="Y";
    	ComPopUpReturnValue("Y");
    	ComClosePopup(); 
     }
    /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리 <br>
     */
 	function validateForm(sheetObj, formObj, sAction) {
 		with(formObj){
    	 }
 		return true;
 	}
//   function getCOM_ENS_0M1_vndr_cnt_cd(rowArray) {    	
//   	var formObj = document.form;
//   	var colArray = rowArray[0];	
//   	formObj.vndr_cnt_cd.value = colArray[1];
//   	//자동조회를 구현해야하는 건지 확인 필요.
//   	//doActionIBSheet(sheetObjects[0], formObj, SEARCH01);
//   }	
/**
 * 필드 데이타가 CHANGE될 경우 이벤트
 */
function obj_change(){
	  var formObject=document.form;
    /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한다 *****/
    /*******************************************************/
		try {
		var srcName=ComGetEvent("name");
        switch(srcName) {                
               	case "vndr_cnt_cd":
              		if(formObject.vndr_cnt_cd.value.length>0){	
              			formObject.f_cmd.value=SEARCH01;
    		 			var sParam="f_cmd="       +formObject.f_cmd.value
    		 						+ "&vndrCntCd=" +formObject.vndr_cnt_cd.value;
    		 			var sXml=sheetObjects[0].GetSearchData("BCM_CCD_1040GS.do", sParam);
    		 			var check_cd=ComGetEtcData(sXml, "result");
        		        if(check_cd == ""){
        		        	formObject.vndr_cnt_cd.value="";
        		        	ComShowCodeMessage("COM130402", "Country"); 		
        		        	ComSetFocus(document.form.vndr_cnt_cd);		
        		        } 
              		}
              		break;
        } // end switch
	}catch(e) {
		if( e == "[object Error]") {
			ComShowMessage(OBJECT_ERROR);
		} else {
			ComShowMessage(e.message);
		}
	}
}
	/* 개발자 작업  끝 */
