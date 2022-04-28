<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0071.jsp
*@FileTitle  : Miscellaneous Revenue Invoice Creation
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/05
=========================================================*/
%>


<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicecreation.manualarcreation.event.FnsInv0071Event"%>
<%@ page import="org.apache.log4j.Logger"%>
<%@ page import="com.clt.framework.component.util.StringUtil" %>
<%@ page import="com.clt.apps.opus.bcm.sup.valuemanage.util.ConstantMgr"%>

<%
	FnsInv0071Event event = null; //PDTO(Data Transfer Object including Parameters)
	Exception serverException = null; // Errors from server.
	String strErrMsg = ""; // Error message.
	int rowCount = 0; // DB ResultSet list count

	String successFlag = "";
	String codeList = "";
	String pageRows = "100";

	String strUsr_id = "";
	String strUsr_nm = "";
	String strCnt_cd = "";

	String arIfNo = "";
	String classId = "";
	String pArOfcCd = "";

	Logger log = Logger
			.getLogger("com.clt.apps.AccountReceivableInvoiceCreation.ManualARCreation");

	try {
		SignOnUserAccount account = (SignOnUserAccount) session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id = account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		strCnt_cd = account.getCnt_cd();

		arIfNo = StringUtil.xssFilter(request.getParameter("ar_if_no"));
		if (arIfNo == null) {
			arIfNo = "";
		}

		classId = StringUtil.xssFilter(request.getParameter("classId"));
		if (classId == null) {
			classId = "";
		}

		pArOfcCd = StringUtil.xssFilter(request.getParameter("ar_ofc_cd"));
		if (pArOfcCd == null) {
			pArOfcCd = "";
		}

		event = (FnsInv0071Event) request.getAttribute("Event");
		serverException = (Exception) request
				.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException)
					.loadPopupMessage();
		}

		// Get data from server. ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request
				.getAttribute("EventResponse");

	} catch (Exception e) {
		out.println(e.toString());
	}
%>

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
    <input type="hidden" name="f_cmd" id="f_cmd" />
    <input type="hidden" name="pagerows" id="pagerows" />
    <input type="hidden" name="pagetype" value="E" id="pagetype" />
    <input type="hidden" name="ar_ofc_cd2" id="ar_ofc_cd2" />
    <input type="hidden" name="svr_id" id="svr_id" />
    <input type="hidden" name="rhq_cd" id="rhq_cd" />
    <input type="hidden" name="ofc_cd" id="ofc_cd" />
    <input type="hidden" name="bnd" id="bnd" />
    <input type="hidden" name="p_chg_cd" id="p_chg_cd" />
    <input type="hidden" name="inv_cust_cnt_cd" id="inv_cust_cnt_cd" />
    <input type="hidden" name="inv_cust_seq" id="inv_cust_seq" />
    <input type="hidden" name="curr_cd" id="curr_cd" />
    <input type="hidden" name="lcl_curr" id="lcl_curr" />
    <input type="hidden" name="usd_exrate_type" id="usd_exrate_type" />
    <input type="hidden" name="third_exrate_type" id="third_exrate_type" />
    <input type="hidden" name="ex_rate_date" id="ex_rate_date" />
    <input type="hidden" name="ex_rate" id="ex_rate" />
    <input type="hidden" name="str_usr_nm" value="<%=strUsr_nm%>" id="str_usr_nm" />
    <input type="hidden" name="select_row" id="select_row" />
    <input type="hidden" name="c_flag" value="Y" id="c_flag" />
    <input type="hidden" name="vvd" id="vvd" />
    <input type="hidden" name="port" id="port" />
    <input type="hidden" name="classId" value="<%=classId%>" id="classId" />
    <input type="hidden" name="p_ar_ofc_cd" value="<%=pArOfcCd%>" id="p_ar_ofc_cd" />
    <input type="hidden" name="dp_prcs_knt" value="" id="dp_prcs_knt" />
    <input type="hidden" name="delt_flg" value="" id="delt_flg" />
    <input type="hidden" name="rev_src_cds" value="" id="rev_src_cds" />
    <input type="hidden" name="local_time" value="" id="local_time" />
    <input type="hidden" name="exist_yn" value="" id="exist_yn" />
    <input type="hidden" name="blck_chg" value="" id="blck_chg" />
    <input type="hidden" name="bl_inv_cfm_dt" value="" id="bl_inv_cfm_dt" />
    <input type="hidden" name="state" value="" id="state" />
    <input type="hidden" name="bkg_no" value="" id="bkg_no" />
    <input type="hidden" name="chg_cds" value="" id="chg_cds" />
    <input type="hidden" name="curr_cds" value="" id="curr_cds" />
    <input type="hidden" name="per_tp_cds" value="" id="per_tp_cds" />
    <input type="hidden" name="inv_svc_scp_cd" value="" id="inv_svc_scp_cd" />
    <input type="hidden" name="loc_cd" value="" id="loc_cd" />
    <input type="hidden" name="eff_dt_tmp" value="" id="eff_dt_tmp" />
    <input type="hidden" name="tmp_bl_src_no" value="" id="tmp_bl_src_no" />
    <input type="hidden" name="iva_rate" value="" id="iva_rate" />
    <input type="hidden" name="office_cnt_cd" value="" id="office_cnt_cd" />
    <input type="hidden" name="tmp_gst_expt_cd" value="" id="tmp_gst_expt_cd" />
