<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_2001.jsp
*@FileTitle  : BCM_CCD_2001
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/11
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.mstmgmt.event.BcmCcd2001Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	BcmCcd2001Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.CommonCode.MstMgmt");


	String hamo_tp_cd		= ""; //
	String hamo_trf_cd		= "";//
	String hamo_cd_desc		= "";//
	String calllFunc 		= "";//


	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (BcmCcd2001Event)request.getAttribute("Event");
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

<head>
<title>BCM_CCD_2001</title>


<script type="text/javascript">
	var G_MDAA_CHK;

	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>
</head>

<body  onLoad="setupPage();">
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="ibflag" value="I" id="ibflag" />
<input type="hidden" name="calllFunc" value="<%=calllFunc%>" id="calllFunc" />
<input type="hidden" name="sel_hamo_tp_cd" value="<%=hamo_tp_cd%>" id="sel_hamo_tp_cd" />
<input type="hidden" name="mdm_yn" value="Y" id="mdm_yn" />
<input type="hidden" name="delCount" id="delCount" />

<input type="hidden" name="cust_seq" id="cust_seq" />
<input type="hidden" name="cust_cnt_cd" id="cust_cnt_cd" />
<input type="hidden" name="cnt_cd" id="cnt_cd" />
<input type="hidden" name="ste_cd" id="ste_cd" />
<input type="hidden" name="login_usr_id" value="<%=strUsr_id%>" id="login_usr_id" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
<!-- page_title(S) -->
<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
<!-- page_title(E) -->
<!-- opus_design_btn(S) -->
<div class="opus_design_btn">
<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
 --> <button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button><!--
 --> <button type="button" class="btn_normal" name="btn_Save" id="btn_Save" style="display: none">Save</button><!-- 
  --><button type="button" class="btn_normal" name="btn_CopyAuthority" id="btn_CopyAuthority" style="display: none">Copy Authority</button><!-- 
   --><button type="button" class="btn_normal" name="btn_DownExcel" id="btn_DownExcel">Download Excel</button>
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
			<col width="100">
			<col width="100">
			<col width="100">
			<col width="100">
			<col width="60">
			<col width="*">
		</colgroup>
		<tr class="h23">
			<th>Subject</th>
			<td><script type="text/javascript">ComComboObject('mst_dat_subj_cd', 1, 140, 1, 0, 0, false)</script></td>
			<th>Authority ID</th>
			<td><input type="text" style="width:180px; ime-mode:disabled; text-align:center;" class="input" name="usr_id" value="" maxlength="100" dataformat="excepthan"  id="usr_id" /><!-- 
			 --><button type="button" id="btn_com_ens_091" name="btn_com_ens_091" class="input_seach_btn"></button></td>
			<th>Type</th>
			<td><script type="text/javascript">ComComboObject('auth_tp_cd', 1, 100, 1, 0, 0, false)</script></td>
		</tr>	
	</table>
</div>
<!-- opus_design_inquiry (E) -->
</div>
<!-- wrap_search(E) -->  

<!-- wrap_result(S) -->  
<div class="wrap_result">
<!-- opus_design_grid(S) -->
<div class="opus_design_grid">
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
	<!-- Content -->
		<button type="button" class="btn_normal" name="btn_RowAdd" id="btn_RowAdd" style="display: none">Row Add</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_RowDelete" id="btn_RowDelete" style="display: none">Row Delete</button>
	</div>
	<!-- opus_design_btn(e) -->
	
	<script type="text/javascript">ComSheetObject('sheet1');</script>
</div>
<!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->  



</form>

