<%--
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0029.jsp
*@FileTitle  : Manual System Clear
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/03
=========================================================*/
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.arinvoicecorrection.event.FnsInv0029Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="java.util.List"%>

<%
    FnsInv0029Event  event = null;                  //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;         // Errors from server.
    String strErrMsg = "";                      // Error message.
    int rowCount     = 0;                       // DB ResultSet list count

    String successFlag = "";
    String codeList  = "";
    String pageRows  = "100";

    String strUsr_id        = "";
    String strUsr_nm        = "";
    Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMgt.BookingARCreation");

    try {
        SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
        
        
        strUsr_id = account.getUsr_id();
        strUsr_nm = account.getUsr_nm();
        
        event = (FnsInv0029Event)request.getAttribute("Event");
        serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

        if (serverException != null) {
            strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
        }

        // Get data from server. ..
        GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

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

<form name="form">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">

<input type="hidden" name="pagetype" value = "E">
<input type="hidden" name="ofc_cd">
<input type="hidden" name="ots_smry_cd">

<!-- page_title_area(S) -->
<div class="page_title_area clear">
    <!-- page_title(S) -->
    <h2 class="page_title">
        <button type="button">
            <span id="title"></span>
        </button>
    </h2>
    <!-- page_title(E) -->

    <!-- opus_design_btn(S) -->
    <div class="opus_design_btn">
        <button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!--
         --><button type="button" class="btn_normal" name="btn_execute" id="btn_execute">Execute</button>
    </div>
    <!-- opus_design_btn(E) -->

    <!-- page_location(S) -->
    <div class="location">
        <span id="navigation"></span>
    </div>
    <!-- page_location(E) -->
</div>
<!-- page_title_area(E) -->

<!-- wrap_result(S) -->
<div class="wrap_search_tab">
    <!-- opus_design_inquiry(S) -->
    <div class="opus_design_inquiry">
        <!--  biz_1 (S) -->
        <table>
            <colgroup>
                <col width="80"  />
                <col width="" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Office</th>
                    <td><script type="text/javascript">ComComboObject('ar_ofc_cd', 1, 110, 0, 1);</script></td>
                </tr>
                <tr>
                    <th>B/L No.</th>
                    <td><input name="bl_src_no" type="text" style="width:110px;" class="input1" dataformat="engup" maxlength="12" value=""></td>
                </tr>
                <tr>
                    <th title="Vessel Voyage Direction">VVD</th>
                    <td><input name="vvd_cd" type="text" style="width:110px;;" class="input1" maxlength="9" minlength="9" value="" dataformat="engup"></td>
                </tr>
                <tr>
                    <th>Customer</th>
                    <td><input name="cust_cnt_cd" type="text" style="width:25px;" class="input1" value="" maxlength="2" dataformat="engup"><!--
                    --><input name="cust_seq" type="text" style="width:58px;" class="input1" maxlength="6" value="" dataformat="num"><button type="button" class="input_seach_btn" name="btns_cust1" id="btns_cust1"></button><!--
                    --><input name="cust_nm" type="text" style="width:350px;" class="input2" value="" readonly tabIndex="-1"><button type="button" class="input_seach_btn" name="btns_cust2" id="btns_cust2"></button></td>
                </tr>
                <tr class="line_bluedot"><td colspan="2" height="15"></td></tr>
                <tr>
                    <th>Total Count</th>
                    <td><input name="total_count" type="text" style="width:110px; text-align:right;" class="input2" value="" readOnly></td>
                </tr>
            </tbody>
        </table>
        <!--  biz_1   (E) -->   
    </div>
    <!-- opus_design_inquiry(E) -->
	</div>

	<div class="wrap_result">
	    <!-- opus_design_grid(S) -->
	    <div class="opus_design_grid" style="display:none">
	        <script type="text/javascript">ComSheetObject('sheet1');</script>
	    </div>
	    <!-- opus_design_grid(E) -->
	</div>
<!-- wrap_result(E) -->

</form>
