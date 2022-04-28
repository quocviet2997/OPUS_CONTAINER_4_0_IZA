<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : rdReport.jsp
*@FileTitle  : Report Common
*@author     : CLT
*@version    : 1.0
*@since      : 2014/09/11
=========================================================*/
%>
<script language="javascript" src="/opuscntr/rpt/script/common_rd.js"></script>
<script language="javascript">
function setupPage(){
	rdOpen();
}
</script>
<form name="form">
<div class="layer_popup_title">	
	<div class="page_title_area clear">
		<h2 class="page_title"><span>Common Report</span></h2>
		
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button>
		</div>
	</div>
</div>

<div class="layer_popup_contents">
	<div class="wrap_result">
		<div class="opus_design_RD"> 
			<script type="text/javascript">rdViewerObject();</script>
	    </div>
	</div>
</div>
</form>