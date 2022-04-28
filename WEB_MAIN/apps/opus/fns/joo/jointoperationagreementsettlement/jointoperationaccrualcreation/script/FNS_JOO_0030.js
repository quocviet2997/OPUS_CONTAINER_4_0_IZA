/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : fns_joo_0030.js
 *@FileTitle: Estimate Closing
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
 * @class ui_joo_0030 : business script for ui_joo_0030
 */
    function fns_joo_0030() {
    	this.processButtonClick=tprocessButtonClick;
    	this.setSheetObject=setSheetObject;
    	this.loadPage=loadPage;
    	this.initSheet=initSheet;
    	this.initControl=initControl;
    	this.doActionIBSheet=doActionIBSheet;
    	this.setTabObject=setTabObject;
    	this.validateForm=validateForm; 
    }
    var sheetObjects=new Array();
    var sheetCnt=0;
    var prefix="sheet1_";
    // Event handler processing by button click event */
    document.onclick=processButtonClick;
  	function setDate(){
 		var today=new Date();
 		var y=today.getFullYear().toString();
 		document.form.estm_clz_yr.value=y;
 	}
    /*
     * loading HTML Control event <br>
     * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
     * @param {ibsheet} sheetObj    IBSheet Object
     * @param {int}     sheetNo     sequence number in sheetObjects array
     */
    function initControl() {
    	//** Date Separator **/
    	DATE_SEPARATOR="/";
    	var formObject=document.form; 
    	setDate();
    	//handling Axon event. event catch
    	axon_event.addListener  ('keypress', 'estm_clz_yr_keypress' , 'estm_clz_yr');
        axon_event.addListener  ('blur'  ,  'estm_clz_yr_onblur', 'estm_clz_yr');
     }
    // Event handler processing by button name */
    function processButtonClick() {
    	/***** setting sheet object *****/
    	var sheetObject1=sheetObjects[0];
    	/*******************************************************/
    	var formObject=document.form;
    	try {
    		var srcName=ComGetEvent("name");
    		switch (srcName) { 
			 case "btns_back_yr":
                 if(document.form.estm_clz_yr.value == null || document.form.estm_clz_yr.value == ""){
                	 ComShowCodeMessage('JOO00116', 'Estimated Closing Year'); 
                	 return;
                 }
                 document.form.estm_clz_yr.value=parseInt(document.form.estm_clz_yr.value)-1;
                 doActionIBSheet(sheetObject1, formObject, IBSEARCH);
                 break;
			 case "btns_next_yr":
                 if(document.form.estm_clz_yr.value == null || document.form.estm_clz_yr.value == ""){
                	 ComShowCodeMessage('JOO00116', 'Estimated Closing Year'); 
                	 return;
                 }
                 document.form.estm_clz_yr.value=parseInt(document.form.estm_clz_yr.value)+1;
                 doActionIBSheet(sheetObject1, formObject, IBSEARCH);
                 break;
    		case "btn_retrieve":
    			doActionIBSheet(sheetObject1, formObject, IBSEARCH);
    			break;
    		case "btn_new":
    			sheetObject1.RemoveAll();
    			formObject.estm_clz_yr.focus();
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
             ComConfigSheet (sheetObjects[i] );
             initSheet(sheetObjects[i],i+1);
             ComEndConfigSheet(sheetObjects[i]);
         }
 		document.form.estm_clz_yr.focus();
 		initControl();
     }
    /**
     * setting sheet initial values and header
     * param : sheetObj, sheetNo
     * adding case as numbers of counting sheets
     */
    function initSheet(sheetObj, sheetNo) {
    	var cnt=0;
    	switch (sheetNo) {
    	case 1: 
    		with (sheetObj) {
            
//            (7, 0, 0, true);
	            var HeadTitle="|Month|Closing|Closing Date|Closing User ID|Remark";	
	            SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );	
	            var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	            var headers = [ { Text:HeadTitle, Align:"Center"} ];
	            InitHeaders(headers, info);
	
	            var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"ibflag" },
	                {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix+"estm_clz_mon", KeyField:0,   CalcLogic:"",   Format:"", PointCount:0,   UpdateEdit:0 },
	                {Type:"CheckBox",  Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix+"estm_clz_flg", KeyField:0,   CalcLogic:"",   Format:"", TrueValue:"Y", FalseValue:"N" },
	                {Type:"Text",      Hidden:0,  Width:140,  Align:"Center",  ColMerge:1,   SaveName:prefix+"estm_clz_dt",  KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:0 },
	                {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_usr_id",   KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:7 },
	                {Type:"Text",      Hidden:0,  Width:160,  Align:"Left",    ColMerge:1,   SaveName:prefix+"estm_rmk",     KeyField:0,   CalcLogic:"",   Format:"",     PointCount:99 },
	                {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:1,   SaveName:prefix+"estm_clz_yr",  KeyField:0,   CalcLogic:"",   Format:"",        PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
	             
	            InitColumns(cols);
	            SetEditable(1);
	            SetColProperty(prefix+"estm_clz_dt", {Format:"####-##-## ##:##:##"} );
//	            SetSheetHeight(520);
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
     			sheetObj.DoSearch("FNS_JOO_0030GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix) );
    		}
    		break;
    	case IBSAVE: //save 
    		if (validateForm(sheetObj, formObj, sAction)){ 
    			var SaveStr=ComGetSaveString(sheetObjects);
    			if (SaveStr == ""){
    				ComShowCodeMessage("JOO00036");
    				return;
    			}
                sheetObj.SetWaitImageVisible(0);
                ComOpenWait(true); 
    			formObj.f_cmd.value=MULTI;
    			var aryPrefix=new Array("sheet1_");	//prefix character array	
     			var sXml=sheetObj.GetSaveData("FNS_JOO_0030GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix));
    			sheetObj.LoadSearchData(sXml,{Sync:1} );
                ComOpenWait(false);    			
    			//retrieving after saving 
    	 		doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
    	 		document.form.estm_clz_yr.focus();
    		}
    		break;
    	}
    }
    /**
     * handling process for input validation
     */
    function validateForm(sheetObj, formObj, sAction) {
    	sheetObj.ShowDebugMsg(false);
    	switch (sAction) {
    		case IBCREATE: //retrieving for saving
    		case IBSEARCH: //retrieve
    			if (formObj.estm_clz_yr.value.length != 4 ){
    				return false;
    			}
				if (!checkNumber(formObj.estm_clz_yr.value)){
					return false;
				}
    			break;
    		case IBSAVE:   //save
    			var cnt=0;
    			for (var inx=sheetObj.HeaderRows(); inx <= sheetObj.LastRow(); inx++){
    				if (sheetObj.GetCellValue(inx, prefix+"ibflag") == "R")
    					continue;
    				cnt++; 
    			}
    			if (cnt==0){
    				ComShowCodeMessage("JOO00036");
    				return false;
    			}
    			break;
    	}
    	return true;
    }
    /**
     * setting IBTab Object to array
     * adding process for list in case of needing batch processing with other items
     * defining list on the top of source
     */
    function setTabObject(tab_obj){
        tabObjects[tabCnt++]=tab_obj;
    }
    /*
    * checking numbers
    */
      function checkNumber(sValue){
   	  try{
   		var value=sValue.search(/^\d*(\.?\d*)$/gi);
   	    if(value !=-1){
   	    	return true;
   	    }else{
   	        return false;
   	    }
   	  }catch(errorObject){
   	    showErrorDig("checkNumber()", errorObject);
   	  }
   	}
      function ComGetDateAdd2(sDate, sFlag, iVal, sDelim){
          try {
              if (sDelim==null || sDelim==undefined) sDelim="-";
              if (sDate==null || sDate==undefined) {
                  sDate=new Date();
              } else {
                  //handling in case of characters or HTML tag(Object)
                  sDate=getArgValue(sDate); 
              }
              var yy=eval(sDate); 
              iVal=ComParseInt(iVal);	//error when parameter is characters
              switch(sFlag.toLowerCase()) {
                  case "y":   yy += eval(iVal);    break;
              }
              return yy ;
          } catch(err) { ComFuncErrMsg(err.message); }
      }
      function estm_clz_yr_keypress(){
      	ComKeyOnlyNumber(event.srcElement);
      }
      //estm_clz_yr changed
      function estm_clz_yr_onblur(){
      	var formObject=document.form;
  		if (formObject.estm_clz_yr.value ==null || formObject.estm_clz_yr.value ==""){
  			ComShowCodeMessage('JOO00116', 'Estimated Closing Year'); 
  			ComSetFocus(formObject.estm_clz_yr);
  			return false;
  		} 
      }
      /**
      * Cell's value changed event
      * @param sheetObj
      * @param row
      * @param col
      * @return
      */
     function sheet1_OnChange(sheetObj, row, col) { 
     	// Key Setting(mandatory)
     	//initKeySetting();
    	//no support[check again]CLT 	var rows=sheetObj.Rows;
     	/*1. Attention and Attn:E-Mail are clicked at the same time.
         *2. Copy and CC:E-Mail are clicked at the same time.
         *3. deactivating all rows except clicked attention
         *4. define data to parent window by finding clicked data 
     	 */
    	 //UI 성능 개선(201407 민정호)    	 
    	 //var rows=sheetObj.RowCount();    	 
    	 var rows=sheetObj.LastRow();    	 
    	 
     	 switch (sheetObj.ColSaveName(col)) {
     	 //1 
     		case prefix+"estm_clz_flg" :
     			if(row > 0) { 
        			for(var i=0; i < rows; i++ ){
        				if(i!=row){
    						if(i < row){
    							if(sheetObj.GetCellValue(i,prefix+"estm_clz_flg") == 0){
	     							sheetObj.SetCellValue(row,prefix+"estm_clz_flg",0);
	     							return;
    							}
    						}
    						if(i > row){
    							if(sheetObj.GetCellValue(i,prefix+"estm_clz_flg") == 1){
	     							sheetObj.SetCellValue(row,prefix+"estm_clz_flg",1);
	     							return;
    							}
    						}
        				}
        			} 
     			}
     		break; 
     	 }
     }

     
     /**
      * after Searching sheet1
      * 
      * @param sheetObj
      * @param ErrMsg
      * @return
      */
     function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
    	//UI 성능 개선(201407 민정호)    	 
    	//var rows=sheetObj.RowCount();    	 
    	//var rows=sheetObj.LastRow();    	 
    	for(var i=sheetObj.HeaderRows(); i <= sheetObj.LastRow(); i++ ){
    		if(sheetObj.GetCellValue(i, prefix+"estm_clz_flg") == "Y"){
        		sheetObj.SetCellValue(i, prefix+"estm_clz_flg",1);    			
    		}    		 
    	 }
     } 
     
     function resizeSheet(){
    	    ComResizeSheet(sheetObjects[0]);
    }     