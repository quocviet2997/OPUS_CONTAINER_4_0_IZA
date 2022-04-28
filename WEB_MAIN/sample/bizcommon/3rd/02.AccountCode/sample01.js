/*********************************************************************************
'주  시 스 템 : 01.PackageTable
'서브  시스템 : 샘플
'프로그램 ID  : sample01.js
'프로그램 명  : javascript 샘플 구성
'프로그램개요 : javascript 샘플 구성 화면 이벤트들을 수행한다.
'작   성   자 : 정인선
'작   성   일 : 2009.07.10
==================================================================================
'수정자/수정일 : 
'수정사유/내역 : 
 *********************************************************************************/

document.onclick = processButtonClick;

function processButtonClick() {
    var srcName = window.event.srcElement.getAttribute("name");
    try {
        switch(srcName) {
            case "cnt_btn":         
            	    var param = "acct_cd=" + document.form.acct_cd.value + "&acct_eng_nm=" + document.form.acct_eng_nm.value;
            	    /*
            	    var v_rgn_cd = rgn_cd.value;
            	    var classId = "COM_ENS_0J1";
        		    var param = '?cnt_cd='+v_cnt_cd+'&rgn_cd='+v_rgn_cd+'&classId='+classId;
        		    */
        		    var v_display = document.form.dispaly.value;
        		    var chkStr = v_display.substring(0,3)
        		    if(chkStr == "1,0") {
        		    	ComOpenPopupWithTarget('/opuscntr/COM_ENS_N11.do?classId=COM_ENS_N11&' + param, 500, 430, 'acct_cd:acct_cd|acct_eng_nm:acct_eng_nm', v_display + ',1', true);
        		    } else if(chkStr == "0,1") {
        		    	ComOpenPopupWithTarget('/opuscntr/COM_ENS_N11.do?classId=COM_ENS_N11&' + param, 500, 430, 'acct_cd:acct_cd|acct_eng_nm:acct_eng_nm', v_display + ',1', true);
        		    } else if(chkStr == "0,0") {
						ComOpenPopupWithTarget('/opuscntr/COM_ENS_N11.do?classId=COM_ENS_N11&' + param, 500, 430, 'acct_cd:acct_cd|acct_eng_nm:acct_eng_nm', v_display + ',1', true);
        		    } else if(chkStr == "1,1"){
        		    	ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
        			    return;
        		    } else {
        		    	ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
        			    return;
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
 * 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_N11(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		document.all.acct_cd.value += colArray[2] + gubun;
    	document.all.acct_eng_nm.value += colArray[3] + gubun;
	}
}
