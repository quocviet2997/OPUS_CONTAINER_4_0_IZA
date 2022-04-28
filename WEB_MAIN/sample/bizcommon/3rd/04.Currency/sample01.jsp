<%@ page import="com.clt.bizcommon.util.BizComUtil"%>
<%/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : sample01.jsp
*@FileTitle : CURRENCY
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.13
*@LastModifier : 김석준
*@LastVersion : 1.0
* 2009.07.13 김석준
* 1.0 Creation
=========================================================*/%>
<html>
<head>
<title>팝업 샘플</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoMessage.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoAxon.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoCommon.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoFormControl.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoPopup.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoCalendar.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoObject.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/IBSheetInfo.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoWait.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoBiz.js"></script>

<script language="javascript" src="SAMPLE_CURRENCY.js"></script>

<link href="../../css/style.css" rel="stylesheet" type="text/css">
</head>
<body style="margin-left:20; margin-top:50">
<form name="form" style="width:800;">
  
<table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr>
      <td valign="top" height="475">       
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <tr>
          <th colspan="4"><b>04. Currency</b> </th>
          </tr>
          <tr>
            <td width="100" class="cont">결과</td>
            <td width="150" class="title">
            	curr_cd :<br>
            	cnt_cd :<br>
            	curr_desc :<br>
				Display Option:
            </td>
            <td width="550" bgcolor="#EFEFEF">
              <input name="curr_cd" type="text" size="50" readonly="readonly"><br>
              <input name="cnt_cd" type="text" size="50" readonly="readonly"><br>
              <input name="curr_desc" type="text" size="50" readonly="readonly"><br>
               <input name="dispaly" type="text" size="20" maxlength="13" value="0,0" style="height:22" readonly>
              <input name="orgchart_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기"></td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
(사용예제)
ComOpenPopupWithTarget('/opuscntr/COM_ENS_N13.do?classId=COM_ENS_N13&' + param, 500, 380, sTargetObjList, sDisplay, true);

ComOpenPopup('/opuscntr/COM_ENS_N13.do?classId=COM_ENS_N13&' + param, 500, 380, 'getCOM_ENS_N13', sDisplay + ',1', true);
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
<iframe id="apro_frame" style="display:none">
</html>
