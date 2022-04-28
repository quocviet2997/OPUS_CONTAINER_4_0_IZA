<%@ taglib uri="/WEB-INF/template.tld" prefix="template"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Enumeration" %>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>

<!-- 다국어 관련 추가 부분 -->
<%@ page import="com.clt.framework.support.view.signon.web.SignOnFilter" %>

<%
	//String strErrMsg="";
	//Exception piEx=null;
	String userName = "";
	String userId = "";
	String ofc_cd = "";
	String parentPgmNo = "EES_SPP_M001";
	String pgmUrl = "";
	String pgmNo = "";
	SignOnUserAccount account = (SignOnUserAccount) session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);

	userId = account.getUsr_id();
	userName = account.getUsr_nm();
	ofc_cd = account.getOfc_cd();
	
	String parameterNames = "";
	String redirectParameter = "";
	for ( Enumeration e = request.getParameterNames(); e.hasMoreElements(); ) {
		parameterNames = (String)e.nextElement();
		if ( parameterNames.equals("pgmNo") ) pgmNo = request.getParameter(parameterNames);
		else if ( parameterNames.equals("pgmUrl") ) pgmUrl = request.getParameter(parameterNames);
		else if ( parameterNames.equals("parentPgmNo") ) parentPgmNo = request.getParameter(parameterNames);
		else redirectParameter += "&" + parameterNames + "=" + request.getParameter(parameterNames);
	}
	pgmNo += redirectParameter;
	
	/* 다국어 지원 관련
	* 20120202 added bu JUN SUNG, KIM
	* 개발기 적용 위해서 DEFAULT 값이면 공백처리 해야함.
	* 기존 업무 script 를 놔두고 sample 쪽만 적용 시키기 위해서.
	*/
	String strLangType = ("_"+((String)request.getSession().getAttribute(SignOnFilter.FORM_LANG_TP_CD_TYPE)).toLowerCase());
	if("_eng".equals(strLangType) || "_".equals(strLangType) || "_en".equals(strLangType)
			|| "_kr".equals(strLangType) || "_cn".equals(strLangType)){
		strLangType = "";
	}
