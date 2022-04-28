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

//	var sTargetObjList = "rat_ut_cd:rat_ut_cd";
	var sTargetObjList = "rat_ut_cd:rat_ut_cd|rat_ut_desc:rat_ut_desc|rat_ut_grp_cd:rat_ut_grp_cd|cntr_sz_cd:cntr_sz_cd|cr_dt:cr_dt|up_dt:up_dt|cxl_ind:cxl_ind";
	var sDisplay = document.form.dispaly.value + ",1";
	
	var ownCntrFlg = "";
    
    try {
        switch(srcName) {
            case "cnt_btn":         
            	var param = "rat_ut_cd=" + document.form.rat_ut_cd.value + "&rat_ut_grp_cd=" + document.form.rat_ut_grp_cd.value + "&cxl_ind=" + document.form.cxl_ind.value;
 
    		    var v_display = document.form.dispaly.value;
    		    var chkStr = v_display.substring(0,3);
    		    
    		    if(chkStr == "1,0") {
    		    	ComOpenPopupWithTarget('/opuscntr/UI_PRI_4002.do?classId=UI_PRI_4002&' + param, 900, 300, sTargetObjList, sDisplay, true);
    		    } else if(chkStr == "0,1") {
    		    	ComOpenPopupWithTarget('/opuscntr/UI_PRI_4002.do?classId=UI_PRI_4002&' + param, 900, 300, sTargetObjList, sDisplay, true);
    		    } else if(chkStr == "0,0") {
    		    	ComOpenPopupWithTarget('/opuscntr/UI_PRI_4002.do?classId=UI_PRI_4002&' + param, 900, 300, sTargetObjList, sDisplay, true);
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


