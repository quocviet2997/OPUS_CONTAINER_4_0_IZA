<%
/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : ADM_SYS_0011.jsp
*@FileTitle : Item Control Management
*Open Issues :
*Change history :
*@LastModifyDate :
*@LastModifier : 
*@LastVersion : 1.0
=========================================================*/
%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.management.opus.itemcontrolmanagement.event.ItemControlManagementEvent"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	ItemControlManagementEvent  event = null;	//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//Error from server
	String strErrMsg = "";						//Error message
	int rowCount	 = 0;						//Count of DB resultSet list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.commoncode.organization");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (ItemControlManagementEvent)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>
<script language="javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>
<form name="form">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">

	<div class="page_title_area clear">
	    
	    <h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	         
	    <div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_retrieve" 	id="btn_retrieve">Retrieve</button><!--
		 --><button type="button" class="btn_normal" name="btn_new"   		id="btn_new">New</button><!--
		 --><button type="button" class="btn_normal" name="btn_save"   		id="btn_save">Save</button>
	    </div>
	    
	    <div class="location">
	        <span id="navigation"></span>
	    </div>
	</div>

	<div class="wrap_search">
		<div class="opus_design_inquiry wFit">
		    <table>
		        <tbody>
		        <tr>
					<th width="40">Module Code</th>
					<td width="80"><script language="javascript">ComComboObject('pgm_sub_sys_cd', 1, 60, 1)</script></td>
					<th width="40">Control Type</th>
					<td width="120"><script language="javascript">ComComboObject('ctrl_tp_cd', 1, 100, 1)</script></td>
					<th width="40">Setting Type</th>
					<td><script language="javascript">ComComboObject('set_tp_cd', 1, 110, 1)</script></td>
				</tr>
				</tbody>
			</table>
		</div>
	</div>
	
	<div class="wrap_result">
		<div class="opus_design_grid">
		    
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_rowadd" id="btn_rowadd">Row Add</button><!--
		 --><button type="button" class="btn_normal" name="btn_rowdelete" id="btn_rowdelete">Row Delete</button>
		</div>
			<script language="javascript">ComSheetObject('sheet1');</script>
		</div>
	</div>


</form>