%>
<!--khlee:아래dtd를 포함하면 iframe에 포함된 페이지에서   top.document.body.scrollTop를 확인했을때 0(zero)가 나와서 이상함.
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
-->
<html>
<head>
<title><template:insert parameter="title" /></title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
.Full     { font-family: Tahoma,verdana,arial; font-size: 11px;color: #595959;padding:0 5 0 7;}
.Full A:link    	{ color:#595959; text-decoration:none; }
.Full A:visited 	{ color:#595959; text-decoration:none; }
.Full A:hover   	{ color:#6B56E9; text-decoration:underline; }
TABLE.id 			{ border-collapse: collapse; }
TABLE.id TD			{ padding:0px; font-family: Tahoma,Arial; font-size: 11px; color: #9A9C9D;letter-spacing:1px;}
TABLE.id TD.id		{ color: #9A9C9D; word-break : break-all;letter-spacing:1px;}
</style>
<link href="css/opus_contents.css" rel="stylesheet" type="text/css">
<!--templateSPPMNR 
	20120113 다국어 지원 관련 coMessage.js 삭제 처리함. 
	2012 01 26 added bu Jun Sung, KIM
	CoMessage 를 동적으로 생성 시키려 했으나 스크립트 오류가 나서
	일단 기본 페이지에서 session 에 넣어둔 lang 값을 가져와서 생성 시키는것으로 만듬.
 -->
<!-- 제품 include -->
<script language="javascript" type="text/javascript" src="js/common/ibtab/ibmditab.js"></script>
<script language="javascript" type="text/javascript" src="js/common/ibtab/ibmditabinfo.js"></script>
<script language="javascript" type="text/javascript" src="js/common/ibtab/ibmditabscroll.js"></script>
<script language="javascript" type="text/javascript" src="js/common/ibsheet/ibsheet.js"></script>
<script language="javascript" type="text/javascript" src="js/common/ibcombo/ibmulticombo.js"></script>
<script language="javascript" type="text/javascript" src="js/common/ibcombo/ibmulticomboinfo.js"></script>

<!-- common js include -->
<script language="javascript" type="text/javascript" src="style/js/jquery-1.11.0.min.js"></script>

<script language="javascript" type="text/javascript" src="js/common/CoObject.js?version=U12"></script>
<SCRIPT LANGUAGE="javascript"  TYPE="text/javascript" SRC="js/common/CoCommon.js"></SCRIPT>
<SCRIPT LANGUAGE="javascript" TYPE="text/javascript" SRC="js/common/CoMessage<%=strLangType%>.js" ></SCRIPT>
<SCRIPT LANGUAGE="javascript" TYPE="text/javascript" SRC="js/common/CoFormControl.js"></SCRIPT>
<script language="javascript" type="text/javascript" src="js/common/IBSheetInfo.js?version=multi"></script>
<SCRIPT LANGUAGE="javascript" TYPE="text/javascript" SRC="js/common/CoCalendar.js"></SCRIPT>
<script language="javascript" TYPE="text/javascript" src="js/common/swfobject.js"></script>
<script type="text/javascript">

//북마크용 변수 
 // 공통전역변수
 var curTab = 1;
 var beforetab = 0;

 // 윈도우 resizing 시 iframe width 고정 
  function checkIframeWidth(){
	  var clientWidth = document.body.clientWidth;
	  if ( clientWidth < 998 ) document.getElementById("main").width = "998";
	  else document.getElementById("main").width = "100%";
 }  

var top_title = ''; // 타이틀 명
var top_menu = ''; // 최상위 메뉴
function syncHeight() {
    var el = document.all.main;
    el.height = el.contentWindow.document.body.scrollHeight;
    
	//khlee : iframe에 로드된 페이지의 타이틀을  브라우저의 title로 표시한다.
	var sTitle = el.contentWindow.document.title;
    if (sTitle == "" || sTitle.toLowerCase().indexOf("untitle")>=0) {
        	document.title = top_title;
    } else {
        document.title = sTitle; 
    }
}
function setHeight(heightData) {
    document.all.main.height = heightData;
}

function program_load(pgmNo, pgmUrl, bookmark) {
	if ( bookmark != null ) {
		var modulePgmNo = pgmNo.substring(0, 8)+'M001';
		var src = "&pgmUrl="+ComReplaceStr(pgmUrl,"/","^")+"&pgmNo="+pgmNo;
		if ( modulePgmNo.substring(0,3) == 'ADM' ) modulePgmNo = 'ADM_000_M000';
	} else if ( pgmNo != null ) {
		var mainIfr = document.getElementById("main");
		mainIfr.src = pgmUrl + '?pgmNo=' + pgmNo;
//		mainIfr.focus();
	} else {
		var mainIfr = document.getElementById("main");
		mainIfr.src = pgmUrl;
//		mainIfr.focus();
	}
	showFlashMenu(false);
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
			document.location.href = "Sign"+on_off+".do";
		}
	} catch(e) {
		document.location.href = "Sign"+on_off+".do";
	}
}
var cover1offsetLeft = 0;
function makeCover(state, level, x, y, x2, y2, w, h) {
	//window.status = state+' '+level+' '+x+' '+y+' '+x2+' '+y2+' '+w+' '+h;
	var menu = document.getElementById('opusMenuDiv');
	var cover = document.getElementById('menuCover'+level);
	if(!menu) return;
	if(!cover) return;
	cover.style.width = (state)?w+2:0;
	cover.style.height = (state)?(y2-y+h+2):0;
	cover.style.left = menu.offsetLeft+x-1;
	cover.style.top = menu.offsetTop+y-1;
	if(level==1&&cover1offsetLeft!=cover.style.left) {
		makeCover(false, 2, 0, 0, 0, 0, 0, 0);
		cover1offsetLeft = cover.style.left;
	}
}
var isShowMenu=false;
function showFlashMenu(flag) {
	if(isShowMenu==flag) return; 
    var iframeHeight = parseInt(document.all.main.height);
    if (iframeHeight<530) iframeHeight = 530;
    iframeHeight = (flag)?(iframeHeight+70):34;
	document.getElementById("opusMenu").style.height = iframeHeight+"px";
	isShowMenu = flag;
	if(!flag) makeCover(false, 1, 0, 0, 0, 0, 0, 0);
}
function sendProgramNo2Flash() {
	return '<%=parentPgmNo%>';
}

function callDisappearMenu2Flash(){
	document.getElementById("opusMenu").disappearMenu();
	showFlashMenu(false);
}
</script>
</head>
<body onresize="checkIframeWidth();return true;">

<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0" style="padding-top:2;padding-left:0;">
	<tr>
		<td valign="top">
		<!--top menu (S)-->
		<table width="100%" border="0" cellpadding="0" cellspacing="0" class="id">
			<tr>
				<td width="263" style="padding-left:5"><img src="img/spp_main_title.gif" width="263" height="25" alt="" border="0"></td>
				<td class="id" style="padding-right:3;" align="right"><font color="#696B6C">ID</font>&nbsp;<%=userId%>&nbsp;&nbsp;&nbsp;<font color="#696B6C">Name&nbsp;</font><%=userName%>&nbsp;&nbsp;</td>
			</tr>
		</table>
		<table width="100%" border="0" cellpadding="0" cellspacing="0" background="img/new_sub/menu_bg.gif">
			<tr>
				<td valign="top"><img src="img/new_sub/menu_left.gif" width="12" height="36" alt="" border="0"></td>
				<td width="100%">
					<table width="100%"  height="36" border="0" cellpadding="0" cellspacing="0">
						<tr>
							<td valign="top" align="left">
								<table width="100%" border="0" cellpadding="0" cellspacing="0">
									<tr>
										<td align="center" width="15%" style="color:#ffffff; font-family:Tahoma,; font-size:13px; background-image: url(img/new_sub/menu_ttl_bg.gif);font-weight:bold; padding:0 0 3 0;">Loading...</td>
										<td><img src="img/new_sub/menu_ttl_right.gif" width="8" height="36" alt="" border="0"></td>
									</tr>
								</table>
							</td>
							<td valign="middle" style="padding-left:10">
								<!-- 메뉴 생성 스크립트 (S) -->
							<div id="opusMenuDiv" style="position:absolute; height:100%; top:27px; left:12px; z-index:1;" onmouseover="showFlashMenu(true)" onclick="callDisappearMenu2Flash()">
                            <p><a href="http://www.adobe.com/go/getflashplayer"><img src="http://www.adobe.com/images/shared/download_buttons/get_flash_player.gif" alt="Get Adobe Flash player" border="0"/></a></p>                       
							</div>
                         <script type="text/javascript">
	                         //window["opusMenu"] = new Object();
								var so = new SWFObject("img/new_sub/OpusMenu.swf", "opusMenu", "990", "34", "8", "#ffffff");
								so.addParam("id","opusMenu");
								so.addParam("allowscriptaccess","always");                                
								so.addParam("wmode", "transparent");
								so.addParam("scale", "noscale");
								so.addParam("salign", "TL");
								so.write("opusMenuDiv");
                         </script>
								<!-- 메뉴 생성 스크립트 (E) -->
							</td>
						</tr>
					
					</table>
				</td>
				<td valign="top"><img src="img/new_sub/menu_right.gif" width="11" height="36" alt="" border="0"></td>
			</tr>
		</table>
		<!--top menu (E)-->
		</td>
	</tr>
	<tr height="100%">
		<td valign="top" height="100%">
		<!-- 메인 화면 (S) -->
		<iframe name="main" id="main" width="100%" height="100%" frameborder="0" src="<template:insert parameter="body" />" scrolling="no" onLoad="syncHeight()" onResize="checkIframeWidth()"></iframe>
		<!-- 메인 화면 (E) -->
		</td>
	</tr>
	<tr>
		<td valign="bottom">
			<!-- Copyright (S) -->
			<table class="copy">
			<tr><td class="familysite">&nbsp;
					<select name="sitelink" id="sitelink" class="select_family" onChange="javascript:go_sitelink(this);">
			       	<option selected>&nbsp;&nbsp;  -- Family Site --  &nbsp;&nbsp;</option>
					<option value=""></option>
					<option value=""></option>
					<option value=""></option>
			   		</select>
				</td>
				<td class="copy"><img src="img/img_bottom_logo.gif" width="460" height="16" alt="" border="0"></td></tr>
			</table>
			<!-- Copyright(E)-->
		</td>
	</tr>
</table>


<!-- menu cover 1 depth -->
<iframe id="menuCover1" style="position: absolute; width: 0px; height: 0px; left: 215px; top: 66px;" frameborder="0" src="coverBorder1.htm" scrolling="no"></iframe>

<!-- menu cover 2 depth -->
<iframe id="menuCover2" style="position: absolute; width: 0px; height: 0px; left: 245px; top: 66px;" frameborder="0" src="coverBorder2.htm" scrolling="no"></iframe>

<!-- menu cover 3 depth -->
<iframe id="menuCover3" style="position: absolute; width: 0px; height: 0px; left: 245px; top: 66px;" frameborder="0" src="coverBorder2.htm" scrolling="no"></iframe>

<script>
try {
<%if ( !pgmUrl.equals("") ) {%>
	document.getElementById("main").src = ComReplaceStr("<%=pgmUrl%>?pgmNo=<%=pgmNo%>","^","/");
<%}%>
}catch(err) {
 	;
}
</script>

</body>
</html>
