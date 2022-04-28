<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="javax.transaction.UserTransaction"%>
<%@page import="javax.naming.Context"%>
<%@page import="com.clt.framework.core.config.SiteConfigFactory"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

UserTransaction tx = null;
InitialContext ctx = new InitialContext();
tx = (javax.transaction.UserTransaction) ctx.lookup("java:comp/UserTransaction");
//tx.setTransactionTimeout(new Integer(SiteConfigFactory.get("COM.BACKEND.DB.TRANSACTION.TIMEOUT")));	

tx.begin();
DataSource ds = (DataSource) ctx.lookup("jdbc/NIS2010");
Connection connection = ds.getConnection();
System.out.println("Start");
for(int i=0;i<50;i++){
	PreparedStatement preparedStatement =connection.prepareStatement("select * from bkg_booking where rownum < 2 order by bl_no");
	ResultSet resultSet =  preparedStatement.executeQuery();
	Thread.sleep(1000);
	System.out.println(i);
}
System.out.println("END");
tx.commit();
%>
</body>
</html>