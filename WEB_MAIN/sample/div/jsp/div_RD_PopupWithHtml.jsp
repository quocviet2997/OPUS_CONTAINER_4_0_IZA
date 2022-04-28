<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : div_RD_Popup.jsp
*@FileTitle  : RD Popup div sample page
*@author     : CLT
*@version    : 1.0
*@since      : 2015/01/22
=========================================================
--%>

<script type="text/javascript" src="/opuscntr/rpt/script/common_rd.js"></script>
<script language="javascript">
	function setupPage(){
		loadPage();
	}
</script>

<form>

<!-- popup_title_area(S) -->
<!-- Title and Navigation is stored in Database and called from it. Only in Popup page, title is hard-coded. -->
 <div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">

		<!-- page_title(S) -->
		<h2 class="page_title"><span>Title Area</span></h2>
		<!-- page_title(E) -->
		
		<!-- opus_design_btn (S) -->
		<!-- Only Retrieve button has class="btn_accent", the rest buttons have class="btn_normal"-->
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="title_btn_1" id="title_btn_1">title area btn 1</button><!--
		 --><button type="button" class="btn_normal" name="title_btn_2" id="title_btn_2">title area btn 2</button><!--
		 --><button type="button" class="btn_normal" name="btn_close" id="btn_close" OnClick="ComClosePopup()">Close</button>
		</div>
		<!-- opus_design_btn (E) -->
	</div>
	<!-- page_title_area(E) -->
</div>
<!-- popup_title_area(E) -->

<!-- popup_contens_area(S) -->
<!-- 
	If the page is "Popup" page, <div class="layer_popup_contents"> is needed.
	This <div> contains popup page design script.
 -->
<div class="layer_popup_contents">
	<!-- wrap_search_area(S) -->
	<div class="wrap_search">
		<!-- opus_design_inquiry(S) -->
		<div class="opus_design_inquiry">
		    <table>
		        <tbody>
					<tr>
						<th width="40">Text Box 1</th>
						<td width="120"><input type="text" style="width:100px;" class="input" value="" name="textbox1" id="textbox1"></td>
						<th width="40">Text Box 2</th>
						<td><input type="text" style="width:100px;" class="input" value="" name="textbox2" id="textbox2"></td>
					</tr> 
				</tbody>
			</table>
		</div>
		<!-- opus_design_inquiry(E) -->
	</div>
	<!-- wrap_search_area(E) -->
	
	<!-- wrap_result_area(S) -->
	<div class="wrap_result">
	
		<!-- opus_design_RD(S) -->
		<div class="opus_design_RD" style="position:relative;height:95%!important;">
			<script type="text/javascript">rdViewerObject();</script>
		</div>
		<!-- opus_design_RD(E) -->
		
		<div class="opus_design_inquiry">
    		<input type="text" name="htmlComponent1" id="htmlComponent1" value="HTML Component 1" style="width:150px;"/>
    		<input type="text" name="htmlComponent2" id="htmlComponent2" value="HTML Component 2" style="width:150px;"/>
    		<input type="text" name="htmlComponent3" id="htmlComponent3" value="HTML Component 3" style="width:150px;"/>
   		</div>
	</div>
	<!-- wrap_result_area(E) -->
</div>
<!-- popup_contens_area(E) -->
</form>