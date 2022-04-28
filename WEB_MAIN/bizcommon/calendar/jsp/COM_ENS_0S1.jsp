<%--
/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0S1.jsp
*@FileTitle : country
*Open Issues :
*Change history :
*@LastModifyDate : 2006-11-03
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-11-03 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/ 
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.bizcommon.calendar.event.ComEns0S1Event"%>
<%@ page import="com.clt.bizcommon.calendar.event.ComEns0S1EventResponse"%>
<%
	ComEns0S1Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	ComEns0S1EventResponse eventResponse = null;	//RDTO(Data Transfer Object including DB ResultSet)
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
		event = (ComEns0S1Event)request.getAttribute("Event");
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
	eventResponse = (ComEns0S1EventResponse)request.getAttribute("EventResponse");
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
<title>Local Calendar</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script language="javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>
</head>
<!-- 
showErrMessage를 써주지 않으면 에러 발생시 처리가 불가합니다.
그리고 지금은 showErrMessage()으로 되어있지만 추후에 고객님이 변덕을 일으켜서 웹페이지를 호출하라고 할경우를 
대비해서 직접 showErrMessage() 하지 마시고 꼭 showErrMessage를 써주십시오. 한방에 바꾸게요. 표준을 안따르면 나중에 후회합니다.  
-->

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" onload="javascript:setupPage();">
<form method="post" name="form" onSubmit="return false;">
<input type="hidden" name="f_cmd"> 
<input type="hidden" name="iPage">

<!-- OUTER FRAME : "to make sum of components' HEIGHTS 100%" (S)tart -->
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
<tr><td valign="top">
<!-- ################# TABLE '#A' ::: 'TOP' FRAME (START) ################## -->

<!-- ################# TABLE '#B' ::: 'LEFT + RIGHT' FRAME (START) ################## -->
<!-- TABLE '#B' : 'Left + Right Body' Table (S)tart -->
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
<tr>
	<td class="bodyright">

		<!-- TABLE '#D' : ( Button : Main ) (S) -->
		<table width="100%" class="button">
			<tr>
			<td class="btn2_bg">
				<table border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td>
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
							<tr><td class="btn2_left"></td>
								<td class="btn2" name="btn_Retrieve">Retrieve</td>
								<td class="btn2_right"></td>
							</tr>
						</table>
					</td>
					<td>
						<table id="table_save" width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
							<tr><td class="btn2_left"></td>
								<td class="btn2" name="btn_New">New</td>
								<td class="btn2_right"></td>
							</tr>
						</table>
					</td>
					<td>
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
							<tr><td class="btn2_left"></td>
								<td class="btn2" name="btn_Save">Save</td>
								<td class="btn2_right"></td>
							</tr>
						</table>
					</td>
					<td>
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
							<tr><td class="btn2_left"></td>
								<td class="btn2" name="btn_Down_Excel">Down Excel</td>
								<td class="btn2_right"></td>
							</tr>
						</table>
					</td>
				</tr>
				</table>
			</td>
			</tr>
		</table>
		<!-- TABLE '#D' : ( Button : Main ) (E) -->

		<table class="height_15"><tr><td></td></tr></table>

		<!-- TABLE '#D' : ( Tab ) (S) -->
		<table class="tab" border="0" cellpadding="0" cellspacing="0" width=100%>
			<tr>
				<td width="100%">
					<script language="javascript">ComTabObject('tab1')</script>
				</td>
			</tr>
		</table>
		<!-- TABLE '#D' : ( Tab ) (E) -->
		

<div id="tabLayer" style="display:inline">
		<!-- TABLE '#D' : ( Tab BG Box ) (S) -->
		<table class="search" border="0">
			<tr>
				<td class="bg_b1">

					<table class="height_10"><tr><td></td></tr></table>

					<table class="search" border="0" style="width:733;">
						<tr class="h23">
							<td width="6%">Country</td>
							<td width="18%">&nbsp;<input class="input1" name="cnt_cd_cnt" maxlength="2" type="text" style="width:35" onKeyUp="javascript:upper(this);" onkeydown="cntPopup(0);"> <img class="cursor" src="img/opus/button/btns_search.gif" width="19" height="20" border="0" align="absmiddle" name="btn_cnt_cd"></td>
							<td width="6%">Period</td>
							<td>&nbsp;<input name="frDate_cnt" type="text" style="width:75"> <img class="cursor" src="img/opus/button/btns_calendar.gif" width="19" height="20" border="0" align="absmiddle" name="btn_calendar_fr"> ~ 
									  <input name="toDate_cnt" type="text" style="width:75"> <img class="cursor" src="img/opus/button/btns_calendar.gif" width="19" height="20" border="0" align="absmiddle" name="btn_calendar_to"></td>
						</tr>
					</table>

					<table class="height_10"><tr><td></td></tr></table>
						<table width="100%" id="mainTable" height="150">
				                   <tr><td>
				                     <script language="javascript">ComSheetObject('sheet_cnt');</script>
				                   </td></tr>
					        </table>
			<!-- : ( Grid : Week ) (E) -->
			</td></tr>
		</table>
		<!-- TABLE '#D' : ( Tab BG Box ) (E) -->
		
		<!-- : ( Button : Grid ) (S) -->
		<table width="100%" class="button">
			<tr>
			<td class="btn2_bg">
				<table border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td>
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
							<tr><td class="btn2_left"></td>
								<td class="btn2" name="btng_t1_Row_Add">Row Add</td>
								<td class="btn2_right"></td>
							</tr>
						</table>
					</td>
				</tr>
				</table>
			</td>
			</tr>
		</table>
    	<!-- : ( Button : Grid ) (E) -->

		<!-- ####### TABLE '#D' ::: 'RIGHT' FRAME (END) ####### -->
