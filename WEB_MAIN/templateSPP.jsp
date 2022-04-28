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
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="com.clt.framework.core.controller.util.WebKeys"%>
<%@ page import="com.clt.framework.core.view.template.Screen"%>
<%@ page import="com.clt.framework.core.view.template.Parameter"%>

<!-- 다국어 관련 추가 부분 -->
<%@ page import="com.clt.framework.support.view.signon.web.SignOnFilter" %>


<%
	Screen screen = (Screen) request
			.getAttribute(WebKeys.CURRENT_SCREEN);
	Parameter param = (Parameter) screen.getParameter("body");
	String jsPath = param.getValue();
	//System.out.println("jsPath=" + jsPath);

	jsPath = jsPath.replaceAll("\\.jsp", "\\.js");
%>
<!-- <template:insert parameter="title" /> -->

<%@page import="java.util.HashMap"%>
<link href="css/opus_spp_contents.css" rel="stylesheet" type="text/css">

<!--templateSPP 
	20120113 다국어 지원 관련 coMessage.js 삭제 처리함. 
	2012 01 26 added bu Jun Sung, KIM
	CoMessage 를 동적으로 생성 시키려 했으나 스크립트 오류가 나서
	일단 기본 페이지에서 session 에 넣어둔 lang 값을 가져와서 생성 시키는것으로 만듬.
 -->
<!-- 제품 include -->
<script type="text/javascript" src="js/ibleaders.js"></script>
<script language="javascript" type="text/javascript" src="js/ibtab/ibmditab.js"></script>
<script language="javascript" type="text/javascript" src="js/ibtab/ibmditabinfo.js"></script>
<script language="javascript" type="text/javascript" src="js/ibtab/ibmditabscroll.js"></script>
<script language="javascript" type="text/javascript" src="js/ibsheet/ibsheet.js"></script>
<script language="javascript" type="text/javascript" src="js/ibcombo/ibmulticombo.js"></script>
<script language="javascript" type="text/javascript" src="js/ibcombo/ibmulticomboinfo.js"></script>

<!-- common js include -->
<script language="javascript" type="text/javascript" src="style/js/jquery-1.11.0.min.js"></script>

<script language="javascript" type="text/javascript" src="js/common/CoAxon.js" path="<%=jsPath%>"   msgkey="<%=WebKeys.TRANS_RESULT_KEY%>"></script>
<script language="javascript" type="text/javascript" src="js/common/CoCommon.js"></script>
<SCRIPT LANGUAGE="javascript" TYPE="text/javascript" SRC="js/common/CoMessage.js" ></SCRIPT>
<script language="javascript" type="text/javascript" src="js/common/CoFormControl.js"></script>
<script language="javascript" type="text/javascript" src="js/common/CoPopup.js?version=U1"></script>
<script language="javascript" type="text/javascript" src="js/common/CoCalendar.js"></script>
<script language="javascript" type="text/javascript" src="js/common/CoObject.js?version=U12"></script>
<script language="javascript" type="text/javascript" src="js/common/IBSheetInfo.js?version=multi"></script>
<script language="javascript" type="text/javascript" src="js/common/CoBiz.js"></script>
<script language="javascript" type="text/javascript" src="js/common/CoMail.js?version=U2"></script>

<!-- body 시작 -->
<template:insert parameter="body" />
<!-- body 끝 -->
<script language="javascript">
	//khlee-브라우저에서 단축키로 Backspace를 누르면  자동으로 페이지 뒤로 가기 되어 버리는 문제를 해결하기 위함
	document.onkeydown=document_onkeydown;
	function document_onkeydown(){
		try{			
	        if(ComGetEvent("keycode")!=8) return true; 
			var se = ComGetEvent();
	        if(se.readOnly!=null && !se.readOnly) return true;
	        if (se.isTextEdit!=null && se.isTextEdit) return true;
	        if (se.isContentEditable!=null && se.isContentEditable) return true;
	        ComJsEventStop();
	        return false;
		}catch(err) {
		 	ComFuncErrMsg("Backspace 방지 처리 에러\n" + err.message);
		}
	}


	//khlee-form안에 편집가능한 input="text", input="password"가 하나만 존재할때 input 필드에서 Enter키를 누르면 페이지 리로드되는 문제를 해결하기 위함
	for ( var i = 0; i < document.forms.length; i++) {
		document.forms[i].onsubmit = new Function("return false;");
	}
	/*
	var __topDoc = null;
	try {
	    __topDoc = top.document;
	}catch(e){
	    __topDoc = document;
	}
	var _frameWait = __topDoc.createElement("<IFRAME id='"+WAIT_FRAME_NAME+"' src='"+waitImage +"' frameborder=0 marginHeight=0 marginWidth=0 width="+waitW+" height="+waitH+" style='position:absolute;visibility:hidden;z-index:999;display:none;' />");
	__topDoc.body.insertBefore(_frameWait);
	*/
</script>
