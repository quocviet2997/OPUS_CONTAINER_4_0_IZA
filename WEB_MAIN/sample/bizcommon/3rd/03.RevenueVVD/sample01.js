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
            	    var param = "vsl_cd=" + document.form.vsl_cd.value + "&rev_yrmon=" + document.form.rev_yrmon.value;
            	    ComOpenPopupWithTarget('/opuscntr/UI_COM_ENS_N12.do?classId=UI_COM_ENS_N12&' + param, 300, 420, 'vsl_cd:flag|rev_yrmon:rev_yrmon', '0,0,1', true);

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
