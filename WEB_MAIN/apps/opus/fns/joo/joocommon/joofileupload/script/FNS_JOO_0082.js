/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_JOO_0082.jsp
*@FileTitle  : File Upload
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/22
=========================================================*/
// ===================================================================================
// global variable abstract function
// ===================================================================================
// IBSheet 
var sheetObjects=new Array();
var sheetCnt=0;
var sheet1=null;
var uploadObjects=new Array();
var uploadCnt=0;
var upload1=null;
// html form
var frm=null;
/**
 * registering IBSheet Object as list
 * @param {ibsheet} sheetObj    IBSheet Object  
 **/
function setSheetObject(sheet_obj){
    sheetObjects[sheetCnt++]=sheet_obj;
}
/**
 * setting IBUpload Object in uploadObjects array <br>
 * @param {ibupload} uploadObj    IBUpload Object
 **/
function setUploadObject(uploadObj) {
	uploadObjects[uploadCnt++]=uploadObj;
}
// ===================================================================================
// initializing 
// ===================================================================================
/**
 * initializing sheet
 * implementing onLoad event handler in body tag
 * adding first-served functions after loading screen.
 * @param {string} year : this year
 **/
function loadPage() {
    //setting global variable
    frm=document.form;
//    sheet1 = sheetObjects[0];    
//    sheetCnt = sheetObjects.length ;   
    upload1=uploadObjects[0];
    //initializing sheet
    for(var i=0 ; i < sheetObjects.length ; i++) {
        ComConfigSheet (sheetObjects[i]);
        initSheet(sheetObjects[i],i+1);
        ComEndConfigSheet(sheetObjects[i]);              
    }
    //setting UPLOAD configuration
    for(var i=0; i < uploadObjects.length ; i++){
	    //1. setting basic configuration
	    ComConfigUpload(uploadObjects[i], "/opuscntr/FNS_JOO_0082GS.do");	
	}    
     doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}
/**
  * setting sheet initial values and header
  * @param {ibsheet} sheetObj  sheet
  * @param {int} sheetNo
  */
function initSheet(sheetObj, sheetNo) {
	var cnt=0;	
	with (sheetObj) {
		switch (sheetObj.id) {
		case "sheet1": 
            // setting height
			
			var HeadTitle1="|Sel.|Seq.|File Name|ID|Date|Download|jo_crr_cd|crr_cntc_seq|file_path|file_sav_id";
			var headCount=ComCountHeadTitle(HeadTitle1);
			(headCount, 0, 0, true);

			SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );

			var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
			var headers = [ { Text:HeadTitle1, Align:"Center"} ];
			InitHeaders(headers, info);

			var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
			             {Type:"DummyCheck", Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"del_chk" },
			             {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"" },
			             {Type:"Popup",     Hidden:0, Width:360,  Align:"Left",    ColMerge:0,   SaveName:"file_nm",        KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:50 },
			             {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:1,   SaveName:"upd_usr_id",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:1,   SaveName:"upd_dt",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Image",     Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"file_download",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"jo_crr_cd" },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"crr_cntc_seq" },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"file_path" },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"file_sav_id",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
			 
			InitColumns(cols);
			SetSheetHeight(240);
			SetEditable(1);
			SetImageList(0,"/opuscntr/img/ico_attach.gif");
//			SetGetShowButtonImage()(1);
            break;		
		}
	}
}
// ===================================================================================
// Private function
// ===================================================================================
// ===================================================================================
// handling Form event
// ===================================================================================
// Event handler processing by button click event
document.onclick=processButtonClick;
/**
 * Event handler processing by button name
 */
function processButtonClick() {
	var srcName=ComGetEvent("name");
	var sheetObject=sheetObjects[0];
	switch (srcName) {	
        case "btn2_Row_Add":
			var row=sheetObject.DataInsert();
			sheetObject.SelectCell(row,"",true);
			break;
        case "btn2_Row_Delete":
        	var row=sheetObject.FindCheckedRow("del_chk");
        	if (row == "") {
        		ComShowCodeMessage("COM12189");
        		return;
        	}
        	ComRowHideDelete(sheetObject, "del_chk"); 
            break; 
        case "btn2_Save":   
        	doActionIBSheet(sheetObjects[0], document.form, IBSAVE);
            break;
		case "btn1_Close":
			ComClosePopup(); 
            break; 
	}
}
// ===================================================================================
// handling Sheet event
// ===================================================================================
/**
 * selecting file <br>
 * @param {ibsheet} sheet    IBSheet Object
 * @param {ibsheet} row     	selected row
 * @param {ibsheet} col     	selected col
 **/
