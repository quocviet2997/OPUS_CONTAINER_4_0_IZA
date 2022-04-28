<%--
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0034_01.jsp
*@FileTitle  : Invoice Issue 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/13
=========================================================*/
--%>
 
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.invoiceissue.event.FnsInv003401Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
    FnsInv003401Event  event = null;            //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;         // Errors from server.
    String strErrMsg = "";                      // Error message.
    int rowCount     = 0;                       // DB ResultSet list count

    String successFlag = "";
    String codeList  = "";
    String pageRows  = "100";
    String main_page = "";

    String strUsr_id = "";
    String strUsr_nm = "";
    String loginOfcCd = "";
    Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMgt.InvoiceIssue");

    try {
        SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
        strUsr_id = account.getUsr_id();
        strUsr_nm = account.getUsr_nm();
        loginOfcCd = account.getOfc_cd();


        event = (FnsInv003401Event)request.getAttribute("Event");
        serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

        if (serverException != null) {
            strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
        }

        // Get data from server. ..
        GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
        main_page = JSPUtil.getParameter(request, "main_page".trim(), "");

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

<input type="hidden" name="ar_ofc_cd2">
<input type="hidden" name="pagetype" value = "E">
<input type="hidden" name="bl_nos">
<input type="hidden" name="svr_id">
<input type="hidden" name="inv_nos">
<input type="hidden" name="invoice_nos" id ="invoice_nos">
<input type="hidden" name="user_id" value="<%=strUsr_id%>">
<input type="hidden" name="user_nm" value="<%=strUsr_nm%>">
<input type="hidden" name="if_user_id" >
<input type="hidden" name="invs_email">
<input type="hidden" name="state">
<input type="hidden" name="ots_smry_cd">
<input type="hidden" name="inv_dup_flg">
<!-- JHJ 2017-06 start! -->
<input type="hidden" name="inv_iss_tp_cd">
<!-- JHJ 2017-06 end! -->
<input type="hidden" name="inv_mlt_bl_iss_flg">
<input type="hidden" name="backendjob_key">
<input type="hidden" name="email_flag" value="N">
<input type="hidden" name="login_ofc_cd" value="<%=loginOfcCd%>">
<input type="hidden" name="print_nm">
<input type="hidden" name="locl_curr_cd">
<input type="hidden" name="altn_curr_div_cd">
<input type="hidden" name="custListsheetId" id="custListsheetId" value="sheet2_" >  <!-- Multi시 이용. 0033의 sheet와 이곳의 sheet ID가 다름. param으로 넘김. 주의요망  -->
<input type="hidden" name="office_cnt_cd">
<input type="hidden" name="chk_bl_nos">
<!-- JHJ 2017-06 start! -->
<!--<input type="hidden" name="inv_bl_nos">  -->
<input type="hidden" name="ofc_chk_flg">
<input type="hidden" name="tax_cnt_flg" id="tax_cnt_flg" /> 
<!-- JHJ 2017-06 end! -->
<input type="hidden" name="grp_inv_flg">

<!-- OUTER - POPUP (S)tart -->
<%if(main_page.equals("true")){ %>
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
         --><button type="button" class="btn_normal" name="btn_paperissue" id="btn_paperissue">Paper Issue</button><!--
         --><button type="button" class="btn_normal" name="btn_goto" id="btn_goto">Go to Send</button>
    </div>
    <!-- opus_design_btn(E) -->

    <!-- page_location(S) -->
    <div class="location">
        <span id="navigation"></span>
    </div>
    <!-- page_location(E) -->
</div>
<!-- page_title_area(E) -->
<%} else { %>
<!-- layer_popup_title(S) -->
 <div class="layer_popup_title">
    <!-- page_title_area(S) -->
    <div class="page_title_area clear">
        <!-- page_title(S) -->
        <h2 class="page_title">
            <span>Invoice Issue</span>
        </h2>
        <!-- page_title(E) -->

        <!-- opus_design_btn(S) -->
        <div class="opus_design_btn"><!--
		    <div class="opus_design_btn">
            <button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!--
            --><button type="button" class="btn_normal" name="btn_paperissue" id="btn_paperissue">Paper Issue</button><!--
            --><button type="button" class="btn_normal" name="btn_goto" id="btn_goto">Go to Send</button><!--
            --><button type="button" class="btn_normal" name="btn_Close" id="btn_Close">Close</button>
        </div>
        <!-- opus_design_btn(E) --> 
    </div>
    <!-- page_title_area(E) -->
</div>
<!-- layer_popup_title(E) -->
<%} %>

<%if(main_page.equals("true")){ %>
<%}else{ %>
<div class="layer_popup_contents">
<%} %>
<!-- wrap_result(S) -->
<div class="wrap_result">
    <!-- opus_design_inquiry(S) -->
    <div class="opus_design_inquiry">
        <!--  biz_1 (S) -->
        <table>
            <colgroup>
                <col width="83"  />
                <col width="250" />
                <col width="50" />
                <col width="70" />
                <col width="50" />
                <col width="70" />
                <col width="70" />
                <col width="110" />
                <col width="70" />
                <col width="70" />
                <col width="50" />
                <col width="70" />
                <col width="50" />
                <col width=""/>
            </colgroup>
            <tbody>
                <tr>
                    <th class="sm">Issue By</th>
                    <td class="sm" align="center">
                        <input type="checkbox" value="" class="trans" name="chk_vvd" id="chk_vvd" style="" onclick="javascript:clickVvd();"><label for="chk_vvd">VVD</label><!--
                        --><input type="checkbox" value="" class="trans" name="chk_cust" id="chk_cust" onclick="javascript:clickCust();"><label for="chk_cust">Customer</label><!--
                        --><input type="checkbox" value="" class="trans" name="chk_blno" id="chk_blno" onclick="javascript:clickBlno();" checked><label for="chk_blno">B/L No.</label>
                    </td>
                    <th class="sm">Issue Curr</th>
                    <td><script type="text/javascript">ComComboObject('inv_curr_cd', 1, 90, 1, 1);</script></td>
                    <th>Bound</th>   
                    <td><select style="width:60px;" class="noinput" name="bnd" id="bnd" onChange="javascript:initInvNO();" disabled>
	                        <option value="A" selected>All</option>
	                        <option value="O">O/B</option>
	                        <option value="I">I/B</option>
                        </select>
                    </td>
                    <th>Group By</th>   
                    <td><select style="width:100px;" class="noinput" name="iss_grp_tp_cd" id="iss_grp_tp_cd" onChange="javascript:initInvNO();">
	                      <option value="C" selected>Cust</option>
						  <option value="V">Cust & VVD</option>
                        </select>
                        </td> 
                    <th>Rev. Type</th>   
                    <td><script type="text/javascript">ComComboObject('rev_type', 1, 60, 0);</script>
                    <!-- <select style="width:60px;" class="noinput" name="rev_type" id="rev_type" onChange="javascript:initInvNO();">
	                        <option value="" selected>All</option>
	                        <option value="F">FRT</option>
	                        <option value="M">MRI</option>
                        </select>-->
                        </td> 
                    <th>S/A Date</th>   
                    <td><input type="text" style="width: 80px;" name="to_date" dataformat="ymd" onBlur="fn_ComGetMaskedValue('to_date');" maxlength="10" onKeyUp="javascript:checkFmDtLeng(this.value)" class="input1"><button type="button" class="calendar ir" name="btns_calendar1" id="btns_calendar1"></button></td>
                    <th>Office</th>   
                    <td><script type="text/javascript">ComComboObject('ar_ofc_cd', 1, 90, 1, 1);</script></td>
                </tr>
            </tbody>
        </table>
        <!--  biz_1   (E) -->

        <table class="line_bluedot"><tr><td colspan="8"></td></tr></table>

        <!--  biz_1 (S) -->
        <table>
            <colgroup>
                <col width="90"  />
                <col width="150" />
                <col width="90"  />
                <col width="106" />
                <col width="90"  />
                <col width=""/>
            </colgroup>
            <tbody>
                <tr>
                    <th title="Vessel Voyage Direction">VVD</th>
                    <td><input type="text" style="width:100px;" name="vvd" minlength="9" maxlength="9" class="input2" dataformat="engup" readOnly></td>
                    <th>Port Code</th>
                    <td><input type="text" style="width:50px;" name="port" minlength="5" maxlength="5" class="input2" dataformat="engup" readOnly></td>
                    <th>Service Scope</th>
                    <td><input type="text" style="width:50px;" name="scp" minlength="3" maxlength="3" class="input2" dataformat="engup" readOnly></td>
                </tr>
            </tbody>
        </table>
        <!--  biz_1   (E) -->   

        <table class="line_bluedot"><tr><td colspan="8"></td></tr></table>

        <!--  biz_1 (S) -->
        <table>
            <colgroup>
                <col width="90"  />
                <col width="140" />
                <col width="28"  />
                <col width="185" />                
                <col width="28"  />
                <col width="200" />
                <col width="30"  />
                <col width="200" />
                <col width="200" />
                <col width=""/>
            </colgroup>
            <tbody>
                <tr>
                    <th>Actual Cust.</th>
                    <td width="" colspan="9">
                        <input type="text" style="width:40px;" class="input2" name="cust_cnt_cd" minlength="2" maxlength="2" dataformat="engup" readonly><!--
                        --><input type="text" style="width:55px;" class="input2" name="cust_seq" maxlength="6" dataformat="num" onfocusout="javascript:getCustNm();" readonly><!--
                        --><button type="button" class="input_seach_btn" name="popup1" id="popup1" disabled onclick="javascript:openFnsInv0013();"></button><!--
                        --><input type="text" style="width:379px;" class="input2" name="cust_nm" readonly><!--
                        --><input type="text" style="width:130px;" class="input2" name="cust_rgst_no" readonly><!--
                        --><button type="button" class="input_seach_btn" name="popup2" id="popup2" disabled onclick="javascript:openFnsInv0086();"></button>
                    </td>
                </tr>
                <tr>
                    <th>Credit Limit</th>
                    <td>
                        <input type="text" style="width:40px;" class="input2" name="cr_curr_cd" readonly><!--
                        --><input type="text" style="width:100px;text-align:right;" class="input2" name="cr_amt" readonly>
                    </td>
                    <th>Tel.</th>
                    <td><input type="text" style="width:119px;" class="input2" name="phn_no" readonly></td>
                    <th>Fax</th>
                    <td><input type="text" style="width:119px;" class="input2" name="fax_no" readonly></td>
                    <th>PIC</th>
                    <td width=""><input type="text" style="width:119px;" class="input2" name="cntc_pson_nm" readonly></td>
					<td><button type="button" class="btn_normal" name="btn_check" id="btn_check" disabled>Issue Check</button></td>
					<td><div id="d_group" name="d_group" style="display:none"><input type="checkbox" value="" class="trans" name="chk_grp_inv" id="chk_grp_inv" disabled><!--  
                           --><label for="chk_grp_inv">Group Invoice</label></div></td> 					
                </tr>
            </tbody>
        </table>
        <!--  biz_1   (E) -->   

        <table class="line_bluedot"><tr><td colspan="8"></td></tr></table>
    </div>
    <!-- opus_design_inquiry(E) -->
	
	
    <!-- opus_design_grid(S) -->
    <div class="opus_design_grid wFit">
        <h3 class="title_design pad_btm_8">B/L No.</h3>
        <script type="text/javascript">ComSheetObject('sheet1');</script>
    </div>
    
	
    <table class="line_bluedot"><tr><td colspan="8"></td></tr></table>
    <!-- opus_design_grid(E) -->

    <!-- opus_design_inquiry(S) -->
    <div class="opus_design_inquiry wFit">
        <!--  biz_1 (S) -->
        <table>
            <colgroup>
                <col width="90"  />
                <col width="305" />
                <col width="130" />
                <col width="163" />
                <col width="150" />
                <col width=""/>
            </colgroup>
            <tbody>
                <tr>
                    <th>Invoice No.</th>
                    <td>
                        <input type="text" style="width:100px;" value="" class="input2" name="f_inv" readonly>~&nbsp;<!--
                        --><input type="text" style="width:100px;" value="" class="input2" name="t_inv" readonly>
                    </td>
                    <th>Total Invoice Count</th>
                    <td><input type="text" style="width:80px;text-align:right;" value="" class="input2" name="tot_inv_cnt" readonly></td>
                    <th>Number of copy invoice</th>
                    <td><input type="text" style="width:80px;text-align:right;" value="" class="input" name="copy_cnt" dataformat="num" minlength="1" maxlength="3"></td>
                </tr>
            </tbody>
        </table>
        <!--  biz_1   (E) -->
    </div>

    <div class="opus_design_grid wFit" style="display:none">
        <script type="text/javascript">ComSheetObject('sheet2');</script>
    </div>
	<!-- opus_design_grid(E) -->



    <!-- opus_design_inquiry(E) -->
</div>
<!-- wrap_result(E) -->
<%if(main_page.equals("true")){ %>
<%}else{ %>
</div>
<%} %>




</form>
