<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   FNS_JOO_0081.jsp
*@FileTitle  : Booking Inquiry
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.carriersettlementprocess.event.FnsJoo0081Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0081Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.CarrierSettlementProcess");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0081Event)request.getAttribute("Event");
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

<script language="javascript">
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
	 
		<div class="page_title_area clear ">
		<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--  
			--><button type="button" class="btn_normal" name="btn_DownExcel" id="btn_DownExcel">Down Excel</button>	
		</div>

		<div class="location">
			<span id="navigation"></span>
		</div>
	</div>


	<div class="wrap_search">
		<div class="opus_design_inquiry opus_design_inquiryTab wFit">  <!-- TAB  -->
		<div class="opus_design_inquiry wFit">   <!-- no TAB  -->
			<table> 
				<tbody>
					<tr><td>
	                <!--  biz_1  (S) -->
	                <table> 
	                <tr>
	                <th width="50">VSL/VOY</td>
	                    <td width="120"><input type="text" style="width:80" class="input1"  required maxlength='8'  dataformat="engup" caption='VVD' style="ime-mode:disabled"  fullfill name='vvd' >
	                </td>
	                <th width="50">HC Rate</td>
	                    <td width="80"><input type="text" style="width:40" class="nummask_input1"  required  caption='HC Rate' style="ime-mode:disabled"   name='ratehc' value="2">
	                </td>
	                <th width="50">45 Rate</td>
	                    <td width=""><input type="text" style="width:40" class="nummask_input1"  required     caption='45 Rate' style="ime-mode:disabled"   name='rate45'  value="2" >
	                </td>
	                </tr>
	                </table>                
	                <!--  biz_1   (E) -->
	            </td>
	        </tr>
				</tbody>
			</table>
		</div>
	</div>
	</div>
	<div class="wrap_result">
		
			<!-- opus_grid_design_btn(S) -->
		<div class="opus_design_grid">
			<script language="javascript">ComSheetObject('sheet1');</script>
			<!-- opus_grid_design_btn(E) -->
		</div>
	
</form>
