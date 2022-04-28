<%
/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0056.jsp
*@FileTitle  : Certificate Upload
*@author     : CLT
*@version    : 1.0
*@since      : 2018/02/24
=========================================================
*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.partner.event.*"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	BcmCcd0056Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";
	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.SpecialCargoBookingConduct.specialcargorider");
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		event = (BcmCcd0056Event)request.getAttribute("Event");
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
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form">
<input id="f_cmd" name="f_cmd" type="hidden" />
<input id="pagerows" name="pagerows" type="hidden" />
<input id="cust_cnt_cd" name="cust_cnt_cd" type="hidden" />
<input id="cust_seq" name="cust_seq" type="hidden" />
<input id="rqst_no" name="rqst_no" value="<%=JSPUtil.getParameter(request, "rqst_no")%>" type="hidden" />
<input id="cust_cd" name="cust_cd" value="<%=JSPUtil.getParameter(request, "cust_cd")%>" type="hidden" />
<input id="certi_sav_id" name="certi_sav_id" value="<%=JSPUtil.getParameter(request, "certi_sav_id")%>" type="hidden" />
<input id="file_sav_id" name="file_sav_id" type="hidden" />


	<div name="pop_title" id="pop_title" class="page_title_area clear">
		<h2 class="page_title"><span>Certificate Upload</span></h2>

		<div class="opus_design_btn">
		   <button type="button" id="btn_upload" name="btn_upload" class="btn_normal">File Add</button><!--
		--><button type="button" id="btn_delete" name="btn_delete" class="btn_normal">File Delete</button><!--
		--><button type="button" id="btn_save" name="btn_save" class="btn_normal">Save</button><!--
		--><button type="button" id="btn_close" name="btn_close" class="btn_normal">Close</button>
		</div>
	</div>
	
	<div class="wrap_result">
		<div class="opus_design_grid">
			<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>
		<div class="opus_design_grid" style="display:none">
			<script>ComUploadObject('upload1', '<=session.getId()%>');</script>
		</div>
		<iframe name="hiddenFrame" style="visibility:hidden" height="0" width="0" frameborder="0" marginHeight="0"	marginWidth="0"></iframe>
	</div>

</form>
