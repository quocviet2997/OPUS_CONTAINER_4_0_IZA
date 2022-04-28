<%@page import="com.clt.utilitybox.utility.CheckUtilities"%>
<%@page import="utils.system"%>
<script type="text/javascript" type="text/javascript" src="/opuscntr/syscommon/common/fckeditor/ckeditor.js"></script>
<script type="text/javascript" type="text/javascript" src="/opuscntr/syscommon/common/mail/script/UI_email_02.js"></script>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.core.config.SiteConfigFactory"%>
<%@ page import="java.util.List"%>
<%@ page import="com.clt.framework.component.util.io.FileUtils"%>
<%@ page import="com.clt.syscommon.common.mail.vo.MailCustomVO"%>
<%@ page import="com.clt.framework.component.util.CheckUtils"%>

<%
	String content = null;
	MailCustomVO mailCustomVO = new MailCustomVO();
	String mailKey = "";
	if (request.getAttribute("EventResponse") != null) {
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		content = (String) eventResponse.getCustomData("templateContent");
		MailCustomVO serverReturnedMailCustomVO = (MailCustomVO) eventResponse.getCustomData("mailCustomVO");
		if(!CheckUtilities.isNull(serverReturnedMailCustomVO)){
			mailCustomVO = serverReturnedMailCustomVO;
		}
		mailKey = (String) eventResponse.getETCData("mailKey");
	}
	//업무에서 올라온 파일키를 공통 메일창에 설정하기
	String fileInformations = request.getParameter("com_fileKey");
	String[] arrayFileInformation = {};
	if(!CheckUtils.isNullAndNullString(fileInformations)){
		arrayFileInformation = fileInformations.split(";");
	}
%>

<input type="hidden" id="com_mailKey" name="com_mailKey" value="<%=mailKey%>" /> 
<script type="text/javascript">
	function setupPage(){
		var com_mailKey = document.getElementById("com_mailKey");
		if(com_mailKey.value != 'null' && com_mailKey.value != null && com_mailKey.value != "") {
			mailClose();
			return;
		} 
		loadPage();
	}
</script>

<form name="form"><!-- OUTER - POPUP (S)tart -->

<div class="layer_popup_title">
	<div class="page_title_area clear">
		<h2 class="page_title"><span>e-Mail</span></h2>
		
		<div class="opus_design_btn"><!-- 
			--><button type="button" class="btn_normal"  onclick="doMail()">Send</button><!-- 
			--><button type="button" class="btn_normal" name="btn_Close" id="btn_Close">Close</button>
		</div>
	</div>
</div>

