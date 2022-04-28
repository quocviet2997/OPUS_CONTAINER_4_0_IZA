<%
/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0022.jsp
*@FileTitle  : Other Revenue Invoice Creation 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/23
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
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicecreation.manualarcreation.event.FnsInv0022Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.framework.component.util.StringUtil" %>


<%
	FnsInv0022Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			// Errors from server.
	String strErrMsg = "";						// Error message.
	int rowCount	 = 0;						// DB ResultSet list count
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";
	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceCreation.ManualARCreation");
	String classId = StringUtil.xssFilter(request.getParameter("classId"));
	String view_ar_if_no = StringUtil.xssFilter(request.getParameter("ar_if_no"));
	if(view_ar_if_no == null){
		view_ar_if_no = "";
	}
	String view_ar_ofc_cd = StringUtil.xssFilter(request.getParameter("ar_ofc_cd"));
	if(view_ar_ofc_cd == null){
		view_ar_ofc_cd = "";
	}
	String view_yn = "";
	if (view_ar_if_no != "" && view_ar_ofc_cd != "") {
		view_yn = "Y";
	}
	else {
		view_yn = "N";
	}
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		event = (FnsInv0022Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
	} catch(Exception e) {
		out.println(e.toString());
	}
%>
<script type="text/javascript" src="/opuscntr/rpt/script/common_rd.js"></script>
<script type="text/javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			showErrMessage(errMessage);
		} // end if
		loadPage();
	}
