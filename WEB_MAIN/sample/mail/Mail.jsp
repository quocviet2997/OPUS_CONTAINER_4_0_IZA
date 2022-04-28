<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="m2soft.rdsystem.server.core.rddbagent.util.serverexport.ExportInfo"%><html>
<script language="javascript" type="text/javascript" src="/opuscntr/js/common/CoPopup.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/common/CoMail.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/common/CoCommon.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/common/CoFormControl.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/common/CoCalendar.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/common/CoObject.js?version=U5"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/common/IBSheetInfo.js?version=multi"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/common/CoBiz.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/common/CoUpload.js?version=U1"></script>
<script language="javascript" type="text/javascript" >
	function comMailKeyReturn(key){
		alert(key);
	}
	function setupPage(){
	}
</script>

<form name="form">

<div class="layer_popup_title">
	<div class="page_title_area clear">
		<h2 class="page_title"><span>RD 첨부 Mail(SMTP)</span></h2>
		
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" onclick="ComSendMail()">Fire</button><!-- 
			--><button type="button" class="btn_normal" onclick="ComClosePopup()">Close</button>
		</div>
	</div>
</div>

<div class="layer_popup_contents">
	<div class="wrap_result">
		<div class="opus_design_inquiry wFit">
			<table>
				<tr>
					<td>RdSubSystemCode</td>
					<td><input type="text" size=100 name="com_rdSubSysCd" value="COM"></td>
				</tr>
				<tr>
					<td>From</td>
					<td><input type="text" size=100 name="com_from" value="test@one-line.com"></td>
				</tr>
				<tr>
					<td>From Name</td>
					<td><input type="text" size=100 name="com_fromName" value="CLT TEST"></td>
				</tr>
				<tr>
					<td>To</td>
					<td><input type="text" size=100 name="com_recipient" value="waiterj@cyberlogitec.com"></td>
				</tr>
				<tr>
					<td>CC</td>
					<td><input type="text" size=100 name="com_carbonCopy" value=""></td>
				</tr>
				<tr>
					<td>BCC</td>
					<td><input type="text" size=100 name="com_blindCarbonCopy" value=""></td>
				</tr>
				<tr>
					<td>Subject</td>
					<td><input type="text" size=100 name="com_subject" value="Mail Test"></td>
				</tr>
				<tr>
					<td>File Key</td>
					<td><input type="text" size=100 name="com_fileKey" value=""></td>
				</tr>
				<tr>
					<td>Content</td>
					<td><input type="text" size=100 name="com_content" value=""></td>
				</tr>
				<tr>
					<td>Template</td>
					<td><input type="text" size=100 name="com_template" value="template.htmlmail"></td>
				</tr>
				<tr>
					<td>TemplateArguments</td>
					<td><input type="text" size=100 name="com_argument" value="name;JayLee,message;Hello"></td>
				</tr>
				<tr>
					<td>RD Template(MRD)</td>
					<td><input type="text" size=100 name="com_templateMrd" value="sample/rd/mrdSample/clt.mrd"></td>
				</tr>
				<tr>
					<td>RD Template(MRD) Arguments</td>
					<td><input type="text" size=100 name="com_templateMrdArguments" value="/rp [X]"></td>
				</tr>
				<tr>
					<td>RD Export File Name</td>
					<td><input type="text" size=100 name="com_rdExportFileName" value="test1.pdf"></td>
				</tr>
				<tr>
					<td>RD Export File Type PDF</td>
					<td><input type="text" size=100 name="com_rdExportFileType" value="<%=ExportInfo.FTYPE_PDF%>"></td>
				</tr>
				<tr>
					<td>RD Template(MRD)</td>
					<td><input type="text" size=100 name="com_templateMrd" value="sample/rd/mrdSample/clt.mrd"></td>
				</tr>
				<tr>
					<td>RD Template(MRD) Arguments</td>
					<td><input type="text" size=100 name="com_templateMrdArguments" value="/rp [X]"></td>
				</tr>	
				<tr>
					<td>RD Export File Name</td>
					<td><input type="text" size=100 name="com_rdExportFileName" value="test2.doc"></td>
				</tr>	
				<tr>
					<td>RD Export File Type DOC</td>
					<td><input type="text" size=100 name="com_rdExportFileType" value="<%=ExportInfo.FTYPE_DOC%>"></td>
				</tr>
				<tr>
					<td>MailKey</td>
					<td><input type="text" size=100 id="com_mailKeyFlag" value="false"></td>
				</tr>
			</table>
		</div>
	</div>
</div>
</form>
