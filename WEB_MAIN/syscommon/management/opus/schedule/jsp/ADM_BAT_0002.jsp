<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : ADM_BAT_0002.jsp
*@FileTitle  : Batch Job Schedule Log
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================
--%>
<script type="text/javascript">

	function setupPage() {
		loadPage();
		form.dateFrom.value = ComGetDateAdd(null, "D", 0);
		form.dateTo.value = ComGetDateAdd(null, "D", 0);
	}
	function popCal(calObj) {
		//달력 열기
		var cal = new ComCalendar();
		cal.select(calObj, 'yyyy-MM-dd');
	}
</script>
<form name="form" onkeyup="ComKeyEnter('lengthnextfocus');">
<input type="hidden" name="f_cmd">

	<div class="page_title_area clear">
	    <h2 class="page_title"><button type="button"><span id="title"></span></button></h2>
	    <div class="opus_design_btn"><!-- 
			 --><button type="button" class="btn_accent" name="btn_Retrieve" id="btn_Retrieve">Retrieve</button><!-- 
			 --><button type="button" class="btn_normal" name="btn_DownExcel" id="btn_DownExcel">Down Excel</button><!-- 
	     --></div>
	    <div class="location">
	        <span id="navigation"></span>
	    </div>
	</div>

	<div class="wrap_search">
		<div class="opus_design_inquiry">
		    <table>
		        <tbody>
					<tr>
						<th width="40">Job ID</th>
						<td width="120"><input name="skd_id" dataformat="num" type="text" style="width:100px;" class="input"></td>
						<th width="40">Job Type</th>
						<td width="120"><select name="skd_tp_cd" style="width:100px;" class="input1">
							<option value="" selected>ALL</option>
							<option value="D">Direct</option>
							<option value="S">Scheduled</option>
							</select></td>
						<th width="40">Status</th>
						<td><select name="sts_cd" style="width:80px;" class="input1">
							<option value=""selected>All</option>
							<option value="1">RUNNING</option>
							<option value="3">STARTING</option>
							<option value="4">SUCCESS</option>
							<option value="5">FAILURE</option>
							<option value="6">TERMINATED</option>
							<option value="7">ON_ICE</option>
							<option value="8">INACTIVE</option>
							<option value="9">ACTIVATED</option>
							<option value="10">RESTART</option>
							<option value="11">ON_HOLD</option>
							<option value="12">QUE_WAIT</option>
							</select></td>
					</tr>
					<tr>
						<th>Program No.</th>
						<td><input name="pgm_no" dataformat="engup" type="text" style="width:100px;" class="input"></td>
						<th>Server</th>
						<td><select name="machine" style="width:100px;" class="input1">
							<option value="L">LIVE</option>
							<option value="T">DEV</option>
						</select></td>
						<th>Execute Date</th>
						<td><input type="text" name="dateFrom" dataformat="ymd" maxlength="8" size="10"><!--
							--><button type="button" class="calendar" onClick="popCal(dateFrom);"></button><select name="hourFrom" style="width:60px;" class="input1">
							<option value="00" selected>00</option>
							<option value="01">01</option>
							<option value="02">02</option>
							<option value="03">03</option>
							<option value="04">04</option>
							<option value="05">05</option>
							<option value="06">06</option>
							<option value="07">07</option>
							<option value="08">08</option>
							<option value="09">09</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
							<option value="13">13</option>
							<option value="14">14</option>
							<option value="15">15</option>
							<option value="16">16</option>
							<option value="17">17</option>
							<option value="18">18</option>
							<option value="19">19</option>
							<option value="20">20</option>
							<option value="21">21</option>
							<option value="22">22</option>
							<option value="23">23</option>
							</select>~ <input type="text" name="dateTo" dataformat="ymd" maxlength="8" size="10"><button type="button" class="calendar" onClick="popCal(dateTo);"></button><select name="hourTo" style="width:60px;" class="input1">
							<option value="00">01</option>
							<option value="01">02</option>
							<option value="02">03</option>
							<option value="03">04</option>
							<option value="04">05</option>
							<option value="05">06</option>
							<option value="06">07</option>
							<option value="07">08</option>
							<option value="08">09</option>
							<option value="09">10</option>
							<option value="10">11</option>
							<option value="11">12</option>
							<option value="12">13</option>
							<option value="13">14</option>
							<option value="14">15</option>
							<option value="15">16</option>
							<option value="16">17</option>
							<option value="17">18</option>
							<option value="18">19</option>
							<option value="19">20</option>
							<option value="20">21</option>
							<option value="21">22</option>
							<option value="22">23</option>
							<option value="23" selected>24</option>
							</select>
						</td>
				</tbody>
			</table>
		</div>
	</div>	

	<div class="wrap_result">
		<div class="opus_design_grid">
			<script type="text/javascript">ComSheetObject('sheet1');</script>
			<table class="grid_2">
				<tr>
					<th>Log</th>
					<td><iframe style="border:1px solid #ccc" name="log_ifr" width="100%" height="220px"></iframe></td>
				</tr>
			</table>
			
		</div>
	</div>	
<input type="hidden" name="filepath">
<input type="hidden" name="readpos" value="0" /> 
<input type="hidden" name="command" value="last" /> 
<input type="hidden" name="readbyte" value="100000" />

</form>
