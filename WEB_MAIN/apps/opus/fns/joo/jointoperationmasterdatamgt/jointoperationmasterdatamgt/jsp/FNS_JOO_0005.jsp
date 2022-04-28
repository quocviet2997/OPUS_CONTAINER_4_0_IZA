<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : fns_joo_0005.jsp
*@FileTitle  : Entry and Inquiry of Target Voyage Choose by Settlement Item
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/26
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationmasterdatamgt.jointoperationmasterdatamgt.event.FnsJoo0005Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0005Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationMasterDataMgt.JointOperationMasterDataMgt");

	String yyyyMM = JSPUtil.getKST("yyyy-MM");

	String crrCombo  = "";
	String abbrSheet = "";
	String dirSheet  = "";

	String mnthCondSheet = "";
	String mnthNameSheet = "";
	String portCondSheet = "";
	String portNameSheet = "";
	String portTypeSheet = "";
	String ptTpNameSheet = "";
	String operTypeSheet = "";
	String operNameSheet = "";

	String[] dir = null;
	String[] mnthCond = null;
	String[] portCond = null;
	String[] portType = null;
	String[] operType = null;

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0005Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

		crrCombo  = eventResponse.getETCData("jo_crr_cd"        );
		abbrSheet = eventResponse.getETCData("sheet1_jo_stl_cd" );

		dir = (String[])eventResponse.getCustomData("DIR");
//		sta = (String[])eventResponse.getCustomData("STA");
//		fin = (String[])eventResponse.getCustomData("FIN");
		mnthCond = (String[])eventResponse.getCustomData("MONTH");
		portCond = (String[])eventResponse.getCustomData("PORT");
		portType = (String[])eventResponse.getCustomData("PORT_TYPE");
		operType = (String[])eventResponse.getCustomData("OPER_TYPE");

		dirSheet = dir[0];
//		staSheet = sta[0];
//		finSheet = fin[0];
		mnthCondSheet = mnthCond[0];
		mnthNameSheet = mnthCond[1]; 
		portCondSheet = portCond[0];
		portNameSheet = portCond[1];
		portTypeSheet = portType[0];
		ptTpNameSheet = portType[1];
		operTypeSheet = operType[0];
		operNameSheet = operType[1];

	}catch(Exception e) {
		out.println(e.toString());
	}
%>
<script type="text/javascript">
var gMnthCondSheet = "<%=mnthCondSheet%>";
var gPortCondSheet = "<%=portCondSheet%>";
var gPortTypeSheet = "<%=portTypeSheet%>";
var gOperTypeSheet = "<%=operTypeSheet%>";
var gMnthNameSheet = "<%=mnthNameSheet%>";
var gPortNameSheet = "<%=portNameSheet%>";
var gPtTpNameSheet = "<%=ptTpNameSheet%>";
var gOperNameSheet = "<%=operNameSheet%>";

	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			showErrMessage(errMessage);
		} // end if
		loadPage("<%=crrCombo%>","<%=abbrSheet%>","<%=dirSheet%>");
	}
</script>
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="code" id="code" />
<input type="hidden" name="name" id="name" />
<input type="hidden" name="super_cd1" id="super_cd1" />
<input type="hidden" name="super_cd2" id="super_cd2" />
<input type="hidden" name="curr_row" id="curr_row" />
<input type="hidden" name="jo_stl_opt_cd" id="jo_stl_opt_cd" />
<!-- page_title_area(S) -->
<div class="page_title_area clear">

	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
	<button class="btn_accent" name="btn_retrieve" id="btn_retrieve" type="button" auth="R">Retrieve</button><!--
	--><button class="btn_normal" name="btn_new" id="btn_new" type="button" auth="R">New</button><!--
	--><button class="btn_normal" name="btn_create" id="btn_create" type="button" auth="U">Create</button><!--
	--><button class="btn_normal" name="btn_save" id="btn_save" type="button" auth="C">Save</button><!--
	--><button class="btn_normal" name="btn_delete" id="btn_delete" type="button" auth="D">Adjust Delete</button><!--
	--><button class="btn_normal" name="btn_downexcel" id="btn_downexcel" type="button" auth="R">Down Excel</button><!--
	--><button class="btn_normal" name="btn_lskd" id="btn_lskd" type="button" auth="C">L/SKD</button><!--
	--></div>
<!-- opus_design_btn (E) -->

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
			<colgroup>
				<col width="45px" />				
				<col width="120px" />				
				<col width="45px" />				
				<col width="200px" />				
				<col width="70px" />				
				<col width="230px" />				
				<col width="*" />				
		   </colgroup> 
		   <tbody>
		   		<tr class="h23">
					<th>Month</th>
					<td><input type="text" style="width:60px;" class="input1" name="acct_yrmon" value="<%=yyyyMM%>" dataformat="ym" maxlength="6" id="acct_yrmon" /> <button class="btn_left" type="button" name="btns_back" id="btns_back"></button><button class="btn_right" type="button" name="btns_next" id="btns_next"></button></td>
					<th>Carrier</th>
					<td><script type="text/javascript">ComComboObject('cmb_jo_crr_cd',6,70,0,1);</script><!--
					 -->&nbsp;<input type="checkbox" value="N" name="proc_jb_flg" id="proc_jb_flg" class="trans">&nbsp;&nbsp;<!-- 
					 --><input type="text" style="width:40px;text-align:center;display:none;" class="input2" name="jo_crr_cd" id="jo_crr_cd" readonly><!-- 
					 --><input type="text" style="width:40px;text-align:center;" class="input2" name="trd_cd" id="trd_cd" readonly><!-- 
					 --><input type="text" style="width:60px;text-align:center;" class="input2" name="rlane_cd" id="rlane_cd" readonly></td>
					<th>Rev./Exp.</td>
				 	<td><input type="radio" name="re_divr_cd" value="R" class="trans" checked="" id="re_divr_cd" />  Revenue <input type="radio" name="re_divr_cd" value="E" class="trans" id="re_divr_cd" />  Expense </td>
				 	<td></td>
					</tr> 
		   </tbody>
		</table>
	</div>
	<!-- opus_design_inquiry(E) -->
</div>
<!-- wrap_search(E) -->
<!-- wrap_result(S) -->
<div class="wrap_result">
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid">
		<!-- opus_design_btn (S) -->
		<div class="opus_design_btn">
			<button class="btn_accent" id="btn_copy" name="btn_copy" auth="C" type="button">Row Copy</button><!--
			--><button class="btn_normal" id="btn_add" name="btn_add" auth="C" type="button">Row Add</button><!--
			--><button class="btn_normal" name="btn_del" auth="C" id="btn_del" type="button">Row Delete</button><!--
			--><button class="btn_normal" id="btn_enable" auth="A" id="btn_enable" type="button">Adjust Cancel</button><!--
			--></div>
		<!-- opus_design_btn (E) -->
		<script type="text/javascript">ComSheetObject('sheet1');</script>		
	</div>
	<!-- opus_design_grid(E) -->
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid clear" style="display:none;">
		<script type="text/javascript">ComSheetObject('sheet2');</script>
	</div>
	<!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->
</form>