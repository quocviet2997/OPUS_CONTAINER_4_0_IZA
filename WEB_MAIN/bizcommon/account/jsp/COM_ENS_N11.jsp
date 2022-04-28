<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : com_ens_n11.jsp
*@FileTitle  : Account Code
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/12
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.account.event.ComEnsN11Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	ComEnsN11Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.BizCommon.Account");

	String mdm_yn = request.getParameter("mdm_yn") != null ? request.getParameter("mdm_yn") : "";
	String delt_flg = request.getParameter("delt_flg") != null ? request.getParameter("delt_flg") : "";

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (ComEnsN11Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

	}catch(Exception e) {
		log.error(e.toString());
	}
%>

<head>
<title>Account Code</title>
<script type="text/javascript">

</script>

<script type="text/javascript">

	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}

</script>
</head>

<body class="popup_bg" onLoad="setupPage();">
<form name="form" onkeyup="ComKeyEnter('lengthnextfocus');">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<!-- mdm data type 에 따른 select box display 구분자-->
<input type="hidden" name="mdm_yn" value="<%=mdm_yn%>" id="mdm_yn" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
<!-- page_title(S) -->
<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
<h2 class="page_title"><button type="button">Account Code Inquiry</button></h2>
<!-- page_title(E) -->
<!-- opus_design_btn (S) -->
<div class="opus_design_btn">
	<button class="btn_accent" name="btn_Retrieve" id="btn_Retrieve" type="button">Retrieve</button><!--
	--><button class="btn_normal" name="btn2_Down_Excel" id="btn2_Down_Excel" type="button">Down Excel</button><!--
	--><button class="btn_normal" name="btn_select" id="btn_select" type="button">OK</button><!--
	--><button class="btn_normal" name="btn_close" id="btn_close" type="button">Close</button><!--
	--></div>
<!-- opus_design_btn (E) -->

</div>

<!-- page_title_area(E) -->

<!-- wrap_search(S) -->  
<div class="wrap_search">
<!-- opus_design_inquiry (S) -->
<div class="opus_design_inquiry wFit">
	<table>
		
		<colgroup>
			<col width="60" />
			<col width="80" />
			<col width="90" />
			<%
			if(!"".equals(mdm_yn) && mdm_yn.length() > 0){
			%>
			<col width="50" />
			<col width="100" />		
			<%
				}
	 		%>
			<col width="*" />
		</colgroup>
		<tr class="h23">
			<th>Account</th>
			<td><input type="text" name="acct_cd" dataformat="num" style="width:80px;ime-mode:disabled" maxlength="8" class="input" value="<%=(request.getParameter("acct_cd") == null) ? "" : request.getParameter("acct_cd") %>"></td>
			<th>Description</th>
			<td><input type="text" name="acct_eng_nm" dataformat="engupetc" style="width:150px;ime-mode:disabled" class="input"  value="<%=(request.getParameter("acct_eng_nm") == null) ? "" : request.getParameter("acct_eng_nm")%>"></td>
			<%
				if(!"".equals(mdm_yn) && mdm_yn.length() > 0){
			%>
				<th>Status</th>
				<td><select style="width:85px;" name="delt_flg"><!-- 
					 --><option value="ALL" <%if("ALL".equals(delt_flg)){ %> selected="selected" <%} %>>ALL</option><!-- 
					  --><option value="N" <%if("N".equals(delt_flg) || "".equals(delt_flg)){ %> selected="selected" <%} %>>Active</option><!-- 
					   --><option value="Y" <%if("Y".equals(delt_flg)){ %> selected="selected" <%} %>>Delete</option>
					</select></td>
				<%
					}
		 		%>
			</tr>
		</table>
</div>
<!-- opus_design_inquiry (E) -->
</div>
<!-- wrap_search(E) -->  

<div class="wrap_result">
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid">		
		<script type="text/javascript">ComSheetObject('sheet1');</script>		
	</div>
	<!-- opus_design_grid(E) -->
</div>

</form>
<%@ include file="/bizcommon/include/common_alps.jsp"%>