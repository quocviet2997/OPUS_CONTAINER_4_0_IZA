/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0041.js
*@FileTitle  : Office Access Group Mapping
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/02
=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
			   MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
			   OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
    /** Common global variable */
	var sheetObjects=new Array();
	var sheetCnt=0;
	var comboObjects=new Array();
	var comboCnt=0;
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
			switch (srcName) {
				case "btn_save": //저장
					doActionIBSheet(sheetObject1,	formObject,	IBSAVE);
					break;
				case "btn_retrieve": //조회
					doActionIBSheet(sheetObject1, formObject, SEARCH01);
					break;
				case "btn_new": //clear
					doActionIBSheet(sheetObject1,	formObject,	IBCLEAR);
					break;
				case "btn_rowadd": //row 추가 
	                doActionIBSheet(sheetObject1, formObject,	IBINSERT);
					break;
				case "btn_rowdelete": //row 삭제
					doActionIBSheet(sheetObject1, formObject, MODIFY01);					
					break;		
                case "btn_close":  //close
                	ComClosePopup(); 
        	        break;	
			} // end switch
		} catch (e) {
			if (e == "[object Error]") {
				ComShowMessage(OBJECT_ERROR);
			} else {
				ComShowMessage(e.message);
			}
		}
	}
 /**
   * handling sheet process <br>
   * <br><b>Example :</b>
   * <pre>
   *     doActionIBSheet(sheetObj, document.form, IBSEARCH)
   * </pre>			 
   * 
   * @param {ibsheet} sheetObj 필수 IBSheet Object
   * @param {form} formObj 필수 html form object
   * @param {int} sAction 필수 프로세스 플래그 상수
   * @return 없음
   * @author 서미진
   * @version 2010.10.13
   */
 	function doActionIBSheet(sheetObj, formObj, sAction) {
	   try {
	 		switch (sAction) {																		
		 		case SEARCH01: // Office Code 조회	 	
		 			ComOpenWait(true);
		 			formObj.f_cmd.value=SEARCH01;	
 		 			var sXml=sheetObj.GetSearchData("BCM_CCD_0042GS.do", FormQueryString(formObj));
		 			sheetObj.LoadSearchData(sXml,{Sync:1} );
	 		 		break;		 				 		
		 		case IBCLEAR:      // 초기화 
		 			sheetObj.RemoveAll();
	 		 		break;	
		 		case IBINSERT: // Row Add
		 			with (sheetObjects[0]) {
		 				var lastRow= sheetObj.DataInsert(-1);
		                SetCellValue(lastRow, "sub_sys_cd",document.form.sub_sys_cd.value);
		                SetCellValue(lastRow, "ofc_grp_id",document.form.ofc_grp_id.value);
		 			}
	 		 		break;			 		
		 		case IBSAVE: // 저장
		 			if (!validateForm(sheetObj,document.form,sAction)) {
						return false;
					}
                    var sParamSheet1=sheetObjects[0].GetSaveString(true);
					if (sheetObjects[0].IsDataModified()&& sParamSheet1 == "") {
					    return;
					}	
					//저장 확인 메세지
					if (!ComShowCodeConfirm("COM130101", "Data")) {
					    return false;
					}			
		 			formObj.f_cmd.value=MULTI;	
		 			var sParam=sheetObj.GetSaveString(false, true);
		 			sParam += "&f_cmd=" + formObj.f_cmd.value;   
 		 			var sXml=sheetObj.GetSaveData("BCM_CCD_0042GS.do", sParam);
		 			var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
			     	   if(sav != "F" ){
			     		  ComShowCodeMessage("COM130102", "Data");
			     		  doActionIBSheet(sheetObjects[0], document.form, SEARCH01);
			       	   }else{
				       		  ComShowCodeMessage("COM130103", "Data");
			       	   }
 		 			sheetObj.LoadSaveData(sXml);
	 		 		break;	
		 		case MODIFY01: // Row Delete 		
 	        	   for(var i=1; i<sheetObj.RowCount()+1 ;i++){
 	        		   if(sheetObj.GetRowStatus(i) =="D"){
 	        			   sheetObj.SetRowHidden(i,1);
 	        		   }
 	        	   }
			 	   break; 
	 		}
		}catch(e){
			if (e == "[object Error]") {
				ComShowMessage(OBJECT_ERROR);
			} else {
				ComShowMessage(e.message);
			}
		}finally {
			 ComOpenWait(false);
		}
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
     	case "sheet1":
	     	    with(sheetObj){
		          var HeadTitle="ibflag|Del|Seq|Office Code|||";
		          var headCount=ComCountHeadTitle(HeadTitle);
		
		          SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );
		
		          var info    = { Sort:0, ColMove:1, HeaderCheck:1, ColResize:1 };
		          var headers = [ { Text:HeadTitle, Align:"Center"} ];
		          InitHeaders(headers, info);
		
		          var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
		                 {Type:"DelCheck",  Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"del" },
		                 {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"seq" },
		                 {Type:"PopupEdit", Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",      KeyField:1,   CalcLogic:"",   Format:"",  PointCount:0,   UpdateEdit:1,   InsertEdit:1 ,AcceptKeys:"E",InputCaseSensitive:1},
		                 {Type:"Text",      Hidden:1, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"sub_sys_cd" },
		                 {Type:"Text",      Hidden:1, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ofc_grp_id" },
		                 {Type:"Text",      Hidden:1, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cur_ofc_cd" } ];
		           
		          InitColumns(cols);
		          SetSheetHeight(300);
	     	}
     	    break;
     	}
	}
	/**
	 * initializing sheet
	 * implementing onLoad event handler in body tag
	 * adding first-served functions after loading screen.
	 */
	function loadPage() {
        var formObj=document.form;
		for (i=0; i < sheetObjects.length; i++) {
			ComConfigSheet(sheetObjects[i]);
			initSheet(sheetObjects[i], i + 1);
			ComEndConfigSheet(sheetObjects[i]);	
		}		
        if (formObj.sub_sys_cd.value != "" && formObj.ofc_grp_id.value != "") { //BCM_CCD_0041화면에서 호출
    		doActionIBSheet(sheetObjects[0], formObj, SEARCH01);
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
	function setComboObject(combo_obj){
		comboObjects[comboCnt++]=combo_obj;
	}
	/**
	 * OnPopupClick 이벤트 발생시 호출되는 function <br>
	 * <br><b>Example :</b>
	 * <pre>
	 *
	 * </pre>
	 * @param {ibsheet} sheetObj 필수 IBSheet Object
	 * @param {int} Row 필수 OnClick 이벤트가 발생한 해당 셀의 Row Index
	 * @param {int} Col 필수 OnClick 이벤트가 발생한 해당 셀의 Column Index 변경된 값
	 * @param {str} Value 필수 Format이 적용되지 않은 저장 시 사용되는 값
	 * @return 없음
	  * @author 서미진
	  * @version 2011.02.21
	 */
	 function sheet1_OnPopupClick(sheetObj, Row, Col, Value) {
		var colname=sheetObj.ColSaveName(Col);
	  	switch(colname)
	  		{
		    	case "ofc_cd":
		    		var dispaly="0,1,1,1,1,1,1,1,1,1";    // Row PopUp
		    		var classId="COM_ENS_071";
		     	    var sheet="1";
		     	    var param='?sheet='+sheet+'&classId='+classId;
		  			ComOpenPopup('COM_ENS_071.do' + param, 700, 500, 'getCOM_ENS_071', dispaly, true, false);  
					break;
	  		}
	 }	
    /**
     * COM_ENS_071 : 팝업에서 Check로 멀티 선택을 한경우 한 row에 한개씩 입력
     * @author 서미진
	 * @version 2011.02.21
     */
    function getCOM_ENS_071(rowArray, row, col) {
    	var sheetObj=sheetObjects[0];
	    var arrayLen=rowArray.length;
	    var cellVal="";
	    var colArray;
	    for(var i=0; i<arrayLen; i++){
	        colArray=rowArray[i];
		    cellVal=cellVal + colArray[3] + ",";		  
		}
		cellVal=cellVal.substr(0, cellVal.length -1);
	    var arrText=cellVal.split(",");
	    for(var i=0; i<arrText.length; i++){
	    	//sheet1.SetCellValue(1,3,arrText[i]);
	    	sheetObj.SetCellValue(sheetObj.GetSelectRow(), "ofc_cd", arrText[i], false);
	    	if(i !=arrText.length-1){
	    		doActionIBSheet(sheetObjects[0], document.form,	IBINSERT);    
	    	}
	    }	
    }	 
    /**
     * handling process for input validation <br>
     */
 	function validateForm(sheetObj, formObj, sAction) {
    	 switch (sAction) {				
		    case IBSAVE: // Save		    	 
	            //Office Code duplicate check
 		        sheetObj.SpaceDupCheck=false;           
	            var dupRow=sheetObj.ColValueDup("ofc_cd",false);
	            if (dupRow>0){
	            	sheetObj.SetSelectRow(dupRow);
	                ComShowCodeMessage("COM12115","Office Code");
	                ComSetFocus(sheetObj.ColValueDupRows("ofc_cd"));	
	                return false;
	            }	  
	             //Make sure to store the data
            	if(!sheetObjects[0].IsDataModified()){
	                 ComShowCodeMessage('COM130503'); 
	                 return false;
            	 }	            	
		    	 break;	    	 
    	 }
 		return true;
 	}
/**
 * OnChange 이벤트 발생시 호출되는 function <br>
 */  	
	  function sheet1_OnChange(sheetObj, Row, Col, Value){
	  	var formObject=document.form;
	   	var colname=sheetObj.ColSaveName(Col);
	   	switch(colname)
	   	{
	    	case "ofc_cd":
	    		if (Value.length>0){ 
          			formObject.f_cmd.value=SEARCH02;
		 			var sParam="f_cmd="       +formObject.f_cmd.value
		 						+ "&hidden_ofc_cd=" +sheetObj.GetCellvalue(Row,Col);
 		 			var sXml=sheetObj.GetSearchData("BCM_CCD_0042GS.do", sParam);
		 			var hidden_ofc_cd=ComGetEtcDatRa(sXml, "result");
    		        if(hidden_ofc_cd == ""){
    		        	ComShowCodeMessage("COM130402", "Office Code"); 		
    		        	sheetObj.SetCellValue(Row,"ofc_cd","",0);
    		        }
          		}
	    	break; 	    		
	   	}	
   } 	
	  
  function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) { 
    	ComOpenWait(false);
    }
