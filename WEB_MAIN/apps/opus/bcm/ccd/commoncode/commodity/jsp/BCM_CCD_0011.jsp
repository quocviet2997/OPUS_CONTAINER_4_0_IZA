<%/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0010.js
*@FileTitle  : Commodity
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
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.commodity.event.BcmCcd0011Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
    BcmCcd0011Event  event = null;              //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;         //Error from server
    String strErrMsg = "";                      //Error message
    int rowCount     = 0;                       //Count of DB resultSet list
    
    String successFlag = "";
    String codeList  = "";
    String pageRows  = "100";

    String strUsr_id        = "";
    String strUsr_nm        = "";
    Logger log = Logger.getLogger("com.clt.apps.opus.bcm.ccd.commoncode.commodity");
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
        
        event = (BcmCcd0011Event)request.getAttribute("Event");
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
<input type="hidden" name="mst_dat_subj_cd" value="CMDT" id="mst_dat_subj_cd" />
<input type="hidden" name="rqst_no" value="<%=rqstNo%>" id="rqst_no" />
<input type="hidden" name="proc_tp_cd" value="<%=procTpCd%>" id="proc_tp_cd" />
<input type="hidden" name="rqst_usr_chk" value="<%=rqstUsrChk%>" id="rqst_usr_chk" />
<input type="hidden" name="rqst_ofc_cd" value="<%=rqstOfcCd%>" id="rqst_ofc_cd" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
    <!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
    <h2 class="page_title">
	<%if (("true").equals(mainPage)){%>
		<button type="button">
		<span id="title"></span></button></h2>
	<%}else{%>
		<span id="title1">Commodity</span></h2>
	<%} %>	
    <!-- page_title(E) -->
    <!-- opus_design_btn(S) -->
    <div class="opus_design_btn">
        <button style='display:none' type="button" class="btn_accent" name="btn_Retrieve"   id="btn_Retrieve" style="display: none">Retrieve</button><!--
        --><button style='display:none' type="button" class="btn_normal" name="btn_Save"        id="btn_Save" style="display: none">Save</button><!--
        --><button style='display:none' type="button" class="btn_normal" name="btn_Request"         id="btn_Request" style="display: none">Request</button><!--
        --><button style='display:none' type="button" class="btn_normal" name="btn_New"         id="btn_New" style="display: none">New</button><!--
        --><button style='display:none' type="button" class="btn_normal" name="btn_Close"       id="btn_Close" style="display: none">Close</button>   
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

<!-- opus_design_inquiry(S) -->
<div class= "wrap_search">
    <div class= "opus_design_inquiry wFit">
        <table>
            <colgroup>
                <col width="130"/>
                <col width="230"/>
                <col width="100"/>
                <col width="120"/>
                <col width="110"/>
                <col width="*"/>
            </colgroup>
            <tbody>
                <tr>
                    <th>Commodity Code</th>
                    <td colspan="3">
                        <input type="text" style="width:80px;text-align:center;ime-mode:disabled;" class="input1" dataformat="num" name="cmdt_cd" maxlength="6" onBlur="obj_change();"><!--
                        --><button type="button" class="input_seach_btn" name="btns_search" id="btns_search"></button>
                    </td>
					<th><!-- Modified --></th>
					<td><input type="hidden" style="width:150px;text-align:center;" class="input" dataformat="engup" id="modi_cmdt_cd" name="modi_cmdt_cd" maxlength="30"></td>
                </tr>
            </tbody>
        </table>
    </div>

<div class="opus_design_inquiry"><table class="line_bluedot"><tr><td></td></tr></table></div>

    <div class= "opus_design_inquiry wFit">
        <table>
            <colgroup>
                <col width="130 "/>
                <col width="230"/>
                <col width="100"/>
                <col width="120"/>
                <col width="110"/>
                <col width="110"/>
                <col width="110"/>
                <col width="*"/>
            </colgroup>
            <tbody>
                <tr>
                    <th>Name</th>
                    <td colspan="5"><input type="text" style="width:100%;text-align:left;" class="input1" name="cmdt_nm" dataformat="engupetc" maxlength="200"></td>
                </tr>   
                <tr>
                    <th>Rep. Commodity Code</th>
                    <td><script type="text/javascript">ComComboObject('rep_cmdt_cd', 2, 170, 1, 1, 0, false)</script></td>
                    <th>Rep. IMDG Level</th>
                    <td><script type="text/javascript">ComComboObject('rep_imdg_lvl_cd', 2, 60, 1, 0, 0, false)</script></td>
                    <th>FMC Exempt Flag</th>
                    <td>
                        <select style="width:60px;" class="input" name="fmc_exp_flg" onChange="obj_change();">
                            <option value=""></option>
                            <option value="Y">Y</option>
                            <option value="N">N</option>
                        </select>
                    </td>
                    <th>EU Export Flag</th>
                    <td>
                        <select style="width:60px;" class="input" name="eu_xpt_flg" >
                            <option value="N" selected>N</option>
                            <option value="Y">Y</option>
                        </select>
                    </td>
                </tr>   
            </tbody>
        </table>
        <table>
        	<colgroup>
                <col width="135"/>
                <col width="100">
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
                <tr><th>Delete Flag</th>
                    <td>
                        <select style="width:81px;" class="input" name="delt_flg" id="delt_flg" onChange="obj_change();">
                            <option value="N">N</option>
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
<div class="wrap_result">
    <div class="opus_design_grid clear" >
            <script type="text/javascript">ComSheetObject('sheet1');</script>
    </div>
</div>
<!-- opus_design_grid(E) -->

</form>
