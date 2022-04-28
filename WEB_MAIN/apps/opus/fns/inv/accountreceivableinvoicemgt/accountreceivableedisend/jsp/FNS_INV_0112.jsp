<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : FNS_INV_0112.jsp
*@FileTitle :  EDI 310 Invoicing
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
* 2014.11.21 박성용
* 1.0 Creation
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemgt.accountreceivableedisend.event.FnsInv0112Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsInv0112Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.opus.apps.AccountReceivableInvoiceMgt.AccountReceivableEDISend");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsInv0112Event)request.getAttribute("Event");
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
<input type="hidden" name="pagetype" id="pagetype" value = "I">
<input type="hidden" name="ar_ofc_cd" id="ar_ofc_cd">
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
		--><button class="btn_normal" name="btn_edi" id="btn_edi" type="button">Send EDI</button><!--
		--><button class="btn_normal" name="btn_excel" id="btn_excel" type="button">Down Excel</button><!--
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
					<col width="90" />
					<col width="425" />
					<col width="60" />
					<col width="200" />
					<col width="210" />
					<col width="*" />
				</colgroup>
				<tr>
					<th>SC/RFA No</th>
	                <td>
	                	<select name="cntc_tp_cd" id="cntc_tp_cd" class="input1" style="width:95px;">
				        	<option value="S" selected>S/C No</option>
					        <option value="R">RFA No</option>
                        </select><!-- 
                        --><input type="text" style="width:140px;" class="input1" name="sc_rfa_no" dataformat="engup" otherchar="," maxlength="100" id="sc_rfa_no" /><!-- 
                        --><button type="button" id="btns_multiscrfano" name="btns_multiscrfano" class="multiple_inq ir"></button>
                 	</td>
                 	<th>Source</th> 
					<td class="sm" align="center">
						<input type="radio" name="source_cd" id="source_cd" value="ALL" class="trans" checked>&nbsp;ALL&nbsp;&nbsp;
					    <input type="radio" name="source_cd" id="source_cd" value="BKG" class="trans" >&nbsp;BKG&nbsp;&nbsp;
					    <input type="radio" name="source_cd" id="source_cd" value="DMT" class="trans" >&nbsp;DEM/DET 
					</td>
	                <th>Office</th>
	                <td><script type="text/javascript">ComComboObject('inv_ofc_cd', 1, 80, 1, 1);</script></td>
				</tr>
			</tbody>
		</table>
		<table>
			<tbody>
				<colgroup>
					<col width="90" />
					<col width="400" />
					<col width="85" />
					<col width="155" />
					<col width="50" />
					<col width="135" />
					<col width="70" />
					<col width="*" />
				</colgroup>
				<tr>
	            	<th>Customer</th>
	               <!--  <td><input type="text" style="width:40px;" class="input" name="cust_cnt_cd" maxlength="2" dataformat="engup" id="cust_cnt_cd" /><input type="text" style="width:62px;" class="input" name="cust_seq" maxlength="6" dataformat="num" id="cust_seq" /><button type="button" id="btns_cust" name="btns_cust" class="input_seach_btn"></button><input type="text" style="width: 230px;" class="input2" name="cust_nm" id="cust_nm" readonly tabindex="-1"></td> -->
	                <td><input type="text" style="width:95px;" class="input1" name="cust_cd" maxlength="100" dataformat="engup" otherchar="," id="cust_cd" /><button type="button" id="btns_multicust" name="btns_multicust" class="multiple_inq ir"></button><button type="button" id="btns_cust" name="btns_cust" class="input_seach_btn"></button><input type="text" style="width: 230px;" class="input2" name="cust_nm" id="cust_nm" readonly tabindex="-1"></td>
		         	<th>Container No</th>
		         	<td><input type="text" style="width:140px;" class="input" name="cntr_no" dataformat="engup" maxlength="17" id="cntr_no" /></td>
		         	<th>B/L No</th>
		         	<td><input type="text" style="width:120px;" class="input" name="bl_no" dataformat="engup" maxlength="15" id="bl_no" /></td>
		         	<th>Invoice No</th>
		         	<td><input type="text" style="width:120px;" class="input" name="inv_no" dataformat="engup" maxlength="15" id="inv_no" /></td>
		         	<th>Trunk VVD</th>
	                <td><input type="text" style="width:100px;" class="input" name="tvvd_cd" dataformat="engup" maxlength="9" id="tvvd_cd" /></td>
	         	</tr>
			</tbody>
		</table>
		<table>
			<tbody>
				<colgroup>
					<col width="90" />
					<col width="105" />
					<col width="50" />
					<col width="105" />
					<col width="75" />
					<col width="255" />
					<col width="100" />
					<col width="105" />
					<col width="100" />
					<col width="*" />
				</colgroup>
	            <tr>
	              	<th>BND</th>
	                <td>
	                	<select name="io_bnd_cd" id="io_bnd_cd" class="input" style="width:80px;">
				        	<option value="A" selected>All</option>
					        <option value="O">O/B</option>
					        <option value="I">I/B</option>
                        </select>
                 	</td>	                
	                <th>BDR</th>
                   	<td>
                   		<select name="bdr_ind_flg" id="bdr_ind_flg" class="input" style="width:80px;">
				        	<option value="A" selected>All</option>
					        <option value="Y">Y</option>
					        <option value="N">N</option>
                        </select>
                   	</td>
                    <th>S/A Date</th>
                   	<td><!-- 
                   	  --><input type="text" style="width:80px;" class="input" name="sa_from_dt" dataformat="ymd" maxlength="8" cofield="sa_to_dt" caption="start date" id="sa_from_dt" /><!-- 
                      --><button type="button" id="btns_calendar1" name="btns_calendar1" class="calendar ir"></button>~&nbsp;<!-- 
                      --><input type="text" style="width:80px;" class="input" name="sa_to_dt" dataformat="ymd" maxlength="8" cofield="sa_from_dt" caption="end date" id="sa_to_dt" /><!-- 
                      --><button type="button" id="btns_calendar2" name="btns_calendar2" class="calendar ir"></button>
                    </td>
                    <th>Charge Type</th>
                    <td><script type="text/javascript">ComComboObject('chg_cd', 1, 80, 0, 0);</script></td>
                    <th>Service Scope</th>
                    <td><script type="text/javascript">ComComboObject('svc_scp_cd', 1, 80, 1, 0);</script></td>
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
    <!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->

</form>