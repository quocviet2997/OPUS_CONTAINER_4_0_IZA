<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%
	GeneralEventResponse eventResponse = (GeneralEventResponse)request.getAttribute("EventResponse");
%>
<form name="form" action="/opuscntr/MailResend.do">

<div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
	    <!-- page_title(S) -->
	    <!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
	    <h2 class="page_title"><span>Mail ReSend</span></h2>
	    <!-- page_title(E) -->
		 <!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" name="btn2_Resend_Mail"  id="btn2_Resend_Mail" onclick="form.submit()">ReSend</button>
		</div>
		<!-- opus_design_btn(E) -->
	</div>
	<!-- page_title_area(S) -->
</div>

<div class="layer_popup_contents">
	<div class="opus_design_inquiry">
		<table>
		<colgroup>
			<col width="20%" />
			<col width="*" />
			<tbody>
				<tr class="h23">
					<th>MailKey</th>
					<td><input type="text" class="input" name="MailKey" style="width:90%"></td>
				</tr>
				<tr class="h23">
					<th>FileKey</th>
					<td><input type="text" class="input" name="FileKey" style="width:90%"></td>
				</tr>				
			</tbody>
		</table>
	</div>
</div>

</form>	
