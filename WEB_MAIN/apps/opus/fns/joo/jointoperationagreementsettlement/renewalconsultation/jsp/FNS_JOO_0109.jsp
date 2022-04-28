<%
/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_JOO_0109.jsp
*@FileTitle  : Issuing a Invoice Report
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/02
=========================================================
*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.framework.component.util.io.HttpUtil"%>
<%@ page import="org.apache.log4j.Logger"%>
<%
	Exception serverException   = null;			//서버에서 발생한 에러
	String strErrMsg = "";						//에러메세지
	int rowCount	 = 0;						//DB ResultSet 리스트의 건수
	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";
	String strUsr_id		= "";
	String strUsr_nm		= "";
    String cookiesJSessionId="";
    
    Cookie[] cookies = request.getCookies();
      if (cookies != null) {
          for (int loop = 0; loop < cookies.length; loop++) {
                 if (cookies[loop].getName().equals("JSESSIONID")) {
                         cookiesJSessionId=cookies[loop].getValue();
                  }
          }
   }
%>
<html>
<head>
<title>Issuing a Invoice Report</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script language="javascript" src="/opuscntr/rpt/script/common_rd.js"></script>
<script language="javascript">
<%// = JSPUtil.getIBCodeCombo("stlItm", "01", "CD02410", 0, "")%>
	function setupPage(){
		var errMessage = "<%=strErrMsg%>";
		if (errMessage.length >= 1) {
			ComShowMessage(errMessage);
		} // end if
		loadPage();
	}
</script>
</head>
<body onLoad="setupPage();">
	<form name="form">
	<input type="hidden" name="f_cmd">
	<input type="hidden" name="pagerows">
	<input type="hidden" name="jsession" id="jsession" value="<%=cookiesJSessionId %>"/>
	<input type="hidden" name="pop_flg" value='<%=JSPUtil.getParameter(request,"pop_flg","") %>'>
		<!-- 개발자 작업	-->
		<div class="layer_popup_title">
			<div class="page_title_area clear">
				<h2 class="page_title">
					<span>Issuing a Invoice Report</span>
				</h2>
				<div class="opus_design_btn">
					<button type="button" class="btn_accent" name="btn_Preview" id="btn_Preview">Preview</button>
					<button type="button" class="btn_normal" name="btn_Close" id="btn_Close">Close</button>
				</div>
			</div>
		</div>
		<div class="layer_popup_contents">
			<div class="wrap_search_tab">
				<div class="opus_design_inquiry wFit">
					<table class="wInherit">
						<colgroup>
							<col width="120" />
							<col width="30" />
							<col width="120" />
							<col width="50" />
							<col width="140" />
							<col width="60" />
							<col width="*" />
						</colgroup>
						<tbody>
					            <tr>
					                <th style="text-align:left"><lable for="tp2">Invoice Selection</th>
					                <td colspan="4" >
					                <input id="inv_no" style="width:150px;" class="input1" name="inv_no" value="<%=JSPUtil.getParameter(request,"inv_no","") %>" type="text" dataformat="engup" maxlength="13" required caption="Invoice No"  onChange="javascript:inv_no_OnChange(event)" onKeyDown="javascript:keyEnterRetreive(event)"  />
									<button style="width:30px;text-align:center" type="button" id="btn_PopUp_InvoiceNo" name="btn_PopUp_InvoiceNo" class="input_seach_btn"></button>
									</td>									
					            </tr>
					            <tr>
					                <th style="text-align:left"><lable for="tp2">Filter Option</th>
					                <th>Lane</th>
									<td><script type="text/javascript">ComComboObject('combo_rlane_cd', 1, 120, 1, 0);</script></td>
									<th>Item</th>
									<td><script type="text/javascript">ComComboObject('combo_itm_cd', 1, 120, 1, 0);</script></td>
									<th>Rev./Exp.</th>
									<td><script type="text/javascript">ComComboObject('combo_re_divr_cd',1,75,0,0);</script></td>
					            </tr>
					            <tr>
					                <th style="text-align:left"><lable for="tp2">Data Display Option</th>
					                <td colspan="4" class="sm pad_btm_8">
						                 <label for="chk_vvd">VVD</label><input type="checkbox" name="chk_vvd" id="chk_vvd" value="1" checked />
						                 <label for="chk_vv">VV</label><input type="checkbox" name="chk_vv" id="chk_vv" value="0"/>
						                 <label hidden="true" for="chk_rmk">Remarks</label><input type="checkbox" name=chk_rmk id="chk_rmk" value="1" checked hidden="true"/>
					                </td>
					            </tr>
					            <tr>
					                <th><lable for="tp2"></th>
					                <td colspan="4" class="sm pad_btm_8">
						                 <label for="chk_f_mm">First Port's Month</label><input type="checkbox" name="chk_f_mm" id="chk_f_mm" value="1" checked />
						                 <label for="chk_f_yyyy">Year</label><input type="checkbox" name="chk_f_yyyy" id="chk_f_yyyy" value="1"  checked/>
						                 <label for="chk_f_q">Quarter</label><input type="checkbox" name="chk_f_q" id="chk_f_q" value="1" checked/>
					                </td>
					            </tr>
					            <tr>
					                <th><lable for="tp2"></th>
					                <td colspan="4" class="sm pad_btm_8">
						                 <label for="chk_l_mm">Last Port's Month</label><input type="checkbox" name="chk_l_mm" id="chk_l_mm" value="1"  checked/>
						                 <label for="chk_l_yyyy">Year</label><input type="checkbox" name="chk_l_yyyy" id="chk_l_yyyy" value="1" checked />
						                 <label for="chk_l_q">Quarter</label><input type="checkbox" name="chk_l_q" id="chk_l_q" value="1"  checked/>
						            </td>
					            </tr>
					            <tr>
					                <td colspan="7" class="align_right">
					                    <img src="img/btns_plus.gif" name="btn_RD_ZoomOut" id="btn_RD_ZoomOut" style="width:18px;height:18px;cursor:pointer" />
										<img src="img/btns_minus.gif" name="btn_RD_ZoomIn" id="btn_RD_ZoomIn" style="width:18px;height:18px;cursor:pointer" />
					                    <img src="img/btns_back_1.gif" name="btn_RD_FirstPage" id="btn_RD_FirstPage" style="width:18px;height:18px;cursor:pointer" />
					                    <img src="img/btns_back.gif" name="btn_RD_PreviousPage" id="btn_RD_PreviousPage" style="width:18px;height:18px;cursor:pointer" />
					                    <img src="img/btns_next.gif" name="btn_RD_NextPage" id="btn_RD_NextPage" style="width:18px;height:18px;cursor:pointer" />
					                    <img src="img/btns_next_1.gif" name="btn_RD_LastPage" id="btn_RD_LastPage" style="width:18px;height:18px;cursor:pointer" />
					                </td>
					            </tr>
						</tbody>
					</table>
					<!-- search table(E) -->
				</div>
			</div>
			<div class="wrap_result">
				<div class="opus_design_RD">
					<script language="javascript">rdViewerObject();</script>
				</div>
			</div>
		</div>
				<!-- opus_design_grid(S) -->
		<div class="opus_design_grid" style="display: none;">
			<script type="text/javascript">ComSheetObject('sheet1');</script>		
		</div>
	</form>
</body>