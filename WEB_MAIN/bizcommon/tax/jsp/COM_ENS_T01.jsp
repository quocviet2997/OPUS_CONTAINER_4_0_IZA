<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   COM_ENS_T01.jsp
*@FileTitle  : Region 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/03
=========================================================
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.tax.event.ComEnsT01Event"%>
<%@ page import="com.clt.bizcommon.tax.vo.ComTaxVO"%>
<%
	ComEnsT01Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";								 //에러메세지
	int rowCount	 = 0;
	int iMaxLen		= 20;
	int iPontCount	= 2;

	String strUsr_id = "";
	String strUsr_nm = "";
	
	//String mdm_yn = JSPUtil.getParameter(request, "mdm_yn".trim(), "");
	//String delt_flg = JSPUtil.getParameter(request, "delt_flg".trim(), "");
	String vndrSeq = "";
	String sgstAmt = "";
	String cgstAmt = "";
	String igstAmt = "";
	String cessAmt = "";
	String vatAmt = "";
	String whld2Amt = "";
	String gsttdsAmt = "";
	String whldAmt = "";
	String viewFlg = "";
	String svcAcctgCd = "";
	
	try {
		SignOnUserAccount account = (SignOnUserAccount) session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id = account.getUsr_id();
		strUsr_nm = account.getUsr_nm();

		event = (ComEnsT01Event) request.getAttribute("Event");
		serverException = (Exception) request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		vndrSeq = JSPUtil.getParameter(request, "vndr_seq".trim(), "");
		sgstAmt = JSPUtil.getParameter(request, "sgst_amt".trim(), "");
		cgstAmt = JSPUtil.getParameter(request, "cgst_amt".trim(), "");
		igstAmt = JSPUtil.getParameter(request, "igst_amt".trim(), "");
		cessAmt = JSPUtil.getParameter(request, "cess_amt".trim(), "");
		vatAmt = JSPUtil.getParameter(request, "vat_amt".trim(), "");
		whld2Amt = JSPUtil.getParameter(request, "whld2_amt".trim(), "");
		gsttdsAmt = JSPUtil.getParameter(request, "gsttds_amt".trim(), "");
		whldAmt = JSPUtil.getParameter(request, "whld_amt".trim(), "");
		viewFlg = JSPUtil.getParameter(request, "view_flg".trim(), "");	
		svcAcctgCd = JSPUtil.getParameter(request, "svc_acctg_cd".trim(), "");	
		
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<script type="text/javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<!-- 
showErrMessage를 써주지 않으면 에러 발생시 처리가 불가합니다.
그리고 지금은 showErrMessage()으로 되어있지만 추후에 고객님이 변덕을 일으켜서 웹페이지를 호출하라고 할경우를 
대비해서 직접 showErrMessage() 하지 마시고 꼭 showErrMessage를 써주십시오. 한방에 바꾸게요. 표준을 안따르면 나중에 후회합니다.  
-->

<form name="form" id="form" onkeyup="ComKeyEnter('lengthnextfocus');">
<input type="hidden" name="f_cmd" id="f_cmd"> 
<input type="hidden" name="vndr_seq" id="vndr_seq" value="<%=vndrSeq%>">
<input type="hidden" name="view_flg" id="view_flg" value="<%=viewFlg%>">
<input type="hidden" name="p_svc_acctg_cd" id="p_svc_acctg_cd" value="<%=svcAcctgCd%>">

<!-- layer_popup_title(S) -->
<div class="layer_popup_title">
    <!-- page_title_area(S) -->
    <div class="page_title_area clear">
        <!-- page_title(S) -->
        <h2 class="page_title"><span>India TAX</span></h2>
        <!-- page_title(E) -->
            
        <!-- opus_design_btn(S) -->
        <div class="opus_design_btn">
            <button type="button" class="btn_accent" name="btn_apply" id="btn_apply">Apply</button><!--
			 --><button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button>
        </div>
        <!-- opus_design_btn(E) --> 
    </div>
    <!-- page_title_area(E) -->
</div>
<!-- layer_popup_title(E) -->

<!-- popup_contens_area(S) -->
<div class="layer_popup_contents coupled_btn_normal2">

	<div class="wrap_result">
		<!-- opus_design_inquiry(S) -->
		<div class="opus_design_inquiry sm">
			<h3 class="title_design2">Vendor Master</h3>
			<!--  MiniLayer (S) -->
			<table>
				<colgroup>
					<col width="100px" />
					<col width="250px" />
					<col width="5px" />
					<col width="5px" />
					<col width="*" />
				</colgroup>
				<tbody>
					<tr>
						<th>ONE GST</th>
						<td colspan="3">
							<input type="text" class="input2" style="width: 250px;" name="ida_gst_no" id="ida_gst_no" value="" readonly>
						</td>
						<td></td>
					</tr>
					<tr>
						<th>Vendor GST</th>
						<td colspan="3">
							<input type="text" class="input2" style="width: 250px;" name="vndr_gst_no" id="vndr_gst_no" value="" readonly>
						</td>
						<td></td>
					</tr>
					<tr>
						<th>Vendor SAC</th>
						<td colspan="3">
							<script type="text/javascript">ComComboObject('cmb_svc_acctg_cd', 4, 250, 1, 1);</script>
							<!-- <input type="text" class="input2" style="width: 250px;" name="svc_acctg_cd" id="svc_acctg_cd" value="" readonly> -->
						</td>
						<td></td>
					</tr>
				</tbody>
			</table>
		</div>
		<table class="line_bluedot"><tr><td></td></tr></table>
		
		<!-- opus_design_inquiry(S) -->
		<div class="opus_design_inquiry sm wFit">
			<h3 class="title_design2">V.A.T</h3>
			<!--  MiniLayer (S) -->
			<table>
				<colgroup>
					<col width="100px" />
					<col width="140px" />
					<col width="80px" />
					<col width="140px" />
					<col width="*" />
				</colgroup>
				<tbody>
					<tr>
						<th>SGST</th>
						<td>
							<input type="text" class="input" style="text-align:right;ime-mode:disabled;" name="sgst_amt" id="sgst_amt" dataformat="singledfloat" pointcount="<%=iPontCount %>" maxlength="<%=iMaxLen %>" value="<%=sgstAmt %>" >
						</td>
						<th>CGST</th>
						<td>
							<input type="text" class="input" style="text-align:right;ime-mode:disabled;" name="cgst_amt" id="cgst_amt" dataformat="singledfloat" pointcount="<%=iPontCount %>" maxlength="<%=iMaxLen %>" value="<%=cgstAmt %>" >
						</td>
						<td></td>
					</tr>
					<tr>
						<th>IGST</th>
						<td>
							<input type="text" class="input" style="text-align:right;ime-mode:disabled;" name="igst_amt" id="igst_amt" dataformat="singledfloat" pointcount="<%=iPontCount %>" maxlength="<%=iMaxLen %>" value="<%=igstAmt %>" >
						</td>
						<th>CESS</th>
						<td>
							<input type="text" class="input" style="text-align:right;ime-mode:disabled;" name="cess_amt" id="cess_amt" dataformat="singledfloat" pointcount="<%=iPontCount %>" maxlength="<%=iMaxLen %>" value="<%=cessAmt %>" >
						</td>
						<td></td>
					</tr>
					<tr>
						<th>Amount(V.A.T)</th>
						<td>
							<input type="text" class="input2" style="text-align:right;ime-mode:disabled;" name="vat_amt" id="vat_amt" dataformat="singledfloat" pointcount="<%=iPontCount %>" maxlength="<%=iMaxLen %>" value="" readonly>
						</td>
						<td colspan="3">( SGST + CGST + IGST + CESS )</td>
					</tr>
				</tbody>
			</table>
		</div>
		<table class="line_bluedot"><tr><td></td></tr></table>
		
		<!-- opus_design_inquiry(S) -->
		<div class="opus_design_inquiry sm wFit">
			<h3 class="title_design2">W.H.T</h3>
			<!--  MiniLayer (S) -->
			<table>
				<colgroup>
					<col width="100px" />
					<col width="140px" />
					<col width="80px" />
					<col width="140px" />
					<col width="*" />
				</colgroup>
				<tbody>
					<tr>
						<th>W.H.T</th>
						<td>
							<input type="text" class="input" style="text-align:right;ime-mode:disabled;" name="whld2_amt" id="whld2_amt" dataformat="singledfloat" pointcount="<%=iPontCount %>" maxlength="<%=iMaxLen %>" value="<%=whld2Amt %>" >
						</td>
						<th>GST TDS</th>
						<td>
							<input type="text" class="input" style="text-align:right;ime-mode:disabled;" name="gsttds_amt" id="gsttds_amt" dataformat="singledfloat" pointcount="<%=iPontCount %>" maxlength="<%=iMaxLen %>" value="<%=gsttdsAmt %>" >
						</td>
						<td></td>
					</tr>
					<tr>
						<th>Amount(W.H.T)</th>
						<td>
							<input type="text" class="input2" style="text-align:right;ime-mode:disabled;" name="whld_amt" id="whld_amt" dataformat="singledfloat" pointcount="<%=iPontCount %>" maxlength="<%=iMaxLen %>" value="" readonly>
						</td>
						<td colspan="3">( W.H.T + GST TDS )</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="opus_design_grid"  style="display:none">
			<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>
	</div>
</div>	
</form>
<SCRIPT LANGUAGE="javascript">
<!--
//format를 잡아 주기 위해서 재설정한다.
$( document ).ready(function() {
	$('input').each(function(index, item){
		var attr = $(item).attr('dataformat');
		if(attr === "singledfloat" || attr === "float" ||  attr === "num" || attr === "int"){
			var val = $(item).val();
			$(item).val(ComAddComma(val));
		}
	});
	/* 
	 var attr = $('button.pop_close').attr('onclick');
	 var checkClosBtn = (typeof attr !== typeof undefined && attr !== false && attr == closeEvent);
	 if (checkClosBtn) {
   	 $('button.pop_close').removeAttr('onclick');
   	 $('button.pop_close').click(function() {
   		 if (checkClosBtn) {
   			 getPrecheckClosePopup();
   			 (new Function(attr))(); 
			 }
		 });
	 } */
});
-->
</script>
