<%--
/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0D1.jsp
*@FileTitle : Surcharge
*Open Issues :
*Change history :
*@LastModifyDate : 2007-02-06
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-13 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/ 
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.surcharge.event.ComEns0D1Event"%>
<%@ page import="com.clt.bizcommon.surcharge.event.ComEns0D1EventResponse"%>
<%
	ComEns0D1Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	ComEns0D1EventResponse eventResponse = null;	//RDTO(Data Transfer Object including DB ResultSet)
	Exception serverException   = null;			//서버에서 발생한 에러
	DBRowSet rowSet	  = null;							   //DB ResultSet
	String strErrMsg = "";								 //에러메세지
	int rowCount	 = 0;								  //DB ResultSet 리스트의 건수
	
	try {
		/*
		꼭 유저의 정보를 받을 필요는 없습니다. 화면에서 유저의 이름이나 
		권한같은 정보를 이용할 필요가 있을 경우에만 사용하면 됩니다.
		덧붙여 USER 정보에 대해서 한마디로 정리하면 user 의 정보를 이용할수 있는 곳은 jsp 와 command 입니다.
		jsp에서는 유저의 정보를 가지고 권한에 따른 버튼 처리등을 할수가 있는 것이고 (enable/disable)
		command에서는 역시 유저의 정보로 예를 들어 update 권한등이 있는지를 확인할 수가 있는 것입니다.
			 
		주의> 사용자 테이블이 변경됨에 따라 변경 될 것입니다.
			SignOnUserAccount 의 메서드를 확인 하십시오.
			getAuth 메서드는 현재 미정이지만 권한 관련 value를 가져올 메서드가 있겠죠?   
	   */ 
	   //SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
	   //userId=account.getUsr_id();
	   //userAuth=account.getAuth(); 
	   
	   
		/* 
		일단 화면에서 USER가 입력한 정보를 다시 화면에서 사용해야 하는 경우 
		request에 담아 서버로 전송시켰다가 다시 그 request에서 받아야 한다고 했습니다.
		이때 유저가 작성한 자료는 event 에 서버로부터 전송된 자료는 eventResponse에 담기게 됩니다.
		이렇게 받은 정보는 jsp 맨 하단에 있는 java script로부터 폼의 value로 값을 전달하게 됩니다.
		본 jsp소스 맨 하단을 참조하십시오.
		*/
		event = (ComEns0D1Event)request.getAttribute("Event");
		/* 
			ErrorHandler를 통해서 받는 에러는 CO_ERRMESSAGE 테이블에 입력되어있는 
			개발자가 정의했거나 공통팀에서 결정한 정의가 되어진 에러메세지입니다 
			Command 에서 EventException으로 throw를 했거나 DAO에서 DAOException을 통해 
			jsp 까지 전달이 되게 됩니다. 해당 파일을 참조하십시오.
			jsp에서 최후에 에러가 display될때 onload시에 실행되는 ShowErrMessage 를 통해 showErrMessage();가 뜨게 됩니다.
			(주의) 이 에러메세지와 자바스크립트 에러를 혼동하지는 마십시오. 
				자바스크립트 에러는 서버로 전송하기전에 "주민등록번호가 잘못되었습니다" 라는 메세지이고 
				throw되는 메세지는 update 를 하려고 권한을 확인해보니까 없어서 
				"해당 권한이 없습니다" 라고 뿌리는 메세지입니다.
		*/
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		/* 
		아래부분은 꼭 지켜주셔야 에러메세지가 정상적으로 전달이 됩니다. 
		보시다시피 먼저 에러를 받고 에러가 아닐시에 EventResponse로 값을 전달하셔야 합니다. 
		*/
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}else{
			eventResponse = (ComEns0D1EventResponse)request.getAttribute("EventResponse");
			if (eventResponse != null) {
				rowSet = eventResponse.getRs();
				if(rowSet != null){
					 rowCount = rowSet.getRowCount();
				} // end if
			} // end if
		} // end else
	}catch(Exception e) {
		out.println(e.toString());
	}
