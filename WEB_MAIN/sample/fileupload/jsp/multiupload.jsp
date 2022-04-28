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
			<!-- button type="button" class="btn_normal" name="btn_upload" id="btn_upload">File Upload</button> 
			<button type="button" class="btn_normal" name="btn_save" id="btn_save">File Save</button>
			<button type="button" class="btn_normal" name="btn_FileDown" id="btn_FileDown">File DownLoad</button -->
			<button type="button" class="btn_normal" onclick="ComClosePopup()">Close</button>
		</div>
	</div>
</div>

<div class="layer_popup_contents">
	<div class="wrap_search">
		<div class="opus_design_inquiry wFit">
			<table> 
				<tbody>

					<tr height="30px;">
	                    <th>Upload Files</th>
	                    <td style="padding-bottom:0px">
	                    <div style="width:300px; height:28px; border:1px solid black; background:white;" id="drop-area">
	                    	<input type="file" id="files_upload" class="inputfiles" multiple />
	                    	<label for="files_upload"></label>
	                    </div></td>
	                    <!-- td align="left"  style="padding-left: 10px;"><button type="button" class="btn_etc" name="btn_Test_Fileadd" id="btn_Test_Fileadd" >Add</button>
	                        <button type="button" class="btn_etc" name="btn_Test_Filedelete" id="btn_Test_Filedelete" style="display:none;">Del.</button>
	                    </td -->
	                </tr> 
	                <tr height="30px;">
						<th></th>
						<td><ul id="file-list">
							<li class="no-items"></li>
						</ul></td>
					</tr> 
				</tbody>
			</table>
		</div>
	</div>

</div>
<!-- opus_design_grid(E) -->
</form>
