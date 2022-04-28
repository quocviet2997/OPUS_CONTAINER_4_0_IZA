<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : ADM_SYS_0013.jsp
*@FileTitle  : FAX 관리
*@author     : CLT
*@version    : 1.0
*@since      : 2014/12/01
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.management.opus.faxmanagement.event.FaxManagementEvent"%>

<%
    FaxManagementEvent event = null; //PDTO(Data Transfer Object including Parameters)
	Exception serverException = null; //서버에서 발생한 에러
	String strErrMsg = ""; //에러메세지
	String successFlag = "";
	String codeList = "";
	String pageRows = "100";
	String strSubSysCd		= "";

	String yrMonDay ="";
	String strUsr_id ="";
	String strUsr_nm ="";
	String ofc_cd ="";
	String cnt_cd ="";
	
	try {
		
		yrMonDay = DateTime.getDateString().substring(0,4)+"-"+DateTime.getDateString().substring(5,7)+"-"+DateTime.getDateString().substring(8,10);
		
		event = (FaxManagementEvent)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
			strUsr_id =	account.getUsr_id();
			strUsr_nm = account.getUsr_nm();
		    ofc_cd	  = account.getOfc_cd();
		    cnt_cd 	  = account.getCnt_cd();
		    
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
	
	} catch (Exception e) {
		out.println(e.toString());
	}
%>

<script language="javascript">
	var subSysCd = "<%=strSubSysCd%>";
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			showErrMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form1">
<input type="hidden" name="f_cmd">
<input type="hidden" name="iPage">
<input type="hidden" name="codeid">
<input type="hidden" name="selectedcodes">

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->

	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
		 <button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button>
		 <button class="btn_normal" name="btn1_Down_Excel" id="btn1_Down_Excel" type="button">Down Excel</button>
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
	<div class="opus_design_inquiry wFit">   <!-- no TAB  -->
		<table class="search_in" border="0">
		
			<tr class="h23">				
				<th width="90px" class="align_left">Send No</th>
				<td width="160px"><input type="text" name="faxSndNo" style="width: 150" value=""></td>
				
				<th width="90px" class="align_left">Receiver Name</th>
				<td width="160px"><input type="text" name="rdApplCd" style="width: 150" value=""></td>
				
				
				<th width="90px" class="align_left">Receiver Fax No</th>
				<td><input type="text" name="rcvrInfoCtnt" style="width: 150" value=""></td>
			</tr>
			
			<tr class="h23">				
				<th width="90px" class="align_left">Module</th>
				<td width="160px"><input type="text" name="rdSubSysCd" style="width: 150" value=""></td>
				
				<th width="90px" class="align_left">Sender ID</th>
				<td width="160px"><input type="text" name="creUsrId" style="width: 150" value="<%=strUsr_id%>"></td>
				
				
				<th width="90px" class="align_left">Sender Office</th>
				<td><input type="text" name="ofcCd" style="width: 150" value="<%=ofc_cd%>"></td>
			</tr>
			
			<tr class="h23">				
				<th width="90px" class="align_left">Send Date</th>
				<td width="160px">
				<input type="text" style="width:62;text-align:center;" class="input1" name="faxSndDate" maxlength="10" dataformat="ymd" required fullfill caption="Send Date"  value="<%=yrMonDay%>" >
				<img src="img/btns_calendar.gif" name="btns_calendar" width="18" height="20" alt="" border="0" align="absmiddle" style="cursor:hand;">
				</td>
				
				<th width="90px"  class="align_left">Title</th>
				<td colspan="3" ><input type="text" name="faxTitNm" style="width:390px" value=""></td>
				
			</tr>
			
			<tr class="h23">				
				<th width="90px" class="align_left">Status</th>
				<td width="160px">
				<select style="width:130px;" name='faxProcStsCd'>
				<option value="" selected>All</option>
				<option value="Sending">Sending</option>
				<option value="Success">Success</option>
				<option value="Failed">Failed</option>
				</select>
				
				</td>
				
				<th width="90px" class="align_left">Status Detail</th>
				<td colspan="3" ><input type="text" name="xptErrMsg" style="width: 390px" value=""></td>
				
			</tr>
		</table>
	</div>
</div>


	
<div class="wrap_result">

<!-- opus_grid_design_btn(S) -->
	<div class="opus_design_grid">
		<!-- opus_grid_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_resend" id="btn_resend">Resend</button>
		</div>
		<!-- opus_grid_btn(E) -->
	</div>
	

	
	<script language="javascript">ComSheetObject('sheet1');</script>
	<!-- opus_grid_design_btn(E) -->
	
</div>

</form>
