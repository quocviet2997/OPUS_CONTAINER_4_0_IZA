<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0020.jsp
*@FileTitle  : Yard
*@author     : CLT
*@version    : 1.0
*@since      : 2014/
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.location.event.BcmCcd0020Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
    BcmCcd0020Event  event = null;              //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;         //Error from server
    String strErrMsg = "";                      //Error message
    int rowCount     = 0;                       //Count of DB resultSet list
    String successFlag = "";
    String codeList  = "";
    String pageRows  = "100";
    String strUsr_id        = "";
    String strUsr_nm        = "";
    Logger log = Logger.getLogger("com.clt.apps.commoncode.location");
    String mainPage 		= "";
    mainPage = request.getParameter("main_page");
    // 승인처리용 정보
    String rqstNo       = JSPUtil.getParameter(request, "rqst_no");
    String procTpCd     = JSPUtil.getParameter(request, "proc_tp_cd");
    String rqstUsrChk   = JSPUtil.getParameter(request, "rqst_usr_chk");
    String rqstOfcCd    = JSPUtil.getParameter(request, "rqst_ofc_cd");
    try {
        SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
        strUsr_id = account.getUsr_id();
        strUsr_nm = account.getUsr_nm();
        event = (BcmCcd0020Event)request.getAttribute("Event");
        serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
        if (serverException != null) {
            strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
        }
        // 초기화면 로딩시 서버로부터 가져온 데이터 추출하는 로직추가 ..
        GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
    } catch(Exception e) {
        out.println(e.toString());
    }
%>

<script type="text/javascript">
    var G_MDAA_CHK;
    var G_AHTU_TP_CD;
    function setupPage(){
        var errMessage = "<%=strErrMsg%>";
        if (errMessage.length >= 1) {
            ComShowMessage(errMessage);
        } // end if
        loadPage();
    }
</script>

<form name="form" id="form">
<input id="f_cmd" name="f_cmd" type="hidden" />
<input id="pagerows" name="pagerows" type="hidden" />
<input id="ibflag" name="ibflag" type="hidden" />
<input id="mdm_yn" name="mdm_yn" value="y" type="hidden" />
<input id="creflag" name="creflag" value="Y" type="hidden" />
<input id="mst_dat_subj_cd" name="mst_dat_subj_cd" value="YARD" type="hidden" />
<input id="rqst_no" name="rqst_no" value="<%=rqstNo%>" type="hidden" />
<input id="proc_tp_cd" name="proc_tp_cd" value="<%=procTpCd%>" type="hidden" />
<input id="rqst_usr_chk" name="rqst_usr_chk" value="<%=rqstUsrChk%>" type="hidden" />
<input id="rqst_ofc_cd" name="rqst_ofc_cd" value="<%=rqstOfcCd%>" type="hidden" />
<input id="old_modi_yd_cd" name="old_modi_yd_cd"  value="" type="hidden"/>
<input id="edi_if_flg" name="edi_if_flg" type="hidden"/>
<!-- 개발자 작업    -->

<!-- page_title_area(S) -->
<%if (!("true").equals(mainPage)){%>
<div class="layer_popup_contents">
<div class="layer_popup_title">
<%} %>	

<div class="page_title_area clear">
    <!-- page_title(S) -->
    <!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
    <h2 class="page_title">
	<%if (("true").equals(mainPage)){%>
		<button type="button">
		<span id="title"></span></button></h2>
	<%}else{%>
		<span id="title1">Yard</span></h2>
	<%} %>	
    <!-- page_title(E) -->
    <!-- opus_design_btn(S) -->
    <div class="opus_design_btn">
        <button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve" style="display: none">Retrieve</button><!--
        --><button type="button" class="btn_normal" name="btn_Save" id="btn_Save" style="display: none">Save</button><!--
        --><button type="button" class="btn_normal" name="btn_Request" id="btn_Request" style="display: none">Request</button><!--
        --><button type="button" class="btn_normal" name="btn_New" id="btn_New" style="display: none">New</button><!--
        --><button type="button" class="btn_normal" name="btn_Close" id="btn_Close" style="display: none">Close</button>
    </div>
    <!-- opus_design_btn(E) -->
    <!-- page_location(S) -->
   <%if (("true").equals(mainPage)){%>
	<div class="location"><span id="navigation"></span></div>
   <%} %>
