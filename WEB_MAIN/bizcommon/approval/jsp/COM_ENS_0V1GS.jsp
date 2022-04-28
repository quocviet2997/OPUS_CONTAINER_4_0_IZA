<%--
/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0T1GS.jsp
*@FileTitle : Approval Route
*Open Issues :
*Change history :
*@LastModifyDate : 2007-03-07
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-31 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
--%>
<%@ page contentType="text/xml; charset=UTF-8"%>
<%@ page autoFlush="true" buffer="1kb" %>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Map"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.common.AbstractValueObject"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.approval.event.ComEns0T1Event"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.FormCommand"%>
<%
	ComEns0T1Event event = null;
GeneralEventResponse eventResponse = null;				//RDTO(Data Transfer Object including DB ResultSet)
	Exception serverException = null;					//서버에서 발생한 에러
	String strErrMsg = "";								//에러메세지

	List<AbstractValueObject> vos = null;				//VO List
	int totCnt = 0;	
	String[] colNms = null;

	try {
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}else{
			event = (ComEns0T1Event)request.getAttribute("Event");
			eventResponse = (GeneralEventResponse)request.getAttribute("EventResponse");
			if (eventResponse != null) {
				vos = eventResponse.getRsVoList();
				totCnt = vos.size();
				
				AbstractValueObject vo = (AbstractValueObject)vos.get(0);
				Map<String,String> colValues = vo.getColumnValues();
				colNms = colValues.keySet().toArray(new String[colValues.size()]);
			}
		}
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
  <DATA TOTAL="<%=totCnt%>">
<%
			for(int i=0;i<totCnt;i++){
				Map<String, String> colValues = vos.get(i).getColumnValues();
%>
	<TR>
<%
				int colCnt = colNms.length;
				
				for (int j = 0 ; j < colCnt-1 ; j++) {
%>
		<TD><![CDATA[<%=JSPUtil.getNull(colValues.get(colNms[j]))%>]]></TD>
<%
				}
%>
	</TR>
<%
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