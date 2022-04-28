<html>
<head>
<title>IBSheet Action 메뉴</title>
<link href="css/opus_contents.css" rel="stylesheet" type="text/css">
<script language="javascript" src="js/IBSheetInfo.js"></script>
<script language="javascript" src="js/CoFormControl.js"></script>
<script language="javascript" src="js/CoMessage.js"></script>
<script language="javascript" src="js/Cowait.js"></script>
<script language="javascript">
/*Sheet 기본 설정 */
function LoadPage(){
  with (mySheet)
  {
  	//전체 너비 설정
    SheetWidth = 750;
  
    //Host정보 설정[필수][HostIp, Port, PagePath]
    if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);
  
    //전체Merge 종류 [선택, Default msNone]
    MergeSheet = msNone;
  
    //전체Edit 허용 여부 [선택, Default false]
    Editable = true;
  
    //행정보설정[필수][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
    InitRowInfo( 1, 1, 16);
  
    //컬럼정보설정[필수][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
    InitColumnInfo(9, 3, 0, false);
    
    InitHeadMode(true, true, false, true, false,false)
  
    //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
    InitHeadRow(0, "상태|삭제|요청일|신청서종류\n(콤보+메뉴)|작성자|부서|상태\n(콤보+메뉴)|승인여부\n(메뉴)|승인\n코드", false);
  
    //데이터속성[ROW,COL,DATATYPE,    WIDTH,DATAALIGN,COLMERGE,SAVENAME,      KEYFIELD, CALCULOGIC,DATAFORMAT,POINTCOUNT,UPDATEEDIT,INSERTEDIT,EDITLEN,FULLINPUT,SORTENABLE,TOOLTIP,ALLCHECK, SAVESTATUS, FORMATFIX]    
    InitDataProperty(0, 0, dtStatus,    40,   daCenter,  true,   "sStatus");
    InitDataProperty(0, 1, dtDelCheck,  0,    daCenter,  true,   "sCheck");
    InitDataProperty(0, 2, dtData,      75,   daCenter,  false,  "sDate",      false,    "",       dfDateYmd,  0,          false);
    InitDataProperty(0, 3, dtCombo,     110,  daLeft,    false,  "appl_cd");
    InitDataProperty(0, 4, dtData,      90,   daCenter,  false,  "makeman",    false,    "",       dfNone,     0,          false);
    InitDataProperty(0, 5, dtData,      215,  daLeft,    false,  "dep",        false,    "",       dfNone,     0,          false);
    InitDataProperty(0, 6, dtCombo,     75,   daLeft,    false,  "status_cd");
    InitDataProperty(0, 7, dtData,      0,    daCenter,  false,  "confirm_yn", false,    "",       dfNone,     0,          false);
    InitDataProperty(0, 8, dtHidden,    0,    daCenter,  false,  "confirm_cd", false,    "",       dfNone,     0,          false);

    Visible = true;
                        
    InitDataCombo (0, 3, "재직증명서|콘도신청|경조신청|원천징수영수증|경력증명서|소득세납세필증명|퇴직증명서|근태신청|반별근태신청|휴일근무신청서|관리직연/월차신청|쿠폰신청|전환배치|사내공모신청|교육신청|어학신청","101|104|106|107|110|111|112|201|202|203|204|205|310|320|330|331");
    InitDataCombo (0, 6, "결재처리중|결재완료|결재대기","01|02|03");

    ActionMenu = "선택영역선택|전체선택|-|선택취소"
    
    MultiSelection = true;
    SelectionMode = smSelectionRow;
    
    IBS_RestoreGridSetting("nhc123", "saveHeaderOrder", mySheet);
    doAction("Search");
  }
  
  with (mySheet2)
  {
    //전체 너비 설정
    SheetWidth = 750;
  
    //Host정보 설정[필수][HostIp, Port, PagePath]
    if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);
  
    //전체Merge 종류 [선택, Default msNone]
    MergeSheet = msHeaderOnly;
  
    //전체Edit 허용 여부 [선택, Default false]
    Editable = true;
  
    //행정보설정[필수][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
    InitRowInfo( 2, 1, 16);
  
    //컬럼정보설정[필수][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
    InitColumnInfo(9, 3, 0, false);
    
    InitHeadMode(true, true, false, true, false,false)
  
    //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
    InitHeadRow(0, "상태|삭제|요청일|신청서종류|저작권|저작권|상태|승인여부|승인", true);
    InitHeadRow(1, "상태|삭제|요청일|신청서종류|작성자|부서|상태|승인여부|승인", false);
      
    //데이터속성[ROW,COL,DATATYPE,    WIDTH,DATAALIGN,COLMERGE,SAVENAME,      KEYFIELD, CALCULOGIC,DATAFORMAT,POINTCOUNT,UPDATEEDIT,INSERTEDIT,EDITLEN,FULLINPUT,SORTENABLE,TOOLTIP,ALLCHECK, SAVESTATUS, FORMATFIX]    
    InitDataProperty(0, 0, dtStatus,    40,   daCenter,  true,   "sStatus");
    InitDataProperty(0, 1, dtDelCheck,  0,    daCenter,  true,   "sCheck");
    InitDataProperty(0, 2, dtData,      75,   daCenter,  true,  "sDate",      false,    "",       dfDateYmd,  0,          false);
    InitDataProperty(0, 3, dtCombo,     110,  daLeft,    true,  "appl_cd");
    InitDataProperty(0, 4, dtData,      90,   daCenter,  false,  "makeman",    false,    "",       dfNone,     0,          false);
    InitDataProperty(0, 5, dtData,      215,  daLeft,    false,  "dep",        false,    "",       dfNone,     0,          false);
    InitDataProperty(0, 6, dtCombo,     75,   daLeft,    true,  "status_cd");
    InitDataProperty(0, 7, dtData,      0,    daCenter,  true,  "confirm_yn", false,    "",       dfNone,     0,          false);
    InitDataProperty(0, 8, dtHidden,    0,    daCenter,  true,  "confirm_cd", false,    "",       dfNone,     0,          false);

    Visible = true;
                        
    InitDataCombo (0, 3, "재직증명서|콘도신청|경조신청|원천징수영수증|경력증명서|소득세납세필증명|퇴직증명서|근태신청|반별근태신청|휴일근무신청서|관리직연/월차신청|쿠폰신청|전환배치|사내공모신청|교육신청|어학신청","101|104|106|107|110|111|112|201|202|203|204|205|310|320|330|331");
    InitDataCombo (0, 6, "결재처리중|결재완료|결재대기","01|02|03");

    ActionMenu = "선택영역선택|전체선택|-|선택취소"
    
    MultiSelection = true;
    SelectionMode = smSelectionRow;
    
    IBS_RestoreGridSetting("nhc123", "saveHeaderOrder", mySheet2);
    doAction2("Search");
  }
}


