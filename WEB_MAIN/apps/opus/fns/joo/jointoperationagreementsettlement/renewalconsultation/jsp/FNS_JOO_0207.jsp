<%
/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : FNS_JOO_0207.jsp
 *@FileTitle : THEA Invoice Summary & Creation
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
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.renewalconsultation.event.FnsJoo0207Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0207Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";
	
	String strUsr_id		= "";
	String strUsr_nm		= "";
	String theaStlGrpNo		= "";
	String vndrSeq    		= "";
	String custSeq    		= "";
	
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.RenewalTheaConsultation");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();

		event = (FnsJoo0207Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

		theaStlGrpNo    	= StringUtil.xssFilter(request.getParameter("thea_stl_grp_no")) 	== null ? ""  : StringUtil.xssFilter(request.getParameter("thea_stl_grp_no"));
		vndrSeq    	  		= StringUtil.xssFilter(request.getParameter("vndr_seq"))		 	== null ? ""  : StringUtil.xssFilter(request.getParameter("vndr_seq"));
		custSeq    	  		= StringUtil.xssFilter(request.getParameter("cust_cnt_cd_seq"))		== null ? ""  : StringUtil.xssFilter(request.getParameter("cust_cnt_cd_seq"));

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
<input type="hidden" name="thea_stl_grp_no" value="<%=theaStlGrpNo%>">
<input type="hidden" name="bal_act_flg">
<input type="hidden" name="vndr_seq" value="<%=vndrSeq%>">
<input type="hidden" name="cust_seq" value="<%=custSeq%>">
<!-- popup_title_area(S) -->
<div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title"><span>THEA Invoice Summary &amp; Creation!!</span></h2>
		<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn"><!--
			--><button type="button" class="btn_normal" name="btn_Save" 			id="btn_Save">Save</button><!-- 
			--><button type="button" class="btn_normal" name="btn_Close" 			id="btn_Close">Close</button>
		</div>
		<!-- opus_design_btn(E) -->	
	</div>
	<!-- page_title_area(E) -->
</div>
<!-- page_title_area(E) -->

<div class="layer_popup_contents" >	
<!-- wrap_search(S) -->
<div class="wrap_search">
<!-- opus_design_inquiry(S) -->
<div class="opus_design_inquiry wFit">
	<table>
		<tbody>
			<colgroup>
				<col width="60px">
				<col width="80px">
				<col width="60px">
				<col width="80px">
				<col width="80px">
				<col width="200px">
				<col width="*" />
			</colgroup>
			<tr class="h23">
				<th>Due Date</th>
				<td><input type="text" style="width:80px;" name="rqst_dt" dataformat="ymd" maxlength="10" class="input1" id="rqst_dt"/>
					<button type="button" id="btnRqstDt" name="btnRqstDt" class="calendar ir"></button></td>
				<th>Issue Date</th>
				<td><input type="text" style="width:80px;" name="inv_iss_dt" dataformat="ymd" maxlength="10" class="input1" id="inv_iss_dt" onBlur="obj_change(this)"/>
					<button type="button" id="btnInvIssDt" name="btnInvIssDt" class="calendar ir"></button></td>
				<th id="td_bal_txt">Balance</th>
				<td><input id="bal_act_amt" name="bal_act_amt" style="width: 200px; text-align:right;ime-mode:disabled;" class="input1" dataformat="singledFloat"  maxlength="25" size="7" pointcount="2" value="" type="text"  readonly/></td>
				<td></td>
			</tr>
		</tbody>
	</table>
</div>
<!-- opus_design_inquiry(E) -->
</div>
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
