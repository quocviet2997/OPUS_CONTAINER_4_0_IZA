<%--
 - Copyright(c) 2017 CyberLogitec
 - @FileName : COM_ENS_0U2.jsp
 - @FileTitle : Approval Inquiry
 - Open Issues :
 - Change history :
 - @LastModifyDate : 2017.07.03
 - @LastModifier : Yo-Na Ha
 - @LastVersion : 1.0
 - 2017.07.03 1.0 Yo-Na Ha Creation.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="com.clt.framework.core.controller.util.WebKeys" %>
<%@ page import="com.clt.framework.core.view.template.Screen" %>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse" %>
<%@ page import="com.clt.framework.component.message.ErrorHandler" %>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys" %>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount" %>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.bizcommon.approval.event.ComEns0U2Event" %>

<%
	ComEns0U2Event ComEns0U2Event = null;
	Exception exception = null;
	String errorMessage = "";
	String ofc_cd = "";
	Logger logger = Logger.getLogger("com.clt.apps.opus.esm.flt.invoice.outstanding");
	try {
		SignOnUserAccount account = (SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT); // Login session.
		ofc_cd = account.getOfc_cd();
		ComEns0U2Event = (ComEns0U2Event)request.getAttribute("Event"); // Request Parameter.
		exception = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		if (exception != null) {
			errorMessage = new ErrorHandler(exception).loadPopupMessage();
		}

		GeneralEventResponse eventResponse = (GeneralEventResponse)request.getAttribute("EventResponse"); // Response

		Screen screen = (Screen)request.getAttribute(WebKeys.CURRENT_SCREEN);
		logger.debug(" === " + screen.getName() + " === ");
	} catch (Exception e) {
		out.println(e.toString());
	}

	Calendar calendar = Calendar.getInstance();
	StringBuffer nowDate = new StringBuffer();
	nowDate.append(calendar.get(Calendar.YEAR));
	nowDate.append("-");
	nowDate.append((calendar.get(Calendar.MONTH) + 1) < 10 ? "0" + (calendar.get(Calendar.MONTH) + 1) : (calendar.get(Calendar.MONTH) + 1));
