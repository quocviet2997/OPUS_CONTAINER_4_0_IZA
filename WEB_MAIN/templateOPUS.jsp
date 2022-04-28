<%@ taglib uri="/WEB-INF/template.tld" prefix="template"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Enumeration" %>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.framework.support.view.menu.MenuBean" %>
<%@ page import="com.clt.framework.support.view.menu.MenuProcessor" %>
<%@ page import="com.clt.framework.support.view.menu.MenuEventResponse" %>

<!-- 다국어 관련 추가 부분 -->
<%@ page import="com.clt.framework.support.view.signon.web.SignOnFilter" %>

<%
	//String strErrMsg="";
	//Exception piEx=null;
	String userName = "";
	String userId = "";
	String ofc_cd = "";
	String parentPgmNo = "000_00_M000";
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
//	out.print("pgmNo =>"+pgmNo);
	
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
<!-- templateOPUS
	2012 01 26 added bu Jun Sung, KIM
	CoMessage 를 동적으로 생성 시키려 했으나 스크립트 오류가 나서
	일단 기본 페이지에서 session 에 넣어둔 lang 값을 가져와서 생성 시키는것으로 만듬.
 -->
<!-- 제품 include -->
<script language="javascript" type="text/javascript" src="js/ibtab/ibmditab.js"></script>
<script language="javascript" type="text/javascript" src="js/ibtab/ibmditabinfo.js"></script>
<script language="javascript" type="text/javascript" src="js/ibtab/ibmditabscroll.js"></script>
<script language="javascript" type="text/javascript" src="js/ibsheet/ibsheet.js"></script>
<script language="javascript" type="text/javascript" src="js/ibcombo/ibmulticombo.js"></script>
<script language="javascript" type="text/javascript" src="js/ibcombo/ibmulticomboinfo.js"></script>

<!-- common js include -->
<script language="javascript" type="text/javascript" src="style/js/jquery-1.11.0.min.js"></script>

<script language="javascript" type="text/javascript" src="js/common/CoObject.js?version=U12"></script>
<SCRIPT LANGUAGE="javascript" TYPE="text/javascript" SRC="js/common/CoCommon.js"></SCRIPT>
<SCRIPT language="javascript" TYPE="text/javascript" SRC="js/common/CoMessage<%=strLangType%>.js"></SCRIPT>
<SCRIPT LANGUAGE="javascript"  TYPE="text/javascript" SRC="js/common/CoFormControl.js"></SCRIPT>



<script language="javascript" type="text/javascript" src="js/common/IBSheetInfo.js?version=multi"></script>
<SCRIPT LANGUAGE="javascript" SRC="js/common/CoCalendar.js" TYPE="text/javascript"></SCRIPT>
<script language="javascript" src="js/common/swfobject.js" type="text/javascript"></script>
<script language="javascript" type="text/javascript" src="js/common/CoPopup.js?version=U1"></script>
<!--  2010.07.23 hyunsu add  -->
<script language="javascript" type="text/javascript" src="js/common/CoAxon.js"></script>

<script type="text/javascript">

//북마크용 변수 
 // 공통전역변수
 var curTab = 1;
 var beforetab = 0;
 var openWindowsCount = new Array();
 // 윈도우 resizing 시 iframe width 고정 
  function checkIframeWidth(){
	  var clientWidth = document.body.clientWidth;
	  if ( clientWidth < 998 ) document.getElementById("main").width = "998";
	  else document.getElementById("main").width = "100%";
 }  
 
