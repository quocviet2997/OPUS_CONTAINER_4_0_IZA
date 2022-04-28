<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_081.jsp
*@FileTitle  : Lane Code inquiry Popup
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/02
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.lane.event.ComEns081Event"%>
<%
    ComEns081Event  event               = null;     //PDTO(Data Transfer Object including Parameters)
    Exception serverException               = null;     //서버에서 발생한 에러
    DBRowSet rowSet                         = null;     //DB ResultSet
    String strErrMsg                        = "";       //에러메세지
    int rowCount                            = 0;        //DB ResultSet 리스트의 건수
    String main_page = "";
    String mode                             = "svc";    // Lane 구분 ( Service / Revenue) -> Default는  Service Lane

    String mdm_yn = JSPUtil.getParameter(request, "mdm_yn".trim(), "");
    String delt_flg = JSPUtil.getParameter(request, "delt_flg".trim(), "");

    try {
        //SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
        //userId=account.getSawonNo();
        //userAuth=account.getAuth(); 


         event = (ComEns081Event)request.getAttribute("Event");
         //serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);                   //  ?

         mode = event.getMode();
         main_page = JSPUtil.getParameter(request, "main_page".trim(), "");
         //if (serverException != null) {
         //    strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
         //}
     }catch(Exception e) {
         out.println(e.toString());
     }
%>

<script type="text/javascript">
    function setupPage(){
        var errMessage = "<%=strErrMsg%>";
        if (errMessage.length >= 1) {
            ComShowMessage(errMessage);
        } // end if

        loadPage();
    }
</script>

<form method="post" name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="mode" value="<%=mode%>" id="mode" />
<!-- mdm data type 에 따른 select box display 구분자-->
<input type="hidden" name="mdm_yn" value="<%=mdm_yn%>" id="mdm_yn" />

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
        --><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button><!--
        --><button type="button" class="btn_normal" name="btn_OK" id="btn_OK">OK</button>
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
        <h2 class="page_title">
            <span>
<% if(mode != null && mode.equals("rev")) { %>
                Revenue Lane Inquiry
<% } else { %>  
                Service Lane Inquiry
<% } %>
            </span>
        </h2>
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
    <!-- inquiry_area(S) -->
    <div class="opus_design_inquiry wFit">
        <!--  biz_1 (S) -->
<% if(mode != null && mode.equals("rev")) { %>
        <table>
            <colgroup>
                <col width="80"  />
                <col width="100"  />
                <col width="80"  />
                <col width="80"  />
                <col width="60"  />
                <col width="150" />
                <%
                    if(!"".equals(mdm_yn) && mdm_yn.length() > 0){
                %>
                    <col width="50"  />
                <%
                	}
                %>
                <col width="*"      />
            </colgroup>
            <tbody>
                <tr>
                    <th>Trade</th>
                    <td><input type="text" style="width:60px;" name="trade_cd" dataformat="engup" id="trade_cd" /> </td>
                    <th>Sub Trade</th>
                    <td><input type="text" style="width:60px" name="sub_trade_cd" dataformat="engup" ></td><!-- PS -->
                    <th>SVC Type</th>
                    <td><!--
                    --><select style="width:130px;" name="svc_tp" id="svc_tp"><!--
	                    --><option selected value="">ALL</option><!--
	                    --><option value="I">Indepedent Join</option><!--
	                    --><option value="J">Joint Operation</option><!--
	                    --><option value="S">Space Charter</option><!--
	                    --><option value="O">Feeder</option><!--
                    --></select><!--
                    --></td>
                <%
                    if(!"".equals(mdm_yn) && mdm_yn.length() > 0){
                %>
                    <th>Status</th>
                    <td><!--
                    --><select style="width:85px;" name="delt_flg" id="delt_flg"><!--
	                    --><option value="ALL" <%if("ALL".equals(delt_flg)){ %> selected="selected" <%} %>>ALL</option><!--
	                    --><option value="N" <%if("N".equals(delt_flg) || "".equals(delt_flg)){ %> selected="selected" <%} %>>Active</option><!--
	                    --><option value="Y" <%if("Y".equals(delt_flg)){ %> selected="selected" <%} %>>Delete</option><!--
                    --></select><!--
                    --></td>
                <% } %>
                <td></td>
                </tr>
                <tr>
                    <th>Lane Code</th>
                    <td><input type="text" name="lane_cd" dataformat="engup" style="width:60px;ime-mode:disabled" id="lane_cd" /></td>
                    <th>Lane Name</th>
                    <td><input type="text" name="lane_nm" dataformat="engupetc" style="width:130px;ime-mode:disabled" id="lane_nm" /></td>
                </tr>
            </tbody>
        </table>
<% } else { %>
        <table>
            <colgroup>
                <col width="80" />
                <col width="100" />
                <col width="80" />
                <col width="150" />
                <col width="80" />
                <col width="140" />
                <%
                    if(!"".equals(mdm_yn) && mdm_yn.length() > 0){
                %>
                    <col width="50" />
                <%
                        }
                %>
                <col width="*" />
            </colgroup>
            <tbody>
                <tr>
                    <th>Lane Code</th>
                    <td><input type="text" name="lane_cd" dataformat="engup" style="width:60px;ime-mode:disabled" id="lane_cd" /> </td>
                    <th>Lane Name</th>
                    <td><input type="text" name="lane_nm" dataformat="engupetc" style="width:130px;ime-mode:disabled" id="lane_nm" /> </td>
                    <th>SVC Type</th>
                    <td><!--
                    --><select style="width:120px;" name="svc_tp" id="svc_tp"><!--
                    --><option selected value="">ALL</option><!--
                    --><option value="I">Indepedent Join</option><!--
                    --><option value="J">Joint Operation</option><!--
                    --><option value="S">Space Charter</option><!--
                    --><option value="O">Feeder</option><!--
                    --></select><!--
                    --></td>
                <%
                    if(!"".equals(mdm_yn) && mdm_yn.length() > 0){
                %>
                    <th>Status</th>
                    <td><!--
                    --><select style="width:85px;" name="delt_flg" id="delt_flg"><!--
                    --><option value="ALL" <%if("ALL".equals(delt_flg)){ %> selected="selected" <%} %>>ALL</option><!--
                    --><option value="N" <%if("N".equals(delt_flg) || "".equals(delt_flg)){ %> selected="selected" <%} %>>Active</option><!--
                    --><option value="Y" <%if("Y".equals(delt_flg)){ %> selected="selected" <%} %>>Delete</option><!--
                    --></select><!--
                    --></td>
                <% } %>
                    <td></td>
                </tr>
            </tbody>
        </table>
<% } %>
        <!--  biz_1   (E) -->   
    </div>
    <!-- inquiry_area(E) -->
</div>
<!-- wrap_search(S) -->

<!-- wrap_result(S) -->
<div class="wrap_result">
    <!-- opus_design_grid(S) -->
    <div class="opus_design_grid">
        <script type="text/javascript">ComSheetObject('sheet1');</script>
    </div>
    <!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->

<%if(!main_page.equals("true")){ %>
</div>
<% } %>
<!-- popup_contens_area(E) -->
</form>