<div class="layer_popup_contents"> 
	<div class="wrap_search">
		<div class="opus_design_inquiry">
			<table class="grid_2">
				<tr>
					<th >From</th>
					<td colspan="2"><textarea name="com_from" style="width: 100%;hight:20; text-align: left;resize:none" class="noinput"><%=mailCustomVO.getFrom()%></textarea></td>
				</tr>
				<tr>
					<th>TO</th>
					<td colspan="2"><textarea name="com_recipient" style="width: 100%;hight:20; text-align: left;resize:none" class="noinput"><%=mailCustomVO.getRecipient()%></textarea></td>
				</tr>
				<tr>
					<th>CC</th>
					<td colspan="2"><textarea name="com_carbonCopy" style="width: 100%;hight:20; text-align: left;resize:none" class="noinput"><%=mailCustomVO.getCarbonCopy()%></textarea></td>
				</tr>
				<tr>
					<th>BCC</th>
					<td colspan="2"><textarea name="com_blindCarbonCopy" style="width: 100%;hight:20; text-align: left;resize:none" class="noinput"><%=mailCustomVO.getBlindCarbonCopy()%></textarea></td>
				</tr>
				<tr>
					<th>Subject</th>
					<td colspan="2"><textarea name="com_subject" style="width: 100%;hight:20; text-align: left;resize:none" class="noinput"><%=mailCustomVO.getSubject()%></textarea></td>
				</tr>
				<tr>
					<th>Attach</th>
					<td><button type="button" class="btn_etc"  name="btn_Attach" id="btn_Attach">Attach</button></td>
					<td width="445">
					<span  id="userAttachFile" style="width:530;height:20;overflow:auto">
					<%
					StringBuilder loopFileStringBuilder = new StringBuilder();
					String loopFile = "";
					if(!CheckUtils.isNull(arrayFileInformation)){
						for(int i=0;i<arrayFileInformation.length;i++){
							String fileInformation = arrayFileInformation[i];
							String lastFileNameInformation = "NoName";
							String lastFileInformation = "";
							if(fileInformation.contains("<")){
								String[]  oneFileInfomation = fileInformation.split("<");
								lastFileInformation =  oneFileInfomation[0];
								lastFileNameInformation = oneFileInfomation[1];
							} else{
								lastFileInformation = fileInformation;
							}
							out.print("<input type=\"button\" id=\"fileInfoDelButton"+i+"\" name=\"fileInfoDelButton"+i+"\" value=\"Del\" onclick=\"deletePreFileInfo("+i+")\">");
							out.print("<input type=\"button\" id=\"fileInfo"+i+"\" name=\"fileInfo"+i+"\" value=\""+lastFileNameInformation+"\">");
							out.print("<input type=\"hidden\" id=\"fileInfoObj"+i+"\" name=\"fileInfoObj"+i+"\" value=\""+lastFileInformation+"\">");
							loopFileStringBuilder.append(loopFile);
							loopFileStringBuilder.append(i);
							loopFileStringBuilder.append(";");
						}
					}
					out.print("<input type=\"hidden\" id=\"com_PreFileForLoop\" name=\"com_PreFileForLoop\" value=\""+loopFileStringBuilder.toString()+"\">");
					%>
					</span>
					</td>
				</tr>
				<tr>
					<th width="50">Report<br>Attach</th>
					<td colspan="2">
					<%
						int i = 0;
						if (mailCustomVO != null) {
							java.util.regex.Pattern p       = java.util.regex.Pattern.compile("^[/\\\\]?(?:.+[/\\\\]+?)?(.+?)[/\\\\]?$");
							String com_mrdFile = "";
							String com_mrdPath = "";
							for(String templateMrd:mailCustomVO.getTemplateMrd()){
								com_mrdPath = mailCustomVO.getTemplateMrd().get(i);
								java.util.regex.Matcher matcher = p.matcher(com_mrdPath);

							    if ( matcher.find() ) {
							    	com_mrdFile = matcher.group(1);
							    }
								
								
								
								out.print("<input type=\"checkbox\" name=\"reportFileCheckBox"+i+"\" id=\"reportFileCheckBox"+i+"\" checked=\"true\" onclick=\"changeStatusReportFileButton("+i+")\">");
								out.print("<input type=\"button\" name=\"reportFileButton"+i+"\" id=\"reportFileButton"+i+"\" value=\"" + mailCustomVO.getRdExportFileName().get(i) + "\" onclick=\"setReportMeta("+i+");ComOpenRDPopupModal('width=950,height=790')\">");
								out.print("<input type=\"hidden\" name=\"com_mrdPath"+i+"\" id=\"com_mrdPath"+i+"\" value=\""+com_mrdFile+"\">");
								out.print("<input type=\"hidden\" name=\"com_mrdPath4Preview"+i+"\" id=\"com_mrdPath4Preview"+i+"\" value=\""+com_mrdPath+"\">");
								out.print("<input type=\"hidden\" name=\"com_mrdArguments"+i+"\" id=\"com_mrdArguments"+i+"\" value=\""+mailCustomVO.getTemplateMrdArguments().get(i)+"\">");
								out.print("<input type=\"hidden\" name=\"com_rdExportFileName"+i+"\" id=\"com_rdExportFileName"+i+"\" value=\""+mailCustomVO.getRdExportFileName().get(i)+"\">");
								out.print("<input type=\"hidden\" name=\"com_rdExportFileType"+i+"\" id=\"com_rdExportFileType"+i+"\" value=\""+mailCustomVO.getRdExportFileType().get(i)+"\">");
								out.print("<input type=\"hidden\" name=\"com_reportForLoop\" id=\"com_reportForLoop\">");
								i++;
							}
						}
					%>
					</td>
				</tr>
			</table>
			<textarea class="ckeditor" name="com_content" id="com_content"><%=content == null ? "" : content%></textarea> <!-- Grid  (E) --></td>
		</div>	
		<!-- IBUpload  (S) -->
		<div class="opus_design_grid" style="display:none;">
			<script type="text/javascript">ComUploadObject('upload1','<=session.getId()%>');</script>
		</div>
		<!-- IBUpload  (E) -->
	</div>
