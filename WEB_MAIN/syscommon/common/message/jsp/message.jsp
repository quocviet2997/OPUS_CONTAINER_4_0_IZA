<%
/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : message.jsp
*@FileTitle : Message
*Open Issues :
*Change history :
*@LastModifyDate : 2009.01.02
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.01.02 정인선
* 1.0 최초 생성
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.common.messages.event.MessageEvent"%>
<%@ page import="com.clt.syscommon.common.messages.event.MessageEventResponse"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	MessageEvent  event = null;					//PDTO(Data Transfer Object including Parameters)
	MessageEventResponse eventResponse = null;
	Exception serverException   = null;
	DBRowSet rowSet	  = null;
	String strErrMsg = "";
	int rowCount	 = 0;
	
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";
	String strUsr_id		= "";
	String strUsr_nm		= "";

	Logger log = Logger.getLogger("com.clt.apps.Message.Messages");
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
	   
		event = (MessageEvent)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}else{
			eventResponse = (MessageEventResponse)request.getAttribute("EventResponse");
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
		var ids = '<%=event.getRcvrId()%>';
		var names = '<%=event.getRcvrNm()%>';
		var content = '<%=event.getMsgCtnt()%>';
		if ( ids != 'null' && names != 'null' ) {
			document.form.rcvr_usr_id.value = ids;
			document.form.rcvr_usr_nm.value = names;
			document.form.msg_ctnt.value = content;
			loadPage(0);
		} else
			loadPage(1);
	}
</script>


<form name="form">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
<input type="hidden" name="tabNum">
<input type="hidden" name="check">




<div class="layer_popup_title">
	<div class="page_title_area clear">
		<h2 class="page_title"><span>Message</span></h2>
		
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button>
		</div>
	</div>
</div>

<div class="layer_popup_contents">
	<!-- data_area(E) -->
<div class="wrap_result">
	<!-- opus_tab_btn(S) -->
	<div class="opus_design_tab">
		<script type="text/javascript">ComTabObject('tab1')</script>
	</div>
	<!-- opus_tab_btn(E) -->
	<div id="tabLayer" style="display:none">
		<div class="opus_design_grid clear">
<!-- 			<h3>New Message</h3> -->
			<div class="opus_design_btn">
				<button type="button" class="btn_normal" name="btn_send" id="btn_send">Send</button>
<!-- 				<button type="button" class="btn_normal" name="btn_t1address" id="btn_t1address">Address Search</button> -->
			</div>
			
			<table> 
				<tbody>
					<tr>
						<th align="left">To.</th>
						<td>
							<input type="text" style="width:150px;" class="input2" value="" name="rcvr_usr_nm" required caption="To." readonly>
							<input type="hidden" name="rcvr_usr_id"></td>
					</tr>
					<tr style="height:4px;"></tr>
					<tr>
						<th align="left">Content</th>
						<td colspan="2"><textarea style="width:600px;height:370px" name="msg_ctnt" onkeydown="contentLen();"></textarea></td>
					</tr>
					<tr>
						<td></td>
						<td>
						<table border="0" style="width:100%;">
							<tr>
							<td width="80%"><input class="Trans" type="checkbox" name="kep_flg"/><font color="#6699cc">Save to Savedbox</font></td>
							</tr>
						</table>
						</td>
						<td align="right"><strong><span id="ctntCount"> 0</span></strong> Byte<strong>/ 4000</strong> Byte</td>
						<td></td>
					</tr>
				</tbody>
			</table> 
			<!-- opus_design_btn(S) -->
			
			<!-- opus_design_btn(E) -->	
		</div>
	</div>

	<div id="tabLayer" style="display:none">
		<div class="opus_design_grid clear">
