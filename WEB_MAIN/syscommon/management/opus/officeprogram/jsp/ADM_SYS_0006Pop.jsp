<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : officeprogrammapping.jsp
*@FileTitle  : Program Mapping
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/28
=========================================================
--%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.management.opus.officeprogram.event.OfficeProgramMappingEvent"%>

<%
OfficeProgramMappingEvent  event = null;				//PDTO(Data Transfer Object including Parameters)

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
			event = (OfficeProgramMappingEvent)request.getAttribute("Event");
		}
	}catch(Exception e) {
		out.println(e.getMessage());
	}
%>
<script language="javascript">
  function setupPage(){
    var errMessage = "<%=strErrMsg%>";
    var errCode = "<%=strErrCode%>";
    if (errMessage.length >= 1) {
    	ComShowMessage(errMessage);
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
	
	<!-- popup_title_area(S) -->
	 <div class="layer_popup_title">
		<div class="page_title_area clear">
			<h2 class="page_title"><span>Program Mapping</span></h2>
			<div class="opus_design_btn">
				<button type="button" class="btn_accent" name="btn_save" id="btn_save">Save</button>
				<button type="button" class="btn_accent" name="btn_DownExcel" id="btn_DownExcel">Down Excel</button>
				<button type="button" class="btn_accent" name="btn_close" id="btn_close">Close</button>
			</div>
		</div>
	</div>
	<!-- popup_title_area(E) -->
	
	<!-- popup_contens_area(S) -->
	<div class="layer_popup_contents">
		<!-- inquiry_area(S) -->
		<div class="opus_design_inquiry">   <!-- no TAB  -->
			<table> 
				<colgroup>
					<col width="12%" />
					<col width="10%" />
					<col width="10%" />
					<col />
				</colgroup>
				<tbody>
					<tr>
						<th>Office Code</th>
						<td><input type="text" style="width:70px;" class="input" fullfill name="ofc_cd" maxlength="4" readOnly></td>
						<th>Office Name</th>
						<td><input type="text" style="width:180px;" class="input" value="" name="ofc_nm" maxlength="30"  readOnly></td>
					</tr>
				</tbody>
			</table>
		</div>
		<!-- inquiry_area(E) -->
	
		<div class="layout_wrap">
		    <div class="layout_vertical_2 pad_rgt_8 pad_left_8">
		        <!-- opus_design_grid(S) -->
		        <div class="opus_design_grid"  id="mainTable">
			    <!-- opus_design_btn(S) -->
			    <h3><span class="grid_option_left ">Menu List</span></h3>
			    	<script language="javascript">ComSheetObject('sheet1');</script>
		   		</div>
		        <!-- opus_design_grid(E) -->
		    </div>
			
			<div class="layout_vertical_2 pad_rgt_8 pad_left_8">
		        <!-- opus_design_grid(S) -->
		        <div class="opus_design_grid"  id="mainTable">
			    <!-- opus_design_btn(S) -->
			    <h3><span class="grid_option_left ">Program List</span></h3>
			    	<script language="javascript">ComSheetObject('sheet2');</script>
		   		</div>
		        <!-- opus_design_grid(E) -->
		    </div>
		</div>
	</div>
</form>
<SCRIPT LANGUAGE="javascript">
<!--
	  with(document.form) {
  		<%
  		if(event != null){ 
  			String ofcCd = event.getOfcCd();
        String ofcNm = event.getOfcNm();
  		%>
  		eval("ofc_cd" ).value = "<%= ofcCd	 %>";
      eval("ofc_nm" ).value = unescape("<%= ofcNm  %>");
  		<% } %>
	  }
-->
</SCRIPT>