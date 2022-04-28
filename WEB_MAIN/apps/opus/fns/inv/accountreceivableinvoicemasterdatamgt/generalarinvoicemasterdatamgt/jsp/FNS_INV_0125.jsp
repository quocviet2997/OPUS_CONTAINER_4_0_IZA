<%
/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName   : FNS_INV_0125.jsp
*@FileTitle  : TAX Profile Setup
*Open Issues :
*Change history  :
*@LastModifyDate : 
*@LastModifier   : 
*@LastVersion    : 1.0
* 2017.11.01 HRJ(JWY)
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
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.framework.component.util.StringUtil" %>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemasterdatamgt.generalarinvoicemasterdatamgt.event.FnsInv0125Event"%>
<%  
    FnsInv0125Event event = null;   
	Exception serverException   = null;		//Errors from server
	String strErrMsg = "";					//Error message
	int rowCount	 = 0;					//DB ResultSet list count

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";
	

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String strOfc_cd		= "";
	String pageType = "";
	String pop_yn = "";

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		strOfc_cd = account.getOfc_cd();

		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

 	// Get data from server..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

		pageType = StringUtil.xssFilter(request.getParameter("pagetype")) != null ? StringUtil.xssFilter(request.getParameter("pagetype")) : "";
		
	}catch(Exception e) {
		out.println(e.toString());
	}
%>
<script type="text/javascript">
<%= JSPUtil.getIBCodeCombo("rndTpCd", "", "CD32109", 0, "")%>
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
	<input type="hidden" name="tax_cnt_seq" id="tax_cnt_seq"> 
	<input type="hidden" name="tax_cnt_cd" id="tax_cnt_cd">
	<input type="hidden" name="pagetype" id="pagetype" value="<%=pageType%>"> 
	<input type="hidden" name="log_ofc_cd" id="log_ofc_cd" value="<%=strOfc_cd%>">

	<!-- page_title_area(S) -->
	<div class="page_title_area clear ">
		<!-- page_title(S) -->
		<h2 class="page_title">
			<button type="button">
				<span id="title"></span>
			</button>
		</h2>
		<!-- page_title(E) -->

		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->
			<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button>
			<button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button>
			<button type="button" class="btn_normal" name="btn_Save" id="btn_Save">Save</button>
			<button type="button" class="btn_normal" name="btn_DownExcel" id="btn_DownExcel">Down Excel</button>
			<button type="button" class="btn_normal" name="btn_DupCheck" id="btn_DupCheck">DUP Charge</button>
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
			<table class="search" border="0" style="width: 759px;">
				<colgroup>
		            <col width="70" />
		            <col width="80" />
		            <col width="70" />
		            <col width="*" />
		        </colgroup>
		        <tbody>
					<tr>
						<th>Country</th>
						<td><script type="text/javascript">ComComboObject('cnt_cd', 2, 70, 0);</script></td>
				        <th width="20">Delete Flg</td>
				        <td width="400"><select style="width:67px;" name="delt_flg" id="delt_flg">
					      	<option value="N" selected>No</option>
					        <option value="Y" >Yes</option>
				</select></td>


<!--
						<th>Delete FLG</th>
						<td><script type="text/javascript">ComComboObject('delt_flg', 2, 70, 0);</script></td>
-->	
					</tr>
				</tbody>
			</table>
		</div>
	</div>

	<div class="wrap_result">
		<!-- opus_design_grid(S) -->
		<div class="opus_design_grid" id="mainTable">
			<div class="opus_design_btn">
				<!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->
				<button type="button" class="btn_normal" name="btn_RowAdd0" id="btn_RowAdd0">Row Add</button>
				<button type="button" class="btn_normal" name="btn_Delete0" id="btn_Delete0">Row Delete</button>
			</div>
			<!-- 그리드 데이터 영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
			<script type="text/javascript">ComSheetObject('sheet0');</script>
			<!-- 그리드 데이터 영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
		</div>
		<div class="layout_wrap">
			<!-- layout_vertical_2(S) -->
			<div class="layout_vertical_2" style="width:43%;margin-right:2%">
				<div class="opus_design_grid">
					<h3 class="title_design">TAX Charge</h3>
					<!--Content-->
					<div class="opus_design_btn">
						<!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->
						<button type="button" class="btn_normal" name="btn_RowAdd1" id="btn_RowAdd1">Row Add</button>
						<button type="button" class="btn_normal" name="btn_Delete1" id="btn_Delete1">Row Delete</button>
					</div>
					<!-- 그리드 데이터 영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
					<script type="text/javascript">ComSheetObject('sheet1');</script>
					<!-- 그리드 데이터 영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
				</div>
			</div>
			<div class="layout_vertical_2" style="width: 55%">
				<div class="opus_design_grid">
					<h3 class="title_design">Domestic Country</h3>
					<!--Content-->
					<div class="opus_design_btn">
						<!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->
						<button type="button" class="btn_normal" name="btn_RowAdd2" id="btn_RowAdd2">Row Add</button>
						<button type="button" class="btn_normal" name="btn_Delete2" id="btn_Delete2">Row Delete</button>
					</div>
					<!-- 그리드 데이터 영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
					<script type="text/javascript">ComSheetObject('sheet2');</script>
					<!-- 그리드 데이터 영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
				</div>	
			</div>
			<div class="layout_vertical_2" style="display:none">
				<div class="opus_design_grid">
					<!-- 그리드 데이터 영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
					<script type="text/javascript">ComSheetObject('sheet3');</script>
					<!-- 그리드 데이터 영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
				</div>	
			</div>
		</div>
	</div>
</form>