<!-- Tax Exemption 관련  -->
	<input type="hidden" name="tax_cnt_flg" id="tax_cnt_flg" /> 
	<input type="hidden" name="tax_exp_flg" id="tax_exp_flg" /> 
	
	<input type="hidden" name="cntr_if_no" id="cntr_if_no" /> 
    <!-- page_title_area(S) -->
<div class="page_title_area clear">

	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" name="btn_auto" id="btn_auto" type="button">Auto B/L No.</button><!--
	--><button class="btn_normal" name="btn_new" id="btn_new" type="button">New</button><!--
	--><button class="btn_normal" name="btn_save" id="btn_save" type="button">Save</button><!--
	--></div>
<!-- opus_design_btn (E) -->

	<!-- page_location(S) -->
	<div class="location">	
		<span id="navigation"></span>
	</div>
	<!-- page_location(E) -->
	
</div>
<!-- page_title_area(E) -->

<div class="wrap_search_tab">
	<div class="opus_design_inquiry wFit ">
			<table>
			<colgroup>
				<col width="50"/>
				<col width="50"/>
				<col width="50"/>
				<col width="50"/>
				<col width="50"/>
				<col width="*" />
			</colgroup>
				<tr>
					<th>B/L No.</th>
					<td><input type="text" value="" class="input" style="width: 130px;" name="bl_no" maxlength="12" dataformat="engup" id="bl_no" /> </td>
					<th>I/F No.</th>
					<td><input type="text" class="input2" style="width: 120px;" value="<%=arIfNo%>" maxlength="11" name="ar_if_no" readonly id="ar_if_no" /> </td>
					<th>Office</th>
					<td><script type="text/javascript">ComComboObject('ar_ofc_cd', 1, 100, 0);</script></td>
				</tr>
			</table>
	</div>
</div>

<div class="wrap_result">
<div class="opus_design_tab">
	<script type="text/javascript">ComTabObject('tab1')</script>
