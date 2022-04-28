<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : FNS_INV_0076.jsp
*@FileTitle  : Revenue Account Code Creation
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/27
=========================================================
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemasterdatamgt.generalarinvoicemasterdatamgt.event.FnsInv0076Event"%>
<%@ page import="org.apache.log4j.Logger"%>

<%
	FnsInv0076Event event = null; //PDTO(Data Transfer Object including Parameters)
	Exception serverException = null; // Errors from server.
	String strErrMsg = ""; // Error message.
	int rowCount = 0; // DB ResultSet list count

	String successFlag = "";
	String codeList = "";
	String pageRows = "100";

	String strUsr_id = "";
	String strUsr_nm = "";
	Logger log = Logger
			.getLogger("com.clt.apps.AccountReceivableInvoiceMasterDataMgt.GeneralARInvoiceMasterDataMgt");

	try {
		SignOnUserAccount account = (SignOnUserAccount) session
				.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id = account.getUsr_id();
		strUsr_nm = account.getUsr_nm();

		event = (FnsInv0076Event) request.getAttribute("Event");
		serverException = (Exception) request
				.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException)
					.loadPopupMessage();
		}

		// Get data from server. ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request
				.getAttribute("EventResponse");

	} catch (Exception e) {
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

<form name="form">
<input type="hidden" name="f_cmd"> 
<input type="hidden" name="pagerows">

<!-- page_title_area(S) -->
<div class="page_title_area clear ">
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button>
	</h2>
	<!-- page_title(E) -->

	    <!-- opus_design_btn(S) -->
	    <div class="opus_design_btn">
	        <!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->
			<button type="button" class="btn_accent" name="btn_retrive" id="btn_retrive">Retrieve</button>
			<button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button>
			<button type="button" class="btn_normal" name="btn_Save" id="btn_Save">Save</button>
			<button type="button" class="btn_normal" name="btn_downExcel" id="btn_downExcel">Down Excel</button>						
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
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry wFit">
		<!-- biz_1  (S) -->
		<table class="search" border="0" style="width: 979px;">
			<tr>
				<th width="60">Source</td>
				<td width="100"><select style="width: 67px;" name="inv_src_cd" id="inv_src_cd">
					<option value="" selected>All</option>
					<option value="CNTR">CNTR</option>
					<option value="CDAM">CDAM</option>
					<option value="JOS">JOS</option>
					<option value="OTH">OTH</option>
					<option value="BULK">BULK</option>
				</select></td>
				<th width="60">Rev. Group</td>
				<td width="100"><select style="width: 67px;"	name="rev_tp_grp_cd" id="rev_tp_grp_cd">
					<option value="" selected>All</option>
					<option value="BL">BL</option>
					<option value="MIS">MIS</option>
					<option value="MWC">MWC</option>
					<option value="CHT">CHT</option>
					<option value="EQR">EQR</option>
				</select></td>
				<th width="30px">Del.</td>
				<td><select style="width: 67px;" name="delt_flg" id="delt_flg">
					<option value="">All</option>
					<option value="Y">Yes</option>
					<option value="N" selected>No</option>
				</select></td>
			</tr>
		</table>
	</div>				
</div>
		
<div class="wrap_result">
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid" id="mainTable" >					
	    <div class="opus_design_btn">
	        <!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->						
			<button type="button" class="btn_normal" name="btn_RowAdd" id="btn_RowAdd">Row Add</button>
			<button type="button" class="btn_normal" name="btn_Delete" id="btn_Delete">Row Delete</button>												
	    </div>				    								
		<!-- 그리드 데이터 영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
			<script type="text/javascript">ComSheetObject('sheet');</script>
		<!-- 그리드 데이터 영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->					
	</div>
</div>


</form>
