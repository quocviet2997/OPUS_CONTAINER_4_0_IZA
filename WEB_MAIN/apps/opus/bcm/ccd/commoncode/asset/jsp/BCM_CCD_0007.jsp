<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0007.jsp
*@FileTitle  : Container Type Size
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/03
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.asset.event.BcmCcd0007Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
				    BcmCcd0007Event  event = null;				//PDTO(Data Transfer Object including Parameters)
		Exception serverException   = null;			//Error from server
		String strErrMsg = "";						//Error message
		int rowCount	 = 0;						//Count of DB resultSet list
	
		String successFlag = "";
		String codeList  = "";
		String pageRows  = "100";

		String strUsr_id		= "";
		String strUsr_nm		= "";
		Logger log = Logger.getLogger("com.clt.apps.opus.bcm.ccd.commoncode.asset");
	
		try {
		   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
				strUsr_id =	account.getUsr_id();
				strUsr_nm = account.getUsr_nm();
		
				event = (BcmCcd0007Event)request.getAttribute("Event");
				serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

				if (serverException != null) {
						strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
				}
		
				GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		
		}catch(Exception e) {
				out.println(e.toString());
		}
%>
<script type="text/javascript">
		var G_MDAA_CHK;
		var G_AHTU_TP_CD;

		function setupPage(){
				var errMessage = "<%=strErrMsg%>";
				if (errMessage.length >= 1) {
						ComShowMessage(errMessage);
				} // end if
				loadPage();
		}
</script>
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="mdm_yn" value="Y" id="mdm_yn" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
<!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
		<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
		 --><button type="button" class="btn_normal" name="btn_Save" id="btn_Save">Save</button><!--
		 --><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button>
		</div>
		<!-- opus_design_btn(E) -->
	
	<!-- page_location(S) -->
	<div class="location">
		<!-- location 내용 동적생성 (별도 코딩 불필요) -->
		<span id="navigation"></span>
	</div>
</div>

<!-- page_title_area(E) -->


<!-- wrap_search(S) -->  
<div class="wrap_search">
<!-- opus_design_inquiry (S) -->
<div class="opus_design_inquiry wFit">
	<table>
		<colgroup>
			<col width="100">
			<col width="320">
			<col width="185">
			<col width="*">
		</colgroup>
		<tr class="h23">
			<th>Type Size Code</th>
			<td><input type="text" style="width:100px;text-align:center;ime-mode:disabled;" class="input1" dataformat="engup" name="cntr_tpsz_cd" maxlength="2" ><!-- 
			 --><button type="button" name="btns_search" id="btns_search"  class="input_seach_btn"></button>
			</td>
			<th></th>
			<td></td>
			<!-- izanagi branding work, 20170901  
			<th>Legacy Code</th>
			<td><input type="text" style="width:150px;text-align:center;ime-mode:disabled;" class="input" dataformat="engup" id="modi_cntr_tpsz_cd" name="modi_cntr_tpsz_cd" maxlength="30"></td>
			-->
		</tr>	
	</table>
