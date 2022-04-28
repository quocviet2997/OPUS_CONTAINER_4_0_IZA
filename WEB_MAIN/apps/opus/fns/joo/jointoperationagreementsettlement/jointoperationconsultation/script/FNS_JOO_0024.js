/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved
 *@FileName : fns_joo_0024.js
 *@FileTitle: CSR Approval - CSR Details POP UP Screen
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
 * @class fns_joo_0024 : business script for fns_joo_0024
 */
   
 // common global variable
 var beforetab=1;
 var sheetObjects=new Array();
 var sheetCnt=0;
 var prefix="";
 var apArFlg = "";
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
    	 var tmpCsrNo = document.form.csr_no.value; 
         apArFlg = tmpCsrNo.substr(0,2);
         
    	 for(i=0;i<sheetObjects.length;i++){
             ComConfigSheet (sheetObjects[i] );
             initSheet(sheetObjects[i],i+1);
             ComEndConfigSheet(sheetObjects[i]);
         }
         //doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
         
         sheet1_OnLoadFinish(sheetObjects[0]);
     }
     function sheet1_OnLoadFinish(sheetObj) {  
     	sheetObj.SetWaitImageVisible(0);
     	doActionIBSheet(sheetObj,document.form,IBSEARCH);
 		sheetObj.SetWaitImageVisible(1);
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
                
	                 var HeadTitle1="Seq.|DR/CR|ACCT #|VNDR #|CTR #|City|Eff.Date|Transaction Amount|Transaction Amount";
	                 if("18" == apArFlg){
	                	 HeadTitle1="Seq.|DR/CR|ACCT #|CUST #|CTR #|City|Eff.Date|Transaction Amount|Transaction Amount";
	                 }
	                 var HeadTitle2="Seq.|Description|Description|Description|Description|Description|Description|VVD|Key Number";
	                 var headCount=ComCountHeadTitle(HeadTitle1);
	                 SetConfig( { SearchMode:2, MergeSheet:1, Page:20, DataRowMerge:1 } );
		             var info    = { Sort:0, ColMove:0, HeaderCheck:0, ColResize:1 };
	                 var headers = [ { Text:HeadTitle1, Align:"Center"},
	                                 	{ Text:HeadTitle2, Align:"Center"} ];
	                 InitHeaders(headers, info);
	                 var cols = [[{Type:"Text",      Hidden:0, Width:40,    Align:"Center",  ColMerge:1,   SaveName:prefix+"seq_num",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
								{Type:"Text",      Hidden:0, Width:50,    Align:"Center",  ColMerge:0,   SaveName:prefix+"dr_cr_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
								{Type:"Text",      Hidden:0, Width:80,    Align:"Center",  ColMerge:0,   SaveName:prefix+"acct_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
								{Type:"Text",      Hidden:0, Width:80,    Align:"Center",  ColMerge:0,   SaveName:prefix+"vndr",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
								{Type:"Text",      Hidden:0, Width:70,    Align:"Center",  ColMerge:0,   SaveName:prefix+"ctr_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
								{Type:"Text",      Hidden:0, Width:70,    Align:"Center",  ColMerge:0,   SaveName:prefix+"loc_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
								{Type:"Text",      Hidden:0, Width:120,    Align:"Center",  ColMerge:0,   SaveName:prefix+"eff_dt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
								{Type:"Float",     Hidden:0, Width:120,    Align:"Right",   ColMerge:1,   SaveName:prefix+"csr_locl_amt", KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
								{Type:"Float",     Hidden:0, Width:120,    Align:"Right",   ColMerge:1,   SaveName:prefix+"csr_locl_amt", KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 }
	                              ],[     
	                            {Type:"Text",      Hidden:0, Width:40,    Align:"Center",  ColMerge:1,   SaveName:prefix+"seq_num",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
								{Type:"Text",      Hidden:0, Width:50,    Align:"Left",    ColMerge:1,   SaveName:prefix+"slp_desc",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
								{Type:"Text",      Hidden:0, Width:80,    Align:"Left",    ColMerge:1,   SaveName:prefix+"slp_desc",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
								{Type:"Text",      Hidden:0, Width:80,    Align:"Left",    ColMerge:1,   SaveName:prefix+"slp_desc",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
								{Type:"Text",      Hidden:0, Width:70,    Align:"Left",    ColMerge:1,   SaveName:prefix+"slp_desc",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
								{Type:"Text",      Hidden:0, Width:70,    Align:"Left",    ColMerge:1,   SaveName:prefix+"slp_desc",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
								{Type:"Text",      Hidden:0, Width:120,    Align:"Left",    ColMerge:1,   SaveName:prefix+"slp_desc",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
								{Type:"Text",      Hidden:0, Width:120,    Align:"Center",  ColMerge:0,   SaveName:prefix+"vvd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 },
								{Type:"Text",      Hidden:0, Width:120,    Align:"Right",   ColMerge:0,   SaveName:prefix+"key_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:false,UpdateEdit:0 } ]
	                 			 ]
	                 InitColumns(cols,2);
	                 SetEditable(1);
	                 cnt=0;
	            	 SetSheetHeight(253);
	            	 SetCountPosition(0);
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
      			//var prefix="sheet1_";
       			sheetObj.DoSearch("FNS_JOO_0024GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix) );
              }
               break;
         }
     }

     /**
      * handling process for input validation
      */
     function validateForm(sheetObj,formObj,sAction){
         with(formObj){ 
        	 if(formObj.csr_no.value.length < gDefaultCsrLength){/* 19 characters */
        		 return false;
        	 }
//             if (!isNumber(formObj.iPage)) {
//                 return false;
//             }
         }
         return true;
     }

