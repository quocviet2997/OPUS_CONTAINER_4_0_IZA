/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : fns_inv_9001.js
*@FileTitle : Migration Interface
*Open Issues :
*Change history :
*@LastModifyDate :
*@LastModifier : 
*@LastVersion : 1.0
=========================================================*/
    /**
     * @extends 
     * @class fns_inv_9001 : fns_inv_9001 Defining business script.
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
                case "btn_new":
					ComResetAll(); 
                    break; 
                    
                case "btn_save_bkg":
					doActionIBSheet(sheetObjects[0],formObject,COMMAND01);
                    break;
                    
                case "btn_save_oth":
                	doActionIBSheet(sheetObjects[0],formObject,COMMAND02);
                	break;    
                    
                case "btn_save_dexrate":
                	doActionIBSheet(sheetObjects[0],formObject,COMMAND03);
                	break;
                	
                case "btn_save_exrate":
                	doActionIBSheet(sheetObjects[0],formObject,COMMAND04);
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
        }
        axon_event.addListenerForm ('focusout', 'obj_focusout', document.form);
        axon_event.addListener ('keydown', 'ComKeyEnter', 'form');		
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
     * @version 2009.10.19
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
     * @version 2009.10.19
     */
    function initSheet(sheetObj,sheetNo) {
    	 var cnt=0;
         switch(sheetObj.id) {
         	case "sheet1":
                 with (sheetObj) {	
                     //setting Host information[HostIp, Port, PagePath]
                     //no support[check again]CLT if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);
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
	        case COMMAND01:
		        	formObj.f_cmd.value=COMMAND01;
		        	var sXml;
					sheetObj.WaitImageVisible=false;
					//ComOpenWait(true); 
					//setTimeout( function () {
						sXml=sheetObj.GetSearchData("FNS_INV_9001GS.do", FormQueryString(formObj));
					//	SarOpenWait(false,true);
					//} , 100);
					
					//setTimeout( function () {
						if(CoInvShowXmlMessage(sXml) != "") {
							ComShowMessage(CoInvShowXmlMessage(sXml));
						}else{
							ComShowCodeMessage('INV00051');
						}
					//} , 110);
	        	break;
	        case COMMAND02:
		        	formObj.f_cmd.value=COMMAND02;
		        	var sXml;
					sheetObj.WaitImageVisible=false;
					//ComOpenWait(true); 
					//setTimeout( function () {
						sXml=sheetObj.GetSearchData("FNS_INV_9001GS.do", FormQueryString(formObj));
					//	SarOpenWait(false,true);
					//} , 100);
					
					//setTimeout( function () {
						if(CoInvShowXmlMessage(sXml) != "") {
							ComShowMessage(CoInvShowXmlMessage(sXml));
						}else{
							ComShowCodeMessage('INV00051');
						}
					//} , 110);
	        	break;
	        case COMMAND03:
		        	formObj.f_cmd.value=COMMAND03;
		        	var sXml;
					sheetObj.WaitImageVisible=false;
					//ComOpenWait(true); 
					//setTimeout( function () {
						sXml=sheetObj.GetSearchData("FNS_INV_9001GS.do", FormQueryString(formObj));
					//	SarOpenWait(false,true);
					//} , 100);
					
					//setTimeout( function () {
						if(CoInvShowXmlMessage(sXml) != "") {
							ComShowMessage(CoInvShowXmlMessage(sXml));
						}else{
							ComShowCodeMessage('INV00051');
						}
					//} , 110);
				break;
	        case COMMAND04:
		        	formObj.f_cmd.value=COMMAND04;
		        	var sXml;
					sheetObj.WaitImageVisible=false;
					//ComOpenWait(true); 
					//setTimeout( function () {
						sXml=sheetObj.GetSearchData("FNS_INV_9001GS.do", FormQueryString(formObj));
					//	SarOpenWait(false,true);
					//} , 100);
					
					//setTimeout( function () {
						if(CoInvShowXmlMessage(sXml) != "") {
							ComShowMessage(CoInvShowXmlMessage(sXml));
						}else{
							ComShowCodeMessage('INV00051');
						}
					//} , 110);
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
    	switch(sAction) {
			case COMMAND01:
				if (ComIsNull(formObj.rate_ym)){
					ComShowCodeMessage('COM130403','Exchange Rate YM');
					ComSetFocus(formObj.rate_ym);
					return false;
				}	
				break;
			case COMMAND02:
				if (ComIsNull(formObj.if_no)){
					ComShowCodeMessage('COM130403','Interface No');
					ComSetFocus(formObj.if_no);
					return false;
				}
				break;
			case COMMAND03:	
				if (ComIsNull(formObj.adj_no)){
					ComShowCodeMessage('COM130403','Adjustment No');
					ComSetFocus(formObj.rate_ym);
					return false;
				}
				break;
			case COMMAND04:   
				if (ComIsNull(formObj.offset_no)){
					ComShowCodeMessage('COM130403','Offset No');
					ComSetFocus(formObj.offset_no);
					return false;
				}
				break;
			case COMMAND05:
				if (ComIsNull(formObj.receipt_no)){ 
					ComShowCodeMessage('COM130403','Receipt No');
					ComSetFocus(formObj.receipt_no);
					return false;
				}
				break;
			case COMMAND06:
				if (ComIsNull(formObj.asa_no)){ 
					ComShowCodeMessage('COM130403','ASA No');
					ComSetFocus(formObj.asa_no);
					return false;
				}
				break;	
		}
        return true;
    }

