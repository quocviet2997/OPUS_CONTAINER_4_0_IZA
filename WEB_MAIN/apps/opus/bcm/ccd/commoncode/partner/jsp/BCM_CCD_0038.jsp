<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0038.jsp
*@FileTitle  : Group Customer Code
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
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.partner.event.BcmCcd0038Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	BcmCcd0038Event  event = null;				//PDTO(Data Transfer Object including Parameters)
	Exception serverException   = null;			//Error from server
	String strErrMsg = "";						//Error message
	int rowCount	 = 0;						//Count of DB resultSet list

	String successFlag = "";
	String codeList  = "";
	String pageRows  = "100";

	String strUsr_id		= "";
	String strUsr_nm		= "";
	Logger log = Logger.getLogger("com.clt.apps.commoncode.partner");
	String mainPage 		= "";
    mainPage = request.getParameter("main_page");
    
	// 승인처리용 정보
	String rqstNo		= JSPUtil.getParameter(request, "rqst_no");
	String procTpCd		= JSPUtil.getParameter(request, "proc_tp_cd");
	String custCd		= JSPUtil.getParameter(request, "cust_cd");
	String rqstUsrChk	= JSPUtil.getParameter(request, "rqst_usr_chk");

	try {
	   	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
		strUsr_id =	account.getUsr_id();
		strUsr_nm = account.getUsr_nm();


		event = (BcmCcd0038Event)request.getAttribute("Event");
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
<input type="hidden" name="ibflag" value="I" id="ibflag" />
<input type="hidden" name="create_yn" value="N" id="create_yn" />
<input type="hidden" name="mdm_yn" value="Y" id="mdm_yn" />
<input type="hidden" name="creflag" value="N" id="creflag" />
<input type="hidden" name="saveflag" value="N" id="saveflag" />
<input type="hidden" name="mst_dat_subj_cd" value="GCST" id="mst_dat_subj_cd" />
<input type="hidden" name="rqst_no" value="<%=rqstNo%>" id="rqst_no" />
<input type="hidden" name="proc_tp_cd" value="<%=procTpCd%>" id="proc_tp_cd" />
<input type="hidden" name="rqst_usr_chk" value="<%=rqstUsrChk%>" id="rqst_usr_chk" />

<!-- page_title_area(S) -->
<div class="page_title_area clear">
<!-- page_title(S) -->
<h2 class="page_title">
	<%if (("true").equals(mainPage)){%>
		<button type="button">
		<span id="title"></span></button></h2>
	<%}else{%>
		<span id="title1">Group Customer</span></h2>
	<%} %>	
<!-- page_title(E) -->
<!-- opus_design_btn(S) -->
<div class="opus_design_btn">
<button type="button" class="btn_normal"  name="btn_CheckDup" id="btn_CheckDup" style='display:none'>Check Duplicate</button><!-- 
 --><button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve" style='display:none'>Retrieve</button><!--
 --><button type="button" class="btn_normal" name="btn_Save" id="btn_Save" style='display:none'>Save</button><!--
 --><button type="button" class="btn_normal"  style='display:none' name="btn_Request" id="btn_Request" style='display:none'>Request</button><!-- 
  --><button type="button" class="btn_normal"  name="btn_Create" id="btn_Create" style='display:none'>Create</button><!-- 
   --><button type="button" class="btn_normal" name="btn_New" id="btn_New" style='display:none'>New</button><!-- 
    --><button type="button" class="btn_normal"  style='display:none' name="btn_Close" id="btn_Close" >Close</button>
</div>
<!-- opus_design_btn(E) -->

<!-- page_location(S) -->
<%if (("true").equals(mainPage)){%>
	<div class="location">	
		<span id="navigation"></span>
	</div>
	<%}%>
</div>

<!-- page_title_area(E) -->

<!-- wrap_search(S) -->  
<div class="wrap_search">
<!-- opus_design_inquiry (S) -->
<div class="opus_design_inquiry wFit">
	<table> 
		<colgroup>
			<col width="140px">
			<col width="190">
			<col width="50px">
			<col width="*">
		</colgroup>
		<tr>
			<th>Group Customer Code</th>
			<td><input type="text" style="width:100px;ime-mode:disabled;text-align:center;" maxlength="10" name="cust_grp_id" class="input1" value="" dataformat="engup" otherchar="-"><!-- 
			 --><button type="button" name="btn_com_com_0006" id="btn_com_com_0006"  class="input_seach_btn"></button></td>
			<th>Group Name</th>
			<td><input type="text" style="width:412px;"  maxlength="50" dataformat="engup" otherchar="()_\-,. &()'" name="cust_grp_nm" class="input1" value=" " ></td>
		</tr>	
	</table>	
	</div>		
	<table class="line_bluedot"><tr><td></td></tr></table>
	<div class="opus_design_inquiry wFit">
	<table> 
		<colgroup>
				<col width="140px">
				<col width="183">
				<col width="50px">
				<col width="191px">
				<col width="50px">
				<col width="*">
			</colgroup>
		<tr>
			<th>Abbreviation</th>
			<td><nobr><input type="text" class="input" style="width:100px;ime-mode:disabled;text-align:center;" name="cust_grp_abbr_nm" maxlength="50" dataformat="excepthan"></nobr></td>				
			<th>Control Office</th>
			<td><nobr><input type="text" class="input1" style="width:88px;ime-mode:disabled;text-align:center;" name="ofc_cd" maxlength="6" dataformat="engup"><!-- 
			 --><button type="button" name="btn_com_ens_071" id="btn_com_ens_071"  class="input_seach_btn"></button></nobr></td>
			<th>Sales Rep.</t>
			<td><input type="text" style="width:90;ime-mode:disabled;text-align:center;" class="input1" value="" name="srep_cd" maxlength="5" dataformat="engup"><!-- 
			 --><button type="button" name="btn_com_com_0008" id="btn_com_com_0008"  class="input_seach_btn"></button></td>				
			<!--<td width=""><nobr><input type="text" class="input1" style="width:100;" name="srep_cd" dataformat="engupnum" maxlength=""> <img class="cursor"  src="img/btns_search.gif" width="18" height="20" alt="" border="0" align="absmiddle" name="btn_com_ens_091"></nobr></td>-->
		</tr>	
	</table>
	
	<table>
		<colgroup>
				<col width="140px">
				<col width="135px">
				<col width="50px">
				<col width="121px">
				<col width="50px">
				<col width="180px">
				<col width="50px">
				<col width="*">
			</colgroup> 
		<tr>
			<th>Value Base Seg. Class</th>
			<td><script type="text/javascript">ComComboObject('vbs_clss_cd', 2, 102, 1, 0 ,0 ,false)</script></td>
			<th>Need Base Seg. Class1</th>
			<td><script  type="text/javascript">ComComboObject('nbs_clss_cd1', 2, 90, 1, 0 ,0 ,false)</script></td>
			<th>Need Base Seg. Class2</th>
			<td><script type="text/javascript">ComComboObject('nbs_clss_cd2', 2, 90, 1, 0 ,0 ,false)</script></td>
			<th>Need Base Seg. Class3</th>
			<td><script  type="text/javascript">ComComboObject('nbs_clss_cd3', 2, 90, 1, 0 ,0 ,false)</script></td>
		</tr>	
	</table>			
	</div>		
	<table class="line_bluedot"><tr><td></td></tr></table>
	<div class="opus_design_inquiry wFit">
	<table>
        	<colgroup>
                <col width="140"/>
                <col width="120">
            	<col width="100">
            	<col width="120">
            	<col width="100">
            	<col width="150">
            	<col width="100">
            	<col width="120">
            	<col width="100">
                <col width="*"/>
            </colgroup>
            <tbody>
                <tr>
                    <th>Delete Flag</th>
                    <td>
                        <select style="width:100px;" name="delt_flg" class="input" id="delt_flg">
                            <option value="N" selected>N</option>
                            <option value="Y">Y</option>
                        </select>
                    </td>
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
            </tbody>
        </table>	
</div>
<!-- opus_design_inquiry (E) -->
</div>
<!-- wrap_search(E) -->  

<!-- wrap_result(S) -->  
<div class="wrap_result">
<!-- opus_design_grid(S) -->
<div class="opus_design_grid" style="display: none;">
	<script type="text/javascript">ComSheetObject('sheet1');</script>
</div>
<!-- opus_design_grid(E) -->
</div>
<!-- wrap_result(E) -->  


</form>
