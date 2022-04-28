/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FNS_JOO_0076.js
*@FileTitle : Inquiry Disabled VVD
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
 * @class FNS_JOO_0076 : business script for FNS_JOO_0076
 */

    function FNS_JOO_0076() {
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

        //    try {
                var srcName = window.event.srcElement.getAttribute("name");

                    switch(srcName) {

                        case "btn_Retrieve":
                            doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
                            break;
                        
                        case "btn_New":
                            doActionIBSheet(sheetObjects[0],document.form,IBRESET);
                            break;
       
                        case "btn_DownExcel":
                            var paramObj = new Object();
                            paramObj.cols = 10;
                            var url = ComJooGetPgmTitle(sheetObjects[0], paramObj);  
                            sheetObjects[0].SpeedDown2Excel(-1, false,false, "", url );           
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
            
            axon_event.addListener      ('click',   'fnDocClick', "btn_eai_evnt_dt_back"       );         
            axon_event.addListener      ('click',   'fnDocClick', "btn_eai_evnt_dt_next"       );  
 
    
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

                       var HeadTitle1 = "|Seq.|Lane|VSL|VOY|Dir.|Fin. Dir.|SlipY/N|Cancel DT.";
                                                
                        var headCount = ComCountHeadTitle(HeadTitle1);

                        //setting Column information[mandatory][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
                        InitColumnInfo(headCount, 0, 0, true);

                        // setting function handling header
                        InitHeadMode(true, true, false, true, false,false);

                        //header information[mandatory][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                        InitHeadRow(0, HeadTitle1, true);
                        
                        //data property    [ROW, COL,  DATATYPE,        WIDTH, DATAALIGN,       COLMERGE,   SAVENAME,   KEYFIELD, CALCULOGIC, DATAFORMAT,   POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
                        InitDataProperty(0, cnt++ , dtHiddenStatus,         30,     daCenter,       true,       "Status");
                        InitDataProperty(0, cnt++ , dtSeq,                  30,     daCenter,       true,       "Seq");
                        InitDataProperty(0, cnt++ , dtData,                 70,     daCenter,       true,       "rlane_cd"    ,    false,      "",                     dfNone,             0,          true,       true);
                        InitDataProperty(0, cnt++ , dtData,                 70,     daCenter,       true,       "vsl_cd"      ,    false,      "",                     dfNone,             0,          true,       true);
                        InitDataProperty(0, cnt++ , dtData,                 90,     daCenter,       true,       "skd_voy_no"  ,    false,      "",                     dfNone,             0,          true,       true);
                        InitDataProperty(0, cnt++ , dtData,                 50,     daCenter,       true,       "skd_dir_cd"  ,    false,      "",                     dfNone,             0,          true,       true);
                        InitDataProperty(0, cnt++ , dtData,                 50,     daCenter,       true,       "rlane_dir_cd",    false,      "",                     dfNone,             0,          true,       true);
                        InitDataProperty(0, cnt++ , dtData,                 85,     daCenter,       true,       "slip_yn"   ,    false,      "",                     dfDateYm,             0,          true,       true);
                        InitDataProperty(0, cnt++ , dtData,                 85,     daCenter,       true,       "eai_evnt_dt" ,    false,      "",                     dfNone,             0,          true,       true);
 
                    }
                    break;           
            }
        }

      // handling sheet process
        function doActionIBSheet(sheetObj,formObj,sAction) {
            sheetObj.ShowDebugMsg = false;
                    switch(sAction) {
                        case    IBSEARCH:      //retrieve 
                                if( !validateForm(sheetObj,formObj,sAction) ){return;}
                                formObj.f_cmd.value = SEARCHLIST01;            
                                var param =  FormQueryString(formObj);  
                                sheetObj.DoSearch("FNS_JOO_0076GS.do", param);
                                fnSearchEnd(sheetObj);
                                break;
                        case    IBRESET:   
                                fnBtnNew();   
                                formObj.eai_evnt_dt.value = yyyyMM;
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
                 case "btn_eai_evnt_dt_back":
                     if (formObj.eai_evnt_dt.value != "" ){
                         formObj.eai_evnt_dt.value = ComGetDateAdd(formObj.eai_evnt_dt.value+"-01","M",-1).substring(0,7);    
                     }
                     fnBtnNew();              
                     break;
                case "btn_eai_evnt_dt_next":
                     if (formObj.eai_evnt_dt.value != "" ){
                         formObj.eai_evnt_dt.value = ComGetDateAdd(formObj.eai_evnt_dt.value+"-01","M",+1).substring(0,7);    
                     }
                     fnBtnNew();                      
                     break;
             }
         }
        function fnSearchEnd(sheetObj){
 
            for(var i=sheetObj.HeaderRows();i <= sheetObj.LastRow();i++){
                if( sheetObj.CellValue(i,"slip_yn")  == "Y"){
                    sheetObj.SetCellFont("FontBold", i, "slip_yn",1); // true
                    //sheetObj.CellFontColor(i, "slip_yn") = sheetObj.RgbColor(255, 0, 0);
                    sheetObj.SetCellBackColor(i, "slip_yn", sheetObj.RgbColor(255, 0, 0));
 
                }
            }
        }
        /**
        * NEW button event
        * @param    void
        * @return   void
        */    
        function fnBtnNew(){
            var formObj = document.form;
        
            if( sheetObjects[0].RowCount() > 0) {
                sheetObjects[0].RemoveAll();
            }
        }   
         /**
          * <pre>
          *    KeyPress Event of form Element
          *    
          * </pre>
          * @return
          */
         function fnObjKeyPress(){
             var obj = ComGetEvent();
             var formObj = document.form;
             switch(ComGetEvent("name")){
                    case 'eai_evnt_dt':
                          ComKeyOnlyNumber( obj );
                          break;              
             }
         }
        /**
         * <pre>
         *     input Validation
         *     focus out
         * </pre>
         * 
         * @return void
         */ 
        function fnDeactivate(){ 
            switch(event.srcElement.name){
                case 'eai_evnt_dt':
                    ComAddSeparator(event.srcElement);
                    break;
    
            }
        }
         /**
          * <pre>
          *     input Validation
          *     on focus
          * </pre>
          * 
          * @return void
          */ 
         function fnActivate(){
             switch(event.srcElement.name){
                 case 'eai_evnt_dt':
                     ComClearSeparator(event.srcElement);
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
                }
            }
            return true;
        }
	