<!DOCTYPE html>
<%@page import="com.clt.framework.component.util.StringUtil"%>
<html lang="en">
<head>
<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : template.jsp
*@FileTitle  : template
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================
--%>
<%@ page language="java" pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ page import="java.util.ArrayList"%>
<%@ taglib uri="/WEB-INF/template.tld" prefix="template"%>
<%@ page
    import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page
    import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.support.view.menu.MenuBean"%>
<%@ page import="com.clt.framework.support.view.menu.MenuProcessor"%>
<%@ page import="com.clt.framework.support.view.menu.MenuEventResponse"%>
<%@ page import="com.clt.framework.core.view.template.Parameter"%>
<%@ page import="com.clt.framework.core.view.template.Screen"%>
<%@ page import="com.clt.framework.core.controller.util.WebKeys"%>
<%-- 다국어 관련 추가 부분 --%>
<%@ page import="com.clt.framework.support.view.signon.web.SignOnFilter"%>
<%
    SignOnUserAccount acc = new SignOnUserAccount("OPUSADM", "OPUSADM", "OPUSADM", "Y", "", "", "", "E", "OPUSADM", "", "OPUSADM", "", "SINHO", "SINHO", "", "A", "", "", "", "", "", "");
	acc.setUsr_theme("1");
	
	session.setAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT, acc);
	
	SignOnUserAccount account = (SignOnUserAccount) session
			.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);

	String pgmNo = "";
	String title = "";
	String description = "";
	String navigation = "";
	try {
		pgmNo = (String) request.getAttribute("UI_NUMBER");
		title = (String) request.getAttribute("UI_TITLE");
		description = (String) request.getAttribute("UI_DESCRIPTION");
		navigation = ((String) request.getAttribute("UI_NAVIGATION"))
				.substring(10);

	} catch (Exception e) {
	}

	Screen screen = (Screen) request
			.getAttribute(WebKeys.CURRENT_SCREEN);
	Parameter param = (Parameter) screen.getParameter("body");
	String jsPath = param.getValue();

	jsPath = jsPath.replaceAll("\\.jsp", "\\.js");
%>
<%@page import="java.util.HashMap"%>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<!-- Mobile meta tag(S) -->
<!-- <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no, target-densitydpi=medium-dpi"> -->
<meta name="format-detection" content="telephone=no" />
<!-- Mobile meta tag(E) -->
<link rel="shortcut icon" href="/opuscntr/img/favicon.ico"
    type="image/x-icon" />
<title>Cyberlogitec : OPUS Container</title>
<%
	String userTheme = account.getUsr_theme();
	if ("1".equals(userTheme)) {
		out.print("<link id=\"theme\" value=\"default\" href=\"style/css/theme_default.css\" rel=\"stylesheet\" type=\"text/css\">");
	} else if ("2".equals(userTheme)) {
		out.print("<link id=\"theme\" value=\"blue\" href=\"style/css/theme_blue.css\" rel=\"stylesheet\" type=\"text/css\">");
	} else {
		out.print("<link id=\"theme\" value=\"default\" href=\"style/css/theme_default.css\" rel=\"stylesheet\" type=\"text/css\">");
	}
