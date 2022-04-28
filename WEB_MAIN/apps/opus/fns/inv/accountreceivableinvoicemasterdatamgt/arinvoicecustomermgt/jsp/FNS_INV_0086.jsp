<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0086.jsp
*@FileTitle  : Quick Customer Search
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
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemasterdatamgt.arinvoicecustomermgt.event.FnsInv0086Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.framework.component.util.StringUtil" %>
<%
	FnsInv0086Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			// Errors from server.
	String strErrMsg = "";						// Error message.
	int rowCount	 = 0;						// DB ResultSet list count

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String loginOfcCd = "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMasterDataMgt.ARInvoiceCustomerMgt");

	String cust_cnt_cd = StringUtil.xssFilter(request.getParameter("cust_cnt_cd"));
	if(cust_cnt_cd == null){
		cust_cnt_cd = "";
	}
	
	String cust_seq = StringUtil.xssFilter(request.getParameter("cust_seq"));
	if(cust_seq == null){
		cust_seq = "";
	}
	
	String cust_lgl_eng_nm = StringUtil.xssFilter(request.getParameter("cust_lgl_eng_nm"));
	if(cust_lgl_eng_nm == null){
		cust_lgl_eng_nm = "";
	}
	
	String cust_rgst_no = StringUtil.xssFilter(request.getParameter("cust_rgst_no"));
	if(cust_rgst_no == null){
		cust_rgst_no = "";
	}
	
	String popOffice = StringUtil.xssFilter(request.getParameter("office"));
	if(popOffice == null){
		popOffice = "";
	}
	
	String func  = StringUtil.xssFilter(request.getParameter("func"));
	String row = StringUtil.xssFilter(request.getParameter("row"));
	String col = StringUtil.xssFilter(request.getParameter("col"));

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		loginOfcCd = account.getOfc_cd();

		event = (FnsInv0086Event)request.getAttribute("Event");
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
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">

<!-- OUTER - POPUP (S)tart -->
<input type="hidden" name="func" value="<%=func%>" id="func" />
<input type="hidden" name="row" value="<%=row%>" id="row" />
<input type="hidden" name="col" value="<%=col%>" id="col" />
<input type="hidden" name="cust_seq" value="<%=cust_seq%>" id="cust_seq" />
<input type="hidden" name="pagetype" value="E" id="pagetype" />
<input type="hidden" name="login_ofc_cd" value="<%=loginOfcCd%>" id="login_ofc_cd" />
<input type="hidden" name="popOffice" value="<%=popOffice%>" id="popOffice" />
<input type="hidden" name="rec_cust_cnt_cd" value="<%=cust_cnt_cd%>" id="rec_cust_cnt_cd" /> 

<!-- popup_title_area(S) -->
 <div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title"><span>Quick Customer Search</span></h2>
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
		<div class="opus_design_inquiry wFit">   <!-- no TAB  -->
			<table> 
				<colgroup>
					<col width="70" />
					<col width="60" />
					<col width="120" />
					<col width="290" />
					<col width="70" />
					<col width="100" />
					<col width="120" />
					<col width="*" />
				</colgroup>
				<tbody>
					<tr>
						<th>Country Code</th>
						<td><input name="cust_cnt_cd" id="cust_cnt_cd" type="text" style="width:30px; text-align:center;ime-mode:disabled" class="input1" maxlength='2' dataformat="engup" onKeyup="moveNext('cust_cnt_cd','cust_lgl_eng_nm',2);"></td>
						<th>Customer Name</th>					
						<td><input name="cust_lgl_eng_nm" id="cust_lgl_eng_nm" type="text" style="width:180px;ime-mode:disabled" class="input"   dataformat="excepthan"><!--
						--><strong><label for="chk_nm">Include</label></strong><input type="checkbox" value="Y" class="trans" name="chk_nm" id="chk_nm"></td>
						<th>Zip Code</th>   
						<td><input type="text" name="zip_cd" id="zip_cd" style="width:60px;" class="input"></td>
						<th>TaxPayerID/RegNo</th>   
						<td><input type="text" name="cust_rgst_no" id="cust_rgst_no"  style="width:80px; text-align:center;" class="input" dataformat="num"  maxlength="14" value="<%=cust_rgst_no%>"></td>
						<td></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	<!-- inquiry_area(E) -->
	<div class="wrap_result">
		<!-- opus_design_grid(S) -->
		<div class="opus_design_grid" >
			<script type="text/javascript">ComSheetObject('sheet1');</script>
			<!-- opus_grid_design_btn(E) -->
		</div>
		<!-- opus_design_grid(E) -->
	</div>
	<!-- popup_contens_area(E) -->
</div>
</form>

<SCRIPT type="text/javascript">
	<%-- function callParent(){
		var formObject = document.form;
		
		var rArray = getCheckedRows();
		if(rArray == null) {
			ComShowCodeMessage("COM12114", "row");
			return;
		}
		var func = formObject.func.value;
		var row = formObject.row.value;
		var col = formObject.col.value;
		
		opener.<%= func %>(rArray, <%=row%>, "<%=col%>");
		window.close();
	}	
	
	function getCheckedRows(colName) {
		var checkRows;
		var sheetObj = sheetObjects[0];
		var colsCnt = sheetObj.LastCol + 1;
		var rows = sheetObj.Rows;
		
		var rArray = null; //The array is row data.
    	var cArray = null; //The array is column data.
    	
		checkRows = sheetObj.CheckedRows("SelChk");
		if(checkRows == 0) {
  			return null;
  		}
  		else {
  			var idx = 0;
	  		rArray = new Array(checkRows);
	  		
			for(var i = 0; i < rows; i++) {
				if(sheetObj.CellValue(i, "SelChk") == 1) {					
		  			cArray = null;

		  			if(colName != null && colName != "") {
		  				cArray = sheetObj.CellValue(i, colName);
		  			} else {
		  				cArray = new Array(colsCnt);
		  				
			  			for(var j=0; j<cArray.length; j++) {
	                    	cArray[j] = sheetObj.CellValue(i, j);
	                    }
	                }
                    rArray[idx++] = cArray;
	     		}
	  		}
	  	}
	  	return rArray;
	}	 --%>
</SCRIPT>	