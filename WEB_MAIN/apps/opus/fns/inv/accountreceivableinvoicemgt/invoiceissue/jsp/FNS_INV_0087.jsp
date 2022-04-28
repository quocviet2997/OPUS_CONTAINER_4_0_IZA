<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : fns_inv_0087.jsp
*@FileTitle  : Invoice Remark
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/19
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page
	import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page
	import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page
	import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page
	import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.invoiceissue.event.FnsInv0087Event"%>
<%@ page import="org.apache.log4j.Logger"%>
<%
	FnsInv0087Event event = null; //PDTO(Data Transfer Object including Parameters)
	Exception serverException = null; //서버에서 발생한 에러
	String strErrMsg = ""; //에러메세지
	int rowCount = 0; //DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList = "";
	String pageRows = "100";

	String strUsr_id = "";
	String strUsr_nm = "";
	Logger log = Logger
			.getLogger("com.clt.apps.AccountReceivableInvoiceMgt.InvoiceIssue");

	try {
		SignOnUserAccount account = (SignOnUserAccount) session
				.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id = account.getUsr_id();
		strUsr_nm = account.getUsr_nm();

		event = (FnsInv0087Event) request.getAttribute("Event");
		serverException = (Exception) request
				.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException)
					.loadPopupMessage();
		}

		// 초기화면 로딩시 서버로부터 가져온 데이터 추출하는 로직추가 ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request
				.getAttribute("EventResponse");

	} catch (Exception e) {
		out.println(e.toString());
	}
%>


<script language="javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form"><input type="hidden" name="f_cmd"> <input
	type="hidden" name="pagerows"> 
	
<div class="layer_popup_title">
	<div class="page_title_area clear">
		<h2 class="page_title"><span>Invoice Remark(s)</span></h2>
		
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!-- 
			--><button type="button" class="btn_normal" name="btn_OK" id="btn_OK">OK</button><!-- 
			--><button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button>
		</div>
	</div>
</div>

<!-- 개발자 작업	--> <!-- OUTER - POPUP (S)tart -->

<div class="layer_popup_contents">
	<div class="wrap_search">
		<div class="opus_design_inquiry wFit">
			<table> 
				<tbody>
					<tr>
						<td class="bg"><!-- biz_1  (S) -->
				<table class="search" border="0" style="width:660;">
					<tr class="h23">
						<td width="80">Invoice No.</td>
						<td><input type="text" style="width:590;" class="input2"
							name="inv_no" value=""></td>
					</tr>
					<tr class="h23">
						<td>Remark</td>
						<td><textarea style="width:590px; height:100px;" class="input"
							name="inv_iss_rmk" onkeyup="remarkLengthCheck(this, 990)"></textarea></td>
					</tr>
				</table>
				&nbsp;
				<table width="600" id="mainTable" style="display: none;">
					<tr>
						<td width="100%"><script language="javascript">ComSheetObject('sheet1');</script>
						</td>
					</tr>
				</table>

				</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>

</form>