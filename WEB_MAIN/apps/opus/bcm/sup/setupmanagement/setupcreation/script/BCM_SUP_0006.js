/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_SUP_0006.js
*@FileTitle  : EDI YARD
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
 * @class EDI YARD : business script for EDI YARD 
 */
    function BCM_SUP_0006() {
		this.processButtonClick=processButtonClick;
		this.setSheetObject=setSheetObject;
		this.loadPage=loadPage;
		this.initSheet=initSheet;
		this.initControl=initControl;
		this.doActionIBSheet=doActionIBSheet;
		this.setTabObject=setTabObject;
		this.rowRemove=rowRemove;
		this.engnum_keypress=engnum_keypress;
		this.sheet1_OnChange=sheet1_OnChange;
		this.validateForm=validateForm;
	}
    // The common variables
    var tabObjects=new Array();
    var tabCnt=0;
    var beforetab=1;
    var sheetObjects=new Array();
    var sheetCnt=0;
    // Event handler processing by button click event */
    document.onclick=processButtonClick;
    // Event handler processing by button name */
    function processButtonClick(){
    	var sheetObject=sheetObjects[0];
        var formObject=document.form;
    	try {
    		var srcName = ComGetEvent("name");
            switch(srcName) {
                case "btn_retrieve":
                	doActionIBSheet(sheetObject,formObject,IBSEARCH);
                    break;
				case "btn_new":
					ComResetAll();
					formObject.s_yd_cd.value="";
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
	              var HeadTitle="|Seq|Del|Yard Code|Yard Type|Port Cd|Receiver ID|Service Lane1|Service Lane2|Service Lane3|Service Lane4|Service Lane5|Service Lane6|Service Lane7|Service Lane8|Service Lane9|Service Lane10|BKG Auto EDI Flag|Release EDI Flag|Sender ID|Full Release EDI Flag|BKG Manual EDI Flag|Pre T/S Flag|Post T/S Flag|Post T/S Ack Flag";
	              SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
	              var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	              var headers = [ { Text:HeadTitle, Align:"Center"} ];
	              InitHeaders(headers, info);
	              var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
	                     {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"Seq" },
	                     {Type:"DummyCheck", Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
	                     {Type:"Text",      Hidden:0,  Width:85,   Align:"Center",  ColMerge:0,   SaveName:"yd_cd",             KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:7,  InputCaseSensitive: 1, AcceptKeys: "N|E" },
	                     {Type:"Combo",     Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"bkg_yd_tp_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                     {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"port_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:5, AcceptKeys:"E|N", InputCaseSensitive:1 },
	                     {Type:"Text",      Hidden:0,  Width:140,  Align:"Left",    ColMerge:0,   SaveName:"edi_rcv_id",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20 },
	                     {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"slan_cd1",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3, AcceptKeys:"E|N", InputCaseSensitive:1 },
	                     {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"slan_cd2",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3, AcceptKeys:"E|N", InputCaseSensitive:1 },
	                     {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"slan_cd3",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3, AcceptKeys:"E|N", InputCaseSensitive:1 },
	                     {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"slan_cd4",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3, AcceptKeys:"E|N", InputCaseSensitive:1 },
	                     {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"slan_cd5",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3, AcceptKeys:"E|N", InputCaseSensitive:1 },
	                     {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"slan_cd6",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3, AcceptKeys:"E|N", InputCaseSensitive:1 },
	                     {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"slan_cd7",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3, AcceptKeys:"E|N", InputCaseSensitive:1 },
	                     {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"slan_cd8",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3, AcceptKeys:"E|N", InputCaseSensitive:1 },
	                     {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"slan_cd9",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3, AcceptKeys:"E|N", InputCaseSensitive:1 },
	                     {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"slan_cd10",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3, AcceptKeys:"E|N", InputCaseSensitive:1 },
	                     {Type:"Combo",     Hidden:0, Width:140,  Align:"Center",  ColMerge:0,   SaveName:"bkg_auto_edi_flg",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                     {Type:"Combo",     Hidden:0, Width:140,  Align:"Center",  ColMerge:0,   SaveName:"mty_rlse_edi_flg",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                     {Type:"Text",      Hidden:0,  Width:140,  Align:"Left",    ColMerge:0,   SaveName:"edi_snd_id",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                     {Type:"Combo",     Hidden:0, Width:160,  Align:"Center",  ColMerge:0,   SaveName:"full_rlse_edi_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                     {Type:"Combo",     Hidden:0, Width:160,  Align:"Center",  ColMerge:0,   SaveName:"bkg_mnl_edi_flg",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                     {Type:"Combo",     Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"pre_ts_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                     {Type:"Combo",     Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"pst_ts_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                     {Type:"Combo",     Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"pst_ts_ack_flg",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
	              InitColumns(cols);
	              SetEditable(1);
	              SetColProperty("bkg_yd_tp_cd", {ComboText:"|OffDock|OnDock", ComboCode:"|F|N"} );
	              SetColProperty("bkg_auto_edi_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
	              SetColProperty("mty_rlse_edi_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
	              SetColProperty("full_rlse_edi_cd", {ComboText:"|FO|FOC", ComboCode:"|1|2"} );
	              SetColProperty("bkg_mnl_edi_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
	              SetColProperty("pre_ts_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
	              SetColProperty("pst_ts_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
	              SetColProperty("pst_ts_ack_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
	              SetSheetHeight(380);
              }
           break;
        }
    }
    /**
     * Handling the process about the sheet <br>
     * param : sheetObj, formObj, sAction, Col, Row
     **/
    function doActionIBSheet(sheetObj,formObj,sAction,Col,Row) {
    	sheetObj.ShowDebugMsg(false);
        switch(sAction) {
        	case IBSEARCH:      //retrieving
   	   	  		formObj.f_cmd.value=SEARCH;
   	   	  		var sXml=sheetObj.GetSearchData("BCM_SUP_0006GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(""));
   	   	  		var arrXml=sXml.split("|$$|");
		   		if (arrXml.length > 0) sheetObjects[0].LoadSearchData(arrXml[0],{Sync:0} );
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
				var sXml=sheetObj.GetSaveData("BCM_SUP_0006GS.do", sParam);
			    var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
			    var arrXml=sXml.split("|$$|");
			    if (arrXml.length > 0) {
			    	if (result == 'S') {
			    		sheetObjects[0].LoadSearchData(arrXml[0],{Sync:0} );
			    		// sheetObjects[0].LoadSaveData(arrXml[0]);
			    	}
			    }
                break;
                
        	case IBROWSEARCH:   
	    		if(sheetObj.ColSaveName(Col).substring(0,7) == "slan_cd") {
					var param='f_cmd='+SEARCH04;
					param += "&slan_cd="+sheetObj.GetCellValue(Row, Col);	//in case of calling from the grid
					var sXml=sheetObj.GetSearchData("SUPCommonGS.do" , param);
		   			var slanCd=ComGetEtcData(sXml, "slanCd");
		   			if(typeof slanCd == "undefined" || slanCd == "" ) {
						ComShowCodeMessage("SUP00014");
						sheetObj.SetCellValue(Row, Col,"",0);
						sheetObj.SelectCell(Row, Col);
					}
	    		} else if(sheetObj.ColSaveName(Col) == "port_cd") {
	    			var param='f_cmd='+SEARCH05;
	    			param += "&port_cd="+sheetObj.GetCellValue(Row, Col);	//in case of calling from the grid
					var sXml=sheetObj.GetSearchData("SUPCommonGS.do" , param);
		   			var portCd=ComGetEtcData(sXml, "portCd");
		   			if(typeof portCd == "undefined" || portCd == "" ) {
						ComShowCodeMessage("SUP00017");
						sheetObj.SetCellValue(Row, Col,"",0);
						sheetObj.SelectCell(Row, Col);
					}
	    		}
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
    	// axon_event.addListener  ('keypress', 'engnum_keypress' , 's_yd_cd');
    	axon_event.addListener('keydown', 'ComKeyEnter', 'form');
    }
    /**
     * Converting the uppercase from the inputted alphabet and allowed to input number and alphabet only
     **/
//    function engnum_keypress() {
//        ComKeyOnlyAlphabet('uppernum');
//    }
    /**
     * Calling this function in case of changing the cell value in sheet
     * param : sheetObj, Row, Col, Value
     **/
    function sheet1_OnChange(sheetObj, Row, Col, Value) {
        if(sheetObj.ColSaveName(Col).substring(0,7) == "slan_cd") {
        	var slanCd=sheetObj.GetCellValue(Row, Col);
        	if(slanCd != "") {
	        	if(slanCd.length == 3 && slanCd != "ALL") {
	        		doActionIBSheet(sheetObj, document.form, IBROWSEARCH, Col, Row);
	        	} else {
	        		if(slanCd == "ALL") {
	            		return false;
	            	}
	        		ComShowCodeMessage("SUP00008", "3", "Service Lane");
					sheetObj.SetCellValue(Row, Col,"");
					sheetObj.SelectCell(Row, Col);
					return false;
	        	}
        	}
        } else if(sheetObj.ColSaveName(Col) == "port_cd") {
        	var portCd=sheetObj.GetCellValue(Row, Col);
        	if(portCd != "") {
	        	if(portCd.length == 5) {
	        		doActionIBSheet(sheetObj, document.form, IBROWSEARCH, Col, Row);
	        	} else {
	        		ComShowCodeMessage("SUP00008", "5", "Port Code");
					sheetObj.SetCellValue(Row, Col,"");
					sheetObj.SelectCell(Row, Col);
					return false;
	        	}
        	}
        }
    }
    /**
     * handling process for input validation <br>
     * param : sheetObj, formObj, sAction
     **/
    function validateForm(sheetObj,formObj,sAction) {
        for (var ir=1; ir<=sheetObj.LastRow(); ir++){
        	if(sheetObj.GetRowStatus(ir) == "D")
        		continue;
        	if(sheetObj.GetCellValue(ir,"yd_cd") == "") {
				ComShowCodeMessage("SUP00001", "Yard Code");
				sheetObj.SelectCell(ir,"yd_cd");
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
     		sheetObj.SetCellEditable(ir, "yd_cd",0);
     	}
 	}