<!-- 			<h3>Inbox</h3>			 -->
			<!-- opus_design_btn(S) -->
			<div class="opus_design_btn">
 				<button type="button" class="btn_normal" name="btn_t2reply" id="btn_t2reply">Reply</button><!--
				--><button type="button" class="btn_normal" name="btn_t2delete" id="btn_t2delete">Delete</button><!--
				--><button type="button" class="btn_normal" name="btn_t2keep" id="btn_t2keep">Achieve</button>
			</div>
			<!-- opus_design_btn(E) -->	
		<script language="javascript">ComSheetObject('t2sheet1');</script>
		</div>
				<table border="0" style="width:100%;">  
				<tr class="h23">
						<td> </td>
						<td colspan="3" style="color:#6699cc;">Please archive important message to savedbox. before server delete expired message (default set to 30 days after the message arrives)</td>
					</tr>
				</table> 
				<table border="0" style="width:100%;">  
					<tr class="h23">
						<td colspan="2"><textarea style="width:100%;height:250px" name="from_ctnt" id="from_ctnt"></textarea></td>
					</tr>
				</table>
	</div>

	<div id="tabLayer" style="display:none">
		<div class="opus_design_grid clear">
<!-- 			<h3>Outbox</h3>			 -->
				
			<!-- opus_design_btn(S) -->
			<div class="opus_design_btn">
 				<button type="button" class="btn_normal" name="btn_t3delete" id="btn_t3delete">Delete</button><!--
				--><button type="button" class="btn_normal" name="btn_t3keep" id="btn_t3keep">Achieve</button>
			</div>
			<!-- opus_design_btn(E) -->	
		<script language="javascript">ComSheetObject('t3sheet1');</script>
		</div>
		<table border="0" style="width:100%;">  
					<tr class="h23">
						<td colspan="2"><textarea style="width:100%;height:250px" name="archieve_ctnt" id="archieve_ctnt"></textarea></td>
					</tr>
				</table> 
	</div>

	<div id="tabLayer" style="display:none">
		<div class="opus_design_grid clear">
<!-- 			<h3>Savedbox</h3>			 -->
			<!-- opus_design_btn(S) -->
			<div class="opus_design_btn">
 				<button type="button" class="btn_normal" name="btn_t4reply" id="btn_t4reply">Reply</button><!--
				--><button type="button" class="btn_normal" name="btn_t4delete" id="btn_t4delete">Delete</button>
			</div>
			<!-- opus_design_btn(E) -->	
		<script language="javascript">ComSheetObject('t4sheet1');</script>
		</div>
				<table border="0" style="width:100%;">  
				<tr class="h23">
						<td> </td>
						<td colspan="3" style="color:#6699cc;">Please archive important message to savedbox. before server delete expired message (default set to 30 days after the message arrives)</td>
					</tr>
				</table> 

				<table border="0" style="width:100%;">  
					<tr class="h23">
						<td colspan="2"><textarea style="width:100%;height:250px" name="to_ctnt" id="to_ctnt"></textarea></td>
					</tr>
				</table> 
	</div>
	
	
	</div>
</div>
<!-- popup_contens_area(E) -->






<!--TAB 쪽지보관함 (S) -->
<div id="tabLayer" style="display:none">
		<!-- : ( Search Options ) (S) -->
			<table class="search"> 
       		<tr><td class="bg">
				<table class="search" border="0">
				<tr><td class="title_h"></td>
					<td class="title_s">Savedbox </td>
						<td width="72px"><table width="70px" border="0" cellpadding="0" cellspacing="0" class="button">
						<tr><td class="btn2_left"></td>
						<td class="btn2" name="btn_t4reply">Reply</td>
						<td class="btn2_right"></td>
						</tr>
						</table></td>
						<td width="72px"><table width="70px" border="0" cellpadding="0" cellspacing="0" class="button">
						<tr><td class="btn2_left"></td>
						<td class="btn2" name="btn_t4delete">Delete</td>
						<td class="btn2_right"></td>
						</tr>
						</table></td>
					</tr>
				</table>
				Grid  (S)
				<table width="100%"  id="mainTable"> 
					<tr>
						<td width="100%">
							<script language="javascript">ComSheetObject('t4sheet1');</script>
						</td>
					</tr>
				</table> 				
				Grid  (E)
				<table border="0" style="width:100%;">  
				<tr class="h23">
						<td> </td>
						<td colspan="3" class="sm" style="color:#6699cc;"></td>
					</tr>
				</table> 
				<table border="0" style="width:100%;">  
					<tr class="h23">
						<td colspan="2"><textarea style="width:100%;height:250px" name="archive_ctnt""></textarea></td>
					</tr>
				</table> 
			
			
			</td></tr>
		</table>
<!-- : ( Search Options ) (E) -->
</div>
<!--TAB 쪽지보관함 (E)  -->
</form>

