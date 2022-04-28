<%--
/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : COM_ENS_0T2.jsp
*@FileTitle : Approval Route PopUp
*Open Issues :
*Change history :
*@LastModifyDate : 2008-08-29
*@LastModifier : Jeong-Hoon, KIM
*@LastVersion : 1.0
* 2008-08-29 Jeong-Hoon, KIM
* 1.0 최초 생성
=========================================================*/ 
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.approute.event.ApprouteEvent"%>
<%@ page import="com.clt.framework.component.util.StringUtil" %>
<%
	ApprouteEvent  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";								 //에러메세지
	
	String usr_ofc_cd = "";
	
	try {
	   
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		usr_ofc_cd = account.getOfc_cd();
		
		event = (ApprouteEvent)request.getAttribute("Event");
		
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<html>
<head>
<title>Welcome to enis!</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script language="javascript" type="text/javascript" src="bizcommon/csr/CoCsr.js"></script>

<script language="javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" onload="javascript:setupPage();">
<form method="post" name="form" onSubmit="return false;">
<input	type="hidden" name="f_cmd"> 
<input type="hidden" name="ofc_cd_deptsrch">
<input type="hidden" name="mode">
<input type="hidden" name="csr_no">
<input type="hidden" name="apro_step">
<input type="hidden" name="target_obj_nm">

<input type="hidden" name="ofc_cd">
<input type="hidden" name="sub_sys_cd">

<input type="hidden" name="usr_ofc_cd" value="<%= usr_ofc_cd %>">

<!-- OUTER - POPUP (S)tart -->
<table width="806" class="popup" cellpadding="10">
<tr><td class="top"></td></tr>
<tr><td valign="top">

		<!-- : ( Title ) (S) -->
		<table width="806" border="0">
		<tr><td height="79" class="title"><img src="img/ico_t1.gif" width="20" height="12">Approval Route Manager </td></tr>

    	<!-- TABLE '#D' : ( Button : Main ) (E) -->
	
		<!-- TABLE '#D' : ( Tab BG Box ) (S) -->
		<table class="search">
			<tr>
				<td class="bg_a">


				<!-- : ( Scenario ID ) (S) -->
				<table class="search" border="0" style="width:801;">
				<tr class="h23">
					<td width="180" valign="top">

						<table class="search" border="0">
							<tr><td class="title_h"></td>
								<td class="title_s">Organization Chart</td></tr>
							<tr><td class="height_5"></td></tr>
						</table>
			<!-- : ( Grid : Week ) (S) -->

					<table width="100%" id="mainTable">
	                                      <tr><td>
	                                             <script language="javascript">ComSheetObject('sheetDept');</script>
	                                      </td></tr>
	                        	</table>
			<!-- : ( Grid : Week ) (E) -->


					</td>

					<td width="1"></td>

					<td width="325" valign="top">
						<table class="search" border="0">
							<tr><td height="20"></td></tr>
						</table>
			<!-- : ( Grid : Week ) (S) -->

					<table width="100%" id="mainTable">
	                                      <tr><td>
	                                             <script language="javascript">ComSheetObject('sheetUser1');</script>
	                                      </td></tr>
	                        	</table>
			<!-- : ( Grid : Week ) (E) -->

					</td>
					<td width="35" align="center"><img src="img/button/btns_add.gif" width="26" height="26" alt="" border="0" name="btns_add">
					<br><br><img src="img/button/btns_delete.gif" width="44" height="26" alt="" border="0" name="btns_del"></td>

					<td width="365" valign="top">

						<table class="search" border="0">
							<tr><td class="title_h"></td>
								<td class="title_s">Approval Step</td></tr>
							<tr><td class="height_5"></td></tr>
						</table>
			<!-- : ( Grid : Week ) (S) -->

					<table width="100%" id="mainTable">
	                                      <tr><td>
	                                             <script language="javascript">ComSheetObject('sheetUser2');</script>
	                                      </td></tr>
	                        	</table>
			<!-- : ( Grid : Week ) (E) -->


					</td>
				</tr>

				</table>
				<!-- : ( Scenario ID ) (E) -->

			</tr>
		</table>
		<!-- TABLE '#D' : ( Tab BG Box ) (E) -->



</td></tr>
</table>
<!-- OUTER - POPUP (E)nd -->



<table class="height_10"><tr><td></td></tr></table>


<!-- : ( Button : Sub ) (S) -->
<!-- : ( Button : pop ) (S) -->
<table width="100%" class="sbutton">
<tr><td height="71" class="popup">
	
		<table width="100%" class="button" border="0" cellpadding="0" cellspacing="0" style="padding-top:5;,padding-bottom:10;"> 
       	<tr><td class="btn3_bg">
		    <table border="0" cellpadding="0" cellspacing="0">
		    <tr>
				<td><table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
					<tr><td class="btn1_left"></td>
					<td class="btn1" name="btng_save">OK</td>
					<td class="btn1_right"></td>
					</tr>
				</table></td>		    
				<td><table width="72" border="0" cellpadding="0" cellspacing="0" class="button">
					<tr><td class="btn1_left"></td>
					<td class="btn1" name="btn_close">Close</td>
					<td class="btn1_right"> 
				</tr></table></td>
			</tr>
		</table></td>
			</tr>
		</table>
    <!--Button (E) -->
	
	</td></tr>
</table>	
 
<!-- : ( Button : Sub ) (E) -->

</form>
</body>
</html>

<SCRIPT LANGUAGE="javascript">
<!--
<%
	String ofc_cd   	= "";
	String sub_sys_cd   = "";
	String mode   		= "";
	String csr_no  		= "";
	
	if(event != null){ 
	   ofc_cd   = event.getOfc_cd();
	   sub_sys_cd   = event.getSub_sys_cd();
	   mode   = event.getMode();
	   csr_no = event.getCsrNo();
	}
%>
	  /* 
		ibSheet 를 제외한 폼 입력값(?) 유저가 입력한 정보를 event를 통해서 다시 넘겨받아 화면에 뿌려주는 부분입니다. 
	  */
	  with(document.form)
	  {
		eval("ofc_cd" ).value = "<%=ofc_cd%>";
		eval("sub_sys_cd" ).value = "<%=sub_sys_cd%>";

		eval("mode" ).value = "<%=mode%>";
		eval("csr_no" ).value = "<%=csr_no%>";
		eval("apro_step" ).value = "<%=StringUtil.xssFilter(request.getParameter("apro_step"))%>";	
	   }
-->
</SCRIPT>
<%@include file="../../include/common_alps.jsp"%>