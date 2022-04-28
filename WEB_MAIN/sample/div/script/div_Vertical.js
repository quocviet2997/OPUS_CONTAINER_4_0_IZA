/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : div_Vertical.js
*@FileTitle  : Vertical div sample page
*@author     : CLT
*@version    : 1.0
*@since      : 2015/01/22
=========================================================*/

var sheetObjects=new Array();
var sheetCnt=0;

document.onclick=processButtonClick;

function processButtonClick(){
    var sheetObject1=sheetObjects[0];
    var sheetObject2=sheetObjects[1];
    var formObject=document.form;
	try{
		var srcName=ComGetEvent("name");
		switch(srcName) {
	       	case "btn_retrieve":
	       		doActionIBSheet(sheetObject1,formObject,IBSEARCH);
	       		doActionIBSheet(sheetObject2,formObject,IBSEARCH);
	       		break;
	       	case "sheet1_downExcel":
	       		doActionIBSheet(sheetObject1,formObject,IBDOWNEXCEL);
	       		break;
	       	case "sheet2_downExcel":
	       		doActionIBSheet(sheetObject2,formObject,IBDOWNEXCEL);
	       		break;
		}
	}catch(e){
		if( e == "[object Error]") {
			ComShowMessage(OBJECT_ERROR);
		}else{
			ComShowMessage(e);
		}
	}
}

function setSheetObject(sheetObj){
	sheetObjects[sheetCnt++]=sheetObj;
}

function loadPage() {
	for(i=0;i<sheetObjects.length;i++){
		ComConfigSheet (sheetObjects[i]);
		initSheet(sheetObjects[i],i+1);
		ComEndConfigSheet(sheetObjects[i]);
	}
}

function initSheet(sheetObj,sheetNo) {
	var sheetID=sheetObj.id;
    switch(sheetID) {
        case "sheet1":
        case "sheet2":
        	with(sheetObj){
	        	var headers = [ {Text:"순번|상태|삭제|개봉일|영화명|영문제목|감독|주연배우|등급", Align:"Center"} ];
	        	var info = {Sort:1,ColMove:1,ColResize:1,HeaderCheck:0};
	        	var cols = [
	        		{Type:"Seq",SaveName:"SEQ",Align:"Center"},
	        		{Type:"Status",Width:30,SaveName:"STATUS",Align:"Center"},
	        		{Type:"DelCheck",Width:50,SaveName:"DEL_CHK"},
	        		{Type:"Date",Width:85,SaveName:"OPEN_DATE",Format:"Ymd",Align:"Center"},
	        		{Type:"Text",Width:150,SaveName:"MOVIE_NM"},
	        		{Type:"Text",Width:120,SaveName:"ENG_NM"},
	        		{Type:"Text",Width:100,SaveName:"DIRECTOR"},
	        		{Type:"Text",Width:120,SaveName:"ACTOR"},
	        		{Type:"Combo",Width:50,SaveName:"FILM_RATE",Align:"Center",ComboText:"12세|15세|18세|전체|청불",ComboCode:"01|02|03|04|05"}
	        	];
	
        		InitHeaders(headers,info);
        		InitColumns(cols);
        		resizeSheet();
            }
        break;
    }
}

function doActionIBSheet(sheetObj,formObj,sAction) {
    switch(sAction) {
		case IBSEARCH:      //조회
			sheetObj.DoSearch("sample/div/datasource/Data.json?cacheblock="+new Date());
			break;
		case IBDOWNEXCEL:
			sheetObj.Down2Excel();
			break;
    }
}

function resizeSheet(){
	ComResizeSheet(sheetObjects[0]);
	ComResizeSheet(sheetObjects[1]);
}