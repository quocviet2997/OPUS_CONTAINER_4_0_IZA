<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.bizcommon.util.BizComUtil"%>
<% /* ==============================================================================
'주  시 스 템 : 
'서브  시스템 : 샘플
'프로그램 ID  : PopupSample.html
'프로그램 명  : javascript 샘플 구성
'프로그램개요 : javascript 샘플 구성 화면 이벤트들을 수행한다.
'작   성   자 : 박상률/2006.08.03
'작   성   일 : 
==================================================================================
'수정자/수정일 : JUN SUNG, KIM / 2012-02-03
'수정사유/내역 : OPUS 개발팀 요청 / MDM 모듈을 통해서 호출 되는 Pop up 은 특정 param 을 넘겨서 
					공통 pop up 에서 delete flag 값을 가지고 조회 가능 해지게 하는걸 테스트 한다.
==============================================================================
*/
%>
<html>
<head>
<title>팝업 샘플</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoMessage.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoCommon.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoFormControl.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoPopup.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoCalendar.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoObject.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/IBSheetInfo.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoWait.js"></script>
<script language="javascript" type="text/javascript" src="/opuscntr/js/CoBiz.js"></script>
<script language="javascript" type="text/javascript" src="PopupSample.js"></script>

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

a:link {text-decoration: none;color:#333333}
a:visited {text-decoration: none;color:#333333}
a:active {text-decoration: none;color:#F8352C}
a:hover {text-decoration:none;color:#F8352C;}

-->
</style>
</head>
<body style="margin-left:10">
<form name="theForm" style="width:800;">
<A name=TOP>
  <br><h1>Hanjin Popup Sample</h1><br><br>
  
  <BR><HR>
  <B>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;※ BIZ 공통 목록 <BR>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_011">01. Commodity (COM_ENS_011)(완료) mdm param ( 개발 완료 )<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_021">02. Contract (COM_ENS_021)(완료) mdm param ( 개발 완료 )<BR></A>

  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_041">04. Customer (COM_ENS_041)(완료) mdm param ( 개발 완료 )<BR></A> 
  <!-- &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_042">04. Actual Customer (COM_ENS_042)(완료)<BR></A>-->
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_051">05. Location (COM_ENS_051)(완료) mdm param ( 개발 완료 )<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_061">06. Node (COM_ENS_061)(완료) mdm param ( 개발 완료 )<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_071">07. Office (COM_ENS_071)(완료) mdm param ( 개발 완료 )<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_081">08. Lane (COM_ENS_081)(완료) mdm param ( 개발 완료 )<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_091">09-01. Staff (COM_ENS_091)(완료)<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_092">09-02. Notified Subscriber (COM_ENS_092)(완료)<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_0A1">10. Vessel (COM_ENS_0A1)(완료) mdm param ( 개발 완료 )<BR></A>

  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_0B2">11. VVD (COM_ENS_0B2)(완료)<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_0C1">12. Service Provider (COM_ENS_0C1)(완료) mdm param ( 개발 완료 )<BR></A>
  
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_N11">13. Account (COM_ENS_N11)(신규 개발) mdm param ( 개발 완료)<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_0G1">14. CNTR TYPE/SIZE (COM_ENS_0G1)(신규 개발) mdm param ( 개발 완료)<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_0K1">15. Rep Commodity Code (COM_ENS_0K1)(신규 개발) mdm param ( 개발 완료)<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_0H1">16. Continent Code Inquiry(COM_ENS_0H1)(신규 개발) mdm param ( 개발 완료)<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_0H1">17. Sub Continent Code Inquiry (COM_ENS_0I1)(신규 개발) mdm param ( 개발 완료)<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#UI_BKG_0696">18. PACKAGE TYPE (UI_BKG_0696)(신규 개발) mdm param ( 개발 완료)<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_0M1">19. COUNTRY (COM_ENS_0M1)(신규 개발) mdm param ( 개발 완료)<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_0J1">20. REGION (COM_ENS_0J1)(신규 개발) mdm param ( 개발 완료)<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_N13">21. CURRENCY (COM_ENS_N13)(신규 개발) mdm param ( 개발 완료)<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_0X1">22. STATE (COM_ENS_0X1)(신규 개발) mdm param ( 개발 완료 )<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_0N1">23. CARRIRE (COM_ENS_0N1)(신규 개발) mdm param ( 개발 완료 )<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_ENS_0L1">24. Service Scope (COM_ENS_0L1)(신규 개발) mdm param ( 개발 완료 )<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_COM_0001">25. Charge Code(COM_COM_0001)(신규 개발) mdm param ( 개발 완료 )<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_COM_0002">26. CNTR Type Code(COM_COM_0002)(신규 개발) mdm param ( 개발 완료 )<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_COM_0003">27. CNTR Size Code(COM_COM_0003)(신규 개발) mdm param ( 개발 완료 )<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_COM_0004">28. Leasing Company Yard Code(COM_COM_0004)(신규 개발) mdm param ( 개발 완료 )<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_COM_0005">29. Daylight Saving Time(DST) Code(COM_COM_0005)(신규 개발) mdm param ( 개발 완료 )<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_COM_0006">30. Customer Group Code(COM_COM_0006)(신규 개발) mdm param ( 개발 완료 )<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_COM_0007">31. Vendor Code(COM_COM_0007)(신규 개발) mdm param ( 개발 완료 )<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_COM_0008">32. Sales Representative Code(COM_COM_0008)(신규 개발) mdm param ( 개발 완료 )<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_COM_0009">33. Activity Code(COM_COM_0009)(신규 개발) mdm param ( 개발 완료 )<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_COM_0010">34. Movement Status Code(COM_COM_0010)(신규 개발) mdm param ( 개발 완료 )<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_COM_0011">35. Revenue Lane Code(COM_COM_0011)(신규 개발) mdm param ( 개발 완료 )<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_COM_0012">36. Trade Code(COM_COM_0012)(신규 개발) mdm param ( 개발 완료 )<BR></A>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="#COM_COM_0013">37. Sub Trade Code(COM_COM_0013)(신규 개발) mdm param ( 개발 완료 )<BR></A>
  
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;※ 관련 샘플 추가  <BR>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A href="./sample_ibsheet/UI_ESD_PRD_004.html" target="_blank">01. IB시트 Cell에서의 Biz 공통 팝업 호출 <BR></A>
  </B>
  
  <BR><HR>
  
  <BR><BR>
  
<table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr>
      <td valign="top" height="475"><h3>▶ javascript 사용 예제</h3>

<A name=COM_ENS_011>        
	<table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
    	<tr>
        	<td colspan="5" bgcolor="#F1D1C9"><b>01. Commodity (COM_ENS_011)</b> </td>
		</tr>
		<tr>
			<td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="150">
            	Commodity Code:<br>
            	REP Commodity:<br>
            	IMDG CLASS:<br>
            	Keyword:<br>
            	MDM YN :<br>
            	DELETE FLG : <br>
            	Display Option:<br>
            </td>
            <td width="550" bgcolor="#EFEFEF">
              <input name="cmdt_cd" type="text" size="50" style="height:22"><br>
              <input name="rep_cmdt_cd" type="text" size="50" style="height:22"><br>
              <select style="width:50;" name="rep_imdg_lvl_cd">&nbsp;
						<option value="" selected>ALL</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						</select>
			  <br>
              <input name="cmdt_nm" type="text" size="50" style="height:22"><br>
				<!-- 
              	mdm param 
              	* cmdt_delt_flg_status mdm 조회인지 아닌지 구분값.
              	* cmdt_delt_flg : ALL 모두 조회 , Y : 삭제 건만 조회 , N 삭제 안된 건만 조회
              -->
              <select style="width:50;" name="cmdt_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
				</select><br>
				<select style="width:85;" name="cmdt_delt_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="ALL" >ALL</option>
						<option value="Y">Delete</option>
						<option value="N">Active</option>
					</select><br>
              <input name="cmdt_dispaly" type="text" size="20" maxlength="13" value="1,0,1,1,1,1,1" style="height:22">
              <input name="cmdt_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
              </td>
          	</tr>
			<tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - IB Sheet Cell에서의 공통 팝업창 호출 (<b><font color="blue">상기 예의 경우 Port</font></b>) <br>
              <br>
              - 메소드 정의 : function ComOpenPopupInSheet(url, width, height, func, dispaly, row, col)
              <br>
* @param {string} sUrl 필수,호출될 팝업 주소 <br>
* @param {int} iWidth 필수,팝업 창의 넓이 <br>
* @param {int} iHeight 필수,팝업 창의 높이 <br>
* @param {string} sFunc 필수,팝업에서 최종 확인을 했을때 데이터를 받을 부모창(opener)의 자바스크립트 함수명 <br>
* @param {string} sDisplay 필수,팝업창에 있는 그리드의 컬럼 히든여부 설정(1:보임, 0:숨김) <br>
* @param {bool} bModal 선택,팝업의 Modal 여부 (true:Modal, false:일반팝업), default=false <br>
* @param {bool} b2ndSheet 선택,Sheet 2개인 팝업 오픈시 true 1개인 팝업 오픈시 false, default=false <br>
* @param {int} iRow 선택,Sheet의 Cell의 Row Index <br>
* @param {int} iCol 선택,Sheet의 Cell의 Col Index <br>
* @param {int} iSheetIdx 선택,Sheet의 sheetObjects 배열 Index <br>
* @returns object<br>
* bModal=false로 오픈된 경우 리턴값 : 팝업창의 window Object <br>
* bModal=true로 오픈된 경우 리턴값 : 팝업창의 window.returnValue값 <br> 
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
"0,1"로 하면 popup에서 컬럼명이 checkbox를 찾고,
1,0이면 컬럼명이 radio 컬럼을 찾으며,
0,0이면 선택된 row를 찾아서 return합니다. 
ComOpenPopup('/opuscntr/COM_ENS_011.do' + param, 778, 450, 'getCOM_ENS_011_1', dispaly, true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>
<A href="#TOP">↑ Top<BR></A>

<A name=COM_ENS_021><BR><BR>        
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>02. Contract (COM_ENS_021)</b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="100">
            	Contract No:<br>
            	CustomerName:<br>
            	MDM YN : <br>
            	DELETE FLG : <br>
            	Display Option:
            </td>
            <td width="600" bgcolor="#EFEFEF">
              <input name="cnt_txt1" type="text" size="3" maxlength="3" value=""> <input name="cnt_txt2" type="text" size="6" maxlength="6"><br>
              <input name="cnt_txt5" type="text" size="50"><br>
              <select style="width:50;" name="cnt_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
				</select><br>
				<select style="width:85;" name="cnt_delt_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="ALL" >ALL</option>
						<option value="Y">Delete</option>
						<option value="N">Active</option>
					</select><br>
              <input name="cnt_display" type="text" size="15" value="1,0,1,1,1,1,1,1" maxlength="15">(예: 1,0,1,1,1,1,1,1)&nbsp&nbsp
              <input name="cnt_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기"></td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1,1,1,1'
ComOpenPopup('/opuscntr/COM_ENS_021.do' + param, 778, 440, 'getCOM_ENS_021_1', display, true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>

<A name=COM_ENS_041><BR><BR>        
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>04. Customer (COM_ENS_041)</b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="100">
            	Customer Code:<br>
            	Sales Office:<br>
            	Customer Name:<br>
            	MDM YN : <br>
            	DELETE FLAG : <br>
            	Display Option:
            </td>
            <td width="600" bgcolor="#EFEFEF">
              <input name="cust01_txt1" type="text" size="50" value=""><br>
              <input name="cust01_txt3" type="text" size="50"><br>                     
              <input name="cust01_txt4" type="text" size="50"><br>
              <select style="width:50;" name="cust01_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
				</select><br>
				<select style="width:85;" name="cust01_delt_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="ALL" >ALL</option>
						<option value="Y">Delete</option>
						<option value="N">Active</option>
					</select><br>
              <input name="cust01_display" type="text" size="20" value="1,0,1,1,1,1,1,1,1,1" maxlength="19">(예: 1,0,1,1,1,1,1,1,1,1)&nbsp&nbsp
              <input name="cust01_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기"></td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1,1,1,1,1,1'
ComOpenPopup('/opuscntr/COM_ENS_041.do' + param, 768, 420, 'getCOM_ENS_041_1', display);
            	</pre>
            </td>
          </tr>
        </table>
        <br>        
<A href="#TOP">↑ Top<BR></A>

<A name=COM_ENS_051><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>05. Location (COM_ENS_051)</b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="100">
            	Country:<br>
            	State:<br>
            	Control Office:<br>
            	Loc Code:<br>
            	Loc Name:<br>
            	Port Only:<br>
            	System:<br>
            	Mdn YN : <br>
            	Delete Flg : <br>
            	Scc YN : <br>
            	Display Option:
            </td>
            <td width="600" bgcolor="#EFEFEF">
              <input name="com_ens_051_cnt_cd" type="text" size="50" style="height:22"><br>
              <input name="com_ens_051_loc_state" type="text" size="50" style="height:22"><br>
              <input name="com_ens_051_loc_eq_ofc" type="text" size="50" style="height:22"><br>
              <input name="com_ens_051_loc_cd" type="text" size="50" style="height:22"><br>
              <input name="com_ens_051_loc_desc" type="text" size="50" style="height:22"><br>
              <input name="com_ens_051_loc_port_ind" type="checkbox" value="1"><br>
              <select name="com_ens_051_sys_code" style="width:150;">&nbsp;
				<option value="ENIS" selected>e-NIS</option>
				<option value="BMS">BMS</option>
			  </select><br>
			  <select style="width:50;" name="com_ens_051_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
				</select><br>
				<select style="width:85;" name="com_ens_051_delt_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="ALL" >ALL</option>
						<option value="Y">Delete</option>
						<option value="N">Active</option>
					</select><br>
				<select style="width:85;" name="com_ens_051_scc_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="Y">Y</option>
						<option value="N">N</option>
					</select><br>
              <input name="com_ens_051_dispaly" type="text" size="20" value="1,0,1,1,1,1,1,1,1,1,1,1" maxlength="23" style="height:22">
              <input name="com_ens_051_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기"></td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : dispaly   - 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). dispaly 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,0,1,1,1,1,0,1,1'
ComOpenPopup('/opuscntr/COM_ENS_051.do' + param, 770, 410, 'getCOM_ENS_051_1', dispaly);
            	</pre>
            </td>
          </tr>
        </table>
        <br>
<A href="#TOP">↑ Top<BR></A>

<A name=COM_ENS_061><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>06. Node (COM_ENS_061)</b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="150">
            	Country :<br>
            	Location :<br>
            	Control Office :<br> 
            	Node :<br>
            	Node Name :<br>
            	Yard/Zone :<br>
            	Search Yard/Zone Only :<br>
            	Mdm yn : <br>
            	Delt Flg : <br>
            	Display Option:
            </td>
            <td width="550" bgcolor="#EFEFEF">
              <input name="com_ens_061_cnt_cd" type="text" size="20" style="height:22"><br>
              <input name="com_ens_061_loc_cd" type="text" size="20" style="height:22"><br>
              <input name="com_ens_061_ofc_cd" type="text" size="20" style="height:22"><br>
              <input name="com_ens_061_node_cd" type="text" size="20" style="height:22"><br>
              <input name="com_ens_061_node_nm" type="text" size="20" style="height:22"><br>
              <input name="com_ens_061_mode" type="radio" value="yard" checked onClick="javascript:chgCom_ens_061_mode();">Yard 
              <input name="com_ens_061_mode" type="radio" value="zone" onClick="javascript:chgCom_ens_061_mode();">Zone<br>            
              <input name="com_ens_061_mode_only" type="checkbox" value="Y"> (체크시 Yard/Zone 선택조회 불가함)
              <br>
              <script>
              	function chgCom_ens_061_mode() {              		
              		if(document.all.com_ens_061_mode[0].checked) {
              			document.all.com_ens_061_display.value = "1,0,1,1,1,1,1,1,1,1,1,1";
              			document.all.divCom_ens_061_mode.innerText = "1,0,1,1,1,1,1,1,1,1,1,1";
              			document.all.com_ens_061_display.maxLength = 23;
              		} else {
              			document.all.com_ens_061_display.value = "1,0,1,1,1,1,1,1,1,1";
              			document.all.divCom_ens_061_mode.innerText = "1,0,1,1,1,1,1,1,1,1";
              			document.all.com_ens_061_display.maxLength = 19;
              		}
              	}
	          </script>
	          <select style="width:50;" name="com_ens_061_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
				</select><br>
				<select style="width:85;" name="com_ens_061_delt_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="ALL" >ALL</option>
						<option value="Y">Delete</option>
						<option value="N">Active</option>
					</select><br>
              <input name="com_ens_061_display" type="text" size="20" maxlength="23" value="1,0,1,1,1,1,1,1,1,1,1,1" style="height:22">(예: <div id="divCom_ens_061_mode" style="display:inline">1,0,1,1,1,1,1,1,1,1,1,1</div>)&nbsp&nbsp
              <input name="com_ens_061_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기"></td>
          </tr>          
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1,1,1,1,1,1,1,1'
ComOpenPopup('/opuscntr/COM_ENS_061.do' + param, 800, 425, 'getCOM_ENS_061_1', display);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>

<A name=COM_ENS_071><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>07. Office (COM_ENS_071)</b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="150">
            	<!-- Call TYpe:<br>-->
            	Office Type:<br>
            	Parent Office:<br>
            	Office Code:<br>
            	Office Name:<br>
            	Mdm YN:<br>
            	Delete Flg:<br>
            	Display Option:
            </td>
            <td width="550" bgcolor="#EFEFEF">              		  
              <select name=ofc_lev style="width:90;">&nbsp;
				<option value="" selected>ALL</option>
				<option value="1">HO</option>
				<option value="2">RHQ</option>
				<option value="3">BB(AA)</option>
				<option value="4">SUB-BB(AA)</option>
			  </select>			  
			  <br>
              <input name="ofc_pts_cd" type="text" size="50" style="height:22"><br>
              <input name="ofc_cd" type="text" size="50" style="height:22"><br>
              <input name="ofc_nm" type="text" size="50" style="height:22"><br>
              <select style="width:50;" name="ofc_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
				</select><br>
				<select style="width:85;" name="ofc_delt_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="ALL" >ALL</option>
						<option value="Y">Delete</option>
						<option value="N">Active</option>
					</select><br>
              <input name="ofc_dispaly" type="text" value="1,0,1,1,1,1,1,1" size="18" maxlength="15" style="height:22">
              <input name="ofc_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기"></td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : dispaly   - 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). dispaly 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_ENS_071.do' + param, 980, 430, 'getCOM_ENS_071_1', dispaly);
            	</pre>
            </td>
          </tr>
        </table>
        <br>
<A href="#TOP">↑ Top<BR></A>

<A name=COM_ENS_081><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="6" bgcolor="#F1D1C9"><b>08. Lane (COM_ENS_081)</b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="100">
            	Lane Kind :<br>
            	<div id="divRevLane" style="display:inline">
            	Trade :<br>
            	Sub Trade :<br>
            	</div>
            	Lane Code :<br>
            	Lane Name :<br>
            	SVC Type :<br>
            	Mdm Yn : <br>
            	Delt Flg : <br>
            	Display Option:
            </td>
            <td width="600" bgcolor="#EFEFEF">
              <select name="com_ens_081_mode" onChange="javascript:chgLaneMode(this);">
              	<option value="rev" selected>Revenue Lane</option>
              	<option value="svc">Service Lane</option>
              </select><br>
              <script>				              	
				function chgLaneMode(Object) {				    
				    var divList = eval("divRevLane");				    
				    if(divList.length) {				        
				        for(var i=0; i<divList.length; i++) {				            
				            if(Object.value == "rev") {
				                divList[i].style.display = "inline";
				            } else {
				                divList[i].style.display = "none";
				            }
				        }
				    }
				}
              </script>
              <div id="divRevLane" style="display:inline">
              <input name="com_ens_081_trade_cd" type="select" size="20" style="height:22"><br>
              <input name="com_ens_081_sub_trade_cd" type="select" size="20" style="height:22"><br>
              </div>
              <input name="com_ens_081_lane_cd" type="select" size="20" style="height:22"><br>
              <input name="com_ens_081_lane_nm" type="text" size="20" style="height:22"><br>
              <select name="com_ens_081_svc_tp">
              	<option selected value="">ALL</option>
              	<option value="I">Indepedent Join</option>
              	<option value="J">Joint Operation</option>
              	<option value="S">Space Charter</option>
              	<option value="O">Off Lane</option>
              </select><br>              
              <select style="width:50;" name="com_ens_081_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
				</select><br>
				<select style="width:85;" name="com_ens_081_delt_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="ALL" >ALL</option>
						<option value="Y">Delete</option>
						<option value="N">Active</option>
					</select><br>
              <!-- input name="com_ens_081_lane_tp" type="radio">Off Lane <input name="com_ens_081_lane_tp" type="radio" checked>Lane <br-->
              <input name="com_ens_081_display" type="text" size="20" maxlength="15" value="1,0,1,1,1,1,1,1" style="height:22">(예: 1,0,1,1,1,1,1,1)&nbsp&nbsp
              <input name="com_ens_081_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
            <td width="50" bgcolor="#F5E7C5" align="center">
            	출력
            </td>
            <td width="270" bgcolor="#EFEFEF">
              ▶ <b>Revenue Lane</b><br>
            	1) rln_trade_cd : Trade 코드<br>
            	2) rln_sub_trade_cd  : Sub Trade 코드<br>
            	3) rlane_cd  : Revenue Lane 코드<br>
            	4) rlane_nm  : Revenue Lane 명<br>
            	2) vsl_tp_cd : Revenue Lane 타입<br>
              ▶ <b>Service Lane</b><br>
            	1) vsl_slan_cd   : Service Lane 코드<br>
            	2) vsl_slan_nm   : Service Lane 명<br>
            	3) vsl_svc_tp_cd : Service Lane 타입<br>
            	4) co_cd  : 선사 코드<br>
            </td>
          </tr>          
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="6">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="6">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1,1,1,1'
ComOpenPopup('/opuscntr/COM_ENS_081.do' + param, 770, 420, 'getCOM_ENS_081_1', display);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>

