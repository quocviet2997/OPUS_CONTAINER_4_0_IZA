<%
/*=========================================================
*Copyright(c) 2016 CyberLogitec. All Rights Reserved.
*@FileName 	 : ADM_SYS_0015.jsp
*@FileTitle  : Notice Mail Sender PAGE	
*@author     : JeongHoon,Kim
*@version    : 1.0
*@since      : 2016/03/08
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<script type="text/javascript" type="text/javascript" src="/opuscntr/syscommon/common/fckeditor/ckeditor.js"></script>

<%
	Exception serverException = null; //서버에서 발생한 에러
	String strErrMsg = ""; //에러메세지
	
	try {				
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		    
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}	
	} catch (Exception e) {
		out.println(e.toString());
	}
%>


<script language="javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			showErrMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form1">
<input type="hidden" name="f_cmd">
<input type="hidden" name="iPage">
<input type="hidden" name="codeid">
<input type="hidden" name="selectedcodes">

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->

	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
		 <button type="button" class="btn_accent" name="btn_Send" id="btn_Send">Send</button>
	 </div>
	<!-- opus_design_btn(E) -->

   	<!-- page_location(S) -->
   	<div class="location">
		<!-- location 내용 동적생성 (별도 코딩 불필요) -->
        <span id="navigation"></span>
   	</div>
   	<!-- page_location(E) -->
</div>
<!-- page_title_area(E) -->
<div class="wrap_result">
	<h2>Email Title</h2>
	<br>
	<textarea name="emailTitle" style="width: 100%;hight:20; text-align: left;resize:none"></textarea>
	<br>
	<h2>Email Contents</h2>
	<br>
	<textarea class="ckeditor" name="emailContents" id="emailContents"></textarea>
</div>

</form>
