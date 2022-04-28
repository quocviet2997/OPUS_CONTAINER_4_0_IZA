/*********************************************************************************
'주  시 스 템 : 
'서브  시스템 : 샘플
'프로그램 ID  : CodePopupSample.js
'프로그램 명  : javascript 샘플 구성
'프로그램개요 : javascript 샘플 구성 화면 이벤트들을 수행한다.
'작   성   자 : 장회수/2006.09.03
'작   성   일 : 
==================================================================================
'수정자/수정일 : 
'수정사유/내역 : 
 *********************************************************************************/

document.onclick = processButtonClick;

function processButtonClick()
{
	
    try {
    	var srcName = window.event.srcElement.getAttribute("name");
    	
    	with(document.theForm)
    	{
    		switch(srcName) {
    			case "sp1_btn":
    			    
    				break;
    			case "sp2_btn":

    			    	    /** 
                      * 팝업 띄우는 샘플(폼의 element로 리턴하는 경우 예제)
                      * 함수위치 CoPop.js
                      * IBSheet로 리턴하는 경우 예제는 sheet1_OnPopupClick함수를 참조하세요
                      * @param url        URL 주소
                      * @param option     팝업 옵션
                      * @param form name  팝업에서 반환받을 값이 입력될 폼 이름 (아래 예제에서는 'form1')
                      * @param args       받환받을 폼의 element명 리스트를 파라메터로 보냄(아래 예제에서는 'popup1_hidden','popup1')
                      */

               		  rtnObjPopup('com.clt.syscommon.codepop.CodePopupJSP.do', //url
               		 			'width=650,height=450,left=400,top=100,menubar=0,status=0,scrollbars=0,resizable=0', // 팝업창 사이즈에 따른 조정
               		 			'theForm', // form 명칭 
               		 			'group_cd=' + sp2_txt1.value, // inputparameter (명칭은 group_cd로 필수 ) 
               		 			'sp2_txt1','sp2_txt2', 'sp2_txt3','sp2_txt4'); // 값을 입력 받을 화면의 컨트롤 명 (즉, return value for setting control ) 
        			break;
    		}
    	}
    }
    catch(e) {
    	if( e = "[object Error]") {
    		ComShowMessage(OBJECT_ERROR);
    	} else {
    	   ComShowMessage(e);
    	}
    }
}
