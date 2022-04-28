/*=========================================================
*Copyright(c) 2015 CyberLogitec. All Rights Reserved.
*@FileName 	 : fileupload.js
*@FileTitle  : Sample FileUpload
*@author     : CLT
*@version    : 1.0
*@since      : 2015/01/19
=========================================================*/
    var uploadObjects=new Array();
	var uploadCnt=0;
	document.onclick=processButtonClick;
	
	function setUploadObject(uploadObj) {
		uploadObjects[uploadCnt++]=uploadObj;
	}
	
	function loadPage() {
        initUpload();
    }

	//버튼 클릭 이벤트 처리
	// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
	function processButtonClick(){
        var formObject=document.form;
        
    	try {
    		var srcName=ComGetEvent("name");
    		if(ComGetBtnDisable(srcName)) return false;
            switch(srcName) {
            	case "btn_save":
					var sParam = FormQueryString(document.form)
					paramToForm(sParam)
	 				upload1.SaveStatus();
					break; 
				case "btn_FileDown":
					parent.location.href="/opuscntr/FileDownload?key="+document.form.key.value;
					break;
            } // end switch
    	}catch(e) {
    		if( e == "[object Error]") {
    			ComShowMessage(OBJECT_ERROR);
    		} else {
    			ComShowMessage(e.message);
    		}
    	}
    }
	
	// ibUpload 영역
	function initUpload(){
    	upload1.Initialize({
			SaveUrl:'/opuscntr/FileUpload.do',
			ShowButtonArea: true,
			ShowInfoArea: true,
			ExtraForm:'upLoadForm',
			
			AfterSaveStatus : function(result) {
				var code = result.code;
				ComUploadRemoveFile(upload1, "", true);
				if(document.upLoadForm){
					document.body.removeChild(document.upLoadForm);
				}
				var sXml = (new XMLSerializer()).serializeToString(result.xmlData);
	      		if( code == 0) {
	      			alert("Save Successfully!");
	      			document.form.key.value = ComGetEtcData(sXml,"KEYS");
	      		}else {
					ComShowMessage(result.msg);
				}
			},			
			BeforeSaveStatus : function(result) {
			   return true;
			},
			AfterAddFile : function(result) {
				 var files = upload1.GetList();
			     var fileName=files[files.length-1].GetFileName();
			     var serialNo = files[files.length-1].GetSerialNo();
			},
			BeforeAddFile : function(result){
				var files = upload1.GetList();
				return true;
			},
			AfterOnload : function() {
		        upload1.SetCustomAddButtonAsID('btn_upload');
			}
		});
    }
