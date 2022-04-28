<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0018.jsp
*@FileTitle  : Invoice Split Before Invoice Issue 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/10
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.arinvoicecorrection.event.FnsInv0018Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.framework.component.util.StringUtil" %>
<%@ page import="com.clt.apps.opus.bcm.sup.valuemanage.util.ConstantMgr"%>

<%
	FnsInv0018Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;		
	String strErrMsg = "";					
	int rowCount	 = 0;					
	
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String loginOfcCd = "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMgt.ARInvoiceCorrection");
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		loginOfcCd = account.getOfc_cd();	   
	   
		event = (FnsInv0018Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
		
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		
	}catch(Exception e) {
		out.println(e.toString());
	}
	
	String arIfNo = StringUtil.xssFilter(request.getParameter("ar_if_no"));
	String issToSplitFlg = StringUtil.xssFilter(request.getParameter("iss_to_split_flg"));
	String invDeltDivCd = StringUtil.xssFilter(request.getParameter("inv_delt_div_cd"));
	
	if(issToSplitFlg == null || ("").equals(issToSplitFlg)) issToSplitFlg = "N";
	
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
<input type="hidden" name="pagetype" value="" id="pagetype" />
<input type="hidden" name="ofc" id="ofc" />
<input type="hidden" name="ofc_cd" id="ofc_cd" />
<input type="hidden" name="cust_cnt_cd" id="cust_cnt_cd" />
<input type="hidden" name="cust_seq" id="cust_seq" />
<input type="hidden" name="svr_id" id="svr_id" />
<input type="hidden" name="ar_ofc_cd2" id="ar_ofc_cd2" />
<input type="hidden" name="inv_nos" id="inv_nos" />
<input type="hidden" name="invoice_nos" id="invoice_nos" >
<input type="hidden" name="bl_nos" id="bl_nos" />
<input type="hidden" name="user_nm" value="<%=strUsr_nm%>" id="user_nm" />
<input type="hidden" name="bnd" value="A" id="bnd" />
<input type="hidden" name="max_seq" id="max_seq" />
<input type="hidden" name="cancel_if_no" id="cancel_if_no" />
<input type="hidden" name="frm_sail_dt" id="frm_sail_dt" />
<input type="hidden" name="user_id" value="<%=strUsr_id%>" id="user_id" />
<input type="hidden" name="if_user_id" id="if_user_id" />
<input type="hidden" name="invs_email" id="invs_email" />
<input type="hidden" name="state" id="state" />
<input type="hidden" name="ots_smry_cd" id="ots_smry_cd" />
<input type="hidden" name="inv_dup_flg" id="inv_dup_flg" />
<input type="hidden" name="inv_mlt_bl_iss_flg" id="inv_mlt_bl_iss_flg" />
<input type="hidden" name="backendjob_key" id="backendjob_key" />
<input type="hidden" name="email_flag" value="N" id="email_flag" />
<input type="hidden" name="login_ofc_cd" value="<%=loginOfcCd%>" id="login_ofc_cd" />
<input type="hidden" name="print_nm" id="print_nm" />
<input type="hidden" name="locl_curr_cd" id="locl_curr_cd" />
<input type="hidden" name="altn_curr_div_cd" id="altn_curr_div_cd" />
<input type="hidden" name="custListsheetId" id="custListsheetId" value="s0sheet6_" >  <!-- Multi시 이용. 0034_01의 sheet와 이곳의 sheet ID가 다름. param으로 넘김. 주의요망  -->
<input type="hidden" name="office_cnt_cd"  id="office_cnt_cd" /> 
<input type="hidden" name="iss_to_split_flg" value="<%=issToSplitFlg%>" id="iss_to_split_flg" />
<input type="hidden" name="org_if_no_list"  id="org_if_no_list" />
<input type="hidden" name="cxl_if_no_list"  id="cxl_if_no_list" />
<input type="hidden" name="inv_curr_cd"  id="inv_curr_cd" />
<input type="hidden" name="max_if_no"  id="max_if_no" />
<input type="hidden" name="inv_delt_div_cd" value="<%=invDeltDivCd%>" id="inv_delt_div_cd" />
<!-- Tax Exemption 관련  -->
<input type="hidden" name="tax_cnt_flg" id="tax_cnt_flg" /> 
<input type="hidden" name="tax_exp_flg" id="tax_exp_flg" /> 

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn"> 
		<button type="button" class="btn_accent" name="btn_retrive" 	id="btn_retrive">Retrieve</button><!--
		--><button type="button" class="btn_normal" name="btn_new"  		id="btn_new">New</button><!--
		--><button type="button" class="btn_normal" name="btn_save" 		id="btn_save">Save</button><!--		
		--><button type="button" class="btn_normal" name="btn_paper" 		id="btn_paper">Paper Issue</button><!--
		--><button type="button" class="btn_normal" name="btn_go"  		id="btn_go">Go to Send</button>		
	</div>
	<!-- opus_design_btn(E) -->
	<!-- page_location(S) -->
	<div class="location">
		<span id="navigation"></span>
	</div>
	<!-- page_location(E) -->