</script>
<form name="form">
<%
    if((view_ar_if_no.equals("") && view_ar_ofc_cd.equals(""))||classId.equals("FNS_INV_0022")){
%>

<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="pagetype" value="E" id="pagetype" />
<input type="hidden" name="ofc_cd" id="ofc_cd" />
<input type="hidden" name="ots_smry_cd" id="ots_smry_cd" />
<input type="hidden" name="inv_vat_chg_cd" id="inv_vat_chg_cd" />
<input type="hidden" name="inv_vat_chg_rt" id="inv_vat_chg_rt" />
<input type="hidden" name="tva_amount" value="0" id="tva_amount" />
<input type="hidden" name="svr_id" id="svr_id" />
<input type="hidden" name="usd_locl_xch_rt" id="usd_locl_xch_rt" />
<input type="hidden" name="curr_point" value="0" id="curr_point" />
<input type="hidden" name="lcl_curr_point" value="0" id="lcl_curr_point" />
<input type="hidden" name="office_cnt_cd" value="" id="office_cnt_cd" />
<input type="hidden" name="tmp_bl_src_no" value="" id="tmp_bl_src_no" />
<input type="hidden" name="view_ar_if_no" value="<%=view_ar_if_no %>" id="view_ar_if_no" />
<input type="hidden" name="view_ar_ofc_cd" value="<%=view_ar_ofc_cd %>" id="view_ar_ofc_cd" />
<input type="hidden" name="view_yn" value="<%=view_yn %>" id="view_yn" />
<input type="hidden" name="user_id" value="<%=strUsr_id%>" id="user_id" />
<input type="hidden" name="user_nm" value="<%=strUsr_nm%>" id="user_nm" />
<input type="hidden" name="tax_amount_ori" value="" id="tax_amount_ori" />
<input type="hidden" name="com_mrdPath" value="" id="com_mrdPath" />
<input type="hidden" name="com_mrdArguments" value="" id="com_mrdArguments" />
<input type="hidden" name="com_mrdTitle" value="" id="com_mrdTitle" />
<input type="hidden" name="com_mrdBodyTitle" value="" id="com_mrdBodyTitle" />
<input type="hidden" name="inv_prn_dvc_nm" value="" id="inv_prn_dvc_nm" />
<input type="hidden" name="fm_acct_end_dt" value="" id="fm_acct_end_dt" />
<input type="hidden" name="to_acct_end_dt" value="" id="to_acct_end_dt" />
<input type="hidden" name="ex_rate_date" id="ex_rate_date" />
<input type="hidden" name="ex_rate" id="ex_rate" />
<input type="hidden" name="usd_exrate_type" id="usd_exrate_type" />
<input type="hidden" name="third_exrate_type" id="third_exrate_type" />
<input type="hidden" name="dp_prcs_knt" value="" id="dp_prcs_knt" />
<input type="hidden" name="inv_cust_cnt_cd" id="inv_cust_cnt_cd" />
<input type="hidden" name="inv_cust_seq" id="inv_cust_seq" />
<input type="hidden" name="bkg_no" value="" id="bkg_no" />
<input type="hidden" name="pod_cd" value="" id="pod_cd" />

<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
		<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
		<!-- page_title(E) -->
		
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->
			<button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!--
			--><button type="button" class="btn_normal" name="btn_save" id="btn_save">Save</button><!--
			--><button type="button" class="btn_normal" name="btn_print1" id="btn_print1">Slip Print</button><!--
			--><button type="button" class="btn_normal" name="btn_create" id="btn_create">Inv No. Creation</button>
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
<%
	}else{
%>
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="pagetype" value="I" id="pagetype" />
<input type="hidden" name="ofc_cd" id="ofc_cd" />
<input type="hidden" name="ots_smry_cd" id="ots_smry_cd" />
<input type="hidden" name="inv_vat_chg_cd" id="inv_vat_chg_cd" />
<input type="hidden" name="inv_vat_chg_rt" id="inv_vat_chg_rt" />
<input type="hidden" name="tva_amount" value="0" id="tva_amount" />
<input type="hidden" name="svr_id" id="svr_id" />
<input type="hidden" name="usd_locl_xch_rt" id="usd_locl_xch_rt" />
<input type="hidden" name="curr_point" value="0" id="curr_point" />
<input type="hidden" name="lcl_curr_point" value="0" id="lcl_curr_point" />
<input type="hidden" name="office_cnt_cd" value="" id="office_cnt_cd" />
<input type="hidden" name="tmp_bl_src_no" value="" id="tmp_bl_src_no" />
<input type="hidden" name="view_ar_if_no" value="<%=view_ar_if_no %>" id="view_ar_if_no" />
<input type="hidden" name="view_ar_ofc_cd" value="<%=view_ar_ofc_cd %>" id="view_ar_ofc_cd" />
<input type="hidden" name="view_yn" value="<%=view_yn %>" id="view_yn" />
<input type="hidden" name="user_nm" value="<%=strUsr_nm%>" id="user_nm" />
<input type="hidden" name="tax_amount_ori" value="" id="tax_amount_ori" />
<input type="hidden" name="com_mrdPath" value="" id="com_mrdPath" />
<input type="hidden" name="com_mrdArguments" value="" id="com_mrdArguments" />
<input type="hidden" name="com_mrdTitle" value="" id="com_mrdTitle" />
<input type="hidden" name="com_mrdBodyTitle" value="" id="com_mrdBodyTitle" />
<input type="hidden" name="inv_prn_dvc_nm" value="" id="inv_prn_dvc_nm" />
<input type="hidden" name="ex_rate_date" id="ex_rate_date" />
<input type="hidden" name="ex_rate" id="ex_rate" />
<input type="hidden" name="usd_exrate_type" id="usd_exrate_type" />
<input type="hidden" name="third_exrate_type" id="third_exrate_type" />
<input type="hidden" name="dp_prcs_knt" value="" id="dp_prcs_knt" />
<input type="hidden" name="inv_cust_cnt_cd" id="inv_cust_cnt_cd" />
<input type="hidden" name="inv_cust_seq" id="inv_cust_seq" />
<input type="hidden" name="bkg_no" value="" id="bkg_no" />
<input type="hidden" name="pod_cd" value="" id="pod_cd" />
 
 						
 <!-- popup_title_area(S) -->
 <div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title"><span>Other Revenue Invoice</span></h2>
		<!-- page_title(E) -->
			
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_print2" id="btn_print2">Slip Print</button><!--
			--><button type="button" class="btn_normal" name="btn_create" id="btn_create">Inv No. Creation</button><!--
			--><button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button>
		</div>
		<!-- opus_design_btn(E) -->	
	</div>
	<!-- page_title_area(E) -->
</div>
<!-- popup_title_area(E) -->

<%
	}
%>

