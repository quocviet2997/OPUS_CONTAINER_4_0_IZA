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
	var procCnt=0;
	document.onclick=processButtonClick;
	
	function setUploadObject(uploadObj) {
		uploadObjects[uploadCnt++]=uploadObj;
	}
	
	function loadPage() {
        //initUpload();
        initFilesUpload();
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
//				case "btn_Test_Filedelete": 
//					ComSetDisplay("btn_Test_Fileadd",true);
//		 			ComBtnEnable("btn_Test_Fileadd");
//		 			ComSetDisplay("btn_Test_Filedelete",false);
//		 			ComBtnDisable("btn_Test_Filedelete");
//		 			
//		 			while( fileList.firstChild ){
//						fileList.removeChild( fileList.firstChild );
//					}
//		 			var label	 = document.getElementById("files_upload").nextElementSibling;
//		 			label.innerHTML = '';
//                    break;
            } // end switch
    	}catch(e) {
    		if( e == "[object Error]") {
    			ComShowMessage(OBJECT_ERROR);
    		} else {
    			ComShowMessage(e.message);
    		}
    	}
    }
	
	
	function initFilesUpload(){
    	var filesUpload = document.getElementById("files_upload"),
    	dropArea = document.getElementById("drop-area"),
    	fileList = document.getElementById("file-list"),
//    	btnTestFileadd = document.getElementById("btn_Test_Fileadd"),
    	//labelVal = label.innerHTML,
    	label	 = filesUpload.nextElementSibling;
    	
//    	btnTestFileadd.addEventListener("click", function () {
//    		$("#files_upload").trigger('click');
//    	},false);
    	
    	filesUpload.addEventListener("change", function (e) {
    		var fileName = '';
    		if( this.files && this.files.length > 1 )
    			fileName = ( this.getAttribute( 'data-multiple-caption' ) || '' ).replace( '{count}', this.files.length );
    		else
    			fileName = e.target.value.split( '\\' ).pop();
    		
    		label.innerHTML = fileName;
//    		if( fileName )
//    			label.querySelector( 'span' ).innerHTML = fileName;
//    		else
//    			label.innerHTML = labelVal;
    		traverseFiles(this.files);
    	}, false);
    	 
    	dropArea.addEventListener("dragleave", function (evt) {
    		var target = evt.target;
    		 
    		if (target && target === dropArea) {
    			this.className = "";
    		}
    		evt.preventDefault();
    		evt.stopPropagation();
    	}, false);
    	 
    	dropArea.addEventListener("dragenter", function (evt) {
    		this.className = "over";
    		evt.preventDefault();
    		evt.stopPropagation();
    	}, false);
    	dropArea.addEventListener("dragover", function (evt) {
    		evt.preventDefault();
    		evt.stopPropagation();
    	}, false);
    	 
    	dropArea.addEventListener("drop", function (evt) {
    		traverseFiles(evt.dataTransfer.files);
    		this.className = "";
    		evt.preventDefault();
    		evt.stopPropagation();
    	}, false);    
    }
	
	function uploadFile (file) {
		var li = document.createElement("li"),
		div = document.createElement("div"),
		img,
		xhr,
		formData,
		result,
		fileList = document.getElementById("file-list");
		 
		//li.appendChild(div);
		 
		xhr = new XMLHttpRequest();
		 
		// File uploaded
		xhr.addEventListener("load", function () {
			result = JSON.parse(ComGetEtcData(xhr.responseText,'ibupSessionResult'));
			if(result.code==0){
				procCnt++;
				if(uploadCnt==procCnt) ComShowMessage(uploadCnt + " files done!!");
				
			} else {
				ComShowMessage("Upload Failed!");
				procCnt++;
				if(uploadCnt==procCnt) ComShowMessage(uploadCnt + " files done!!");
			}
			
		}, false);
		 
		xhr.open("post", "/opuscntr/FileUpload.do", true);
		 
		formData = new FormData();
		//formData.append("f_cmd", 102);
		formData.append("file", file);
		
		// Send the file
		//xhr.send(file);
		xhr.send(formData);
		
	}
	
	function traverseFiles (files) {
		uploadCnt = files.length;
		var fileList = document.getElementById("file-list");
		if (typeof files !== "undefined") {
			for (var i=0, l=files.length; i<l; i++) {
				uploadFile(files[i]);
			}
		}
	}
	
	// ibUpload 영역
//	function initUpload(){
//    	upload1.Initialize({
//			SaveUrl:'/opuscntr/FileUpload.do',
//			ShowButtonArea: true,
//			ShowInfoArea: true,
//			ExtraForm:'upLoadForm',
//			
//			AfterSaveStatus : function(result) {
//				var code = result.code;
//				ComUploadRemoveFile(upload1, "", true);
//				if(document.upLoadForm){
//					document.body.removeChild(document.upLoadForm);
//				}
//				var sXml = (new XMLSerializer()).serializeToString(result.xmlData);
//	      		if( code == 0) {
//	      			alert("Save Successfully!");
//	      			document.form.key.value = ComGetEtcData(sXml,"KEYS");
//	      		}else {
//					ComShowMessage(result.msg);
//				}
//			},			
//			BeforeSaveStatus : function(result) {
//			   return true;
//			},
//			AfterAddFile : function(result) {
//				 var files = upload1.GetList();
//			     var fileName=files[files.length-1].GetFileName();
//			     var serialNo = files[files.length-1].GetSerialNo();
//			},
//			BeforeAddFile : function(result){
//				var files = upload1.GetList();
//				return true;
//			},
//			AfterOnload : function() {
//		        upload1.SetCustomAddButtonAsID('btn_upload');
//			}
//		});
//    }