%>
	<!-- 제품 include -->
	<script type="text/javascript" src="js/ibleaders.js"></script>
	<script type="text/javascript" src="js/ibtab/ibmditab.js?version=U2"></script>
	<script type="text/javascript" src="js/ibtab/ibmditabinfo.js?version=U2"></script>
	<script type="text/javascript" src="js/ibtab/ibmditabscroll.js?version=U2"></script>
	<script type="text/javascript" src="js/ibsheet/ibsheet.js?version=U6"></script>
	<script type="text/javascript" src="js/ibcombo/ibmulticombo.js?version=U5"></script>
	<script type="text/javascript" src="js/ibcombo/ibmulticomboinfo.js?version=U2"></script>
	<script type="text/javascript" src="js/ibupload/ibupload.js?version=U3"></script>
	<!-- 제품 include -->
	<!-- common js include -->
	<script type="text/javascript" src="style/js/jquery-1.11.0.min.js?version=U2"></script>
	<script type="text/javascript" src="style/js/jquery-ui.js?version=U2"></script>
	<script type="text/javascript" src="style/js/opus_ui.js?version=U2"></script>
	<script type="text/javascript" src="js/common/CoAxon.js?version=U2" path="<%=jsPath%>" msgkey="<%=WebKeys.TRANS_RESULT_KEY%>"></script>
	<script type="text/javascript" src="js/common/CoCommon.js?version=U2"></script>
	<script TYPE="text/javascript" SRC="js/common/CoMessage.js?version=U5"></script>
	<script type="text/javascript" src="js/common/CoFormControl.js?version=U3"></script>
	<script type="text/javascript" src="js/common/CoPopup.js?version=U2"></script>
	<script type="text/javascript" src="js/common/CoCalendar.js?version=U2"></script>
	<script type="text/javascript" src="js/common/CoObject.js?version=U9"></script>
	<script type="text/javascript" src="js/common/IBSheetInfo.js?version=U4"></script>
	<script type="text/javascript" src="js/common/CoBiz.js?version=U2"></script>
	<script type="text/javascript" src="js/common/CoMail.js?version=U2"></script>
	<script type="text/javascript" src="js/common/CoUpload.js?version=U2"></script>
	<script type="text/javascript" src="js/common/OfficeCodeMgr.js?version=U2"></script>
	<script type="text/javascript" src="js/common/ConstantMgr.js?version=U2"></script>
	<script type="text/javascript" src="/opuscntr/rpt/script/common_rd.js?version=U5"></script>
	<!-- common js include -->

	<!--M2Soft(RD) 제품 include -->
	<link rel="stylesheet" type="text/css" href="rpt/css/crownix-viewer.min.css?version=U2">
	<script type="text/javascript" src="rpt/js/crownix-viewer.min.js?version=U2"></script>
	<!--M2Soft(RD) 제품 include -->

<script type="text/javascript">
	// program no, program name, program navigation
	var curPgmNo = "<%=pgmNo%>";
	var curTitle = "<%=title%>";
	var curDescription = "<%=description%>";
	var curNavigation = "<%=navigation%>";
	//input 편집시 Masking과 ValidationCheck 처리. OnKeyUp을 통해 처리

	//khlee-브라우저에서 단축키로 Backspace를 누르면  자동으로 페이지 뒤로 가기 되어 버리는 문제를 해결하기 위함
	document.onkeydown = document_onkeydown;
	function document_onkeydown() {
		try {
			if (ComGetEvent("keycode") != 8)
				return true;
			var se = ComGetEvent();
			if (se.readOnly != null && !se.readOnly)
				return true;
			if (se.readOnly)
				ComJsEventStop();
			if (se.disabled)
				ComJsEventStop();
			if (se.isTextEdit != null && se.isTextEdit)
				return true;
			if (se.isContentEditable != null && se.isContentEditable)
				return true;
			ComJsEventStop();
			return false;
		} catch (err) {
			return false;
			//ComFuncErrMsg("Backspace 방지 처리 에러\n" + err.message);
		}
	}
</script>
<script>
	function updateThemeOne() {
		$.ajax({
			url : "UpdateThemeOne.do"
		});
		var theme = document.getElementById("theme");
		theme.value = "default";
		theme.href = "style/css/theme_default.css";
	}
	function updateThemeTwo() {
		$.ajax({
			url : "UpdateThemeTwo.do"
		});
		var theme = document.getElementById("theme");
		theme.value = "blue";
		theme.href = "style/css/theme_blue.css";
	}
	function refreshBookmark() {
		document.getElementById("ifbookmark").src = "viewBookmark.screen";
	}
	function logout() {
		if(confirm('You will be logged out. Do you want to proceed?')){
			alert("Related tabs will be closed.");
			localStorage.setItem("storage", "logout:" + new Date());
			window.open('about:blank', '_self').close();
		}
	}

	function message(id, name, content) {
		try {
			var iWidth = 700;
			var iHeight = 580;
			var leftpos = (screen.width - iWidth) / 2;
			if (leftpos < 0)
				leftpos = 0;
			var toppos = (screen.height - iHeight) / 2;
			if (toppos < 0)
				toppos = 0;
			var sFeatures = "status=no, width=" + iWidth + ", height="
					+ iHeight + ", resizable=no, scrollbars=no, left="
					+ leftpos + ", top=" + toppos;
			var parameter = "?rcvrId=" + id + "&rcvrNm=" + encodeURI(name)
					+ "&msgCtnt=" + encodeURI(content);
			var winObj = window.open("Message.do" + parameter, "", sFeatures);
			winObj.focus();
			return winObj;
		} catch (err) {
			alert(err.message);
		}
	}
	function messageConfirm(arch, del) {
		var msg_id = document.getElementById("message_id").value;
		var no_more = document.getElementById("no_more").checked;
		document.getElementById("msgChk").src = 'MessageCheck.do?f_cmd=4&div=RCV&rcvDt=OK&msgId='
				+ msg_id + '&kepFlg=' + arch + '&deltFlg=' + del;
		parent.document.getElementById("ifalert01").style.visibility = 'hidden';
		parent.document.getElementById("alert01").style.visibility = 'hidden';
		if (no_more)
			setCookie('messagePop', 'done', 1);
	}
	function setCookie(name, value, expiredays) {
		var todayDate = new Date();
		todayDate.setDate(todayDate.getDate() + expiredays);
		document.cookie = name + "=" + escape(value) + "; path=/; expires="
				+ todayDate.toGMTString() + ";"
	}
	function startCheck() {
		document.getElementById("msgChk").src = "MessageCheck.do?f_cmd=101";
	}
