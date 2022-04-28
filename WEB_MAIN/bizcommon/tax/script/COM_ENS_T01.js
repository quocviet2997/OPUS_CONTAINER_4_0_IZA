/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_T01.js
*@FileTitle  : India TAX 정보조회(공통 Popup)
*@author     : CLT
*@version    : 1.0
*@since      : 2017/05/31
=========================================================*/
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects = new Array();
var comboCnt = 0;
var iSelIdx = 1; //데이타는 무조건 1건만 존재.
var iRoundPoint = 2; //소숫점 자리수 표시 및 Round 처리 자리수.
var BACK_COLOR_RED = "#ff0000";
var BACK_COLOR_BLUE = "#d4f6ff";

// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick=processButtonClick;
// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
function processButtonClick(){
     /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
     var sheetObject=sheetObjects[0];
     /*******************************************************/
     var formObject=document.form;
	try {
		var srcName=ComGetEvent("name");
        switch(srcName) {
        	case "btn_apply":
        		
        		var obj=new Object();
    			obj.sgst_amt 	= getStringToNumber(ComGetUnMaskedValue(formObject.sgst_amt, "singledfloat"));
    			obj.cgst_amt	= getStringToNumber(ComGetUnMaskedValue(formObject.cgst_amt, "singledfloat"));
    			obj.igst_amt	= getStringToNumber(ComGetUnMaskedValue(formObject.igst_amt, "singledfloat"));
    			obj.cess_amt	= getStringToNumber(ComGetUnMaskedValue(formObject.cess_amt, "singledfloat"));
    			obj.vat_amt 	= getStringToNumber(ComGetUnMaskedValue(formObject.vat_amt, "singledfloat"));
    			
    			obj.whld2_amt	= getStringToNumber(ComGetUnMaskedValue(formObject.whld2_amt, "singledfloat"));
    			obj.gsttds_amt	= getStringToNumber(ComGetUnMaskedValue(formObject.gsttds_amt, "singledfloat"));
    			obj.whld_amt	= getStringToNumber(ComGetUnMaskedValue(formObject.whld_amt, "singledfloat"));
    			
    			var tmpSvcAcctgCd = ComGetObjValue(formObject.cmb_svc_acctg_cd);
    			if(ComIsEmpty(tmpSvcAcctgCd)){
	    			ComShowCodeMessage("COM12113", "Vendor SAC");	    			
					return;
    			}else{
    				var useFlg = ComGetComboText(cmb_svc_acctg_cd, 3);
    				if("N" == useFlg){
    					ComShowMessage("Please select a correct SAC Code.");
        				return;
        			}
    			}
    			obj.svc_acctg_cd = ComGetObjValue(formObject.cmb_svc_acctg_cd);
    			
    			//Hidden Sheet에 데이타를 셋한다.(기존 공통팝업 모듈처럼 사용하기 위한 부분)
    			sheetObject.SetCellValue(iSelIdx, "sgst_amt", obj.sgst_amt);
    			sheetObject.SetCellValue(iSelIdx, "cgst_amt", obj.cgst_amt);
    			sheetObject.SetCellValue(iSelIdx, "igst_amt", obj.igst_amt);
    			sheetObject.SetCellValue(iSelIdx, "cess_amt", obj.cess_amt);
    			sheetObject.SetCellValue(iSelIdx, "vat_amt", obj.vat_amt);
    			sheetObject.SetCellValue(iSelIdx, "whld2_amt", obj.whld2_amt);
    			sheetObject.SetCellValue(iSelIdx, "gsttds_amt", obj.gsttds_amt);
    			sheetObject.SetCellValue(iSelIdx, "whld_amt", obj.whld_amt);
    			sheetObject.SetCellValue(iSelIdx, "svc_acctg_cd", obj.svc_acctg_cd);
    			
    			sheetObject.SetCellValue(iSelIdx, "radio", 	"1");
    			sheetObject.SetCellValue(iSelIdx, "checkbox", "1");
    			sheetObject.SetSelectRow(iSelIdx);
    			
    			comPopupOK();
    			//ComPopUpReturnValue(obj);
    			
        		break;
        	case "btn_close":
        		ComClosePopup(); 
        		break;
        } // end switch
	}catch(e) {
		if( e == "[object Error]") {
			ComShowMessage(OBJECT_ERROR);
		} else {
			ComShowMessage(e.message);
		}
	}
}
/**
 * 페이지에 생성된 IBSheet Object를 sheetObjects배열에 등록한다. <br>
 * sheetObjects 배열은 공통전역변수로 상단에 정의하고, 이 함수는 {@link CoObject#ComSheetObject} 함수에 의해서 IBSheet Object가 생성되면서 자동 호출된다. <br>
 * @param {ibsheet} sheet_obj    IBSheet Object
 **/
