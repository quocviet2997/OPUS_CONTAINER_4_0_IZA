<%@ page import="com.clt.framework.component.util.StringUtil" %>
<html>
<head>
<title>Welcome to enis!</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script language="javascript" src="MultiSort.js"></script>
<script language="javascript" src="/opuscntr/script/IBSheetConfig.js"></script>
<script language="javascript" src="/opuscntr/script/IBChart.js"></script>
<script language="javascript" src="/opuscntr/script/IBSheetInfo.js"></script>
<script>
function setUpPage() {
	document.form.sheetId.value = "<%=StringUtil.xssFilter(request.getParameter("sheetId"))%>";
	setColumnListBox();
}
</script>
</head>

<!-- link href="/opuscntr/css/enis_contents.css" rel="stylesheet" type="text/css"-->
<body onload="javascript:setUpPage();"> 
<form name="form">
<input type="hidden" name="sheetId">

<!-- OUTER - POPUP (S)tart -->
<table width="400" class="popup" cellpadding="10"> 
<tr><td class="top"></td></tr>
<tr><td valign="top">
	
		<!-- : ( Title ) (S) -->
		<table width="380" border="0">
		<tr><td height="79" class="title"><img src="/opuscntr/img/enis/ico_t1.gif" width="20" height="12">Multi Sort</td></tr>
		</table>
		<!-- : ( Title ) (E) -->
		
		<!-- TABLE '#D' : ( Button : Main ) (S) -->
		<table width="100%" class="button"> 
       	<tr><td class="align">

		   <table class="button"> 
			<tr><td><img class="cursor" src="/opuscntr/img/enis/button/btn_add.gif" width="66" height="20" border="0" name="btn_add"></td>
				<td><img class="cursor" src="/opuscntr/img/enis/button/btn_new.gif" width="66" height="20" border="0" name="btn_new"></td>
			</table>
    
		</td></tr>
		</table>
    	<!-- TABLE '#D' : ( Button : Main ) (E) -->
		
		<!-- TABLE '#D' : ( Search Options : Scenario ID ) (S) -->
		<table class="search"> 
			<tr>
				<td class="bg_a">


				<!-- : ( Scenario ID ) (S) -->
				<table class="search" border="0" style="width:380;" id="tblSort"> 
				<tbody>
				<tr class="h23">
					<td width="50%"><select style="width:180;" name="sel_sort_col_1">
							<option value="" selected>None</option>
							</select></td>
					<td width="25%"><input type="radio" name="rdo_sort_opt_1" class="trans" checked>Ascending</td>
					<td><input type="radio" name="rdo_sort_opt_1" class="trans">Desending</td>
				</tr>
				
				<tr><td colspan="3" class="line_bluedot"></td></tr>
				
				<tr class="h23">
					<td width="50%"><select style="width:180;" name="sel_sort_col_2">
							<option value="" selected>None</option>
							</select></td>
					<td width="25%"><input type="radio" name="rdo_sort_opt_2" class="trans" checked>Ascending</td>
					<td><input type="radio" name="rdo_sort_opt_2" class="trans">Desending</td>
				</tr>
				
				<tr><td colspan="3" class="line_bluedot"></td></tr>
				
				<tr class="h23">
					<td width="50%"><select style="width:180;" name="sel_sort_col_3">
							<option value="" selected>None</option>
							</select></td>
					<td width="25%"><input type="radio" name="rdo_sort_opt_3" class="trans" checked>Ascending</td>
					<td><input type="radio" name="rdo_sort_opt_3" class="trans">Desending</td>
				</tr> 
				</tbody>
				</table>
				<!-- : ( Scenario ID ) (E) -->
				
			</tr>
		</table>
		<!-- TABLE '#D' : ( Search Options : Scenario ID ) (E) --> 	

	
	
</td></tr>
</table> 
<!-- OUTER - POPUP (E)nd -->



<table class="height_10"><tr><td></td></tr></table> 
	
	
<!-- : ( Button : Sub ) (S) -->
<table width="100%" class="sbutton">
<tr><td height="71" class="popup">
	
		<table class="sbutton">
		<tr><td class="p_bt"><img class="cursor" src="/opuscntr/img/enis/button/btn_ok.gif" width="66" height="20" border="0" name="btn_ok"></td>
			<td class="p_bt"><img class="cursor" src="/opuscntr/img/enis/button/btn_close.gif" width="66" height="20" border="0" name="btn_close"></td></tr>
		</table>
	
	</td></tr>
</table>
<!-- : ( Button : Sub ) (E) -->
			
<table id="srcTblSort" style="display:none"> 
	<tr><td colspan="3" class="line_bluedot"></td></tr>
	<tr class="h23">
		<td width="50%"><select style="width:180;" name="sel_sort_col">
				<option value="" selected>None</option>
				</select></td>
		<td width="25%"><input type="radio" name="" class="trans" checked>Ascending</td>
		<td><input type="radio" name="" class="trans">Desending</td>
	</tr>
</table>
			
</form>			
</body>
</html>
