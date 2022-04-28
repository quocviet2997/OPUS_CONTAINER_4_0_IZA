/*********************************************************************************
'주  시 스 템 : 11.India Tax 
'서브  시스템 : 샘플
'프로그램 ID  : sample_indiatax.js
'프로그램 명  : javascript 샘플 구성
'프로그램개요 : javascript 샘플 구성 화면 이벤트들을 수행한다.
'작   성   자 : 김석준
'작   성   일 : 2009.07.10
==================================================================================
'수정자/수정일 : 
'수정사유/내역 : 
 *********************************************************************************/

document.onclick = processButtonClick;

function processButtonClick() {
    var srcName = window.event.srcElement.getAttribute("name");
    var sTargetObjList = "sgst_amt:sgst_amt2|cgst_amt:cgst_amt2|igst_amt:igst_amt2|cess_amt:cess_amt2|vat_amt:vat_amt2|whld2_amt:whld2_amt2|gsttds_amt:gsttds_amt2|whld_amt:whld_amt2";
    var sDisplay = document.form.dispaly.value + ",1";
    var formObj = document.form;
    try {
        switch(srcName) {
            case "cnt_btn":         
        	    var param = "ofc_cd=" 				+ ComGetObjValue(formObj.ofc_cd);
        	        param += "&vndr_seq=" 			+ ComGetObjValue(formObj.vndr_seq);
        	        param += "&view_flg=" 			+ ComGetObjValue(formObj.view_flg);
        	        
        	        param += "&sgst_amt=" 	+ ComGetObjValue(formObj.sgst_amt);
        	        param += "&cgst_amt=" 	+ ComGetObjValue(formObj.cgst_amt);
        	        param += "&igst_amt=" 	+ ComGetObjValue(formObj.igst_amt);
        	        param += "&cess_amt=" 	+ ComGetObjValue(formObj.cess_amt);
        	        param += "&vat_amt=" 		+ ComGetObjValue(formObj.vat_amt);
        	        
        	        param += "&whld2_amt=" 	+ ComGetObjValue(formObj.whld2_amt);
        	        param += "&gsttds_amt="+ ComGetObjValue(formObj.gsttds_amt);
        	        param += "&whld_amt=" 	+ ComGetObjValue(formObj.whld_amt);
        	        
        	        //param += "&func=getCOM_ENS_T01";
        	        
        	    
        	    
        	    var v_display = document.form.dispaly.value;
        		var chkStr = v_display.substring(0,3);

    		    if(chkStr == "1,0") {
    		    	ComOpenPopupWithTarget('/opuscntr/COM_ENS_T01.do?classId=COM_ENS_T01&' + param, 550, 500, sTargetObjList, sDisplay, false);
    		    } else if(chkStr == "0,1") {
    		    	ComOpenPopupWithTarget('/opuscntr/COM_ENS_T01.do?classId=COM_ENS_T01&' + param, 550, 500, sTargetObjList, sDisplay, false);
    		    } else if(chkStr == "0,0") {
    		    	ComOpenPopup('/opuscntr/COM_ENS_T01.do?classId=COM_ENS_T01&' + param, 550, 500, 'getCOM_ENS_T01', sDisplay, false);
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

function getCOM_ENS_T01(rowArray) {
	//alertComPopupData(rowArray);
	var formObj = document.form;
	var obj = new Object();
	obj.sgst_amt = rowArray[0][0];
	obj.cgst_amt = rowArray[0][1];
	obj.igst_amt = rowArray[0][2];
	obj.cess_amt = rowArray[0][3];
	obj.vat_amt = rowArray[0][4];
	obj.whld2_amt = rowArray[0][5];
	obj.gsttds_amt = rowArray[0][6];
	obj.whld_amt = rowArray[0][7];
	obj.ida_gst_no = rowArray[0][8];
	obj.vndr_gst_no = rowArray[0][9];
	obj.svc_acctg_cd = rowArray[0][10];
	
	var tmpVal = "";
		tmpVal = " sgst_amt (SGST) ["+obj.sgst_amt+"]";
		tmpVal += "\n cgst_amt (CGST) ["+obj.cgst_amt+"]"; 
		tmpVal += "\n igst_amt (IGST) ["+obj.igst_amt+"]"; 
		tmpVal += "\n cess_amt (CESS) ["+obj.cess_amt+"]"; 
		tmpVal += "\n vat_amt (V.A.T Amount) ["+obj.vat_amt+"]"; 
		tmpVal += "\n whld2_amt (W.H.T) ["+obj.whld2_amt+"]"; 
		tmpVal += "\n gsttds_amt (GST TDS) ["+obj.gsttds_amt+"]"; 
		tmpVal += "\n whld_amt (W.H.T Amount) ["+obj.whld_amt+"]";
		tmpVal += "\n ida_gst_no (NYK GST) ["+obj.ida_gst_no+"]";
		tmpVal += "\n vndr_gst_no (Vendor GST) ["+obj.vndr_gst_no+"]";
		tmpVal += "\n svc_acctg_cd (Vendor SAC) ["+obj.svc_acctg_cd+"]";
	
	alert(tmpVal);
	
	
	ComSetObjValue(formObj.sgst_amt2, ComGetMaskedValue(obj.sgst_amt, "float"));
	ComSetObjValue(formObj.cgst_amt2, ComGetMaskedValue(obj.cgst_amt, "float"));
	ComSetObjValue(formObj.igst_amt2, ComGetMaskedValue(obj.igst_amt, "float"));
	ComSetObjValue(formObj.cess_amt2, ComGetMaskedValue(obj.cess_amt, "float"));
	ComSetObjValue(formObj.vat_amt2, ComGetMaskedValue(obj.vat_amt, "float"));	
	ComSetObjValue(formObj.whld2_amt2, ComGetMaskedValue(obj.whld2_amt, "float"));
	ComSetObjValue(formObj.gsttds_amt2, ComGetMaskedValue(obj.gsttds_amt, "float"));
	ComSetObjValue(formObj.whld_amt2, ComGetMaskedValue(obj.whld_amt, "float"));
	

	ComSetObjValue(formObj.ida_gst_no2, obj.ida_gst_no);
	ComSetObjValue(formObj.vndr_gst_no2, obj.vndr_gst_no);
	ComSetObjValue(formObj.svc_acctg_cd2, obj.svc_acctg_cd);
}

/**
 * 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_T01Obj(obj) {
	//alertComPopupData(rowArray);
	var formObj = document.form;
	var tmpVal = "";
	if (typeof(obj)=="object"){
		tmpVal = " sgst_amt ["+obj.sgst_amt+"]";
		tmpVal += "\n cgst_amt ["+obj.cgst_amt+"]"; 
		tmpVal += "\n igst_amt ["+obj.igst_amt+"]"; 
		tmpVal += "\n cess_amt ["+obj.cess_amt+"]"; 
		tmpVal += "\n vat_amt ["+obj.vat_amt+"]"; 
		tmpVal += "\n whld2_amt ["+obj.whld2_amt+"]"; 
		tmpVal += "\n gsttds_amt ["+obj.gsttds_amt+"]"; 
		tmpVal += "\n whld_amt ["+obj.whld_amt+"]";
	}else {
		tmpVal = obj;
	}
	
	
	alert(tmpVal);
	
	
	ComSetObjValue(formObj.sgst_amt2, ComGetMaskedValue(obj.sgst_amt, "float"));
	ComSetObjValue(formObj.cgst_amt2, ComGetMaskedValue(obj.cgst_amt, "float"));
	ComSetObjValue(formObj.igst_amt2, ComGetMaskedValue(obj.igst_amt, "float"));
	ComSetObjValue(formObj.cess_amt2, ComGetMaskedValue(obj.cess_amt, "float"));
	ComSetObjValue(formObj.vat_amt2, ComGetMaskedValue(obj.vat_amt, "float"));	
	ComSetObjValue(formObj.whld2_amt2, ComGetMaskedValue(obj.whld2_amt, "float"));
	ComSetObjValue(formObj.gsttds_amt2, ComGetMaskedValue(obj.gsttds_amt, "float"));
	ComSetObjValue(formObj.whld_amt2, ComGetMaskedValue(obj.whld_amt, "float"));
}


