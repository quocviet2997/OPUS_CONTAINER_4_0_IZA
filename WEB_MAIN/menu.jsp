
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.clt.framework.component.util.JSPUtil" %>
<%@ page import="com.clt.framework.support.view.menu.MenuBean" %>
<%@ page import="com.clt.framework.support.view.menu.MenuProcessor" %>
<%@ page import="com.clt.framework.support.view.menu.MenuEventResponse" %>
stm_bm(["menu0c0e",860,"img","blank.gif",0,"","",0,0,250,0,100,1,1,1,"","",0,0,1,2,"default","hand",""],this);
stm_bp("p0",[0,4,0,0,0,6,0,0,100,"",-2,"",-2,50,0,0,"#999999","","",0,0,0,"#000000"]);
<%
String programNo = "";
if ( request.getParameter("pgmNo") != null ) programNo = request.getParameter("pgmNo");
ArrayList menuList = null;
MenuBean menuBean = null;
MenuEventResponse eventResponse = null;
try {
	MenuProcessor menuProcessor = new MenuProcessor();
	menuProcessor.init(null);
	menuProcessor.processEvent(request, programNo, 5);
	menuProcessor.processEventNavigation(request);
	menuProcessor.doEnd();
} catch (Exception exx) {
	menuList = null;
	out.println(exx.getMessage());
}
eventResponse = (MenuEventResponse) request.getAttribute("MenuEventResponse");
if (eventResponse != null) {
	menuList = (ArrayList) eventResponse.getMenu();
}
HashMap menu = (HashMap) request.getAttribute("MenuInformation");
String top_menu_name = (String) menu.get("title");

int prev_level = 0;
int pop_idx = 0;
int d1_idx = 0;
int d2_idx = 0;
int d3_idx = 0;
int d4_idx = 0;
int d5_idx = 0;
int level = 0;
int child_cnt = 0;
String pgm_nm = "";
String pgm_url = "";
String auth_yn = "";
for (int j=0; j<menuList.size(); j++) {
	menuBean = (MenuBean)menuList.get(j);
	level = Integer.parseInt(menuBean.getMenuLevel());
	child_cnt = Integer.parseInt(menuBean.getChildCnt());
	pgm_nm = menuBean.getMenuText();
	pgm_url = (menuBean.getProgramName().equals(""))? "" : (menuBean.getProgramName()+((menuBean.getProgramName().indexOf("?")>0)?"&":"?")+"pgmNo="+menuBean.getMenuId());
	auth_yn = menuBean.getAuthYn();
	String color_link = ( auth_yn.equals("Y") )? "#6B56E9" : "#CCCCCC"; 
	String color_hover = ( auth_yn.equals("Y") )? "#EFFFE9" : "#FFFFFF"; 
	String arrow_img = ( child_cnt>0 )? "new_sub/sub_menu_arrow.gif" : "img_topmenu_sub_on_arrow_1.gif";
	if ( level < prev_level ) {
		for ( int i = 0 ; i < prev_level-level ; i++ ) {
%>stm_ep();
<%		}
		if ( level == 1 ) { d2_idx = 0; d3_idx = 0; d4_idx = 0; d5_idx = 0; }
		else if ( level == 2 ) { d3_idx = 0; d4_idx = 0; d5_idx = 0; }
		else if ( level == 3 ) { d4_idx = 0; d5_idx = 0; }
		else if ( level == 4 ) { d5_idx = 0; }
	}
	if ( level == 0 ) top_menu_name = pgm_nm;
	else if ( level == 1 ) {
		if ( d1_idx == 0 ) {
%>stm_ai("p0i0",[6,1,"","new_sub/vline.gif",0,13,0]);stm_ai("p0i1",[0," <%=pgm_nm%> ","","",-1,-1,0,"<%=pgm_url%>","main","","","","",0,0,0,"","",0,0,0,1,1,"",0,"",0,"","new_sub/menu_over_bg.gif",1,1,0,0,"","","#ffffff","#9DFE5D","bold 11px Tahoma","bold 11px Tahoma",0,0],0,36);
<%      } else {
%>stm_aix("p0i<%=d1_idx%>","p0i0",[6,1,"","new_sub/vline.gif",3,13,0]);stm_aix("p0i<%=d1_idx+1%>","p0i1",[0," <%=pgm_nm%> ","","",-1,-1,0,"<%=pgm_url%>","main","","","","",0,0,0,"","",0,0,0,1,1,"",0,"",0,"","new_sub/menu_over_bg.gif",1,1,0,0,"","","#ffffff","#9DFE5D","bold 11px Tahoma","bold 11px Tahoma",0,0],0,36);
<%      }
		d1_idx = d1_idx + 2;
	} else if ( level == 2 ) {
		if ( level > prev_level ) {
			pop_idx++;
%>stm_bp("p<%=pop_idx%>",[1,4,0,-2,0,0,0,0,100,"",-2,"",-2,100,0,0,"#999999","","",0,1,1,"#20BBE5"]);
<%		}
%>stm_aix("p<%=pop_idx%>i<%=d2_idx%>","p0i1",[0," <%=pgm_nm%> ","","",-1,-1,0,"<%=pgm_url%>","main","","","new_sub/sub_menu_dot.gif","new_sub/sub_menu_dot.gif",8,20,0,"<%=arrow_img%>","<%=arrow_img%>",14,20,0,0,1,"#ffffff",0,"<%=color_hover%>",0,"","",0,0,0,0,"#E6EFF9","#000000","#8C8C8C","<%=color_link%>","bold 11px Tahoma","bold 11px Tahoma"],0,20);
<%
	d2_idx++;
	} else {
		if ( level > prev_level ) {
			pop_idx++;
%>stm_bpx("p<%=pop_idx%>","p1",[1,2,0,-1,0,0,0,0,100,"",-2,"",-2,100,0,0,"#999999","","",0,1,1,"#64F3CB"]);
<%		}
%>stm_aix("p<%=pop_idx%>i<%=d3_idx%>","p0i1",[0," <%=pgm_nm%> ","","",-1,-1,0,"<%=pgm_url%>","main","","","new_sub/sub_menu_dot.gif","new_sub/sub_menu_dot.gif",8,20,0,"<%=arrow_img%>","<%=arrow_img%>",14,20,0,0,1,"#ffffff",0,"<%=color_hover%>",0,"","",0,0,0,0,"#E6EFF9","#000000","#8C8C8C","<%=color_link%>","bold 11px Tahoma","bold 11px Tahoma"],0,20);
<%		d3_idx++;
	}
	prev_level = level;
}
%>stm_ep();
stm_em();
top_menu = '<%=top_menu_name.replaceAll(" ","&nbsp;")%>';
top_title = '<%=top_menu_name%>';