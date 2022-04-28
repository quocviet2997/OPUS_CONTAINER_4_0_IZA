/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0026.js
*@FileTitle  : Movement status
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/03
=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
			   MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
			   THER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/*------------------From here the common JavaScript function is defined.     ------------------*/
 /** Common global variable */
 var sheetObjects=new Array();
 var sheetCnt=0;
 var comboObjects=new Array();
 var comboCnt=0;
 /** Event handler processing by button click event */
 document.onclick=processButtonClick;
     /** Event handler processing by button name */
     function processButtonClick(){
         var formObj=document.form;
         try {
             var srcName=ComGetEvent("name");
             if(ComGetBtnDisable(srcName)) return false;
             switch(srcName) {
             case "btn_retrieve":
 				doActionIBSheet(sheetObjects[0],formObj,SEARCH02);
 				break;
             case "btn_new":
             	doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
             	break;
             case "btn_save":
             	doActionIBSheet(sheetObjects[0],formObj,MULTI01);
             	break;
             case "btn_mvmt_sts_search":
             	var sUrl="/opuscntr/COM_COM_0010.do?mvmt_sts_cd=" + formObj.mvmt_sts_cd.value +"&mdm_yn="+ formObj.mdm_yn.value+"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 770, 440, "get_mvmtStsCd", "1,0,1", true);
     		    break;
             }
         }catch(e) {
             if( e == "[object Error]") {
                 ComShowMessage(OBJECT_ERROR);
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
	function loadPage() {
		var formObj=document.form;
		for(i=0;i<sheetObjects.length;i++){
	         ComConfigSheet (sheetObjects[i] );
	         initSheet(sheetObjects[i],i+1);
	     }
	     initControl();
	     doActionIBCombo(sheetObjects[0], formObj, SEARCH01);
	     doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
	     // auth_tp_cd retrieve
	 	doActionIBSheet(sheetObjects[0], formObj, SEARCH01);
	 	if(G_MDAA_CHK == 'Y') {
	 		formObj.delt_flg.enable=true;
	 		ComSetDisplay('btn_save', true);
	 	} else {
	 		formObj.delt_flg.enable=false;
	 		ComSetDisplay('btn_save', false);
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
	           SetConfig( { SearchMode:2, DataRowMerge:0 } );
	           var info    = { Sort:1, ColMove:1, ColResize:1, HeaderCheck:1 };
	           var headers = [{Text: "", Align: "Center"}];
	           InitHeaders(headers, info);
	           var cols = [{}];
	           InitColumns(cols);
	           SetVisible(false);
         	}
    	    break;
         }
     }
     /**
      * All the combo box query
      */
 	function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
 		switch (sAction) {
 			case SEARCH01: // load page 
 				var sXml=sheetObj.GetSearchData("BCM_CCD_0026GS.do", "f_cmd=" + SEARCH01);
				var rtnValue=sXml.split("|$$|");
				for(var i=0; i<rtnValue.length; i++){
					var comboXml=ComXml2ComboString(rtnValue[i], "cd_desc", "cd");
					var cdName=comboXml[0].split("|");
					var cdValue=comboXml[1].split("|");
					for (var j=0; j < cdName.length; j++) {
						comboObjects[i].InsertItem(j, cdName[j], cdValue[j]);
		        	}
				}
      		break;
      	}
 	}
     // /handling sheet process
     function doActionIBSheet(sheetObj,formObj,sAction) {
     	switch(sAction) {
    	case SEARCH01: // MDM AUTH_TP_CD query
	    	var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=MDAA';
	    	var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
	    	// global var setting
	    	G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
	    	G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
	    	break;
     	case SEARCH02:				//query
     		if (validateForm(sheetObj, formObj, sAction)) {
 	    		formObj.f_cmd.value=SEARCH02;
 	    		sheetObj.SetWaitImageVisible(0);
 	        	ComOpenWait(true);
 	    		var sParam=FormQueryString(formObj);
 	    		var sXml=sheetObj.GetSearchData("BCM_CCD_0026GS.do", sParam);
 	    		var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
 	    		if(sav != "S" ){
 	        		ComOpenWait(false);
 	        		return;
 	    		}
 	    		if(ComXmlString(sXml, "delt_flg") == null || ComXmlString(sXml, "delt_flg") == ""){
	    			ComOpenWait(false);
       				// showing message when data not exists
	    			if (G_MDAA_CHK == "Y") {
       					if (ComShowCodeConfirm("COM130407", "Movement Status Code")) {
       	 	    			formObj.mvmt_sts_cd.readOnly=true;
       	 	    			formObj.mvmt_sts_nm.focus();
       					} else {
       						doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
       					}
       				} else {
       					ComShowCodeMessage("COM130402", "Movement Status Code");
       					doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
       				}
	    			return;
 	    		}
 	    		formObj.ibflag.value="U";
 	    		
 	    		formObj.mvmt_sts_nm.value=getValueForCombo(ComXmlString(sXml, "mvmt_sts_nm"));
 	    		dest_yd_flg.SetSelectCode(getValueForCombo(ComXmlString(sXml, "dest_yd_flg")));
 	    		io_bnd_cd.SetSelectCode(getValueForCombo(ComXmlString(sXml, "io_bnd_cd")));
 	    		delt_flg.SetSelectCode(getValueForCombo(ComXmlString(sXml, "delt_flg")),false);
 	    		formObj.cre_usr_id.value=getValueForCombo(ComXmlString(sXml, "cre_usr_id"));
 	    		formObj.cre_dt.value=getValueForCombo(ComXmlString(sXml, "cre_dt"));
 	    		formObj.upd_usr_id.value=getValueForCombo(ComXmlString(sXml, "upd_usr_id"));
 	    		formObj.upd_dt.value=getValueForCombo(ComXmlString(sXml, "upd_dt"));
 	    		ComOpenWait(false);
 	    		formObj.mvmt_sts_cd.readOnly=true;
     		}
     		break;
     	case MULTI01:				//save
     		if (validateForm(sheetObj, formObj, sAction)) {
 	    		formObj.f_cmd.value=MULTI01;
 	    		if(ComShowConfirm(ComGetMsg("COM130101", "Data"))){
	 	    		sheetObj.SetWaitImageVisible(0);
	 	        	ComOpenWait(true);
	 	    		var sParam=FormQueryString(formObj);
	 	    		var sXml=sheetObj.GetSaveData("BCM_CCD_0026GS.do", sParam);
	 	    		var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
	 	    		if(sav == "S" ){					//Saved after a successful re-viewed
		    			ComShowCodeMessage("COM130102", "Data");
		    			doActionIBSheet(sheetObj,formObj,SEARCH02);
		        	}else{
		        		ComShowCodeMessage("COM132103", "Data");
		        	}
	 	    		ComOpenWait(false);
 	    		}
     		}
     		break;
     	case IBCLEAR:
     		formObj.reset();
     		formObj.mvmt_sts_cd.readOnly=false;			
     		dest_yd_flg.SetSelectCode("N");
     		delt_flg.SetSelectCode("N");
     		break;
     	}
     }
     /**
      * handling process for input validation
      */
     function validateForm(sheetObj, formObj, sAction) {
     	switch (sAction) {
     	case SEARCH02:
     		if(formObj.mvmt_sts_cd.value == "" || formObj.mvmt_sts_cd.value == null){
     			ComShowCodeMessage("CCD00001", "Movement Status Code");
     			formObj.mvmt_sts_cd.focus();
     			return false;
     		}
     		break;
     	case MULTI01:
     		if(formObj.mvmt_sts_cd.value == "" || formObj.mvmt_sts_cd.value == null){
     			ComShowCodeMessage("CCD00001", "Movement Status Code");
     			formObj.mvmt_sts_cd.focus();
     			return false;
     		}
     		if(formObj.mvmt_sts_nm.value == "" || formObj.mvmt_sts_nm.value == null){
     			ComShowCodeMessage("CCD00001", "Name");
     			formObj.mvmt_sts_nm.focus();
     			return false;
     		}
     	}
     	return true;
     }
    function delt_flg_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){
    	if(comboObj.GetSelectCode()== "Y"){
    		  if(!ComShowCodeConfirm("COM130301", "data")) comboObj.SetSelectCode("N",false);
        }
    }
 	function initControl() {
 		var formObj=document.form;
// 		axon_event.addListenerForm('focus', 'obj_focus', form);
 		axon_event.addListenerForm('change', 'obj_change', form); 		
// 		axon_event.addListenerForm('keypress', 'obj_keypress', form); 	
// 		axon_event.addListenerForm('keyup', 'obj_keyup', form); 		
// 		axon_event.addListenerForm('keydown', 'obj_keydown', form); 	
// 		axon_event.addListenerForm('keydown', 'ComKeyEnter', form);
 		axon_event.addListenerForm("propertychange", "obj_propertychange", formObj);
 	}
    /**
    * OnKeyUp event handling in HTML Object
    */
//   function obj_keypress(event) {
//     	obj=event.srcElement;
//     	keyValidation(obj);
//    }
    /**
    * If the data field to be the CHANGE Event
    */
   function obj_change(){
	   	var formObj=document.form;
	   	try {
	   		var srcName=ComGetEvent("name");
	           switch(srcName) {
	           case "mvmt_sts_cd":
	           		if(formObj.mvmt_sts_cd.value.length>0){
	           			doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
	           		}
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
  function get_mvmtStsCd(rowArray) {
  		var sheetObj=sheetObjects[0];
  	    var formObj=document.form;
  	   	var colArray=rowArray[0];
  		formObj.mvmt_sts_cd.value=colArray[2];
  		if(formObj.mvmt_sts_cd.value != ""){
  			doActionIBSheet(sheetObjects[0],formObj,SEARCH02);
  		}
  }
  
  function getValueForCombo(obj) {
	  if (Object.prototype.toString.call(obj) === '[object Array]') {
		  var str = obj[0];
		  return str.split('|')[0];
	  }
	  return obj;
  }
