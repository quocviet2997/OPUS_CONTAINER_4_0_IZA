<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0032.jsp
*@FileTitle  : Organization 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.organization.event.BcmCcd0032Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	BcmCcd0032Event  event = null;				//PDTO(Data Transfer Object including Parameters)
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
		event = (BcmCcd0032Event)request.getAttribute("Event");
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

<form name="form" id="form">
<input id="f_cmd" name="f_cmd" type="hidden" />
<input id="pagerows" name="pagerows" type="hidden" />
<input id="hidden_ofc_cd" name="hidden_ofc_cd" value="" type="hidden" />
<input id="mdm_yn" name="mdm_yn" value="Y" type="hidden" />
<input id="old_modi_ofc_cd" name="old_modi_ofc_cd" value="" type="hidden" />
<input id="edi_if_flg" name="edi_if_flg" value="" type="hidden" />
<input id="ibflag" name="ibflag" type="hidden" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title">
		<button type="button"><span id="title"></span></button>
	</h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
		<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!-- 
		--><button type="button" class="btn_normal" name="btn_save" id="btn_save">Save</button><!-- 
		--><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button>
	</div>
	<!-- opus_design_btn(E) -->
	<!-- page_location(S) -->
	<div class="location"><span id="navigation"></span></div>
</div>
<!-- page_title_area(E) -->

