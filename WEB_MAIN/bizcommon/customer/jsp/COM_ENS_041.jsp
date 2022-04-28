<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_041.jsp
*@FileTitle  : Customer popup
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.customer.event.ComEns041Event"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%
    ComEns041Event  event = null;                //PDTO(Data Transfer Object including Parameters)
    GeneralEventResponse eventResponse = null;    //RDTO(Data Transfer Object including DB ResultSet)
    Exception serverException   = null;            //서버에서 발생한 에러
    DBRowSet rowSet      = null;                               //DB ResultSet
    String strErrMsg = "";                                 //에러메세지
    int rowCount     = 0;                                  //DB ResultSet 리스트의 건수
    String main_page = "";
    
	String mdm_yn = request.getParameter("mdm_yn") != null ? request.getParameter("mdm_yn") : "";
	String delt_flg = request.getParameter("delt_flg") != null ? request.getParameter("delt_flg") : "";
	String credit_flg = request.getParameter("credit_flg") != null ? request.getParameter("credit_flg") : "";
	String nmd_cust_flg_chk = request.getParameter("nmd_cust_flg_chk") != null ? request.getParameter("nmd_cust_flg_chk") : "";
	String nmd_cust_flg = nmd_cust_flg_chk.equals("") ? "" : "Y";
    
    String custSeq = "";
	String custCd = "";
	String custNm = "";
	String ofcCd = "";
    
    try {
       //SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
       //userId=account.getSawonNo();
       //userAuth=account.getAuth(); 
      
        event = (ComEns041Event)request.getAttribute("Event");
        serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
        main_page = JSPUtil.getParameter(request, "main_page".trim(), "");
        if (serverException != null) {
            strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
        }else{
        	eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
            if (eventResponse != null) {
                rowSet = eventResponse.getRs();
                if(rowSet != null){
                     rowCount = rowSet.getRowCount();
                } // end if
            } // end if
        } // end else

        custCd = event.getCustCd();
       	if(custCd.length() > 2){
       		custSeq = custCd.substring(2);
       		custCd = custCd.substring(0,2);
       	}
       	custNm = event.getCustNm();
       	ofcCd = event.getOfcCd();
         	
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
        // InitTab();
        loadPage();
    }
</script>
<!-- 
showErrMessage를 써주지 않으면 에러 발생시 처리가 불가합니다.
그리고 지금은 showErrMessage()으로 되어있지만 추후에 고객님이 변덕을 일으켜서 웹페이지를 호출하라고 할경우를 
대비해서 직접 showErrMessage() 하지 마시고 꼭 showErrMessage를 써주십시오. 한방에 바꾸게요. 표준을 안따르면 나중에 후회합니다.  
-->

<form name="form">
<input type="hidden" name="f_cmd">
<input type="hidden" name="mdm_yn" value="<%=mdm_yn%>"> 
<input type="hidden" name="nmd_cust_flg" value=<%=nmd_cust_flg%>>