function setSheetObject(sheet_obj){
   sheetObjects[sheetCnt++]=sheet_obj;
}
function setComboObject(combo_obj) {
    comboObjects[comboCnt++] = combo_obj;
}
function initCombo(comboObj, comboNo) {
    var formObject = document.form;
    switch (comboObj.options.id) {
        case "cmb_svc_acctg_cd":
            with (comboObj) {
                SetMultiSelect(0);
                SetUseAutoComplete(false);
				SetTitleVisible(1);//title
				SetTitle("SAC No.|Subject|Kind of Service|Use Flag");
				SetColAlign(0, "center");
				SetColAlign(1, "left");
				SetColAlign(2, "left");
				SetColAlign(3, "left");
				SetColWidth(0, "100");
				SetColWidth(1, "190");
				SetColWidth(2, "110");
				SetColWidth(3, "0");
                ValidChar(2, 1); // Uppercase
                SetDropHeight(150);
                //SetMaxLength(20);
            }
            break;
    }
}
/**
 * body.onload 이벤트에서 호출되는 함수로 페이지 로드완료 후 선처리해야할 기능을 추가한다. <br>
 * HTML컨트롤의 각종 이벤트와 IBSheet, IBTab 등을 초기화 한다. <br>
 **/
function loadPage() {
	for(i=0;i<sheetObjects.length;i++){
		//khlee-시작 환경 설정 함수 이름 변경
		ComConfigSheet (sheetObjects[i]);
		initSheet(sheetObjects[i],i+1);
		//khlee-마지막 환경 설정 함수 추가
		ComEndConfigSheet(sheetObjects[i]);
	}
	// initializing IBMultiCombo
    for (var k = 0; k < comboObjects.length; k++) {
        initCombo(comboObjects[k], k + 1);
    }

    //Vendor의 India Tax 정보 조회
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);	
	
	//Parent에서 넘어온 Param 재계산.
	setCalcVatAmount();
	
	//view_flg 조건에 따라 화면의 조회 및 Edit Object 설정. 
	setObjectEnable();
	
	initControl();
}

function initControl(){
    var formObj = document.form;        
	axon_event.addListenerForm  ('change', 'obj_change', form);
}

function obj_change(){
		var formObject=document.form;
	    var sheetObject=sheetObjects[0];
	    /*******************************************************/
	    try {
			var srcName=ComGetEvent("name");
	        switch(srcName) {
	            case "sgst_amt":
	            case "cgst_amt":
	            case "igst_amt":
	            case "cess_amt":
	            case "whld2_amt":
	            case "gsttds_amt":
	            	setCalcVatAmount();
	            	break;
	        } // end switch isRmkModFlg
		}catch(e) {
			if( e == "[object Error]") {
				ComShowMessage(OBJECT_ERROR);
			} else {
				ComShowMessage(e.message);
			}
		}
	}

