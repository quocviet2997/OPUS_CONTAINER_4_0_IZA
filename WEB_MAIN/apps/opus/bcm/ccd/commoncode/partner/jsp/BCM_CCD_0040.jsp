<%
/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0040.jsp
*@FileTitle  : Vendor 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/11
=========================================================
*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.partner.event.BcmCcd0040Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.apps.opus.bcm.sup.valuemanage.util.ConstantMgr"%>

<%
	BcmCcd0040Event  event = null;				//PDTO(Data Transfer Object including Parameters)
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
	String custCd		= JSPUtil.getParameter(request, "cust_cd");
	String rqstUsrChk	= JSPUtil.getParameter(request, "rqst_usr_chk");
	String rqstOfcCd	= JSPUtil.getParameter(request, "rqst_ofc_cd");
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		event = (BcmCcd0040Event)request.getAttribute("Event");
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
<input id="f_cmd" name="f_cmd" type="hidden" />
<input id="pagerows" name="pagerows" type="hidden" />
<input id="ibflag" name="ibflag" type="hidden" />
<input id="mdm_yn" name="mdm_yn" value="Y" type="hidden" />
<input id="saveflag" name="saveflag" value="N" type="hidden" />
<input id="mst_dat_subj_cd" name="mst_dat_subj_cd" value="VNDR" type="hidden" />
<input id="rqst_no" name="rqst_no" value="<%=rqstNo%>" type="hidden" />
<input id="proc_tp_cd" name="proc_tp_cd" value="<%=procTpCd%>" type="hidden" />
<input id="rqst_usr_chk" name="rqst_usr_chk" value="<%=rqstUsrChk%>" type="hidden" />
<input id="rqst_ofc_cd" name="rqst_ofc_cd" value="<%=rqstOfcCd%>" type="hidden" />
<input id="old_modi_vndr_cd" name="old_modi_vndr_cd" value="" type="hidden" />
<input id="edi_if_flg" name="edi_if_flg" type="hidden" />

<%if (!("true").equals(mainPage)){%>
<div class="layer_popup_contents">
<div class="layer_popup_title">
<%} %>	

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title">
	<%if (("true").equals(mainPage)){%>
		<button type="button">
		<span id="title"></span></button></h2>
	<%}else{%>
		<span id="title1">Vendor</span></h2>
	<%} %>	
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_CheckDup" id="btn_CheckDup" style="display:none">Check Duplicate</button><!--
		--><button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve" style="display:none">Retrieve</button><!--
		--><button type="button" class="btn_normal" name="btn_Save" id="btn_Save" style="display:none">Save</button><!--
		--><button type="button" class="btn_normal" name="btn_Create" id="btn_Create" style="display:none">Create</button><!--
		--><button type="button" class="btn_normal" name="btn_New" id="btn_New" style="display:none">New</button><!--
		--><button type="button" class="btn_normal" name="btn_Request" id="btn_Request" style="display:none">Request</button><!--
		--><button type="button" class="btn_normal" name="btn_Close" id="btn_Close" style="display:none">Close</button><!--
		-->
	</div>
	<!-- opus_design_btn(E) -->
	<!-- page_location(S) -->
	<%if (("true").equals(mainPage)){%>
	<div class="location"><span id="navigation"></span></div>
	<%}else{%>
	</div>
	<%}%>
</div>
<!-- page_title_area(E) -->

