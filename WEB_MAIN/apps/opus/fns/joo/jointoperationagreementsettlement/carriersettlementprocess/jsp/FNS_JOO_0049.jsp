<%
/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : FNS_JOO_0049.jsp
 *@FileTitle: Settlement Status for Basic Allocation
 *@author   : CLT
 *@version  : 1.0
 *@since    : 2014/06/19
 =========================================================*/
%>
  
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.carriersettlementprocess.event.FnsJoo0049Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0049Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";
	String yyyyMM = JSPUtil.getKST("yyyy-MM");
	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.CarrierSettlementProcess");
	String offList = "";

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0049Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		offList    = eventResponse.getETCData("office");
	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<script language="javascript">
	var gOffList    = "<%=offList%>";
    var yyyyMM = "<%=yyyyMM%>";
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

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" name="btn_Retrieve" id="btn_Retrieve" type="button">Retrieve</button><!--
		--><button class="btn_normal" name="btn_New" id="btn_New" type="button">New</button><!--
		--><button class="btn_normal" name="btn_DownExcel" id="btn_DownExcel" type="button">Down Excel</button><!--
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
		<table style="width:979px">
			<tbody>
				<colgroup>
					<col width="50"/>
					<col width="80"/>
					<col width="60"/>
					<col width="140"/>
					<col width="50"/>
					<col width="100"/>
					<col width="50"/>
					<col width="*"/>
			    </colgroup>
				<tr>
					<th>Trade</th>
					<td><script type="text/javascript">ComComboObject('trd_cd',1,80,0,1);</script></td>
					<th>Lane</th>
					<td><script type="text/javascript">ComComboObject('rlane_cd',1,80,0,0);</script></td>
					<th>Revenu Month</th>
					<td><input type="text" style="width:60px;" class="input" dataformat="ym" value="<%=yyyyMM %>" caption="Period From Month" name="acct_yrmon_fr" cofield="acct_yrmon_to" id="acct_yrmon_fr" /><!-- 
					 --><button type="button" class="btn_left" name="btn_acct_yrmon_fr_back" id="btn_acct_yrmon_fr_back" ></button><!-- 
						--><button type="button" class="btn_right" name="btn_acct_yrmon_fr_next"  id="btn_acct_yrmon_fr_next"></button><span class="dash">~</span><!-- 
						--><input type="text" style="width:60px;" class="input" caption="Period To Month" value="<%=yyyyMM %>" dataformat="ym" name="acct_yrmon_to" cofield="acct_yrmon_fr" id="acct_yrmon_to" /><!-- 
					    --><button type="button" class="btn_left" name="btn_acct_yrmon_to_back" id="btn_acct_yrmon_to_back"></button><!-- 
						--><button type="button" class="btn_right" name="btn_acct_yrmon_to_next"  id="btn_acct_yrmon_to_next"></button>
					</td>
					<th>Office</th>
					<td width=""><script type="text/javascript">ComComboObject('ofc_cd', 1, 80, 1, 0,0 );</script></td>
				</tr>
			</tbody>
		</table>
		<table class="height_10"><tr><td colspan="8"></td></tr></table>

	</div>
</div>

<!-- opus_design_grid(S) -->
<div class="wrap_result">
	<div class="opus_design_grid" >			
		<div class="opus_design_btn">
			<span style="color: #000000; text-align: right; font-weight: bold; padding-right: 5px;">Currency [USD]</span>
		</div>		
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
	
</div>
<!-- opus_design_grid(E) -->

</form>
