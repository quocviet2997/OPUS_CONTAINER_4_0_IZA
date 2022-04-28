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
<!-- layout_wrap(S) -->
	<div class="layout_wrap">
		<!-- layout_vertical_2(S) -->
		<!-- 
			About flex vertical 

			To use flex vertical, there are two kinds of <div> classes.
				
				1. <div class="layout_flex_flex" style="padding-left(or right):(n)px">
				
					This part is located (n) px away from left(or right).
				
					It is expanded by the width of the web browser.
				
				2. <div class="layout_flex_fixed" style="width:(m)px;(float:right!important)">
				
					The width of the part is fixed by (m) px.
				
					To make this <div> fixed to the right side, put float:right!important in style and to the left side, omit it.
				
				3. There is a gab between two <div>s above.
				
					So, "n - m = 8" is needed.
		 -->
		<div class="layout_flex_flex" style="padding-right:668px">
			<div class="opus_design_grid">
				<script type="text/javascript">ComSheetObject('sheet1');</script>
			</div>
		</div>
		<!-- layout_vertical_2(S) -->
		<div class="layout_flex_fixed" style="width:660px;float:right!important">
			<div class="opus_design_inquiry">
				<table>
					<tbody>
						<tr><td colspan="2"><h3 class="title_design">Basic Information</h3></td></tr>
						<tr>
							<th>Company Name</th>
							<td><input type="text" name="mnr_prnr_lgl_eng_nm" id="mnr_prnr_lgl_eng_nm" style="width:140px" title="" class="input2" style="ime-mode:disabled" maxlength="100">
							</td>
							<th >Customer</th>
							<td colspan="3"><!-- 
							 --><input type="text" name="mnr_prnr_cnt_cd" id="mnr_prnr_cnt_cd" style="width:35px" maxlength="2" class="input1" dataformat="engup"><!-- 
							  --><input type="text" name="mnr_prnr_seq" id="mnr_prnr_seq" style="width:55px" value="" class="input1" maxlength="9" dataformat="num"><!-- 
							   --><button type="button" name="btn_customer" id="btn_customer" class="input_seach_btn"></button><!-- 
							    --><input type="text" name="mnr_prnr_cnt_nm" id="mnr_prnr_cnt_nm" style="width:151px" value="" class="input2" readonly title="">
							</td>
						</tr>
						<tr>
							<th width="40">Buyer Type</th>
							<td width="80"><script type="text/javascript">ComComboObject('combo_mnr_prnr_knd_cd',2, 140 , 1, 1,0,false,1);</script><!-- 
							 --><input type="hidden" name="mnr_prnr_knd_cd" id="mnr_prnr_knd_cd"></td>
							<th width="40">Buyer Detail</th>
							<td width="50"><script type="text/javascript">ComComboObject('combo_mnr_prnr_knd_dtl_cd',2, 100 , 1, 1,0,false,1);</script><!-- 
							 --><input type="hidden" name="mnr_prnr_knd_dtl_cd" id="mnr_prnr_knd_dtl_cd"></td>
							<th width="40">Status</th>
							<td><input type="text" name="mnr_prnr_sts_nm" id="mnr_prnr_sts_nm" value="" class="input2" readonly style="width:105px"></td>
						</tr>
						<tr>
							<th>Business  Category</th>
							<td><input name="bzct_nm" id="bzct_nm" type="text" style="width:140px" value="" class="input" style="ime-mode:disabled" maxlength="200" ></td>
							<th style="padding-left: 9px;">Business Type</th>
							<td><input name="bztp_nm" id="bztp_nm" type="text" style="width:100px" value="" class="input" style="ime-mode:disabled" maxlength="100"></td>
							<th>Employee</th>
							<td><input type="text"  name="empe_knt" id="empe_knt"  style="width:105px;text-align:right" value="" class="input" dataformat="int"  maxlength="5"></td>
						</tr>
						<tr>
							<th>Owner</th>
							<td><input type="text"  name="ownr_nm" id="ownr_nm" style="width:140px;text-align:left" value="" class="input" style="ime-mode:disabled" maxlength="100"></td>
							<th>Register No.</th>
							<td><input type="text"  name="biz_rgst_no" id="biz_rgst_no" style="width:100px;text-align:left" value="" class="input" style="ime-mode:disabled" maxlength="30"></td>
							<th>Zip/Post</th>
							<td><input type="text"  name="zip_cd" id="zip_cd" style="width:105px;text-align:left" value="" class="input" style="ime-mode:disabled" maxlength="10"></td>
						</tr>
						<tr>
							<th>P.I.C Tel.</th>
							<td><input type="text" name="phn_no" id="phn_no" style="width:140px;text-align:left" value="" class="input" style="ime-mode:disabled" maxLength="20"></td>
							<th>P.I.C Fax</th>
							<td><input type="text" name="fax_no" id="fax_no" style="width:100px;text-align:left" value="" class="input" style="ime-mode:disabled" maxLength="20"></td>
							<th>P.I.C Email</th>
							<td><input type="text" name="mnr_prnr_eml" id="mnr_prnr_eml" style="width:105px;text-align:left" value="" class="input" style="ime-mode:disabled" maxLength="200"></td>
						</tr>
						<tr>
							<th>Bill To.</th>
							<td colspan="5"><input type="text" name="mnr_bil_to_nm" id="mnr_bil_to_nm" style="width:539px;" value="" class="input" style="ime-mode:disabled" maxLength="200"></td>
						</tr>
						<tr>
							<th>Address</th>
							<td colspan="5"><input type="text" name="mnr_prnr_addr" id="mnr_prnr_addr" style="width:539px;" value="" class="input" style="ime-mode:disabled" maxLength="200"></td>
						</tr>
						<tr>
							<th>Effective</th>  
							<td colspan="2"><!-- 
							 --><input type="text"  style="width:100px;text-align:center" class="input" name="eff_dt" id="eff_dt" dataformat="ymd" maxLength="10">~<!-- 
							  --> <input type="text"  style="width:100px;text-align:center" class="input" name="exp_dt" id="exp_dt" dataformat="ymd" maxLength="10"><!-- 
							   --><button type="button" class="calendar ir" name="btn_calendar2" id="btn_calendar2"></button>										
							</td>
							<td><input type="checkbox" name="mnr_shop_flg" id="mnr_shop_flg"><label for="mnr_shop_flg">M&R Shop</label></td>
						</tr>
					</tbody>
				</table>
				<table>
					<tbody>
						<tr>
							<td colspan="2"><h3 class="title_design">Account Information of Control Office( Office Account)</h3></td>
						</tr>
						<tr>
							<th width="70">Bank Name</th>
							<td width="170"><input type="text" name="bank_nm" id="bank_nm" style="width:220px" value="" class="input" style="ime-mode:disabled" maxLength="50"></td>
							<th width="40">Deposit Info</th>
							<td>
								<script type="text/javascript">ComComboObject('combo_dpt_desc',2, 200 , 1, 0,0,false,1);</script>
								<input type="hidden" name="dpt_desc" id="dpt_desc">
							</td>
						</tr>
						<tr>
							<th>Account No.</th>
							<td><input type="text" name="bank_acct_no" id="bank_acct_no" style="width:220px" value="" class="input" style="ime-mode:disabled" maxLength="30"></td>
							<th rowspan="2">Remark(s)</th>
							<td rowspan="2"><textarea name="mnr_prnr_rmk" id="mnr_prnr_rmk" style="width:200px;height:57px;"  style="ime-mode:disabled" maxLength="4000"></textarea></td>
						</tr>
						<tr> 
							<th >Swift Code</th>
							<td><input type="text" name="mnr_swift_no" id="mnr_swift_no" style="width:220px;ime-mode:disabled" value="" class="input" maxLength="50"></td>
						</tr>
						<tr>
							<th>Pay Term</th> 
							<td><input type="text" style="width:40px;text-align:right" name="pay_term_dys" id="pay_term_dys" value="" class="input" maxlength="3" dataformat="num"></td>
							<th>P.Method</th>
							<td  colspan="2"> 
								<script type="text/javascript">ComComboObject('combo_pay_mzd_cd',2, 110 , 1, 0,0,false,1);</script>
								<input type="hidden" name="pay_mzd_cd" id="pay_mzd_cd">
							</td> 
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>

<!-- wrap_result_area(E) -->
</form>