<%
/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : FNS_JOO_0057.jsp
 *@FileTitle: RDR Download by VVD
 *@author   : CLT
 *@version  : 1.0
 *@since    : 2014/06/19
 =========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.fns.joo.jointoperationagreementsettlement.carriersettlementprocess.event.FnsJoo0057Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
    FnsJoo0057Event  event = null;         //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;    //error from server
    String strErrMsg = "";                 //error message
    int rowCount = 0;                      //count of DB resultSET list

    String successFlag = "";
    String codeList = "";
    String pageRows = "100";

    String strUsr_id = "";
    String strUsr_nm = "";
    Logger log = Logger.getLogger("com.clt.apps.JointOperationAgreementSettlement.CarrierSettlementProcess");
    String strFromyyyyMMdd = "";
    String strToyyyyMMdd = "";
    try {
        SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
        strUsr_id =    account.getUsr_id();
        strUsr_nm = account.getUsr_nm();
        strFromyyyyMMdd = DateTime.getFormatDate( DateTime.addMonths( JSPUtil.getKST("yyyyMMdd"), -1 ), "yyyyMMdd", "yyyy-MM-dd" );
        strToyyyyMMdd   = DateTime.getFormatDate( JSPUtil.getKST("yyyyMMdd"), "yyyyMMdd", "yyyy-MM-dd");

        event = (FnsJoo0057Event)request.getAttribute("Event");
        serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);

        if (serverException != null) {
            strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
        }

        // getting data from server when loading page ..
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

<form name="form" id="form">
<input type="hidden" name="f_cmd" id="f_cmd">
<input type="hidden" name="pagerows" id="pagerows">

<!-- page_title_area(S) -->
<div class="page_title_area clear">
   <!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	<!-- page_title(E) -->
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		<button class="btn_accent" name="btn_Retrieve" id="btn_Retrieve" type="button">Retrieve</button><!--
		--><button class="btn_normal" name="btn_downexcel" id="btn_downexcel" type="button">Down Excel</button><!--
		--></div>
	<!-- opus_design_btn (E) -->	
	<!-- page_location(S) -->
	<div class="location">
		<span id="navigation"></span>
	</div>
</div>
<!-- page_title_area(E) -->


<div class= "wrap_search">
<!-- opus_design_inquiry(S) -->
	<div class= "opus_design_inquiry wFit">
		<table>
			<tbody>
				<colgroup>
					<col width="50"/>
					<col width="300"/>
					<col width="60"/>
					<col width="120"/>
					<col width="50"/>
					<col width="120"/>
					<col width="50"/>
					<col width="100"/>
					<col width="50"/>
					<col width="*"/>
			    </colgroup>
			    <tr class="h23">
                    <th>Period&nbsp;</th>
                    <td><input type="text" style="width:80px;" class="input1" required="" dataformat="ymd" maxlength="8" caption="Period From" name="pre_fr" value="<%=strFromyyyyMMdd%>" cofield="pre_to" id="pre_fr" /><!-- 
                     	--><button type="button" id="btns_calendar_from" name="btns_calendar_from" class="calendar ir"></button>&nbsp;~&nbsp;
                         <input type="text" style="width:80px;" class="input1" required="" dataformat="ymd" maxlength="8" caption="Period To" name="pre_to" value="<%=strToyyyyMMdd%>" cofield="pre_fr" id="pre_to" /><!-- 
                         --><button type="button" id="btns_calendar_to" name="btns_calendar_to" class="calendar ir"></button>                     
                    </td>                                   
                   <th>Lane</th>
                    <td><input type="text" style="width:50px;ime-mode:disabled" class="input1" required="" dataformat="engup" maxlength="3" fullfill="" caption="Lane" name="rlane_cd" id="rlane_cd" /><button type="button" id="srch_rlane_cd" name="srch_rlane_cd" class="input_seach_btn"></button></td>
                    <th>Dir.</th>
                    <td><script type="text/javascript">ComComboObject("skd_dir_cd", 1, 60, 2, 0, 0);</script></td>
                    <th title="Vessel Voyage Direction">VVD</th>
                    <td><input type="text" style="width:80px;" class="input" name="vvd" dataformat="engup" caption="VVD" maxlength="9" minlength="4" fullfill="" id="vvd" /> </td>
                    <th>Carrier</th>
                    <td><script type="text/javascript">ComComboObject("oprCdCombo", 1, 70, 1, 0, 0);</script><input type="hidden" name="opr_cd"></td>
                </tr>
			</tbody>
		</table>
		<table class="height_10"><tr><td colspan="8"></td></tr></table>

	</div>
</div>

<!-- opus_design_grid(S) -->
<div class="wrap_result">
	<div class="opus_design_grid" >			
		<script type="text/javascript">ComSheetObject('sheet1');</script>
	</div>
		<!-- opus_design_grid(E) -->
	<div>
	<table border="0" style="width:100%">
		<tr>
		<td width="80px"><b>Actual Used</b></td><td align="left">: 20 + 40 + 20HC + 40HC + 45 + Void (In case of HC and over 40', 1 Vol. is equals to 2 Teu)</td>
		</tr>
		<td><b>RF</b></td><td align="left">: Loading Volume at the Port</td>
		</tr>
	</table>
	</div>
</div>
<!-- opus_design_grid(E) -->

</form>
  