<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : menumanagement.jsp
*@FileTitle  : Menu Management
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================
--%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.management.opus.menu.event.MenuManagementEvent"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	MenuManagementEvent  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	DBRowSet rowSet	  = null;					//DB ResultSet
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수
	
	String strUsr_id		= "";
	String strUsr_nm		= "";
	String strUsr_auth_tp_cd = "";
	Logger log = Logger.getLogger("com.clt.apps.MenuManagement.Menu");
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		strUsr_auth_tp_cd = account.getUsr_auth_tp_cd();
	   
		event = (MenuManagementEvent)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}else{
			if(rowSet != null){
				 rowCount = rowSet.getRowCount();
			} // end if
		} // end else
	}catch(Exception e) {
		log.error(e.toString());
	}
%>
<script>
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>
<form name="form" onkeyup="ComKeyEnter('lengthnextfocus');">
    <input type="hidden" name="f_cmd">
    <input type="hidden" name="pagerows">
    <!-- 개발자 작업	-->

	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
	    
	    <!-- page_title(S) -->
	    <h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	    <!-- page_title(E) -->
	         
	    <div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve">Retrieve</button>
			<% if ( strUsr_auth_tp_cd.equals("A") || strUsr_auth_tp_cd.equals("E") ) {%>
			<button type="button" class="btn_normal" name="btn_Save">Save</button>
			<button type="button" class="btn_normal" name="btn_DownExcel">Down Excel</button>
			<% } %>
		</div>
	    
	    <!-- page_location(S) -->
	    <div class="location">
	        <span id="navigation"></span>
	    </div>
	    <!-- page_location(E) -->
	</div>
	<!-- page_title_area(E) -->

    <!-- wrap_search(S) -->
	<div class="wrap_search">
		<div class="opus_design_inquiry wFit">		
			 <table>
                <colgroup>
                    <col width="40" />
                    <col width="120" />
                    <col width="40" />
                    <col width="120" />
                    <col width="40" />
                    <col width="*" />
                </colgroup>
		        <tbody>
					<tr>
						<th>Program No.</th>
						<td><input type="text" dataformat="engup" otherchar="_" class="input" value="" name="pgm_no"></td>
						<th>Program Name</th>
						<td><input type="text" class="input" value="" name="pgm_nm"></td>
						<th>Program Type</th>
						<td>
	                        <select class="input1" name="pgm_tp_cd">
								<option value="00">Online</option>
								<option value="01">Report</option>
								<option value="02">Batch</option>
								<option value="">ALL</option>
							</select>
						</td>
					</tr> 
				</tbody>
			</table>		
		</div>
	</div>
	<!-- wrap_search(E) -->
	
	<!-- wrap_result(S) -->
	<div class="wrap_result">
		<div class="layout_wrap">
		
		    <div class="layout_flex_flex" style="width:49%;padding-right:78.5px">
				<div class="opus_design_grid">
					<h3 class="grid_heading_clear mar_btm_4">Program</h3>
					<script>ComSheetObject('sheet1');</script>
				</div>
			</div>
			
			<div style="width:125px;position:absolute;left:50%;margin-left:-62.5px;z-index:15">
				<%
					if (strUsr_auth_tp_cd.equalsIgnoreCase("A")) {
				%>
				<div style="padding-top:162px;line-height:28px;">
					<input type="radio" name="add_type" id="child" value="0" checked class="trans" /><!-- 
				 --><label for="child">Child</label><br /><!-- 
			     --><input type="radio" name="add_type" id="pre_sibling" value="1" class="trans" /><!-- 
			     --><label for="pre_sibling">Previous Sibling</label><br /><!-- 
			     --><input type="radio" name="add_type" id="next_sibling" value="2" class="trans" /><!-- 
			     --><label for="next_sibling">Next Sibling</label><br />
			        <button type="button" class="btn_etc w100" name="btn_Add" id="btn_Add" style="margin-top:15px">Add</button>
		        </div>
			    <%
					}
				%>
			</div>
	
            <div class="layout_flex_flex" style="right:0;left:auto;width:49%;padding-left:78.5px">
				<div class="opus_design_grid">
					<h3 class="grid_heading_clear mar_btm_4">Menu</h3>
					<script>ComSheetObject('sheet2');</script>
					<script>ComSheetObject('sheet3');</script>
				</div>
			</div>
		</div>
	</div>
	<!-- wrap_result(E) -->
</form>