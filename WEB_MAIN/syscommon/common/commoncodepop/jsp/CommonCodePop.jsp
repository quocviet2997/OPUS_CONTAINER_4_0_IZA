<%--
/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CommonCodePop.jsp
*@FileTitle : 공통코드검색
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-08
*@LastModifier : HOESOO_JANG
*@LastVersion : 1.0
* 2006-09-08 HOESOO_JANG
* 1.0 최초 생성
=========================================================*/ 
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.common.code.event.CommonCodePopEvent"%>
<%@ page import="com.clt.syscommon.common.code.event.CommonCodePopEventResponse"%>

<%
	CommonCodePopEvent event = null; //PDTO(Data Transfer Object including Parameters)
	CommonCodePopEventResponse eventResponse = null; //RDTO(Data Transfer Object including DB ResultSet)
	Exception serverException = null; //서버에서 발생한 에러
	DBRowSet rowSet = null; //DB ResultSet
	String strErrMsg = ""; //에러메세지
	int rowCount = 0; //DB ResultSet 리스트의 건수
	//String successFlag = "";
	//String codeList = "";
	//String pageRows = "100";

	try {
		//SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		//userId=account.getUsr_id();
		//userAuth=account.getAuth(); 

		event = (CommonCodePopEvent) request.getAttribute("Event");
		serverException = (Exception) request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		} else {
			eventResponse = (CommonCodePopEventResponse) request.getAttribute("EventResponse");
			if (eventResponse != null) {
		rowSet = eventResponse.getRs();
		if (rowSet != null) {
			rowCount = rowSet.getRowCount();
		} // end if
			} // end if
		} // end else
	} catch (Exception e) {
		out.println(e.toString());
	}
	
	/**
	 * 팝업window에서 필수 사항
	 * opener로 값을 리턴하기 위해 필요한 변수들 선언
	 */
    String returnObjectIndexs = JSPUtil.getParameter(request, "returnObjectIndexs", "" );  //opener에서 넘어온 Form의 element의 index정보
    //String[] returnObjects    = returnObjectIndexs.split(",");
    String formName           = JSPUtil.getParameter(request, "formName"          , "" );  //opener에서 넘어온 Form name
    //String sheetObj           = JSPUtil.getParameter(request, "sheetObj"          , "" );  //opener에서 넘어온 Grid ID
    //String sRow               = JSPUtil.getParameter(request, "sRow"              , "0");  //opener에서 넘어온 Grid의 Row정보
    
    String codeId = JSPUtil.getParameter(request, "group_cd", "" );
%>
<html>
<head>
<title>common integration code search</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="css/style.css" type="text/css" rel="stylesheet" />
<LINK href="css/style_common.css" type="text/css" rel="stylesheet" />
<script language="javascript" src="sys/common/commoncodepop/script/CommonCodePop.js"></script>
<script language="javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			showErrMessage(errMessage);
		} // end if
		loadPage();
	}	
	   
<%
	/**
	 * 팝업window에서 필수입력 사항
	 * 팝업window에서 opener로 값을 리턴하기 위한 자바스크립트 공통함수 settingData를 생성
	 * settingData는 opener의 폼 element에 값을 리턴하는 경우에 사용
	 * settingDataIBSheet는 opener의 IBSheet에 값을 리턴하는 경우에 사용
	 * settingData함수 사용예는 CodePopupJSP.js의 sheet1_OnDblClick 함수를 참조하세요
	 */
//    if(sheetObj.equals("")){
    	out.println(JSPUtil.getPopupSettingData(returnObjectIndexs,formName));
//    } else {
//		out.println(JSPUtil.getPopupSettingDataIBSheet(returnObjectIndexs,0,sheetObj,sRow));
//    }
%>

	//alert('<%=codeId%>');
</script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" onload="javascript:setupPage();">
<form method="post" name="codeFrm" onSubmit="return false;">
<input	type="hidden" name="f_cmd"> 
<input type="hidden" name="iPage">
<input type="hidden" value="<%=codeId %>" name="intg_cd_id" id="intg_cd_id">
<!-- OUTER - POPUP (S)tart -->
<table width="630" class="popup" cellpadding="10">
	<tr>
		<td class="top"></td>
	</tr>
	<tr>
		<td valign="top"><!-- : ( Title ) (S) -->
		<table width="625" border="0">
			<tr>
				<td height="79" class="title">
					<img src="img/eai/ico_t1.gif" width="20" height="12">Common Integration Code Search</td>
			</tr>
		</table>
		<!-- : ( Title ) (E) --> <!-- TABLE '#D' : ( Button : Main ) (S) -->

		<table class="height_15">
			<tr>
				<td></td>
			</tr>
		</table>


		<!-- TABLE '#D' : ( Tab BG Box ) (S) -->
		<table class="search" border="0"  width="100%" >
			<tr>
				<td class="bg_b1">


				<table class="height_10">
					<tr>
						<td></td>
					</tr>
				</table>
				<table width="100%" id="mainTable">
					<tr>
						<td> <script language="javascript">comSheetObject('sheet1');</script>
						</td>
					</tr>
				</table>
				<!-- : ( Grid ) (E) --></td>
			</tr>
		</table>
		<!-- TABLE '#D' : ( Tab BG Box ) (E) --></td>
	</tr>
</table>
<!-- OUTER - POPUP (E)nd -->



<table class="height_10">
	<tr>
		<td></td>
	</tr>
</table>


<!-- : ( Button : Sub ) (S) -->
<table width="100%" class="sbutton">
	<tr>
		<td height="71" class="popup">

		<table class="sbutton">
			<tr>
				<td class="p_bt"><img class="cursor"
					src="img/eai/button/btn_ok.gif" width="66" height="20"
					border="0" name="btn_ok"></td>
				<td class="p_bt"><img class="cursor"
					src="img/eai/button/btn_close.gif" width="66" height="20"
					border="0" name="btn_close"></td>
			</tr>
		</table>

		</td>
	</tr>
</table>
<!-- : ( Button : Sub ) (E) -->

</form>
</body>
</html>