%>
<html>
<head>
<title>Welcome to ENIS!</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- link href="/opuscntr/css/enis_contents.css" rel="stylesheet" type="text/css"-->
<script language="javascript" src="/opuscntr/bizcommon/surcharge/script/COM_ENS_0D1.js"></script>
<script language="javascript">
    function setupPage(){
        var errMessage = "<%=strErrMsg%>";
        if (errMessage.length >= 1) {
            showErrMessage(errMessage);
        } // end if
        
		// 탭을 사용하는 화면인 경우 추가한다.
        // InitTab();
        loadPage();
    }
</script>
</head>
<!-- 
showErrMessage를 써주지 않으면 에러 발생시 처리가 불가합니다.
그리고 지금은 showErrMessage()으로 되어있지만 추후에 고객님이 변덕을 일으켜서 웹페이지를 호출하라고 할경우를 
대비해서 직접 showErrMessage() 하지 마시고 꼭 showErrMessage를 써주십시오. 한방에 바꾸게요. 표준을 안따르면 나중에 후회합니다.  
-->

<body onLoad="setupPage();">

<form name="form">
<input	type="hidden" name="f_cmd"> 
<input type="hidden" name="iPage"> 

<!-- OUTER - POPUP (S)tart -->
<table width="755" class="popup" cellpadding="10"> 
<tr><td class="top"></td></tr>
<tr><td valign="top">
	
		<!-- : ( Title ) (S) -->
		<table width="735" border="0">
		<tr><td height="79" class="title"><img src="/opuscntr/img/enis/ico_t1.gif" width="20" height="12">Surcharge Inquiry By Rote</td></tr>
		</table>
		<!-- : ( Title ) (E) -->
		
		<!-- TABLE '#D' : ( Button : Main ) (S) -->
		<table width="100%" class="button"> 
       	<tr><td class="align">

		   <table class="button"> 
			<tr><td><img class="cursor" src="/opuscntr/img/enis/button/btn_retrieve.gif" width="66" height="20" border="0" name="btn_retrieve"></td>
				<td><img class="cursor" src="/opuscntr/img/enis/button/btn_new.gif" width="66" height="20" border="0" name="btn_new"></td>
			</table>
    
		</td></tr>
		</table>
    	<!-- TABLE '#D' : ( Button : Main ) (E) -->
		
		<!-- TABLE '#D' : ( Search Options : Scenario ID ) (S) -->
		<table class="search"> 
			<tr>
				<td class="bg_a">


				<!-- : ( Scenario ID ) (S) -->
				<table class="search" border="0" style="width:735;"> 
				<tr class="h23">
					<td width="11%">Origin(Export)</td>
					<td width="15%">&nbsp;<input type="text" style="width:50" name="por" maxlength="5" onKeyUp="javascript:upper(this);" onChange="javascript:setSvcScope();"> <img class="cursor" src="/opuscntr/img/enis/button/btns_search.gif" width="19" height="20" border="0" align="absmiddle" name="btn_por_cd"></td>
					<td width="9%">POL</td>
					<td width="15%">&nbsp;<input type="text" style="width:50" name="pol" maxlength="5" onKeyUp="javascript:upper(this);" onChange="javascript:setSvcScope();"> <img class="cursor" src="/opuscntr/img/enis/button/btns_search.gif" width="19" height="20" border="0" align="absmiddle" name="btn_pol_cd"></td>
					<td width="6%">POD</td>
					<td width="14%">&nbsp;<input type="text" style="width:50" name="pod" maxlength="5" onKeyUp="javascript:upper(this);" onChange="javascript:setSvcScope();"> <img class="cursor" src="/opuscntr/img/enis/button/btns_search.gif" width="19" height="20" border="0" align="absmiddle" name="btn_pod_cd"></td>
					<td width="12%">&nbsp;&nbsp;Destin(Import)</td>
					<td width="18%"><input type="text" style="width:50" name="del" maxlength="5" onKeyUp="javascript:upper(this);" onChange="javascript:setSvcScope();"> <img class="cursor" src="/opuscntr/img/enis/button/btns_search.gif" width="19" height="20" border="0" align="absmiddle" name="btn_del_cd"></td></tr> 
					
				<tr class="h23">
					<td>R/Term</td>
					<td><%=JSPUtil.getCodeCombo("selRTerm", "", "", "CD00764", 1, "")%></td>
					<td>SVC Scope</td>
					<td><select style="width:70;" name="selSvcScope">
							<option value="0" selected>CY</option>
							</select></td>
					<td>D/Term</td>
					<td><%=JSPUtil.getCodeCombo("selDTerm", "", "", "CD00765", 1, "")%></td>
					<td>&nbsp;&nbsp;Access Date</td>
					<td><input type="text" style="width:70" name="accessDate">&nbsp;<img class="cursor" src="/opuscntr/img/enis/button/btns_calendar.gif" width="19" height="20" border="0" align="absmiddle"></td></tr> 
				</table>
				
				<table class="search" border="0" style="width:735;"> 	
				<tr class="h23">
					<td width="11%">Cargo Option</td>
					<td width="14%" class="stm"><input type="checkbox" name="specialCargo" class="trans">Special Cargo</td>
					<td width="11%"><select style="width:70;" name="cargoOpt">
							<option value="0" selected>CY</option>
							</select></td>
					
					<td width="9%" class="stm">IMDG Class</td>
					<td width="11%"><select style="width:70;" name="imdgClass">
							<option value="0" selected>CY</option>
							</select></td>
					
					<td width="44%" class="stm"><input type="checkbox" name="chkMisc" class="trans">Incl.Misc Charge</td></tr> 
					
				<tr class="h23">
					<td>Equipment</td>
					<td class="stm" align="right">Type&nbsp;&nbsp;</td>
					<td><select style="width:70;" name="equipmentType">
							<option value="0" selected>CY</option>
							</select></td>
					<td class="stm" align="right">Size&nbsp;&nbsp;</td>
					<td><select style="width:70;" name="equipmentSize">
							<option value="0" selected>CY</option>
							</select></td>
					
					<td class="stm"><input type="checkbox" name="chkOther" class="trans">Incl.Other Rate Basis</td></tr> 
				
				</table>
				<!-- : ( Scenario ID ) (E) -->
				
			</tr>
		</table>
		<!-- TABLE '#D' : ( Search Options : Scenario ID ) (E) --> 	

		<table class="height_10"><tr><td></td></tr></table>


		<!-- TABLE '#D' : ( Tab BG Box ) (S) -->
		<table class="search" border="0"> 
			<tr>
				<td class="bg_b1">
			
			<table class="height_10"><tr><td></td></tr></table>
			
			<!-- : ( Grid ) (S) -->
			<table width="100%" id="mainTable">
                <tr><td>
                     <script language="javascript">comSheetObject('sheet');</script>
                </td></tr>
            </table>
			<!-- : ( Grid ) (E) -->
			
				</td>
			</tr>
		</table>
		<!-- TABLE '#D' : ( Tab BG Box ) (E) -->

		
			
	
