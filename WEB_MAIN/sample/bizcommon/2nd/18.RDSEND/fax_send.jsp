<%@ page import="com.clt.bizcommon.util.BizComUtil"%>
<%@ page import="com.clt.framework.component.fax.FaxMetaInfo"%>
<%@ page import="com.clt.framework.component.fax.FaxUtility"%>

<!--==============================================================================
'주  시 스 템 : 
'서브  시스템 : 샘플
'프로그램 ID : fax_send.jsp
'프로그램 명  : javascript 샘플 구성
'프로그램개요 : javascript 샘플 구성 화면 이벤트들을 수행한다.
'작   성   자 : 노형춘
'작   성   일 : 2006.11.08
==================================================================================
'수정자/수정일 : 
'수정사유/내역 : 
==============================================================================-->
<html>
<head>
<title>팝업 샘플</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script language="JavaScript" src="/opuscntr/script/CoMessage_ko_KR.js"></script>
<script language="JavaScript" src="/opuscntr/script/CoFormControl.js"></script>
<script language="JavaScript" src="/opuscntr/script/CoPop.js"></script>
<script language="javascript" src="PopupSample.js"></script>
<SCRIPT LANGUAGE="javascript" SRC="/opuscntr/script/CoCalendar.js" TYPE="text/javascript"></SCRIPT>
<script language="javascript" src="/opuscntr/script/IBSheetConfig.js"></script>
<script language="javascript" src="/opuscntr/script/IBChart.js"></script>
<script language="javascript" src="/opuscntr/script/CoBizCommon.js"></script>
<script>
document.onclick = processButtonClick;

function processButtonClick() {
    var srcName = window.event.srcElement.getAttribute("name");
    
    try {
        switch(srcName) {
            case "fax_btn":         
            	document.theForm.action = "fax_send.jsp";
            	document.theForm.submit();
                break;
        }
    }
    catch(e) {        
    	if( e = "[object Error]") {
    		showErrMessage("지금은 사용하실 수가 없습니다");
    	} else {
    	   showErrMessage(e);
    	}
    }
}	
</script>

<style type="text/css">
<!--
.functionName {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 12pt;
	font-style: normal;
	font-weight: bold;
	color: #0066CC;
}
td {
	font-size: 11pt;
	line-height: 150%;
}
.td-title {
	background-color: #F1D1C9;
}

a:link {text-decoration: none;color:#333333}
a:visited {text-decoration: none;color:#333333}
a:active {text-decoration: none;color:#F8352C}
a:hover {text-decoration:none;color:#F8352C;}

-->
</style>

</head>

<%
String sub_sys_cd = request.getParameter("sub_sys_cd");
String sender_usr_id = request.getParameter("sender_usr_id");
String sender_ofc_cd = request.getParameter("sender_ofc_cd");
String title = request.getParameter("title");
String fax_no = request.getParameter("fax_no");
String tmpl_mrd = request.getParameter("tmpl_mrd");
String tmpl_param = request.getParameter("tmpl_param");

/*String fax_no[] = new String[6];
fax_no[0] = "TestFax1;201-843-5103";
fax_no[1] = "TestFax2;201-843-0877";
fax_no[2] = "TestFax3;201-843-1352";
fax_no[3] = "TestFax4;201-587-8194";
fax_no[4] = "TestFax5;201-843-4282";
fax_no[5] = "TestFax6;201-843-6718";*/

if(sub_sys_cd != null) {
	try {
		//for(int i=0; i<1000; i++) {
			FaxMetaInfo info = new FaxMetaInfo(sub_sys_cd, tmpl_mrd, "N", title, tmpl_param, fax_no, sender_ofc_cd, sender_usr_id);
			FaxUtility.registerDB(info);
			FaxUtility.send(info);
		//}
		
		//for(int i=0; i<20; i++) {
		/*for(int i=0; i<10; i++) {
			FaxMetaInfo[] info = new FaxMetaInfo[6];
			info[0] = new FaxMetaInfo(sub_sys_cd, tmpl_mrd, "N", title, tmpl_param, fax_no[0], sender_ofc_cd, "system");
			info[1] = new FaxMetaInfo(sub_sys_cd, tmpl_mrd, "N", title, tmpl_param, fax_no[1], sender_ofc_cd, "system");
			info[2] = new FaxMetaInfo(sub_sys_cd, tmpl_mrd, "N", title, tmpl_param, fax_no[2], sender_ofc_cd, "system");
			info[3] = new FaxMetaInfo(sub_sys_cd, tmpl_mrd, "N", title, tmpl_param, fax_no[3], sender_ofc_cd, "system");
			info[4] = new FaxMetaInfo(sub_sys_cd, tmpl_mrd, "N", title, tmpl_param, fax_no[4], sender_ofc_cd, "system");
			info[5] = new FaxMetaInfo(sub_sys_cd, tmpl_mrd, "N", title, tmpl_param, fax_no[5], sender_ofc_cd, "system");
			
			FaxUtility.registerDB(info);
			FaxUtility.send(info);
		}*/
	} catch(Exception e) {
		e.getMessage();
	}
}
%>
<body style="margin-left:20; margin-top:50">
<form name="theForm">
  
<table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr>
      <td valign="top" height="475">
       
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <tr bgcolor="#F1D1C9">
          	<td colspan="3"><b>Fax 전송</b> </td>
          </tr>
          <tr>
            <td width="100" bgcolor="#F5E7C5" align="center">입력</td>
            <td width="150" valign=top>
            	Module:<br>
            	Sender ID:<br>
            	Sender Office:<br>
            	Title:<br>
            	Fax No:<br>
            	Template MRD:<br>
            	Parameter:<br>
            </td>
            <td width="550" bgcolor="#EFEFEF">
              <%= com.clt.bizcommon.util.BizComUtil.getCodeCombo("sub_sys_cd", "", "", "SUBSYS", 1, "") %><br>
              <input name="sender_usr_id" type="text" size="50" value="system1" style="height:22"><br>
              <input name="sender_ofc_cd" type="text" size="50" value="CHIBB" style="height:22"><br>
              <input name="title" type="text" size="50" value="Hanjin Shipping Work Order" style="height:22"><br>
              <input name="fax_no" type="text" size="20" maxlength="60" value="TRANSPORTATION SPECIALISTS LTD (DEN);21128959161" style="height:22"><br>
              <input name="tmpl_mrd" type="text" size="50" value="Letter_WO_NORMAL_S.mrd" style="height:22"><br>
              <input name="tmpl_param" type="text" size="50" value="[Y][682][1][CHIBB][kyungwon][N]" style="height:22"><br>
              <input name="fax_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기"></td>
          </tr>
        </table>
        <br>

        </td>
    </tr>
  </table>
</form>
</body>
</html>

<%
	if(sub_sys_cd != null) {
%>
<script>
		document.all.sub_sys_cd.value = "<%= sub_sys_cd%>";
		document.all.sender_usr_id.value = "<%= sender_usr_id%>";
		document.all.sender_ofc_cd.value = "<%= sender_ofc_cd%>";
		document.all.title.value = "<%= title%>";
		document.all.fax_no.value = "<%= fax_no%>";
		document.all.tmpl_mrd.value = "<%= tmpl_mrd%>";
		document.all.tmpl_param.value = "<%= tmpl_param%>";
</script>		
<%
	}
%>
