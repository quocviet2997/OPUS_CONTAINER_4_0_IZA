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

<%@ page import="com.clt.bizcommon.util.BizComUtil"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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
	List<String> mailKey = new ArrayList();
	if(request.getAttribute("EventResponse") != null){
		GeneralEventResponse eventResponse = (GeneralEventResponse)request.getAttribute("EventResponse");
		mailKey = (List<String>)eventResponse.getCustomData(SiteConfigFactory.get("COM.MAIL.KEYS"));
	}
%>
<body style="margin-left:20; margin-top:50">
<form name="form" action="/opuscntr/RDMailSample.do">
  
<table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr>
      <td valign="top" height="475">
       
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <tr bgcolor="#F1D1C9">
          	<td colspan="3"><b>Mail 전송</b> </td>
          </tr>
          <tr>
            <td width="100" bgcolor="#F5E7C5" align="center">입력</td>
            <td width="150" valign=top>
            	Module:<br>
            	Sender ID:<br>
            	Sender Name:<br>
            	Sender E-Mail:<br>
            	Sender Office:<br>
            	Receiver E-Mail:<br>
            	Title:<br>
            	Content:<br>
            	Template MRD:<br>
            	Parameter:<br>
            </td>
            <td width="550" bgcolor="#EFEFEF">
                            <SELECT name = "sub_sys_cd" >		<OPTION  value = "BKG"> BKG </OPTION>
		<OPTION  value = "PRI"> PRI </OPTION>
		<OPTION  value = "FMS"> FMS </OPTION>
		<OPTION  value = "CAC"> CAC </OPTION>
		<OPTION  value = "GEM"> GEM </OPTION>
		<OPTION  value = "INV"> INV </OPTION>
		<OPTION  value = "TOT"> TOT </OPTION>
		<OPTION  value = "JOO"> JOO </OPTION>
		<OPTION  value = "LSE"> LSE </OPTION>
		<OPTION  value = "CGM"> CGM </OPTION>
		<OPTION  value = "MST"> MST </OPTION>
		<OPTION  value = "MNR"> MNR </OPTION>
		<OPTION  value = "CTM"> CTM </OPTION>
		<OPTION  value = "DMT"> DMT </OPTION>
		<OPTION  value = "CIM"> CIM </OPTION>
		<OPTION  value = "PSO"> PSO </OPTION>
		<OPTION  value = "VSK"> VSK </OPTION>
		<OPTION  value = "SCG"> SCG </OPTION>
		<OPTION  value = "OPF"> OPF </OPTION>
		<OPTION  value = "DOM"> DOM </OPTION>
		<OPTION  value = "BSA"> BSA </OPTION>
	</SELECT><br>
              <input name="sender_usr_id" type="text" size="50" value="system1" style="height:22"><br>
              <input name="sender_usr_nm" type="text" size="50" value="Hanjin Admin" style="height:22"><br>
              <input name="sender_usr_eml" type="text" size="50" value="nhc123@cyberlogitec.com" style="height:22"><br>
              <input name="sender_ofc_cd" type="text" size="50" value="SELHO" style="height:22"><br>
              <input name="receiver_eml" type="text" size="50" value="coolguy@cyberlogitec.com" style="height:22"><br>
              <input name="title" type="text" size="50" value="Transportation Work Order" style="height:22"><br>
              <textarea name="content">안녕하세요. 김정훈 입니다.  Hello World!</textarea><br>
              <input name="tmpl_mrd" type="text" size="50" value="TEST.mrd" style="height:22"><br>
              <input name="tmpl_param" type="text" size="50" value="" style="height:22"><br>
              <input name="emlFileKey1" type="text" size="50" value="gkebea_20091126161848577.doc" style="height:22"><br> 
              <input name="emlFileKey2" type="text" size="50" value="xncfep_2009112618530378.tif" style="height:22"><br> 
              <input name="xptFileNm" type="text" size="50" value="test.pdf" style="height:22"><br> 
              <input name="smtpIp" type="text" size="50" value="smtp.hanjin.com" style="height:22"><br> 
              <input type="button" value="Fire" onclick="form.submit()">
              <input type="button" onclick="reset()" value="지우기"></td>
          </tr>
        </table>
        </td>
    </tr>
  </table>
</form>
<%=mailKey %>
</body>

<%@page import="com.clt.framework.component.javamail.SingleMailAttachedFile"%>
<%@page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@page import="com.clt.framework.core.config.SubSystemConfigFactory"%>
<%@page import="com.clt.framework.core.config.SiteConfigFactory"%></html>
