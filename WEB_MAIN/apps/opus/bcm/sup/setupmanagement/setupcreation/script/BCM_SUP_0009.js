/*
=========================================================
*Copyright(c) 2016 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_SUP_0009.js
*@FileTitle  : CUSTOMER SCHEDULE EDI SETUP
*@author     : CLT
*@version    : 1.0
*@since      : 2016/02/24
=========================================================
*/

/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
					MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
					OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class CUSTOMER SCHEDULE EDI SETUP : business script for CUSTOMER SCHEDULE EDI SETUP 
 */
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
        /*******************************************************/
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
        sheetObjects[0].SetExtendLastCol(0);
        for(k=0;k<tabObjects.length;k++){
            initTab(tabObjects[k],k+1);
        }
        initControl();
    }
    
    /**
     * Loading the event of HTML control in the page dynamically. <br>
     **/
    function initControl() {
    	axon_event.addListener('keydown', 'ComKeyEnter', 'form');
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
	              var HeadTitle="|Seq|Del|Origin Status|Pre Sent Status|Event Status|I/B Rail Chk|Remark1|Remark2";
	              SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
	              var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	              var headers = [ { Text:HeadTitle, Align:"Center"} ];
	              InitHeaders(headers, info);
	              var cols = [ 
	 	                     {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
	 	                     {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"Seq" },
	 	                     {Type:"DummyCheck",Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
		                     {Type:"Text",      Hidden:0, Width:110,  Align:"Center",  ColMerge:0,   SaveName:"edi_org_sts_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:10, AcceptKeys:"N|E", InputCaseSensitive:1 },
		                     {Type:"Text",      Hidden:0, Width:110,  Align:"Center",  ColMerge:0,   SaveName:"edi_pre_snt_sts_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:10, AcceptKeys:"E|N", InputCaseSensitive:1 },
		                     {Type:"Text",      Hidden:0, Width:110,  Align:"Center",  ColMerge:0,   SaveName:"edi_evnt_sts_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:10, AcceptKeys:"E|N", InputCaseSensitive:1 },
		                     //{Type:"Combo",     Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"edi_msg_nm",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,               AcceptKeys:"E|N", InputCaseSensitive:1 },
		                     //{Type:"Combo",     Hidden:0, Width:120,  Align:"Left",    ColMerge:0,   SaveName:"edi_svc_tp_nm",     KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20, InputCaseSensitive:1, AcceptKeys:"N|E" },
		                     {Type:"Combo",     Hidden:0, Width:110,  Align:"Center",  ColMerge:0,   SaveName:"cop_ib_rail_chk_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1,  AcceptKeys:"E",   InputCaseSensitive:1 },
		                     {Type:"Text",      Hidden:0, Width:300,  Align:"Left",    ColMerge:0,   SaveName:"edi_rmk1",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:4000 },
		                     {Type:"Text",      Hidden:0, Width:300,  Align:"Left",    ColMerge:0,   SaveName:"edi_rmk2",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:4000 }
	                            ];
	              InitColumns(cols);
	              SetEditable(1);
//	              SetColProperty("edi_msg_nm", {ComboText:"IFTSAI|323", ComboCode:"IFTSAI|323"} );
//	              SetColProperty("edi_svc_tp_nm", {ComboText:"PORT|LANE1|LANE2", ComboCode:"PORT|LANE1|LANE2"} );
//	              SetColProperty("pre_dmy_skd_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
//	              SetColProperty("pst_dmy_skd_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
//	              SetColProperty(0 ,"wrk_rsrc_nm" , {AcceptKeys:"E|N|[._!@#$%^&*()']" , InputCaseSensitive:1});		
//	              SetColProperty("use_flg", {ComboText:"Y|N", ComboCode:"Y|N"} );
	              SetColProperty("cop_ib_rail_chk_cd", {ComboText:"I|X", ComboCode:"I|X"} );
	              SetSheetHeight(380);
			      resizeSheet();
              }
           break;
            case 2:      //sheet2 init
                with(sheetObj){
	              var HeadTitle="|Seq|Del|Edi Status||Group Code";
	              SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
	              var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	              var headers = [ { Text:HeadTitle, Align:"Center"} ];
	              InitHeaders(headers, info);
	              var cols = [ 
	                     {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
	                     {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"Seq" },
	                     {Type:"DummyCheck",Hidden:1, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
 	                     {Type:"Text",      Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"edi_stnd_sts_cd", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:10, AcceptKeys:"N|E", InputCaseSensitive:1 },
 	                     {Type:"Text",      Hidden:1, Width:130,  Align:"Center",  ColMerge:0,   SaveName:"edi_grp_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:10, AcceptKeys:"E|N", InputCaseSensitive:1 }
                             ];
	              InitColumns(cols);
	              SetEditable(1);
	              SetVisible(false);
              }
           break;
        }
    }
    
    /**
     * Handling the process about the sheet <br>
     * param : sheetObj ,formObj, sAction, Col, Row
     **/
    function doActionIBSheet(sheetObj,formObj,sAction,Col,Row) {
    	sheetObj.ShowDebugMsg(false);
        switch(sAction) {
        	case IBSEARCH:      //retrieving
   	   	  		formObj.f_cmd.value=SEARCH;
   	   	  		var sXml=sheetObj.GetSearchData("BCM_SUP_0009GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(""));
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
				var sXml=sheetObj.GetSaveData("BCM_SUP_0009GS.do", sParam);
			    var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
			    var arrXml=sXml.split("|$$|");
			    if (arrXml.length > 0) {
			    	if (result == 'S') {
			    		sheetObjects[0].LoadSearchData(arrXml[0],{Sync:0} );
			    	} else {
			    		sheetObjects[0].LoadSaveData(arrXml[0]);
			    	}
			    }
                break;
                
        	case IBSEARCH_ASYNC01:      // check status code
        		sheetObj.RemoveAll(); // sheet2 remove data
				var param='f_cmd=' + SEARCH01;
				var company_cd = document.form.company_cd.value;
				param += "&edi_stnd_sts_cd=" + sheetObjects[0].GetCellValue(Row, Col) + "&co_div_cd=" + company_cd;
   	   	  		var sXml=sheetObj.GetSearchData("BCM_SUP_0009GS.do", param);
				var stndStsCd = ComGetEtcData(sXml, "stndStsCd");
				if (typeof stndStsCd == "undefined" || stndStsCd == "") {
					sheetObjects[0].SetCellValue(Row, Col, "");
					sheetObjects[0].SelectCell(Row, Col);
				}
   	   	  		var arrXml=sXml.split("|$$|");
		   		if (arrXml.length > 0) sheetObj.LoadSearchData(arrXml[0],{Sync:0} );
		   		sheetObj.SetVisible(false);
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
     * handling process for input validation <br>
     * param : sheetObj, formObj, sAction
     **/
    function validateForm(sheetObj,formObj,sAction) {
        for (var ir=1; ir<=sheetObj.LastRow(); ir++){
        	if(sheetObj.GetRowStatus(ir) == "D")
        		continue;
        	if(sheetObj.GetCellValue(ir,"edi_org_sts_cd") == "") {
				ComShowCodeMessage("SUP00001", "Original EDI Status Code");
				sheetObj.SelectCell(ir,"edi_org_sts_cd");
				return false;
        	} else if(sheetObj.GetCellValue(ir,"edi_pre_snt_sts_cd") == "") {
				ComShowCodeMessage("SUP00001", "EDI Pre Sent Status Code");
				sheetObj.SelectCell(ir,"edi_pre_snt_sts_cd");
				return false;
        	} else if(sheetObj.GetCellValue(ir,"edi_evnt_sts_cd") == "") {
				ComShowCodeMessage("SUP00001", "EDI Event Status Code");
				sheetObj.SelectCell(ir,"edi_evnt_sts_cd");
				return false;
        	}
        }
         return true;
     }

    /**
	 * Calling this function in case of changing the cell value in sheet param :
	 * sheetObj, Row, Col, Value
	 */
	function sheet1_OnChange(sheetObj, Row, Col, Value) {
		if(Value.trim().length < 1) {
			return;
		}
		if (sheetObj.ColSaveName(Col) == "edi_org_sts_cd" || sheetObj.ColSaveName(Col) == "edi_pre_snt_sts_cd" || sheetObj.ColSaveName(Col) == "edi_evnt_sts_cd") {
			doActionIBSheet(sheetObjects[1], document.form, IBSEARCH_ASYNC01, sheetObj.ColSaveName(Col), Row);
		}
	}
