/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : common_rd.js (IZANAGI TEST)
*@FileTitle  : Common RD param & function define
*@author     : CLT
*@version    : 1.0
*@since      : 2016/11/30
=========================================================*/

var RDServer = "/rfn [http://10.82.175.103:9090/DataServer/rdagent.jsp] /rsn [jdbc/CSCNTRT] ";
var RDServerBAT = "/rfn [http://10.82.175.103:9090/DataServer/rdagent.jsp] /rsn [jdbc/CSCNTRT] ";
var ReportingServer = "http://10.82.175.103:8080/ReportingServer/service";
var RD_path = "http://" + location.host + "/opuscntr/";
var RdReport = "/opuscntr/rdReport.do";
var RDServerIP = "http://" + location.host + "/opuscntr";
var parmModalObj;

var viewer;
var _os = navigator.userAgent;

if (parent.parmObj !== undefined) {
	parmModalObj = parent.parmObj;
} else {
	parmModalObj = window.dialogArguments;
}

function rdViewerObject(){
	var hideItem = ["hwp","inquery"];
	document.write('<div id="report" style="position: absolute; width:100%; height:100%;" ></div>');
	m2soft.crownix.Layout.setTheme({
		toolbarColor: '#27415D',
	});
	m2soft.crownix.Resource.setLanguage('en');
	viewer = new m2soft.crownix.Viewer(ReportingServer, "report");
	viewer.hideToolbarItem(hideItem);
}

function RD_FormQueryString(form, no) {
	if (typeof form != "object" || form.tagName != "FORM") {
		 alert("FormQueryString function's parameter is not a FORM tag");
		 return "";
}

var name = new Array(form.elements.length);
var value = new Array(form.elements.length);
var j = 0;
var plain_text = "";

len = form.elements.length;
for (i = 0; i < len; i++) {
	var prev_j = j;
	
	switch (form.elements[i].type) {
	case undefined:
	case "button":
	case "reset":
	case "submit":
		break;
	case "radio":
	case "checkbox":
		if (form.elements[i].checked === true) {
			name[j] = IBS_getName(form.elements[i]);
			value[j] = form.elements[i].value;
			j++;
		}
		break;
	case "select-one":
		name[j] = IBS_getName(form.elements[i]);
		var ind = form.elements[i].selectedIndex;
		if (ind >= 0) {

			value[j] = form.elements[i].options[ind].value;

		} else {
			value[j] = "";
		}
		j++;
		break;
	case "select-multiple":
		name[j] = IBS_getName(form.elements[i]);
		var llen = form.elements[i].length;
		var increased = 0;
		for (k = 0; k < llen; k++) {
			if (form.elements[i].options[k].selected) {
				name[j] = IBS_getName(form.elements[i]);
				value[j] = form.elements[i].options[k].value;
				j++;
				increased++;
			}
		}
		if (increased > 0) {
			j--;
		} else {
			value[j] = "";
		}
		j++;
		break;
	default:
		name[j] = IBS_getName(form.elements[i]);
		value[j] = form.elements[i].value;
		j++;
	}
}

for (i = 0; i < j; i++) {
	if (name[i] !== ''){
		plain_text += "frm" + no + "_" + name[i] + "[" + value[i] + "] ";
	}
}

if (plain_text !== "")
	plain_text = plain_text.substr(0, plain_text.length - 1);
	return plain_text;
}

function RD_GetDataSearchXml(sheet_obj, no) {

	if ((!sheet_obj) || (!sheet_obj.IBSheetVersion)) {
		alert("sheet_obj parameter is not a IBSheet in the IBS_GetDataSearchXml Function.");
		return "";
	}

	var rowXml = "";
	var allXml = "<SHEET" + no + ">  <DATA TOTAL='" + sheet_obj.GetTotalRows() + "'>";
	var rowcount = sheet_obj.RowCount() + sheet_obj.HeaderRows() - 1;

	for (ir = sheet_obj.HeaderRows(); ir <= rowcount; ir++) {
		rowXml = "<TR>";
		for (ic = 0; ic <= sheet_obj.LastCol(); ic++) {
			rowXml += "<TD><![CDATA[" + sheet_obj.GetCellValue(ir, ic) + "]]></TD>";
		}
		rowXml += "</TR>";
		allXml += rowXml;
	}
	allXml += "  </DATA></SHEET" + no + ">";

	return allXml;
}

