<%
/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : orgchart.jsp
*@FileTitle : orgchart 정보조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2009.3.17
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2009.3.17 김경범
* 1.0 최초 생성
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	String cahrt = "";
	if(request.getParameter("Subscriber") != null || !request.getParameter("Subscriber").equals("")){
		cahrt = request.getParameter("Subscriber");
	}
%>
<html>
<head>
<title>Organization Chart</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="/opuscntr/css/OrganTree.css" type="text/css" rel="stylesheet" />
<script language="javascript" type="text/javascript" src="/opuscntr/js/OrganTree.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/HashMap.js"></script>

</HEAD>

<body onLoad="loadPage(); initTree('treeView', 'loadData')">
<table width="100%" class="popup" cellpadding="10" border="0"> 
<tr><td class="top"></td></tr>
<tr>
		<td valign="top"><!--Page Title, Historical (S)-->
		<table width="100%" border="0" cellpadding="0" cellspacing="0" class="title">
			<tr>
			<%if(cahrt.equals("")){ %>
				<td class="title"><img src="img/icon_title_dot.gif" align="absmiddle"> People Search</td>
			<%}else{%>
				<td class="title"><img src="img/icon_title_dot.gif" align="absmiddle"> Notified Subscriber Inquiry</td>
			<%}%>
			</tr>
		</table>
		<!--Page Title, Historical (E)--> <!-- 1 (S) -->
		<table class="search"> 
            <tr><td class="bg">
		
		
			<table class="search" border="0">
			<tr class="h23">
				<td width="200" valign="top"><!--  biz_1  (S) -->
				<table class="search" border="0">
					<tr class="h23">
						<td><select id="company" onchange="changeCompany('treeView', this.value)">
							<option value="hjs">HJS</option>
							<option value="clt">CLT</option>
							<option value="sen">SEN</option>
						</select></td>
					</tr>
				</table>
			<!--  biz_1   (E) -->

			<table class="line_bluedot"><tr><td></td></tr></table>

			<!-- Grid (S) -->
			<table id="mainTable">
				<tr>
					<td>
					<div id="treeView" style="overflow: auto; width: 200px; height: 262px; border-width: 1px; border-style: solid; border-color: #7F9DB9;"></div>
					</td>
				</tr>
			</table>
			</td>
			<td width="20"></td>
			<td valign="top"><!--  biz_1  (S) -->
				<table class="search" border="0">
					<tr class="h23">
						<td align="right"><select id="search">
							<option value="NAME">Name (ENG+Local)</option>
							<option value="TEAMNM">Department</option>
							<option value="POS">Title</option>
							<option value="JOB">Job Info</option>
							<option value="CN">User ID</option>
						</select>
						<input type="text" style="width:100;" class="input" value="" name="search_text">&nbsp;</td>
						<td>
							<table width="72" border="0" cellpadding="0" cellspacing="0" class="button">
								<tr><td class="btn1_left"></td>
								<td class="btn1" name="btn_Search">Search</td>
								<td class="btn1_right"></td>
								</tr>
							</table>
						</td>
											
				</tr>
				</table>
			<!--  biz_1   (E) -->

			<table class="line_bluedot">
				<tr>
					<td></td>
				</tr>
			</table>

			<!-- Grid (S) -->
			<table id="mainTable" width="100%">
				<tr>
					<td>
					<script language="javascript">ComSheetObject('sheet1');</script>
					</td>
				</tr>
			</table>
			</td>

			</tr>
		</table>
		</td>
	</tr>
</table>


		</td>
	</tr>
</table>

<table class="height_10"><tr><td></td></tr></table>


<!-- : ( Button : Sub ) (S) -->
<table width="100%" class="sbutton">
<tr><td height="71" class="popup">

			<table width="100%" class="button" border="0" cellpadding="0" cellspacing="0" style="padding-top:5;,padding-bottom:10;"> 
       		<tr><td class="btn3_bg">
		    	<table border="0" cellpadding="0" cellspacing="0">
		    	<tr>
		    		<td>
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
								<tr><td class="btn1_left"></td>
								<td class="btn1" name="btn_Confirm">Confirm</td>
								<td class="btn1_right"></td>
								</tr>
							</table>
						</td>
						<td>
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
								<tr><td class="btn1_left"></td>
								<td class="btn1" name="btn_Close">Close</td>
								<td class="btn1_right"></td>
								</tr>
							</table>
						</td>
				</tr>
				</table>
			</td></tr>
			</table>

</td></tr>
</table>
<!-- : ( Button : Sub ) (E) -->

</BODY>

</HTML>
 <%@include file="../../include/common_alps.jsp"%>