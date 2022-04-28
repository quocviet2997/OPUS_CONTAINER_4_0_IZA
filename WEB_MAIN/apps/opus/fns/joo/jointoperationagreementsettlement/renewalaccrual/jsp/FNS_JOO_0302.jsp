<%
/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : FNS_JOO_0201.jsp
 *@FileTitle : Authority Office Creation
 *@author     : CLT
 *@version    : 1.0 
 *@since      : 2014/06/17 
 =========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.util.StringUtil"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.renewalaccrual.event.FnsJoo0302Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0302Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";
	
	String strUsr_id		= "";
	String strUsr_nm		= "";
	String exeYrmon	    	= "";
	String frActYrmon	    = "";
	String toActYrmon	    = "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.RenewalConsultation");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0302Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		
		exeYrmon 	= StringUtil.xssFilter(request.getParameter("exe_yrmon")) == null ? ""  	: StringUtil.xssFilter(request.getParameter("exe_yrmon"));
		frActYrmon 	= StringUtil.xssFilter(request.getParameter("fr_act_yrmon")) == null ? ""  	: StringUtil.xssFilter(request.getParameter("fr_act_yrmon"));
		toActYrmon 	= StringUtil.xssFilter(request.getParameter("to_act_yrmon")) == null ? ""  	: StringUtil.xssFilter(request.getParameter("to_act_yrmon"));
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
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
<!-- Field for BackEndJob -->
<input type="hidden" name="job_key" id="job_key" />
<input type="hidden" name="job_flg" id="job_flg" />
<!-- popup_title_area(S) -->
 <div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title"><span>Estimation Upload</span></h2>
		<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn"><!--
		    --><button type="button" class="btn_accent" name="btn_FileImport" 		id="btn_FileImport">File Import</button><!-- 
			--><button type="button" class="btn_normal" name="btn_Retrieve" 		id="btn_Retrieve">Target List</button><!-- 
			--><button type="button" class="btn_normal" name="btn_New" 				id="btn_New">New</button><!--
			--><button type="button" class="btn_normal" name="btn_Verify" 			id="btn_Verify">Verify</button><!--
			--><button type="button" class="btn_normal" name="btn_Save" 			id="btn_Save">Save</button><!--  
			--><button type="button" class="btn_normal" name="btn_DownExcel" 		id="btn_DownExcel">Down Excel</button><!-- 
			--><button type="button" class="btn_normal" name="btn_Close" 			id="btn_Close">Close</button><!-- 
		--></div>
		<!-- opus_design_btn(E) -->
	</div>
	<!-- page_title_area(E) -->
</div>
<!-- page_title_area(E) -->

<div class="layer_popup_contents">
<!-- wrap_search(S) -->
<div class="wrap_search">
<!-- opus_design_inquiry(S) -->
<div class="opus_design_inquiry wFit">
	<table>
		<tbody>
			<colgroup>
				<col width="50px">
				<col width="70px">
				<col width="50px">
				<col width="60px">
				<col width="50px">
				<col width="70px">
				<col width="75px">
				<col width="120px">
				<col width="*" />
			</colgroup>
			<tr class="h23">
				<th>Accrual Month</th>
				<td><input type="text" style="width:60px;" class="input1" dataformat="ym" maxlength="6" name="exe_yrmon" value="<%=exeYrmon %>" id="exe_yrmon" readonly/></td>
				<th>VVD Start Month</th>
			    <td colspan="3"><input type="text" style="width:60px;" class="input1" dataformat="ym" maxlength="6" name="fr_act_yrmon" value="<%=frActYrmon %>" id="fr_act_yrmon"/><!--  
			    --><button type="button" class="btn_left" name="btn_vvd_from_back" id="btn_vvd_from_back"></button><!--  
			    --><button type="button" class="btn_right" name="btn_vvd_from_next" id="btn_vvd_from_next"></button>~ <!--  
			    --><input type="text" style="width:60px;" class="input1" maxlength="6" dataformat="ym" name="to_act_yrmon" value="<%=toActYrmon %>" id="to_act_yrmon" /><!-- 
			    --><button type="button" class="btn_left" name="btn_vvd_to_back" id="btn_vvd_to_back"></button><!--  
			    --><button type="button" class="btn_right" name="btn_vvd_to_next" id="btn_vvd_to_next"></button></td>
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
	<!-- opus_option_left(S) -->
	<div class="grid_option_left">
		<table> 
        	<tbody>
         		<tr>
          			<td><label style="color:blue;"><b>* 'Activity Date' and 'Trade' are decided by user in Dummy VVD case.</b></label></td>
        		</tr>
       		</tbody>
       	</table>
  	</div>
  	<!-- opus_option_left(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn"><!-- 
	 	--><button type="button" class="btn_normal" name="btn_add" 			id="btn_add" 	>Row Add</button><!--
	 	--><button type="button" class="btn_normal" name="btn_insert" 		id="btn_insert"	>Row Insert</button><!-- 
		--><button type="button" class="btn_normal" name="btn_delete" 		id="btn_delete"	>Row Delete</button><!--
	 	--><button type="button" class="btn_normal" name="btn_FileTemplate" id="btn_FileTemplate">File Template</button><!--
	 --></div>
	<!-- opus_design_btn(E) -->
	<!-- opus_design_btn(E) -->
	<script type="text/javascript">ComSheetObject('sheet1');</script>
</div>
<!-- opus_design_grid(E) -->
<!-- wrap_result(E) -->
</div>
</div>
				
</form>