</td></tr>
</table> 
<!-- OUTER - POPUP (E)nd -->



<table class="height_10"><tr><td></td></tr></table> 
	
	
<!-- : ( Button : Sub ) (S) -->
<table width="100%" class="sbutton">
<tr><td height="71" class="popup">

		<table class="sbutton">
		<tr><td class="p_bt"><img class="cursor" src="/opuscntr/img/enis/button/btn_ok.gif" width="66" height="20" border="0" name="btn_ok"></td>
			<td class="p_bt"><img class="cursor" src="/opuscntr/img/enis/button/btn_close.gif" width="66" height="20" border="0" name="btn_close"></td></tr>
		</table>

	</td></tr>
</table>
<!-- : ( Button : Sub ) (E) -->

</form>


</body>
</html>

<SCRIPT LANGUAGE="javascript">
<!--
	  
	  /* 
		ibSheet 를 제외한 폼 입력값(?) 유저가 입력한 정보를 event를 통해서 다시 넘겨받아 화면에 뿌려주는 부분입니다. 
	  */
	  with(document.form)
	  {
		<%
		if(event != null){  
			   String conti_cd   =event.getConti_cd();
		%>
		eval("por" ).value = "<%= conti_cd	 %>";
		<% } %>
	   }
-->
</SCRIPT>
<%@include file="../../include/common.jsp"%>
 
<iframe name="iframe_bizcom" style="display:inline"> 