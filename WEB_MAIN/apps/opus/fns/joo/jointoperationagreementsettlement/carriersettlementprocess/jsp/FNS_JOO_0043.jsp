<%
/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName :  FNS_JOO_0043.jsp
 *@FileTitle: Slot Exchange Status by Lane & Partner->Finance &amp Partner
 *@author   : CLT
 *@version  : 1.0
 *@since    : 2014/06/19
 =========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.carriersettlementprocess.event.FnsJoo0043Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0043Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.CarrierSettlementProcess");
	String yyyyMM = JSPUtil.getKST("yyyy-MM");
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0043Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

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
    var yyyyMM = "<%=yyyyMM%>";
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form" id="form">
<input type="hidden" name="f_cmd" id="f_cmd">
<input type="hidden" name="pagerows" id="pagerows">


<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" name="btn_Retrieve" id="btn_Retrieve" type="button">Retrieve</button><!--
		--><button class="btn_normal" name="btn_New" id="btn_New" type="button">New</button><!--
		--><button class="btn_normal" name="btn_Down_Excel" id="btn_Down_Excel" type="button">Down Excel</button><!--
		--></div>
	<!-- opus_design_btn (E) -->
		
	<!-- page_location(S) -->
	<div class="location">
		<span id="navigation"></span>
	</div>
</div>
<!-- page_title_area(E) -->


<div class= "wrap_search">
<!-- opus_design_inquiry(S) -->
	<div class= "opus_design_inquiry sm">
		<table style="width:979px">
			<tbody>
				<colgroup>
					<col width="50"/>
					<col width="*"/>
			    </colgroup>
			    <tr>
					<th>Period</th>
					<td>
                        <input type="text" style="width:60px;text-align:center" class="input1" dataformat="ym" maxlength="6" value="<%=yyyyMM %>" caption="Period" required="" fullfill="" name="acct_yrmon" id="acct_yrmon" /><!-- 
                         --><button type="button" class="btn_left" name="btn_acct_yrmon_back" id="btn_acct_yrmon_back"></button><!-- 
						--><button type="button" class="btn_right" name="btn_acct_yrmon_next"  id="btn_acct_yrmon_next"></button>
                   </td>					    
			     </tr> 
				
			</tbody>
		</table>
		<table class="height_10"><tr><td colspan="8"></td></tr></table>
	</div>
</div>

<!-- opus_design_grid(S) -->
<div class="wrap_result">	
	<div class= "opus_design_inquiry">
	
		<table class="search" border="0">
				<tr><td class="title_h"></td>
					<td><h3 class="title_design mar_top_12">Slot Release</h3></td>
					<td class="sm" align="right"><b>(Unit : USD/TEU)</b></td></tr>
		</table>
		<div class="opus_design_grid" >					
			<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>	
	</div>
	<table class="line_bluedot"><tr><td></td></tr></table>
	<div class= "opus_design_inquiry">
		<table class="search" border="0">
			<tr><td class="title_h"></td>
				<td><h3 class="title_design mar_top_12">Slot Purchase</h3></td>
				<td class="sm" align="right"><b>(Unit : USD/TEU)</b></td></tr>
		</table>
		<div class="opus_design_grid" >	
			<script type="text/javascript">ComSheetObject('sheet2');</script>
		</div>	
	</div>
</div>
<!-- opus_design_grid(E) -->

</form>
