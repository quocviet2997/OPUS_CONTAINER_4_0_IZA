<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0002.jsp
*@FileTitle  : Charge
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/04
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.account.event.BcmCcd0002Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
        BcmCcd0002Event  event = null;              //PDTO(Data Transfer Object including Parameters)
        Exception serverException   = null;         //Error from server
        String strErrMsg = "";                      //Error message
        int rowCount     = 0;                       //Count of DB resultSet list
    
        String successFlag = "";
        String codeList  = "";
        String pageRows  = "100";

        String strUsr_id        = "";
        String strUsr_nm        = "";
        Logger log = Logger.getLogger("com.clt.apps.opus.bcm.ccd.commoncode.account");
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
        
                event = (BcmCcd0002Event)request.getAttribute("Event");
                serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

                if (serverException != null) {
                        strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
                }
        
                GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
        
        }catch(Exception e) {
                out.println(e.toString());
        }
%>

<head>
<title>Charge</title>


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
</head>


<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="ibflag" id="ibflag" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="mdm_yn" value="N" id="mdm_yn" />
<input type="hidden" name="creflag" value="Y" id="creflag" />

<input type="hidden" name="mst_dat_subj_cd" value="CHRG" id="mst_dat_subj_cd" />
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
		<span id="title1">Charge</span></h2>
	<%} %>
	
    <!-- opus_design_btn(S) -->
    <div class="opus_design_btn">
    
        <button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve" style='display:none'>Retrieve</button><!--
         --><button type="button" class="btn_normal" name="btn_Save" id="btn_Save" style='display:none'>Save</button><!--
         --><button type="button" class="btn_normal" style='display:none; color:red' name="btn_Request" id="btn_Request">Request</button><!-- 
         --><button type="button" class="btn_normal" name="btn_New" id="btn_New" style='display:none'>New</button><!-- 
         -->
         
         <button type="button" style='display:none' class="btn_normal" name="btn_Close" id="btn_Close" style='display:none'>Close</button>
         
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


