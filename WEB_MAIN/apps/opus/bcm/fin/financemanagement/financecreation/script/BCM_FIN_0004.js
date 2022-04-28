/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName 		: BCM_FIN_0004.js
*@FileTitle 	: AR Route Rank
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/02
=========================================================*/
/****************************************************************************************
Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
				MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
				OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
***************************************************************************************/
	/**
	 * @extends 
	 * @class AR Route Rank : business script for AR Route Rank
	 */
	// The common variables
	var tabObjects=new Array();
	var tabCnt=0;
	var beforetab=1;
	var sheetObjects=new Array();
	var sheetCnt=0;
	var comboObjects=new Array();
	var comboCnt=0;
	var vslCombo="";
	var vvdCombo="";
	var condSearch = "F";	//search시 조회조건 포함여부(조건포함 조회시 Row Add, Up Down 버튼 disable)
	// Event handler processing by button click event */
	document.onclick=processButtonClick;
	// Event handler processing by button name */
	function processButtonClick(){
		var sheetObject=sheetObjects[0];
		var formObject=document.form;
		try{
			var srcName=ComGetEvent("name");
			switch(srcName){
				case "btn_retrieve":
					doActionIBSheet(sheetObject,formObject,IBSEARCH);
					break;
				case "btn_new":
					ComResetAll();
					break;
				case "btn_save":
					doActionIBSheet(sheetObject,formObject,IBSAVE);
					break;
				case "btn_loadExcel":
					doActionIBSheet(sheetObject,formObject,IBLOADEXCEL);
	                break; 					
				case "btn_add":
					if (condSearch == "F") {
						//var row = sheetObject.DataInsert(-1);
						var row=sheetObject.DataInsert();
						for (i=row;i<=sheetObject.LastRow();i++) {
							sheetObject.SetCellValue(i,"rnk_seq",i);
						}
						sheetObject.SetCellValue(1, "change_flg","Y",0);
						//formObject.change_flg.value = "Y";
					}
					break;
				case "btn_del":
					if (condSearch == "F") {
						rowRemove(sheetObject);
	    	            sheetObject.RowDelete(sheetObject.FindCheckedRow("DelChk"), false);
						sheetObject.SetCellValue(1, "change_flg","Y",0);
						//formObject.change_flg.value = "Y";
						sheetObject.SetHeaderCheck(0, 1, 0);
						for(i=1;i<=sheetObject.LastRow();i++) {
							sheetObject.SetCellValue(i,"rnk_seq",i);
						}
					}
					break;
				case "pop_slan":
					ComOpenPopup("COM_ENS_081.do", 830, 410, "setServiceLaneCode", "1,0,1,1,1,1", false, false, 0, 0, 0, "COM_ENS_081");
					break;
	            case "btn_rlane_search":
	            	var objEvt = ComGetEvent();
	            	if(objEvt.style.cursor == "default") return;
	            	var sUrl="/opuscntr/COM_COM_0011.do?rlane_cd=" + formObject.s_rlane_cd.value +"&mdm_yn=Y&main_page=false";
	            	var rVal=ComOpenPopup(sUrl, 770, 420, "get_rLaneCd", "1,0,1", true);
	    			break;
                case "btns_up":
					if (condSearch == "F") {
	                    var sRowStr=sheetObject.GetSelectionRows("/");  //"/" row separator, results: "3/4/5"
	                    var arr=sRowStr.split("/");
	                    if (Number(arr)-1 >= 1) {
	                    	sheetObject.DataMove(Number(arr)-1);
		                    // 이동한 row의 seq값 변경
		                    sheetObject.SetCellValue(Number(arr)-1,"rnk_seq",Number(arr)-1);
	                    }
	                    // 이동한 row이하의 seq 값 변경
						for(i=Number(arr);i<=sheetObject.LastRow();i++) {
							sheetObject.SetCellValue(i,"rnk_seq",i);
						}
					}
                    break;
                case "btns_down":
					if (condSearch == "F") {
	                    var sRowStr=sheetObject.GetSelectionRows("/");  //"/" row separator, results: "3/4/5"
	                    var arr=sRowStr.split("/");
	                    sheetObject.DataMove(Number(arr)+2);
	                    // 이동한 row이하의 seq 값 변경
						for(i=Number(arr);i<=sheetObject.LastRow();i++) {
							sheetObject.SetCellValue(i,"rnk_seq",i);
						}
					}
                    break;
 				case "btn_downexcel":
	    	    	if(sheetObjects[0].RowCount() < 1){//no data	
	    	    		ComShowCodeMessage("COM132501");
	    	    	}else{	
	    	    		/*
	    	    		sheetObjects[0].Down2Excel({ HiddenColumn:1, Merge:1});
	    	    	    */
	    	    		sheetObjects[0].Down2Excel({ DownCols: makeHiddenSkipCol(sheetObjects[0]), SheetDesign:1,Merge:1 });
	    	    	}	
	    	    	break;
			} // end switch
		}catch(e){
			if( e == "[object Error]"){
				ComShowMessage(OBJECT_ERROR);
			} else{
				ComShowMessage(e);
			}
		}
	}
	/**
	 * Service Lane Code Popup<br>
	 * @param {arry} aryPopupData   sheetObjects[0]  sheetIdx
	 */
	function setServiceLaneCode(aryPopupData, Row, Col, sheetIdx) {
		form.s_slan_cd.value=aryPopupData[0][3];
		if(form.s_rlane_cd.value != "" && form.s_rlane_cd.value.substring(0,3) != form.s_slan_cd.value) 
		{
			form.s_rlane_cd.value="";
		}
	}
	/**
	* Setting Revenue Lane Code
	*/
    function get_rLaneCd(rowArray) {
  		var sheetObj=sheetObjects[0];
  	    var formObj=document.form;
  	   	var colArray=rowArray[0];
//  	   	alert(colArray[2]);
//  	   	s_rlane_cd.SetSelectCode(colArray[2]);
  		formObj.s_rlane_cd.value=colArray[2];
  		formObj.s_slan_cd.value=colArray[2].substring(0,3);
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
	* registering IBCombo Object as list
	* adding process for list in case of needing batch processing with other items 
	* defining list on the top of source
	 */
	function setComboObject(combo_obj){
	    comboObjects[comboCnt++]=combo_obj;
	}
	/**
	 * initializing sheet
	 * implementing onLoad event handler in body tag
	 * adding first-served functions after loading screen.
	 */
	function loadPage(){		
		doActionIBSheet(sheetObjects[0],document.form,IBCLEAR);
	    // handling multi-combo object
	    //---------------------------------------------
	    for(k=0;k<comboObjects.length;k++){
	        //initCombo(comboObjects[k], k+1);
	        initCombo(comboObjects[k],comboObjects[k].options.id);
	    }
	    
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
		doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
	}
	/**
	 * setting sheet initial values and header
	 * param : sheetObj, sheetNo
	 * adding case as numbers of counting sheets
	 */
	function initSheet(sheetObj,sheetNo){
		var cnt=0;
		switch(sheetNo){
			case 1:      //sheet1 init
				  with(sheetObj){
					
					   var HeadTitle="|Del|Revenue Lane|Revenue Seq|Revenue Lane Desc|Zone IOC Code|Zone IOC Desc|Service Lane|Delete Flag|h_rlane_cd|rnk_seq|change_flg";
					   var headCount=ComCountHeadTitle(HeadTitle);

					   SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );

					   var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
					   var headers = [ { Text:HeadTitle, Align:"Center"} ];
					   InitHeaders(headers, info);

					   var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
								 {Type:"CheckBox",  Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
								 {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"rlane_cd",    KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:5,	AcceptKeys:"E|[0123456789]",	InputCaseSensitive:1 },
								 {Type:"Text",      	Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"rnk_seq",     KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,	  AcceptKeys:"N"},
								 {Type:"Text",      Hidden:0,  Width:237,  Align:"Left",    ColMerge:0,   SaveName:"rlane_desc",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1000 },
								 {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"zn_ioc_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3,	AcceptKeys:"E",	InputCaseSensitive:1 },
								 {Type:"Text",      Hidden:0,  Width:130,  Align:"Left",    ColMerge:0,   SaveName:"ioc_desc",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1000 },
								 {Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"slan_cd",     KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:3 },
								 {Type:"Combo",     Hidden:0, Width:50,  Align:"Center",  ColMerge:0,   SaveName:"delt_flg",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
								 {Type:"Text",      Hidden:1, Width:100,  Align:"Left",    ColMerge:0,   SaveName:"h_rlane_cd" },
								 {Type:"Text",      Hidden:1, Width:100,  Align:"Left",    ColMerge:0,   SaveName:"h_rnk_seq" },
								 {Type:"Text",      Hidden:1, Width:50,  Align:"Center",  ColMerge:0,   SaveName:"change_flg" } ];
						
							InitColumns(cols);

							SetEditable(1);
//							SetCountPosition(0);
							SetWaitImageVisible(0);
							SetColProperty("delt_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
							resizeSheet();		// SetSheetHeight(450);
							FitColWidth();
					   }
				break;
		}
	}

	/**
	 * Setting multicombo items
	 */
	function initCombo(comboObj, comboId) {
	    with (comboObj) {
	    	ValidChar(2,1);			//SJH.20150106.ADD

	        if (comboId ==  "s_slan_cd"){
	            SetMultiSelect(1);
	            SetMultiSeparator(",");
				SetDropHeight(300);
//	            SetSelectText("All",false);
	         } else if (comboId ==  "s_rlane_cd"){      
	            SetMultiSelect(1);
	            SetMultiSeparator(",");
				SetDropHeight(300);
	          }
	     }
//	    f_selgroup.SetSelectIndex(0);
	 }  
	
	function resizeSheet(){
		ComResizeSheet(sheetObjects[0]);
	}
	
	/**
	 * Handling the process about the sheet 
	 * param : sheetObj, formObj, sAction, row, col
	 **/
	function doActionIBSheet(sheetObj,formObj,sAction,row,col){
		sheetObj.ShowDebugMsg(false);
		switch(sAction){
	        case IBCLEAR:          //Inquiry
				ComOpenWait(true);
				
				formObj.f_cmd.value = INIT;
				var sXml = sheetObj.GetSearchData("BCM_FIN_0004GS2.do", FormQueryString(formObj));
				var arrXml = sXml.split("|$$|");
				
				if (arrXml.length > 0) {
					ComXml2ComboItem(arrXml[0], s_slan_cd, "code", "name");
					s_slan_cd.InsertItem(0,"","");
					s_slan_cd.SetSelectIndex(0);
					
//					ComCoaSetIBCombo(sheetObj, arrXml[0], "trd_cd", true, 0);
				}
	            if (arrXml.length > 1) {
	                ComXml2ComboItem(arrXml[1], s_rlane_cd, "code", "name");
	            	s_rlane_cd.InsertItem(0,"","");
	            	s_rlane_cd.SetSelectIndex(0);
	            }
	            	
				ComOpenWait(false);
	            break;
			case IBSEARCH:      
				if (formObj.s_slan_cd.value != "" || formObj.s_rlane_cd.value != "") {
					condSearch = "T";
				} else {
					condSearch = "F";
				}
	            sheetObj.SetWaitImageVisible(0);
	            ComOpenWait(true);
				formObj.f_cmd.value=SEARCH;	
				var sXml=sheetObj.GetSearchData("BCM_FIN_0004GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(""));
				var arrXml=sXml.split("|$$|");
				if (arrXml.length > 0) sheetObjects[0].LoadSearchData(arrXml[0],{Sync:1} );
				
				//Row Add, Up-Down 버튼 보이기/숨기기
				if(condSearch == "T") {
					ComBtnDisable("btn_add");
					ComBtnDisable("btn_del");
					ComBtnDisable("btns_up");
					ComBtnDisable("btns_down");
				} else {
		            ComBtnEnable("btn_add");
		            ComBtnEnable("btn_del");
		            ComBtnEnable("btns_up");
		            ComBtnEnable("btns_down");
				}
				ComOpenWait(false);
				break;
			case IBSAVE:        
				//if(validateForm(sheetObj,formObj,sAction)){	
				//if (!sheetObj.GetSaveString(true)) {
					//return;
				//}				
				if(!ComShowCodeConfirm("FIN00009")) {
  					return false;
  				}
				if(!validateForm(sheetObj)) return;
				if(checkDupRlaneZnIocCd(sheetObj)) {
					//setChangeStatus(sheetObj);
					formObj.f_cmd.value=MULTI;
					var sParam=ComGetSaveString(sheetObj);
					if (sheetObj.RowCount()== 0 || (!sheetObj.IsDataModified()&& sParam == "")){
						ComShowCodeMessage("FIN00002");
						return; 
					}
					ComOpenWait(true);
					sParam += "&" + FormQueryString(formObj);
					var sXml=sheetObj.GetSaveData("BCM_FIN_0004GS.do", sParam);
					ComOpenWait(false);
					var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
					var arrXml=sXml.split("|$$|");
					if (arrXml.length > 0){
						if (result == 'S'){
							//sheetObjects[0].LoadSearchData(arrXml[0],{Sync:1} );
							ComShowCodeMessage("FIN00006");
						} else{
							sheetObjects[0].LoadSaveData(arrXml[0]);
						}
					}
					doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
				}
				break;
				
//			case IBLOADEXCEL:	// LOAD EXCEL
//				//sheetObj.LoadExcel(true);
//	            with (sheetObj) {
//	                if(LoadExcel(-1, 1, "", -1, -1, "", false, false, "")) {
//	                	for (var i=HeaderRows(); i<=LastRow(); i++) {
//	                		excel_upload_valid_chk(sheetObj, i);
//		                }
//	                }
//	            }				
//				break;
				
	    	case IBLOADEXCEL:	// LOAD EXCEL
//				sheetObj.LoadExcel(); // Luc Duong fixes bug: #29712 (06/30/2014)
						sheetObj.LoadExcel({Append:0,ColumnMapping:'||1|2|3|4|5|6|7',WorkSheetNo:"1"});
				break;	
				
			case SEARCH01:
				formObj.f_cmd.value=SEARCH01;
				var val=sheetObj.GetCellValue(row, col);
				var params=FormQueryString(formObj) + "&slan_cd=" + val;
				var sXml=sheetObj.GetSearchData("FINCommonGS.do", params);
				var state=ComGetEtcData(sXml, ComWebKey.Trans_Result_Key);
				if (state == 'S') {
					if(ComGetEtcData(sXml, "result") == null || ComGetEtcData(sXml, "result") == 'null'){
						ComShowCodeMessage("FIN00003", "Service Lane");
						sheetObj.SetCellValue(row, "slan_cd","",0);
						sheetObj.SelectCell(row, "slan_cd");
					}
				}
				break;
			case SEARCH03: 
				formObj.f_cmd.value=SEARCH03;
				var val=sheetObj.GetCellValue(row, col);
				var params=FormQueryString(formObj) + "&rlane_cd=" + val;
				var sXml=sheetObj.GetSearchData("FINCommonGS.do", params);
				var state=ComGetEtcData(sXml, ComWebKey.Trans_Result_Key);
				if (state == 'S') {
					if(ComGetEtcData(sXml, "result") == null || ComGetEtcData(sXml, "result") == 'null'){
						ComShowCodeMessage("FIN00003", "Revenue Lane");
						sheetObj.SetCellValue(row, "slan_cd","",0);
						sheetObj.SetCellValue(row, "rlane_cd","",0);
						sheetObj.SelectCell(row, "rlane_cd");
					} else {
						sheetObj.SetCellValue(row, "slan_cd",sheetObj.GetCellValue(row, "rlane_cd").substring(0,3),0);
					}
				}
				break;
			case SEARCH04: 
				formObj.f_cmd.value=SEARCH04;
				var val=sheetObj.GetCellValue(row, col);
				var params=FormQueryString(formObj) + "&vsl_cd=" + val;
				var sXml=sheetObj.GetSearchData("FINCommonGS.do", params);
				var state=ComGetEtcData(sXml, ComWebKey.Trans_Result_Key);
				if (state == 'S') {
					if(ComGetEtcData(sXml, "result") == null || ComGetEtcData(sXml, "result") == 'null'){
						ComShowCodeMessage("FIN00003", "Vessel Code");
						sheetObj.SetCellValue(row, "vsl_cd","",0);
						sheetObj.SelectCell(row, "vsl_cd");
					}
				}
				break;
			case SEARCH05: 
				formObj.f_cmd.value=SEARCH05;
				var val=sheetObj.GetCellValue(row, col);
				var params=FormQueryString(formObj) + "&rev_port_cd=" + val;
				var sXml=sheetObj.GetSearchData("FINCommonGS.do", params);
				var state=ComGetEtcData(sXml, ComWebKey.Trans_Result_Key);
				if (state == 'S') {
					if(ComGetEtcData(sXml, "result") == null || ComGetEtcData(sXml, "result") == 'null'){
						ComShowCodeMessage("FIN00003", "Revenue Port Code");
						sheetObj.SetCellValue(row, "rev_port_cd","",0);
						sheetObj.SelectCell(row, "rev_port_cd");
					}
				}
				break;
			/*case SEARCH06: 
				formObj.f_cmd.value=SEARCH06;
var val=sheetObj.GetCellValue(row, col);
				var params=FormQueryString(formObj) + "&" + sheetObj.GetSaveString();
//parameter changed[check again]CLT 				var sXml=sheetObj.GetSearchData("FINCommonGS.do", params);
				var state=ComGetEtcData(sXml, ComWebKey.Trans_Result_Key);
				if (state == 'S') {
					if(ComGetEtcData(sXml, "result") == null || ComGetEtcData(sXml, "result") == 'null'){
						ComShowCodeMessage("FIN00003", "Revenue VVD data");
						//sheetObj.CellValue2(row, "slan_cd") = "";
						sheetObj.SelectCell(row, "rev_port_cd");
					}
				}
				break;*/
		}
	}
	/**
	 * Removing IBSheet Row
	 **/
	function rowRemove(sheetObj){
		ComRowHideDelete(sheetObj, "DelChk");
	}
	/**
	 * Loading the event of HTML control in the page dynamically. <br>
	 **/
	function initControl(){
		DATE_SEPARATOR="-";
		// handling the occurring beforedeactivate event to the all fields
		axon_event.addListenerForm  ('beforedeactivate', 'obj_deactivate', form);
		// handling the occurring beforeactivate event to the all fields that contain dataformat attribute
		axon_event.addListenerFormat('beforeactivate'  , 'obj_activate'  , form); 	
		// handling the occurring keypress event to the all fields that contain dataformat attribute
		axon_event.addListenerFormat('keypress'        , 'obj_keypress'  , form); 	 
		// Allowed to input alphabet and number only in case of inputting Revenue Lane Code
		//axon_event.addListener('keypress', 'engnum_keypress' , 's_slan_cd', 's_rlane_cd');	
		axon_event.addListener('keydown', 'ComKeyEnter', 'form');
	}
	/**
	 * Checking the validation in case of occuring blur event in HTML control <br>
	 **/
	function obj_deactivate(){
		//if (event.srcElement.getAttribute("required") != null) return;
		switch(event.srcElement.name){
			//case "s_sys_div_cd":
				//ComChkObjValid(event.srcElement);
			//break;
			case "s_eff_yrmon":
				ComChkObjValid(event.srcElement);
				break;
			default:
				//ComAddSeparator(event.srcElement);
				ComChkObjValid(event.srcElement);
		}
	}
	/**
	 * Removing the delimiter in case of occurring focus event in HTML control <br>
	 **/
	function obj_activate(){
		ComClearSeparator(event.srcElement);
	}
	/**
     * Converting the inputted the alphabet to uppercase in case of occurring keypress event in HTML control <br>
     **/
    function eng_keypress() {
        ComKeyOnlyAlphabet('upper');
    }
    /**
     * Converting the inputted the alphabet to uppercase and allow to input alphabet and number only in case of occurring keypress event in HTML control
     **/
    function engnum_keypress() {
        ComKeyOnlyAlphabet('uppernum');
    }
	/**
	 * Calling this function after finishing to retrieve sheet1
	 **/
	function sheet1_OnSearchEnd(sheetObj, ErrMsg){
		if(sheetObj.RowCount()== 0) return;
        // the value of searching keyword
		var searchKeyWord="";
		// the value of searching item
		var searchKeyField="";
		// Revenue Lane Code - searching keyword
		var searchRlaneCd=form.s_rlane_cd.value;
		// Service Lane Code - searching keyword
		var searchSlaneCd=form.s_slan_cd.value;
		// Delete Flag
		var searchDeltFlg=form.s_delt_flg.options[form.s_delt_flg.selectedIndex].value;
		if(searchRlaneCd != "" && searchSlaneCd != "") {
			searchKeyWord=searchRlaneCd; 
			searchKeyField="rlane_cd";
		} else if(searchRlaneCd == "" && searchSlaneCd != "") {
			searchKeyWord=searchSlaneCd; 
			searchKeyField="slan_cd";
		} else if(searchRlaneCd != "" && searchSlaneCd == "") {
			searchKeyWord=searchRlaneCd; 
			searchKeyField="rlane_cd";
		}
		//Not showing the data in page that is not a keyword or is that the delete flag is 'Y' when retrieving
		for (var ir=1; ir<=sheetObj.LastRow(); ir++){
			/*
			if(searchKeyWord != "") {
				if(sheetObj.GetCellValue(ir, searchKeyField) != searchKeyWord) {
					sheetObj.SetRowHidden(ir,1);
				}
			}
			if(searchDeltFlg == "N") {
				if(sheetObj.GetCellValue(ir, "delt_flg") == "Y") {
					sheetObj.SetRowHidden(ir,1);
				}
			} else if(searchDeltFlg == "Y") {
				if(sheetObj.GetCellValue(ir, "delt_flg") == "N") {
					sheetObj.SetRowHidden(ir,1);
				}
			}
			*/
			sheetObj.SetCellEditable(ir, "rlane_cd",0);
		}
//		ComColFontName(sheetObj, "2"); 
//     	ComColFontName(sheetObj, "7");
	}
	
	function sheet1_OnLoadExcel(sheetObj, result, code, msg){
	    if(isExceedMaxRow(msg))return;   
	} 
	
	/**
	 * handling process for input validation <br>
	 **/
	function validateFormImsi(sheetObj,formObj,sAction){
		if(sAction == 0){
			if (!ComChkValid(formObj)) return false;
		} else {
			var dupRow=0;
			for(var ir=1; ir<=sheetObj.LastRow(); ir++){
				if(sheetObj.GetRowStatus(ir) == "D")
					continue; 
				if(sheetObj.GetCellValue(ir,"rlane_cd") == ""){
					ComShowCodeMessage("FIN00001", "Revenue Lane");
					sheetObj.SelectCell(ir,"rlane_cd");
					return false;
				} else if(sheetObj.GetCellValue(ir,"zn_ioc_cd") == ""){
					ComShowCodeMessage("FIN00001", "Zone IOC Code");
					sheetObj.SelectCell(ir,"zn_ioc_cd");
					return false;
				} else if(sheetObj.GetCellValue(ir,"slan_cd") == ""){
					ComShowCodeMessage("FIN00001", "Service Lane");
					sheetObj.SelectCell(ir,"slan_cd");
					return false;
				} 
				// Checking whether Revenue Lane Code and Zn Ioc Code are duplicated or not
				dupRow=sheetObj.ColValueDup("rlane_cd|zn_ioc_cd");
				if(dupRow > 0) {
					ComShowCodeMessage("FIN00004", "Revenue Lane / Zone IOC Code");
					sheetObj.SelectCell(dupRow, "rlane_cd");
					return false; 
				}
				if(form.change_flg.value == "Y") {
					if(sheetObj.GetRowStatus(ir) != "D"){
						sheetObj.SetRowStatus(ir,"I");
					}
				}
			}
			//if(!checkDupRlaneZnIocCd(sheetObj)) return false;
		}
		return true;
	}
	/**
     * Calling this function in case of changing the cell value in sheet
     **/
	function sheet1_OnChange(sheetObj, row, col, val) {
		var formObject=document.form;
		var col_save_name=sheetObj.ColSaveName(col);
		
	    // 대문자처리
		if(col_save_name=="rlane_cd"||col_save_name=="zn_ioc_cd"){
			sheetObj.SetCellValue(row, col, val.toUpperCase(),0);
		}
		
		if(sheetObj.ColSaveName(col) == "DelChk") {
			if(sheetObj.GetRowStatus(row) != "I") {
				sheetObj.SetRowStatus(row,"U");
			}
		} else if(sheetObj.ColSaveName(col) == "slan_cd" && sheetObj.GetCellValue(row, "slan_cd") != "") {
			doActionIBSheet(sheetObj, document.form, SEARCH01, row, col);
		} else if(sheetObj.ColSaveName(col) == "rlane_cd" && sheetObj.GetCellValue(row, "rlane_cd") != "") {
			doActionIBSheet(sheetObj, document.form, SEARCH03, row, col);
		}
	}
	/**
	 * Checking whether Rlane Code and Zn Ioc Code are duplicated in AR Route Rank or not
	 **/
	function checkDupRlaneZnIocCd(sheetObj) {
		dupRow=sheetObj.ColValueDup("rlane_cd|zn_ioc_cd", false);
		if(dupRow > 0) {
			ComShowCodeMessage("FIN00004", "Revenue Lane / Zone IOC Code");
			sheetObj.SelectCell(dupRow, "rlane_cd");
			return false; 
		}
		/*
		var row1="";
		var row2="";
		for (var ir=1; ir<=sheetObj.LastRow(); ir++){
if(sheetObj.GetRowStatus(ir) == "D")
				continue; 
row1=sheetObj.GetCellValue(ir, "rlane_cd") + sheetObj.GetCellValue(ir, "zn_ioc_cd");
			for(var j=ir+1; j<=sheetObj.LastRow(); j++) {
row2=sheetObj.GetCellValue(j, "rlane_cd") + sheetObj.GetCellValue(j, "zn_ioc_cd")
if(sheetObj.GetCellValue(j, "ibflag") == "D") {
					continue;
				}
				if(row1.trim() == row2.trim()) {
					ComShowCodeMessage("FIN00004", "Revenue Lane / Zone IOC Code");
					sheetObj.SelectCell(j, "rlane_cd");
					return false; 
				}
			}
		}*/
		return true;
	}
	
	function s_slan_cd_OnCheckClick(comboObj, index, code) {
	    if (code == "" || code == "All") {
	        var bChk=comboObj.GetItemCheck(index);
	        for(var i=1 ; i < comboObj.GetItemCount() ; i++) {
	            comboObj.SetItemCheck(i,bChk);
	        }
	    }else{
	        //comboObj.SetItemCheck(0,0);
	    }
	    comboObj.ValidChar(2,1);//영어대문자,숫자포함 도움말 ValidChar 참고
	}
	
	function s_rlane_cd_OnCheckClick(comboObj, index, code) {
	    if (code == "" || code == "All") {
	        var bChk=comboObj.GetItemCheck(index);
	        for(var i=1 ; i < comboObj.GetItemCount() ; i++) {
	            comboObj.SetItemCheck(i,bChk);
	        }
	    }else{
	        //comboObj.SetItemCheck(0,0);
	    }
	    comboObj.ValidChar(2,1);//영어대문자,숫자포함 도움말 ValidChar 참고
	}
	
	/**
	 * Checking whether the new data and deleted one are existed or not
	 **/
	function setChangeStatus(sheetObj) {
		var changeFlag="N";
		for(var ir=1; ir<=sheetObj.LastRow(); ir++){
if(   sheetObj.GetCellValue(ir,"ibflag") == "I"
|| sheetObj.GetCellValue(ir,"ibflag") == "D"){
				changeFlag="Y";
				break;
			}
		}
		if(changeFlag == "Y") {
			for(var ir=1; ir<=sheetObj.LastRow(); ir++){
if(sheetObj.GetCellValue(ir,"ibflag") != "D"){
					sheetObj.SetCellValue(ir,"ibflag","I");
				}
			}
		}
	}
	/**
	 * 
	 **/
	/*
	function sheet1_OnValidation(sheetObj,row,col,value) {
		 //if(form.change_flg.value == "Y") {
			//if(sheetObj.RowStatus(row) != "D"){
				//sheetObj.RowStatus(row) = "I";
			//}
		//}
if(sheetObj.GetRowStatus(row) == "I" || sheetObj.GetRowStatus(row) == "U") {
			if(sheetObj.ColSaveName(col)== "rlane_cd"){
if(sheetObj.GetCellValue(row, "rlane_cd") == "") {
					ComShowCodeMessage("FIN00001", "Revenue Lane Code");
					sheetObj.ValidateFail(true);
					sheetObj.SelectCell(row,"rlane_cd");
					return false;
				}
			} else if(sheetObj.ColSaveName(col)== "zn_ioc_cd"){
if(sheetObj.GetCellValue(row, "zn_ioc_cd") == "") {
					ComShowCodeMessage("FIN00001", "Zn Ioc Code");
					sheetObj.ValidateFail(true);
					sheetObj.SelectCell(row,"zn_ioc_cd");
					return false;
				}
			} else if(sheetObj.ColSaveName(col)== "slan_cd"){
if(sheetObj.GetCellValue(row, "slan_cd") == "") {
					ComShowCodeMessage("FIN00001", "Service Lane Code");
					sheetObj.ValidateFail(true);
					sheetObj.SelectCell(row,"slan_cd");
					return false;
				}
			}
		}
	}
	*/
	/**
	 * handling process for input validation
	 **/
	function validateForm(sheetObj) {
		for(var ir=1; ir<=sheetObj.LastRow(); ir++){
			if(sheetObj.GetRowStatus(ir) == "D")
				continue; 
			if(sheetObj.GetCellValue(ir,"rlane_cd") == ""){
				ComShowCodeMessage("FIN00001", "Revenue Lane");
				sheetObj.SelectCell(ir,"rlane_cd");
				return false;
			} else if(sheetObj.GetCellValue(ir,"zn_ioc_cd") == ""){	
				ComShowCodeMessage("FIN00001", "Zone IOC Code");
				sheetObj.SelectCell(ir,"zn_ioc_cd");
				return false;
			} else if(sheetObj.GetCellValue(ir,"slan_cd") == ""){
				ComShowCodeMessage("FIN00001", "Service Lane Code");
				sheetObj.SelectCell(ir,"slan_cd");
				return false;
			}
		}
		return true;
	}
	/**
	 * Excel Load data Valid check
	 **/
	function excel_upload_valid_chk(sheetObj,Row){
		if(sheetObj.GetCellValue(Row, "rlane_cd") != "") {
		    doActionIBSheet(sheetObj, document.form, SEARCH03, Row, "rlane_cd");
	    }
if(sheetObj.GetCellValue(Row, "zn_ioc_cd") != "") {
	var zniocCode=sheetObj.GetCellValue(Row, "zn_ioc_cd");
		if(zniocCode.length != 3){
			ComShowCodeMessage("FIN00003", "Zone IOC Code");
		}    		    
	}
        return true;
	}
