<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : COM_CSR_0004.jsp
*@FileTitle  : Input the tax invoice
*@author     : CLT
*@version    : 1.0
*@since      : 2014/09/03
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.event.ComCsr0004Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	ComCsr0004Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//Error from server
	String strErrMsg = "";						//Error message
	int rowCount	 = 0;						//The list count of the DB ResultSet
	
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";
	
	String tax_no1 = JSPUtil.getKST("yyyyMM");

	String userId  = "";
	String ofc_cd  = "";
	String cost_ofc_cd  = "";
	String usr_eml = "";	
	String usr_nm  = "";
	String cnt_cd  = "";

	String inv_cfm_dt = ""; 
	String vndr_seq = "";
	String vndr_seq_name = ""; 	
	String cnt_inv = "";
	String curr_cd = "";
	String total_amt = "";
	String asanogb = "";
	String pay_group_cd = "";
	String iss_dt = "";
	String rcv_dt = "";
	String gen_pay_term_cd = "";
	String gen_pay_term_desc = "";
	String payment_due_dt = "";
	String pay_term_tp_cd = "";		
	//module
	String inv_sub_sys_cd = "";
	
	inv_cfm_dt 			= JSPUtil.getParameter(request, "inv_cfm_dt 		".trim(), "");	
	vndr_seq 			= JSPUtil.getParameter(request, "vndr_seq 			".trim(), "");
	vndr_seq_name 		= JSPUtil.getParameter(request, "vndr_seq_name      ".trim(), ""); 		
	cnt_inv 			= JSPUtil.getParameter(request, "cnt_inv 			".trim(), "");
	curr_cd 			= JSPUtil.getParameter(request, "curr_cd          	".trim(), ""); 
	total_amt 			= JSPUtil.getParameter(request, "total_amt 			".trim(), "");
	asanogb 			= JSPUtil.getParameter(request, "asanogb 			".trim(), "");	
	pay_group_cd 		= JSPUtil.getParameter(request, "pay_group_cd 		".trim(), "");	
	iss_dt 				= JSPUtil.getParameter(request, "iss_dt          	".trim(), ""); 
	rcv_dt 				= JSPUtil.getParameter(request, "rcv_dt          	".trim(), ""); 
	gen_pay_term_cd 	= JSPUtil.getParameter(request, "gen_pay_term_cd 	".trim(), "");
	gen_pay_term_desc 	= JSPUtil.getParameter(request, "gen_pay_term_desc	".trim(), "");
	payment_due_dt 		= JSPUtil.getParameter(request, "payment_due_dt 	".trim(), "");	
	pay_term_tp_cd 		= JSPUtil.getParameter(request, "pay_term_tp_cd 	".trim(), "");	
	cost_ofc_cd 		= JSPUtil.getParameter(request, "cost_ofc_cd 		".trim(), "");
	
	inv_sub_sys_cd 		= JSPUtil.getParameter(request, "inv_sub_sys_cd 	".trim(), "");
	
	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.ConsultationSlipRequestMgt.ConsultationSlipRequestMgt");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		
	    //userId=account.getUsr_id();
	    //userAuth=account.getAuth();	   
	    ofc_cd=account.getOfc_cd();
	    usr_eml=account.getUsr_eml();
	    cnt_cd =account.getCnt_cd();

		event = (ComCsr0004Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<script language="javascript" type="text/javascript" src="bizcommon/csr/CoCsr.js"></script>

<script language="javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
		//doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
		insertValueEvi();
	}
</script>

<form name="form">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows"> 
<input type="hidden" name="iPage">
<input type="hidden" name="tax_code">
<input type="hidden" name="comp_no">
<input type="hidden" name="inv_sub_sys_cd" value="<%=inv_sub_sys_cd%>">

<div class="layer_popup_title">
	<div class="page_title_area clear">
		<h2 class="page_title"><span>세금계산서입력화면</span></h2>
		
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btng_ok_k" id="btng_ok_k">완료</button><!-- -->
			<button type="button" class="btn_normal" name="btng_cancel_k" id="btng_cancel_k">작업취소</button><!-- -->
			<button type="button" class="btn_normal" name="btng_new_k" id="btng_new_k">다시입력</button><!-- -->
			<button type="button" class="btn_normal" name="btng_add_k" id="btng_add_k">추가</button><!--  -->
			<button type="button" class="btn_normal" name="btng_delete_k" id="btng_delete_k">삭제</button>
		</div>
	</div>
</div>

