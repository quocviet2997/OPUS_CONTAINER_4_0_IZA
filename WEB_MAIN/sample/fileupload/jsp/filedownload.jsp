<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="com.clt.framework.core.config.SiteConfigFactory"%><html>

<script type="text/javascript">
	function setupPage(){
	}
</script>

<form name="form" action="/opuscntr/FileDownload" method="post">

<div class="layer_popup_title">
	<div class="page_title_area clear">
		<h2 class="page_title"><span>File Download</span></h2>
		
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" onclick="form.submit()">DownLoad JSP</button><!-- 
			--><button type="button" class="btn_normal" onclick="ComClosePopup()">Close</button>
		</div>
	</div>
</div>

<div class="layer_popup_contents">
	<div class="wrap_result">
		<div class="opus_design_inquiry wFit">
			KEY : &nbsp;&nbsp;<input type="text" name="<%=SiteConfigFactory.get("COM.FILE.DOWNLOAD.KEY") %>" size="55">
		</div>
	</div>
</div>

</form>