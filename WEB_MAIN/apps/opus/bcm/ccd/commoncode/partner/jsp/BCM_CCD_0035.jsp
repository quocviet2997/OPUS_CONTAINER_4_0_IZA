<%
/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0035.jsp
*@FileTitle  : Customer 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/
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
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.partner.event.BcmCcd0035Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	BcmCcd0035Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//Error from server
	String strErrMsg = "";						//Error message
	int rowCount	 = 0;						//Count of DB resultSet list
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";
	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.commoncode.partner");
	// 승인처리용 정보
	String rqstNo		= JSPUtil.getParameter(request, "rqst_no");
	String procTpCd		= JSPUtil.getParameter(request, "proc_tp_cd");
	String custCd		= JSPUtil.getParameter(request, "cust_cd");
	String rqstUsrChk	= JSPUtil.getParameter(request, "rqst_usr_chk");
	String mainPage 		= "";
    mainPage = request.getParameter("main_page");
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		event = (BcmCcd0035Event)request.getAttribute("Event");
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
<input id="addr_tp_cd" name="addr_tp_cd" type="hidden" />
<input id="addr_seq" name="addr_seq" type="hidden" />
<input id="pagerows" name="pagerows" type="hidden" />
<input id="ibflag" name="ibflag" value="I" type="hidden" />
<input id="creflag" name="creflag" value="N" type="hidden" />
<input id="saveflag" name="saveflag" value="N" type="hidden" />
<input id="mdm_yn" name="mdm_yn" value="Y" type="hidden" />
<input id="cust_cnt_cd" name="cust_cnt_cd" type="hidden" />
<input id="cust_seq" name="cust_seq" type="hidden" />
<input id="cntr_div_flg" name="cntr_div_flg" type="hidden" />
<input id="mst_dat_subj_cd" name="mst_dat_subj_cd" value="CUST" type="hidden" />
<input id="rqst_no" name="rqst_no" value="<%=rqstNo%>" type="hidden" />
<input id="proc_tp_cd" name="proc_tp_cd" value="<%=procTpCd%>" type="hidden" />
<input id="rqst_usr_chk" name="rqst_usr_chk" value="<%=rqstUsrChk%>" type="hidden" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<h2 class="page_title">
	<%if (("true").equals(mainPage)){%>
		<button type="button">
		<span id="title"></span></button></h2>
	<%}else{%>
		<span id="title1">Customer</span></h2>
	<%} %>	

	
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_CheckDup" id="btn_CheckDup" style="display: none">Check Duplicate</button><!-- 
		--><button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve" style="display: none">Retrieve</button><!--
		--><button type="button" class="btn_normal" name="btn_Save" id="btn_Save" style="display: none">Save</button><!--
		--><button type="button" class="btn_normal" name="btn_Create" id="btn_Create" style="display: none">Create</button><!--
		--><button type="button" class="btn_normal" name="btn_New" id="btn_New" style="display: none">New</button><!-- 
		--><button type="button" class="btn_normal" name="btn_Request" id="btn_Request" style="display: none;color:red">Request</button><!--
		--><button type="button" class="btn_normal" name="btn_Close" id="btn_Close" style="display: none">Close</button><!-- 
		-->
	</div>
	<!-- opus_design_btn(E) -->
	<!-- page_location(S) -->
	<%if (("true").equals(mainPage)){%>
	<div class="location">	
		<span id="navigation"></span>
	</div>
	<%}%>
	<!-- page_location(E) -->
