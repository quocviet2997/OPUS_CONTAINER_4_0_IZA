/**=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0073.js
*@FileTitle  : A/R Office Code Management
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/30
=========================================================**/

	// Common variables.
	var sheetObjects=new Array();
	var sheetCnt=0;
	
	//IBMultiCombo
	var comboObjects=new Array();
	var combo1=null;
	var comboCnt=0;
	
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
          /*******************************************************/
          var formObject=document.form;
          try {
     		var srcName=ComGetEvent("name");
            switch(srcName) {
                 case "btn_Retrieve":
                	 doActionIBSheet(sheetObjects[0],formObject,IBSEARCH);
                     break;
                 case "btn_New":
                	 if(formObject.modifyGb.value == 'Y'){	//modifyGb : Y, N
                		 if(!ComShowCodeConfirm("INV00069")) return;
                	 }
                	 ComResetAll();
                	 //doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC10);
                	 ComSetFocus(form.ar_ofc_cd);
                     break;
                 case "btn_Save":
                	 doActionIBSheet(sheetObjects[0],document.form,IBSAVE);
                     break;
                 case "btn_RowAdd":                
 					var sheetIdx=sheetObjects[1].DataInsert(-1);
                     break;
                 case "btn_Delete":
                	 //doActionIBSheet(sheetObjects[0],document.form,IBDELETE);
                	 //alert(sheetObjects[1].SelectCol+"::"+sheetObjects[1].SelectRow);
                	 sheetObjects[1].SetCellValue(sheetObjects[1].GetSelectRow(),sheetObjects[1].GetSelectCol(),"");
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
 	 * Register IBCombo object on array. <br>
 	 * <br><b>Example :</b>
 	 * <pre>
 	 * 
 	 * Array define top on source.
 	 * </pre>
 	 * @param {IBMultiCombo} combo_obj    IBMultiCombo Object
 	 * @return none.
 	 * @see #
 	 * @author 
 	 * @version 2009.10.19
 	 */
 	function setComboObject(combo_obj){
 		comboObjects[comboCnt++]=combo_obj;
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
    	// Initialize IBMultiCombo.
 		for(var k=0; k<comboObjects.length; k++){
 			initCombo(comboObjects[k],k+1);
 		}
    	 initControl();
    	 axon_event.addListenerForm  ('beforedeactivate', 'obj_deactivate',  form, "rdoCity");
    	 doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC10);
    	 ComSetFocus(document.form.ar_ofc_cd);
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
		axon_event.addListenerForm('change',    'obj_change',    form);
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
 	function obj_deactivate(){
 		switch(ComGetEvent("name")){
			case "inv_vat_chg_rt":
				ComChkObjValid(ComGetEvent());
			break;			
 		} 	    
 	}
 	
	/**
     * If the data field to be the change event
     */
    function obj_change(){
 	   	var formObject = document.form;
 	   	/*****Case more than two additional sheets tab sheet is used to specify a variable *****/
 	    var sheetObject1=sheetObjects[0];
 	    /*******************************************************/
 	   	try {
 	   		var srcName=ComGetEvent("name");
 	   		
            switch(srcName) {
            	case "inv_iss_tp_cd": // INV Issue Type
            		fnSetCnDpFlg(formObject.inv_iss_tp_cd.value);
            		break;
            }
 	    } catch(e) {
	   		if( e == "[object Error]") {
	   			ComShowMessage(OBJECT_ERROR);
	   		} else {
	   			ComShowMessage(e.message);
	   		}
        }
    }
    
     /** 
 	 * Initialize combo.<br>
 	 * <br><b>Example :</b>
 	 * <pre>
 	 * 
 	 * </pre>
 	 * @param {IBMultiCombo} comboObj  comboObj
 	 * @return none.
 	 * @see #
 	 * @author 
 	 * @version 2009.10.19
 	 */
   	function initCombo(comboObj, comboNo) {
 		switch (comboObj.options.id) {
 			case "ar_ofc_cd2":
 				with (comboObj) {
 					//SetColAlign("left");
 	                //SetColWidth("50");
 	                //SetTitle("Office Code");
 					//MultiSelect = false;
 					//UseAutoComplete = true;
 					//DropHeight = 200;
 					//no support[check again]CLT 					ValidChar(2,0);
 					ValidChar(2);
 					SetMaxLength(6);
 				}
 				break;
 			case "inv_vat_chg_cd":
 				with (comboObj) {
 					//SetColAlign("left");
 	                //SetColWidth("50");
 	                //SetTitle("Office Code");
 					//MultiSelect = false;
 					//UseAutoComplete = true;
 					//DropHeight = 200;
 					//no support[check again]CLT 					ValidChar(2,0);
 				    ValidChar(2);
 					SetMaxLength(3);
 				}
 				break;
 		}
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
         var sheetID=sheetObj.id;
         switch(sheetID) {
              case "sheet1":      //sheet1 init
            	    with(sheetObj){		                  
		                //no support[check again]CLT if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);
		                var HeadTitle="|ar_ofc_cd|inv_iss_tp_cd|inv_snd_tp_cd|dmdt_ar_inv_iss_flg|n3pty_bil_ar_inv_flg|dmdt_inv_aply_bl_flg|cpy_inv_knt|xch_rt_rvs_flg|xch_rt_usd_tp_cd|xch_rt_n3rd_tp_cd|tml_inv_iss_flg|ots_smry_cd|inv_dup_flg|inv_mlt_bl_iss_flg|delt_flg|cre_usr_id|cre_dt|upd_usr_id|upd_dt|inv_vat_chg_cd|inv_vat_chg_rt|mnr_ar_inv_iss_flg|inv_top_rmk|inv_btm_rmk|inv_cnt_rmk";
		                var prefix="sheet1_";
		
		                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );
		
		                var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
		                var headers = [ { Text:HeadTitle, Align:"Center"} ];
		                InitHeaders(headers, info);
		
		                var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ar_ofc_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"inv_iss_tp_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"inv_snd_tp_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"dmdt_ar_inv_iss_flg",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"n3pty_bil_ar_inv_flg",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"dmdt_inv_aply_bl_flg",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cpy_inv_knt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"xch_rt_rvs_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"xch_rt_usd_tp_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"xch_rt_n3rd_tp_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"tml_inv_iss_flg",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ots_smry_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"inv_dup_flg",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"inv_mlt_bl_iss_flg",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"delt_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cre_usr_id",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cre_dt",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"upd_usr_id",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"upd_dt",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"inv_vat_chg_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"inv_vat_chg_rt",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"mnr_ar_inv_iss_flg",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"inv_top_rmk",   		  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"inv_btm_rmk",    		  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"inv_cnt_rmk",    		  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                       {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cn_dp_flg",    		  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 }
		                       ];
		                 
		                InitColumns(cols);	
		                SetEditable(1);
		                SetSheetHeight(240);
              	  }
            	  break;
              case "sheet2":      //sheet1 init
            	    with(sheetObj){
            	  		SetColProperty("chg_cd1", {ComboText:"|OFT|BAF|CAF|AAA|BBB|CCC|DDD|EEE", ComboCode:"|OFT|BAF|CAF|AAA|BBB|CCC|DDD|EEE"} );
            	  		SetColProperty("chg_cd2", {ComboText:"|OFT|BAF|CAF|AAA|BBB|CCC|DDD|EEE", ComboCode:"|OFT|BAF|CAF|AAA|BBB|CCC|DDD|EEE"} );
            	  		SetColProperty("chg_cd3", {ComboText:"|OFT|BAF|CAF|AAA|BBB|CCC|DDD|EEE", ComboCode:"|OFT|BAF|CAF|AAA|BBB|CCC|DDD|EEE"} );
            	  		SetColProperty("chg_cd4", {ComboText:"|OFT|BAF|CAF|AAA|BBB|CCC|DDD|EEE", ComboCode:"|OFT|BAF|CAF|AAA|BBB|CCC|DDD|EEE"} );
            	  		SetColProperty("chg_cd5", {ComboText:"|OFT|BAF|CAF|AAA|BBB|CCC|DDD|EEE", ComboCode:"|OFT|BAF|CAF|AAA|BBB|CCC|DDD|EEE"} );
            	  		SetColProperty("chg_cd6", {ComboText:"|OFT|BAF|CAF|AAA|BBB|CCC|DDD|EEE", ComboCode:"|OFT|BAF|CAF|AAA|BBB|CCC|DDD|EEE"} );
            	          
            	        //no support[check again]CLT if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);
            	        var HeadTitle1="|Forbidden Charge Code|Forbidden Charge Code|Forbidden Charge Code|Forbidden Charge Code|Forbidden Charge Code|Forbidden Charge Code";
            	        var headCount=ComCountHeadTitle(HeadTitle1);
            	        var rowCnt=0;

            	        SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );

            	        var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
            	        var headers = [ { Text:HeadTitle1, Align:"Center"} ];
            	        InitHeaders(headers, info);

            	        var cols = [ {Type:"Status",    Hidden:1, Width:00,   Align:"Center",  ColMerge:0,   SaveName:"hdnStatus" },
            	               {Type:"Combo",     Hidden:0, Width:115,  Align:"Center",  ColMerge:0,   SaveName:"chg_cd1",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
            	               {Type:"Combo",     Hidden:0, Width:115,  Align:"Center",  ColMerge:0,   SaveName:"chg_cd2",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
            	               {Type:"Combo",     Hidden:0, Width:115,  Align:"Center",  ColMerge:0,   SaveName:"chg_cd3",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
            	               {Type:"Combo",     Hidden:0, Width:115,  Align:"Center",  ColMerge:0,   SaveName:"chg_cd4",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
            	               {Type:"Combo",     Hidden:0, Width:115,  Align:"Center",  ColMerge:0,   SaveName:"chg_cd5",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
            	               {Type:"Combo",     Hidden:0, Width:115,  Align:"Center",  ColMerge:0,   SaveName:"chg_cd6",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
            	         
            	        InitColumns(cols);

            	        SetEditable(1);
            	        SetCountPosition(0);
            	        SetSheetHeight(120);
          	        	SetExtendLastCol(false); 
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
     var boolSave=false;
     function doActionIBSheet(sheetObj,formObj,sAction) {
         sheetObj.ShowDebugMsg(false);
         switch(sAction) {
         	case IBSEARCH_ASYNC10: //CreditCustomer Office retrieve         		
         		formObj.f_cmd.value=SEARCH02; 				
         		var sXml=sheetObj.GetSearchData("FNS_INV_0073GS.do", FormQueryString(formObj));
         		//alert(sXml);
				//ofc_cd
				var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
				var arrStr=sStr.split("|");
				MakeComboObject_OfcCd(ar_ofc_cd2, arrStr, "N", "N");
         		//chg_cd         						
         		var sStrChg=ComGetEtcData(sXml,"chg_cd");         		
         		addCellComboItem(sheetObjects[1],sStrChg,"chg_cd1",false);
         		addCellComboItem(sheetObjects[1],sStrChg,"chg_cd2",false);
         		addCellComboItem(sheetObjects[1],sStrChg,"chg_cd3",false);
         		addCellComboItem(sheetObjects[1],sStrChg,"chg_cd4",false);
         		addCellComboItem(sheetObjects[1],sStrChg,"chg_cd5",false);
         		addCellComboItem(sheetObjects[1],sStrChg,"chg_cd6",false);
         		var arrStr=sStrChg.split("|");
         		//alert(arrStr);//값은 넘어옴
         		MakeComboObject2_1(inv_vat_chg_cd, arrStr);		        
         		break;
 			case IBSEARCH:      //retrieve			
 				if(!validateForm(sheetObj,formObj,sAction)) return; 							
				formObj.f_cmd.value=SEARCH;	
				formObj.ar_ofc_cd.value=ar_ofc_cd2.GetSelectText();
				//sheetObj.DoSearch("FNS_INV_0073GS.do", FormQueryString(formObj)); 				
				var sXml=sheetObj.GetSearchData("FNS_INV_0073GS.do" , FormQueryString(formObj));
				var arrXml=sXml.split("|$$|");
				sheetObjects[0].LoadSearchData(arrXml[0],{Sync:1} );
				var sStrChg=ComGetEtcData(sXml,"chg_cd");				
				sheetObjects[1].RemoveAll();
				if(sheetObj.RowCount()> 0){
					var arrStrChg=sStrChg.split("|");
					var sheetIdx=0;
					var k=0;
					for (var i=1; i < arrStrChg.length;i++ ) {
						if(arrStrChg[i] != ""){
							k=i%6;
							if(k==0) k=6;
							if(k == 1){
								sheetIdx=sheetObjects[1].DataInsert(-1);
							}
							sheetObjects[1].SetCellValue(sheetIdx,"chg_cd"+k,arrStrChg[i]);
						}
					}
				}
				if(sheetObj.RowCount()> 0){
					dataSearch(sheetObjects[0],formObj);
 					formObj.proc_gb.value='U';
				}else{
					//sheetObj.Reset();					
					dataSearch(sheetObjects[0],formObj,"Y");
					formObj.proc_gb.value='I';
					ComSetFocus(form.inv_iss_tp_cd);
				}
				formObj.modifyGb.value='N';
				
				/*				 				
				var sXml=sheetObj.GetSearchData("FNS_INV_0073GS.do", FormQueryString(formObj));
				var arrXml=sXml.split("|$$|"); 				
				sheetObj.LoadSearchData(arrXml[0],{Sync:1} );
				*/
                 break;
 			case IBSAVE:        //save
 				if(!validateForm(sheetObj,formObj,sAction)) return;
 				var result="";
 				var proc_gb=formObj.proc_gb.value;
 				dataSave(sheetObj,formObj,proc_gb); 				
 				result=sheetObj.DoSave("FNS_INV_0073GS.do", FormQueryString(formObj));
 				//if(result) {
 				//	doActionIBSheet(sheetObjects[0],formObj,IBSEARCH);
 				//}
 				//formObj.modifyGb.value='N';
                 break;
// 			case IBDELETE:        //save		
//           	 	var proc_gb = formObj.proc_gb.value;
// 				if(proc_gb == ""){
// 					alert("Do delete after search!");
// 					return false;
// 				}	
// 				var result = "";
// 				formObj.proc_gb.value = 'D';
// 				var proc_gb = formObj.proc_gb.value;
// 				dataSave(sheetObj,formObj,proc_gb);
// 				result = sheetObj.DoSave("FNS_INV_0073GS.do", FormQueryString(formObj));
// 				if(result) {
// 					ComResetAll();
// 					doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC10);
// 				}else{
// 					formObj.proc_gb.value = 'U';
// 				}				
//                 break;    
         }
     }
     
     function sheet1_OnSaveEnd(code, msg){
    	 var formObj = document.form;
    	 
    	 doActionIBSheet(sheetObjects[0],formObj,IBSEARCH);
		 formObj.modifyGb.value='N';
     }
     
     function sheet2_OnSaveEnd(sheetObj, ErrMsg){
    	 if(ErrMsg == ""){
    		 boolSave = true;
    	 }
     }
     /** 
      * After retrieve, setting values <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {IBSheet} sheetObj : Sheet object.  
      * @param  {object} formObj : Form object.
      * @param  {String} init
      * @return none.
      * @see #
      * @author 
      * @version 2009.10.19
      */
     function dataSearch(sheetObj,formObj,init){
    	if(init == 'Y'){
    		formObj.inv_iss_tp_cd.value="";
	    	formObj.cpy_inv_knt.value="";
 			formObj.xch_rt_usd_tp_cd.value="";
			formObj.xch_rt_n3rd_tp_cd.value="";
			formObj.xch_rt_rvs_flg.value="";
			formObj.ots_smry_cd.value="";
			formObj.inv_dup_flg.value="";
			formObj.inv_mlt_bl_iss_flg.value="";
			formObj.dmdt_inv_aply_bl_flg.value="";
			formObj.dmdt_ar_inv_iss_flg.value="";
			formObj.n3pty_bil_ar_inv_flg.value="";
			formObj.tml_inv_iss_flg.value="";
			formObj.proc_gb.value="";
			formObj.inv_snd_tp_cd.value="";
			formObj.inv_vat_chg_cd.text="";
			formObj.inv_vat_chg_rt.value="";
			formObj.mnr_ar_inv_iss_flg.value="";
			formObj.inv_top_rmk.value = "";
			formObj.inv_btm_rmk.value = "";
			formObj.inv_cnt_rmk.value = "";
			formObj.cn_dp_flg.value = "";
 		}else{
			formObj.inv_iss_tp_cd.value=sheetObj.GetCellValue(1,"inv_iss_tp_cd");
			formObj.cpy_inv_knt.value=sheetObj.GetCellValue(1,"cpy_inv_knt");
			var inv_snd_tp_cd=sheetObj.GetCellValue(1,"inv_snd_tp_cd");
			formObj.xch_rt_usd_tp_cd.value=sheetObj.GetCellValue(1,"xch_rt_usd_tp_cd");
			formObj.xch_rt_n3rd_tp_cd.value=sheetObj.GetCellValue(1,"xch_rt_n3rd_tp_cd");
			formObj.xch_rt_rvs_flg.value=sheetObj.GetCellValue(1,"xch_rt_rvs_flg");
			formObj.ots_smry_cd.value=sheetObj.GetCellValue(1,"ots_smry_cd");
			formObj.inv_dup_flg.value=sheetObj.GetCellValue(1,"inv_dup_flg");
			formObj.inv_mlt_bl_iss_flg.value=sheetObj.GetCellValue(1,"inv_mlt_bl_iss_flg");
			formObj.dmdt_inv_aply_bl_flg.value=sheetObj.GetCellValue(1,"dmdt_inv_aply_bl_flg");
			formObj.dmdt_ar_inv_iss_flg.value=sheetObj.GetCellValue(1,"dmdt_ar_inv_iss_flg");
			formObj.n3pty_bil_ar_inv_flg.value=sheetObj.GetCellValue(1,"n3pty_bil_ar_inv_flg");
			formObj.tml_inv_iss_flg.value=sheetObj.GetCellValue(1,"tml_inv_iss_flg");
			comboObjects[1].SetSelectText(sheetObj.GetCellValue(1,"inv_vat_chg_cd"),false);  
			formObj.mnr_ar_inv_iss_flg.value=sheetObj.GetCellValue(1,"mnr_ar_inv_iss_flg");
			if(sheetObj.GetCellValue(1,"inv_vat_chg_rt") != ""){
			formObj.inv_vat_chg_rt.value=ComAddComma2(sheetObj.GetCellValue(1,"inv_vat_chg_rt"), "#,###.00");
			}
			formObj.inv_top_rmk.value = sheetObj.GetCellValue(1,"inv_top_rmk");
			formObj.inv_btm_rmk.value = sheetObj.GetCellValue(1,"inv_btm_rmk");
			formObj.inv_cnt_rmk.value = sheetObj.GetCellValue(1,"inv_cnt_rmk");
			formObj.cn_dp_flg.value   = sheetObj.GetCellValue(1,"cn_dp_flg");
			
			fnSetCnDpFlg(formObj.inv_iss_tp_cd.value);
 		}
     }
     
     /**
      * INV Issue Type 에 따른 Show INV No for INV credits 셋팅
      */
     function fnSetCnDpFlg(tp_cd) {
  	   	var formObject = document.form;

 		// INV Issue Type 이 Each 인 경우 
  	   	// Show INV No for INV credits 변경 가능
     	if (tp_cd == "E") { // Each
     		if (formObject.cn_dp_flg.value == "")
     			formObject.cn_dp_flg.value = "N";
     		ComEnableObject(formObject.cn_dp_flg, true);
     	} else if (tp_cd == "S") { // Summary
     		formObject.cn_dp_flg.value = "N";
     		ComEnableObject(formObject.cn_dp_flg, false);
     	} else {
     		formObject.cn_dp_flg.value = "";
     		ComEnableObject(formObject.cn_dp_flg, false);
     	}
     }
     
     /** 
      * After save, setting values<br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {IBSheet} sheetObj : Sheet object.  
      * @param  {object} formObj : Form object.
      * @param  {String} proc_gb
      * @return none.
      * @see #
      * @author 
      * @version 2009.10.19
      */
     function dataSave(sheetObj,formObj,proc_gb){
    	 var ib_flag="";
    	if(proc_gb == ""){
			alert("Do save after search!");
			return false;
    	}else if(proc_gb == "I"){
			formObj.f_cmd.value=MULTI01;
			ib_flag="I";
			var sheetIdx=sheetObjects[0].DataInsert(-1);
		}else if(proc_gb == "U"){
			formObj.f_cmd.value=MULTI01;
			ib_flag="U";
		}else if(proc_gb == "D"){
			formObj.f_cmd.value=MULTI03;
			ib_flag="D";
		}    	
    	sheetObj.SetCellValue(1,"ar_ofc_cd",formObj.ar_ofc_cd.value,0);
    	sheetObj.SetCellValue(1,"inv_iss_tp_cd",formObj.inv_iss_tp_cd.value,0);
    	sheetObj.SetCellValue(1,"cpy_inv_knt",formObj.cpy_inv_knt.value,0);
    	sheetObj.SetCellValue(1,"xch_rt_usd_tp_cd",formObj.xch_rt_usd_tp_cd.value,0);
    	sheetObj.SetCellValue(1,"xch_rt_n3rd_tp_cd",formObj.xch_rt_n3rd_tp_cd.value,0);
    	sheetObj.SetCellValue(1,"xch_rt_rvs_flg",formObj.xch_rt_rvs_flg.value,0);
    	sheetObj.SetCellValue(1,"ots_smry_cd",formObj.ots_smry_cd.value,0);
    	sheetObj.SetCellValue(1,"inv_dup_flg",formObj.inv_dup_flg.value,0);
    	sheetObj.SetCellValue(1,"inv_mlt_bl_iss_flg",formObj.inv_mlt_bl_iss_flg.value,0);
    	sheetObj.SetCellValue(1,"dmdt_inv_aply_bl_flg",formObj.dmdt_inv_aply_bl_flg.value,0);
    	sheetObj.SetCellValue(1,"dmdt_ar_inv_iss_flg",formObj.dmdt_ar_inv_iss_flg.value,0);
    	sheetObj.SetCellValue(1,"n3pty_bil_ar_inv_flg",formObj.n3pty_bil_ar_inv_flg.value,0);
    	sheetObj.SetCellValue(1,"tml_inv_iss_flg",formObj.tml_inv_iss_flg.value,0);
    	sheetObj.SetCellValue(1,"inv_vat_chg_cd",inv_vat_chg_cd.GetSelectText(),0)  ;
    	sheetObj.SetCellValue(1,"inv_vat_chg_rt",formObj.inv_vat_chg_rt.value.replace(',',''),0);
    	sheetObj.SetCellValue(1,"mnr_ar_inv_iss_flg",formObj.mnr_ar_inv_iss_flg.value,0);
    	sheetObj.SetCellValue(1,"inv_top_rmk",formObj.inv_top_rmk.value,0);
    	sheetObj.SetCellValue(1,"inv_btm_rmk",formObj.inv_btm_rmk.value,0);
    	sheetObj.SetCellValue(1,"inv_cnt_rmk",formObj.inv_cnt_rmk.value,0);
    	sheetObj.SetCellValue(1,"cn_dp_flg",formObj.cn_dp_flg.value,0);

    	sheetObj.SetRowStatus(1,ib_flag);
    	var chg_cd_txt="";
		for (var i=1; i<=sheetObjects[1].RowCount(); i++) {
			for(var j=1; j<=6; j++){
				var chg_cd_val=sheetObjects[1].GetCellValue(i,"chg_cd"+j)
				if(chg_cd_val != ""){
					chg_cd_txt=chg_cd_txt +"|"+ sheetObjects[1].GetCellValue(i,"chg_cd"+j);
				}
			}
		}
		formObj.chg_cd.value=chg_cd_txt;
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
			case IBSEARCH:
	         	if (ar_ofc_cd2.GetSelectText()== "") {
	         		ComShowCodeMessage('INV00004');
	         		ComSetFocus(ar_ofc_cd2);
	 				return false;
	 			}	         	
	 			break;
			case IBSAVE:
				if(formObj.proc_gb.value == ""){
					alert("Do save after search!");
					return false;
		    	}
				if (ComIsNull(formObj.inv_iss_tp_cd)) {
	         		ComShowCodeMessage('INV00004');
	         		ComSetFocus(formObj.inv_iss_tp_cd);
	 				return;
	 			}
				if (ComIsNull(formObj.cn_dp_flg)) {
	         		ComShowCodeMessage('INV00004');
	         		ComSetFocus(formObj.cn_dp_flg);
	 				return;
	 			}
				if (ComIsNull(formObj.cpy_inv_knt)) {
	         		ComShowCodeMessage('INV00004');
	         		ComSetFocus(formObj.cpy_inv_knt);
	 				return false;
	 			}
				if (ComIsNull(formObj.xch_rt_usd_tp_cd)) {
	         		ComShowCodeMessage('INV00004');
	         		ComSetFocus(formObj.xch_rt_usd_tp_cd);
	 				return false;
	 			}
				if (ComIsNull(formObj.xch_rt_n3rd_tp_cd)) {
	         		ComShowCodeMessage('INV00004');
	         		ComSetFocus(formObj.xch_rt_n3rd_tp_cd);
	 				return false;
	 			}
				if (ComIsNull(formObj.ots_smry_cd)) {
	         		ComShowCodeMessage('INV00004');
	         		ComSetFocus(formObj.ots_smry_cd);
	 				return false;
	 			}
				if (ComIsNull(formObj.inv_dup_flg)) {
	         		ComShowCodeMessage('INV00004');
	         		ComSetFocus(formObj.inv_dup_flg);
	 				return false;
	 			}
				if (ComIsNull(formObj.inv_mlt_bl_iss_flg)) {
	         		ComShowCodeMessage('INV00004');
	         		ComSetFocus(formObj.inv_mlt_bl_iss_flg);
	 				return false;
	 			}
				if (ComIsNull(formObj.dmdt_inv_aply_bl_flg)) {
	         		ComShowCodeMessage('INV00004');
	         		ComSetFocus(formObj.dmdt_inv_aply_bl_flg);
	 				return false;
	 			}
				if (formObj.ots_smry_cd.value=="INV" && formObj.inv_dup_flg.value=="Y") {
					ComShowCodeMessage('INV00157', "INV Dup Flag");
	         		ComSetFocus(formObj.inv_dup_flg);
	 				return false;
	 			}
				if (formObj.ots_smry_cd.value=="INV" && formObj.inv_mlt_bl_iss_flg.value=="Y") {
	         		ComShowCodeMessage('INV00157', "Multi B/L INV");
	         		ComSetFocus(formObj.inv_mlt_bl_iss_flg);
	 				return false;
	 			}
				break;
    	 }
      return true;
     }
     /** 
      * Coding event for OnChange.<br> 
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param {IBMultiCombo} comboObj
	  * @param {String} oldIndex
	  * @param {String} oldText
	  * @param {String} oldCode
	  * @param {String} newIndex
	  * @param {String} newText
	  * @param {String} newCode
      * @return none.
      * @see #
      * @author 
      * @version 2009.10.19
      */ 
     function ar_ofc_cd2_OnChange(comboObj, OldIdx, OldTxt, OldCod, NewIdx, NewTxt, NewCod){
    	 sheetObjects[0].RowDelete(-1,false)

    	 if (ar_ofc_cd2.GetSelectText()!= "") {
    		 doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);    		
    	 }
     }
     /** 
      * Coding event for OnChange.<br> 
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param {IBMultiCombo} comboObj
	  * @param {String} oldIndex
	  * @param {String} oldText
	  * @param {String} oldCode
	  * @param {String} newIndex
	  * @param {String} newText
	  * @param {String} newCode
      * @return none.
      * @see #
      * @author 
      * @version 2009.10.19
      */ 
     function inv_vat_chg_cd_OnChange(comboObj, OldIdx, OldTxt, OldCod, NewIdx, NewTxt, NewCod,Index_Code, Text){  	 
    	 if(NewTxt != ""){

    		var formObject=inv_vat_chg_cd;
    		var itemindex=comboObj.GetSelectIndex();
    		if(itemindex == "-1"){
    			ComShowCodeMessage('INV00041',"["+NewTxt+"]");

	    		document.form.inv_vat_chg_cd_text.value="";
        		return false;
    		}
     	}
     }          
     /** 
      * Setting form object for modify.<br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  none.
      * @return none.
      * @see #
      * @author 
      * @version 2009.10.19
      */
     function modify_gb(){
    	 document.form.modifyGb.value='Y';
     }
     /** 
      * Setting combo box.<br>
      * curr_cd : currency code
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {IBSheet} sheetObj : Sheet object.  
      * @param  {String} comboValues
      * @param  {String} colName
      * @return (boolean) isCellCombo : CellComboItem, InitDataCombo
      * @see #
      * @author 
      * @version 2009.10.19
      */		
 	function addCellComboItem(sheetObj,comboValues,colName,isCellCombo) {
 		var sRow=sheetObj.GetSelectRow();
 		var comboTxt="";
 		var comboVal="";
 		var comboItems;
 		var comboItem;
 		var ROWMARK="|";
 		var FIELDMARK="=";
 		comboValues="|"+" "+comboValues;
 		if (comboValues != undefined) {
 			comboItems=comboValues.split(ROWMARK);
 			for (var i=1 ; i < comboItems.length ; i++) {
 				comboItem=comboItems[i].split(FIELDMARK);
 				if (comboItem[0] != "") {
 					comboTxt += comboItem[0];
 					comboVal += comboItem[0];
 				}
 				if (i < comboItems.length-1) {
 					comboTxt += ROWMARK;
 					comboVal += ROWMARK;
 				}				
 			}
 		}
 		if (isCellCombo) {
 			sheetObj.CellComboItem(sRow,colName, {ComboText:comboTxt, ComboCode:comboVal} );
 		}
 		else {
 			sheetObj.SetColProperty(colName, {ComboText:comboTxt, ComboCode:comboVal} );
 		}
 	}
 	/** 
     * Setting combo list.<br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  {object} cmbObj : form object.
     * @param  {String} arrStr
     * @return none.
     * @see #
     * @author 
     * @version 2009.10.19
     */
	function MakeComboObject2_1(cmbObj, arrStr, allYn) {
		cmbObj.RemoveAll();
   		for (var i=1; i < arrStr.length;i++ ) {
   			var arrStr2=arrStr[i].split(",");
   			var inv_vat_chg_cd=arrStr2[0];
   			//alert(arrStr2);
   			cmbObj.InsertItem(i-1, inv_vat_chg_cd, inv_vat_chg_cd);
   		}   		 		
   		cmbObj.InsertItem(0, "", "");
   	 }
