<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.FormCommand" %>
<%@ page import="com.clt.framework.support.view.signon.web.SignOnFilter" %>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse" %>
<%@ page import="com.clt.syscommon.management.opus.bookmark.vo.BookmarkListVO" %>
<%@ page import="java.util.List" %>

<%
	GeneralEventResponse eventResponse = (GeneralEventResponse)request.getAttribute("EventResponse");
	String selDpNm = (String)eventResponse.getCustomData("sel_dp_nm");
	String selPrntPgmNo =  (String)eventResponse.getCustomData("sel_prnt_pgm_no");
	

	List<BookmarkListVO> voList = eventResponse.getRsVoList();

%>
<html>
<head>
<title>ALPS!</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script language="javascript" type="text/javascript" src="js/CoAxon.js"></script>
<script>
	function backToMain(){
		var retVal;
		var selObj = document.getElementById("bkFolder");
		var selVal;
		
		if(selObj.options.selectedIndex == -1){
			selVal = ""; 
		}else{
		 selVal = selObj.options[selObj.options.selectedIndex].value;
		}

		window.returnValue =selVal + "|" + document.all.dp_nm.value;
		window.close();
	}

	function closeWin(){
		window.returnValue = "";
		window.close();
	}
</script>
<base target="_self"/>
</head>

<link href="css/alps_menu.css" rel="stylesheet" type="text/css">
<link href="css/alps_contents.css" rel="stylesheet" type="text/css">

<body> 
<form name='form'>
	<input type='hidden' name='title' value='<%=selDpNm %>'>
<!--Size : 500_155-->
<!-- OUTER - POPUP (S)tart -->
<table width="500" class="popup" cellpadding="10" border="0"> 
<tr><td class="top"></td></tr>
<tr><td valign="top">

		<table width="100%" border="0">
		<tr><td class="title"><img src="img/icon_title_dot.gif" align="absmiddle">&nbsp;Organize favorites</td></tr>
		</table>
		<!-- : ( Search Options ) (S) --> 
			<table class="search"> 
       		<tr><td class="bg">
			
				<table class="search" border="0" width="460"> 
				
				<tr class="h23">
					<td width="70">Name</td>
					<td width="380"><input type="text" style="width:100%;" class="input" id="dp_nm" value='<%=selDpNm%>'></td>
				</tr>
				<tr class="h23">
					<td width="70">Created In</td>
					<td width="380" style="padding-left:2"><select id='bkFolder' style="width:100%;" class="input">
<%					
						int cnt = voList.size();
						for(int j=0; j<cnt; j++){
							BookmarkListVO vo = voList.get(j);
							String pgmNo = vo.getPgmNo();
							String dpNm = vo.getDpNm();
							String sel = null;
							if(j==0){
								sel = "selected";
							}else{
								sel = "";
							}
%>						
						<option value="<%=pgmNo%>" <%=sel%>><%=dpNm%></option>
<%					} %>						
						</select></td>
				</tr>
				</table>
				
			</td></tr>
		</table>
<!-- : ( Search Options ) (E) -->
</td></tr>
</table> 

	
		<table class="height_5" style="background-color:#ffffff;width:100%"><tr><td></td></tr></table>
		<!-- : ( Button : pop ) (S) -->
		<table width="100%" class="sbutton">
		<tr><td height="30" class="popup">
	
			<table width="100%" class="button" border="0" cellpadding="0" cellspacing="0" style="padding-top:5;,padding-bottom:0;"> 
       		<tr><td class="btn3_bg">
		    	<table border="0" cellpadding="0" cellspacing="0">
		  	  	<tr>
					<td><table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
						<tr><td class="btn1_left"></td>
						<td class="btn1" name="" onclick="javascript:backToMain();">Move</td>
						<td class="btn1_right"></td>
						</tr>
					</table></td>
					<td><table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
						<tr><td class="btn1_left"></td>
						<td class="btn1" name="" onclick="javascript:closeWin();">Close</td>
						<td class="btn1_right"></td>
						</tr>
					</table></td>
				</tr></table>
			</td></tr>
			</table>
			<!-- : ( Button : pop ) (E) -->
	</td></tr>
</table>
<!-- : ( Button : pop ) (E) -->
</form>
</body>
</html>