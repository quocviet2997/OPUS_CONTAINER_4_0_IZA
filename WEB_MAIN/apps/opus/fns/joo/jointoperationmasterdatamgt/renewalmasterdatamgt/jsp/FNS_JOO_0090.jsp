<%
/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : FNS_JOO_0079.jsp
 *@FileTitle : Authority Office Creation
 *@author     : CLT
 *@version    : 1.0 
 *@since      : 2014/06/17 
 =========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.StringUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationmasterdatamgt.renewalmasterdatamgt.event.FnsJoo0090Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsJoo0090Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//error from server
	String strErrMsg = "";						//error message
	int rowCount	 = 0;						//count of DB resultSET list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String custNm	= "";
	String vndrNm	= "";
	String joCrrCd	= "";
	String rlaneCd	= "";
	String trdCd	= "";
	String custCd	= "";
	String vndrSeq	= "";
	
	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.JointOperationMasterDataMgt.RenewalMasterDataMgt");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsJoo0090Event)request.getAttribute("Event");
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}

		// getting data from server when loading page ..
		GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");

		custNm  	= eventResponse.getETCData("cust_nm");
		vndrNm  	= eventResponse.getETCData("vndr_nm");
		
		joCrrCd    	= StringUtil.xssFilter(request.getParameter("jo_crr_cd"))	== null ? ""  : StringUtil.xssFilter(request.getParameter("jo_crr_cd"));
		rlaneCd    	= StringUtil.xssFilter(request.getParameter("rlane_cd"))    == null ? ""  : StringUtil.xssFilter(request.getParameter("rlane_cd"));
		trdCd    	= StringUtil.xssFilter(request.getParameter("trd_cd"))    	== null ? ""  : StringUtil.xssFilter(request.getParameter("trd_cd"));
		custCd    	= StringUtil.xssFilter(request.getParameter("cust_cd"))    	== null ? ""  : StringUtil.xssFilter(request.getParameter("cust_cd"));
		vndrSeq    	= StringUtil.xssFilter(request.getParameter("vndr_seq"))    == null ? ""  : StringUtil.xssFilter(request.getParameter("vndr_seq"));

		log.debug("\n##### joCrrCd ["+joCrrCd+"] rlaneCd ["+rlaneCd+"] trdCd ["+trdCd+"] custCd ["+custCd+"] vndrSeq ["+vndrSeq+"]");
		log.debug("\n##### custNm ["+custNm+"] vndrNm ["+vndrNm+"]");
		
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
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
<!-- popup_title_area(S) -->
 <div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title"><span>Authority Office Creation & Inquiry</span></h2>
		<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn"><!-- 
			--><button type="button" class="btn_accent" name="btn_Retrieve" 		id="btn_Retrieve">Retrieve</button><!-- 
			--><button type="button" class="btn_normal" name="btn_Save" 			id="btn_Save">Save</button><!--  
			--><button type="button" class="btn_normal" name="btn_DownExcel" 		id="btn_DownExcel">Down Excel</button><!-- 
			--><button type="button" class="btn_normal" name="btn_Close" 			id="btn_Close">Close</button>
		</div>
		<!-- opus_design_btn(E) -->	
	</div>
	<!-- page_title_area(E) -->
</div>
<!-- page_title_area(E) -->

<div class="layer_popup_contents" >
	<!-- wrap_search(S) -->
	<div class="wrap_search">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry wFit">
		<table>
			<tbody>
				<colgroup>
					<col width="50px" />
					<col width="50px" />
					<col width="250px" />
					
					<col width="50px" />
					<col width="50px" />
					<col width="250px" />
					<col width="*" />
				</colgroup>
				<tr class="h23">
	               <th>Carrier</th>
	               <td colspan="5"><input type="text" style="width:40px;text-align:center;" class="input2" name="jo_crr_cd" 	id="jo_crr_cd"  value="<%=joCrrCd%>" 	readonly><!-- 
	                --><input type="text" style="width:40px;text-align:center;" class="input2" name="trd_cd" 		id="trd_cd"  	value="<%=trdCd%>" 	readonly><!-- 
	                --><input type="text" style="width:60px;text-align:center;" class="input2" name="rlane_cd" 	id="rlane_cd"  	value="<%=rlaneCd%>" 	readonly></td>
	               
	               <td></td>
	           </tr>
				<tr class="h23">
	               <th>Customer</th>
	               <td colspan="2"><input type="text" style="width:90px;text-align:center;" class="input2" name="cust_cd" 		id="cust_cd"  	value="<%=custCd%>" 	readonly><!-- 
	                --><input type="text" style="width:300px;text-align:left;" class="input2" name="cust_nm" 	id="cust_nm"  	value="<%=custNm%>" 	readonly><!-- 
	                --></td>
	               <th>Service Provider</th>
	               <td colspan="2"><input type="text" style="width:50px;text-align:center;" class="input2" name="vndr_seq" 	id="vndr_seq"  	value="<%=vndrSeq%>" 	readonly><!-- 
	                --><input type="text" style="width:300px;text-align:left;" class="input2" name="vndr_nm" 		id="vndr_nm"  	value="<%=vndrNm%>" 	readonly><!-- 
	                --></td><td></td>
	           </tr>
			</tbody>
		</table>
	</div>
	<!-- opus_design_inquiry(E) -->
	</div>
	<!-- wrap_search(E) -->
	
	<!-- wrap_result(S) -->
	<div class="wrap_result">
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid">
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_copy" 		id="btn_copy">Row Copy</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_add" 		id="btn_add">Row Add</button><!--
		 --><button type="button" class="btn_normal" name="btn_insert" 		id="btn_insert">Row Insert</button><!--
		 --><button type="button" class="btn_normal" name="btn_delete" 		id="btn_delete">Row Delete</button>		
		</div>
		<!-- opus_design_btn(E) -->
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
	<!-- opus_design_grid(E) -->
	</div>
	<!-- wrap_result(E) -->
</div>	
				
</form>
