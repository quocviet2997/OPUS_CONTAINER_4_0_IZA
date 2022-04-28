/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0024.js
*@FileTitle  : daylight saving time
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/03
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
var srcName0 = "";
$(function(){
	

});

/** Event handler processing by button click event */
document.onclick=processButtonClick;
function processButtonClick1(){ // onblur보다 new이벤트 먼저타게 처리 
	 srcName0=ComGetEvent("name");
 
}
/** Event handler processing by button name */
 function processButtonClick(){
     /*****Case more than two additional sheets tab sheet is used to specify a variable *****/
    var sheetObject1=sheetObjects[0];
       /*******************************************************/
     var formObject=document.form;
    try {
        var srcName=ComGetEvent("name");
      
          switch(srcName) {
                case "btn_Retrieve":
                    doActionIBSheet(sheetObject1, formObject, IBSEARCH);
                    break;
                case "btn_New":
                    clearAllData(sheetObject1, formObject);
                    
                    break;
                case "btn_Save":
                    doActionIBSheet(sheetObject1, formObject, IBSAVE);
                    break;
                case "btns_search":
                    var sUrl="/opuscntr/COM_COM_0005.do?dst_id=" + formObject.dst_id.value +"&main_page=false"+"&mdm_yn="+ formObject.mdm_yn.value + "&delt_flg=" + formObject.delt_flg.value;
                    var rVal=ComOpenPopup(sUrl, 800, 420, "dstIdHelp", "0,0", true);
                    break;                      
                case "btns_search1":
                    var formObj=document.form;
                    var sUrl="/opuscntr/COM_ENS_0M1.do?cnt_cd=" + formObj.dst_cnt_cd.value +"&main_page=false";
                    var rVal=ComOpenPopup(sUrl, 800, 460, "cntCodeHelp", "0,0", true);
                    break;
                case "btns_search2":
                    var formObj=document.form;
                    var sUrl="/opuscntr/COM_ENS_0X1.do?ste_cd=" + formObj.dst_not_aply_ste_cd.value +"&main_page=false";
                    var rVal=ComOpenPopup(sUrl, 650, 400, "steCodeHelp", "0,0,1,1,1", true);
                    break;
                case "btns_Calendar1" :     // Start Date
                    var cal=new ComCalendar();
                    cal.setDisplayType('date');
                    cal.select(formObject.st_dst_dt, "yyyy-MM-dd");
                    break;
                case "btns_Calendar2" :     // End Date
                    var cal=new ComCalendar();
                    cal.setDisplayType('date');
                    cal.select(formObject.end_dst_dt, "yyyy-MM-dd");
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
    for(var k=0;k<comboObjects.length;k++){
        initCombo(comboObjects[k],k+1);
    }
    initControl();
    document.form.ibflag.value="I";
    var formObj=document.form;
    // auth_tp_cd retrieve
    doActionIBSheet(sheetObjects[0], formObj, SEARCH03);
    if(G_MDAA_CHK == 'Y') {
        ComEnableObject(formObj.delt_flg, true);
        ComSetDisplay('btn_Save', true);
    } else {
        ComEnableObject(formObj.delt_flg, false);
        ComSetDisplay('btn_Save', false);
    }
  }
  /**
   * Define an event control
   */
  function initControl() {
    var formObj=document.form;
    //axon_event.addListenerForm('focus', 'obj_focus', formObj);
    //axon_event.addListenerFormat ('keypress', 'obj_keypress', form);
    //axon_event.addListenerForm  ('change', 'obj_change', form);
    //axon_event.addListenerForm  ('beforedeactivate', 'obj_deactivate',  form);     //focus out
    //ComClearSeparator (document.form.dst_id,"eng"); //Only English 
    //ComClearSeparator (document.form.dst_cnt_cd,"eng"); //Only English
    //ComClearSeparator (document.form.dst_not_aply_ste_cd,"eng"); //Only English
    //ComClearSeparator (document.form.dst_yr,"eng"); //Only English
    //ComClearSeparator (document.form.dst_yr,"eng"); //Only English
    //ComClearSeparator (document.form.dst_mnts,"eng"); //Only English
    //ComClearSeparator (document.form.end_dst_rule_desc,"eng"); //Only English
    //ComClearSeparator (document.form.st_dst_dt,"eng"); //Only English
    //ComClearSeparator (document.form.end_dst_dt,"eng"); //Only English
    //ComClearSeparator (document.form.st_dst_hrmnt,"eng"); //Only English
    //ComClearSeparator (document.form.end_dst_hrmnt,"eng"); //Only English
    //ComClearSeparator (document.form.delt_flg,"eng"); //Only English
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
        case "sheet1":      //sheet1 init
            with(sheetObj){
          

         var HeadTitle="";
         var headCount=ComCountHeadTitle(HeadTitle);
         var prefix="sheet1_";
         

         SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );

         var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
         var headers = [ { Text:HeadTitle, Align:"Center"} ];
         InitHeaders(headers, info);

         var cols = [ {Type:"",    Hidden:1, Width:20,   Align:"",    ColMerge:0,   SaveName:"",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
          
         InitColumns(cols);

         SetEditable(0);
         SetWaitImageVisible(0);
         SetVisible(false);
         
        }
           break;
       }
   }
  //Sheet processing-related processes 
   function doActionIBSheet(sheetObj,formObj,sAction) {
	   document.body.focus();
       var prefix="sheet1_";
       switch(sAction) {
        case IBSEARCH:      //retrieve
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                
                formObj.f_cmd.value=SEARCH;
                var dst_id_org=formObj.dst_id.value;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0024GS.do", sParam);
                sheetObj.LoadSearchData(sXml,{Sync:1} );
                var dst_id=ComXmlString(sXml, "dst_id");
                if(dst_id == ""){
                    // showing message when data not exists
                    if (G_MDAA_CHK == "Y") {
                        if (ComShowCodeConfirm("COM130407", "DST Code")) {
                            formObj.reset();
                            formObj.dst_id.value=dst_id_org;
                            formObj.delt_flg.value="N";
                            formObj.ibflag.value="I";
                            formObj.dst_id.readOnly=true;
                             
                            //formObj.dst_cnt_cd.focus();
                             
                        } else {
                            //doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
                            clearAllData(sheetObjects[0], formObj);
                        }
                    } else {
                        ComShowCodeMessage("COM130402", "DST Code");
                        //doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
                        clearAllData(sheetObjects[0], formObj);
                    }
                    return;
                }else{
                    formObj.dst_id.value=dst_id;
                    formObj.dst_cnt_cd.value=ComXmlString(sXml, "dst_cnt_cd");
                    formObj.dst_not_aply_ste_cd.value=ComXmlString(sXml, "dst_not_aply_ste_cd");
                    formObj.dst_yr.value=ComXmlString(sXml, "dst_yr");
                    formObj.dst_mnts.value=ComXmlString(sXml, "dst_mnts");
                    formObj.st_dst_rule_desc.value=ComXmlString(sXml, "st_dst_rule_desc");
                    formObj.end_dst_rule_desc.value=ComXmlString(sXml, "end_dst_rule_desc");
                    formObj.st_dst_dt.value=ComGetMaskedValue(ComXmlString(sXml, "st_dst_dt"),"ymd");
                    formObj.end_dst_dt.value=ComGetMaskedValue(ComXmlString(sXml, "end_dst_dt"),"ymd");
                    formObj.st_dst_hrmnt.value=ComGetMaskedValue(ComXmlString(sXml, "st_dst_hrmnt"),"hm");
                    formObj.end_dst_hrmnt.value=ComGetMaskedValue(ComXmlString(sXml, "end_dst_hrmnt"),"hm");
                    formObj.delt_flg.value=ComXmlString(sXml, "delt_flg");
                    formObj.ibflag.value="U";
                    formObj.dst_id.readOnly=true;
                   
                }
                document.getElementById("dst_cnt_cd").blur();
            }
        break;
        case IBSAVE:
            if(validateForm(sheetObj,formObj,sAction)){
                formObj.f_cmd.value=MULTI;
                var sParam=FormQueryString(formObj);
                if(ComShowCodeConfirm("COM130101", "Data")){
                    ComOpenWait(true);
                    var sXml=sheetObj.GetSaveData("BCM_CCD_0024GS.do", sParam + "&" + ComGetPrefixParam("sheet1_"));
                    sheetObj.LoadSaveData(sXml);
                    var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
                    if(result != "F"){
                        ComShowCodeMessage("COM130102", "Data");
                        doActionIBSheet(sheetObj, formObj, IBSEARCH);
                    }else{
                        ComShowCodeMessage("COM130103", "Data");
                    }
                }
            }
        break;
        case SEARCH03: // MDM AUTH_TP_CD query
            var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=MDAA';
            var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
            // global var setting
            G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
            G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
        break;
        case SEARCH01:      //Country check
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH01;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0024GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Country");
                    formObj.dst_cnt_cd.value="";
                    //formObj.dst_cnt_cd.focus();
                }
                ComOpenWait(false);
                
            }
        break;
        case SEARCH02:      //State check
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH02;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0024GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "State");
                    formObj.dst_not_aply_ste_cd.value="";
                    //formObj.dst_not_aply_ste_cd.focus();
                }
                ComOpenWait(false);
                
            }
            break;
       }
   }
   /**
    * On-screen form validation process for the value of the input processing   */
   function validateForm(sheetObj,formObj,sAction){
    switch(sAction) {
	    
        case IBSEARCH:      //retrieve
            if(formObj.dst_id.value == ""){
                ComShowCodeMessage("CCD00001", "DST Code");
                formObj.dst_id.focus();
                return false;
            }
            break;
        case IBSAVE:        //save
        	
        	
            if(formObj.dst_id.value == ""){
                ComShowCodeMessage("CCD00001", "DST Code");
                formObj.dst_id.focus();
                return false;
            }
            if(formObj.dst_cnt_cd.value == ""){
                ComShowCodeMessage("CCD00001", "Country");
                formObj.dst_cnt_cd.focus();
                return false;
            }
            
            if(formObj.dst_yr.value == ""){
                ComShowCodeMessage("CCD00001", "DST Year");
                formObj.dst_yr.focus();
                return false;
            }
            
            if(formObj.dst_mnts.value == ""){
                ComShowCodeMessage("CCD00001", "DST Diff");
                formObj.dst_mnts.focus();
                return false;
            }
            
            if(formObj.st_dst_dt.value == ""){
                ComShowCodeMessage("CCD00001", "Start Date");
                formObj.st_dst_dt.focus();
                return false;
            }
            
            if(formObj.end_dst_dt.value == ""){
                ComShowCodeMessage("CCD00001", "END Date");
                formObj.end_dst_dt.focus();
                return false;
            }
            
            if(formObj.st_dst_hrmnt.value == ""){
                ComShowCodeMessage("CCD00001", "Start Time");
                formObj.st_dst_hrmnt.focus();
                return false;
            }
            if(formObj.end_dst_hrmnt.value == ""){
                ComShowCodeMessage("CCD00001", "End Time");
                formObj.end_dst_hrmnt.focus();
                return false;
            }
            if(formObj.st_dst_dt.value != "" && formObj.end_dst_dt.value != ""){
                if(formObj.st_dst_dt.value>formObj.end_dst_dt.value){
                    ComShowCodeMessage("COM132002");
                    formObj.end_dst_dt.focus();
                    return false;
                }
            }
            if(formObj.st_dst_dt.value != "" && (formObj.st_dst_dt.value == formObj.end_dst_dt.value)){
                if(formObj.st_dst_hrmnt.value>formObj.end_dst_hrmnt.value){
                    ComShowCodeMessage("CCD00005", "The End time", "the start time");
                    formObj.end_dst_hrmnt.focus();
                    return false;
                }
            }
            break;
    }
       return true;
   }
    /**
     * If the data field to be the CHANGE Event
     */
    function obj_change(){
    	//document.body.focus();
        var formObject=document.form;
        /*****Case more than two additional sheets tab sheet is used to specify a variable *****/
        var sheetObject1=sheetObjects[0];
        processButtonClick(); 
        /*******************************************************/
        try {
        	if(srcName0 == "btn_New"){
        		return true;
        	}
            var srcName=ComGetEvent("name");
            
            switch(srcName) {
                case "dst_id":
                    if(formObject.dst_id.value.length>0){
                        doActionIBSheet(sheetObject1, formObject, IBSEARCH);
                    }
                break;
                case "dst_cnt_cd":
                    if(formObject.dst_cnt_cd.value.length>0){
                    	 
                        doActionIBSheet(sheetObject1, formObject, SEARCH01);
                    }
                break;
                case "dst_not_aply_ste_cd":
                    if(formObject.dst_not_aply_ste_cd.value.length>0){
                    	 
                        doActionIBSheet(sheetObject1, formObject, SEARCH02);
                    }
                break;
                case "delt_flg" :
                    if(formObject.delt_flg.value == "Y") {
                        if(!ComShowCodeConfirm("COM130301", "data")) formObject.delt_flg.value="N";
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
     function clearAllData(sheetObj, formObj){
        formObj.reset();
        formObj.ibflag.value="I";
        formObj.dst_id.readOnly=false;
        srcName0 = "";
     }
     function dstIdHelp(rowArray) {
        var formObj=document.form;
        var sheetObj=sheetObjects[0];
        var colArray=rowArray[0];   
        formObj.dst_id.value=colArray[3];
        doActionIBSheet(sheetObj, formObj, IBSEARCH);
     }
     function cntCodeHelp(rowArray) {
        var formObj=document.form;
        var colArray=rowArray[0];   
        formObj.dst_cnt_cd.value=colArray[1];
     }
     function steCodeHelp(rowArray) {
        var formObj=document.form;
        var colArray=rowArray[0];   
        formObj.dst_not_aply_ste_cd.value=colArray[3];
     }

function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) {
    ComOpenWait(false);
}

function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) {
    ComOpenWait(false);
}
