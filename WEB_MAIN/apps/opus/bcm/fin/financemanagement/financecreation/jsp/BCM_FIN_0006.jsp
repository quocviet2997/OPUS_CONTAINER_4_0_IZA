<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName : BCM_FIN_0006.jsp
*@FileTitle : GL Monthly Exchange Rate
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
<%@ page import="com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event.BcmFin0006Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%	BcmFin0006Event event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException = null;			//Error from server
	String strErrMsg = "";						//Error message

	String strUsr_id = "";
	String strUsr_nm = "";
	Logger log = Logger.getLogger("com.clt.apps.opus.bcm.fin.financemanagement.financecreation");
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
	   
		event = (BcmFin0006Event)request.getAttribute("Event");
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
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
<!-- page_title(E) -->
<!-- opus_design_btn(S) -->
<div class="opus_design_btn"> 
	<!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->
	<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!-- 
	 --><button type="button" class="btn_normal" name="btn_new"   id="btn_new">New</button><!-- 
	 --><button class="btn_normal" name="btn_DownExcel" id="btn_DownExcel" type="button">Down Excel</button><!--
	 <button type="button" class="btn_normal" name="btn_save"   id="btn_save">Save--></button><!-- 
	 --><!-- <button type="button" class="btn_normal" name="btn_loadExcel"   id="btn_loadExcel">Load Excel</button> -->
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
<div class= "wrap_search">
<div class= "opus_design_inquiry wFit">
	    <table>
	         <colgroup>
	            <col width="100" />
	            <col width="50" />
	            <col width="80" />
	            <col width="*" />
	        </colgroup> 
	        <tbody>
				<tr>
					<th>Exchange Rate Yrmon</th>
					<td><input type="text" style="width:60px;text-align:center;text-transform:uppercase;" class="input1" name="s_acct_xch_rt_yrmon" maxlength="6" dataformat="ym" required="" caption="Execute Year Month" id="s_acct_xch_rt_yrmon" /><button type="button" id="acct_xch_rt_yrmon_cal" name="acct_xch_rt_yrmon_cal" class="calendar ir"></button></td>
					<th>Currency Code</th>
					<td><!--<input type="text" style="width:40px;text-align:center;ime-mode:disabled;text-transform:uppercase;" dataformat="engup" class="input" name="s_curr_cd" maxlength="3" fullfill="" caption="Currency Code" id="s_curr_cd" />--><script  type="text/javascript">ComComboObject('s_curr_cd', 1, 90, 0, 1);</script></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
<!-- wrap search (E) -->

<!-- wrap result (S) -->
<div class="wrap_result">
	<div class="opus_design_grid">
	<!-- opus_design_btn(S) -->
		<div class="opus_design_btn"><!--
		    <button type="button" class="btn_normal" name="btn_add" id="btn_add">Row Add</button> 
		     <button type="button" class="btn_normal" name="btn_del" id="btn_del">Row Delete</button>-->
		</div>
	<!-- opus_design_btn(E) -->
	<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
</div>
<!-- wrap result (E) -->
</form>