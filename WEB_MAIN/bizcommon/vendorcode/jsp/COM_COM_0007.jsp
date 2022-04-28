<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_COM_0007.jsp 
*@FileTitle  : Vendor Code Pop-up
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
<%@ page import="com.clt.bizcommon.vendorcode.event.ComCom0007Event"%>

<%
	ComCom0007Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";

	String mdm_yn = JSPUtil.getParameter(request, "mdm_yn".trim(), "");
	String status = JSPUtil.getParameter(request, "status".trim(), "");


	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (ComCom0007Event)request.getAttribute("Event");
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
<!-- 개발자 작업	-->
<input type="hidden" name="mdm_yn" value="<%=mdm_yn%>" id="mdm_yn" />
<div class="layer_popup_contents">
	<div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
	   <!-- page_title(S) -->
		<h2 class="page_title"><span>Vendor Code Inquiry</span></h2>
		<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve" 	id="btn_Retrieve">Retrieve</button><!--
			--><button type="button" class="btn_normal" name="btn2_Down_Excel" id="btn2_Down_Excel">Down Excel</button><!--
			--><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button><!--
			--><button type="button" class="btn_normal" name="btn_OK" id="btn_OK">OK</button><!--
			--><button type="button" class="btn_normal" name="btn_Close" id="btn_Close">Close</button><!--
		--></div>
		<!-- opus_design_btn(E) -->
		<!-- page_location(S) -->
		<div class="location">
			<span id="navigation"></span>
		</div>
		<!-- page_location(E) -->
	</div>
	<!-- page_title_area(E) -->
	</div>
	<!-- opus_design_grid(S) -->
	<div class= "wrap_search">
		<div class= "opus_design_inquiry wFit">
			<table>
				<colgroup>
					<col width="40" />
					<col width="110" />
					<col width="65" />
					<col width="110" />
					<col width="100" />
					<col width="138" />
					<col width="100" />
					<col width="*" />
				</colgroup>
				<tbody>
					 <tr>
						<th>Code</th>
						<td><input type="text" name="code" style="width:80px;" maxlength="6" id="code" /> </td>
						<th>Name</th>
						<td colspan="7"><input type="text" name="name" style="width:460px;" maxlength="100" id="name" /> </td>
					</tr> 
					<tr>
						<th>Country</th>
						<td><input type="text" name="country" style="width:80px;" maxlength="2" dataformat="enguponly" onkeyup="setgetUpper(this);" id="country" /> </td>
						<th>Location</th>
						<td><input type="text" name="location" style="width:80px;" maxlength="5" onkeyup="setgetUpper(this);" id="location" /> </td>
						<th>Control Office</th>
						<td><input type="text" name="office" style="width:80px;" maxlength="5" onkeyup="setgetUpper(this);" id="office" /> </td>
					<% if(!"".equals(mdm_yn) && mdm_yn.length() > 0){ %>
						<th>Status</th>
						<td>
							<select style="width:70px;" name="status">
									<option value="ALL" <%if("ALL".equals(status)){ %> selected="selected" <%} %>>ALL</option>
									<option value="N" <%if("N".equals(status) || "".equals(status)){ %> selected="selected" <%} %>>Active</option>
									<option value="Y" <%if("Y".equals(status)){ %> selected="selected" <%} %>>Delete</option>
								</select>
						</td>
					<% } %>
						<th>SCAC</th>
						<td><input type="text" style="width:100px;text-align:center;" class="input" dataformat="engup" id="scac" name="scac" maxlength="30" /> </td>
					</tr> 
				</tbody>
			</table>
		</div>
		
	</div>			
	<div class="wrap_result">
		<div class="opus_design_grid clear" id="mainTable" >
				<script type="text/javascript">ComSheetObject('sheet');</script>
		</div>
	</div>
	<!-- opus_design_grid(E) -->
</div>

</form>


<%@include file="../../include/common_alps.jsp"%>