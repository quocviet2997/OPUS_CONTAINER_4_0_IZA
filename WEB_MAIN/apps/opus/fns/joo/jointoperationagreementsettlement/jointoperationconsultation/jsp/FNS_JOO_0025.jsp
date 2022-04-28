<%
/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved
 *@FileName : fns_joo_0025.jsp
 *@FileTitle: CSR Inquiry
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
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.jointoperationconsultation.event.FnsJoo0025Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0025Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.JointOperationConsultation");

	String sysdate = JSPUtil.getKST("yyyy-MM-dd");

	String authOfcCdComboItems	= "";
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0025Event)request.getAttribute("Event");
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
var gSysDate = "<%=sysdate%>";
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
<!-- Input Box for Report Designer -->
<input type="hidden" name="com_mrdPath" value="" id="com_mrdPath" />
<input type="hidden" name="com_mrdArguments" value="" id="com_mrdArguments" />

<input type="hidden" name="com_mrdBodyTitle" value="CSR Inquiry Detail" id="com_mrdBodyTitle" />

<input type="hidden" name="com_mrdSaveDialogFileExt" value="ppt" id="com_mrdSaveDialogFileExt" />
<input type="hidden" name="com_mrdSaveDialogFileExtLimit" value="xls@pdf@doc@ppt" id="com_mrdSaveDialogFileExtLimit" />
<input type="hidden" name="com_mrdSaveDialogFileName" value="CSR Inquiry Detail" id="com_mrdSaveDialogFileName" />
<input type="hidden" name="com_mrdSaveDialogDir" value="" id="com_mrdSaveDialogDir" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" name="btn_retrieve" id="btn_retrieve" type="button"  auth="R">Retrieve</button><!--
		--><button class="btn_normal" name="btn_new" id="btn_new" type="button"  auth="R">New</button><!--
		--><button class="btn_normal" name="btn_downexcel" id="btn_downexcel" type="button"  auth="P">Down Excel</button><!--
		--><button class="btn_normal" name="btn_print" id="btn_print" type="button" auth="P">Print</button><!--
		--><button class="btn_normal" name="btn_csr" id="btn_csr" type="button"  auth="P">CSR Detail</button><!--
		--><button class="btn_normal" name="btn_reverse" id="btn_reverse" type="button"  auth="R">CSR Reverse</button><!--
		--><button class="btn_normal" name="btn_reject" id="btn_reject" type="button"  auth="P" style="display:none;">CSR Reject</button>
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
					<col width="200px"/>
					<col width="50px"/>
					<col width="100px"/>
					<col width="*"/>
			    </colgroup>
			    <tr>
					<td><input type="radio" value="0" name="gubun" class="trans" checked="" id="gubun" />&nbsp;&nbsp;<!-- 
					 	--><b>Iss.DT</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" value="1" name="gubun" class="trans" id="gubun" />&nbsp;&nbsp;<!-- 
					 	--><b>Eff.DT</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" style="width:80px;" value="<%=sysdate%>" name="fr_dt" dataformat="ymd" maxlength="10" class="input1" id="fr_dt" /><!-- 
					  	--><button type="button" id="btnCalFr" name="btnCalFr" class="calendar ir"></button> ~ <!-- 
					   	--><input type="text" style="width:80px;" value="<%=sysdate%>" name="to_dt" dataformat="ymd" maxlength="10" class="input1" id="to_dt" /><!-- 
					    --><button type="button" id="btnCalTo" name="btnCalTo" class="calendar ir"></button></td>	
					<th>Office</th>
					<td><script type="text/javascript">ComComboObject('auth_ofc_cd',1,80,0,1);</script></td>
					<th style="display:none;">CSR No.</th>
					<td style="display:none;"><input type="text" style="width:170px;" class="input" name="csr_no" maxlength="20" dataformat="engup" id="csr_no" /> </td>
					<td></td>
				</tr> 
			</tbody>
		</table>
	
		<!-- opus_design_inquiry(E) -->
		</div>
		</div>
		
    <div class= "wrap_result">
		<!-- opus_design_grid(S) -->
		<div class="opus_design_grid" >	
			<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>	
		<!-- opus_design_grid(E) -->
	</div>

</form>
