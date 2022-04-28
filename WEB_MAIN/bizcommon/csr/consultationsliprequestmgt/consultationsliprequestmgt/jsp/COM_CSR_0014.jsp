<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : COM_CSR_0014.jsp
*@FileTitle  : Rejected CSR Cancellation
*@author     : CLT
*@version    : 1.0
*@since      : 2014/09/03
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.event.ComCsr0014Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	ComCsr0014Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//Error from server
	String strErrMsg = "";						//Error message
	int rowCount	 = 0;						//The count of DB ResultSet list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String ofc_cd = "";
	
	String csr_no="";
	String vndr_no="";
	String inv_desc="";
	String no_of_inv="";
	String csr_curr_cd="";
	String csr_amt="";
	String attr_ctnt2="";
	String iss_dt="";
	String rcv_dt="";
	String vndr_term_nm="";
	String due_dt="";
	String if_status="";
	csr_no = JSPUtil.getNull(request.getParameter("csr_no"));
	vndr_no = JSPUtil.getNull(request.getParameter("vndr_no"));
	inv_desc = JSPUtil.getNull(request.getParameter("inv_desc"));
	no_of_inv = JSPUtil.getNull(request.getParameter("no_of_inv"));
	csr_curr_cd = JSPUtil.getNull(request.getParameter("csr_curr_cd"));
	csr_amt = JSPUtil.getNull(request.getParameter("csr_amt"));
	attr_ctnt2 = JSPUtil.getNull(request.getParameter("attr_ctnt2"));
	iss_dt = JSPUtil.getNull(request.getParameter("iss_dt"));
	rcv_dt = JSPUtil.getNull(request.getParameter("rcv_dt"));
	vndr_term_nm = JSPUtil.getNull(request.getParameter("vndr_term_nm"));
	due_dt = JSPUtil.getNull(request.getParameter("due_dt"));
	if_status  = JSPUtil.getNull(request.getParameter("if_status"));

	Logger log = Logger.getLogger("com.clt.apps.ConsultationSlipRequestMgt.ConsultationSlipRequestMgt");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		ofc_cd = account.getOfc_cd()!=null&&!account.getOfc_cd().equals("")?account.getOfc_cd():"";

		event = (ComCsr0014Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
	strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<script language="javascript" type="text/javascript" src="bizcommon/csr/CoCsr.js"></script>

<script language="javascript">
	var csr_no = '<%=JSPUtil.getNull(csr_no)%>';
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
<input type="hidden" name="if_status" value=<%=if_status %>>

<div class="layer_popup_title">
	<div class="page_title_area clear">
		<h2 class="page_title"><span>Rejected CSR Cancellation</span></h2>
		
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btng_save" id="btng_save">OK</button><!-- -->
			<button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button>
		</div>
	</div>
</div>


<div class="layer_popup_contents">
	<div class="wrap_search">
		<div class="opus_design_inquiry wFit">
			<table>
				<tr class="h23">
					<th width="70">CRS No.</th>
					<td width="278"><input name="csr_no" type="text" style="width:170px;" value='<%=csr_no%>' class="input2" readonly></td>
					<th width="90">Payment S/P</th>
					<td><input name="vndr_no" type="text" style="width:80px;text-align:center;" value='<%=vndr_no%>' class="input2" readonly> <input name="inv_desc" type="text" style="width:367;" value='<%=inv_desc%>' class="input2" readonly></td>
				</tr>
			</table>
			<table>
				<tr class="h23">
					<th width="70">No. of INV</th>
					<td width="90"><input name="no_of_inv" type="text" style="width:25px;" value='<%=no_of_inv%>' class="input2" readonly></td>
					<th width="80">INV Currency</th>
					<td width="100"><input id="csr_curr_cd" name="csr_curr_cd" type="text" style="width:40px;" value='<%=csr_curr_cd%>' class="input2" readonly></td>
					<th width="90">Total AMT</th>
					<td width="120"><input id="csr_amt" name="csr_amt" type="text" style="width:80px;text-align:right;" value='<%=csr_amt%>' class="input2" readonly></td>
					<th width="125">ASA No.</th>
					<td width="140"><input name="attr_ctnt2" type="text" style="width:120px;" value='<%=attr_ctnt2%>' class="input2" readonly></td>
					<th width="70">Cost OFC</th>
					<td><input name="ofc_cd" type="text" style="width:61px;" value="<%=ofc_cd%>" class="input2" readonly></td>
				</tr>
			</table>
			<table>
				<tr class="h23">
					<th width="70">Issue DT</th>
					<td width="90"><input name="iss_dt" type="text" style="width:75px;" value='<%=iss_dt%>' class="input2" readonly></td>
					<th width="80">Receive DT</th>
					<td width="100"><input name="rcv_dt" type="text" style="width:75px;" value='<%=rcv_dt%>' class="input2" readonly></td>
					<th width="90">Payment Term</th>
					<td width="175"><input name="vndr_term_nm" type="text" style="width:120px;" value='<%=vndr_term_nm%>' class="input2" readonly></td>
					<th width="115">Payment Due DT</th>
					<td><input name="due_dt" type="text" style="width:75px;" value='<%=due_dt%>' class="input2" readonly></td>
				</tr>
			</table>
		</div>
		</div>
		<div class="wrap_result">
		<script language="javascript">ComSheetObject('sheet1');</script>
	</div>
</div>
			
			
</form>
