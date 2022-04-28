<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0006.jsp
*@FileTitle  : Ex. Rate Inquiry
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/25
=========================================================
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemasterdatamgt.arinvoiceexratemgt.event.FnsInv0006Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsInv0006Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			// Errors from server.
	String strErrMsg = "";						// Error message.
//	int rowCount	 = 0;						// DB ResultSet list count
	
//	String successFlag = "";
//	String codeList  = "";
//	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMasterDataMgt.ARInvoiceExRateMgt");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
	   
		event = (FnsInv0006Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
		
		// Get data from server. ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

	}catch(Exception e) {
		out.println(e.toString());
	}
	String vvdCd      = request.getParameter("vvvcd") == null ? "" : request.getParameter("vvvcd").replace(" ","");
	String portCd     = request.getParameter("port_cd") == null ? "" : request.getParameter("port_cd").replace(" ","");
	String loclCurrCd = request.getParameter("locl_curr_cd")== null ? "" : request.getParameter("locl_curr_cd").replace(" ","");
	String svcScpCd   = request.getParameter("svc_scp_cd") == null ? "" : request.getParameter("svc_scp_cd").replace(" ","");
	String ioBndCd    = request.getParameter("io_bnd_cd") == null ? "" : request.getParameter("io_bnd_cd").replace(" ","");
%>
<html>
<head>
<title>Invoice Inquiry by Good Date</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script language="javascript">
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
	if(vvdCd.equals("") && loclCurrCd.equals("")){
%>

<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">

<input type="hidden" name="view_vvd_cd" value="<%=vvdCd%>">
<input type="hidden" name="view_port_cd" value="<%=portCd%>">
<input type="hidden" name="view_locl_curr_cd" value="<%=loclCurrCd%>">
<input type="hidden" name="view_svc_scp_cd" value="<%=svcScpCd%>">
<input type="hidden" name="view_io_bnd_cd" value="<%=ioBndCd%>">

<input type="hidden" name="from_dt" value="">
<input type="hidden" name="to_dt" value="">


	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title">
			<button type="button"><span id="title"></span></button>
		</h2>
		<!-- page_title(E) -->
		
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">			
			<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!--
			--><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!--
			--><button type="button" class="btn_normal" name="btn_downExcel" id="btn_downExcel">Down Excel</button>
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
	} else {
%>

<input	type="hidden" name="f_cmd"> 
<input type="hidden" name="iPage"> 
<input type="hidden" name="view_vvd_cd" value="<%=vvdCd%>">
<input type="hidden" name="view_port_cd" value="<%=portCd%>">
<input type="hidden" name="view_locl_curr_cd" value="<%=loclCurrCd%>">
<input type="hidden" name="view_svc_scp_cd" value="<%=svcScpCd%>">
<input type="hidden" name="view_io_bnd_cd" value="<%=ioBndCd%>">

<input type="hidden" name="from_dt" value="">
<input type="hidden" name="to_dt" value=""> 
<input type="hidden" name="ar_ofc_cd">

	<!-- popup_title_area(S) -->
	<div class="layer_popup_title">
		<!-- page_title_area(S) -->
		<div class="page_title_area clear">
			<!-- page_title(S) -->
			<h2 class="page_title"><span>Ex. Rate Inquiry</span></h2>
			<!-- page_title(E) -->
					
			 <!-- opus_design_btn(S) -->
		    <div class="opus_design_btn">
		        <!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->				
		       	<button type="button" class="btn_normal" name="btn_close"  id="btn_close">Close</button>
		    </div>
		    <!-- opus_design_btn(E) -->
		</div>
		<!-- page_title_area(E) -->
	</div>
	<!-- popup_title_area(E) -->	
	
	<div class="layer_popup_contents">
<%
	}
