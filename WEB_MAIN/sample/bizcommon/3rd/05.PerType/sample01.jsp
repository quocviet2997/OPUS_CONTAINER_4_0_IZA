<%@ page import="com.clt.bizcommon.util.BizComUtil"%>
<!--==============================================================================
'주  시 스 템 : 
'서브  시스템 : 샘플
'프로그램 ID : sample_approval_route.jsp
'프로그램 명  : javascript 샘플 구성
'프로그램개요 : javascript 샘플 구성 화면 이벤트들을 수행한다.
'작   성   자 : 노형춘
'작   성   일 : 2007.03.09
==================================================================================
'수정자/수정일 : 
'수정사유/내역 : 
==============================================================================-->
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

<script language="javascript" src="SAMPLE_PERTYPE.js"></script>

<link href="../../css/style.css" rel="stylesheet" type="text/css">
</head>
<body style="margin-left:20; margin-top:50">
<form name="form" style="width:800;">
  
<table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr>
      <td valign="top" height="475">       
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <tr>
          <th colspan="4"><b>05. Per Type</b> </th>
          </tr>
<tr>
            <td width="100" class="cont">결과</td>
			<td width="180" class="title">
            	Unit :<br>
				Desc :<br>
				Char :<br>
				Size :<br>
				CrDt :<br>
				UpDt :<br>
				Dele :<br>
            	Display Option:
            </td>
            <td width="520" bgcolor="#EFEFEF">
              <input name="rat_ut_cd" type="text" size="10" style="height:22"><br>
              <input name="rat_ut_desc" type="text" size="10" style="height:22"><br>
              <input name="rat_ut_grp_cd" type="text" size="10" style="height:22"><br>
              <input name="cntr_sz_cd" type="text" size="10" style="height:22"><br>
              <input name="cr_dt" type="text" size="10" style="height:22"><br>
              <input name="up_dt" type="text" size="10" style="height:22"><br>
              <input name="cxl_ind" type="text" size="10" style="height:22"><br>
              <input name="dispaly" type="text" size="20" maxlength="13" value="0,0" style="height:22">
              <input name="cnt_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
              </td>
          </tr>
          <tr>
            
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
(사용예제)
ComOpenPopupWithTarget('/opuscntr/UI_PRI_4002.do?classId=UI_PRI_4002&' + param, 900, 300, sTargetObjList, sDisplay, true);

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
