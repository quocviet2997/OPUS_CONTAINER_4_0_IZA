<%--=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_0A1.jsp
*@FileTitle  : Vessel조회(공통 Popup)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/20
=========================================================--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.controller.DefaultViewAdapter"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.vessel.event.ComEns0A1Event"%>
<%@ page import="com.clt.framework.component.util.io.HttpUtil"%>
<%
    ComEns0A1Event  event = null;                          //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;                    //서버에서 발생한 에러
    DBRowSet rowSet      = null;                           //DB ResultSet
    String strErrMsg = "";                                 //에러메세지
    int rowCount     = 0;                                  //DB ResultSet 리스트의 건수
    String xml = "";
    xml = HttpUtil.makeXML(request,response);
    String main_page = "";
    
    String mdm_yn = request.getParameter("mdm_yn") != null ? request.getParameter("mdm_yn") : "";
    String delt_flg = request.getParameter("delt_flg") != null ? request.getParameter("delt_flg") : ""; 

    try {
        SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
        event = (ComEns0A1Event)request.getAttribute("Event");
        serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);                  //  ?
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
        }
        
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
<input type="hidden" name="sXml" value="<%=xml%>">  
<!-- mdm data type 에 따른 select box display 구분자-->
<input type="hidden" name="mdm_yn" value="<%=mdm_yn%>"> 

<!-- OUTER - POPUP (S)tart -->
<%if(main_page.equals("true")){ %>
    
    <!-- page_title_area(S) -->
    <div class="page_title_area clear">
        
        <!-- page_title(S) -->
        <!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
        <h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
        <!-- page_title(E) -->
    
        <!-- opus_design_btn(S) -->
        <div class="opus_design_btn">
            <button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
            --><button type="button" class="btn_normal" name="btn_New"   id="btn_New">New</button>
        </div>
        <!-- opus_design_btn(E) -->
    
        <!-- page_location(S) -->
        <div class="location">
            <!-- location 내용 동적생성 (별도 코딩 불필요) -->
            <span id="navigation"></span>
        </div>
        <!-- page_location(E) -->
    </div>
    <!-- page_title_area(E) -->
    <!--Page Title, Historical (E)-->
    
<%} else { %>
    
    <!-- popup_title_area(S) -->
   <div class="layer_popup_title">
        <!-- page_title_area(S) -->
        <div class="page_title_area clear">
        
            <!-- page_title(S) -->
            <h2 class="page_title"><span>Vessel Inquiry</span></h2>
            <!-- page_title(E) -->
    
            <!-- opus_design_btn(S) -->
            <div class="opus_design_btn">
                <button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
                --><button type="button" class="btn_normal" name="btn2_Down_Excel"   id="btn2_Down_Excel">Down Excel</button><!--
                --><button type="button" class="btn_normal" name="btn_New"   id="btn_New">New</button><!--
                --><button type="button" class="btn_normal" name="btn_OK"   id="btn_OK">OK</button><!--     
                --><button type="button" class="btn_normal" name="btn_Close"   id="btn_Close">Close</button>
            </div>
            <!-- opus_design_btn(E) --> 
    
        </div>
        <!-- page_title_area(E) -->
     </div>
    <!-- popup_title_area(E) -->

    <!-- popup_contens_area(S) -->
    <div class="layer_popup_contents">

<%} %>
    <!-- wrap_search_tab(S) -->
    <div class="wrap_search">
        <!-- opus_design_inquiry(S) -->
        <div class="opus_design_inquiry wFit">
            <!-- 조회영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
            <table>
                 <colgroup>
                    <col width="80" />
                    <col width="120" />
                    <col width="80" />
                    <col width="100" />
                    <col width="50" />
                    <col width="100" />
                    <%
                    if(!"".equals(mdm_yn) && mdm_yn.length() > 0){
                    %>
                        <col width="50" />
                        <col width="105" />
                    <%
                        }
                    %>
                    <col width="" />
                </colgroup> 
                <tbody>
                    <tr>
                        <th>Vessel Name</th>
                        <td >
                            <input type="text" name="vsl_eng_nm" id="vsl_eng_nm" style="width:100px;ime-mode:disabled" >
                        </td>
                        <th>Vessel Code</th>
                        <td>
                            <input type="text"  name="vsl_cd" id="vsl_cd" maxlength="4" style="width:80px;ime-mode:disabled" dataformat="engup">
                        </td>
                        <th>Carrier</th>
                        <td>
                            <input type="text" name="car_cd" id="car_cd" style="width:80px;ime-mode:disabled" dataformat="engup">
                        </td>
                    <%
                        if(!"".equals(mdm_yn) && mdm_yn.length() > 0){
                    %>
                        <th>Status</th>
                        <td>
                            <select style="width:85px;" name="delt_flg" id="delt_flg">
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
                        <th>Call Sign</th>
                        <td>
                            <input type="text" name="call_sgn_no" style="width:100px;ime-mode:disabled" dataformat="engup">
                        </td>
                        <th>Lloyd No.</th>
                        <td>
                            <input type="text" name="lloyd_no" style="width:80px;ime-mode:disabled" dataformat="engup">
                        </td>
                        <th>Feeder/Trunk</th>
                        <td>
                            <%= com.clt.bizcommon.util.BizComUtil.getCodeCombo("fdrDiv_cd", "", "", "FDRDIVCD", 2, "0: :ALL") %></td><td width="">&nbsp;
                        </td>
                        <td></td>
                    </tr>
                </tbody>
            </table>
            <!-- 조회영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
        </div>
    </div>
        
    <!-- wrap_result(S) -->
    <div class="wrap_result">   
        <!-- opus_design_grid(S) -->
        <div class="opus_design_grid">
            <!-- 그리드 데이터 영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
                <script  type="text/javascript">ComSheetObject('sheet1');</script>
            <!-- 그리드 데이터 영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
        </div>
        <!-- opus_design_grid(E) -->
    </div>
    
<% if(!"true".equals(main_page)){ %>
</div>
<% } %>
</form>

<SCRIPT  type="text/javascript">
<!--
      /* 
        ibSheet 를 제외한 폼 입력값(?) 유저가 입력한 정보를 event를 통해서 다시 넘겨받아 화면에 뿌려주는 부분입니다. 
      */
      with(document.form)
      {
        <%
        if(event != null){ 
          String vsl_cd     = event.getVsl_cd();
          String vsl_eng_nm = event.getVsl_eng_nm();
          String car_cd = event.getCar_cd();
          String call_sgn_no = event.getCall_sgn_no();
          String lloyd_no = event.getLloyd_no();
        %>
                
            eval("vsl_cd").value     = "<%=vsl_cd%>";
            eval("vsl_eng_nm").value = "<%=vsl_eng_nm%>";
            eval("car_cd").value = "<%=car_cd%>";
            eval("call_sgn_no").value = "<%=call_sgn_no%>";
            eval("lloyd_no").value = "<%=lloyd_no%>";
        
        <% } %>
       }
-->
</SCRIPT>
