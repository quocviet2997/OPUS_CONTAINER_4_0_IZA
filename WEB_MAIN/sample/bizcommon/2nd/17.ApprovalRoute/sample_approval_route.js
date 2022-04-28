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
            case "apro_route_btn":         
            	with(document.theForm)
            	{    	
            	    var v_apro_step = encodeURIComponent(apro_step.value);
            	    var param = "?mode=set&apro_step="+v_apro_step+"&target_obj_nm=apro_step&classId=COM_ENS_0T1";
      				
            	    ComOpenPopup('/opuscntr/COM_ENS_0T1.do' + param, 835, 550, '', 'none', true);
    	            break;
            	}
                break;
                
			case "apro_route_btn_modify":         
            	with(document.theForm)
            	{    	
            	    var v_apro_step = encodeURIComponent(apro_step_modify.value);
            	    var param = "?mode=set&apro_step="+v_apro_step+"&target_obj_nm=apro_step&classId=COM_ENS_0T2";
      				
      				ComOpenPopup('/opuscntr/COM_ENS_0T2.do' + param, 835, 550, '', 'none', true);
    	            break;
            	}
                break;
                
            case "apro_route_default_btn":         
            	with(document.theForm)
            	{
            	    var v_ofc_cd = ofc_cd.value;
            	    var v_sub_sys_cd = sub_sys_cd.value;
                    var param = "?mode=save&ofc_cd="+v_ofc_cd+"&sub_sys_cd="+v_sub_sys_cd+"&classId=COM_ENS_0T1"+"&target_obj_nm=result_obj";
      				
      				ComOpenPopup('/opuscntr/COM_ENS_0T1.do' + param, 835, 550, '', 'none', true);
    	            break;
            	}
                break;
               
            case "apro_route_csr_btn":
            	with(document.theForm){
            		var v_csr_no = csr_no.value;
            		var param = "?mode=csr&csr_no="+v_csr_no+"&classId=COM_ENS_0T2";
            		
      				ComOpenPopup('/opuscntr/COM_ENS_0T2.do' + param, 835, 550, '', 'none', true);
    	            break;
            	}
                
            case "apro_request_btn":    
                //document.all.apro_frame.src = "approval_request.jsp";
                document.location = "approval_request.jsp";
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