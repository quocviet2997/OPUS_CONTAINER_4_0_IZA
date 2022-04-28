<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : mail_01.jsp
*@FileTitle  : Mail Sample
*@author     : CLT
*@version    : 1.0
*@since      : 2015/01/02
=========================================================
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.sample.mail.mail.event.Mail01Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<script language="javascript" type="text/javascript" src="apps/opus/esm/bkg/CoBkg.js"></script>

<script language="javascript">
	function setupPage(){
		loadPage();
	}
</script>

<form name="form" action="MAIL_01GS.do">
<div class="layer_popup_title">
	<div class="page_title_area clear">
		<h2 class="page_title"><span>Mail Sample</span></h2>
		
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" onclick="form.submit()">Fire</button><!-- 
			--><button type="button" class="btn_normal" onclick="ComClosePopup()">Close</button>
		</div>
	</div>
</div>

<div class="layer_popup_contents">
	<div class="wrap_result">
		<div class="opus_design_inquiry wFit">
			<input type="hidden" name="f_cmd" value="11">
			<input type="hidden" name="pagerows">
		</div>
	</div>
</div>
</form>