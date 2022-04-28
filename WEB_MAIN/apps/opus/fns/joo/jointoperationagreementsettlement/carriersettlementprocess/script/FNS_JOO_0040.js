/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FNS_JOO_0040.js
*@FileTitle : Slot Exchange Status by Lane &amp; Partner->Space Lane
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
 * @class FNS_JOO_0040 : business script for FNS_JOO_0040
 */

    function FNS_JOO_0040() {
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
                     doActionIBSheet( sheetObjects[0], document.form, IBSEARCH);
                     break;
                 
                 case "btn_New":
                     doActionIBSheet( sheetObjects[0], document.form, IBRESET);
 
                     break;

                 case "btn_Down_Excel":
                     var paramObj = new Object();
                     var url = ComJooGetPgmTitle(sheetObjects[0], paramObj);  
                     sheetObjects[0].SpeedDown2Excel(-1, false,false, "", url );
                    // sheetObjects[0].Down2Excel({ HiddenColumn:1,Merge:1});
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
     function sheet1_OnLoadFinish(sheetObj) {
         doActionIBSheet(sheetObjects[0],document.form, IBSEARCH_ASYNC01);
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
        * loading HTML Control event <br>
        * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
        * @param {ibsheet} sheetObj    IBSheet Object
        * @param {int}     sheetNo     sequence number in sheetObjects array
        **/
       function initControl() {
           var formObject = document.form;
           axon_event.addListenerForm  ('keydown', 'ComKeyEnter',  formObject);  
           axon_event.addListenerForm  ('keypress', 'fnObjKeyPress', formObject );
           
           axon_event.addListenerForm  ('click',   'fnDocClick', formObject );
           axon_event.addListener      ('click',   'fnDocClick',    "btn_yr_from_back"   );         
           axon_event.addListener      ('click',   'fnDocClick',    "btn_yr_from_next"   );
           axon_event.addListener      ('click',   'fnDocClick',    "btn_yr_to_back"     );
           axon_event.addListener      ('click',   'fnDocClick',    "btn_yr_to_next"   );
      
           axon_event.addListener      ('click',   'fnDocClick',    "btn_wkmon_fr_back"   );
           axon_event.addListener      ('click',   'fnDocClick',    "btn_wkmon_fr_next"   );
           
           axon_event.addListener      ('click',   'fnDocClick',    "btn_wkmon_to_back"   );
           axon_event.addListener      ('click',   'fnDocClick',    "btn_wkmon_to_next"   );


           
           
           
           axon_event.addListenerFormat('BeforeDeactivate' ,  'fnDeactivate',  formObject);      
           axon_event.addListenerFormat('BeforeActivate'   ,  'fnActivate'  ,  formObject);     
           
           axon_event.addListenerForm('focus'   ,  'fnFocus'  ,  formObject);                  
       }   
        

   /**
      * setting sheet initial values and header
      * param : sheetObj, sheetNo
      * adding case as numbers of counting sheets
      */
     function initSheet(sheetObj,sheetNo) {

         var cnt = 0;

         switch(sheetNo) {
             case 1:      // sheet1 init
                 with (sheetObj) {
                     // setting height
                     style.height = 380;
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

                     var HeadTitle  = "|Year|Month|Week|Trade|Lane|Carrier|VVD|Release|Release|Release|Purchas|Purchas|Purchas";
                     var HeadTitle1 = "|Year|Month|Week|Trade|Lane|Carrier|VVD|Slot|Price|Amount|Slot|Price|Amount|Partner";


                     //setting Column information[mandatory][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
                     InitColumnInfo(ComCountHeadTitle(HeadTitle), 0, 0, true);           
                     
                     //header information[mandatory][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                     InitHeadRow(0, HeadTitle, true);
                     InitHeadRow(1, HeadTitle1, true);

 
                     //data property    [ROW, COL,  DATATYPE,        WIDTH, DATAALIGN,       COLMERGE,   SAVENAME,           KEYFIELD, CALCULOGIC, DATAFORMAT,   POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
                     InitDataProperty(0, cnt++ , dtHiddenStatus, 30,     daCenter,        true,       "Status");
                     InitDataProperty(0, cnt++ , dtData,         60,     daCenter,        true,       "cost_yr"          ,   false,      "",         dfNone,         0,          true,       true);
                     InitDataProperty(0, cnt++ , dtData,         60,     daCenter,        true,       "cost_mon"          ,   false,      "",         dfNone,         0,          true,       true);
                     InitDataProperty(0, cnt++ , dtData,         60,     daCenter,        true,       "cost_wk"          ,   false,      "",         dfNone,         0,          true,       true);
                     InitDataProperty(0, cnt++ , dtData,         60,     daCenter,        true,       "trd_cd"           ,   false,      "",         dfNone,         0,          true,       true);                     
                     InitDataProperty(0, cnt++ , dtData,         60,     daCenter,        true,       "rlane_cd"         ,   false,      "",         dfNone,         0,          true,       true);
                     InitDataProperty(0, cnt++ , dtData,         60,     daCenter,        true,       "jo_crr_cd"        ,   false,      "",         dfNone,         0,          true,       true);
                     InitDataProperty(0, cnt++ , dtData,         78,       daLeft,        true,       "vvd"              ,   false,      "",         dfNone,         0,          true,       true);
                     InitDataProperty(0, cnt++ , dtAutoSum,      100,     daRight,        true,       "r_stl_bsa_qty"    ,   false,      "",         dfInteger,      0,          true,       true);
                     InitDataProperty(0, cnt++ , dtData,         80,      daRight,        true,       "r_stl_bsa_slt_prc",   false,      "",         dfFloat,        2,          true,       true);
                     InitDataProperty(0, cnt++ , dtAutoSum,      120,     daRight,        true,       "r_stl_locl_amt"   ,   false,      "",         dfFloat,        2,          true,       true);
                     InitDataProperty(0, cnt++ , dtAutoSum,      100,     daRight,        true,       "e_stl_bsa_qty"    ,   false,      "",         dfInteger,      0,          true,       true);
                     InitDataProperty(0, cnt++ , dtData,         80,      daRight,        true,       "e_stl_bsa_slt_prc",   false,      "",         dfFloat,        2,          true,       true);
                     InitDataProperty(0, cnt++ , dtAutoSum,      120,     daRight,        true,       "e_stl_locl_amt"   ,   false,      "",         dfFloat,        2,          true,       true);

                }
                 break;
           
         }
     }
      // handling sheet process
      function doActionIBSheet(sheetObj,formObj,sAction) {
          sheetObj.ShowDebugMsg = false;
          switch(sAction) {

             case IBSEARCH_ASYNC01: //Get trd_cd
                  formObj.f_cmd.value = SEARCH01;       
                  var param = FormQueryString(formObj);  
                  var sXml  = sheetObj.GetSearchXml("FNS_JOO_0040GS.do", param);
                  var aXml  = sXml.split("|$$|");
                  ComXml2ComboItem( aXml[0], formObj.trd_cd, "code","code" );
                  ComXml2ComboItem( aXml[1], formObj.skd_dir_cd, "code","code" );
                  
                  formObj.wkmon_fr.value = gSmmF;
                  formObj.wkmon_to.value = gSmmT;
                  formObj.yr_from.value  = yyyy;
                  formObj.yr_to.value    = yyyy;
                  
                  
                  fnLblSetting();
                  break;

             case IBSEARCH_ASYNC02: //Get Lane By TradeCode
                  formObj.f_cmd.value = SEARCHLIST07;  
                  var super_cd2 = formObj.trd_cd.Code;
                  var param = FormQueryString(formObj)+"&super_cd2="+super_cd2;  
                  var sXml  = sheetObj.GetSearchXml("JOOCommonGS.do", param);
                  ComXml2ComboItem( sXml, formObj.rlane_cd, "code","code" );
                  break;
                  
                  
             case IBSEARCH_ASYNC03: //Get Carrier By Lane
                  formObj.f_cmd.value = SEARCHLIST13;            
                  var super_cd2 = formObj.rlane_cd.Code;
                  var param = FormQueryString(formObj)+"&super_cd2="+super_cd2;  
                  var sXml  = sheetObj.GetSearchXml("JOOCommonGS.do", param);
                  ComXml2ComboItem( sXml, formObj.jo_crr_cd, "code","code" );
                  break;
 
             case IBSEARCH:      //retrieve
                  if( !validateForm(sheetObj,formObj,sAction) ){return;}
                  formObj.f_cmd.value = SEARCHLIST01;            
                  var param =  FormQueryString(formObj);  
                  sheetObj.DoSearch("FNS_JOO_0040GS.do", param);

                  break;
 
                   
              case IBRESET:      
                   
                   formObj.wkmon_fr.value = gSmmF;
                   formObj.wkmon_to.value = gSmmT;
                   formObj.yr_from.value  = yyyy;
                   formObj.yr_to.value    = yyyy;
                   
                   formObj.week_month[0].checked = true;
                   fnLblSetting();
                   
                   fnBtnNew();   
                   break;     

          }
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
               /*Year from Navi   yr_from*/
               case "btn_yr_from_back":
                   if (formObj.yr_from.value != "" ){
                       formObj.yr_from.value = ComGetDateAdd(formObj.yr_from.value+"0101","Y",-1).substring(0,4);    
                   }
                   fnBtnNew();              
               
                   break;
              case "btn_yr_from_next":
                   if (formObj.yr_from.value != "" ){
                      formObj.yr_from.value = ComGetDateAdd(formObj.yr_from.value+"0101","Y",+1).substring(0,4);    
                   }
                   fnBtnNew();                      
                   break;
              /*Year to Navi   yr_to */
              case "btn_yr_to_back":
                  if (formObj.yr_to.value != "" ){
                      formObj.yr_to.value = ComGetDateAdd(formObj.yr_to.value+"0101","Y",-1).substring(0,4);    
                  }
                  fnBtnNew();              
              
                  break;
             case "btn_yr_to_next":
                  if (formObj.yr_to.value != "" ){
                     formObj.yr_to.value = ComGetDateAdd(formObj.yr_to.value+"0101","Y",+1).substring(0,4);    
                  }
                  fnBtnNew();                      
                  break;
                   
              /*Week Month Navi*  wkmon_fr --*/
              case "btn_wkmon_fr_back":
                  if (formObj.wkmon_fr.value != "" ){
                      
                      var  wkmon_fr = formObj.wkmon_fr.value;
                      if(wkmon_fr==""){wkmon_fr = "00";}
                      if(wkmon_fr=="00"){return;}
                      formObj.wkmon_fr.value = ComLpad(eval(wkmon_fr)-1,2, '0'); 
                      
                  }
                  fnBtnNew();              
              
                  break;
              case "btn_wkmon_fr_next": //wkmon_fr ++
                  if (formObj.wkmon_fr.value != "" ){
                      
                      var wkmon_fr = formObj.wkmon_fr.value;
                      if(wkmon_fr==""){wkmon_fr = "";}
                      if(wkmon_fr=="00"){return;}
                      formObj.wkmon_fr.value = ComLpad(eval(wkmon_fr)+1,2, '0'); 
                      
                  }
                  fnBtnNew();                      
                  break;
                  
                  /*Week Month Navi*  wkmon_to*/
              case "btn_wkmon_to_back":
                  if (formObj.wkmon_to.value != "" ){
                      var wkmon_to = formObj.wkmon_to.value;
                      if(wkmon_to==""){wkmon_to = "";}
                      if(wkmon_to=="00"){return;}
                      formObj.wkmon_to.value = ComLpad(eval(wkmon_to)-1,2, '0');
                  }
                  fnBtnNew();
                  break;
              case "btn_wkmon_to_next":
                  if (formObj.wkmon_to.value != "" ){
                      var wkmon_to = formObj.wkmon_to.value;
                      if(wkmon_to==""){wkmon_to = "";}
                      if(wkmon_to=="00"){return;}
                      formObj.wkmon_to.value = ComLpad(eval(wkmon_to)+1,2, '0');
                  }
                  fnBtnNew();                      
                  break;
                  
              case "week_month":
                   fnLblSetting();
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
          formObj.trd_cd.Code2="";
          formObj.rlane_cd.RemoveAll();
          formObj.jo_crr_cd.RemoveAll();
          formObj.skd_dir_cd.Code2="";

          formObj.vvd.value = "";
          if( sheetObjects[0].RowCount > 0) {
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
           var obj = ComGetEvent();
           var formObj = document.form;
           switch ( obj.name ){
               case "yr_from":
                   ComKeyOnlyNumber( obj );
                   break;
               case "yr_to":
                   ComKeyOnlyNumber( obj );
                    break;
               case "wkmon_fr":
                   ComKeyOnlyNumber( obj );
                    break;   
               case "wkmon_to":
                   ComKeyOnlyNumber( obj );
                    break; 
               case "vvd":
                   ComKeyOnlyAlphabet( 'uppernum' );
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
          switch ( obj.name ){
              case "yr_from":
                  ComAddSeparator(obj);
                  break;
              case "yr_to":
                  ComAddSeparator(obj);
                   break;
              case "wkmon_fr":
                   if( eval(obj.value.length) != eval( obj.getAttribute("maxlength") ) ){
                       obj.value = ComLpad( obj.value, 2, '0');
                   }
                   break;   
              case "wkmon_to":
                  if( eval(obj.value.length) != eval( obj.getAttribute("maxlength") ) ){
                      obj.value = ComLpad( obj.value, 2, '0');
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
            var obj = ComGetEvent();            
 
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

                        if ( formObj.trd_cd.Code == ""){
                            ComShowCodeMessage("JOO00115", "Trade Code");
                            formObj.trd_cd.focus();
                            return false;
                        }
//                        if ( formObj.rlane_cd.Code == ""){
//                            ComShowCodeMessage("JOO00115", "Lane Code");
//                            formObj.rlane_cd.focus();
//                            return false;
//                        }
                        break;
              }
          }

          return true;
      }
      function fnFocus(){
          var formObj = document.form;
          event.srcElement.select();
                        
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
                   
              case "rlane_cd": 
                  with (comboObj) {
                       MultiSelect     = false;  
                       UseAutoComplete = true;    
                       SetColAlign("left");        
                       SetColWidth("60");
                       DropHeight = 200;
                       ValidChar(2,1);//only upper case, numbers
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
        * getting Lane Code in case of changing Trade <br>
        * <br><b>Example : </b>
        * <pre>
        *     Trade Code(Object Name : trd_cd) OnChange 
        * </pre>
        */
        function trd_cd_OnChange(comboObj,value,text) {
            var formObj = document.form;
                fnGridClear();
                formObj.rlane_cd.RemoveAll();
                formObj.jo_crr_cd.RemoveAll();
                formObj.skd_dir_cd.Code2="";
        }
   
        function rlane_cd_OnFocus(comboObj ) {
            var formObj = document.form;
            if(formObj.trd_cd.Code == ""){return;}
            if (comboObj.GetCount()== 0) {
                comboObj.Enable = false;
                doActionIBSheet(sheetObjects[sheetObjects.length-1],formObj,IBSEARCH_ASYNC02);
                comboObj.Enable = true;
            }
        }
        
       /**
        * getting Carrier Code in case of changing Lane <br>
        * <br><b>Example : </b>
        * <pre>
        *     rlane_cd Code 
        * </pre>
        */
        function rlane_cd_OnChange(comboObj,value,text) {
            var formObj = document.form;
            fnGridClear();
            formObj.jo_crr_cd.RemoveAll();
            formObj.skd_dir_cd.Code2="";
        }
        function jo_crr_cd_OnFocus(comboObj ) {
            var formObj = document.form;
            if (comboObj.GetCount()== 0) {
                comboObj.Enable = false;
                doActionIBSheet(sheetObjects[sheetObjects.length-1],formObj,IBSEARCH_ASYNC03);
                comboObj.Enable = true;
            }
        }
        function jo_crr_cd_OnChange(comboObj,value,text) {
            var formObj = document.form;
            fnGridClear();
            formObj.skd_dir_cd.Code2="";
        }        
       /**
        *  Form Clear
        * @param    void
        * @return   void
        */    
        function fnGridClear(){
            var formObj = document.form;
            if( sheetObjects[0].RowCount > 0) {
                sheetObjects[0].RemoveAll();
            }
        }
        /**
         * 
         * <pre>
         *     setting Week/Month Lable
         * </pre>
         *
         * @param   void 
         * @return  void
         * @author jang kang cheol
         */
        function fnLblSetting(){
            var formObj = document.form;
            var doc     = document.all;
            if( formObj.week_month[0].checked == true){//Month
                doc.lbl_mon_week.innerHTML = "Month";
                sheetObjects[0].SetColHidden("cost_mon",false);        
                sheetObjects[0].SetColHidden("cost_wk",true);            
 
            }else if( formObj.week_month[1].checked == true){//Week
                doc.lbl_mon_week.innerHTML = "Week";
            sheetObjects[0].SetColHidden("cost_mon",true);      
            sheetObjects[0].SetColHidden("cost_wk",false); 
            }
        }

	