<!-- wrap_search (E) -->
<div class="wrap_search">
<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry">
		<table>
			<colgroup>
				<col width="130"/>
				<col width="320"/>
				<col width="70"/>
				<col width="310"/>
				<col width="70"/>
				<col width="*"/>
			</colgroup>
			<tbody>
				<tr>
					<th>Vendor Code</th>
					<td><input id="vndr_cnt_cd" style="width: 30px; ime-mode:disabled; text-align:center;" class="input" name="vndr_cnt_cd" value="" readonly="" maxlength="2" dataformat="engup" type="text"  /><input type="text" style="width: 100px; text-align:center;" class="input1" value="" name="vndr_seq" id="vndr_seq"  maxlength="6" dataformat="num"><button name="btn_vndr_cd_pop" id="btn_vndr_cd_pop" type="button" class="input_seach_btn"></button><input type="hidden" value="" name="new_vndr_seq" id="new_vndr_seq"></td>
					<th></th>
					<td></td>
					<th></th>
					<td></td>					
					<!-- izanagi branding work, 20170901 
			        <th>Legacy Code</th>
			        <td><input type="text" style="width:150px;text-align:center;" class="input" dataformat="engup" id="modi_vndr_cd" name="modi_vndr_cd" maxlength="30"></td>
			        <th>SAP ID</th>
			        <td><input type="text" style="width:150px;text-align:center;" class="input" dataformat="engup" id="sap_id" name="sap_id" maxlength="30" readOnly></td>
			        -->
				</tr>
			</tbody>
		</table>
	
		<table class="line_bluedot"><tr><td></td></tr></table>		
		
		<table>
			<colgroup>
				<col width="130"/>
				<col width="400"/>
				<col width="150"/>	
				<col width="*"/>
			</colgroup>
			<tbody>
				<tr>
					<th>Vendor Name</th>
					<td><input id="vndr_lgl_eng_nm" style="width: 380px; ime-mode:disabled;text-align:left;" class="input1" value="" name="vndr_lgl_eng_nm" maxlength="100" dataformat="engup" otherchar="()_\-,. &()'" type="text" /> </td>
					<th>Vendor Name(Local)</th>
					<td><input id="vndr_locl_lang_nm" style="width: 380px; text-align:left;" class="input" value="" name="vndr_locl_lang_nm" maxlength="100" type="text" /> </td>
				</tr>
			</tbody>
		</table>
		
		<table>
			<colgroup>
				<col width="130"/>
				<col width="100"/>
				<col width="180"/>
				<col width="100"/>
				<col width="550"/>
				<col width="*"/>
			</colgroup>
			<tbody>
				<tr>
					<th>Short Name</th>
					<td><input id="vndr_abbr_nm" style="width: 90px; text-align:left;" class="input" value="" name="vndr_abbr_nm" maxlength="50" type="text" /> </td>
					<td></td>
					<th class="sm">Vendor Type</th>	
					<td class="sm">	
						<label></label>
						<input id="lgs_flg" name="lgs_flg" value="N" class="trans" onclick="javascript:obj_change()" type="checkbox" />  Logistics<label></label>
						<input id="procu_flg" name="procu_flg" value="N" class="trans" onclick="javascript:obj_change()" type="checkbox" />  Procurement<label></label>
						<input id="finc_flg" name="finc_flg" value="N" class="trans" onclick="javascript:obj_change()" type="checkbox" />  Finance<label></label>
						<input id="team_flg" name="team_flg" value="N" class="trans" onclick="javascript:obj_change()" type="checkbox" />  Team<label></label>
						<input id="inter_co_flg" name="inter_co_flg" value="N" class="trans" onclick="javascript:obj_change()" type="checkbox" />  Subsidiary Company<label></label>
						<input id="otr_flg" name="otr_flg" value="N" class="trans" onclick="javascript:obj_change()" type="checkbox" />  Others  
					</td>
					<td></td>
				</tr>
			</tbody>
		</table>
		
		<table>
			<tbody>
				<colgroup>
					<col width="130"/>
					<col width="130"/>
					<col width="150"/>
					<col width="140"/>
					<col width="100"/>
					<col width="150"/>
					<col width="70"/>
					<col width="*"/>
				</colgroup>
				<tr>
					<th>Location</th>
					<td><input id="loc_cd" style="width: 70px; ime-mode:disabled; text-align:center;" class="input1" value="" name="loc_cd" maxlength="5" dataformat="engup" type="text" /><button class="input_seach_btn" name="btn_com_ens_051_loc_cd" id="btn_com_ens_051_loc_cd" type="button"></button></td>
					<th>Control Office</th>
					<td><input id="ofc_cd" style="width: 70px; ime-mode:disabled; text-align:center;" class="input1" value="" name="ofc_cd" maxlength="6" dataformat="engup" type="text" /><button class="input_seach_btn" name="btn_com_ens_071_ofc_cd" id="btn_com_ens_071_ofc_cd" type="button"></button></td>
					<th>Tax Payer ID</th>
					<td><input id="tax_id" style="width: 170px; ime-mode:disabled;text-align:left;" class="input" value="" name="tax_id" maxlength="20" dataformat="engup" type="text" /> </td>
					<th><!-- Register No. --></th>
					<td><!-- <input id="rgst_no" style="width: 100px; ime-mode:disabled; text-align:left;" class="input" value="" name="rgst_no" maxlength="20" dataformat="engup" type="text" />  --></td>
				</tr>
				<tr>
					<th>Payment Term</th>
					<td><script type="text/javascript">ComComboObject('gen_pay_term_cd', 1, 120, 1, 1 ,0 ,false)</script></td>
					<th>Payment Term Type</th>
					<td><script type="text/javascript">ComComboObject('pay_term_tp_cd', 1, 100, 1, 1 ,0 ,false)</script></td>
					<th>Payment Method</th>
					<td><script type="text/javascript">ComComboObject('pay_mzd_cd', 1, 140, 1, 1 ,0 ,false)</script></td>
					<th>Parent Vendor</th>
					<td><input id="prnt_vndr_seq" style="width: 141px; ime-mode:disabled; text-align:center;" class="input" value="" name="prnt_vndr_seq" maxlength="6" dataformat="num" type="text" /><!--
					--><button class="input_seach_btn" name="btn_com_ens_0c1_prnt_vndr_cd" id="btn_com_ens_0c1_prnt_vndr_cd" type="button"></button></td>
				</tr>	
			</tbody>
		</table>
		
		<table>
			<colgroup>
				<col width="130"/>
				<col width="130"/>
				<col width="150"/>
				<col width="150"/>
				<col width="95"/>
				<col width="*"/>
			</colgroup>
			<tbody>
				<tr>
					<th>Invoice Currency</th>
					<td><input id="inv_curr_cd" style="width: 70px; ime-mode:disabled; text-align:center;" class="input1" value="" name="inv_curr_cd" maxlength="3" dataformat="engup" type="text" /><!--
					--><button class="input_seach_btn" name="btn_com_ens_n13_inv_curr_cd" id="btn_com_ens_n13_inv_curr_cd" type="button"></button></td>
					<th>Contact Person</th>
					<td><input id="cntc_pson_nm" style="width: 100px; text-align:left;" class="input" value="" name="cntc_pson_nm" maxlength="50" type="text" /> </td>
					<th>Bank Exist Flag</th>
                    <td>
                        <select style="width:50px;" name="bank_acct_flg" class="input" id="bank_acct_flg" disabled>
                            <option value="N" selected>N</option>
                            <option value="Y">Y</option>
                        </select>
                    </td>
				</tr>	
			</tbody>
		</table>

		<table>
			<colgroup>
				<col width="130"/>
				<col width="130"/>
				<col width="140"/>
				<col width="150"/>
				<col width="95"/>
				<col width="*"/>
			</colgroup>
			<tbody>
				<tr>
					<th>India GST No.</th>
					<td><input id="vndr_gst_no" style="width:130px; text-align:left;" class="input" name="vndr_gst_no" maxlength="15" type="text" dataformat="engup" otherchar=" " />
					<th>SAC of Vendor</th>
					<td><input id="svc_acctg_cd" style="width:130px; text-align:left;" class="input" name="svc_acctg_cd" maxlength="10" type="text" dataformat="engup" /> </td>
					<th><%= ConstantMgr.getCompanyName() %> GST No.</th>
                    <td><input id="ida_gst_no" style="width:130px; text-align:left;" class="input" name="ida_gst_no" maxlength="15" type="text" dataformat="engup" otherchar=" " /> </td>
				</tr>	
			</tbody>
		</table>
		
		<table class="line_bluedot"><tr><td colspan="6"></td></tr></table>
		
		<table>
			<colgroup>
				<col width="130"/>
				<col width="350"/>
				<col width="70"/>
				<col width="250"/>
				<col width="70"/>
				<col width="*"/>
			</colgroup>
			<tbody>
				<tr>
					<th>CEO Name</th>
					<td><input id="ceo_nm" style="width: 290px; text-align:left;" class="input" value="" name="ceo_nm" maxlength="50" type="text" /></td>
					<th>Business Category</th>
					<td><input id="bzct_nm" style="width: 200px; text-align:left;" class="input" value="" name="bzct_nm" maxlength="50" type="text" /></td>
					<th>Business Type</th>
					<td><input id="bztp_nm" style="width: 135px; text-align:left;" class="input" value="" name="bztp_nm" maxlength="100" type="text" /></td>
				</tr>	
			</tbody>
		</table>
		
		<table class="line_bluedot"><tr><td colspan="6"></td></tr></table>
		
		<table>
			<colgroup>
				<col width="130"/>
				<col width="132"/>
				<col width="150"/>
				<col width="140"/>
				<col width="100"/>
				<col width="120"/>
				<col width="168"/>
				<col width="*"/>
			</colgroup>
			<tbody>
				<tr>
					<th>SCAC(USA Only)</th>
					<td><input id="usa_edi_cd" style="width: 100px; ime-mode:disabled; text-align:center;" class="input" value="" name="usa_edi_cd" maxlength="4" dataformat="engup" type="text" /> </td>
					<th>Service Area</th>
					<td><input id="svc_scp_cd_nm" style="width: 90px; ime-mode:disabled; text-align:left;" class="input" value="" name="svc_scp_cd_nm" maxlength="50" dataformat="engup" type="text" /> </td>
					<th>SVC Frequency</th>
					<td><input id="svc_prd_tp_nm" style="width: 100px; ime-mode:disabled; text-align:left;" class="input" value="" name="svc_prd_tp_nm" dataformat="excepthan" maxlength="20" type="text" /> </td>
					<th>SVC Frequency Remark</th>
					<td><input id="svc_prd_rmk" style="width: 120px; text-align:left;" class="input" value="" name="svc_prd_rmk" maxlength="100" type="text" /> </td>
				</tr>	
			</tbody>
		</table>
		
		<table>
			<colgroup>
				<col width="130"/>
				<col width="130"/>
				<col width="0"/>
				<col width="0"/>
				<col width="0"/>
				<col width="0"/>
				<col width="130"/>
				<col width="200"/>
				<col width="190"/>
				<col width="*"/>
			</colgroup>
			<tbody>
				<tr>
					<th>DG CGO Handling</th>
					<td><script type="text/javascript">ComComboObject('dcgo_hndl_flg', 1, 60, 1  , 0 ,0 ,false)</script></td>
					<th><!-- MTY R/R Order EDI Use --></th>
					<td><script type="text/javascript">ComComboObject('mty_rro_edi_use_flg', 1, 0, 1, 0 ,0 ,false)</script></td>
					<th><!-- W/O Attach File --></th>
					<td><script type="text/javascript">ComComboObject('wo_atch_file_flg', 1, 0, 1, 0, 0 ,false)</script></td>
					<th>W/O EDI Use</th>
					<td><script type="text/javascript">ComComboObject('wo_edi_use_flg', 1, 60, 1, 0, 0 ,false)</script></td>
					<th>Invoice EDI Use</th>
					<td><script type="text/javascript">ComComboObject('inv_edi_use_flg', 1, 58, 1, 0, 0 ,false)</script></td>
				</tr>	
			</tbody>
		</table>
		
		<table class="line_bluedot"><tr><td></td></tr></table>
		
		<table>
			<colgroup>
				<col width="130"/>
				<col width="200"/>
				<col width="150"/>
				<col width="200"/>
				<col width="190"/>
				<col width="*"/>
			</colgroup>
			<tbody>
				<tr>
					<th>TPB Customer Code</th>
					<td><input id="rfnd_psdo_cust_cd" style="width: 130px; ime-mode:disabled; text-align:center;" class="input" name="rfnd_psdo_cust_cd" value="" readonly maxlength="8" dataformat="engup" type="text" /><input id="tpb_flg" name="tpb_flg" value="Y" class="trans" onclick="obj_change()" type="checkbox" /></td>
					<th><!-- Vendor Office --></th>
					<td><input id="vndr_ofc_cd" style="width: 130px; ime-mode:disabled; text-align:center;" class="input" value="" name="vndr_ofc_cd" maxlength="6" dataformat="engup" type="hidden" /><!-- button class="input_seach_btn" name="btn_com_ens_071_vndr_ofc_cd" id="btn_com_ens_071_vndr_ofc_cd" type="button"></button--></td>
					<th><!-- Subsidiary Company --></th>
					<td><script type="text/javascript">ComComboObject('subs_co_cd', 1, 100, 1, 0 ,0 ,false)</script></td>
				</tr>	
			</tbody>
		</table>
		<table>
			<colgroup>
				<col width="130"/>
				<col width="670"/>
				<col width="70"/>
				<col width="*"/>
			</colgroup>
			<tbody>
				<tr>
					<th>Address(ENG)</th>
					<td><input id="eng_addr" style="width: 630px; ime-mode:disabled;text-align:left;" class="input1" value="" name="eng_addr" maxlength="200" dataformat="excepthan" type="text" /> </td>
					<th>Zip Code</th>
					<td><input id="zip_cd" style="width: 100px; ime-mode:disabled;text-align:left;" class="input" value="" name="zip_cd" maxlength="10" dataformat="excepthan" type="text" /> </td>
				</tr>	
			</tbody>
		</table>
		<table>
			<colgroup>
				<col width="130"/>
				<col width="*"/>
			</colgroup>
			<tbody>
				<tr>
					<th>Address(Local)</th>
					<td><input id="locl_lang_addr" style="width: 840px; text-align:left;" class="input" value="" name="locl_lang_addr" maxlength="200" type="text" /></td>
				</tr>	
			</tbody>
		</table>
		
		<table class="line_bluedot"><tr><td></td></tr></table>
		
		
		<span class="title_s" style="color: #005CB9; font-weight: bold; padding-left: 20px;">Check Delivery</span>
		<table>
			<colgroup>
				<col width="130"/>
				<col width="*"/>
			</colgroup>
			<tbody>
				<tr>
					<th>Address1(Local)</th>
					<td><input id="chk_de_addr1" style="width: 870px; text-align:left;" class="input" value="" name="chk_de_addr1" maxlength="200" type="text" /> </td>
				</tr>	
				<tr>
					<th>Address2(Local)</th>
					<td><input id="chk_de_addr2" style="width: 870px; text-align:left;" class="input" value="" name="chk_de_addr2" maxlength="200" type="text" /> </td>
				</tr>	
				<tr>
					<th>Address3(Local)</th>
					<td><input id="chk_de_addr3" style="width: 870px; text-align:left;" class="input" value="" name="chk_de_addr3" maxlength="200" type="text" /> </td>
				</tr>
			</tbody>
		</table>
		<table>
			<colgroup>
				<col width="130"/>
				<col width="85"/>
				<col width="90"/>
				<col width="95"/>
				<col width="90"/>
				<col width="180"/>
				<col width="90"/>
				<col width="130"/>
				<col width="115"/>
				<col width="*"/>
			</colgroup>
			<tbody>
				<tr>
					<th>Country Code</th>
					<td><input id="chk_de_cnt_cd" style="width: 70px; ime-mode:disabled; text-align:center;" class="input" value="" name="chk_de_cnt_cd" maxlength="2" dataformat="engup" type="text" /><!--
					--><button class="input_seach_btn" name="btn_chk_de_cnt_cd" id="btn_chk_de_cnt_cd" type="button"></button></td>
					<th>State Code</th>
					<td><input id="chk_de_ste_cd" style="width: 80px; ime-mode:disabled; text-align:center;" class="input" value="" name="chk_de_ste_cd" maxlength="3" dataformat="engup" type="text" /><!--
					--><button class="input_seach_btn" name="btn_chk_de_ste_cd" id="btn_chk_de_ste_cd" type="button"></button></td>
					<th>City Name</th>
					<td><input id="chk_de_cty_nm" style="width: 170px; ime-mode:disabled; text-align:left;" class="input" value="" name="chk_de_cty_nm" dataformat="excepthan" maxlength="50" type="text" /></td>
					<th>Zip Code</th>
					<td><input id="chk_de_zip_cd" style="width: 120px; ime-mode:disabled; text-align:left;" class="input" value="" name="chk_de_zip_cd" dataformat="excepthan" maxlength="10" type="text" /></td>
					<th>Address Use Flag</th>
					<td width=""><script type="text/javascript">ComComboObject('lu_delt_flg', 1, 55, 1, 0 ,0 ,false)</script></td>
				</tr>		
			</tbody>
		</table>
	</div>
