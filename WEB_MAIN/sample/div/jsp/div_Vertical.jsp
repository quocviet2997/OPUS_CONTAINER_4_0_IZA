<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : div_Vertical.jsp
*@FileTitle  : Vertical div sample page
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
		<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button>
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

	<!-- layout_wrap(S) -->
	<div class="layout_wrap">
		<!-- 
			About Vertical 
		
			To use vertical, depending on the number of areas, add number to <div> classes.
				
				1. For example, to make three vertical areas, <div> class is "layout_vertical_2".
				
				ex) <div class="layout_vertical_3" style="width:33%">
				
				2. For a gap among areas, add "pad_rgt_(n) (or left_(n)).
				
				ex)  <div class="layout_vertical_3 pad_left_8" style="width:33%">
		
		 -->
	    <div class="layout_vertical_2" style="width:50%">
		    <div class="opus_design_btn">
				<button type="button" class="btn_normal" name="sheet1_downExcel" id="sheet1_downExcel">Down Excel</button>
			</div>
	        <!-- opus_design_grid(S) -->
	        <div class="opus_design_grid clear">
	            <script type="text/javascript">ComSheetObject('sheet1');</script>
	        </div>
	        <!-- opus_design_grid(E) -->
	    </div>
	    <div class="layout_vertical_2 pad_left_8" style="width:50%">
	    	<div class="opus_design_btn">
				<button type="button" class="btn_normal" name="sheet2_downExcel" id="sheet2_downExcel">Down Excel</button>
			</div>
	        <!-- opus_design_grid(S) -->
	        <div class="opus_design_grid clear">
	            <script type="text/javascript">ComSheetObject('sheet2');</script>
	        </div>
	        <!-- opus_design_grid(E) -->
	    </div>
	</div>
	<!-- layout_wrap(E) -->
</div>
<!-- wrap_result_area(E) -->
</form>