<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : upperrole.jsp
*@FileTitle  : Search Role POP-UP
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================
--%>
<script language="javascript">
  function setupPage(){
      loadPage();
 	 }
</script>
<form method="post" name="form" onSubmit="return false;">
<input	type="hidden" name="f_cmd"> 
<input type="hidden" name="iPage">  

<!-- popup_title_area(S) -->
 <div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<!-- page_title(S) -->
		<h2 class="page_title"><span>Role Code</span></h2>
		<!-- page_title(E) -->
			
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_Retrieve"   	id="btn_Retrieve">Retrieve</button>
	    	<button type="button" class="btn_normal" name="btn_confirm" 	id="btn_confirm">Confirm</button>
			<button type="button" class="btn_normal" name="btn_close"   	id="btn_close">Close</button>
		</div>
		<!-- opus_design_btn(E) -->	
	</div>
	<!-- page_title_area(E) -->
</div>
<!-- popup_title_area(E) -->

<div class="layer_popup_contents">
	<!-- inquiry_area(S) -->
	<div class="wrap_search">
	<div class="opus_design_inquiry">   <!-- no TAB  -->
		<table> 
			<colgroup>
				<col width="2%" />
				<col width="10%" />
				<col width="2%" />
				<col width="*" />
			</colgroup>
			<tbody>
				<tr>
					<th>Role Code</th>
					<td><input type="text" style="width:70;" class="input" required fullfill name="role_cd" maxlength="4" style="ime-mode:disabled"></td>
					<th>Role Name</th>
					<td><input type="text" style="width:150;" class="input" value="" name="role_nm" maxlength="30" ></td>
				</tr>
			</tbody>
		</table>
	</div>
	</div>
	<!-- inquiry_area(E) -->
	<div class="wrap_result">
	<!-- opus_design_grid(S) -->
	<div class="opus_design_grid" >
		<script language="javascript">ComSheetObject('sheet1');</script>
	</div>
	<!-- opus_design_grid(E) -->
	</div>
			
</form>