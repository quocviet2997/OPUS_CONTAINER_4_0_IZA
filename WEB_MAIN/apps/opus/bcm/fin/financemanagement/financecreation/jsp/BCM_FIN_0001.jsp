<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_FIN_0001.jsp
*@FileTitle  : AP PERIOD
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
<%@ page import="com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event.BcmFin0001Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	BcmFin0001Event event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException = null;			//Error from server
	String strErrMsg = "";						//Error message

	String strUsr_id = "";
	String strUsr_nm = "";
	Logger log = Logger.getLogger("com.clt.apps.opus.bcm.fin.financemanagement.financecreation");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();

		event = (BcmFin0001Event)request.getAttribute("Event");
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
<input type="hidden" name="f_cmd" id="f_cmd" />

<!-- page_title_area(S) -->
	<div class="page_title_area clear">

	<!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
		<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->

	<!-- opus_design_btn(S) --> 
	<div class="opus_design_btn"><!--
	--><button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!--
	--><button type="button" class="btn_normal" name="btn_new"  id="btn_new">New</button><!--
	--><button type="button" class="btn_normal" name="btn_save"   id="btn_save">Save</button><!--
	--><button type="button" class="btn_normal" name="btn_loadExcel"   id="btn_loadExcel">Load Excel</button><!--
	--><button type="button" class="btn_normal" name="btn_downExcel" 	id="btn_downExcel">Down Excel</button><!--
	--></div>
	<!-- opus_design_btn(E) -->

	<!-- page_location(S) -->
	<div class="location">
		<span id="navigation"></span>
	</div>
	<!-- page_location(E) -->
	</div>
<!-- page_title_area(E) -->

<!-- wrap search (S) -->
<div class="wrap_search"> 
	<div class="opus_design_inquiry wFit">
	    <table>
	         <colgroup>
	            <col width="80" />
	            <col width="180" />
	            <col width="80" />
	            <col width="150" />
	            <col width="80" />
	            <col width="150" />
	            <col width="80" />
	            <col width="*" />
	        </colgroup> 
	        <tbody>
				<tr>
					<th>Effective Date</th>
					<td><!--
					--><input type="text" style="width:60px;text-align:center;" class="input1" name="s_eff_yrmon" dataformat="ym" required caption="Effective Year Month" id="s_eff_yrmon" /><!--
					--><button type="button" id="eff_yrmon_cal" name="eff_yrmon_cal" class="calendar ir"></button><!--
					--></td>
					<th>System Code</th>
					<td><script language="javascript">ComComboObject('s_sys_div_cd', 2, 130, 1, 0,0,false,1);</script></td>
					<th>Office Code</th>
					<!--<td><input type="text" style="width:100px;text-align:center;ime-mode:disabled;text-transform:uppercase;" class="input" maxlength="6" name="s_ofc_cd" id="s_ofc_cd" /></td>-->
					<td><script type="text/javascript">ComComboObject('s_ofc_cd', 2, 100, 0, 0);</script></td>
					<th>Payable Division</th>
					<td><!--
					--><select style="width:120px;" class="input" name="s_ar_ap_div_cd"><!--
					--><option value="">ALL</option><!--
					--><option value="P">AP</option><!--
					--><option value="R">AR</option><!--
					--></select><!--
					--></td>
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
		--><button type="button" class="btn_normal" name="btn_opennextmonth" id="btn_opennextmonth">Open Next Period</button><!--
	    --><button type="button" class="btn_normal" name="btn_allopen" id="btn_allopen">All Open</button><!--
	    --><button type="button" class="btn_normal" name="btn_allclose" id="btn_allclose">All Close</button><!--
		--><button type="button" class="btn_normal" name="btn_add" id="btn_add">Row Add</button><!--
		--><button type="button" class="btn_normal" name="btn_del" id="btn_del">Row Delete</button><!--
		--></div>
		<!-- opus_design_btn(E) -->
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
</div>
<!-- wrap result (E) -->
</form>