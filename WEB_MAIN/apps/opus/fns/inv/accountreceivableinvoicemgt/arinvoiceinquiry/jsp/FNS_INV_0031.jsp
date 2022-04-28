<%--
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0031.jsp
*@FileTitle  : Invoice Inquiry by Date & VVD
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
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.arinvoiceinquiry.event.FnsInv0031Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
    FnsInv0031Event  event = null;                  //PDTO(Data Transfer Object including Parameters)
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
        
        event = (FnsInv0031Event)request.getAttribute("Event");
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
            showErrMessage(errMessage);
        } // end if
        loadPage();
    }
</script>

<form name="form">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
<input type="hidden" name="pagetype" value = "I">
<input type="hidden" name="user_ofc_cd" value="<%=strOfc_cd %>">
<input type="hidden" name="office">
<input type="hidden" name="dp_prcs_knt_local" value="0">
<input type="hidden" name="dp_prcs_knt" value="0">
<input type="hidden" name="grp_inv_flg">

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
    <div class="opus_design_btn"><!-- 
         --><button type="button" class="btn_accent" name="btn_retrive" id="btn_retrive">Retrieve</button><!-- 
         --><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!-- 
         --><button type="button" class="btn_normal" name="btn_downExcel" id="btn_downExcel">Down Excel</button>
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
                <col width="100" />
                <col width="80"  />
                <col width="70"  />
                <col width="50"  />
                <col width="60"  />
                <col width="100" />
                <col width="100" />
                <col width="100" />
                <col width="110" />
                <col width="80"  />
                <col width="" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Date</th>
                    <td colspan="5"><!-- 
                         --><select name="date_option" id="date_option" style="width:112px;" class="input1" onChange="date_option_OnChange(this.value)"> 
                        	 <option value="G" selected>Good Date</option> 
                           	 <option value="I">I/F Date</option> 
                             <option value="E">Eff. Date</option> 
                         </select><!-- 
                         --><input type="text" name="from_date" id="from_date" required dataformat="ymd" maxlength="8" style="width:85px;" class="input1" cofield="to_date" caption="start date"><button type="button" class="calendar ir" name="btns_calendar1" id="btns_calendar1"></button><!-- 
                         --><input type="text" name="to_date" id="to_date" required dataformat="ymd" maxlength="8" style="width:85px;" class="input1" cofield="from_date" caption="end date"><button type="button" class="calendar ir" name="btns_calendar2" id="btns_calendar2"></button><!-- 
                         --><input type="hidden" name="date_blank" id="date_blank" maxlength="8" style="width:0" class="input" readOnly value="blank">
                    </td>
                    <th>Bound</th>
                    <td><script type="text/javascript">ComComboObject('bound', 1, 100, 1, 1);</script></td>
                    <th>Good Option</th>
                    <td>
                         <select name="good_flag" id="good_flag" style="width:90px;" class="input1"> 
                                 <option value="" selected>All</option>
                                 <option value="Y">Good</option> 
                                 <option value="N">No Good</option> 
                         </select>
                    </td>
                    <th>Office</th>
                    <td><script type="text/javascript">ComComboObject('ar_ofc_cd', 1, 100, 0, 1);</script></td>
                </tr>
                <tr>
                    <th>Actual Cust.</th>
                    <td colspan="5"><!-- 
                         --><input name="act_cust_cnt_cd" id="act_cust_cnt_cd" type="text" style="width:25px;" value="" class="input" maxlength="2" dataformat="engup"><!--  
                         --><input name="act_cust_seq" id="act_cust_seq" type="text" style="width:50px;" value="" class="input" maxlength="6" dataformat="num"><button type="button" class="input_seach_btn" name="btns_cust1" id="btns_cust1"></button><!-- 
                         --><input name="cust_nm" id="cust_nm" type="text" style="width:315px;" value="" class="input2" value="" readonly><button type="button" class="input_seach_btn" name="btns_cust2" id="btns_cust2"></button>
                    </td>
                    <th>Issue Option</th>
                    <td><script type="text/javascript">ComComboObject('issue_flag', 1, 100, 1, 1);</script></td>
                    <th>Rev. Type</th>
                    <td> 
                         <select name="rev_tp_cd" id="rev_tp_cd" style="width:90px;" class="input1" OnChange="javascript:doChange(this);">
                             <option value="" selected>ALL</option>
                             <option value="B">B/L</option>
                             <option value="C">C/A</option> 
                             <option value="M">MRI</option>
                         </select>
                    </td> 
                    <th>Group Invoice</th>
                    <td><input type="checkbox" value="" class="trans" name="grp_inv_chk" id="grp_inv_chk"></td>
                </tr>
                <tr>
                    <th title="Vessel Voyage Direction">VVD</th>
                    <td><input name="vvd" type="text" style="width:90px;" class="input" maxlength="9" minlength="9" value="" dataformat="engup"></td>
                    <th>Incl. Sys Clear</th>
                    <td><script type="text/javascript">ComComboObject('inv_clr_flg', 1, 60, 1, 0);</script></td>
                    <th>Scope</th>
                    <td><input name="scope" id="scope" type="text" style="width:42px;" class="input" maxlength="3" minlength="3" value="" dataformat="engup"><button type="button" class="input_seach_btn" name="btns_SCP" id="btns_SCP"></button></td>
                    <th>Port</th>
                    <td><input name="port" id="port" type="text" style="width:65px;" class="input" maxlength="5" minlength="5" value="" dataformat="engup"><button type="button" class="input_seach_btn" name="btns_port" id="btns_port"></button></td>
                    <th>User ID</th>
                    <td><input name="upd_usr_id" id="upd_usr_id" type="text" style="width:90px;" class="input" value=""></td>
                    <th>Rev Source</th>  
                    <td><script type="text/javascript">ComComboObject('rev_src_cd', 1, 100, 0, 0);</script></td> 
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

    <!-- opus_design_inquiry(S) -->
    <div class="opus_design_inquiry">
        <!--  biz_1 (S) -->
        <table>
            <colgroup>
                <col width="80"  />
                <col width="100" />
                <col width="110" />
                <col width="150" />
                <col width="110" />
                <col width="" />
            </colgroup>
            <tbody>
                <tr>
                    <th>B/L Count</th>
                    <td><input name="bl_count" id="bl_count" type="text" style="width:60px;text-align:right" class="input2" value="" readonly tabIndex="-1"></td>
                    <th>Grand USD Total</th>
                    <td><input name="usd_total" id="usd_total" type="text" style="width:120px;text-align:right" class="input2" value="" readonly tabIndex="-1"></td>
                    <th>Grand LCL Total</th>
                    <td><input name="lcl_total" id="lcl_total" type="text" style="width:120px;text-align:right" class="input2" value="" readonly tabIndex="-1"></td>
                </tr>
            </tbody>
        </table>
        <!--  biz_1   (E) -->   
    </div>
    <!-- opus_design_inquiry(E) -->
</div>
<!-- wrap_result(E) -->

</form>
