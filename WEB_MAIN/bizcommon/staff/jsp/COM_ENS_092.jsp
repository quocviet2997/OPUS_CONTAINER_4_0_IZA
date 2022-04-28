<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : orgchart.jsp
*@FileTitle  : orgchart 정보조회(공통 Popup)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/18
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	String cahrt = "";
	if(request.getParameter("Subscriber") != null || !request.getParameter("Subscriber").equals("")){
		cahrt = request.getParameter("Subscriber");
	}
%>
<script type="text/javascript">
	function setupPage(){
		loadPage();
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/opuscntr/css/OrganTree.css" type="text/css" rel="stylesheet" />
<script type="text/javascript"  src="/opuscntr/js/OrganTree.js"></script>
<script type="text/javascript"  src="/opuscntr/js/HashMap.js"></script>

<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_title(S) -->
	<%if(cahrt.equals("")){ %>
		<h2 class="page_title"><span id="title">People Search</span></h2>
	<%}else{%>
		<h2 class="page_title"><span id="title">Notified Subscriber Inquiry</span></h2>
	<%}%>
	<!-- page_title(E) -->
	<!-- opus_design_btn (S) -->
	<div class="opus_design_btn">
		   <button class="btn_accent" type="button" name="btn_Search" id="btn_Search">Retrieve</button><!--
		--><button class="btn_normal" type="button" name="btn_Confirm" id="btn_Confirm">Confirm</button><!--
		--><button class="btn_normal" type="button" name="btn_Close" id="btn_Close">Close</button>
	</div>
	<!-- opus_design_btn (E) -->
</div>
<!-- page_title_area(E) -->

<!-- opus_design_inquiry(S) -->
<div class= "wrap_search">
	<!-- layout_wrap(S) -->
	<div class="layout_wrap">
		<!-- layout_vertical_2(S) -->
		<div class="layout_vertical_2" style="width:202px;margin-right:20px">
			<div class="opus_design_inquiry wFit">
				<table>
					<colgroup>
			            <col width="50">
			            <col width="*">
					</colgroup>
					<tbody>
						<tr>
							<td><select id="company" onchange="changeCompany('treeView', this.value)">
									<option value="hjs">HJS</option>
									<option value="clt">CLT</option>
									<option value="sen">SEN</option>
								</select>
							</td>
						</tr>
					</tbody>
				</table>
				<table class="line_bluedot"><tr><td></td></tr></table>
				<div id="treeView" style="overflow: auto; width: 200px; height: 262px; border-width: 1px; border-style: solid; border-color: #7F9DB9;"></div>
			</div>
		</div>
		<!-- layout_vertical_2(E) -->
		<!-- layout_vertical_2(S) -->
		<div class="layout_vertical_2" style="width: 81%">
			<div class="opus_design_inquiry wFit">
				<table>
					<colgroup>
		             	<col width="500">
			            <col width="*">
					</colgroup>
					<tbody>
						<tr>
							<td></td>
							<td><select id="search">
									<option value="NAME">Name (ENG+Local)</option>
									<option value="TEAMNM">Department</option>
									<option value="POS">Title</option>
									<option value="JOB">Job Info</option>
									<option value="CN">User ID</option>
								</select><!-- 
							 --><input type="text" style="width:100px;" class="input" value="" name="search_text" id="search_text">
							</td>
						</tr>
					</tbody>
				</table>
				<table class="line_bluedot"><tr><td></td></tr></table>
				<script type="text/javascript">ComSheetObject('sheet1');</script>
			</div>
			 
		</div>
	</div>
</div>
<!-- opus_design_inquiry(E) -->
 <%@include file="../../include/common_alps.jsp"%>