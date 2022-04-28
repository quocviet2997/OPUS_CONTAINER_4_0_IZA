<%
/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : fns_joo_0022.jsp
 *@FileTitle: CSR Approval
 *@author   : CLT
 *@version  : 1.0
 *@since    : 2014/06/18
 =========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.jointoperationconsultation.event.FnsJoo0205Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0205Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String authOfcCdComboItems	= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.JointOperationConsultation");

	String yyyyMMdd = JSPUtil.getKST("yyyy-MM-dd");
	String sysdate = JSPUtil.getKST("yyyyMMddHHmmss");
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0205Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		authOfcCdComboItems = eventResponse.getETCData("auth_ofc_cds");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<script type="text/javascript">
	var gAuthOfcCdComboItems	= "<%=authOfcCdComboItems%>";
	var gUsrId = "<%=strUsr_id%>";
	var gUsrNm = "<%=strUsr_nm%>";
	
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form" id="form">
<input type="hidden" name="f_cmd" id="f_cmd">
<input type="hidden" name="pagerows" id="pagerows">
<input type="hidden" name="sysdate" id="sysdate" value="<%=sysdate%>">
<input type="hidden" name="apro_flg" id="apro_flg" value="F">
<input type="hidden" name="csr_offst_no" id="csr_offst_no">
<!-- 2018.07.09 Approval BackEndJob -->
<input type="hidden" name="backendjob_key"  id="backendjob_key" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_normal" name="btn_retrieve" id="btn_retrieve" type="button">Retrieve</button><!--
		--><button class="btn_normal" name="btn_new" id="btn_new" type="button">New</button><!--
		--><button class="btn_accent" name="btn_approval" id="btn_approval" type="button">Approval</button><!--
		--><button class="btn_accent" name="btn_cancel" id="btn_cancel" type="button">Cancel</button><!--
		--><button class="btn_normal" name="btn_csr" id="btn_csr" type="button">CSR Detail</button>
	</div>
	<!-- opus_design_btn (E) -->
	<!-- page_location(S) -->
	<div class="location">
		<span id="navigation"></span>
	</div>
</div>
<!-- page_title_area(E) -->

<div class= "wrap_search">
<!-- opus_design_inquiry(S) -->
	<div class= "opus_design_inquiry">
		<table style="width:979px">
			<tbody>
				<colgroup>
					<col width="170px"/>
					<col width="55px">
					<col width="80px">
					<!-- <col width="100px"/> -->
					<col width="*"/>
			    </colgroup>
			    <tr>
					<td><input type="radio" value="0" name="if_flg" class="trans " checked="" id="if_flg" />&nbsp;&nbsp;<b>Iss.DT</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<!-- 
					 --><input type="radio" value="1" name="if_flg" class="trans" id="if_flg" />&nbsp;&nbsp;<b>Eff.DT</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<!-- 
					 --><input type="text" style="width:80px;" value="" class="input" name="slp_iss_dt" dataformat="ymd" id="slp_iss_dt" /><button type="button" id="btn_calendar" name="btn_calendar" class="calendar ir"></button></td>
               		<th>Office</th>
               		<td><script type="text/javascript">ComComboObject('auth_ofc_cd',1, 80,0, 0);</script></td>
					<th style="display:none;">CSR No.</th>
					<td style="display:none;"><input type="text" style="width:160px;" name="csr_no" class="input" maxlength="20" id="csr_no" dataformat="engup"/> </td>
					<td></td>
				</tr> 
    
			</tbody>
		</table>
</div>
</div>	
     <div class= "wrap_result">	
		<div class="opus_design_grid" >	
			<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>	
		<div class="opus_design_data">
		<table>
			<colgroup>
				<col width="100px"/>
				<col width="*"/>
		    </colgroup> 
			<tr>
				<th class="align_left">Cancel Reason</th>
				<td><input name="cxl_desc" id="cxl_desc" style="width:600px;" type="text" maxlength="100" class="input" value=""></td>
			</tr>
		</table>
		</div>	
	</div>
<!-- opus_design_grid(E) -->

</form>
