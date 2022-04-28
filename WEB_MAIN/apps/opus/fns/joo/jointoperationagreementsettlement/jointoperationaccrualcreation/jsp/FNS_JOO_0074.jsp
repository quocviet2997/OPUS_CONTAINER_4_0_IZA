<%
/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : FNS_JOO_0074.jsp
 *@FileTitle : Estimate Performance Inquiry
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
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.jointoperationaccrualcreation.event.FnsJoo0074Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0074Event  event = null;					//PDTO(Data Transfer Object including Parameters)
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
	String defaultFormatDate = "yyyyMM";
	String defaultFormatDate2 = "yyyy-MM";
	
	String joCrrCd = "";
	String trdCd   = "";
	String rlaneCd = "";
	String bsaTpCd = "";
	String bsaTpNm = "";
	String exeYrmon   = "";
	String revYrmonFr = "";
	String revYrmonTo = "";
	String joStlItmCd = "";

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		strOfc_cd = account.getOfc_cd();


		event = (FnsJoo0074Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		joCrrCd    = eventResponse.getETCData("JO_CRR_CD");
		trdCd      = eventResponse.getETCData("TRD_CD");
		rlaneCd    = eventResponse.getETCData("RLANE_CD");
		bsaTpCd    = eventResponse.getETCData("STL_JB_COMBO");
		bsaTpNm    = eventResponse.getETCData("STL_JB_COMNM");
		exeYrmon   = JSPUtil.replace(eventResponse.getETCData("EXE_YRMON")		, "-", "");
		revYrmonFr = JSPUtil.replace(eventResponse.getETCData("REV_YRMON_FR")	, "-", "");
		revYrmonTo = JSPUtil.replace(eventResponse.getETCData("REV_YRMON_TO")	, "-", "");
		joStlItmCd = eventResponse.getETCData("jo_stl_item_cd");
		
		
		exeYrmon = DateTime.getFormatDate(exeYrmon, defaultFormatDate, defaultFormatDate2);
		revYrmonFr = DateTime.getFormatDate(revYrmonFr, defaultFormatDate, defaultFormatDate2);
		revYrmonTo = DateTime.getFormatDate(revYrmonTo, defaultFormatDate, defaultFormatDate2);

	}catch(Exception e) {
		out.println(e.toString());
	}
%>


<script type="text/javascript">
var gJoCrrCd = "<%=joCrrCd%>";
var gTrdCd   = "<%=trdCd%>";
var gRlaneCd = "<%=rlaneCd%>";
var gBsaTpCd = "<%=bsaTpCd%>";
var gBsaTpNm = "<%=bsaTpNm%>";
var gYyyyMM  = "<%=yyyyMM%>";
var gExeYrmon = "<%=exeYrmon%>";
var gRevYrmonFr = "<%=revYrmonFr%>";
var gRevYrmonTo = "<%=revYrmonTo%>";
var gJoStlItmCd  = "<%=joStlItmCd%>";

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
<input type="hidden" name="ofc_cd" value="<%=strOfc_cd%>">
<input type="hidden" name="code">
<input type="hidden" name="name">
<input type="hidden" name="super_cd1">
<input type="hidden" name="super_cd2">
<input type="hidden" name="estm_cond_flg">
<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
		<button type="button" class="btn_accent" name="btn_retrieve" 		id="btn_retrieve">Retrieve</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_new" 			id="btn_new">New</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_downexcel" 			id="btn_downexcel">DownExcel</button>			
	</div>
	<!-- opus_design_btn(E) -->

	<!-- page_location(S) -->
	<div class="location">
		<!-- location 내용 동적생성 (별도 코딩 불필요) -->
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
				<td><input type="text" style="width:60px;" class="input1" dataformat="ym" maxlength="6" name="exe_yrmon" value="<%=exeYrmon%>" id="exe_yrmon" /><!--  
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
				<td><script type="text/javascript">ComComboObject('jo_stl_itm_cd', 1, 100, 0, 0);</script></td>
				<td>&nbsp;</td>
			</tr>
		</tbody>
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
	<table>
		<tbody>
			<colgroup>
				<col width="120px" />
				<col width="250px" />
				<col width="70px" />
				<col width="60px" />
				<col width="100px" />
				<col width="100px" />
				<col width="*" />
			</colgroup>
			<tr>
				<th>BSA Type</th>
				<td><script type="text/javascript">ComComboObject('jo_stl_jb_cd', 2,244, 1, 0);</script></td>
				<th>Option</th>
				<td><input type="radio" value="0" name="diff_option" id="diff_option" class="trans" checked onclick="diff_option_click();">&nbsp;ALL</td>
				<td><input type="radio" name="diff_option" value="1" class="trans"  onclick="diff_option_click();">&nbsp;More Than 0</td>
				<td><input type="radio" name="diff_option" value="2" class="trans"  onclick="diff_option_click();">&nbsp;Less or More Than 0</td>
				<td>&nbsp;</td>		
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
	<script type="text/javascript">ComSheetObject('sheet1');</script>
</div>
<!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->
				
</form>
