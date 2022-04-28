<%
/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : groupware_popup.jsp
*@FileTitle : GROUPWARE_POPUP
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.04
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.06.04 김정훈
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
<%@ page import="com.clt.sample.groupwarepopup.groupwarepopup.event.GroupwarePopupEvent"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	GroupwarePopupEvent  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.GroupwarePopup.GroupwarePopup");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (GroupwarePopupEvent)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// 초기화면 로딩시 서버로부터 가져온 데이터 추출하는 로직추가 ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>
<html>
<head>
<title>GROUPWARE_POPUP</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="/opuscntr/css/alps_contents.css" type="text/css" rel="stylesheet"/>

<script language="javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>
</head>

<body  onLoad="setupPage();">
<form name="form">
<table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
		<tr><td class="btn1_left"></td>
		<td class="btn1" name="btn_Send">Send</td>
		<td class="btn1_right"></td>
		</tr>
	</table>
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
subject : <input type="text" name="gw_subject"><br>
contents : <input type="text" name="gw_contents"><br>
template : <input type="text" name="gw_template" value="template.htmlmail">
template : <input type="text" name="gw_args" value="name;김정훈">
template : <input type="text" name="gw_args" value="message;HelloWorld">
<!-- 개발자 작업	-->
	<table width="0%"  id="mainTable">
		<tr>
			<td width="0%">
				<script language="javascript">ComSheetObject('sheet1');</script>
			</td>
		</tr>
	</table>
<!-- 개발자 작업  끝 -->
</form>
</body>
</html>