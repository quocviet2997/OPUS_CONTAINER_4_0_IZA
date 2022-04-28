<%
/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : FNS_JOO_0079.jsp
 *@FileTitle : Authority Office Creation
 *@author     : CLT
 *@version    : 1.0 
 *@since      : 2014/06/17 
 =========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.util.StringUtil"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.renewalconsultation.event.FnsJoo0108Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0108Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String joCrrCdComboItems	= "";
	String joStlItmCdComboItems = "";
    
	String pFrRevYrmon	= "";
	String pToRevYrmon  = "";
	String pReDivrCd	= "";
	String pJoCrrCd = "";
	String pTrdCd = "";
	String pRlaneCd = "";
	String pJoStlItmCds = "";
	String pRevVvd = "";
	String pAuthOfcCd = "";
	
	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.RenewalConsultation");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0108Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

		pFrRevYrmon    	= StringUtil.xssFilter(request.getParameter("fr_rev_yrmon")) 	== null ? ""  : StringUtil.xssFilter(request.getParameter("fr_rev_yrmon"));
		pToRevYrmon    	= StringUtil.xssFilter(request.getParameter("to_rev_yrmon"))   	== null ? ""  : StringUtil.xssFilter(request.getParameter("to_rev_yrmon"));
		pReDivrCd    	= StringUtil.xssFilter(request.getParameter("re_divr_cd"))   	== null ? ""  : StringUtil.xssFilter(request.getParameter("re_divr_cd"));
		pJoCrrCd    	= StringUtil.xssFilter(request.getParameter("jo_crr_cd"))    	== null ? ""  : StringUtil.xssFilter(request.getParameter("jo_crr_cd"));
		pTrdCd    		= StringUtil.xssFilter(request.getParameter("trd_cd"))    		== null ? ""  : StringUtil.xssFilter(request.getParameter("trd_cd"));
		pRlaneCd    	= StringUtil.xssFilter(request.getParameter("rlane_cd"))    	== null ? ""  : StringUtil.xssFilter(request.getParameter("rlane_cd"));
		pJoStlItmCds    = StringUtil.xssFilter(request.getParameter("jo_stl_itm_cds"))  == null ? ""  : StringUtil.xssFilter(request.getParameter("jo_stl_itm_cds"));
		pRevVvd    		= StringUtil.xssFilter(request.getParameter("rev_vvd"))    		== null ? ""  : StringUtil.xssFilter(request.getParameter("rev_vvd"));	
		pAuthOfcCd 		= StringUtil.xssFilter(request.getParameter("auth_ofc_cd"))    	== null ? ""  : StringUtil.xssFilter(request.getParameter("auth_ofc_cd"));	
		
		joCrrCdComboItems  	= eventResponse.getETCData("jo_crr_cds");
		joStlItmCdComboItems= eventResponse.getETCData("item_cds");


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
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
<input type="hidden" name="fr_rev_yrmon"	id="fr_rev_yrmon"  	value="<%=pFrRevYrmon%>">
<input type="hidden" name="to_rev_yrmon"	id="to_rev_yrmon"  	value="<%=pToRevYrmon%>">
<input type="hidden" name="re_divr_cd"		id="re_divr_cd"  	value="">
<input type="hidden" name="jo_crr_cd"		id="jo_crr_cd"  	value="<%=pJoCrrCd%>">
<input type="hidden" name="trd_cd"			id="trd_cd"  		value="<%=pTrdCd%>">
<input type="hidden" name="rlane_cd"		id="rlane_cd"  		value="<%=pRlaneCd%>">
<input type="hidden" name="jo_stl_itm_cds"	id="jo_stl_itm_cds" value="<%=pJoStlItmCds%>">
<input type="hidden" name="rev_vvd"			id="rev_vvd"  		value="<%=pRevVvd%>">
<input type="hidden" name="auth_ofc_cd"		id="auth_ofc_cd"  	value="<%=pAuthOfcCd%>">
<!-- Field for BackEndJob -->
<!-- popup_title_area(S) -->
 <div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title"><span>Settlement Summary</span></h2>
		<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn"><!-- 
			--><button type="button" class="btn_normal" name="btn_Close" 			id="btn_Close">Close</button>
		</div>
		<!-- opus_design_btn(E) -->	
	</div>
	<!-- page_title_area(E) -->
</div>
<!-- page_title_area(E) -->

<div class="layer_popup_contents" >	
<!-- wrap_search(S) -->
<!-- <div class="wrap_search"> -->
<!-- opus_design_inquiry(S) -->
<!-- 
<div class="opus_design_inquiry wFit">
</div>
 -->
<!-- opus_design_inquiry(E) -->
<!-- </div> -->
<!-- wrap_search(E) -->

<!-- wrap_result(S) -->
<div class="wrap_result">
<!-- opus_design_grid(S) -->
<div class="opus_design_grid">
	<!-- opus_design_btn(E) -->
	<script type="text/javascript">ComSheetObject('sheet1');</script>
</div>
<!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->
</div>				
</form>