</div>
<!-- opus_design_inquiry(S) -->
<div class="wrap_search">
	<div class="opus_design_inquiry wFit">
		<table>
			<tbody>
			<colgroup>
					<col width="150"/>
					<col width="120"/>
					<col width="*" />
				</colgroup>
				<tr>
					<th>Customer Code</th>
					<td>
						<input id="cust_cd" style="width: 80px; text-align: center; ime-mode:disabled;" class="input1" name="cust_cd" value="<%=custCd%>" maxlength="8" dataformat="engup" type="text" /><!-- 
						 --><button class="input_seach_btn" name="btn_com_ens_041" id="btn_com_ens_041" type="button"></button> 
					</td>
					<td></td>
				</tr>
			</tbody>
		</table>
		</div>
		<table class="line_bluedot"><tr><td colspan="6"></td></tr></table>
		<div class="opus_design_inquiry wFit">
		<table>
			<tbody>
			<colgroup>
					<col width="150"/>
					<col width="420"/>
					<col width="120"/>
					<col width="100"/>
					<col width="*" />
				</colgroup>
				<tr>
					<th>Legal English Name</th>
					<!-- <td><input id="cust_lgl_eng_nm" style="width: 340px;" class="input1" value="" name="cust_lgl_eng_nm" maxlength="100" dataformat="engupspace" otherchar="@&()_\- " type="text" /> </td> -->
					<td>
						<input id="cust_lgl_eng_nm" style="width: 340px;" class="input1" value="" name="cust_lgl_eng_nm" maxlength="100" dataformat="eng" otherchar="!@&()_/\- " type="text" /> 
					</td>
					<th>Local Language Name</th>
					<td><input id="cust_locl_lang_nm" style="width: 400px;" class="input" value="" name="cust_locl_lang_nm" maxlength="100"  type="text" /> </td>
					<td></td>
				</tr>
				<tr>
					<th>Address</th>
					<td><input id="bzet_addr" style="width: 340px;" class="input" value="" name="bzet_addr" maxlength="200" disabled="" type="text" /> </td>
					<th>Abbreviation</th>
					<td><input id="cust_abbr_nm" style="width: 400px;" class="input" value="" name="cust_abbr_nm" maxlength="50" type="text" /> </td>
					<td></td>
				</tr>
				<tr>
					<th>Tax Payer ID</th>
					<td><input id="cust_rgst_no" style="width: 340px;" class="input" value="" name="cust_rgst_no" maxlength="20"  type="text" /> </td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
			</tbody>
		</table>
		
		</div>
		<table class="line_bluedot"><tr><td colspan="6"></td></tr></table>
		<div class="opus_design_inquiry wFit">
		
		<table>
			<tbody>
			<colgroup>
					<col width="150"/>
					<col width="200"/>
					<col width="70"/>
					<col width="200"/>
					<col width="70"/>
					<col width="200"/>
					<col width="70"/>
					<col width="100"/>
					<col width="*" />
				</colgroup>
				<tr>
					<th>Location Code</th>
					<td>
						<input id="loc_cd" style="width: 100px; text-align:center;" class="input1" value="" name="loc_cd" maxlength="5" dataformat="engup" type="text" /><!-- 
						 --><button class="input_seach_btn" name="btn_com_ens_051" id="btn_com_ens_051" type="button"></button>
					</td>
					<th>Admin. Office</th>
					<td>
						<input id="ofc_cd" style="width: 80px; text-align:center;" class="input1" value="" name="ofc_cd" maxlength="6" dataformat="engup" type="text" /><!-- 
						 --><button class="input_seach_btn" name="btn_com_ens_071" id="btn_com_ens_071" type="button"></button>
					</td>
					<th>Sales Rep Code</th>
					<td><input id="srep_cd" style="width: 100px; text-align:center;" class="input" value="" name="srep_cd" maxlength="5" dataformat="engup" type="text" /> </td>
					<th>Firm/Private</th>
					<td><script type="text/javascript">ComComboObject('indiv_corp_div_cd', 2, 52, 1, 0 ,0 ,false)</script></td>
					<td></td>
				</tr>
				<tr>
					<th>Customer Type</th>
					<td><script type="text/javascript">ComComboObject('cntr_cust_tp_cd', 2, 100, 1, 1 ,0 ,false)</script></td>
					<th>Individual/Group</th>
					<td><script type="text/javascript">ComComboObject('cust_div_cd', 2, 78, 1, 1 ,0 ,false)</script></td>
					<th>Group Customer</th>
			        <td>
			        	<input otherchar="-" id="cust_grp_id" style="width: 100px; ime-mode:disabled; text-align:center;" maxlength="10" name="cust_grp_id" class="input" value="" dataformat="engup" type="text" /><!-- 
			        	 --><button class="input_seach_btn" name="btn_com_com_0006" id="btn_com_com_0006" type="button"></button>
			       	</td>
			        <td></td>
			        <td></td>
					<td></td>
				</tr>
				<tr>
					<th>Need Base Seg. Class1</th>
					<td><script type="text/javascript">ComComboObject('nbs_clss_cd1', 2, 70, 1, 0 ,0 ,false)</script></td>
					<th>Need Base Seg. Class2</th>
					<td><script type="text/javascript">ComComboObject('nbs_clss_cd2', 2, 40, 1, 0 ,0 ,false)</script></td>
					<th>Need Base Seg. Class3</th>
					<td><script type="text/javascript">ComComboObject('nbs_clss_cd3', 2, 66, 1, 0 ,0 ,false)</script></td>
					<th>Value Base Seg. Class</th>
					<td><script type="text/javascript">ComComboObject('vbs_clss_cd', 2, 50, 1, 0 ,0 ,false)</script></td>
					<td></td>
				</tr>
				<tr>
					<th>Vendor Code</th>
					<td>
						<input id="vndr_seq" style="width: 100px; text-align:center;" class="input" value="" name="vndr_seq" maxlength="6" dataformat="num" type="text" /><!-- 
						 --><button class="input_seach_btn" name="btn_com_ens_0C1" id="btn_com_ens_0C1" type="button"></button>
					</td>
					<th>Multi Trade Account</th>
					<td><select style="width: 80px;" class="input" name="mlt_trd_acct_flg" id="mlt_trd_acct_flg"><option value="N">N</option><option value="Y">Y</option></select></td>
					<th>Named Customer Flag</th>
					<td><select style="width: 80px;" class="input" name="nmd_cust_flg"><option value="N">N</option><option value="Y">Y</option></select></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<th>Key Account Flag</th>
					<td><select style="width: 100px;" class="input" name="key_acct_flg"><option value="N">N</option><option value="Y">Y</option></select></td>
					<th>Key Account Effective Date</th>
					<td>
						<input id="key_acct_st_eff_dt" style="width: 80px;" class="input" value="" name="key_acct_st_eff_dt" dataformat="ymd"  type="text" /><!-- 
						 --><button class="calendar ir" name="btn_opn_dt_cal" id="btn_opn_dt_cal" type="button"></button>
					</td>
					<th>Key Account Expire Date</th>
					<td>
						<input id="key_acct_end_eff_dt" style="width: 80px;" class="input" value="" name="key_acct_end_eff_dt" dataformat="ymd" type="text" /><!-- 
						 --><button class="calendar ir" name="btn_clz_dt_cal" id="btn_clz_dt_cal" type="button"></button>
					</td>
					<td></td>
					<td></td>
					<td></td>
					</tr>					
			</tbody>
		</table>
		
		</div>
		<table class="line_bluedot"><tr><td colspan="6"></td></tr></table>
		<div class="opus_design_inquiry wFit">
		
		<table>
			<tbody>
			<colgroup>
					<col width="150"/>
					<col width="190"/>
					<col width="70"/>
					<col width="150"/>
					<col width="70"/>
					<col width="187"/>
					<col width="70"/>
					<col width="120"/>
					<col width="*" />
				</colgroup>
				<tr>
					<th>Foundation Date</th>
					<td>
						<input id="fndt_dt" style="width: 80px;" class="input" value=""   name="fndt_dt" dataformat="ymd"  type="text" /><!-- 
						 --><button class="calendar ir" name="btn_opn_dt_cal_1" id="btn_opn_dt_cal_1" type="button"></button>
					</td>
					<th>Finance Status</th>
					<td  style="width: 50px;"><script type="text/javascript">ComComboObject('finc_sts_lvl_cd', 2, 50, 1, 0 ,0 ,false)</script></td>
					<th>Employees</th>
					<td><input id="empe_knt" style="width: 120px; text-align:right;" class="input" value="" name="empe_knt" maxlength="5" dataformat="num" type="text" /></td>
					<th>Industry Type</th>
					<td><input id="indus_desc" style="width: 84px;" class="input" value="" name="indus_desc" maxlength="100" type="text" /></td>
					<td></td> 
				</tr>
				<tr>
					<th>Yearly Volume (TEU)</th>
					<td><input id="crnt_vol_knt" style="width: 80px;text-align:right;" class="input" value="" name="crnt_vol_knt" maxlength="5" dataformat="float" type="text" /></td>
					<th>Listed Stock</th>
                    <td><select style="width: 50px;" class="input" name="lstk_flg"><option value="N">N</option><option value="Y">Y</option></select></td>
					<th>CTS No.</th>
					<td><input id="cts_no" style="width: 120px;" class="input" value="" name="cts_no" maxlength="11"  type="text" /> </td>
					<th>Capital Currency</th>
					<td>
						<input id="capi_curr_cd" style="width: 85px; text-align:center;" class="input" value="" name="capi_curr_cd" maxlength="3" dataformat="engup" type="text" /><!-- 
						 --><button class="input_seach_btn" name="btn_com_ens_n13" id="btn_com_ens_n13" type="button"></button>
					</td>
					<td></td>
				</tr>			
			</tbody>
		</table>
		
		<table>
			<tbody>
			<colgroup>
					<col width="150"/>
					<col width="450"/>
					<col width="50"/>
					<col width="400"/>
					<col width="*" />
				</colgroup>
				 <tr>
				    <th>Capital Amount</th>
					<td><input id="capi_amt" style="width: 330px; text-align:right;" class="input" value="" name="capi_amt" maxlength="18" dataformat="float" type="text" /> </td>
					<th>Remark</th>
					<td><input id="cust_rmk" style="width: 400px;" class="input" value="" name="cust_rmk" maxlength="500" type="text" /> </td>
					<td></td>
				</tr>		
			</tbody>
		</table>
		
		</div>
		<table class="line_bluedot"><tr><td colspan="6"></td></tr></table>
		<div class="opus_design_inquiry wFit">
		
		<table>
			<tbody>
			<colgroup>
					<col width="175"/>
					<col width="270"/>
					<col width="120"/>
					<col width="235"/>
					<col width="120"/>
					<col width="150"/>
					<col width="*" />
				</colgroup>
				<tr>
					<th>Standard Carrier Alpha Code</th>
					<td><input id="nvocc_co_scac_cd" style="width: 150px;" class="input" value="" name="nvocc_co_scac_cd" maxlength="10" dataformat="eng" otherchar="!@&()_/\- " type="text" /> </td>
					<th>NVO FMC License No</th>
					<td><input id="nvocc_lic_no" style="width: 125px;" class="input" value="" name="nvocc_lic_no" maxlength="20" dataformat="eng" otherchar="!@&()_/\- " type="text" /> </td>
					<th>NVO FMC Bond No</th>
					<td><input id="nvocc_bd_no" style="width: 128px;" class="input" value="" name="nvocc_bd_no" maxlength="20" dataformat="eng" otherchar="!@&()_/\- " type="text" /> </td>
					<td></td>
				</tr>
				<tr>
					<th>FMC Bond Amount</th>
					<td><input id="nvocc_bd_amt" style="width: 150px; text-align:right;" class="input" value="" name="nvocc_bd_amt" maxlength="12" dataformat="float" type="text" /> </td>
					<th>Bond Effective Date</th>
					<td>
						<input id="nvocc_bd_st_eff_dt" style="width: 100px;" class="input" value="" name="nvocc_bd_st_eff_dt"  dataformat="ymd"  type="text" /><!-- 
						 --><button class="calendar ir" name="btn_opn_dt_cal_2" id="btn_opn_dt_cal_2" type="button"></button>
					</td>
					<th>Bond Expire Date</th>
					<td>
						<input id="nvocc_bd_end_eff_dt" style="width: 100px;" class="input" value="" name="nvocc_bd_end_eff_dt" dataformat="ymd"  type="text" /><!-- 
						 --><button class="calendar ir" name="btn_opn_dt_cal_3" id="btn_opn_dt_cal_3" type="button"></button>
					</td>
					<td></td>
				</tr>
				<tr>
					<th>F/FWDR FMC File No</th>
					<td><input id="frt_fwrd_fmc_no" style="width: 150px;" class="input" value="" name="frt_fwrd_fmc_no" maxlength="20" dataformat="engup" type="text" /> </td>
					<th>Sales Delete Effective Date</th>
					<td>
						<input id="sls_delt_eff_dt" style="width: 100px;" class="input" value="" name="sls_delt_eff_dt" dataformat="ymd"   type="text" /><!-- 
						 --><button class="calendar ir" name="btn_opn_dt_cal_4" id="btn_opn_dt_cal_4" type="button"></button>
					</td>
					<td></td>
					<td></td>
					<td></td>
				</tr>				
			</tbody>
		</table>
		
		</div>
		<table class="line_bluedot"><tr><td colspan="6"></td></tr></table>
		<div class="opus_design_inquiry wFit">
		
		<table> 
			<colgroup>
				<col width="150"/>
				<col width="100x"/>
				<col width="*" />
			</colgroup>
			<tr>
				<th>Delete Flag</th>
				<td><select style="width: 110px;" class="input" name="delt_flg" id="delt_flg" onChange="obj_change()";><option value="N">N</option><option value="Y" >Y</option></select></td>
				<td></td>
			</tr>	
		</table>
	</div>
</div>
<!-- opus_design_inquiry(E) -->

<div class="wrap_result">
<!-- opus_design_grid(S) -->
    <div class="opus_design_grid" style="display: none;">
		<script type="text/javascript">ComSheetObject('sheet1');</script>
    </div>
</div>
<!-- opus_design_grid(E) -->
</form>