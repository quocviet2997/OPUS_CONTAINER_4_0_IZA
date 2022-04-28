<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : userInfo.jsp
*@FileTitle : User Information
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/24
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.syscommon.management.opus.user.vo.ComUserInfoVO"%>
<%@ page import="java.util.List"%>

<%
	SignOnUserAccount account = null;
	ComUserInfoVO comuser = new ComUserInfoVO();
	// 초기화면 로딩시 서버로부터 가져온 데이터 추출하는 로직추가 ..
	GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
	Object obj = (Object)eventResponse.getCustomData("ComUserInfoVO");
	List<ComUserInfoVO> rsVoList = (List<ComUserInfoVO>)obj;
%>
<script language="javascript" type="text/javascript" src="syscommon/management/opus/usermanagement/script/ADM_SYS_0008.js"></script>
<SCRIPT LANGUAGE="javascript">
    function setupPage(){
	<%
	if ( rsVoList.size() > 0){ 
		comuser = rsVoList.get(0);
		String usrId = comuser.getUsrId();
		String usrNm = comuser.getUsrNm();
		String ofcKrnNm = comuser.getOfcKrnNm();
		String ofcCd = comuser.getOfcCd();
		String srepCd = comuser.getSrepCd();
		String faxNo = comuser.getFaxNo();
		String usrEml = comuser.getUsrEml();
	%>
		eval("UsrId").value = "<%= usrId %>";
	    eval("UsrNm").value = "<%= usrNm %>";
	    eval("OfcKrnNm").value = "<%= ofcKrnNm %>";
	    eval("OfcCd").value = "<%= ofcCd %>";
	    eval("SrepCd").value = "<%= srepCd %>";
	    eval("FaxNo").valuee = "<%= faxNo %>";
	    eval("UsrEml").value = "<%= usrEml %>";
	<% } else {%>
		alert('User information is not.');
		self.close();
	<%}%>
}
</SCRIPT>

<div class="layer_popup_title">
	<div class="page_title_area clear">
		<h2 class="page_title"><span>User Information</span></h2>
		
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_Close" id="btn_Close">Close</button>
		</div>
	</div>
</div>
<div class="layer_popup_contents">
	<div class="wrap_result">
		<div class="opus_design_inquiry">
			<table> 
				<tbody>
					<tr>
						<th width="40">Name</th>
						<td><input type="text" style="width:100%;" class="noinput" id="UsrNm" name="UsrNm" readonly></td>
					</tr>
					<tr>
						<th>Id</th>
						<td><input type="text" style="width:100%;" class="noinput" id="UsrId" name="UsrId" readonly></td>
					</tr>
					<tr>
						<th>Dept.</th>
						<td><input type="text" style="width:100%;" class="noinput" id="OfcKrnNm" name="OfcKrnNm" readonly></td>
					</tr>
					<tr>
						<th>Office</th>
						<td><input type="text" style="width:100%;" class="noinput" id="OfcCd" name="OfcCd" readonly></td>
					</tr>
					<tr>
						<th>SALES REP. CODE</th>
						<td><input type="text" style="width:100%;" class="noinput" id="SrepCd" name="SrepCd" readonly></td>
					</tr>
					<tr>
						<th>Fax</th>
						<td><input type="text" style="width:100%;" class="noinput" id="FaxNo" name="FaxNo" readonly></td>
					</tr>
					<tr>
						<th>E-mail</th>
						<td><input type="text" style="width:100%;" class="noinput" id="UsrEml" name="UsrEml" readonly></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>
