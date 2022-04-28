/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BCM_CCD_0063.js
*@FileTitle : Credit Customer History
*Open Issues :
*Change history :
*@LastModifyDate :
*@LastModifier : 
*@LastVersion : 1.0 
=========================================================*/
    /**
     * @extends 
     * @class BCM_CCD_0063 : BCM_CCD_0063 Defining business script.
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
         var sheetObject2=sheetObjects[1];
         /*******************************************************/
         var formObject=document.form;
    	try {
    		var srcName=ComGetEvent("name");
           switch(srcName) {
                case "btn_retrieve":
					doActionIBSheet(sheetObjects[0],formObject,IBSEARCH);
                    break; 
                case "btn_close":
                	ComClosePopup(); 
                    break;                      
                case "btn_cust":
        			var cust_cnt_cd=ComGetObjValue(formObject.cust_cd).substring(0,2);
        			var cust_seq=ComGetObjValue(formObject.cust_cd).substring(2);
        			var classId="BCM_CCD_0061_POP"; 
        			var param='?cust_cnt_cd='+cust_cnt_cd+'&cust_seq='+cust_seq+'&pop_yn=Y&classId='+classId;
        			ComOpenPopup('/opuscntr/BCM_CCD_0061_POP.do' + param, 900, 450, 'setCallBackCust', '0,0', true, false);
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
		if(document.form.cust_cd.value != ""){
			doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
		}	
		initControl();
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
            	   var HeadTitle="|Seq.|Cust Code|Credit Agreement No|Payment Office|Curr|Credit Amount Limit|Credit Start Date|Credit End Date|O/B Credit Term|I/B Credit Term|Payment Date1|Payment Date2|Payment Date3|Payment Date4|Multi Cnt Flag|Country/RHQ|Contract Number|Child/Associate|Delete Flag|Update User|UPdate Date";
            	   SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
	               var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	               var headers = [ { Text:HeadTitle, Align:"Center"} ];
	               InitHeaders(headers, info);
	               var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
	 		          {Type:"Seq",	Hidden:0,  Width:40,   	Align:"Center", ColMerge:1,   SaveName:"Seq" },
                      {Type:"Text",	Hidden:0,  Width:80,	Align:"Center",	ColMerge:0,   SaveName:"cust_cd",        	KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:120,	Align:"Center",	ColMerge:0,   SaveName:"cust_agmt_no",      KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:100,  	Align:"Center", ColMerge:0,   SaveName:"cr_clt_ofc_cd",     KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:60,	Align:"Center", ColMerge:0,   SaveName:"cr_curr_cd",		KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Int",	Hidden:0,  Width:120,  	Align:"Right", 	ColMerge:0,   SaveName:"cr_amt",  			KeyField:0,   CalcLogic:"",   Format:"NullInteger",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:100,  	Align:"Center", ColMerge:0,   SaveName:"cr_cust_st_dt",     KeyField:0,   CalcLogic:"",   Format:"Ymd",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:100,  	Align:"Center", ColMerge:0,   SaveName:"cr_cust_end_dt",    KeyField:0,   CalcLogic:"",   Format:"Ymd",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:100,  	Align:"Center", ColMerge:0,   SaveName:"ob_cr_term_dys",    KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:100,  	Align:"Center", ColMerge:0,   SaveName:"ib_cr_term_dys",    KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:100,  	Align:"Center", ColMerge:0,   SaveName:"pay_dt_dy1",      	KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:100,  	Align:"Center", ColMerge:0,   SaveName:"pay_dt_dy2",      	KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:100,  	Align:"Center", ColMerge:0,   SaveName:"pay_dt_dy3",      	KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:100,  	Align:"Center", ColMerge:0,   SaveName:"pay_dt_dy4",      	KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:80,  	Align:"Center", ColMerge:0,   SaveName:"mlt_cnt_flg",      	KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:300,  	Align:"Left", 	ColMerge:0,   SaveName:"aply_cnt_ctnt",     KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:300,  	Align:"Left", 	ColMerge:0,   SaveName:"ctrt_no_ctnt",      KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:300,  	Align:"Left", 	ColMerge:0,   SaveName:"chd_cust_no_ctnt",  KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:80,  	Align:"Center", ColMerge:0,   SaveName:"delt_flg",     	 	KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:150,  	Align:"Center", ColMerge:0,   SaveName:"upd_usr_id",      	KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                      {Type:"Text",	Hidden:0,  Width:150,  	Align:"Center", ColMerge:0,   SaveName:"upd_dt",  			KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
               		InitColumns(cols);
               		SetEditable(1);
               		SetSheetHeight(440);
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
	        case IBSEARCH:      //retrieve
				if(validateForm(sheetObj,formObj,sAction) == false) return false;  
				if (sheetObj.id == "sheet1") {
					sheetObj.WaitImageVisible=false;
					ComOpenWait(true); 
					setTimeout( function () {
						formObj.f_cmd.value=SEARCH;
						sheetObj.DoSearch("BCM_CCD_0063GS.do", FormQueryString(formObj) );
						ComOpenWait(false);
				    } , 100);	
				}
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
			if (ComIsNull(formObj.cust_cd)) {            		
				ComShowCodeMessage("CCD00001", "Customer Code");
				ComSetFocus(form.cust_cd);
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
//			sheetObj.SetCellFontColor(i, "delt_flg","#FF0000");
		}
	}

	/**
	 * Read from Cust Code Pop-up. <br>
	 */ 
	function setCallBackCust(aryPopupData) {
		var form=document.form;
		form.cust_cd.value=aryPopupData[0][2];
		form.cust_lgl_eng_nm.value=aryPopupData[0][3];
		form.cust_agmt_no.value=aryPopupData[0][6];
	} 
