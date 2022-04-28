var sheetObjects=new Array();
var sheetCnt=0;
var prefix = "sheet1_";
var gCurRow=0;

document.onclick=processButtonClick;

function processButtonClick(){
	/**********/
	var sheetObj=sheetObjects[0];
	/*******************************************************/
	var formObject=document.form;
	try {
		var srcObj=window.event.srcElement;
		var srcName=ComGetEvent("name");
		switch(srcName) {
	        case "btn_Retrieve":
	        	doActionIBSheet(sheetObj,formObject,IBSEARCH);
	            break;
	        case "btn_DownExcel":
	        	sheetObjects[0].Down2Excel({ DownCols: makeHiddenSkipCol(sheetObj), SheetDesign:1, Merge:1});
	        	break;
	        case "btn_New":
                doActionIBSheet(sheetObj,formObject,IBRESET); 
	        	break;
    	 	case "btn_Save":
    	 		doActionIBSheet(sheetObj,formObject,IBSAVE);
 				break;
			case "btn_add":
				sheetObj.DataInsert(-1);
				createSeq(sheetObj, prefix+"line_seq");
				break;
			case "btn_ins":
				sheetObj.DataInsert();
				createSeq(sheetObj, prefix+"line_seq");
				break;
			case "btn_del":
				JooRowHideDelete(sheetObj, prefix+"del_chk");
				createSeq(sheetObj, prefix+"line_seq");
				break;
			case "btn_Close":
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
 * registering IBSheet Object as list
 * adding process for list in case of needing batch processing with other items
 * defining list on the top of source
 */
function setSheetObject(sheet_obj){
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
function loadPage() {
	
    for(i=0;i<sheetObjects.length;i++){
        ComConfigSheet (sheetObjects[i] );
        initSheet(sheetObjects[i],i+1);
        sheetObjects[i].SetWaitImageVisible(0);
        ComEndConfigSheet(sheetObjects[i]);
    }
    
    initControl();
    
    resizeSheet();
    
    doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
    
    //initConditionObject("C");
    //document.form.vsl_cd.focus();
}
 /**
 * loading HTML Control event <br>
 * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
 * @param {ibsheet} sheetObj    IBSheet Object
 * @param {int}     sheetNo     sequence number in sheetObjects array
 **/
function initControl() {
    var form=document.form;
/*    axon_event.addListenerForm('change', 'obj_change', form);
    
    $(document.form.vsl_cd).on('blur', function(){
		obj_change();
	});*/
    //resizeSheet();
}
/*function obj_change(){
	var formObj=document.form;
    var sheetObj=sheetObjects[0];
	try {
		var srcName=ComGetEvent("name");
        switch(srcName) {
            case "vsl_cd":
            	codeChangedRemove(sheetObj, formObj);
            	if(isCheckVslCd(sheetObj, formObj)){
            		formObj.voy_no.focus();
            	}else{
            		formObj.vsl_cd.focus();
            	}
            	break;
            case "voy_no":
            	if("" != formObj.voy_no.value && beforetab == 1){
            		getPreviousVvdAndLastPort();
            	}
            	break;
            case "voy_no":
            	if(beforetab==0) return;
            	
            	break;
        } // end switch
	}catch(e) {
		if( e == "[object Error]") {
			ComShowCodeMessage('VSK00011');
		} else {
			ComShowMessage(e.message);
		}
	}
}*/

/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
function initSheet(sheetObj,sheetNo) {
    var cnt=0;
    var formObj=document.form;
    var sheetID=sheetObj.id;
	//var prefix=sheetID + "_";
    
    switch(sheetNo) {
		case 1:
			with (sheetObj) {

		    	var HeadTitle  ="|Sel|Seq.|Lane|Option A|Option B";
			    
			    var headCount=ComCountHeadTitle(HeadTitle);
			    
			    SetConfig( { SearchMode:2, MergeSheet:5, Page:100, DataRowMerge:0 } );
		
			    var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
			    var headers = [ { Text:HeadTitle, Align:"Center"} ];
			    InitHeaders(headers, info);
		
			    var cols = [ 
			              {Type:"Status",   	Hidden:1, 	Width:50,    Align:"Center",  	ColMerge:1,   SaveName:prefix+"ibflag" },
			              {Type:"CheckBox", 	Hidden:0,   Width:50,   Align:"Center",     ColMerge:0,   SaveName:prefix+"del_chk" },
			              {Type:"Text",      	Hidden:0, 	Width:50,   Align:"Center",		ColMerge:0,   SaveName:prefix+"line_seq" },
			              {Type:"Text",     	Hidden:0,  	Width:100,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"slan_cd"		,KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:1,	EditLen:3 },
			              {Type:"Combo",     	Hidden:0,  	Width:150,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"option_a"	,KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			              {Type:"Combo",     	Hidden:0,  	Width:200,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"option_b"	,KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:1,   InsertEdit:1 }];
			     
			    InitColumns(cols);
		
			    //SetEditable(0);
			    SetCountFormat("[SELECTDATAROW / TOTALROWS]");
			    SetColProperty(0, prefix+"slan_cd" 			, {AcceptKeys:"E|[0123456789]" , InputCaseSensitive:1});
			    var optaTxt = "Roundup(Number, 1)|Round(Number, 1)|Round(Number, 2)|Rounddown(Number, 1)";
			    var optaCd = "OPTION1|OPTION2|OPTION3|OPTION4";
			    SetColProperty(0, prefix+"option_a", {ComboText:optaTxt, ComboCode:optaCd} );
			    var optbTxt = "Based on number of active reefer container on board|Based on number of active reefer container loading";
			    var optbCd = "OPTION1|OPTION2";
			    SetColProperty(0, prefix+"option_b", {ComboText:optbTxt, ComboCode:optbCd} );
			    //SetSheetHeight(302);
			    //resizeSheet();
			}
			break;
			
    }
 }
 
function doActionIBSheet(sheetObj,formObj,sAction) {
    sheetObj.ShowDebugMsg(false);
    sheetObj.SetWaitImageVisible(0);
    var sheetID=sheetObj.id;
    switch(sAction) {
        case IBSEARCH:      //retrieve
            if( !validateForm(sheetObj,formObj,sAction) ){return;}
            formObj.f_cmd.value=SEARCH;
        	var aryPrefix = new Array(prefix); // prefix
            var sParam=FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix);
            ComOpenWait(true);
			var sXml=sheetObj.GetSearchData("FNS_JOO_0087GS.do", sParam);
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			ComOpenWait(false);
            break;
        case IBSAVE:
			
        	if( !validateForm(sheetObj,formObj,sAction)) return;
        	var SaveStr=ComGetSaveString(sheetObjects[0], true, true);
        	if (SaveStr == ""){
        		ComShowCodeMessage("JOO00036");
        		return false;
        	}
        	if (!ComShowCodeConfirm("JOO00046")){
        		return false;
        	}
        	formObj.f_cmd.value=MULTI;
			//sheetObj.SetWaitImageVisible(0);
			ComOpenWait(true);
 			var sXml=sheetObj.GetSaveData("FNS_JOO_0087GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			ComOpenWait(false);
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			
        	break;
		case IBRESET:
			initSearchReset(sheetObj);
			break;
		case IBROWSEARCH:
			formObj.f_cmd.value=SEARCH07;
			var code=formObj.slan_cd.value;
            var param=FormQueryString(formObj)+"&code="+code;
            var sXml=sheetObj.GetSearchData("JOOCommonGS.do", param);
            var rowCnt=ComGetTotalRows( sXml );
            if(rowCnt <= 0){
            	ComShowCodeMessage("JOO00203");
				sheetObj.SetCellValue(gCurRow, prefix+"slan_cd","",0);
            }			
			break;
    }
}

function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
	 
}
function sheet1_OnChange(sheetObj,Row,Col,Value) {
	var sName=sheetObj.ColSaveName(Col);
	var formObj=document.form;
	gCurRow=Row;
	
	switch(sName){
		case prefix+"slan_cd":
			var tmpSlanCd=sheetObj.GetCellValue(Row, prefix+"slan_cd");
			if (tmpSlanCd.length == 3){	
				//Dup Check.
				var iDupRow = sheetObj.ColValueDup(prefix+"slan_cd", false);
				if( iDupRow != -1){
					ComShowCodeMessage("JOO00059", "Lane");
					sheetObj.SetCellValue(Row, prefix+"slan_cd","",0);
					return false;
				}
				
				//Dup이 아닐때 제대로 된 Lane 인지 체크.
				formObj.slan_cd.value = tmpSlanCd;
				doActionIBSheet(sheetObj, formObj, IBROWSEARCH);
			}else{
				ComShowCodeMessage("JOO00203");
				return false;
			}
			break;
	}
}
/**
 *  Creating seq when Deleting
 */
function createSeq(sheetObj, colName){
	 var k=0;
	 for(var i=sheetObj.HeaderRows(); i<=sheetObj.LastRow(); i++){
		 if(sheetObj.GetRowStatus(i) != "D"){
			 k++;
			 sheetObj.SetCellValue(i, colName,k,0);
		 }
	 }
	 sheetObj.RenderSheet(1);
}

/**
 * handling process for input validation
 */
function validateForm(sheetObj,formObj,sAction){
    with(formObj){
        switch ( sAction ){
             case IBSEARCH :
            	 if (!ComChkValid(formObj)) return false;
                 break;
             case IBSAVE:
            	 var prefix0 = sheetObj.id+"_";
            	 for(var i=sheetObj.HeaderRows(); i<=sheetObj.LastRow(); i++){
            		if(sheetObj.GetRowStatus(i) == "D"){
            			continue;
            		}
 					if(ComIsEmpty(sheetObj.GetCellValue(i, prefix0+"slan_cd"))){
 						ComShowCodeMessage('COM130403', " [Lane]");
 						return false;
 					}
 				 }
            	 break;
        }
    }
    return true;
}

function initSearchReset(sheetObj) {
	ComResetAll();
	for (var i=0; i<sheetObjects.length; i++){
        sheetObjects[i].RemoveAll();
    }
	
}	
/**
 * Setting Lane Code selected in Lane Code PopUp into Form Item <br>
 * @param {arry} aryPopupData
 */
function setFromLaneCd(aryPopupData){
    form.laneCd.value=aryPopupData[0][3];
}

function resizeSheet(){
	ComResizeSheet(sheetObjects[0], 150);
}
        