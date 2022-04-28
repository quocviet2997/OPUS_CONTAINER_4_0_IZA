<%@ page contentType="text/html; charset=UTF-8"%>
<!--==============================================================================
'주  시 스 템 : 
'서브  시스템 : 샘플
'프로그램 ID : sample_organChart.jsp
'프로그램 명  : javascript 샘플 구성
'프로그램개요 : javascript 샘플 구성 화면 이벤트들을 수행한다.
'작   성   자 : 김경범 
'작   성   일 : 2009.05.19
==================================================================================
'수정자/수정일 : 
'수정사유/내역 : 
==============================================================================-->
<html>
<head>
<title>팝업 샘플</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoMessage.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoCommon.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoFormControl.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoPopup.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoCalendar.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoObject.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/IBSheetInfo.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoWait.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoBiz.js"></script>
<script language="javascript" src="sample_organChart.js"></script>

<link href="../../css/style.css" rel="stylesheet" type="text/css">
</head>
<body style="margin-left:20; margin-top:50">
<form name="theForm" style="width:800;">
  
<table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr>
      <td valign="top" height="475">       
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <tr>
          <th colspan="4"><b>06. Organization Chart (orgchart)</b> </th>
          </tr>
          <tr>
            <td width="100" class="cont">결과</td>
            <td width="150" class="title">
            	Dept.:<br>
            	Name:<br>
            	Mail:<br>
            	Phone:<br>
            	CN:<br>
            	Local Name:<br>
            	Position:<br>
            	Job Name:<br>
            	Job Code:<br>
            	Dept. Code:<br>
            	Init. Name:<br>
            	Title:<br>
            	SIP:<br>
            	Display Option:
            </td>
            <td width="550" bgcolor="#EFEFEF">
              <input name="TEAMNM" type="text" size="50" readonly="readonly"><br>
              <input name="NAME" type="text" size="50" readonly="readonly"><br>
              <input name="MAIL" type="text" size="50" readonly="readonly"><br>
              <input name="PHONE" type="text" size="50" readonly="readonly"><br>
              <input name="CN" type="text" size="50" readonly="readonly"><br>
              <input name="LNAME" type="text" size="50" readonly="readonly"><br>
              <input name="POS" type="text" size="50" readonly="readonly"><br>
              <input name="JOB" type="text" size="50" readonly="readonly"><br>
              <input name="JCODE" type="text" size="50" readonly="readonly"><br>
              <input name="TEAM" type="text" size="50" readonly="readonly"><br>
              <input name="INITNM" type="text" size="50" readonly="readonly"><br>
              <input name="BUJAE" type="text" size="50" readonly="readonly"><br>
              <input name="SIP" type="text" size="50" readonly="readonly"><br>
              <input name="dispaly" type="text" size="30" maxlength="30" value="1,0,1,1,1,1,0,0,0,0,0,0,0,0,0">
              <input name="orgchart_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기"></td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
(사용예제)
ComOpenPopup('/opuscntr/orgchart.screen', 800, 450, 'getPersonData', '1,0,1,1,1,1,0,0,0,0,0,0,0,0,0', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>

        </td>
    </tr>
  </table>
</form>
</body>
</html>