/*조회조건 에터키 이력시 조회*/
function check_Enter()
{
  if (event.keyCode==13) doAction("Search");
}

/*Sheet 각종 처리*/
function doAction(sAction)
{
  switch(sAction)
  {
    case "Search":      //조회
      mySheet.DoSearch("sample_list.html"); 
      break;
    case "SaveGridSetting":        //헤더 정렬 순서 변경
	  //zu_openRunning(true);
      IBS_SaveGridSetting("nhc123", "saveHeaderOrder", mySheet);
	  break;	  
    case "RestoreGridSetting":        //헤더 정렬 순서 변경
      IBS_RestoreGridSetting("nhc123", "saveHeaderOrder", mySheet);
	  break;
	case "DelGridSetting":        //헤더 정렬 순서 변경
      IBS_DelGridSetting("nhc123", "saveHeaderOrder", mySheet);
	  break;
  }
  
}

/*Sheet 각종 처리*/
function doAction2(sAction)
{
  switch(sAction)
  {
    case "Search":      //조회
      mySheet2.DoSearch("sample_list.html"); 
      break;
    case "SaveGridSetting":        //헤더 정렬 순서 변경
      IBS_SaveGridSetting("nhc123", "saveHeaderOrder", mySheet2);
	  break;	  
    case "RestoreGridSetting":        //헤더 정렬 순서 변경
      IBS_RestoreGridSetting("nhc123", "saveHeaderOrder", mySheet2);
	  break;
	case "DelGridSetting":        //헤더 정렬 순서 변경
      IBS_DelGridSetting("nhc123", "saveHeaderOrder", mySheet2);
	  break;
  }
  
}

