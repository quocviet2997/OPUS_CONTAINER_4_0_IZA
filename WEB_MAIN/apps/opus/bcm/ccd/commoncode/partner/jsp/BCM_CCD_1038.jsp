<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_1038.jsp
*@FileTitle  : CUST PFMC DUP_CHECK GRP_POPUP
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/04
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.partner.event.BcmCcd0038Event"%>
<%@ page import="com.clt.framework.component.util.StringUtil" %>
<%@ page import="org.apache.log4j.Logger" %>

<%
	BcmCcd0038Event event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//Error from server
	String strErrMsg = "";						//Error message
	int rowCount	 = 0;						//Count of DB resultSet list

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String mdm_yn 			= "";
	String cust_grp_nm = StringUtil.xssFilter(JSPUtil.getParameter(request, "cust_grp_nm".trim(), ""));
	String ofc_cd = StringUtil.xssFilter(JSPUtil.getParameter(request, "ofc_cd".trim(), ""));
	Logger log = Logger.getLogger("com.clt.apps.BizCommon.Account");
	
	// 승인처리 관련
 	String rqstNo = JSPUtil.getParameter(request, "rqst_no");
	
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
	   
	   
		event = (BcmCcd0038Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
		
		mdm_yn = StringUtil.xssFilter(request.getParameter("mdm_yn"));
		
		
	}catch(Exception e) {
		log.error(e.toString());
	}
%>
<LINK href="/opuscntr/css/alps_contents.css" type="text/css" rel="stylesheet"/>
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
<input type="hidden" name="mdm_yn" value="<%=mdm_yn%>" id="mdm_yn" />
<input type="hidden" name="rqst_no" value="<%=rqstNo%>" id="rqst_no" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<h2 class="page_title"><span>Group Customer Code Duplicate Check Inquiry</span></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
    <div class="opus_design_btn">
    	<button type="button"    class="btn_accent" id="btn_crt" style="display:none" name="btn_crt">Request</button><!-- 
     --><button type="button" class="btn_normal"  name="btn_chk_dupl">Check Duplicate</button><!-- 
     --><button type="button" class="btn_normal" name="btn_close">Close</button>
    </div>
	 <!-- opus_design_btn(E) -->
</div>
<div class="wrap_search">
		<!-- opus_design_inquiry(S) -->
		<div class="opus_design_inquiry wFit">
			<table> 
	             <colgroup>
	                <col width="40"> 
	                <col width="80">
	                <col width="80">
	                <col width="90"> 
	                <col width="100">
	                <col width="*">
	            </colgroup>
	            <tbody>
		             <tr>
						<th>Name</th>
						<td><input type="text" name="cust_grp_nm" id="cust_grp_nm"  style="width:330px" maxlength="100" class="input" value="<%=cust_grp_nm %>"></td>
						<th>Office</th>
						<td><input type="text" name="ofc_cd" id="ofc_cd" dataformat="enguponly" style="width:80px;ime-mode:disabled" maxlength="6" class="input"  value="<%= ofc_cd%>"></td>											
						<th>Match Rule</th>
						<td>
							<select style="width:72px;" class="input" name="match_rule" id="match_rule">
								<option value="I" selected>Include</option>
								<option value="E">Exact</option>
								<option value="S">Start with</option>
							</select>
	                   </td>
					</tr>
				</tbody>
			</table>
			</div>
			</div>	
			<div class="wrap_result">
			Duplicate Check Result
			<!-- opus_design_grid(S) -->
			<div class="opus_design_grid" id="mainTable" >		
				<script type="text/javascript">ComSheetObject('sheet1');</script>
			<!-- opus_design_grid(E) -->
			</div>
		</div>
		<!-- opus_design_inquiry(E) -->

</form>
<%@ include file="/bizcommon/include/common_alps.jsp"%>