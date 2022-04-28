<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_0S1.jsp
*@FileTitle  : country
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/12
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.bizcommon.approval.event.ComEns0Y1Event"%>
<%
	ComEns0Y1Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	DBRowSet rowSet	  = null;							   //DB ResultSet
	String strErrMsg = "";								 //에러메세지
	int rowCount	 = 0;								  //DB ResultSet 리스트의 건수	

	try {		
	   //SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
	   //userId=account.getUsr_id();
	   //userAuth=account.getAuth();

		event = (ComEns0Y1Event)request.getAttribute("Event");

		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

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

<!-- 
showErrMessage를 써주지 않으면 에러 발생시 처리가 불가합니다.
그리고 지금은 showErrMessage()으로 되어있지만 추후에 고객님이 변덕을 일으켜서 웹페이지를 호출하라고 할경우를 
대비해서 직접 showErrMessage() 하지 마시고 꼭 showErrMessage를 써주십시오. 한방에 바꾸게요. 표준을 안따르면 나중에 후회합니다.  
-->
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="iPage" id="iPage" />
<!-- BackEndJob을 위한 Field -->
<input type="hidden" name="key" id="key" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
<!-- page_title(S) -->
<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
<h2 class="page_title"><button type="button">Unapproved CSR Inquiry</button></h2>
<!-- page_title(E) -->
<!-- opus_design_btn(S) -->
<div class="opus_design_btn">
<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
 --> <button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button><!--
 --> <button type="button" class="btn_normal" name="btn_DownExcel" id="btn_DownExcel">Down Excel</button>
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
			<col width="50">
			<col width="130">
			<col width="80">
			<col width="140">
			<col width="100">
			<col width="*">
		</colgroup>
		<tr class="h23">
			<th>RHQ</th>
			<td><script type="text/javascript">ComComboObject('ar_hd_qtr_ofc_cd', 2, 100, 0);</script></td>
			<th>Office Code</th>
			<td><script type="text/javascript">ComComboObject('ofc_cd', 1, 120, 1);</script></td>
			<th>Effective Date</th>
			<td><input type="text" style="width:80px;text-align:center;ime-mode:disabled" dataformat="ymd" maxlength="8" class="input" name="inv_eff_dt" value="" id="inv_eff_dt" /><!-- 
			 --><button type="button" name="btns_Calendar2" id="btns_Calendar2"  class="calendar ir"></button></td>
		</tr>
	</table>
	
	<table>
		<colgroup>
			<col width="50">
			<col width="130">
			<col width="80">			
			<col width="*">
		</colgroup>
		<tr class="h23">
			<th>Module</th>
			<td><%= com.clt.bizcommon.util.BizComUtil.getCodeCombo("sub_sys_cd", "", "", "SUBSYS", 1, "0: :") %></td>
			<th>CSR No.</th>
			<td><input name="csr_no" type="text" maxlength=20 style="width:100%" value="" onBlur='this.value=this.value.trim();'></td>				
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
<SCRIPT LANGUAGE="javascript">
<!--
	  
	  /* 
		ibSheet 를 제외한 폼 입력값(?) 유저가 입력한 정보를 event를 통해서 다시 넘겨받아 화면에 뿌려주는 부분입니다. 
	  */
	  with(document.form)
	  {
	  	<%
		if(event != null){ 
			String frDate   = "";
			   String toDate   = "";
			   
			   java.util.Calendar calendar = java.util.Calendar.getInstance();
			   
			   String toMonth = "" + (calendar.get(java.util.Calendar.MONTH) + 1);
			   if(Integer.parseInt(toMonth) < 10)
				   toMonth = "0" + toMonth;
			   
			   String toDay = "" + calendar.get(java.util.Calendar.DATE);
			   if(Integer.parseInt(toDay) < 10)
				   toDay = "0" + toDay;
			   
			   toDate = calendar.get(java.util.Calendar.YEAR) + "-"
			   		+ toMonth + "-"
			   		+ toDay;
			   
			   calendar.add(java.util.Calendar.MONTH, -1);
			   
			   String frMonth = "" + (calendar.get(java.util.Calendar.MONTH) + 1);
			   if(Integer.parseInt(frMonth) < 10)
				   frMonth = "0" + frMonth;
			   
			   String frDay = "" + calendar.get(java.util.Calendar.DATE);
			   if(Integer.parseInt(frDay) < 10)
				   frDay = "0" + frDay;
			   
			   frDate = calendar.get(java.util.Calendar.YEAR) + "-"
		   			+ frMonth + "-"
		   			+ frDay;
		%>
		
		eval("inv_eff_dt" ).value = "<%= toDate	 %>";
		<% } %>
	   }
-->
</SCRIPT>