function sheet1_OnPopupClick(sheet,row,col){
//no support[check again]CLT 	var fileName=sheet.OpenFileDialog(ComGetMsg("JOO00115","file."));	
	if(fileName.indexOf("\\") !=-1) {
		sheet.SetCellValue(row, "file_path",fileName,0);
		fileName=fileName.substr(fileName.lastIndexOf("\\")+1);
		sheet.SetCellValue(row, "file_nm",fileName,0);
	}
}
/**
 * file download <br>
 * @param {ibsheet} sheet    IBSheet Object
 * @param {ibsheet} row     	selected row
 * @param {ibsheet} col     	selected col
 * @param {String} 	value     	filename
 **/
function sheet1_OnClick(sheet,row,col,value){
	if (sheet.ColSaveName(col)!= "file_download" ||
			sheet.GetRowStatus(row)=="I") {
			return;
	}
	if(sheet.GetCellText(row, "file_sav_id") == "") {
		return;
	}
	var frm1=document.form1;
	frm1.action="/opuscntr/FileDownload?key="+sheet.GetCellText(row, "file_sav_id");
	frm1.submit();
	return;
}
/**
 * file download
 * event after sheet1 doubleClick
 * @param {ibsheet} sheet
 * @param {long} row : Row Index
 * @param {long} col : Column Index
 */
function sheet1_OnDblClick(sheet, row, col) {
 	if (sheet.ColSaveName(col)!= "file_nm" ||
 			sheet.GetRowStatus(row)=="I") {
 			return;
 	}
 	if(sheet.GetCellText(row, "file_sav_id") == "") {
 		return;
 	}
 	var frm1=document.form1;
 	frm1.action="/opuscntr/FileDownload?key="+sheet.GetCellText(row, "file_sav_id");
 	frm1.submit();
 	return;
 }
/**
 * mouse pointer move even <br>
 * @param {ibsheet} sheet    IBSheet Object
 * @param {ibsheet} Button     	selected Button
 * @param {ibsheet} Shift     	selected Shift
 * @param {int} 	X     		X coordinate
 * @param {int} 	Y     		Y coordinate
 **/
function sheet1_OnMouseMove(sheet, Button, Shift, X, Y){
	var row=sheet.MouseRow();
	var col=sheet.MouseCol();
	if (row < sheet.HeaderRows()|| col < 0) {
		return;
	}
	var saveName=sheet.ColSaveName(col);
	if (saveName!= "file_nm" && saveName!="file_download") {
		return;
	}
var status=sheet.GetRowStatus(row);
	if (saveName=="file_nm") {
		sheet.SetMousePointer((status=="I")?"Hand":"Default");
	} else if (saveName=="file_download") {
		sheet.SetMousePointer((status=="I")?"Default":"Hand");
	}
}
/**
 * business handling event
 * @param {string} sAction : action type
 */
function doActionIBSheet(sheetObj, formObj, sAction) {	
	 switch (sAction) {
	 	case IBSEARCH: //retrieve
			frm.f_cmd.value=SEARCH18;	
 			var sXml=sheetObj.GetSearchData("FNS_JOO_0082GS.do", FormQueryString(frm));
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			break;
	 	case IBSAVE: 
	 		frm.f_cmd.value=MULTI;		
	 		//caution : encoding in case of file saving
	 		var saveString=sheetObj.GetSaveString(false,true);
	 		if (sheetObj.IsDataModified()&& ComIsNull(saveString))  {
	 			return;
	 		}	
	 		if (ComIsNull(saveString))  {			
	 			//msgs["JOO00036"] = "There is no data to save.";
	 			ComShowCodeMessage("JOO00036");
	 			return;
	 		}
	 		var sRow=sheetObj.FindStatusRow("I");
	 		var arrRow=sRow.split(";");
	 		//initializing file
	 		upload1.Files="";
	 		for(var i=0 ; i < arrRow.length - 1 ; i++) {
	 			var row=arrRow[i];			
	 			//getting file path
	 			var sFile=sheetObj.GetCellValue(row , "file_path");
	 			upload1.AddFile(sFile);
	 		}
	 		var param=FormQueryString(frm) + "&" + saveString;
	 		// Upload
	 		if (!ComIsNull(upload1.LocalFiles)) {			
	 			upload1.ExtendParam=param;
	 			upload1.ParamDecoding=true;
	 			sheetObj.SetWaitImageVisible(0);
	 			ComOpenWait(true);			
	 			var sXml=upload1.DoUpload(true);			
 	 			sheetObj.LoadSaveData(sXml);
	 			ComOpenWait(false);
	 			sheetObj.SetWaitImageVisible(1);
	 			var errorYn=ComGetEtcData( sXml, "ERROR_YN");			
	 			if (errorYn == "N") {
	 			doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
	 		}
		// common
	 		} else {			
	 			param=FormQueryString(frm) + "&" + sheetObj.GetSaveString();
 	 			var sXml=sheetObj.GetSaveData("FNS_JOO_0082GS.do",  param);
 	 			sheetObj.LoadSaveData(sXml);
	 			var errorYn=ComGetEtcData( sXml, "ERROR_YN");
	 			if (errorYn == "N") {
	 				doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
	 			}			
	 		}
	 		break;
	 	}
}
