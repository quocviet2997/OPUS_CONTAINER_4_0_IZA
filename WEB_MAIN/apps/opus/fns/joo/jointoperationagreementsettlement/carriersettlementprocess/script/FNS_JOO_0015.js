/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FNS_JOO_0015.js
*@FileTitle : Monthly Clearance Inquiry
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
=========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class FNS_JOO_0015 : business script for FNS_JOO_0015
 */
 // common global variable
 var tabObjects=new Array();
 var tabCnt=0 ;
 var beforetab=1;
 var sheetObjects=new Array();
 var sheetCnt=0;
 var comboObjects=new Array();
 var comboCnt=0;
 var queryStr="";
 // Event handler processing by button click event */
 document.onclick=processButtonClick;
 // Event handler processing by button name */
 function processButtonClick(){
      /***** setting sheet object *****/
      var sheetObject1=sheetObjects[0];
      /*******************************************************/
      var formObject=document.form;
     //try {
         var srcName=ComGetEvent("name");
         switch(srcName) {
             case "btn_retrieve":
                 doActionIBSheet(sheetObjects[0],formObject,IBSEARCH); 
                 break;
             case "btn_new":
                 doActionIBSheet(sheetObjects[0],formObject,IBRESET);  
                 break;
             case "btn_Down_Excel":
            	 if(sheetObject1.RowCount() < 1){//no data
            		 ComShowCodeMessage("COM132501");
    	       		}else{       
		            	 var paramObj=new Object();
		                 paramObj.cols="15";
		                 var title="";
		                 paramObj.align="left";
		                 paramObj.title="Account Month : "+formObject.acct_yrmon.value+"Carrier : "+jo_crr_cd.GetSelectCode()+" Combined No : "+stl_cmb_seq.GetSelectCode();
		                  sheetObjects[0].Down2Excel({ HiddenColumn:1,Merge:1});
		            }
                 break;
             case "btn_print":
                 rdOpen( document.form);
                 break;
         } // end switch
//     }catch(e) {
//         if( e == "[object Error]") {
//             ComShowMessage(OBJECT_ERROR);
//         } else {
//             ComShowMessage(e);
//         }
//     }
 }
 /**
  * loading HTML Control event <br>
  * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
  * @param {ibsheet} sheetObj    IBSheet Object
  * @param {int}     sheetNo     sequence number in sheetObjects array
  **/
 function initControl() {
     var formObject=document.form;
     //axon_event.addListener    ('keydown', 'ComKeyEnter', 'form');
     axon_event.addListener    ('click',   'fnDocClick', "btn_back"  );         
     axon_event.addListener    ('click',   'fnDocClick', "btn_next"  );  
    // axon_event.addListenerForm    ('keypress',   'fnObjKeyPress', formObject );     
     axon_event.addListenerForm    ('click' ,     'fnObjClick'  , formObject );            
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
   * param : combo_obj
   * adding process for list in case of needing batch processing with other items
   * defining list on the top of source
   */ 
  function setComboObject(combo_obj) {  
      comboObjects[comboCnt++]=combo_obj;  
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
     resizeSheet();     
     doActionIBSheet(sheetObjects[sheetObjects.length - 1 ],document.form, SEARCH01);
 }
  /**
   * setting Combo basic info
   * @param comboObj 
   * @param comboIndex Number
   */
  function initCombo(comboObj, comboNo ) {
      var formObject=document.form
      switch(comboObj.options.id) {  
          case "jo_crr_cd": 
             with (comboObj) { 
                  SetMultiSelect(0);
                  SetUseAutoComplete(1);
				  SetColAlign(0, "left");
				  SetColWidth(0, "60");
                  SetDropHeight(160);
                  SetMaxLength(3);
   				  ValidChar(2,1);//영문대문자만 입력가능                  
              }  
              break; 
          case "stl_cmb_seq": 
              with (comboObj) { 
                   SetMultiSelect(0);
                   SetUseAutoComplete(1);
                   SetColAlign(0, "left");
                   SetColWidth(0, "60");
                   SetDropHeight(160);
    			   ValidChar(2,1);//영문대문자만 입력가능                   
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
             case 1: //t1sheet1 init
                 with(sheetObj){
		              var HeadTitle="STS|Item|Lane|Cur.|Revenue|Revenue|Revenue|Revenue|Expense|Expense|Expense|Expense|Remark";
		              var HeadTitle1="STS|Item|Lane|Cur.|VVD|BSA|Price|Amount|VVD|BSA|Price|Amount|Remark";
		              var headCount=ComCountHeadTitle(HeadTitle);
		//              (headCount, 0, 0, true);
		
		              SetConfig( { SearchMode:2, MergeSheet:1, Page:20, DataRowMerge:0 } );
		
		              var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		              var headers = [ { Text:HeadTitle, Align:"Center"},
		                        { Text:HeadTitle1, Align:"Center"} ];
		              InitHeaders(headers, info);
		
		              var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
		                  {Type:"Text",      Hidden:0,  Width:160,  Align:"Left",    ColMerge:1,   SaveName:"jo_stl_itm_cd_nm",  KeyField:0,   CalcLogic:"",   Format:"" },
		                  {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:"rlane_cd",          KeyField:0,   CalcLogic:"",   Format:"" },
		                  {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"locl_curr_cd",      KeyField:0,   CalcLogic:"",   Format:"" },
		                  {Type:"Text",      Hidden:0,  Width:95,   Align:"Center",    ColMerge:0,   SaveName:"r_vvd",             KeyField:0,   CalcLogic:"",   Format:"" },
		                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"r_bsa_qty",         KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2  },
		                  {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"r_bsa_slt_prc",     KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 },
		                  {Type:"AutoSum",   Hidden:0, Width:100,  Align:"Right",   ColMerge:0,   SaveName:"r_stl_locl_amt",    KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 },
		                  {Type:"Text",      Hidden:0,  Width:95,   Align:"Center",    ColMerge:0,   SaveName:"e_vvd",             KeyField:0,   CalcLogic:"",   Format:"" },
		                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"e_bsa_qty",         KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2  },
		                  {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"e_bsa_slt_prc",     KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 },
		                  {Type:"AutoSum",   Hidden:0, Width:100,   Align:"Right",   ColMerge:0,   SaveName:"e_stl_locl_amt",    KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 },
		                  {Type:"Text",      Hidden:0,  Width:150,   Align:"Left",    ColMerge:0,   SaveName:"stl_rmk",             KeyField:0,   CalcLogic:"",   Format:"" }];
		               
		              InitColumns(cols);
		
		              SetEditable(0);
		              SetSheetHeight(480);
                    }


             break;
         }
     }
      // handling sheet process
      function doActionIBSheet(sheetObj,formObj,sAction) {
          sheetObj.ShowDebugMsg(false);
          switch(sAction) {
               case SEARCH01:      //initializing  
                    formObj.f_cmd.value=SEARCH01;            
                    var param=FormQueryString(formObj);
                     var sXml=sheetObj.GetSearchData("FNS_JOO_0015GS.do", param);
                    ComXml2ComboItem( sXml, jo_crr_cd, "code","code" );//Carrier Code
                    break;      
               case IBSEARCH_ASYNC01:      //stl_cmb_seq Combo List
                   formObj.f_cmd.value=SEARCH02;            
                   var super_cd1=jo_crr_cd.GetSelectText();
                   var param=FormQueryString(formObj);
                    var sXml=sheetObj.GetSearchData("FNS_JOO_0015GS.do", param);
                   ComXml2ComboItem( sXml, stl_cmb_seq, "stl_cmb_seq","stl_cmb_seq" );
                   break;
               case IBSEARCH:      //retrieve
                    if( !validateForm(sheetObj,formObj,sAction) ){return;}
                    formObj.f_cmd.value=SEARCHLIST01;            
                    var param=FormQueryString(formObj);  
                     sheetObj.DoSearch("FNS_JOO_0015GS.do", param );
                    sheetObj.ShowSubSum([{StdCol:"jo_stl_itm_cd_nm", SumCols:"r_stl_locl_amt|e_stl_locl_amt"}]);
                    formObj.bal_jo_crr_cd.value=jo_crr_cd.GetSelectCode();
// UI개선사항(201407)
// sheet1_OnSearchEnd에서 수행                    
//                    fnSetBalance(sheetObj);
                    break;
               case IBRESET:      //NEW button  
                   fnBtnNew();
                   break;                  
          }
      }
      /**
       * handling process for input validation
       */
      function validateForm(sheetObj,formObj,sAction){
    	  switch ( sAction ) {
          case IBSEARCH:
              if (formObj.acct_yrmon.value.length == 0){
                  ComShowCodeMessage('JOO00033');
                  return false;
              }
              if (jo_crr_cd.index == -1){
                  ComShowCodeMessage('JOO00008');
                  return false;
              }
              if (stl_cmb_seq.GetSelectCode()== "" ){
                  ComShowCodeMessage('JOO00092');
                  return false;
              }
              break;
      }
          return true;
      }
     /************************************** Object EVENT FUNCTION ********************************************************/
      /**
       * 
       * <pre>
       *      clearing Sheet2 in case of not changing Lane Code Grid
       * </pre>
       *
       * @param   
       * @return
       * @author jang kang cheol
       */
      function sheet1_OnChange(comboObj, Row, Col,Value) {
           var formObj=document.form;
           doActionIBSheet(sheetObjects[1],formObj,SEARCHLIST02);
           if( sheetObjects[0].RowCount("U") == 0 ){
               if( sheetObjects[1].RowCount()> 0) {
                   sheetObjects[1].RemoveAll();
               } 
           }
     }    
      /**
      * Carrier Code combe OnChange event
      * @param comboObj
      * @param value
      * @param text
      * @return
      */
     function jo_crr_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
         var formObj=document.form;
         if( jo_crr_cd.GetSelectCode()!= ""){
        	 stl_cmb_seq.RemoveAll();
        	 fnGridClear();            
         }
         stl_cmb_seq_OnFocus(comboObjects[1],"","");
     }
     function stl_cmb_seq_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
         var formObj=document.form;
         if( stl_cmb_seq.GetSelectCode()!= ""){
            fnGridClear();            
         }
     }
      function stl_cmb_seq_OnFocus(comboObj,value,text) {
          var formObj=document.form;
          if (comboObj.GetItemCount()== 0) {
              comboObj.SetEnable(0);
              doActionIBSheet(sheetObjects[sheetObjects.length-1],formObj,IBSEARCH_ASYNC01); 
              comboObj.SetEnable(1);
          } 
      }
     /**************************************USER FUNCTION *****************************************************/
     /**
      * NEW button
      * @param    void
      * @return   void
      */    
      function fnBtnNew(){
          var formObj=document.form;
         jo_crr_cd.SetSelectText("",false);
          stl_cmb_seq.RemoveAll();
          formObj.acct_yrmon.value=yyyyMM;
          fnGridClear();       
      }
      /**
       * 
       * <pre>
       *    Grid Clear
       * </pre>
       *
       * @param   void
       * @return  void
       * @author jang kang cheol
       */
      function fnGridClear(){
           var formObj=document.form;
          if( sheetObjects[0].RowCount()> 0) {
              sheetObjects[0].RemoveAll();
          }
          if( sheetObjects[1].RowCount()> 0) {
              sheetObjects[1].RemoveAll();
          }  
          formObj.balance.value="";
          formObj.bal_jo_crr_cd.value="";
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
               case "btn_next":
                    if (formObj.acct_yrmon.value != "" ){
                        formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M",+1).substring(0,7);    
                        jo_crr_cd.SetSelectCode("",false);
                        stl_cmb_seq.RemoveAll();
                    }
                    fnGridClear();                
                    if(formObj.jo_crr_cd.GetSelectCode()== "" ){
                        //formObj.jo_crr_cd.focus();
                    }
                    break;
               case "btn_back":
                    if (formObj.acct_yrmon.value != "" ){
                    	formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M",-1).substring(0,7);    
                    }
                    jo_crr_cd.SetSelectCode("",false);
                    stl_cmb_seq.RemoveAll();
                    fnGridClear();                   
                    if(jo_crr_cd.GetSelectCode()== "" ){
                       // formObj.jo_crr_cd.focus();
                    }
                    break;                 
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
           var obj=ComGetEvent();
           var formObj=document.form;
           switch(ComGetEvent("name")){
                  case 'acct_yrmon':
                      ComKeyOnlyNumber( obj );
                      jo_crr_cd.SetSelectCode("",false);
                      stl_cmb_seq.RemoveAll();
                      break;
           }
       }
       /**
        * <pre>
        *    form Element Click Event
        *    
        * </pre>
        * @return
        */
       function fnObjClick(){
           var obj=ComGetEvent();
           var formObj=document.form;
           switch(ComGetEvent("name")){
                  case 're_divr_cd':
                      fnGridClear();
                      break;
           }
       }
        /**
         * 
         * <pre>
         *    Balane by carrier
         * </pre>
         *
         * @param   sheetObj
         * @return void
         * @author jang kang cheol
         */
       function fnSetBalance(sheetObj){
            var formObj=document.form;
            formObj.balance.value="";
            var e_stl_locl_amt=0; 
            var r_stl_locl_amt=0; 
            var bal_amt=0; 
            var balCarrier="OWN";
            if( sheetObj.RowCount()> 0){
            	e_stl_locl_amt=sheetObj.GetCellValue(sheetObj.LastRow(), "e_stl_locl_amt");
            	r_stl_locl_amt=sheetObj.GetCellValue(sheetObj.LastRow(), "r_stl_locl_amt");
                bal_amt=eval(r_stl_locl_amt) - eval(e_stl_locl_amt);
                if ( eval(r_stl_locl_amt) < eval(e_stl_locl_amt) ){
                    balCarrier=jo_crr_cd.GetSelectCode();
                }
                bal_amt=Math.abs( bal_amt );
            }
            
            formObj.balance.value=bal_amt.toFixed(2);
            formObj.bal_jo_crr_cd.value=balCarrier;
            ComAddSeparator(formObj.balance,"float");
            if( formObj.balance.value.indexOf(".") == -1 ){
                formObj.balance.value += ".00";  
            }
       }
       
       //UI 개선 사항(201407)
       function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
    	   fnSetBalance(sheetObj);
    	   sheetObj.SetSumText(0,"jo_stl_itm_cd_nm","TOTAL");
    	   
     	   	//Row 강제머지할 셀의 Row Index
     	    //Col 강제머지할 셀의 Column Index 
     	    //Rows 강제머지할 셀의 Row 개수
     	   	//Cols 강제머지할 셀의 Col 개수
     	   	//ObjId.SetMergeCell(Row, Col, Rows, Cols)

     	   	var str = "";
	   		var startrow = sheetObj.HeaderRows();
	   		var lr = sheetObj.LastRow();
	   		
	   		for(var i=sheetObj.HeaderRows();i<lr;i++){
	   			str = sheetObj.GetCellText(i,"jo_stl_itm_cd_nm");   // ITM 항목 읽기
	   			if(str.indexOf("Subtotal:")>-1){
	   				sheetObj.SetMergeCell(i,2,1,5); // OWN 5칸 머지
	   				
	   				sheetObj.SetMergeCell(i,8,1,3); // Partner 3칸 머지
	   			}
	   		}
	   		  	  
	   		sheetObj.FitColWidth();
       }
       
       
         function rdOpen( formObj){
             var formObj=document.form;
             queryStr="";
             if( !setQueryStr() ){
                 return;
             } 
             var rdParam='/rp '+queryStr;
             //var strPath="rpt/report/FNS_JOO_0071.mrd"; 
             var strPath="apps/opus/fns/joo/jointoperationagreementsettlement/jointoperationconsultation/report/FNS_JOO_0071.mrd"; 
             formObj.com_mrdPath.value=strPath;
             formObj.com_mrdArguments.value=rdParam;
             ComOpenRDPopup();
         }
         function setQueryStr(){
             var formObj=document.form;         
             queryStr += " ["+formObj.acct_yrmon.value+"]";
             queryStr += " ["+ jo_crr_cd.GetSelectCode()+"]";
             if( stl_cmb_seq.GetSelectCode()== ""){
                 ComShowCodeMessage("JOO00092");
                 return false;         
             }else{
                 queryStr += " ["+stl_cmb_seq.GetSelectCode()+"]";//5  COMB
             }
             var bal_jo_crr_cd=formObj.bal_jo_crr_cd.value;
             queryStr += " ["+bal_jo_crr_cd+"]";           
             return true;
         }

         function resizeSheet(){
    	    for (i=0; i<sheetObjects.length; i++){
    	        ComResizeSheet(sheetObjects[i], 60);
    	    }
    	 }
