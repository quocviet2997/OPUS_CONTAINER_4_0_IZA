<%
/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : FNS_JOO_0050.jsp
 *@FileTitle: Target Voyage vs Unsettled Status
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
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.carriersettlementprocess.event.FnsJoo0050Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0050Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.CarrierSettlementProcess");
	String yyyyMM = JSPUtil.getKST("yyyy-MM");	

	String joCrrCd = "";
	String trdCd   = "";
	String rlaneCd = "";
	String joStlItmCd = "";
	String offList = "";
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0050Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		joCrrCd    = eventResponse.getETCData("jo_crr_cd");
		trdCd      = eventResponse.getETCData("trd_cd");
		rlaneCd    = eventResponse.getETCData("rlane_cd");
		joStlItmCd = eventResponse.getETCData("jo_stl_itm_cd");
		offList    = eventResponse.getETCData("office");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<script type="text/javascript">
var yyyyMM      = "<%=yyyyMM%>";
var gJoCrrCd    = "<%=joCrrCd%>";
var gTrdCd      = "<%=trdCd%>";
var gRlaneCd    = "<%=rlaneCd%>";
var gJoStlItmCd = "<%=joStlItmCd%>";
var gOffList    = "<%=offList%>";
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form" id="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="code" id="code" />
<input type="hidden" name="name" id="name" />
<input type="hidden" name="super_cd1" id="super_cd1" />
<input type="hidden" name="super_cd2" id="super_cd2" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" name="btn_Retrieve" id="btn_Retrieve" type="button" auth="R">Retrieve</button><!--
		--><button class="btn_normal" name="btn_save" id="btn_save" type="button" auth="C">Save</button><!--
		--><button class="btn_normal" name="btn_New" id="btn_New" type="button"  auth="R">New</button><!--
		--><button class="btn_normal" name="btn_DownExcel" id="btn_DownExcel" type="button"  auth="R">Down Excel</button><!--
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
					<col width="100"/>
					<col width="60"/>
					<col width="100"/>
					<col width="50"/>
					<col width="100"/>
					<col width="50"/>
					<col width="*"/>
			    </colgroup>
				<tr>
					<th>Trade</th>
					<td><script type="text/javascript">ComComboObject('trd_cd',1,80,0,0);</script></td>
					<th>Lane</th>
					<td><script type="text/javascript">ComComboObject('rlane_cd',1,80, 0,0);</script></td>
					<th>Carrier</th>
					<td><script type="text/javascript">ComComboObject('jo_crr_cd',1,80,0,0);</script></td>
					<th>Account Month</th>
					<td><input type="text" style="width:60px;" class="input1" dataformat="ym" maxlength="6" value="<%=yyyyMM %>" caption="Period From Month"  name="acct_yrmon_fr" cofield="acct_yrmon_to" id="acct_yrmon_fr" /><!-- 
					 --><button type="button" class="btn_left" name="btn_acct_yrmon_fr_back" id="btn_acct_yrmon_fr_back" ></button><!-- 
						--><button type="button" class="btn_right" name="btn_acct_yrmon_fr_next"  id="btn_acct_yrmon_fr_next"></button>&nbsp;<b>~</b>&nbsp;&nbsp;<!-- 
						--> <input type="text" style="width:60px;" class="input1"  maxlength="6" caption="Period To Month" value="<%=yyyyMM %>" dataformat="ym" name="acct_yrmon_to" cofield="acct_yrmon_fr" id="acct_yrmon_to" /><!-- 
					    --><button type="button" class="btn_left" name="btn_acct_yrmon_to_back" id="btn_acct_yrmon_to_back"></button><!-- 
						--><button type="button" class="btn_right" name="btn_acct_yrmon_to_next"  id="btn_acct_yrmon_to_next"></button>						
					 </td>
				</tr> 
				<tr>
					<th>Item</th>
					<td><script type="text/javascript">ComComboObject('jo_stl_itm_cd', 1, 80, 1, 0,0 );</script></td>
					<th>Office</th>
					<td><script type="text/javascript">ComComboObject('ofc_cd', 1, 80, 1, 0,0 );</script></td>
					<th>Diff.</th>
					<td><input type="checkbox" name="diff_only_yn" id="diff_only_yn" value="Y" class="trans" checked="" /> </td>
					<th>Remark</th>
					<td><input type="checkbox" name="rmk_yn" id="rmk_yn" value="N" class="trans" unchecked="" /> </td>
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
	<div class="opus_design_grid" >			
		<script type="text/javascript">ComSheetObject('sheet2');</script>
	</div>
</div>
<!-- opus_design_grid(E) -->

</form>
