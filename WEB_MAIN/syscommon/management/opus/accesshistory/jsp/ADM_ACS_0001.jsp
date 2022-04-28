<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : ADM_ACS_0001.jsp
*@FileTitle  : ADM_ACS_0001
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.management.opus.accesshistory.event.AccesshistoryEvent"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	AccesshistoryEvent  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String strRhq			= "";
	Logger log = Logger.getLogger("com.clt.apps.AccessHistory.AccessHistory");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (AccesshistoryEvent)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// 초기화면 로딩시 서버로부터 가져온 데이터 추출하는 로직추가 ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		strRhq = eventResponse.getETCData("rhq");
		
	}catch(Exception e) {
		out.println(e.toString());
	}
%>
<script language="javascript">
	var rhqOfcId = "<%=strRhq%>";
	
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	    form.dateFrom.value = ComGetDateAdd(ComGetDateAdd(null,"M",-1),"D",-1);
	    form.dateTo.value = ComGetDateAdd(null,"D",-1);
	}
    function popCal(calObj){
    	 //달력 열기
    	var cal = new ComCalendar();
    	cal.select(calObj, 'yyyy-MM-dd');
    }

</script>

<form name="form">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">

	<div class="page_title_area clear">
	    <h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	    <div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button>
			<button type="button" class="btn_normal" name="btn_New"   id="btn_New">New</button>
			<button type="button" class="btn_normal" name="btn_DownExcel"   id="btn_DownExcel">Down Excel</button>
		</div>
	    <div class="location">
	        <span id="navigation"></span>
	    </div>
	</div>
		
	<div class="wrap_search">	
	<div class="opus_design_inquiry wFit">
	    <table>
	        <tbody>
				<tr>
					<th width="40">Date</th>
					<td width="120"><input type="text" name="dateFrom" dataformat="ymd" maxlength="8" size="10">
						    <img src="img/btns_calendar.gif" align="absmiddle" style="cursor:hand" onClick="popCal(dateFrom);">
							&nbsp;~&nbsp;
							<input type="text" name="dateTo" dataformat="ymd" maxlength="8" size="10">
							<img src="img/btns_calendar.gif" align="absmiddle" style="cursor:hand" onClick="popCal(dateTo);">
					</td>
					<th width="40">Level</th>
					<td width="120"><select name="level" style="width:40;" class="input1">
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6" selected>6</option>
							</select>
					</td>
					<th width="40">Kind of Function</th>
					<td width="120"><select name="kind" style="width:80;" class="input1">
								<option value="" selected>All</option>
								<option value="M">Menu</option>
								<option value="C">CUD</option>
								<option value="R">R</option>
								<option value="E">ETC</option>
							</select>
					</td>
				</tr> 
				<tr>
					<th>RHQ</th>
					<td><script type="text/javascript">ComComboObject("rhq", 1, 80, 0);</script></td>
					<th>Office Code</th>
					<td><input type="text" style="width:80;" dataformat="engup" class="input" name= "ofcCd">&nbsp;<img class="cursor" src="img/button/btns_search.gif" width="19" height="20" border="0" align="absmiddle" name="btn_ofc_cd"></td>
					<th>Menu No.</th>
					<td><input name="pgmNo" dataformat="engup" otherchar="_" type="text" style="width:100;" class="input" >&nbsp;<img class="cursor" src="img/button/btns_search.gif" width="19" height="20" border="0" align="absmiddle" name="btn_pgm_no"></td>
					<th width="60">User ID</th>
					<td><input name="usrId" type="text" style="width:100;" class="input"></td>
				</tr> 
			</tbody>
		</table>
	</div>
	</div>

	<div class="wrap_result">
	<div class="opus_design_grid">
		<script language="javascript">ComSheetObject('sheet1');</script>
	</div>
	</div>
	<div class="wrap_result">
	<div class="opus_design_grid">
		<script language="javascript">ComSheetObject('sheet2');</script>
	</div>
	</div>
</form>
