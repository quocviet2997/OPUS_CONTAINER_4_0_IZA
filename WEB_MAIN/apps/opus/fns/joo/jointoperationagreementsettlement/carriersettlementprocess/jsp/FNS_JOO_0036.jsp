<%
/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : fns_joo_0036.jsp
 *@FileTitle: Entry and Inquiry of Target Voyage Choose by Settlement Item
 *@author   : CLT
 *@version  : 1.0
 *@since    : 2014/06/18
 =========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.carriersettlementprocess.event.FnsJoo0036Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0036Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationMasterDataMgt.JointOperationMasterDataMgt");

	String yyyyMM = JSPUtil.getKST("yyyy-MM");

	String crrCombo  = "";
	String abbrSheet = "";
	String dirSheet  = "";
	String staSheet  = "";
//	String finSheet  = "";

	String offList   = "";

	String[] dir = null;
	String[] sta = null;
//	String[] fin = null;

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0036Event)request.getAttribute("Event");
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

<script type="text/javascript">
var gOffList    = "<%=offList%>";

	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			showErrMessage(errMessage);
		} // end if
		//loadPage("<%=crrCombo%>");
		loadPage();
	}
</script>

<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="code" id="code" />
<input type="hidden" name="name" id="name" />
<input type="hidden" name="super_cd1" id="super_cd1" />
<input type="hidden" name="super_cd2" id="super_cd2" />
<input type="hidden" name="hid_dt" value="<%=yyyyMM%>" id="hid_dt" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" name="btn_retrieve" id="btn_retrieve" type="button">Retrieve</button><!--
		--><button class="btn_normal" name="btn_new" id="btn_new" type="button">New</button><!--
		--><button class="btn_normal" name="btn_downexcel" id="btn_downexcel" type="button">Down Excel</button><!--
		--><button class="btn_normal" name="btn_save" id="btn_save" type="button">Save</button>
	</div>
	<!-- opus_design_btn (E) -->
		
	<!-- page_location(S) -->
	<div class="location">
		<span id="navigation"></span>
	</div>
</div>
<!-- page_title_area(E) -->

<div class= "wrap_search">
<!-- opus_design_inquiry(S) -->
	<div class= "opus_design_inquiry wFit">
		<table>
			<tbody>
				<colgroup>
					<col width="100"/>
					<col width="220"/>
					<col width="50"/>
					<col  width="60"/>
					<col width="50"/>
					<col width="85"/>
					<col width="50"/>
					<col  width="60"/>
					<col width="50"/>
					<col  width="85"/>
					<col width="90"/>
					<col width="*"/>
			    </colgroup>
			    <tr>
						<th>Account Month</th>
						<td><input type="text" style="width:60px;" class="input1" name="from_dt" value="<%=yyyyMM%>" required caption="Account Month" cofield="to_dt" dataformat="ym" id="from_dt" /><!-- 
						 	--><button type="button" class="btn_left" name="btns_back1" id="btns_back1"></button><!-- 
							--><button type="button" class="btn_right" name="btns_next1"  id="btns_next1"></button><!-- 
							 -->&nbsp;<b>~</b>&nbsp;&nbsp;<input type="text" style="width:60px;" class="input1" name="to_dt" value="<%=yyyyMM%>" required="" caption="Account Month" cofield="from_dt" dataformat="ym" id="to_dt" /><!-- 
							 --><button type="button" class="btn_left" name="btns_back2" id="btns_back2"></button><!-- 
							--><button type="button" class="btn_right" name="btns_next2"  id="btns_next2"></button>
						</td>
						<th>Trade</th>
						<td><script type="text/javascript">ComComboObject('trd_cd',1,55,0,0);</script></td>
						<th>Lane</th>
						<td ><script type="text/javascript">ComComboObject('rlane_cd',1,80,0,0);</script></td>
						<th>Carrier</th>
						<td><script type="text/javascript">ComComboObject('jo_crr_cd',1,55,0,0);</script></td>
						<th>Office</th>
						<td><script type="text/javascript">ComComboObject('ofc_cd', 1, 80, 1, 0,0 );</script></td>
						<td class="pad_left_4"><input type="checkbox" name="combined_chk" class="trans" id="combined_chk" />&nbsp;&nbsp;<b>Combined&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b><!-- 
						 --><input type="checkbox" name="vvd_chk" class="trans" id="vvd_chk" />&nbsp;&nbsp;<b>VVD</b></td>
						<td>&nbsp;</td>						
				</tr>
			</tbody>
		</table>
		<table class="height_10"><tr><td colspan="8"></td></tr></table>
	</div>
</div>

<!-- opus_design_grid(S) -->
<div class="wrap_result">		
	<div class="opus_design_grid" >	
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>	
	<div class="opus_design_grid" style='display:none' >	
		<script type="text/javascript">ComSheetObject('sheet2');</script>
	</div>
</div>
<!-- opus_design_grid(E) -->

</form>