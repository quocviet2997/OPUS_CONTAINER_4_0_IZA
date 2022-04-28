<%
/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_SUP_0005.jsp
*@FileTitle  : EDI SETUP LOGISTICS
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/21
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
<%@ page import="com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.event.BcmSup0005Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	BcmSup0005Event event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException = null;			//Error from server
	String strErrMsg = "";						//Error message
	String strUsr_id = "";
	String strUsr_nm = "";
	Logger log = Logger.getLogger("com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation");
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
		event = (BcmSup0005Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
	} catch(Exception ex) {
		log.error("err " + ex.toString(), ex);
		//out.println(e.toString());
	}
%>

<script type="text/javascript">
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
<input type="hidden" name="trd_prnr_sub_lnk_seq" id="trd_prnr_sub_lnk_seq">

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
		<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_save" id="btn_save">Save</button><!-- 
	 --></div>
	<!-- opus_design_btn(E) -->
	<!-- page_location(S) -->
	<div class="location">
		<!-- location 내용 동적생성 (별도 코딩 불필요) -->
		<span id="navigation"></span>
	</div>
</div>
<!-- page_title_area(E) -->

<div class="wrap_search">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry">
		<table>
			<tbody>
				<colgroup>
					<col width="80"/>
					<col width="130"/>
					<col width="80"/>
					<col width="140"/>
					<col width="60"/>
					<col width="*" />
				</colgroup>
				<tr>
					<th>Sub Link Div.</th>
					<td>
						<select style="width: 90px;" class="input1" name="s_sub_lnk_div_cd" id="s_sub_lnk_div_cd">
							<option value="1" >Yard</option>
							<option value="2">Service Provider</option>
						</select>
					</td>
					<th>Sub Link Code</th>
					<td><input type="text" style="width: 100px; text-align:center; ime-mode:disabled" class="input" maxlength="7" name="s_sub_lnk_cd" id="s_sub_lnk_cd" dataformat="engup"></td>
					<th>Port Code</th>
					<td><input type="text" style="width: 100px; text-align:center; ime-mode:disabled" class="input" maxlength="5" name="s_port_cd" id="s_port_cd" dataformat="engup"></td>
				</tr>
			</tbody>
		</table>
	</div>
	<!-- opus_design_inquiry(E) -->
</div>

<div class="wrap_result">
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid" style="position:relative;">
		<h3 class="title_design mar_btm_8" style="position:absolute;">EDI TRADE PARTNER SUB LINK</h3>
	    <div class="opus_design_btn" style="clear: both; padding-right: 0px;">
			<button type="button" class="btn_accent" name="btn_add" id="btn_add">Row Add</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_del" id="btn_del">Row Delete</button><!-- 
		 --></div>
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
	<!-- opus_design_grid(E) -->
	
	
	<!-- layout_wrap (S) -->
		<div class="layout_wrap">
		    <div class="layout_vertical_2" style="width: 68%;">
		        <!-- opus_design_grid(S) -->
		        <div class="opus_design_grid" style="position:relative;">
		        	<h3 class="title_design mar_btm_8" style="position:absolute;">BKG EDI SUB LNK MSG</h3>
		        	<div class="opus_design_btn" style="clear: both;">
						<button type="button" class="btn_accent" name="btn_add1" id="btn_add1">Row Add</button><!-- 
						 --><button type="button" class="btn_normal" name="btn_del1" id="btn_del1">Row Delete</button><!-- 
					 --></div>
		            <script type="text/javascript">ComSheetObject('sheet2');</script>
		        </div>
		        <!-- opus_design_grid(E) -->
		    </div>
		    <div class="layout_vertical_2" style="width: 2%;">
		   	 <div class="opus_design_grid">&nbsp;</div>
		    </div>
		    <div class="layout_vertical_2" style="width: 30%;">
		        <!-- opus_design_grid(S) -->
		        <div class="opus_design_grid" style="position:relative;">
		        	<h3 class="title_design mar_btm_8" style="position:absolute;">EDI PARTNER PORT LANE</h3>
		        	<div class="opus_design_btn"  style="clear: both;">
						<button type="button" class="btn_accent" name="btn_add2" id="btn_add2">Row Add</button><!-- 
						 --><button type="button" class="btn_normal" name="btn_del2" id="btn_del2">Row Delete</button><!-- 
					 --></div>
					<script type="text/javascript">ComSheetObject('sheet3');</script>
		        </div>
		        <!-- opus_design_grid(E) -->
		    </div>
		</div>
	<!-- layout_wrap (E) -->
</div>
</form>