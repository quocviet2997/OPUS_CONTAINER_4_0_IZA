/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_FIN_0001.js
*@FileTitle  : AP PERIOD
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
     * @class AP PERIOD : business script for AP PERIOD 
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
    var retrieveFlg=0;   
    var ofclist=new Array();
    // Event handler processing by button click event */
    document.onclick=processButtonClick;
    // Event handler processing by button name */
    function processButtonClick(){
    	var sheetObject=sheetObjects[0];
        var formObject=document.form;
    	try {
    		var srcName=ComGetEvent("name");
            switch(srcName) {
                case "btn_retrieve":
                	doActionIBSheet(sheetObject,formObject,IBSEARCH);
                    break;
				case "btn_new":
					retrieveFlg = 0;
					ComResetAll(); 
					doActionIBSheet(sheetObject, formObject, COMMAND01);
                    break;
				case "btn_save":
					if(sheetObject.RowCount() < 1){//no data					
						ComShowCodeMessage("COM130104");
					}else{
						if (retrieveFlg == 1) {
							doActionIBSheet(sheetObject,formObject,IBSAVE);
						}
					}
                    break;
				case "btn_loadExcel":
					//doActionIBSheet(sheetObject,formObject,IBLOADEXCEL);
					sheetObjects[0].LoadExcel();
                    break;
				case "btn_downExcel":
					if(sheetObjects[0].RowCount() < 1){//no data
						ComShowCodeMessage("COM132501");
					}else{
						sheetObjects[0].Down2Excel({ HiddenColumn:-1,Merge:true,TreeLevel:false,DownCols:'3|4|5|6|7|8|9'});
					}
					
					break; 
				case "btn_add": 
					if (retrieveFlg == 1) {
						var row=sheetObject.DataInsert(-1);
					} else {
						ComShowCodeMessage("FIN00011");
					}
                    break;
				case "btn_del":
					if (retrieveFlg == 1&& sheetObject.RowCount()> 0) {
						rowRemove(sheetObject);
					} 
                    break;
				case "eff_yrmon_cal":
					var cal=new ComCalendar();
					cal.setDisplayType('month');
					cal.select(form.s_eff_yrmon, 'yyyy-MM');
                    break;
				case "btn_opennextmonth":
					doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC01);
                    break;
                    
				case "btn_allopen":
					changeCloseStatus("O");
                    break;
                    
				case "btn_allclose":
					changeCloseStatus("C");
                    break;
            } // end switch
    	}catch(e) {
    		if( e == "[object Error]") {
    			ComShowMessage(OBJECT_ERROR);
    		} else {
    			ComShowMessage(e);
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
        	ComConfigSheet (sheetObjects[i]);
            initSheet(sheetObjects[i],i+1);
            ComEndConfigSheet(sheetObjects[i]);
        }

        for(k=0;k<tabObjects.length;k++){
            initTab(tabObjects[k],k+1);
        }
        for(var k=0; k<comboObjects.length; k++){
			initCombo(comboObjects[k],k+1);
		}
        initControl();   
        
        var sheetObject=sheetObjects[0];
        doActionIBSheet(sheetObject, document.form, COMMAND01);
	    
	    ComSetObjValue(s_sys_div_cd,  " ");
    }
    /**
	 * Combo Setting default
	 * @param	{IBMultiCombo}	combo_obj.
	 * @param	{Number}	comboNo		Sequence number from combo object tag id
	 */
	function initCombo (comboObj, comboNo) {
	    var formObject=document.form
	    switch(comboObj.options.id) {
	    
   			case "s_ofc_cd":
   				with (comboObj) {
   				ValidChar(2);
   				}
   				break;	
    
		   default :
	           with (comboObj) {
				   SetTitle("Code|Desc");
			   	   SetTitleVisible(true);
			   	   SetColAlign(0, "left");
			   	   SetColAlign(1, "left");
			   	   SetColWidth(0, "50");
			   	   SetColWidth(1, "150");
				   SetDropHeight(160);
		       }
           break;
	     }
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
            	      var HeadTitle="|Seq|Del|System Code|Effective Date|Office Code|Payable Division|Closing Status|System Desc|RHQ Office Code";

            	      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );

            	      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
            	      var headers = [ { Text:HeadTitle, Align:"Center"} ];
            	      InitHeaders(headers, info);

            	      var cols = [ {Type:"Status",     Hidden:1,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
            	                   {Type:"Text",       Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"Seq" },
            	                   {Type:"DummyCheck", Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
            	                 //{Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"sys_div_cd",    KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:2, AcceptKeys:"N" },
            	                   {Type:"Combo", 	   Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:"sys_div_cd",    KeyField:1,   CalcLogic:"",   Format:"",	   		   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:2 },
            	                   {Type:"PopupEdit",  Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"eff_yrmon",     KeyField:1,   CalcLogic:"",   Format:"Ym",          PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:6 },
            	                   {Type:"Combo",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",        KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:5, AcceptKeys:"E" ,InputCaseSensitive: 1 },
            	                   {Type:"Combo",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"ar_ap_div_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20 },
            	                   {Type:"Combo",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"clz_sts_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20 },
            	                   {Type:"Text",       Hidden:0,  Width:217,  Align:"Left",    ColMerge:0,   SaveName:"sys_desc",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
            	                   {Type:"Text",       Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"rhq_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:6 } ];
            	       
            	      InitColumns(cols);

					  SetEditable(1);
						//conversion of function[check again]CLT			InitDataValid(0, "sys_div_cd", vtEngUpOther, "0123456789");
						//conversion of function[check again]CLT			InitDataValid(0, "ofc_cd"    , vtEngUpOnly);
						//conversion of function[check again]CLT			InitDataValid(0, "rhq_cd"    , vtEngUpOther, "0123456789");
					  SetColProperty("ar_ap_div_cd", {ComboText:"AP|AR", ComboCode:"P|R"} );
		              SetColProperty("clz_sts_cd", {ComboText:"Open|Closing", ComboCode:"O|C"} );
		              ScoInitDataCombo(sheetObj, "sys_div_cd", "2", " " , " ", "PERIOD SYSTEM MODULE" , "") ;
		              ScoInitDataCombo2(sheetObj, "ofc_cd", "2", " " , " ", "" , ""); 
		            	
//		              var ofcStr=ScoGetComboItems(sheetObj, "STM_SCO_0100GS.do", SEARCH01, "", "ofc_cd_list");
//		              InitDataCombo(0, "ofc_cd", ofcStr, ofcStr);

		              InitComboNoMatchText(1,"",1);
		              resizeSheet();
    	      	}
                break;
        }
    }
    
    function resizeSheet(){
    	ComResizeSheet(sheetObjects[0]);
    }
    
    /**
     * Handling the process about the sheet <br>
     * param : sheetObj, formObj, sAction, gubun, row
     **/
    function doActionIBSheet(sheetObj,formObj,sAction,gubun,row) {
    	sheetObj.ShowDebugMsg(false);
        switch(sAction) {
	        case COMMAND01: // when form open
		    	//Condition - Period System module
		 		var comboItems = ScoGetLookupComboItems(sheetObjects[0], "PERIOD SYSTEM MODULE");
		 		ScoAddComboItem2(s_sys_div_cd, comboItems, "2", "ALL", " "); 
		 		
				var ofcStr=ScoGetComboItems(sheetObj, "STM_SCO_0100GS.do", SEARCH01, "", "ofc_cd_list");
				MakeComboObject2(s_ofc_cd, ofcStr, "N");

		 		
				break;
        	case IBSEARCH:      //Retrieving
        		if (validateForm(sheetObj,formObj,sAction)){
        			retrieveFlg = 1; 
	   	   	  		formObj.f_cmd.value=SEARCH;
	   	   	        sheetObj.SetWaitImageVisible(0);
	   	   	        ComOpenWait(true); 
					sheetObj.DoSearch("BCM_FIN_0001GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(""));
        		}
       	   	  	break;
        	case IBSAVE:        //Saving
        		//ScoInitDataCombo2(sheetObj, "ofc_cd", "2", " " , " ", "" , "");
        		if (validateForm(sheetObj,formObj,sAction)){
        			formObj.f_cmd.value=MULTI;
	    			var sParam = ComGetSaveString(sheetObj);
		        	if (sheetObj.RowCount()== 0 || (!sheetObj.IsDataModified() && sParam == "")) {
		        		ComShowCodeMessage("FIN00002");
						return; 
					}
	    			sParam = FormQueryString(formObj);
	    			ComOpenWait(true);
					sheetObj.DoSave("BCM_FIN_0001GS.do", sParam);
        		}
                break;
                
        	//case IBLOADEXCEL:	// LOAD EXCEL
			//		sheetObj.LoadExcel(); // Luc Duong fixes bug: #29712 (06/30/2014)
 			//		sheetObj.LoadExcel({Append:1,ColumnMapping:'|||2|3|4|5|6|7|8',WorkSheetNo:"1"}); // Luc Duong fixes bug: #29712 (06/30/2014)
// 	    		 if(sheetObj.RowCount() < 1){//no data
// 					  ComShowCodeMessage("COM132501");
// 					}else{
// 						sheetObj.LoadExcel({ Mode:"HeaderSkip"});
// 						sheetObj.LoadExcel({Append:1}); // Luc Duong fixes bug: #29712 (06/30/2014)
// 					}
    			break;
    			
        	case IBSEARCH_ASYNC01:      //Open Next Month
        		formObj.f_cmd.value=SEARCH01;
	        	sParam=FormQueryString(formObj);
 	        	var sXml=sheetObj.GetSearchData("BCM_FIN_0001GS.do", sParam);
	        	var maxMonth=ComGetEtcData(sXml, "max_month");
    			if (ComShowCodeConfirm("FIN00008", maxMonth)) {
    				ComResetAll();
    				formObj.s_eff_yrmon.value=ComReplaceStr(maxMonth,"/","-");
	   	   	  		formObj.f_cmd.value=MULTI01;
	   	   	  		sParam=FormQueryString(formObj);
 				    var sXml=sheetObj.GetSaveData("BCM_FIN_0001GS.do", sParam);
				    var arrXml=sXml.split("|$$|");
				    if (arrXml.length > 0) {
				    	sheetObjects[0].LoadSearchData(arrXml[0],{Sync:1} );
				    }
    			}
       	   	  	break;

        }
    }
	/**
     * Removing IBSheet Row <br>
     * param : sheetObj    IBSheet Object
     **/
	function rowRemove(sheetObj) {
		ComRowHideDelete(sheetObj, "DelChk");
	}
	/**
     * Loading the event of HTML control in the page dynamically.
     **/
	function initControl(){
		DATE_SEPARATOR="-";
		//handling the occurring keypress event to the all fields that contain dataformat attribute 
		axon_event.addListenerFormat('keypress'        , 'obj_keypress'  , form);
		//axon_event.addListenerForm('keypress', 'obj_keypress', form);
		axon_event.addListener('keydown', 'ComKeyEnter', 'form');
		//handling the occurring keypress event to s_rev_yrmon
		axon_event.addListener  ('keypress', 'num_keypress'         , 's_rev_yrmon');			
		// handling the occurring keypress event to s_vvd and s_vsl_cd
		axon_event.addListener  ('keypress', 'enguppernum_keypress' , 's_vvd', 's_vsl_cd');		
	}
    /**
     * Converting the inputted the alphabet to uppercase in case of occurring keypress event in HTML control<br>
     **/
    function eng_keypress() {
        ComKeyOnlyAlphabet('upper');
    }
     /**
      * Only allowed to input number in case of occurring keypress event in HTML control
      **/
    function engnum_keypress() {
        ComKeyOnlyAlphabet('uppernum');
    }
    /**
     * Calling this function after finishing to retrieve sheet
     **/
 	function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
 		for (var ir=1; ir<=sheetObj.LastRow(); ir++){
     		sheetObj.SetCellEditable(ir, "sys_div_cd",0);
     		sheetObj.SetCellEditable(ir, "eff_yrmon",0);
     		sheetObj.SetCellEditable(ir, "ofc_cd",0);
     		sheetObj.SetCellEditable(ir, "ar_ap_div_cd",0);
     	}
// 		ComColFontName(sheetObj, "5");
// 		ComColFontName(sheetObj, "9");
 	}
 	
 	function sheet1_OnChange(sheetObj,Row,Col, Value) { 
 		
 		if(sheetObj.ColSaveName(Col)=="ofc_cd"){ 
 			//sheetObj.SetCellValue(Row, Col, Value.toUpperCase(),0);
 			var temp =sheetObj.GetCellText(Row,"ofc_cd");
 			//temp.split("\t");
 			//console.log(ofclist);  
 			var rhqcd = "";
 			for(var i=0;i<ofclist.length;i++){
				  var ofcArr = ofclist[i].split("^");
				  if(ofcArr[0] == temp){
						rhqcd = ofcArr[1];  
						break; 
				  } 
 			}
 		    sheetObj.SetCellValue(Row, "rhq_cd",rhqcd ,0);
 		}else if(sheetObj.ColSaveName(Col)=="rhq_cd"){
 			sheetObj.SetCellValue(Row, Col, Value.toUpperCase(),0);
 		}
 	}
 	
 	/**
 	 * IBSeet내의 데이터 셀의 팝업 버튼이 눌러졌을 때 발생하는 Event<br>
 	 * @param {sheetObj} String : 해당 IBSheet셀 명
 	 * @param {Row} Long : 해당 셀의 Row Index
 	 * @param {Col} Long : 해당 셀의 Column Index
 	 */	
 	function sheet1_OnPopupClick(sheetObj, Row, Col){
 		var sheetID=sheetObj.id;
 		with (sheetObj) {
 	        switch (ColSaveName(Col)) {
 	            case  "eff_yrmon": 
 	            	var cal=new ComCalendarGrid(ColSaveName(Col));
 	            	cal.setDisplayType('month');
 	    			cal.select(sheetObj, Row, Col, 'yyyy-MM');        			
 	            	break;
 	        }
 	    }
 	}
 	
 	function sheet1_OnLoadExcel(sheetObj, result, code, msg){
        if(isExceedMaxRow(msg))return; 
 	}
 	
 	function changeCloseStatus(flag){							// 2014.8.28 ISA-1 오동현 수석님 Closing Status : All Close, All Open 286~298
 		var sheetObj = sheetObjects[0];
 		
 		if (sheetObj.RowCount() == 0) return;
 		
 		sheetObj.RenderSheet(0);
   	    ComOpenWait(true); 
		setTimeout( function () {
	 		if (flag == "O"){
	 			for (var ir = sheetObj.HeaderRows(); ir <= sheetObj.RowCount(); ir++){
	 	     		sheetObj.SetCellValue(ir, "clz_sts_cd","O", 0);
	 	     	}
	 		} else {
	 			for (var ir = sheetObj.HeaderRows(); ir <= sheetObj.RowCount(); ir++){
	 	     		sheetObj.SetCellValue(ir, "clz_sts_cd","C", 0);
	 	     	}
	 		}
			ComOpenWait(false);
	 		sheetObj.RenderSheet(1);
	    }, 100);
 	}
    /**
     * handling process for input validation <br>
     **/
    function validateForm(sheetObj,formObj,sAction) {
    	if(sAction == 0) {
    		if (!ComChkValid(formObj)) return false;
    	} else {
	    	for (var ir=1; ir<=sheetObj.LastRow(); ir++){
				if(sheetObj.GetCellValue(ir,"sys_div_cd") == "") {
					ComShowCodeMessage("FIN00001", "System Code");
					sheetObj.SelectCell(ir,"sys_div_cd");
					return false;
				} else if(sheetObj.GetCellValue(ir,"eff_yrmon") == "") {
					ComShowCodeMessage("FIN00001", "Effective Date");
					sheetObj.SelectCell(ir,"eff_yrmon");
					return false;
				} else if(sheetObj.GetCellValue(ir,"ofc_cd") == "") {
					ComShowCodeMessage("FIN00012", "Office Code");
					sheetObj.SelectCell(ir,"ofc_cd");
					return false;
				} 
			}
    	}
        return true;
    }
    
    /**
     *  <br>
     * SCO_LU_DTL 테이블의 LU_TP_CD 에 따른 정보를 리턴한다. <br>
     * jsp에서 ComComboObject() 함수 사용시 <br>
     * <br><b>Example : </b>
     * <pre>
     *     var currComboItems = ScoGetComboItems(sheetObj, "SAR_TAX_CHARGE");
				ScoAddComboItem(comboObjects[0], currComboItems, "1", "ALL", "ALL") 				
     * </pre>
     * @param sheetObj
     * @param sCondition  (SCO_LU_DTL 테이블의 LU_TP_CD ) 
     * @param param       (추가적으로 조회조건을 추가할 경우 SCO_LU_DTL 테이블의 컬럼명을 기준으로 한다. 필수는 아님.  ) 예) &attr_ctnt1=I  
     * @see ScoAddComboItem
     */   
    function ScoGetLookupComboItems(sheetObj, sCondition, param) {
    	var ROWMARK="|";
    	if (param == undefined ) param="";
     	var sXml=sheetObj.GetSearchData("STMCommonGS.do", "f_cmd=" + COMMAND01 + "&lu_tp_cd=" + sCondition + param);
    	var comboItems=ComGetEtcData(sXml, "lu_cd_list").split(ROWMARK);	
    	return comboItems;
    }
    
    /**
     *  <br>
     * ComComboObject에 item 추가  <br>
     * jsp에서 ComComboObject() 함수 사용시 <br>
     * <br><b>Example : </b>
     * <pre>
     *     var currComboItems = SapGetComboItems(sheetObj, "SAR_TAX_CHARGE");
				SapAddComboItem(comboObjects[0], currComboItems, "1", "ALL", "ALL") 				
     * </pre>
     * @param comboObj
     * @param comboItems (SapGetComboItems 에서 얻은 리턴값)
     * @param type ( 1: code, 2 : code, name )
     * @param appendStr (ALL, SELECT 등 문자열 추가시 codedesc)
     * @param appendCode (ALL, SELECT 등 문자열 추가시 추가된 code)
     * @see SapGetComboItems
     */ 	
    function ScoAddComboItem2(comboObj, comboItems, type, appendStr, appendCode) {
    	var k = 0;
    	var FIELDMARK="=";	
    	if (appendStr != "" ) { 
    		comboObj.InsertItem(0, appendStr, appendCode);
    		k = 1;
    	}
    	
    	for (var i = 0 ; i < comboItems.length ; i++) {
    		var comboItem = comboItems[i].split(FIELDMARK);
            if ( type == "1" ) {
            	comboObj.InsertItem(k, comboItem[0] , comboItem[0]);    
            } else  if ( type == "2" ) {            	
            	comboObj.InsertItem(k, comboItem[0] + "|" + comboItem[1] , comboItem[0]);    
            }
            k++;
        }        
    }  
    
    /**
     *  <br>
     * SCO_LU_DTL 테이블의 LU_TP_CD 에 따른 정보를 리턴한다. <br>
     * IBSheet의 InitDataCombo 시 이용한다. <br>
     * <br><b>Example : </b>
     * <pre>
     *     ScoInitDataCombo(sheetObj, prefix + "attr_cate_nm", "2", " " , " ", "SAR_TAX_CHARGE") ;
     * </pre>
     * @param sheetObj
     * @param ibsheet's columnName
     * @param type ( 1: code, 2 : code, name )
     * @param appendStr (ALL, SELECT 등 문자열 추가시 codedesc)
     * @param appendCode (ALL, SELECT 등 문자열 추가시 추가된 code)
     * @param sCondition  (SCO_LU_DTL 테이블의 LU_TP_CD ) 
     * @param param       (추가적으로 조회조건을 추가할 경우 SCO_LU_DTL 테이블의 컬럼명을 기준으로 한다. 필수는 아님.  ) 예) &attr_ctnt1=I 
     */   
    function ScoInitDataCombo(sheetObj, colName, type, appendStr, appendCode, sCondition, param, showCol) {
    	if (param == undefined ) param = "";
    	if (showCol == undefined ) showCol = 0;
    	var sXml = sheetObj.GetSearchData("STMCommonGS.do", "f_cmd=" + COMMAND01 + "&lu_appl_cd=SCO" + "&lu_tp_cd=" + sCondition + param);
    	
    	var combo_code = ComGetEtcData(sXml,"combo_code");
		var combo_nm = ComGetEtcData(sXml,"combo_nm");
		
		if (type == "1" )  { //코드만 
        	sheetObj.InitDataCombo(0, colName, appendStr + combo_nm, appendCode + combo_code);
        } else if (type == "2" ) {
        	appendStr = appendCode + "\t" + appendStr ;
            sheetObj.InitDataCombo(0, colName, appendStr +  combo_nm, appendStr +  combo_code, "","",showCol);
        } 
    }  
    
    function ScoInitDataCombo2(sheetObj, colName, type, appendStr, appendCode, sCondition, param, showCol) {
    	if (param == undefined ) param = "";
    	if (showCol == undefined ) showCol = 0;
   	
    	var sXml=sheetObj.GetSearchData("STM_SCO_0100GS.do", "f_cmd=" + SEARCH01);
		var sStr1=ComGetEtcData(sXml, "ofc_cd_list");
		var arrStr=sStr1.split("|");	
		ofclist = new Array();
		for (var i=1; i < arrStr.length; i++ ) {
			ofclist.push(arrStr[i]); 
    	} 
		var sStr=ComGetEtcData(sXml, "sheet_ofc_cd_list2");
		var sStrCode=ComGetEtcData(sXml, "sheet_ofc_cd_list");
		 
		if (type == "1" )  { //코드만 
        	sheetObj.InitDataCombo(0, colName, appendStr + sStrCode, appendCode + sStrCode);
        } else if (type == "2" ) {
        	appendStr = appendCode + "\t" + appendStr ;
            sheetObj.InitDataCombo(0, colName, appendStr +  sStr, appendStr +  sStrCode, "","",showCol);  
        } 
    }
    
    /**
     *  <br>
     * General Combo Return <br>
     * jsp에서 ComComboObject() 함수 사용시 <br>
     * <br><b>Example : </b>
     * <pre>
     *     var currComboItems = ScoGetComboItems(sheetObj, "SAR_TAX_CHARGE");
				ScoAddComboItem(comboObjects[0], currComboItems, "1", "ALL", "ALL") 				
     * </pre>
     * @param sheetObj
     * @param url  ex) STMCommonGS.do
     * @param fCmd ex) COMMAND01
     * @param sCondition  ("&lu_tp_cd= ?" ) 
     * @param listName    ex) lu_cd_list
     * @see ScoAddComboItem
     */   
    function ScoGetComboItems(sheetObj, url, fCmd, sCondition, listName) {
    	var sXml=sheetObj.GetSearchData(url, "f_cmd=" + fCmd + sCondition);
		var sStr=ComGetEtcData(sXml, listName);
		var arrStr=sStr.split("|");	
		return arrStr
    }
    
    function MakeComboObject2(cmbObj, arrStr, vacantRow) {
    	cmbObj.RemoveAll();
    	var cnt=0;
    	if (vacantRow == "Y") {
    		cmbObj.InsertItem(0, "", "");
    		cnt=1;
    	}
    	for (var i=1; i < arrStr.length; i++ ) {
    		var arrStr2=arrStr[i].split("^");
    		var code=arrStr2[0];
    		cmbObj.InsertItem(cnt, code + "|" + arrStr2[1] , code);
    		cnt++;
    	}
    	cmbObj.SetDropHeight(190);
    }

    function sheet1_OnSearchEnd(sheetObj, code, ErrMsg) {
		ComOpenWait(false);    
		if (ErrMsg != '') { 
			return;
		}
    }	
    
    function sheet1_OnSaveEnd(sheetObj, code, ErrMsg){
    	 ComOpenWait(false);   
		 if (ErrMsg == '') {
			 ComShowCodeMessage("FIN00006");
			 doActionIBSheet(sheetObj, document.form, IBSEARCH);
		 }  
    }