function rdObjModal(sURL, parmObj, sWidth, sHeight) {
	parmObj.FORM = document.form;
	
	var height = screen.height;
	var width = screen.width;
	var leftpos = width / 2 - sWidth / 2;
	var toppos = height / 2 - sHeight / 2;

	if (leftpos < 0)
		leftpos = 0;

	if (toppos < 0)
		toppos = 0;

	var sFeatures = [];
	sFeatures[0] = (sWidth > 0) ? "dialogWidth:" + sWidth + "px" : "dialgWidth:300px";
	sFeatures[1] = (sHeight > 0) ? "dialogHeight:" + sHeight + "px" : "dialogHeight:300px";
	sFeatures[2] = (toppos > 0) ? "dialogTop:" + toppos + "px" : "";
	sFeatures[3] = (leftpos > 0) ? "dialogLeft:" + leftpos + "px" : "";
	sFeatures[4] = (!toppos && !leftpos) ? "center:Yes" : "";
	sFeatures[5] = "resizeable:No";
	sFeatures[6] = "help:No";
	sFeatures[7] = "status:No";
	sFeatures[8] = "center:Yes;";
	sFeatures = sFeatures.join(";");

	if (_os.indexOf("MSIE") != -1 || _os.indexOf("Trident") != -1) {
		window.showModalDialog(sURL, parmObj, sFeatures);
	} else {
		_CallPopUpRD(sURL, parmObj, sFeatures);
	}
}

function rdObjModaless(sURL, parmObj, sWidth, sHeight) {
	parmObj.FORM = document.form;

	var height = screen.height;
	var width = screen.width;
	var leftpos = width / 2 - sWidth / 2;
	var toppos = height / 2 - sHeight / 2;

	if (leftpos < 0)
		leftpos = 0;

	if (toppos < 0)
		toppos = 0;

	var sFeatures = [];
	sFeatures[0] = (sWidth > 0) ? "dialogWidth:" + sWidth + "px" : "dialgWidth:300px";
	sFeatures[1] = (sHeight > 0) ? "dialogHeight:" + sHeight + "px" : "dialogHeight:300px";
	sFeatures[2] = (toppos > 0) ? "dialogTop:" + toppos + "px" : "";
	sFeatures[3] = (leftpos > 0) ? "dialogLeft:" + leftpos + "px" : "";
	sFeatures[4] = (!toppos && !leftpos) ? "center:Yes" : "";
	sFeatures[5] = "resizeable:No";
	sFeatures[6] = "help:No";
	sFeatures[7] = "status:No";
	sFeatures[8] = "center:Yes;";
	sFeatures = sFeatures.join(";");

	if (_os.indexOf("MSIE") != -1 || _os.indexOf("Trident") != -1) {
		window.showModelessDialog(sURL, parmObj, sFeatures);
	} else {
		 var myWin = window.open(sURL, " ", "width="+sWidth+","+"height="+sHeight); 
		 myWin.parmObj = parmObj;
	}
}

/**
 * @param appendReport
 * @param fileName default:currentdate
 * @param fileType default:pdf
 * Direct File download without viewing on RD viewer.
 */
function directReportDownload(appendReport, fileName, fileType){
	ComOpenWait(true);
	var downloadFileName = new Date().toISOString().slice(0,10).replace(/-/g,"")
							+ new Date().getTime();
	var downloadFileType = "pdf";
	var mrdPath= "";
	var mrdParam = "";
	var data = "";
	for(var i = 0; i<appendReport.length; i++){
		if(i < appendReport.length - 1){
			mrdPath += encodeURIComponent(appendReport[i].mrdPath)+"%04";
			mrdParam += encodeURIComponent(appendReport[i].mrdParam)+"%04";
		}else{
			mrdPath += encodeURIComponent(appendReport[i].mrdPath);
			mrdParam += encodeURIComponent(appendReport[i].mrdParam);
		}
	}
	
	if(fileName !== undefined)	downloadFileName = fileName;
	if(fileType !== undefined)	downloadFileType = fileType;
	
	data ="mrd_path=" + mrdPath + "&mrd_param=" + mrdParam + "&service_url=" + ReportingServer;
	var xhr = new XMLHttpRequest();
	xhr.open('POST', '/opuscntr/rpt/jsp/DirectReportDownload.jsp', true);
    xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    xhr.responseType = 'arraybuffer';
    xhr.onload = function(e) {
        if (this.status == 200) {
          var blob = new Blob([this.response]);
          if (_os.indexOf("MSIE") != -1 || _os.indexOf("Trident") != -1) {
                  navigator.msSaveOrOpenBlob(blob, downloadFileName + "." + downloadFileType);
                } else {
                        var link=document.createElement('a');
                        link.href = window.URL.createObjectURL(blob);
                        link.download = downloadFileName + "." + downloadFileType;
                        link.click();
                }
       }
       if (this.status == 500) {
           alert("Report Export Failed");
       }
       ComOpenWait(false);
    };
    xhr.send(data);
}