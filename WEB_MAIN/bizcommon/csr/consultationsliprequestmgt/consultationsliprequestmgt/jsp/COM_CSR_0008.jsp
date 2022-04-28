<%
/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_CSR_0008.jsp
*@FileTitle  : CSR Interface Status
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/17
=========================================================
*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.event.ComCsr0008Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	ComCsr0008Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//Error from server
	String strErrMsg = "";						//Error message
	int rowCount	 = 0;						//The count of DB ResultSet list
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";
	String strUsr_id		= "";
	String strUsr_nm		= "";
	String ofc_cd  			= ""; 
	String cnt_cd 	 		= "";
	String inv_sub_sys_cd = "";
	inv_sub_sys_cd 			= JSPUtil.getParameter(request, "INV_SUB_SYS_CD".trim(), "");
	Logger log = Logger.getLogger("com.clt.apps.ConsultationSlipRequestMgt.ConsultationSlipRequestMgt");
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
	    ofc_cd	  = account.getOfc_cd();
	    cnt_cd 	  = account.getCnt_cd();
		event = (ComCsr0008Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
	} catch(Exception e) {
		out.println(e.toString());
	}
	String readonly_yn = null;
	String csr_no = null;
	String inv_no = null;
	readonly_yn = JSPUtil.getParameter(request,"readonly_yn".trim(),"");
	csr_no		= JSPUtil.getParameter(request,"csr_no".trim(),"");
	inv_no		= JSPUtil.getParameter(request,"inv_no".trim(),"");
%>

<script type="text/javascript" type="text/javascript" src="bizcommon/csr/CoCsr.js"></script>
<script type="text/javascript">
	var cnt_cd = "<%=cnt_cd%>";	
	var readonly_yn = "<%=readonly_yn%>";	
	var ofc_cd = "<%=ofc_cd%>";	
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form">
<input id="f_cmd" name="f_cmd" type="hidden" />
<input id="csr_no" name="csr_no" type="hidden" />
<input id="inv_no" name="inv_no" type="hidden" />
<input id="inv_sub_sys_cd" name="inv_sub_sys_cd" value="<%=inv_sub_sys_cd%>" type="hidden" />
<input id="aproSeqKey" name="aproSeqKey" type="hidden" />
<input id="apro_step" name="apro_step" value="<%=com.clt.bizcommon.approval.util.ApprovalUtil.getApprovalRoute(ofc_cd, inv_sub_sys_cd) %>" type="hidden" />
<input type="hidden" name="DB_DATE" id="DB_DATE" value=''>

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title">
		<button type="button"><span id="title"></span></button>
	</h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button type="button" id="btng_retrieve" name="btng_retrieve" class="btn_accent">Retrieve</button><!--
		--><button type="button" id="btng_new" name="btng_new" class="btn_normal">New</button><!--
		--><button type="button" id="btng_print" name="btng_print" class="btn_normal">Down Excel</button><!--
		<button type="button" id="btng_editapprovalstep" name="btng_editapprovalstep" class="btn_normal">Edit Approval Step</button>-->
		<button type="button" id="btng_viewapprovalstep" name="btng_viewapprovalstep" class="btn_normal">View Approval Step</button>
		<button type="button" id="btng_csrformat" name="btng_csrformat" class="btn_normal">CSR Format</button><!--
		--><button type="button" id="btng_invoicelistinquiry" name="btng_invoicelistinquiry" class="btn_normal">Invoice List Inquiry</button><!--
		--><button type="button" id="btng_csrcancel" name="btng_csrcancel" class="btn_normal">CSR Cancel</button>
	</div>
	<!-- opus_design_btn (E) -->
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn" style="display: none;">
		<button type="button" id="btng_retrieve" name="btng_retrieve" class="btn_accent">Retrieve</button><!--
		--><button type="button" id="btng_new" name="btng_new" class="btn_normal">New</button><!--
		--><button type="button" id="btng_print" name="btng_print" class="btn_normal">Down Excel</button><!--
		<button type="button" id="btng_editapprovalstep" name="btng_editapprovalstep" class="btn_normal">Edit Approval Step</button>
		<button type="button" id="btng_viewapprovalstep" name="btng_viewapprovalstep" class="btn_normal">View Approval Step</button>
		--><button type="button" id="btng_csrformat" name="btng_csrformat" class="btn_normal">CSR Format</button><!--
		--><button type="button" id="btng_invoicelistinquiry" name="btng_invoicelistinquiry" class="btn_normal">Invoice List Inquiry</button>
	</div>
	<!-- opus_design_btn (E) -->
	<!-- page_location(S) -->
	<div class="location">
		<!-- location 내용 동적생성 (별도 코딩 불필요) -->
		<span id="navigation"></span>
	</div>
