<%--
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0072.jsp
*@FileTitle  : Cut-off VVD Entry for New A/R Office
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/02
=========================================================*/
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemasterdatamgt.generalarinvoicemasterdatamgt.event.FnsInv0072Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
    FnsInv0072Event  event = null;                  //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;     
    String strErrMsg = "";                  
    int rowCount     = 0;                   

    String successFlag = "";
    String codeList  = "";
    String pageRows  = "100";

    String strUsr_id        = "";
    String strUsr_nm        = "";
    Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMasterDataMgt.GeneralARInvoiceMasterDataMgt");

    try {
        SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
        strUsr_id = account.getUsr_id();
        strUsr_nm = account.getUsr_nm();


        event = (FnsInv0072Event)request.getAttribute("Event");
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
    function setupPage(){
        var errMessage = "<%=strErrMsg%>";
        if (errMessage.length >= 1) {
            ComShowMessage(errMessage);
        } // end if
        loadPage();
    }
</script>

<form name="form">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
<input type="hidden" name="pagetype" value = "I">
<input type="hidden" name="old_ar_ofc_cd">
<input type="hidden" name="new_ar_ofc_cd">
<input type="hidden" name="slan_cd">
<input type="hidden" name="port_cd">
<input type="hidden" name="vsl_cd">
<input type="hidden" name="skd_voy_no">
<input type="hidden" name="skd_dir_cd">
<input type="hidden" name="io_bnd_cd">
<input type="hidden" name="ar_ofc_cd_all">

<!-- page_title_area(S) -->
<div class="page_title_area clear">
    <!-- page_title(S) -->
    <h2 class="page_title">
        <button type="button">
            <span id="title"></span>
        </button>
    </h2>
    <!-- page_title(E) -->

    <!-- opus_design_btn(S) -->
    <div class="opus_design_btn">
        <button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!-- 
         --><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button><!--
         --><button type="button" class="btn_normal" name="btn_Save" id="btn_Save">Save</button><!--
         --><button type="button" class="btn_normal" name="btn_DownExcel" id="btn_DownExcel">Down Excel</button>
    </div>
    <!-- opus_design_btn(E) -->

    <!-- page_location(S) -->
    <div class="location">
        <span id="navigation"></span>
    </div>
    <!-- page_location(E) -->
</div>
<!-- page_title_area(E) -->

<!-- wrap_search(S) -->
<div class="wrap_search">
    <!-- opus_design_inquiry(S) -->
    <div class="opus_design_inquiry wFit">
        <!--  biz_1 (S) -->
        <table>
            <colgroup>
                <col width="80"  />
                <col width="20"  />
                <col width="145" />
                <col width="30"  />
                <col width="" />
            </colgroup>
            <tbody>
                <tr>
                    <th>A/R Office</th>
                    <th>Old</th>
                    <td><script language="javascript">ComComboObject('old_ar_ofc_cd2', 2, 110, 0, 1, 0, true);</script></td>
                    <th>New</th>
                    <td><script language="javascript">ComComboObject('new_ar_ofc_cd2', 2, 110, 0, 1, 0, true);</script></td>
                </tr>
            </tbody>
        </table>
        <!--  biz_1   (E) -->   
    </div>
    <!-- opus_design_inquiry(E) -->
</div>
<!-- wrap_search(E) -->

<!-- wrap_result(S) -->
<div class="wrap_result">
    <!-- opus_design_grid(S) -->
    <div class="opus_design_grid" >
        <!-- opus_grid_btn(S) -->
        <div class="opus_design_btn">
            <button type="button" class="btn_normal" name="btn_RowAdd" id="btn_RowAdd">Row Add</button>
            <button type="button" class="btn_normal" name="btn_RowCopy" id="btn_RowCopy">Row Copy</button>
            <button type="button" class="btn_normal" name="btn_Delete" id="btn_Delete">Row Delete</button>
        </div>
        <!-- opus_grid_btn(E) -->
        <script language="javascript">ComSheetObject('sheet1');</script>
    </div>
    <!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->

</form>

