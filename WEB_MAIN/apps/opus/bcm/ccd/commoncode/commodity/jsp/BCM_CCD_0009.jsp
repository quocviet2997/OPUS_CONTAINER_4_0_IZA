<%/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0009.jsp
*@FileTitle  : Group Commodity 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/03
=========================================================*/%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.commodity.event.BcmCcd0009Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
    BcmCcd0009Event  event = null;              //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;         //Error from server
    String strErrMsg = "";                      //Error message
    int rowCount     = 0;                       //Count of DB resultSet list
    
    String successFlag = "";
    String codeList  = "";
    String pageRows  = "100";

    String strUsr_id        = "";
    String strUsr_nm        = "";
    Logger log = Logger.getLogger("com.clt.apps.opus.bcm.ccd.commoncode.commodity");
    
    try {
        SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
        strUsr_id = account.getUsr_id();
        strUsr_nm = account.getUsr_nm();
        
        event = (BcmCcd0009Event)request.getAttribute("Event");
        serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

        if (serverException != null) {
            strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
        }
        
        GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
        
    }catch(Exception e) {
        out.println(e.toString());
    }
%>
<script language="javascript">
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
<input type="hidden" name="f_cmd" id="f_cmd">
<input type="hidden" name="pagerows" id="pagerows">

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
    <!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
    <h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
    <!-- page_title(E) -->
    <!-- opus_design_btn(S) -->
    <div class="opus_design_btn">
        <button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
        --><button type="button" class="btn_normal" name="btn_Save" id="btn_Save" style="display: none">Save</button><!--
        --><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button>       
    </div>
    <!-- opus_design_btn(E) -->

    <!-- page_location(S) -->
    <div class="location">
        <!-- location 내용 동적생성 (별도 코딩 불필요) -->
        <span id="navigation"></span>
    </div>
</div>
<!-- page_title_area(E) -->

<div class= "wrap_search">
    <div class= "opus_design_inquiry wFit">
        <table>
            <colgroup>
                <col width="133" />
                <col width="200"/>
                <col width="100" />
                <col width="240"/>
                <col width="110"/>
                <col width="*"/>
            </colgroup>
            <tbody>
                <tr>
                    <th>Code</th>
                    <td><input type="text" style="width:100px;text-align:center;ime-mode:disabled;" class="input1" dataformat="engup" name="grp_cmdt_cd" id="grp_cmdt_cd" maxlength="2" onBlur="obj_change();"></td>
                    <th>Rep Min Code</th>
                    <td><input type="text" style="width:150px;text-align:center;ime-mode:disabled;" class="input" dataformat="num" name="min_rep_cmdt_cd" id="min_rep_cmdt_cd" maxlength="4"></td>
                    <th>Rep Max Code</th>
                    <td><input type="text" style="width:150px;text-align:center;ime-mode:disabled;" class="input" dataformat="num" name="max_rep_cmdt_cd" id="max_rep_cmdt_cd" maxlength="4"></td>
                </tr>
            </tbody>
        </table>
    </div>

<div class="opus_design_inquiry"><table class="line_bluedot"><tr><td></td></tr></table></div>

    <div class= "opus_design_inquiry">
        <table>
            <colgroup>
                <col width="130"/>
                <col width="350"/>
                <col width="150" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Group English Name</th>
                    <td><input type="text" style="width:300px;text-align:left;ime-mode:disabled;" class="input1" dataformat="eng" otherchar=" " name="grp_cmdt_eng_nm" id="grp_cmdt_eng_nm" maxlength="200"></td>
                    <th>Group Korean Name</th>
                    <td width=""><input type="text" style="width:300px;text-align:left;" class="input"  name="grp_cmdt_krn_nm" id="grp_cmdt_krn_nm" maxlength="200"></td>
                </tr>
                <tr>
                    <th>Group Japanese Name</th>
                    <td><input type="text" style="width:300px;text-align:left;" class="input" name="grp_cmdt_jpn_nm" id="grp_cmdt_jpn_nm" maxlength="200"></td>
                    <th>Group Chinese Name</th>
                    <td width=""><input type="text" style="width:300px;text-align:left;" class="input"  name="grp_cmdt_chn_nm" id="grp_cmdt_chn_nm" maxlength="200"></td>
                </tr>
            </tbody>
        </table>
    </div>

<div class="opus_design_inquiry"><table class="line_bluedot"><tr><td></td></tr></table></div>

    <div class="opus_design_inquiry wFit">	
        <table>
            <colgroup>
                <col width="133">
                <col width="">
            </colgroup>  
            <tbody>
                <tr>
                    <th>Delete Flag</th>
                    <td>
                        <select style="width:70px;" class="input" name="delt_flg">
                            <option value="N">N</option>
                            <option value="Y">Y</option>
                        </select>
                    </td>
                </tr>   
            </tbody>
        </table>
    </div>

</div>
<div class="wrap_result">
    <div class="opus_design_grid clear" >
        <script type="text/javascript">ComSheetObject('sheet1');</script>
    </div>
</div>

</form>
