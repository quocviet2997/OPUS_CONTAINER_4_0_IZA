<%
/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_SUP_0003.jsp
*@FileTitle  : EDI GROUP CARGO 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/
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
<%@ page import="com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.event.BcmSup0003Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	BcmSup0003Event event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException = null;			//Error from server
	String strErrMsg = "";						//Error message
	String strUsr_id = "";
	String strUsr_nm = "";
	Logger log = Logger.getLogger("com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation");
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		event = (BcmSup0003Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
	} catch(Exception ex) {
		log.error("err " + ex.toString(), ex);
		//out.println(e.toString());
	}
%>

<script language="javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form" id="form">
<input type="hidden" name="f_cmd" id="f_cmd">

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title">
		<button type="button"><span id="title"></span></button>
	</h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
		<button type="button" class="btn_accent" name=btn_retrieve id="btn_retrieve">Retrieve</button><!-- 
		--><button type="button" class="btn_accent" name="btn_new" id="btn_new">New</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_save" id="btn_save">Save</button>
	</div>
	<!-- opus_design_btn(E) -->
	<!-- page_location(S) -->
	<div class="location">
		<!-- location 내용 동적생성 (별도 코딩 불필요) -->
		<span id="navigation"></span>
	</div>
</div>
<!-- page_title_area(E) -->

<!-- opus_design_inquiry(S) -->
<div class= "wrap_search">
<div class="opus_design_inquiry wFit">
	<table>
		<tbody>
			<colgroup>
				<col width="10px" />
				<col width="70px" />
				<col width="200px" />
				<col width="70px" />
				<col width="200px" />
				<col width="70px" />
				<col width="200px" />
				<col width="70px" />
				<col width="200px" />
				<col width="*" />
			</colgroup>
			<tr>
				<td></td>
				<th>Group Code</th>
				<td><input type="text" style="width: 100px; text-align:center; ime-mode:disabled" class="input1" name="s_grp_cd" id="s_grp_cd" maxlength="10" required caption="Group Code" dataformat="engup" otherchar="-"></td>
				<td style="font-weight: bold;">Customer Code</td>
				<td>
					<input name="s_cust_cd"  type="text" class="input1" style="width:102px; text-transform:uppercase;" value="" onBlur='javascript:this.value=this.value.toUpperCase();' required caption="Customer Code"><!--
				--><button type="button" class="input_seach_btn" onClick="openCustomer()"></button>
				</td>
				<th>Company Div.</th>
				<td><input type="text" style="width: 100px; text-align:center; ime-mode:disabled" class="input" name="s_co_div_cd" id="s_co_div_cd" maxlength="10" dataformat="enguponly"></td>
				<th>Standard Status</th>
				<td><input type="text" style="width: 100px; text-align:center; ime-mode:disabled" class="input" name="s_stnd_sts_cd" id="s_stnd_sts_cd" maxlength="10" dataformat="enguponly"></td>
				<td></td>
			</tr>
		</tbody>
	</table>
</div>
</div>
<!-- opus_design_inquiry(E) -->

 <!-- opus_design_grid(S) -->
 <div class="wrap_result">
      <div class="opus_design_grid">
          <div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_add" id="btn_add">Row Add</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_del" id="btn_del">Row Delete</button>
		</div>
		<script type="text/javascript">ComSheetObject('sheet1');</script>
      </div>
</div>
<!-- opus_design_grid(E) -->
</form>