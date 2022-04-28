<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_COM_0013.jsp
*@FileTitle  : Subtrade
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/09
=========================================================
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.subtrade.event.ComCom0013Event"%>
<%
	ComCom0013Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수
	String main_page = "";
	String mdm_yn = request.getParameter("mdm_yn") != null ? request.getParameter("mdm_yn") : "";
	String delt_flg = request.getParameter("delt_flg") != null ? request.getParameter("delt_flg") : "";
	try {  
		/* 
		일단 화면에서 USER가 입력한 정보를 다시 화면에서 사용해야 하는 경우 
		request에 담아 서버로 전송시켰다가 다시 그 request에서 받아야 한다고 했습니다.
		이때 유저가 작성한 자료는 event 에 서버로부터 전송된 자료는 eventResponse에 담기게 됩니다.
		이렇게 받은 정보는 jsp 맨 하단에 있는 java script로부터 폼의 value로 값을 전달하게 됩니다.
		본 jsp소스 맨 하단을 참조하십시오.
		*/
		event = (ComCom0013Event)request.getAttribute("Event");
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
		main_page = JSPUtil.getParameter(request, "main_page".trim(), "");
		/* 
		아래부분은 꼭 지켜주셔야 에러메세지가 정상적으로 전달이 됩니다. 
		보시다시피 먼저 에러를 받고 에러가 아닐시에 EventResponse로 값을 전달하셔야 합니다. 
		*/
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
	}catch(Exception e) {
		out.println(e.toString());
	}
%>

<script type="text/javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if

		loadPage();
	}
</script>

<form name="form">
<input	type="hidden" name="f_cmd"> 
<input  type="hidden" name="iPage"> 
<!-- mdm data type 에 따른 select box display 구분자-->
<input type="hidden" name="mdm_yn" value="<%=mdm_yn%>">

<div class="layer_popup_contents">

	<%if(main_page.equals("true")){ %>
	<div class="layer_popup_title">
		<div class="page_title_area clear">	
			<h2 class="page_title"><span> Trade</span></h2>
			<div class="opus_design_btn"><!--
			--><button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
			--><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button>
			</div>
		</div>
	</div>
	<%}else{ %>
	<div class="layer_popup_title">
		<div class="page_title_area clear">	
			<h2 class="page_title"><span>Sub Trade Code Inquiry</span></h2>		
			<div class="opus_design_btn"><!--
			--><button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
			--><button type="button" class="btn_normal" name="btn2_Down_Excel" id="btn2_Down_Excel">Down Excel</button><!--
			--><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button><!--
			--><button type="button" class="btn_normal" name="btn_OK" id="btn_OK">OK</button><!--
			--><button type="button" class="btn_normal" name="btn_Close" id="btn_Close">Close</button>
			</div>
		</div>
	</div>
	<%} %>

	<div class="wrap_search">
		<div class="opus_design_inquiry wFit">
			<table> 
				<tbody>
					<tr class="h23">
					<th>Code</th>
					<td><input type="text" style="width:50;ime-mode:disabled;text-align:center" class="input" name="code" maxlength="2" dataformat="engup"></td>
					<th>&nbsp;Description</th>
					<td>&nbsp;<input type="text" style="width:350;ime-mode:disabled;text-align:left" class="input" name="desc" maxlength="50" dataformat="engup" otherchar=" "></td>
					<%
						if(!"".equals(mdm_yn) && mdm_yn.length() > 0){
					%>
					<th>Status</th>
					<td width="105" align="left">
						<select style="width:85;" name="delt_flg">
								<option value="ALL" <%if("ALL".equals(delt_flg)){ %> selected="selected" <%} %>>ALL</option>
								<option value="N" <%if("N".equals(delt_flg) || "".equals(delt_flg)){ %> selected="selected" <%} %>>Active</option>
								<option value="Y" <%if("Y".equals(delt_flg)){ %> selected="selected" <%} %>>Delete</option>
							</select>
					</td>
					<%
						}
					%>
				</tr> 
				</tbody>
			</table>
		</div>
	</div>
	<div class="wrap_result">   
		<div class="opus_design_grid clear" >
			<script type="text/javascript">ComSheetObject('sheet');</script>
		</div>
	</div>
</div>

</form>

<SCRIPT type="text/javascript">
<!--
      /* 
        ibSheet 를 제외한 폼 입력값(?) 유저가 입력한 정보를 event를 통해서 다시 넘겨받아 화면에 뿌려주는 부분입니다. 
      */
      with(document.form)
      {
        <%if (event != null) {
        	
				String code = event.getCode();   
				String desc = event.getDesc();   
 		
		}%>
	        eval("code").value     = "<%=JSPUtil.getParameter(request, "code".trim(), "")%>";
	        eval("desc").value     = "<%=JSPUtil.getParameter(request, "desc".trim(), "")%>";
       }
-->
</SCRIPT>
