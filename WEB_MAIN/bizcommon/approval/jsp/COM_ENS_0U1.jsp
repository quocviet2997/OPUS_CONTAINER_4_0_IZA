<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_0U1.jsp
*@FileTitle  : Approval
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.bizcommon.approval.event.ComEns0U1Event"%>
<%@ page import="com.clt.bizcommon.approval.event.ComEns0U1EventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.FormCommand"%>
<%
	ComEns0U1Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	ComEns0U1EventResponse eventResponse = null;	//RDTO(Data Transfer Object including DB ResultSet)
	Exception serverException   = null;			//서버에서 발생한 에러
	DBRowSet rowSet	  = null;							   //DB ResultSet
	String strErrMsg = "";								 //에러메세지
	int rowCount	 = 0;								  //DB ResultSet 리스트의 건수	
    String strRhq = "";
	try {		
	   //SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
	   //userId=account.getUsr_id();
	   //userAuth=account.getAuth();
		
		event = (ComEns0U1Event)request.getAttribute("Event");

		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}else{
			eventResponse = (ComEns0U1EventResponse)request.getAttribute("EventResponse");
			if (eventResponse != null) {
				rowSet = eventResponse.getRs();
				if(rowSet != null){
					 rowCount = rowSet.getRowCount();
				} // end if
			} // end if
		} // end else
		
		//FormCommand formcommand = event.getFormCommand();
		//String approveResultMsg = "";   -- 2016.01.12 소스품질 대상.shall not be accessed(20).
		//if( formcommand.isCommand(FormCommand.COMMAND01) ) {
		//	approveResultMsg = eventResponse.getApproveResultMsg();
		//}
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
</head>
<form name="form">
<input type="hidden" name="f_cmd"> 
<input type="hidden" name="iPage">
<!-- BackEndJob을 위한 Field -->
<input type="hidden" name="key" id="key">

<input type="hidden" name="f_csr_no"  id="f_csr_no">
<input type="hidden" name="f_apro_rqst_no"  id="f_apro_rqst_no">
<input type="hidden" name="f_apro_rqst_seq" id="f_apro_rqst_seq">
<input type="hidden" name="f_apro_rmk"  id="f_apro_rmk">

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	    
    <!-- page_title(S) -->
    <!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
    <h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
    <!-- page_title(E) -->
    
    <!-- opus_design_btn(S) -->
    <div class="opus_design_btn">
		<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button>
		<button type="button" class="btn_normal" name="btn_New"  	id="btn_New">New</button>
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

<!-- page_title_area(E) -->

<div class="wrap_search">
	<div class="opus_design_inquiry wFit">
		<table>
			<tbody>
				<colgroup>
		            <col width="60" />
		            <col width="85" />
		            <col width="50" />
		            <col width="110" />
		            <col width="50" />
		            <col width="110" />
		            <col width="50" />
		            <col width="100" />
		            <col width="50" />
		            <col width="100" />
		            <col width="60" />
		            <col width="100" />
		            <col width="100" />
		            <col width="100" />
	        	</colgroup>
				<tr>
					<th>Module</th>
					<td><%= com.clt.bizcommon.util.BizComUtil.getCodeCombo("sub_sys_cd", "", "", "SUBSYS", 2, "0:") %></td>
					<th>Status</th>
					<td>
						<select name="status">
							<option value="">All</option>
							<option value="P" selected>Requested</option>
							<option value="F">1st Approved</option>
							<option value="C">Final Approved</option>							
							<option value="R">Disapproved</option>
							<option value="E">Error</option>
						</select>
					</td>
					<th>Date</th>
					<td>
	                   <span class="inquiry_calendar">
							<input name="sdate" type="text" class="input1" maxlength="10" style="width:75px" dataformat="ymd">
							<span class="dash">-</span>
							<input name="edate" type="text" class="input1" maxlength="10"  style="width:75px" dataformat="ymd"><!--
							--><button type="button" class="calendar ir" name="btns_Calendar2" id="btns_Calendar2"></button>
	                    </span> 
					</td>
					<th>Office</th>
					<td><input type="text" name="rqst_ofc_cd" style="width:65px" maxlength="6" dataformat="engup" ></td>
					<th>S/P Code</th>
					<td>
					<input type="text" name="vndr_seq" maxlength="6" style="width:65px" dataformat="num">
					<button type="button" name="btn_vndr" id="btn_vndr" class="input_seach_btn"></button>
					</td>
					<th>CSR No.</th>
					<td>
					<input type="text" name="csr_no" style="width:150;text-align:left;" dataformat="engup" otherchar=",">
					<button type="button" class="multiple_inq ir" name="btns_multisearch" id="btns_multisearch"></button>
					</td>
					<td></td>
					<td></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>

<div class="wrap_result">
	<div class="" style="position:absolute;"">
		<table>
			<tr>
				<th>Total amount : USD&nbsp;</th>
				<td><input type="text" name="usd_apro_ttl_amt" class="input2" style="width:110px;text-align:right;" readOnly></td>
				<td>&nbsp;(total amount in selected for approval)</td>
			</tr>
		</table>
	</div>
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid">
		<!-- table>
		<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<th>Total amount : USD</th>
		<td><input type="text" name="usd_apro_ttl_amt" class="input2" style="width:110px;text-align:right;" readOnly></td>
		<td>(total amount in selected for approval)</td>
		<td></td>
		<td-->
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_Detail" id="btn_Detail">Detail</button>
			<!-- 
			<button type="button" class="btn_normal" name="btng_viewapprovalstep" id="btng_viewapprovalstep">View Approval Step</button>
			 -->
			<button type="button" class="btn_normal" name="btng_confirm" id="btng_confirm">Approve</button>
			<button type="button" class="btn_normal" name="btng_reject" id="btng_reject">Disapprove</button>
		</div>
		<!-- /td>
		</tr>	
		</table-->	
		
		<!-- 그리드 데이터 영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
			<script language="javascript">ComSheetObject('sheet1');</script>
		<!-- 그리드 데이터 영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
		<!-- table>
			<tr>
				<th>Total amount : USD</th>
				<td><input type="text" name="usd_apro_ttl_amt" class="input2" style="width:110px;text-align:right;" readOnly></td>
				<td>(total amount in selected for approval)</td>
				<td></td>
			</tr>
		</table-->
	</div>
	<!-- opus_design_grid(E) -->
</div>

</form>