</div>
<div id="tabLayer" style="display:none">
		<!-- TABLE '#D' : ( Tab BG Box ) (S) -->
		<table class="search" border="0">
			<tr>
				<td class="bg_b1">

					<table class="height_10"><tr><td></td></tr></table>

					<table class="search" border="0" style="width:733;">
						<tr class="h23">
							<td width="6%">Country</td>
							<td width="12%">&nbsp;<input class="input1" name="cnt_cd_ste" maxlength="2" type="text" style="width:35" onChange="javascript:setSteList(this, document.form.ste_cd_ste);" onkeydown="cntPopup(1);"> <img class="cursor" src="img/opus/button/btns_search.gif" width="19" height="20" border="0" align="absmiddle" name="btn_cnt_cd"></td>
							<td width="15%">State / Province</td>
							<td width="25%"><select name="ste_cd_ste" style="width:50;">
											</select>
							</td>
							<td width="6%">Period</td>
							<td>&nbsp;<input name="frDate_ste" type="text" style="width:75"> <img class="cursor" src="img/opus/button/btns_calendar.gif" width="19" height="20" border="0" align="absmiddle" name="btn_calendar_fr"> ~ 
									  <input name="toDate_ste" type="text" style="width:75"> <img class="cursor" src="img/opus/button/btns_calendar.gif" width="19" height="20" border="0" align="absmiddle" name="btn_calendar_to"></td>
						</tr>
					</table>

					<table class="height_10"><tr><td></td></tr></table>

						<table width="100%" id="mainTable" height="150">
				                   <tr><td>
				                     <script language="javascript">ComSheetObject('sheet_ste');</script>
				                   </td></tr>
					        </table>
			<!-- : ( Grid : Week ) (E) -->
			</td></tr>
		</table>
		<!-- TABLE '#D' : ( Tab BG Box ) (E) -->
		
		<!-- : ( Button : Grid ) (S) -->
		<table width="100%" class="button">
			<tr>
			<td class="btn2_bg">
				<table border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td>
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
							<tr><td class="btn2_left"></td>
								<td class="btn2" name="btng_t2_Row_Add">Row Add</td>
								<td class="btn2_right"></td>
							</tr>
						</table>
					</td>
				</tr>
				</table>
			</td>
			</tr>
		</table>
    	<!-- : ( Button : Grid ) (E) -->
</div>
<div id="tabLayer" style="display:none">
		<!-- TABLE '#D' : ( Tab BG Box ) (S) -->
		<table class="search" border="0">
			<tr>
				<td class="bg_b1">

					<table class="height_10"><tr><td></td></tr></table>

					<table class="search" border="0" style="width:733;">
						<tr class="h23">
							<td width="8%">Country</td>
							<td width="12%">&nbsp;<input class="input1"name="cnt_cd_loc" maxlength="2" type="text" style="width:35" onKeyUp="javascript:upper(this);" onkeydown="cntPopup(2);"> <img class="cursor" src="img/opus/button/btns_search.gif" width="19" height="20" border="0" align="absmiddle" name="btn_cnt_cd"></td>
							<td width="7%">Location</td>
							<td width="15%">&nbsp;<input class="input1" name="loc_cd_loc" type="text" style="width:50" onKeyUp="javascript:upper(this);" onkeydown="locPopup();"> <img class="cursor" src="img/opus/button/btns_search.gif" width="19" height="20" border="0" align="absmiddle" name="btn_loc_cd"></td>
							<td width="6%">Period</td>
							<td>&nbsp;<input name="frDate_loc" type="text" style="width:75"> <img class="cursor" src="img/opus/button/btns_calendar.gif" width="19" height="20" border="0" align="absmiddle" name="btn_calendar_fr"> ~ 
									  <input name="toDate_loc" type="text" style="width:75"> <img class="cursor" src="img/opus/button/btns_calendar.gif" width="19" height="20" border="0" align="absmiddle" name="btn_calendar_to">
							</td>
						</tr>
					</table>

					<table class="height_10"><tr><td></td></tr></table>


						<table width="100%" id="mainTable" height="150">
				                   <tr><td>
				                     <script language="javascript">ComSheetObject('sheet_loc');</script>
				                   </td></tr>
					        </table>
			<!-- : ( Grid : Week ) (E) -->
			</td></tr>
		</table>
		<!-- TABLE '#D' : ( Tab BG Box ) (E) -->
		<!-- : ( Button : Grid ) (S) -->
		<table width="100%" class="button">
			<tr>
			<td class="btn2_bg">
				<table border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td>
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
							<tr><td class="btn2_left"></td>
								<td class="btn2" name="btng_t3_Row_Add">Row Add</td>
								<td class="btn2_right"></td>
							</tr>
						</table>
					</td>
				</tr>
				</table>
			</td>
			</tr>
		</table>
    	<!-- : ( Button : Grid ) (E) -->
