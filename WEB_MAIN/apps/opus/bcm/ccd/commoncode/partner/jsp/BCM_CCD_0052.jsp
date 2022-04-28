<%
/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0052.jsp
*@FileTitle  : Customer Integration
*@author     : CLT
*@version    : 1.0
*@since      : 2014/11/10
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
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.partner.event.BcmCcd0052Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
    BcmCcd0052Event  event = null;              //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;         //Error from server
    String strErrMsg = "";                      //Error message
    int rowCount     = 0;                       //Count of DB resultSet list
    String successFlag = "";
    String codeList  = "";
    String pageRows  = "100";
    String strUsr_id        = "";
    String strUsr_nm        = "";
    Logger log = Logger.getLogger("com.clt.apps.commoncode.partner");
    // 승인처리용 정보
    String rqstNo       = JSPUtil.getParameter(request, "rqst_no");
    String procTpCd     = JSPUtil.getParameter(request, "proc_tp_cd");
    String custCd       = JSPUtil.getParameter(request, "cust_cd");
    String rqstUsrChk   = JSPUtil.getParameter(request, "rqst_usr_chk");
	String mainPage 		= "";
    mainPage = request.getParameter("main_page");
    try {
        SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
        strUsr_id = account.getUsr_id();
        strUsr_nm = account.getUsr_nm();
        event = (BcmCcd0052Event)request.getAttribute("Event");
        serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
        if (serverException != null) {
            strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
        }
        GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
    } catch(Exception e) {
        out.println(e.toString());
    }
%>

<script language="javascript">
    <%= JSPUtil.getIBCodeCombo("addr_tp_cd", "01", "CD00699", 0, "")%>
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
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
<input type="hidden" name="addr_tp_cd">
<input type="hidden" name="addr_seq">
<input type="hidden" name="pagerows">
<input type="hidden" name="ibflag" value="I">
<input type="hidden" name="creflag" value="N">
<input type="hidden" name="saveflag" value="N">
<input type="hidden" name="mdm_yn" value="Y">
<input type="hidden" name="cust_cnt_cd" >
<input type="hidden" name="cust_seq" >
<input type="hidden" name="cntr_div_flg" id="cntr_div_flg" />
<input type="hidden" name="cnsd_cust_cnt_cd" >
<input type="hidden" name="cnsd_cust_seq" >
<input type="hidden" name="sheet_cust_cnt_cd" >
<input type="hidden" name="is_new_yn" value="Y" >
<input type="hidden" name="mst_dat_subj_cd" value="CUST">
<input type="hidden" name="rqst_no"         value="<%=rqstNo%>">
<input type="hidden" name="proc_tp_cd"      value="<%=procTpCd%>">
<input type="hidden" name="rqst_usr_chk"    value="<%=rqstUsrChk%>">
<input type="hidden" name="old_modi_cust_cd" >
<input type="hidden" name="edi_if_flg" >
<input type="hidden" name="org_cust_grp_hrchy_cd" id="org_cust_grp_hrchy_cd" />
<input type="hidden" name="chng_tp"  id="chng_tp" />
<input type="hidden" name="glob_ct"  id="glob_ct" />
<input type="hidden" name="rlob_ct"  id="rlob_ct" />
<input type="hidden" name="cnt_ct"   id="cnt_ct" />
<input type="hidden" name="indiv_ct" id="indiv_ct" />
<input type="hidden" name="hr_chk"/>
<input type="hidden" name="org_cust_grp_id" />
<input type="hidden" name="certi_flg" value ="N" />
<input type="hidden" name="certi_sav_id"/>
<input type="hidden" name="rqst_usr_id"/>

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title">
	<%if (("true").equals(mainPage)){%>
		<button type="button">
		<span id="title"></span></button></h2>
	<%}else{%>
		<span id="title1">Customer Integration</span></h2>
	<%} %>
	
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
		 <button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve" style="display:none">Retrieve</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_CheckDup" id="btn_CheckDup" style="display:none">Check Duplicate</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_Save" id="btn_Save" style="display:none">Save</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_Request" id="btn_Request" style="display: none;color:red">Request</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_Create" id="btn_Create" style="display:none">Create</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_New" id="btn_New" style="display:none">New</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_Close" id="btn_Close" style="display:none">Close</button>
	</div>
	<!-- opus_design_btn(E) -->
	<!-- page_location(S) -->
	<%if (("true").equals(mainPage)){%>
	<div class="location">	
		<span id="navigation"></span>
	</div>
	<%}%>
