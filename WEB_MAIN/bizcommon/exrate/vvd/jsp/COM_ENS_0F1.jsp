<%--
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName : COM_ENS_0E1.jsp
*@FileTitle : Monthly
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/05
=========================================================*/ 
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.exrate.vvd.event.ComEns0F1Event"%>
<%
	ComEns0F1Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	int rowCount	 = 0;								  //DB ResultSet 리스트의 건수
	String main_page = "";
	String strErrMsg = "";
	
	try {

		event = (ComEns0F1Event)request.getAttribute("Event");
		
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		main_page = JSPUtil.getParameter(request, "main_page".trim(), "");
        
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
        
		// 탭을 사용하는 화면인 경우 추가한다.
        // InitTab();
        loadPage(<%=main_page%>);
    }
</script>

<!-- 
showErrMessage를 써주지 않으면 에러 발생시 처리가 불가합니다.
그리고 지금은 showErrMessage()으로 되어있지만 추후에 고객님이 변덕을 일으켜서 웹페이지를 호출하라고 할경우를 
대비해서 직접 showErrMessage() 하지 마시고 꼭 showErrMessage를 써주십시오. 한방에 바꾸게요. 표준을 안따르면 나중에 후회합니다.  
-->

<!-- OUTER - POPUP (S)tart -->

<%if(main_page.equals("true")){ %>

<form method="post" name="form" onSubmit="return false;">
<input	type="hidden" name="f_cmd"> 
<input type="hidden" name="iPage"> 

<!-- 제목 -->
<div class="page_title_area clear">
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->

		<!-- btn_div -->
	<div class="opus_design_btn">
	    <button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button>
	    <button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button>
	</div>

   <!-- page_location(S) -->
   <div class="location">
		<span id="navigation"></span>
   </div>
</div>
<!-- 제목 -->
		

<%} else { %>

<form method="post" name="form" onSubmit="return false;">
<input	type="hidden" name="f_cmd" id="f_cmd"> 
<input type="hidden" name="iPage" id="iPage"> 
		
<!-- popup_title_area(S) -->
 <div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title"><span> VVD Exchange Rate Inquiry</span></h2>
		<!-- page_title(E) -->
			
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button>
			<button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button>
			<button type="button" class="btn_normal" name="btn_OK" id="btn_OK">OK</button>
			<button type="button" class="btn_normal" name="btn_Close" id="btn_Close">Close</button>
		</div>
		<!-- opus_design_btn(E) -->	
	</div>
	<!-- page_title_area(E) -->
</div>
<!-- popup_title_area(E) -->
		
		
	<%} %>	

<!-- 검색영역 -->
<div class="wrap_search">
	<div class="opus_design_inquiry">		
		<!-- : ( Scenario ID ) (S) -->
		<table class="search" border="0" style="width:735px;"> 
			<tr class="h23">
			<th width="4%">VVD</th>
			<td width="12%">&nbsp;<input type="text" name="vvd_cd" style="width:90px" maxlength="9" onKeyUp="javascript:upper(this);"></td>
			<th width="4%">Port</th>
			<td width="10%">&nbsp;<input type="text" name="port_cd" style="width:50px" maxlength="5" onKeyUp="javascript:upper(this);"></td>
			<th width="10%">Charge Cur</th>
			<td width="13%">
				<%= com.clt.bizcommon.util.BizComUtil.getCodeCombo("chg_curr_cd", "", "", "CURR", 2, "0: :") %>
			</td>
			<th width="10%">Local Cur</th>
			<td width="13%">
				<%= com.clt.bizcommon.util.BizComUtil.getCodeCombo("locl_curr_cd", "", "", "CURR", 2, "0: :") %>
			</td>
			<th width="5%">Scope</th>
			<td width="8%"><input type="text" name="svc_scp_cd" style="width:40px" maxlength="3" onKeyUp="javascript:upper(this);"></td>
			<th width="5%">Bound</th>
			<td width="20%"><select name="io_bnd_cd" style="width:70px;">
					<option value="">All</option>
					<option value="O">O/B</option>
					<option value="I" selected>I/B</option>
					</select></td></tr> 
			
		
		</table>
		<!-- : ( Scenario ID ) (E) -->
	</div>
	<!-- 검색영역 -->
</div>

<!-- 시트영역 -->
<div class="wrap_result">
	<div class="opus_design_grid">	
		<script type="text/javascript">ComSheetObject('sheet');</script>
	</div>
</div>
<!-- 시트영역 -->
		
</form>

 <%@include file="../../../include/common_alps.jsp"%>