</div>
   <%if (!("true").equals(mainPage)){%>
	</div>
   <%} %>
   	
<!-- page_title_area(E) -->

<div class="wrap_search">
    <!-- opus_design_inquiry(S) -->
    <div class="opus_design_inquiry wFit">
        <table>
            <colgroup>
                <col width="150"/>
                <col width="410"/>
                <col width="150"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Yard Code</th>
                    <td><input id="yd_cd" style="width: 120px; ime-mode:disabled; text-align:center" class="input1" name="yd_cd" dataformat="engup" maxlength="7" type="text" onBlur="obj_change();" /><button class="input_seach_btn" name="btns_search7" id="btns_search7" type="button"></button></td>
                    <th></th>
                    <td></td>
                    <!-- izanagi branding work, 20170831 
                    <th>Legacy Code</th>
                    <td><input type="text" style="width:150px;text-align:center;" class="input1" dataformat="engup" id="modi_yd_cd" name="modi_yd_cd" maxlength="30"></td>
                    -->
                </tr>
            </tbody>
        </table>
    </div>
    
    <div class="opus_design_inquiry"><table class="line_bluedot"><tr><td></td></tr></table></div>
    
    <!-- opus_design_inquiry(S) -->
    <div class="opus_design_inquiry">
        <table>
            <colgroup>
                <col width=150/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>English Name</th>
                    <td><input id="yd_nm" style="width: 947px;" class="input1" name="yd_nm" dataformat="engup" otherchar="()_\-,. " maxlength="50" type="text" /></td>
                </tr>
                <tr>
                    <th>Local Name</th>
                    <td><input id="yd_locl_lang_nm" style="width: 947px;" class="input" name="yd_locl_lang_nm" maxlength="50" type="text" /> </td>
                </tr>
            </tbody>
        </table>
        
        <table>
            <colgroup>
                <col width="150"/>
                <col width="130"/>
                <col width="150"/>
                <col width="130"/>
                <col width="250"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Yard Character</th>
                    <td><script type="text/javascript">ComComboObject('yd_chr_cd', 1, 85, 1, 1, 0);</script></td>
                    <th>Yard Ownership</th>
                    <td><script type="text/javascript">ComComboObject('yd_oshp_cd', 1, 108, 1, 1, 0);</script></td>
                    <td class="sm">
                        <input id="yd_fcty_tp_mrn_tml_flg" value="Y" class="trans" name="yd_fcty_tp_mrn_tml_flg" type="checkbox" /><label for="yd_fcty_tp_mrn_tml_flg">Marine Terminal</label><!--
                        --><input id="yd_fcty_tp_cy_flg" value="Y" class="trans" name="yd_fcty_tp_cy_flg" type="checkbox" /><label for="yd_fcty_tp_cy_flg">CY</label><!--
                        --><input id="yd_fcty_tp_cfs_flg" value="Y" class="trans" name="yd_fcty_tp_cfs_flg" type="checkbox" /><label for="yd_fcty_tp_cfs_flg">CFS</label><!--
                        --><input id="yd_fcty_tp_rail_rmp_flg" value="Y" class="trans" name="yd_fcty_tp_rail_rmp_flg" type="checkbox" /><label for="yd_fcty_tp_rail_rmp_flg">Rail Ramp</label><!--
                        --><input id="yd_fcty_tp_brg_rmp_flg" value="Y" class="trans" name="yd_fcty_tp_brg_rmp_flg" type="checkbox" /><label for="yd_fcty_tp_brg_rmp_flg">Barge Ramp</label><!--
                        --><input id="yd_fcty_tp_psdo_yd_flg" value="Y" class="trans" name="yd_fcty_tp_psdo_yd_flg" type="checkbox" /><label for="yd_fcty_tp_psdo_yd_flg">Pseudo</label>
                    </td>
                    <td></td>
                </tr>
                <!-- 
                <tr>
                    <th>EQ SCC</th>
                    <td colspan="5"><input id="eq_scc_cd" style="width: 60px; ime-mode:disabled; text-align:center" class="input1" name="eq_scc_cd" dataformat="engup" maxlength="7" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search8" id="btns_search8" type="button"></button></td>
                </tr>
                 -->
            </tbody>
        </table>
        
        <table class="line_bluedot"><tr><td></td></tr></table>
        
        <table>
            <colgroup>
                <col width="150"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Handling Vendor</th>
                    <td><input id="n1st_vndr_seq" style="width: 90px; ime-mode:disabled; text-align:center" class="input1" name="n1st_vndr_seq" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search1" id="btns_search1" type="button"></button><input id="n1st_vndr_nm" style="width: 500px; ime-mode:disabled; text-align:left" class="input2" name="n1st_vndr_nm" readonly type="text" /></td>
                </tr>
                <tr>
                    <th>Stevedoring Vendor</th>
                    <td><input id="n2nd_vndr_seq" style="width: 90px; ime-mode:disabled; text-align:center" class="input" name="n2nd_vndr_seq" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search2" id="btns_search2" type="button"></button><input id="n2nd_vndr_nm" style="width:500px; ime-mode:disabled; text-align:left" class="input2" name="n2nd_vndr_nm" readonly type="text" /></td>
                </tr>
                <tr>
                    <th>Security Vendor</th>
                    <td><input id="n3rd_vndr_seq" style="width: 90px; ime-mode:disabled; text-align:center" class="input" name="n3rd_vndr_seq" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search3" id="btns_search3" type="button"></button><input id="n3rd_vndr_nm" style="width:500px; ime-mode:disabled; text-align:left" class="input2" name="n3rd_vndr_nm" readonly type="text" /> </td>
                </tr>
            </tbody>
        </table>
        
        <table class="line_bluedot"><tr><td></td></tr></table>
        
        <table>
            <colgroup>
                <col width="150"/>
                <col width="130"/>
                <col width="150"/>
                <col width="130"/>
                <col width="150"/>
                <col width="80"/>
                <col width="150"/>
                <col width="80"/>
                <col width="100"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Control Office</th>
                    <td><input id="ofc_cd" style="width: 90px; ime-mode:disabled; text-align:center" class="input1" name="ofc_cd" dataformat="engup" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search4" id="btns_search4" type="button"></button></td>
                    <th>DEM/DET Office</th>
                    <td><input id="dmdt_ofc_cd" style="width: 90px; ime-mode:disabled; text-align:center" class="input1" name="dmdt_ofc_cd" dataformat="engup" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search5" id="btns_search5" type="button"></button></td>
                    <th>DEM I/B Collect</th>
                    <td><select style="width: 60px;" class="input1" name="dem_ib_clt_flg"><option value="N" selected>N</option><option value="Y">Y</option></select></td>
                    <th>DEM O/B Collect</th>
                    <td><select style="width: 60px;" class="input1" name="dem_ob_clt_flg"><option value="N" selected>N</option><option value="Y">Y</option></select></td>
                    <th>Rep. Zone</th>
                    <td><input id="rep_zn_cd" style="width: 80px;ime-mode:disabled;text-align:center" class="input" name="rep_zn_cd" dataformat="engup" maxlength="7" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search6" id="btns_search6" type="button"></button></td>
                </tr>
                <tr>
                    <th>Bonded</th>
                    <td><select style="width: 60px;" class="input1" name="bd_yd_flg" id="bd_yd_flg"><option value="N" selected>N</option><option value="Y">Y</option></select></td>
                    <th>MR Shop</th>
                    <td><select style="width: 60px;" class="input1" name="mnr_shop_flg" id="mnr_shop_flg"><option value="N" selected>N</option><option value="Y">Y</option></select></td>
                    <th>E.I.R Service</th>
                    <td><select style="width: 60px;" class="input1" name="eir_svc_flg" id="eir_svc_flg"><option value="N" selected>N</option><option value="Y">Y</option></select></td>
                    <th>Hub Yard</th>
                    <td><select style="width: 60px;" class="input1" name="hub_yd_flg" id="hub_yd_flg"><option value="N" selected>N</option><option value="Y">Y</option></select></td>
