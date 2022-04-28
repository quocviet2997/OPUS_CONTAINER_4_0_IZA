<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="com.clt.framework.core.config.SiteConfigFactory"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
 <form name="form" action="/opuscntr/FileDownload" method="post">
 WAS의 물리적인 파일 위치 :<input type="text" name="downloadLocation" size="55" >
<br>
다운로드 시 지정할 파일 이름 :<input type="text" name="downloadFileName" size="55" >
<br>
<input type="button" value="DownLoadJsp" onclick="form.submit()">

</form>

</body>
</html>