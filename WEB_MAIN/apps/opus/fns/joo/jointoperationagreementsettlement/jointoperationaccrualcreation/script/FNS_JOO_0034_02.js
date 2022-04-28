/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : fns_joo_0034_02.js
 *@FileTitle: Estimate Code Check - VVD
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
 * @class fns_joo_0034_02 : business script for fns_joo_0034_02
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
                     //if( sheetObject.RowCount()> 0 ){
                         sheetObject.RemoveAll();
                   //  }
                     var tmpYm = ComGetDateAdd(ComGetNowInfo("ym","-")+"-02","M", -1);
                     formObj.exe_yrmon.value=JooGetDateFormat(tmpYm,"ym");
                     
                     formObj.yrmon_type[0].checked=true;
                     if( formObj.yrmon_type[0].checked == true ){//curr
                         sheetObjects[0].SetColHidden("jo_crr_cd",1);
                     }
                     break;
                 case "btn_downExcel":
                	 if(sheetObject.RowCount() < 1){//no data
                  		 ComShowCodeMessage("COM132501");
       	       		}else{
       	       			sheetObject.Down2Excel({ HiddenColumn:1,Merge:1});
       	       		}	    
                      
                     break;
                 case "btns_next":
                     if (formObj.exe_yrmon.value != "" ){
                         formObj.exe_yrmon.value=ComGetDateAdd(formObj.exe_yrmon.value+"-01","M",+1).substring(0,7);    
                     }
                     doActionIBSheet(sheetObjects[0],formObj,IBSEARCH);                 
                     break;
                case "btns_back":
                     if (formObj.exe_yrmon.value != "" ){
                        formObj.exe_yrmon.value=ComGetDateAdd(formObj.exe_yrmon.value+"-01","M",-1).substring(0,7);    
                     }
                     doActionIBSheet(sheetObjects[0],formObj,IBSEARCH);                 
                     break;
                case "yrmon_type":
                    if( formObj.yrmon_type[0].checked == true ){//curr
                        sheetObjects[0].SetColHidden("jo_crr_cd",1);
                    }
                    if( formObj.yrmon_type[1].checked == true ){//prev
                        sheetObjects[0].SetColHidden("jo_crr_cd",0);
                    }
                    if( sheetObjects[0].RowCount()> 0 ){
                        sheetObjects[0].RemoveAll();
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
     function initControl() {
         var formObject=document.form;           
         
         var tmpYm = ComGetDateAdd(ComGetNowInfo("ym","-")+"-02","M", -1);
         formObject.exe_yrmon.value=JooGetDateFormat(tmpYm,"ym");
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
//                 (4, 0, 0, true);
	                 var HeadTitle="Seq.|Lane|VVD|Carrier";
	                 SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
	                 var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	                 var headers = [ { Text:HeadTitle, Align:"Center"} ];
	                 InitHeaders(headers, info);
	
	                 var cols = [ {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"SEQ" },
			                     {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:"rlane_cd",   KeyField:0,   CalcLogic:"",   Format:"" },
			                     {Type:"Text",      Hidden:0,  Width:200,  Align:"Center",  ColMerge:0,   SaveName:"vvdcode",    KeyField:0,   CalcLogic:"",   Format:"" },
			                     {Type:"Text",      Hidden:1, Width:200,  Align:"Center",  ColMerge:0,   SaveName:"jo_crr_cd",  KeyField:0,   CalcLogic:"",   Format:"" } ];
	                  
	                 InitColumns(cols);
	                 SetEditable(0);
//	                 SetSheetHeight(510);
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
                         sheetObj.DoSearch("FNS_JOO_0034_02GS.do", param );
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
          var obj=ComGetEvent();
          var formObj=document.form;
          switch(ComGetEvent("name")){
              case "btns_next":
                   if (formObj.exe_yrmon.value != "" ){
                       formObj.exe_yrmon.value=ComGetDateAdd(formObj.exe_yrmon.value+"-01","M",+1).substring(0,7);    
                   }
                   doActionIBSheet(sheetObjects[0],formObj,IBSEARCH);                 
                   break;
              case "btns_back":
                   if (formObj.exe_yrmon.value != "" ){
                      formObj.exe_yrmon.value=ComGetDateAdd(formObj.exe_yrmon.value+"-01","M",-1).substring(0,7);    
                   }
                   doActionIBSheet(sheetObjects[0],formObj,IBSEARCH);                 
                   break;
              case "yrmon_type":
                  if( formObj.yrmon_type[0].checked == true ){//curr
                      sheetObjects[0].SetColHidden("jo_crr_cd",1);
                  }
                  if( formObj.yrmon_type[1].checked == true ){//prev
                      sheetObjects[0].SetColHidden("jo_crr_cd",0);
                  }
                  if( sheetObjects[0].RowCount()> 0 ){
                      sheetObjects[0].RemoveAll();
                  }
                  break;    
          }
      } 
     /**
      * handling process for input validation
      */
     function validateForm(sheetObj,formObj,sAction){
         with(formObj){
             switch(sAction){
                 case  IBSEARCH :
                     //checking validation
                     if(!ComChkValid(formObj, true, false, false)) 
                         return false;
                     break;
             }
         }
         return true;
     }

     function resizeSheet(){
    	    ComResizeSheet(sheetObjects[0]);
   	}
     