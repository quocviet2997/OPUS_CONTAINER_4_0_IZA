<%
/*=========================================================
*Copyright(c) 2020 CyberLogitec
*@FileName : MRM_CUS_POPUP.jsp
*@FileTitle : MRM Customer
*Open Issues :
*Change history :
*@LastModifyDate : 2022.05.20
*@LastModifier : Viet Tran
*@LastVersion : 1.0
* 2020.03.18 
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
<%@ page import="com.clt.apps.opus.esm.clv.carrier.customercd.event.MrmCusPopupEvent"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	MrmCusPopupEvent  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.Carrier.CarrierMgmt");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (MrmCusPopupEvent)request.getAttribute("Event");
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

<script language="javascript">
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
<div class="layer_popup_title">
	<div class="page_title_area clear">
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
	   		--><button type="button" class="btn_normal" name="btn_Ok" id="btn_Ok">Ok</button>
		</div>
		<div class="location">
	     		<span id="navigation"></span>
		</div>
	</div>
</div>

<div class="layer_popup_contents">
	<div class="wrap_search">
		<div class="opus_design_inquiry">
			<table>
				<colgroup>
					<col width="100">
					<col width="150">
					<col width="100">
					<col width="*">

			    	</colgroup>
			    	<tbody>
					<tr>
					   	<th>Country</th><!--
						--><td><input type="text" dataformat="enguponly" style="width:100px;" class="input" value="" name="s_cust_cnt_cd" id="s_cust_cnt_cd" maxlength="2"></td><!--
						--><th>Sequence</th><!--
						--><td><input type="text" dataformat="num" style="width:100px;" class="input" value="" name="s_cust_seq" id="s_cust_seq" maxlength="6"></td>
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
</div>
</form>
