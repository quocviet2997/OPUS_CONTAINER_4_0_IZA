<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0026.jsp
*@FileTitle  : Movement status
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/03
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.service.event.BcmCcd0026Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
		BcmCcd0026Event  event = null;				//PDTO(Data Transfer Object including Parameters)
		Exception serverException   = null;			//error from server
		String strErrMsg = "";						//error message
		int rowCount	 = 0;						//count of DB resultSet list
		String successFlag = "";
		String codeList  = "";
		String pageRows  = "100";
		String strUsr_id		= "";
		String strUsr_nm		= "";
		Logger log = Logger.getLogger("com.clt.apps.commoncode.sevice");
		try {
		   		SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
				strUsr_id =	account.getUsr_id();
				strUsr_nm = account.getUsr_nm();
				event = (BcmCcd0026Event)request.getAttribute("Event");
				serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
				if (serverException != null) {
						strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
				}
				GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		} catch(Exception e) {
				out.println(e.toString());
		}
%>

<script type="text/javascript">
		var G_MDAA_CHK;
		var G_AHTU_TP_CD;
	
		function setupPage(){
				var errMessage = "<%=strErrMsg%>";
				if (errMessage.length >= 1) {
						ComShowMessage(errMessage);
				} // end if
				loadPage();
		}
</script>

<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="ibflag" value="I" id="ibflag" />
<input type="hidden" name="user_id" value="<%= strUsr_id %>" id="user_id" />
<input type="hidden" name="mdm_yn" value="Y" id="mdm_yn" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!--  
		--><button type="button" class="btn_normal" name="btn_save" id="btn_save">Save</button><!-- 
		--><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button>
	</div>
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
	<div class="opus_design_inquiry">
		<table>
			<tbody>
				<colgroup>
					<col width="150" />
					<col width="150" />
					<col width="150" />
					<col width="*" />
				</colgroup>
				<tr>
					<th>Movement Status Code</th>
					<td><input type="text" style="width:100px;ime-mode:disabled;text-align:center" class="input1" name="mvmt_sts_cd" dataformat="engup" maxlength="2" id="mvmt_sts_cd" /><button type="button" class="input_seach_btn" name="btn_mvmt_sts_search" id="btn_mvmt_sts_search"></button></td>
					<th>Name</th>
					<td><input type="text" style="width:500px;ime-mode:disabled;text-align:left" class="input1" name="mvmt_sts_nm" dataformat="engup" otherchar="()_\-,. " maxlength="50" id="mvmt_sts_nm"/></td>
				</tr>
				<tr>
					<th>Destination Flag</th>
					<td width="" style="padding-left:2"><script type="text/javascript">ComComboObject('dest_yd_flg', 1, 100, 1, 0 ,0 ,false)</script></td>
					<th>In/Out Bound </th>
					<td width="" style="padding-left:2"><script type="text/javascript">ComComboObject('io_bnd_cd', 1, 100, 1, 0 ,0 ,false)</script></td>
				</tr>
				
			</tbody>
		</table>
		<table> 
			<colgroup>
                <col width="150"/>
                <col width="120">
            	<col width="100">
            	<col width="120">
            	<col width="100">
            	<col width="150">
            	<col width="100">
            	<col width="120">
            	<col width="100">
                <col width="*"/>
            </colgroup>
			<tr>
				<th>Delete Flag</th>
				<td style="padding-left:2"><script type="text/javascript">ComComboObject('delt_flg', 1, 100, 1, 0 ,0 ,false)</script></td>
				<th>Create User</th>
		            <td><input type="text" style="width:80px;text-align:center;" class="input" name="cre_usr_id" id="cre_usr_id" readOnly/>
		            </td>
		            <th>Create Date/Time</th>
		            <td><input type="text" style="width:120px;text-align:center;" class="input" name="cre_dt" id="cre_dt" readOnly/>
		            </td>
		            <th>Last Update User</th>
		            <td><input type="text" style="width:80px;text-align:center;" class="input" name="upd_usr_id" id="upd_usr_id" readOnly/>
		            </td>
		            <th>Last Update Date/Time</th>
		            <td><input type="text" style="width:120px;text-align:center;" class="input" name="upd_dt" id="upd_dt" readOnly/>
		            </td>
			</tr>	
		</table>
	</div>
	<!-- opus_design_inquiry(E) -->
</div>

<!-- opus_design_grid(S) -->
<div class="opus_design_grid">
	<script type="text/javascript">ComSheetObject('sheet1');</script>
</div>
<!-- opus_design_grid(E) -->
</form>