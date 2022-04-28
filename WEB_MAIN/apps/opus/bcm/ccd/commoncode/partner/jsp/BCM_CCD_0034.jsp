<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0034.jsp
*@FileTitle  : carrier
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
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.partner.event.BcmCcd0034Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	BcmCcd0034Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//Error from server
	String strErrMsg = "";						//Error message
	int rowCount	 = 0;						//Count of DB resultSet list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.commoncode.partner");
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


		event = (BcmCcd0034Event)request.getAttribute("Event");
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
<input type="hidden" name="mdm_yn" value="Y" id="mdm_yn" />
<input type="hidden" name="creflag" value="Y" id="creflag" />
<input type="hidden" name="mst_dat_subj_cd" value="CARR" id="mst_dat_subj_cd" />
<input type="hidden" name="rqst_no" value="<%=rqstNo%>" id="rqst_no" />
<input type="hidden" name="proc_tp_cd" value="<%=procTpCd%>" id="proc_tp_cd" />
<input type="hidden" name="rqst_usr_chk" value="<%=rqstUsrChk%>" id="rqst_usr_chk" />
<input type="hidden" name="rqst_ofc_cd" value="<%=rqstOfcCd%>" id="rqst_ofc_cd" />

<!-- page_title_area(S) -->
<div class="page_title_area clear ">
	<!-- page_title(S) -->
	<h2 class="page_title">
	<%if (("true").equals(mainPage)){%>
		<button type="button">
		<span id="title"></span></button></h2>
	<%}else{%>
		<span id="title1">Carrier</span></h2>
	<%} %>	
	<!-- page_title(E) -->
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn"><!--
	--><button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve" style="display:none">Retrieve</button><!--
	--><button type="button" class="btn_normal" name="btn_Save" id="btn_Save" style="display:none">Save</button><!--
	--><button type="button" class="btn_normal" name="btn_Request" id="btn_Request" style="display:none">Request</button><!--
	--><button type="button" class="btn_normal" name="btn_New" id="btn_New" style="display:none">New</button><!--
	--><button type="button" class="btn_normal" name="btn_Close" id="btn_Close" style="display:none">Close</button>
	</div>
	<!-- opus_design_btn (E) -->
	<!-- page_location(S) -->
	<%if (("true").equals(mainPage)){%>
	<div class="location">	
		<span id="navigation"></span>
	</div>
	<%}%>
	<!-- page_location(S) -->
</div>
<!-- page_title_area(E) -->
<div class="wrap_search">
	<div class="opus_design_inquiry">
		<table>
			<colgroup>
				<col width="130">
				<col width="450">
				<col width="150">
				<col width="*">
			</colgroup>
			<tbody>
				<tr>
					<th>Carrier Code</th>
					<td colspan="3">
					<table>
						<tr><td><input type="text" class="input1" style="width:70px;ime-mode:disabled;text-align:center;" name="crr_cd" id="crr_cd" dataformat="engup" maxlength="3"><!-- 
								--><button type="button" class="input_seach_btn" name="btn_com_ens_on1" id="btn_com_ens_on1"></button><!--  
								--><input type="text" style="width:650px;text-align:left;" class="input1" dataformat="engup" otherchar="()_\-,. " name="crr_nm" value=" " maxlength="50" id="crr_nm"/>
							</td>
						</tr>
					</table>
					</td>
				</tr>
				<tr>
					<th>Original Carrier Code</th>
					<td>
					<table>
	                    <tr>
		                    <td>
		                    <div style="position: relative; width:150px;">
		                    <input type="text" dataformat="engup" style="width:100%;ime-mode:disabled;" class="input2" id="nyk_lgcy_crr_cd_ctnt" name="nyk_lgcy_crr_cd_ctnt" maxlength="10" disabled/>
		                    <img src='img/nyk_line.jpg' style="width:50px; height:20px; position:absolute; top:2px; right:2px;" />
		                    </div></td>
		                    <td>
		                    <div style="position: relative; width:150px;">
		                    <input type="text" dataformat="engup" style="width:100%;ime-mode:disabled;" class="input2" id="mol_lgcy_crr_cd_ctnt" name="mol_lgcy_crr_cd_ctnt" maxlength="10" disabled/>
		                    <img src='img/mol_line.jpg' style="width:50px; height:20px; position:absolute; top:2px; right:2px;" />
		                    </div>
		                    </td>
		                    <td>
		                    <div style="position: relative; width:150px;">
		                    <input type="text" dataformat="engup" style="width:100%;ime-mode:disabled;" class="input2" id="kline_lgcy_crr_cd_ctnt" name="kline_lgcy_crr_cd_ctnt" maxlength="10" disabled/>
		                    <img src='img/k_line.jpg' style="width:50px; height:20px; position:absolute; top:2px; right:2px;" />
		                    </div>
		                    </td>
		                    <td style="width:20px; visibility:hidden"><input type="hidden" style="width:150px;text-align:center;" class="input1" dataformat="engup" id="modi_vsl_slan_cd2" name="modi_vsl_slan_cd2" maxlength="30"></td>
	                    </tr>
                    </table>
					
					
					</td>
					<!--td>Booking EDI</td-->					
					<td colspan="2"><input type="hidden" style="width:100%;ime-mode:disabled;text-align:left;" dataformat="engupspace" class="input" value=" " name="bkg_edi_cd" maxlength="2" id="bkg_edi_cd" /></td>
				</tr>
				<tr><td colspan="4"><table class="line_bluedot"><tr><td></td></tr></table></td></tr>	
				
			</tbody>
		</table>
		
		<table>
        	<colgroup>
                <col width="130"/>
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
                    <td>
                        <select style="width:70px;" name="delt_flg" class="input" id="delt_flg">
                            <option value="N" selected>N</option>
                            <option value="Y">Y</option>
                        </select>
                    </td>
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
</div>

<div class="wrap_result">
	<div class="opus_design_grid">
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
</div>
</form>