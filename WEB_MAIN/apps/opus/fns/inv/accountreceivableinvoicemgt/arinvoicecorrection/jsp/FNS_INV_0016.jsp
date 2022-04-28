<%--
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0016.jsp
*@FileTitle  : Invoice Item Correction(General)
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
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.arinvoicecorrection.event.FnsInv0016Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.apps.opus.bcm.sup.valuemanage.util.ConstantMgr"%>

<%
    FnsInv0016Event  event = null;                  //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;         // Errors from server.
    String strErrMsg = "";                      // Error message.
    int rowCount     = 0;                       // DB ResultSet list count
    
    String successFlag = "";
    String codeList  = "";
    String pageRows  = "100";

    String strUsr_id        = "";
    String strUsr_nm        = "";
    
    String bl_src_no        = "";
    String ar_ofc_cd        = "";
    String classId      = "";
    
    Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMgt.ARInvoiceCorrection");
    
    try {
        SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
        strUsr_id = account.getUsr_id();
        strUsr_nm = account.getUsr_nm();
       
       
        event = (FnsInv0016Event)request.getAttribute("Event");
        
        bl_src_no       = event.getBlSrcNo();
        ar_ofc_cd       = event.getArOfcCd();
        classId         = event.getClassId();
        
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
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="ofc" value="" id="ofc" />
<input type="hidden" name="ofc_cd" value="" id="ofc_cd" />
<input type="hidden" name="pagetype" value="" id="pagetype" />
<input type="hidden" name="ar_ofc_cd2" id="ar_ofc_cd2" />
<input type="hidden" name="zn_ioc_cd" id="zn_ioc_cd" />
<input type="hidden" name="act_inv_flag" value="N" id="act_inv_flag" />
<input type="hidden" name="other_flag" value="Y" id="other_flag" />
<input type="hidden" name="cr_flg" id="cr_flg" />
<input type="hidden" name="ots_smry_cd" id="ots_smry_cd" />
<input type="hidden" name="cust_cr_flg" id="cust_cr_flg" />
<input type="hidden" name="cr_term_dys" id="cr_term_dys" />
<input type="hidden" name="cust_cnt_cd" id="cust_cnt_cd" />
<input type="hidden" name="cust_seq" id="cust_seq" />
<input type="hidden" name="lcl_curr" id="lcl_curr" />
<input type="hidden" name="curr_cd" id="curr_cd" />
<input type="hidden" name="usd_xch_rt" id="usd_xch_rt" />
<input type="hidden" name="xch_rt_n3rd_tp_cd" id="xch_rt_n3rd_tp_cd" />
<input type="hidden" name="xch_rt_usd_tp_cd" id="xch_rt_usd_tp_cd" />
<input type="hidden" name="xch_rt_dt" id="xch_rt_dt" />
<input type="hidden" name="obrd_cd" id="obrd_cd" />
<input type="hidden" name="vvd" id="vvd" />
<input type="hidden" name="lcl_vvd" id="lcl_vvd" />
<input type="hidden" name="port" id="port" />
<input type="hidden" name="bnd" id="bnd" />
<input type="hidden" name="inv_ttl_locl_amt" id="inv_ttl_locl_amt" />
<input type="hidden" name="inv_cust_flg" id="inv_cust_flg" />
<input type="hidden" name="sail_dt" id="sail_dt" />
<input type="hidden" name="mod_flag" id="mod_flag" />
<input type="hidden" name="loc_cd" id="loc_cd" />
<input type="hidden" name="office_cnt_cd" id="office_cnt_cd" />
<input type="hidden" name="svr_id" id="svr_id" />
<input type="hidden" name="dest_trns_svc_mod_cd" id="dest_trns_svc_mod_cd" />
<input type="hidden" name="inv_svc_scp_cd" id="inv_svc_scp_cd" />
<input type="hidden" name="inv_dup_flg" id="inv_dup_flg" />
<input type="hidden" name="whf_decl_no" value="" id="whf_decl_no" />
<input type="hidden" name="whf_decl_cfm_dt" value="" id="whf_decl_cfm_dt" />
<input type="hidden" name="dp_prcs_knt_local" value="" id="dp_prcs_knt_local" />
<input type="hidden" name="bl_srch_flg" value="" id="bl_srch_flg" />
<input type="hidden" name="inv_split_cd" id="inv_split_cd" />
<input type="hidden" name="ida_mod_flag" id="ida_mod_flag" />
<input type="hidden" name="chg_oft_flg" id="chg_oft_flg" />
<input type="hidden" name="chg_expt_cd" id="chg_expt_cd" />

<!-- Tax Exemption 관련  -->
<input type="hidden" name="tax_cnt_flg" id="tax_cnt_flg" /> 
<input type="hidden" name="tax_exp_flg" id="tax_exp_flg" /> 
<input type="hidden" name="exp_mod_flag" id="exp_mod_flag" />

<% if(!classId.equals("")){ %>
<!-- layer_popup_title(S) -->
<div class="layer_popup_title">
<%}%>
    <!-- page_title_area(S) -->
    <div class="page_title_area clear">
        <!-- page_title(S) -->
        <h2 class="page_title">
<% if(classId.equals("")){ %>
        <button type="button">
            <span id="title"></span>
        </button>
<%}else{%>
            <span>Invoice Item Correction</span>
<%}%>
        </h2>
        <!-- page_title(E) -->

<% if(classId.equals("")){ %>
        <!-- opus_design_btn(S) -->
        <div class="opus_design_btn">
            <button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!--
            --><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!--
            --><button type="button" class="btn_normal" name="btn_save" id="btn_save">Save</button>
        </div>
        <!-- opus_design_btn(E) --> 
<%
    }
    else {
%>
        <!-- opus_design_btn(S) -->
        <div class="opus_design_btn">
            <button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!--
            --><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!--
            --><button type="button" class="btn_normal" name="btn_save" id="btn_save">Save</button><!--
            --><button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button>
        </div>
        <!-- opus_design_btn(E) --> 
<%
    }
%>      
		<!-- page_location(S) -->
        <div class="location">
            <span id="navigation"></span>
        </div>
        <!-- page_location(E) -->
    </div>
    <!-- page_title_area(E) -->
<% if(!classId.equals("")){ %>
</div>
<!-- layer_popup_title(E) -->
<%}%>

<% if(!classId.equals("")){ %>
<!-- popup_contens_area(S) -->
<div class="layer_popup_contents">
<%}%>
<!-- wrap_search(S) -->
<div class="wrap_search_tab">
    <!-- opus_design_inquiry(S) -->
    <div class="opus_design_inquiry wFit">
        <!--  biz_1 (S) -->
        <table>
            <colgroup>
                <col width="50"  />
                <col width="140" />
                <col width="55"  />
                <col width="120" />
                <col width="75"  />
                <col width="150" />
                <col width="50"  />
                <col width="140" />
                <col width="50"  />
                 <col width=""/>
            </colgroup>
            <tbody>
                <tr >
                    <th>B/L No.</th>
                    <td><input type="text" style="width: 100px;" class="input" name="bl_no" id="bl_no" value="" maxlength="12" dataformat="engup" onKeyDown="javascript:keyEnterRetreive(event)" tabindex="0"></td>
                    <th>BKG No.</th>
                    <td><input type="text" style="width: 100px;" class="input2" name="bkg_no" id="v" value="" maxlength="11" readonly tabindex="1"></td>
                    <th>Invoice No.</th>
                    <td><input type="text" style="width: 130px;" class="input" name="str_inv_no" id="str_inv_no" value="" maxlength="15" dataformat="engup" tabindex="2"></td>
                    <th>I/F No.</th>
                    <td><input type="text" style="width: 100px;" class="input2" name="if_no" id="if_no" value="" maxlength="11" readonly tabindex="3"></td>
                    <th>Office</th>
                    <td><script type="text/javascript">ComComboObject('ar_ofc_cd', 1, 100, 1, 1);</script></td>
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
    <!-- opus_tab_btn(S) -->
    <div class="opus_design_tab">
        <script type="text/javascript">ComTabObject('tab1')</script>
    </div>
    <!-- opus_tab_btn(E) -->

    <!--TAB Correction (S) -->
    <div id="tabLayer" style="display: inline">
        <!-- opus_design_inquiry(S) -->
        <div class="opus_design_inquiry wFit">
            <!--  biz_1 (S) -->
            <table>
                <colgroup>
                    <col width="1"  />
                    <col width="150" />
                    <col width="39"  />
                    <col width="100" />
                    <col width="75"  />
                    <col width="242" />
                    <col width="90"  />
                    <col width=""/>
                </colgroup>
                <tbody>
                    <tr>
                        <th>Actual Cust.</th>
                        <td colspan="5">
                            <input type="text" style="width: 40px;" name="act_cust_cnt_cd" value="" onblur="fn_act_cust_chg();" dataformat="engup" maxlength="2"><!--
                            --><input type="text" style="width: 50px;" name="act_cust_seq" onblur="fn_act_cust_chg();" value="" maxlength="6"><!--
                            --><button type="button" class="input_seach_btn" name="btn_actcust" id="btn_actcust"></button><!--
                            --><input type="text" style="width: 250px;" name="cust_nm" value="" class="input2"><!--
                            --><input type="text" style="width: 150px;" name="cust_rgst_no" value="" class="input2" dataformat="num" maxlength="20" onblur="fn_rgst_chg();"><!--
                            --><button type="button" class="input_seach_btn" name="btn_custNm" id="btn_custSer"></button>
                        </td>
                        <th>INV Cust.</th>
                        <td>
                            <input type="text" style="width: 30px;" name="inv_cust_cnt_cd" value="" onblur="fn_ex_rate_chg();fn_inv_cust_chg();" dataformat="engup" maxlength="2"><!--
                            --><input type="text" style="width: 100px;" name="inv_cust_seq" value="" onblur="fn_ex_rate_chg();fn_inv_cust_chg();" maxlength="6"><!--
                            --><button type="button" class="input_seach_btn" name="btn_cust" id="btn_cust"></button>
                        </td>
                    </tr>
                    <tr>
                        <th>Credit Limit</h>
                        <td colspan="3">
                            <input type="text" style="width: 40px;" name="cr_curr_cd" value="" class="input2" readonly><!--
                            --><input type="text" style="width: 100px; text-align: right;" name="cr_amt" value="" class="input2" readonly>
                        </td>
                        <th>Credit Term</th>
                        <td>&nbsp;<b>O/B</b>&nbsp;<!--
                            --><input type="text" style="width: 29px;" name="ob_cr_term_dys" value="" class="input2" readonly>&nbsp;&nbsp;&nbsp;<b>I/B</b>&nbsp;<!--
                            --><input type="text" style="width: 29px;" name="ib_cr_term_dys" value="" class="input2" readonly>
                        </td>
                        <th>Credit Office</th>
                        <td><input type="text" style="width: 100px;" name="cr_clt_ofc_cd" value="" class="input2" readonly></td>
                    </tr>
                        <tr>
                            <th>LCL VVD</th>
                            <td><input type="text" style="width: 80px;" name="local_vvd" value="" class="input" onblur="fn_vvd_bound_pol_pod_chg();" maxlength="9" dataformat="engup"></td>
                            <th>Scope</th>
                            <td><input type="text" style="width: 55px;" name="svc_scp_cd" value="" class="input2" readonly></td>
                            <th>Bound</th>
                            <td><input type="text" style="width: 73px;" name="io_bnd_cd" value="" class="input2" readonly></td>
                            <th>S/A Date</th>
                            <td><input type="text" style="width: 77px;" name="sail_arr_dt" value="" class="input2" readonly></td>
                        </tr>
                    <tr>
                        <th>Trunk VVD</th>
                        <td><input type="text" style="width: 80px;" name="trunk_vvd" value="" class="input" maxlength="9" dataformat="engup"></td>
                        <th>Lane</th>
                        <td><input type="text" style="width: 55px;" name="slan_cd" value="" class="input2" readonly></td>
                        <th>POR/POL</th>
                        <td>
                            <input type="text" style="width: 73px;" name="por_cd" value="" class="input2" readonly>/&nbsp;<!--
                            --><input type="text" style="width: 73px;" name="pol_cd" value="" class="input2" onblur="fn_vvd_bound_pol_pod_chg();" maxlength="5" dataformat="engup"></td>
                        <th>POD/DEL</th>
                        <td>
                            <input type="text" style="width: 50px;" name="pod_cd" value="" class="input" onblur="fn_vvd_bound_pol_pod_chg();" maxlength="5" dataformat="engup">/&nbsp;<!--
                            --><input type="text" style="width: 50px;" name="del_cd" value="" class="input2" readonly>
                        </td>
                    </tr>
                    <tr>
                        <th>C/A No.</th>
                        <td colspan="3"><input type="text" style="width: 140px;" name="bkg_corr_no" value="" class="input2" readonly></td>
                        <th>C/A Date</th>
                        <td><input type="text" style="width: 161px;" name="bkg_corr_dt" value="" class="input2" readonly></td>
                        <!-- <th>NYK Ref.</th>  -->
				        <th><%=ConstantMgr.getCompanyCode()%> Ref.</th>
                        <td><input type="text" style="width: 150px;" name="co_stf_ctnt" value=""></td>
                    </tr>
                    <tr>
                        <th>INV Ref.No.</th>
                        <td colspan="3"><input type="text" style="width: 140px;" class="input" name="inv_ref_no" value="" maxlength="25"></td>
                        <th>BKG Ref.No.</th>
                        <td><input type="text" style="width: 161px;" class="input2" readonly name="bkg_ref_no" value=""></td>
                        <th>S/I Ref.No.</th>
                        <td><input type="text" style="width: 150px;" value="" name="si_ref_no" class="input2" readonly></td>
                    </tr>
                    <tr>
                        <th>Description</th>
                        <td colspan="5"><input type="text" style="width: 527px;" class="input" name="inv_rmk" value=""></td>
                        <th>Rev. Type</th>
                        <td>
                            <input type="text" style="width: 50px;" class="input2" readonly name="rev_tp_cd" value=""><b>Source</b>&nbsp;<!--
                            --><input type="text" style="width: 40px;" class="input2" readonly name="rev_src_cd" value="">
                        </td>
                    </tr>
                    <tr>
                        <th>Master B/L</th>
                        <td colspan="3"><input type="text" style="width: 100px;" class="input" name="mst_bl_no" value="" dataformat="engup"></td>
                        <th>RFA No.</th>
                        <td><input type="text" style="width: 100px;" class="input" name="rfa_no" value="" maxlength="11"></td>
                        <th>S/C No.</th>
                        <td><input type="text" style="width: 100px;" name="sc_no" value="" maxlength="20"></td>
                    </tr>
                    <tr>
                        <th>Sales Rep.</th>
                        <td colspan="3"><input type="text" style="width: 100px;" class="input" name="srep_cd" value="" maxlength="5"></td>
                        <th>Weight</th>
                        <td><input type="text" style="width: 100px; text-align: right" class="input" name="cgo_wgt" value=""></td>
                        <th>Measure</th>
                        <td><input type="text" style="width: 100px; text-align: right" name="cgo_meas_qty" value=""></td>
                    </tr>
                    <tr>
                        <th>I/F Date</th>
                        <td colspan="3"><input type="text" style="width: 78px;" class="input2" readonly name="bl_inv_if_dt" value=""></td>
                        <th>Good Date</th>
                        <td><input type="text" style="width: 78px;" class="input2" readonly name="bl_inv_cfm_dt" value=""></td>
                        <th>Eff. Date</th>
                        <td><input type="text" style="width: 78px;" class="input2" readonly name="gl_eff_dt" value=""></td>
                    </tr>
                    <tr>
                        <th>INV No.</th>
                        <td colspan="3"><input type="text" style="width: 100px;" class="input2" readonly name="inv_no" value=""></td>
                        <th>Issue Date</th>
                        <td><input type="text" style="width: 78px;" class="input2" readonly name="iss_dt" value=""></td>
                        <th>Due Date</th>
                        <td><input type="text" style="width: 78px;" class="input2" readonly name="due_dt" value=""></td>
                    </tr>
                    <tr>
                        <th>FWDR Code</th>
                        <td>
                            <input type="text" style="width: 30px;" class="input" name="frt_fwrd_cnt_cd" value="" maxlength="2" dataformat="engup"><!--
                            --><input type="text" style="width: 65px;" class="input" name="frt_fwrd_cust_seq" value="" maxlength="6">
                        </td>
                        <td></td>
                        <td></td>
                        <th>TEU/FEU</th>
                        <td>
                            <input type="text" style="width: 50px;" name="bkg_teu_qty" value="" readonly>/&nbsp;<!--
                            --><input type="text" style="width: 50px;" name="bkg_feu_qty" value="" readonly><!--
                            --><button type="button" class="input_seach_btn" name="btn_container" id="btn_container"></button>
                        </td>
                        <th id="ida_gst_expt_nm">India Exempt Tax</th>
                        <td>
                            <input name="ida_gst_expt_cd" id="ida_gst_expt_cd" type="checkbox" value="" class="trans"  onblur="fn_ida_gst_expt_cd();">
                        </td>
                    </tr>
                    <tr>
                        <th id="tax_exp_mn">INV Exempt Tax</th>
                        <td>
                            <input name="tax_exp_chk" id="tax_exp_chk" type="checkbox" value="" class="trans"  onblur="fn_tax_exp_chk();">
                        </td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <th id="ida_oft_expt_nm">India ALL</th>
                        <td>
                            <input name="ida_oft_expt_flg" id="ida_oft_expt_flg" type="checkbox" value="" class="trans"  onblur="fn_ida_oft_expt_flg();">
                        </td>
                    </tr>
                </tbody>
            </table>
            <!--  biz_1   (E) -->
        </div>
        <!-- opus_design_inquiry(E) -->

        <!-- opus_design_grid(S) -->
        <div class="opus_design_grid" >
            <script type="text/javascript">ComSheetObject('sheet1');</script>
            <script type="text/javascript">ComSheetObject('sheet2');</script>
        </div>
    <!-- opus_design_grid(E) -->
    </div>
    <!--TAB Correction (E) -->

    <!--TAB Charge (S) -->
    <div id="tabLayer" style="display: none">
        <!-- opus_design_grid(S) -->
        <h3 class="title_design mar_btm_8">By Currency</h3>
        <div class="opus_design_grid"  >
            <script type="text/javascript">ComSheetObject('t2sheet1');</script>
        </div>

        <!-- opus_design_grid(S) -->
        <h3 class="title_design mar_btm_8">By Charge</h3>
        <div class="opus_design_grid" >
            <script type="text/javascript">ComSheetObject('t2sheet2');</script>
        </div>
    </div>
    <!--TAB Correction (E) -->

    <!-- opus_design_grid(S) -->
    <div class="opus_design_grid" >
        <script type="text/javascript">ComSheetObject('sheet5');</script>
    </div>
</div>
<!-- wrap_result(E) -->

<% if(!classId.equals("")){ %>
</div>
<!-- popup_contens_area(E) -->
<%}%>

</form>
<form name="form2">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="bl_src_no" value="<%=bl_src_no %>" id="bl_src_no" />
<input type="hidden" name="ar_ofc_cd" value="<%=ar_ofc_cd %>" id="ar_ofc_cd" />
<input type="hidden" name="classId" value="<%=classId %>" id="classId" />
</form>
