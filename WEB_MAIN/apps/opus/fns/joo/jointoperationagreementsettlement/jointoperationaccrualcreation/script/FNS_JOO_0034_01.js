/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : fns_joo_0034_01.js
 *@FileTitle: Estimate Code Check - Carrier
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
 * @class fns_joo_0034_01 : business script for fns_joo_0034_01
 */
 // common global variable
 var tabObjects=new Array();
 var tabCnt=0 ;
 var beforetab=1;
 var sheetObjects=new Array();
 var sheetCnt=0;
 // Event handler processing by button click event */
 document.onclick=processButtonClick;
 // Event handler processing by button name */
     function processButtonClick(){
          /***** setting sheet object *****/
          var sheetObject=sheetObjects[0];
          /*******************************************************/
          var formObj=document.form;
         try {
             var srcName=ComGetEvent("name");
             switch(srcName) {
                 case "btn_retrive":
                     doActionIBSheet(sheetObject,formObj,IBSEARCH);
                     break;
                 case "btn_new":
                   //  if( sheetObject.RowCount()> 0 ){
                         sheetObject.RemoveAll();
                     //}
                     //formObj.acct_yrmon.value=yyyyMM;
                     
                     var tmpAcctYm = ComGetDateAdd(ComGetNowInfo("ym","-")+"-02","M", -1);
                     formObj.acct_yrmon.value=JooGetDateFormat(tmpAcctYm,"ym");
                     
                     break;
                 case "btn_downExcel":
                	 if(sheetObject.RowCount() < 1){//no data
                  		 ComShowCodeMessage("COM132501");
       	       		}else{
       	       			sheetObject.Down2Excel({ HiddenColumn:1,Merge:1});
       	       		}	                   
                     break;//
                 case "btn_next":
                     if (formObj.acct_yrmon.value != "" ){
                         formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M",+1).substring(0,7);    
                     }
                     sheetObjects[0].RemoveAll();
                     doActionIBSheet(sheetObjects[0],formObj,IBSEARCH);                 
                     break;
                 case "btn_back":
                     if (formObj.acct_yrmon.value != "" ){
                        formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M",-1).substring(0,7);    
                     }
                     sheetObjects[0].RemoveAll();
                     doActionIBSheet(sheetObjects[0],formObj,IBSEARCH);                 
                     break;   
             } // end switch
         }catch(e) {
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
            // doActionIBSheet(sheetObjects[i],document.form,IBSEARCH);
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
    	 var formObj=document.form;
          
         var tmpAcctYm = ComGetDateAdd(formObj.acct_yrmon.value+"-02","M", -1);
         formObj.acct_yrmon.value=JooGetDateFormat(tmpAcctYm,"ym");	
              
      }
   /**
      * setting sheet initial values and header
      * param : sheetObj, sheetNo
      * adding case as numbers of counting sheets
      */
     function initSheet(sheetObj,sheetNo) {
         var cnt=0;
         switch(sheetNo) {
             case 1:      //t1sheet1 init
                 with (sheetObj) {               
	                 var HeadTitle="Seq.|Lane|Carrier Code|Rev./Exp.";
	                 var headCount=ComCountHeadTitle(HeadTitle);
	//                 (headCount, 0, 0, true);
	                 SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
	                 var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	                 var headers = [ { Text:HeadTitle, Align:"Center"} ];
	                 InitHeaders(headers, info);
	                 var cols = [ {Type:"Seq",       Hidden:0, Width:100,  Align:"Center",  ColMerge:1,   SaveName:"SEQ" },
			                     {Type:"Text",      Hidden:0,  Width:300,  Align:"Center",  ColMerge:1,   SaveName:"rlane_cd",      KeyField:0,   CalcLogic:"",   Format:"" },
			                     {Type:"Text",      Hidden:0,  Width:200,  Align:"Center",  ColMerge:1,   SaveName:"jo_crr_cd",     KeyField:0,   CalcLogic:"",   Format:"" },
			                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"bsa_op_jb_cd",  KeyField:0,   CalcLogic:"",   Format:"" } ];
	                  
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
                 if(!validateForm(sheetObj,formObj,sAction)){ return;}
                 formObj.f_cmd.value=SEARCHLIST01;            
                 var param=FormQueryString(formObj);
                 param=param.replace("acct_yrmon","")+"&acct_yrmon="+formObj.acct_yrmon.value.replace("-","");
                  sheetObj.DoSearch("FNS_JOO_0034_01GS.do", param );
                 break;
              case IBSAVE:        //save
               if(validateForm(sheetObj,formObj,sAction))
                 break;
             case IBINSERT:      // insert
                 break;
         }
     }    
     /**
      * year month NAVI event 
      * @param void
      * @return void
      */
      function fnDocClick(){
          var objNm=ComGetEvent("name");
          var formObj=document.form;
          switch (objNm){
              case "btn_next":
                   if (formObj.acct_yrmon.value != "" ){
                       formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M",+1).substring(0,7);    
                   }
                   sheetObjects[0].RemoveAll();
                   doActionIBSheet(sheetObjects[0],formObj,IBSEARCH);                 
                   break;
              case "btn_back":
                   if (formObj.acct_yrmon.value != "" ){
                      formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M",-1).substring(0,7);    
                   }
                   sheetObjects[0].RemoveAll();
                   doActionIBSheet(sheetObjects[0],formObj,IBSEARCH);                 
                   break;                 
          }
      }       

     /**
      * handling process for input validation
      */
     function validateForm(sheetObj,formObj,sAction){
         with(formObj){
             switch(sAction){
                 case 'IBSEARCH':
                     if (!ComChkValid(formObj)) return false;
             }
         }
         return true;
     }

     function resizeSheet(){
    	    ComResizeSheet(sheetObjects[0]);
     }     