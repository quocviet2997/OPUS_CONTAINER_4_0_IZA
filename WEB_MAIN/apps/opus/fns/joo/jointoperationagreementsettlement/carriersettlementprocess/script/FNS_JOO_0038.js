/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : FNS_JOO_0038.js
 *@FileTitle: Summary of Monthly Clearance Status by VVD
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
 * @class FNS_JOO_0038 : business script for FNS_JOO_0038
 */
    function FNS_JOO_0038() {
    	this.processButtonClick=tprocessButtonClick;
    	this.setSheetObject=setSheetObject;
    	this.loadPage=loadPage;
    	this.initSheet=initSheet;
    	this.initControl=initControl;
    	this.doActionIBSheet=doActionIBSheet;
    	this.setTabObject=setTabObject;
    	this.validateForm=validateForm;
    }
 // common global variable
 var sheetObjects=new Array();
 var sheetCnt=0;
 var comboObjects=new Array();
 var comboCnt=0; 
 // Event handler processing by button click event */
 document.onclick=processButtonClick;
 // Event handler processing by button name */
     function processButtonClick(){
          /***** setting sheet object *****/
          var sheetObject1=sheetObjects[0];
          /*******************************************************/
          var formObject=document.form;
         try {
             var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
             switch(srcName) {
                 case "btn_Retrieve":
                     doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
                     break;
                 case "btn1_New":
                     doActionIBSheet(sheetObjects[0],document.form,IBRESET);
                     break;
                 case "btn1_Down_Excel":
                	 if(sheetObject1.RowCount() < 1){//no data
                			ComShowCodeMessage("COM132501");
                		}else{
                			  var paramObj=new Object();
                              var url=ComJooGetPgmTitle(sheetObjects[0], paramObj);  
                               sheetObjects[0].Down2Excel( {DownCols: makeHiddenSkipCol(sheetObjects[0]), SheetDesign:1,Merge:1 });
                		}
                     //sheetObjects[0].SpeedDown2Excel(-1); 
                     break;
                 case "btn1_Print":
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
         // initializing IBMultiCombo
         for(var k=0; k<comboObjects.length; k++){
            initCombo(comboObjects[k], k + 1);
         }            
         initControl();
         //doActionIBSheet(sheetObjects[0],document.form, IBCLEAR);
         sheet1_OnLoadFinish(sheet1);
     }
     function sheet1_OnLoadFinish(sheetObj) {
          doActionIBSheet(sheetObjects[0],document.form, IBCLEAR);
      }  
  /**
   * loading HTML Control event <br>
   * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
   * @param {ibsheet} sheetObj    IBSheet Object
   * @param {int}     sheetNo     sequence number in sheetObjects array
   **/
  function initControl() {
      var formObject=document.form;
//      axon_event.addListenerForm      ('keydown', 'ComKeyEnter',  formObject); //formObject);
//      axon_event.addListenerForm  ('keypress', 'fnObjKeyPress', formObject );           
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
        * setting IBCombo Object in comboObjects array
        * @param {IBMultiCombo} combo_obj    IBMultiCombo Object  
        **/
       function setComboObject(combo_obj){
          comboObjects[comboCnt++]=combo_obj;
       }      
       /**
        * setting Combo basic info
        */
       function initCombo(comboObj, comboNo) {
         switch(comboObj.options.id) {
             case "jo_crr_cd":  
                 with (comboObj) { 
                     SetMultiSelect(0);
                     SetUseAutoComplete(1);
                     SetColAlign(0, "left");
                     SetColWidth(0, "60");
                     SetDropHeight(160);
                     SetMaxLength(3);
                  }  
                  break;          
             case "jo_stl_itm_cd":
                 with(comboObj) {
                     SetMultiSelect(0);
                     SetUseAutoComplete(1);
                     SetColAlign(0, "left");
                     SetColWidth(0, "60");
                     SetDropHeight(160);
                     SetMaxLength(3);
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
             case 1:      // sheet1 init
                 with (sheetObj) {
                
	                 var HeadTitle="|VVD|VOY|Dir|Fin.Dir.|Account\nMonth|Combined No|Carrier|Lane|Item|Cur.|Rev.(Slip)|Exp.(Slip)|Register No.";
	                 //( ComCountHeadTitle(HeadTitle), 0, 0, true);
	                 SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
	                 var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
	                 var headers = [ { Text:HeadTitle, Align:"Center"} ];
	                 InitHeaders(headers, info);
	                 var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"Status" },
	                        {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"vsl_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                        {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"skd_voy_no",      KeyField:0,   CalcLogic:"",   Format:"",          PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                        {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"skd_dir_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                        {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"rev_dir_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                        {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"acct_yrmon",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                        {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"stl_cmb_seq",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                        {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"jo_crr_cd2",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                        {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"rlane_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                        {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"jo_stl_itm_cd2",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                        {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"locl_curr_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                        {Type:"AutoSum",   Hidden:0, Width:100,  Align:"Right",   ColMerge:0,   SaveName:"r_stl_locl_amt",  KeyField:0,   CalcLogic:"",   Format:"NullFloat",       PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
	                        {Type:"AutoSum",   Hidden:0, Width:100,  Align:"Right",   ColMerge:0,   SaveName:"e_stl_locl_amt",  KeyField:0,   CalcLogic:"",   Format:"NullFloat",       PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
	                        {Type:"Text",      Hidden:0,  Width:140,  Align:"Center",  ColMerge:0,   SaveName:"csr_no",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
	                  
	                 InitColumns(cols);
	                 SetEditable(0);
//	                 SetSheetHeight(520);
	                 resizeSheet();
                 }
                 break;
         }
     }
   // handling sheet process
     function doActionIBSheet(sheetObj,formObj,sAction) {
         sheetObj.ShowDebugMsg(false);
         switch(sAction) {
            case IBSEARCH:      //retrieve
                 if( !validateForm(sheetObj,formObj,sAction) ){return;}
                 formObj.f_cmd.value=SEARCHLIST01;            
                 var param=FormQueryString(formObj);  
                 sheetObj.DoSearch("FNS_JOO_0038GS.do", param );
                 break;
             case IBCLEAR:      //Open  
                  formObj.f_cmd.value=SEARCH01;            
                  var param=FormQueryString(formObj);
                  var sXml=sheetObj.GetSearchData("FNS_JOO_0038GS.do", param);
                  var aXml=sXml.split("|$$|");
                  ComXml2ComboItem( aXml[0], jo_crr_cd   , "code","code" );
                  ComXml2ComboItem( aXml[1], jo_stl_itm_cd, "code","code" );          
//                  formObj.vvd.focus();
                  break;
             case IBRESET:      //Open  
                  fnBtnNew();                   
                  break;      
         }
     }
     
     /**
      * 조회 후 처리
      * 
      * @param    sheetObj
      * @param    ErrMsg
      * @return   void
      */ 
     function sheet1_OnSearchEnd(sheetObj, ErrMsg) {	
         	sheetObj.SetSumText(0,"vsl_cd","TOTAL");
     }     
     
     /**
     * NEW button
     * @param    void
     * @return   void
     */    
     function fnBtnNew(){
         var formObj=document.form;
         formObj.vvd.value="";
         jo_crr_cd.SetSelectText("",false);
         jo_stl_itm_cd.SetSelectText("",false);
         if( sheetObjects[0].RowCount()> 0) {
             sheetObjects[0].RemoveAll();
         }
     }   
       /**
        * <pre>
        *     KeyPress Event of form Element.
        *    
        * </pre>
        * @return
        */
       function fnObjKeyPress(){
           var objNm=ComGetEvent();
           var formObj=document.form;
           switch (objNm){
                  case 'vvd':
                         ComKeyOnlyAlphabet('uppernum');
            break;
           }
       }
     /**
      * handling process for input validation
      */
     function validateForm(sheetObj,formObj,sAction){
         with(formObj){
             switch ( sAction ){
                  case IBSEARCH :
                       if (!ComChkValid(formObj)) return false;
                       if( vvd.value  == "") {
                           ComShowCodeMessage('JOO00039');     
                           return false;
                       }
//                       if( jo_crr_cd.Code == "") {
//                           ComShowCodeMessage('JOO00008');   
////                           jo_crr_cd.focus();
//                           return false;
//                       }                       
//                       
//                       if( jo_stl_itm_cd.Code == "") {
//                           ComShowCodeMessage('JOO00113');
////                           jo_stl_itm_cd.focus();
//                           return false;
//                       }                      
                       break;
             }
         }
         return true;
     }
     function jo_stl_itm_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
     	document.form.jo_stl_itm_cd_text.value = newCode;
     }
     
     function chss_mvmt_sts_cd_OnBlur() {
     	document.form.jo_stl_itm_cd_text.value = jo_stl_itm_cd.GetSelectCode();
     }
     function jo_crr_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
      	document.form.jo_crr_cd_text.value = newCode;
      }
      
      function jo_crr_cd_OnBlur() {
      	document.form.jo_crr_cd_text.value = jo_crr_cd.GetSelectCode();
      }

      function resizeSheet(){
    	    ComResizeSheet(sheetObjects[0]);
      }      