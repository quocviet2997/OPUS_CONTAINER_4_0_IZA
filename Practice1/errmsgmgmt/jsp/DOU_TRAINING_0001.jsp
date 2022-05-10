<%
/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : DOU_TRAINING_0001.jsp
*@FileTitle : Practice 01
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.16
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.22 
* 1.0 Creation
=========================================================*/
%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.esm.clv.doutraining.errmsgmgmt.event.DouTraining0001Event"%>
<%@ page import="org.apache.log4j.Logger" %>

<html>
<head>
<title>Practice 01</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script language="javascript">
	function setupPage(){
		loadPage();
	}
</script>
</head>


<body  onLoad="setupPage();">
<form name="form">
<input type="hidden" name="f_cmd">
<input type="hidden" name="pagerows">
<!-- 개발자 작업	-->
	<div class="page_title_area clear">
	    <h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!-- 
			--><button type="button" class="btn_normal" name="btn_Save" id="btn_Save">Save</button><!-- 
			--><button type="button" class="btn_normal" name="btn_DownExcel" id="btn_DownExcel">Down Excel</button>
		</div>
		<div class="location">
			<span id="navigation"></span>
		</div>
	</div>

	<div class="wrap_search">
		<div class="opus_design_inquiry wAuto">
			<table>
				<colgroup>
					<col style="width: 40px">
					<col style="width: 120px">
					<col style="width: 40px">
				</colgroup>
				<tbody>
					<tr>
						<th>Message Code</th>
						<td><input type="text" style="width:100px;" class="input" value="" name="msg_cd" id="msg_cd"></td>
						<th>Message</th>
						<td><input type="text" style="width:100px;" class="input" value="" name="msg" id="msg"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>	
	
	<div class="wrap_result">
		<div class="opus_design_grid">
			<div class="opus_design_btn">
				<button type="button" class="btn_accent" name="btn_Add" id="btn_Add">Row Add</button>
			</div>
			<script language="javascript">ComSheetObject('sheet1');</script>
		</div>
	</div>
<!-- 개발자 작업  끝 -->
</form>
</body>
</html>