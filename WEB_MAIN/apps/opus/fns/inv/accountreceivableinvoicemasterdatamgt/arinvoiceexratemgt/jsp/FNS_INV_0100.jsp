<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0100.jsp
*@FileTitle  : VVD Ex.Rate Creation by S/A Date
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/10
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.inv.accountreceivableinvoicemasterdatamgt.arinvoiceexratemgt.event.FnsInv0100Event"%>
<%@ page import="org.apache.log4j.Logger" %>
<%
	FnsInv0100Event  event=null;					//PDTO(Data Transfer Object including Parameters)
	Exception serverException=null;			// Errors from server.
	String strErrMsg="";						// Error message.
	int rowCount=0;						// DB ResultSet list count
	String successFlag="";
	String codeList="";
	String pageRows="100";
	String strUsr_id="";
	String strUsr_nm="";
	Logger log=Logger.getLogger("com.clt.apps.AccountReceivableInvoiceMasterDataMgt.ARInvoiceExRateMgt");
	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id=account.getUsr_id();
		strUsr_nm=account.getUsr_nm();
		event=(FnsInv0100Event)request.getAttribute("Event");
		serverException=(Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
		if (serverException != null) {
			strErrMsg=new ErrorHandler(serverException).loadPopupMessage();
		}
		// Get data from server. ..
		GeneralEventResponse eventResponse=(GeneralEventResponse) request.getAttribute("EventResponse");
	}catch(Exception e) {
		out.println(e.toString());
	}
