<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_JOO_0016.jsp
*@FileTitle  : Combined Monthly Clearance Creation & Inquiry
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/01
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.jointoperationconsultation.event.FnsJoo0016Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0016Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.JointOperationConsultation");

	String yyyyMM = JSPUtil.getKST("yyyy-MM");
	String crrCombo = "";
	String stlCombo = "";
	String stlComnm = "";
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0016Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		crrCombo = eventResponse.getETCData("jo_crr_cd");
		stlCombo = eventResponse.getETCData("stl_jb_combo");
		stlComnm = eventResponse.getETCData("stl_jb_comnm");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
var gCrrCombo    = "<%=crrCombo%>";
var gStlCombo    = "<%=stlCombo%>";
var gStlComnm    = "<%=stlComnm%>";
var gYYYYMM      = "<%=yyyyMM%>";

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
<input type="hidden" name="code" id="code" />
<input type="hidden" name="name" id="name" />
<input type="hidden" name="super_cd1" id="super_cd1" />
<input type="hidden" name="super_cd2" id="super_cd2" />
<input type="hidden" name="rlane_cd" id="rlane_cd" />
<input type="hidden" name="locl_curr_cd" id="locl_curr_cd" />

<input type="hidden" name="com_mrdPath" value="" id="com_mrdPath" />
<input type="hidden" name="com_mrdArguments" value="" id="com_mrdArguments" />
<input type="hidden" name="com_mrdTitle" value="Combined Monthly Clearance Inquiry" id="com_mrdTitle" />
<input type="hidden" name="com_mrdBodyTitle" value="Combined Monthly Clearance Inquiry" id="com_mrdBodyTitle" />
<input type="hidden" name="com_mrdSaveDialogFileExt" value="ppt" id="com_mrdSaveDialogFileExt" />
<input type="hidden" name="com_mrdSaveDialogFileExtLimit" value="xls@pdf@doc@ppt" id="com_mrdSaveDialogFileExtLimit" />
<input type="hidden" name="com_mrdSaveDialogFileName" value="CombinedMonthlyClearance" id="com_mrdSaveDialogFileName" />
<input type="hidden" name="com_mrdSaveDialogDir" value="" id="com_mrdSaveDialogDir" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->

	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn"><!-- 
		 --><button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!--
		 --><button type="button" class="btn_normal" name="btn_del" id="btn_del">Delete</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_save" id="btn_save">Save</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_downexcel" id="btn_downexcel">Down Excel</button><!--  
		 --><button type="button" class="btn_normal" name="btn_print" id="btn_print">Print</button>
	</div>
	<!-- opus_design_btn(E) -->

   	<!-- page_location(S) -->
   	<div class="location">
        <span id="navigation"></span>
   	</div>
   	<!-- page_location(E) -->
</div>
<!-- page_title_area(E) -->

<!-- opus_design_inquiry(S) -->
<div class= "wrap_search">
	<div class="opus_design_inquiry Wfit">
		<!--  MiniLayer (S) -->
						<table>
							<colgroup>
					            <col width="90">
					            <col width="120">
					            <col width="60">
					            <col width="60">
					            <col width="145">
					            <col width="70">
					            <col width="114">
					            <col width="112">
					            <col width="168">
					            <col width="*">
							</colgroup>
							<tbody>
								<tr>
									<th>Account Month</th>
									<td><!-- 
										 --><input type="text" style="width:60px" class="input1" name="acct_yrmon" id="acct_yrmon" value="<%=yyyyMM%>" dataformat="ym" maxlength="6" onchange="acct_yrmon_onChange()"><!--
										 --><button type="button" class="btn_left" name="btns_back"></button><!--
										 --><button type="button" class="btn_right" name="btns_next"></button>
									</td>
									<th>Carrier</th>
									<td><script type="text/javascript">ComComboObject('jo_crr_cd',1,55,0,1);</script></td>
									<th>Trade</th>
									<td><script type="text/javascript">ComComboObject('trd_cd',1,55,0,0);</script></td>
									<th>Rev./Exp.</th>
									<td><script type="text/javascript">ComComboObject('re_divr_cd',1,90,0,0);</script></td>
									<th>Combined No.</th>
									<td><script type="text/javascript">ComComboObject('stl_cmb_seq',2,55,0,0);</script></td>
								</tr> 
							</tbody>
						</table>
	</div>
</div>
<!-- opus_design_inquiry(E) -->

<!-- opus_design_grid(S) -->
<div class="wrap_result">
	<!-- layout_wrap(S) -->
	<div class="layout_wrap">
		<!-- layout_vertical2(S) -->
		<div class="layout_vertical_2 mar_rgt_12" style="width: 19%">
			<div class="opus_design_grid" id="mainTable">
				<script type="text/javascript">ComSheetObject('sheet1');</script>
			</div>
		</div>
   		<!-- layout_vertical_2(E) -->
		<div class="layout_vertical_2" style="width:80%; float:right;">
			<div class="opus_design_grid" id="mainTable">
				<script type="text/javascript">ComSheetObject('sheet2');</script>
			</div>
		</div>
		<!-- layout_vertical2(S) -->
		<div class="layout_vertical_2" style="width:80%; float:right;">
			<div class="opus_design_grid" id="mainTable">
				<script type="text/javascript">ComSheetObject('sheet3');</script>
			</div>
			<!-- opus_design_inquiry(S) -->
			<div class="opus_design_inquiry">
				<!-- opus_design_inquiry(E) -->
				<table  id="mainTable">
						<colgroup>
					            <col width="44">
					            <col width="80">
					            <col width="96">
					            <col width="*">
						</colgroup>
						<tbody>
							<tr>
								<td>Carrier</td>
								<td><input type="text" style="width:40px;text-align:center" class="input1" name="bal_jo_crr_cd" id="bal_jo_crr_cd" readOnly></td>
								<td>Balance Amount</td>
								<td><input type="text" style="width:120px;text-align:right" class="input1" name="balance"  id="balance" readOnly></td>
							</tr> 
						</table>
			</div>
			<!-- opus_design_inquiry(S) -->
		</div>
    	<!-- layout_vertical_2(E) -->
	</div>
</div>
<!-- opus_design_grid(S) -->
</form>