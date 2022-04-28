<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0047.jsp
*@FileTitle  : revenue lane
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/10
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.report.event.BcmCcd0044Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	BcmCcd0044Event  event = null;					//PDTO(Data Transfer Object including Parameters)
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


		event = (BcmCcd0044Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// 초기화면 로딩시 서버로부터 가져온 데이터 추출하는 로직추가 ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>
<script type="text/javascript">
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

<!-- page_title_area(S) -->
<div class="page_title_area clear">
<!-- page_title(S) -->
<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
<!-- page_title(E) -->
<!-- opus_design_btn(S) -->
<div class="opus_design_btn">
<button type="button" class="btn_accent" name="btn_downexcel" id="btn_downexcel">Download Excel</button><!--
 --> <button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button>
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
			<col width="100">
			<col width="100">
			<col width="*">
		</colgroup> 
		<tr class="h23">			
			<th>Vendor Code</th>
			<td><input type="text" style="width:60px;text-align:center;ime-mode:disabled;" class="input1_2" name="vndr_seq" value="" maxlength="6" dataformat="num"><!-- img class="cursor" src="img/btns_search.gif" width="18" height="20" alt="" border="0" align="absmiddle" name="btn_com_ens_0C1"--></td>
			<th>Legal English Name</th>
			<td><input type="text" style="width:480px;" class="input1_2" value="" name="vndr_lgl_eng_nm" maxlength="100" dataformat="eng" otherchar=" "></td>
		</tr>
	</table>
	<table>
		<colgroup>
			<col width="100">
			<col width="116">
			<col width="100">
			<col width="100">
			<col width="100">
			<col width="100">
			<col width="100">
			<col width="*">
		</colgroup>
	<tr class="h23">
		<th>Country</th>
		<td><input type="text" style="width:60px;text-align:center;" class="input1" name="vndr_cnt_cd" value="" maxlength="2" dataformat="engup"><!-- img class="cursor" src="img/btns_search.gif" width="18" height="20" alt="" border="0" align="absmiddle" name="btn_com_ens_0M1"--></td>
		<th>Location Code</th>
		<td><input type="text" style="width:60px;text-align:center;" class="input1_2" value="" name="loc_cd" maxlength="5" dataformat="engup"><!-- img class="cursor" src="img/btns_search.gif" width="18" height="20" alt="" border="0" align="absmiddle" name="btn_com_ens_051"--></td>
		<th>Control Office</th>
		<td><input type="text" style="width:60px;text-align:center;" class="input1_2" value="" name="ofc_cd" maxlength="6" dataformat="engup"><!-- img class="cursor" src="img/btns_search.gif" width="18" height="20" alt="" border="0" align="absmiddle" name="btn_com_ens_071"--></td>
		<th>Status</th>
		<td><select style="width:80px;" class="input" name="status"><!-- 
		 --><option value="">All</option><!-- 
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
<div class="opus_design_grid" id="flagLayer1" style="display:none"> 
	<script type="text/javascript">ComSheetObject('sheet1');</script>
</div>
<!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->  


</form>