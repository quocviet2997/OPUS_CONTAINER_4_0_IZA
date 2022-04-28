<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0042.jsp
*@FileTitle  :  Office Access Group Mapping
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/02
=========================================================
--%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.organization.event.BcmCcd0042Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	BcmCcd0042Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//Error from server
	String strErrMsg = "";						//Error message
	int rowCount	 = 0;						//Count of DB resultSet list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	
	String   accGrpId       = null;				//Setting accGrpId from BCM_CCD_0041
	String   subSysCd       = null;				//Setting subSysCd from BCM_CCD_0041	
	
	Logger log = Logger.getLogger("com.clt.apps.commoncode.organization");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();

		accGrpId = JSPUtil.getNull(request.getParameter("accGrpId"));
		subSysCd = JSPUtil.getNull(request.getParameter("subSysCd"));

		event = (BcmCcd0042Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

	}catch(Exception e) {
		out.println(e.toString());
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
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="hidden_ofc_cd" value="" id="hidden_ofc_cd" />
	<div class="layer_popup_title">
		<div class="page_title_area clear">
			<h2 class="page_title"><span>Office Access Group Mapping</span></h2>
			<div class="opus_design_btn">
				<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!--
				--><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!--
				--><button type="button" class="btn_normal" name="btn_save" id="btn_save">Save</button><!--
				--><button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button>
			</div>
		</div>
	</div>
	<div class="layer_popup_contents">
		<div class="wrap_search">
			<div class="opus_design_inquiry wFit">
				<table>
					<colgroup>
						<col width="40">
						<col width="100">
						<col width="40">
						<col width="*">
					</colgroup>
					<tbody>
						<tr>
							<th>Module Code</th>
							<td><input type="text" name="sub_sys_cd" id="sub_sys_cd" style="width:50px;text-align:center;" class="input2" value="<%=subSysCd%>" maxlength="3" readonly></td>					
							<th>Access Group ID</th>
							<td><input type="text" name="ofc_grp_id" id="ofc_grp_id" style="width:80px;text-align:center;" class="input2" value="<%=accGrpId%>" maxlength="6" readonly></td>
						</tr>
				</table>
			</div>
		</div>
		<div class="wrap_result" >
			<div class="opus_design_grid">
			<h3 class="title_design">Access Group Information</h3>
			    <div class="opus_design_btn">
			        <button type="button" class="btn_normal" name="btn_rowadd" id="btn_rowadd">Row Add</button><!-- 
			         --><button type="button" class="btn_normal" name="btn_rowdelete" id="btn_rowdelete">Row Delete</button>
			    </div>
				<script type="text/javascript">ComSheetObject('sheet1');</script>	
			</div>
		</div>
	</div>
</form>