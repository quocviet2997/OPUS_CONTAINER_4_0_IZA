<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : ADM_SYS_0009.jsp
*@FileTitle  : ADM_SYS_0009
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
<%@ page import="com.clt.syscommon.management.opus.superuser.event.SuperUserEvent"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	SuperUserEvent  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String strSubSysCd		= "";
	String strRhq			= "";
	String strUsr_Auth		= "";
	Logger log = Logger.getLogger("com.clt.apps.AccessHistory.AccessHistory");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		strUsr_Auth = account.getUsr_auth_tp_cd();


		event = (SuperUserEvent)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// 초기화면 로딩시 서버로부터 가져온 데이터 추출하는 로직추가 ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		strSubSysCd = eventResponse.getETCData("sub_sys_cd");
		strRhq = eventResponse.getETCData("rhq");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>
<script language="javascript">
	var subSysCd = "<%=strSubSysCd%>";
	var rhqCd = "<%=strRhq%>";
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
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
	    <!-- page_title(E) -->
	         
	    <div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
			<%
				if( strUsr_Auth != null && strUsr_Auth.equals("A") )
				{
				%>
				 --><button type="button" class="btn_normal" name="btn_Save"   id="btn_Save">Save</button><!--
				<%
				}
			%>
			 --><button type="button" class="btn_normal" name="btn_New"   		id="btn_New">New</button><!--
			 --><button type="button" class="btn_normal" name="btn_DownExcel"   id="btn_DownExcel">Down Excel</button>
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
						<th width="40">User ID</th>
						<td width="120"><input name="usrId" type="text" style="width:100px;" class="input"></td>
						<th width="40">User Name</th>
						<td width="120"><input name="usrNm" type="text" style="width:100px;" class="input"></td>
						<th width="80">Module</th>
						<td width="120">
							<script language="javascript">ComComboObject('subSys', 1, 100, 1);</script>
						</td>
						<th width="40">Admin</th>
						<td>
							<select name="admin" style="width:100px;" class="input1">
								<option value="" selected>All</option>
								<option value="Y">Yes</option>
								<option value="N">No</option>
							</select>
						</td>
						<th>RHQ</th>
						<td><script type="text/javascript">ComComboObject("rhq", 1, 80, 0);</script></td>
						<th>Office</th>
						<td><input name="ofcCd" dataformat="engup" type="text" style="width:100px;" class="input"><!--<img class="cursor" src="img/button/btns_search.gif" width="19px" height="20px" border="0px" align="absmiddle" name="btn_ofc_cd">--><!--
					    --><button type="button" class="input_seach_btn" id="btn_ofc_cd" name="btn_ofc_cd"></button></td>
					</tr>
					<tr>
						<th>Program ID</th>
						<td><input name="pgmNo" dataformat="engup" otherchar="_" type="text" style="width:100px;" class="input"></td>
						<th>Program Name</th>
						<td><input name="pgmNm" type="text" style="width:100px;" class="input"></td>
						<th>Option</th>
						<td>
							<input type="radio" name="opt" id="opt" value="S" class="trans" checked><label for="opt">Summary</label>
							<input type="radio" name="opt" id="opt2" value="D" class="trans"><label for="opt2">Detail</label>
						</td> 
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	
	<div class="wrap_result">
		<div class="opus_design_grid">
		    
		<div class="opus_design_btn">
			<input type="text" name="addrows" size="3" value="1"><button type="button" class="btn_normal" name="btng_rowadd" id="btng_rowadd">Row&nbsp;Add</button>
		</div>
			<script language="javascript">ComSheetObject('sheet1');</script>
		</div>
	</div>
</form>