%>
<div class="wrap_search">	
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry">
		<table>
			<tbody>
				<colgroup>
					<col width="1px;" />
					<col width="180px;" />
					<col width="80px;" />
					<col width="220px;" />
					<col width="80px;" />
					<col width="120px;" />
					<col width="40px;" />
					<col width="70px;" />
					<col width="" />
				</colgroup>
				<tr>					
					<th>Ex. Rate Type</th>
					<td>
						<script language="javascript">ComComboObject('xch_rt_tp_cd', 1, 140, 1);</script>
					</td>
					<th>Charge Cur</th>
					<td>
						<input name="chg_curr_cd" type="text" dataformat="enguponly" style="width:40px" class="input" value="" maxlength="3">
					</td>
					<th>Local Cur</th>
					<td>
						<input name="locl_curr_cd" type="text" dataformat="enguponly" style="width:40px" class="input" value="" maxlength="3">
					</td>
					<th>Office</th>
					<td>
						<script type="text/javascript">ComComboObject('ar_ofc_cd', 1, 100, 0);</script>
					</td>
					<td></td>
				</tr>
				<tr>
					<th title="Vessel Voyage Direction">VVD</th>
					<td>
						<input name="vvd_cd" type="text" dataformat="engup" style="width:139px" class="input1" value="" minlength="9" maxlength="9" >
					</td>
					<th>Port</th>
					<td>
						<input name="port_cd" type="text" dataformat="enguponly" style="width:60px" class="input" value="" maxlength="5"><!--
						<% if(vvdCd.equals("") && loclCurrCd.equals("")) {%>
							--><button type="button" class="input_seach_btn" id="btns_port" name="btns_port"></button><!--
						<%} %>
						-->
					</td>
					<th>Scope</th>
					<td>
						<script language="javascript">ComComboObject('svc_scp_cd', 1, 65, 1);</script>
					</td>
					<th>Bound</th>
					<td>
						<script language="javascript">ComComboObject('io_bnd_cd', 1, 65, 1);</script>
					</td>
					<td></td>
				</tr>
				<tr>
					<th>Customer</th>
					<td>
						<input name="cust_cnt_cd" type="text" style="width:25px;" value="" class="input" maxlength="2" dataformat="enguponly">-&nbsp;
						<input name="cust_seq" type="text" style="width:50px;" value="" class="input" maxlength="6" dataformat="num">
					</td>
					<th>Date</th>
					<td colspan="6">
						<div id="Date_A" style="display:inline">
							<input type="text" name="from_day" id="from_day" dataformat="ymd" style="width:75px" class="input1" caption="start date" cofield="to_day"><!--
							<% if(vvdCd.equals("") && loclCurrCd.equals("")) {%>
								--><button type="button" class="calendar" id="btns_calendar1" name="btns_calendar1"></button>~&nbsp;<!--
							<%} %>
							--><input type="text" name="to_day" id="to_day" dataformat="ymd"  style="width:75px" class="input1" caption="end date" cofield="from_day"><!--
							<% if(vvdCd.equals("") && loclCurrCd.equals("")) {%>
								--><button type="button" class="calendar" id="btns_calendar2" name="btns_calendar2"></button><!--								
							<%} %>
							-->
						</div>
						<div id="Date_B" style="display:none">
							<input type="text" name="from_month" id="from_month" dataformat="ym"  style="width:75px" class="input1" caption="start date" cofield="to_month"><!--
							<% if(vvdCd.equals("") && loclCurrCd.equals("")) {%>
								--><button type="button" class="calendar" id="btns_calendar3" name="btns_calendar3"></button>~&nbsp;<!--								
							<%} %>
							--><input type="text" name="to_month" id="to_month" dataformat="ym"  style="width:75px" class="input1" caption="end date" cofield="from_month"><!--
							<% if(vvdCd.equals("") && loclCurrCd.equals("")) {%>
								--><button type="button" class="calendar" id="btns_calendar4" name="btns_calendar4"></button><!--								
							<%} %>
							-->
						</div>	
					</td>
					<td></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>

	<!-- wrap_result(S) -->
	<div class="wrap_result">
		<!-- opus_design_grid(S) -->
		<div class="opus_design_grid" id="mainTable">
		    <script language="javascript">ComSheetObject('sheet1');</script>
		</div>
		<!-- opus_design_grid(E) -->
	</div>
	

<%
	if(!(vvdCd.equals("") && loclCurrCd.equals(""))){
%>
</div>
<%
	}
%>

</form>
