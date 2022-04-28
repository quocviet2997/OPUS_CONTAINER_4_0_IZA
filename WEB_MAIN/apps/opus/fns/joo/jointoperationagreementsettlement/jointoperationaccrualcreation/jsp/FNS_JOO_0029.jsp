<%
/*=========================================================

*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : fns_joo_0029.jsp
*@FileTitle  : Estimate Performance Creation
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/23

=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.jointoperationaccrualcreation.event.FnsJoo0029Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0029Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String strOfc_cd        = "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.JointOperationAccrualCreation");
	String yyyyMM = JSPUtil.getKST("yyyy-MM");

	String joCrrCd = "";
	String trdCd   = "";
	String rlaneCd = "";
	String clzFlg  = "";
	String exeYrmon = "";
	String joStlItmCd = "";
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		strOfc_cd = account.getOfc_cd();

		event = (FnsJoo0029Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

		joCrrCd = eventResponse.getETCData("jo_crr_cd");
		trdCd   = eventResponse.getETCData("trd_cd");
		rlaneCd = eventResponse.getETCData("rlane_cd");
		clzFlg  = eventResponse.getETCData("estm_clz_flg");
		exeYrmon= eventResponse.getETCData("EXE_YRMON");
		joStlItmCd= eventResponse.getETCData("jo_stl_item_cd");
	}catch(Exception e) {
		out.println(e.toString());
	}
%>
<script type="text/javascript">
var gJoCrrCd = "<%=joCrrCd%>";
var gTrdCd   = "<%=trdCd%>";
var gRlaneCd = "<%=rlaneCd%>";
var gClzFlg  = "<%=clzFlg%>";
var gYyyyMM  = "<%=yyyyMM%>";
var gOfcCd   = "<%=strOfc_cd%>";
var gJoStlItmCd  = "<%=joStlItmCd%>";

function setupPage(){
	var errMessage = "<%=strErrMsg%>";
	if (errMessage.length >= 1) {
		ComShowMessage(errMessage);
	} // end if
	loadPage();
}
</script>
<form name="form"  >
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" value="1000" id="pagerows" />
<input type="hidden" name="ofc_cd" value="<%=strOfc_cd%>" id="ofc_cd" />
<input type="hidden" name="code" id="code" />
<input type="hidden" name="name" id="name" />
<input type="hidden" name="super_cd1" id="super_cd1" />
<input type="hidden" name="super_cd2" id="super_cd2" />
<input type="hidden" name="estm_cond_flg" id="estm_cond_flg" />
<input type="hidden" name="cre_flg" value="N" id="cre_flg" />
<input type="hidden" name="page_no" value="1" id="page_no" />
<input type="hidden" name="chk_include" value="" id="chk_include" />

<!-- Field for BackEndJob -->
<input type="hidden" name="key" id="key" />
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn"><!--  
	--><button type="button" class="btn_accent" name="btn1_Retrieve" 	id="btn1_Retrieve"			>Retrieve</button><!--  
	--><button type="button" class="btn_normal" name="btn1_New"  		id="btn1_New"				>New</button><!-- 
	--><button type="button" class="btn_normal" name="btn1_save" 		id="btn1_save"		auth="C">Save</button><!--  
	--><button type="button" class="btn_normal" name="btn1_Down_Excel"  id="btn1_Down_Excel"		>Down Excel</button><!-- 
	--><button type="button" class="btn_normal" name="btn1_Create" 		id="btn1_Create" 	auth="C">Create</button><!--  
	--><button type="button" class="btn_normal" name="btn1_I_F"  		id="btn1_I_F" style="display:none;">I/F</button><!-- 
	--></div>
	<!-- opus_design_btn(E) -->

	<!-- page_location(S) -->
	<div class="location">
		<!-- location 내용 동적생성 (별도 코딩 불필요) -->
		<span id="navigation"></span>
	</div>
</div>
<div class="wrap_search bg">
	<div class="opus_design_inquiry wFit">
		<table>
			<colgroup>
				<col width="120px">
				<col width="120px">
				<col width="80px">
				<col width="80px">
				<col width="80px">
				<col width="80px">
				<col width="60px">
				<col width="75px">
				<col width="55px">
				<col width="65px">
				<col width="55px">
				<col width="75px">
				<col width="55px">
				<col width="175px">
				<col width="*">
			</colgroup>
			<tr>
				<th>Accrual Month</th>
				<td><input type="text" style="width:60px;" class="input1" dataformat="ym" maxlength="6" name="exe_yrmon" value="<%=exeYrmon.substring(0,4)+"-"+exeYrmon.substring(4)%>" id="exe_yrmon" /><!--  
				--><button type="button" class="btn_left" name="btn_exe_back" id="btn_exe_back"></button><!--  
				--><button type="button" class="btn_right" name="btn_exe_next" id="btn_exe_next"></button></td>
				<th>Rev./Exp.</th>
				<td><input type="radio" name="re_divr_cd" value=""  class="trans" id="re_divr_cd" onclick="UF_setCond(1);" />&nbsp;ALL</td>
				<td><input type="radio" value="R" name="re_divr_cd" class="trans" id="re_divr_cd" onclick="UF_setCond(1);"/>&nbsp;Revenue</td>
				<td><input type="radio" value="E" name="re_divr_cd" checked class="trans" id="re_divr_cd" onclick="UF_setCond(1);"/>&nbsp;Expense</td>
				<th>Trade</th>
				<td><script type="text/javascript">ComComboObject('trd_cd', 1, 60, 0, 0);</script></td>
				<th>Lane</th>
				<td><script type="text/javascript">ComComboObject('rlane_cd', 1, 70, 0, 0);</script></td>
				<th>Partner</th>
				<td><script type="text/javascript">ComComboObject('jo_crr_cd', 1, 60, 0, 0);</script></td>
				<th>Item</th>
				<td><script type="text/javascript">ComComboObject('jo_stl_itm_cd', 1, 170, 0, 0);</script></td>
				<td>&nbsp;</td>
			</tr> 
		</table>
		<table>
			<colgroup>
				<col width="120px">
				<col width="250px">
				<col width="70px">
				<col width="120px">
				<col width="50px">
				<col width="80px">
				<col width="80px">
				<col width="50px">
				<col width="200px">
				<col width="*">
			</colgroup>
			<tr>
			    <th>Revenue Month</th>
			    <td><input type="text" style="width:60px;" class="input" dataformat="ym" maxlength="6" caption="Target VVD Period Start DateFormat" name="rev_yrmon_fr" value="<%=(yyyyMM.substring(0,4)+"-01") %>" id="rev_yrmon_fr" cofield="btn_vvd_from_back"/><!--  
			    --><button type="button" class="btn_left" name="btn_vvd_from_back" id="btn_vvd_from_back"></button><!--  
			    --><button type="button" class="btn_right" name="btn_vvd_from_next" id="btn_vvd_from_next"></button>~ <!--  
			    --><input type="text" style="width:60px;" class="input" maxlength="6" caption="Target VVD Period End DateFormat" dataformat="ym" name="rev_yrmon_to" value="<%=yyyyMM%>" cofield="btn_vvd_to_next" id="rev_yrmon_to" /><!-- 
			    --><button type="button" class="btn_left" name="btn_vvd_to_back" id="btn_vvd_to_back"></button><!--  
			    --><button type="button" class="btn_right" name="btn_vvd_to_next" id="btn_vvd_to_next"></button></td>
			    <th title="Vessel Voyage Direction">VVD</th>
				<td><input type="text" name="vvd" style="width:90px;text-align:center" class="input" value="" maxlength="10" dataformat="engup" id="vvd" /></td>
				<th>Voy.Days</th>
				<td><input type="radio" value="V" name="voy_days_cd" class="trans" id="voy_days_cd" checked onClick="setVoyDaysOnClick('V');"/>&nbsp;By VVD</td>
				<td><input type="radio" value="M" name="voy_days_cd" class="trans" id="voy_days_cd" onClick="setVoyDaysOnClick('M');"/>&nbsp;By Month</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<th>&nbsp;</th>
			</tr>
		</table>
	</div>
</div>
<div class="wrap_result">
	<div class="opus_design_grid" id="mainTable">
		<div class="opus_design_btn"><!--
			--><button class="btn_normal" name="btn_Delete" id="btn_Delete" type="button">Row Delete</button><!--  
			--><button type="button" class="btn_accent" name="btn_next" id="btn_next">Next</button>
		</div>
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
	<div class="opus_design_grid" id="mainTable"">
		<script type="text/javascript">ComSheetObject('sheet2');</script>
	</div>
	<div class="opus_design_data">
		<table>
			<colgroup>
				<col width="100">
				<col width="170">
				<col width="80">
				<col width="170">
				<col width="80">
				<col width="170">
				<col width="80">
				<col width="*">
			</colgroup> 
			<tr>
				<th>Estimated Cost</th>
				<td><input type="text" style="width:120px;text-align:right" class="input2" name="estm_amt" dataformat="float" readonly id="estm_amt" /> </td>
				<th>Actual Cost</th>
				<td><input type="text" style="width:120px;text-align:right" class="input2" name="act_amt" dataformat="float" readonly id="act_amt" /> </td>
				<th>Accrual Cost</th>
				<td><input type="text" style="width:120px;text-align:right" class="input2" name="accl_amt" dataformat="float" readonly id="accl_amt" /> </td>
				<th>Total Count</th>
				<td><input type="text" style="width:80px;text-align:right" class="input2" name="tot_cnt" dataformat="num" readonly id="tot_cnt" /> </td>
			</tr> 
		</table>
	</div>
</div>
</form>