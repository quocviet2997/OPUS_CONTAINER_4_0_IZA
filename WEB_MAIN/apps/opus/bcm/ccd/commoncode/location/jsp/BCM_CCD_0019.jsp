<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0019.jsp
*@FileTitle  : Location 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/10
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.location.event.BcmCcd0019Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
    BcmCcd0019Event  event = null;              //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;         //Error from server
    String strErrMsg = "";                      //Error message
    int rowCount     = 0;                       //Count of DB resultSet list
    String successFlag = "";
    String codeList  = "";
    String pageRows  = "100";
    String strUsr_id        = "";
    String strUsr_nm        = "";
    Logger log = Logger.getLogger("com.clt.apps.commoncode.location");
    // 승인처리용 정보
    String rqstNo       = JSPUtil.getParameter(request, "rqst_no");
    String procTpCd     = JSPUtil.getParameter(request, "proc_tp_cd");
    String rqstUsrChk   = JSPUtil.getParameter(request, "rqst_usr_chk");
    String rqstOfcCd    = JSPUtil.getParameter(request, "rqst_ofc_cd");
    String mainPage 		= "";
    mainPage = request.getParameter("main_page");
    try {
        SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
        strUsr_id = account.getUsr_id();
        strUsr_nm = account.getUsr_nm();
        event = (BcmCcd0019Event)request.getAttribute("Event");
        serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
        if (serverException != null) {
            strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
        }
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
<input id="creflag" name="creflag" value="Y" type="hidden" />
<input id="mst_dat_subj_cd" name="mst_dat_subj_cd" value="LOCA" type="hidden" />
<input id="rqst_no" name="rqst_no" value="<%=rqstNo%>" type="hidden" />
<input id="proc_tp_cd" name="proc_tp_cd" value="<%=procTpCd%>" type="hidden" />
<input id="rqst_usr_chk" name="rqst_usr_chk" value="<%=rqstUsrChk%>" type="hidden" />
<input id="rqst_ofc_cd" name="rqst_ofc_cd" value="<%=rqstOfcCd%>" type="hidden" />
<input id="mdm_yn" name="mdm_yn" value="Y" type="hidden" />
<input id="old_un_loc_cd" name="old_un_loc_cd" value="" type="hidden" />
<input id="old_delt_flg" name="old_delt_flg" value="" type="hidden" />
<input id="edi_if_flg" name="edi_if_flg" type="hidden" />
<input id="loc_lat" name="loc_lat" value="" type="hidden" />
<input id="loc_lon" name="loc_lon" value="" type="hidden" />
<input id="yd_flg" name="yd_flg" value="" type="hidden" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
    <!-- page_title(S) -->
    <!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
    <h2 class="page_title">
	<%if (("true").equals(mainPage)){%>
		<button type="button">
		<span id="title"></span></button></h2>
	<%}else{%>
		<span id="title1">Location</span></h2>
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
	<div class="location">	
		<span id="navigation"></span>
	</div>
	<%}%>
</div>
<!-- page_title_area(E) -->
<div class="wrap_search">
    <!-- opus_design_inquiry(S) -->
    <div class="opus_design_inquiry wFit">
        <table>
            <colgroup>
                <col width="130"/>
                <col width="450"/>
                <col width="70"/>
                <col width="100"/>
                <col width="150"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Location Code</th>
                    <td><input id="loc_cd" style="width: 120px; ime-mode:disabled;text-align:center" class="input1" name="loc_cd" dataformat="engup" maxlength="5" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search1" id="btns_search1" type="button"></button></td>
                    <th></th>
                    <td></td>
                    <th></th>
                    <td></td>
                    <!-- izanagi branding work, 20170831
                    <th>VIP Code</th>
                    <td><input type="text" style="width:150px;text-align:center;" class="input1" dataformat="engup" id="modi_loc_cd" name="modi_loc_cd" maxlength="30"></td>
                    <th>Legacy UUID</th>
                    <td><input type="text" style="width:150px;text-align:center;" class="input" dataformat="engup" id="modi_loc_cd2" name="modi_loc_cd2" maxlength="30" ReadOnly></td>
                    -->
                </tr>
            </tbody>
        </table>
    </div>
<div class="opus_design_inquiry"><table class="line_bluedot"><tr><td></td></tr></table></div>
    <div class="opus_design_inquiry">
        <table>
            <colgroup>
                <col width="130"/>
                <col width="450"/>
                <col width="70"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>English Name</th>
                    <td><input id="loc_nm" style="width: 400px;" class="input1" name="loc_nm" dataformat="engup"  otherchar="()_\-,. " maxlength="50" type="text" /></td>
                    <th>Local Name</th>
                    <td><input id="loc_locl_lang_nm" style="width: 100%;" class="input" name="loc_locl_lang_nm" maxlength="200" type="text" onBlur="obj_change();"/></td>
                </tr>
            </tbody>
        </table>
        <table>
            <colgroup>
                <col width="130"/>
                <col width="180"/>
                <col width="270"/>
                <col width="74"/>
                <col width="120"/>
                <col width="80"/>
                <col width="250"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Character</th>
                    <td><script type="text/javascript">ComComboObject('loc_chr_cd', 1, 120, 1, 1, 0);</script></td>
                    <td><input id="call_port_flg" name="call_port_flg" class="trans" value="Y" type="checkbox" /><lable for="call_port_flg">Calling Port</lable></td>
                    <th>Port</th>
                    <td><select style="width: 60px;" class="input1" name="port_inlnd_flg"><option value="N" selected>N</option><option value="Y">Y</option></select></td>
                    <th>Type</th>
                    <td><script type="text/javascript">ComComboObject('loc_tp_cd', 1, 240, 1, 1, 0);</script></td>
                    <td></td>
                </tr>
            </tbody>
        </table>
        
        <div class="opus_design_grid"><table class="line_bluedot"><tr><td colspan="6"></td></tr></table></div>
        
        <table>
            <colgroup>
                <col width="130"/>
                <col width="170"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Region</th>
                    <td><input id="rgn_cd" style="width: 120px; ime-mode:disabled; text-align:center" class="input1" name="rgn_cd" dataformat="engup" maxlength="3" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search4" id="btns_search4" type="button"></button><button class="btn_etc" name="btns_set_country" id="btns_set_country" type="button">Set Country</button></td>
                    <td></td>
                </tr>
            </tbody>
        </table>
        <table>
            <colgroup>
                <col width="130"/>
                <col width="160"/>
                <col width="100"/>
                <col width="250"/>
                <col width="110"/>
                <col width="140"/>
                <col width="70"/>
                <col width="150"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Continent</th>
                    <td><script type="text/javascript">ComComboObject('conti_cd', 1, 120, 1, 1, 0);</script></td>
                    <th>Sub Continent</th>
                    <td><input id="sconti_cd" style="width: 120px; ime-mode:disabled; text-align:center" class="input1" name="sconti_cd" dataformat="engup" maxlength="2" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search2" id="btns_search2" type="button"></button></td>
                    <th>Country</th>
                    <td><input id="cnt_cd" style="width: 40px; ime-mode:disabled; text-align:center" class="input1" name="cnt_cd" dataformat="engup" maxlength="2" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search3" id="btns_search3" type="button"></button></td>
                    <th>State</th>
                    <td><input id="ste_cd" style="width: 90px; ime-mode:disabled; text-align:center" class="input" name="ste_cd" dataformat="engup" maxlength="3" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search5" id="btns_search5" type="button"></button></td>
                    <td></td>
                </tr>
                <tr>
                    <th>EQ SCC</th>
                    <td><input id="scc_cd" style="width: 120px; ime-mode:disabled;text-align:center" class="input" name="scc_cd" dataformat="engup" maxlength="5" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search6" id="btns_search6" type="button"></button></td>
                    <th>Rep. Zone</th>
                    <td><input id="rep_zn_cd" style="width: 120px; ime-mode:disabled; text-align:center" class="input" name="rep_zn_cd" dataformat="engup" maxlength="7" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search7" id="btns_search7" type="button"></button></td>
                    <th>UN LOC Flag</th>
                    <td><select style="width: 60px;" class="input1" name="un_loc_ind_cd" onChange="obj_change();"><option value="" selected></option><option value="N">N</option><option value="Y">Y</option></select></td>
                    <th>UN LOC Code</th>
                    <td><input id="un_loc_cd" style="width: 75px; ime-mode:disabled;text-align:center" class="input" name="un_loc_cd" dataformat="engup" maxlength="5" type="text" /> </td>
                    <td></td>
                </tr>
            </tbody>
        </table>
        <table>
            <colgroup>
                <col width="130"/>
                <col width="160"/>
                <col width="100"/>
                <col width="250"/>
                <col width="110"/>
                <col width="120"/>
                <col width="105"/>
                <col width="120"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Sales Office</th>
                    <td><input id="sls_ofc_cd" style="width: 120px; ime-mode:disabled; text-align:center" class="input1" name="sls_ofc_cd" dataformat="engup" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search8" id="btns_search8" type="button"></button></td>
                    <th>EQ Ctrl Office</th>
                    <td><input id="eq_ctrl_ofc_cd" style="width: 120px; ime-mode:disabled; text-align:center" class="input1" name="eq_ctrl_ofc_cd" dataformat="engup" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search9" id="btns_search9" type="button"></button></td>
                    <th>Finance Ctrl Office</th>
                    <td><input id="finc_ctrl_ofc_cd" style="width: 60px; ime-mode:disabled; text-align:center" class="input1" name="finc_ctrl_ofc_cd" dataformat="engup" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search10" id="btns_search10" type="button"></button></td>
                    <th>India GST Office</th>
                    <td><input id="locl_ste_cd" style="width:60px; ime-mode:disabled; text-align:center;" class="input" name="locl_ste_cd" dataformat="engup" maxlength="2" type="text" onBlur="obj_change();" disabled/></td>
                    <td></td>
                </tr>
                <tr>
                    <th>Rep. Empty P/Up CY</th>
                    <td><input id="mty_pkup_yd_cd" style="width: 120px; ime-mode:disabled; text-align:center" class="input" name="mty_pkup_yd_cd" dataformat="engup" maxlength="7" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search11" id="btns_search11" type="button"></button></td>
                    <th>EQ Return CY</th>
                    <td><input id="eq_rtn_yd_cd" style="width: 120px; ime-mode:disabled; text-align:center" class="input" name="eq_rtn_yd_cd" dataformat="engup" maxlength="7" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search12" id="btns_search12" type="button"></button></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
            </tbody>
        </table>
        
        <div class="opus_design_grid"><table class="line_bluedot"><tr><td colspan="6"></td></tr></table></div>
        <table>
            <colgroup>
                <col width="130"/>
                <col width="200"/>
                <col width="70"/>
                <col width="200"/>
                <col width="70"/>
                <col width="225"/>
                <col width="70"/>
                <col width="150"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Hub Loc</th>
                    <td><input id="hub_loc_cd" style="width: 100px; ime-mode:disabled; text-align:center" class="input" name="hub_loc_cd" dataformat="engup" maxlength="5" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search13" id="btns_search13" type="button"></button></td>
                    <th>Zip Code</th>
                    <td><input id="zip_cd" style="width: 100px; ime-mode:disabled; text-align:center" class="input" name="zip_cd" dataformat="num" maxlength="10" type="text" /> </td>
                    <th>UTC Gap(Minutes)</th>
                    <td><input id="gmt_hrs" style="width:60px;ime-mode:disabled;text-align:right" class="input1" name="gmt_hrs" dataformat="singledFloat" maxlength="4" type="text" /><input id="utc_gap_hr_ctnt" name="utc_gap_hr_ctnt" type="hidden" /></td>
                    <td></td>
                </tr>
                <tr>
                    <th>US AMS Code</th>
                    <td><input id="loc_ams_port_cd" style="width: 100px; ime-mode:disabled; text-align:center" class="input" name="loc_ams_port_cd" dataformat="engup" maxlength="5" type="text" /> </td>
                    <th>Canada Customs Code</th>
                    <td><input id="cstms_cd" style="width: 80px; ime-mode:disabled; text-align:center" class="input" name="cstms_cd" dataformat="engup" maxlength="10" type="text" /> </td>
                    <th>Commercial Zone</th>
                    <td><select style="width: 60px;" class="input" name="cml_zn_flg"><option value="" selected></option><option value="N">N</option><option value="Y">Y</option></select></td>
                    <th></th>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <th>Latitude</th>
                    <td><input id="new_loc_lat" style="width:100px;ime-mode:disabled;text-align:right" class="input" name="new_loc_lat" otherchar="." dataformat="singledFloat" maxlength="10"  pointcount="6" type="text" /> </td>
<!--                     <th>Unit</th> -->
<!--                     <td><select style="width: 80px;" class="input" name="lat_ut_cd" id="lat_ut_cd"><option value="" selected></option><option value="N">N</option><option value="S">S</option></select></td> -->
                    <th></th>
                    <td></td>
                    <th>Longitude</th>
                    <td><input id="new_loc_lon" style="width: 100px; ime-mode:disabled; text-align:right" class="input" name="new_loc_lon" dataformat="singledFloat" maxlength="10" otherchar="." pointcount="6" type="text" /> </td>
<!--                     <th>Unit</th> -->
<!--                     <td><select style="width: 60px;" class="input" name="lon_ut_cd" id="lon_ut_cd"><option value="" selected></option><option value="E">E</option><option value="W">W</option></select></td> -->
                    <td></td>
                </tr>
            </tbody>
        </table>
        
        <div class="opus_design_grid"><table class="line_bluedot"><tr><td colspan="6"></td></tr></table></div>
        
        <table>
        	<colgroup>
                <col width="130"/>
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
                        <select style="width:100px;" name="delt_flg" class="input" id="delt_flg" onChange="obj_change();">
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
</div>
<!-- opus_design_inquiry(E) -->

<div class="wrap_result">
    <!-- opus_design_inquiry(E) -->
    <!-- opus_design_grid(S) -->
    <div class="opus_design_grid">
        <script type="text/javascript">ComSheetObject('sheet1');</script>
    </div>
    <!-- opus_design_grid(E) -->
</div>
</form>