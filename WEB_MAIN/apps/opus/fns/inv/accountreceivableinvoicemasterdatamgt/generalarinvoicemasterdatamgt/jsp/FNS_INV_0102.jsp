<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : FNS_INV_0102.jsp
*@FileTitle : Code Conversion for CPR
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
* 2014.11.13 박성용
* 1.0 Creation
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemasterdatamgt.generalarinvoicemasterdatamgt.event.FnsInv0102Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsInv0102Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMasterDataMgt.GeneralARInvoiceMasterDataMgt");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsInv0102Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// 초기화면 로딩시 서버로부터 가져온 데이터 추출하는 로직추가 ..
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

<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd">
<input type="hidden" name="pagerows" id="pagerows">
<input type="hidden" name="sc_no" id="sc_no">
<input type="hidden" name="rfa_no" id="rfa_no">
<input type="hidden" name="cd" id="cd">

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" name="btn1_Retrieve" id="btn1_Retrieve" type="button">Retrieve</button><!--
		--><button class="btn_normal" name="btn1_New" id="btn1_New" type="button">New</button><!--
		--><button class="btn_normal" name="btn1_Save" id="btn1_Save" type="button">Save</button><!--
		--><button class="btn_normal" name="btn1_Down_Excel" id="btn1_Down_Excel" type="button">Down Excel</button><!--
		--><button class="btn_normal" name="btn1_Load_Excel" id="btn1_Load_Excel" type="button">Load Excel</button><!--
		--></div>
	<!-- opus_design_btn (E) -->

	<!-- page_location(S) -->
	<div class="location">	
		<span id="navigation"></span>
	</div>
	<!-- page_location(E) -->
</div>
<!-- page_title_area(E) -->
<!-- wrap_search(S) -->
<div class="wrap_search ">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry">
		<table>
			<tbody>
				<colgroup>
					<col width="54" />
					<col width="640" />
					<col width="120" />
					<col width="*" />
				</colgroup>
				<tr>
					<th>S/C No.</th><!-- AWN22611 -->
					<td><input type="text" name="sc_no2" id="sc_no2" style="width:100px" class="input1" dataformat="engup" maxlength="10" onChange="text_onChange(this);">&nbsp;<input type="text" name="sc_nm" id="sc_nm" style="width:330px" class="input2" readonly tabindex="-1"></td>
					<th>Conversion Target</th>
					<td>
						<select name="cdTp" id="cdTp" style="width:160px;" class="input1" onChange="cdTp_onChange();">
							<option value="CHARGE" selected>Charge Code</option>
							<option value="CNTRTPSZ">Container Type/Size</option>
							<option value="DELIVERYTERM">Delivery Term</option>
							<option value="RECEIVINGTERM">Receiving Term</option>
							<option value="LOCATION">DEL</option>
							<option value="COMMODITY">Commodity Code</option>
						</select>
					</td>
				</tr>
			</tbody>
		</table>
		<table>
			<tbody>
				<colgroup>
					<col width="54" />
					<col width="*" />
				</colgroup>
				<tr>
					<th>RFA No.</th><!-- SVQ09P0001 -->
					<td><input type="text" name="rfa_no2" id="rfa_no2" style="width:100px" class="input1" dataformat="engup" maxlength="11" onChange="text_onChange(this);">&nbsp;<input type="text" name="rfa_nm" id="rfa_nm" style="width:330px" class="input2" readonly tabindex="-1"></td>					
				</tr>
			</tbody>
		</table>
	</div>
	<!-- opus_design_inquiry(E) -->
</div>
<!-- wrap_search(E) -->
<!-- wrap_result(S) -->
<div class="wrap_result">
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid">
		<!-- opus_design_btn (S) -->
		<div class="opus_design_btn">
			<button class="btn_accent" name="btn2_Row_Add" id="btn2_Row_Add" type="button">Row Add</button><!--
			--><button class="btn_normal" name="btn2_Row_Delete" id="btn2_Row_Delete" type="button">Row Delete</button>
		</div>
		<!-- opus_design_btn (E) -->
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
	<!-- opus_design_grid(E) -->	
	<!-- opus_design_inquiry(S) -->
    <div class="opus_design_inquiry">
        <!--  biz_1 (S) -->
        <div style="float: right">
	        <table>
	            <tbody>
					<tr>	
						<td>
							<button class="btn_normal" name="btn1_Copy_to_New" id="btn1_Copy_to_New" type="button">Copy to New</button>&nbsp;&nbsp;
							<input type="radio" name="copy_gb" id="copy_gb" value="S" class="trans" checked>&nbsp;S/C&nbsp;&nbsp;
							<input type="radio" name="copy_gb" id="copy_gb" value="R" class="trans">&nbsp;RFA&nbsp;
							<input type="text" name="copy_text" id="copy_text" style="width:100px" class="input1" dataformat="engup" maxlength="11" onChange="text_onChange(this);">
						</td>
					</tr>
				</tbody>
	        </table>
        </div>
        <!--  biz_1   (E) -->   
    </div>
    <!-- opus_design_inquiry(E) -->
</div>
<!-- wrap_result(E) -->

</form>