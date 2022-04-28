
var ipageNo =1 ;

var sheetObjects = new Array();
var sheetCnt = 0;
var selectVal;

document.onclick = processButtonClick;

function processButtonClick() {
	var sheetObject = sheetObjects[0];
	var formObject = document.form;

	try {
		var srcName = window.event.srcElement.getAttribute("name");

		switch (srcName) {

		case "btn_Retrieve":
			doActionIBSheet(sheetObject, formObject, IBSEARCH);
			break;

		case "btn_DownExcel":
			doActionIBSheet(sheetObject, formObject, IBDOWNEXCEL);
			break;

		} // end switch
	} catch (e) {
		if (e == "[object Error]") {
			showErrMessage(OBJECT_ERROR);
		} else {
			ComShowMessage(e);
		}
	}
}

   function setSheetObject(sheet_obj) {
	   	sheetObjects[sheetCnt++] = sheet_obj;
	   	}

   function loadPage() {

			for (i = 0; i < sheetObjects.length; i++) {
		
				// khlee-?? ?? ?? ?? ?? ??
				ComConfigSheet(sheetObjects[i]);
		
				initSheet(sheetObjects[i], i + 1);
				// khlee-??? ?? ?? ?? ??
				ComEndConfigSheet(sheetObjects[i]);
			}
			var sheetObject = sheetObjects[0];
			var formObject = document.form;

   		}
    
   function initSheet(sheetObj, sheetNo, colCnt) {

			var cnt = 0;
		
			switch (sheetObj.id) {
			case "sheet1": // IBSheet1 init
				with (sheetObj) {

					style.height = GetSheetHeight(10);
					SheetWidth = mainTable.clientWidth;
		
					if (location.hostname != "")
						InitHostInfo(location.hostname, location.port, page_path);
		
					MergeSheet = msHeaderOnly;
		
					Editable = true;
					InitRowInfo(1, 1, 9, 50);
					InitHeadMode(true, true, true, true, false, false)

					//컬럼개수에 따라 해더 글자 만들기  
					var HeadTitle = "";
					if (colCnt == undefined) {
						HeadTitle += "|Office|Office Name|Office Type|Location|Program";
					} else {
						var aryHead = new Array(colCnt);
						HeadTitle += aryHead.join("|");
					}
					colCnt = ComCountHeadTitle(HeadTitle);
					InitColumnInfo(colCnt, 0, 0, true);
		
					InitHeadRow(0, HeadTitle, true);
		
//					InitDataProperty(0, cnt++, dtSeq, 30, daCenter, false, "", false,	"", dfNone, 0, false, true);
					for (var ic=0; ic<colCnt; ic++) {
						InitDataProperty(0, cnt++, dtData, 100, daCenter, false, "data" + ic, false,"", dfNone, 0, false, true);
					}
				}
				break;
			case "sheet2": // IBSheet1 init
				with (sheetObj) {

					style.height = GetSheetHeight(10);
					SheetWidth = mainTable.clientWidth;
		
					if (location.hostname != "")
						InitHostInfo(location.hostname, location.port, page_path);
		
					MergeSheet = msHeaderOnly;
		
					Editable = true;
					InitRowInfo(1, 1, 9, 50);
					InitColumnInfo(7, 0, 0, true);
		
					InitHeadMode(true, true, true, true, false, false)
		
					var HeadTitle = "SEQ|Office|Office Name|Office Type|Location|Program";
		
					InitHeadRow(0, HeadTitle, true);
		
					InitDataProperty(0, cnt++, dtSeq, 30, daCenter, false, "", false,	"", dfNone, 0, false, true);
					InitDataProperty(0, cnt++, dtData, 100, daCenter, false, "ofc_cd", false,"", dfNone, 0, false, true);
					InitDataProperty(0, cnt++, dtData, 250, daCenter, false, "ofc_eng_nm", false,"", dfNone, 0, false, true);
					InitDataProperty(0, cnt++, dtData, 90, daCenter, false, "ofc_knd_cd", false,"", dfNone, 0, false, true);
					InitDataProperty(0, cnt++, dtData, 70, daCenter, false, "loc_cd", false,"", dfNone, 0, false, true);
					InitDataProperty(0, cnt++, dtPopup, 70, daCenter, false, "pgm_assign", false,"", dfNone, 0, true, true);
				}
				break;		
			}
		}

    function doActionIBSheet(sheetObj, formObj, sAction, a, PageNo) {
				sheetObj.ShowDebugMsg = false;
				switch (sAction) {
				case IBSEARCH: // ??
					if (validateForm(sheetObj, formObj, sAction))
			
					formObj.f_cmd.value = SEARCH;
					selectVal = FormQueryString(formObj);
					var sXml = sheetObj.GetSearchXml("ADM_SYS_0006GS.do", selectVal);
					
					var arrXml = sXml.split("|$$|");

					if (arrXml.length>0) {
						//가변 컬럼 개수 정보 가져오
						var colCnt = ComGetEtcData(arrXml[0], "COLCOUNT0");
						var bChangeCol = (colCnt != undefined && colCnt != "" && colCnt != "0");
						if (bChangeCol) {
							//가변 컬럼 개수에 따라 Sheet의 모양 변경하
							sheetObj.RemoveAll();
							sheetObj.Reset();
							initSheet(sheetObj, 0, colCnt.parseInt());
						}						
						//데이터 로드하
						sheetObj.LoadSearchXml(arrXml[0]);
						sheetObj.ColBackColor(0)=sheetObj.HeadBackColor;
						
						//데이터행을 읽어서 해더타이틀 글자를 구성한다. 반드시 LoadSearchXml호출 후에 해야 데이터행이 로드되므로 주의한다.
						if (bChangeCol) {
							setHeadTitle(sheetObj, 1, "");
						}
					}
					if (arrXml.length>1) sheetObjects[1].LoadSearchXml(arrXml[1]);


					break;
				case IBSEARCHAPPEND: // ??? ??
					formObj.f_cmd.value = SEARCHLIST;
					sheetObj.DoSearch4Post("ADM_SYS_0006GS.do", selectVal,
							"iPage=" + PageNo, true);
					break;
			
				}
			}

    function sheet1_OnScrollNext(sheet,CondParam, PageNo, OnePageRows) {
       doActionIBSheet(sheetObjects[0], document.form, IBSEARCHAPPEND, true, PageNo);
    	}  

			function sheet1_OnPopupClick(sheetObj, Row, Col) {
				switch (sheetObj.ColSaveName(Col)) {
				case "pgm_assign":
						ComOpenPopup('/opuscntr/officeProgramMapping.do?ofc_cd='+ sheetObj.CellValue(Row, "ofc_cd") + "&ofc_nm="	+ escape(sheetObj.CellValue(Row, "ofc_eng_nm")), 700, 474,'setPrntUsrRoleCd', '1,0,1,1,1,1,1,1,1,0', true, false,Row, Col, 0);
						doActionIBSheet(sheetObj, document.form, IBSEARCH);
						break;
				}
			}


    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
        			}
        return true;
    		}

    /**
     * 데이터행에서 해더행을 구성한다. 데이터 첫행부터 headerRowCnt 개수만큼의 데이터행의 글자를 읽어서 해더타이틀글자를 구성한다. <br>
     * 해더행으로 구성된 데이터행은 숨겨서 보이지 않도록 한다.  <br>
     */ 
    function setHeadTitle(sheetObj, headerRowCnt, headPrefix) {
    		// 데이터가 없는 경우 처리하지 않는다.
    		if (sheetObj.SearchRows<=0) return;
    		
    		var colCnt = sheetObj.LastCol;
				var aryHead = new Array(colCnt);
				var strow = sheetObj.HeaderRows;
				var stcol = 0;
				
				//해더글자에 항상고정적으로 들어가야 하는 글자가 있는 경우 처리하
				if (headPrefix!=undefined && headPrefix != ""){
					var aryPrefix = headPrefix.split("|");
					stcol =aryPrefix.length;
					
					for (var i=0; i<stcol; i++){
						aryHead[i] = aryPrefix[i];
					}
				}
				
				//데이터행에서 글자 가져와서 해더에 설정하기 
				for (var ir=strow; ir<strow+headerRowCnt;ir++){
					for (var ic=stcol; ic<=colCnt; ic++){
						aryHead[ic] = sheetObj.CellText(ir,ic);
					}
					sheetObj.RowHidden(ir) = true;
					sheetObj.InitHeadRow(ir-strow, aryHead.join("|"), true);
				}
    	}