<A name=COM_ENS_091><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="6" bgcolor="#F1D1C9"><b>09-01. Staff (COM_ENS_091)</b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="100">
            	Office Code :<br>            	
            	User Code :<br>
            	User Name :<br>
            	E-Mail :<br>
            	Display Option:
            </td>
            <td width="600" bgcolor="#EFEFEF">              
              <input name="com_ens_091_ofc_cd" type="text" size="20" style="height:22"><br>
              <input name="com_ens_091_user_cd" type="select" size="20" style="height:22"><br>
              <input name="com_ens_091_user_nm" type="select" size="20" style="height:22"><br>
              <input name="com_ens_091_user_email" type="select" size="20" style="height:22"><br>
              <input name="com_ens_091_display" type="text" size="20" maxlength="11" value="1,0,1,1,1,1" style="height:22">(예: 1,0,1,1,1,1)&nbsp&nbsp
              <input name="com_ens_091_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>            
          </tr>          
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="6">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="6">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1,1,1,1'
ComOpenPopup('/opuscntr/COM_ENS_091.do' + param, 780, 535, 'getCOM_ENS_091_1', display,true, true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>

<A name=COM_ENS_092><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="6" bgcolor="#F1D1C9"><b>09-02. Notified Subscriber (COM_ENS_092)</b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="100">
            	User ID :<br>
            	E-Mail :
            </td>
            <td width="600" bgcolor="#EFEFEF">              
              <input name="com_ens_092_user_id" type="select" size="20" style="height:22"><br>
              <input name="com_ens_092_user_email" type="select" size="20" style="height:22">
              <input name="com_ens_092_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>            
          </tr>          
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="6">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)<br>
              => Notified Subscriber 의 경우 display를 'none'으로 세팅한다.              
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="6">
            	<pre>
