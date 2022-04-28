<%/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BCM_FIN_0011.jsp
*@FileTitle : Revenue Month per Common & Charter VVD
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
=========================================================*/%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.FormCommand"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event.BcmFin0011Event"%>
<%@ page import="org.apache.log4j.Logger" %>


<%
    BcmFin0011Event event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException = null;			//Error occurred from server
	String strErrMsg = "";						//Error Message
	
	String strUsr_id = "";
	String strUsr_nm = "";
	
	String[] applCd = null;

	
	Logger log = Logger.getLogger("com.clt.apps.opus.bcm.fin.financemanagement.FinanceManagementSC");
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
	   
		event = (BcmFin0011Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}		     	
		
        GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		
	} catch(Exception ex) {
		log.error("err " + ex.toString(), ex);
		//out.println(e.toString());
	}
	
%>

<script language="javascript">

	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}	
</script>

<form name="form">
<input type="hidden" name="f_cmd"> 
<input type="hidden" name="pagerows">

<!-- page_title_area(S) -->
<div class="page_title_area clear">

	<!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title">&nbsp;&nbsp;Revenue Month per Common & Charter VVD</h2>
	<!-- page_title(E) -->


	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
		<!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->
		<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!--
		--><button type="button" class="btn_normal" name="btn_new"   id="btn_new">New</button><!--
		--><button type="button" class="btn_normal" name="btn_save"   id="btn_save">Save</button>
	</div>
	<!-- opus_design_btn(E) -->

	<!-- page_location(S) -->
	<div class="location">
		<!-- location 내용 동적생성 (별도 코딩 불필요) -->
		<span id="navigation"></span>
	</div>
	<!-- page_location(E) -->
</div>
<!-- page_title_area(E) -->

<!-- wrap search (S) -->
<div class="wrap_search">
	<!-- 조회영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
	<div class="opus_design_inquiry wFit">
	    <table>
	        <tbody>
	        	<tr>
					<th width="90">Target Month</th>
					<td width="160">
						<input type="text" style="width:100px;text-align:center;" class="input1" id="tar_yrmon" name="tar_yrmon" dataformat="ym" required caption="Revenue Year Month"><!--
						--><button type="button" class="calendar" name="tar_yrmon_cal" id="tar_yrmon_cal" class="calendar ir"></button>
					</td>
					<td></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
<!-- wrap search (E) -->

<!-- opus_design_grid(S) -->
<div class="wrap_result">
    <div class="layout_wrap">    
	    <div class="layout_flex_fixed" style="width:45%">
	        <div class="opus_design_grid">
	        	<div class="opus_design_btn">
	        		<div style="height: 28px;"></div>
	        		<!-- <button class="btn_normal" name="btn_add_h" id="btn_add_h" type="button">Row Add</button> 
	        		<button class="btn_normal" name="btn_del_h" id="btn_del_h" type="button">Row Delete</button> -->
	        	</div>
	        	
	            <!-- 그리드 데이터 영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
	            <script language="javascript">ComSheetObject('sheet1');</script>
	            <!-- 그리드 데이터 영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
	        </div>
	    </div>
	    
	    <div class="layout_flex_fixed" style="width:5%;text-align:center;">
        	<table class="search" style="width:55px;height:400px; vertical-align:middle;">
				<colgroup>
					<col width="50">
				</colgroup>
				<tbody>
					<tr>
						 <td style="text-align:center;"><button class="btn_right" type="button" id="revenueVvdAdd" name="revenueVvdAdd"></button></td>
					</tr>
				</tbody>
			</table>
	    </div>
	    
	    <div class="layout_flex_fixed" style="width:50%; text-align:right;">
	        <!-- opus_design_grid(S) -->
	        <div class="opus_design_grid">
	        	<div class="opus_design_btn">
	        		<button class="btn_normal" name="btn_add" id="btn_add" type="button">Row Add</button><!--  
	        		--><button class="btn_normal" name="btn_del" id="btn_del" type="button">Row Delete</button>
	        	</div>
            
                <!-- 그리드 데이터 영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->
                <script language="javascript">ComSheetObject('sheet2');</script>
                <!-- 그리드 데이터 영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
            </div>
        </div>
	</div>
</div>
<!-- opus_design_grid(E) -->
<!-- page(E) -->

</form>
</body>
</html>