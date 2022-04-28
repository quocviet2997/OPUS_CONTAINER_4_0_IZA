<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0073.jsp
*@FileTitle  : A/R Office Code Management
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/30
=========================================================
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemasterdatamgt.generalarinvoicemasterdatamgt.event.FnsInv0073Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	FnsInv0073Event  event = null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			
	String strErrMsg = "";						
	int rowCount	 = 0;						

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMasterDataMgt.GeneralARInvoiceMasterDataMgt");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (FnsInv0073Event)request.getAttribute("Event");
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
<input type="hidden" name="pagetype" value = "I">
<input type="hidden" name="proc_gb">
<input type="hidden" name="ar_ofc_cd">
<input type="hidden" name="inv_snd_tp_cd">
<input type="hidden" name="modifyGb">
<input type="hidden" name="chg_cd">
<input type="hidden" name="tml_inv_iss_flg" value="N">
<input type="hidden" name="office_cnt_cd">
<input type="hidden" name="loc_cd">

<!-- page_title_area(S) -->
<div class="page_title_area clear ">
	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button>
	</h2>
	<!-- page_title(E) -->

	    <!-- opus_design_btn(S) -->
	    <div class="opus_design_btn">
	        <!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->
			<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!--
			--><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button><!--
			--><button type="button" class="btn_normal" name="btn_Save" id="btn_Save">Save</button>			
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


<div class="wrap_search">
<!-- opus_design_inquiry(S) -->
<div class="opus_design_inquiry">
	<!--biz page (S)-->
		<table> 
       	<tr><td>
				<!-- biz_1  (S) -->
				<table> 
				<tr>
					<th width="110px">AR Office</th>
					<td width="">
						<script type="text/javascript"  style="ime-mode:disabled" dataformat="uppernum">ComComboObject('ar_ofc_cd2', 1, 100, 0, 1, 0, true);</script>						
					</td>
				</tr>
				</table>
				
			<div class="line_bluedot"></div>
				
				<table> 
				<tr>
					<th width="110px">INV Issue Type</th>
					<td width="343px"><select name="inv_iss_tp_cd" id="inv_iss_tp_cd" style="width:210px;" class="input" onchange="modify_gb();">
						<option value="" selected></option>
						<option value="S">Summary</option>
						<option value="E">Each(+),(-)</option>
						</select></td>
					<th width="130px">Copy Inv Count</th>
					<td width=""><input type="text" name="cpy_inv_knt" id="cpy_inv_knt" style="width:50px;" class="input" dataformat="num" maxlength="2" onchange="modify_gb();"></td>
					</tr>
				</table>
				<table> 
				<tr>
					<th width="10">Ex.Rate Type</th>
					<td width="177px" class="stm">USD&nbsp;&nbsp;
						<select name="xch_rt_usd_tp_cd" id="xch_rt_usd_tp_cd" style="width:120px;" class="input" onchange="modify_gb();">
						<option value="" selected></option>
						<option value="V">VVD Ex.Rate</option>
						<option value="A">Account Ex.Rate</option>
						<option value="D">Daily Ex.Rate</option>
						<option value="F">Fixed Ex.Rate</option>
						<option value="C">China Ex.Rate</option>
						</select>
					<td width="199px" class="stm">&nbsp;&nbsp;&nbsp;3RD&nbsp;&nbsp;
						<select name="xch_rt_n3rd_tp_cd" id="xch_rt_n3rd_tp_cd" style="width:120px;" class="input" onchange="modify_gb();">
						<option value="" selected></option>
						<option value="V">VVD Ex.Rate</option>
						<option value="A">Account Ex.Rate</option>
						<option value="D">Daily Ex.Rate</option>
						<option value="F">Fixed Ex.Rate</option>
						<option value="C">China Ex.Rate</option>
						</select></td>
					<th width="130px">Ex.Rate Inverse Flag</th>
					<td width=""><select name="xch_rt_rvs_flg" id="xch_rt_rvs_flg" style="width:50px;" class="input" onchange="modify_gb();">
						<option value="" selected></option>
						<option value="Y">Y</option>
						<option value="N">N</option>
						</select></td>
					</tr>
				</table>
				<table class="search" border="0" style="width:979px;"> 
					<tr>
						<th width="110px">OTS Summary</th>
						<td width="123px"  class="stm"><select name="ots_smry_cd" id="ots_smry_cd" style="width:100px;" class="input" onchange="modify_gb();">
						<option value="" selected></option>
						<option value="BL">B/L</option>
						<option value="INV">INV</option>
						<option value="CLR">SYS CLEAR</option>
						</select></td>
						<th width="130px"> INV Dup Flag</th>
						<td width="82px"><select name="inv_dup_flg" id="inv_dup_flg" style="width:50px;" class="input" onchange="modify_gb();">
						<option value="" selected></option>
						<option value="N">N</option>
						<option value="Y">Y</option>
						</select></td>
						<th width="130px">MULTI B/L INV</th>
						<td width=""><select name="inv_mlt_bl_iss_flg" id="inv_mlt_bl_iss_flg" style="width:50px;" class="input" onchange="modify_gb();">
						<option value="" selected></option>
						<option value="N">N</option>
						<option value="Y">Y</option>
						</select></td>
					</tr>
				</table>
				<table class="search" border="0" style="width:979px;"> 
					<tr>
						<th width="110px">DMT I/F</th>
						<td width="123px"><select name="dmdt_inv_aply_bl_flg" id="dmdt_inv_aply_bl_flg" style="width:87px;" class="input" onchange="modify_gb();">
						<option value="" selected></option>
						<option value="N">B/L</option>
						<option value="Y">INV</option>
						</select></td>
						<th width="130px">DMT INV Issue Flag</th>
						<td width="82px"><select name="dmdt_ar_inv_iss_flg" id="dmdt_ar_inv_iss_flg" style="width:50px;" class="input" onchange="modify_gb();">
						<option value="" selected></option>
						<option value="N">N</option>
						<option value="Y">Y</option>
						</select></td>
						<th width="130px">TPB INV Issue Flag</th>
						<td width="94px"><select name="n3pty_bil_ar_inv_flg" id="n3pty_bil_ar_inv_flg" style="width:50px;" class="input" onchange="modify_gb();">
						<option value="" selected></option>
						<option value="N">N</option>
						<option value="Y">Y</option>
						</select></td>
						<td>&nbsp;</td>
					</tr>
				</table>
				<table class="search" border="0" style="width:979px;"> 
					<tr>
						<th width="110px">VAT Rate</th>
						<td width="343px">
							<script type="text/javascript">ComComboObject('inv_vat_chg_cd', 1, 100, 0, 0, 0, true);</script><!--
							 --><!-- input type="text" name="inv_vat_chg_cd" style="width:50px;" class="input" style="ime-mode:disabled" dataformat="engup" maxlength="3" onchange="modify_gb();">--><!-- 
							 --><input type="text" name="inv_vat_chg_rt" id="inv_vat_chg_rt" style="width:120px;text-align:right" class="input" dataformat="float" onchange="modify_gb();" maxlength="10"  size="7"   pointcount="4" minnum="0" maxnum="99999.9999"> (%)
						</td>
						<th width="130px">MNR INV Issue Flag</th>
						<td width="92px"><select name="mnr_ar_inv_iss_flg" id="mnr_ar_inv_iss_flg" style="width:50px;" class="input" onchange="modify_gb();">
						<option value="" selected></option>
						<option value="N">N</option>
						<option value="Y">Y</option>
						</select></td>					
						<td>&nbsp;</td>	
					</tr>
					<tr>
					    <th>&nbsp;</th>
					    <td>&nbsp;</td>
					    <th>Show INV No for INV credits</th>
					    <td>
					        <select name="cn_dp_flg" id="cn_dp_flg" style="width:50px;" class="input" disabled>
		                        <option value="" selected></option>
		                        <option value="N">N</option>
		                        <option value="Y">Y</option>
	                        </select>
					    </td>
					    <td>&nbsp;</td>
					</tr>
				</table>  
			</td></tr>
		</table>
	<!--biz page (E)-->
	</div>
