<%
/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName   : FNS_INV_0120.jsp
*@FileTitle  : India GST Rate Creation
*Open Issues :
*Change history  :
*@LastModifyDate : 
*@LastModifier   : 
*@LastVersion    : 1.0
* 2017.04.19 HYUN HWA KIM
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
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemasterdatamgt.generalarinvoicemasterdatamgt.event.FnsInv0120Event"%>
<%  
    FnsInv0120Event event = null;   
	Exception serverException   = null;		//Errors from server
	String strErrMsg = "";						    //Error message
	int rowCount	 = 0;						        //DB ResultSet list count

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
<input type="hidden"  name="pagetype" id="pagetype" value="<%=pageType%>">
<input type="hidden"  name="log_ofc_cd" id="log_ofc_cd" value="<%=strOfc_cd%>">
<input type="hidden"  name="cnt_cd" value="">

<!-- page_title_area(S) -->
<div class="page_title_area clear ">
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button>
	</h2>
	<!-- page_title(E) -->

	    <!-- opus_design_btn(S) -->
	    <div class="opus_design_btn">
	        <!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->
			<button type="button" class="btn_accent" name="btn_retrive" id="btn_retrive">Retrieve</button>
			<button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button>
			<button type="button" class="btn_normal" name="btn_Save" id="btn_Save">Save</button>
			<button type="button" class="btn_normal" name="btn_downExcel" id="btn_downExcel">Down Excel</button>						
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
		<table class="search" border="0" style="width:759px;">
			<tr>
				<th>Eff.Date</th>
                    <td width="300">
                        <input type="text" name="f_date" id="f_date" required dataformat="ymd" maxlength="8" style="width:85px;" class="input1" cofield="f_date" caption="start date"><button type="button" class="calendar ir" name="btns_calendar1" id="btns_calendar1"></button>~&nbsp; 
                        <input type="text" name="t_date" id="t_date" required dataformat="ymd" maxlength="8" style="width:85px;" class="input1" cofield="t_date" caption="end date"><button type="button" class="calendar ir" name="btns_calendar2" id="btns_calendar2"></button>
                    </td>
                <th width="60">LCL State</td>
				<td width="100"><input type="text" style="width:80px" class="input2" name="locl_ste_cd"   maxlength="2"  minlength="2" value="" dataformat="engup"></td>    
                <th width="60">State</td>
				<td width="100"><input type="text" style="width:80px" class="input2" name="ste_cd"   maxlength="2"  minlength="2" value="" dataformat="engup"></td>    
				<th width="30">Bound</td>
				<td><select style="width: 67px;" name="io_bnd_cd" id="io_bnd_cd">
					<option value="" selected>All</option>
					<option value="O">O/B</option>
					<option value="I">I/B</option>
				</select></td>
				<th width="30">Delete</td>
				<td width="90"><select style="width:67px;" name="delt_flg" id="delt_flg">
					<option value="">All</option>
					<option value="Y">Yes</option>
					<option value="N" selected>No</option>
				</select></td>
				<th class="pad_rgt_12" style="color: #51AC2F;">Charge Info. by Service Account</th>
					<td><button class="input_seach_btn" name="btn_search" id="btn_search" type="button"></button></td>					
			</tr>
		</table>
	</div>				
</div>
		
<div class="wrap_result">
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid" id="mainTable" >					
	    <div class="opus_design_btn">
	        <!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->						
			<button type="button" class="btn_normal" name="btn_RowAdd" id="btn_RowAdd">Row Add</button>
			<button type="button" class="btn_normal" name="btn_Delete" id="btn_Delete">Row Delete</button>												
	    </div>				    								
		<!-- 그리드 데이터 영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
			<script type="text/javascript">ComSheetObject('sheet');</script>
		<!-- 그리드 데이터 영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->					
	</div>
</div>


</form>
