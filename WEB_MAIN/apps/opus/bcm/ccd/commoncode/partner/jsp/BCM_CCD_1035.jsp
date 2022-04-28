<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_1035.jsp
*@FileTitle  : customer
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/04
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.partner.event.BcmCcd1035Event"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%
    BcmCcd1035Event  event = null;                //PDTO(Data Transfer Object including Parameters)
    GeneralEventResponse eventResponse = null;    //RDTO(Data Transfer Object including DB ResultSet)
    Exception serverException   = null;           //Error from server
    DBRowSet rowSet      = null;                  //DB ResultSet
    String strErrMsg = "";                        //Error message
    int rowCount     = 0;                         //Count of DB resultSet list
    String main_page = "";
    
 	// 승인처리 관련
 	String rqstNo = JSPUtil.getParameter(request, "rqst_no");
 	
    try {
       
        event = (BcmCcd1035Event)request.getAttribute("Event");
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
    }catch(Exception e) {
        out.println(e.toString());
    }
    
 	String checkCustCntCd = ""; 
	if(event.getCustCntCd().length() == 2){
   		checkCustCntCd = event.getCustCntCd().substring(0,2);
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
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd">
<input type="hidden" name="rqst_no" id="rqst_no" value="<%=rqstNo%>">

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<h2 class="page_title"><span>Customer Code Duplicate Check Inquiry</span></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn(S) -->
    <div class="opus_design_btn">
		    	<button type="button"  id="btn_OK" style='display:none' class="btn_accent"  name="btn_OK">Request</button><!-- 
		     --><button type="button" class="btn_normal"  name="btn_Check" id="btn_Check">Check Duplicate</button><!-- 
		     --><button type="button" class="btn_normal" name="btn_Close" id="btn_Close">Close</button>
    </div>
	 <!-- opus_design_btn(E) -->
</div>
<div class="wrap_search">
		<!-- opus_design_inquiry(S) -->
		<div class="opus_design_inquiry wFit">
			 <table> 
	            <colgroup>
	                <col width="60">
	                <col width="*">
	            </colgroup>
	            <tbody>
		             <tr>
						<th>&nbsp Name</th>
						<td><input type="text" name="cust_nm" id="cust_nm"  maxlength="350" style="width:395px" ></td>
						<td><input type="hidden" name="cust_rgst_no" id="cust_rgst_no"></td>	
					</tr>		
				</tbody>
			</table>
			<table> 
	            <colgroup>
	                <col width="60"> 
	                <col width="68">
	                <col width="68">
	                <col width="60"> 
	                <col width="100">
	                <col width="*">
	            </colgroup>
	            <tbody>
		             <tr>
						<th>&nbsp Country</th>
						<td><input type="text" name="cust_cnt_cd" dataformat="enguponly" maxlength="2" size="60" style="width:70px;ime-mode:disabled" <% if (!checkCustCntCd.equals("AA")) { %> readOnly <%} %>></td>
						<th>Location</th>
						<td><input type="text" name="loc_cd" id="loc_cd" dataformat="enguponly" maxlength="5" size="60" style="width:70px;ime-mode:disabled" ></td>
						<th>Match Rule</th>
						<td>
							<select style="width:72px;" class="input" name="match_rule" id="match_rule">
								<option value="I" selected>Include</option>
								<option value="E">Exact</option>
								<option value="S">Start with</option>
							</select>
	                   </td>
					</tr>
				</tbody>
			</table>
		</div>
		<!-- opus_design_inquiry(E) -->
</div>
<div class="wrap_result">
	Duplicate Check Result
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid" id="mainTable" >		
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	<!-- opus_design_grid(E) -->
	</div>
</div>
</form>
<%@include file="/bizcommon/include/common_opus.jsp"%>
<SCRIPT type="text/javascript">
<!--

      with(document.form)
      {
        <%
        if(event != null){ 

        	String custCntCd = "";
        	if(event.getCustCntCd().length() == 2){
        		custCntCd = event.getCustCntCd().substring(0,2);
        	}
          	String custNm = event.getCustNm();
         	String locCd = event.getLocCd();
         	String custRgstNo = event.getCustRgstNo();
         	
        %>
                
	        eval("cust_cnt_cd").value = "<%=custCntCd%>";
	        eval("cust_nm").value = "<%=custNm%>";
	        eval("loc_cd").value  = "<%=locCd%>";
	        eval("cust_rgst_no").value  = "<%=custRgstNo%>";
        
        <% } %>
       }
-->
</SCRIPT>
 