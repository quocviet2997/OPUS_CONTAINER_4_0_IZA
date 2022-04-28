<%
/*=========================================================
*Copyright(c) 2015 CyberLogitec. All Rights Reserved.
*@FileName 	 : fileupload.jsp
*@FileTitle  : Sample Fileupload
*@author     : CLT
*@version    : 1.0
*@since      : 2015/01/19
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.framework.component.util.file.ModuleMetaData"%>
<%@ page import="com.clt.framework.core.config.SubSystemConfigFactory"%>

<script type="text/javascript">
	function setupPage() {
		loadPage();
	}
</script>

<form name="form">

<div class="layer_popup_title">
	<div class="page_title_area clear">
		<h2 class="page_title"><span>File Upload & Download</span></h2>
		
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_upload" id="btn_upload">File Upload</button><!-- 
			--><button type="button" class="btn_normal" name="btn_save" id="btn_save">File Save</button><!--
			--><button type="button" class="btn_normal" name="btn_FileDown" id="btn_FileDown">File DownLoad</button><!-- 
			--><button type="button" class="btn_normal" onclick="ComClosePopup()">Close</button>
		</div>
	</div>
</div>

<div class="layer_popup_contents">
	<div class="wrap_search">
		<div class="opus_design_inquiry wFit">
			<table> 
				<tbody>
					<tr>
						<th width="100">Module Name</th>
						<td>
							<input type="text" style="width:50px;" name="subSysCd" id="subSysCd" value=''>
						</td>
						<!-- <th width="100">File Down KEY</th>
						<td>
							<input type="text" style="width:200px;" name="key" id="key" value=''>
						</td>
						-->
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	
	<div class="opus_design_grid" style="display:inline">
		<!--IBUpload Component (S) -->
		<script type="text/javascript">ComUploadObject('upload1', '<=session.getId()%>');</script>
		<!--IBUpload Component (E) -->
	</div>
</div>
<!-- opus_design_grid(E) -->
</form>
