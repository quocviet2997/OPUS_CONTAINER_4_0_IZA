<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0023.jsp
*@FileTitle  : Other Revenue Invoice Inquiry
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
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicecreation.manualarcreation.event.FnsInv0023Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsInv0023Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			// Errors from server.
	String strErrMsg = "";						// Error message.
	int rowCount	 = 0;						// DB ResultSet list count
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "10";
	String strUsr_id		= "";
	String strUsr_nm		= "";
	String strOfc_cd		= "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceCreation.ManualARCreation");
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		strOfc_cd = account.getOfc_cd();
		event = (FnsInv0023Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
	} catch(Exception e) {
		out.println(e.toString());
	}
%>

<script type="text/javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			showErrMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form" method="post">
<input id="f_cmd" name="f_cmd" type="hidden" />
<input id="pagerows" name="pagerows" value="<%=pageRows %>" type="hidden" />
<input id="pagetype" name="pagetype" value="I" type="hidden" />
<input id="user_ofc_cd" name="user_ofc_cd" value="<%=strOfc_cd %>" type="hidden" />
<input id="office" name="office" type="hidden" />
<input id="office_cnt_cd" name="office_cnt_cd" value="" type="hidden" />
<input id="ar_ctrl_ofc_cd" name="ar_ctrl_ofc_cd" type="hidden" />
<input id="ar_ofc_cd_txt" name="ar_ofc_cd_txt" type="hidden" />
<input id="ar_ofc_cd_1" name="ar_ofc_cd_1" type="hidden" />
<input id="locl_curr_cd_1" name="locl_curr_cd_1" type="hidden" />
<input id="loc_cd" name="loc_cd" type="hidden" />
<input id="eff_dt" name="eff_dt" type="hidden" />
<input id="curr_cd" name="curr_cd" type="hidden" />


<!-- page_title_area(S) -->
<div class="page_title_area clear ">
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button>
	</h2>
	<!-- page_title(E) -->

    <!-- opus_design_btn(S) -->
    <div class="opus_design_btn">
        <!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->
		<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!--  
		--><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!--
		--><button type="button" class="btn_normal" name="btn_downExcel" id="btn_downExcel">Down Excel</button>			
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

<div class="wrap_search">
	<div class="opus_design_inquiry wFit">
		<table>
			<tbody>
				<colgroup>
					<col width="20"/>
					<col width="50"/>
					<col width="50"/>
					<col width="310"/>
					<col width="70"/>
					<col width="10"/>
					<col width="6"/>
					<col width="*"/>
				</colgroup> 
				<tr class="h23">
					<td></td>
					<th class="sm"><input name="gubun" type="radio" value="1" class="trans" checked> G/L Date<label></label></th>
					<th class="sm"><input name="gubun" type="radio" value="2" class="trans">  Creation Date<label></label></th>
					<td class="sm"><input name="fm_dt" type="text" style="width:75px; text-align:left" class="input1" dataformat="ymd" required maxlength="8" value="" cofield="to_dt" caption="start date"><button type="button" class="calendar ir" name="btns_calendar1" id="btns_calendar1"></button> ~ <input name="to_dt" type="text" style="width:75px;text-align:left" class="input1" dataformat="ymd" required maxlength="8" value="" cofield="fm_dt" caption="end date"><button type="button" class="calendar ir" name="btns_calendar2" id="btns_calendar2"></button></td>
					<th></th>
					<th>Office</th>
					<th></th>
					<td><script type="text/javascript">ComComboObject('ar_ofc_cd', 1, 100, 0);</script></td>	
				</tr>
			</tbody>
		</table>
		
		<table class="search"  style="width:100%"> 
			<tr class="h23">
				<th width="90px">CR Account</th>
				<td width="130px" style="padding-left:2"><script type="text/javascript">ComComboObject('acct_cd', 3, 97, 0);</script></td>										
				<th width="58px" align="right">Slip No. </th>
				<td width="280px"><input name="slp_no" type="text" style="width:234px;" class="input" value="" dataformat="engup" maxlength="27"></td>
				<th width="60px">User ID</th>
				<td width=""><input name="cre_usr_id" type="text" style="width:120px;" class="input" value="" maxlength="20"></td>
			</tr>
			<tr class="h23">
				<th>Actual Cust.</th>
				<td width="" colspan="6"><input name="act_cust_cnt_cd" id="act_cust_cnt_cd" type="text" style="width:30px;text-align:left" class="input" value="" maxlength="2" dataformat="engup"><input name="act_cust_seq" type="text" style="width:62px;text-align:left" class="input" maxlength="6" value="" dataformat="num"><button type="button" class="input_seach_btn" name="btns_cust1" id="btns_cust1"></button><input name="cust_nm" type="text" style="width:300px;" class="input2" value="" readonly tabIndex="-1"><button type="button" class="input_seach_btn" name="btns_cust2" id="btns_cust2"></button></td>
			</tr>
		</table>
	</div>
</div>


<div class="wrap_result">
	<div class="opus_design_grid">	
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
</div>			
</form>