<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_0906.jsp
*@FileTitle  : Multiple Inquiry
*@author     : CLT
*@version    : 1.0
*@since      : 2018/07/23
=========================================================
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.rowset.DBRowSet"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%
	String returnval = ((request.getParameter("returnval")==null )?"":request.getParameter("returnval"));
	String returntitle = ((request.getParameter("returntitle")==null )?"":request.getParameter("returntitle"));
	String pgmNo = ((request.getParameter("pgmNo")==null )?"":request.getParameter("pgmNo"));
	returntitle ="("+returntitle+")";
%>

<script type="text/javascript">
	function setupPage(){
		loadPage();
	}
</script>

<form method="post" name="form" onSubmit="return false;">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="iPage" id="iPage" />
<input type="hidden" name="pgmNo" id="pgmNo" value="<%=pgmNo%>" />
<input type="hidden" name="returnval" value="<%=returnval%>" id="returnval" />
<input type="hidden" id="returntitle" name="returntitle" value="<%=returntitle%>" />
<div class="layer_popup_title">
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
		<h2 class="page_title"><span>Multiple Inquiry <%=returntitle%></span></h2>
		<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_new"  id="btn_new">New</button><!-- 
			 --><button type="button" class="btn_accent" name="btn_close" id="btn_close">Close</button>
		</div>
		<!-- opus_design_btn(E) -->
	</div>
<!-- page_title_area(E) -->
</div>
<div class="layer_popup_contents">
	<!-- opus_design_grid(S) -->
	<div class="wrap_result">
		<div class="opus_design_grid">
			<!-- opus_design_btn(S) -->
			<div class="opus_design_btn">
				<button type="button" class="btn_normal" name="btng_rowadd" id="btng_rowadd">Row Add</button><!-- 
				 --><button type="button" class="btn_normal" name="btng_apply" id="btng_apply">Apply</button>
			</div>
			<!-- opus_design_btn(E) -->
			<script type="text/javascript">ComSheetObject('sheet1');</script><!--W/O Issue-->
			<div class="opus_design_inquiry">
				<table>
					<tr>
						<th style="text-align:center;">Row Count <input name="row_count" type="text" style="width:30px; height:19px; text-align:right" value="1" maxlength="3" onFocus="select()"></th>
					</tr>
				</table>
			</div>
		</div>
	<!-- opus_design_grid(E) -->
	</div>
</div>
</form>
