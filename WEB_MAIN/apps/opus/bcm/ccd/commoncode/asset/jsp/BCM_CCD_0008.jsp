<%/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0008.jsp
*@FileTitle  : Container Vessel 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/09
=========================================================*/%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.asset.event.BcmCcd0008Event"%>
<%@ page import="com.clt.apps.opus.bcm.sup.valuemanage.util.ConstantMgr"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
    BcmCcd0008Event  event = null;              //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;         //Error from server
    String strErrMsg = "";                      //Error message
    int rowCount     = 0;                       //Count of DB resultSet list
    
    String successFlag = "";
    String codeList  = "";
    String pageRows  = "100";

    String strUsr_id        = "";
    String strUsr_nm        = "";
    Logger log = Logger.getLogger("com.clt.apps.opus.bcm.ccd.commoncode.asset");
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
        
        event = (BcmCcd0008Event)request.getAttribute("Event");
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

<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="mdm_yn" value="Y" id="mdm_yn" />
<input type="hidden" name="creflag" value="Y" id="creflag" />
<input type="hidden" name="mst_dat_subj_cd" value="VESL" id="mst_dat_subj_cd" />
<input type="hidden" name="rqst_no" value="<%=rqstNo%>" id="rqst_no" />
<input type="hidden" name="proc_tp_cd" value="<%=procTpCd%>" id="proc_tp_cd" />
<input type="hidden" name="rqst_usr_chk" value="<%=rqstUsrChk%>" id="rqst_usr_chk" />
<input type="hidden" name="rqst_ofc_cd" value="<%=rqstOfcCd%>" id="rqst_ofc_cd" />
<input type="hidden" name="own_crr_cd" value="<%=ConstantMgr.getCompanyCode()%>" id="own_crr_cd" />

<%if (!("true").equals(mainPage)){%>
<div class="layer_popup_contents">
<div class="layer_popup_title">
<%} %>	

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
    <!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
    <h2 class="page_title">
    <%if (("true").equals(mainPage)){%>
		<button type="button">
		<span id="title"></span></button></h2>
	<%}else{%>
		<span id="title1">Vessel Particular</span></h2>
	<%} %>	
    <!-- page_title(E) -->
    <!-- opus_design_btn(S) -->
    <div class="opus_design_btn">
        <button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve" style='display:none'>Retrieve</button><!--
        --><button type="button" class="btn_normal" name="btn_Save"     id="btn_Save" style='display:none'>Save</button><!--
        --><button type="button" class="btn_normal"  name="btn_Request"     id="btn_Request" style='display:none'>Request</button><!--
        --><button type="button" class="btn_normal" name="btn_New"  id="btn_New" style='display:none'>New</button><!--
        --><button type="button"  class="btn_normal" name="btn_Close"   id="btn_Close" style='display:none'>Close</button>  
    </div>
    <!-- opus_design_btn(E) -->

    <!-- page_location(S) -->
   <%if (("true").equals(mainPage)){%>
	<div class="location">	
		<span id="navigation"></span>
	</div>
   <%}else{%>
	</div>
   <%}%>
