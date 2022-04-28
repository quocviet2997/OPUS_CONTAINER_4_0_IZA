<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0063.jsp
*@FileTitle  : Credit Customer History
*@author     : CLT
*@version    : 1.0
*@since      : 2018/12/19
=========================================================
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.partner.event.BcmCcd0063Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.framework.component.util.StringUtil" %>

<%
	BcmCcd0063Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			// Errors from server.
	String strErrMsg = "";						// Error message.
	int rowCount	 = 0;						// DB ResultSet list count

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String loginOfcCd = "";
	Logger log = Logger.getLogger("com.clt.apps.opus.bcm.ccd.commoncode.partner");

	String cust_cd = StringUtil.xssFilter(request.getParameter("cust_cd"));
	if(cust_cd == null){
		cust_cd = "";
	}
	
	String cust_lgl_eng_nm = StringUtil.xssFilter(request.getParameter("cust_lgl_eng_nm"));
	if(cust_lgl_eng_nm == null){
		cust_lgl_eng_nm = "";
	}
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		loginOfcCd = account.getOfc_cd();

		event = (BcmCcd0063Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// Get data from server. ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

	}catch(Exception e) {
		out.println(e.toString());
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
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">

<!-- OUTER - POPUP (S)tart -->

<!-- popup_title_area(S) -->
 <div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title"><span>Credit Customer History</span></h2>
		<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!-- 
			--><button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button>
		</div>
		<!-- opus_design_btn(E) -->	
	</div>
	<!-- page_title_area(E) -->
</div>
<!-- popup_title_area(E) -->
<!-- popup_contens_area(S) -->
<div class="layer_popup_contents">
	<div class="wrap_search">
		<!-- inquiry_area(S) -->
		<div class="opus_design_inquiry wFit">   <!-- no TAB  -->
			<table> 
				<colgroup>
					<col width="100" />
					<col width="150" />
					<col width="100" />
					<col width="120" />
					<col width="120" />
					<col width="*" />
				</colgroup>
				<tbody>
					<tr>
						<th>Customer Code</th>
						<td><input name="cust_cd" id="cust_cd" value="<%=cust_cd %>" type="text" style="width:120px; text-align:center;ime-mode:disabled" class="input1" maxlength='8' dataformat="engup">
							<button type="button" id="btn_cust" name="btn_cust" class="input_seach_btn"></button>
						</td>
						<th>Customer Name</th>
						<td><input name="cust_lgl_eng_nm" id="cust_lgl_eng_nm" type="text" style="width:200px; text-align:left;ime-mode:disabled" class="input"></td>
						<th>Credit Agreement No</th>					
						<td><input name="cust_agmt_no" id="cust_agmt_no" type="text" style="width:120px; text-align:left;ime-mode:disabled" class="input" maxlength="20"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	<!-- inquiry_area(E) -->
	<div class="wrap_result">
		<!-- opus_design_grid(S) -->
		<div class="opus_design_grid" >
			<script type="text/javascript">ComSheetObject('sheet1');</script>
			<!-- opus_grid_design_btn(E) -->
		</div>
		<!-- opus_design_grid(E) -->
	</div>
	<!-- popup_contens_area(E) -->
</div>
</form>

<SCRIPT type="text/javascript">
</SCRIPT>	