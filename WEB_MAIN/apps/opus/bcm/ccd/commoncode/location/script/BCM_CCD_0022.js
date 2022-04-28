/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0022.js
*@FileTitle  : equipment ORG chart
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/03
=========================================================*/
/** Common global variable */
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
var prefix1="sheet1_";
var clickVal="";
var onLoadFlg = "Y";
var selectScc = "";

/** Event handler processing by button click event */
document.onclick=processButtonClick;
/** Event handler processing by button name */
function processButtonClick(){
    /*****Case more than two additional sheets tab sheet is used to specify a variable *****/
    var sheetObject1=sheetObjects[0];
    /*******************************************************/
    var formObject=document.form;
    try {
        var srcName=ComGetEvent("name");
        switch(srcName) {
            case "btn_Retrieve":
                doActionIBSheet(sheetObject1, formObject, IBSEARCH);
                break;
            case "btn_Down_Excel":
                ComOpenWait(true);
                if(sheetObject1.RowCount() < 1){//no data
                    ComShowCodeMessage("COM132501");
                }else{
                    sheetObject1.Down2Excel({ HiddenColumn:1,DownCols:"sheet1_seq|sheet1_rcc_cd|sheet1_lcc_cd|sheet1_ecc_cd|sheet1_scc_cd|sheet1_delt_flg|sheet1_upd_dt|sheet1_upd_usr_id",Merge:true,TreeLevel:false});
                }                   
                break;
            case "btn_New":
                clearAllData(sheetObject1, formObject);
                break;
            case "btn_Save": 
                doActionIBSheet(sheetObject1, formObject, IBSAVE);
                break;
            case "btn_Row_Add":
                sheetObject1.DataInsert();
                break;
            case "btn_Row_Copy":
                var copyRow=sheetObject1.DataCopy();
                sheetObject1.SetCellValue(copyRow, prefix1+"delt_chk",0,0);
                sheetObject1.SetCellValue(copyRow, prefix1+"seq","",0);
                sheetObject1.SetCellValue(copyRow, prefix1+"delt_flg","N",0);
                sheetObject1.SetCellValue(copyRow, prefix1+"upd_dt","",0);
                sheetObject1.SetCellValue(copyRow, prefix1+"upd_usr_id","",0);
                break;
            case "btn_Row_Delete":
                var chkIdxStr=sheetObject1.FindCheckedRow(prefix1+"delt_chk");
                
                if(chkIdxStr == "") {
                    ComShowCodeMessage("COM12114", "Del.");
                }else {
                    var chkIdxArr=chkIdxStr.split("|");
                    
                    //for(var i=chkIdxArr.length-2 ; i>=0 ; i--) {
                    for(var i=chkIdxArr.length-1 ; i>=0 ; i--) {
                        var chkIdx=chkIdxArr[i];
                        if(sheetObject1.GetRowStatus(chkIdx) == "I") {
                            sheetObject1.RowDelete(chkIdx, false);
                        }
                    }
                }
                break;
            case "loc_btn":
                var display="0,1,1,1,1,1";
                var targetObjList="loc_dpth_cd:loc_type|loc_cd:location";
                var param="?depth=3&classId=COM_ENS_0O1&scc_flag=Y";
                ComOpenPopupWithTarget('/opuscntr/COM_ENS_0O1.do' + param, 500, 450, targetObjList, display, true);
                break;
        } // end switch
    }catch(e) {
        if( e == "[object Error]") {
            ComShowMessage(OBJECT_ERROR);
        }else {
            ComShowMessage(e.message);
        }
    }
}
/**
 * registering IBSheet Object as list
 * adding process for list in case of needing batch processing with other items 
 * defining list on the top of source
 */
