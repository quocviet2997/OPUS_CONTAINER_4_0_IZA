<%
/*=========================================================
*Copyright(c) 2009 CyberLogitec. All Rights Reserved.
*@FileName   FNS_JOO_0018.jsp
*@FileTitle  : AP CSR Creation Evidence PopUp
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/05
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.jointoperationconsultation.event.FnsJoo0018Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0018Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.JointOperationConsultation");
	
	String csrNo    = request.getParameter("csrNo")   ==null?"" :request.getParameter("csrNo");
	String vndrSeq  = request.getParameter("vndrSeq") ==null?"" :request.getParameter("vndrSeq");
	String editable = request.getParameter("editable")==null?"Y":request.getParameter("editable");
	String splyAmt  = request.getParameter("splyAmt") ==null?"0":request.getParameter("splyAmt");
	//for prohibiting Hangul broken
	request.setCharacterEncoding("euc-kr");
	String rowdata  = request.getParameter("rowdata") ==null?"" :request.getParameter("rowdata");

	String ofcList = "";
	String sysdate = JSPUtil.getKST("yyyyMMdd");
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0018Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
	
		ofcList = eventResponse.getETCData("ofc_list");
	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<script type="text/javascript">

var gVndrSeq  = "<%=vndrSeq%>";
var gCsrNo    = "<%=csrNo%>";
var gOfcList  = "<%=ofcList%>";
var gEditable = "<%=editable%>";
var gSysdate  = "<%=sysdate%>";
var gSplyAmt  = <%=splyAmt%>;
var gRowdata  = "<%=rowdata%>";

	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>
<style>
.col_br{border:1px solid #B8D6F6; }
</style>
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd">
<input type="hidden" name="pagerows" id="pagerows">
<input type="hidden" name="csr_no" id="csr_no" value="<%=csrNo%>">
<input type="hidden" name="code" id="code">

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<h2 class="page_title">&nbspAP CSR Creation - Evidence 입력 POP UP</h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<% if ("Y".equals(editable)){ %>
			<button class="btn_accent" name="btn_confirm" id="btn_confirm" type="button">Confirm</button>
		<% }else{ %> 
		<%}%><!--
		<% if ("Y".equals(editable)){ %>		
		--><button class="btn_normal" name="btn_cancel" id="btn_cancel" type="button">Cancel</button><!--
		<% }else{ %>
		<%}%>
		--><button class="btn_normal" name="btn_close" id="btn_close" type="button">Close</button>
	</div>
	<!-- opus_design_btn (E) -->
</div>
<!-- page_title_area(E) -->



<div class= "wrap_search">
<!-- opus_design_inquiry(S) -->
	<div class= "opus_design_inquiry wFit">
		<table  >
			<tbody>
				<colgroup>
					<col width="300"/>
					<col width="300"/>
					<col width="150"/>
					<col width="*"/>
				</colgroup>
				<tr>
					<th class="tr2_head col_br" style="text-align:center;">세금계산서 번호</th>
					<td class="col_br" style="background-color:white;">&nbsp;<input type="text" style="width:60px" class="input2" name="tax_inv_yrmon" dataformat="ym" onkeyup="taxBillNo_keyup()" >&nbsp;<!--  
						 --><script language="javascript">ComComboObject('ofc_cd',2,70,0,1);</script><!--
						 -->&nbsp;<input type="hidden" style="width:62px" class="input2" name="tax_ser_no"></td>
					<th  class="tr2_head col_br" style="text-align:center;">권 번호</th>
					<td  class="col_br" style="background-color:white;">&nbsp;&nbsp;<input type="text" style="width:80px" class="input2" name="kwon" readOnly>&nbsp;<b>권</b>&nbsp;&nbsp;&nbsp;<input type="text" style="width:80" class="input2" name="ho" readOnly>&nbsp;&nbsp;<b>호</b></td>
						
							
				</tr>
				<tr>
					<th class="tr2_head col_br" style="text-align:center;">Tax 구분</th>
					<td width="" class="col_br" style="background-color:white;">&nbsp;&nbsp;<input type="radio" value="1" class="trans" name="tax_div_cd" checked disabled>&nbsp;&nbsp;<b>개인</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" value="2" class="trans" name="tax_div_cd" disabled>&nbsp;&nbsp;<b>회사</b></td>
					<th class="tr2_head col_br" style="text-align:center;">매입세액불공제</th>
					<td width="" class="col_br" style="background-color:white;">&nbsp;&nbsp;<input type="radio" value="Y" class="trans" name="tax_naid_flg" checked disabled>&nbsp;&nbsp;<b>YES</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" value="N" class="trans" name="tax_naid_flg" disabled>&nbsp;&nbsp;<b>NO</b> </td>
				</tr>
				<tr>
					<th class="tr2_head col_br" style="text-align:center;">흑/적자 구분</th>
					<td class="col_br" style="background-color:white;">&nbsp;&nbsp;<input type="radio" value="B" class="trans" name="tax_pl_cd" checked> &nbsp;&nbsp;<b>흑자</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" value="R" class="trans" name="tax_pl_cd">&nbsp;&nbsp;<b>적자</b></td>
					<th class="tr2_head col_br " style="text-align:center;">고정자산여부</th>
					<td width="" class="col_br" style="background-color:white;">&nbsp;&nbsp;<input type="radio" value="Y" class="trans" name="fa_flg" checked disabled> &nbsp;&nbsp;<b>YES</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" value="N" class="trans" name="fa_flg" disabled> &nbsp;&nbsp;<b>NO</b> </td>
				</tr>
				<tr>
					<th class="tr2_head col_br" style="text-align:center;">Tax Type</th>
					<td class="col_br"style="background-color:white;">&nbsp;&nbsp;<input type="radio" value="1" class="trans" name="tax_vat_tp_cd" checked disabled> &nbsp;&nbsp;<b>영세</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" value="2" class="trans" name="tax_vat_tp_cd" disabled> &nbsp;&nbsp;<b>과세</b></td>
					<th class="tr2_head " style="text-align:center;">의제매출분</th>
					<td class="col_br" style="background-color:white;" >&nbsp;&nbsp;<input type="radio" value="Y" class="trans" name="tax_nsl_flg" checked disabled> &nbsp;&nbsp;<b>YES</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" value="N" class="trans" name="tax_nsl_flg" disabled> &nbsp;&nbsp;<b>NO</b> </td>
				</tr>
				<tr>
					<th class="tr2_head col_br" style="text-align:center;">세금계산서 발행 구분</th>
					<td class="col_br" style="background-color:white;">&nbsp;&nbsp;<input type="radio" value="ELECTRONIC" class="trans" name="doc_evid_tp_cd"> &nbsp;&nbsp;<b>전자</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" value="PAPER" class="trans" name="doc_evid_tp_cd"> &nbsp;&nbsp;<b>종이</b></td>
					<td class="tr2_head col_br "></td>
					<td class="col_br" style="background-color:white;"></td>
				</tr>
				<tr>
					<th class="tr2_head col_br" style="text-align:center;">사업자등록번호</th>
					<td width="" class="noinput2 col_br sm"><input type="text" style="width:100%" class="noinput2" name="spl_rgst_no" dataformat="saupja" readOnly></td>
				    <th class="tr2_head col_br" style="text-align:center;">VNDR Code </th>
					<td width="" class="noinput2 col_br sm"><input type="text" style="width:100%" class="noinput2" name="vndr_seq" value="<%=vndrSeq%>" readOnly></td>
				</tr>
				<tr>
					<th class="tr2_head col_br" style="text-align:center;">상 호</th>
					<td width="" class="noinput2 col_br sm"><input type="text" style="width:100%" class="noinput2" name="co_nm" readOnly></td>
				    <th class="tr2_head col_br" style="text-align:center;">대표자명</th>
					<td width="" class="noinput2 col_br sm"><input type="text" style="width:100%" class="noinput2" name="ownr_nm" readOnly></td>
				</tr>
				<tr>
					<th class="tr2_head col_br" style="text-align:center;">업 태</th>
					<td width="" class="noinput2 col_br sm"><input type="text" style="width:100%" class="noinput2" name="bzct_nm" readOnly></td>
				    <th class="tr2_head col_br" style="text-align:center;">종 목 </th>
					<td class="noinput2 col_br sm"><input type="text" style="width:100%" class="noinput2" name="bztp_nm" readOnly></td>
				</tr>
				<tr>
					<th class="tr2_head col_br " style="text-align:center;">주 소</th>
					<td colspan="3" class="noinput2 col_br sm"><input type="text" style="width:100%" class="noinput2" name="spl_addr" readOnly></td>
				</tr>
			</tbody>
		</table>
	<table class="height_5"><tr><td></td></tr></table>
	<table>
		<colgroup>
			<col width="60"/>
			<col width="100"/>
			<col width="35"/>			
			<col  width="100"/>
			<col width="60"/>
			<col width="100"/>
			<col width="35"/>
			<col width="100"/>
			<col width="50"/>		
			<col width="*" />
		</colgroup>
		<tbody>
		<tr >
			<th>발행일자</th>
			<td><input type="text" style="width:80px;" class="input" name="iss_dt" dataformat="ymd" maxlength="8" id="iss_dt" /> </td>
			<th>환율</th>
			<td><input type="text" style="width:80px;text-align:right" class="input2" name="jo_xch_rt" dataformat="float" id="jo_xch_rt" /> </td>
			<th>공급가액</th>
			<td><input type="text" style="width:120px;text-align:right" class="input2" name="spl_amt" dataformat="float" readonly id="spl_amt" /> </td>
			<th>세액</th>
			<td><input type="text" style="width:80px;text-align:right" class="input2" name="tax_amt" dataformat="float" readonly id="tax_amt" /> </td>
			<th>총 합계</th>
			<td><input type="text" style="width:180px;text-align:right" class="input2" name="ttl_amt" dataformat="float" readonly id="ttl_amt" /> </td>
		</tr>  
			
		</tbody>
	</table>
	<table class="line_bluedot"><tr><td></td></tr></table>
	
	
	</div>
</div>
<!-- opus_design_inquiry (E) -->

<!-- opus_design_grid(S) -->
<div class="wrap_result bg">		
	<div class="opus_design_grid" >	
			<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>
		
		<div class="opus_design_grid" >
			<script type="text/javascript">ComSheetObject('sheet2');</script>
		</div>

</div>
<!-- opus_design_grid(E) -->
<%@include file="/bizcommon/include/common_opus.jsp"%>
 </form>
