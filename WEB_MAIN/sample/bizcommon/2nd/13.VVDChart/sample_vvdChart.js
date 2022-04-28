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
            case "vvdchart_btn":         
            	with(document.theForm)
            	{    	    
            	    var v_scnr_id = scnr_id.value;
            	    var v_display = display.value;
                    var targetObjList = "trade:trade|lane:lane|vvd:vvd";
                    // scnr_id : 시나리오 ID, depth : 3(Trade), 2(Lane), 3(VVD)
      				var param = "?classId=COM_ENS_0P1&scnr_id="+v_scnr_id+"&depth=3&chkDepth=3";
      				ComOpenPopupWithTarget('/opuscntr/COM_ENS_0P1.do' + param, 400, 470, "trade:trade|lane:lane|vvd:vvd", v_display, true);
      				//ComOpenPopup('/opuscntr/COM_ENS_0P1.do' + param, 400, 480, 'getCOM_ENS_0G1_2', v_display, true);
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
function getCOM_ENS_0G1_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		
		colArray = rowArray[i];
		document.all.trade.value += colArray[3];
		document.all.lane.value += colArray[4];
		document.all.vvd.value += colArray[4];
	}
}