</script>
<script>
	function onStorageEvent(storageEvent) {
		window.open('about:blank', '_self').close();
	}

	window.addEventListener('storage', onStorageEvent, false);
</script>
<%
	// Chrome Cache 제어를 위해 추가. 업무단 js는 1일 1회 서버에서 다시 읽어 들임.
	java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat(
			"yyyyMMddHH");
	String basedate = dateFormat.format(new java.util.Date());

	//3.업무js, 업무공통js 포함 Logic 
	if (jsPath != "") {
		String[] s = jsPath.split("/");
		StringBuilder js_path = new StringBuilder();

		//배열의 앞뒤로 하나씩 자르고, 나머지가 폴더임
		for (int i = 0; i < s.length - 2; i++) {
			js_path.append(s[i] + "/");
			/*
			 * 20120112 added by Jun Sung, KIM 다국어 지원 관련 추가.
			 * 	국가별 code ( kr , en 등등) 값을 붙이기 위해서 jsFileNm 이라는 변수를 새로 선언함.
			 */
			String sFirst = s[i].substring(0, 1);
			String jsFileNm = "Co" + sFirst.toUpperCase()
					+ s[i].substring(1);
			/*
			 * 다국어 지원 end
			 */

			/*시스템공통자바스크립트파일과, 서브시스템공통자바스크립트 파일을 incldue 한다.
			 * <script src="js/CoAxon.js" path="apps/enis/esm/agt/agtaudit/agtaudit/jsp/ESM_AGT_010.js">
			 * 시스템공통js파일     : apps/enis/esm/CoEsm.js
			 * 서스시스템공통js파일 : apps/enis/esm/agt/CoAgt.js
			 * 업무 그룹 공통 js 호출 부분임.
			 */
			if (i >= 2 && i <= 3) {
				//파일명 = "Co" + 시스템명(첫글자대문자) + ".js"
				if ("CoMail".equals(jsFileNm)) {
					out.println("<script language=\"javascript\" type=\"text/javascript\" src=\"js/common/CoMail.js?basedate="
							+ basedate + "\"></script>");
				} else {
					out.println("<script language=\"javascript\" type=\"text/javascript\" src=\""
							+ js_path.toString()
							+ jsFileNm
							+ ".js?basedate="
							+ basedate + "\"></script>");
				}
			}
		}

		//업무 자바스크립트 파일을 include 한다.
		String[] ss = s[s.length - 1].split("\\.");
		js_path.append("script/" + ss[0]);
		out.println("<script language=\"javascript\" type=\"text/javascript\" src=\""
				+ js_path.toString() + ".js?basedate=" + basedate + "\"></script>");
	}
%>
<!-- Print settings(S) -->
<style type="text/css" media="print">
@page {
    size: auto;
    margin: 1em;
}

.favorite_links, .preferences, .fullmenu_wrap {
    display: none !important;
}

.page_title_area .opus_design_btn button {
    border: 1px solid #2979ce;
}

.page_title_area .opus_design_btn button {
    border: 1px solid #2979ce;
}

.page_title_area .opus_design_btn button[disabled] {
    border-color: #e1e5e9
}

