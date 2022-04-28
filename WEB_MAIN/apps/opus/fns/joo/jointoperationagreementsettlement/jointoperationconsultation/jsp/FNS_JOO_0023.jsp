<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : fns_joo_0023.js
*@FileTitle  : CSR Approval
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/21
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
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.jointoperationconsultation.event.FnsJoo0023Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0023Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.JointOperationConsultation");

	String csrNo = "";
	String editable = "N";
	String sysdate = JSPUtil.getKST("yyyyMMddHHmmss");
	String ofcCd = "";
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		ofcCd     = account.getOfc_cd();

		event = (FnsJoo0023Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		csrNo      = StringUtil.xssFilter(request.getParameter("csrNo"))      == null ? ""  : StringUtil.xssFilter(request.getParameter("csrNo"));
		editable   = StringUtil.xssFilter(request.getParameter("editable"))   == null ? "N" : StringUtil.xssFilter(request.getParameter("editable"));

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

<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="apro_dt" id="apro_dt" />
<input type="hidden" name="sysdate" value="<%=sysdate%>" id="sysdate" />
<input type="hidden" name="old_apro_dt" id="old_apro_dt" />
<input type="hidden" name="evid_tp_cd" id="evid_tp_cd" />
<input type="hidden" name="ofc_cd" value="<%=ofcCd%>" id="ofc_cd" />
<input type="hidden" name="apro_rqst_no" id="apro_rqst_no" />
<!-- 2010.01.27 Approval Step -->
<input type="hidden" name="aproSeqKey" id="aproSeqKey" />
<input type="hidden" name="apro_step" id="apro_step" />

<!-- 2010.03.16 BackEndJob을 위한 Field -->
<input type="hidden" name="key" id="key" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<h2 class="page_title"><span>CSR Approval Main</span></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<!--<button class="btn_accent" name="btn_apro_step_view" id="btn_apro_step_view" type="button">View Approval Step</button>--><!--
		--><!--<button class="btn_normal" name="btn_apro_step_edit" id="btn_apro_step_edit" type="button">Edit Approval Step</button>  --><!--
		--><button class="btn_normal" name="btn_save" id="btn_save" type="button">Save</button><!--
		--><button class="btn_normal" name="btn_evd" id="btn_evd" type="button" style="display:none;">Evidence</button><!--
		--><button class="btn_normal" name="btn_csr" id="btn_csr" type="button">CSR Detail</button><!--
		--><button class="btn_normal" name="btn_close" id="btn_close" type="button">Close</button>
	</div>
	<!-- opus_design_btn (E) -->
</div>
<!-- page_title_area(E) -->
<!-- opus_design_grid(S) -->
<div class= "wrap_search bg">
	<div class= "opus_design_inquiry wFit">
		<table>
			<tbody>
				<colgroup>
					<col width="100"/>
					<col width="*"/>
			    </colgroup>
			    <tr>
					<th>CSR No.</th>
					<td><input type="text" style="width:160px;" class="input2" name="csr_no" value="<%=csrNo%>" readonly id="csr_no" onkeypress="csr_no_keypress();"/></td>
				</tr> 
			</tbody>
		</table>
	</div>
</div>
<!-- opus_design_grid(E) -->
<!-- opus_design_grid(S) -->
<div class= "wrap_search bg">
	<div class= "opus_design_inquiry wFit">
		<table>
			<tbody>
				<colgroup>
					<col width="100"/>
					<col width="*"/>
			    </colgroup>
			    <tr>
					<th>Issue Type</th>
					<td><input type="text" style="width:160px;" class="input2" value="JOO TRANSFER SLIP" readonly /></td>
				</tr> 
			</tbody>
		</table>
		<table>
			<tbody>
				<colgroup>
					<col width="100"/>
					<col width="80"/>
					<col width="60"/>
					<col width="80"/>
					<col width="60"/>
					<col width="80"/>
					<col width="60"/>
					<col width="80"/>
					<col width="60"/>
					<col width="*"/>
			    </colgroup>
			    <tr>
					<th>Issue Team</th>
					<td><input type="text" style="width:80px;" class="input2" name="slp_team_cd" readonly id="slp_team_cd" /></td>
					<th>Issue Date</th>
					<td><input type="text" style="width:80px;text-align:center" class="input2" name="slp_iss_dt" dataformat="ymd" readonly id="slp_iss_dt" /><!--  
					--><button type="button" id="btn_cal_iss" name="btn_cal_iss" class="calendar ir"></button></td>
					<th>Req. Date</th>
					<td><input type="text" style="width:80px;text-align:center" class="input2" name="rqst_dt" dataformat="ymd" readonly id="rqst_dt" /><!--  
					--><button type="button" id="btn_cal_rqt" name="btn_cal_rqt" class="calendar ir"></button></td>
					<th>Eff. Date</th>
					<td><input type="text" style="width:80px;text-align:center" class="input2" name="eff_dt" dataformat="ymd" readonly id="eff_dt" /><!--  
					--><button type="button" id="btn_cal_eff" name="btn_cal_eff" class="calendar ir"></button></td>
					<th>Issuer</th>
					<td><input type="text" style="width:110px;" class="input2" name="issuer" readonly id="issuer" /></td>
				</tr> 
			</tbody>
		</table>
		<table>
			<tbody>
				<colgroup>
					<col width="100"/>
					<col width="*"/>
			    </colgroup>
			    <tr>
					<th>&nbsp;Description</th>
					<td><input type="text" style="width:799px;" class="input2" name="csr_desc" readonly id="csr_desc" /> </td>
				</tr> 
			</tbody>
		</table>
		<table>
			<tbody>
				<colgroup>
					<col width="100"/>
					<col width="*"/>
			    </colgroup>
			    <tr>
					<th>VNDR/Customer</th>
					<td><input type="text" style="width:100px;" class="input2" name="vndr_cust_seq" readonly id="vndr_cust_seq" /><!--  
					--><input type="text" style="width:695px;" class="input2" name="lgl_eng_nm" readonly id="lgl_eng_nm" /></td>
				</tr> 
			</tbody>
		</table>
		<table>
			<tbody>
				<colgroup>
					<col width="100"/>
					<col width="80"/>
					<col width="60"/>
					<col width="*"/>
			    </colgroup>
			    <tr>
					<th>CUR</th>
					<td><input type="text" style="width:100px;" class="input2" name="csr_locl_curr_cd" readonly id="csr_locl_curr_cd" /></td>
					<th>Amount</th>
					<td><input type="text" style="width:100px;text-align:right" class="input2" dataformat="float" name="csr_locl_amt" readonly id="csr_locl_amt" /></td>
				</tr> 
			</tbody>
		</table>
		<table style="display:none;">
			<tbody>
				<colgroup>
					<col width="100"/>
					<col width="*"/>
			    </colgroup>
			    <tr>
					<th>Evidence Type</th>
					<td><input type="text" style="width:100px;" class="input2" name="evid_tp_nm" readonly id="evid_tp_nm" /></td>
				</tr> 
			</tbody>
		</table>
		<table>
			<tbody>
				<colgroup>
					<col width="100"/>
					<col width="40"/>
					<col width="60"/>
					<col width="80"/>
					<col width="60"/>
					<col width="40"/>
					<col width="80"/>
					<col width="*"/>
			    </colgroup>
			    <tr>
					<th>Approval</th>
					<td><input type="radio" value="Y" class="trans" name="apro_flg" checked id="apro_flg" />&nbsp;Yes</td>
					<td><input type="radio" value="N" class="trans" name="apro_flg" id="apro_flg" />&nbsp;No</td>
					<td>&nbsp;</td>
					<th>Cancel</th>
					<td><input type="radio" value="Y" class="trans" name="cxl_flg" id="cxl_flg" />&nbsp;Yes</td>
					<td><input type="radio" value="N" class="trans" name="cxl_flg" checked id="cxl_flg" />&nbsp;No</td>
					<td>&nbsp;</td>
				</tr> 
			</tbody>
		</table>
		<table>
			<tbody>
				<colgroup>
					<col width="100"/>
					<col width="*"/>
			    </colgroup>
			    <tr>
					<th>Cancel Reason</th>
					<td><input type="text" style="width:799px;" class="input2" name="cxl_desc" readonly id="cxl_desc" /></td>
				</tr> 
			</tbody>
		</table>
	</div>
</div>
<!-- opus_design_grid(E) -->
<div class="wrap_result">
	<div class="opus_design_grid" >	
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>		
</div>
</form>