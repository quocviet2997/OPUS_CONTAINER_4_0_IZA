/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : div_RD.js
*@FileTitle  : RD div sample page
*@author     : CLT
*@version    : 1.0
*@since      : 2015/01/22
=========================================================*/
document.onclick=processButtonClick;
function processButtonClick(){
	var formObject=document.form;
	try {
		var srcName=ComGetEvent("name");
        switch(srcName) {
        	case "directReportDownload":
        		var appendReport = [];
        		var mrdPath = RDServerIP + "/sample/rd/mrdSample/sample.mrd";
        		var mrdParam = RDServer + "/rp [X]";
        		appendReport.push({mrdPath:mrdPath,mrdParam:mrdParam});
        		appendReport.push({mrdPath:mrdPath,mrdParam:mrdParam});
        		directReportDownload(appendReport);
        		break;
        }
	}catch(e) {
		if( e == "[object Error]") {
			ComShowMessage(OBJECT_ERROR);
		} else {
			ComShowMessage(e);
		}
	}
}

function loadPage() {
	initRdConfig();
}

function initRdConfig(){
	viewer.openFile(RDServerIP + "/sample/rd/mrdSample/sample.mrd", RDServer + "/rp [X]");
} 