<%
/*=========================================================
*Copyright(c) 2009 CyberLogitec. All Rights Reserved.
*@FileName   FNS_JOO_0068.jsp
*@FileTitle  : CSR Inquiry Detail
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/05
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
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.jointoperationconsultation.event.FnsJoo0068Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0068Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.JointOperationConsultation");
	String cost_ofc_cd = "";
	String inv_sub_sys_cd = "JOO";

	String csrNo = "";
	String approvalStep = "";
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		cost_ofc_cd = account.getOfc_cd();


		event = (FnsJoo0068Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

		csrNo = StringUtil.xssFilter(request.getParameter("csrNo")) == null ? "" : StringUtil.xssFilter(request.getParameter("csrNo"));
		//retrieving approval step with CSR number. if not exists, retrieving default saved data.
		approvalStep = com.clt.bizcommon.approval.util.ApprovalUtil.getApprovalRouteByCsrNo(csrNo);
		if (approvalStep == null || "".equals(approvalStep)){
			approvalStep = com.clt.bizcommon.approval.util.ApprovalUtil.getApprovalRoute(cost_ofc_cd, inv_sub_sys_cd);
		}		
	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<script type="text/javascript">
	var gOfcCd = "<%=cost_ofc_cd%>";

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
<input type="hidden" name="rvs_csr_flg" id="rvs_csr_flg" />
<input type="hidden" name="rvs_cmb_flg" id="rvs_cmb_flg" />
<input type="hidden" name="evid_tp_cd" id="evid_tp_cd" />
<input type="hidden" name="clz_sts_cd" id="clz_sts_cd" />
<!-- Input Box for Report Designer -->
<input type="hidden" name="com_mrdPath" value="" id="com_mrdPath" />
<input type="hidden" name="com_mrdArguments" value="" id="com_mrdArguments" />

<input type="hidden" name="com_mrdBodyTitle" value="CSR Inquiry Detail" id="com_mrdBodyTitle" />

<input type="hidden" name="com_mrdSaveDialogFileExt" value="ppt" id="com_mrdSaveDialogFileExt" />
<input type="hidden" name="com_mrdSaveDialogFileExtLimit" value="xls@pdf@doc@ppt" id="com_mrdSaveDialogFileExtLimit" />
<input type="hidden" name="com_mrdSaveDialogFileName" value="CSR Inquiry Detail" id="com_mrdSaveDialogFileName" />
<input type="hidden" name="com_mrdSaveDialogDir" value="" id="com_mrdSaveDialogDir" />
<!-- 2010.01.27 Approval Step -->
<input type="hidden" name="aproSeqKey" id="aproSeqKey" />
<input type="hidden" name="apro_step" id="apro_step" />
<!-- NYK Modify 2014.11.07 -->
<input type="hidden" name="evid_tp_nm" id="evid_tp_nm" />
<input type="hidden" name="evid_vol" id="evid_vol" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<h2 class="page_title"><span>CSR Inquiry Detail</span></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" name="btn_reverse" id="btn_reverse" type="button" auth="C" style="display:none;">Reverse</button><!--
		--><button class="btn_accent" name="btn_cancel" id="btn_cancel" type="button" auth="E">AP Cancel</button><!--
		--><button class="btn_normal" name="btn_evd" id="btn_evd" type="button" auth="U" style="display:none;">Evidence</button><!--
		--><button class="btn_normal" name="btn_csr" id="btn_csr" type="button" auth="P">CSR Detail</button><!--
		--><button class="btn_normal" name="btn_print" id="btn_print" type="button" auth="P" style="display:none;">Print</button><!--
		--><button class="btn_normal" name="btn_close" id="btn_close" type="button" auth="R">Close</button>
	</div>
	<!-- opus_design_btn (E) -->
</div>
<!-- page_title_area(E) -->

<div class="wrap_search">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry wFit">
		<table>
			<tbody>
				<colgroup>
					<col width="55">
					<col width="*">
				</colgroup>
				<tr>
					<th>CSR No.</th>
					<td><input type="text" style="width:170px;" class="input2" name="csr_no" id="csr_no" maxlength="20" dataformat="engup" value="<%=csrNo%>" readOnly></td>
				</tr>
			</tbody>
		</table>
	</div>
	<!-- opus_design_inquiry(E) -->

	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry wFit">
		<table>
			<tbody>
				<colgroup>
					<col width="160px">
					<col width="130px">
					<col width="100px">
					<col width="160px">
					<col width="120px">
					<col width="*">
				</colgroup>
				<tr>
					<th>Issue Type</th>
					<td colspan="3"><input type="text" style="width:80px;" class="input2" value=" JO CSR" readOnly name="iss_typ" id="iss_typ"></td>
					<th>AR/AP Off-set No.</th>
					<td><input type="text" style="width:100px;" class="input2" name="csr_offst_no" id="csr_offst_no" readOnly></td>
				</tr>
				<tr>
					<th>Issue Team</th>
					<td><input type="text" style="width:80px;" class="input2" name="slp_iss_ofc_cd" id="slp_iss_ofc_cd" readOnly></td>
					<th>Issue Date</th>
					<td><input type="text" style="width:100px;" class="input2" name="slp_iss_dt" id="slp_iss_dt" readOnly></td>
					<th>Issuer</th>
					<td><input type="text" style="width:100px;" class="input2" name="issuer" id="issuer" readOnly></td>
				</tr>
				<tr>
					<th>Description</th>
					<td colspan="5"><input type="text" style="width:610px;" class="input2" name="csr_desc" id="csr_desc" readOnly></td>
				</tr>
				<tr>
					<th>Service Provider Customer</th>
					<td colspan="5"><input type="text" style="width:80px;" class="input2" name="vndr_cust_seq" id="vndr_cust_seq" readOnly><!--  
						--><input type="text" style="width:526px;" class="input2" name="lgl_eng_nm" id="lgl_eng_nm" readOnly></td>
				</tr> 
				<tr>
					<th>Currency</th>
					<td colspan="3"><input type="text" style="width:80px;" class="input2" name="csr_locl_curr_cd" id="csr_locl_curr_cd" readOnly></td>
					<th>Amount</th>
					<td><input type="text" style="width:100px;text-align:right;" class="input2" dataformat="float" name="csr_locl_amt" id="csr_locl_amt" readOnly></td>
				</tr>
				<!-- NYK Modify 2014.11.07 -->
				<!--
				<tr>
					<th>Tax Type</th>
					<td colspan="3"><input type="text" style="width:80px;" class="input2" name="evid_tp_nm" id="evid_tp_nm" readOnly></td>
					<th>Evidence Volume</th>
					<td><input type="text" style="width:100px;" class="input2" name="evid_vol" id="evid_vol" value="1" readOnly></td>
				</tr>
				 -->
				 <tr>
					<th>&nbsp;Approval</th>
					<td><input type="radio" value="Y" class="trans" name="apro_flg" disabled>&nbsp;Yes&nbsp;&nbsp;&nbsp;<!--  
					--><input type="radio" value="N" class="trans" name="apro_flg" disabled>&nbsp;No</td>								
					<th>Eff. Date</th>
					<td><input type="text" style="width:100px;" class="input2" name="eff_dt" id="eff_dt" dataformat="ymd" readOnly></td>
					<th>DUE Date</th>
					<td><input type="text" style="width:100px;" class="input2" name="rqst_dt" id="rqst_dt" dataformat="ymd" readOnly></td>								
				</tr>
				<tr>
					<th>&nbsp;Cancel</th>
					<td><input type="radio" value="Y" class="trans" name="cxl_flg" id="cxl_flg" disabled>&nbsp;Yes&nbsp;&nbsp;&nbsp;<!--  
					--><input type="radio" value="N" class="trans" name="cxl_flg" disabled>&nbsp;No</td>
					<th>Cancel Reason</th>
					<td colspan="3"><input type="text" style="width:380px;" class="input2" name="cxl_desc" id="cxl_desc" readOnly></td>
				</tr>
				<tr>
					<th>&nbsp;Deduct</th>
					<td><input type="radio" value="Y" class="trans" name="ddct_flg" disabled>&nbsp;Yes&nbsp;&nbsp;&nbsp;<!--  
					--><input type="radio" value="N" class="trans" name="ddct_flg" disabled>&nbsp;No</td>
					<th>Actual Request</th>
					<td><input type="text" style="width:100px;text-align:right" class="input2" name="act_rqst_amt" id="act_rqst_amt" dataformat="float" readOnly></td>
					<th>Deduct Amount</th>
					<td><input type="text" style="width:100px;text-align:right" class="input2" name="ddct_locl_amt" id="ddct_locl_amt" dataformat="float" readOnly></td>
				</tr>
			</tbody>
		</table>
		<!-- layout_wrap(E) -->
		<table class="search">
			<tbody>
				<colgroup>
					<col width="160">
					<col width="*">
				</colgroup>
				<tr>
					<th>Deduct Description</th>
					<td><input type="text" style="width:610px;" class="input2" name="ddct_desc" id="ddct_desc" readOnly></td>
				</tr>
			</tbody>
		</table>
	</div>
	<!-- opus_design_inquiry(E) -->
</div>
<div class="wrap_result">
	<div class="opus_design_grid" id="mainTable">
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
</div>
<%@include file="/bizcommon/include/common_opus.jsp"%>
</form>
