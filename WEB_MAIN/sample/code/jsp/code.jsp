<%--========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : code.jsp
*@FileTitle : Common Code retrieve sample
*Open Issues :
*Change history :
*@LastModifyDate : 2009-05-25
*@LastModifier : Seungyol Lee
*@LastVersion : 1.0
* 2009-05-25 Seungyol Lee
* 1.0 최초 생성
=========================================================--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse" %>
<%@ page import="com.clt.sample.code.vo.CustomVO" %>
<%@ page import="java.util.Collection" %>
<%@ page import="com.clt.framework.component.util.code.CodeInfo" %>
<%@ page import="com.clt.bizcommon.util.BizComUtil" %>
<%@ page import="com.clt.framework.component.util.StringUtil" %>
<%
	GeneralEventResponse eventResponse = (GeneralEventResponse)request.getAttribute("EventResponse");
	CustomVO customVO = (CustomVO)eventResponse.getCustomData("CustomVO");

	String codeString1 = BizComUtil.getCodeSelectString(customVO.getCodelist1());
	String[] codeinfo1 = StringUtil.split(codeString1,BizComUtil.CODE_DELIMITTER);

	String codeString2 = BizComUtil.getCodeSelectString(customVO.getCodelist2());
    String[] codeinfo2 = StringUtil.split(codeString2,BizComUtil.CODE_DELIMITTER);
    
    
%>
<html>
<head>
<title>Code Sample</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<link href="css/alps_menu.css" rel="stylesheet" type="text/css">
<link href="css/alps_contents.css" rel="stylesheet" type="text/css">
<script language="javascript">
var itemComboValue1 = "<%=codeinfo1[0]%>";
var itemComboText1 = "<%=codeinfo1[1]%>";
var itemComboValue2 = "<%=codeinfo2[0]%>";
var itemComboText2 = "<%=codeinfo2[1]%>";

    function setupPage(){  
	    loadPage();
    }

</script>


<body  onLoad="setupPage();"> 

<form name="form"> 
<input	type="hidden" name="f_cmd">
<!-- OUTER - POPUP (S)tart -->
<table width="600" class="popup" cellpadding="10" border="0">
	<tr>
		<td>
			<table class="search_sm2">
				<tr class="h23">
					<td>Scenario</td>
					<td>
					<select id="code1">
					</select>
					</td>
				</tr>
				<tr class="h23">
					<td>Trans shipment</td>
					<td>
					<select id="code2">
					</select>
					</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	</tr>
	<tr>
	<td>
				<!-- Grid  (S) -->
				<table width="100%"  id="mainTable"> 
					<tr>
						<td width="100%">
							<script language="javascript">ComSheetObject('sheet1');</script>
						</td>
					</tr>
				</table> 				

				<!--sub button(S)-->
				<table border="0" style="width:100%;"> 
					<tr class="h23">
						<td>&nbsp;</td>
						<td width="92"><table width="90" border="0" cellpadding="0" cellspacing="0" class="button">
						<tr><td class="btn2_left"></td>
						<td class="btn2" name="btn_folderadd">Add</td>
						<td class="btn2_right"></td>
						</tr>
						</table></td>
					</tr>
				</table>
				<!--sub button(E)-->
	</td>
	</tr>
</table>

</form>			
</body>
</html>
