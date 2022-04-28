<!-- 다국어 관련 추가 부분 -->
<%@ page import="com.clt.framework.support.view.signon.web.SignOnFilter" %>
<html>

<%
/* 다국어 지원 관련
* 20120202 added bu JUN SUNG, KIM
* 개발기 적용 위해서 DEFAULT 값이면 공백처리 해야함.
* 기존 업무 script 를 놔두고 sample 쪽만 적용 시키기 위해서.
*/
String strLangType = ("_"+((String)request.getSession().getAttribute(SignOnFilter.FORM_LANG_TP_CD_TYPE)).toLowerCase());
if("_eng".equals(strLangType) || "_".equals(strLangType)){
	strLangType = "";
}
%>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link href="css/opus_contents.css" rel="stylesheet" type="text/css">

<SCRIPT LANGUAGE="javascript">
	function moduleMainPage(){
		var module = parent.location.toString();
		//alert(module);

		if( module != null && module != '' )
		{
			var js_path = "apps/opus";			
			if( 
				(module.split('?').length == 2 ) && 
				( module.split('?')[1].split('=').length == 2 )
			)
			{
				var param = module.split('?')[1].split('=')[1].split('_');
				//apps/opus/esm/agt/agtaudit/agtaudit/jsp/ESM_AGT_010.js
				//alert("param[0] :"+param[0]+" || param[1] : "+param[1] + " || param[2] : "+param[2]);
				for( var i=0; i<param.length-1; i++)
				{
					
					js_path += 	"/" + param[i].toLowerCase();
					//alert("i = "+i+" || "+ js_path + "/Co" + param[i].charAt(0) + param[i].substr(1).toLowerCase());
					parent.axon_assembler.include(js_path + "/Co" + param[i].charAt(0) 
							+ param[i].substr(1).toLowerCase());
				}
			}
		}
				
		if(module.indexOf("ESM_BKG_M001") > -1 || module.indexOf("ESD_PRD_M001") > -1 || 
			module.indexOf("ESD_SCE_M001") > -1 || module.indexOf("ESD_TES_M001") > -1 || 
			module.indexOf("ESD_TRS_M001") > -1 || module.indexOf("FNS_INV_M001") > -1 || 
			module.indexOf("EES_CTM_M001") > -1 || module.indexOf("ESD_EAS_M001") > -1 || 
			module.indexOf("ESD_TPB_M001") > -1 || module.indexOf("ESD_LEA_M001") > -1 || 
			module.indexOf("EES_DMT_M001") > -1){
			
			document.write('<img src="/opuscntr/img/sub_1.jpg" width="970" height="490" alt="" border="0">');
			
		}else if(module.indexOf("ESM_SAQ_M001") > -1 || module.indexOf("ESM_SPC_M001") > -1 || 
			module.indexOf("ESM_PRI_M001") > -1 || module.indexOf("ESM_COA_M001") > -1 || 
			module.indexOf("ESM_BSA_M001") > -1){
			
			document.write('<img src="/opuscntr/img/sub_2.jpg" width="970" height="490" alt="" border="0">');
			
		}else if(module.indexOf("EES_EQR_M001") > -1 || module.indexOf("EES_MST_M001") > -1 || 
			module.indexOf("EES_CIM_M001") > -1 || module.indexOf("EES_CGM_M001") > -1 || 
			module.indexOf("EES_CGM_M019") > -1 || module.indexOf("EES_LSE_M001") > -1 || 
			module.indexOf("EES_MNR_M001") > -1){
			
			document.write('<img src="/opuscntr/img/sub_3.jpg" width="970" height="490" alt="" border="0">');
			
		}else if(module.indexOf("VOP_OPF_M001") > -1 || module.indexOf("VOP_PSO_M001") > -1 || 
			module.indexOf("VOP_SCG_M001") > -1 || module.indexOf("VOP_VSK_M001") > -1){
			
			document.write('<img src="/opuscntr/img/sub_4.jpg" width="970" height="490" alt="" border="0">');
			
		}else if(module.indexOf("CPS_CNI_M001") > -1 || module.indexOf("CPS_GEM_M001") > -1 || 
			module.indexOf("ESD_SPE_M001") > -1 || module.indexOf("ESM_FMS_M001") > -1 || 
			module.indexOf("ESM_AGT_M001") > -1 || module.indexOf("FNS_JOO_M001") > -1 || 
			module.indexOf("FNS_TOT_M001") > -1 || module.indexOf("ESM_BIS_M001") > -1){
			
			document.write('<img src="/opuscntr/img/sub_5.jpg" width="970" height="490" alt="" border="0">');
			
		}else if(module.indexOf("OPS_SPC_M001") > -1){
			
			document.write('<img src="/opuscntr/img/sub_7.jpg" width="970" height="490" alt="" border="0">');
				
		}else if(module.indexOf("OPS_KBK_M0001") > -1){
			
			document.write('<img src="/opuscntr/img/sub_8.jpg" width="970" height="490" alt="" border="0">');
				
		}else{
		
			document.write('<img src="/opuscntr/img/sub_6.jpg" width="970" height="490" alt="" border="0">');
			
		}
	}

</SCRIPT>
<!-- 
	2012 01 26 added bu Jun Sung, KIM
	CoMessage 를 동적으로 생성 시키려 했으나 스크립트 오류가 나서
	일단 기본 페이지에서 session 에 넣어둔 lang 값을 가져와서 생성 시키는것으로 만듬.
 -->
<SCRIPT LANGUAGE="javascript" SRC="js/CoMessage<%=strLangType%>.js" TYPE="text/javascript"></SCRIPT>

</head>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr><td style="height:45;"></td></tr>
		<tr>
			<td align="center" valign="middle">
			<table width="970" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td>
						<SCRIPT LANGUAGE="javascript">
	     					moduleMainPage();
						</SCRIPT>
					</td>
				</tr>
			</table>
			</td>
		</tr>
	</table>
</body>
</html>