function initSheet(sheetObj, sheetNo) {
	var cnt=0;
	var sheetID=sheetObj.id;

	switch (sheetNo) {
		case 1: //t1sheet1 init
			with (sheetObj) {
		        var HeadTitle1="sgst_amt|cgst_amt|igst_amt|cess_amt|vat_amt|whld2_amt|gsttds_amt|whld_amt|vndr_gst_no|ida_gst_no|svc_acctg_cd|svc_acctg_cds||";
		        SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
		        var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		        var headers = [ { Text:HeadTitle1, Align:"Center"} ];
		        InitHeaders(headers, info);
		        
		        var cols = [   {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"sgst_amt" },
				               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"cgst_amt" },
				               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"igst_amt" },
				               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"cess_amt" },
				               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"vat_amt" },
				               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"whld2_amt" },
				               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"gsttds_amt" },
				               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"whld_amt" },
				               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ida_gst_no" },//NYK GST NO
				               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"vndr_gst_no" },//India GST NO
				               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"svc_acctg_cd" },//SAC of Vendor
				               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"svc_acctg_cds" },//SAC of Vendors
				               {Type:"Radio",     Hidden:0, Width:20,   Align:"Center",  ColMerge:0,   SaveName:"radio"}, //리턴을 위해서 필수로 생성.
		                       {Type:"CheckBox",  Hidden:0, Width:20,   Align:"Center",  ColMerge:0,   SaveName:"checkbox"}//리턴을 위해서 필수로 생성.
		                       ];
		        InitColumns(cols);
		        SetEditable(1);
		        SetVisible(false);
			}
			break;
	}
	
}

//handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	if (!validateForm(sheetObj, formObj, sAction)) {
		return;
	}
	switch (sAction) {
		case IBSEARCH: //Default Vendor의 Tax 정보 조회.
			ComOpenWait(true);
			ComSetObjValue(formObj.f_cmd, SEARCH01);
			var sXml=sheetObj.GetSearchData("COM_ENS_T01GS.do", FormQueryString(formObj));
			var arrXml=sXml.split("|$$|");
			
			sheetObj.LoadSearchData(arrXml[0],{Sync:1} );
			
			ComXml2ComboItem(arrXml[1], cmb_svc_acctg_cd, "svc_acctg_cd", "svc_acctg_cd|vndr_cost_nm|cntr_vndr_svc_nm|use_flg");
			//param 값이 존재 하면 디폴트 선택
			var tmpSvcAcctgCd = ComGetObjValue(formObj.p_svc_acctg_cd);
			if(!ComIsNull(tmpSvcAcctgCd)){
				var nIdx = cmb_svc_acctg_cd.FindItem(tmpSvcAcctgCd, 0, true);
				if( nIdx == -1) {
					cmb_svc_acctg_cd.InsertItem(-1, tmpSvcAcctgCd+"|No exists in MDA Vendor master.||N", tmpSvcAcctgCd);
					
					cmb_svc_acctg_cd.SetSelectCode(tmpSvcAcctgCd);
					cmb_svc_acctg_cd.SetBackColor(BACK_COLOR_RED);
				}else{
					cmb_svc_acctg_cd.SetSelectCode(tmpSvcAcctgCd);
					cmb_svc_acctg_cd.SetBackColor(BACK_COLOR_BLUE);
				}
			}else{
				cmb_svc_acctg_cd.SetSelectIndex(0);
			}
			
			break;
	}
}
function validateForm(sheetObj, formObj, sAction) {
	switch (sAction) {
		case IBSEARCH: // search  
			return true;
			break;
	}
	return true;
}

function sheet1_OnSearchEnd(sheetObj, code, ErrMsg){
	ComOpenWait(false);
	var formObj=document.form;
	
	if(sheetObj.RowCount() > 0){
		ComSetObjValue(formObj.ida_gst_no, sheetObj.GetCellValue(iSelIdx,"ida_gst_no")); //NYK GST No
		ComSetObjValue(formObj.vndr_gst_no, sheetObj.GetCellValue(iSelIdx,"vndr_gst_no")); //India GST No 
		//ComSetObjValue(formObj.svc_acctg_cd, sheetObj.GetCellValue(iSelIdx,"svc_acctg_cd"));//SAC of vendor 
	}
}

