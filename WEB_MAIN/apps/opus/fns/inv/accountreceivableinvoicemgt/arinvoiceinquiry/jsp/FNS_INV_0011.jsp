<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0011.jsp
*@FileTitle  : Invoice Inquiry by I/F No
*@author     : CLT 
*@version    : 1.0
*@since      : 2014/06/26
=========================================================
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.arinvoiceinquiry.event.FnsInv0011Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.framework.component.util.StringUtil" %>
<%@ page import="com.clt.apps.opus.bcm.sup.valuemanage.util.ConstantMgr"%>

<%
	FnsInv0011Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			
	String strErrMsg = "";
	int rowCount	 = 0;					
  
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";

	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMgt.ARInvoiceInquiry");
	
	String view_ar_if_no = StringUtil.xssFilter(request.getParameter("ar_if_no"));
	if(view_ar_if_no == null){
		view_ar_if_no = "";
	}
	
	String view_inv_split_cd = StringUtil.xssFilter(request.getParameter("inv_split_cd"));
	if(view_inv_split_cd == null){
		view_inv_split_cd = "";
	}
	
	String view_ar_ofc_cd = StringUtil.xssFilter(request.getParameter("ar_ofc_cd"));
	String classId = StringUtil.xssFilter(request.getParameter("classId"));
	if(view_ar_ofc_cd == null){
		view_ar_ofc_cd = "";
	}
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsInv0011Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

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
<%
	if(view_ar_if_no.equals("") && view_ar_ofc_cd.equals("")){
%>
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
<input type="hidden" name="pagetype" value = "I">
<input type="hidden" name="view_ar_if_no" value="<%=view_ar_if_no %>">
<input type="hidden" name="view_inv_split_cd" value="<%=view_inv_split_cd %>">
<input type="hidden" name="view_ar_ofc_cd" value="<%=view_ar_ofc_cd %>">
<input type="hidden" name="classId" value="<%=classId %>">
<input type="hidden" name="dp_prcs_knt" value="0">
<input type="hidden" name="dp_prcs_knt_local" value="0">
<input type="hidden" name="whf_decl_no" value="">
<input type="hidden" name="whf_decl_cfm_dt" value="">

	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title">
			<button type="button"><span id="title"></span></button>
		</h2>
		<!-- page_title(E) -->
		
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
			--><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button>
		</div>
		<!-- opus_design_btn(E) -->
		
		<!-- page_location(S) -->
		<div class="location">	
			<span id="navigation"></span>
		</div>
		<!-- page_location(E) -->
	</div>
	<!-- page_title_area(E) -->


<%
	}
	else {
%>
<input	type="hidden" name="f_cmd"> 
<input type="hidden" name="iPage"> 
<input type="hidden" name="pagetype" value = "I">
<input type="hidden" name="view_ar_if_no" value="<%=view_ar_if_no %>">
<input type="hidden" name="view_inv_split_cd" value="<%=view_inv_split_cd %>">
<input type="hidden" name="view_ar_ofc_cd" value="<%=view_ar_ofc_cd %>">
<input type="hidden" name="dp_prcs_knt" value="0">
<input type="hidden" name="dp_prcs_knt_local" value="0">
 
	<!-- popup_title_area(S) -->
	<div class="layer_popup_title">
		<!-- page_title_area(S) -->
		<div class="page_title_area clear">
			<!-- page_title(S) -->
			<h2 class="page_title"><span>Invoice Inquiry by I/F No</span></h2>
			<!-- page_title(E) -->
					
			 <!-- opus_design_btn(S) -->
		    <div class="opus_design_btn">
		        <!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->				
		       	<button type="button" class="btn_normal" name="btn_close"  id="btn_close">Close</button>
		    </div>
		    <!-- opus_design_btn(E) -->
		    
		    <!-- page_location(S) -->
			<div class="location">	
				<span id="navigation"></span>
			</div>
			<!-- page_location(E) -->
		</div>
		<!-- page_title_area(E) -->
	</div>
	<!-- popup_title_area(E) -->	
	<div class="layer_popup_contents">
<%
	}
