/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SAMPLE_ACCOUNTCODE.js
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
	var sUrl    = '/opuscntr/COM_ENS_N11.do';
	var iWidth  = 500;
	var iHeight = 380;
	var sTargetObjList = "acct_cd:acct_cd|acct_eng_nm:acct_eng_nm";
	var sDisplay = "0,0,1,1,0,0";
	
	var ownCntrFlg = "";
	var param = "?acct_cd=&acct_eng_nm=";
    
    try {
        switch(srcName) {
            case "orgchart_btn":         
            	with(document.form)
            	{    
            		ComOpenPopupWithTarget('/opuscntr/COM_ENS_N11.do'+param, 500, 420, 'acct_cd:acct_cd|acct_eng_nm:acct_eng_nm', '0,0,1,1,0,0', true);
//            		ComOpenPopupWithTarget(sUrl+param, iWidth, iHeight, sTargetObjList, sDisplay, true);
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

