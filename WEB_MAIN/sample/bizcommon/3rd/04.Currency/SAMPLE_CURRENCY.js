/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SAMPLE_CURRENCY.js
*@FileTitle : CURRENCY
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.13
*@LastModifier : 김석준
*@LastVersion : 1.0
* 2009.07.13 김석준
* 1.0 Creation
=========================================================*/

document.onclick = processButtonClick;

function processButtonClick() {
    var srcName = window.event.srcElement.getAttribute("name");

	var sTargetObjList = "cnt_cd:cnt_cd|curr_cd:curr_cd|curr_desc:curr_desc";
	var sDisplay = document.form.dispaly.value + ",1";
	    
    try {
        switch(srcName) {
            case "orgchart_btn":         
            	var param = "cnt_cd=" + document.form.cnt_cd.value + "&curr_cd=" + document.form.curr_cd.value + "&curr_desc=" + document.form.curr_desc.value;
 
    		    var v_display = document.form.dispaly.value;
    		    var chkStr = v_display.substring(0,3)

    		    if(chkStr == "1,0") {
    		    	ComOpenPopupWithTarget('/opuscntr/COM_ENS_N13.do?classId=COM_ENS_N13&' + param, 700, 450, sTargetObjList, sDisplay, true);
    		    } else if(chkStr == "0,1") {
    		    	ComOpenPopupWithTarget('/opuscntr/COM_ENS_N13.do?classId=COM_ENS_N13&' + param, 700, 450, sTargetObjList, sDisplay, true);
    		    } else if(chkStr == "0,0") {
    		    	ComOpenPopup('/opuscntr/COM_ENS_N13.do?classId=COM_ENS_N13&' + param, 700, 450, 'getCOM_ENS_N13', sDisplay + ',1', true);
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
function getCOM_ENS_N13(rowArray) {

	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++){
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		document.all.cnt_cd.value += colArray[3] + gubun;
		document.all.curr_cd.value += colArray[2] + gubun;
		document.all.curr_desc.value += colArray[4] + gubun;
	}
}

