<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/com_main.tld" prefix="mainpage"%>
<%@ taglib uri="/WEB-INF/fmt.tld" prefix="fmt"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.clt.framework.component.util.JSPUtil" %>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.config.SiteConfigFactory"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.common.util.UserRoleUtil"%>
<%@ page import="com.tobesoft.iam.utility.TBStringUtil"%>
<%@ page import="com.tobesoft.iam.utility.TBHttpUtil"%>
<%@ page import="com.tobesoft.iam.virtualagent.TBVirtualAgent"%>
<%@ page import="com.tobesoft.iam.virtualagent.TBVirtualConfig"%>

<%@ page import="com.clt.framework.support.view.signon.web.SignOnFilter"%>
  
<%
  /**
   * SSO로그인 폼 페이지
   *
   * Parameter
   *  - TARGET : 인증(SSO,내부)완료후 이동할 URL.
   *             TB_LOGINPOST_URL페이지로 값을 전달한다.
   * Desc
   *   SSO 로그인 페이지.  
   */

  /**1. VirtualAgent 초기화 */
  TBVirtualAgent  VA = new TBVirtualAgent();
  TBVirtualConfig VC = VA.getConfig();

  /**2. TARGET 재 정의 */
  String SMPREFIX = "-SM-";
  String TARGET = TBStringUtil.nullString(request.getParameter("TARGET"));
  //out.print(TARGET);
  int sp = TARGET.indexOf(SMPREFIX);
  if( sp != -1 ) TARGET = TARGET.substring(SMPREFIX.length());
  if( TARGET.indexOf(VC.getLoginPostUrl()) == -1 ) {
    TARGET = TBHttpUtil.appendQueryString(VC.getLoginPostUrl(), "TARGET", TARGET);
  }

  /**3. SMSESSION이 존재한다면, TB_LOGINPOST_URL 페이지로 이동한다. */
  String SMSESSION   = TBHttpUtil.getCookie(VC.getSessionName(), request);
  //String TB_RETRY_NO = TBHttpUtil.getCookie("TB_RETRY_NO", request);

  SignOnUserAccount account = (SignOnUserAccount) session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
  String location = (String) session.getAttribute("local_lang_type");
  //out.print("location :"+location);
  if(account != null){
  	org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger("com.clt.logincnt");
  	log.info("LoginCnt; " + account.getUsr_id() +"; " + request.getRemoteAddr() + "; " + SiteConfigFactory.get(SiteConfigFactory.SYSTEM_TYPE));
  }
  
//SSO Enable 여부(site-config.properties 파일)
  String ssoEnabled = SiteConfigFactory.get(SiteConfigFactory.SSO_ENABLED);
  String smAgentName = SiteConfigFactory.get("COM.CLT.SSO.SM.AGENT.NAME");
  String ssoTargetUrl = SiteConfigFactory.get("COM.CLT.SSO.TARGET");
  String adminPgmNo = SiteConfigFactory.get("COM.CLT.MENU.ADMIN.PROGRAM.CODE");
  String comPopupEnabled = SiteConfigFactory.get("COM.CLT.COMMON.POPUP.ENABLED");
  String loginSkipWhenSSO = SiteConfigFactory.get("COM.CLT.SSO.LOGIN.SKIP");
  String message    = request.getParameter("FORM_MESSAGE");
  boolean skipFlag = false;
  if ( !(( message!=null )&&( message.length()>0 )) && !TBStringUtil.isNullOrZero(SMSESSION) && !SMSESSION.equals("LOGGEDOFF")
		  && account == null && ssoEnabled.equals("TRUE") && loginSkipWhenSSO.equals("TRUE") )
	  skipFlag = true;
%>
<% if( skipFlag ) { %>
  <script>
    document.location.href = '<%=TARGET%>';
  </script>
<%
  }
  //out.print(TARGET);
%>
<%
String lang_tp_cd = (String) request.getSession().getAttribute(SignOnFilter.FORM_LANG_TP_CD_TYPE);


