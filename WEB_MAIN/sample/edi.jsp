<%--
=========================================================
*Copyright(c) 2015 CyberLogitec. All Rights Reserved.
*@FileName   : ESM_BKG_0000_1.jsp
*@FileTitle  :  
*@author     : KYOUNGIL MOON
*@version    : 1.0 
*@since      : 2015/07/03
=========================================================
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.framework.core.controller.util.WebKeys"%>
<%@ page import="com.clt.framework.core.view.template.Screen"%>
<%@ page import="com.clt.apps.opus.esm.bkg.bookingcommon.bookingutil.event.EsmBookingUtilEvent"%>
<%@ page import="org.apache.log4j.Logger" %>
<%@ page import="com.clt.framework.core.controller.DefaultViewAdapter"%>

<script language="javascript" type="text/javascript" src="../js/ibsheet/ibsheet.js"></script>
<script language="javascript" type="text/javascript" src="../style/js/jquery-1.11.0.min.js"></script>
<script language="javascript" type="text/javascript" src="../js/common/CoObject.js?version=U12"></script>
<SCRIPT LANGUAGE="javascript" TYPE="text/javascript" SRC="../js/common/CoCommon.js"></SCRIPT>
<SCRIPT LANGUAGE="javascript"  TYPE="text/javascript" SRC="../js/common/CoFormControl.js"></SCRIPT>
<script language="javascript" type="text/javascript" src="../js/common/IBSheetInfo.js?version=multi"></script>

<script type="text/javascript">

var sheetObjects = new Array();
var sheetCnt = 0;

function setSheetObject(sheet_obj) {
	sheetObjects[sheetCnt++] = sheet_obj;
}

//버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick = processButtonClick;

// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
function processButtonClick() {
	var formObject = document.form;
	try {
		var srcName = window.event.srcElement.getAttribute("name");
		switch (srcName) {
			case "btn_activate":
				doActionIBSheet(sheetObjects[0],formObject, COMMAND01);
				break;
		}
	} catch (e) {
		console.log(e);
	}
}
	
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg = false;
	switch (sAction) {
		case COMMAND01:
			$("#error").val("");
			var sXml = sheetObj.GetSaveData("../ESM_BKG_0228GS.do", FormQueryString(formObj));
			if(ComGetEtcData(sXml, "TRANS_RESULT_KEY") == 'F'){
				var rmsg=ComGetEtcData(sXml,"Exception").split("<||>");
				$("#error").val(sXml.split('<||>')[1].replace(' # Error Type : ','').replace('(null)',''));
			}else if (ComGetEtcData(sXml,"TRANS_RESULT_KEY") == "S"){
				alert("Data was saved successfully.")
			}
			break;
	}
}

</script>

<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" value="11">
<!-- page_title_area(S) -->
<div class="page_title_area clear">
	<!-- page_location(S) -->
	<div class="location">
		<!-- location 내용 동적생성 (별도 코딩 불필요) -->
		<span id="navigation"></span>
	</div>
</div>
<div class="wrap_search">
	<div class="opus_design_inquiry wFit">
	<table>
		<colgroup>
			<col width="40" />
			<col width="40" />
		</colgroup>
		<tr>
			<th>MSG</th>
			<td><textarea rows="30" cols="150" id="msg" name="msg"></textarea></td>
			<td>
			<button type="button" class="btn_etc" name="btn_activate" id="btn_activate">Reactivate</button>
			<input type="checkbox" id="commit" name="commit" />
			</td>
		</tr>
		<tr>
			<th>Error MSG</th>
			<td><textarea rows="10" cols="150" id="error" name="error"></textarea></td>
		</tr>
	</table>
	</div>
</div>
<script type="text/javascript">ComSheetObject('sheet1');</script>
</form>