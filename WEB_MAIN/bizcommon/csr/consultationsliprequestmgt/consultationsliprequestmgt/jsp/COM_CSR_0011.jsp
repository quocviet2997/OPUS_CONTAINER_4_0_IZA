<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_CSR_0011.jsp
*@FileTitle  : Invoice List Inquiry
*@author     : CLT
*@version    : 1.0
*@since      : 2014/09/02
=========================================================
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.event.ComCsr0011Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	ComCsr0011Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//Error from server
	String strErrMsg = "";						//Error message
	int rowCount	 = 0;						//The count of DB ResultSet list
	
	String csr_no = JSPUtil.getNull(request.getParameter("csr_no"));
	String cost_ofc_cd = JSPUtil.getNull(request.getParameter("cost_ofc_cd")); 
	String inv_sub_sys_cd = JSPUtil.getNull(request.getParameter("inv_sub_sys_cd")); 
	String curr_cd = JSPUtil.getNull(request.getParameter("curr_cd")); 
	
	String ofc_cd = "";
	
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.ConsultationSlipRequestMgt.ConsultationSlipRequestMgt");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();

	    ofc_cd = account.getOfc_cd()!=null&&!account.getOfc_cd().equals("")?account.getOfc_cd():"";

		event = (ComCsr0011Event)request.getAttribute("Event");
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
<input type="hidden" name="inv_sub_sys_cd" value="<%=inv_sub_sys_cd%>">
<input type="hidden" name="curr_cd" value="<%=curr_cd%>">
<input type="hidden" name="so_if_cd">

<div class="layer_popup_title">
	<div class="page_title_area clear">
		<h2 class="page_title"><span>Invoice List Inquiry</span></h2>
		
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button>
		</div>
	</div>
</div>

<div class="layer_popup_contents" style="overflow:hidden">
	<div class="wrap_search">
		<div class="opus_design_inquiry wFit">
					<table>
						<colgroup>
							<col width="80"/>
							<col width="150"/>
							<col width="180"/>
							<col width="*" />				
						</colgroup>
						<tr>
							<th>CSR No.</th>
							<td><input name="csr_no" type="text" style="width:180px;" value='<%=csr_no%>' ></td>
							<th>Payment S/P</th>
							<td><input name="vndr_no" type="text" style="width:75px;" value="" >
							<input name="inv_desc" type="text" style="width:213px;" value="" ></td>
						</tr>
					</table>
					<div id="srLayer" style="display:none">  
					<table>
						<colgroup>
							<col width="95"/>
							<col width="82"/>
							<col width="100"/>
							<col width="82"/>
							<col width="100"/>
							<col width="80"/>
							<col width="95"/>
							<col width="75"/>
							<col width="100"/>
							<col width="*" />				
						</colgroup>
						<tr>
							<th>No. of INV</th>
							<td><input name="no_of_inv" type="text" style="width:30px;text-align:right;" value="" ></td>
							<th>INV Currency</th>
							<td><input name="csr_curr_cd" type="text" style="width:42px;text-align:center;" value="" ></td>
							<th>Total AMT</th>
							<td><input name="csr_amt" type="text" style="width:100px;text-align:right;"  value="" ></td>  
							<th>ASA No.</th>
							<td><input name="attr_ctnt2" type="text" style="width:80px;" value="" ></td>
							<th>Cost OFC</th>
							<td><input name="ofc_cd" type="text" style="width:64px;text-align:center;" value="<%=cost_ofc_cd%>" ></td>
						</tr>
					</table>
					</div>
					<div id="srLayer" style="display:none">  
					<table>
						<colgroup>
							<col width="95"/>
							<col width="82"/>
							<col width="100"/>
							<col width="82"/>
							<col width="100"/>
							<col width="80"/>
							<col width="95"/>
							<col width="75"/>
							<col width="100"/>
							<col width="*" />				
						</colgroup>
						<tr>
							<th>No. of INV</th>
							<td><input name="no_of_inv" type="text" style="width:30px;text-align:center;" value="" ></td>
							<th>INV Currency</th>
							<td><input name="csr_curr_cd" type="text" style="width:42px;text-align:center;" value="" ></td>
							<th>Total AMT</th>
							<td><input name="csr_amt" type="text" style="width:100px;text-align:right;"  value="" ></td>  
							<th>RGST No.</th>
							<td><input name="attr_ctnt2" type="text" style="width:80px;" value="" ></td>
							<th>Cost OFC</th>
							<td><input name="ofc_cd" type="text" style="width:57px;text-align:center;" value="<%=cost_ofc_cd%>" ></td>
						</tr>
					</table>
					</div>
					<table>
						<colgroup>
							<col width="80"/>
							<col width="75"/>
							<col width="110"/>
							<col width="75"/>
							<col width="150"/>
							<col width="75"/>
							<col width="150"/>
							<col width="*" />				
						</colgroup>
						<tr>
							<th>Issue DT</th>
							<td><input name="iss_dt" type="text" style="width:75px;text-align:center;" value="" ></td>
							<th>Receive DT</th>
							<td><input name="rcv_dt" type="text" style="width:75px;text-align:center;" value="" ></td>
							<th>Payment Term</th>
							<td><input name="vndr_term_nm" type="text" style="width:40px;text-align:right;"" value="" ></td>
							<th>Payment Due DT</th>
							<td><input name="due_dt" type="text" style="width:74px;text-align:center;" value="" ></td>
						</tr>
					</table>
		</div>
	</div>
	<div class="wrap_result">
	
		<!-- opus_design_grid(S) -->
		<div class="opus_design_grid">		
			<script type="text/javascript">ComSheetObject('sheet1');</script>
			<script language="javascript">ComSheetObject('sheet2');</script>		
		</div>
	</div>
</div>
<!-- popup_contens_area(E) -->
</form>
