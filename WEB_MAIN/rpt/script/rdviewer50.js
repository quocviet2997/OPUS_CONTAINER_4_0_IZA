//각 서버정보에 맞게 수정해야 하는 부분

var RDServer   = "/rfn [http://10.82.175.62:7510/DataServer/rdagent.jsp] /rsn [jdbc/CNTRDEV] /ruseurlmoniker [0] /rlobopt [1] /roldarithop ";  //RDServer RDAgnet url
var RDServerBAT = "/rfn [http://10.82.175.62:7510/DataServer/rdagent.jsp] /rsn [jdbc/CNTRDEV] /ruseurlmoniker [0] /rlobopt [1] /roldarithop "; //Batch Connection Pool
var RD_path = "http://" + location.host + "/opuscntr/"; // Report file 위치
var URL = RD_path + "rpt/cab/"; // report 컴포넌트 다운로드 위치
var RdReport = "/opuscntr/rdReport.do"; // popup 으로 rd를 호출하는 공통 파일
var RDServerIP = "http://" + location.host + "/opuscntr"; // File 이용시 Server
               // IP 공통 사용.

var jars = URL + "applet/javard.jar";
var jarpath = URL + "applet/lib/";

var _os = navigator.userAgent;
var _app = navigator.appName;

// alert("RDServer: " + RDServer);
// alert("RD_path: " + RD_path);
// alert("URL: " + URL);
// alert("RdReport: " + RdReport);

// var parmModalObj = win	dow.dialogArguments; // modal 로 넘겨준 param 정보
var parmModalObj;
if (parent.parmObj != undefined) {
	parmModalObj = parent.parmObj;
} else {
	parmModalObj = window.dialogArguments;
}

function checkPluginVersion(versionInstalled, versionSetup) {

 var arr_versionInstalled = versionInstalled.split(",");
 var arr_versionSetup = versionSetup.split(",");

 for (i = 0; i <= 3; i++) {

  if (Number(arr_versionInstalled[i]) > Number(arr_versionSetup[i])) { // do
                    // not
                    // install
   return 1;
   break;
  } else if (Number(arr_versionInstalled[i]) < Number(arr_versionSetup[i])) { // install
   return 0;
   break;
  }
 }
 return 1;
}

function comRdObject(id) {
 if (_os.indexOf("Linux") != -1 || _os.indexOf("Macintosh") != -1) {

  document.write('<object id="'+ id + '" type="application/x-java-applet" style="position: absolute; width:100%; height:100%;" >');
  document.write('<param name="codebase" value="javard.jar" >');
  document.write('<param name="archive"  value="' + jars + '" >');
  document.write('<param name="code"     value="m2soft.javard.gui.RDApplet" >');
  document.write('<param name="Java_archive" value="' + jars + '" />');
  document.write('<param name="jar_path" value="' + jarpath + '" />');
  document.write('<param name="separate_jvm" value="true" />');
  document.write('<param name="mrd.charset" value="UTF-16LE" />'); // ansi용은 MS949 , unicode용은 UTF-16LE
  document.write('<param name="txt.charset" value="UTF-16LE" />');
  document.write('<param name="locale" value="en_US" />');
  document.write('<param name="java_arguments" value="-Xmx1000m" />');
  document.write('Your browser needs <a href="http://www.oracle.com/technetwork/java/javase/downloads/index.html">Java SE</a> to view projects.');
  document.write('</object>');

 } else {
  if (_os.indexOf("MSIE") != -1 || _os.indexOf("Trident") != -1) {
   if (navigator.appName.indexOf("Microsoft") != -1 && navigator.appVersion.indexOf("x64") != -1) {
    // alert("64bit");
    document.write('<OBJECT id="' + id + '"');
    document.write('  classid="clsid:04931AA4-5D13-442f-AEE8-0F1184002BDD"');
    // document.write('
    // codebase="/opuscntr/rpt/cab/cxviewer60u.cab#version=6,2,3,128"');
    document.write('  codebase="' + URL + '/cxviewer60u.cab#version=6,2,3,128"');
    document.write('   width="100%" height="100%">');
    document.write('</OBJECT>');
   } else {
    // alert("32bit");
    document.write('<OBJECT id="' + id + '"');
    document.write('  classid="clsid:04931AA4-5D13-442f-AEE8-0F1184002BDD"');
    // document.write('
    // codebase="/opuscntr/rpt/cab/cxviewer60u.cab#version=6,2,3,128"');
    document.write('  codebase="' + URL + '/cxviewer60u.cab#version=6,2,3,128"');
    document.write('   width="100%" height="100%">');
    document.write('</OBJECT>');
   }
  } else {
   navigator.plugins.refresh(false);
   if (navigator.mimeTypes["application/x-cxviewer60u"]) {
    var _cxPlugin = navigator.mimeTypes["application/x-cxviewer60u"];
    var cxPluginVersion_installed = _cxPlugin.description.substr(
      _cxPlugin.description.indexOf("version=") + 8, 9);
    var cxPluginVersion_setup = "6,2,3,128";

    if (checkPluginVersion(cxPluginVersion_installed,
      cxPluginVersion_setup)) {
     document.write('<EMBED id="'+ id + '" type="application/x-cxviewer60u" width="100%" height="100%"></EMBED>');
    } else {
     ComShowCodeMessage("COM132801");
     window.location = URL + "CX60_Plugin_u_setup.exe";
    }
   } else {
	ComShowCodeMessage("COM132801");
    window.location = URL + "CX60_Plugin_u_setup.exe";
   }
  }

  //Added by Publisher (Gabin Kim)
  $('#'+id).parents("form,body").css("height","100%");
 }

 // PDF 용 Active-X Loading
 comRdpdfObject();

 setrdObject(eval("document.all." + id));

 /*
  * document.write('<OBJECT id="'+ id + '"'); document.write('
  * classid="clsid:5A7B56B3-603D-4953-9909-1247D41967F8"'); document.write('
  * codebase="/hanjin/rpt/cab/rdviewer50u.cab#version=5,0,0,159"');
  * document.write(' width="100%" height="100%">'); document.write('</OBJECT>');
  */
}