//마우스 버튼 click 시 Bookmark div가 사라지게 한다.
 document.onmouseup = hideBookmark;

	function refreshBookmark(){
		document.getElementById("ifbookmark").src="viewBookmark.screen";
	}
	
 /**
  * +,- 버튼을 누를 때 실행하는 함수이다. <br>
  * + 누를 경우 Bookmark를 추가하고 - 일 경우 Bookmark를 삭제한다.
  */
 function changeBookmark(){
		var cmd = "0";
		var dpNm = "";
		var pgmNo = document.getElementById("main").contentWindow.curPgmNo;
		var title = document.getElementById("main").contentWindow.curTitle;
		var prntPgmNo;
		
		if ( pgmNo == undefined ) return;

		if(document.getElementById("imgBookmark").src.indexOf('img/new_sub/btn_plus.gif') >= 0){
			cmd = 1; // ADD
			var tmp =window.showModalDialog("CREATEBOOKMARK.do?f_cmd=" + SEARCH01 + "&title=" + title, window, "scroll:no;status:no;help:no;dialogWidth:500px;dialogHeight:255px");
			if ( tmp == null ) return;
			var tmpArr = tmp.split("|"); 
			if(tmpArr=='' || tmpArr.length == 0){
				return;
			}//end if
			
			document.getElementById("bookMark").src = "CREATEREMOVEBOOKMARK.do?ibflag=I&f_cmd="+cmd+"&pgm_no="+pgmNo+"&prnt_pgm_no=" + tmpArr[0] + "&dp_nm="+encodeURI(tmpArr[1]);
		}else{
			cmd = 5; // REMOVE
			document.getElementById("bookMark").src = "CREATEREMOVEBOOKMARK.do?ibflag=D&f_cmd="+cmd+"&pgm_no="+pgmNo;
		}
//		document.getElementById("ifbookmark").contentWindow.searchBookmark();
//		bookmark_icon_select();

	}


	function showBookmark(){
		var obj = document.getElementById("viewBookmark");
	 var iLeft = AnchorPosition_getPageOffsetLeft(obj); 
	 var iTop  = AnchorPosition_getPageOffsetTop(obj);
	 var divObj = document.getElementById('bookmark01');
	 var ifObj = document.getElementById('ifbookmark');

		divObj.style.left = iLeft-180;
		divObj.style.top = iTop + 26;
		divObj.style.visibility='visible';
		ifObj.style.visibility='visible';
	}

	function manageBookmark(){
		var tmp =window.showModalDialog("BOOKMARK.do", window, "scroll:no;status:no;help:no;dialogWidth:600px;dialogHeight:400px");
		refreshBookmark();		
	}

	function bookmark_icon_select(){
		var img = document.getElementById("imgBookmark");
		var ifObj = document.getElementById('ifbookmark');

		var sheetObj = window.frames['ifbookmark'].document.getElementById('sheet1');
		if(sheetObj==null){
//			alert('sheetObj='+sheetObj);
			return;
		}
//		alert('document.getElementById("main").contentWindow.curPgmNo=' + document.getElementById("main").contentWindow.curPgmNo);
		
		var isAdded = false;
		var selLen = sheetObj.rowcount;
//		alert('selLen='+selLen);
		for(i=1;i<= selLen;i++){
			var tmp = sheetObj.cellText(i,"pgm_no");
		//	alert('tmp = '  + tmp + " , curPgmNo = " + document.getElementById("main").contentWindow.curPgmNo);
			if(document.getElementById("main").contentWindow.curPgmNo == tmp){
			//if(tmp.indexOf(document.getElementById("main").contentWindow.curPgmNo)>-1){
				isAdded = true;
			}
		}

		if(isAdded==true){
			img.src="img/new_sub/btn_minus.gif";
			img.alt="Delete";
		}else{ 
			img.src="img/new_sub/btn_plus.gif";
			img.alt="Add";
		}			
		//document.getElementById("sitelink").selectedIndex=0;
	}
	 
 
 function hideBookmark(){
 
	 var divObj = document.getElementById('bookmark01');
	 var ifObj = document.getElementById('ifbookmark');
	 divObj.style.visibility='hidden';
	 ifObj.style.visibility = 'hidden';

 }
 

var top_title = ''; // 타이틀 명
var top_menu = ''; // 최상위 메뉴
function mainFrameLoad() {
    el = document.all.main;
	  //업무화면에서 마우스 버튼 click 시 Bookmark div가 사라지게 한다.
    el.contentWindow.document.onmouseup = hideBookmark;
}
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
function message(id,name,content) {
    try {
        var iWidth = 700;
        var iHeight = 580;
        var leftpos = (screen.width - iWidth)/2;    if(leftpos<0) leftpos=0;
        var toppos  = (screen.height- iHeight)/2;   if(toppos<0)  toppos=0;
        var sFeatures = "status=no, width="+iWidth+", height="+iHeight+", resizable=no, scrollbars=no, left="+leftpos+", top="+toppos;
        var parameter = "?rcvrId="+id+"&rcvrNm="+encodeURI(name)+"&msgCtnt="+encodeURI(content);
        var winObj = window.open("Message.do"+parameter,"",sFeatures);
        winObj.focus();
        return winObj;
    } catch(err) { alert(err.message); }
}
function messageConfirm(arch,del) {
	var msg_id = document.getElementById("message_id").value;
	var no_more = document.getElementById("no_more").checked;
	document.getElementById("msgChk").src = 'MessageCheck.do?f_cmd=4&div=RCV&rcvDt=OK&msgId='+msg_id+'&kepFlg='+arch+'&deltFlg='+del;
	parent.document.getElementById("ifalert01").style.visibility = 'hidden';
	parent.document.getElementById("alert01").style.visibility = 'hidden';
	if ( no_more ) setCookie('messagePop', 'done', 1);
}
function setCookie( name, value, expiredays )
{
	var todayDate = new Date();
	todayDate.setDate( todayDate.getDate() + expiredays );
	document.cookie = name + "=" + escape( value ) + "; path=/; expires=" + todayDate.toGMTString() + ";"
} 
function startCheck()
{
	document.getElementById("msgChk").src = "MessageCheck.do?f_cmd=101";
}

