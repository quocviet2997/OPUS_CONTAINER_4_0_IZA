<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0101.jsp
*@FileTitle  : VVD Ex. Rate Creation by VVD
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/16
=========================================================
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemasterdatamgt.arinvoiceexratemgt.event.FnsInv0101Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsInv0101Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			// Errors from server.
	String strErrMsg = "";						// Error message.
	int rowCount	 = 0;						// DB ResultSet list count

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMasterDataMgt.ARInvoiceExRateMgt");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsInv0101Event)request.getAttribute("Event");
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
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="ofc" value="" id="ofc" />
<input type="hidden" name="ofc_cd" value="" id="ofc_cd" />
<input type="hidden" name="svr_id" value="" id="svr_id" />
<input type="hidden" name="pagetype" value="I" id="pagetype" />
<input type="hidden" name="ar_ofc_cd2" id="ar_ofc_cd2" />
<input type="hidden" name="curr_cd" value="" id="curr_cd" />
<input type="hidden" name="xch_rt_rvs_flg" value="" id="xch_rt_rvs_flg" />
<input type="hidden" name="port" value="" id="port" />
<input type="hidden" name="vvd" value="" id="vvd" />
<input type="hidden" name="bnd" value="" id="bnd" />
<input type="hidden" name="locl_curr_cd" value="" id="locl_curr_cd" />
<input type="hidden" name="altn_curr_div_cd" value="" id="altn_curr_div_cd" />

<!-- page_title_area(S) -->
<div class="page_title_area clear ">
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button>
	</h2>
	<!-- page_title(E) -->

	    <!-- opus_design_btn(S) -->
	    <div class="opus_design_btn"><!--
	    --><button type="button" class="btn_accent" name="btn1_Retrieve" id="btn1_Retrieve">Retrieve</button><!--
	    --><button type="button" class="btn_normal" name="btn1_New"   id="btn1_New">New</button><!--
	    --><button type="button" class="btn_normal" name="btn1_Save"   id="btn1_Save">Save</button><!--
	    --><button type="button" class="btn_normal" name="btn_downexcel"   id="btn_downexcel">Down Excel</button></div>
	    <!-- opus_design_btn(E) -->
    
	<!-- page_location(S) -->
	<div class="location">
		<!-- location 내용 동적생성 (별도 코딩 불필요) -->
		<span id="navigation"></span>
	</div>
	<!-- page_location(E) -->

</div>
<!-- page_title_area(E) -->
<!-- wrap_search(S) -->
<div class="wrap_search">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry wFit">
				<table>
					<colgroup>
						<col width="95">
						<col width="80">
						<col width="60">
						<col width="100">
						<col width="70">
						<col width="100">
						<col width="60">
						<col width="100">
						<col width="60">
						<col width="100">
						<col width="60">
						<col width="100">
						<col width="*">
					</colgroup>
					<tr>
						<th>Local Currency</th>
						<td><script type="text/javascript">ComComboObject('inv_curr_cd', 1, 80, 0);</script></td>
 						<th title="Vessel Voyage Direction">VVD</th> 
						<td><input type="text" dataformat="engup" value="" name="vvd_cd" id="vvd_cd" style="width: 90px" class="input1" required  caption="VVD"  maxlength="9" required fullfill></td>
						<th class="sm">Bound</th>
						<td class="sm pad_left_4"><input type="radio" value="O" class="trans"	name="bnd_cd" id="bnd_cd" checked onClick="javascript:changeHeaderName(this.value);">&nbsp;&nbsp;O/B&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" value="I" class="trans" name="bnd_cd" id="bnd_cd" onClick="javascript:changeHeaderName(this.value);">&nbsp;I/B
						<th>Port</th>
						<td><script type="text/javascript">ComComboObject('vps_port_cd', 1, 80, 0);</script></td>
						<th>Scope</th>
						<td><script type="text/javascript">ComComboObject('svc_scp_cd', 1, 80, 0);</script></td>
						<th>Office</th>
						<td><script type="text/javascript">ComComboObject('ar_ofc_cd', 1, 100, 0);</script></td>
					</tr>
				</table>
		<!--biz page (S)-->
	</div>		
<!-- opus_design_inquiry(E) -->
</div>
<!-- wrap_result(S) -->
<div class="wrap_result">
<!-- opus_design_grid(S) -->
	<div class="opus_design_grid" id="mainTable">		
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
	        <!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->
			<button type="button" class="btn_normal" name="Row_Add"   id="Row_Add">Row Add</button>
			<button type="button" class="btn_normal" name="btn2_Row_Copy"   id="btn2_Row_Copy">Row Copy</button>
			<button type="button" class="btn_normal" name="btn2_Row_Delete"   id="btn2_Row_Delete">Row Delete</button></div>
	    <!-- opus_design_btn(E) -->
		<!-- 그리드 데이터 영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
	    <script type="text/javascript">ComSheetObject('sheet1');</script>
	    <!-- 그리드 데이터 영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
	</div>
<!-- opus_design_grid(E) -->
</div>
</form>


<form name="form2">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
<input type="hidden" name="curr_cd">
<input type="hidden" name="locl_curr_cd">
<input type="hidden" name="port_cd">
<input type="hidden" name="vvd_cd">
<input type="hidden" name="io_bnd_cd">
<input type="hidden" name="vsl_cd">
<input type="hidden" name="skd_voy_no">
<input type="hidden" name="skd_dir_cd">
<input type="hidden" name="svc_scp_cd">
<input type="hidden" name="chg_curr_cd">
</form>