function comRdObjectPopup(id) {
 if (_os.indexOf("Linux") != -1 || _os.indexOf("Macintosh") != -1) {

  document.write('<object id="'+ id + '" type="application/x-java-applet" style="position: absolute; width:100%; height:100%;" >');
  document.write('<param name="codebase" value="javard.jar" >');
  document.write('<param name="archive"  value="' + jars + '" >');
  document.write('<param name="code"     value="m2soft.javard.gui.RDApplet" >');
  document.write('<param name="Java_archive" value="' + jars + '" />');
  document.write('<param name="jar_path" value="' + jarpath + '" />');
  document.write('<param name="separate_jvm" value="true" />');
  document.write('<param name="mrd.charset" value="MS949" />');
  document.write('<param name="txt.charset" value="MS949" />');
  document.write('<param name="locale" value="en_US" />');
  document.write('<param name="java_arguments" value="-Xmx1000m" />');
  document.write('Your browser needs <a href="http://www.oracle.com/technetwork/java/javase/downloads/index.html">Java SE</a> to view projects.');
  document.write('</object>');

 } else {
  if (_os.indexOf("MSIE") != -1 || _os.indexOf("Trident") != -1) {
   if (navigator.appName.indexOf("Microsoft") != -1 && navigator.appVersion.indexOf("x64") != -1) {
    // alert("64bit");
    document.write('<OBJECT id="' + id + '"');
    document.write('  classid="clsid:04931AA4-5D13-442f-AEE8-0F1184002BDD"');
    // document.write('
    // codebase="/opuscntr/rpt/cab/cxviewer60u.cab#version=6,2,3,128"');
    document.write('  codebase="' + URL + '/cxviewer60u.cab#version=6,2,3,128"');
    document.write('   width="100%" height="100%">');
    document.write('</OBJECT>');
   } else {
    // alert("32bit");
    document.write('<OBJECT id="' + id + '"');
    document.write('  classid="clsid:04931AA4-5D13-442f-AEE8-0F1184002BDD"');
    // document.write('
    // codebase="/opuscntr/rpt/cab/cxviewer60u.cab#version=6,2,3,128"');
    document.write('  codebase="' + URL + '/cxviewer60u.cab#version=6,2,3,128"');
    document.write('   width="100%" height="100%">');
    document.write('</OBJECT>');
   }
  } else {
   navigator.plugins.refresh(false);
   if (navigator.mimeTypes["application/x-cxviewer60u"]) {
    var _cxPlugin = navigator.mimeTypes["application/x-cxviewer60u"];
    var cxPluginVersion_installed = _cxPlugin.description.substr(
      _cxPlugin.description.indexOf("version=") + 8, 9);
    var cxPluginVersion_setup = "6,2,3,128";

    if (checkPluginVersion(cxPluginVersion_installed,
      cxPluginVersion_setup)) {
     document.write('<EMBED id="' + id + '" type="application/x-cxviewer60u" width="100%" height="100%"></EMBED>');
    } else {
     ComShowCodeMessage("COM132801");
     window.location = URL + "CX60_Plugin_u_setup.exe";
    }
   } else {
	ComShowCodeMessage("COM132801");
    window.location = URL + "CX60_Plugin_u_setup.exe";
   }
  }
 }
}

