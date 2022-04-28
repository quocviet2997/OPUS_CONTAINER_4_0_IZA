<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   locationCodeInquiry.jsp
*@FileTitle  : Location Detail 정보
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/18
=========================================================
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.clt.framework.component.util.JSPUtil" %>
<%@ page import="com.clt.framework.component.util.DateTime" %>
<%@ page import="com.clt.framework.component.message.ErrorHandler" %>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys" %>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount" %>
<%@ page import="com.clt.bizcommon.location.event.ComEns051Event" %>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%
	ComEns051Event event = null;      // PDTO(Data Transfer Object including Parameters)
	Exception serverException = null; // 서버에서 발생한 에러
	String strErrMsg = "";            // 에러메세지
	String usr_ofc_cd = "";
	GeneralEventResponse eventresponse = new GeneralEventResponse();
	Map<String, String> etcData = new HashMap<String, String>();

	try {
		SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
   		event = (ComEns051Event)request.getAttribute("Event");
   		eventresponse = (GeneralEventResponse)request.getAttribute("EventResponse");
   		etcData = eventresponse.getETCData();
  		if (serverException != null) {
      		strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
	    }
	} catch (Exception e) {
		out.println(e.toString());
	}
%>
	<script type="text/javascript">
		function setupPage() {
			var errMessage = "<%=strErrMsg%>";
			if (errMessage.length >= 1) {
				ComShowMessage(errMessage);
			} // end if
		}
	</script>

	<form name="form">
	<div class="page_title_area clear">
		<h2 class="page_title"><span>Location Code Inquiry-Detail</span></h2>
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="Colse" id="Colse">Close</button>
		</div>
	</div>

	<div class="wrap_search">
		<div class="opus_design_inquiry wFit">
			<table> 
				<colgroup>
					<col width="130" />
					<col width="170" />
					<col width="150" />		
					<col width="170" />
					<col width="" />
				</colgroup>
				<tbody>
				<tr>
					<th>Location Code</th>
					<td><input type="text" style="width:150px;" class="input" value="<%=JSPUtil.getNull(etcData.get("loc_cd")) %>"></td>
					<th>UN Code</th>
					<td><input type="text" style="width:168px;" class="input" value="<%=JSPUtil.getNull(etcData.get("un_loc_cd")) %>"></td>
					<td></td>
				</tr>
				<tr>
					<th>Location Name</th>
					<td><input type="text" style="width:150px;" class="input" value="<%=JSPUtil.getNull(etcData.get("loc_nm")) %>"></td>
					<th>Local Name</th>
					<td><input type="text" style="width:168px;" class="input" value="<%=JSPUtil.getNull(etcData.get("loc_locl_lang_nm")) %>"></td>
					<td></td>
				</tr>
				<tr><td height="10px" colspan="5"></td></tr>
				<tr>
					<th>Type</th>
					<td><input type="text" style="width:150px;" class="input" value="<%=JSPUtil.getNull(etcData.get("port_inlnd_flg")) %>"></td>
					<th>Calling Port</th>
					<td><input type="text" style="width:168px;" class="input" value="<%=JSPUtil.getNull(etcData.get("call_port_flg")) %>"></td>
					<td></td>
				</tr>
				<tr>
					<th>Continent</th>
					<td><input type="text" style="width:150px;" class="input" value="<%=JSPUtil.getNull(etcData.get("conti_nm")) %>"></td>
					<th>Sub-Continent</th>
					<td><input type="text" style="width:168px;" class="input" value="<%=JSPUtil.getNull(etcData.get("sconti_cd")) %>"></td>
					<td></td>
				</tr>
				<tr>
					<th>Country</th>
					<td><input type="text" style="width:150px;" class="input" value="<%=JSPUtil.getNull(etcData.get("country")) %>"></td>
					<th>Region</th>
					<td><input type="text" style="width:168px;" class="input" value="<%=JSPUtil.getNull(etcData.get("rgn_cd")) %>"></td>
					<td></td>
				</tr>					
				<tr>
					<th>State</th>
					<td colspan="3"><input type="text" style="width:150px;" class="input" value="<%=JSPUtil.getNull(etcData.get("loc_state")) %>"></td>					
					<td></td>
				</tr>
				<tr><td height="10" colspan="5"></td></tr>
				<tr>
					<th>EQ SCC</th>
					<td><input type="text" style="width:150px;" class="input" value="<%=JSPUtil.getNull(etcData.get("scc_cd")) %>"></td>
					<th>Office-Sales</th>
					<td><input type="text" style="width:168px;" class="input" value="<%=JSPUtil.getNull(etcData.get("sls_ofc_cd")) %>"></td>
					<td></td>
				</tr>
				<tr>
					<th>EQ ECC</th>
					<td><input type="text" style="width:150px;" class="input" value="<%=JSPUtil.getNull(etcData.get("ecc_cd")) %>"></td>
					<th>Office-Finance</th>
					<td><input type="text" style="width:168px;" class="input" value="<%=JSPUtil.getNull(etcData.get("finc_ctrl_ofc_cd")) %>"></td>
					<td></td>
				</tr>
				<tr>
					<th>EQ LCC</th>
					<td><input type="text" style="width:150px;" class="input" value="<%=JSPUtil.getNull(etcData.get("lcc_cd")) %>"></td>
					<th>Office-Logistics</th>
					<td><input type="text" style="width:168px;" class="input" value="<%=JSPUtil.getNull(etcData.get("eq_ctrl_ofc_cd")) %>"></td>
					<td></td>
				</tr>
				<tr><td height="10px" colspan="4"></td></tr>
				<tr>
					<th>Rep.Zone</th>
					<td><input type="text" style="width:150px;" class="input" value="<%=JSPUtil.getNull(etcData.get("rep_zn_cd")) %>"></td>
					<th>Rep.Empty P/U Yard</th>
					<td><input type="text" style="width:168px;" class="input" value="<%=JSPUtil.getNull(etcData.get("mty_pkup_yd_cd")) %>"></td>
					<td></td>
				</tr>
				<tr>
					<th>Hub City(USA I.T)</th>
					<td colspan="3"><input type="text" style="width:150px;" class="input" value="<%=JSPUtil.getNull(etcData.get("hub_loc_cd")) %>"></td>					
					<td></td>
				</tr>
				<tr>
					<th>Grid</th>
					<td><input type="text" style="width:150px;" class="input" value="<%=JSPUtil.getNull(etcData.get("loc_grd_no")) %>"></td>
					<th>ZIP</th>
					<td><input type="text" style="width:168px;" class="input" value="<%=JSPUtil.getNull(etcData.get("zip_cd")) %>"></td>
					<td></td>
				</tr>
				<tr>
					<th>Commercial Zone</th>
					<td colspan="3"><input type="text" style="width:150px;" class="input" value="<%=JSPUtil.getNull(etcData.get("cml_zn_flg")) %>"></td>					
					</td>
					<td></td>
				</tr>
				<tr>
					<th>US AMS</th>
					<td><input type="text" style="width:150px;" class="input" value="<%=JSPUtil.getNull(etcData.get("loc_ams_port_cd")) %>"></td>
					<th>Customs Code</th>
					<td><input type="text" style="width:168px;" class="input" value="<%=JSPUtil.getNull(etcData.get("cstms_cd")) %>"></td>
					<td></td>
				</tr>
				<tr>
					<th>U.T.C Gap (Min)</th>
					<td colspan="3"><input type="text" style="width:150px;" class="input" value="<%=JSPUtil.getNull(etcData.get("gmt_hrs")) %>"></td>					
					<td></td>
				</tr>
				<tr>
					<th>Latitude</th>
					<td><input type="text" style="width:150px;" class="input" value="<%=JSPUtil.getNull(etcData.get("port_lat")) %>"></td>
					<th>Longitude</th>
					<td><input type="text" style="width:168px;" class="input" value="<%=JSPUtil.getNull(etcData.get("port_lon")) %>"></td>
					<td></td>
				</tr>
				</tbody>
			</table>
		</div>
	</div>
	<div class="wrap_result"></div>
	</form>
