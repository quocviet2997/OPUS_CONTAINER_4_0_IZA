<%
/*=========================================================
*Copyright(c) 2015 CyberLogitec. All Rights Reserved.
*@FileName 	 : ADM_SYS_0014.jsp
*@FileTitle  : MQ INBOUND MONITORING PAGE	
*@author     : JeongHoon,Kim
*@version    : 1.0
*@since      : 2015/03/12
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>

<%
	Exception serverException = null; //서버에서 발생한 에러
	String strErrMsg = ""; //에러메세지

	String yrMonDay ="";
	try {
		yrMonDay = DateTime.getDateString().substring(0,4)+"-"+DateTime.getDateString().substring(5,7)+"-"+DateTime.getDateString().substring(8,10);		
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		    
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
	} catch (Exception e) {
		out.println(e.toString());
	}
%>

<script language="javascript">
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
<input type="hidden" name="emlHour" value="00">
<input type="hidden" name="emlMinute" value="00">

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
				<th width="90px" class="align_right">Date</th>
				<td width="160px">
				<input type="text" style="width:62;text-align:center;" class="input1" name="emlDate" maxlength="10" dataformat="ymd" required fullfill caption="Send Date"  value="<%=yrMonDay%>" >
				<img src="img/btns_calendar.gif" name="btns_calendar" width="18" height="20" alt="" border="0" align="absmiddle" style="cursor:hand;">
				</td>
				<th width="90px" class="align_right">Send Number</th>
				<td width="160px"><input type="text" name="eml_snd_no" style="width: 150" value=""></td>
				<th width="90px" class="align_right">Status</th>
				<td>
				<select style="width:130px;" name='eml_proc_sts_cd'>
					<option value="" selected>All</option>
					<option value="3">Success</option>
					<option value="4">Failed</option>
				</select>
				</td>
				<th width="90px" class="align_right">Sender's Email</th>
				<td><input type="text" name="sndr_eml" style="width: 150" value=""></td>
				<th width="90px" class="align_right">Title</th>
				<td width="250px"><input type="text" name="eml_tit_nm" style="width: 250" value=""></td>
			</tr>
		</table>
	</div>
</div>
<div class="wrap_result">
	<!-- opus_grid_design_btn(S) -->	
	<script language="javascript">ComSheetObject('sheet1');</script>
	<!-- opus_grid_design_btn(E) -->	
</div>

</form>
