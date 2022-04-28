<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : 	ADM_SYS_0006.jsp
*@FileTitle  : 역할관리
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.management.opus.officeprogram.event.OfficeProgramEvent"%>
<%
	SignOnUserAccount account = null;
	OfficeProgramEvent event = null; //PDTO(Data Transfer Object including Parameters)
	Exception serverException = null; //서버에서 발생한 에러
	String strErrMsg = ""; //에러메세지
	String strErrCode = "";

	try {
		account = (SignOnUserAccount) session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		event = (OfficeProgramEvent) request.getAttribute("Event");
		serverException = (Exception) request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
	ErrorHandler errHndlr = new ErrorHandler(serverException);
	strErrMsg = errHndlr.loadPopupMessage();
	strErrCode = errHndlr.getCode();
		}
	} catch (Exception e) {
		out.println(e.getMessage());
	}
%>

<script language="javascript">
  function setupPage(){
    var errMessage = "<%=strErrMsg%>";
    var errCode = "<%=strErrCode%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		if (errCode == "COM10004") {
			gotoMainPage();
		} else {
			//setSubSystemCode('ENIS');
			loadPage();
		}
	}
</script>


<form name="form">
<input type="hidden" name="f_cmd">

	<div class="page_title_area clear">
	    <h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	         
	    <div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
			 --><button type="button" class="btn_normal" name="btn_DownExcel"   id="btn_DownExcel">Down Excel</button>
	    </div>
	    
	    <div class="location">
	        <span id="navigation"></span>
	    </div>
	</div>
		
	<div class="wrap_search">
		<div class="opus_design_inquiry wFit">
		    <!-- 조회영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
		    <table>
		        <tbody>
					<tr>
						<th width="60">Office Code</th>
						<td width="150"><input type="text" style="width:100px;" name= "ofc_cd" class="input" value="" onKeyPress="javascript:ComKeyOnlyAlphabet('uppernum');"><!--&nbsp;<img class="cursor" src="/opuscntr/img/button/btns_search.gif" width="19px" height="20px" border="0" align="absmiddle" name="btn_ofc_cd">--><!--
                        --><button type="button" class="input_seach_btn" id="btn_ofc_cd" name="btn_ofc_cd"></button></td>
						<th width="60">Office Name</th>
						<td><input type="text" style="width:100px;" name= "ofc_nm" class="input" value=""></td>
				</tbody>
			</table>
		</div>
	</div>
	
	<div class="wrap_result">
		<div class="opus_design_grid">
			<script language="javascript">ComSheetObject('sheet1');</script>
		</div>
	</div>
	
</form>