</div>
<div class="opus_design_grid clear" name="tabLayer" id="tabLayer">
<div class="opus_design_inquiry " >		
		<table class="wFit">
		<colgroup>
          <col width="90" />
          <col width="50" />
          <col width="90" />
          <col width="50" />
          <col width="90" />
          <col width="50" />
          <col width="90" />
          <col width="50" />
          <col width="90" />
          <col width="*" />
        </colgroup>		
			<tr>
				<th>Actual Cust.</th>
				<td colspan="5"><input type="text" style="width: 35px;" class="input1" name="cust_cnt_cd" maxlength="2" dataformat="engup" value="" id="cust_cnt_cd" /><!-- 
								 --><input type="text" style="width: 60px;" class="input1" name="cust_seq" maxlength="6" dataformat="num" value="" id="cust_seq" /><!-- 
								 --><button type="button" id="popup1" name="popup1" class="input_seach_btn" onclick="javascript:openFnsInv0013();"></button><!-- 
								 --><input type="text" style="width: 263px;" class="input2" value="" name="cust_nm" readonly id="cust_nm" /><!-- 
								 --><input type="text" style="width: 124px;" class="input1" value="" name="cust_rgst_no" maxlength="20" id="cust_rgst_no" /><!-- 
								 --><button type="button" id="popup2" name="popup2" class="input_seach_btn" onclick="javascript:openFnsInv0086();"></button></td>

				<th>Rev. Type</th>
				<td align="left" colspan="6"><input type="text" class="input2"	style="width: 30;" name="rev_tp_cd" value="M" readonly><script type="text/javascript">ComComboObject('rev_src_cd', 1, 46, 1, 1);</script></td>

			</tr>
			<tr>
				<th>Credit Limit</th>
				<td><input type="text" style="width: 35px;" class="input2" value="" name="cr_curr_cd" readonly id="cr_curr_cd" /><input type="text" style="width: 110px; text-align: right;" class="input2" value="" name="cr_amt" readonly id="cr_amt" /> </td>
				<th>Credit Term</th>
				<td>O/B?<input type="text" style="width: 40px; text-align: right;" class="input2" value="" name="ob_cr_term_dys" readonly id="ob_cr_term_dys" /><label>I/B</label><input type="text" style="width: 40px; text-align: right;" class="input2" value="" name="ib_cr_term_dys" readonly id="ib_cr_term_dys" /> </td>
				<th>Credit Office</th>
				<td colspan="6"><input type="text" style="width: 80px;" class="input2" value="" name="cr_clt_ofc_cd" readonly id="cr_clt_ofc_cd" /> </td>
			</tr>
			<tr>
				<th>LCL VVD</th>
				<td><input type="text" style="width: 90px;" class="input1" value="" name="lcl_vvd" maxlength="9" dataformat="engup" id="lcl_vvd" /> </td>
				<th>Scope</th>
				<td><input type="text" style="width: 80px;" class="input1" value="" name="svc_scp_cd" maxlength="3" dataformat="engup" id="svc_scp_cd" /> </td>
				<th>Bound</th>
				<td width="132"><select style="width: 46;" class="input1" name="io_bnd_cd"  id="io_bnd_cd">
					<option value="O" selected>O/B</option>
					<option value="I">I/B</option>
				</select></td>
				<th>S/A Date</th>
				<td><input type="text" style="width: 80px;" class="input2" value="" name="sail_arr_dt" readonly id="sail_arr_dt" /> </td>
				<th>Trunk	VVD</th>
				<td><input type="text" style="width: 90px;" class="input" value="" name="trunk_vvd" maxlength="9" dataformat="engup" id="trunk_vvd" /> </td>
			</tr>
			<tr>
				<th>Master I/F No.</th>
				<td><input type="text" style="width: 90px;" class="input2" value="" name="mst_if_no" maxlength="11" dataformat="engup" readonly id="mst_if_no" /> </td>
				<th title="Place of Receipt">POR</th>
				<td><input type="text" style="width: 80px;" class="input" value="" name="por_cd" maxlength="5" dataformat="engup" id="por_cd" /> </td>
				<th title="Port of Loading">POL</th>
				<td><input type="text" style="width: 80px;" class="input1" value="" name="pol_cd" maxlength="5" dataformat="engup" id="pol_cd" /> </td>
				<th title="Port of Discharging">POD</th>
				<td><input type="text" style="width: 80px;" class="input1" value="" name="pod_cd" maxlength="5" dataformat="engup" id="pod_cd" /> </td>
				<th title="Place of Delivery">DEL</th>
				<td><input type="text" style="width: 80px;" class="input" value="" name="del_cd" maxlength="5" dataformat="engup" id="del_cd" /> </td>
			</tr>
			<tr>
				<th>Master INV</th>
				<td><input type="text" style="width: 120px;" class="input" value="" name="master_inv" id="master_inv" /> </td>
				<!-- <th>NYK Ref.</th>-->
				<th><%=ConstantMgr.getCompanyCode()%> Ref.</th>
				<td><input type="text" style="width: 160px;" class="input" value="<%=strUsr_nm%>" name="co_ref" id="co_ref" /> </td>
				<th>TEU</th>
				<td><input type="text" style="width: 80px; text-align: right;" class="input" value="" name="bkg_teu_qty" id="bkg_teu_qty" /> </td>
				<th>FEU</th>
				<td colspan="6"><input type="text" style="width: 57px; text-align: right;" class="input" value="" name="bkg_feu_qty" id="bkg_feu_qty" /><button type="button" id="popup3" name="popup3" class="input_seach_btn" onclick="javascript:openContainer();"></button></td>
			</tr>
			<tr>
				<th>INV Ref. No.</th>
				<td><input type="text" style="width: 120px;" class="input" value="" name="inv_ref_no" id="inv_ref_no" /> </td>
				<th>BKG Ref. No.</th>
				<td><input type="text" style="width: 160px;" class="input2" value="" name="bkg_ref_no" readonly id="bkg_ref_no" /> </td>
				<th>S/I Ref. No.</th>
				<td colspan="3"><input type="text" style="width: 277px;" class="input2" value="" name="si_ref_no" readonly id="si_ref_no" /> </td>
                <th id="tax_exp_mn">INV Exempt Tax</th>
                   	<td><input name="tax_exp_chk" id="tax_exp_chk" type="checkbox" value="" class="trans"  onblur="fn_tax_exp_chk();"> </td>
			</tr>
			<tr>
				<th>Description</th>
				<td colspan="9"><input type="text" style="width: 780px;" class="input" value="" name="inv_rmk" id="inv_rmk" /> </td>
			</tr>
			<tr>
				<th>Due Date</th>
				<td><input type="text" style="width: 80px;" class="input2" value="" name="due_dt" readonly id="due_dt" /> </td>
				<th>Eff. Date</th>
				<td><input type="text" style="width: 80px;" class="input2" value="" name="eff_dt" dataformat="ymd" maxlength="8" readonly id="eff_dt" /> </td>
				<th>Input Date</th>
				<td colspan="2"><input type="text" style="width: 80px;" class="input2" name="bl_inv_if_dt" value="" readonly id="bl_inv_if_dt" /> </td>
				<th id="ida_gst_expt_nm" >India Exempt Tax</th>
                <td colspan="3">
                    <input name="ida_gst_expt_cd" id="ida_gst_expt_cd" type="checkbox" value="" class="trans"  onblur="fn_ida_gst_expt_cd();">
                </td>
			</tr>
		</table>
	</div>
