<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_COM_1003.jsp
*@FileTitle  : Statement MGMT > Statement Accrual > Estimated Revenue VVD Entry
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event.ComCom1003Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.syscommon.common.table.ComUsrRoleVO"%>
<%@ page import="com.clt.syscommon.common.util.UserRoleUtil"%>

<%
	ComCom1003Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//Error from server
	String strErrMsg = "";						//Error message
	int rowCount	 = 0;						//Count of DB resultSet list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
    String tRole = "";
	Logger log = Logger.getLogger("com.clt.apps.opus.bcm.ccd.commoncode.service");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		event = (ComCom1003Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		
		UserRoleUtil uru = new UserRoleUtil();
		ComUsrRoleVO[] curv = uru.getUserRole(strUsr_id);
		for(int i=0; i< curv.length; i++)
		{
			if(curv[i].getUsrRoleCd().equals("OPUSADM")) {
			    tRole = "Authenticated";
			    break;
			} else {
				tRole = "Not Authenticated";
			}
		}
	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<script language="javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		}
		loadPage();
	}
</script>
</head>

<form name="form" onKeyDown="ComKeyEnter('search')">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
<input type="hidden" name="trole" value="<%=tRole%>">

<!-- page_title_area(S) -->
<div class="page_title_area clear ">
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
		
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
	    <button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!--
	    --><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!--
	    --><!--<button type="button" class="btn_normal" name="btn_save" id="btn_save">Save</button>--><!--
	    --><button type="button" class="btn_normal" name="btn_Creation" id="btn_Creation">Creation</button>
	</div>
	<!-- opus_design_btn(E) -->	
	    <!-- page_location(S) -->
	<div class="location">
    <!-- location 내용 동적생성 (별도 코딩 불필요) -->
    <span id="navigation"></span>
	</div>
	
</div>
<!-- page_title_area(E) -->




<!-- wrap_search(S) --> 
<div class="wrap_search">
	<div class="opus_design_inquiry wFit">   <!-- no TAB  -->
		<table>
			<tr>
				<th width="80">Accrual Month.</th>
				<td width="160">
					<input type="text" style="width:80px;text-align:center;ime-mode:disabled" class="input1" maxlength="7" name="exe_yrmon" id="exe_yrmon" dataformat="ym" required caption="Accrual Month" disabled><!--
					--><button type="button" class="calendar" name="exe_yrmon_cal" id="exe_yrmon_cal" class="calendar ir"></button>
				</td>							
				<th width="80">Revenue Month.</th>
				<td width="160">
					<input type="text" style="width:80px;text-align:center;ime-mode:disabled" class="input" maxlength="7" name="rev_yrmon" id="rev_yrmon" dataformat="ym"><!--
					--><button type="button" class="calendar" name="rev_yrmon_cal" id="rev_yrmon_cal" class="calendar ir"></button>
				</td>							
				<th width="80">Vessel Code</th>
				<td width="90">
					<input type="text" style="width:80px;text-align:center;ime-mode:disabled" class="input" maxlength="4" minlength="4" name="vsl_cd" id="vsl_cd" dataformat="engup"><!--
					--><button type="button" class="input_seach_btn" name="pop_vsl_code" id="pop_vsl_code"></button>
				</td>							
				<th width="50">VVD</th>
				<td>
					<input type="text" style="width:90px;text-align:center;" dataformat="engup" class="input" name="vvd" id="vvd" maxlength="10">
					<!-- <input type="text" style="width:60px;text-align:center;ime-mode:disabled" class="input" maxlength="4" name="skd_voy_no" dataformat="num" onChange="SkdVoyNo_Change(this)">
					<input type="text" style="width:20px;text-align:center;ime-mode:disabled" class="input" maxlength="1" name="skd_dir_cd" dataformat="engup"> -->
				</td>							
			</tr>
		</table>
	</div>
</div>
<!-- wrap_search(E) -->



<!-- wrap_result(S) -->
<div class="wrap_result" >

	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid">
	
		<!-- opus_grid_btn(S) -->
		<div class="opus_design_btn">
			<!--
			<button type="button" class="btn_normal" name="btn_add" id="btn_add">Row Add</button>
			<button type="button" class="btn_normal" name="btn_del" id="btn_del">Row Delete</button>
			-->
		</div>
		<!-- opus_grid_btn(E) -->
		
		<script type="text/javascript">ComSheetObject('sheet1');</script>
		
	</div>
	<!-- opus_design_grid(E) -->
	
	
</div>
<!-- wrap_result(E) -->

</form>
