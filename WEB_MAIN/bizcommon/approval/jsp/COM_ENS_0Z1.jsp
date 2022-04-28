<%--
 - Copyright(c) 2017 CyberLogitec
 - @FileName : COM_ENS_0Z1.jsp
 - @FileTitle : CSR amount limitation setup
 - Open Issues :
 - Change history :
 - @LastModifyDate : 2017.10.10
 - @LastModifier : Yo-Na Ha
 - @LastVersion : 1.0
 - 2017.10.10 1.0 Yo-Na Ha Creation.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.core.controller.util.WebKeys" %>
<%@ page import="com.clt.framework.core.view.template.Screen" %>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse" %>
<%@ page import="com.clt.framework.component.message.ErrorHandler" %>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys" %>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount" %>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.bizcommon.approval.event.ComEns0Z1Event" %>

<%
	ComEns0Z1Event ComEns0Z1Event = null;
	Exception exception = null;
	String errorMessage = "";
	String ofc_cd = "";
	
	try {
		SignOnUserAccount account = (SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT); // Login session.
		ofc_cd = account.getOfc_cd();
		ComEns0Z1Event = (ComEns0Z1Event)request.getAttribute("Event"); // Request Parameter.

		exception = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		if (exception != null) {
			errorMessage = new ErrorHandler(exception).loadPopupMessage();
		}

		GeneralEventResponse eventResponse = (GeneralEventResponse)request.getAttribute("EventResponse"); // Response

		Screen screen = (Screen)request.getAttribute(WebKeys.CURRENT_SCREEN);
	} catch (Exception e) {
		out.println(e.toString());
	}

	Calendar calendar = Calendar.getInstance();
	StringBuffer nowDate = new StringBuffer();
	nowDate.append(calendar.get(Calendar.YEAR));
	nowDate.append("-");
	nowDate.append((calendar.get(Calendar.MONTH) + 1) < 10 ? "0" + (calendar.get(Calendar.MONTH) + 1) : (calendar.get(Calendar.MONTH) + 1));
%>

	<script type="text/javascript">

		function setupPage() {
			var errorMessage = "<%=errorMessage %>";
			if (errorMessage.length >= 1) {
				showErrMessage(errorMessage);
			}
			loadPage();
		}

	</script>

	<form name="form">
	<input type="hidden" name="f_cmd" />
	<input type="hidden" name="pagerows" />
	<input type="hidden" name="usr_ofc_cd" value="<%=JSPUtil.getNull(ofc_cd)%>"/>
	<input type="hidden" name="v_rhq_ofc_cd"/>
	<%-- Page title area --%>
	<div class="page_title_area clear">
		<%-- Title auto input. --%>
		<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
		<%-- Buttons --%>
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><%--
			--%><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><%--
			--%><button type="button" class="btn_normal" name="btn_save" id="btn_save" disabled>Save</button>
		</div>

		<%-- Page location --%>
		<div class="location">
			<%-- Navigation auto input --%>
			<span id="navigation"></span>
		</div>
	</div>

	<%-- UI conditions to retrieve --%>
	<div class="wrap_search">
	<div class="opus_design_inquiry wFit">
	    <table>	        
	        <tbody>
	        	<colgroup>
					<col width="50">
					<col width="130">
					<col width="80">
					<col width="140">
					<col width="80">
					<col width="*">
	        	</colgroup>
				<tr>
					<th>RHQ</th>
					<td><script type="text/javascript">ComComboObject("rhq_ofc_cd", 1, 120, 1, 0, 0);</script></td>
					<th>Office Code</th>
					<td><script type="text/javascript">ComComboObject('ofc_cd', 1, 120, 1, 0, 0);</script></td>
					<th>Module</th>
					<td><%= com.clt.bizcommon.util.BizComUtil.getCodeCombo("sub_sys_cd", "", "", "SUBSYS",2, "0:") %></td>
				</tr>
			</tbody>
		</table>
	</div>
	</div>

	<%-- Content area. --%>
	<div class="wrap_result">	
		<div class="opus_design_grid">
			<script type="text/javascript">ComSheetObject("sheet");</script>
		</div>
	</div>
	</form>
