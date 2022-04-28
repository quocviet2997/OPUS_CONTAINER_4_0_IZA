<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : FNS_INV_0051.jsp
*@FileTitle : Customer Preferable Report -Item Select
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
* 2014.11.12 박성용
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
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.arinvoiceinquiry.event.FnsInv0051Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.framework.component.util.StringUtil" %>
<%
	FnsInv0051Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String strOfc_cd		= "";

	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMgt.ARInvoiceInquiry");
		
	String func  = StringUtil.xssFilter(request.getParameter("func"));
	if(func == null || func.equals("")) func = "a";
	String row = StringUtil.xssFilter(request.getParameter("row"));
	if(row == null || row.equals("")) row = "1";
	String col = StringUtil.xssFilter(request.getParameter("col"));
	if(col == null || col.equals("")) col = "1";
	String tmpltNm  = StringUtil.xssFilter(request.getParameter("rpt_tmplt_nm"));
	if(tmpltNm == null || tmpltNm.equals("")) tmpltNm = "";
	String pop_yn = StringUtil.xssFilter(request.getParameter("pop_yn"));
	if(pop_yn == null || pop_yn.equals("")) pop_yn = "";
	String noType  = StringUtil.xssFilter(request.getParameter("noType"));
	if(noType == null || noType.equals("")) noType = "";
	String noVal  = StringUtil.xssFilter(request.getParameter("noVal"));
	if(noVal == null || noVal.equals("")) noVal = "";
	String tmpltOfc  = StringUtil.xssFilter(request.getParameter("tmplt_ofc_cd"));
	if(tmpltOfc == null || tmpltOfc.equals("")) tmpltOfc = "";
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		strOfc_cd = account.getOfc_cd();


		event = (FnsInv0051Event)request.getAttribute("Event");
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
<input type="hidden" name="tmpltNm" id="tmpltNm" value="<%=tmpltNm%>">
<input type="hidden" name="pop_yn" id="pop_yn" value="<%=pop_yn%>">
<input type="hidden" name="ofc_cd_s" id="ofc_cd_s" value="<%=strOfc_cd%>">
<input type="hidden" name="template_name_tmp" id="template_name_tmp">
<input type="hidden" name="retrieve_yn" id="retrieve_yn">
<input type="hidden" name="tmplt_ofc_cd" id="tmplt_ofc_cd" value="">
<input type="hidden" name="select_tmplt" id="select_tmplt" value="">
<input type="hidden" name="tmplt_auth_id" id="tmplt_auth_id" value="">
<input type="hidden" name="noType" id="noType" value="<%=noType%>">
<input type="hidden" name="noVal" id="noVal" value="<%=noVal%>">	

<%
	if(pop_yn.equals("Y")){
%>
<!-- page_title_area(S) -->
<div class="layer_popup_title">
	<div class="page_title_area clear">
	   <!-- page_title(S) -->
		<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
		<h2 class="page_title"><span>Customer Preferable Report - Item Select</span></h2>
		<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn"><!-- 
			--><button class="btn_accent" name="btn_retrieve" id="btn_retrieve" type="button">Retrieve</button><!--
			--><button class="btn_normal" name="btn_new" id="btn_new" type="button">New</button><!--
			--><button class="btn_normal" name="btn_save" id="btn_save" type="button">Save</button><!--
			--><button class="btn_normal" name="btn_delete" id="btn_delete" type="button">Delete</button><!--
			--><button class="btn_normal" name="btn_select" id="btn_select" type="button">Apply</button><!--
			--><button class="btn_normal" name="btn_close" id="btn_close" type="button">Close</button>
		</div>
		<!-- opus_design_btn(E) -->
		
		<!-- page_location(S) -->
		<div class="location">	
			<span id="navigation"></span>
		</div>
		<!-- page_location(E) -->
	</div>
</div>
<!-- page_title_area(E) -->	
<div class="layer_popup_contents">
<%
	}else{
%>
<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" name="btn_retrieve" id="btn_retrieve" type="button">Retrieve</button><!--
		--><button class="btn_normal" name="btn_new" id="btn_new" type="button">New</button><!--
		--><button class="btn_normal" name="btn_save" id="btn_save" type="button">Save</button><!--
		--><button class="btn_normal" name="btn_delete" id="btn_delete" type="button">Delete</button><!--
		--><button class="btn_normal" name="btn_select" id="btn_select" type="button" disabled>Apply</button><!--
		--></div>
	<!-- opus_design_btn (E) -->

	<!-- page_location(S) -->
	<div class="location">	
		<span id="navigation"></span>
	</div>
	<!-- page_location(E) -->
</div>
<!-- page_title_area(E) -->
<%
	}
