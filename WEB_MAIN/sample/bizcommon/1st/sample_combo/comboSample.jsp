<%@ page import="com.clt.bizcommon.util.BizComUtil"%>
<html>
<head>
<title>Welcome to enis!</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!--
	'CSS' File Name :
	login 					=> "css/enis_login.css"
	top menu, left menu 	=> "/opuscntr/css/enis_menu.css"
	contents 				=> "/opuscntr/css/enis_contents.css"
-->

</head>

<script language="javascript" type="text/javascript" src="js/CoMessage.js"></script>
<script language="javascript" type="text/javascript" src="js/CoAxon.js"></script>
<script language="javascript" type="text/javascript" src="js/CoCommon.js"></script>
<script language="javascript" type="text/javascript" src="js/CoFormControl.js"></script>
<script language="javascript" type="text/javascript" src="js/CoPopup.js"></script>
<script language="javascript" type="text/javascript" src="js/CoCalendar.js"></script>
<script language="javascript" type="text/javascript" src="js/CoObject.js"></script>
<script language="javascript" type="text/javascript" src="js/IBSheetInfo.js"></script>
<script language="javascript" type="text/javascript" src="js/CoWait.js"></script>
<script language="javascript" type="text/javascript" src="js/CoBiz.js"></script>
<script language="javascript" type="text/javascript" src="js/CoMail.js"></script>
<script language="javascript" src="sheetComboSample.js"></script>

<script language="javascript">

    function setupPage(){
	    loadPage();
    }

</script>

<script language="javascript">
<%= BizComUtil.getIBCodeCombo("sel_curr", "", "CURR", 2, "0: :ALL") %>
</script>

<body onLoad="setupPage();">
<form name="form">
<!-- OUTER FRAME : "to make sum of components' HEIGHTS 100%" (S)tart -->
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
<tr><td valign="top">




<!-- ################# TABLE '#A' ::: 'TOP' FRAME (START) ################## -->

<!-- Put your 'STYLESHEET' into the <HEAD> tag on the corresponding page if you make 'FRAMESET's -->






<!-- ################# TABLE '#B' ::: 'LEFT + RIGHT' FRAME (START) ################## -->
<!-- TABLE '#B' : 'Left + Right Body' Table (S)tart -->
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
<tr><td class="bodyleft">




		
	</td>
	<td class="bodyright">




		<!-- ####### TABLE '#D' ::: 'RIGHT' FRAME (START) ####### -->

		<!-- Put your 'STYLESHEET' into the <HEAD> tag on the corresponding page if you make 'FRAMESET's -->
		


		<!-- TABLE '#D' : ( Page Title, Historical Tail Navigation ) (S) -->
		<table width="100%" class="title">
		<tr>
			<td class="history"></td>
		</tr>
		<tr>
			<td class="title"><img src="img/alps/ico_t1.gif" width="20" height="12"> IB Sheet에서의 Currency 콤보 구현 </td>
		</tr>
		</table>
		<!-- TABLE '#D' : ( Page Title, Historical Tail Navigation ) (E) -->


		<!-- TABLE '#D' : ( Button : Main ) (S) -->
		<table width="100%" class="button">
		<tr><td class="align">

			<table class="button">
			<tr><td><img class="cursor" src="img/alps/button/btn_retrieve.gif" width="66" height="20" border="0" name="btn_retrieve"></td>				
			</tr>
			</table>

		</td></tr>
		</table>
		<!-- TABLE '#D' : ( Button : Main ) (E) -->		

		<table class="height_15"><tr><td></td></tr></table>

		<!-- TABLE '#D' : ( Grid BG Box ) (S) -->
		<table class="search" border="0">
			<tr><td class="bg_b1">
					<table class="height_10"><tr><td></td></tr></table>

					<!-- Grid : Week (S) -->
					<!-- 'HEAD1-BGCOLOR : 192 235 163' , 'HEAD2-BGCOLOR : 231 250 249' , 'BORDER : 90 138 158' , 'HEAD1-FONT : 0 83 116' , 'DATA GRID BG (2 colors) : 255 255 255, 249 249 249 ' -->
					<table width="100%" id="mainTable">
				              <tr>
							<td width="100%">
								<script language="javascript">ComSheetObject('sheet1');</script>
							</td>
						</tr>
					</table>
					<!-- Grid : Week (E) -->		
				</td>
			</tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4"><br>
            	<pre>
            	</pre>
            </td>
          </tr>
		</table>
		<!-- TABLE '#D' : ( Grid BG Box ) (E) -->

		<!-- ####### TABLE '#D' ::: 'RIGHT' FRAME (END) ####### -->
    </td>
</tr>
</table>
<!-- TABLE '#B' : 'Left + Right Body' Table (E)nd -->
<!-- ################# TABLE '#B' ::: 'LEFT + RIGHT' FRAME (END) ################## -->





</td></tr>


<tr><td class="bgdybottom_copy">	



</td></tr>
</table>
<!-- OUTER FRAME : "to make sum of components' HEIGHTS 100%" (E)nd -->
</form>
</body>
</html>

