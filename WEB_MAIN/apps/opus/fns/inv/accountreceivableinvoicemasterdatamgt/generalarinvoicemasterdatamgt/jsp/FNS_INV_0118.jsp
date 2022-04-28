<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName   : FNS_INV_0118.jsp
*@FileTitle  : Charge Code Set-Up per Customer(For CPR)
*Open Issues :
*Change history  :
*@LastModifyDate : 
*@LastModifier   : 
*@LastVersion    : 1.0
* 2014.11.14 박성용
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
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.framework.component.util.StringUtil" %>
<%
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";
	
	String tmplt= "";
	
	String func  = StringUtil.xssFilter(request.getParameter("func"));
	String row = StringUtil.xssFilter(request.getParameter("row"));
	String col = StringUtil.xssFilter(request.getParameter("col"));
	String arrChg = StringUtil.xssFilter(request.getParameter("arrChg"));

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String strOfc_cd		= "";
	String pageType = "";
	String pop_yn = "";

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		strOfc_cd = account.getOfc_cd();

		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

//		// 초기화면 로딩시 서버로부터 가져온 데이터 추출하는 로직추가 ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

		pageType = StringUtil.xssFilter(request.getParameter("pagetype")) != null ? StringUtil.xssFilter(request.getParameter("pagetype")) : "";
		
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
<input type="hidden"  name="pagetype" id="pagetype" value="<%=pageType%>">
<input type="hidden" name="tmpltNm" id="tmpltNm" value="">
<input type="hidden" name="tmplt_ofc_cd" id="tmplt_ofc_cd" value="">
<input type="hidden" name="tmplt_auth_id" id="tmplt_auth_id" value="">		
<input type="hidden" name="pop_yn" id="pop_yn" value="<%=pop_yn%>">
<input type="hidden" name="sc_no" id="sc_no"  value="">	
<input type="hidden" name="rfa_no" id="rfa_no" value="">
<input type="hidden" name="code" id="code"> 	

<!-- page_title_area(S) -->
<div class="layer_popup_title">
	<div class="page_title_area clear">
	   <!-- page_title(S) -->
		<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
		<h2 class="page_title"><span>Charge Code Set-Up per Customer</span></h2>
		<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn"> 
			<%
				if(pageType.equals("E")){
			%>
					<button class="btn_accent" name="btn_ok" id="btn_ok" type="button">Ok</button><!-- 
				 	--><button class="btn_normal" name="btn_close" id="btn_close" type="button">Close</button>
			<%
				} else {
			%>
					<button class="btn_normal" name="btn_close" id="btn_close" type="button">Close</button>
			<%
				}
			%>
		</div>
		<!-- opus_design_btn(E) -->
	</div>
</div>
<!-- page_title_area(E) -->	
<div class="layer_popup_contents">
	<!-- wrap_search(S) -->
	<div class="wrap_search ">
		<!-- opus_design_inquiry(S) -->
		<div class="opus_design_inquiry">
			<table>
				<tbody>
					<colgroup>
						<col width="40" />
						<col width="*" />
					</colgroup>
					<tr>
						<th>Type</th>
						<td>
							<select name="cprt_tp_ctnt" id="cprt_tp_ctnt" class="input" style="width:100px;" onChange="cprt_tp_ctnt_OnChange(this.value)">
								<option value="S" selected>S/C No</option>
								<option value="R">RFA No</option>
                            </select>
					   		<script type="text/javascript"  style="ime-mode:disabled" dataformat="engup" onChange="cprt_val_ctnt_OnChange()">ComComboObject('cprt_val_ctnt', 1,  200, 0, 1, 0, true);</script>
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
		<!-- opus_design_grid(S) -->
		<div class="opus_design_grid">
			<div class="opus_design_btn">
	        	<button class="btn_normal" name="btn_add" id="btn_add" type="button">Row Add</button>  
	        	<button class="btn_normal" name="btn_insert" id="btn_insert" type="button">Row Insert</button>
	        	<button class="btn_normal" name="btn_del" id="btn_del" type="button">Row Delete</button>
	        </div>
			<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>
		<!-- opus_design_grid(E) -->
	</div>
	<!-- wrap_result(E) -->
</div>
</form>