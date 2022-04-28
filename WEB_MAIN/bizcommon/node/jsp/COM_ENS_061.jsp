<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_061.jsp
*@FileTitle  : Node 조회(공통 Popup)
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
<%@ page import="com.clt.bizcommon.node.event.ComEns061Event"%>
<%
	ComEns061Event  event = null;                //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;            //서버에서 발생한 에러
    DBRowSet rowSet      = null;                               //DB ResultSet
    String strErrMsg = "";                                 //에러메세지
    int rowCount     = 0;                                  //DB ResultSet 리스트의 건수
    String main_page = "";
    String usr_ofc_cd = "";
    String sDisplay = "";
    
    String mdm_yn = JSPUtil.getParameter(request, "mdm_yn".trim(), "");
	String delt_flg = JSPUtil.getParameter(request, "delt_flg".trim(), "");
    
    try {
    	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
        //userId=account.getSawonNo();
        //userAuth=account.getAuth(); 
        usr_ofc_cd = account.getOfc_cd();
       
       
        event = (ComEns061Event)request.getAttribute("Event");
        main_page = JSPUtil.getParameter(request, "main_page".trim(), "");
    	sDisplay  = JSPUtil.getParameter(request, "display".trim(), "");
        serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
       
        if (serverException != null) {
            strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
        }
    }catch(Exception e) {
        out.println(e.toString());
    }
%>
<script  type="text/javascript">
    function setupPage(ck){
        var errMessage = "<%=strErrMsg%>";
        if (errMessage.length >= 1) {
        	ComShowMessage(errMessage);
        } // end if
        // InitTab();
        loadPage('<%=main_page%>', '<%=sDisplay%>');
    }
    
</script>

<!-- 
showErrMessage를 써주지 않으면 에러 발생시 처리가 불가합니다.
그리고 지금은 showErrMessage()으로 되어있지만 추후에 고객님이 변덕을 일으켜서 웹페이지를 호출하라고 할경우를 
대비해서 직접 showErrMessage() 하지 마시고 꼭 showErrMessage를 써주십시오. 한방에 바꾸게요. 표준을 안따르면 나중에 후회합니다.  
-->
<form name="form">
<input type="hidden" name="f_cmd"> 
<input type="hidden" name="modeVal" value="<%=event.getMode()%>">
<input type="hidden" name="mode_only" value="<%=event.getMode_only()%>">
<!-- mdm data type 에 따른 select box display 구분자-->
<input type="hidden" name="mdm_yn" value="<%=mdm_yn%>">

<%if(main_page.equals("true")){ %>	
	
	<!-- page(S) -->
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		
		<!-- page_title(S) -->
	    <!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
		<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
		<!-- page_title(E) -->
	
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!--  
			--><button type="button" class="btn_normal" name="btn_new"      id="btn_new">New</button>
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
	
<%} else { 
	String popTitle = "";
	if(event.getMode() != null && event.getMode().equals("yard")) {
		popTitle = "Yard Inquiry";
	}else if(event.getMode() != null && event.getMode().equals("zone")) {
		popTitle = "Zone Inquiry";
	}else{
		popTitle = "Node Inquiry";
	}
%>
<div class="layer_popup_title">
	<!-- popup_title_area(S) -->
		<div class="page_title_area clear">
			<h2 class="page_title"><span><%=popTitle%></span></h2>
			<div class="opus_design_btn">
				<button type="button" class="btn_accent" name="btn_retrieve" 	id="btn_retrieve">Retrieve</button><!-- 
				--><button type="button" class="btn_normal" name="btn2_downexcel" 	id="btn2_downexcel">Down Excel</button><!-- 
				--><button type="button" class="btn_normal" name="btn_new"      	id="btn_new">New</button><!-- 
				--><button type="button" class="btn_normal" name="btn_ok" 			id="btn_ok">OK</button><!-- 
				--><button type="button" class="btn_normal" name="btn_close"   	id="btn_close">Close</button>
			</div>
		</div>
	<!-- popup_title_area(E) -->
</div>
<%} %>