function addComboItem(comboObj, comboItems) {
	for (var i=0 ; i < comboItems.length ; i++) {
		var comboItem=comboItems[i].split(",");
		if(comboItem.length == 1){
			comboObj.InsertItem(i, comboItem[0], comboItem[0]);
		}else{
			comboObj.InsertItem(i, comboItem[0] + "|" + comboItem[1], comboItem[1]);
		}
		
	}   		
}

function getStringToNumber(val){
	val = ComTrimAll(val,"");
	val = ComIsNull(val) ? "0" : val;
	return Number(val);
}

function setCalcVatAmount(){
	var formObj=document.form;
	
	var sgstAmt = getStringToNumber(ComGetUnMaskedValue(formObj.sgst_amt, "singledfloat"));
	var cgstAmt = getStringToNumber(ComGetUnMaskedValue(formObj.cgst_amt, "singledfloat"));
	var igstAmt = getStringToNumber(ComGetUnMaskedValue(formObj.igst_amt, "singledfloat"));
	var cessAmt = getStringToNumber(ComGetUnMaskedValue(formObj.cess_amt, "singledfloat"));
	
	var vatAmt = sgstAmt + cgstAmt + igstAmt + cessAmt;
	
	var iPointCnt = ComPointCountLength(vatAmt);
	if(iPointCnt > iRoundPoint){
		vatAmt = ComRound(vatAmt, iRoundPoint);
		iPointCnt = 0;
	}

	vatAmt = ComGetMaskedValue(vatAmt, "singledfloat");
	ComSetObjValue(formObj.vat_amt, vatAmt);
	
	var whld2Amt = getStringToNumber(ComGetUnMaskedValue(formObj.whld2_amt, "singledfloat"));
	var gsttdsAmt = getStringToNumber(ComGetUnMaskedValue(formObj.gsttds_amt, "singledfloat"));
	
	var whldAmt = whld2Amt + gsttdsAmt;
	
	iPointCnt = ComPointCountLength(whldAmt);
	if(iPointCnt > iRoundPoint){
		whldAmt = ComRound(whldAmt, iRoundPoint);
		iPointCnt = 0;
	}
	
	whldAmt = ComGetMaskedValue(whldAmt, "singledfloat");
	
	ComSetObjValue(formObj.whld_amt, whldAmt);
	
}

function setObjectEnable(){
	var formObj=document.form;
	var isEnable = true;
	var viewFlg = ComGetObjValue(formObj.view_flg);
	if(!ComIsNull(formObj.view_flg) && "Y" == viewFlg){
		isEnable = false;
	}
	
	ComEnableManyObjects(isEnable 
			, formObj.btn_apply
			, formObj.sgst_amt, formObj.cgst_amt, formObj.igst_amt, formObj.cess_amt
			, formObj.whld2_amt, formObj.gsttds_amt
			);
}



function cmb_svc_acctg_cd_OnChange(OldIndex, OldText, OldCode, NewIndex, NewText, NewCode) {
	if(OldIndex != NewIndex){
		var useFlg = ComGetComboText(cmb_svc_acctg_cd, 3);
		if("N" == useFlg){
			cmb_svc_acctg_cd.SetBackColor(BACK_COLOR_RED);
		}else{
			cmb_svc_acctg_cd.SetBackColor(BACK_COLOR_BLUE);
		}
	}
}
function ComGetComboText(comboObj, idx){
	var formObj = document.form;
	//var selIdx			= Number(comboObj.GetSelectIndex());
	//var selComboText	= comboObj.GetText(selIdx, idx);
	var selCode			= comboObj.GetSelectCode();
	var selComboText	= comboObj.GetText(selCode, idx);
	
	if(selComboText == "undefined" || selComboText == undefined || selComboText == "")
		selComboText = "";
	return selComboText;	
}
	/* 개발자 작업  끝 */