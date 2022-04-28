<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : div_Default.jsp
*@FileTitle  : Default div sample page
*@author     : CLT
*@version    : 1.0
*@since      : 2015/01/22
=========================================================
--%>

<script language="javascript">
	function setupPage(){
		loadPage();
	}
</script>

<form>

<!-- page_title_area(S) -->
<!-- Title and Navigation is stored in Database and called from it. Only in Popup page, title is hard-coded. -->
<div class="page_title_area clear">

	<!-- page_title(S) -->
	<h2 class="page_title"><button type="button"><span>Title Area</span></button></h2>
	<!-- page_title(E) -->
	
	<!-- opus_design_btn (S) -->
	<!-- Only Retrieve button has class="btn_accent", the rest buttons have class="btn_normal"-->
	<div class="opus_design_btn">
		<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!-- 
	 --><button type="button" class="btn_normal" name="btn_downexcel" id="btn_downexcel">Down Excel</button>
	</div>
	<!-- opus_design_btn (E) -->

	<!-- page_location(S) -->
	<div class="location">	
		<span>Navigation Area</span>
	</div>
	<!-- page_location(E) -->
</div>
<!-- page_title_area(E) -->

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

	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid">
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_grid_btn" id="btn_grid_btn">grid button position</button>
		</div>
		<script language="javascript">ComSheetObject('sheet1');</script>
	</div>
	<!-- opus_design_grid(E) -->
	
</div>
<!-- wrap_result_area(E) -->
</form>