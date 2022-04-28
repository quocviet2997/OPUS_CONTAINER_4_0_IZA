<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0113.jsp
*@FileTitle  : APC Invoice
*@author     : CLT
*@version    : 1.0
*@since      : 2014/12/14
=========================================================
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.accountreceivableedisend.event.FnsInv0113Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsInv0113Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			// Errors from server.
	String strErrMsg = "";						// Error message.
	int rowCount	 = 0;						// DB ResultSet list count
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "10";
	String strUsr_id		= "";
	String strUsr_nm		= "";
	String strOfc_cd		= "";
	Logger log = Logger.getLogger("com.opus.apps.AccountReceivableInvoiceMgt.AccountReceivableEDISend");
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		strOfc_cd = account.getOfc_cd();
		event = (FnsInv0113Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		if (serverException != null) {
	strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
	} catch(Exception e) {
		out.println(e.toString());
	}
%>

<script type="text/javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			showErrMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form" method="post"> 
<input type="hidden" name="f_cmd" id="f_cmd">
<input type="hidden" name="pagerows" id="pagerows">
<input type="hidden" name="pagetype" id="pagetype" value = "I">
<input type="hidden" name="ar_ofc_cd" id="ar_ofc_cd" value="<%=strOfc_cd%>">
<input type="hidden" name="inv_edi_lvl_cd" id="inv_edi_lvl_cd" value="">
<input type="hidden" name="edi_fg" id="edi_fg" value="N">

<!-- page_title_area(S) -->
<div class="page_title_area clear ">
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button>
	</h2> 
	<!-- page_title(E) -->

    <!-- opus_design_btn(S) -->
    <div class="opus_design_btn">
		<button class="btn_accent" name="btn_retrieve" id="btn_retrieve" type="button">Retrieve</button><!--
		--><button class="btn_normal" name="btn_new" id="btn_new" type="button">New</button><!--
		--><button class="btn_normal" name="btn_edi" id="btn_edi" type="button">Send EDI</button><!--
		--><button class="btn_normal" name="btn_excel" id="btn_excel" type="button">Down Excel</button><!--
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
	<div class="opus_design_inquiry wFit">
		<table>
			<tbody>
				<colgroup>
					<col width="180"/>
					<col width="180"/>
					<col width="90"/>
					<col width="310"/>
					<col width="*"/>
				</colgroup>  
				<tr class="h23">
					<th class="sm"><input name="gubun" type="radio" value="S" class="trans" checked onclick="change_event_radio1();"> Shipment Invoice<label></label></th>
					<th class="sm"><input name="gubun" type="radio" value="NS" class="trans" onclick="change_event_radio2();">   Non-Shipment Invoice<label></label></th>
					<th title="Vessel Voyage Direction">VVD</th>
					<td><input type="text" name="vvd_cd" style="width:80px;" class="input1" value="" maxlength="10" dataformat="engup" caption="VVD Code" id="vvd_cd" /><!-- 
					 --><button type="button" id="pop_vsl_cd" name="pop_vsl_cd" class="input_seach_btn"></button><!-- 
					 --><input type="text" name="vsl_eng_nm" style="width:200px;" readonly="true" class="input2" value="" maxlength="50" caption="VVD Name" id="vsl_eng_nm" /> </td>
					 <td></td>
				</tr>	
				</tr>
			</tbody>
		</table>
	</div>
</div>


<div class="wrap_result">
	<div class="opus_design_grid">	
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
</div>			
</form>