<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_COM_0006.jsp
*@FileTitle  : Group Customer Code Inquiry
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.custgroup.event.ComCom0006Event"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	ComCom0006Event  event = null;                //PDTO(Data Transfer Object including Parameters)
    GeneralEventResponse eventResponse = null;    //RDTO(Data Transfer Object including DB ResultSet)
    Exception serverException   = null;            //서버에서 발생한 에러
    DBRowSet rowSet      = null;                               //DB ResultSet
    String strErrMsg = "";                                 //에러메세지
    int rowCount     = 0;                                  //DB ResultSet 리스트의 건수
    String main_page = "";
    Logger log = Logger.getLogger("com.clt.apps.commoncode.partner");
    String mdm_yn = request.getParameter("mdm_yn") != null ? request.getParameter("mdm_yn") : "";
    String delt_flg = request.getParameter("delt_flg") != null ? request.getParameter("delt_flg") : "";
    
    try {
       //SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
       //userId=account.getSawonNo();
       //userAuth=account.getAuth(); 
      
        event = (ComCom0006Event)request.getAttribute("Event");
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

<script language="javascript">
    function setupPage(){
        var errMessage = "<%=strErrMsg%>";
        if (errMessage.length >= 1) {
            ComShowMessage(errMessage);
        }
        
        if('<%=delt_flg%>' == ""){
        	document.all.delt_flg.value = "N";
        }
        
        loadPage();
    }
</script>
<!-- 
showErrMessage를 써주지 않으면 에러 발생시 처리가 불가합니다.
그리고 지금은 showErrMessage()으로 되어있지만 추후에 고객님이 변덕을 일으켜서 웹페이지를 호출하라고 할경우를 
대비해서 직접 showErrMessage() 하지 마시고 꼭 showErrMessage를 써주십시오. 한방에 바꾸게요. 표준을 안따르면 나중에 후회합니다.  
-->

<form name="form" onkeyup="ComKeyEnter();">
<input type="hidden" name="f_cmd">
<input type="hidden" name="mdm_yn" value="<%=mdm_yn%>">
<%
	if(!"Y".equals(mdm_yn)){
%>
<input type="hidden" name="delt_flg">
<%
	}
%>
<!-- popup_title_area(S) -->
 <div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<!-- <h2 class="page_title">Group Customer Code Inquiry</h2> -->
		<h2 class="page_title"><span id="title1">Group Customer Code Inquiry</span></h2>
		<!-- page_title(E) -->
			
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
			--><button type="button" class="btn_normal" name="btn_Down_Excel" id="btn_Down_Excel">Down Excel</button><!--
			--><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button><!--
			--><button type="button" class="btn_normal" name="btn_OK" id="btn_OK">OK</button><!--
			<%if(!main_page.equals("true")){ %>
			--><button type="button" class="btn_normal" name="btn_Close" id="btn_Close">Close</button>
			<%} %>
		</div>
		<!-- opus_design_btn(E) -->	
	</div>
	<!-- page_title_area(E) -->
</div>
<!-- popup_title_area(E) -->

<!-- popup_contens_area(S) -->
<div class="layer_popup_contents">


<!-- wrap_search(S) -->
<div class="wrap_search">
	<div class="opus_design_inquiry">   <!-- no TAB  -->
		<table>
			<tr>
				<th width="40">Code</th>
				<td width="100"><input type="text" class="input" name="cust_grp_id" dataformat="engup" otherchar="-" maxlength="10" size="10" style="width:80px; ime-mode:disabled"></td>					
				<th width="50">Name</th>
				<td width="200"><input type="text" class="input" name="cust_grp_nm" dataformat="engup" otherchar=" -_"  maxlength="50" size="50" style="width:180px;ime-mode:disabled"></td>
				<th width="90">Abbreviation</th>
				<td><input type="text" class="input" name="cust_grp_abbr_nm" dataformat="excepthan" otherchar=" " maxlength="50" size="50" style="width:180px;ime-mode:disabled"></td>
				
				<%if(!"".equals(mdm_yn) && mdm_yn.length() > 0){%>
				<th width="50">Status</th>
				<td>
					<select name="delt_flg" style="width:60;">
						<option value="ALL" >ALL</option>
						<option value="N" selected>Active</option>
						<option value="Y">Delete</option>
					</select>
				</td>
				<%}%>
			</tr>
		</table>
	</div>
</div>
<!-- wrap_search(E) -->



<!-- wrap_result(S) -->
<div class="wrap_result" >

	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid">
		<script language="javascript">ComSheetObject('sheet1');</script>	
	</div>
	<!-- opus_design_grid(E) -->
	
</div>
<!-- wrap_result(E) -->




</div>
<!-- popup_contens_area(E) -->




</form>

<SCRIPT LANGUAGE="javascript">
<!--
      /* 
        ibSheet 를 제외한 폼 입력값(?) 유저가 입력한 정보를 event를 통해서 다시 넘겨받아 화면에 뿌려주는 부분입니다. 
      */
      with(document.form)
      {
        <%
        if(event != null){ 
        	
        	String custGrpId = event.getCustGrpId();
          	String custGrpNm = event.getCustGrpNm();
          	String deltFlg = event.getDeltFlg();
         	
        %>
            
	        eval("cust_grp_id").value = "<%=custGrpId%>";
	        eval("cust_grp_nm").value = "<%=custGrpNm%>";
        	eval("delt_flg").value     = "<%=deltFlg%>";
        	
        <% } %>
       }
-->
</SCRIPT>
  <%@include file="../../include/common_alps.jsp"%>