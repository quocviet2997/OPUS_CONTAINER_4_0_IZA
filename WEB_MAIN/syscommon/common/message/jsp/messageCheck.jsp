<%
	/*=========================================================
	 *Copyright(c) 2009 CyberLogitec
	 *@FileName : messageCheck.jsp
	 *@FileTitle : messageCheck
	 *Open Issues :
	 *Change history :
	 *@LastModifyDate : 2009.01.13
	 *@LastModifier : 정인선
	 *@LastVersion : 1.0
	 * 2009.01.13 정인선
	 * 1.0 최초 생성
	 =========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.common.messages.event.MessageEvent"%>
<%@ page import="com.clt.framework.core.layer.event.EventResponse"%>
<%@ page import="org.apache.log4j.Logger"%>

<%
	MessageEvent event = null; //PDTO(Data Transfer Object including Parameters)
	EventResponse eventResponse = null; //RDTO(Data Transfer Object including DB ResultSet)
	Exception serverException = null;
	DBRowSet rowSet = null;
	String strErrMsg = "";
	int rowCount = 0;

	String strUsr_id = "";
	String strUsr_nm = "";

	Logger log = Logger.getLogger("com.clt.apps.Message.Messages");

	try {
		SignOnUserAccount account = (SignOnUserAccount) session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id = account.getUsr_id();
		strUsr_nm = account.getUsr_nm();

		event = (MessageEvent) request.getAttribute("Event");
		serverException = (Exception) request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		} else {
			eventResponse = (EventResponse) request.getAttribute("EventResponse");
			if (eventResponse != null) {
				rowSet = (DBRowSet) eventResponse.getRs();
				rowCount = rowSet.getRowCount();
				if (rowSet.next()) {
%>
<textarea id="tmp_message_sender"><%=rowSet.getString("sndr_usr_nm") + "<"	+ rowSet.getString("sndr_usr_id") + ">"%></textarea>
<textarea id="tmp_message_content"><%=rowSet.getString("msg_ctnt")%></textarea>
<textarea id="tmp_message_id"><%=rowSet.getString("msg_id")%></textarea>
<textarea id="tmp_message_cnt"><%=rowCount%></textarea>
<%
	}
			} // end if
		} // end else
	} catch (Exception e) {
		out.println(e.toString());
	}
%>


<script language="javascript">
var appName = navigator.appName;
var newCnt = '<%=rowCount%>	';

	try {
		//parent.document.getElementById("message_sender").value = tmp_message_sender.value;
		//parent.document.getElementById("message_content").value = tmp_message_content.value;
		//parent.document.getElementById("message_id").value = tmp_message_id.value;

		
		parent.document.getElementById("newCnt").innerHTML = newCnt;
		if ( newCnt > 0 ) {
			parent.document.getElementById("messageBox").src = 'img/img_topmenu_message_02.gif';
			if ( getCookie( "messagePop" ) != "done" ) {
				parent.document.getElementById("ifalert01").style.visibility = 'visible';
				parent.document.getElementById("alert01").style.visibility = 'visible';
			}
		} else {
			parent.document.getElementById("messageBox").src = 'img/img_topmenu_message_01.gif';
		}
	} catch (e) {
		;
	}
	// message refresh tme setting
	//var timer = setTimeout('reload();', '3600000');
	function reload() {
		//var start_chk = parent.document.getElementById("start_chk").checked;
		//if ( start_chk )
			document.location.href = "MessageCheck.do?f_cmd=101";
	}
	function getCookie(name) {
		var nameOfCookie = name + "=";
		var x = 0;
		while (x <= document.cookie.length) {
			var y = (x + nameOfCookie.length);
			if (document.cookie.substring(x, y) == nameOfCookie) {
				if ((endOfCookie = document.cookie.indexOf(";", y)) == -1)
					endOfCookie = document.cookie.length;
				return unescape(document.cookie.substring(y, endOfCookie));
			}
			x = document.cookie.indexOf(" ", x) + 1;
			if (x == 0)
				break;
		}
		return "";
	}
</script>

