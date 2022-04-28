<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_N13.jsp
*@FileTitle  : Currency Code
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
<%@ page import="com.clt.bizcommon.currency.event.ComEnsN13Event"%>
<%@ page import="com.clt.syscommon.common.table.MdmCurrencyVO"%>
<%@ page import="org.apache.log4j.Logger" %>
<%
    ComEnsN13Event  event = null;               //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;         //서버에서 발생한 에러
    String strErrMsg = "";                      //에러메세지
    int rowCount = 0;                           //DB ResultSet 리스트의 건수

    String strUsr_id        = "";
    String strUsr_nm        = "";
    Logger log = Logger.getLogger("com.clt.apps.BizCommon.Currency");
    String main_page = "";
    //String cntCd = "";
    //String currCd = "";
   // String currDesc = "";

    String mdm_yn = JSPUtil.getParameter(request, "mdm_yn".trim(), "");
    String delt_flg = JSPUtil.getParameter(request, "delt_flg".trim(), "");
    String curr_cd = JSPUtil.getParameter(request, "curr_cd".trim(), "");

    try {
        SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
        strUsr_id = account.getUsr_id();
        strUsr_nm = account.getUsr_nm();
        main_page = JSPUtil.getParameter(request, "main_page".trim(), "");
        event = (ComEnsN13Event)request.getAttribute("Event");
        serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

        if (serverException != null) {
            strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
        }

        //cntCd = JSPUtil.getParameter(request, "cnt_cd".trim(), "");
        //currCd = JSPUtil.getParameter(request, "curr_cd".trim(), "");
        //currDesc = JSPUtil.getParameter(request, "curr_desc".trim(), "");

    }catch(Exception e) {
        log.error(e.toString());
    }
%>

<script type="text/javascript">
    function setupPage(){
        var errMessage = "<%=strErrMsg%>";
        if (errMessage.length >= 1) {
            ComShowMessage(errMessage);
        } // end if
        loadPage(<%=main_page%>);
    }
</script>
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<!-- mdm data type 에 따른 select box display 구분자-->
<input type="hidden" name="mdm_yn" value="<%=mdm_yn%>" id="mdm_yn" />

<%if(main_page.equals("true")){ %>
<%}else{ %>
<div class="layer_popup_contents" style="overflow:hidden;">
<%} %>

<div class="layer_popup_title">
    <div class="page_title_area clear">
        <h2 class="page_title"><span>Currency Code Inquiry</span></h2>
        
        <div class="opus_design_btn">
               <button class="btn_accent" name="btn_Retrieve" id="btn_Retrieve" type="button">Retrieve</button><!--
            --><button class="btn_normal" name="btn_downexcel" id="btn_downexcel" type="button">Down Excel</button>
            <%if(main_page.equals("true")){ %>          
 			<%}else{ %>
 			<button class="btn_normal" name="btn_select" id="btn_select" type="button">OK</button><!--
            --><button class="btn_normal" name="btn_Close" id="btn_Close" type="button">Close</button>
            <%} %>
        </div>
    </div>
</div>

<!-- wrap_search(S) -->  
<div class="wrap_search" style="overflow:hidden;">
    <!-- opus_design_inquiry (S) -->
    <div class="opus_design_inquiry wFit">
        <table>
            <colgroup>
                <col width="80" />
                <col width="50" />
                <col width="80" />
                <%
                if(!"".equals(mdm_yn) && mdm_yn.length() > 0){
                %>
                <col width="50"  />
                <col width="100" />     
                <%
                    }
                %>
                <col width="50"  />
                <col width="100" /> 
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Currency</th>
                    <td><input type="text" name="curr_cd" style="width:60px;ime-mode:disabled" maxlength="3" dataformat="engup" class="input" value="<%=curr_cd %>"></td>
                    <th>Country</th>
                    <td><input type="text" name="cnt_cd" style="width:60px;ime-mode:disabled" maxlength="2" dataformat="engup" class="input" value=""></td>
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
                    <th>Description</th>
                    <td><input type="text" name="curr_desc" style="width:150px;" class="input" dataformat="engupetc" value=""></td>
                </tr>
            </tbody>
        </table>
    </div>
    <!-- opus_design_inquiry (E) -->
</div>
<!-- wrap_search(E) -->  

 <!-- wrap_result(S) -->  
<div class="wrap_result">
    <div class="opus_design_grid">
        <script type="text/javascript">ComSheetObject('sheet1');</script>
    </div>
</div>
<%if(main_page.equals("true")){ %>
<%}else{ %>
	</div>
<%} %>
</form>
