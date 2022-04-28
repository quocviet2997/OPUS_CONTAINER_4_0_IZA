<%--
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : UI_COM_SYS_010.jsp
*@FileTitle  : 프로그램 매핑
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/24
=========================================================*/
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.management.opus.user.event.UserManagementEvent"%>
<%@ page import="com.clt.syscommon.management.opus.user.vo.ComUserVO"%>

<%
	UserManagementEvent  event = null;				//PDTO(Data Transfer Object including Parameters)

	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";								 //에러메세지
 	String strErrCode = "";
	String login_usr_auth_tp_cd = "";

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
	   	login_usr_auth_tp_cd = account.getUsr_auth_tp_cd();

	   	serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		if (serverException != null) {
		    ErrorHandler errHndlr = new ErrorHandler(serverException);
				strErrMsg = errHndlr.loadPopupMessage();
				strErrCode = errHndlr.getCode();
		}else{
			event = (UserManagementEvent)request.getAttribute("Event");
		}
	}catch(Exception e) {
	    out.println(e.getMessage());
	}
%>

<head>
<title>User Program Mapping</title>


<script type="text/javascript">
  function setupPage(){
    var errMessage = "<%=strErrMsg%>";
    var errCode = "<%=strErrCode%>";
    if (errMessage.length >= 1) {
      ComShowErrMessage(errMessage);
    } // end if
    if(errCode=="COM10004"){
    	opener.top.signature('On');
    	self.close();
    }else{
      //setSubSystemCode('ENIS');
      loadPage();
    }
  }

</script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" onload="javascript:setupPage();">
<form method="post" name="form" onSubmit="return false;">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="iPage" id="iPage" />
<input type="hidden" name="pgm_no_form" id="pgm_no_form" />
<input type="hidden" name="ofc_cd" id="ofc_cd" />
<input type="hidden" name="usr_auth_tp_cd" id="usr_auth_tp_cd" />
<input type="hidden" name="login_usr_auth_tp_cd" value="<%=login_usr_auth_tp_cd%>" id="login_usr_auth_tp_cd" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title"><span>User Program Mapping</span></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
		<% if ( !login_usr_auth_tp_cd.equals("R") ) { %>
		<button type="button" class="btn_accent" name="btn_save" 	id="btn_save">Save</button><% } %><!--  
		--><button type="button" class="btn_normal" name="btn_close" 	id="btn_close">Close</button><!--  
		--><button type="button" class="btn_normal" name="btn_DownExcel" 	id="btn_DownExcel">Down Excel</button><!--  
	--></div>
	<!-- opus_design_btn(E) -->

	<!-- page_location(S) -->
	<div class="location">
		<!-- location 내용 동적생성 (별도 코딩 불필요) -->
		<span id="navigation"></span>
	</div>
</div>
<!-- page_title_area(E) -->

<div class= "wrap_search">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry wFit">
		<table>
			<colgroup>
				<col width="80" />
				<col width="150" />
				<col width="75" />
				<col width="*" />
			</colgroup>
			<tbody>
				<tr>
		           <th>User ID</th>
		           <td><input type="text" style="width:70px;" class="input" required="" fullfill="" name="usr_id" maxlength="20" readonly id="usr_id" /></td>
		           <th>User Name</th>
		           <td><input type="text" style="width:150px;" class="input" value="" name="usr_nm" maxlength="100" readonly id="usr_nm" /></td>
		       	 </tr>
			</tbody>
		</table>
	</div>
</div>			
<!-- layout_wrap(S) -->
<div class="layout_wrap">
    <div class="layout_vertical_2" style="width:50%">
    	<div class="wrap_result">
		<div class="opus_design_grid clear" id="mainTable">
			<h3 class="title_design mar_top_12">Menu List</h3>
			<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>
	</div>
    </div>
    <div class="layout_vertical_2" style="width:50%">
	    <div class="wrap_result">
			<div class="opus_design_grid clear" id="mainTable">
				<h3 class="title_design mar_top_12">Program List</h3>
				<script type="text/javascript">ComSheetObject('sheet2');</script>
			</div>
		</div>
    </div>
</div>
<!-- layout_wrap(E) -->
</form>

<SCRIPT type="text/javascript">
<!--
	  with(document.form) {
<%
	String usrId = "";
	String usrNm = "";
	String ofcCd = "";
	String usrAuthTpCd = "";

	if(event != null){
		ComUserVO comuservo = new ComUserVO();
		comuservo = event.getComUserVO();

        if(comuservo!=null){
			usrId = comuservo.getUsrId();
			usrNm = comuservo.getUsrNm();
			ofcCd = comuservo.getOfcCd();
			usrAuthTpCd = comuservo.getUsrAuthTpCd();
		}
	}
%>
  		eval("usr_id" ).value = "<%= usrId	 %>";
        eval("usr_nm" ).value = unescape("<%= usrNm  %>");
        eval("ofc_cd" ).value = "<%= ofcCd  %>";
        eval("usr_auth_tp_cd" ).value = "<%= usrAuthTpCd  %>";
	  }
-->
</SCRIPT>