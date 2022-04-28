<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : COM_CSR_0006.jsp
*@FileTitle  : Invoice CSR Creation -Preview
*@author     : CLT
*@version    : 1.0
*@since      : 2014/09/02
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.event.ComCsr0006Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	ComCsr0006Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//Error from server
	String strErrMsg = "";						//Error message
	int rowCount	 = 0;						//The list count of DB ResultSet

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	
	DBRowSet rowSet	  = null;							   //DB ResultSet
	String cnt_cd  = "";
	String previewFlg  = "";
	String previewFlgYN  = "";	

	previewFlg 			 	= JSPUtil.getParameter(request, "previewFlg 			      ".trim(), "");
	previewFlgYN 		 	= JSPUtil.getParameter(request, "previewFlgYN 			      ".trim(), "");
	
	Logger log = Logger.getLogger("com.clt.apps.ConsultationSlipRequestMgt.ConsultationSlipRequestMgt");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (ComCsr0006Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
	strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<script language="javascript" type="text/javascript" src="bizcommon/csr/CoCsr.js"></script>
<script language="javascript" src="/opuscntr/rpt/script/common_rd.js"></script>
<script language="javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			showErrMessage(errMessage);
		} // end if
		loadPage();		
	}
	var cnt_cd = "<%=cnt_cd%>";
	var previewFlg  = "<%=previewFlg%>";
	var previewFlgYN  = "<%=previewFlgYN%>";
</script>

<form method="post" name="form" onSubmit="return false;">
<input type="hidden" name="f_cmd"> 
<input type="hidden" name="iPage">

<!-- OUTER - POPUP (S)tart -->

<div class="layer_popup_title">
	<div class="page_title_area clear">
		<h2 class="page_title"><span>Invoice CSR Preview</span></h2>
		
		<div class="opus_design_btn">
			<div id='btng_approvalrequest_yn' style="display:none">
				<button type="button" class="btn_normal" name="btng_approvalrequest" id="btng_approvalrequest">Approval Request</button><!-- -->
			</div>
			<div id='btng_approvalrequest_yn' style="display:none">
				<button type="button" class="btn_normal" name="btng_print" id="btng_print">Print</button><!-- -->
			</div>
			<button type="button" class="btn_normal" name="btng_close" id="btng_close">Close</button>
		</div>
	</div>
</div>

<div class="layer_popup_contents">
	
	<div class="wrap_result">
		<div class="opus_design_RD"> 
			<script language='javascript'>rdViewerObject();</script>
		</div>
	</div>
</div>

</form>
