<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0021.jsp
*@FileTitle  : zone
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
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.location.event.BcmCcd0021Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
        BcmCcd0021Event  event = null;              //PDTO(Data Transfer Object including Parameters)
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
        String menuflag     = JSPUtil.getParameter(request, "menuflag");
        

        try {
            SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
                strUsr_id = account.getUsr_id();
                strUsr_nm = account.getUsr_nm();


                event = (BcmCcd0021Event)request.getAttribute("Event");
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
<input type="hidden" name="mdm_yn" value="Y" id="mdm_yn" />
<input type="hidden" name="creflag" value="Y" id="creflag" />
<input type="hidden" name="mst_dat_subj_cd" value="ZONE" id="mst_dat_subj_cd" />
<input type="hidden" name="rqst_no" value="<%=rqstNo%>" id="rqst_no" />
<input type="hidden" name="proc_tp_cd" value="<%=procTpCd%>" id="proc_tp_cd" />
<input type="hidden" name="rqst_usr_chk" value="<%=rqstUsrChk%>" id="rqst_usr_chk" />
<input type="hidden" name="rqst_ofc_cd" value="<%=rqstOfcCd%>" id="rqst_ofc_cd" />

<!-- page_title_area(S) -->
<%-- <%if(!menuflag.equals("true")){%><div class="layer_popup_title"><%}%> --%>
<div class="page_title_area clear">

    <!-- page_title(S) -->
    <h2 class="page_title">    	
    	<%if(menuflag.equals("true")){%>
    		<button type="button">
    		<span id="title"></span></button></h2>
    	<%}else{%>
    		<!-- <span>Zone ( BCM_CCD_0021 )</span></button></h2> -->
    		<span id="title1">Zone</span></h2>
    	<%} %>
    <!-- page_title(E) -->
    
    <!-- opus_design_btn(S) -->
    <div class="opus_design_btn">
        <button type="button" class="btn_accent" name="btn_Retrieve"    id="btn_Retrieve" style='display:none'>Retrieve</button><!-- 
        --><button type="button" class="btn_normal" name="btn_Save"         id="btn_Save" style='display:none'>Save</button><!--        
        --><button type="button" class="btn_normal" name="btn_New"      id="btn_New" style='display:none'>New</button><!--  
        --><button type="button" class="btn_normal" name="btn_Request"  id="btn_Request" style='display:none'>Request</button><!--  
        --><button type="button" class="btn_normal" name="btn_Close"        id="btn_Close" style='display:none'>Close</button>  
    </div>
    <!-- opus_design_btn(E) -->

    <!-- page_location(S) -->
    <%if(menuflag.equals("true")){%>
    <div class="location">  
        <span id="navigation"></span>
    </div>
    <%}%>
    <!-- page_location(E) -->
    
</div>
<%-- <%if(!menuflag.equals("true")){    %></div><%}%> --%>
<!-- page_title_area(E) -->
<%-- <%if(!menuflag.equals("true")){%><div class="layer_popup_contents"><%}%> --%>
<div class="wrap_search">
    <div class="opus_design_inquiry wFit">
        <table>
            <colgroup>
                <col width="175"/>
                <col width="140"/>
                <col width="120"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Zone Code</th>
                    <td><input type="text" style="width:100px;ime-mode:disabled;text-align:center" class="input1" name="zn_cd" dataformat="engup" maxlength="7" id="zn_cd" onBlur="obj_change();" /><button type="button" name="btns_search2" id="btns_search2" class="input_seach_btn"></button></td>
                    <th>Name</th>
                    <td colspan="3"><input type="text" style="width:100%;" class="input1" name="zn_nm" dataformat="engup" otherchar="()_\-,. " maxlength="50" id="zn_nm" /> </td>
                </tr>   
                <tr>            
                    <th>Cargo Handling Time(Hours)</th>
                    <td><input type="text" style="width:100px;ime-mode:disabled;text-align:right" class="input1" name="cgo_hndl_tm_hrs" dataformat="num" maxlength="3" id="cgo_hndl_tm_hrs" /> </td>
                    <th>Transit Time(Hours)</th>
                    <td><input type="text" style="width:100px;ime-mode:disabled;text-align:right" class="input1" name="tztm_hrs" dataformat="num" maxlength="8" size="6" pointcount="2" id="tztm_hrs" /> </td>
                    <th>Rep. CY</th>
                    <td><input type="text" style="width:100px;ime-mode:disabled;text-align:center" class="input1" name="rep_yd_cd" dataformat="engup" maxlength="7" id="rep_yd_cd" onBlur="obj_change();"/><button type="button" name="btns_search1" id="btns_search1" class="input_seach_btn"></button></td>
                </tr>   
                <tr>                    
                    <th>Distance(Zone to Rep CY)</th>
                    <td><input type="text" style="width:100px;ime-mode:disabled;text-align:right" class="input" name="lnk_dist" dataformat="float" maxlength="7" id="lnk_dist" /> </td>
                    <th>Unit</th>
                    <td colspan="3"><script type="text/javascript">ComComboObject('dist_ut_cd', 1, 100, 1, 0);</script></td>
                </tr>   
            <tbody>
        </table>
    </div>
</div>

<div class="wrap_result">
   
    <div class="opus_design_grid">
     <h3 class="title_design">Zone Detail</h3>
        <div class="opus_design_btn">
            <button type="button" class="btn_accent" name="btn_RowAdd"      id="btn_RowAdd">Row Add</button>
            <button type="button" class="btn_normal" name="btn_RowDelete"   id="btn_RowDelete">Row Delete</button>  
        </div>
        <script type="text/javascript">ComSheetObject('sheet1');</script>
    </div>
    <div class="opus_design_inquiry">
        <table>
        	<colgroup>
                <col width="80"/>
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
                        <select style="width:80px;" name="delt_flg" class="input1" id="delt_flg" onChange="obj_change();">
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
<%-- <%if(!menuflag.equals("true")){    %></div><%}%> --%>
</form>
