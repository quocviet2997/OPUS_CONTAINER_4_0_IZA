<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : 	officeChange.jsp
*@FileTitle  : 오피스 체인지
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.FormCommand"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.management.opus.user.event.UiComSys015Event"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>

<%
	UiComSys015Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	GeneralEventResponse eventResponse = new GeneralEventResponse();
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";								 //에러메세지
  	String strErrCode = "";							  //DB ResultSet 리스트의 건수
	String authTypes = "";
	String admin_page = "";
	
	SignOnUserAccount account = null;
  
	try {
	    account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
	    event = (UiComSys015Event)request.getAttribute("Event");		
	    admin_page = (String)event.getAdmin_page();
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		if (serverException != null) {
		    ErrorHandler errHndlr = new ErrorHandler(serverException);
				strErrMsg = errHndlr.loadPopupMessage();
				strErrCode = errHndlr.getCode();
		}else{
			eventResponse = (GeneralEventResponse)request.getAttribute("EventResponse");
     		authTypes = eventResponse.getETCData("authTypes");
		} // end else
	}catch(Exception e) {
	    out.println(e.getMessage());
	}
%>

<% if(event.getFormCommand().isCommand(FormCommand.MODIFY)) { %>
<script language="javascript">
opener.top.signature('On');
ComClosePopup();
</script>
<% } else {%>
<script language="javascript">

  var authTypes = "<%=authTypes%>";
  var temp = authTypes.split(":");
  var texts = temp[0].split("|");
  var values = temp[1].split("|");

  function setupPage(){
  	
    var errMessage = "<%=strErrMsg%>";
    var errCode = "<%=strErrCode%>";
         
    if (errMessage.length >= 1) {
      showErrMessage(errMessage);
    } // end if
    if(errCode=="COM10004"){
    	opener.top.signature('On');
    	ComClosePopup();
    }else{
      //setAuthType();
      //setSubSystemCode('ENIS');
      loadPage();
    }
  }

  function setAuthType() {
      var selectObject = document.form.auth_type;
      
      if (selectObject.options[0]==null) {
        addOption(selectObject,"","");
        for(i=0;i<texts.length;i++){
          addOption(selectObject,texts[i],values[i]);
        }
      }
  }
  
  function addOption(selectObject,optionText,optionValue) {
      var optionObject = new Option(optionText,optionValue);
      var optionRank = selectObject.options.length;
      selectObject.options[optionRank]=optionObject;
  }

</script>

<form name="form" onkeyup="ComKeyEnter('lengthnextfocus');">

<input	type="hidden" name="f_cmd"> 
<input type="hidden" name="iPage">
<input type="hidden" name="admin_page" value="<%=admin_page%>">
<input type="hidden" name="default_ofc_cd">
<input type="hidden" name="cng_ofc_cd">
<input type="hidden" name="pgmNo">
<input type="hidden" name="cng_ofc_flg">
<input type="hidden" name="login_ofc_cd" value="<%= account.getOfc_cd() %>">

	<div class="page_title_area clear">
	    <%if("Y".equals(admin_page)&&account.getUsr_auth_tp_cd().equals("A")) { %>
	    <h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
		<%}else{ %>
		<h2 class="page_title"><span id="title"></span></h2>
	    <%} %>
	    <div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button>
			<button type="button" class="btn_normal" name="btng_save" id="btng_save">Save</button>
			<button type="button" class="btn_normal" name="btn_DownExcel"   id="btn_DownExcel">Down Excel</button>
			<%if("Y".equals(admin_page)&&account.getUsr_auth_tp_cd().equals("A")) { %>
			   <button type="button" class="btn_normal" name="btn_Copy" id="btn_Copy">Copy</button>
			<%} %>
	    </div>
	    
	    <div class="location">
	        <span id="navigation"></span>
	    </div>
	</div>
		
		
	<div class="wrap_search">
		<div class="opus_design_inquiry wFit">
		    <table>
		        <tbody>
					<tr>
						<th width="40">User ID</th>
						<td width="120"><input type="text" name="usr_id" id="usr_id" style="width:100px" value=""></td>
						<th width="40">User Name</th>
						<td><input type="text" name="usr_nm" id="usr_nm" style="width:100px" value=""></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>

	<div class="wrap_result">
		<div class="opus_design_grid">
		    <div class="opus_design_btn">
		    <%
				if(!"Y".equals(admin_page)) {
				if ( event.getUsr_id().equals(account.getUsr_id()) || account.getUsr_auth_tp_cd().equals("A") ) {
			%>	
				<button type="button" class="btn_normal" name="btn_select" id="btn_select">Select</button>
			<%
					}
				} else {
			%>
				<input type="text" name="addrows" size="3" value="1"><button type="button" class="btn_normal" name="btng_rowadd" id="btng_rowadd">Row&nbsp;Add</button>
			<% 
				}
			%>
			</div>
			<script language="javascript">ComSheetObject('sheet1');</script>
		</div>
	</div>
</form>
<SCRIPT LANGUAGE="javascript">
<!--
	  /* 
		ibSheet 를 제외한 폼 입력값(?) 유저가 입력한 정보를 event를 통해서 다시 넘겨받아 화면에 뿌려주는 부분입니다. 
	  */
		<%
		if ( !admin_page.equals("Y")){ 
			String usr_id = event.getUsr_id(); 
			String usr_nm = event.getUsr_nm();
		%>
		document.form.usr_id.value = "<%= usr_id.equals("ALL") ? "" : usr_id %>";
	    document.form.usr_nm.value = "<%= usr_nm.equals("ALL") ? "" : usr_nm	 %>";
	    document.form.usr_id.readOnly = true;
	    document.form.usr_nm.readOnly = true;

		//doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
		//sheetObjects[0].DoSearch4Post("ADM_SYS_0008GS.do", FormQueryString(document.form));
		<% } %>
	if (document.getElementById("title").innerHTML == 'null') {
		document.getElementById("title").innerHTML = '&nbsp; Office Change';
		document.title = 'Office Change';
	}

-->
</SCRIPT>
<% } %>
