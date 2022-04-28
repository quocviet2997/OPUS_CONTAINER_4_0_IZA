<!DOCTYPE html>
<%@page import="com.clt.framework.component.util.StringUtil"%>
<html lang="en" class="pop_html">
<head>
<%--
==============================================================================
'주  시 스 템  :
'서브  시스템  :
'프로그램 ID  :
'프로그램 명   :
'프로그램개요  : screen화면을 구성하는 기본 조합 문서이다.
'문서 특이사항 : 자바스크립트 공통함수및 공통 CSS는 이곳에서 include 한다.
'수정 사항     : 프로토타이핑 중으로 메뉴정책이 미결정되어 스크립트만 정의된 기본템플릿으로 수정
==============================================================================
--%>
<%@ taglib uri="/WEB-INF/template.tld" prefix="template"%>
<%@ page contentType="text/html;charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@ page import="com.clt.framework.core.controller.util.WebKeys"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.framework.core.view.template.Screen"%>
<%@ page import="com.clt.framework.core.view.template.Parameter"%>
<%@ page import="com.clt.framework.support.view.menu.MenuProcessor"%>
<%@ page import="com.clt.framework.core.controller.util.WebKeys"%>

<!-- 다국어 관련 추가 부분 -->
<%@ page import="com.clt.framework.support.view.signon.web.SignOnFilter" %>

<%
	SignOnUserAccount account = (SignOnUserAccount) session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);

	Screen screen = (Screen) request.getAttribute(WebKeys.CURRENT_SCREEN);
	Parameter param = (Parameter) screen.getParameter("body");
	String jsPath = param.getValue();

	jsPath = jsPath.replaceAll("\\.jsp", "\\.js");
	//System.out.println("jsPath2=" + jsPath);
	String pgmNo = "";
	String title = "";
	String description = "";
	String navigation = "";
	try {
		pgmNo = (String) request.getAttribute("UI_NUMBER");
		title = (String) request.getAttribute("UI_TITLE");
		description = (String) request.getAttribute("UI_DESCRIPTION");
		navigation = ((String) request.getAttribute("UI_NAVIGATION")).substring(10);
	} catch (Exception e) {
		try{
			pgmNo = StringUtil.xssFilter(request.getParameter("pgmNo")) != null ? StringUtil.xssFilter(request.getParameter("pgmNo")) : "";
			MenuProcessor menuProcessor = new MenuProcessor();
			menuProcessor.init(null);
			menuProcessor.processEventNavigation(request);
			menuProcessor.doEnd();
			HashMap menu = (HashMap) request.getAttribute("MenuInformation");
			title = (String) menu.get("title");
			description = (String) menu.get("description");
			navigation = ((String) menu.get("navigation")).substring(10);
		}catch(Exception ee) {;}
	}

