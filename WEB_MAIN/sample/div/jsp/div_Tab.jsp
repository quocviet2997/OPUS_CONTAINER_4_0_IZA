<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : div_Tab.jsp
*@FileTitle  : Tab div sample page
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
<div class="wrap_search_tab">
	<!-- opus_design_inquiry(S) -->
	<div class="opus_design_inquiry  opus_design_inquiryTab">
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
<!-- inquiry_area(S) -->
	<div class="opus_design_grid">
<!-- opus_design_tab(S) -->
    	<div class="opus_design_tab">
    		<script type="text/javascript">ComTabObject('tab1')</script>       
		</div>
	    
	    <div class="opus_design_inquiry" name="tabLayer" id="tabLayer">
			<!-- opus_design_grid(S) -->
			<div class="opus_design_grid">
				<script language="javascript">ComSheetObject('sheet1');</script>
			</div>
			<!-- opus_design_grid(E) -->
		</div>
	    
	    <div class="opus_design_inquiry" name="tabLayer" id="tabLayer" style="display:none">
			<!-- opus_design_inquiry(2) (S) -->
	<div class="opus_design_inquiry"> 
			<div class="opus_design_inquiry sm mar_btm_none">
						<table>
							<colgroup>
									<col width="120" />
									<col width="347" />
									<col width="50" />
									<col />
							</colgroup> 
							<tbody>
								<tr>
									<th>TEST</th>
									<td><input type="text" style="width:30px;text-transform:uppercase;" class="input" value="" name="ff_cust_cnt_cd" maxlength="2" dataformat="engup"  tabindex="61" id="ff_cust_cnt_cd" /><!--
										--><button type="button" id="btn_t7Ff0192" name="btn_t7Ff0192" class="input_seach_btn"></button /><!--
										--><input type="text" style="width:58px;" class="input" value="" name="ff_cust_seq" id="ff_cust_seq" maxlength="6" dataformat="num" tabindex="62" /><!--
										--><button type="button" class="btn_down_list" name="btn_t7FfMdmCustNm" id="btn_t7FfMdmCustNm"></button><!--
										--><input type="text" style="width:140px;" class="input2" value="" name="ff_cust_lgl_eng_nm" readonly="" id="ff_cust_lgl_eng_nm" /><!--
										--><input type="text" style="width:25px;" class="input2" value="" readonly="" name="ff_cust_tp" id="ff_cust_tp" /></td>
									<th>TEST No.</th>
									<td><input type="text" name="fmc_cd" maxlength="100" style="width:65px;" class="input" value="" tabindex="63" id="fmc_cd" /></td>
								</tr>
							</tbody>
						</table>
						<table class="line_bluedot"><tr><td></td></tr></table>  
						<table>
							<colgroup>
								<col width="120" />
								<col />
							</colgroup> 
							<tbody>
								<tr>
									<th>Name &amp; Address</th>
									<td><textarea cols="35" rows="5" style="width:345px; height:154px; resize:none;font-family:Courier New;font-size:15px;text-indent:0px;" class="textarea_img5" wrap="physical" dataformat="exceptengdn" onblur="" name="ff_cust_nm" tabindex="64">TEST</textarea>
									</td>
								</tr>
							</tbody>
						</table>						
					</div>	
	</div>
	<!-- opus_design_inquiry(2) (E) -->
		</div>
	</div>
</div>
<!-- wrap_result_area(E) -->
</form>