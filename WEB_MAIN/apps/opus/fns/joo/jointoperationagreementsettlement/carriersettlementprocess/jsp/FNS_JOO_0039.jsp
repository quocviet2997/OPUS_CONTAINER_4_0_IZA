<%
/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : fns_joo_0039.jsp
 *@FileTitle: Monthly Clearance Status by Carrier & Lane
 *@author   : CLT
 *@version  : 1.0
 *@since    : 2014/06/18
 =========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.carriersettlementprocess.event.FnsJoo0039Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0039Event  event = null;					//PDTO(Data Transfer Object including Parameters)
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


		event = (FnsJoo0039Event)request.getAttribute("Event");
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
    var yyyyMM     = "<%=yyyyMM%>";
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

 <script for="sheet1" event="OnMessage(Msg,MsgLevel,MsgCode,IsConfirm )">
            alert( Msg );
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
		<button class="btn_accent" name="btn1_Retrieve" id="btn1_Retrieve" type="button">Retrieve</button><!--
		--><button class="btn_normal" name="btn1_New" id="btn1_New" type="button">New</button><!--
		--><button class="btn_normal" name="btn1_Down_Excel" id="btn1_Down_Excel" type="button">Down Excel</button>
	</div>
	<!-- opus_design_btn (E) -->
		
	<!-- page_location(S) -->
	<div class="location">
		<span id="navigation"></span>
	</div>
</div>
<!-- page_title_area(E) -->


<div class= "wrap_search">
<!-- opus_design_inquiry(S) -->
	<div class= "opus_design_inquiry">
		<table style="width:979px">
			<tbody>
				<colgroup>
					<col width="100"/>
					<col width="150"/>
					<col width="70"/>
					<col width="90"/>
					<col width="50"/>
					<col width="90"/>
					<col width="50"/>
					<col width="*"/>
			    </colgroup>
				<tr>
					<th>Account Month</th>
					<td><input type="text" style="width:60px;" class="input1" required="" dataformat="ym" maxlength="6" value="<%=yyyyMM %>" name="acct_yrmon" id="acct_yrmon" /><!-- 
					 	--><button type="button" class="btn_left" name="btn_back" id="btn_back"></button><!-- 
						--><button type="button" class="btn_right" name="btn_next"  id="btn_next"></button>
					</td>
					<th>Carrier </th>
					<td><script type="text/javascript">ComComboObject('jo_crr_cd', 1, 60, 0, 1, 0 );</script></td>
					<th>Trade </th>
					<td><script type="text/javascript">ComComboObject('trd_cd', 1, 60, 0, 1,0 );</script></td>			
					<th>Rev./Exp.</th>
                    <td><input type="radio" value="R" name="rev_dir_cd" class="trans" checked="" id="rev_dir_cd" />&nbsp;&nbsp;<b>Revenue&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b><input type="radio" value="E" name="rev_dir_cd" class="trans" id="rev_dir_cd" />&nbsp;&nbsp;<b>Expense</b></td>
				</tr>
			</tbody>
		</table>
		<table class="height_10"><tr><td colspan="8"></td></tr></table>
	</div>
</div>

<!-- opus_design_grid(S) -->
<div class="wrap_result">	
	<!-- layout_wrap(S) -->
	<div class="layout_wrap">
	    <div class="layout_vertical_2" style="width:10%;">
	        <!-- opus_design_grid(S) -->
	        <div class="opus_design_grid" style="padding-right:5px;" >	
				<script type="text/javascript">ComSheetObject('sheet1');</script>
			</div>
	        <!-- opus_design_grid(e) -->
	    </div>
	    <div class="layout_vertical_2" style="width:90%;">
	        <!-- opus_design_grid(S) -->	        
			<div class="opus_design_grid" style="padding-left:10px;" >	
				<script type="text/javascript">ComSheetObject('sheet2');</script>
			</div>
			
			<div class="opus_design_grid" style="display:none;padding-left:10px;" >	
				<script type="text/javascript">ComSheetObject('sheet3');</script>
			</div>	
	        <!-- opus_design_grid(e) -->
	    </div>
	</div>
	<!-- layout_wrap(e) -->

</div>
<!-- opus_design_grid(E) -->

</form>