%>
<script type="text/javascript">
	function setupPage(){
		var errMessage="<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>

<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input type="hidden" name="ofc" value="" id="ofc" />
<input type="hidden" name="ofc_cd" value="" id="ofc_cd" />
<input type="hidden" name="svr_id" value="" id="svr_id" />
<input type="hidden" name="pagetype" value="I" id="pagetype" />
<input type="hidden" name="ar_ofc_cd2" id="ar_ofc_cd2" />
<input type="hidden" name="eff_dt" value="" id="eff_dt" />
<input type="hidden" name="curr_cd" value="" id="curr_cd" />
<input type="hidden" name="xch_rt_rvs_flg" value="" id="xch_rt_rvs_flg" />
<input type="hidden" name="etd_dt2" value="" id="etd_dt2" />
<input type="hidden" name="etd_dt2_fm" value="" id="etd_dt2_fm" />
<input type="hidden" name="etd_dt2_to" value="" id="etd_dt2_to" />
<input type="hidden" name="org_curr_cd" value="" id="org_curr_cd" />
<input type="hidden" name="org_ofc_cd" value="" id="org_ofc_cd" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
	<div class="opus_design_btn">
		<button type="button" class="btn_accent" name="btn1_Retrieve" 	id="btn1_Retrieve">Retrieve</button><!-- 
		 --><button type="button" class="btn_normal" name="btn1_New"  		id="btn1_New">New</button><!-- 
		 --><button type="button" class="btn_normal" name="btn1_Save" 		id="btn1_Save">Save</button><!-- 		
		 --><button type="button" class="btn_normal" name="btn_downexcel"  		id="btn_downexcel">Down Excel</button>	
	</div>
	<!-- opus_design_btn(E) -->
	<!-- page_location(S) -->
	<div class="location">
		<!-- location 내용 동적생성 (별도 코딩 불필요) -->
		<span id="navigation"></span>
	</div>
</div>
<!-- page_title_area(E) -->


<!-- opus_design_inquiry(S) -->
<div class= "wrap_search">
	<div class= "opus_design_inquiry">
		<table>
			<tbody>
				<colgroup>
					<col width="40"/>
					<col width="100"/>
					<col width="70"/>
					<col width="60"/>
					<col width="40"/>
					<col width="80"/>
					<col width="40"/>
					<col width="80"/>
					<col width="40"/>
					<col width="80"/>
					<col width="40"/>
					<col width="*"/>
			    </colgroup>
				<tr>
					<th>ETA/D</th>
					<td><input type="text" value="" name="etd_dt_fm" style="width: 80px;" class="input1" dataformat="num" onblur="fn_ComGetMaskedValue();" id="etd_dt_fm" /><button type="button" id="btns_calendar" name="btns_calendar" class="calendar ir"></button>~ 
					<input type="text" value="" name="etd_dt_to" style="width: 80px;" class="input1" dataformat="num" onblur="fn_ComGetMaskedValue_to();" id="etd_dt_to" /><button type="button" id="btns_calendar2" name="btns_calendar2" class="calendar ir"></button></td>
					
					<th>Local Cur.</th>
					<td><input type="text" value="" style="width: 40px;" readonly class="input2" name="locl_curr_cd" id="locl_curr_cd" /> </td>
					<th>Port</th>
					<td><script type="text/javascript">ComComboObject("vps_port_cd", 1, 80, 2);</script></td>
					<th>Scope</th>
					<td><script type="text/javascript">ComComboObject("svc_scp_cd", 1, 50, 1);</script></td>
					<th id="bnd_ctnt1" name="bnd_ctnt1">Bound</th>
					<td id="bnd_ctnt2" name="bnd_ctnt2">
							<select style="width: 100px;" class="input1" name="bnd_cd" id="bnd_cd">
								<option value="O" selected>O/B</option>
								<option value="I">I/B</option>
								<option value="T">Triangle</option>
							</select>
					</td>					
					<th id="tri_ctnt1" name="tri_ctnt1">Triangle</th>
					<td id="tri_ctnt2" name="tri_ctnt2">
							<select style="width: 100px;" class="input1" name="tri_yn" id="tri_yn"	onChange="javascript:changeTriYn()">
								<option value="N" selected>N</option>
								<option value="Y">Y</option>
							</select>
					</td>
					<th>Office</th>
					<td><script type="text/javascript">ComComboObject('ar_ofc_cd', 1, 100, 1);</script></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
<!-- opus_design_inquiry(E) -->
<!-- layout_wrap(S) -->
<div class="wrap_result">
		<div class="layout_wrap">
		    <div class="layout_vertical_2 pad_rgt_4"  style="width:70%">
		        <!-- opus_design_grid(S) -->
		        	<div class="opus_design_grid clear" >
			        	<div class="opus_design_btn">
							<button type="button" class="btn_normal" name="btn2_Row_Add" 	id="btn2_Row_Add">Row Add</button><!-- 
							 --><button type="button" class="btn_normal" name="btn2_Row_Copy" 	id="btn2_Row_Copy">Row Copy</button><!-- 
							 --><button type="button" class="btn_normal" name="btn2_Delete" 	id="btn2_Delete">Row Delete</button>
						</div>
		           		 <script type="text/javascript">ComSheetObject('sheet1');</script>
		            </div>
		     
		        <!-- opus_design_grid(E) -->
		    </div>
		    <div class="layout_vertical_2" style="width:30%">
		        <!-- opus_design_grid(S) -->
		       	<div class="opus_design_grid clear" >
			        	<div class="opus_design_btn">
							<button type="button" class="btn_normal" name="btn3_Row_Add" 	id="btn3_Row_Add">Row Add</button><!-- 
							 --><button type="button" class="btn_normal" name="btn3_Row_Copy" 	id="btn3_Row_Copy">Row Copy</button><!-- 
							 --><button type="button" class="btn_normal" name="btn3_Delete" 	id="btn3_Delete">Row Delete</button>
						</div>
		            	<script type="text/javascript">ComSheetObject('sheet2');</script>
		            </div>
		     
		        <!-- opus_design_grid(E) -->
		    </div>
		</div>
	
</div>
<!-- layout_wrap(E) -->
<!-- opus_design_grid(S) -->
<div class="wrap_result" style="display:none">
	<div class="opus_design_grid clear" >
		<script type="text/javascript">ComSheetObject('sheet3');</script>
	</div>
</div>
<!-- opus_design_grid(E) -->			
</form>