</div>
<div id="tabLayer" style="display:none">
		<table class="search" border="0">
			<tr>
				<td class="bg_b1">

					<table class="height_10"><tr><td></td></tr></table>

					<table class="search" border="0" style="width:733;">
						<tr class="h23">
							<td width="9%">Continent</td>
							<td width="15%">&nbsp;<%= com.clt.bizcommon.util.BizComUtil.getCodeCombo("conti_cd", "", "", "CONTI", 1, "0: :ALL") %></td>
							<td width="8%">Country</td>
							<td width="12%">&nbsp;<input class="input1" name="cnt_cd_month" maxlength="2" type="text" style="width:35" onChange="javascript:setFormConti(this, document.form.conti_cd);" onkeydown="cntPopup(3);"> <img class="cursor" src="img/opus/button/btns_search.gif" width="19" height="20" border="0" align="absmiddle" name="btn_cnt_cd"></td>
							<td width="4%">Year</td>
							<td>&nbsp;<input name="year" type="text" style="width:40"></td>
						</tr>
					</table>

					<table class="height_10"><tr><td></td></tr></table>

						<table width="100%" id="mainTable" height="150">
				                   <tr><td>
				                     <script language="javascript">ComSheetObject('sheet_month');</script>
				                   </td></tr>
					        </table>
			<!-- : ( Grid : Week ) (E) -->
			</td></tr>
		</table>
		<!-- TABLE '#D' : ( Tab BG Box ) (E) -->
		<!-- : ( Button : Grid ) (S) -->
		<table width="100%" class="button">
			<tr>
			<td class="btn2_bg">
				<table border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td>
						<table id="table_row_add" width="100%" border="0" cellpadding="0" cellspacing="0" class="button">
							<tr><td class="btn2_left"></td>
								<td class="btn2" name="btng_t3_Row_Add">Row Add</td>
								<td class="btn2_right"></td>
							</tr>
						</table>
					</td>
				</tr>
				</table>
			</td>
			</tr>
		</table>
    	<!-- : ( Button : Grid ) (E) -->
</div>

	</td>
</tr>
</table>
<!-- TABLE '#B' : 'Left + Right Body' Table (E)nd -->
<!-- ################# TABLE '#B' ::: 'LEFT + RIGHT' FRAME (END) ################## -->

</td></tr>
<tr><td class="bgdybottom_copy">

	<!-- ####### TABLE '#E' ::: 'BOTTOM' FRAME (START) ####### -->
	<!-- TABLE '#E' : 'Family Site + Copyright' Table (S)tart -->
	<table class="copy">
	<tr><td class="copy"><img src="/opuscntr/img/enis/copy2.gif" width="460" height="16"></td></tr>
	</table>
	<!-- TABLE '#E' : 'Family Site + Copyright' Table (E)nd -->
	<!-- ####### TABLE '#E' ::: 'BOTTOM' FRAME (END) ####### -->

</td></tr>

</table>
<!-- OUTER FRAME : "to make sum of components' HEIGHTS 100%" (E)nd -->

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
			   String cnt_cd   =event.getCnt_cd();
			   String frDate   =event.getFrDate();
			   String toDate   =event.getToDate();
			   
			   java.util.Calendar calendar = java.util.Calendar.getInstance();
			   int currYear = calendar.get(java.util.Calendar.YEAR);
			   
			   if(frDate == null || frDate.trim().equals("")) {
				   frDate = currYear + "-01-01";
			   }
			   
			   if(toDate == null || toDate.trim().equals("")) {
				   toDate = currYear + "-12-31";
			   }
		%>
		
		eval("cnt_cd_cnt" ).value = "<%= cnt_cd	 %>";
		eval("frDate_cnt" ).value = "<%= frDate	 %>";
		eval("toDate_cnt" ).value = "<%= toDate	 %>";
		eval("cnt_cd_ste" ).value = "<%= cnt_cd	 %>";
		eval("frDate_ste" ).value = "<%= frDate	 %>";
		eval("toDate_ste" ).value = "<%= toDate	 %>";
		eval("cnt_cd_loc" ).value = "<%= cnt_cd	 %>";
		eval("frDate_loc" ).value = "<%= frDate	 %>";
		eval("toDate_loc" ).value = "<%= toDate	 %>";
		eval("year").value = "<%= currYear	 %>";
		<% } %>
	   }
-->
</SCRIPT>
<iframe name="iframe_bizcom" style="display:none">
