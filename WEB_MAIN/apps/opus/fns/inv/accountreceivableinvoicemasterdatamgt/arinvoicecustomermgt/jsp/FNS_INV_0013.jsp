<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0013.jsp
*@FileTitle  : Customer Information 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemasterdatamgt.arinvoicecustomermgt.event.FnsInv0013Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.framework.component.util.StringUtil" %>
<%
	FnsInv0013Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			
	String strErrMsg = "";						
	int rowCount	 = 0;						
	
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMasterDataMgt.ARInvoiceCustomerMgt");
	
	String cust_cnt_cd = StringUtil.xssFilter(request.getParameter("cust_cnt_cd"));
	if(cust_cnt_cd == null){
		cust_cnt_cd = "";
	}
		
	String cust_seq = StringUtil.xssFilter(request.getParameter("cust_seq"));
	String read_only = "readonly";
	if(cust_seq == null || cust_seq.equals("")){
		cust_seq = "";
		read_only = "";
	}
	
	String pop_yn = StringUtil.xssFilter(request.getParameter("pop_yn"));	
	if(pop_yn == null){
		pop_yn = "";		
	}
	
	String ret_yn = StringUtil.xssFilter(request.getParameter("ret_yn"));	
	if(ret_yn == null){
		ret_yn = "";		
	}
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
	   
	   
		event = (FnsInv0013Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
		
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		
	}catch(Exception e) {
		out.println(e.toString());
	}
%>
<style>
    /* Author : Gabin Kim (Publisher) 201407 */
    .tableInputWidth input {width:100%}
    .opus_design_data .grid_2 th {
    	font-weight: bold;
    }
</style>
<script type="text/javascript">
	$(".header_fixed").css("display","none");
	$(".btn_gnb_hide").css("display","none");
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			showErrMessage(errMessage);
		} // end if
		loadPage();
	}
</script>
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="frm_cust_cr_due_dt_div_cd" id="frm_cust_cr_due_dt_div_cd" />
<input type="hidden" name="pop_yn" value="<%=pop_yn%>" id="pop_yn" />
<input type="hidden" name="frm_delt_flg" id="frm_delt_flg" />
<div class="layer_popup_title">
<!-- page_title_area(S) -->
<div class="page_title_area clear">
	
	<!-- page_title(S) -->
    <!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
   		<%if(pop_yn.equals("Y")){%>
			<h2 class="page_title" style=" padding-left: 0px;padding-right: 390px;"><span>Customer Information Inquiry</span></h2>
		<%}else{%>
			<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
		<%} %>
		
	<!-- page_title(E) -->
	
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn"><!-- 
		 --><%if(ret_yn.equals("")){%><!-- 
				 --><button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!-- 
		 --><%}%><!-- 
		 --><%if(ret_yn.equals("") && cust_seq.equals("")){%><!-- 
				 --><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!-- 
		 --><%}%><!-- 
		 --><%if(pop_yn.equals("Y")){%><!-- 
			 --><button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button><!-- 
		 --><% } %>
	</div>
	<!-- opus_design_btn(E) -->
</div>
<!-- page_title_area(E) -->
</div>
<div class="layer_popup_contents" style="overflow:hidden">
<!-- wrap_search(S) -->
<div class="wrap_search">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry wFit">
		<table>
			<colgroup>
	            <col width="65" />
	            <col width="400" />
	            <col width="180" />
			</colgroup>
			<tbody>
				<tr>
					<th>Customer</th>
					<td><!-- 
                         --><input type="text" name="frm_cust_cnt_cd" id="frm_cust_cnt_cd" class="input1 align_center" style="width:30px;ime-mode:disabled" dataformat="enguponly" onKeyup="moveNext('frm_cust_cnt_cd','frm_cust_seq',2);" maxlength="2" value="<%=cust_cnt_cd%>" <%=read_only%> />-&nbsp;<!-- 
						 --><input type="text" name="frm_cust_seq" id="frm_cust_seq" class="input1 align_center" style="width:60px; text-align:center;" style="ime-mode:disabled" dataformat="num" value="<%=cust_seq%>" maxlength="6" <%=read_only%> onblur="obj_focusout()"><!-- 
						 --><input type="text" name="frm_cust_lgl_eng_nm" id="frm_cust_lgl_eng_nm" style="width:250px;" readonly />
					</td>
					<th>Tax Payer ID/Registry No</th>
					<td>
					   <input type="text" name="frm_cust_rgst_no" id="frm_cust_rgst_no" class="input1 align_center" style="width:130px" dataformat="engup" maxlength="14" value=""  <%=read_only%> />
					   <span id="del_flg" class="pad_left_12" style="display:none;color:red">Deleted Customer</span>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
	<!-- opus_design_inquiry(E) -->
