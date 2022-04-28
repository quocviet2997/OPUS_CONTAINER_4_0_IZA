<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="com.clt.framework.support.view.signon.web.SignOnFilter" %>

<html>
<head>
<title>ALPS!</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<link href="css/alps_menu.css" rel="stylesheet" type="text/css">
<link href="css/alps_contents.css" rel="stylesheet" type="text/css">


<script language="javascript">

    function setupPage(){  
	    loadPage();
    }

</script>


<body  onLoad="setupPage();"> 

<form name="form"> 
<input	type="hidden" name="f_cmd">
<input	type="hidden" name="sel_pgm_no">
<input	type="hidden" name="sel_dp_nm">
<input	type="hidden" name="sel_prnt_pgm_no">
<!-- OUTER - POPUP (S)tart -->
<table width="600" class="popup" cellpadding="10" border="0"> 
<tr><td class="top"></td></tr>
<tr><td valign="top">
	
			<!-- : ( Title ) (S) -->
		<table width="100%" border="0">
		<tr><td class="title"><img src="/opuscntr/img/icon_title_dot.gif" align="absmiddle">&nbsp;My favorite -  settings</td></tr>
		</table>
		<!-- : ( Title ) (E) -->
		
		<!-- : ( Search Options ) (S) -->
 
			<table class="search"> 
       		<tr><td class="bg">
				
				
				<!-- Grid  (S) -->
				<table width="100%"  id="mainTable"> 
					<tr>
						<td width="100%">
							<script language="javascript">ComSheetObject('sheet1');</script>
						</td>
					</tr>
				</table> 				
				<!-- Grid  (E) -->
				
				<!--sub button(S)-->
				<table border="0" style="width:100%;"> 
					<tr class="h23">
						<td>&nbsp;</td>
						<td width="92"><table width="90" border="0" cellpadding="0" cellspacing="0" class="button">
						<tr><td class="btn2_left"></td>
						<td class="btn2" name="btn_folderadd">Folder Add</td>
						<td class="btn2_right"></td>
						</tr>
						</table></td>
						<td width="82"><table width="80" border="0" cellpadding="0" cellspacing="0" class="button">
						<tr><td class="btn2_left"></td>
						<td class="btn2" name="btn_retrieve">Retrieve</td>
						<td class="btn2_right"></td>
						</tr>
						</table></td>
						<td width="77"><table width="75" border="0" cellpadding="0" cellspacing="0" class="button">
						<tr><td class="btn2_left"></td>
						<td class="btn2" name="btn_move">Move</td>
						<td class="btn2_right"></td>
						</tr>
						</table></td>
						<td width="77"><table width="75" border="0" cellpadding="0" cellspacing="0" class="button">
						<tr><td class="btn2_left"></td>
						<td class="btn2" name="btn_delete">Delete</td>
						<td class="btn2_right"></td>
						</tr>
						</table></td>
						<td width="87"><table width="85" border="0" cellpadding="0" cellspacing="0" class="button">
						<tr><td class="btn2_left"></td>
						<td class="btn2" name="btn_oderup">Order Up</td>
						<td class="btn2_right"></td>
						</tr>
						</table></td>
						<td width="102"><table width="100" border="0" cellpadding="0" cellspacing="0" class="button">
						<tr><td class="btn2_left"></td>
						<td class="btn2" name="btn_oderdown">Order Down</td>
						<td class="btn2_right"></td>
						</tr>
						</table></td>
					</tr>
				</table>
				<!--sub button(E)-->
			
			</td></tr>
		</table>
		
				
<!-- : ( Search Options ) (E) -->
</td></tr>
</table> 

<table class="height_5"><tr><td></td></tr></table>
	
	
<!-- : ( Button : pop ) (S) -->
<table width="100%" class="sbutton">
<tr><td height="71" class="popup">
	
		<table width="100%" class="button" border="0" cellpadding="0" cellspacing="0" style="padding-top:5;,padding-bottom:10;"> 
       	<tr><td class="btn3_bg">
		    <table border="0" cellpadding="0" cellspacing="0">
		    <tr>
				<td><table width="72" border="0" cellpadding="0" cellspacing="0" class="button">
					<tr><td class="btn1_left"></td>
					<td class="btn1" name="btn_save">Save</td>
					<td class="btn1_right"></td>
					</tr>
				</table></td>
				<td class="btn1_line"></td>
				<td><table width="72" border="0" cellpadding="0" cellspacing="0" class="button">
					<tr><td class="btn1_left"></td>
					<td class="btn1" name="btn_close">Close</td>
					<td class="btn1_right"></td>
					</tr>
				</table></td>
		</td></tr>
		</table>
    <!--Button (E) -->
	
	</td></tr>
</table>
<!-- : ( Button : pop ) (E) -->
			
</form>			
</body>
</html>
