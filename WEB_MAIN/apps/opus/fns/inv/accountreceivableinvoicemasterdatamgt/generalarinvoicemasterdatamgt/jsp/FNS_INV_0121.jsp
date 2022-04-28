<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : FNS_INV_0121.jsp
*@FileTitle  : Charge Info. by Service Account
*@author     : CLT
*@version    : 1.0
*@since      : 2017/04/24
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemasterdatamgt.generalarinvoicemasterdatamgt.event.FnsInv0121Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsInv0121Event event = null; //PDTO(Data Transfer Object including Parameters)
	Exception serverException = null; // Errors from server.
	String strErrMsg = ""; // Error message.
	int rowCount = 0; // DB ResultSet list count

	String successFlag = "";
	String codeList = "";
	String pageRows = "100";

	String strUsr_id = "";
	String strUsr_nm = "";


	try {
		SignOnUserAccount account = (SignOnUserAccount) session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id = account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
	

		event = (FnsInv0121Event) request.getAttribute("Event");
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

<title>Charge Info. by Service Account</title>


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
<input type="hidden" name="p_cnt_cd" value="">

<div class="layer_popup_title">
	<div class="page_title_area clear">
		<h2 class="page_title"><span>Charge Info. by Service Account</span></h2>
		
		<div class="opus_design_btn">
		    <button type="button" class="btn_accent" name="btn_retrive" id="btn_retrive">Retrieve</button>
			<button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!-- 
			--><button type="button" class="btn_normal" name="btn_save" id="btn_save">Save</button> 
			<button type="button" class="btn_normal" name="btn_downExcel" id="btn_downExcel">Down Excel</button>						
			<button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button>
		</div>
	</div>
</div>


<div class="layer_popup_contents">
	<div class="wrap_search">
		<div class="opus_design_inquiry wFit">
			<table> 
				<tbody>
					<tr>
				   <!-- biz_1  (S) -->
				    <table class="search" border="0" style="width:484px;">
					<tr >
						<td width="80">Service Account Code</td>
						<td width="160"><input type="text" style="width:150px" class="input2" name="p_locl_chg_grp_cd" maxlength="8"  value="" dataformat="engup"></td>
						<td width="80">Charge Code</td>
						<td width=""><input type="text" style="width:100px" class="input2" name="p_chg_cd" maxlength="3"  value="" dataformat="engup"></td>
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
		</div>
	</div>
</div>

</form>
