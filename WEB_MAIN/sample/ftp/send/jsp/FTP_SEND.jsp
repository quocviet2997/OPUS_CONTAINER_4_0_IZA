
<%
	/*=========================================================
	 *Copyright(c) 2009 CyberLogitec
	 *@FileName : FTP_SEND.jsp
	 *@FileTitle : FTP_SEND
	 *Open Issues :
	 *Change history :
	 *@LastModifyDate : 2009.09.04
	 *@LastModifier : 김정훈
	 *@LastVersion : 1.0
	 * 2009.09.04 김정훈
	 * 1.0 Creation
	 =========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.sample.ftp.send.event.FtpSendEvent"%>
<%@ page import="org.apache.log4j.Logger"%>

<%
	FtpSendEvent event = null; //PDTO(Data Transfer Object including Parameters)
	Exception serverException = null; //서버에서 발생한 에러
	String strErrMsg = ""; //에러메세지
	int rowCount = 0; //DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList = "";
	String pageRows = "100";

	String strUsr_id = "";
	String strUsr_nm = "";
	Logger log = Logger.getLogger("com.clt.apps.Ftp.Send");

	try {
		SignOnUserAccount account = (SignOnUserAccount) session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id = account.getUsr_id();
		strUsr_nm = account.getUsr_nm();

		event = (FtpSendEvent) request.getAttribute("Event");
		serverException = (Exception) request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// 초기화면 로딩시 서버로부터 가져온 데이터 추출하는 로직추가 ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

	} catch (Exception e) {
		out.println(e.toString());
	}
%>
<html>
<head>
<title>FTP_SEND</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script language="javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		//if (errMessage.length >= 1) {
		//	ComShowMessage(errMessage);
		//} // end if
		loadPage();
	}
</script>
<style type="text/css">
input {width =100%
	
}
</style>
</head>

<body onLoad="setupPage();">
<form name="form"><input type="hidden" name="f_cmd"> <input type="hidden" name="pagerows"> <!-- 개발자 작업	-->
<h1>FTP Sender</h1>
<table border=2>
	<tr>
		<td>전송 파일명</td>
		<td><input type="text" name="FtpDirCtnt" value="QualityTestSource.java"></td>
	</tr>
	<tr>
		<td>전송 대상 파일</td>
		<td><input type="text" name="FtpFilePathUrlCtnt" value="/home/coolguy/Temp/QualityTestSource.java"></td>
	</tr>
	<tr>
		<td>서버 주소</td>
		<td><input type="text" name="FtpSvrIp" value="116.127.224.2"></td>
	</tr>
	<tr>	
		<td>로그인계정</td>
		<td><input type="text" name="FtpUsrId" value="test"></td>
	</tr>
	<tr>
		<td>로그인암호</td>
		<td><input type="text" name="FtpUsrPwd" value="test"></td>
	</tr>	
	<tr>
		<td>시스템명</td>
		<td><input type="text" name="SubSysCd" value="COM"></td>
	</tr>
	<tr>
		<td colspan=2><input type="button" value="fire" onclick="form.submit()"></td>
	</tr>
</table>
<!-- 개발자 작업  끝 --></form>
</body>
</html>