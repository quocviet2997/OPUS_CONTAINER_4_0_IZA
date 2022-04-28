<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0061.jsp
*@FileTitle  : Credit Customer Inquiry
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
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.partner.event.BcmCcd0061Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.framework.component.util.StringUtil" %>

<%
	BcmCcd0061Event  event = null;					//PDTO(Data Transfer Object including Parameters)
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

	String cust_cnt_cd = StringUtil.xssFilter(request.getParameter("cust_cnt_cd"));
	if(cust_cnt_cd == null){
		cust_cnt_cd = "";
	}
	
	String cust_seq = StringUtil.xssFilter(request.getParameter("cust_seq"));
	if(cust_seq == null){
		cust_seq = "";
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

		event = (BcmCcd0061Event)request.getAttribute("Event");
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
		<h2 class="page_title"><span>Credit Customer Inquiry</span></h2>
		<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!-- 
			--><button type="button" class="btn_normal" name="btn_downexcel" id="btn_downexcel">Down Excel</button><!-- 
			--><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!-- 
			--><button type="button" class="btn_normal" name="btn_apply" id="btn_apply">OK</button><!-- 
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
						<td><input name="cust_cnt_cd" id="cust_cnt_cd" value="<%=cust_cnt_cd %>" type="text" style="width:30px; text-align:center;ime-mode:disabled" class="input" maxlength='2' dataformat="engup" onKeyup="moveNext('cust_cnt_cd','cust_seq',2);">
							<input name="cust_seq" id="cust_seq" value="<%=cust_seq %>" type="text" style="width:82px; text-align:left;ime-mode:disabled" class="input" maxlength='6' dataformat="engup">
						</td>
						<th>Control Office</th>
						<td><input name="cr_clt_ofc_cd" id="cr_clt_ofc_cd" type="text" style="width:80px; text-align:left;ime-mode:disabled" class="input" maxlength='5' dataformat="engup"></td>
						<th>Customer Name</th>
						<td><input name="cust_lgl_eng_nm" id="cust_lgl_eng_nm" type="text" style="width:200px; text-align:left;ime-mode:disabled" class="input"></td>
					</tr>
					<tr>
						<th>Credit Agreement No</th>					
						<td><input name="cust_agmt_no" id="cust_agmt_no" type="text" style="width:120px; text-align:left;ime-mode:disabled" class="input" maxlength='20'></td>
						<th>Contract No</th>   
						<td colspan="3"><input type="text" name="ctrt_no" id="ctrt_no" style="width:120px;" class="input"></td>
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