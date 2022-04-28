<%@ page import="com.clt.bizcommon.util.BizComUtil"%>
<!--==============================================================================
'주  시 스 템 : 
'서브  시스템 : 샘플
'프로그램 ID : sample_serviceprovider.jsp
'프로그램 명  : javascript 샘플 구성
'프로그램개요 : javascript 샘플 구성 화면 이벤트들을 수행한다.
'작   성   자 : 김석준
'작   성   일 : 2009.08.09
==================================================================================
'수정자/수정일 : 
'수정사유/내역 : 
==============================================================================-->
<html>
<head>
<title>팝업 샘플</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="org.apache.log4j.Logger" %>

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
<script language="javascript" src="sample_serviceprovider.js"></script>

<%
	String strUsr_id		= "";
	String strUsr_nm		= "";
	String country  		= "";
	String ofc_cd   		= "";
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm(); 
		country = account.getCnt_cd(); 
		ofc_cd = account.getOfc_cd(); 
	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<link href="../../css/style.css" rel="stylesheet" type="text/css">
</head>
<body style="margin-left:20; margin-top:50">
<form name="form" style="width:800;">
  
<table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr>
      <td valign="top" height="475">       
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <tr>
          <th colspan="4"><b>10. Service Provider</b> </th>
          </tr>
          <tr>
          <td width="180" class="title">
          		country : <br> 
				ofc_cd : <br> 
				print_vndr_seq : <br> 
				vndr_seq : <br> 
				vndr_nm : <br> 
				sp_type : <br><br>
				vndr_lgl_eng_nm : <br> 
				eng_addr : <br> 
            	Display Option :
            </td>
            <td width="520" bgcolor="#EFEFEF">
              <input name="country" type="text" size="10" maxlength=6 style="height:22" value=<%=country%>><br>
              <input name="ofc_cd" type="text" size="10" maxlength=6 style="height:22" value=<%=ofc_cd%>><br>
              <input name="print_vndr_seq" type="text" size="10" maxlength=6 style="height:22"><br>
              <input name="vndr_seq" type="text" size="10" maxlength=6 style="height:22"><br>
              <input name="vndr_nm" type="text" size="10" maxlength=6 style="height:22"><br>
              <input name="sp_type" type="text" size="10" maxlength=6 style="height:22"><br><br><br>

              <input name="vndr_lgl_eng_nm" type="text" size="10" maxlength=6 style="height:22"><br>
              <input name="eng_addr" type="text" size="10" maxlength=6 style="height:22"><br>
              <input name="dispaly" type="text" size="20" maxlength="13" value="0,0" style="height:22" readonly>
              <input name="cnt_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
              </td>
          </tr>

		<tr>
          
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre> 
ComOpenPopupWithTarget('/opuscntr/UI_CTM_0435.do?classId=UI_CTM_0435&' + param, 630, 410, 'vndr_seq:vndr_seq|ofc_cd:ofc_cd|vndr_lgl_eng_nm:vndr_lgl_eng_nm|eng_addr:eng_addr', v_display + ',1', true);
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