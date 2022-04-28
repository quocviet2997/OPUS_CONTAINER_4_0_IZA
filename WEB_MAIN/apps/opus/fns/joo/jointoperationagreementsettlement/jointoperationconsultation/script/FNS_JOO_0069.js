/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : fns_joo_0069.js
 *@FileTitle: CSR Approval - CSR Details POP UP screen
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
 * @class fns_joo_0069 : business script for fns_joo_0069
 */
//    function fns_joo_0069() {
//    	this.processButtonClick=tprocessButtonClick;
//    	this.setSheetObject=setSheetObject;
//    	this.loadPage=loadPage;
//    	this.initSheet=initSheet;
//    	this.initControl=initControl;
//    	this.doActionIBSheet=doActionIBSheet;
//    	this.setTabObject=setTabObject;
//    	this.validateForm=validateForm;
//    }
 // common global variable
 var tabObjects=new Array();
 var tabCnt=0 ;
 var beforetab=1;
 var sheetObjects=new Array();
 var sheetCnt=0;
 var prefix="sheet1_";
 // Event handler processing by button click event */
 document.onclick=processButtonClick;
 // Event handler processing by button name */
     function processButtonClick(){
          /***** setting sheet object *****/
          var sheetObject=sheetObjects[0];
          /*******************************************************/
          var formObject=document.form;
     	try {
     		var srcName=ComGetEvent("name");
             switch(srcName) {
             case "btn_Close":
            	 ComClosePopup(); 
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
            // alert('document.form.csr_no.value___>'+document.form.csr_no.value);
         }
         for(k=0;k<tabObjects.length;k++){
             initTab(tabObjects[k],k+1);
         }
		doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
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
	                 var HeadTitle1="Seq.|TC|ACCT #|VNDR #|CTR #|City|Eff.Date|Transaction Amount|Transaction Amount";
	                 var HeadTitle2="Seq.|Description|Description|Description|Description|Description|Description|VVD|Key Number";
	                   var headCount=ComCountHeadTitle(HeadTitle1);
	//                 (headCount, 0, 0, true);
	                 SetConfig( { SearchMode:2, MergeSheet:7, Page:20, DataRowMerge:1 } );
	                 var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	                 var headers = [ { Text:HeadTitle1, Align:"Center"},
	                 { Text:HeadTitle2, Align:"Center"} ];
	                 InitHeaders(headers, info);
	
	                 var cols = [ {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"seq_num",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
							      {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"dr_cr_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
							      {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"acct_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
							      {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"vndr",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
							      {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"ctr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
							      {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"loc_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
							      {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"eff_dt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
//							      {Type:"Float",     Hidden:0,  Width:0,    Align:"Right",   ColMerge:1,   SaveName:prefix+"csr_locl_amt", KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
//							      {Type:"Float",     Hidden:0,  Width:0,    Align:"Right",   ColMerge:1,   SaveName:prefix+"csr_locl_amt", KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
//							      {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"seq_num",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
//							      {Type:"Text",      Hidden:0,  Width:0,    Align:"Left",    ColMerge:1,   SaveName:prefix+"slp_desc",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
//							      {Type:"Text",      Hidden:0,  Width:0,    Align:"Left",    ColMerge:1,   SaveName:prefix+"slp_desc",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
//							      {Type:"Text",      Hidden:0,  Width:0,    Align:"Left",    ColMerge:1,   SaveName:prefix+"slp_desc",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
//							      {Type:"Text",      Hidden:0,  Width:0,    Align:"Left",    ColMerge:1,   SaveName:prefix+"slp_desc",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
//							      {Type:"Text",      Hidden:0,  Width:0,    Align:"Left",    ColMerge:1,   SaveName:prefix+"slp_desc",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
//							      {Type:"Text",      Hidden:0,  Width:0,    Align:"Left",    ColMerge:1,   SaveName:prefix+"slp_desc",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
							      {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"vvd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
							      {Type:"Text",      Hidden:0,  Width:0,    Align:"Right",   ColMerge:1,   SaveName:prefix+"key_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 } ];
	                  
	                 InitColumns(cols);
	                 SetEditable(0);
	                 SetSheetHeight(220);
	                 FitColWidth("7|5|11|11|11|11|11|11|");
	                // cnt=0;
                }
                 break;
         }
     }
   // handling sheet process
     function doActionIBSheet(sheetObj,formObj,sAction) {
         sheetObj.ShowDebugMsg(false);
         switch(sAction) {
            case IBSEARCH:      //retrieve
              if(validateForm(sheetObj,formObj,sAction)){
      			formObj.f_cmd.value=SEARCH;
      			//var prefix = "sheet1_";
      			//alert(FormQueryString(formObj));
      			sheetObj.DoSearch("FNS_JOO_0069GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix) );
              }
               break;
 			 case IBSAVE:        //save
               if(validateForm(sheetObj,formObj,sAction))
                   alert (" Save .. ");
                 break;
 			case IBINSERT:      // insert
                 break;
         }
     }
     /**
      * setting IBTab Object to array
      * adding process for list in case of needing batch processing with other items
      * defining list on the top of source
      */
     function setTabObject(tab_obj){
         tabObjects[tabCnt++]=tab_obj;
     }
     /**
      * initializing Tab
      * setting Tab items
      */
     function initTab(tabObj , tabNo) {
          switch(tabNo) {
              case 1:
                 with (tabObj) {
                 }
              break;
          }
     }
     /**
     * Event when clicking Tab
     * activating selected tab items
     */
     function tab1_OnChange(tabObj , nItem)
     {
         var objs=document.all.item("tabLayer");
     	objs[nItem].style.display="Inline";
     	objs[beforetab].style.display="none";
     	//--------------- very important!!! --------------------//
     	objs[beforetab].style.zIndex=objs[nItem].style.zIndex -1 ;
     	//------------------------------------------------------//
     	beforetab=nItem;
     }
     /**
      * handling process for input validation
      */
     function validateForm(sheetObj,formObj,sAction){
         with(formObj){  
        	 if(formObj.csr_no.value.length !=20){
        		 return false;
        	 }
        	 if(formObj.gubun[0].value.length == 0 || formObj.gubun[0].value.length == 0){
        		 return false;
        	 }
        	 if(formObj.fr_dt.value.length == 0){
        		 return false;
        	 }
        	 if(formObj.to_dt.value.length == 0){
        		 return false;
        	 }   	 
//             if (!isNumber(formObj.iPage)) {
//                 return false;
//             }
         }
         return true;
     }
