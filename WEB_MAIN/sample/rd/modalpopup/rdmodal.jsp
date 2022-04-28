<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script language="javascript" src="/opuscntr/rpt/script/rdviewer50.js"></script>
<script language="javascript">
	function fire(){
		rdObjModal("http://203.246.142.75:9001/opuscntr/sample/rd/usingrdagent/rd.jsp","",700,500);
	}
</script>
<body>
		<input type="button" value="fire" onclick="fire()">

</body>
</html>