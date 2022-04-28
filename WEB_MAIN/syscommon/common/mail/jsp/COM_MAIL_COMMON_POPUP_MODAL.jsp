<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script language="javascript" type="text/javascript" src="../script/COM_MAIL_COMMON_POPUP_MODAL.js"></script>
<script type="text/javascript">
    function setupPage(){
        loadPage();
    }
</script>
<form name="formMail" action="/opuscntr/Mail.do"> 
<iframe name="myFrame" style="display:none;width:100%;height:760px;overflowY:scroll;"></iframe>
<input type="hidden" name="com_rdSubSysCd"/> 
<input type="hidden" name="com_from"/> 
<input type="hidden" name="com_fromName"/> 
<input type="hidden" name="com_recipient"/> 
<input type="hidden" name="com_carbonCopy"/> 
<input type="hidden" name="com_blindCarbonCopy"/> 
<input type="hidden" name="com_subject"/> 
<input type="hidden" name="com_fileKey"/> 
<input type="hidden" name="com_content"/> 
<input type="hidden" name="com_template"/> 
<input type="hidden" name="com_argument"/> 
<input type="hidden" name="com_rdExportFileName"/> 
<input type="hidden" name="com_rdExportFileType"/> 
<input type="hidden" name="com_templateMrd"/>
<input type="hidden" name="com_templateMrdArguments"/>
<input type="hidden" name="com_templateMrdDescription"/>
<input type="hidden" name="com_mailKeyFlag"/>
<input type="hidden" name="com_mailKey"/>
<input type="hidden" name="com_smtp"/>
<input type="hidden" name="com_officeCode"/>
<input type="hidden" name="com_groupwareMail"/>
</form>
