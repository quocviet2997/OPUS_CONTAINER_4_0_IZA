<%/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : schedule.jsp
*@FileTitle : Schedule
*Open Issues :
*Change history :
*@LastModifyDate : 2008.12.23
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2008.12.23 정인선
* 1.0 최초 생성
=========================================================*/%>

<html>
<head>
<title>Welcome to nis2010!</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<link href="css/alps_menu.css" rel="stylesheet" type="text/css">
<link href="css/alps_contents.css" rel="stylesheet" type="text/css">

<script language="javascript" src="sys/management/nis2010/schedule/script/schedule.js"></script>

<script language="javascript">
    function setupPage(){
	    loadPage();
    }
</script>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.management.opus.schedule.event.ScheduleEvent"%>

<%@ page import="org.apache.log4j.Logger" %>

<%

	ScheduleEvent  event = null;
	
	Exception serverException = null;
	DBRowSet rowSet	  = null;
	String strErrMsg = "";
	int rowCount	 = 0;
	
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.Schedule.Schedule");
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
	   
		event = (ScheduleEvent)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}else{
			if(rowSet != null){
 				rowCount = rowSet.getRowCount();
			} // end if
		} // end else
	}catch(Exception e) {
		out.println(e.toString());
	}
	
%>

<body  onLoad="setupPage();">

<form name="form">
<input type="hidden" name="f_cmd">
<table width="100%" border="0" cellpadding="0" cellspacing="0" style="padding-top:2;padding-left:5;">
	<tr><td valign="top">
	
		<!--Page Title, Historical (S)-->
		<table width="100%" border="0" cellpadding="0" cellspacing="0" class="title">
			<tr><td class="history"><img src="img/icon_history_dot.gif" align="absmiddle"><span id="navigation"></span></td></tr>
			<tr><td class="title"><img src="img/icon_title_dot.gif" align="absmiddle"><span id="title"></span></td></tr>
		</table>
		<!--Page Title, Historical (E)-->
		
		<!-- 1 (S) -->
		<table class="search" id="mainTable"> 
       		<tr><td class="bg">
			
				<!--  biz_1  (S) -->
				<table class="search" border="0" style="width:979;"> 
				<tr class="h23">
					<td width="85">Schedule ID</td>
					<td width="140"><input type="text" style="width:80;" name= "schedule_ID" class="input" value=""></td>
					
					<td width="100">Schedule Type</td>
					<td width="150"><select style="width:100;" class="input1" name ="schedule_Type">
						<option value=""selected>ALL</option>
						<option value="C">Direct</option>
						<option value="D">Direct(C)</option>
						<option value="R">Reserved</option>
						<option value="S">Scheduled</option>
						</select></td>
					<td width="80">Server Code</td>
					<td><select style="width:100;" class="input1" name="server_Code">
						<option value=""selected>ALL</option>
						<option value="KOR">Korea</option>
						<option value="CHN">China</option>
						<option value="SWA">West Asia</option>
						<option value="USA">USA</option>
						<option value="EUR">Europe</option>
						</select></td>
				</tr> 
				<tr class="h23">
					<td width="">Program No.</td>
					<td width=""><input type="text" style="width:80;" class="input" value="" name="program_No"></td>
					<td width="">Program Name</td>
					<td width=""><input type="text" style="width:100;" class="input" value="" name="program_Name"></td>
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

		<!--Button (S) -->
		<table width="100%" class="button" border="0" cellpadding="0" cellspacing="0" style="padding-top:5;,padding-bottom:10;"> 
       	<tr><td class="btn1_bg">
		
		    <table border="0" cellpadding="0" cellspacing="0">
		    <tr><td>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
					<tr><td class="btn1_left"></td>
					<td class="btn1" name="btn_Add">Add</td>
					<td class="btn1_right"></td>
					</tr>
				</table>
				</td>
				<td>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
					<tr><td class="btn1_left"></td>
					<td class="btn1" name="btn_Retrieve">Retrieve</td>
					<td class="btn1_right"></td>
					</tr>
				</table>
				</td>
				<td class="btn1_line"></td>
				<td><table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
					<tr><td class="btn1_left"></td>
					<td class="btn1" name="btn_Save">Save</td>
					<td class="btn1_right"></td>
					</tr>
				</table></td>
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
	
	</td></tr>
		</table>

</form>
</body>
</html>