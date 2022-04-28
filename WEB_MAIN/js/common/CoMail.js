/**
 * ===============================================================================
 * 프로그램 명 : 메일 처리 관련 공통 함수 정의 Script 프로그램개요 : 메일 전송 함수 정의 작 성 자 : 김정훈 작 성 일 :
 * 2009-04
 * ===============================================================================
 * 수정자/수정일 : 수정사유/내역 :
 * ===============================================================================
 */

function CoMail() {
	this.ComSendMail = ComSendMail;
	this.ComSendGroupwareMail = ComSendGroupwareMail;
	this.ComOpenGroupwareMail = ComOpenGroupwareMail;
}

/**
 * Mail의 Popup 을 띄운다.
 * @fileoverview mail 관련 함수가 정의되어 있다.
 * @author 
 * @return 없음
 */
function ComSendMail() {
	var vFeatures="status=no, width=" + 770
	  + ", height=" + 680 + ", left=" + (screen.width -770) / 2;
	  //+ ", top=" + (screen.height -768) / 2;

	ComPostOpenWindow("/opuscntr/syscommon/common/mail/jsp/COM_MAIL_COMMON_POPUP_MODALESS.jsp", "mail", vFeatures);
}

/**
 * Mail의 Popup 을 띄운다.
 * @fileoverview mail 관련 함수가 정의되어 있다.
 * @author 
 * @return 없음
 */
function ComSendMailModal(modalYn) {
	
//	  window.showModalDialog("/opuscntr/syscommon/common/mail/jsp/COM_MAIL_COMMON_POPUP_MODAL.jsp", window, "dialogWidth:770px;dialogHeight:768px;status:no");
	//ComPostOpenWindow("/opuscntr/syscommon/common/mail/jsp/COM_MAIL_COMMON_POPUP_MODAL.jsp", "mail", "Width=770, Height=850, status=no");
	if(modalYn == undefined) {
		modalYn = true;
	}
	ComOpenWindowCenter("COM_MAIL_COMMON_POPUP_MODAL.do", null, 770,680, modalYn);
}

/**
 * Contents와 Subject를 포함하는 Groupware Popup을 띄운다.
 */
function ComOpenGroupwareMail(sheetObj, formObj){
	var sXml = sheetObj.GetSearchXml("Groupware_Mail_PopupGS.do", FormQueryString(formObj));
	if(ComGetEtcData(sXml,"TRANS_RESULT_KEY") == "F"){
		alert("Please Check your status of SSO.");
	} else{
		window.open(ComGetEtcData(sXml,"GroupwarePopupURL"));
	}
}