<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/template.tld" prefix="template"%>

<%@ page import="com.clt.framework.component.util.JSPUtil"%>

<%@ page import="com.clt.sample.lang.multylangaccess.event.MultyLangEvent"%>
<%@ page import="com.clt.syscommon.common.table.ComUserVO"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>

<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.framework.support.view.signon.web.SignOnFilter" %>

<%@ taglib uri="/WEB-INF/fmt.tld" prefix="fmt"%>


<%
	String strUsr_id = "";
	String strUsr_nm = "";
	String strErrMsg = ""; //에러메세지
	
	//ComUserVO testVo = null;
	MultyLangEvent event = null;
	SignOnUserAccount account = null;
	Exception serverException = null;
	
	event = (MultyLangEvent) request.getAttribute("Event");
	
// 	strLangType = (String) request.getSession().getAttribute(SignOnFilter.FORM_LANG_TP_CD_TYPE);
	//out.print("lang : "+strLangType+"<br/>");
	serverException = (Exception) request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

	
	account = (SignOnUserAccount) session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
	strUsr_id = account.getUsr_id();
	strUsr_nm = account.getUsr_nm();
	//out.print("strUsr_id : "+strUsr_id+"<br/>");
	//out.print("strUsr_id : "+strUsr_nm+"<br/>");
	//out.print("serverException : "+serverException+"<br/>");
	
	if (serverException != null) {
		strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
	}
	
	String strLangType = (((String)request.getSession().getAttribute(SignOnFilter.FORM_LANG_TP_CD_TYPE)).toLowerCase());
	if("eng".equals(strLangType) || "".equals(strLangType)){
		strLangType = "";
	}
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<fmt:setLocale value="<%=strLangType %>"/>
	<fmt:setBundle basename="screenlabel"/>
	
<title><template:insert parameter="title" /></title>

<script type="text/javascript">

	function fn_change(){
		var frm = document.form;
		var cookieLangVal = frm.local_lang_type.value;
		ComShowMessage("선택 하신 언어는 "+cookieLangVal+" 입니다.");
		/*
		* 20120112 added by Jun Sung, KIM
		* 다국어 지원 메세지 test 위해서 로그인 할때 location 값을 쿠키에 담는다. 현재 en(소문자) 값을 저장함.
		*/
		var todayDate = new Date();
		todayDate.setDate( todayDate.getDate() + "1" );
		document.cookie = "local_lang_type="+escape(cookieLangVal.toLowerCase())+"; path=/; expires=" + todayDate.toGMTString() + ";";
		// 다국어 지원 end
		
		frm.action = "ServerMultyLangAccess.do";
		frm.submit();
	}
	
	function setupPage(){
		var errMessage = '<%=strErrMsg%>';
		//alert(errMessage);
		if (errMessage.length >= 1) {
			//alert(errMessage);
			ComShowMessage(errMessage);
		} // end if
		//loadPage();
	}
</script>


</head>
<body onload="setupPage();">
<form name="form" action="" method="post">
<br/><br/>
<table style="margin-left: 20px;" align="center">
	<tr>
		<td align="right"><fmt:message key="lang.table.title"></fmt:message></td>
		<td> : </td>
		<td align="left">
			<select name="local_lang_type"  style="width: 60px;" onchange="javascript:fn_change();">
           		<option value="ENG" <%if("ENG".equals(strLangType.toUpperCase())){ %>selected="selected"<%} %>>-- 선택 --</option>
           		<option value="EN" <%if("EN".equals(strLangType.toUpperCase())){ %>selected="selected"<%} %>>EN</option>
           		<option value="KR"  <%if("KR".equals(strLangType.toUpperCase())){ %>selected="selected"<%} %>>KR</option>
           		<option value="CN" <%if("CN".equals(strLangType.toUpperCase())){ %>selected="selected"<%} %>>CN</option>
           	</select>
		</td>
	</tr>
</table>
<br/><br/>

