
<%
	/*=========================================================
	 *Copyright(c) 2009 CyberLogitec
	 *@FileName : COM_SAMPLE_RD_WITH_FILE.jsp
	 *@FileTitle : COM_SAMPLE_RD_WITH_FILE
	 *Open Issues :
	 *Change history :
	 *@LastModifyDate : 2009.08.19
	 *@LastModifier : 김정훈
	 *@LastVersion : 1.0
	 * 2009.08.19 김정훈
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
<%@ page import="com.clt.sample.reportdesigner.withfiles.event.ComSampleRdWithFileEvent"%>
<%@ page import="org.apache.log4j.Logger"%>

<%
	ComSampleRdWithFileEvent event = null; //PDTO(Data Transfer Object including Parameters)
	Exception serverException = null; //서버에서 발생한 에러
	String strErrMsg = ""; //에러메세지
	int rowCount = 0; //DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList = "";
	String pageRows = "100";

	String strUsr_id = "";
	String strUsr_nm = "";
	Logger log = Logger.getLogger("com.clt.apps.ReportDesigner.WithFiles");

	try {
		SignOnUserAccount account = (SignOnUserAccount) session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id = account.getUsr_id();
		strUsr_nm = account.getUsr_nm();

		event = (ComSampleRdWithFileEvent) request.getAttribute("Event");
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

<%@page import="m2soft.rdsystem.server.core.rddbagent.util.serverexport.ExportInfo"%>
<%@page import="com.clt.framework.core.config.SiteConfigFactory"%><html>
<head>
<title>COM_SAMPLE_RD_WITH_FILE</title>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoUpload.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script language="javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		//if (errMessage.length >= 1) {
		//	ComShowMessage(errMessage);
		//} // end if
		loadPage();
	}

	function doUpload(){
		var returnValue = openUpload("<%=SiteConfigFactory.get("COM.MAIL.SAVE.DIRECTORY")%>");
		if(returnValue == null){
			returnValue = "";
		}
		form.userFileKey.innerText=returnValue;
	}
</script>
<style type="text/css">
input {width =100%
	
}
</style>
</head>

<body onLoad="setupPage();">
<form name="form"><input type="hidden" name="f_cmd"> <input type="hidden" name="pagerows"> <!-- 개발자 작업	-->
<h1>Common ReportDesigner with Files.</h1>
<table>
	<tr>
		<td><input type="text" name="from" value="nhc123@cyberlogitec.com"></td>
	</tr>
	<tr>
		<td><input type="text" name="to" value="coolguy@cyberlogitec.com"></td>
	</tr>
	<tr>
		<td><input type="text" name="subject" value="테스트 제목"></td>
	</tr>
	<tr>
		<td><input type="text" name="content" value="테스트 본문 Contents"></td>
	</tr>

	<tr>
		<td width="4%"><input type="button" value="Attach" onclick='doUpload()';></td>
	</tr>
	

	<tr>
		<td><input type="text" name="userFileKey" style="width: 100%; text-align: left;" class="noinput"></td>
	</tr>

	<tr>
		<td><input type="text" name="rdtmpltnm" value="TEST.mrd"></td>
	</tr>
	<tr>
		<td><input type="text" name="reportparameters" value=""></td>
	</tr>
	<tr>
		<td><input type="text" name="exportfilename" value="TEST.pdf"></td>
	</tr>
	<tr>
		<td><input type="text" name="filetype" value="<%=ExportInfo.FTYPE_PDF%>"></td>
	</tr>

	<tr>
		<td><input type="text" name="rdtmpltnm" value="TEST6.mrd"></td>
	</tr>
	<tr>
		<td><input type="text" name="reportparameters"
			value="/rv bkg_no[('BKKZ4250001A1','KORY1025089','KORZC315127','KORY1025027','KORY1025041')] remark[test1@@test2@@test3@@test4] type[detail] usr_id[0660235]"></td>
	</tr>
	<tr>
		<td><input type="text" name="exportfilename" value="Test6.pdf"></td>
	</tr>
	<tr>
		<td><input type="text" name="filetype" value="<%=ExportInfo.FTYPE_PDF%>"></td>
	</tr>
	<tr>
		<td><input type="button" value="fire" onclick="form.submit()"></td>
	</tr>
</table>

<!-- 개발자 작업  끝 --></form>
</body>
</html>