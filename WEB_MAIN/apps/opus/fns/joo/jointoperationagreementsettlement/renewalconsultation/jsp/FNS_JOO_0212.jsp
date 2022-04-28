<%
/*
=========================================================
*Copyright(c) 2018 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_JOO_0212.jsp
*@FileTitle  : Issuing a THEA Invoice Report  
*@author     : CLT
*@version    : 1.0
*@since      : 2018/10/22
=========================================================
*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.framework.component.util.io.HttpUtil"%>
<%@ page import="org.apache.log4j.Logger"%>
<%
	Exception serverException   = null;		//서버에서 발생한 에러
	String strErrMsg = "";					//에러메세지
	int rowCount	 = 0;					//DB ResultSet 리스트의 건수
	String pageRows  = "100";
%>
<html>
<head>
<title>Invoice No Search</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script language="javascript">
	var gJoCrrCdComboItems 		= "";
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>
</head>

<body  onLoad="setupPage();">
<form name="form">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
<input type="hidden" name="inv_no" value='<%=JSPUtil.getParameter(request,"inv_no","") %>'>

<div class="layer_popup_title">
	<div class="page_title_area clear">
		<h2 class="page_title">
		<span>THEA Invoice No Search</span>
		</h2>
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button>
			<button type="button" id="btn_Ok" name="btn_Ok" class="btn_normal">OK</button>
			<button type="button" class="btn_normal" name="btn_Close" id="btn_Close">Close</button>
		</div>
	</div>
</div>

<div class="layer_popup_contents">
<div class="wrap_search_tab">
    <!-- opus_design_inquiry(S) -->
    <div class="opus_design_inquiry wFit">
    <!-- search table(S) -->
    <table class="wInherit">
        <colgroup>
            <col width="100" />
            <col width="25" />
            <col width="280" />
            <col width="*" />
            <col />
        </colgroup>
        <tbody>
            <tr>
				<th>Invoice Month</th>
			    <td><input type="text" style="width:60px;" class="input1" dataformat="ym" maxlength="6" name="fr_acct_yrmon" value="" id="fr_acct_yrmon" cofield="btn_vvd_from_back"/><!--  
			    --><button type="button" class="btn_left" name="btn_vvd_from_back" id="btn_vvd_from_back"></button><!--  
			    --><button type="button" class="btn_right" name="btn_vvd_from_next" id="btn_vvd_from_next"></button>~ <!--  
			    --><input type="text" style="width:60px;" class="input1" maxlength="6" dataformat="ym" name="to_acct_yrmon" value="" cofield="btn_vvd_to_next" id="to_acct_yrmon" /><!-- 
			    --><button type="button" class="btn_left" name="btn_vvd_to_back" id="btn_vvd_to_back"></button><!--  
			    --><button type="button" class="btn_right" name="btn_vvd_to_next" id="btn_vvd_to_next"></button></td>
			     <th>Partner</th>
				<td><script type="text/javascript">ComComboObject('jo_crr_cds', 1, 170, 0, 0);</script></td>
            </tr>
        </tbody>
    </table>
 </div>
</div>
<!-- search table(E) -->

<!-- opus_design_inquiry(E) -->
	<div class="wrap_result">
		<div class="opus_design_grid"  >
			<script type="text/javascript">ComSheetObject('sheet1');</script>		
		</div>
	</div>
</div>
</form>
