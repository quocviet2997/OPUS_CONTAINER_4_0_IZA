<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

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
		<h2 class="page_title"><span>MailNoMrd</span></h2>
		
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" onclick="ComSendMailModal()">Fire</button><!-- 
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
					<td><input type="text" size=100 name="com_from" value="TEST@cyberlogitec.com"></td>
				</tr>
				<tr>
					<td>From Name</td>
					<td><input type="text" size=100 name="com_fromName" value="HC TEST"></td>
				</tr>
				<tr>
					<td>To</td>
					<td><input type="text" size=100 name="com_recipient" value="TEST@cyberlogitec.com"></td>
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
					<td><input type="text" size=100 name="com_subject" value="Title 입니다."></td>
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
					<td><input type="text" size=100 name="com_argument" value="name;TEST,message;Hello"></td>
				</tr>
				<tr>
					<td>Set SMTP</td>
					<td><input type="text" size=100 name="com_smtp" value=""></td>
				</tr>
				<tr>
					<td>Set Office Code</td>
					<td><input type="text" size=100 name="com_officeCode" value=""></td>
				</tr>
				<tr>
					<td>Set Groupware Mail</td>
					<td><input type="text" size=100 name="com_groupwareMail" value="false"></td>
				</tr>               
				<tr>
					<td>MailKey</td>
					<td><input type="text" size=100 id="com_mailKeyFlag" value="true"></td>
				</tr>
			</table>
		</div>
	</div>
</div>
</form>