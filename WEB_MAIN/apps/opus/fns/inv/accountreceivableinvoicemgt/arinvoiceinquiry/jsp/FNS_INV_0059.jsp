<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0059.jsp
*@FileTitle  : e-mail / Auto FAX Invoice Sent Result 
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
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.arinvoiceinquiry.event.FnsInv0059Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsInv0059Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			// Errors from server.
	String strErrMsg = "";						// Error message.
	int rowCount	 = 0;						// DB ResultSet list count
	
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String strOfc_cd		= "";
	String strCnt_cd		= "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMgt.ARInvoiceInquiry");
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		strOfc_cd = account.getOfc_cd();
		strCnt_cd = account.getCnt_cd();
		
		event = (FnsInv0059Event)request.getAttribute("Event");
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
			showErrMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
<input type="hidden" name="pagetype" value = "I">
<input type="hidden" name="user_ofc_cd" value="<%=strOfc_cd %>">
<input type="hidden" name="user_cnt_cd" value="<%=strCnt_cd %>">
<input type="hidden" name="ofc_cd">
<input type="hidden" name="svr_id">

<!-- page(S) -->
<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
    <!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
		<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!--
		--><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!--
		--><button type="button" class="btn_normal" name="btn_downexcel" id="btn_downexcel">Down&nbsp;Excel</button>
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
		<table>
			<colgroup>
	            <col width="75" />
	            <col width="130" />
	            <col width="80" />
	            <col width="181" />
	            <col width="40" />
	            <col width="120" />
	            <col width="75" />            
	            <col width="104" />
	            <col width="54" />
	            <col width="" />
			</colgroup>
			<tbody>
				<tr>
					<th>Sent Date</th>
					<td class="stm" colspan="3"><input type="text" name="from_dt" required="" dataformat="ymd" maxlength="8" style="width:75px;" class="input1" cofield="to_dt" caption="start date" id="from_dt" /><button type="button" class="calendar ir" name="btns_calendar1" id="btns_calendar1"></button>~&nbsp;<input name="to_dt" type="text" required="" dataformat="ymd" maxlength="8" style="width:75px;" class="input1" cofield="from_dt" caption="end date" id="to_dt" /><button type="button" class="calendar ir" name="btns_calendar2" id="btns_calendar2"></button></td>
					<th>User ID</th>
					<td><input name="cre_usr_id" type="text" style="width:105px;" value="" class="input" maxlength="20" dataformat="eng" id="cre_usr_id" /> </td>
					<th>User Office</th>   
					<td><input name="iss_ofc_cd" type="text" style="width:60px;" value="" class="input" maxlength="5" dataformat="engup" id="iss_ofc_cd" /> </td>
					<th>Office</th>
					<td><script type="text/javascript">ComComboObject('ar_ofc_cd', 1, 80, 0, 1);</script></td>
				</tr>
				<tr>
					<th title="Vessel Voyage Direction">VVD</th>   
					<td><input name="vvd" id="vvd" type="text" style="width:105px" class="input" maxlength="9" minlength="9" value="" dataformat="engup"></td>
					<th>Actual Cust.</th>
					<td colspan="5"><input name="act_cust_cnt_cd" type="text" style="width:30px;" value="" class="input" maxlength="2" dataformat="engup" id="act_cust_cnt_cd" /><!--
					--><input name="act_cust_seq" type="text" style="width:55px;" value="" class="input" maxlength="6" dataformat="num" id="act_cust_seq" /><button type="button" class="input_seach_btn" name="btns_cust1" id="btns_cust1"></button><input name="cust_nm" type="text" style="width:338px;" value="" class="input2" readonly="" id="cust_nm" /><button type="button" class="input_seach_btn" name="btns_cust2" id="btns_cust2"></button></td>
					<th>Sent By</th>
					<td><script type="text/javascript">ComComboObject('sent_by', 1, 80, 0, 0);</script></td>
				</tr>
				<tr>
					<th>B/L No.</th>
					<td><input name="bl_src_no" type="text" style="width:105px;" class="input" maxlength="12" value="" dataformat="engup" id="bl_src_no" /> </td>
					<th>Invoice No.</th>
					<td><input name="inv_no" type="text" style="width:120px;" class="input" maxlength="15" value="" dataformat="engup" id="inv_no" /> </td>
					<th>Port</th>
					<td><input name="port" type="text" style="width:50px;" class="input" maxlength="5" minlength="5" value="" dataformat="engup" id="port" /><button type="button" class="input_seach_btn" name="btns_port" id="btns_port"></button></td>
					<th>Scope</th>
					<td><input name="svc_scp_cd" type="text" style="width:38px;" class="input" maxlength="3" minlength="3" value="" dataformat="engup" id="svc_scp_cd" /><button type="button" class="input_seach_btn" name="btns_SCP" id="btns_SCP"></button></td>
					<th>Bound</th>
					<td><script type="text/javascript">ComComboObject('io_bnd_cd', 1, 80, 0, 0);</script></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
<!-- opus_design_inquiry(E) -->

<!-- opus_design_grid(S) -->
<div class="wrap_result">
	<div class="opus_design_grid">
		<!-- 그리드 데이터 영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
	    <script type="text/javascript">ComSheetObject('sheet1');</script>
	    <!-- 그리드 데이터 영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
	    <div class="mar_top_8">
	    <table>
	    	<colgroup>
	    		<col width="90">
	    		<col width="70">
	    		<col width="75">
	    		<col width="70">
	    		<col width="90">
	    		<col width="70">
	    		<col width="75">
	    		<col width="70">
	    		<col width="90">
	    		<col width="70">
	    		<col width="80">
	    		<col width="70">
	    		<col width="100">
	    		<col width="*">
	    	</colgroup>
			<tr class="h23">
				<th>E-mail Count</th>
				<td><input name="eml_cnt" type="text" style="width:110px;text-align:right" value="" class="input2"></td>
				<th>Fax Count</th>
				<td><input name="fax_cnt" type="text" style="width:110px;text-align:right" value="" class="input2"></td>
				<th>Paper Count</th>
				<td><input name="paper_cnt" type="text" style="width:110px;text-align:right" value="" class="input2"></td>
				<th>Ftp Count</th>
				<td><input name="ftp_cnt" type="text" style="width:110px;text-align:right" value="" class="input2"></td>
				<th>Total Count</th>
				<td><input name="ttl_cnt" type="text" style="width:110px;text-align:right" value="" class="input2"></td>
				<th>Sent Count</th>
				<td><input name="snd_cnt" type="text" style="width:110px;text-align:right" value="" class="input2"></td>
				<th>Sent Ratio(%)</th>   
				<td><input name="snd_rt" type="text" style="width:120px;text-align:right" value="" class="input2"></td>
			</tr>
		</table>
		</div>
	</div>
</div>
<!-- opus_design_grid(E) -->
<!-- page(E) -->

</form>