function setSheetObject(sheet_obj){
    sheetObjects[sheetCnt++]=sheet_obj;
}
/**
 * registering IBCombo Object as list
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
function loadPage() {
    for(i=0;i<sheetObjects.length;i++){
        ComConfigSheet (sheetObjects[i] );
        initSheet(sheetObjects[i],i+1);
        ComEndConfigSheet(sheetObjects[i]);
    }
    for(var k=0;k<comboObjects.length;k++){
        initCombo(comboObjects[k],k+1);
    }
    initControl();
    document.form.location.disabled=true;
    doActionIBCombo(sheetObjects[0], document.form, SEARCH01);
    var formObj=document.form;
    // auth_tp_cd retrieve
    doActionIBSheet(sheetObjects[0], formObj, SEARCH01);
    doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
        
    if(G_MDAA_CHK == 'Y') {
        //ComEnableObject(formObj.delt_flg, true);
        ComSetDisplay('btn_Row_Add', true);
        ComSetDisplay('btn_Row_Copy', false);
        ComSetDisplay('btn_Row_Delete', true);
        ComSetDisplay('btn_Save', true);
    } else {
        //ComEnableObject(formObj.delt_flg, false);
        ComSetDisplay('btn_Row_Add', false);
        ComSetDisplay('btn_Row_Copy', false);
        ComSetDisplay('btn_Row_Delete', false);
        ComSetDisplay('btn_Save', false);
    }
}

/**
 * Define an event control
 */
function initControl() {
	var formObj = document.form;
	axon_event.addListener("change", "obj_change", "loc_type");
/*
	axon_event.addListenerForm("focus", "obj_focus", formObj);
	axon_event.addListenerForm("change", "obj_change", formObj);
	axon_event.addListener("keyup", "obj_keyup", "location");
	ComClearSeparator (document.form.scc_cd, "eng");
*/
}

/**
  * setting sheet initial values and header
  * param : sheetObj, sheetNo
  * adding case as numbers of counting sheets
  */
