<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0008.jsp
*@FileTitle  : Ex. Rate Entry by Date 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/10
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemasterdatamgt.arinvoiceexratemgt.event.FnsInv0008Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsInv0008Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			// Errors from server.
	String strErrMsg = "";						// Error message.
	int rowCount	 = 0;						// DB ResultSet list count
	
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String strOfcCd = "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMasterDataMgt.ARInvoiceExRateMgt");
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
	    strOfcCd = account.getOfc_cd();	   
	   
		event = (FnsInv0008Event)request.getAttribute("Event");
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
<script type="text/javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			showErrMessage(errMessage);
		} // end if
		loadPage();
	}
</script>
<body  onLoad="setupPage();">
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="pagetype" value="I" id="pagetype" />
<input type="hidden" name="strOfcCd" value="<%=strOfcCd %>" id="strOfcCd" />
<input type="hidden" name="ar_ctrl_ofc_cd" id="ar_ctrl_ofc_cd" />
<input type="hidden" name="ar_ofc_cd" id="ar_ofc_cd" />
<input type="hidden" name="fm_dt" id="fm_dt" />
<input type="hidden" name="to_dt" id="to_dt" />
<input type="hidden" name="loc_cd" id="loc_cd" />
<input type="hidden" name="eff_dt" id="eff_dt" />
<input type="hidden" name="curr_cd" id="curr_cd" />
<input type="hidden" name="ar_ofc_cd_1" id="ar_ofc_cd_1" />
<input type="hidden" name="locl_curr_cd_1" id="locl_curr_cd_1" />
<input type="hidden" name="xch_rt_tp_cd" id="xch_rt_tp_cd" />
<input type="hidden" name="xch_rt_n3rd_tp_cd" id="xch_rt_n3rd_tp_cd" />
<input type="hidden" name="locl_curr_cd">
<input type="hidden" name="altn_curr_div_cd">
<input type="hidden" name="call_page_name" id="call_page_name" value="FNS_INV_0008">
<input type="hidden" name="tmp_pk" id="tmp_pk" value="">

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
		<button type="button" class="btn_accent" name="btn_history" 	    id="btn_history">History</button><!--  		
		--><button type="button" class="btn_accent" name="btn_retrieve" 	id="btn_retrieve">Retrieve</button><!--  		
		--><button type="button" class="btn_normal" name="btn_new"  		id="btn_new">New</button><!--  		
		--><button type="button" class="btn_normal" name="btn_save" 		id="btn_save">Save</button>
	</div>
	<!-- opus_design_btn(E) -->
	<!-- page_location(S) -->
	<div class="location">
		<!-- location 내용 동적생성 (별도 코딩 불필요) -->
		<span id="navigation"></span>
	</div>
</div>
<!-- page_title_area(E) -->


<!-- opus_design_inquiry(S) -->
<div class= "wrap_search">
	<div class= "opus_design_inquiry">
		<table>
			<tbody>
				<colgroup>
					<col width="95px"/>
					<col width="100px"/>
					<col width="44px"/>
					<col width="110px"/>
					<col width="30px"/>
					<col width="250px"/>
					<col width="44px"/>
					<col width="*"/>
				<tr>
					<th>Local Currency</th>
					<td><script type="text/javascript">ComComboObject('inv_curr_cd', 1, 90, 1, 1);</script></td>
					<th>Bound</th>
					<td><select style="width: 70px;" class="input" name="io_bnd_cd" id="io_bnd_cd">
							<option value="" selected>ALL</option>
							<option value="O">O/B</option>
							<option value="I">I/B</option>
						</select>
					</td>
						<th>Date</th>
						<td><input type="text" style="width: 75px;" value="" name="fm_dt1" onblur="fn_ComGetMaskedValue('fm_dt1');" onkeyup="javascript:checkFmDtLeng(this.value)" id="fm_dt1" /><!--
						 --><button type="button" id="btns_calendar1" name="btns_calendar1" class="calendar ir"></button> ~  <input type="text" style="width: 75px;" value="" name="to_dt1" onblur="fn_ComGetMaskedValue('to_dt1');" id="to_dt1" /><!-- 
						 --><button type="button" id="btns_calendar2" name="btns_calendar2" class="calendar ir"></button> </td>
						<th>Office</th>
						<td width=""><script type="text/javascript">ComComboObject('ar_ofc_cd2', 1, 100, 1, 0, 0, true);</script>
						<input type="hidden" name="multi_office_list" id="multi_office_list" />
						</td>
					</tr>
			</tbody>
		</table>
	</div>
</div>
<!-- opus_design_inquiry(E) -->

<!-- opus_design_grid(S) -->
<div class="wrap_result">
	<div class="opus_design_grid clear" > 
		<div class="opus_design_btn">
				<button type="button" class="btn_normal" name="btn_add" 	id="btn_add">Row Add</button>
				<button type="button" class="btn_normal" name="btn_copy" 	id="btn_copy">Row Copy</button>
				<button type="button" class="btn_normal" name="btn_del" 	id="btn_del">Delete</button>
				<button type="button" class="btn_normal" name="btn_loadExcel" 	id="btn_loadExcel">Load Excel</button>
				<button type="button" class="btn_normal" name="btn_downExcel" 	id="btn_downExcel">Down Excel</button>
		</div>
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
</div>

	<div class="opus_design_grid clear"  style="display:none" ><!-- style="display:none" -->   
		<script type="text/javascript">ComSheetObject('sheet2');</script>
	</div>
	
	
<!-- opus_design_grid(E) -->
</form>
