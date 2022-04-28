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

<!-- 제품 include -->
<script language="javascript" type="text/javascript" src="/opuscntr/js/ibleaders.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/ibtab/ibmditab.js?version=U2"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/ibtab/ibmditabinfo.js?version=U2"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/ibtab/ibmditabscroll.js?version=U2"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/ibsheet/ibsheet.js?version=U6"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/ibcombo/ibmulticombo.js?version=U5"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/ibcombo/ibmulticomboinfo.js?version=U2"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/ibupload/ibupload.js?version=U3"></script>
<!-- 제품 include -->
<!-- common js include -->
<script language="javascript" type="text/javascript" src="/opuscntr/style/js/jquery-1.11.0.min.js?version=U2"></script> 
<script language="javascript" type="text/javascript" src="/opuscntr/style/js/jquery-ui.js?version=U2"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/style/js/opus_ui.js?version=U2"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/common/CoAxon.js?version=U2"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/common/CoCommon.js?version=U2"></script>
<script language="javascript" TYPE="text/javascript" src="/opuscntr/js/common/CoMessage.js?version=U5"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/common/CoFormControl.js?version=U3"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/common/CoPopup.js?version=U2"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/common/CoCalendar.js?version=U2"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/common/CoObject.js?version=U9"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/common/IBSheetInfo.js?version=U4"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/common/CoBiz.js?version=U2"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/common/CoMail.js?version=U2"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/common/CoUpload.js?version=U2"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/common/OfficeCodeMgr.js?version=U2"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/common/ConstantMgr.js?version=U2"></script>