</div>


<!-- hidden start --> 
<input type="hidden" id="com_fromName" name="com_fromName" value="<%=mailCustomVO==null ? "" : mailCustomVO.getFromName()%>" /> 
<input type="hidden" id="com_smtp" name="com_smtp" value="<%=mailCustomVO==null ? "" : mailCustomVO.getSmtp()%>" /> 
<input type="hidden" id="f_cmd" name="f_cmd" value="7" /> 
<input type="hidden" id="com_officeCode" name="com_officeCode" value="<%=mailCustomVO==null ? "" : mailCustomVO.getOfficeCode()%>" /> 
<input type="hidden" id="com_groupwareMail" name="com_groupwareMail" value="<%=mailCustomVO==null ? "" : mailCustomVO.getGroupwareMail()%>" /> 
<input type="hidden" id="com_fileKey" name="com_fileKey"/> 
<input type="hidden" id="com_mailKeyFlag" name="com_mailKeyFlag" value="<%=mailCustomVO==null ? "" : mailCustomVO.getMailKeyFlag()%>" /> 
<!-- hidden end -->
<!-- : ( bottom : email ) (E) -->

<!-- : ( hidden : report ) (S) -->
<input type="hidden" id="com_mrdPath" name="com_mrdPath" value="">
<input type="hidden" id="com_mrdArguments" name="com_mrdArguments" value="">
<input type="hidden" id="com_mrdSaveDialogDir" name="com_mrdSaveDialogDir" value="c:\\">
<input type="hidden" id="com_mrdSaveDialogFileExt" name="com_mrdSaveDialogFileName" value="SaveFileName">
<input type="hidden" id="com_mrdSaveDialogFileExt" name="com_mrdSaveDialogFileExt" value="pdf">
<input type="hidden" id="com_mrdSaveDialogFileExtLimit" name="com_mrdSaveDialogFileExtLimit" value="xls@pdf@bmp@tif">
<input type="hidden" id="com_mrdTitle" name="com_mrdTitle" value="Report Designer Common Popup">
<input type="hidden" id="com_mrdPrintPaperSize" name="com_mrdPrintPaperSize" value="1">
<input type="hidden" id="com_mrdDisableToolbar" name="com_mrdDisableToolbar" value="0;1;2;3;4;5;12;13;14;15;16;17">
<input type="hidden" id="com_mrdBodyTitle" name="com_mrdBodyTitle" value="Report Sample">
<input type="hidden" id="com_zoomIn" name="com_zoomIn">
<input type="hidden" id="com_isBatch" name="com_isBatch" value="N">
<!-- : ( hidden : report ) (E) -->

<!-- : ( hidden : report mail Attached ) (S) -->
<input type="hidden" id="com_templateMrd" name="com_templateMrd" value="">
<input type="hidden" id="com_templateMrdArguments" name="com_templateMrdArguments" value="">
<input type="hidden" id="com_rdExportFileName" name="com_rdExportFileName" value="">
<input type="hidden" id="com_rdExportFileType" name="com_rdExportFileType" value="">
<!-- : ( hidden : report mail Attached ) (E) -->

<!--  : (file : user file Attached() -->
<input type="file" name="com_fileObject" style="display:none;" onchange="addFile()"/>



</form>