<%if(main_page.equals("true")){ %>
<%}else{ %>
<div class="layer_popup_contents" style="overflow:hidden;">
<%} %>


	<!-- page_title_area(E) -->
	<div class="wrap_search">
		<div class="opus_design_inquiry wFit">
	        <table> 
	            <colgroup>
	                <col width="80" />
	                <col width="100" />
	                <col width="50" />
	                <col width="100" />	                
	                <col width="50" />
	                <col width="100" />
	                <col width="50" />
	                <col width="100" />
	                <col width="*" />
	            </colgroup>
	            <tbody>
	                <tr>
	                    <th>Node Code</th>
		                <td>
		                	<input type="text" name="node_cd" id="node_cd" style="width:60px;ime-mode:disabled" dataformat="engup"  min="2"  maxlength="7">
		                </td>
		                <th>Node Name</th>
		               	<td colspan="3">
		               		<input type="text" name="node_nm" id="node_nm" style="width:350px" >
		               	</td>
		               	<th>Control Office</th>
		               	<td>
		               		<input type="text" name="ofc_cd" id="ofc_cd" style="width:68px" maxlength="7" dataformat="engup" style="ime-mode:disabled">
		               	</td>
		               	<td></td>
	                </tr>
	                <tr>
	                	<th>SCC</th>
						<td><input type="text" name="scc_cd" id="scc_cd" style="width:60px" dataformat="engup" style="ime-mode:disabled"></td>
						<th>Country</th>
						<td><input type="text" name="cnt_cd" id="cnt_cd" style="width:60px" maxlength="2" dataformat="engup" style="ime-mode:disabled"></td>
						<th>Location</th>
						<td><input type="text" name="loc_cd" id="loc_cd" style="width:75px" maxlength="5" dataformat="engup" style="ime-mode:disabled"></td>
						<td class="sm pad_left_4"
							<%
								if(event.getMode_only() != null && event.getMode_only().equals("Y")) {
							%>
							style="display:none"
							<%
								}
							%>
							>
							<input type="radio" name="mode" value="yard" class="trans" id="exID01" onClick="setupPage(modeVal.value=this.value)"><label for="exID01"><b>Yard</b></label>
							<input type="radio" name="mode" value="zone" class="trans" id="exID02" onClick="setupPage(modeVal.value=this.value)" ><label for="exID02"><b>Zone</b></label>
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
								} else {
						%>
							<td colspan=2"></td>
						<%
							}
						%>
						<td></td>
	                </tr>
				</tbody>
			</table>
		</div>
		<!-- opus_design_inquiry(E) -->
	</div>
			
	<div class="wrap_result">		
		<!-- opus_design_grid(S) -->
		<div class="opus_design_grid">
			<script>ComSheetObject('sheet');</script>
		</div>
		<!-- opus_design_grid(E) -->
	</div>
	<%if(main_page.equals("true")){ %>
<%}else{ %>
	</div>
<%} %>

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
        
        	String cnt_cd       = event.getCnt_cd();
        	String loc_cd   	= event.getLoc_cd();
        	String ofc_cd       = event.getOfc_cd();
        	String node_cd      = event.getNode_cd();
        	String node_nm      = event.getNode_nm();
        	String mode			= event.getMode();
			        	
			// Office Default 세팅
        	if(!"N".equals(ofc_cd)) {
        %>
        		eval("ofc_cd").value = "<%//=usr_ofc_cd%>";
        <%
        	}
        %>
        	eval("cnt_cd").value     	= "<%=cnt_cd%>";
	        eval("loc_cd").value 		= "<%=loc_cd%>";    
	        eval("ofc_cd").value     	= "<%//=ofc_cd%>";
	        eval("node_cd").value     	= "<%=node_cd%>";
	        eval("node_nm").value     	= "<%= node_nm == null? "" :  node_nm %>";
	        
	        if("<%=mode%>" == "yard") {
	        	eval("mode")[0].checked = true;
	        } else {
	        	eval("mode")[1].checked = true;
	        }
	        
        <% } %>
       }
-->
</SCRIPT>
