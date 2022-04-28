<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName  : COM_RD_COMMON_POPUP.jsp
*@FileTitle : COM_RD_COMMON_POPUP
*@author    : CLT
*@version   : 1.0
*@since     : 2016/07/01
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.common.reportdesigner.commonpopup.event.ComRdCommonPopupEvent"%>
<%@ page import="org.apache.log4j.Logger"%>

<%
	ComRdCommonPopupEvent event = null; //PDTO(Data Transfer Object including Parameters)
	Exception serverException = null; //서버에서 발생한 에러
	String strErrMsg = ""; //에러메세지
	int rowCount = 0; //DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList = "";
	String pageRows = "100";

	String strUsr_id = "";
	String strUsr_nm = "";
	Logger log = Logger.getLogger("com.clt.apps.ReportDesigner.CommonPopup");

	try {
		SignOnUserAccount account = (SignOnUserAccount) session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id = account.getUsr_id();
		strUsr_nm = account.getUsr_nm();

		event = (ComRdCommonPopupEvent) request.getAttribute("Event");
		serverException = (Exception) request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// 초기화면 로딩시 서버로부터 가져온 데이터 추출하는 로직추가 ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

	} catch (Exception e) {
		out.println(e.toString());
	}


%>
<script type="text/javascript">
function setupPage(){
	var errMessage = "<%=strErrMsg%>";
	if (errMessage.length >= 1) {
		ComShowMessage(errMessage);
	}
	rdOpen();
}
</script>
<script type="text/javascript" src="/opuscntr/rpt/script/common_rd.js"></script>
<form name="form"">
<input type="hidden" id="com_mrdArguments" value="<%=request.getParameter("com_mrdArguments")%>" />
<input type="hidden" id="com_mrdPath" value="<%=request.getParameter("com_mrdPath")%>" />
<input type="hidden" id="com_mrdDisableToolbar" value="<%=request.getParameter("com_mrdDisableToolbar")%>" />
<input type="hidden" id="com_isBatch" value="<%=request.getParameter("com_isBatch")%>" />

	<div class="layer_popup_title">	
		<div class="page_title_area clear">
		   	<h2 class="page_title"><span><%=request.getParameter("com_mrdBodyTitle")!=null?request.getParameter("com_mrdBodyTitle"):"" %></span></h2>
		    <div class="opus_design_btn">
				<button type="button" class="btn_normal" name="btn_Close" onclick="ComClosePopup()"	id="btn_Close">Close</button>
		    </div>
		</div>
	</div>


	<div class="layer_popup_contents">
		<div class="wrap_result">
			<div class="opus_design_RD"> 
				<script type="text/javascript">rdViewerObject();</script>
		    </div>
		</div>
	</div>
</form>