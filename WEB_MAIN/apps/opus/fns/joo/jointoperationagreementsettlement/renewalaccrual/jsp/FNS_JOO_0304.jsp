<%
/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : FNS_JOO_0304.jsp
 *@FileTitle : Inquiry By VVD
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
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.renewalaccrual.event.FnsJoo0304Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0304Event  event = null;					//PDTO(Data Transfer Object including Parameters)
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


		event = (FnsJoo0304Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

		joCrrCdComboItems  	= eventResponse.getETCData("jo_crr_cds");
		//trdCdComboItems  	= eventResponse.getETCData("trd_cds");
		joStlItmCdComboItems= eventResponse.getETCData("item_cds");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>


<script type="text/javascript">
	var gJoCrrCdComboItems 		= "<%=joCrrCdComboItems%>";
	<%--var gTrdCdComboItems 		= "<%=trdCdComboItems%>";--%>
	var gJoStlItmCdComboItems	= "<%=joStlItmCdComboItems%>";
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
<input type="hidden" name="estm_clz_flg" id="estm_clz_flg" value="N"/>
<!-- popup_title_area(S) -->
 <div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title"><span>Inquiry By VVD</span></h2>
		<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn"><!-- 
		--><button type="button" class="btn_normal" name="btn_Retrieve" 		id="btn_Retrieve"	>Retrieve</button><!-- 
		--><button type="button" class="btn_normal" name="btn_New" 				id="btn_New"		>New</button><!--   
		--><button type="button" class="btn_normal" name="btn_DownExcel" 		id="btn_DownExcel"	>Down Excel</button><!-- 
		--><button type="button" class="btn_normal" name="btn_Close" 			id="btn_Close"		>Close</button><!-- 
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
				<col width="120px">
				<col width="50px">
				<col width="70px">
				<col width="50px">
				<col width="70px">
				<col width="50px">
				<col width="70px">
				<col width="50px">
				<col width="70px">
				<col width="*" />
			</colgroup>
			<tr class="h23">
				<th>Accrual Month</th>
			    <td colspan="3"><input type="text" style="width:60px;" class="input1" dataformat="ym" maxlength="6" name="fr_yrmon" value="" id="fr_yrmon"/><!--  
			    --><button type="button" class="btn_left" name="btn_fr_back" id="btn_fr_back"></button><!--  
			    --><button type="button" class="btn_right" name="btn_fr_next" id="btn_fr_next"></button>~ <!--  
			    --><input type="text" style="width:60px;" class="input1" maxlength="6" dataformat="ym" name="to_yrmon" value="" id="to_yrmon" /><!-- 
			    --><button type="button" class="btn_left" name="btn_to_back" id="btn_to_back"></button><!--  
			    --><button type="button" class="btn_right" name="btn_to_next" id="btn_to_next"></button></td>
			    <th>VVD</th>
				<td><input type="text" name="vvd" style="width:90px;text-align:center" class="input" value="" maxlength="10" dataformat="engup" id="vvd" /></td>
               	<th>Option</th>
               	<td colspan="6"><!-- 
					 --><input name="match_flg" type="radio" value="all" class="" checked="" id="match_flg1" /><label for="match_flg1">All</label><!-- 
					 --><input name="match_flg" type="radio" value="match002" class="" id="match_flg2" /><label for="match_flg2">Estimation is 0</label><!-- 
					 --><input name="match_flg" type="radio" value="match003" class="" id="match_flg3" /><label for="match_flg3">Accrual > 0</label><!-- 
					 --><input name="match_flg" type="radio" value="match004" class="" id="match_flg4" /><label for="match_flg4">Accrual < 0</label><!-- 
					 --><input name="match_flg" type="radio" value="match005" class="" id="match_flg5" /><label for="match_flg5">Accrual is 0</label><!-- 
					 --></td>
               	<td></td>
			</tr>
			<tr class="h23">
				<th>Rev./Exp.</th>
			    <td><input type="radio" name="re_divr_cd" value=""  class="trans" id="re_divr_cd" checked/>&nbsp;ALL&nbsp;&nbsp;&nbsp;<!-- 
			     --><input type="radio" value="R" name="re_divr_cd" class="trans" id="re_divr_cd" />&nbsp;Revenue&nbsp;<!-- 
			     --><input type="radio" value="E" name="re_divr_cd" class="trans" id="re_divr_cd" />&nbsp;Expense</td>
			    <th>Partner</th>
				<td><script type="text/javascript">ComComboObject('jo_crr_cd', 1, 60, 0, 0);</script></td>
               	<th>Trade</th>
			 	<td><script type="text/javascript">ComComboObject('trd_cd', 1, 60, 0, 0);</script></td>
				<th>Lane</th>
				<td><script type="text/javascript">ComComboObject('rlane_cd', 1, 70, 0, 0);</script></td>
               	<th>Item</th>
				<td><script type="text/javascript">ComComboObject('jo_stl_itm_cds', 1, 120, 0, 0);</script></td>
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
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn" ><!-- 
	 --><span style="color: #000000; text-align: right; font-weight: bold; padding-right: 5px;">Unit : USD</span>		
	</div>
	<!-- opus_design_btn(E) -->
	<script type="text/javascript">ComSheetObject('sheet1');</script>
</div>
<!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->
</div>
</form>
