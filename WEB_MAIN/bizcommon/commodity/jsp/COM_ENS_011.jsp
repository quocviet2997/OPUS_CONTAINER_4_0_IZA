<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_011.jsp
*@FileTitle  : Commodity inquiry
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/02
=========================================================
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.commodity.event.ComEns011Event"%>

<%
    ComEns011Event  event = null;                //PDTO(Data Transfer Object including Parameters)
    String main_page = "";
    Exception serverException   = null;            //서버에서 발생한 에러
    DBRowSet rowSet      = null;                               //DB ResultSet
    String strErrMsg = "";                                 //에러메세지
    int rowCount     = 0;                                  //DB ResultSet 리스트의 건수

    String mdm_yn = request.getParameter("mdm_yn") != null ? request.getParameter("mdm_yn") : "";
    String delt_flg = request.getParameter("delt_flg") != null ? request.getParameter("delt_flg") : "";
    
    try {
        event = (ComEns011Event)request.getAttribute("Event");
        main_page = JSPUtil.getParameter(request, "main_page".trim(), "");
        if (serverException != null) {
            strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
        }
    }catch(Exception e) {
        out.println(e.toString());
    }
%>

<script  type="text/javascript">
    function setupPage(){
        var errMessage = "<%=strErrMsg%>";
        if (errMessage.length >= 1) {
            ComShowMessage(errMessage);
        } // end if
        loadPage(<%=main_page%>);
    }
</script>

<!-- 
showErrMessage를 써주지 않으면 에러 발생시 처리가 불가합니다.
그리고 지금은 showErrMessage()으로 되어있지만 추후에 고객님이 변덕을 일으켜서 웹페이지를 호출하라고 할경우를 
대비해서 직접 showErrMessage() 하지 마시고 꼭 showErrMessage를 써주십시오. 한방에 바꾸게요. 표준을 안따르면 나중에 후회합니다.  
-->

<form name="form" onkeyup="ComKeyEnter('lengthnextfocus');">
<input type="hidden" name="f_cmd"> 
<input type="hidden" name="mdm_yn" value="<%=mdm_yn%>"> 

<%if(main_page.equals("true")){ %>
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
        --><button type="button" class="btn_normal" name="btn2_Down_Excel" id="btn2_Down_Excel">Down Excel</button><!--
        --><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button>
    </div>
    <!-- opus_design_btn(E) -->

    <!-- page_location(S) -->
    <div class="location">
        <span id="navigation"></span>
    </div>
    <!-- page_location(E) -->
</div>
<!-- page_title_area(E) -->
<%} else { %>
<!-- layer_popup_title(S) -->
 <div class="layer_popup_title">
    <!-- page_title_area(S) -->
    <div class="page_title_area clear">
        <!-- page_title(S) -->
        <h2 class="page_title"><span>Commodity inquiry</span></h2>
        <!-- page_title(E) -->
            
        <!-- opus_design_btn(S) -->
        <div class="opus_design_btn">
            <button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
            --><button type="button" class="btn_normal" name="btn2_Down_Excel" id="btn2_Down_Excel">Down Excel</button><!--
            --><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button><!--
            --><button type="button" class="btn_normal" name="btn_OK" id="btn_OK">OK</button><!--
            --><button type="button" class="btn_normal" name="btn_Close" id="btn_Close">Close</button>
        </div>
        <!-- opus_design_btn(E) --> 
    </div>
    <!-- page_title_area(E) -->
</div>
<!-- layer_popup_title(E) -->
<%} %>

<%if(!main_page.equals("true")){ %>
<!-- popup_contens_area(S) -->
<div class="layer_popup_contents">
<%} %>
<!-- wrap_search(S) -->
<div class="wrap_search">
    <!-- opus_design_inquiry(S) -->
    <div class="opus_design_inquiry wFit">
        <!--  biz_1 (S) -->
        <table>
            <colgroup>
                <col width="120" />
                <col width="77"  />
                <col width="110" />
                <col width="60"  />
                <col width="80"  />
                <col width="70"  />
                <%
                    if(!"".equals(mdm_yn) && mdm_yn.length() > 0){
                %>
                    <col width="50px"  />
                    <col width=""      />
                <%
                        }
                %>
                <col width=""      />
            </colgroup>
            <tbody>
                <tr>
                    <th>Commodity Code</th>
                    <td><input type="text" name="cmdt_cd" style="width:57px" dataformat="num" maxlength="6" style="ime-mode:disabled"></td>
                    <th>REP Commodity</th>
                    <td><input type="text" name="rep_cmdt_cd" style="width:40px" dataformat="num" maxlength="4" style="ime-mode:disabled"></td>
                    <th>IMDG Class</th>
                    <td>
                        <select style="width:50px;" name="rep_imdg_lvl_cd">
                            <option value="" selected>ALL</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                            <option value="7">7</option>
                            <option value="8">8</option>
                            <option value="9">9</option>
                            <option value="P">P</option>
                        </select>
                    </td>
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
                    <td></td>
                </tr>
                <tr>
                    <th>Key Word</th>
                    <td colspan="5">
                        <input type="text" name="cmdt_nm" style="width:345px;" dataformat="engup" maxlength="50" style="ime-mode:disabled" otherchar=" "></input>
                    </td>
                </tr>
            </tbody>
        </table> 
        <!--  biz_1   (E) -->   
    </div>
    <!-- inquiry_area(E) -->
</div>
<!-- wrap_search(E) -->
    
<!-- wrap_result(S) -->
<div class="wrap_result">
    <!-- opus_design_grid(S) -->
    <div class="opus_design_grid">
        <script  type="text/javascript">ComSheetObject('sheet1');</script>
    </div>
    <!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->

<%if(!main_page.equals("true")){ %>
</div>
<!-- popup_contens_area(E) -->
<%} %>

</form>