</div>
<div class="opus_design_inquiry"><table class="line_bluedot"><tr><td></td></tr></table></div>
<div class="opus_design_inquiry wFit">	
	<table>
		<colgroup>
			<col width="100">
			<col width="320">
			<col width="180">
			<col width="*">
		</colgroup> 
		<tr class="h23">
			<th>Type Size Name</th>
			<td><input type="text" style="width:320px;text-align:left;" class="input1" dataformat="engup" otherchar="()_\-,. " name="cntr_tpsz_desc" maxlength="100"></td>
			<th>Remark</th>
			<td><input type="text" style="width:100%;text-align:left;" class="input1" name="cntr_tpsz_rmk" maxlength="100"></td>
		</tr>	
	</table>
	<table>
		<colgroup>
			<col width="100">
			<col width="30">
			<col width="40">
			<col width="50">
			<col width="133">
			<col width="50">
			<col width="180">
			<col width="100">
			<col width="120">			
			<col width="*">
		</colgroup>
		<tr class="h23">
			<th>Type</th>
			<td><script type="text/javascript">ComComboObject('cntr_tp_cd', 2, 40, 1, 1, 0, false)</script></td>
			<th>Size</th>
			<td><script type="text/javascript">ComComboObject('cntr_sz_cd', 2, 40, 1, 1, 0, false)</script></td>
			<th>Loading Weight(KG)</th>
			<td><input type="text" style="width:50px;text-align:right;ime-mode:disabled;" class="input1" dataformat="num" name="cntr_tpsz_lodg_wgt" maxlength="6"></td>
			<th>Loading Capacity(CBM)</th>
			<td><input type="text" style="width:60px;text-align:right;ime-mode:disabled;" class="input1" caption="Loading Capacity(CBM)" dataformat="float" maxlength="19" pointcount="3" name="cntr_tpsz_lodg_capa"></td>
			<th>Tare Weight(KG)</th>
			<td><input type="text" style="width:60px;text-align:right;ime-mode:disabled;" class="input1" dataformat="num" name="cntr_tpsz_tare_wgt" maxlength="6"></td>
		</tr>
	</table>
	<table>
		<colgroup>
			<col width="100">
			<col width="120">
			<col width="150">
			<col width="100">
			<col width="138">
			<col width="*">
		</colgroup>
		<tr class="h23">
			<th>PSA Code</th>
			<td>
			<!-- <input type="text" style="width:211px;text-align:center;ime-mode:disabled;" class="input" dataformat="enguponly" name="cntr_tpsz_psa_cd" maxlength="4" id="cntr_tpsz_psa_cd"> -->
			<script type="text/javascript">ComComboObject('cntr_tpsz_psa_cd', 2, 80, 1, 0, 0, false)</script>
			</td>
			<th>ISO Code</th>
			<td>
			<!-- <input type="text" style="width:138px;text-align:center;ime-mode:disabled;" class="input" dataformat="engup" name="cntr_tpsz_iso_cd" maxlength="4" id="cntr_tpsz_iso_cd"> -->
			<script type="text/javascript">ComComboObject('cntr_tpsz_iso_cd', 2, 80, 1, 0, 0, false)</script>
			</td>
			<th>Cost Group</th>
			<td><script type="text/javascript">ComComboObject('cntr_tpsz_grp_cd', 2, 100, 1, 1, 1, false)</script></td>
		</tr>
	</table>
</div>
<div class="opus_design_inquiry"><table class="line_bluedot"><tr><td></td></tr></table></div>
<div class="opus_design_inquiry wFit">
	<table>
		<colgroup>
			<col width="100">
            <col width="100">
            <col width="100">
            <col width="120">
            <col width="100">
            <col width="150">
            <col width="100">
            <col width="120">
            <col width="100">
            <col width="*">
        </colgroup>  
		<tr class="h23">
			<th>Delete Flag</th>
			<td><select style="width:50px;" class="input" name="delt_flg" id="delt_flg"><!-- 
			 --><option value="N">N</option><!-- 
			  --><option value="Y">Y</option><!-- 
			   --></select></td>
			<th>Create User</th>
            <td><input type="text" style="width:80px;text-align:center;" class="input" name="cre_usr_id" id="cre_usr_id" readOnly/>
            </td>
            <th>Create Date/Time</th>
            <td><input type="text" style="width:120px;text-align:center;" class="input" name="cre_dt" id="cre_dt" readOnly/>
            </td>
            <th>Last Update User</th>
            <td><input type="text" style="width:80px;text-align:center;" class="input" name="upd_usr_id" id="upd_usr_id" readOnly/>
            </td>
            <th>Last Update Date/Time</th>
            <td><input type="text" style="width:120px;text-align:center;" class="input" name="upd_dt" id="upd_dt" readOnly/>
            </td>
		</tr>	
	</table>	
</div>
<!-- opus_design_inquiry (E) -->
</div>
<!-- wrap_search(E) -->  


<!-- wrap_result(S) -->  
<div class="wrap_result">
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid wFit" id="mainTable" style="display:none;">
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
	<!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->  


</form>