</div>
<!-- page_title_area(E) -->
<!-- opus_design_inquiry(S) -->
<div class= "wrap_search">
    <div class= "opus_design_inquiry wFit">
        <table>
            <colgroup>
                <col width="120"/>
                <col width="120"/>
                <col width="140"/>
                <col width="127"/>
                <!--
                <col width="146"/>
                <col width="146"/>
				<col width="146"/>
				<col width="146"/>  -->
				<col width="1">
				<col width="120"/>
				<col width="120"/>
				<col width="120"/>
                <col width="*"/>
            </colgroup>
            <tbody>
                <tr>
                    <th>Vessel Code</th>
                    <td><input type="text" style="width:50px;text-align:center;ime-mode:disabled;" class="input1" dataformat="engup" name="vsl_cd" maxlength="4" id="vsl_cd" onBlur="obj_change();"/><!--
                        --><button type="button" id="btns_search1" name="btns_search1" class="input_seach_btn"></button></td>
                    <th>Ownership</th>
                    <td><script type="text/javascript">ComComboObject('vsl_own_ind_cd', 1, 100, 0, 0, 0, false)</script></td>
                    <!--
                    <th>VIP Code (NYK Code)</th>
                    <td><input id="modi_vsl_cd" type="text" style="width:150px" class="input1" dataformat="engup" id="modi_vsl_cd" name="modi_vsl_cd" maxlength="3" onBlur="obj_change();"></td>
                    <th>VIP Ope. Kind</th> -->
                    <td style="visibility:hidden"><script type="text/javascript">ComComboObject('modi_vsl_opr_tp_cd', 2, 1, 0, 0, 0, false)</script></td>
                	<th>Alliance Vessel Code</th>
                    <td><input type="text" style="width:100px;" class="input" dataformat="engup"  name="modi_alln_vsl_cd" maxlength="6" id="modi_alln_vsl_cd" /> </td>
                    <th>Legacy Vessel Code</th>
                    <td>
                    <table>
                    	<tr>
                    	<td>
                    	<div style="position: relative; width:120px;">
	                    <input type="text" dataformat="engup" style="width:100%;" class="input" id="nyk_lgcy_vsl_cd_ctnt" name="nyk_lgcy_vsl_cd_ctnt" maxlength="10" readOnly />
	                    <img src='img/nyk_line.jpg' style="width:50px; height:20px; position:absolute; top:2px; right:2px;" />
	                    </div>
	                    </td><td>		                    
	                    <div style="position: relative; width:120px;">
	                    <input type="text" dataformat="engup" style="width:100%;" class="input" id="mol_lgcy_vsl_cd_ctnt" name="mol_lgcy_vsl_cd_ctnt" maxlength="10" readOnly/>
	                    <img src='img/mol_line.jpg' style="width:50px; height:20px; position:absolute; top:2px; right:2px;" />
	                    </div>
	                    </td><td>
	                    <div style="position: relative; width:120px;">
	                    <input type="text" dataformat="engup" style="width:100%;" class="input" id="kline_lgcy_vsl_cd_ctnt" name="kline_lgcy_vsl_cd_ctnt" maxlength="10" readOnly/>
	                    <img src='img/k_line.jpg' style="width:50px; height:20px; position:absolute; top:2px; right:2px;" />
	                    </div>
	                    </td>
	                    </tr></table>
                    </td>
                 </tr>
            </tbody>
        </table>
    </div>
