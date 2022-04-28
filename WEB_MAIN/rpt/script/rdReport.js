/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : rdReport.js
*@FileTitle  : Common RD page
*@author     : CLT
*@version    : 1.0
*@since      : 2014/11/05
=========================================================*/	
document.onclick = processButtonClick;
function processButtonClick(){
	try {
		var srcName=ComGetEvent("name");
		switch(srcName) {
	       	case "btn_close":
	       		ComClosePopup();
	       		break;
	       	default:
	       		break;
       }
	}catch(e) {
		if( e == "[object Error]") {
			ComShowMessage(OBJECT_ERROR);
		} else {
			ComShowMessage(e);
		}
	}
}

function rdSaveFileCallBack(rtnVal){
	viewer.downloadFile(rtnVal);
}

function rdOpen() {
	var sXml = "";
	var sheetObj = [];
	var frmObj = [];
	var etcObj = "";
	sheetObj = parmModalObj[4];
	frmObj = parmModalObj[5];
	etcObj = parmModalObj[6];
	
	// 복수개의 sheet, form object 를 배열로 받아서 처리
	sXml = "<?xml version='1.0' ?><SHEET>";

	sheetCnt = 1 ;
	for ( i= 0 ; i < sheetObj.length ; i++){
		sheetCnt = i + 1 ;
		if( sheetObj[i].RowCount() === 0){
			sXml += "<SHEET" + sheetCnt + "><DATA TOTAL='0'><TR>";
			for(j=0; j<= sheetObj[i].LastCol() ; j++){
				sXml += "<TD></TD>";
			}
			sXml += "</TR></DATA></SHEET"+ sheetCnt +">";
		}else{
			sXml += RD_GetDataSearchXml(sheetObj[i], sheetCnt);
		}
	}
	sXml += "</SHEET>" ;
	
	var	mrdPath = parmModalObj[3];
	
	var formParam = "/rv "  ;
	for ( k = 0 ; k < frmObj.length ; k++){
		formParam += RD_FormQueryString(frmObj[k], k+1);
	}
	if( etcObj !== undefined ) {
	     if( etcObj.length > 0 ) {
	        formParam = formParam + etcObj;
	    }
	}
	viewer.setRData(sXml);
	viewer.openFile(mrdPath, RDServer + formParam, {timeout:1800});
}