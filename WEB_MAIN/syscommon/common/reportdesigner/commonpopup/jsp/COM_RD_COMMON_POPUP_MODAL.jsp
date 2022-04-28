<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_RD_COMMON_POPUP_MODAL.jsp
*@FileTitle  : COM_RD_COMMON_POPUP_MODAL
*@author     : CLT
*@version    : 1.0
*@since      : 2016/07/01 
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<script type="text/javascript">
	function setupPage(){
		setModalValues();
		rdOpen();
	}
</script>
<script type="text/javascript" src="/opuscntr/rpt/script/common_rd.js"></script>
<form name="form">
<input type="hidden" id="com_mrdPath" value="<%=request.getParameter("com_mrdPath")%>"/>
<input type="hidden" id="com_mrdArguments" value="<%=request.getParameter("com_mrdArguments")%>"/>
<input type="hidden" id="com_mrdDisableToolbar" value="<%=request.getParameter("com_mrdDisableToolbar")%>"/>
<input type="hidden" id="com_isBatch" value="<%=request.getParameter("com_isBatch")%>"/>

<div class="layer_popup_title">	
	<div class="page_title_area clear">
		<h2 class="page_title"><span><%=request.getParameter("com_mrdBodyTitle")!=null?request.getParameter("com_mrdBodyTitle"):"" %></span></h2>
		
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_Close" onclick="ComClosePopup()"	id="btn_Close">Close</button>
		</div>
	</div>
</div>

<div class="layer_popup_contents">
	<div class="wrap_result">	
		<div class="opus_design_RD"> 
			<script type="text/javascript">rdViewerObject();</script>
	    </div>
	</div>
</div>
</form>