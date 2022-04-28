<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0030.jsp
*@FileTitle  : Trade
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
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.service.event.BcmCcd0030Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	BcmCcd0030Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//Error from server
	String strErrMsg = "";						//Error message
	int rowCount	 = 0;						//Count of DB resultSet list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.commoncode.sevice");
	String mainPage 		= "";
    mainPage = request.getParameter("main_page");

	// 승인처리용 정보
	String rqstNo		= JSPUtil.getParameter(request, "rqst_no");
	String procTpCd		= JSPUtil.getParameter(request, "proc_tp_cd");
	String rqstUsrChk	= JSPUtil.getParameter(request, "rqst_usr_chk");
	String rqstOfcCd	= JSPUtil.getParameter(request, "rqst_ofc_cd");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (BcmCcd0030Event)request.getAttribute("Event");
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
<title>trade</title>


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

<input type="hidden" name="creflag" value="Y" id="creflag" />

<input type="hidden" name="mst_dat_subj_cd" value="TRDE" id="mst_dat_subj_cd" />
<input type="hidden" name="rqst_no" value="<%=rqstNo%>" id="rqst_no" />
<input type="hidden" name="proc_tp_cd" value="<%=procTpCd%>" id="proc_tp_cd" />
<input type="hidden" name="rqst_usr_chk" value="<%=rqstUsrChk%>" id="rqst_usr_chk" />
<input type="hidden" name="rqst_ofc_cd" value="<%=rqstOfcCd%>" id="rqst_ofc_cd" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<h2 class="page_title">
	<%if (("true").equals(mainPage)){%>
		<button type="button">
		<span id="title"></span></button></h2>
	<%}else{%>
		<span id="title1">Trade</span></h2>
	<%} %>
	<!-- page_title(E) -->

	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
		<button type="button" class="btn_accent" name="btn_Retrieve" 		id="btn_Retrieve" style="display:none">Retrieve</button>
		<button type="button" class="btn_normal" name="btn_Save" 			id="btn_Save" style="display:none">Save</button>
		<button type="button" class="btn_normal" name="btn_New" 			id="btn_New" style="display:none">New</button>
		<button type="button" class="btn_normal" name="btn_Request" 			id="btn_Request" style="display:none">Request</button>
		<button type="button" class="btn_normal" name="btn_Close" 			id="btn_Close" style="display:none">Close</button>
	</div>
	<!-- opus_design_btn(E) -->

	<!-- page_location(S) -->
	<div class="location">
	<%if (("true").equals(mainPage)){%>
		<span id="navigation"></span>
	<%}else{%>
	<%} %>
	<!-- page_location(E) -->
	</div>
</div>
<!-- page_title_area(E) -->

<!-- opus_design_inquiry(S) -->
<div class="wrap_search">
	<div class="opus_design_inquiry wFit">
	<table>
		<colgroup>
			<col width="100" />
			<col width="180" />
			<col width="100" />
			<col width="*" />
		</colgroup>
		<tbody>
			<tr>
				<th>Trade Code</th>
				<td><input type="text" style="width:100px;ime-mode:disabled;text-align:center" class="input1" name="trd_cd" dataformat="engup" maxlength="3" id="trd_cd" /><button type="button" id="btns_trade" name="btns_trade" class="input_seach_btn"></button></td>
                    <!--<th>Sakura CTR Code</th>  -->
                    <th>SAP CTR Code</th>
				<td><input type="text" style="width:380px;ime-mode:disabled;text-align:left" class="input1" name="modi_cost_ctr_cd" dataformat="eng" maxlength="50" id="modi_cost_ctr_cd" otherchar=" "/></td>
			</tr>
			<tr>
				<th>Name</th>
				<td colspan="3"><input type="text" style="width:380px;ime-mode:disabled;text-align:left" class="input1" name="trd_nm" dataformat="engup" otherchar="()_\-,. " maxlength="50" id="trd_nm"/></td>
			</tr>
		</tbody>
	</table>
	<table>
		<colgroup>
			<col width="100" />
			<col width="180" />
			<col width="100" />
			<col width="180" />
			<col width="100" />
			<col width="*" />
		</colgroup>
		<tbody>
			<tr>
				<th>Continent From</th>
					<td><script type="text/javascript">ComComboObject('fm_conti_cd', 1, 100, 1, 0 ,0 ,false)</script></td>
					<th>Continent To</th>
					<td><script type="text/javascript">ComComboObject('to_conti_cd', 1, 100, 1, 0 ,0 ,false)</script></td>
				    <th>Vessel Type</th>
					<td><script type="text/javascript">ComComboObject('vsl_tp_cd', 1, 100, 1, 1 ,0 ,false)</script></td>
					</tr>
					<tr class="h23">
					<th>Admin Office</th>
					<td><input type="text" style="width:100px;ime-mode:disabled;text-align:center" class="input1" name="ofc_cd" dataformat="engup" maxlength="6" id="ofc_cd" /><button type="button" id="btn_ofc_cd" name="btn_ofc_cd" class="input_seach_btn"></button></td>
					<th>Effect Date</th>
					<td><input type="text" style="width:100px;ime-mode:disabled;text-align:center" class="input1" name="st_eff_dt" dataformat="ymd" maxlength="10" id="st_eff_dt" /><button type="button" id="btn_Calendar1" name="btn_Calendar1" class="calendar ir"></button></td>
					<th>Expire Date</th>
					<td><input type="text" style="width:100px;ime-mode:disabled;text-align:center" class="input" name="end_eff_dt" dataformat="ymd" maxlength="10" id="end_eff_dt" /><button type="button" id="btn_Calendar2" name="btn_Calendar2" class="calendar ir"></button></td>
			</tr>
		</tbody>
	</table>
	<table class="line_bluedot"><tr><td></td></tr></table>
	<table>
		<tbody>
			<colgroup>
	                <col width="100"/>
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
				<td width=""><script type="text/javascript">ComComboObject('delt_flg', 1, 100, 1, 0 ,0 ,false)</script></td>
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
</div>
<!-- opus_design_inquiry(E) -->

<div class="wrap_result">
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid">
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
	<!-- opus_design_grid(E) -->
</div>
</form>