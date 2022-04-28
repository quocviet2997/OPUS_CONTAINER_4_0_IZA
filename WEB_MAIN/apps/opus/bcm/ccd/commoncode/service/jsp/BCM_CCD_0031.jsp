<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0031.jsp
*@FileTitle  : Sub trade
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/05
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.service.event.BcmCcd0031Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	BcmCcd0031Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//Error from server
	String strErrMsg = "";						//Error message
	int rowCount	 = 0;						//Count of DB resultSet list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.commoncode.sevice");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (BcmCcd0031Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<head>
<title>sub trade</title>


<script type="text/javascript">
	var G_MDAA_CHK;
	var G_AHTU_TP_CD;

	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>
</head>

<body  onLoad="setupPage();">
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />

<input type="hidden" name="ibflag" value="I" id="ibflag" />
<input type="hidden" name="user_id" value="<%= strUsr_id %>" id="user_id" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" name="btn_Retrieve" id="btn_Retrieve" type="button">Retrieve</button><!--
		--><button class="btn_normal" name="btn_Save" id="btn_Save" type="button">Save</button><!--
		--><button class="btn_normal" name="btn_New" id="btn_New" type="button">New</button><!--
		-->
	</div>
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
<div class="opus_design_inquiry">
	<table>
		<tbody>
			<colgroup>
				<col width="120" />
				<col width="140" />
				<col width="70" />
				<col width="*" />
			</colgroup>
			<tr>
				<th>Sub Trade Code</th>
				<td>
					<input type="text" style="width:70px;ime-mode:disabled;text-align:center" class="input1" name="sub_trd_cd" dataformat="engup" maxlength="2" id="sub_trd_cd" />
					<button type="button" id="btns_subtrade" name="btns_subtrade" class="input_seach_btn"></button></td>
				<th>Name</th>
				<td><input type="text" style="width:50%;ime-mode:disabled;text-align:left" class="input1" name="sub_trd_nm" dataformat="engup" otherchar="()_\-,. " maxlength="50" id="sub_trd_nm"/></td>
			</tr>
			<tr>
				<th>Trade Code</th>
				<td><script type="text/javascript">ComComboObject('trd_cd', 1, 70, 1, 0 ,0 ,false)</script></td>
			</tr>
			<tr><td colspan="4"><table class="line_bluedot"><tr><td></td></tr></table></td></tr>
						
		</tbody>
	</table>
	<table>
		<tbody>
			<colgroup>
	                <col width="120"/>
	                <col width="120">
	            	<col width="100">
	            	<col width="120">
	            	<col width="100">
	            	<col width="150">
	            	<col width="100">
	            	<col width="120">
	            	<col width="100">
	                <col width="*"/>
	        </colgroup>
			<tr>
				<th>Delete Flag</th>
				<td><script type="text/javascript">ComComboObject('delt_flg', 1, 70, 1, 0 ,0 ,false)</script></td>
				<th>Create User</th>
			            <td><input type="text" style="width:80px;text-align:center;" class="input" name="cre_usr_id" id="cre_usr_id" readOnly/>
			            </td>
			            <th>Create Date/Time</th>
			            <td><input type="text" style="width:120px;text-align:center;" class="input" name="cre_dt" id="cre_dt" readOnly/>
			            </td>
			            <th>Last Update User</th>
			            <td><input type="text" style="width:80px;text-align:center;" class="input" name="upd_usr_id" id="upd_usr_id" readOnly/>
			            </td>
			            <th>Last Update Date/Time</th>
			            <td><input type="text" style="width:120px;text-align:center;" class="input" name="upd_dt" id="upd_dt" readOnly/>
			            </td>
			</tr>
		</tbody>
	</table>
</div>
<!-- opus_design_inquiry(E) -->
</div>

<!-- opus_design_grid(S) -->
<div class="opus_design_grid clear">
	<script type="text/javascript">ComSheetObject('sheet1');</script>
</div>
<!-- opus_design_grid(E) -->

</form>