<%
/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0039.jsp
*@FileTitle  : Credit Customer 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/10
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
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.partner.event.BcmCcd0039Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.framework.component.util.StringUtil" %>

<%
	BcmCcd0039Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//Error from server
	String strErrMsg = "";						//Error message
	int rowCount	 = 0;						//Count of DB resultSet list
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";
	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.commoncode.partner");
	
	String cust_cd = StringUtil.xssFilter(request.getParameter("cust_cd"));
	if(cust_cd == null){
		cust_cd = "";
	}
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		event = (BcmCcd0039Event)request.getAttribute("Event");
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
	var CRDT_CHK;
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
<input id="ibflag" name="ibflag" value="I" type="hidden" />
<input id="cust_seq" name="cust_seq" type="hidden" />
<input id="cust_cnt_cd" name="cust_cnt_cd" type="hidden" />
<input id="act_cust_cnt_cd" name="act_cust_cnt_cd" type="hidden" />
<input id="act_cust_seq" name="act_cust_seq" type="hidden" />
<input id="mdm_yn" name="mdm_yn" value="Y" type="hidden" />
<input id="hidden_ofc_cd" name="hidden_ofc_cd" value="" type="hidden" />
<input id="cust_cr_due_dt_div_cd" name="cust_cr_due_dt_div_cd" type="hidden" />
<input id="cr_clt_ofc_cd" name="cr_clt_ofc_cd" type="hidden" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title">
		<button type="button"><span id="title"></span></button>
	</h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn"><!--
		 --><button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_Save" id="btn_Save">Save</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button><!-- 
	--></div>
	<!-- opus_design_btn(E) -->
	<!-- page_location(S) -->
	<div class="location"><span id="navigation"></span></div>
</div>
<!-- page_title_area(E) -->

