<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_0T1.jsp
*@FileTitle  : 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/21
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.bizcommon.approval.event.ComEns0T1Event"%>
<%@ page import="com.clt.framework.component.util.StringUtil" %>
<%
	ComEns0T1Event  event = null;
	String cahrt = "";
	if(request.getParameter("Subscriber") != null || !request.getParameter("Subscriber").equals("")){
		cahrt = request.getParameter("Subscriber");
	}
	String ofc_cd = ""; String mode = "";	String sub_sys_cd = "";	String csr_no = "";	String apro_step = "";	String target_obj_nm = "";
	try{
		event = (ComEns0T1Event)request.getAttribute("Event");
		SignOnUserAccount account = (SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		ofc_cd = account.getOfc_cd();
		
		mode = request.getParameter("mode") == null ? "" : StringUtil.xssFilter(request.getParameter("mode"));
		sub_sys_cd = request.getParameter("sub_sys_cd") == null ? "" : StringUtil.xssFilter(request.getParameter("sub_sys_cd"));
		csr_no = request.getParameter("csr_no") == null ? "" : StringUtil.xssFilter(request.getParameter("csr_no"));
		apro_step = request.getParameter("apro_step") == null ? "" : StringUtil.xssFilter(request.getParameter("apro_step"));
		target_obj_nm = request.getParameter("target_obj_nm") == null ? "" : StringUtil.xssFilter(request.getParameter("target_obj_nm"));
		
	}catch(Exception e) {
		out.println(e.toString());
	}
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <link href="/opuscntr/js/common/OrganTree.css" type="text/css" rel="stylesheet" /> -->
<script type="text/javascript" type="text/javascript" src="/opuscntr/js/common/OrganTree.js"></script>
<script type="text/javascript" type="text/javascript" src="/opuscntr/js/common/HashMap.js"></script>
<script type="text/javascript">
    function setupPage(){
	    loadPage();
    }
</script>
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="ofc_cd_deptsrch" id="ofc_cd_deptsrch" />
<input type="hidden" name="mode" id="mode" value="<%=mode%>">
<input type="hidden" name="apro_step"  id="apro_step" value="<%=apro_step%>">
<input type="hidden" name="target_obj_nm" id="target_obj_nm" value="<%=target_obj_nm%>">
<input type="hidden" name="ofc_cd" id="ofc_cd"  value="<%=ofc_cd%>">
<input type="hidden" name="aproSeqKey"  id="aproSeqKey" >
<input type="hidden" name="csr_no" id="csr_no" value="<%=csr_no%>">
<input type="hidden" name="sub_sys_cd"  id="sub_sys_cd" value="<%=sub_sys_cd%>">
<input type="hidden" name="frst_apro_usr_id" id="frst_apro_usr_id">

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<h2 class="page_title"><span>Approval Route Manager</span></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
			 <button type="button" class="btn_normal" name="btn_ok" id="btn_ok">OK</button><!-- 
		  --><button type="button" class="btn_normal"  name="btn_confirm">Save as Default</button><!-- 
		  --><button type="button" class="btn_normal"  name="btn_close" id="btn_close">Close</button>
	</div>
	<!-- opus_design_btn(E) -->
</div>
<!-- page_title_area(E) -->

<div class="wrap_result">
	<div class="layout_wrap">
		<div class="layout_vertical_2" style="width:220px" >
				<div id="treeView" style="overflow: auto; width: 210px; height: 320px; border-width: 1px; border-style: solid; border-color: #7F9DB9;"></div>
		</div>
		<div class="layout_vertical_2" style="width:250px;margin-right:4px">
			<div class="opus_design_grid">
				<script type="text/javascript">ComSheetObject('sheet1');</script>
			</div>
		</div>
		<div class="layout_vertical_2" style="width:30px;padding-top:130px; text-align:center;">
			<!--<img src="img/btns_add.gif" border="0" name="btns_add" class="cursor" >-->
			<button type="button" class="btn_right" name="btns_add"  id="btns_next"></button>
			<br><br><!--<img src="img/btns_del.gif" border="0" name="btns_del" class="cursor">-->
			<button type="button" class="btn_left" name="btns_del" id="btns_back"></button>
		</div>
		<div class="layout_vertical_2" style="width:295px">
			<div class="opus_design_grid">
				<script type="text/javascript">ComSheetObject('sheet2');</script>
			</div>
		</div>
	</div>
</div>
</form>
 <%@include file="../../include/common_alps.jsp"%>