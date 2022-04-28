<%
/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : FNS_JOO_0203.jsp
 *@FileTitle : Authority Office Creation
 *@author     : CLT
 *@version    : 1.0 
 *@since      : 2014/06/17 
 =========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.renewalconsultation.event.FnsJoo0203Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0203Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String joCrrCdComboItems	= "";
	String authOfcCdComboItems	= "";
	String currencyCdComboItems = "";
	String settlementItemComboItems = "";
	
	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.RenewalConsultation");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0203Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

		joCrrCdComboItems  	= eventResponse.getETCData("jo_crr_cds");
		authOfcCdComboItems = eventResponse.getETCData("auth_ofc_cds");
		currencyCdComboItems = eventResponse.getETCData("currency");
		settlementItemComboItems = eventResponse.getETCData("jo_stl_itm_cds");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>


<script type="text/javascript">
	var gJoCrrCdComboItems 		= "<%=joCrrCdComboItems%>";
	var gAuthOfcCdComboItems	= "<%=authOfcCdComboItems%>";
	var gCurrencyCdComboItems	= "<%=currencyCdComboItems%>";
	var gSettlementItemComboItems	= "<%=settlementItemComboItems%>";
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
<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn"><!-- 
		--><button type="button" class="btn_accent" name="btn_Retrieve" 		id="btn_Retrieve">Retrieve</button><!-- 
		--><button type="button" class="btn_normal" name="btn_New" 				id="btn_New">New</button><!-- 
		--><button type="button" class="btn_normal" name="btn_Delete" 			id="btn_Delete">Go to INV. Delete</button><!--
		--><button type="button" class="btn_normal" name="btn_Save" 			id="btn_Save">Save</button><!--  
		--><button type="button" class="btn_normal" name="btn_DownExcel" 		id="btn_DownExcel">Down Excel</button><!-- 
		--><button type="button" class="btn_normal" name="btn_SlipCreate" 		id="btn_SlipCreate">Slip Creation</button><!-- 
		--><button type="button" class="btn_normal" name="btn_GoToStl" 			id="btn_GoToStl">Go to Settlement</button><!--
		--><button type="button" class="btn_normal" name="btn_InvoiceReport" 			id="btn_InvoiceReport">Invoice Report</button> <!-- 
	--></div>
	<!-- opus_design_btn(E) -->

	<!-- page_location(S) -->
	<div class="location">	
		<span id="navigation"></span>
	</div>
	<!-- page_location(E) -->	
</div>
<!-- page_title_area(E) -->

<!-- wrap_search(S) -->
<div class="wrap_search">
<!-- opus_design_inquiry(S) -->
<div class="opus_design_inquiry wFit">
	<table>
		<tbody>
			<colgroup>
				<col width="80px">
				<col width="200px">
				<col width="50px">
				<col width="120px">
				<col width="50px">
				<col width="55px">
				<col width="50px">
				<col width="55px">
				<col width="50px">
				<col width="75px">
				<col width="70px">
				<col width="75px">
				<col width="70px">
				<col width="150px">
				<col width="*" />
			</colgroup>
			<tr class="h23">
				<th>VVD Start Month</th>
			    <td><input type="text" style="width:60px;" class="input1" dataformat="ym" maxlength="6" name="fr_rev_yrmon" value="" id="fr_rev_yrmon" cofield="btn_vvd_from_back"/><!--  
			    --><button type="button" class="btn_left" name="btn_vvd_from_back" id="btn_vvd_from_back"></button><!--  
			    --><button type="button" class="btn_right" name="btn_vvd_from_next" id="btn_vvd_from_next"></button>~ <!--  
			    --><input type="text" style="width:60px;" class="input1" maxlength="6" dataformat="ym" name="to_rev_yrmon" value="" cofield="btn_vvd_to_next" id="to_rev_yrmon" /><!-- 
			    --><button type="button" class="btn_left" name="btn_vvd_to_back" id="btn_vvd_to_back"></button><!--  
			    --><button type="button" class="btn_right" name="btn_vvd_to_next" id="btn_vvd_to_next"></button></td>
			    <th>Partner</th>
				<td><script type="text/javascript">ComComboObject('jo_crr_cds', 1, 120, 0, 0);</script></td>
				<th>Curr.</th>
				<td><script type="text/javascript">ComComboObject('locl_curr_cd',1,55,0,1);</script></td>
               	<th>Trade</th>
				<td><script type="text/javascript">ComComboObject('trd_cd',1,55,0,0);</script></td>
               	<th>Office</th>
               	<td><script type="text/javascript">ComComboObject('auth_ofc_cd',1, 70,0, 0);</script></td>
				<th>Rev./Exp.</th>
				<td><script type="text/javascript">ComComboObject('re_divr_cd',1,75,0,0);</script></td>
				<th>Invoice Curr.</th>
				<td><script type="text/javascript">ComComboObject('inv_curr_cd',1,55,0,1);</script><!-- 
					 -->&nbsp;<input type="text" name="locl_xch_rt" style="width:90px;text-align:right" class="input1" value="" maxlength="13" dataformat="singledFloat" id="locl_xch_rt" /></td>
               	<th>Stl.Item</th>
				<td><script type="text/javascript">ComComboObject('jo_stl_itm_cds',1,75,0,0);</script></td>
               	<th>Due Date</th>
				<td><input type="text" style="width:80px;" name="rqst_dt" dataformat="ymd" maxlength="10" class="input1" id="rqst_dt" onKeyUp="chkField(this, 'date', false, null, null, '-')" onBlur="chkField(this, 'date', false, null, null, '-')"/>
					<button type="button" id="btnCal" name="btnRqstDt" class="calendar ir"></button></td>
				<th>Issue Date</th>
				<td><input type="text" style="width:80px;" name="inv_iss_dt" dataformat="ymd" maxlength="10" class="input1" id="inv_iss_dt" onKeyUp="blur_inv_iss_dt(this)" onBlur="blur_inv_iss_dt(this)"/>
					<button type="button" id="btnCal" name="btnInvIssDt" class="calendar ir"></button></td>
               	<td></td>
			</tr>
		</tbody>
	</table>
</div>
<!-- opus_design_inquiry(E) -->
</div>
<!-- wrap_search(E) -->

<!-- opus_design_grid(S) -->
<div class="wrap_result">
	<!-- layout_wrap(S) -->
	<div class="layout_wrap">
		<!-- layout_vertical2(S) -->
		<div class="layout_vertical_2 mar_rgt_12" style="width: 54%">
			<div class="opus_design_grid" id="mainTable">
				<script type="text/javascript">ComSheetObject('sheet1');</script>
			</div>
		</div>
   		<!-- layout_vertical_2(E) -->
		<div class="layout_vertical_2" style="width:45%; float:right;">
			<div class="opus_design_grid" id="mainTable">
				<script type="text/javascript">ComSheetObject('sheet2');</script>
			</div>
		</div>
	</div>
</div>
<!-- wrap_result(E) -->				
</form>
