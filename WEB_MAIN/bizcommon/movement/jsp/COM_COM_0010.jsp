<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_COM_0010.jsp
*@FileTitle  : Movement Status Code Pop-up
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/24
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.movement.event.ComCom0010Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	ComCom0010Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.BizCommon.Account");
	
	String mdm_yn = request.getParameter("mdm_yn") != null ? request.getParameter("mdm_yn") : "";
	String delt_flg = request.getParameter("delt_flg") != null ? request.getParameter("delt_flg") : "";
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
	   
	   
		event = (ComCom0010Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
		
	}catch(Exception e) {
		log.error(e.toString());
	}
%>
<title>Movement Status Code Pop-up</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

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
<input type="hidden" name="f_cmd" id="f_cmd">
<input type="hidden" name="pagerows" id="pagerows">
<input type="hidden" name="mdm_yn" id="mdm_yn" value="<%=mdm_yn%>">

<!-- page_title_area(S) -->
<div class="layer_popup_title">
	<div class="page_title_area clear">
	   <!-- page_title(S) -->
		<h2 class="page_title"><span>Movement Status Code Inquiry</span></h2>
		<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			    <button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_DownExcel">Down Excel</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_New">New</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_select">OK</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_close">Close</button>
		</div>
		<!-- opus_design_btn(E) -->
	</div>
</div>

<div class="layer_popup_contents">
	<div class="wrap_search">
		<!-- opus_design_inquiry(S) -->
		<div class="opus_design_inquiry wFit">
			<table> 
				<colgroup>
					<col width="40">
					<col width="80">
					<col width="70">
					<col width="*">
				</colgroup>
				<tbody>
					<tr>
						<th>Code</th>
						<td><input type="text" name="mvmt_sts_cd" id="mvmt_sts_cd" dataformat="engup" style="width:50px;ime-mode:disabled" maxlength="2" class="input" value="<%=(request.getParameter("mvmt_sts_cd") == null) ? "" : request.getParameter("mvmt_sts_cd") %>"></td>
						<th>Description</th>
						<td><input type="text" name="mvmt_sts_nm" id="mvmt_sts_nm" dataformat="engup" otherchar=" " style="width:280px;ime-mode:disabled" maxlength="50" class="input"  value="<%=(request.getParameter("mvmt_sts_nm") == null) ? "" : request.getParameter("mvmt_sts_nm")%>"></td>
						<%
							if(!"".equals(mdm_yn) && mdm_yn.length() > 0){
						%>
						<th>Status</th>
						<td>
							<select style="width:85px;" name="delt_flg" id="delt_flg">
									<option value="ALL" <%if("ALL".equals(delt_flg)){ %> selected="selected" <%} %>>ALL</option>
									<option value="N" <%if("N".equals(delt_flg) || "".equals(delt_flg)){ %> selected="selected" <%} %>>Active</option>
									<option value="Y" <%if("Y".equals(delt_flg)){ %> selected="selected" <%} %>>Delete</option>
								</select>
						</td>
					<%
							}
					%>
						<td>&nbsp;</td>
					</tr>
				</tbody>
			</table>
		</div>
		</div>
		<!-- opus_design_inquiry(E) -->
		<div class="wrap_result">
		<!-- opus_design_grid(S) -->
		<div class="opus_design_grid" id="mainTable">
			<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>
		<!-- opus_design_grid(E) -->
	</div>
</div>
</form>
<%@ include file="/bizcommon/include/common_alps.jsp"%>