</div>
<!-- page_title_area(E) -->

<!-- opus_design_inquiry(S) -->
<div class= "wrap_search">
	<div class= "opus_design_inquiry">
		<table>
			<tbody>
				<colgroup>
					<col width="80px"/>
					<col width="130px"/>
					<col width="55px"/>
					<col width="120px"/>
					<col width="60px"/>
					<col width="140px"/>
					<col width="85px"/>
					<col width="120px"/>
					<col width="50px"/>
					<col width="*"/>
			    </colgroup>
				<tr>
						<th>I/F No.</th>
						<td><input type="text" style="width: 105px;" class="input1" name="if_no" value="<%=arIfNo%>" dataformat="engup" maxlength="11" id="if_no" /></td>
						<th>B/L No.</th>
						<td><input type="text" style="width: 100px;" class="input2" name="frm_bl_src_no" readonly id="frm_bl_src_no" /></td>
						<th>BKG No.</th>
						<td><input type="text" style="width: 105px;" class="input2" name="frm_bkg_no" readonly id="frm_bkg_no" /></td>
						<th>No. of Split</th>
						<td><input type="text" style="width: 25px;" class="input1" name="split_cnt" dataformat="num" maxlength="2" id="split_cnt" /></td>
						<th>Office</th>
						<td><script type="text/javascript">ComComboObject('ar_ofc_cd', 1, 100, 1, 1);</script></td>
				</tr>
				<tr >
						<th title="Vessel Voyage Direction">VVD</th>
						<td><input type="text" class="input2" style="width: 105px;" name="frm_local_vvd" readonly id="frm_local_vvd" /></td>
						<th>Port CD</th>
						<td><input type="text" class="input2" style="width: 100px;" name="frm_port_cd" readonly id="frm_port_cd" /></td>
						<th>S/A Date</th>
						<td><input type="text" class="input2" style="width: 105px;" name="frm_sail_arr_dt" readonly id="frm_sail_arr_dt" /></td>
						<th>Bound</th>
						<td colspan="3"><input type="text" class="input2" style="width: 103px;" name="frm_io_bnd_cd" readonly id="frm_io_bnd_cd" /></td>
				</tr>
				<tr>
					<th>Actual Cust.</th>
					<td colspan="3"><input type="text" style="width: 30px;" class="input2" name="frm_act_cust_cnt_cd" readonly id="frm_act_cust_cnt_cd"/><input type="text" style="width: 65px;" class="input2" name="frm_act_cust_seq" readonly id="frm_act_cust_seq" /><button type="button" id="btn_frmactcust" name="btn_frmactcust" class="input_seach_btn"></button><input type="text" style="width: 223px;" class="input2" name="frm_cust_nm" readonly id="frm_cust_nm" /></td>
					<th>INV Cust.</th>
					<td><input type="text" style="width: 30px;" class="input2" name="frm_inv_cust_cnt_cd" readonly id="frm_inv_cust_cnt_cd" /><input type="text" style="width: 70px;" class="input2" name="frm_inv_cust_seq" id="frm_inv_cust_seq" /></td>
					<th>TEU/FEU</th>
					<td colspan="3"><input type="text" style="width: 50px;" class="input2" name="frm_bkg_teu_qty" readonly id="frm_bkg_teu_qty" /><input type="text" style="width: 50px;" class="input2" name="frm_bkg_feu_qty" value="" readonly id="frm_bkg_feu_qty" /><button type="button" id="btn_container" name="btn_container" class="input_seach_btn"></button></td>
				</tr>
			</tbody>
		</table>
		<!-- layout_wrap(S) -->
		<div class="layout_wrap">
		    <div class="layout_vertical_2" >
				<div class="opus_design_grid" >
					<script type="text/javascript">ComSheetObject('sheet1');</script>
					<script type="text/javascript">ComSheetObject('sheet2');</script>
					<script type="text/javascript">ComSheetObject('sheet3');</script>
					<script type="text/javascript">ComSheetObject('sheet4');</script>
				</div>
				<!-- opus_design_grid(E) -->
		    </div>
		    <div class="layout_vertical_2 mar_left_12" style="width:300px">
		        <table>
					<tbody>
						<colgroup>
							<col width="80px"/>
							<col width="*"/>
					    </colgroup>
						<tr>
							<th>RFA No.</th>
							<td><input type="text" style="width: 103px;" class="input2" name="frm_rfa_no" readonly id="frm_rfa_no" /><button type="button" id="btn_rfano" name="btn_rfano" class="input_seach_btn"></button></td>
 						</tr>
 						<tr>
							<th>S/C No.</th>
							<td><input type="text" style="width: 103px;" class="input2" name="frm_sc_no" readonly id="frm_sc_no" /><button type="button" id="btn_scno" name="btn_scno" class="input_seach_btn"></button></td>
						</tr>
						<tr>
							<th>Master Total</th>
							<td valign="top">
								<div id="mst_sum" ></div>
							</td>
						</tr>
						<tr>
							<th>&nbsp;</th>
							<td valign="top">&nbsp;</td>
						</tr>
						<tr id="tax_cnt_area" border="0" style="display:block">>
							<th>Exempt Tax</th>
							<td><input name="tax_exp_chk" id="tax_exp_chk" type="checkbox" value="" class="trans" onblur="fn_tax_exp_chk();"></td>
						</tr>
					</tbody>
				</table>
		    </div>
		</div>
		<!-- layout_wrap(E) -->
	</div>
