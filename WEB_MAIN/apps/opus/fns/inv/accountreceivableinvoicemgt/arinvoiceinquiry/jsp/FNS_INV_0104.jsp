<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : FNS_INV_0104.jsp
*@FileTitle : CPR Download History Inquiry - Search
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
* 2014.11.14 박성용
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
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.arinvoiceinquiry.event.FnsInv0104Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.framework.component.util.StringUtil" %>
<%
	FnsInv0104Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMgt.ARInvoiceInquiry");
	
	String cust_rpt_id = StringUtil.xssFilter(request.getParameter("cust_rpt_id"));
	if(cust_rpt_id == null){
		cust_rpt_id = "";
	}
	
	String func  = StringUtil.xssFilter(request.getParameter("func"));
	String row = StringUtil.xssFilter(request.getParameter("row"));
	String col = StringUtil.xssFilter(request.getParameter("col"));

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsInv0104Event)request.getAttribute("Event");
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
<!-- 개발자 작업	-->
<input type="hidden" name="func" id="func" value="<%=func%>">
<input type="hidden" name="row" id="row" value="<%=row%>">
<input type="hidden" name="col" id="col" value="<%=col%>">

<!-- page_title_area(S) -->
<div class="layer_popup_title">
	<div class="page_title_area clear">
	   <!-- page_title(S) -->
		<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
		<h2 class="page_title"><span>CPR Download History Inquiry - Search</span></h2>
		<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn"><!-- 
			--><button class="btn_accent" name="btn_Retrieve" id="btn_Retrieve" type="button">Retrieve</button><!--
			--><button class="btn_normal" name="btn_ok" id="btn_ok" type="button">Ok</button><!--
			--><button class="btn_normal" name="btn_New" id="btn_New" type="button">New</button><!--
			--><button class="btn_normal" name="btn_close" id="btn_close" type="button">Close</button>
		</div>
		<!-- opus_design_btn(E) -->
	</div>
</div>
<!-- page_title_area(E) -->	
<div class="layer_popup_contents">
	<!-- wrap_search(S) -->
	<div class="wrap_search ">
		<!-- opus_design_inquiry(S) -->
		<div class="opus_design_inquiry">
			<table>
				<tbody>
					<colgroup>
						<col width="160" />
						<col width="*" />
					</colgroup>
					<tr>
						<th>Report ID Creation Date</th>
						<td>
							<input type="text" name="from_cre_dt" id="from_cre_dt" style="width:85px" class="input1" dataformat="ymd" maxlength="8" cofield="to_cre_dt" caption="start date"><button type="button" id="btn_calendar1" name="btn_calendar1" class="calendar ir"></button>~
							<input type="text" name="to_cre_dt" id="to_cre_dt" style="width:85px" class="input1" dataformat="ymd" maxlength="8" cofield="from_cre_dt" caption="end date"><button type="button" id="btn_calendar2" name="btn_calendar2" class="calendar ir"></button>
						</td>
					</tr>
				</tbody>
			</table>
			<table>
				<tbody>
					<colgroup>
						<col width="160" />
						<col width="200" />
						<col width="50" />
						<col width="*" />
					</colgroup>
					<tr>
						<th>Office</th>
						<td><input type="text" name="ar_ofc_cd" id="ar_ofc_cd" style="width:100px" class="input" style="ime-mode:disabled" dataformat="engup" maxlength="5"></td>
						<th>User ID</th>
						<td><input type="text" name="cre_usr_id" id="cre_usr_id" style="width:100px" class="input" style="ime-mode:disabled"></td>						
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
			<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>
		<!-- opus_design_grid(E) -->
	</div>
	<!-- wrap_result(E) -->
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
		var func = formObject.func.value;
		var row = formObject.row.value;
		var col = formObject.col.value;

		opener.<%= func %>(rArray, <%=row%>, "<%=col%>");
		window.close();
	}	
	
	function getCheckedRows(colName) {
		var checkRows;
		var sheetObj = sheetObjects[0];
		var colsCnt = sheetObj.LastCol() + 1;
		var rows = sheetObj.RowCount() + 1;
		
		var rArray = null; //행데이터를 담고 있는 배열
    	var cArray = null; //열데이터를 담고 있는 배열
    	
		checkRows = sheetObj.CheckedRows("SelChk");
		if(checkRows == 0) {
  			return null;
  		}
  		else {
  			var idx = 0;
	  		rArray = new Array(checkRows);
	  		
			for(var i = 0; i < rows; i++) {
				if(sheetObj.GetCellValue(i, "SelChk") == 1) {					
		  			cArray = null;
		  			
		  			// 특정 컬럼명이 지정된 경우
		  			if(colName != null && colName != "") {
		  				cArray = sheetObj.GetCellValue(i, colName);
		  			} else {
		  				cArray = new Array(colsCnt);
		  				
			  			for(var j=0; j<cArray.length; j++) {
	                    	cArray[j] = sheetObj.GetCellValue(i, j);
	                    }
	                }
                    rArray[idx++] = cArray;
	     		}
	  		}
	  	}
	  	return rArray;
	}	
</SCRIPT>	