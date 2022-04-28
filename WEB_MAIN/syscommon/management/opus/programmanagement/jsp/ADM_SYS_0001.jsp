<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : ADM_SYS_0001.jsp
*@FileTitle  : Program Management
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/16
=========================================================
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.management.opus.program.event.ProgramManagementEvent"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	ProgramManagementEvent  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	DBRowSet rowSet	  = null;					//DB ResultSet
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수
	
	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.ProgramManagement.Program");
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
	   
	   
		event = (ProgramManagementEvent)request.getAttribute("Event");
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

<script language="javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>


<body  onLoad="setupPage();">
<form name="form" onkeyup="ComKeyEnter('lengthnextfocus');">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">

		<div class="page_title_area clear">
			<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
			<div class="opus_design_btn">
			   <button type="button" class="btn_accent" name="btn_Retrieve">Retrieve</button><!--
			   --><button type="button" class="btn_normal" name="btn_Save">Save</button><!--
			   --><button type="button" class="btn_normal" name="btn_DownExcel">Down Excel</button><!--
			   --><button type="button" class="btn_normal" name="btn_Copy">Copy</button>
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
					<th width="40">Program No.</th>
					<td width="120"><input type="text" style="width:100px;" dataformat="engup" otherchar="_" class="input" value="" name="s_pgm_no"></td>
					<th width="40">Program Name</th>
					<td width="120"><input type="text" style="width:100px;" class="input" value="" name="s_pgm_nm"></td>
					<th width="40">Program Type</th>
					<td><select class='input1' style="width:100px;" name ="s_pgm_tp_cd">
						<option value="00">Online</option>
						<option value="01">Report</option>
						<option value="02">Batch</option>
						<option value="">ALL</option>
						</select></td>
				</tr> 
				</tbody>
				</table>	
			</div>		
		</div>
		
		<div class="wrap_result">				
			<div class="opus_design_grid">	
				<div class="opus_design_btn">
				   <button type="button" class="btn_normal" name="btn_Add">Row Add</button>	
				</div>
				<script language="javascript">ComSheetObject('sheet1');</script>
			</div>
		</div>

<!-- 개발자 작업  끝 --> 
</form>