</div>
<!-- page_title_area(E) -->

<div class="wrap_search">
<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry wFit">
		<table>
			<colgroup>
				<col width="180"/>
				<col width="145"/>
				<col width="80"/>
				<col width="178"/>
				<col width="120"/>
				<col width="*" />
			</colgroup>
			<tbody>
				<tr>
					<th>Customer Code</th>
					<td>
						<input type="text" style="width:80px;text-align:center;ime-mode:disabled;" class="input1" name="cust_cd" value="<%=custCd%>" maxlength="8" dataformat="engup"><!-- 
						--><button type="button" class="input_seach_btn" name="btn_com_ens_041" id="btn_com_ens_041"></button>
					</td>
                    <th>Legacy Customer Code</th>
                    <td><input type="text" style="width:150px; text-align:center; ime-mode:disabled;" class="input" dataformat="engup" name="lgcy_cd"></td>
                    <!-- <th>Legacy Code(GCC)</th> -->
                    <th>To-Be Customer Code</th>
                    <td><input type="text" style="width:150px; text-align:center; ime-mode:disabled;" class="input" dataformat="engup" name="modi_cust_cd2" maxlength="8"></td>
				</tr>
			</tbody>
		</table>
	    <table class="line_bluedot"><tr><td></td></tr></table>
		<table>
			<colgroup>
				<col width="180"/>
				<col width="390"/>
				<col width="190"/>
				<col width="*" />
			</colgroup>
			<tbody>
				<tr>
                    <th>Legal English Name</th>
                    <td><input type="text" style="width:350px;" class="input1" value="" name="cust_lgl_eng_nm" maxlength="100" dataformat="engup" otherchar="()_\-,. &()'"></td>
                    <th>Local Language Name</th>
                    <td><input type="text" style="width:350px" class="input" value="" name="cust_locl_lang_nm" maxlength="100" dataformat="eng" otherchar="()_\-,. &()'"></td>
				</tr>
				<tr>
                    <th>Address</th>
                    <td><input type="text" style="width:350px;" class="input" value=""name="bzet_addr" maxlength="200" disabled></td>
                    <th>Abbreviation</th>
                    <td><input type="text" style="width:350px;" class="input" value="" name="cust_abbr_nm" maxlength="50" ></td>
				</tr>
				<tr>
                    <th>Tax Payer ID</th>
                    <td colspan="3"><input type="text" style="width:350px;" class="input" value="" name="cust_rgst_no" maxlength="20" dataformat="engup" otherchar="-"></td>
				</tr>
			</tbody>
		</table>
		<table>
			<colgroup>
				<col width="180"/>
				<col width="150"/>
				<col width="135"/>
				<col width="110"/>
				<col width="180"/>
				<col width="*" />
			</colgroup>
			<tbody>
				<tr>
                    <th>India GST No.</th>
                    <td><input type="text" style="width:150px;" class="input" id="ida_gst_no" name="ida_gst_no" maxlength="15" dataformat="engup" otherchar=" "></td>
                    <th>India Customer in SEZ</th>
                    <td>
                    	<select style="width:60px;" class="input" id="sez_flg" name="sez_flg" onBlur="obj_change();">
                            <option value="N" selected>N</option>
                            <option value="Y">Y</option>
                        </select>
                    </td>
                    <th>India SEZ Details</th>
                    <td><input type="text" style="width:250px;" class="input" id="sez_desc" name="sez_desc" maxlength="4000" disabled></td>
				</tr>
			</tbody>
		</table>
	    <table class="line_bluedot"><tr><td></td></tr></table>    
		<table>
			<colgroup>
				<col width="180"/>
				<col width="150"/>
				<col width="150"/>
				<col width="135"/>
				<col width="150"/>
				<col width="150"/>
				<col width="150"/>
				<col width="150"/>
				<col width="150"/>
				<col width="*" />
			</colgroup>
			<tbody>
				<tr>
				    <th>Location Code</th>
                    <td>
                    	<input type="text" style="width:100px;text-align:center;" class="input1" value="" name="loc_cd" maxlength="5" dataformat="engup"><!--
                        --><button type="button" class="input_seach_btn" name="btn_com_ens_051" id="btn_com_ens_051"></button>
                    </td>
                    <th>Admin Office</th>
                    <td><input type="text" style="width:80px;text-align:center;" class="input1" value="" name="ofc_cd" maxlength="5" dataformat="engup"><!--
                        --><button type="button" class="input_seach_btn" name="btn_com_ens_071" id="btn_com_ens_071"></button>
                    </td>
                    <th>Sales Rep. Code</th>
                    <td>
                    	<input type="text" style="width:100px;text-align:center;" class="input1" value="" name="srep_cd" maxlength="5" dataformat="engup"><!--
                        --><button type="button" id="btn_srep_search" name="btn_srep_search" class="input_seach_btn"></button>
                    </td>
                    <th>Firm/Private</th>
                    <td>
                    	<script language="javascript">ComComboObject('indiv_corp_div_cd', 2, 100, 0, 0, 1, false)</script>
                    </td>
                    
                    <th></th>
                    <td><input id="rail_road_prio_flg" value="Y" class="trans" name="rail_road_prio_flg" type="checkbox" /><label for="rail_road_prio_flg"><strong>Priority for Rail Road</strong></label></td>
				</tr>
                <tr>
                    <th>Customer Type</th>
                    <td><script language="javascript">ComComboObject('cntr_cust_tp_cd', 2, 120, 1, 1 ,1 ,false)</script></td>
                    <th>Customer Hierarchy</th>
                    <td><script language="javascript">ComComboObject('cust_grp_hrchy_cd', 2, 120, 1, 1 ,1 ,false)</script></td>
                    <th>Individual/Group</th>
                    <td><script language="javascript">ComComboObject('cust_div_cd', 2, 120, 1, 1 ,1 ,false)</script></td>
                    <th>Group Customer</th>
                    <td>
                    <input type="text" style="width:100px;ime-mode:disabled;text-align:center;" maxlength="10" id="cust_grp_id" name="cust_grp_id" class="input" value="" dataformat="engup" otherchar=" &,.-" disabled><!--
                       --><button type="button" class="input_seach_btn" name="btn_com_com_0006" id="btn_com_com_0006" disabled></button>
                    </td>
                    
                    <th></th>
                    <td><input id="crm_if_flg" value="Y" class="trans" name="crm_if_flg" type="checkbox" /><label for="crm_if_flg"><strong>Track in CRM</strong></label></td>
                </tr> 
                <tr>
                    <th>MOT Number</th>
                    <td><input type="text" style="width:130px;" class="input" id="mot_no" name="mot_no" maxlength="15" dataformat="engup" otherchar=" -_"></td>
                    <th>MOT Effective Date</th>
                    <td><input type="text" caption="Effective date" name="mot_eff_dt" id="mot_eff_dt" coffield="mot_exp_dt" maxlength="10" dataformat="ymd" style="width: 100px; text-align: center;" class="input" ><!-- 
				 	--><button type="button" name="btns_calendar1" id="btns_calendar1"  class="calendar ir"></button></td>
				 	<th>MOT Expire Date</th>
				 	<td><input type="text" caption="Expiration date" name="mot_exp_dt" id="mot_exp_dt" cofield="mot_eff_dt" maxlength="10" dataformat="ymd" style="width: 100px; text-align: center;" class="input" ><!-- 
				 	--><button type="button" name="btns_calendar2" id="btns_calendar2"  class="calendar ir"></button></td>
                    <th>Certificate</th>
                    <td><button type="button" class="btn_etc" name="btn_upload" id="btn_upload">Upload Cert.</button></td>
                </tr> 
                <tr>
                    <th>Customer Sub Type</th>
                    <td><script language="javascript">ComComboObject('nbs_clss_cd1', 2, 120, 1, 0, 1, false)</script></td>
                    <th>Nationality Group</th>
                    <td><script language="javascript">ComComboObject('nbs_clss_cd2', 2, 60, 1, 0, 1, false)</script></td>
                    <th>Regional Key Account</th>
                    <td><select style="width:60px;" class="input" name="nbs_clss_cd3" id="nbs_clss_cd3">
                            <option value="N">N</option>
                            <option value="Y">Y</option>
                        </select>
					</td>
                    <th>Role</th>
                    <td><script language="javascript">ComComboObject('vbs_clss_cd', 2, 160, 1, 0, 1, false)</script></td>
                </tr>   
			</tbody>
		</table>
		<table>
			<colgroup>
				<col width="180"/>
				<col width="150"/>
				<col width="250"/>
				<col width="150"/>
				<col width="250"/>
				<col width="*" />
			</colgroup>
			<tbody>
                <tr>
                    <th>Vendor Code</th>
                    <td>
                    	<input type="text" style="width:100px;text-align:center;" class="input" value="" name="vndr_seq" maxlength="6" dataformat="num"><!--
                        --><button type="button" class="input_seach_btn" name="btn_com_ens_0C1" id="btn_com_ens_0C1"></button>
                    </td>
                    <th>Multi Trade Account</th>
                    <td>
                    	<select style="width:80px;" class="input" name="mlt_trd_acct_flg" id="mlt_trd_acct_flg">
                            <option value="N">N</option>
                            <option value="Y">Y</option>
                        </select>
                    </td>
                    <th>Named Customer Flag</th>
                    <td><script language="javascript">ComComboObject('nmd_cust_flg', 1, 80, 1, 0 ,2 ,false)</script></td>
                </tr>
                <tr>
                    <th>GCM Account Flag</th>
                    <td><select style="width:102px;" class="input" name="key_acct_flg" id="key_acct_flg">
                            <option value="N">N</option>
                            <option value="Y">Y</option>
                        </select>
                    </td>
                    <th>GCM Account Effective Date</th>
                    <td>
                    	<input type="text" style="width:80px;" class="input" value="" name="key_acct_st_eff_dt" dataformat="ymd" maxlength="10" disabled><!--
						--><button type="button" class="calendar ir" name="btn_opn_dt_cal" id="btn_opn_dt_cal"></button>
					</td>
                    <th>GCM Account Expire Date</th>
                    <td>
                    	<input type="text" style="width:80px;" class="input" value="" name="key_acct_end_eff_dt" dataformat="ymd" maxlength="10" disabled><!--
						--><button type="button" class="calendar ir" name="btn_clz_dt_cal" id="btn_clz_dt_cal"></button>
					</td>
                </tr>
			</tbody>
		</table>
	    <table class="line_bluedot"><tr><td></td></tr></table>
		<table>
			<colgroup>
				<col width="180"/>
				<col width="150"/>
				<col width="150"/>
				<col width="135"/>
				<col width="150"/>
				<col width="150"/>
				<col width="150"/>
				<col width="*" />
			</colgroup>
			<tbody>
                <tr>
                    <th>Foundation Date</th>
                    <td>
                    	<input type="text" style="width:80px;" class="input" value="" name="fndt_dt" dataformat="ymd" maxlength="10"><!--
						--><button type="button" class="calendar ir" name="btn_opn_dt_cal_1" id="btn_opn_dt_cal_1"></button>
					</td>
                    <th>Finance Status</th>
                    <td><script language="javascript">ComComboObject('finc_sts_lvl_cd', 2, 42, 1, 0 ,0 ,false)</script></td>
                    <th>Employees</th>
                    <td><input type="text" style="width:120px;text-align:right;" class="input" value="" name="empe_knt" maxlength="5" dataformat="num"></td>
                    <th>Industry Type</th>
                    <td>
                    	<script language="javascript">ComComboObject('indus_desc', 2, 120, 1, 0, 1, false)</script>
                    </td>
                </tr>
                <tr>
                    <th>Yearly Volume (TEU)</th>
                    <td><input type="text" style="width:80px;text-align:right;" class="input" value="" name="crnt_vol_knt" maxlength="5" dataformat="num"></td>
                    <th>Listed Stock</th>
                    <td>
                    	<select style="width:40px;" class="input" name="lstk_flg">
                            <option value="N">N</option>
                            <option value="Y">Y</option>
                        </select>
                    </td>
                    <th>CTS No.</th>
                    <td><input type="text" style="width:120px;" class="input" value="" name="cts_no" maxlength="11" dataformat="engup"></td>
                </tr>
                <tr>
                    <th>Capital Currency</th>
                    <td>
                    	<input type="text" style="width:84px;text-align:center;" class="input" value="" name="capi_curr_cd" maxlength="3" dataformat="engup"><!--
                        --><button type="button" class="input_seach_btn" name="btn_com_ens_n13" id="btn_com_ens_n13"></button>
                    </td>
                    <th>Capital Amount</th>
                    <td><input type="text" style="width:100px;text-align:right;" class="input" value="" name="capi_amt" maxlength="18" dataformat="num"></td>
                    <th>Remark</th>
                    <td colspan="3"><input type="text" style="width:380px;" class="input" value="" name="cust_rmk" maxlength="500" dataformat="eng" otherchar=" &-,."></td>
                </tr>
			</tbody>
		</table>
	    <table class="line_bluedot"><tr><td></td></tr></table>
		<table>
			<colgroup>
				<col width="180"/>
				<col width="160"/>
				<col width="180"/>
				<col width="130"/>
				<col width="180"/>
				<col width="130"/>
				<col width="130"/>
				<col width="*" />
			</colgroup>
			<tbody>
                <tr>
                    <th>Standard Carrier Alpha Code</th>
                    <td><input type="text" style="width:150px;" class="input" value="" name="nvocc_co_scac_cd" maxlength="10" dataformat="eng" otherchar=" &-,."></td>
                    <th>FMC Org.(OTI) No.</th>
                    <td><input type="text" style="width:124px;" class="input" value="" name="nvocc_bd_no" maxlength="20" dataformat="eng" otherchar=" &-,."></td>
                    <th>FMC License No.</th>
                    <td><input type="text" style="width:124px;" class="input" value="" name="nvocc_lic_no" maxlength="20" dataformat="eng" otherchar=" &-,."></td>
					<th>Separate Email Invoice Flag</th>
                    <td>
                    	<select style="width:50px;" class="input" name="sprt_eml_inv_flg">
                            <option value="N">N</option>
                            <option value="Y">Y</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th>FMC Bond Amount</th>
                    <td><input type="text" style="width:150px;text-align:right;" class="input" value="" name="nvocc_bd_amt" maxlength="12" dataformat="num"></td>
                    <th>Bond Effective Date</th>
                    <td>
                    	<input type="text" style="width:102px;" class="input" value="" name="nvocc_bd_st_eff_dt" dataformat="ymd" maxlength="10"><!--
						--><button type="button" class="calendar ir" name="btn_opn_dt_cal_2" id="btn_opn_dt_cal_2"></button>
					</td>
                    <th>Bond Expire Date</th>
                    <td><input type="text" style="width:102px;" class="input" value="" name="nvocc_bd_end_eff_dt" dataformat="ymd" maxlength="10"><!-- 
						--><button type="button" class="calendar ir" name="btn_opn_dt_cal_3" id="btn_opn_dt_cal_3"></button>
					</td>
                    <th>Default Invoice</br>Currency</th>
                    <td><script language="javascript">ComComboObject('dflt_inv_curr_div_cd', 2, 80, 1, 0 ,1 ,false)</script></td>
                </tr>
                <tr>
                    <th>F/FWDR FMC File No</th>
                    <td><input type="text" style="width:150px;" class="input" value="" name="frt_fwrd_fmc_no" maxlength="20" dataformat="engup"></td>
                    <th>Sales Delete Effective Date</th>
                    <td><input type="text" style="width:102px;" class="input" value="" name="sls_delt_eff_dt" dataformat="ymd" maxlength="10"><!--
						--><button type="button" class="calendar ir" name="btn_opn_dt_cal_4" id="btn_opn_dt_cal_4"></button>
					</td>
					<th>Payment Request Letter </br>Consolidated Customer ID</th>
					<td >
						<input type="text" style="width:80px;text-align:center;ime-mode:disabled;" class="input" name="cnsd_cust_cd" maxlength="8" dataformat="engup"><!-- 
						--><button type="button" class="input_seach_btn" name="btn_com_ens1_041" id="btn_com_ens1_041"></button>
					</td>
					<th>EDI Invoice Number Required</th>
                    <td>
                    	<select style="width:50px;" class="input" name="edi_inv_no_req_flg">
                            <option value="N">N</option>
                            <option value="Y">Y</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th>Suppress Payment Letter</th>
                    <td><script language="javascript">ComComboObject('sprs_pay_ltr_flg', 2, 80, 1, 0 ,0 ,false)</script></td>
                    <th>Payment Request</br>Letter Format</th>
                    <td><script language="javascript">ComComboObject('pay_rqst_ltr_fmt_cd', 2, 102, 1, 0 ,1 ,false)</script></td>
                    <th>Invoice EDI Level</th>
                    <td colspan="3"><script language="javascript">ComComboObject('inv_edi_lvl_cd', 2, 102, 1, 0 ,1 ,false)</script></td>
                </tr>   
			</tbody>
		</table>
	    <table class="line_bluedot"><tr><td></td></tr></table>
		<table>
        	<colgroup>
                <col width="180"/>
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
                        <select style="width:80px;" name="delt_flg" class="input" id="delt_flg">
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
		<h3 class="title_design">Customer Address</h3>
	    <div id="flagLayer1" style="display:none;">
			<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>
	    <div>
	         <div class="opus_design_btn">
	            <div id="btn_row_add2" style="display:none">
					<button type="button" class="btn_normal" name="btn_add2" id="btn_add2">Row Add</button>
	            </div>
	            <div id="btn_row_delete2" style="display:none">
					<button type="button" class="btn_normal" name="btn_del2" id="btn_del2">Row Delete</button>
	            </div>
			</div>
			<script type="text/javascript">ComSheetObject('sheet2');</script>
		</div>
	</div>
    <div class="opus_design_grid">
		<h3 class="title_design">Customer Contact Point</h3>
	         <div class="opus_design_btn">
	            <div id="btn_row_add3" style="display:none">
					<button type="button" class="btn_normal" name="btn_add3" id="btn_add3">Row Add</button>
	            </div>
	            <div id="btn_row_delete3" style="display:none">
					<button type="button" class="btn_normal" name="btn_del3" id="btn_del3">Row Delete</button>
	            </div>
			</div>
			<script type="text/javascript">ComSheetObject('sheet3');</script>
		</div>
    </div>
</div>

<!--Customer Hierarchy Type  -->
<div class="opus_design_grid"  style="display:none;">
	<script type="text/javascript">ComSheetObject('sheet4');</script>
</div>
</form> 
