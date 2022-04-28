<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0009.jsp
*@FileTitle  : Invoice Inquiry by B/L No
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/15
=========================================================
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.arinvoiceinquiry.event.FnsInv0009Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.framework.component.util.StringUtil" %>
<%
	FnsInv0009Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			// Errors from server.
	String strErrMsg = "";						// Error message.
	int rowCount	 = 0;						// DB ResultSet list count

	String successFlag = "";
	String codeList  = "";   
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String strOfc_cd		= "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMgt.ARInvoiceInquiry");

	String view_bl_src_no = StringUtil.xssFilter(request.getParameter("bl_src_no"));
	if(view_bl_src_no == null){
		view_bl_src_no = "";
	}
	
	String view_ar_ofc_cd = StringUtil.xssFilter(request.getParameter("ar_ofc_cd"));
	if(view_ar_ofc_cd == null){
		view_ar_ofc_cd = "";
	}
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		strOfc_cd = account.getOfc_cd();
		
		event = (FnsInv0009Event)request.getAttribute("Event");
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
<form name="form" onKeyDown="ComKeyEnter('search')">
<%
	if(view_bl_src_no.equals("") && view_ar_ofc_cd.equals("")){
%>


<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="pagetype" value="I" id="pagetype" />
<input type="hidden" name="office" id="office" />
<input type="hidden" name="login_ofc_cd" value="<%=strOfc_cd%>" id="login_ofc_cd" />
<input type="hidden" name="view_bl_src_no" value="<%=view_bl_src_no%>" id="view_bl_src_no" />
<input type="hidden" name="view_ar_ofc_cd" value="<%=view_ar_ofc_cd%>" id="view_ar_ofc_cd" />

<input type="hidden" name="bl_tp_cd" value="" id="bl_tp_cd" />
<input type="hidden" name="rev_type" value="" id="rev_type" />
<input type="hidden" name="rev_type_A" value="A" id="rev_type_A" />
<input type="hidden" name="rev_type_B" value="" id="rev_type_B" />
<input type="hidden" name="rev_type_C" value="" id="rev_type_C" />
<input type="hidden" name="rev_type_D" value="" id="rev_type_D" />
<input type="hidden" name="rev_type_M" value="" id="rev_type_M" />

<input type="hidden" name="dp_prcs_knt" value="0" id="dp_prcs_knt" />
<input type="hidden" name="dp_prcs_knt_local" value="0" id="dp_prcs_knt_local" />

<input type="hidden" name="inv_dup_flg" value="" id="inv_dup_flg" />

<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		
		<!-- page_title(S) -->
		<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
		<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
		<!-- page_title(E) -->	
		
		<!-- page_location(S) -->
		<div class="location">
			<!-- location 내용 동적생성 (별도 코딩 불필요) -->
			<span id="navigation"></span>
		</div>
		<!-- page_location(E) -->
	</div>
<!-- page_title_area(E) -->
<%
	}else {
%>
  
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="pagetype" value="I" id="pagetype" />
<input type="hidden" name="office" id="office" />
<input type="hidden" name="login_ofc_cd" value="<%=strOfc_cd%>" id="login_ofc_cd" />
<input type="hidden" name="view_bl_src_no" value="<%=view_bl_src_no%>" id="view_bl_src_no" />
<input type="hidden" name="view_ar_ofc_cd" value="<%=view_ar_ofc_cd%>" id="view_ar_ofc_cd" />

<input type="hidden" name="bl_tp_cd" value="" id="bl_tp_cd" />
<input type="hidden" name="rev_type" value="" id="rev_type" />
<input type="hidden" name="rev_type_A" value="A" id="rev_type_A" />
<input type="hidden" name="rev_type_B" value="" id="rev_type_B" />
<input type="hidden" name="rev_type_C" value="" id="rev_type_C" />
<input type="hidden" name="rev_type_D" value="" id="rev_type_D" />
<input type="hidden" name="rev_type_M" value="" id="rev_type_M" />

<input type="hidden" name="dp_prcs_knt" value="0" id="dp_prcs_knt" />
<input type="hidden" name="dp_prcs_knt_local" value="0" id="dp_prcs_knt_local" />

<input type="hidden" name="inv_dup_flg" value="" id="inv_dup_flg" />

<!-- popup_title_area(S) -->
 <div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title"><span>Invoice Inquiry by B/L No</span></h2>
		<!-- page_title(E) -->
	</div>
	<!-- page_title_area(E) -->
</div>
<!-- popup_title_area(E) -->

<%
	}
%>


<% if(view_bl_src_no.equals("") && view_ar_ofc_cd.equals("")){%>
<% } else { %>
<!-- popup_contens_area(S) -->
<div class="layer_popup_contents">
<!-- popup_contens_area(E) -->
<% } %>

