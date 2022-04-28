<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName : UI_BKG_0696.jsp
*@FileTitle : Package Type
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/12
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.packagetype.event.UiBkg0696Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
    UiBkg0696Event  event = null;                   //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;         //서버에서 발생한 에러
    String strErrMsg = "";                      //에러메세지

    String strUsr_id        = "";
    String strUsr_nm        = "";
    Logger log = Logger.getLogger("com.clt.bizcommon.packagetype");

    String mdm_yn = request.getParameter("mdm_yn") != null ? request.getParameter("mdm_yn") : "";
    String delt_flg = request.getParameter("delt_flg") != null ? request.getParameter("delt_flg") : "";

    try {
        SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
        strUsr_id = account.getUsr_id();
        strUsr_nm = account.getUsr_nm();


        event = (UiBkg0696Event)request.getAttribute("Event");
        serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);


        if (serverException != null) {
            strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
        }

    }catch(Exception e) {
        log.error(e.toString());
    }
%>

<head>
<title>Package Type</title>


<script type="text/javascript">
    function setupPage(){
        var errMessage = "<%=strErrMsg%>";
        if (errMessage.length >= 1) {
            ComShowMessage(errMessage);
        } // end if
        loadPage();
    }
</script>
</head>

<body class="popup_bg" onLoad="setupPage();">
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<!-- mdm data type 에 따른 select box display 구분자-->
<input type="hidden" name="mdm_yn" value="<%=mdm_yn%>" id="mdm_yn" />

<!-- 개발자 작업    -->
<!-- page_title_area(S) -->
<div class="page_title_area clear">
<!-- page_title(S) -->
<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
<h2 class="page_title"><button type="button">Packages Code Inquiry</button></h2>
<!-- page_title(E) -->
<!-- opus_design_btn(S) -->
<div class="opus_design_btn">
    <button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
        --><button type="button" class="btn_normal" name="btn_downexcel" id="btn_downexcel">Down Excel</button><!--
        --><button type="button" class="btn_normal" name="btn_select" id="btn_select">OK</button><!-- 
        --><button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button>
</div>
<!-- opus_design_btn(E) -->
</div>

<!-- page_title_area(E) -->

<!-- wrap_search(S) -->  
<div class="wrap_search">
    <!-- opus_design_inquiry (S) -->
    <div class="opus_design_inquiry wFit">
        <table>
            <colgroup>
                <col width="50" />
                <col width="100" />
                <col width="50" />
                <%
                if(!"".equals(mdm_yn) && mdm_yn.length() > 0){
                %>
                <col width="50" />
                <col width="100" />     
                <%
                    }
                %>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Code</th>
                    <td><input type="text" style="width:50px;ime-mode:disabled" class="input" dataformat="engup" name="pck_cd" maxlength="2" value="<%= (request.getParameter("pck_cd") == null) ? "" : request.getParameter("pck_cd") %>">&nbsp;&nbsp;&nbsp;</td>
                    <th>Name</th>
                    <td><input type="text" style="width:110px;ime-mode:disabled" class="input" dataformat="eng" otherchar=" " name="pck_nm" maxlength="50" value="<%= (request.getParameter("pck_nm") == null) ? "" : request.getParameter("pck_nm") %>"></td>
                    <%
                        if(!"".equals(mdm_yn) && mdm_yn.length() > 0){
                        %>
                        <th>Status</th>
                        <td>
                            <select style="width:85px;" name="delt_flg">
                                <option value="ALL" <%if("ALL".equals(delt_flg)){ %> selected="selected" <%} %>>ALL</option>
                                <option value="N" <%if("N".equals(delt_flg) || "".equals(delt_flg)){ %> selected="selected" <%} %>>Active</option>
                                <option value="Y" <%if("Y".equals(delt_flg)){ %> selected="selected" <%} %>>Delete</option>
                            </select>
                        </td>
                        <%
                            }
                        %>
                    <td width="">&nbsp;</td>
                </tr>
            </tbody>
        </table>
    </div>
    <!-- opus_design_inquiry (E) -->
</div>
<!-- wrap_search(E) -->  

<div class="wrap_result">
    <!-- opus_design_grid(S) -->
    <div class="opus_design_grid">      
        <script type="text/javascript">ComSheetObject('sheet1');</script>
    </div>
    <!-- opus_design_grid(E) -->
</div>

</form>
