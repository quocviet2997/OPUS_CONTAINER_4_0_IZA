<%
/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : fns_joo_0069.jsp
 *@FileTitle: CSR Inquiry ? CSR Details POP UP Screen
 *@author   : CLT
 *@version  : 1.0
 *@since    : 2014/06/19
 =========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.util.StringUtil"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.jointoperationconsultation.event.FnsJoo0069Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0069Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	
	String csrNo = StringUtil.xssFilter(request.getParameter("csrNo"))      == null ? ""  : StringUtil.xssFilter(request.getParameter("csrNo"));
	String gubun = StringUtil.xssFilter(request.getParameter("gubun"))      == null ? ""  : StringUtil.xssFilter(request.getParameter("gubun"));//slp_iss_dt, eff_dt
	String fr_dt = StringUtil.xssFilter(request.getParameter("fr_dt"))      == null ? ""  : StringUtil.xssFilter(request.getParameter("fr_dt"));
	String to_dt = StringUtil.xssFilter(request.getParameter("to_dt"))      == null ? ""  : StringUtil.xssFilter(request.getParameter("to_dt"));
	
	
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.JointOperationConsultation");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0069Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
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

<form name="form" id="form">
<input type="hidden" name="f_cmd" id="f_cmd">
<input type="hidden" name="pagerows" id="pagerows">

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<h2 class="page_title">CSR Inquiry - CSR Details</button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" name="btn_Close" id="btn_Close" type="button">Close</button>
	</div>
	<!-- opus_design_btn (E) -->	
	<!-- page_location(S) -->
	<div class="location">
		<span id="navigation"></span>
	</div>
</div>
<!-- page_title_area(E) -->


<div class= "wrap_search">
<!-- opus_design_inquiry(S) -->
	<div class= "opus_design_inquiry sm">
		<table style="width:979px">
			<tbody>
				<colgroup>
					<col width="350"/>
					<col width="70"/>
					<col width="60"/>
					<col width="80"/>
					<col width="*"/>
			    </colgroup>
				<tr>
					<td class="sm pad_left_8"><input type="radio" name="gubun" id="gubun" value="slp_iss_dt" class="trans" <%= gubun.equals("slp_iss_dt") ? "checked" : "" %> >&nbsp;&nbsp;<b>품의일</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<!-- 
						 --><input type="radio" name="gubun" id="gubun" value="eff_dt" class="trans" <%= gubun.equals("eff_dt") ? "checked" : "" %>>&nbsp;&nbsp;<b>EFF, DT</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<!-- 
						  --><input type="text" style="width:80px;" value="<%=fr_dt %>" name="fr_dt" class="input1" readonly id="fr_dt" /><!-- 
						 -->&nbsp;<b>~</b>&nbsp;&nbsp;<input type="text" style="width:80px;" value="<%=to_dt %>" name="to_dt" class="input1" readonly id="to_dt" />
					</td>
					<th>Team</th>
					<td>
						<input type="text" style="width:60px;" class="input" name="slp_ofc_cd_sel" value="" readonly="" id="slp_ofc_cd_sel" />
					</td>
					<th>CSR NO.</th>
					<td><input type="text" style="width:170px;" class="input" name="csr_no" value="<%=csrNo %>" readonly id="csr_no" /> </td>
				</tr> 
			</tbody>
		</table>
		<table class="height_10"><tr><td colspan="8"></td></tr></table>

	</div>
</div>

<!-- opus_design_grid(S) -->
<div class="wrap_result">
	<div class="opus_design_grid" >			
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
	
</div>
<!-- opus_design_grid(E) -->

</form>
  
