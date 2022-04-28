<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_JOO_0004.jsp
*@FileTitle  : Entry and Inquiry of Basic Port Choose by Settlement Item
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/01
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationmasterdatamgt.jointoperationmasterdatamgt.event.FnsJoo0004Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0004Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list
	
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	String strArHqOfcCd     = "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationMasterDataMgt.JointOperationMasterDataMgt");
	
	String crrCombo  = "";
	String abbrCombo = "";
	String dirCombo  = "";
//	String abbrSheet = "";
//	String dirSheet  = "";
//	String staSheet  = "";
	String codeSheet = "";
	String nameSheet = "";
	
	String mnthCondSheet = "";
	String mnthNameSheet = "";
	String portCondSheet = "";
	String portNameSheet = "";
	String portTypeSheet = "";
	String ptTpNameSheet = "";
	String operTypeSheet = "";
	String operNameSheet = "";
	
	String[] dir = null;
//	String[] sta = null;
	String[] tdr = null;
	String[] mnthCond = null;
	String[] portCond = null;
	String[] portType = null;
	String[] operType = null;
	
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
	   
		event = (FnsJoo0004Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
		
		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		
		crrCombo  = eventResponse.getETCData("jo_crr_cd"        );
		abbrCombo = eventResponse.getETCData("jo_stl_cd"        );
		//abbrSheet = eventResponse.getETCData("sheet1_jo_stl_cd" );
		strArHqOfcCd = eventResponse.getETCData("arHqOfcCd");
		

		dir = (String[])eventResponse.getCustomData("DIR");
		//sta = (String[])eventResponse.getCustomData("STA");
		tdr = (String[])eventResponse.getCustomData("TDR");
		mnthCond = (String[])eventResponse.getCustomData("MONTH");
		portCond = (String[])eventResponse.getCustomData("PORT");
		portType = (String[])eventResponse.getCustomData("PORT_TYPE");
		operType = (String[])eventResponse.getCustomData("OPER_TYPE");
		
		dirCombo = dir[0];
		//dirSheet = dir[0];
		//staSheet = sta[0];
		codeSheet = tdr[0];
		nameSheet = tdr[1];
		mnthCondSheet = mnthCond[0];
		mnthNameSheet = mnthCond[1]; 
		portCondSheet = portCond[0];
		portNameSheet = portCond[1];
		portTypeSheet = portType[0];
		ptTpNameSheet = portType[1];
		operTypeSheet = operType[0];
		operNameSheet = operType[1];
		
	}catch(Exception e) {
		out.println(e.toString());
	}
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
var gHqOfcCd = "<%=strArHqOfcCd%>";
var gMnthCondSheet = "<%=mnthCondSheet%>";
var gPortCondSheet = "<%=portCondSheet%>";
var gPortTypeSheet = "<%=portTypeSheet%>";
var gOperTypeSheet = "<%=operTypeSheet%>";
var gMnthNameSheet = "<%=mnthNameSheet%>";
var gPortNameSheet = "<%=portNameSheet%>";
var gPtTpNameSheet = "<%=ptTpNameSheet%>";
var gOperNameSheet = "<%=operNameSheet%>";

	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			showErrMessage(errMessage);
		} // end if
		loadPage("<%=crrCombo%>","<%=abbrCombo%>","<%=dirCombo%>","<%=codeSheet%>","<%=nameSheet%>");
	}
</script>
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="code" id="code" />
<input type="hidden" name="name" id="name" />
<input type="hidden" name="super_cd1" id="super_cd1" />
<input type="hidden" name="super_cd2" id="super_cd2" />
<input type="hidden" name="jo_stl_opt_cd" id="jo_stl_opt_cd" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" type="button" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!--
		--><button class="btn_normal" type="button" name="btn_new" id="btn_new" >New</button><!--
		--><button class="btn_normal" type="button" name="btn_create" id="btn_create" >Create</button><!--
		--><button class="btn_normal" type="button" name="btn_copy" id="btn_copy" >Copy</button><!--
		--><button class="btn_normal" type="button" name="btn_save" id="btn_save" >Save</button><!--
		--><button class="btn_normal" type="button" name="btn_downexcel" id="btn_downexcel"  >Down Excel</button>
	</div>
	<!-- opus_design_btn (E) -->
	
   	<!-- page_location(S) -->
   	<div class="location">
        <span id="navigation"></span>
   	</div>
   	<!-- page_location(E) -->
</div>
<!-- page_title_area(E) -->

<!-- opus_design_inquiry(S) -->
<div class="wrap_search">
	<div class="opus_design_inquiry wFit">
		<table>
			<colgroup>
	            <col width="52">
	            <col width="150">
	            <col width="44">
	            <col width="60">
	             <col width="44">
	            <col width="60">
	            <col width="*">
			</colgroup>
			<tbody>
				<tr>
					<th>Carrier</th>
					<td><script type="text/javascript">ComComboObject('cmb_jo_crr_cd',5,70,0,1);</script><!-- 
					 --><input type="text" style="width:40px;text-align:center;display:none;" class="input2" name="jo_crr_cd" id="jo_crr_cd" readonly><!-- 
					 --><input type="text" style="width:40px;text-align:center;" class="input2" name="trd_cd" id="trd_cd" readonly><!-- 
					 --><input type="text" style="width:60px;text-align:center;" class="input2" name="rlane_cd" id="rlane_cd" readonly></td>
					<th>Item</th>
					<td><script type="text/javascript">ComComboObject('jo_stl_itm_cd',1,70,0,0);</script></td>
					<th>Dir</th>
					<td><script type="text/javascript">ComComboObject('skd_dir_cd',1,70,0,0);</script></td>
					<td></td>
				</tr> 
			</tbody>
		</table>
	</div>
</div>
<!-- opus_design_inquiry(E) -->

<!-- wrap_result(S) -->
<div class="wrap_result">
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid"  >
		<!-- opus_design_btn (S) -->
		<div class="opus_design_btn">
			<button class="btn_accent" name="btn_del" id="btn_del" type="button">Row Delete</button>
		</div>
		<!-- opus_design_btn (E) -->
		<div id="mainTable">
			<script type="text/javascript">ComSheetObject('sheet1');</script>		
		</div>
	</div>
	<div class="opus_design_grid clear" style="display:none;">
		<script type="text/javascript">ComSheetObject('sheet2');</script>
	</div>
</div>
<!-- wrap_result(E) -->
</form>