.header_fixed {
    display: table;
    width: 100%
}
</style>
<!-- Print settings(E) -->

</head>
<body onload="setupPage();startCheck();">
    <input type="hidden" name="curPgmNo" id="curPgmNo" value="<%=pgmNo%>">
    <input type="hidden" name="uiTitle" id="uiTitle" value="<%=title%>">
    <input type="hidden" name="prntPgmNo" id="prntPgmNo" value="<%=StringUtil.xssFilter(request.getParameter("pid"))%>">
    <!-- HEADER_FIXED (top fixed area) (S) -->
    <div class="header_fixed">
        <!-- util_bar : 상단 로고영역(바) -->
        <div class="util_bar">
            <h1 class="logo ir">OPUS Container:TM</h1>
            <iframe id="msgChk"></iframe>
            <!-- util_contents(S) -->
            <div class="util_contents">
                <!-- user_info_div(S) -->
                <div class="user_info_div">
                    <span class="user_info"><img id="messageBox"
                        src="img/new_sub/img_topmenu_message_01.gif"
                        width="24" height="13" alt="" border="0"
                        class="cursor"
                        onclick="message('null','null','null');"><strong
                        id="newCnt">0</strong></span>
                    <!--  
                 -->
                    <span class="user_info"><span>NAME</span><%=account.getUsr_nm()%></span>
                    <!-- 
                 -->
                    <span class="user_info user_msg"><span>ID</span><%=account.getUsr_id()%></span>
                    <!-- 
                 -->
                    <span class="user_info"><span>OFFICE</span><%=account.getOfc_cd()%></span>
                    <!-- 
                 -->
                    <button type="button" onclick="logout();"
                        class="btn_logout">LOGOUT</button>
                </div>
                <!-- user_info_div(E) -->
                <!-- layout_change(S) -->
                <div class="layout_change">
                    <button type="button"
                        class="layout_default now_layout">
                        <span></span>
                    </button>
                    <button type="button" class="layout_hide">
                        <span></span>
                    </button>
                </div>
                <!-- layout_change(E) -->
                <!-- util_btns(S) -->
                <div class="util_btns">
                    <button type="button" class="util_full ir">
                        <span>Full menu</span>
                    </button>
                    <button type="button" class="util_fav ir">
                        <span>Favorite link</span>
                    </button>
                    <button type="button" class="util_setting ir">
                        <span>Preferences</span>
                    </button>
                </div>
                <!-- util_btns(E) -->
            </div>
            <!-- util_contents(E) -->

            <!-- preferences(S) -->
            <div class="preferences">
                <h2>Preferences</h2>

                <!-- theme(S) 테마 임시 삭제  -->
                <!-- <h3>Themes</h3>
				<ul>
					<li>
					   <input type="radio" id="theme_default" name="theme" value="Theme1" onclick="updateThemeOne()"/>
					   <label for="theme_default">Theme White</label>
					</li>
					<li>
					   <input type="radio" id="theme_blue" name="theme" value="Theme2" onclick="updateThemeTwo()"/>
					   <label for="theme_blue">Theme Blue</label>
					</li>
				</ul> -->
                <!-- theme(E) -->

                <!-- Download(S) -->
                <h3>Download Report Designer Installer</h3>
                <ul>
                    <li><a
                        href="/opuscntr/rpt/CX60_Plugin_u_setup.exe">Report
                            Designer Install File</a></li>
                </ul>
                <!-- Download(S) -->
            </div>
            <!-- preferences(E) -->

            <!-- favorite_links(S) -->
            <div class="favorite_links">
                <iframe id="ifbookmark"
                    style="width: 100%; height: 600px;"></iframe>
            </div>
            <!-- favorite_links(E) -->
        </div>
        <!-- //util_bar -->
    </div>
    <!-- HEADER_FIXED (top fixed area) (E) -->

    <!-- page_title_area (S) -->
    <!-- page_title_area (E) -->

    <!-- GNB (Global Navigation Bar) : (S) -->
    <button type="button" class="btn_gnb_hide ir">
        Global navigation bar show/hide<span></span>
    </button>
    <!-- //GNB -->

    <!-- 메인 화면(body):(S) -->
    <div class="wrap">
        <template:insert parameter="body" />
    </div>
    <!-- 메인 화면(body):(E) -->
</body>
</html>