<!-- inquiry_area(S) -->
<div class="wrap_search_tab">
	<div class="opus_design_inquiry wFit">   <!-- no TAB  -->
		<table> 
			<colgroup>
				<col width="80" />
				<col width="200" />
				<col width="50" />
				<col width="162" />
				<col width="60" />
				<col width="170" />
				<col width="*" />
			</colgroup>
			<tbody>
				<tr>
					<th>B/L No.</th>
					<td><input name="bl_src_no" id="bl_src_no" type="text" style="width:105px;" class="input1"  dataformat="engup" maxlength="12">&nbsp;</td>
					<th>BKG No.</th>
					<td><input name="bkg_no" id="bkg_no" type="text" style="width:115px;" class="input1" value="" dataformat="engup" maxlength="13">&nbsp;</td> 
					<th>Office</th>   
					<td>
						<div id="arOfcCdDiv1" style="display:block"><input name="ar_ofc_cd_text" id="ar_ofc_cd_text" type="text" style="width:65px;" class="input2" readonly></div>
						<div id="arOfcCdDiv2" style="display:none"><script type="text/javascript">ComComboObject('ar_ofc_cd', 1, 80, 1, 3);</script></div>
					</td>
					<td></td>
				</tr>
			</tbody>
		</table>
		<table> 
			<colgroup>
					<col width="80" />
					<col width="150" />
					<col width="90" />
					<col width="130" />
					<col width="120" />
					<col width="140" />
					<col width="50" />
					<col width="60" />
					<col width="60" />
					<col width="60" />
					<col width="30" />
					<col width="40" />
					<col width="*" />
				</colgroup>
			<tbody>
				<tr>
					<th>Actual Cust.</th>
					<td colspan="5"><input name="act_cust_cnt_cd" id="act_cust_cnt_cd" type="text" style="width:30px;" class="input2" value="" readOnly tabIndex="-1" dataformat="enguponly"><input name="act_cust_seq" id="act_cust_seq" type="text" style="width:60px;" class="input2" value="" readOnly><button type="button" class="input_seach_btn" align="absmiddle" name="btns_cust" id="btns_cust"></button><!-- 
					 --><input name="cust_lgl_eng_nm" id="cust_lgl_eng_nm" type="text" style="width:300px;" class="input2" value="" readOnly tabIndex="-1"><input name="cust_rgst_no" id="cust_rgst_no" type="text" style="width:110px;" class="input2" value="" readOnly tabIndex="-1"></td>
					<th>Rev. Type</th>
					<td colspan="3" class = "sm pad_left_8"><input name="chk_rev_type" id="chk_rev_type" type="checkbox" value="A" class="trans" checked><label for ="chk_rev_type">All</label><input name="chk_rev_type" id="chk_rev_type" type="checkbox" value="B" class="trans" disabled="true"><label for ="chk_rev_type">B/L</label><input name="chk_rev_type" id="chk_rev_type" type="checkbox" value="C" class="trans" disabled="true"><label for ="chk_rev_type">C/A</label><input name="chk_rev_type" id="chk_rev_type" type="checkbox" value="D" class="trans" disabled="true"><label for ="chk_rev_type">DEM/DET</label><input name="chk_rev_type" id="chk_rev_type" type="checkbox" value="M" class="trans" disabled="true"><label for ="chk_rev_type">Mis</label></td>
					<td></td> <td></td> <td></td>
				</tr>
				<tr>
					<th>Credit Limit</th>
					<td><input name="cr_curr_cd" type="text" style="width:30px;" class="input2" value="" readOnly tabIndex="-1" dataformat="enguponly"><input name="cr_amt" type="text" style="width:80px;text-align:right;" class="input2" value="" readOnly tabIndex="-1"></td>
					<th>Credit Term</th> 
					<td class="stm">O/B&nbsp;<input name="ob_cr_term_dys" type="text" style="width:25px;text-align:right;" class="input2" value="" readOnly tabIndex="-1">&nbsp;I/B&nbsp;<input name="ib_cr_term_dys" type="text" style="width:25px;text-align:right;" class="input2" value="" readOnly tabIndex="-1">
					<th>Credit Office</th>
					<td><input name="cr_clt_ofc_cd" type="text" style="width:50px;" class="input2" value="" readOnly tabIndex="-1" dataformat="enguponly"></td>
					<th>Good</th> 
					<td><input name="good" type="text" style="width:45px;text-align:right;" class="input2" value="" readOnly tabIndex="-1"></td>
					<th>No-Good</th> 
					<td colspan="2"><input name="nogood" type="text" style="width:45px;text-align:right;" class="input2" value="" readOnly tabIndex="-1"></td>
					<th></th>
					<td></td>
				</tr>
				<tr>
					<th>Local VVD</th>
					<td><input name="vvd" type="text" style="width:114px;" class="input2" value="" readonly tabindex="-1" id="vvd" dataformat="engup"/> </td>
					<th>Scope</th>
					<td><input name="svc_scp_cd" type="text" style="width:50px;" class="input2" value="" readonly tabindex="-1" id="svc_scp_cd" /> </td>
					<th>Bound</th>
					<td><input name="io_bnd_cd" type="text" style="width:50px;" class="input2" value="" readonly tabindex="-1" id="io_bnd_cd" /> </td>
					<th>S/A Date</th>
					<td colspan="5"><input name="sail_arr_dt" type="text" style="width:72px;" class="input2" value="" readonly tabindex="-1" id="sail_arr_dt" /> </td>
					<td></td>
				</tr>
				<tr>
					<th>Trunk VVD</th>
					<td><input name="trunk_vvd" id="trunk_vvd" type="text" style="width:114px;" class="input2" value="" readOnly tabIndex="-1"></td>
					<th>Lane</th> 
					<td><input name="slan_cd" id="slan_cd" type="text" style="width:50px;" class="input2" value="" readOnly tabIndex="-1"></td> 
					<th>POR / POL</th>
					<td><input name="por_cd" id="por_cd" type="text" style="width:50px;" class="input2" value="" readOnly tabIndex="-1">/ <input name="pol_cd" id="pol_cd" type="text" style="width:45px;" class="input2" value="" readOnly tabIndex="-1"></td>
					<th>POD / DEL</th>
					<td colspan="5"><input name="pod_cd" id="pod_cd" type="text"style="width:50px;" class="input2" value="" readOnly tabIndex="-1">/ <input name="del_cd" id="del_cd" type="text"style="width:50px;" class="input2" value="" readOnly tabIndex="-1"></td>
					<td></td>
				</tr>
				<tr>
					<th>Weight</th>
					<td><input name="cgo_wgt" id="cgo_wgt" type="text" style="width:114px;text-align:right;" class="input2" value="" readOnly tabIndex="-1"></td> 
					<th>Measure</th>
					<td><input name="cgo_meas_qty" id="cgo_meas_qty" type="text" style="width:104px;text-align:right;" class="input2" value="" readOnly tabIndex="-1"></td>
					<th>Ex. Rate(USD:LCL)</th> 
					<td><input name="usd_xch_rt" id="usd_xch_rt" type="text" style="width:70px;text-align:right;" class="input2" value="" readOnly tabIndex="-1"><input name="xch_rt_usd_tp_cd" id="xch_rt_usd_tp_cd" type="text" style="width:30px;" class="input2" value="" readOnly tabIndex="-1"></td>
					<th>TEU / FEU</th> 
					<td colspan="5"><input name="bkg_teu_qty" id="bkg_teu_qty" type="text" style="width:50px;text-align:right;" class="input2" value="" readOnly tabIndex="-1">/ <input name="bkg_feu_qty" id="bkg_feu_qty" type="text" style="width:50px;text-align:right;" class="input2" value="" readOnly tabIndex="-1"><!-- 
					 --><button type="button" class="input_seach_btn" align="btns_container" name="btns_container" id="btns_container"></button></td>
					<td></td>
				</tr>
				<tr>
					<th>Sales Rep.</th>
					<td><input name="srep_cd" type="text" style="width:114px;" class="input2" value="" readonly tabindex="-1" id="srep_cd" /> </td>
					<th>RFA No.</th>
					<td><input name="rfa_no" type="text" style="width:104px;" class="input2" value="" readonly tabindex="-1" id="rfa_no" /> </td>
					<th>S/C No.</th>
					<td><input name="sc_no" type="text" style="width:104px;" class="input2" value="" readonly tabindex="-1" id="sc_no" /> </td>
					<th>CTRT Office</th>
					<td><input name="ctrt_ofc_cd" type="text" style="width:50px;" class="input2" value="" readonly tabindex="-1" id="ctrt_ofc_cd" /> </td>
					<th>Credit Agreement No.</th> 
                    <td colspan="2"><input name="cust_agmt_no" type="text" style="width:104px;" class="input2" value="" readOnly tabIndex="-1"></td>
                    <th></th>
                    <td></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