<div class="wrap_search">
<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry wFit">
	    <table>
	        <colgroup>
	            <col width="100">
	            <col width="110">
	            <col width="257">
	            <col width="100">
	            <col width="78">
	            <col width="40">
	            <col width="*">
	        </colgroup>
	        <tbody>
				<tr>
					<th>B/L No.</th>
					<td><input name="bl_src_no" id="bl_src_no" type="text" style="width:98px;" class="input1" dataformat="engup" maxlength="12" value=""><button type="button" class="btn_etc" name="btn_auto" id="btn_auto">Auto B/L No.</button></td>
					<th>I/F No.</th>
					<td><input name="ar_if_no" id="ar_if_no" type="text" style="width:106px;" class="input2" dataformat="engup" maxlength="11" value=""></td>
					<th>Office</th>
					<td><script type="text/javascript">ComComboObject('ar_ofc_cd', 1, 100, 0, 1);</script></td>
					<td></td>
				</tr>
			</tbody>
			</table>
			<table>
	        <colgroup>
	            <col width="100" />
	            <col width="110" />
	            <col width="251" />
	            <col width="100" />
	            <col width="80" />
	            <col width="40" />
	            <col width="*" />
	        </colgroup>
	        <tbody>
				<tr>
					<th>G/L Date</th>
					<td><input name="eff_dt" id="eff_dt" type="text" style="width:75px;text-align:left" class="input1" dataformat="ymd" maxlength="8" value=""><button type="button" class="calendar ir" name="btns_calendar" id="btns_calendar"></button></td>
					<td></td>
					<th>Actual Cust.</th>
					<td><input name="cust_cnt_cd" id="cust_cnt_cd" type="text" style="width:40px;text-align:left" class="input1" value="" maxlength="2" dataformat="engup"><input name="cust_seq" id="cust_seq" type="text" style="width:51px;text-align:left" class="input1" maxlength="6" class="input" value="" dataformat="num"><button type="button" class="input_seach_btn" name="btns_cust1" id="btns_cust1"></button><input name="cust_nm" id="cust_nm" type="text" style="width:350px;" class="input2" value="" readonly><button type="button" class="input_seach_btn" name="btns_cust2" id="btns_cust2"></button></td>
					<td></td>
					<td></td>
				</tr>
			</tbody>
			</table>
			<table>
	        <colgroup>
	            <col width="100" />
	            <col width="110" />
	            <col width="251" />
	            <col width="100" />
	            <col width="90" />
	            <col width="50" />
	            <col width="*" />
	        </colgroup>
	        <tbody>
				<tr>
					<th>Curr/Amount</th>
					<td><script type="text/javascript">ComComboObject('curr_cd', 1, 60, 0);</script><input name="amount" id="amount" type="text" style="width:180;text-align:right" class="input1" dataformat="float" value="" maxlength="14" pointcount="3" maxnum="99999999999.99"></td>
					<th>Local Amount</th>
					<td><input name="lcl_curr" id="lcl_curr" type="text" style="width:40px;text-align:left" class="input2" value="" readonly tabIndex="-1"><input name="local_amount" id="local_amount" type="text" style="width:166px;text-align:right" class="input2" value="" readonly tabIndex="-1"></td>
					<th>S/A Date</th>
					<td><input type="text" style="width: 80px;" class="input2" value="" name="sail_arr_dt" readonly id="sail_arr_dt" /> </td>
					<td></td>
				</tr>
			</tbody>
		</table>
		<table id="taxDiv1" class="search" border="0" style="width:1280px;display:none">
	        <colgroup>
	            <col width="100" />
	            <col width="160" />
	            <col width="210" />
	            <col width="100" />
	            <col width="*" />
	        </colgroup>
	        <tbody>
				<tr>
					<th>Tax</th>
					<td style="padding-left:2;"><script type="text/javascript">ComComboObject('ar_tax_ind_cd', 1, 60, 1);</script><input name="tax_curr_cd" type="text" style="width:40px;text-align:left" class="input2" value="" readonly tabIndex="-1"><input name="tax_amount" type="text" style="width:136px;text-align:right" class="input2" value="" readonly tabIndex="-1"></td>
					<th>Local Total</th> 
					<td><input name="total_curr_cd" type="text" style="width:40px;text-align:left" class="input2" value="" readonly tabIndex="-1"><input name="total_local_amt" type="text" style="width:166px;text-align:right" class="input2" value="" readonly tabIndex="-1">&nbsp;(Tax included)</td>
					<td></td>
				</tr>
			</tbody>
		</table>
		<table >
	        <colgroup>
	            <col width="100" />
	            <col width="110" />
	            <col width="350" />
	            <col width="100" />
	            <col width="54" />
	            <col width="90" />
		        <col width="60" />
		        <col width="90" />
		        <col width="50" />
	            <col width="" />
	        </colgroup>
	        <tbody>
				<tr>
					<th>Ex. Rate (to LCL)</th>
					<td><input name="inv_xch_rt" type="text" style="width:90px;text-align:right" class="input1" dataformat="float" value="" maxlength="12" pointcount="6" maxnum="99999999999"></td>
					<th title="Vessel Voyage Direction">VVD</th>
					<td><input name="lcl_vvd" type="text" style="width:96px;text-align:left" class="input1" maxlength="9" value="" dataformat="engup"></td>
					<th>Port</th>
					<td><input name="pol_cd" type="text" style="width:61px;text-align:left" class="input1" maxlength="5" value="" dataformat="engup"></td>
					<th>Scope</th>
					<td><input type="text" style="width: 50px;" class="input1" value="" name="svc_scp_cd" maxlength="3" dataformat="engup" id="svc_scp_cd" /> </td>
					<th>Bound</th>
					<td width="132"><select style="width: 46;" class="input1" name="io_bnd_cd"  id="io_bnd_cd">
						<option value="O" selected>O/B</option>
						<option value="I">I/B</option>
					</select></td>
					<td></td>
				</tr>
				
				<tr>
					<th>DR Account</th>
					<td colspan="9"><input name="acct_cd" type="text" style="width:90px;text-align:left" class="input2" value="" readonly tabIndex="-1"><input name="acct_eng_nm" type="text" style="width:472px;" class="input2" value="" readonly tabIndex="-1"></td>
				</tr>
				<tr>
					<th>Remark(s)</th>
					<td colspan="9"><input name="inv_rmk" type="text" style="width:566px;" class="input1" value="" maxlength="80"></td>
				</tr>
			</tbody>
		</table>
	    
	    <table id="taxDiv2" class="search" border="0" style="width:979;display:block">
		<tr>
			<td width="">&nbsp;</td>
		</tr>
		</table>
	</div>
	<!-- opus_design_inquiry(E) -->
