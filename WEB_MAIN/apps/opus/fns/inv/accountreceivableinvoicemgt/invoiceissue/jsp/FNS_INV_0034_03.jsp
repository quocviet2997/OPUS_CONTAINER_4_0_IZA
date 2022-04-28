<%--
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0034_03.jsp
*@FileTitle  : Invoice Inquiry for Issue check
*@author     : CLT
*@version    : 1.0
*@since      : 2017/06/16
=========================================================*/
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.invoiceissue.event.FnsInv003403Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.framework.component.util.StringUtil" %>

<%
    FnsInv003403Event  event = null;                  //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;         // Errors from server.
    String strErrMsg = "";                      // Error message.
    int rowCount     = 0;                       // DB ResultSet list count
    
    String successFlag = "";
    String codeList  = "";
    String pageRows  = "100";

    String strUsr_id        = "";
    String strUsr_nm        = "";
    String strOfc_cd        = "";
    Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMgt.ARInvoiceInquiry");
    
    try {
        SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
        strUsr_id = account.getUsr_id();
        strUsr_nm = account.getUsr_nm();
        strOfc_cd = account.getOfc_cd();
        
        event = (FnsInv003403Event)request.getAttribute("Event");
        serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

        if (serverException != null) {
            strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
        }
        
        // Get data from server. ..
        GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
        
    }catch(Exception e) {
        out.println(e.toString());
    }
    
	String arOfcCd = StringUtil.xssFilter(request.getParameter("arOfcCd"));
	String vvd = StringUtil.xssFilter(request.getParameter("vvd"));
	String custCntCd = StringUtil.xssFilter(request.getParameter("custCntCd"));
	String custSeq = StringUtil.xssFilter(request.getParameter("custSeq"));
	String toDate = StringUtil.xssFilter(request.getParameter("toDate"));
	String bound = StringUtil.xssFilter(request.getParameter("bound"));
	String port  = StringUtil.xssFilter(request.getParameter("port"));
%>

<script type="text/javascript">
    function setupPage(){
        var errMessage = "<%=strErrMsg%>";
        if (errMessage.length >= 1) {
            showErrMessage(errMessage);
        } // end if
        loadPage();
    }
</script>

<form name="form">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
<input type="hidden" name="pagetype" value = "I">
<input type="hidden" name="user_ofc_cd" value="<%=arOfcCd%>">
<input type="hidden" name="office">
<input type="hidden" name="act_cust_cnt_cd" value="<%=custCntCd%>">
<input type="hidden" name="act_cust_seq" value="<%=custSeq%>">
<input type="hidden" name="to_date" value="<%=toDate%>">
<input type="hidden" name="vvd" value="<%=vvd%>">
<input type="hidden" name="bound" value="<%=bound%>">
<input type="hidden" name="port" value="<%=port%>">

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title"><span>Invoice Issue Check</span></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
	    <button type="button" class="btn_normal" name="btn_downexcel" id="btn_excel">Down Excel</button>
		<button type="button" class="btn_accent" name="btn_save" 	  id="btn_save">Select</button>
		<button type="button" class="btn_normal" name="btn_close" 	  id="btn_close">Close</button>
	</div>
	<!-- opus_design_btn(E) -->
	<!-- page_location(S) -->
</div>
<!-- page_title_area(E) -->

<!-- wrap_result(S) -->
<div class="wrap_result">
    <!-- opus_design_grid(S) -->
    <div class="opus_design_grid" >
        <script type="text/javascript">ComSheetObject('sheet1');</script>
    </div>
</div>
<!-- wrap_result(E) -->

</form>