예). display 속성 -> 'none'
ComOpenPopup('/opuscntr/COM_ENS_092.do' + param, 810, 450, 'getCOM_ENS_092', '1,0,1,1,1,1,0,0,0,0,0,0,0,0,0', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>

<A name=COM_ENS_0A1><BR><BR>	  
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>10. Vessel (COM_ENS_0A1)</b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="100">
            	Vessel Code:<br>
            	Vessel Name:<br>
            	Carrier:<br>
            	MDM YN : <br>
            	DELETE FLAG : <br>
            	Display Option:
            </td>
            <td width="600" bgcolor="#EFEFEF">
              <input name="sp1_txt1" type="text" size="50" value=""><br>
              <input name="sp1_txt2" type="text" size="50"><br>
              <input name="sp1_txt3" type="text" size="50"><br>
              <select style="width:50;" name="sp1_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
				</select><br>
				<select style="width:85;" name="sp1_delt_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="ALL" >ALL</option>
						<option value="N">Active</option>
						<option value="Y">Delete</option>
					</select><br>
              <input name="sp1_display" type="text" value="1,0,1,1,1,1,1" size="8" maxlength="13">(예: 1,0,1,1,1,1,1)&nbsp&nbsp
              <input name="sp1_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기"></td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr> 
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,0,1,1'
ComOpenPopup('/opuscntr/COM_ENS_0A1.do' + param, 880, 420, 'getCOM_ENS_0A1_1', display);	// radio PopUp  
            	</pre>
            </td>
          </tr>
        </table>
        <br>
<A href="#TOP">↑ Top<BR></A>

<A name=COM_ENS_0B2><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="6" bgcolor="#F1D1C9"><b>11. VVD (COM_ENS_0B2)</b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="100">
            	ETD / ETA :<br>
            	Period :<br> 
            	LANE :<br>
            	VVD :<br>
            	PORT :<br>
            	Operator :<br>
            	Display Option:
            </td>
            <td width="600" bgcolor="#EFEFEF">
              <select name="vslskd02_etdeta" style="width:60; height:22">&nbsp;
				<option value="D" selected>ETD</option>
				<option value="A">ETA</option>
			  </select><br>
              <input name="vslskd02_sdate" type="text" size="10" style="height:22" value="">              
              <img class="cursor" src="/opuscntr/img/enis/button/btns_calendar.gif" width="19" height="20" border="0" align="absmiddle" name="vslskd02_calendar1">
              ~              
              <input name="vslskd02_edate" type="text" size="10" style="height:22" value="">
              <img class="cursor" src="/opuscntr/img/enis/button/btns_calendar.gif" width="19" height="20" border="0" align="absmiddle" name="vslskd02_calendar2"><br>
              <input name="vslskd02_lane" type="text" size="20" style="height:22"><br>
              <input name="vslskd02_vvd" type="text" size="20" style="height:22"><br>
              <input name="vslskd02_loc" type="text" size="20" style="height:22" value=""><br>
              <input name="vslskd02_oper" type="text" size="20" style="height:22"><br>

              <input name="vslskd02_display" type="text" size="20" maxlength="20" value="1,0,1,1,1,1,1,1" style="height:22">(예: 1,0,1,1,1,1,1,1)&nbsp&nbsp
              <input name="vesselskd02_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
            <td width="50" bgcolor="#F5E7C5" align="center">
            	출력
            </td>
            <td width="270" bgcolor="#EFEFEF">
            	1) slan_cd : Lane 코드<br>
            	2) vps_port_cd  : Port 코드<br>
            	3) vps_etd_dt : ETD date<br>
            	4) vps_eta_dt : ETA date<br>
            	5) vvd : VVD 코드<br>
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="6">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="6">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1,1,1,1'
ComOpenPopup('/opuscntr/COM_ENS_0B2.do' + param, 770, 420, 'getCOM_ENS_0B2_1', display);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>

