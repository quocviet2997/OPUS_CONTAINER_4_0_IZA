<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="expires" content="0">
<link href="css/opus_contents.css" rel="stylesheet" type="text/css">
<script language="javascript" type="text/javascript" src="js/CoMessage.js"></script>
<script language="javascript" type="text/javascript" src="js/CoObject.js?version=U2"></script>
<script language="javascript" type="text/javascript" src="rpt/script/rdviewer50.js?version=312"></script>
<script language="JavaScript" type="text/javascript">
    function installSheetTag(){
	     try {
	        var sTag = "";
           sTag += '<OBJECT ID="sheet"  \n';
           sTag += ' CLASSID="'+CLSID_IBSHEET+'" \n';
           sTag += ' CODEBASE="'+CODEBASE+'"> \n';
	        sTag += '</OBJECT>';
	        document.write(sTag);
	     } catch(err) { ComFuncErrMsg(err.message); }
	 }
    function installComboTag(){
	     try {
	        var sTag = "";
           sTag += '<OBJECT id="ibCombo" \n';
           sTag += '        CLASSID="'+CLSID_IBMCOMBO+'" \n';
           sTag += '        CODEBASE="' + CODEBASECOMBO + '" > \n';
           sTag += '</OBJECT> \n';
	        document.write(sTag);
	     } catch(err) { ComFuncErrMsg(err.message); }
	 }
    function installTabTag(){
	     try {
	        var sTag = "";
           sTag += '<OBJECT id="ibtab" \n';
           sTag += '        CLASSID="'+CLSID_IBTAB+'" \n';
           sTag += '        CODEBASE="/opuscntr/sheet/IBTab.CAB#version='+ IBTAB_VERSION +'"> \n';
           sTag += '</OBJECT> \n';
	        document.write(sTag);
	     } catch(err) { ComFuncErrMsg(err.message); }
	 }
     function setupPage() {
		var obj = document.getElementById('sheet');
		if(obj.HeadBackColor != null) location.href = "/opuscntr/SignOn.do";
     }	
</script>
</head>
<body style="border: #7474C9 1px solid;" onload="setupPage()" >
<!-- OUTER - POPUP (S)tart -->
<table width="400" height="100%" cellpadding="10" border="0" align="center">
	<tr>
		<td class="top"></td>
	</tr>
	<tr>
		<td valign="middle"><!-- : ( Search Options ) (S) -->

		<table class="search">
			<tr>
				<td class="bg">
				<table class="search" border="0" style="width: 100%;">
					<tr class="h23">
						<td align="center"
							style="font-size: 14px; color: #0534AD; word-spacing: 4px; font-weight: bold; padding: 5 0 15 0">Currently
						installing IBSheet ..</td>
					</tr>
					<tr class="h23">
						<td style="padding: 0 0 10 0; color: #505151;">Click
						“install” on the pop-up browser to begin installation.</td>
					</tr>
					<tr class="h23">
						<td style="padding: 0 0 10 0; color: #505151;">
						<div><img src="./img/loading.gif" align="absmiddle" /></div>
						</td>
					</tr>
					<tr class="">
						<td style="padding: 0 0 15 0; color: #505151;">Note: if you
						installed and use Windows XP service Pack2, Please check the
						warning message from Explorer like below.</td>
					</tr>
					<tr class="h23">
						<td style="padding: 0 0 10 0; color: #505151;" >
						<div><img src="./img/object_install.gif" align="absmiddle"/></div>
						</td>
					</tr>
					<tr class="">
						<td style="padding: 0 0 15 0; color: #505151;">The installation should take from 1 minutes to 5 minutes depends on your connection speed.<br/><br/> 
						During or After Installation, if you have problem to use IBSheet on the system, Please contact your local system administrator.<br/><br/>
						Thanks for your kind cooperation.
						</td>
					</tr>
					<tr class="">
						<td style="padding: 0 0 15 0; color: #505151;">Download file for manually install<br>
						<a href="http://localhost:9001/opuscntr/sheet/IBSheetPro3.msi">http://localhost:9001/opuscntr/sheet/IBSheetPro3.msi</a><br>
						※ Please reload your browser by pressing "F5" once or twice 
						</td>
					</tr>
				</table>


				</td>
			</tr>
		</table>
		<!-- : ( Search Options ) (E) --></td>
	</tr>
</table>

<table class="height_5">
	<tr>
		<td></td>
	</tr>
</table>
<div id="base" style="display:none">
 <script language="javascript">installComboTag();</script>
 <script language="javascript">installTabTag();</script>
 <script language="javascript">comRdObjectPopup('rd');</script>
 <script language="javascript">comRdpdfObject();</script>
 <script language="javascript">installSheetTag();</script>
 </div>
</body>
</html>
