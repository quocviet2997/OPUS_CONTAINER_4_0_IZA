<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : div_Popup.jsp
*@FileTitle  : Popup div sample page
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
			<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!--
		 --><button type="button" class="btn_normal" name="btn_downexcel" id="btn_downexcel">Down Excel</button><!-- 
		  --><button type="button" class="btn_normal" name="btn_Close" 	id="btn_Close">Close</button>
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
</div>
<!-- popup_contens_area(E) -->
</form>