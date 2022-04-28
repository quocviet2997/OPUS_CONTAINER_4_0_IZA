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
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.renewalconsultation.event.FnsJoo0202Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0202Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";
	
	String strUsr_id		= "";
	String strUsr_nm		= "";
	String authOfcCd	    = "";
	
	String strUI = "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.RenewalConsultation");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0202Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		
		authOfcCd    		= StringUtil.xssFilter(request.getParameter("auth_ofc_cd"))    		== null ? ""  : StringUtil.xssFilter(request.getParameter("auth_ofc_cd"));
		strUI = StringUtil.xssFilter(request.getParameter("ui"))== null ? "" : StringUtil.xssFilter(request.getParameter("ui"));
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
<input type="hidden" name="p_auth_ofc_cd" id="p_auth_ofc_cd" value="<%= authOfcCd%>"/>
<input type="hidden" name="p_ui" id="p_ui" value="<%= strUI%>"/>
<!-- popup_title_area(S) -->
 <div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title"><span>Settlement Upload</span></h2>
		<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn"><!--
		    --><button type="button" class="btn_accent" name="btn_FileImport" 		id="btn_FileImport">File Import</button><!-- 
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
		--><button type="button" class="btn_normal" name="btn_delete" 		id="btn_delete"	>Row Delete</button><!--
	 	--><button type="button" class="btn_normal" name="btn_FileTemplate" 	id="btn_FileTemplate">File Template</button>		
	</div>
	<!-- opus_design_btn(E) -->
	<!-- opus_design_btn(E) -->
	<script type="text/javascript">ComSheetObject('sheet1');</script>
</div>
<!-- opus_design_grid(E) -->
<!-- opus_design_grid(S) -->
<div class="opus_design_grid" style="display:none">
	<!-- opus_design_btn(E) -->
	<script type="text/javascript">ComSheetObject('sheet2');</script>
</div>
<!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->
</div>
				
</form>
