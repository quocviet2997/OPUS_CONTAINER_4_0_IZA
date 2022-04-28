/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_SUP_0007.js
*@FileTitle  : CUSTOMER SCHEDULE EDI SETUP
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
        // axon_event.addListener("keypress", "checkKeyPressValue", "s_edi_stup_id");
        // axon_event.addListener("keypress", "checkKeyPressValue", "s_edi_svc_tp_nm");
    }
    /**
     * Loading the event of HTML control in the page dynamically. <br>
     **/
    function initControl() {
    	axon_event.addListener('keydown', 'ComKeyEnter', 'form');
    }
    
//    function checkKeyPressValue() {
//    	ComKeyOnlyAlphabet("uppernum", "46|95");
//    }
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
	              var HeadTitle="|Seq|Del|EDI Setup ID|EDI Receiver ID|EDI Sender ID|Message Name|Service Type|Queue Name|Send From Days|Send To Days|Pre Dummy Flag|Post Dummy Flag|Use Flag";
	              SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
	              var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	              var headers = [ { Text:HeadTitle, Align:"Center"} ];
	              InitHeaders(headers, info);
	              var cols = [ 
	                     {Type:"Status",     Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
	                     {Type:"Text",       Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"Seq" },
	                     {Type:"DummyCheck", Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
	                     {Type:"Text",       Hidden:0, Width:110,  Align:"Center",  ColMerge:0,   SaveName:"edi_stup_id",       KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20, InputCaseSensitive: 1, AcceptKeys: "N|E"  },
	                     {Type:"Text",       Hidden:0, Width:130,  Align:"Left",    ColMerge:0,   SaveName:"cust_trd_prnr_id",  KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20, AcceptKeys:"E|N", InputCaseSensitive:1 },
	                     {Type:"Text",       Hidden:0, Width:130,  Align:"Left",    ColMerge:0,   SaveName:"edi_sndr_id",       KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20, AcceptKeys:"E|N", InputCaseSensitive:1 },
	                     {Type:"Combo",      Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"edi_msg_nm",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   AcceptKeys:"E|N", InputCaseSensitive:1 },
	                     {Type:"Combo",      Hidden:0, Width:120,  Align:"Left",    ColMerge:0,   SaveName:"edi_svc_tp_nm",     KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20, InputCaseSensitive: 1, AcceptKeys: "N|E"  },
	                     {Type:"Text",       Hidden:0, Width:320,  Align:"Left",    ColMerge:0,   SaveName:"wrk_rsrc_nm",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
	                     {Type:"Text",       Hidden:0, Width:130,  Align:"Right",   ColMerge:0,   SaveName:"snd_fm_dys",        KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3, AcceptKeys:"[-]|N", InputCaseSensitive:1 },
	                     {Type:"Text",       Hidden:0, Width:130,  Align:"Right",   ColMerge:0,   SaveName:"snd_to_dys",        KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3, AcceptKeys:"N", InputCaseSensitive:1 },
	                     {Type:"Combo",      Hidden:0, Width:140,  Align:"Center",  ColMerge:0,   SaveName:"pre_dmy_skd_flg",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                     {Type:"Combo",      Hidden:0, Width:140,  Align:"Center",  ColMerge:0,   SaveName:"pst_dmy_skd_flg",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                     {Type:"Combo",      Hidden:0, Width:85,   Align:"Center",  ColMerge:0,   SaveName:"use_flg",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
	              InitColumns(cols);
	              SetEditable(1);
//	              SetColProperty("edi_msg_nm", {ComboText:"CUSREP|COPRAR|TDC315|IFTSAI|301|323|RELORD|MUKE", ComboCode:"CUSREP|COPRAR|TDC315|IFTSAI|301|323|RELORD|MUKE"} );
	              SetColProperty("edi_msg_nm", {ComboText:"323|IFTSAI", ComboCode:"323|IFTSAI"} );
	              SetColProperty("edi_svc_tp_nm", {ComboText:"PORT|LANE1|LANE2", ComboCode:"PORT|LANE1|LANE2"} );
	              SetColProperty("pre_dmy_skd_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
	              SetColProperty("pst_dmy_skd_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
	              SetColProperty(0 ,"wrk_rsrc_nm" , {AcceptKeys:"E|N|[._!@#$%^&*()']" , InputCaseSensitive:1});		
	              SetColProperty("use_flg", {ComboText:"Y|N", ComboCode:"Y|N"} );
	              SetSheetHeight(380);
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
   	   	  		var sXml=sheetObj.GetSearchData("BCM_SUP_0007GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(""));
   	   	  		var arrXml=sXml.split("|$$|");
		   		if (arrXml.length > 0) sheetObjects[0].LoadSearchData(arrXml[0],{Sync:0} );
       	   	  	break;
       	   	  	
        	case IBSAVE:        //saving
        		if(!validateForm(sheetObj,formObj,sAction)) return;
        		if(!checkDupSetupId(sheetObj)) return;
    			formObj.f_cmd.value=MULTI;
	        	var arrSheets=new Array(sheetObjects[0]);
	        	var sParam=ComGetSaveString(arrSheets);
	        	if (sheetObj.RowCount()== 0 || (!sheetObj.IsDataModified()&& sParam == "")) {
	        		ComShowCodeMessage("SUP00002");
					return; 
				}
				var aryPrefix=new Array("");
				sParam += "&" + FormQueryString(formObj)+"&" + ComGetPrefixParam(aryPrefix);
				var sXml=sheetObj.GetSaveData("BCM_SUP_0007GS.do", sParam);
			    var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
			    var arrXml=sXml.split("|$$|");
			    if (arrXml.length > 0) {
			    	if (result == 'S') {
			    		sheetObjects[0].LoadSearchData(arrXml[0],{Sync:0} );
			    	} else {
			    		sheetObjects[0].LoadSaveData(arrXml[0]);
			    	}
			    }
			    /**
			     * Dung.Nguyen: Add Search method after save data.
			     */
			    /**
			     * Dung.Nguyen: Add Search method after save data.
			     */
			    formObj.f_cmd.value=SEARCH;
   	   	  		var sXml=sheetObj.GetSearchData("BCM_SUP_0007GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(""));
   	   	  		var arrXml=sXml.split("|$$|");
		   		if (arrXml.length > 0) 
		   			{
		   				sheetObjects[0].LoadSearchData(arrXml[0],{Sync:0} );
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
     * handling process for input validation <br>
     * param : sheetObj, formObj, sAction
     **/
    function validateForm(sheetObj,formObj,sAction) {
        for (var ir=1; ir<=sheetObj.LastRow(); ir++){
        	if(sheetObj.GetRowStatus(ir) == "D")
        		continue;
        	if(sheetObj.GetCellValue(ir,"edi_stup_id") == "") {
				ComShowCodeMessage("SUP00001", "EDI Setup ID");
				sheetObj.SelectCell(ir,"edi_stup_id");
				return false;
        	} else if(sheetObj.GetCellValue(ir,"cust_trd_prnr_id") == "") {
				ComShowCodeMessage("SUP00001", "EDI Receiver ID");
				sheetObj.SelectCell(ir,"cust_trd_prnr_id");
				return false;
        	} else if(sheetObj.GetCellValue(ir,"edi_sndr_id") == "") {
				ComShowCodeMessage("SUP00001", "EDI Sender ID");
				sheetObj.SelectCell(ir,"edi_sndr_id");
				return false;
        	} else if(sheetObj.GetCellValue(ir,"edi_svc_tp_nm") == "") {
				ComShowCodeMessage("SUP00001", "Service Type");
				sheetObj.SelectCell(ir,"edi_svc_tp_nm");
				return false;
        	} else if(sheetObj.GetCellValue(ir,"snd_fm_dys") == "") {
				ComShowCodeMessage("SUP00001", "Send From Days");
				sheetObj.SelectCell(ir,"snd_fm_dys");
				return false;
        	} else if(sheetObj.GetCellValue(ir,"snd_to_dys") == "") {
				ComShowCodeMessage("SUP00001", "Send To Days");
				sheetObj.SelectCell(ir,"snd_to_dys");
				return false;
        	}
        	if(parseInt(sheetObj.GetCellValue(ir,"snd_fm_dys")) > parseInt(sheetObj.GetCellValue(ir,"snd_to_dys"))) {
				ComShowCodeMessage("SUP00018");
				sheetObj.SelectCell(ir,"snd_fm_dys");
				return false;
			}

        	// check numeric
    		if (!IsNumeric(sheetObj.GetCellValue(ir,"snd_fm_dys"))) {
        		ComShowCodeMessage("COM12178");
    			sheetObj.SelectCell(ir, "snd_fm_dys", 1);
				return false;
    		} 
        }
         return true;
     }
    /**
     * Checking whether Edi Setup ID is duplicated in Customer Schedule EDI Setup or not
     * @param{ibsheet} sheetObj    IBSheet Object
     **/
    function checkDupSetupId(sheetObj) {
    	var dupRow=0;
    	dupRow=sheetObj.ColValueDup("edi_stup_id", false);
    	if(dupRow > 0) {
    		ComShowCodeMessage("SUP00016", "EDI Setup ID");
    		sheetObj.SelectCell(dupRow, "edi_stup_id");
    		return false; 
    	}
    	return true;
    }
    /**
     * Calling this function after finishing to retrieve sheet1
     * param : sheetObj, ErrMsg
     **/
    function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
 		for (var ir=1; ir<=sheetObj.LastRow(); ir++){
     		sheetObj.SetCellEditable(ir, "edi_stup_id",0);
     	}
 	}

    /**
     * 
     * @param sheetObj
     * @param row
     * @param col
     * @param value
     */
    function sheet1_OnChange(sheetObj, row, col, value) {
    	if (sheetObj.ColSaveName(col) == "snd_fm_dys" && value.length > 0) {
    		if (!IsNumeric(value)) {
    			sheetObj.SelectCell(row, col, 1);
        		ComShowCodeMessage("COM12178");
    		} 
    	} 
    }
    
    /**
     * 
     * @param input
     * @returns
     */
    function IsNumeric(input){
        var RE = /^-{0,1}\d*\.{0,1}\d+$/;
        return (RE.test(input));
    }
