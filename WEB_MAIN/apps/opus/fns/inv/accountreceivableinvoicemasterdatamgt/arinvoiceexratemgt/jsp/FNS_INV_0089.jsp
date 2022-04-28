<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : FNS_INV_0089.jsp
*@FileTitle  : Ex Rate Entry by Cusomtomer - Multi Cust
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/19
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemasterdatamgt.arinvoiceexratemgt.event.FnsInv0089Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsInv0089Event event = null; //PDTO(Data Transfer Object including Parameters)
	Exception serverException = null; // Errors from server.
	String strErrMsg = ""; // Error message.
	int rowCount = 0; // DB ResultSet list count

	String successFlag = "";
	String codeList = "";
	String pageRows = "100";

	String strUsr_id = "";
	String strUsr_nm = "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMasterDataMgt.ARInvoiceExRateMgt");
	String cust_cnt_cd = request.getParameter("cust_cnt_cd") == null ? "" : request.getParameter("cust_cnt_cd");
	String cust_seq = request.getParameter("cust_seq") == null ? ""	: request.getParameter("cust_seq");
	String mon = request.getParameter("mon") == null ? "" : request.getParameter("mon");
	if (mon != "") {
		mon = mon.split("-")[0] + mon.split("-")[1];
	}
	try {
		SignOnUserAccount account = (SignOnUserAccount) session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id = account.getUsr_id();
		strUsr_nm = account.getUsr_nm();

		event = (FnsInv0089Event) request.getAttribute("Event");
		serverException = (Exception) request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// Get data from server. ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

	} catch (Exception e) {
		out.println(e.toString());
	}
%>

<title>Ex Rate Entry by Cusomtomer - Multi Cust</title>


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
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
<input type="hidden" name="mon" value="<%=mon%>">
<input type="hidden" name="cust_cnt_cd" >
<input type="hidden" name="cust_seq" >
<input type="hidden" name="cust_nm" >

<div class="layer_popup_title">
	<div class="page_title_area clear">
		<h2 class="page_title"><span>Ex Rate Entry by Customer - Multi Cust</span></h2>
		
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!-- 
			--><button type="button" class="btn_normal" name="btn_save" id="btn_save">Save</button><!-- 
			--><button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button>
		</div>
	</div>
</div>



<div class="layer_popup_contents">
	<div class="wrap_search">
		<div class="opus_design_inquiry wFit">
			<table> 
				<tbody>
					<tr>
				<td class="bg"><!-- biz_1  (S) -->
				<table class="search" border="0" style="width:484px;">
					<tr class="h23">
						<td width="70">Cust. Code</td>
						<td width=""><input type="text" style="width:30px" value="<%=cust_cnt_cd%>" class="input2" name="v_cust_cnt_cd" readonly>
						<input type="text" style="width:55px" value="<%=cust_seq%>" class="input2" name="v_cust_seq" readonly></td>
					</tr>
				</table>

				<table class="height_2">
					<tr>
						<td></td>
					</tr>
				</table>

					</tr>
				</tbody>
			</table>
		</div>
	</div>
	<div class="wrap_result">
		<div class="opus_design_grid" >
			<div class="opus_design_grid">
				
				<!-- opus_grid_btn(S) -->
				<div class="opus_design_btn">
					<button type="button" class="btn_normal" name="btn_add" id="btn_add">Row&nbsp;Add</button>
					<button type="button" class="btn_normal" name="btn_del" id="btn_del">Row&nbsp;Delete</button>
				</div>
				<!-- opus_grid_btn(E) -->
			</div>
			
			<script language="javascript">ComSheetObject('sheet1');</script>
			<script language="javascript">ComSheetObject('sheet2');</script>
		</div>
	</div>
</div>

</form>
