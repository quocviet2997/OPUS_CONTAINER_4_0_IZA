<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0023.jsp
*@FileTitle  : Leasing Company Yard 
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
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.location.event.BcmCcd0023Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
    BcmCcd0023Event  event = null;              //PDTO(Data Transfer Object including Parameters)
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
        event = (BcmCcd0023Event)request.getAttribute("Event");
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
<input id="mdm_yn" name="mdm_yn" value="y" type="hidden" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
    <!-- page_title(S) -->
    <!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
    <h2 class="page_title">
        <button type="button"><span id="title"></span></button>
    </h2>
    <!-- page_title(E) -->
    <!-- opus_design_btn(S) -->
    <div class="opus_design_btn">
        <button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!-- 
        --><button type="button" class="btn_normal" name="btn_Save" id="btn_Save">Save</button><!-- 
        --><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button>
    </div>
    <!-- opus_design_btn(E) -->
    <!-- page_location(S) -->
    <div class="location"><span id="navigation"></span></div>
</div>
<!-- page_title_area(E) -->


<!-- opus_design_inquiry(S) -->
<div class="wrap_search">
    <div class="opus_design_inquiry wFit">
        <table>
            <colgroup>
                <col width="170"/>
                <col width="130"/>
                <col width="80"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Leasing Company Yard Code</th>
                    <td><input id="lse_co_yd_cd" style="width: 80px; ime-mode:disabled; text-align:center" class="input1" name="lse_co_yd_cd" dataformat="engup" maxlength="7" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search1" id="btns_search1" type="button"></button></td>
                    <th><!-- Modified --></th>
                    <td><input type="hidden" style="width:150px;text-align:center;" class="input" dataformat="engup" id="modi_lse_co_yd_cd" name="modi_lse_co_yd_cd" maxlength="30"></td>
                </tr>
                <tr>
                    <th>Name</th>
                    <td colspan="3"><input id="lse_co_yd_nm" style="width: 947px;" class="input1" name="lse_co_yd_nm" dataformat="engup" otherchar="()_\-,. " maxlength="50" type="text" /> </td>
                </tr>
            </tbody>
        </table>
    </div>
    <div class="opus_design_inquiry"><table class="line_bluedot"><tr><td></td></tr></table></div>
    <div class="opus_design_inquiry">
        <table>
            <colgroup>
                <col width="170"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Address</th>
                    <td><input id="yd_addr" style="width: 947px;" class="input1" name="yd_addr" maxlength="200" type="text" /> </td>
                </tr>
            </tbody>
        </table>
        <table>
            <colgroup>
                <col width="170"/>
                <col width="300"/>
                <col width="90"/>
                <col width="300"/>
                <col width="82"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>International Tel No</th>
                    <td><input id="intl_phn_no" style="width: 100px; ime-mode:disabled; text-align:right" class="input1" name="intl_phn_no" dataformat="num" otherchar="-" maxlength="4" type="text" /> </td>
                    <th>Tel No</th>
                    <td><input id="phn_no" style="width: 175px; ime-mode:disabled; text-align:right" class="input1" name="phn_no" dataformat="num" otherchar="-" maxlength="20" type="text" /> </td>
                    <th>FAX No</th>
                    <td><input id="fax_no" style="width: 175px; ime-mode:disabled; text-align:right" class="input1" name="fax_no" dataformat="num" otherchar="-" maxlength="20" type="text" /> </td>
                </tr>
                <tr>
                    <th>E-Mail</th>
                    <td><input id="yd_eml" style="width: 255px;" class="input" name="yd_eml" dataformat="excepthan" maxlength="50" type="text" /></td>
                    <th>P.I.C</th>
                    <td colspan="3"><input id="yd_pic_nm" style="width: 255px;" class="input" name="yd_pic_nm" dataformat="excepthan" maxlength="50" type="text" /></td>
                </tr>
            </tbody>
        </table>
        
        <div><table class="line_bluedot"><tr><td colspan="6"></td></tr></table></div>
        
        <table> 
            <colgroup>
                <col width="10px"/>
                <col width="150px"/>
                <col width="255x"/>
                <col width="160px"/>
                <col width="150px"/>
                <col width="255x"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <td></td>
                    <th>Leasing Company Vendor 1</th>
                    <td><input id="lse_co_vndr_seq1" style="width: 250px; ime-mode:disabled; text-align:center" class="input1" name="lse_co_vndr_seq1" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search2" id="btns_search2" type="button"></button> </td>
                    <td></td>
                    <th>Leasing Company Vendor 11</th>
                    <td><input id="lse_co_vndr_seq11" style="width: 250px; ime-mode:disabled; text-align:center" class="input" name="lse_co_vndr_seq11" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search3" id="btns_search3" type="button"></button> </td>
                    <td></td>
                </tr>   
                <tr>
                    <td></td>
                    <th>Leasing Company Vendor 2</th>
                    <td><input id="lse_co_vndr_seq2" style="width: 250px; ime-mode:disabled;text-align:center" class="input" name="lse_co_vndr_seq2" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search4" id="btns_search4" type="button"></button> </td>
                    <td></td>
                    <th>Leasing Company Vendor 12</th>
                    <td><input id="lse_co_vndr_seq12" style="width: 250px; ime-mode:disabled;text-align:center" class="input" name="lse_co_vndr_seq12" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search5" id="btns_search5" type="button"></button> </td>
                    <td></td>
                </tr>   
                <tr>
                    <td></td>
                    <th>Leasing Company Vendor 3</th>
                    <td><input id="lse_co_vndr_seq3" style="width: 250px; ime-mode:disabled;text-align:center" class="input" name="lse_co_vndr_seq3" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search6" id="btns_search6" type="button"></button> </td>
                    <td></td>
                    <th>Leasing Company Vendor 13</th>
                    <td><input id="lse_co_vndr_seq13" style="width: 250px; ime-mode:disabled;text-align:center" class="input" name="lse_co_vndr_seq13" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search7" id="btns_search7" type="button"></button> </td>
                    <td></td>
                </tr>   
                <tr>
                    <td></td>
                    <th>Leasing Company Vendor 4</th>
                    <td><input id="lse_co_vndr_seq4" style="width: 250px; ime-mode:disabled;text-align:center" class="input" name="lse_co_vndr_seq4" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search8" id="btns_search8" type="button"></button></td>
                    <td></td>
                    <th>Leasing Company Vendor 14</th>
                    <td><input id="lse_co_vndr_seq14" style="width: 250px; ime-mode:disabled;text-align:center" class="input" name="lse_co_vndr_seq14" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search9" id="btns_search9" type="button"></button> </td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <th>Leasing Company Vendor 5</th>
                    <td><input id="lse_co_vndr_seq5" style="width: 250px; ime-mode:disabled;text-align:center" class="input" name="lse_co_vndr_seq5" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search10" id="btns_search10" type="button"></button> </td>
                    <td></td>
                    <th>Leasing Company Vendor 15</th>
                    <td><input id="lse_co_vndr_seq15" style="width: 250px; ime-mode:disabled;text-align:center" class="input" name="lse_co_vndr_seq15" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search11" id="btns_search11" type="button"></button> </td>
                    <td></td>
                </tr>   
                <tr>
                    <td></td>
                    <th>Leasing Company Vendor 6</th>
                    <td><input id="lse_co_vndr_seq6" style="width: 250px; ime-mode:disabled;text-align:center" class="input" name="lse_co_vndr_seq6" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search12" id="btns_search12" type="button"></button> </td>
                    <td></td>
                    <th>Leasing Company Vendor 16</th>
                    <td><input id="lse_co_vndr_seq16" style="width: 250px; ime-mode:disabled;text-align:center" class="input" name="lse_co_vndr_seq16" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search13" id="btns_search13" type="button"></button> </td>
                    <td></td>
                </tr>   
                <tr>
                    <td></td>
                    <th>Leasing Company Vendor 7</th>
                    <td><input id="lse_co_vndr_seq7" style="width: 250px; ime-mode:disabled;text-align:center" class="input" name="lse_co_vndr_seq7" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search14" id="btns_search14" type="button"></button> </td>
                    <td></td>
                    <th>Leasing Company Vendor 17</th>
                    <td><input id="lse_co_vndr_seq17" style="width: 250px; ime-mode:disabled;text-align:center" class="input" name="lse_co_vndr_seq17" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search15" id="btns_search15" type="button"></button> </td>
                    <td></td>
                </tr>   
                <tr>
                    <td></td>
                    <th>Leasing Company Vendor 8</th>
                    <td><input id="lse_co_vndr_seq8" style="width: 250px; ime-mode:disabled;text-align:center" class="input" name="lse_co_vndr_seq8" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search16" id="btns_search16" type="button"></button> </td>
                    <td></td>
                    <th>Leasing Company Vendor 18</th>
                    <td><input id="lse_co_vndr_seq18" style="width: 250px; ime-mode:disabled;text-align:center" class="input" name="lse_co_vndr_seq18" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search17" id="btns_search17" type="button"></button> </td>
                    <td></td>
                </tr>   
                <tr>
                    <td></td>
                    <th>Leasing Company Vendor 9</th>
                    <td><input id="lse_co_vndr_seq9" style="width: 250px; ime-mode:disabled;text-align:center" class="input" name="lse_co_vndr_seq9" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search18" id="btns_search18" type="button"></button> </td>
                    <td></td>
                    <th>Leasing Company Vendor 19</th>
                    <td><input id="lse_co_vndr_seq19" style="width: 250px; ime-mode:disabled;text-align:center" class="input" name="lse_co_vndr_seq19" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search19" id="btns_search19" type="button"></button> </td>
                    <td></td>
                </tr>   
                <tr>    
                    <td></td>
                    <th>Leasing Company Vendor 10</th>
                    <td><input id="lse_co_vndr_seq10" style="width: 250px; ime-mode:disabled;text-align:center" class="input" name="lse_co_vndr_seq10" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search20" id="btns_search20" type="button"></button> </td>
                    <td></td>
                    <th>Leasing Company Vendor 20</th>
                    <td><input id="lse_co_vndr_seq20" style="width: 250px; ime-mode:disabled;text-align:center" class="input" name="lse_co_vndr_seq20" dataformat="num" maxlength="6" type="text" onBlur="obj_change();"/><button class="input_seach_btn" name="btns_search21" id="btns_search21" type="button"></button> </td>
                    <td></td>
                </tr>   
            </tbody>
        </table>
            
        <div><table class="line_bluedot"><tr><td colspan="6"></td></tr></table></div>
        
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
</div>
<!-- opus_design_inquiry(E) -->
        
<div class="wrap_result">
    <!-- opus_design_grid(S) -->
    <div class="opus_design_grid" style="display: none;">
        <script type="text/javascript">ComSheetObject('sheet1');</script>
    </div>
    <!-- opus_design_grid(E) -->
</div>
</form>