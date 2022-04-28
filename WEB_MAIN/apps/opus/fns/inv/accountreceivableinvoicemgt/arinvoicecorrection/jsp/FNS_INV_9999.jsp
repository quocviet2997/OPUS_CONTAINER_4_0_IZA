<%--
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_9999.jsp
*@FileTitle  : Manual Interface
*@author     : CLT
*@version    : 1.0
*@since      : 2015/08/13
=========================================================*/
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.arinvoicecorrection.event.FnsInv9999Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
    FnsInv9999Event  event = null;                  //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;         // Errors from server.
    String strErrMsg = "";                      // Error message.
    int rowCount     = 0;                       // DB ResultSet list count
    
    String successFlag = "";
    String codeList  = "";
    String pageRows  = "100";

    String strUsr_id        = "";
    String strUsr_nm        = "";
    Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMgt.ARInvoiceCorrection");
    
    try {
        SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
        strUsr_id = account.getUsr_id();
        strUsr_nm = account.getUsr_nm();
       
       
        event = (FnsInv9999Event)request.getAttribute("Event");
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

<script language="javascript">
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
<input type="hidden" name="man_div_ind">
<input type="hidden" name="pagetype" value = "I">
<input type="hidden" name="backendjob_key">

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
         --><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button>
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
                <col width="1"  />
                <col width="50" />
                <col width="75"  />
                <col width="50" />
                <col width="90"  />
                <col width="90" />
                <col width="90"  />
                <col width="" />
            </colgroup>
            <tbody>
                <tr>
                    <th>I/F Date</th>
                    <td colspan="3">
                        <input type="text" class="input1" style="width: 80px;" name="fm_if_dt" dataformat="ymd" cofield="to_if_dt"><button type="button" class="calendar ir" name="btns_calendar1" id="btns_calendar1"></button>&nbsp;~&nbsp;
                        <input type="text" class="input1" style="width: 80px;" name="to_if_dt" dataformat="ymd" cofield="fm_if_dt"><button type="button" class="calendar ir" name="btns_calendar2" id="btns_calendar2"></button>
                    </td>
                    <td colspan="5" align="left" style="padding-left:63px;">
                        <h3>※ If nothing retrieved, input bkg no and then click on 'Re-interface from BKG/DOC'.</h3>
                    </td>
                </tr>
                <tr>
                    <th>Trunk VVD</th>
                    <td><input type="text" class="input1" style="width: 80px;" name="trnk_vvd" class="input" maxlength="9" fullinput dataformat="engup"></td>
                    <th>B/L No. </th>
                    <td><input type="text" class="input1" style="width: 100px;" class="input" name="bl_src_no" maxlength="12"   fullinput dataformat="engup"></td>
                    <th title="Port of Loading">POL</th>
                    <td><input type="text" style="width: 73px;" name="pol_cd" value="" class="input" maxlength="5" fullinput dataformat="engup"></td>
                    <th title="Port of Discharging">POD</th>
                    <td><input type="text" style="width: 73px;" name="pod_cd" value="" class="input" maxlength="5" fullinput dataformat="engup"></td>
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
    <div class="opus_design_grid" id="grid_sheet1" >
        <script language="javascript">ComSheetObject('sheet1');</script>
    </div>
    <!-- opus_design_grid(E) -->
    <!-- opus_design_grid(S) -->
    <div class="opus_design_grid" id="grid_sheet2" style="display:none;" >
        <script language="javascript">ComSheetObject('sheet2');</script>
    </div>
    <!-- opus_design_grid(E) -->

    <!-- opus_design_inquiry(S) -->
    <div class="opus_design_inquiry wFit">
        <!--  biz_1 (S) -->
        <table>
            <colgroup>
                <col width="1"  />
                <col width="100" />
                <col width="100" />
                <col width="100" />
                <col width="45" />
                <col width="55" />
                <col width="45" />
                <col width="55" />
                <col width="" />
            </colgroup>
            <tbody>
                <tr>
                    <th>BKG No.</th>
                    <td><input type="text" class="input1" style="width: 130px;" name="bkg_no" maxlength="13" fullinput dataformat="engup"></td>
                    <th>Trunk VVD</th>
                    <td><input type="text" class="input1" style="width: 85px;" name="vvd" class="input" maxlength="9" fullinput dataformat="engup"></td>
                    <th title="Port of Loading">POL</th>
                    <td><input type="text" class="input1" style="width: 55px;" name="pol" class="input" maxlength="5" fullinput dataformat="engup"></td>
                    <th title="Port of Discharging">POD</th>
                    <td><input type="text" class="input1" style="width: 55px;" name="pod" class="input" maxlength="5" fullinput dataformat="engup"></td>                                                
                    <td><button type="button" class="btn_etc" name="btn_ifbkg" id="btn_ifbkg">Re-interface from BKG/DOC</button></td>
                    <td><button type="button" class="btn_etc" name="btn_loadExcel" id="btn_loadExcel">Load Excel</button></td><!-- 2018.10.01 -->
                    <td><button type="button" class="btn_etc" name="btn_multi_ifbkg" id="btn_multi_ifbkg">Multi Re-interface from BKG/DOC</button></td> <!-- 2018.10.01 -->
                    <td><input name="erp_send_chk" id="erp_send_chk" type="checkbox" value="" class="trans"  onblur="fn_erp_send_chk();"> No ERP SEND
                    <input name="erp_send_flg" id="erp_send_flg" type="hidden" value="N" ></td> <!-- 2018.10.01 -->
                    </td>
                </tr>
            </tbody>
        </table>
        <!--  biz_1   (E) -->                 
        <!--  biz_1 (S) -->
        <table>
            <colgroup>
                <col width="54"  />
                <col width="305" />
                <col width="150" />
                <col width="80" />
                <col width="80" />
                <col width="80" />
                <col width="55" />
                <col width="" />
            </colgroup>
            <tbody>
                <tr>
                    <th>I/F No.</th>
                    <td><input type="text" class="input1" style="width: 300px;" name="ar_if_no" id="ar_if_no"></td>
                    <td><button type="button" class="btn_etc" name="btn_erp" id="btn_erp">Send to OTS</button></td>
                    <!--<td width="140"><button type="button" class="btn_etc" name="btn_erpU" id="btn_erpU">Send to ERP(U)</button></td>-->
                    <td><button type="button" class="btn_etc" name="btn_cancel" id="btn_cancel">Manual Cancel</button></td>
                    <td width="80">Cxl Split Cust<input name="cxl_cust_chk" id="cxl_cust_chk" type="checkbox" value="" class="trans"  onblur="fn_cxl_cust_chk();">
                    <input name="cxl_cust_flg" id="cxl_cust_flg" type="hidden" value="N" ></td>
                    <td>&nbsp;&nbsp;</td>
                    <th>SRC I/F Date</th>
                    <td><input type="text" class="input1" style="width: 70px;" name="src_if_dt" id="src_if_dt"></td>
                    <th>SRC I/F Seq.</th>
                    <td><input type="text" class="input1" style="width: 50px;" name="src_if_seq" id="src_if_seq"></td>
                    <td><button type="button" class="btn_etc" name="btn_otherif" id="btn_otherif">OTHER I/F</button></td>
                </tr>
            </tbody>
        </table>
        <!--  biz_1   (E) -->                         
    </div>
    <!-- opus_design_inquiry(E) -->
</div>
<!-- wrap_result(E) -->

</form>
