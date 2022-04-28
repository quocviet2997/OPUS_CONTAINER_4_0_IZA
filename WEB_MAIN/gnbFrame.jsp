<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ taglib uri="/WEB-INF/template.tld" prefix="template"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.framework.component.util.JSPUtil" %>
<%@ page import="com.clt.framework.support.view.menu.MenuBean" %>
<%@ page import="com.clt.framework.support.view.menu.MenuProcessor" %>
<%@ page import="com.clt.framework.support.view.menu.MenuEventResponse" %>
<%@ page import="com.clt.framework.core.view.template.Parameter"%>
<%@ page import="com.clt.framework.core.view.template.Screen"%>
<%@ page import="com.clt.framework.core.controller.util.WebKeys"%>
<!-- 다국어 관련 추가 부분 -->
<%@ page import="com.clt.framework.support.view.signon.web.SignOnFilter" %>
<!DOCTYPE html>
<html style="min-width:0!important;height:100%">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="style/css/theme_default.css" />
	<!-- common js include -->
	<script type="text/javascript" src="style/js/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="style/js/gnb.js"></script>
	<!-- common js include -->
    <title>OPUS Container</title>
    <base target="_parent" />
</head>
<body style="height:100%">
    <!-- gnb_2dpeth (S) -->
    <div class="gnb_2dpeth">
        <strong id="gnb_2depth_name">-<!-- 2depth heading --></strong>
        <!-- gnb_list(S) -->
        <ul class="gnb_list">
            <%
        //get gnb menu data
        String allMenuRetrieveParam = request.getParameter("parentPgmNo");
        if(allMenuRetrieveParam==null||"".equals(allMenuRetrieveParam)){
            allMenuRetrieveParam = "000_000_M000";
        }
        ArrayList<MenuBean> menuList = null;
        MenuEventResponse eventResponse = null;
        try {
            MenuProcessor menuProcessor = new MenuProcessor();
            menuProcessor.init(null);
            menuProcessor.processEvent(request, allMenuRetrieveParam, 5);
            menuProcessor.processEventNavigation(request);
            menuProcessor.doEnd();
        } catch (Exception exx) {
            menuList = null;
            out.println(exx.getMessage());
        }
        eventResponse = (MenuEventResponse) request.getAttribute("MenuEventResponse");
        if (eventResponse != null) {
            menuList = (ArrayList<MenuBean>) eventResponse.getMenu();
        }
        
        int lastMenuLevel = 0;
        int curMenuLevel = 0;
        int nextMenuLevel = 0;
        
        MenuBean bean = null;
        int totalMenuCount = menuList.size();
        
        for(int i=0; i<totalMenuCount; i++){                
            curMenuLevel = Integer.parseInt(menuList.get(i).getMenuLevel());    // 현재 메뉴  Level
            
            // Next 메뉴의 레벨을 세팅 (가장 마지막 메뉴를 제외)
            if(i < (totalMenuCount - 1) ) {
                nextMenuLevel = Integer.parseInt(menuList.get(i+1).getMenuLevel());     // Next 메뉴의  Level              
            }

            MenuBean menuBean = menuList.get(i);
            String pgmUrl = menuBean.getProgramName();
            String mainPage = "";
            if(pgmUrl.contains("mainPage=true")){
                mainPage = "&mainPage=true";
                // 탭으로 다이엑트 이동 체크
                if(pgmUrl.contains("openTab=")){
                    int beginPos = pgmUrl.indexOf("openTab=");
                    int endPos = pgmUrl.substring(beginPos).indexOf("&");
                    mainPage = mainPage + "&" + pgmUrl.substring(beginPos, beginPos + endPos);
                }   
            }
            // 1 Level 메뉴인 경우
            if(curMenuLevel == 1) {
                if(nextMenuLevel != 2){
                    out.print("<li data-block='"+ menuBean.getAuthYn() +"'>");
                    if(pgmUrl.indexOf("?") < 0 ){
                        out.print("<a target='_parent' href="+pgmUrl+"?pid="+menuBean.getPid()+"&MENU="+menuBean.getAuthYn()+"&pgmNo="+menuBean.getMenuId()+"&parentPgmNo="+allMenuRetrieveParam+"&main_page=true&mainMenuLinkFlag=true&menuflag=true&mainPage=true>"+menuBean.getMenuText()+"</a>");
                    } else{
                        out.print("<a target='_parent' href="+pgmUrl+"&pid="+menuBean.getPid()+"&MENU="+menuBean.getAuthYn()+"&pgmNo="+menuBean.getMenuId()+"&parentPgmNo="+allMenuRetrieveParam+"&mainMenuLinkFlag=true&menuflag=true"+mainPage+">"+menuBean.getMenuText()+"</a>");
                    }
                }else{
                    out.print("<li data-block='"+ menuBean.getAuthYn() +"'>");
                    out.print("<a>"+menuList.get(i).getMenuText()+"</a>");
                }
            } 
            
            // 2 Level 이상 메뉴인 경우
            if(curMenuLevel > 1) {                  
                // CurMenuLevel 과 LastMenuLevel 을 비교해서, ul/li 태그 시작/끝 처리를 한다.
                if(curMenuLevel > lastMenuLevel) {
                    out.print("<div><ul>");
                    out.print("<li data-block='"+ menuBean.getAuthYn() +"'>");                                         
                } else if(curMenuLevel == lastMenuLevel) {
                	out.print("<li data-block='"+ menuBean.getAuthYn() +"'>");                      
                } else if(curMenuLevel < lastMenuLevel) {
                    int gap = lastMenuLevel - curMenuLevel;
                    for(int j=0;j<gap;j++){
                        out.print("</ul></div>");
                        out.print("</li>");
                    }
                    out.print("<li data-block='"+ menuBean.getAuthYn() +"'>");                      
                }
                
                // 링크 생성 부분
                if(curMenuLevel >= nextMenuLevel){
                    String herfUrl = menuBean.getMenuId()+".do";
                    if(pgmUrl.indexOf("?") < 0 ){
                        out.print("<a href="+pgmUrl+"?pid="+menuBean.getPid()+"&MENU="+menuBean.getAuthYn()+"&pgmNo="+menuBean.getMenuId()+"&parentPgmNo="+allMenuRetrieveParam+"&main_page=true&mainMenuLinkFlag=true&menuflag=true&mainPage=true>"+menuBean.getMenuText()+"</a>");
                    } else{
                        out.print("<a href="+pgmUrl+"&pid="+menuBean.getPid()+"&MENU="+menuBean.getAuthYn()+"&pgmNo="+menuBean.getMenuId()+"&parentPgmNo="+allMenuRetrieveParam+"&mainMenuLinkFlag=true&menuflag=true"+mainPage+">"+menuBean.getMenuText()+"</a>");
                    }
                } else {
                    out.print("<a>"+menuList.get(i).getMenuText()+"</a>");
                }
            }
            
            // 1 Level 메뉴의 ul/li 태그 종료 처리 CLOSE 처리 (Next 메뉴 레벨이 1인 경우 또는 가장 마지막 데이타인 경우)
            if((curMenuLevel > 1 && nextMenuLevel == 1) || i == menuList.size() - 1) {
                for(int j=0; j<(curMenuLevel-1); j++) {
                    out.println("</ul>");
                }
                out.print("</li>");
            }
            
            lastMenuLevel = curMenuLevel;
        }
        %>
        </ul>
        <!-- gnb_list(E) -->
    </div>
    <!-- gnb_2dpeth(global navigation bar) : (E) -->
    <!-- //GNB -->
</body>
<!-- VER 1.3 -->
</html>
