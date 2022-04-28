/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : fns_inv_0086.js
*@FileTitle : Quick Customer Search
*Open Issues :
*Change history :
*@LastModifyDate :
*@LastModifier : 
*@LastVersion : 1.0
=========================================================*/
    /**
     * @extends 
     * @class fns_inv_0086 : fns_inv_0086 Defining business script.
     */
	// Common variables.
	var sheetObjects=new Array();
	var sheetCnt=0;
	// Defining button events. */
	document.onclick=processButtonClick;
	/**
	 * Handling button event. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  none.  
	 * @return none.
	 * @see #
	 * @author 
	 * @version 2009.10.19
	 */
    function processButtonClick(){
         /***** Setting each tab's sheet variable. *****/
         var sheetObject1=sheetObjects[0];
         var sheetObject2=sheetObjects[1];
         /*******************************************************/
         var formObject=document.form;
    	try {
    		var srcName=ComGetEvent("name");
           switch(srcName) {
                case "btn_retrieve":
                	ComBtnDisable("btn_retrieve");
					doActionIBSheet(sheetObjects[0],formObject,IBSEARCH);
                    break; 
                case "btn_new":
					ComResetAll();
					ComBtnEnable("btn_retrieve");
					ComSetFocus(formObject.cust_cnt_cd);
                    break; 
                case "btn_apply":
					//callParent();
                	comPopupOK();
                    break; 
                case "btn_close":
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
     * Register IBSheet object on sheetObjects array. <br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  {IBSheet} sheetObj IBSheet Object
     * @return none.
     * @see #
     * @author 
     * @version 2009.10.19
     */
    function setSheetObject(sheet_obj){
       sheetObjects[sheetCnt++]=sheet_obj;
    }
    /** 
     * Coding event handler for body tag's OnLoad. <br>
     * Add  pre-process functions after loading by browser. <br> 
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  none.
     * @return none.
     * @see #
     * @author 
     * @version 2009.10.19
     */
    function loadPage() {
        for(i=0;i<sheetObjects.length;i++){
            ComConfigSheet (sheetObjects[i] );
            initSheet(sheetObjects[i],i+1);
            ComEndConfigSheet(sheetObjects[i]);
         //doActionIBSheet(sheetObjects[i],document.form,IBSEARCH);
        }
        axon_event.addListenerForm ('focusout', 'obj_focusout', document.form);
        axon_event.addListener ('keydown', 'ComKeyEnter', 'form');		
//		if(document.form.cust_cnt_cd.value != ""){
//			doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
//		}	
		initControl();
		doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC10);
		document.form.cust_lgl_eng_nm.focus();
		
    }
    /** 
     * Coding event for OnLoad. <br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  none.
     * @return none.
     * @see #
     * @author 
     * @version 2009.10.19
     */
	function initControl() {
	    // Axon event process. Event catch.
//	    axon_event.addListenerFormat('keypress',       'obj_keypress',    form); // When entering keyboard.
	}
	/** 
	 * Coding event for OnKeyPress.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none.
	 * @return none.
	 * @see #
	 * @author 
      	 * @version 2009.10.19
	 */
//	function obj_keypress(){
//	    switch(event.srcElement.dataformat){
//	        case "float":
//	            // Only number or '.'.
//	            ComKeyOnlyNumber(event.srcElement, ".");
//	            break;
//	        case "ymd":
//	            // Only number or '-'.
//	        	ComKeyOnlyNumber(event.srcElement);
//	            break;
//	        case "eng":
//	            // Only Alphabet or number.
//	            ComKeyOnlyAlphabet();
//	            break;
//	        case "engdn":
//	            // Only lower case.
//	            ComKeyOnlyAlphabet('lower');
//	            break;
//	        case "engup":
//	            // Only upper case.
//	        	switch(event.srcElement.name){
// 	    	    case "cust_lgl_eng_nm":
// 	    	    	//if(document.form.chk_nm.checked == true){
//	 	    	    	 if(event.keyCode >= 97 && event.keyCode <= 122)
//	 	    	    	  {
//	 	    	    	     event.keyCode=event.keyCode - 32;
//	 	    	    	  }else if(event.keyCode == 32){
//	 	    	    		 event.keyCode=event.keyCode;
//	 	    	    	  }
// 	    	    	 //}else{
// 	    	    	//	ComKeyOnlyAlphabet('upper'); break;
// 	    	    	 //}
// 	    	    	break;
// 	    	    default:
//		    	        // Only upper case.		    	        
//		                ComKeyOnlyAlphabet('upper'); break;
//	            }
//	            break;
//	        case "num":
//	        	// Only number(integer, date, time).
//	            ComKeyOnlyNumber('num');
//	            break;
//	        case "uppernum":
//	        	// Only upper case or number. 
//	        	ComKeyOnlyAlphabet('uppernum');
//	            break;
//	        default:
//	            // Only upper case.
//	            ComKeyOnlyAlphabet('upper');
//	    }
//	}
    /** 
     * Initialize sheets. <br>
     * Add  pre-process functions after loading by browser. <br>
     * Coding initial modules as sheet's count. <br> 
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param {IBSheet} sheetObj : Sheet object.
     * @param Serial number for sheet object's ID.  
     * @return none.
     * @see #
     * @author 
     * @version 2009.10.19
     */
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
        switch(sheetNo) {
             case 1:      //sheet1 init
            	 with(sheetObj){
            	   var HeadTitle="|Sel|Cust. Code|Actual Payer\nCode|Customer Name|Address|Zip Code|Credit Office|cust_cnt_cd|cust_seq|locl_nm|TaxPayerID\nRegNo|Status|No Use";
            	   SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
	               var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	               var headers = [ { Text:HeadTitle, Align:"Center"} ];
	               InitHeaders(headers, info);
	               var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
                      {Type:"Radio",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:"radio" },
                      {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"cust_code",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"act_cust_cnt_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",      Hidden:0,  Width:170,  Align:"Left",    ColMerge:0,   SaveName:"cust_lgl_eng_nm",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",      Hidden:0,  Width:190,  Align:"Left",    ColMerge:0,   SaveName:"bzet_addr",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"zip_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"cr_clt_ofc_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",      Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"cust_cnt_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",      Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"cust_seq",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",      Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"locl_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"cust_rgst_no",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"delt_flg",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"sls_delt_eff_dt",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
               		InitColumns(cols);
               		SetEditable(1);
               		SetSheetHeight(230);
                }
            break;
        }
    }
    /** 
     * Coding retrieve, save... <br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  {IBSheet} sheetObj : Sheet object.  
     * @param  {object} formObj : Form object.
     * @param  {sAction} sAction : f_cmd.
     * @param  {int} Row : Selected row.
     * @param  {int} Col : Selected column.
     * @param  {String}Val : Selected row, column value
     * @return none.
     * @see #
     * @author 
     * @version 2009.10.19
     */
    function doActionIBSheet(sheetObj,formObj,sAction) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
	        case IBSEARCH_ASYNC10: //Office retrieve, cust_cnt_cd
	        	formObj.f_cmd.value=SEARCH02;
	        	var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
	    		var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
	    		var arrStr=sStr.split("|");
	    		var loc_cd="";
	    		var login_ofc_cd=formObj.login_ofc_cd.value;
	    		var popOffice=formObj.popOffice.value;
	    		if(popOffice != ""){
	    			for (var i=1; i < arrStr.length;i++ ) {
		       			var arrStr2=arrStr[i].split("^");
		       			var ar_ofc_cd=arrStr2[1];
		       			if(ar_ofc_cd == popOffice){
		       				loc_cd=arrStr2[10];
		       			}
		       		}
	    		}else{
		    		for (var i=1; i < arrStr.length;i++ ) {
		       			var arrStr2=arrStr[i].split("^");
		       			var ar_ofc_cd=arrStr2[1];
		       			if(ar_ofc_cd == login_ofc_cd){
		       				loc_cd=arrStr2[10];
		       			}
		       		}
	    		}
	    		
	    		if(!ComIsEmpty(formObj.rec_cust_cnt_cd.value)){  
	    			formObj.cust_cnt_cd.value=formObj.rec_cust_cnt_cd.value;
	    		} else {
	    			formObj.cust_cnt_cd.value=loc_cd;
	    		}
			break;
	        case IBSEARCH:      //retrieve
				if(validateForm(sheetObj,formObj,sAction) == false) return false;  
				if (sheetObj.id == "sheet1") {	
					formObj.f_cmd.value=SEARCH;
					sheetObj.DoSearch("FNS_INV_0086GS.do", FormQueryString(formObj) );
					var delt_flg="";
					
					for (var i=1; i<=sheetObj.RowCount(); i++) {
						delt_flg=sheetObj.cellValue(i,"delt_flg");
						if(delt_flg == "Delete"){
							sheetObj.SetCellFontColor(i, "delt_flg","#FF0000");
						}
					}
				}
	
                break;          
          case IBSAVE:        //save
          	if(validateForm(sheetObj,formObj,sAction))
                  alert (" Save .. ");
                break;
					case IBINSERT:      // input
                break;
        }
    }    
    /** 
     * Validating input value. <br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  {IBSheet} sheetObj : Sheet object.  
     * @param  {object} formObj : Form object.
     * @param  {sAction} sAction : f_cmd.
     * @return true, false
     * @see #
     * @author 
     * @version 2009.10.19
     */
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
			if (ComIsNull(formObj.cust_cnt_cd)) {            		
				ComShowCodeMessage('INV00004');
				ComSetFocus(form.cust_cnt_cd);
				ComBtnEnable("btn_retrieve");
				return false;
			}
			if (ComIsNull(formObj.cust_lgl_eng_nm) && ComIsNull(formObj.zip_cd) && ComIsNull(formObj.cust_rgst_no)){
				ComShowCodeMessage('INV00004');
				ComSetFocus(form.cust_lgl_eng_nm);
				ComBtnEnable("btn_retrieve");
				return false;
			}
        }
        return true;
    }
    /** 
     * Moving focus. <br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  {object} id_from 
     * @param  {object} id_to 
     * @param  {number} maxSize 
     * @return none.
     * @see #
     * @author 
     * @version 2009.10.19
     */ 
	function moveNext(id_from,id_to,maxSize) {			
		var cur=document.getElementById(id_from).value;
		curSize=cur.length;
		if (curSize == maxSize) {
			document.getElementById(id_to).focus();
		}
	}
	
	function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
		for(var i=1; i < sheetObj.LastRow(); i++){
			sheetObj.SetCellFontColor(i, "delt_flg","#FF0000");
		}
		ComBtnEnable("btn_retrieve");
	}

