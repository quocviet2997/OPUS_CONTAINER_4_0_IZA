if(window["ibleaders"]==undefined){
   window["ibleaders"] = {};
}

//ibleaders.ibmditab = {
//    UserNaviWidth : 35,
//    UserNaviTop : 1
//};

// for IBMDITab
// nTabType = 0 : IBMDITab
// nTabType = 1 : IBTab
function createIBMDITab(id, width, height, strTheme, nTabType) {
	var div_str = "";
    div_str += "<div class='cIBTabMainDiv' id='DIV_" + id + "' style='width:" + width + ";height:" + height + ";'>														\n";
    div_str += "<script> IBTab('" + id + "', '" + nTabType + "','" + width + "','" + height + "','" + strTheme + "'); </script>"
	div_str += "</div>\n";

	//<![CDATA[
    document.write(div_str);
	//]]>

	window[id] =IBTabs[id];
}

function createIBTab(id, width, height, strTheme, nTabType) {
	var div_str = "";
    div_str += "<div class='cIBTabMainDiv' id='DIV_" + id + "' style='width:" + width + ";height:" + height + ";'>														\n";
    div_str += "<script> IBTab('" + id + "', '" + nTabType + "','" + width + "','" + height + "','" + strTheme + "'); </script>"
	div_str += "</div>\n";

	//<![CDATA[
    document.write(div_str);
	//]]>

	window[id] =IBTabs[id];
}

// 컨트롤에서 사용하는 문자열 정리
IBTAB7_MSG_000 = "_OnLoad() 함수가 없습니다.";
IBTAB7_MSG_001 = "는 탭이 없는 경우에만 설정 가능합니다.";
IBTAB7_MSG_002 = "는 0 보다 큰 값을 설정해야 합니다.";
IBTAB7_MSG_003 = "는 left, center, right 값 중 하나로 설정 가능합니다.";
IBTAB7_MSG_004 = "는 모바일 기기에서 탭이 없는 경우에만 설정 가능합니다.";
IBTAB7_MSG_005 = "더 이상 탭을 추가할 수 없습니다.";
IBTAB7_MSG_006 = "[IB Sheet 7] License is not valid.";
IBTAB7_MSG_007 = "[IB Sheet 7] License has expired.";
IBTAB7_MSG_008 = "컨트롤 구성요소 너비 지정에 문제가 발생했습니다.";
IBTAB7_MSG_009 = "설정된 최소 창 너비보다 공간이 부족하여 타일 정렬을 실행할 수 없습니다.";
IBTAB7_MSG_010 = "올바른 탭 번호를 입력해 주세요.";
IBTAB7_MSG_011 = " 이벤트에서 오류가 발생했습니다.";
IBTAB7_MSG_012 = "창 사이즈 값은 80 이상을 입력해주세요.";
IBTAB7_MSG_013 = "설정된 값이 없습니다.";
IBTAB7_MSG_014 = "사용자 정의영역 미사용 상태입니다.";
IBTAB7_MSG_015 = "설정 값 0,1,2를 중복되지 않게 입력해주세요.";
IBTAB7_MSG_016 = "IBMDITab 제품의 초기화가 완료되지 않았습니다.";  

IBTAB7_LicenseFileName = "license";
