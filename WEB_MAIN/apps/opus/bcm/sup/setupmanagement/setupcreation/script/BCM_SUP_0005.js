/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_SUP_0005.js
*@FileTitle  : EDI SETUP LOGISTICS
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
 * @class EDI SETUP LOGISTICS : business script for EDI SETUP LOGISTICS 
 */
    // The common variables
    var tabObjects=new Array();
    var tabCnt=0;
    var beforetab=1;
    var sheetObjects=new Array();
    var sheetCnt=0;
    var lnk_prefix="lnk_";
    var msg_prefix="msg_";	
    var lan_prefix="lan_";	
    // Event handler processing by button click event */
    document.onclick=processButtonClick;
    // Event handler processing by button name */
    function processButtonClick(){
    	var sheetObject=sheetObjects[0];
    	var sheetObject1=sheetObjects[1];
    	var sheetObject2=sheetObjects[2];
        var formObject=document.form;
    	try {
    		var srcName=ComGetEvent("name");
    		if(ComGetBtnDisable(srcName)) return false;
            switch(srcName) {
                case "btn_retrieve":
                	resetDetailAll();
                	doActionIBSheet(sheetObject,formObject,IBSEARCH);
                    break;
				case "btn_new":
					ComResetAll();
					buttonControl('D');
                    break;
				case "btn_save":
					doActionIBSheet(sheetObject,formObject,IBSAVE);
                    break;
				case "btn_add":
					var row=sheetObject.DataInsert(-1);
                    break;
				case "btn_add1":
					var row=sheetObject1.DataInsert(-1);
					if(sheetObject1.RowCount()> 1) {
						sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_tp_id",sheetObject1.GetCellValue(row-1, msg_prefix + "edi_msg_tp_id"),0);
					}
					
					//CellValue -> GetCellValue, CellValue2 -> SetCellValue, CellEditable -> SetCellEditable
					if (sheetObject1.GetCellValue(row, msg_prefix + "edi_msg_tp_id") == "TDC315") {
						sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd3", "", 1);
						sheetObject1.SetCellEditable(row, msg_prefix + "edi_msg_ind_cd3", 1);		    			
		    			sheetObject1.CellComboItem(row,msg_prefix+"edi_msg_ind_cd4", {ComboText:"|Inland Yard", ComboCode:"0|1"} );
		    			sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd4", "0", 1);
		    			sheetObject1.SetCellEditable(row, msg_prefix + "edi_msg_ind_cd4", 1);
		    		} else if (sheetObject1.GetCellValue(row, msg_prefix + "edi_msg_tp_id") == "301") {
		    			sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd3", "", 1);
		    			sheetObject1.SetCellEditable(row, msg_prefix + "edi_msg_ind_cd3", 0);
		    			sheetObject1.CellComboItem(row,msg_prefix+"edi_msg_ind_cd4", {ComboText:"|BK(A)|BK(M)|ACK|FC|MT|TS1|TS2|BATCH", ComboCode:"|1|2|3|4|5|6|7|9"} );
		    			sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd4", "", 1);
		    			sheetObject1.SetCellEditable(row, msg_prefix + "edi_msg_ind_cd4", 1);
		    		} else if (sheetObject1.GetCellValue(row, msg_prefix + "edi_msg_tp_id") == "COPRAR") {
		    			sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd3","",0);
		    			sheetObject1.SetCellEditable(row, msg_prefix + "edi_msg_ind_cd3",0);
		    			//sheetObject1.CellComboItem(row,msg_prefix+"edi_msg_ind_cd4", {ComboText:"BKGCDL(VVD)|BKGCLL/CDL(BL)", ComboCode:"8|10"} );
		    			sheetObject1.CellComboItem(row,msg_prefix+"edi_msg_ind_cd4", {ComboText:"BKGCDL(VVD)", ComboCode:"8"} );
		    			sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd4","8",0);
		    			sheetObject1.SetCellEditable(row, msg_prefix + "edi_msg_ind_cd4",0);
		    			sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd",sheetObject1.GetCellValue(row, msg_prefix + "edi_msg_ind_cd4"),0);
		    			sheetObject1.SetCellValue(row, msg_prefix + "msg_tp_desc","1",0);
		    		} else if (sheetObject1.GetCellValue(row, msg_prefix + "edi_msg_tp_id") == "COREOR") {
		    			sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd3","",0);
		    			sheetObject1.SetCellEditable(row, msg_prefix + "edi_msg_ind_cd3",0);
		    			sheetObject1.CellComboItem(row,msg_prefix+"edi_msg_ind_cd4", {ComboText:" ", ComboCode:"11"} );
		    			sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd4","11",0);
		    			sheetObject1.SetCellEditable(row, msg_prefix + "edi_msg_ind_cd4",0);
		    			sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd",sheetObject1.GetCellValue(row, msg_prefix + "edi_msg_ind_cd4"),0);
		    			sheetObject1.SetCellValue(row, msg_prefix + "msg_tp_desc","1",0);
		    		} else if (sheetObject1.GetCellValue(row, msg_prefix + "edi_msg_tp_id") == "RELRED") {
		    			sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd3","",0);
		    			sheetObject1.SetCellEditable(row, msg_prefix + "edi_msg_ind_cd3",0);
		    			sheetObject1.CellComboItem(row,msg_prefix+"edi_msg_ind_cd4", {ComboText:" ", ComboCode:"21"} );
		    			sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd4","21",0);
		    			sheetObject1.SetCellEditable(row, msg_prefix + "edi_msg_ind_cd4",0);
		    			sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd",sheetObject1.GetCellValue(row, msg_prefix + "edi_msg_ind_cd4"),0);
		    			sheetObject1.SetCellValue(row, msg_prefix + "msg_tp_desc","1",0);
		    		} else if (sheetObject1.GetCellValue(row, msg_prefix + "edi_msg_tp_id") == "RELREDCY") {
		    			sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd3","",0);
		    			sheetObject1.SetCellEditable(row, msg_prefix + "edi_msg_ind_cd3",0);
		    			sheetObject1.CellComboItem(row,msg_prefix+"edi_msg_ind_cd4", {ComboText:" ", ComboCode:"22"} );
		    			sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd4","22",0);
		    			sheetObject1.SetCellEditable(row, msg_prefix + "edi_msg_ind_cd4",0);
		    			sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd",sheetObject1.GetCellValue(row, msg_prefix + "edi_msg_ind_cd4"),0);
		    			sheetObject1.SetCellValue(row, msg_prefix + "msg_tp_desc","1",0);
		    		} else if (sheetObject1.GetCellValue(row, msg_prefix + "edi_msg_tp_id") == "VGM") {
		    			sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd3","",0);
		    			sheetObject1.SetCellEditable(row, msg_prefix + "edi_msg_ind_cd3",0);
		    			sheetObject1.CellComboItem(row,msg_prefix+"edi_msg_ind_cd4", {ComboText:"|VERMAS (A) - CY|VERMAS (A) - POL|VERMAS (A) - T/S|VERMAS (M)|301 (A) - CY|301 (A) - POL|301 (M)|COPRAR (M)", ComboCode:"|31|32|33|34|35|36|37|38"} );
		    			sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd4","",0);
		    			sheetObject1.SetCellEditable(row, msg_prefix + "edi_msg_ind_cd4",1);
		    		} else if (sheetObject1.GetCellValue(row, msg_prefix + "edi_msg_tp_id") == "404") {
		    			sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd3","",0);
		    			sheetObject1.SetCellEditable(row, msg_prefix + "edi_msg_ind_cd3",0);
		    			sheetObject1.CellComboItem(row,msg_prefix+"edi_msg_ind_cd4", {ComboText:" ", ComboCode:"23"} );
		    			sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd4","23",0);
		    			sheetObject1.SetCellEditable(row, msg_prefix + "edi_msg_ind_cd4",0);
		    			sheetObject1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd",sheetObject1.GetCellValue(row, msg_prefix + "edi_msg_ind_cd4"),0);
		    			sheetObject1.SetCellValue(row, msg_prefix + "msg_tp_desc","1",0);
		    		}
					
					sheetObject1.SetCellValue(row, msg_prefix + "trd_prnr_sub_lnk_seq",formObject.trd_prnr_sub_lnk_seq.value,0);
                    break;
				case "btn_add2":
					if(formObject.trd_prnr_sub_lnk_seq.value==null||formObject.trd_prnr_sub_lnk_seq.value==""){
						ComShowCodeMessage("SUP00020");
						return false;
					}
					var row=sheetObject2.DataInsert(-1);
					sheetObject2.SetCellValue(row, lan_prefix + "trd_prnr_sub_lnk_seq",formObject.trd_prnr_sub_lnk_seq.value,0);
                    break;
				case "btn_del":
					rowRemove(sheetObject, lnk_prefix);
					break;
				case "btn_del1":
					if(formObject.trd_prnr_sub_lnk_seq.value==null||formObject.trd_prnr_sub_lnk_seq.value==""){
						ComShowCodeMessage("SUP00020");
						return false;
					}
					rowRemove(sheetObject1, msg_prefix);
					break;
				case "btn_del2":
					if(formObject.trd_prnr_sub_lnk_seq.value==null||formObject.trd_prnr_sub_lnk_seq.value==""){
						ComShowCodeMessage("SUP00020");
						return false;
					}
					rowRemove(sheetObject2, lan_prefix);
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
//        sheetObjects[0].SetExtendLastCol(0);
        for(k=0;k<tabObjects.length;k++){
            initTab(tabObjects[k],k+1);
        }
        initControl();  
        //initializing the button
        buttonControl('D');
//        sheetObjects[0].SetExtendLastCol(0);
//        sheetObjects[1].SetExtendLastCol(0);
//        sheetObjects[2].SetExtendLastCol(0);
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
		              var HeadTitle="|Seq|Del|Sub Link Div.|Sub Link Code|Sender ID|Receiver ID|Port Code|EDI Send Flag|Sub-Link Seq.";
		              SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
		              var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		              var headers = [ { Text:HeadTitle, Align:"Center"} ];
		              InitHeaders(headers, info);
		              var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName:lnk_prefix+"ibflag" },
			                     {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:lnk_prefix+"Seq" },
			                     {Type:"DummyCheck", Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:lnk_prefix+"DelChk" },
			                     {Type:"Combo",     Hidden:0, Width:150,  Align:"Center",  ColMerge:0,   SaveName:lnk_prefix+"prnr_sub_lnk_div_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			                     {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:lnk_prefix+"prnr_sub_lnk_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:7 },
			                     {Type:"Text",      Hidden:0,  Width:150,  Align:"Left",    ColMerge:0,   SaveName:lnk_prefix+"sndr_trd_prnr_id",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20 },
			                     {Type:"Text",      Hidden:0,  Width:150,  Align:"Left",    ColMerge:0,   SaveName:lnk_prefix+"rcvr_trd_prnr_id",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20 },
			                     {Type:"Text",      Hidden:0,  Width:130,  Align:"Center",  ColMerge:0,   SaveName:lnk_prefix+"prnr_port_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:5 },
			                     {Type:"Combo",     Hidden:0, Width:177,  Align:"Center",  ColMerge:0,   SaveName:lnk_prefix+"edi_snd_flg",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			                     {Type:"Text",      Hidden:1, Width:300,  Align:"Center",  ColMerge:0,   SaveName:lnk_prefix+"trd_prnr_sub_lnk_seq", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
		               
		              InitColumns(cols);
		              SetEditable(1);
		              SetColProperty(lnk_prefix+"prnr_sub_lnk_div_cd", {ComboText:"Yard|Service Provider", ComboCode:"1|2"} );
		              SetColProperty(lnk_prefix+"edi_snd_flg", {ComboText:"Y|N", ComboCode:"Y|N"} );
		              SetColProperty(0 ,lnk_prefix+"prnr_sub_lnk_cd" , {AcceptKeys:"E|N" , InputCaseSensitive:1});
		              SetColProperty(0 ,lnk_prefix+"prnr_port_cd" , {AcceptKeys:"E|N" , InputCaseSensitive:1});
		              SetSheetHeight(290);
	              }
                break;
            case 2:      //sheet1 init
                with(sheetObj){
		              var HeadTitle="|Seq|Del|Message Type|VVD|Trans|Full|Message Indicator|Maneuvering Flg|Message Indicator|Message Type Desc.|Sub-Link Seq.";
		              SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
		              var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		              var headers = [ { Text:HeadTitle, Align:"Center"} ];
		              InitHeaders(headers, info);
		              var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName:msg_prefix+"ibflag" },
			                     {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:msg_prefix+"Seq" },
			                     {Type:"DummyCheck", Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:msg_prefix+"DelChk" },
			                     {Type:"Combo",     Hidden:0, Width:200,  Align:"Center",  ColMerge:0,   SaveName:msg_prefix+"edi_msg_tp_id",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			                     {Type:"Combo",     Hidden:1, Width:113,  Align:"Center",  ColMerge:0,   SaveName:msg_prefix+"edi_msg_ind_cd1",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			                     {Type:"Combo",     Hidden:1, Width:105,  Align:"Center",  ColMerge:0,   SaveName:msg_prefix+"edi_msg_ind_cd2",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			                     {Type:"Combo",     Hidden:0, Width:130,   Align:"Center",  ColMerge:0,   SaveName:msg_prefix+"edi_msg_ind_cd3",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			                     {Type:"Combo",     Hidden:0, Width:200,  Align:"Center",  ColMerge:0,   SaveName:msg_prefix+"edi_msg_ind_cd4",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			                     {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:0,   SaveName:msg_prefix+"edi_msg_ind_cd5",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			                     {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:0,   SaveName:msg_prefix+"edi_msg_ind_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			                     {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:0,   SaveName:msg_prefix+"msg_tp_desc",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			                     {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:msg_prefix+"trd_prnr_sub_lnk_seq", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
		              InitColumns(cols);
		              SetEditable(1);
		              SetColProperty(msg_prefix+"edi_msg_tp_id", {ComboText:"COPRAR|TDC315|301|COREOR|RELRED|RELREDCY|VGM|404|IFTMAN", ComboCode:"COPRAR|TDC315|301|COREOR|RELRED|RELREDCY|VGM|404|IFTMAN"} );
		              SetColProperty(msg_prefix+"edi_msg_ind_cd1", {ComboText:"|Carrier's Voyage|TMNL Voyage|UVI(SCN) No|Others", ComboCode:"|01|02|03|09"} );
		              SetColProperty(msg_prefix+"edi_msg_ind_cd2", {ComboText:"|ATA,ATD|ATB,ATD|ATA,ATB,ATD", ComboCode:"|01|02|03"});
		              SetColProperty(msg_prefix+"edi_msg_ind_cd3", {ComboText:"|FO|FOC", ComboCode:"|1|2"} );
		              //SetColProperty(msg_prefix+"edi_msg_ind_cd4", {ComboText:"|BK(A)|BK(M)|ACK|MT|TS1|TS2|COPRAR", ComboCode:"|1|2|3|5|6|7|8"} );
		              SetColProperty(msg_prefix+"edi_msg_ind_cd4", {ComboText:"|BK(A)|BK(M)|ACK|FC|MT|TS1|TS2|BKGCDL(VVD)|BATCH|BKGCLL/CDL(BL)| | | ", ComboCode:"|1|2|3|4|5|6|7|8|9|10|11|21|22"} );
		              SetSheetHeight(160);
	              }
	            break;  
	            
            case 3:      //sheet1 init
                with(sheetObj){
		              var HeadTitle="|Seq|Del|Service Lane|Sub-Link Seq.";
		              SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
		              var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		              var headers = [ { Text:HeadTitle, Align:"Center"} ];
		              InitHeaders(headers, info);
		              var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName:lan_prefix+"ibflag" },
			                     {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:lan_prefix+"Seq" },
			                     {Type:"DummyCheck", Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:lan_prefix+"DelChk" },
			                     {Type:"Text",      Hidden:0,  Width:297,  Align:"Center",  ColMerge:0,   SaveName:lan_prefix+"slan_cd",              KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3 },
			                     {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:lan_prefix+"trd_prnr_sub_lnk_seq", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
		              InitColumns(cols);
		              SetEditable(1);
		              SetColProperty(0 ,lan_prefix+"slan_cd" , {AcceptKeys:"E|N" , InputCaseSensitive:1});
		              SetSheetHeight(160);
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
        		var aryPrefix=new Array(lnk_prefix, msg_prefix, lan_prefix);
        		var sXml=sheetObj.GetSearchData("BCM_SUP_0005GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix));
   	   	  		var arrXml=sXml.split("|$$|");
		   		if (arrXml.length > 0) sheetObjects[0].LoadSearchData(arrXml[0],{Sync:0} );
       	   	  	break;
       	   	  	
        	case IBSAVE:        //saving
        		if(!validateForm(sheetObj,formObj,sAction)) return;
    			formObj.f_cmd.value=MULTI;
	        	var arrSheets=new Array(sheetObjects[0], sheetObjects[1], sheetObjects[2]);
	        	var sParam=ComGetSaveString(arrSheets);
				if (   sheetObj.RowCount()== 0 || (!sheetObj.IsDataModified()&& sParam == "") && sheetObjects[1].RowCount()== 0 || (!sheetObjects[1].IsDataModified()&& sParam == "") && sheetObjects[2].RowCount()== 0 || (!sheetObjects[2].IsDataModified()&& sParam == "")) {
					ComShowCodeMessage("SUP00002");
					return; 
				}
				var aryPrefix=new Array(lnk_prefix, msg_prefix, lan_prefix);
				sParam += "&" + FormQueryString(formObj)+"&" + ComGetPrefixParam(aryPrefix);
				var sXml=sheetObj.GetSaveData("BCM_SUP_0005GS.do", sParam);
			    var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
			    var arrXml=sXml.split("|$$|");
			    if (arrXml.length > 0) {
			    	if (result == 'S') {
			    		if(checkMainData()) {
			    			resetDetailAll();
			    		} else {
				    		setStatusDetail();
			    		}
			    		sheetObjects[0].LoadSearchData(arrXml[0],{Sync:0} );
			    	} else {
			    		sheetObjects[0].LoadSaveData(arrXml[0]);
			    	}
			    }
			    // fix  Auto clear data in Grid 
				   doActionIBSheet(sheetObj,formObj,IBSEARCH);
                break;
                
        	case IBROWSEARCH:   
	    		if(Col == lan_prefix + "slan_cd") {
	    			var param='f_cmd='+SEARCH04;
	    			param += "&slan_cd="+sheetObj.GetCellValue(Row, lan_prefix + "slan_cd");//call from the grid
					var sXml=sheetObj.GetSearchData("SUPCommonGS.do" , param);
		   			var slanCd=ComGetEtcData(sXml, "slanCd");
		   			if(typeof slanCd == "undefined" || slanCd == "" ) {
						ComShowCodeMessage("SUP00014");
						sheetObj.SetCellValue(Row, Col,"",0);
						sheetObj.SelectCell(Row, Col);
					}
	    		} else if(Col == lnk_prefix + "prnr_port_cd") {
	    			var param='f_cmd='+SEARCH05;
	    			param += "&port_cd="+sheetObj.GetCellValue(Row, Col);	//call from the grid
					var sXml=sheetObj.GetSearchData("SUPCommonGS.do" , param);
		   			var portCd=ComGetEtcData(sXml, "portCd");
		   			if(typeof portCd == "undefined" || portCd == "" ) {
						ComShowCodeMessage("SUP00017");
						sheetObj.SetCellValue(Row, Col,"",0);
						sheetObj.SelectCell(Row, Col);
					}
	    		} else {
	    			formObj.f_cmd.value=SEARCH01;
	        		var aryPrefix=new Array(msg_prefix, lan_prefix);
	        		var sXml=sheetObj.GetSearchData("BCM_SUP_0005GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix));
	   	   	  		var arrXml=sXml.split("|$$|");
	   	   	  		if (arrXml.length > 0) sheetObjects[1].LoadSearchData(arrXml[0],{Sync:0} );
	   	   	  		if (arrXml.length > 1) sheetObjects[2].LoadSearchData(arrXml[1],{Sync:0} );
	    		}
            break;
        }
    }
	/**
     * Removing IBSheet Row <br>
     * @param {ibsheet} sheetObj    IBSheet Object
     **/
	function rowRemove(sheetObj, prefix) {
		ComRowHideDelete(sheetObj, prefix + "DelChk");
	}
	/**
     * Loading the event of HTML control in the page dynamically. <br>
     * param : sheetObj, sheetNo
     **/
    function initControl() {
    	// calling engnum_keypress() in case of occurring keypress event at s_sub_lnk_cd field
    	// axon_event.addListener  ('keypress', 'engnum_keypress' , 's_sub_lnk_cd');
    	// calling eng_keypress() in case of occurring keypress event at s_port_cd field
        // axon_event.addListener  ('keypress', 'eng_keypress'    , 's_port_cd');
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
    			//ComAddSeparator(event.srcElement);
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
//    function engnum_keypress() {
//    	ComKeyOnlyAlphabet('uppernum');
//    }
    /**
     * activating/deactivating the button by the condition(flag value)
     * param : flag
     **/
 	function buttonControl(flag) {
 		if(flag == "D") {
	 		ComBtnDisable("btn_add1");
	 		ComBtnDisable("btn_add2");
	 		ComBtnDisable("btn_del1");
	 		ComBtnDisable("btn_del2");
 		} else {
 			ComBtnEnable("btn_add1");
 			ComBtnEnable("btn_add2");
 			ComBtnEnable("btn_del1");
 			ComBtnEnable("btn_del2");
 		}
 	}
    /**
	 * Calling this function in case of occurring double-clicking sheet<br>
	 * Retrieving the detail infomation about the main information.
     * param : sheetObj, row, col, cellX, cellY, cellW, cellH
     **/
	function sheet1_OnDblClick(sheetObj, row, col, cellX, cellY, cellW, cellH) {
		if(sheetObj.GetRowStatus(row) != "I") {
			if(form.trd_prnr_sub_lnk_seq.value != sheetObj.GetCellValue(row, lnk_prefix + "trd_prnr_sub_lnk_seq")) {
				form.trd_prnr_sub_lnk_seq.value=sheetObj.GetCellValue(row, lnk_prefix + "trd_prnr_sub_lnk_seq");
	    		buttonControl();
	    		doActionIBSheet(sheetObj, document.form, IBROWSEARCH);
    		}
    	}
	}
    /**
     * Calling this function in case of changing the cell value in sheet
     * param : sheetObj, Row, Col, Value
     **/
    function sheet1_OnChange(sheetObj,Row, Col, Value) {
    	if(sheetObj.ColSaveName(Col) == lnk_prefix + "prnr_port_cd") {
    		if(sheetObj.GetCellValue(Row, lnk_prefix + "prnr_port_cd").length != 5) {
    			ComShowCodeMessage("SUP00008", "5", "Port Code");
    			sheetObj.SetCellValue(Row, lnk_prefix + "prnr_port_cd","",0);
   			 	sheetObj.SelectCell(Row, lnk_prefix + "prnr_port_cd");
    			return;
    		}
    		doActionIBSheet(sheetObj, document.form, IBROWSEARCH, lnk_prefix + "prnr_port_cd", Row);
    	}
    }
    /**
     * Calling this function in case of changing the cell value in sheet2
     * param :  sheetObj, Row, Col, Value
     **/
    function sheet2_OnChange(sheetObj,Row, Col, Value) {
    	if(sheetObj.ColSaveName(Col) == msg_prefix + "edi_msg_tp_id") {
    		//CellValue -> GetCellValue, CellValue2 -> SetCellValue, CellEditable -> SetCellEditable

    		if (sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_tp_id") == "TDC315") {
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd3","",1);
    			sheetObj.SetCellEditable(Row, msg_prefix + "edi_msg_ind_cd3",1);    			
    			sheetObj.CellComboItem(Row,msg_prefix+"edi_msg_ind_cd4", {ComboText:"|Inland Yard", ComboCode:"0|1"} );
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd4","0",1);
    			sheetObj.SetCellEditable(Row, msg_prefix + "edi_msg_ind_cd4",1);
    		} else if (sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_tp_id") == "301") {
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd3","",0);
    			sheetObj.SetCellEditable(Row, msg_prefix + "edi_msg_ind_cd3",0);
    			sheetObj.CellComboItem(Row,msg_prefix+"edi_msg_ind_cd4", {ComboText:"|BK(A)|BK(M)|ACK|FC|MT|TS1|TS2|BATCH", ComboCode:"|1|2|3|4|5|6|7|9"} );
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd4","",0);
    			sheetObj.SetCellEditable(Row, msg_prefix + "edi_msg_ind_cd4",1);
    		} else if (sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_tp_id") == "COPRAR") {
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd3","",0);
    			sheetObj.SetCellEditable(Row, msg_prefix + "edi_msg_ind_cd3",0);
    			//sheetObj.CellComboItem(Row,msg_prefix+"edi_msg_ind_cd4", {ComboText:"BKGCDL(VVD)|BKGCLL/CDL(BL)", ComboCode:"8|10"} );
    			sheetObj.CellComboItem(Row,msg_prefix+"edi_msg_ind_cd4", {ComboText:"BKGCDL(VVD)", ComboCode:"8"} );
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd4","8",0);
    			sheetObj.SetCellEditable(Row, msg_prefix + "edi_msg_ind_cd4",0);
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd",sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_ind_cd4"),0);
        		sheetObj.SetCellValue(Row, msg_prefix + "msg_tp_desc","1",0);
    		} else if (sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_tp_id") == "COREOR") {
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd3","",0);
    			sheetObj.SetCellEditable(Row, msg_prefix + "edi_msg_ind_cd3",0);
    			sheetObj.CellComboItem(Row,msg_prefix+"edi_msg_ind_cd4", {ComboText:" ", ComboCode:"11"} );
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd4","11",0);
    			sheetObj.SetCellEditable(Row, msg_prefix + "edi_msg_ind_cd4",0);
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd",sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_ind_cd4"),0);
        		sheetObj.SetCellValue(Row, msg_prefix + "msg_tp_desc","1",0);
    		} else if (sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_tp_id") == "RELRED") {
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd3","",0);
    			sheetObj.SetCellEditable(Row, msg_prefix + "edi_msg_ind_cd3",0);
    			sheetObj.CellComboItem(Row,msg_prefix+"edi_msg_ind_cd4", {ComboText:" ", ComboCode:"21"} );
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd4","21",0);
    			sheetObj.SetCellEditable(Row, msg_prefix + "edi_msg_ind_cd4",0);
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd",sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_ind_cd4"),0);
        		sheetObj.SetCellValue(Row, msg_prefix + "msg_tp_desc","1",0);
    		} else if (sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_tp_id") == "RELREDCY") {
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd3","",0);
    			sheetObj.SetCellEditable(Row, msg_prefix + "edi_msg_ind_cd3",0);
    			sheetObj.CellComboItem(Row,msg_prefix+"edi_msg_ind_cd4", {ComboText:" ", ComboCode:"22"} );
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd4","22",0);
    			sheetObj.SetCellEditable(Row, msg_prefix + "edi_msg_ind_cd4",0);
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd",sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_ind_cd4"),0);
        		sheetObj.SetCellValue(Row, msg_prefix + "msg_tp_desc","1",0);
    		} else if (sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_tp_id") == "VGM") {
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd3","",0);
    			sheetObj.SetCellEditable(Row, msg_prefix + "edi_msg_ind_cd3",0);
    			sheetObj.CellComboItem(Row,msg_prefix+"edi_msg_ind_cd4", {ComboText:"|VERMAS (A) - CY|VERMAS (A) - POL|VERMAS (A) - T/S|VERMAS (M)|301 (A) - CY|301 (A) - POL|301 (M)|COPRAR (M)", ComboCode:"|31|32|33|34|35|36|37|38"} );
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd4","",0);
    			sheetObj.SetCellEditable(Row, msg_prefix + "edi_msg_ind_cd4",1);
    		} else if (sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_tp_id") == "404") {
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd3","",0);
    			sheetObj.SetCellEditable(Row, msg_prefix + "edi_msg_ind_cd3",0);
    			sheetObj.CellComboItem(Row,msg_prefix+"edi_msg_ind_cd4", {ComboText:" ", ComboCode:"23"} );
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd4","23",0);
    			sheetObj.SetCellEditable(Row, msg_prefix + "edi_msg_ind_cd4",0);
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd",sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_ind_cd4"),0);
    			sheetObj.SetCellValue(Row, msg_prefix + "msg_tp_desc","1",0);
    		} else if (sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_tp_id") == "IFTMAN") {
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd3","",0);
    			sheetObj.SetCellEditable(Row, msg_prefix + "edi_msg_ind_cd3",0);
    			sheetObj.CellComboItem(Row,msg_prefix+"edi_msg_ind_cd4", {ComboText:" ", ComboCode:"24"} );
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd4","24",0);
    			sheetObj.SetCellEditable(Row, msg_prefix + "edi_msg_ind_cd4",0);
    			sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd",sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_ind_cd4"),0);
    			sheetObj.SetCellValue(Row, msg_prefix + "msg_tp_desc","1",0);
    		}
    		
        } else if(sheetObj.ColSaveName(Col) == msg_prefix + "edi_msg_ind_cd1") {
    		sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd2","",0);
    		sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd3","",0);
    		sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd4","",0);
    		sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd","51",0);
    		sheetObj.SetCellValue(Row, msg_prefix + "msg_tp_desc",sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_ind_cd1"),0);
    	} else if(sheetObj.ColSaveName(Col) == msg_prefix + "edi_msg_ind_cd2") {
    		sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd1","",0);
    		sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd3","",0);
    		sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd4","",0);
    		sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd","53",0);
    		sheetObj.SetCellValue(Row, msg_prefix + "msg_tp_desc",sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_ind_cd2"),0);
    	} else if(sheetObj.ColSaveName(Col) == msg_prefix + "edi_msg_ind_cd3") {
    		if (sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_tp_id") == "TDC315") {
        		sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd1","",0);
        		sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd2","",0);
        		//sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd4","",0);
        		//sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd","4",0);
        		sheetObj.SetCellValue(Row, msg_prefix + "msg_tp_desc",sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_ind_cd3"),0);
    		} else {
        		sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd1","",0);
        		sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd2","",0);
        		sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd4","",0);
        		sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd","4",0);
        		sheetObj.SetCellValue(Row, msg_prefix + "msg_tp_desc",sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_ind_cd3"),0);
    		}
    	} else if(sheetObj.ColSaveName(Col) == msg_prefix + "edi_msg_ind_cd4") {
    		if (sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_tp_id") == "TDC315") {
        		sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd1","",0);
        		sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd2","",0);
        		//sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd3","",0);
        		sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd",sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_ind_cd4"),0);
        		//sheetObj.SetCellValue(Row, msg_prefix + "msg_tp_desc","1",0);
    		} else {
        		sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd1","",0);
        		sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd2","",0);
        		sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd3","",0);
        		sheetObj.SetCellValue(Row, msg_prefix + "edi_msg_ind_cd",sheetObj.GetCellValue(Row, msg_prefix + "edi_msg_ind_cd4"),0);
        		sheetObj.SetCellValue(Row, msg_prefix + "msg_tp_desc","1",0);
    		}
    	}
    }
    /**
     * Calling this function in case of changing the cell value in sheet3
     * param : sheetObj, Row, Col, Value
     **/
    function sheet3_OnChange(sheetObj,Row, Col, Value) {
    	if(sheetObj.ColSaveName(Col) == lan_prefix + "slan_cd") {
    		if(sheetObj.GetCellValue(Row, lan_prefix + "slan_cd").length != 3) {
    			ComShowCodeMessage("SUP00015", "Service Lane");
    			sheetObj.SetCellValue(Row, lan_prefix + "slan_cd","",0);
   			 	sheetObj.SelectCell(Row, lan_prefix + "slan_cd");
    			return;
    		}
    		if(sheetObj.GetCellValue(Row, lan_prefix + "slan_cd") != "ALL") {
    			doActionIBSheet(sheetObj, document.form, IBROWSEARCH, lan_prefix + "slan_cd", Row);
    		}
    	}
    }
    /**
     * Changing EDI Message Type Code at once
     * param : sheetObj
     **/
    function changeMsgTpId(sheetObj) {
    	if(sheetObj.RowCount()> 1) {
	    	for (var ir=2; ir<=sheetObj.LastRow(); ir++){
	    		if(sheetObj.GetRowStatus(ir) == "D")
	    			continue;
	    		sheetObj.SetCellValue(ir,msg_prefix + "edi_msg_tp_id",sheetObj.GetCellValue(1,msg_prefix + "edi_msg_tp_id"),0);
	    	}
    	}
    }
    /**
     * handling process for input validation <br>
     * param : sheetObj, formObj, sAction
     **/
    function validateForm(sheetObj,formObj,sAction) {
    	var sheetObj1=sheetObjects[1];
    	var sheetObj2=sheetObjects[2];
    	var ediMsgIndCd1="";
    	var ediMsgIndCd2="";
    	var ediMsgIndCd3="";
    	var ediMsgIndCd4="";
    	var transCnt=0;
    	var transVal="";
    	var existTDC315 = false;
    	//checking BKG EDI SUB LNK MSG
    	for (var ir=1; ir<=sheetObj1.LastRow(); ir++){
    		// check duplication of TDC315 Message Type
    		if(existTDC315 && sheetObj1.GetRowHidden(ir) == "0" && sheetObj1.GetCellValue(ir, msg_prefix + "edi_msg_tp_id") == "TDC315") {
    			ComShowCodeMessage("SUP00016", "TDC315 Message Type");
    			return false;
    		}else if(sheetObj1.GetRowHidden(ir) == "0" && sheetObj1.GetCellValue(ir, msg_prefix + "edi_msg_tp_id") == "TDC315") { // except hidden row
    			existTDC315 = true;
    		}
    		
    		if(sheetObj1.GetRowStatus(ir) == "D" || sheetObj1.GetRowStatus(ir) == "R")
    			continue;
    		ediMsgIndCd1=sheetObj1.GetCellValue(ir,msg_prefix + "edi_msg_ind_cd1");
    		ediMsgIndCd2=sheetObj1.GetCellValue(ir,msg_prefix + "edi_msg_ind_cd2");
    		ediMsgIndCd3=sheetObj1.GetCellValue(ir,msg_prefix + "edi_msg_ind_cd3");
    		ediMsgIndCd4=sheetObj1.GetCellValue(ir,msg_prefix + "edi_msg_ind_cd4");
    		if(ediMsgIndCd2 != null && ediMsgIndCd2 != "") {
    			transCnt=transCnt + ir;
    			transVal=ediMsgIndCd2;
    		}
    		if((ediMsgIndCd1 == "" && ediMsgIndCd2 == "" && ediMsgIndCd3 == "" && ediMsgIndCd4 == "") ||
    				(sheetObj1.GetCellValue(ir, msg_prefix + "edi_msg_tp_id") == "TDC315" && ediMsgIndCd3 == "")) {
    			ComShowCodeMessage("SUP00001", "Message Indicator");
    			sheetObj1.SelectCell(ir, msg_prefix + "edi_msg_ind_cd3");
    			return false;
    		}
    	}
    	if(transCnt > 0 ) {
	    	var row=sheetObj1.DataInsert(-1);
	    	sheetObj1.SetCellValue(row, msg_prefix + "trd_prnr_sub_lnk_seq",form.trd_prnr_sub_lnk_seq.value,0);
	    	sheetObj1.SetCellValue(row, msg_prefix + "edi_msg_tp_id",sheetObj1.GetCellValue(1, msg_prefix + "edi_msg_tp_id"),0);
	    	sheetObj1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd5","52",0);
			sheetObj1.SetCellValue(row, msg_prefix + "edi_msg_ind_cd","52",0);
			if(transVal == "01" || transVal == "02") {
				sheetObj1.SetCellValue(row, msg_prefix + "msg_tp_desc","Y",0);
			} else {
				sheetObj1.SetCellValue(row, msg_prefix + "msg_tp_desc","N",0);
			}
			sheetObj1.SetRowHidden(row,1);
    	}
    	//Checking EDI PARTNER PORT LANE
    	for (var ir=1; ir<=sheetObj2.LastRow(); ir++){
    		if(sheetObj2.GetRowStatus(ir) == "D" || sheetObj2.GetRowStatus(ir) == "R")
    			continue; 
    		if(sheetObj2.GetCellValue(ir,lan_prefix + "slan_cd") == "") {
    			ComShowCodeMessage("SUP00001", "Service Lane");
    			sheetObj2.SelectCell(ir, lan_prefix + "slan_cd");
    			return false;
    		}
    	}
    	if(!checkDupSlanCd()) return false;
    	return true;
    }
    /**
     * Checking whether Service Lane Code is duplicated in EDI PARTNER PORT LANE or not
     **/
    function checkDupSlanCd() {
    	var row1="";
    	var row2="";
    	var sheetObj=sheetObjects[2];
    	for (var ir=1; ir<=sheetObj.LastRow(); ir++){
    		if(sheetObj.GetRowStatus(ir) == "D")
    			continue; 
    		row1=sheetObj.GetCellValue(ir, lan_prefix + "slan_cd");
    		for(var j=ir+1; j<=sheetObj.LastRow(); j++) {
    			row2=sheetObj.GetCellValue(j, lan_prefix + "slan_cd");
    			if(sheetObj.GetCellValue(j, lan_prefix + "ibflag") == "D") {
    				continue;
    			}
    			if(row1.trim() == row2.trim()) {
    				ComShowCodeMessage("SUP00016", "Service Lane");
    				sheetObj.SelectCell(j, lan_prefix + "slan_cd");
    				return false; 
    			}
    		}
    	}
    	return true;
    }
    /**
     * Calling this function after finishing to retrieve sheet1
     * param : sheetObj, ErrMsg
     **/
 	function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
 		//ComColFontName(sheetObj, "7");
 		buttonControl('D');
 	}
    /**
     * Calling this function after finishing to retrieve sheet2
     * param : sheetObj, ErrMsg
     **/
 	function sheet2_OnSearchEnd(sheetObj, ErrMsg) {
 		for (var ir=1; ir<=sheetObj.LastRow(); ir++){

    		if (sheetObj.GetCellValue(ir, msg_prefix + "edi_msg_tp_id") == "TDC315") {    			
    			sheetObj.CellComboItem(ir,msg_prefix+"edi_msg_ind_cd4", {ComboText:"|Inland Yard", ComboCode:"0|1"} );
    		} else if (sheetObj.GetCellValue(ir, msg_prefix + "edi_msg_tp_id") == "301") {
    			sheetObj.CellComboItem(ir,msg_prefix+"edi_msg_ind_cd4", {ComboText:"|BK(A)|BK(M)|ACK|FC|MT|TS1|TS2|BATCH", ComboCode:"|1|2|3|4|5|6|7|9"} );
    		} else if (sheetObj.GetCellValue(ir, msg_prefix + "edi_msg_tp_id") == "COPRAR") {
    			sheetObj.CellComboItem(ir,msg_prefix+"edi_msg_ind_cd4", {ComboText:"BKGCDL(VVD)", ComboCode:"8"} );
    		} else if (sheetObj.GetCellValue(ir, msg_prefix + "edi_msg_tp_id") == "COREOR") {
    			sheetObj.CellComboItem(ir,msg_prefix+"edi_msg_ind_cd4", {ComboText:" ", ComboCode:"11"} );
    		} else if (sheetObj.GetCellValue(ir, msg_prefix + "edi_msg_tp_id") == "RELRED") {
    			sheetObj.CellComboItem(ir,msg_prefix+"edi_msg_ind_cd4", {ComboText:" ", ComboCode:"21"} );
    		} else if (sheetObj.GetCellValue(ir, msg_prefix + "edi_msg_tp_id") == "RELREDCY") {
    			sheetObj.CellComboItem(ir,msg_prefix+"edi_msg_ind_cd4", {ComboText:" ", ComboCode:"22"} );
    		} else if (sheetObj.GetCellValue(ir, msg_prefix + "edi_msg_tp_id") == "VGM") {
    			sheetObj.CellComboItem(ir,msg_prefix+"edi_msg_ind_cd4", {ComboText:"|VERMAS (A) - CY|VERMAS (A) - POL|VERMAS (A) - T/S|VERMAS (M)|301 (A) - CY|301 (A) - POL|301 (M)|COPRAR (M)", ComboCode:"|31|32|33|34|35|36|37|38"} );
    		} else if (sheetObj.GetCellValue(ir, msg_prefix + "edi_msg_tp_id") == "404") {
    			sheetObj.CellComboItem(ir,msg_prefix+"edi_msg_ind_cd4", {ComboText:" ", ComboCode:"23"} );
    		} else if (sheetObj.GetCellValue(ir, msg_prefix + "edi_msg_tp_id") == "IFTMAN") {
    			sheetObj.CellComboItem(ir,msg_prefix+"edi_msg_ind_cd4", {ComboText:" ", ComboCode:"24"} );
    		}
 			
 			sheetObj.SetCellEditable(ir, msg_prefix + "edi_msg_tp_id",0);
 			sheetObj.SetCellEditable(ir, msg_prefix + "edi_msg_ind_cd1",0);
 			sheetObj.SetCellEditable(ir, msg_prefix + "edi_msg_ind_cd2",0);
 			sheetObj.SetCellEditable(ir, msg_prefix + "edi_msg_ind_cd3",0);
 			sheetObj.SetCellEditable(ir, msg_prefix + "edi_msg_ind_cd4",0);
 			//Not showing when the value is existed in Maneuvering Flg
 			if(sheetObj.GetCellValue(ir, msg_prefix + "edi_msg_ind_cd5") != "") {
 				sheetObj.SetRowHidden(ir,1);
 			}
     	}
 	}
    /**
     * Calling this function after finishing to retrieve sheet3
     * param : sheetObj, ErrMsg
     **/
 	function sheet3_OnSearchEnd(sheetObj, ErrMsg) {
 		for (var ir=1; ir<=sheetObj.LastRow(); ir++){
 			sheetObj.SetCellEditable(ir, lan_prefix + "slan_cd",0);
     	}
 	}
    /**
     * Changing the status of the detail information after saving
     **/
    function setStatusDetail() {
    	for (var ir=1; ir<=sheetObjects[1].LastRow(); ir++){
    		if(   sheetObjects[1].GetCellValue(ir, msg_prefix + "ibflag") == "I" || sheetObjects[1].GetCellValue(ir, msg_prefix + "ibflag") == "D") {
    			sheetObjects[1].SetCellValue(ir, msg_prefix + "ibflag","R",0);
    			sheetObjects[1].SetCellEditable(ir, msg_prefix + "edi_msg_tp_id",0);
    			sheetObjects[1].SetCellEditable(ir, msg_prefix + "edi_msg_ind_cd1",0);
    			sheetObjects[1].SetCellEditable(ir, msg_prefix + "edi_msg_ind_cd2",0);
    			sheetObjects[1].SetCellEditable(ir, msg_prefix + "edi_msg_ind_cd3",0);
    			sheetObjects[1].SetCellEditable(ir, msg_prefix + "edi_msg_ind_cd4",0);
			}
     	}
    	for (var ir=1; ir<=sheetObjects[2].LastRow(); ir++){
    		if(sheetObjects[2].GetCellValue(ir, lan_prefix + "ibflag") == "I" || sheetObjects[2].GetCellValue(ir, lan_prefix + "ibflag") == "D") {
     			sheetObjects[2].SetCellValue(ir, lan_prefix + "ibflag","R",0);
     			sheetObjects[2].SetCellEditable(ir, lan_prefix + "slan_cd",0);
    		}
     	}
    }
    /**
     * Initializing the detail information after saving / retrieving
     **/
    function resetDetailAll() {
    	sheetObjects[1].RemoveAll();
    	sheetObjects[2].RemoveAll();
    	form.trd_prnr_sub_lnk_seq.value="";
    }
    /**
     * Checking whether the deleted main data is existed or not after saving
     **/
    function checkMainData() {
    	for (var ir=1; ir<=sheetObjects[0].LastRow(); ir++){
    		if(sheetObjects[0].GetCellValue(ir, lnk_prefix + "ibflag") == "D") {
    			if(sheetObjects[0].GetCellValue(ir, lnk_prefix + "trd_prnr_sub_lnk_seq") == form.trd_prnr_sub_lnk_seq.value) {
     				return true;
     			}
    		}
     	}
    	return false;
    }
    