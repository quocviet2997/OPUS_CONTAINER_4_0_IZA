<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<script language="javascript" type="text/javascript" src="/opuscntr/js/common/CoPopup.js"></script>
<script language="javascript" type="text/javascript" >
	function setupPage(){
	}
</script>

<form name="form">

<div class="layer_popup_title">
	<div class="page_title_area clear">
		<h2 class="page_title"><span>MRD Common Popup Sample</span></h2>
		
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" onclick="ComOpenRDPopup()">Fire</button><!-- 
			--><button type="button" class="btn_normal" onclick="ComClosePopup()">Close</button>
		</div>
	</div>
</div>

<div class="layer_popup_contents">
	<div class="wrap_result">
		<div class="opus_design_inquiry wFit">
			<table>
				<tr>
					<td>Mrd Sample1</td>
					<td><input type="text" size="100" name="com_mrdPath" value="sample/rd/mrdSample/TESTWithParam.mrd"></td>
				</tr>
				<tr>
					<td>Mrd Param1</td>
					<td><input type="text" size="100" name="com_mrdArguments" value="/rp [김정훈] [안녕하세요]"></td>
				</tr>
				<tr>
					<td>Mrd Sample2</td>
					<td><input type="text" size="100" name="com_mrdPath" value="sample/rd/mrdSample/TEST.mrd"></td>
				</tr>
				<tr>
					<td>Mrd Param2</td>
					<td><input type="text" size="100" name="com_mrdArguments" value=""></td>
				</tr>
				<tr>
					<td>Default 저장 디렉토리</td>
					<td><input type="text" size="100" name="com_mrdSaveDialogDir" value="c:\\MyFolder\\"></td>
				</tr>
				<tr>
					<td>Default 저장 파일명</td>
					<td><input type="text" size="100" name="com_mrdSaveDialogFileName" value="SaveFileName"></td>
				</tr>
				<tr>
					<td>Default 저장 파일 확장자</td>
					<td><input type="text" size="100" name="com_mrdSaveDialogFileExt" value="pdf"></td>
				</tr>
				<tr>
					<td>저장 허용 확장자</td>
					<td><input type="text" size="100" name="com_mrdSaveDialogFileExtLimit" value="xls@pdf@bmp@tif"></td>
				</tr>
				<tr>
					<td>팝업 Title</td>
					<td><input type="text" size="100" name="com_mrdTitle" value="Report Designer Common Popup Sample"></td>
				</tr>
			</table>
			
			<table class="line_bluedot">
  				<tr><td></td></tr>
			</table>
			
			<h3>프린트 시 페이지 크기 설정 : 0-A3, 1-A4, 2-B4, 3-B5, 4-LETTER, 5-136, 6-80, 7-A1, 8-A2, 9-A5</h3> 
			<h3 class="title_design">이 기능을 활성화 시키면 사용자가 설정한 프린터 용지 기억 기능이 disable 됩니다.</h3>
			<input type="text" size="125" name="com_mrdPrintPaperSize" value="1">
			
			<table class="line_bluedot">
  				<tr><td></td></tr>
			</table>
			
			<h3>Toolbar Disable 지정</h3> 
			<h3>index : Disable할 툴바 항목의 인덱스. 0-파일저장,1-인쇄,2-찾기,3-목차만들기,4-화면확대,5-화면축소,12-리포팅중지,13-엑셀로보기,14-아래아한글로보기, 15-PDF로보기, 16-파워포인트로보기, 17-워드로보기</h3>
			<h3 class="title_design">반드시 0;1;2;3;4;5;12;13;14;15;16;17 형태로 써주세요.</h3>	
			<h3 class="title_design">0 -> 정상, 0; -> 에러</h3>
			<h3 class="title_design">전부 enable 시키는 경우는 값을 안 넣으면 됩니다.</h3>
			<input type="text" size="125" name="com_mrdDisableToolbar" value="0;1;2;3;4;5;12;13;14;15;16;17">
			
			<table class="line_bluedot">
  				<tr><td></td></tr>
			</table>
			
			<table>	
				<tr>
					<td>페이지 내의 제목 지정</td>
					<td><input type="text" size="100" name="com_mrdBodyTitle" value="Report Sample"></td>
				</tr>
				<tr>
					<td>시작 화면 크기 설정</td>
					<td><input type="text" size="100" name="com_zoomIn"></td>
				</tr>
				<tr>
					<td>Batch DB 설정 Flag (Y / N)</td>
					<td><select name="com_isBatch">
							<option value="Y">Y</option>
							<option value="N" selected>N</option>
						</select></td>
				</tr>
			</table>
		</div>
	</div>
</div>
</form>
