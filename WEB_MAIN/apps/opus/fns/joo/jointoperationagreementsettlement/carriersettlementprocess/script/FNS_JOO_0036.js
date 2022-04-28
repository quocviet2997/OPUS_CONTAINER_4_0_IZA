/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : FNS_JOO_0036.js
 *@FileTitle: Entry and Inquiry of Target Voyage Choose by Settlement Item
 *@author   : CLT
 *@version  : 1.0
 *@since    : 2014/06/18
 =========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class FNS_JOO_0036 : business script for FNS_JOO_0036
 */
// common global variable
var tabObjects=new Array();
var tabCnt=0;
var beforetab=1;
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
//gBasicPortCombo[inx][0] ==> Rev. Dir  
//gBasicPortCombo[inx][1] ==> delt_flg  
//gBasicPortCombo[inx][2] ==> Basic Ports  
//gBasicPortCombo[inx][3] ==> ETA  
//gBasicPortCombo[inx][4] ==> ETD  
var gBasicPortCombo;
//gPairPortCombo[inx][0] ==> Pair Ports  
//gPairPortCombo[inx][1] ==> ETA  
//gPairPortCombo[inx][2] ==> ETD  
var gPairPortCombo;
//current row
var gCurRow;
//VVD
var gVVD;
var gNew=false;
var prefix="sheet1_";
// Event handler processing by button click event */
document.onclick=processButtonClick;
// Event handler processing by button name */
function processButtonClick() {
	/***** setting sheet object *****/
	var sheetObject1=sheetObjects[0];
	/*******************************************************/
	var formObject=document.form;
	try {
		var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
		switch (srcName) {
		case "btn_retrieve":
			doActionIBSheet(sheetObject1, formObject, IBSEARCH);
			break;
		case "btn_new":
			gNew=true;
			jo_crr_cd.SetSelectText("");
			trd_cd.SetSelectText("");
			rlane_cd.SetSelectText("");
			sheetObjects[0].RemoveAll();
			formObject.from_dt.value=formObject.hid_dt.value;
			formObject.to_dt.value=formObject.hid_dt.value;
			formObject.combined_chk.checked=false ; 
			formObject.vvd_chk.checked=false ;
			 jo_crr_cd.RemoveAll();
			 rlane_cd.RemoveAll();
			gNew=false;
			break;
		case "btn_downexcel":
//            var paramObj=new Object();
//            var url=ComJooGetPgmTitle(sheetObjects[0], paramObj);
            if(sheetObject1.RowCount() < 1){//no data
         		 ComShowCodeMessage("COM132501");
	       		}else{
	       			var paramObj=new Object();
	                var url=ComJooGetPgmTitle(sheetObjects[0], paramObj);  
	                 sheetObjects[0].Down2Excel( {DownCols: makeHiddenSkipCol(sheetObjects[0]), SheetDesign:1,Merge:1 });
	       		}	
			break;
		case "btns_back1":
	    	sheetObjects[0].RemoveAll();
			if (formObject.from_dt.value!=""){
				formObject.from_dt.value=ComGetDateAdd(formObject.from_dt.value+"-01","M",-1).substring(0,7);
			}
			break;
		case "btns_next1":
			sheetObjects[0].RemoveAll();
			if (formObject.from_dt.value!=""){
				formObject.from_dt.value=ComGetDateAdd(formObject.from_dt.value+"-01","M", 1).substring(0,7);
			}
			break;
		case "btns_back2":
	    	sheetObjects[0].RemoveAll();
			if (formObject.to_dt.value!=""){
				formObject.to_dt.value=ComGetDateAdd(formObject.to_dt.value+"-01","M",-1).substring(0,7);
			}
			break;
		case "btns_next2":
			sheetObjects[0].RemoveAll();
			if (formObject.to_dt.value!=""){
				formObject.to_dt.value=ComGetDateAdd(formObject.to_dt.value+"-01","M", 1).substring(0,7);
			}
			break;
		case "btn_save":
			if(sheetObjects[0].RowCount() == 0) return;
			doActionIBSheet(sheetObject1, formObject, IBSAVE);
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
//function loadPage(crrCombo,abbrSheet,dirSheet,staSheet) {
 function loadPage(crrCombo,abbrSheet,dirSheet,staSheet) {
	for (i=0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i+1 );//, abbrSheet, dirSheet, staSheet);
		ComEndConfigSheet(sheetObjects[i]);
	}
    for(var k=0;k<comboObjects.length;k++){
        initCombo(comboObjects[k],k+1, crrCombo);
    }
  //handling Axon event. event catch
//  axon_event.addListenerForm  ('beforedeactivate', 'obj_deactivate',  form); 			 
//	axon_event.addListenerFormat('beforeactivate',   'obj_activate',    form);            //- handling code when OnBeforeActivate event in case of existing dataformat property
//	axon_event.addListenerFormat('keypress',         'obj_keypress', 	form);            //- handling code when onkeypress event in case of existing dataformat property
//	axon_event.addListenerFormat('keyup'           , 'form_keyup'    ,  form); 
//	axon_event.addListener('keypress', 'from_dt_keypress', 'from_dt');
//	axon_event.addListener('keypress', 'to_dt_keypress',   'to_dt');
    axon_event.addListener('click', 'click_combined_chk', 'combined_chk');
    axon_event.addListener('click', 'click_vvd_chk', 'vvd_chk');
    //initControl();
    
    sheet1_OnLoadFinish(sheetObjects[0]);
}
 function sheet1_OnLoadFinish(sheetObj) {
    doActionIBSheet(sheetObjects[0],document.form, IBSEARCH_ASYNC02);
}
 function form_keyup(){
		ComKeyEnter('lengthnextfocus');
 }
//handling Axon event 2
 function obj_deactivate(){
     ComChkObjValid(ComGetEvent());
 }
 function obj_activate(){
     ComClearSeparator(ComGetEvent());
 } 
 function to_dt_keypress(){
   	ComKeyOnlyNumber(this, '');
 }
 function from_dt_keypress(){
   	ComKeyOnlyNumber(this, '');
 }
//setting Lane combo by Trd
function user_setPortCombo(sheetObj, Row, rlaneCd, skdDirCd){
	var portItems="";
	for (var inx=0; inx < gBasicPortCombo.length; inx++){
		if ((rlaneCd == gBasicPortCombo[inx][0]) && (skdDirCd == gBasicPortCombo[inx][1])){
			portItems=portItems + gBasicPortCombo[inx][2] +"|";
		}
	}
	if (portItems.length > 0){
		portItems=portItems.substring(0,portItems.length-1);
	}
    sheetObj.CellComboItem(Row,prefix+"stl_bzc_port_cd", {ComboText:portItems, ComboCode:portItems} );
    sheetObj.CellComboItem(Row,prefix+"stl_pair_port_cd", {ComboText:portItems, ComboCode:portItems} );
}
/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
 function initSheet(sheetObj,sheetNo) 
 {
     var cnt=0;
     switch(sheetNo) {
         case 1:      // sheet1 init
             with (sheetObj) {          
	             //var HeadTitle="|Month|Carrier|Trade|Lane|Combined No.|VVD|REVENUE|EXPENSE|Balance|Benefit Line|Due Date|Remark";
	             var HeadTitle = "|Account\nMonth|Carrier|Trade|Lane|Combined\nNo.|Revenue\nVVD|Cur.|Rev.(Slip)|Exp.(Slip)|Balance|Beneficiary\nLine|Due Date|Remark";
	             SetConfig( { SearchMode:0, MergeSheet:5, Page:20, DataRowMerge:0 } );
	             var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
	             var headers = [ { Text:HeadTitle, Align:"Center"} ];
	             InitHeaders(headers, info);
	
	             var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
		                    {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix+"acct_yrmon",   KeyField:0,   CalcLogic:"",   Format:"",          PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                    {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix+"jo_crr_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                    {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix+"trd_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                    {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"rlane_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                    {Type:"Text",      Hidden:0,  Width:130,  Align:"Center",  ColMerge:0,   SaveName:prefix+"stl_cmb_seq",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                    {Type:"Text",      Hidden:0,  Width:100,  Align:"Left",    ColMerge:0,   SaveName:prefix+"vvd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                    {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",    ColMerge:0,   SaveName:prefix+"locl_curr_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                    {Type:"Float",   Hidden:0, Width:90,   Align:"Right",   ColMerge:0,   SaveName:prefix+"jo_rev",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
		                    {Type:"Float",   Hidden:0, Width:90,   Align:"Right",   ColMerge:0,   SaveName:prefix+"jo_exp",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
		                    {Type:"Float",   Hidden:0, Width:90,   Align:"Right",   ColMerge:0,   SaveName:prefix+"jo_balance",   KeyField:0,   CalcLogic:"",   Format:"NullFloat",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
		                    {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:prefix+"benefit_line", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                    {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:prefix+"eff_dt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                    {Type:"Text",      Hidden:0,  Width:90,   Align:"Left",  ColMerge:0,   SaveName:prefix+"jo_smry_rmk",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];              
	             	InitColumns(cols);
	                SetEditable(1);  
//	                SetSheetHeight(530);
	                resizeSheet();
			   }
             break;
     }
 }
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	if (!validateForm(sheetObj, formObj, sAction))
		return;
	switch (sAction) {
		case IBSEARCH: //retrieve
    		    if(!validateForm(sheetObj, formObj, sAction )){ return;}
				checkCol(sheetObj, formObj);
    			formObj.f_cmd.value=SEARCH;
     			sheetObj.DoSearch("FNS_JOO_0036GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix) );
     			// UI개선수정(201407)
     			//sheetObj.ShowSubSum([{StdCol:prefix+"jo_crr_cd", SumCols:"7|8|9"}]); 
     			for(i=sheetObj.LastRow(); i > 0 ; i--){
					if (sheetObj.GetCellValue(i, prefix+"acct_yrmon") == "TOTAL") {
							sheetObj.SetCellValue(i+1, prefix+"acct_yrmon", "",0);
					}
				}
    			break;
        case    IBSEARCH_ASYNC02:   //Get TRD_CD COMBO
                formObj.f_cmd.value=SEARCHLIST06;            
                var param=FormQueryString(formObj);
                 var sXml=sheetObj.GetSearchData("JOOCommonGS.do", param);
                ComXml2ComboItem( sXml,trd_cd, "code","code" );
                trd_cd.InsertItem(0, '',''); 
                break;
        case    IBSEARCH_ASYNC03:   //Get rlane_cd COMBO
                formObj.f_cmd.value=SEARCHLIST07;            
                formObj.super_cd1.value="";
                formObj.super_cd2.value=trd_cd.GetSelectCode();
                var param=FormQueryString(formObj);
                 var sXml=sheetObj.GetSearchData("JOOCommonGS.do", param);
                ComXml2ComboItem( sXml,rlane_cd, "code","code" );
                rlane_cd.InsertItem(0, '',''); 
                break;
        case    IBSEARCH_ASYNC04:   //Get jo_crr_cd COMBO
                formObj.f_cmd.value=SEARCH02;            
                formObj.super_cd1.value=rlane_cd.GetSelectText();
                formObj.super_cd2.value="";
                var param=FormQueryString(formObj);
                 var sXml=sheetObj.GetSearchData("JOOCommonGS.do", param);
                ComXml2ComboItem( sXml, jo_crr_cd, "code","code" );
                jo_crr_cd.InsertItem(0, '',''); 
                break;
        case IBSAVE: //save
        		if (validateForm(sheetObj, formObj, sAction)) {
					formObj.f_cmd.value=MULTI;
					//SUB_TOTAL, TOTAL부분 삭제후 저장 처리
					for(i=sheetObj.LastRow(); i > 0 ; i--){
						if (sheetObj.GetCellValue(i, prefix+"acct_yrmon") == "TOTAL") {
								sheetObj.RowDelete(i, false);	
						} else if (sheetObj.GetCellValue(i, prefix+"jo_crr_cd") == "Sub-Total") {
								sheetObj.RowDelete(i, false);	
						} else if (sheetObj.GetCellValue(i, prefix+"jo_crr_cd") == "") {
								sheetObj.RowDelete(i, false);	
						}
					}
					var SaveStr=ComGetSaveString(sheetObj); // 배열입니다.
	 				var sXml=sheetObj.GetSaveData("FNS_JOO_0036GS.do", SaveStr + "&" + FormQueryString(formObj)+ "&" + ComGetPrefixParam("sheet1_"));
	 				sheetObj.LoadSaveData(sXml);
	 				
        		}	
				break;
	}
}
/**
 * setting Combo basic info 
 * param : comboObj, comboNo
 * initializing sheet 
 */ 
function initCombo(comboObj, comboNo, crrCombo) {
    var formObject=document.form
    switch(comboObj.options.id) {  
    	case "jo_crr_cd": 
           with (comboObj) { 
				SetMultiSelect(0);
				SetUseAutoComplete(1);
				SetColAlign(0, "left");
				SetColAlign(1, "left");
				//SetColWidth("0|30");
 				SetDropHeight(160);
 				SetMaxLength(3);
 				ValidChar(2, 1);
 		    }
 			break; 
    	case "trd_cd": 
            with (comboObj) { 
 				SetMultiSelect(0);
 				SetUseAutoComplete(1);
				SetColAlign(0, "left");
				SetColAlign(1, "left");
 				//SetColWidth("0|30");
  				SetDropHeight(160);
  				SetMaxLength(3);
 				ValidChar(2, 1);
  		    }
  			break;
    	case "rlane_cd": 
            with (comboObj) { 
 				SetMultiSelect(0);
 				SetUseAutoComplete(1);
				SetColAlign(0, "left");
				SetColAlign(1, "left");
 			//	SetColWidth("0|30");
  				SetDropHeight(160);
  				SetMaxLength(5);
 				ValidChar(2, 1);
  		    }
  			break;
    	case "ofc_cd":
    		with (comboObj) {
    			SetMultiSelect(0);
    			SetUseAutoComplete(1);
				SetColAlign(0, "left");
				SetColWidth(0, "75");
    			SetDropHeight(200);
    			SetMaxLength(3);
 				ValidChar(2, 1);
    		}
    		var comboItems=gOffList.split("|");
    		addComboItem(comboObj, comboItems);
    		comboObj.SetSelectIndex(0,false);
            if (comboItems.length == 1){
            	comboObj.SetEnable(0);
            }else{
            	comboObj.SetEnable(1);
            }	  			
 	} 
}
// retrieving Lane SVC Type
function doActionIBCombo(sheetObj,formObj,sAction,sComboObj_id,sComboAction,sComboKey) {
    sheetObj.ShowDebugMsg(false);
    switch(sAction) {
       case IBSEARCH:  
           if ( sComboObj_id == "rlane_cd"){
               //initializing combo
               sComboObj.RemoveAll();
               formObj.f_cmd.value=sComboAction;
               formObj.code.value="";
               formObj.super_cd1.value=jo_crr_cd.GetSelectText();
               formObj.super_cd2.value=trd_cd.GetSelectText();
               var sXml=sheetObj.GetSearchData("JOOCommonGS.do", FormQueryString(formObj));
               var comboItems=ComGetEtcData(sXml, sComboKey).split("|");
               //alert("comboItems ["+comboItems+"]");
               addComboItem(sComboObj,comboItems);
           }
			if ( sComboObj_id == "jo_crr_cd") {
				//initializing combo
				sComboObj.RemoveAll();
				formObj.f_cmd.value=sComboAction;
				formObj.code.value="";
				formObj.super_cd1.value=rlane_cd.GetSelectText();
				formObj.super_cd2.value="";
				var sXml=sheetObj.GetSearchData("JOOCommonGS.do", FormQueryString(formObj));
				//Trade setting
				var comboItems=ComGetEtcData(sXml, sComboKey).split("|");
				addComboItem(sComboObj,comboItems);
			}
	        break;
    }
}
//in case of changing R/E 
function acct_yrmon_OnChange(idx_cd, text){
	if (gNew) return;
	sheetObjects[0].RemoveAll();
}
//changing Lane in case of changing Trade
function trd_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){
    var formObject=document.form;
	sheetObjects[0].RemoveAll();
	jo_crr_cd.RemoveAll();
    rlane_cd.RemoveAll();
    
    rlane_cd_OnFocus(comboObjects[1]);
}
function rlane_cd_OnFocus(comboObj){
    var formObj=document.form;
    if (comboObj.GetItemCount()== 0) {
        comboObj.SetEnable(0);
        doActionIBSheet(sheetObjects[sheetObjects.length-1], formObj, IBSEARCH_ASYNC03);
        comboObj.SetEnable(1);
    }
}
//clear in case of changing rlane
function rlane_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){
    var formObject=document.form;
    sheetObjects[0].RemoveAll();
    jo_crr_cd.RemoveAll();
    
    jo_crr_cd_OnFocus(comboObjects[2]);
}
function jo_crr_cd_OnFocus(comboObj){
    var formObject=document.form;
    if (comboObj.GetItemCount()== 0) {
        comboObj.SetEnable(0);
        doActionIBSheet(sheetObjects[sheetObjects.length-1], formObject, IBSEARCH_ASYNC04);
        comboObj.SetEnable(1);
    }
}
 /**
  * handling process for input validation
  */
 function validateForm(sheetObj, formObj, sAction) {
 	with (formObj) {
 		switch(sAction){
 			case IBSEARCH:
 				var fr=from_dt.value;
 				var to=to_dt.value;
 				if (fr ==""){
 					ComShowCodeMessage();
 					return false;
 				}
 				if (ComGetDaysBetween(fr+"-01", to+"-01") < 0){
 					ComShowCodeMessage("JOO00078");
 					return false;
 				}
 				break;
 		}
 	}
 	return true;
 }
 
//Row 강제머지할 셀의 Row Index
//Col 강제머지할 셀의 Column Index 
//Rows 강제머지할 셀의 Row 개수
//Cols 강제머지할 셀의 Col 개수
//ObjId.SetMergeCell(Row, Col, Rows, Cols) 
function sheet1_OnSearchEnd(sheetObj, ErrMsg) {	
	var backColor1 = "#F7E1EC";
	var fontColor1 = "#0054FF";
	var backColor2 = "#F7E1EC";
	var fontColor2 = "#0054FF";
	var backColor3 = "#C9D5EB";
	var fontColor3 = "#0054FF";
	var iRowCnt = 0;
	with(sheetObj)
	{
		for(var i=HeaderRows(); i<=LastRow(); i++) {
    		if (GetCellValue(i, prefix+"acct_yrmon") == "TOTAL") {
				SetRowBackColor(i,backColor3);			//색상설정
				SetCellFont("FontBold", i, 0, i, LastCol(),1);
				SetCellValue(i, prefix+"jo_smry_rmk","",0);
				
				SetCellValue(i, prefix+"stl_cmb_seq","",0);
				SetCellValue(i, prefix+"vvd","",0);
				
				//SetMergeCell(i,1,1,6); // 6칸 머지
				
				SetRowEditable(i, 0);
				
				iRowCnt ++;
				
			} else if (GetCellValue(i, prefix+"jo_crr_cd") == "Sub-Total") {
				SetRowBackColor(i,backColor1);			//색상설정	
				SetRowEditable(i, 0);		
				SetCellValue(i, prefix+"stl_cmb_seq","",0);
				SetCellValue(i, prefix+"vvd","",0);
				SetCellValue(i, prefix+"jo_smry_rmk","",0);
			}
			//if (GetCellValue(i, prefix+"acct_yrmon") == "TOTAL") {				
			//	SetCellValue(i, prefix+"stl_cmb_seq","",0);
			//	SetCellValue(i, prefix+"vvd","",0);
			//}
     	}
		
		for(var i=HeaderRows(); i<=LastRow(); i++) {
    		if (GetCellValue(i, prefix+"acct_yrmon") == "TOTAL") {
    			SetMergeCell(i,1,iRowCnt,6); // 6칸 머지
    			break;
    		}
		}
	}
}
function sheet1_OnSaveEnd(sheetObj, Code, ErrMsg) {
	 ComOpenWait(false);// always exist at first line
	 doActionIBSheet(sheetObj, document.form, IBSEARCH);
}
function sheet1_OnKeyUp(sheetObj, Row, Col, KeyCode, Shift){
	var sName=sheetObj.ColSaveName(Col);
	var Value=sheetObj.GetEditText();
	//moving next field in case of inputting 4 characters
	if ((sName == (prefix+"vsl_cd")) && (Value.length == 4)){
		sheetObj.SelectCell(Row, prefix+"skd_voy_no",true);
	}
	//moving next field in case of inputting 4 characters
	if (sName == prefix+"skd_voy_no" && Value.length==4){
		sheetObj.SelectCell(Row, prefix+"skd_dir_cd",true);
	}
}
function sheet1_OnChange(sheetObj, Row, Col, Value) {
	var sName=sheetObj.ColSaveName(Col);
	var formObj=document.form;
	var vvd=sheetObj.GetCellValue(Row, prefix+"vsl_cd");
	vvd=vvd + sheetObj.GetCellValue(Row, prefix+"skd_voy_no");
	vvd=vvd + sheetObj.GetCellValue(Row, prefix+"skd_dir_cd");
	if (sName == prefix+"vsl_cd"){
		if (Value.length < 4){
			ComShowMessage("Vessel length is 4");
			sheetObj.SelectCell(Row, Col, true);
			return;
		}
		if (vvd.length == 9){
			gVVD=vvd;
			gCurRow=Row;
			doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC01);
		}
	}
	if (sName == prefix+"skd_voy_no"){
		if (Value.length < 4){
			ComShowMessage("Voyage length is 4");
			sheetObj.SelectCell(Row, Col, true);
			return;
		}
		if (vvd.length == 9){
			gVVD=vvd;
			gCurRow=Row;
			doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC01);
		}
	}
	if (sName == prefix+"skd_dir_cd"){
		if (vvd.length == 9){
			gVVD=vvd;
			gCurRow=Row;
			doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC01);
		}
	}
	//can't check mannual settle when ABBR is W/R or P/B
	if (sName == prefix+"jo_stl_itm_cd"){
		if (Value=="P/B" || Value=="W/R"){
			sheetObj.SetCellEditable(Row,prefix+"jo_mnl_cre_flg",0);
		}else{
			sheetObj.SetCellEditable(Row,prefix+"jo_mnl_cre_flg",1);
		}
	}
	//setting ETA, ETD in case of changing Basic Port
	if (sName == prefix+"stl_bzc_port_cd"){
		var eta="";
		var etd="";
		//getting ETA, ETD of same VVD, Port
		for (var inx=0; inx<gBasicPortCombo.length; inx++){
			if (Value == gBasicPortCombo[inx][2]){
				eta=gBasicPortCombo[inx][3];
				etd=gBasicPortCombo[inx][4];
				break;
			}
		}
		sheetObj.SetCellValue(Row, prefix+"bzc_port_eta_dt",eta);
		sheetObj.SetCellValue(Row, prefix+"bzc_port_etd_dt",etd);
	}
	//setting ETA, ETD in case of changing Pair Port
	if (sName == prefix+"stl_pair_port_cd"){
		var eta="";
		var etd="";
		//getting ETA, ETD of same VVD, Port
		for (var inx=0; inx<gPairPortCombo.length; inx++){
			if (Value == gPairPortCombo[inx][0]){
				eta=gPairPortCombo[inx][1];
				etd=gPairPortCombo[inx][2];
				break;
			}
		}
		sheetObj.SetCellValue(Row, prefix+"pair_port_eta_dt",eta);
		sheetObj.SetCellValue(Row, prefix+"pair_port_etd_dt",etd);
	}
}
function ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){
	sheetObjects[0].RemoveAll();
}
function checkCol(sheetObj, formObj){
	//sheetObj.RenderSheet(0);
	if(formObj.vvd_chk.checked == true || formObj.combined_chk.checked == true){
		sheetObj.SetColHidden(prefix + "eff_dt",1);
		sheetObj.SetColHidden(prefix + "jo_smry_rmk",1);
	}else if(formObj.vvd_chk.checked == false || formObj.combined_chk.checked == false){
		sheetObj.SetColHidden(prefix + "eff_dt",0);
		sheetObj.SetColHidden(prefix + "jo_smry_rmk",0);

		var info = {Width:90};
		sheetObj.SetColProperty(0, prefix + "eff_dt", info);
		sheetObj.SetColProperty(0, prefix + "benefit_line", info);
		sheetObj.SetColProperty(0, prefix + "jo_smry_rmk", info);
	}
	//sheetObj.RenderSheet(1);
}
function click_combined_chk(){
	var sheetObj=sheetObjects[0];
	if (document.form.combined_chk.checked || document.form.vvd_chk.checked){
		ComBtnDisable("btn_save");
	}else{
		ComBtnEnable("btn_save");
	}
	sheetObj.RemoveAll();
}
function click_vvd_chk(){
	var sheetObj=sheetObjects[0];
	if (document.form.combined_chk.checked || document.form.vvd_chk.checked){
		ComBtnDisable("btn_save");
	}else{
		ComBtnEnable("btn_save");
	}
	sheetObj.RemoveAll();
}

function resizeSheet(){
    ComResizeSheet(sheetObjects[0]);
}

