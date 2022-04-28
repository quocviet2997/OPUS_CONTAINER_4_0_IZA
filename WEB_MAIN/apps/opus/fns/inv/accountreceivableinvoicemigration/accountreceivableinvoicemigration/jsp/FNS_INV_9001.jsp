<%--
=========================================================
*Copyright(c) 2015 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_9001.jsp
*@FileTitle  : Migration Interface
*@author     : CLT
*@version    : 1.0
*@since      : 2015/11/26
=========================================================
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemigration.accountreceivableinvoicemigration.event.FnsInv9001Event"%>
<%@ page import="org.apache.log4j.Logger" %>
 
<%
	FnsInv9001Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			// Errors from server.
	String strErrMsg = "";						// Error message.
	int rowCount	 = 0;						// DB ResultSet list count
 
	String strUsr_id		= "";
	String strUsr_nm		= "";
	String loginOfcCd = "";
	Logger log = Logger.getLogger("com.clt.apps.opus.fns.inv.accountreceivableinvoicemigration.AccountReceivableInvoiceMigrationSC");
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		loginOfcCd = account.getOfc_cd();

		event = (FnsInv9001Event)request.getAttribute("Event");
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

<form name="form" id="form">
<div style="display:none;"><script type="text/javascript">ComSheetObject('sheet1');</script></div>
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">

	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button">Migration Interface</button></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_normal" name="btn_new" id="btn_new" type="button">New</button>
	</div>
	<!-- opus_design_btn (E) -->
	<!-- page_location(S) -->
	<div class="location">	
		<span id="navigation"></span>
	</div>
	<!-- page_location(E) -->
</div>
<!-- page_title_area(E) -->

<div class="wrap_search">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry wFit">
		<table>
			<colgroup>
				<col width="100" />				
				<col width="100" />				
				<col width="100" />				
				<col width="100" />		
				<col width="130" />	
				<col width="100" />	
				<col width="100" />			
				<col width="200" />				
				<col width="*" />	 			
		   </colgroup> 
		   <tbody>
		         <tr>
		             <th style="text-align:left;">1. Booking Interface</th>
		             <td>&nbsp;&nbsp;&nbsp;&nbsp;</td> 
		             <th>BKG Office(from)</th>
		             <td><input name="fm_ctrt_ofc_cd" dataformat="engup" type="text" class="input" style="width:100px;" value="" id="fm_ctrt_ofc_cd" otherchar="," ></td> 
		             <th>BKG Office(to)</th>
		             <td><input name="to_ctrt_ofc_cd" dataformat="engup" type="text" class="input" style="width:100px;" value="" id="to_ctrt_ofc_cd" otherchar="," ></td>
		             <th>BKG No.</th>
		             <td><input name="bkg_no" dataformat="engup" type="text" class="input" style="width:150px;" value="" id="bkg_no" otherchar="," ></td>
		          	 <td><button class="btn_normal" name="btn_save_bkg" id="btn_save_bkg" type="button">Execute</button></td>
		         </tr>
		         <tr>
		             <th style="text-align:left;">2. Other Interface</th>
		             <td>&nbsp;&nbsp;&nbsp;&nbsp;</td> 
		             <th>Office</th>
		             <td><input name="ofc_cd" dataformat="engup" type="text" class="input" style="width:100px;" value="" id="ofc_cd" otherchar="," ></td> 
		             <th>SRC I/F Seq.(from)</th>
		             <td><input name="fm_src_if_seq" dataformat="engup" type="text" class="input" style="width:70px;" value="" id="fm_src_if_seq" otherchar="," ></td>
		             <th>SRC I/F Seq.(to)</th>
		             <td><input name="to_src_if_seq" dataformat="engup" type="text" class="input" style="width:70px;" value="" id="to_src_if_seq" otherchar="," ></td>
		          	 <td><button class="btn_normal" name="btn_save_oth" id="btn_save_oth" type="button">Execute</button></td>
		         </tr>	
		         <tr>
		             <th style="text-align:left;">3. Daily USD Ex. Rate Creation</th>
		             <td>&nbsp;&nbsp;&nbsp;&nbsp;</td> 
		             <th>A/R Office</th>
		             <td colspan="5"><input name="ar_ofc_cd" dataformat="engup" type="text" class="input" style="width:100px;" value="" id="ar_ofc_cd" otherchar="," ></td> 
		          	 <td><button class="btn_normal" name="btn_save_dexrate" id="btn_save_dexrate" type="button">Execute</button></td>
		         </tr>
		         <tr>
		             <th style="text-align:left;">4. VVD Ex. Rate Creation</th>
		             <td>&nbsp;&nbsp;&nbsp;&nbsp;</td> 
		             <th>A/R Office</th>
		             <td><input name="vvd_ar_ofc_cd" dataformat="engup" type="text" class="input" style="width:100px;" value="" id="vvd_ar_ofc_cd" otherchar="," ></td> 
		             <th>V.V.D.</th>
		             <td colspan="3"><input name="vvd_cd" dataformat="engup" type="text" class="input" style="width:100px;" value="" id="vvd_cd" otherchar="," ></td>
		          	 <td><button class="btn_normal" name="btn_save_exrate" id="btn_save_exrate" type="button">Execute</button></td>
		         </tr>	 		   		
		   </tbody>
		</table>
	</div>
	<!-- opus_design_inquiry(E) -->
</div>
</form>
<%@include file="/bizcommon/include/common_alps.jsp"%>