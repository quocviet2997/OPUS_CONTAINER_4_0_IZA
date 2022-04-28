<%@ page language="java" contentType="text/xml; charset=utf-8" %>
<%@ page import="com.tobesoft.iam.utility.TBStringUtil"%>
<%@ page import="com.tobesoft.iam.utility.TBHttpUtil"%>
<%@ page import="com.tobesoft.iam.virtualagent.TBVirtualAgent"%>
<%@ page import="com.tobesoft.iam.virtualagent.TBVirtualConfig"%>
<%
	TBVirtualAgent VA = new TBVirtualAgent();
	String pwd = TBStringUtil.nullString(request.getParameter("pwd"));
	out.println("<password>" + VA.encrypt(pwd) + "</password>");	
%>

