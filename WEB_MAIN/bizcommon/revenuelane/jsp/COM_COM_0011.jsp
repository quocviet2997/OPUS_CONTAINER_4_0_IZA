<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_COM_0011.jsp
*@FileTitle  : Lane code 조회(공통 Popup)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/29
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.revenuelane.event.ComCom0011Event"%>
<%
	ComCom0011Event  event 				= null; 	//PDTO(Data Transfer Object including Parameters)
    Exception serverException   			= null;     //서버에서 발생한 에러
    DBRowSet rowSet      					= null; 	//DB ResultSet
    String strErrMsg 						= "";		//에러메세지
    int rowCount     						= 0;		//DB ResultSet 리스트의 건수
    String main_page = "";
    String mdm_yn								= "";	// Lane 구분 ( Service / Revenue) -> Default는  Service Lane

    try {
        //SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
        //userId=account.getSawonNo();
        //userAuth=account.getAuth(); 
         event = (ComCom0011Event)request.getAttribute("Event");
         //serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);					//	?
         mdm_yn = event.getMdmYn();
         main_page = JSPUtil.getParameter(request, "main_page".trim(), "");
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

        // InitTab();
        loadPage();
    }
</script>
<form name="form" >
<input type="hidden" name="f_cmd" id="f_cmd">
<input type="hidden" name="mdm_yn" id="mdm_yn" value="<%=mdm_yn%>">
<input type="hidden" name="pop_mode" id="pop_mode" value="2">
<!-- page_title_area(S) -->
<div class="page_title_area clear">

	<!-- page_title(S) -->
	<h2 class="page_title"><span>Revenue Lane Code Inquiry</span></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
	<button type="button" id="btn_Retrieve" name="btn_Retrieve" class="btn_accent">Retrieve</button><!--
	--><button type="button" id="btn_DownExcel" name="btn_DownExcel" class="btn_normal">Down Excel</button><!--
	--><button type="button" id="btn_New" name="btn_New" class="btn_normal">New</button><!--
	--><button type="button" id="btn_OK" name="btn_OK" class="btn_normal">OK</button><!--
	--><%if(!main_page.equals("true")){ %><button type="button" id="btn_Close" name="btn_Close" class="btn_normal">Close</button><%}%><!--
	--></div>
<!-- opus_design_btn (E) -->

	<!-- page_location(S) -->
	<div class="location">	
		<span id="navigation"></span>
	</div>
	<!-- page_location(E) -->
	
</div>
<!-- page_title_area(E) -->
<div class="wrap_search">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry wFit">
		<table>
			<colgroup>
				<col width="50"/>
				<col width="70"/>
				<col width="50"/>
				<col width="230"/>
				<col width="50"/>
				<col width="*" />				
			</colgroup> 
			<tr>
				<th>Code</th>
				<td><input id="rlane_cd" style="width:60px;" name="rlane_cd" dataformat="engup" maxlength="5" type="text" /> </td>
				<th>Description</th>
				<td><input id="rlane_nm" style="width:220px;" name="rlane_nm" dataformat="engupetc" maxlength="50" type="text" /> </td>
				<th id="base" name="base" >Status</th>
				<td id="base2">
					<select style="width:100;" name="status">
						<option value="" selected>ALL</option>
						<option value="A">Active</option>
						<option value="D">Delete</option>
					</select>
				</td>
			</tr> 			
		</table>
	</div>
	<!-- opus_design_inquiry(E) -->
</div>

<div class="wrap_result">

	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid">
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
	<!-- opus_design_grid(E) -->
</div>
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
        	
        	String rlaneCd = event.getRlaneCd();
          	String rlaneNm = event.getRlaneNm();
          	String status  = event.getStatus();
         	
        %>
            
	        eval("rlane_cd").value = "<%=rlaneCd%>";
	        eval("rlane_nm").value = "<%=rlaneNm%>";
        	eval("status").value     = "<%=status%>";
        	
        <% } %>
       }
-->
</SCRIPT>
<%--  <%@include file="../../include/common_alps.jsp"%> --%>