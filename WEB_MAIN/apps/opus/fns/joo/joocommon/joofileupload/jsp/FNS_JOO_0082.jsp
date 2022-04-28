<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_JOO_0082.jsp
*@FileTitle  : File Upload
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/22
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="org.apache.log4j.Logger"%>
<%@page import="com.clt.apps.opus.fns.joo.joocommon.joofileupload.event.FnsJoo0082Event"%>
<%@page import="com.clt.framework.component.util.StringUtil"%>
<%
	FnsJoo0082Event event = null;
    Exception serverException = null;
    String strErrMsg = "";
    int rowCount = 0; 

    String successFlag = "";
    String codeList = "";
    String pageRows = "100";

    String userId = "";
    String userName = "";
    String userOffice = "";
    String userArea = "";
    String joCrrCd = "";
    String crrCntcSeq  = "";
    String editAble = "";
    
    Logger log = Logger.getLogger("com.clt.apps.opus.fns.joo.joocommon.JOOCommonSC");
    
    try
    {
        SignOnUserAccount account = (SignOnUserAccount) session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
        userId = account.getUsr_id();
        userName = account.getUsr_nm();
        userOffice = account.getOfc_cd();
        
        event = (FnsJoo0082Event) request.getAttribute("Event");
        serverException = (Exception) request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

        if (serverException != null)
        {
            strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
        }

        joCrrCd     = JSPUtil.getParameter(request , "jo_crr_cd" , "");
        crrCntcSeq  = JSPUtil.getParameter(request , "crr_cntc_seq" , "");
        editAble    = JSPUtil.getParameter(request , "edit_able" , "");
        // getting data from server when loading page ..
        GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

    }
    catch (Exception e)
    {
        out.println(e.toString());
    }
    
    
    // ----------------------------------------------------------------
    // setting initial parameters
    // ----------------------------------------------------------------    
    // clm_file_tp_cd  (UI number(4) + fileupload sequence number  000501 , 000502)   
%>
<script type="text/javascript">
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			showErrMessage(errMessage);
		} // end if 
		loadPage();
	}
</script>
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="jo_crr_cd" value="<%=joCrrCd%>" id="jo_crr_cd" />
<input type="hidden" name="crr_cntc_seq" value="<%=crrCntcSeq%>" id="crr_cntc_seq" />
<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title">File Upload</span></button></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" name="btn1_Close" id="btn1_Close" type="button">Close</button><!--
		--></div>
	<!-- opus_design_btn (E) -->
</div>
<!-- page_title_area(E) -->
<!-- wrap_result(S) -->
<div class="wrap_result">
<!-- opus_design_grid(S) -->
<div class="opus_design_grid">
	<%if ("Y".equals(editAble)) {%>  
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" name="btn2_Row_Add" id="btn2_Row_Add" type="button">Row Add</button><!--
		--><button class="btn_accent" name="btn2_Row_Delete" id="btn2_Row_Delete" type="button">Row Delete</button><!--
		--><button class="btn_accent" name="btn2_Save" id="btn2_Save" type="button">Save</button>
	</div>
	<!-- opus_design_btn (E) -->
	<%} %>
	<script type="text/javascript">ComSheetObject('sheet1');</script>
</div>
<!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->
<script type="text/javascript">ComUploadObject('upload1', '<%=session.getId()%>');</script>
</form>