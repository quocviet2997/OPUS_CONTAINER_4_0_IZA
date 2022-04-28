/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : fns_joo_0033.jsp
 *@FileTitle: diplaying MAS data (estimation report)
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
 * @class fns_joo_0033 : business script for fns_joo_0033
 */
    // common global variable
    var tabObjects=new Array();
    var tabCnt=0;
    var beforetab=1;
    var sheetObjects=new Array();
    var sheetCnt=0;
    var comboObjects=new Array();
    var comboCnt=0;
    var gNew=false;
    var gCurRow=0;
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
			case "btns_back":
		    	sheetObjects[0].RemoveAll();
				if (formObject.exe_yrmon.value!=""){
					formObject.exe_yrmon.value=ComGetDateAdd(formObject.exe_yrmon.value+"-01","M",-1).substring(0,7);
				}
				break;
			case "btns_next":
				sheetObjects[0].RemoveAll();
				if (formObject.exe_yrmon.value!=""){
					formObject.exe_yrmon.value=ComGetDateAdd(formObject.exe_yrmon.value+"-01","M", 1).substring(0,7);
				}
				break;
    		case "btn_retrieve":
    			doActionIBSheet(sheetObject1, formObject, IBSEARCH);
    			break;
    		case "btn_new":
    			sheetObject1.RemoveAll();
    			
    			var tmpYm = ComGetDateAdd(ComGetNowInfo("ym","-")+"-02","M", -1);
    			formObject.exe_yrmon.value=JooGetDateFormat(tmpYm,"ym");
    			
    			break;
    		case "btn_save":
    			doActionIBSheet(sheetObject1, formObject, IBSAVE);
    			break;
    		case "btn_downExcel":
    			if(sheetObject1.RowCount() < 1){//no data
              		 ComShowCodeMessage("COM132501");
   	       		}else{
   	       			sheetObject1.Down2Excel({ HiddenColumn:1,Merge:1});
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
    function loadPage() {
    	for (i=0; i < sheetObjects.length; i++) {
    		ComConfigSheet(sheetObjects[i]);
    		initSheet(sheetObjects[i], i + 1);
    		ComEndConfigSheet(sheetObjects[i]);
    	}
        for(var k=0;k<comboObjects.length;k++){
            initCombo(comboObjects[k],k+1);
        }
        initControl();
    }
    function initControl() {
        var formObject=document.form;           
        
        var tmpYm = ComGetDateAdd(ComGetNowInfo("ym","-")+"-02","M", -1);
        formObject.exe_yrmon.value=JooGetDateFormat(tmpYm,"ym");
    }
    
     function exe_yrmon_keypress(){
       	ComKeyOnlyNumber(this, '');
     }
     function initSheet(sheetObj,sheetNo) {
         var cnt=0;
         switch(sheetNo) {
             case 1:      //t1sheet1 init
                 with (sheetObj) {               
	                 var HeadTitle="|Item|Type|Count|Estimated Amount|Actual Amount|Accrual Amount";
	                 SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
	                 var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	                 var headers = [ { Text:HeadTitle, Align:"Center"} ];
	                 InitHeaders(headers, info);
	                 var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"ibflag" },
					{Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"item",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false },
					{Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"estm_vvd_tp_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false },
					{Type:"AutoSum",   Hidden:0, Width:150,  Align:"Right",   ColMerge:1,   SaveName:prefix+"estm_vvd_tp_cd_cnt", KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:false },
					{Type:"AutoSum",   Hidden:0, Width:220,  Align:"Right",   ColMerge:1,   SaveName:prefix+"estm_amt",           KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0,   EditLen:false },
					{Type:"AutoSum",   Hidden:0, Width:220,  Align:"Right",   ColMerge:1,   SaveName:prefix+"act_amt",            KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0,   EditLen:false },
					{Type:"AutoSum",   Hidden:0, Width:220,  Align:"Right",   ColMerge:1,   SaveName:prefix+"accl_amt",           KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0,   EditLen:false } ];
	                  
	                 InitColumns(cols);
	                 SetEditable(1);
//	                 SetSheetHeight(510);
	                 resizeSheet();
                }
                 break;
         }
     }
    // handling sheet process
    function doActionIBSheet(sheetObj, formObj, sAction) {
    	sheetObj.ShowDebugMsg(false);
    	switch (sAction) { 
    	case IBSEARCH: //retrieve
    		if (validateForm(sheetObj, formObj, sAction)){
    			formObj.f_cmd.value=SEARCH;
    	        var aryPrefix=new Array("sheet1_");	//prefix characters array
    			//formObj.exe_yrmon.value = ComReplaceStr(formObj.exe_yrmon,"-","");
     			var sXml=sheetObj.GetSearchData("FNS_JOO_0033GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix));
    			var arrXml=sXml.split("|$$|");
    			sheetObj.LoadSearchData(arrXml[0],{Sync:1} );
    			sheet1_OnSearchEnd(sheetObj, "");
    		}
    		break; 
    	}
    }
    /**
     * setting Combo basic info 
     * param : comboObj, comboNo
     * initializing sheet 
     */ 
    function initCombo(comboObj, comboNo) {
        var formObject=document.form
        switch(comboNo) {  
        	case 1: 
               with (comboObj) { 
    				SetMultiSelect(0);
    				SetUseAutoComplete(1);
					SetColAlign(0, "left");
					SetColAlign(1, "left");
					SetColWidth(0, "0");
					SetColWidth(1, "30");
     				SetDropHeight(160);
     		    }
                var comboItems=gCrrCombo.split("|");
                addComboItem(comboObj, comboItems);           	
     			break; 
        	case 2: 
                with (comboObj) { 
     				SetMultiSelect(0);
     				SetUseAutoComplete(1);
					SetColAlign(0, "left");
					SetColAlign(1, "left");
					SetColWidth(0, "0");
					SetColWidth(1, "30");
      				SetDropHeight(160);
      		    }
      			break;
        	case 3: 
                with (comboObj) { 
     				SetMultiSelect(0);
     				SetUseAutoComplete(1);
					SetColAlign(0, "left");
					SetColAlign(1, "left");
					SetColWidth(0, "0");
					SetColWidth(1, "30");
      				SetDropHeight(160);
      		    }
      			break;
     	} 
    }
    // retrieving Lane SVC Type
    function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
           case IBSEARCH: //TRADE
    	        break;
        }
    }
    //in case of changing R/E
    function estm_clz_yr_OnChange(idx_cd, text){
    	if (gNew) return;
    	sheetObjects[0].RemoveAll();
    }
    /**
     * handling process for input validation
     */
    function validateForm(sheetObj, formObj, sAction) {
    	sheetObj.ShowDebugMsg(false);
    	switch (sAction) {
    		case IBCREATE: //retrieving for saving
    		case IBSEARCH: //retrieve
    			break;
    	}
    	return true;
    }
    function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
    	//UI 성능 개선(201408 민정호)    	
    	sheetObj.SetSumText(0,prefix+"item","TOTAL");     
    }
 	function sheet1_OnSaveEnd(sheetObj,ErrMsg) {
 		doActionIBSheet(sheetObject1, formObject, IBSEARCH);
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
    	gCurRow=Row;
    }

    function resizeSheet(){
        ComResizeSheet(sheetObjects[0]);
    }
    