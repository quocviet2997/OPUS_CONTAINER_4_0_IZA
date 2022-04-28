<%@ page import="com.clt.bizcommon.util.BizComUtil"%>
<!--==============================================================================
'주  시 스 템 : 
'서브  시스템 : 샘플
'프로그램 ID : sample_portcodehelp.jsp
'프로그램 명  : javascript 샘플 구성
'프로그램개요 : javascript 샘플 구성 화면 이벤트들을 수행한다.
'작   성   자 : 정인선
'작   성   일 : 2009.08.09
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
<script language="javascript" src="sample_vslcodehelp.js"></script>

<link href="../../css/style.css" rel="stylesheet" type="text/css">
</head>
<body style="margin-left:20; margin-top:50">
<form name="form" style="width:800;">
  
<table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr>
      <td valign="top" height="475">       
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <tr>
          <td width="180" class="title">
          		VSL Code : <br> 
				VSL Name : <br> 
				Carrier Code : <br> 
            	Display Option :
            </td>
            <td width="520" bgcolor="#EFEFEF">
              <input name="vsl_cd" type="text" style="height:22"><br>
              <input name="vsl_eng_nm" type="text" style="height:22"><br>
              <input name="crr_cd" type="text" style="height:22"><br>
              
              <input name="dispaly" type="text" size="20" maxlength="13" value="1,0" style="height:22" readonly>
              <input name="cnt_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
              </td>
          </tr>

		<tr>
          
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre> 
ComOpenPopupWithTarget('/opuscntr/VOP_VSK_0219.do?classId=VOP_VSK_0219', 465, 480, 'vsl_cd:vsl_cd|vsl_eng_nm:vsl_eng_nm|crr_cd:crr_cd', v_display + ',1', true);

ComOpenPopup('/opuscntr/VOP_VSK_0219.do?classId=VOP_VSK_0219', 465, 480, 'getVOP_VSK_0219', v_display + ',1', true);
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