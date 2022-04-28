<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_JOO_0011.jsp
*@FileTitle  : Reefer Surcharge Creation
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/12
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.carriersettlementprocess.event.FnsJoo0011Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0011Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.hanjin.apps.JointOperationAgreementSettlement.CarrierSettlementProcess");

	String yyyyMM = JSPUtil.getKST("yyyy-MM");
	
	String crrCombo = "";
	String ioc      = "";
	String rtu      = "";
	String rgn      = "";
	String iocNm    = "";
	String rtuNm    = "";
	String rgnNm    = "";
    String clzYn    = "O";
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0011Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// 초기화면 로딩시 서버로부터 가져온 데이터 추출하는 로직추가 ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

		crrCombo = eventResponse.getETCData("jo_crr_cd");
		ioc      = eventResponse.getETCData("ioc");
		rtu      = eventResponse.getETCData("rtu");
		rgn      = eventResponse.getETCData("rgn");
		iocNm    = eventResponse.getETCData("ioc_nm");
		rtuNm    = eventResponse.getETCData("rtu_nm");
		rgnNm    = eventResponse.getETCData("rgn_nm");
		clzYn    = eventResponse.getETCData("clz_yn");
	}catch(Exception e) {
		out.println(e.toString());
	}
%>
<script type="text/javascript">
var gCrrCombo    = "<%=crrCombo%>";
var gIoc         = "<%=ioc%>";
var gIocNm       = "<%=iocNm%>";
var gRtu         = "<%=rtu%>";
var gRtuNm       = "<%=rtuNm%>";
var gRgn         = "<%=rgn%>";
var gRgnNm       = "<%=rgnNm%>";
var gClzYn       = "<%=clzYn%>";

	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
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
<input type="hidden" name="cur_row" value="0" id="cur_row" />
<input type="hidden" name="jo_stl_itm_cd" value="R/F" id="jo_stl_itm_cd" />
<input type="hidden" name="jo_mnu_nm" value="R/F" id="jo_mnu_nm" />
<input type="hidden" name="locl_curr_cd" id="locl_curr_cd" />
<input type="hidden" name="uc_bss_port_etd_dt" id="uc_bss_port_etd_dt" />
<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		    <button class="btn_accent"  type="button"  name="btn_retrieve" id="btn_retrieve" auth="R">Retrieve</button><!-- 
		 --><button class="btn_normal"  type="button" name="btn_new" id="btn_new" auth="R">New</button><!-- 
		 --><button class="btn_normal"  type="button"  name="btn_create" id="btn_create" auth="C">Create</button><!-- 
		 --><button class="btn_normal"  type="button" name="btn_save" id="btn_save" auth="C">Save</button><!-- 
		 --><button class="btn_normal"  type="button" name="btn_delete_all" id="btn_delete_all" auth="C">Delete</button><!-- 
		 --><button class="btn_normal"  type="button" name="btn_downexcel" id="btn_downexcel" auth="R">Down Excel</button>
	</div>
	<!-- opus_design_btn (E) -->
	<!-- page_location(S) -->
	<div class="location">
		<span id="navigation"></span>
	</div>
	<!-- page_location(E) -->
</div>
<div class="wrap_search">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry wFit">
		<table>
			<colgroup>
				<col width="100px"/><!-- Account Month -->
				<col width="120px"/>
				<col width="50px"/><!-- Carrier -->
				<col width="200px"/>
				<col width="50px"/><!-- Rev./Exp. -->
				<col width="150px"/>				
				<col width="120px">
				<col width="*">
			</colgroup>
			<tbody>
				<tr>
					<th>Account Month</th>
					<td><!-- 
					--><input type="text" style="width:60px" class="input1" name="acct_yrmon" id="acct_yrmon" value="<%=yyyyMM%>" dataformat="ym" maxlength=6><!-- 
					--><button class="btn_left"  type="button" name="btns_back" id="btns_back" ></button><!--
					--><button class="btn_right"  type="button" name="btns_next" id="btns_next"></button>
					</td>
					<th>Carrier</th>
					<td><script type="text/javascript">ComComboObject('cmb_jo_crr_cd',6,70,0,1);</script><!-- 
					--><input type="text" style="width:40px;text-align:center;display:none;" class="input2" name="jo_crr_cd" id="jo_crr_cd" readonly><!-- 
					--><input type="text" style="width:40px;text-align:center;" class="input2" name="trd_cd" id="trd_cd" readonly><!-- 
					--><input type="text" style="width:60px;text-align:center;" class="input2" name="rlane_cd" id="rlane_cd" readonly></td>
					<th>Rev./Exp.</th>
					<th class="pad_left_4"><input type="radio" name="re_divr_cd" id="re_divr_cd1" value="R" class="trans" checked><label for="re_divr_cd1">Revenue</label><!-- 
					--><input type="radio" name="re_divr_cd" id="re_divr_cd2" value="E" class="trans"><label for="re_divr_cd2">Expense</label></th>
					<th><input type="radio" name="rf_scg_stl_tp_cd" id="rf_scg_stl_tp_cd1" value="R" class="trans"><label for="rf_scg_stl_tp_cd1">RDR</label><input type="radio" name="rf_scg_stl_tp_cd" id="rf_scg_stl_tp_cd2" value="T" class="trans"><label for="rf_scg_stl_tp_cd2">TDR</label> </th>
					<td></td>
				 </tr>
			</tbody>
		</table>
	</div>
	<!-- opus_design_inquiry(E) -->
</div>
<div class="wrap_result">
	<div class="opus_design_grid"  id="mainTable">
		<div class="opus_design_btn">
		     	<button type="button" class="btn_normal" name="btn_add" id="btn_add" auth="C">Row Add</button><!-- 
			 --><button type="button" class="btn_normal"   name="btn_delete" id="btn_delete" auth="C">Row Delete</button>
		</div>
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
	<div class="opus_design_grid"  id="mainTable" >
		<script type="text/javascript">ComSheetObject('sheet2');</script>
	</div>
</div>	
</form>