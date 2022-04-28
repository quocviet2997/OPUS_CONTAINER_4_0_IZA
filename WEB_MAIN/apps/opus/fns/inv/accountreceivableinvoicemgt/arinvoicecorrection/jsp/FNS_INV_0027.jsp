<%--
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0027.jsp
*@FileTitle  : Ex Rate Update by Date or VVD
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/05
=========================================================*/
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.arinvoicecorrection.event.FnsInv0027Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
    FnsInv0027Event  event = null;                  //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;         
    String strErrMsg = "";                      
    int rowCount     = 0;                       
    
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
       
       
        event = (FnsInv0027Event)request.getAttribute("Event");
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
            showErrMessage(errMessage);
        } // end if
        loadPage();
    }
</script>

<form name="form">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
<input type="hidden" name="ofc">
<input type="hidden" name="ofc_cd">
<input type="hidden" name="pagetype" value = "I">
<input type="hidden" name="cust_cnt_cd">
<input type="hidden" name="cust_seq">
<input type="hidden" name="backendjob_key">
<input type="hidden" name="office_cnt_cd" id="office_cnt_cd" />

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
         --><button type="button" class="btn_normal" name="btn_run" id="btn_run">Run</button><!-- 
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

<!-- wrap_result(S) -->
<div class="wrap_result">
    <!-- opus_design_inquiry(S) -->
    <div class="opus_design_inquiry">
        <!--  biz_1 (S) -->
        <table>
            <colgroup>
                <col width="100"  />
                <col width="100"  />
                <col width="" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Office</th>
                    <td width=""><script type="text/javascript">ComComboObject('ar_ofc_cd', 1, 100, 1,1);</script></td>
                    <td></td>
                </tr>
                <tr>
                    <th>Option</th>
                    <td class="sm"><input type="radio" name="run_opt" value="N" class="trans" checked onClick="javascript:chkOption(this.value)"><label>No Good</label><input type="radio" name="run_opt" value="V" class="trans" onClick="javascript:chkOption(this.value)"><label>VVD</label><input type="radio" name="run_opt" value="C" class="trans" onClick="javascript:chkOption(this.value)"><label>Customer</label><input type="radio" name="run_opt" value="B" class="trans" onClick="javascript:chkOption(this.value)"><label>B/L</label></td>
                    <td></td>
                </tr>
            </tbody>
        </table>
        <!--  biz_1   (E) -->   
        <table class="line_bluedot"><tr><td colspan="6"></td></tr></table>
        <!--  biz_1 (S) -->
        <table>
            <colgroup>
                <col width="100"  />
                <col width="230"  />
                <col width="100"  />
                <col width="" />
            </colgroup>
            <tbody>
                <tr>
                    <th id="dt_name">Interface Date</th>
                    <td><input type="text" style="width: 80px;" name="fm_if_dt" dataformat="ymd" cofield="to_if_dt" onBlur="fn_ComGetMaskedValue('fm_if_dt');" maxlength="10" onKeyUp="javascript:checkFmDtLeng(this.value)" class="input1"><button type="button" class="calendar ir" name="btns_calendar1" id="btns_calendar1"></button>~&nbsp;<input type="text" style="width: 80px;" name="to_if_dt" dataformat="ymd" cofield="fm_if_dt" onBlur="fn_ComGetMaskedValue('to_if_dt');" maxlength="10" class="input1"><button type="button" class="calendar ir" name="btns_calendar2" id="btns_calendar2"></button></td>
                    <th>INV Cust</th>
                    <td><input type="text" style="width: 30px;" dataformat="engup" class="input2" name="inv_cust_cnt_cd" onblur="fn_inv_cust_chg();" style="ime-mode:disabled" onKeyPress="ComKeyOnlyAlphabet('upper')" maxlength="2" onKeyUp="javascript:checkCustLeng(this.value)" disabled><input type="text" style="width: 60px;" name="inv_cust_seq" onblur="fn_inv_cust_chg();" value="" maxlength="6" dataformat="num" class="input2" disabled><button type="button" class="input_seach_btn" name="btn_invcust" id="btn_invcust"></button><input type="text" style="width: 300px;" name="cust_lgl_eng_nm" value="" class="input2" readOnly><button type="button" class="input_seach_btn" name="btn_custNm" id="btn_custNm"></button></td>
                </tr>
            </tbody>
        </table>
        <!--  biz_1   (E) -->   
        <table class="line_bluedot"><tr><td colspan="6"></td></tr></table>
        <!--  biz_1 (S) -->
        <table>
            <colgroup>
                <col width="100"  />
                <col width="300"  />
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Bound</th>
                    <td><select class="input" name="io_bnd_cd" id="io_bnd_cd" disabled>
                            <option value="" selected>All</option>
                            <option value="O">O/B</option>
                            <option value="I">I/B</option>
                        </select>
                    </td>
                    <td></td>
                </tr>
                <tr>
                    <th valign="top">Local VVD</th>
                    <td>
                        <script type="text/javascript">ComSheetObject('sheet1');</script>
                        <script type="text/javascript">ComSheetObject('sheet2');</script>
                    </td>
                    <td></td>
                </tr>
            </tbody>
        </table>
        <!--  biz_1   (E) -->   
        <table class="line_bluedot"><tr><td colspan="6"></td></tr></table>
        <!--  biz_1 (S) -->
        <table>
            <colgroup>
                <col width="100"  />
                <col width="300"  />
                <col width="" />
            </colgroup>
            <tbody>
                <tr>
                    <th valign="top">B/L No</th>
                    <td>
                        <script type="text/javascript">ComSheetObject('sheet3');</script>
                        <script type="text/javascript">ComSheetObject('sheet4');</script>
                    </td>
                    <td></td>
                </tr>
            </tbody>
        </table>
        <!--  biz_1   (E) -->   
        <table class="line_bluedot"><tr><td colspan="6"></td></tr></table>
        <!--  biz_1 (S) -->
        <table>
            <colgroup>
                <col width="100"  />
                <col width="" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Total Count</th>
                    <td><input type="text" style="width: 104px;" name="tot_cnt" class="input2" readOnly></td>
                </tr>
                <tr>
                    <th>Good Count</th>
                    <td><input type="text" style="width: 104px;" name="good_cnt" class="input2" readOnly></td>
                </tr>
                <tr>
                    <th>Nogood Count</th>
                    <td><input type="text" style="width: 104px;" name="no_good_cnt" class="input2" readOnly></td>
                </tr>
            </tbody>
        </table>
        <!--  biz_1   (E) -->   
    </div>
    <!-- opus_design_inquiry(E) -->

    <script type="text/javascript">ComSheetObject('sheet5');</script>
</div>
<!-- wrap_result(E) -->
</form>