<!-- OUTER - POPUP (S)tart -->
<%if(main_page.equals("true")){ %>
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
	    <!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
		<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
		<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!-- 
			 --><button type="button" class="btn_normal" name="btn2_Down_Excel" id="btn2_Down_Excel">Down Excel</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_OK" id="btn_OK">OK</button>
		</div>
		<!-- opus_design_btn(E) -->
	   	<!-- page_location(S) -->
	   	<div class="location">
	        <span id="navigation"></span>
	   	</div>
	   	<!-- page_location(E) -->
	</div>
	<!-- page_title_area(E) -->
	<!--Page Title, Historical (E)-->

<%} else { %>
<!-- popup_title_area(S) -->
 <div class="layer_popup_title">
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title"><span>Customer Inquiry</span></h2>
		<!-- page_title(E) -->

		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!-- 
			 --><button type="button" class="btn_normal" name="btn2_Down_Excel" id="btn2_Down_Excel">Down Excel</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_New" id="btn_New">New</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_OK" id="btn_OK">OK</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_Close" id="btn_Close">Close</button>
		</div>
		<!-- opus_design_btn(E) -->	
	</div>
	<!-- page_title_area(E) -->
</div>
<!-- popup_title_area(E) -->

<!-- popup_contens_area(S) -->
<%} %>		
<div class="layer_popup_contents">
	<div class="wrap_search">
		<div class="opus_design_inquiry">
			<table> 
				<tbody>
					<tr>
						<th width="50">Customer Code</th>
						<td width="105"><input type="text" name="cust_cd" dataformat="enguponly" maxlength="2" style="width:35px;ime-mode:disabled" value="<%= custCd%>"><!--
						    --><input type="text" name="cust" dataformat="num" maxlength="8" style="width:80px;ime-mode:disabled" value="<%= custSeq%>"></td>					
						<th width="50">Sales Office</th>
						<td width="60"><input type="text" name="ofc_cd" maxlength="5" dataformat="enguponly" style="width:82px"  value="<%= ofcCd%>"></td>
						<%
							if(!"".equals(mdm_yn) && mdm_yn.length() > 0){
						%>
							<th width="50">Status</th>
							<td width="85">
								<select style="width:85px;" name="delt_flg">
										<option value="ALL" <%if("ALL".equals(delt_flg)){ %> selected="selected" <%} %>>ALL</option>
										<option value="N" <%if("N".equals(delt_flg) || "".equals(delt_flg)){ %> selected="selected" <%} %>>Active</option>
										<option value="Y" <%if("Y".equals(delt_flg)){ %> selected="selected" <%} %>>Delete</option>
								</select>
							</td>
						<%
							}
						%>
						<th width="50">Location</th>
						<td width="60"><input type="text" name="loc_cd" maxlength="5" dataformat="engup" style="width:82px"  ></td>
					</tr>
					<tr>
						<th>Customer Name</th>
						<td colspan =3>
							<!-- 2014.11.21 김용습 - IE10에서 size가 잘 작동하지 않아 style로 교체 -->
							<input type="text" name="cust_nm" maxlength="60" style="width:295px;ime-mode:disabled" value="<%= custNm%>">
							<%-- <input type="text" name="cust_nm" maxlength="60" size="60px" style="ime-mode:disabled" value="<%= custNm%>"> --%>
						</td>
						<th width="50">Include</th>
						<td>
							<input type="checkbox" name="include" id="include" checked="checked" Style="border-style:none">
						</td>
						<th width="50">Credit</th>
						<td width="60">
							<input type="checkbox" name="credit_flg" id="credit_flg" <%if("on".equals(credit_flg)){ %> checked="checked" <%} %> Style="border-style:none">
						</td>
					</tr>
					<tr>
						<th>Legacy Code</th>
						<td>
							<input type="text" name="lgcy_cd" maxlength="60" style="width:120px;ime-mode:disabled" >
						</td>
						<th>Legacy Name</th>
						<td>
							<input type="text" name="lgcy_nm" maxlength="60" style="width:130px;ime-mode:disabled">
						</td>
						<th>Parent</th>
						<td>
							<select style="width:85px;" name="ctrt_src_cd">
								<option value="A"selected="selected" >ALL</option>
								<option value="M" >M</option>
								<option value="K" >K</option>
								<option value="N" >N</option>
							</select>
						</td>
						<th>Named</th>
						<td>
							<input type="checkbox" name="nmd_cust_flg_chk" id="nmd_cust_flg_chk" <%if("on".equals(nmd_cust_flg_chk)){ %> checked="checked" <%} %> Style="border-style:none">
						</td>
					</tr>
				</tbody>
		</table>
		</div>
	</div>
	<div class="wrap_result">
		<div class="opus_design_grid">
			<script type="text/javascript">ComSheetObject('sheet1');</script>
		</div>
	</div>
<%if(!main_page.equals("true")){ %>
<%}%>
</div>
</form>
