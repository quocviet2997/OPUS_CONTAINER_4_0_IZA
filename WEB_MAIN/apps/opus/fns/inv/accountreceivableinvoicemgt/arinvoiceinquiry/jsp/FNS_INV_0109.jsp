<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0109.jsp
*@FileTitle  : Invoice Search(FAC Agreement Management)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/28
=========================================================
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.arinvoiceinquiry.event.FnsInv0109Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.framework.component.util.StringUtil" %>
<%
	FnsInv0109Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			
	String strErrMsg = "";						
	int rowCount	 = 0;						

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";
	
	String issOfcCd = "";
	String selOption = "";
	
	String func  = StringUtil.xssFilter(request.getParameter("func"));
	String row = StringUtil.xssFilter(request.getParameter("row"));
	String col = StringUtil.xssFilter(request.getParameter("col"));

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMgt.ARInvoiceInquiry");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();

		event = (FnsInv0109Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		
		issOfcCd = StringUtil.xssFilter(request.getParameter("iss_ofc_cd")) != null ? StringUtil.xssFilter(request.getParameter("iss_ofc_cd")) : "";
		selOption = StringUtil.xssFilter(request.getParameter("sel_option")) != null ? StringUtil.xssFilter(request.getParameter("sel_option")) : "";
		
	}catch(Exception e) {
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

<form name="form">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">

<!-- 개발자 작업	-->
<input type="hidden" name="pagetype" value="I">
<input type="hidden" name="office" value="<%=issOfcCd%>">
<input type="hidden" name="sel_option" value="<%=selOption%>">

<!-- OUTER - POPUP (S)tart -->

<!-- popup_title_area(S) -->
<div class="layer_popup_title">
	<div class="page_title_area clear ">
		<!-- page_title(S) -->		
		<h2 class="page_title"><span>Invoice Search</span></h2>			
		<!-- page_title(E) -->
	
		    <!-- opus_design_btn(S) -->
		    <div class="opus_design_btn">
		        <!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->
				<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!--  
				--><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!-- 
				--><button type="button" class="btn_normal" name="btn_apply" id="btn_apply">Apply</button><!-- 
				--><button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button>						
		    </div>
		    <!-- opus_design_btn(E) -->
	    
		<!-- page_location(S) -->
		<div class="location">
			<!-- location 내용 동적생성 (별도 코딩 불필요) -->
			<span id="navigation"></span>
		</div>
		<!-- page_location(E) -->
	
	</div>
</div>
<!-- page_title_area(E) -->

<!-- opus_design_inquiry(S) -->
<div class="layer_popup_contents">
	<div class="wrap_search">
		<div class="opus_design_inquiry wFit">		
			<table>
				<tbody>
					<tr>
						<th width="90px" align="right">Issue Date</th>
						<td width="250px" colspan="3"><input type="text" style="width:75px" name="iss_fm_dt" class="input1" required caption="start date" dataformat="ymd" maxlength="8" value="" cofield="iss_to_dt"><button type="button" class="calendar" name="btns_calendar1"></button>
						~
						<input type="text" style="width:75px" name="iss_to_dt" class="input1" required caption="end date" dataformat="ymd" maxlength="8" value="" cofield="iss_fm_dt"><button type="button" class="calendar" name="btns_calendar2"></button></td>
						<th width="100px" align="right">Invoice Type</th>
						<td width=""style="padding-left:2;"><script language="javascript"  style="ime-mode:disabled" dataformat="uppernum">ComComboObject('inv_type', 1, 90, 1, 1, 0, 0);</script></td>
					</tr>
					<tr class="h23">
						<th width="" align="right">Actual Cust.</th>
						<td width="" colspan="3"><input type="text" name="cust_cnt_cd" minlength="2" maxlength="2" dataformat="engup" style="width:30px"  value="" class="input">-<input type="text" name="cust_seq" minlength="6" maxlength="6" dataformat="int" style="width:57px"  value="" class="input"><input type="text" name="cust_nm" style="width:286px"  value="" class="input2" readOnly></td>
						<th width="" align="right">User ID</th>
						<td width=""><input type="text" name="usr_id" maxlength="20" value="" dataformat="eng" style="width:90px" value="" class="input"></td>
					</tr>
					<tr class="h23">
						<th width="" align="right">Invoice No.</th>
						<td width="120px"><input type="text" style="width:100px"  name="inv_no" class="input" minlength="9" maxlength="9" dataformat="engup" value=""></td>
						<th width="100px" align="right">B/L No.</th>
						<td width="120px"><input type="text" style="width:100px"  name="bl_src_no" class="input" minlength="12" maxlength="12" dataformat="engup" value=""></td>
						<th width="" align="right">Actual Inv No</th>
						<td width=""><input type="text" name="act_inv_no" value="" dataformat="engup" style="width:90px" value="" class="input" minlength="6" maxlength="6"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	
	<div class="wrap_result">
	<!-- opus_design_grid(S) -->
		<div class="opus_design_grid" id="mainTable">														
			<!-- 그리드 데이터 영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
		    <script language="javascript">ComSheetObject('sheet1');</script>
		    <!-- 그리드 데이터 영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
		</div>
	<!-- opus_design_grid(E) -->	
	</div>					
</div>
</form>

<SCRIPT LANGUAGE="javascript">
	function callParent(){
		var formObject = document.form;
		var rArray = getCheckedRows();
		
		if(rArray == null) {
			ComShowCodeMessage("COM12114", "row");
			return;
		}
		if(rArray.length == 0) {
			return;
		}
		
		opener.<%=func%>(rArray);
		
		window.close();
	}
	
	function getCheckedRows(colName) {
		var sheetObj = sheetObjects[0];
		var colsCnt = sheetObj.LastCol + 1;
		var rows = sheetObj.Rows;
		var checkRows = sheetObj.CheckedRows("SelChk");
		
		var rArray = null;
		var cArray = null;
		
		var invNos = "";
		
		if(checkRows == 0) {
			return null;
		}
		else if(checkRows > 100) {
			if(ComShowCodeConfirm("INV00078")) {
				var idx = 0;
				invNos = "";
				rArray = new Array();
				
				for(var i = 0; i < rows; i++) {
					if(sheetObj.CellValue(i, "SelChk") == 1) {
						cArray = new Array(colsCnt);
						
						for(var j=0; j<cArray.length; j++) {
							cArray[j] = sheetObj.CellValue(i, j);
						}
						
						if (invNos.indexOf(cArray[2]) == -1) {
							invNos = invNos + cArray[2] + "|" ;
						
							rArray.push(cArray);
						}
					}
				}
			} else {
				rArray = new Array(0);
			}
		}
		else {
			var idx = 0;
			invNos = "";
			rArray = new Array();
			
			for(var i = 0; i < rows; i++) {
				if(sheetObj.CellValue(i, "SelChk") == 1) {
					cArray = new Array(colsCnt);
						
					for(var j=0; j<cArray.length; j++) {
						cArray[j] = sheetObj.CellValue(i, j);
					}
					
					if (invNos.indexOf(cArray[2]) == -1) {
						invNos = invNos + cArray[2] + "|" ;
						
						rArray.push(cArray);
					}
				}
			}
		}
		return rArray;
	}
</SCRIPT>
