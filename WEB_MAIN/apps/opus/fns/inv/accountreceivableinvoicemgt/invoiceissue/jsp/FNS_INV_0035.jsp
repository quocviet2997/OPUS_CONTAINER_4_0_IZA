<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0035
*@FileTitle  : Invoice Re-Issue
*@author     : CLT 
*@version    : 1.0
*@since      : 2014/07/17
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.invoiceissue.event.FnsInv0035Event"%>
<%@ page import="org.apache.log4j.Logger"%>

<%
	FnsInv0035Event event = null; //PDTO(Data Transfer Object including Parameters)
	Exception serverException = null; // Errors from server.
	String strErrMsg = ""; // Error message.
	int rowCount = 0; // DB ResultSet list count

	String successFlag = "";
	String codeList = "";
	String pageRows = "100";

	String strUsr_id = "";
	String strUsr_nm = "";
	String loginOfcCd = "";
	Logger log = Logger
			.getLogger("com.clt.apps.AccountReceivableInvoiceMgt.InvoiceIssue");

	try {
		SignOnUserAccount account = (SignOnUserAccount) session
				.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id = account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		loginOfcCd = account.getOfc_cd();

		event = (FnsInv0035Event) request.getAttribute("Event");
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
<script  type="text/javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form">
    <input type="hidden" name="f_cmd"> 
    <input type="hidden" name="pagerows"> 
    <input type="hidden" name="pagetype" value="E"> 
    <input type="hidden" name="iss_ofc_cd"> 
    <input type="hidden" name="user_ofc" value="<%=loginOfcCd%>"> 
    <input type="hidden" name="user_id" value="<%=strUsr_id%>"> 
    <input type="hidden" name="user_nm" value="<%=strUsr_nm%>"> 
    <input type="hidden" name="inv_no">
    <input type="hidden" name="invs"> 
    <input type="hidden" name="r_invs"> 
    <input type="hidden" name="cmb_flg"> 
    <input type="hidden" name="invs_email"> 
    <input type="hidden" name="flag"> 
    <input type="hidden" name="login_ofc_cd" value="<%=loginOfcCd%>"> 
    <input type="hidden" name="ar_ofc_cd2">    
    <input type="hidden" name="ots_smry_cd">
    <input type="hidden" name="print_nm">
    <input type="hidden" name="com_mrdPath"> 
    <input type="hidden" name="com_mrdArguments"> 
    <input type="hidden" name="prev_flg" value="N"> 
    <input type="hidden" name="goto_flg" value="N"> 
    <input type="hidden" name="inv_mlt_bl_iss_flg"> 
    <input type="hidden" name="office_cnt_cd"> 
    <input type="hidden" name="iss_grp_tp_cd"> 
    <input type="hidden" name="state"> 
    <input type="hidden" name="tax_cnt_flg" id="tax_cnt_flg" /> 
    <input type="hidden" name="grp_inv_flg"> 
<!-- page(S) -->
<!-- page_title_area(S) -->
<div class="page_title_area clear">
	
	<!-- page_title(S) -->
    <!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->

	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn"><!-- 
		 --><button type="button" class="btn_accent" name="btn_new" id="btn_new">New</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_paper" id="btn_paper">Paper Re-issue</button><!-- 
		 --><span><font size="2pt">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Number of copy invoice</font>&nbsp;<input type="text" style="width: 45px; height:32px; font-size: 8pt; text-align: right;"	class="input" value="" name="copy_cnt" dataformat="int"	maxlength="3" style="ime-mode:disabled"></span><button type="button" class="btn_normal" name="btn_goto" id="btn_goto">Go to Send</button><!-- 
	 --></div>
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
	<div class="opus_design_inquiry" id="showMin">
		<!--  MiniLayer (S) -->
		<table>
			<colgroup>
				<col width="1" />
	            <col width="150" />
	            <col width="100" />
	            <col width="*" />
			</colgroup>
				<tr> 
	                <th class="pad_rgt_12 sm">Select Option</th>
					<td class="sm"><!-- 
						 --><input type="radio" value="S" name="sel_option" id="sel_option1" onclick="javascript:clickOption();" checked /><!-- 
						 --><label for="sel_option1">Single</label><!-- 
						 --><input type="radio" value="M" name="sel_option" id="sel_option2" onclick="javascript:clickOption();" /><!-- 
						 --><label for="sel_option2">Multi</label><!-- 
					 --></td>
					<th class="pad_rgt_12">Office</th>
					<td><script  type="text/javascript">ComComboObject('ar_ofc_cd', 1, 100, 1, 1);</script>
	           	</tr>
	     </table>
	     <table>
	    	<colgroup>
				<col width="1" />
	            <col width="250" />
	            <col width="120" />
	            <col width="*" />
			</colgroup>
	           	<tr>
	           		<th class="pad_rgt_12">Multi Invoice No.</th>
	           		<td>From <input type="text" style="width:80px;ime-mode:disabled" class="input2" name="f_inv" id="f_inv"	 maxlength="9" dataformat="engup" readonly> <span>To</span> <input type="text" style="width:80px;ime-mode:disabled" class="input2" name="t_inv" id="t_inv" maxlength="9" dataformat="engup" readonly></td>
					<th class="pad_rgt_12" style="color: #51AC2F;">Invoice Search</th>
					<td><button class="input_seach_btn" name="btn_search" id="btn_search" type="button" onclick="javascript:openInvPopUp();"></button></td>
	           	</tr>
	     </table>
    </div>
</div>
<div class="wrap_result" >
	<!-- opus_design_grid(S) -->
	<h3 class="title_design">Single Invoice No.</h3>
	<div class="opus_design_grid">
	    <script  type="text/javascript">ComSheetObject('sheet1');</script>
	</div>   
</div>

</form>