</div>
<!-- opus_design_inquiry(E) -->	
	
<div class="wrap_result">
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid" id="mainTable" style="display:none" >									
		<!-- 그리드 데이터 영역 [Table](S) (기존 As-is 구조에서 변경되는 사항 없음) -->				    
			<script type="text/javascript">ComSheetObject('sheet1');</script>							 
	    <!-- 그리드 데이터 영역 [Table](E) (기존 As-is 구조에서 변경되는 사항 없음) -->
	</div>
	<!-- opus_design_grid(E) -->						

	<div class="opus_design_grid" style="margin-right:50%;">
	    <h3 class="title_design">MRI Control</h3>
		<div class="opus_design_btn">
			<!-- 버튼 name / ID정의되어 있음. 별도 지정 금지 -->							
			<button type="button" class="btn_normal" name="btn_RowAdd" id="btn_RowAdd">Row Add</button>								
			<button type="button" class="btn_normal" name="btn_Delete" id="btn_Delete">Delete</button>								
		</div>
		<script type="text/javascript">ComSheetObject('sheet2');</script>
	</div>	
	<div class="line_bluedot mar_btm_12"></div>
	
	<div class="opus_design_inquiry sm">		
		<table class="wFit"> 
		   <tr>
               <th width="130px">INV Top Remark</th>
               <td><textarea name="inv_top_rmk" id="inv_top_rmk" cols="4" rows="5" style="width:550px;" class="textarea" maxlength="500"></textarea></td>
           </tr>     
           <tr>
               <th width="130px">INV Bottom Remark</th>
               <td><textarea name="inv_btm_rmk" id="inv_btm_rmk" cols="6" rows="6" style="width:730px;" class="textarea" maxlength="1200"></textarea></td>
           </tr>             
        </table>  
		<table class="wFit" id="indiaInvRemarkTb"> 
           <tr>
               <th width="130px">India INV Remark</th>
               <td><textarea name="inv_cnt_rmk" id="inv_cnt_rmk" cols="6" rows="6" style="width:730px;" class="textarea" maxlength="1200"></textarea></td>
           </tr>             
        </table>  
	</div>
</div>
</form>
