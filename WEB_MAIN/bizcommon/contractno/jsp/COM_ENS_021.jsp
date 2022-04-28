<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_021.jsp
*@FileTitle  : Contract No 조회
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
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.contractno.event.ComEns021Event"%>

<%
    ComEns021Event  event = null;                //PDTO(Data Transfer Object including Parameters)
    GeneralEventResponse eventResponse = null;    //RDTO(Data Transfer Object including DB ResultSet)
    Exception serverException   = null;            //서버에서 발생한 에러
    DBRowSet rowSet      = null;                               //DB ResultSet
    String strErrMsg = "";                                 //에러메세지
    int rowCount     = 0;                                  //DB ResultSet 리스트의 건수
    String main_page = "";
    
	String mdm_yn = request.getParameter("mdm_yn") != null ? request.getParameter("mdm_yn") : "";
	String delt_flg = request.getParameter("delt_flg") != null ? request.getParameter("delt_flg") : "";
	
	
    try {
       //SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
       //userId=account.getSawonNo();
       //userAuth=account.getAuth(); 
       
        event = (ComEns021Event)request.getAttribute("Event");
        serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
        main_page = JSPUtil.getParameter(request, "main_page".trim(), "");
        if (serverException != null) {
            strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
        }else{
        	eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
            if (eventResponse != null) {
                rowSet = eventResponse.getRs();
                if(rowSet != null){
                     rowCount = rowSet.getRowCount();
                } // end if
            } // end if
        } // end else
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
        // InitTab();
        loadPage();
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


<%if(!main_page.equals("true")){ %>
<div class="layer_popup_title">
<%}%>
	<div class="page_title_area clear">
<%if(main_page.equals("true")){ %>
		<!-- page_title(S) -->
		<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
		<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
		<!-- page_title(E) -->
<%} else {%>
		<h2 class="page_title"><span>Contract No. Inquiry</span></h2>
<%}%>	

<!-- opus_design_btn(S) -->
		<div class="opus_design_btn"><!-- 
			--><button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!-- 
			--><button type="button" class="btn_normal" name="btn_new"      id="btn_new">New</button><!-- 
			--><button type="button" class="btn_normal" name="btn_ok" id="btn_ok">OK</button><!-- 
<%if(!main_page.equals("true")){ %>
			--><button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button>
<%}%>	
		</div>
		<!-- opus_design_btn(E) -->
<%if(main_page.equals("true")){ %>
		<!-- page_location(S) -->
		<div class="location">
			<!-- location 내용 동적생성 (별도 코딩 불필요) -->
			<span id="navigation"></span>
		</div>
		<!-- page_location(E) -->
<%}%>
	</div>

<%if(!main_page.equals("true")){ %>
</div>

<div class="layer_popup_contents">
<%}%>
<!-- page_title_area(E) -->
<div class="wrap_search">
	<div class="opus_design_inquiry">
		<table>
			<colgroup>
				<col width="50">
				<col width="250">
				<col width="50">
				<col width="50">
				<col width="50">
				<col width="50">
				<col width="*">
			</colgroup>
			<tbody>
				<tr>
					<th>Contract No.</th>
					<td><input type="text" name="cont_tp" dataformat="engup" maxlength="3" size="3" style="width:35px"><input type="text" name="cont_no" dataformat="engup" maxlength="7" size="7"  style="width:65px;ime-mode:disabled"></td>
					<th>Period</th>
					<td><span class="inquiry_calendar"><input name="sdate" type="text" maxlength="8" style="width:75px" dataformat="ymd"><span class="dash">-</span><input name="edate" type="text" maxlength="8"  style="width:75px" dataformat="ymd"><button type="button" class="calendar ir" name="btns_calendar1" id="btns_calendar1"></button></span></td>
   					<%
						if(!"".equals(mdm_yn) && mdm_yn.length() > 0){
					%>
					<th>Status</th>
					<td><select style="width:85px;" name="delt_flg">
							<option value="ALL" <%if("ALL".equals(delt_flg)){ %> selected="selected" <%} %>>ALL</option>
							<option value="N" <%if("N".equals(delt_flg) || "".equals(delt_flg)){ %> selected="selected" <%} %>>Active</option>
							<option value="Y" <%if("Y".equals(delt_flg)){ %> selected="selected" <%} %>>Delete</option>
						</select></td>
				<%
						} else {
				%>
					<td colspan="2"></td>
				<%
					}
				%>
					<td>&nbsp;</td>
					
				</tr>
				<tr>
					<th>Customer Name</th>
					<td><input type="text" name="cust_nm" dataformat="engup" maxlength="200" style="width:200px"></td>
					<th>S Office</th>  
                    <td><input type="text" style="width:75px" name="ofc_cd" dataformat="enguponly"><strong class="pad_left_12">C Office</strong> <input type="text" style="width:75px" name="ctrt_cust_sls_ofc_cd" dataformat="enguponly">
                    </td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
		<!-- TABLE '#D' : ( Search Options : Scenario ID ) (S) -->

<!-- opus_design_grid(S) -->
<div class="wrap_result" style="overflow:hidden; padding-bottom:30px;">
	<div class="opus_design_grid">
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<!-- 그리드 버튼 영역(데이터 그리드 상단에 위치) -->
			<!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->
			<button type="button" class="btn_accent" name="btn2_down_excel" id="btn2_down_excel">Down Excel</button>
		</div>
		<!-- opus_design_btn(E) -->
	   
		<!-- 그리드 데이터 영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
				<script type="text/javascript">ComSheetObject('sheet1');</script><!--W/O Issue-->
		<!-- 그리드 데이터 영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
	</div>
</div>
<!-- opus_design_grid(E) -->

<%if(!main_page.equals("true")){ %>
</div>
<%}%>
</form>

<SCRIPT type="text/javascript">
<!--
      /* 
        ibSheet 를 제외한 폼 입력값(?) 유저가 입력한 정보를 event를 통해서 다시 넘겨받아 화면에 뿌려주는 부분입니다. 
      */
      with(document.form)
      {
        <%
        if(event != null){ 
        	
        	String contTp = event.getContTp();
          	String contNo = event.getContNo();
          	String sdate   = event.getSdate();
          	String edate   = event.getEdate();
          	String custNm = event.getCustNm();
        %>
                
	        eval("cont_tp").value = "<%=contTp%>";
	        eval("cont_no").value = "<%=contNo%>";
	        eval("sdate").value   = "<%=sdate%>";
	        eval("edate").value   = "<%=edate%>";
	   
	        eval("cust_nm").value = "<%=custNm%>";
        
        <% } %>
       }
-->
</SCRIPT>
 <%@include file="../../include/common_alps.jsp"%>