<%
/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_JOO_0053.jsp
*@FileTitle  : Other VVD Check 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/
=========================================================
*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.util.StringUtil"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.carriersettlementprocess.event.FnsJoo0053Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0053Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.CarrierSettlementProcess");

	String vslCd    = "";
	String skdVoyNo = "";
	String skdDirCd = "";
	String revDirCd = "";
	String reDivrCd = "";
	String joCrrCd  = "";
	String rlaneCd  = "";
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0053Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		vslCd    = StringUtil.xssFilter(request.getParameter("vslCd"))    == null ? ""  : StringUtil.xssFilter(request.getParameter("vslCd"));
		skdVoyNo = StringUtil.xssFilter(request.getParameter("skdVoyNo")) == null ? ""  : StringUtil.xssFilter(request.getParameter("skdVoyNo"));		
		skdDirCd = StringUtil.xssFilter(request.getParameter("skdDirCd")) == null ? ""  : StringUtil.xssFilter(request.getParameter("skdDirCd"));		
		revDirCd = StringUtil.xssFilter(request.getParameter("revDirCd")) == null ? ""  : StringUtil.xssFilter(request.getParameter("revDirCd"));		
		reDivrCd = StringUtil.xssFilter(request.getParameter("reDivrCd")) == null ? ""  : StringUtil.xssFilter(request.getParameter("reDivrCd"));		
		joCrrCd  = StringUtil.xssFilter(request.getParameter("joCrrCd"))  == null ? ""  : StringUtil.xssFilter(request.getParameter("joCrrCd"));		
		rlaneCd  = StringUtil.xssFilter(request.getParameter("rlaneCd"))  == null ? ""  : StringUtil.xssFilter(request.getParameter("rlaneCd"));		

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
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
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="vsl_cd" value="<%=vslCd%>" id="vsl_cd" />
<input type="hidden" name="skd_voy_no" value="<%=skdVoyNo%>" id="skd_voy_no" />
<input type="hidden" name="skd_dir_cd" value="<%=skdDirCd%>" id="skd_dir_cd" />
<input type="hidden" name="rev_dir_cd" value="<%=revDirCd%>" id="rev_dir_cd" />
<input type="hidden" name="re_divr_cd" value="<%=reDivrCd%>" id="re_divr_cd" />
<input type="hidden" name="jo_crr_cd" value="<%=joCrrCd%>" id="jo_crr_cd" />
<input type="hidden" name="rlane_cd" value="<%=rlaneCd%>" id="rlane_cd" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title">
		<span>Manual Settlement</span>
	</h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button type="button" id="btn_close" name="btn_close" class="btn_accent">Close</button>
	</div>
	<!-- opus_design_btn (E) -->
</div>
<!-- page_title_area(E) -->

<div class="wrap_result">
	<h3 class="title_design">VVD Check</h3>
	<div class="opus_design_grid">
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
</div>
</form>