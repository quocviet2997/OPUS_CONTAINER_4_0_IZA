<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0049.jsp
*@FileTitle  : Vessel Report
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/11
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.report.event.BcmCcd0049Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	BcmCcd0049Event  event = null;			    //PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수
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
		event = (BcmCcd0049Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
		// 초기화면 로딩시 서버로부터 가져온 데이터 추출하는 로직추가 ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
	} catch(Exception e) {
		out.println(e.toString());
	}
%>

<head>
<title>Vessel Report</title>


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

<body  onLoad="setupPage();">
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
<!-- page_title(S) -->
<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
<!-- page_title(E) -->
<!-- opus_design_btn(S) -->
<div class="opus_design_btn">
	<button type="button" class="btn_accent" name="btn_DownExcel" id="btn_DownExcel">Download Excel</button><!--
 	--><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button>
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
<!-- opus_design_inquiry (S) -->
<div class="opus_design_inquiry wFit">
	<table>
		<colgroup>
			<col width="100">
			<col width="160">
			<col width="100">
			<col width="*">
		</colgroup>
		<tr class="h23">
			<th>Vessel Code</th>
			<td><input type="text" style="width:100px;ime-mode:disabled;text-align:center" class="input" name="vsl_cd" dataformat="engup" maxlength="4" id="vsl_cd" /> </td>
			<th>Vessel Name</th>
			<td><input type="text" style="width:100%;ime-mode:disabled;text-align:left" class="input" name="vsl_eng_nm" dataformat="eng" otherchar=" " maxlength="50" id="vsl_eng_nm" /> </td>
		</tr>	
	</table>
	
	<table>
		<colgroup>
			<col width="100">
			<col width="170">
			<col width="90">
			<col width="170">
			<col width="60">
			<col width="*">
		</colgroup>
		<tr>
			<th>Carrier</th>
			<td><input type="text" style="width:100px;ime-mode:disabled;text-align:center" class="input" name="crr_cd" dataformat="engup" maxlength="3" id="crr_cd" /> </td>
			<th>Feeder/Trunk</th>
			<td width="200" style="padding-left:2"><script type="text/javascript">ComComboObject('fdr_div_cd', 1, 150, 1, 0 ,0 ,false)</script></td>
			<th>Status</th>
			<td><select style="width:90px;" name="status"><!-- 
			 --><option value="">ALL</option><!-- 
			 --><option value="N" selected>Active</option><!-- 
			 --><option value="Y">Delete</option></select></td>
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
<script type="text/javascript">ComSheetObject('sheet');</script>
</div>
<!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->  

</form>