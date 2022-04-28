/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : locationCodeInquiry.js
*@FileTitle  : Location조회(공통 Popup)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/18
=========================================================*/

	// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의
    document.onclick=processButtonClick;

	// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러
	function processButtonClick() {
		var formObject=document.form;

		try {
			var srcName=ComGetEvent("name");

			switch(srcName) {
			case "Colse":
				ComClosePopup();
				break;
			} // end switch
		} catch (e) {
			if (e == "[object Error]") {
				ComShowMessage(OBJECT_ERROR);
			} else {
				ComShowMessage(e.message);
			}
		}
	}