</div>

<!-- opus_design_inquiry(E) -->
<div class="wrap_result">
	<!-- opus_tab_btn(S) -->
		<div class="opus_design_tab">
			<script type="text/javascript">ComTabObject('tab1')</script>
		</div>
	<!-- opus_tab_btn(E) -->
	<div id="tabLayer" style="display:none">
		<!-- opus_design_inquiry(S) -->
		<div class= "layout_wrap">
			<div class="layout_vertical_2" style="width:500px">
				<div class="opus_design_inquiry" >
				<table>
					<tbody>

						<tr>
							<th>Actual Cust.</th>
							<td colspan="3">
							<input type="text" style="width: 30px;" class="input1" dataformat="engup" name="act_cust_cnt_cd" onblur="fn_act_cust_chg();"  maxlength="2" onkeyup="javascript:checkCustLeng(this.value)" id="act_cust_cnt_cd" /><!--
							--><input type="text" style="width: 65px;" class="input1" name="act_cust_seq" onblur="fn_act_cust_chg();" value="" maxlength="6" dataformat="num" id="act_cust_seq" /><!--
							--><button type="button" id="btn_actcust" name="btn_actcust" class="input_seach_btn"></button><!--
							--><input type="text" style="width: 242px;" class="input2" name="cust_lgl_eng_nm" readonly id="cust_lgl_eng_nm" /><!--
							--><button type="button" id="btn_custNm" name="btn_custNm" class="input_seach_btn"></button>
							</td>
						</tr>
						<tr>
							<th>Issue Curr</th>
                        	<td><script type="text/javascript">ComComboObject('inv_curr_cd1', 1, 90, 1, 1);</script></td>
							<th>TEU/FEU</th>
							<td>
								<input type="text" style="width: 48px;" class="input2" name="bkg_teu_qty" readonly id="bkg_teu_qty" /><!--
								--><input type="text" style="width: 47px;" class="input2" name="bkg_feu_qty" readonly id="bkg_feu_qty" /><!--
								--><button type="button" id="btn_container_e" name="btn_container_e" class="input_seach_btn"></button>
								<input type="hidden" name="dflt_inv_curr_div_cd" id="dflt_inv_curr_div_cd" readonly>
								<input type="hidden" name="target_yn" id="target_yn" readonly style="width:48px;" >
							</td>
						</tr>
						<tr>
							<th width="90">INV Ref. No.</th>
							<td width="150"><input type="text" style="width: 123px;" class="input" name="inv_ref_no" id="inv_ref_no" /></td>
							<!-- <th width="100">NYK Ref.</th> -->
				            <th width="100"><%=ConstantMgr.getCompanyCode()%> Ref.</th>
							<td><input type="text" style="width: 131px;" class="input" name="co_stf_ctnt" id="co_stf_ctnt" /></td>
						</tr>
						<tr>
							<th>Description</th>
							<td colspan="3"><input type="text" style="width:389px;" class="input" name="inv_rmk" id="inv_rmk" /></td>
						</tr>									 
					</tbody>
				</table>
				</div>
			</div>
			<div class="layout_vertical_2" style="width:550px">
				<div class="opus_design_grid" >
					<script type="text/javascript">ComSheetObject('t0sheet1');</script>
				</div>
			</div>
		</div>
	</div>
	
	<div id="tabLayer" style="display:none">
		<div class= "layout_wrap">
			<div class="layout_vertical_2" style="width:500px">
				<div class="opus_design_inquiry" >
					<table>
					<tbody>
						<tr>
							<th>Actual Cust.</th>
							<td colspan="3">
								<input type="text" style="width: 30px;" class="input1" name="act_cust_cnt_cd" onblur="fn_act_cust_chg();" dataformat="engup" onkeypress="ComKeyOnlyAlphabet('upper')" maxlength="2" onkeyup="javascript:checkCustLeng(this.value)" id="act_cust_cnt_cd" /><!--
								--><input type="text" style="width: 65px;" class="input1" name="act_cust_seq" onblur="fn_act_cust_chg();" value="" maxlength="6" dataformat="num" id="act_cust_seq" /><!--
								--><button type="button" id="btn_actcust" name="btn_actcust" class="input_seach_btn"></button><!--
								--><input type="text" style="width: 242px;" class="input2" name="cust_lgl_eng_nm" readonly id="cust_lgl_eng_nm" /><!--
								--><button type="button" id="btn_custNm" name="btn_custNm" class="input_seach_btn"></button>
							</td>
						</tr>
						<tr>
							<th>Issue Curr</th>
                        	<td><script type="text/javascript">ComComboObject('inv_curr_cd2', 1, 90, 1, 1);</script></td>
							<th>TEU/FEU</th>
							<td>
								<input type="text" style="width: 48px;" class="input2" name="bkg_teu_qty" readonly id="bkg_teu_qty" /><!--
								--><input type="text" style="width: 47px;" class="input2" name="bkg_feu_qty" readonly id="bkg_feu_qty" /><!--
								--><button type="button" id="btn_container_e" name="btn_container_e" class="input_seach_btn"></button>
								<input type="hidden" name="dflt_inv_curr_div_cd" id="dflt_inv_curr_div_cd" readonly>
								<input type="hidden" name="target_yn" id="target_yn" readonly style="width:48px;" >
							</td>
						</tr>
						<tr>
							<th width="90">INV Ref. No.</th>
							<td width="150"><input type="text" style="width: 123px;" class="input" name="inv_ref_no" id="inv_ref_no" /></td>
							<!-- <th width="100">NYK Ref.</th> -->
				            <th width="100"><%=ConstantMgr.getCompanyCode()%> Ref.</th>
							<td><input type="text" style="width: 131px;" class="input" name="co_stf_ctnt" id="co_stf_ctnt" /></td>
						</tr>
						<tr>
							<th>Description</th>
							<td colspan="3"><input type="text" style="width:389px;" class="input" name="inv_rmk" id="inv_rmk" /></td>
						</tr>									 
					</tbody>
				</table>
				</div>
			</div>
			<div class="layout_vertical_2" style="width:550px">
				<div class="opus_design_grid" >
					<script type="text/javascript">ComSheetObject('t1sheet1');</script>
				</div>
			</div>
		</div>
	</div>
		
	<div id="tabLayer" style="display:none">
		<div class= "layout_wrap">
			<div class="layout_vertical_2" style="width:500px">
				<div class="opus_design_inquiry" >
					<table>
					<tbody>
						<tr>
							<th>Actual Cust.</th>
							<td colspan="3">
								<input type="text" style="width: 30px;" class="input1" name="act_cust_cnt_cd" onblur="fn_act_cust_chg();" dataformat="engup" onkeypress="ComKeyOnlyAlphabet('upper')" maxlength="2" onkeyup="javascript:checkCustLeng(this.value)" id="act_cust_cnt_cd" /><!--
								--><input type="text" style="width: 65px;" class="input1" name="act_cust_seq" onblur="fn_act_cust_chg();" value="" maxlength="6" dataformat="num" id="act_cust_seq" /><!--
								--><button type="button" id="btn_actcust" name="btn_actcust" class="input_seach_btn"></button><!--
								--><input type="text" style="width: 242px;" class="input2" name="cust_lgl_eng_nm" readonly id="cust_lgl_eng_nm" /><!--
								--><button type="button" id="btn_custNm" name="btn_custNm" class="input_seach_btn"></button>
							</td>
						</tr>
						<tr>
							<th>Issue Curr</th>
                        	<td><script type="text/javascript">ComComboObject('inv_curr_cd3', 1, 90, 1, 1);</script></td>
							<th>TEU/FEU</th>
							<td>
								<input type="text" style="width: 48px;" class="input2" name="bkg_teu_qty" readonly id="bkg_teu_qty" /><!--
								--><input type="text" style="width: 47px;" class="input2" name="bkg_feu_qty" readonly id="bkg_feu_qty" /><!--
								--><button type="button" id="btn_container_e" name="btn_container_e" class="input_seach_btn"></button>
								<input type="hidden" name="dflt_inv_curr_div_cd" id="dflt_inv_curr_div_cd" readonly>
								<input type="hidden" name="target_yn" id="target_yn" readonly style="width:48px;" >
							</td>
						</tr>
						<tr>
							<th width="90">INV Ref. No.</th>
							<td width="150"><input type="text" style="width: 123px;" class="input" name="inv_ref_no" id="inv_ref_no" /></td>
							<!-- <th width="100">NYK Ref.</th> -->
				            <th width="100"><%=ConstantMgr.getCompanyCode()%> Ref.</th>
							<td><input type="text" style="width: 131px;" class="input" name="co_stf_ctnt" id="co_stf_ctnt" /></td>
						</tr>
						<tr>
							<th>Description</th>
							<td colspan="3"><input type="text" style="width:389px;" class="input" name="inv_rmk" id="inv_rmk" /></td>
						</tr>									 
					</tbody>
				</table>
				</div>
				</div>
			<div class="layout_vertical_2" style="width:550px">	
				<div class="opus_design_grid" >
					<script type="text/javascript">ComSheetObject('t2sheet1');</script>
				</div>
			</div>
		</div>
	</div>
	
	<div id="tabLayer" style="display:none">
		<!-- opus_design_inquiry(S) -->
		<div class= "layout_wrap">
			<div class="layout_vertical_2" style="width:500px">
				<div class="opus_design_inquiry" >
					<table>
						<tbody>
						<tr>
							<th>Actual Cust.</th>
							<td colspan="3">
								<input type="text" style="width: 30px;" class="input1" name="act_cust_cnt_cd" dataformat="engup" onblur="fn_act_cust_chg();" onkeypress="ComKeyOnlyAlphabet('upper')" maxlength="2" onkeyup="javascript:checkCustLeng(this.value)" id="act_cust_cnt_cd" /><!--  
								--><input type="text" style="width: 65px;" class="input1" name="act_cust_seq" onblur="fn_act_cust_chg();" value="" maxlength="6" dataformat="num" id="act_cust_seq" /><!--
								--><button type="button" id="btn_actcust" name="btn_actcust" class="input_seach_btn"></button><!--
								--><input type="text" style="width: 242px;" class="input2" name="cust_lgl_eng_nm" readonly id="cust_lgl_eng_nm" /><!--
								--><button type="button" id="btn_custNm" name="btn_custNm" class="input_seach_btn"></button>
							</td>
						</tr>
						<tr>
							<th>Issue Curr</th>
                        	<td><script type="text/javascript">ComComboObject('inv_curr_cd4', 1, 90, 1, 1);</script></td>
							<th>TEU/FEU</th>
							<td>
								<input type="text" style="width: 48px;" class="input2" name="bkg_teu_qty" readonly id="bkg_teu_qty" /><!--
								--><input type="text" style="width: 47px;" class="input2" name="bkg_feu_qty" readonly id="bkg_feu_qty" /><!--
								--><button type="button" id="btn_container_e" name="btn_container_e" class="input_seach_btn"></button>
								<input type="hidden" name="dflt_inv_curr_div_cd" id="dflt_inv_curr_div_cd" readonly>
								<input type="hidden" name="target_yn" id="target_yn" readonly style="width:48px;" >
							</td>
						</tr>
						<tr>
							<th width="90">INV Ref. No.</th>
							<td width="150"><input type="text" style="width: 123px;" class="input" name="inv_ref_no" id="inv_ref_no" /></td>
							<!-- <th width="100">NYK Ref.</th> -->
				            <th width="100"><%=ConstantMgr.getCompanyCode()%> Ref.</th>
							<td><input type="text" style="width: 131px;" class="input" name="co_stf_ctnt" id="co_stf_ctnt" /></td>
						</tr>
						<tr>
							<th>Description</th>
							<td colspan="3"><input type="text" style="width:389px;" class="input" name="inv_rmk" id="inv_rmk" /></td>
						</tr>									 
					</tbody>
				</table>
				</div>
				</div>
				<div class="layout_vertical_2" style="width:550px">	
					<div class="opus_design_grid" >
						<script type="text/javascript">ComSheetObject('t3sheet1');</script>
					</div>
				</div>
			</div>
	</div>
	
	<div id="tabLayer" style="display:none">
		<div class="layout_wrap">
			<div class="layout_vertical_2" style="width:500px">
				<div class="opus_design_inquiry" >
					<table>
					<tbody>
						<tr>
							<th>Actual Cust.</th>
							<td colspan="3">
								<input type="text" style="width: 30px;" class="input1" name="act_cust_cnt_cd" onblur="fn_act_cust_chg();" dataformat="engup" onkeypress="ComKeyOnlyAlphabet('upper')" maxlength="2" onkeyup="javascript:checkCustLeng(this.value)" id="act_cust_cnt_cd" /><!--
								--><input type="text" style="width: 65px;" class="input1" name="act_cust_seq" onblur="fn_act_cust_chg();" value="" maxlength="6" dataformat="num" id="act_cust_seq" /><!--
								--><button type="button" id="btn_actcust" name="btn_actcust" class="input_seach_btn"></button><!-- 
								--><input type="text" style="width: 242px;" class="input2" name="cust_lgl_eng_nm" readonly id="cust_lgl_eng_nm" /><!--
								--><button type="button" id="btn_custNm" name="btn_custNm" class="input_seach_btn"></button></td>
						</tr>
						<tr>
							<th>Issue Curr</th>
                        	<td><script type="text/javascript">ComComboObject('inv_curr_cd5', 1, 90, 1, 1);</script></td>
							<th>TEU/FEU</th>
							<td>
								<input type="text" style="width: 48px;" class="input2" name="bkg_teu_qty" readonly id="bkg_teu_qty" /><!--
								--><input type="text" style="width: 47px;" class="input2" name="bkg_feu_qty" readonly id="bkg_feu_qty" /><!--
								--><button type="button" id="btn_container_e" name="btn_container_e" class="input_seach_btn"></button>
								<input type="hidden" name="dflt_inv_curr_div_cd" id="dflt_inv_curr_div_cd" readonly>
								<input type="hidden" name="target_yn" id="target_yn" readonly style="width:48px;" >
							</td>
						</tr>
						<tr>
							<th width="90">INV Ref. No.</th>
							<td width="150"><input type="text" style="width: 123px;" class="input" name="inv_ref_no" id="inv_ref_no" /></td>
							<!-- <th width="100">NYK Ref.</th> -->
				            <th width="100"><%=ConstantMgr.getCompanyCode()%> Ref.</th>
							<td><input type="text" style="width: 131px;" class="input" name="co_stf_ctnt" id="co_stf_ctnt" /></td>
						</tr>
						<tr>
							<th>Description</th>
							<td colspan="3"><input type="text" style="width:389px;" class="input" name="inv_rmk" id="inv_rmk" /></td>
						</tr>									 
					</tbody>
				</table>
				</div>
				</div>
				<div class="layout_vertical_2" style="width:550px">
					<div class="opus_design_grid" >
						<script type="text/javascript">ComSheetObject('t4sheet1');</script>
					</div>
				</div>
		</div>
	</div>
	
	<table class="line_bluedot"><tr><td></td></tr></table>
	
	<div class= "layout_wrap">
		<div class="layout_vertical_2" style="width:640px">
			<div class= "opus_design_inquiry">
			<h3 class="title_design">BKG Customer Info.</h3>
				<table>
					<tbody>
						<tr>
							<th width=90>SHPR/CNEE</th>
							<td colspan="3"><input type="text" style="width: 30px;" class="input2" name="frm_shpr_cust_cnt_cd" readonly id="frm_shpr_cust_cnt_cd" /><input type="text" style="width: 65px;" class="input2" name="frm_shpr_cust_seq" readonly id="frm_shpr_cust_seq" /><input type="text" style="width: 400px;" class="input2" name="frm_shpr_cust_nm" readonly id="frm_shpr_cust_nm" /><button type="button" id="btn_shprcust" name="btn_shprcust" class="input_seach_btn"></button></td>
						</tr>
						<tr>
							<th>FWDR/NTFY</th>
							<td colspan="5"><input type="text" style="width:30px;" class="input2" name="frm_fwdr_cust_cnt_cd" readonly id="frm_fwdr_cust_cnt_cd" /><input type="text" style="width:65px;" class="input2" name="frm_fwdr_cust_seq" readonly id="frm_fwdr_cust_seq" /><input type="text" style="width:400px;" class="input2" name="frm_fwdr_cust_nm" readonly id="frm_fwdr_cust_nm" /><button type="button" id="btn_fwdrcust" name="btn_fwdrcust" class="input_seach_btn"></button></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		
		<div class="layout_vertical_2" style="width:500px">
			<div class= "opus_design_inquiry">				
				<h3 class="title_design">Split Total</h3>
				<div id="split_sum"></div>
			</div>
		</div>
				
		<table class="line_bluedot"><tr><td></td></tr></table>
		
		<div class= "opus_design_inquiry">
			<table>
				<tbody>
				<tr >
					<th width="90">Invoice No.</th>
					<td width="220"><input type="text" style="width:100px;" class="input2" name="f_inv" id="f_inv" readonly /><!--
					--><span class="dash">~</span><!--
					--><input type="text" style="width:100px;" class="input2" name="t_inv" id="t_inv" readonly /></td>
					<th width="115">Total Invoice Count</th>
					<td width="110"><input type="text" style="width:100px;text-align:right" class="input2" name="tot_inv_cnt" id="tot_inv_cnt" readonly /></td>
					<th width="140">Number of copy invoice</th>
					<td><input type="text" style="width:100px;text-align:right" class="input" name="copy_cnt" id="copy_cnt" maxlength="3" dataformat="num" /></td>
				</tr>
				</tbody>
			</table>
		</div>
	</div>

	<div class="opus_design_grid" style="display:none">
		<script type="text/javascript">ComSheetObject('s0sheet1');</script>	
		<script type="text/javascript">ComSheetObject('s0sheet2');</script>
		<script type="text/javascript">ComSheetObject('s0sheet3');</script>
		<script type="text/javascript">ComSheetObject('s0sheet4');</script>
		<script type="text/javascript">ComSheetObject('s0sheet5');</script>
		<script type="text/javascript">ComSheetObject('s0sheet6');</script>	 <!-- CustomerListForIssue -->		
	</div>

</div>

</form>