</div>
<!-- page_title_area(E) -->


<div class="wrap_search">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry wFit">
		<table>
			<tbody>
				<colgroup>
					<col width="1" />
					<col width="70" />
					<col width="50" />
					<col width="70" />
					<col width="70" />
					<col width="70" />
					<col width="*" />
				</colgroup>
				<tr>	
					<th>Invoice Office</th>
					<td><input id="ofc_cd" name="ofc_cd" maxlength="6" style="width: 60px;" class="input2" value="<%=ofc_cd%>" onkeyup="csr_isApNum(this); this.value=this.value.toUpperCase();" onkeydown="csr_chkInput(this); this.value=this.value.toUpperCase();" readonly type="text" /> </td>
					<th>Date</th>
					<td>
						<select style="width: 145px;" name='dt_status'>
							<option value="AR">Approval Requested</option>
							<option value="AV">Approved or Disapproved</option>
							<option value="IU">I/F Status Updated</option>
						</select><!-- 
				      --><input id="fm_eff_dt" style="width:75px; text-align:center; ime-mode:disabled" dataformat="ymd" maxlength="8" class="input" name="fm_eff_dt" value="" type="text" />~ <input id="to_eff_dt" style="width:75px;text-align:center;ime-mode:disabled" dataformat="ymd" class="input" name="to_eff_dt" value="" type="text" /><button class="calendar ir" name="btns_Calendar2" id="btns_Calendar2" type="button"></button>
					</td>
					<th>I/F Status</th>
					<td>
						<select style="width: 125px;" name='if_status' id='if_status'>
							<option value="AL" selected>All</option>
							<option value="AR">Approval Requested</option>
							<option value="SD">Sending</option>
							<option value="DA">Disapproved</option>
							<option value="IE">I/F Error</option>
							<option value="RJ">A/P Rejected</option>
							<option value="SC">I/F Success</option>
							<option value="SP">Paid</option>
						</select><!-- 
			      	 --><select style="width: 100px;" name='if_no' id='if_no'>
							<option value="CSR" selected>CSR No</option>
							<option value="INV">INV No</option>
						</select><input id="search_csr_no" name="search_csr_no" maxlength="20" style="width: 100px;" value="<%=csr_no%>" onkeypress="csr_enterCheck("retrieve");" onblur="this.value=this.value.trim();" type="text" />
						
					</td>		
				
					<td>
					</td>

				</tr>
			</tbody>
		</table>
	</div>
	<!-- opus_design_inquiry(E) -->
</div>

<div class="wrap_result">
<!-- opus_design_grid(S) -->
    <div class="opus_design_grid">
        <script type="text/javascript">ComSheetObject('sheet1');</script>
    </div>
<!-- opus_design_grid(E) -->

<!-- opus_design_grid(S) -->
    <div class="opus_design_grid" style="display: none;">
        <script type="text/javascript">ComSheetObject('sheet2');</script>
    </div>
<!-- opus_design_grid(E) -->

<!-- opus_design_grid(S) -->
    <div class="opus_design_grid" style="display: none;">
        <script type="text/javascript">ComSheetObject('sheet3');</script>
    </div>
<!-- opus_design_grid(E) -->
</div>
	
</form>