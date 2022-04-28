<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0107.jsp
*@FileTitle  : VVD Ex. Rate Date History Inquiry
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/16
=========================================================
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemasterdatamgt.arinvoiceexratemgt.event.FnsInv0107Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsInv0107Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			// Errors from server.
	String strErrMsg = "";						// Error message.

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMasterDataMgt.ARInvoiceExRateMgt");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsInv0107Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

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

<!-- page_title_area(S) -->
<div class="page_title_area clear ">
	<!-- page_title(S) -->
	<h2 class="page_title"><span>VVD Ex. Rate Date History Inquiry</span></h2>
	<!-- page_title(E) -->

	    <!-- opus_design_btn(S) -->
	    <div class="opus_design_btn"><!--
	    --><button type="button" class="btn_accent" name="btn1_Retrieve" id="btn1_Retrieve">Retrieve</button><!--
	    --><button type="button" class="btn_normal" name="btn1_New"   id="btn1_New">New</button></div>
	    <!-- opus_design_btn(E) -->
    
	<!-- page_location(S) -->
	<div class="location">
		<!-- location 내용 동적생성 (별도 코딩 불필요) -->
		<span id="navigation"></span>
	</div>
	<!-- page_location(E) -->

</div>
<!-- page_title_area(E) -->
<!-- wrap_search(S) -->
<div class="wrap_search">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry wFit">
				<table>
					<colgroup>
						<col width="50"/>
						<col width="50"/>
						<col width="80"/>
						<col width="10"/>
						<col width="*"/>
					</colgroup>
					<tbody>
					<tr>
						<th>Office</th>
						<td><input type="text" value="<%=event.getVvdExrateDateHisVO().getArOfcCd() %>" name="ar_ofc_cd" readonly="readonly" style="width:100px;" class="input2" id="ar_ofc_cd" /></td>
						<th>VVD</th>
						<td><input type="text" value="<%=event.getVvdExrateDateHisVO().getVvdCd() %>" dataformat="engup" name="vvd_cd" id="vvd_cd" style="width: 80px" class="input" maxlength="9"></td>
						<th>Event Date</th>
					    <td><input type="text" value="" name="from_dt" style="width: 80px;" class="input" dataformat="num" onblur="fn_ComGetMaskedValue();" id="from_dt" /><button type="button" id="btns_calendar" name="btns_calendar" class="calendar ir"></button>~ 
					    <input type="text" value="" name="to_dt" style="width: 80px;" class="input" dataformat="num" onblur="fn_ComGetMaskedValue_to();" id="to_dt" /><button type="button" id="btns_calendar2" name="btns_calendar2" class="calendar ir"></button></td>
					</tr>
					</tbody>
				</table>
		<!--biz page (S)-->
	</div>		
<!-- opus_design_inquiry(E) -->
</div>
<!-- wrap_result(S) -->
<div class="wrap_result">
<!-- opus_design_grid(S) -->
	<div class="opus_design_grid" id="mainTable">		
		<!-- opus_design_btn(S) -->

	    <!-- opus_design_btn(E) -->
		<!-- 그리드 데이터 영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
	    <script type="text/javascript">ComSheetObject('sheet1');</script>
	    <!-- 그리드 데이터 영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
	</div>
<!-- opus_design_grid(E) -->
</div>
</form>