<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : 	ADM_SYS_0005.jsp
*@FileTitle  : 사용자, 역할, 프로그램
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
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.management.opus.role.event.ComSys006Event"%>
<%
	ComSys006Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";								 //에러메세지
  	String strErrCode = "";
	
	try {
		event = (ComSys006Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		if (serverException != null) {
		    ErrorHandler errHndlr = new ErrorHandler(serverException);
				strErrMsg = errHndlr.loadPopupMessage();
				strErrCode = errHndlr.getCode();
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
      ComFuncErrMsg(errMessage);
    } // end if
    if(errCode=="COM100px04"){
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

<form name="form">
<input type="hidden" name="f_cmd">

	<div class="page_title_area clear">
	    <h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	    <div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
			 --><button type="button" class="btn_normal" name="btn_New"   id="btn_New">New</button><!--
			 --><button type="button" class="btn_normal" name="btn_DownExcel"   id="btn_DownExcel">Down Excel</button>
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
						<td width="120"><input type="text" name="usr_id" style="width:100px" value=""></td>
						<th width="40">User Role ID</th>
						<td width="120"><input type="text" name="usr_role_cd" style="width:100px" value="" onKeyPress="javascript:ComKeyOnlyAlphabet('uppernum');"></td>
						<th width="40">Program ID</th>
						<td><input type="text" name="pgm_no" style="width:100px" value="" onKeyPress="javascript:ComKeyOnlyAlphabet('uppernum','95');"></td>
					    <th>User Name</th>
						<td><input type="text" name="usr_nm" style="width:100px" value=""></td>
						<th>User Role Name</th>
						<td><input type="text" name="usr_role_nm" style="width:100px" value=""></td>
						<th>Program Name</th>
						<td><input type="text" name="pgm_nm" style="width:100px" value=""></td>
					</tr> 
				</tbody>
			</table>
		</div>
	</div>

	<div class="wrap_result">
		<div class="opus_design_grid">
			<script language="javascript">ComSheetObject('sheet1');</script>
		</div>
	</div>

</form>
