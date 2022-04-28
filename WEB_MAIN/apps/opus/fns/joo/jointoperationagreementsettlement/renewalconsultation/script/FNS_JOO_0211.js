/*
=========================================================
 *Copyright(c) 2018 CyberLogitec. All Rights Reserved.
 *@FileName   : FNS_JOO_0211.js
 *@FileTitle  : Issuing a THEA Invoice Report
 *@author     : CLT
 *@version    : 1.0
 *@since      : 2018/10/19
=========================================================
 */
var sheetObjects = new Array();
var sheetCnt = 0;
var comboObjects = new Array();
var comboCnt = 0;
var rdObjects = new Array();
var rdCnt = 0;
var noData = false;
var ofcCd = "";
document.onclick = processButtonClick;
/**
 * Sheet 기본 설정 및 초기화
 * body 태그의 onLoad 이벤트핸들러 구현
 * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
 */
function loadPage() {
	//전역 변수 설정
	var formObj=document.form;
    for (i = 0; i < sheetObjects.length; i++) {
        ComConfigSheet(sheetObjects[i]);
        initSheet(sheetObjects[i], i + 1);
        ComEndConfigSheet(sheetObjects[i]);
    }
    for(var k=0; k < comboObjects.length; k++){
        initCombo(comboObjects[k], k + 1);
    }
    initControl();
    if(formObj.pop_flg.value == 'N'){
    	doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC01);	
    }else{
    	searchRetreive();
    }
}
/**
 * handling event in case of processButtonClick
 * @return
 * @deprecated
 */
function processButtonClick() {
	var formObj=document.form;
	var srcName = ComGetEvent("name");
	switch (srcName) {
	case "btn_Preview":
		getRdOpen();
		break;
	case "btn_PopUp_InvoiceNo":
    	ComOpenPopup("FNS_JOO_0212.do?pgmNo=FNS_JOO_0212&inv_no="+formObj.inv_no.value, 620, 450, "setPopData_InvoiceNo", '1,0', true);
		break;
		//---------------- RD Control Button Start ----------------//
	case "btn_RD_ZoomOut": // btn_RD_ZoomOut
		RDControl(srcName);
    	break;
	case "btn_RD_ZoomIn": // btn_RD_ZoomIn
		RDControl(srcName);
    	break;
	case "btn_RD_FirstPage": // btn_RD_FirstPage
		RDControl(srcName);
    	break;
	case "btn_RD_PreviousPage": // btn_RD_PreviousPage
		RDControl(srcName);
    	break;
	case "btn_RD_NextPage": // btn_RD_NextPage
		RDControl(srcName);
    	break;
	case "btn_RD_LastPage": // btn_RD_LastPage
		RDControl(srcName);
    	break;
	case "btn_Close":
		ComClosePopup();
		break;
	//---------------- RD Control Button End ----------------//
	}
}
/**
 * handling process for Sheet<br>
 */
function doActionIBSheet(sheetObj,formObj,sAction) {
    sheetObj.ShowDebugMsg(false);
    switch(sAction) {
       case IBSEARCH:      //retrieve
            if(!validateForm(sheetObj,formObj,sAction)) {
                return false;
            }
            formObj.f_cmd.value=SEARCH;
 			var sXml=sheetObj.GetSearchData("FNS_JOO_0211GS.do", FormQueryString(formObj));
 			var comboRlaneCd	= ComGetEtcData(sXml, "comboRlaneCd");//inv_flg=0
 			var comboItmCd		= ComGetEtcData(sXml, "comboItmCd");//inv_flg=1
 			ofcCd = ComGetEtcData(sXml, "ofc_cd");
			if(comboRlaneCd == ''){
				ComShowCodeMessage('JOO00143');
				setInitClear();
				noData=true;	
				return false;
			}else{
				noData=false;
				MakeComboObject(combo_rlane_cd, comboRlaneCd,comboRlaneCd,true);
				MakeComboObject(combo_itm_cd, comboItmCd,comboItmCd,true);
				getRdOpen(); 
			}			
       break;
       case IBSEARCH_ASYNC01:      //retrieve
    	   if(!validateForm(sheetObj,formObj,sAction)) {
               return false;
           }
           formObj.f_cmd.value=SEARCH01;
		   var sXml=sheetObj.GetSearchData("FNS_JOO_0211GS.do", FormQueryString(formObj));
		   var inv_no    = ComGetEtcData(sXml, "inv_no");
		   if(inv_no != ''){
			   formObj.inv_no.value=inv_no;   
			   doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
		   }
		   
       break;
    }
}

/**
 * handling process for inv_no_OnChange<br>
 */
function inv_no_OnChange() {
	setInitClear();
	searchRetreive();
}

/**
 * handling process for searchRetreive<br>
 */
function searchRetreive(){
	var formObj=document.form;
   	doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);	
}

/**
 * setting Item in MakeComboObject<br>
 */
