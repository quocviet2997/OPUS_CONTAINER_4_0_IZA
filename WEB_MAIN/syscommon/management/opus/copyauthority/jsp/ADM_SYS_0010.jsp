<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : ADM_SYS_0002.jsp
*@FileTitle  : Menu Management
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================
--%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.management.opus.copyauthority.event.CopyAuthorityEvent"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	CopyAuthorityEvent  event = null;			//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	DBRowSet rowSet	  = null;					//DB ResultSet
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수
	
	String strUsr_id		= "";
	String strUsr_nm		= "";
	String strUsr_auth_tp_cd = "";
	String admin_page 		= "";
	Logger log = Logger.getLogger("com.clt.apps.MenuManagement.Menu");
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		strUsr_auth_tp_cd = account.getUsr_auth_tp_cd();
		event = (CopyAuthorityEvent)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		
		admin_page = event.getParam().get("admin_page");
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
//	com.tobesoft.iam.virtualagent.TBVirtualAgent VA = new com.tobesoft.iam.virtualagent.TBVirtualAgent();
//	out.println(VA.decrypt("wd3t1P22QHNmT4m9yFfPDg==")); //qhdkscjfwj
%>
<script  type="text/javascript">
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


<!-- OUTER - POPUP (S)tart -->
<%if(admin_page.equals("Y")){ %>
<!-- page_title_area(S) -->
<div class="page_title_area clear ">
    <!-- page_title(S) -->
    <h2 class="page_title"><button type="button"><span id="title">Copy of Authority</span></button></h2>
    <!-- page_title(E) -->
        
    <!-- opus_design_btn(S) -->
    <div class="opus_design_btn">
		<button type="button" class="btn_accent" name="btn_Save" id="btn_Save">Save</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_New"   id="btn_New">New</button>
    </div>
    <!-- opus_design_btn(E) -->      
    <div class="location">
	     <span id="navigation"></span>
	</div>
</div>
<!-- page_title_area(E) -->
<%} else { %>
<!-- popup_title_area(S) -->
 <div class="layer_popup_title">
    <!-- page_title_area(S) -->
    <div class="page_title_area clear">
        <!-- page_title(S) -->
        <h2 class="page_title"><span>Copy of Authority</span></h2>
        <!-- page_title(E) -->
            
        <!-- opus_design_btn(S) -->
        <div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Save" id="btn_Save">Save</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_New"   id="btn_New">New</button><!-- 
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

	<div class="wrap_search">
		<div class="opus_design_inquiry wFit">
		    <table> 
		    	<colgroup>
		    		<col width="80">
		    		<col width="200">
		    		<col width="80">
		    		<col width="*">
		    	</colgroup>
			    <tbody>
					<tr>
						<th>Option</th>
						<td>
							<input type="radio" class="trans" name="opt" id="opt" checked value="add"><label for="opt">Add</label><!-- 
							 --><input type="radio" class="trans" name="opt" id="opt" value="del"><label for="opt">Delete &amp; Insert</label>
						</td>
						<th>Function</th>
						<td>
							<input type="checkbox" class="trans" id="RAP" name="RAP"><label for="RAP">Role &amp; Program</label><!-- 
							 --><input type="checkbox" class="trans" id="SUR" name="SUR"><label for="SUR">Super User's Role</label><!--
							 --><input type="checkbox" class="trans" id="OC"  name="OC"><label for="OC">Office Change</label>
						</td>
					</tr> 
				</tbody>
			</table>				
		</div>
	</div>

	<div class="wrap_result">
		<div><h3 class="title_design">From</h3></div>
		<div class="opus_design_grid">
			
			<script  type="text/javascript">ComSheetObject('sheet1');</script>
		</div>
		<div><h3 class="title_design">To</h3></div>
		<div class="opus_design_grid">
			
			<div class="opus_design_btn">
				<div style="float:left;margin-right: 0px">
					<input type="text" dataformat="num"  name="addrows" id="addrows" size="3" value="1">
				</div>
				<button type="button" class="btn_normal" name="btng_rowadd" id="btng_rowadd">Row Add</button>
			</div>
			<script  type="text/javascript">ComSheetObject('sheet2');</script>
		</div>
	</div>
<% if(!admin_page.equals("Y")){ %>
</div>
<% } %>
</form>