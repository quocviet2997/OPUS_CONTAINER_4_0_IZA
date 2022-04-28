<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_COM_0003.jsp
*@FileTitle  : CNTR Size Common Pop-up
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/28
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.cntrsize.event.ComCom0003Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.framework.component.util.StringUtil" %>

<%
	ComCom0003Event event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String mdm_yn 			= "";
	Logger log = Logger.getLogger("com.clt.apps.BizCommon.Account");


	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (ComCom0003Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		mdm_yn = StringUtil.xssFilter(request.getParameter("mdm_yn"));

	}catch(Exception e) {
		log.error(e.toString());
	}
%>
<script type="text/javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="mdm_yn" value="<%=mdm_yn%>" id="mdm_yn" />
<!-- 개발자 작업	-->
<!-- page_title_area(S) -->
<div class="page_title_area clear">

	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button">Container Size Code Inquiry</button></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" type="button" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
		--><button class="btn_normal" type="button" name="btn2_Down_Excel" id="btn2_Down_Excel" >Down Excel</button><!--
		--><button class="btn_normal" type="button" name="btn_New" id="btn_New" >New</button><!--
		--><button class="btn_normal" type="button" name="btn_select" id="btn_select" >OK</button><!--
		--><button class="btn_normal" type="button" name="btn_close" id="btn_close" >Close</button><!--
		--></div>
	<!-- opus_design_btn (E) -->
</div>
<!-- page_title_area(E) -->
<!-- wrap_search(S) -->
<div class="wrap_search">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry wFit">
		<table>
			<colgroup>
				<col width="50" />				
				<col width="100" />				
				<col width="80" />				
				<col width="290" />				
				<col width="50" />				
				<col width="*" />				
		   </colgroup> 
		   <tbody>
		   		<tr>
					<% if("Y".equals(mdm_yn)){	%>
						<th>Code</th>
						<td><input type="text" name="cntr_sz_cd" id="cntr_sz_cd" dataformat="engup" style="width:60px;ime-mode:disabled" maxlength="2" class="input" value="<%=(request.getParameter("cntr_sz_cd") == null) ? "" : request.getParameter("cntr_sz_cd") %>"></td>
						<th>Description</th>
						<td><input type="text" name="cntr_sz_desc" id="cntr_sz_desc" dataformat="engupetc" style="width:270px;ime-mode:disabled" maxlength="100" class="input"  value="<%=(request.getParameter("cntr_sz_desc") == null) ? "" : request.getParameter("cntr_sz_desc") %>"></td>					
						<th>Status</th>
						<td><script type="text/javascript">ComComboObject('delt_flg', 1, 100, 1, 0 ,0 ,false)</script></td>
					<% }else{%>
						<th>Code</th>
						<td><input type="text" name="cntr_sz_cd" id="cntr_sz_cd" dataformat="engup" style="width:60;ime-mode:disabled" maxlength="2" class="input" value="<%=(request.getParameter("cntr_sz_cd") == null) ? "" : request.getParameter("cntr_sz_cd") %>"></td>
						<th>Description</th>
						<td><input type="text" name="cntr_sz_desc" id="cntr_sz_desc" dataformat="engupetc" style="width:270;ime-mode:disabled" maxlength="100" class="input"  value="<%=(request.getParameter("cntr_sz_desc") == null) ? "" : request.getParameter("cntr_sz_desc") %>"></td>					
						<td></td>
						<td></td>
					<% }%>	
		   		</tr>
		   </tbody>
		</table>
	</div>
	<!-- opus_design_inquiry(E) -->
</div>
<!-- wrap_search(E) -->
<!-- wrap_result(S) -->
<div class="wrap_result">
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid">
		<script type="text/javascript">ComSheetObject('sheet1');</script>		
	</div>
	<!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->
</form>
<%@ include file="/bizcommon/include/common_alps.jsp"%>