function MakeComboObject(cmbObj, sTxt,sCd, allTp) {
	cmbObj.RemoveAll();
	var arrCode=sCd.split("|");
	var arrText = sTxt.split("|");
	if (allTp) cmbObj.InsertItem(0, "ALL", "");
	for ( var i=1; i<=arrCode.length; i++) {
		cmbObj.InsertItem(i, arrText[i-1],arrCode[i-1]);
	}
	cmbObj.SetSelectIndex("0" ,false);
}

/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	switch (sAction) {
	case IBSEARCH: //retrieve
		if(!ComChkRequired(formObj)) {
			return false;
		}
		if (formObj.inv_no.value.length < 10) {
			ComShowCodeMessage('JOO00116','Invoice length 10 over');
			return false;
		}
		break;
	}
	return true;
}

/**
 * handling process for input setInitClear
 */
function setInitClear() {
	var formObj=document.form;
	combo_rlane_cd.RemoveAll();
	combo_rlane_cd.InsertItem(0, "ALL", "");
	combo_rlane_cd.SetSelectIndex("0" ,false);
	combo_itm_cd.RemoveAll();combo_itm_cd.InsertItem(0, "ALL", "");
	combo_itm_cd.SetSelectIndex("0" ,false);
	formObj.chk_vvd.checked = true;
	formObj.chk_vv.checked = false;
	formObj.chk_rmk.checked = true;
	formObj.chk_f_mm.checked = true;
	formObj.chk_f_yyyy.checked = true;
	formObj.chk_f_q.checked = true;
	formObj.chk_l_mm.checked = true;
	formObj.chk_l_yyyy.checked = true;
	formObj.chk_l_q.checked = true;
	//init
	viewer = new m2soft.crownix.Viewer(ReportingServer, "report");
}

/**
 * handling process for Agreement Pop-up Return Value<br>
 * @param Return value array
 * @param row index
 * @param col index
 * @param Sheet Array index
 */
function setPopData_InvoiceNo(rArray, row, col, SheetIdx) {
	var formObj=document.form;
	if(rArray != null){
		for(var i=0 ; i < rArray.length ; i++){
			formObj.inv_no.value=rArray[i][2];
		}
		searchRetreive();
	}
}

/**
 * handling event in case of getRdOpen
 * @return
 * @deprecated
 */
function getRdOpen() {
	var formObj=document.form;
	if(noData){
		 ComShowCodeMessage('JOO00143');
		 return;
	}
	var combo_rlane_cd =makeQuotaString(formObj.combo_rlane_cd.value);
	var combo_itm_cd = makeQuotaString(formObj.combo_itm_cd.value);
	var combo_re_divr_cd = makeQuotaString(formObj.combo_re_divr_cd.value);
	var param = "/rv val_inv_no["+formObj.inv_no.value+"] ofc_cd["+ofcCd+"] combo_re_divr_cd["+combo_re_divr_cd+"] combo_rlane_cd["+combo_rlane_cd+"] combo_itm_cd["+combo_itm_cd+"] chk_vvd["+formObj.chk_vvd.checked+"] chk_vv["+formObj.chk_vv.checked+"] chk_f_mm["+formObj.chk_f_mm.checked+"] chk_f_yyyy["+formObj.chk_f_yyyy.checked+"] chk_f_q["+formObj.chk_f_q.checked+"] chk_l_mm["+formObj.chk_l_mm.checked+"] chk_l_yyyy["+formObj.chk_l_yyyy.checked+"] chk_l_q["+formObj.chk_l_q.checked+"] chk_rmk["+formObj.chk_rmk.checked+"]";
	
	var mrdpath=RD_path + "apps/opus/fns/joo/jointoperationagreementsettlement/renewalconsultation/report/FNS_JOO_0211.mrd";
	viewer.openFile(mrdpath, RDServer + param, {timeout:1800});
}

/**
 * handling event in case of makeQuotaString
 * @return
 * @deprecated
 */
function makeQuotaString(str) {
	if(str == '') return str;
	var arrCode = str.split(",");
	var rtnVal =''; var flg = false;
	for ( var i=1; i<=arrCode.length; i++) {
		if(flg)rtnVal=rtnVal+',';
		rtnVal=rtnVal+"'"+arrCode[i-1]+"'";
		flg = true;
	}
	return rtnVal;
}

/**
 * handling event in case of RDControl
 * @return
 * @deprecated
 */
function RDControl(srcName) {
	var formObject = document.form;
	Rdviewer = viewer;
	switch (srcName) {
		case "btn_RD_ZoomOut": // btn_RD_ZoomOut
			Rdviewer.zoomIn();
			break;
		case "btn_RD_ZoomIn": // btn_RD_ZoomIn
			Rdviewer.zoomOut();
			break;
		case "btn_RD_FirstPage": // btn_RD_FirstPage
			Rdviewer.moveFirstPage();
			break;
		case "btn_RD_PreviousPage": // btn_RD_PreviousPage
			Rdviewer.prevPage();
			break;
		case "btn_RD_NextPage": // btn_RD_NextPage
			Rdviewer.nextPage();
			break;
		case "btn_RD_LastPage": // btn_RD_LastPage
			Rdviewer.moveLastPage();
			break;
	}
}

