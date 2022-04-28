/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : UI_Fileupload_01.js
*@FileTitle  : File UpLoad common
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/21
=========================================================*/

var uploadObjects = new Array(); 
var uploadCnt=0;

document.onclick = processButtonClick

/**
 * It sets a Upload Object.
 * @param uploadObj
 * @return
 */
function setUploadObject(uploadObj){
	uploadObjects[uploadCnt++] = uploadObj;
}

/**
 * It loads a Upload Object.
 * @return
 */
function loadPage(){
	for(var i=0;i<uploadObjects.length;i++){
		//popupConfigUpload(uploadObjects[i],"/opuscntr/FileUpload.do");
	}	
	initUpload();
}

function initUpload(){
	var comFileMaxCount = document.getElementById("comFileMaxCount").value;
	var maxFileSize = document.getElementById("maxFileSize").value/1000;
	
		upload1.Initialize({
			SaveUrl:'/opuscntr/FileUpload.do',
			ExtraForm:"form",
			Files:[
				
			],
			LimitFileCount: comFileMaxCount,
			// 파일사이즈 제한
			BeforeSaveStatus : function(result) {
//				result.AddGetParam("subSysCd","COM");
				return true;
			}
			,AfterSaveStatus : function(result) {
				var sXml = result.xmlData;
				var etcValue = ComGetEtcData(sXml, "KEYS");
				if(etcValue != undefined){
					if(document.getElementById("flag").value == "1"){
						window.returnValue = etcValue+"<>"+upObj.LocalFiles;
					} else{
						window.returnValue = etcValue;
					}
				} else{
					window.returnValue = sXml;
				}
				window.close();
			}
 			,AfterAddFile:function(){
				//upload1.SaveStatus();
 			}
		});
	}

/**
 * It configures a popup Upload.
 * @param uploadObj
 * @param sPageUrl
 * @return
 */
function popupConfigUpload(uploadObj, sPageUrl){
	
	var comFileMaxCount = document.getElementById("comFileMaxCount").value;
	var maxFileSize = document.getElementById("maxFileSize").value/1000;
	
    try {
    	ComConfigUpload(uploadObj, sPageUrl);
		uploadObj.ViewIcon("DETAIL");
		
		uploadObj.SetLimit(comFileMaxCount, maxFileSize, maxFileSize);
    } catch(err) { ComFuncErrMsg(err.message); }
}

/**
 * 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 
 * @return
 */
function processButtonClick(){ 
	
	var srcName = window.event.srcElement.getAttribute("name"); 
	switch(srcName) {  
		case "btn2_Upload_File": 
			doActionUpload();
			break;
		case "btn2_Add_File":
			addFile();
			break;
		case "btn_close":
			ComClosePopup(); 
			break;
	}
}

/**
 * It uploads a file.
 * @param sAction
 * @return
 */
function doActionUpload(sAction){
	var upObj = uploadObjects[0];
	paramToForm(FormQueryStringEnc(document.form, upObj));
	upload1.SaveStatus();
}

/**
 * It adds a file to IBUpload.
 * @return
 */
function addFile(){
	var info = null;
	upload1.AddFile();
}
