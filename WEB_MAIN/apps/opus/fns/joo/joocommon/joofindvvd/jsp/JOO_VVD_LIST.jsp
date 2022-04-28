<%
/*=========================================================
 *Copyright(c) 2018 CyberLogitec. All Rights Reserved.
 *@FileName   JOO_VVD_LIST.jsp
 *@FileTitle  : VVD Code Help
 *@author     : CLT
 *@version    : 1.0
 *@since      : 2018/12/03
 =========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.joocommon.joofindcodeandcheck.event.JooComEvent"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import = "com.clt.framework.component.util.StringUtil" %>
<%
	JooComEvent  event			= null;			//PDTO(Data Transfer Object including Parameters)
	Exception serverException	= null;			//error from server
	String strErrMsg			= "";			//error message
	int rowCount				= 0;			//count of DB ResultSet list
	String pageRows				= "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.opus.fns.joo.joocommon.joofindcodeandcheck");
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		
		event = (JooComEvent)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		}catch(Exception e) {
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

<form name="form">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
	<!-- popup_title_area(S) -->
	<div class="layer_popup_title">
		<!-- page_title_area(S) -->
		<div class="page_title_area clear">
			<!-- page_title(S) -->
			<h2 class="page_title"><span>VVD Code Inquiry</span></h2>
			<!-- page_title(E) -->
			
			<!-- opus_design_btn(S) -->
			<div class="opus_design_btn">
				<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--  
				--><button type="button" class="btn_accent" name="btn_ok" id="btn_ok">OK</button><!-- 
				--><button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button>	        	
			</div>
		<!-- opus_design_btn(E) -->
		</div>
	<!-- page_title_area(E) -->
	</div>
	<!-- popup_title_area(E) -->
	<!-- popup_contens_area(S) -->
	<div class="layer_popup_contents" style="overflow:hidden;">
		<div class="wrap_search">
			<!-- inquiry_area(S) -->
			<div class="opus_design_inquiry wFit">   <!-- no TAB  -->
				<table> 
					<colgroup>
						<col width="80" />
						<col width="330" />
						<col width="*" />
					</colgroup>
					<tbody>
						<tr>
							<th>Vessel Code</th>   
							<td><input type="text" style="width:45px;text-align:center;ime-mode:disabled;" dataformat="engup" class="input" maxlength=4 name="vsl_cd" id="vsl_cd" value="" tabindex="1"></td>
							<td></td>
						</tr>
					</tbody>
				</table>
			</div>
			<!-- inquiry_area(E) -->
		</div>
		<div class="wrap_result">
			<!-- opus_design_grid(S) -->
			<div class="opus_design_grid" id="mainTable">
				<script language="javascript">ComSheetObject('sheet1');</script>
			</div>
			<!-- opus_design_grid(E) -->
		</div>
	</div>
	<!-- popup_contens_area(E) -->
</form>