function toggleFullmenu() {
	var visibility = document.getElementById('menu01').style.visibility;
	var fullmenuLayer = document.getElementById('menu01');
	var fullmenuFrame = document.getElementById('ifmenu01');
	var fullmenuButton = document.getElementById('fullmenuButton');
	if ( visibility == 'visible' ) {
		fullmenuLayer.style.visibility='hidden';
		fullmenuFrame.style.visibility='hidden';
		fullmenuButton.src = "img/new_sub/btn_fullmenu.gif";
	} else {
		fullmenuLayer.style.visibility='visible';
		fullmenuFrame.style.visibility='visible';
		fullmenuButton.src = "img/new_sub/btn_fullmenu_1.gif";
	}
}

function menu_reolad(pgmNo, flag) {
	//document.location.href = "nis2010Main.screen?pgmNo=" + pgmNo;
	// 팝업으로 변경 2009.6.12
	//window.opener.module_pop(pgmNo);
	if ( flag == undefined ) flag = true;
    try {
        var iWidth = 1024;
        var iHeight = 700;
        //var leftpos = (screen.width - iWidth)/2;    if(leftpos<0) leftpos=0;
        //var toppos  = (screen.height- iHeight)/2;   if(toppos<0)  toppos=0;
        var sFeatures = "status=no, width="+iWidth+", height="+iHeight+", resizable=yes, scrollbars=yes";
        //document.getElementById("ifr_option").src = "UserManagementGS.do?f_cmd=11&mn_scrn_opt_id="+joinDisplayAtt();
        var winObj = window.open("opusMain.screen?parentPgmNo="+pgmNo,"",sFeatures);
        winObj.focus();
        //return winObj;
        openWindowsCount[openWindowsCount.length] = winObj;
    } catch(err) { alert(err.message); }
	
    if ( flag ) toggleFullmenu();
    else hideBookmark();
}

