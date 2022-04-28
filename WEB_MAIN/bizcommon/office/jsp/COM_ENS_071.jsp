<!--=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName : COM_ENS_071.jsp
*@FileTitle : Office 조회(공통 Popup)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/14
=========================================================-->
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.office.event.ComEns071Event"%>
<%@ page import="com.clt.syscommon.common.util.OrganizationUtil"%>
<%
	ComEns071Event event = null; //PDTO(Data Transfer Object including Parameters)
	Exception serverException = null; //서버에서 발생한 에러
	
	String strErrMsg = ""; //에러메세지
	String main_page = "";
	String usr_ofc_cd = "";

	String mdm_yn = JSPUtil.getParameter(request, "mdm_yn".trim(), "");
	String delt_flg = JSPUtil.getParameter(request, "delt_flg".trim(), "");
	
	try {
		SignOnUserAccount account = (SignOnUserAccount) session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
	//	usr_ofc_cd = account.getOfc_cd();
		usr_ofc_cd = (new OrganizationUtil()).getParentOffice(account.getUsr_id());
		event = (ComEns071Event) request.getAttribute("Event");

		serverException = (Exception) request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		main_page = JSPUtil.getParameter(request, "main_page".trim(), "");
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
	} catch (Exception e) {
		out.println(e.toString());
	}
%>
<%
	/*
	  아래의 내용은 업무 공통에 필요한 값을 prefix한다. 
	 */
	String classId = JSPUtil.getParameter(request, "ClassId".trim(), "");
	String paramDisplay = JSPUtil.getParameter(request, "Display".trim(), "");
	String selectType = JSPUtil.getParameter(request, "SelectType".trim(), "");
	String callType = JSPUtil.getParameter(request, "CallType".trim(),"");
	String formNames = JSPUtil.getParameter(request,"FormNames".trim(), "");
	/*
		아래는 메인 화면에서 선택한 내용을 조회 조건으로 설정하기 위한 파라메터 값을 받는다. 
	 */
	/*String ofc_cd = JSPUtil.getParameter(request, "ofc_cd".trim(), "");
	String ofc_nm = JSPUtil.getParameter(request, "ofc_nm".trim(), "");
	String ofc_spc_level = JSPUtil.getParameter(request, "ofc_spc_level".trim(), "");
	String loc_cd = JSPUtil.getParameter(request, "loc_cd".trim(), "");
	String ofc_pts_cd = JSPUtil.getParameter(request, "ofc_pts_cd".trim(), ""); */
	
%>

<script language="javascript">
	function setupPage(){
        var errMessage = "<%=strErrMsg%>";
        if (errMessage.length >= 1) {
        	ComShowMessage(errMessage);
        } // end if
        // InitTab();
        loadPage(<%=main_page%>);
	}
</script>

<!-- 
showErrMessage를 써주지 않으면 에러 발생시 처리가 불가합니다.
그리고 지금은 showErrMessage()으로 되어있지만 추후에 고객님이 변덕을 일으켜서 웹페이지를 호출하라고 할경우를 
대비해서 직접 showErrMessage() 하지 마시고 꼭 showErrMessage를 써주십시오. 한방에 바꾸게요. 표준을 안따르면 나중에 후회합니다.  
-->

<!-- OUTER - POPUP (S)tart -->
<%if(main_page.equals("true")){ %>
<form name="form" onkeyup="ComKeyEnter('lengthnextfocus');">
<input    type="hidden" name="f_cmd">
<!-- mdm data type 에 따른 select box display 구분자-->
<input type="hidden" name="mdm_yn" value="<%=mdm_yn%>">

<!-- 제목 -->
<div class="page_title_area clear">
		<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
		<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
		<!-- page_title(E) -->

		<!-- btn_div -->
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
			 --><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button>
		</div>

   <!-- page_location(S) -->
   <div class="location">
		<span id="navigation"></span>
   </div>
</div>
<!-- 제목 -->


		
<%} else { %>
<form name="form" onkeyup="ComKeyEnter('lengthnextfocus');">
<input    type="hidden" name="f_cmd">
<!-- mdm data type 에 따른 select box display 구분자-->
<input type="hidden" name="mdm_yn" value="<%=mdm_yn%>">

<!-- popup_title_area(S) -->
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title"><span>Office Inquiry</span></h2>
		<!-- page_title(E) -->
			
		<!-- opus_design_btn(S) -->		
		<div class="opus_design_btn">
	    	<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
	    	 --><button type="button" class="btn_normal" name="btn2_Down_Excel" id="btn2_Down_Excel">Down Excel</button><!--
	    	 --><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button><!--
	    	 --><button type="button" class="btn_normal" name="btn_OK" id="btn_OK">OK</button><!--
	   		 --><button type="button" class="btn_normal" name="btn_Close" id="btn_Close">Close</button>
		</div>
		<!-- opus_design_btn(E) -->	
	</div>
	<!-- page_title_area(E) -->

<!-- popup_title_area(E) -->
	
	<%} %>	