<!-- opus_design_inquiry(S) -->
<div class= "wrap_search">
	<div class="opus_design_inquiry wFit">
		<table>
			<colgroup>
				<col width="155"/>
				<col width="130"/>
				<col width="155"/>
				<col width="140"/>
				<col width="155"/>
				<col width="160"/>
				<col width="165"/>
				<col width="*" />
			</colgroup>
			<tbody>
				<tr>
					<th>Office Code</th>
					<td><input id="ofc_cd" style="width: 80px; ime-mode:disabled; text-align:center;" class="input1" value="" name="ofc_cd" maxlength="6" dataformat="engup" type="text" /><button class="input_seach_btn" name="btn_com_ens_071_ofc_cd" id="btn_com_ens_071_ofc_cd" type="button"></button></td>
					<th></th>
					<td style="width:156px"></td>
					<!-- izanagi branding work, 20170901 
					<th>Legacy Code</th>
                    <td><input type="text" style="width:150px" class="input1" dataformat="engup" name="modi_ofc_cd" id="modi_ofc_cd" maxlength="30"></td>
                    -->
					<th>SAP CTR Code</th> <!-- before : Sakura Agent Code -->
                    <td><input type="text" style="width:150px" class="input1" dataformat="engup" name="modi_cost_ctr_cd" id="modi_cost_ctr_cd" maxlength="30"></td>
					<th>SAP Office ID</th>  <!-- before : Sakura Agent Code -->
                    <td><input type="text" style="width:100px" class="input1" dataformat="engup" name="modi_agn_cd" id="modi_agn_cd" maxlength="30"></td>
				</tr>
			</tbody>
		</table>
		<table border=1>
			<colgroup>
				<col width="155"/>
				<col width="130"/>
				<col width="145"/>
				<col width="140"/>
				<col width="165"/>
				<col width="160"/>
				<col width="155"/>
				<col width="*" />
		
			</colgroup>
			<tbody>
				<tr>
					<th>English Name</th>
					<td colspan="3"><input id="ofc_eng_nm" style="width: 380px; ime-mode:disabled; text-align:left;" class="input1" value="" name="ofc_eng_nm" maxlength="100" dataformat="engup" otherchar="()_\-,. " type="text"/> </td>
					<th>Local Name</th>
					<td colspan="3"><input id="ofc_locl_nm" style="width: 430px; text-align:left;" class="input" value="" name="ofc_locl_nm" maxlength="100" type="text" /> </td>
					
				</tr>
			</tbody>
		</table>
		<table>
			<colgroup>
				<col width="155"/>
				<col width="130"/>
				<col width="145"/>
				<col width="140"/>
				<col width="165"/>
				<col width="160"/>
				<col width="155"/>
				<col width="*" />
			</colgroup>
			<tbody>
				 <tr>
					<th>International Tel.No</th>
					<td><input id="intl_phn_no" style="width: 80px; ime-mode:disabled; text-align:left;" class="input1" value="" name="intl_phn_no" maxlength="4" dataformat="num" otherchar="-" type="text" /> </td>
					<th>Tel. No</th>
					<td><input id="ofc_phn_no" style="width: 140px; ime-mode:disabled; text-align:left;" class="input1" value="" name="ofc_phn_no" maxlength="20" dataformat="num" otherchar="-" type="text" /> </td>
					<th>International Fax. No</th>
					<td><input id="intl_fax_no" style="width: 80px; ime-mode:disabled; text-align:left;" class="input" value="" name="intl_fax_no" maxlength="4" dataformat="num" otherchar="-" type="text" /> </td>
					<th>Fax. No</th>
					<td><input id="ofc_fax_no" style="width: 100px; ime-mode:disabled; text-align:left;" class="input" value="" name="ofc_fax_no" maxlength="20" dataformat="num" otherchar="-" type="text" /> </td>
				</tr>
				<tr>
				    <th>URL</th>
					<td colspan="3"><input id="ofc_url" style="width: 382px; ime-mode:disabled; text-align:left;" class="input" value="http://" name="ofc_url" maxlength="50" dataformat="excepthan" type="text" /></td>
					<th>Office Rep. Email</th>
					<td colspan="3"><input id="ofc_rep_eml" style="width: 427px; ime-mode:disabled; text-align:left;" class="input" value="" name="ofc_rep_eml" maxlength="50"  type="text" /></td>
				</tr>	
				<tr class="line_bluedot"><td colspan="8"></td></tr>
				<tr>
				    <th>ZIP Code</th>
					<td colspan="7"><input id="ofc_zip_cd" style="width: 100px; text-align:left;" class="input" value="" name="ofc_zip_cd" maxlength="10" type="text" /> </td>
				</tr>
				<tr>
					<th>Address</th>
					<td colspan="3"><input id="ofc_addr" style="width: 380px; text-align:left;" class="input1" value="" name="ofc_addr" maxlength="200" type="text" /> </td>
					<th>Local Address</th>
					<td colspan="3"><input id="ofc_locl_lang_addr" style="width:427px; text-align:left;" class="input" value="" name="ofc_locl_lang_addr" maxlength="200" type="text" /></td>
				</tr>
				<tr class="line_bluedot"><td colspan="8"></td></tr>	
				<tr>
					<th>Office Type</th>
					<td><script type="text/javascript">ComComboObject('ofc_tp_cd', 1, 110, 1, 1 ,0 ,false)</script></td>
					<th>Office Kind</th>
					<td><script type="text/javascript">ComComboObject('ofc_knd_cd', 1, 110, 1, 1 ,0 ,false)</script></td>
					<th>Agent Type</th>
					<td><script type="text/javascript">ComComboObject('agn_knd_cd', 1, 125, 1,0 ,0 ,false)</script></td>
					<th>Communication Code (G/W)</th>
					<td><input id="ofc_cmmc_cd" style="width: 100px; text-align:center;" class="input" value="" name="ofc_cmmc_cd" maxlength="6" dataformat="excepthan" type="text" /> </td>
				</tr>
				<tr>
					<th>Parent Office</th>
					<td><input id="prnt_ofc_cd" style="width: 80px; ime-mode:disabled; text-align:center;" class="input" value="" name="prnt_ofc_cd" maxlength="6" dataformat="engup" type="text" /><button class="input_seach_btn" name="btn_com_ens_071_prnt_ofc_cd" id="btn_com_ens_071_prnt_ofc_cd" type="button"></button> </td>
					<th>Location Code</th>
					<td><input id="loc_cd" style="width: 80px; ime-mode:disabled; text-align:center;" class="input1" value="" name="loc_cd" maxlength="5" dataformat="engup" type="text" /><button class="input_seach_btn" name="btn_com_ens_051_loc_cd" id="btn_com_ens_051_loc_cd" type="button"></button></td>
					<th>Inactive Sales Org.</th>
					<td><script type="text/javascript">ComComboObject('ofc_sls_delt_flg', 1, 125, 1, 0 ,0 ,false)</script></td>
					<th><!-- Fax IP Address --></th>
					<td><input id="fax_ip" style="width: 100px; text-align:left;" class="input" value="NA" name="fax_ip" maxlength="20" type="hidden" readonly /></td>
				</tr>
				<tr>
					<th>Open Date</th>
					<td><input id="opn_dt" style="width: 80px;" class="input" value="" name="opn_dt" dataformat="ymd" maxlength="10" type="text" /><button class="calendar ir" name="btn_opn_dt_cal" id="btn_opn_dt_cal" type="button"></button></td>
					<th>Close Date</th>
					<td colspan="5"><input id="clz_dt" style="width: 80px;" class="input" value="" name="clz_dt" dataformat="ymd" maxlength="10" type="text" /><button class="calendar ir" name="btn_clz_dt_cal" id="btn_clz_dt_cal" type="button"></button></td>
					
				</tr>
				<tr>
					<th>Subsidiary Company Flag</th>
					<td><script type="text/javascript">ComComboObject('subs_co_flg', 1, 125, 1, 0 ,0 ,false)</script></td>
					<th>Sales Office DIV</th>
					<td><script type="text/javascript">ComComboObject('sls_ofc_div_cd', 1, 110, 1, 0 ,0 ,false)</script></td>
					<th>Manual Booking Option</th>
					<td colspan="3"><script type="text/javascript">ComComboObject('mnl_bkg_no_opt_cd', 1, 125, 1, 0 ,0 ,false)</script></td>
				</tr>
				<tr>
					<th>Remark</th>
					<td colspan="7"><input id="ofc_rmk" style="width: 1015px; text-align:left;" class="input" value="" name="ofc_rmk" maxlength="100" type="text" /></td>
				</tr>
				<tr class="line_bluedot"><td colspan="8"></td></tr>
				<tr>
					<th>A/R Office</th>
					<td><input id="ar_ofc_cd" style="width: 80px; ime-mode:disabled;text-align:center;" class="input" value="" name="ar_ofc_cd" maxlength="6" dataformat="engup" type="text" /><button class="input_seach_btn" name="btn_com_ens_071_ar_ofc_cd" id="btn_com_ens_071_ar_ofc_cd" type="button"></button></td>
				 	<th>A/R Regional HQ</th>
					<td><script type="text/javascript">ComComboObject('ar_hd_qtr_ofc_cd', 1, 110, 1, 1 ,0 ,false)</script></td>
					<th>A/R Center Code</th>
					<td><input id="ar_ctr_cd" style="width: 105px; ime-mode:disabled;text-align:center;" class="input" value="" name="ar_ctr_cd" maxlength="6" dataformat="num" type="text" /><button class="input_seach_btn" name="btn_ar_ctr_cd" id="btn_ar_ctr_cd" type="button"></button></td>
				 	<th>Alternate Currency</th>
					<td><script type="text/javascript">ComComboObject('altn_curr_div_cd', 1, 100, 1, 0 ,0 ,false)</script></td>
				</tr>	
				<tr>
					<th>Finance Region</th>
					<td><script type="text/javascript">ComComboObject('finc_rgn_cd', 1, 130, 1, 0 ,0 ,false)</script>
					<!-- <input id="finc_rgn_cd" style="width: 109px; text-align:center;" class="input" value="" name="finc_rgn_cd" maxlength="2" type="text" /> --> 
					</td>
					<th>O/B Credit Term (Days)</th>
					<td><input id="ob_cr_term_dys" style="width: 110px; text-align:right;" class="input" value="" name="ob_cr_term_dys" maxlength="3" dataformat="num" type="text" /> </td>
					<th>I/B Credit Term (Days)</th>
					<td><input id="ib_cr_term_dys" style="width: 105px; text-align:right;" class="input" value="" name="ib_cr_term_dys" maxlength="3" dataformat="num" type="text" /> </td>
					<th>A/R Currency</th>
					<td><input id="ar_curr_cd" style="width: 70px; text-align:center;" class="input" value="" name="ar_curr_cd" maxlength="3" dataformat="engup" type="text" /><button class="input_seach_btn" name="btn_com_ens_n13_ar_curr_cd" id="btn_com_ens_n13_ar_curr_cd" type="button"></button></td>
				</tr>	
				<tr>
					<th>Rep. Customer Code</th>
					<td><input id="rep_cust_cd" style="width: 105px; text-align:center;" class="input" value="" name="rep_cust_cd" maxlength="8" dataformat="engup" type="text" /><button class="input_seach_btn" name="btn_com_ens_041_rep_cust_cd" id="btn_com_ens_041_rep_cust_cd" type="button"></button></td>
					<th>Invoice Prefix</th>
					<td><input id="inv_pfx_cd" style="width: 110px; text-align:center;" class="input" value="" name="inv_pfx_cd" maxlength="2" dataformat="engup" type="text" /> </td>
                    <th>PrepaidParty</th>
                    <td width=""><script language="javascript">ComComboObject('ppd_pty_tp_cd', 1, 110, 1, 0 ,0 ,false)</script></td>
                    <th>Sub Agent</th>
                    <td width=""><script type="text/javascript">ComComboObject('sub_agn_flg', 1, 70, 1, 0 ,0 ,false)</script></td>
				</tr>
			</tbody>
		</table>
		
		<table>
			<colgroup>
				<col width="155"/>
				<col width="200"/>
				<col width="155"/>
				<col width="250"/>
				<col width="155"/>
				<col width="*" />
			</colgroup>
			<tbody>
				<tr>
					<th>Fixed Currency Exch. Rate</th>
					<td><input id="fx_curr_rt" style="width: 133px; ime-mode:disabled;text-align:right;" class="input" value="" name="fx_curr_rt" maxlength="10" dataformat="float" pointcount="4" caption="Fixed Currency Exch. Rate" type="text" /> </td>
					<th>Office TAX Payer ID</th>
					<td><input id="ofc_tax_id" style="width: 220px; text-align:left;" class="input" value="" name="ofc_tax_id" maxlength="20" type="text" /> </td>
					<th>ASA Credit Term (Days)</th>
					<td><input id="asa_cr_term_dys" style="width: 230px;text-align:right;" class="input" value="" name="asa_cr_term_dys" maxlength="3" dataformat="num" type="text" /> </td>
				</tr>
				<!----> 
				<tr>
					<th><!-- Agent Settle Method --></th>
					<td colspan="5"><input id="ar_agn_stl_cd" style="width: 110px; text-align:center;" class="input" value="" name="ar_agn_stl_cd" maxlength="1" type="hidden" /></td>
				</tr>
				 <!---->
				<tr class="line_bluedot"><td colspan="6"></td></tr>	
			</tbody>
		</table>
		<table>
			<colgroup>
				<col width="155"/>
				<col width="130"/>
				<col width="155"/>
				<col width="130"/>
				<col width="160"/>
				<col width="130"/>
				<col width="155"/>
				<col width="*" />
			</colgroup>
			<tbody>
				<tr>
					<th>A/P Office</th>
					<td><input id="ap_ofc_cd" style="width: 75px; ime-mode: disabled; text-align:center;" class="input" value="" name="ap_ofc_cd" maxlength="6" dataformat="engup" type="text" /><button class="input_seach_btn" name="btn_com_ens_071_ap_ofc_cd" id="btn_com_ens_071_ap_ofc_cd" type="button"></button></td>
					<th>A/P Control Office</th>
					<td><input id="ap_ctrl_ofc_cd" style="width: 75px; ime-mode:disabled; text-align:center;" class="input" value="" name="ap_ctrl_ofc_cd" maxlength="6" dataformat="engup" type="text" /><button class="input_seach_btn" name="btn_com_ens_071_ap_ctrl_ofc_cd" id="btn_com_ens_071_ap_ctrl_ofc_cd" type="button"></button></td>
					<th>A/P Center Code</th>
					<td colspan="3"><input id="ap_ctr_cd" style="width: 115px; ime-mode:disabled; text-align:center;" class="input" value="" name="ap_ctr_cd" maxlength="6" dataformat="num" type="text" /><button class="input_seach_btn" name="btn_ap_ctr_cd" id="btn_ap_ctr_cd" type="button"></button></td>
				</tr>	
				<tr>
					<th>S/O Interface</th>
					<td><script type="text/javascript">ComComboObject('so_if_cd', 1, 105, 1, 0 ,0 ,false)</script></td>
					<th>A/P Currency</th>
					<td><input id="bil_curr_cd" style="width: 85px; text-align:center;" class="input" value="" name="bil_curr_cd" maxlength="3" dataformat="engup" type="text" /><button class="input_seach_btn" name="btn_com_ens_n13_bil_curr_cd" id="btn_com_ens_n13_bil_curr_cd" type="button"></button></td>
					<th>Vendor Code</th>
					<td><input id="vndr_cd" style="width: 80px; text-align:center;" class="input" value="" name="vndr_cd" maxlength="6" dataformat="num" type="text" /><button class="input_seach_btn" name="btn_com_ens_0c1_vndr_cd" id="btn_com_ens_0c1_vndr_cd" type="button"></button></td>
					<th>Separate Email Invoice Flag</th>
                    <td>
                    	<select style="width:50px;" class="input" name="sprt_eml_inv_flg">
                            <option value="N">N</option>
                            <option value="Y">Y</option>
                        </select>
                    </td>
					<th><!-- G/L Center Code --></th>
					<td><input id="gl_ctr_cd" style="width: 105px; ime-mode:disabled;text-align:center;" class="input" value="" name="gl_ctr_cd" maxlength="6" dataformat="num" type="hidden" /></td>
					
				</tr>
				<tr class="line_bluedot"><td colspan="8"></td></tr>
				<tr>
					<th>Delete Flag</th>
					<td><script type="text/javascript">ComComboObject('delt_flg', 1, 70, 1, 0 ,0 ,false)</script></td>						
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
					<col width="155"/>
					<col width="*" />
			</colgroup>
			<tr>
				<th>INPUT Flag</th>
				<td><input id="input_flg" name="input_flg" style="width:500px;" class="input1" value="" type="text" /> </td>
			</tr>	
		</table>
	</div>
</div>
<!-- opus_design_inquiry(E) -->
<!-- opus_design_grid(S) -->
<div class= "wrap_search">
        <div class="opus_design_grid" style="display: none;">
			<script type="text/javascript">ComSheetObject('sheet1');</script>
        </div>
 </div>
<!-- opus_design_grid(E) -->
</form>