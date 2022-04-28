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
<script language="JavaScript" src="/opuscntr/js/CoMessage_ko_KR.js"></script>
<script language="JavaScript" src="/opuscntr/js/CoFormControl.js"></script>
<script language="JavaScript" src="/opuscntr/js/CoPop.js"></script>
<SCRIPT LANGUAGE="javascript" SRC="/opuscntr/js/CoCalendar.js" TYPE="text/javascript"></SCRIPT>
<script language="javascript" src="/opuscntr/js/IBSheetConfig.js"></script>
<script language="javascript" src="/opuscntr/js/IBChart.js"></script>
<script language="javascript" src="/opuscntr/js/CoBizCommon.js"></script>

<link href="../../css/style.css" rel="stylesheet" type="text/css">
</head>
<body style="margin-left:20; margin-top:50">
<form name="theForm" style="width:800;">
  
  <table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr>
    	<td>
    		▶ 콤보박스<br>    		
    		- Container Type <%= com.clt.bizcommon.util.BizComUtil.getCodeCombo("cntr_tp_cd", "", "", "CNTRTP", 1, "0: :ALL") %><br>
    		- Container Size <%= com.clt.bizcommon.util.BizComUtil.getCodeCombo("cntr_sz_cd", "", "", "CNTRSZ", 1, "0: :ALL") %><br>
    		- Container Type/Size <%= com.clt.bizcommon.util.BizComUtil.getCodeCombo("cntr_tpsz_cd2", "", "", "CNTRTPSZ", 1, "0: :ALL") %><br>
    		- Chassis Type Size <%= com.clt.bizcommon.util.BizComUtil.getCodeCombo("chss_tpsz_cd", "", "", "CHASSIS", 1, "0: :ALL") %><br>
    		- Genset Type Size <%= com.clt.bizcommon.util.BizComUtil.getCodeCombo("mgst_tp_cd", "", "", "GENSET", 1, "0: :ALL") %>
    	</td>
    </tr>
  </table>
</form>
</body>
</html>
