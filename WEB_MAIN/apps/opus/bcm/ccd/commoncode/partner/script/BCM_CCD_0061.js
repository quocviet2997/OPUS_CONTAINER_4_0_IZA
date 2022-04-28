/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BCM_CCD_0061.js
*@FileTitle : Credit Customer History
*Open Issues :
*Change history :
*@LastModifyDate :
*@LastModifier : 
*@LastVersion : 1.0 
=========================================================*/
    /**
     * @extends 
     * @class BCM_CCD_0061 : BCM_CCD_0061 Defining business script.
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
	 * @version 2018.12.19
	 */
    function processButtonClick(){
         /***** Setting each tab's sheet variable. *****/
         var sheetObject1=sheetObjects[0];
         /*******************************************************/
         var formObject=document.form;
    	try {
    		var srcName=ComGetEvent("name");
           switch(srcName) {
                case "btn_retrieve":
					doActionIBSheet(sheetObject1,formObject,IBSEARCH);
                    break; 
    			case "btn_downexcel":
    				if(sheetObject1.RowCount() < 1){//no data
    					ComShowCodeMessage("COM132501");
    				}else{
    					sheetObject1.Down2Excel( {DownCols: makeHiddenSkipCol(sheetObject1), SheetDesign:1,Merge:1,KeyFieldMark:0 });
    				}
        	    	break;
                case "btn_new":
					ComResetAll();
					formObject.cust_cnt_cd.value = "";
					formObject.cust_seq.value = "";
					ComSetFocus(formObject.cust_cnt_cd);
                    break; 
                case "btn_apply":
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
     * @version 2018.12.19
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
     * @version 2018.12.19
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
//		doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC10);
		document.form.cust_cnt_cd.focus();
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
     * @version 2018.12.19
     */
	function initControl() {
	    // Axon event process. Event catch.
		//	    axon_event.addListenerFormat('keypress',       'obj_keypress',    form); // When entering keyboard.
	}
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
     * @version 2018.12.19
     */
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
        switch(sheetNo) {
             case 1:      //sheet1 init
            	 with(sheetObj){
            	   var HeadTitle="||Seq.|Cust Code|Customer Name|Parent|Payment Office|Credit Agreement No|Contract No";
            	   SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
	               var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	               var headers = [ { Text:HeadTitle, Align:"Center"} ];
	               InitHeaders(headers, info);
	               var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
        	          {Type:"Radio",  Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"radio",      		KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	 		          {Type:"Seq",	Hidden:0,  Width:40,   	Align:"Center", ColMerge:1,   SaveName:"Seq" },
                      {Type:"Text",	Hidden:0,  Width:100,	Align:"Center",	ColMerge:0,   SaveName:"cust_cd",        	KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:250,	Align:"Left",  	ColMerge:0,   SaveName:"cust_lgl_eng_nm",	KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:100,  	Align:"Center", ColMerge:0,   SaveName:"p_cust_cd",  		KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:100,  	Align:"Center", ColMerge:0,   SaveName:"cr_clt_ofc_cd",     KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:130,  	Align:"Center", ColMerge:0,   SaveName:"cust_agmt_no",      KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:100,  	Align:"Center", ColMerge:0,   SaveName:"ctrt_no",  			KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
               		InitColumns(cols);
               		SetEditable(1);
               		SetSheetHeight(240);
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
     * @version 2018.12.19
     */
    function doActionIBSheet(sheetObj,formObj,sAction) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
	        case IBSEARCH_ASYNC10: //Office retrieve, cust_cnt_cd
	        	formObj.f_cmd.value=SEARCH02;
	        	var sXml=sheetObj.GetSearchData("BCM_CCD_0061GS.do", FormQueryString(formObj));
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
				//if(validateForm(sheetObj,formObj,sAction) == false) return false;  
				sheetObj.WaitImageVisible=false;
				ComOpenWait(true); 
				formObj.f_cmd.value=SEARCH;
				sheetObj.DoSearch("BCM_CCD_0061GS.do", FormQueryString(formObj) );
				ComOpenWait(false);
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
     * @version 2018.12.19
     */
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
			if (ComIsNull(formObj.cust_cnt_cd)) {            		
				ComShowCodeMessage("CCD00001", "Customer Code");
				ComSetFocus(form.cust_cnt_cd);
				return false;
			}
			if (ComIsNull(formObj.cust_seq)) {            		
				ComShowCodeMessage("CCD00001", "Customer Code");
				ComSetFocus(form.cust_seq);
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
     * @version 2018.12.19
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
	}

    /**
     * Handling grid double click process
     */
    function sheet1_OnDblClick(sheetObj, Row, Col) {
       	comPopupOK();    		
    }
