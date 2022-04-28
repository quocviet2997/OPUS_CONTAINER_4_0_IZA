/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 	 : fns_joo_0006.js
*@FileTitle  : Carrier Merger
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/17
=========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class fns_joo_0006 : business script for fns_joo_0006
 */
function fns_joo_0006() {
	this.processButtonClick=tprocessButtonClick;
	this.setSheetObject=setSheetObject;
	this.loadPage=loadPage;
	this.initSheet=initSheet;
	this.initControl=initControl;
	this.doActionIBSheet=doActionIBSheet;
	this.setTabObject=setTabObject;
	this.validateForm=validateForm;
}
// common global variable
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
var curRow=1;
var gVVD="";
//gLaneComboItem[inx][0] => TRADE CODE;
//gLaneComboItem[inx][1] => LANE CODE;
var gLaneComboItem; 
// Event handler processing by button click event */
document.onclick=processButtonClick;
// Event handler processing by button name */
function processButtonClick() {
	/***** setting sheet object *****/
	var sheetObject=sheetObjects[0];
	/*******************************************************/
	var formObj=document.form;
	var prefix="sheet1_";
	try {
		var srcName=ComGetEvent("name");
		switch (srcName) {
		case "btn_add":
			var inx=sheetObject.DataInsert();
			sheetObject.SetCellValue(inx, prefix+"trd_cd","");
			sheetObject.SetCellValue(inx, prefix+"rlane_cd","");
			sheetObject.SetCellValue(inx, prefix+"acctg_crr_cd","");
			sheetObject.SetCellValue(inx, prefix+"jo_n1st_crr_cd","");
			sheetObject.SetCellValue(inx, prefix+"eff_eta_dt","99991231");
			sheetObject.SetCellValue(inx, prefix+"delt_flg","N");
			sheetObject.SetCellValue(inx, prefix+"skd_dir_cd","");
			sheetObject.SelectCell(inx,prefix+"trd_cd",true);
			break;
		case "btn_delete":
			JooRowHideDelete(sheetObject, prefix+"del_chk");
			break;
		case "btn_retrive":
			doActionIBSheet(sheetObject, formObj, IBSEARCH);
			break;
		case "btn_new":
			sheetObject.RemoveAll();
		    trd_cd.SetSelectIndex(-1,false);
			rlane_cd.SetSelectIndex(-1,false);
			break;
		case "btn_save":
			doActionIBSheet(sheetObject, formObj, IBSAVE);
			break;
		case "btn_downExcel":
 			sheetObject.Down2Excel({ HiddenColumn:1,Merge:1});
 			
 			if(sheetObject.RowCount() < 1){//no data
	       		 ComShowCodeMessage("COM132501");
	   		}else{
//	   			 sheetObject.Down2Excel({ HiddenColumn:true});
	   			sheetObject.Down2Excel({ HiddenColumn:1,Merge:1});
	   		}	
 			
			break;
		} // end switch
	} catch (e) {
		if (e == "[object Error]") {
			ComShowCodeMessage('JOO00001');
		} else {
			ComShowMessage(e.message);
		}
	}
}
/**
 * registering IBSheet Object as list
 * adding process for list in case of needing batch processing with other items
 * defining list on the top of source
 */
function setSheetObject(sheet_obj) {
	sheetObjects[sheetCnt++]=sheet_obj;
}
/** 
 * registering IBCombo Object as list
 * param : combo_obj
 * adding process for list in case of needing batch processing with other items
 * defining list on the top of source
 */ 
function setComboObject(combo_obj) {  
    comboObjects[comboCnt++]=combo_obj;  
}
/**
 * initializing sheet
 * implementing onLoad event handler in body tag
 * adding first-served functions after loading screen.
 */
