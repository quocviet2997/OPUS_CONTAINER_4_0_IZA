<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0053.jsp
*@FileTitle  : Invoice Inquiry by Invoice No
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/14
=========================================================
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.arinvoiceinquiry.event.FnsInv0053Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsInv0053Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			// Errors from server.
	String strErrMsg = "";						// Error message.
	int rowCount	 = 0;						// DB ResultSet list count
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";
	String strUsr_id		= "";
	String strUsr_nm		= "";
	String strOfcCd			= "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMgt.ARInvoiceInquiry");
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		strOfcCd = account.getOfc_cd();

		event = (FnsInv0053Event)request.getAttribute("Event");
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

<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="pagetype" value="I" id="pagetype" />
<input type="hidden" name="ofc" id="ofc" />
<input type="hidden" name="dp_prcs_knt_local" value="0" id="dp_prcs_knt_local" />
<input type="hidden" name="dp_prcs_knt" value="0" id="dp_prcs_knt" />
<!-- page_title_area(S) -->
<div class="page_title_area clear ">
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button>
	</h2>
	<!-- page_title(E) -->
	    <!-- opus_design_btn(S) -->
	    <div class="opus_design_btn">
	        <!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->
			<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
			 --><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button>						
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
<div class="wrap_search">
<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry">		
		<table> 
		<colgroup>
			<col width="88" />
			<col width="130" />
			<col width="85" />
			<col width="110" />
			<col width="38" />
			<col width="*" />
		</colgroup>
			<tbody>
				<tr>
					<th>Invoice No</th>   
					<td><input name="inv_no" type="text" style="width:130px;" class="input1" value="" dataformat="engup" maxlength="13" id="inv_no" /> </td>
					<th>Issue Date</th>   
					<td><input name="iss_dt" type="text" style="width:85px;" class="input2" value="" readonly tabindex="-1" id="iss_dt" /> </td>
					<th>Office</th>  
					<td><script type="text/javascript">ComComboObject('ar_ofc_cd', 1, 100, 0);</script></td>
				</tr>
			</tbody>
		</table>		
		<table class="line_bluedot"><tr><td colspan="6"></td></tr></table>
		<table class="search">
		<colgroup>
			<col width="88" />
			<col width="635" />
			<col width="100" />
            <col width="100" />
            <col width="100" />
			<col width="*" />
		</colgroup>
				<tbody> 	
				<tr>
					<th>Actual Cust.</th>   
					<td><input name="act_cust_cnt_cd" type="text" style="width:35px;" class="input2" value="" maxlength="2" readonly tabindex="-1" id="act_cust_cnt_cd" /><!-- 
						 --><input name="act_cust_seq" type="text" style="width:60px;" class="input2" value="" maxlength="6" readonly tabindex="-1" id="act_cust_seq" /><!-- 
						 --><button type="button" class="input_seach_btn" name="btns_cust" id="btns_cust"></button><!-- 
						 --><input name="cust_lgl_eng_nm" type="text" style="width:352px;" class="input2" value="" readonly tabindex="-1" id="cust_lgl_eng_nm" /><!-- 
						 --><input name="cust_rgst_no" type="text" style="width:114px;" class="input2" value="" readonly tabindex="-1" id="cust_rgst_no" /></td>
					<th>Invoice Cust</th>   
					<td><input name="inv_cust_cnt_cd" type="text" style="width:27px;" class="input2" value="" maxlength="2" readonly tabindex="-1" id="inv_cust_cnt_cd" /><!-- 
						 --><input name="inv_cust_seq" type="text" style="width:57px;" class="input2" value="" maxlength="6" readonly tabindex="-1" id="inv_cust_seq" /></td>
				    <th>Credit Agreement No</th>
				    <td><input name="cust_agmt_no" type="text" style="width:104px;" class="input2" value="" readonly tabindex="-1" id="cust_agmt_no" /></td>
				</tr>
		</table>	
		<table class="search" > 
		<colgroup>
			<col width="88">
			<col width="260">
			<col width="159">
			<col width="30">
			<col width="88">
			<col width="30">
			<col width="88">
			<col width="80">
			<col width="80">
			<col width="120">
			<col width="*">
		</colgroup>
			<tbody>
				<tr>
					<th>CRD Limit</th>   
					<td><input name="cr_curr_cd" type="text" style="width:35px;" class="input2" value="" maxlength="3" readonly tabindex="-1" id="cr_curr_cd" /><input name="cr_amt" type="text" style="width:103px;text-align:right" class="input2" value="" maxlength="6" readonly tabindex="-1" id="cr_amt" /></td>
					<th>Credit Term </th>   
					<th>O/B</th>
					<td><input name="ob_cr_term_dys" type="text" style="width:35px;text-align:right" class="input2" value="" maxlength="5" readonly tabindex="-1" id="ob_cr_term_dys" /> </td>
					<th>I/B</th>
					<td><input name="ib_cr_term_dys" type="text" style="width:35px;text-align:right" class="input2" value="" maxlength="5" readonly tabindex="-1" id="ib_cr_term_dys" /> </td>
					<th>Credit Office</th>   
					<td><input name="cr_clt_ofc_cd" type="text" style="width:88px;" class="input2" value="" maxlength="6" readonly tabindex="-1" id="cr_clt_ofc_cd" /> </td>
                    <th>Group Invoice</th>
                    <td><input type="checkbox" value="" class="trans" name="grp_iss_flg" id="grp_iss_flg" disabled></td>
				</tr>
			</tbody>
		</table>		
	</div>
</div>		
<div class="wrap_result">		
<div class="opus_design_grid clear" >		
	<script type="text/javascript">ComSheetObject('sheet1');</script>
</div>
</div>
</form>
