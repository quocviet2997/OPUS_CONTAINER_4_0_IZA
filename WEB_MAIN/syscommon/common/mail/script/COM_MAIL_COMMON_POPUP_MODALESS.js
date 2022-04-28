var win = window.opener;

function doAction(){
	setArgument();
	var frm = document.formMail;
	formMail.action = "/opuscntr/Mail.do";
	//formMail.target = "myFrame";
	formMail.method = "post";
    document.getElementsByName("myFrame")[0].style.display = "inline";
	formMail.submit();
}

function setArgument(){
	document.title = "OPUS Common Mail Window.";
	if(win.document.getElementsByName("com_rdSubSysCd")[0] != null){
		document.formMail.com_rdSubSysCd.value = win.document.getElementsByName("com_rdSubSysCd")[0].value;
	}
	if(win.document.getElementsByName("com_from")[0] != null){
		document.formMail.com_from.value = win.document.getElementsByName("com_from")[0].value;
	}
	if(win.document.getElementsByName("com_fromName")[0] != null){
		document.formMail.com_fromName.value = win.document.getElementsByName("com_fromName")[0].value;
	}
	if(win.document.getElementsByName("com_recipient")[0] != null){
		document.formMail.com_recipient.value = win.document.getElementsByName("com_recipient")[0].value;
	}
	if(win.document.getElementsByName("com_carbonCopy")[0] != null){
		document.formMail.com_carbonCopy.value = win.document.getElementsByName("com_carbonCopy")[0].value;
	}
	if(win.document.getElementsByName("com_blindCarbonCopy")[0] != null){
		document.formMail.com_blindCarbonCopy.value = win.document.getElementsByName("com_blindCarbonCopy")[0].value;
	}
	if(win.document.getElementsByName("com_subject")[0] != null){
		document.formMail.com_subject.value = win.document.getElementsByName("com_subject")[0].value;
	}
	if(win.document.getElementsByName("com_fileKey")[0] != null){
		document.formMail.com_fileKey.value = win.document.getElementsByName("com_fileKey")[0].value;
	}
	if(win.document.getElementsByName("com_content")[0] != null){
		document.formMail.com_content.value = win.document.getElementsByName("com_content")[0].value;
	}
	if(win.document.getElementsByName("com_template")[0] != null){
		document.formMail.com_template.value = win.document.getElementsByName("com_template")[0].value;
	}
	if(win.document.getElementsByName("com_argument")[0] != null){
		document.formMail.com_argument.value = win.document.getElementsByName("com_argument")[0].value;
	}
	if(win.document.getElementsByName("com_smtp")[0] != null){
		document.formMail.com_smtp.value = win.document.getElementsByName("com_smtp")[0].value;
	}
	if(win.document.getElementsByName("com_officeCode")[0] != null){
		document.formMail.com_officeCode.value = win.document.getElementsByName("com_officeCode")[0].value;
	}
	if(win.document.getElementsByName("com_groupwareMail")[0] != null){
		document.formMail.com_groupwareMail.value = win.document.getElementsByName("com_groupwareMail")[0].value;
	}
	if(win.document.getElementsByName("com_templateMrd").length != 0){
		var rdExportFileName = "";
		var rdExportFileType = "";
		var templateMrd = "";
		var templateMrdArguments = "";
		
		for(i=0;i<win.document.getElementsByName("com_rdExportFileName").length;i++){
			rdExportFileName = rdExportFileName+win.document.getElementsByName("com_rdExportFileName")[i].value+";";
			rdExportFileType = rdExportFileType+win.document.getElementsByName("com_rdExportFileType")[i].value+";";
			templateMrd = templateMrd+win.document.getElementsByName("com_templateMrd")[i].value+";";
			templateMrdArguments = templateMrdArguments+win.document.getElementsByName("com_templateMrdArguments")[i].value+";";
		}
		document.formMail.com_rdExportFileName.value = rdExportFileName;
		document.formMail.com_rdExportFileType.value = rdExportFileType;
		document.formMail.com_templateMrd.value = templateMrd;
		document.formMail.com_templateMrdArguments.value = templateMrdArguments;
	}
	if(win.document.getElementsByName("com_templateMrdDescription")[0] != null){
		document.formMail.com_templateMrdDescription.value = win.document.getElementsByName("com_templateMrdDescription")[0].value;
	}
	if(win.document.getElementsByName("com_mailKeyFlag")[0] != null){
		document.formMail.com_mailKeyFlag.value = win.document.getElementsByName("com_mailKeyFlag")[0].value;
	}
}

function comMailKeyReturn(key){
	win.comMailKeyReturn(key);
}

function mailClose(){
	self.close();
}