%>
<!-- wrap_search(S) -->
<div class="wrap_search ">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry">
		<table>
			<tbody>
				<colgroup>
					<col width="95" />
					<col width="280" />
					<col width="110" />
					<col width="460" />
					<col width="*" />
				</colgroup>
				<tr>
					<th>Template Name</th>   
					<td><script type="text/javascript" style="ime-mode:disabled">ComComboObject('rpt_tmplt_nm', 3, 250, 0, 1, 0, true,true);</script></td>
					<th class="sm">Display Option</th> 
					<td class="sm" align="center">
						<input type="radio" name="rpt_auth_id" id="rpt_auth_id" value="OFC" class="trans" onClick="fncRptAuthId(this);" checked>&nbsp;Public in my office&nbsp;&nbsp;
					    <input type="radio" name="rpt_auth_id" id="rpt_auth_id" value="RHQ" class="trans" onClick="fncRptAuthId(this);">&nbsp;Public in my H/Q&nbsp;&nbsp;
					    <input type="radio" name="rpt_auth_id" id="rpt_auth_id" value="ONLY" class="trans" onClick="fncRptAuthId(this);">&nbsp;Not public&nbsp;&nbsp;
					    <input type="radio" name="rpt_auth_id" id="rpt_auth_id" value="ALL" class="trans" onClick="fncRptAuthId(this);">&nbsp;Public to all 
					</td>  
					<td></td>
				</tr>
			</tbody>
		</table>
	</div>
	<!-- opus_design_inquiry(E) -->
</div>
<!-- wrap_search(E) -->
<!-- wrap_result(S) -->
<div class="wrap_result">
	<!-- layout_wrap(S) -->
	<div class="layout_wrap">
	    <div class="layout_flex_fixed" style="width:48%">
	        <!-- opus_design_grid(S) -->
	        <div class="opus_design_grid" id="mainTable">
	        	<div class="opus_design_inquiry" style="height:20px;margin-top:9px;"><h3 class="title_design">All Item List</h3></div>
	            <script type="text/javascript">ComSheetObject('sheet');</script>
	        </div>
	        <!-- opus_design_grid(E) -->
	    </div>
 	    <div class="layout_flex_fixed" style="width:4%;text-align:center;">
	    	<table class="search" style="width:55px;height:600px; vertical-align:middle;">
				<colgroup>
					<col width="50">
				</colgroup>
				<tbody>
					<tr>
						<td style="text-align:center;">
							<div>
								<button class="btn_right" type="button" name="btn_add" id="btn_add"></button>
							</div>
							<div style="margin-top:10px;">
								<button class="btn_left" type="button" name="btn_del" id="btn_del"></button>
							</div>
						</td>
					</tr>
				</tbody>
			</table>
	    </div>
	    <div class="layout_flex_fixed" style="width:48%; text-align:right;">
	        <!-- opus_design_grid(S) -->
	        <div class="opus_design_grid" id="headerTable">
	        	<div class="opus_design_inquiry"><h3 class="title_design">Selected Item List</h3></div>
	         	<div class="grid_option_left" style="width:39%;margin-left:10%;">
					<table>
						<colgroup>
							<col width="200" />
							<col width="*" />
						</colgroup>
						<tbody>
							<tr>
								<th>Charge break-down S/C(RFA)</th>
								<td><button type="button" id="btns_charge" name="btns_charge" class="input_seach_btn" onclick="javascript:openCharge();"></button></td> 
							</tr>
						</tbody>
					</table>
				</div>
	        	<div class="opus_design_btn">
	        		<button class="btn_normal" name="btns_up" id="btns_up" type="button">Seq. Up</button><!--  
	        		--><button class="btn_normal" name="btns_down" id="btns_down" type="button">Seq. Down</button>
	        	</div>
	            <script type="text/javascript">ComSheetObject('sheet1');</script>
	        </div>
	        <div class="opus_design_grid" style="display:none">
		        <script type="text/javascript">ComSheetObject('sheet2');</script>
		    </div>
		    <div class="opus_design_grid" style="display:none">
		        <script type="text/javascript">ComSheetObject('sheet3');</script>
		    </div>
	        <!-- opus_design_grid(E) -->
	    </div>
	</div>
	<!-- layout_wrap(E) -->
</div>
<!-- wrap_result(E) -->
<%
	if(pop_yn.equals("Y")){
%>
</div>
<%
	}
%>
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
		var rpt_tmplt_nm = comboObjects[0].GetSelectText();
		var tmplt_ofc_cd = formObject.tmplt_ofc_cd.value;

		opener.<%= func %>(rArray, <%=row%>, "<%=col%>", rpt_tmplt_nm+"|"+tmplt_ofc_cd);
		window.close();
	}	
	
	function getCheckedRows(colName) {
		var checkRows;
		var sheetObj = sheetObjects[1];
		var colsCnt = sheetObj.LastCol() + 1;
		var rows = sheetObj.RowCount() + 1;
		var formObject = document.form;
		
		var rArray = null; //행데이터를 담고 있는 배열
    	var cArray = null; //열데이터를 담고 있는 배열
    	
		
 		var idx = 0;
  		rArray = new Array(checkRows);
  		var chgFlg ="N";
  		
  		
		for(var i = 1; i < rows; i++) {

			if(sheetObj.GetCellValue(i, "ibflag") != "D" && sheetObj.GetCellValue(i, "rpt_itm_id") != "INV143") {
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
	  	return rArray;
	}	
</SCRIPT>