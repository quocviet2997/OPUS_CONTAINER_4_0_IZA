<%--
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : UI_COM_SYS_008.jsp
*@FileTitle  : 역할 매핑 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/24
=========================================================*/
--%>

<%@page import="com.clt.framework.component.util.StringUtil"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.management.opus.role.event.ComSys008Event"%>
<%
	ComSys008Event  event = null;
	GeneralEventResponse eventResponse = null;
	DBRowSet rowSet	  = null;
	int rowCount	 = 0;
	Exception serverException   = null;			//서버에서 발생한 에러

	String strErrMsg = "";								 //에러메세지
	String strErrCode = "";

	String login_usr_auth_tp_cd = "";
	String usr_auth_tp_cd = "";
	String usr_role_adm_mtch = "";
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
	   	login_usr_auth_tp_cd  = account.getUsr_auth_tp_cd();

		event = (ComSys008Event)request.getAttribute("Event");		

		if(event != null){ 
	    	usr_role_adm_mtch = event.getUsrRoleAdmMtch();
	    	usr_auth_tp_cd = event.getUsrAuthTpCd();
		}
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		if (serverException != null) {
		    ErrorHandler errHndlr = new ErrorHandler(serverException);
				strErrMsg = errHndlr.loadPopupMessage();
				strErrCode = errHndlr.getCode();
		}else{
			eventResponse = (GeneralEventResponse)request.getAttribute("EventResponse");
			if (eventResponse != null) {
				rowSet = eventResponse.getRs();
				if(rowSet != null){
					 rowCount = rowSet.getRowCount();
				} // end if
			} // end if
		}// end else
	}catch(Exception e) {
	    out.println(e.getMessage());
	}
%>

<%@page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>

<!-- <link href="css/alps_menu.css" rel="stylesheet" type="text/css">
<link href="css/alps_contents.css" rel="stylesheet" type="text/css"> -->
<script type="text/javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
    	var errCode = "<%=strErrCode%>";
    	if (errMessage.length >= 1) {
        	ComShowMessage(errMessage);
    	} // end if
    	if(errCode=="COM10004"){
    		opener.top.signature('On');
    		self.close();
    	}else{
        	loadPage();
    	}
	}

</script>

<form method="post" name="form" onSubmit="return false;">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="iPage" id="iPage" />
<input type="hidden" name="login_usr_auth_tp_cd" value="<%=login_usr_auth_tp_cd%>" id="login_usr_auth_tp_cd" />
<input type="hidden" name="usr_auth_tp_cd" value="<%=usr_auth_tp_cd%>" id="usr_auth_tp_cd" />
<input type="hidden" name="usr_role_adm_mtch" value="<%=usr_role_adm_mtch%>" id="usr_role_adm_mtch" />
<input type="hidden" name="admin_page" id="admin_page" value="<%=StringUtil.xssFilter(request.getParameter("admin_page")) %>">
<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title"><span>User Role History</span>
			
	</h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
		<button type="button" class="btn_normal" name="btn_DownExcel" 	id="btn_DownExcel">Down Excel</button>
		<button type="button" class="btn_normal" name="btn_close" 	id="btn_close">Close</button>
	</div>
	<!-- opus_design_btn(E) -->

	<!-- page_location(S) -->
	<div class="location">
		<!-- location 내용 동적생성 (별도 코딩 불필요) -->
		<span id="navigation"></span>
	</div>
</div>
<!-- page_title_area(E) -->

<div class= "wrap_search">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry wFit">
		<table>
			<colgroup>
				<col width="80" />
				<col width="150" />
				<col width="75" />
				<col width="*" />
			</colgroup>
			<tbody>
				<tr>
		           <th>User ID</th>
		           <td><input type="text" style="width:70px;" class="input" required name="usr_id" maxlength="4" readonly id="usr_id" /></td>
		           <th>User Name</th>
		           <td><input type="text" style="width:150px;" class="input" value="" name="usr_nm" maxlength="30" readonly id="usr_nm" /></td>
		       	 </tr>
			</tbody>
		</table>
	</div>
	<!-- opus_design_inquiry(E) -->
</div>		
<div class="wrap_result">
	<div class="opus_design_grid clear" id="mainTable">
		<h3 class="title_design">Role History</h3>
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
</div>	
</form>
	
<SCRIPT type="text/javascript">
<!--
    with(document.form)
    {
    <%
    if(event != null){ 
    	String usrId   = event.getUsrId();
      String usrNm   = event.getUsrNm();

    %>
    eval("usr_id" ).value = "<%= usrId   %>";
    eval("usr_nm" ).value = unescape("<%= usrNm   %>");
    <% } %>
     }
-->
</SCRIPT>