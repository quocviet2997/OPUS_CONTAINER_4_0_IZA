<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_2003.jsp
*@FileTitle  : BCM_CCD_2003
*@author     : CLT
*@version    : 1.0
*@since      : 2014/12/02
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.mstmgmt.event.BcmCcd2003Event"%>
<%@ page import="org.apache.log4j.Logger" %>
   
<%
	BcmCcd2003Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.CommonCode.MstMgmt");


	String hamo_tp_cd		= ""; //
	String hamo_trf_cd		= "";//
	String hamo_cd_desc		= "";//
	String calllFunc 		= "";//


	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (BcmCcd2003Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// 초기화면 로딩시 서버로부터 가져온 데이터 추출하는 로직추가 ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>
<script type="text/javascript">
	var G_MDAA_CHK;

	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="ibflag" value="I" id="ibflag" />

<input type="hidden" name="login_usr_id" value="<%=strUsr_id%>" id="login_usr_id" />

<input type="hidden" name="tbl_nm" id="tbl_nm" />
<input type="hidden" name="col_nm" id="col_nm" />
 
<!-- page_title_area(S) -->
<div class="page_title_area clear">
<!-- page_title(S) -->
<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
<!-- page_title(E) -->
<!-- opus_design_btn(S) -->
<div class="opus_design_btn">
	<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
	 --><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button>
</div>
<!-- opus_design_btn(E) -->

<!-- page_location(S) -->
<div class="location">
<!-- location 내용 동적생성 (별도 코딩 불필요) -->
<span id="navigation"></span>
</div>
</div>

<!-- page_title_area(E) -->

<!-- wrap_search(S) -->  
<div class="wrap_search">
<!-- opus_design_inquiry (S) -->
<div class="opus_design_inquiry wFit">
	<!--  biz_1  (S) -->
	<table> 
		<colgroup>
			<col width="50">
			<col width="100">
			<col width="100">
			<col width="*">
		</colgroup>
		<tr class="h23">
			<th width="40"> Period</th>
			<td width="200"><input type="text" style="width:80px;" class="input" name="fm_rqst_dt" dataformat="ymd"  caption="Request From Date"><!-- 
			 -->~ <!-- 
			 --><input type="text" style="width:80px;" class="input" name="to_rqst_dt" dataformat="ymd"  caption="Request To Date" ><!-- 
			  --><button type="button" name="btns_calendar" id="btns_calendar"  class="calendar ir"></button>				
			</td>
			<th style="width:80px;">UI Name</th>
			<td style="width:140px;"><script type="text/javascript">ComComboObject('mst_table_cd', 1, 140, 1, 0, 0, false)</script></td>
			<th style="width:80px;">UI Field</th>
			<td style="width:140px"><script type="text/javascript">ComComboObject('mst_column_cd', 1, 140, 1, 0, 0, false)</script></td>
			<td style="width:30%"></td>
		</tr>
	</table>
</div>
<!-- opus_design_inquiry (E) -->
</div>

<!-- wrap_result(S) -->  
<div class="wrap_result">
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid">
		<div class="opus_design_btn" >
			<button class="btn_accent" name="btn_more" id="btn_more" type="button">more</button>
		</div>
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
	<!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->  
</form>
