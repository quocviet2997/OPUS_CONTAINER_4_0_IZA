<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0029.jsp
*@FileTitle  : Vessel service scope
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
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.service.event.BcmCcd0029Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	BcmCcd0029Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//Error from server
	String strErrMsg = "";						//Error message
	int rowCount	 = 0;						//Count of DB resultSet list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

//	String[] portApplDivCd		= null;
//	String[] viaPortOptCd		= null;

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


		event = (BcmCcd0029Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

//		portApplDivCd = PRIUtil.getValueObject2StringArray((List<CodeInfo>)eventResponse.getCustomData("portApplDivCd"),false,"|","\t","getCode","getName");
//		viaPortOptCd = PRIUtil.getValueObject2StringArray((List<CodeInfo>)eventResponse.getCustomData("viaPortOptCd"),false,"|","\t","getCode","getName");

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
<input id="f_cmd" name="f_cmd" type="hidden" />
<input id="pagerows" name="pagerows" type="hidden" />
<input id="mdm_yn" name="mdm_yn" value="y" type="hidden" />
<input id="ibflag" name="ibflag" value="I" type="hidden" />
<input id="user_id" name="user_id" value="<%= strUsr_id %>" type="hidden" />
<input id="creflag" name="creflag" value="Y" type="hidden" />
<input id="mst_dat_subj_cd" name="mst_dat_subj_cd" value="SVSP" type="hidden" />
<input id="rqst_no" name="rqst_no" value="<%=rqstNo%>" type="hidden" />
<input id="proc_tp_cd" name="proc_tp_cd" value="<%=procTpCd%>" type="hidden" />
<input id="rqst_usr_chk" name="rqst_usr_chk" value="<%=rqstUsrChk%>" type="hidden" />
<input id="rqst_ofc_cd" name="rqst_ofc_cd" value="<%=rqstOfcCd%>" type="hidden" />

 <!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<h2 class="page_title">
	<%if (("true").equals(mainPage)){%>
		<button type="button">
		<span id="title"></span>
	<%}else{%>
		<span id="title1">Service Scope</span>
	<%} %>
	<%if (("true").equals(mainPage)){%></button></h2>
	<%}else{%></h2>
	<%} %>
	<!-- page_title(E) -->

	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button type="button" id="btn_Retrieve" name="btn_Retrieve" class="btn_accent" style="display:none">Retrieve</button><!--
		--><button type="button" id="btn_Save" name="btn_Save" class="btn_normal" style="display:none">Save</button><!--
		--><button type="button" id="btn_Request" name="btn_Request" class="btn_normal" style="display:none">Request</button><!--
		--><button type="button" id="btn_New" name="btn_New" class="btn_normal" style="display:none">New</button>
		<button type="button" id="btn_Close" name="btn_Close" class="btn_normal"  style="display:none">Close</button>
	</div>
	<!-- opus_design_btn (E) -->

	<!-- page_location(S) -->
	<%if (("true").equals(mainPage)){%>
	<div class="location">
		<span id="navigation"></span>
	</div>
	<%}%>
	<!-- page_location(E) -->

</div>
<!-- page_title_area(E) -->
<div class="wrap_search">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry">
		<table>
			<colgroup>
				<col width="125" />
				<col width="150" />
				<col width="130" />
				<col width="170" />
				<col width="150" />
				<col width="130" />
				<col width="150" />
				<col width="*" />
			</colgroup>
			<tbody>
				<tr>
					<th>Service Scope Code</th>
					<td><input id="svc_scp_cd" style="width:95px;ime-mode:disabled;text-align:center" class="input1" name="svc_scp_cd" dataformat="engup" maxlength="3" type="text" /><button class="input_seach_btn" name="btn_scp_search" id="btn_scp_search" type="button"></button></td>
                    <!--<th>Sakura CTR Code</th>  -->
                    <th>Trade for ERP</th>
					<td><input id="modi_cost_ctr_cd" style="width:100px;ime-mode:disabled;text-align:left" class="input1" name="modi_cost_ctr_cd" dataformat="eng" maxlength="50" type="text" otherchar=" "/></td>
					<!-- <th>Modified</th>
					<td><input type="text" style="width:150px;text-align:center;" class="input" dataformat="engup" id="modi_svc_scp_lane" name="modi_svc_scp_lane" maxlength="30"></td>
					 -->
					<th>Service Scope Group</th>
					<td><input id="modi_svc_grp_cd" style="width:100px;ime-mode:disabled;text-align:center" class="input" name="modi_svc_grp_cd" dataformat="engup" maxlength="2" type="text"/></td>
					<th>Domi/Non Domi Flag</th>
					<td>
                    	<select style="width:50px;" class="input" name="dmnt_flg">
                            <option value="N" selected>N</option>
                            <option value="Y">Y</option>
                        </select>
                    </td>
				</tr>
				<tr>
					<th>Name</th>
					<td colspan="5"><input id="svc_scp_nm" style="width:580px;ime-mode:disabled;text-align:left" class="input1" name="svc_scp_nm" dataformat="engup" otherchar="()_\-,. " maxlength="50" type="text"/></td>
					<!-- <th>Modified</th>
					<td><input type="text" style="width:150px;text-align:center;" class="input" dataformat="engup" id="modi_svc_scp_lane" name="modi_svc_scp_lane" maxlength="30"></td>
					 -->
				</tr>
			</tbody>
		</table>
		<table>
			<colgroup>
				<col width="125" />
				<col width="150" />
				<col width="130" />
				<col width="100" />
				<col width="150" />
				<col width="100" />
				<col width="150" />
				<col width="110" />
				<col width="80" />
				<col width="*" />
			</colgroup>
			<tbody>
				<tr>
					<th>Bound</th>
					<td><script type="text/javascript">ComComboObject('svc_scp_bnd_cd', 1, 124, 1, 1 ,0 ,false)</script></td>
					<th>Conference Status</th>
					<td><script type="text/javascript">ComComboObject('conf_flg', 1, 70, 1, 1 ,0 ,false)</script></td>
					<th>FMC File Status</th>
					<td><script type="text/javascript">ComComboObject('fmc_file_flg', 1, 70, 1, 1 ,0 ,false)</script></td>
					<th>Tariff Prefix</th>
					<td><input id="trf_pfx_cd" style="width:80px;ime-mode:disabled;text-align:center" class="input" name="trf_pfx_cd" dataformat="engup" maxlength="4" type="text" /></td>
					<th>Tariff No</th>
					<td><input id="trf_no" style="width:80px;ime-mode:disabled;text-align:right" class="input" name="trf_no" dataformat="num" maxlength="4" type="text" /></td>
				</tr>
			</tbody>
		</table>
	</div>
	<!-- opus_design_inquiry(E) -->
</div>

<!-- opus_design_grid(S) -->
<div class="wrap_result">
	<div class="opus_design_grid clear">
		<h3 class="title_design">Service Scope Lane</h3>
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_row_addup" 			id="btn_row_addup">Row Add</button>
			<button type="button" class="btn_normal" name="btn_row_deleteup" 		id="btn_row_deleteup">Row Delete</button>
		</div>
		<!-- opus_design_btn(E) -->
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
	<h3 class="title_design">Service Scope Limit</h3>
	<div class="opus_design_grid clear">
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_row_adddn" 			id="btn_row_adddn">Row Add</button>
			<button type="button" class="btn_normal" name="btn_row_deletedn" 		id="btn_row_deletedn">Row Delete</button>
		</div>
		<!-- opus_design_btn(E) -->
		<script type="text/javascript">ComSheetObject('sheet2');</script>
	</div>
	<h3 class="title_design">Service Scope Limit by POL or POD</h3>
	<div class="opus_design_grid clear">
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_row_adddn2" 			id="btn_row_adddn">Row Add</button>
			<button type="button" class="btn_normal" name="btn_row_deletedn2" 		id="btn_row_deletedn">Row Delete</button>
		</div>
		<!-- opus_design_btn(E) -->
		<script type="text/javascript">ComSheetObject('sheet3');</script>
	</div>
	<!-- opus_design_inquiry(S) -->
		<div class="opus_design_inquiry">
			<table>
				<tbody>
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
					<tr>
						<th>Delete Flag</th>
						<td width=""><script type="text/javascript">ComComboObject('delt_flg', 1, 60, 1, 0 ,0 ,false)</script></td>
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
			            <th></th>
			            <td><input type="hidden" style="width:120px;text-align:center;" class="input" name="pri_fmc_file_flg" id="pri_fmc_file_flg" readOnly/>
			            </td>
					</tr>
				</tbody>
			</table>
		</div>
		<!-- opus_design_inquiry(E) -->
</div>
<!-- opus_design_grid(E) -->
</form>