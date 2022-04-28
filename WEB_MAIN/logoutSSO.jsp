<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>

<%@ page import="com.tobesoft.iam.utility.TBStringUtil"%>
<%@ page import="com.tobesoft.iam.utility.TBHttpUtil"%>
<%@ page import="com.tobesoft.iam.virtualagent.TBVirtualAgent"%>
<%@ page import="com.tobesoft.iam.virtualagent.TBVirtualConfig"%>

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
    
      /**0. VirtualAgent 초기화 */ 
      TBVirtualAgent  VA = new TBVirtualAgent();
      TBVirtualConfig VC = VA.getConfig();
    
      String SMSESSION  = TBHttpUtil.getCookie(VC.getSessionName(), request);
      String clientIp = request.getHeader("Client-ip");
      if( clientIp == null ) clientIp = request.getHeader("WL-Proxy-Client-IP");
      if( clientIp == null ) clientIp = request.getHeader("Proxy-Client-IP");
      if( clientIp == null ) clientIp = request.getHeader("X-Forwarded-For");
      if( clientIp == null ) clientIp = request.getRemoteAddr();
      VA.ssoAudit(SMSESSION, "LOGOUT", clientIp );
%>

<script language="javascript">
  document.location.href="http://im.hanjin.com/no_sso/non_close.html";
</script>