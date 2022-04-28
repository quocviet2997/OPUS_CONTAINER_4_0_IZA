<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   FNS_JOO_0081.jsp
*@FileTitle  : Booking Inquiry
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.carriersettlementprocess.event.FnsJoo0084Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0084Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String strLadenTpSzNm   = "";
	String strEmptyTpSzNm   = "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.CarrierSettlementProcess");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0084Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		strLadenTpSzNm = eventResponse.getETCData("ladenTpSzNm");
		strEmptyTpSzNm = eventResponse.getETCData("emptyTpSzNm");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<script language="javascript">
var strLadenTpSzNm = "<%=strLadenTpSzNm%>";
var strEmptyTpSzNm = "<%=strEmptyTpSzNm%>";
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage("<%=strLadenTpSzNm%>","<%=strEmptyTpSzNm%>");
	}
 
</script>
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="backendjob_key" id="backendjob_key"  value=""/>
<input type="hidden" name="excel_flg" id="excel_flg"  value=""/>
<input type="hidden" name="search_type" id="search_type"  value=""/>
<input type="hidden" name="laden_tpsz_datas" id="laden_tpsz_datas"  value=""/>
<input type="hidden" name="empty_tpsz_datas" id="empty_tpsz_datas"  value=""/>
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn"><!--  
	--><button type="button" class="btn_accent" name="btn_Retrieve"  id="btn_Retrieve">Retrieve</button><!--  
	--><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button><!--  
	--><button type="button" class="btn_normal" name="btn_DownExcel" id="btn_DownExcel">DownExcel</button><!--  
	--><button type="button" class="btn_normal" name="btn_Conversion" id="btn_Conversion">Conversion Table</button><!--  
	--><button type="button" class="btn_normal" name="btn_Option" id="btn_Option">Option</button><!--  
	--></div>
	<!-- opus_design_btn(E) -->

	<!-- page_location(S) -->
	<div class="location">
		<!-- location 내용 동적생성 (별도 코딩 불필요) -->
		<span id="navigation"></span>
	</div>
</div>
<div class="wrap_search">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry wFit">
		<table>
			<colgroup>			
				<col width="5%" />				
				<col width="15%" />				
				<col width="5%" />				
				<col width="10%" />			
				<col width="5%" />				
				<col width="10%" />		
				<col width="5%" />				
				<col width="5%" />				
				<col width="45%" />				
		   </colgroup> 
		   <tbody>
			   	<tr><th title="Vessel Voyage Direction">VVD</th>
					<td><input type="text" name="vsl_cd" style="width:50px;text-align:center;ime-mode:disabled;" class="input1" value="" maxlength="4" onfocus="this.select();" id="vsl_cd" dataformat="engup" /><!-- 
					 --><input type="text" name="voy_no" style="width:40px;text-align:center;ime-mode:disabled;" class="input1" value="" maxlength="4" onfocus="this.select();" id="voy_no" dataformat="num" /><!-- 
					 --><input type="text" name="dir_cd" style="width:25px;text-align:center;ime-mode:disabled;" class="input1" value="" maxlength="1" onfocus="this.select();" id="dir_cd" dataformat="engup" /><!-- 
					 --><button type="button" id="btn_vvd_search" name="btn_vvd_search" class="input_seach_btn"></button></td>
					<th title="Vessel Voyage Direction">Previous Voyage</th>
					<td><input type="text" name="pre_vsl_cd" style="width:50px;text-align:center;ime-mode:disabled;" class="input" value="" maxlength="4" onfocus="this.select();" id="pre_vsl_cd" dataformat="engup" /><!-- 
					 --><input type="text" name="pre_voy_no" style="width:40px;text-align:center;ime-mode:disabled;" class="input" value="" maxlength="4" onfocus="this.select();" id="pre_voy_no" dataformat="num" /><!-- 
					 --><input type="text" name="pre_dir_cd" style="width:25px;text-align:center;ime-mode:disabled;" class="input" value="" maxlength="1" onfocus="this.select();" id="pre_dir_cd" dataformat="engup" /><!-- 
					 --><button type="button" id="btn_pre_vvd_search" name="btn_pre_vvd_search" class="input_seach_btn"></button></td>
					<th>Last Port</th>
					<td><input type="text" style="width:70px;ime-mode:disabled;text-align:center" name="lst_port" class="input" maxlength="5" dataformat="engup" value="" onfocus="this.select();" id="lst_port" /><!-- 
					 --><input type="text" style="width:20px;ime-mode:disabled;text-align:center" name="lst_clpt_ind_seq" class="input" maxlength="1" dataformat="num" value="" onfocus="this.select();" id="lst_clpt_ind_seq" /></td>
					 <th>Carrier</th>
					<td><input type="text" style="width:45px;ime-mode:disabled;text-align:center" name="slan_cd" class="input1" maxlength="3" dataformat="engup" value="" onfocus="this.select();" id="slan_cd" /><!-- 
					 --><button type="button" id="btn_carrier_cd" name="btn_carrier_cd" class="input_seach_btn"></button></td>
					<td></td>
				</tr>
		   </tbody>
		</table>
		<!--  biz_1   (E) -->
		<table class="height_8"><tr><td></td></tr></table>
		
	</div>
	<!-- opus_design_inquiry(E) -->
</div>
<div class="wrap_result">
	<div class="opus_design_tab">
		<script language="javascript">ComTabObject('tab1');</script>
	</div>
	
	<!-- opus_design_grid(S) -->	
	<div class="opus_design_grid clear" style="width:98%" name="tabLayer" id="tabLayer">
		<script type="text/javascript">ComSheetObject('t1sheet1');</script>
	</div>
		
	<div class="opus_design_grid clear" style="width:98%" name="tabLayer" id="tabLayer">
		<div class="opus_design_grid">
	      	<h3 class="title_design mar_btm_8">ROB from previous Voyage</h3>
	      	<br/>
			<script type="text/javascript">ComSheetObject('t2sheet1');</script>
      	</div>
      	<div class="opus_design_grid">
	      	<h3 class="title_design mar_btm_8">Operation Summary Report</h3>
	      	<br/>
			<script type="text/javascript">ComSheetObject('t2sheet2');</script>
      	</div>
      	<%--
      	<div class="opus_design_grid">
	      	<h3 class="title_design mar_btm_8">ROB to next Voyage</h3>
	      	<br/>
			<script type="text/javascript">ComSheetObject('t2sheet3');</script>
      	</div>
      	 --%>
      	<div id="div_base_dummy" class="opus_design_grid" style="display: none;">
			<h3 class="title_design mar_btm_8">Excel Dummy</h3>
	      	<br/>
			<script type="text/javascript">ComSheetObject('t2sheet4');</script>
		</div>
	</div>
	<!-- opus_design_grid(E) -->
</div>	
</form>
