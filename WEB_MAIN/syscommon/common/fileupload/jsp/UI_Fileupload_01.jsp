<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : UI_Fileupload_01.jsp
*@FileTitle  : File UpLoad common
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/21
=========================================================
--%>
<%@page import="com.clt.syscommon.common.fileupload.event.FileUploadPopupEvent"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.component.util.file.ModuleMetaData"%>
<%@ page import="com.clt.framework.core.config.SubSystemConfigFactory"%>
</head>
<%
	GeneralEventResponse eventResponse = (GeneralEventResponse)request.getAttribute("EventResponse");
	ModuleMetaData moduleMetaData = (ModuleMetaData)eventResponse.getCustomData("ModuleMetaData");
	
	String comFileMaxCount = (String)eventResponse.getCustomData("ComFileMaxCount");
	String maxFileSize = moduleMetaData.getMax_size();
	FileUploadPopupEvent fileUploadPopupEvent = (FileUploadPopupEvent)request.getAttribute("FileUploadPopupEvent");
	String subSysCd = (String)fileUploadPopupEvent.getAttribute("subSysCd");
	String flag = (String)fileUploadPopupEvent.getAttribute("flag");
%>

<script language="javascript">
	function setupPage(){
		loadPage();
	}	
</script>

<form name="form" id="form" action="/opuscntr/FileUpload.do">

<div class="layer_popup_title">	
	<div class="page_title_area clear">
		<h2 class="page_title"><span></span></h2>
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn2_Add_File"	id="btn2_Add_File">File Add</button>
			<button type="button" class="btn_normal" name="btn2_Upload_File"	id="btn2_Upload_File">Upload</button>
			<button type="button" class="btn_normal" name="btn_close"	id="btn_close">Close</button>
			
	    </div>
	</div>
</div>
<div class="layer_popup_contents">
	<div class="wrap_search">
		<div class="opus_design_grid">
		 	<script language="javascript">ComUploadObject('upload1','obj',480,170);</script>
		</div>	
	</div>
</div>/

<input type="hidden" name="subSysCd" id="subSysCd" value='<%=subSysCd%>'>
<input type="hidden" name="maxFileSize" id="maxFileSize" value="<%=maxFileSize%>">
<input type="hidden" name="comFileMaxCount" id="comFileMaxCount" value="<%=comFileMaxCount%>">
<input type="hidden" name="flag" id="flag" value="<%=flag%>">
</form>	