<div class="layer_popup_contents">
	<div class="wrap_search">
		<div class="opus_design_inquiry wFit">
			<table class="search">
				<tr class="h23">
					<td width="40">S/P</td>
					<td width="115">&nbsp;<input type="text" name="vndr_seq_hdr" style="width:90"></td>
					<td width="40">세액</td>
					<td width="125"><input type="text" name="vat_amt_hdr" style="width:100;text-align:right;"></td>
					<td width="60">품의금액</td>
					<td width="125"><input type="text" name="total_amt_hdr" style="width:100;text-align:right;"></td>
					<td width="40">Type</td>
					<td >&nbsp;전자계산서&nbsp;<input type="checkbox" name="attr_ctnt8" value="ELECTRONIC" class="trans" onClick="checkType(0);">&nbsp;&nbsp;종이계산서&nbsp;<input type="checkbox" name="attr_ctnt8" value="PAPER" class="trans" onClick="checkType(1);"></td>
				</tr>
			</table>
		</div>
	</div>
	<div class="wrap_result">
		<div class="layout_wrap">
			<table border="0" class="grid2" style="width:737" background-color:white;>
       				<tr>
       					<th class="tr2_head" width="137">세금계산서번호</th>
       					<td width="200" colspan="2">
						
							<table class="search">
								<tr class="h23">
									<td width="33%"><input type="text" name="tax_no1" maxlength="6" style="width:67;" value="<%=tax_no1%>" onKeyUp='isNum(this);' onKeyDown='isNum(this);csr_chkInput(this);' onBlur='validateDateObj(this);'></td>
									<td width="33%"><script language="javascript">ComComboObject('tax_no2',2,70,0,0);</script></td>
									<td><input type="text" name="tax_no3" maxlength="4" style="width:65;" value=""></td>
								</tr>
							</table>
							
						</td>
       					<th class="tr2_head" width="130" colspan="2">권번호</th>
						<td width="270" colspan="3"><input type="text" name="volume" style="width:70;" value="">&nbsp;&nbsp;권&nbsp;&nbsp;<input type="text" name="ho" style="width:70;" value="">&nbsp;&nbsp;호</td>
       					
       				</tr>
					<tr>    							
    					<th class="tr2_head">Tax구분</th>
       					<td colspan="2"><input type="radio" name="tax_flg" value="0" class="trans" disabled>&nbsp;개인&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="tax_flg" value="10" class="trans" checked>&nbsp;회사&nbsp;</td>
       					<th class="tr2_head" colspan="2">매입세액불공제</th>
						<td colspan="3"><input type="radio" name="tax_naid_flg" value="Y" class="trans">&nbsp;Yes&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="tax_naid_flg" value="N" class="trans" checked>&nbsp;No&nbsp;</td>

       				</tr>
					<tr>
       					<th class="tr2_head">흑/적자구분</th>
       					<td colspan="2"><input type="radio" name="finance_flg" value="Y" class="trans">&nbsp;흑자&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="finance_flg" value="N" class="trans">&nbsp;적자&nbsp;</td>
       					<th class="tr2_head" colspan="2">고정자산여부</th>
						<td colspan="3"><input type="radio" name="fa_flg" value="Y" class="trans">&nbsp;Yes&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="fa_flg" value="N" class="trans" checked>&nbsp;No&nbsp;</td>


       				</tr>
					<tr>
       					<th class="tr2_head">Tax Type</th>
       					<td colspan="2"><input type="radio" name="tax_type" value="0" class="trans">&nbsp;영세&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="tax_type" value="10" class="trans">&nbsp;과세&nbsp;</td>
       					<th class="tr2_head" colspan="2">의제매출분</th>
						<td colspan="3"><input type="radio" name="tax_nsl_flg" value="Y" class="trans">&nbsp;Yes&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="tax_nsl_flg" value="N" class="trans" checked>&nbsp;No&nbsp;</td>

       				</tr>
					<tr>
       					<th class="tr2_head">사업자등록번호</th>
       					<td colspan="2"><input type="text" name="comp_no1" maxlength="3" style="width:72;text-align:center;" value="" onKeyUp='isNum(this);csr_moveFocus(this, this.form.comp_no2, 3);' onKeyDown='isNum(this);csr_chkInput(this);'>&nbsp;-&nbsp;<input type="text" name="comp_no2" style="width:32;text-align:center;" value="" maxlength="2" onKeyUp='isNum(this);csr_moveFocus(this, this.form.comp_no3, 2);' onKeyDown='isNum(this);csr_chkInput(this);' >&nbsp;-&nbsp;<input type="text" name="comp_no3" style="width:72;text-align:center;" value="" maxlength="5" onKeyUp='isNum(this);' onKeyDown='isNum(this);csr_chkInput(this);' onblur='taxInfo();'></td>	<!-- onblur='taxInfo();' -->
       					<th class="tr2_head" colspan="2">Vendor Code</th>
						<td colspan="3"><input type="text" name="vndr_seq" value="" style="width:270;"></td>

       				</tr>
					<tr>
       					<th class="tr2_head">상호</th>
       					<td colspan="2"><input type="text" name="vndr_nm" style="width:196;" value=""></td>
       					<th class="tr2_head" colspan="2">대표자명</th>
						<td colspan="3"><input type="text" name="ceo_nm" style="width:270;" value=""></td>

       				</tr>
					<tr>
       					<th class="tr2_head">업태</th>
       					<td colspan="2"><input type="text" name="bzct_nm" style="width:196;" value=""></td>
       					<th class="tr2_head" colspan="2">종목</th>
						<td colspan="3"><input type="text" name="bztp_nm" style="width:270;" value=""></td>

       				</tr>
					<tr> 
       					<th class="tr2_head">주소</th>
       					<td colspan="7"><input type="text" name="vndr_addr" style="width:614;" value=""></td>

       				</tr>
					<tr>
       					<th class="tr2_head">발행일자</th>
       					<td width="100"><input type="text" name="inv_dt" maxlength="10" style="width:100;text-align:center;" value="" onKeyUp='isNum1(this);csr_isNumD(this,"Y");' onKeyDown='isNum1(this);csr_isNumD(this,"Y");' onBlur="if(validateDateObj2(this)){checkInvDt(this);}"></td>
       					<th class="tr2_head" width="100">공급가액</th>
						<td width="65"> <input type="text" name="net_amt" style="width:65;text-align:right;" value=""></td>
       					<th class="tr2_head" width="65">세액</th>
						<td width="90"> <input type="text" name="vat_amt"  style="width:90;text-align:right;" value=""></td>
						<th class="tr2_head" width="70">총합계</th>
						<td width="110"> <input type="text" name="total_amt"  style="width:102;text-align:right;" value=""></td>
       				</tr>
       		</table>
		</div>
		<script language="javascript">ComSheetObject('sheet1');</script> 
       	<script language="javascript">ComSheetObject('sheet2');</script>
	</div>