<!--                     <th>BKG Yard</th> -->
<!--                     <td><select style="width: 60px;" class="input" name="bkg_pod_yd_flg" id="bkg_pod_yd_flg"><option value="" selected></option><option value="N">N</option><option value="Y">Y</option></select></td> -->
                	<th>Arrival Notification</th>
                    <td><select style="width: 60px;" class="input" name="rail_arr_ntfc_flg" id="rail_arr_ntfc_flg"><option value="N" selected>N</option><option value="Y">Y</option></select></td>
                </tr>
                <tr>
                    
                </tr>
            </tbody>
        </table>
        
        <table class="line_bluedot"><tr><td></td></tr></table>
        
        <table>
            <colgroup>
                <col width="150"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>English Address</th>
                    <td><input id="yd_addr" style="width: 947px;" class="input1" name="yd_addr" dataformat="excepthan" maxlength="200" type="text" /> </td>
                </tr>
                <tr>
                    <th>Local Address</th>
                    <td><input id="yd_locl_lang_addr" style="width: 947px;" class="input" name="yd_locl_lang_addr" maxlength="200" type="text" /> </td>
                </tr>
            </tbody>
        </table>
        <table>
            <colgroup>
                <col width="150"/>
                <col width="130"/>
                <col width="150"/>
                <col width="130"/>
                <col width="80"/>
                <col width="210"/>
                <col width="80"/>
                <col width="80"/>
                <col width="150"/>
                <col width="80"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Customs No</th>
                    <td><input id="yd_cstms_no" style="width: 100px;" class="input" name="yd_cstms_no" dataformat="engup" maxlength="10" type="text" /> </td>
                    <th>C.E.O</th>
                    <td><input id="yd_ceo_nm" style="width: 100px;" class="input" name="yd_ceo_nm" maxlength="50" type="text" /> </td>
                    <th>P.I.C</th>
                    <td><input id="yd_pic_nm" style="width: 200px;" class="input" name="yd_pic_nm" maxlength="50" type="text" /> </td>
                    <th>E-Mail</th>
                    <td><input id="yd_eml" style="width: 100px;" class="input" name="yd_eml" dataformat="excepthan" maxlength="50" type="text" /> </td>
                </tr>
                <tr>
                    <th>Postal Code</th>
                    <td><input id="zip_cd" style="width: 100px; ime-mode:disabled; text-align:center" class="input" name="zip_cd" maxlength="10" type="text" /> </td>
                    <th>International Tel No</th>
                    <td><input id="intl_phn_no" style="width: 100px; ime-mode:disabled; text-align:right" class="input1" name="intl_phn_no" dataformat="num" otherchar="-" maxlength="4" type="text" /> </td>
                    <th>Tel No</th>
                    <td><input id="phn_no" style="width: 200px; ime-mode:disabled; text-align:right" class="input1" name="phn_no" dataformat="num" otherchar="-" maxlength="20" type="text" /> </td>
                    <th>Fax No</th>
                    <td><input id="fax_no" style="width:100px; ime-mode:disabled; text-align:right" class="input1" name="fax_no" dataformat="num" otherchar="-" maxlength="20" type="text" /> </td>
                    <th>Latitude</th>
                    <td><input id="yd_lat" style="width:100px;ime-mode:disabled;text-align:right" class="input" name="yd_lat" otherchar="." dataformat="singledFloat" maxlength="10"  pointcount="6" type="text" /> </td>
                    <th>Longitude</th>
                    <td><input id="yd_lon" style="width: 100px; ime-mode:disabled; text-align:right" class="input" name="yd_lon" dataformat="singledFloat" maxlength="10" otherchar="." pointcount="6" type="text" /> </td>
                </tr>
            </tbody>
        </table>
        
        <table class="line_bluedot"><tr><td></td></tr></table>
        
        <table>
            <colgroup>
                <col width="150"/>
                <col width="130"/>
                <col width="150"/>
                <col width="130"/>
                <col width="150"/>
                <col width="130"/>
                <col width="150"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Dry AVG Dwell Hours</th>
                    <td><input id="dry_avg_dwll_hrs" style="width: 100px; ime-mode:disabled; text-align:right" class="input1" name="dry_avg_dwll_hrs" dataformat="num" maxlength="4" type="text" /> </td>
                    <th>Dry MIN Dwell Hours</th>
                    <td><input id="dry_min_dwll_hrs" style="width: 100px; ime-mode:disabled; text-align:right" class="input1" name="dry_min_dwll_hrs" dataformat="num" maxlength="4" type="text" /> </td>
                    <th>Reefer AVG Dwell Hours</th>
                    <td><input id="rf_avg_dwll_hrs" style="width: 100px; ime-mode:disabled; text-align:right" class="input1" name="rf_avg_dwll_hrs" dataformat="num" maxlength="4" type="text" /> </td>
                    <th>Reefer MIN Dwell Hours</th>
                    <td><input id="rf_min_dwll_hrs" style="width:100px; ime-mode:disabled; text-align:right" class="input1" name="rf_min_dwll_hrs" dataformat="num" maxlength="4" type="text" /> </td>
                </tr>
            </tbody>
        </table>
        <table>
            <colgroup>
                <col width="150"/>
                <col width="30"/>
                <col width="50"/>
                <col width="200"/>
                <col width="50"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Gate Open(HHMM)</th>
                    <td></td>
                    <td align="right">Week</td>
                    <td><input id="gate_opn_hrmnt" style="width: 80px; ime-mode:disabled; text-align:center" class="input1" name="gate_opn_hrmnt" dataformat="hm" maxlength="5" type="text" />~ <input id="gate_clz_hrmnt" style="width:80px;ime-mode:disabled;text-align:center" class="input1" name="gate_clz_hrmnt" dataformat="hm" maxlength="5" type="text" /> </td>
                    <td align="right">Saturday</td>
                    <td><input id="sat_gate_opn_hrmnt" style="width: 80px; ime-mode:disabled; text-align:center" class="input1" name="sat_gate_opn_hrmnt" dataformat="hm" maxlength="5" type="text" />~ <input id="sat_gate_clz_hrmnt" style="width:80px;ime-mode:disabled;text-align:center" class="input1" name="sat_gate_clz_hrmnt" dataformat="hm" maxlength="5" type="text" /> </td>
                </tr>   
                <tr>
                    <td></td>
                    <td></td>
                    <td align="right">Sunday</td>
                    <td><input id="sun_gate_opn_hrmnt" style="width: 80px; ime-mode:disabled; text-align:center" class="input1" name="sun_gate_opn_hrmnt" dataformat="hm" maxlength="5" type="text" />~ <input id="sun_gate_clz_hrmnt" style="width:80px;ime-mode:disabled;text-align:center" class="input1" name="sun_gate_clz_hrmnt" dataformat="hm" maxlength="5" type="text" /> </td>
                    <td align="right">Holiday</td>
                    <td><input id="hol_gate_opn_hrmnt" style="width: 80px; ime-mode:disabled; text-align:center" class="input1" name="hol_gate_opn_hrmnt" dataformat="hm" maxlength="5" type="text" />~ <input id="hol_gate_clz_hrmnt" style="width:80px;ime-mode:disabled;text-align:center" class="input1" name="hol_gate_clz_hrmnt" dataformat="hm" maxlength="5" type="text" /> </td>
                </tr>   
            </tbody>
        </table>
            
        <table>
            <colgroup>
                <col width="150"/>
                <col width="150"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th><input id="yd_inrl_flg" value="Y" class="trans" name="yd_inrl_flg" type="checkbox" /><label for="yd_inrl_flg"><strong>Inner Rail</strong></label></th>
                    <th>Cargo Closing Time</th>
                    <td><input id="yd_cgo_clz_hrmnt_msg" style="width:803px;" class="input" name="yd_cgo_clz_hrmnt_msg" dataformat="excepthan" maxlength="100" type="text" /> </td>
                </tr>   
            </tbody>
        </table>
        
        <table>
            <colgroup>
                <col width="150"/>
                <col width="30"/>
                <col width="50"/>
                <col width="130"/>
                <col width="50"/>
                <col width="130"/>
                <col width="50"/>
                <col width="180"/>
                <col width="70"/>
                <col width="100"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Berth</th>
                    <td></td>
                    <td align="right">Qty</td>
                    <td><input id="brth_no" style="width: 100px; ime-mode:disabled;text-align:right" class="input" name="brth_no" dataformat="num" maxlength="2" type="text" /> </td>
                    <td align="right">Length(m)</td>
                    <td><input id="yd_brth_len" style="width: 100px; ime-mode:disabled;text-align:right" class="input" name="yd_brth_len" dataformat="float" maxlength="6" type="text" /> </td>
                    <td align="right">Depth(m)</td>
                    <td><input id="yd_brth_alng_sd_desc" style="width: 150px; ime-mode:disabled;text-align:right" class="input" name="yd_brth_alng_sd_desc" dataformat="float" maxlength="100" type="text" /> </td>
                    <td align="right">Channel(m)</td>
                    <td><input id="yd_brth_dpth_chnl_knt" style="width: 150px; ime-mode:disabled;text-align:right" class="input" name="yd_brth_dpth_chnl_knt" dataformat="float" maxlength="23" size="18" pointcount="5" type="text" /> </td>
                </tr>   
                <tr>
                    <th>Space(m2)</th>
                    <td></td>
                    <td align="right">TTL</td>
                    <td><input id="yd_ttl_spc" style="width: 100px; ime-mode:disabled;text-align:right" class="input" name="yd_ttl_spc" dataformat="float" maxlength="9" type="text" /> </td>
                    <td align="right">Actual</td>
                    <td><input id="yd_act_spc" style="width: 100px; ime-mode:disabled;text-align:right" class="input" name="yd_act_spc" dataformat="float" maxlength="9" type="text" /> </td>
                    <td align="right">Company</td>
                    <td><input id="yd_co_spc" style="width: 150px; ime-mode:disabled;text-align:right" class="input" name="yd_co_spc" dataformat="float" maxlength="9" type="text" /> </td>
                    <td align="right">CFS</td>
                    <td><input id="yd_cfs_spc" style="width: 150px; ime-mode:disabled;text-align:right" class="input" name="yd_cfs_spc" dataformat="float" maxlength="9" type="text" /> </td>
                    <th>Capacity</th>
                    <td><input id="vsl_capa" style="width: 150px; ime-mode:disabled; text-align:right" class="input" name="vsl_capa" dataformat="int" maxlength="23" size="18" type="text" /> </td>
                  </tr>   
            </tbody>
        </table>
        
        <table class="line_bluedot"><tr><td></td></tr></table>
        
        <table>
            <colgroup>
                <col width="150"/>
                <col width="130"/>
                <col width="150"/>
                <col width="130"/>
                <col width="150"/>
                <col width="130"/>
                <col width="150"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Reefer Receptacle 440(V)</th>
                    <td><input id="yd_rf_rcpt_440v_knt" style="width: 60px; ime-mode:disabled;text-align:right" class="input" name="yd_rf_rcpt_440v_knt" dataformat="float" maxlength="6" type="text" /> </td>
                    <th>Reefer Receptacle 220(V)</th>
                    <td><input id="yd_rf_rcpt_220v_knt" style="width: 60px; ime-mode:disabled;text-align:right" class="input" name="yd_rf_rcpt_220v_knt" dataformat="float" maxlength="6" type="text" /> </td>
                    <th>Reefer Receptacle Dual</th>
                    <td><input id="yd_rf_rcpt_dul_knt" style="width: 60px; ime-mode:disabled;text-align:right" class="input" name="yd_rf_rcpt_dul_knt" dataformat="float" maxlength="6" type="text" /> </td>
                    <th>Operation System</th>
                    <td><script type="text/javascript">ComComboObject('yd_op_sys_cd', 1, 108, 1, 0);</script></td>
                </tr>
                <tr>
                    <th>Post Panamax G/Crane</th>
                    <td><input id="yd_pst_pgc_knt" style="width: 60px; ime-mode:disabled;text-align:right" class="input" name="yd_pst_pgc_knt" dataformat="float" maxlength="6" type="text" /> </td>
                    <th>Panamax G/Crane</th>
                    <td><input id="yd_pgc_knt" style="width: 60px; ime-mode:disabled;text-align:right" class="input" name="yd_pgc_knt" dataformat="float" maxlength="6" type="text" /> </td>
                    <th>Transtrainer</th>
                    <td><input id="trstr_knt" style="width: 60px; ime-mode:disabled;text-align:right" class="input" name="trstr_knt" dataformat="float" maxlength="6" type="text" /> </td>
                    <th>Fork Lift</th>
                    <td><input id="frk_knt" style="width: 108px; ime-mode:disabled;text-align:right" class="input" name="frk_knt" dataformat="float" maxlength="6" type="text" /> </td>
                </tr>   
                <tr>
                    <th>Straddle Carrier</th>
                    <td><input id="yd_strdl_crr_knt" style="width: 60px; ime-mode:disabled;text-align:right" class="input" name="yd_strdl_crr_knt" dataformat="float" maxlength="6" type="text" /> </td>
                    <th>Tractor</th>
                    <td><input id="yd_trct_knt" style="width: 60px; ime-mode:disabled;text-align:right" class="input" name="yd_trct_knt" dataformat="float" maxlength="6" type="text" /> </td>
                    <th>Top Lift</th>
                    <td><input id="yd_top_lft_knt" style="width: 60px; ime-mode:disabled;text-align:right" class="input" name="yd_top_lft_knt" dataformat="float" maxlength="6" type="text" /> </td>
                    <th>Terminal Chassis</th>
                    <td><input id="tml_chss_knt" style="width: 108px; ime-mode:disabled;text-align:right" class="input" name="tml_chss_knt" dataformat="float" maxlength="6" type="text" /> </td>
                </tr>
            </tbody>
        </table>
        
        <table class="line_bluedot"><tr><td></td></tr></table>
        
        <table>
            <colgroup>
                <col width="150"/>
                <col width="130"/>
                <col width="150"/>
                <col width="130"/>
                <col width="150"/>
                <col width="130"/>
                <col width="150"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Handling Year</th>
                    <td><input id="yd_hndl_yr" style="width: 100px; ime-mode:disabled; text-align:right" class="input" name="yd_hndl_yr" dataformat="num" maxlength="4" type="text" /> </td>
                    <th>H/D CAPA(/YR)</th>
                    <td><input id="yd_hndl_capa" style="width: 100px; ime-mode:disabled; text-align:right" class="input" name="yd_hndl_capa" dataformat="float" maxlength="23" size="18" pointcount="3" type="text" /> </td>
                    <th>G/C G. Product(/HR)</th>
                    <td colspan="3"><input id="tml_prod_knt" style="width: 100px; ime-mode:disabled; text-align:right" class="input" name="tml_prod_knt" dataformat="float" maxlength="6" type="text" /> </td>
                </tr>
                <tr>
                    <th>H/D VOL TTL TEU</th>
                    <td><input id="yd_ttl_vol_teu_knt" style="width: 100px; ime-mode:disabled; text-align:right" class="input" name="yd_ttl_vol_teu_knt" dataformat="float" maxlength="19" type="text" /> </td>
                    <th>H/D VOL TTL BOX</th>
                    <td><input id="yd_ttl_vol_bx_knt" style="width: 100px; ime-mode:disabled; text-align:right" class="input" name="yd_ttl_vol_bx_knt" dataformat="float" maxlength="19" type="text" /> </td>
                    <th>H/D VOL TTL TEU(OWN)</th>
                    <td><input id="yd_co_vol_teu_knt" style="width: 100px; ime-mode:disabled; text-align:right" class="input" name="yd_co_vol_teu_knt" dataformat="float" maxlength="19" type="text" /> </td>
                    <th>H/D VOL TTL BOX(OWN)</th>
                    <td colspan="3"><input id="yd_co_vol_bx_knt" style="width: 110px; ime-mode:disabled; text-align:right" class="input" name="yd_co_vol_bx_knt" dataformat="float" maxlength="19" type="text" /> </td>
                </tr>   
            </tbody>
        </table>
        
        <table>
            <colgroup>
                <col width="150"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Remarks</th>
                    <td><input id="yd_rmk" style="width: 950px;" class="input" name="yd_rmk" maxlength="1000" type="text" /> </td>
                </tr>   
            </tbody>
        </table>
        
        <table class="line_bluedot"><tr><td></td></tr></table>
        
        <table>
        	<colgroup>
                <col width="150"/>
                <col width="120">
            	<col width="100">
            	<col width="120">
            	<col width="100">
            	<col width="150">
            	<col width="100">
            	<col width="120">
            	<col width="100">
                <col width="*"/>
            </colgroup>
            <tbody>
                <tr>
                    <th>Delete Flag</th>
                    <td>
                        <select style="width:80px;" name="delt_flg" class="input" id="delt_flg" onChange="obj_change();">
                            <option value="N" selected>N</option>
                            <option value="Y">Y</option>
                        </select>
                    </td>
                    <th>Create User</th>
		            <td><input type="text" style="width:80px;text-align:center;" class="input" name="cre_usr_id" id="cre_usr_id" readOnly/>
		            </td>
		            <th>Create Date/Time</th>
		            <td><input type="text" style="width:120px;text-align:center;" class="input" name="cre_dt" id="cre_dt" readOnly/>
		            </td>
		            <th>Last Update User</th>
		            <td><input type="text" style="width:80px;text-align:center;" class="input" name="upd_usr_id" id="upd_usr_id" readOnly/>
		            </td>
		            <th>Last Update Date/Time</th>
		            <td><input type="text" style="width:120px;text-align:center;" class="input" name="upd_dt" id="upd_dt" readOnly/>
		            </td>
                </tr>   
            </tbody>
        </table>
    </div>
    <!-- opus_design_inquiry(E) -->
</div>
        
<div class="wrap_result">
    <!-- opus_design_grid(S) -->
    <div class="opus_design_grid wFit">
        <script type="text/javascript">ComSheetObject('sheet1');</script>
    </div>
</div>

<%if (!("true").equals(mainPage)){%>
</div>
<%} %>	
<!-- opus_design_grid(E) -->
</form>