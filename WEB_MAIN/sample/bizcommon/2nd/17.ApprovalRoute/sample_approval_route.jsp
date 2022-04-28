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
<script language="JavaScript" src="/opuscntr/js/CoMessage_ko_KR.js"></script>
<script language="JavaScript" src="/opuscntr/js/CoFormControl.js"></script>
<script language="JavaScript" src="/opuscntr/js/CoPopup.js"></script>
<SCRIPT LANGUAGE="javascript" SRC="/opuscntr/js/CoCalendar.js" TYPE="text/javascript"></SCRIPT>
<script language="javascript" src="/opuscntr/js/IBSheetConfig.js"></script>
<script language="javascript" src="/opuscntr/js/IBChart.js"></script>
<script language="javascript" src="/opuscntr/js/CoBizCommon.js"></script>

<script language="javascript" src="sample_approval_route.js"></script>

<link href="../../css/style.css" rel="stylesheet" type="text/css">
</head>
<body style="margin-left:20; margin-top:50">
<form name="theForm" style="width:800;">
  
<table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr>
      <td valign="top" height="475">       
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <tr>
          <th colspan="4"><b>17. Approval Route</b> </th>
          </tr>
          <tr>
            <td width="120" class="title">
            	Approval Steps 1 <br>
            </td>
            <td colspan=3 width="520" bgcolor="#EFEFEF">
			  <input name="apro_step" type="text" size="50" value="<%=com.clt.bizcommon.approval.util.ApprovalUtil.getApprovalRoute("SELHO", "AGT") %>">
              <input name="apro_route_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>  
          	<td width="100" class="title" rowspan="2">
            	Office Code<br>
            </td>
            <td>
              <input name="ofc_cd" type="text" size="10" value="SELHO">
            </td>
            <td width="100" class="title">
            	Module
            </td>
            <td>
              <%= com.clt.bizcommon.util.BizComUtil.getCodeCombo("sub_sys_cd", "", "", "SUBSYS", 1, "") %>
              <input name="apro_route_default_btn" type="button" class="button" value="Default Route Setting">              
            </td>              
          </tr>
          
          <tr>  
            <td colspan="3">
          		<input type="text" style="width:100%" name="result_obj" value="">
            </td>            
          </tr>
          
          
          <tr>
          	<td width="100" class="title">
          		CSR Approval
          	</td>
          	<td colspan=2>
          		<input name="csr_no" type="text" size="30" value="12SLGBBB07050700036">
          	</td>
          	<td>
          		<input name="apro_route_csr_btn" type="button" class="button" value="CSR Route Setting">
          	</td>
          </tr>
          <tr>  
          	<td width="100" class="title">
            	Approval Request<br>
            </td>
            <td colspan=3>              
              <input name="apro_request_btn" type="button" class="button" value="Approval Request">              
            </td>              
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
comOpenPopup('/opuscntr/COM_ENS_0T1.do' + param, 620, 450, 'getCOM_ENS_0T1_1', '0,0', false, false, "", "", 0);
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
