<%--
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0057.jsp
*@FileTitle  : Invoice Not Issued Inquiry by Customer
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/02
=========================================================*/
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.arinvoiceinquiry.event.FnsInv0057Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
    FnsInv0057Event  event = null;                  //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;     
    String strErrMsg = "";                  
    int rowCount     = 0;                   

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

        event = (FnsInv0057Event)request.getAttribute("Event");
        serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

        if (serverException != null) {
            strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
        }

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
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="pagetype" value="I" id="pagetype" />
<input type="hidden" name="user_ofc_cd" value="<%=strOfc_cd %>" id="user_ofc_cd" />
<input type="hidden" name="ofc_cd" id="ofc_cd" />
<input type="hidden" name="dp_prcs_knt" value="0" id="dp_prcs_knt" />

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
        <button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!--
     --><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!-- 
     --><button type="button" class="btn_normal" name="btn_downexcel" id="btn_downexcel">Down Excel</button>
    </div>
    <!-- opus_design_btn(E) -->

    <!-- page_location(S) -->
    <div class="location">
        <span id="navigation"></span>
    </div>
    <!-- page_location(E) -->
</div>
<!-- page_title_area(E) -->

<!-- wrap_search(S) -->
<div class="wrap_search">
    <!-- opus_design_inquiry(S) -->
    <div class="opus_design_inquiry wFit">
        <!--  biz_1 (S) -->
        <table>
            <colgroup>
                <col width="80"  />
                <col width="140" />
                <col width="70"  />
                <col width="60"  />
                <col width="74"  />
                <col width="110" />
                <col width="70"  />
                <col width="200" />
                <col width="60"  />
                <col width="" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Actual Cust.</th>
                    <td colspan="5"><input name="act_cust_cnt_cd" type="text" style="width:30px;" value="" class="input1" maxlength="2" dataformat="engup"><input name="act_cust_seq" type="text" style="width:69px;" value="" class="input1" maxlength="6" dataformat="num"><button type="button" class="input_seach_btn" name="btns_cust1" id="btns_cust1"></button><input name="cust_nm" type="text" style="width:260px;" class="input2" value="" readOnly="true"><button type="button" class="input_seach_btn" name="btns_cust2" id="btns_cust2"></button></td>
                    <th>Over Due</th>   
                    <td><input name="from_over_due" type="text" style="width:70px;text-align:right" value="-999" class="input1" maxlength="6" dataformat="num" otherchar="-">~<input name="to_over_due" type="text" style="width:70px;text-align:right" value="999" class="input1" maxlength="6" dataformat="num" otherchar="-"></td>
                    <th>Office</th>   
                    <td><script type="text/javascript">ComComboObject('ar_ofc_cd', 2, 80, 0, 1);</script></td>
                </tr>
                <tr>
                    <th>CRDT Limit</th>
                    <td><input name="cr_amt" type="text" style="width:132px;text-align:right" value="" class="input2" readOnly="true"></td>
                    <th>O/B Term</th>   
                    <td><input name="ob_cr_term_dys" type="text" style="width:50px;text-align:right" value="" class="input2" readOnly="true"></td>
                    <th>I/B Term</th>   
                    <td><input name="ib_cr_term_dys" type="text" style="width:52px;text-align:right" value="" class="input2" readOnly="true"></td>
                    <th>As of Date</th>   
                    <td><input type="text" name="as_of_date" dataformat="ymd" maxlength="8" style="width:80px" class="input1"><button type="button" class="calendar ir" name="btns_calendar" id="btns_calendar"></button></td>
                    <th>Option</th>   
                    <td><script type="text/javascript">ComComboObject('amount_option', 2, 80, 1, 1);</script></td>
                </tr>
            </tbody>
        </table>
        <!--  biz_1   (E) -->   
    </div>
    <!-- opus_design_inquiry(E) -->
</div>
<!-- wrap_search(E) -->

<!-- wrap_result(S) -->
<div class="wrap_result">
    <!-- opus_design_grid(S) -->
    <div class="opus_design_grid" >
        <script type="text/javascript">ComSheetObject('sheet1');</script>
    </div>
    <!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->

</form>

