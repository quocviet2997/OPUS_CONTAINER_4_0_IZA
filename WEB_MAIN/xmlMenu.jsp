
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.clt.framework.component.util.JSPUtil" %>
<%@ page import="com.clt.framework.support.view.menu.MenuBean" %>
<%@ page import="com.clt.framework.support.view.menu.MenuProcessor" %>
<%@ page import="com.clt.framework.support.view.menu.MenuEventResponse" %>
<?xml version="1.0" encoding="UTF-8"?>

<menu type="Flash Menu Labs Open Source Edition  (Vertical)  www.flashmenulabs.com" >

	<spec_menu_params
		is_physic_enabled = "0"					
		webmaster_text = "ALPS system menu"
		webmaster_url = "http://nis2010.hanjin.com"
		enable_soft_wave_when_appear = "0"
		base_shift_x = "0"
		base_shift_y = "0"
		appear_effect_pos_type = "0"
		disappear_effect_pos_type = "0"
		appear_effect_opacity_type ="0"
		disappear_effect_opacity_type = "0"
		flex_coef = "5.9" 
		decay_coef = "1.25" 
		random_coef = "0.0" 
	/>

	<app_disapp_eff>
		<!-- Appear/disappear effect parameters -->
		<eff_pos 
			max_time_to_wait = "0" 
			accel_coef = "5" 
			base_speed = "100"
			jump_coef = "0.33"
			even_odd_side_dist = "71"
		/>
		
		<eff_opacity 
			max_time_to_wait = "0"
			time_to_appear = "0.3"	
			time_to_disappear ="0.3"		
		/>
	</app_disapp_eff>


	<!-- Menu Level parameters (0 - root menu level, 1 - for all sublevels)     -->
	<level 
		numb= "0"
		fixed_menu_width = "40"	
		menu_height_coef = "34"
		dist_between_menu_items_x = "0"
		dist_between_menu_items_y = "1"	
	>		
		<font	
			comment = " font parameters in 3 states normal, mouseover,selected"
			size = "11"
			underline_normal = "0"
			underline_mouseover = "0"
			underline_selected = "0"
			bold_normal = "1"
			bold_mouseover = "1"
			bold_selected = "1"
			color_normal =    "0xFFFFFF"
			color_mouseover = "0x9DFE5D"
			color_selected =  "0x9DFE5D"
		/>
		<place_dist
			border_dist = "10"		comment = "distance between menu item left border and text"
		/>
		
	</level>

	<level 
		numb= "1"	comment = "for all menu sublevels"
		fixed_menu_width = "10"		
		menu_height_coef = "20"
		dist_between_menu_items_x = "2"
		dist_between_menu_items_y = "0"
	>		
		<font
			comment = " font parameters in 3 states normal, mouseover,selected"
			size = "11"
			underline_normal = "0"
			underline_mouseover = "0"
			underline_selected = "0"
			bold_normal = "1"
			bold_mouseover = "1"
			bold_selected = "1"			
			color_normal =    "0x8C8C8C"
			color_mouseover = "0x6B56E9"
			color_selected =  "0x6B56E9" 
		/>
		<place_dist
			border_dist = "10"		comment = "distance between menu item left border and text"
		/>
	</level>

	<!--  MENU STRUCTURE	-->
	<menu_structure>
		<item>
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
out.println("<item text=\""+top_menu_name+"\" url=\"\" url_self=\"0\" />");
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
String prnt_pgmNo = "";
for (int j=0; j<menuList.size(); j++) {
	menuBean = (MenuBean)menuList.get(j);
	level = Integer.parseInt(menuBean.getMenuLevel());
	child_cnt = Integer.parseInt(menuBean.getChildCnt());
	pgm_nm = menuBean.getMenuText();
	prnt_pgmNo = ( !"".equals(menuBean.getPid()) )?menuBean.getPid():"";
	//pgm_url = (menuBean.getProgramName().equals(""))? "" : (menuBean.getProgramName()+((menuBean.getProgramName().indexOf("?")>0)?"&":"?")+"pgmNo="+menuBean.getMenuId());
	String turl = menuBean.getProgramName();
	if ( turl.indexOf(".do") > 0 )
		pgm_url = menuBean.getMenuId()+turl.substring(turl.indexOf(".do")) + ((turl.indexOf("?")>0)? "&" : "?") + "MENU=Y&pgmNo="+menuBean.getMenuId()+"&pid="+prnt_pgmNo;
	else
		pgm_url = turl;

	auth_yn = menuBean.getAuthYn();
	pgm_nm = pgm_nm.replaceAll("&","&amp;");
	pgm_nm = pgm_nm.replaceAll("<","[");
	pgm_nm = pgm_nm.replaceAll(">","]");
	pgm_url = pgm_url.replaceAll("&","&amp;");
	if ( level < prev_level ) {
		for ( int i = 0 ; i < prev_level-level ; i++ ) {
%></item>
<%		}
		if ( level == 1 ) { d2_idx = 0; d3_idx = 0; d4_idx = 0; d5_idx = 0; }
		else if ( level == 2 ) { d3_idx = 0; d4_idx = 0; d5_idx = 0; }
		else if ( level == 3 ) { d4_idx = 0; d5_idx = 0; }
		else if ( level == 4 ) { d5_idx = 0; }
	}
%><item text = "<%=pgm_nm%>" url = "<%=pgm_url%>" url_self = "0" <%=(child_cnt>0)?"":"/"%>>
<%
	prev_level = level;
}
if ( prev_level > 1 ) 
	for ( int i = 0 ; i < prev_level-1 ; i++ ) out.println("</item>");
%>
		</item>
	</menu_structure>
</menu>