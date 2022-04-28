<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0010.jsp
*@FileTitle  : Invoice Inquiry by B/L No (History Pop-up)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/15
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.arinvoiceinquiry.event.FnsInv0010Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.framework.component.util.StringUtil" %>
<%
	FnsInv0010Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMgt.ARInvoiceInquiry");

	String bl_src_no = StringUtil.xssFilter(request.getParameter("bl_src_no"));
	if(bl_src_no == null){
		bl_src_no = "";
	}

	String bkg_no = StringUtil.xssFilter(request.getParameter("bkg_no"));
	if(bkg_no == null){
		bkg_no = "";
	}

	String ar_ofc_cd = StringUtil.xssFilter(request.getParameter("ar_ofc_cd"));
	if(ar_ofc_cd == null){
		ar_ofc_cd = "";
	}

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsInv0010Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// 초기화면 로딩시 서버로부터 가져온 데이터 추출하는 로직추가 ..
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

<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />

<div class="layer_popup_title">
<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<h2 class="page_title"><span>Invoice Inquiry by B/L No (History)</span></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
		<button type="button" class="btn_accent" name="btn_sysclear" 	id="btn_sysclear">Hide Sys Clear</button><!--
		--><button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button><!--
	--></div>
	<!-- opus_design_btn(E) -->
</div>
<!-- page_title_area(E) -->
</div>
<div class="layer_popup_contents">	
	<div class= "wrap_search">
		<div class= "opus_design_inquiry">
			<table>
				<colgroup>
					<col width="45" />
					<col width="115" />
					<col width="60" />
					<col width="105" />
					<col width="60" />
					<col width="*" />
				</colgroup>
				<tbody>
					<tr>
						<th>B/L No.</th>
						<td><input name="bl_src_no" type="text" style="width:100px;" class="input2" value="<%=bl_src_no %>" readonly="true" tabindex="-1" id="bl_src_no" /> </td>
						<th>BKG No.</th>
						<td><input name="bkg_no" type="text" style="width:100px;" class="input2" value="<%=bkg_no %>" readonly="true" tabindex="-1" id="bkg_no" /> </td>
						<th>Office</th>
						<td><input name="ar_ofc_cd" type="text" style="width:90px;" class="input2" value="<%=ar_ofc_cd %>" readonly="true" tabindex="-1" id="ar_ofc_cd" /> </td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>		
	<!-- opus_design_grid(S) -->	
	<div class="wrap_result">
		<div class="opus_design_grid clear" id="mainTable" >
				<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>
		<div class="opus_design_grid clear" id="mainTable2" >
				<script type="text/javascript">ComSheetObject('sheet2');</script>
		</div>
	</div>	
	</div>
	<!-- opus_design_grid(E) -->
</form>