</div>

</form>

  <Script Language="javascript" for="sheet1" event="OnChange(Row,Col,Value)">   			
    		var net_amt  = 0;
     		var vat_amt  = 0;
     		var total_amt= 0;
     		var netArr = new Array();
     		var vatArr = new Array();
     		var minVatArr = new Array();
     		var maxVatArr = new Array();
				
				if(Col==4){
					if (!(document.form.vat_amt_hdr.value == 0 && document.form.tax_type[0].checked == true)){
						sheetObjects[0].CellValue2(Row, 5) = Math.round((parseFloat(sheetObjects[0].CellValue(Row,4)*100)/10)/100);								
					}
				}	
				
				if(Col==5){
						for(var i=0;i<sheetObjects[0].RowCount;i++){
							netArr[i] = sheetObjects[0].CellValue(i+1, 4);
							vatArr[i] = Math.round((parseFloat(sheetObjects[0].CellValue(i+1,4)*100)/10)/100);
							maxVatArr[i] = Math.round((parseFloat(sheetObjects[0].CellValue(i+1,4)*100)/10)/100)+10;
							minVatArr[i] = Math.round((parseFloat(sheetObjects[0].CellValue(i+1,4)*100)/10)/100)-10;							
						}								
						
						if(maxVatArr[Row-1]<sheetObjects[0].CellValue(Row, 5) || minVatArr[Row-1]>sheetObjects[0].CellValue(Row, 5)){
								showErrMessage("세액 변경 금액 기준을 초과 하였습니다. 다시 확인하세요.");						
								sheetObjects[0].CellValue2(Row, 5) = Math.round((parseFloat(sheetObjects[0].CellValue(Row,4)*100)/10)/100);
						}
				}				
     		
     		//if(Col == 4 || Col == 5){ 
 				for(var i = 0;i<sheetObjects[0].RowCount;i++){
 					net_amt = parseFloat(sheetObjects[0].CellValue(i+1,4)*100)+parseFloat(net_amt);
					vat_amt = parseFloat(sheetObjects[0].CellValue(i+1,5)*100)+parseFloat(vat_amt);
 					total_amt = parseFloat(sheetObjects[0].CellValue(i+1,6)*100)+parseFloat(total_amt);     					
 				}
     		//} 
     		    		
        document.form.net_amt.value 		= csr_addComma(net_amt/100);
        document.form.vat_amt.value 		= csr_addComma(vat_amt/100);
        document.form.total_amt.value 		= csr_addComma(total_amt/100); 
  </Script> 