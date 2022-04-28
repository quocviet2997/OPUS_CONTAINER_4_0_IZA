<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product Version Info</title>
<script type="text/javascript" src="js/ibleaders.js"></script>
<script type="text/javascript" src="js/ibtab/ibmditab.js"></script>
<script type="text/javascript" src="js/ibtab/ibmditabinfo.js"></script>
<script type="text/javascript" src="js/ibsheet/ibsheet.js"></script>
<script type="text/javascript" src="js/ibcombo/ibmulticombo.js"></script>
<script type="text/javascript" src="js/ibcombo/ibmulticomboinfo.js"></script>
<script type="text/javascript" src="js/ibupload/ibupload.js"></script>
<script type="text/javascript" src="style/js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="js/ibsheet/ibsheetinfo.js"></script>
<script type="text/javascript" src="rpt/script/common_rd.js"></script>
<script>
function setVersion(){
	$("#sheetVersion").text(sheet.Version());
	$("#comboVersion").text(combo.Version());
	$("#tabVersion").text(tab.Version());
	$("#uploadVersion").text(upload.Version());
	$("#browserVersion").text(getBrowserVersion());
	$("#rdVersion").attr('src',ReportingServer.substring(0,ReportingServer.length-8));
}

function getBrowserVersion(){
	if (_os.indexOf("MSIE") != -1 || _os.indexOf("Trident") != -1) {
		return getIEVersion();
	}else{
		return getChromeVersion();
	}
}

function getChromeVersion(){
	return "Chrome "+_os.match(/.*Chrome\/([0-9\.]+)/)[1];
}

function getIEVersion(){
    var word;
    var version = "IE";
    var agent = navigator.userAgent.toLowerCase();
    var name = navigator.appName;
    // IE old version ( IE 10 or Lower )
    if (name === "Microsoft Internet Explorer" ) word = "msie ";
    else {
        if ( agent.search("trident") > -1 ) word = "trident/.*rv:";
        else if ( agent.search("edge/") > -1 ) word = "edge/";
    }
    var reg = new RegExp( word + "([0-9]{1,})(\\.{0,}[0-9]{0,1})" );
    if(reg.exec(agent)!=null) version = RegExp.$1 + RegExp.$2;
    return "Internet Explorer "+version;
}
</script>
</head>
<body onload="setVersion()">
<table>
		<tr><td bgcolor=#00abe6 width="500px" height=3></td></tr>
		<tr><td bgcolor=#150e44 width="500px" align=center><font face="Calibri" size=4 color="white">Browser Information</font></td></tr>
		<tr><td bgcolor=#00abe6 width="500px" height=3></td></tr>
	</table>
	<table style="font-family:Calibri">
		<tr>
			<td width="100px"><label>Version</label></td>
			<td width="12px"><label>:</label></td>
			<td><label id="browserVersion"></label></td>
		</tr>
	</table>
	<table>
		<tr><td bgcolor=#00abe6 width="500px" height=3></td></tr>
		<tr><td bgcolor=#150e44 width="500px" align=center><font face="Calibri" size=4 color="white">IBLeaders - Product Information</font></td></tr>
		<tr><td bgcolor=#00abe6 width="500px" height=3></td></tr>
	</table>
	<table style="font-family:Calibri">
		<tr>
			<td width="100px"><label>IBSheet</label></td>
			<td width="12px"><label>:</label></td>
			<td><label id="sheetVersion"></label></td>
		</tr>
		<tr>
			<td><label>IBCombo</label></td>
			<td><label>:</label></td>
			<td><label id="comboVersion"></label></td>
		</tr>
		<tr>
			<td><label>IBTab</label></td>
			<td><label>:</label></td>
			<td><label id="tabVersion"></label></td>
		</tr>
		<tr>
			<td><label>IBUpload</label></td>
			<td><label>:</label></td>
			<td><label id="uploadVersion"></label></td>
		</tr>
	</table>
	<iframe id="rdVersion" width="500px" height="150px" style="margin-left:0;border:0"></iframe>
	<div style="display:none">
		<script type="text/javascript">createIBSheet("sheet", "100%", "100%");</script>
		<script type="text/javascript">createIBMultiCombo("combo", "0px", "0px", 1);</script>
		<script type="text/javascript">createIBMDITab("tab", "0", "0");</script>
		<script type="text/javascript">createIBUpload('upload')</script>
	</div>
</html>