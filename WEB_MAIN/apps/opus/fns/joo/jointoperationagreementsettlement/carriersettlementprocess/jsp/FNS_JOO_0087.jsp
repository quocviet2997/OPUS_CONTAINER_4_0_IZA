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
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.carriersettlementprocess.event.FnsJoo0087Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0087Event  event = null;				//PDTO(Data Transfer Object including Parameters)
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


		event = (FnsJoo0087Event)request.getAttribute("Event");
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
<input type="hidden" name="slan_cd" id="slan_cd" />
<!-- popup_title_area(S) -->
 <div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title"><span>Option</span></h2>
		<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn"><!--
		--><button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--  
		--><button type="button" class="btn_normal" name="btn_DownExcel" id="btn_DownExcel">DownExcel</button><!--  
		--><button type="button" class="btn_normal" name="btn_Save" id="btn_Save">Save</button><!--  
		--><button type="button" class="btn_normal" name="btn_Close" id="btn_Close">Close</button>
		</div>
		<!-- opus_design_btn(E) -->	
	</div>
	<!-- page_title_area(E) -->
</div>

<!-- popup_contens_area(S) -->
<div class="layer_popup_contents" style="overflow:hidden;">
	<!-- wrap_result(S) -->
	<div class="wrap_result">
		<!-- layout_wrap (S) -->
			<!-- opus_design_grid(S) -->
			<div class="opus_design_grid" >
				<!-- opus_grid_design_btn(S) -->
				<div class="opus_design_btn">
					<button class="btn_normal" name="btn_add" id="btn_add" type="button">Row Add</button><!--
					--><button class="btn_normal" name="btn_ins" id="btn_ins" type="button">Row Ins</button><!--
					--><button class="btn_normal" name="btn_del" id="btn_del" type="button">Row Del</button>
				</div>
				<script type="text/javascript">ComSheetObject('sheet1');</script>
				<!-- opus_grid_design_btn(E) -->
			</div>
			<!-- opus_design_grid(E) -->
			
	    <div class="layout_vertical_2" style="width: 49%">
	      	<table class="grid_2">
				<tbody>
					<colgroup>
						<col width="15%">
						<col width="85%">
					</colgroup>
					<tr>
						<th colspan="2">Option A : How to treat decimal for Weight conversion to TEU ?</th> 
	                      </tr>
	                      <tr>
	                      	<th>Option 1</th> 
	                          <td>Roundup(number,1)</td>
	                      </tr>
	                      <tr>
	                      	<th>Option 2</th> 
	                          <td>Round(number,1)</td>
	                      </tr>
	                      <tr>
	                      	<th>Option 3</th> 
	                          <td>Round(number,2)</td>
	                      </tr>
	                      <tr>
	                      	<th>Option 2</th> 
	                          <td>Rounddown(number,2)</td>
	                      </tr>
				</tbody>
			</table>
		</div>
		<div class="layout_vertical_2" style="width: 2%;">
	       <table>
	       		<tr>
	       			<td>&nbsp;</td>
	       		</tr>
	       </table>
	    </div>
	    <div class="layout_vertical_2" style="width: 49%">
			<table class="grid_2">
				<tbody>
					<colgroup>
						<col width="15%">
						<col width="85%">
					</colgroup>
					<tr>
						<th colspan="2">Option B : How to count Reefer Plug utilization ?</th> 
	                      </tr>
	                      <tr>
	                      	<th>Option 1</th> 
	                          <td>Based on number of active reefer container on board</td>
	                      </tr>
	                      <tr>
	                      	<th>Option 2</th> 
	                          <td>Based on number of active reefer container loading</td>
	                      </tr>
				</tbody>
			</table>
	    </div>
	</div>
</div>
<!-- popup_contens_area(E) -->
</form>
