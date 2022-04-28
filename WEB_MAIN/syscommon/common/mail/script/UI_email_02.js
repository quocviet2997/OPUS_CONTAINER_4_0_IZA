var userFileCnt=0; //사용자 파일 Cnt
var userAllFileAttachSize=0 //사용자 첨부 파일 총 크기.
var uploadObjects=new Array(); 
var uploadCnt=0;
//Email Address Validation (RFC-5322)
function checkData(){
	document.getElementsByName("com_from")[0].value = document.getElementsByName("com_from")[0].value.replace(/(\s*)(\n*)/gim, "");
	document.getElementsByName("com_recipient")[0].value = document.getElementsByName("com_recipient")[0].value.replace(/(\s*)(\n*)/gim, "");
	document.getElementsByName("com_carbonCopy")[0].value = document.getElementsByName("com_carbonCopy")[0].value.replace(/(\s*)(\n*)/gim, "");
	document.getElementsByName("com_blindCarbonCopy")[0].value = document.getElementsByName("com_blindCarbonCopy")[0].value.replace(/(\s*)(\n*)/gim, "");

	if(document.getElementsByName("com_from")[0].value == ""){
		ComShowMessage("Please insert a sender email");
		return false;
	} else if(!ComIsEmailAddr(document.getElementsByName("com_from")[0].value,/;|,/,1)) {
		ComShowMessage("Wrong sender email address format!");
		return false;
	}
	if(document.getElementsByName("com_recipient")[0].value == ""){
		ComShowMessage("Please Insert a recipient email");
		return false;
	} else if(!ComIsEmailAddr(document.getElementsByName("com_recipient")[0].value)) {
		ComShowMessage("Wrong recipient email address format!");
		return;
	}
	if(document.getElementsByName("com_carbonCopy")[0].value != ""){
		if(!ComIsEmailAddr(document.getElementsByName("com_carbonCopy")[0].value)) {
			ComShowMessage("Wrong CC email address format!");
			return;
		}
	}
	if(document.getElementsByName("com_blindCarbonCopy")[0].value != ""){
		if(!ComIsEmailAddr(document.getElementsByName("com_blindCarbonCopy")[0].value)) {
			ComShowMessage("Wrong BCC email address format!");
			return;
		}
	}
	if(document.getElementsByName("com_subject")[0].value == ""){
		ComShowMessage("Please Insert a subject");
		return false;
	}
	return true;
}
function doMail(){	
	if(checkData()){
		setReportFileThatWillAttachMail();
		setPreFileInfoThatWillAttachMail();
		doActionUpload();
	}
}
//끝에 있는 세미콜론 제거
function deleteEndSemicolon(sentence){
	if(sentence.length > 0){
		sentence=sentence.substr(0,sentence.length-1);
	}
	return sentence;
}
//Report 첨부 파일을 첨부한다.
function setReportFileThatWillAttachMail(){
	var reportForLoop=document.getElementsByName("com_reportForLoop");
	var aliveReportCheckBox="";
	for(var i=0;i < reportForLoop.length;i++){
		var chkBoxStatus=document.getElementById("reportFileCheckBox"+i).checked;
		if(chkBoxStatus == true){
			aliveReportCheckBox=aliveReportCheckBox+i+";";
		}
	}
	aliveReportCheckBox=deleteEndSemicolon(aliveReportCheckBox);
	var arrayAliveReportCheckBox=aliveReportCheckBox.split(";");
	//체크된 것들의 순서를 읽어서 해당 mrd 정보를 매핑한다.
	var arrayLineTemplateMrd="";
	var arrayLineTemplateMrdArguments="";
	var arrayLineExportFileName="";
	var arrayLineExportFileType="";
	for(var i=0;i < arrayAliveReportCheckBox.length;i++){
		var chkIdx=arrayAliveReportCheckBox[i];
		var mrdValue=document.getElementById("com_mrdPath"+chkIdx).value;
		arrayLineTemplateMrd=arrayLineTemplateMrd + mrdValue+";";
		var mrdParamValue=document.getElementById("com_mrdArguments"+chkIdx).value;
		arrayLineTemplateMrdArguments=arrayLineTemplateMrdArguments + mrdParamValue+";";
		var rdExportFileName=document.getElementById("com_rdExportFileName"+chkIdx).value;
		arrayLineExportFileName=arrayLineExportFileName + rdExportFileName+";";
		var rdExportFileType=document.getElementById("com_rdExportFileType"+chkIdx).value;
		arrayLineExportFileType=arrayLineExportFileType + rdExportFileType+";";
	}
	document.getElementById("com_templateMrd").value=arrayLineTemplateMrd;
	document.getElementById("com_templateMrdArguments").value=arrayLineTemplateMrdArguments;
	document.getElementById("com_rdExportFileName").value=arrayLineExportFileName;
	document.getElementById("com_rdExportFileType").value=arrayLineExportFileType;
}
//프로그램에서 미리 정의한 사용자 첨부 파일을 메일에 첨부한다.
function setPreFileInfoThatWillAttachMail(){
	var preFileForLoop=document.getElementById("com_PreFileForLoop").value;
	if(preFileForLoop == "" || preFileForLoop == " "){
		return;
	}
	preFileForLoop=preFileForLoop.substring(0, preFileForLoop.length-1);
	var arrayFileLoop=preFileForLoop.split(";");
	var preFullFileKeys="";
	for(var i=0;i < arrayFileLoop.length;i++){
		var preFileIndex=arrayFileLoop[i];
		var preFileKey=document.getElementById("fileInfoObj"+preFileIndex).value;
		preFullFileKeys=preFullFileKeys + preFileKey;
		preFullFileKeys=preFullFileKeys + ";";		
	}
	document.getElementById("com_fileKey").value=preFullFileKeys;
}
function checkKey(mailKey){
	if(mailKey==undefined){
		mailKey=document.getElementById("com_mailKey").value;
	}
	comMailKeyReturn(mailKey);
}
// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick=processButtonClick;
// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
 function processButtonClick()
 {
    var formObject=document.form;
 	try {
 		var srcName=ComGetEvent("name");
 		if(srcName==null) return false;
		switch(srcName) 
		{
			case "btn_Close":
				//parent.mailClose();
				mailClose();
				break;
			} // end switch
		if(srcName.length > 11 && srcName.substring(0, 11)=="btn_Delete_"){
			var idx=srcName.substring(11);
			var fileItem=document.getElementById("fileItem");
			var trs=fileItem.rows;
			for(var i=0; i<trs.length; i++){
				if(trs[i].id == "tr_" + idx){
					fileItem.deleteRow(i);
					break;
				}
			}
		} 
 	}catch(e) {
 		ComShowMessage(e.message);
 	}
 }

 //레포트를 미리보기 할때 특정 레포트의 값을 설정한다.