%>
<!-- wrap_search_tab(S) -->
	<div class="wrap_search_tab">
		<!-- opus_design_inquiry(S) -->
		<div class="opus_design_inquiry  opus_design_inquiryTab">
			<table>
				<tbody>
					<colgroup>
						<col width="1px;" />
						<col width="170px;" />
						<col width="50px" />
						<col width="170px;" />
						<col width="55px" />
						<col width="180px;" />
						<col width="40px" />
						<col width="70px" />						
						<col width="" />
					</colgroup>
					<tr>						
						<th>I/F No.</th>
						<td>
							<input name="ar_if_no" type="text" style="width:100px;" class="input1" value="" dataformat="engup" maxlength="11"><!--
							--><input name="inv_split_cd" type="text" style="width:24px;" class="input2" value="" readOnly tabIndex="-1">
						</td>
						<th>B/L No.</th>
						<td><input name="bl_src_no" type="text" style="width:114px;" class="input2" value="" readOnly tabIndex="-1"></td>
						<th>BKG No.</th>
						<td><input name="bkg_no" type="text" style="width:110px;" class="input2" value="" readOnly tabIndex="-1"></td>
						<th>Office</th>
						<td><input name="ar_ofc_cd" type="text" style="width:60px;" class="input2" value="" readOnly tabIndex="-1"></td>
						<td></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
<!-- wrap_search_tab(E) -->

