<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : fns_joo_0006.jsp
*@FileTitle  : Carrier Merger
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
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationmasterdatamgt.jointoperationmasterdatamgt.event.FnsJoo0006Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0006Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list
	
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationMasterDataMgt.JointOperationMasterDataMgt");

	String tradeComboList ="";
	String tradeSheetList ="";
	String rlaneSheetList ="";
	String carriSheetList ="";
	String dirctSheetList ="";
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();

		event = (FnsJoo0006Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
		
		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		
		tradeComboList = eventResponse.getETCData("tradeComboList");
		tradeSheetList = eventResponse.getETCData("tradeSheetList");
		rlaneSheetList = eventResponse.getETCData("rlaneSheetList");
		carriSheetList = eventResponse.getETCData("carriSheetList");
		dirctSheetList = eventResponse.getETCData("dirctSheetList");
	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<script type="text/javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			showErrMessage(errMessage);
		} // end if
		loadPage("<%=tradeComboList%>","<%=tradeSheetList%>","<%=rlaneSheetList%>","<%=carriSheetList%>","<%=dirctSheetList%>");
	}
</script>


<form name="form" id="form">
<input type="hidden" name="f_cmd" id="f_cmd">
<input type="hidden" name="pagerows" id="pagerows">

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
	<button class="btn_accent" name="btn_retrive" id="btn_retrive" type="button">Retrieve</button><!--
	--><button class="btn_normal" name="btn_new" id="btn_new" type="button">New</button><!--
	--><button class="btn_normal" name="btn_save" id="btn_save" type="button">Save</button><!--
	--><button class="btn_normal" name="btn_downExcel" id="btn_downExcel" type="button">Down Excel</button><!--
	--></div>
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
		<table>
			<tbody>
				<colgroup>
					<col width="50"/>
					<col width="100"/>
					<col width="40"/>
					<col width="100"/>
					<col width="80"/>
					<col width="100"/>
					<col width="90"/>
					<col width="200"/>
					<col width="*"/>
			    </colgroup>
			    <tr>
					<th>Trade</th>
					<td><script type="text/javascript">ComComboObject('trd_cd',1,60,0,0);</script></td>
					<th>Lane</th>
					<td><script type="text/javascript">ComComboObject('rlane_cd',1,80,0,0);</script></td>
					<th>Carrier Code</th>
					<td><script type="text/javascript">ComComboObject('jo_crr_cd',1,60,0,0);</script></td>
					<th>Delete Mark</th>
		            <td class="sm">&nbsp;&nbsp;<input type="radio" class="trans" name='delt_flg' id='delt_flg'  value='A' checked>&nbsp;<b>All</b>
		                    &nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" class="trans" name='delt_flg' id='delt_flg'  value='N' >&nbsp;<b>No </b>
		                    &nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" class="trans" name='delt_flg' id='delt_flg'  value='Y' >&nbsp;<b>Yes</b>   

					</td>
					<td></td>
				</tr>	
			    
			    
			</tbody>
		</table>
		<table class="height_8"><tr><td colspan="8"></td></tr></table>
		
	</div>
	<!-- opus_design_inquiry(E) -->
</div>

<!-- opus_design_grid(S) -->
<div class="wrap_result">
		<div class="opus_design_grid clear" >
			<!-- opus_design_btn (S) -->
			<div class="opus_design_btn">
				<button class="btn_normal" name="btn_add" id="btn_add" type="button">Row Add</button><!--
				--><button class="btn_normal" name="btn_delete" id="btn_delete" type="button">Row Delete</button>
			</div>
			<!-- opus_design_btn (E) -->
		
			<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>
		
		<div class="opus_design_grid clear" >
			<script type="text/javascript">ComSheetObject('sheet2');</script>
		</div>
</div>
<!-- opus_design_grid(E) -->

<input type="hidden" name="code" id="code" />
<input type="hidden" name="name" id="name" />
<input type="hidden" name="super_cd1" id="super_cd1" />
<input type="hidden" name="super_cd2" id="super_cd2" />
</form>
