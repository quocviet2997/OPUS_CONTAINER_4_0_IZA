<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : FNS_JOO_0015.jsp
*@FileTitle  : Monthly Clearance Inquiry
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
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.carriersettlementprocess.event.FnsJoo0015Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0015Event  event = null;					//PDTO(Data Transfer Object including Parameters)
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
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0015Event)request.getAttribute("Event");
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

<script type="text/javascript">
    var yyyyMM ="<%=yyyyMM%>";
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

 
<input type="hidden"   name="com_mrdPath"      value="">
<input type="hidden"   name="com_mrdArguments" value="">
<input type="hidden"   name="com_mrdTitle"     value="Combined Monthly Clearance Inquiry">
<input type="hidden"   name="com_mrdBodyTitle" value="Combined Monthly Clearance Inquiry">
<input type="hidden"   name="com_mrdSaveDialogFileExt" value="ppt">
<input type="hidden"   name="com_mrdSaveDialogFileExtLimit" value="xls@pdf@doc@ppt">
<input type="hidden"   name="com_mrdSaveDialogFileName" value="CombinedMonthlyClearance">
<input type="hidden"   name="com_mrdSaveDialogDir" value="">

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
	<button class="btn_accent" name="btn_retrieve" id="btn_retrieve" type="button">Retrieve</button><!--
	--><button class="btn_normal" name="btn_new" id="btn_new" type="button">New</button><!--
	--><button class="btn_normal" name="btn_Down_Excel" id="btn_Down_Excel" type="button">Down Excel</button><!--
	--><button class="btn_normal" name="btn_print" id="btn_print" type="button">Print</button><!--
	--></div>
	
	<!-- opus_design_btn (E) -->
	<!-- page_location(S) -->
	<div class="location">
		<span id="navigation"></span>
	</div>
</div>
<!-- page_title_area(E) -->


<div class= "wrap_search ">
<!-- opus_design_inquiry(S) -->
	<div class= "opus_design_inquiry">
		<table>
			<tbody>
				<colgroup>
					<col width="100"/>
					<col width="130"/>
					<col width="40"/>
					<col width="90"/>
					<col width="90"/>
					<col width="*"/>
			    </colgroup>
				<tr class="h23">
					<th>Account Month</th>
					<td ><input type="text" style="width:60px" class="input1" required style="ime-mode:disabled" dataformat='ym' maxlength='6' value="<%=yyyyMM %>" name='acct_yrmon'>&nbsp;
					<button type="button" class="btn_left" name="btn_back"  id="btn_back"></button><!--
						--><button type="button" class="btn_right" name="btn_next"  id="btn_next"></button></td>
					<th >Carrier </th>
					<td ><script type="text/javascript">ComComboObject('jo_crr_cd', 1, 60, 0, 1, 0 );</script></td>
					<th>Combined No.</th>
					<td><script type="text/javascript">ComComboObject('stl_cmb_seq', 1, 60, 0, 1,0 );</script></td>
				</tr>
				
			</tbody>
		</table>
	</div>
	<!-- opus_design_inquiry(E) -->
</div>


<!-- opus_design_grid(S) -->
<div class="wrap_result">
	<div class= "opus_design_inquiry">
		<div class="opus_design_grid clear" >
					
			<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>
		
		<div class="opus_design_grid clear" style="display:none;" >
			<script type="text/javascript">ComSheetObject('sheet2');</script>
		</div>
	
		<table>
			<tbody>
				<colgroup>
					<col width="50"/>
					<col width="70"/>
					<col width="50"/>
					<col width="90"/>
					<col width="*"/>
			    </colgroup>
			     <tr class="h23">
		                <th>Carrier</th>
		                <td><input type="text" style="width:40px;text-align:center" class="input1" name="bal_jo_crr_cd" readOnly></td>
		                <th>Balance Amount</th>
		                <td><input type="text" style="width:120px;text-align:right" class="input1" name="balance" pointcount=2 dataformat="float" readOnly></td>
		                <td width="">&nbsp;</td>
		         </tr> 
			    
			</tbody>
		</table>
	
	</div>
		
		
</div>
<!-- opus_design_grid(E) -->
</form>
