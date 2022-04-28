<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   FNS_JOO_0086.jsp
*@FileTitle  : Conversion Table
*@author     : CLT
*@version    : 1.0
*@since      : 2015/05/11
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.carriersettlementprocess.event.FnsJoo0086Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0086Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.CarrierSettlementProcess");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0086Event)request.getAttribute("Event");
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
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
 
</script>
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<h2 class="page_title"><span>Conversion Table</span></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn"><!--
	--><button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--  
	--><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button><!--  
	--><button type="button" class="btn_normal" name="btn_DownExcel" id="btn_DownExcel">DownExcel</button><!--  
	--><button type="button" class="btn_normal" name="btn_Save" id="btn_Save">Save</button><!--  
	--><button type="button" class="btn_normal" name="btn_Close" id="btn_Close">Close</button>
	</div>
	<!-- opus_design_btn(E) -->	
</div>
<!-- page_title_area(E) -->



<!-- popup_contens_area(S) -->
<%--<div class="layer_popup_contents" style="overflow:hidden;">--%>
	<div class="wrap_search_tab">
		<!-- opus_design_inquiry(S) -->
		<div class= "opus_design_inquiry wFit">
			<table>
				<tbody>
					<colgroup>
						<col width="50px"/>
						<col width="150px"/>
						<col width="*"/>
				    </colgroup>
					<tr class="h23">
						<th>Lane</th>
						<td><input type="text" class="input" name="slan_cd" style="width:60px;ime-mode:disabled;text-align:center" dataformat="engup" maxlength="3" id="slan_cd" onkeyup="slan_cd_keyup()"/><!-- 
							 --><button type="button" id="btn1_pop_lane" name="btn1_pop_lane" class="input_seach_btn"></button></td>
						<td>&nbsp;</td>
					</tr> 
				</tbody>
			</table>
		</div>
	</div>
	
	<div class="wrap_result">
		<div class="opus_design_tab">
			<script language="javascript">ComTabObject('tab1');</script>
		</div>
		
		<!-- opus_design_grid(S) -->	
		<div name="tabLayer" id="tabLayer" style="display:inline;">
			<div class="opus_design_grid">
				<div class="opus_design_btn">
					<button class="btn_normal" name="btn_t1Add" id="btn_t1Add" type="button">Setup</button><!--
					--><!-- <button class="btn_normal" name="btn_t1Ins" id="btn_t1Ins" type="button">Row Ins</button> --><!--
					--><button class="btn_normal" name="btn_t1Del" id="btn_t1Del" type="button" style="display:none;">Del</button>
				</div>	
				<script type="text/javascript">ComSheetObject('t1sheet1');</script>
			</div>
		</div>
		
		<!-- opus_design_grid(S) -->	
		<div name="tabLayer" id="tabLayer" style="display:none;">
			<div class="opus_design_grid">
				<div class="opus_design_btn">
					<button class="btn_normal" name="btn_t2Add" id="btn_t2Add" type="button">Row Add</button><!--
					--><button class="btn_normal" name="btn_t2Ins" id="btn_t2Ins" type="button">Row Ins</button><!--
					--><button class="btn_normal" name="btn_t2Del" id="btn_t2Del" type="button">Row Del</button>
				</div>	
				<script type="text/javascript">ComSheetObject('t2sheet1');</script>
			</div>
		</div>
		<!-- opus_design_grid(S) -->	
		<div name="tabLayer" id="tabLayer" style="display:none;">
			<div class="opus_design_grid">
				<div class="opus_design_btn">
					<button class="btn_normal" name="btn_t3Add" id="btn_t3Add" type="button">Add Lane</button><!--
					--><button class="btn_normal" name="btn_t3Del" id="btn_t3Del" type="button">Del Lane</button>
				</div>	
				<script type="text/javascript">ComSheetObject('t3sheet1');</script>
			</div>
		</div>
		<!-- opus_design_grid(E) -->
	
		<!-- opus_design_grid(S) -->	
		<div name="tabLayer" id="tabLayer" style="display:none;">
			<div class="opus_design_grid">
				<div class="opus_design_btn">
					<button class="btn_normal" name="btn_t4Add" id="btn_t4Add" type="button">Add Lane</button><!--
					--><button class="btn_normal" name="btn_t4Del" id="btn_t4Del" type="button">Del Lane</button>
				</div>	
				<script type="text/javascript">ComSheetObject('t4sheet1');</script>
			</div>
		</div>
		<!-- opus_design_grid(E) -->
	</div>	
<%--</div>--%>
</form>
<div style="display:none;">
	<div class="layout_vertical_2" style="text-align: left; width: 50%">
		<div class="opus_design_grid">
		<script type="text/javascript">ComSheetObject('tpszsheet');</script>
		</div>
	</div>
	
	<div class="layout_vertical_2" style="text-align: right; width: 50%">
		<div class="opus_design_grid">
		<script type="text/javascript">ComSheetObject('voidsheet');</script>
		</div>
	</div>
	
</div>
