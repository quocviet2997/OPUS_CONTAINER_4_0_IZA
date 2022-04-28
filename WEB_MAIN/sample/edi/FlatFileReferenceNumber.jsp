<%@page import="com.clt.bizcommon.edi.broker.ReferenceNumberGeneratorBroker"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
String referenceNumber = ReferenceNumberGeneratorBroker.getKey("BKG","BKG_EDI_SEQ");
out.print(referenceNumber);
%>
</body>
</html>