<A name=COM_ENS_0C1><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>12. Service Provider (COM_ENS_0C1)</b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="200">
            	Service Provider Code:<br>
            	Service Provider Name:<br>
            	Parent Service Provider Code:<br> 
            	Original Service Provider Code:<br> 
            	Mdm yn : <br>
            	Delt Flg : <br>
            	Display Option:
            </td>
            <td width="600" bgcolor="#EFEFEF">
              <input name="sp_vndr_cd" type="text" size="50"><br>             
              <input name="sp_txt2" type="text" size="50"><br>
              <input name="sp_txt5" type="text" size="10" maxlength="8"><br>
              <input name="sp_txt6" type="text" size="10" maxlength="8"><br>
              <select style="width:50;" name="sp_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
				</select><br>
				<select style="width:85;" name="sp_delt_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="ALL" >ALL</option>
						<option value="N">Active</option>
						<option value="Y">Delete</option>
					</select><br>
              <input name="sp_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp&nbsp
              <input name="sp_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기"></td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_ENS_0C1.do' + param, 700, 400, 'getCOM_ENS_0C1', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>


        </td>
    </tr>
	<tr>
		<td>
<A name=COM_ENS_N11><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>13. ACCOUNT (COM_ENS_N11)</b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	ACCOUNT CODE:<br>
            	ACCOUNT ENG NAME:<br>
            	ACCOUNT DELETE FLAG STATUS:<br> 
            	ACCOUNT DELETE FLAG:<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
              <input name="acct_cd" type="text" size="10"><br> 
              <input name="acct_eng_nm" type="text" size="50"><br>             
              <select style="width:50;" name="acct_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
				</select><br>
				<select style="width:85;" name="acct_delt_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="ALL" >ALL</option>
						<option value="Y">Delete</option>
						<option value="N">Active</option>
					</select><br>
              <input name="acct_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp&nbsp
              <input name="acct_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_ENS_N11.do' + param, 700, 400, 'getCOM_ENS_N11', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>


        </td>
    </tr>
	<tr>
		<td>
