<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_FIN_0003.jsp
*@FileTitle  : AR Master Revenue VVD
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/02
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event.BcmFin0003Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%	BcmFin0003Event event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException = null;			//Error from server
	String strErrMsg = "";						//Error message

	String strUsr_id = "";
	String strUsr_nm = "";
	Logger log = Logger.getLogger("com.clt.apps.opus.bcm.fin.financemanagement.financecreation");
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
	   
		event = (BcmFin0003Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
		
	} catch(Exception ex) {
		log.error("err " + ex.toString(), ex);
		//out.println(e.toString());
	}
%>
<script language="javascript">
function setupPage(){
	var errMessage = "<%=strErrMsg%>";
	if (errMessage.length >= 1) {
		ComShowMessage(errMessage);
	} // end if
	loadPage();
}
</script>

<form name="form">
<input type="hidden" name="f_cmd">
<!-- <input type="hidden" name="slan_cd">
<input type="hidden" name="sconti_cd">
<input type="hidden" name="rlane_cd"> -->


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
        --><button type="button" class="btn_normal" name="btn_save"   id="btn_save">Save</button><!--
		--><!--<button type="button" class="btn_normal" name="btn_loadExcel"   id="btn_loadExcel">Load Excel</button>--><!--
		--><button type="button" class="btn_normal" name="btn_vvdCreate"   id="btn_vvdCreate">Common & Charter VVD Create</button>
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

<!-- wrap search (S) -->
<div class="wrap_search">
<!-- 조회영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
<div class="opus_design_inquiry wFit">
	    <table>
	        <tbody>
	        <tr>
					<th width="80">Rev Yrmon</th>
					<td width="160">
						<input type="text" style="width:100px;text-align:center;" class="input" name="s_rev_yrmon" dataformat="ym" caption="Revenue Year Month"><!--
						--><button type="button" class="calendar" name="rev_yrmon_cal" id="rev_yrmon_cal" onClick="openWinSearchCustomer('cust_cd')"></button>
					</td>
					<th width="80">Vessel Code</th>
					<td width="90">
						<input type="text" style="width:60px;text-align:center;" dataformat="engup" class="input1" name="s_vsl_cd" maxlength="4" required fullfill caption="Vessel Code"><!--
						--><button type="button" class="input_seach_btn" name="pop_vsl_code" id="pop_vsl_code"></button>
					</td>
					<th width="50">VVD</th>
					<td>
						<input type="text" style="width:90px;text-align:center;" dataformat="engup" class="input" name="s_vvd" maxlength="10">
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
<!-- wrap search (E) -->
	
	    <!-- 조회영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->

<!-- wrap result (S) -->
<div class="wrap_result">	
	<div class="opus_design_grid">
    
	<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
		<!-- 그리드 버튼 영역(데이터 그리드 상단에 위치) -->
		<!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->
		</div>
	<!-- opus_design_btn(E) -->
	
	
	<!-- 그리드 데이터 영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
	<script language="javascript">ComSheetObject('sheet1');</script>
	<!-- 그리드 데이터 영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
	</div>
</div>
<!-- wrap result (E) -->	
</form>