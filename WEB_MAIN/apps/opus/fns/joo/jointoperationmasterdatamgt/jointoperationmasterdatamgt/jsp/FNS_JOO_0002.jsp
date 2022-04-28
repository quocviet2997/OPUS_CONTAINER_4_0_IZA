<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : fns_joo_0002.jsp
*@FileTitle  : Entry and Inquiry of Financial Affairs
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/30
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationmasterdatamgt.jointoperationmasterdatamgt.event.FnsJoo0002Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0002Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationMasterDataMgt.JointOperationMasterDataMgt");
	
	String trdCombo  = "";
	String laneCombo = "";
	String currCombo = "";
	String joStlOptCd = "";
	String joStlOptNm = "";
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
	   
		event = (FnsJoo0002Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
		
		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		trdCombo  = eventResponse.getETCData("trd_cd");
		currCombo = eventResponse.getETCData("CD02081");
		joStlOptCd = eventResponse.getETCData("joStlOptCd");
		joStlOptNm = eventResponse.getETCData("joStlOptNm");
	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<script type="text/javascript">
var joStlOptCd = "<%=joStlOptCd%>";
var joStlOptNm = "<%=joStlOptNm%>";

	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			showErrMessage(errMessage);
		} // end if
		loadPage("<%=trdCombo%>","<%=currCombo%>");
	}
</script>

<form name="form" id="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="code" id="code" />
<input type="hidden" name="name" id="name" />
<input type="hidden" name="super_cd1" id="super_cd1" />
<input type="hidden" name="super_cd2" id="super_cd2" />
<input type="hidden" name="delt_flg" value="N" id="delt_flg" />


<!-- page_title_area(S) -->
<div class="page_title_area clear">

	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" name="btn_retrieve" id="btn_retrieve" type="button"  auth="R">Retrieve</button><!--
		--><button class="btn_normal" name="btn_new" id="btn_new" type="button"  auth="R">New</button><!--
		--><button class="btn_normal" name="btn_create" id="btn_create" type="button"  auth="C">Create</button><!--
		--><button class="btn_normal" name="btn_save" id="btn_save" type="button"  auth="C">Save</button><!--
		--></div>
	<!-- opus_design_btn (E) -->

	<!-- page_location(S) -->
	<div class="location">	
		<span id="navigation"></span>
	</div>
	<!-- page_location(E) -->
</div>
<!-- page_title_area(E) -->

<div class="wrap_search">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry wFit">
		<table>
			<colgroup>
				<col width="70" />				
				<col width="100" />						
				<col width="60" />	
				<col width="80" />				
				<col width="55" />					
				<col width="80" />
				<col width="130" />				
				<col width="300" />						
				<col width="*" />				
		   </colgroup> 
		   <tbody>
		   		<tr>
					<th>Carrier</th>
					<td><input type="text" style="width:60px;" class="input1" name="jo_crr_cd" dataformat="enguponly" maxlength="3" id="jo_crr_cd"/><!-- 
					 --><button type="button" id="btn_pop_car" name="btn_pop_car" class="input_seach_btn" auth="R"></button><!-- 
					 --><input type="hidden" style="width:0px;" class="input1" name="jo_crr_cd_hid"  maxlength="3" id="jo_crr_cd_hid" /></td>
					<th>Trade</th>
					<td><script type="text/javascript">ComComboObject('trd_cd',1,60,0,1);</script></td>
					<th>Lane</th>
					<td><script type="text/javascript">ComComboObject('rlane_cd',2,70,0,1);</script></td>
					<th>Settlement Option</th>
					<td><script type="text/javascript">ComComboObject('jo_stl_opt_cd',1,70,0,1);</script></td>
					<td><b>Delete</b>&nbsp;<input type="checkbox" value="N" name="delt_flg_tmp" id="delt_flg_tmp" class="trans" /> </td>
				</tr> 
		   </tbody>
		</table>
		<table>
			<colgroup>
				<col width="70" />				
				<col width="380" />				
				<col width="125" />						
				<col width="*" />				
		   </colgroup> 
		   <tbody>
		   		<tr>
					<th>Customer</th>
					<td><input type="text" style="width:60px;" class="input1" maxlength="8" dataformat="engup" name="cust_seq" id="cust_seq"/><!-- 
					 --><button type="button" id="btn_pop_customer" name="btn_pop_customer" class="input_seach_btn" auth="C"></button><!-- 
					 --><input type="text" style="width:274px;" class="input" name="cust_lgl_eng_nm" readonly id="cust_lgl_eng_nm" /> </td>
					<th>Service Provider</th>
					<td><input type="text" style="width:70px;" class="input1" maxlength="6" dataformat="num" name="vndr_seq" id="vndr_seq"/><!-- 
					 --><button type="button" id="btn_pop_vendor" name="btn_pop_vendor" class="input_seach_btn" auth="C"></button><!-- 
					 --><input type="text" style="width:250px;" class="input" name="vndr_lgl_eng_nm" readonly id="vndr_lgl_eng_nm" /> </td>
				</tr> 
		   </tbody>
		</table>
	</div>
	<!-- opus_design_inquiry(E) -->
</div>

<div class="wrap_result">
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid">
		<h3 class="title_design">Revenue</h3>
		<!-- opus_design_btn (S) -->
		<div class="opus_design_btn">
			<button class="btn_accent" name="btn_delete1" id="btn_delete1" type="button"auth="C">Row Delete</button>
		</div>
		<!-- opus_design_btn (E) -->
		<script type="text/javascript">ComSheetObject('sheet1');</script>		
	</div>
	<!-- opus_design_grid(E) -->
	<table class="line_bluedot"><tr><td></td></tr></table>
	
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid">
		<h3 class="title_design">Expense</h3>
		<!-- opus_design_btn (S) -->
		<div class="opus_design_btn">
			<button class="btn_accent" name="btn_delete2" id="btn_delete2" type="button"auth="C">Row Delete</button>
		</div>
		<!-- opus_design_btn (E) -->
		<script type="text/javascript">ComSheetObject('sheet2');</script>
		
		<script type="text/javascript">ComSheetObject('sheet3');</script>
		
		<script type="text/javascript">ComSheetObject('sheet4');</script>
		
				
	</div>
	<!-- opus_design_grid(E) -->
</div>
</form>
