<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_012.jsp
*@FileTitle  : Package Table
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/04
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.commodity.event.ComEns012Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	ComEns012Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String cmdt_cd			= "";
	String rep_cmdt_cd		= "";

	Logger log = Logger.getLogger("com.hanjin.apps.BookingMasterData.BookingMasterMgt");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (ComEns012Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// 초기화면 로딩시 서버로부터 가져온 데이터 추출하는 로직추가 ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");


		cmdt_cd =  JSPUtil.getParameter(request, "cmdt_cd");
		rep_cmdt_cd =  JSPUtil.getParameter(request, "rep_cmdt_cd");


	}catch(Exception e) {
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

<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<!-- 개발자 작업	-->
<div class="layer_popup_contents">
	<div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
	   <!-- page_title(S) -->
		<h2 class="page_title"><span>Commodity Code Inquiry</span></h2>
		<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_retrieve" 	id="btn_retrieve">Retrieve</button><!--
			--><button type="button" class="btn_normal" name="btn_select" id="btn_select">Select</button><!--
			--><button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button><!--
		--></div>
		<!-- opus_design_btn(E) -->
		<!-- page_location(S) -->
<!-- 		<div class="location">
			<span id="navigation"></span>
		</div> -->
		<!-- page_location(E) -->
	</div>
	<!-- page_title_area(E) -->
	</div>
	<!-- opus_design_grid(S) -->
	<div class= "wrap_search">
		<div class= "opus_design_inquiry wFit">
			<table>
				<colgroup>
					<col width="30" />
					<col width="150" />
					<col width="*" />
				</colgroup>
				<tbody>
					<tr>
						<td><input type="radio" name="rdo_search_type" value="A" class="trans" id="rdo_search_type" /></td>
						<th>Commodity Code</th>
						<td><input type="text" name="cmdt_cd" style="width:100px;" class="input" value="<%=cmdt_cd %>" dataformat="num" caption="Commodity Code" maxlength="6" id="cmdt_cd" /> </td>
					</tr>
					<tr>
						<td><input type="radio" name="rdo_search_type" value="B" class="trans" checked id="rdo_search_type" /></td>
						<th>Rep. Commodity Code</th>
						<td><input type="text" name="rep_cmdt_cd" style="width:100px;" class="input" value="<%=rep_cmdt_cd %>" dataformat="num" caption="Rep. Commodity Code" maxlength="4" id="rep_cmdt_cd" /> </td>
					</tr>
					<tr>
						<td><input type="radio" name="rdo_search_type" value="C" class="trans" id="rdo_search_type" /></td>
						<th>Commodity Keyword</th>
						<td><input type="text" name="cmdt_nm" style="width:100%;" class="input" value="" dataformat="engup" caption="Commodity Keyword" maxlength="40" id="cmdt_nm" /> </td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>		
	<div class="wrap_result">
		<div class="opus_design_grid clear" id="mainTable" >
				<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>
	</div>
	<!-- opus_design_grid(E) -->
</div>

</form>


<%@include file="/bizcommon/include/common_alps.jsp"%>