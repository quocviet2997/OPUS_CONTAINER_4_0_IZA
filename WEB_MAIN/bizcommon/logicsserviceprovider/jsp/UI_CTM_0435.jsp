<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : UI_CTM_0435.jsp
*@FileTitle  : Lane 조회(공통 Popup)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/20
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.logicsserviceprovider.event.UiCtm0435Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	UiCtm0435Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	String strUsr_ofc = null;	
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	Logger log = Logger.getLogger("com.clt.apps.BizCommon.logicsserviceprovider");

	// p_sp_type 값 가져오기.
	String p_sp_type = request.getParameter("p_sp_type");
	if(p_sp_type == null){
		p_sp_type = "";
	}

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);

		strUsr_ofc = account.getOfc_cd();	   
		event = (UiCtm0435Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
	}catch(Exception e) {
		log.error(e.toString());
	}


%>

<script type="text/javascript">
	function setupPage(){

		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form"> 
<input type="hidden" name="f_cmd" value="1" id="f_cmd" />
<input type="hidden" name="mode" value="" id="mode" />
<input type="hidden" name="pagerows" value="" id="pagerows" />
<input type="hidden" name="depth" id="depth" />
<input type="hidden" name="chkDepth" id="chkDepth" />

<div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
	
		<!-- page_title(S) -->
		<h2 class="page_title"><span>Service Provider Inquiry</span></h2>
		<!-- page_title(E) -->
		
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve" 			id="btn_Retrieve">Retrieve</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_new" 			id="btn_new">New</button><!-- 		
			 --><button type="button" class="btn_normal" name="btn_ok" 				id="btn_ok">Select</button><!-- 		
			 --><button type="button" class="btn_normal" name="btn_close" 			id="btn_close">Close</button>		
		</div>
		<!-- opus_design_btn(E) -->		
		
	</div>
	<!-- page_title_area(E) -->
</div>

<div class="layer_popup_contents">
	<div class="wrap_search">
		<!-- opus_design_inquiry(S) -->
		<div class="opus_design_inquiry wFit">
			
			<!-- layout_wrap(S) -->
			<div class="layout_wrap">
				<div class="layout_vertical_3" style="width:30%">
					<table class = "grid2 wAuto">
						<colgroup>					
							<col width=""/>
							<col width=""/>
							<col width="*" />				
						</colgroup> 
						<tbody>
							<tr>
								<td style="text-align:center"><strong>Country</strong></td>
								<td><input type="text" name="p_country" dataformat="engup" style="width:58px;ime-mode:disabled" class="input" value="<%=(request.getParameter("p_country") == null)? "" : request.getParameter("p_country")%>"></td>								
							</tr>
							<tr>
								<td style="text-align:center"><strong>Control Office</strong></td>
								<td><input type="text"  name="p_ofc_cd" dataformat="engup" style="width:58px;ime-mode:disabled" class="input" value="<%=(request.getParameter("p_ofc_cd") == null)? "" : request.getParameter("p_ofc_cd")%>"></td>								
							</tr>
							<tr>
								<td style="text-align:center"><strong>USA EDI</strong></td>
								<td><input type="text"  name="usa_edi_cd" dataformat="engup" style="width:58px;ime-mode:disabled" class="input" value=""></td>								
							</tr>
						</tbody>
					</table>
				</div>
				<div class="layout_vertical_3" style="width:30%">
					<table  class = "grid2 wAuto">
						<colgroup>					
							<col width=""/>
							<col width="*" />				
						</colgroup> 
						<tbody>
							<tr>								
								<td style="text-align:center"><strong>S/P Code</strong></td>
								<td><input type="text" name="p_print_vndr_seq" dataformat="engup" style="width:58px;ime-mode:disabled" class="input" value="<%=(request.getParameter("p_print_vndr_seq") == null)? "" : request.getParameter("p_print_vndr_seq")%>"></td>								
							</tr>
							<tr>													
								<td style="text-align:center"><strong>Parent Code</strong></td>
								<td><input type="text" name="p_vndr_seq" dataformat="engup" style="width:58px;ime-mode:disabled" class="input" value="<%=(request.getParameter("p_vndr_seq") == null)? "" : request.getParameter("p_vndr_seq")%>"></td>								
							</tr>
						</tbody>
					</table>
				</div>
				<div class="layout_vertical_3" style="width:39%">
					<table class = "grid2 wAuto">
						<colgroup>					
							<col width=""/>
							<col width=""/>
							<col width="*" />				
						</colgroup> 
						<tbody>
							<tr>								
								<td style="text-align:center"><strong>S/P Name</strong></td>
								<td><input type="text" name="p_vndr_nm" dataformat="engup" style="width:155px;" class="input" value="<%=(request.getParameter("p_vndr_nm") == null)? "" : request.getParameter("p_vndr_nm")%>"></td>
							</tr>
							<tr>													
								<td style="text-align:center"><strong>S/P Type</strong></td>
								<td><input type="radio" name="p_sp_type" id = "p_sp_type" dataformat="engup" value="Y" class="trans"  <%if(p_sp_type.equals("Y")) out.print("checked"); %> ><label for ="p_sp_type">Logistics</label><input type="radio" name="p_sp_type" id = "p_sp_type1" value="" class="trans" <%if(p_sp_type.equals("N")) out.print("checked"); %> ><label for = "p_sp_type1">All</label></td>
							</tr>
							<tr>
								<td style="text-align:center"><strong>Legacy Code</strong></td>
								<td><input type="text"  name="modi_vndr_cd" dataformat="engup" style="width:155px;ime-mode:disabled" class="input" value=""></td>								
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<!-- layout_wrap(E) -->			
		</div>
		<!-- opus_design_inquiry(E) -->
	</div>
	
	<div class="wrap_result">	
		
		<!-- opus_design_grid(S) -->
		<div class="opus_design_grid clear" name="tabLayer" id="tabLayer">
			<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>
		<!-- opus_design_grid(E) -->
		
	</div>
</div>
</form>
<%@ include file="/bizcommon/include/common_alps.jsp"%>