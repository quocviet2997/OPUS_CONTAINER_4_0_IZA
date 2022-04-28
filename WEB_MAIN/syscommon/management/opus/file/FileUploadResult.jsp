<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.Iterator"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FileUploadResult</title>
</head>
<script type="text/javascript">
	var aryFiles = new Array();
	var i = 0;
<%
Iterator<String> iterator = (Iterator<String>)request.getAttribute("keys");
while(iterator.hasNext()){
	String key = iterator.next();
	%>
	aryFiles[i++] = "<%=key%>";
	<%
}

%>
	function winClose() {
		window.opener.document.getElementById("keys").value=aryFiles.join("|");
		self.close();
	}
</script>
<body>


<h2>File Upload Success!</h2>
<input type="button" value="close" onclick="winClose()">

</body>
</html>