<!-- inquiry_area(E) -->

<div class="wrap_result">
	<!-- opus_design_tab(S) -->
	<div class="opus_design_tab">
	    <script type="text/javascript">ComTabObject('tab1')</script>
	</div>
	
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid" >
		<!-- opus_grid_design_btn(S) -->
		<div id="tabLayer" style="display:inline">		
			<div class="opus_design_grid">
				<% if(view_bl_src_no.equals("") && view_ar_ofc_cd.equals("")){%>
				<div class="opus_design_btn">
					<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button>
					<button type="button" class="btn_normal" name="btn_t1new" id="btn_t1new">New</button>
				</div>
				<% } else { %>
				<!-- opus_grid_btn(S) -->
				<div class="opus_design_btn">
					<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button>
					<button type="button" class="btn_normal" name="btn_t1new" id="btn_t1new">New</button>
					<button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button>
				</div>
				<!-- opus_grid_btn(E) -->
				<% } %>
			</div>
			<div class="layout_wrap">
			<div class="layout_vertical_2" style="width:45%"> <!-- setting : FIXED width(300px) -->
		       <!-- opus_design_grid(S) -->
		       <div class="opus_design_grid">
		           <script type="text/javascript">ComSheetObject('t1sheet1');</script>
		       </div>
		       <!-- opus_design_grid(E) -->
		   </div>
		   <!-- layout_flex_fixed(E) -->
		   <!-- layout_flex_fixed(S) -->
		   <div class="pad_left_8 layout_vertical_2" style="width:55%"> <!-- setting : FIXED width(300px) -->
		       <!-- opus_design_grid(S) -->
		       <div class="opus_design_grid">
		           <script type="text/javascript">ComSheetObject('t1sheet2');</script>
		       </div>
		       <!-- opus_design_grid(E) -->
		   </div>
		   </div>
		</div>
		<!--TAB History (S) -->
		<div id="tabLayer" style="display:none">
						
		<% if(view_bl_src_no.equals("") && view_ar_ofc_cd.equals("")){%>
		<div class="opus_design_btn">
				<button type="button" class="btn_normal" name="btn_paymentsts" id="btn_paymentsts">Payment STS Inquiry</button><!-- 
				 --><button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!-- 
				 --><button type="button" class="btn_normal" name="btn_t2new" id="btn_t2new">New</button><!-- 
				 --><button type="button" class="btn_normal" name="btn_t2downexcel" id="btn_t2downexcel">Down Excel</button><!-- 
				 --><button type="button" class="btn_normal" name="btn_t2history" id="btn_t2history">History</button><!-- 
				 --><button type="button" class="btn_normal" name="btn_t2sysclear" id="btn_t2sysclear">Hide Sys Clear</button>
			</div>
		<% } else { %>
		<!-- opus_grid_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_paymentsts" id="btn_paymentsts">Payment STS Inquiry</button><!-- 
				 --><button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!-- 
				 --><button type="button" class="btn_normal" name="btn_t2new" id="btn_t2new">New</button><!-- 
				 --><button type="button" class="btn_normal" name="btn_t2downexcel" id="btn_t2downexcel">Down Excel</button><!-- 
				 --><button type="button" class="btn_normal" name="btn_t2history" id="btn_t2history">History</button><!-- 
				 --><button type="button" class="btn_normal" name="btn_t2sysclear" id="btn_t2sysclear">Hide Sys Clear</button><!-- 
				 --><button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button>
		</div>
		<!-- opus_grid_btn(E) -->
		<% } %>
		
		<div> <!-- setting : FIXED width(300px) -->
	       <!-- opus_design_grid(S) -->
	       <div class="opus_design_grid">
	           <script type="text/javascript">ComSheetObject('t2sheet1');</script>
	       </div>
	       <!-- opus_design_grid(E) -->
	   </div>		
		<div class="layout_flex_fixed"> <!-- setting : FIXED width(300px) -->
		       <!-- opus_design_grid(S) -->
		       <div>
		       <table>
		       	<tr>
		       		<td align="right">
		       		
			       		<div class="opus_design_grid">   
				           <script type="text/javascript">ComSheetObject('t2sheet2');</script>
				       </div>
		       		</td>
		       	</tr>
		       </table>
		       
		       </div>
		       <!-- opus_design_grid(E) -->
		   </div>
		   
		
		</div>
		<!-- opus_grid_design_btn(E) -->
	</div>
	<!-- opus_design_grid(E) -->
</div>
	
<% if(view_bl_src_no.equals("") && view_ar_ofc_cd.equals("")){%>
<% } else { %>
</div>
<% } %>
	
<!--TAB History (E) --> 
<!-- Container (S) -->
<!-- opus_design_grid(S) -->
<div class="wrap_result" style="display:none">
	<div class="opus_design_grid clear" >
			<script type="text/javascript">ComSheetObject('sheet3');</script>
	</div>
</div>
<!-- opus_design_grid(E) -->				

<!-- Container (E) -->	
</form>