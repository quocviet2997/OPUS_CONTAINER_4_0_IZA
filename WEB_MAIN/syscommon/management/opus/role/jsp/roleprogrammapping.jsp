<%--
/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UI_COM_SYS_010.jsp
*@FileTitle : 프로그램 매핑
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/ 
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.management.opus.role.event.ComSys010Event"%>

<%
	ComSys010Event  event = null;				//PDTO(Data Transfer Object including Parameters)

	Exception serverException   = null;			//서버에서 발생한 에러
	
	String strErrMsg = "";								 //에러메세지
  String strErrCode = "";

	try {
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		if (serverException != null) {
		    ErrorHandler errHndlr = new ErrorHandler(serverException);
				strErrMsg = errHndlr.loadPopupMessage();
				strErrCode = errHndlr.getCode();
		}else{
			event = (ComSys010Event)request.getAttribute("Event");
		}
	}catch(Exception e) {
	    out.println(e.getMessage());
	}
%>

<link href="css/opus_menu.css" rel="stylesheet" type="text/css">
<link href="css/opus_contents.css" rel="stylesheet" type="text/css">

<script language="javascript">
  function setupPage(){
    var errMessage = "<%=strErrMsg%>";
    var errCode = "<%=strErrCode%>";
    if (errMessage.length >= 1) {
      showErrMessage(errMessage);
    } // end if
    if(errCode=="COM10004"){
      gotoMainPage();
    }else{
      //setSubSystemCode('ENIS');
      loadPage();
    }
  }

  function gotoMainPage() {
    try {
      if(opener != null){
          if (opener.document != null) {
            opener.top.location.href = "SignOn.do";
            self.window.close();
          }
      }
      //프레임셋에서 탑프레임으로 로그인화면 출력
      //2007.01.23 김성욱
      if(window.top.frames != null && window.top.frames.length>0){
        window.top.location.href = "SignOn.do";
      }else{
        document.location.href = "SignOn.do";
      }
    } catch (e) {
      
    }
  }
</script>

<form method="post" name="form" onSubmit="return false;">
<input	type="hidden" name="f_cmd"> 
<input type="hidden" name="iPage"> 
<input type="hidden" name="pgm_no_form">


<div class="layer_popup_title">
	<div class="page_title_area clear">
		<h2 class="page_title"><span>Program Mapping</span></h2>
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_save" 	id="btn_save">Save</button><!--  
			--><button type="button" class="btn_normal" name="btn_close" 	id="btn_close">Close</button><!--  
			--><button type="button" class="btn_normal" name="btn_DownExcel" 	id="btn_DownExcel">Down Excel</button>
		</div>
	</div>
</div>


<div class="layer_popup_contents">
	<div class= "wrap_search">
		<!-- opus_design_inquiry(S) -->
		<div class="opus_design_inquiry wFit">
			<table>
				<colgroup>
					<col width="80" />
					<col width="150" />
					<col width="75" />
					<col width="*" />
				</colgroup>
				<tbody>
					<tr>
			           <th>Role Code</th>
			           <td><input type="text" style="width:70px;" class="input" required=""  fullfill="" name="role_cd" maxlength="4" readonly id="role_cd" /> </td>
			           <th>Role Name</th>
			           <td><input type="text" style="width:150px;" class="input" value="" name="role_nm" maxlength="30" readonly id="role_nm" /> </td>
			       	 </tr>
				</tbody>
			</table>
		</div>	
	</div>		
		
	<div class="wrap_result">
		<div class="layout_vertical_2">
			<div class="opus_design_grid clear" id="mainTable">
				<h3 class="title_design mar_top_12">Menu List</h3>
				<script type="text/javascript">ComSheetObject('sheet1');</script>
			</div>
		</div>
		
		<div class="layout_vertical_2 pad_left_4">
			<div class="opus_design_grid clear" id="mainTable">
				<h3 class="title_design mar_top_12">Program List</h3>
				<script type="text/javascript">ComSheetObject('sheet2');</script>
			</div>
		</div>
	</div>	
</div>
</form>


<SCRIPT LANGUAGE="javascript">
<!--
	  with(document.form) {
  		<%
  		if(event != null){ 
  			String role_cd = event.getRoleCd();
        String role_nm = event.getRoleNm();
  		%>
  		eval("role_cd" ).value = "<%= role_cd	 %>";
      eval("role_nm" ).value = unescape("<%= role_nm  %>");
  		<% } %>
	  }
-->
</SCRIPT>