function setReportMeta(idx){
	document.getElementById("com_mrdPath").value=document.getElementById("com_mrdPath4Preview"+idx).value;
	document.getElementById("com_mrdArguments").value=document.getElementById("com_mrdArguments"+idx).value;
}
//체크 박스에 따라 pdf 첨부 파일 버튼을 활성화 하거나 비활성화 한다.
function changeStatusReportFileButton(idx){
	var chkBoxStatus=document.getElementById("reportFileCheckBox"+idx).status;
	if(chkBoxStatus == true){
		 document.getElementById("reportFileButton"+idx).disabled=false;
	} else{
		 document.getElementById("reportFileButton"+idx).disabled=true;
	}
}
//선택한 사용자 첨부 파일을 삭제한다.
function deleteUserAttachFile(idx){
	var files = upload1.GetList();
    var fileName=files[files.length-1].GetFileName();
    var serialNo = files[files.length-1].GetSerialNo();
	
	//여기서부터 html 요소 삭제하는 코드
	$("#userFileButton"+idx+"").remove();
	$("#userFileDelButton"+idx+"").remove();
	
	//여기서부터 파일 업로드 객체에 있는 파일 삭제
	for( var i = 0; i < files.length; i++) {
		if(document.getElementById("fileSerialNo"+idx).value == files[i].GetSerialNo()){
			upload1.RemoveOneFile(files[i].GetSerialNo());
		}
	}	
}
/**
 * It sets a Upload Object.
 * @param uploadObj
 * @return
 */
