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
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.renewalconsultation.event.FnsJoo0107Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0107Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String joCrrCdComboItems	= "";
	String acctgCrrCdComboItems	= "";
	String acctgCrrNmComboItems	= "";
	String authOfcCdComboItems	= "";
	
	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.RenewalConsultation");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0107Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

		joCrrCdComboItems  	= eventResponse.getETCData("jo_crr_cds");
		//acctgCrrCdComboItems= eventResponse.getETCData("acctg_crr_cds");
		//acctgCrrNmComboItems= eventResponse.getETCData("acctg_crr_nms");
		authOfcCdComboItems = eventResponse.getETCData("auth_ofc_cds");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>


<script type="text/javascript">
	var gJoCrrCdComboItems 		= "<%=joCrrCdComboItems%>";
	var gAuthOfcCdComboItems	= "<%=authOfcCdComboItems%>";
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
<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn"><!-- 
		--><button type="button" class="btn_accent" name="btn_Retrieve" 		id="btn_Retrieve">Retrieve</button><!-- 
		--><button type="button" class="btn_normal" name="btn_New" 				id="btn_New">New</button><!--  
		--><button type="button" class="btn_normal" name="btn_DownExcel" 		id="btn_DownExcel">Down Excel</button><!-- 
		--><button type="button" class="btn_normal" name="btn_GoToStl" 			id="btn_GoToStl">Go to Settlement</button><!--
		--><button type="button" class="btn_normal" name="btn_InvoiceReport" 			id="btn_InvoiceReport">Invoice Report</button> <!--
	--></div>
	<!-- opus_design_btn(E) -->

	<!-- page_location(S) -->
	<div class="location">	
		<span id="navigation"></span>
	</div>
	<!-- page_location(E) -->	
</div>
<!-- page_title_area(E) -->

<!-- wrap_search(S) -->
<div class="wrap_search">
<!-- opus_design_inquiry(S) -->
<div class="opus_design_inquiry wFit">
	<table>
		<tbody>
			<colgroup>
				<col width="80px">
				<col width="200px">
				<col width="55px">
				<col width="170px">
				<col width="55px">
				<col width="75px">
				<col width="55px">
				<col width="75px">
				<col width="80px">
				<col width="100px">
				<col width="*" />
			</colgroup>
			<tr class="h23">
				<th>Invoice Month</th>
			    <td><input type="text" style="width:60px;" class="input1" dataformat="ym" maxlength="6" name="fr_acct_yrmon" value="" id="fr_acct_yrmon" cofield="btn_vvd_from_back"/><!--  
			    --><button type="button" class="btn_left" name="btn_vvd_from_back" id="btn_vvd_from_back"></button><!--  
			    --><button type="button" class="btn_right" name="btn_vvd_from_next" id="btn_vvd_from_next"></button>~ <!--  
			    --><input type="text" style="width:60px;" class="input1" maxlength="6" dataformat="ym" name="to_acct_yrmon" value="" cofield="btn_vvd_to_next" id="to_acct_yrmon" /><!-- 
			    --><button type="button" class="btn_left" name="btn_vvd_to_back" id="btn_vvd_to_back"></button><!--  
			    --><button type="button" class="btn_right" name="btn_vvd_to_next" id="btn_vvd_to_next"></button></td>
			    <th>Partner</th>
				<td><script type="text/javascript">ComComboObject('jo_crr_cds', 1, 170, 0, 0);</script></td>
               	<th>Trade</th>
				<td><script type="text/javascript">ComComboObject('trd_cd',1,55,0,0);</script></td>
               	<th>Office</th>
               	<td><script type="text/javascript">ComComboObject('auth_ofc_cd',1, 80,0, 0);</script></td>
				<th>Rev./Exp.</th>
				<td><script type="text/javascript">ComComboObject('re_divr_cd',1,90,0,0);</script></td>
				<td></td>
			</tr>
		</tbody>
	</table>
</div>
<!-- opus_design_inquiry(E) -->
</div>
<!-- wrap_search(E) -->

<!-- opus_design_grid(S) -->
<div class="wrap_result">
	<!-- layout_wrap(S) -->
	<div class="layout_wrap">
		<div class="opus_design_tab">
			<script language="javascript">ComTabObject('tab1');</script>
		</div>
		
		<!-- opus_design_grid(S) -->	
		<div class="opus_design_grid clear" style="width:98%" name="tabLayer" id="tabLayer">
			<script type="text/javascript">ComSheetObject('t1sheet1');</script>
		</div>
		<div class="opus_design_grid clear" style="width:98%" name="tabLayer" id="tabLayer">
			<script type="text/javascript">ComSheetObject('t2sheet1');</script>
		</div>
		<!-- opus_design_grid(E) -->
	</div>
</div>
<!-- wrap_result(E) -->				
</form>