%>
<!-- <template:insert parameter="title" /> -->
<%@page import="java.util.HashMap"%>
		<meta charset="utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<!-- Mobile meta tag(S) -->
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no, target-densityDpi=medium-dpi">        <meta name="format-detection" content="telephone=no" />
		<!-- Mobile meta tag(E) -->
		<link rel="shortcut icon" href="/opuscntr/img/favicon.ico" type="image/x-icon" />
		<title>Cyberlogitec : OPUS Container</title>
		
		<%
			String userTheme = account.getUsr_theme();
			if("1".equals(userTheme)){
				out.print("<link id=\"theme\" href=\"style/css/theme_default.css\" rel=\"stylesheet\" type=\"text/css\">");
			}else if("2".equals(userTheme)){
				out.print("<link id=\"theme\" href=\"style/css/theme_blue.css\" rel=\"stylesheet\" type=\"text/css\">");
			}else{
				out.print("<link id=\"theme\" href=\"style/css/theme_default.css\" rel=\"stylesheet\" type=\"text/css\">");
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
		<SCRIPT TYPE="text/javascript" SRC="js/common/CoMessage.js?version=U5"></SCRIPT>
		<script type="text/javascript" src="js/common/CoFormControl.js?version=U3"></script>
		<script type="text/javascript" src="js/common/CoPopup.js?version=U2"></script>
		<script type="text/javascript" src="js/common/CoCalendar.js?version=U2"></script>
		<script type="text/javascript" src="js/common/CoObject.js?version=U4"></script>		
		<script type="text/javascript" src="js/common/IBSheetInfo.js?version=U4"></script>
		<script type="text/javascript" src="js/common/CoBiz.js?version=U2"></script>
		<script type="text/javascript" src="js/common/CoMail.js?version=U2"></script>
		<script type="text/javascript" src="js/common/CoUpload.js?version=U2"></script>
		<script type="text/javascript" src="js/common/OfficeCodeMgr.js?version=U2"></script>
		<script type="text/javascript" src="js/common/ConstantMgr.js?version=U2"></script>
		<script type="text/javascript" src="/opuscntr/rpt/script/common_rd.js?version=U4"></script>
		<!-- common js include -->
	
		<!--M2Soft(RD) 제품 include -->
		<link rel="stylesheet" type="text/css" href="rpt/css/crownix-viewer.min.css">
		<script type="text/javascript" src="rpt/js/crownix-viewer.min.js"></script>
		<!--M2Soft(RD) 제품 include -->

<%
	// Chrome Cache 제어를 위해 추가. 업무단 js는 1일 1회 서버에서 다시 읽어 들임.
	java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyyMMddHH");
	String basedate = dateFormat.format(new java.util.Date());

	//3.업무js, 업무공통js 포함 Logic 
	if (jsPath != ""){
		String[] s = jsPath.split("/");
		StringBuilder js_path = new StringBuilder();
 
		 //배열의 앞뒤로 하나씩 자르고, 나머지가 폴더임
		 for(int i=0; i< s.length-2; i++) {
			 js_path.append(s[i] + "/");
			/*
			 * 20120112 added by Jun Sung, KIM 다국어 지원 관련 추가.
			 * 	국가별 code ( kr , en 등등) 값을 붙이기 위해서 jsFileNm 이라는 변수를 새로 선언함.
			 *		jsFileNm => axon_assembler.include(js_path + "Co" + s[i].charAt(0).toUpperCase() + s[i].substr(1));
			 */ 
			 String sFirst = s[i].substring(0, 1);
		     String jsFileNm =  "Co" + sFirst.toUpperCase() + s[i].substring(1);
  			/*
			 * 다국어 지원 end
			 */
     
			/*시스템공통자바스크립트파일과, 서브시스템공통자바스크립트 파일을 incldue 한다.
			 * <script src="js/CoAxon.js" path="apps/enis/esm/agt/agtaudit/agtaudit/jsp/ESM_AGT_010.js">
			 * 시스템공통js파일     : apps/enis/esm/CoEsm.js
			 * 서스시스템공통js파일 : apps/enis/esm/agt/CoAgt.js
			 * 업무 그룹 공통 js 호출 부분임.
			 */
			if (i>=2 && i<=3) {
				//파일명 = "Co" + 시스템명(첫글자대문자) + ".js"
				if(!"CoFileupload".equals(jsFileNm)){
					if("CoMail".equals(jsFileNm)) {
						out.println("<script language=\"javascript\" type=\"text/javascript\" src=\"js/common/CoMail.js?basedate=" + basedate + "\"></script>");
					}
					else {
						out.println("<script language=\"javascript\" type=\"text/javascript\" src=\""+ js_path.toString() + jsFileNm +".js?basedate=" + basedate + "\"></script>");
					}
				}				
			}
 		}
		 
		//업무 자바스크립트 파일을 include 한다.
		String[] ss =  s[s.length-1].split("\\.");
		js_path.append("script/" + ss[0]);
		out.println("<script language=\"javascript\" type=\"text/javascript\" src=\""+ js_path.toString() +".js?basedate=" + basedate + "\"></script>");
	}
%>
<script>
//program no, program name, program navigation
var curPgmNo = "<%=pgmNo%>";
var curTitle = "<%=title%>";
var curDescription = "<%=description%>";
var curNavigation = "<%=navigation%>";

//input 편집시 Masking과 ValidationCheck 처리. OnKeyUp을 통해 처리
$(document).ready(function() {
	ComFormControlAxon();
});

//khlee-브라우저에서 단축키로 Backspace를 누르면  자동으로 페이지 뒤로 가기 되어 버리는 문제를 해결하기 위함
document.onkeydown=document_onkeydown;
function document_onkeydown(){
	try{			
        if(ComGetEvent("keycode")!=8) return true; 
		var se = ComGetEvent();
        if(se.readOnly!=null && !se.readOnly) return true;
		if (se.readOnly)  ComJsEventStop();
		if (se.disabled) ComJsEventStop();
        if (se.isTextEdit!=null && se.isTextEdit) return true;
        if (se.isContentEditable!=null && se.isContentEditable) return true;
        ComJsEventStop();
        return false;
	}catch(err) {
		return false;
	 	//ComFuncErrMsg("Backspace 방지 처리 에러\n" + err.message);
	}
}

var win_opener_button_create_obj ;
var win_opener_button_create_obj = window.dialogArguments;
if (!win_opener_button_create_obj)  win_opener_button_create_obj=window.opener; 


var wd = window.outerWidth; //브라우저 전체 사이즈
var he = window.outerHeight;

/* $(window).resize(function(){
	if(this.resizePopUp) {
		clearTimeout(this.resizePopUp);
	}
	this.resizePopUp = setTimeout(function() {
		this.resizeTo( wd, he);                             // Resizes the new window
	    this.focus();     // Sets focus to the new window
	}, 200);
}); */

</script>

</head>
<body class="body_main" onload="setupPage();">

		<template:insert parameter="body" />
		<!-- body 끝 -->
</body>
<script>
// desis-타이틀과 네비게이션 세팅
try {
	var appName = navigator.appName;
	if (appName.indexOf("Netscape") == -1) {
 		document.all.title.innerHTML = curDescription;
 		document.title = curDescription;
	} else {
 		document.getElementById("title").innerHTML = curDescription;
 		document.title = curDescription;
	}
}catch(err) {
 	;
}


if($("html").hasClass("layer_popup_document") == false) {

	if(!win_opener_button_create_obj){
    	$("html").addClass("layer_popup_document").prepend("<button type='button' class='pop_close ir' onclick='ComClosePopup();'>Close</button>");
	}
}

$( document ).ready(function() {
	setTimeout(function(){
		/***** 팝업 표준 지켜지지 않았을 경우 표준구조 강제 생성. (S) **************************************************************/ 
		if($(document).find(".layer_popup_title").length == 0) {
			$(document).find(".page_title_area").each(function(){
				if(!$(document).children("h2").hasClass("page_title")){ $(this).children("h2").addClass("page_title"); }
				$(document).next('.opus_design_btn').andSelf().wrapAll('<div class="layer_popup_title"/>');
			});
		}
		if($(document).find(".layer_popup_contents").length == 0) {
			$(document).find(".wrap_result").each(function(){
			    $(this).prev('[class^="wrap_search"]').andSelf().wrapAll('<div class="layer_popup_contents"/>');
			});
		}
		/***** 팝업 표준 지켜지지 않았을 경우 표준구조 강제 생성. (E) **************************************************************/
		
		var popupCont		= $(document.body).find(".layer_popup_contents");
		var popupContHeight = $(document.body).innerHeight();
		var popTitleHeight	= $(document.body).find(".layer_popup_title").innerHeight();
		
		//만에하나 최소한의 표준인  wrap_result 가 없을경우 강제생성. 
		if ($(popupCont).children(".wrap_result").length < 1) {
			$(popupCont).wrapInner("<div class='wrap_result'></div>");
		}
		
		var resultHeight 	= popupContHeight - $(popupCont).children(".wrap_result").position().top;
		
		
		// layer_popup_contents DIV가 최상위 부모가 아닐 경우 height 100% 처리
		if($(popupCont).parent()[0].tagName != "BODY") {
			$(popupCont).parent().css("height","100%");
		}
		
		// layerpopup contents area : 상단 TITLE + BUTTON 높이만큼 동적 padding(top) 지정
		$(popupCont).css("padding-top",popTitleHeight);
		
		// wrap_result Height 지정. ( copopup.js 에서 지정된 높이가 제대로 들어갔을 경우 SKIP ) 
		if($(popupCont).children(".wrap_result").position().top + resultHeight <=  popupContHeight) {
    		$(popupCont).children(".wrap_result").css("height",resultHeight-1);//border-bottom-width 1px
		}
	},10);
  });

</script>
<%@include file="/bizcommon/include/common.jsp"%>
<script>
   	$(document).attr("title","Cyberlogitec : OPUS Container");
</script>

</html>