<A name=COM_ENS_0G1><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>14. CNTR TYPE/SIZE (COM_ENS_0G1)</b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	CNTR TYPE/SIZE CODE:<br>
            	CNTR TYPE/SIZE DESC :<br>
            	CNTR TYPE/SIZE MDM YN :<br> 
            	CNTR TYPE/SIZE DELETE FLAG:<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
              <input type="text" name="cntr0g1_tpsz_cd" style="width:30;ime-mode:disabled" maxlength="2" dataformat="engup"><br>
              <input type="text" name="cntr0g1_tpsz_desc" style="width:350"><br>             
              <select style="width:50;" name="cntr0g1_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
				</select><br>
				<select style="width:85;" name="cntr0g1_delt_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="ALL" >ALL</option>
						<option value="N">Active</option>
						<option value="Y">Delete</option>
					</select><br>
              <input name="cntr0g1_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp&nbsp
              <input name="cntr0g1_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_ENS_0G1.do' + param, 600, 400, 'getCOM_ENS_0G1', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>


        </td>
    </tr>
    <tr>
    	<td>
<A name=COM_ENS_0K1><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>15. Rep Commodity Code (COM_ENS_0K1)</b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	Commodity Code:<br>
            	Commodity Name :<br>
            	MdnYn :<br> 
            	Delete Flg:<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="rep1_cmdt_cd" style="width:45" maxlength="4" dataformat="number"><br>
              <input type="text" name="rep1_cmdt_nm" dataformat="engup" style="width:80%"><br>             
              <select style="width:50;" name="rep1_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
				</select><br>
				<select style="width:85;" name="rep1_delt_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="ALL" >ALL</option>
						<option value="N">Active</option>
						<option value="Y">Delete</option>
					</select><br>
              <input name="rep1_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp&nbsp
              <input name="rep1_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_ENS_0K1.do' + param, 700, 400, 'getCOM_ENS_0K1', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>


        </td>
    </tr>
    <tr>
    	<td>
<A name=COM_ENS_0H1><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>16. Continent Code Inquiry (COM_ENS_0H1)</b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	Code :<br>
            	Name :<br>
            	Mdm Yn:<br> 
            	Delete Flg:<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="conti_inqu_cd" style="width:45" maxlength="4" dataformat="number"><br>
              <input type="text" name="conti_inqu_nm" dataformat="engup" style="width:80%"><br>             
              <select style="width:50;" name="conti_inqu_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
				</select><br>
				<select style="width:85;" name="conti_inqu_delt_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="ALL" >ALL</option>
						<option value="N">Active</option>
						<option value="Y">Delete</option>
					</select><br>
              <input name="conti_inqu_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="conti_inqu_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_ENS_0H1.do' + param, 430, 400, 'getCOM_ENS_0H1', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>
    
    
    <tr>
    	<td>