<!-- opus_design_inquiry(E) -->
</div>
<!-- wrap_search (E) -->



<!-- wrap_result (S) -->
<div class="wrap_result">
	<!-- opus_design_grid(S) -->
        <div class="opus_design_grid clear">
        	<h3 class="title_design">Vendor Contact Point</h3>
           <div class="opus_design_btn">
				<button type="button" class="btn_accent" name="btn_rowadd_sheet1" id="btn_rowadd_sheet1">Row Add</button>
				<button type="button" class="btn_normal" name="btn_rowdelete_sheet1" id="btn_rowdelete_sheet1">Row Delete</button>
		</div>
		<script type="text/javascript">ComSheetObject('sheet1');</script>
       </div>
    <!-- opus_design_grid(E) -->
       
     <!-- opus_design_grid(S) -->
      <div class="opus_design_grid">
      	 <h3 class="title_design">Vendor Classification</h3>
         <div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_rowadd_sheet2" id="btn_rowadd_sheet2">Row Add</button>
			<button type="button" class="btn_normal" name="btn_rowdelete_sheet2" id="btn_rowdelete_sheet2">Row Delete</button>
		</div>
	<script type="text/javascript">ComSheetObject('sheet2');</script>
    </div>
    <!-- opus_design_grid(E) -->
       
	<div style="text-align: left">
		<table> 
			<colgroup>
                <col width="80"/>
                <col width="120">
            	<col width="100">
            	<col width="120">
            	<col width="120">
            	<col width="150">
            	<col width="120">
            	<col width="120">
            	<col width="140">
                <col width="*"/>
            </colgroup>
			<tbody>
				<tr>
					<th>Delete Flag</th>
					<td><script type="text/javascript">ComComboObject('delt_flg', 1, 70, 1, 0,0 ,false)</script></td>
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
		
		<table style="display: none"> 
			<colgroup>
					<col width="80"/>
					<col width="*" />
			</colgroup>
			<tbody>
				<tr>
					<th>INPUT Flag</th>
					<td><input id="input_flg" name="input_flg" style="width: 500px;" class="input1" value="" type="text" /> </td>
				</tr>	
			</tbody>
		</table>
	</div>
</div>

<%if (!("true").equals(mainPage)){%>
</div>
<%} %>
<!-- wrap_result (E) -->
</form>
