<%--
/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UI_COM_SYS_013.jsp
*@FileTitle : 사용자 조직 조회 팝업
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-10
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2007-01-10 SeongWook Kim
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
<%@ page import="com.clt.syscommon.management.opus.user.event.UserManagementEvent"%>
<%
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";								 //에러메세지
  	String strErrCode = "";
  	UserManagementEvent event = null;

	try {
		event = (UserManagementEvent)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		if (serverException != null) {
		    ErrorHandler errHndlr = new ErrorHandler(serverException);
				strErrMsg = errHndlr.loadPopupMessage();
				strErrCode = errHndlr.getCode();
		}

	}catch(Exception e) {
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
    if(errCode=="COM10004"){
      gotoMainPage();
    }else{
      loadPage();
    }
  }

  function gotoMainPage() {
    try {
      if(opener != null){
          if (opener.document != null) {
            opener.top.location.href = "SignOn.do";
            self.window.close();
          }
      }
      //프레임셋에서 탑프레임으로 로그인화면 출력
      //2007.01.23 김성욱
      if(window.top.frames != null && window.top.frames.length>0){
        window.top.location.href = "SignOn.do";
      }else{
        document.location.href = "SignOn.do";
      }
    } catch (e) {
      
    }
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
//      out.println(JSPUtil.getPopupSettingData(returnObjectIndexs,formName));
//    } else {
//      out.println(JSPUtil.getPopupSettingDataIBSheet(returnObjectIndexs,0,sheetObj,sRow));
 //			 }
%>
</script>

<form method="post" name="form" onSubmit="return false;">
<input	type="hidden" name="f_cmd"> 
<input type="hidden" name="iPage">
<input type="hidden" name="rhq" value="<%=event.getVO("rhq")%>">

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title">
	<span>Office Mapping</span>
			
	</h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
	<button type="button" class="btn_normal" name="btn_confirm" 	id="btn_confirm">Confirm</button>
	<button type="button" class="btn_normal" name="btn_close" 	id="btn_close">Close</button>
	</div>
	<!-- opus_design_btn(E) -->

	<!-- page_location(S) -->
	<div class="location">
		<!-- location 내용 동적생성 (별도 코딩 불필요) -->
		<span id="navigation"></span>
	</div>
</div>
<!-- page_title_area(E) -->

<div class="wrap_result">
	<div class="opus_design_grid clear" id="mainTable">
		<h3 class="title_design mar_top_12">Office List</h3>
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
</div>	
</form>