</script>

<script language="javascript" for="mySheet" event="OnSelectMenu(sAction)">
  //메뉴에 대한 처리
  switch(sAction){
    case "선택영역선택" :
      var sRowStr = mySheet.GetSelectionRows("/");
	  
      //자바 스크립트 배열로 만들기
      var arr = sRowStr.split("/");
      for (i=0; i<arr.length; i++) {
      	CellValue2(arr[i], "sCheck") = 1;
      }
      
      break;

    case "전체선택" :
      CheckAll2(1) = 1;                     break;
    case "선택취소" :
      CheckAll2(1) = 0;                     break;
  }
</script>


<body leftmargin="20" topmargin="20" marginwidth="0" marginheight="0" onload="LoadPage()">

<!--타이틀-->
<p class="pagetitle">
헤더 정렬 순서 보관
</p> 

<table width="750px" cellspacing="1" cellpadding="0" >
  <!--각종기능버튼-->
  <tr>
     <td width="250px" class="titlesmall"> 기능버튼</td>
     <td width="500px" align="right">
        <!--조회-->
        <input type="button" class="button" value="조회" onClick="doAction('Search');" >
        <a href="javascript:doAction('SaveGridSetting');"><img src="/opuscntr/img/opus/button/btn_ib_save.gif" class="icon" border="0"></a>
        <input type="button" class="button" value="헤더 세팅 불러오기" onClick="doAction('RestoreGridSetting');" >
        <input type="button" class="button" value="헤더 세팅 삭제" onClick="doAction('DelGridSetting');" >
    </td>
  </tr>
    
  <tr>
    <td colspan="2" height="11">&nbsp;</td>
  </tr>
  <tr>
     <td colspan="2" width="250px" class="titlesmall">
      조회리스트
     </td>     
  </tr>
  <tr>
    <td colspan="2">
      <OBJECT ID="mySheet" CLASSID="CLSID:341FBC5F-2AE4-41B8-BFE5-A03170569A27"
              CODEBASE="/opuscntr/sheet/IBSheet3.CAB#version=3,4,0,12">
      <param name="Visible" value="false">
      <param name="UseUTF8" value="true">
      </OBJECT>
    </td>
  </tr>

</table>
<p><hr>
<table width="750px" cellspacing="1" cellpadding="0" >
  <!--각종기능버튼-->
  <tr>
     <td width="250px" class="titlesmall"> 기능버튼</td>
     <td width="500px" align="right">
        <!--조회-->
        <input type="button" class="button" value="조회" onClick="doAction2('Search');" >
        <a href="javascript:doAction2('SaveGridSetting');"><img src="/opuscntr/img/opus/button/btn_ib_save.gif" class="icon" border="0"></a>
        <input type="button" class="button" value="헤더 세팅 불러오기" onClick="doAction2('RestoreGridSetting');" >
        <input type="button" class="button" value="헤더 세팅 삭제" onClick="doAction2('DelGridSetting');" >
    </td>
  </tr>
    
  <tr>
    <td colspan="2" height="11">&nbsp;</td>
  </tr>
  <tr>
     <td colspan="2" width="250px" class="titlesmall">
        조회리스트
     </td>
  </tr>
  <tr>
    <td colspan="2">
   	  <OBJECT ID="mySheet2" CLASSID="CLSID:341FBC5F-2AE4-41B8-BFE5-A03170569A27"
              CODEBASE="/opuscntr/sheet/IBSheet3.CAB#version=3,4,0,12">
      <param name="Visible" value="false">
      <param name="UseUTF8" value="true">
      </OBJECT>
    </td>
  </tr>

</table>
</body>
</html>

