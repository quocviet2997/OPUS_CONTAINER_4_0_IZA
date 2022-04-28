/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FNS_JOO_0041.js
*@FileTitle : Slot Exchange Status by Lane & Partner->Space On Partner
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
 * @class FNS_JOO_0041 : business script for FNS_JOO_0041
 */

    function FNS_JOO_0041() {
    	this.processButtonClick		= tprocessButtonClick;
    	this.setSheetObject 		= setSheetObject;
    	this.loadPage 				= loadPage;
    	this.initSheet 				= initSheet;
    	this.initControl            = initControl;
    	this.doActionIBSheet 		= doActionIBSheet;
    	this.setTabObject 			= setTabObject;
    	this.validateForm 			= validateForm;
    }
    

    // common global variable

    var sheetObjects = new Array();
    var sheetCnt = 0;

    var comboObjects = new Array();
    var comboCnt = 0;

    // Event handler processing by button click event */
    document.onclick = processButtonClick;

    // Event handler processing by button name */
        function processButtonClick(){
             /***** setting sheet object *****/
             
             var sheetObject1 = sheetObjects[0];
             
             /*******************************************************/
             var formObject = document.form;

            try {
                var srcName = window.event.srcElement.getAttribute("name");

                switch(srcName) {

                    case "btn_Retrieve":
                        doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
                        break;
                    
                    case "btn_New":
                        doActionIBSheet(sheetObjects[0],document.form,IBRESET);
                        break;

                    case "btn_Down_Excel":
                        var paramObj = new Object();
                        paramObj.cols = 10;
                        var url = ComJooGetPgmTitle(sheetObjects[0], paramObj);                         
                        sheetObjects[0].Down2Excel(-1, false,false, true, "", url);            
                        break;
    
                } // end switch
            }catch(e) {
                if( e == "[object Error]") {
                    ComShowMessage(OBJECT_ERROR);
                } else {
                    ComShowMessage(e);
                }
            }
        }

        /**
         * registering IBSheet Object as list
         * adding process for list in case of needing batch processing with other items
         * defining list on the top of source
         */
        function setSheetObject(sheet_obj){

           sheetObjects[sheetCnt++] = sheet_obj;

        }
         /** 
          * registering IBCombo Object as list
          * param : combo_obj
          * adding process for list in case of needing batch processing with other items
          * defining list on the top of source
          */ 
         function setComboObject(combo_obj) {  
             comboObjects[comboCnt++] = combo_obj;  
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
         }
         /**
          * setting Combo basic info
          * @param comboObj 
          * @param comboIndex Number
          */
         function initCombo(comboObj, comboNo ) {
             var formObject = document.form

             switch(comboObj.id) {
                 case "trd_cd":  
                     with (comboObj) { 
                         MultiSelect = false; 
                         UseAutoComplete = true;    
                         SetColAlign("left");        
                         SetColWidth("60");
                         DropHeight = 160;
                         ValidChar(2,1);
                         MaxLength = 3;
                      }  
                      break; 
                      
                 case "jo_crr_cd":  
                     with (comboObj) { 
                         MultiSelect = false; 
                         UseAutoComplete = true;    
                         SetColAlign("left");        
                         SetColWidth("60");
                         DropHeight = 160;
                         ValidChar(2,1);
                         MaxLength = 3;
                      }  
                      break;  
                      
                 case "rlane_cd": 
                     with (comboObj) {
                          MultiSelect     = false;  
                          UseAutoComplete = true;    
                          SetColAlign("left");        
                          SetColWidth("60");
                          DropHeight = 200;
                          ValidChar(2,1);//only upper case, numbers
                          MaxLength = 5;
                      }  
                      break;  
                           
                 case "skd_dir_cd": 
                     with (comboObj) { 
                          UseAutoComplete = true;
                          SetColAlign("left");
                          SetColWidth("60");
                          DropHeight = 200;
                          ValidChar(2,1);     
                          MaxLength = 1;                            
                      }  
                      break;   
              } 
         }   
      /**
       * loading HTML Control event <br>
       * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
       * @param {ibsheet} sheetObj    IBSheet Object
       * @param {int}     sheetNo     sequence number in sheetObjects array
       **/
       function initControl() {
          var formObject = document.form;
          axon_event.addListenerForm  ('keydown', 'ComKeyEnter',  formObject);  
          axon_event.addListenerForm  ('keypress', 'fnObjKeyPress', formObject );
          
          axon_event.addListener      ('click',   'fnDocClick', "btn_cost_yr_back"       );         
          axon_event.addListener      ('click',   'fnDocClick', "btn_cost_yr_next"       );  

          axon_event.addListenerFormat('BeforeDeactivate' ,  'fnDeactivate',  formObject);      
          axon_event.addListenerFormat('BeforeActivate'   ,  'fnActivate'  ,  formObject);     
          
          axon_event.addListenerForm('focus'   ,  'fnFocus'  ,  formObject);       
       }
       
       function sheet1_OnLoadFinish(sheetObj) {
           doActionIBSheet(sheetObjects[0],document.form, IBSEARCH_ASYNC01);
       }
           
      /**
         * setting sheet initial values and header
         * param : sheetObj, sheetNo
         * adding case as numbers of counting sheets
         */
        function initSheet(sheetObj,sheetNo) {

            var cnt = 0;
            var formObj = document.form;
            switch(sheetNo) {
                case 1:      // sheet1 init
                    with (sheetObj) {
                        // setting height
                        style.height = 184;
                        // setting width
                        SheetWidth = mainTable.clientWidth;

                        //setting Host information[mandatory][HostIp, Port, PagePath]
                        if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);

                        //Merge Kind [optional, Default msNone]
                        MergeSheet = msHeaderOnly;

                       //Edit Kind [optional, Default false]
                        Editable = false;

                        //setting Row information[mandatory][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
                        InitRowInfo( 2, 1, 3, 100);

    

                        // setting function handling header
                        InitHeadMode(true, true, false, true, false,false)

                        var termTitle =  formObj.cost_yr.value+" - "+formObj.cost_wk_fr.value+"~"+formObj.cost_wk_to.value;
                        var cumulTitle = formObj.cost_yr.value+" - 01~"+formObj.cost_wk_to.value;
                        
                        var HeadTitle  = "Partner|"+termTitle+"|"+termTitle+"|"+termTitle+"| "+cumulTitle+"| "+cumulTitle;
                        var HeadTitle1 = "Partner|Slot|Price|Amount|Slot|Amount";
                         
                         //setting Column information[mandatory][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
                        InitColumnInfo(ComCountHeadTitle(HeadTitle), 0, 0, true);
                         
                        //header information[mandatory][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                        InitHeadRow(0, HeadTitle, true);
                        InitHeadRow(1, HeadTitle1, true);


                        //data property    [ROW, COL,  DATATYPE,        WIDTH, DATAALIGN,       COLMERGE,   SAVENAME,           KEYFIELD, CALCULOGIC, DATAFORMAT,   POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
                        InitDataProperty(0, cnt++ , dtData,             200,    daCenter,       true,       "jo_crr_cd",         false,      "",         dfNone,         0,          true,       true);
                        InitDataProperty(0, cnt++ , dtAutoSum,          100,    daRight,        false,      "cur_stl_bsa_qty",   false,      "",         dfInteger,         0,       true,       true);
                        InitDataProperty(0, cnt++ , dtAutoSum,          100,    daRight,        false,      "prc"         ,      false,      "|stl_locl_amt|/|cur_stl_bsa_qty|",     dfFloat,      2,          true,       true);
                        InitDataProperty(0, cnt++ , dtAutoSum,          200,    daRight,        false,      "stl_locl_amt",      false,      "",         dfFloat,      2,          true,       true);
                        InitDataProperty(0, cnt++ , dtAutoSum,          160,    daRight,        false,      "term_stl_bsa_qty",  false,      "",         dfInteger,         0,          true,       true);
                        InitDataProperty(0, cnt++ , dtAutoSum,          200,    daRight,        false,      "term_stl_locl_amt", false,      "",         dfInteger,      0,          true,       true);
 
                   }
                    break;
               
                case 2:      // sheet1 init
                    with (sheetObj) {
                        // setting height
                        style.height = 184;
                        // setting width
                        SheetWidth = mainTable.clientWidth;

                        //setting Host information[mandatory][HostIp, Port, PagePath]
                        if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);

                        //Merge Kind [optional, Default msNone]
                        MergeSheet = msHeaderOnly;

                       //Edit Kind [optional, Default false]
                        Editable = false;

                        //setting Row information[mandatory][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
                        InitRowInfo( 2, 1, 3, 100);



                        // setting function handling header
                        InitHeadMode(true, true, false, true, false,false)

                        var termTitle =  formObj.cost_yr.value+" - "+formObj.cost_wk_fr.value+"~"+formObj.cost_wk_to.value;
                        var cumulTitle = formObj.cost_yr.value+" - 01~"+formObj.cost_wk_to.value;
                        
                        var HeadTitle  = "Partner|"+termTitle+"|"+termTitle+"|"+termTitle+"| "+cumulTitle+"| "+cumulTitle;
                        var HeadTitle1 = "Partner|Slot|Price|Amount|Slot|Amount";
                         
                         //setting Column information[mandatory][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
                        InitColumnInfo(ComCountHeadTitle(HeadTitle), 0, 0, true);
                         
                        //header information[mandatory][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                        InitHeadRow(0, HeadTitle, true);
                        InitHeadRow(1, HeadTitle1, true);


                        //data property    [ROW, COL,  DATATYPE,        WIDTH, DATAALIGN,       COLMERGE,   SAVENAME,           KEYFIELD, CALCULOGIC, DATAFORMAT,   POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
    
                        InitDataProperty(0, cnt++ , dtData,             200,    daCenter,       true,       "jo_crr_cd",         false,      "",         dfNone,         0,          true,       true);
                        InitDataProperty(0, cnt++ , dtAutoSum,          100,    daRight,        false,      "cur_stl_bsa_qty",   false,      "",         dfInteger,         0,          true,       true);
                        InitDataProperty(0, cnt++ , dtAutoSum,          100,    daRight,        false,      "prc",               false,      "|stl_locl_amt|/|cur_stl_bsa_qty|",         dfFloat,      2,          true,       true);
                        InitDataProperty(0, cnt++ , dtAutoSum,          200,    daRight,        false,      "stl_locl_amt",      false,      "",         dfFloat,      2,          true,       true);
                        InitDataProperty(0, cnt++ , dtAutoSum,          160,    daRight,        false,      "term_stl_bsa_qty",  false,      "",         dfInteger,         0,          true,       true);
                        InitDataProperty(0, cnt++ , dtAutoSum,          200,    daRight,        false,      "term_stl_locl_amt", false,      "",         dfInteger,      0,          true,       true);

                   }
                    break;
               
            }
        }

      // handling sheet process
        function doActionIBSheet(sheetObj,formObj,sAction) {
            sheetObj.ShowDebugMsg = false;
            switch(sAction) {
                    
               case IBSEARCH_ASYNC01: //Get Carrier Code And Dir Code
                    formObj.f_cmd.value = SEARCH01;       
                    var param           = FormQueryString(formObj);  
                    var sXml            = sheetObj.GetSearchXml("FNS_JOO_0041GS.do", param);
                    var aXml            = sXml.split("|$$|");
                    ComXml2ComboItem( aXml[0], formObj.jo_crr_cd, "code","code" );
                    ComXml2ComboItem( aXml[1], formObj.skd_dir_cd, "code","code" );
                    break;
                    
               case IBSEARCH_ASYNC02: // Carrier Code OnChange, Get Trade Code
                    formObj.f_cmd.value = SEARCHLIST06;  
                    var super_cd1       = formObj.jo_crr_cd.Code;
                    var param           = FormQueryString(formObj)+"&super_cd1="+super_cd1;  
                    var sXml            = sheetObj.GetSearchXml("JOOCommonGS.do", param);
                    ComXml2ComboItem( sXml, formObj.trd_cd, "code","code" );
                    break;
                    
               case IBSEARCH_ASYNC03: //Trade Code  OnChange, Get Lane 
                    formObj.f_cmd.value = SEARCHLIST07;            
                    var super_cd2       = formObj.trd_cd.Code;
                    var param           = FormQueryString(formObj)+"&super_cd2="+super_cd2;  
                    var sXml            = sheetObj.GetSearchXml("JOOCommonGS.do", param);
                    ComXml2ComboItem( sXml, formObj.rlane_cd, "code","code" );
                    break;
                    
               case IBSEARCH:      //retrieve
                     if( !validateForm(sheetObj,formObj,sAction) ){return;}
                     formObj.f_cmd.value =  SEARCHLIST01;            
                     var param           =  FormQueryString(formObj);  
                     var sXml            =  sheetObj.GetSearchXml("FNS_JOO_0041GS.do", param);
                     var aXml            =  sXml.split("|$$|");
                     sheetObjects[0].LoadSearchXml(aXml[0]);
                     sheetObjects[1].LoadSearchXml(aXml[1]);                  
                     fnSetTitle(); 
                     break;
       
                case IBRESET:      
                     fnBtnNew();   
                     formObj.cost_yr.value = yyyy;
                     formObj.cost_wk_fr.value = "01";
                     formObj.cost_wk_to.value = "01";           
                     break;    
            }
        }
        /**
         * getting Trade Code in case of changing Carrier <br>
         * <br><b>Example : </b>
         * <pre>
         *     Carrier Code(Object Name : trd_cd) OnChange 
         * </pre>
         */
         function jo_crr_cd_OnChange(comboObj,value,text) {
             var formObj = document.form;
 
                 formObj.trd_cd.RemoveAll();
                 formObj.rlane_cd.RemoveAll();
                 formObj.skd_dir_cd.Code2="";
                 fnGridClear();
 
         }
         function trd_cd_OnFocus(comboObj) {
             var formObj = document.form;
             if(formObj.jo_crr_cd.Code == ""){return;}
             if (comboObj.GetCount()== 0) {
                 comboObj.Enable = false;
                 doActionIBSheet(sheetObjects[sheetObjects.length-1],formObj,IBSEARCH_ASYNC02);
                 comboObj.Enable = true;
             }

 
         }
         /**
          * getting Lane Code in case of changing Trade <br>
          * <br><b>Example : </b>
          * <pre>
          *     Trade Code(Object Name : trd_cd) OnChange 
          * </pre>
          */
          function trd_cd_OnChange(comboObj,value,text) {
              var formObj = document.form;
                  formObj.rlane_cd.RemoveAll();
                  formObj.skd_dir_cd.Code2="";
                  fnGridClear();
          }
          function rlane_cd_OnFocus(comboObj) {
              var formObj = document.form;
              if(formObj.trd_cd.Code == ""){return;}
              if (comboObj.GetCount()== 0) {
                  comboObj.Enable = false;
                  doActionIBSheet(sheetObjects[sheetObjects.length-1],formObj,IBSEARCH_ASYNC03);
                  comboObj.Enable = true;
              }

          }

         /**
          * Grid Clearing in case of changing Lane <br>
          * <br><b>Example : </b>
          * <pre>
          *     rlane_cd Code 
          * </pre>
          */
          function rlane_cd_OnChange(comboObj,value,text) {
              var formObj = document.form;
              formObj.skd_dir_cd.Code2="";
              fnGridClear();
          }
          /**
           * Grid Clearing in case of changing Dir Code <br>
           * <br><b>Example : </b>
           * <pre>
           *     dir  Code 
           * </pre>
           */
           function skd_dir_cd_OnChange(comboObj,value,text) {
               var formObj = document.form;
               fnGridClear();
               doActionIBSheet(sheetObjects[sheetObjects.length-1],formObj,IBSEARCH_ASYNC06); 
           }
         /**
          * year month NAVI event 
          * @param void
          * @return void
          */
          function fnDocClick(){
              var obj = ComGetEvent();
              var formObj = document.form;
    
              switch(ComGetEvent("name")){
    
                  case "btn_cost_yr_back":
                      if (formObj.cost_yr.value != "" ){
                          formObj.cost_yr.value = ComGetDateAdd(formObj.cost_yr.value+"0101","Y",-1).substring(0,4);    
                      }
                      fnBtnNew();              
                  
                      break;
                 case "btn_cost_yr_next":
                      if (formObj.cost_yr.value != "" ){
                         formObj.cost_yr.value = ComGetDateAdd(formObj.cost_yr.value+"0101","Y",+1).substring(0,4);    
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
             var formObj = document.form;
             fnGridClear();
             formObj.jo_crr_cd.Code2  = "";
             formObj.trd_cd.RemoveAll();
             formObj.rlane_cd.RemoveAll();
             formObj.skd_dir_cd.Code2 = "";
         }
         /**
          *  Form Clear
          * @param    void
          * @return   void
          */    
          function fnGridClear(){
              var formObj = document.form;
              
              for(var i=0;i<sheetObjects.length;i++){
                  if( sheetObjects[i].RowCount > 0) {
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
              var obj = ComGetEvent();
              var formObj = document.form;
              switch (obj.getAttribute("dataformat")){
                     case   'number':
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
            var obj = ComGetEvent();   
            var formObj = document.form;
             switch(event.srcElement.name){
                 case 'cost_yr':
                     ComAddSeparator(event.srcElement);
                     break;
                 case 'cost_wk_fr':
                     if( obj.value.length == 1){
                         obj.value ='0'+obj.value;
                     }             
                     break;
                  
                 case   'cost_wk_to':
                     if( obj.value.length == 1){
                         obj.value ='0'+obj.value;
                     }                
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
              var formObj = document.form;
              switch(event.srcElement.name){
                  case 'cost_yr':
                      ComClearSeparator(event.srcElement);
                      break;
              }
              event.srcElement.select();
          }        
          function fnFocus(){
              var formObj = document.form;
              switch(event.srcElement.name){
                  case 'cost_wk_fr':
                      formObj.cost_wk_fr.select();
                      break;
                  case 'cost_wk_to':
                      formObj.cost_wk_to.select();
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
                           if ( formObj.jo_crr_cd.Code == ""){
                               ComShowCodeMessage("JOO00115", "Carrier Code");
                               formObj.jo_crr_cd.focus();
                               return false;
                           }
                           if ( formObj.trd_cd.Code == ""){
                               ComShowCodeMessage("JOO00115", "Trade Code");
                               formObj.trd_cd.focus();
                               return false;
                           }
                           break;
                 }
             }
             return true;
         }
         function fnSetTitle(){
             var formObj = document.form;
             for(var i=0;i<2;i++){
                 var termTitle =  formObj.cost_yr.value+" - "+formObj.cost_wk_fr.value+"~"+formObj.cost_wk_to.value;
                 sheetObjects[i].SetCellText(0,"cur_stl_bsa_qty",termTitle);
                 sheetObjects[i].SetCellText(0,"prc",termTitle);
                 sheetObjects[i].SetCellText(0,"stl_locl_amt",termTitle);
             
                 var cumulTitle = " "+formObj.cost_yr.value+" - 01~"+formObj.cost_wk_to.value;
                 sheetObjects[i].SetCellText(0,"term_stl_bsa_qty",cumulTitle);
                 sheetObjects[i].SetCellText(0,"term_stl_locl_amt",cumulTitle);       
             }
         }
       