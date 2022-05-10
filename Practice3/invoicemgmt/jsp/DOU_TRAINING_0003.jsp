<%@page import="monfox.toolkit.snmp.agent.modules.SnmpV2Mib.SysOREntry"%>
<%
/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : DOU_TRAINING_0003.jsp
*@FileTitle : Invoice Management
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.25
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.25 
* 1.0 Creation
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.esm.clv.invoice.invoicemgmt.event.DouTraining0003Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	DouTraining0003Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String partnerItems		= "";
	Logger log = Logger.getLogger("com.clt.apps.Invoice.InvoiceMgmt");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (DouTraining0003Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
		else{
			partnerItems = eventResponse.getETCData("partnerCb");
		}

		// 초기화면 로딩시 서버로부터 가져온 데이터 추출하는 로직추가 ..
		
		
	}catch(Exception e) {
		out.println(e.toString());
	}
%>
<html>
<head>
<title>Invoice Management</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script language="javascript">
	var partnerCb = "ALL<%=partnerItems%>";
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>
<script language="javascript" type="text/javascript" src="apps/opus/esm/clv/invoice/invoicemgmt/script/calendarFnc.js"></script>
<script language="javascript" type="text/javascript" src="apps/opus/esm/clv/invoice/invoicemgmt/script/comboFnc.js"></script>
<script language="javascript" type="text/javascript" src="apps/opus/esm/clv/invoice/invoicemgmt/script/tabFnc.js"></script>
</head>

<body  onLoad="setupPage();">
<form name="form" id="demoform">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
<div class="page_title_area clear">
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	
	<div class="location">
		<span id="navigation"></span>
	</div>
</div>

<div class="wrap_search">
	<div class="opus_design_inquiry">
		<table>
			<colgroup>
				<col style="width: 80px">
				<col style="width: 400px">
				<col style="width: 50px">
				<col style="width: 120px">
				<col style="width: 50px">
				<col style="width: 120px">
				<col style="width: 50px">
				<col style="width: 120px">
			</colgroup>
			<tbody>
				<tr>
					<th style="text-align: center;">Year Month</th>
					<td>
						<input type="text" style="width:100px;text-align:center;" name="dt_fm" id="dt_fm" dataformat="ym" maxLength="7" minlength="6"><!--  
						--><button type="button" class="btn_left" name="btn_Pre_Month_Fm" id="btn_Pre_Month_Fm"></button><!--  
						--><button type="button" class="btn_right" name="btn_Next_Month_Fm" id="btn_Next_Month_Fm"></i></button> <!--
						--><input type="text" style="width:100px;text-align:center;" name="dt_to" id="dt_to" dataformat="ym" maxLength="7" minlength="6"><!--  
						--><button type="button" class="btn_left" name="btn_Pre_Month_To" id="btn_Pre_Month_To"></i></button><!--  
						--><button type="button" class="btn_right" name="btn_Next_Month_To" id="btn_Next_Month_To"></i></button>
					</td>
					<th>Partner</th>
					<td><script type="text/javascript">ComComboObject('partner',1,120, 1, 0, 0);</script></td>
					<th>Lane</th>
					<td><script type="text/javascript">ComComboObject('lane',1,120, 1, 0, 0);</script></td>
					<th>Trade</th>
					<td><script type="text/javascript">ComComboObject('trade',1,120, 1, 0, 0);</script></td>
					<td>
						<div class="opus_design_btn">
							<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!-- 
							--><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button><!-- 
							--><button type="button" class="btn_normal" name="btn_DownExcel" id="btn_DownExcel">Down Excel</button><!-- 
							--><button type="button" class="btn_normal" name="btn_DownExcel2" id="btn_DownExcel2">Down Excel 2</button>
						</div>
					</td>				
				</tr>
			</tbody>
		</table>
	</div>
</div>

<script type="text/javascript">ComTabObject('tab1');</script>

<div class="wrap_result" id="summary_grid">
	<h2 class="title_design">Summary</h2>
	<div class="opus_design_grid">
		<script language="javascript">ComSheetObject('sheet1');</script>
	</div>
</div>

<div class="wrap_result" id="details_grid">
	<h2 class="title_design">Details</h2>
	<div class="opus_design_grid">
		<script language="javascript">ComSheetObject('sheet2');</script>
	</div>
</div>
<!-- 개발자 작업	-->


<!-- 개발자 작업  끝 -->
</form>
</body>
</html>