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
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.renewalconsultation.event.FnsJoo0201Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0201Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String joCrrCdComboItems	= "";
	//String trdCdComboItems		= "";
	String joStlItmCdComboItems = "";
	String authOfcCdComboItems	= "";
	String currCdComboItems	= "";
	
	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.RenewalConsultation");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0201Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

		joCrrCdComboItems  	= eventResponse.getETCData("jo_crr_cds");
		//trdCdComboItems  	= eventResponse.getETCData("trd_cds");
		joStlItmCdComboItems= eventResponse.getETCData("item_cds");
		authOfcCdComboItems = eventResponse.getETCData("auth_ofc_cds");
		currCdComboItems 	= eventResponse.getETCData("currency");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>


<script type="text/javascript">
	var gJoCrrCdComboItems 		= "<%=joCrrCdComboItems%>";
	<%--var gTrdCdComboItems 		= "<%=trdCdComboItems%>";--%>
	var gJoStlItmCdComboItems	= "<%=joStlItmCdComboItems%>";
	var authOfcCdComboItems		= "<%=authOfcCdComboItems%>";
	var currCdComboItems 		= "<%=currCdComboItems%>";
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
<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn"><!-- 
		--><button type="button" class="btn_accent" name="btn_Retrieve" 		id="btn_Retrieve">Retrieve</button><!-- 
		--><button type="button" class="btn_accent" name="btn_Upload" 			id="btn_Upload">Upload</button><!-- 
		--><button type="button" class="btn_normal" name="btn_New" 				id="btn_New">New</button><!--
		--><button type="button" class="btn_normal" name="btn_Save" 			id="btn_Save">Save</button><!--  
		--><button type="button" class="btn_normal" name="btn_DownExcel" 		id="btn_DownExcel">Down Excel</button>
	</div>
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
				<col width="60px">
				<col width="50px">
				<col width="50px">
				<col width="50px">
				<col width="50px">
				<col width="55px">
				<col width="75px">
				<col width="55px">
				<col width="75px">
				<col width="55px">
				<col width="110px">
				<col width="55px">
				<col width="120px"> <!-- 12 -->
				<col width="55px">
				<col width="100px">
				<col width="55px">
				<col width="100px">
				<col width="*" />
			</colgroup>
			<tr class="h23">
				<th>VVD Start Month</th>
			    <td colspan="4"><input type="text" style="width:60px;" class="input1" dataformat="ym" maxlength="6" name="fr_rev_yrmon" value="" id="fr_rev_yrmon"/><!--  
			    --><button type="button" class="btn_left" name="btn_vvd_from_back" id="btn_vvd_from_back"></button><!--  
			    --><button type="button" class="btn_right" name="btn_vvd_from_next" id="btn_vvd_from_next"></button>~ <!--  
			    --><input type="text" style="width:60px;" class="input1" maxlength="6" dataformat="ym" name="to_rev_yrmon" value="" id="to_rev_yrmon" /><!-- 
			    --><button type="button" class="btn_left" name="btn_vvd_to_back" id="btn_vvd_to_back"></button><!--  
			    --><button type="button" class="btn_right" name="btn_vvd_to_next" id="btn_vvd_to_next"></button></td>
			    <th>Rev./Exp.</th>
			    <td colspan="2"><input type="radio" name="re_divr_cd" value=""  class="trans" id="re_divr_cd" checked/>&nbsp;ALL&nbsp;&nbsp;&nbsp;<!-- 
			     --><input type="radio" value="R" name="re_divr_cd" class="trans" id="re_divr_cd" />&nbsp;Revenue&nbsp;<!-- 
			     --><input type="radio" value="E" name="re_divr_cd" class="trans" id="re_divr_cd" />&nbsp;Expense</td>
			    <th>Invoiced</th>
			    <td><input type="radio" name="inv_flg" value=""  class="trans" id="inv_flg"/>&nbsp;ALL&nbsp;&nbsp;&nbsp;<!-- 
			     --><input type="radio" value="N" name="inv_flg" class="trans" id="inv_flg" checked/>&nbsp;No&nbsp;<!-- 
			     --><input type="radio" value="Y" name="inv_flg" class="trans" id="inv_flg" />&nbsp;Yes</td>
				<th>Dummy Flag</th>
			    <td><input type="radio" name="dummy_flg" value=""  class="trans" id="dummy_flg" checked/>&nbsp;ALL&nbsp;&nbsp;&nbsp;<!-- 
			     --><input type="radio" value="N" name="dummy_flg" class="trans" id="dummy_flg"/>&nbsp;No&nbsp;<!-- 
			     --><input type="radio" value="Y" name="dummy_flg" class="trans" id="dummy_flg" />&nbsp;Yes</td>
				<td></td>
			</tr>
			<tr class="h23">
				<th>Partner</th>
				<td><script type="text/javascript">ComComboObject('jo_crr_cd', 1, 60, 0, 0);</script></td>
               	<th>Trade</th>
			 	<td><script type="text/javascript">ComComboObject('trd_cd', 1, 60, 0, 0);</script></td>
				<th>Lane</th>
				<td><script type="text/javascript">ComComboObject('rlane_cd', 1, 70, 0, 0);</script></td>
               	<th>Office</th>
               	<td><script type="text/javascript">ComComboObject('auth_ofc_cd',1, 80,0, 0);</script></td>
				<th>Item</th>
				<td><script type="text/javascript">ComComboObject('jo_stl_itm_cds', 1, 120, 0, 0);</script></td>
				<th>VVD</th>
				<td><input type="text" name="rev_vvd" style="width:90px;text-align:center" class="input" value="" maxlength="10" dataformat="engup" id="rev_vvd" /></td>
               	<td colspan="5"></td>
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
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn"><!-- 
	 --><button type="button" class="btn_normal" name="btn_add" 		id="btn_add" 	>Row Add</button><!--
	 --><button type="button" class="btn_normal" name="btn_insert" 		id="btn_insert">Row Insert</button><!-- 
	 --><button type="button" class="btn_normal" name="btn_delete" 		id="btn_delete"	>Row Delete</button><!--
	 --><button type="button" class="btn_normal" name="btn_FileTemplate" 	id="btn_FileTemplate">File Template</button>		
	</div>
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
				
</form>