<!-- wrap_result(S) -->
	<div class="wrap_result">
		<div class="opus_design_grid">
			<!-- opus_design_tab(S) -->
			<div class="opus_design_tab">
	    		<script type="text/javascript">ComTabObject('tab1')</script>       
			</div>
			<!-- opus_design_tab(E) -->
			
			<div class="opus_design_inquiry" name="tabLayer" id="tabLayer">
				<table>
					<tbody>
						<colgroup>
							<col width="100px;" />
							<col width="160px;" />
							<col width="90px" />
							<col width="160px;" />
							<col width="90px" />
							<col width="140px;" />
							<col width="90px" />
							<col width="55px" />						
							<col width="40px" />
							<col width="50px" />
							<col width="" />	
						</colgroup>
						<tr>						
							<th>Actual Cust.</th>
							<td colspan="5"> 
								<input name="act_cust_cnt_cd" type="text" style="width:40px;" class="input2" value="" readonly tabindex="-1" id="act_cust_cnt_cd" /><!--
								--><input name="act_cust_seq" type="text" style="width:60px;" class="input2" value="" readOnly tabIndex="-1"><!--
								--><button type="button" class="input_seach_btn" id="btns_cust" name="btns_cust"></button><!--							
								--><input name="cust_lgl_eng_nm" type="text" style="width:300px;" class="input2" value="" readOnly tabIndex="-1"><!--
								--><input name="cust_rgst_no" type="text" style="width:150px;" class="input2" value="" readOnly tabIndex="-1">
							</td>
							<th>Invoice Cust.</th>
							<td colspan="3">
								<input name="inv_cust_cnt_cd" type="text" style="width:30px;" class="input2" value="" readonly tabindex="-1" id="inv_cust_cnt_cd" /><!--
								--><input name="inv_cust_seq" type="text" style="width:70px;" class="input2" value="" readOnly tabIndex="-1"></td>						
							<td></td>
						</tr>
						<tr>
							<th>Credit Limit</th>
							<td>
								<input name="cr_curr_cd" type="text" style="width:40px;" class="input2" value="" readonly tabindex="-1" id="cr_curr_cd" /><!--
								--><input name="cr_amt" type="text" style="width:100px;text-align:right;" class="input2" value="" readOnly tabIndex="-1">
							</td>
							<th>Credit Term</th>
							<td>
								<label for="ob_cr_term_dys1">O/B</label><!--
								--><input id="ob_cr_term_dys" name="ob_cr_term_dys" type="text" style="width:29px;text-align:right;" class="input2" value="" readOnly tabIndex="-1"><!--
								--><label for="ib_cr_term_dys1">I/B</label><!--
								--><input id="ib_cr_term_dys" name="ib_cr_term_dys" type="text" style="width:29px;text-align:right;" class="input2" value="" readOnly tabIndex="-1">
							</td>
							<th>Credit Office</th>
							<td colspan="5">
								<input name="cr_clt_ofc_cd" type="text" style="width:100px;" class="input2" value="" readonly="" tabindex="-1" id="cr_clt_ofc_cd" />
							</td>						
							<td></td>
						</tr>
						<tr>
							<th>Local VVD</th>
							<td><input name="vvd" type="text" style="width:120px;" class="input2" value="" readonly tabindex="-1" id="vvd" /> </td>
							<th>Scope</th>
							<td><input name="svc_scp_cd" type="text" style="width:45px;" class="input2" value="" readonly tabindex="-1" id="svc_scp_cd" /> </td>
							<th>Bound</th>
							<td><input name="io_bnd_cd" type="text" style="width:45px;" class="input2" value="" readonly tabindex="-1" id="io_bnd_cd" /> </td>
							<th>S/A Date</th>
							<td colspan="3"><input name="sail_arr_dt" type="text" style="width:77px;" class="input2" value="" readonly="" tabindex="-1" id="sail_arr_dt" /></td>
							<td></td>
						</tr>
						<tr>
							<th>Trunk VVD</th>
							<td><input name="trunk_vvd" type="text" style="width:120px;" class="input2" value="" readonly tabindex="-1" id="trunk_vvd" /> </td>
							<th>Lane</th>
							<td><input name="slan_cd" type="text" style="width:45px;" class="input2" value="" readonly tabindex="-1" id="slan_cd" /> </td>
							<th>POR / POL</th>
							<td><input name="por_cd" type="text" style="width:50px;" class="input2" value="" readonly tabindex="-1" id="por_cd" /><!--
								 --><input name="pol_cd" type="text" style="width:50px;" class="input2" value="" readOnly tabIndex="-1"></td>
							<th>POD / DEL</th>
							<td colspan="3"><input name="pod_cd" type="text" style="width:50px;" class="input2" value="" readonly="" tabindex="-1" id="pod_cd" />/&nbsp;<!--
								--><input name="del_cd" id="del_cd" type="text"style="width:50px;" class="input2" value="" readOnly tabIndex="-1"></td>
							<td></td>
						</tr>
						<tr>
							<th>C/A No.</th>
							<td><input name="bkg_corr_no" type="text" style="width:120px;" class="input2" value="" readonly tabindex="-1" id="bkg_corr_no" /> </td>
							<th>C/A Date</th>
							<td><input name="bkg_corr_dt" type="text" style="width:78px;" class="input2" value="" readonly tabindex="-1" id="bkg_corr_dt" /> </td>
							<!-- <th>NYK Ref.</th> -->
				            <th><%=ConstantMgr.getCompanyCode()%> Ref.</th>
							<td><input name="co_stf_ctnt" type="text" style="width:120px;" class="input2" value="" readonly tabindex="-1" id="co_stf_ctnt" /> </td>
							<th>Sailing Date</th>
							<td colspan="3"><input name="sail_dt" type="text" style="width:77px;" class="input2" value="" readonly="" tabindex="-1" id="sail_dt" /></td>
							<td></td>
						</tr>
						<tr>
							<th>INV Ref. No.</th>
							<td><input name="inv_ref_no" type="text" style="width:120px;" class="input2" value="" readonly tabindex="-1" id="inv_ref_no" /> </td>
							<th>BKG Ref. No.</th>
							<td><input name="bkg_ref_no" type="text" style="width:120px;" class="input2" value="" readonly tabindex="-1" id="bkg_ref_no" /> </td>
							<th>S/I Ref. No.</th>
							<td colspan="5"><input name="si_ref_no" id="si_ref_no" type="text" style="width:120px;" class="input2" value="" readOnly tabIndex="-1"></td>						
							<td></td>
						</tr>
						<tr>
							<th>Description</th>
							<td colspan="5"><input name="inv_rmk" id="inv_rmk" type="text" style="width:600px;" class="input2" value="" readOnly tabIndex="-1"></td>
							<th>Rev. Type</th>
							<td><input name="rev_tp_cd" type="text" style="width:30px;" class="input2" value="" readonly tabindex="-1" id="rev_tp_cd" /> </td>
							<th>Source</th>
							<td><input name="rev_src_cd" type="text" style="width:40px;" class="input2" value="" readonly tabindex="-1" id="rev_src_cd" /> </td>						
							<td></td>
						</tr>
						<tr>
							<th>Master B/L No.</th>
							<td><input name="mst_bl_no" type="text" style="width:100px;" class="input2" value="" readonly tabindex="-1" id="mst_bl_no" /> </td>
							<th>RFA No.</th>
							<td><input name="rfa_no" type="text" style="width:100px;" class="input2" value="" readonly tabindex="-1" id="rfa_no" /> </td>
							<th>S/C No.</th>
							<td><input name="sc_no" type="text" style="width:100px;" class="input2" value="" readonly tabindex="-1" id="sc_no" /> </td>
							<th>F/Forwarder</th>
							<td colspan="3"><input name="frt_fwrd_cnt_cd" id="frt_fwrd_cnt_cd" type="text" style="width:30px;" class="input2" value="" readOnly tabIndex="-1"><!--
								--><input name="frt_fwrd_cust_seq" id="frt_fwrd_cust_seq" type="text" style="width:70px;" class="input2" value="" readOnly tabIndex="-1"></td>
							<td></td>
						</tr>
						<tr>
							<th>Sales Rep.</th>
							<td><input name="srep_cd" type="text" style="width:100px;" class="input2" value="" readonly tabindex="-1" id="srep_cd" /> </td>
							<th>Weight</th>
							<td><input name="cgo_wgt" type="text" style="width:100px;text-align:right" class="input2" value="" readonly tabindex="-1" id="cgo_wgt" /> </td>
							<th>Measure</th>
							<td><input name="cgo_meas_qty" type="text" style="width:100px;text-align:right" class="input2" value="" readonly tabindex="-1" id="cgo_meas_qty" /> </td>
							<th>EX. Rate(USD:LCL)</th>
							<td colspan="3"><input name="usd_xch_rt" id="usd_xch_rt" type="text" style="width:100px;text-align:right" class="input2" value="" readOnly tabIndex="-1"></td>
							<td></td>
						</tr>
						<tr>
							<th>I/F Date</th>
							<td><input name="bl_inv_if_dt" type="text" style="width:100px;" class="input2" value="" readonly tabindex="-1" id="bl_inv_if_dt" /> </td>
							<th>Good Date</th>
							<td><input name="bl_inv_cfm_dt" type="text" style="width:78px;" class="input2" value="" readonly tabindex="-1" id="bl_inv_cfm_dt" /> </td>
							<th>Eff. Date</th>
							<td><input name="gl_eff_dt" id="gl_eff_dt" type="text" style="width:78px;" class="input2" value="" readOnly tabIndex="-1"></td>
							<th>TEU / FEU</th>
							<td colspan="5"><input name="bkg_teu_qty" type="text" style="width:43px;text-align:right;" class="input2" value="" readonly="" tabindex="-1" id="bkg_teu_qty" />/&nbsp;<!--
								--><input name="bkg_feu_qty" type="text" style="width:42px;text-align:right;" class="input2" value="" readonly="" tabindex="-1" id="bkg_feu_qty" /><!--
								--><button type="button" class="input_seach_btn" id="btns_container" name="btns_container"></button></td>					
						</tr>
						<tr>
							<th>Invoice No.</th>
							<td><input name="inv_no" type="text" style="width:100px;" class="input2" value="" readonly tabindex="-1" id="inv_no" /> </td>
							<th>Issue Date</th>
							<td><input name="iss_dt" type="text" style="width:78px;" class="input2" value="" readonly tabindex="-1" id="iss_dt" /> </td>
							<th>Due Date</th>
							<td><input name="due_dt" id="due_dt" type="text" style="width:78px;" class="input2" value="" readOnly tabIndex="-1"></td>						
                            <th>Credit Agreement No</th>
                            <td><input name="cust_agmt_no" type="text" style="width:100px;" class="input2" value="" readonly tabindex="-1" id="cust_agmt_no" /></td>
						</tr>
						<tr>
							<th></th>
							<td></td>
							<td></td>
							<td></td>
                            <th id="ida_gst_expt_nm" style="display:none">India Exempt Tax</th>
                            <td><input name="ida_gst_expt_cd" id="ida_gst_expt_cd" type="text" style="width:30px;display:none" class="input2" value="" readOnly tabIndex="-1"></td>                     
							<th id="sez_nm" style="display:none">India Customer in SEZ</th>
							<td><input name="sez_flg" id="sez_flg" type="text" style="width:30px;display:none" class="input2" value="" readOnly tabIndex="-1"></td>						
							
						</tr>		
					</tbody>
				</table>
			</div>
		
			<div class="opus_design_grid" name="tabLayer" id="tabLayer" style="display:none">
				
				<table>
					<tr>
						<td class="title_h"></td>						
						<h3 class="title_design">By Currency</h3>
					</tr>
				</table>		
				<!--  biz_1   (E) -->
				<!-- opus_design_grid(S) -->
				<div class="opus_design_grid" id="mainTable">
				    <script type="text/javascript">ComSheetObject('t2sheet1');</script>
				</div>
				<!-- opus_design_grid(E) -->
				<!--  biz_2  (S) -->		
				<table>
					<tr>
						<td class="title_h"></td>						
						<h3 class="title_design">By Charge</h3>
					</tr>
				</table>		
				<!-- Grid  (S) -->
				<!-- opus_design_grid(S) -->
				<div class="opus_design_grid" id="mainTable">
				    <script type="text/javascript">ComSheetObject('t2sheet2');</script>
				</div>
				<!-- opus_design_grid(E) -->
				<table> 
					<tr>
						<td width="100%" style="display:none">
							<!-- opus_design_grid(S) -->
							<div class="opus_design_grid" id="mainTable" style="display:none">
							    <script type="text/javascript">ComSheetObject('sheet3');</script>
							</div>
							<!-- opus_design_grid(E) -->
						</td>
					</tr>
				</table>  	
			</div>
		</div>		
	</div>
<!-- wrap_result(E) -->

<%
	if(!(view_ar_if_no.equals("") && view_ar_ofc_cd.equals(""))){
%>
</div>
<% } %>
	
</form>
