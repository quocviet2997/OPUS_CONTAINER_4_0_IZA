<!--==============================================================================
'주  시 스 템 : 
'서브  시스템 : 샘플
'프로그램 ID  : commoncode.jsp
'프로그램 명  : javascript 샘플 구성
'프로그램개요 : javascript 샘플 구성 화면 이벤트들을 수행한다.
'작   성   자 : 장회수 /2006.09.08
'작   성   일 : 
==================================================================================
'수정자/수정일 : 
'수정사유/내역 : 
==============================================================================-->
<html>
<head>
<title>팝업 샘플</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script language="JavaScript" src="script/CoMessage_ko_KR.js"></script>
<script language="JavaScript" src="script/CoFormControl.js"></script>
<script language="JavaScript" src="script/CoPop.js"></script>
<script language="javascript"
	src="sys/common/commoncodepop/CodePopupSample.js"></script>
<style type="text/css">
<!--
.functionName {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 12pt;
	font-style: normal;
	font-weight: bold;
	color: #0066CC;
}
td {
	font-size: 11pt;
	line-height: 150%;
}
.td-title {
	background-color: #F1D1C9;
}
-->
</style>
</head>
<body onLoad="">
<form name="theForm" style="width:800;"><br>
<h1>OPUS Sample</h1>
<br>
<br>

<table width="100%" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td valign="top" height="475">
		<h3>▶ 공통코드 사용 예제</h3>

	<!-- 
		<table width="100%" border="0" cellspacing="1" cellpadding="2"
			bgcolor="#D0B0AC">
			<td colspan="4" bgcolor="#F1D1C9"><b>sample 1). SELECT BOX
			생성 </b></td>
			<tr>
				<td width="80" bgcolor="#F5E7C5" align="center">입력</td>
				<td width="300" bgcolor="#EFEFEF"><input name="sp1_txt1"
					type="text"> <input name="sp1_txt2" type="text"> <input
					name="sp1_txt3" type="text"> <input name="sp1_btn"
					type="button" class="button" value="클릭"> <input
					type="button" onclick="reset()" value="지우기"></td>
				<td width="80" bgcolor="#F5E7C5" align="center">결과</td>
				<td width="140" bgcolor="#EFEFEF">&nbsp;</td>
			</tr>
			<tr>
				<td bgcolor="#FFFFFF" align="left" colspan="4">- 공통 코드 SELECT <br>
				</td>
			</tr>
			<tr>
				<td bgcolor="#FFFFFF" align="left" colspan="4"><pre>
					예).
            	</pre></td>
			</tr>
		</table>
		--> <br>



		<table width="100%" border="0" cellspacing="1" cellpadding="2"
			bgcolor="#D0B0AC">
			<td colspan="4" bgcolor="#F1D1C9"><b>공통 코드 팝업샘플 </b></td>
			<tr>
				<td width="80" bgcolor="#F5E7C5" align="center">입력</td>
				<td width="300" bgcolor="#EFEFEF">
				group cd : <input name="sp2_txt1"	type="text"> <br>
				code value : <input name="sp2_txt2" type="text"> <br>
				code display name : <input	name="sp2_txt3" type="text"><br> 
				code_desc : <input name="sp2_txt4"	type="text"><br>
				
				<input name="sp2_btn" type="button"	class="button" value="클릭"> 
				<input type="button"	onclick="reset()" value="지우기"></td>
			</tr>
			<tr>
				<td bgcolor="#FFFFFF" align="left" colspan="4">- 공통 팝업창 호출 <br>
				@param : url - 호출될 팝업 주소 <br>
				@param : FORM - form 명 <br>
				@param : input parameter - 결과를 수행하여 표시할 form control list [& 구분자로
				연결] <br>
				@param : output parameters - 결과를 수행하여 표시할 form control list [comma로
				구분]<br><br><br><br>
				url, form명 은 필수 입니다.<br>
				input parameter는 group code 단 하나의 값만 받아 들이도록 코드 팝업에서 고정되어있습니다.<br>
				ouput parameter는 code popup창에서 보시는 것처럼  code id, code 값, 코드 값 명, 코드 순서가 차례대로 <br>
				리턴 되도록 정의 되어있습니다. ( 개발하시는 화면에서 이 네개의 컨트롤에 한해서 자유롭게 조절하실수 있으나<br>
				순서는 맞춰 주셔야 합니다. )<br>
				<br>

				</td>
			</tr>
			<tr>
				<td bgcolor="#FFFFFF" align="left" colspan="4"><pre>
예). 공통 코드 팝업 호출 함수 

 rtnObjPopup('com.clt.syscommon.codepop.CodePopupJSP.do', //url
			'width=450,height=550,left=400,top=100,menubar=0,status=0,scrollbars=0,resizable=0', // 팝업창 사이즈에 따른 조정
			'theForm', // form 명칭 
			'group_cd=' + sp2_txt1.value, // inputparameter (명칭은 group_cd로 필수 ) 
			'sp2_txt1','sp2_txt2', 'sp2_txt3','sp2_txt4'); // 값을 입력 받을 화면의 컨트롤 명 (즉, return value setting control ) 
               		 			
            	</pre></td>
			</tr>
		</table>

		</td>
	</tr>
</table>
</form>
</body>
</html>