Exception piex   =null;                           //서버에서 발생한 에러
String strErrMsg ="";                             //에러메세지
try {
	piex=(Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
	if (piex !=null) {
		strErrMsg =new ErrorHandler(piex).loadPopupMessage();
	}
}catch(Exception exx) {
	 out.println(exx.getMessage());
}

String error_kind = request.getParameter("FORM_ERR_KIND");

String cookieUserId="";
String cookieUserName="";
Cookie[] cookies = request.getCookies();

if (cookies != null) {
		for (int loop = 0; loop < cookies.length; loop++) {
			//System.out.println(loop + ")" + cookies[loop].getName() + "=" + cookies[loop].getValue());
				if (cookies[loop].getName().equals("bp_signon")) {
						 cookieUserId=cookies[loop].getValue();
				}
				if (cookies[loop].getName().equals("bp_signon_user_name")) {
						 cookieUserName=cookies[loop].getValue();
				}
		}
}

//Office  Change
	String changeOffice = request.getParameter("usr_chg_ofc_cd");
	
	if(changeOffice!=null && account != null ){
		org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger("com.hanjin.logincnt");
		account.setOfc_cd(changeOffice);		
		log.info(">> Change User Office ; " + account.getOfc_cd() );
	}
	
%>
<HTML>
<HEAD>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="shortcut icon" href="/opuscntr/img/favicon.ico" type="image/x-icon" />
<title>OPUS Container</title>
<link href="./img/main_img/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="./img/main_img/multiEmbed.js"></script>

<script>
//2011 3 29 hyunsu added 
var openWindowsCount = new Array();

function module_pop(id) {
	<% if (account == null) { %>
		alert('The requested web page requires that you sign in first. \nPlease enter your opus.cyberlogitec.com USER GID(Global ID) and password');
	<% } else { %>
	    try {
	        var iWidth = 1024;
	        var iHeight = 700;
	        var leftpos = (screen.width - iWidth)/2;    if(leftpos<0) leftpos=0;
	        var toppos  = (screen.height- iHeight)/2;   if(toppos<0)  toppos=0;
	        var sFeatures = "status=no, width="+iWidth+", height="+iHeight+", left="+leftpos+", top="+toppos+", resizable=yes, scrollbars=yes";
	        //document.getElementById("ifr_option").src = "UserManagementGS.do?f_cmd=11&mn_scrn_opt_id="+joinDisplayAtt();
	        var winObj = window.open("opusMain.screen?parentPgmNo="+id,"",sFeatures);
	        winObj.focus();
	        //return winObj;
	     	// 2011 3. 29 hyunsu 
	        // Add Windows count
	        openWindowsCount[openWindowsCount.length] = winObj;
	     
	    } catch(err) { alert(err.message); }
	<% } %>
	}
	
function solution_pop() {
	var selectSolution = document.getElementById("solutionType").value;
	document.getElementById("solutionType").selectedIndex = 0;
	if(selectSolution != "")
		module_pop(selectSolution);
}
	
function program_load(pgmNo, pgmUrl) {
	var modulePgmNo = pgmNo.substring(0, 8)+'M001';
	var src = "&pgmUrl="+ComReplaceStr(pgmUrl,"/","^")+"&pgmNo="+pgmNo;
	if ( pgmNo.indexOf("COM_ENS") > -1 ) modulePgmNo = "ESM_BKG_M001";
	if ( modulePgmNo.substring(0,3) == 'ADM' ) modulePgmNo = '<%=adminPgmNo %>';
	module_pop(modulePgmNo+src);
}


function submitForm() {
	
	with(document.existingcustomer)
	{
		action = "j_signon_check.do";
		if(document.all("t_username").value.length < 1){
			return ComAlertFocus(document.all("t_username"), "Enter UserId !");
		}
		if(document.all("t_password").value.length < 1){
			return ComAlertFocus(document.all("t_password"), "Enter Password !");
		}
		j_username.value = document.getElementById("t_username").value;
		j_password.value = document.getElementById("t_password").value;
		local_lang_type.value = document.getElementById("languageType").value;
		//alert(local_lang_type.value);
		/*
		* 20120112 added by Jun Sung, KIM
		* 다국어 지원 메세지 test 위해서 로기인 할때 location 값을 쿠키에 담는다. 현재 en(소문자) 값을 저장함.
		*/
		var todayDate = new Date();
		todayDate.setDate( todayDate.getDate() + "1" );
		var cookieLangVal = document.getElementById("languageType").value;
		document.cookie = "local_lang_type="+escape(cookieLangVal.toLowerCase())+"; path=/; expires=" + todayDate.toGMTString() + ";";
		// 다국어 지원 end
		
		submit();
	}
}

//기존에 시트가 설치 되었는지 확인함.
//신규버전인지 버전정보를 확인 설치가 필요할경우 'true'를 리턴한다.
function isInstall(){
	var obj = document.getElementById('sheet');
	if(obj == null || obj.Version == undefined)
		return true;
  else if(obj.Version != SHEET_VERSION.replace(/\,/gi, "\.")){
		var arrOld = obj.Version.split("\.");
		var arrNew = SHEET_VERSION.split("\,");
		for(var i in arrOld){
			arrOld[i] = ComLpad(arrOld[i], 3, "0");
			arrNew[i] = ComLpad(arrNew[i], 3, "0");
		}
		if(arrOld.join("") < arrNew.join(""))
			return true;
		else
			return false;
	}else
		return false;
}
function setupPage(){

	// Alert Message !
	showAlertMessage();
	
	
	//IBSheet의 설치나 버전 상태에 따라 인스톨 페이지로 넘어간다.
	//Windows7의 보안 관련 강화에 따라 팝업에서 화면 전환 방식으로 수정함.
//		location.href = "noticeIbsheet.jsp";

	if(isInstall()){
		location.href = "noticeIbsheet.jsp";
	}else{
<% if(( message!=null )&&( message.length()>0 )){ %>
	ComShowMessage(   "<%= JSPUtil.replace(JSPUtil.replace(message,"\n",""),"\"","'") %>" );
<% } else if(( message!=null )&&( message.length()>0 )){ %>
	ComShowMessage(   "<%= JSPUtil.replace(JSPUtil.replace(message,"\n",""),"\"","'") %>" );
<% }  %>

<% if(account == null && ssoEnabled.equals("FALSE")) { %>
	with(document.all)
	{
			eval("t_username      " ).value="<%= cookieUserId %>";
			if ("<%=cookieUserId%>".length>0) {
					eval("t_password      " ).focus();
			}else{
					eval("t_username      " ).focus();
			}
	}
<% } %>
	}
	
}


function common_pop() {
	window.open('/opuscntr/sample/bizcommon/index.html','');
}

function signature(on_off) {
	try {
		if ( window.opener && !window.opener.closed ) {
			if ( window.opener.parent ) {
				window.opener.top.signature(on_off);
			} else {
				window.opener.signature(on_off);
			}
			self.close();
		} else {
			document.location.href = "/opuscntr/Sign"+on_off+".do";
		}
	} catch(e) {
		document.location.href = "/opuscntr/Sign"+on_off+".do";
	}
}
function ComIsSheetTag(sheetid){
    try {
       var sTag = "";
       sTag += '<OBJECT ID="'+sheetid+'"\n';
       sTag += ' CLASSID="'+CLSID_IBSHEET+'"> \n';
       sTag += ' <param name="Visible" value="false"> \n';
       sTag += '</OBJECT>';
       document.write(sTag);
    } catch(err) { ComFuncErrMsg(err.message); }
}	

function installComboTag(){
//	location.href = "noticeIbsheet.jsp";
     try {
       var sTag = "";
		   var COMBO_VERSION = "1,5,10,11";
		   var CLSID_IBMCOMBO = "CLSID:D9FA9278-6363-4906-A14E-0AFB460CEA90";
  	   var CODEBASECOMBO = "/opuscntr/sheet/IBMultiComboU.CAB#version="+COMBO_VERSION;
       sTag += '<OBJECT id="ibCombo" \n';
       sTag += '        CLASSID="'+CLSID_IBMCOMBO+'" \n';
       sTag += '        CODEBASE="' + CODEBASECOMBO + '" > \n';
       sTag += ' <param name="Visible" value="false"> \n';
       sTag += '</OBJECT> \n';
        document.write(sTag);
     } catch(err) { ComFuncErrMsg(err.message); }
    
 }	

	function showAlertMessage()
	{
		if ( getCookie( "alertMessage" ) != 'done1' ) {
			 //document.getElementById("alert01").style.visibility = 'visible';
			
			// 공지사항 중지
			document.getElementById("alert01").style.visibility = 'hidden';
		}else{
			document.getElementById("alert01").style.visibility = 'hidden';
		}
	}
	
	function messageConfirm() {
		var no_more = document.getElementById("no_more").checked;
		if ( no_more )
		{ 
			setCookie('alertMessage', 'done', 1);
		}
		document.getElementById("alert01").style.visibility = 'hidden';
	}	
	function setCookie( name, value, expiredays )
	{
		var todayDate = new Date();
		todayDate.setDate( todayDate.getDate() + expiredays );
		document.cookie = name + "=" + escape( value ) + "; path=/; expires=" + todayDate.toGMTString() + ";";
	} 
 
	function getCookie(name) {
		var nameOfCookie = name + "=";
		var x = 0;
		while (x <= document.cookie.length) {
			var y = (x + nameOfCookie.length);
			
			if (document.cookie.substring(x, y) == nameOfCookie) {
				if ((endOfCookie = document.cookie.indexOf(";", y)) == -1)
				{
					endOfCookie = document.cookie.length;
				}
				return unescape(document.cookie.substring(y, endOfCookie));
			}
			x = document.cookie.indexOf(" ", x) + 1;
			if (x == 0)
				break;
		}
		return "";
	}

	
 	function changeOffice(obj){
 	 	if(openWindowsCount.length != 0 ){
 	 	 	if(confirm("To login to another office, all open OPUS windows must be closed.   \nPlease make sure that you completed your job with the OPUS windows. \nIs it ok to close all open windows?"))
 	 	 	{
 	 	 		submitChangeOffice(obj);
 		 	 	for( var i = 0; i < openWindowsCount.length; i++)
 		 	 	{
 					var windowsopen = openWindowsCount[i];
 					windowsopen.CloseAllChild();
 		 	 	}
 	 	 	 		
 	 	 	}else{
 	 	 	 	obj.value = '<%= account != null ? account.getOfc_cd() : "" %>';
 	 	 	}
 	 	}else{
 	 		submitChangeOffice(obj);
 	 	}
	}

	function submitChangeOffice(obj){
	 		signature('On');
	 		document.forms[0].action="MainPage.do";
	 		document.forms[0].usr_chg_ofc_cd.value = obj.value
	 	 	document.forms[0].submit();
	}

	
var focusUserName = false;
var focusPassword = false;
function checkFocus(obj){
	if(obj.name == "t_username"){
		if( focusUserName == false && "<%=cookieUserId%>".length<=0){
			obj.value = ""
			focusUserName = true;
		}
	} 
 
}


</script>
<SCRIPT LANGUAGE="javascript" FOR="document" EVENT="onkeyup">
<!--
		/****************************
		 enterKey 처리
		*****************************/
		try {
			if (window.event.keyCode!=13) return;
			var srcName=window.event.srcElement.getAttribute("name");
			with(document.all)
			{
				switch(srcName)
				{
					case "t_password":
						 submitForm();
						 break;
					case "t_username":
						 eval("t_password").focus();
						 break;
		            case "s_password":
		            	goSubmit();
		            	break;
					case "s_username":
						 eval("s_password").focus();
						 break;
				}// end switch
			}// end with
		}catch(e) {
		}
		

//-->
</SCRIPT>
<style type="text/css">
table {
	font-family:Tahoma, Geneva, sans-serif;
	color:#d7d7d7;
	font-size: 10px;
}
input.input {
	border:solid 1PX #bbcbde;
	font-family:Tahoma, Geneva, sans-serif;
	font-size:10px;
	color:#8298ba;
	font-weight:bold;
	height:21px;
	padding-top:2px;
	padding-left:4px;
}
img {
	border:0px;
}
</style>
</head>
<body onload="setupPage();">
<form  name="existingcustomer" action="j_signon_check.do" method="POST">
<input type="hidden" name="j_remember_username" value="Y">
<input type="hidden" name="FORM_ACTION_TYPE"    value="">
<input type="hidden" name="FORM_ERR_KIND"       value="<%= error_kind %>">
<input type="hidden" name="annNo"    value="">
<input type="hidden" name="j_username">
<input type="hidden" name="j_password">
<input type="hidden" name="local_lang_type" value="<%=lang_tp_cd%>">
<!-- SSO관련 변경 INPUT 추가 -->
<input type="hidden" name="USER">
<input type="hidden" name="PASSWORD">
<input type="hidden" name="smagentname" value="<%=smAgentName %>">
<input type="hidden" name="TARGET" value="<%=ssoTargetUrl %>">
<input type="hidden" name="smauthreason" value="0">
<input type="hidden" name="usr_chg_ofc_cd" value="0">
</form>
<table border="0" cellpadding="0" cellspacing="0" width="100%" height="100%" >
    <tr>
        <td height="100%" valign="top" background="img/bgimg.jpg" bgcolor="#ececec" style="background:url(./img/main_img/bgimg.jpg) repeat-x #ececec;"><!--플래쉬 Start-->
            <table border="0" cellpadding="0" cellspacing="0" width="100%">
                <tr>
                    <td style="background:url(./img/main_img/bg_visual.jpg) no-repeat right; height:554px; text-align:center;"><table width="942" border="0" align="center" cellspacing="0" cellpadding="0">
                            <tr>
                                <td><script type="text/javascript">
						var	now = new Date().getTime();//브라우저 캐시설정
						setEm = new setEmbed();
						setEm.init('./img/main_img/main.swf','942','555', 'mainSWF');		
						setEm.param('allowScriptAccess','sameDomain');
						setEm.param('allowFullScreen','false');
						setEm.param('wmode', 'transparent');
						//setEm.param('FlashVars','xmlRoute=./xml/left.xml&route=&pageNum=010101;');
						setEm.show();
					</script></td>
                            </tr>
                        </table></td>
                </tr>
            </table>
            <!--플래쉬 End--></td>
    </tr>
    <tr>
        <td height="320" align="right" valign="top" bgcolor="#ececec" style="text-align:center"><!--로그인 Start-->

<% 
if (account != null) { 
	boolean adminAuth = false;
	// SELHO이외의 지역 Super 유저는   Administer는 접속못하고 무조건 Security로만 들어가서 Role 부여만 가능하다.
	// 2009.08.24 by desis
	// super user 관리 화면에서  admin flag 가 Yes 인 사용자만 admin 버튼이 활성화 됨
	// 2010.05.06 updated by desis
	//String RHQ = (new OrganizationUtil()).getHeadQuaterCode(account.getUsr_id());
	String adminFlag = (new UserRoleUtil()).getUserAdminFlag(account.getUsr_id());
	if ( account.getUsr_auth_tp_cd().equals("A") ) adminAuth = true;
	else if ( account.getUsr_auth_tp_cd().equals("E") ) adminAuth = true;
	else if ( account.getUsr_auth_tp_cd().equals("S") ) {
		if ( adminFlag.equals("Y") ) adminAuth = true;
		else adminAuth = false;
	} else adminAuth = false;
%>

            <table width="942" border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
               		 <td width="200" height="37" style="text-align:left; padding-left:16px; ">
						<%=account.getUsr_nm() %>&nbsp;&nbsp;&nbsp;<br />
						<%//account.getOfc_cd() %>
			<%
			if(account!=null){
		%>
		
			<mainpage:OfficeChangeList 
 					userId="<%=account.getUsr_id() %>"
 					usrNm="<%=account.getUsr_nm() %>"
 					ofcCd="<%= account.getOfc_cd() %>"
 					styleValue=""
 					classValue=""
 					nameValue="s_usr_chg_ofc_cd"
 					functionValue="onChange='changeOffice(this)'"
 			/>
			&nbsp;&nbsp;&nbsp;
		<%
			}
		%>			
               
                         </td>
                    <td style="text-align:left;"><a href="#" onClick="javascript:signature('Off');"><img src="./img/main_img/btn_logout.gif" ></a><img src="./img/main_img/img_bar.gif" alt="bar" hspace="8" >
                    <% if (adminAuth) { %>
						<img src="./img/main_img/btn_admin.gif" alt="" border="0"   style="cursor:hand;" onClick="module_pop('<%=adminPgmNo %>')">
					<% } %>	
					<% if (comPopupEnabled.equals("TRUE")) { %>
						<img src="./img/main_img/btn_comm.gif"  alt="" border="0"   style="cursor:hand;" onClick="common_pop()">
					<% } %>	
						<select name="languageType" id="languageType" style="width: 60px;">
                    		<option value="ENG" <%if("ENG".equals(lang_tp_cd)){ %>selected="selected"<%} %>>-- 선택 --</option>
                    		<option value="EN" <%if("EN".equals(lang_tp_cd)){ %>selected="selected"<%} %>>EN</option>
                    		<option value="KR"  <%if("KR".equals(lang_tp_cd)){ %>selected="selected"<%} %>>KR</option>
                    		<option value="CN" <%if("CN".equals(lang_tp_cd)){ %>selected="selected"<%} %>>CN</option>
                    	</select>
                    	<select name="solutionType"  style="width: 60px;" onChange="solution_pop()">
                    		<option value="" selected="selected">-- SELECT --</option>
                    		<option value="OPS_SPC_M001">TPCEC</option>
                    		<option value="OPS_KBK_M0001">KAMBARA KISEN</option>
                    	</select>
                    	
<%--  						<fmt:setLocale value="<%=//lang_tp_cd%>"/> --%>
<%--                     	<fmt:setBundle basename="screenlabel"/> --%>
<%--                    		<fmt:message key="lang.pageTitle"></fmt:message> --%>
                    </td>
                </tr>
            </table>

<% } else { %>

            <table width="942" border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                    <td width="275" height="37" style="text-align:left; padding-left:16px; ">
						<input name="t_username" id="t_username" value="USER ID" class="input" onFocus="checkFocus(this);">
                        
                        <input name="t_password" id="t_password" value="" class="input" type="password" >
                        </td>
                    <td style="text-align:left; vertical-align: middle;" width="60px;">
                    	<a href="#" onClick="submitForm();"><img src="./img/main_img/btn_login.gif" alt="Login" ></a>
                    </td>
                    <td style="text-align:left;" class="input">
                    	<select name="languageType" id="languageType" style="width: 60px;">
                    		<option value="ENG" selected="selected">-- 선택 --</option>
                    		<option value="EN">EN</option>
                    		<option value="KR">KR</option>
                    		<option value="CN">CN</option>
                    	</select>
                    </td>
                </tr>
            </table>
<% }  %>
            <!--로그인 End-->
            <!--Copyright/즐겨찾기 Start-->
            <table width="942" border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                    <td height="15" style="text-align:left; padding-left:16px;"><a href="#"><img src="./img/main_img/img_search.gif" alt="id pass search" width="275" height="15" border="0"><img src="./img/main_img/img_copyright.gif" alt="id pass search" width="390" height="15" border="0"></a></td>
                </tr>
                <tr>
                    <td height="10" style="text-align:left; padding-left:16px;">&nbsp;</td>
                </tr>
            </table>
            <!--Copyright/즐겨찾기 End--></td>
    </tr>
    <tr>
        <td align="right" valign="top" bgcolor="#ececec" height="50" style="background:url(./img/main_img/bg_bottom.jpg) no-repeat right; height:143px; text-align:center;"></td>
    </tr>
</table>
</body>
		<div id="base" style="display:none">
	     <script language="javascript">ComIsSheetTag('sheet');</script>

	     <script language="javascript">installComboTag();</script>
		</div>
		
		
		
		
		


<!-------------------- Alert Layer -------------------->

<div id="alert01" style="position: absolute; Z-INDEX: 2; top: 30px; left: 130px; width: 600px; height: 400px; visibility: hidden;">
<style type="text/css">
/* Grid Type2 ( Table Style 2 ) */
TABLE.Grid7		 		{ border-collapse: collapse; background-color: #A6C3CB; color: #272727; border: 1px solid #E8EFF9; }
TABLE.Grid7 TD			{ padding:0px; text-indent: 3px; height:23; word-break : 
						break-all; font-family: Tahoma,verdana,Arial,dotum,gulim; font-size: 11px; padding-right:3px; }
	 .align_r			{ text-align:right;}
	 .tr7_head			{ background-color: #E8EFF9; color: #313131; text-align : center; font-weight:bold; border: 1px solid #E8EFF9; width:100%;}
	 .tr7_head_l		{ background-color: #E8EFF9; color: #313131; text-align : left; font-weight:bold; border: 1px solid #E8EFF9; width:100%;}
	 .tr7_head2			{ background-color: #EBF6F9; text-align:center; color: #313131; font-weight:normal; border: 1px solid #E8EFF9; width:100%;}
	 .tr7_head3			{ background-color: #F7E1EC; font-weight:normal; border: 1px solid #E8EFF9; width:100%;}
	 .tr7_head4			{ background-color: #FAD26B; font-weight:normal; border: 1px solid #E8EFF9; width:100%;}
</style>
<table align="center" width="600" style="background-color: #9999cc;">
<tr>
	<td valign="top"><!-- : ( Search Options ) (S) -->
		<table class="search" style="width: 100%; border: 1px solid #E8EFF9;" align="center">
		<tr>
			<td class="bg">
				<table class="search" border="0">
				<tr class="h23">
					<td style="font-size: 14px; color: #871DEB;font-weight:bold;"> 디자인 관련 공지  </td>
				</tr>
				<tr class="h23">
					<td colspan="2">
						<table cellpadding="0" cellspacing="0"> 
						<tr> 
							<td width="56%">
							 	<img src="/opuscntr/img/announcements/pop_up_attention.jpg" width="600" height="500" ></img>	
							</td>
						</tr> 
						</table>
					</td>
				</tr>
				</table>
			</td>
		</tr>
		</table>
		<!-- : ( Button : pop ) (S) -->
		<table width="100%" class="sbutton">
		<tr>
			<td height="" class="popup">
				<table width="100%" class="search" border="0" cellpadding="0" cellspacing="0" style="padding-top: 0; , padding-bottom: 0;">
				
				<tr>
					<td><input class="Trans" type="checkbox" name="no_more" /> Today, Message window will not be opened any more.</td>
					<td class="btn3_bg">
						<table border="0" cellpadding="0" cellspacing="0">
						<tr>
							<td width="72">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
								<tr>
									<td class="btn1_left"></td>
									<td class="btn1" onClick="messageConfirm('NO','NO');">OK</td>
									<td class="btn1_right"></td>
								</tr>
								</table>
							</td>
						</tr>
						</table>
					</td>
				</tr>
				</table>
			</td>
		</tr>
		</table>
	</td>
</tr>
</table>

</div>
<!-------------------- Alert Layer -------------------->

		
</html>