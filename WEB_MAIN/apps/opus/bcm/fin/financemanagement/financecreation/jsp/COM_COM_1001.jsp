<%
/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : COM_COM_1001.jsp
*@FileTitle : Estimated Revenue VVD Entry
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%//@ page import="com.clt.apps.opus.bcm.ccd.commoncode.service.event.ComCom1001Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@page import="com.clt.syscommon.common.table.ComUsrRoleVO"%>
<%@page import="com.clt.syscommon.common.util.UserRoleUtil"%>

<%
	//LeeKyungHee-ComCom1001Event가 없어서 일단 주석으로 마이그레이션 했음
	//ComCom1001Event  event = null;				//PDTO(Data Transfer Object including Parameters)
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
		//LeeKyungHee-ComCom1001Event가 없어서 일단 주석으로 마이그레이션 했음
		//event = (ComCom1001Event)request.getAttribute("Event");
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
<html>
<head>
<title>CENTER CODE ENTRY</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

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

<body  onLoad="setupPage();">
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
		--><button type="button" class="btn_normal" name="btn_save" id="btn_save">Save</button>
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
			<colgroup>
				<col width="80" />
				<col width="150" />
				<col width="90" />
				<col />
			</colgroup>
			<tr>
				<th>Center No.</th>
				<td><input type="text" style="width:80;text-align:center;ime-mode:disabled" class="input" maxlength="6" name="ctr_erp_no" dataformat="num"></td>							
				<th>Center Code</th>
				<td><input type="text" style="width:80;text-align:center;ime-mode:disabled" class="input" maxlength="6" name="ctr_erp_cd" dataformat="engup"></td>														
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
			<button type="button" class="btn_normal" name="btn_add" id="btn_add">Row Add</button>
			<button type="button" class="btn_normal" name="btn_del" id="btn_del">Row Delete</button>
		</div>
		<!-- opus_grid_btn(E) -->
		
		<script language="javascript">ComSheetObject('sheet1');</script>
		
	</div>
	<!-- opus_design_grid(E) -->
	
	
</div>
<!-- wrap_result(E) -->


</form>
