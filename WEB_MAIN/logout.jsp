<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.framework.core.config.SiteConfigFactory"%>

<%
    Exception serverException   = null;               //서버에서 발생한 에러
    String strErrMsg = "";                            //에러메세지
    
    try {
        //SignOnUserAccount account = (SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
     
        serverException = (Exception) request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
     
        if (serverException != null) {
            strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
        }else{
            //response.sendRedirect("/opuscntr/MainPage.do");  //기존 PMO메인화면
        } // end else
    }catch(Exception e) {
        out.println(e.toString());
    }
%>
<script language="javascript">
  document.location.href="SignOn.do";
</script>