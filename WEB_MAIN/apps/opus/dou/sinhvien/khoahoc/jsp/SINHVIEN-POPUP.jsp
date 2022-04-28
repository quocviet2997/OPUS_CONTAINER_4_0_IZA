<%
/*=========================================================
*Copyright(c) 2020 CyberLogitec
*@FileName : SINHVIEN.jsp
*@FileTitle : Sinh Vien
*Open Issues :
*Change history :
*@LastModifyDate : 2020.03.18
*@LastModifier : 
*@LastVersion : 1.0
* 2020.03.18 
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
<%@ page import="com.clt.apps.opus.dou.sinhvien.sinhvien.event.SinhvienEvent"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	SinhvienEvent  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String khoaHoc 			= "";
	Logger log = Logger.getLogger("com.clt.apps.SinhVien.SinhVien");
	
	String s_khoahoc = request.getParameter("s_khoahoc") != null ? request.getParameter("s_khoahoc") : "";
	String rowId = request.getParameter("rowId") != null ? request.getParameter("rowId") : "";

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (SinhvienEvent)request.getAttribute("Event");
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
<html>
<head>
<title>Sinh Vien</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script language="javascript">
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
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
<input type="hidden" name="s_khoahoc" value="<%=s_khoahoc%>" id="s_khoahoc" />
<input type="hidden" name="rowId" value="<%=rowId%>" id="rowId" />
<!-- 개발자 작업	-->
	<div class="layer_popup_title">
		<div class="page_title_area clear">
			<div class="opus_design_btn">
			   <button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
			   --><button type="button" class="btn_normal" name="btn_Save" id="btn_Save">Save</button>
			</div>
		    <div class="location">
		     	<span id="navigation"></span>
		    </div>
		</div>
	</div>

		<div class="wrap_search">
			<div class="opus_design_inquiry">
			    <table>
			        <tbody>
					<tr>
					   <th width="40">Name</th>
					<td width="120"><input type="text" style="width:100px;" class="input" value="" name="s_ten" id="ten"></td>
					<th width="40">Age</th>
					<td><input type="number" min=0 style="width:100px;" class="input" value="" name="s_tuoi" id="tuoi"></td>
					</tr> 
					</tbody>
				</table>
			</div>
		</div>
		
		<div class="wrap_result">
			<div class="opus_design_grid">
			<div class="opus_design_btn">
				<button class="btn_normal" name="btn_RowDelete" id="btn_RowDelete" type="button">Row Delete</button>
				<button class="btn_normal" name="btn_RowAdd" id="btn_RowAdd" type="button">Row Add</button>
			</div>
				<h3 class="title_design">Sinh Vien</h3>
				<script language="javascript">ComSheetObject('sheet1');</script>
			</div>
			
			
		</div>
	

<!-- 개발자 작업  끝 -->
</form>
</body>
</html>