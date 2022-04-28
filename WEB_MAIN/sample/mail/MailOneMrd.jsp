<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoPopup.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoMail.js"></script>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mail Popup Test</title>
</head>
<body>
<form name="form">
<table>
	<tr>
		<td>RdSubSystemCode</td>
		<td><input type="text" size=150 name="com_rdSubSysCd" value="COM"></td>
	</tr>
	<tr>
		<td>From</td>
		<td><input type="text" size=150 name="com_from" value="nhc123@cyberlogitec.com"></td>
	</tr>
	<tr>
		<td>To</td>
		<td><input type="text" size=150 name="com_recipient" value="coolguy@cyberlogitec.com"></td>
	</tr>
	<tr>
		<td>CC</td>
		<td><input type="text" size=150 name="com_carbonCopy" value=""></td>
	</tr>
	<tr>
		<td>BCC</td>
		<td><input type="text" size=150 name="com_blindCarbonCopy" value=""></td>
	</tr>
	<tr>
		<td>Subject</td>
		<td><input type="text" size=150 name="com_subject" value="Title 입니다."></td>
	</tr>
	<tr>
		<td>File Key</td>
		<td><input type="text" size=150 name="com_fileKey" value=""></td>
	</tr>
	<tr>
		<td>Content</td>
		<td><input type="text" size=150 name="com_content" value=""></td>
	</tr>
	<tr>
		<td>Template</td>
		<td><input type="text" size=150 name="com_template" value="template.htmlmail"></td>
	</tr>
	<tr>
		<td>TemplateArguments</td>
		<td><input type="text" size=150 name="com_argument" value="name;김정훈,message;Hello"></td>
	</tr>
	<tr>
		<td>RD Template(MRD)</td>
		<td><input type="text" size=150 name="com_templateMrd" value="TEST.mrd"></td>
	</tr>
	<tr>
		<td>RD Template(MRD) Arguments</td>
		<td><input type="text" size=150 name="com_templateMrdArguments" value=""></td>
	</tr>
	<tr>
		<td>RD Template(MRD) Description</td>
		<td><input type="text" size=150 name="com_templateMrdDescription" value="TEST 리포트 파일이 첨부 되었습니다."></td>
	</tr>
	<tr>
		<td><input type="button" value="fire" onclick="ComSendMail()"></td>
	</tr>
</table>
</form>
</body>
</html>