<%--
/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0P1GS.jsp
*@FileTitle : VVDChart
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-19
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-19 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
--%>
<%@ page contentType="text/xml; charset=UTF-8"%>
<%@ page autoFlush="true" buffer="1kb" %>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.vvdchart.event.ComEns0P1Event"%>
<%@ page import="com.clt.bizcommon.vvdchart.event.ComEns0P1EventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.FormCommand"%>
<%

	ComEns0P1Event event = null;
	ComEns0P1EventResponse eventResponse = null;	//RDTO(Data Transfer Object including DB ResultSet)
	Exception serverException = null;					 //서버에서 발생한 에러
	DBRowSet rowSet = null;							   //DB ResultSet
	String strErrMsg = "";								//에러메세지
	int rowCount	 = 0;								 //DB ResultSet 리스트의 건수

	try {
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}else{
			event = (ComEns0P1Event)request.getAttribute("Event");
			eventResponse = (ComEns0P1EventResponse)request.getAttribute("EventResponse");
			if (eventResponse != null) {
				rowSet = eventResponse.getRs();
				if(rowSet != null){
					rowCount = rowSet.getRowCount();
				} // end if
			} // end if
		} // end else
	}catch(Exception e) {
		out.println(e.toString());
	}

%>
<%
	if (serverException == null) {
		FormCommand formcommand = event.getFormCommand();
		//화면에서 CUD가 발생하는 FormCommand인 경우에는 조회XML을 출력한다.
		//FormCommand가 다를 경우 조건문에 추가한다.
		//ServiceCommand에서는 재조회를 하지 않고 EventResponse만 return한다.
		if( formcommand.isCommand(FormCommand.MULTI) || 
			formcommand.isCommand(FormCommand.ADD) || 
			formcommand.isCommand(FormCommand.MODIFY) || 
			formcommand.isCommand(FormCommand.REMOVE) || 
			formcommand.isCommand(FormCommand.REMOVELIST) ){	//저장XML인 경우
%>
<RESULT>
  <TR-ALL>OK</TR-ALL>
</RESULT>
<%
		   } else {	//조회XML인 경우%>
<SHEET>
  <DATA TOTAL="<%=rowCount%>">
<%
			if (rowSet != null) {

				while (rowSet.next()) {
					// All 은 제외
					if(!"All".equals(JSPUtil.getNull(rowSet.getString("id")))) {
%>
	<TR LEVEL="<%=JSPUtil.getNull(rowSet.getString("level"))%>">	
		<TD></TD>
		<TD><%=JSPUtil.getNull(rowSet.getString("id"))%></TD>	
		<TD><%=JSPUtil.getNull(rowSet.getString("name"))%></TD>
		<TD><%=JSPUtil.getNull(rowSet.getString("trade"))%></TD>
		<TD><%=JSPUtil.getNull(rowSet.getString("lane"))%></TD>
		<TD><%=JSPUtil.getNull(rowSet.getString("vvd"))%></TD>
	</TR>
<%
					}
				}
			}
%>
  </DATA>
</SHEET>
<%
		}
	} else {%>
<ERROR>
<MESSAGE> <![CDATA[ <%=strErrMsg%>]]> </MESSAGE>
</ERROR>
<%
	}
%>