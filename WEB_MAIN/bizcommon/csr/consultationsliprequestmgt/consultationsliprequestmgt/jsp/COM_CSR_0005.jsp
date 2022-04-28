<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : COM_CSR_0005.jsp
*@FileTitle  : Invoice input page
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
<%@ page import="com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.event.ComCsr0005Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	ComCsr0005Event  event = null;				//PDTO(Data Transfer Object including Parameters)
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
	
	String strUsr_id		= "";
	String strUsr_nm		= "";
	
	String inv_sub_sys_cd   = "";
	
	Logger log = Logger.getLogger("com.clt.apps.ConsultationSlipRequestMgt.ConsultationSlipRequestMgt");

	try {
		inv_sub_sys_cd 		= JSPUtil.getParameter(request, "inv_sub_sys_cd 	".trim(), "");
		
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		
	    //userId=account.getUsr_id();
	    //userAuth=account.getAuth();	   
	    ofc_cd=account.getOfc_cd();
	    usr_eml=account.getUsr_eml();
	    cnt_cd =account.getCnt_cd();

		event = (ComCsr0005Event)request.getAttribute("Event"); 
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
		<h2 class="page_title"><span>계산서입력화면</span></h2>
		
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
			<table class="search" border="0" style="width:737;">

				<tr class="h23">
					<td width="50">S/P</td>
					<td width="140">&nbsp;<input type="text" name="vndr_seq_hdr" style="width:100"></td>
					<td width="70">품의금액</td>
					<td width="140"><input type="text" name="total_amt_hdr" style="width:100;text-align:right;"></td>
					<td width="50">Type</td>
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
      					<td colspan="2"><input type="radio" value="tax_flg" class="trans" value="" disabled>&nbsp;개인&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" value="tax_flg" class="trans" value="" checked>&nbsp;회사&nbsp;</td>
      					<th class="tr2_head" colspan="2">흑/적자구분</th>
					<td colspan="3"><input type="radio" name="finance_flg" value="Y" class="trans">&nbsp;흑자&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="finance_flg" value="N" class="trans">&nbsp;적자&nbsp;</td>

      				</tr>
				<tr>
      					<th class="tr2_head">사업자등록번호</th>
      					<td colspan="2"><input type="text" name="comp_no1" maxlength="3" style="width:72;text-align:center;" value="" onKeyUp='isNum(this);csr_moveFocus(this, this.form.comp_no2, 3);' onKeyDown='isNum(this);csr_chkInput(this);'>&nbsp;-&nbsp;<input type="text" name="comp_no2" maxlength="2" style="width:32;text-align:center;" value="" onKeyUp='isNum(this);csr_moveFocus(this, this.form.comp_no3, 2);' onKeyDown='isNum(this);csr_chkInput(this);'>&nbsp;-&nbsp;<input type="text" maxlength="5" name="comp_no3" style="width:72;text-align:center;" value="" onKeyUp='isNum(this);' onKeyDown='isNum(this);csr_chkInput(this);' onblur='taxInfo();'></td>
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
      					<td colspan="7"><input type="text"  name="vndr_addr" style="width:612;" value=""></td>

      				</tr>
				<tr>
      					<th class="tr2_head">발행일자</th>
      					<td width="100"><input type="text" name="inv_dt" maxlength="10" style="width:100;text-align:center;" value="" onKeyUp='isNum1(this);csr_isNumD(this,"Y");' onKeyDown='isNum1(this);csr_isNumD(this,"Y");' onBlur="if(validateDateObj2(this)){checkInvDt(this);}"></td>
      					<th class="tr2_head" width="100">공급가액</th>
					<td width="130" colspan="2"><input type="text" name="net_amt" style="width:130;text-align:right;" value=""></td>
      					<th class="tr2_head" width="100">총합계</th>
					<td width="170" colspan="2"><input type="text" name="total_amt" style="width:166;text-align:right;" value=""></td>
      				</tr>
      		</table>  		
		</div>
		<script language="javascript">ComSheetObject('sheet1');</script> 
	</div>
</div>

</form>

