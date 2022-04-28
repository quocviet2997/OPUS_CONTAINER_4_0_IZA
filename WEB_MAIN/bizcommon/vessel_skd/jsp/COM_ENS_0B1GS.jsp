<%-- =========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0B1GS.jsp
*@FileTitle : Vessel SKD 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-02
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2006-08-02 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================
--%>
<%@ page contentType="text/xml; charset=UTF-8"%>
<%@ page autoFlush="true" buffer="1kb" %>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.vessel_skd.event.ComEns0B1Event"%>
<%@ page import="com.clt.bizcommon.vessel_skd.event.ComEns0B1EventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.FormCommand"%>
<%

	ComEns0B1Event event = null;
	ComEns0B1EventResponse eventResponse = null;    //RDTO(Data Transfer Object including DB ResultSet)
    Exception serverException = null;                     //서버에서 발생한 에러
    DBRowSet rowSet = null;                               //DB ResultSet
    String strErrMsg = "";                                //에러메세지
    int cnt     = 0;                                 //DB ResultSet 리스트의 건수


    try {
        serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
        if (serverException != null) {
            strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
        }else{
            event = (ComEns0B1Event)request.getAttribute("Event");
            eventResponse = (ComEns0B1EventResponse)request.getAttribute("EventResponse");
            if (eventResponse != null) {
                rowSet = eventResponse.getRs();
                if(rowSet != null){
                	cnt = eventResponse.getCnt();
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
            formcommand.isCommand(FormCommand.REMOVELIST) ){    //저장XML인 경우
%>
<RESULT>
  <TR-ALL>OK</TR-ALL>
</RESULT>
<%
           } else {    //조회XML인 경우%>
<SHEET>
  <DATA TOTAL="<%=cnt%>">
<%
            int i =1;
            if (rowSet != null) {

                while (rowSet.next()) {
%>
    <TR>
        <TD>R</TD>
        <TD></TD>
<%
                    for (int j = 0 ; j < rowSet.getMetaData().getColumnCount() ; j++) {
%>
        							<TD><![CDATA[<%=JSPUtil.getNull(rowSet.getString(i++))%>]]></TD>
<%
                    }

                    i = 1;
%>
    </TR>
<%
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