function loadPage(tradeComboList, tradeSheetList, rlaneSheetList, carriSheetList, dirctSheetList) {
	//전역변수 2차원 배열 setting 
	//gLaneComboItem[inx][0] ==> TRADE code
	//gLaneComboItem[inx][1] ==> RLANE code
	gLaneComboItem=rlaneSheetList.split("|");
	var rlaneCombo="";
	for (var inx=0; inx<gLaneComboItem.length; inx++){
		gLaneComboItem[inx]=gLaneComboItem[inx].split(",");
		rlaneCombo += gLaneComboItem[inx][1] + "|";
	}
	for (i=0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1, tradeSheetList, rlaneCombo, carriSheetList, dirctSheetList);
		ComEndConfigSheet(sheetObjects[i]);
	}
    for(var k=0;k<comboObjects.length;k++){
        initCombo(comboObjects[k],k+1, tradeComboList);
    }
    initControl();
}
function initControl() {
	//** Date Separator **/
	DATE_SEPARATOR="-";
	var formObj=document.form;
    //handling Axon event. event catch
	axon_event.addListenerFormat('beforedeactivate', 'obj_blur'    , formObj);
	axon_event.addListenerFormat('beforeactivate'  , 'obj_focus'   , formObj);
//    axon_event.addListenerFormat('keypress'        , 'obj_keypress', formObj);
//    axon_event.addListenerFormat('keyup'           , 'form_keyup'  , formObj);
//    formObj.trd_cd.focus();
}
function form_keyup(){
	ComKeyEnter('lengthnextfocus');  
} 
/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
function initSheet(sheetObj, sheetNo, tradeSheetList, rlaneSheetList, carriSheetList, dirctSheetList) {
	var cnt=0;
	switch (sheetNo) {
	case 1: //t1sheet1 init
	    with(sheetObj){
        
      if (location.hostname != "")
//      (13, 0, 0, true);
      var HeadTitle="STS||Trade|Lane|ACCT.Carrier|Carrier _ F|Carrier _ S|End Date|DEL_MK|VSL|VOY|Direction|Remark";
      var prefix="sheet1_";

      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );

      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
      var headers = [ { Text:HeadTitle, Align:"Center"} ];
      InitHeaders(headers, info);

      var cols = [ {Type:"Status",    Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"ibflag" },
             {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"del_chk",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0 },
             {Type:"Combo",     Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"trd_cd",         KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
             {Type:"Combo",     Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:prefix+"rlane_cd",       KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
             {Type:"Combo",     Hidden:0, Width:90,   Align:"Center",  ColMerge:1,   SaveName:prefix+"acctg_crr_cd",   KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
             {Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix+"jo_n1st_crr_cd", KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
             {Type:"PopupEdit", Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix+"jo_n2nd_crr_cd", KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:3 },
             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix+"eff_eta_dt",     KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
             {Type:"Combo",     Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"delt_flg",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
             {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:4 },
             {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"skd_voy_no",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:4 },
             {Type:"Combo",     Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:prefix+"skd_dir_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
             {Type:"Text",      Hidden:0,  Width:94,   Align:"Left",    ColMerge:1,   SaveName:prefix+"mrg_rmk",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:100 } ];
       
      		InitColumns(cols);

      		SetEditable(1);
      		SetSheetHeight(300);
          SetColProperty(prefix+"trd_cd", {ComboText:tradeSheetList, ComboCode:tradeSheetList} );
	      SetColProperty(prefix+"rlane_cd", {ComboText:rlaneSheetList, ComboCode:rlaneSheetList} );
	      SetColProperty(prefix+"acctg_crr_cd", {ComboText:carriSheetList, ComboCode:carriSheetList} );
	      SetColProperty(prefix+"jo_n1st_crr_cd", {ComboText:carriSheetList, ComboCode:carriSheetList} );
	      SetColProperty(prefix+"delt_flg", {ComboText:"YES|NO", ComboCode:"Y|N"} );
	      SetColProperty(prefix+"skd_dir_cd", {ComboText:"|"+dirctSheetList, ComboCode:"|"+dirctSheetList} );
	      SetColProperty(prefix+"eff_eta_dt", {Format:"####-##-##"} );
      }


		break;
	case 2: //t1sheet1 init
		with (sheetObj) {
			// setting height
//			SetSheetHeight(0);
		SetVisible(false);
		}
		break;
	}
}
/**
 * setting Combo basic info 
 * param : comboObj, comboNo
 * initializing sheet 
 */ 
function initCombo(comboObj, comboNo, tradeComboList) {
    var formObj=document.form
    switch(comboNo) {  
    	//Trade
    	case 1: 
           with (comboObj) { 
				SetMultiSelect(0);
				SetUseAutoComplete(1);
				SetColAlign(0, "left");
				SetColWidth(0, "30");
 				SetDropHeight(160);
 				ValidChar(2,1);//only upper case
 				SetMaxLength(3);
 		    }
           addComboItem(comboObj, tradeComboList.split("|"));           	
 			break; 
 		//Rlane
    	case 2: 
            with (comboObj) { 
 				SetMultiSelect(0);
 				SetUseAutoComplete(1);
				SetColAlign(0, "left");
				SetColWidth(0, "30");
  				SetDropHeight(160);
 				ValidChar(2,1);//only upper case
 				SetMaxLength(5);
  		    }
  			break;
  		//Carrier
    	case 3: 
            with (comboObj) { 
 				SetMultiSelect(0);
 				SetUseAutoComplete(1);
 				SetColAlign(0, "left");
 				SetColWidth(0, "30");
  				SetDropHeight(160);
 				ValidChar(2,1);//only upper case
  				SetMaxLength(3);
  		    }
  			break; 
 	} 
}
// retrieving Lane SVC Type
function doActionIBCombo(sheetObj,formObj,sAction,sComboObj, sComboKey) {
    sheetObj.ShowDebugMsg(false);
    switch(sAction) {
       case IBSEARCH: //TRADE
			if (sComboObj.id == "rlane_cd"){
				formObj.f_cmd.value=SEARCHLIST07;
				formObj.super_cd1.value="";
				formObj.super_cd2.value=trd_cd.text;
				formObj.code.value="";
 				var sXml=sheetObj.GetSearchData("JOOCommonGS.do", FormQueryString(formObj));
				var comboItems=(",|"+ComGetEtcData(sXml, sComboKey)).split("|");
				addComboItem(sComboObj, comboItems);
			}else if (sComboObj.id == "jo_crr_cd"){
				//initializing combo
				sComboObj.RemoveAll();
				formObj.f_cmd.value=SEARCH02;            
                formObj.super_cd1.value=rlane_cd.GetSelectCode();
                formObj.super_cd2.value=trd_cd.GetSelectCode();
                var param=FormQueryString(formObj);
                 var sXml=sheetObj.GetSearchData("JOOCommonGS.do", param);
				var comboItems=(",|"+ComGetEtcData(sXml, sComboKey)).split("|");
				addComboItem(sComboObj, comboItems);
			}
	        break;
    }
}
/**
 * in case of changing Trade
 * @param comboObj
 * @param idx_cd
 * @param text
 * @return
 */
function trd_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){
	sheetObjects[0].RemoveAll();
	comboObjects[1].SetSelectIndex(-1,false);
	comboObjects[1].RemoveAll();
	comboObjects[2].SetSelectIndex(-1,false);
	comboObjects[2].RemoveAll();
}
/**
 * retrieving Rlane Combo in case of Rlane Focus
 * @param comboObj
 * @return
 */
function rlane_cd_OnFocus(comboObj){
	var formObj=document.form;
	if (comboObj.GetItemCount() == 0){
		comboObj.SetEnable(0);
		doActionIBCombo(sheetObjects[1], formObj, IBSEARCH, comboObj, "rlane_cd");		
		comboObj.SetEnable(1);
	}
}
//Reset in case of changing Lane
function rlane_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){
	sheetObjects[0].RemoveAll();
	comboObjects[2].SetSelectIndex(-1,false);
	comboObjects[2].RemoveAll();
}
//retrieving Carrier code LIST in case of carrier code focus
function jo_crr_cd_OnFocus(comboObj){
	var formObj=document.form;
	if (comboObj.GetItemCount() == 0){
		comboObj.SetEnable(0);
		doActionIBCombo(sheetObjects[1] , formObj ,IBSEARCH , comboObj, "jo_crr_cd");
		comboObj.SetEnable(1);
	}
}
//reset in case of changing Carrier code
function jo_crr_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){
	sheetObjects[0].RemoveAll();
}
/**
 * Sheet1 OnChange
 * @param sheetObj
 * @param Row
 * @param Col
 * @param Value
 * @return
 */
function sheet1_OnChange(sheetObj, Row, Col, Value) {
	var prefix="sheet1_";
	var formObj=document.form;
	if (sheetObj.ColSaveName(Col)== prefix+"skd_dir_cd"){
		if (sheetObj.GetCellValue(Row, prefix+"vsl_cd").length==4){
			if (sheetObj.GetCellValue(Row, prefix+"skd_voy_no").length==4){
				curRow=Row; //현재 row
				gVVD=sheetObj.GetCellValue(Row, prefix+"vsl_cd")
				+sheetObj.GetCellValue(Row, prefix+"skd_voy_no")
				+sheetObj.GetCellValue(Row, prefix+"skd_dir_cd");
				doActionIBSheet(sheetObj, formObj, IBROWSEARCH);
			}
		}
	}else 	if (sheetObj.ColSaveName(Col)== prefix+"vsl_cd"){
		if (sheetObj.GetCellValue(Row, prefix+"vsl_cd").length==4){
			if (sheetObj.GetCellValue(Row, prefix+"skd_voy_no").length==4){
				if (sheetObj.GetCellValue(Row, prefix+"skd_dir_cd").length==1){
					curRow=Row; //현재 row
					gVVD=sheetObj.GetCellValue(Row, prefix+"vsl_cd")
					+sheetObj.GetCellValue(Row, prefix+"skd_voy_no")
					+sheetObj.GetCellValue(Row, prefix+"skd_dir_cd");
					doActionIBSheet(sheetObj, formObj, IBROWSEARCH);
				}
			}
		}
	}else 	if (sheetObj.ColSaveName(Col)== prefix+"skd_voy_no"){
		if (sheetObj.GetCellValue(Row, prefix+"vsl_cd").length==4){
			if (sheetObj.GetCellValue(Row, prefix+"skd_voy_no").length==4){
				if (sheetObj.GetCellValue(Row, prefix+"skd_dir_cd").length==1){
					curRow=Row; //현재 row
					gVVD=sheetObj.GetCellValue(Row, prefix+"vsl_cd")
					+sheetObj.GetCellValue(Row, prefix+"skd_voy_no")
					+sheetObj.GetCellValue(Row, prefix+"skd_dir_cd");
					doActionIBSheet(sheetObj, formObj, IBROWSEARCH);
				}
			}
		}
	//setting Rlane Combo in case of changing Trade
	}else if (sheetObj.ColSaveName(Col)== prefix+"trd_cd"){
		var trdCd=sheetObj.GetCellValue(Row, Col);
		UF_setLaneCombo(sheetObj, Row, trdCd);
	}
}
/**
 * setting Rlane Combo in case of changing Trade
 * @param sheetObj
 * @param Row
 * @param trdCd
 * @return
 */
function UF_setLaneCombo(sheetObj, Row, trdCd){
	var prefix="sheet1_";
	var laneItems="";
	for (var inx=0; inx < gLaneComboItem.length; inx++){
		if (trdCd == gLaneComboItem[inx][0]){
			laneItems=laneItems + gLaneComboItem[inx][1] +"|";
		}
	}
	if (laneItems.length > 1){
		laneItems=laneItems.substring(0,laneItems.length-1);
	}
    sheetObj.CellComboItem(Row,prefix+"rlane_cd", {ComboText:laneItems, ComboCode:laneItems} );
    sheetObj.SetCellValue(Row, prefix+"rlane_cd","",0);//can't trigger Change Event
}
/**
 * retrieving Carrier Code
 * @param sheetObj
 * @param Row
 * @param Col
 * @return
 */
function sheet1_OnPopupClick(sheetObj, Row, Col){
	var prefix="sheet1_";
	if (sheetObj.ColSaveName(Col) == prefix+"jo_n2nd_crr_cd"){
		ComOpenPopup('/opuscntr/COM_ENS_0N1.do', 450, 455, 'getCOM_ENS_0N1', '1,0,1,1,1', false, false, Row, prefix+"jo_n2nd_crr_cd", 0);
	}
}
/**
 * in case of clicking OK in Carrier Code Pop-UP
 * @param rowArray
 * @param Row
 * @param Col
 * @param sheetIdx
 * @return
 */
function getCOM_ENS_0N1(rowArray, Row, Col, sheetIdx){
	sheetObjects[sheetIdx].SetCellValue(Row, Col,rowArray[0][3]);
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	switch (sAction) {
	case IBSEARCH: //retrieve
		if (validateForm(sheetObj, formObj, sAction)){
			formObj.f_cmd.value=SEARCH;
	        var aryPrefix=new Array("sheet1_");	//prefix characters array
 			var sXml=sheetObj.GetSearchData("FNS_JOO_0006GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix));
			var arrXml=sXml.split("|$$|");
			sheetObj.LoadSearchData(arrXml[0],{Sync:1} );
		}
		break;
	case IBSAVE: //save
		if (validateForm(sheetObj, formObj, sAction)){
			var SaveStr=ComGetSaveString(sheetObjects);
			if (SaveStr == ""){
				ComShowCodeMessage('JOO00036');
				return;
			}
			if (!ComShowCodeConfirm('JOO00046')){
				return;
			}
			var prefix="sheet1_";
			formObj.f_cmd.value=MULTI;
			sheetObj.SetWaitImageVisible(0);
			ComOpenWait(true);
 			var sXml=sheetObj.GetSaveData("FNS_JOO_0006GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			ComOpenWait(false);
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			doActionIBSheet(sheetObj, formObj, IBSEARCH);
		}
		break;
	// in case of changing VVD 9 characters
	case IBROWSEARCH: 
		if (validateForm(sheetObj, formObj, sAction)){
			formObj.f_cmd.value=SEARCHLIST08;
			formObj.code.value=gVVD;
			formObj.super_cd1.value="";
			formObj.super_cd2.value="";
 			var sXml=sheetObj.GetSearchData("JOOCommonGS.do", FormQueryString(formObj));
			if (ComGetEtcData(sXml,"CHECKVVD")=="E"){
				ComShowMessage(ComGetEtcData(sXml,"VVDMSG"));
				sheetObj.SetCellValue(curRow,"sheet1_"+"vsl_cd","");//VVD Clear
				sheetObj.SetCellValue(curRow,"sheet1_"+"skd_voy_no","");//VVD Clear
				sheetObj.SetCellValue(curRow,"sheet1_"+"skd_dir_cd","");//VVD Clear
				sheetObj.SelectCell(curRow,"sheet1_"+"vsl_cd",true);
			}
		}
		break;
	}
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	var prefix="sheet1_";
	switch (sAction) {
		case IBSAVE:   //save
			for(var inx=sheetObj.HeaderRows(); inx <= sheetObj.LastRow(); inx++){
				var rowStatus=sheetObj.GetRowStatus(inx);
				//skip when not changed
				if (rowStatus=="R"){
					continue;
				}
				//only del_chk checked
				if ((rowStatus == "I" || rowStatus == "U") && sheetObj.GetCellValue(inx,prefix+"del_chk") == "1"){
					ComShowCodeMessage("JOO00079");
					sheetObj.SelectCell(inx,prefix+"del_chk",true);
					return false;
				}
				//skip when not changed
				if (rowStatus=="D"){
					continue;
				}
				if (sheetObj.GetCellValue(inx,prefix+"trd_cd").length < 3){
					ComShowCodeMessage('JOO00047',inx);
					sheetObj.SelectCell(inx,prefix+"trd_cd",true);
					return false;
				}
				if (sheetObj.GetCellValue(inx,prefix+"rlane_cd").length < 3){
					ComShowCodeMessage('JOO00048',inx);
					sheetObj.SelectCell(inx,prefix+"rlane_cd",true);
					return false;
				}
				if (sheetObj.GetCellValue(inx,prefix+"jo_n1st_crr_cd").length < 3){
					ComShowCodeMessage('JOO00049',inx);
					sheetObj.SelectCell(inx,prefix+"jo_n1st_crr_cd",true);
					return false;
				}
				if (sheetObj.GetCellValue(inx,prefix+"jo_n2nd_crr_cd").length < 3){
					ComShowCodeMessage('JOO00050',inx);
					sheetObj.SelectCell(inx,prefix+"jo_n2nd_crr_cd",true);
					return false;
				}
				//error when Carrier_M, Carrier_S are same.
				if (sheetObj.GetCellValue(inx,prefix+"jo_n1st_crr_cd") == sheetObj.GetCellValue(inx,prefix+"jo_n2nd_crr_cd")){
					ComShowCodeMessage('JOO00051',inx);
					sheetObj.SelectCell(inx,prefix+"jo_n2nd_crr_cd",true);
					return false;
				}
				var vslCd=sheetObj.GetCellValue(inx,prefix+"vsl_cd");
				var voyNo=sheetObj.GetCellValue(inx,prefix+"skd_voy_no");
				var dirCd=sheetObj.GetCellValue(inx,prefix+"skd_dir_cd");
				//if one item is inputted, full item must be inputted.
				if ((vslCd.length > 0) || (voyNo.length > 0) || (dirCd.length > 0)){
					if (vslCd.legnth < 4){
						ComShowCodeMessage('JOO00040',inx);
						sheetObj.SelectCell(inx,prefix+"vsl_cd",true);
						return false;
					}
					if (voyNo.legnth < 4){
						ComShowCodeMessage('JOO00041',inx);
						sheetObj.SelectCell(inx,prefix+"skd_voy_no",true);
						return false;
					}
					if (dirCd.legnth < 1){
						ComShowCodeMessage('JOO00042',inx);
						sheetObj.SelectCell(inx,prefix+"skd_dir_cd",true);
						return false;
					}
				}
			}
			break;
		default:
			break;
	}
	return true;
}
