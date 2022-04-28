/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName :  FNS_JOO_0043.js
 *@FileTitle: Slot Exchange Status by Lane & Partner->Finance &amp Partner
 *@author   : CLT
 *@version  : 1.0
 *@since    : 2014/06/19
 =========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class FNS_JOO_0043 : business script for FNS_JOO_0043
 */
    function FNS_JOO_0043() {
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
 // Event handler processing by button click event */
 document.onclick=processButtonClick;
 // Event handler processing by button name */
     function processButtonClick(){
          /***** setting sheet object *****/
          var sheetObject1=sheetObjects[0];
          /*******************************************************/
          var formObj=document.form;
         try {
             var srcName=ComGetEvent("name");
             switch(srcName) {
                 case "btn_Retrieve":
                     doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
                     break;
                 case "btn_New":
                     doActionIBSheet(sheetObjects[0],document.form,IBRESET);
                     break;
                 case "btn_Down_Excel":
                	 if(sheetObject1.RowCount() < 1){//no data
                		 ComShowCodeMessage("COM132501");
        	       	}else{        	       			  
        	       		 var paramObj=new Object();
                         paramObj.cols=10;
                         var url=ComJooGetPgmTitle(sheetObjects[0], paramObj);  
                         sheetObjects[0].Down2Excel({ HiddenColumn:1,Merge:1});
                         sheetObjects[1].Down2Excel({ HiddenColumn:1,Merge:1});
        	       	}	
                     
//                     var paramObj=new Object();
//                     paramObj.cols=10;
//                     var url=ComJooGetPgmTitle(sheetObjects[0], paramObj);  
//                     sheetObjects[0].Down2Excel({ HiddenColumn:-1,Merge:true,URL:"url"});
//                     sheetObjects[1].Down2Excel({ HiddenColumn:-1});
                     break;
                 case "btn_acct_yrmon_back":
                     if (formObj.acct_yrmon.value != "" ){
                         formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M",-1).substring(0,7);    
                     }
                     fnBtnNew();              
                     break;
                case "btn_acct_yrmon_next":
                     if (formObj.acct_yrmon.value != "" ){
                        formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M",+1).substring(0,7);    
                     }
                     fnBtnNew();                      
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
         initControl();
      }
       /**
        * loading HTML Control event <br>
        * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
        * @param {ibsheet} sheetObj    IBSheet Object
        * @param {int}     sheetNo     sequence number in sheetObjects array
        **/
       function initControl() {
           var formObject=document.form;
          // axon_event.addListenerForm  ('keydown', 'ComKeyEnter',  formObject);  
          // axon_event.addListenerForm  ('keypress', 'fnObjKeyPress', formObject );
//           axon_event.addListener      ('click',   'fnDocClick', "btn_acct_yrmon_back"       );         
//           axon_event.addListener      ('click',   'fnDocClick', "btn_acct_yrmon_next"       );  
           axon_event.addListenerFormat('blur'   ,  'fnDeactivate',  formObject);  
           axon_event.addListenerFormat('focus'  ,  'fnActivate'  ,  formObject);           
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
                 
	                 var sYYYYmm=yyyyMM.substring(0,4)+"-01";
	                 var HeadTitle="|Partner|"+yyyyMM+"|"+yyyyMM+"|"+yyyyMM+"|"+sYYYYmm+" ~ "+yyyyMM+"|"+sYYYYmm+" ~ "+yyyyMM;
	                 var HeadTitle1="|Partner|Slot|Price|Amount|Slot|Amount";
	//                 (ComCountHeadTitle(HeadTitle), 0, 0, true);
	                 SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
	                 var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	                 var headers = [ { Text:HeadTitle, Align:"Center"},
	                             { Text:HeadTitle1, Align:"Center"} ];
	                 InitHeaders(headers, info);
	                 var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"Status" },
	                        {Type:"Text",      Hidden:0,  Width:200,  Align:"Center",  ColMerge:1,   SaveName:"jo_crr_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                        {Type:"AutoSum",   Hidden:0, Width:100,  Align:"Right",   ColMerge:0,   SaveName:"cur_stl_bsa_qty",    KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                        {Type:"AutoSum",   Hidden:0, Width:100,  Align:"Right",   ColMerge:0,   SaveName:"prc",                KeyField:0,   CalcLogic:"|stl_locl_amt|/|cur_stl_bsa_qty|",Format:"Float",       PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
	                        {Type:"AutoSum",   Hidden:0, Width:200,  Align:"Right",   ColMerge:0,   SaveName:"stl_locl_amt",       KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
	                        {Type:"AutoSum",   Hidden:0, Width:160,  Align:"Right",   ColMerge:0,   SaveName:"term_stl_bsa_qty",   KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                        {Type:"AutoSum",   Hidden:0, Width:200,  Align:"Right",   ColMerge:0,   SaveName:"term_stl_locl_amt",  KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];                 
	                 InitColumns(cols);
	                 SetEditable(0);
	                 SetSheetHeight(184);
                }
                 break;
             case 2:      // sheet1 init
                 with (sheetObj) {        
	                 var sYYYYmm=yyyyMM.substring(0,4)+"-01";
	                 var HeadTitle="Partner|"+yyyyMM+"|"+yyyyMM+"|"+yyyyMM+"|"+sYYYYmm+" ~ "+yyyyMM+"|"+sYYYYmm+" ~ "+yyyyMM;
	                 var HeadTitle1="Partner|Slot|Price|Amount|Slot|Amount";
	//                 (ComCountHeadTitle(HeadTitle), 0, 0, true);
	
	                 SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
	
	                 var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	                 var headers = [ { Text:HeadTitle, Align:"Center"},
	                             { Text:HeadTitle1, Align:"Center"} ];
	                 InitHeaders(headers, info);
	
	                 var cols = [ {Type:"Text",      Hidden:0,  Width:200,  Align:"Center",  ColMerge:1,   SaveName:"jo_crr_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			                        {Type:"AutoSum",   Hidden:0, Width:100,  Align:"Right",   ColMerge:0,   SaveName:"cur_stl_bsa_qty",    KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			                        {Type:"AutoSum",   Hidden:0, Width:100,  Align:"Right",   ColMerge:0,   SaveName:"prc",                KeyField:0,   CalcLogic:"|stl_locl_amt|/|cur_stl_bsa_qty|",Format:"Float",       PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
			                        {Type:"AutoSum",   Hidden:0, Width:200,  Align:"Right",   ColMerge:0,   SaveName:"stl_locl_amt",       KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:1,   InsertEdit:1 },
			                        {Type:"AutoSum",   Hidden:0, Width:160,  Align:"Right",   ColMerge:0,   SaveName:"term_stl_bsa_qty",   KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			                        {Type:"AutoSum",   Hidden:0, Width:200,  Align:"Right",   ColMerge:0,   SaveName:"term_stl_locl_amt",  KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];                  
	                 InitColumns(cols);
	                 SetEditable(0);  
	                 SetSheetHeight(190);
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
                   var sXml=sheetObj.GetSearchData("FNS_JOO_0043GS.do", param);
                  var aXml=sXml.split("|$$|");
                  sheetObjects[0].LoadSearchData(aXml[0],{Sync:1} );
                  sheetObjects[1].LoadSearchData(aXml[1],{Sync:1} );
                  fnSetTitle();
                  break;
             case IBRESET:      
                  fnBtnNew();   
                  formObj.acct_yrmon.value=yyyyMM;
                  break;    
         }
     }
      /**
       * year month NAVI event 
       * @param void
       * @return void
       */
       function fnDocClick(){
           var objNm=event.srcElement;
           var formObj=document.form;
           switch (objNm){
               case "btn_acct_yrmon_back":
                   if (formObj.acct_yrmon.value != "" ){
                       formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M",-1).substring(0,7);    
                   }
                   fnBtnNew();              
                   break;
              case "btn_acct_yrmon_next":
                   if (formObj.acct_yrmon.value != "" ){
                      formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M",+1).substring(0,7);    
                   }
                   fnBtnNew();                      
                   break;
           }
       } 
      /**
      * NEW button
      * @param    void
      * @return   void
      */    
      function fnBtnNew(){
          var formObj=document.form;
          for(var i=0;i<sheetObjects.length;i++){
              if( sheetObjects[i].RowCount()> 0) {
                  sheetObjects[i].RemoveAll();
              }
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
           var obj=event.srcElement;
           var formObj=document.form;
           switch(ComGetEvent("name")){
                  case   'acct_yrmon':
                         ComKeyOnlyNumber( obj );
                         break;
           }
       }
      /**
       * <pre>
       *     input validation,
       *     focus out.
       * </pre>
       * 
       * @return void
       */ 
      function fnDeactivate(){ 
          switch(ComGetEvent("name")){
              case 'acct_yrmon':
                  ComAddSeparator(ComGetEvent());
                  break;
          }
      }
       /**
        * <pre>
        *     input validation,
        *     on focus.
        * </pre>
        * 
        * @return void
        */ 
       function fnActivate(){
           switch(ComGetEvent("name")){
               case 'acct_yrmon':
                   ComClearSeparator(ComGetEvent());
                   break;
           }
           event.srcElement.select();
       }        
      /**
       * handling process for input validation
       */
      function validateForm(sheetObj,formObj,sAction){
          with(formObj){
              switch ( sAction ){
                   case IBSEARCH :
                        if (!ComChkValid(formObj)) return false;
                        break;
              }
          }
          return true;
      }
      function fnSetTitle(){
          var formObj=document.form;
          for(var i=0;i<2;i++){
          sheetObjects[i].SetCellText(0,"cur_stl_bsa_qty" ,formObj.acct_yrmon.value);
          sheetObjects[i].SetCellText(0,"prc"             ,formObj.acct_yrmon.value);
          sheetObjects[i].SetCellText(0,"stl_locl_amt"    ,formObj.acct_yrmon.value);
          var sYYYYmm=formObj.acct_yrmon.value.substring(0,4)+"-01";
          sheetObjects[i].SetCellText(0,"term_stl_bsa_qty"    ,sYYYYmm+" ~ "+formObj.acct_yrmon.value);
          sheetObjects[i].SetCellText(0,"term_stl_locl_amt"    ,sYYYYmm+" ~ "+formObj.acct_yrmon.value);
          }
      }
