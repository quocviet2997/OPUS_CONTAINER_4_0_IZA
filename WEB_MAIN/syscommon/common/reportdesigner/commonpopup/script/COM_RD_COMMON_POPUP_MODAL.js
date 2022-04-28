/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_RD_COMMON_POPUP_MODAL.js
*@FileTitle  : COM_RD_COMMON_POPUP_MODAL
*@author     : CLT
*@version    : 1.0
*@since      : 2016/07/01
=========================================================*/
function rdOpen() {
	var mrdDisableToolbar = document.getElementById("com_mrdDisableToolbar").value;
	var mrdPaths = document.getElementById("com_mrdPath").value;
	var mrdParameters = document.getElementById("com_mrdArguments").value;
	var arrMrdPaths = mrdPaths.split(";");
	var arrMrdParameters = mrdParameters.split(";");
	var appendReport = [];
	
	
	if (mrdDisableToolbar !== "" && mrdDisableToolbar !== " " && mrdDisableToolbar !== "undefined" && mrdDisableToolbar !== "null") {
		var arrMrdHideToolbar = mrdDisableToolbar.split(";");
		viewer.hideToolbarItem(arrMrdHideToolbar);
	}
	for (i=0; i < arrMrdPaths.length; i++) {
		if(mrdPaths !== "" &&  mrdPaths !== " "){
			if (mrdParameters.indexOf("/rfn") != -1 || mrdParameters.indexOf("/rf") != -1) {
				appendReport.push({mrdPath:RD_path + arrMrdPaths[i], mrdParam:arrMrdParameters[i]});
			} else {
				var batchFlag = document.getElementById("com_isBatch").value;
				if (batchFlag == "Y") {
					appendReport.push({mrdPath:RD_path + arrMrdPaths[i], mrdParam: RDServerBAT + " " + arrMrdParameters[i]});
				} else {
					appendReport.push({mrdPath:RD_path + arrMrdPaths[i], mrdParam: RDServer + " " + arrMrdParameters[i]});
				}
			}
		}
	}
	viewer.openFile(appendReport, {timeout:1800});
}

/**
 * 
 * @return
 */
function setModalValues() {
	var win = window.dialogArguments;
	if (!win) win = window.opener;  //이 코드 추가할것
	if (!win) win = parent; //이 코드 추가할것
	
	var mrdPaths = win.document.getElementsByName("com_mrdPath")
	var mrdArguments = win.document.getElementsByName("com_mrdArguments")
	
	var docMrdPaths = "";
	var docMrdArguments = "";
	for(i=0;i < mrdPaths.length;i++){
		if(mrdPaths.length - 1 == i){
			docMrdPaths = docMrdPaths+mrdPaths[i].value;
			docMrdArguments = docMrdArguments+mrdArguments[i].value;
		}else{
			docMrdPaths = docMrdPaths+mrdPaths[i].value+";";
			docMrdArguments = docMrdArguments+mrdArguments[i].value+";";
		}
	}
	document.getElementById("com_mrdPath").value = docMrdPaths;
	document.getElementById("com_mrdArguments").value = docMrdArguments;
}