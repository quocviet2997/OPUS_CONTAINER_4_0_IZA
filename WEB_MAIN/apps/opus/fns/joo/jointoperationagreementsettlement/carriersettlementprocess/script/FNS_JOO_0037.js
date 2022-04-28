/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : fns_joo_0037.jsp
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
//현재 row
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
//			doActionIBCombo(sheetObjects[0] , document.form ,IBSEARCH , comboObjects[2], SEARCHLIST07 ,"rlane_cd");	
//			doActionIBCombo(sheetObjects[0] , document.form ,IBSEARCH , comboObjects[1], SEARCHLIST06 ,"trd_cd"); 
			gNew=false;
			break;
		case "btn_downexcel":
			var paramObj=new Object();
            var url=ComJooGetPgmTitle(sheetObjects[0], paramObj);
			if(sheetObject1.RowCount() < 1){//no data
        		 ComShowCodeMessage("COM132501");
	       		}else{
	       			  
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
function loadPage(crrCombo,abbrSheet ) {
	var formObject=document.form;
	for (i=0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i+1);// abbrSheet, dirSheet, staSheet);
		ComEndConfigSheet(sheetObjects[i]);
	}
    for(var k=0;k<comboObjects.length;k++){
        initCombo(comboObjects[k],k+1, crrCombo);
    }
  //handling Axon event. event catch
    axon_event.addListenerForm  ('beforedeactivate', 'obj_deactivate',  form); 			 
	axon_event.addListenerFormat('beforeactivate',   'obj_activate',    form);            //- handling code when OnBeforeActivate event in case of existing dataformat property
//	axon_event.addListenerFormat('keypress',         'obj_keypress', 	form);            //- handling code when onkeypress event in case of existing dataformat property
//	axon_event.addListenerFormat('keyup'           , 'form_keyup'    ,  form);    
//	axon_event.addListener('keypress', 'from_dt_keypress', 'from_dt');
//	axon_event.addListener('keypress', 'to_dt_keypress',   'to_dt');
	doActionIBSheet(sheetObjects[sheetObjects.length-1], formObject, IBSEARCH_ASYNC02);
	doActionIBSheet(sheetObjects[sheetObjects.length-1], formObject, IBSEARCH_ASYNC03);
	doActionIBSheet(sheetObjects[sheetObjects.length-1], formObject, IBSEARCH_ASYNC04);
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
//setting lane combo by Trd
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
	sheetObj.SetWaitImageVisible(0);
    sheetObj.CellComboItem(Row,prefix+"stl_bzc_port_cd", {ComboText:portItems, ComboCode:portItems} );
    sheetObj.CellComboItem(Row,prefix+"stl_pair_port_cd", {ComboText:portItems, ComboCode:portItems} );
    sheetObj.SetWaitImageVisible(1);
}
/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
 function initSheet(sheetObj,sheetNo) {
     var cnt=0;
     switch(sheetNo) {
         case 1:      // sheet1 init
             with (sheetObj) {            
//             (10, 0, 0, true);
	             var HeadTitle="|Month|Trade|Lane|Carrier|Combined No.|Cur.|Rev.(Slip)|Exp.(Slip)|Balance|Benefit Line";
	             SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
	             var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
	             var headers = [ { Text:HeadTitle, Align:"Center"} ];
	             InitHeaders(headers, info);
	             var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"Status" },
				//{Type:"Date",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"acct_yrmon",   KeyField:0,   CalcLogic:"",   Format:"Ym",          PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
				{Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"acct_yrmon",   KeyField:0,   CalcLogic:"",   Format:"",          PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
				{Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"trd_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
				{Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"rlane_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
				{Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"jo_crr_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
				{Type:"Text",      Hidden:1,  Width:130,  Align:"Center",  ColMerge:0,   SaveName:prefix+"stl_cmb_seq",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
				{Type:"Text",      Hidden:0,  Width:130,  Align:"Center",  ColMerge:0,   SaveName:prefix+"locl_curr_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
				{Type:"Float",   Hidden:0, Width:100,  Align:"Right",   ColMerge:0,   SaveName:prefix+"jo_rev",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",       PointCount:2,   UpdateEdit:0,   InsertEdit:1 },
				{Type:"Float",   Hidden:0, Width:100,  Align:"Right",   ColMerge:0,   SaveName:prefix+"jo_exp",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",       PointCount:2,   UpdateEdit:0,   InsertEdit:1 },
				{Type:"Float",   Hidden:0, Width:100,  Align:"Right",   ColMerge:0,   SaveName:prefix+"jo_balance",   KeyField:0,   CalcLogic:"",   Format:"NullFloat",       PointCount:2,   UpdateEdit:0,   InsertEdit:1 },
				{Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"benefit_line", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 } ];
	              
	             InitColumns(cols);
	             SetEditable(1);
//	             SetSheetHeight(520);
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
			formObj.f_cmd.value=SEARCH;
 			sheetObj.DoSearch("FNS_JOO_0037GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix) );
 			//UI 성능 개선(201407)
 			//setSumText(sheetObj); 			
			break;  
        case    IBSEARCH_ASYNC02:   //Get TRD_CD COMBO
                formObj.f_cmd.value=SEARCHLIST06;            
                var param=FormQueryString(formObj);
                 var sXml=sheetObj.GetSearchData("JOOCommonGS.do", param);
                ComXml2ComboItem( sXml, trd_cd, "code","code" );
                trd_cd.InsertItem(0, '', ''); 
                break;
        case    IBSEARCH_ASYNC03:   //Get rlane_cd COMBO
                formObj.f_cmd.value=SEARCHLIST07;            
                formObj.super_cd1.value="";
                formObj.super_cd2.value=trd_cd.GetSelectCode();
                var param=FormQueryString(formObj);
                 var sXml=sheetObj.GetSearchData("JOOCommonGS.do", param);
                ComXml2ComboItem( sXml, rlane_cd, "code","code" );
                rlane_cd.InsertItem(0, '', ''); 
                break;
        case    IBSEARCH_ASYNC04:   //Get jo_crr_cd COMBO
                formObj.f_cmd.value=SEARCH02;            
                formObj.super_cd1.value=rlane_cd.GetSelectText();
                formObj.super_cd2.value="";
                var param=FormQueryString(formObj);
                 var sXml=sheetObj.GetSearchData("JOOCommonGS.do", param);
                ComXml2ComboItem( sXml, jo_crr_cd, "code","code" );
                jo_crr_cd.InsertItem(0, '', ''); 
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
                 SetDropHeight(160);
                 SetMaxLength(3);
                 ValidChar(2,1);//only upper case, numbers                 
             }
             break; 
         case "trd_cd": 
             with (comboObj) { 
                 SetMultiSelect(0);
                 SetUseAutoComplete(1);
                 SetColAlign(0, "left");
                 SetColAlign(1, "left");
                 SetDropHeight(160);
                 SetMaxLength(3);
                 ValidChar(2,1);//only upper case, numbers                 
             }
             break;
         case "rlane_cd": 
             with (comboObj) { 
                 SetMultiSelect(0);
                 SetUseAutoComplete(1);
                 SetColAlign(0, "left");
                 SetColAlign(1, "left");
             //  SetColWidth("0|30");
                 SetDropHeight(160);
                 ValidChar(2,1);//only upper case, numbers
                 SetMaxLength(5);
             }
             break;
     	case "ofc_cd":
    		with (comboObj) {
    			SetMultiSelect(0);
    			SetUseAutoComplete(1);
    			SetColAlign(0, "left");
    			SetColWidth(0, "75");
    			SetDropHeight(200);
     			ValidChar(2,1);//only upper case
    			SetMaxLength(3);
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
//     sheetObjects[0].WaitImageVisible = false;   
 //  doActionIBCombo(sheetObjects[0] , document.form ,IBSEARCH , comboObjects[2], SEARCHLIST07 ,"rlane_cd"); 
 //  doActionIBCombo(sheetObjects[0] , document.form ,IBSEARCH , comboObjects[1], SEARCHLIST06 ,"trd_cd"); 
//     sheetObjects[0].WaitImageVisible = true;   
 }
// retrieving Lane SVC Type
function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey) {
    sheetObj.ShowDebugMsg(false);
    switch(sAction) {
       case IBSEARCH: //TRADE
			//if(validateForm(sheetObj,formObj,sAction))
			if (sComboObj.id == "trd_cd") {
				//initializing combo
				sComboObj.RemoveAll();
				formObj.f_cmd.value=sComboAction;
				formObj.code.value="";
				formObj.super_cd1.value=jo_crr_cd.GetSelectText();
				formObj.super_cd2.value="";
				var sXml=sheetObj.GetSearchData("JOOCommonGS.do", FormQueryString(formObj));
				//Trade setting
				var comboItems=ComGetEtcData(sXml, sComboKey).split("|");
				addComboItem(sComboObj,comboItems);
			}else if (sComboObj.id == "rlane_cd"){
				//initializing combo
				sComboObj.RemoveAll();
				formObj.f_cmd.value=sComboAction;
				formObj.code.value="";
				formObj.super_cd1.value=jo_crr_cd.GetSelectText();
				formObj.super_cd2.value=trd_cd.GetSelectText();
				var sXml=sheetObj.GetSearchData("JOOCommonGS.do", FormQueryString(formObj));
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
					from_dt.focus();
					return false;
				}
				if (ComGetDaysBetween(fr+"-01", to+"-01") < 0){
					ComShowCodeMessage("JOO00078");
					to_dt.focus();
					return false;
				}
				break;
		}
	}
	return true;
}
function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
	var backColor1 = "#F7E1EC";
	var fontColor1 = "#0054FF";
	var backColor2 = "#F7E1EC";
	var fontColor2 = "#0054FF";
	var backColor3 = "#C9D5EB";
	var fontColor3 = "#0054FF";	
	var iRowCnt = 0;
	with(sheetObj) {
		for(var i=HeaderRows(); i<=LastRow(); i++) {
    		if (GetCellValue(i, prefix+"acct_yrmon") == "TOTAL") {
				SetRowBackColor(i,backColor3);			//색상설정
				SetCellFont("FontBold", i, 0, i, LastCol(),1);
				SetCellValue(i, prefix+"stl_cmb_seq","", 0);
				iRowCnt ++;
			} else if (GetCellValue(i, prefix+"jo_crr_cd") == "Sub-Total") {
				SetRowBackColor(i,backColor1);			//색상설정	
				SetCellValue(i, prefix+"stl_cmb_seq","", 0);
			}else if(GetCellValue(i, prefix+"jo_crr_cd") == "") {
				SetCellValue(i, prefix+"stl_cmb_seq","", 0);
			}
    		SetRowEditable(i, 0);
     	}
		
		for(var i=HeaderRows(); i<=LastRow(); i++) {
    		if (GetCellValue(i, prefix+"acct_yrmon") == "TOTAL") {
    			SetMergeCell(i,1,iRowCnt,4); // 6칸 머지
    			break;
    		}
		}
		
				
	}	
//	setSumText(sheetObj);
}
//UI 개선(201407)	
function setSumText(sheetObj){
		with(sheetObj)
		{
			var carrier=jo_crr_cd.GetSelectText();
			var trade=trd_cd.GetSelectText();
			var rlane=rlane_cd.GetSelectText();
			
			if(trade =='' && rlane == ''){
				ShowSubSum([{StdCol:prefix+"trd_cd", SumCols:"5|6|7"}]);       				
			}
			
			if(trade !='' && rlane == ''){
				ShowSubSum([{StdCol:prefix+"rlane_cd", SumCols:"5|6|7"}]);				
			}

			if(rlane != ''){
			}					
		}		
		sheetObj.SetSumText(0,prefix+"acct_yrmon","TOTAL");			
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

function resizeSheet(){
    ComResizeSheet(sheetObjects[0]);
}