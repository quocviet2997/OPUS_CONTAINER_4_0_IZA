/*=========================================================
*Copyright(c) 2016 CyberLogitec. All Rights Reserved.
*@FileName   : ADM_SYS_0015.js
*@FileTitle  : Notice Mail Sender PAGE
*@author     : JeongHoon,Kim
*@version    : 1.0
*@since      : 2016/03/08
=========================================================*/
var sheetObjects=new Array();
var sheetCnt=0;
/* 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick=processButtonClick;
/* 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
    function processButtonClick(){
         /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
         /*******************************************************/
         var formObject=document.form1;
    	try {
    		var srcName=ComGetEvent("name");
            switch(srcName) {
        	    case "btn_Send":
    	            doSave();
        	        break;
            } // end switch
    	}catch(e) {
    		if( e == "[object Error]") {
    			ComShowMessage(ComGetMsg('COM12111'));
    		} else {
    			ComShowMessage(e.message);
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
        initControl();		
    }
    
    function initControl() {
      	var formObject=document.form1;
          //Axon 이벤트 처리1. 이벤트catch(개발자변경)
          axon_event.addListenerFormat('keypress', 'keypressFormat', formObject);
          axon_event.addListener ('keydown', 'ComKeyEnter', 'form1');
    }
    
    function doSave(){
    	var xhttp = new XMLHttpRequest();
    	xhttp.onreadystatechange = function(){
		    if (xhttp.readyState == 4 && xhttp.status == 200){
		   		alert("The mail has been sent successfully.");
		   		window.location = "ADM_SYS_0016.do";
		    }else if(xhttp.readyState == 4 && xhttp.status != 200){
		    	alert("The mail failed to send. Detail Message ["+xhttp.responseText+"]");
		    }
    	}
    	xhttp.open("POST", "ADM_SYS_0015.do", true);
    	xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
		var emailTitle = document.getElementsByName("emailTitle")[0].value;
		if(isGoodEmailTitle(emailTitle)){
			if(ComShowConfirm("Do you want to send a mail to all users?")){
				var emailContents = CKEDITOR.instances["emailContents"].getData();
				var encodedEmailTitle = encodeURIComponent(emailTitle);
				var encodedEmailContents = encodeURIComponent(emailContents);
				xhttp.send("f_cmd=11&emailTitle="+encodedEmailTitle+"&emailContents="+encodedEmailContents);
		   	}
		}else{
			  alert("Please fill out the mail title.");
	   	}
    }
    
    function isGoodEmailTitle(emailTitle){
    	if(emailTitle != null && emailTitle != "" && emailTitle != " "){
    		return true;
    	}else{
    		return false;
    	}
    }
    