function setUploadObject(uploadObj){
	uploadObjects[uploadCnt++]=uploadObj;
}
/**
 * It loads a Upload Object.
 * @return
 */
function loadPage(){
	initUpload();
}

function initUpload(){
	upload1.Initialize({
		SaveUrl:'/opuscntr/MailGS.do',
		ShowButtonArea: true,
		ShowInfoArea: true,
		ExtraForm:'upLoadForm',
		AddSaveButton: function(ibup){
			
		},
		AfterSaveStatus : function(result) {
			ComOpenWait(false);
			var code = result.code;
			if(document.upLoadForm){
				document.body.removeChild(document.upLoadForm);
			}
      		if( code == 0) {
      			ComUploadRemoveFile(upload1, "", true);
      			var files = result.files;
      			var sXml = (new XMLSerializer()).serializeToString(result.xmlData);
      			var etcValue = ComGetEtcData(sXml, "mailKey");
      			checkKey(etcValue);
      		}else {
				ComShowMessage(result.msg);
			}
      		
      		mailClose();
		},			
		BeforeSaveStatus : function(result) {
		   return true;
		},
		AfterAddFile : function(result) {
			var files = upload1.GetList();
		    var fileName = files[files.length-1].GetFileName();
		    var serialNo = files[files.length-1].GetSerialNo();
			
		    //파일 선택 안했을 경우 체크
			if(serialNo == "" || fileName == ""){
				return
			}

			$("#btn_Attach").after("<input type=\"button\" id=\"userFileDelButton"+userFileCnt+"\" name=\"userFileDelButton"+userFileCnt+"\" value=\"Del\" onclick=\"deleteUserAttachFile("+userFileCnt+")\">");
			$("#btn_Attach").after("<input type=\"button\" id=\"userFileButton"+userFileCnt+"\" name=\"userFileButton"+userFileCnt+"\" value=\""+fileName+"\">");
			$("#btn_Attach").after("<input type=\"hidden\" id=\"fileSerialNo"+userFileCnt+"\" name=\"fileSerialNo"+userFileCnt+"\" value=\""+serialNo+"\">");
			
			userFileCnt=userFileCnt+1;
		},
		BeforeAddFile : function(result){
			return true;
		},
		AfterOnload : function() {
	          upload1.SetCustomAddButtonAsID('btn_Attach');
		}
	});
}

/**
 * It uploads a file.
 * @param sAction
 * @return
 */
function doActionUpload(){
	if (upload1.GetList().length == 0){
		form.method="post";
		form.action="/opuscntr/Mail.do";
		form.submit();
	} else{
		ComOpenWait(true);
		paramToForm(FormQueryString(document.form));
		upload1.SaveStatus();
		
		// AfterSaveStatus 기능이 작동하지 않아서 setTimeout 으로 처리
		//setTimeout( function() {
		//	mailClose();
		//}, 1000);
	}
}

/**
 * Delete a pre user File Object.
 * @param idx
 * @return
 */
function deletePreFileInfo(idx){
	var parentNode = document.getElementById("userAttachFile");
	var toRemoveInfoDelButton = document.getElementById("fileInfoDelButton"+idx);
	var toRemoveInfoButton = document.getElementById("fileInfo"+idx);
	var toRemoveInfoObject = document.getElementById("fileInfoObj"+idx);
	parentNode.removeChild(toRemoveInfoDelButton);
	parentNode.removeChild(toRemoveInfoButton);
	parentNode.removeChild(toRemoveInfoObject);	
	var preFileForLoop = document.getElementById("com_PreFileForLoop").value;
	var toDeleteIndex = preFileForLoop.indexOf(idx)
	document.getElementById("com_PreFileForLoop").value =preFileForLoop.substring(0,toDeleteIndex)+preFileForLoop.substring(toDeleteIndex+2);
}

function mailClose(){
	var com_mailKey = document.getElementById("com_mailKey").value;
	checkKey(com_mailKey);
	if(parent){
		$(parent.document).find(".layer_popup,.layer_popup_bg").remove();
	}
	if(opener){
		window.close();
	}
}

function comMailKeyReturn(key){
	if(opener != null){
		if(opener.comMailKeyReturn != null){
			opener.comMailKeyReturn(key);
		}
	}
}