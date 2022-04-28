<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
<title>ALPS!</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<link href="css/alps_menu.css" rel="stylesheet" type="text/css">
<link href="css/alps_contents.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src='/opuscntr/js/CoObject.js'></script>
<SCRIPT LANGUAGE="javascript" SRC="/opuscntr/js/CoCommon.js" TYPE="text/javascript"></SCRIPT>
<SCRIPT LANGUAGE="javascript" SRC="/opuscntr/js/CoFormControl.js" TYPE="text/javascript"></SCRIPT>
<SCRIPT LANGUAGE="javascript" SRC="/opuscntr/js/CoMessage.js" TYPE="text/javascript"></SCRIPT>
<SCRIPT LANGUAGE="javascript" SRC="/opuscntr/js/IBSheetInfo.js" TYPE="text/javascript"></SCRIPT>
<SCRIPT LANGUAGE="javascript" SRC="/opuscntr/js/CoCalendar.js" TYPE="text/javascript"></SCRIPT>
<script language="javascript">
	var sheetObjects = new Array();
	var sheetCnt = 0;

  function setupPage(){  
	    loadPage();
    }

  function loadPage() {
		var sheetObj = document.getElementById("sheet1");
		sheetObj.RequestTimeOut = 10;
		
		ComConfigSheet(sheetObj);
		initSheet(sheetObj,1);
		ComEndConfigSheet(sheetObj);
		
		doActionIBSheet(sheetObj,document.form,IBSEARCH);
	}
	
	function searchBookmark(){
		var sheetObj = document.getElementById("sheet1");

		doActionIBSheet(sheetObj,document.form,IBSEARCH);
	}

	function createRemoveBookmark(cmd,pgmNo,prntPgmNo, dpNm ){
		var sheetObj = document.getElementById("sheet1");
		if(cmd==1){
			document.form.f_cmd.value = ADD;
			document.form.action="/opuscntr/CREATEREMOVEBOOKMARK.do?ibflag=I&pgm_no="+pgmNo+"&prnt_pgm_no=" + prntPgmNo + "&dp_nm="+dpNm;


		}else{
			document.form.f_cmd.value = REMOVE;
			document.form.action="/opuscntr/CREATEREMOVEBOOKMARK.do?ibflag=D&pgm_no="+pgmNo;
		}//end if
	}
	
	  // Sheet관련 프로세스 처리
  function doActionIBSheet(sheetObj,formObj,sAction) {
		 sheetObj.ShowDebugMsg = false;
    switch(sAction) {
			case IBSEARCH:      //조회
				formObj.f_cmd.value = SEARCH;
				sheetObj.DoSearch("BOOKMARKGS.do", FormQueryString(formObj));
				sheetObj.ShowTreeLevel(1,1);
				parent.bookmark_icon_select();
				break;
  		}
	  }

  function sheet1_OnDblClick(sheetObj, Row, Col) {
	   var pgmUrl = sheetObj.CellValue(Row,"pgm_url");
	   var pgmNo = sheetObj.CellValue(Row,"pgm_no");
		pgmUrl = pgmNo + pgmUrl.substring(pgmUrl.indexOf(".do")) + ((pgmUrl.indexOf("?")>0)? "&" : "?") + "MENU=Y&pgmNo="+pgmNo;
	   if(pgmUrl.indexOf(".do") < 0)
		   return;
	   else
		   parent.program_load(pgmNo, pgmUrl, "bookmark");
  	}
	
  function sheet1_OnSelectMenu(sheetObj,MenuString) {
	  var row = sheetObj.SelectRow;
	  var pgmUrl = sheetObj.CellValue(row,"pgm_url");
	  var pgmNo = sheetObj.CellValue(row,"pgm_no");

	  switch(MenuString){
	  case "실행하기":
		  parent.program_load(pgmNo, pgmUrl);
//		  parent.document.getElementById("main").src = pgmUrl + '?pgmNo=' + pgmNo;
		  break;
	  case "새창으로 실행하기":
//		  window.open(pgmUrl);
		  ComOpenPopup(pgmUrl, 1040,700,"", "0,0",false,false);
		  break;
	  }
	  try{
		  parent.hideBookmark();
	  }catch(e){
	  }
	  
  }
	
	function initSheet(sheetObj,sheetNo) {
	    var cnt = 0;
	    var sheetID = sheetObj.id;
	
	    switch(sheetID) {
	       case "sheet1":
			with (sheetObj) {
              	//style.height = mainTable.height;
              SheetWidth = 175;
              	//SheetWidth = mainTable.clientWidth;
              //Host정보 설정[필수][HostIp, Port, PagePath]
              	if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);
                   //전체Merge 종류 [선택, Default msNone]
              	MergeSheet = msNone;
                //전체Edit 허용 여부 [선택, Default false]
              	Editable = true;
                //행정보설정[필수][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
              	InitRowInfo(1, 1, 14, 100);
				var HeadTitle1 = "||||Bookmark Name";
				var headCount = 5;

                   //컬럼정보설정[필수][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
              	InitColumnInfo(headCount, 0, 0, true);
                   // 해더에서 처리할 수 있는 각종 기능을 설정한다
              	InitHeadMode(true, true, false, true, false,false);
                   //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
              	InitHeadRow(0, HeadTitle1, true, true);

                   //데이터속성    [ROW, COL,  DATATYPE,   WIDTH, DATAALIGN, COLMERGE, SAVENAME,  KEYFIELD, CALCULOGIC, DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
              	InitDataProperty(0, cnt++ , dtData,          30,  daCenter,  false,   "level",      false,        "",       dfNone,        0,       false,       true);
              	InitDataProperty(0, cnt++ , dtHidden,		0,		daCenter,		true,	"dp_seq",		false,		"",					dfNone,				0,		true,		true);
              	InitDataProperty(0, cnt++ , dtHidden,		0,		daLeft,			true,	"pgm_no",		false,		"",								dfNone,				0,		false,		false); 
              	InitDataProperty(0, cnt++ , dtHidden,		0,	daLeft,			true,	"pgm_url",		false,		"",										dfNone,				0,		false,		false);
              	InitDataProperty(0, cnt++ , dtData,			140,	daLeft,			true,	"dp_nm",		false,		"",									dfNone,				0,		false,		false);

              	EditableColorDiff = false;
              	
              	SheetOutLineColor = RgbColor(255,255,255);
              	SheetBackColor = RgbColor(255,255,255);
              	ColBackColor(0) = RgbColor(255,255,255);
              	ColBackColor(4) =  RgbColor(255,255,255);
              	OutLineColor  = RgbColor(255,255,255);

				CountPosition = 0;
				InitTreeInfo(0, "level",0,false);
				NodeClosePicture = "/opuscntr/img/folder.gif";
                NodeOpenPicture = "/opuscntr/img/folder_s.gif";
				ActionMenu = "실행하기|새창으로 실행하기";
			}
			break;
		}
    }
</script>


<body  onLoad="setupPage();">
<form name='form'>
	<input type='hidden' name='f_cmd'>

				<table width="100%" height="100%" id="mainTable"> 
					<tr>
						<td width="100%">
							<script language="javascript">ComSheetObject1('sheet1');</script>
						</td>
					</tr>
				</table> 			

</form>
</body>
</html>
