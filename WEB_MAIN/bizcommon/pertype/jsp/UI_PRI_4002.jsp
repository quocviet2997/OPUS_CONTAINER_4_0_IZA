<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : UI_PRI_4002.jsp
*@FileTitle  : Per Type
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
<%@ page import="com.clt.bizcommon.pertype.event.UiPri4002Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	UiPri4002Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지

	String strUsr_id		= "";
	String strUsr_nm		= "";

	String pertpChar = request.getParameter("rat_ut_grp_cd");
	String cxlInd = request.getParameter("cxl_ind");
	Logger log = Logger.getLogger("com.clt.bizcommon.BizCommon.PerType");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();

		event = (UiPri4002Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

	}catch(Exception e) {
		log.error(e.toString());
	}
%> 

<head>
<title>Welcome to nis2010!</title>


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

<!-- page_title_area(S) -->
<div class="page_title_area clear">
<!-- page_title(S) -->
<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
<h2 class="page_title"><button type="button">Rating Unit Inquiry</button></h2>
<!-- page_title(E) -->
<!-- opus_design_btn(S) -->
<div class="opus_design_btn">
<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
 --> <button type="button" class="btn_normal" name="btn_select" id="btn_select">OK</button><!--
 --> <button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!--
 --> <button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button>
</div>
<!-- opus_design_btn(E) -->

</div>

<!-- page_title_area(E) -->

<!-- wrap_search(S) -->  
<div class="wrap_search">
<!-- opus_design_inquiry (S) -->
<div class="opus_design_inquiry wFit">
	<table> 
		<colgroup>
			<col width="30">
			<col width="180">
			<col width="55">
			<col width="250">
			<col width="*">
		</colgroup>
		<tr class="h23">
			<th>Unit</th>
			<td><input type="text" style="width:30px;" class="input" name="rat_ut_cd"  value='<%= (request.getParameter("rat_ut_cd") == null)? "" :  request.getParameter("rat_ut_cd")%>' dataformat="engup" maxlength="2" style="ime-mode:disabled"></td>
			<th>Character </th>
			<td><select style="width:100px;"class="input" name="rat_ut_grp_cd"><!-- 
			 --><option value="" <%if("".equals(pertpChar)){%>selected <%} %>></option><!-- 
			 --><option value="E" <%if("E".equals(pertpChar)){%>selected <%} %>>Equipment</option><!-- 
			 --><option value="C" <%if("C".equals(pertpChar)){%>selected <%} %>>Percentage</option><!-- 
			 --><option value="M" <%if("M".equals(pertpChar)){%>selected <%} %>>Measure</option><!-- 
			 --><option value="W" <%if("W".equals(pertpChar)){%>selected <%} %>>Weight</option><!-- 
			 --><option value="P" <%if("P".equals(pertpChar)){%>selected <%} %>>Package</option><!-- 
			 --><option value="B" <%if("B".equals(pertpChar)){%>selected <%} %>>B/L</option><!-- 
			 --><option value="R" <%if("R".equals(pertpChar)){%>selected <%} %>>Rail</option>
				</select></td> 
			<td><input type="checkbox" value="Y" class="trans" name="cxl_ind" value=<%if(!"".equals(cxlInd)){%>checked<%} %>> <b>Including Deleted Unit</b> </td>
			</tr>
		</table>
</div>
<!-- opus_design_inquiry (E) -->
</div>
<!-- wrap_search(E) -->  

<!-- wrap_result(S) -->  
<div class="wrap_result">
<!-- opus_design_grid(S) -->
<div class="opus_design_grid">
	<script type="text/javascript">ComSheetObject('sheet1');</script>
</div>
<!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->  




</form>

<%@include file="../../include/common_alps.jsp"%>