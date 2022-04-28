<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<html>
<head>
<title>Welcome to nis2010!</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<link href="/opuscntr/css/alps_menu.css" rel="stylesheet" type="text/css">
<link href="/opuscntr/css/alps_contents.css" rel="stylesheet" type="text/css">

<script language="javascript" src="/opuscntr/js/CoCommon.js"></script>
<script language="javascript" src="/opuscntr/js/CoCalendar.js"></script>
<script language="javascript" src="/opuscntr/js/CoObject.js"></script>
<script language="javascript" src="/opuscntr/js/IBSheetInfo.js"></script>
<script language="javascript" src="../script/UI_COM_fileupload.js"></script>

<script language="javascript">
    function setupPage(){

	    loadPage();
    }
</script>

<body  onLoad="setupPage();">
<form name="form">
<input type="hidden" name="f_cmd">

<table width="100%" border="0" cellpadding="0" cellspacing="0" style="padding-top:2;padding-left:5;">
	<tr><td valign="top">
	</td></tr>
	<tr><td valign="top">
	
		<!--Page Title, Historical (S)-->
		<table width="100%" border="0" cellpadding="0" cellspacing="0" class="title">
			<tr><td class="history"><img src="/opuscntr/img/icon_history_dot.gif" align="absmiddle">Common >> File Management</td></tr>
			<tr><td class="title"><img src="/opuscntr/img/icon_title_dot.gif" align="absmiddle">&nbsp;File Upload List</td></tr>
		</table>
		<!--Page Title, Historical (E)-->
		<!--Button (S) -->
		<table width="100%" class="button" border="0" cellpadding="0" cellspacing="0" style="padding-top:0;,padding-bottom:2;"> 
       	<tr><td class="btn1_bg">
		
		    <table border="0" cellpadding="0" cellspacing="0">
		    <tr><td><table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
					<tr><td class="btn1_left"></td>
					<td class="btn1" name="btn_Retrieve">Retrieve</td>
					<td class="btn1_right"></td>
					</tr>
				</table></td>
				<td class="btn1_line"></td>
				<td><table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
					<tr><td class="btn1_left"></td>
					<td class="btn1" name="btn_DownExcel">Down Excel</td>
					<td class="btn1_right"></td>
					</tr>
				</table></td>
				</tr>
			</table>
		</td></tr>
		</table>
    	<!--Button (E) -->	
	
		<!-- 1 (S) -->
		<table class="search" id="mainTable"> 
       		<tr><td class="bg">
			
				<!--  biz_1  (S) -->
				<table class="search" border="0" style="width:979;"> 
				<tr class="h23">
					<td width="80">Module</td>
					<td width="140" style="padding-left:2"><select style="width:100;" class="input">
						<option value="0"selected>ALL</option>
						<option value="1"></option>
						<option value="2"></option>
						<option value="3"></option>
						<option value="4"></option>
						</select></td>
					<td width="90">Request Date</td>
					<td width=""><input type="text" style="width:80" value=" yyyy-mm-dd">&nbsp;~&nbsp;<input type="text" style="width:80" value=" yyyy-mm-dd">&nbsp;<img class="cursor" src="/opuscntr/img/btns_calendar.gif" width="19" height="20" border="0" align="absmiddle"></td>
				</tr> 
				</table>	
				<table class="search" border="0" style="width:979;"> 
				<tr class="h23">
					<td width="80">File Save ID</td>
					<td width="140"><input type="text" style="width:100;" class="input" value=" "></td>
					<td width="92">User ID </td>
					<td width="230"><input type="text" style="width:178;" class="input" value=" "></td>
					<td width="70">Delete Fiag </td>
					<td width="" style="padding-left:4"><select style="width:60;" class="input">
						<option value="0"selected>ALL</option>
						<option value="1">Y</option>
						<option value="2">N</option>
						</select></td>
				</tr> 
				</table>				
				<!--  biz_1   (E) -->
			
				<table class="line_bluedot"><tr><td colspan="6"></td></tr></table>
				
				<!-- Grid (S) -->
				<table width="100%"  id="mainTable">
					<tr>
						<td width="100%">
							<script language="javascript">ComSheetObject('sheet1');</script>
						</td>
					</tr>
				</table>
				<!-- Grid (E) -->			
				
				
		</td></tr></table>
		<!-- 1 (E) -->	

		<!--biz page (E)-->

		<table class="height_10"><tr><td></td></tr></table>
	
	</td></tr>
		</table>

</form>
</body>
</html>