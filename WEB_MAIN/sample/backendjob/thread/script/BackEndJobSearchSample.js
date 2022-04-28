/*=========================================================
*Copyright(c) 2015 CyberLogitec. All Rights Reserved.
*@FileName   : BACKENDJOB.js
*@FileTitle  : BackEndJob
*@author     : CLT
*@version    : 1.0
*@since      : 2015/01/02
=========================================================*/

function BACKENDJOB() {
	this.processButtonClick=processButtonClick;
	this.setSheetObject=setSheetObject;
	this.loadPage=loadPage;
	this.initSheet=initSheet;
	this.initControl=initControl;
	this.doActionIBSheet=doActionIBSheet;
	this.setTabObject=setTabObject;
	this.validateForm=validateForm;
}
/* 개발자 작업*/
// sheetObject에 대한 배열화를 한다.
var sheetObjects=new Array();
// sheet count 를 추가한다.
var sheetCnt=0;
// JPS에서 일어난 버튼 클릭 Event를 가져오기
// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick=processButtonClick;
/**
 * 페이지에 생성된 IBSheet Object를 sheetObjects배열에 등록한다. <br>
 * sheetObjects 배열은 공통전역변수로 상단에 정의하고, 이 함수는 {@link CoObject#ComSheetObject} 함수에
 * 의해서 IBSheet Object가 생성되면서 자동 호출된다. <br>
 * 
 * @param {ibsheet}
 *            sheet_obj IBSheet Object
 */
function setSheetObject(sheet_obj) {
	sheetObjects[sheetCnt++]=sheet_obj;
}
//버튼 클릭 이벤트 처리
// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
function processButtonClick() {
	/***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
	var sheetObject1=sheetObjects[0];
	/** **************************************************** */
	var formObject=document.form;
	try {
		var srcName=ComGetEvent("name");
		switch (srcName) {
		case "btn_DoJob":
			doActionIBSheet(sheetObject1, formObject, IBBATCH);
			break;
		} // end switch
	} catch (e) {
		if (e == "[object Error]") {
			ComShowMessage(OBJECT_ERROR);
		} else {
			ComShowMessage(e.message);
		}
	}
}
/**
 * body.onload 이벤트에서 호출되는 함수로 페이지 로드완료 후 선처리해야할 기능을 추가한다. <br>
 * HTML컨트롤의 각종 이벤트와 IBSheet, IBTab 등을 초기화 한다. <br>
 **/
function loadPage() {
	var formObject=document.form;
	for (i=0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1);
		ComEndConfigSheet(sheetObjects[i]);
		doActionIBSheet(sheetObjects[i], formObject, IBSEARCH);
	}
}
/**
 * 페이지에 있는 IBSheet Object를 초기화 한다. <br>
 * IBSheet가 여러개일 경우 개수만큼 case를 추가하여 IBSheet 초기화 모듈을 구성한다. <br>
 * {@link #loadPage}함수에서 이 함수를 호출하여 IBSheet Object를 초기화 한다. <br>
 * @param {ibsheet} sheetObj    IBSheet Object
 * @param {int}     sheetNo     sheetObjects 배열에서 순번
 **/
function initSheet(sheetObj, sheetNo) {
    var cnt=0;
    switch(sheetNo) {
        case 1:      //sheet1 init
            with(sheetObj){
	              SetVisible(0);
	              }
            break;
    }
}
/**
 * IBSheet 관련 각종 기능(조회,저장 등)을 처리한다. <br>
 * {@link #processButtonClick}함수에서 이 함수를 호출하여 버튼에서 IBSheet의 기능을 호추할 때 사용한다. <br>
 * @param {ibsheet} sheetObj    IBSheet Object
 * @param {form}    formObj     Form Object
 * @param {int}     sAction     처리할 Action 코드(예:IBSEARCH,IBSAVE,IBDELETE,IBDOWNEXCEL 등이며 CoObject.js에 정의됨)
 **/
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	switch (sAction) {
	case IBBATCH: //job
		if (sheetObj.id == "sheet1") {
			form.f_cmd.value=COMMAND01;
			var sXml=sheetObj.GetSearchData("BackEndJobGS.do", FormQueryString(form));
			var backendJobKey=ComGetEtcData(sXml, "BackEndJobKey")
			if (backendJobKey.length > 0) {
				form.backendjob_key.value=backendJobKey;
				sheetObj.SetWaitImageVisible(0);
				ComOpenWait(true);
				sheetObj.SetWaitTimeOut(10000);
				timer=setInterval(getBackEndJobStatus, 3000); 	// 3초 후에
																// getBackEndJobStatus함수
																// 실행 - 재귀호출
			}
		}
		break;
	}
}
/**
 * BackEndJob 관련 Status='3' 이 될때까지 확인한다.
 */
function getBackEndJobStatus() {
	var sheetObject1=sheetObjects[0];
	form.f_cmd.value=SEARCH;
	var sXml=sheetObject1.GetSearchData("BackEndJobGS.do", FormQueryString(form));
	var jobState=ComGetEtcData(sXml, "jb_sts_flg")
	// alert("sheet1 :::>> jobState : "+jobState);
	if (jobState == "3") {
		getBackEndJobLoadFile();
		clearInterval(timer);
	} else if (jobState == "4") {
		comShowMessage("BackEndJob을 실패 하였습니다.");
		ComOpenWait(false);
	} else if (jobState == "5") {
		comShowMessage("이미 BackEndJob 결과 파일을 읽었습니다.");
	}
}
/**
 * BackEndJob의 결과가 완료되면 Excel파일로 내려받음.(Request Expense Inital)
 */
function getBackEndJobLoadFile() {
	form.f_cmd.value=SEARCHLIST;
	var sheetObject1=sheetObjects[0];
	sheetObject1.ShowDebugMsg(false);
	ComOpenWait(false);
	var sXml=sheetObject1.GetSearchData("BackEndJobGS.do", FormQueryString(form));
	form.result.value=ComGetEtcData(sXml, "RESULT")
}
/* 개발자 작업  끝 */
