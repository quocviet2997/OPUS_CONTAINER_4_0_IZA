/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : FNS_JOO_0074.js
 *@FileTitle : Authority Office Creation
 *@author     : CLT
 *@version    : 1.0
 *@since      : 2014/06/17
 =========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
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
          var sheetObject=sheetObjects[0];
          /*******************************************************/
          var formObject=document.form;
          var doc=document.all;
         try {
             var srcName=ComGetEvent("name");
             if(ComGetBtnDisable(srcName)) return false;
             switch(srcName) {
                case "btn_delete":
                     sheetObject.RowDelete( sheetObject.GetSelectRow(), false);
                 break;  
                 case "btn_copy":
                     sheetObjects[0].DataCopy();
                 break;   
                 case "btn_Retrieve":
                     doActionIBSheet(sheetObjects[0],document.form, IBSEARCH);
                     break;
                 case "btn_Save":
                     doActionIBSheet(sheetObjects[0],document.form, IBSAVE);
                     break;
                 case "btn_DownExcel":
                     var paramObj=new Object();
                     paramObj.cols=10;
                     var url=ComJooGetPgmTitle(sheetObjects[0], paramObj);  
                      sheetObjects[0].Down2Excel( {DownCols: makeHiddenSkipCol(sheetObjects[0]), SheetDesign:1,Merge:1 });
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
       * registering IBCombo Object as list
       * param : combo_obj
       * adding process for list in case of needing batch processing with other items
       * defining list on the top of source
       */ 
      function setComboObject(combo_obj) {  
          comboObjects[comboCnt++]=combo_obj;  
      }
      /**
       * setting Combo basic info
       * @param comboObj 
       * @param comboIndex Number
       */
      function initCombo(comboObj, comboNo ) {
          var formObject=document.form;
          switch(comboObj.options.id) {  
              case "jo_crr_cd":  
                  with (comboObj) { 
                      SetMultiSelect(0);
                      SetUseAutoComplete(1);
                      SetColAlign(0, "left");
                      //SetColWidth(0, "60");
                      ValidChar(2,1);    // Uppercase
                      SetDropHeight(160);
                      SetMaxLength(3);
                   }  
                   break; 
               case "trd_cd":  
                   with (comboObj) { 
                       SetMultiSelect(0);
                       SetUseAutoComplete(1);
                       SetColAlign(0, "left");
                       //SetColWidth(0, "60");
                       ValidChar(2,1);    // Uppercase
                       SetDropHeight(160);
                       SetMaxLength(3);
                    }  
                    break;   
              case "rlane_cd": 
                  with (comboObj) {
                       SetMultiSelect(0);
                       SetUseAutoComplete(1);
                       SetColAlign(0, "left");
                       //SetColWidth(0, "80");
                       ValidChar(2,1);    // Uppercase
                       SetDropHeight(200);                                             
                   }  
                   break;    
              case "auth_ofc_cd": 
                  with (comboObj) {
                       SetMultiSelect(0);
                       SetUseAutoComplete(1);
                       SetColAlign(0, "left");
                       //SetColWidth(0, "80");
                       ValidChar(2,1);    // Uppercase
                       SetDropHeight(200);                                             
                   }  
                   break;   
           } 
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
         ComBtnDisable("btn_delete");
         ComBtnDisable("btn_copy");
         // initializing IBMultiCombo
         for(var k=0; k<comboObjects.length; k++){
             initCombo(comboObjects[k], k + 1);
         }
         sheet1_OnLoadFinish(sheetObjects[0]);
     }
     
 function sheet1_OnLoadFinish(sheetObj) {
          var formObj=document.form; 
          doActionIBSheet(sheetObjects[0],document.form, IBCLEAR);
 }
     /**
      * setting sheet initial values and header
      * param : sheetObj, sheetNo
      * adding case as numbers of counting sheets
      */
     function initSheet(sheetObj,sheetNo) {
         var cnt=0;
         switch(sheetObj.id) {
             case "sheet1":      //t1sheet1 init
            	    with(sheetObj){
            	       var HeadTitle1="|Carrier\nCode|Trade|Lane|Service\nProvider|Customer\nCode|Service Provider/\nCustomer Name|Authority Office|Authority Code|Delete";
            	       var headCount=ComCountHeadTitle(HeadTitle1);
            	       SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );

            	       var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
            	       var headers = [ { Text:HeadTitle1, Align:"Center"} ];
            	       InitHeaders(headers, info);

            	       var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
            	              {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:"jo_crr_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
            	              {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"trd_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
            	              {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"rlane_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
            	              {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"vndr_seq",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
            	              {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"crm_row_id",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
            	              {Type:"Text",      Hidden:0,  Width:560,  Align:"Left",    ColMerge:1,   SaveName:"vndr_lgl_eng_nm",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
            	              {Type:"PopupEdit", Hidden:0, Width:110,  Align:"Center",  ColMerge:1,   SaveName:"auth_ofc_cd",      KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:6 },
            	              {Type:"Combo", Hidden:0, Width:110,  Align:"Center",  ColMerge:1,   SaveName:"jo_crr_auth_cd",   KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
            	              {Type:"Combo", Hidden:0, Width:10,   Align:"Center",  ColMerge:1,   SaveName:"delt_flg",         KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:0 } ];
            	        
            	       InitColumns(cols);
            	       SetColProperty("jo_crr_auth_cd", {ComboText:"R|W", ComboCode:"R|W"} );
                  	   SetColProperty("delt_flg", {ComboText:"NO|YES", ComboCode:"N|Y"} );
                  	   SetColProperty(0 ,"auth_ofc_cd" , {AcceptKeys:"E" , InputCaseSensitive:1});
//                 	   SetSheetHeight(480);
                  	   resizeSheet();
            	       SetEditable(1);
        	       	}
                 break;
         }
     }
     // handling sheet process
     function doActionIBSheet(sheetObj,formObj,sAction, cRow) {
         sheetObj.ShowDebugMsg(false);
         switch(sAction) {
             case    IBCLEAR:      //initializing
                     formObj.f_cmd.value=SEARCH01;            
                     var param=FormQueryString(formObj)+"&auth_delcheck_yn=N"; //auth_delcheck_yn
                      var sXml=sheetObj.GetSearchData("FNS_JOO_0079GS.do", param);
                     var aXml=sXml.split("|$$|");
                     ComXml2ComboItem( aXml[0], jo_crr_cd   , "code","code" );
                     ComXml2ComboItem( aXml[1], auth_ofc_cd , "code","code" );
                     break;
             case    IBSEARCH_ASYNC02:      //Get List Trade Code By Carrier Code 
                     formObj.f_cmd.value=SEARCHLIST06;            
                     var code=jo_crr_cd.GetSelectText();
                     var param=FormQueryString(formObj)+"&super_cd1="+code+"&auth_delcheck_yn=N"; 
                      var sXml=sheetObj.GetSearchData("JOOCommonGS.do", param);
                     ComXml2ComboItem( sXml, trd_cd, "code","code" );
                     break;  
             case    IBSEARCH_ASYNC03:      //Get List Lane Code By Trade Code  
                     formObj.f_cmd.value=SEARCHLIST07;            
                     var code=trd_cd.GetSelectText();
                     var param=FormQueryString(formObj)+"&super_cd2="+code+"&auth_delcheck_yn=N"; 
                      var sXml=sheetObj.GetSearchData("JOOCommonGS.do", param);
                     ComXml2ComboItem( sXml, rlane_cd, "code","code" );
                     break; 
             case    IBSEARCH_ASYNC04:      //Check Office Code , KeyUp Event
                     formObj.f_cmd.value=SEARCH11;            
                     var code=sheetObjects[0].GetCellValue( cRow, "auth_ofc_cd");
                     var param=FormQueryString(formObj)+"&code="+code+"&auth_delcheck_yn=N";
                      var sXml=sheetObj.GetSearchData("JOOCommonGS.do", param);
                     if (ComGetEtcData(sXml,"TRANS_RESULT_KEY") == "S"){
                         if(ComGetTotalRows(sXml) == 0 ){
                             ComShowCodeMessage("JOO00117", "Authority Office");
                             sheetObjects[0].SetCellValue( cRow, "auth_ofc_cd","",0);
                             sheetObjects[0].SelectCell( cRow, "auth_ofc_cd");
                         } 
                     }
                     break; 
             case    IBSEARCH_ASYNC05:       
                     formObj.f_cmd.value=SEARCH01;            
                     var param=FormQueryString(formObj)+"&auth_delcheck_yn=N";
                      var sXml=sheetObj.GetSearchData("FNS_JOO_0079GS.do", param);
                     var aXml=sXml.split("|$$|");
                     ComXml2ComboItem( aXml[1], auth_ofc_cd , "code","code" );
                     break;
             case    IBSEARCH:      //retrieve
                     formObj.f_cmd.value=SEARCHLIST01;    
                     if(!validateForm(sheetObj,formObj,sAction)){return;}
                     var param=FormQueryString(formObj);
                     sheetObj.DoSearch("FNS_JOO_0079GS.do", param );
                     break;
             case    IBSAVE:        //save
                     if(!validateForm(sheetObj,formObj,sAction)){ return;}
                     sheetObj.SetWaitImageVisible(0);
                     ComOpenWait(true);
                     formObj.f_cmd.value=MULTI;         
                     var sParam=ComGetSaveString(sheetObj );
                     sParam        +=  "&"+FormQueryString(formObj);
                      var sXml=sheetObj.GetSaveData("FNS_JOO_0079GS.do" ,   sParam  );
                      sheetObj.LoadSaveData( sXml );
                      doActionIBSheet(sheetObjects[0],document.form, IBSEARCH);
                     ComOpenWait(false);
                     break;
             case    IBINSERT:      // insert
                     break;
         }
     }
     function sheet1_OnSearchEnd(sheetObj, ErrMsg){
         var doc=document.all;
         if(sheetObj.RowCount()> 0){
        	 ComBtnEnable("btn_copy");
         }
     }
     function sheet1_OnSelectCell(sheetObj, OldRow, OldCol, NewRow, NewCol){
         var doc=document.all;
         if(sheetObj.GetRowStatus(NewRow) == "I" || sheetObj.GetRowStatus(NewRow) == "U"){
              ComBtnEnable("btn_delete");
         }else{
        	 ComBtnDisable("btn_delete");
         }
     }
     function sheet1_OnChange(sheetObj, row, col) {
         var doc=document.all;
         var formObj=document.form;
         if(sheetObj.ColSaveName(col) == "auth_ofc_cd" ){
             if( sheetObj.GetEditText().length < 6 ){
                 //sheetObj.SetCellValue(row, "auth_ofc_cd",sheetObj.GetEditText(),0);
                 doActionIBSheet(sheetObjects[sheetObjects.length-1],formObj,IBSEARCH_ASYNC04, row);
             }
        }
     }
     function sheet1_OnKeyUp(sheetObj, Row, Col, KeyCode, Shift){
         var formObj=document.form;
         if( KeyCode == 229){return;}
         if(sheetObj.ColSaveName(Col) == "auth_ofc_cd" ){
              if( sheetObj.GetEditText().length == 5){
            	  var editText = sheetObj.GetEditText();
            	  sheetObj.SetCellValue(Row, "auth_ofc_cd",editText.toUpperCase(),0);
                  //sheetObj.SetCellValue(Row, "auth_ofc_cd",sheetObj.GetEditText(),0);
                  //doActionIBSheet(sheetObjects[sheetObjects.length-1],formObj,IBSEARCH_ASYNC04, Row);
              }
         }
     }
     /**
      * Sheet1 OnPopupClick event
      * @param sheetObj
      * @param Row
      * @param Col
      * @return
      */
     function sheet1_OnPopupClick(sheetObj, Row, Col)
     {
         with(sheetObj)
         {
             if( sheetObj.ColSaveName(Col) ==  'auth_ofc_cd' ){
                 var lane_cd=""; 
                 ComOpenPopup('/opuscntr/COM_ENS_071.do',  770, 480, "PopupCallback_OffCd", "1,0,0", true, false, Row, Col, 0);
             }
         }
     }  
     function PopupCallback_OffCd(aryPopupData,row, col, seetIdx){ 
          sheetObjects[seetIdx].SetCellValue(row, col,aryPopupData[0][3],0);
     }
     /**
      * handling process for input validation
      */
     function validateForm(sheetObj,formObj,sAction){
         with(formObj){
             switch(sAction) {
                 case IBSAVE:
                     var sParam=ComGetSaveString(sheetObj );
                     if( sParam == ""){
                         return false;
                     }
                     var Row=sheetObj.ColValueDup("jo_crr_cd|rlane_cd|auth_ofc_cd", false);
                     if( Row > -1){
                         ComShowCodeMessage("JOO00161");
                         sheetObj.SelectCell(Row, "auth_ofc_cd");
                         return false;
                     }
                     if( !ComShowCodeConfirm("JOO00046") ){
                         return false;
                     }
                     break;  
             } // end switch
         }
         return true;
     }
         /**
         * Carrier Code OnChange  <br>
         * <br><b>Example : </b>
         * <pre>
         *     Carrier Code(Object Name : trd_cd) OnChange 
         * </pre>
         * @param {parameter Type} combo object
         * @return void
         */
         function jo_crr_cd_OnChange(comboObj,value,text) {
             var formObj=document.form;
             trd_cd.RemoveAll();
             rlane_cd.RemoveAll();
             auth_ofc_cd_refresh(auth_ofc_cd);
             
             trd_cd_OnFocus(comboObjects[1]);
         }
         /**
         * <br><b>Example : </b>
         * <pre>
         *     Trade Code(Object Name : trd_cd) OnChange 
         * </pre>
         * @param {parameter Type} combo object
         * @return void
         */
        function  trd_cd_OnFocus(comboObj) {
            var formObj=document.form;
            if(jo_crr_cd.GetSelectCode()== ""){return;}
            if (comboObj.GetItemCount()== 0) {
               comboObj.SetEnable(0);
               doActionIBSheet(sheetObjects[sheetObjects.length-1],formObj,IBSEARCH_ASYNC02);
               comboObj.SetEnable(1);
            }
        }
       /**
        * <br><b>Example : </b>
        * <pre>
        *     Trade Code(Object Name : trd_cd) OnChange 
        * </pre>
         * @param {parameter Type} combo object
        * @return void
        */
        function trd_cd_OnChange(comboObj,value,text) {
            var formObj=document.form;
            rlane_cd.RemoveAll();
            fnBtnNew();  
            rlane_cd_OnFocus(comboObjects[2]);
        }   
        function  rlane_cd_OnFocus(comboObj) {
            var formObj=document.form;
            if(trd_cd.GetSelectCode()== ""){return;}
            if (comboObj.GetItemCount()== 0) {
                comboObj.SetEnable(0);
                doActionIBSheet(sheetObjects[sheetObjects.length-1],formObj,IBSEARCH_ASYNC03);
                comboObj.SetEnable(1);
            }
        }
        
        function   auth_ofc_cd_refresh(comboObj) {
            var formObj=document.form;
                comboObj.SetEnable(0);
                doActionIBSheet(sheetObjects[sheetObjects.length-1],formObj,IBSEARCH_ASYNC05);
                comboObj.SetEnable(1);
        }
        
        function fnBtnNew(){
        }

        function resizeSheet(){
            ComResizeSheet(sheetObjects[0]);
        }        