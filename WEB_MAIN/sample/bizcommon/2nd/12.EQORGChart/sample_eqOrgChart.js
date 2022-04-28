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
            case "eqorz_btn":         
            	with(document.theForm)
            	{    	    
            	    var v_display = display.value;
                    var targetObjList = "loc_cd:loc_cd|loc_dpth_cd:loc_type";
                    
      				var param = "?depth=3&chkDepth="+document.theForm.chkDepth.value+"&sccFlag="+document.theForm.sccFlag.value+"&classId=COM_ENS_0O1";
                    
      				ComOpenPopupWithTarget('/opuscntr/COM_ENS_0O1.do' + param, 400, 470, "loc_cd:loc_cd|loc_dpth_cd:loc_type", v_display, true);
    	            break;
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