</div>
<div class="opus_design_grid clear" name="tabLayer" id="tabLayer">
<h3 style="margin-bottom:0" class="title_design">By Charge</h3>
	<!-- opus_design_btn (S) 
<!--	
	<div class="opus_design_btn" id="btn_layer_ib">
		<button class="btn_accent" name="btn_ib_all" id="btn_ib_all" type="button">ALL</button><!--
		--><!--<button class="btn_normal" name="btn_ib_ats" id="btn_ib_ats" type="button">ATS</button><!--
		--><!--<button class="btn_normal" name="btn_ib_dhs" id="btn_ib_dhs" type="button">DHS</button><!--
		--><!--<button class="btn_normal" name="btn_ib_sis" id="btn_ib_sis" type="button">SIS</button><!--
		--><!--<button class="btn_normal" name="btn_ib_ahc" id="btn_ib_ahc" type="button">AHC</button><!--
		--><!--<button class="btn_normal" name="btn_ib_whs" id="btn_ib_whs" type="button">WHS</button><!--
		--><!--<button class="btn_normal" name="btn_ib_psm" id="btn_ib_psm" type="button">PSM</button><!--
		--><!--</div>-->
	<!-- opus_design_btn (E) -->
	<!-- opus_design_btn (S) -->
<!--	<div class="opus_design_btn" id="btn_layer_ob">
		<button class="btn_accent" name="btn_ob_all" id="btn_ob_all" type="button">ALL</button><!--
		--><!--<button class="btn_normal" name="btn_ob_ats" id="btn_ob_ats" type="button">ATS</button><!--
		--><!--<button class="btn_normal" name="btn_ob_dhs" id="btn_ob_dhs" type="button">DHS</button><!--
		--><!--<button class="btn_normal" name="btn_ob_bcu" id="btn_ob_bcu" type="button">BCU</button><!--
		--><!--<button class="btn_normal" name="btn_ob_whs" id="btn_ob_whs" type="button">WHS</button><!--
		--><!--</div>
-->
	<!-- opus_design_btn (E) -->
		<!-- opus_design_btn (S) -->
		<div class="opus_design_btn">
			<button class="btn_accent" name="btn_add" id="btn_add" type="button">Row Add</button><!--
			--><button class="btn_normal" name="btn_del" id="btn_del" type="button">Delete</button><!--
			--></div>
		<!-- opus_design_btn (E) -->
		<script type="text/javascript">ComSheetObject('sheet2');</script>
	<div class="opus_design_grid clear" style= "width: 500px">
	<h3 style="margin-bottom:0" class="title_design mar_btm_8">By Currency</h3>
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
	</div>
	<div class="opus_design_grid clear" name="tabLayer" id="tabLayer" style="display: none">			
		<script type="text/javascript">ComSheetObject('sheet3');</script>
	</div>	
	
	<!--  20161005 validation 용으로 추가 Sync -->
	<div class="opus_design_grid clear" name="tabLayer" id="tabLayer" style="display: none">			
		<script type="text/javascript">ComSheetObject('sheet4');</script>
	</div>	
</div>
</form>
