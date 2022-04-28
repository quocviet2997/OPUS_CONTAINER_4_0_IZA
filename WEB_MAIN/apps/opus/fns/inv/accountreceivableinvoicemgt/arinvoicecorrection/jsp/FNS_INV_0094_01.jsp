<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0094_01.jsp
*@FileTitle  : Invoice Customer Change(Single)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/04
=========================================================*/
%>


<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.arinvoicecorrection.event.FnsInv009401Event"%>
<%@ page import="org.apache.log4j.Logger" %> 

<%
	FnsInv009401Event  event = null;					//PDTO(Data Transfer Object including Parameters)
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

		event = (FnsInv009401Event)request.getAttribute("Event");
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
<input type="hidden" name="frm_ar_if_no" id="frm_ar_if_no" />
<input type="hidden" name="frm_rev_tp_cd" id="frm_rev_tp_cd" />
<input type="hidden" name="frm_rev_src_cd" id="frm_rev_src_cd" />

<input type="hidden" name="locl_curr_cd" id="locl_curr_cd" />
<input type="hidden" name="altn_curr_div_cd" id="altn_curr_div_cd" />
<input type="hidden" name="custListsheetId" id="custListsheetId" value="sheet4_" >  <!-- Multi시 이용. 0034_01의 sheet와 이곳의 sheet ID가 다름. param으로 넘김. 주의요망  -->
<input type="hidden" name="inv_curr_cd" id="inv_curr_cd" />
<input type="hidden" name="dp_prcs_knt_local" id="dp_prcs_knt_local" />
<input type="hidden" name="office_cnt_cd" id="office_cnt_cd" /> 
<input type="hidden" name="tax_cnt_flg" id="tax_cnt_flg" /> 
<input type="hidden" name="tax_exp_flg" id="tax_exp_flg" /> 
<!-- page_title_area(S) -->
<div class="page_title_area clear">

	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" name="btn_Retrieve" id="btn_Retrieve" type="button">Retrieve</button><!--
		--><button class="btn_normal" name="btn_New" id="btn_New" type="button">New</button><!--
		--><button class="btn_normal" name="btn_Save" id="btn_Save" type="button">Save</button><!--
		--><button class="btn_normal" name="btn_PaperIssue" id="btn_PaperIssue" type="button">Paper Issue</button><!--
		--><button class="btn_normal" name="btn_GotoSend" id="btn_GotoSend" type="button">Go to Send</button><!--
		--></div>
	<!-- opus_design_btn (E) -->

	<!-- page_location(S) -->
	<div class="location">	
		<span id="navigation"></span>
	</div>
	<!-- page_location(E) -->
	
</div>
<!-- page_title_area(E) -->

