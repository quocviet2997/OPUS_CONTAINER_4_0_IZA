<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_051.jsp
*@FileTitle  : Location Code Inquiry
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/20
=========================================================
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.location.event.ComEns051Event"%>
<%
	ComEns051Event  event = null;                        //PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;                    //서버에서 발생한 에러
	String strErrMsg = "";                                 //에러메세지
	String main_page = "";
	String usr_ofc_cd = "";
	String lcc_cd = JSPUtil.getParameter(request, "lcc_cd".trim(), "");
	main_page = JSPUtil.getParameter(request, "main_page".trim(), "");
	
	String mdm_yn = JSPUtil.getParameter(request, "mdm_yn".trim(), "");
	String delt_flg = JSPUtil.getParameter(request, "delt_flg".trim(), "");
	
	String scc_flg = "";
	
	try {
		SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
	    usr_ofc_cd = account.getOfc_cd();
	    event = (ComEns051Event)request.getAttribute("Event");
	    scc_flg = event.getSccFlg();
		
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

<!-- 
showErrMessage를 써주지 않으면 에러 발생시 처리가 불가합니다.
그리고 지금은 showErrMessage()으로 되어있지만 추후에 고객님이 변덕을 일으켜서 웹페이지를 호출하라고 할경우를 
대비해서 직접 showErrMessage() 하지 마시고 꼭 showErrMessage를 써주십시오. 한방에 바꾸게요. 표준을 안따르면 나중에 후회합니다.  
-->


<!-- OUTER - POPUP (S)tart -->

<form name="form">
<%if(main_page.equals("true")){ %>
<input type="hidden" name="f_cmd" id="f_cmd"> 
<input type="hidden" name="lcc_cd"  id="lcc_cd" value="<%=lcc_cd %>"> 
<input type="hidden" name="loc_port_ind" id="loc_port_ind">
<input type="hidden" name="sysCode" id="sysCode">
<input type="hidden" name="mdm_yn" id="mdm_yn" value="<%=mdm_yn%>">
<input type="hidden" name="scc_flg" id="scc_flg" value="">

	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
		<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
			--><button type="button" class="btn_normal" name="Code_Detall" id="Code_Detall">Code Detail</button><!--
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
<input type="hidden" name="f_cmd" id="f_cmd"> 
<input type="hidden" name="lcc_cd" id="lcc_cd" value="<%=lcc_cd %>"> 
<input type="hidden" name="loc_port_ind" id="loc_port_ind">
<input type="hidden" name="sysCode" id="sysCode">
<input type="hidden" name="mdm_yn" id="mdm_yn" value="<%=mdm_yn%>">
<input type="hidden" name="scc_flg" id="scc_flg" value="<%=scc_flg%>">
<!-- page_title_area(S) -->
<div class="page_title_area clear">
		<!-- page_title(S) -->
		<!-- <h2 class="page_title"><button type="button"><span id="title"></span></button></h2> -->
		<h2 class="page_title"><span>
			<%
				if("Y".equals(scc_flg)){
			%>
				&nbsp;EQ SCC Code Inquiry 
			<%	
				}else{
			%>
				&nbsp;Location / Port Code Inquiry
			<%} %>		
		</span></h2>	
		<!-- page_title(E) -->
	    <!-- opus_design_btn(S) -->
	    <div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!-- 
			 --><button type="button" class="btn_normal" name="btn2_Down_Excel" id="btn2_Down_Excel">Down Excel</button><!-- 
			 --><button type="button" class="btn_normal" name="Code_Detall" id="Code_Detall">Code Detail</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_OK" id="btn_OK">OK</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_Close" id="btn_Close">Close</button>					
	    </div>
	    <!-- opus_design_btn(E) -->
		<!-- page_location(S) -->
		<div class="location">
			<span id="navigation"></span>
		</div>
		<!-- page_location(E) -->
</div>
<%} %>
	<!-- wrap_search_tab(S) -->
	<div class="wrap_search">
		<!-- opus_design_inquiry(S) -->
		<div class="opus_design_inquiry wFit" >
			<!--  MiniLayer (S) -->
			<table >
				<colgroup>				            
					<col width="90">
					<col width="120">
					<col width="90">
					<col width="100">
					<col width="50">
					<col width="40">
					<col width="60">
					<col width="30">
					<col width="40">
					<col width="*">
				</colgroup>
				<tbody>
					<tr>
						<th>Location Code</th>
						<td><input name="loc_cd" id="loc_cd" type="text" style="width:100px;ime-mode:disabled" dataformat="engup" maxlength="5"></td>
						<th>RCC</th>
						<td>
							<!-- <select name="rcc_cd" id="rcc_cd">
								<option value="">All</option>
								<option value="CNSHA">CNSHA</option>
								<option value="SGSIN">SGSIN</option>
								<option value="USNYC">USNYC</option>
								<option value="JPTYO">JPTYO</option>
								<option value="KRSEL">KRSEL</option>
								<option value="DEHAM">DEHAM</option>
								<option value="TWTPE">TWTPE</option>
								<option value="CNHKG">CNHKG</option>
							</select> -->
							<script language="javascript">ComComboObject('rcc_cd' , 1, 80, 1 )</script>
						</td>
						<th>Country</th>
						<td><input name="cnt_cd" id="cnt_cd" type="text" style="width:30px;ime-mode:disabled" dataformat="enguponly" maxlength="2"></td>
						<th>UN Code</th>
						<td><input name="un_loc_ind_cd" id="un_loc_ind_cd" type="text" style="width:20px;ime-mode:disabled" dataformat="enguponly" maxlength="1"></td>
						<th>State</th>
						<td><input name="loc_state" id="loc_state" type="text" style="width:100%;ime-mode:disabled" dataformat="engup" maxlength="3"></td>
					</tr>
				</tbody>
			</table>
			<table>
				<colgroup>				            
					<col width="90">
					<col width="120">
					<col width="90">
					<col width="100">
					<col width="*">
				</colgroup>
				<tbody>
					<tr>
						<th>Location Name</th>
						<td><input name="loc_nm" id="loc_nm" type="text" style="width:100px;ime-mode:disabled" /></td>
						<th>Control Office</th>
						<td>
							<select name="select" id="select">
								<option value=""></option>
								<option value="A">All</option>
								<option value="S">Sales</option>
								<option value="F">Finance</option>
								<option value="E">EQ-Logistics</option>
							</select><!--  
							--><input name="loc_eq_ofc" id="loc_eq_ofc" type="text" style="width:130px;ime-mode:disabled" dataformat="enguponly" maxlength="5">
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
				</tbody>
			</table>
		</div>
		<!-- opus_design_inquiry(E) -->
	</div>
	<!-- wrap_search_tab(E) -->
	
	<!-- wrap_result(S) -->
	<div class="wrap_result">	
		<!-- opus_design_grid(S) -->
		<div class="opus_design_grid" id="mainTable" >										
			<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>
	</div>
	<!-- opus_design_grid(E) -->
<%if(!main_page.equals("true")){ %>
<% } %>
<!-- OUTER - POPUP (E)nd -->
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
        	String loc_cd     = event.getLocCd();
        	
        	String rcc_cd     = event.getRccCd();
            String cnt_cd = event.getCntCd();
            String un_loc_ind_cd     = event.getUnLocIndCd();
            String loc_nm     = event.getLocNm();
           
            String select     = event.getSelect();
            String loc_eq_ofc     = event.getLocEqOfc();
            // 타이틀 변경 때문에 페이지 위에서 받음.
            scc_flg = event.getSccFlg();
            
			// Office Default 세팅
     
        %>
            eval("loc_cd").value = "<%=loc_cd%>";
            eval("cnt_cd").value = "<%=cnt_cd%>";
            eval("un_loc_ind_cd").value = "<%=un_loc_ind_cd%>";
            eval("loc_nm").value = "<%=loc_nm%>";
            eval("select").value = "<%=select%>";
            eval("loc_eq_ofc").value = "<%=loc_eq_ofc%>";
            eval("scc_flg").value = "<%=scc_flg%>";

        <% } %>
       }
-->
</SCRIPT> 