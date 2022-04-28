/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_RD_COMMON_POPUP.js
*@FileTitle  : COM_RD_COMMON_POPUP
*@author     : CLT
*@version    : 1.0
*@since      : 2016/07/01
=========================================================*/
function rdOpen() {
	var mrdDisableToolbar = document.getElementById("com_mrdDisableToolbar").value;
	var mrdPaths = document.getElementById("com_mrdPath").value;
	var mrdParameters = document.getElementById("com_mrdArguments").value;
	var arrMrdPaths=mrdPaths.split(";");
	var arrMrdParameters=mrdParameters.split(";");
	var appendReport = [];
	
	
	if (mrdDisableToolbar !== "" && mrdDisableToolbar !== " " && mrdDisableToolbar !== "undefined" && mrdDisableToolbar !== "null") {
		var arrMrdHideToolbar = mrdDisableToolbar.split(";");
		viewer.hideToolbarItem(arrMrdHideToolbar);
	}
	for (i=0; i < arrMrdPaths.length; i++) {
		var arrMrdParameter="";
		if(arrMrdParameters[i] != null){
			arrMrdParameter=arrMrdParameters[i];
		}
		if(mrdPaths !== "" &&  mrdPaths !== " "){
			if (mrdParameters.indexOf("/rfn") != -1 || mrdParameters.indexOf("/rf") != -1) {
				appendReport.push({mrdPath:RD_path + arrMrdPaths[i], mrdParam:arrMrdParameter});
			} else {
				var batchFlag = document.getElementById("com_isBatch").value;
				if (batchFlag == "Y") {
					appendReport.push({mrdPath:RD_path + arrMrdPaths[i], mrdParam: RDServerBAT + " " + arrMrdParameter});
				} else {
					appendReport.push({mrdPath:RD_path + arrMrdPaths[i], mrdParam: RDServer + " " + arrMrdParameter});
				}
			}
		}
		viewer.openFile(appendReport, {timeout:1800});
	}
}