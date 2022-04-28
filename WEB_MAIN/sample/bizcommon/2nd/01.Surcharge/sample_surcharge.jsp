<%@ page import="com.clt.bizcommon.util.BizComUtil"%>
<!--==============================================================================
'주  시 스 템 : 
'서브  시스템 : 샘플
'프로그램 ID  : PopupSample.html
'프로그램 명  : javascript 샘플 구성
'프로그램개요 : javascript 샘플 구성 화면 이벤트들을 수행한다.
'작   성   자 : 박상률/2006.08.03
'작   성   일 : 
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
<body style="margin-left:10">
<form name="theForm" style="width:800;">
  
<table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr>
      <td valign="top" height="475"><h3>▶ javascript 사용 예제</h3>
       
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <tr colspan="4" bgcolor="#F1D1C9">
          	<td><b>01. Commodity (COM_ENS_011)</b> </td>
          </tr>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="150">
            	Commodity Code:<br>
            	REP Commodity:<br>
            	IMDG CLASS:<br>
            	Keyword:<br>
            	Display Option:
            </td>
            <td width="550" bgcolor="#EFEFEF">
              <input name="cmdt_cd" type="text" size="50" style="height:22"><br>
              <input name="rep_cmdt_cd" type="text" size="50" style="height:22"><br>
              <select style="width:50;" name="rep_imdg_lvl_cd">&nbsp;
						<option value="" selected>ALL</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						</select>
			  <br>
              <input name="cmdt_nm" type="text" size="50" style="height:22"><br>
              <input name="cmdt_dispaly" type="text" size="20" maxlength="13" value="1,0,1,1,1,1,1" style="height:22">
              <input name="cmdt_btn" type="button" class="button" value="클릭">
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
* @param {string} sFunc 필수,팝업에서 최종 확인을 했을때 데이터를 받을 부모창(opener)의 자바스크립트 함수명 <br>
* @param {string} sDisplay 필수,팝업창에 있는 그리드의 컬럼 히든여부 설정(1:보임, 0:숨김) <br>
* @param {bool} bModal 선택,팝업의 Modal 여부 (true:Modal, false:일반팝업), default=false <br>
* @param {bool} b2ndSheet 선택,Sheet 2개인 팝업 오픈시 true 1개인 팝업 오픈시 false, default=false <br>
* @param {int} iRow 선택,Sheet의 Cell의 Row Index <br>
* @param {int} iCol 선택,Sheet의 Cell의 Col Index <br>
* @param {int} iSheetIdx 선택,Sheet의 sheetObjects 배열 Index <br>
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
comOpenPopup('/opuscntr/COM_ENS_011.do' + param, 620, 450, 'getCOM_ENS_011_1', '0,0', false, false, "", "", 0);
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
