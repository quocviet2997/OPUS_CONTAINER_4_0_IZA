<%
/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : COM_ENS_0V1.jsp
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2017.06.27
*@LastModifier : CLT
*@LastVersion : 1.0
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.bizcommon.staff.event.ComEns091Event"%>
<%
	String cahrt = "";
	if(request.getParameter("Subscriber") != null || !request.getParameter("Subscriber").equals("")){
		cahrt = request.getParameter("Subscriber");
	}
	SignOnUserAccount account = (SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
	String ofc_cd = account.getOfc_cd();
%>
<html>
<head>
<title>Organization      Chart</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</HEAD>
<form name="form">
<input type="hidden" name="f_cmd"> 
<input type="hidden" name="ofc_cd_deptsrch">
<input type="hidden" name="mode">
<input type="hidden" name="apro_step">
<input type="hidden" name="target_obj_nm">
<input type="hidden" name="incl_incmpl_apro_csr_yn" value="N">

<script  type="text/javascript">
    function setupPage(){
        loadPage();
    }
</script>
<!-- page_title_area(S) -->
<div class="page_title_area clear">
    <!-- page_title(S) -->
    <h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
    <!-- page_title(E) -->
    
    <!-- opus_design_btn(S) -->
    <div class="opus_design_btn">
						<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve" >Retrieve</button>
						<button type="button" class="btn_accent" name="btn_Save" id="btn_Save" >Save</button> 
    </div>
    <!-- opus_design_btn(E) -->
    <!-- page_location(S) -->
    <div class="location">
        <span id="navigation"></span>
    </div>
    <!-- page_location(E) -->
</div>
<!-- page_title_area(E) -->
<!-- Grid (S) -->
<div class="wrap_search">
	<div class="opus_design_inquiry wFit">
	    <table>	        
	        <tbody>
	        	<colgroup>
		            <col width="70" />
		            <col width="70" />
		            <col width="70" />
		            <col width="80" />
		            <col width="70" />
		            <col width="120" />
		            <col width="150" />
		            <col width="90" />
		            <col width="60" />
		            <col width="60" />
		            <col width="60" />
	        	</colgroup>
				<tr>
					<th>Office Code</th>
					<td><input type="text" name="s_ofc_cd" style="width:65px;ime-mode:disabled" dataformat="engup" maxlength="6" value="<%=ofc_cd%>"></td>					
					<th>User ID</th>
					<td><input type="text" name="user_cd" maxlength="20" style="width:80px"></td>					
					<th>User Name</th>
					<td><input type="text" name="user_nm" style="width:120px;"></td>
					<td><div style="text-align:left;" class="opus_design_btn">
						<button type="button" class="btn_accent" name="btn_Search" id="btn_Search" >Search</button> 
			 			<button type="button" class="btn_accent" name="btn_New" id="btn_New">New</button>
					</div></td>
					<td></td>
					<th>Office</th>
					<td ><input type="text" name="ofc_cd" style="width:65px" maxlength="5" dataformat="engup" class="input1"></td>
					<th >Module</th>
					<td><%= com.clt.bizcommon.util.BizComUtil.getCodeCombo("sub_sys_cd", "", "", "SUBSYS", 2, "") %></td>
					<td>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</div>	

<div class="wrap_result">	
	<div class="opus_design_grid" >
		<!-- layout_wrap (S) -->
		<div class="layout_vertical_2" style="width:15%">  
			<script  type="text/javascript">ComSheetObject('sheetDept');</script>   
		</div>     
	     <div class="layout_vertical_2 pad_left_8" style="width:30%">
	     		<script  type="text/javascript">ComSheetObject('sheetUser');</script>
	     </div>
	    	<div class="layout_vertical_2 pad_left_8" style="width:3%" >
			<table border="1">
				<tr>
					<td align="center">
						<br><br><br><br>
						<img src="img/btns_add.gif" border="0" name="btns_add" style="cursor:pointer;">
						<br><br>
						<img src="img/btns_del.gif" border="0" name="btns_del" style="cursor:pointer;">
						<br><br><br><br><br><br>
						<!-- 
						<img src="img/btns_up.gif" border="0" name="btns_up" style="cursor:pointer;">
						<br><br>
						<img src="img/btns_down.gif" border="0" name="btns_down" style="cursor:pointer;">
						 -->
					</td>
				</tr>
			</table>
		</div>
		<div class="layout_vertical_2 pad_left_8" style="width:42%">
			<script language="javascript">ComSheetObject('sheet2');</script>
		</div>
		<!-- layout_wrap (e) -->
	</div>
</div>
</form>
</BODY>
</HTML>