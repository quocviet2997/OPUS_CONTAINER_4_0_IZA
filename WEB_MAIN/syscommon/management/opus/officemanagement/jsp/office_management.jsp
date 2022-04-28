<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : office_management.jsp
*@FileTitle  : office_management
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/16
=========================================================
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.StringUtil"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.management.opus.officemanagement.event.OfficeManagementEvent"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	OfficeManagementEvent  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수
	
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";
	
	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.${SC}.${BC}");
	
	try {
	   	SignOnUserAccount account = (SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
	
	
		event = (OfficeManagementEvent)request.getAttribute("Event");
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

<head>
<title>Program Office Mapping</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script language="javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>
</head>

<form name="form">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">

<div class="layer_popup_title">
	<div class="page_title_area clear">
		<h2 class="page_title"><span>Program Office Mapping</span></h2>
		
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_save" id="btn_save">Save</button><!--
			 --><button type="button" class="btn_normal" name="btn_DownExcel" id="btn_DownExcel">Down Excel</button><!--
			 --><button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button>
		</div>
	</div>
</div>

<div class="layer_popup_contents">
	<div class="wrap_search">
		<div class="opus_design_inquiry">
			<table>
				<tbody>
					<tr>
						<th width="60">Program No.</th>
						<td width="120"><input type="text" style="width:100px" class="input" value="<%=StringUtil.xssFilter(request.getParameter("pgm_no"))%>" name="pgm_no"></td>
						<th width="60">Program Name</th>
						<td colspan="2"><input type="text" style="width:300px;" class="input" value="<%=StringUtil.xssFilter(request.getParameter("pgm_nm"))%>" name="pgm_nm"></td>
					</tr> 
					<tr>
						<th>Office Access Level</th>
						<td colspan="3" class="sm">
							<input type="checkbox" id="ALL" name="ALL" onClick="chkBox('A', this.checked)"><label for="ALL">ALL</label>
							<input type="checkbox" id="SHO" name="SHO" onClick="chkBox('1', this.checked)"><label for="SHO">SHO</label>
							<input type="checkbox" id="RHQ" name="RHQ" onClick="chkBox('2', this.checked)"><label for="RHQ">RHQ</label>
							<input type="checkbox" id="GOF" name="GOF" onClick="chkBox('3', this.checked)"><label for="GOF">GOF</label>
							<input type="checkbox" id="AGT" name="AGT" onClick="chkBox('6', this.checked)"><label for="AGT">AGT</label>
						</td>
					</tr> 
					<tr>
						<th>County Code</th>
						<td><input type="text" style="width:100px;" name= "countryCd" class="input" value="" onKeyPress="javascript:ComKeyOnlyAlphabet('uppernum');"><!-- 
						 --><button type="button" class="input_seach_btn" name="btn_cnt_cd"></button>
						<th>AR OFC</th>
						<td width="146"><input type="text" style="width:100px;" name= "arOfcCd" class="input" value="" onKeyPress="javascript:ComKeyOnlyAlphabet('uppernum');"><!--
						--><button type="button" class="input_seach_btn" name="btn_ofc_cd"></button></td>
						<td><input type="checkbox" id="CHK" name="CHK" onClick="chkBox('Z', this.checked)"><label for="CHK">CHECK</label></td>
					</tr>
				</tbody>
			</table> 
		</div>
	</div>
	
	<div class="wrap_result">
		<!-- opus_design_grid(S) -->
		<div class="opus_design_grid" >
			<script language="javascript">ComSheetObject('sheet1');</script>
		</div>
	</div>
</div>
</form>