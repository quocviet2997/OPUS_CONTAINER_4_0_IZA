<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0028.jsp
*@FileTitle  : Vessel service lane
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
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.service.event.BcmCcd0028Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
		BcmCcd0028Event  event = null;				//PDTO(Data Transfer Object including Parameters)
		Exception serverException   = null;			//Error from server
		String strErrMsg = "";						//Error message
		int rowCount	 = 0;						//Count of DB resultSet list

		String successFlag = "";
		String codeList  = "";
		String pageRows  = "100";

		String strUsr_id		= "";
		String strUsr_nm		= "";
		Logger log = Logger.getLogger("com.clt.apps.commoncode.sevice");
		String mainPage 		= "";
	    mainPage = request.getParameter("main_page");
		// 승인처리용 정보
		String rqstNo		= JSPUtil.getParameter(request, "rqst_no");
		String procTpCd		= JSPUtil.getParameter(request, "proc_tp_cd");
		String rqstUsrChk	= JSPUtil.getParameter(request, "rqst_usr_chk");
		String rqstOfcCd	= JSPUtil.getParameter(request, "rqst_ofc_cd");

		try {
		   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
				strUsr_id =	account.getUsr_id();
				strUsr_nm = account.getUsr_nm();


				event = (BcmCcd0028Event)request.getAttribute("Event");
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
<input type="hidden" name="mdm_yn" value="y" id="mdm_yn" />

<input type="hidden" name="add_flg" value="I" id="add_flg" />
<input type="hidden" name="user_id" value="<%= strUsr_id %>" id="user_id" />

<input type="hidden" name="creflag" value="Y" id="creflag" />

<input type="hidden" name="mst_dat_subj_cd" value="SCVL" id="mst_dat_subj_cd" />
<input type="hidden" name="rqst_no" value="<%=rqstNo%>" id="rqst_no" />
<input type="hidden" name="proc_tp_cd" value="<%=procTpCd%>" id="proc_tp_cd" />
<input type="hidden" name="rqst_usr_chk" value="<%=rqstUsrChk%>" id="rqst_usr_chk" />
<input type="hidden" name="rqst_ofc_cd" value="<%=rqstOfcCd%>" id="rqst_ofc_cd" />
<input type="hidden" name="old_modi_vsl_slan_cd" id="old_modi_vsl_slan_cd" value="" />
<input type="hidden" name="edi_if_flg" id="edi_if_flg"  />

 <!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<%if (("true").equals(mainPage)){%>
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<%}else{%>
	<h2 class="page_title"><span id="title1">Vessel Service Lane</span></h2>
	<%} %>
	<!-- page_title(E) -->

	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
		<button type="button" class="btn_accent" name="btn_Retrieve" 		id="btn_Retrieve" style='display:none;'>Retrieve</button><!--
		 --><button type="button" class="btn_normal" name="btn_Save" 			id="btn_Save" style='display:none;'>Save</button><!--
		 --><button type="button" class="btn_normal" name="btn_Request" 			id="btn_Request" style='display:none;color:red;'>Request</button><!--
		 --><button type="button" class="btn_normal" name="btn_New" 	id="btn_New" style='display:none;'>New</button><!--
		 --><button type="button" class="btn_normal" name="btn_Close" 			id="btn_Close" style="display:none">Close</button>

	</div>
	<!-- opus_design_btn(E) -->

	<!-- page_location(S) -->
	<div class="location">
	<%if (("true").equals(mainPage)){%>
		<span id="navigation"></span>
	<%}else{%>
	<%} %>

	</div>
	<!-- page_location(E) -->

</div>
<!-- page_title_area(E) -->
<div class="wrap_search">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry">
		<table>
			<colgroup>
				<col width="160" />
				<col width="180" />
				<col width="130" />
				<col width="160" />
				<col width="150" />
				<col width="160" />
				<col width="130" />
				<col width="*" />
			</colgroup>
			<tbody>
				<tr>
					<th>Vessel Service Lane Code</th>
					<td colspan="5"><input type="text" style="width:100px;ime-mode:disabled;text-align:center" name="vsl_slan_cd" class="input1" dataformat="engup" maxlength="3" id="vsl_slan_cd" /><!-- 
					 --><button type="button" class="input_seach_btn" name="btns_search1" id="btns_search1"></button><!-- 
					 --><input type="text" style="width:490px;ime-mode:disabled;text-align:left" class="input1" name="vsl_slan_nm" dataformat="engup" otherchar="()_\-,. " maxlength="50" id="vsl_slan_nm"/></td>
					<th style="visibility:hidden">VIP Code</th>
                    <td style="visibility:hidden"><input type="text" style="width:150px;text-align:center;" class="input1" dataformat="engup" id="modi_vsl_slan_cd" name="modi_vsl_slan_cd" maxlength="30"></td>
                    <!--<th>Sakura CTR Code</th>  -->
                    <!-- th>SAP CTR Code</th>
                    <td><input type="text" style="width:150px;text-align:center;" class="input1" dataformat="engup" id="modi_cost_ctr_cd" name="modi_cost_ctr_cd" maxlength="30"></td-->
                    <!-- th style="visibility:hidden">VIP Team Code</th>
                    <td style="visibility:hidden"><input type="text" style="width:150px;text-align:center;" class="input" dataformat="engup" id="modi_vip_team_cd" name="modi_vip_team_cd" maxlength="20"></td-->
                    
				</tr>
				<tr>
					<th>SAP CTR Code</th>
                    <td><input type="text" style="width:100px;text-align:center;" class="input1" dataformat="engup" id="modi_cost_ctr_cd" name="modi_cost_ctr_cd" maxlength="3"><!-- 
                     --><button type="button" class="input_seach_btn" name="btns_search2" id="btns_search2"></button></td>
					<th>Legacy Code</th>
                    <td colspan="3">
	                    <table>
		                    <tr>
		                    	<td><input type="text" style="width:150px;text-align:center;" class="input1" dataformat="engup" id="modi_vsl_slan_cd2" name="modi_vsl_slan_cd2" maxlength="30"></td>
			                    <td>
			                    <div style="position: relative; width:150px;">
			                    <input type="text" dataformat="engup" style="width:100%;" class="input2" id="nyk_lgcy_slan_cd_ctnt" name="nyk_lgcy_slan_cd_ctnt" maxlength="10" disabled/>
			                    <img src='img/nyk_line.jpg' style="width:50px; height:20px; position:absolute; top:2px; right:2px;" />
			                    </div></td>
			                    <td>
			                    <div style="position: relative; width:150px;">
			                    <input type="text" dataformat="engup" style="width:100%;" class="input2" id="mol_lgcy_slan_cd_ctnt" name="mol_lgcy_slan_cd_ctnt" maxlength="10" disabled/>
			                    <img src='img/mol_line.jpg' style="width:50px; height:20px; position:absolute; top:2px; right:2px;" />
			                    </div>
			                    </td>
			                    <td>
			                    <div style="position: relative; width:150px;">
			                    <input type="text" dataformat="engup" style="width:100%;" class="input2" id="kline_lgcy_slan_cd_ctnt" name="kline_lgcy_slan_cd_ctnt" maxlength="10" disabled/>
			                    <img src='img/k_line.jpg' style="width:50px; height:20px; position:absolute; top:2px; right:2px;" />
			                    </div>
			                    </td>
			                    
		                    </tr>
	                    </table>
                    
                    </td>
                    <th style="visibility:hidden">VIP Team Code</th>
                    <td style="visibility:hidden"><input type="text" style="width:150px;text-align:center;" class="input" dataformat="engup" id="modi_vip_team_cd" name="modi_vip_team_cd" maxlength="20"></td>
                    <!-- td style="visibility:hidden"><input type="text" style="width:150px;text-align:center;" class="input1" dataformat="engup" id="modi_vsl_slan_cd2" name="modi_vsl_slan_cd2" maxlength="30"></td-->
				</tr>
				<tr>
					<th>Lane Service Type</th>
					<td><script type="text/javascript">ComComboObject('vsl_svc_tp_cd', 1, 137, 1, 1 ,0 ,false)</script></td>
					<th>Vessel Type</th>
					<td><script type="text/javascript">ComComboObject('vsl_tp_cd', 1, 160, 1, 1 ,0 ,false)</script></td>
					<th>Feeder/Trunk</th>
					<td><script type="text/javascript">ComComboObject('fdr_div_cd', 1, 160, 1, 1 ,0 ,false)</script></td>
					<td colspan="2"></td>
				</tr>
				<tr>
					<th>Effect Date</th>
					<td><input type="text" style="width:80px;ime-mode:disabled;text-align:center" class="input" name="st_eff_dt" dataformat="ymd" maxlength="10" id="st_eff_dt" /><button type="button" class="calendar ir" name="btn_Calendar1" id="btn_Calendar1"></button></td>
					<th>Expire Date</th>
					<td><input type="text" style="width:80px;ime-mode:disabled;text-align:center" class="input" name="end_eff_dt" dataformat="ymd" maxlength="10" id="end_eff_dt" /><button type="button" class="calendar ir" name="btn_Calendar2" id="btn_Calendar2"></button></td>
					<th>Company Code</th>
					<td width="">
						<input type="text" style="width:160px;ime-mode:disabled;text-align:left" class="input" readonly name="co_nm" id="co_nm" disabled/>
						<input type="hidden" style="width:150px;ime-mode:disabled;text-align:left" class="input1" name="co_cd" id="co_cd" />
						<!-- script type="text/javascript">ComComboObject('co_cd', 1, 160, 1, 1 ,0 ,false)</script -->
					</td>
					<td colspan="2"></td>
				</tr>
			</tbody>
		</table>
	</div>
	<!-- opus_design_inquiry(E) -->
</div>

<div class="wrap_result">
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid">
		<h3 class="title_design">Service Lane Direction</h3>
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_row_add" 			id="btn_row_add">Row Add</button><!--
			 --><button type="button" class="btn_normal" name="btn_row_delete" 			id="btn_row_delete">Row Delete</button>
		</div>
		<!-- opus_design_btn(E) -->
		<script type="text/javascript">ComSheetObject('sheet');</script>
	</div>
	<!-- opus_design_inquiry(S) -->
		<div class="opus_design_inquiry">
			<table>
				<colgroup>
                <col width="70"/>
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
				<tbody>
					<tr>
						<th>Delete Flag</th>
						<td><script type="text/javascript">ComComboObject('delt_flg', 1, 60, 1, 0 ,0 ,false)</script></td>
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
				</tbody>
			</table>
		</div>
		<!-- opus_design_inquiry(E) -->
	<!-- opus_design_grid(E) -->
</div>
</form>