<div class="wrap_search">
<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry wFit">
		<table>
			<tbody>
				<colgroup>
					<col width="125"/>
					<col width="100"/>
					<col width="125"/>
					<col width="250"/>
					<col width="*" />
				</colgroup>
				<tr>
					<th>Customer Code</th>
					<td><input id="cust_cd" style="width: 80px; text-align:center;" class="input1" name="cust_cd" value="<%=cust_cd %>" maxlength="8" dataformat="engup" type="text" /><button class="input_seach_btn" name="btn_com_ens_041" id="btn_com_ens_041" type="button"></button></td>
					<th>Legal English Name</th>
					<td><input type="text" style="width:250px;text-align:left;ime-mode:disabled;" class="input" name="cust_lgl_eng_nm" readonly></td>
					<td></td>
				</tr>
			</tbody>
		</table>
	</div>
	<table class="line_bluedot"><tr><td colspan="6"></td></tr></table>
	<div class="opus_design_inquiry wFit">	
		<table>
			<colgroup>
					<col width="120px"/>
					<col width="125px"/>
					<col width="125px"/>
					<col width="180px"/>
					<col width="120px"/>
					<col width="170px"/>
					<col width="*" />
			</colgroup>
			<tbody>
				<tr class="h23">
					<th>Financial risk to release B/L and Cargo</th>
					<td><select style="width: 50px; ime-mode:disabled" type="hidden" dataformat="engup" class="input" name="cust_rlse_ctrl_flg" id="cust_rlse_ctrl_flg"><option value="N">N</option><option value="Y" >Y</option></select></td>
					<th>Credit Flag</th>
					<td><select style="width: 50px; ime-mode:disabled" type="hidden" dataformat="engup" class="input" name="cr_flg" id="cr_flg"><option value="N">N</option><option value="Y" >Y</option></select></td>
					<th></th>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
			    </tr>
			</tbody>
		</table>
		</div>
		<div class="opus_design_inquiry wFit">	
		<table>
			<colgroup>
					<col width="125"/>
					<col width="250"/>
					<col width="100"/>
					<col width="250"/>
					<col width="75"/>
					<col width="170"/>
					<col width="*" />
			</colgroup>
			<tbody>
				<tr class="h23">
					<th>O/B E-mail</th>
					<td><input id="ob_eml" style="width: 200px; ime-mode:disabled; text-align:left;" class="input" value="" name="ob_eml" maxlength="200" type="text" /></td>
					<th>I/B E-mail</th>
					<td><input id="ib_eml" style="width: 200px; ime-mode:disabled; text-align:left;" class="input" value="" name="ib_eml" maxlength="200" type="text" /></td>
					<td></td>
				</tr>	
				<tr class="h23">
					<th>O/B Fax No</th>
					<td><input id="ob_fax_no" style="width: 200px; ime-mode:disabled; text-align:left;" class="input" value="" name="ob_fax_no" maxlength="20" otherchar="-" dataformat="num" type="text" /></td>
					<th>I/B Fax No</th>
					<td><input id="ib_fax_no" style="width: 200px; ime-mode:disabled; text-align:left;" class="input" value="" name="ib_fax_no" maxlength="20" otherchar="-" dataformat="num" type="text" /></td>
                    <!-- th>Credit DIV</th>
                    <td>
                        <select style="width:80px;" dataformat="engup" class="input" name="cust_cr_due_dt_div_cd">
                            <option value=""></option>
                            <option value="S" >S/A Date</option>
                            <option value="I" >Issue Date</option>
                        </select>
                    </td -->
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
					<col width="120px"/>
					<col width="200px"/>
					<col width="125px"/>
					<col width="250px"/>
					<col width="100px"/>
					<col width="70px"/>
					<col width="140px" />
					<col width="70px"/>
					<col width="*" />
				</colgroup>
				<tr class="h23">
					<th>Indi.Exch.Rate Apply Scope</th>
					<td><script type="text/javascript">ComComboObject('xch_rt_div_cd', 2, 80, 1, 0 ,0 ,false)</script></td>
					<th>Indi.Exch.Rate Apply Basis</th>
					<td><script type="text/javascript">ComComboObject('cng_indiv_cd', 2, 100, 1, 0 ,0 ,false)</script></td>
					<th>Exch.Rate Start Date</th>
					<td><input id="dy_xch_aply_st_dt" style="width: 71px; ime-mode:disabled" class="input" value="" name="dy_xch_aply_st_dt" dataformat="ymd" maxlength="10" type="text" /><button class="calendar ir" name="btn_opn_dt_cal_1" id="btn_opn_dt_cal_1" type="button"></button></td>
					<td></td>
					<td></td>
				</tr>
				<tr class="h23">
					<th>Actual Payer Code</th>
					<td><input id="act_cust_cd" style="width: 80px; ime-mode:disabled; text-align:center;" class="input" name="act_cust_cd" value="" maxlength="8" dataformat="engup" type="text" /><button class="input_seach_btn" name="btn_com_ens_042" id="btn_com_ens_042" type="button"></button></td>
					<th>Person In Charge</th>
					<td><input id="cntc_pson_nm" style="width: 100px;" class="input" value="" name="cntc_pson_nm" maxlength="50" type="text" /></td>
					<th>Invoicing Currency</th>
					<td><script type="text/javascript">ComComboObject('inv_iss_curr_tp_cd', 2, 100, 1, 0 ,0 ,false)</script></td>
					<td></td>
					<td></td>
				</tr>		
				<!--tr class="h23">
					<th>Payment Date1</th>
					<td><input id="pay_dt_dy1" style="width: 80px; ime-mode:disabled; text-align:right;" class="input" value="" name="pay_dt_dy1" dataformat="num" maxlength="2" type="text" /> </td>
					<th>Payment Date2</th>
					<td><input id="pay_dt_dy2" style="width: 100px; ime-mode:disabled; text-align:right;" class="input" value="" name="pay_dt_dy2" dataformat="num" maxlength="2" type="text" /> </td>
					<th>Payment Date3</th>
					<td><input id="pay_dt_dy3" style="width: 80px; ime-mode:disabled; text-align:right;" class="input" value="" name="pay_dt_dy3" dataformat="num" maxlength="2" type="text" /> </td>
					<th>Payment Date4</th>
					<td><input id="pay_dt_dy4" style="width: 80px; ime-mode:disabled; text-align:right;" class="input" value="" name="pay_dt_dy4" dataformat="num" maxlength="2" type="text" /> </td>
					<td></td>
				</tr-->	
				<tr class="h23">
					<th>Collection Method</th>
					<td><script type="text/javascript">ComComboObject('pay_div_cd', 2, 80, 1, 0 ,0 ,false)</script></td>
					<th>Bank Account Number</th>
					<td><input id="bank_acct_no" style="width: 100px; ime-mode:disabled" class="input" value="" name="bank_acct_no" maxlength="30" dataformat="eng" otherchar="-" type="text" /> </td>
					<th>Remark</th>
					<td colspan="3"><input id="cr_cust_rmk" style="width: 359px;" class="input" value="" name="cr_cust_rmk" maxlength="100" type="text" /> </td>
				</tr>	
			</tbody>
		</table>
	</div>	
	<table class="line_bluedot"><tr><td colspan="6"></td></tr></table>
	<div class="opus_design_inquiry wFit">	
		<table>
			<tbody>
				<colgroup>
					<col width="100px"/>
					<col width="520px"/>
					<col width="70px"/>
					<col width="100px"/>
					<col width="*" />
				</colgroup>
				<tr class="h23">
					<th>Local Name</th>
					<td><input id="locl_nm" style="width: 400px;" class="input" value="" name="locl_nm" maxlength="100" type="text" /> </td>
					<th>Local Zip Code</th>
					<td><input id="locl_zip_cd" style="width: 400px;" class="input" value="" name="locl_zip_cd" maxlength="10" type="text" /> </td>
					<td></td>
				</tr>
				<tr class="h23">	
					<th>Local Address 1</th>
					<td><input id="locl_addr1" style="width: 400px;" class="input" value="" name="locl_addr1" maxlength="200" type="text" /> </td>
					<th>Local Address 2</th>
					<td><input id="locl_addr2" style="width: 400px;" class="input" value="" name="locl_addr2" maxlength="200" type="text" /> </td>
					<td></td>
				</tr>	
				<tr class="h23">
					<th>Local Address 3</th>
					<td><input id="locl_addr3" style="width: 400px;" class="input" value="" name="locl_addr3" maxlength="200"  type="text" /> </td>
					<th>Local Address 4</th>
					<td><input id="locl_addr4" style="width: 400px;" class="input" value="" name="locl_addr4" maxlength="200"  type="text" /> </td>
					<td></td>
				</tr>		
			</tbody>
		</table>
		
		<table>
			<tbody>
				<colgroup>
					<col width="100px"/>
					<col width="300px"/>
					<col width="70px"/>
					<col width="307px"/>
					<col width="70px"/>
					<col width="100px"/>
					<col width="*" />
				</colgroup>
				<tr class="h23">
					<th>Owner Name</th>
					<td><input id="ownr_nm" style="width: 200px;" class="input" value="" name="ownr_nm" maxlength="50" type="text" /> </td>
					<th>Business Category</th>
					<td><input id="bzct_nm" style="width: 200px;" class="input" value="" name="bzct_nm" maxlength="50" type="text" /> </td>
					<th>Business Type</th>
					<td><input id="bztp_nm" style="width: 206px;" class="input" value="" name="bztp_nm" maxlength="100" type="text" /> </td>
					<td></td>
				</tr>
			</tbody>
		</table>
	</div>
	<table class="line_bluedot"><tr><td colspan="6"></td></tr></table>
	<div class="opus_design_inquiry wFit">	
		<table>
        	<colgroup>
                <col width="100"/>
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
                        <select style="width:110px;" name="delt_flg" class="input" id="delt_flg">
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
		
		<table style="display: none"> 
			<colgroup>
					<col width="30px"/>
					<col width="70px"/>
					<col width="180px"/>
					<col width="*" />
			</colgroup>
			<tr>
				<th>INPUT Flag</th>
				<td><input id="input_flg" name="input_flg" style="width: 500px;" class="input1" value="" type="text" /> </td>
			</tr>	
		</table>
	</div>
</div>
<!-- opus_design_inquiry(E) -->
<div class="wrap_result">
<!-- opus_design_grid(S) -->
       <div class="opus_design_grid wFit" style="display: none;">
		<script type="text/javascript">ComSheetObject('sheet1');</script>
       </div>
<!-- opus_design_grid(E) -->
</div>
</form>