<A name=COM_ENS_0I1><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>17. Sub Continent Code Inquiry (COM_ENS_0I1)</b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	Code :<br>
            	Name :<br>
            	Mdm Yn :<br> 
            	Delete Flg :<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="sconti_inqu_cd" style="width:45" maxlength="4" dataformat="number"><br>
              <input type="text" name="sconti_inqu_nm" dataformat="engup" style="width:80%"><br>             
              <select style="width:50;" name="sconti_inqu_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
				</select><br>
				<select style="width:85;" name="sconti_inqu_delt_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="ALL" >ALL</option>
						<option value="N">Active</option>
						<option value="Y">Delete</option>
					</select><br>
              <input name="sconti_inqu_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="sconti_inqu_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_ENS_0I1.do' + param, 510, 400, 'getCOM_ENS_0I1', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>
    
    
    <tr>
    	<td>
<A name=UI_BKG_0696><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>18. PACKAGE TYPE (UI_BKG_0696)</b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	Package CODE:<br>
            	Package NAME :<br>
            	Package MDM YN :<br> 
            	Package DELETE FLAG:<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="pck_cd" style="width:45" maxlength="4" dataformat="number"><br>
              <input type="text" name="pck_nm" dataformat="engup" style="width:80%"><br>             
              <select style="width:50;" name="pck_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
				</select><br>
				<select style="width:85;" name="pck_delt_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="ALL" >ALL</option>
						<option value="N">Active</option>
						<option value="Y">Delete</option>
					</select><br>
              <input name="pck_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="pck_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/UI_BKG_0696.do' + param, 460, 400, 'getUI_BKG_0696', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>
    
    
    <tr>
    	<td>
<A name=COM_ENS_0M1><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>19. Country Code Inquiry (COM_ENS_0M1)</b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	Country Code Inquiry CODE:<br>
            	Country Code Inquiry NAME :<br>
            	Country Code Inquiry MDM YN :<br> 
            	Country Code Inquiry DELETE FLAG:<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="m1_cnt_cd" style="width:45" maxlength="4" dataformat="number"><br>
              <input type="text" name="m1_cnt_nm" dataformat="engup" style="width:80%"><br>             
              <select style="width:50;" name="m1_cnt_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
				</select><br>
				<select style="width:85;" name="m1_cnt_delt_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="ALL" >ALL</option>
						<option value="N">Active</option>
						<option value="Y">Delete</option>
					</select><br>
              <input name="m1_cnt_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="m1_cnt_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_ENS_0M1.do' + param, 860, 430, 'getCOM_ENS_0I1', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>
    
    <tr>
    	<td>
<A name=COM_ENS_0J1><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>20. Region Code Inquiry (COM_ENS_0J1)</b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	Cnt Code : <br>
            	Region Code :<br>
            	Region Code Inquiry Name :<br>
            	Mdm YN :<br> 
            	Delete FLAG:<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="rgn_cnt_cd" style="width:45" maxlength="4" dataformat="number"><br>
             <input type="text" name="rgn_cd" style="width:45" maxlength="4" dataformat="number"><br>
              <input type="text" name="rgn_nm" dataformat="engup" style="width:80%"><br>             
              <select style="width:50;" name="rgn_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
				</select><br>
				<select style="width:85;" name="rgn_delt_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="ALL" >ALL</option>
						<option value="N">Active</option>
						<option value="Y">Delete</option>
					</select><br>
              <input name="rgn_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="rgn_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_ENS_0J1.do' + param, 700, 400, 'getCOM_ENS_0J1', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>
    
    <tr>
    	<td>
<A name=COM_ENS_N13><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>21. Currency Code (COM_ENS_N13)</b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	Country Code : <br>
            	Currency Code :<br>
            	Currency Description :<br>
            	Mdm YN :<br> 
            	Delete FLAG:<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="curr_cnt_cd" style="width:45" maxlength="4" dataformat="engup"><br>
             <input type="text" name="curr_cd" style="width:45" maxlength="4" dataformat="engup"><br>
              <input type="text" name="curr_desc"  style="width:80%"><br>             
              <select style="width:50;" name="curr_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
				</select><br>
				<select style="width:85;" name="curr_delt_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="ALL" >ALL</option>
						<option value="N">Active</option>
						<option value="Y">Delete</option>
					</select><br>
              <input name="curr_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="curr_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_ENS_N13.do' + param, 470, 420, 'getCOM_ENS_N13', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>
    
    
    <tr>
    	<td>
<A name=COM_ENS_0X1><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>22. STATE (COM_ENS_0X1)</b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	Country Code :<br>
            	Mdm YN :<br> 
            	Delete FLAG:<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="state_cnt_cd" style="width:45" maxlength="4" dataformat="engup"><br>
              <select style="width:50;" name="state_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
				</select><br>
				<select style="width:85;" name="state_delt_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="ALL" >ALL</option>
						<option value="N">Active</option>
						<option value="Y">Delete</option>
					</select><br>
              <input name="state_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="state_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_ENS_0X1.do' + param, 400, 370, 'getCOM_ENS_0J1', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>
    
    
    <tr>
    	<td>
<A name=COM_ENS_0N1><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>23. CARRIRE (COM_ENS_0N1)(신규 개발) </b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	Carrire Code :<br>
            	Mdm YN :<br> 
            	Delete FLAG:<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="crr_cd" style="width:45" maxlength="4" dataformat="engup"><br>
              <select style="width:50;" name="crr_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
				</select><br>
				<select style="width:85;" name="crr_delt_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="ALL" >ALL</option>
						<option value="N">Active</option>
						<option value="Y">Delete</option>
					</select><br>
              <input name="crr_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="crr_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_ENS_0N1.do' + param, 520, 420, 'getCOM_ENS_0N1', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>
    
    <tr>
    	<td>