</div>
<!-- wrap_search(E) -->

<!-- wrap_result(S) -->
<div class="wrap_result">
    <!-- grid2(S) :: Address -->
  	<div class="opus_design_data">
  		<table class="grid_2">
	        <colgroup>
	            <col width="90" />
	            <col width="135" />
	            <col width="90" />
	            <col width="135" />
	            <col width="90" />
	            <col width="135" />
	            <col width="90" />
	            <col width="*" />
	        </colgroup>
	        <tbody>
	            <tr>
	                <th>Address</th>
	                <td colspan="7"><input type="text" name="frm_bzet_addr" class="align_left" style="width:100%" readonly="readonly" /></td>
	            </tr>
	            <tr>
	                <th>Country</th>
	                <td><input type="text" name="frm_cnt_cd" style="width: 100%;" readonly="readonly" /></td> 
	                <th>State</th> 
	                <td><input type="text" name="frm_ste_nm" style="width: 100%;" readonly="readonly" /></td> 
	                <th>City</th>
	                <td><input type="text" name="frm_cty_nm" style="width: 100%;" readonly="readonly" /></td> 
	                <th>Zip Code</th>
	                <td><input type="text" name="frm_zip_cd" style="width: 100%;" readonly="readonly" /></td>
	            </tr>
	            <tr>
	                <th>TEL No.</th> 
	                <td><input type="text" name="frm_phn_no" style="width: 100%;" readonly="readonly" /></td> 
	                <th>Fax No.</th>
	                <td><input type="text" name="frm_fax_no" style="width: 100%;" readonly="readonly" /></td> 
	                <th>Sales Office</th>
	                <td colspan="3" class="align_left"><input type="text" name="frm_ofc_cd" style="width: 100%;" readonly="readonly" /></td>
	            </tr>
	            <tr>
	                <th>Remark(s)</th>
	                <td colspan="7" class="align_left"><input type="text" class="align_left" name="frm_cust_rmk" style="width:100%" readonly="readonly" /></td>
	            </tr>
	        </tbody>
	    </table>
  	</div>
    <!-- grid2(E) :: Address -->

	<div class="line_bluedot"></div>

	<!-- grid2(S) :: CRD CUR -->
	<div class="opus_design_data" >
		<table class="grid_2">
	        <colgroup>
	            <col width="110" />
	            <col width="80" />
	            <col width="105" />
	            <col width="100" />
	            <col width="60" />
                <col width="70" />
	            <col width="80" />
	            <col width="80" />
	            <col width="80" />
	            <col width="*" />
	        </colgroup>
	        <tbody>
	            <tr>
	                <th><strong>Credit Cur.</strong></th>
	                <td><input type="text" name="frm_cr_curr_cd" readonly="readonly" style="width: 100%;" /></td>
	                <th><strong>Credit Limit</strong></th>
	                <td><input type="text" name="frm_cr_amt" class="align_right" readonly="readonly" style="width: 100%;" /></td>
	                <th colspan="2">Credit FM/TO</th>
	                <td><input type="text" name="frm_cr_st_dt" readonly="readonly" style="width: 100%;" /></td>
	                <td class="align_left"><input type="text" name="frm_cr_end_dt" style="width: 100%;" readonly="readonly" /></td>
	                <th>Credit Office</th>
	                <td><input type="text" name="frm_cr_clt_ofc_cd" readonly="readonly" /></td>
	            </tr>
	            <tr>
	                <th>I/B Credit Term</th>
	                <td><input type="text" name="frm_ib_cr_term_dys" readonly="readonly" style="width: 100%;"/></td>
	                <th>O/B Credit Term</th>
	                <td><input type="text" name="frm_ob_cr_term_dys" readonly="readonly" style="width: 100%;"/></td>
	                <th>RLS CNTL</th>
	                <td><input type="text" name="frm_cust_rlse_ctrl_flg" readonly="readonly" style="width: 100%;"/></td>
					<th>PSN In CHG</th>
	                <td><input type="text" name="frm_cntc_pson_nm" readonly="readonly" style="width: 100%;"/></td>
	                <th>Hide Due Date <br />in Invoice</th>
	                <td><input type="text" name="frm_inv_due_dt_dp_flg" readonly="readonly" /></td>
	            </tr>
	            <tr>
	                <th>Actual Payer</th>
	                <td><input type="text" name="frm_act_cust_cnt_cd" readonly="readonly" style="width: 100%;"/></td>
	                <th>O/B E-mail</th>
	                <td><input type="text" name="frm_ob_eml" readonly="readonly" style="width: 100%;"/></td>
	                <th>I/B E-mail</th>
	                <td colspan="2"><input type="text" name="frm_ib_eml" readonly="readonly" style="width: 100%;"/></td>
	                <th style="width:110px" colspan="2">Ex. Rate Div/Basis</th>
	                <td style="width:140px">
	                    <a onmousemove="msgmove('1')" onmouseover="msgset('1');return true;" onmouseout="msghide('1');return true;" style="text-decoration:none"><!-- 
	                     --><input type="text" name="frm_xch_rt_div_cd" style="width:50px" readonly="readonly" />
	                    </a>/&nbsp;<a onmousemove="msgmove('2')" onmouseover="msgset('2');return true;" onmouseout="msghide('2');return true;" style="text-decoration:none"><!-- 
	                     --><input type="text" name="frm_cng_indiv_cd" style="width:50px" readonly="readonly" />
	                    </a>
	                </td>
	            </tr>
	     	</table>
	     	<table class="grid_2">
	     		<colgroup>
		            <col width="110" />
		            <col width="80" />
		            <col width="105" />
		            <col width="100" />
		            <col width="60" />
	                <col width="70" />
		            <col width="80" />
		            <col width="80" />
		            <col width="80" />
		            <col width="*" />
		        </colgroup>
	            <tr>
	                <th>Remark(s)</th>
	                <td colspan="6" class="align_left"><input type="text" class="align_left" name="frm_cr_cust_rmk" readonly="readonly" style="width: 100%;"/></td>
	                <td rowspan="8" colspan="3" style="background-color:#fff!important; text-align: center;">
	                    <div style="padding-left:10px">
	                        <!-- grid(S) :: Issue -->
	                        <table class="grid2 mar_btm_12" style="width:250px;">
		                        <thead>
	                                <tr>
	                                    <th>Issue</th>
	                                </tr>
		                        </thead>
	                            <tbody>
	                                <tr>
	                                    <td class="pad_4"><input type="text" name="frm_iss_div_cd" class="align_center" readonly="readonly" style="width: 100%;"/></td>
	                                </tr>
	                            </tbody>
	                        </table>
	                        <!-- grid(E) :: Issue -->
	                        
	                        <!-- grid(S) :: Credit DIV -->
	                        <table class="grid2 mar_btm_12" style="width:250px;">
	                            <thead>
		                            <tr>
	                                    <th>Credit DIV</th>
		                            </tr>
	                            </thead>
	                            <tbody>
	                                <tr>
	                                    <td class="pad_4">
	                                        <input type="radio" name="frm_cust_cr_due_dt_div_cd1" id="issue_radio_01" style="width:auto" disabled="disabled" /><!-- 
	                                     --><label for="issue_radio_01" class="mar_rgt_12">S/A Date</label><!-- 
	                                     --><input type="radio" name="frm_cust_cr_due_dt_div_cd2" id="issue_radio_02" style="width:auto" disabled="disabled" /><!-- 
	                                     --><label for="issue_radio_02">Issue Date</label> 
	                                    </td>
	                                </tr>
	                            </tbody>
	                        </table>
	                        <!-- grid(E) :: Credit DIV -->
	                        
	                        <!-- grid(S) :: Payment Day -->
	                        <table class="grid2" style="width:250px;">
	                            <thead>
	                                <tr>
	                                    <th colspan="4">Payment Day</th>
	                                </tr>
	                            </thead>
	                            <tbody>
	                                <tr>
	                                    <td><input type="text" name="frm_pay_dt_dy1" class="align_center" style="width:50px;" readonly="readonly" /></td>
	                                    <td><input type="text" name="frm_pay_dt_dy2" class="align_center" style="width:50px;" readonly="readonly" /></td>
	                                    <td><input type="text" name="frm_pay_dt_dy3" class="align_center" style="width:50px;" readonly="readonly" /></td>
	                                    <td><input type="text" name="frm_pay_dt_dy4" class="align_center" style="width:50px;" readonly="readonly" /></td>
	                                </tr>
	                            </tbody>
	                        </table>
	                        <!-- grid(E) :: Payment Day -->
	                    </div>
	                </td>
	            </tr>
	            <tr>
	                <th>COL Method</th>
	                <td colspan="2">
	                    <input type="text" name="frm_pay_div_cd" readonly="readonly" style="width: 100%;"/>
	                </td>
	                <th>Cust. ACCT No.</th>
	                <td colspan="3">
	                    <input type="text" name="frm_bank_acct_no" readonly="readonly" style="width: 100%;"/>
	                </td>
	            </tr>
	            <tr>
	                <th>Owner</th>
	                <td colspan="2"><input type="text" name="frm_ownr_nm" readonly="readonly" style="width: 100%;"/></td>
	                <th colspan="2">Tax Payer ID/Registry No.</th>
	                <td colspan="2"><input type="text" name="frm_tva_no" readonly="readonly" style="width: 100%;"/></td>
	            </tr>
	            <tr>
	                <th>Biz Kind</th>
	                <td colspan="3" class="align_left"><input type="text" name="frm_bzct_nm" class="align_left" style="width: 100%;" readonly="readonly" /></td>
	                <th>Biz Item</th>
	                <td colspan="2" class="align_left"><input type="text" name="frm_bztp_nm" class="align_left" style="width: 100%;" readonly="readonly" /></td>
	            </tr>
	            <tr>
	                <th>Local Name</th>
	                <td colspan="3" class="align_left"><input type="text" name="frm_locl_nm" class="align_left" style="width: 100%;" readonly="readonly" /></td>
	                <th>CO./PRV</th>
	                <td colspan="2"><input type="text" name="frm_indiv_corp_div_cd" readonly="readonly" style="width: 100%;"/></td>
	            </tr>
	            <tr>
	                <th rowspan="2">Local Address</th>
	                <td colspan="3" class="align_left"><input type="text" name="frm_locl_addr1" class="align_left" style="width: 100%;" readonly="readonly" /></td>
	                <td colspan="3" class="align_left"><input type="text" name="frm_locl_addr2" class="align_left" style="width: 100%;" readonly="readonly" /></td>
	            </tr>
	            <tr>
	                <td colspan="3" class="align_left"><input type="text" name="frm_locl_addr3" class="align_left" style="width: 100%;" readonly="readonly" /></td>
	                <td colspan="3" class="align_left"><input type="text" name="frm_locl_addr4" class="align_left" style="width: 100%;" readonly="readonly" /></td>
	            </tr>
	            <tr>
	                <th>Cust Type</th>
	                <td colspan="2"><input type="text" name="frm_cr_cust_tp_cd" readonly="readonly" style="width: 100%;"/></td>
	                <th>KOR I/B OFC</th>
	                <td colspan="3"><input type="text" name="frm_kr_ib_ofc_cd" readonly="readonly" style="width: 100%;"/></td>
	            </tr>
	            <tr>
	                <th>LCL Zip Code</th>
	                <td colspan="2"><input type="text" name="frm_locl_zip_cd" readonly="readonly" style="width: 100%;"/></td>
	                <th>LCL TEL No.</th>
	                <td colspan="2"><input type="text" name="frm_ob_phn_no" readonly="readonly" style="width: 100%;"/></td>
	                <th style="width:120px">LCL Fax No.</th>
	                <td colspan="4"><input type="text" name="frm_ob_fax_no" readonly="readonly" style="width: 100%;"/></td>
	            </tr>
	            <tr>
	                <th>Kind of SECU</th>
	                <td colspan="2">
	                    <input type="text" name="frm_cust_scr_div_cd" readonly="readonly" style="width: 100%;"/>
	                </td>
	                <th>SECU AMT</th>
	                <td colspan="2">
	                    <input type="text" name="frm_cust_scr_locl_amt" class="align_right" readonly="readonly" style="width: 100%;"/></td>
	                <th>SECU FM/TO</th>
	                <td class="align_left"><input type="text" name="frm_scr_st_dt" style="width:160px;" readonly="readonly" /></td>
	                <td colspan="2" class="align_left"><input type="text" name="frm_scr_end_dt" style="width:160px;" readonly="readonly" /></td>
	            </tr>
	        </tbody>
	    </table>
	</div>
	<!-- grid2(E) :: CRD CUR -->
</div>
<!-- wrap_result(E) -->

<div style="display:none">
<!-- Grid (S) -->
	<script type="text/javascript">ComSheetObject('sheet1');</script>
<!-- Grid (E) -->
</div>
<div id="msg" style="position:absolute;left:0;top:0;width:0;height:0;"></div>
<!-- page(E) -->
</div>
</form>