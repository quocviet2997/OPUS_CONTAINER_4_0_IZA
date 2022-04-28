<%
/*=========================================================
*Copyright(c) 2018 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0063.jsp
*@FileTitle  : Credit Customer
*@author     : CLT
*@version    : 1.0
*@since      : 2018/12/19
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.partner.event.BcmCcd0060Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
		BcmCcd0060Event  event = null;				//PDTO(Data Transfer Object including Parameters)
		Exception serverException   = null;			//Error from server
		String strErrMsg = "";						//Error message
		int rowCount	 = 0;						//Count of DB resultSet list
	
		String successFlag = "";
		String codeList  = "";
		String pageRows  = "100";

		String strUsr_id		= "";
		String strUsr_nm		= "";
		Logger log = Logger.getLogger("com.clt.apps.opus.bcm.ccd.commoncode.partner");
	
		try {
		   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
				strUsr_id =	account.getUsr_id();
				strUsr_nm = account.getUsr_nm();
		
				event = (BcmCcd0060Event)request.getAttribute("Event");
				serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

				if (serverException != null) {
						strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
				}
		
				GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		
		}catch(Exception e) {
				out.println(e.toString());
		}
%>
<script type="text/javascript">
		var G_MDAA_CHK;
		var G_AHTU_TP_CD;
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
<!-- page_title_area(S) -->
<input type="hidden" name="f_cust_agmt_no" id="f_cust_agmt_no" />
<input type="hidden" name="f_cust_cd" id="f_cust_cd" />
<input type="hidden" name="f_btn_gb" id="f_btn_gb" />
<div class="page_title_area clear">
<!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
	<button type="button" class="btn_normal" name="btn_Cust" id="btn_Cust">Search Cust</button><!--
	 --><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button><!--
	 --><button type="button" class="btn_normal" name="btn_History" id="btn_History">History</button><!-- 
	 --><button type="button" class="btn_normal" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button>
	</div>
	<!-- opus_design_btn(E) -->

	<!-- page_location(S) -->
	<div class="location">
	<!-- location 내용 동적생성 (별도 코딩 불필요) -->
		<span id="navigation"></span>
	</div>
</div>
<!-- page_title_area(E) -->
<!-- wrap_search(S) -->  
<div class="wrap_search">
	<!-- opus_design_inquiry (S) -->
	<div class="opus_design_inquiry wFit">
		<table> 
			<colgroup>
				<col width="50px">
				<col width="100">
				<col width="50px">
				<col width="150">
				<col width="150">
				<col width="*">
			</colgroup>
			<tr class="h23">
				<th>Customer Code</th>
				<td><input type="text" style="width:120px;text-align:left;ime-mode:disabled;" class="input" dataformat="engup" name="cust_cd" maxlength="8"></td>
				<th>Legal English Name</th>
				<td><input type="text" style="width:250px;text-align:left;ime-mode:disabled;" class="input" name="cust_lgl_eng_nm" dataformat="engupetc"></td>
				<th>Credit Agreement No</th>
				<td><input type="text" style="width:150px;text-align:left;ime-mode:disabled;" class="input" name="cust_agmt_no" dataformat="engupetc" maxlength="20"></td>
				<td></td>
			</tr>	
		</table>
	</div>
	<!-- opus_design_inquiry (E) -->
</div>
<!-- wrap_search(E) -->  
<!-- wrap_result(S) -->  
<div class="wrap_result">
	<div class="layout_wrap">
		<!-- opus_design_grid(S) -->
		<div class="opus_design_grid"  id="mainTable">
			<table>			
			  <tr>
				<td><h3 class="title_design">Credit Term Information</h3></td>					
					<td style="text-align:right;padding-bottom:4px">	
						<!-- opus_design_btn(S) -->
						<div class="opus_design_btn">
						<!-- Content -->
							<button type="button" class="btn_normal" name="btn_RowAdd" id="btn_RowAdd">ADD</button>
							<!-- <button type="button" class="btn_normal" name="btn_RowEdit" id="btn_RowEdit">Detail</button> -->
						</div>
						<!-- opus_design_btn(e) -->				
					</td>
				</tr>
			</table>
			<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>
		<!-- opus_design_grid(E) -->
	</div>

	<div class="opus_design_inquiry">
		<div style="float:right; width:80%;">
			<table>
				<tbody>
					<tr>
		              	<th>Create User</th>
		                <td><input type="text" style="width:200px;" class="input2" name="cre_usr_id" readonly tabindex="-1" id="cre_usr_id" /></td>
		              	<th>Create Date/Time</th>
		                <td><input type="text" style="width:150px;" class="input2" name="cre_dt" readonly tabindex="-1" id="cre_dt" /></td>
		              	<th>Last Update User</th>
		                <td><input type="text" style="width:200px;" class="input2" name="upd_usr_id" readonly tabindex="-1" id="upd_usr_id" /></td>
		              	<th>Last Update Date/Time</th>
		                <td><input type="text" style="width:150px;" class="input2" name="upd_dt" readonly tabindex="-1" id="upd_dt" /></td>
	              	</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>
<!-- wrap_result(E) -->  


</form>