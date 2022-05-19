<%
/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : DOU_TRAINING_0004.jsp
*@FileTitle : Carrier List
*Open Issues :
*Change history :
*@LastModifyDate : 2022.05.17
*@LastModifier : Viet Tran
*@LastVersion : 1.0
* 2022.03.23 
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
<%@ page import="com.clt.apps.opus.esm.clv.carrier.carriermgmt.event.FnsDou0004Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsDou0004Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String carrierItems		= "";
	String rLaneItems		= "";
	Logger log = Logger.getLogger("com.clt.apps.Carrier.CarrierMgmt");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsDou0004Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		// 초기화면 로딩시 서버로부터 가져온 데이터 추출하는 로직추가 ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
		else{
			carrierItems = eventResponse.getETCData("carrierItems");
			rLaneItems = eventResponse.getETCData("rLaneItems");
		}
	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<style type="text/css">
.text_center{
	text-align:center;
}
</style>

<script language="javascript">
	var carrierCombo = "ALL|<%=carrierItems%>";
	var rLaneCombo = "|<%=rLaneItems%>";
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
<div class="page_title_area clear">
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<div class="opus_design_btn">
		<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!-- 
		--><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button><!-- 
		--><button type="button" class="btn_normal" name="btn_Save" id="btn_Save">Save</button><!-- 
		--><button type="button" class="btn_normal" name="btn_DownExcel" id="btn_DownExcel">Down Excel</button>
	</div>
	<div class="location">
		<span id="navigation"></span>
	</div>
</div>

<div class="wrap_search">
	<div class="opus_design_inquiry">
		<table>
			<colgroup>
				<col width="50">
				<col width="150">
				<col width="50">
				<col width="350">
				<col width="100">
				<col width="*">
			</colgroup>
			<tbody>
				<tr>
					<th>Carrier</th>
					<td><script type="text/javascript">ComComboObject('s_jo_crr_cd',1,120, 1, 0, 0);</script></td>
					<th>Vendor</th>
					<td>
						<input type="text" style="width:200px;" placeholder="Please type 6 number code" dataformat="num" name="s_vndr_seq" id="s_vndr_seq" maxlength="6">
					</td>
					<th>Create Date</th>
					<td>
						<input type="text" class="text_center" style="width:100px;" placeholder="YYYY-MM-DD" name="s_cre_dt_fm" id="s_cre_dt_fm" dataformat="ymd" maxlength="10" minlength="8"><!-- 
						--><button type="button" class="calendar ir" name="btn_calendar_fm" id="btn_calendar_fm" tabindex="-1"></button><!--   -->~ <!--  
						--><input type="text" class="text_center" style="width:100px;" placeholder="YYYY-MM-DD" name="s_cre_dt_to" id="s_cre_dt_to" dataformat="ymd" maxlength="10" minlength="8"><!--  
						--><button type="button" class="calendar ir" name="btn_calendar_to" id="btn_calendar_to" tabindex="-1"></button>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</div>

<div class="wrap_result">
	<div class="opus_design_grid">
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_Del" id="btn_Del">Row Delete</button><!--  
			--><button type="button" class="btn_normal" name="btn_Add" id="btn_Add">Row Add</button>
		</div>
		<script language="javascript">ComSheetObject('sheet1');</script>
	</div>
</div>
<!-- 개발자 작업	-->


<!-- 개발자 작업  끝 -->
</form>