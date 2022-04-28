<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0024.jsp
*@FileTitle  : daylight saving time
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/03
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.location.event.BcmCcd0024Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
        BcmCcd0024Event  event = null;              //PDTO(Data Transfer Object including Parameters)
        Exception serverException   = null;         //Error from server
        String strErrMsg = "";                      //Error message
        int rowCount     = 0;                       //Count of DB resultSet list

        String successFlag = "";
        String codeList  = "";
        String pageRows  = "100";

        String strUsr_id        = "";
        String strUsr_nm        = "";
        Logger log = Logger.getLogger("com.clt.apps.commoncode.location");

        try {
            SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
                strUsr_id = account.getUsr_id();
                strUsr_nm = account.getUsr_nm();


                event = (BcmCcd0024Event)request.getAttribute("Event");
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
<input type="hidden" name="ibflag" id="ibflag" />
<input type="hidden" name="mdm_yn" value="N" id="mdm_yn" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">

    <!-- page_title(S) -->
    <h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
    <!-- page_title(E) -->
    
    <!-- opus_design_btn(S) -->
    <div class="opus_design_btn">
        <button type="button" class="btn_accent" name="btn_Retrieve"    id="btn_Retrieve">Retrieve</button><!-- 
        --><button type="button" class="btn_normal" name="btn_Save"         id="btn_Save">Save</button><!--         
        --><button type="button" class="btn_normal" name="btn_New"      id="btn_New" onmouseover="processButtonClick1()" >New</button>
    </div>
    <!-- opus_design_btn(E) -->

    <!-- page_location(S) -->
    <div class="location">  
        <span id="navigation"></span>
    </div>
    <!-- page_location(E) -->
    
</div>
<!-- page_title_area(E) -->

<div class="wrap_search">
    <div class="opus_design_inquiry wFit">
        <table>
            <colgroup>
                <col width="110"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>DST Code</th>
                    <td><input type="text" style="width:123px;ime-mode:disabled;text-align:center" class="input1" name="dst_id" dataformat="engup" maxlength="6" id="dst_id" onBlur="obj_change();"/><button type="button" name="btns_search" id="btns_search" class="input_seach_btn"></button></td>
                </tr>
            </tbody>
        </table>
    </div>
<div class="opus_design_inquiry"><table class="line_bluedot"><tr><td></td></tr></table></div>
    <div class="opus_design_inquiry">
        <table>
            <colgroup>
                <col width="110"/>
                <col width="150"/>
                <col width="137"/>
                <col width="150"/>
                <col width="150"/>
                <col width="150"/>
                <col width="130"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Country</th>
                    <td><input type="text" style="width:100px;ime-mode:disabled;text-align:center" class="input1" name="dst_cnt_cd" dataformat="engup" maxlength="2" id="dst_cnt_cd" onBlur="obj_change();"/><button type="button" name="btns_search1" id="btns_search1" class="input_seach_btn"></button></td>
                    <th>Not Applying State</th>
                    <td><input type="text" style="width:100px;ime-mode:disabled;text-align:center" class="input" name="dst_not_aply_ste_cd" dataformat="engup" maxlength="3" id="dst_not_aply_ste_cd" onBlur="obj_change();"/><button type="button" name="btns_search2" id="btns_search2" class="input_seach_btn"></button></td>
                    <th>DST year</th>
                    <td><input type="text" style="width:100px;ime-mode:disabled;text-align:right" class="input1" name="dst_yr" dataformat="yyyy" maxlength="4" id="dst_yr" /> </td>
                    <th>DST Diff(Minutes)</th>
                    <td><input type="text" style="width:100px;ime-mode:disabled;text-align:right" class="input1" name="dst_mnts" dataformat="num" maxlength="3" id="dst_mnts" /> </td>
                </tr>   
                <tr>
                    <th>Start DST Rule</th>
                    <td colspan="3"><input type="text" style="width:416px;" class="input" name="st_dst_rule_desc" maxlength="120" id="st_dst_rule_desc" /> </td>
                    <th>END DST Rule</th>
                    <td colspan="3"><input type="text" style="width:380px;" class="input" name="end_dst_rule_desc" maxlength="100" id="end_dst_rule_desc" /> </td>
                </tr>   
                <tr>
                    <th>Start Date</th>
                    <td><input type="text" style="width:100px;ime-mode:disabled;text-align:center" class="input1" name="st_dst_dt" dataformat="ymd" maxlength="10" id="st_dst_dt" /><button type="button" class="calendar ir" name="btns_Calendar1" id="btns_Calendar1"></button>
                    <th>END Date</th>
                    <td><input type="text" style="width:100px;ime-mode:disabled;text-align:center" class="input1" name="end_dst_dt" dataformat="ymd" maxlength="10" id="end_dst_dt" /><button type="button" class="calendar ir" name="btns_Calendar2" id="btns_Calendar2"></button>
                    <th>Start Time(HHMM)</th>
                    <td><input type="text" style="width:100px;ime-mode:disabled;text-align:center" class="input1" name="st_dst_hrmnt" dataformat="hm" maxlength="5" id="st_dst_hrmnt" /> </td>
                    <th>END Time(HHMM)</th>
                    <td><input type="text" style="width:100px;ime-mode:disabled;text-align:center" class="input1" name="end_dst_hrmnt" dataformat="hm" maxlength="5" id="end_dst_hrmnt" /> </td>
                </tr>   
            </tbody>
        </table>
        <table class="line_bluedot"><tr><td></td></tr></table>  
        <table> 
            <colgroup>
                <col width="110"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Delete Flag</th>
                    <td><select style="width:100px;" class="input1" name="delt_flg" id="delt_flg" onChange="obj_change()";><option value="N" selected>N</option><option value="Y">Y</option></select></td>
                </tr>   
            </tbody>
        </table>            
    </div>
</div>

<div class="wrap_result">
    <div class="opus_design_grid">
        <script type="text/javascript">ComSheetObject('sheet1');</script>
    </div>
</div>
</form>