<script language="javascript" src="sample_indiatax.js"></script>

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
          <th colspan="4"><b>11. India TAX</b> </th>
          </tr>
          <tr>
          	<td colspan="4">
          		<table width="100%" border="0" cellspacing="1" cellpadding="2">
          			<colgroup>
					<col width="15%" />
					<col width="40%" />
					<col width="40%" />
					<col width="*" />
					</colgroup>
          			<tr>
          				<th align="center">PARAM</th>
          				<th align="center">Input</th>
          				<th align="center">Return Value</th>
          				<td></td>
          			</tr>
          			<tr>
          				<td style="text-align:right;ime-mode:disabled;" >ofc_cd :</td>
          				<td colspan="2"><input name="ofc_cd" type="text" size="10" maxlength=6 style="height:22" value="<%=ofc_cd%>"></td>
          				<td></td>
          			</tr>
          			<tr>
          				<td style="text-align:right;ime-mode:disabled;" >vndr_seq :</td>
          				<td ><input name="vndr_seq" type="text" size="10" maxlength=6 style="height:22" value="100729"></td>
          				<td><input name="ida_gst_no2" type="text" size="15" maxlength=6 style="height:22" value=""> : NYK GST<br><!-- 
          				 --><input name="vndr_gst_no2" type="text" size="15" maxlength=6 style="height:22" value=""> : Vendor GST<br><!-- 
          				 --><input name="svc_acctg_cd2" type="text" size="15" maxlength=6 style="height:22" value=""> : Vendor SAC</td>
          			</tr>
          			<tr>
          				<td style="text-align:right;ime-mode:disabled;" >view_flg :</td>
          				<td colspan='2'><input name="view_flg" type="text" size="10" maxlength=6 style="height:22" value=""> Y : readonly, NULL or N : edit</td>
          				<td></td>
          			</tr>
          			<tr>
          				<td style="text-align:right;ime-mode:disabled;" >SGST :</td>
          				<td><input name="sgst_amt" style="text-align:right;ime-mode:disabled;" type="text" size="15" maxlength=19 style="height:22" value="100,000,000.01"></td>
          				<td><input name="sgst_amt2" style="text-align:right;ime-mode:disabled;" type="text" size="15" maxlength=19 style="height:22" value=""></td>
          				<td></td>
          			</tr>
          			<tr>
          				<td style="text-align:right;ime-mode:disabled;" >CGST :</td>
          				<td><input name="cgst_amt" style="text-align:right;ime-mode:disabled;" type="text" size="15" maxlength=19 style="height:22" value="100,000,001.01"></td>
          				<td><input name="cgst_amt2" style="text-align:right;ime-mode:disabled;" type="text" size="15" maxlength=19 style="height:22" value=""></td>
          				<td></td>
          			</tr>
          			<tr>
          				<td style="text-align:right;ime-mode:disabled;" >IGST :</td>
          				<td><input name="igst_amt" style="text-align:right;ime-mode:disabled;" type="text" size="15" maxlength=19 style="height:22" value="100,000,002.01"></td>
          				<td><input name="igst_amt2" style="text-align:right;ime-mode:disabled;" type="text" size="15" maxlength=19 style="height:22" value=""></td>
          				<td></td>
          			</tr>
          			<tr>
          				<td style="text-align:right;ime-mode:disabled;" >CESS :</td>
          				<td><input name="cess_amt" style="text-align:right;ime-mode:disabled;" type="text" size="15" maxlength=19 style="height:22" value="100,000,003.01"></td>
          				<td><input name="cess_amt2" style="text-align:right;ime-mode:disabled;" type="text" size="15" maxlength=19 style="height:22" value=""></td>
          				<td></td>
          			</tr>
          			<tr>
          				<td style="text-align:right;ime-mode:disabled;" >V.A.T :</td>
          				<td><input name="vat_amt" style="text-align:right;ime-mode:disabled;" type="text" size="15" maxlength=19 style="height:22" value=""></td>
          				<td><input name="vat_amt2" style="text-align:right;ime-mode:disabled;" type="text" size="15" maxlength=19 style="height:22" value=""></td>
          				<td></td>
          			</tr>
          			<tr>
          				<td style="text-align:right;ime-mode:disabled;" >W.H.T2 :</td>
          				<td><input name="whld2_amt" style="text-align:right;ime-mode:disabled;" type="text" size="15" maxlength=19 style="height:22" value="200,000,000.01"></td>
          				<td><input name="whld2_amt2" style="text-align:right;ime-mode:disabled;" type="text" size="15" maxlength=19 style="height:22" value=""></td>
          				<td></td>
          			</tr>
          			<tr>
          				<td style="text-align:right;ime-mode:disabled;" >GST TDS :</td>
          				<td><input name="gsttds_amt" style="text-align:right;ime-mode:disabled;" type="text" size="15" maxlength=19 style="height:22" value="200,000,001.01"></td>
          				<td><input name="gsttds_amt2" style="text-align:right;ime-mode:disabled;" type="text" size="15" maxlength=19 style="height:22" value=""></td>
          				<td></td>
          			</tr>
          			<tr>
          				<td style="text-align:right;ime-mode:disabled;" >W.H.T :</td>
          				<td><input name="whld_amt" style="text-align:right;ime-mode:disabled;" type="text" size="15" maxlength=19 style="height:22" value=""></td>
          				<td><input name="whld_amt2" style="text-align:right;ime-mode:disabled;" type="text" size="15" maxlength=19 style="height:22" value=""></td>
          				<td></td>
          			</tr>
          			<tr>
          				<td style="text-align:right;ime-mode:disabled;" >Display Option :</td>
          				<td colspan="2"><input name="dispaly" type="text" size="20" maxlength="13" value="0,0" style="height:22" ><!-- 
          				             --><input name="cnt_btn" type="button" class="button" value="클릭">&nbsp;<input type="button" onclick="reset()" value="지우기"></td>
          				<td></td>
          			</tr>
          		</table>
          	</td>
          </tr>

		<tr>
          
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre> 
(사용예제)
ComOpenPopupWithTarget('/opuscntr/COM_ENS_T01.do?classId=COM_ENS_T01&' + param, 500, 380, sTargetObjList, sDisplay, true);

ComOpenPopup('/opuscntr/COM_ENS_T01.do?classId=COM_ENS_T01&' + param, 500, 380, 'getCOM_ENS_T01', sDisplay + ',1', true);

CallBackFunction 처리
function getCOM_ENS_T01(rowArray) {
	//alertComPopupData(rowArray);
	var formObj = document.form;
	var obj = new Object();
	obj.sgst_amt = rowArray[0][0]; //SGST 
	obj.cgst_amt = rowArray[0][1]; //CGST 
	obj.igst_amt = rowArray[0][2]; //IGST 
	obj.cess_amt = rowArray[0][3]; //CESS 
	obj.vat_amt = rowArray[0][4]; //V.A.T
	obj.whld2_amt = rowArray[0][5]; //W.H.T2
	obj.gsttds_amt = rowArray[0][6]; //GST TDS
	obj.whld_amt = rowArray[0][7]; //W.H.T
	obj.ida_gst_no = rowArray[0][8]; //NYK GST
	obj.vndr_gst_no = rowArray[0][9]; //Vendor GST
	obj.svc_acctg_cd = rowArray[0][10]; //Vendor SAC
	
}	
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