<!-- wrap_search(S) -->  
<div class="wrap_search">
    <!-- opus_design_inquiry (S) -->
    <div class="opus_design_inquiry wFit">
        <table>
            <colgroup>
                <col width="100">
                <col width="100">
                <col width="155">
                <col width="140">
                <col width="*">
            </colgroup> 
            <tbody>
                <tr>
                    <th>Charge Code</th>
                    <td><input type="text" style="width:70px;text-align:center;ime-mode:disabled;" class="input1" dataformat="engup" name="chg_cd" maxlength="3" onChange="obj_change();" ><!-- 
                     --><button type="button" name="btns_search" id="btns_search"  class="input_seach_btn"></button></td>
                    <td></td>
                    <th>Charge Name</th>
                    <td><input type="text" style="width: 579px;text-align:left;" class="input1" dataformat="engup" otherchar="()_\-,. " name="chg_nm" maxlength="50"></td>
                </tr>
            </tbody>
        </table>
    </div>
    <div class="opus_design_inquiry"><table class="line_bluedot"><tr><td></td></tr></table></div>
    <!-- opus_design_inquiry (E) -->

    <!-- opus_design_inquiry (S) -->
    <div class="opus_design_inquiry wFit">
        <table>
            <colgroup>
                <col width="100">
                <col width="250">
                <col width="150">
                <col width="250">
                <col width="150">
                <col width="*">
            </colgroup> 
            <tbody>
                <tr>
                    <th>Charge Type</th>
                    <td><script type="text/javascript">ComComboObject('frt_chg_tp_cd', 1, 180, 1, 0, 0, false)</script></td>
                    <th>Charge Rev Type</th>
                    <td><script type="text/javascript">ComComboObject('chg_rev_tp_cd', 1, 200, 1, 0, 0, false)</script></td>
                    <th>Charge Applying Type</th>
                    <td><script type="text/javascript">ComComboObject('chg_aply_tp_cd', 1, 180, 1, 0, 0, false)</script></td>
                </tr>
                <tr>
                    <th>Payment Term</th>
                    <td><script type="text/javascript">ComComboObject('chg_aply_area_cd', 2, 140, 1, 1, 1, false)</script></td>
                    <th>Account (G/L)</th>
                    <td>
                        <input type="text" style="width:100px;text-align:center;ime-mode:disabled;" class="input1" dataformat="engup" name="co_chg_acct_cd" maxlength="8" onChange="obj_change();"><!-- 
                        --><button type="button" name="btns_search1" id="btns_search1"  class="input_seach_btn"></button>
                    </td>
                    <th>Rep.Charge</th>
                    <td><script type="text/javascript">ComComboObject('rep_chg_cd', 1, 80, 1, 1, 0, false)</script></td>
                </tr>
                <tr>
                    <th>Auto Rating Flag</th>
                    <td><select style="width:50px;" class="input1" name="auto_rat_flg">
                            <option value="Y">Y</option>
                            <option value="N">N</option>
                        </select>
                    </td>
                    <th>Display Seq. on B/L</th>
                    <td><input type="text" style="width:50px;text-align:right;ime-mode:disabled;" class="input1" dataformat="num" name="dp_seq" maxlength="4"></td>
                </tr>
                <tr>
                    <th>Tax Flag</th>
                    <td>
                        <select style="width:50px;" class="input1" name="tax_flg" onChange="obj_change();">
                            <option value="N">N</option>
                            <option value="Y">Y</option>
                        </select>
                    </td>
                    <th>Tax Country</th>
                    <td>
                        <input type="text" style="width:50px;text-align:center;ime-mode:disabled;" class="input" dataformat="engup" name="tax_cnt_cd" maxlength="2" onChange="obj_change();" disabled><!-- 
                        --><button type="button" name="btns_tax_cnt_cd" id="btns_tax_cnt_cd"  class="input_seach_btn" disabled></button>
                    </td>
                </tr>
            </tbody>
        </table>
        
        
        <table>
            <colgroup>
                <col width="70">
                <col width="300">
                <col width="*">
            </colgroup> 
            <tbody>
                <tr>            
                    <th>Apply on R/D Term </th>                     
                    <td class="sm"> 
                         <input type="checkbox" class="trans" name="cy_rd_term_flg" id="cy_rd_term_flg"><label for="cy_rd_term_flg">CY</label><!--
                          --><input type="checkbox" class="trans" name="cfs_rd_term_flg" id="cfs_rd_term_flg"><label for="cfs_rd_term_flg">CFS</label><!--
                          --><input type="checkbox" class="trans" name="dor_rd_term_flg" id="dor_rd_term_flg"><label for="dor_rd_term_flg">Door</label><!--
                          --><input type="checkbox" class="trans" name="tkl_tml_flg" id="tkl_tml_flg"><label for="tkl_tml_flg">Tackle</label><!--
                          --><input type="checkbox" class="trans" name="na_rd_term_flg" id="na_rd_term_flg"><label for="na_rd_term_flg">Not Applicable</label>
                    </td>
                    <td></td>
                </tr>   
            </tbody>
        </table>
    </div>
	<table class="line_bluedot"><tr><td></td></tr></table>
    <div class="opus_design_inquiry wFit">	
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
            <tbody>
                <tr>
                    <th>Delete Flag</th>
                    <td>
                        <select style="width:70px;" class="input1" name="delt_flg" onChange="obj_change();">
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
    <!-- opus_design_inquiry (E) -->
</div>
<!-- wrap_result(S) -->  
<div class="wrap_result">
    <!-- opus_design_grid(S) -->
    <div class="opus_design_grid" id="mainTable" style="display:none">
        <script type="text/javascript">ComSheetObject('sheet1');</script>
    </div>
    <!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->  


</form>