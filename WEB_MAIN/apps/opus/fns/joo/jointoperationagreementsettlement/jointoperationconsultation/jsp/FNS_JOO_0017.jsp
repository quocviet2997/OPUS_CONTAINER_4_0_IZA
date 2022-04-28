<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : FNS_JOO_0017.jsp
*@FileTitle  : AP CSR Creation
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/17
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.jointoperationconsultation.event.FnsJoo0017Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0017Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String yyyyMMdd = "";//JSPUtil.getKST("yyyy-MM-dd");
	String yyyyMM   = "";//JSPUtil.getKST("yyyy-MM");
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.JointOperationConsultation");

	String crrCombo   = "";
	String evidTpCode = "";
	String evidTpName = "";
	String csrTpCode  = "";
	String csrTpName  = "";
	String cost_ofc_cd = "";
	String inv_sub_sys_cd = "JOO";
	
	SignOnUserAccount account=null;
	try {
	   	account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		cost_ofc_cd = account.getOfc_cd();
		

		event = (FnsJoo0017Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		crrCombo   = eventResponse.getETCData("jo_crr_cd");
		evidTpCode = eventResponse.getETCData("evidTpCode");
		evidTpName = eventResponse.getETCData("evidTpName");
		csrTpCode  = eventResponse.getETCData("csrTpCode");
		csrTpName  = eventResponse.getETCData("csrTpName");
		yyyyMMdd   = eventResponse.getETCData("localDate");
		yyyyMMdd   = yyyyMMdd.substring(0,4)+"-"+yyyyMMdd.substring(4,6)+"-"+yyyyMMdd.substring(6,8);
		yyyyMM     = yyyyMMdd.substring(0,7);
	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<script type="text/javascript">
var gOfcCd       = "<%=cost_ofc_cd%>";
var gCrrCombo    = "<%=crrCombo%>";
var gEvidTpCode  = "<%=evidTpCode%>";
var gEvidTpName  = "<%=evidTpName%>";
var gCsrTpCode   = "<%=csrTpCode%>";
var gCsrTpName   = "<%=csrTpName%>";
var gYYYYMM      = "<%=yyyyMM%>";
var gYYYYMMDD    = "<%=yyyyMMdd%>";

	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form" id="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="code" id="code" />
<input type="hidden" name="name" id="name" />
<input type="hidden" name="super_cd1" id="super_cd1" />
<input type="hidden" name="super_cd2" id="super_cd2" />
<input type="hidden" name="cust_vndr_cnt_cd" id="cust_vndr_cnt_cd" />
<input type="hidden" name="re_divr_cd" value="E" id="re_divr_cd" />
<input type="hidden" name="ar_ap_div_cd" value="P" id="ar_ap_div_cd" />
<input type="hidden" name="slp_tp_cd" value="06" id="slp_tp_cd" />
<input type="hidden" name="slp_func_cd" value="S" id="slp_func_cd" />
<input type="hidden" name="issuer_id" value="<%=strUsr_id%>" id="issuer_id" />
<input type="hidden" name="slp_ofc_cd" value="<%=account.getOfc_cd()%>" id="slp_ofc_cd" />
<!-- Input Box for Report Designer -->
<input type="hidden" name="com_mrdPath" value="" id="com_mrdPath" />
<input type="hidden" name="com_mrdArguments" value="" id="com_mrdArguments" />
<input type="hidden" name="com_mrdTitle" value="Consultation Slip" id="com_mrdTitle" />
<input type="hidden" name="com_mrdBodyTitle" value="Consultation Slip" id="com_mrdBodyTitle" />

<input type="hidden" name="com_mrdSaveDialogFileExt" value="ppt" id="com_mrdSaveDialogFileExt" />
<input type="hidden" name="com_mrdSaveDialogFileExtLimit" value="xls@pdf@doc@ppt" id="com_mrdSaveDialogFileExtLimit" />
<input type="hidden" name="com_mrdSaveDialogFileName" value="Consultation Slip" id="com_mrdSaveDialogFileName" />
<input type="hidden" name="com_mrdSaveDialogDir" value="" id="com_mrdSaveDialogDir" />
<!-- 2010.01.27 Approval Step -->
<input type="hidden" name="aproSeqKey" id="aproSeqKey" />
<!-- NYK Modify 2014.11.07 display : none  -->
<input type="hidden" name="apro_step" id="apro_step" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
	<button class="btn_accent" name="btn_new" id="btn_new" type="button">New</button><!--
	--><button class="btn_normal" name="btn_save" id="btn_save" type="button">Save</button><!--
	--><button class="btn_normal" name="btn_evid" id="btn_evid" type="button" style="display:none;">Evidence</button><!--
	--><button class="btn_normal" name="btn_print" id="btn_print" type="button">Print</button><!--
	--></div>
	<!-- opus_design_btn (E) -->
	
	<!-- page_location(S) -->
	<div class="location">
		<span id="navigation"></span>
	</div>
</div>
<!-- page_title_area(E) -->

<div class= "wrap_search">
<!-- opus_design_inquiry(S) -->
	<div class= "opus_design_inquiry">
		<table>
			
			<colgroup>
				<col width="155"/>
				<col width="100"/>
				<col width="70"/>
				<col width="70"/>
				<col width="90"/>
				<col width="70"/>
				<col width="70"/>
				<col width="*"/>
		    </colgroup>
		    <tbody>
			    <tr>
					<th>Account Month</th>
					<td><input type="text" style="width:60px;" class="input1" name="acct_yrmon" value="<%=yyyyMM%>" dataformat="ym" maxlength="6" id="acct_yrmon" /><!-- 
					 --><button type="button" class="btn_left" name="btns_back"  id="btns_back"></button><!--
						--><button type="button" class="btn_right" name="btns_next"  id="btns_next"></button></td>
					<th>Carrier</th>
					<td ><script type="text/javascript">ComComboObject('jo_crr_cd',1,55,0,1);</script></td>
					<th>Combined No.</th>
					<td ><script type="text/javascript">ComComboObject('stl_cmb_seq',2,55,0,1);</script></td>
					<th>CSR No.</th>
					<td><input type="text" style="width:198px;" class="input2" name="csr_no" readonly id="csr_no" /> </td>
				</tr> 
			    
			</tbody>
		</table>
	</div>
	
	<!-- opus_design_inquiry (S) -->
<div class="opus_design_inquiry">
	<table>
		<colgroup>
			<col width="155"/>
			<col  width="169"/>
			<col width="180"/>
			<col width="*" />
		</colgroup>
		<tbody>
			<tr class="h23">
					<th>Service Provider Code</th>
					<td><input type="text" style="width:124px;" class="input2" name="cust_vndr_seq" readonly id="cust_vndr_seq" /> </td>
					<th>Service Provider Name(LOCL)</th>
					<td><input type="text" style="width:338px;" class="input2" name="cust_vndr_kor_nm" readonly id="cust_vndr_kor_nm" /> </td>
					</tr> 
				<tr class="h23">
					<th>Business Registration No.</th>
					<td><input type="text" style="width:124px;" class="input2" name="cust_vndr_rgst_no" dataformat="saupja" readonly id="cust_vndr_rgst_no" /> </td>
					<th>Service Provider Name(ENG)</th>
					<td><input type="text" style="width:338px;" class="input2" name="cust_vndr_eng_nm" readonly id="cust_vndr_eng_nm" /> </td>
				</tr> 
		</tbody>
	</table>
	<table class="line_bluedot"><tr><td></td></tr></table>
	<table>
		<colgroup>
			<col width="155"/>
			<col width="100"/>
			<col width="70"/>
			<col width="100"/>
			<col width="80"/>
			<col width="*"/>
		</colgroup>
		<tbody>
			<tr class="h23">
					<th>Issue Team</th>
					<td><input type="text" style="width:124px;text-align:center" class="input2" name="slp_iss_ofc_cd" value="<%=account.getOfc_cd()%>" readonly id="slp_iss_ofc_cd" /> </td>
					<th>Issue Date</th>
					<td><input type="text" style="width:80px;text-align:center" class="input2" name="slp_iss_dt" value="<%=yyyyMMdd%>" dataformat="ymd" maxlength="8" readonly id="slp_iss_dt" /></td>
					<th>Issuer</th>
					<td><input type="text" style="width:180px;text-align:left" class="input2" name="issuer_nm" value="<%=strUsr_nm%>" readonly id="issuer_nm" /> </td>
			</tr> 
		</tbody>
	</table>
	<table>
		<colgroup>
			<col width="155"/>
			<col width="100"/>
			<col width="100"/>
			<col width="100"/>
			<col width="80"/>
			<col width="*"/>
		</colgroup>
		<tbody>
			<tr class="h23">
					<th>Description</th>
					<td colspan="5"><input type="text" style="width:690px;" class="input1" name="csr_desc" maxlength="50" id="csr_desc" /> </td>
			</tr> 
			<tr class="h23">
				<th>Currency</th>
				<td><input type="text" style="width:124px;text-align:center" class="input2" name="locl_curr_cd" readonly id="locl_curr_cd" /> </td>
				<th>Amount</th>
				<td><input type="text" style="width:124px;text-align:right" class="input2" name="stl_locl_amt" readonly dataformat="float" id="stl_locl_amt" /> </td>
				<th></th>
				<th></th>
			</tr> 
		</tbody>
	</table>
	<table>
		<colgroup>
			<col width="155"/>
			<col width="100"/>
			<col width="100"/>
			<col width="100"/>
			<col width="80"/>
			<col width="100"/>
			<col width="90"/>
			<col width="*"/>
		</colgroup>
		<tbody>
			<tr>
				<th>Tax Type</th>
				<td><input type="hidden" name="evid_tp_cd" value="" id="evid_tp_cd" /><input type="text" style="width:124px;text-align:center" class="input2" name="evid_tp_cd_text" readonly id="evid_tp_cd_text" /><!-- 
				 --><span style="display:none;"><script type="text/javascript">ComComboObject('evid_tp_cd_combo',1,124,0,1);</script></span></td>
				<th>Slip Type</th>
				<td><script type="text/javascript">ComComboObject('csr_tp_cd',1,124,0,1);</script></td>
				<th>Eff. Date</th>
				<td><input type="text" style="width:100px;text-align:center" class="input1" name="eff_dt" dataformat="ymd" maxlength="8" required/><button type="button" id="btn_eff" name="btn_eff" class="calendar ir"></button></td>
				<th>DUE Date</th>
				<td><input type="text" style="width:100px;text-align:center" class="input1" name="rqst_dt" dataformat="ymd" maxlength="8" id="rqst_dt" /><button type="button" id="btn_rqst" name="btn_rqst" class="calendar ir"></button></td>
				<!--  deleting CSR A/R Approval Step-->
				<!-- 
				<tr>
						<th>Approval Step</th>
						<td colspan="7"><input type="text" style="width:690px;" class="input2" name="apro_step" readonly value="<%=com.clt.bizcommon.approval.util.ApprovalUtil.getApprovalRoute(cost_ofc_cd, inv_sub_sys_cd) %>" id="apro_step" /><button type="button" id="apro_step_btn" name="apro_step_btn" class="input_seach_btn"></button></td>
				</tr>
				 --> 				
			</tr>
		</tbody>
	</table>
	
</div>
<!-- opus_design_inquiry (E) -->
	
	
</div>


<!-- opus_design_grid(S) -->
<div class="wrap_result">
		<div class="opus_design_grid clear" >
		
			<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>
		
		<div class="opus_design_grid clear" >
			<script type="text/javascript">ComSheetObject('sheet2');</script>
		</div>
</div>
<!-- opus_design_grid(E) -->

</form>
