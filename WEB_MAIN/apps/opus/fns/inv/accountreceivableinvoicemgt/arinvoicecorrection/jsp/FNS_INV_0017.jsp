<%--
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0017.jsp
*@FileTitle  : Invoice Customer Correction by Date
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
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.arinvoicecorrection.event.FnsInv0017Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
    FnsInv0017Event  event = null;                  //PDTO(Data Transfer Object including Parameters)
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
       
       
        event = (FnsInv0017Event)request.getAttribute("Event");
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
<input type="hidden" name="ofc" value="">
<input type="hidden" name="ofc_cd" value="">
<input type="hidden" name="pagetype" value = ""><!-- OFFICE LIST -->
<input type="hidden" name="ar_ofc_cd2"><!-- OFFICE LIST -->
<input type="hidden" name="cust_cnt_cd">
<input type="hidden" name="cust_seq">
<input type="hidden" name="frm_bkg_no">
<input type="hidden" name="frm_cust_nm">
<input type="hidden" name="frm_act_cust_cnt_cd">
<input type="hidden" name="frm_act_cust_seq">
<input type="hidden" name="old_act_cust_cnt_cd">
<input type="hidden" name="old_act_cust_seq">
<input type="hidden" name="tax_cnt_flg" id="tax_cnt_flg" /> 
<input type="hidden" name="tax_exp_flg" id="tax_exp_flg" /> 

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
     --><button type="button" class="btn_normal" name="btn_save" id="btn_save">Save</button>
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
                <col width="120" />
                <col width="50"  />
                <col width="60"  />
                <col width="54"  />
                <col width="110" />
                <col width="50" />
                <col width="100" />
                <col width="50" />
                <col width="" />
            </colgroup>
            <tbody>
                <tr>
                    <th>I/F Date</th>
                    <td><input type="text" style="width: 80px;" class="input1" name="bl_inv_if_dt" maxlength="10" dataformat="ymd" required onBlur="fn_ComGetMaskedValue();"><button type="button" class="calendar ir" name="btns_calendar" id="btns_calendar"></button></td>
                    <th>Bound</th>
                    <td><select style="width: 52px;" class="input1" name="io_bnd_cd">
                            <option value="" selected>All</option>
                            <option value="O">O/B</option>
                            <option value="I">I/B</option>
                        </select>
                    </td>
                    <th title="Vessel Voyage Direction">VVD</th>
                    <td><input type="text" style="width: 100px;" name="frm_vvd" value="" class="input2" maxlength="9" readonly></td>
                    <th>Scope</th>
                    <td><input type="text" style="width: 100px;" name="frm_svc_scp_cd" value="" class="input2" maxlength="9" readonly></td>
                    <th>Office</th>
                    <td><script language="javascript">ComComboObject('ar_ofc_cd', 1, 101, 1,1);</script></td>
                </tr>
                <tr>
                    <th>Actual Cust.</th>
                    <td colspan="5">
                        <input type="text" style="width: 27px;" class="input1" name="act_cust_cnt_cd" id="act_cust_cnt_cd" onchange="fn_act_cust_chg();" dataformat="engup" maxlength="2"><!-- 
                        --><input type="text" class="input1" style="width: 60px;" name="act_cust_seq" id="act_cust_seq" onchange="fn_act_cust_chg();" value="" maxlength="6" dataformat="num"><button type="button" class="input_seach_btn" name="btn_actcust" id="btn_actcust"></button><!-- 
                        --><input type="text" style="width: 260px;" name="cust_lgl_eng_nm" value="" class="input2" readOnly><button type="button" class="input_seach_btn" name="btn_custNm" id="btn_custNm"></button>
                    </td>
                    <th>Port</th>
                    <td colspan="2"><input type="text" style="width: 100px;" name="port_cd" value="" class="input" maxlength="5" dataformat="engup"><button type="button" class="input_seach_btn" name="btns_port" id="btns_port"></button>
                	<td>
						<table id="tax_cnt_area" border="0" style="display:block">
							<tr>
                        		<th id="tax_exp_mn">INV Exempt Tax</th>
                        		<td>
                            		<input name="tax_exp_chk" id="tax_exp_chk" type="checkbox" value="" class="trans"  onblur="fn_tax_exp_chk();">
                            	</td>
							</tr>
						</table>
                	</td>
                </tr>
                <tr>
                    <th>Route</th>
                    <td colspan="3">
                        <input type="text" style="width: 60px;" name="frm_por_cd" class="input2" readonly><!--
                        --><input type="text" style="width: 60px;" name="frm_pol_cd" class="input2" readonly><!--
                        --><input type="text" style="width: 60px;" name="frm_pod_cd"   class="input2" readonly><!-- 
                        --><input type="text" style="width: 60px;" name="frm_del_cd" class="input2" readonly>
                    </td>
                    <th>B/L No.</th>
                    <td><input type="text" style="width: 100px;" class="input2" name="frm_bl_src_no" maxlength="12" readonly></td>
                    <th>I/F No.</td>
                    <td><input type="text" style="width: 100px;" class="input2" name="frm_ar_if_no" maxlength="11" readonly></td>
                </tr>
                <tr>
                    <th>Remark(s)</th>
                    <td colspan="9"><input type="text" style="width: 841px;" class="input" name="frm_inv_rmk" onblur="fn_inv_rmk_chg(this.value);"></td>
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
        <script language="javascript">ComSheetObject('sheet1');</script>
        <script language="javascript">ComSheetObject('sheet2');</script>
    </div>
    <!-- opus_design_grid(E) -->

    <!-- opus_design_inquiry(S) -->
    <div class="opus_design_inquiry">
        <!--  biz_1 (S) -->
        <table>
            <colgroup>
                <col width="1"  />
                <col width="" />
            </colgroup>
            <tbody>
                <tr>
                    <th>SHPR/CNEE</th>
                    <td>
                       <input type="text" class="input2" style="width: 40px;" name="frm_shpr_cust_cnt_cd" readonly><!-- 
                       --><input type="text" class="input2" style="width: 50px;" name="frm_shpr_cust_seq" readonly><!-- 
                       --><input type="text" class="input2" style="width: 803px;" name="frm_shpr_cust_nm" readonly>
                     </td>
                </tr>
                <tr>
                    <th>Address</th>
                    <td>
                        <input type="text" class="input2" style="width: 901px;" name="frm_shpr_cust_addr" readonly>
                    </td>
                </tr>
            </tbody>
        </table>
        <!--  biz_1   (E) -->   
        <table class="line_bluedot"><tr><td colspan="6"></td></tr></table>
        <!--  biz_1 (S) -->
        <table>
            <colgroup>
                <col width="1"  />
                <col width="" />
            </colgroup>
            <tbody>
                <tr>
                    <th>FWDR/NTFY</th>
                    <td>
                       <input type="text" class="input2" style="width: 40px;" name="frm_fwdr_cust_cnt_cd" readonly><!--
                      --><input type="text" class="input2" style="width: 50px;" name="frm_fwdr_cust_seq" readonly><!-- 
                      --><input type="text" class="input2" style="width: 803px;" name="frm_fwdr_cust_nm" readonly>
                    </td>
                </tr>
                <tr>
                    <th>Address</th>
                    <td colspan="3">
                        <input type="text" class="input2" style="width: 901px;" name="frm_fwdr_cust_addr" readonly>
                    </td>
                </tr>
            </tbody>
        </table>
        <!--  biz_1   (E) -->   
    </div>
    <!-- opus_design_inquiry(E) -->

    <table border="0" cellpadding="0" cellspacing="0" style="width: 750px; padding-top: 5; , padding-bottom: 10;">
        <tr>
            <td align="right">
                <img class="cursor" src="img/btns_back_1.gif" name="btn_back_1" width="18px;" height="19" border="0" align="absmiddle">
                <img class="cursor" src="img/btns_back.gif" name="btn_back" width="18px;" height="19" border="0" align="absmiddle">
                <img class="cursor" src="img/btns_next.gif" name="btn_next" width="18px;" height="19" border="0" align="absmiddle">
                <img class="cursor" src="img/btns_next_1.gif" name="btn_next_1" width="18px;" height="19" border="0" align="absmiddle">
                <input type="text" class="input2" style="width: 30px;" name="cur_cnt" readonly>/&nbsp<!-- 
                --><input type="text" class="input2" style="width: 30px;" name="all_cnt" readonly>
            </td>
        </tr>
    </table>
</div>
<!-- wrap_result(E) -->

</form>
