/**
===============================================================================
프로그램  명  : 메시지 관련 공통 함수 정의 Script
프로그램개요  : 공통 메시지 코드 정의 및 메시지 표시 함수를 정의한다.
작   성   자  : 이경희
작   성   일  : 2008-11
===============================================================================
수정자/수정일 : 최영삼/2009-05-14
수정사유/내역 : ComShowCodeConfirm2, ComShowCodeMessage2, ComGetMsg2 추가

2011.10.07 민정호 msgs['COM132401'] = 'invalid date'; 추가
===============================================================================
*/

    /*------------------다음 코드는 JSDoc을 잘 만들기 위해서 추가된 코드임 ------------------*/
    /**
     * @fileoverview 업무에서 공통으로 사용하는 자바스크립트파일로 메시지코드와 각종 메시지 처리 관련 함수가 정의되어 있다.
     * @author Cyberlogitec
     */

    /**
     * @class CoMessage :메시지코드와 각종 메시지 처리 관련 함수가 정의되어 있다.
     */
    function CoMessage() {
        this.ComShowConfirm        = ComShowConfirm;
        this.ComShowMessage        = ComShowMessage;
        this.ComShowCodeConfirm    = ComShowCodeConfirm;
        this.ComShowCodeConfirm2   = ComShowCodeConfirm2;
        this.ComShowCodeMessage    = ComShowCodeMessage;
        this.ComShowCodeMessage2   = ComShowCodeMessage2;
        this.ComGetMsg             = ComGetMsg;
        this.ComGetMsg2            = ComGetMsg2;
        this.ComSetMsg             = ComSetMsg;
        this.ComFuncErrMsg         = ComFuncErrMsg;
    }


    /*------------------여기서 부터 공통자바스크립트 함수를 정의한다.     ------------------*/

    OBJECT_ERROR     = 'The service is not available now.';
    END_MESSAGE      = 'Do you really want to exit?';

    var msgs = new Array();

    // 일반 입력 형식 관련 메세지
    msgs['COM12111'] = '서비스를 정상적으로 이용 하실수 없습니다.';
    msgs['COM12112'] = '정말로 나가시겠습니까?';
    msgs['COM12113'] = 'Please select {?msg1}';
    msgs['COM12114'] = 'Please check {?msg1}';
    msgs['COM12115'] = '{?msg1} has been duplicated.';
    msgs['COM12116'] = '{?msg1} has been completed.';
    msgs['COM12117'] = '{?msg1} has been canceled.';
    msgs['COM12118'] = 'Please select {?msg2} of {?msg1}.';
    msgs['COM12119'] = 'Please select only one  {?msg2} of {?msg1}.';
    msgs['COM12120'] = 'Please enter {?msg2} of {?msg1} first row.';
    msgs['COM12121'] = 'Processing the addition of {?msg1}';
    msgs['COM12122'] = '{?msg1} can only contain numbers.';
    msgs['COM12123'] = '{?msg1} can only contain letters.';
    msgs['COM12124'] = '{?msg1} cannot contain numbers.\n\n Please enter letters only.';
    msgs['COM12125'] = '{?msg1} cannot contain letters.\n\n Please enter numbers only.';
    msgs['COM12126'] = 'Please enter {?msg1} in Korean.';
    msgs['COM12127'] = 'Please enter {?msg1} in either English letters or numbers.';
    msgs['COM12128'] = 'Please enter {?msg1} using a combination of English letters and numbers.';
    msgs['COM12129'] = '{?msg1} cannot contain special characters.';
    msgs['COM12130'] = 'Please enter {?msg2} of {?msg1}.';

    // 날짜 형식 관련 메세지
    msgs['COM12131'] = '{?msg1} must be greater than or equal to the current date.';
    msgs['COM12132'] = 'Please enter a valid date format: YYYY-MM-DD';
    msgs['COM12133'] = '{?msg1} must be {?msg3} than {?msg2}.';
    msgs['COM12134'] = 'Please enter a valid date format for({?msg1}) : YYYY-MM-DD';

    // 숫자 형식 관련 메세지
    msgs['COM12135'] = 'Please round {?msg3} from a minimum of {?msg2} decimal place to a maximum {?msg1} decimal place.';
    msgs['COM12136'] = 'Please round {?msg1} to a whole number.';
    msgs['COM12137'] = '{?msg1} must start with {?msg2} and must be {?msg3} characters long.';

    // 단순 메세지
    msgs['COM12138'] = 'Please enter {?msg1} or {?msg2}.';
    msgs['COM12139'] = 'Please select {?msg1} or {?msg2}.';
    msgs['COM12140'] = 'Please enter {?msg2} of {?msg1} first row.';
    msgs['COM12141'] = 'Please select {?msg2} of {?msg2}.';
    msgs['COM12142'] = '{?msg1} must be shorter than {?msg2} characters long.';
    msgs['COM12143'] = '{?msg1} must be longer than {?msg2} characters long.';

    // 로그인 관련 메세지
    msgs['COM12144'] = 'The User ID you entered cannot be found.\n\n Please try again.';
    msgs['COM12145'] = 'Please enter your user ID and Password.';
    msgs['COM12146'] = 'Please enter your User ID and Password, and press OK button.';

    // 저장 관련 메세지
    msgs['COM12147'] = 'Do you want to save ({?msg1})?';
    msgs['COM12148'] = 'Saving ({?msg1}) has been canceled.';
    msgs['COM12149'] = 'Registering ({?msg1}) has been completed';
    msgs['COM12150'] = 'Registering ({?msg1}) has failed';
    msgs['COM12151'] = 'Saving ({?msg1}) has failed';
    msgs['COM12152'] = '{?msg1} has been changed.\n\n Do you want to save these changes?';
    msgs['COM12153'] = '{?msg1} has been changed.\n\n Please save the changes and exit the program.';

    // 수정 관련 메세지
    msgs['COM12154'] = 'Do you want to update {?msg1}?';
    msgs['COM12155'] = '{?msg1} update has been canceled.';
    msgs['COM12156'] = '{?msg1} update has been completed.';
    msgs['COM12157'] = '{?msg1} update has failed.';
    msgs['COM12158'] = 'Do you want to update the selected {?msg1}?';
    msgs['COM12159'] = 'The selected {?msg1} update has been canceled.';
    msgs['COM12160'] = 'Updating {?msg1} ......';

    // 조회 관련 메세지
    msgs['COM12161'] = 'There is no corresponding data for the search criteria: {?msg1}.';
    msgs['COM12162'] = 'Opening advanced search of {?msg1} ....';
    msgs['COM12163'] = 'Searching {?msg1} ......';
    msgs['COM12164'] = 'Reading {?msg1} ......';

    // 삭제 관련 메세지
    msgs['COM12165'] = 'Do you want to delete {?msg1}?';
    msgs['COM12166'] = '{?msg1} deletion has been canceled.';
    msgs['COM12167'] = '{?msg1} has been deleted.';
    msgs['COM12168'] = '{?msg1} has not been deleted.';
    msgs['COM12169'] = 'Do you want to delete {?msg1} and {?msg2}?';
    msgs['COM12170'] = '{?msg1} and {?msg2} deletion has been canceled.';
    msgs['COM12171'] = 'Do you want to delete the selected {?msg1}?';
    msgs['COM12172'] = 'Deletion of the selected {?msg1} has been canceled.';

    // 문자열 관련 메세지
    msgs['COM12173'] = '{?msg1} must not be over {?msg2} characters long.';
    msgs['COM12174'] = '{?msg1} must be at least {?msg2} characters long.';
    msgs['COM12175'] = '{?msg1} must be either {?msg2} or {?msg3} characters long.';

    // 추가 메세지
    msgs['COM12176'] = 'Please select one at least.';
    msgs['COM12177'] = 'Please select one only.';
    msgs['COM12178'] = 'Please enter number only.';
    msgs['COM12179'] = 'Please enter correct date.\n\n Format : YYYY-MM-DD';
    msgs['COM12180'] = 'Please enter correct date.\n\n Format : YYYY-MM';
    msgs['COM12181'] = 'Please enter correct date.\n\n Format : YY-MM-DD';
    msgs['COM12182'] = 'Please enter today or future date.';

    msgs['COM12183'] = 'It is possible to take a long time.\n\nYou must not navigate away from this page during approval.\n\nDo you want to continue?';
    msgs['COM12184'] = 'The selected approval will be disapproved.\n\nDo you want to continue?';
    msgs['COM12185'] = 'Header Setting {?msg1} - Success !!';
    msgs['COM12186'] = 'The approved route cannot be deleted.';
    msgs['COM12187'] = 'Please enter correct date.\n\n Format : {?msg1}';

    msgs['COM12188'] = "Are you sure to delete it? Then, click 'save' button";
    msgs['COM12189'] = 'Nothing selected';


	/**
	* OPUS COMMON MESSAGE ADD 
	*/
	// save massage  
	msgs['COM130101'] = 'Do you want to save {?msg1}?';
	msgs['COM130102'] = '{?msg1} was saved successfully.';
	msgs['COM130103'] = 'Failed to save {?msg1}.  Please try again.';
	// input message
	msgs['COM130201'] = 'Please input coMessage 한글{?msg1}.';
	// delete message 
	msgs['COM130301'] = 'Do you want to delete {?msg1}?';
	msgs['COM130302'] = 'You can\'t delete {?msg1}.';
	msgs['COM130303'] = '{?msg1} was deleted successfully.';
	msgs['COM130304'] = 'Failed to delete {?msg1}. Please try again.';
	// select message
	msgs['COM130401'] = 'There is no data to search.';
	msgs['COM130402'] = '{?msg1} doesn\'t exist';
	msgs['COM130403'] = 'Mandatory field is missing. Please enter {?msg1}.';
	msgs['COM130404'] = '{?msg1} is mandatory. Please enter {?msg2}.';
	msgs['COM130405'] = '{?msg1} was retrieved successfully.';
	msgs['COM130406'] = 'Failed to retrieve {?msg1}. Please try again.';
	msgs['COM130407'] = '{?msg1} doesn\'t exist. Do you want to create this code ?' ;

	// update message 
	msgs['COM130501'] = 'Do you want to update {?msg1}?';
	msgs['COM130502'] = '{?msg1} was updated successfully.';
	msgs['COM130503'] = 'There is no updated data to save.';
	msgs['COM130504'] = 'Data was changed. Do you want to save it?';
	msgs['COM130505'] = 'Failed to update {?msg1}. Please try again.';
	// transmit message 
	msgs['COM130601'] = '{?msg1} was transmitted successfully.';
	msgs['COM130602'] = 'Do you want to transmit {?msg1} to {?msg2}?';
	msgs['COM130603'] = 'Failed to transmit {?msg1}. Please try again.';
	// insert message 
	msgs['COM130701'] = '{?msg1} was inserted successfully.';
	msgs['COM130702'] = 'Failed to insert {?msg1}. Please try again.';
	// calculate massage 
	msgs['COM130801'] = '{?msg1} was calculated successfully.';
	msgs['COM130802'] = 'Failed to calculate {?msg1}. Please try again.';
	// approve message 
	msgs['COM130901'] = '{?msg1} was approved successfully.';
	msgs['COM130902'] = 'Failed to approve {?msg1}. Please try again.';
	// print message 
	msgs['COM131001'] = '{?msg1} was printed successfully.';
	msgs['COM131002'] = 'There is no data to print.';
	msgs['COM131003'] = 'Failed to print {?msg1}. Please try again.';
	// download message 
	msgs['COM131101'] = '{?msg1} was downloaded successfully.';
	msgs['COM131102'] = 'Failed to download {?msg1}. Please try again.';
	// upload message 
	msgs['COM131201'] = '{?msg1} was uploaded successfully.';
	msgs['COM131202'] = 'Failed to upload {?msg1}. Please try again.';
	// duplication message 
	msgs['COM131301'] = '{?msg1} Duplication occurred.';
	msgs['COM131302'] = '{?msg1} is duplicated.';
	// datetime message 
	msgs['COM131401'] = 'Date format is wrong. Please enter a valid date format(YYYY-MM-DD).';
	// email message 
	msgs['COM131501'] = 'Mail address isn\'t exact. Please check it again.';
	msgs['COM131501'] = 'Mail transmission was faild. Please try again.';
	msgs['COM131501'] = 'Mail was transmitted to [person] successfully.';
	// authority message 
	msgs['COM131601'] = 'You have no authority to inquire {?msg1}.';
	msgs['COM131602'] = 'You have no authority to create {?msg1}.';
	msgs['COM131603'] = 'You have no authority to delete {?msg1}.';
	msgs['COM131604'] = 'You have no authority to update {?msg1}.';
	// caps lock message 
	msgs['COM131701'] = 'Please check Caps Lock.';
	//number message 
	msgs['COM131801'] = 'Please input a numeric value/ numeric values.';
	// length message 
	msgs['COM131901'] = '{?msg1} exceeds field length.';
	// duration message
	msgs['COM132001'] = '{?msg1} exceeds maximum duration {?msg2}.';
	msgs['COM132002'] = 'End date must be greater than start date';
	// system error message
	msgs['COM132101'] = 'Unexpected system error took place during data processing. Please try again later.';
	// etc message
	msgs['COM132201'] = '{?msg1} is invalid.';
	msgs['COM132202'] = '{?msg1} is not available.';
	// data unmatch message
	msgs['COM132301'] = '{?msg1} and {?msg2} are unmatched. Please check again.';
	
	msgs['COM132401'] = 'invalid date';
	
    /**
     * 사용자의 의사결정을 포함하는 확인메시지박스 표시한다. confirm() 함수 대신 이 함수를 사용한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     if(ComShowConfirm("정말 삭제하시겠습니까?")) return;  //확인메시지를 표시하고, 결과가 true이면 return 한다.
     * <pre>
     * @param {string} sMsg 필수,메시지 문자열
     * @returns bool <br>
     *          true  : 확인메시지에서 "확인"을 누른 경우<br>
     *          false : 확인메시지에서 "취소"을 누른 경우<br>
     * @see #ComShowCodeConfirm
     */
    function ComShowConfirm(sMsg) {
        return (confirm(sMsg));
    }

    /**
     * 메시지 표시한다. alert()함수 대신 이 함수를 사용한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ComShowMessage("입력값이 올바르지 않습니다.");  //메시지를 표시한다.
     * <pre>
     * @param {string} sMsg 필수,메시지 문자열
     * @return 없음
     * @see #ComShowCodeMessage
     */
    function ComShowMessage(sMsg)
    {
        try {
            if (sMsg.length < 1) return;
            alert(sMsg.replaceStr("<||>", "\n")); //?-왜 굳이 "<||>" 글자를 줄바꿈 글자로 사용했을까?
        } catch(err) { ComFuncErrMsg(err.message); }
    }
     
     /**
      * 메시지 표시한다. alert()함수 대신 이 함수를 사용한다. <br>
      * <br><b>Example :</b>
      * <pre>
      *     ComShowMessage("입력값이 올바르지 않습니다.");  //메시지를 표시한다.
      * <pre>
      * @param {string} sMsg 필수,메시지 문자열
      * @param {string} Detail 필수,Detail 메시지 문자열
      * @return 없음
      * @see #ComShowCodeMessage
      */
	function ComShowMessage(sMsg,Detail){
		try {
			if (sMsg.length < 1) return;
			if(Detail == null || Detail.length < 1){
				alert(sMsg.replaceStr("<||>", "\n"));
			}else if(!window.confirm(sMsg.replaceStr("<||>", "\n"))){ //?-왜 굳이 "<||>" 글자를 줄바꿈 글자로 사용했을까?
				if (Detail.length < 1) return;
             	alert(Detail.replaceStr("☜☞", "\n")); 
			}
         } catch(err) { ComFuncErrMsg(err.message); }
     }
      
    /**
     * 메시지코드를 받아서 {@link #ComGetMsg} 함수에서 해당 메시지 코드를 찾아서 사용자 확인메시지 표시한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     if (!ComShowCodeConfirm("COM12112")) return;              //ComGetMsg("COM12112")인 확인메시지를 표시한다.
     *     if (!ComShowCodeConfirm("COM12147", "매출내역")) return;  //ComGetMsg("COM12147", "매출내역")인 확인메시지를 표시한다.
     *     ComShowConfirm(ComGetMsg("COM12112"));                   //1줄코드와 동일한 기능을 처리한다.
     * <pre>
     * @param {string} sMsgNo 필수,메시지코드
     * @param {string} msg1   선택,메시지 변수1
     * @param {string} msg2   선택,메시지 변수2
     * @param {string} msg3   선택,메시지 변수3
     * @returns bool <br>
     *          true  : 확인메시지에서 "확인"을 누른 경우<br>
     *          false : 확인메시지에서 "취소"을 누른 경우<br>
     * @see #ComGetMsg
     * @see #ComShowConfirm
     */
    function ComShowCodeConfirm(sMsgNo, msg1, msg2, msg3) {
        try {
            return ComShowConfirm (ComGetMsg(sMsgNo, msg1, msg2, msg3));
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 메시지코드를 받아서 {@link #ComGetMsg2} 함수에서 해당 메시지 코드를 찾아서 사용자 확인메시지 표시한다. <br>
     * <br><b>Example :</b>
     * <pre>
     * 		var mText = new Array("매출내역");
     *     	if (!ComShowCodeConfirm2("COM12147", mText)) return;  //ComGetMsg2("COM12147", mText)인 확인메시지를 표시한다.
     * <pre>
     * @param {string} sMsgNo 필수,메시지코드
     * @param {string[]} arrMsg 필수,메시지 변수배열
     * @returns bool <br>
     *          true  : 확인메시지에서 "확인"을 누른 경우<br>
     *          false : 확인메시지에서 "취소"을 누른 경우<br>
     * @see #ComGetMsg2
     * @see #ComShowCodeConfirm
     */
    function ComShowCodeConfirm2(sMsgNo, arrMsg) {
        try {
            return ComShowConfirm (ComGetMsg2(sMsgNo, arrMsg));
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 메시지코드를 받아서 {@link #ComGetMsg} 함수에서 해당 메시지 코드를 찾아서 메시지 표시한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ComShowCodeMessage("COM12111");              //ComGetMsg("COM12111")인 메시지를 표시한다.
     *     ComShowCodeMessage("COM12114", "선택여부");  //ComGetMsg("COM12111", "선택여부")인 메시지를 표시한다.
     *     ComShowMessage(ComGetMsg("COM12111"));      //1줄코드와 동일한 기능을 처리한다.
     * <pre>
     * @param {string} sMsgNo 필수,메시지코드
     * @param {string} msg1   선택,메시지 변수1
     * @param {string} msg2   선택,메시지 변수2
     * @param {string} msg3   선택,메시지 변수3
     * @return 없음
     * @see #ComGetMsg
     * @see #ComShowMessage
     */
    function ComShowCodeMessage(sMsgNo, msg1, msg2, msg3) {
        try {
            ComShowMessage (ComGetMsg(sMsgNo, msg1, msg2, msg3));
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 메시지코드를 받아서 {@link #ComGetMsg2} 함수에서 해당 메시지 코드를 찾아서 메시지 표시한다. <br>
     * <br><b>Example :</b>
     * <pre>
     * 		var mText = new Array("선택여부");
     *     	ComShowCodeMessage2("COM12114", mText);  //ComGetMsg2("COM12111", mText)인 메시지를 표시한다.
     * <pre>
     * @param {string} sMsgNo 필수,메시지코드
     * @param {string[]} arrMsg 필수,메시지 변수배열
     * @return 없음
     * @see #ComGetMsg2
     */
    function ComShowCodeMessage2(sMsgNo, arrMsg) {
        try {
            ComShowMessage (ComGetMsg2(sMsgNo, arrMsg));
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 메시지코드의 메시지 문자열을 찾아서 리턴한다. <br>
     * 메시지코드는 전역변수인 msgs 문자열배열에 저장되어 있다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     sMsg = ComGetMsg("COM12112");              //메시지코드 "COM12112"인 문자열을 반환한다.
     *     sMsg = ComGetMsg("COM12115", "이름");      //메시지코드 "COM12115"이고, 첫번째 메시지 변수는 "이름"을 넣은 문자열을 반환한다.
     * <pre>
     * @param {string} sMsgNo 필수,메시지코드
     * @param {string} msg1   선택,메시지 변수1
     * @param {string} msg2   선택,메시지 변수2
     * @param {string} msg3   선택,메시지 변수3
     * @return 없음
     * @see #ComSetMsg
     * @see #ComShowCodeConfirm
     * @see #ComShowCodeMessage
     */
    function ComGetMsg(sMsgNo, msg1, msg2, msg3)
    {
        try {
            var ret = "";
            sMsgNo = sMsgNo.toUpperCase();

            if (msgs[sMsgNo]) {
                ret = msgs[sMsgNo];

                if (ret.indexOf("{?msg1}") >= 0) ret = ComReplaceStr(ret, "{?msg1}", msg1);
                if (ret.indexOf("{?msg2}") >= 0) ret = ComReplaceStr(ret, "{?msg2}", msg2);
                if (ret.indexOf("{?msg3}") >= 0) ret = ComReplaceStr(ret, "{?msg3}", msg3);
            }

            return ret;
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 메시지코드의 메시지 문자열을 찾아서 리턴한다. <br>
     * 치환 문자가 3개 이상인경우 배열로 처리한다. <br>
     * 메시지코드는 전역변수인 msgs 문자열배열에 저장되어 있다. <br>
     * <br><b>Example :</b>
     * <pre>
     * 		var mText = new Array("이름");
     *     	sMsg = ComGetMsg2("COM12115", mText);      //메시지코드 "COM12115"이고, 첫번째 메시지 변수는 "이름"을 넣은 문자열을 반환한다.
     * <pre>
     * @param {string} sMsgNo 필수,메시지코드
     * @param {string[]} arrMsg 필수,메시지 변수배열
     * @return 없음
     * @see #ComShowCodeConfirm2
     * @see #ComShowCodeMessage2
     */
    function ComGetMsg2(sMsgNo, arrMsg)
    {
        try {
            var ret = "";
            sMsgNo = sMsgNo.toUpperCase();

            if (msgs[sMsgNo]) {
                ret = msgs[sMsgNo];
                for(var i = 0; i < arrMsg.length ; i++){
                	if (ret.indexOf("{?msg"+String(i+1)+"}") >= 0) 
                		ret = ComReplaceStr(ret, "{?msg"+String(i+1)+"}", arrMsg[i]);
                }
            }

            return ret;
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 메시지코드의 메시지 문자열을 전역변수인 msgs 문자열 배열에 설정한다. <br>
     * sMsgNo인자는 설정하고자 하는 메시지코드를 "업무구분영문3자리 + 숫자코드5자리"로 설정한다. 메시지코드는 자동으로 대문자로 등록된다. <br>
     * sMsgText인자는 표시할 메시지로, 가변메시지가 있다면 "{?msg1}", "{?msg2}", "{?msg3}" 3가지로 문자열내에 설정한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ComSetMsg("SCE90002", "When you enter POR, POL, POD, DEL, you must enter between VVD or BKG Date."); //가변메시지가 없는 경우
     *     ComSetMsg("COA10011", "{?msg2} of {?msg1} should be equal to or less than {?msg3}.");                //가변메시지가 있는 경우
     * <pre>
     * @param {string} sMsgNo 필수,메시지코드
     * @param {string} msg1   선택,메시지 변수1
     * @param {string} msg2   선택,메시지 변수2
     * @param {string} msg3   선택,메시지 변수3
     * @return 없음
     * @see #ComGetMsg
     * @see #ComShowCodeConfirm
     * @see #ComShowCodeMessage
     */
    function ComSetMsg(sMsgNo, sMsgText)
    {
        try {
            sMsgNo = sMsgNo.toUpperCase();
            msgs[sMsgNo] = sMsgText;
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 함수의 처리 중 에러가 발생한 경우 이 함수를 이용하여 에러 메시지를 표시한다. <br>
     * 다음과 같은 메시지가 표시된다. <br>
     * &nbsp;&nbsp;&nbsp;&nbsp; [함수명 Error] 에러메시지 <br>
     * <br><b>Example :</b>
     * <pre>
     *     try {.... 중략....
     *     } catch(err) { ComFuncErrMsg(err.message); } //"[함수명 Error] err.message"가 표시됨
     * <pre>
     * @param {string} err_msg 필수,에러메시지
     */
    function ComFuncErrMsg(err_msg) {
        var sFuncName = "";
        try {
            sFuncName=ComFuncErrMsg.caller.toString();
            sFuncName = sFuncName.substring(9, sFuncName.indexOf("("));
        } catch(err){;}

        alert("["+sFuncName+" Error] " + err_msg);
    }