<table width="100%" border="0" cellpadding="0" cellspacing="0" style="padding:0 5px 0 5px;">
	<tr><td valign="top">
		<table width="100%" border="0" cellpadding="0" cellspacing="0" class="title">
			<tr>
				<td width="55%"></td>
				<td align="right"><b><fmt:message key="lang.user.info.id"></fmt:message></b> : <%=strUsr_id %></td>
				<td align="right"><b><fmt:message key="lang.user.info.name"></fmt:message></b> : <%=strUsr_nm %></td>
			</tr>
		</table>
	<!----title / history --start------------------>
		<table width="100%" border="0" cellpadding="0" cellspacing="0" class="title">
			<tr><td class="history"><img src="img/icon_history_dot.gif" align="absmiddle"><span id="navigation"></span></td></tr>
			<tr><td class="title"><img src="img/icon_title_dot.gif" align="absmiddle">&nbsp;<fmt:message key="lang.page.title"></fmt:message></td></tr>
		</table>
		
		
    <!-------title / history area--end--------------->	
	
	<!--biz page (S)-->
	
			<table class="search"> 
       	<tr><td class="bg">
				
				<table class="search" border="0" style="width:100%;"> 
				<tr class="h23">
					<td width=""><fmt:message key="lang.table.colum1"></fmt:message></td>
					<td width=""  colspan="3"><input type="text" style="width:120;ime-mode:disabled;text-align:center" class="input1" name="loc_cd" dataformat="uppernum" maxlength="5"><img src="img/btns_search.gif" width="18" height="20" alt="" border="0" align="absmiddle" name="btns_search1"></td>
				</tr>	
				<tr class="h23">
					<td width="90"><fmt:message key="lang.table.colum2"></fmt:message></td>
					<td width="420"><input type="text" style="width:400;" class="input1"  name="loc_nm" dataformat="engnum" maxlength="50"></td>
					<td width="80"><fmt:message key="lang.table.colum3"></fmt:message></td>
					<td width=""><input type="text" style="width:100%;" class="input" name="loc_locl_lang_nm" maxlength="200"></td>
					</tr>	
				</table>
				<table class="search" border="0" style="width:979;"> 
				<tr class="h23">
					<td width="90"><fmt:message key="lang.table.colum4"></fmt:message></td>
					<td width="160"><select><option>-- 선택 --</option></select></td>
					<td width="300"><input type="checkbox" name="call_port_flg" class="trans" value="Y">
						<fmt:message key="lang.table.colum5"></fmt:message>&nbsp;</td>
					<td width="40"><fmt:message key="lang.table.colum6"></fmt:message></td>
					<td width="210"><select style="width:140;" class="input1" name="port_inlnd_cd">
							<option value="N" selected>N</option>
							<option value="Y">Y</option>
							</select></td>
					<td width="40"><fmt:message key="lang.table.colum7"></fmt:message></td>
					<td width=""><select><option>-- 선택 --</option></select></td>
					</tr>	
				</table>
				
				<table class="line_bluedot"><tr><td></td></tr></table>		
				
				<table class="search" border="0" style="width:979;"> 
					<tr class="h23">
						<td width="90"><fmt:message key="lang.table.colum8"></fmt:message></td>
						<td width="110"><select><option>-- 선택 --</option></select></td>
						<td width="100"><fmt:message key="lang.table.colum9"></fmt:message></td>
						<td width="130"><input type="text" style="width:90;ime-mode:disabled;text-align:center" class="input1" name="sconti_cd" dataformat="engup" maxlength="2"><img src="img/btns_search.gif" width="18" height="20" alt="" border="0" align="absmiddle" name="btns_search2"></td>
						<td width="55"><fmt:message key="lang.table.colum10"></fmt:message></td>
						<td width="130"><input type="text" style="width:90;ime-mode:disabled;text-align:center" class="input1" name="cnt_cd" dataformat="engup" maxlength="2"><img src="img/btns_search.gif" width="18" height="20" alt="" border="0" align="absmiddle" name="btns_search3"></td>
						<td width="50"><fmt:message key="lang.table.colum11"></fmt:message></td>
						<td width="130"><input type="text" style="width:90;ime-mode:disabled;text-align:center" class="input1" name="rgn_cd" dataformat="engup" maxlength="3"><img src="img/btns_search.gif" width="18" height="20" alt="" border="0" align="absmiddle" name="btns_search4"></td>
						<td width="50"><fmt:message key="lang.table.colum12"></fmt:message></td>
						<td width=""><input type="text" style="width:90;ime-mode:disabled;text-align:center" class="input" name="ste_cd" dataformat="uppernum" maxlength="3"><img src="img/btns_search.gif" width="18" height="20" alt="" border="0" align="absmiddle" name="btns_search5"></td>
					</tr>	
				</table>
				<table class="search" border="0" style="width:979;"> 
					<tr class="h23">
						<td width="90"><fmt:message key="lang.table.colum13"></fmt:message></td>
						<td width="380"><input type="text" style="width:340;ime-mode:disabled;text-align:center" class="input1" name="scc_cd" dataformat="uppernum" maxlength="5"><img src="img/btns_search.gif" width="18" height="20" alt="" border="0" align="absmiddle" name="btns_search6"></td>
						<td width="70"><fmt:message key="lang.table.colum14"></fmt:message></td>
						<td width=""><input type="text" style="width:248;ime-mode:disabled;text-align:center" class="input" name="rep_zn_cd" dataformat="uppernum" maxlength="7"><img src="img/btns_search.gif" width="18" height="20" alt="" border="0" align="absmiddle" name="btns_search7"></td>
					</tr>	
				</table>
				<table class="line_bluedot"><tr><td></td></tr></table>		
				
				<table class="search" border="0" style="width:979;"> 
					<tr class="h23">
						<td width="95"><fmt:message key="lang.table.colum15"></fmt:message></td>
						<td width="130"><input type="text" style="width:100;ime-mode:disabled;text-align:center" class="input" name="bkg_bl_pfx_cd" dataformat="engup" maxlength="3"></td>
						<td width="100"><fmt:message key="lang.table.colum16"></fmt:message></td>
						<td width="130"><input type="text" style="width:100;ime-mode:disabled;text-align:center" class="input" name="zip_cd" dataformat="num" maxlength="10"></td>
						<td width="110"><fmt:message key="lang.table.colum17"></fmt:message></td>
						<td width=""><input type="text" style="width:100;ime-mode:disabled;text-align:right" class="input" name="gmt_hrs" dataformat="num" maxlength="3"></td>
					</tr>	
				</table>
				<table class="search" border="0" style="width:979;"> 
				<tr class="h23">
					<td width="95"><fmt:message key="lang.table.colum18"></fmt:message></td>
					<td width="130"><input type="text" style="width:78;ime-mode:disabled;text-align:center" class="input" name="cstms_cd" dataformat="uppernum" maxlength="10"></td>
					<td width="100"><fmt:message key="lang.table.colum19"></fmt:message></td>
					<td width=""><select style="width:60;" class="input" name="cml_zn_flg">
							<option value="" selected></option>
							<option value="N">N</option>
							<option value="Y">Y</option>
							</select></td>
				</tr>	
				</table>
				<table class="search" border="0" style="width:979;"> 
					<tr class="h23">
						<td width="95"><fmt:message key="lang.table.colum20"></fmt:message></td>
						<td width="130"><input type="text" style="width:100;ime-mode:disabled;text-align:right" class="input" name="loc_lat" dataformat="float" maxlength="6" size="5" pointcount="2"></td>
						<td width="100"><fmt:message key="lang.table.colum21"></fmt:message></td>
						<td width="130"><select style="width:80;" class="input" name="lat_ut_cd">
								<option value="" selected></option>
								<option value="N">N</option>
								<option value="S">S</option>
								</select></td>
						<td width="110"><fmt:message key="lang.table.colum22"></fmt:message></td>
						<td width="130"><input type="text" style="width:100;ime-mode:disabled;text-align:right" class="input" name="loc_lon" dataformat="float" maxlength="6" pointcount="2"></td>
						<td width="100"><fmt:message key="lang.table.colum21"></fmt:message></td>
						<td width=""><select style="width:60;" class="input" name="lon_ut_cd">
								<option value="" selected></option>
								<option value="E">E</option>
								<option value="W">W</option>
								</select></td>
					</tr>	
				</table>
				
	</td></tr>
		</table>	
	<!--biz page (E)-->	
	<table><tr><td height="2"></td></tr></table>
	<table style="width:100%;" border="0" ><tr><td class="bgtop"></td></tr></table>

		
	<!----btn area--start------------------>	
	<table width="100%" class="button" border="0" cellpadding="0" cellspacing="0" style="padding-top:5;,padding-bottom:0;">
   	<tr><td class="btn1_bg">
	    <table border="0" cellpadding="0" cellspacing="0">
	    <tr>
			<td><table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
				<tr><td class="btn1_left"></td>
				<td class="btn1" name="btn_Retrieve"><fmt:message key="lang.button.order1"></fmt:message></td>
				<td class="btn1_right"></td>
				</tr>
			</table></td>
			<td><table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
				<tr><td class="btn1_left"></td>
				<td class="btn1" name="btn_New"><fmt:message key="lang.button.order2"></fmt:message></td>
				<td class="btn1_right"></td>
				</tr>
			</table></td>
			<td><table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
				<tr><td class="btn1_left"></td>
				<td class="btn1" name="btn_Save"><fmt:message key="lang.button.order3"></fmt:message></td>
				<td class="btn1_right"></td>
				</tr>
			</table></td>
		</tr>
		</table>
	</td>
    </tr>
    </table>
<!----------btn area--end------------------>	

	<table width="100%"  id="mainTable"> 
		<tr>
			<td width="100%">
			</td>
		</tr>
	</table>
		
</td></tr>
</table>	

</form>
</body>
</html>