<!-- opus_design_inquiry(E) -->
	<table class="line_bluedot"><tr><td></td></tr></table>

    <div class= "opus_design_inquiry">
        <table>
            <colgroup>
                <col width="120"/>
                <col width="120"/>
                <col width="140"/>
                <col width="130"/>
                <col width="140"/>
                <col width="120"/>
                <col width="120"/>
                <col width="130"/>
                <col width="120"/>
                <col width="*"/>
            </colgroup>
            <tbody>
                <tr>
                    <th>Vessel Name(ENG)</th>
                    <td colspan="3"><input type="text" style="width:380px;text-align:left;ime-mode:disabled;" class="input1" dataformat="engup" otherchar="()_\-,. '" name="vsl_eng_nm" maxlength="50" id="vsl_eng_nm" /></td>
                    <th>Vessel Name(Local)</th>
                    <td colspan="5"><input type="text" style="width:445px;text-align:left;"  class="input" name="vsl_locl_nm" maxlength="50" id="vsl_locl_nm" /></td>
                </tr>   
                <tr>
                    <th>Carrier</th>
                    <td><input type="text" style="width:50px;text-align:center;ime-mode:disabled;" class="input1" dataformat="engup" name="crr_cd" maxlength="3" id="crr_cd" onBlur="obj_change();"/><button type="button" id="btns_search2" name="btns_search2" class="input_seach_btn"></button></td>
                    <th>New Built</th>
                    <td><script type="text/javascript">ComComboObject('vsl_bld_cd', 1, 60, 0, 0, 0, false)</script></td>
                    <th>Builder</th>
                    <td><input type="text" style="width:100px;" class="input"   name="vsl_bldr_nm" maxlength="50" id="vsl_bldr_nm" /> </td>
                    <th>Company</th>
                    <td><input type="text" style="width:50PX;ime-mode:disabled;" class="input" dataformat="engup" name="co_cd" maxlength="1"></td>
                    <th>Build Area Name</th>
                    <td><input type="text" style="width:100px;text-align:left;" class="input"  name="vsl_bld_area_nm" maxlength="500" id="vsl_bld_area_nm" /> </td>
                </tr>   
                <tr><td class="line_bluedot" colspan="11"></td></tr>
                <tr>
                    <th>Call Sign</th>
                    <td><input type="text" style="width:100px;ime-mode:disabled;" class="input1" dataformat="engup" name="call_sgn_no" maxlength="15" id="call_sgn_no" /> </td>
                    <th>Flag</th>
                    <td><input type="text" style="width:50px;text-align:center;ime-mode:disabled;" class="input1" dataformat="engup" name="vsl_rgst_cnt_cd" maxlength="2" id="vsl_rgst_cnt_cd" onBlur="obj_change();"/><button type="button" id="btns_search3" name="btns_search3" class="input_seach_btn"></button></td>
                    <th>Port Of Registry</th>
                    <td><input type="text" style="width:70px;text-align:center;ime-mode:disabled;" class="input" dataformat="engup" name="rgst_port_cd" maxlength="5" id="rgst_port_cd" onBlur="obj_change();"/><button type="button" id="btns_search4" name="btns_search4" class="input_seach_btn"></button></td>
                    <th>Class</th>
                    <td colspan="3"><script type="text/javascript">ComComboObject('clss_no_rgst_area_nm', 1, 120, 0, 0, 0, false)</script></td>
                </tr>
                <tr>
                    <th>Class No</th>
                    <td><input type="text" style="width:100px;text-align:left;ime-mode:disabled;" class="input" dataformat="eng" name="vsl_clss_no" maxlength="10" id="vsl_clss_no" /> </td>
                    <th>IMO No(LLOYD No)</th>
                    <td><input type="text" style="width:130px;text-align:left;ime-mode:disabled;" class="input1" dataformat="eng" name="lloyd_no" maxlength="20" id="lloyd_no" /> </td>
                    <th>Hull No</th>
                    <td><input type="text" style="width:100px;text-align:left;ime-mode:disabled;" class="input" dataformat="eng" name="vsl_hl_no" maxlength="15" id="vsl_hl_no" /> </td>
                    <th>Crew Count</th>
                    <td colspan="3"><input type="text" style="width:120px;text-align:right;ime-mode:disabled;" class="input" dataformat="float" name="crw_knt" maxlength="5" id="crw_knt" /> </td>
                </tr>   
                <tr>
                    <th>P&amp;I CLUB</th>
                    <td><input type="text" style="width:100px;" class="input" name="piclb_desc"  maxlength="100" id="piclb_desc" /> </td> 
                    <th>EDI Vessel Name</th>
                    <td><input type="text" style="width:130px;text-align:left;ime-mode:disabled;" class="input" dataformat="eng" otherchar=" "  name="vsl_edi_nm" maxlength="50" id="vsl_edi_nm" /> </td>
                    <th>Tel No</th>
                    <td><input type="text" style="width:100px;text-align:left;ime-mode:disabled;" class="input" dataformat="num" otherchar="-" name="phn_no" maxlength="20" id="phn_no" /> </td>
                    <th>Fax</th>
                    <td><input type="text" style="width:120px;text-align:left;ime-mode:disabled;" class="input" "num" otherchar="-" name="fax_no" maxlength="20" id="fax_no" /> </td>
                    <th>TLX</th>
                    <td><input type="text" style="width:116px;text-align:left;ime-mode:disabled;" class="input" "num" otherchar="-" name="tlx_no" maxlength="20" id="tlx_no" /> </td>
                </tr>   
                <tr>
                    <th>E-Mail</th>
                    <td colspan="2"><input type="text" style="width:190px;ime-mode:disabled;" dataformat="excepthan" class="input" name="vsl_eml" maxlength="50" id="vsl_eml" /> </td>
                    <th>Registered No</th>
                    <td colspan="2"><input type="text" style="width:180px;text-align:left;ime-mode:disabled;" dataformat="eng" class="input" name="rgst_no" maxlength="15" id="rgst_no" /> </td>
                    <th>Feeder Division</th>
                    <td><script type="text/javascript">ComComboObject('fdr_div_cd', 1, 120, 0, 1, 0, false)</script></td>
                    <th>Common Vessel</th>
                    <td>
                        <select style="width:85px;" class="input" name="vsl_clss_flg" id="vsl_clss_flg" onBlur="obj_change();">
                            <option value="Y">Y</option>
                            <option value="N" selected>N</option>
                        </select>
                    </td>
                </tr>   
                 <tr>
                    <th>Keel Laid Date</th>
                    <td><input type="text" style="width:85px;text-align:center;ime-mode:disabled;" class="input" caption="Keel Laid Date" dataformat="ymd" name="vsl_kel_ly_dt" maxlength="8" id="vsl_kel_ly_dt" /><button type="button" id="btns_vsl_kel_ly_dt" name="btns_vsl_kel_ly_dt" class="calendar ir"></button></td>
                    <th>Built Date</th>
                    <td><input type="text" style="width:85px;text-align:center;ime-mode:disabled;" class="input" caption="Launched Date" dataformat="ymd" name="vsl_lnch_dt" maxlength="8" id="vsl_lnch_dt" /><button type="button" id="btns_vsl_lnch_dt" name="btns_vsl_lnch_dt" class="calendar ir"></button></td>
                    <th>Delivered Date</th>
                    <td><input type="text" style="width:85px;text-align:center;ime-mode:disabled;" class="input" caption="Delivered Date" dataformat="ymd" name="vsl_de_dt" maxlength="8" id="vsl_de_dt" /><button type="button" id="btns_vsl_de_dt" name="btns_vsl_de_dt" class="calendar ir"></button></td>
                    <th>Registered Date</th>
                    <td><input type="text" style="width:85px;text-align:center;ime-mode:disabled;" class="input" caption="Registered Date" dataformat="ymd" name="rgst_dt" maxlength="8" id="rgst_dt" /><button type="button" id="btns_rgst_dt" name="btns_rgst_dt" class="calendar ir"></button></td>
                    <th>Close Date</th>
                    <td><input type="text" style="width:85px;text-align:center;ime-mode:disabled;" class="input" caption="Close Date" dataformat="ymd" name="vsl_clz_dt" maxlength="8" id="vsl_clz_dt" /><button type="button" id="btns_vsl_clz_dt" name="btns_vsl_clz_dt" class="calendar ir"></button></td>
                </tr>   
                <tr>
                    <th>Vessel Remark</th>
                    <td colspan="9"><input type="text" style="width:840px;text-align:left;" class="input" ddataformat="eng" otherchar=" " name="vsl_rmk" maxlength="1000" id="vsl_rmk" /> </td>
                </tr>
                <tr><td class="line_bluedot" colspan="10"></td></tr>
            </tbody>
        </table>

        <table>
            <tbody>
                <tr>
                    <th width="120px">CNTR Capacity</th>
                    <td width="3px"></td>
                    <td width="80px" style="text-align:right">Design</td>
                    <td width="80px"><input type="text" style="width:100px;text-align:right;ime-mode:disabled;" class="input" caption="Design" dataformat="float" name="cntr_dzn_capa" maxlength="8"  id="cntr_dzn_capa" /> </td>
                    <td width="80px" style="text-align:right">Operation</td>
                    <td width="80px"><input type="text" style="width:100px;text-align:right;ime-mode:disabled;" class="input" caption="Operation" dataformat="float" name="cntr_op_capa" maxlength="8"  id="cntr_op_capa" /> </td>
                    <td width="80px" style="text-align:right">Panama</td>
                    <td width="80px"><input type="text" style="width:100px;text-align:right;ime-mode:disabled;" class="input" caption="Panama" dataformat="float" name="cntr_pnm_capa" maxlength="7"  id="cntr_pnm_capa" /> </td>
                    <td width="80px" style="text-align:right">OPER(R/F)</td>
                    <td width="80px"><input type="text" style="width:100px;text-align:right;ime-mode:disabled;" class="input" dataformat="float" name="rf_rcpt_knt" maxlength="5" id="rf_rcpt_knt" /> </td>
                    <td width="80px" style="text-align:right">Max(R/F)</td>
                    <td><input type="text" style="width:70px;text-align:right;ime-mode:disabled;" class="input" dataformat="float" name="rf_rcpt_max_knt" maxlength="5"  id="rf_rcpt_max_knt" /> </td>
                </tr>   
                <tr >
                    <td></td>
                    <td></td>
                    <td style="text-align:right">Vessel Class(TEU)</td>
                    <td><input type="text" style="width:100px;text-align:right;ime-mode:disabled;" class="input1" caption="Vessel Class(TEU)" dataformat="float" name="cntr_vsl_clss_capa" maxlength="13"  id="cntr_vsl_clss_capa" /> </td>
                    <td style="text-align:right">Total TEU</td>
                    <td><input type="text" style="width:100px;text-align:right;ime-mode:disabled;" class="input" caption="Total TEU" dataformat="float" name="ttl_teu_knt" maxlength="13"  id="ttl_teu_knt" /> </td>
                    <td style="text-align:right">Hatch CNT</td>
                    <td><input type="text" style="width:100px;text-align:right;ime-mode:disabled;" class="input" dataformat="float" name="vsl_htch_knt" maxlength="5" id="vsl_htch_knt" /> </td>
                    <td style="text-align:right">Hold CNT</td>
                    <td colspan="3"><input type="text" style="width:100px;text-align:right;ime-mode:disabled;" class="input" dataformat="float" name="vsl_hld_knt" maxlength="5" id="vsl_hld_knt" /> </td>
                </tr>
                <tr><td><table class="line_bluedot"><tr><td></td></tr></table></tr>
                <tr>
                    <th>Dimension(M)</th>
                    <td></td>
                    <td style="text-align:right">L.O.A</td>
                    <td><input type="text" style="width:100px;text-align:right;ime-mode:disabled;" class="input" caption="L.O.A(M)" dataformat="float" name="loa_len" maxlength="6" id="loa_len" /> </td>
                    <td style="text-align:right">L.B.P</tdh>
                    <td><input type="text" style="width:80px;text-align:right;ime-mode:disabled;" class="input" caption="L.B.P (M)" dataformat="float" name="lbp_len" maxlength="6" id="lbp_len" /> </td>
                    <td style="text-align:right">Breadth</td>
                    <td><input type="text" style="width:100px;text-align:right;ime-mode:disabled;" class="input" caption="Breadth(M)" dataformat="float" name="vsl_wdt" maxlength="6"  id="vsl_wdt" /> </td>
                    <td style="text-align:right">Depth</tdh>
                    <td><input type="text" style="width:100px;text-align:right;ime-mode:disabled;" class="input" caption="Depth (M)" dataformat="singledFloat" pointcount="3" name="vsl_dpth" maxlength="7"" id="vsl_dpth" /> </td>
                    <td style="text-align:right">Height</td>
                    <td><input type="text" style="width:70px;text-align:right;ime-mode:disabled;" class="input" caption="Height (M)" dataformat="float" name="vsl_hgt" maxlength="6"  id="vsl_hgt" /> </td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td style="text-align:right">Summer Draft</td>
                    <td><input type="text" style="width:100px;text-align:right;ime-mode:disabled;" class="input" caption="Summer Draft (M)" dataformat="float" name="smr_drft_hgt" maxlength="6"  id="smr_drft_hgt" /> </td>
                    <td style="text-align:right">Freeboard</td>
                    <td colspan="7"><input type="text" style="width:80px;text-align:right;ime-mode:disabled;" class="input" caption="Freeboard (M)" dataformat="float" name="fbd_capa" maxlength="6"  id="fbd_capa" /> </td>
                </tr>   
                <tr>
                    <th>Speed(Knots)</th>
                    <td></td>
                    <td style="text-align:right">Economy</td>
                    <td><input type="text" style="width:100px;text-align:right;ime-mode:disabled;" class="input" caption="Economy/Speed(Knots)" dataformat="float" name="ecn_spd" maxlength="4" id="ecn_spd" pointcount="1"/> </td>
                    <td style="text-align:right">Service</td>
                    <td><input type="text" style="width:80px;text-align:right;ime-mode:disabled;" class="input1" caption="Service/Speed(Knots)" dataformat="float" name="vsl_svc_spd" maxlength="4" id="vsl_svc_spd" pointcount="1"/> </td>
                    <td style="text-align:right">Max</td>
                    <td colspan="5"><input type="text" style="width:100px;text-align:right;ime-mode:disabled;" class="input" caption="Max/Speed (Knots)" dataformat="float" name="max_spd" maxlength="4" id="max_spd" pointcount="1"/> </td>
                </tr>
                <tr >
                    <th>Others(MT)</th>
                    <td></td>
                    <td style="text-align:right">Displacement</td>
                    <td><input type="text" style="width:100px;text-align:right;ime-mode:disabled;" class="input" caption="Displacement(MT)" dataformat="float" name="dpl_capa" maxlength="13" id="dpl_capa" /> </td>
                    <td style="text-align:right">Dead Weight</td>
                    <td><input type="text" style="width:80px;text-align:right;ime-mode:disabled;" class="input" caption="Dead Weight (MT)" dataformat="float" name="dwt_wgt" maxlength="8"  id="dwt_wgt" /> </td>
                    <td style="text-align:right">Light Ship</td>
                    <td colspan="5"><input type="text" style="width:100px;text-align:right;ime-mode:disabled;" caption="Light Ship (MT)" class="input" dataformat="float" name="lgt_shp_tong_wgt" maxlength="7"  id="lgt_shp_tong_wgt" /> </td>
                </tr>
                <tr><td><table class="line_bluedot"><tr><td></td></tr></table></tr>
            </tbody>
          </table>
          <table>
          	<tbody>    
                <tr>
                    <th width="120px">Tonnage</th>
                    <th width="80px">International</th>
                    <td width="3px"></td>
                    <td width="80px" style="text-align:right">Gross Ton</td>
                    <td width="100px"><input type="text" style="width:80px;text-align:right;ime-mode:disabled;" class="input1" caption="International Gross Ton" dataformat="float" name="grs_rgst_tong_wgt" maxlength="8" id="grs_rgst_tong_wgt" /> </td>
                    <td width="100px" style="text-align:right">Net Ton</td>
                    <td colspan="6"><input type="text" style="width:80px;text-align:right;ime-mode:disabled;" class="input1" caption="International Net Ton" dataformat="float" name="net_rgst_tong_wgt" maxlength="8"  id="net_rgst_tong_wgt" /> </td>
                </tr>   
                <tr >
                    <td></td>
                    <th>Panama</th>
                    <td width="3"></td>
                    <td style="text-align:right">Gross Ton</td>
                    <td><input type="text" style="width:80px;text-align:right;ime-mode:disabled;" class="input" caption="Panama Gross Ton" dataformat="float" name="pnm_gt_wgt" maxlength="8"  id="pnm_gt_wgt" /> </td>
                    <td style="text-align:right">Panama Net Ton</td>
                    <td colspan="6"><input type="text" style="width:80px;text-align:right;ime-mode:disabled;" class="input" caption="Panama Net Ton" dataformat="float" name="pnm_net_tong_wgt" maxlength="8"  id="pnm_net_tong_wgt" /> </td>
                </tr>
                <tr>
                    <td></td>
                    <th>Suez</th>
                    <td width="10px"></td>
                    <td style="text-align:right">Gross Ton</td>
                    <td><input type="text" style="width:80px;text-align:right;ime-mode:disabled;" class="input" caption="Suez Gross Ton" dataformat="float" name="suz_gt_wgt" maxlength="8" id="suz_gt_wgt" /> </td>
                    <td style="text-align:right">Suez Net Ton</td>
                    <td width="105px"><input type="text" style="width:80px;text-align:right;ime-mode:disabled;" class="input" caption="Suez Net Ton" dataformat="float" name="suz_net_tong_wgt" maxlength="8"  id="suz_net_tong_wgt" /> </td>
                    <td width="150px" style="text-align:right">Net Ton (Maiden Voyage)</td>
                    <td colspan="4"><input type="text" style="width:90px;text-align:right;ime-mode:disabled;" class="input" caption="Suez Net Ton (Maidan Voyage)" dataformat="float" name="madn_voy_suz_net_tong_wgt" maxlength="10" id="madn_voy_suz_net_tong_wgt" /> </td>
                </tr>   
                <tr>
                    <td></td>
                    <td class="align_right">ITC</td>
                    <td width="10"></td>
                    <td colspan="9">
                        <select style="width:60px;" class="input" name="intl_tong_certi_flg" id="intl_tong_certi_flg">
                            <option value="Y">Y</option>
                        </select>
                    </td>
                </tr>   
                <tr><td class="line_bluedot" colspan="11"></td></tr>
              </tbody>
          </table>
          <table>
          	<tbody>    
                <tr>
                    <th width="120px">Oil/Water Capacity(CBM)</th>
                    <td width="25px"></td>
                    <td width="30px" style="text-align:right">F.O</td>
                    <td width="90px"><input type="text" style="width:80px;text-align:right;ime-mode:disabled;" class="input" caption="F.O (CAPA/CBM)" dataformat="float" name="foil_capa" maxlength="19"  id="foil_capa" /> </td>
                    <td width="30px" style="text-align:right">D.O</td>
                    <td width="90px"><input type="text" style="width:80px;text-align:right;ime-mode:disabled;" class="input" captiㅐon="D.O (CAPA/CBM)" dataformat="float" name="doil_capa" maxlength="19"  id="doil_capa" /> </td>
                    <td width="30px" style="text-align:right">F.W</td>
                    <td width="90px"><input type="text" style="width:80px;text-align:right;ime-mode:disabled;" class="input" caption="F.W (CAPA/CBM)" dataformat="float" name="frsh_wtr_capa" maxlength="19"  id="frsh_wtr_capa" /> </td>
                    <td width="45px" style="text-align:right">Ballast</td>
                    <td><input type="text" style="width:90px;text-align:right;ime-mode:disabled;" class="input" caption="Ballast (CAPA/CBM)" dataformat="float" name="blst_tnk_capa" maxlength="19"  id="blst_tnk_capa" /> </td>
                </tr>   
                <tr>
                    <th>Daily Consumption(MT)</th>
                    <td></td>
                    <td style="text-align:right">F.O</td>
                    <td><input type="text" style="width:80px;text-align:right;ime-mode:disabled;" class="input" caption="F.O (Consumption/MT)" dataformat="float" name="foil_csm" maxlength="5"  id="foil_csm" /> </td>
                    <td style="text-align:right">D.O</td>
                    <td><input type="text" style="width:80px;text-align:right;ime-mode:disabled;" class="input" caption="D.O (Consumption/MT)" dataformat="float" name="doil_csm" maxlength="9" pointcount="4" id="doil_csm" /> </td>
                    <td style="text-align:right">F.W</td>
                    <td colspan="3"><input type="text" style="width:80px;text-align:right;ime-mode:disabled;" class="input" caption="F.W (Consumption/MT)" dataformat="float" name="frsh_wtr_csm" maxlength="9" pointcount="2" id="frsh_wtr_csm" /> </td>
                </tr>   
                <tr><td class="line_bluedot" colspan="10"></td></tr>    
            </tbody>
        </table>
                
        <table>
            <tbody>
                <tr>
                    <th width="120px">Main Engine</th>
                    <th width="85px">Maker</th>
                    <td width="190px"><input type="text" style="width:180px;text-align:left;" class="input"  name="mn_eng_mkr_nm" maxlength="50" id="mn_eng_mkr_nm" /> </td>
                    <th width="40px">Type</th>
                    <td width="190px"><input type="text" style="width:180px;text-align:left;" class="input"  name="mn_eng_tp_desc" maxlength="100" id="mn_eng_tp_desc" /> </td>
                    <th width="40px">B.H.P</th>
                    <td width="90px"><input type="text" style="width:80px;text-align:right;ime-mode:disabled;" class="input" dataformat="float" name="mn_eng_bhp_pwr" maxlength="7" id="mn_eng_bhp_pwr" /> </td>
                    <th width="40px">R.P.M</th>
                    <td><input type="text" style="width:90px;text-align:right;ime-mode:disabled;" class="input" dataformat="float" name="mn_eng_rpm_pwr" maxlength="7" id="mn_eng_rpm_pwr" /> </td>
                </tr>
                <tr>
                    <th>Bow Thruster</th>
                    <th>Maker</th>
                    <td><input type="text" style="width:180px;text-align:left;" class="input"  name="bwthst_mkr_nm" maxlength="50" id="bwthst_mkr_nm" /> </td>
                    <th>Type</th>
                    <td><input type="text" style="width:180px;text-align:left;" class="input"  name="bwthst_tp_desc" maxlength="100" id="bwthst_tp_desc" /> </td>
                    <th>B.H.P</th>
                    <td><input type="text" style="width:80px;text-align:right;ime-mode:disabled;" class="input" dataformat="num" name="bwthst_bhp_pwr" maxlength="6" id="bwthst_bhp_pwr" /> </td>
                    <th>R.P.M</th>
                    <td><input type="text" style="width:90px;text-align:right;ime-mode:disabled;" class="input" dataformat="float" name="bwthst_rpm_pwr" maxlength="7" id="bwthst_rpm_pwr" /> </td>
                </tr>       
                <tr>
                    <th>Generator Engine</th>
                    <th>Maker</th>
                    <td><input type="text" style="width:180px;text-align:left;" class="input"  name="gnr_mkr_nm" maxlength="50" id="gnr_mkr_nm" /> </td>
                    <th>Type</th>
                    <td><input type="text" style="width:180px;text-align:left;" class="input"  name="gnr_tp_desc" maxlength="100" id="gnr_tp_desc" /> </td>
                    <th>B.H.P</th>
                    <td><input type="text" style="width:80px;text-align:right;ime-mode:disabled;" class="input" dataformat="num" name="gnr_bhp_pwr" maxlength="6" id="gnr_bhp_pwr" /> </td>
                    <th>R.P.M</th>
                    <td><input type="text" style="width:90px;text-align:right;ime-mode:disabled;" class="input" dataformat="num" name="gnr_rpm_pwr" maxlength="6" id="gnr_rpm_pwr" /> </td>
                </tr>
                <tr><td class="line_bluedot" colspan="9"></td></tr>       
            </tbody>
        </table>
        <table>
		<colgroup>
			<col width="100">
            <col width="100">
            <col width="100">
            <col width="120">
            <col width="100">
            <col width="150">
            <col width="100">
            <col width="120">
            <col width="100">
            <col width="*">
        </colgroup>  
		<tr class="h23">
			<th>Delete Flag</th>
			<td><select style="width:50px;" class="input" name="delt_flg" id="delt_flg"><!-- 
			 --><option value="N">N</option><!-- 
			  --><option value="Y">Y</option><!-- 
			   --></select></td>
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
	</table>
    </div>
    <!-- opus_design_inquiry(E) -->
</div>
<div class="wrap_result">
    <!-- opus_design_grid(S) -->
    <div class="opus_design_grid clear" style="display:none;">
            <script type="text/javascript">ComSheetObject('sheet1');</script>
    </div>
    <!-- opus_design_grid(E) -->
</div>

<%if (!("true").equals(mainPage)){%>
</div>
<%} %>	
</form>