%>
	<script  type="text/javascript" src="/opuscntr/rpt/script/common_rd.js"></script>
	<script type="text/javascript">

		function setupPage() {
			var errorMessage = "<%=errorMessage %>";
			if (errorMessage.length >= 1) {
				showErrMessage(errorMessage);
			}
			loadPage();
		}

	</script>

	<form name="form">
	<input type="hidden" name="f_cmd" />
	<input type="hidden" name="pagerows" />
	<!-- Input Box for Report Designer -->
	<input type="hidden" name="com_mrdPath" value="" id="com_mrdPath" />
	<input type="hidden" name="com_mrdArguments" value="" id="com_mrdArguments" />
	<input type="hidden" name="com_mrdTitle" value="OutStanding List" id="com_mrdTitle" />
	<input type="hidden" name="com_mrdBodyTitle" value="OutStanding List" id="com_mrdBodyTitle" />
	<input type="hidden" name="com_mrdSaveDialogFileExt" value="ppt" id="com_mrdSaveDialogFileExt" />
	<input type="hidden" name="com_mrdSaveDialogFileExtLimit" value="xls@pdf@doc@ppt" id="com_mrdSaveDialogFileExtLimit" />
	<input type="hidden" name="com_mrdSaveDialogFileName" value="Consultation Slip" id="com_mrdSaveDialogFileName" />
	<input type="hidden" name="com_mrdSaveDialogDir" value="" id="com_mrdSaveDialogDir" />
	<input type="hidden" name="usr_ofc_cd" value="<%=ofc_cd%>"/>
	<input type="hidden" name="v_rhq_ofc_cd"/>
	<%-- Page title area --%>
	<div class="page_title_area clear">
		<%-- Title auto input. --%>
		<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
		<%-- Buttons --%>
		<div class="opus_design_btn">
		<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!--
		 --><button type="button" class="btn_normal" name="btn_new" id="btn_new">New</button><!--
		 --><button type="button" class="btn_normal" name="btn_downexcel" id="btn_downexcel">Down Excel</button><!--
		 --><button type="button" class="btn_normal" name="btn_detail" id="btn_detail">Detail</button><!-- 
		 --><button type="button" class="btn_normal" name="btn_approvalstep" 	id=btn_approvalstep>View Approval Step</button>
		</div>

		<%-- Page location --%>
		<div class="location">
			<%-- Navigation auto input --%>
			<span id="navigation"></span>
		</div>
	</div>

	<%-- UI conditions to retrieve --%>
	<div class="wrap_search">
		<div class="opus_design_inquiry wFit">
			<table>
				<colgroup>
					<col width="75" />
		            <col width="75" />
		            <col width="90" />
					<col width="160" />
					<col width="80" />
		            <col width="50" />
					<col width="100" />
		            <col width="50" />
					<col width="100" />
		            <col width="*" />
				</colgroup>
				<tbody>
				<tr>
					<th>Module</th>
					<td><%= com.clt.bizcommon.util.BizComUtil.getCodeCombo("sub_sys_cd", "", "", "SUBSYS",2, "0:") %></td>
					<th>Status</th>
					<td>
						<select name="status">
							<option value="" selected>All</option>
							<option value="P">Requested</option>
							<option value="F">1st Approved</option>
							<option value="C">Final Approved</option>							
							<option value="R">Disapproved</option>
							<option value="E">Error</option>
						</select>
					</td>
					<th>Date</th>
					<td>
	                   <span class="inquiry_calendar">
							<input name="sdate" type="text" class="input1" maxlength="10" style="width:75px" dataformat="ymd">
							<span class="dash">-</span>
							<input name="edate" type="text" class="input1" maxlength="10"  style="width:75px" dataformat="ymd"><!--
							--><button type="button" class="calendar ir" name="btns_Calendar2" id="btns_Calendar2"></button>
	                    </span> 
					</td>
					<th>S/P Code</th>
					<td>
					<input type="text" name="vndr_seq" style="width:65px" maxlength="6" dataformat="num">
					<button type="button" name="btn_vndr" id="btn_vndr" class="input_seach_btn"></button>
					</td>
					<th>CSR No.</th>
					<td>
					<input type="text" name="csr_no" style="width:150;text-align:left;" dataformat="engup" otherchar=",">
					<button type="button" class="multiple_inq ir" name="btns_multisearch" id="btns_multisearch"></button>
					</td>
				</tr>
				<tr>
				    <th colspan="2">
				    	<input type="radio" id="rdo_ofc_tp" name="rdo_ofc_tp" value="C" class="trans" onclick="change_radio();" checked>
				    	<label for="rdo_ofc_tp">Cost Office&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
               		</th>
					<th>RHQ.</th>
					<td><script type="text/javascript">ComComboObject("rhq_ofc_cd", 1, 120, 1, 0, 0); </script></td>
					<th>Office</th>
					<td><script type="text/javascript">ComComboObject('c_ofc_cd', 1, 120, 1, 0, 0);</script></td>
				</tr>
				<tr>
				    <th colspan="2">
				    	<input type="radio" id="rdo_ofc_tp" name="rdo_ofc_tp" value="A" class="trans" onclick="change_radio();">
				    	<label for="rdo_ofc_tp">Approval Office</label>
               		</th>
					<th>RHQ.</th>
					<td><script type="text/javascript">ComComboObject("a_rhq_ofc_cd", 1, 120, 1, 0, 0); </script></td>
					<th>Office</th>
					<td><script type="text/javascript">ComComboObject('a_ofc_cd', 1, 120, 1, 0, 0);</script></td>
				</tr>
				</tbody>
			</table>
		</div>
	</div>

	<%-- Content area. --%>
	<div class="wrap_result">	
		<div class="opus_design_grid">
			<script type="text/javascript"> ComSheetObject("sheet"); </script>
		</div>
	</div>

	</form>
