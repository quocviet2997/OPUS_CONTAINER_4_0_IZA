/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_SUP_0004.js
*@FileTitle  : EDI CARGO STANDARD STATUS 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/21
=========================================================
*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
					MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
					OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class EDI CROUP : business script for EDI CROUP
 */
    function BCM_SUP_0004() {
		this.processButtonClick=processButtonClick;
		this.setSheetObject=setSheetObject;
		this.loadPage=loadPage;
		this.initSheet=initSheet;
		this.initControl=initControl;
		this.doActionIBSheet=doActionIBSheet;
		this.setTabObject=setTabObject;
		this.rowRemove=rowRemove;
		this.obj_deactivate=obj_deactivate;
		this.engnum_keypress=engnum_keypress;
		this.eng_keypress=eng_keypress;
		this.sheet1_OnSearchEnd=sheet1_OnSearchEnd;
	}
    // The common variables
    var tabObjects=new Array();
    var tabCnt=0;
    var beforetab=1;
    var sheetObjects=new Array();
    var sheetCnt=0;
    var vslCombo="";
    var vvdCombo="";
    // Event handler processing by button click event */
    document.onclick=processButtonClick;
    // Event handler processing by button name */
    function processButtonClick(){
    	var sheetObject= sheetObjects[0];
        var formObject=document.form;
    	try {
    		var srcName=ComGetEvent("name");
            switch(srcName) {
                case "btn_retrieve":
                	doActionIBSheet(sheetObject,formObject,IBSEARCH);
                    break;
				case "btn_new":
					ComResetAll();
                    break;
				case "btn_save":
					doActionIBSheet(sheetObject,formObject,IBSAVE);
                    break;
				case "btn_add":
					var row=sheetObject.DataInsert(-1);
                    break;
				case "btn_del":
					rowRemove(sheetObject);
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
     * registering IBCombo Object as list
     * adding process for list in case of needing batch processing with other items 
     * defining list on the top of source
     */
    function setSheetObject(sheet_obj){
       sheetObjects[sheetCnt++]=sheet_obj;
    }
    /**
     * initializing sheet
     * implementing onLoad event handler in body tag
     * adding first-served functions after loading screen.
     */
    function loadPage() {
        for(i=0;i<sheetObjects.length;i++){
        	ComConfigSheet (sheetObjects[i]);
            initSheet(sheetObjects[i],i+1);
            ComEndConfigSheet(sheetObjects[i]);
        }
        for(k=0;k<tabObjects.length;k++){
            initTab(tabObjects[k],k+1);
        }
        initControl();   
    }
    /**
     * setting sheet initial values and header
     * param : sheetObj, sheetNo
     * adding case as numbers of counting sheets
     */
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
        switch(sheetNo) {
            case 1:      //sheet1 init
                with(sheetObj){
	              var HeadTitle="|Seq|Del|Standard Status|Company Div.|Status Seq.|Status Desc.|Replan Batch Send Flag";
	              SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
	              var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	              var headers = [ { Text:HeadTitle, Align:"Center"} ];
	              InitHeaders(headers, info);
	              var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
		                     {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"Seq" },
		                     {Type:"DummyCheck", Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
		                     {Type:"Text",      Hidden:0,  Width:150,  Align:"Left",    ColMerge:0,   SaveName:"edi_stnd_sts_cd",   KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:10 },
		                     {Type:"Text",      Hidden:0,  Width:130,  Align:"Center",  ColMerge:0,   SaveName:"co_div_cd",         KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:10 },
		                     {Type:"Int",       Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"edi_sts_seq",       KeyField:1,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3 },
		                     {Type:"Text",      Hidden:0,  Width:342,  Align:"Left",    ColMerge:0,   SaveName:"edi_sts_desc",      KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:100 },
		                     {Type:"Combo",     Hidden:0, Width:165,  Align:"Center",  ColMerge:0,   SaveName:"rpln_bat_snd_flg",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
          		InitColumns(cols);
          		SetEditable(1);
                SetColProperty("rpln_bat_snd_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
                SetColProperty(0, "edi_stnd_sts_cd" , {AcceptKeys:"N|E|", InputCaseSensitive: 1});
                SetColProperty(0, "co_div_cd" , {AcceptKeys:"N|E|", InputCaseSensitive: 1});
                SetSheetHeight(380);
              	}
            break;
        }
    }
    /**
     * Handling the process about the sheet <br>
     * param : sheetObj, formObj, sAction, gubun, row
     **/
    function doActionIBSheet(sheetObj,formObj,sAction,gubun,row) {
    	sheetObj.ShowDebugMsg(false);
        switch(sAction) {
        	case IBSEARCH:      //retrieving
   	   	  		formObj.f_cmd.value=SEARCH;
   	   	  		var sXml=sheetObj.GetSearchData("BCM_SUP_0004GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(""));
   	   	  		var arrXml=sXml.split("|$$|");
		   		if (arrXml.length > 0) sheetObjects[0].LoadSearchData(arrXml[0],{Sync:1} );
       	   	  	break;
       	   	  	
        	case IBSAVE:        //saving
        		if(!validateForm(sheetObj,formObj,sAction)) return;
    			formObj.f_cmd.value=MULTI;
	        	var arrSheets=new Array(sheetObjects[0]);
	        	var sParam=ComGetSaveString(arrSheets);
				if (sheetObj.RowCount()== 0 || (!sheetObj.IsDataModified()&& sParam == "")) {
					ComShowCodeMessage("SUP00002");
					return; 
				}
				var aryPrefix=new Array("");
				sParam += "&" + FormQueryString(formObj)+"&" + ComGetPrefixParam(aryPrefix);
				var sXml=sheetObj.GetSaveData("BCM_SUP_0004GS.do", sParam);
			    var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
			    var arrXml=sXml.split("|$$|");
			    if (arrXml.length > 0) {
			    	if (result == 'S') {
			    		sheetObjects[0].LoadSearchData(arrXml[0],{Sync:1} );
			    	} else {
			    		sheetObjects[0].LoadSaveData(arrXml[0]);
			    	}
			    }
			    // fix  Auto clear data in Grid 
				   doActionIBSheet(sheetObj,formObj,IBSEARCH);
                break;
        }
    }
	/**
     * Removing IBSheet Row <br>
     * @param {ibsheet} sheetObj    IBSheet Object
     **/
	function rowRemove(sheetObj) {
		ComRowHideDelete(sheetObj, "DelChk");
	}
	/**
     * Loading the event of HTML control in the page dynamically. <br>
     **/
    function initControl() {
    	// calling eng_keypress() in case of occurring keypress event at s_stnd_sts_cd field
    	// axon_event.addListener  ('keypress', 'eng_keypress' , 's_stnd_sts_cd');
    	// calling eng_keypress() in case of occurring keypress event at s_co_div_cd field
        // axon_event.addListener  ('keypress', 'eng_keypress' , 's_co_div_cd');
    	axon_event.addListener('keydown', 'ComKeyEnter', 'form');
    }
    /**
     * Checking the validation in case of occuring blur event in HTML control <br>
     **/
    function obj_deactivate(){
    	//if (event.srcElement.getAttribute("required") != null) return;
    	switch(event.srcElement.name){
	    	case "bnk_yrmon":
	    		ComChkObjValid(event.srcElement);
    			break;
    		default:
    			ComChkObjValid(event.srcElement);
    	}
    }
    /**
     * Converting the uppercase from the inputted alphabet and allowed to input alphabet only
     **/
//    function eng_keypress() {
//        ComKeyOnlyAlphabet('upper');
//    }
     /**
      * Converting the uppercase from the inputted alphabet and allowed to input number and alphabet only
      **/
//     function engnum_keypress() {
//         ComKeyOnlyAlphabet('uppernum');
//     }
    /**
     * handling process for input validation <br>
     * param : sheetObj, formObj, sAction
     **/
    function validateForm(sheetObj,formObj,sAction) {
        for (var ir=1; ir<=sheetObj.LastRow(); ir++){
        	if(sheetObj.GetRowStatus(ir) == "D")
        		continue;
        	if(sheetObj.GetCellValue(ir,"edi_stnd_sts_cd") == "") {
				ComShowCodeMessage("SUP00001", "Standard Status");
				sheetObj.SelectCell(ir,"edi_stnd_sts_cd");
				return false;
        	} else if(sheetObj.GetCellValue(ir,"co_div_cd") == "") {
				ComShowCodeMessage("SUP00001", "Company Div.");
				sheetObj.SelectCell(ir,"co_div_cd");
				return false;
        	} else if(sheetObj.GetCellValue(ir,"edi_sts_seq") == "") {
				ComShowCodeMessage("SUP00001", "Status Seq.");
				sheetObj.SelectCell(ir,"edi_sts_seq");
				return false;
        	} else if(sheetObj.GetCellValue(ir,"edi_sts_desc") == "") {
				ComShowCodeMessage("SUP00001", "Status Desc.");
				sheetObj.SelectCell(ir,"edi_sts_desc");
				return false;
			}
		}
         return true;
     }
    /**
     * Calling this function after finishing to retrieve sheet1
     * param : sheetObj, ErrMsg
     **/
 	function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
 		for (var ir=1; ir<=sheetObj.LastRow(); ir++){
     		sheetObj.SetCellEditable(ir, "edi_stnd_sts_cd",0);
     		sheetObj.SetCellEditable(ir, "co_div_cd",0);
     	}
 	}
