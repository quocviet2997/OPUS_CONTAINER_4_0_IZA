<%/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : FNS_JOO_0010.jsp
*@FileTitle  : Over Used Slot Hire for TDR
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/26
=========================================================*/%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.carriersettlementprocess.event.FnsJoo0010Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0010Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//???? ??? ??
	String strErrMsg = "";						//?????
	int rowCount	 = 0;						//DB ResultSet ???? ??

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.CarrierSettlementProcess");

	String yyyyMM = JSPUtil.getKST("yyyy-MM");
	
	String crrCombo = "";
    String clzYn    = "O";
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0010Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// ???? ??? ????? ??? ??? ???? ???? ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

		crrCombo = eventResponse.getETCData("jo_crr_cd");
		clzYn    = eventResponse.getETCData("clz_yn");
	}catch(Exception e) {
		out.println(e.toString());
	}
%>
<script type="text/javascript">
var gCrrCombo    = "<%=crrCombo%>";
var gClzYn       = "<%=clzYn%>";

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
<input type="hidden" name="cur_row" value="0" id="cur_row" />
<input type="hidden" name="jo_stl_itm_cd" value="OUS" id="jo_stl_itm_cd" />
<input type="hidden" name="jo_mnu_nm" value="TDR" id="jo_mnu_nm" />
<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
		<button type="button" class="btn_accent" name="btn_retrieve" 	id="btn_retrieve" auth="R">Retrieve</button><!--
		--><button type="button" class="btn_normal" name="btn_new" 		id="btn_new" auth="R">New</button><!--
		--><button type="button" class="btn_normal" name="btn_create" 		id="btn_create" auth="C">Create</button><!--
		--><button type="button" class="btn_normal" name="btn_save" 		id="btn_save" auth="C">Save</button><!--
		--><button type="button" class="btn_normal" name="btn_delete_all" 		id="btn_delete_all" auth="C">Delete</button><!--
		--><button type="button" class="btn_normal" name="btn_downexcel"  		id="btn_downexcel" auth="R">Down Excel</button>	
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
	<div class= "opus_design_inquiry wFit">
		<table>
			<tbody>
				<colgroup>
					<col width="100px"/><!-- Account Month -->
					<col width="120px"/>
					<col width="50px"/><!-- Carrier -->
					<col width="200px"/>
					<col width="50px"/><!-- Rev./Exp. -->
					<col width="150px"/>				
					<col width="*" />
			    </colgroup>
				<tr>
					<th>Account Month</th>
					<td><input type="text" style="width:60px;" class="input1" name="acct_yrmon" value="<%=yyyyMM%>" dataformat="ym" maxlength="6" id="acct_yrmon"/><!-- 
					--><button type="button" class="btn_left" name="btns_back" id="btns_back"></button><!-- 
       				--><button type="button" class="btn_right" name="btns_next"  id="btns_next"></button></td>
					<th>Carrier</th>
					<td><script type="text/javascript">ComComboObject('cmb_jo_crr_cd',6,70,0,1);</script><!-- 
					 --><input type="text" style="width:40px;text-align:center;display:none;" class="input2" name="jo_crr_cd" id="jo_crr_cd" readonly><!-- 
					 --><input type="text" style="width:40px;text-align:center;" class="input2" name="trd_cd" id="trd_cd" readonly><!-- 
					 --><input type="text" style="width:60px;text-align:center;" class="input2" name="rlane_cd" id="rlane_cd" readonly></td>
					<th>Rev./Exp.</th>
					<td class="pad_left_4"><input type="radio" name="re_divr_cd" value="R" class="trans" checked id="re_divr_cd" />  Revenue <input type="radio" name="re_divr_cd" value="E" class="trans" id="re_divr_cd" />  Expense </td>
					<td></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
<!-- opus_design_inquiry(E) -->

<!-- opus_design_grid(S) -->
<div class="wrap_result">
	<div class="opus_design_grid clear" >
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_add" 	id="btn_add" auth="C">Row Add</button><!--
			--><button type="button" class="btn_normal" name="btn_delete" 	id="btn_delete" auth="C">Row Delete</button>
		</div>
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
</div>
<!-- opus_design_grid(E) -->
<!-- opus_design_grid(S) -->
<div class="wrap_result" style="display:none">
	<div class="opus_design_grid clear" >
		<script type="text/javascript">ComSheetObject('sheet2');</script>
	</div>
</div>
<!-- opus_design_grid(E) -->
</form>