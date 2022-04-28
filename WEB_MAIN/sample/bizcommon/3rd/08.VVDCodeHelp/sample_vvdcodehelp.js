/*********************************************************************************
'주  시 스 템 : 10.Service Provider Inquiry 
'서브  시스템 : 샘플
'프로그램 ID  : sample_portcodehelp.js
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
        	    var v_display = document.form.dispaly.value;
        		var chkStr = v_display.substring(0,3)

    		    if(chkStr == "1,0") {
    		    	ComOpenPopupWithTarget('/opuscntr/VOP_VSK_0230.do?classId=VOP_VSK_0230', 305, 400, 'vsl_cd:vsl_cd|skd_voy_no:skd_voy_no|skd_dir_cd:skd_dir_cd|vps_eta_dt:vps_eta_dt', v_display + ',1', true);
    		    } else if(chkStr == "0,1") {
    		    	ComOpenPopup('/opuscntr/VOP_VSK_0230.do?classId=VOP_VSK_0230', 305, 400, 'getVOP_VSK_0230', v_display + ',1', true);
    		    } else if(chkStr == "0,0") {
    		    	ComOpenPopupWithTarget('/opuscntr/VOP_VSK_0230.do?classId=VOP_VSK_0230', 305, 400, 'vsl_cd:vsl_cd|skd_voy_no:skd_voy_no|skd_dir_cd:skd_dir_cd|vps_eta_dt:vps_eta_dt', v_display + ',1', true);
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
function getVOP_VSK_0230(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		document.all.p_vndr_seq.value += colArray[2] + gubun;
    	document.all.ofc_cd.value += colArray[3] + gubun;
    	document.all.vndr_lgl_eng_nm.value += colArray[4] + gubun;
    	document.all.eng_addr.value += colArray[5] + gubun;
	}
}
