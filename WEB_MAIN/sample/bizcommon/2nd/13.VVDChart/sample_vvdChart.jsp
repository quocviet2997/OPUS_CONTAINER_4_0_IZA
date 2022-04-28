<%@ page import="com.clt.bizcommon.util.BizComUtil"%>
<!--==============================================================================
'주  시 스 템 : 
'서브  시스템 : 샘플
'프로그램 ID : sample_monthlyExRate.jsp
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
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoMessage.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoCommon.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoFormControl.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoPopup.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoCalendar.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoObject.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/IBSheetInfo.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoWait.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoBiz.js"></script>

<script language="javascript" src="sample_vvdChart.js"></script>

<link href="../../css/style.css" rel="stylesheet" type="text/css">
</head>
<body style="margin-left:20; margin-top:50">
<form name="theForm" style="width:800;">
  
<table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr>
      <td valign="top" height="475">       
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <tr>
          <th colspan="4"><b>12. Trade/Lane/VVD Chart (COM_ENS_0P1)</b> </th>
          </tr>
          <tr>
            <td width="100" class="cont">입력</td>
            <td width="180" class="title">
            	시나리오ID:<br>
            	TRADE:<br>
            	LANE:<br>
            	VVD:<br>
            	Display Option:
            </td>
            <td width="520" bgcolor="#EFEFEF">             			  
			  <input name="scnr_id" type="text" size="30" value="SCEN200636W001"><br>
			  <input name="trade" type="text" size="30" readonly><br>
			  <input name="lane" type="text" size="30" readonly><br>
			  <input name="vvd" type="text" size="30" readonly><br>
              <input name="display" type="text" size="20" maxlength="13" value="0,1" style="height:22">
              <input name="vvdchart_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기"></td>
          </tr>
<tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - IB Sheet Cell에서의 공통 팝업창 호출 (<b><font color="blue">상기 예의 경우 Port</font></b>) <br>
              <br>
              - 메소드 정의 : function comPopupInSheet(url, width, height, func, dispaly, row, col)
              <br>
* @param {string} sUrl 필수,호출될 팝업 주소 <br>
* @param {int} iWidth 필수,팝업 창의 넓이 <br>
* @param {int} iHeight 필수,팝업 창의 높이 <br>
* @param {string} sTargetObjList - 필수,팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 Object명(Input 또는 Combo 등)  <br>
* @param {string} sDisplay 필수,팝업창에 있는 그리드의 컬럼 히든여부 설정(1:보임, 0:숨김) <br>
* @param {bool} bModal 선택,팝업의 Modal 여부 (true:Modal, false:일반팝업), default=false <br>
* @returns object<br>
* bModal=false로 오픈된 경우 리턴값 : 팝업창의 window Object <br>
* bModal=true로 오픈된 경우 리턴값 : 팝업창의 window.returnValue값 <br> 
              </td>
          </tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
"0,1"로 하면 popup에서 컬럼명이 checkbox를 찾고,
1,0이면 컬럼명이 radio 컬럼을 찾으며,
0,0이면 선택된 row를 찾아서 return합니다. 
ComOpenPopupWithTarget('/opuscntr/COM_ENS_0P1.do' + param, 400, 470, "trade:trade|lane:lane|vvd:vvd", v_display, true);

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
