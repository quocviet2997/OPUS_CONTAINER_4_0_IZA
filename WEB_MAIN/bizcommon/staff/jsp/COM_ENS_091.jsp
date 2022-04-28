<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_091.jsp
*@FileTitle  : VVD
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.staff.event.ComEns091Event"%>
<%
	ComEns091Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;		
	String strErrMsg = "";								
	String main_page = "";
	try {
		
		event = (ComEns091Event)request.getAttribute("Event");
		
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		main_page = JSPUtil.getParameter(request, "main_page".trim(), "");
		SignOnUserAccount account = (SignOnUserAccount) session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		if(event.getOfc_cd().equals("")){
			event.setOfc_cd(account.getOfc_cd());
		}
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
	}catch(Exception e) {
		out.println(e.toString());
	}
%>
<script  type="text/javascript">
    function setupPage(){
        var errMessage = "<%=strErrMsg%>";
        if (errMessage.length >= 1) {
            ComShowMessage(errMessage);
        } // end if
        // InitTab();
        loadPage(<%=main_page%>);
    }
</script>

<form name="form" onkeyup="ComKeyEnter('lengthnextfocus');">
<input	type="hidden"  name="f_cmd"  id="f_cmd">
<%if(main_page.equals("true")){ %>
<!-- page_title_area(S) -->
	<div class="page_title_area clear">	    
	    <!-- page_title(S) -->
	    <h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	    <!-- page_title(E) -->
	    
	    <!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!-- 
			 --><button type="button" class="btn_accent" name="btn_New" id="btn_New">New</button>
		</div>
		<!-- opus_design_btn(E) -->
	    
	    <!-- page_location(S) -->
	    <div class="location">
	        <span id="navigation"></span>
	    </div>
	    <!-- page_location(E) -->
	</div>	
<%} else { %>
	<!-- page_title_area(S) -->
	<div class="layer_popup_title">
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title"><span>Staff Inquiry</span></h2>
		<!-- page_title(E) -->
			
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button><!--
			 --><button type="button" class="btn_normal" name="btn_OK" id="btn_OK">OK</button><!--
			 --><button type="button" class="btn_normal" name="btn_Close" id="btn_Close">Close</button>
			
		</div>
		<!-- opus_design_btn(E) -->	
	</div>
	</div>
	<!-- page_title_area(E) -->

<%} %>
		
<!-- opus_design_inquiry(S) -->
<%if(!main_page.equals("true")){ %>
<div class="layer_popup_contents" style="overflow:hidden;">
<%} %>
<div class="wrap_search">
	<div class="opus_design_inquiry wFit">
	    <table>	        
	        <tbody>
	        	<colgroup>
		            <col width="100" />
		            <col width="100" />
		            <col width="100" />
		            <col width="100" />
		            <col width="100" />
		            <col width="*" />
	        	</colgroup>
				<tr>
					<th>Office Code</th>
					<td><input type="text" name="ofc_cd" style="width:80px;ime-mode:disabled" dataformat="engup"></td>					
					<th>User ID</th>
					<td><input type="text" name="user_cd" style="width:80px"></td>					
					<th>User Name</th>
					<td><input type="text" name="user_nm" style="width:340px;"></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>	
	
<div class="wrap_result">	
	<div class="opus_design_grid" >
	<!-- layout_wrap (S) -->
	     <div class="layout_vertical_2" style="width:30%">  
	    		 <script  type="text/javascript">ComSheetObject('sheetDept');</script>   
	     </div>     
	     <div class="layout_vertical_2 pad_left_8" style="width:70%">	     	
	     		<script  type="text/javascript">ComSheetObject('sheetUser');</script>
	     </div>
	<!-- layout_wrap (e) -->
	</div>
</div>
<%if(!main_page.equals("true")){ %>
</div>
<%} %>
</form>

<SCRIPT  type="text/javascript">
	  with(document.form)
	  {
		<%
		if(event != null){ 
			   String ofc_cd   =event.getOfc_cd();
			   String user_cd   =event.getUser_cd();
			   String user_nm   =event.getUser_nm();
		%>
		eval("ofc_cd" ).value = "<%= ofc_cd	 %>";
		eval("user_cd" ).value = "<%= user_cd	 %>";
		eval("user_nm" ).value = "<%= user_nm	 %>";
		<% } %>
	   }
-->
</SCRIPT>
<%@include file="../../include/common_alps.jsp"%>