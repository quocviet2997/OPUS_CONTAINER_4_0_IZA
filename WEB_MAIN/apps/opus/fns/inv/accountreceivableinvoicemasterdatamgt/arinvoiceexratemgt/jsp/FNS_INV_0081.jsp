<%/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : STM_SAP_0001.jsp
*@FileTitle  : Office Code Popup
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/05
=========================================================*/%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemasterdatamgt.arinvoiceexratemgt.event.FnsInv0081Event"%>

<%@ page import="org.apache.log4j.Logger" %>


<%
    FnsInv0081Event event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지

	String fm_dt		= JSPUtil.getNull(request.getParameter("fm_dt"));
	String to_dt		= JSPUtil.getNull(request.getParameter("to_dt"));
	String io_bnd_cd	= JSPUtil.getNull(request.getParameter("io_bnd_cd"));
	String chg_curr_cd	= JSPUtil.getNull(request.getParameter("chg_curr_cd"));
	String upd_usr_id	= JSPUtil.getNull(request.getParameter("upd_usr_id"));
	String locl_curr_cd	= JSPUtil.getNull(request.getParameter("locl_curr_cd"));
	String ar_ofc_cd	= JSPUtil.getNull(request.getParameter("ar_ofc_cd"));
	
	
	
	String strUsr_id = "";
	String strUsr_nm = "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMasterDataMgt.ARInvoiceExRateMgt");
	
	try {
		
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();
	   
		event = (FnsInv0081Event)request.getAttribute("Event");  
		serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

		
		if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
				
	} catch(Exception ex) {
		log.error("err " + ex.toString(), ex);
		//out.println(e.toString());
	}
%>
<script  type="text/javascript">

	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage(); // .js 호출
	}
</script>
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd"> 
<input type="hidden" name="pagerows" id="pagerows">
<div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
	   <!-- page_title(S) -->
		<h2 class="page_title"><span>Ex. Rate history Inquiry</span></h2>
		<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_retrieve" 	id="btn_retrieve">Retrieve</button><!--
			--><button type="button" class="btn_normal" name="btn_Close"  		id="btn_Close">Close</button>	
		</div>
		<!-- opus_design_btn(E) -->

	</div>
	<!-- page_title_area(E) -->
</div>
<!-- opus_design_inquiry(S) -->
<div class="layer_popup_contents">
	<div class= "wrap_search">
		<div class= "opus_design_inquiry wFit">
			<table>
			  	<tbody>
				<colgroup>
					<col width="95px"/>
					<col width="100px"/>
					<col width="44px"/>
					<col width="60px"/>
					<col width="40px"/>
					<col width="50px"/>
					<col width="40px"/>
					<col width="50px"/>
					<col width="44px"/>
					<col width="60px"/>
					<col width="44px"/>
					<col width="*"/>
			    </colgroup>
				<tr>
					<th>Ex. Rate Date</th>
					<td><input type="text" style="width: 75px;" name="fm_dt" id="fm_dt" dataformat="ymd" maxlength="10" value="<%=fm_dt%>"/><button type="button" id="btns_calendar1" name="btns_calendar1" class="calendar ir"></button>
					 ~  <input type="text" style="width: 75px;" name="to_dt" id="to_dt" dataformat="ymd" maxlength="10" value="<%=to_dt %>"/><button type="button" id="btns_calendar2" name="btns_calendar2" class="calendar ir"></button> </td>
					<th>Office</th>
					<td width=""><input type="text" style="width: 60px;" class="input" name="ar_ofc_cd" id="ar_ofc_cd" value="<%=ar_ofc_cd%>"/> </td>
				
					<th>Local Curr</th>
					<td><input type="text" style="width: 40px;" class="input2" name="locl_curr_cd" id="locl_curr_cd" ReadOnly value="<%=locl_curr_cd%>"/> </td>
					<th>Charge Curr</th>
					<td><input type="text" style="width: 40px;" class="input" name="chg_curr_cd" id="chg_curr_cd" value="<%=chg_curr_cd%>" /> </td>
					<th>Bound</th>
					<td><select style="width: 60px;" class="input" name="io_bnd_cd" id="io_bnd_cd">
							<option value=""   <%=io_bnd_cd.equals("")?"selected":"" %> >ALL</option>
							<option value="O"  <%=io_bnd_cd.equals("O")?"selected":"" %> >O/B</option>
							<option value="I"  <%=io_bnd_cd.equals("I")?"selected":"" %> >I/B</option>
						</select>
					</td>
					<th>User ID</th>
					<td><input type="text" style="width: 100px;" class="input" name="cre_usr_id" id="cre_usr_id"  value="<%=upd_usr_id%>"/> </td>
				</tr>
			</tbody>
			</table>
		</div>
		<table></table>
	</div>
	<!-- opus_design_inquiry(E) -->
	<!-- opus_design_grid(S) style="height: 400px;" -->
	<div class="wrap_result" >
		<div class="opus_design_grid" >
			<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>
	</div>
	<!-- opus_design_grid(E) -->
</div>
</form>
