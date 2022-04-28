<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_CSR_0002.jsp
*@FileTitle  : CSR Creation(Detail)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.event.ComCsr0002Event"%>
<%@ page import="com.clt.bizcommon.csr.csrcommon.csrexternalfinder.basic.*"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	ComCsr0002Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//Error from server
	String strErrMsg = "";						//Error message
	int rowCount	 = 0;						//The list count of the DB ResultSet

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.ConsultationSlipRequestMgt.ConsultationSlipRequestMgt");
	
	String userId  = "";
	String ofc_cd  = "";
	String cost_ofc_cd  = "";
	String usr_eml = "";	
	String usr_nm  = "";
	String cnt_cd  = "";

	String inv_cfm_dt = ""; 
	String vndr_seq = "";
	String vndr_seq_name = ""; 	
	String cnt_inv = "";
	String curr_cd = "";
	String total_amt = "";
	String asanogb = "";
	String pay_group_cd = "";
	String iss_dt = "";
	String rcv_dt = "";
	String gen_pay_term_cd = "";
	String gen_pay_term_desc = "";
	String payment_due_dt = "";
	String pay_term_tp_cd = "";
	String inv_sub_sys_cd = "";

	String pso_trns_slp_ctnt = "";
	
	String apOfcCd = "";
	
	inv_cfm_dt 			= JSPUtil.getParameter(request, "inv_cfm_dt 			".trim(), "");	
	vndr_seq 			= JSPUtil.getParameter(request, "vndr_seq 			    ".trim(), "");
	vndr_seq_name 		= JSPUtil.getParameter(request, "vndr_seq_name          ".trim(), ""); 		
	cnt_inv 			= JSPUtil.getParameter(request, "cnt_inv 			    ".trim(), "");
	curr_cd 		    = JSPUtil.getParameter(request, "curr_cd          		".trim(), ""); 
	total_amt 			= JSPUtil.getParameter(request, "total_amt 			    ".trim(), "");
	asanogb 			= JSPUtil.getParameter(request, "asanogb 			    ".trim(), "");	
	pay_group_cd 		= JSPUtil.getParameter(request, "pay_group_cd 			".trim(), "");	
	iss_dt 				= JSPUtil.getParameter(request, "iss_dt          		".trim(), ""); 
	rcv_dt 				= JSPUtil.getParameter(request, "rcv_dt          		".trim(), ""); 
	gen_pay_term_cd 	= JSPUtil.getParameter(request, "gen_pay_term_cd 		".trim(), "");
	gen_pay_term_desc 	= JSPUtil.getParameter(request, "gen_pay_term_desc		".trim(), "");
	payment_due_dt 		= JSPUtil.getParameter(request, "payment_due_dt 		".trim(), "");	
	pay_term_tp_cd 		= JSPUtil.getParameter(request, "pay_term_tp_cd 		".trim(), "");	
	cost_ofc_cd 		= JSPUtil.getParameter(request, "cost_ofc_cd 			".trim(), "");	
	apOfcCd 			= JSPUtil.getParameter(request, "apOfcCd 				".trim(), "");
	inv_sub_sys_cd		= JSPUtil.getParameter(request, "inv_sub_sys_cd			".trim(), "");
	//2009-11-23
	pso_trns_slp_ctnt	= JSPUtil.getParameter(request, "pso_trns_slp_ctnt		".trim(), "");
	String parent_pgm_no  = JSPUtil.getParameter(request, "parentPgmNo".trim(), "");
	String pgm_no  = JSPUtil.getParameter(request, "pgmNo".trim(), "");
	try {
		   SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		   userId=account.getUsr_id();
		   //userAuth=account.getAuth();	   
		   ofc_cd=account.getOfc_cd();	   
		   usr_nm=account.getUsr_nm();
		   usr_eml=account.getUsr_eml();
		   //cnt_cd =account.getCnt_cd();

	  	   cnt_cd = JSPUtil.getNull(new CSRExternalFinderBCImpl().getMDMCntCd(ofc_cd)); //getting cnt_cd from TES
		
		   event = (ComCsr0002Event)request.getAttribute("Event");
		   serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<script language="javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
	var cnt_cd = "<%=cnt_cd%>";
</script>
<script language="javascript" type="text/javascript" src="bizcommon/csr/CoCsr.js"></script>
<form name="form">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">

<input type="hidden" name="iPage">
<input type="hidden" name="ofc_cd" value="<%=ofc_cd%>">
<input type="hidden" name="inv_sub_sys_cd" value="<%=inv_sub_sys_cd%>">	<!-- module -->
<input type="hidden" name="inv_ofc_cd" value="<%=ofc_cd%>">
<input type="hidden" name="cnt_cd" value="<%=cnt_cd%>">
<input type="hidden" name="asanogb" value="<%=asanogb%>">
<input type="hidden" name="pay_group_cd" value="<%=pay_group_cd%>">
<input type="hidden" name="csr_amt">
<input type="hidden" name="iss_dt" value="<%=iss_dt%>">
<input type="hidden" name="rcv_dt" value="<%=rcv_dt%>">
<input type="hidden" name="gen_pay_term_cd" value="<%=gen_pay_term_cd%>">
<input type="hidden" name="temp_payment_due_dt" value="<%=payment_due_dt%>">
<input type="hidden" name="pay_term_tp_cd" value="<%=pay_term_tp_cd%>">
<input type="hidden" name="ap_ofc_cd" value="<%=apOfcCd%>">	
<input type="hidden" name="usr_eml" value="<%=usr_eml%>">
<input type="hidden" name="usr_nm" value="<%=usr_nm%>">
<input type="hidden" name="cre_usr_id" value="<%=userId%>">
<input type="hidden" name="csr_tp_cd">
<input type="hidden" name="evi_gb">
<input type="hidden" name="inv_knt">
<input type="hidden" name="inv_cfm_dt" value="<%=inv_cfm_dt%>">
<!-- 2009-11-23 -->
<input type="hidden" name="pso_trns_slp_ctnt" value="<%=pso_trns_slp_ctnt%>">
<input type="hidden" name="parent_pgm_no" value="<%=parent_pgm_no%>" id="parent_pgm_no" />
<input type="hidden" name="pgm_no" value="<%=pgm_no%>" id="pgm_no" />

<input type="hidden" name="tax_naid_flg">
<input type="hidden" name="finance_flg">
<input type="hidden" name="fa_flg"> 
<input type="hidden" name="tax_type">
<input type="hidden" name="tax_nsl_flg">

<input type="hidden" name="evi_inv_dt">
<input type="hidden" name="evi_comp_no"> 
<input type="hidden" name="evi_total_net_amt">
<input type="hidden" name="evi_tax_no2">
<input type="hidden" name="evi_total_tax_amt">
<input type="hidden" name="evi_ctnt1">
<input type="hidden" name="evi_ctnt2"> 
<input type="hidden" name="evi_ctnt3"> 
<input type="hidden" name="evi_ctnt4"> 
<input type="hidden" name="evi_ctnt5"> 
<input type="hidden" name="evi_ctnt6"> 
<input type="hidden" name="evi_ctnt7"> 
<input type="hidden" name="evi_ctnt8"> 
<input type="hidden" name="evi_ctnt9">
<input type="hidden" name="evi_ctnt10">
<input type="hidden" name="evi_ctnt11">
<input type="hidden" name="evi_ctnt12">
<input type="hidden" name="evi_tax_no">
<input type="hidden" name="evi_tax_code"> 

<input type="hidden" name="s_tax_naid_flg">
<input type="hidden" name="s_finance_flg">
<input type="hidden" name="s_fa_flg"> 
<input type="hidden" name="s_tax_type">
<input type="hidden" name="s_tax_nsl_flg">

<input type="hidden" name="s_evi_inv_dt">
<input type="hidden" name="s_evi_comp_no"> 
<input type="hidden" name="s_evi_total_net_amt">
<input type="hidden" name="s_evi_tax_no2">
<input type="hidden" name="s_evi_total_tax_amt">
<input type="hidden" name="s_evi_ctnt1">
<input type="hidden" name="s_evi_ctnt2"> 
<input type="hidden" name="s_evi_ctnt3"> 
<input type="hidden" name="s_evi_ctnt4"> 
<input type="hidden" name="s_evi_ctnt5"> 
<input type="hidden" name="s_evi_ctnt6"> 
<input type="hidden" name="s_evi_ctnt7"> 

<input type="hidden" name="s_evi_ctnt8"> 
<input type="hidden" name="s_evi_ctnt9">
<input type="hidden" name="s_evi_ctnt10">
<input type="hidden" name="s_evi_ctnt11">
<input type="hidden" name="s_evi_ctnt12">
<input type="hidden" name="s_evi_tax_no">
<input type="hidden" name="s_evi_tax_code"> 


<input type="hidden" name="attr_ctnt8">


<input type="hidden" name="ttl_lss_div_cd" >
<input type="hidden" name="inv_rgst_no" >

<input type="hidden" name="eviInputFlg">
<input type="hidden" name="s_eviInputFlg">
<input type="hidden" name="apopen">

<input type="hidden"   name="pso_trns_slp_ctnt_var" value="">

<input type="hidden"    name="asa_no_s">
<input type="hidden"    name="aproSeqKey" value="">

<!-- The field for BackEndJob -->
<input type="hidden" name="key">

<!-- page(S) -->
<!-- page_title_area(S) -->
<div class="page_title_area clear">
	
	<!-- page_title(S) -->
    <!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title"><span>CSR Creation(Detail)</span></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
		<div id="btLayer" style="display:none">
			<button type="button" class="btn_normal" name="btn_main" id="btn_main">Main</button><!--
			--><button type="button" class="btn_normal" name="btn_preview" id="btn_preview">Preview</button><!--
			--><button type="button" class="btn_normal" name="btn_approvalrequest" id="btn_approvalrequest">Approval Request</button>
		</div>
		<div id="btLayer" style="display:none">
			<button type="button" class="btn_normal" name="btn_main" id="btn_main">Main</button><!--
			--><button type="button" class="btn_normal" name="btn_evidence" id="btn_evidence">증빙</button><!--
			--><button type="button" class="btn_normal" name="btn_preview" id="btn_preview">Preview</button><!--
			--><button type="button" class="btn_normal" name="btn_approvalrequest" id="btn_approvalrequest">Approval Request</button>
		</div>
		<div id="btLayer" style="display:none">
			<button type="button" class="btn_normal" name="btn_main" id="btn_main">Main</button><!--
			--><button type="button" class="btn_normal" name="btn_preview" id="btn_preview">Preview</button><!--
			--><button type="button" class="btn_normal" name="btn_approvalrequest" id="btn_approvalrequest">Approval Request</button>
		</div>
	</div>
	<!-- opus_design_btn(E) -->

   	<!-- page_location(S) -->
   	<div class="location">
		<!-- location 내용 동적생성 (별도 코딩 불필요) -->
        <span id="navigation"></span>
   	</div>
   	<!-- page_location(E) -->
</div>
<!-- page_title_area(E) -->

<!-- opus_design_inquiry(S) -->
<div class="wrap_search">
<div class="opus_design_inquiry wFit">
	<div id="sch_cond_div" style=display:block;>
	<!--  MiniLayer (S) -->
	<table>
		<colgroup>
            <col width="70" />
            <col width="130" />
            <col width="90" />
            <col width="" />
            <col width="120" />
		</colgroup>
		<tbody>
			<tr>
				<th>Cost Office</th>
				<td><input name="cost_ofc_cd" type="text" style="width:60px;text-align:center;" value="<%=cost_ofc_cd%>"></td>
				<th>Payment S/P</th>
				<td>&nbsp;<input name="vndr_seq" type="text" style="width:70px;text-align:center;" value="<%=vndr_seq%>">&nbsp;<input name="vndr_seq_name" type="text" style="width:380px" value="<%=vndr_seq_name%>"></td>
				<!--// eBilling - B //--><td><div id="EDILayer01" style="display:none"><img src="img/enis/button/btn_EDIinvoiceprint.gif" width="120" height="20" border="0" align="right" name='btn_EDIinvoiceview'></div></td><!--// eBilling - E //-->
			</tr>
		</tbody>
	</table>
	</div>
</div>
</div>
<!-- opus_design_inquiry(E) -->

<!-- opus_design_grid(S) -->
<div class="wrap_result">
<div class="opus_design_grid">
	<!-- 그리드 데이터 영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
    <script language="javascript">ComSheetObject('sheet1');</script>
    <!-- 그리드 데이터 영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
    
    <div class="opus_design_inquiry mar_top_8 sm">
	    <table class="search" border="0" >
	    	<colgroup>    		
	            <col width="90" />
	            <col width="100" />
	            <col width="80" />
	            <col width="100" />
	            <col width="90" />
	            <col width="120" />
	            <col width="110" />
	            <col width="" />
	    	</colgroup>
	    	<tbody>
				<tr>
					<th>No. Of Invoice</th>
					<td><input name="cnt_inv" type="text" style="width:80px;text-align:right;" value=""></td>
					<th>INV Currency</th>
					<td><input name="curr_cd" type="text" style="width:40px;text-align:center;" value="<%=curr_cd%>"></td>
					<th>Total Amount</th>
					<td><input name="total_amt" type="text" style="width:100px;text-align:right;" value=""></td>
					<td align="left" colspan="2">
					
					<div id="srLayer" style="display:none">  
						<table class="search" border="0">
							<tr>
								<th width="50">ASA No.</td>
								<td><script language="javascript">ComComboObject('asa_no',2,276,0,0);</script></td>
							</tr>
						</table>
					</div>
					
					<div id="srLayer" style="display:none">
						<table class="search" border="0">
							<tr>
								<td>증빙구분</td>
								<td>&nbsp;<select style="width:80px;" name="evi_gb1" onChange="eviGbSelect(1)">
									<option value="1">세금계산서</option>
									<option value="2">계산서</option> 
									<option value="3">기타</option>
									</select></td>
							</tr>
						</table>
					</div>
					
					<div id="srLayer" style="display:none">
						<table class="search" border="0">
							<tr>
								<td>ASA No.</td>
								<td><script language="javascript"><!--ComComboObject('asa_no',2,276,0,0)--></script></td>
								<td>증빙구분</td>
								<td>&nbsp;<select style="width:80px;" name="evi_gb2" onChange="eviGbSelect(2)">
									<option value="1">세금계산서</option>
									<option value="2">계산서</option> 
									<option value="3">기타</option>
									</select></td>
							</tr>
						</table>
					</div>
					</td>
				</tr>
				<tr>
					<th>Issue Date</th>
					<td><input name="max_iss_dt" type="text" style="width:80px;text-align:center;" value="" maxlength=10  onBlur='validateDateObj2(this);'></td>
					<th>Receive Date</th>
					<td><input name="max_rcv_dt" type="text" style="width:80px;text-align:center;" value=""  maxlength=10  onBlur='validateDateObj(this);'></td>
					<th>Payment Term</th>
					<td><input name="gen_pay_term_desc" type="text" style="width:100px;text-align:right;" value="<%=gen_pay_term_desc%>"></td>
					<th>Payment Due Date</th> 
					<td style="padding-left:2"><input name="payment_due_dt" type="text" style="width:80px;text-align:center;" maxlength="10" value="" maxlength=10 onKeyUp='csr_isNumD(this,"Y");' onKeyDown='csr_chkInput(this); csr_isNumD(this,"Y");' onBlur='if(this.value!=null&&this.value!=""){validateDateObj2(this);}'></td>
				</tr>
				<tr>
				<!-- 
					<th>Approval Step</th>
					-->
					<td colspan="7"><input name="apro_step" type="hidden" style="width:800" value="<%=com.clt.bizcommon.approval.util.ApprovalUtil.getApprovalRoute(ofc_cd, inv_sub_sys_cd) %>">
					<!-- 
					<button type="button" class="input_seach_btn" name="apro_route_btn" id="apro_route_btn"></button>
					 -->
					</td>
				</tr>
				<tr>
					<th>CSR No.</th>
					<td colspan="7"><input name="csr_no" type="text" style="width:170;text-align:center;" value=""></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
</div>
<!-- opus_design_grid(E) -->
<!-- page(E) -->

</form>

<DIV style="display:none"> 
	<!-- Grid  (S) -->
	<table width="100%" class="search"  id="mainTable"> 
		<tr>
			<td width="100%">
			<script language="javascript">ComSheetObject('sheet2');</script>
			</td>
		</tr>
	</table> 			
	<!-- Grid (E) -->
	
	<!-- Grid  (S) -->
	<table width="100%" class="search"  id="mainTable">
		<tr>
			<td width="100%">
			<script language="javascript">ComSheetObject('sheet3');</script>
			</td>
		</tr>
	</table> 			
	<!-- Grid (E) -->
</DIV>