<%
/**
 * Copyright(c) 2014 CyberLogitec
 * @FileName : FNS_INV_0050.jsp
 * @FileTitle : Customer Preferable Report
 * Open Issues :
 * Change history : 
 * @LastModifyDate : 
 * @LastModifier : 
 * @LastVersion : 1.0
 * 2014.11.11 박성용
 * 1.0 Creation
 */
%>

<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.clt.framework.component.util.JSPUtil" %>
<%@ page import="com.clt.framework.component.util.DateTime" %>
<%@ page import="com.clt.framework.component.message.ErrorHandler" %>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse" %>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys" %>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount" %>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.arinvoiceinquiry.event.FnsInv0050Event" %>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsInv0050Event  event = null;         // PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;    // 서버에서 발생한 에러
	String strErrMsg = "";                 // 에러메세지
	int rowCount = 0;                      // DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMgt.ARInvoiceInquiry");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsInv0050Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// 초기화면 로딩시 서버로부터 가져온 데이터 추출하는 로직추가 ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<script type="text/javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			showErrMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd">
<input type="hidden" name="pagerows" id="pagerows">
<!-- 개발자 작업	-->
<input type="hidden" name="cntr_no_yn" id="cntr_no_yn">
<input type="hidden" name="chg_cd_yn" id="chg_cd_yn">
<input type="hidden" name="save_yn" id="save_yn">
<input type="hidden" name="usr_id" id="usr_id" value="<%=strUsr_id%>">
<input type="hidden" name="com_mrdPath" id="com_mrdPath">
<input type="hidden" name="com_mrdArguments" id="com_mrdArguments">
<input type="hidden" name="com_mrdBodyTitle" id="com_mrdBodyTitle">
<input type="hidden" name="com_mrdTitle" id="com_mrdTitle">
<input type="hidden" name="cTmplItem" id="cTmplItem">
<input type="hidden" name="bl_no" id="bl_no">
<input type="hidden" name="bl_nos" id="bl_nos">
<input type="hidden" name="bkg_no" id="bkg_no">
<input type="hidden" name="rect_top" id="rect_top">
<input type="hidden" name="rect_left" id="rect_left">
<input type="hidden" name="sheet_bl_no_row_chk" id="sheet_bl_no_row_chk">
<input type="hidden" name="tmplt_ofc_cd" id="tmplt_ofc_cd" value="">
<input type="hidden" name="select_tmplt" id="select_tmplt" value="">
<input type="hidden" name="change_tmplt" id="change_tmplt" value="N">
<input type="hidden" name="cust_cnt_cd" id="cust_cnt_cd">
<input type="hidden" name="cust_seq" id="cust_seq">  		
<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" name="btn_retrieve" id="btn_retrieve" type="button">Retrieve</button><!--
		--><button class="btn_normal" name="btn_new" id="btn_new" type="button">New</button><!--
		--><button class="btn_normal" name="btn_downExcel" id="btn_downExcel" type="button">Down Excel</button><!--
		--><button class="btn_normal" name="btn_report" id="btn_report" type="button">View Last Report</button><!--
		--><button class="btn_normal" name="btn_template" id="btn_template" type="button">Create Template</button><!--
		--><button class="btn_normal" name="btn_preview" id="btn_preview" type="button">B/L Preview</button><!--
		--><button class="btn_normal" name="btn_save" id="btn_save" type="button">Save</button><!--
		--></div>
	<!-- opus_design_btn (E) -->

	<!-- page_location(S) -->
	<div class="location">	
		<span id="navigation"></span>
	</div>
	<!-- page_location(E) -->
