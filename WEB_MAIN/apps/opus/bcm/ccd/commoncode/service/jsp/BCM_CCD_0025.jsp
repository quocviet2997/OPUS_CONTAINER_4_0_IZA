<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0025.jsp
*@FileTitle  : activity
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/04
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.service.event.BcmCcd0025Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
		BcmCcd0025Event  event = null;				//PDTO(Data Transfer Object including Parameters)
		Exception serverException   = null;			//Error from server
		String strErrMsg = "";						//Error message
		int rowCount	 = 0;						//Count of DB resultSet list

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


				event = (BcmCcd0025Event)request.getAttribute("Event");
				serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

				if (serverException != null) {
						strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
				}

				GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

		}catch(Exception e) {
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
	
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn"><!--
	--><button type="button" class="btn_accent" name="btn_retrieve" 	id="btn_retrieve">Retrieve</button><!--
	--><button type="button" class="btn_normal" name="btn_save" 		id="btn_save">Save</button><!--
	--><button type="button" class="btn_normal" name="btn_new" 		id="btn_new">New</button>
			
	</div>
	<!-- opus_design_btn(E) -->

	<!-- page_location(S) -->
	<div class="location">	
		<span id="navigation"></span>
	</div>
	<!-- page_location(E) -->
	
</div>
<!-- page_title_area(E) -->

<div class="wrap_search">
	<div class="opus_design_inquiry wFit">
		<table> 
		<colgroup>
		<col width="175">
			<col width="*">
		</colgroup>
			<tr>
				<th>Activity Code</th>
				<td><input type="text" style="width:115px;ime-mode:disabled;text-align:center" class="input1" name="act_cd" dataformat="engup" maxlength="6" id="act_cd" /><button type="button" name="btns_search1" id="btns_search1" class="input_seach_btn"></button></td>				
			</tr>	
		</table>
		</div>
		<table class="line_bluedot"><tr><td></td></tr></table>	
		<div class="opus_design_inquiry wFit">
		<table> 
		<colgroup>
		<col width="170">
		<col width="130">
		<col width="60">
		<col width="100">
		<col width="102">
		<col width="150">
		<col width="*">
		</colgroup>
			<tr>
				<th>Name</th>
				<td colspan="3"><input type="text" style="width:420px;ime-mode:disabled;text-align:left" class="input1" name="act_nm" dataformat="engup" otherchar=" " maxlength="50" id="act_nm" /> </td>
				<th>Description</th>
				<td colspan="3"><input type="text" style="width:408px;text-align:left" class="input" name="act_desc" maxlength="100" id="act_desc" /> </td>
			</tr>	
	
			<tr>
				<th>Activity Type</th>
				<td><script type="text/javascript">ComComboObject('act_tp_cd', 1, 140, 1, 0 ,0 ,false)</script></td>
				<th>Full/Empty</th>
				<td><script type="text/javascript">ComComboObject('full_mty_cd', 1, 140, 1, 0 ,0 ,false)</script></td>
				<th>BND / SKD Seq.</th>
				<td><script type="text/javascript">ComComboObject('bnd_vskd_seq_cd', 1, 140, 1, 0 ,0 ,false)</script></td>
				<!-- <td><input type="text" style="width:140px;ime-mode:disabled;text-align:center" class="input" name="bnd_vskd_seq_cd" dataformat="engup" maxlength="1" id="bnd_vskd_seq_cd" /> </td> -->
				<th>Node Type</th>
				<td><script type="text/javascript">ComComboObject('nod_tp_cd', 1, 140, 1, 0 ,0 ,false)</script></td>
				<!-- <td><input type="text" style="width:146px;ime-mode:disabled;text-align:center" class="input" name="nod_tp_cd" dataformat="engup" maxlength="1" id="nod_tp_cd" /> </td> -->
			</tr>	
	
			<tr>
				<th>Operation Type</th>
				<td><script type="text/javascript">ComComboObject('act_op_tp_cd', 1, 140, 1, 0 ,0 ,false)</script></td>
				<th>Trans. Mode</th>
				<td><script type="text/javascript">ComComboObject('trsp_mod_cd', 1, 140, 1, 0 ,0 ,false)</script></td>
				<!-- <td><input type="text" style="width:140px;ime-mode:disabled;text-align:center" class="input" name="trsp_mod_cd" dataformat="engup" maxlength="2" id="trsp_mod_cd" /> </td> -->
				<th>ORG/DST</th>
				<td><script type="text/javascript">ComComboObject('org_dest_cd', 1, 140, 1, 0 ,0 ,false)</script></td>
				<th>Actual Flag</th>
				<td><script type="text/javascript">ComComboObject('act_flg', 1, 146, 1, 0 ,0 ,false)</script></td>
			</tr>	
		 
			<tr>
				<th>Actual Standard EDI Mapping</th>
				<td colspan="3"><input type="text" style="width:420px;ime-mode:disabled;text-align:center" class="input" name="act_stnd_edi_sts_cd" dataformat="engup" maxlength="5" id="act_stnd_edi_sts_cd" /> </td>
				<th>COP SKD Logic No</th>
				<td><input type="text" style="width:140px;ime-mode:disabled;text-align:right" class="input" name="cop_skd_lgc_no" dataformat="engup" maxlength="7" id="cop_skd_lgc_no" /> </td>
			</tr>	
		</table>
		</div>
		<table class="line_bluedot"><tr><td></td></tr></table>
		<div class="opus_design_inquiry wFit">					
		<table> 
			<colgroup>
                <col width="170"/>
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
				<td><script type="text/javascript">ComComboObject('delt_flg', 1, 100, 1, 0 ,0 ,false)</script></td>
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
</div>
<div class="wrap_result">
	<div class="opus_design_grid" style="display: none;">
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
</div>
</form>
