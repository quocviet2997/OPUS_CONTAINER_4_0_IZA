<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0033.jsp
*@FileTitle  : Sales rep
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/06
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.salesrepresentative.event.BcmCcd0033Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	BcmCcd0033Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//Error from server
	String strErrMsg = "";						//Error message
	int rowCount	 = 0;						//Count of DB resultSet list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.commoncode.salesrepresentative");
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


		event = (BcmCcd0033Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>

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

<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />

<input type="hidden" name="ibflag" value="I" id="ibflag" />
<input type="hidden" name="user_id" value="<%= strUsr_id %>" id="user_id" />
<input type="hidden" name="mdm_yn" value="Y" id="mdm_yn" />

<input type="hidden" name="creflag" value="Y" id="creflag" />

<input type="hidden" name="mst_dat_subj_cd" value="SREP" id="mst_dat_subj_cd" />
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
		<span id="title1">Sales Rep</span></h2>
	<%} %>	
	<!-- page_title(E) -->
	
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" name="btn_Retrieve" id="btn_Retrieve" type="button" style="display: none">Retrieve</button><!--
		--><button class="btn_normal" name="btn_Save" id="btn_Save" type="button" style="display: none">Save</button><!--
		--><button class="btn_normal" name="btn_Request" id="btn_Request" type="button" style="display:none">Request</button><!--
		--><button class="btn_normal" name="btn_code_create" id="btn_code_create" type="button" style="display: none">Create</button><!--
		--><button class="btn_normal" name="btn_New" id="btn_New" type="button" style="display: none">New</button><!--
		--><button class="btn_normal" name="btn_Close" id="btn_Close" type="button" style="display:none">Close</button><!--
		--></div>
	<!-- opus_design_btn (E) -->

	<!-- page_location(S) -->
	 <%if (("true").equals(mainPage)){%>
	<div class="location">	
		<span id="navigation"></span>
	</div>
	<%}%>
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
				<col width="180" />
				<col width="120" />
				<col width="300" />
				<col width="120" />
				<col width="*" />
			</colgroup>
			<tr>
				<th>Sales Rep. Code</th>
				<td><input type="text" style="width:80px;ime-mode:disabled;text-align:center" class="input1" name="srep_cd" dataformat="engup" maxlength="5" id="srep_cd" onblur="javascript:obj_change();" /><button type="button" id="btn_srep_search" name="btn_srep_search" class="input_seach_btn"></button></td>
				<th>SR Country</th>
				<td><input type="text" style="width:80px;ime-mode:disabled;text-align:center" class="input1" name="cnt_cd" dataformat="engup" maxlength="2" id="cnt_cd" onblur="javascript:obj_change();"/><button type="button" id="btn_cnt_search" name="btn_cnt_search" class="input_seach_btn"></button></td>
                <th><!-- Modified --></th>
                <td><input type="hidden" style="width:150px;text-align:center;" class="input" dataformat="engup" id="modi_srep_cd" name="modi_srep_cd" maxlength="30"></td>
			</tr>
		</tbody>
	</table>
	<table class="line_bluedot"><tr><td></td></tr></table>
	<table>
		<tbody>
			<colgroup>
				<col width="120" />
				<col width="180" />
				<col width="120" />
				<col width="300" />
				<col width="120" />
				<col width="*" />
			</colgroup>
			<tr>
				<th>Office Code</th>
				<td><input type="text" style="width:80px;ime-mode:disabled;text-align:center" class="input1" name="ofc_cd" dataformat="engup" maxlength="6" id="ofc_cd" onblur="javascript:obj_change();"/><button type="button" id="btn_ofc_search" name="btn_ofc_search" class="input_seach_btn"></button></td>
				<th>Name</th>
				<td><input type="text" style="width:270px;ime-mode:disabled;text-align:left" class="input1" name="srep_nm" dataformat="engupetc" maxlength="50" id="srep_nm"/></td>
				<th>Team Code</th>
				<td><input type="text" style="width:150px;ime-mode:disabled;text-align:center" class="input" name="ofc_team_cd" dataformat="engup" maxlength="3" id="ofc_team_cd" /></td>
			</tr>
		</tbody>
	</table>
	<table>
		<tbody>
			<colgroup>
				<col width="120" />
				<col width="180" />
				<col width="120" />
				<col width="130" />
				<col width="80" />
				<col width="90" />
				<col width="120" />
				<col width="*" />
			</colgroup>
			<tr>
				<th>Gender</th>
				<td><script type="text/javascript">ComComboObject('sex_cd', 1, 100, 1, 0 ,0 ,false)</script></td>
				<th>Abbreviation</th>
				<td><input type="text" style="width:120px;ime-mode:disabled;text-align:left" class="input" name="srep_abbr_nm" dataformat="eng" maxlength="50" id="srep_abbr_nm" /></td>
				<th>I/B Flag</th>
				<td><script type="text/javascript">ComComboObject('ib_srep_flg', 1, 60, 1, 0 ,0 ,false)</script></td>
				<th>O/B Flag</th>
				<td><script type="text/javascript">ComComboObject('ob_srep_flg', 1, 90, 1, 0 ,0 ,false)</script></td>
			</tr>
		</tbody>
	</table>
	<table>
		<tbody>
			<colgroup>
				<col width="120" />
				<col width="180" />
				<col width="120" />
				<col width="300" />
				<col width="120" />
				<col width="*" />
			</colgroup>
			<tr>
				<th>Employee No</th>
				<td><input type="text" style="width:100px;ime-mode:disabled;text-align:center" class="input1" name="empe_cd"  id="empe_cd" /></td>
				<th>Email</th>
				<td><input type="text" style="width:270px;ime-mode:disabled;text-align:left" class="input1" name="srep_eml"   maxlength="50" id="srep_eml" /></td>
				<th>Mobile Number</th>
				<td><input type="text" style="width:150px;ime-mode:disabled;text-align:left" class="input1" name="mphn_no" dataformat="num" otherchar="-" maxlength="20" id="mphn_no" /></td>
			</tr>
		</tbody>
	</table>
	<table class="line_bluedot"><tr><td></td></tr></table>
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
				<td><script type="text/javascript">ComComboObject('delt_flg', 1, 100, 1, 0 ,0 ,false)</script></td>
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