</div>
<!-- page_title_area(E) -->
<!-- wrap_search(S) -->
<div class="wrap_search ">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry">
		<table>
			<tbody>
				<colgroup>
					<col width="100" />
					<col width="440" />
					<col width="100" />
					<col width="*" />
				</colgroup>
				<tr>
					<th>Template Name</th>   
					<td><script type="text/javascript">ComComboObject('rpt_tmplt_nm', 2, 200, 1, 1, 0, true);</script></td>
					<th>Payment Term</th> 
					<td>
						<select name="frt_term_cd" id="frt_term_cd" style="width:80px;" class="input">
							<option value="A" >All</option>
							<option value="P" >PrePaid</option>
							<option value="C" selected>Collect</option>
						</select>
					</td>
				</tr>
			</tbody>
		</table>
		<table>
			<tbody>
				<colgroup>
					<col width="100" />
					<col width="200" />
					<col width="70" />
					<col width="200" />
					<col width="70" />
					<col width="*" />
				</colgroup>
				<tr>
					<th>S/C No.</th>   <!-- AEN20931 US039061 CN 046444 S--> <!-- AEN21823 HJNA0069E-->
					<td><input type="text" name="sc_no" id="sc_no" value ="" style="width:80px;" class="input" dataformat="engup" maxlength="9" onChange="sc_no_OnChange()"></td>
					<th>RFA No.</th>  
					<td><input type="text" name="rfa_no" id="rfa_no" value ="" style="width:90px;" class="input" dataformat="engup" maxlength="11" onChange="rfa_no_OnChange()"></td> 
					<th>Customer</th>   
					<td>
						<select name="cust_gb" id="cust_gb" style="width:135px;" class="input">
							<!-- option value="" selected></option>-->
							<option value="S">Shipper</option>
							<option value="C">Consignee</option> 
							<option value="N">Notify</option>
							<option value="F">Forwarder</option>
							<option value="GS">Group Cust - Shpr</option>
							<option value="GC">Group Cust - Cnee</option>
							<option value="P">Payer (Customer)</option>
						</select> 
						<input type="text" style="width:95px;" class="input" name="cust_cd" maxlength="95" dataformat="engup" otherchar="," id="cust_cd" /><button type="button" id="btns_multicust" name="btns_multicust" class="multiple_inq ir"></button><button type="button" id="btns_cust" name="btns_cust" class="input_seach_btn"></button><input type="text" style="width: 260px;" class="input" name="cust_nm" id="cust_nm" readonly tabindex="-1">
					</td>
				</tr>
			</tbody>
		</table>
		<table>
			<tbody>
				<colgroup>
					<col width="100" />
					<col width="200" />
					<col width="70" />
					<col width="130" />
					<col width="30" />
					<col width="*" />
				</colgroup>
				<tr>
					<th>Date</th>   
					<td>
						<select name="date_gb" id="date_gb" style="width:140px;" class="input">
						    <option value="1STVVD" >First POL ETD</option>
							<option value="OBD" selected>Onboard Date</option>
							<option value="ETD">T.VVD - POL - ETD</option>
							<option value="ETA">T.VVD - POD - ETA</option>
							<option value="PCD">Port Close Date</option>
							<option value="BDR">BDR</option>
							<option value="IVD">Invoice Date</option>
							<option value="IFD">I/F Date</option>
							<!-- <option value="DEL">DEL - ETA</option> 불필요한 값 삭제 처리. by Sang-Hyun Kim 2012.04.10 -->
						</select>
					</td>
					<th>From</th>   
					<td><input type="text" name="from_date" id="from_date" style="width:90px;" class="input" dataformat="ymd" maxlength="8" caption="start date" cofield="to_date"><button type="button" id="btns_from_dt" name="btns_from_dt" class="calendar ir"></button></td>
					<th>To</th>   
					<td><input type="text" name="to_date" id="to_date" style="width:90px;" class="input" dataformat="ymd" maxlength="8" caption="end date" cofield="from_date"><button type="button" id="btns_to_dt" name="btns_to_dt" class="calendar ir"></button></td>
				</tr>
			</tbody>
		</table>
		<table>
			<tbody>
				<colgroup>
					<col width="100" />
					<col width="200" />
					<col width="70" />
					<col width="273" />
					<col width="60" />
					<col width="*" />
				</colgroup>
				<tr>
					<th>Trunk VVD</th>   
					<td><input type="text" name="vvd" id="vvd" style="width:120px;" class="input" style="ime-mode:disabled" dataformat="engup" maxlength="9"></td>
					<th>POR/POL</th>  
					<td><input type="text" name="por_cd" id="por_cd" style="width:90px;" class="input" style="ime-mode:disabled" dataformat="engup" maxlength="5">
					/ <input type="text" name="pol_cd" id="pol_cd" style="width:90px;" class="input" style="ime-mode:disabled" dataformat="engup" maxlength="5">
					</td>   
					<th>POD/DEL</th>  
					<td><input type="text" name="pod_cd" id="pod_cd" style="width:90px;" class="input" style="ime-mode:disabled" dataformat="engup" maxlength="5">
					/ <input type="text" name="del_cd" id="del_cd" style="width:90px;" class="input" style="ime-mode:disabled" dataformat="engup" maxlength="5">
					</td>    
				</tr>
			</tbody>
		</table>
		<table>
			<tbody>
				<colgroup>
					<col width="100" />
					<col width="198" />
					<col width="70" />
					<col width="278" />
					<col width="55" />
					<col width="130" />
					<col width="*" />
				</colgroup>
				<tr>
					<th>BKG Office</th>   
					<td><input type="text" name="bkg_ofc_cd" id="bkg_ofc_cd" style="width:120px;" class="input" style="ime-mode:disabled" dataformat="engup" maxlength="6"></td>
					<th>Sales Office</th>  
					<td><input type="text" name="ob_sls_ofc_cd" id="ob_sls_ofc_cd" style="width:90px;" class="input" style="ime-mode:disabled" dataformat="engup" maxlength="6"></td>  
                    <th>B/L No.</th>
                    <td valign="top" id="td_bl_no">
                    	<div id="bl_input" style="display:block"> 
                        	<input type="text" name="input_bl_no" id="input_bl_no" style="width:123px;" class="input1" value="" maxlength="12" dataformat="engup"  >
                      	</div>
                      	<!-- <div id="bl_sheet" style="display:none;width:123px;height:150px;position:absolute;left:0px;top:0px;"> --> 
                      	<div id="bl_sheet" style="display:none;width:123px;height:150px;position:absolute;">
                        	<script type="text/javascript">ComSheetObject('sheet3');</script>
                      	</div>
                    </td>
                    <td><button type="button" id="btn_input_bl_no" name="btn_input_bl_no" class="btn_etc">Multi B/L No.</button></td> 	
				</tr>
			</tbody>
		</table>
	</div>
	<!-- opus_design_inquiry(E) -->
</div>
<!-- wrap_search(E) -->

<!-- wrap_result(S) -->
<div class="wrap_result">
    <!-- opus_design_grid(S) -->
    <div class="opus_design_grid">
        <script type="text/javascript">ComSheetObject('sheet1');</script>
    </div>
    <div class="opus_design_grid" style="display:none">
        <script type="text/javascript">ComSheetObject('sheet2');</script>
    </div>
    <!-- opus_design_grid(E) -->

    <!-- opus_design_inquiry(S) -->
    <div class="opus_design_inquiry">
        <!--  biz_1 (S) -->
        <div style="float: right">
	        <table>
	            <tbody>
	                <tr>
	                    <th>Report ID</th>
	                    <td><input type="text" name="cust_rpt_id" id="cust_rpt_id" style="width:120px;" class="input2" readonly></td>
	                </tr>
	            </tbody>
	        </table>
        </div>
        <!--  biz_1   (E) -->   
    </div>
    <!-- opus_design_inquiry(E) -->
</div>
<!-- wrap_result(E) -->

</form>