<!-- 검색영역 -->

<%if(main_page.equals("true")){ %>
<%}else{ %>
<%} %>
	<div class="wrap_search">
		<div class="opus_design_inquiry">		
		
		<table class="search" border="0" style="width:100%"> 
		<tr class="h23">
			<th width="90px">Location Code</th>
			<td width="70px"><input type="text" name=loc_cd style="width:50px;ime-mode:disabled" maxlength="5" dataformat="engup"></td>
			<th width="80px">Office Level</th>
			<td width="100px">
				<select name=ofc_lev style="width:80px;">
					<option value="" selected>ALL</option>
					<option value="1">HO</option>
					<option value="2">RHQ</option>
					<option value="3">BB(AA)</option>
					<option value="4">SUB-BB(AA)</option>
				</select>
			</td>
			<th width="112px">Parent Office</th>
			<td width="70px"><input type="text" name=ofc_pts_cd style="width:60px;ime-mode:disabled" maxlength="6" dataformat="enguponly"></td>
			<%
				if(!"".equals(mdm_yn) && mdm_yn.length() > 0){
				%>
				<td width="50px">Status</td>
				<td width="">
					<select style="width:85px;" name="delt_flg">
							<option value="ALL" <%if("ALL".equals(delt_flg)){ %> selected="selected" <%} %>>ALL</option>
							<option value="N" <%if("N".equals(delt_flg) || "".equals(delt_flg)){ %> selected="selected" <%} %>>Active</option>
							<option value="Y" <%if("Y".equals(delt_flg)){ %> selected="selected" <%} %>>Delete</option>
						</select>
				</td>
			<%
					}
			%>
				<td>&nbsp;</td>
		</tr></table>
		<table class="search" border="0" style="width:100%"> 
		<tr class="h23">
			<th width="90px">Office Code</th>
			<td width="70px"><input type="text" name=ofc_cd style="width:70px;ime-mode:disabled" maxlength="6" dataformat="enguponly"></td>
			<th width="80px">Office Name</th>
			<td width=""><input type="text" name=ofc_nm style="width:270px" dataformat="excepthan" otherchar=" "></td>
			<!--  공통  Hidden  -->
			<input type="hidden" name=ClassId value='<%=classId%>'> 
			<input type="hidden" name=Display value='<%=paramDisplay%>'> 
			<input type="hidden" name=SelectType value='<%=selectType%>'> 
			<input type="hidden" name=CallType value='<%=callType%>'> 
			<input type="hidden" name=FormNames value='<%=formNames%>'> 
			
		</tr>
		</table>
		</div>
	</div>
	
	<div class="wrap_result" >
		<div class="opus_design_grid">		
			<script language="javascript">ComSheetObject('sheet1');</script>
		</div>
	</div>
<%if(main_page.equals("true")){ %>
<%}else{ %>
<%} %>

</form>


<SCRIPT LANGUAGE="javascript">
<!--
      /* 
        ibSheet 를 제외한 폼 입력값(?) 유저가 입력한 정보를 event를 통해서 다시 넘겨받아 화면에 뿌려주는 부분입니다. 
      */
      with(document.form)
      {
        <%if (event != null) {
				String loc_cd = event.getLoc_cd();
				String ofc_lev = event.getOfc_lev();

				String ofc_cd = event.getOfc_cd();
				//String ofc_nm = event.getOfc_nm();

				// Parent Office Default 세팅
       
      		if(JSPUtil.getParameter(request, "ofc_pts_cd".trim(), "").equals("ALL") ){
%>      		
      			eval("ofc_pts_cd").value     = "";
<%      		
      		}else if(!JSPUtil.getParameter(request, "ofc_pts_cd".trim(), "").equals("") ){
%>      		
      			eval("ofc_pts_cd").value     = "<%=JSPUtil.getParameter(request, "ofc_pts_cd".trim(), "")%>";
<%      		
      		}else{
%>      		
      			eval("ofc_pts_cd").value     = "<%=usr_ofc_cd%>";
<%      		
      		}
%>      		
			
	        eval("loc_cd").value     = "<%=loc_cd%>";
	        eval("ofc_lev").value     = "<%=ofc_lev%>";

	        eval("ofc_cd").value     = "<%=ofc_cd%>";
	        
	        
        <%}%>
       }
-->
</SCRIPT>