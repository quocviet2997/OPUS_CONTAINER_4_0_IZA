<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script language="JavaScript" src="/opuscntr/js/CoWait.js"></script>
<script>
	function waitTest() {
		//waitAndCallFunc("test()", true);
		//zu_openRunning(true, true);
		//document.form.action = "waitTestParam.jsp";
		//document.form.submit();
	}
	
	function test() {
		for(var i=0; i< 10000; i++) {
			
		}
	}
</script>
</head>
<body>
<%
	java.util.Enumeration enum1 = request.getParameterNames();
	while(enum1.hasMoreElements()) {
		String paramNm = (String)enum1.nextElement();
		String value   = request.getParameter(paramNm);
		
		out.println(paramNm + " : " + value);
		out.println("<BR>");
	}
%>
<a href="javascript:waitTest();">TEST</a>
<form name="form">
<input type="text" name="a" disabled>
<input type="text" name="b">
<input type="radio" name="c" value="111"><input type="radio" name="c" value="222">
<input type="checkbox" name="d" value="chk1">
<select name=e>
<option>1</option>
<option>2</option>
</select>
<br><br><br><br><br><br><br><br><br><br><br><br><br>
<br><br><br><br><br><br><br><br><br><br><br><br><br>
<br><br><br><br><br><br><br><br><br><br><br><br><br>
<br><br><br><br><br><br><br><br><br><br><br><br><br>
<br><br><br><br><br><br><br><br><br><br><br><br><br>
<a href="javascript:waitTest();">TEST</a>
</form>
<iframe id="ifr"></iframe>
</body>

</html>