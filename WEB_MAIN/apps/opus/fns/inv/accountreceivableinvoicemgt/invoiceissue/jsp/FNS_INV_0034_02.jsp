<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0034_02.jsp
*@FileTitle  : Invoice Issue (Email)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/31
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.invoiceissue.event.FnsInv003402Event"%>
<%@ page import="org.apache.log4j.Logger"%>
<%@ page import="com.clt.framework.core.config.SiteConfigFactory"%>
<%@ page import="com.clt.framework.component.util.StringUtil" %>
<%
	FnsInv003402Event event = null; //PDTO(Data Transfer Object including Parameters)
	Exception serverException = null; // Errors from server.
	String strErrMsg = ""; // Error message.
	int rowCount = 0; // DB ResultSet list count

	String successFlag = "";
	String codeList = "";
	String pageRows = "100";

	String strUsr_id = "";
	String strUsr_nm = "";
	String strUsr_eml = "";
	String loginOfcCd = "";
	Logger log = Logger
			.getLogger("com.clt.apps.AccountReceivableInvoiceMgt.InvoiceIssue");

	try {
		SignOnUserAccount account = (SignOnUserAccount) session
				.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id = account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		strUsr_eml = account.getUsr_eml();
		loginOfcCd = account.getOfc_cd();

		event = (FnsInv003402Event) request.getAttribute("Event");
		serverException = (Exception) request
				.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException)
					.loadPopupMessage();
		}

		// Get data from server. ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request
				.getAttribute("EventResponse");

	} catch (Exception e) {
		out.println(e.toString());
	}

	String subject = "";
	String fileKey = "";
	String content = "";
	String invMltBlIssFlg = "";
	//2014.10.16 INV Form logic change by IY Cho
	String otsSmryCd = "";
	String issGrpTpCd = "";
	String officeCntCd = "";
	String taxCntFlg = "";
	
	fileKey = StringUtil.xssFilter(request.getParameter("fileKey"));

	String issueGubn = "";
	issueGubn = StringUtil.xssFilter(request.getParameter("issueGubn"));
	invMltBlIssFlg = StringUtil.xssFilter(request.getParameter("invMltBlIssFlg"));
	otsSmryCd = StringUtil.xssFilter(request.getParameter("otsSmryCd"));
	officeCntCd = StringUtil.xssFilter(request.getParameter("officeCntCd"));
	taxCntFlg = StringUtil.xssFilter(request.getParameter("taxCntFlg"));
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

<form name="form">
    <input type="hidden" name="f_cmd" id="f_cmd" />
    <input type="hidden" name="pagerows" id="pagerows" />
    <input type="hidden" name="invs" id="invs" />
    <input type="hidden" name="inv_nos" id="inv_nos" />
    <input type="hidden" name="f_inv" id="f_inv" />
    <input type="hidden" name="t_inv" id="t_inv" />
    <input type="hidden" name="flag" id="flag" />
    <input type="hidden" name="copy_cnt" id="copy_cnt" />
    <input type="hidden" name="iss_ofc_cd" id="iss_ofc_cd" />
    <input type="hidden" name="user_nm" value="<%=strUsr_nm%>" id="user_nm" />
    <input type="hidden" name="from" value="<%=strUsr_eml%>" id="from" />
    <input type="hidden" name="recipient" value="" id="recipient" />
    <input type="hidden" name="carbonCopy" id="carbonCopy" />
    <input type="hidden" name="blindCarbonCopy" id="blindCarbonCopy" />
    <input type="hidden" name="subject" value="" id="subject" />
    <input type="hidden" name="content" value="" id="content" />
    <input type="hidden" name="argument" id="argument" />
    <input type="hidden" name="template" id="template" />
    <input type="hidden" name="attach" id="attach" />
    <input type="hidden" name="send_flag" id="send_flag" />
    <input type="hidden" name="inv_no" id="inv_no" />
    <input type="hidden" name="inv_iss_rmk" id="inv_iss_rmk" />
    <input type="hidden" name="cust_eml" id="cust_eml" />
    <input type="hidden" name="cust_fax_no" id="cust_fax_no" />
    <input type="hidden" name="if_no" id="if_no" />
    <input type="hidden" name="cre_usr_id" value="<%=strUsr_id%>" id="cre_usr_id" />
    <input type="hidden" name="issue_gubn" value="<%=issueGubn%>" id="issue_gubn" />
    <input type="hidden" name="state" id="state" />
    <input type="hidden" name="rd_name" id="rd_name" />
    <input type="hidden" name="com_mrdPath" id="com_mrdPath" />
    <input type="hidden" name="com_mrdArguments" id="com_mrdArguments" />
    <input type="hidden" name="issueCnt" id="issueCnt" />
    <input type="hidden" name="login_ofc_cd" value="<%=loginOfcCd%>" id="login_ofc_cd" />
    <input type="hidden" name="print_nm" id="print_nm" />
    <input type="hidden" name="send_flag2" id="send_flag2" />
    <input type="hidden" name="logo_gb" id="logo_gb" />
    <input type="hidden" name="iss_fr" id="iss_fr" />
    <input type="hidden" name="inv_mlt_bl_iss_flg" value="<%=invMltBlIssFlg%>" id="inv_mlt_bl_iss_flg" />
    <input type="hidden" name="ots_smry_cd" value = "<%=otsSmryCd%>" id="ots_smry_cd" />
    <input type="hidden" name="office_cnt_cd" value = "<%=officeCntCd%>" id="office_cnt_cd" />
    <input type="hidden" name="tax_cnt_flg" value = "<%=taxCntFlg%>" id="tax_cnt_flg" />
    
