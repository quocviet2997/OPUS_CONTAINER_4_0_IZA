<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0003.jsp
*@FileTitle  : Representative Charge
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/03
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.account.event.BcmCcd0003Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
				    BcmCcd0003Event  event = null;				//PDTO(Data Transfer Object including Parameters)
		Exception serverException   = null;			//Error from server
		String strErrMsg = "";						//Error message
		int rowCount	 = 0;						//Count of DB resultSet list
	
		String successFlag = "";
		String codeList  = "";
		String pageRows  = "100";

		String strUsr_id		= "";
		String strUsr_nm		= "";
		Logger log = Logger.getLogger("com.clt.apps.opus.bcm.ccd.commoncode.account");
	
		try {
		   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
				strUsr_id =	account.getUsr_id();
				strUsr_nm = account.getUsr_nm();
		
				event = (BcmCcd0003Event)request.getAttribute("Event");
				serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

				if (serverException != null) {
						strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
				}
		
				GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		
		}catch(Exception e) {
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
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="repChgCdChk" id="repChgCdChk" />
<input type="hidden" name="repChgCd" id="repChgCd" />
<!-- page_title_area(S) -->
<div class="page_title_area clear">
<!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
	<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
	 --><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button><!--
	 --><button type="button" class="btn_normal" name="btn_Save" id="btn_Save">Save</button><!-- 
	 --><button type="button" class="btn_normal" name="btn_DownExcel" id="btn_DownExcel">Down Excel</button>
	</div>
	<!-- opus_design_btn(E) -->

	<!-- page_location(S) -->
	<div class="location">
	<!-- location 내용 동적생성 (별도 코딩 불필요) -->
		<span id="navigation"></span>
	</div>
</div>
<!-- page_title_area(E) -->
<!-- wrap_search(S) -->  
<div class="wrap_search">
	<!-- opus_design_inquiry (S) -->
	<div class="opus_design_inquiry wFit">
		<table> 
			<colgroup>
				<col width="10px">
				<col width="*">
			</colgroup>
			<tr class="h23">
				<th>Rep. Charge Code</th>
				<td><input type="text" style="width:120px;text-align:center;ime-mode:disabled;" class="input" dataformat="engup" name="rep_chg_cd" maxlength="3" onChange="rep_chg_cd_OnChange();"></td>
			</tr>	
		</table>
	</div>
	<!-- opus_design_inquiry (E) -->
</div>
<!-- wrap_search(E) -->  
<!-- wrap_result(S) -->  
<div class="wrap_result">
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid"  id="mainTable">
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
	<!-- Content -->
		<button type="button" class="btn_normal" name="btn_RowAdd" id="btn_RowAdd">Row Add</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_RowDelete" id="btn_RowDelete">Row Delete</button>
	</div>
		<!-- opus_design_btn(e) -->				
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
	<!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->  


</form>