<%
	/*=========================================================
	 *Copyright(c) 2009 CyberLogitec
	 *@FileName : FNS_INV_0106.jsp
	 *@FileTitle : Invoice Search
	 *Open Issues :
	 *Change history :
	 *@LastModifyDate :
	 *@LastModifier :
	 *@LastVersion : 1.0
	 =========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.arinvoiceinquiry.event.FnsInv0106Event"%>
<%@ page import="org.apache.log4j.Logger"%>
<%@ page import="com.clt.framework.component.util.StringUtil" %>
<%
	FnsInv0106Event event = null; //PDTO(Data Transfer Object including Parameters)
	Exception serverException = null; // Errors from server.
	String strErrMsg = ""; // Error message.
	int rowCount = 0; // DB ResultSet list count

	String successFlag = "";
	String codeList = "";
	String pageRows = "100";

	String strUsr_id = "";
	String strUsr_nm = "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMgt.ARInvoiceInquiry");

	String issOfcCd = "";
	String selOption = "";

	String func = StringUtil.xssFilter(request.getParameter("func"));
	String row = StringUtil.xssFilter(request.getParameter("row"));
	String col = StringUtil.xssFilter(request.getParameter("col"));

	try {
		SignOnUserAccount account = (SignOnUserAccount) session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id = account.getUsr_id();
		strUsr_nm = account.getUsr_nm();

		event = (FnsInv0106Event) request.getAttribute("Event");
		serverException = (Exception) request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException)
					.loadPopupMessage();
		}

		// Get data from server. ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

		issOfcCd = StringUtil.xssFilter(request.getParameter("iss_ofc_cd")) != null ? StringUtil.xssFilter(request.getParameter("iss_ofc_cd")) : "";
		selOption = StringUtil.xssFilter(request.getParameter("sel_option")) != null ? StringUtil.xssFilter(request.getParameter("sel_option"))	: "";

	} catch (Exception e) {
		out.println(e.toString());
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
<form name="form"><input type="hidden" name="f_cmd"> 
<input type="hidden" name="pagerows"> 
<input type="hidden" name="pagetype" value="I"> 
<input type="hidden" name="office" value="<%=issOfcCd%>"> 
<input type="hidden" name="sel_option" value="<%=selOption%>"> <!-- OUTER - POPUP (S)tart -->

<!-- popup_title_area(S) -->
 <div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title"><span>Invoice Search</span></h2>
		<!-- page_title(E) -->
			
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!-- 
			--><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!-- 
			--><button type="button" class="btn_normal" name="btn_apply" id="btn_apply">Apply</button><!-- 
			--><button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button>
		</div>
		<!-- opus_design_btn(E) -->	
	</div>
	<!-- page_title_area(E) -->
</div>
<!-- popup_title_area(E) -->

<!-- popup_contens_area(S) -->
<div class="layer_popup_contents">

	<div class="wrap_search">
	<!-- inquiry_area(S) -->
	<div class="opus_design_inquiry wFit">
		<table> 
			<tbody>
				<colgroup>
					<col width="80" />
					<col width="336" />
					<col width="93" />
					<col width="*" />
				</colgroup>
				<tr>
					<th>Issue Date</th>
					<td class="stm">
					<input type="text" style="width: 85px" name="iss_fm_dt" class="input1" required caption="start date" dataformat="ymd" maxlength="8" value="" cofield="iss_to_dt"><!--
					--><button type="button" class="calendar" name="btns_calendar1"></button>~
					<input type="text" style="width: 85px" name="iss_to_dt" class="input1" required caption="end date" dataformat="ymd" maxlength="8" value="" cofield="iss_fm_dt"><!--
					--><button type="button" class="calendar" name="btns_calendar2"></button>
					</td>
					<th>B/L No.</th>
					<td><input type="text" style="width: 100px" name="bl_src_no" class="input" maxlength="12" dataformat="engup" value=""></td>
				</tr>
					</table> 
				<table>
			<tbody>
				<colgroup>
					<col width="80" />
					<col width="120" />
					<col width="93" />
					<col width="*" />
				</colgroup>
				<tr>
					<th>Actual Cust.</th>
					<td class="stm">
					<input type="text" name="cust_cnt_cd" minlength="2" maxlength="2" dataformat="enguponly" style="width: 35px" value="" class="input">- 
					<input type="text" style="width: 49px" value="" name="cust_seq" dataformat="num" class="input" onChange="fn_cust_nm();" maxlength="6"><!-- 
					 --><input type="text" name="cust_nm" style="width: 227px" value="" class="input2" readOnly></td>
					<th>User ID</th>
					<td><input type="text" name="usr_id" maxlength="20" value="" dataformat="eng" style="width: 100px" value="" class="input"></td>
					<td></td>
				</tr>
			</tbody>
		</table>
		
		<table> 
			<tbody>
				<colgroup>
					<col width="80" />
					<col width="109" />
					<col width="50" />
					<col width="75" />
					<col width="55" />
					<col width="53" />
					<col width="78" />
					<col width="*" />
				</colgroup>
				<tr>
					<th title="Vessel Voyage Direction">VVD</th>
					<td><input type="text" name="vvd" minlength="9" maxlength="9" dataformat="engup" style="width:97px" value="" class="input"></td>					
					<th>Scope</th>
					<td><input type="text" name="scope" minlength="3" maxlength="3" dataformat="enguponly" style="width:55px" value="" class="input"></td>	
					<th>Port</th>
					<td><input type="text" name="port" minlength="5" maxlength="5" dataformat="enguponly" style="width: 55px" value="" class="input"></td>		
					<th>Bound</th>
					<td>
					<select name="bound" style="width: 100px;" class="input">
						<option value="" selected>All</option>
						<option value="O">O/B</option>
						<option value="I">I/B</option>
					</select>
					</td>
				</tr>
			</tbody>
		</table>
		
	</div>
	<!-- inquiry_area(E) -->
	</div>

	<div class="wrap_result">
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid" >
		<!-- opus_grid_design_btn(S) -->
		
		<script language="javascript">ComSheetObject('sheet1');</script>
		
		<!-- opus_grid_design_btn(E) -->
	</div>
	<!-- opus_design_grid(E) -->
	</div>
</div>
<!-- popup_contens_area(E) -->

</form>