<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title"><span>Invoice Issue (Email)</span></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
		<button type="button" class="btn_accent" name="btn_preview" 	id="btn_preview">Preview</button><!--  
		--><button type="button" class="btn_normal" name="btn_send"  		id="btn_send">Send</button><!--  
		--><button type="button" class="btn_normal" name="btn_close" 		id="btn_close">Close</button><!--  
		--><span id="btn_close" name="btn_close"><input type="button" name="downbtn" style="border-width: 0px; background: spacer.gif" onclick="form2.submit();"></span>
	</div>
	<!-- opus_design_btn(E) -->
	<!-- page_location(S) -->
</div>
<!-- page_title_area(E) -->
<div class= "wrap_search">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry wFit">
		<table>
			<colgroup>
				<col width="50" />
				<col width="20" />
				<col width="70" />
				<col width="70" />
				<col width="70" />
				<col width="130" />
				<col width="200" />
				<col width="*" />
			</colgroup>
			<tbody>
				<tr>
					<th class="sm">Send By</th>
					<td class="sm"></td>
					<td class="sm"><input type="radio" value="P" name="send_type" class="trans" checked onClick="sendTypeChk();">Paper</td>
					<td class="sm"><input type="radio" value="E" name="send_type" class="trans" onClick="sendTypeChk();">E-mail</td>
					<td class="sm"><input type="radio" value="F" name="send_type" class="trans" onClick="sendTypeChk();">Fax</td>
					<td class="sm"><input type="radio" value="PE" name="send_type" class="trans" onClick="sendTypeChk();">Paper+E-mail</td>
					<td class="sm"><input type="radio" value="PE2" name="send_type" class="trans" onClick="sendTypeChk();">Paper(Original)+E-mail(Copy)</td>
					<td><img src="img/btns_help.gif" onMouseover="showHelp();" onMouseout="hideHelp()" ; align="absmiddle"></td>
				</tr>
				<tr class="h23">
					<td  id="layer1" name="layer1" ></td>
					<td colspan="4" class="stm" id="layer2" style="display: none">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" value="P" name="logo_gb1" class="trans" id="logo_gb1" onClick="logoGbChk();"/>COPIE CERTIFIEE CONFORME A L'ORIGINAL
						&nbsp;&nbsp;&nbsp;<input type="checkbox" value="P" name="logo_gb2" class="trans" checked onClick="logoGbChk();">COPIE</td>
				</tr>
			</tbody>
		</table>
	</div>	
</div>
<div class="wrap_result">
	<!-- opus_tab_btn(S) -->
	<div class="opus_design_grid clear">
		<script type="text/javascript">ComSheetObject("sheet1");</script>
	</div>
    <div id="help_layer" style="position: absolute; visibility: hidden; border: 1px solid black; font-family: Arial; font-size: 12px; color: #3e3e3e; font-weight: normal; layer-background-color: lightyellow; background-color: lightyellow; padding: 1px"></div>
	<div style="display:none">
		<script type="text/javascript">ComUploadObject('upload1', '<%=session.getId()%>');</script>
	</div>	
</div>
</form>

<form name="form2" action="/opuscntr/FileDownload" method="post"
	target="_new"><input type="hidden" name="key" size="55">
</form>
