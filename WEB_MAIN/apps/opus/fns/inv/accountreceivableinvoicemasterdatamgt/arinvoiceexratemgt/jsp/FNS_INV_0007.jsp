<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0007.jsp
*@FileTitle  : Ex. Rate Creation by Customer
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/14
=========================================================
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemasterdatamgt.arinvoiceexratemgt.event.FnsInv0007Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsInv0007Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			// Errors from server.
	String strErrMsg = "";						// Error message.
	int rowCount	 = 0;						// DB ResultSet list count
	
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String strOfcCd			= "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMasterDataMgt.ARInvoiceExRateMgt");
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
	    strOfcCd = account.getOfc_cd();
	   
	   
		event = (FnsInv0007Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
		
		// Get data from server. ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		
	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<script  type="text/javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			showErrMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
<input type="hidden" name="pagetype" value = "E">
<input type="hidden" name="strOfcCd" value="<%=strOfcCd %>">
<input type="hidden" name="ar_ctrl_ofc_cd" >
<input type="hidden" name="ar_ofc_cd" >
<input type="hidden" name="loc_cd" >
<input type="hidden" name="eff_dt" >
<input type="hidden" name="curr_cd" >
<input type="hidden" name="locl_curr_cd" >
<input type="hidden" name="altn_curr_div_cd">
<input type="hidden" name="xch_rt_rvs_flg">

<!-- page_title_area(S) -->
<div class="page_title_area clear ">
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button>
	</h2>
	<!-- page_title(E) -->

	    <!-- opus_design_btn(S) -->
	    <div class="opus_design_btn"><!-- 
			 --><button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_save" id="btn_save">Save</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_downexcel" id="btn_downexcel">Down Excel</button><!-- 
	     --></div>
	    <!-- opus_design_btn(E) -->
    
	<!-- page_location(S) -->
	<div class="location">
		<!-- location 내용 동적생성 (별도 코딩 불필요) -->
		<span id="navigation"></span>
	</div>
	<!-- page_location(E) -->

</div>
<!-- page_title_area(E) -->

<div class="wrap_search">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry wFit">
		<!-- biz_1  (S) -->
		<table class="search" border="0" style="width: 979px;">
			<tr class="h23">
				<td width="70px"><b>Cust. Code</b></td>
				<td width="280px"><!-- 
					 --><input type="text" style="ime-mode: disabled; width: 30px" value="" class="input1" dataformat="engup" name="cust_cnt_cd" maxlength="2" onKeyUp="if(ComChkLen(this, 2)==2){ComSetNextFocus();}"><!-- 
					 --><input type="text" style="width: 49px" value="" name="cust_seq" dataformat="num" class="input1" onChange="fn_cust_nm();" maxlength="6"><!-- 
					 --><input type="text" style="width: 150px" value="" class="input2" name="cust_nm" readonly><!-- 
					 --><button type="button" class="input_seach_btn" name="btn_custNm" id="btn_custNm"></button><!-- 
				 --></td>
				<td width="120px"><b>Multi Cust.</b><input type="checkbox" value="0"	name="dispaly" class="trans" disabled id="dispaly" onClick="fn_buttonChk(this);"> <button type="button" class="input_seach_btn" name="exrate_btn" id="exrate_btn" style="display: none"></button></td>
				<td width="95px"><b>Local Currency</b></td>
				<td width="80px"><script type="text/javascript">ComComboObject('inv_curr_cd', 1, 70, 0);</script></td>
				<td width="44px"><b>Bound</b></td>
				<td width="70px"><!-- 
					 --><select style="width: 50px;" class="input"	name="io_bnd_cd"><!-- 
						 --><option value="" selected>ALL</option><!-- 
						 --><option value="O">O/B</option><!-- 
						 --><option value="I">I/B</option><!-- 
					 --></select></td>
				<td width="44px"><b>Month</b></td>
				<td width="90px"><input type="text" style="width: 55px" value="" maxlength="7" name="fm_dt" dataformat="num" onBlur="fn_ComGetMaskedValue();"><button type="button" class="calendar ir" name="btns_calendar" id="btns_calendar"></button></td>
				<td width="34px"><b>Office</b></td>
				<td><script  type="text/javascript">ComComboObject('ar_ofc_cd2', 1, 100, 1);</script>						
				</td>
			</tr>
		</table>
		<!-- biz_1  (E) -->
	</div>	
</div>			

<div class="wrap_result">
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid" id="mainTable" >
		<!-- opus_design_btn(S) -->
	    <div class="opus_design_btn">
	        <!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->
			<button type="button" class="btn_normal" name="btn_add" id="btn_add">Row Add</button>
			<button type="button" class="btn_normal" name="btn_copy" id="btn_copy">Row Copy</button>
			<button type="button" class="btn_normal" name="btn_del" id="btn_del">Delete</button>					
	    </div>
	    <!-- opus_design_btn(E) -->
	    									
		<!-- 그리드 데이터 영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
	    <script  type="text/javascript">ComSheetObject('sheet1');</script>
	    <!-- 그리드 데이터 영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
	</div>
	<!-- opus_design_grid(E) -->			
</div>
<!-- opus_design_inquiry(E) -->

</form>