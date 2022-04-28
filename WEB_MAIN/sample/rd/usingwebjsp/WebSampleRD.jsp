
<%@page import="com.clt.framework.core.config.SubSystemConfigFactory"%>
<%@page import="com.clt.framework.core.config.SiteConfigFactory"%>
<%@page import="com.clt.syscommon.common.table.ComUpldFileVO"%>
<%@page import="java.util.List"%>
<%@page import="com.clt.framework.core.layer.event.GeneralEventResponse"%><%
GeneralEventResponse eventResponse = (GeneralEventResponse)request.getAttribute("EventResponse");
List<ComUpldFileVO> list = (List<ComUpldFileVO>)eventResponse.getCustomData("RD");
String rdDelimiter = SubSystemConfigFactory.get("RDWEB.DELIMITER");
for(int i=0;i<list.size();i++){
	out.println(list.get(i).getFileSavId()+rdDelimiter+list.get(i).getFileUpldNm()+rdDelimiter+list.get(i).getFileSzCapa());
}
%>