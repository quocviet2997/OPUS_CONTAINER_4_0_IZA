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
        	    var param = "pck_cd=" + document.form.pck_cd.value + "&pck_nm=" + document.form.pck_nm.value;
        	    var v_display = document.form.dispaly.value;
        		var chkStr = v_display.substring(0,3)
        		  
    		    if(chkStr == "1,0") {
    		    	ComOpenPopupWithTarget('/opuscntr/UI_BKG_0696.do?classId=UI_BKG_0696&' + param, 400, 430, 'pck_cd:pck_cd|pck_nm:pck_nm', v_display + ',1', true);
    		    } else if(chkStr == "0,1") {
    		    	ComOpenPopupWithTarget('/opuscntr/UI_BKG_0696.do?classId=UI_BKG_0696&' + param, 400, 430, 'pck_cd:pck_cd|pck_nm:pck_nm', v_display + ',1', true);
    		    } else if(chkStr == "0,0") {
    		    	ComOpenPopupWithTarget('/opuscntr/UI_BKG_0696.do?classId=UI_BKG_0696&' + param, 400, 430, 'pck_cd:pck_cd|pck_nm:pck_nm', v_display + ',1', true);
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
 * 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_0J1_1(rowArray) {
	//alertComPopupData(rowArray);
	
	var colArray = rowArray[0];	
	document.all.cnt_cd.value = colArray[5];
	document.all.rgn_cd.value = colArray[3];
	document.all.rgn_nm.value = colArray[4];
}


/**
 * 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_0J1_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		document.all.cnt_cd.value += colArray[5] + gubun;
    	document.all.rgn_cd.value += colArray[3] + gubun;
    	document.all.rgn_nm.value += colArray[4] + gubun;
	}
}


/**
 * 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_0J1_3(rowArray) {
	//alertComPopupData(rowArray);

	var colArray = rowArray[0];
	document.all.cnt_cd.value = colArray[5];
	document.all.rgn_cd.value = colArray[3];
	document.all.rgn_nm.value = colArray[4];
}
