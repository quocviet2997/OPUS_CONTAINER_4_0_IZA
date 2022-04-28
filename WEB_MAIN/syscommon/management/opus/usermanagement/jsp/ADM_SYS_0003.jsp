<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : ADM_SYS_0003.jsp
*@FileTitle  : User Management
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================
--%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.config.SubSystemConfigFactory"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.management.opus.user.event.UserManagementEvent"%>
<%@ page import="com.clt.syscommon.common.util.OrganizationUtil"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	UserManagementEvent  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	DBRowSet rowSet	  = null;					//DB ResultSet
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수
	
	boolean adminAuth = false;
	String idPrefixEnabled = "false";
	
	String strUsr_id		= "";
	String strUsr_nm		= "";
	String strUsr_auth = "";
	String admin_page = "";
	Logger log = Logger.getLogger("com.clt.apps.UserManagement.User");
	SignOnUserAccount account = null;
	
	try {
	   	account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		strUsr_auth = account.getUsr_auth_tp_cd();
		idPrefixEnabled = SubSystemConfigFactory.get("SYS.USERID.PREFIX.ENABLED"); // [SR0002499] User ID Validation Flag
	   
		event = (UserManagementEvent)request.getAttribute("Event");
		admin_page = event.getAdminPage();
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if ( account.getUsr_auth_tp_cd().equals("A") ) adminAuth = true;
		else adminAuth = false;

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
	}catch(Exception e) {
		log.error(e.toString());
	}
%>
<script language="javascript">
var prefixValFlag = <%=idPrefixEnabled%>;
var almightyFlag = false;
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		if (curPgmNo == 'COM_SEC_0001' ) {
			if ( document.all.s_usr_id ) document.all.s_usr_id.value = '<%=strUsr_id%>';
			loadPage(true);
		} else {
			loadPage(false);
		}
<% if ( account.getUsr_auth_tp_cd().equals("A") ) { %>
		almightyFlag = true;
<% } %>
	}
</script>
<form name="form" onkeyup="ComKeyEnter('lengthnextfocus');">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
<input type="hidden" name="pgm_no_form">
<input type="hidden" name="admin_page" value="<%= admin_page %>"> 
<input type="hidden" id="strUsr_auth" value="<%=strUsr_auth%>"> 

	<div class="page_title_area clear">
	    
	    <h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	         
	    <div class="opus_design_btn">
	    <% if (! strUsr_auth.equals("R") ) { %>
	   		<button type="button" class="btn_accent" name="btn_Retrieve"   	id="btn_Retrieve">Retrieve</button><!--
	    	 --><button type="button" class="btn_normal" name="btn_Copy" 		id="btn_Copy">Copy</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_Save"   		id="btn_Save">Save</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_DownExcel"   id="btn_DownExcel">Down Excel</button>
	    <% } %>
	    </div>
	    
	    <div class="location">
	        <span id="navigation"></span>
	    </div>
	</div>

	<div class="wrap_search">
		<div class="opus_design_inquiry wFit">
		<% if (! strUsr_auth.equals("R") ) { %>
		    <table>
		        <tbody>
					<tr>
						<th width="40">User ID</th>
						<td width="120"><input type="text" style="width:100px;" class="input" value="" name="s_usr_id"></td>
						<th width="40">Office Code</th>
						<td width="150"><input type="text" style="width:100px;" class="input" name= "s_ofc_cd" value="" dataformat="engup"><!-- 
						 --><button type="button" class="input_seach_btn" name="btn_ofc_cd"></button></td>
						<th width="40">User Auth. Type</th>
						<td><select style="width:100px;" class="input1" name ="s_usr_auth_tp_cd">
						<option value="">ALL</option>
							<option value="R">Regular</option>
							<option value="S">Super User</option>
							<option value="A">Almighty</option>
							</select></td>
						<th>User Name</th>
						<td><input type="text" style="width:100px;" class="input" value="" name="s_usr_nm"></td>
						<th>Use Flag</th>
						<td><select style="width:100px;" class="input1" name ="s_use_flg">
							<option value="">ALL</option>
							<option value="Y" selected>Yes</option>
							<option value="N">No</option>
							</select>
						</td>
						<th>ID DIV</th>
						<td><select style="width:100px;" class="input1" name ="s_id_div">
							<option value="">ALL</option>
							<option value="GID">GID</option>
							<option value="LID">LID</option>
							</select>
						</td>
					</tr>
				</tbody>
			</table>
		<% }else{ %>
			<input type="hidden" name="s_usr_id">
		<% } %>
		</div>
	</div>

	<div class="wrap_result">
		<div class="opus_design_grid">
		
		<% if (! strUsr_auth.equals("R") ) { %>
		    <% if (adminAuth) { %>
		    <div class="opus_design_btn">
		    	<div style="float:left;margin-right: 0px">
					<input type="text" dataformat="num"  name="addrows" id="addrows" size="3" value="1">
				</div>
		        <button type="button" class="btn_normal" name="btn_Add" id="btn_Add">Row Add</button>
		    </div>
		    <% } %>	
		<% } %>
			<script language="javascript">ComSheetObject('sheet1');</script>
		</div>
	</div>
</form>