function program_load(pgmNo, pgmUrl, bookmark) {
	if ( bookmark != null ) {
		var modulePgmNo = pgmNo.substring(0, 8)+'M001';
		var src = "&pgmUrl="+ComReplaceStr(pgmUrl,"/","^")+"&pgmNo="+pgmNo;
		if ( modulePgmNo.substring(0,3) == 'ADM' ) modulePgmNo = 'ADM_000_M000';
		menu_reolad(modulePgmNo+src, false);
	} else if ( pgmNo != null ) {
		var mainIfr = document.getElementById("main");
		mainIfr.src = pgmUrl + '?pgmNo=' + pgmNo;
//		mainIfr.focus();
		hideBookmark();
	} else {
		var mainIfr = document.getElementById("main");
		mainIfr.src = pgmUrl;
//		mainIfr.focus();
		hideBookmark();
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

function CloseAllChild(){
	 	for( var i = 0; i < openWindowsCount.length; i++)
 	 	{
			var windowsopen = openWindowsCount[i];
			windowsopen.CloseAllChild();
 	 	}
		self.close();
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

	/**
  	* 약어 사전 <br>
  	*/
 	function dctionary(){
		ComOpenPopup('Dctionary.do', 405, 230, 'Dctionary', "0,0", true);
	}

function setTitleImg() {
	var module = parent.location.toString();
	var imgSrc = "";
	if(module.indexOf("OPS_SPC_M001") > -1){
		imgSrc = "img/new_sub/title_nol.jpg";
	}else if(module.indexOf("OPS_KBK_M0001") > -1){
		imgSrc = "img/new_sub/title_kam.jpg";
	}else{
		imgSrc = "img/new_sub/title.gif";
	}
	document.getElementById("titleImg").src = imgSrc;
}
</script>
</head>
<body onload="refreshBookmark();startCheck();setTitleImg();" onresize="checkIframeWidth();return true;">

<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0" style="padding-top:2;padding-left:0;">
	<tr>
		<td valign="top">
		<!--top menu (S)-->
		<table width="100%" border="0" cellpadding="0" cellspacing="0" class="id">
			<tr>
				<td width="263" style="padding-left:5"><img id="titleImg" src="javascript:setTitleImg();" width="263" height="25" alt="" border="0"></td>
				<td width="" valign="bottom" style="padding-bottom:1;" align="right">
					<table width="100%" border="0" cellpadding="0" cellspacing="0">
						<tr>
							<td class="id" style="padding-right:3;" align="right"><img id="messageBox" src="img/new_sub/img_topmenu_message_01.gif" width="24" height="13" alt="" border="0" class="cursor" onclick="message('null','null','null');"><strong id="newCnt">0</strong>&nbsp;&nbsp;<img src="img/new_sub/vline_dot.gif" width="1" height="13" alt="" border="0">&nbsp;&nbsp;<font color="#696B6C">ID</font>&nbsp;<%=userId%>&nbsp;&nbsp;&nbsp;<font color="#696B6C">Name&nbsp;</font><%=userName%>&nbsp;&nbsp;&nbsp;<font color="#696B6C">Office</font>&nbsp;<%=ofc_cd%>&nbsp;<a href="javascript:signature('Off')"><img src="img/new_sub/btn_logout.gif" width="40" height="13" alt="" border="0"></a></td>
							<td width="75" style="padding-right:5;"><img src="img/new_sub/vline_dot.gif" width="1" height="13" alt="" border="0">&nbsp;<img id="fullmenuButton" src="img/new_sub/btn_fullmenu.gif" width="62" height="13" alt="" border="0" style="cursor: hand" onclick="toggleFullmenu()"></td>
						</tr>
					</table>
				</td>
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
							<td align="right"><!-- <img src="img/new_sub/btn_fullname.gif" width="14" height="15" alt="" border="0"> --><img src="img/new_sub/vline_dot1.gif" width="1" height="15" alt="" border="0">&nbsp;<img src="img/btn_topmenu_my_03.gif" width="14" height="14" class="cursor" onclick="dctionary()">&nbsp;<img src="img/new_sub/btn_plus.gif" width="14" height="14" alt="" border="0" id="imgBookmark" class="cursor" onclick="changeBookmark()">&nbsp;<img src="img/new_sub/btn_my.gif" width="15" height="15" alt="Bookmark" border="0" id="viewBookmark" class="cursor" onclick="showBookmark()"></td>
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
		<iframe name="main" id="main" width="100%" height="100%" frameborder="0" src="<template:insert parameter="body" />" scrolling="no" onLoad="mainFrameLoad();syncHeight()" onResize="checkIframeWidth()"></iframe>
		<!-- 메인 화면 (E) -->
		</td>
	</tr>
	<tr>
		<td valign="bottom">
			<!-- Copyright (S) -->
			<table class="copy">
			<tr><td class="familysite">&nbsp;
					<select name="sitelink" id="sitelink" class="select_family" >
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

<!-- 즐겨찾기 추가/삭제 실행 -->
<iframe id="bookMark" height="0" width="0" frameborder="0"	src=""></iframe>
<!-- 메시지확인 -->
<iframe id="msgChk" width="0" height="0" frameborder="0"></iframe>

<iframe id="ifmenu01" style="position: absolute; width: 800px; height: 272px; left: 195px; top: 26px; z-index: 3; visibility: hidden;" frameBorder="0" scrolling="no"></iframe>
<div id="menu01" style="position: absolute; Z-INDEX: 4; top: 26px; left: 195px; width: 800px; visibility: hidden;">
<!--Full Menu(S)--> <!-- Frame Table (S) -->
<table width="800" style="border: #525267 1px solid;background-color: F4F4F4;border-top:1px solid #FFFFFF;" cellpadding="0" cellspacing="0">
	<tr>
		<td width="130" background="img/new_sub/ffull_top_bg.gif" style="font-family: Tahoma,verdana,arial; font-size: 11px; font-weight:bold;color: #595959;padding:10 5 10 7;">Service Management</td>
		<td width="1" background="img/new_sub/ffull_top_bg.gif" ></td>
		<td width="110" background="img/new_sub/ffull_top_bg.gif" style="font-family: Tahoma,verdana,arial; font-size: 11px; font-weight:bold;color: #595959;padding:10 5 10 7;">Sales Management</td>
		<td width="1" background="img/new_sub/ffull_top_bg.gif" ></td>
		<td width="140" background="img/new_sub/ffull_top_bg.gif" style="font-family: Tahoma,verdana,arial; font-size: 11px; font-weight:bold;color: #595959;padding:10 5 10 7;">Equipment Management</td>
		<td width="1" background="img/new_sub/ffull_top_bg.gif" ></td>
		<td width="110" background="img/new_sub/ffull_top_bg.gif" style="font-family: Tahoma,verdana,arial; font-size: 11px; font-weight:bold;color: #595959;padding:10 5 10 7;">Vessel Operation</td>
		<td width="1" background="img/new_sub/ffull_top_bg.gif" ></td>
		<td width="150" background="img/new_sub/ffull_top_bg.gif" style="font-family: Tahoma,verdana,arial; font-size: 11px; font-weight:bold;color: #595959;padding:10 5 10 7;">Support & Administration</td>
		<td width="1" background="img/new_sub/ffull_top_bg.gif" ></td>
		<td width="" background="img/new_sub/ffull_top_bg.gif" style="font-family: Tahoma,verdana,arial; font-size: 11px; font-weight:bold;color: #595959;padding:10 5 10 7;">Common</td>
	</tr>
	<tr>
		<td valign="top" style="padding:3 0 3 0;">
			<table  border="0" cellpadding="0" cellspacing="0">
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('ESM_BKG_M001')">Booking/Documentation</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('ESD_PRD_M001')">Product Catalog</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('ESD_TRS_M001')">Transportation</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('ESD_TES_M001')">Terminal Invoice</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('FNS_INV_M001')">A/R Invoice</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('EES_CTM_M001')">CNTR Movement</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('EES_DMT_M001')">Demurrage/Detention</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('ESD_TPB_M001')">3rd Party Billing</a></td>
			</tr>
			<tr><td style="padding:0 0 11 0" valign="top"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('ESD_SCE_M001')">Supply Chain Event<br>Management</a></td>
			</tr>
			</table>
		</td>
		<td bgcolor="D2D2D2"></td>
		<td valign="top" style="padding:3 0 3 0;">
			<table  border="0" cellpadding="0" cellspacing="0">
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('ESM_SAQ_M001')">Sales Quota</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('ESM_SPC_M001')">Space Control</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('ESM_PRI_M001')">Pricing</a></td>
			</tr>
			<tr><td style="padding:0 0 11 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('ESM_COA_M001')">CNTR BIZ PFMC<br>Analysis</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('ESM_BSA_M001')">Basic Slot Allotment</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('ESM_SAM_M001')">Sales Admin</a></td>
			</tr>			
			</table>
		</td>
		<td bgcolor="D2D2D2"></td>
		<td valign="top" style="padding:3 0 3 0;">
			<table  border="0" cellpadding="0" cellspacing="0">
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('EES_MST_M001')">CNTR Master</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('EES_CIM_M001')">CNTR Inventory</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('EES_LSE_M001')">CNTR Lease</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('EES_MNR_M001')">M &amp; R</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('EES_EQR_M001')">EQ Reposition</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('EES_CGM_M001')">Chassis</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('EES_CGM_M019')">M.G. Set</a></td>
			</tr>
			</table>
		</td>
		<td bgcolor="D2D2D2"></td>
		<td valign="top" style="padding:3 0 3 0;">
			<table  border="0" cellpadding="0" cellspacing="0">
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('VOP_VSK_M001')">Vessel Schedule</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('VOP_OPF_M001')">Operation & PFMC</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('VOP_SCG_M001')">Special Cargo</a></td>
			</tr>
			<tr><td valign="top" style="padding:2 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('VOP_PSO_M001')">Port Service Order</a></td>
			</tr>
			</table>
		</td>
		<td bgcolor="D2D2D2"></td>
		<td valign="top" style="padding:3 0 3 0;">
			<table  border="0" cellpadding="0" cellspacing="0">
			<tr><td valign="top" style="padding:2 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('FNS_JOO_M001')">Joint Operation</a></td>
			</tr>
			<tr><td valign="top" style="padding:2 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('ESM_FMS_M001')">Fleet Management</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('CPS_CNI_M001')">Claim &amp; Insurance</a></td>
			</tr>
			<tr><td valign="top" style="padding:2 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('ESM_AGT_M001')">Agent Commission</a></td>
			</tr>
			</table>
		</td>
		<td bgcolor="D2D2D2"></td>
		<td valign="top" style="padding:3 0 3 0;">
			<table  border="0" cellpadding="0" cellspacing="0">
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('BCM_CCD_M001')">Master Data</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('BCM_FIN_M001')">Finance Setup</a></td>
			</tr>
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('BCM_SUP_M001')">EDI Setup</a></td>
			</tr>									
			<tr><td style="padding:0 0 0 0"><img src="img/new_sub/sub_menu_dot.gif" width="8" height="20" alt="" border="0"></td>
				<td class="full"><a href="javascript:menu_reolad('COM_SEC_M001')">Security</a></td>
			</tr>
			</table>
		</td>
	</tr>
</table>
<!-- Frame Table (S) --> <!--Full Menu(E)-->
</div>

<!-------------------- Alert Layer 시작 -------------------->
<iframe id="ifalert01" style="position: absolute; width: 400px; height: 253px; left: 300px; top: 100px; z-index: 1; visibility: hidden;"
	frameBorder="0" scrolling="no"></iframe>
<div id="alert01" style="position: absolute; Z-INDEX: 2; top: 100px; left: 300px; width: 400px; height: 235px; visibility: hidden;">
<table align="center" width="400" style="background-color: #9999cc;">
	<tr>
		<td valign="top"><!-- : ( Search Options ) (S) -->
		<table class="search" style="width: 398; border: 1px solid #E8EFF9;" align="center">
			<tr>
				<td class="bg">
				<table class="search" border="0">
					<tr class="h23">
						<td width="40">&nbsp;From :</td>
						<td><input id="message_sender" type="text"
							style="color: #000000; width: 250; background-color: #F3F2F8; border: #F3F2F8 1px solid; font-size: 11px; color: #313131; font-weight: bold;"
							readonly></td>
					</tr>
					<tr class="h23">
						<td colspan="2">
							<textarea id="message_content" style="width: 100%; height: 150;" disabled></textarea>
							<input type="hidden" id="message_id">
						</td>
					</tr>
				</table>
				</td>
			</tr>
		</table>
		<!-- : ( Search Options ) (E) -->
		<table class="search" style="background-color: #ffffff; width: 100%">
			<tr>
				<td><input class="Trans" type="checkbox" name="no_more" /> Today, Message window will not be opened any more.</td>
			</tr>
		</table>
		<!-- : ( Button : pop ) (S) -->
		<table width="100%" class="sbutton">
			<tr>
				<td height="71" class="popup">
				<table width="100%" class="button" border="0" cellpadding="0" cellspacing="0" style="padding-top: 0; , padding-bottom: 0;">
					<tr>
						<td class="btn3_bg">
						<table border="0" cellpadding="0" cellspacing="0">
							<tr>
								<td width="80">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
									<tr>
										<td class="btn1_left"></td>
										<td class="btn1" onClick="messageConfirm('OK','NO');">Archive</td>
										<td class="btn1_right"></td>
									</tr>
								</table>
								</td>
								<td width="72">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
									<tr>
										<td class="btn1_left"></td>
										<td class="btn1" onClick="messageConfirm('NO','OK');">Delete</td>
										<td class="btn1_right"></td>
									</tr>
								</table>
								</td>
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
<!-------------------- Alert Layer 끝 -------------------->


<!-------------------- Bookmark Layer 시작 -------------------->
<div id="bookmark01" style="position: absolute; Z-INDEX: 1; top: 100px; left: 800px; width: 200px; height: 235px; visibility: hidden;">
<iframe id="ifbookmark" style="position: absolute; width: 200px; height: 225px; z-index: 1; visibility: hidden;"	frameBorder="0" scrolling="no" >
</iframe>
</div>
<!-------------------- Alert Layer 끝 -------------------->

<script>
try {
<%if ( !pgmUrl.equals("") ) {%>
	<%if(pgmUrl.indexOf("?") > -1){%>
		document.getElementById("main").src = ComReplaceStr("<%=pgmUrl%>&pgmNo=<%=pgmNo%>","^","/");
	<%}else{%>
		document.getElementById("main").src = ComReplaceStr("<%=pgmUrl%>?pgmNo=<%=pgmNo%>","^","/");
	<%}
}%>
}catch(err) {
 	;
}
</script>
<iframe id="_iFrameWait_" src="img/waiting.gif" frameborder="0" marginHeight="0" marginWidth="0" width="249" height="76" style="position:absolute;visibility:hidden;z-index:999;display:none;" ></iframe>
</body>
</html>
