<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0022.jsp
*@FileTitle  : equipment ORG chart
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
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.location.event.BcmCcd0022Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
        BcmCcd0022Event  event = null;              //PDTO(Data Transfer Object including Parameters)
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


                event = (BcmCcd0022Event)request.getAttribute("Event");
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

<!-- page_title_area(S) -->
<div class="page_title_area clear">

    <!-- page_title(S) -->
    <h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
    <!-- page_title(E) -->
    
    <!-- opus_design_btn(S) -->
    <div class="opus_design_btn">
           <button type="button" class="btn_accent" name="btn_Retrieve"    id="btn_Retrieve"  >Retrieve  </button><!--
        --><button type="button" class="btn_normal" name="btn_Down_Excel"  id="btn_Down_Excel">Down Excel</button><!--
        --><button type="button" class="btn_normal" name="btn_Save"        id="btn_Save"      >Save      </button><!--     
        --><button type="button" class="btn_normal" name="btn_New"         id="btn_New"       >New       </button>   
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
                <col width="170"/>
                <col width="400"/>
                <col width="80"/>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>EQ Control Location Code</th>
                    <td>
                        <select style="width:80px;" class="input1" name="loc_type" id="loc_type">
                            <option value="" selected>ALL</option>
                            <option value="R">RCC</option>
                            <option value="L">LCC</option>
                            <option value="E">ECC</option>
                            <option value="S">SCC</option>
                        </select><!--
                        --><input type="text" name="location" style="width:332px;ime-mode:disabled;" class="input2" id="location" dataformat="engup" otherchar="," /><!--
                        --><button type="button" name="loc_btn" id="loc_btn" class="input_seach_btn"></button>
                    </td>
                    <th>Status</th>
                    <td>
                        <select style="width:70px;" class="input" name="delt_flg" id="delt_flg">
                            <option value="" selected>ALL</option>
                            <option value="N">Active</option>
                            <option value="Y">Delete</option>
                        </select>
                    </td>
                </tr>
            <tbody>
        </table>                
    </div>
</div>
<div class="wrap_result">
    <div class="opus_design_grid">
        <div class="opus_design_btn">
            <button type="button" class="btn_accent" name="btn_Row_Add"    id="btn_Row_Add"   >Row Add   </button>
            <button type="button" class="btn_accent" name="btn_Row_Copy"   id="btn_Row_Copy"  >Row Copy  </button>
            <button type="button" class="btn_normal" name="btn_Row_Delete" id="btn_Row_Delete">Row Delete</button> 
        </div>
        <script type="text/javascript">ComSheetObject('sheet1');</script>
    </div>
</div>
</form>