function initSheet(sheetObj,sheetNo) {
    var cnt=0;
    var sheetID=sheetObj.id;
    switch(sheetID) {
        case "sheet1":      //sheet1 init
            with(sheetObj){
       
          var HeadTitle="|Del.|Seq|RCC|LCC|ECC|SCC|Status|Create Date|Create by|Update Date|Update by|Remarks|etc_flg";
          var headCount=ComCountHeadTitle(HeadTitle);

          SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );

          var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
          var headers = [ { Text:HeadTitle, Align:"Center"} ];
          InitHeaders(headers, info);

          var cols = [ 
	                 {Type:"Status",    Hidden:1, Width:20,   Align:"Left",    ColMerge:0,   SaveName:prefix1+"ibflag",     KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix1+"delt_chk",   KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:-1 },
	                 {Type:"Seq",       Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix1+"seq",        KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                 {Type:"ComboEdit", Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix1+"rcc_cd",     KeyField:1,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:5 },
	                 {Type:"PopupEdit", Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix1+"lcc_cd",     KeyField:1,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:5 },
	                 {Type:"PopupEdit", Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix1+"ecc_cd",     KeyField:1,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:5 },
	                 {Type:"PopupEdit", Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix1+"scc_cd",     KeyField:1,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:5 },
	                 {Type:"Combo",     Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix1+"delt_flg",   KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:5 },
	                 {Type:"Text",      Hidden:0, Width:190,  Align:"Center",  ColMerge:0,   SaveName:prefix1+"cre_dt",     KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                 {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix1+"cre_usr_id", KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                 {Type:"Text",      Hidden:0, Width:190,  Align:"Center",  ColMerge:0,   SaveName:prefix1+"upd_dt",     KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                 {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix1+"upd_usr_id", KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                 {Type:"Text",      Hidden:0, Width:100,  Align:"Left",    ColMerge:0,   SaveName:prefix1+"remark",     KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                 {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix1+"etc_flg",    KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
           
          InitColumns(cols);

          SetEditable(1);
          SetWaitImageVisible(0);
          SetColProperty(0 , prefix1+"rcc_cd", {AcceptKeys:"E|N" , InputCaseSensitive:1});
          SetColProperty(0 , prefix1+"lcc_cd", {AcceptKeys:"E|N" , InputCaseSensitive:1});
          SetColProperty(0 , prefix1+"ecc_cd", {AcceptKeys:"E|N" , InputCaseSensitive:1});
          SetColProperty(0 , prefix1+"scc_cd", {AcceptKeys:"E|N" , InputCaseSensitive:1});
          SetShowButtonImage(2);
          SetSheetHeight(485);
          resizeSheet();
          
          SetCountFormat("SELECTDATAROW / ROWVIEWCOUNT")
          }

          break;
        }
}
function resizeSheet(){
	ComResizeSheet(sheetObjects[0]);
}
/**
 * All the combo box query
 */
function doActionIBCombo(sheetObj,formObj,sAction){
    switch (sAction) {
        case SEARCH01: // load page
            var sXml=sheetObj.GetSearchData("BCM_CCD_0022GS.do", "f_cmd=" + SEARCH01);
            var comboXml=ComXml2ComboString(sXml, "cd_desc", "cd");
            if(comboXml!=null){
                //RCC Combo Setting
                sheetObj.SetColProperty(prefix1+"rcc_cd", {ComboText:"|"+comboXml[0], ComboCode:"|"+comboXml[1]} );
            }
            //Status Combo Setting
            var comboArr=["Active|Delete", "N|Y"];
            sheetObj.SetColProperty(prefix1+"delt_flg", {ComboText:"|"+comboArr[0], ComboCode:"|"+comboArr[1]} );
        break;
    }
}
//handling sheet process
function doActionIBSheet(sheetObj,formObj,sAction) {
    switch(sAction) {
        case SEARCH01: // MDM AUTH_TP_CD query
            var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=MDAA';
            var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
            // global var setting
            G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
            G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
            break;
        case IBSEARCH:      //Retrieve
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH;
                var sParam=FormQueryString(formObj);
                sheetObj.DoSearch("BCM_CCD_0022GS.do", sParam + "&" + ComGetPrefixParam(prefix1) );
            }
            break;
        case IBSAVE:
            if(validateForm(sheetObj,formObj,sAction)){
                formObj.f_cmd.value=MULTI;
                var sParam=FormQueryString(formObj);
                if(ComShowCodeConfirm("COM130101", "Data")){
                    ComOpenWait(true);
                    sParam=sParam + "&" + ComGetSaveString(sheetObj, true, true) + "&" + ComGetPrefixParam(prefix1);
                    var sXml=sheetObj.GetSaveData("BCM_CCD_0022GS.do", sParam);
                    sheetObj.LoadSaveData(sXml);
                    for(var i=1 ; i<=sheetObj.LastRow(); i++) {
                        if(sheetObj.GetCellValue(i, prefix1+"etc_flg") == "F") {
                            sheetObj.SetCellFontColor(i, prefix1+"upd_dt","#FF0000");
                        }
                    }
                    var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
                    if(result != "F"){
                        var msgKey=ComGetEtcData(sXml, "msgKey");
                        if(msgKey == "P") {         //As SCC code is aleady exist, data was saved partially. Please check this again
                            ComShowCodeMessage("CCD00020");
                        }else if(msgKey == "F") {   //SCC code is aleady exist. Please check this again.
                            ComShowCodeMessage("CCD00021");
                        }else {                     //{?msg1} was saved successfully.
                            ComShowCodeMessage("COM130102", "Data");
                        }
                    }else{
                        ComShowCodeMessage("COM130103", "Data");
                    }
                }
            }
            break;
    }
}

/**
 * CHANGE EVENT
 */
function obj_change() {
	var formObject = document.form;
	/*****Case more than two additional sheets tab sheet is used to specify a variable *****/
	/*******************************************************/

	try {
			if (formObject.loc_type.value == "") {
				document.form.location.value = "";
				document.form.location.disabled = true;
				document.form.location.setAttribute("className", "input2");
			} else {
				document.form.location.value = "";
				document.form.location.disabled = false;
				document.form.location.setAttribute("className", "input1");
			}
	} catch (e) {
		if (e == "[object Error]") {
			ComShowMessage(OBJECT_ERROR);
		} else {
			ComShowMessage(e.message);
		}
	}
}

function sheet1_OnMouseDown(sheetObj, button, shift, x, y) {
    with(sheetObj) {
        if(MouseRow()> 0 && MouseCol()== SaveNameCol(prefix1+"rcc_cd")) {
            clickVal=GetCellValue(MouseRow(), MouseCol());
        }
    }
}
function sheet1_OnComboChange(sheetObj, row, col, code, text) {
    with(sheetObj) {
        var colNm=ColSaveName(col);
        if(colNm == prefix1+"rcc_cd" && text == " ") {
            SetCellValue(row, col,clickVal,0);
        }
    }
}
/**
 * Sheet1 CHANGE EVENT
 * @param sheetObj
 * @param row
 * @param col
 * @param val
 */
function sheet1_OnChange(sheetObj, row, col, val) {
    with(sheetObj) {
        var formObj=document.form;
        var colNm=ColSaveName(col);
        switch (colNm) {
            // Code Validation
            case prefix1+"rcc_cd":
            case prefix1+"lcc_cd":
            case prefix1+"ecc_cd":
            	loadEqOrgCht(sheetObj, row, colNm, val, "N");
            	break;
            case prefix1+"scc_cd":
            	loadEqOrgCht(sheetObj, row, colNm, val, "Y");
                break;
            // Only One Del Check
            case prefix1+"delt_chk":
            	if(GetCellValue(row, prefix1+"ibflag") != "I"){
            		ComShowCodeMessage("CCD00084");
            		SetCellValue(row, prefix1+"delt_chk", 0, 0);
            	}
                
                break;
            case prefix1+"delt_flg":
                if(val == "Y") {
                    if(ComShowCodeConfirm("COM130301", "data")) {
                        var result=checkDelValidation(formObj, sheetObj, row);
                        if(result != "") {
                            ComShowCodeMessage(result);
                            sheetObj.SetCellValue(row, prefix1+"delt_flg","N",0);
                        }
                    }
                }
                break;
        }
    }
}
function sheet1_OnPopupClick(sheetObj, row, col) {
    with(sheetObj) {
        var formObj=document.form;
        var colNm=ColSaveName(col);
        switch (colNm) {
            case prefix1+"lcc_cd":
            case prefix1+"ecc_cd":
            case prefix1+"scc_cd":
                var dispaly="0,0";
                var classId="COM_ENS_051";
                var sheet="1";
                var param="";
                var rtnFnc="";
                if(colNm == prefix1+"scc_cd") {
                    param='?sheet='+sheet+'&classId='+classId+'&main_page=false';
                }else {
                    param='?sheet='+sheet+'&classId='+classId+'&main_page=false&scc_flg=Y';
                }
                ComOpenPopup('COM_ENS_051.do' + param, 800, 460, "locCodeHelp", dispaly, true, false, row, col); 
                break;
        }
    }
}
function locCodeHelp(rowArray, row, col) {
    var colArray=rowArray[0];
    var sheetObj=sheetObjects[0];
    sheetObj.SetCellValue(row, col,colArray[1],1);
}
/**
 * All Data Clear
 * @param sheetObj
 * @param formObj
 */
function clearAllData(sheetObj, formObj){
    formObj.reset();
    sheetObj.RemoveAll();
    onLoadFlg = "Y";
    doActionIBSheet(sheetObj, formObj, IBSEARCH);
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj,formObj,sAction) {
    switch(sAction) {
        case IBSEARCH:      //Retrieve
            if(formObj.loc_type.value != "" && ComTrimAll(formObj.location.value) == ""){
                ComShowCodeMessage("CCD00001", "Location Code");
                formObj.location.focus();
                return false;
            }
            break;
        case IBSAVE:        //Save
            if(!sheetObj.IsDataModified()) {
                ComShowCodeMessage("CCD00019");
                return false;
            }
            if(sheetObj.GetSaveString() == "") {
                return false;
            }
            break;
    }
    return true;
}
/**
 * Validation For Delete
 * @param formObj
 * @param sheetObj
 * @param chkIdx
 */
function checkDelValidation(formObj, sheetObj, chkIdx) {
    formObj.f_cmd.value=SEARCH04;
    var sParam=FormQueryString(formObj);
    //var chkStr = sheetObj.GetSaveString(false, true, prefix1+"delt_chk");
    //var sXml = sheetObj.GetSaveXml("BCM_CCD_0022GS.do", sParam + "&" + chkStr);
    var sXml=sheetObj.GetSearchData("BCM_CCD_0022GS.do", sParam + "&scc_cd=" + sheetObj.GetCellValue(chkIdx, prefix1+"scc_cd"));
    var result=ComGetEtcData(sXml, "result");
    return result;
}

function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) {
	
	if(onLoadFlg == "Y"){
		for(var i = 1; i <= sheetObj.RowCount(); i++){
			sheetObj.SetRowHidden(i, 1);
		}	
	} else {
		if(document.form.loc_type.value != ""){
			var rowCount = sheetObj.RowCount();

			for(var i = 1; i <= sheetObj.RowCount(); i++){
				if(
				  	  sheetObj.GetCellValue(i, "sheet1_"+document.form.loc_type.value.toLowerCase() + "cc_cd") != document.form.location.value
				   || sheetObj.GetCellValue(i, "sheet1_delt_flg") == document.form.delt_flg.value
				){
					sheetObj.SetRowHidden(i, 1);
					rowCount--;
				}
			}	
			
			if(rowCount == 0){
				//msgs['CCD00002'] = 'There is no data.';
	    		ComShowCodeMessage("CCD00002");
			}
		}
	}
	ComOpenWait(false);
	
	onLoadFlg = "N"
}

function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
    ComOpenWait(false);
}

function sheet1_OnDownFinish(sheetObj, downloadType, result) {
    ComOpenWait(false);
}

function loadEqOrgCht(sheetObj, row, colNm, val, sccFlg){
	var formObj         = document.form;
    var locType         = colNm.substring(colNm.length-6, colNm.length);
    formObj.f_cmd.value = SEARCH05;
    var sParam          = FormQueryString(formObj);
    selectScc           = "";
    
    if(sccFlg == "Y"){
    	var existFlg = "N";
    	selectScc    = val;
    	for(var i = 0; i <= sheetObj.RowCount(); i++){
    		if(sheetObj.GetCellValue(i, "sheet1_scc_cd") == sheetObj.GetCellValue(row, "sheet1_scc_cd") && i != row){
    			sheetObj.SetRowHidden(i, 0);
    			sheetObj.SelectCell  (i, "sheet1_scc_cd");
    			sheetObj.RowDelete   (row);
    			existFlg = "Y"
    		}
    	}
    	
    	if(existFlg != "Y"){
    		if(colNm == prefix1+"scc_cd") {
                formObj.f_cmd.value=SEARCH03;       // Search SCC CD In Loc Code 
            }else {
                formObj.f_cmd.value=SEARCH02;       // Search RCC CD or LCC CD or ECC CD in Scc Code
            }
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0022GS.do", sParam + "&loc_cd=" + val);
            var result=ComGetEtcData(sXml, "result");
            if(result == "") {
            	//msgs['CCD00013'] = 'The location of "{?msg1}" is not defined in location table. Please check location code.';
                ComShowCodeMessage("CCD00013", val);
                sheetObj.SetCellValue(row, prefix1+"scc_cd","",0);
                sheetObj.SelectCell  (row, prefix1+"scc_cd");
            } else {
    			sheetObj.SetCellEditable( row, prefix1+"rcc_cd", 1)	
    			sheetObj.SetCellEditable( row, prefix1+"lcc_cd", 1)	
    			sheetObj.SetCellEditable( row, prefix1+"ecc_cd", 1)	
            }
    	}
    } else {
    	for(var i = 0; i <= sheetObj.RowCount(); i++){
        	if(i != row){
        		if(colNm == "sheet1_rcc_cd"){
        			if(sheetObj.GetCellValue(i, "sheet1_lcc_cd") == sheetObj.GetCellValue(row, "sheet1_lcc_cd")){
        				sheetObj.SetCellValue(i, "sheet1_rcc_cd", sheetObj.GetCellValue(row, "sheet1_rcc_cd"), 0);
        				sheetObj.SetCellBackColor(i, "sheet1_rcc_cd", "#ffff00");
        				sheetObj.SetRowHidden(i, 0);
        				autoCngFlg = "Y";
        			}
        		} else if(colNm == "sheet1_lcc_cd"){
        			if(sheetObj.GetCellValue(i, "sheet1_ecc_cd") == sheetObj.GetCellValue(row, "sheet1_ecc_cd")){
        				if(sheetObj.GetCellValue(i, "sheet1_lcc_cd") != sheetObj.GetCellValue(row, "sheet1_lcc_cd")){
        					sheetObj.SetCellValue(i, "sheet1_rcc_cd", sheetObj.GetCellValue(row, "sheet1_rcc_cd"), 0);
    	    				sheetObj.SetCellValue(i, "sheet1_lcc_cd", sheetObj.GetCellValue(row, "sheet1_lcc_cd"), 0);
    	    				sheetObj.SetCellBackColor(i, "sheet1_rcc_cd", "#ffff00");
    	    				sheetObj.SetCellBackColor(i, "sheet1_lcc_cd", "#ffff00");
    	    				sheetObj.SetRowHidden(i, 0);
    	    				sheetObj.SetCellValue(i, "sheet1_remark", "RCC & LCC automatically amended.");
    	    				autoCngFlg = "Y";	
        				}
        			} else if (sheetObj.GetCellValue(i, "sheet1_lcc_cd") == sheetObj.GetCellValue(row, "sheet1_lcc_cd")){
        				if(sheetObj.GetCellValue(i, "sheet1_rcc_cd") != sheetObj.GetCellValue(row, "sheet1_rcc_cd")){
            				sheetObj.SetCellValue(i, "sheet1_rcc_cd", sheetObj.GetCellValue(row, "sheet1_rcc_cd"), 0);
            				sheetObj.SetCellBackColor(i, "sheet1_rcc_cd", "#ffff00");
            				sheetObj.SetRowHidden(i, 0);
            				sheetObj.SetCellValue(i, "sheet1_remark", "RCC automatically amended.");
            				autoCngFlg = "Y";    					
        				}
        			}
        		} else if(colNm == "sheet1_ecc_cd"){
        			if(sheetObj.GetCellValue(i, "sheet1_ecc_cd") == sheetObj.GetCellValue(row, "sheet1_ecc_cd")){
        				if(sheetObj.GetCellValue(i, "sheet1_lcc_cd") != sheetObj.GetCellValue(row, "sheet1_lcc_cd")){
        					sheetObj.SetCellValue(i, "sheet1_rcc_cd", sheetObj.GetCellValue(row, "sheet1_rcc_cd"), 0);
            				sheetObj.SetCellValue(i, "sheet1_lcc_cd", sheetObj.GetCellValue(row, "sheet1_lcc_cd"), 0);
            				sheetObj.SetCellBackColor(i, "sheet1_rcc_cd", "#ffff00");
            				sheetObj.SetCellBackColor(i, "sheet1_lcc_cd", "#ffff00");
            				sheetObj.SetRowHidden(i, 0);
            				sheetObj.SetCellValue(i, "sheet1_remark", "RCC & LCC automatically amended.");
            				autoCngFlg = "Y";
        				} else if(sheetObj.GetCellValue(i, "sheet1_rcc_cd") != sheetObj.GetCellValue(row, "sheet1_rcc_cd")){
        					sheetObj.SetCellValue(i, "sheet1_rcc_cd", sheetObj.GetCellValue(row, "sheet1_rcc_cd"), 0);
        					sheetObj.SetCellBackColor(i, "sheet1_rcc_cd", "#ffff00");
        					sheetObj.SetRowHidden(i, 0);
        					sheetObj.SetCellValue(i, "sheet1_remark", "RCC automatically amended.");
        					autoCngFlg = "Y";
        				}
        			}
        		}
        		
        		if(
        		      sheetObj.GetCellValue(i, "sheet1_rcc_cd") == sheetObj.GetCellValue(row, "sheet1_rcc_cd")
        		   && sheetObj.GetCellValue(i, "sheet1_lcc_cd") == sheetObj.GetCellValue(row, "sheet1_lcc_cd")
        		   && sheetObj.GetCellValue(i, "sheet1_ecc_cd") == sheetObj.GetCellValue(row, "sheet1_ecc_cd")
        		   && sheetObj.GetCellValue(i, "sheet1_scc_cd") == sheetObj.GetCellValue(row, "sheet1_scc_cd")
        		){
        			sheetObj.RowDelete(i);
        		}
        			
        	}
        }
    	
        if(autoCngFlg == "Y"){
        	//msgs['CCD00086'] = "Related other data is shown and changed automatically.";
        	sheetObj.SetCellBackColor(row, colNm, "#ffff00");
        	ComShowCodeMessage("CCD00086");
        }
    }
    
    sheetObj.ColumnSort("sheet1_rcc_cd|sheet1_lcc_cd|sheet1_ecc_cd|sheet1_scc_cd");
}

function sheet1_OnColumnSort(sheetObj){
    if(selectScc != ""){
    	for(var i = 0; i < sheetObj.RowCount(); i++){
    		if(sheetObj.GetCellValue(i, "sheet1_scc_cd") == selectScc){
    			sheetObj.SelectCell(i, "sheet1_scc_cd");
    		}
    	}
    }
}