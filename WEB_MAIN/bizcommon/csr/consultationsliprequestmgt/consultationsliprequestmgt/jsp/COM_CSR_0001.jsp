<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_CSR_0001.jsp
*@FileTitle  : CSR Creation - Summary
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/27
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.event.ComCsr0001Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	ComCsr0001Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//Error from server
	String strErrMsg = "";						//Error message
	int rowCount	 = 0;						//The count of DB ResultSet list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";
	String inv_sub_sys_cd  = "";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String strOfc_cd        = "";
	inv_sub_sys_cd 			= JSPUtil.getParameter(request, "INV_SUB_SYS_CD".trim(), "");
	if(inv_sub_sys_cd == null || inv_sub_sys_cd.equals("")) {
		inv_sub_sys_cd = "CNI";
	}
	String parent_pgm_no  = JSPUtil.getParameter(request, "parentPgmNo".trim(), "");
	String pgm_no  = JSPUtil.getParameter(request, "pgmNo".trim(), "");
	Logger log = Logger.getLogger("com.clt.apps.ConsultationSlipRequestMgt.ConsultationSlipRequestMgt");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		strOfc_cd = account.getOfc_cd();

		event = (ComCsr0001Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}


		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>
<script type="text/javascript" type="text/javascript" src="bizcommon/csr/CoCsr.js"></script>

<script type="text/javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>
</head>

<form name="form" id="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="is_valid_vndr_seq" id="is_valid_vndr_seq" />
<input type="hidden" name="vndr_seq_hidden" id="vndr_seq_hidden" />
<input type="hidden" name="asa_gubun" id="asa_gubun" />
<input type="hidden" name="cost_ofc_cd" id="cost_ofc_cd" />
<input type="hidden" name="inv_sub_sys_cd" value="<%=inv_sub_sys_cd%>" id="inv_sub_sys_cd" />
<input type="hidden" name="parent_pgm_no" value="<%=parent_pgm_no%>" id="parent_pgm_no" />
<input type="hidden" name="pgm_no" value="<%=pgm_no%>" id="pgm_no" />

<!-- page_title_area(S) -->
	<div class="page_title_area clear">

	<!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
		<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->


	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
		<!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->
		<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!--  
		--><button type="button" class="btn_normal" name="btn_new"   id="btn_new">New</button><!-- 
		--><button type="button" class="btn_normal" name="btn_detail"   id="btn_detail">Detail</button>
	</div>
	<!-- opus_design_btn(E) -->

	<!-- page_location(S) -->
	<div class="location">
		<!-- location 내용 동적생성 (별도 코딩 불필요) -->
		<span id="navigation"></span>
	</div>
	<!-- page_location(E) -->
	</div>
<!-- page_title_area(E) -->

<!-- 조회영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
<div class="wrap_search">
	<div class="opus_design_inquiry">
		<table>
	         <colgroup>
	            <col width="85" />
	            <col width="200" />
	            <col width="100" />
	            <col width="120" />
	            <col width="50" />
	            <col width="30" />
	            <col width="120" />
	            <col width="*" />
	        </colgroup> 
	        <tbody>
				<tr>
					<th>Invoice Office</th>
					<td><input class="input2" name="inv_ofc_cd" type="text"  maxlength="6" style="width:76px;text-align:center;" value="<%=strOfc_cd%>" readonly id="inv_ofc_cd" /></td>
					<th>Confirmed Date</th>
					<td><input name="inv_cfm_dt" type="text" maxlength="10" style="width:80px;text-align:center;"  onkeyup='csr_isNumD(this,"Y");' onkeydown='csr_chkInput(this); csr_isNumD(this, "Y");' id="inv_cfm_dt" /><button type="button" id="btns_calendar1" name="btns_calendar1" class="calendar ir"></button></td>
					<td></td>
					<th class="sm">I/F</th>
					<td class="sm"><input type="radio" name="asanogb" value="A/P" class="trans" onkeypress="enter();" disabled id="asanogb" />&nbsp;<lable for="asanogb">To A/P<lable>&nbsp;&nbsp;&nbsp;<input type="radio" name="asanogb" value="ASA" class="trans" onkeypress="enter();" disabled id="asanogb1" />&nbsp;<lable for="asanogb1">To ASA</lable></td>
					<td></td>
				</tr>
			</tbody>
		</table>
		<table>
			<colgroup>
				<col width="85" />
	            <col width="*" />
			</colgroup>
			<tbody>
				<tr>
					<th>Payment S/P</th>
					<td><input type="text" name="vndr_seq" caption="Service Provider" style="width:55px;text-align:center;" class="input" value="" dataformat="num" maxlength="6" id="vndr_seq" /><button type="button" id="btns_vndr" name="btns_vndr" class="input_seach_btn"></button><input type="text" name="vndr_nm" caption="Service Provider" style="width:320px;" class="input2" value="" readonly id="vndr_nm" /></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
<!-- 조회영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
<div class="wrap_result">
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid">
	    <!-- 그리드 데이터 영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
			<script type="text/javascript">ComSheetObject('sheet1');</script>
	    <!-- 그리드 데이터 영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
	</div>
	<!-- opus_design_grid(E) -->
</div>	
</form>