/**
 * handling event in case of initCombo
 * @return
 * @deprecated
 */
function initCombo(comboObj, comboNo) {
	switch(comboObj.options.id) {
		case "combo_itm_cd": // jo_stl_itm_cds
			with (comboObj) {
				 SetMultiSelect(1);
				 SetMultiSeparator(",");
				 SetDropHeight(150);
				 Style=0;
				 SetUseAutoComplete(1);
			}
			break;
		case "combo_rlane_cd": // rlane_cd
			with(comboObj) {
				SetMultiSelect(1);
				SetMultiSeparator(",");
				SetDropHeight(150);
				Style=0;
				SetUseAutoComplete(1);
			}
			break;
        case "combo_re_divr_cd": // Rev/Exp
            with (comboObj) { 
                SetMultiSelect(0);
                SetUseAutoComplete(1);
                SetColAlign(0, "left");
                SetColWidth(0, "90");
                SetDropHeight(160);
                ValidChar(2,1);//only upper case
                SetMaxLength(7);
            }
            comboObj.RemoveAll();
            comboObj.InsertItem(0, "","");
            comboObj.InsertItem(1, "EXPENSE","E");
            comboObj.InsertItem(2, "REVENUE","R");
            break;
	}
}

/**
 * handling event in case of OnCheckClick combo_itm_cd
 * @return
 * @deprecated
 */
function combo_itm_cd_OnCheckClick(comboObj, index, code) {
	if(index==0) {
		var bChk=comboObj.GetItemCheck(index);
		if(bChk){
			for(var i=1 ; i < comboObj.GetItemCount() ; i++) {
				comboObj.SetItemCheck(i,0);
			}
			comboObj.SetItemCheck(0,1);
		}
	} else {
		comboObj.SetItemCheck(0,0);
	}
}

/**
 * handling event in case of OnCheckClick combo_rlane_cd
 * @return
 * @deprecated
 */
function combo_rlane_cd_OnCheckClick(comboObj, index, code) {
	if(index==0) {
		var bChk=comboObj.GetItemCheck(index);
		if(bChk){
			for(var i=1 ; i < comboObj.GetItemCount() ; i++) {
				comboObj.SetItemCheck(i,0);
			}
			comboObj.SetItemCheck(0,1);
		}
	} else {
		comboObj.SetItemCheck(0,0);
	}
}

/**
 * 시트 초기설정값, 헤더 정의
 * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
 * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
 */
function initSheet(sheetObj, sheetNo) {
}

/**
 * registering IBSheet Object as list adding process for list in case of needing
 * batch processing with other items defining list on the top of source
 */
function setSheetObject(sheet_obj) {
    sheetObjects[sheetCnt++] = sheet_obj;
}

/**
 * registering IBCombo Object as list
 */
function setComboObject(combo_obj){
    comboObjects[comboCnt++]=combo_obj;
}

/**
 * registering initControl
 */
function initControl() {
  var formObj=document.form;
  //Axon 이벤트 처리1. 이벤트catch
  axon_event.addListenerFormat('blur','obj_blur', formObj);
  axon_event.addListener      ( 'keydown','ComKeyEnter','form');
  axon_event.addListenerForm('click'  	, 'obj_click'   , form);
}

function obj_click() {
	var eleObj 	= event.srcElement;
	var formObj = document.form;

	switch (eleObj.name) {
	    case "chk_vvd":
			if (formObj.chk_vvd.checked == true) {
				formObj.chk_vv.checked = false;
	    	}
		break;
	    case "chk_f_mm":
			if (formObj.chk_f_mm.checked == true) {
				formObj.chk_vv.checked = false;
	    	}
		break;
	    case "chk_f_yyyy":
			if (formObj.chk_f_yyyy.checked == true) {
				formObj.chk_vv.checked = false;
	    	}
		break;
	    case "chk_f_q":
			if (formObj.chk_f_q.checked == true) {
				formObj.chk_vv.checked = false;
	    	}
		break;
	    case "chk_l_mm":
			if (formObj.chk_l_mm.checked == true) {
				formObj.chk_vv.checked = false;
	    	}
		break;
	    case "chk_l_yyyy":
			if (formObj.chk_l_yyyy.checked == true) {
				formObj.chk_vv.checked = false;
	    	}
		break;
	    case "chk_l_q":
			if (formObj.chk_l_q.checked == true) {
				formObj.chk_vv.checked = false;
	    	}
		break;
		
	    case "chk_vv":
			if (formObj.chk_vv.checked == true) {
				formObj.chk_vvd.checked    = false;
				formObj.chk_f_mm.checked   = false;
				formObj.chk_f_yyyy.checked = false;
				formObj.chk_f_q.checked    = false;
				formObj.chk_l_mm.checked   = false;
				formObj.chk_l_yyyy.checked = false;
				formObj.chk_l_q.checked    = false;
	    	}
		break;
	}
}

/**
 * registering keyEnterRetreive
 */
function keyEnterRetreive(e){
    if(e.keyCode == 9 || e.keyCode == 13) {
    	searchRetreive();
    }
}
