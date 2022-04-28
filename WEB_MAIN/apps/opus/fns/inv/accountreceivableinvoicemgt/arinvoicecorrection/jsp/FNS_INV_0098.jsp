<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : fns_inv_0098.jsp
*@FileTitle  : Container No
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/22
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.arinvoicecorrection.event.FnsInv0098Event"%>
<%@ page import="org.apache.log4j.Logger"%>
<%@ page import="com.clt.framework.component.util.StringUtil" %>
<%
	FnsInv0098Event event = null; //PDTO(Data Transfer Object including Parameters)
	Exception serverException = null; 
	String strErrMsg = ""; 
	int rowCount = 0; 

	String successFlag = "";
	String codeList = "";
	String pageRows = "100";

	String strUsr_id = "";
	String strUsr_nm = "";
	String pageType = "";
	String arIfNo = "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMgt.ARInvoiceInquiry");

	try {
		SignOnUserAccount account = (SignOnUserAccount) session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id = account.getUsr_id();
		strUsr_nm = account.getUsr_nm();

		event = (FnsInv0098Event) request.getAttribute("Event");
		serverException = (Exception) request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

		pageType = StringUtil.xssFilter(request.getParameter("pagetype")) != null ? StringUtil.xssFilter(request.getParameter("pagetype")) : "";
		arIfNo = StringUtil.xssFilter(request.getParameter("arIfNo")) != null ? StringUtil.xssFilter(request.getParameter("arIfNo")) : "";

	} catch (Exception e) {
		out.println(e.toString());
	}
%>
<script type="text/javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			showErrMessage(errMessage);
		} // end if
		loadPage();
	}
</script>
<form name="form"><input type="hidden" name="f_cmd"> 
<input type="hidden" name="pagerows">
<input type="hidden" name="pagetype" value="<%=pageType%>"> 
<input	type="hidden" name="cntr_no"> 
<input type="hidden" name="cntr_tpsz_cd"> 
<input type="hidden" name="ar_if_no" value="<%=arIfNo%>"> <!-- OUTER - POPUP (S)tart -->
<!-- popup_title_area(S) -->
 <div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title"><span>Container Info.</span></h2>
		<!-- page_title(E) -->
			
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn"><!--
		--><button type="button" class="btn_accent" name="btn_OK" id="btn_OK">OK</button><!--
		--><button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button></div>
		<!-- opus_design_btn(E) -->	
	</div>
	<!-- page_title_area(E) -->
</div>
<!-- popup_title_area(E) -->
<!-- popup_contens_area(S) -->
<div class="layer_popup_contents">
<!-- wrap_result(S) -->
<div class="wrap_result">
	<!-- inquiry_area(S) -->
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid" >
		<!-- opus_grid_design_btn(S) -->
		<div class="opus_design_grid">
			<%
				if (pageType.equals("E")) {
			%>
			<!-- opus_grid_btn(S) -->
			<div class="opus_design_btn">
				<button type="button" class="btn_accent" name="btn_add" id="btn_add">Row Add</button>
			</div>
			<% } %>
			<!-- opus_grid_btn(E) -->
		</div>
		<script type="text/javascript">ComSheetObject('sheet1');</script>
		<!-- opus_grid_design_btn(E) -->
	</div>
	<!-- opus_design_grid(E) -->
</div>
<!-- popup_contens_area(E) -->
</div>
</form>