</div>
	
<div class="wrap_result">
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid">
	    <!-- opus_grid_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_add" id="btn_add">Row Add</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_copy" id="btn_copy">Row Copy</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_delete" id="btn_delete">Row Delete</button>
		</div>
		<!-- opus_grid_btn(E) -->
	    <script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
	<!-- opus_design_grid(E) -->
	
	<!-- opus_design_grid(S) -->
	<div class="opus_design_inquiry">
		<div class="layout_vertical_2">	
		<h3 class="title_design">DR</h3>
		<script type="text/javascript">ComSheetObject('sheet2');</script>
		</div>	
		<div class="layout_vertical_2">	
		<h3 class="title_design">CR</h3>
		<script type="text/javascript">ComSheetObject('sheet3');</script>
		</div>						
		
		</div>
		<table class="line_bluedot"><tr><td></td></tr></table>
	    
				
	
	<!-- opus_design_grid(E) -->

	<!-- data_area(S) -->
	<div class="opus_design_inquiry wFit">
		<table> 
			<tr>
				<td width="360px">
					<table class="search" border="0" style="width:100%;"> 
					<tr>
						<td width="80px"><strong>Slip No.</strong></td>
						<td width=""><input name="slp_no" type="text" style="width:188px;text-align:left" class="input2" value="" readonly tabIndex="-1"></td>
					</tr>
					</table>
				</td>
				<td width="">
					<table id="invNoDiv" class="search" border="0" style="width:100%;display:none"> 
					<tr>
						<td width="100px">Invoice No.&nbsp;</td>
						<td width=""><input name="inv_no" type="text" style="width:120px;text-align:left" class="input2" value="" readonly tabIndex="-1"></td>
					</tr>
					</table>
				</td>
			</tr></table>
			</div>
			<!-- Tab BG Box(E) -->

	<!-- data_area(E) -->
<!-- opus_design_grid(S) -->
	<div class="opus_design_grid" style="display:none;">
	   <script type="text/javascript">ComSheetObject('sheet4');</script>
	
	<!-- opus_design_grid(E) -->

	</div>
	
</div>

<div class="opus_design_RD" >
      <script language="javascript">comRdObject('Rdviewer');</script> 
<div>

</form>