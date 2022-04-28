/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : ADM_SYS_0006.js
*@FileTitle  : officeprogram
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
var ipageNo=1 ;
var sheetObjects=new Array();
var sheetCnt=0;
var selectVal;
document.onclick=processButtonClick;
function processButtonClick() {
	var sheetObject=sheetObjects[0];
	var formObject=document.form;
	try {
		var srcName=ComGetEvent("name");
		switch (srcName) {
		case "btn_Retrieve":
			doActionIBSheet(sheetObject, formObject, IBSEARCH);
			break;
		case "btn_DownExcel":
			doActionIBSheet(sheetObject, formObject, IBDOWNEXCEL);
			break;
		case "btn_ofc_cd":
			ComOpenPopupWithTarget('/opuscntr/COM_ENS_071.do?ofc_pts_cd=ALL', 700, 520, "ofc_cd:ofc_cd", '0,0,1,1,1,1,1,1', true);
			break;
		case "btn_Help":
			doActionIBSheet(sheetObject, formObject, COMMAND01);
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
	   	sheetObjects[sheetCnt++]=sheet_obj;
	   	}
   function loadPage() {
			for (i=0; i < sheetObjects.length; i++) {
				ComConfigSheet(sheetObjects[i]);
				initSheet(sheetObjects[i], i + 1);
				ComEndConfigSheet(sheetObjects[i]);
			}
			var sheetObject=sheetObjects[0];
			var formObject=document.form;
   		}
   function initSheet(sheetObj, sheetNo, colCnt) {
			var cnt=0;
			switch (sheetObj.id) {
			case "sheet1": // IBSheet1 init
			with(sheetObj){
		      var HeadTitle="SEQ|Office|Office Name|Office Type|Location|Program";

		      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );
		      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
		      var headers = [ { Text:HeadTitle, Align:"Center"} ];
		      InitHeaders(headers, info);

		      var cols = [ {Type:"Seq",       Hidden:0, Width:60,   Align:"Center",  ColMerge:0,   SaveName:"",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Text",      Hidden:0, Width:350,  Align:"Center",  ColMerge:0,   SaveName:"ofc_eng_nm",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Text",      Hidden:0, Width:120,   Align:"Center",  ColMerge:0,   SaveName:"ofc_knd_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Text",      Hidden:0, Width:100,   Align:"Center",  ColMerge:0,   SaveName:"loc_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Popup",     Hidden:0, Width:100,   Align:"Center",  ColMerge:0,   SaveName:"pgm_assign",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
		       
		      InitColumns(cols);
		      resizeSheet();
		    }
		break;		
		}
	}
   
   function resizeSheet(){
  	         ComResizeSheet(sheetObjects[0]);
  }
    function doActionIBSheet(sheetObj, formObj, sAction, a, PageNo) {
				sheetObj.ShowDebugMsg(false);
				switch (sAction) {
				case IBSEARCH: // ??
					ComOpenWait(true);
					if (validateForm(sheetObj, formObj, sAction))
					formObj.f_cmd.value=SEARCH;
					selectVal=FormQueryString(formObj);
					iPageNo = 1;
 					var sXml = sheetObj.DoSearch("ADM_SYS_0006GS.do", selectVal );
					sheetObj.LoadSearchData(sXml,{Sync:1} );
					break;
				case IBSEARCHAPPEND: // ??? ??
					formObj.f_cmd.value=SEARCHLIST;
 					sheetObj.DoSearch("ADM_SYS_0006GS.do", selectVal+ "&iPage="+PageNo, {Append:true});
					break;
				case IBDOWNEXCEL: // ??? ??
					if(sheetObj.RowCount() < 1){
						ComShowCodeMessage("COM132501");
					}else{
						sheetObj.Down2Excel({ HiddenColumn:1});
					}
					break;
				case COMMAND01:
					var param="?pgmId=ADM_SYS_0006&userId=opus3&showMenu=N&showHeader=N&appId=00000005&locale=en"
					var url="http://www.p2gether.com/HelpOneSV/linkHelpOne.do";
					ComOpenWindowCenter(url+param, "", 980,550, false, true);
			    	break;
				}
			}
    var iPageNo = 1;
    function sheet1_OnVScroll(sheetObj, vpos, oldvpos, isTop, isBottom) {
        if (!isBottom || sheetObj.RowCount() >= sheetObj.GetTotalRows()) return;
       doActionIBSheet(sheetObjects[0], document.form, IBSEARCHAPPEND, true, ++iPageNo);
    	}  
			function sheet1_OnPopupClick(sheetObj, Row, Col) {
				switch (sheetObj.ColSaveName(Col)) {
				case "pgm_assign":
						ComOpenPopup('/opuscntr/ADM_SYS_0006Pop.do?ofc_cd='+ sheetObj.GetCellValue(Row, "ofc_cd") + "&ofc_nm="	+ escape(sheetObj.GetCellValue(Row, "ofc_eng_nm")), 950, 550,'setPrntUsrRoleCd', '1,0,1,1,1,1,1,1,1,0', true, false,Row, Col, 0);
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
    		if (sheetObj.SearchRows()<=0) return;
    		var colCnt=sheetObj.LastCol();
				var aryHead=new Array(colCnt);
				var strow=sheetObj.HeaderRows();
				var stcol=0;
				//해더글자에 항상고정적으로 들어가야 하는 글자가 있는 경우 처리하
				if (headPrefix!=undefined && headPrefix != ""){
					var aryPrefix=headPrefix.split("|");
					stcol=aryPrefix.length;
					for (var i=0; i<stcol; i++){
						aryHead[i]=aryPrefix[i];
					}
				}
				//데이터행에서 글자 가져와서 해더에 설정하기 
				for (var ir=strow; ir<strow+headerRowCnt;ir++){
					for (var ic=stcol; ic<=colCnt; ic++){
						aryHead[ic]=sheetObj.GetCellText(ir,ic);
					}
					sheetObj.SetRowHidden(ir,1);
				}
    	}
    
    function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) { 
    	ComOpenWait(false);
    }
