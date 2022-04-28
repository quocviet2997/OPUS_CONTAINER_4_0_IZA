/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FNS_JOO_0077.js
*@FileTitle : AR Data Inquiry
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
 * @class FNS_JOO_0077 : business script for FNS_JOO_0077
 */

    function FNS_JOO_0077() {
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
             var doc        = document.all;
       //     try {
                var srcName = window.event.srcElement.getAttribute("name");

                    switch(srcName) {

                        case "btn_Retrieve":
                            var objSheet;
 
                            if( formObject.re_divr_cd[0].checked == true){
                                if( formObject.sum_yn.checked == true){
                                    objSheet = sheetObjects[0];
                                }else{
                                    objSheet = sheetObjects[1];
                                }
                            }else if( formObject.re_divr_cd[1].checked == true){
                                if( formObject.sum_yn.checked == true){
                                    objSheet = sheetObjects[0];
                                }else{
                                    objSheet = sheetObjects[1];
                                }
                            }
                            doActionIBSheet( objSheet,document.form,IBSEARCH);
                            break;
                        
                        case "btn_New":
                            doActionIBSheet(sheetObjects[0],document.form,IBRESET);
                            break;
       
                        case "btn_DownExcel":
                            var paramObj = new Object();
                            paramObj.cols = 10;
                            var objSheet;
 
                            if( formObject.re_divr_cd[0].checked == true){
                                if( formObject.sum_yn.checked == true){
                                    objSheet = sheetObjects[0];
                                }else{
                                    objSheet = sheetObjects[1];
                                }
                            }else if( formObject.re_divr_cd[1].checked == true){
                                if( formObject.sum_yn.checked == true){
                                    objSheet = sheetObjects[0];
                                }else{
                                    objSheet = sheetObjects[1];
                                }
                            }
                            var url = ComJooGetPgmTitle(sheetObjects[0], paramObj);  
                            objSheet.SpeedDown2Excel(-1, false,false, "", url );           
                            break;
                            
                } // end switch
//            }catch(e) {
//                if( e == "[object Error]") {
//                    ComShowMessage(OBJECT_ERROR);
//                } else {
//                    ComShowMessage(e);
//                }
//            }
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
         function sheet1_OnLoadFinish(sheetObj) {
             doActionIBSheet(sheetObjects[0],document.form, IBCLEAR);
         }        
        
         /**
         * setting Combo basic info
         * @param comboObj 
         * @param comboIndex Number
         */
        function initCombo(comboObj, comboNo ) {
            var formObject = document.form
            
            switch(comboObj.id) {  
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
                case "cb_ofc_cd":  
                    with (comboObj) { 
                        MultiSelect = false; 
                        UseAutoComplete = true;    
                        SetColAlign("left");        
                        SetColWidth("60");
                        DropHeight = 160;
                        ValidChar(2,1);
                        MaxLength = 6;
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
            axon_event.addListenerForm  ('keydown' , 'ComKeyEnter',  formObject);  
            axon_event.addListenerForm  ('keypress', 'fnObjKeyPress', formObject );
            
            axon_event.addListener      ('click',   'fnDocClick', "btn_yrmon_fr_back"       );         
            axon_event.addListener      ('click',   'fnDocClick', "btn_yrmon_fr_next"       );  
            axon_event.addListener      ('click',   'fnDocClick', "btn_yrmon_to_back"  );  
            axon_event.addListener      ('click',   'fnDocClick', "btn_yrmon_to_next"  );
            axon_event.addListener      ('click',   'fnDocClick', "re_divr_cd"  );
            axon_event.addListener      ('click',   'fnDocClick', "sum_yn"  );
 
            
            axon_event.addListenerFormat('blur'   ,  'fnDeactivate',  formObject);  
            axon_event.addListenerFormat('focus'  ,  'fnActivate'  ,  formObject);           
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
                        style.height = 420;
                        // setting width
                        SheetWidth = mainTable.clientWidth;

                        //setting Host information[mandatory][HostIp, Port, PagePath]
                        if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);

                        //Merge Kind [optional, Default msNone]
                        MergeSheet = msHeaderOnly;

                       //Edit Kind [optional, Default false]
                        Editable = false;

                        //setting Row information[mandatory][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
                        InitRowInfo(1, 1, 3, 100);

                       var HeadTitle1 = "|Seq.|Acct Month|Carrier Code|Carrier Full Name|Amount";
                                                
                        var headCount = ComCountHeadTitle(HeadTitle1);

                        //setting Column information[mandatory][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
                        InitColumnInfo(headCount, 0, 0, true);

                        // setting function handling header
                        InitHeadMode(true, true, false, true, false,false);

                        //header information[mandatory][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                        InitHeadRow(0, HeadTitle1, true);
 
                        //data property    [ROW, COL,  DATATYPE,        WIDTH, DATAALIGN,       COLMERGE,   SAVENAME,   KEYFIELD, CALCULOGIC, DATAFORMAT,   POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
                        InitDataProperty(0, cnt++ , dtHiddenStatus, 30,     daCenter,       true,       "Status");
                        InitDataProperty(0, cnt++ , dtSeq,                  50,     daCenter,       true,       "Seq");
                        InitDataProperty(0, cnt++ , dtData,                 80,     daCenter,       true,       "acct_yrmon",    false,        "",                     dfDateYm,           0,          true,       true);
                        InitDataProperty(0, cnt++ , dtData,                 80,     daCenter,       true,       "jo_crr_cd",     false,        "",                     dfNone,             0,          true,       true);
                        InitDataProperty(0, cnt++ , dtData,                500,     daLeft  ,       true,       "jo_crr_cd_nm",  false,      "",                     dfNone,             0,          true,       true);
                        InitDataProperty(0, cnt++ , dtAutoSum,              85,     daRight,        true,       "csr_locl_amt",  false,      "",                     dfNullFloat,2,            true,       true);
 
                    }
                    break;       
              case 2:      // sheet2 init
                with (sheetObj) {
                    // setting height
                    style.height = 420;
                    // setting width
                    SheetWidth = mainTable.clientWidth;

                    //setting Host information[mandatory][HostIp, Port, PagePath]
                    if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);

                    //Merge Kind [optional, Default msNone]
                    MergeSheet = msHeaderOnly;

                   //Edit Kind [optional, Default false]
                    Editable = false;

                    //setting Row information[mandatory][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
                    InitRowInfo(1, 1, 3, 100);

                   var HeadTitle1 = "|Month|Lane|VVD|Rev.Month|Carrier Code|Amount|Curr|Item|B/L no.|Transaction No.";
                                            
                    var headCount = ComCountHeadTitle(HeadTitle1);

                    //setting Column information[mandatory][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
                    InitColumnInfo(headCount, 0, 0, true);

                    // setting function handling header
                    InitHeadMode(true, true, false, true, false,false);

                    //header information[mandatory][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                    InitHeadRow(0, HeadTitle1, true);

                    //data property    [ROW, COL,  DATATYPE,        WIDTH, DATAALIGN,       COLMERGE,   SAVENAME,   KEYFIELD, CALCULOGIC, DATAFORMAT,   POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
                    InitDataProperty(0, cnt++ , dtHiddenStatus, 30,     daCenter,       true,       "Status");
                    InitDataProperty(0, cnt++ , dtData,                 70,     daCenter,       true,       "acct_yrmon",    false,        "",                     dfDateYm,           0,          true,       true);
                    InitDataProperty(0, cnt++ , dtData,                 70,     daCenter,       true,       "rlane_cd",      false,        "",                     dfNone,             0,          true,       true);
                    InitDataProperty(0, cnt++ , dtData,                 80,     daCenter,       true,       "vvd"     ,      false,        "",                     dfNone,             0,          true,       true);                    
                    InitDataProperty(0, cnt++ , dtData,                 80,     daCenter,       true,       "rev_yrmon",     false,        "",                     dfDateYm,             0,          true,       true);                    
                    
                    InitDataProperty(0, cnt++ , dtData,                 80,     daCenter,       true,       "jo_crr_cd",     false,        "",                     dfNone,             0,          true,       true);
                    InitDataProperty(0, cnt++ , dtAutoSum,              120,     daRight,        true,       "csr_locl_amt",  false,        "",                dfNullFloat,2,            true,       true);

                    InitDataProperty(0, cnt++ , dtData,                 85,     daCenter,        true,      "locl_curr_cd",  false,       "",                     dfNone,0,            true,       true);                    
                    InitDataProperty(0, cnt++ , dtData,                 70,     daCenter,        true,      "jo_stl_itm_cd",  false,      "",                     dfNone,0,            true,       true);
                    InitDataProperty(0, cnt++ , dtData,                 100,     daCenter,       true,      "jo_bil_no"    ,  false,      "",                     dfNone,0,            true,       true);
                    InitDataProperty(0, cnt++ , dtData,                 120,     daCenter,       true,      "tran_no"      ,  false,      "",                     dfNone,0,            true,       true);
                }
                break;      
            }
        }

      // handling sheet process
        function doActionIBSheet(sheetObj,formObj,sAction) {
            sheetObj.ShowDebugMsg = false;
            var doc = document.all;
                    switch(sAction) {
                        case    IBCLEAR:      //jo_crr_cd Combo List 
                                formObj.f_cmd.value = SEARCH01;            
                                var param =  FormQueryString(formObj);  
                                var sXml = sheetObj.GetSearchXml("FNS_JOO_0077GS.do", param);
 
                                var aXml   = sXml.split("|$$|");
                                ComXml2ComboItem( aXml[0], formObj.jo_crr_cd, "code","code" );
                                formObj.jo_crr_cd.InsertItem(0, "All", "All");
                                formObj.jo_crr_cd.Index = 0;
                                
                                ComXml2ComboItem( aXml[1], formObj.cb_ofc_cd, "code","code" );
                                formObj.cb_ofc_cd.InsertItem(0, "All", "All");
                                
                                formObj.cb_ofc_cd.Code2 = strOfc_cd;
                                formObj.sum_yn.checked = true;
                                break;                              
                                
                        case    IBSEARCH:      //retrieve                         
                                if( !validateForm(sheetObj,formObj,sAction) ){return;}
                                formObj.f_cmd.value = SEARCHLIST01;            
                                var param =  FormQueryString(formObj);  
 
                                
                                sheetObj.WaitImageVisible=false;
                                ComOpenWait(true);
                                var sXml = sheetObj.GetSearchXml("FNS_JOO_0077GS.do", param);
                                sheetObj.LoadSearchXml(sXml);
                                ComOpenWait(false);
                                break;
                                
                        case    IBRESET:   
   
                                formObj.re_divr_cd[0].checked = true;
                                formObj.jo_crr_cd.Code2       = '';
                                formObj.sum_yn.checked        = true;
                                formObj.sum_yn.fireEvent("onclick");
                                sheetObjects[0].SetCellValue(0, "acct_yrmon", "Acct Month");
                                fnBtnNew();   
                                formObj.yrmon_fr.value = yyyyMM;
                                formObj.yrmon_to.value = yyyyMM;                       
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
             var doc = document.all;
 
             switch(ComGetEvent("name")){

                 case "btn_yrmon_fr_back":
                     if (formObj.yrmon_fr.value != "" ){
                         formObj.yrmon_fr.value = ComGetDateAdd(formObj.yrmon_fr.value+"-01","M",-1).substring(0,7);    
                     }

                     fnBtnNew();              
                 
                     break;
                case "btn_yrmon_fr_next":
                     if (formObj.yrmon_fr.value != "" ){
                        formObj.yrmon_fr.value = ComGetDateAdd(formObj.yrmon_fr.value+"-01","M",+1).substring(0,7);    
                     }
                     fnBtnNew();                      
              
                     break;
                case "btn_yrmon_to_back":
                    if (formObj.yrmon_to.value != "" ){
                        formObj.yrmon_to.value = ComGetDateAdd(formObj.yrmon_to.value+"-01","M",-1).substring(0,7);    
                    }
                    fnBtnNew();                
           
                    break;
               case "btn_yrmon_to_next":
                    if (formObj.yrmon_to.value != "" ){
                       formObj.yrmon_to.value = ComGetDateAdd(formObj.yrmon_to.value+"-01","M",+1).substring(0,7);    
                    }
                    fnBtnNew();                       
              
                    break; 
               case "re_divr_cd":
                    
                   if( formObj.re_divr_cd[0].checked == true){
                       sheetObjects[0].CellValue(0, "acct_yrmon", "Acct Month");
 
                   }
                   if( formObj.re_divr_cd[1].checked == true){
                       sheetObjects[0].CellValue(0, "acct_yrmon", "Rev Month");
                  
                       var objFire = eval('doc.btn_yrmon_fr_back');
                       fnSameFdateTdate( objFire  );
                   }  
                   fnBtnNew();
                   break;
               case "sum_yn": 
                   if( formObj.re_divr_cd[0].checked == true){
                       if( formObj.sum_yn.checked == true){
                           doc.sheet_acct_summary.style.display = "";
                           doc.sheet_acct_detail.style.display  = "none";
                       }else{
                           doc.sheet_acct_summary.style.display = "none";
                           doc.sheet_acct_detail.style.display  = "";
                       }
                   }else if( formObj.re_divr_cd[1].checked == true){
                       if( formObj.sum_yn.checked == true){
                           doc.sheet_acct_summary.style.display = "";
                           doc.sheet_acct_detail.style.display  = "none";
                       }else{
                           doc.sheet_acct_summary.style.display = "none";
                           doc.sheet_acct_detail.style.display  = "";
                       } 
                   }                   
                   fnBtnNew();
                   break;
             }
             fnSameFdateTdate(obj);
         }
        /**
         * handling fdate and tdate
         */
        function fnSameFdateTdate(obj){ 

            var obj = ComGetEvent();
            var formObj = document.form;
            var fireObjName = "";
            var targObjName = "";
            
            if( formObj.re_divr_cd[1].checked == false){
                return;    
            }
  
            switch(ComGetEvent("name")){
                   case "btn_yrmon_fr_back":
                        fireObjName="yrmon_fr";
                        break;
                   case "btn_yrmon_fr_next":
                        fireObjName="yrmon_fr";
                        break;
                   case "btn_yrmon_to_back":
                        fireObjName="yrmon_to";
                        break;
                   case "btn_yrmon_to_next":
                        fireObjName="yrmon_to";
                        break;
                         
                   case "yrmon_fr":
                        fireObjName="yrmon_fr";
                        break;
                       
                   case "yrmon_to":
                        fireObjName="yrmon_to";
                        break;                
            }
            if( fireObjName != ""){
                if( fireObjName == "yrmon_fr"){
                    targObjName = "yrmon_to";
                }else  if( fireObjName == "yrmon_to"){
                    targObjName = "yrmon_fr";
                }
                var objFir   = eval('formObj.'+fireObjName);
                var objTar   = eval('formObj.'+targObjName);
 
                objTar.value = objFir.value;
            }
        }
        /**
        * NEW button
        * @param    void
        * @return   void
        */    
        function fnBtnNew(){
            var formObj = document.form;
        
            if( sheetObjects[0].RowCount() > 0) {
                sheetObjects[0].RemoveAll();
            }
            if( sheetObjects[1].RowCount() > 0) {
                sheetObjects[1].RemoveAll();
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
             switch(ComGetEvent("name")){
                    case   'yrmon_fr':
                           ComKeyOnlyNumber( obj );
                           break;
                            
                    case   'yrmon_to':
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
            switch(event.srcElement.name){
                case 'yrmon_fr':
                    ComAddSeparator(event.srcElement);
                    break;
                case 'yrmon_to':
                    ComAddSeparator(event.srcElement);
                    break;        
            }
            fnSameFdateTdate(event.srcElement);
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
             switch(event.srcElement.name){
                 case 'yrmon_fr':
                     ComClearSeparator(event.srcElement);
                     break;
                 case 'yrmon_to':
                     ComClearSeparator(event.srcElement);
                     break;

             }
             fnSameFdateTdate(event.srcElement);
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
                           
                           if( formObj.re_divr_cd[1].checked == true ){
                               if( yrmon_fr.value != yrmon_to.value  ){
                                   yrmon_fr.value  = yrmon_to.value; 
                               }
                           }
                           break;
                }
            }

            return true;
        }
       