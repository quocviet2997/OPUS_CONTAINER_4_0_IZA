<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_1040.jsp
*@FileTitle  : Vendor Code Duplicate Check Inquiry
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/04
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.partner.event.BcmCcd1040Event"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.component.util.StringUtil" %>

<%
	BcmCcd1040Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//Error from server
	String strErrMsg = "";						//Error message
	int rowCount	 = 0;						//Count of DB resultSet list
	
	String strUsr_id		= "";
	String strUsr_nm		= "";
	String mdm_yn 			= "";
	
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";
	
	String name = StringUtil.xssFilter(JSPUtil.getParameter(request, "name".trim(), ""));
	//String location = JSPUtil.getParameter(request, "location".trim(), "");
	String vndr_cnt_cd = StringUtil.xssFilter(JSPUtil.getParameter(request, "vndrCntCd".trim(), ""));
	
	// 승인처리 관련
 	String rqstNo = StringUtil.xssFilter(JSPUtil.getParameter(request, "rqst_no"));
	
	try {
		SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		
		event = (BcmCcd1040Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
		
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		
		mdm_yn = StringUtil.xssFilter(request.getParameter("mdm_yn"));
		
	}catch(Exception e) {
		out.println(e.toString());
	}
%>
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
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="word1" id="word1" />
<input type="hidden" name="word2" id="word2" />
<input type="hidden" name="mdm_yn" value="<%=mdm_yn%>" id="mdm_yn" />
<input type="hidden" name="rqst_no" value="<%=rqstNo%>" id="rqst_no" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<h2 class="page_title"><span>Vendor Code Duplicate Check Inquiry</span></h2>
	<!-- page_title(E) -->
		 <!-- opus_design_btn(S) -->
	    <div class="opus_design_btn">
	    	   <button type="button" class="btn_accent" style='display:none' id="btn_Go" name="btn_Go">Request</button><!-- 
	    	--><button type="button" class="btn_normal" name="btn_Check" id="btn_Check">Check Duplicate</button><!-- 
			--><button type="button" class="btn_normal" name="btn_Close" id="btn_Close">Close</button>
	    </div>
	    <!-- opus_design_btn(E) -->
</div>
<!-- page_title_area(E) -->

<div class="wrap_search">
		<!-- opus_design_inquiry(S) -->
		<div class="opus_design_inquiry wFit">
			<table> 
	            <colgroup>
	                <col width="60">	                
	                <col width="*">
	            </colgroup>
	            <tbody>
	               	<tr>
						<th>&nbsp Name</th>
						<td><input type="text" name="name" id="name" style="width:650px;" maxlength="200" value="<%=name%>"></td>
					</tr> 
				</tbody>
			</table>
			<table> 
	            <colgroup>
	                <col width="60">	
	                <col width="497">
	                <col width="60">                
	                <col width="*">
	            </colgroup>
	            <tbody>
		             <tr>
						<th>&nbsp Country</th>
						<td><input type="text" name="vndr_cnt_cd" id="vndr_cnt_cd" dataformat="uppernum" maxlength="2" size="40" style="width:40%;ime-mode:disabled"  value="<%=vndr_cnt_cd%>"></td>
						<th>Match Rule</th>
						<td>
					        <select style="width:82px;" class="input" name="match_rule" id="match_rule">
								<option value="I" selected>Include</option>
								<option value="E">Exact</option>
								<option value="S">Start with</option>
							</select>
						</td>
					</tr> 
				</tbody>
			</table>
		</div></div>
		<!-- opus_design_inquiry(E) -->
	<div class="wrap_result">	
		Duplication Check Result
	
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid" id="mainTable" >		
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	<!-- opus_design_grid(E) -->
	</div>
</div>
</form>
<%@include file="/bizcommon/include/common_opus.jsp"%>