<div class="wrap_result">
		<div class="opus_design_tab sm">
			<script type="text/javascript">ComTabObject('tab1')</script>
		</div>
		<div class="opus_design_grid" id="tabLayer">
			<div class="opus_design_inquiry">
				<table>
					<colgroup>
						<col width="70px"/>
						<col width="100px"/>
						<col width="100px"/>
						<col width="100px"/>
						<col width="*"/>
					</colgroup>
					<tr>
						<th>Invoice No.</th>
						<td><input type="text" style="width: 120px;" class="input1" name="inv_no" dataformat="engup" onkeypress="ComKeyOnlyAlphabet('uppernum')" onkeydown="javascript:keyEnterRetreive(event)" maxlength="15" required="" id="inv_no" /> </td>
						<th>Office</th>
						<td><script type="text/javascript">ComComboObject('ar_ofc_cd', 1, 100, 1,1);</script></td>	
						<td></td>					
					</tr>
				</table>
				<table class="line_bluedot"><tr><td></td></tr></table>
				<table class="wFit">
			  	 <colgroup>
						<col width="70px"/>
						<col width="100px"/>
						<col width="100px"/>
						<col width="100px"/>
						<col width="100px"/>
						<col width="100px"/>
						<col width="100px"/>
						<col width="100px"/>
						<col width="*"/>
					</colgroup>
					<tr>
						<th>B/L No.</th>
						<td><input type="text" style="width: 120px;" class="input2" name="frm_bl_src_no" readonly id="frm_bl_src_no" /> </td>
						<th>BKG No.</th>
						<td><input type="text" style="width: 110px;" class="input2" name="frm_bkg_no" readonly id="frm_bkg_no" /> </td>
						<th>Issue Curr</th>
                   		<td><input type="text" style="width:47px;" class="input2" name="frm_inv_curr_cd" readonly id="frm_inv_curr_cd" /></td>
					</tr>
					<tr>
						<th>Invoice No.</th>
						<td><input type="text" style="width: 120px;" class="input2" name="frm_inv_no" readonly id="frm_inv_no" /> </td>
						<th>Issue Date</th>
						<td><input type="text" style="width: 110px;" class="input2" name="frm_iss_dt" readonly id="frm_iss_dt" /> </td>
						<th>INV Ref. No.</th>
						<td><input type="text" style="width: 110px;" class="input2" name="frm_inv_ref_no" readonly id="frm_inv_ref_no" /> </td>
					</tr>
					<tr>
						<th title="Vessel Voyage Direction">VVD</th>
						<td><input type="text" style="width: 120px;" class="input2" name="frm_vvd" readonly id="frm_vvd" /> </td>
						<th title="Place of Receipt">POR</th>
						<td><input type="text" style="width: 60px;" class="input2" name="frm_por_cd" readonly id="frm_por_cd" /> </td>
						<th title="Port of Loading">POL</th>
						<td><input type="text" style="width: 60px;" class="input2" name="frm_pol_cd" readonly id="frm_pol_cd" /> </td>
						<th title="Port of Discharging">POD</th>
						<td><input type="text" style="width: 60px;" class="input2" name="frm_pod_cd" readonly id="frm_pod_cd" /> </td>
						<th title="Place of Delivery">DEL</th>
						<td><input type="text" style="width: 60px;" class="input2" name="frm_del_cd" readonly id="frm_del_cd" /> </td>
					</tr>				
					<tr>
						<th>S/A Date</th>
						<td><input type="text" style="width: 120px;" class="input2" name="frm_sail_arr_dt" readonly id="frm_sail_arr_dt" /> </td>
						<th>Service Scope</th>
						<td><input type="text" style="width: 144px;" class="input2" name="frm_svc_scp_cd" readonly id="frm_svc_scp_cd" /> </td>
						<th>Bound</th>
						<td><input type="text" style="width: 110px;" class="input2" name="frm_io_bnd_cd" readonly id="frm_io_bnd_cd" /> </td>
					</tr>
				</table>				
			</div>
			</div>
		</div>	

	<div class="wrap_result" style="overflow:hidden; margin-top:-20px !important;">
	        <div class="opus_design_grid" >
				<script type="text/javascript">ComSheetObject('sheet1');</script>         
	        </div>
			
			<div class="opus_design_inquiry sm">
					<table class="wFit">
					<tr>
						<th>Old</th>
						<th>Actual Cust.</th>
						<td><input type="text" style="width: 30px;" class="input2" name="frm_act_cust_cnt_cd" readonly id="frm_act_cust_cnt_cd" /><!-- 
						--><input type="text" style="width: 60px;" class="input2" name="frm_act_cust_seq" readonly="" id="frm_act_cust_seq" /><!-- 
						--><input type="text" style="width: 257px;" class="input2" name="frm_cust_nm" readonly="" id="frm_cust_nm" />
						  <input type="hidden" name="frm_dflt_inv_curr_div_cd" id="frm_dflt_inv_curr_div_cd" readonly>
						<th>Invoice Cust.</th>
						<td><input type="text" style="width: 30px;" class="input2" name="frm_inv_cust_cnt_cd" readonly id="frm_inv_cust_cnt_cd" /><!-- 
						--><input type="text" style="width: 60px;" class="input2" name="frm_inv_cust_seq" readonly="" id="frm_inv_cust_seq" /><!-- 
						--><input type="text" style="width: 257px;" class="input2" name="frm_inv_cust_nm" readonly="" id="frm_inv_cust_nm" />
					</tr>
					<tr>
						<th>New</th>
						<th>Actual Cust.</th>
						<td><input type="text" style="width: 30px;" class="input1" name="act_cust_cnt_cd" id="act_cust_cnt_cd" onblur="fn_act_cust_chg();" dataformat ="engup" onkeypress="ComKeyOnlyAlphabet('upper')" maxlength="2" onkeyup="javascript:checkCustLeng(this.value)" /><!-- 
						--><input type="text" style="width: 60px;" name="act_cust_seq" id="act_cust_seq" onblur="fn_act_cust_chg();" value="" maxlength="6" dataformat="num" class="input1" /><!-- 
						--><button type="button" id="btn_actcust" name="btn_actcust" class="input_seach_btn"></button><!-- 
						--><input type="text" style="width: 210px;" name="cust_lgl_eng_nm" value="" class="input2" readonly="" id="cust_lgl_eng_nm" /><!-- 
						--><button type="button" id="btn_custNm" name="btn_custNm" class="input_seach_btn"></button>
						   <input type="hidden" name="dflt_inv_curr_div_cd" id="dflt_inv_curr_div_cd" readonly>
						</td>
						<th>Invoice Cust.</th>
						<td><input type="text" style="width: 30px;" class="input1" name="inv_cust_cnt_cd" id="inv_cust_cnt_cd" dataformat ="engup" onblur="fn_inv_cust_chg();" onkeypress="ComKeyOnlyAlphabet('upper')" maxlength="2" onkeyup="javascript:checkCustLeng2(this.value)" /><!-- 
						--><input type="text" style="width: 60px;" name="inv_cust_seq" id="inv_cust_seq" onblur="fn_inv_cust_chg();" value="" maxlength="6" dataformat="num" class="input1" /><!-- 
						--><button type="button" id="btn_invcust" name="btn_invcust" class="input_seach_btn"></button><!-- 
						--><input type="text" style="width: 210px;" name="inv_cust_lgl_eng_nm" value="" class="input2" readonly="" id="inv_cust_lgl_eng_nm" /><!-- 
						--><button type="button" id="btn_invCustNm" name="btn_invCustNm" class="input_seach_btn"></button>
						</td>
					</tr>

				</table>
				<table class="line_bluedot"><tr><td colspan="6"></td></tr></table>
				<table>
					<colgroup>
						<col width="100px"/>
						<col width="100px"/>
						<col width="100px"/>
						<col width="100px"/>
						<col width="220px"/>
						<col width="*"/>
					</colgroup>
					<tr>
						<th>Invoice No.</th>
						<td><input type="text" style="width: 96px;" class="input2" name="f_inv" id="f_inv" readonly /> - <input type="text" style="width: 100px;" class="input2" name="t_inv" id="t_inv" readonly /></td>
						<th>Total Invoice Count</th>
						<td><input type="text" style="width: 40px;text-align:right" class="input2" name="tot_inv_cnt" id="tot_inv_cnt" readonly /> </td>
						<td></td>
						<td></td>						
					</tr>
					<tr>
						<td></td>
						<td></td>
						<th>Number of copy invoice</th>
						<td><input type="text" style="width: 40px;text-align:right" class="input" name="copy_cnt" id="copy_cnt" maxlength="3" dataformat="num" /> </td>
						<td>
							<table id="tax_cnt_area" border="0" style="display:block">
								<tr>
                        			<th id="tax_exp_mn">INV Exempt Tax</th>
                        			<td>
                            		<input name="tax_exp_chk" id="tax_exp_chk" type="checkbox" value="" class="trans"  onblur="fn_tax_exp_chk();"></td>
									</tr>
							</table>

						</td>
						<td></td>
					</tr>

				</table>
			</div>		
			

				
	<div class="opus_design_RD rd_hidden">
		<div class="opus_design_grid clear" name="tabLayer" id="tabLayer">
			<script type="text/javascript">ComSheetObject('sheet2');</script>	
		</div>
		<div class="opus_design_grid clear" name="tabLayer" id="tabLayer">
			<script type="text/javascript">ComSheetObject('sheet3');</script>
			<script type="text/javascript">ComSheetObject('sheet4');</script>	 <!-- CustomerListForIssue -->	
		</div>		
	</div>
	
	
</div>
</form>