/*********************************************************************************
'주  시 스 템 : 
'서브  시스템 : 샘플
'프로그램 ID  : sample_vvdExRate.js
'프로그램 명  : javascript 샘플 구성
'프로그램개요 : javascript 샘플 구성 화면 이벤트들을 수행한다.
'작   성   자 : 노형춘
'작   성   일 : 2006.11.08
==================================================================================
'수정자/수정일 : 
'수정사유/내역 : 
 *********************************************************************************/

document.onclick = processButtonClick;

function processButtonClick() {
    var srcName = window.event.srcElement.getAttribute("name");
    
    try {
        switch(srcName) {
            case "orgchart_btn":         
            	with(document.theForm)
            	{    	    
        		    var v_display = dispaly.value;
        		    
        		    var chkStr = v_display.substring(0,3)
        		  
        		    if(chkStr == "1,0") {
        		    	ComOpenPopup('/opuscntr/orgchart.screen', 800, 450, 'getPersonData1', v_display, true);
        		    } else if(chkStr == "0,1") {
        		    	ComOpenPopup('/opuscntr/orgchart.screen', 800, 450, 'getPersonData2', v_display, true);
        		    } else if(chkStr == "0,0") {
        		    	ComOpenPopup('/opuscntr/orgchart.screen', 800, 450, 'getPersonData1', v_display, true);
        		    } else if(chkStr == "1,1"){
        		    	ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
        			    return;
        		    } else {
        		    	ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
        			    return;
        		    }
            	}
                break;
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

/**
 * 팝업에서 Radio로 단일 선택을 한경우..
 */
function getPersonData1(rowArray) {
	//alertComPopupData(rowArray);
	
	var colArray = rowArray[0];	
	document.all.TEAMNM.value = colArray[2];
	document.all.NAME.value = colArray[3];
	document.all.MAIL.value = colArray[4];
	document.all.PHONE.value = colArray[5];
	document.all.CN.value = colArray[6];
	document.all.LNAME.value = colArray[7];
	document.all.POS.value = colArray[8];
	document.all.JOB.value = colArray[9];
	document.all.JCODE.value = colArray[10];
	document.all.TEAM.value = colArray[11];
	document.all.INITNM.value = colArray[12];
	document.all.BUJAE.value = colArray[13];
	document.all.SIP.value = colArray[14];
}


/**
 * 팝업에서 Check로 멀티 선택을 한경우..
 */
function getPersonData2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		document.all.TEAMNM.value += colArray[2] + gubun;
		document.all.NAME.value += colArray[3] + gubun;
		document.all.MAIL.value += colArray[4] + gubun;
		document.all.PHONE.value += colArray[5] + gubun;
		document.all.CN.value += colArray[6] + gubun;
		document.all.LNAME.value += colArray[7] + gubun;
		document.all.POS.value += colArray[8] + gubun;
		document.all.JOB.value += colArray[9] + gubun;
		document.all.JCODE.value += colArray[10] + gubun;
		document.all.TEAM.value += colArray[11] + gubun;
		document.all.INITNM.value += colArray[12] + gubun;
		document.all.BUJAE.value += colArray[13] + gubun;
		document.all.SIP.value += colArray[14] + gubun;
	}
}

