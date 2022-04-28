<%
/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : FNS_JOO_0080.jsp
 *@FileTitle : Combined Data Inquiry
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
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.jointoperationconsultation.event.FnsJoo0080Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0080Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.JointOperationConsultation");

	String yyyyMM = JSPUtil.getKST("yyyy-MM");
	String ofcList = "";
	String ofcCd  = "";

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0080Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		
		ofcList = eventResponse.getETCData("ofc_list");
		ofcCd   = eventResponse.getETCData("ofc_cd");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>


<script type="text/javascript">
var gOfcCd = "<%=ofcCd%>";

	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage("<%=ofcList%>");
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
	<div class="opus_design_btn">
		<button type="button" class="btn_accent" name="btn_retrieve" 		id="btn_retrieve">Retrieve</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_new" 			id="btn_new">New</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_downexcel" 			id="btn_downexcel">Down Excel</button>			
	</div>
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
				<col width="10px" />
				<col width="100px" />
				<col width="*" />
			</colgroup>
			<tr class="h23">
				<th>Account Month</th>
				<td><input type="text" style="width:70px" class="input1" value="<%=yyyyMM%>" name="fr_dt" dataformat='ym' maxlength="6" ><button type="button" class="btn_left" name="btn_fr_back" id="btn_fr_back"></button><button type="button" class="btn_right" name="btn_fr_next" id="btn_fr_next"></button>~ <input type="text" style="width:70px" class="input1" value="<%=yyyyMM%>" name="to_dt" dataformat='ym' maxlength="6" ><button type="button" class="btn_left" name="btn_to_back" id="btn_to_back"></button><button type="button" class="btn_right" name="btn_to_next" id="btn_to_next"></button></td>
				<td>&nbsp;</td>
				<%--
				<th>Office</th>
				<td><script type="text/javascript">ComComboObject('slp_ofc_cd',2,80,0,1);</script></td>
				--%>
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
	<script type="text/javascript">ComSheetObject('sheet1');</script>
</div>
<!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->
				
</form>