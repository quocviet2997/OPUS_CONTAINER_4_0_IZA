<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_FIN_0002.jsp
*@FileTitle  : AP Finance Direction Conversion
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
<%@ page import="com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event.BcmFin0002Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%	BcmFin0002Event event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException = null;			//Error from server
	String strErrMsg = "";						//Error message
	String strUsr_id = "";
	String strUsr_nm = "";
	Logger log = Logger.getLogger("com.clt.apps.opus.bcm.fin.financemanagement.financecreation");
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		event = (BcmFin0002Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
	} catch(Exception ex) {
		log.error("err " + ex.toString(), ex);
		//out.println(e.toString());
	}
%>
<script type="text/javascript">
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
		--><button type="button" class="btn_normal" name="btn_loadExcel"   id="btn_loadExcel">Load Excel</button>
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
		         <colgroup>
		            <col width="70" />
		            <col width="100" />
		            <col width="70" />
		            <col width="*" />
		        </colgroup> 
		        <tbody>
					<tr>
						<th>Service Lane</th>
						<td><input type="text" style="width:40px;text-align:center;ime-mode:disabled" class="input1" name="s_slan_cd" maxlength="3" fullfill required caption="Service Lane Code" dataformat="engup"><button type="button" class="input_seach_btn" name="pop_slan" id="pop_slan" ></button></td>
						<th>Revenue Lane</th>
						<td><input type="text" style="width:50px;text-align:center;ime-mode:disabled" class="input" name="s_rlane_cd" maxlength="5" dataformat="engup" id="s_rlane_cd"><button type="button" class="input_seach_btn" name="btn_rlane_search" id="btn_rlane_search"></button></td>
					</tr>
				</tbody>
			</table>
			</div>
	</div>
	<!-- wrap search (E) -->
	
	<!-- wrap result (S) -->
	<div class="wrap_result">
	    <!-- 조회영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
		<div class="opus_design_grid">
		    <!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
		<!-- 그리드 버튼 영역(데이터 그리드 상단에 위치) -->
		<!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->
		    <button type="button" class="btn_normal" name="btn_add" id="btn_add">Row Add</button>
		    <button type="button" class="btn_normal" name="btn_del" id="btn_del">Row Delete</button>
		</div>
		<!-- opus_design_btn(E) -->
		<!-- 그리드 데이터 영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
		<script type="text/javascript">ComSheetObject('sheet1');</script>
		<!-- 그리드 데이터 영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
		</div>
	</div>
	<!-- wrap result (E) -->
</form>