function comTChartObject() {
 document.write('<object ');
 document.write('   width=0%');
 document.write('   height=0%');
 document.write('   classid="CLSID:FAB9B41C-87D6-474D-AB7E-F07D78F2422E"');
 document.write('  codebase="' + URL + '/teechart7.cab#version=7,0,1,4">');
 document.write('</object>');
}

function comRdpdfObject() {
 document.write('<object');
 //document.write(' id=rdpdf50');
 document.write('   classid="clsid:0D0862D3-F678-48B5-876B-456457E668BC"');
 document.write('   width=0%');
 document.write('   height=0%');
 document.write('   codebase="' + URL + '/rdpdf50.cab#version=2,2,0,82">');
 document.write('</OBJECT>');
}

function comRdbarcodeObject() {
 document.write('<object');
 // document.write(' id=rdbarcode10');
 document.write('   classid="clsid:C1829AD9-98E1-4050-A3E5-B7B089C6FFFA"');
 document.write('   width=0%');
 document.write('   height=0%');
 document.write('   codebase="' + URL
   + '/rdbarcode10.cab#version=10,2,6,13785">');
 document.write(' </object>');
}

// 폼태그의 모든 컨트롤 데이타를 name[value] 포맷으로 가져오기
function RD_FormQueryString(form, no) {

 if (typeof form != "object" || form.tagName != "FORM") {
  alert("FormQueryString function's parameter is not a FORM tag");
  return "";
 }

 var name = new Array(form.elements.length);
 var value = new Array(form.elements.length);
 var j = 0;
 var plain_text = "";

 // 사용가능한 컨트롤을 배열로 생성한다.
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
   if (form.elements[i].checked == true) {
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

 // QueryString을 조합한다.
 for (i = 0; i < j; i++) {
  if (name[i] != '')
   plain_text += "frm" + no + "_" + name[i] + "[" + value[i] + "] ";
 }

 // 마지막에 &를 없애기 위함
 if (plain_text != "")
  plain_text = plain_text.substr(0, plain_text.length - 1);
 return plain_text;
}

function IBS_getName(obj) {
 if (obj.name != "") {
  return obj.name;
 } else if (obj.id != "") {
  return obj.id;
 } else {
  return "";
 }
}
// Sheet 에서 xml data 가져오기
function RD_GetDataSearchXml(sheet_obj, no) {

 // 함수 인자 유효성 확인
 if ((!sheet_obj) || (!sheet_obj.IBSheetVersion)) {
  alert("sheet_obj parameter is not a IBSheet in the IBS_GetDataSearchXml Function.");
  return "";
 }

 var rowXml = "";
 var allXml = "<SHEET" + no + ">  <DATA TOTAL='" + sheet_obj.GetTotalRows()
   + "'>";

 var rowcount = sheet_obj.RowCount() + sheet_obj.HeaderRows() - 1;
 for (ir = sheet_obj.HeaderRows(); ir <= rowcount; ir++) {
  rowXml = "<TR>";
  for (ic = 0; ic <= sheet_obj.LastCol(); ic++) {
   rowXml += "<TD><![CDATA[" + sheet_obj.GetCellValue(ir, ic)
     + "]]></TD>";
  }
  rowXml += "</TR>";

  allXml += rowXml;
 }

 allXml += "  </DATA></SHEET" + no + ">";

 return allXml;
}

function setrdObject(rd_obj) {
 rdObjects[rdCnt++] = rd_obj;
}

/**
 * Report 모달창을 화면의 중앙에 활성화 한다.
 */
function rdObjModal(sURL, parmObj, sWidth, sHeight) {
 // preSet
 parmObj['FORM'] = document.form;

 var height = screen.height;
 var width = screen.width;
 var leftpos = width / 2 - sWidth / 2;
 var toppos = height / 2 - sHeight / 2;

 if (leftpos < 0)
  leftpos = 0;

 if (toppos < 0)
  toppos = 0;

 var sFeatures = new Array();

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

  _CallPopUpRD(sURL, parmObj, sFeatures);
 }

}

/**
 * Report modaless창을 화면의 중앙에 활성화 한다.
 */
function rdObjModaless(sURL, parmObj, sWidth, sHeight) {
 // preSet
 parmObj['FORM'] = document.form;

 var height = screen.height;
 var width = screen.width;
 var leftpos = width / 2 - sWidth / 2;
 var toppos = height / 2 - sHeight / 2;

 if (leftpos < 0)
  leftpos = 0;

 if (toppos < 0)
  toppos = 0;

 var sFeatures = new Array();

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

  _CallPopUpRD(sURL, parmObj, sFeatures);
 }

}


