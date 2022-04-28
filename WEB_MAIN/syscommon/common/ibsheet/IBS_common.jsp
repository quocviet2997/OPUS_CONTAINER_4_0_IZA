<%--=========================================================================
'주  시 스 템 : 공통
'서브  시스템 : 
'프로그램 ID  : IBS_common.jsp
'프로그램 명  : 
'프로그램개요 : 
'작   성   자 : 
'작   성   일 : 2007.10.25
=============================================================================
'수정자/수정일 :
'수정사유/내역 :
=========================================================================--%>
<%@ page import="com.clt.syscommon.common.ibsheet.IbSheetUtil"%>
<%
	IbSheetUtil util = IbSheetUtil.getInstance();
	String mode = request.getParameter("ibs_udataMode");
	String usr_id = request.getParameter("ibs_udataUsrId"); 
	String scrn_id = request.getParameter("ibs_udataScrnId"); 
	String sh_id = request.getParameter("ibs_udataShId"); 
	String hdr_desc = request.getParameter("ibs_udataHdrDesc");

	
	try {
		out.clear();
		
		if("SAVE".equals(mode)) {
			util.saveIbSetting(usr_id, scrn_id, sh_id, hdr_desc);
			out.print("SUCCESS");
		} else if("DEL".equals(mode)) {
			util.delIbSetting(usr_id, scrn_id, sh_id);
			out.print("SUCCESS");
		} else if("SEARCH".equals(mode)) {
			hdr_desc = util.searchIbSetting(usr_id, scrn_id, sh_id);
			out.print(sh_id + "::" + hdr_desc);
		}
	} catch(Exception e) {
		out.println("ERROR");
	}
%>