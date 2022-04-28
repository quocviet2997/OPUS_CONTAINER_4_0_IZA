<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_0M1.jsp
*@FileTitle  : Country
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/11
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.country.event.ComEns0M1Event"%>
<%@ page import="com.clt.bizcommon.country.vo.CountryListVO"%>
<%
    ComEns0M1Event  event = null;               //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;         //서버에서 발생한 에러
    String strErrMsg = "";                               //에러메세지
    int rowCount     = 0;                                 //DB ResultSet 리스트의 건수
    String main_page = "";

    String mdm_yn = request.getParameter("mdm_yn") != null ? request.getParameter("mdm_yn") : "";
    String delt_flg = request.getParameter("delt_flg") != null ? request.getParameter("delt_flg") : "";

    try {
        /*
        꼭 유저의 정보를 받을 필요는 없습니다. 화면에서 유저의 이름이나 
        권한같은 정보를 이용할 필요가 있을 경우에만 사용하면 됩니다.
        덧붙여 USER 정보에 대해서 한마디로 정리하면 user 의 정보를 이용할수 있는 곳은 jsp 와 command 입니다.
        jsp에서는 유저의 정보를 가지고 권한에 따른 버튼 처리등을 할수가 있는 것이고 (enable/disable)
        command에서는 역시 유저의 정보로 예를 들어 update 권한등이 있는지를 확인할 수가 있는 것입니다.

        주의> 사용자 테이블이 변경됨에 따라 변경 될 것입니다.
            SignOnUserAccount 의 메서드를 확인 하십시오.
            getAuth 메서드는 현재 미정이지만 권한 관련 value를 가져올 메서드가 있겠죠?   
       */ 
       //SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
       //userId=account.getUsr_id();
       //userAuth=account.getAuth(); 


        /* 
        일단 화면에서 USER가 입력한 정보를 다시 화면에서 사용해야 하는 경우 
        request에 담아 서버로 전송시켰다가 다시 그 request에서 받아야 한다고 했습니다.
        이때 유저가 작성한 자료는 event 에 서버로부터 전송된 자료는 eventResponse에 담기게 됩니다.
        이렇게 받은 정보는 jsp 맨 하단에 있는 java script로부터 폼의 value로 값을 전달하게 됩니다.
        본 jsp소스 맨 하단을 참조하십시오.
        */
        event = (ComEns0M1Event)request.getAttribute("Event");
        /* 
            ErrorHandler를 통해서 받는 에러는 CO_ERRMESSAGE 테이블에 입력되어있는 
            개발자가 정의했거나 공통팀에서 결정한 정의가 되어진 에러메세지입니다 
            Command 에서 EventException으로 throw를 했거나 DAO에서 DAOException을 통해 
            jsp 까지 전달이 되게 됩니다. 해당 파일을 참조하십시오.
            jsp에서 최후에 에러가 display될때 onload시에 실행되는 ShowErrMessage 를 통해 showErrMessage();가 뜨게 됩니다.
            (주의) 이 에러메세지와 자바스크립트 에러를 혼동하지는 마십시오. 
                자바스크립트 에러는 서버로 전송하기전에 "주민등록번호가 잘못되었습니다" 라는 메세지이고 
                throw되는 메세지는 update 를 하려고 권한을 확인해보니까 없어서 
                "해당 권한이 없습니다" 라고 뿌리는 메세지입니다.
        */
        serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
        main_page = JSPUtil.getParameter(request, "main_page".trim(), "");
        /* 
        아래부분은 꼭 지켜주셔야 에러메세지가 정상적으로 전달이 됩니다. 
        보시다시피 먼저 에러를 받고 에러가 아닐시에 EventResponse로 값을 전달하셔야 합니다. 
        */
        if (serverException != null) {
            strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
        }
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
        loadPage(<%=main_page%>);
    }


</script> 

<form name="form" id="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="mdm_yn" value="<%=mdm_yn%>" id="mdm_yn" />

<input type="hidden" name="func" value="SCONTI" id="func" />
<input type="hidden" name="targetCombo" value="sconti_cd" id="targetCombo" />


<!-- OUTER - POPUP (S)tart -->
<%if(main_page.equals("true")){ %>
<!-- page_title_area(S) -->
<div class="page_title_area clear ">
	<!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
        
    <!-- opus_design_btn(S) -->
    <div class="opus_design_btn">
        <button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
            --><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button>
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
        <h2 class="page_title"><span>Country Code Inquiry</span></h2>
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
<!-- popup_title_area(E) -->
<%} %>	
<!-- popup_contens_area(S) -->
<%if(!main_page.equals("true")){ %><div class="layer_popup_contents" style="overflow:hidden"><%} %>      
<div class="wrap_search">
    <div class="opus_design_inquiry">
        <table>
            <colgroup>
                <col width="60"/> 
                <col width="150"/>
                <col width="60"/>
                <col width="*"/>
            </colgroup>
            <tbody>
                <tr>
                    <th width="60">Continent</th>
                    <td width="150"><%= com.clt.bizcommon.util.BizComUtil.getCodeCombo("conti_cd", "", " onchange='javascript:setSubConti();'", "CONTI", 1, "0: :ALL") %></td>
                    <th width="60">Sub Continent</th>
                    <td><%= com.clt.bizcommon.util.BizComUtil.getCodeCombo("sconti_cd", "", "", "SCONTI", 1, "0: :ALL", "conti_cd=''") %></td>
                </tr> 
                <tr>
                    <th>Country Code</th>
                    <td><input type="text" name="cnt_cd" id="cnt_cd" style="width:35px" maxlength="2" dataformat="engup" value=''></td>
                    <th>Name</th>
                    <td><input type="text" name="cnt_nm" id="cnt_nm" style="width:115px" value=''></td>
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
                    <td>&nbsp;</td>
                </tr> 
    
            </tbody>
        </table>
    </div>
</div>      

<div class="wrap_result">
    <div class="opus_design_grid ">
        <script type="text/javascript">ComSheetObject('sheet1');</script>
    </div>
</div>

<!-- opus_design_grid(E) -->
<SCRIPT type="text/javascript">
<!--
      /* 
        ibSheet 를 제외한 폼 입력값(?) 유저가 입력한 정보를 event를 통해서 다시 넘겨받아 화면에 뿌려주는 부분입니다. 
      */
      with(document.form)
      {
        <%
        if(event != null){ 
            
            String cntCd = "";
            String cntNm = "";
            CountryListVO vo = (CountryListVO)event.getCountryListVO();
            if(vo != null){
                cntCd = vo.getCntCd();
                cntNm = vo.getCntNm();
            }
        %>
                
            eval("cnt_cd").value = "<%=cntCd%>";
            eval("cnt_nm").value = "<%=cntNm%>";
<%--         alert(<%//cntCd%>); --%>
        <% } %>
       }
-->
</SCRIPT>
<iframe name="iframe_bizcom" style="display:none"></iframe>

</form>