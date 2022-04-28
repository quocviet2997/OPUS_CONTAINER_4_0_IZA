<%
/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : FNS_JOO_0079.jsp
 *@FileTitle : Authority Office Creation
 *@author     : CLT
 *@version    : 1.0 
 *@since      : 2014/06/17 
 =========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.StringUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.renewalconsultation.event.FnsJoo0105Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0105Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String joCrrCdComboItems	= "";
	String joStlItmCdComboItems = "";
	
	String pFrAcctYrmon		= "";
	String pToAcctYrmon  	= "";
	String pJoStlItmCds 	= "";
	String pJoCrrCd		 	= "";
	String pSheetJoCrrCd	= "";
	String pSheetJoStlItmCd = "";
	String pSheetRevVvd 	= "";
	String pSheetRevYrmon 	= "";
	String pSheetRevStlVvdSeq 	= "";
	
	
	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.RenewalConsultation");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0105Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		
		pFrAcctYrmon    	= StringUtil.xssFilter(request.getParameter("fr_rev_yrmon")) 	== null ? ""  		: StringUtil.xssFilter(request.getParameter("fr_rev_yrmon"));
		pToAcctYrmon    	= StringUtil.xssFilter(request.getParameter("to_rev_yrmon"))   	== null ? ""  		: StringUtil.xssFilter(request.getParameter("to_rev_yrmon"));
		pJoCrrCd    		= StringUtil.xssFilter(request.getParameter("jo_crr_cd"))    	== null ? ""  		: StringUtil.xssFilter(request.getParameter("jo_crr_cd"));
		pJoStlItmCds    	= StringUtil.xssFilter(request.getParameter("jo_stl_itm_cds"))  == null ? ""  		: StringUtil.xssFilter(request.getParameter("jo_stl_itm_cds"));
		pSheetJoCrrCd    	= StringUtil.xssFilter(request.getParameter("sheet_jo_crr_cd"))    	== null ? ""  	: StringUtil.xssFilter(request.getParameter("sheet_jo_crr_cd"));
		pSheetJoStlItmCd	= StringUtil.xssFilter(request.getParameter("sheet_jo_stl_itm_cd"))  == null ? ""  	: StringUtil.xssFilter(request.getParameter("sheet_jo_stl_itm_cd"));
		pSheetRevVvd    	= StringUtil.xssFilter(request.getParameter("sheet_rev_vvd"))  == null ? ""  		: StringUtil.xssFilter(request.getParameter("sheet_rev_vvd"));
		pSheetRevYrmon    	= StringUtil.xssFilter(request.getParameter("sheet_rev_yrmon"))  == null ? ""  		: StringUtil.xssFilter(request.getParameter("sheet_rev_yrmon"));
		pSheetRevStlVvdSeq 	= StringUtil.xssFilter(request.getParameter("sheet_stl_vvd_seq"))  == null ? ""  		: StringUtil.xssFilter(request.getParameter("sheet_stl_vvd_seq"));
		
		joCrrCdComboItems  	= eventResponse.getETCData("jo_crr_cds");
		joStlItmCdComboItems= eventResponse.getETCData("item_cds");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>


<script type="text/javascript">
	var gJoCrrCdComboItems 		= "<%=joCrrCdComboItems%>";
	var gJoStlItmCdComboItems	= "<%=joStlItmCdComboItems%>";
	var gParamFrAcctYrmon		= "<%=pFrAcctYrmon%>";
	var gParamToAcctYrmon		= "<%=pToAcctYrmon%>";
	var gParamJoCrrCd			= "<%=pJoCrrCd%>";
	var gParamJoStlItmCds		= "<%=pJoStlItmCds%>";
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
<input type="hidden" name="jo_crr_cd" 		id="jo_crr_cd" 		value="<%=pSheetJoCrrCd%>">
<input type="hidden" name="jo_stl_itm_cd" 	id="jo_stl_itm_cd" 	value="<%=pSheetJoStlItmCd%>">
<input type="hidden" name="rev_vvd" 		id="rev_vvd" 		value="<%=pSheetRevVvd%>">
<input type="hidden" name="rev_yrmon" 		id="rev_vvd" 		value="<%=pSheetRevYrmon%>">
<input type="hidden" name="stl_vvd_seq" 	id="stl_vvd_seq" 	value="<%=pSheetRevStlVvdSeq%>">
<!-- popup_title_area(S) -->
 <div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title"><span>Actual Detail</span></h2>
		<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn"><!-- 
			--><button type="button" class="btn_accent" name="btn_Retrieve" 		id="btn_Retrieve">Retrieve</button><!-- 
			--><button type="button" class="btn_normal" name="btn_New" 				id="btn_New">New</button><!--  
			--><button type="button" class="btn_normal" name="btn_DownExcel" 		id="btn_DownExcel">Down Excel</button><!-- 
			--><button type="button" class="btn_normal" name="btn_Close" 			id="btn_Close">Close</button>
		</div>
		<!-- opus_design_btn(E) -->	
	</div>
	<!-- page_title_area(E) -->
</div>
<!-- page_title_area(E) -->

<div class="layer_popup_contents" >	
<!-- wrap_search(S) -->
<div class="wrap_search">
<!-- opus_design_inquiry(S) -->
<div class="opus_design_inquiry wFit">
	<table>
		<tbody>
			<colgroup>
				<col width="100px">
				<col width="200px">
				<col width="150px">
				<col width="75px">
				<col width="75px">
				<col width="150px">
				<col width="55px">
				<col width="110px">
				<col width="*" />
			</colgroup>
			<tr class="h23">
				<th>Invoice Month</th>
			    <td><input type="text" style="width:60px;" class="input1" dataformat="ym" maxlength="6" name="fr_acct_yrmon" value="" id="fr_acct_yrmon" /><!--  
			    --><button type="button" class="btn_left" name="btn_vvd_from_back" id="btn_vvd_from_back"></button><!--  
			    --><button type="button" class="btn_right" name="btn_vvd_from_next" id="btn_vvd_from_next"></button>~ <!--  
			    --><input type="text" style="width:60px;" class="input1" maxlength="6" dataformat="ym" name="to_acct_yrmon" value="" id="to_acct_yrmon" /><!-- 
			    --><button type="button" class="btn_left" name="btn_vvd_to_back" id="btn_vvd_to_back"></button><!--  
			    --><button type="button" class="btn_right" name="btn_vvd_to_next" id="btn_vvd_to_next"></button></td>
			    <th>Actual Payer/Receiver</th>
				<td><script type="text/javascript">ComComboObject('acctg_crr_cd', 1, 60, 0, 0);</script></td>
               	<th>Invoice No</th>
				<td><script type="text/javascript">ComComboObject('inv_no', 1, 150, 0, 0);</script></td>
               	<th>Item</th>
				<td><script type="text/javascript">ComComboObject('jo_stl_itm_cds', 1, 100, 0, 0);</script></td>
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
	<!-- opus_design_btn(E) -->
	<script type="text/javascript">ComSheetObject('sheet1');</script>
</div>
<!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->
</div>				
</form>