<A name=COM_ENS_0L1><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>24. Service Scope (COM_ENS_0L1)(신규 개발)  </b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	Bound Code :<br>
            	Mdm YN :<br> 
            	Delete FLAG:<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="svc_scp_bnd_cd" style="width:80" maxlength="4" dataformat="engup"><br>
              <select style="width:50;" name="trf_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
				</select><br>
				<select style="width:85;" name="trf_delt_flg">
						<option value=""  selected="selected">선택 안함</option>
						<option value="ALL" >ALL</option>
						<option value="N">Active</option>
						<option value="Y">Delete</option>
					</select><br>
              <input name="trf_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="trf_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_ENS_0L1.do' + param, 530, 420, 'getCOM_ENS_0L1', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>
    
    <tr>
    	<td>
<A name=COM_COM_0001><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>25. Charge Code (COM_COM_0001)(신규 개발) </b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	Charge Code :<br>
            	Description :<br> 
            	Mdm YN :<br>
            	Status :<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="chg_cd" style="width:70" maxlength="4" dataformat="engup"><br>
             <input type="text" name="chg_nm" style="width:200" maxlength="100" dataformat="engup"><br>
             <select style="width:50;" name="chg_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
			 </select><br>
             <select style="width:85;" name="chg_delt_flg">
					<option value="ALL" selected="selected">ALL</option>
					<option value="N">Active</option>
					<option value="Y">Delete</option>
			  </select><br>
              <input name="chg_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="chg_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_COM_0001.do' + param, 770, 420, 'getCOM_COM_0001', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>
    
    <tr>
    	<td>
<A name=COM_COM_0002><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>26. CNTR Type Code (COM_COM_0002)(신규 개발) </b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	CNTR Type Code :<br>
            	Description :<br> 
            	Mdm YN :<br>
            	Status :<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="cntr_tp_cd" style="width:70" maxlength="1" dataformat="engup"><br>
             <input type="text" name="cntr_tp_desc" style="width:200" maxlength="100" dataformat="engup"><br>
             <select style="width:50;" name="cntr_tp_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
			 </select><br>
             <select style="width:85;" name="cntr_tp_delt_flg">
					<option value="ALL" selected="selected">ALL</option>
					<option value="N">Active</option>
					<option value="Y">Delete</option>
			  </select><br>
              <input name="cntr_tp_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="cntr_tp_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_COM_0002.do' + param, 770, 440, 'getCOM_COM_0002', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>

    <tr>
    	<td>
<A name=COM_COM_0003><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>27. CNTR Size Code (COM_COM_0003)(신규 개발) </b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	CNTR Size Code :<br>
            	Description :<br> 
            	Mdm YN :<br>
            	Status :<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="cntr_sz_cd" style="width:70" maxlength="2" dataformat="engup"><br>
             <input type="text" name="cntr_sz_desc" style="width:200" maxlength="100" dataformat="engup"><br>
             <select style="width:50;" name="cntr_sz_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
			 </select><br>
             <select style="width:85;" name="cntr_sz_delt_flg">
					<option value="ALL" selected="selected">ALL</option>
					<option value="N">Active</option>
					<option value="Y">Delete</option>
			  </select><br>
              <input name="cntr_sz_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="cntr_sz_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_COM_0003.do' + param, 770, 440, 'getCOM_COM_0003', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>

    <tr>
    	<td>
<A name=COM_COM_0004><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>28. Leasing Company Yard Code (COM_COM_0004)(신규 개발) </b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	Leasing Code :<br>
            	Description :<br> 
            	Mdm YN :<br>
            	Status :<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="lse_co_yd_cd" style="width:70" maxlength="7" dataformat="engup"><br>
             <input type="text" name="lse_co_yd_nm" style="width:200" maxlength="50" dataformat="engup"><br>
             <select style="width:50;" name="lse_co_yd_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
			 </select><br>
             <select style="width:85;" name="lse_co_yd_delt_flg">
					<option value="ALL" selected="selected">ALL</option>
					<option value="N">Active</option>
					<option value="Y">Delete</option>
			  </select><br>
              <input name="lse_co_yd_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="lse_co_yd_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_COM_0004.do' + param, 770, 440, 'getCOM_COM_0004', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>

    <tr>
    	<td>
<A name=COM_COM_0005><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>29. Daylight Saving Time(DST) Code (COM_COM_0005)(신규 개발) </b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	DST Code :<br>
            	Mdm YN :<br>
            	Status :<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="dst_cnt_cd" style="width:70" maxlength="6" dataformat="engup"><br>
             <select style="width:50;" name="dst_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
			 </select><br>
             <select style="width:85;" name="dst_delt_flg">
					<option value="ALL" selected="selected">ALL</option>
					<option value="N">Active</option>
					<option value="Y">Delete</option>
			  </select><br>
              <input name="dst_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="dst_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_COM_0005.do' + param, 770, 420, 'getCOM_COM_0005', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>

  	<tr>
    	<td>
<A name=COM_COM_0006><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>30. Customer Group Code (COM_COM_0006)(신규 개발) </b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	Customer Group Code :<br>
            	Name :<br> 
            	Mdm YN :<br>
            	Status :<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="cust_grp_id" style="width:80" maxlength="10" dataformat="engup"><br>
             <input type="text" name="cust_grp_nm" style="width:200" maxlength="50" dataformat="engup"><br>
             <select style="width:50;" name="cust_grp_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
			 </select><br>
             <select style="width:85;" name="cust_grp_delt_flg">
					<option value="ALL" selected="selected">ALL</option>
					<option value="N">Active</option>
					<option value="Y">Delete</option>
			  </select><br>
              <input name="cust_grp_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="cust_grp_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_COM_0006.do' + param, 780, 420, 'getCOM_COM_0006', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>

  	<tr>
    	<td>
<A name=COM_COM_0007><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>31. Vendor Code (COM_COM_0007)(신규 개발) </b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	Vendor Code :<br>
            	Name :<br> 
            	Mdm YN :<br>
            	Status :<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="vndr_cd" style="width:80" maxlength="6" dataformat="engup"><br>
             <input type="text" name="vndr_nm" style="width:200" maxlength="100" dataformat="engup"><br>
             <select style="width:50;" name="vndr_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
			 </select><br>
             <select style="width:85;" name="vndr_delt_flg">
					<option value="ALL" selected="selected">ALL</option>
					<option value="N">Active</option>
					<option value="Y">Delete</option>
			  </select><br>
              <input name="vndr_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="vndr_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_COM_0007.do' + param, 770, 445, 'getCOM_COM_0007', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>
    
    <tr>
    	<td>
<A name=COM_COM_0008><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>32. Sales Representative Code (COM_COM_0008)(신규 개발) </b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	Sales REP. Code :<br>
            	Name :<br> 
            	Mdm YN :<br>
            	Status :<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="srep_cd" style="width:80" maxlength="5" dataformat="engup"><br>
             <input type="text" name="srep_nm" style="width:200" maxlength="100" dataformat="engup"><br>
             <select style="width:50;" name="srep_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
			 </select><br>
             <select style="width:85;" name="srep_delt_flg">
					<option value="ALL" selected="selected">ALL</option>
					<option value="N">Active</option>
					<option value="Y">Delete</option>
			  </select><br>
              <input name="srep_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="srep_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_COM_0008.do' + param, 770, 420, 'getCOM_COM_0008', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>

    <tr>
    	<td>
<A name=COM_COM_0009><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>33. Activity Code (COM_COM_0009)(신규 개발) </b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	Activity Code :<br>
            	Description :<br> 
            	Mdm YN :<br>
            	Status :<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="act_cd" style="width:80" maxlength="2" dataformat="engup"><br>
             <input type="text" name="act_nm" style="width:200" maxlength="50" dataformat="engup"><br>
             <select style="width:50;" name="act_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
			 </select><br>
             <select style="width:85;" name="act_delt_flg">
					<option value="ALL" selected="selected">ALL</option>
					<option value="N">Active</option>
					<option value="Y">Delete</option>
			  </select><br>
              <input name="act_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="act_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_COM_0009.do' + param, 640, 420, 'getCOM_COM_0009', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>

    <tr>
    	<td>
<A name=COM_COM_0010><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>34. Movement Status Code (COM_COM_0010)(신규 개발) </b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	Movement Status Code :<br>
            	Description :<br> 
            	Mdm YN :<br>
            	Status :<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="mvmt_sts_cd" style="width:80" maxlength="2" dataformat="engup"><br>
             <input type="text" name="mvmt_sts_nm" style="width:200" maxlength="50" dataformat="engup"><br>
             <select style="width:50;" name="mvmt_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
			 </select><br>
             <select style="width:85;" name="mvmt_delt_flg">
					<option value="ALL" selected="selected">ALL</option>
					<option value="N">Active</option>
					<option value="Y">Delete</option>
			  </select><br>
              <input name="mvmt_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="mvmt_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_COM_0010.do' + param, 770, 420, 'getCOM_COM_0010', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>

    <tr>
    	<td>
<A name=COM_COM_0011><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>35. Revenue Lane Code (COM_COM_0011)(신규 개발) </b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	Revenue Lane Code :<br>
            	Description :<br> 
            	Mdm YN :<br>
            	Status :<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="rlane_cd" style="width:80" maxlength="5" dataformat="engup"><br>
             <input type="text" name="rlane_nm" style="width:200" maxlength="50" dataformat="engup"><br>
             <select style="width:50;" name="rlane_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
			 </select><br>
             <select style="width:85;" name="rlane_delt_flg">
					<option value="ALL" selected="selected">ALL</option>
					<option value="N">Active</option>
					<option value="Y">Delete</option>
			  </select><br>
              <input name="rlane_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="rlane_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_COM_0011.do' + param, 770, 420, 'getCOM_COM_0011', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>

    <tr>
    	<td>
<A name=COM_COM_0012><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>36. Trade Code (COM_COM_0012)(신규 개발) </b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	Trade Code :<br>
            	Description :<br> 
            	Mdm YN :<br>
            	Status :<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="trd_cd" style="width:80" maxlength="3" dataformat="engup"><br>
             <input type="text" name="trd_nm" style="width:200" maxlength="50" dataformat="engup"><br>
             <select style="width:50;" name="trd_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
			 </select><br>
             <select style="width:85;" name="trd_delt_flg">
					<option value="ALL" selected="selected">ALL</option>
					<option value="N">Active</option>
					<option value="Y">Delete</option>
			  </select><br>
              <input name="trd_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="trd_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_COM_0012.do' + param, 790, 450, 'getCOM_COM_0012', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>
    
    <tr>
    	<td>
<A name=COM_COM_0013><BR><BR>
        <table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#D0B0AC">
          <td colspan="4" bgcolor="#F1D1C9"><b>37. Sub Trade Code (COM_COM_0013)(신규 개발) </b> </td>
          <tr>
            <td width="100"  bgcolor="#F5E7C5" align="center">입력</td>
            <td width="250">
            	Sub Trade Code :<br>
            	Description :<br> 
            	Mdm YN :<br>
            	Status :<br>
            	Display Option:
            </td>
            <td width="500" bgcolor="#EFEFEF">
             <input type="text" name="sub_trd_cd" style="width:80" maxlength="3" dataformat="engup"><br>
             <input type="text" name="sub_trd_nm" style="width:200" maxlength="50" dataformat="engup"><br>
             <select style="width:50;" name="sub_trd_mdm_yn">
					<option value=""  selected="selected">X</option>
					<option value="Y">O</option>
			 </select><br>
             <select style="width:85;" name="sub_trd_delt_flg">
					<option value="ALL" selected="selected">ALL</option>
					<option value="N">Active</option>
					<option value="Y">Delete</option>
			  </select><br>
              <input name="sub_trd_display" type="text" size="20" maxlength="20" value="1,0,1,1,1">(예: 1,0,1,1,1)&nbsp;&nbsp;
              <input name="sub_trd_btn" type="button" class="button" value="클릭">
              <input type="button" onclick="reset()" value="지우기">
            </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
              - 공통 팝업창 호출 <br>
              @param : url    - 호출될 팝업 주소 <br>
              @param : width  - 팝업 넓이 <br>
              @param : height - 팝업 높이 <br>
              @param : func   - 팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 메소드명 <br>
              @param : display- 팝업 그리드의 컬럼 히든여부 설정 (1:보임, 0:숨김) <br>
              radio화면 = '1,0,...' &nbsp;&nbsp;&nbsp; check화면 = '0,1,...' &nbsp;&nbsp;&nbsp; radio, check가 필요없는 화면 = '0,0,...'<br>
              @param : bModal  - 팝업의 Modal 여부 (true:Modal, false:일반팝업) <br>
              <br>
              function ComOpenPopup(url, width, height, func, display, bModal)
              </td>
          </tr>
          <tr>
            <td bgcolor="#FFFFFF" align="left" colspan="4">
            	<pre>
예). display 속성(radio:1, check:0)을 다음과 같이 한다 -> '1,0,1,1,1'
ComOpenPopup('/opuscntr/COM_COM_0013.do' + param, 750, 450, 'getCOM_COM_0013', '1,0,1,1,1', true);
            	</pre>
            </td>
          </tr>
        </table>
        <br>             
<A href="#TOP">↑ Top<BR></A>
        </td>
    </tr>
    
  </table>
</form>
</body>
</html>